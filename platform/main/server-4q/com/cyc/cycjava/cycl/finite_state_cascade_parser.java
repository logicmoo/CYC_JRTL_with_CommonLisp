/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;
import org.logicmoo.system.BeanShellCntrl;

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
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      FINITE-STATE-CASCADE-PARSER
 * source file: /cyc/top/cycl/finite-state-cascade-parser.lisp
 * created:     2019/07/03 17:38:24
 */
public final class finite_state_cascade_parser extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new finite_state_cascade_parser();

 public static final String myName = "com.cyc.cycjava.cycl.finite_state_cascade_parser";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_finite_state_cascade_parser$ = makeSymbol("*DTP-FINITE-STATE-CASCADE-PARSER*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol FINITE_STATE_CASCADE_PARSER = makeSymbol("FINITE-STATE-CASCADE-PARSER");

    private static final SubLSymbol FINITE_STATE_CASCADE_PARSER_P = makeSymbol("FINITE-STATE-CASCADE-PARSER-P");

    static private final SubLList $list2 = list(makeSymbol("TRANSDUCERS"), makeSymbol("LEXER"));

    static private final SubLList $list3 = list(makeKeyword("TRANSDUCERS"), makeKeyword("LEXER"));

    static private final SubLList $list4 = list(makeSymbol("FSCP-TRANSDUCERS"), makeSymbol("FSCP-LEXER"));

    static private final SubLList $list5 = list(makeSymbol("_CSETF-FSCP-TRANSDUCERS"), makeSymbol("_CSETF-FSCP-LEXER"));

    private static final SubLSymbol FINITE_STATE_CASCADE_PARSER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FINITE-STATE-CASCADE-PARSER-PRINT-FUNCTION-TRAMPOLINE");

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

    public static final SubLObject finite_state_cascade_parser_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject finite_state_cascade_parser_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject finite_state_cascade_parser_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.finite_state_cascade_parser.$finite_state_cascade_parser_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject finite_state_cascade_parser_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.finite_state_cascade_parser.$finite_state_cascade_parser_native.class ? T : NIL;
    }

    public static final SubLObject fscp_transducers_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FINITE_STATE_CASCADE_PARSER_P);
        return v_object.getField2();
    }

    public static SubLObject fscp_transducers(final SubLObject v_object) {
        assert NIL != finite_state_cascade_parser_p(v_object) : "! finite_state_cascade_parser.finite_state_cascade_parser_p(v_object) " + "finite_state_cascade_parser.finite_state_cascade_parser_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject fscp_lexer_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FINITE_STATE_CASCADE_PARSER_P);
        return v_object.getField3();
    }

    public static SubLObject fscp_lexer(final SubLObject v_object) {
        assert NIL != finite_state_cascade_parser_p(v_object) : "! finite_state_cascade_parser.finite_state_cascade_parser_p(v_object) " + "finite_state_cascade_parser.finite_state_cascade_parser_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject _csetf_fscp_transducers_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FINITE_STATE_CASCADE_PARSER_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_fscp_transducers(final SubLObject v_object, final SubLObject value) {
        assert NIL != finite_state_cascade_parser_p(v_object) : "! finite_state_cascade_parser.finite_state_cascade_parser_p(v_object) " + "finite_state_cascade_parser.finite_state_cascade_parser_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_fscp_lexer_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FINITE_STATE_CASCADE_PARSER_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_fscp_lexer(final SubLObject v_object, final SubLObject value) {
        assert NIL != finite_state_cascade_parser_p(v_object) : "! finite_state_cascade_parser.finite_state_cascade_parser_p(v_object) " + "finite_state_cascade_parser.finite_state_cascade_parser_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject make_finite_state_cascade_parser_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.finite_state_cascade_parser.$finite_state_cascade_parser_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($TRANSDUCERS)) {
                        _csetf_fscp_transducers(v_new, current_value);
                    } else {
                        if (pcase_var.eql($LEXER)) {
                            _csetf_fscp_lexer(v_new, current_value);
                        } else {
                            Errors.error($str_alt14$Invalid_slot__S_for_construction_, current_arg);
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_finite_state_cascade_parser(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.finite_state_cascade_parser.$finite_state_cascade_parser_native();
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

    /**
     *
     *
     * @param TRANSDUCERS
     * 		list; a list of finite-state-transducers
     * @return finite-state-cascade-parser; a new fscp created from TRANSDUCERS
     */
    @LispMethod(comment = "@param TRANSDUCERS\r\n\t\tlist; a list of finite-state-transducers\r\n@return finite-state-cascade-parser; a new fscp created from TRANSDUCERS")
    public static final SubLObject new_finite_state_cascade_parser_alt(SubLObject transducers, SubLObject lexer) {
        if (lexer == UNPROVIDED) {
            lexer = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!(transducers.isList() && (NIL != list_utilities.every_in_list(symbol_function(FINITE_STATE_TRANSDUCER_P), transducers, UNPROVIDED)))) {
                    Errors.error($str_alt16$_A_is_not_a_list_of_finite_state_, transducers);
                }
            }
            {
                SubLObject fscp = make_finite_state_cascade_parser(UNPROVIDED);
                _csetf_fscp_transducers(fscp, transducers);
                _csetf_fscp_lexer(fscp, lexer);
                return fscp;
            }
        }
    }

    /**
     *
     *
     * @param TRANSDUCERS
     * 		list; a list of finite-state-transducers
     * @return finite-state-cascade-parser; a new fscp created from TRANSDUCERS
     */
    @LispMethod(comment = "@param TRANSDUCERS\r\n\t\tlist; a list of finite-state-transducers\r\n@return finite-state-cascade-parser; a new fscp created from TRANSDUCERS")
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

    /**
     *
     *
     * @param FSCP
    finite-state-transducer
     * 		
     * @param SEQUENCE
    sequence
     * 		
     * @return SEQUENCEP; a sequence of objects parsed by FSCP from SEQUENCE
     */
    @LispMethod(comment = "@param FSCP\nfinite-state-transducer\r\n\t\t\r\n@param SEQUENCE\nsequence\r\n\t\t\r\n@return SEQUENCEP; a sequence of objects parsed by FSCP from SEQUENCE")
    public static final SubLObject fscp_parse_alt(SubLObject fscp, SubLObject sequence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(fscp, FINITE_STATE_CASCADE_PARSER_P);
            SubLTrampolineFile.checkType(sequence, SEQUENCEP);
            {
                SubLObject parse = sequence;
                if (NIL != fscp_lexer(fscp)) {
                    funcall(fscp_lexer(fscp), sequence);
                }
                {
                    SubLObject cdolist_list_var = fscp_transducers(fscp);
                    SubLObject fst = NIL;
                    for (fst = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , fst = cdolist_list_var.first()) {
                        {
                            SubLObject stratum = NIL;
                            SubLObject some_matchP = NIL;
                            SubLObject input = NIL;
                            SubLObject match = NIL;
                            SubLObject length = NIL;
                            for (input = parse, match = finite_state_transducer.fst_match(fst, input), length = finite_state_transducer.fst_current_token_index(fst); NIL == list_utilities.zero_length_p(input); input = strie.sequence_slice(input, length, UNPROVIDED) , match = finite_state_transducer.fst_match(fst, input) , length = finite_state_transducer.fst_current_token_index(fst)) {
                                if (NIL != match) {
                                    some_matchP = T;
                                } else {
                                    match = elt(input, ZERO_INTEGER);
                                    length = ONE_INTEGER;
                                }
                                stratum = cons(match, stratum);
                            }
                            if (NIL != some_matchP) {
                                {
                                    SubLObject revised_parse = nreverse(stratum);
                                    if (!parse.equalp(revised_parse)) {
                                        if (NIL != parsing_vars.$fscp_verboseP$.getDynamicValue(thread)) {
                                            format(T, $str_alt18$___S_produced_____S__, fst, revised_parse);
                                        }
                                        parse = revised_parse;
                                    }
                                }
                            }
                        }
                    }
                }
                return parse;
            }
        }
    }

    /**
     *
     *
     * @param FSCP
    finite-state-transducer
     * 		
     * @param SEQUENCE
    sequence
     * 		
     * @return SEQUENCEP; a sequence of objects parsed by FSCP from SEQUENCE
     */
    @LispMethod(comment = "@param FSCP\nfinite-state-transducer\r\n\t\t\r\n@param SEQUENCE\nsequence\r\n\t\t\r\n@return SEQUENCEP; a sequence of objects parsed by FSCP from SEQUENCE")
    public static SubLObject fscp_parse(final SubLObject fscp, final SubLObject sequence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != finite_state_cascade_parser_p(fscp) : "! finite_state_cascade_parser.finite_state_cascade_parser_p(fscp) " + ("finite_state_cascade_parser.finite_state_cascade_parser_p(fscp) " + "CommonSymbols.NIL != finite_state_cascade_parser.finite_state_cascade_parser_p(fscp) ") + fscp;
        assert NIL != sequencep(sequence) : "! sequencep(sequence) " + ("Types.sequencep(sequence) " + "CommonSymbols.NIL != Types.sequencep(sequence) ") + sequence;
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
        declareFunction("finite_state_cascade_parser_print_function_trampoline", "FINITE-STATE-CASCADE-PARSER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("finite_state_cascade_parser_p", "FINITE-STATE-CASCADE-PARSER-P", 1, 0, false);
        new finite_state_cascade_parser.$finite_state_cascade_parser_p$UnaryFunction();
        declareFunction("fscp_transducers", "FSCP-TRANSDUCERS", 1, 0, false);
        declareFunction("fscp_lexer", "FSCP-LEXER", 1, 0, false);
        declareFunction("_csetf_fscp_transducers", "_CSETF-FSCP-TRANSDUCERS", 2, 0, false);
        declareFunction("_csetf_fscp_lexer", "_CSETF-FSCP-LEXER", 2, 0, false);
        declareFunction("make_finite_state_cascade_parser", "MAKE-FINITE-STATE-CASCADE-PARSER", 0, 1, false);
        declareFunction("visit_defstruct_finite_state_cascade_parser", "VISIT-DEFSTRUCT-FINITE-STATE-CASCADE-PARSER", 2, 0, false);
        declareFunction("visit_defstruct_object_finite_state_cascade_parser_method", "VISIT-DEFSTRUCT-OBJECT-FINITE-STATE-CASCADE-PARSER-METHOD", 2, 0, false);
        declareFunction("new_finite_state_cascade_parser", "NEW-FINITE-STATE-CASCADE-PARSER", 1, 1, false);
        declareFunction("fscp_parse", "FSCP-PARSE", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_finite_state_cascade_parser_file() {
        defconstant("*DTP-FINITE-STATE-CASCADE-PARSER*", FINITE_STATE_CASCADE_PARSER);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(makeSymbol("TRANSDUCERS"), makeSymbol("LEXER"));

    static private final SubLList $list_alt3 = list(makeKeyword("TRANSDUCERS"), makeKeyword("LEXER"));

    public static SubLObject setup_finite_state_cascade_parser_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_finite_state_cascade_parser$.getGlobalValue(), symbol_function(FINITE_STATE_CASCADE_PARSER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(FSCP_TRANSDUCERS, _CSETF_FSCP_TRANSDUCERS);
        def_csetf(FSCP_LEXER, _CSETF_FSCP_LEXER);
        identity(FINITE_STATE_CASCADE_PARSER);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_finite_state_cascade_parser$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_FINITE_STATE_CASCADE_PARSER_METHOD));
        return NIL;
    }

    static private final SubLList $list_alt4 = list(makeSymbol("FSCP-TRANSDUCERS"), makeSymbol("FSCP-LEXER"));

    static private final SubLList $list_alt5 = list(makeSymbol("_CSETF-FSCP-TRANSDUCERS"), makeSymbol("_CSETF-FSCP-LEXER"));

    @Override
    public void declareFunctions() {
        declare_finite_state_cascade_parser_file();
    }

    @Override
    public void initializeVariables() {
        init_finite_state_cascade_parser_file();
    }

    static private final SubLString $str_alt14$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    @Override
    public void runTopLevelForms() {
        setup_finite_state_cascade_parser_file();
    }

    static {
    }

    static private final SubLString $str_alt16$_A_is_not_a_list_of_finite_state_ = makeString("~A is not a list of finite-state-transducers");

    public static final class $finite_state_cascade_parser_native extends SubLStructNative {
        public SubLObject $transducers;

        public SubLObject $lexer;

        private static final SubLStructDeclNative structDecl;

        public $finite_state_cascade_parser_native() {
            finite_state_cascade_parser.$finite_state_cascade_parser_native.this.$transducers = Lisp.NIL;
            finite_state_cascade_parser.$finite_state_cascade_parser_native.this.$lexer = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return finite_state_cascade_parser.$finite_state_cascade_parser_native.this.$transducers;
        }

        @Override
        public SubLObject getField3() {
            return finite_state_cascade_parser.$finite_state_cascade_parser_native.this.$lexer;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return finite_state_cascade_parser.$finite_state_cascade_parser_native.this.$transducers = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return finite_state_cascade_parser.$finite_state_cascade_parser_native.this.$lexer = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.finite_state_cascade_parser.$finite_state_cascade_parser_native.class, FINITE_STATE_CASCADE_PARSER, FINITE_STATE_CASCADE_PARSER_P, $list2, $list3, new String[]{ "$transducers", "$lexer" }, $list4, $list5, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    static private final SubLString $str_alt18$___S_produced_____S__ = makeString("~&~S produced:~% ~S~%");

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
