package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class finite_state_cascade_parser extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.finite_state_cascade_parser";
    public static final String myFingerPrint = "cc741cbe30e07497ede96902e8c8994bb0cb531cc17e870fa66bd4969e37a769";
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-cascade-parser.lisp", position = 1889L)
    public static SubLSymbol $dtp_finite_state_cascade_parser$;
    private static final SubLSymbol $sym0$FINITE_STATE_CASCADE_PARSER;
    private static final SubLSymbol $sym1$FINITE_STATE_CASCADE_PARSER_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym7$FINITE_STATE_CASCADE_PARSER_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$FSCP_TRANSDUCERS;
    private static final SubLSymbol $sym10$_CSETF_FSCP_TRANSDUCERS;
    private static final SubLSymbol $sym11$FSCP_LEXER;
    private static final SubLSymbol $sym12$_CSETF_FSCP_LEXER;
    private static final SubLSymbol $kw13$TRANSDUCERS;
    private static final SubLSymbol $kw14$LEXER;
    private static final SubLString $str15$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw16$BEGIN;
    private static final SubLSymbol $sym17$MAKE_FINITE_STATE_CASCADE_PARSER;
    private static final SubLSymbol $kw18$SLOT;
    private static final SubLSymbol $kw19$END;
    private static final SubLSymbol $sym20$VISIT_DEFSTRUCT_OBJECT_FINITE_STATE_CASCADE_PARSER_METHOD;
    private static final SubLSymbol $sym21$FINITE_STATE_TRANSDUCER_P;
    private static final SubLString $str22$_A_is_not_a_list_of_finite_state_;
    private static final SubLSymbol $sym23$SEQUENCEP;
    private static final SubLString $str24$___S_produced_____S__;
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-cascade-parser.lisp", position = 1889L)
    public static SubLObject finite_state_cascade_parser_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)finite_state_cascade_parser.ZERO_INTEGER);
        return (SubLObject)finite_state_cascade_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-cascade-parser.lisp", position = 1889L)
    public static SubLObject finite_state_cascade_parser_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $finite_state_cascade_parser_native.class) ? finite_state_cascade_parser.T : finite_state_cascade_parser.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-cascade-parser.lisp", position = 1889L)
    public static SubLObject fscp_transducers(final SubLObject v_object) {
        assert finite_state_cascade_parser.NIL != finite_state_cascade_parser_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-cascade-parser.lisp", position = 1889L)
    public static SubLObject fscp_lexer(final SubLObject v_object) {
        assert finite_state_cascade_parser.NIL != finite_state_cascade_parser_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-cascade-parser.lisp", position = 1889L)
    public static SubLObject _csetf_fscp_transducers(final SubLObject v_object, final SubLObject value) {
        assert finite_state_cascade_parser.NIL != finite_state_cascade_parser_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-cascade-parser.lisp", position = 1889L)
    public static SubLObject _csetf_fscp_lexer(final SubLObject v_object, final SubLObject value) {
        assert finite_state_cascade_parser.NIL != finite_state_cascade_parser_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-cascade-parser.lisp", position = 1889L)
    public static SubLObject make_finite_state_cascade_parser(SubLObject arglist) {
        if (arglist == finite_state_cascade_parser.UNPROVIDED) {
            arglist = (SubLObject)finite_state_cascade_parser.NIL;
        }
        final SubLObject v_new = (SubLObject)new $finite_state_cascade_parser_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)finite_state_cascade_parser.NIL, next = arglist; finite_state_cascade_parser.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)finite_state_cascade_parser.$kw13$TRANSDUCERS)) {
                _csetf_fscp_transducers(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)finite_state_cascade_parser.$kw14$LEXER)) {
                _csetf_fscp_lexer(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)finite_state_cascade_parser.$str15$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-cascade-parser.lisp", position = 1889L)
    public static SubLObject visit_defstruct_finite_state_cascade_parser(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)finite_state_cascade_parser.$kw16$BEGIN, (SubLObject)finite_state_cascade_parser.$sym17$MAKE_FINITE_STATE_CASCADE_PARSER, (SubLObject)finite_state_cascade_parser.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)finite_state_cascade_parser.$kw18$SLOT, (SubLObject)finite_state_cascade_parser.$kw13$TRANSDUCERS, fscp_transducers(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)finite_state_cascade_parser.$kw18$SLOT, (SubLObject)finite_state_cascade_parser.$kw14$LEXER, fscp_lexer(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)finite_state_cascade_parser.$kw19$END, (SubLObject)finite_state_cascade_parser.$sym17$MAKE_FINITE_STATE_CASCADE_PARSER, (SubLObject)finite_state_cascade_parser.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-cascade-parser.lisp", position = 1889L)
    public static SubLObject visit_defstruct_object_finite_state_cascade_parser_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_finite_state_cascade_parser(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-cascade-parser.lisp", position = 2174L)
    public static SubLObject new_finite_state_cascade_parser(final SubLObject transducers, SubLObject lexer) {
        if (lexer == finite_state_cascade_parser.UNPROVIDED) {
            lexer = (SubLObject)finite_state_cascade_parser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (finite_state_cascade_parser.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (!transducers.isList() || finite_state_cascade_parser.NIL == list_utilities.every_in_list(Symbols.symbol_function((SubLObject)finite_state_cascade_parser.$sym21$FINITE_STATE_TRANSDUCER_P), transducers, (SubLObject)finite_state_cascade_parser.UNPROVIDED))) {
            Errors.error((SubLObject)finite_state_cascade_parser.$str22$_A_is_not_a_list_of_finite_state_, transducers);
        }
        final SubLObject fscp = make_finite_state_cascade_parser((SubLObject)finite_state_cascade_parser.UNPROVIDED);
        _csetf_fscp_transducers(fscp, transducers);
        _csetf_fscp_lexer(fscp, lexer);
        return fscp;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-cascade-parser.lisp", position = 2703L)
    public static SubLObject fscp_parse(final SubLObject fscp, final SubLObject sequence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert finite_state_cascade_parser.NIL != finite_state_cascade_parser_p(fscp) : fscp;
        assert finite_state_cascade_parser.NIL != Types.sequencep(sequence) : sequence;
        SubLObject parse = sequence;
        if (finite_state_cascade_parser.NIL != fscp_lexer(fscp)) {
            Functions.funcall(fscp_lexer(fscp), sequence);
        }
        SubLObject cdolist_list_var = fscp_transducers(fscp);
        SubLObject fst = (SubLObject)finite_state_cascade_parser.NIL;
        fst = cdolist_list_var.first();
        while (finite_state_cascade_parser.NIL != cdolist_list_var) {
            SubLObject stratum = (SubLObject)finite_state_cascade_parser.NIL;
            SubLObject some_matchP = (SubLObject)finite_state_cascade_parser.NIL;
            SubLObject input = (SubLObject)finite_state_cascade_parser.NIL;
            SubLObject match = (SubLObject)finite_state_cascade_parser.NIL;
            SubLObject length = (SubLObject)finite_state_cascade_parser.NIL;
            input = parse;
            match = finite_state_transducer.fst_match(fst, input);
            for (length = finite_state_transducer.fst_current_token_index(fst); finite_state_cascade_parser.NIL == list_utilities.zero_length_p(input); input = strie.sequence_slice(input, length, (SubLObject)finite_state_cascade_parser.UNPROVIDED), match = finite_state_transducer.fst_match(fst, input), length = finite_state_transducer.fst_current_token_index(fst)) {
                if (finite_state_cascade_parser.NIL != match) {
                    some_matchP = (SubLObject)finite_state_cascade_parser.T;
                }
                else {
                    match = Sequences.elt(input, (SubLObject)finite_state_cascade_parser.ZERO_INTEGER);
                    length = (SubLObject)finite_state_cascade_parser.ONE_INTEGER;
                }
                stratum = (SubLObject)ConsesLow.cons(match, stratum);
            }
            if (finite_state_cascade_parser.NIL != some_matchP) {
                final SubLObject revised_parse = Sequences.nreverse(stratum);
                if (!parse.equalp(revised_parse)) {
                    if (finite_state_cascade_parser.NIL != parsing_vars.$fscp_verboseP$.getDynamicValue(thread)) {
                        PrintLow.format((SubLObject)finite_state_cascade_parser.T, (SubLObject)finite_state_cascade_parser.$str24$___S_produced_____S__, fst, revised_parse);
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
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_cascade_parser", "finite_state_cascade_parser_print_function_trampoline", "FINITE-STATE-CASCADE-PARSER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_cascade_parser", "finite_state_cascade_parser_p", "FINITE-STATE-CASCADE-PARSER-P", 1, 0, false);
        new $finite_state_cascade_parser_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_cascade_parser", "fscp_transducers", "FSCP-TRANSDUCERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_cascade_parser", "fscp_lexer", "FSCP-LEXER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_cascade_parser", "_csetf_fscp_transducers", "_CSETF-FSCP-TRANSDUCERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_cascade_parser", "_csetf_fscp_lexer", "_CSETF-FSCP-LEXER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_cascade_parser", "make_finite_state_cascade_parser", "MAKE-FINITE-STATE-CASCADE-PARSER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_cascade_parser", "visit_defstruct_finite_state_cascade_parser", "VISIT-DEFSTRUCT-FINITE-STATE-CASCADE-PARSER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_cascade_parser", "visit_defstruct_object_finite_state_cascade_parser_method", "VISIT-DEFSTRUCT-OBJECT-FINITE-STATE-CASCADE-PARSER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_cascade_parser", "new_finite_state_cascade_parser", "NEW-FINITE-STATE-CASCADE-PARSER", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_cascade_parser", "fscp_parse", "FSCP-PARSE", 2, 0, false);
        return (SubLObject)finite_state_cascade_parser.NIL;
    }
    
    public static SubLObject init_finite_state_cascade_parser_file() {
        finite_state_cascade_parser.$dtp_finite_state_cascade_parser$ = SubLFiles.defconstant("*DTP-FINITE-STATE-CASCADE-PARSER*", (SubLObject)finite_state_cascade_parser.$sym0$FINITE_STATE_CASCADE_PARSER);
        return (SubLObject)finite_state_cascade_parser.NIL;
    }
    
    public static SubLObject setup_finite_state_cascade_parser_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), finite_state_cascade_parser.$dtp_finite_state_cascade_parser$.getGlobalValue(), Symbols.symbol_function((SubLObject)finite_state_cascade_parser.$sym7$FINITE_STATE_CASCADE_PARSER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)finite_state_cascade_parser.$list8);
        Structures.def_csetf((SubLObject)finite_state_cascade_parser.$sym9$FSCP_TRANSDUCERS, (SubLObject)finite_state_cascade_parser.$sym10$_CSETF_FSCP_TRANSDUCERS);
        Structures.def_csetf((SubLObject)finite_state_cascade_parser.$sym11$FSCP_LEXER, (SubLObject)finite_state_cascade_parser.$sym12$_CSETF_FSCP_LEXER);
        Equality.identity((SubLObject)finite_state_cascade_parser.$sym0$FINITE_STATE_CASCADE_PARSER);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), finite_state_cascade_parser.$dtp_finite_state_cascade_parser$.getGlobalValue(), Symbols.symbol_function((SubLObject)finite_state_cascade_parser.$sym20$VISIT_DEFSTRUCT_OBJECT_FINITE_STATE_CASCADE_PARSER_METHOD));
        return (SubLObject)finite_state_cascade_parser.NIL;
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
    
    static {
        me = (SubLFile)new finite_state_cascade_parser();
        finite_state_cascade_parser.$dtp_finite_state_cascade_parser$ = null;
        $sym0$FINITE_STATE_CASCADE_PARSER = SubLObjectFactory.makeSymbol("FINITE-STATE-CASCADE-PARSER");
        $sym1$FINITE_STATE_CASCADE_PARSER_P = SubLObjectFactory.makeSymbol("FINITE-STATE-CASCADE-PARSER-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRANSDUCERS"), (SubLObject)SubLObjectFactory.makeSymbol("LEXER"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TRANSDUCERS"), (SubLObject)SubLObjectFactory.makeKeyword("LEXER"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FSCP-TRANSDUCERS"), (SubLObject)SubLObjectFactory.makeSymbol("FSCP-LEXER"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FSCP-TRANSDUCERS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FSCP-LEXER"));
        $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym7$FINITE_STATE_CASCADE_PARSER_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("FINITE-STATE-CASCADE-PARSER-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("FINITE-STATE-CASCADE-PARSER-P"));
        $sym9$FSCP_TRANSDUCERS = SubLObjectFactory.makeSymbol("FSCP-TRANSDUCERS");
        $sym10$_CSETF_FSCP_TRANSDUCERS = SubLObjectFactory.makeSymbol("_CSETF-FSCP-TRANSDUCERS");
        $sym11$FSCP_LEXER = SubLObjectFactory.makeSymbol("FSCP-LEXER");
        $sym12$_CSETF_FSCP_LEXER = SubLObjectFactory.makeSymbol("_CSETF-FSCP-LEXER");
        $kw13$TRANSDUCERS = SubLObjectFactory.makeKeyword("TRANSDUCERS");
        $kw14$LEXER = SubLObjectFactory.makeKeyword("LEXER");
        $str15$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw16$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym17$MAKE_FINITE_STATE_CASCADE_PARSER = SubLObjectFactory.makeSymbol("MAKE-FINITE-STATE-CASCADE-PARSER");
        $kw18$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw19$END = SubLObjectFactory.makeKeyword("END");
        $sym20$VISIT_DEFSTRUCT_OBJECT_FINITE_STATE_CASCADE_PARSER_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-FINITE-STATE-CASCADE-PARSER-METHOD");
        $sym21$FINITE_STATE_TRANSDUCER_P = SubLObjectFactory.makeSymbol("FINITE-STATE-TRANSDUCER-P");
        $str22$_A_is_not_a_list_of_finite_state_ = SubLObjectFactory.makeString("~A is not a list of finite-state-transducers");
        $sym23$SEQUENCEP = SubLObjectFactory.makeSymbol("SEQUENCEP");
        $str24$___S_produced_____S__ = SubLObjectFactory.makeString("~&~S produced:~% ~S~%");
    }
    
    public static final class $finite_state_cascade_parser_native extends SubLStructNative
    {
        public SubLObject $transducers;
        public SubLObject $lexer;
        private static final SubLStructDeclNative structDecl;
        
        public $finite_state_cascade_parser_native() {
            this.$transducers = (SubLObject)CommonSymbols.NIL;
            this.$lexer = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$finite_state_cascade_parser_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$finite_state_cascade_parser_native.class, finite_state_cascade_parser.$sym0$FINITE_STATE_CASCADE_PARSER, finite_state_cascade_parser.$sym1$FINITE_STATE_CASCADE_PARSER_P, finite_state_cascade_parser.$list2, finite_state_cascade_parser.$list3, new String[] { "$transducers", "$lexer" }, finite_state_cascade_parser.$list4, finite_state_cascade_parser.$list5, finite_state_cascade_parser.$sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $finite_state_cascade_parser_p$UnaryFunction extends UnaryFunction
    {
        public $finite_state_cascade_parser_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FINITE-STATE-CASCADE-PARSER-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return finite_state_cascade_parser.finite_state_cascade_parser_p(arg1);
        }
    }
}

/*

	Total time: 57 ms
	
*/