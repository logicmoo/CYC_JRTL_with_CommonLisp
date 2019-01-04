package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.cycjava.cycl.pph_methods_lexicon;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_term_strings extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_term_strings";
    public static final String myFingerPrint = "efd131bd0a0ae7a325638a5a4585b292477ff7ba1762dc53f7ed032ef4d1421b";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-term-strings.lisp", position = 4050L)
    public static SubLSymbol $term_strings_defining_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-term-strings.lisp", position = 4256L)
    private static SubLSymbol $term_strings_check_default_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-term-strings.lisp", position = 4339L)
    private static SubLSymbol $term_strings_unify_default_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-term-strings.lisp", position = 5300L)
    private static SubLSymbol $expected_number_of_terms_per_string$;
    private static final SubLObject $const0$termStrings;
    private static final SubLSymbol $kw1$TERMSTRINGS_X_Y_POS;
    private static final SubLList $list2;
    private static final SubLSymbol $kw3$REMOVAL_TERM_STRINGS_CHECK_POS;
    private static final SubLList $list4;
    private static final SubLSymbol $kw5$REMOVAL_TERM_STRINGS_CHECK_NEG;
    private static final SubLList $list6;
    private static final SubLSymbol $kw7$ALL;
    private static final SubLSymbol $sym8$_TERM_STRINGS_DEFINING_MT_;
    private static final SubLObject $const9$BaseKB;
    private static final SubLSymbol $kw10$OPAQUE;
    private static final SubLSymbol $kw11$TRUE_MON;
    private static final SubLSymbol $kw12$REMOVAL_TERM_STRINGS_UNIFY;
    private static final SubLList $list13;
    private static final SubLSymbol $kw14$REMOVAL_TERM_STRINGS_LOOKUP;
    private static final SubLList $list15;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-term-strings.lisp", position = 1200L)
    public static SubLObject removal_term_strings_check_pos_output_check(final SubLObject v_term, final SubLObject string) {
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_term_strings.NIL != list_utilities.member_equalP(string, inference_strings_for_term(v_term, (SubLObject)removal_modules_term_strings.UNPROVIDED, (SubLObject)removal_modules_term_strings.UNPROVIDED)) || removal_modules_term_strings.NIL != list_utilities.member_equalP(v_term, inference_terms_for_string(string)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-term-strings.lisp", position = 2069L)
    public static SubLObject removal_term_strings_check_neg_output_check(final SubLObject v_term, final SubLObject string) {
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_term_strings.NIL == removal_term_strings_check_pos_output_check(v_term, string));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-term-strings.lisp", position = 3527L)
    public static SubLObject inference_strings_for_term(final SubLObject v_term, SubLObject nl_preds, SubLObject lexical_onlyP) {
        if (nl_preds == removal_modules_term_strings.UNPROVIDED) {
            nl_preds = (SubLObject)removal_modules_term_strings.$kw7$ALL;
        }
        if (lexical_onlyP == removal_modules_term_strings.UNPROVIDED) {
            lexical_onlyP = (SubLObject)removal_modules_term_strings.NIL;
        }
        return pph_methods_lexicon.inference_strings_for_term_int(v_term, nl_preds, lexical_onlyP, (SubLObject)removal_modules_term_strings.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-term-strings.lisp", position = 3825L)
    public static SubLObject inference_terms_for_string(final SubLObject string) {
        return lexicon_accessors.all_parsing_denots_of_string(string, (SubLObject)removal_modules_term_strings.UNPROVIDED, (SubLObject)removal_modules_term_strings.UNPROVIDED, (SubLObject)removal_modules_term_strings.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-term-strings.lisp", position = 4120L)
    public static SubLObject make_term_strings_hl_support(final SubLObject formula) {
        return arguments.make_hl_support((SubLObject)removal_modules_term_strings.$kw10$OPAQUE, formula, removal_modules_term_strings.$term_strings_defining_mt$.getGlobalValue(), (SubLObject)removal_modules_term_strings.$kw11$TRUE_MON);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-term-strings.lisp", position = 4493L)
    public static SubLObject removal_term_strings_unify_output_generate(final SubLObject v_term) {
        return iteration.new_list_iterator(inference_strings_for_term(v_term, (SubLObject)removal_modules_term_strings.UNPROVIDED, (SubLObject)removal_modules_term_strings.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-term-strings.lisp", position = 5461L)
    public static SubLObject removal_term_strings_lookup_output_generate(final SubLObject string) {
        return iteration.new_list_iterator(inference_terms_for_string(string));
    }
    
    public static SubLObject declare_removal_modules_term_strings_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_term_strings", "removal_term_strings_check_pos_output_check", "REMOVAL-TERM-STRINGS-CHECK-POS-OUTPUT-CHECK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_term_strings", "removal_term_strings_check_neg_output_check", "REMOVAL-TERM-STRINGS-CHECK-NEG-OUTPUT-CHECK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_term_strings", "inference_strings_for_term", "INFERENCE-STRINGS-FOR-TERM", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_term_strings", "inference_terms_for_string", "INFERENCE-TERMS-FOR-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_term_strings", "make_term_strings_hl_support", "MAKE-TERM-STRINGS-HL-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_term_strings", "removal_term_strings_unify_output_generate", "REMOVAL-TERM-STRINGS-UNIFY-OUTPUT-GENERATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_term_strings", "removal_term_strings_lookup_output_generate", "REMOVAL-TERM-STRINGS-LOOKUP-OUTPUT-GENERATE", 1, 0, false);
        return (SubLObject)removal_modules_term_strings.NIL;
    }
    
    public static SubLObject init_removal_modules_term_strings_file() {
        removal_modules_term_strings.$term_strings_defining_mt$ = SubLFiles.deflexical("*TERM-STRINGS-DEFINING-MT*", (removal_modules_term_strings.NIL != Symbols.boundp((SubLObject)removal_modules_term_strings.$sym8$_TERM_STRINGS_DEFINING_MT_)) ? removal_modules_term_strings.$term_strings_defining_mt$.getGlobalValue() : removal_modules_term_strings.$const9$BaseKB);
        removal_modules_term_strings.$term_strings_check_default_cost$ = SubLFiles.deflexical("*TERM-STRINGS-CHECK-DEFAULT-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        removal_modules_term_strings.$term_strings_unify_default_cost$ = SubLFiles.deflexical("*TERM-STRINGS-UNIFY-DEFAULT-COST*", (SubLObject)removal_modules_term_strings.ONE_INTEGER);
        removal_modules_term_strings.$expected_number_of_terms_per_string$ = SubLFiles.deflexical("*EXPECTED-NUMBER-OF-TERMS-PER-STRING*", (SubLObject)removal_modules_term_strings.ONE_INTEGER);
        return (SubLObject)removal_modules_term_strings.NIL;
    }
    
    public static SubLObject setup_removal_modules_term_strings_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_term_strings.$const0$termStrings);
        preference_modules.inference_preference_module((SubLObject)removal_modules_term_strings.$kw1$TERMSTRINGS_X_Y_POS, (SubLObject)removal_modules_term_strings.$list2);
        inference_modules.inference_removal_module((SubLObject)removal_modules_term_strings.$kw3$REMOVAL_TERM_STRINGS_CHECK_POS, (SubLObject)removal_modules_term_strings.$list4);
        inference_modules.inference_removal_module((SubLObject)removal_modules_term_strings.$kw5$REMOVAL_TERM_STRINGS_CHECK_NEG, (SubLObject)removal_modules_term_strings.$list6);
        subl_macro_promotions.declare_defglobal((SubLObject)removal_modules_term_strings.$sym8$_TERM_STRINGS_DEFINING_MT_);
        mt_vars.note_mt_var((SubLObject)removal_modules_term_strings.$sym8$_TERM_STRINGS_DEFINING_MT_, removal_modules_term_strings.$const0$termStrings);
        inference_modules.inference_removal_module((SubLObject)removal_modules_term_strings.$kw12$REMOVAL_TERM_STRINGS_UNIFY, (SubLObject)removal_modules_term_strings.$list13);
        inference_modules.inference_removal_module((SubLObject)removal_modules_term_strings.$kw14$REMOVAL_TERM_STRINGS_LOOKUP, (SubLObject)removal_modules_term_strings.$list15);
        return (SubLObject)removal_modules_term_strings.NIL;
    }
    
    public void declareFunctions() {
        declare_removal_modules_term_strings_file();
    }
    
    public void initializeVariables() {
        init_removal_modules_term_strings_file();
    }
    
    public void runTopLevelForms() {
        setup_removal_modules_term_strings_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_term_strings();
        removal_modules_term_strings.$term_strings_defining_mt$ = null;
        removal_modules_term_strings.$term_strings_check_default_cost$ = null;
        removal_modules_term_strings.$term_strings_unify_default_cost$ = null;
        removal_modules_term_strings.$expected_number_of_terms_per_string$ = null;
        $const0$termStrings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStrings"));
        $kw1$TERMSTRINGS_X_Y_POS = SubLObjectFactory.makeKeyword("TERMSTRINGS-X-Y-POS");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStrings")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStrings")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("GROSSLY-DISPREFERRED"));
        $kw3$REMOVAL_TERM_STRINGS_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-TERM-STRINGS-CHECK-POS");
        $list4 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStrings")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStrings")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*TERM-STRINGS-CHECK-DEFAULT-COST*"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStrings")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("TERM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TERM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-TERM-STRINGS-CHECK-POS-OUTPUT-CHECK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TERM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("TERM-PHRASES"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$termStrings <fully-bound-p> <stringp>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$termStrings #$Dog \"Dog\")") });
        $kw5$REMOVAL_TERM_STRINGS_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-TERM-STRINGS-CHECK-NEG");
        $list6 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStrings")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStrings")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*TERM-STRINGS-CHECK-DEFAULT-COST*"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStrings")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("TERM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TERM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-TERM-STRINGS-CHECK-NEG-OUTPUT-CHECK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TERM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")))), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeKeyword("TERM-PHRASES"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$termStrings <fully-bound-p> <stringp>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$termStrings #$Dog \"Cat\"))") });
        $kw7$ALL = SubLObjectFactory.makeKeyword("ALL");
        $sym8$_TERM_STRINGS_DEFINING_MT_ = SubLObjectFactory.makeSymbol("*TERM-STRINGS-DEFINING-MT*");
        $const9$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $kw10$OPAQUE = SubLObjectFactory.makeKeyword("OPAQUE");
        $kw11$TRUE_MON = SubLObjectFactory.makeKeyword("TRUE-MON");
        $kw12$REMOVAL_TERM_STRINGS_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-TERM-STRINGS-UNIFY");
        $list13 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStrings")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStrings")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE")), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*TERM-STRINGS-UNIFY-DEFAULT-COST*"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStrings")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("TERM")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-TERM-STRINGS-UNIFY-OUTPUT-GENERATE"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStrings")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TERM")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("TERM-PHRASES"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$termStrings <fully-bound-p> <variable-p>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$termStrings #$Dog ?STRING)") });
        $kw14$REMOVAL_TERM_STRINGS_LOOKUP = SubLObjectFactory.makeKeyword("REMOVAL-TERM-STRINGS-LOOKUP");
        $list15 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStrings")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStrings")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*EXPECTED-NUMBER-OF-TERMS-PER-STRING*"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStrings")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-TERM-STRINGS-LOOKUP-OUTPUT-GENERATE"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStrings")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("TERM-PHRASES"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$termStrings <not-fully-bound-p> <stringp>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$termStrings ?TERM \"Dog\")") });
    }
}

/*

	Total time: 40 ms
	
*/