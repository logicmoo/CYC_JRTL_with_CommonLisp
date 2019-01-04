package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.regular_expression_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.regular_expressions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_regular_expressions extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_regular_expressions";
    public static final String myFingerPrint = "fdb2f380e66a8821ff611aa2ca888c386f7a9488894f7861d7788024e017f286";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-regular-expressions.lisp", position = 1392L)
    public static SubLSymbol $regex_string_match_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-regular-expressions.lisp", position = 1472L)
    private static SubLSymbol $default_regex_string_match_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-regular-expressions.lisp", position = 5960L)
    public static SubLSymbol $regex_string_match_case_insensitive_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-regular-expressions.lisp", position = 6073L)
    private static SubLSymbol $default_regex_string_match_case_insensitive_cost$;
    private static final SubLObject $const0$regexStringMatch;
    private static final SubLSymbol $kw1$POS;
    private static final SubLSymbol $sym2$_REGEX_STRING_MATCH_MT_;
    private static final SubLObject $const3$BaseKB;
    private static final SubLSymbol $kw4$REMOVAL_REGEX_STRING_MATCH_POS;
    private static final SubLList $list5;
    private static final SubLSymbol $kw6$REMOVAL_REGEX_STRING_MATCH_NEG;
    private static final SubLList $list7;
    private static final SubLSymbol $sym8$STRINGP;
    private static final SubLSymbol $kw9$REMOVAL_REGEX_STRING_MATCH_WITH_BINDINGS_POS;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$REGEX_STRING_MATCH_WITH_BINDINGS;
    private static final SubLSymbol $kw12$OPAQUE;
    private static final SubLSymbol $kw13$TRUE_MON;
    private static final SubLObject $const14$regexStringMatch_CaseInsensitive;
    private static final SubLSymbol $sym15$_REGEX_STRING_MATCH_CASE_INSENSITIVE_MT_;
    private static final SubLSymbol $kw16$REMOVAL_REGEX_STRING_MATCH_CASE_INSENSITIVE_POS;
    private static final SubLList $list17;
    private static final SubLSymbol $kw18$REMOVAL_REGEX_STRING_MATCH_CASE_INSENSITIVE_NEG;
    private static final SubLList $list19;
    private static final SubLList $list20;
    private static final SubLSymbol $kw21$REMOVAL_REGEX_STRING_MATCH_WITH_BINDINGS_CASE_INSENSITIVE_POS;
    private static final SubLList $list22;
    private static final SubLSymbol $sym23$REGEX_STRING_MATCH_WITH_BINDINGS_CASE_INSENSITIVE;
    private static final SubLObject $const24$regexSubstringMatch;
    private static final SubLSymbol $kw25$META_REMOVAL_COMPLETELY_DECIDABLE_POS;
    private static final SubLSymbol $kw26$REMOVAL_COMPLETELY_DECIDABLE_NEG;
    private static final SubLSymbol $kw27$REMOVAL_REGEX_SUBSTRING_MATCH_POS;
    private static final SubLList $list28;
    private static final SubLSymbol $sym29$REMOVAL_REGEX_SUBSTRING_MATCH_ITERATOR;
    private static final SubLList $list30;
    private static final SubLList $list31;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-regular-expressions.lisp", position = 1708L)
    public static SubLObject removal_regex_string_match_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_regular_expressions.UNPROVIDED) {
            sense = (SubLObject)removal_modules_regular_expressions.NIL;
        }
        return regular_expressions.is_regular_expressions_support_availableP();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-regular-expressions.lisp", position = 3697L)
    public static SubLObject regex_string_match(final SubLObject regex_string, final SubLObject data_string) {
        assert removal_modules_regular_expressions.NIL != Types.stringp(regex_string) : regex_string;
        assert removal_modules_regular_expressions.NIL != Types.stringp(data_string) : data_string;
        return list_utilities.sublisp_boolean(regular_expression_utilities.offsets_of_regex_matches(regex_string, data_string, (SubLObject)removal_modules_regular_expressions.UNPROVIDED, (SubLObject)removal_modules_regular_expressions.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-regular-expressions.lisp", position = 4758L)
    public static SubLObject regex_string_match_with_bindings(final SubLObject asent, final SubLObject sense) {
        return regex_string_match_with_bindings_int(asent, sense, (SubLObject)removal_modules_regular_expressions.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-regular-expressions.lisp", position = 4894L)
    public static SubLObject regex_string_match_with_bindings_int(final SubLObject asent, final SubLObject sense, final SubLObject regex_options) {
        final SubLObject pattern = cycl_utilities.formula_arg1(asent, (SubLObject)removal_modules_regular_expressions.UNPROVIDED);
        final SubLObject string = cycl_utilities.formula_arg2(asent, (SubLObject)removal_modules_regular_expressions.UNPROVIDED);
        final SubLObject match_var_count = Numbers.subtract(el_utilities.formula_arity(asent, (SubLObject)removal_modules_regular_expressions.UNPROVIDED), (SubLObject)removal_modules_regular_expressions.TWO_INTEGER);
        final SubLObject matches = regular_expression_utilities.find_all_captured_matches_within_string_from_string(pattern, string, regex_options);
        final SubLObject result_sentence = el_utilities.make_formula(cycl_utilities.formula_arg0(asent), (SubLObject)ConsesLow.list(pattern, string), (SubLObject)removal_modules_regular_expressions.UNPROVIDED);
        final SubLObject too_few_matchesP = (SubLObject)removal_modules_regular_expressions.NIL;
        SubLObject cdotimes_end_var;
        SubLObject n;
        SubLObject current_match;
        SubLObject current_result_sentence;
        for (cdotimes_end_var = Sequences.length(matches), n = (SubLObject)removal_modules_regular_expressions.NIL, n = (SubLObject)removal_modules_regular_expressions.ZERO_INTEGER; n.numL(cdotimes_end_var); n = Numbers.add(n, (SubLObject)removal_modules_regular_expressions.ONE_INTEGER)) {
            current_match = ConsesLow.nth(n, matches);
            current_result_sentence = Sequences.cconcatenate(result_sentence, current_match);
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_regular_expressions.$kw12$OPAQUE, current_result_sentence, removal_modules_regular_expressions.$const3$BaseKB, (SubLObject)removal_modules_regular_expressions.$kw13$TRUE_MON), unification_utilities.asent_unify(asent, current_result_sentence, (SubLObject)removal_modules_regular_expressions.T, (SubLObject)removal_modules_regular_expressions.UNPROVIDED), (SubLObject)removal_modules_regular_expressions.UNPROVIDED);
        }
        return (SubLObject)removal_modules_regular_expressions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-regular-expressions.lisp", position = 6360L)
    public static SubLObject removal_regex_string_match_case_insensitive_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_regular_expressions.UNPROVIDED) {
            sense = (SubLObject)removal_modules_regular_expressions.NIL;
        }
        return regular_expressions.is_regular_expressions_support_availableP();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-regular-expressions.lisp", position = 8679L)
    public static SubLObject regex_string_match_case_insensitive(final SubLObject regex_string, final SubLObject data_string) {
        assert removal_modules_regular_expressions.NIL != Types.stringp(regex_string) : regex_string;
        assert removal_modules_regular_expressions.NIL != Types.stringp(data_string) : data_string;
        return list_utilities.sublisp_boolean(regular_expression_utilities.offsets_of_regex_matches(regex_string, data_string, (SubLObject)removal_modules_regular_expressions.$list20, (SubLObject)removal_modules_regular_expressions.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-regular-expressions.lisp", position = 9943L)
    public static SubLObject regex_string_match_with_bindings_case_insensitive(final SubLObject asent, final SubLObject sense) {
        return regex_string_match_with_bindings_int(asent, sense, (SubLObject)removal_modules_regular_expressions.$list20);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-regular-expressions.lisp", position = 12021L)
    public static SubLObject removal_regex_substring_match_iterator(final SubLObject values) {
        return removal_regex_substring_match_iterator_int(values, (SubLObject)removal_modules_regular_expressions.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-regular-expressions.lisp", position = 12156L)
    public static SubLObject removal_regex_substring_match_iterator_int(final SubLObject values, SubLObject regex_options) {
        if (regex_options == removal_modules_regular_expressions.UNPROVIDED) {
            regex_options = (SubLObject)removal_modules_regular_expressions.NIL;
        }
        SubLObject pattern = (SubLObject)removal_modules_regular_expressions.NIL;
        SubLObject data = (SubLObject)removal_modules_regular_expressions.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(values, values, (SubLObject)removal_modules_regular_expressions.$list30);
        pattern = values.first();
        SubLObject current = values.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, values, (SubLObject)removal_modules_regular_expressions.$list30);
        data = current.first();
        current = current.rest();
        final SubLObject index = (SubLObject)(current.isCons() ? current.first() : removal_modules_regular_expressions.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, values, (SubLObject)removal_modules_regular_expressions.$list30);
        current = current.rest();
        final SubLObject span = (SubLObject)(current.isCons() ? current.first() : removal_modules_regular_expressions.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, values, (SubLObject)removal_modules_regular_expressions.$list30);
        current = current.rest();
        if (removal_modules_regular_expressions.NIL == current) {
            final SubLObject matches = regular_expression_utilities.offsets_of_regex_matches(pattern, data, regex_options, (SubLObject)removal_modules_regular_expressions.UNPROVIDED);
            SubLObject results = (SubLObject)removal_modules_regular_expressions.NIL;
            SubLObject cdolist_list_var = matches;
            SubLObject match = (SubLObject)removal_modules_regular_expressions.NIL;
            match = cdolist_list_var.first();
            while (removal_modules_regular_expressions.NIL != cdolist_list_var) {
                SubLObject current_$2;
                final SubLObject datum_$1 = current_$2 = match;
                SubLObject the_start_index = (SubLObject)removal_modules_regular_expressions.NIL;
                SubLObject the_end_index = (SubLObject)removal_modules_regular_expressions.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$2, datum_$1, (SubLObject)removal_modules_regular_expressions.$list31);
                the_start_index = current_$2.first();
                current_$2 = (the_end_index = current_$2.rest());
                final SubLObject the_span = Numbers.subtract(the_end_index, the_start_index);
                final SubLObject input_asent = el_utilities.make_formula(removal_modules_regular_expressions.$const24$regexSubstringMatch, values, (SubLObject)removal_modules_regular_expressions.UNPROVIDED);
                final SubLObject answer_asent = el_utilities.make_formula(removal_modules_regular_expressions.$const24$regexSubstringMatch, (SubLObject)ConsesLow.list(pattern, data, the_start_index, the_span), (SubLObject)removal_modules_regular_expressions.UNPROVIDED);
                final SubLObject v_bindings = unification_utilities.gaf_asent_unify(input_asent, answer_asent, (SubLObject)removal_modules_regular_expressions.UNPROVIDED, (SubLObject)removal_modules_regular_expressions.UNPROVIDED);
                if (removal_modules_regular_expressions.NIL != v_bindings) {
                    results = (SubLObject)ConsesLow.cons(v_bindings, results);
                }
                cdolist_list_var = cdolist_list_var.rest();
                match = cdolist_list_var.first();
            }
            return iteration.new_list_iterator(results);
        }
        cdestructuring_bind.cdestructuring_bind_error(values, (SubLObject)removal_modules_regular_expressions.$list30);
        return (SubLObject)removal_modules_regular_expressions.NIL;
    }
    
    public static SubLObject declare_removal_modules_regular_expressions_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_regular_expressions", "removal_regex_string_match_required", "REMOVAL-REGEX-STRING-MATCH-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_regular_expressions", "regex_string_match", "REGEX-STRING-MATCH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_regular_expressions", "regex_string_match_with_bindings", "REGEX-STRING-MATCH-WITH-BINDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_regular_expressions", "regex_string_match_with_bindings_int", "REGEX-STRING-MATCH-WITH-BINDINGS-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_regular_expressions", "removal_regex_string_match_case_insensitive_required", "REMOVAL-REGEX-STRING-MATCH-CASE-INSENSITIVE-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_regular_expressions", "regex_string_match_case_insensitive", "REGEX-STRING-MATCH-CASE-INSENSITIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_regular_expressions", "regex_string_match_with_bindings_case_insensitive", "REGEX-STRING-MATCH-WITH-BINDINGS-CASE-INSENSITIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_regular_expressions", "removal_regex_substring_match_iterator", "REMOVAL-REGEX-SUBSTRING-MATCH-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_regular_expressions", "removal_regex_substring_match_iterator_int", "REMOVAL-REGEX-SUBSTRING-MATCH-ITERATOR-INT", 1, 1, false);
        return (SubLObject)removal_modules_regular_expressions.NIL;
    }
    
    public static SubLObject init_removal_modules_regular_expressions_file() {
        removal_modules_regular_expressions.$regex_string_match_mt$ = SubLFiles.deflexical("*REGEX-STRING-MATCH-MT*", (removal_modules_regular_expressions.NIL != Symbols.boundp((SubLObject)removal_modules_regular_expressions.$sym2$_REGEX_STRING_MATCH_MT_)) ? removal_modules_regular_expressions.$regex_string_match_mt$.getGlobalValue() : removal_modules_regular_expressions.$const3$BaseKB);
        removal_modules_regular_expressions.$default_regex_string_match_cost$ = SubLFiles.defparameter("*DEFAULT-REGEX-STRING-MATCH-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        removal_modules_regular_expressions.$regex_string_match_case_insensitive_mt$ = SubLFiles.deflexical("*REGEX-STRING-MATCH-CASE-INSENSITIVE-MT*", (removal_modules_regular_expressions.NIL != Symbols.boundp((SubLObject)removal_modules_regular_expressions.$sym15$_REGEX_STRING_MATCH_CASE_INSENSITIVE_MT_)) ? removal_modules_regular_expressions.$regex_string_match_case_insensitive_mt$.getGlobalValue() : removal_modules_regular_expressions.$const3$BaseKB);
        removal_modules_regular_expressions.$default_regex_string_match_case_insensitive_cost$ = SubLFiles.defparameter("*DEFAULT-REGEX-STRING-MATCH-CASE-INSENSITIVE-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        return (SubLObject)removal_modules_regular_expressions.NIL;
    }
    
    public static SubLObject setup_removal_modules_regular_expressions_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_regular_expressions.$const0$regexStringMatch);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_regular_expressions.$kw1$POS, removal_modules_regular_expressions.$const0$regexStringMatch, (SubLObject)removal_modules_regular_expressions.ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_regular_expressions.$kw1$POS, removal_modules_regular_expressions.$const0$regexStringMatch, (SubLObject)removal_modules_regular_expressions.TWO_INTEGER);
        subl_macro_promotions.declare_defglobal((SubLObject)removal_modules_regular_expressions.$sym2$_REGEX_STRING_MATCH_MT_);
        mt_vars.note_mt_var((SubLObject)removal_modules_regular_expressions.$sym2$_REGEX_STRING_MATCH_MT_, removal_modules_regular_expressions.$const0$regexStringMatch);
        inference_modules.inference_removal_module((SubLObject)removal_modules_regular_expressions.$kw4$REMOVAL_REGEX_STRING_MATCH_POS, (SubLObject)removal_modules_regular_expressions.$list5);
        inference_modules.inference_removal_module((SubLObject)removal_modules_regular_expressions.$kw6$REMOVAL_REGEX_STRING_MATCH_NEG, (SubLObject)removal_modules_regular_expressions.$list7);
        inference_modules.inference_removal_module((SubLObject)removal_modules_regular_expressions.$kw9$REMOVAL_REGEX_STRING_MATCH_WITH_BINDINGS_POS, (SubLObject)removal_modules_regular_expressions.$list10);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_regular_expressions.$sym11$REGEX_STRING_MATCH_WITH_BINDINGS);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_regular_expressions.$const14$regexStringMatch_CaseInsensitive);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_regular_expressions.$kw1$POS, removal_modules_regular_expressions.$const14$regexStringMatch_CaseInsensitive, (SubLObject)removal_modules_regular_expressions.ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_regular_expressions.$kw1$POS, removal_modules_regular_expressions.$const14$regexStringMatch_CaseInsensitive, (SubLObject)removal_modules_regular_expressions.TWO_INTEGER);
        subl_macro_promotions.declare_defglobal((SubLObject)removal_modules_regular_expressions.$sym15$_REGEX_STRING_MATCH_CASE_INSENSITIVE_MT_);
        mt_vars.note_mt_var((SubLObject)removal_modules_regular_expressions.$sym15$_REGEX_STRING_MATCH_CASE_INSENSITIVE_MT_, removal_modules_regular_expressions.$const14$regexStringMatch_CaseInsensitive);
        inference_modules.inference_removal_module((SubLObject)removal_modules_regular_expressions.$kw16$REMOVAL_REGEX_STRING_MATCH_CASE_INSENSITIVE_POS, (SubLObject)removal_modules_regular_expressions.$list17);
        inference_modules.inference_removal_module((SubLObject)removal_modules_regular_expressions.$kw18$REMOVAL_REGEX_STRING_MATCH_CASE_INSENSITIVE_NEG, (SubLObject)removal_modules_regular_expressions.$list19);
        inference_modules.inference_removal_module((SubLObject)removal_modules_regular_expressions.$kw21$REMOVAL_REGEX_STRING_MATCH_WITH_BINDINGS_CASE_INSENSITIVE_POS, (SubLObject)removal_modules_regular_expressions.$list22);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_regular_expressions.$sym23$REGEX_STRING_MATCH_WITH_BINDINGS_CASE_INSENSITIVE);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_regular_expressions.$const24$regexSubstringMatch);
        inference_modules.inference_removal_module_use_meta_removal(removal_modules_regular_expressions.$const24$regexSubstringMatch, (SubLObject)removal_modules_regular_expressions.$kw25$META_REMOVAL_COMPLETELY_DECIDABLE_POS);
        inference_modules.inference_removal_module_use_generic(removal_modules_regular_expressions.$const24$regexSubstringMatch, (SubLObject)removal_modules_regular_expressions.$kw26$REMOVAL_COMPLETELY_DECIDABLE_NEG);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_regular_expressions.$kw1$POS, removal_modules_regular_expressions.$const24$regexSubstringMatch, (SubLObject)removal_modules_regular_expressions.ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_regular_expressions.$kw1$POS, removal_modules_regular_expressions.$const24$regexSubstringMatch, (SubLObject)removal_modules_regular_expressions.TWO_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_regular_expressions.$kw27$REMOVAL_REGEX_SUBSTRING_MATCH_POS, (SubLObject)removal_modules_regular_expressions.$list28);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_regular_expressions.$sym29$REMOVAL_REGEX_SUBSTRING_MATCH_ITERATOR);
        return (SubLObject)removal_modules_regular_expressions.NIL;
    }
    
    public void declareFunctions() {
        declare_removal_modules_regular_expressions_file();
    }
    
    public void initializeVariables() {
        init_removal_modules_regular_expressions_file();
    }
    
    public void runTopLevelForms() {
        setup_removal_modules_regular_expressions_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_regular_expressions();
        removal_modules_regular_expressions.$regex_string_match_mt$ = null;
        removal_modules_regular_expressions.$default_regex_string_match_cost$ = null;
        removal_modules_regular_expressions.$regex_string_match_case_insensitive_mt$ = null;
        removal_modules_regular_expressions.$default_regex_string_match_case_insensitive_cost$ = null;
        $const0$regexStringMatch = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regexStringMatch"));
        $kw1$POS = SubLObjectFactory.makeKeyword("POS");
        $sym2$_REGEX_STRING_MATCH_MT_ = SubLObjectFactory.makeSymbol("*REGEX-STRING-MATCH-MT*");
        $const3$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $kw4$REMOVAL_REGEX_STRING_MATCH_POS = SubLObjectFactory.makeKeyword("REMOVAL-REGEX-STRING-MATCH-POS");
        $list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regexStringMatch")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regexStringMatch")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-REGEX-STRING-MATCH-REQUIRED"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-REGEX-STRING-MATCH-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("CHECK"), removal_modules_regular_expressions.T, SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regexStringMatch")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("REGULAR-EXPRESSION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("DATA"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("REGULAR-EXPRESSION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DATA")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REGEX-STRING-MATCH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("REGULAR-EXPRESSION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DATA"))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*REGEX-STRING-MATCH-MT*"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$regexStringMatch <regular-expression string> <data string>)\n    when <data string> matches the regular expression in <regular-expression string>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$regexStringMatch \"[FD]og\" \"Dog\")") });
        $kw6$REMOVAL_REGEX_STRING_MATCH_NEG = SubLObjectFactory.makeKeyword("REMOVAL-REGEX-STRING-MATCH-NEG");
        $list7 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regexStringMatch")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regexStringMatch")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-REGEX-STRING-MATCH-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("CHECK"), removal_modules_regular_expressions.T, SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regexStringMatch")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("REGULAR-EXPRESSION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("DATA"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("REGULAR-EXPRESSION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DATA")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INVERT-BOOLEAN-ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REGEX-STRING-MATCH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("REGULAR-EXPRESSION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DATA")))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*REGEX-STRING-MATCH-MT*"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$regexStringMatch <regular-expression string> <data string>))\n    when <data string> doesn't match the regular expression in <regular-expression string>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$regexStringMatch \"[FD]og\" \"Log\"))") });
        $sym8$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw9$REMOVAL_REGEX_STRING_MATCH_WITH_BINDINGS_POS = SubLObjectFactory.makeKeyword("REMOVAL-REGEX-STRING-MATCH-WITH-BINDINGS-POS");
        $list10 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regexStringMatch")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.listS(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regexStringMatch")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-REGEX-STRING-MATCH-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REGEX-STRING-MATCH-WITH-BINDINGS"), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$regexStringMatch <regular-expression string> <data string> <vars>))\n    holds when <vars> is the captured matches when <regular-expression string> is applied to <data string>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$regexStringMatch \"dog(.*)mice\" \"dogs hate mice\" \"s hate \")") });
        $sym11$REGEX_STRING_MATCH_WITH_BINDINGS = SubLObjectFactory.makeSymbol("REGEX-STRING-MATCH-WITH-BINDINGS");
        $kw12$OPAQUE = SubLObjectFactory.makeKeyword("OPAQUE");
        $kw13$TRUE_MON = SubLObjectFactory.makeKeyword("TRUE-MON");
        $const14$regexStringMatch_CaseInsensitive = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regexStringMatch-CaseInsensitive"));
        $sym15$_REGEX_STRING_MATCH_CASE_INSENSITIVE_MT_ = SubLObjectFactory.makeSymbol("*REGEX-STRING-MATCH-CASE-INSENSITIVE-MT*");
        $kw16$REMOVAL_REGEX_STRING_MATCH_CASE_INSENSITIVE_POS = SubLObjectFactory.makeKeyword("REMOVAL-REGEX-STRING-MATCH-CASE-INSENSITIVE-POS");
        $list17 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regexStringMatch-CaseInsensitive")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regexStringMatch-CaseInsensitive")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-REGEX-STRING-MATCH-CASE-INSENSITIVE-REQUIRED"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-REGEX-STRING-MATCH-CASE-INSENSITIVE-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("CHECK"), removal_modules_regular_expressions.T, SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regexStringMatch-CaseInsensitive")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("REGULAR-EXPRESSION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("DATA"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("REGULAR-EXPRESSION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DATA")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REGEX-STRING-MATCH-CASE-INSENSITIVE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("REGULAR-EXPRESSION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DATA"))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*REGEX-STRING-MATCH-CASE-INSENSITIVE-MT*"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$regexStringMatch-CaseInsensitive <regular-expression string> <data string>)\n    when <data string> matches the regular expression in <regular-expression string>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$regexStringMatch-CaseInsensitive \"[fd]OG\" \"Dog\")") });
        $kw18$REMOVAL_REGEX_STRING_MATCH_CASE_INSENSITIVE_NEG = SubLObjectFactory.makeKeyword("REMOVAL-REGEX-STRING-MATCH-CASE-INSENSITIVE-NEG");
        $list19 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regexStringMatch-CaseInsensitive")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regexStringMatch-CaseInsensitive")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-REGEX-STRING-MATCH-CASE-INSENSITIVE-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("CHECK"), removal_modules_regular_expressions.T, SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regexStringMatch-CaseInsensitive")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("REGULAR-EXPRESSION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("DATA"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("REGULAR-EXPRESSION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DATA")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INVERT-BOOLEAN-ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REGEX-STRING-MATCH-CASE-INSENSITIVE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("REGULAR-EXPRESSION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DATA")))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*REGEX-STRING-MATCH-CASE-INSENSITIVE-MT*"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$regexStringMatch-CaseInsensitive <regular-expression string> <data string>))\n    when <data string> doesn't match the regular expression in <regular-expression string>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$regexStringMatch-CaseInsensitive \"[fd]OG\" \"Log\"))") });
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CASELESS"));
        $kw21$REMOVAL_REGEX_STRING_MATCH_WITH_BINDINGS_CASE_INSENSITIVE_POS = SubLObjectFactory.makeKeyword("REMOVAL-REGEX-STRING-MATCH-WITH-BINDINGS-CASE-INSENSITIVE-POS");
        $list22 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regexStringMatch-CaseInsensitive")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.listS(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regexStringMatch-CaseInsensitive")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-REGEX-STRING-MATCH-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REGEX-STRING-MATCH-WITH-BINDINGS-CASE-INSENSITIVE"), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$regexStringMatch-CaseInsensitive <regular-expression string> <data string> <vars>))\n    holds when <vars> is the captured matches when <regular-expression string> is applied case-insensitively \n    to <data string>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$regexStringMatch-CaseInsensitive \"Dog(.*)mice\" \"dogs hate mice\" \"s hate \")") });
        $sym23$REGEX_STRING_MATCH_WITH_BINDINGS_CASE_INSENSITIVE = SubLObjectFactory.makeSymbol("REGEX-STRING-MATCH-WITH-BINDINGS-CASE-INSENSITIVE");
        $const24$regexSubstringMatch = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regexSubstringMatch"));
        $kw25$META_REMOVAL_COMPLETELY_DECIDABLE_POS = SubLObjectFactory.makeKeyword("META-REMOVAL-COMPLETELY-DECIDABLE-POS");
        $kw26$REMOVAL_COMPLETELY_DECIDABLE_NEG = SubLObjectFactory.makeKeyword("REMOVAL-COMPLETELY-DECIDABLE-NEG");
        $kw27$REMOVAL_REGEX_SUBSTRING_MATCH_POS = SubLObjectFactory.makeKeyword("REMOVAL-REGEX-SUBSTRING-MATCH-POS");
        $list28 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regexSubstringMatch")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regexSubstringMatch")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-REGEX-STRING-MATCH-REQUIRED"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-REGEX-STRING-MATCH-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regexSubstringMatch")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("REGULAR-EXPRESSION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("DATA")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("SPAN"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("REGULAR-EXPRESSION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DATA")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SPAN")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-REGEX-SUBSTRING-MATCH-ITERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("SUBST-BINDINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regexSubstringMatch")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("REGULAR-EXPRESSION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DATA")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SPAN")))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*REGEX-STRING-MATCH-MT*"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("MONOTONIC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$regexSubstringMatch <regular-expression string> <data string> <data index> <data span>)\n    when <data string> matches the regular expression in <regular-expression string> starting\n    at index and continuing for span characters"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$regexSubstringMatch \"[FD]og\" \"Dog\" 0 3)") });
        $sym29$REMOVAL_REGEX_SUBSTRING_MATCH_ITERATOR = SubLObjectFactory.makeSymbol("REMOVAL-REGEX-SUBSTRING-MATCH-ITERATOR");
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PATTERN"), (SubLObject)SubLObjectFactory.makeSymbol("DATA"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("SPAN"));
        $list31 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("THE-START-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("THE-END-INDEX"));
    }
}

/*

	Total time: 163 ms
	
*/