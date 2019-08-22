package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sequencep;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;

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
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class finite_state_cascade_parser extends SubLTranslatedFile {
    public static final SubLFile me = new finite_state_cascade_parser();

    public static final String myName = "com.cyc.cycjava.cycl.finite_state_cascade_parser";

    public static final String myFingerPrint = "cc741cbe30e07497ede96902e8c8994bb0cb531cc17e870fa66bd4969e37a769";

    // defconstant
    public static final SubLSymbol $dtp_finite_state_cascade_parser$ = makeSymbol("*DTP-FINITE-STATE-CASCADE-PARSER*");

    // Internal Constants
    public static final SubLSymbol FINITE_STATE_CASCADE_PARSER = makeSymbol("FINITE-STATE-CASCADE-PARSER");

    public static final SubLSymbol FINITE_STATE_CASCADE_PARSER_P = makeSymbol("FINITE-STATE-CASCADE-PARSER-P");

    public static final SubLList $list2 = list(makeSymbol("TRANSDUCERS"), makeSymbol("LEXER"));

    public static final SubLList $list3 = list(makeKeyword("TRANSDUCERS"), makeKeyword("LEXER"));

    public static final SubLList $list4 = list(makeSymbol("FSCP-TRANSDUCERS"), makeSymbol("FSCP-LEXER"));

    public static final SubLList $list5 = list(makeSymbol("_CSETF-FSCP-TRANSDUCERS"), makeSymbol("_CSETF-FSCP-LEXER"));



    public static final SubLSymbol FINITE_STATE_CASCADE_PARSER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FINITE-STATE-CASCADE-PARSER-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("FINITE-STATE-CASCADE-PARSER-P"));

    private static final SubLSymbol FSCP_TRANSDUCERS = makeSymbol("FSCP-TRANSDUCERS");

    private static final SubLSymbol _CSETF_FSCP_TRANSDUCERS = makeSymbol("_CSETF-FSCP-TRANSDUCERS");

    private static final SubLSymbol FSCP_LEXER = makeSymbol("FSCP-LEXER");

    private static final SubLSymbol _CSETF_FSCP_LEXER = makeSymbol("_CSETF-FSCP-LEXER");





    private static final SubLString $str15$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_FINITE_STATE_CASCADE_PARSER = makeSymbol("MAKE-FINITE-STATE-CASCADE-PARSER");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_FINITE_STATE_CASCADE_PARSER_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-FINITE-STATE-CASCADE-PARSER-METHOD");

    private static final SubLSymbol FINITE_STATE_TRANSDUCER_P = makeSymbol("FINITE-STATE-TRANSDUCER-P");

    private static final SubLString $str22$_A_is_not_a_list_of_finite_state_ = makeString("~A is not a list of finite-state-transducers");



    private static final SubLString $str24$___S_produced_____S__ = makeString("~&~S produced:~% ~S~%");

    public static SubLObject finite_state_cascade_parser_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject finite_state_cascade_parser_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$finite_state_cascade_parser_native.class ? T : NIL;
    }

    public static SubLObject fscp_transducers(final SubLObject v_object) {
        assert NIL != finite_state_cascade_parser_p(v_object) : "finite_state_cascade_parser.finite_state_cascade_parser_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject fscp_lexer(final SubLObject v_object) {
        assert NIL != finite_state_cascade_parser_p(v_object) : "finite_state_cascade_parser.finite_state_cascade_parser_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_fscp_transducers(final SubLObject v_object, final SubLObject value) {
        assert NIL != finite_state_cascade_parser_p(v_object) : "finite_state_cascade_parser.finite_state_cascade_parser_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_fscp_lexer(final SubLObject v_object, final SubLObject value) {
        assert NIL != finite_state_cascade_parser_p(v_object) : "finite_state_cascade_parser.finite_state_cascade_parser_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_finite_state_cascade_parser(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $finite_state_cascade_parser_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($TRANSDUCERS)) {
                _csetf_fscp_transducers(v_new, current_value);
            } else
                if (pcase_var.eql($LEXER)) {
                    _csetf_fscp_lexer(v_new, current_value);
                } else {
                    Errors.error($str15$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_finite_state_cascade_parser(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_FINITE_STATE_CASCADE_PARSER, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $TRANSDUCERS, fscp_transducers(obj));
        funcall(visitor_fn, obj, $SLOT, $LEXER, fscp_lexer(obj));
        funcall(visitor_fn, obj, $END, MAKE_FINITE_STATE_CASCADE_PARSER, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_finite_state_cascade_parser_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_finite_state_cascade_parser(obj, visitor_fn);
    }

    public static SubLObject new_finite_state_cascade_parser(final SubLObject transducers, SubLObject lexer) {
        if (lexer == UNPROVIDED) {
            lexer = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((!transducers.isList()) || (NIL == list_utilities.every_in_list(symbol_function(FINITE_STATE_TRANSDUCER_P), transducers, UNPROVIDED)))) {
            Errors.error($str22$_A_is_not_a_list_of_finite_state_, transducers);
        }
        final SubLObject fscp = make_finite_state_cascade_parser(UNPROVIDED);
        _csetf_fscp_transducers(fscp, transducers);
        _csetf_fscp_lexer(fscp, lexer);
        return fscp;
    }

    public static SubLObject fscp_parse(final SubLObject fscp, final SubLObject sequence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != finite_state_cascade_parser_p(fscp) : "finite_state_cascade_parser.finite_state_cascade_parser_p(fscp) " + "CommonSymbols.NIL != finite_state_cascade_parser.finite_state_cascade_parser_p(fscp) " + fscp;
        assert NIL != sequencep(sequence) : "Types.sequencep(sequence) " + "CommonSymbols.NIL != Types.sequencep(sequence) " + sequence;
        SubLObject parse = sequence;
        if (NIL != fscp_lexer(fscp)) {
            funcall(fscp_lexer(fscp), sequence);
        }
        SubLObject cdolist_list_var = fscp_transducers(fscp);
        SubLObject fst = NIL;
        fst = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject stratum = NIL;
            SubLObject some_matchP = NIL;
            SubLObject input = NIL;
            SubLObject match = NIL;
            SubLObject length = NIL;
            input = parse;
            match = finite_state_transducer.fst_match(fst, input);
            for (length = finite_state_transducer.fst_current_token_index(fst); NIL == list_utilities.zero_length_p(input); input = strie.sequence_slice(input, length, UNPROVIDED) , match = finite_state_transducer.fst_match(fst, input) , length = finite_state_transducer.fst_current_token_index(fst)) {
                if (NIL != match) {
                    some_matchP = T;
                } else {
                    match = elt(input, ZERO_INTEGER);
                    length = ONE_INTEGER;
                }
                stratum = cons(match, stratum);
            }
            if (NIL != some_matchP) {
                final SubLObject revised_parse = nreverse(stratum);
                if (!parse.equalp(revised_parse)) {
                    if (NIL != parsing_vars.$fscp_verboseP$.getDynamicValue(thread)) {
                        format(T, $str24$___S_produced_____S__, fst, revised_parse);
                    }
                    parse = revised_parse;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            fst = cdolist_list_var.first();
        } 
        return parse;
    }

    public static SubLObject declare_finite_state_cascade_parser_file() {
        declareFunction(me, "finite_state_cascade_parser_print_function_trampoline", "FINITE-STATE-CASCADE-PARSER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "finite_state_cascade_parser_p", "FINITE-STATE-CASCADE-PARSER-P", 1, 0, false);
        new finite_state_cascade_parser.$finite_state_cascade_parser_p$UnaryFunction();
        declareFunction(me, "fscp_transducers", "FSCP-TRANSDUCERS", 1, 0, false);
        declareFunction(me, "fscp_lexer", "FSCP-LEXER", 1, 0, false);
        declareFunction(me, "_csetf_fscp_transducers", "_CSETF-FSCP-TRANSDUCERS", 2, 0, false);
        declareFunction(me, "_csetf_fscp_lexer", "_CSETF-FSCP-LEXER", 2, 0, false);
        declareFunction(me, "make_finite_state_cascade_parser", "MAKE-FINITE-STATE-CASCADE-PARSER", 0, 1, false);
        declareFunction(me, "visit_defstruct_finite_state_cascade_parser", "VISIT-DEFSTRUCT-FINITE-STATE-CASCADE-PARSER", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_finite_state_cascade_parser_method", "VISIT-DEFSTRUCT-OBJECT-FINITE-STATE-CASCADE-PARSER-METHOD", 2, 0, false);
        declareFunction(me, "new_finite_state_cascade_parser", "NEW-FINITE-STATE-CASCADE-PARSER", 1, 1, false);
        declareFunction(me, "fscp_parse", "FSCP-PARSE", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_finite_state_cascade_parser_file() {
        defconstant("*DTP-FINITE-STATE-CASCADE-PARSER*", FINITE_STATE_CASCADE_PARSER);
        return NIL;
    }

    public static SubLObject setup_finite_state_cascade_parser_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_finite_state_cascade_parser$.getGlobalValue(), symbol_function(FINITE_STATE_CASCADE_PARSER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(FSCP_TRANSDUCERS, _CSETF_FSCP_TRANSDUCERS);
        def_csetf(FSCP_LEXER, _CSETF_FSCP_LEXER);
        identity(FINITE_STATE_CASCADE_PARSER);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_finite_state_cascade_parser$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_FINITE_STATE_CASCADE_PARSER_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_finite_state_cascade_parser_file();
    }

    @Override
    public void initializeVariables() {
        init_finite_state_cascade_parser_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_finite_state_cascade_parser_file();
    }

    

    public static final class $finite_state_cascade_parser_native extends SubLStructNative {
        public SubLObject $transducers;

        public SubLObject $lexer;

        private static final SubLStructDeclNative structDecl;

        private $finite_state_cascade_parser_native() {
            this.$transducers = Lisp.NIL;
            this.$lexer = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$transducers;
        }

        @Override
        public SubLObject getField3() {
            return this.$lexer;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$transducers = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$lexer = value;
        }

        static {
            structDecl = makeStructDeclNative($finite_state_cascade_parser_native.class, FINITE_STATE_CASCADE_PARSER, FINITE_STATE_CASCADE_PARSER_P, $list2, $list3, new String[]{ "$transducers", "$lexer" }, $list4, $list5, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $finite_state_cascade_parser_p$UnaryFunction extends UnaryFunction {
        public $finite_state_cascade_parser_p$UnaryFunction() {
            super(extractFunctionNamed("FINITE-STATE-CASCADE-PARSER-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return finite_state_cascade_parser_p(arg1);
        }
    }
}

/**
 * Total time: 57 ms
 */
