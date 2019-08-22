/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.constant_count;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.id_index.do_id_index_empty_p;
import static com.cyc.cycjava.cycl.id_index.do_id_index_id_and_object_validP;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_state;
import static com.cyc.cycjava.cycl.id_index.do_id_index_state_object;
import static com.cyc.cycjava.cycl.id_index.id_index_count;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_id_threshold;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_at;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.alpha_char_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.char_downcase;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.char_upcase;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.digit_char_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.lower_case_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.upper_case_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.symbolp;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
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
 * module:      KIF
 * source file: /cyc/top/cycl/kif.lisp
 * created:     2019/07/03 17:38:27
 */
public final class kif extends SubLTranslatedFile implements V12 {
    public static final class $kif_term_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.kif.$kif_term_native.this.$print_string;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.kif.$kif_term_native.this.$print_string = value;
        }

        public SubLObject $print_string = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.kif.$kif_term_native.class, KIF_TERM, KIF_TERM_P, $list_alt64, $list_alt65, new String[]{ "$print_string" }, $list_alt66, $list_alt67, PRINT_KIF_TERM);
    }

    public static final SubLFile me = new kif();

 public static final String myName = "com.cyc.cycjava.cycl.kif";


    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $within_cycl_to_kif$ = makeSymbol("*WITHIN-CYCL-TO-KIF*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $additional_kif_definitions$ = makeSymbol("*ADDITIONAL-KIF-DEFINITIONS*");

    // defparameter
    /**
     * The default CycL to KIF error-handling method to use. Should be one of :
     * (:abort :ignore :warn :cerror :error)
     */
    @LispMethod(comment = "The default CycL to KIF error-handling method to use. Should be one of :\r\n(:abort :ignore :warn :cerror :error)\ndefparameter\nThe default CycL to KIF error-handling method to use. Should be one of :\n(:abort :ignore :warn :cerror :error)")
    public static final SubLSymbol $cycl_to_kif_error_method$ = makeSymbol("*CYCL-TO-KIF-ERROR-METHOD*");

    // defparameter
    // The default print method used when outputting KIF terms.
    /**
     * The default print method used when outputting KIF terms.
     */
    @LispMethod(comment = "The default print method used when outputting KIF terms.\ndefparameter")
    private static final SubLSymbol $default_kif_term_print_method$ = makeSymbol("*DEFAULT-KIF-TERM-PRINT-METHOD*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $kb_to_kif_file_preamble$ = makeSymbol("*KB-TO-KIF-FILE-PREAMBLE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $mt_to_kif_file_preamble$ = makeSymbol("*MT-TO-KIF-FILE-PREAMBLE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_kif_term$ = makeSymbol("*DTP-KIF-TERM*");

    // defparameter
    // A table mapping CycL terms to KIF translation methods
    /**
     * A table mapping CycL terms to KIF translation methods
     */
    @LispMethod(comment = "A table mapping CycL terms to KIF translation methods\ndefparameter")
    private static final SubLSymbol $cycl_to_kif_method_table$ = makeSymbol("*CYCL-TO-KIF-METHOD-TABLE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol CCATCH_IGNORE = makeSymbol("CCATCH-IGNORE");

    private static final SubLSymbol $ABORT_CYCL_TO_KIF = makeKeyword("ABORT-CYCL-TO-KIF");

    static private final SubLList $list3 = list(list(makeSymbol("*ADDITIONAL-KIF-DEFINITIONS*"), NIL), list(makeSymbol("*WITHIN-CYCL-TO-KIF*"), T));

    private static final SubLSymbol WRITE_KIF_TERM_MIXED_CASE = makeSymbol("WRITE-KIF-TERM-MIXED-CASE");

    static private final SubLList $list6 = list(list(makeSymbol("STREAM"), makeSymbol("FILENAME"), makeSymbol("KIF-TERM-PRINT-METHOD")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym7$PRINT_METHOD = makeUninternedSymbol("PRINT-METHOD");

    static private final SubLList $list9 = list(makeKeyword("OUTPUT"));

    private static final SubLSymbol WRITE_KB_CONTENT_COPYRIGHT_NOTICE = makeSymbol("WRITE-KB-CONTENT-COPYRIGHT-NOTICE");

    public static final SubLSymbol $kif_term_print_method$ = makeSymbol("*KIF-TERM-PRINT-METHOD*");

    static private final SubLList $list13 = list(makeSymbol("*KIF-TERM-PRINT-METHOD*"));

    static private final SubLList $list14 = list(list(makeSymbol("*CYCL-TO-KIF-ERROR-METHOD*"), makeKeyword("ABORT")));

    static private final SubLString $str17$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $$$Converting_KB_to_KIF = makeString("Converting KB to KIF");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    static private final SubLString $str25$do_broad_mt_index = makeString("do-broad-mt-index");

    static private final SubLList $list27 = list(makeSymbol("&KEY"), makeSymbol("DIRECTION"), makeSymbol("MONOTONICITY"), makeSymbol("MICROTHEORY"), makeSymbol("CREATOR"), makeSymbol("CREATION-DATE"), makeSymbol("KIF"));

    static private final SubLList $list28 = list(makeKeyword("DIRECTION"), makeKeyword("MONOTONICITY"), makeKeyword("MICROTHEORY"), makeKeyword("CREATOR"), makeKeyword("CREATION-DATE"), makeKeyword("KIF"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    static private final SubLString $str36$_____ = makeString("~%~%(");

    static private final SubLString $str37$_DIRECTION__S = makeString(":DIRECTION ~S");

    static private final SubLString $str38$__MONOTONICITY__S = makeString(" :MONOTONICITY ~S");

    static private final SubLString $str39$__CREATOR__S = makeString(" :CREATOR ~S");

    static private final SubLString $str40$__CREATION_DATE__S = makeString(" :CREATION-DATE ~S");

    static private final SubLString $str41$____MICROTHEORY__S = makeString("~% :MICROTHEORY ~S");

    static private final SubLString $str42$____KIF = makeString("~% :KIF");

    static private final SubLString $str43$___ = makeString("~%)");

    static private final SubLString $str44$_____KIF_assertion_specs_for_enti = makeString("\n\n;; KIF assertion-specs for entire KB\n;; ~A");

    static private final SubLString $str45$_____KIF_assertion_specs_for_micr = makeString("\n\n;; KIF assertion-specs for microtheory : ~S\n;; ~A");

    private static final SubLSymbol CHAR_UPCASE = makeSymbol("CHAR-UPCASE");

    private static final SubLSymbol CHAR_DOWNCASE = makeSymbol("CHAR-DOWNCASE");

    static private final SubLString $$$Use_NIL = makeString("Use NIL");

    static private final SubLList $list56 = list(makeSymbol("OBJECT"), makeSymbol("PRED"));

    public static final SubLSymbol $suspend_type_checkingP$ = makeSymbol("*SUSPEND-TYPE-CHECKING?*");

    private static final SubLSymbol CYCL_TO_KIF_ERROR = makeSymbol("CYCL-TO-KIF-ERROR");

    static private final SubLString $str60$_A_is_not_a__A = makeString("~A is not a ~A");

    private static final SubLSymbol KIF_TERM = makeSymbol("KIF-TERM");

    private static final SubLSymbol KIF_TERM_P = makeSymbol("KIF-TERM-P");

    static private final SubLList $list64 = list(makeSymbol("PRINT-STRING"));

    static private final SubLList $list65 = list(makeKeyword("PRINT-STRING"));

    static private final SubLList $list66 = list(makeSymbol("KIF-PRINT-STRING"));

    static private final SubLList $list67 = list(makeSymbol("_CSETF-KIF-PRINT-STRING"));

    private static final SubLSymbol PRINT_KIF_TERM = makeSymbol("PRINT-KIF-TERM");

    private static final SubLSymbol KIF_TERM_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("KIF-TERM-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list70 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("KIF-TERM-P"));

    private static final SubLSymbol KIF_PRINT_STRING = makeSymbol("KIF-PRINT-STRING");

    private static final SubLSymbol _CSETF_KIF_PRINT_STRING = makeSymbol("_CSETF-KIF-PRINT-STRING");

    private static final SubLString $str74$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_KIF_TERM = makeSymbol("MAKE-KIF-TERM");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_KIF_TERM_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-KIF-TERM-METHOD");

    private static final SubLSymbol SXHASH_KIF_TERM_METHOD = makeSymbol("SXHASH-KIF-TERM-METHOD");

    private static final SubLSymbol $kif_term_table$ = makeSymbol("*KIF-TERM-TABLE*");

    private static final SubLSymbol CYCL_TO_KIF_FUNCTOR_P = makeSymbol("CYCL-TO-KIF-FUNCTOR-P");

    private static final SubLInteger $int$50 = makeInteger(50);

    private static final SubLList $list85 = list(makeSymbol("CYCL-TERM"), makeSymbol("ARGLIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLString $str86$CYCL_TO_KIF__A_METHOD = makeString("CYCL-TO-KIF-~A-METHOD");

    private static final SubLSymbol REGISTER_CYCL_TO_KIF_METHOD = makeSymbol("REGISTER-CYCL-TO-KIF-METHOD");

    static private final SubLList $list90 = list(makeSymbol("PREDICATE"), makeSymbol("&REST"), makeSymbol("ARGUMENTS"));

    private static final SubLSymbol $sym91$EL_VAR_ = makeSymbol("EL-VAR?");



    private static final SubLSymbol CYCL_2_TERM_TO_KIF = makeSymbol("CYCL-2-TERM-TO-KIF");

    private static final SubLString $str94$Expecting_a_variable___S = makeString("Expecting a variable: ~S");

    private static final SubLString $str95$Invalid_represented_first_order_t = makeString("Invalid represented first order term : ~S");

    private static final SubLList $list96 = list(makeSymbol("FUNCTION"), makeSymbol("&REST"), makeSymbol("ARGUMENTS"));



    private static final SubLString $$$true = makeString("true");



    private static final SubLString $$$false = makeString("false");



    private static final SubLString $$$not = makeString("not");

    private static final SubLList $list103 = list(makeSymbol("NOT"), makeSymbol("SUBFORMULA"));

    private static final SubLSymbol CYCL_TO_KIF_NOT_METHOD = makeSymbol("CYCL-TO-KIF-NOT-METHOD");



    private static final SubLString $$$and = makeString("and");

    private static final SubLList $list107 = list(makeSymbol("AND"), makeSymbol("&REST"), makeSymbol("SUBFORMULAS"));

    private static final SubLSymbol CYCL_FORMULA_TO_KIF = makeSymbol("CYCL-FORMULA-TO-KIF");

    private static final SubLSymbol CYCL_TO_KIF_AND_METHOD = makeSymbol("CYCL-TO-KIF-AND-METHOD");



    private static final SubLString $$$or = makeString("or");

    private static final SubLList $list112 = list(makeSymbol("OR"), makeSymbol("&REST"), makeSymbol("SUBFORMULAS"));

    private static final SubLSymbol CYCL_TO_KIF_OR_METHOD = makeSymbol("CYCL-TO-KIF-OR-METHOD");



    private static final SubLString $str115$__ = makeString("=>");

    static private final SubLList $list116 = list(makeSymbol("IMPLIES"), makeSymbol("ANTECEDENT"), makeSymbol("CONSEQUENT"));

    private static final SubLSymbol CYCL_TO_KIF_IMPLIES_METHOD = makeSymbol("CYCL-TO-KIF-IMPLIES-METHOD");



    private static final SubLString $str119$___ = makeString("<=>");

    private static final SubLList $list120 = list(makeSymbol("EQUIV"), makeSymbol("ANTECEDENT"), makeSymbol("CONSEQUENT"));

    private static final SubLSymbol CYCL_TO_KIF_EQUIV_METHOD = makeSymbol("CYCL-TO-KIF-EQUIV-METHOD");

    private static final SubLList $list122 = list(makeSymbol("XOR"), makeSymbol("SUBFORMULA1"), makeSymbol("SUBFORMULA2"));



    private static final SubLSymbol CYCL_TO_KIF_XOR_METHOD = makeSymbol("CYCL-TO-KIF-XOR-METHOD");

    private static final SubLList $list125 = list(makeSymbol("TRUESENTENCE"), makeSymbol("SUBFORMULA"));

    private static final SubLSymbol CYCL_TO_KIF_TRUESENTENCE_METHOD = makeSymbol("CYCL-TO-KIF-TRUESENTENCE-METHOD");



    private static final SubLString $$$forall = makeString("forall");

    private static final SubLList $list129 = list(makeSymbol("FORALL"), makeSymbol("VARIABLE"), makeSymbol("SUBFORMULA"));

    private static final SubLSymbol CYCL_TO_KIF_FORALL_METHOD = makeSymbol("CYCL-TO-KIF-FORALL-METHOD");



    private static final SubLString $$$exists = makeString("exists");

    private static final SubLList $list133 = list(makeSymbol("THEREEXISTS"), makeSymbol("VARIABLE"), makeSymbol("SUBFORMULA"));

    private static final SubLSymbol CYCL_TO_KIF_THEREEXISTS_METHOD = makeSymbol("CYCL-TO-KIF-THEREEXISTS-METHOD");



    private static final SubLSymbol CYCL_TO_KIF_THEREEXISTEXACTLY_METHOD = makeSymbol("CYCL-TO-KIF-THEREEXISTEXACTLY-METHOD");



    private static final SubLSymbol CYCL_TO_KIF_THEREEXISTATLEAST_METHOD = makeSymbol("CYCL-TO-KIF-THEREEXISTATLEAST-METHOD");



    private static final SubLSymbol CYCL_TO_KIF_THEREEXISTATMOST_METHOD = makeSymbol("CYCL-TO-KIF-THEREEXISTATMOST-METHOD");

    static private final SubLList $list141 = list(makeSymbol("THERE-EXISTS-VARIANT"), makeSymbol("NUM"), makeSymbol("VARIABLE"), makeSymbol("SUBFORMULA"));



    private static final SubLString $str143$_ = makeString("=");

    private static final SubLList $list144 = list(makeSymbol("IST"), makeSymbol("MT"), makeSymbol("SUBFORMULA"));



    private static final SubLSymbol CYCL_TO_KIF_IST_METHOD = makeSymbol("CYCL-TO-KIF-IST-METHOD");

    private static final SubLList $list147 = list(makeSymbol("GOALS"), makeSymbol("AGENT"), makeSymbol("SUBFORMULA"));



    private static final SubLSymbol CYCL_TO_KIF_GOALS_METHOD = makeSymbol("CYCL-TO-KIF-GOALS-METHOD");



    private static final SubLString $$$listof = makeString("listof");

    public static final SubLObject until_cycl_to_kif_aborted_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(CCATCH_IGNORE, $ABORT_CYCL_TO_KIF, listS(CLET, $list_alt3, append(body, NIL)));
        }
    }

    public static SubLObject until_cycl_to_kif_aborted(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(CCATCH_IGNORE, $ABORT_CYCL_TO_KIF, listS(CLET, $list3, append(body, NIL)));
    }

    /**
     * Abort a CycL to KIF translation in progress.
     */
    @LispMethod(comment = "Abort a CycL to KIF translation in progress.")
    public static final SubLObject abort_cycl_to_kif_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $within_cycl_to_kif$.getDynamicValue(thread)) {
                return sublisp_throw($ABORT_CYCL_TO_KIF, NIL);
            }
            return NIL;
        }
    }

    /**
     * Abort a CycL to KIF translation in progress.
     */
    @LispMethod(comment = "Abort a CycL to KIF translation in progress.")
    public static SubLObject abort_cycl_to_kif() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $within_cycl_to_kif$.getDynamicValue(thread)) {
            return sublisp_throw($ABORT_CYCL_TO_KIF, NIL);
        }
        return NIL;
    }

    public static final SubLObject writing_kif_file_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt6);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject stream = NIL;
                    SubLObject filename = NIL;
                    SubLObject kif_term_print_method = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt6);
                    stream = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt6);
                    filename = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt6);
                    kif_term_print_method = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject print_method = $sym7$PRINT_METHOD;
                            return list(WITH_TEXT_FILE, listS(stream, filename, $list_alt9), list(WRITE_KB_CONTENT_COPYRIGHT_NOTICE, stream), listS(CLET, listS(list(print_method, kif_term_print_method), list($kif_term_print_method$, listS(FIF, print_method, print_method, $list_alt13)), $list_alt14), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt6);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject writing_kif_file(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list6);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream = NIL;
        SubLObject filename = NIL;
        SubLObject kif_term_print_method = NIL;
        destructuring_bind_must_consp(current, datum, $list6);
        stream = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list6);
        filename = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list6);
        kif_term_print_method = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject print_method = $sym7$PRINT_METHOD;
            return list(WITH_TEXT_FILE, listS(stream, filename, $list9), list(WRITE_KB_CONTENT_COPYRIGHT_NOTICE, stream), listS(CLET, listS(list(print_method, kif_term_print_method), list($kif_term_print_method$, listS(FIF, print_method, print_method, $list13)), $list14), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list6);
        return NIL;
    }

    /**
     * Output all assertions in the KB to FILENAME as KIF assertion-specs.
     * If provides, use KIF-TERM-PRINT-METHOD as the output method for each KIF term.
     */
    @LispMethod(comment = "Output all assertions in the KB to FILENAME as KIF assertion-specs.\r\nIf provides, use KIF-TERM-PRINT-METHOD as the output method for each KIF term.\nOutput all assertions in the KB to FILENAME as KIF assertion-specs.\nIf provides, use KIF-TERM-PRINT-METHOD as the output method for each KIF term.")
    public static final SubLObject write_kb_to_kif_file_alt(SubLObject filename, SubLObject kif_term_print_method) {
        if (kif_term_print_method == UNPROVIDED) {
            kif_term_print_method = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(filename, STRINGP);
            {
                SubLObject written = NIL;
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(filename, $OUTPUT, NIL);
                    if (!stream.isStream()) {
                        Errors.error($str_alt17$Unable_to_open__S, filename);
                    }
                    {
                        SubLObject stream_1 = stream;
                        misc_utilities.write_kb_content_copyright_notice(stream_1);
                        {
                            SubLObject print_method = kif_term_print_method;
                            {
                                SubLObject _prev_bind_0 = $kif_term_print_method$.currentBinding(thread);
                                SubLObject _prev_bind_1 = $cycl_to_kif_error_method$.currentBinding(thread);
                                try {
                                    $kif_term_print_method$.bind(NIL != print_method ? ((SubLObject) (print_method)) : $kif_term_print_method$.getDynamicValue(thread), thread);
                                    $cycl_to_kif_error_method$.bind($ABORT, thread);
                                    write_kb_to_kif_file_preamble(stream_1);
                                    {
                                        SubLObject idx = assertion_handles.do_assertions_table();
                                        SubLObject total = id_index_count(idx);
                                        SubLObject sofar = ZERO_INTEGER;
                                        SubLTrampolineFile.checkType($$$Converting_KB_to_KIF, STRINGP);
                                        {
                                            SubLObject _prev_bind_0_2 = $last_percent_progress_index$.currentBinding(thread);
                                            SubLObject _prev_bind_1_3 = $last_percent_progress_prediction$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                            SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                            try {
                                                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                $last_percent_progress_prediction$.bind(NIL, thread);
                                                $within_noting_percent_progress$.bind(T, thread);
                                                $percent_progress_start_time$.bind(get_universal_time(), thread);
                                                noting_percent_progress_preamble($$$Converting_KB_to_KIF);
                                                if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                                                    {
                                                        SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                                        SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                                        SubLObject assertion = NIL;
                                                        while (NIL != id) {
                                                            assertion = do_id_index_state_object(idx, $SKIP, id, state_var);
                                                            if (NIL != do_id_index_id_and_object_validP(id, assertion, $SKIP)) {
                                                                note_percent_progress(sofar, total);
                                                                sofar = add(sofar, ONE_INTEGER);
                                                                {
                                                                    SubLObject ignore_errors_tag = NIL;
                                                                    try {
                                                                        {
                                                                            SubLObject _prev_bind_0_4 = Errors.$error_handler$.currentBinding(thread);
                                                                            try {
                                                                                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                                                                try {
                                                                                    assertion_kif_formula_to_stream(assertion, stream_1);
                                                                                } catch (Throwable catch_var) {
                                                                                    Errors.handleThrowable(catch_var, NIL);
                                                                                }
                                                                            } finally {
                                                                                Errors.$error_handler$.rebind(_prev_bind_0_4, thread);
                                                                            }
                                                                        }
                                                                    } catch (Throwable ccatch_env_var) {
                                                                        ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                                                                    }
                                                                }
                                                            }
                                                            id = do_id_index_next_id(idx, T, id, state_var);
                                                            state_var = do_id_index_next_state(idx, T, id, state_var);
                                                        } 
                                                    }
                                                }
                                                noting_percent_progress_postamble();
                                            } finally {
                                                $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                                $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                                $last_percent_progress_prediction$.rebind(_prev_bind_1_3, thread);
                                                $last_percent_progress_index$.rebind(_prev_bind_0_2, thread);
                                            }
                                        }
                                    }
                                    written = T;
                                } finally {
                                    $cycl_to_kif_error_method$.rebind(_prev_bind_1, thread);
                                    $kif_term_print_method$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
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
                return written;
            }
        }
    }

    /**
     * Output all assertions in the KB to FILENAME as KIF assertion-specs.
     * If provides, use KIF-TERM-PRINT-METHOD as the output method for each KIF term.
     */
    @LispMethod(comment = "Output all assertions in the KB to FILENAME as KIF assertion-specs.\r\nIf provides, use KIF-TERM-PRINT-METHOD as the output method for each KIF term.\nOutput all assertions in the KB to FILENAME as KIF assertion-specs.\nIf provides, use KIF-TERM-PRINT-METHOD as the output method for each KIF term.")
    public static SubLObject write_kb_to_kif_file(final SubLObject filename, SubLObject kif_term_print_method) {
        if (kif_term_print_method == UNPROVIDED) {
            kif_term_print_method = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(filename) : "! stringp(filename) " + ("Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) ") + filename;
        SubLObject written = NIL;
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(filename, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str17$Unable_to_open__S, filename);
            }
            final SubLObject stream_$1 = stream;
            misc_utilities.write_kb_content_copyright_notice(stream_$1);
            final SubLObject print_method = kif_term_print_method;
            final SubLObject _prev_bind_0 = $kif_term_print_method$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $cycl_to_kif_error_method$.currentBinding(thread);
            try {
                $kif_term_print_method$.bind(NIL != print_method ? print_method : $kif_term_print_method$.getDynamicValue(thread), thread);
                $cycl_to_kif_error_method$.bind($ABORT, thread);
                write_kb_to_kif_file_preamble(stream_$1);
                final SubLObject idx = assertion_handles.do_assertions_table();
                final SubLObject mess = $$$Converting_KB_to_KIF;
                final SubLObject total = id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
                final SubLObject _prev_bind_0_$2 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_1_$3 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble(mess);
                        final SubLObject idx_$4 = idx;
                        if (NIL == id_index_objects_empty_p(idx_$4, $SKIP)) {
                            final SubLObject idx_$5 = idx_$4;
                            if (NIL == id_index_dense_objects_empty_p(idx_$5, $SKIP)) {
                                final SubLObject vector_var = id_index_dense_objects(idx_$5);
                                final SubLObject backwardP_var = NIL;
                                SubLObject length;
                                SubLObject v_iteration;
                                SubLObject a_id;
                                SubLObject a_handle;
                                SubLObject assertion;
                                SubLObject ignore_errors_tag;
                                SubLObject _prev_bind_0_$3;
                                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                    a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                    a_handle = aref(vector_var, a_id);
                                    if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                        if (NIL != id_index_tombstone_p(a_handle)) {
                                            a_handle = $SKIP;
                                        }
                                        assertion = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                        ignore_errors_tag = NIL;
                                        try {
                                            thread.throwStack.push($IGNORE_ERRORS_TARGET);
                                            _prev_bind_0_$3 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                                try {
                                                    assertion_kif_formula_to_stream(assertion, stream_$1);
                                                } catch (final Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_$3, thread);
                                            }
                                        } catch (final Throwable ccatch_env_var) {
                                            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                                        } finally {
                                            thread.throwStack.pop();
                                        }
                                        sofar = add(sofar, ONE_INTEGER);
                                        note_percent_progress(sofar, total);
                                    }
                                }
                            }
                            final SubLObject idx_$6 = idx_$4;
                            if ((NIL == id_index_sparse_objects_empty_p(idx_$6)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                final SubLObject sparse = id_index_sparse_objects(idx_$6);
                                SubLObject a_id2 = id_index_sparse_id_threshold(idx_$6);
                                final SubLObject end_id = id_index_next_id(idx_$6);
                                final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                while (a_id2.numL(end_id)) {
                                    final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                                    if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                        final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                        SubLObject ignore_errors_tag2 = NIL;
                                        try {
                                            thread.throwStack.push($IGNORE_ERRORS_TARGET);
                                            final SubLObject _prev_bind_0_$4 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                                try {
                                                    assertion_kif_formula_to_stream(assertion2, stream_$1);
                                                } catch (final Throwable catch_var2) {
                                                    Errors.handleThrowable(catch_var2, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_$4, thread);
                                            }
                                        } catch (final Throwable ccatch_env_var2) {
                                            ignore_errors_tag2 = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
                                        } finally {
                                            thread.throwStack.pop();
                                        }
                                        sofar = add(sofar, ONE_INTEGER);
                                        note_percent_progress(sofar, total);
                                    }
                                    a_id2 = add(a_id2, ONE_INTEGER);
                                } 
                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_1_$3, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_0_$2, thread);
                }
                written = T;
            } finally {
                $cycl_to_kif_error_method$.rebind(_prev_bind_2, thread);
                $kif_term_print_method$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
            }
        }
        return written;
    }

    /**
     * Output all assertions in MT to FILENAME as KIF assertion-specs.
     * If provides, use KIF-TERM-PRINT-METHOD as the output method for each KIF term.
     */
    @LispMethod(comment = "Output all assertions in MT to FILENAME as KIF assertion-specs.\r\nIf provides, use KIF-TERM-PRINT-METHOD as the output method for each KIF term.\nOutput all assertions in MT to FILENAME as KIF assertion-specs.\nIf provides, use KIF-TERM-PRINT-METHOD as the output method for each KIF term.")
    public static final SubLObject write_mt_to_kif_file_alt(SubLObject mt, SubLObject filename, SubLObject kif_term_print_method) {
        if (kif_term_print_method == UNPROVIDED) {
            kif_term_print_method = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(mt, HLMT_P);
            SubLTrampolineFile.checkType(filename, STRINGP);
            {
                SubLObject written = NIL;
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(filename, $OUTPUT, NIL);
                    if (!stream.isStream()) {
                        Errors.error($str_alt17$Unable_to_open__S, filename);
                    }
                    {
                        SubLObject stream_5 = stream;
                        misc_utilities.write_kb_content_copyright_notice(stream_5);
                        {
                            SubLObject print_method = kif_term_print_method;
                            {
                                SubLObject _prev_bind_0 = $kif_term_print_method$.currentBinding(thread);
                                SubLObject _prev_bind_1 = $cycl_to_kif_error_method$.currentBinding(thread);
                                try {
                                    $kif_term_print_method$.bind(NIL != print_method ? ((SubLObject) (print_method)) : $kif_term_print_method$.getDynamicValue(thread), thread);
                                    $cycl_to_kif_error_method$.bind($ABORT, thread);
                                    write_mt_to_kif_file_preamble(mt, stream_5);
                                    {
                                        SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(mt);
                                        if (pcase_var.eql($MT)) {
                                            if (NIL != kb_mapping_macros.do_mt_index_key_validator(mt, NIL)) {
                                                {
                                                    SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(mt);
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                                                        {
                                                            SubLObject done_var = NIL;
                                                            SubLObject token_var = NIL;
                                                            while (NIL == done_var) {
                                                                {
                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                                                                    SubLObject valid = makeBoolean(token_var != assertion);
                                                                    if (NIL != valid) {
                                                                        {
                                                                            SubLObject ignore_errors_tag = NIL;
                                                                            try {
                                                                                {
                                                                                    SubLObject _prev_bind_0_6 = Errors.$error_handler$.currentBinding(thread);
                                                                                    try {
                                                                                        Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                                                                        try {
                                                                                            assertion_kif_formula_to_stream(assertion, stream_5);
                                                                                        } catch (Throwable catch_var) {
                                                                                            Errors.handleThrowable(catch_var, NIL);
                                                                                        }
                                                                                    } finally {
                                                                                        Errors.$error_handler$.rebind(_prev_bind_0_6, thread);
                                                                                    }
                                                                                }
                                                                            } catch (Throwable ccatch_env_var) {
                                                                                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                                                                            }
                                                                        }
                                                                    }
                                                                    done_var = makeBoolean(NIL == valid);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_7, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            if (pcase_var.eql($BROAD_MT)) {
                                                if (NIL != kb_mapping_macros.do_broad_mt_index_key_validator(mt, NIL)) {
                                                    {
                                                        SubLObject idx = assertion_handles.do_assertions_table();
                                                        SubLObject total = id_index_count(idx);
                                                        SubLObject sofar = ZERO_INTEGER;
                                                        SubLTrampolineFile.checkType($str_alt25$do_broad_mt_index, STRINGP);
                                                        {
                                                            SubLObject _prev_bind_0_8 = $last_percent_progress_index$.currentBinding(thread);
                                                            SubLObject _prev_bind_1_9 = $last_percent_progress_prediction$.currentBinding(thread);
                                                            SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                                            SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                                            try {
                                                                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                                $last_percent_progress_prediction$.bind(NIL, thread);
                                                                $within_noting_percent_progress$.bind(T, thread);
                                                                $percent_progress_start_time$.bind(get_universal_time(), thread);
                                                                noting_percent_progress_preamble($str_alt25$do_broad_mt_index);
                                                                if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                                                                    {
                                                                        SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                                                        SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                                                        SubLObject assertion = NIL;
                                                                        while (NIL != id) {
                                                                            assertion = do_id_index_state_object(idx, $SKIP, id, state_var);
                                                                            if (NIL != do_id_index_id_and_object_validP(id, assertion, $SKIP)) {
                                                                                note_percent_progress(sofar, total);
                                                                                sofar = add(sofar, ONE_INTEGER);
                                                                                if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(assertion, mt, NIL, NIL)) {
                                                                                    {
                                                                                        SubLObject ignore_errors_tag = NIL;
                                                                                        try {
                                                                                            {
                                                                                                SubLObject _prev_bind_0_10 = Errors.$error_handler$.currentBinding(thread);
                                                                                                try {
                                                                                                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                                                                                    try {
                                                                                                        assertion_kif_formula_to_stream(assertion, stream_5);
                                                                                                    } catch (Throwable catch_var) {
                                                                                                        Errors.handleThrowable(catch_var, NIL);
                                                                                                    }
                                                                                                } finally {
                                                                                                    Errors.$error_handler$.rebind(_prev_bind_0_10, thread);
                                                                                                }
                                                                                            }
                                                                                        } catch (Throwable ccatch_env_var) {
                                                                                            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            id = do_id_index_next_id(idx, T, id, state_var);
                                                                            state_var = do_id_index_next_state(idx, T, id, state_var);
                                                                        } 
                                                                    }
                                                                }
                                                                noting_percent_progress_postamble();
                                                            } finally {
                                                                $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                                                $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                                                $last_percent_progress_prediction$.rebind(_prev_bind_1_9, thread);
                                                                $last_percent_progress_index$.rebind(_prev_bind_0_8, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    written = T;
                                } finally {
                                    $cycl_to_kif_error_method$.rebind(_prev_bind_1, thread);
                                    $kif_term_print_method$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
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
                return written;
            }
        }
    }

    /**
     * Output all assertions in MT to FILENAME as KIF assertion-specs.
     * If provides, use KIF-TERM-PRINT-METHOD as the output method for each KIF term.
     */
    @LispMethod(comment = "Output all assertions in MT to FILENAME as KIF assertion-specs.\r\nIf provides, use KIF-TERM-PRINT-METHOD as the output method for each KIF term.\nOutput all assertions in MT to FILENAME as KIF assertion-specs.\nIf provides, use KIF-TERM-PRINT-METHOD as the output method for each KIF term.")
    public static SubLObject write_mt_to_kif_file(final SubLObject mt, final SubLObject filename, SubLObject kif_term_print_method) {
        if (kif_term_print_method == UNPROVIDED) {
            kif_term_print_method = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != hlmt.hlmt_p(mt) : "! hlmt.hlmt_p(mt) " + ("hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) ") + mt;
        assert NIL != stringp(filename) : "! stringp(filename) " + ("Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) ") + filename;
        SubLObject written = NIL;
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(filename, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str17$Unable_to_open__S, filename);
            }
            final SubLObject stream_$10 = stream;
            misc_utilities.write_kb_content_copyright_notice(stream_$10);
            final SubLObject print_method = kif_term_print_method;
            final SubLObject _prev_bind_0 = $kif_term_print_method$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $cycl_to_kif_error_method$.currentBinding(thread);
            try {
                $kif_term_print_method$.bind(NIL != print_method ? print_method : $kif_term_print_method$.getDynamicValue(thread), thread);
                $cycl_to_kif_error_method$.bind($ABORT, thread);
                write_mt_to_kif_file_preamble(mt, stream_$10);
                final SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(mt);
                if (pcase_var.eql($MT)) {
                    if (NIL != kb_mapping_macros.do_mt_index_key_validator(mt, NIL)) {
                        final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(mt);
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(assertion));
                                if (NIL != valid) {
                                    SubLObject ignore_errors_tag = NIL;
                                    try {
                                        thread.throwStack.push($IGNORE_ERRORS_TARGET);
                                        final SubLObject _prev_bind_0_$11 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                            try {
                                                assertion_kif_formula_to_stream(assertion, stream_$10);
                                            } catch (final Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_$11, thread);
                                        }
                                    } catch (final Throwable ccatch_env_var) {
                                        ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                                    } finally {
                                        thread.throwStack.pop();
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                            }
                        }
                    }
                } else
                    if (pcase_var.eql($BROAD_MT) && (NIL != kb_mapping_macros.do_broad_mt_index_key_validator(mt, NIL))) {
                        final SubLObject idx = assertion_handles.do_assertions_table();
                        final SubLObject mess = $str25$do_broad_mt_index;
                        final SubLObject total = id_index_count(idx);
                        SubLObject sofar = ZERO_INTEGER;
                        assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
                        final SubLObject _prev_bind_0_$13 = $last_percent_progress_index$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$14 = $last_percent_progress_prediction$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
                        try {
                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                            $last_percent_progress_prediction$.bind(NIL, thread);
                            $within_noting_percent_progress$.bind(T, thread);
                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                            try {
                                noting_percent_progress_preamble(mess);
                                final SubLObject idx_$15 = idx;
                                if (NIL == id_index_objects_empty_p(idx_$15, $SKIP)) {
                                    final SubLObject idx_$16 = idx_$15;
                                    if (NIL == id_index_dense_objects_empty_p(idx_$16, $SKIP)) {
                                        final SubLObject vector_var = id_index_dense_objects(idx_$16);
                                        final SubLObject backwardP_var = NIL;
                                        SubLObject length;
                                        SubLObject v_iteration;
                                        SubLObject a_id;
                                        SubLObject a_handle;
                                        SubLObject assertion2;
                                        SubLObject ignore_errors_tag2;
                                        SubLObject _prev_bind_0_$14;
                                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                            a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                            a_handle = aref(vector_var, a_id);
                                            if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                                if (NIL != id_index_tombstone_p(a_handle)) {
                                                    a_handle = $SKIP;
                                                }
                                                assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                                if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(assertion2, mt, NIL, NIL)) {
                                                    ignore_errors_tag2 = NIL;
                                                    try {
                                                        thread.throwStack.push($IGNORE_ERRORS_TARGET);
                                                        _prev_bind_0_$14 = Errors.$error_handler$.currentBinding(thread);
                                                        try {
                                                            Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                                            try {
                                                                assertion_kif_formula_to_stream(assertion2, stream_$10);
                                                            } catch (final Throwable catch_var2) {
                                                                Errors.handleThrowable(catch_var2, NIL);
                                                            }
                                                        } finally {
                                                            Errors.$error_handler$.rebind(_prev_bind_0_$14, thread);
                                                        }
                                                    } catch (final Throwable ccatch_env_var2) {
                                                        ignore_errors_tag2 = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
                                                    } finally {
                                                        thread.throwStack.pop();
                                                    }
                                                }
                                                sofar = add(sofar, ONE_INTEGER);
                                                note_percent_progress(sofar, total);
                                            }
                                        }
                                    }
                                    final SubLObject idx_$17 = idx_$15;
                                    if ((NIL == id_index_sparse_objects_empty_p(idx_$17)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                        final SubLObject sparse = id_index_sparse_objects(idx_$17);
                                        SubLObject a_id2 = id_index_sparse_id_threshold(idx_$17);
                                        final SubLObject end_id = id_index_next_id(idx_$17);
                                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                        while (a_id2.numL(end_id)) {
                                            final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                                final SubLObject assertion3 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                                if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(assertion3, mt, NIL, NIL)) {
                                                    SubLObject ignore_errors_tag3 = NIL;
                                                    try {
                                                        thread.throwStack.push($IGNORE_ERRORS_TARGET);
                                                        final SubLObject _prev_bind_0_$15 = Errors.$error_handler$.currentBinding(thread);
                                                        try {
                                                            Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                                            try {
                                                                assertion_kif_formula_to_stream(assertion3, stream_$10);
                                                            } catch (final Throwable catch_var3) {
                                                                Errors.handleThrowable(catch_var3, NIL);
                                                            }
                                                        } finally {
                                                            Errors.$error_handler$.rebind(_prev_bind_0_$15, thread);
                                                        }
                                                    } catch (final Throwable ccatch_env_var3) {
                                                        ignore_errors_tag3 = Errors.handleThrowable(ccatch_env_var3, $IGNORE_ERRORS_TARGET);
                                                    } finally {
                                                        thread.throwStack.pop();
                                                    }
                                                }
                                                sofar = add(sofar, ONE_INTEGER);
                                                note_percent_progress(sofar, total);
                                            }
                                            a_id2 = add(a_id2, ONE_INTEGER);
                                        } 
                                    }
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    noting_percent_progress_postamble();
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                                }
                            }
                        } finally {
                            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                            $last_percent_progress_prediction$.rebind(_prev_bind_1_$14, thread);
                            $last_percent_progress_index$.rebind(_prev_bind_0_$13, thread);
                        }
                    }

                written = T;
            } finally {
                $cycl_to_kif_error_method$.rebind(_prev_bind_2, thread);
                $kif_term_print_method$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values3 = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values3);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
            }
        }
        return written;
    }

    /**
     * Convert one CycL ASSERTION into a KIF assertion-spec and print it to STREAM
     */
    @LispMethod(comment = "Convert one CycL ASSERTION into a KIF assertion-spec and print it to STREAM")
    public static final SubLObject assertion_kif_formula_to_stream_alt(SubLObject assertion, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        {
            SubLObject kif_spec = assertion_kif_formula(assertion);
            if (NIL != kif_spec) {
                {
                    SubLObject datum = kif_spec;
                    SubLObject current = datum;
                    SubLObject allow_other_keys_p = NIL;
                    SubLObject rest = current;
                    SubLObject bad = NIL;
                    SubLObject current_11 = NIL;
                    for (; NIL != rest;) {
                        destructuring_bind_must_consp(rest, datum, $list_alt27);
                        current_11 = rest.first();
                        rest = rest.rest();
                        destructuring_bind_must_consp(rest, datum, $list_alt27);
                        if (NIL == member(current_11, $list_alt28, UNPROVIDED, UNPROVIDED)) {
                            bad = T;
                        }
                        if (current_11 == $ALLOW_OTHER_KEYS) {
                            allow_other_keys_p = rest.first();
                        }
                        rest = rest.rest();
                    }
                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                        cdestructuring_bind_error(datum, $list_alt27);
                    }
                    {
                        SubLObject direction_tail = property_list_member($DIRECTION, current);
                        SubLObject direction = (NIL != direction_tail) ? ((SubLObject) (cadr(direction_tail))) : NIL;
                        SubLObject monotonicity_tail = property_list_member($MONOTONICITY, current);
                        SubLObject monotonicity = (NIL != monotonicity_tail) ? ((SubLObject) (cadr(monotonicity_tail))) : NIL;
                        SubLObject microtheory_tail = property_list_member($MICROTHEORY, current);
                        SubLObject microtheory = (NIL != microtheory_tail) ? ((SubLObject) (cadr(microtheory_tail))) : NIL;
                        SubLObject creator_tail = property_list_member($CREATOR, current);
                        SubLObject creator = (NIL != creator_tail) ? ((SubLObject) (cadr(creator_tail))) : NIL;
                        SubLObject creation_date_tail = property_list_member($CREATION_DATE, current);
                        SubLObject creation_date = (NIL != creation_date_tail) ? ((SubLObject) (cadr(creation_date_tail))) : NIL;
                        SubLObject kif_tail = property_list_member($KIF, current);
                        SubLObject v_kif = (NIL != kif_tail) ? ((SubLObject) (cadr(kif_tail))) : NIL;
                        format(stream, $str_alt36$_____);
                        format(stream, $str_alt37$_DIRECTION__S, direction);
                        format(stream, $str_alt38$__MONOTONICITY__S, monotonicity);
                        format(stream, $str_alt39$__CREATOR__S, creator);
                        format(stream, $str_alt40$__CREATION_DATE__S, creation_date);
                        format(stream, $str_alt41$____MICROTHEORY__S, microtheory);
                        format(stream, $str_alt42$____KIF);
                        format_cycl_expression.format_cycl_expression(v_kif, stream, ONE_INTEGER);
                        format(stream, $str_alt43$___);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Convert one CycL ASSERTION into a KIF assertion-spec and print it to STREAM
     */
    @LispMethod(comment = "Convert one CycL ASSERTION into a KIF assertion-spec and print it to STREAM")
    public static SubLObject assertion_kif_formula_to_stream(final SubLObject assertion, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        final SubLObject kif_spec = assertion_kif_formula(assertion);
        if (NIL != kif_spec) {
            final SubLObject current;
            final SubLObject datum = current = kif_spec;
            SubLObject allow_other_keys_p = NIL;
            SubLObject rest = current;
            SubLObject bad = NIL;
            SubLObject current_$21 = NIL;
            while (NIL != rest) {
                destructuring_bind_must_consp(rest, datum, $list27);
                current_$21 = rest.first();
                rest = rest.rest();
                destructuring_bind_must_consp(rest, datum, $list27);
                if (NIL == member(current_$21, $list28, UNPROVIDED, UNPROVIDED)) {
                    bad = T;
                }
                if (current_$21 == $ALLOW_OTHER_KEYS) {
                    allow_other_keys_p = rest.first();
                }
                rest = rest.rest();
            } 
            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                cdestructuring_bind_error(datum, $list27);
            }
            final SubLObject direction_tail = property_list_member($DIRECTION, current);
            final SubLObject direction = (NIL != direction_tail) ? cadr(direction_tail) : NIL;
            final SubLObject monotonicity_tail = property_list_member($MONOTONICITY, current);
            final SubLObject monotonicity = (NIL != monotonicity_tail) ? cadr(monotonicity_tail) : NIL;
            final SubLObject microtheory_tail = property_list_member($MICROTHEORY, current);
            final SubLObject microtheory = (NIL != microtheory_tail) ? cadr(microtheory_tail) : NIL;
            final SubLObject creator_tail = property_list_member($CREATOR, current);
            final SubLObject creator = (NIL != creator_tail) ? cadr(creator_tail) : NIL;
            final SubLObject creation_date_tail = property_list_member($CREATION_DATE, current);
            final SubLObject creation_date = (NIL != creation_date_tail) ? cadr(creation_date_tail) : NIL;
            final SubLObject kif_tail = property_list_member($KIF, current);
            final SubLObject v_kif = (NIL != kif_tail) ? cadr(kif_tail) : NIL;
            format(stream, $str36$_____);
            format(stream, $str37$_DIRECTION__S, direction);
            format(stream, $str38$__MONOTONICITY__S, monotonicity);
            format(stream, $str39$__CREATOR__S, creator);
            format(stream, $str40$__CREATION_DATE__S, creation_date);
            format(stream, $str41$____MICROTHEORY__S, microtheory);
            format(stream, $str42$____KIF);
            format_cycl_expression.format_cycl_expression(v_kif, stream, ONE_INTEGER);
            format(stream, $str43$___);
        }
        return NIL;
    }

    /**
     * Convert one CycL ASSERTION into a KIF assertion-spec
     */
    @LispMethod(comment = "Convert one CycL ASSERTION into a KIF assertion-spec")
    public static final SubLObject assertion_kif_formula_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        if (NIL != assertions_high.valid_assertion(assertion, UNPROVIDED)) {
            {
                SubLObject el_formula = uncanonicalizer.assertion_el_formula(assertion);
                if (NIL != el_formula) {
                    {
                        SubLObject kif_formula = cycl_to_kif(el_formula);
                        if (NIL != kif_formula) {
                            {
                                SubLObject mt = assertions_high.assertion_mt(assertion);
                                SubLObject kif_mt = cycl_to_kif(mt);
                                if (NIL != kif_mt) {
                                    {
                                        SubLObject direction = assertions_high.assertion_direction(assertion);
                                        SubLObject strength = assertions_high.assertion_strength(assertion);
                                        SubLObject asserted_by = NIL;
                                        SubLObject asserted_when = NIL;
                                        if (NIL != assertions_high.asserted_assertionP(assertion)) {
                                            asserted_by = assertions_high.asserted_by(assertion);
                                            asserted_when = assertions_high.asserted_when(assertion);
                                            if (NIL != asserted_by) {
                                                asserted_by = cycl_to_kif(asserted_by);
                                            }
                                        }
                                        if ((NIL != kif_formula) && (NIL != kif_mt)) {
                                            return list(new SubLObject[]{ $DIRECTION, direction, $MONOTONICITY, strength, $MICROTHEORY, kif_mt, $CREATOR, asserted_by, $CREATION_DATE, asserted_when, $KIF, kif_formula });
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Convert one CycL ASSERTION into a KIF assertion-spec
     */
    @LispMethod(comment = "Convert one CycL ASSERTION into a KIF assertion-spec")
    public static SubLObject assertion_kif_formula(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        if (NIL != assertions_high.valid_assertion(assertion, UNPROVIDED)) {
            final SubLObject el_formula = uncanonicalizer.assertion_el_formula(assertion);
            if (NIL != el_formula) {
                final SubLObject kif_formula = cycl_to_kif(el_formula);
                if (NIL != kif_formula) {
                    final SubLObject mt = assertions_high.assertion_mt(assertion);
                    final SubLObject kif_mt = cycl_to_kif(mt);
                    if (NIL != kif_mt) {
                        final SubLObject direction = assertions_high.assertion_direction(assertion);
                        final SubLObject strength = assertions_high.assertion_strength(assertion);
                        SubLObject asserted_by = NIL;
                        SubLObject asserted_when = NIL;
                        if (NIL != assertions_high.asserted_assertionP(assertion)) {
                            asserted_by = assertions_high.asserted_by(assertion);
                            asserted_when = assertions_high.asserted_when(assertion);
                            if (NIL != asserted_by) {
                                asserted_by = cycl_to_kif(asserted_by);
                            }
                        }
                        if ((NIL != kif_formula) && (NIL != kif_mt)) {
                            return list(new SubLObject[]{ $DIRECTION, direction, $MONOTONICITY, strength, $MICROTHEORY, kif_mt, $CREATOR, asserted_by, $CREATION_DATE, asserted_when, $KIF, kif_formula });
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Given a MELD formula, return a list of equivalent KIF formulas.
     */
    @LispMethod(comment = "Given a MELD formula, return a list of equivalent KIF formulas.")
    public static final SubLObject meld_to_kif_alt(SubLObject meld) {
        return cycl_to_kif(meld);
    }

    /**
     * Given a MELD formula, return a list of equivalent KIF formulas.
     */
    @LispMethod(comment = "Given a MELD formula, return a list of equivalent KIF formulas.")
    public static SubLObject meld_to_kif(final SubLObject meld) {
        return cycl_to_kif(meld);
    }

    /**
     * Given a CycL formula, return a list of equivalent KIF formulas.
     */
    @LispMethod(comment = "Given a CycL formula, return a list of equivalent KIF formulas.")
    public static final SubLObject cycl_to_kif_alt(SubLObject cycl) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_answer = NIL;
                SubLObject catch_var = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = $additional_kif_definitions$.currentBinding(thread);
                        SubLObject _prev_bind_1 = $within_cycl_to_kif$.currentBinding(thread);
                        try {
                            $additional_kif_definitions$.bind(NIL, thread);
                            $within_cycl_to_kif$.bind(T, thread);
                            {
                                SubLObject v_kif = cycl_formula_to_kif(cycl);
                                SubLObject definitions = additional_kif_definitions();
                                if (NIL != definitions) {
                                    v_answer = bq_cons(v_kif, append(definitions, NIL));
                                } else {
                                    v_answer = v_kif;
                                }
                            }
                        } finally {
                            $within_cycl_to_kif$.rebind(_prev_bind_1, thread);
                            $additional_kif_definitions$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var = Errors.handleThrowable(ccatch_env_var, $ABORT_CYCL_TO_KIF);
                }
                return v_answer;
            }
        }
    }

    /**
     * Given a CycL formula, return a list of equivalent KIF formulas.
     */
    @LispMethod(comment = "Given a CycL formula, return a list of equivalent KIF formulas.")
    public static SubLObject cycl_to_kif(final SubLObject cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        SubLObject catch_var = NIL;
        try {
            thread.throwStack.push($ABORT_CYCL_TO_KIF);
            final SubLObject _prev_bind_0 = $additional_kif_definitions$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $within_cycl_to_kif$.currentBinding(thread);
            try {
                $additional_kif_definitions$.bind(NIL, thread);
                $within_cycl_to_kif$.bind(T, thread);
                final SubLObject v_kif = cycl_formula_to_kif(cycl);
                final SubLObject definitions = additional_kif_definitions();
                if (NIL != definitions) {
                    v_answer = bq_cons(v_kif, append(definitions, NIL));
                } else {
                    v_answer = v_kif;
                }
            } finally {
                $within_cycl_to_kif$.rebind(_prev_bind_2, thread);
                $additional_kif_definitions$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var = Errors.handleThrowable(ccatch_env_var, $ABORT_CYCL_TO_KIF);
        } finally {
            thread.throwStack.pop();
        }
        return v_answer;
    }

    public static final SubLObject write_kb_to_kif_file_preamble_alt(SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return format(stream, $kb_to_kif_file_preamble$.getDynamicValue(thread), numeric_date_utilities.timestring(UNPROVIDED));
        }
    }

    public static SubLObject write_kb_to_kif_file_preamble(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return format(stream, $kb_to_kif_file_preamble$.getDynamicValue(thread), numeric_date_utilities.timestring(UNPROVIDED));
    }

    public static final SubLObject write_mt_to_kif_file_preamble_alt(SubLObject mt, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return format(stream, $mt_to_kif_file_preamble$.getDynamicValue(thread), mt, numeric_date_utilities.timestring(UNPROVIDED));
        }
    }

    public static SubLObject write_mt_to_kif_file_preamble(final SubLObject mt, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return format(stream, $mt_to_kif_file_preamble$.getDynamicValue(thread), mt, numeric_date_utilities.timestring(UNPROVIDED));
    }

    /**
     * output KIF print-string in mixed case
     */
    @LispMethod(comment = "output KIF print-string in mixed case")
    public static final SubLObject write_kif_term_mixed_case_alt(SubLObject print_string, SubLObject stream) {
        return princ(print_string, stream);
    }

    /**
     * output KIF print-string in mixed case
     */
    @LispMethod(comment = "output KIF print-string in mixed case")
    public static SubLObject write_kif_term_mixed_case(final SubLObject print_string, final SubLObject stream) {
        return princ(print_string, stream);
    }

    /**
     * output KIF print-string in uppercase
     */
    @LispMethod(comment = "output KIF print-string in uppercase")
    public static final SubLObject write_kif_term_upcase_alt(SubLObject print_string, SubLObject stream) {
        {
            SubLObject cdotimes_end_var = length(print_string);
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                write_char(char_upcase(Strings.sublisp_char(print_string, i)), stream);
            }
        }
        return print_string;
    }

    /**
     * output KIF print-string in uppercase
     */
    @LispMethod(comment = "output KIF print-string in uppercase")
    public static SubLObject write_kif_term_upcase(final SubLObject print_string, final SubLObject stream) {
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = length(print_string), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            write_char(char_upcase(Strings.sublisp_char(print_string, i)), stream);
        }
        return print_string;
    }

    /**
     * output KIF print-string in lowercase
     */
    @LispMethod(comment = "output KIF print-string in lowercase")
    public static final SubLObject write_kif_term_downcase_alt(SubLObject print_string, SubLObject stream) {
        {
            SubLObject cdotimes_end_var = length(print_string);
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                write_char(char_downcase(Strings.sublisp_char(print_string, i)), stream);
            }
        }
        return print_string;
    }

    /**
     * output KIF print-string in lowercase
     */
    @LispMethod(comment = "output KIF print-string in lowercase")
    public static SubLObject write_kif_term_downcase(final SubLObject print_string, final SubLObject stream) {
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = length(print_string), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            write_char(char_downcase(Strings.sublisp_char(print_string, i)), stream);
        }
        return print_string;
    }

    /**
     * output KIF print-string in hyphenated mixed case
     */
    @LispMethod(comment = "output KIF print-string in hyphenated mixed case")
    public static final SubLObject write_kif_term_hyphen_mixed_case_alt(SubLObject print_string, SubLObject stream) {
        return write_kif_term_hyphenate(print_string, stream, IDENTITY);
    }

    /**
     * output KIF print-string in hyphenated mixed case
     */
    @LispMethod(comment = "output KIF print-string in hyphenated mixed case")
    public static SubLObject write_kif_term_hyphen_mixed_case(final SubLObject print_string, final SubLObject stream) {
        return write_kif_term_hyphenate(print_string, stream, IDENTITY);
    }

    /**
     * output KIF print-string in hyphenated uppercase
     */
    @LispMethod(comment = "output KIF print-string in hyphenated uppercase")
    public static final SubLObject write_kif_term_hyphen_upcase_alt(SubLObject print_string, SubLObject stream) {
        return write_kif_term_hyphenate(print_string, stream, CHAR_UPCASE);
    }

    /**
     * output KIF print-string in hyphenated uppercase
     */
    @LispMethod(comment = "output KIF print-string in hyphenated uppercase")
    public static SubLObject write_kif_term_hyphen_upcase(final SubLObject print_string, final SubLObject stream) {
        return write_kif_term_hyphenate(print_string, stream, CHAR_UPCASE);
    }

    /**
     * output KIF print-string in hyphenated lowercase
     */
    @LispMethod(comment = "output KIF print-string in hyphenated lowercase")
    public static final SubLObject write_kif_term_hyphen_downcase_alt(SubLObject print_string, SubLObject stream) {
        return write_kif_term_hyphenate(print_string, stream, CHAR_DOWNCASE);
    }

    /**
     * output KIF print-string in hyphenated lowercase
     */
    @LispMethod(comment = "output KIF print-string in hyphenated lowercase")
    public static SubLObject write_kif_term_hyphen_downcase(final SubLObject print_string, final SubLObject stream) {
        return write_kif_term_hyphenate(print_string, stream, CHAR_DOWNCASE);
    }

    public static final SubLObject write_kif_term_hyphenate_alt(SubLObject print_string, SubLObject stream, SubLObject char_conversion_func) {
        {
            SubLObject length = length(print_string);
            SubLObject last_char = NIL;
            SubLObject this_char = NIL;
            SubLObject index = NIL;
            for (index = ZERO_INTEGER; !index.numE(length); index = add(index, ONE_INTEGER)) {
                last_char = this_char;
                this_char = Strings.sublisp_char(print_string, index);
                if (NIL != write_kif_term_insert_hyphen(last_char, this_char)) {
                    write_char(CHAR_hyphen, stream);
                }
                write_char(funcall(char_conversion_func, this_char), stream);
            }
            return print_string;
        }
    }

    public static SubLObject write_kif_term_hyphenate(final SubLObject print_string, final SubLObject stream, final SubLObject char_conversion_func) {
        final SubLObject length = length(print_string);
        SubLObject last_char = NIL;
        SubLObject this_char = NIL;
        SubLObject index;
        for (index = NIL, index = ZERO_INTEGER; !index.numE(length); index = add(index, ONE_INTEGER)) {
            last_char = this_char;
            this_char = Strings.sublisp_char(print_string, index);
            if (NIL != write_kif_term_insert_hyphen(last_char, this_char)) {
                write_char(CHAR_hyphen, stream);
            }
            write_char(funcall(char_conversion_func, this_char), stream);
        }
        return print_string;
    }

    /**
     * Return T iff a hyphen should be inserted between LAST-CHAR and THIS-CHAR
     */
    @LispMethod(comment = "Return T iff a hyphen should be inserted between LAST-CHAR and THIS-CHAR")
    public static final SubLObject write_kif_term_insert_hyphen_alt(SubLObject last_char, SubLObject this_char) {
        return makeBoolean(((NIL != last_char) && (NIL != this_char)) && ((((NIL != alpha_char_p(last_char)) && (NIL != digit_char_p(this_char, UNPROVIDED))) || ((NIL != digit_char_p(last_char, UNPROVIDED)) && (NIL != alpha_char_p(this_char)))) || ((NIL != lower_case_p(last_char)) && (NIL != upper_case_p(this_char)))));
    }

    /**
     * Return T iff a hyphen should be inserted between LAST-CHAR and THIS-CHAR
     */
    @LispMethod(comment = "Return T iff a hyphen should be inserted between LAST-CHAR and THIS-CHAR")
    public static SubLObject write_kif_term_insert_hyphen(final SubLObject last_char, final SubLObject this_char) {
        return makeBoolean(((NIL != last_char) && (NIL != this_char)) && ((((NIL != alpha_char_p(last_char)) && (NIL != digit_char_p(this_char, UNPROVIDED))) || ((NIL != digit_char_p(last_char, UNPROVIDED)) && (NIL != alpha_char_p(this_char)))) || ((NIL != lower_case_p(last_char)) && (NIL != upper_case_p(this_char)))));
    }

    /**
     * Note that a CycL to KIF error has occurred using FORMAT-STRING and args.
     */
    @LispMethod(comment = "Note that a CycL to KIF error has occurred using FORMAT-STRING and args.")
    public static final SubLObject cycl_to_kif_error_alt(SubLObject format_string, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = $cycl_to_kif_error_method$.getDynamicValue(thread);
                if (pcase_var.eql($ABORT)) {
                    abort_cycl_to_kif();
                } else {
                    if (pcase_var.eql($IGNORE)) {
                    } else {
                        if (pcase_var.eql($WARN)) {
                            funcall(symbol_function(WARN), format_string, arg1, arg2, arg3, arg4);
                        } else {
                            if (pcase_var.eql($CERROR)) {
                                funcall(symbol_function(CERROR), $$$Use_NIL, format_string, arg1, arg2, arg3, arg4);
                            } else {
                                if (pcase_var.eql($ERROR)) {
                                    funcall(symbol_function(ERROR), format_string, arg1, arg2, arg3, arg4);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Note that a CycL to KIF error has occurred using FORMAT-STRING and args.
     */
    @LispMethod(comment = "Note that a CycL to KIF error has occurred using FORMAT-STRING and args.")
    public static SubLObject cycl_to_kif_error(final SubLObject format_string, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = $cycl_to_kif_error_method$.getDynamicValue(thread);
        if (pcase_var.eql($ABORT)) {
            abort_cycl_to_kif();
        } else
            if (!pcase_var.eql($IGNORE)) {
                if (pcase_var.eql($WARN)) {
                    funcall(symbol_function(WARN), format_string, arg1, arg2, arg3, arg4);
                } else
                    if (pcase_var.eql($CERROR)) {
                        funcall(symbol_function(CERROR), $$$Use_NIL, format_string, arg1, arg2, arg3, arg4);
                    } else
                        if (pcase_var.eql($ERROR)) {
                            funcall(symbol_function(ERROR), format_string, arg1, arg2, arg3, arg4);
                        }


            }

        return NIL;
    }

    public static final SubLObject cycl_to_kif_check_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject v_object = NIL;
            SubLObject pred = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt56);
            v_object = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt56);
            pred = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(PUNLESS, $suspend_type_checkingP$, list(PUNLESS, list(pred, v_object), list(CYCL_TO_KIF_ERROR, $str_alt60$_A_is_not_a__A, v_object, list(QUOTE, pred))));
            } else {
                cdestructuring_bind_error(datum, $list_alt56);
            }
        }
        return NIL;
    }

    public static SubLObject cycl_to_kif_check(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_object = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list56);
        v_object = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list56);
        pred = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(PUNLESS, $suspend_type_checkingP$, list(PUNLESS, list(pred, v_object), list(CYCL_TO_KIF_ERROR, $str60$_A_is_not_a__A, v_object, list(QUOTE, pred))));
        }
        cdestructuring_bind_error(datum, $list56);
        return NIL;
    }

    public static final SubLObject register_kif_definition_alt(SubLObject kif_definition) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $within_cycl_to_kif$.getDynamicValue(thread)) {
                $additional_kif_definitions$.setDynamicValue(cons(kif_definition, $additional_kif_definitions$.getDynamicValue(thread)), thread);
                return T;
            }
            return NIL;
        }
    }

    public static SubLObject register_kif_definition(final SubLObject kif_definition) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $within_cycl_to_kif$.getDynamicValue(thread)) {
            $additional_kif_definitions$.setDynamicValue(cons(kif_definition, $additional_kif_definitions$.getDynamicValue(thread)), thread);
            return T;
        }
        return NIL;
    }

    public static final SubLObject additional_kif_definitions_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $within_cycl_to_kif$.getDynamicValue(thread)) {
                {
                    SubLObject definitions = $additional_kif_definitions$.getDynamicValue(thread);
                    return definitions;
                }
            }
            return NIL;
        }
    }

    public static SubLObject additional_kif_definitions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $within_cycl_to_kif$.getDynamicValue(thread)) {
            final SubLObject definitions = $additional_kif_definitions$.getDynamicValue(thread);
            return definitions;
        }
        return NIL;
    }

    public static final SubLObject kif_term_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_kif_term(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject kif_term_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_kif_term(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject kif_term_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.kif.$kif_term_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject kif_term_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.kif.$kif_term_native.class ? T : NIL;
    }

    public static final SubLObject kif_print_string_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, KIF_TERM_P);
        return v_object.getField2();
    }

    public static SubLObject kif_print_string(final SubLObject v_object) {
        assert NIL != kif_term_p(v_object) : "! kif.kif_term_p(v_object) " + "kif.kif_term_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject _csetf_kif_print_string_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, KIF_TERM_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_kif_print_string(final SubLObject v_object, final SubLObject value) {
        assert NIL != kif_term_p(v_object) : "! kif.kif_term_p(v_object) " + "kif.kif_term_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject make_kif_term_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.kif.$kif_term_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($PRINT_STRING)) {
                        _csetf_kif_print_string(v_new, current_value);
                    } else {
                        Errors.error($str_alt73$Invalid_slot__S_for_construction_, current_arg);
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_kif_term(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.kif.$kif_term_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($PRINT_STRING)) {
                _csetf_kif_print_string(v_new, current_value);
            } else {
                Errors.error($str74$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    public static SubLObject visit_defstruct_kif_term(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_KIF_TERM, ONE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $PRINT_STRING, kif_print_string(obj));
        funcall(visitor_fn, obj, $END, MAKE_KIF_TERM, ONE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_kif_term_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_kif_term(obj, visitor_fn);
    }

    public static final SubLObject sxhash_kif_term_method_alt(SubLObject v_object) {
        return Sxhash.sxhash(kif_print_string(v_object));
    }

    public static SubLObject sxhash_kif_term_method(final SubLObject v_object) {
        return Sxhash.sxhash(kif_print_string(v_object));
    }

    public static final SubLObject print_kif_term_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject print_string = kif_print_string(v_object);
                funcall($kif_term_print_method$.getDynamicValue(thread), print_string, stream);
            }
            return v_object;
        }
    }

    public static SubLObject print_kif_term(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject print_string = kif_print_string(v_object);
        funcall($kif_term_print_method$.getDynamicValue(thread), print_string, stream);
        return v_object;
    }

    /**
     * Declare that PRINT-STRING is the string to use for the KIF term associated with CYCL-TERM
     */
    @LispMethod(comment = "Declare that PRINT-STRING is the string to use for the KIF term associated with CYCL-TERM")
    public static final SubLObject cycl_to_kif_standard_mapping_alt(SubLObject cycl_term, SubLObject print_string) {
        if (NIL != $kif_term_table$.getGlobalValue()) {
            remhash(cycl_term, $kif_term_table$.getGlobalValue());
        }
        return intern_kif_term(cycl_term, print_string);
    }

    /**
     * Declare that PRINT-STRING is the string to use for the KIF term associated with CYCL-TERM
     */
    @LispMethod(comment = "Declare that PRINT-STRING is the string to use for the KIF term associated with CYCL-TERM")
    public static SubLObject cycl_to_kif_standard_mapping(final SubLObject cycl_term, final SubLObject print_string) {
        if (NIL != $kif_term_table$.getGlobalValue()) {
            remhash(cycl_term, $kif_term_table$.getGlobalValue());
        }
        return intern_kif_term(cycl_term, print_string);
    }

    /**
     * Return the KIF term for the given CYCL-TERM, or NIL if none currently exists.
     */
    @LispMethod(comment = "Return the KIF term for the given CYCL-TERM, or NIL if none currently exists.")
    public static final SubLObject find_kif_term_alt(SubLObject cycl_term) {
        if (NIL != $kif_term_table$.getGlobalValue()) {
            return values(gethash(cycl_term, $kif_term_table$.getGlobalValue(), UNPROVIDED));
        }
        return NIL;
    }

    /**
     * Return the KIF term for the given CYCL-TERM, or NIL if none currently exists.
     */
    @LispMethod(comment = "Return the KIF term for the given CYCL-TERM, or NIL if none currently exists.")
    public static SubLObject find_kif_term(final SubLObject cycl_term) {
        if (NIL != $kif_term_table$.getGlobalValue()) {
            return values(gethash(cycl_term, $kif_term_table$.getGlobalValue(), UNPROVIDED));
        }
        return NIL;
    }

    /**
     * Return the KIF term for the given CYCL-TERM.
     * If none already exists, create and use a new KIF term with PRINT-STRING as its print string.
     */
    @LispMethod(comment = "Return the KIF term for the given CYCL-TERM.\r\nIf none already exists, create and use a new KIF term with PRINT-STRING as its print string.\nReturn the KIF term for the given CYCL-TERM.\nIf none already exists, create and use a new KIF term with PRINT-STRING as its print string.")
    public static final SubLObject intern_kif_term_alt(SubLObject cycl_term, SubLObject print_string) {
        if (print_string == UNPROVIDED) {
            print_string = NIL;
        }
        {
            SubLObject kif_term = find_kif_term(cycl_term);
            if (NIL == kif_term) {
                kif_term = new_kif_term(string_for_kif_term(cycl_term, print_string));
                note_kif_term(cycl_term, kif_term);
            }
            return kif_term;
        }
    }

    /**
     * Return the KIF term for the given CYCL-TERM.
     * If none already exists, create and use a new KIF term with PRINT-STRING as its print string.
     */
    @LispMethod(comment = "Return the KIF term for the given CYCL-TERM.\r\nIf none already exists, create and use a new KIF term with PRINT-STRING as its print string.\nReturn the KIF term for the given CYCL-TERM.\nIf none already exists, create and use a new KIF term with PRINT-STRING as its print string.")
    public static SubLObject intern_kif_term(final SubLObject cycl_term, SubLObject print_string) {
        if (print_string == UNPROVIDED) {
            print_string = NIL;
        }
        SubLObject kif_term = find_kif_term(cycl_term);
        if (NIL == kif_term) {
            kif_term = new_kif_term(string_for_kif_term(cycl_term, print_string));
            note_kif_term(cycl_term, kif_term);
        }
        return kif_term;
    }

    /**
     * Note that the translation object for CYCL-TERM is KIF-TERM
     */
    @LispMethod(comment = "Note that the translation object for CYCL-TERM is KIF-TERM")
    public static final SubLObject note_kif_term_alt(SubLObject cycl_term, SubLObject kif_term) {
        SubLTrampolineFile.checkType(kif_term, KIF_TERM_P);
        if (NIL == $kif_term_table$.getGlobalValue()) {
            $kif_term_table$.setGlobalValue(make_hash_table(constant_count(), UNPROVIDED, UNPROVIDED));
        }
        sethash(cycl_term, $kif_term_table$.getGlobalValue(), kif_term);
        return kif_term;
    }

    /**
     * Note that the translation object for CYCL-TERM is KIF-TERM
     */
    @LispMethod(comment = "Note that the translation object for CYCL-TERM is KIF-TERM")
    public static SubLObject note_kif_term(final SubLObject cycl_term, final SubLObject kif_term) {
        assert NIL != kif_term_p(kif_term) : "! kif.kif_term_p(kif_term) " + ("kif.kif_term_p(kif_term) " + "CommonSymbols.NIL != kif.kif_term_p(kif_term) ") + kif_term;
        if (NIL == $kif_term_table$.getGlobalValue()) {
            $kif_term_table$.setGlobalValue(make_hash_table(constant_count(), UNPROVIDED, UNPROVIDED));
        }
        sethash(cycl_term, $kif_term_table$.getGlobalValue(), kif_term);
        return kif_term;
    }

    public static final SubLObject new_kif_term_alt(SubLObject print_string) {
        {
            SubLObject kif_term = make_kif_term(UNPROVIDED);
            _csetf_kif_print_string(kif_term, print_string);
            return kif_term;
        }
    }

    public static SubLObject new_kif_term(final SubLObject print_string) {
        final SubLObject kif_term = make_kif_term(UNPROVIDED);
        _csetf_kif_print_string(kif_term, print_string);
        return kif_term;
    }

    public static final SubLObject string_for_kif_term_alt(SubLObject cycl_term, SubLObject print_string) {
        if (print_string == UNPROVIDED) {
            print_string = NIL;
        }
        if (print_string.isString()) {
            return print_string;
        } else {
            if (NIL != constant_p(cycl_term)) {
                return constants_high.constant_name(cycl_term);
            } else {
                if (cycl_term.isString()) {
                    return cycl_term;
                } else {
                    if (cycl_term.isSymbol()) {
                        return symbol_name(cycl_term);
                    } else {
                        return princ_to_string(cycl_term);
                    }
                }
            }
        }
    }

    public static SubLObject string_for_kif_term(final SubLObject cycl_term, SubLObject print_string) {
        if (print_string == UNPROVIDED) {
            print_string = NIL;
        }
        if (print_string.isString()) {
            return print_string;
        }
        if (NIL != constant_p(cycl_term)) {
            return constants_high.constant_name(cycl_term);
        }
        if (cycl_term.isString()) {
            return cycl_term;
        }
        if (cycl_term.isSymbol()) {
            return symbol_name(cycl_term);
        }
        return princ_to_string(cycl_term);
    }

    /**
     * Return the KIF translation method for CYCL-TERM, or NIL if none exists.
     */
    @LispMethod(comment = "Return the KIF translation method for CYCL-TERM, or NIL if none exists.")
    public static final SubLObject cycl_to_kif_method_alt(SubLObject cycl_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != $cycl_to_kif_method_table$.getDynamicValue(thread)) && (NIL != cycl_to_kif_functor_p(cycl_term))) {
                return gethash(cycl_to_kif_functor_string(cycl_term), $cycl_to_kif_method_table$.getDynamicValue(thread), UNPROVIDED);
            }
            return NIL;
        }
    }

    /**
     * Return the KIF translation method for CYCL-TERM, or NIL if none exists.
     */
    @LispMethod(comment = "Return the KIF translation method for CYCL-TERM, or NIL if none exists.")
    public static SubLObject cycl_to_kif_method(final SubLObject cycl_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != $cycl_to_kif_method_table$.getDynamicValue(thread)) && (NIL != cycl_to_kif_functor_p(cycl_term))) {
            return gethash(cycl_to_kif_functor_string(cycl_term), $cycl_to_kif_method_table$.getDynamicValue(thread), UNPROVIDED);
        }
        return NIL;
    }

    /**
     * Declare the function binding of FUNCTION-SYMBOL as a translation method for CYCL-TERM.
     */
    @LispMethod(comment = "Declare the function binding of FUNCTION-SYMBOL as a translation method for CYCL-TERM.")
    public static final SubLObject register_cycl_to_kif_method_alt(SubLObject cycl_term, SubLObject function_symbol) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(cycl_term, CYCL_TO_KIF_FUNCTOR_P);
            SubLTrampolineFile.checkType(function_symbol, SYMBOLP);
            if (NIL == $cycl_to_kif_method_table$.getDynamicValue(thread)) {
                $cycl_to_kif_method_table$.setDynamicValue(make_hash_table($int$50, UNPROVIDED, UNPROVIDED), thread);
            }
            sethash(cycl_to_kif_functor_string(cycl_term), $cycl_to_kif_method_table$.getDynamicValue(thread), function_symbol);
            return function_symbol;
        }
    }

    /**
     * Declare the function binding of FUNCTION-SYMBOL as a translation method for CYCL-TERM.
     */
    @LispMethod(comment = "Declare the function binding of FUNCTION-SYMBOL as a translation method for CYCL-TERM.")
    public static SubLObject register_cycl_to_kif_method(final SubLObject cycl_term, final SubLObject function_symbol) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cycl_to_kif_functor_p(cycl_term) : "! kif.cycl_to_kif_functor_p(cycl_term) " + ("kif.cycl_to_kif_functor_p(cycl_term) " + "CommonSymbols.NIL != kif.cycl_to_kif_functor_p(cycl_term) ") + cycl_term;
        assert NIL != symbolp(function_symbol) : "! symbolp(function_symbol) " + ("Types.symbolp(function_symbol) " + "CommonSymbols.NIL != Types.symbolp(function_symbol) ") + function_symbol;
        if (NIL == $cycl_to_kif_method_table$.getDynamicValue(thread)) {
            $cycl_to_kif_method_table$.setDynamicValue(make_hash_table($int$50, UNPROVIDED, UNPROVIDED), thread);
        }
        sethash(cycl_to_kif_functor_string(cycl_term), $cycl_to_kif_method_table$.getDynamicValue(thread), function_symbol);
        return function_symbol;
    }

    /**
     * Undeclare any translation method for CYCL-TERM.
     */
    @LispMethod(comment = "Undeclare any translation method for CYCL-TERM.")
    public static final SubLObject deregister_cycl_to_kif_method_alt(SubLObject cycl_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(cycl_term, CYCL_TO_KIF_FUNCTOR_P);
            if (NIL != $cycl_to_kif_method_table$.getDynamicValue(thread)) {
                return remhash(cycl_to_kif_functor_string(cycl_term), $cycl_to_kif_method_table$.getDynamicValue(thread));
            }
            return NIL;
        }
    }

    /**
     * Undeclare any translation method for CYCL-TERM.
     */
    @LispMethod(comment = "Undeclare any translation method for CYCL-TERM.")
    public static SubLObject deregister_cycl_to_kif_method(final SubLObject cycl_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cycl_to_kif_functor_p(cycl_term) : "! kif.cycl_to_kif_functor_p(cycl_term) " + ("kif.cycl_to_kif_functor_p(cycl_term) " + "CommonSymbols.NIL != kif.cycl_to_kif_functor_p(cycl_term) ") + cycl_term;
        if (NIL != $cycl_to_kif_method_table$.getDynamicValue(thread)) {
            return remhash(cycl_to_kif_functor_string(cycl_term), $cycl_to_kif_method_table$.getDynamicValue(thread));
        }
        return NIL;
    }

    public static final SubLObject cycl_to_kif_functor_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != constant_p(v_object)) || (NIL != predefined_kif_symbol(v_object)));
    }

    public static SubLObject cycl_to_kif_functor_p(final SubLObject v_object) {
        return makeBoolean((NIL != constant_p(v_object)) || (NIL != predefined_kif_symbol(v_object)));
    }

    public static final SubLObject predefined_kif_symbol_alt(SubLObject v_object) {
        return makeBoolean(((v_object.isSymbol() && (!v_object.isKeyword())) && (NIL == cycl_variables.el_varP(v_object))) && (NIL != find_kif_term(v_object)));
    }

    public static SubLObject predefined_kif_symbol(final SubLObject v_object) {
        return makeBoolean(((v_object.isSymbol() && (!v_object.isKeyword())) && (NIL == cycl_variables.el_varP(v_object))) && (NIL != find_kif_term(v_object)));
    }

    public static final SubLObject cycl_to_kif_functor_string_alt(SubLObject functor) {
        SubLTrampolineFile.checkType(functor, CYCL_TO_KIF_FUNCTOR_P);
        if (NIL != constant_p(functor)) {
            return constants_high.constant_name(functor);
        } else {
            if (functor.isSymbol()) {
                return symbol_name(functor);
            }
        }
        return NIL;
    }

    public static SubLObject cycl_to_kif_functor_string(final SubLObject functor) {
        assert NIL != cycl_to_kif_functor_p(functor) : "! kif.cycl_to_kif_functor_p(functor) " + ("kif.cycl_to_kif_functor_p(functor) " + "CommonSymbols.NIL != kif.cycl_to_kif_functor_p(functor) ") + functor;
        if (NIL != constant_p(functor)) {
            return constants_high.constant_name(functor);
        }
        if (functor.isSymbol()) {
            return symbol_name(functor);
        }
        return NIL;
    }

    /**
     * Define a CycL to KIF translation method for CYCL-TERM.
     */
    @LispMethod(comment = "Define a CycL to KIF translation method for CYCL-TERM.")
    public static final SubLObject define_cycl_to_kif_method_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject cycl_term = NIL;
            SubLObject arglist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt79);
            cycl_term = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt79);
            arglist = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject name = Strings.string_upcase(NIL != constant_p(cycl_term) ? ((SubLObject) (constants_high.constant_name(cycl_term))) : cycl_term.isSymbol() ? ((SubLObject) (symbol_name(cycl_term))) : NIL, UNPROVIDED, UNPROVIDED);
                SubLObject function_name = format(NIL, $str_alt80$CYCL_TO_KIF__A_METHOD, name);
                SubLObject function = intern(function_name, UNPROVIDED);
                return list(PROGN, listS(DEFINE_PRIVATE, function, arglist, append(body, NIL)), list(REGISTER_CYCL_TO_KIF_METHOD, list(QUOTE, cycl_term), list(QUOTE, function)));
            }
        }
    }

    /**
     * Define a CycL to KIF translation method for CYCL-TERM.
     */
    @LispMethod(comment = "Define a CycL to KIF translation method for CYCL-TERM.")
    public static SubLObject define_cycl_to_kif_method(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject cycl_term = NIL;
        SubLObject arglist = NIL;
        destructuring_bind_must_consp(current, datum, $list85);
        cycl_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list85);
        arglist = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject name = Strings.string_upcase(NIL != constant_p(cycl_term) ? constants_high.constant_name(cycl_term) : cycl_term.isSymbol() ? symbol_name(cycl_term) : NIL, UNPROVIDED, UNPROVIDED);
        final SubLObject function_name = format(NIL, $str86$CYCL_TO_KIF__A_METHOD, name);
        final SubLObject function = intern(function_name, UNPROVIDED);
        return list(PROGN, listS(DEFINE_PRIVATE, function, arglist, append(body, NIL)), list(REGISTER_CYCL_TO_KIF_METHOD, list(QUOTE, cycl_term), list(QUOTE, function)));
    }

    /**
     * Translate a CycL FORMULA to KIF.
     */
    @LispMethod(comment = "Translate a CycL FORMULA to KIF.")
    public static final SubLObject cycl_formula_to_kif_alt(SubLObject formula) {
        if (formula.isAtom()) {
            return cycl_1_term_to_kif(formula);
        } else {
            {
                SubLObject functor = formula.first();
                SubLObject method = cycl_to_kif_method(functor);
                if (NIL != method) {
                    return funcall(method, formula);
                } else {
                    return cycl_atomic_sentence_to_kif(formula);
                }
            }
        }
    }

    /**
     * Translate a CycL FORMULA to KIF.
     */
    @LispMethod(comment = "Translate a CycL FORMULA to KIF.")
    public static SubLObject cycl_formula_to_kif(final SubLObject formula) {
        if (formula.isAtom()) {
            return cycl_1_term_to_kif(formula);
        }
        final SubLObject functor = formula.first();
        final SubLObject method = cycl_to_kif_method(functor);
        if (NIL != method) {
            return funcall(method, formula);
        }
        return cycl_atomic_sentence_to_kif(formula);
    }

    /**
     * Translate a CycL ATOMIC-SENTENCE to KIF.
     */
    @LispMethod(comment = "Translate a CycL ATOMIC-SENTENCE to KIF.")
    public static final SubLObject cycl_atomic_sentence_to_kif_alt(SubLObject atomic_sentence) {
        {
            SubLObject datum = atomic_sentence;
            SubLObject current = datum;
            SubLObject predicate = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt84);
            predicate = current.first();
            current = current.rest();
            {
                SubLObject v_arguments = current;
                predicate = cycl_rep_1_term_to_kif(predicate);
                v_arguments = cycl_atomic_sentence_args_to_kif(v_arguments);
                if (NIL != list_utilities.tree_find_if(symbol_function($sym85$EL_VAR_), predicate, UNPROVIDED)) {
                    {
                        SubLObject true_sentence = cycl_constant_to_kif($$trueSentence);
                        return list(true_sentence, bq_cons(predicate, append(v_arguments, NIL)));
                    }
                } else {
                    return bq_cons(predicate, append(v_arguments, NIL));
                }
            }
        }
    }

    /**
     * Translate a CycL ATOMIC-SENTENCE to KIF.
     */
    @LispMethod(comment = "Translate a CycL ATOMIC-SENTENCE to KIF.")
    public static SubLObject cycl_atomic_sentence_to_kif(final SubLObject atomic_sentence) {
        SubLObject predicate = NIL;
        destructuring_bind_must_consp(atomic_sentence, atomic_sentence, $list90);
        predicate = atomic_sentence.first();
        SubLObject v_arguments;
        final SubLObject current = v_arguments = atomic_sentence.rest();
        predicate = cycl_rep_1_term_to_kif(predicate);
        v_arguments = cycl_atomic_sentence_args_to_kif(v_arguments);
        if (NIL != list_utilities.tree_find_if(symbol_function($sym91$EL_VAR_), predicate, UNPROVIDED)) {
            final SubLObject true_sentence = cycl_constant_to_kif($$trueSentence);
            return list(true_sentence, bq_cons(predicate, append(v_arguments, NIL)));
        }
        return bq_cons(predicate, append(v_arguments, NIL));
    }

    /**
     * Translate the ARGUMENTS of a CycL atomic-sentence to KIF.
     */
    @LispMethod(comment = "Translate the ARGUMENTS of a CycL atomic-sentence to KIF.")
    public static final SubLObject cycl_atomic_sentence_args_to_kif_alt(SubLObject v_arguments) {
        if (NIL != list_utilities.proper_list_p(v_arguments)) {
            return Mapping.mapcar(symbol_function(CYCL_2_TERM_TO_KIF), v_arguments);
        } else {
            return cycl_atomic_sentence_args_to_kif_recursive(v_arguments);
        }
    }

    /**
     * Translate the ARGUMENTS of a CycL atomic-sentence to KIF.
     */
    @LispMethod(comment = "Translate the ARGUMENTS of a CycL atomic-sentence to KIF.")
    public static SubLObject cycl_atomic_sentence_args_to_kif(final SubLObject v_arguments) {
        if (NIL != list_utilities.proper_list_p(v_arguments)) {
            return Mapping.mapcar(symbol_function(CYCL_2_TERM_TO_KIF), v_arguments);
        }
        return cycl_atomic_sentence_args_to_kif_recursive(v_arguments);
    }

    /**
     * Recursive version of cycl-atomic-sentence-args-to-kif that handles sequence variables.
     */
    @LispMethod(comment = "Recursive version of cycl-atomic-sentence-args-to-kif that handles sequence variables.")
    public static final SubLObject cycl_atomic_sentence_args_to_kif_recursive_alt(SubLObject v_arguments) {
        if (NIL == v_arguments) {
            return NIL;
        } else {
            if (NIL != cycl_variables.el_varP(v_arguments)) {
                return list(cycl_dotted_el_var_to_kif(v_arguments));
            } else {
                if (v_arguments.isAtom()) {
                    cycl_to_kif_error($str_alt88$Expecting_a_variable___S, v_arguments, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    {
                        SubLObject first = cycl_2_term_to_kif(v_arguments.first());
                        SubLObject rest = cycl_atomic_sentence_args_to_kif_recursive(v_arguments.rest());
                        return bq_cons(first, append(rest, NIL));
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Recursive version of cycl-atomic-sentence-args-to-kif that handles sequence variables.
     */
    @LispMethod(comment = "Recursive version of cycl-atomic-sentence-args-to-kif that handles sequence variables.")
    public static SubLObject cycl_atomic_sentence_args_to_kif_recursive(final SubLObject v_arguments) {
        if (NIL == v_arguments) {
            return NIL;
        }
        if (NIL != cycl_variables.el_varP(v_arguments)) {
            return list(cycl_dotted_el_var_to_kif(v_arguments));
        }
        if (v_arguments.isAtom()) {
            cycl_to_kif_error($str94$Expecting_a_variable___S, v_arguments, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        final SubLObject first = cycl_2_term_to_kif(v_arguments.first());
        final SubLObject rest = cycl_atomic_sentence_args_to_kif_recursive(v_arguments.rest());
        return bq_cons(first, append(rest, NIL));
    }

    /**
     * Translate a CycL 2nd order TERM to KIF.
     */
    @LispMethod(comment = "Translate a CycL 2nd order TERM to KIF.")
    public static final SubLObject cycl_2_term_to_kif_alt(SubLObject v_term) {
        return cycl_1_term_to_kif(v_term);
    }

    /**
     * Translate a CycL 2nd order TERM to KIF.
     */
    @LispMethod(comment = "Translate a CycL 2nd order TERM to KIF.")
    public static SubLObject cycl_2_term_to_kif(final SubLObject v_term) {
        return cycl_1_term_to_kif(v_term);
    }

    /**
     * Translate a CycL 1st order TERM to KIF.
     */
    @LispMethod(comment = "Translate a CycL 1st order TERM to KIF.")
    public static final SubLObject cycl_1_term_to_kif_alt(SubLObject v_term) {
        if ((v_term.isString() || v_term.isNumber()) || v_term.isChar()) {
            return v_term;
        } else {
            if (v_term.isSymbol() && (v_term.isKeyword() || ((NIL == cycl_variables.el_varP(v_term)) && (NIL == find_kif_term(v_term))))) {
                return v_term;
            } else {
                return cycl_rep_1_term_to_kif(v_term);
            }
        }
    }

    /**
     * Translate a CycL 1st order TERM to KIF.
     */
    @LispMethod(comment = "Translate a CycL 1st order TERM to KIF.")
    public static SubLObject cycl_1_term_to_kif(final SubLObject v_term) {
        if ((v_term.isString() || v_term.isNumber()) || v_term.isChar()) {
            return v_term;
        }
        if (v_term.isSymbol() && (v_term.isKeyword() || ((NIL == cycl_variables.el_varP(v_term)) && (NIL == find_kif_term(v_term))))) {
            return v_term;
        }
        return cycl_rep_1_term_to_kif(v_term);
    }

    /**
     * Translate a CycL 1st order represented TERM to KIF.
     */
    @LispMethod(comment = "Translate a CycL 1st order represented TERM to KIF.")
    public static final SubLObject cycl_rep_1_term_to_kif_alt(SubLObject v_term) {
        if (NIL != constant_p(v_term)) {
            return cycl_constant_to_kif(v_term);
        } else {
            if (NIL != nart_handles.nart_p(v_term)) {
                return cycl_rep_1_term_to_kif(narts_high.nart_el_formula(v_term));
            } else {
                if (NIL != cycl_variables.el_varP(v_term)) {
                    return cycl_el_variable_to_kif(v_term);
                } else {
                    if (v_term.isCons()) {
                        {
                            SubLObject function = v_term.first();
                            SubLObject method = cycl_to_kif_method(function);
                            if (NIL != method) {
                                return funcall(method, v_term);
                            } else {
                                return cycl_function_exp_to_kif(v_term);
                            }
                        }
                    } else {
                        if ((v_term.isSymbol() && (!v_term.isKeyword())) && (NIL != find_kif_term(v_term))) {
                            return find_kif_term(v_term);
                        } else {
                            cycl_to_kif_error($str_alt89$Invalid_represented_first_order_t, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Translate a CycL 1st order represented TERM to KIF.
     */
    @LispMethod(comment = "Translate a CycL 1st order represented TERM to KIF.")
    public static SubLObject cycl_rep_1_term_to_kif(final SubLObject v_term) {
        if (NIL != constant_p(v_term)) {
            return cycl_constant_to_kif(v_term);
        }
        if (NIL != nart_handles.nart_p(v_term)) {
            return cycl_rep_1_term_to_kif(narts_high.nart_el_formula(v_term));
        }
        if (NIL != cycl_variables.el_varP(v_term)) {
            return cycl_el_variable_to_kif(v_term);
        }
        if (v_term.isCons()) {
            final SubLObject function = v_term.first();
            final SubLObject method = cycl_to_kif_method(function);
            if (NIL != method) {
                return funcall(method, v_term);
            }
            return cycl_function_exp_to_kif(v_term);
        } else {
            if ((v_term.isSymbol() && (!v_term.isKeyword())) && (NIL != find_kif_term(v_term))) {
                return find_kif_term(v_term);
            }
            cycl_to_kif_error($str95$Invalid_represented_first_order_t, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
    }

    /**
     * Translate a CycL FUNCTION-EXPRESSION to KIF.
     */
    @LispMethod(comment = "Translate a CycL FUNCTION-EXPRESSION to KIF.")
    public static final SubLObject cycl_function_exp_to_kif_alt(SubLObject function_expression) {
        {
            SubLObject datum = function_expression;
            SubLObject current = datum;
            SubLObject function = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt90);
            function = current.first();
            current = current.rest();
            {
                SubLObject v_arguments = current;
                return cons(cycl_rep_1_term_to_kif(function), cycl_function_exp_args_to_kif(v_arguments));
            }
        }
    }

    /**
     * Translate a CycL FUNCTION-EXPRESSION to KIF.
     */
    @LispMethod(comment = "Translate a CycL FUNCTION-EXPRESSION to KIF.")
    public static SubLObject cycl_function_exp_to_kif(final SubLObject function_expression) {
        SubLObject function = NIL;
        destructuring_bind_must_consp(function_expression, function_expression, $list96);
        function = function_expression.first();
        final SubLObject v_arguments;
        final SubLObject current = v_arguments = function_expression.rest();
        return cons(cycl_rep_1_term_to_kif(function), cycl_function_exp_args_to_kif(v_arguments));
    }

    /**
     * Translate the ARGUMENTS of a CycL function-expression to KIF.
     */
    @LispMethod(comment = "Translate the ARGUMENTS of a CycL function-expression to KIF.")
    public static final SubLObject cycl_function_exp_args_to_kif_alt(SubLObject v_arguments) {
        if (NIL != list_utilities.proper_list_p(v_arguments)) {
            return Mapping.mapcar(symbol_function(CYCL_2_TERM_TO_KIF), v_arguments);
        } else {
            return cycl_function_exp_args_to_kif_recursive(v_arguments);
        }
    }

    /**
     * Translate the ARGUMENTS of a CycL function-expression to KIF.
     */
    @LispMethod(comment = "Translate the ARGUMENTS of a CycL function-expression to KIF.")
    public static SubLObject cycl_function_exp_args_to_kif(final SubLObject v_arguments) {
        if (NIL != list_utilities.proper_list_p(v_arguments)) {
            return Mapping.mapcar(symbol_function(CYCL_2_TERM_TO_KIF), v_arguments);
        }
        return cycl_function_exp_args_to_kif_recursive(v_arguments);
    }

    /**
     * Recursive version of cycl-function-exp-args-to-kif that handles sequence variables.
     */
    @LispMethod(comment = "Recursive version of cycl-function-exp-args-to-kif that handles sequence variables.")
    public static final SubLObject cycl_function_exp_args_to_kif_recursive_alt(SubLObject v_arguments) {
        if (NIL == v_arguments) {
            return NIL;
        } else {
            if (NIL != cycl_variables.el_varP(v_arguments)) {
                return list(cycl_dotted_el_var_to_kif(v_arguments));
            } else {
                if (v_arguments.isAtom()) {
                    cycl_to_kif_error($str_alt88$Expecting_a_variable___S, v_arguments, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    {
                        SubLObject first = cycl_2_term_to_kif(v_arguments.first());
                        SubLObject rest = cycl_function_exp_args_to_kif_recursive(v_arguments.rest());
                        return bq_cons(first, append(rest, NIL));
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Recursive version of cycl-function-exp-args-to-kif that handles sequence variables.
     */
    @LispMethod(comment = "Recursive version of cycl-function-exp-args-to-kif that handles sequence variables.")
    public static SubLObject cycl_function_exp_args_to_kif_recursive(final SubLObject v_arguments) {
        if (NIL == v_arguments) {
            return NIL;
        }
        if (NIL != cycl_variables.el_varP(v_arguments)) {
            return list(cycl_dotted_el_var_to_kif(v_arguments));
        }
        if (v_arguments.isAtom()) {
            cycl_to_kif_error($str94$Expecting_a_variable___S, v_arguments, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        final SubLObject first = cycl_2_term_to_kif(v_arguments.first());
        final SubLObject rest = cycl_function_exp_args_to_kif_recursive(v_arguments.rest());
        return bq_cons(first, append(rest, NIL));
    }

    /**
     * Translate a CycL CONSTANT into KIF.
     */
    @LispMethod(comment = "Translate a CycL CONSTANT into KIF.")
    public static final SubLObject cycl_constant_to_kif_alt(SubLObject constant) {
        return intern_kif_term(constant, UNPROVIDED);
    }

    /**
     * Translate a CycL CONSTANT into KIF.
     */
    @LispMethod(comment = "Translate a CycL CONSTANT into KIF.")
    public static SubLObject cycl_constant_to_kif(final SubLObject constant) {
        return intern_kif_term(constant, UNPROVIDED);
    }

    /**
     * Translate a CycL EL-VARIABLE into KIF.
     */
    @LispMethod(comment = "Translate a CycL EL-VARIABLE into KIF.")
    public static final SubLObject cycl_el_variable_to_kif_alt(SubLObject el_variable) {
        return el_variable;
    }

    /**
     * Translate a CycL EL-VARIABLE into KIF.
     */
    @LispMethod(comment = "Translate a CycL EL-VARIABLE into KIF.")
    public static SubLObject cycl_el_variable_to_kif(final SubLObject el_variable) {
        return el_variable;
    }

    /**
     * Translate a dotted EL-VARIABLE ?FOO into a KIF sequence variable @FOO.
     */
    @LispMethod(comment = "Translate a dotted EL-VARIABLE ?FOO into a KIF sequence variable @FOO.")
    public static final SubLObject cycl_dotted_el_var_to_kif_alt(SubLObject el_variable) {
        {
            SubLObject name = string_utilities.copy_string(symbol_name(el_variable));
            Strings.set_char(name, ZERO_INTEGER, CHAR_at);
            return values(intern(name, UNPROVIDED));
        }
    }

    /**
     * Translate a dotted EL-VARIABLE ?FOO into a KIF sequence variable @FOO.
     */
    @LispMethod(comment = "Translate a dotted EL-VARIABLE ?FOO into a KIF sequence variable @FOO.")
    public static SubLObject cycl_dotted_el_var_to_kif(final SubLObject el_variable) {
        final SubLObject name = string_utilities.copy_string(symbol_name(el_variable));
        Strings.set_char(name, ZERO_INTEGER, CHAR_at);
        return values(intern(name, UNPROVIDED));
    }

    /**
     * KIF translator for #$not
     */
    @LispMethod(comment = "KIF translator for #$not")
    public static final SubLObject cycl_to_kif_not_method_alt(SubLObject formula) {
        {
            SubLObject datum = formula;
            SubLObject current = datum;
            SubLObject not = NIL;
            SubLObject subformula = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt97);
            not = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt97);
            subformula = current.first();
            current = current.rest();
            if (NIL == current) {
                not = cycl_constant_to_kif($$not);
                subformula = cycl_formula_to_kif(subformula);
                return list(not, subformula);
            } else {
                cdestructuring_bind_error(datum, $list_alt97);
            }
        }
        return NIL;
    }

    /**
     * KIF translator for #$not
     */
    @LispMethod(comment = "KIF translator for #$not")
    public static SubLObject cycl_to_kif_not_method(final SubLObject formula) {
        SubLObject not = NIL;
        SubLObject subformula = NIL;
        destructuring_bind_must_consp(formula, formula, $list103);
        not = formula.first();
        SubLObject current = formula.rest();
        destructuring_bind_must_consp(current, formula, $list103);
        subformula = current.first();
        current = current.rest();
        if (NIL == current) {
            not = cycl_constant_to_kif($$not);
            subformula = cycl_formula_to_kif(subformula);
            return list(not, subformula);
        }
        cdestructuring_bind_error(formula, $list103);
        return NIL;
    }

    /**
     * KIF translator for #$and
     */
    @LispMethod(comment = "KIF translator for #$and")
    public static final SubLObject cycl_to_kif_and_method_alt(SubLObject formula) {
        {
            SubLObject datum = formula;
            SubLObject current = datum;
            SubLObject and = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt101);
            and = current.first();
            current = current.rest();
            {
                SubLObject subformulas = current;
                and = cycl_constant_to_kif($$and);
                subformulas = Mapping.mapcar(symbol_function(CYCL_FORMULA_TO_KIF), subformulas);
                return bq_cons(and, append(subformulas, NIL));
            }
        }
    }

    /**
     * KIF translator for #$and
     */
    @LispMethod(comment = "KIF translator for #$and")
    public static SubLObject cycl_to_kif_and_method(final SubLObject formula) {
        SubLObject and = NIL;
        destructuring_bind_must_consp(formula, formula, $list107);
        and = formula.first();
        SubLObject subformulas;
        final SubLObject current = subformulas = formula.rest();
        and = cycl_constant_to_kif($$and);
        subformulas = Mapping.mapcar(symbol_function(CYCL_FORMULA_TO_KIF), subformulas);
        return bq_cons(and, append(subformulas, NIL));
    }

    /**
     * KIF translator for #$or
     */
    @LispMethod(comment = "KIF translator for #$or")
    public static final SubLObject cycl_to_kif_or_method_alt(SubLObject formula) {
        {
            SubLObject datum = formula;
            SubLObject current = datum;
            SubLObject or = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt106);
            or = current.first();
            current = current.rest();
            {
                SubLObject subformulas = current;
                or = cycl_constant_to_kif($$or);
                subformulas = Mapping.mapcar(symbol_function(CYCL_FORMULA_TO_KIF), subformulas);
                return bq_cons(or, append(subformulas, NIL));
            }
        }
    }

    /**
     * KIF translator for #$or
     */
    @LispMethod(comment = "KIF translator for #$or")
    public static SubLObject cycl_to_kif_or_method(final SubLObject formula) {
        SubLObject or = NIL;
        destructuring_bind_must_consp(formula, formula, $list112);
        or = formula.first();
        SubLObject subformulas;
        final SubLObject current = subformulas = formula.rest();
        or = cycl_constant_to_kif($$or);
        subformulas = Mapping.mapcar(symbol_function(CYCL_FORMULA_TO_KIF), subformulas);
        return bq_cons(or, append(subformulas, NIL));
    }

    /**
     * KIF translator for #$implies
     */
    @LispMethod(comment = "KIF translator for #$implies")
    public static final SubLObject cycl_to_kif_implies_method_alt(SubLObject formula) {
        {
            SubLObject datum = formula;
            SubLObject current = datum;
            SubLObject implies = NIL;
            SubLObject antecedent = NIL;
            SubLObject consequent = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt110);
            implies = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt110);
            antecedent = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt110);
            consequent = current.first();
            current = current.rest();
            if (NIL == current) {
                implies = cycl_constant_to_kif($$implies);
                antecedent = cycl_formula_to_kif(antecedent);
                consequent = cycl_formula_to_kif(consequent);
                return list(implies, antecedent, consequent);
            } else {
                cdestructuring_bind_error(datum, $list_alt110);
            }
        }
        return NIL;
    }

    /**
     * KIF translator for #$implies
     */
    @LispMethod(comment = "KIF translator for #$implies")
    public static SubLObject cycl_to_kif_implies_method(final SubLObject formula) {
        SubLObject implies = NIL;
        SubLObject antecedent = NIL;
        SubLObject consequent = NIL;
        destructuring_bind_must_consp(formula, formula, $list116);
        implies = formula.first();
        SubLObject current = formula.rest();
        destructuring_bind_must_consp(current, formula, $list116);
        antecedent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, formula, $list116);
        consequent = current.first();
        current = current.rest();
        if (NIL == current) {
            implies = cycl_constant_to_kif($$implies);
            antecedent = cycl_formula_to_kif(antecedent);
            consequent = cycl_formula_to_kif(consequent);
            return list(implies, antecedent, consequent);
        }
        cdestructuring_bind_error(formula, $list116);
        return NIL;
    }

    /**
     * KIF translator for #$equiv
     */
    @LispMethod(comment = "KIF translator for #$equiv")
    public static final SubLObject cycl_to_kif_equiv_method_alt(SubLObject formula) {
        {
            SubLObject datum = formula;
            SubLObject current = datum;
            SubLObject equiv = NIL;
            SubLObject antecedent = NIL;
            SubLObject consequent = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt114);
            equiv = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt114);
            antecedent = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt114);
            consequent = current.first();
            current = current.rest();
            if (NIL == current) {
                equiv = cycl_constant_to_kif($$equiv);
                antecedent = cycl_formula_to_kif(antecedent);
                consequent = cycl_formula_to_kif(consequent);
                return list(equiv, antecedent, consequent);
            } else {
                cdestructuring_bind_error(datum, $list_alt114);
            }
        }
        return NIL;
    }

    /**
     * KIF translator for #$equiv
     */
    @LispMethod(comment = "KIF translator for #$equiv")
    public static SubLObject cycl_to_kif_equiv_method(final SubLObject formula) {
        SubLObject equiv = NIL;
        SubLObject antecedent = NIL;
        SubLObject consequent = NIL;
        destructuring_bind_must_consp(formula, formula, $list120);
        equiv = formula.first();
        SubLObject current = formula.rest();
        destructuring_bind_must_consp(current, formula, $list120);
        antecedent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, formula, $list120);
        consequent = current.first();
        current = current.rest();
        if (NIL == current) {
            equiv = cycl_constant_to_kif($$equiv);
            antecedent = cycl_formula_to_kif(antecedent);
            consequent = cycl_formula_to_kif(consequent);
            return list(equiv, antecedent, consequent);
        }
        cdestructuring_bind_error(formula, $list120);
        return NIL;
    }

    /**
     * KIF translator for #$xor
     */
    @LispMethod(comment = "KIF translator for #$xor")
    public static final SubLObject cycl_to_kif_xor_method_alt(SubLObject formula) {
        {
            SubLObject datum = formula;
            SubLObject current = datum;
            SubLObject xor = NIL;
            SubLObject subformula1 = NIL;
            SubLObject subformula2 = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt116);
            xor = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt116);
            subformula1 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt116);
            subformula2 = current.first();
            current = current.rest();
            if (NIL == current) {
                return cycl_formula_to_kif(list($$equiv, subformula1, list($$not, subformula2)));
            } else {
                cdestructuring_bind_error(datum, $list_alt116);
            }
        }
        return NIL;
    }

    /**
     * KIF translator for #$xor
     */
    @LispMethod(comment = "KIF translator for #$xor")
    public static SubLObject cycl_to_kif_xor_method(final SubLObject formula) {
        SubLObject xor = NIL;
        SubLObject subformula1 = NIL;
        SubLObject subformula2 = NIL;
        destructuring_bind_must_consp(formula, formula, $list122);
        xor = formula.first();
        SubLObject current = formula.rest();
        destructuring_bind_must_consp(current, formula, $list122);
        subformula1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, formula, $list122);
        subformula2 = current.first();
        current = current.rest();
        if (NIL == current) {
            return cycl_formula_to_kif(list($$equiv, subformula1, list($$not, subformula2)));
        }
        cdestructuring_bind_error(formula, $list122);
        return NIL;
    }

    /**
     * KIF translator for #$trueSentence
     */
    @LispMethod(comment = "KIF translator for #$trueSentence")
    public static final SubLObject cycl_to_kif_truesentence_method_alt(SubLObject formula) {
        {
            SubLObject datum = formula;
            SubLObject current = datum;
            SubLObject truesentence = NIL;
            SubLObject subformula = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt119);
            truesentence = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt119);
            subformula = current.first();
            current = current.rest();
            if (NIL == current) {
                truesentence = cycl_constant_to_kif($$trueSentence);
                subformula = cycl_formula_to_kif(subformula);
                return list(truesentence, subformula);
            } else {
                cdestructuring_bind_error(datum, $list_alt119);
            }
        }
        return NIL;
    }

    /**
     * KIF translator for #$trueSentence
     */
    @LispMethod(comment = "KIF translator for #$trueSentence")
    public static SubLObject cycl_to_kif_truesentence_method(final SubLObject formula) {
        SubLObject truesentence = NIL;
        SubLObject subformula = NIL;
        destructuring_bind_must_consp(formula, formula, $list125);
        truesentence = formula.first();
        SubLObject current = formula.rest();
        destructuring_bind_must_consp(current, formula, $list125);
        subformula = current.first();
        current = current.rest();
        if (NIL == current) {
            truesentence = cycl_constant_to_kif($$trueSentence);
            subformula = cycl_formula_to_kif(subformula);
            return list(truesentence, subformula);
        }
        cdestructuring_bind_error(formula, $list125);
        return NIL;
    }

    /**
     * KIF translator for #$forAll
     */
    @LispMethod(comment = "KIF translator for #$forAll")
    public static final SubLObject cycl_to_kif_forall_method_alt(SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = formula;
                SubLObject current = datum;
                SubLObject forall = NIL;
                SubLObject variable = NIL;
                SubLObject subformula = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt123);
                forall = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt123);
                variable = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt123);
                subformula = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL == $suspend_type_checkingP$.getDynamicValue(thread)) {
                        if (NIL == cycl_variables.el_varP(variable)) {
                            cycl_to_kif_error($str_alt60$_A_is_not_a__A, variable, $sym85$EL_VAR_, UNPROVIDED, UNPROVIDED);
                        }
                    }
                    forall = cycl_constant_to_kif($$forAll);
                    variable = cycl_el_variable_to_kif(variable);
                    subformula = cycl_formula_to_kif(subformula);
                    return list(forall, list(variable), subformula);
                } else {
                    cdestructuring_bind_error(datum, $list_alt123);
                }
            }
            return NIL;
        }
    }

    /**
     * KIF translator for #$forAll
     */
    @LispMethod(comment = "KIF translator for #$forAll")
    public static SubLObject cycl_to_kif_forall_method(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject forall = NIL;
        SubLObject variable = NIL;
        SubLObject subformula = NIL;
        destructuring_bind_must_consp(formula, formula, $list129);
        forall = formula.first();
        SubLObject current = formula.rest();
        destructuring_bind_must_consp(current, formula, $list129);
        variable = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, formula, $list129);
        subformula = current.first();
        current = current.rest();
        if (NIL == current) {
            if ((NIL == $suspend_type_checkingP$.getDynamicValue(thread)) && (NIL == cycl_variables.el_varP(variable))) {
                cycl_to_kif_error($str60$_A_is_not_a__A, variable, $sym91$EL_VAR_, UNPROVIDED, UNPROVIDED);
            }
            forall = cycl_constant_to_kif($$forAll);
            variable = cycl_el_variable_to_kif(variable);
            subformula = cycl_formula_to_kif(subformula);
            return list(forall, list(variable), subformula);
        }
        cdestructuring_bind_error(formula, $list129);
        return NIL;
    }

    /**
     * KIF translator for #$thereExists
     */
    @LispMethod(comment = "KIF translator for #$thereExists")
    public static final SubLObject cycl_to_kif_thereexists_method_alt(SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = formula;
                SubLObject current = datum;
                SubLObject thereexists = NIL;
                SubLObject variable = NIL;
                SubLObject subformula = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt127);
                thereexists = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt127);
                variable = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt127);
                subformula = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL == $suspend_type_checkingP$.getDynamicValue(thread)) {
                        if (NIL == cycl_variables.el_varP(variable)) {
                            cycl_to_kif_error($str_alt60$_A_is_not_a__A, variable, $sym85$EL_VAR_, UNPROVIDED, UNPROVIDED);
                        }
                    }
                    thereexists = cycl_constant_to_kif($$thereExists);
                    variable = cycl_el_variable_to_kif(variable);
                    subformula = cycl_formula_to_kif(subformula);
                    return list(thereexists, list(variable), subformula);
                } else {
                    cdestructuring_bind_error(datum, $list_alt127);
                }
            }
            return NIL;
        }
    }

    /**
     * KIF translator for #$thereExists
     */
    @LispMethod(comment = "KIF translator for #$thereExists")
    public static SubLObject cycl_to_kif_thereexists_method(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject thereexists = NIL;
        SubLObject variable = NIL;
        SubLObject subformula = NIL;
        destructuring_bind_must_consp(formula, formula, $list133);
        thereexists = formula.first();
        SubLObject current = formula.rest();
        destructuring_bind_must_consp(current, formula, $list133);
        variable = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, formula, $list133);
        subformula = current.first();
        current = current.rest();
        if (NIL == current) {
            if ((NIL == $suspend_type_checkingP$.getDynamicValue(thread)) && (NIL == cycl_variables.el_varP(variable))) {
                cycl_to_kif_error($str60$_A_is_not_a__A, variable, $sym91$EL_VAR_, UNPROVIDED, UNPROVIDED);
            }
            thereexists = cycl_constant_to_kif($$thereExists);
            variable = cycl_el_variable_to_kif(variable);
            subformula = cycl_formula_to_kif(subformula);
            return list(thereexists, list(variable), subformula);
        }
        cdestructuring_bind_error(formula, $list133);
        return NIL;
    }

    /**
     * KIF translator for #$thereExistExactly
     */
    @LispMethod(comment = "KIF translator for #$thereExistExactly")
    public static final SubLObject cycl_to_kif_thereexistexactly_method_alt(SubLObject formula) {
        return cycl_there_exists_variant_to_kif(formula);
    }

    /**
     * KIF translator for #$thereExistExactly
     */
    @LispMethod(comment = "KIF translator for #$thereExistExactly")
    public static SubLObject cycl_to_kif_thereexistexactly_method(final SubLObject formula) {
        return cycl_there_exists_variant_to_kif(formula);
    }

    /**
     * KIF translator for #$thereExistAtLeast
     */
    @LispMethod(comment = "KIF translator for #$thereExistAtLeast")
    public static final SubLObject cycl_to_kif_thereexistatleast_method_alt(SubLObject formula) {
        return cycl_there_exists_variant_to_kif(formula);
    }

    /**
     * KIF translator for #$thereExistAtLeast
     */
    @LispMethod(comment = "KIF translator for #$thereExistAtLeast")
    public static SubLObject cycl_to_kif_thereexistatleast_method(final SubLObject formula) {
        return cycl_there_exists_variant_to_kif(formula);
    }

    /**
     * KIF translator for #$thereExistAtMost
     */
    @LispMethod(comment = "KIF translator for #$thereExistAtMost")
    public static final SubLObject cycl_to_kif_thereexistatmost_method_alt(SubLObject formula) {
        return cycl_there_exists_variant_to_kif(formula);
    }

    /**
     * KIF translator for #$thereExistAtMost
     */
    @LispMethod(comment = "KIF translator for #$thereExistAtMost")
    public static SubLObject cycl_to_kif_thereexistatmost_method(final SubLObject formula) {
        return cycl_there_exists_variant_to_kif(formula);
    }

    public static final SubLObject cycl_there_exists_variant_to_kif_alt(SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = formula;
                SubLObject current = datum;
                SubLObject there_exists_variant = NIL;
                SubLObject num = NIL;
                SubLObject variable = NIL;
                SubLObject subformula = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt135);
                there_exists_variant = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt135);
                num = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt135);
                variable = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt135);
                subformula = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL == $suspend_type_checkingP$.getDynamicValue(thread)) {
                        if (NIL == cycl_variables.el_varP(variable)) {
                            cycl_to_kif_error($str_alt60$_A_is_not_a__A, variable, $sym85$EL_VAR_, UNPROVIDED, UNPROVIDED);
                        }
                    }
                    there_exists_variant = cycl_constant_to_kif(there_exists_variant);
                    num = cycl_2_term_to_kif(num);
                    variable = cycl_el_variable_to_kif(variable);
                    subformula = cycl_formula_to_kif(subformula);
                    {
                        SubLObject true_sentence = cycl_constant_to_kif($$trueSentence);
                        return list(true_sentence, list(there_exists_variant, num, variable, subformula));
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt135);
                }
            }
            return NIL;
        }
    }

    public static SubLObject cycl_there_exists_variant_to_kif(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject there_exists_variant = NIL;
        SubLObject num = NIL;
        SubLObject variable = NIL;
        SubLObject subformula = NIL;
        destructuring_bind_must_consp(formula, formula, $list141);
        there_exists_variant = formula.first();
        SubLObject current = formula.rest();
        destructuring_bind_must_consp(current, formula, $list141);
        num = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, formula, $list141);
        variable = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, formula, $list141);
        subformula = current.first();
        current = current.rest();
        if (NIL == current) {
            if ((NIL == $suspend_type_checkingP$.getDynamicValue(thread)) && (NIL == cycl_variables.el_varP(variable))) {
                cycl_to_kif_error($str60$_A_is_not_a__A, variable, $sym91$EL_VAR_, UNPROVIDED, UNPROVIDED);
            }
            there_exists_variant = cycl_constant_to_kif(there_exists_variant);
            num = cycl_2_term_to_kif(num);
            variable = cycl_el_variable_to_kif(variable);
            subformula = cycl_formula_to_kif(subformula);
            final SubLObject true_sentence = cycl_constant_to_kif($$trueSentence);
            return list(true_sentence, list(there_exists_variant, num, variable, subformula));
        }
        cdestructuring_bind_error(formula, $list141);
        return NIL;
    }

    /**
     * KIF translator for #$ist
     */
    @LispMethod(comment = "KIF translator for #$ist")
    public static final SubLObject cycl_to_kif_ist_method_alt(SubLObject formula) {
        {
            SubLObject datum = formula;
            SubLObject current = datum;
            SubLObject ist = NIL;
            SubLObject mt = NIL;
            SubLObject subformula = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt138);
            ist = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt138);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt138);
            subformula = current.first();
            current = current.rest();
            if (NIL == current) {
                ist = cycl_constant_to_kif($$ist);
                mt = cycl_2_term_to_kif(mt);
                subformula = cycl_formula_to_kif(subformula);
                return list(ist, mt, subformula);
            } else {
                cdestructuring_bind_error(datum, $list_alt138);
            }
        }
        return NIL;
    }

    /**
     * KIF translator for #$ist
     */
    @LispMethod(comment = "KIF translator for #$ist")
    public static SubLObject cycl_to_kif_ist_method(final SubLObject formula) {
        SubLObject ist = NIL;
        SubLObject mt = NIL;
        SubLObject subformula = NIL;
        destructuring_bind_must_consp(formula, formula, $list144);
        ist = formula.first();
        SubLObject current = formula.rest();
        destructuring_bind_must_consp(current, formula, $list144);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, formula, $list144);
        subformula = current.first();
        current = current.rest();
        if (NIL == current) {
            ist = cycl_constant_to_kif($$ist);
            mt = cycl_2_term_to_kif(mt);
            subformula = cycl_formula_to_kif(subformula);
            return list(ist, mt, subformula);
        }
        cdestructuring_bind_error(formula, $list144);
        return NIL;
    }

    /**
     * KIF translator for #$goals
     */
    @LispMethod(comment = "KIF translator for #$goals")
    public static final SubLObject cycl_to_kif_goals_method_alt(SubLObject formula) {
        {
            SubLObject datum = formula;
            SubLObject current = datum;
            SubLObject goals = NIL;
            SubLObject agent = NIL;
            SubLObject subformula = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt141);
            goals = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt141);
            agent = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt141);
            subformula = current.first();
            current = current.rest();
            if (NIL == current) {
                goals = cycl_constant_to_kif($$goals);
                agent = cycl_2_term_to_kif(agent);
                subformula = cycl_formula_to_kif(subformula);
                return list(goals, agent, subformula);
            } else {
                cdestructuring_bind_error(datum, $list_alt141);
            }
        }
        return NIL;
    }

    /**
     * KIF translator for #$goals
     */
    @LispMethod(comment = "KIF translator for #$goals")
    public static SubLObject cycl_to_kif_goals_method(final SubLObject formula) {
        SubLObject goals = NIL;
        SubLObject agent = NIL;
        SubLObject subformula = NIL;
        destructuring_bind_must_consp(formula, formula, $list147);
        goals = formula.first();
        SubLObject current = formula.rest();
        destructuring_bind_must_consp(current, formula, $list147);
        agent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, formula, $list147);
        subformula = current.first();
        current = current.rest();
        if (NIL == current) {
            goals = cycl_constant_to_kif($$goals);
            agent = cycl_2_term_to_kif(agent);
            subformula = cycl_formula_to_kif(subformula);
            return list(goals, agent, subformula);
        }
        cdestructuring_bind_error(formula, $list147);
        return NIL;
    }

    public static SubLObject declare_kif_file() {
        declareMacro("until_cycl_to_kif_aborted", "UNTIL-CYCL-TO-KIF-ABORTED");
        declareFunction("abort_cycl_to_kif", "ABORT-CYCL-TO-KIF", 0, 0, false);
        declareMacro("writing_kif_file", "WRITING-KIF-FILE");
        declareFunction("write_kb_to_kif_file", "WRITE-KB-TO-KIF-FILE", 1, 1, false);
        declareFunction("write_mt_to_kif_file", "WRITE-MT-TO-KIF-FILE", 2, 1, false);
        declareFunction("assertion_kif_formula_to_stream", "ASSERTION-KIF-FORMULA-TO-STREAM", 1, 1, false);
        declareFunction("assertion_kif_formula", "ASSERTION-KIF-FORMULA", 1, 0, false);
        declareFunction("meld_to_kif", "MELD-TO-KIF", 1, 0, false);
        declareFunction("cycl_to_kif", "CYCL-TO-KIF", 1, 0, false);
        declareFunction("write_kb_to_kif_file_preamble", "WRITE-KB-TO-KIF-FILE-PREAMBLE", 1, 0, false);
        declareFunction("write_mt_to_kif_file_preamble", "WRITE-MT-TO-KIF-FILE-PREAMBLE", 2, 0, false);
        declareFunction("write_kif_term_mixed_case", "WRITE-KIF-TERM-MIXED-CASE", 2, 0, false);
        declareFunction("write_kif_term_upcase", "WRITE-KIF-TERM-UPCASE", 2, 0, false);
        declareFunction("write_kif_term_downcase", "WRITE-KIF-TERM-DOWNCASE", 2, 0, false);
        declareFunction("write_kif_term_hyphen_mixed_case", "WRITE-KIF-TERM-HYPHEN-MIXED-CASE", 2, 0, false);
        declareFunction("write_kif_term_hyphen_upcase", "WRITE-KIF-TERM-HYPHEN-UPCASE", 2, 0, false);
        declareFunction("write_kif_term_hyphen_downcase", "WRITE-KIF-TERM-HYPHEN-DOWNCASE", 2, 0, false);
        declareFunction("write_kif_term_hyphenate", "WRITE-KIF-TERM-HYPHENATE", 3, 0, false);
        declareFunction("write_kif_term_insert_hyphen", "WRITE-KIF-TERM-INSERT-HYPHEN", 2, 0, false);
        declareFunction("cycl_to_kif_error", "CYCL-TO-KIF-ERROR", 1, 4, false);
        declareMacro("cycl_to_kif_check", "CYCL-TO-KIF-CHECK");
        declareFunction("register_kif_definition", "REGISTER-KIF-DEFINITION", 1, 0, false);
        declareFunction("additional_kif_definitions", "ADDITIONAL-KIF-DEFINITIONS", 0, 0, false);
        declareFunction("kif_term_print_function_trampoline", "KIF-TERM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("kif_term_p", "KIF-TERM-P", 1, 0, false);
        new kif.$kif_term_p$UnaryFunction();
        declareFunction("kif_print_string", "KIF-PRINT-STRING", 1, 0, false);
        declareFunction("_csetf_kif_print_string", "_CSETF-KIF-PRINT-STRING", 2, 0, false);
        declareFunction("make_kif_term", "MAKE-KIF-TERM", 0, 1, false);
        declareFunction("visit_defstruct_kif_term", "VISIT-DEFSTRUCT-KIF-TERM", 2, 0, false);
        declareFunction("visit_defstruct_object_kif_term_method", "VISIT-DEFSTRUCT-OBJECT-KIF-TERM-METHOD", 2, 0, false);
        declareFunction("sxhash_kif_term_method", "SXHASH-KIF-TERM-METHOD", 1, 0, false);
        declareFunction("print_kif_term", "PRINT-KIF-TERM", 3, 0, false);
        declareFunction("cycl_to_kif_standard_mapping", "CYCL-TO-KIF-STANDARD-MAPPING", 2, 0, false);
        declareFunction("find_kif_term", "FIND-KIF-TERM", 1, 0, false);
        declareFunction("intern_kif_term", "INTERN-KIF-TERM", 1, 1, false);
        declareFunction("note_kif_term", "NOTE-KIF-TERM", 2, 0, false);
        declareFunction("new_kif_term", "NEW-KIF-TERM", 1, 0, false);
        declareFunction("string_for_kif_term", "STRING-FOR-KIF-TERM", 1, 1, false);
        declareFunction("cycl_to_kif_method", "CYCL-TO-KIF-METHOD", 1, 0, false);
        declareFunction("register_cycl_to_kif_method", "REGISTER-CYCL-TO-KIF-METHOD", 2, 0, false);
        declareFunction("deregister_cycl_to_kif_method", "DEREGISTER-CYCL-TO-KIF-METHOD", 1, 0, false);
        declareFunction("cycl_to_kif_functor_p", "CYCL-TO-KIF-FUNCTOR-P", 1, 0, false);
        declareFunction("predefined_kif_symbol", "PREDEFINED-KIF-SYMBOL", 1, 0, false);
        declareFunction("cycl_to_kif_functor_string", "CYCL-TO-KIF-FUNCTOR-STRING", 1, 0, false);
        declareMacro("define_cycl_to_kif_method", "DEFINE-CYCL-TO-KIF-METHOD");
        declareFunction("cycl_formula_to_kif", "CYCL-FORMULA-TO-KIF", 1, 0, false);
        declareFunction("cycl_atomic_sentence_to_kif", "CYCL-ATOMIC-SENTENCE-TO-KIF", 1, 0, false);
        declareFunction("cycl_atomic_sentence_args_to_kif", "CYCL-ATOMIC-SENTENCE-ARGS-TO-KIF", 1, 0, false);
        declareFunction("cycl_atomic_sentence_args_to_kif_recursive", "CYCL-ATOMIC-SENTENCE-ARGS-TO-KIF-RECURSIVE", 1, 0, false);
        declareFunction("cycl_2_term_to_kif", "CYCL-2-TERM-TO-KIF", 1, 0, false);
        declareFunction("cycl_1_term_to_kif", "CYCL-1-TERM-TO-KIF", 1, 0, false);
        declareFunction("cycl_rep_1_term_to_kif", "CYCL-REP-1-TERM-TO-KIF", 1, 0, false);
        declareFunction("cycl_function_exp_to_kif", "CYCL-FUNCTION-EXP-TO-KIF", 1, 0, false);
        declareFunction("cycl_function_exp_args_to_kif", "CYCL-FUNCTION-EXP-ARGS-TO-KIF", 1, 0, false);
        declareFunction("cycl_function_exp_args_to_kif_recursive", "CYCL-FUNCTION-EXP-ARGS-TO-KIF-RECURSIVE", 1, 0, false);
        declareFunction("cycl_constant_to_kif", "CYCL-CONSTANT-TO-KIF", 1, 0, false);
        declareFunction("cycl_el_variable_to_kif", "CYCL-EL-VARIABLE-TO-KIF", 1, 0, false);
        declareFunction("cycl_dotted_el_var_to_kif", "CYCL-DOTTED-EL-VAR-TO-KIF", 1, 0, false);
        declareFunction("cycl_to_kif_not_method", "CYCL-TO-KIF-NOT-METHOD", 1, 0, false);
        declareFunction("cycl_to_kif_and_method", "CYCL-TO-KIF-AND-METHOD", 1, 0, false);
        declareFunction("cycl_to_kif_or_method", "CYCL-TO-KIF-OR-METHOD", 1, 0, false);
        declareFunction("cycl_to_kif_implies_method", "CYCL-TO-KIF-IMPLIES-METHOD", 1, 0, false);
        declareFunction("cycl_to_kif_equiv_method", "CYCL-TO-KIF-EQUIV-METHOD", 1, 0, false);
        declareFunction("cycl_to_kif_xor_method", "CYCL-TO-KIF-XOR-METHOD", 1, 0, false);
        declareFunction("cycl_to_kif_truesentence_method", "CYCL-TO-KIF-TRUESENTENCE-METHOD", 1, 0, false);
        declareFunction("cycl_to_kif_forall_method", "CYCL-TO-KIF-FORALL-METHOD", 1, 0, false);
        declareFunction("cycl_to_kif_thereexists_method", "CYCL-TO-KIF-THEREEXISTS-METHOD", 1, 0, false);
        declareFunction("cycl_to_kif_thereexistexactly_method", "CYCL-TO-KIF-THEREEXISTEXACTLY-METHOD", 1, 0, false);
        declareFunction("cycl_to_kif_thereexistatleast_method", "CYCL-TO-KIF-THEREEXISTATLEAST-METHOD", 1, 0, false);
        declareFunction("cycl_to_kif_thereexistatmost_method", "CYCL-TO-KIF-THEREEXISTATMOST-METHOD", 1, 0, false);
        declareFunction("cycl_there_exists_variant_to_kif", "CYCL-THERE-EXISTS-VARIANT-TO-KIF", 1, 0, false);
        declareFunction("cycl_to_kif_ist_method", "CYCL-TO-KIF-IST-METHOD", 1, 0, false);
        declareFunction("cycl_to_kif_goals_method", "CYCL-TO-KIF-GOALS-METHOD", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt3 = list(list(makeSymbol("*ADDITIONAL-KIF-DEFINITIONS*"), NIL), list(makeSymbol("*WITHIN-CYCL-TO-KIF*"), T));

    public static final SubLObject init_kif_file_alt() {
        defparameter("*WITHIN-CYCL-TO-KIF*", NIL);
        defparameter("*ADDITIONAL-KIF-DEFINITIONS*", NIL);
        defparameter("*CYCL-TO-KIF-ERROR-METHOD*", $ABORT);
        defparameter("*DEFAULT-KIF-TERM-PRINT-METHOD*", WRITE_KIF_TERM_MIXED_CASE);
        defparameter("*KIF-TERM-PRINT-METHOD*", $default_kif_term_print_method$.getDynamicValue());
        defparameter("*KB-TO-KIF-FILE-PREAMBLE*", $str_alt44$_____KIF_assertion_specs_for_enti);
        defparameter("*MT-TO-KIF-FILE-PREAMBLE*", $str_alt45$_____KIF_assertion_specs_for_micr);
        defconstant("*DTP-KIF-TERM*", KIF_TERM);
        deflexical("*KIF-TERM-TABLE*", NIL != boundp($kif_term_table$) ? ((SubLObject) ($kif_term_table$.getGlobalValue())) : NIL);
        defparameter("*CYCL-TO-KIF-METHOD-TABLE*", NIL);
        return NIL;
    }

    public static SubLObject init_kif_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*WITHIN-CYCL-TO-KIF*", NIL);
            defparameter("*ADDITIONAL-KIF-DEFINITIONS*", NIL);
            defparameter("*CYCL-TO-KIF-ERROR-METHOD*", $ABORT);
            defparameter("*DEFAULT-KIF-TERM-PRINT-METHOD*", WRITE_KIF_TERM_MIXED_CASE);
            defparameter("*KIF-TERM-PRINT-METHOD*", $default_kif_term_print_method$.getDynamicValue());
            defparameter("*KB-TO-KIF-FILE-PREAMBLE*", $str44$_____KIF_assertion_specs_for_enti);
            defparameter("*MT-TO-KIF-FILE-PREAMBLE*", $str45$_____KIF_assertion_specs_for_micr);
            defconstant("*DTP-KIF-TERM*", KIF_TERM);
            deflexical("*KIF-TERM-TABLE*", SubLTrampolineFile.maybeDefault($kif_term_table$, $kif_term_table$, NIL));
            defparameter("*CYCL-TO-KIF-METHOD-TABLE*", NIL);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*KIF-TERM-TABLE*", NIL != boundp($kif_term_table$) ? ((SubLObject) ($kif_term_table$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_kif_file_Previous() {
        defparameter("*WITHIN-CYCL-TO-KIF*", NIL);
        defparameter("*ADDITIONAL-KIF-DEFINITIONS*", NIL);
        defparameter("*CYCL-TO-KIF-ERROR-METHOD*", $ABORT);
        defparameter("*DEFAULT-KIF-TERM-PRINT-METHOD*", WRITE_KIF_TERM_MIXED_CASE);
        defparameter("*KIF-TERM-PRINT-METHOD*", $default_kif_term_print_method$.getDynamicValue());
        defparameter("*KB-TO-KIF-FILE-PREAMBLE*", $str44$_____KIF_assertion_specs_for_enti);
        defparameter("*MT-TO-KIF-FILE-PREAMBLE*", $str45$_____KIF_assertion_specs_for_micr);
        defconstant("*DTP-KIF-TERM*", KIF_TERM);
        deflexical("*KIF-TERM-TABLE*", SubLTrampolineFile.maybeDefault($kif_term_table$, $kif_term_table$, NIL));
        defparameter("*CYCL-TO-KIF-METHOD-TABLE*", NIL);
        return NIL;
    }

    static private final SubLList $list_alt6 = list(list(makeSymbol("STREAM"), makeSymbol("FILENAME"), makeSymbol("KIF-TERM-PRINT-METHOD")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt9 = list(makeKeyword("OUTPUT"));

    static private final SubLList $list_alt13 = list(makeSymbol("*KIF-TERM-PRINT-METHOD*"));

    static private final SubLList $list_alt14 = list(list(makeSymbol("*CYCL-TO-KIF-ERROR-METHOD*"), makeKeyword("ABORT")));

    public static final SubLObject setup_kif_file_alt() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_kif_term$.getGlobalValue(), symbol_function(KIF_TERM_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(KIF_PRINT_STRING, _CSETF_KIF_PRINT_STRING);
        identity(KIF_TERM);
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_kif_term$.getGlobalValue(), symbol_function(SXHASH_KIF_TERM_METHOD));
        declare_defglobal($kif_term_table$);
        cycl_to_kif_standard_mapping($$True, $$$true);
        cycl_to_kif_standard_mapping($$False, $$$false);
        cycl_to_kif_standard_mapping($$not, $$$not);
        register_cycl_to_kif_method($$not, CYCL_TO_KIF_NOT_METHOD);
        cycl_to_kif_standard_mapping($$and, $$$and);
        register_cycl_to_kif_method($$and, CYCL_TO_KIF_AND_METHOD);
        cycl_to_kif_standard_mapping($$or, $$$or);
        register_cycl_to_kif_method($$or, CYCL_TO_KIF_OR_METHOD);
        cycl_to_kif_standard_mapping($$implies, $str_alt109$__);
        register_cycl_to_kif_method($$implies, CYCL_TO_KIF_IMPLIES_METHOD);
        cycl_to_kif_standard_mapping($$equiv, $str_alt113$___);
        register_cycl_to_kif_method($$equiv, CYCL_TO_KIF_EQUIV_METHOD);
        register_cycl_to_kif_method($$xor, CYCL_TO_KIF_XOR_METHOD);
        register_cycl_to_kif_method($$trueSentence, CYCL_TO_KIF_TRUESENTENCE_METHOD);
        cycl_to_kif_standard_mapping($$forAll, $$$forall);
        register_cycl_to_kif_method($$forAll, CYCL_TO_KIF_FORALL_METHOD);
        cycl_to_kif_standard_mapping($$thereExists, $$$exists);
        register_cycl_to_kif_method($$thereExists, CYCL_TO_KIF_THEREEXISTS_METHOD);
        register_cycl_to_kif_method($$thereExistExactly, CYCL_TO_KIF_THEREEXISTEXACTLY_METHOD);
        register_cycl_to_kif_method($$thereExistAtLeast, CYCL_TO_KIF_THEREEXISTATLEAST_METHOD);
        register_cycl_to_kif_method($$thereExistAtMost, CYCL_TO_KIF_THEREEXISTATMOST_METHOD);
        cycl_to_kif_standard_mapping($$equals, $str_alt137$_);
        register_cycl_to_kif_method($$ist, CYCL_TO_KIF_IST_METHOD);
        register_cycl_to_kif_method($$goals, CYCL_TO_KIF_GOALS_METHOD);
        cycl_to_kif_standard_mapping($$TheList, $$$listof);
        return NIL;
    }

    public static SubLObject setup_kif_file() {
        if (SubLFiles.USE_V1) {
            register_method($print_object_method_table$.getGlobalValue(), $dtp_kif_term$.getGlobalValue(), symbol_function(KIF_TERM_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list70);
            def_csetf(KIF_PRINT_STRING, _CSETF_KIF_PRINT_STRING);
            identity(KIF_TERM);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_kif_term$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_KIF_TERM_METHOD));
            register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_kif_term$.getGlobalValue(), symbol_function(SXHASH_KIF_TERM_METHOD));
            declare_defglobal($kif_term_table$);
            cycl_to_kif_standard_mapping($$True, $$$true);
            cycl_to_kif_standard_mapping($$False, $$$false);
            cycl_to_kif_standard_mapping($$not, $$$not);
            register_cycl_to_kif_method($$not, CYCL_TO_KIF_NOT_METHOD);
            cycl_to_kif_standard_mapping($$and, $$$and);
            register_cycl_to_kif_method($$and, CYCL_TO_KIF_AND_METHOD);
            cycl_to_kif_standard_mapping($$or, $$$or);
            register_cycl_to_kif_method($$or, CYCL_TO_KIF_OR_METHOD);
            cycl_to_kif_standard_mapping($$implies, $str115$__);
            register_cycl_to_kif_method($$implies, CYCL_TO_KIF_IMPLIES_METHOD);
            cycl_to_kif_standard_mapping($$equiv, $str119$___);
            register_cycl_to_kif_method($$equiv, CYCL_TO_KIF_EQUIV_METHOD);
            register_cycl_to_kif_method($$xor, CYCL_TO_KIF_XOR_METHOD);
            register_cycl_to_kif_method($$trueSentence, CYCL_TO_KIF_TRUESENTENCE_METHOD);
            cycl_to_kif_standard_mapping($$forAll, $$$forall);
            register_cycl_to_kif_method($$forAll, CYCL_TO_KIF_FORALL_METHOD);
            cycl_to_kif_standard_mapping($$thereExists, $$$exists);
            register_cycl_to_kif_method($$thereExists, CYCL_TO_KIF_THEREEXISTS_METHOD);
            register_cycl_to_kif_method($$thereExistExactly, CYCL_TO_KIF_THEREEXISTEXACTLY_METHOD);
            register_cycl_to_kif_method($$thereExistAtLeast, CYCL_TO_KIF_THEREEXISTATLEAST_METHOD);
            register_cycl_to_kif_method($$thereExistAtMost, CYCL_TO_KIF_THEREEXISTATMOST_METHOD);
            cycl_to_kif_standard_mapping($$equals, $str143$_);
            register_cycl_to_kif_method($$ist, CYCL_TO_KIF_IST_METHOD);
            register_cycl_to_kif_method($$goals, CYCL_TO_KIF_GOALS_METHOD);
            cycl_to_kif_standard_mapping($$TheList, $$$listof);
        }
        if (SubLFiles.USE_V2) {
            cycl_to_kif_standard_mapping($$implies, $str_alt109$__);
            cycl_to_kif_standard_mapping($$equiv, $str_alt113$___);
            cycl_to_kif_standard_mapping($$equals, $str_alt137$_);
        }
        return NIL;
    }

    public static SubLObject setup_kif_file_Previous() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_kif_term$.getGlobalValue(), symbol_function(KIF_TERM_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list70);
        def_csetf(KIF_PRINT_STRING, _CSETF_KIF_PRINT_STRING);
        identity(KIF_TERM);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_kif_term$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_KIF_TERM_METHOD));
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_kif_term$.getGlobalValue(), symbol_function(SXHASH_KIF_TERM_METHOD));
        declare_defglobal($kif_term_table$);
        cycl_to_kif_standard_mapping($$True, $$$true);
        cycl_to_kif_standard_mapping($$False, $$$false);
        cycl_to_kif_standard_mapping($$not, $$$not);
        register_cycl_to_kif_method($$not, CYCL_TO_KIF_NOT_METHOD);
        cycl_to_kif_standard_mapping($$and, $$$and);
        register_cycl_to_kif_method($$and, CYCL_TO_KIF_AND_METHOD);
        cycl_to_kif_standard_mapping($$or, $$$or);
        register_cycl_to_kif_method($$or, CYCL_TO_KIF_OR_METHOD);
        cycl_to_kif_standard_mapping($$implies, $str115$__);
        register_cycl_to_kif_method($$implies, CYCL_TO_KIF_IMPLIES_METHOD);
        cycl_to_kif_standard_mapping($$equiv, $str119$___);
        register_cycl_to_kif_method($$equiv, CYCL_TO_KIF_EQUIV_METHOD);
        register_cycl_to_kif_method($$xor, CYCL_TO_KIF_XOR_METHOD);
        register_cycl_to_kif_method($$trueSentence, CYCL_TO_KIF_TRUESENTENCE_METHOD);
        cycl_to_kif_standard_mapping($$forAll, $$$forall);
        register_cycl_to_kif_method($$forAll, CYCL_TO_KIF_FORALL_METHOD);
        cycl_to_kif_standard_mapping($$thereExists, $$$exists);
        register_cycl_to_kif_method($$thereExists, CYCL_TO_KIF_THEREEXISTS_METHOD);
        register_cycl_to_kif_method($$thereExistExactly, CYCL_TO_KIF_THEREEXISTEXACTLY_METHOD);
        register_cycl_to_kif_method($$thereExistAtLeast, CYCL_TO_KIF_THEREEXISTATLEAST_METHOD);
        register_cycl_to_kif_method($$thereExistAtMost, CYCL_TO_KIF_THEREEXISTATMOST_METHOD);
        cycl_to_kif_standard_mapping($$equals, $str143$_);
        register_cycl_to_kif_method($$ist, CYCL_TO_KIF_IST_METHOD);
        register_cycl_to_kif_method($$goals, CYCL_TO_KIF_GOALS_METHOD);
        cycl_to_kif_standard_mapping($$TheList, $$$listof);
        return NIL;
    }

    static private final SubLString $str_alt17$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt25$do_broad_mt_index = makeString("do-broad-mt-index");

    static private final SubLList $list_alt27 = list(makeSymbol("&KEY"), makeSymbol("DIRECTION"), makeSymbol("MONOTONICITY"), makeSymbol("MICROTHEORY"), makeSymbol("CREATOR"), makeSymbol("CREATION-DATE"), makeSymbol("KIF"));

    static private final SubLList $list_alt28 = list(makeKeyword("DIRECTION"), makeKeyword("MONOTONICITY"), makeKeyword("MICROTHEORY"), makeKeyword("CREATOR"), makeKeyword("CREATION-DATE"), makeKeyword("KIF"));

    static private final SubLString $str_alt36$_____ = makeString("~%~%(");

    static private final SubLString $str_alt37$_DIRECTION__S = makeString(":DIRECTION ~S");

    static private final SubLString $str_alt38$__MONOTONICITY__S = makeString(" :MONOTONICITY ~S");

    static private final SubLString $str_alt39$__CREATOR__S = makeString(" :CREATOR ~S");

    static private final SubLString $str_alt40$__CREATION_DATE__S = makeString(" :CREATION-DATE ~S");

    static private final SubLString $str_alt41$____MICROTHEORY__S = makeString("~% :MICROTHEORY ~S");

    static private final SubLString $str_alt42$____KIF = makeString("~% :KIF");

    static private final SubLString $str_alt43$___ = makeString("~%)");

    static private final SubLString $str_alt44$_____KIF_assertion_specs_for_enti = makeString("\n\n;; KIF assertion-specs for entire KB\n;; ~A");

    static private final SubLString $str_alt45$_____KIF_assertion_specs_for_micr = makeString("\n\n;; KIF assertion-specs for microtheory : ~S\n;; ~A");

    static private final SubLList $list_alt56 = list(makeSymbol("OBJECT"), makeSymbol("PRED"));

    @Override
    public void declareFunctions() {
        declare_kif_file();
    }

    @Override
    public void initializeVariables() {
        init_kif_file();
    }

    static private final SubLString $str_alt60$_A_is_not_a__A = makeString("~A is not a ~A");

    @Override
    public void runTopLevelForms() {
        setup_kif_file();
    }

    

    static private final SubLList $list_alt64 = list(makeSymbol("PRINT-STRING"));

    static private final SubLList $list_alt65 = list(makeKeyword("PRINT-STRING"));

    static private final SubLList $list_alt66 = list(makeSymbol("KIF-PRINT-STRING"));

    static private final SubLList $list_alt67 = list(makeSymbol("_CSETF-KIF-PRINT-STRING"));

    static private final SubLString $str_alt73$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    public static final class $kif_term_p$UnaryFunction extends UnaryFunction {
        public $kif_term_p$UnaryFunction() {
            super(extractFunctionNamed("KIF-TERM-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return kif_term_p(arg1);
        }
    }

    static private final SubLList $list_alt79 = list(makeSymbol("CYCL-TERM"), makeSymbol("ARGLIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt80$CYCL_TO_KIF__A_METHOD = makeString("CYCL-TO-KIF-~A-METHOD");

    static private final SubLList $list_alt84 = list(makeSymbol("PREDICATE"), makeSymbol("&REST"), makeSymbol("ARGUMENTS"));

    static private final SubLSymbol $sym85$EL_VAR_ = makeSymbol("EL-VAR?");

    static private final SubLString $str_alt88$Expecting_a_variable___S = makeString("Expecting a variable: ~S");

    static private final SubLString $str_alt89$Invalid_represented_first_order_t = makeString("Invalid represented first order term : ~S");

    static private final SubLList $list_alt90 = list(makeSymbol("FUNCTION"), makeSymbol("&REST"), makeSymbol("ARGUMENTS"));

    static private final SubLList $list_alt97 = list(makeSymbol("NOT"), makeSymbol("SUBFORMULA"));

    static private final SubLList $list_alt101 = list(makeSymbol("AND"), makeSymbol("&REST"), makeSymbol("SUBFORMULAS"));

    static private final SubLList $list_alt106 = list(makeSymbol("OR"), makeSymbol("&REST"), makeSymbol("SUBFORMULAS"));

    static private final SubLString $str_alt109$__ = makeString("=>");

    static private final SubLList $list_alt110 = list(makeSymbol("IMPLIES"), makeSymbol("ANTECEDENT"), makeSymbol("CONSEQUENT"));

    static private final SubLString $str_alt113$___ = makeString("<=>");

    static private final SubLList $list_alt114 = list(makeSymbol("EQUIV"), makeSymbol("ANTECEDENT"), makeSymbol("CONSEQUENT"));

    static private final SubLList $list_alt116 = list(makeSymbol("XOR"), makeSymbol("SUBFORMULA1"), makeSymbol("SUBFORMULA2"));

    static private final SubLList $list_alt119 = list(makeSymbol("TRUESENTENCE"), makeSymbol("SUBFORMULA"));

    static private final SubLList $list_alt123 = list(makeSymbol("FORALL"), makeSymbol("VARIABLE"), makeSymbol("SUBFORMULA"));

    static private final SubLList $list_alt127 = list(makeSymbol("THEREEXISTS"), makeSymbol("VARIABLE"), makeSymbol("SUBFORMULA"));

    static private final SubLList $list_alt135 = list(makeSymbol("THERE-EXISTS-VARIANT"), makeSymbol("NUM"), makeSymbol("VARIABLE"), makeSymbol("SUBFORMULA"));

    static private final SubLString $str_alt137$_ = makeString("=");

    static private final SubLList $list_alt138 = list(makeSymbol("IST"), makeSymbol("MT"), makeSymbol("SUBFORMULA"));

    static private final SubLList $list_alt141 = list(makeSymbol("GOALS"), makeSymbol("AGENT"), makeSymbol("SUBFORMULA"));
}

/**
 * Total time: 636 ms
 */
