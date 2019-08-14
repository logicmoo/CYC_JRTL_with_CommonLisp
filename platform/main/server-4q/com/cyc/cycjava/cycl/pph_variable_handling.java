/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;

import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.atomic_sentenceP;
import static com.cyc.cycjava.cycl.el_utilities.el_disjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_existential_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_implication_p;
import static com.cyc.cycjava.cycl.el_utilities.el_universal_p;
import static com.cyc.cycjava.cycl.el_utilities.naut_free_variables;
import static com.cyc.cycjava.cycl.el_utilities.quantified_sub_sentence;
import static com.cyc.cycjava.cycl.el_utilities.replace_formula_arg;
import static com.cyc.cycjava.cycl.el_utilities.sentence_free_variables;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      PPH-VARIABLE-HANDLING
 * source file: /cyc/top/cycl/pph-variable-handling.lisp
 * created:     2019/07/03 17:38:18
 */
public final class pph_variable_handling extends SubLTranslatedFile implements V12 {
    public static final SubLObject variable_isa_constraints_test_case_p(SubLObject variable_isa_constraints_test_case) {
	return classes.subloop_instanceof_class(variable_isa_constraints_test_case, VARIABLE_ISA_CONSTRAINTS_TEST_CASE);
    }

    public static final SubLObject subloop_reserved_initialize_variable_isa_constraints_test_case_instance(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_variable_isa_constraints_test_case_class(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_pph_var_types_test_case_instance(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
	classes.subloop_initialize_slot(new_instance, PPH_VAR_TYPES_TEST_CASE, TEST_VAR, NIL);
	classes.subloop_initialize_slot(new_instance, PPH_VAR_TYPES_TEST_CASE, DUPLICATE_VAR, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_pph_var_types_test_case_class(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
	return NIL;
    }

    public static final SubLObject set_pph_var_types_test_case_test_var(SubLObject pph_var_types_test_case, SubLObject value) {
	return classes.subloop_set_access_protected_instance_slot(pph_var_types_test_case, value, THREE_INTEGER, TEST_VAR);
    }

    public static final SubLObject set_pph_var_types_test_case_duplicate_var(SubLObject pph_var_types_test_case, SubLObject value) {
	return classes.subloop_set_access_protected_instance_slot(pph_var_types_test_case, value, FOUR_INTEGER, DUPLICATE_VAR);
    }

    public static final SubLObject set_pph_var_paraphrases(SubLObject var_entry, SubLObject paraphrases) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_var_entry_p(var_entry)))) {
		{
		    SubLObject new_format_string = cconcatenate($str_alt27$_PPH_error_level_,
			    new SubLObject[] { format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt28$__, format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(var_entry), new SubLObject[] { $str_alt29$_is_not_a_, format_nil.format_nil_s_no_copy(PPH_VAR_ENTRY_P) })) });
		    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
		}
	    }
	    _csetf_pph_var_entry_paraphrases(var_entry, paraphrases);
	    return var_entry;
	}
    }

    public static final SubLObject pph_var_types_test_case_p(SubLObject pph_var_types_test_case) {
	return classes.subloop_instanceof_class(pph_var_types_test_case, PPH_VAR_TYPES_TEST_CASE);
    }

    public static final SubLObject pph_var_previously_paraphrasedP(SubLObject obj) {
	return list_utilities.sublisp_boolean(pph_var_paraphrases(obj));
    }

    /**
     *
     *
     * @return LISTP of (used) paraphrases of VAR.
     */
    @LispMethod(comment = "@return LISTP of (used) paraphrases of VAR.")
    public static final SubLObject pph_var_paraphrases(SubLObject var) {
	{
	    SubLObject entry = pph_var_entry(var);
	    return NIL != entry ? ((SubLObject) (pph_var_entry_paraphrases(entry))) : NIL;
	}
    }

    /**
     *
     *
     * @return a variable that has been paraphrased with PARAPHRASE, if one exists.
     */
    @LispMethod(comment = "@return a variable that has been paraphrased with PARAPHRASE, if one exists.")
    public static final SubLObject pph_var_from_paraphrase(SubLObject paraphrase) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject var = NIL;
		SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(pph_vars.$pph_var_types$.getDynamicValue(thread)));
		while (!((NIL != var) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
		    thread.resetMultipleValues();
		    {
			SubLObject var_entry_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
			SubLObject entry = thread.secondMultipleValue();
			thread.resetMultipleValues();
			{
			    SubLObject paraphrases = pph_var_entry_paraphrases(entry);
			    if (NIL == var) {
				{
				    SubLObject csome_list_var = paraphrases;
				    SubLObject var_paraphrase = NIL;
				    for (var_paraphrase = csome_list_var.first(); !((NIL != var) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), var_paraphrase = csome_list_var.first()) {
					if (paraphrase.equalp(var_paraphrase)) {
					    var = var_entry_var;
					}
				    }
				}
			    }
			}
			iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
		    }
		}
		dictionary_contents.do_dictionary_contents_finalize(iteration_state);
		return var;
	    }
	}
    }

    public static final SubLObject pph_var_entry_paraphrases(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PPH_VAR_ENTRY_P);
	return v_object.getField4();
    }

    public static final SubLObject pph_var_count_previous_paraphrases(SubLObject obj) {
	return length(pph_var_paraphrases(obj));
    }

    /**
     * Register PARPAHRASE as a (used) paraphrase of VAR.
     */
    @LispMethod(comment = "Register PARPAHRASE as a (used) paraphrase of VAR.")
    public static final SubLObject pph_register_var_paraphrase(SubLObject var, SubLObject paraphrase) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_phrase.pph_phrase_p(paraphrase, UNPROVIDED)))) {
		{
		    SubLObject new_format_string = cconcatenate($str_alt27$_PPH_error_level_,
			    new SubLObject[] { format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt28$__, format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(paraphrase), new SubLObject[] { $str_alt29$_is_not_a_, format_nil.format_nil_s_no_copy(PPH_PHRASE_P) })) });
		    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
		}
	    }
	    {
		SubLObject existing = pph_var_entry(var);
		SubLObject v_new = (NIL != existing) ? ((SubLObject) (pph_var_entry_copy(existing))) : new_pph_var_entry(var, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		SubLObject paraphrases = cons(paraphrase, remove(paraphrase, pph_var_entry_paraphrases(v_new), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
		set_pph_var_paraphrases(v_new, paraphrases);
		dictionary.dictionary_enter(pph_vars.$pph_var_types$.getDynamicValue(thread), var, v_new);
	    }
	    return pph_vars.$pph_var_types$.getDynamicValue(thread);
	}
    }

    public static final SubLObject pph_isa_constraints_from_type(SubLObject base_type, SubLObject expression, SubLObject lits, SubLObject directlyP, SubLObject mt) {
	{
	    SubLObject ans = NIL;
	    if (NIL != directlyP) {
		{
		    SubLObject item_var = base_type;
		    if (NIL == member(item_var, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
			ans = cons(item_var, ans);
		    }
		}
	    } else {
		if (NIL != pph_utilities.pph_removal_ask_boolean(listS($$transitiveViaArg, cycl_utilities.atomic_sentence_predicate(expression), $list_alt92), mt)) {
		    {
			SubLObject cdolist_list_var = pph_genls(base_type, mt);
			SubLObject super_type = NIL;
			for (super_type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), super_type = cdolist_list_var.first()) {
			    {
				SubLObject more_general_asent = replace_formula_arg(TWO_INTEGER, super_type, expression);
				if (NIL == subl_promotions.memberP(more_general_asent, lits, symbol_function(EQUAL), UNPROVIDED)) {
				    {
					SubLObject item_var = super_type;
					if (NIL == member(item_var, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
					    ans = cons(item_var, ans);
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	    return ans;
	}
    }

    /**
     * Deregister PARPAHRASE as a (used) paraphrase of VAR.
     */
    @LispMethod(comment = "Deregister PARPAHRASE as a (used) paraphrase of VAR.")
    public static final SubLObject pph_deregister_var_paraphrase(SubLObject var, SubLObject paraphrase) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_phrase.pph_phrase_p(paraphrase, UNPROVIDED)))) {
		{
		    SubLObject new_format_string = cconcatenate($str_alt27$_PPH_error_level_,
			    new SubLObject[] { format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt28$__, format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(paraphrase), new SubLObject[] { $str_alt29$_is_not_a_, format_nil.format_nil_s_no_copy(PPH_PHRASE_P) })) });
		    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
		}
	    }
	    {
		SubLObject var_entry = pph_var_entry(var);
		if (NIL != var_entry) {
		    {
			SubLObject existing_paraphrases = pph_var_entry_paraphrases(var_entry);
			set_pph_var_paraphrases(var_entry, delete(paraphrase, existing_paraphrases, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
		    }
		}
	    }
	    return pph_vars.$pph_var_types$.getDynamicValue(thread);
	}
    }

    /**
     *
     *
     * @unknown only for debugging purposes
     */
    @LispMethod(comment = "@unknown only for debugging purposes")
    public static final SubLObject pph_clear_var_paraphrases(SubLObject var) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject entry = pph_var_entry(var);
		if (NIL != pph_var_entry_p(entry)) {
		    set_pph_var_paraphrases(entry, NIL);
		    dictionary.dictionary_enter(pph_vars.$pph_var_types$.getDynamicValue(thread), var, entry);
		}
		return entry;
	    }
	}
    }

    /**
     *
     *
     * @unknown debugging only
     */
    @LispMethod(comment = "@unknown debugging only")
    public static final SubLObject pph_clear_all_var_paraphrases() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(pph_vars.$pph_var_types$.getDynamicValue(thread)));
		while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
		    thread.resetMultipleValues();
		    {
			SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
			SubLObject entry = thread.secondMultipleValue();
			thread.resetMultipleValues();
			set_pph_var_paraphrases(entry, NIL);
			iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
		    }
		}
		dictionary_contents.do_dictionary_contents_finalize(iteration_state);
	    }
	    return pph_vars.$pph_var_types$.getDynamicValue(thread);
	}
    }

    public static final SubLObject get_pph_var_types_test_case_test_var(SubLObject pph_var_types_test_case) {
	return classes.subloop_get_access_protected_instance_slot(pph_var_types_test_case, THREE_INTEGER, TEST_VAR);
    }

    public static final SubLObject get_pph_var_types_test_case_duplicate_var(SubLObject pph_var_types_test_case) {
	return classes.subloop_get_access_protected_instance_slot(pph_var_types_test_case, FOUR_INTEGER, DUPLICATE_VAR);
    }

    public static final SubLObject _csetf_pph_var_entry_paraphrases(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PPH_VAR_ENTRY_P);
	return v_object.setField4(value);
    }

    public static final SubLFile me = new pph_variable_handling();

 public static final String myName = "com.cyc.cycjava.cycl.pph_variable_handling";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_pph_var_entry$ = makeSymbol("*DTP-PPH-VAR-ENTRY*");

    // defconstant
    // What something is when we don't know what it is.
    /**
     * What something is when we don't know what it is.
     */
    @LispMethod(comment = "What something is when we don\'t know what it is.\ndefconstant")
    private static final SubLSymbol $pph_default_var_type$ = makeSymbol("*PPH-DEFAULT-VAR-TYPE*");

    // defvar
    @LispMethod(comment = "defvar")
    public static final SubLSymbol $pph_different_vars$ = makeSymbol("*PPH-DIFFERENT-VARS*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol PPH_VAR_ENTRY = makeSymbol("PPH-VAR-ENTRY");

    private static final SubLSymbol PPH_VAR_ENTRY_P = makeSymbol("PPH-VAR-ENTRY-P");

    static private final SubLList $list2 = list(makeSymbol("VAR"), makeSymbol("TYPE"), makeSymbol("QUANTIFIER"), makeSymbol("SINGLE-USE?"), makeSymbol("ARG-POSITION"));

    static private final SubLList $list3 = list(makeKeyword("VAR"), $TYPE, makeKeyword("QUANTIFIER"), makeKeyword("SINGLE-USE?"), makeKeyword("ARG-POSITION"));

    static private final SubLList $list4 = list(makeSymbol("PPH-VAR-ENTRY-VAR"), makeSymbol("PPH-VAR-ENTRY-TYPE"), makeSymbol("PPH-VAR-ENTRY-QUANTIFIER"), makeSymbol("PPH-VAR-ENTRY-SINGLE-USE?"), makeSymbol("PPH-VAR-ENTRY-ARG-POSITION"));

    static private final SubLList $list5 = list(makeSymbol("_CSETF-PPH-VAR-ENTRY-VAR"), makeSymbol("_CSETF-PPH-VAR-ENTRY-TYPE"), makeSymbol("_CSETF-PPH-VAR-ENTRY-QUANTIFIER"), makeSymbol("_CSETF-PPH-VAR-ENTRY-SINGLE-USE?"), makeSymbol("_CSETF-PPH-VAR-ENTRY-ARG-POSITION"));

    private static final SubLSymbol PPRINT_PPH_VAR_ENTRY = makeSymbol("PPRINT-PPH-VAR-ENTRY");

    private static final SubLSymbol PPH_VAR_ENTRY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PPH-VAR-ENTRY-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PPH-VAR-ENTRY-P"));

    private static final SubLSymbol PPH_VAR_ENTRY_VAR = makeSymbol("PPH-VAR-ENTRY-VAR");

    private static final SubLSymbol _CSETF_PPH_VAR_ENTRY_VAR = makeSymbol("_CSETF-PPH-VAR-ENTRY-VAR");

    private static final SubLSymbol PPH_VAR_ENTRY_TYPE = makeSymbol("PPH-VAR-ENTRY-TYPE");

    private static final SubLSymbol _CSETF_PPH_VAR_ENTRY_TYPE = makeSymbol("_CSETF-PPH-VAR-ENTRY-TYPE");

    private static final SubLSymbol PPH_VAR_ENTRY_QUANTIFIER = makeSymbol("PPH-VAR-ENTRY-QUANTIFIER");

    private static final SubLSymbol _CSETF_PPH_VAR_ENTRY_QUANTIFIER = makeSymbol("_CSETF-PPH-VAR-ENTRY-QUANTIFIER");

    private static final SubLSymbol $sym15$PPH_VAR_ENTRY_SINGLE_USE_ = makeSymbol("PPH-VAR-ENTRY-SINGLE-USE?");

    private static final SubLSymbol $sym16$_CSETF_PPH_VAR_ENTRY_SINGLE_USE_ = makeSymbol("_CSETF-PPH-VAR-ENTRY-SINGLE-USE?");

    private static final SubLSymbol PPH_VAR_ENTRY_ARG_POSITION = makeSymbol("PPH-VAR-ENTRY-ARG-POSITION");

    private static final SubLSymbol _CSETF_PPH_VAR_ENTRY_ARG_POSITION = makeSymbol("_CSETF-PPH-VAR-ENTRY-ARG-POSITION");

    private static final SubLSymbol $kw22$SINGLE_USE_ = makeKeyword("SINGLE-USE?");

    private static final SubLString $str24$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_PPH_VAR_ENTRY = makeSymbol("MAKE-PPH-VAR-ENTRY");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PPH_VAR_ENTRY_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PPH-VAR-ENTRY-METHOD");

    static private final SubLString $str30$__PPH_VAR_ENTRY___S__S__S__S_ = makeString("#<PPH-VAR-ENTRY: ~S ~S ~S ~S>");

    private static final SubLString $str32$_PPH_error_level_ = makeString("(PPH error level ");

    private static final SubLString $str33$__ = makeString(") ");

    private static final SubLString $str34$Non_EL_var___S = makeString("Non EL var: ~S");

    private static final SubLString $str35$Registering__S_as__S___ = makeString("Registering ~S as ~S.~%");

    private static final SubLSymbol PPH_DEREGISTER_VAR = makeSymbol("PPH-DEREGISTER-VAR");

    static private final SubLList $list37 = list(makeKeyword("UNIVERSAL"), makeKeyword("EXISTENTIAL"), makeKeyword("NO"));

    static private final SubLString $str38$___S_is_not_a_quantifier_keyword_ = makeString("~&~S is not a quantifier keyword among ~S");

    private static final SubLList $list45 = list(list(makeSymbol("VARS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $pph_hypothesized_vars$ = makeSymbol("*PPH-HYPOTHESIZED-VARS*");

    private static final SubLList $list49 = list(makeSymbol("*PPH-HYPOTHESIZED-VARS*"));

    private static final SubLSymbol PPH_EXISTENTIAL_VAR_P = makeSymbol("PPH-EXISTENTIAL-VAR-P");

    private static final SubLString $str51$__Registering__S_as_a_query_var__ = makeString("~&Registering ~S as a query var.~%");

    private static final SubLString $str53$PPH_REGISTER_VAR_AS_USED_ONLY_ONC = makeString("PPH-REGISTER-VAR-AS-USED-ONLY-ONCE called on var ~S with no PPH-VAR-ENTRY~%");

    private static final SubLList $list54 = list(list(makeSymbol("VAR"), makeSymbol("VAR-ENTRY"), makeSymbol("&OPTIONAL"), makeSymbol("STOP-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $pph_var_types$ = makeSymbol("*PPH-VAR-TYPES*");

    private static final SubLSymbol $sym57$PPH_SPEC_ = makeSymbol("PPH-SPEC?");

    private static final SubLSymbol $sym58$PPH_STRING_IS_POS_ = makeSymbol("PPH-STRING-IS-POS?");

    private static final SubLInteger $int$128 = makeInteger(128);

    private static final SubLString $str63$__Noted___S_is_a__S___ = makeString("~&Noted: ~S is a ~S.~%");

    private static final SubLString $$$other = makeString("other");

    private static final SubLString $$$_other_ = makeString(" other ");

    private static final SubLString $$$other_ = makeString("other ");

    private static final SubLString $$$_another = makeString(" another");

    private static final SubLString $$$another = makeString("another");

    private static final SubLSymbol PPH_FORMULA_FREE_VARIABLES = makeSymbol("PPH-FORMULA-FREE-VARIABLES");

    private static final SubLSymbol $sym70$EL_VAR_ = makeSymbol("EL-VAR?");

    private static final SubLInteger $int$98 = makeInteger(98);

    private static final SubLList $list72 = list(ONE_INTEGER);

    private static final SubLList $list73 = list(reader_make_constant_shell("isa"), makeKeyword("ANYTHING"), list($TEST, makeSymbol("PPH-QUOTED-COLLECTION?")));

    private static final SubLSymbol $sym75$PPH_OPERATOR_ARG_SCOPED_ = makeSymbol("PPH-OPERATOR-ARG-SCOPED?");

    private static final SubLInteger $int$200 = makeInteger(200);

    private static final SubLSymbol $sym77$PPH_OPERATOR_ARG_QUOTED_ = makeSymbol("PPH-OPERATOR-ARG-QUOTED?");

    private static final SubLSymbol $sym78$PPH_VALID_VAR_TYPE_ = makeSymbol("PPH-VALID-VAR-TYPE?");

    private static final SubLList $list81 = list(makeSymbol("NEG-LITS"), makeSymbol("POS-LITS"));

    private static final SubLSymbol $sym83$SPECS_FN_NAT_ = makeSymbol("SPECS-FN-NAT?");

    private static final SubLString $str84$Removing_non_SpecsFn_terms_from__ = makeString("Removing non-SpecsFn terms from ~S");

    private static final SubLSymbol $sym85$PPH_GENERALITY_ESTIMATE_ = makeSymbol("PPH-GENERALITY-ESTIMATE<");

    private static final SubLSymbol PPH_CLAUSAL_FORM = makeSymbol("PPH-CLAUSAL-FORM");

    private static final SubLSymbol PPH_VARIABLE_ISA_CONSTRAINTS_IN_LIT = makeSymbol("PPH-VARIABLE-ISA-CONSTRAINTS-IN-LIT");

    private static final SubLObject $$Agent_Generic = reader_make_constant_shell("Agent-Generic");

    private static final SubLList $list91 = list(makeSymbol("TYPE"), makeSymbol("TARGET"), makeSymbol("CONSTRAINT-MT"));

    private static final SubLSymbol PPH_MAKE_TYPE_LEVEL = makeSymbol("PPH-MAKE-TYPE-LEVEL");

    private static final SubLSymbol $sym97$PPH_TRUTH_PRESERVING_OPERATOR_ = makeSymbol("PPH-TRUTH-PRESERVING-OPERATOR?");

    private static final SubLList $list98 = list(reader_make_constant_shell("and"), reader_make_constant_shell("thereExists"), reader_make_constant_shell("forAll"));

    private static final SubLList $list99 = list(reader_make_constant_shell("TheSetOf"));

    private static final SubLSymbol EL_EXISTENTIAL_P = makeSymbol("EL-EXISTENTIAL-P");

    private static final SubLSymbol QUANTIFIED_SUB_SENTENCE = makeSymbol("QUANTIFIED-SUB-SENTENCE");

    private static final SubLSymbol PPH_MIN_VARIABLE_ISA_CONSTRAINT = makeSymbol("PPH-MIN-VARIABLE-ISA-CONSTRAINT");

    private static final SubLString $str107$Constraints_on__S_are__S_____choo = makeString("Constraints on ~S are ~S;~%, choosing ~S~%");

    private static final SubLSymbol PPH_FIND_MOST_SPECIFIC = makeSymbol("PPH-FIND-MOST-SPECIFIC");

    public static final SubLObject pph_var_entry_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
	pprint_pph_var_entry(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject pph_var_entry_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
	pprint_pph_var_entry(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject pph_var_entry_p_alt(SubLObject v_object) {
	return v_object.getClass() == $pph_var_entry_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject pph_var_entry_p(final SubLObject v_object) {
	return v_object.getClass() == $pph_var_entry_native.class ? T : NIL;
    }

    public static final SubLObject pph_var_entry_var_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PPH_VAR_ENTRY_P);
	return v_object.getField2();
    }

    public static SubLObject pph_var_entry_var(final SubLObject v_object) {
	assert NIL != pph_variable_handling.pph_var_entry_p(v_object) : "! pph_variable_handling.pph_var_entry_p(v_object) " + "pph_variable_handling.pph_var_entry_p error :" + v_object;
	return (($pph_var_entry_native) v_object).$var;
    }

    public static final SubLObject pph_var_entry_type_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PPH_VAR_ENTRY_P);
	return v_object.getField3();
    }

    public static SubLObject pph_var_entry_type(final SubLObject v_object) {
	assert NIL != pph_variable_handling.pph_var_entry_p(v_object) : "! pph_variable_handling.pph_var_entry_p(v_object) " + "pph_variable_handling.pph_var_entry_p error :" + v_object;
	return (($pph_var_entry_native) v_object).$type;
    }

    public static final SubLObject pph_var_entry_quantifier_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PPH_VAR_ENTRY_P);
	return v_object.getField5();
    }

    public static SubLObject pph_var_entry_quantifier(final SubLObject v_object) {
	assert NIL != pph_variable_handling.pph_var_entry_p(v_object) : "! pph_variable_handling.pph_var_entry_p(v_object) " + "pph_variable_handling.pph_var_entry_p error :" + v_object;
	return (($pph_var_entry_native) v_object).$quantifier;
    }

    public static final SubLObject pph_var_entry_single_useP_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PPH_VAR_ENTRY_P);
	return v_object.getField6();
    }

    public static SubLObject pph_var_entry_single_useP(final SubLObject v_object) {
	assert NIL != pph_variable_handling.pph_var_entry_p(v_object) : "! pph_variable_handling.pph_var_entry_p(v_object) " + "pph_variable_handling.pph_var_entry_p error :" + v_object;
	return (($pph_var_entry_native) v_object).$single_useP;
    }

    public static final SubLObject pph_var_entry_arg_position_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PPH_VAR_ENTRY_P);
	return v_object.getField7();
    }

    public static SubLObject pph_var_entry_arg_position(final SubLObject v_object) {
	assert NIL != pph_variable_handling.pph_var_entry_p(v_object) : "! pph_variable_handling.pph_var_entry_p(v_object) " + "pph_variable_handling.pph_var_entry_p error :" + v_object;
	return (($pph_var_entry_native) v_object).$arg_position;
    }

    public static final SubLObject _csetf_pph_var_entry_var_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PPH_VAR_ENTRY_P);
	return v_object.setField2(value);
    }

    public static SubLObject _csetf_pph_var_entry_var(final SubLObject v_object, final SubLObject value) {
	assert NIL != pph_var_entry_p(v_object) : "! pph_variable_handling.pph_var_entry_p(v_object) " + "pph_variable_handling.pph_var_entry_p error :" + v_object;
	return v_object.setField2(value);
    }

    public static final SubLObject _csetf_pph_var_entry_type_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PPH_VAR_ENTRY_P);
	return v_object.setField3(value);
    }

    public static SubLObject _csetf_pph_var_entry_type(final SubLObject v_object, final SubLObject value) {
	assert NIL != pph_var_entry_p(v_object) : "! pph_variable_handling.pph_var_entry_p(v_object) " + "pph_variable_handling.pph_var_entry_p error :" + v_object;
	return v_object.setField3(value);
    }

    public static final SubLObject _csetf_pph_var_entry_quantifier_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PPH_VAR_ENTRY_P);
	return v_object.setField5(value);
    }

    public static SubLObject _csetf_pph_var_entry_quantifier(final SubLObject v_object, final SubLObject value) {
	assert NIL != pph_var_entry_p(v_object) : "! pph_variable_handling.pph_var_entry_p(v_object) " + "pph_variable_handling.pph_var_entry_p error :" + v_object;
	return v_object.setField4(value);
    }

    public static final SubLObject _csetf_pph_var_entry_single_useP_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PPH_VAR_ENTRY_P);
	return v_object.setField6(value);
    }

    public static SubLObject _csetf_pph_var_entry_single_useP(final SubLObject v_object, final SubLObject value) {
	assert NIL != pph_var_entry_p(v_object) : "! pph_variable_handling.pph_var_entry_p(v_object) " + "pph_variable_handling.pph_var_entry_p error :" + v_object;
	return v_object.setField5(value);
    }

    public static final SubLObject _csetf_pph_var_entry_arg_position_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PPH_VAR_ENTRY_P);
	return v_object.setField7(value);
    }

    public static SubLObject _csetf_pph_var_entry_arg_position(final SubLObject v_object, final SubLObject value) {
	assert NIL != pph_var_entry_p(v_object) : "! pph_variable_handling.pph_var_entry_p(v_object) " + "pph_variable_handling.pph_var_entry_p error :" + v_object;
	return v_object.setField6(value);
    }

    public static final SubLObject make_pph_var_entry_alt(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	{
	    SubLObject v_new = new $pph_var_entry_native();
	    SubLObject next = NIL;
	    for (next = arglist; NIL != next; next = cddr(next)) {
		{
		    SubLObject current_arg = next.first();
		    SubLObject current_value = cadr(next);
		    SubLObject pcase_var = current_arg;
		    if (pcase_var.eql($VAR)) {
			_csetf_pph_var_entry_var(v_new, current_value);
		    } else {
			if (pcase_var.eql($TYPE)) {
			    _csetf_pph_var_entry_type(v_new, current_value);
			} else {
			    if (pcase_var.eql($PARAPHRASES)) {
				_csetf_pph_var_entry_paraphrases(v_new, current_value);
			    } else {
				if (pcase_var.eql($QUANTIFIER)) {
				    _csetf_pph_var_entry_quantifier(v_new, current_value);
				} else {
				    if (pcase_var.eql($kw24$SINGLE_USE_)) {
					_csetf_pph_var_entry_single_useP(v_new, current_value);
				    } else {
					if (pcase_var.eql($ARG_POSITION)) {
					    _csetf_pph_var_entry_arg_position(v_new, current_value);
					} else {
					    Errors.error($str_alt26$Invalid_slot__S_for_construction_, current_arg);
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

    public static SubLObject make_pph_var_entry(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	final SubLObject v_new = new $pph_var_entry_native();
	SubLObject next;
	SubLObject current_arg;
	SubLObject current_value;
	SubLObject pcase_var;
	for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
	    current_arg = next.first();
	    current_value = cadr(next);
	    pcase_var = current_arg;
	    if (pcase_var.eql($VAR)) {
		_csetf_pph_var_entry_var(v_new, current_value);
	    } else if (pcase_var.eql($TYPE)) {
		_csetf_pph_var_entry_type(v_new, current_value);
	    } else if (pcase_var.eql($QUANTIFIER)) {
		_csetf_pph_var_entry_quantifier(v_new, current_value);
	    } else if (pcase_var.eql($kw22$SINGLE_USE_)) {
		_csetf_pph_var_entry_single_useP(v_new, current_value);
	    } else if (pcase_var.eql($ARG_POSITION)) {
		_csetf_pph_var_entry_arg_position(v_new, current_value);
	    } else {
		Errors.error($str24$Invalid_slot__S_for_construction_, current_arg);
	    }

	}
	return v_new;
    }

    public static SubLObject visit_defstruct_pph_var_entry(final SubLObject obj, final SubLObject visitor_fn) {
	funcall(visitor_fn, obj, $BEGIN, MAKE_PPH_VAR_ENTRY, FIVE_INTEGER);
	funcall(visitor_fn, obj, $SLOT, $VAR, pph_var_entry_var(obj));
	funcall(visitor_fn, obj, $SLOT, $TYPE, pph_var_entry_type(obj));
	funcall(visitor_fn, obj, $SLOT, $QUANTIFIER, pph_var_entry_quantifier(obj));
	funcall(visitor_fn, obj, $SLOT, $kw22$SINGLE_USE_, pph_var_entry_single_useP(obj));
	funcall(visitor_fn, obj, $SLOT, $ARG_POSITION, pph_var_entry_arg_position(obj));
	funcall(visitor_fn, obj, $END, MAKE_PPH_VAR_ENTRY, FIVE_INTEGER);
	return obj;
    }

    public static SubLObject visit_defstruct_object_pph_var_entry_method(final SubLObject obj, final SubLObject visitor_fn) {
	return visit_defstruct_pph_var_entry(obj, visitor_fn);
    }

    public static final SubLObject pprint_pph_var_entry_alt(SubLObject var_entry, SubLObject stream, SubLObject depth) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_var_entry_p(var_entry)))) {
		{
		    SubLObject new_format_string = cconcatenate($str_alt27$_PPH_error_level_,
			    new SubLObject[] { format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt28$__, format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(var_entry), new SubLObject[] { $str_alt29$_is_not_a_, format_nil.format_nil_s_no_copy(PPH_VAR_ENTRY_P) })) });
		    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
		}
	    }
	    format(stream, $str_alt30$__PPH_VAR_ENTRY___S__S__S__S_, new SubLObject[] { pph_var_entry_var(var_entry), pph_var_entry_type(var_entry), pph_var_entry_arg_position(var_entry), pph_var_entry_paraphrases(var_entry), pph_var_entry_quantifier(var_entry) });
	    return var_entry;
	}
    }

    public static SubLObject pprint_pph_var_entry(final SubLObject var_entry, final SubLObject stream, final SubLObject depth) {
	format(stream, $str30$__PPH_VAR_ENTRY___S__S__S__S_, new SubLObject[] { pph_var_entry_var(var_entry), pph_var_entry_type(var_entry), pph_var_entry_arg_position(var_entry), pph_var_entry_quantifier(var_entry) });
	return var_entry;
    }

    public static final SubLObject new_pph_var_entry(SubLObject var, SubLObject type, SubLObject type_map, SubLObject paraphrases, SubLObject quantifier, SubLObject single_useP) {
	if (type == UNPROVIDED) {
	    type = pph_default_var_type();
	}
	if (type_map == UNPROVIDED) {
	    type_map = pph_utilities.pph_new_empty_map();
	}
	if (paraphrases == UNPROVIDED) {
	    paraphrases = NIL;
	}
	if (quantifier == UNPROVIDED) {
	    quantifier = NIL;
	}
	if (single_useP == UNPROVIDED) {
	    single_useP = NIL;
	}
	{
	    SubLObject new_var_entry = make_pph_var_entry(UNPROVIDED);
	    _csetf_pph_var_entry_var(new_var_entry, var);
	    _csetf_pph_var_entry_type(new_var_entry, type);
	    _csetf_pph_var_entry_arg_position(new_var_entry, type_map);
	    _csetf_pph_var_entry_paraphrases(new_var_entry, paraphrases);
	    _csetf_pph_var_entry_quantifier(new_var_entry, quantifier);
	    _csetf_pph_var_entry_single_useP(new_var_entry, single_useP);
	    return new_var_entry;
	}
    }

    public static SubLObject new_pph_var_entry(final SubLObject var, SubLObject type, SubLObject type_map, SubLObject quantifier, SubLObject single_useP) {
	if (type == UNPROVIDED) {
	    type = pph_default_var_type();
	}
	if (type_map == UNPROVIDED) {
	    type_map = pph_utilities.pph_new_empty_map();
	}
	if (quantifier == UNPROVIDED) {
	    quantifier = NIL;
	}
	if (single_useP == UNPROVIDED) {
	    single_useP = NIL;
	}
	final SubLObject new_var_entry = make_pph_var_entry(UNPROVIDED);
	_csetf_pph_var_entry_var(new_var_entry, var);
	_csetf_pph_var_entry_type(new_var_entry, type);
	_csetf_pph_var_entry_arg_position(new_var_entry, type_map);
	_csetf_pph_var_entry_quantifier(new_var_entry, quantifier);
	_csetf_pph_var_entry_single_useP(new_var_entry, single_useP);
	return new_var_entry;
    }

    public static final SubLObject pph_var_entry_copy_alt(SubLObject old_entry) {
	{
	    SubLObject var = pph_var_entry_var(old_entry);
	    SubLObject type = pph_var_entry_type(old_entry);
	    SubLObject arg_position = pph_var_entry_arg_position(old_entry);
	    SubLObject paraphrases = pph_var_entry_paraphrases(old_entry);
	    SubLObject quantifier = pph_var_entry_quantifier(old_entry);
	    SubLObject single_useP = pph_var_entry_single_useP(old_entry);
	    return new_pph_var_entry(var, type, arg_position, paraphrases, quantifier, single_useP);
	}
    }

    public static SubLObject pph_var_entry_copy(final SubLObject old_entry) {
	final SubLObject var = pph_var_entry_var(old_entry);
	final SubLObject type = pph_var_entry_type(old_entry);
	final SubLObject arg_position = pph_var_entry_arg_position(old_entry);
	final SubLObject quantifier = pph_var_entry_quantifier(old_entry);
	final SubLObject single_useP = pph_var_entry_single_useP(old_entry);
	return new_pph_var_entry(var, type, arg_position, quantifier, single_useP);
    }

    public static final SubLObject set_pph_var_type_alt(SubLObject var_entry, SubLObject type) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_var_entry_p(var_entry)))) {
		{
		    SubLObject new_format_string = cconcatenate($str_alt27$_PPH_error_level_,
			    new SubLObject[] { format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt28$__, format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(var_entry), new SubLObject[] { $str_alt29$_is_not_a_, format_nil.format_nil_s_no_copy(PPH_VAR_ENTRY_P) })) });
		    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
		}
	    }
	    _csetf_pph_var_entry_type(var_entry, type);
	    return var_entry;
	}
    }

    public static SubLObject set_pph_var_type(final SubLObject var_entry, final SubLObject type) {
	_csetf_pph_var_entry_type(var_entry, type);
	return var_entry;
    }

    public static final SubLObject set_pph_var_type_map_alt(SubLObject var_entry, SubLObject map) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_var_entry_p(var_entry)))) {
		{
		    SubLObject new_format_string = cconcatenate($str_alt27$_PPH_error_level_,
			    new SubLObject[] { format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt28$__, format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(var_entry), new SubLObject[] { $str_alt29$_is_not_a_, format_nil.format_nil_s_no_copy(PPH_VAR_ENTRY_P) })) });
		    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
		}
	    }
	    if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_utilities.pph_arg_position_map_p(map)))) {
		{
		    SubLObject new_format_string = cconcatenate($str_alt27$_PPH_error_level_,
			    new SubLObject[] { format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt28$__, format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(map), new SubLObject[] { $str_alt29$_is_not_a_, format_nil.format_nil_s_no_copy(PPH_ARG_POSITION_MAP_P) })) });
		    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
		}
	    }
	    _csetf_pph_var_entry_arg_position(var_entry, map);
	    return var_entry;
	}
    }

    public static SubLObject set_pph_var_type_map(final SubLObject var_entry, final SubLObject map) {
	_csetf_pph_var_entry_arg_position(var_entry, map);
	return var_entry;
    }

    public static final SubLObject set_pph_var_quantifier_alt(SubLObject var_entry, SubLObject quantifier) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_var_entry_p(var_entry)))) {
		{
		    SubLObject new_format_string = cconcatenate($str_alt27$_PPH_error_level_,
			    new SubLObject[] { format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt28$__, format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(var_entry), new SubLObject[] { $str_alt29$_is_not_a_, format_nil.format_nil_s_no_copy(PPH_VAR_ENTRY_P) })) });
		    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
		}
	    }
	    _csetf_pph_var_entry_quantifier(var_entry, quantifier);
	    return var_entry;
	}
    }

    public static SubLObject set_pph_var_quantifier(final SubLObject var_entry, final SubLObject quantifier) {
	_csetf_pph_var_entry_quantifier(var_entry, quantifier);
	return var_entry;
    }

    public static final SubLObject clear_pph_var_types_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    dictionary.clear_dictionary(pph_vars.$pph_var_types$.getDynamicValue(thread));
	    return pph_vars.$pph_var_types$.getDynamicValue(thread);
	}
    }

    public static SubLObject clear_pph_var_types() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	dictionary.clear_dictionary(pph_vars.$pph_var_types$.getDynamicValue(thread));
	return pph_vars.$pph_var_types$.getDynamicValue(thread);
    }

    public static final SubLObject pph_default_var_type_alt() {
	return $pph_default_var_type$.getGlobalValue();
    }

    public static SubLObject pph_default_var_type() {
	return $pph_default_var_type$.getGlobalValue();
    }

    public static final SubLObject pph_registered_vars_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    return dictionary.dictionary_keys(pph_vars.$pph_var_types$.getDynamicValue(thread));
	}
    }

    public static SubLObject pph_registered_vars() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	return dictionary.dictionary_keys(pph_vars.$pph_var_types$.getDynamicValue(thread));
    }

    /**
     * The entry in *pph-var-types* associated with VAR
     */
    @LispMethod(comment = "The entry in *pph-var-types* associated with VAR")
    public static final SubLObject pph_var_entry_alt(SubLObject var) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL == cycl_variables.el_varP(var)) {
		{
		    SubLObject new_format_string = cconcatenate($str_alt27$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt28$__, format_nil.format_nil_a_no_copy($str_alt33$Non_EL_var___S) });
		    pph_error.pph_handle_error(new_format_string, list(var));
		}
	    }
	    return NIL != cycl_variables.el_varP(var) ? ((SubLObject) (dictionary.dictionary_lookup(pph_vars.$pph_var_types$.getDynamicValue(thread), var, UNPROVIDED))) : NIL;
	}
    }

    /**
     * The entry in *pph-var-types* associated with VAR
     */
    @LispMethod(comment = "The entry in *pph-var-types* associated with VAR")
    public static SubLObject pph_var_entry(final SubLObject var) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL == cycl_variables.el_varP(var)) {
	    final SubLObject new_format_string = cconcatenate($str32$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy(ONE_INTEGER), $str33$__, format_nil.format_nil_a_no_copy($str34$Non_EL_var___S) });
	    pph_error.pph_handle_error(new_format_string, list(var));
	}
	return NIL != cycl_variables.el_varP(var) ? dictionary.dictionary_lookup(pph_vars.$pph_var_types$.getDynamicValue(thread), var, UNPROVIDED) : NIL;
    }

    public static final SubLObject pph_var_entries_alt(SubLObject vars) {
	return Mapping.mapcar(PPH_VAR_ENTRY, vars);
    }

    public static SubLObject pph_var_entries(final SubLObject vars) {
	return Mapping.mapcar(PPH_VAR_ENTRY, vars);
    }

    /**
     *
     *
     * @return BOOLEAN; Is VAR registered?
     */
    @LispMethod(comment = "@return BOOLEAN; Is VAR registered?")
    public static final SubLObject pph_var_registeredP_alt(SubLObject var) {
	return makeBoolean((NIL != pph_vars.pph_tracking_var_types_p()) && (NIL != pph_var_entry(var)));
    }

    /**
     *
     *
     * @return BOOLEAN; Is VAR registered?
     */
    @LispMethod(comment = "@return BOOLEAN; Is VAR registered?")
    public static SubLObject pph_var_registeredP(final SubLObject var) {
	return makeBoolean((NIL != pph_vars.pph_tracking_var_types_p()) && (NIL != pph_var_entry(var)));
    }

    /**
     *
     *
     * @return BOOLEAN; Is VAR registered as the default type?
     */
    @LispMethod(comment = "@return BOOLEAN; Is VAR registered as the default type?")
    public static final SubLObject pph_var_registered_as_defaultP_alt(SubLObject var) {
	return eq(pph_var_type(var), pph_default_var_type());
    }

    /**
     *
     *
     * @return BOOLEAN; Is VAR registered as the default type?
     */
    @LispMethod(comment = "@return BOOLEAN; Is VAR registered as the default type?")
    public static SubLObject pph_var_registered_as_defaultP(final SubLObject var) {
	return eq(pph_var_type(var), pph_default_var_type());
    }

    /**
     * Note that VAR should be paraphrased as an instance of TYPE.
     */
    @LispMethod(comment = "Note that VAR should be paraphrased as an instance of TYPE.")
    public static final SubLObject pph_register_var_alt(SubLObject var, SubLObject type, SubLObject type_map) {
	if (type == UNPROVIDED) {
	    type = pph_default_var_type();
	}
	if (type_map == UNPROVIDED) {
	    type_map = pph_utilities.pph_new_empty_map();
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
		format(T, $str_alt34$Registering__S_as__S___, var, type);
	    }
	    if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_utilities.pph_arg_position_map_p(type_map)))) {
		{
		    SubLObject new_format_string = cconcatenate($str_alt27$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt28$__,
			    format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(type_map), new SubLObject[] { $str_alt29$_is_not_a_, format_nil.format_nil_s_no_copy(PPH_ARG_POSITION_MAP_P) })) });
		    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
		}
	    }
	    {
		SubLObject existing = pph_var_entry(var);
		SubLObject v_new = (NIL != existing) ? ((SubLObject) (pph_var_entry_copy(existing))) : new_pph_var_entry(var, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		set_pph_var_type(v_new, type);
		set_pph_var_type_map(v_new, type_map);
		dictionary.dictionary_enter(pph_vars.$pph_var_types$.getDynamicValue(thread), var, v_new);
	    }
	    pph_note_var_type(var, type);
	    return pph_vars.$pph_var_types$.getDynamicValue(thread);
	}
    }

    /**
     * Note that VAR should be paraphrased as an instance of TYPE.
     */
    @LispMethod(comment = "Note that VAR should be paraphrased as an instance of TYPE.")
    public static SubLObject pph_register_var(final SubLObject var, SubLObject type, SubLObject type_map) {
	if (type == UNPROVIDED) {
	    type = pph_default_var_type();
	}
	if (type_map == UNPROVIDED) {
	    type_map = pph_utilities.pph_new_empty_map();
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
	    format_nil.force_format(T, $str35$Registering__S_as__S___, var, type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}
	final SubLObject existing = pph_var_entry(var);
	final SubLObject v_new = (NIL != existing) ? pph_var_entry_copy(existing) : new_pph_var_entry(var, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	set_pph_var_type(v_new, type);
	set_pph_var_type_map(v_new, type_map);
	dictionary.dictionary_enter(pph_vars.$pph_var_types$.getDynamicValue(thread), var, v_new);
	pph_note_var_type(var, type);
	return pph_vars.$pph_var_types$.getDynamicValue(thread);
    }

    /**
     * Note that VAR should be paraphrased as an instance of TYPE, preserving all
     * other existing typing information on VAR.
     */
    @LispMethod(comment = "Note that VAR should be paraphrased as an instance of TYPE, preserving all\r\nother existing typing information on VAR.\nNote that VAR should be paraphrased as an instance of TYPE, preserving all\nother existing typing information on VAR.")
    public static final SubLObject pph_update_var_type_alt(SubLObject var, SubLObject type) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject existing = pph_var_entry(var);
		SubLObject v_new = (NIL != existing) ? ((SubLObject) (pph_var_entry_copy(existing))) : new_pph_var_entry(var, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		set_pph_var_type(v_new, type);
		if (NIL == existing) {
		    set_pph_var_type_map(v_new, pph_utilities.pph_new_empty_map());
		}
		dictionary.dictionary_enter(pph_vars.$pph_var_types$.getDynamicValue(thread), var, v_new);
	    }
	    pph_note_var_type(var, type);
	    return pph_vars.$pph_var_types$.getDynamicValue(thread);
	}
    }

    /**
     * Note that VAR should be paraphrased as an instance of TYPE, preserving all
     * other existing typing information on VAR.
     */
    @LispMethod(comment = "Note that VAR should be paraphrased as an instance of TYPE, preserving all\r\nother existing typing information on VAR.\nNote that VAR should be paraphrased as an instance of TYPE, preserving all\nother existing typing information on VAR.")
    public static SubLObject pph_update_var_type(final SubLObject var, final SubLObject type) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject existing = pph_var_entry(var);
	final SubLObject v_new = (NIL != existing) ? pph_var_entry_copy(existing) : new_pph_var_entry(var, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	set_pph_var_type(v_new, type);
	if (NIL == existing) {
	    set_pph_var_type_map(v_new, pph_utilities.pph_new_empty_map());
	}
	dictionary.dictionary_enter(pph_vars.$pph_var_types$.getDynamicValue(thread), var, v_new);
	pph_note_var_type(var, type);
	return pph_vars.$pph_var_types$.getDynamicValue(thread);
    }

    public static final SubLObject pph_deregister_var_alt(SubLObject var) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    dictionary.dictionary_remove(pph_vars.$pph_var_types$.getDynamicValue(thread), var);
	    return pph_vars.$pph_var_types$.getDynamicValue(thread);
	}
    }

    public static SubLObject pph_deregister_var(final SubLObject var) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	dictionary.dictionary_remove(pph_vars.$pph_var_types$.getDynamicValue(thread), var);
	return pph_vars.$pph_var_types$.getDynamicValue(thread);
    }

    public static final SubLObject pph_deregister_vars_alt(SubLObject vars) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    Mapping.mapcar(PPH_DEREGISTER_VAR, vars);
	    return pph_vars.$pph_var_types$.getDynamicValue(thread);
	}
    }

    public static SubLObject pph_deregister_vars(final SubLObject vars) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	Mapping.mapcar(PPH_DEREGISTER_VAR, vars);
	return pph_vars.$pph_var_types$.getDynamicValue(thread);
    }

    public static final SubLObject pph_var_quantifiedP_alt(SubLObject var) {
	return makeBoolean((NIL != pph_var_registeredP(var)) && (NIL != member(pph_var_quantifier(var), $list_alt37, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject pph_var_quantifiedP(final SubLObject var) {
	return makeBoolean((NIL != pph_var_registeredP(var)) && (NIL != member(pph_var_quantifier(var), $list37, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject pph_register_var_quantifier_alt(SubLObject var, SubLObject quantifier) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL == pph_vars.pph_quantifier_keyword_p(quantifier)) {
		if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
		    Errors.warn($str_alt38$___S_is_not_a_quantifier_keyword_, quantifier, pph_vars.pph_quantifier_keywords());
		}
		return NIL;
	    }
	    {
		SubLObject existing = pph_var_entry(var);
		SubLObject v_new = (NIL != existing) ? ((SubLObject) (pph_var_entry_copy(existing))) : new_pph_var_entry(var, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		set_pph_var_quantifier(v_new, quantifier);
		dictionary.dictionary_enter(pph_vars.$pph_var_types$.getDynamicValue(thread), var, v_new);
	    }
	    return pph_vars.$pph_var_types$.getDynamicValue(thread);
	}
    }

    public static SubLObject pph_register_var_quantifier(final SubLObject var, final SubLObject quantifier) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL == pph_vars.pph_quantifier_keyword_p(quantifier)) {
	    if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
		Errors.warn($str38$___S_is_not_a_quantifier_keyword_, quantifier, pph_vars.pph_quantifier_keywords());
		force_output(StreamsLow.$error_output$.getDynamicValue(thread));
	    }
	    return NIL;
	}
	final SubLObject existing = pph_var_entry(var);
	final SubLObject v_new = (NIL != existing) ? pph_var_entry_copy(existing) : new_pph_var_entry(var, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	set_pph_var_quantifier(v_new, quantifier);
	dictionary.dictionary_enter(pph_vars.$pph_var_types$.getDynamicValue(thread), var, v_new);
	return pph_vars.$pph_var_types$.getDynamicValue(thread);
    }

    /**
     *
     *
     * @param OPERATOR;
     * 		CycL operator with scoping args.
     */
    @LispMethod(comment = "@param OPERATOR;\r\n\t\tCycL operator with scoping args.")
    public static final SubLObject pph_quantifier_for_operator_alt(SubLObject operator) {
	if (NIL != pph_utilities.pph_isaP(operator, $$ExistentialQuantifier, UNPROVIDED)) {
	    return $EXISTENTIAL;
	} else {
	    if (operator == $$forAll) {
		return $UNIVERSAL;
	    } else {
		return $SCOPED;
	    }
	}
    }

    /**
     *
     *
     * @param OPERATOR;
     * 		CycL operator with scoping args.
     */
    @LispMethod(comment = "@param OPERATOR;\r\n\t\tCycL operator with scoping args.")
    public static SubLObject pph_quantifier_for_operator(final SubLObject operator) {
	if (NIL != pph_utilities.pph_isaP(operator, $$ExistentialQuantifier, UNPROVIDED)) {
	    return $EXISTENTIAL;
	}
	if (operator.eql($$forAll)) {
	    return $UNIVERSAL;
	}
	return $SCOPED;
    }

    public static final SubLObject pph_register_scoped_vars_alt(SubLObject formula) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if ((NIL != el_formula_p(formula)) && (NIL != indexed_term_p(cycl_utilities.formula_arg0(formula)))) {
		{
		    SubLObject operator = cycl_utilities.formula_arg0(formula);
		    SubLObject scoping_args = kb_accessors.scoping_args(operator, pph_vars.$pph_domain_mt$.getDynamicValue(thread));
		    SubLObject quantifier = (NIL != scoping_args) ? ((SubLObject) (pph_quantifier_for_operator(operator))) : NIL;
		    SubLObject argnum = ZERO_INTEGER;
		    SubLObject args = cycl_utilities.formula_args(formula, $IGNORE);
		    SubLObject cdolist_list_var = args;
		    SubLObject arg = NIL;
		    for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), arg = cdolist_list_var.first()) {
			argnum = add(argnum, ONE_INTEGER);
			if (NIL != member(argnum, scoping_args, UNPROVIDED, UNPROVIDED)) {
			    if ((NIL != cycl_variables.el_varP(arg)) && (NIL == pph_var_quantifier(arg))) {
				pph_register_var_quantifier(arg, quantifier);
			    }
			} else {
			    if (NIL != el_formula_p(arg)) {
				pph_register_scoped_vars(arg);
			    }
			}
		    }
		}
	    }
	    return formula;
	}
    }

    public static SubLObject pph_register_scoped_vars(final SubLObject formula) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if ((NIL != el_formula_p(formula)) && (NIL != indexed_term_p(cycl_utilities.formula_arg0(formula)))) {
	    final SubLObject operator = cycl_utilities.formula_arg0(formula);
	    final SubLObject scoping_args = kb_accessors.scoping_args(operator, pph_vars.$pph_domain_mt$.getDynamicValue(thread));
	    final SubLObject quantifier = (NIL != scoping_args) ? pph_quantifier_for_operator(operator) : NIL;
	    SubLObject argnum = ZERO_INTEGER;
	    SubLObject cdolist_list_var;
	    final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(formula, $IGNORE);
	    SubLObject arg = NIL;
	    arg = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		argnum = add(argnum, ONE_INTEGER);
		if (NIL != member(argnum, scoping_args, UNPROVIDED, UNPROVIDED)) {
		    if ((NIL != cycl_variables.el_varP(arg)) && (NIL == pph_var_quantifier(arg))) {
			pph_register_var_quantifier(arg, quantifier);
		    }
		} else if (NIL != el_formula_p(arg)) {
		    pph_register_scoped_vars(arg);
		}

		cdolist_list_var = cdolist_list_var.rest();
		arg = cdolist_list_var.first();
	    }
	}
	return formula;
    }

    public static SubLObject with_pph_hypothesized_vars(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list45);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject vars = NIL;
	destructuring_bind_must_consp(current, datum, $list45);
	vars = current.first();
	current = current.rest();
	if (NIL == current) {
	    final SubLObject body;
	    current = body = temp;
	    return listS(CLET, list(list($pph_hypothesized_vars$, listS(CCONCATENATE, vars, $list49))), append(body, NIL));
	}
	cdestructuring_bind_error(datum, $list45);
	return NIL;
    }

    /**
     * Unbound vars in a query are requests for bindings, so we shouldn't give
     * them universal quantification.
     */
    @LispMethod(comment = "Unbound vars in a query are requests for bindings, so we shouldn\'t give\r\nthem universal quantification.\nUnbound vars in a query are requests for bindings, so we shouldn\'t give\nthem universal quantification.")
    public static final SubLObject pph_register_query_vars_alt(SubLObject query_formula) {
	{
	    SubLObject query_vars = remove_if(PPH_EXISTENTIAL_VAR_P, pph_formula_free_variables(query_formula, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    if (NIL != pph_question.pph_hypothesize_antecedent_varsP(query_formula)) {
		{
		    SubLObject antecedent_vars = pph_utilities.pph_vars_to_quantify(cycl_utilities.formula_arg1(query_formula, UNPROVIDED));
		    query_vars = set_difference(query_vars, antecedent_vars, UNPROVIDED, UNPROVIDED);
		}
	    }
	    {
		SubLObject cdolist_list_var = query_vars;
		SubLObject query_var = NIL;
		for (query_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), query_var = cdolist_list_var.first()) {
		    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
			format(T, $str_alt46$__Registering__S_as_a_query_var__, query_var);
		    }
		    pph_register_var_quantifier(query_var, $QUERY);
		}
	    }
	    return query_vars;
	}
    }

    /**
     * Unbound vars in a query are requests for bindings, so we shouldn't give
     * them universal quantification.
     */
    @LispMethod(comment = "Unbound vars in a query are requests for bindings, so we shouldn\'t give\r\nthem universal quantification.\nUnbound vars in a query are requests for bindings, so we shouldn\'t give\nthem universal quantification.")
    public static SubLObject pph_register_query_vars(final SubLObject query_formula) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject query_vars = remove_if(PPH_EXISTENTIAL_VAR_P, pph_formula_free_variables(query_formula, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	query_vars = set_difference(query_vars, $pph_hypothesized_vars$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
	if (NIL != pph_question.pph_hypothesize_antecedent_varsP(query_formula)) {
	    final SubLObject antecedent_vars = pph_utilities.pph_vars_to_quantify(cycl_utilities.formula_arg1(query_formula, UNPROVIDED));
	    query_vars = set_difference(query_vars, antecedent_vars, UNPROVIDED, UNPROVIDED);
	}
	SubLObject cdolist_list_var = query_vars;
	SubLObject query_var = NIL;
	query_var = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
		format_nil.force_format(T, $str51$__Registering__S_as_a_query_var__, query_var, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    }
	    pph_register_var_quantifier(query_var, $QUERY);
	    cdolist_list_var = cdolist_list_var.rest();
	    query_var = cdolist_list_var.first();
	}
	return query_vars;
    }

    public static final SubLObject pph_query_var_p_alt(SubLObject var) {
	return makeBoolean((NIL != cycl_variables.el_varP(var)) && ($QUERY == pph_var_quantifier(var)));
    }

    public static SubLObject pph_query_var_p(final SubLObject var) {
	return makeBoolean((NIL != cycl_variables.el_varP(var)) && ($QUERY == pph_var_quantifier(var)));
    }

    public static final SubLObject pph_existential_var_p_alt(SubLObject var) {
	return eq($EXISTENTIAL, pph_var_quantifier(var));
    }

    public static SubLObject pph_existential_var_p(final SubLObject var) {
	return eq($EXISTENTIAL, pph_var_quantifier(var));
    }

    public static final SubLObject pph_note_if_var_is_used_only_once_in_formula_alt(SubLObject var, SubLObject formula) {
	{
	    SubLObject duplicateP = list_utilities.tree_countG(var, pph_strip_existentials(formula, UNPROVIDED), ONE_INTEGER, UNPROVIDED, UNPROVIDED);
	    if (NIL == duplicateP) {
		pph_register_var_as_used_only_once(var);
	    }
	    return duplicateP;
	}
    }

    public static SubLObject pph_note_if_var_is_used_only_once_in_formula(final SubLObject var, final SubLObject formula) {
	final SubLObject duplicateP = list_utilities.tree_countG(var, pph_strip_existentials(formula, UNPROVIDED), ONE_INTEGER, UNPROVIDED, UNPROVIDED);
	if (NIL == duplicateP) {
	    pph_register_var_as_used_only_once(var);
	}
	return duplicateP;
    }

    public static final SubLObject pph_register_var_as_used_only_once_alt(SubLObject var) {
	{
	    SubLObject entry = pph_var_entry(var);
	    _csetf_pph_var_entry_single_useP(entry, T);
	    return entry;
	}
    }

    public static SubLObject pph_register_var_as_used_only_once(final SubLObject var) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject entry = pph_var_entry(var);
	if (NIL != pph_var_entry_p(entry)) {
	    _csetf_pph_var_entry_single_useP(entry, T);
	} else if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
	    Errors.warn($str53$PPH_REGISTER_VAR_AS_USED_ONLY_ONC, var);
	    force_output(StreamsLow.$error_output$.getDynamicValue(thread));
	}

	return entry;
    }

    public static final SubLObject pph_var_used_only_onceP_alt(SubLObject var) {
	{
	    SubLObject entry = pph_var_entry(var);
	    return NIL != entry ? ((SubLObject) (pph_var_entry_single_useP(entry))) : NIL;
	}
    }

    public static SubLObject pph_var_used_only_onceP(final SubLObject var) {
	final SubLObject entry = pph_var_entry(var);
	return NIL != entry ? pph_var_entry_single_useP(entry) : NIL;
    }

    /**
     * Execute BODY for each VAR-ENTRY in *pph-var-types* until STOP-VAR
     */
    @LispMethod(comment = "Execute BODY for each VAR-ENTRY in *pph-var-types* until STOP-VAR")
    public static final SubLObject pph_do_var_entries_alt(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    destructuring_bind_must_consp(current, datum, $list_alt48);
	    {
		SubLObject temp = current.rest();
		current = current.first();
		{
		    SubLObject var = NIL;
		    SubLObject var_entry = NIL;
		    SubLObject stop_var = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt48);
		    var = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt48);
		    var_entry = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt48);
		    stop_var = current.first();
		    current = current.rest();
		    if (NIL == current) {
			current = temp;
			{
			    SubLObject body = current;
			    return listS(DO_DICTIONARY, list(var, var_entry, $pph_var_types$, stop_var), append(body, NIL));
			}
		    } else {
			cdestructuring_bind_error(datum, $list_alt48);
		    }
		}
	    }
	}
	return NIL;
    }

    /**
     * Execute BODY for each VAR-ENTRY in *pph-var-types* until STOP-VAR
     */
    @LispMethod(comment = "Execute BODY for each VAR-ENTRY in *pph-var-types* until STOP-VAR")
    public static SubLObject pph_do_var_entries(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list54);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject var = NIL;
	SubLObject var_entry = NIL;
	destructuring_bind_must_consp(current, datum, $list54);
	var = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list54);
	var_entry = current.first();
	current = current.rest();
	final SubLObject stop_var = (current.isCons()) ? current.first() : NIL;
	destructuring_bind_must_listp(current, datum, $list54);
	current = current.rest();
	if (NIL == current) {
	    final SubLObject body;
	    current = body = temp;
	    return listS(DO_DICTIONARY, list(var, var_entry, $pph_var_types$, stop_var), append(body, NIL));
	}
	cdestructuring_bind_error(datum, $list54);
	return NIL;
    }

    public static final SubLObject pph_var_quantifier_alt(SubLObject var) {
	{
	    SubLObject entry = pph_var_entry(var);
	    return NIL != entry ? ((SubLObject) (pph_var_entry_quantifier(entry))) : NIL;
	}
    }

    public static SubLObject pph_var_quantifier(final SubLObject var) {
	final SubLObject entry = pph_var_entry(var);
	return NIL != entry ? pph_var_entry_quantifier(entry) : NIL;
    }

    /**
     *
     *
     * @return CycL collection or registered var that was / will be used to generate a noun for VAR.
     */
    @LispMethod(comment = "@return CycL collection or registered var that was / will be used to generate a noun for VAR.")
    public static final SubLObject pph_var_type_alt(SubLObject var) {
	{
	    SubLObject entry = pph_var_entry(var);
	    return NIL != entry ? ((SubLObject) (pph_var_entry_type(entry))) : pph_default_var_type();
	}
    }

    /**
     *
     *
     * @return CycL collection or registered var that was / will be used to generate a noun for VAR.
     */
    @LispMethod(comment = "@return CycL collection or registered var that was / will be used to generate a noun for VAR.")
    public static SubLObject pph_var_type(final SubLObject var) {
	final SubLObject entry = pph_var_entry(var);
	return NIL != entry ? pph_var_entry_type(entry) : pph_default_var_type();
    }

    /**
     *
     *
     * @return CycL collection that was / will be used to generate a noun for VAR.
     */
    @LispMethod(comment = "@return CycL collection that was / will be used to generate a noun for VAR.")
    public static final SubLObject pph_cycl_var_type_alt(SubLObject var) {
	{
	    SubLObject entry = pph_var_entry(var);
	    SubLObject var_type = (NIL != entry) ? ((SubLObject) (pph_var_entry_type(entry))) : pph_default_var_type();
	    while (NIL != cycl_variables.el_varP(var_type)) {
		{
		    SubLObject var_type_type = pph_var_type(var_type);
		    if (NIL != pph_utilities.specs_fn_natP(var_type_type)) {
			var_type = cycl_utilities.nat_arg1(var_type_type, UNPROVIDED);
		    } else {
			var_type = pph_default_var_type();
		    }
		}
	    }
	    return var_type;
	}
    }

    /**
     *
     *
     * @return CycL collection that was / will be used to generate a noun for VAR.
     */
    @LispMethod(comment = "@return CycL collection that was / will be used to generate a noun for VAR.")
    public static SubLObject pph_cycl_var_type(final SubLObject var) {
	final SubLObject entry = pph_var_entry(var);
	SubLObject var_type = (NIL != entry) ? pph_var_entry_type(entry) : pph_default_var_type();
	while (NIL != cycl_variables.el_varP(var_type)) {
	    final SubLObject var_type_type = pph_var_type(var_type);
	    if (NIL != pph_utilities.specs_fn_natP(var_type_type)) {
		var_type = cycl_utilities.nat_arg1(var_type_type, UNPROVIDED);
	    } else {
		var_type = pph_default_var_type();
	    }
	}
	return var_type;
    }

    /**
     *
     *
     * @return arg position map for the term that denotes the *type* of VAR in the original
    sentence being paraphrased, if known.
     */
    @LispMethod(comment = "@return arg position map for the term that denotes the *type* of VAR in the original\r\nsentence being paraphrased, if known.")
    public static final SubLObject pph_type_arg_position_map_alt(SubLObject var) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject entry = pph_var_entry(var);
		SubLObject type_map = (NIL != entry) ? ((SubLObject) (pph_var_entry_arg_position(entry))) : pph_utilities.pph_new_empty_map();
		if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_utilities.pph_arg_position_map_p(type_map)))) {
		    {
			SubLObject new_format_string = cconcatenate($str_alt27$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt28$__,
				format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(type_map), new SubLObject[] { $str_alt29$_is_not_a_, format_nil.format_nil_s_no_copy(PPH_ARG_POSITION_MAP_P) })) });
			pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
		    }
		}
		return type_map;
	    }
	}
    }

    /**
     *
     *
     * @return arg position map for the term that denotes the *type* of VAR in the original
    sentence being paraphrased, if known.
     */
    @LispMethod(comment = "@return arg position map for the term that denotes the *type* of VAR in the original\r\nsentence being paraphrased, if known.")
    public static SubLObject pph_type_arg_position_map(final SubLObject var) {
	final SubLObject entry = pph_var_entry(var);
	final SubLObject type_map = (NIL != entry) ? pph_var_entry_arg_position(entry) : pph_utilities.pph_new_empty_map();
	return type_map;
    }

    /**
     *
     *
     * @return BOOLEAN; Is OBJ an unregistered variable?
     */
    @LispMethod(comment = "@return BOOLEAN; Is OBJ an unregistered variable?")
    public static final SubLObject pph_unregistered_variableP_alt(SubLObject obj) {
	return makeBoolean((NIL != cycl_variables.el_varP(obj)) && (NIL == pph_var_registeredP(obj)));
    }

    /**
     *
     *
     * @return BOOLEAN; Is OBJ an unregistered variable?
     */
    @LispMethod(comment = "@return BOOLEAN; Is OBJ an unregistered variable?")
    public static SubLObject pph_unregistered_variableP(final SubLObject obj) {
	return makeBoolean((NIL != cycl_variables.el_varP(obj)) && (NIL == pph_var_registeredP(obj)));
    }

    /**
     *
     *
     * @return BOOLEAN; Is TYPE the type of more than one registered variable?
     */
    @LispMethod(comment = "@return BOOLEAN; Is TYPE the type of more than one registered variable?")
    public static final SubLObject pph_duplicate_var_typeP_alt(SubLObject type) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    return makeBoolean((NIL != pph_vars.pph_tracking_var_types_p())
		    && count(type, Mapping.mapcar(symbol_function(PPH_VAR_ENTRY_TYPE), dictionary.dictionary_values(pph_vars.$pph_var_types$.getDynamicValue(thread))), symbol_function($sym51$PPH_SPEC_), UNPROVIDED, UNPROVIDED, UNPROVIDED).numG(ONE_INTEGER));
	}
    }

    /**
     *
     *
     * @return BOOLEAN; Is TYPE the type of more than one registered variable?
     */
    @LispMethod(comment = "@return BOOLEAN; Is TYPE the type of more than one registered variable?")
    public static SubLObject pph_duplicate_var_typeP(final SubLObject type) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	return makeBoolean(
		(NIL != pph_vars.pph_tracking_var_types_p()) && count(type, Mapping.mapcar(symbol_function(PPH_VAR_ENTRY_TYPE), dictionary.dictionary_values(pph_vars.$pph_var_types$.getDynamicValue(thread))), symbol_function($sym57$PPH_SPEC_), UNPROVIDED, UNPROVIDED, UNPROVIDED).numG(ONE_INTEGER));
    }

    public static final SubLObject pph_var_paraphrased_explicitlyP_alt(SubLObject obj) {
	{
	    SubLObject var_as_var_olist = pph_methods.pph_paraphrase_var_as_var(obj, UNPROVIDED, UNPROVIDED);
	    SubLObject var_as_var_string = pph_phrase.pph_phrase_output_list_string(var_as_var_olist, UNPROVIDED);
	    SubLObject foundP = NIL;
	    if (NIL == foundP) {
		{
		    SubLObject csome_list_var = pph_var_paraphrases(obj);
		    SubLObject paraphrase = NIL;
		    for (paraphrase = csome_list_var.first(); !((NIL != foundP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), paraphrase = csome_list_var.first()) {
			if (NIL != pph_phrase.pph_phrase_p(paraphrase, UNPROVIDED)) {
			    foundP = equal(var_as_var_string, pph_phrase.pph_phrase_string(paraphrase, UNPROVIDED));
			}
		    }
		}
	    }
	    return foundP;
	}
    }

    public static SubLObject pph_var_paraphrased_explicitlyP(final SubLObject obj) {
	final SubLObject var_as_var_olist = pph_methods.pph_paraphrase_var_as_var(obj, UNPROVIDED, UNPROVIDED);
	final SubLObject var_as_var_string = pph_phrase.pph_phrase_output_list_string(var_as_var_olist, UNPROVIDED);
	SubLObject foundP = NIL;
	if (NIL == foundP) {
	    SubLObject csome_list_var = pph_drs.pph_discourse_phrases_for_cycl(obj);
	    SubLObject paraphrase = NIL;
	    paraphrase = csome_list_var.first();
	    while ((NIL == foundP) && (NIL != csome_list_var)) {
		if (NIL != pph_phrase.pph_phrase_p(paraphrase, UNPROVIDED)) {
		    foundP = equal(var_as_var_string, pph_phrase.pph_phrase_string(paraphrase, UNPROVIDED));
		}
		csome_list_var = csome_list_var.rest();
		paraphrase = csome_list_var.first();
	    }
	}
	return foundP;
    }

    public static final SubLObject string_mentions_varP_alt(SubLObject string, SubLObject var) {
	return string_utilities.substringP(pph_phrase.pph_phrase_output_list_string(pph_methods.pph_paraphrase_var_as_var(var, UNPROVIDED, UNPROVIDED), NIL), string, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject string_mentions_varP(final SubLObject string, final SubLObject var) {
	return string_utilities.substringP(pph_phrase.pph_phrase_output_list_string(pph_methods.pph_paraphrase_var_as_var(var, UNPROVIDED, UNPROVIDED), NIL), string, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Should we use an explicit variable to paraphrase VAR?
     */
    @LispMethod(comment = "Should we use an explicit variable to paraphrase VAR?")
    public static final SubLObject pph_use_explicit_varP_alt(SubLObject var) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != pph_vars.pph_maximize_linksP()) {
		return T;
	    } else {
		if (NIL != pph_query_var_p(var)) {
		    return makeBoolean(NIL == pph_vars.$pph_use_wh_for_query_varsP$.getDynamicValue(thread));
		} else {
		    if (NIL != pph_var_used_only_onceP(var)) {
			return NIL;
		    } else {
			if (NIL != pph_var_previously_explicitP(var)) {
			    return T;
			} else {
			    return NIL;
			}
		    }
		}
	    }
	}
    }

    @LispMethod(comment = "Should we use an explicit variable to paraphrase VAR?")
    public static SubLObject pph_use_explicit_varP(final SubLObject var) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL != pph_vars.pph_maximize_linksP()) {
	    return T;
	}
	if (NIL != pph_var_previously_explicitP(var)) {
	    return T;
	}
	if (NIL != pph_query_var_p(var)) {
	    return makeBoolean(NIL == pph_vars.$pph_use_wh_for_query_varsP$.getDynamicValue(thread));
	}
	if (NIL != pph_var_used_only_onceP(var)) {
	    return NIL;
	}
	return NIL;
    }

    /**
    * Should we use an explicit variable to paraphrase VAR?
    */

    /**
     * If TYPE was paraphrased before, did it use an explicit variable?
     */
    @LispMethod(comment = "If TYPE was paraphrased before, did it use an explicit variable?")
    public static final SubLObject pph_var_type_previously_explicit_if_mentionedP_alt(SubLObject type) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject mentionedP = NIL;
		SubLObject explicitP = NIL;
		SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(pph_vars.$pph_var_types$.getDynamicValue(thread)));
		while (!((NIL != explicitP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
		    thread.resetMultipleValues();
		    {
			SubLObject var_entry_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
			SubLObject var_entry = thread.secondMultipleValue();
			thread.resetMultipleValues();
			if (pph_var_entry_type(var_entry).equal(type) && (NIL != pph_var_entry_paraphrases(var_entry))) {
			    mentionedP = T;
			    if (NIL == explicitP) {
				{
				    SubLObject csome_list_var = pph_var_entry_paraphrases(var_entry);
				    SubLObject paraphrase = NIL;
				    for (paraphrase = csome_list_var.first(); !((NIL != explicitP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), paraphrase = csome_list_var.first()) {
					if (NIL != pph_phrase.pph_phrase_p(paraphrase, UNPROVIDED)) {
					    explicitP = string_mentions_varP(pph_phrase.pph_phrase_string(paraphrase, NIL), var_entry_var);
					}
				    }
				}
			    }
			}
			iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
		    }
		}
		dictionary_contents.do_dictionary_contents_finalize(iteration_state);
		return makeBoolean((NIL == mentionedP) || (NIL != explicitP));
	    }
	}
    }

    @LispMethod(comment = "If TYPE was paraphrased before, did it use an explicit variable?")
    public static SubLObject pph_var_type_previously_explicit_if_mentionedP(final SubLObject type) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject iteration_state;
	for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(pph_vars.$pph_var_types$.getDynamicValue(thread))); NIL == dictionary_contents.do_dictionary_contents_doneP(
		iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
	    thread.resetMultipleValues();
	    final SubLObject var_entry_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
	    final SubLObject var_entry = thread.secondMultipleValue();
	    thread.resetMultipleValues();
	    if ((!pph_var_entry_type(var_entry).equal(type)) || (NIL == pph_drs.pph_discourse_referentP(var_entry_var))) {
		return NIL;
	    }
	    SubLObject cdolist_list_var = pph_drs.pph_discourse_phrases_for_cycl(var_entry_var);
	    SubLObject paraphrase = NIL;
	    paraphrase = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		if ((NIL != pph_phrase.pph_phrase_p(paraphrase, UNPROVIDED)) && (NIL != string_mentions_varP(pph_phrase.pph_phrase_string(paraphrase, NIL), var_entry_var))) {
		    return T;
		}
		cdolist_list_var = cdolist_list_var.rest();
		paraphrase = cdolist_list_var.first();
	    }
	}
	dictionary_contents.do_dictionary_contents_finalize(iteration_state);
	return NIL;
    }

    /**
    * If TYPE was paraphrased before, did it use an explicit variable?
    */

    /**
     * Was there any paraphrase of VAR that used an explicit variable?
     */
    @LispMethod(comment = "Was there any paraphrase of VAR that used an explicit variable?")
    public static final SubLObject pph_var_previously_explicitP_alt(SubLObject var) {
	{
	    SubLObject paraphrases = pph_var_paraphrases(var);
	    SubLObject explicitP = NIL;
	    if (NIL == explicitP) {
		{
		    SubLObject csome_list_var = paraphrases;
		    SubLObject paraphrase = NIL;
		    for (paraphrase = csome_list_var.first(); !((NIL != explicitP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), paraphrase = csome_list_var.first()) {
			if (NIL != pph_phrase.pph_phrase_p(paraphrase, UNPROVIDED)) {
			    explicitP = string_mentions_varP(pph_phrase.pph_phrase_string(paraphrase, NIL), var);
			}
		    }
		}
	    }
	    return explicitP;
	}
    }

    @LispMethod(comment = "Was there any paraphrase of VAR that used an explicit variable?")
    public static SubLObject pph_var_previously_explicitP(final SubLObject var) {
	final SubLObject paraphrases = pph_drs.pph_discourse_phrases_for_cycl(var);
	SubLObject explicitP = NIL;
	if (NIL == explicitP) {
	    SubLObject csome_list_var = paraphrases;
	    SubLObject paraphrase = NIL;
	    paraphrase = csome_list_var.first();
	    while ((NIL == explicitP) && (NIL != csome_list_var)) {
		if (NIL != pph_phrase.pph_phrase_p(paraphrase, UNPROVIDED)) {
		    explicitP = string_mentions_varP(pph_phrase.pph_phrase_string(paraphrase, NIL), var);
		}
		csome_list_var = csome_list_var.rest();
		paraphrase = csome_list_var.first();
	    }
	}
	return explicitP;
    }

    /**
    * Was there any paraphrase of VAR that used an explicit variable?
    */

    /**
     * Was there any paraphrase of VAR that did *not* use an explicit variable?
     */
    @LispMethod(comment = "Was there any paraphrase of VAR that did *not* use an explicit variable?")
    public static final SubLObject pph_var_previously_lexifiedP_alt(SubLObject var) {
	{
	    SubLObject paraphrases = pph_var_paraphrases(var);
	    SubLObject lexifiedP = NIL;
	    if (NIL == lexifiedP) {
		{
		    SubLObject csome_list_var = paraphrases;
		    SubLObject paraphrase = NIL;
		    for (paraphrase = csome_list_var.first(); !((NIL != lexifiedP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), paraphrase = csome_list_var.first()) {
			if (!((NIL != pph_phrase.pph_phrase_p(paraphrase, UNPROVIDED)) && (NIL != string_mentions_varP(pph_phrase.pph_phrase_string(paraphrase, NIL), var)))) {
			    lexifiedP = T;
			}
		    }
		}
	    }
	    return lexifiedP;
	}
    }

    @LispMethod(comment = "Was there any paraphrase of VAR that did *not* use an explicit variable?")
    public static SubLObject pph_var_previously_lexifiedP(final SubLObject var) {
	final SubLObject paraphrases = pph_drs.pph_discourse_phrases_for_cycl(var);
	SubLObject lexifiedP = NIL;
	if (NIL == lexifiedP) {
	    SubLObject csome_list_var = paraphrases;
	    SubLObject paraphrase = NIL;
	    paraphrase = csome_list_var.first();
	    while ((NIL == lexifiedP) && (NIL != csome_list_var)) {
		if ((NIL == pph_phrase.pph_phrase_p(paraphrase, UNPROVIDED)) || (NIL == string_mentions_varP(pph_phrase.pph_phrase_string(paraphrase, NIL), var))) {
		    lexifiedP = T;
		}
		csome_list_var = csome_list_var.rest();
		paraphrase = csome_list_var.first();
	    }
	}
	return lexifiedP;
    }

    /**
    * Was there any paraphrase of VAR that did *not* use an explicit variable?
    */

    public static final SubLObject pph_string_is_posP_internal_alt(SubLObject string, SubLObject pos, SubLObject parse_morphologically, SubLObject mt) {
	if (parse_morphologically == UNPROVIDED) {
	    parse_morphologically = $NEVER;
	}
	if (mt == UNPROVIDED) {
	    mt = pph_vars.$pph_language_mt$.getDynamicValue();
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject ans = NIL;
		{
		    SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
		    SubLObject _prev_bind_1 = lexicon_vars.$parse_morphologically$.currentBinding(thread);
		    try {
			lexicon_vars.$lexicon_lookup_mt$.bind(mt, thread);
			lexicon_vars.$parse_morphologically$.bind(parse_morphologically, thread);
			{
			    SubLObject local_state = pph_macros.find_or_create_pph_external_memoization_state();
			    {
				SubLObject _prev_bind_0_1 = memoization_state.$memoization_state$.currentBinding(thread);
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
							Errors.error($str_alt54$Invalid_attempt_to_reuse_memoizat);
						    }
						}
					    }
					}
					try {
					    ans = lexicon_accessors.string_is_posP(string, pos, UNPROVIDED, UNPROVIDED, UNPROVIDED);
					} finally {
					    {
						SubLObject _prev_bind_0_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
						try {
						    $is_thread_performing_cleanupP$.bind(T, thread);
						    if ((NIL != local_state) && (NIL == original_memoization_process)) {
							memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
						    }
						} finally {
						    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_2, thread);
						}
					    }
					}
				    }
				} finally {
				    memoization_state.$memoization_state$.rebind(_prev_bind_0_1, thread);
				}
			    }
			}
		    } finally {
			lexicon_vars.$parse_morphologically$.rebind(_prev_bind_1, thread);
			lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
		    }
		}
		return ans;
	    }
	}
    }

    public static SubLObject pph_string_is_posP_internal(final SubLObject string, final SubLObject pos, SubLObject parse_morphologically, SubLObject mt) {
	if (parse_morphologically == UNPROVIDED) {
	    parse_morphologically = $NEVER;
	}
	if (mt == UNPROVIDED) {
	    mt = pph_vars.$pph_language_mt$.getDynamicValue();
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject ans = NIL;
	final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
	final SubLObject _prev_bind_2 = pph_vars.$allow_utf8_in_pph_text_mode$.currentBinding(thread);
	final SubLObject _prev_bind_3 = lexicon_vars.$parse_morphologically$.currentBinding(thread);
	try {
	    lexicon_vars.$lexicon_lookup_mt$.bind(mt, thread);
	    pph_vars.$allow_utf8_in_pph_text_mode$.bind(T, thread);
	    lexicon_vars.$parse_morphologically$.bind(parse_morphologically, thread);
	    final SubLObject local_state = pph_macros.find_or_create_pph_external_memoization_state();
	    final SubLObject _prev_bind_0_$1 = memoization_state.$memoization_state$.currentBinding(thread);
	    try {
		memoization_state.$memoization_state$.bind(local_state, thread);
		final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
		try {
		    ans = lexicon_accessors.string_is_posP(pph_string.pph_string_if_non_null_to_output_format(string, $TEXT), pos, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		} finally {
		    final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
		    try {
			$is_thread_performing_cleanupP$.bind(T, thread);
			final SubLObject _values = getValuesAsVector();
			memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
			restoreValuesFromVector(_values);
		    } finally {
			$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
		    }
		}
	    } finally {
		memoization_state.$memoization_state$.rebind(_prev_bind_0_$1, thread);
	    }
	} finally {
	    lexicon_vars.$parse_morphologically$.rebind(_prev_bind_3, thread);
	    pph_vars.$allow_utf8_in_pph_text_mode$.rebind(_prev_bind_2, thread);
	    lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
	}
	return ans;
    }

    public static final SubLObject pph_string_is_posP_alt(SubLObject string, SubLObject pos, SubLObject parse_morphologically, SubLObject mt) {
	if (parse_morphologically == UNPROVIDED) {
	    parse_morphologically = $NEVER;
	}
	if (mt == UNPROVIDED) {
	    mt = pph_vars.$pph_language_mt$.getDynamicValue();
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
		    return pph_string_is_posP_internal(string, pos, parse_morphologically, mt);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym52$PPH_STRING_IS_POS_, UNPROVIDED);
		if (NIL == caching_state) {
		    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym52$PPH_STRING_IS_POS_, FOUR_INTEGER, $int$128, EQUAL, UNPROVIDED);
		    memoization_state.memoization_state_put(v_memoization_state, $sym52$PPH_STRING_IS_POS_, caching_state);
		}
		{
		    SubLObject sxhash = memoization_state.sxhash_calc_4(string, pos, parse_morphologically, mt);
		    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		    if (collisions != $kw56$_MEMOIZED_ITEM_NOT_FOUND_) {
			{
			    SubLObject cdolist_list_var = collisions;
			    SubLObject collision = NIL;
			    for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
				{
				    SubLObject cached_args = collision.first();
				    SubLObject results2 = second(collision);
				    if (string.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (pos.equal(cached_args.first())) {
					    cached_args = cached_args.rest();
					    if (parse_morphologically.equal(cached_args.first())) {
						cached_args = cached_args.rest();
						if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
						    return memoization_state.caching_results(results2);
						}
					    }
					}
				    }
				}
			    }
			}
		    }
		    {
			SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(pph_string_is_posP_internal(string, pos, parse_morphologically, mt)));
			memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(string, pos, parse_morphologically, mt));
			return memoization_state.caching_results(results);
		    }
		}
	    }
	}
    }

    public static SubLObject pph_string_is_posP(final SubLObject string, final SubLObject pos, SubLObject parse_morphologically, SubLObject mt) {
	if (parse_morphologically == UNPROVIDED) {
	    parse_morphologically = $NEVER;
	}
	if (mt == UNPROVIDED) {
	    mt = pph_vars.$pph_language_mt$.getDynamicValue();
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
	SubLObject caching_state = NIL;
	if (NIL == v_memoization_state) {
	    return pph_string_is_posP_internal(string, pos, parse_morphologically, mt);
	}
	caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym58$PPH_STRING_IS_POS_, UNPROVIDED);
	if (NIL == caching_state) {
	    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym58$PPH_STRING_IS_POS_, FOUR_INTEGER, $int$128, EQUAL, UNPROVIDED);
	    memoization_state.memoization_state_put(v_memoization_state, $sym58$PPH_STRING_IS_POS_, caching_state);
	}
	final SubLObject sxhash = memoization_state.sxhash_calc_4(string, pos, parse_morphologically, mt);
	final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
	if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
	    SubLObject cdolist_list_var = collisions;
	    SubLObject collision = NIL;
	    collision = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		SubLObject cached_args = collision.first();
		final SubLObject results2 = second(collision);
		if (string.equal(cached_args.first())) {
		    cached_args = cached_args.rest();
		    if (pos.equal(cached_args.first())) {
			cached_args = cached_args.rest();
			if (parse_morphologically.equal(cached_args.first())) {
			    cached_args = cached_args.rest();
			    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
				return memoization_state.caching_results(results2);
			    }
			}
		    }
		}
		cdolist_list_var = cdolist_list_var.rest();
		collision = cdolist_list_var.first();
	    }
	}
	final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_string_is_posP_internal(string, pos, parse_morphologically, mt)));
	memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(string, pos, parse_morphologically, mt));
	return memoization_state.caching_results(results3);
    }

    /**
     * Was there any paraphrase of VAR that used a pronoun?
     */
    @LispMethod(comment = "Was there any paraphrase of VAR that used a pronoun?")
    public static final SubLObject pph_var_previously_pronounP_alt(SubLObject var) {
	{
	    SubLObject paraphrases = pph_var_paraphrases(var);
	    SubLObject pronounP = NIL;
	    if (NIL == pronounP) {
		{
		    SubLObject csome_list_var = paraphrases;
		    SubLObject paraphrase = NIL;
		    for (paraphrase = csome_list_var.first(); !((NIL != pronounP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), paraphrase = csome_list_var.first()) {
			if (NIL != pph_phrase.pph_phrase_p(paraphrase, UNPROVIDED)) {
			    pronounP = pph_string_is_posP(pph_phrase.pph_phrase_string(paraphrase, NIL), $$Pronoun, $NEVER, UNPROVIDED);
			}
		    }
		}
	    }
	    return pronounP;
	}
    }

    @LispMethod(comment = "Was there any paraphrase of VAR that used a pronoun?")
    public static SubLObject pph_var_previously_pronounP(final SubLObject var) {
	final SubLObject paraphrases = pph_drs.pph_discourse_phrases_for_cycl(var);
	SubLObject pronounP = NIL;
	if (NIL == pronounP) {
	    SubLObject csome_list_var = paraphrases;
	    SubLObject paraphrase = NIL;
	    paraphrase = csome_list_var.first();
	    while ((NIL == pronounP) && (NIL != csome_list_var)) {
		if (NIL != pph_phrase.pph_phrase_p(paraphrase, UNPROVIDED)) {
		    pronounP = pph_string_is_posP(pph_phrase.pph_phrase_string(paraphrase, NIL), $$Pronoun, $NEVER, UNPROVIDED);
		}
		csome_list_var = csome_list_var.rest();
		paraphrase = csome_list_var.first();
	    }
	}
	return pronounP;
    }

    /**
    * Was there any paraphrase of VAR that used a pronoun?
    */

    public static final SubLObject pph_register_vars_as_different_alt(SubLObject var1, SubLObject var2) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    $pph_different_vars$.setDynamicValue(list_utilities.alist_enter($pph_different_vars$.getDynamicValue(thread), var1, var2, UNPROVIDED), thread);
	    return $pph_different_vars$.getDynamicValue(thread);
	}
    }

    public static SubLObject pph_register_vars_as_different(final SubLObject var1, final SubLObject var2) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	$pph_different_vars$.setDynamicValue(list_utilities.alist_enter($pph_different_vars$.getDynamicValue(thread), var1, var2, UNPROVIDED), thread);
	return $pph_different_vars$.getDynamicValue(thread);
    }

    /**
     * If STRICT? is T, vars aren't considered different unless explicitly registered
     * as such (typically because #$different holds of them).
     */
    @LispMethod(comment = "If STRICT? is T, vars aren\'t considered different unless explicitly registered\r\nas such (typically because #$different holds of them).\nIf STRICT? is T, vars aren\'t considered different unless explicitly registered\nas such (typically because #$different holds of them).")
    public static final SubLObject pph_different_varsP_alt(SubLObject var1, SubLObject var2, SubLObject strictP) {
	if (strictP == UNPROVIDED) {
	    strictP = T;
	}
	if (NIL != strictP) {
	    return makeBoolean((NIL != pph_different_varsP_int(var1, var2)) || (NIL != pph_different_varsP_int(var2, var1)));
	} else {
	    return makeBoolean(!var1.eql(var2));
	}
    }

    @LispMethod(comment = "If STRICT? is T, vars aren\'t considered different unless explicitly registered\r\nas such (typically because #$different holds of them).\nIf STRICT? is T, vars aren\'t considered different unless explicitly registered\nas such (typically because #$different holds of them).")
    public static SubLObject pph_different_varsP(final SubLObject var1, final SubLObject var2, SubLObject strictP) {
	if (strictP == UNPROVIDED) {
	    strictP = T;
	}
	if (NIL != strictP) {
	    return makeBoolean((NIL != pph_different_varsP_int(var1, var2)) || (NIL != pph_different_varsP_int(var2, var1)));
	}
	return makeBoolean(!var1.eql(var2));
    }

    /**
    * If STRICT? is T, vars aren't considered different unless explicitly registered
    * as such (typically because #$different holds of them).
    */

    public static final SubLObject pph_different_varsP_int_alt(SubLObject var1, SubLObject var2) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    return eql(var2, list_utilities.alist_lookup($pph_different_vars$.getDynamicValue(thread), var1, UNPROVIDED, UNPROVIDED));
	}
    }

    public static SubLObject pph_different_varsP_int(final SubLObject var1, final SubLObject var2) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	return eql(var2, list_utilities.alist_lookup($pph_different_vars$.getDynamicValue(thread), var1, UNPROVIDED, UNPROVIDED));
    }

    /**
     * Make a note that VAR is an instance of TYPE.
     */
    @LispMethod(comment = "Make a note that VAR is an instance of TYPE.")
    public static final SubLObject pph_note_var_type_alt(SubLObject var, SubLObject type) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != dictionary.dictionary_p(pph_vars.$pph_noted_var_types$.getDynamicValue(thread))) {
		dictionary_utilities.dictionary_pushnew(pph_vars.$pph_noted_var_types$.getDynamicValue(thread), var, type, symbol_function(EQUAL), UNPROVIDED);
		if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
		    format(T, $str_alt58$__Noted___S_is_a__S___, var, type);
		}
	    }
	    return var;
	}
    }

    @LispMethod(comment = "Make a note that VAR is an instance of TYPE.")
    public static SubLObject pph_note_var_type(final SubLObject var, final SubLObject type) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL != dictionary.dictionary_p(pph_vars.$pph_noted_var_types$.getDynamicValue(thread))) {
	    dictionary_utilities.dictionary_pushnew(pph_vars.$pph_noted_var_types$.getDynamicValue(thread), var, type, symbol_function(EQUAL), UNPROVIDED);
	    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
		format_nil.force_format(T, $str63$__Noted___S_is_a__S___, var, type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    }
	}
	return var;
    }

    /**
    * Make a note that VAR is an instance of TYPE.
    */

    /**
     * All the variables distinct from VAR that have VAR's type
     */
    @LispMethod(comment = "All the variables distinct from VAR that have VAR\'s type")
    public static final SubLObject pph_other_vars_with_var_type_alt(SubLObject var) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject other_vars = NIL;
		if (NIL != dictionary.dictionary_p(pph_vars.$pph_noted_var_types$.getDynamicValue(thread))) {
		    {
			SubLObject type = pph_var_type(var);
			SubLObject found_varP = NIL;
			SubLObject cdolist_list_var = pph_vars_with_type(type);
			SubLObject other_var = NIL;
			for (other_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), other_var = cdolist_list_var.first()) {
			    if (other_var.equal(var)) {
				found_varP = T;
			    } else {
				other_vars = cons(other_var, other_vars);
			    }
			}
		    }
		}
		return other_vars;
	    }
	}
    }

    @LispMethod(comment = "All the variables distinct from VAR that have VAR\'s type")
    public static SubLObject pph_other_vars_with_var_type(final SubLObject var) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject other_vars = NIL;
	if (NIL != dictionary.dictionary_p(pph_vars.$pph_noted_var_types$.getDynamicValue(thread))) {
	    final SubLObject type = pph_var_type(var);
	    SubLObject found_varP = NIL;
	    SubLObject cdolist_list_var = pph_vars_with_type(type);
	    SubLObject other_var = NIL;
	    other_var = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		if (other_var.equal(var)) {
		    found_varP = T;
		} else {
		    other_vars = cons(other_var, other_vars);
		}
		cdolist_list_var = cdolist_list_var.rest();
		other_var = cdolist_list_var.first();
	    }
	}
	return other_vars;
    }

    /**
    * All the variables distinct from VAR that have VAR's type
    */

    /**
     * All the variables that have TYPE.
     */
    @LispMethod(comment = "All the variables that have TYPE.")
    public static final SubLObject pph_vars_with_type_alt(SubLObject type) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject vars = NIL;
		SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(pph_vars.$pph_noted_var_types$.getDynamicValue(thread)));
		while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
		    thread.resetMultipleValues();
		    {
			SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
			SubLObject var_types = thread.secondMultipleValue();
			thread.resetMultipleValues();
			{
			    SubLObject cdolist_list_var = var_types;
			    SubLObject var_type = NIL;
			    for (var_type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), var_type = cdolist_list_var.first()) {
				if (NIL != pph_utilities.pph_genlP(var_type, type, UNPROVIDED)) {
				    vars = cons(var, vars);
				}
			    }
			}
			iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
		    }
		}
		dictionary_contents.do_dictionary_contents_finalize(iteration_state);
		return vars;
	    }
	}
    }

    @LispMethod(comment = "All the variables that have TYPE.")
    public static SubLObject pph_vars_with_type(final SubLObject type) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject vars = NIL;
	SubLObject iteration_state;
	for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(pph_vars.$pph_noted_var_types$.getDynamicValue(thread))); NIL == dictionary_contents.do_dictionary_contents_doneP(
		iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
	    thread.resetMultipleValues();
	    final SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
	    final SubLObject var_types = thread.secondMultipleValue();
	    thread.resetMultipleValues();
	    SubLObject cdolist_list_var = var_types;
	    SubLObject var_type = NIL;
	    var_type = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		if (NIL != pph_utilities.pph_genlP(var_type, type, UNPROVIDED)) {
		    vars = cons(var, vars);
		}
		cdolist_list_var = cdolist_list_var.rest();
		var_type = cdolist_list_var.first();
	    }
	}
	dictionary_contents.do_dictionary_contents_finalize(iteration_state);
	return vars;
    }

    /**
    * All the variables that have TYPE.
    */

    /**
     * Was there any previous paraphrase of VAR that used the word 'other'?
     */
    @LispMethod(comment = "Was there any previous paraphrase of VAR that used the word \'other\'?")
    public static final SubLObject pph_var_previously_paraphrased_with_otherP_alt(SubLObject var) {
	{
	    SubLObject paraphrases = pph_var_paraphrases(var);
	    SubLObject v_answer = NIL;
	    if (NIL == v_answer) {
		{
		    SubLObject csome_list_var = paraphrases;
		    SubLObject paraphrase = NIL;
		    for (paraphrase = csome_list_var.first(); !((NIL != v_answer) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), paraphrase = csome_list_var.first()) {
			if (NIL != pph_phrase.pph_phrase_p(paraphrase, UNPROVIDED)) {
			    {
				SubLObject paraphrase_string = pph_phrase.pph_phrase_string(paraphrase, NIL);
				if ((NIL != string_utilities.substringP($$$other, paraphrase_string, UNPROVIDED, UNPROVIDED, UNPROVIDED))
					&& ((((NIL != string_utilities.substringP($str_alt60$_other_, paraphrase_string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != string_utilities.starts_with($str_alt61$other_, paraphrase_string)))
						|| (NIL != string_utilities.substringP($str_alt62$_another, paraphrase_string, UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (NIL != string_utilities.starts_with($$$another, paraphrase_string)))) {
				    v_answer = T;
				}
			    }
			}
		    }
		}
	    }
	    return v_answer;
	}
    }

    @LispMethod(comment = "Was there any previous paraphrase of VAR that used the word \'other\'?")
    public static SubLObject pph_var_previously_paraphrased_with_otherP(final SubLObject var) {
	final SubLObject paraphrases = pph_drs.pph_discourse_phrases_for_cycl(var);
	SubLObject v_answer = NIL;
	if (NIL == v_answer) {
	    SubLObject csome_list_var = paraphrases;
	    SubLObject paraphrase = NIL;
	    paraphrase = csome_list_var.first();
	    while ((NIL == v_answer) && (NIL != csome_list_var)) {
		if (NIL != pph_phrase.pph_phrase_p(paraphrase, UNPROVIDED)) {
		    final SubLObject paraphrase_string = pph_phrase.pph_phrase_string(paraphrase, NIL);
		    if ((NIL != string_utilities.substringP($$$other, paraphrase_string, UNPROVIDED, UNPROVIDED, UNPROVIDED))
			    && ((((NIL != string_utilities.substringP($$$_other_, paraphrase_string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != string_utilities.starts_with($$$other_, paraphrase_string)))
				    || (NIL != string_utilities.substringP($$$_another, paraphrase_string, UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (NIL != string_utilities.starts_with($$$another, paraphrase_string)))) {
			v_answer = T;
		    }
		}
		csome_list_var = csome_list_var.rest();
		paraphrase = csome_list_var.first();
	    }
	}
	return v_answer;
    }

    /**
    * Was there any previous paraphrase of VAR that used the word 'other'?
    */

    /**
     *
     *
     * @return LISTP of free variables in FORMULA.
     */
    @LispMethod(comment = "@return LISTP of free variables in FORMULA.")
    public static final SubLObject pph_formula_free_variables_internal_alt(SubLObject formula, SubLObject bound_vars) {
	if (bound_vars == UNPROVIDED) {
	    bound_vars = NIL;
	}
	{
	    SubLObject free_vars = NIL;
	    if (NIL != nart_handles.nart_p(formula)) {
	    } else {
		if (NIL != cycl_grammar.cycl_sentence_p(formula)) {
		    free_vars = sentence_free_variables(formula, bound_vars, $sym65$EL_VAR_, UNPROVIDED);
		} else {
		    if (NIL != narts_high.naut_p(formula)) {
			free_vars = naut_free_variables(formula, bound_vars, $sym65$EL_VAR_, UNPROVIDED);
		    }
		}
	    }
	    return free_vars;
	}
    }

    /**
     *
     *
     * @return LISTP of free variables in FORMULA.
     */
    @LispMethod(comment = "@return LISTP of free variables in FORMULA.")
    public static SubLObject pph_formula_free_variables_internal(final SubLObject formula, SubLObject bound_vars) {
	if (bound_vars == UNPROVIDED) {
	    bound_vars = NIL;
	}
	SubLObject free_vars = NIL;
	if (NIL == nart_handles.nart_p(formula)) {
	    if (NIL != cycl_grammar.cycl_sentence_p(formula)) {
		free_vars = sentence_free_variables(formula, bound_vars, $sym70$EL_VAR_, UNPROVIDED);
	    } else if (NIL != narts_high.naut_p(formula)) {
		free_vars = naut_free_variables(formula, bound_vars, $sym70$EL_VAR_, UNPROVIDED);
	    }

	}
	return free_vars;
    }

    public static final SubLObject pph_formula_free_variables_alt(SubLObject formula, SubLObject bound_vars) {
	if (bound_vars == UNPROVIDED) {
	    bound_vars = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
		    return pph_formula_free_variables_internal(formula, bound_vars);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_FORMULA_FREE_VARIABLES, UNPROVIDED);
		if (NIL == caching_state) {
		    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_FORMULA_FREE_VARIABLES, TWO_INTEGER, $int$98, EQUAL, UNPROVIDED);
		    memoization_state.memoization_state_put(v_memoization_state, PPH_FORMULA_FREE_VARIABLES, caching_state);
		}
		{
		    SubLObject sxhash = memoization_state.sxhash_calc_2(formula, bound_vars);
		    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		    if (collisions != $kw56$_MEMOIZED_ITEM_NOT_FOUND_) {
			{
			    SubLObject cdolist_list_var = collisions;
			    SubLObject collision = NIL;
			    for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
				{
				    SubLObject cached_args = collision.first();
				    SubLObject results2 = second(collision);
				    if (formula.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (((NIL != cached_args) && (NIL == cached_args.rest())) && bound_vars.equal(cached_args.first())) {
					    return memoization_state.caching_results(results2);
					}
				    }
				}
			    }
			}
		    }
		    {
			SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(pph_formula_free_variables_internal(formula, bound_vars)));
			memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(formula, bound_vars));
			return memoization_state.caching_results(results);
		    }
		}
	    }
	}
    }

    public static SubLObject pph_formula_free_variables(final SubLObject formula, SubLObject bound_vars) {
	if (bound_vars == UNPROVIDED) {
	    bound_vars = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
	SubLObject caching_state = NIL;
	if (NIL == v_memoization_state) {
	    return pph_formula_free_variables_internal(formula, bound_vars);
	}
	caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_FORMULA_FREE_VARIABLES, UNPROVIDED);
	if (NIL == caching_state) {
	    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_FORMULA_FREE_VARIABLES, TWO_INTEGER, $int$98, EQUAL, UNPROVIDED);
	    memoization_state.memoization_state_put(v_memoization_state, PPH_FORMULA_FREE_VARIABLES, caching_state);
	}
	final SubLObject sxhash = memoization_state.sxhash_calc_2(formula, bound_vars);
	final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
	if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
	    SubLObject cdolist_list_var = collisions;
	    SubLObject collision = NIL;
	    collision = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		SubLObject cached_args = collision.first();
		final SubLObject results2 = second(collision);
		if (formula.equal(cached_args.first())) {
		    cached_args = cached_args.rest();
		    if (((NIL != cached_args) && (NIL == cached_args.rest())) && bound_vars.equal(cached_args.first())) {
			return memoization_state.caching_results(results2);
		    }
		}
		cdolist_list_var = cdolist_list_var.rest();
		collision = cdolist_list_var.first();
	    }
	}
	final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_formula_free_variables_internal(formula, bound_vars)));
	memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(formula, bound_vars));
	return memoization_state.caching_results(results3);
    }

    public static final SubLObject pph_var_scoped_or_quotedP_alt(SubLObject var, SubLObject formula) {
	if (NIL != pph_utilities.pph_formula_with_dotsP(formula)) {
	    return NIL;
	}
	{
	    SubLObject freeP = NIL;
	    if (NIL == freeP) {
		{
		    SubLObject csome_list_var = cycl_utilities.arg_positions_bfs(var, formula, symbol_function(EQL));
		    SubLObject tree_position = NIL;
		    for (tree_position = csome_list_var.first(); !((NIL != freeP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), tree_position = csome_list_var.first()) {
			freeP = makeBoolean(NIL == pph_arg_scoped_or_quotedP(tree_position, formula));
		    }
		}
	    }
	    return makeBoolean(NIL == freeP);
	}
    }

    public static SubLObject pph_var_scoped_or_quotedP(final SubLObject var, final SubLObject formula) {
	if (NIL != pph_utilities.pph_formula_with_dotsP(formula)) {
	    return NIL;
	}
	SubLObject freeP = NIL;
	if (NIL == freeP) {
	    SubLObject csome_list_var;
	    SubLObject tree_position;
	    for (csome_list_var = cycl_utilities.arg_positions_bfs(var, formula, symbol_function(EQL)), tree_position = NIL, tree_position = csome_list_var.first(); (NIL == freeP)
		    && (NIL != csome_list_var); freeP = makeBoolean(NIL == pph_arg_scoped_or_quotedP(tree_position, formula)), csome_list_var = csome_list_var.rest(), tree_position = csome_list_var.first()) {
	    }
	}
	return makeBoolean(NIL == freeP);
    }

    public static final SubLObject pph_arg_scoped_or_quotedP_alt(SubLObject arg_position, SubLObject formula) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject operator = cycl_utilities.formula_arg0(formula);
		SubLObject arg_num = arg_position.first();
		if (NIL != pph_operator_arg_scopedP(operator, arg_num, pph_vars.$pph_domain_mt$.getDynamicValue(thread))) {
		    return T;
		} else {
		    if ((NIL != list_utilities.singletonP(arg_position)) && ((NIL != pph_operator_arg_quotedP(operator, arg_num)) || (arg_position.equal($list_alt67) && (NIL != formula_pattern_match.formula_matches_pattern(formula, $list_alt68))))) {
			return T;
		    } else {
			if (NIL != list_utilities.lengthG(arg_position, ONE_INTEGER, UNPROVIDED)) {
			    {
				SubLObject sub_formula = cycl_utilities.formula_arg(formula, arg_num, UNPROVIDED);
				return pph_arg_scopedP(arg_position.rest(), sub_formula);
			    }
			}
		    }
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject pph_arg_scoped_or_quotedP(final SubLObject arg_position, final SubLObject formula) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject operator = cycl_utilities.formula_arg0(formula);
	final SubLObject arg_num = arg_position.first();
	if (NIL != pph_operator_arg_scopedP(operator, arg_num, pph_vars.$pph_domain_mt$.getDynamicValue(thread))) {
	    return T;
	}
	if ((NIL != list_utilities.singletonP(arg_position)) && ((NIL != pph_operator_arg_quotedP(operator, arg_num)) || (arg_position.equal($list72) && (NIL != formula_pattern_match.formula_matches_pattern(formula, $list73))))) {
	    return T;
	}
	if (NIL != list_utilities.lengthG(arg_position, ONE_INTEGER, UNPROVIDED)) {
	    final SubLObject sub_formula = cycl_utilities.formula_arg(formula, arg_num, UNPROVIDED);
	    return pph_arg_scopedP(arg_position.rest(), sub_formula);
	}
	return NIL;
    }

    public static final SubLObject pph_quoted_collectionP_alt(SubLObject v_object) {
	return makeBoolean((NIL != indexed_term_p(v_object)) && (NIL != pph_utilities.pph_removal_ask_boolean(list($$quotedCollection, v_object), UNPROVIDED)));
    }

    public static SubLObject pph_quoted_collectionP(final SubLObject v_object) {
	return makeBoolean((NIL != indexed_term_p(v_object)) && (NIL != pph_utilities.pph_removal_ask_boolean(list($$quotedCollection, v_object), UNPROVIDED)));
    }

    public static final SubLObject pph_arg_scopedP_alt(SubLObject arg_position, SubLObject formula) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject operator = cycl_utilities.formula_arg0(formula);
		SubLObject arg_num = arg_position.first();
		if (NIL != pph_operator_arg_scopedP(operator, arg_num, pph_vars.$pph_domain_mt$.getDynamicValue(thread))) {
		    return T;
		} else {
		    if (NIL != list_utilities.lengthG(arg_position, ONE_INTEGER, UNPROVIDED)) {
			{
			    SubLObject sub_formula = cycl_utilities.formula_arg(formula, arg_num, UNPROVIDED);
			    return pph_arg_scopedP(arg_position.rest(), sub_formula);
			}
		    }
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject pph_arg_scopedP(final SubLObject arg_position, final SubLObject formula) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject operator = cycl_utilities.formula_arg0(formula);
	final SubLObject arg_num = arg_position.first();
	if (NIL != pph_operator_arg_scopedP(operator, arg_num, pph_vars.$pph_domain_mt$.getDynamicValue(thread))) {
	    return T;
	}
	if (NIL != list_utilities.lengthG(arg_position, ONE_INTEGER, UNPROVIDED)) {
	    final SubLObject sub_formula = cycl_utilities.formula_arg(formula, arg_num, UNPROVIDED);
	    return pph_arg_scopedP(arg_position.rest(), sub_formula);
	}
	return NIL;
    }

    public static final SubLObject pph_operator_arg_scopedP_internal_alt(SubLObject operator, SubLObject arg_num, SubLObject mt) {
	return makeBoolean((NIL != indexed_term_p(operator)) && (NIL != member(arg_num, kb_accessors.scoping_args(operator, mt), symbol_function(EQL), UNPROVIDED)));
    }

    public static SubLObject pph_operator_arg_scopedP_internal(final SubLObject operator, final SubLObject arg_num, final SubLObject mt) {
	return makeBoolean((NIL != indexed_term_p(operator)) && (NIL != member(arg_num, kb_accessors.scoping_args(operator, mt), symbol_function(EQL), UNPROVIDED)));
    }

    public static final SubLObject pph_operator_arg_scopedP_alt(SubLObject operator, SubLObject arg_num, SubLObject mt) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
		    return pph_operator_arg_scopedP_internal(operator, arg_num, mt);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym70$PPH_OPERATOR_ARG_SCOPED_, UNPROVIDED);
		if (NIL == caching_state) {
		    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym70$PPH_OPERATOR_ARG_SCOPED_, THREE_INTEGER, $int$200, EQL, UNPROVIDED);
		    memoization_state.memoization_state_put(v_memoization_state, $sym70$PPH_OPERATOR_ARG_SCOPED_, caching_state);
		}
		{
		    SubLObject sxhash = memoization_state.sxhash_calc_3(operator, arg_num, mt);
		    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		    if (collisions != $kw56$_MEMOIZED_ITEM_NOT_FOUND_) {
			{
			    SubLObject cdolist_list_var = collisions;
			    SubLObject collision = NIL;
			    for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
				{
				    SubLObject cached_args = collision.first();
				    SubLObject results2 = second(collision);
				    if (operator.eql(cached_args.first())) {
					cached_args = cached_args.rest();
					if (arg_num.eql(cached_args.first())) {
					    cached_args = cached_args.rest();
					    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
						return memoization_state.caching_results(results2);
					    }
					}
				    }
				}
			    }
			}
		    }
		    {
			SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(pph_operator_arg_scopedP_internal(operator, arg_num, mt)));
			memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(operator, arg_num, mt));
			return memoization_state.caching_results(results);
		    }
		}
	    }
	}
    }

    public static SubLObject pph_operator_arg_scopedP(final SubLObject operator, final SubLObject arg_num, final SubLObject mt) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
	SubLObject caching_state = NIL;
	if (NIL == v_memoization_state) {
	    return pph_operator_arg_scopedP_internal(operator, arg_num, mt);
	}
	caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym75$PPH_OPERATOR_ARG_SCOPED_, UNPROVIDED);
	if (NIL == caching_state) {
	    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym75$PPH_OPERATOR_ARG_SCOPED_, THREE_INTEGER, $int$200, EQL, UNPROVIDED);
	    memoization_state.memoization_state_put(v_memoization_state, $sym75$PPH_OPERATOR_ARG_SCOPED_, caching_state);
	}
	final SubLObject sxhash = memoization_state.sxhash_calc_3(operator, arg_num, mt);
	final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
	if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
	    SubLObject cdolist_list_var = collisions;
	    SubLObject collision = NIL;
	    collision = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		SubLObject cached_args = collision.first();
		final SubLObject results2 = second(collision);
		if (operator.eql(cached_args.first())) {
		    cached_args = cached_args.rest();
		    if (arg_num.eql(cached_args.first())) {
			cached_args = cached_args.rest();
			if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
			    return memoization_state.caching_results(results2);
			}
		    }
		}
		cdolist_list_var = cdolist_list_var.rest();
		collision = cdolist_list_var.first();
	    }
	}
	final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_operator_arg_scopedP_internal(operator, arg_num, mt)));
	memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(operator, arg_num, mt));
	return memoization_state.caching_results(results3);
    }

    public static final SubLObject pph_operator_arg_quotedP_internal_alt(SubLObject operator, SubLObject arg_num) {
	return makeBoolean((NIL != indexed_term_p(operator)) && (NIL != kb_accessors.quoted_argumentP(operator, arg_num)));
    }

    public static SubLObject pph_operator_arg_quotedP_internal(final SubLObject operator, final SubLObject arg_num) {
	return makeBoolean((NIL != indexed_term_p(operator)) && (NIL != kb_accessors.quoted_argumentP(operator, arg_num)));
    }

    public static final SubLObject pph_operator_arg_quotedP_alt(SubLObject operator, SubLObject arg_num) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
		    return pph_operator_arg_quotedP_internal(operator, arg_num);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym72$PPH_OPERATOR_ARG_QUOTED_, UNPROVIDED);
		if (NIL == caching_state) {
		    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym72$PPH_OPERATOR_ARG_QUOTED_, TWO_INTEGER, $int$200, EQL, UNPROVIDED);
		    memoization_state.memoization_state_put(v_memoization_state, $sym72$PPH_OPERATOR_ARG_QUOTED_, caching_state);
		}
		{
		    SubLObject sxhash = memoization_state.sxhash_calc_2(operator, arg_num);
		    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		    if (collisions != $kw56$_MEMOIZED_ITEM_NOT_FOUND_) {
			{
			    SubLObject cdolist_list_var = collisions;
			    SubLObject collision = NIL;
			    for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
				{
				    SubLObject cached_args = collision.first();
				    SubLObject results2 = second(collision);
				    if (operator.eql(cached_args.first())) {
					cached_args = cached_args.rest();
					if (((NIL != cached_args) && (NIL == cached_args.rest())) && arg_num.eql(cached_args.first())) {
					    return memoization_state.caching_results(results2);
					}
				    }
				}
			    }
			}
		    }
		    {
			SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(pph_operator_arg_quotedP_internal(operator, arg_num)));
			memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(operator, arg_num));
			return memoization_state.caching_results(results);
		    }
		}
	    }
	}
    }

    public static SubLObject pph_operator_arg_quotedP(final SubLObject operator, final SubLObject arg_num) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
	SubLObject caching_state = NIL;
	if (NIL == v_memoization_state) {
	    return pph_operator_arg_quotedP_internal(operator, arg_num);
	}
	caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym77$PPH_OPERATOR_ARG_QUOTED_, UNPROVIDED);
	if (NIL == caching_state) {
	    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym77$PPH_OPERATOR_ARG_QUOTED_, TWO_INTEGER, $int$200, EQL, UNPROVIDED);
	    memoization_state.memoization_state_put(v_memoization_state, $sym77$PPH_OPERATOR_ARG_QUOTED_, caching_state);
	}
	final SubLObject sxhash = memoization_state.sxhash_calc_2(operator, arg_num);
	final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
	if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
	    SubLObject cdolist_list_var = collisions;
	    SubLObject collision = NIL;
	    collision = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		SubLObject cached_args = collision.first();
		final SubLObject results2 = second(collision);
		if (operator.eql(cached_args.first())) {
		    cached_args = cached_args.rest();
		    if (((NIL != cached_args) && (NIL == cached_args.rest())) && arg_num.eql(cached_args.first())) {
			return memoization_state.caching_results(results2);
		    }
		}
		cdolist_list_var = cdolist_list_var.rest();
		collision = cdolist_list_var.first();
	    }
	}
	final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_operator_arg_quotedP_internal(operator, arg_num)));
	memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(operator, arg_num));
	return memoization_state.caching_results(results3);
    }

    /**
     * All the #$isa constraints on VAR in FORMULA
     *
     * @param USE-VAR-TYPING-CLAUSES?
     * 		booleanp; Should we use explicit #$isa/#$genls, etc.
     * 		clauses from FORMULA?
     * @param DIRECTLY?
     * 		booleanp; Should we use them directly, as opposed to using their genls?
     */
    @LispMethod(comment = "All the #$isa constraints on VAR in FORMULA\r\n\r\n@param USE-VAR-TYPING-CLAUSES?\r\n\t\tbooleanp; Should we use explicit #$isa/#$genls, etc.\r\n\t\tclauses from FORMULA?\r\n@param DIRECTLY?\r\n\t\tbooleanp; Should we use them directly, as opposed to using their genls?")
    public static final SubLObject pph_variable_isa_constraints_alt(SubLObject var, SubLObject formula, SubLObject mt, SubLObject use_var_typing_clausesP, SubLObject directlyP, SubLObject validity_test) {
	if (mt == UNPROVIDED) {
	    mt = mt_relevance_macros.$mt$.getDynamicValue();
	}
	if (use_var_typing_clausesP == UNPROVIDED) {
	    use_var_typing_clausesP = T;
	}
	if (directlyP == UNPROVIDED) {
	    directlyP = NIL;
	}
	if (validity_test == UNPROVIDED) {
	    validity_test = $sym73$PPH_VALID_VAR_TYPE_;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject ans = NIL;
		SubLObject stripped = pph_strip_existentials(formula, T);
		SubLObject clausal_form = (NIL != el_disjunction_p(stripped)) ? ((SubLObject) ($DNF)) : $CNF;
		thread.resetMultipleValues();
		{
		    SubLObject v_clauses = pph_clausal_form(stripped, mt, clausal_form);
		    SubLObject new_mt = thread.secondMultipleValue();
		    thread.resetMultipleValues();
		    if (v_clauses.isList()) {
			if (!((clausal_form == $DNF) && (NIL != list_utilities.lengthG(v_clauses, ONE_INTEGER, UNPROVIDED)))) {
			    {
				SubLObject cdolist_list_var = v_clauses;
				SubLObject clause = NIL;
				for (clause = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), clause = cdolist_list_var.first()) {
				    {
					SubLObject datum = clause;
					SubLObject current = datum;
					SubLObject neg_lits = NIL;
					SubLObject pos_lits = NIL;
					destructuring_bind_must_consp(current, datum, $list_alt76);
					neg_lits = current.first();
					current = current.rest();
					destructuring_bind_must_consp(current, datum, $list_alt76);
					pos_lits = current.first();
					current = current.rest();
					if (NIL == current) {
					    {
						SubLObject lits_to_use = (NIL != neg_lits) ? ((SubLObject) (neg_lits)) : pos_lits;
						SubLObject cdolist_list_var_3 = lits_to_use;
						SubLObject exp = NIL;
						for (exp = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest(), exp = cdolist_list_var_3.first()) {
						    if (NIL != cycl_utilities.expression_find(var, exp, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
							ans = append(ans, pph_variable_isa_constraints_in_lit(var, exp, lits_to_use, new_mt, use_var_typing_clausesP, directlyP, validity_test));
						    }
						}
					    }
					} else {
					    cdestructuring_bind_error(datum, $list_alt76);
					}
				    }
				}
			    }
			}
		    }
		}
		ans = list_utilities.delete_if_not(validity_test, delete($$CycLVariable, ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		if (NIL != find_if($sym78$SPECS_FN_NAT_, ans, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
		    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
			format(T, $str_alt79$Removing_non_SpecsFn_terms_from__, ans);
		    }
		    ans = list_utilities.remove_if_not($sym78$SPECS_FN_NAT_, ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		return Sort.sort(pph_delete_genls(ans), $sym80$PPH_GENERALITY_ESTIMATE_, UNPROVIDED);
	    }
	}
    }

    @LispMethod(comment = "All the #$isa constraints on VAR in FORMULA\r\n\r\n@param USE-VAR-TYPING-CLAUSES?\r\n\t\tbooleanp; Should we use explicit #$isa/#$genls, etc.\r\n\t\tclauses from FORMULA?\r\n@param DIRECTLY?\r\n\t\tbooleanp; Should we use them directly, as opposed to using their genls?")
    public static SubLObject pph_variable_isa_constraints(final SubLObject var, final SubLObject formula, SubLObject mt, SubLObject use_var_typing_clausesP, SubLObject directlyP, SubLObject validity_test) {
	if (mt == UNPROVIDED) {
	    mt = mt_relevance_macros.$mt$.getDynamicValue();
	}
	if (use_var_typing_clausesP == UNPROVIDED) {
	    use_var_typing_clausesP = T;
	}
	if (directlyP == UNPROVIDED) {
	    directlyP = NIL;
	}
	if (validity_test == UNPROVIDED) {
	    validity_test = $sym78$PPH_VALID_VAR_TYPE_;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject ans = NIL;
	final SubLObject var_types = set.new_set(symbol_function(EQUAL), UNPROVIDED);
	final SubLObject stripped = pph_strip_existentials(formula, T);
	final SubLObject clausal_form = ((NIL != el_universal_p(stripped)) || (NIL != el_implication_p(stripped))) ? $CNF : $DNF;
	thread.resetMultipleValues();
	final SubLObject v_clauses = pph_clausal_form(stripped, mt, clausal_form);
	final SubLObject new_mt = thread.secondMultipleValue();
	thread.resetMultipleValues();
	if (v_clauses.isList()) {
	    SubLObject list_var = NIL;
	    SubLObject clause = NIL;
	    SubLObject clause_num = NIL;
	    list_var = v_clauses;
	    clause = list_var.first();
	    for (clause_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), clause = list_var.first(), clause_num = add(ONE_INTEGER, clause_num)) {
		SubLObject current;
		final SubLObject datum = current = clause;
		SubLObject neg_lits = NIL;
		SubLObject pos_lits = NIL;
		destructuring_bind_must_consp(current, datum, $list81);
		neg_lits = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list81);
		pos_lits = current.first();
		current = current.rest();
		if (NIL == current) {
		    final SubLObject lits_to_use = (NIL != neg_lits) ? neg_lits : pos_lits;
		    SubLObject this_clause_constraints = NIL;
		    SubLObject cdolist_list_var = lits_to_use;
		    SubLObject exp = NIL;
		    exp = cdolist_list_var.first();
		    while (NIL != cdolist_list_var) {
			if (NIL != cycl_utilities.expression_find(var, exp, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
			    thread.resetMultipleValues();
			    final SubLObject more_ans = pph_variable_isa_constraints_in_lit(var, exp, lits_to_use, new_mt, use_var_typing_clausesP, validity_test);
			    final SubLObject more_var_types = thread.secondMultipleValue();
			    thread.resetMultipleValues();
			    this_clause_constraints = append(this_clause_constraints, more_ans, more_var_types);
			    set_utilities.set_add_all(more_var_types, var_types);
			}
			cdolist_list_var = cdolist_list_var.rest();
			exp = cdolist_list_var.first();
		    }
		    if (clause_num.eql(ZERO_INTEGER) || (clausal_form == $CNF)) {
			ans = append(ans, this_clause_constraints);
		    } else {
			ans = pph_utilities.pph_min_ceiling_cols(pph_delete_genls(append(ans, this_clause_constraints)), NIL, mt, UNPROVIDED);
		    }
		} else {
		    cdestructuring_bind_error(datum, $list81);
		}
	    }
	}
	ans = list_utilities.delete_if_not(validity_test, delete($$CycLVariable, ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	if (NIL != find_if($sym83$SPECS_FN_NAT_, ans, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
	    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
		format_nil.force_format(T, $str84$Removing_non_SpecsFn_terms_from__, ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    }
	    ans = list_utilities.remove_if_not($sym83$SPECS_FN_NAT_, ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}
	if ((NIL == directlyP) && (NIL == set.set_emptyP(var_types))) {
	    ans = pph_replace_direct_var_types(var_types, ans, mt);
	}
	return Sort.sort(pph_delete_genls(ans), $sym85$PPH_GENERALITY_ESTIMATE_, UNPROVIDED);
    }

    /**
    * All the #$isa constraints on VAR in FORMULA
    *
    * @param USE-VAR-TYPING-CLAUSES?
    * 		booleanp; Should we use explicit #$isa/#$genls, etc.
    * 		clauses from FORMULA?
    * @param DIRECTLY?
    * 		booleanp; Should we use them directly, as opposed to using their genls?
    */

    public static SubLObject pph_replace_direct_var_types(final SubLObject var_types, SubLObject ans, final SubLObject mt) {
	for (SubLObject var_types_okP = NIL, v_iteration = ZERO_INTEGER, max_iterations = TEN_INTEGER; (NIL == var_types_okP) && (!v_iteration.numGE(max_iterations)); var_types_okP = T) {
	    v_iteration = add(v_iteration, ONE_INTEGER);
	    SubLObject to_remove = NIL;
	    SubLObject cdolist_list_var = ans;
	    SubLObject type = NIL;
	    type = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		if (NIL != set.set_memberP(type, var_types)) {
		    to_remove = cons(type, to_remove);
		}
		cdolist_list_var = cdolist_list_var.rest();
		type = cdolist_list_var.first();
	    }
	    if (NIL == list_utilities.empty_list_p(to_remove)) {
		cdolist_list_var = to_remove;
		type = NIL;
		type = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
		    ans = delete(type, ans, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		    ans = append(ans, pph_genls(type, mt));
		    cdolist_list_var = cdolist_list_var.rest();
		    type = cdolist_list_var.first();
		}
	    }
	}
	return ans;
    }

    public static final SubLObject pph_clausal_form_internal_alt(SubLObject expression, SubLObject mt, SubLObject dnf_or_cnf) {
	return clausifier.clausal_form(expression, mt, dnf_or_cnf);
    }

    public static SubLObject pph_clausal_form_internal(final SubLObject expression, final SubLObject mt, final SubLObject dnf_or_cnf) {
	return clausifier.clausal_form(expression, mt, dnf_or_cnf);
    }

    public static final SubLObject pph_clausal_form_alt(SubLObject expression, SubLObject mt, SubLObject dnf_or_cnf) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
		    return pph_clausal_form_internal(expression, mt, dnf_or_cnf);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_CLAUSAL_FORM, UNPROVIDED);
		if (NIL == caching_state) {
		    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_CLAUSAL_FORM, THREE_INTEGER, $int$32, EQUAL, UNPROVIDED);
		    memoization_state.memoization_state_put(v_memoization_state, PPH_CLAUSAL_FORM, caching_state);
		}
		{
		    SubLObject sxhash = memoization_state.sxhash_calc_3(expression, mt, dnf_or_cnf);
		    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		    if (collisions != $kw56$_MEMOIZED_ITEM_NOT_FOUND_) {
			{
			    SubLObject cdolist_list_var = collisions;
			    SubLObject collision = NIL;
			    for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
				{
				    SubLObject cached_args = collision.first();
				    SubLObject results2 = second(collision);
				    if (expression.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (mt.equal(cached_args.first())) {
					    cached_args = cached_args.rest();
					    if (((NIL != cached_args) && (NIL == cached_args.rest())) && dnf_or_cnf.equal(cached_args.first())) {
						return memoization_state.caching_results(results2);
					    }
					}
				    }
				}
			    }
			}
		    }
		    {
			SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(pph_clausal_form_internal(expression, mt, dnf_or_cnf)));
			memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(expression, mt, dnf_or_cnf));
			return memoization_state.caching_results(results);
		    }
		}
	    }
	}
    }

    public static SubLObject pph_clausal_form(final SubLObject expression, final SubLObject mt, final SubLObject dnf_or_cnf) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
	SubLObject caching_state = NIL;
	if (NIL == v_memoization_state) {
	    return pph_clausal_form_internal(expression, mt, dnf_or_cnf);
	}
	caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_CLAUSAL_FORM, UNPROVIDED);
	if (NIL == caching_state) {
	    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_CLAUSAL_FORM, THREE_INTEGER, $int$32, EQUAL, UNPROVIDED);
	    memoization_state.memoization_state_put(v_memoization_state, PPH_CLAUSAL_FORM, caching_state);
	}
	final SubLObject sxhash = memoization_state.sxhash_calc_3(expression, mt, dnf_or_cnf);
	final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
	if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
	    SubLObject cdolist_list_var = collisions;
	    SubLObject collision = NIL;
	    collision = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		SubLObject cached_args = collision.first();
		final SubLObject results2 = second(collision);
		if (expression.equal(cached_args.first())) {
		    cached_args = cached_args.rest();
		    if (mt.equal(cached_args.first())) {
			cached_args = cached_args.rest();
			if (((NIL != cached_args) && (NIL == cached_args.rest())) && dnf_or_cnf.equal(cached_args.first())) {
			    return memoization_state.caching_results(results2);
			}
		    }
		}
		cdolist_list_var = cdolist_list_var.rest();
		collision = cdolist_list_var.first();
	    }
	}
	final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_clausal_form_internal(expression, mt, dnf_or_cnf)));
	memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(expression, mt, dnf_or_cnf));
	return memoization_state.caching_results(results3);
    }

    /**
     *
     *
     * @param USE-VAR-TYPING-CLAUSES?
     * 		booleanp; Should we use explicit #$isa/#$genls, etc.
     * 		clauses from FORMULA?
     * @param DIRECTLY?
     * 		booleanp; Should we use them directly, as opposed to using their genls?
     */
    @LispMethod(comment = "@param USE-VAR-TYPING-CLAUSES?\r\n\t\tbooleanp; Should we use explicit #$isa/#$genls, etc.\r\n\t\tclauses from FORMULA?\r\n@param DIRECTLY?\r\n\t\tbooleanp; Should we use them directly, as opposed to using their genls?")
    public static final SubLObject pph_variable_isa_constraints_in_lit_internal(SubLObject var, SubLObject exp, SubLObject lits, SubLObject mt, SubLObject use_var_typing_clausesP, SubLObject directlyP, SubLObject validity_test) {
	if (use_var_typing_clausesP == UNPROVIDED) {
	    use_var_typing_clausesP = T;
	}
	if (directlyP == UNPROVIDED) {
	    directlyP = NIL;
	}
	if (validity_test == UNPROVIDED) {
	    validity_test = $sym73$PPH_VALID_VAR_TYPE_;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject ans = NIL;
		SubLObject op = cycl_utilities.formula_operator(exp);
		SubLObject pos = cycl_utilities.formula_arg_positions(exp, var, symbol_function(EQL)).first();
		if ((NIL != forts.fort_p(op)) && pos.isInteger()) {
		    ans = append(kb_accessors.argn_isa(op, pos, mt), ans);
		    {
			SubLObject cdolist_list_var = kb_accessors.argn_genl(op, pos, mt);
			SubLObject genl = NIL;
			for (genl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), genl = cdolist_list_var.first()) {
			    {
				SubLObject item_var = pph_utilities.pph_make_type_level(genl);
				if (NIL == member(item_var, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
				    ans = cons(item_var, ans);
				}
			    }
			}
		    }
		}
		if (NIL != pph_utilities.pph_isaP(op, $$FamilyRelationSlot, UNPROVIDED)) {
		    ans = cons($$Agent_Generic, ans);
		}
		if (NIL != pph_types.pph_rmp_sentenceP(exp)) {
		    {
			SubLObject rbp_constraints = NIL;
			SubLObject local_state = pph_macros.find_or_create_pph_external_memoization_state();
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
						    Errors.error($str_alt54$Invalid_attempt_to_reuse_memoizat);
						}
					    }
					}
				    }
				    try {
					rbp_constraints = rbp_wff.rbp_formula_variable_isa_constraints(exp, var);
				    } finally {
					{
					    SubLObject _prev_bind_0_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
					    try {
						$is_thread_performing_cleanupP$.bind(T, thread);
						if ((NIL != local_state) && (NIL == original_memoization_process)) {
						    memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
						}
					    } finally {
						$is_thread_performing_cleanupP$.rebind(_prev_bind_0_4, thread);
					    }
					}
				    }
				}
			    } finally {
				memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
			    }
			}
			{
			    SubLObject cdolist_list_var = rbp_constraints;
			    SubLObject raw_constraint = NIL;
			    for (raw_constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), raw_constraint = cdolist_list_var.first()) {
				{
				    SubLObject datum = raw_constraint;
				    SubLObject current = datum;
				    SubLObject type = NIL;
				    SubLObject target = NIL;
				    SubLObject constraint_mt = NIL;
				    destructuring_bind_must_consp(current, datum, $list_alt86);
				    type = current.first();
				    current = current.rest();
				    destructuring_bind_must_consp(current, datum, $list_alt86);
				    target = current.first();
				    current = current.rest();
				    destructuring_bind_must_consp(current, datum, $list_alt86);
				    constraint_mt = current.first();
				    current = current.rest();
				    if (NIL == current) {
					{
					    SubLObject pcase_var = type;
					    if (pcase_var.eql($ISA)) {
						{
						    SubLObject item_var = target;
						    if (NIL == member(item_var, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
							ans = cons(item_var, ans);
						    }
						}
					    } else {
						if (pcase_var.eql($GENL) || pcase_var.eql($NOT_DISJOINT)) {
						    {
							SubLObject item_var = pph_utilities.pph_make_type_level(target);
							if (NIL == member(item_var, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
							    ans = cons(item_var, ans);
							}
						    }
						}
					    }
					}
				    } else {
					cdestructuring_bind_error(datum, $list_alt86);
				    }
				}
			    }
			}
		    }
		}
		if ((NIL != use_var_typing_clausesP) && (NIL != pph_utilities.pph_var_typing_clauseP(exp, var, validity_test))) {
		    {
			SubLObject base_type = pph_utilities.pph_var_type_from_asent(exp);
			ans = cconcatenate(ans, pph_isa_constraints_from_type(base_type, exp, lits, directlyP, mt));
		    }
		}
		ans = append(ans, pph_variable_isa_constraints_in_subexpressions(var, exp, lits, mt, use_var_typing_clausesP, directlyP));
		return Sort.sort(pph_delete_genls(ans), $sym80$PPH_GENERALITY_ESTIMATE_, UNPROVIDED);
	    }
	}
    }

    public static SubLObject pph_variable_isa_constraints_in_lit_internal(final SubLObject var, final SubLObject exp, final SubLObject lits, final SubLObject mt, SubLObject use_var_typing_clausesP, SubLObject validity_test) {
	if (use_var_typing_clausesP == UNPROVIDED) {
	    use_var_typing_clausesP = T;
	}
	if (validity_test == UNPROVIDED) {
	    validity_test = $sym78$PPH_VALID_VAR_TYPE_;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject ans = NIL;
	SubLObject from_var_typing_clauses = NIL;
	final SubLObject op = cycl_utilities.formula_operator(exp);
	final SubLObject pos = cycl_utilities.formula_arg_positions(exp, var, symbol_function(EQL)).first();
	if ((NIL != forts.fort_p(op)) && pos.isInteger()) {
	    ans = append(kb_accessors.argn_isa(op, pos, mt), ans);
	    SubLObject cdolist_list_var = kb_accessors.argn_genl(op, pos, mt);
	    SubLObject genl = NIL;
	    genl = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		final SubLObject item_var = pph_utilities.pph_make_type_level(genl);
		if (NIL == member(item_var, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
		    ans = cons(item_var, ans);
		}
		cdolist_list_var = cdolist_list_var.rest();
		genl = cdolist_list_var.first();
	    }
	}
	if (NIL != pph_utilities.pph_isaP(op, $$FamilyRelationSlot, UNPROVIDED)) {
	    ans = cons($$Agent_Generic, ans);
	}
	if (NIL != pph_types.pph_rmp_sentenceP(exp)) {
	    SubLObject rbp_constraints = NIL;
	    final SubLObject local_state = pph_macros.find_or_create_pph_external_memoization_state();
	    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
	    try {
		memoization_state.$memoization_state$.bind(local_state, thread);
		final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
		try {
		    rbp_constraints = rbp_wff.rbp_formula_variable_isa_constraints(exp, var);
		} finally {
		    final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
		    try {
			$is_thread_performing_cleanupP$.bind(T, thread);
			final SubLObject _values = getValuesAsVector();
			memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
			restoreValuesFromVector(_values);
		    } finally {
			$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
		    }
		}
	    } finally {
		memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
	    }
	    SubLObject cdolist_list_var2 = rbp_constraints;
	    SubLObject raw_constraint = NIL;
	    raw_constraint = cdolist_list_var2.first();
	    while (NIL != cdolist_list_var2) {
		SubLObject current;
		final SubLObject datum = current = raw_constraint;
		SubLObject type = NIL;
		SubLObject target = NIL;
		SubLObject constraint_mt = NIL;
		destructuring_bind_must_consp(current, datum, $list91);
		type = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list91);
		target = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list91);
		constraint_mt = current.first();
		current = current.rest();
		if (NIL == current) {
		    final SubLObject pcase_var = type;
		    if (pcase_var.eql($ISA)) {
			final SubLObject item_var2 = target;
			if (NIL == member(item_var2, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
			    ans = cons(item_var2, ans);
			}
		    } else if (pcase_var.eql($GENL) || pcase_var.eql($NOT_DISJOINT)) {
			final SubLObject item_var2 = pph_utilities.pph_make_type_level(target);
			if (NIL == member(item_var2, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
			    ans = cons(item_var2, ans);
			}
		    }

		} else {
		    cdestructuring_bind_error(datum, $list91);
		}
		cdolist_list_var2 = cdolist_list_var2.rest();
		raw_constraint = cdolist_list_var2.first();
	    }
	}
	if ((NIL != use_var_typing_clausesP) && (NIL != pph_utilities.pph_var_typing_clauseP(exp, var, validity_test))) {
	    from_var_typing_clauses = cons(pph_utilities.pph_var_type_from_asent(exp), from_var_typing_clauses);
	}
	thread.resetMultipleValues();
	final SubLObject more_ans = pph_variable_isa_constraints_in_subexpressions(var, exp, lits, mt, use_var_typing_clausesP);
	final SubLObject more_var_types = thread.secondMultipleValue();
	thread.resetMultipleValues();
	ans = cconcatenate(ans, more_ans);
	from_var_typing_clauses = cconcatenate(from_var_typing_clauses, more_var_types);
	return values(Sort.sort(pph_delete_genls(ans), $sym85$PPH_GENERALITY_ESTIMATE_, UNPROVIDED), Sort.sort(pph_delete_genls(from_var_typing_clauses), $sym85$PPH_GENERALITY_ESTIMATE_, UNPROVIDED));
    }

    public static final SubLObject pph_variable_isa_constraints_in_lit(SubLObject var, SubLObject exp, SubLObject lits, SubLObject mt, SubLObject use_var_typing_clausesP, SubLObject directlyP, SubLObject validity_test) {
	if (use_var_typing_clausesP == UNPROVIDED) {
	    use_var_typing_clausesP = T;
	}
	if (directlyP == UNPROVIDED) {
	    directlyP = NIL;
	}
	if (validity_test == UNPROVIDED) {
	    validity_test = $sym73$PPH_VALID_VAR_TYPE_;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
		    return pph_variable_isa_constraints_in_lit_internal(var, exp, lits, mt, use_var_typing_clausesP, directlyP, validity_test);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_VARIABLE_ISA_CONSTRAINTS_IN_LIT, UNPROVIDED);
		if (NIL == caching_state) {
		    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_VARIABLE_ISA_CONSTRAINTS_IN_LIT, SEVEN_INTEGER, $int$100, EQUAL, UNPROVIDED);
		    memoization_state.memoization_state_put(v_memoization_state, PPH_VARIABLE_ISA_CONSTRAINTS_IN_LIT, caching_state);
		}
		{
		    SubLObject sxhash = memoization_state.sxhash_calc_7(var, exp, lits, mt, use_var_typing_clausesP, directlyP, validity_test);
		    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		    if (collisions != $kw56$_MEMOIZED_ITEM_NOT_FOUND_) {
			{
			    SubLObject cdolist_list_var = collisions;
			    SubLObject collision = NIL;
			    for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
				{
				    SubLObject cached_args = collision.first();
				    SubLObject results2 = second(collision);
				    if (var.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (exp.equal(cached_args.first())) {
					    cached_args = cached_args.rest();
					    if (lits.equal(cached_args.first())) {
						cached_args = cached_args.rest();
						if (mt.equal(cached_args.first())) {
						    cached_args = cached_args.rest();
						    if (use_var_typing_clausesP.equal(cached_args.first())) {
							cached_args = cached_args.rest();
							if (directlyP.equal(cached_args.first())) {
							    cached_args = cached_args.rest();
							    if (((NIL != cached_args) && (NIL == cached_args.rest())) && validity_test.equal(cached_args.first())) {
								return memoization_state.caching_results(results2);
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
		    {
			SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(pph_variable_isa_constraints_in_lit_internal(var, exp, lits, mt, use_var_typing_clausesP, directlyP, validity_test)));
			memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(var, exp, lits, mt, use_var_typing_clausesP, directlyP, validity_test));
			return memoization_state.caching_results(results);
		    }
		}
	    }
	}
    }

    public static SubLObject pph_variable_isa_constraints_in_lit(final SubLObject var, final SubLObject exp, final SubLObject lits, final SubLObject mt, SubLObject use_var_typing_clausesP, SubLObject validity_test) {
	if (use_var_typing_clausesP == UNPROVIDED) {
	    use_var_typing_clausesP = T;
	}
	if (validity_test == UNPROVIDED) {
	    validity_test = $sym78$PPH_VALID_VAR_TYPE_;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
	SubLObject caching_state = NIL;
	if (NIL == v_memoization_state) {
	    return pph_variable_isa_constraints_in_lit_internal(var, exp, lits, mt, use_var_typing_clausesP, validity_test);
	}
	caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_VARIABLE_ISA_CONSTRAINTS_IN_LIT, UNPROVIDED);
	if (NIL == caching_state) {
	    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_VARIABLE_ISA_CONSTRAINTS_IN_LIT, SIX_INTEGER, $int$100, EQUAL, UNPROVIDED);
	    memoization_state.memoization_state_put(v_memoization_state, PPH_VARIABLE_ISA_CONSTRAINTS_IN_LIT, caching_state);
	}
	final SubLObject sxhash = memoization_state.sxhash_calc_6(var, exp, lits, mt, use_var_typing_clausesP, validity_test);
	final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
	if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
	    SubLObject cdolist_list_var = collisions;
	    SubLObject collision = NIL;
	    collision = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		SubLObject cached_args = collision.first();
		final SubLObject results2 = second(collision);
		if (var.equal(cached_args.first())) {
		    cached_args = cached_args.rest();
		    if (exp.equal(cached_args.first())) {
			cached_args = cached_args.rest();
			if (lits.equal(cached_args.first())) {
			    cached_args = cached_args.rest();
			    if (mt.equal(cached_args.first())) {
				cached_args = cached_args.rest();
				if (use_var_typing_clausesP.equal(cached_args.first())) {
				    cached_args = cached_args.rest();
				    if (((NIL != cached_args) && (NIL == cached_args.rest())) && validity_test.equal(cached_args.first())) {
					return memoization_state.caching_results(results2);
				    }
				}
			    }
			}
		    }
		}
		cdolist_list_var = cdolist_list_var.rest();
		collision = cdolist_list_var.first();
	    }
	}
	final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_variable_isa_constraints_in_lit_internal(var, exp, lits, mt, use_var_typing_clausesP, validity_test)));
	memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(var, exp, lits, mt, use_var_typing_clausesP, validity_test));
	return memoization_state.caching_results(results3);
    }

    public static final SubLObject pph_genls_alt(SubLObject v_term, SubLObject mt) {
	if (mt == UNPROVIDED) {
	    mt = pph_vars.$pph_domain_mt$.getDynamicValue();
	}
	if (NIL != indexed_term_p(v_term)) {
	    return genls.genls(v_term, mt, UNPROVIDED);
	} else {
	    if (NIL != pph_utilities.specs_fn_natP(v_term)) {
		{
		    SubLObject core_term = pph_utilities.pph_core_term(v_term);
		    return NIL != pph_utilities.specs_fn_natP(core_term) ? ((SubLObject) (NIL)) : Mapping.mapcar(PPH_MAKE_TYPE_LEVEL, pph_genls(core_term, mt));
		}
	    } else {
		return NIL;
	    }
	}
    }

    public static SubLObject pph_genls(final SubLObject v_term, SubLObject mt) {
	if (mt == UNPROVIDED) {
	    mt = pph_vars.$pph_domain_mt$.getDynamicValue();
	}
	if (NIL != indexed_term_p(v_term)) {
	    return genls.genls(v_term, mt, UNPROVIDED);
	}
	if (NIL != pph_utilities.specs_fn_natP(v_term)) {
	    final SubLObject core_term = pph_utilities.pph_core_term(v_term);
	    return NIL != pph_utilities.specs_fn_natP(core_term) ? NIL : Mapping.mapcar(PPH_MAKE_TYPE_LEVEL, pph_genls(core_term, mt));
	}
	return NIL;
    }

    public static final SubLObject pph_variable_isa_constraints_in_subexpressions(SubLObject var, SubLObject exp, SubLObject lits, SubLObject mt, SubLObject use_var_typing_clausesP, SubLObject directlyP) {
	{
	    SubLObject ans = NIL;
	    SubLObject use_var_typing_sub_clausesP = makeBoolean((NIL != use_var_typing_clausesP) && (NIL != pph_truth_preserving_operatorP(cycl_utilities.formula_arg0(exp), UNPROVIDED)));
	    SubLObject terms = cycl_utilities.formula_terms(exp, $IGNORE);
	    SubLObject cdolist_list_var = terms;
	    SubLObject sub_exp = NIL;
	    for (sub_exp = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), sub_exp = cdolist_list_var.first()) {
		if (NIL != atomic_sentenceP(sub_exp)) {
		    ans = append(ans, pph_variable_isa_constraints_in_lit(var, sub_exp, lits, mt, use_var_typing_sub_clausesP, directlyP, UNPROVIDED));
		}
		if (NIL != el_formula_p(sub_exp)) {
		    ans = append(ans, pph_variable_isa_constraints_in_subexpressions(var, sub_exp, lits, mt, use_var_typing_sub_clausesP, directlyP));
		}
	    }
	    return ans;
	}
    }

    public static SubLObject pph_variable_isa_constraints_in_subexpressions(final SubLObject var, final SubLObject exp, final SubLObject lits, final SubLObject mt, final SubLObject use_var_typing_clausesP) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject ans = NIL;
	SubLObject from_var_typing_clauses = NIL;
	final SubLObject use_var_typing_sub_clausesP = makeBoolean((NIL != use_var_typing_clausesP) && (NIL != pph_truth_preserving_operatorP(cycl_utilities.formula_arg0(exp), UNPROVIDED)));
	SubLObject cdolist_list_var;
	final SubLObject terms = cdolist_list_var = cycl_utilities.formula_terms(exp, $IGNORE);
	SubLObject sub_exp = NIL;
	sub_exp = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    if (NIL != atomic_sentenceP(sub_exp)) {
		thread.resetMultipleValues();
		final SubLObject more_ans = pph_variable_isa_constraints_in_lit(var, sub_exp, lits, mt, use_var_typing_sub_clausesP, UNPROVIDED);
		final SubLObject more_var_types = thread.secondMultipleValue();
		thread.resetMultipleValues();
		ans = append(ans, more_ans);
		from_var_typing_clauses = append(from_var_typing_clauses, more_var_types);
	    }
	    if (NIL != el_formula_p(sub_exp)) {
		thread.resetMultipleValues();
		final SubLObject more_ans = pph_variable_isa_constraints_in_subexpressions(var, sub_exp, lits, mt, use_var_typing_sub_clausesP);
		final SubLObject more_var_types = thread.secondMultipleValue();
		thread.resetMultipleValues();
		ans = append(ans, more_ans);
		from_var_typing_clauses = append(from_var_typing_clauses, more_var_types);
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    sub_exp = cdolist_list_var.first();
	}
	return values(ans, from_var_typing_clauses);
    }

    /**
     *
     *
     * @return BOOLEAN; Are propositions inside the scope of OPERATOR guaranteed to
    be true if the larger proposition is true?
     */
    @LispMethod(comment = "@return BOOLEAN; Are propositions inside the scope of OPERATOR guaranteed to\r\nbe true if the larger proposition is true?")
    public static final SubLObject pph_truth_preserving_operatorP_internal_alt(SubLObject operator, SubLObject mt) {
	if (mt == UNPROVIDED) {
	    mt = pph_vars.$pph_domain_mt$.getDynamicValue();
	}
	return makeBoolean((NIL != forts.fort_p(operator)) && (((NIL != member(operator, $list_alt95, UNPROVIDED, UNPROVIDED)) || (NIL != member(operator, $list_alt96, UNPROVIDED, UNPROVIDED))) || ((NIL != fort_types_interface.predicateP(operator))
		&& ((((NIL != pph_utilities.pph_genl_predicateP(operator, $$extentCardinality, mt)) || (NIL != pph_utilities.pph_genl_predicateP(operator, $$trueSentence, mt))) || (NIL != pph_utilities.pph_genl_predicateP(operator, $$holdsSometimeDuring, mt)))
			|| (NIL != pph_utilities.pph_genl_predicateP(operator, $$ist, mt))))));
    }

    /**
     *
     *
     * @return BOOLEAN; Are propositions inside the scope of OPERATOR guaranteed to
    be true if the larger proposition is true?
     */
    @LispMethod(comment = "@return BOOLEAN; Are propositions inside the scope of OPERATOR guaranteed to\r\nbe true if the larger proposition is true?")
    public static SubLObject pph_truth_preserving_operatorP_internal(final SubLObject operator, SubLObject mt) {
	if (mt == UNPROVIDED) {
	    mt = pph_vars.$pph_domain_mt$.getDynamicValue();
	}
	return makeBoolean((NIL != forts.fort_p(operator)) && (((NIL != member(operator, $list98, UNPROVIDED, UNPROVIDED)) || (NIL != member(operator, $list99, UNPROVIDED, UNPROVIDED))) || ((NIL != fort_types_interface.predicateP(operator))
		&& ((((NIL != pph_utilities.pph_genl_predicateP(operator, $$extentCardinality, mt)) || (NIL != pph_utilities.pph_genl_predicateP(operator, $$trueSentence, mt))) || (NIL != pph_utilities.pph_genl_predicateP(operator, $$holdsSometimeDuring, mt)))
			|| (NIL != pph_utilities.pph_genl_predicateP(operator, $$ist, mt))))));
    }

    public static final SubLObject pph_truth_preserving_operatorP_alt(SubLObject operator, SubLObject mt) {
	if (mt == UNPROVIDED) {
	    mt = pph_vars.$pph_domain_mt$.getDynamicValue();
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
		    return pph_truth_preserving_operatorP_internal(operator, mt);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym94$PPH_TRUTH_PRESERVING_OPERATOR_, UNPROVIDED);
		if (NIL == caching_state) {
		    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym94$PPH_TRUTH_PRESERVING_OPERATOR_, TWO_INTEGER, $int$200, EQL, UNPROVIDED);
		    memoization_state.memoization_state_put(v_memoization_state, $sym94$PPH_TRUTH_PRESERVING_OPERATOR_, caching_state);
		}
		{
		    SubLObject sxhash = memoization_state.sxhash_calc_2(operator, mt);
		    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		    if (collisions != $kw56$_MEMOIZED_ITEM_NOT_FOUND_) {
			{
			    SubLObject cdolist_list_var = collisions;
			    SubLObject collision = NIL;
			    for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
				{
				    SubLObject cached_args = collision.first();
				    SubLObject results2 = second(collision);
				    if (operator.eql(cached_args.first())) {
					cached_args = cached_args.rest();
					if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
					    return memoization_state.caching_results(results2);
					}
				    }
				}
			    }
			}
		    }
		    {
			SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(pph_truth_preserving_operatorP_internal(operator, mt)));
			memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(operator, mt));
			return memoization_state.caching_results(results);
		    }
		}
	    }
	}
    }

    public static SubLObject pph_truth_preserving_operatorP(final SubLObject operator, SubLObject mt) {
	if (mt == UNPROVIDED) {
	    mt = pph_vars.$pph_domain_mt$.getDynamicValue();
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
	SubLObject caching_state = NIL;
	if (NIL == v_memoization_state) {
	    return pph_truth_preserving_operatorP_internal(operator, mt);
	}
	caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym97$PPH_TRUTH_PRESERVING_OPERATOR_, UNPROVIDED);
	if (NIL == caching_state) {
	    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym97$PPH_TRUTH_PRESERVING_OPERATOR_, TWO_INTEGER, $int$200, EQL, UNPROVIDED);
	    memoization_state.memoization_state_put(v_memoization_state, $sym97$PPH_TRUTH_PRESERVING_OPERATOR_, caching_state);
	}
	final SubLObject sxhash = memoization_state.sxhash_calc_2(operator, mt);
	final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
	if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
	    SubLObject cdolist_list_var = collisions;
	    SubLObject collision = NIL;
	    collision = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		SubLObject cached_args = collision.first();
		final SubLObject results2 = second(collision);
		if (operator.eql(cached_args.first())) {
		    cached_args = cached_args.rest();
		    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
			return memoization_state.caching_results(results2);
		    }
		}
		cdolist_list_var = cdolist_list_var.rest();
		collision = cdolist_list_var.first();
	    }
	}
	final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_truth_preserving_operatorP_internal(operator, mt)));
	memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(operator, mt));
	return memoization_state.caching_results(results3);
    }

    public static final SubLObject pph_strip_existentials_alt(SubLObject formula, SubLObject include_nested_existentialsP) {
	if (include_nested_existentialsP == UNPROVIDED) {
	    include_nested_existentialsP = NIL;
	}
	if (NIL != include_nested_existentialsP) {
	    return cycl_utilities.expression_transform(formula, EL_EXISTENTIAL_P, QUANTIFIED_SUB_SENTENCE, UNPROVIDED, UNPROVIDED);
	} else {
	    while (NIL != el_existential_p(formula)) {
		formula = quantified_sub_sentence(formula);
	    }
	}
	return formula;
    }

    public static SubLObject pph_strip_existentials(SubLObject formula, SubLObject include_nested_existentialsP) {
	if (include_nested_existentialsP == UNPROVIDED) {
	    include_nested_existentialsP = NIL;
	}
	if (NIL != include_nested_existentialsP) {
	    return cycl_utilities.expression_transform(formula, EL_EXISTENTIAL_P, QUANTIFIED_SUB_SENTENCE, UNPROVIDED, UNPROVIDED);
	}
	while (NIL != el_existential_p(formula)) {
	    formula = quantified_sub_sentence(formula);
	}
	return formula;
    }

    /**
     * Remove any items from COLS that are genls of anything else in COLS
     */
    @LispMethod(comment = "Remove any items from COLS that are genls of anything else in COLS")
    public static final SubLObject pph_delete_genls_alt(SubLObject cols) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (!cols.isList()) {
		return NIL;
	    }
	    {
		SubLObject ans = NIL;
		SubLObject col = NIL;
		for (ans = NIL, col = delete_duplicates(cols, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED).first(); NIL != col; ans = ans, col = cols.first()) {
		    cols = cols.rest();
		    {
			SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_domain_mt$.getDynamicValue(thread));
			{
			    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
			    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
			    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
			    try {
				mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
				mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
				mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
				if (!((NIL != subl_promotions.memberP(col, cols, $sym51$PPH_SPEC_, UNPROVIDED)) || (NIL != member(col, ans, $sym51$PPH_SPEC_, UNPROVIDED)))) {
				    ans = cons(col, ans);
				}
			    } finally {
				mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
				mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
				mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
			    }
			}
		    }
		}
		return ans;
	    }
	}
    }

    @LispMethod(comment = "Remove any items from COLS that are genls of anything else in COLS")
    public static SubLObject pph_delete_genls(SubLObject cols) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (!cols.isList()) {
	    return NIL;
	}
	SubLObject ans = NIL;
	SubLObject col = NIL;
	ans = NIL;
	for (col = delete_duplicates(cols, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED).first(); NIL != col; col = cols.first()) {
	    cols = cols.rest();
	    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_domain_mt$.getDynamicValue(thread));
	    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
	    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
	    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
	    try {
		mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
		mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
		mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
		if ((NIL == subl_promotions.memberP(col, cols, $sym57$PPH_SPEC_, UNPROVIDED)) && (NIL == member(col, ans, $sym57$PPH_SPEC_, UNPROVIDED))) {
		    ans = cons(col, ans);
		}
	    } finally {
		mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
		mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
		mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
	    }
	    // ans = ans;
	}
	return ans;
    }

    /**
    * Remove any items from COLS that are genls of anything else in COLS
    */

    /**
     * A maximally specific #$isa arg-constraint on VAR in FORMULA.
     *
     * @return COLLECTION-P.
     */
    @LispMethod(comment = "A maximally specific #$isa arg-constraint on VAR in FORMULA.\r\n\r\n@return COLLECTION-P.")
    public static final SubLObject pph_min_variable_isa_constraint_internal_alt(SubLObject var, SubLObject formula, SubLObject mt, SubLObject use_var_typing_clausesP, SubLObject directlyP, SubLObject validity_test) {
	if (mt == UNPROVIDED) {
	    mt = pph_vars.$pph_domain_mt$.getDynamicValue();
	}
	if (use_var_typing_clausesP == UNPROVIDED) {
	    use_var_typing_clausesP = T;
	}
	if (directlyP == UNPROVIDED) {
	    directlyP = NIL;
	}
	if (validity_test == UNPROVIDED) {
	    validity_test = $sym73$PPH_VALID_VAR_TYPE_;
	}
	{
	    SubLObject constraints = pph_variable_isa_constraints(var, formula, mt, use_var_typing_clausesP, directlyP, validity_test);
	    SubLObject found_constraints = pph_find_most_specific(constraints, UNPROVIDED);
	    SubLObject choice = (NIL != found_constraints) ? ((SubLObject) (found_constraints)) : pph_default_var_type();
	    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
		format(T, $str_alt104$Constraints_on__S_are__S_____choo, new SubLObject[] { var, constraints, choice });
	    }
	    return choice;
	}
    }

    @LispMethod(comment = "A maximally specific #$isa arg-constraint on VAR in FORMULA.\r\n\r\n@return COLLECTION-P.")
    public static SubLObject pph_min_variable_isa_constraint_internal(final SubLObject var, final SubLObject formula, SubLObject mt, SubLObject use_var_typing_clausesP, SubLObject directlyP, SubLObject validity_test) {
	if (mt == UNPROVIDED) {
	    mt = pph_vars.$pph_domain_mt$.getDynamicValue();
	}
	if (use_var_typing_clausesP == UNPROVIDED) {
	    use_var_typing_clausesP = T;
	}
	if (directlyP == UNPROVIDED) {
	    directlyP = NIL;
	}
	if (validity_test == UNPROVIDED) {
	    validity_test = $sym78$PPH_VALID_VAR_TYPE_;
	}
	final SubLObject constraints = pph_variable_isa_constraints(var, formula, mt, use_var_typing_clausesP, directlyP, validity_test);
	final SubLObject found_constraints = pph_find_most_specific(constraints, UNPROVIDED);
	final SubLObject choice = (NIL != found_constraints) ? found_constraints : pph_default_var_type();
	if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
	    format_nil.force_format(T, $str107$Constraints_on__S_are__S_____choo, var, constraints, choice, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}
	return choice;
    }

    /**
    * A maximally specific #$isa arg-constraint on VAR in FORMULA.
    *
    * @return COLLECTION-P.
    */

    public static final SubLObject pph_min_variable_isa_constraint_alt(SubLObject var, SubLObject formula, SubLObject mt, SubLObject use_var_typing_clausesP, SubLObject directlyP, SubLObject validity_test) {
	if (mt == UNPROVIDED) {
	    mt = pph_vars.$pph_domain_mt$.getDynamicValue();
	}
	if (use_var_typing_clausesP == UNPROVIDED) {
	    use_var_typing_clausesP = T;
	}
	if (directlyP == UNPROVIDED) {
	    directlyP = NIL;
	}
	if (validity_test == UNPROVIDED) {
	    validity_test = $sym73$PPH_VALID_VAR_TYPE_;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
		    return pph_min_variable_isa_constraint_internal(var, formula, mt, use_var_typing_clausesP, directlyP, validity_test);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_MIN_VARIABLE_ISA_CONSTRAINT, UNPROVIDED);
		if (NIL == caching_state) {
		    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_MIN_VARIABLE_ISA_CONSTRAINT, SIX_INTEGER, $int$98, EQUAL, UNPROVIDED);
		    memoization_state.memoization_state_put(v_memoization_state, PPH_MIN_VARIABLE_ISA_CONSTRAINT, caching_state);
		}
		{
		    SubLObject sxhash = memoization_state.sxhash_calc_6(var, formula, mt, use_var_typing_clausesP, directlyP, validity_test);
		    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		    if (collisions != $kw56$_MEMOIZED_ITEM_NOT_FOUND_) {
			{
			    SubLObject cdolist_list_var = collisions;
			    SubLObject collision = NIL;
			    for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
				{
				    SubLObject cached_args = collision.first();
				    SubLObject results2 = second(collision);
				    if (var.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (formula.equal(cached_args.first())) {
					    cached_args = cached_args.rest();
					    if (mt.equal(cached_args.first())) {
						cached_args = cached_args.rest();
						if (use_var_typing_clausesP.equal(cached_args.first())) {
						    cached_args = cached_args.rest();
						    if (directlyP.equal(cached_args.first())) {
							cached_args = cached_args.rest();
							if (((NIL != cached_args) && (NIL == cached_args.rest())) && validity_test.equal(cached_args.first())) {
							    return memoization_state.caching_results(results2);
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
		    {
			SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(pph_min_variable_isa_constraint_internal(var, formula, mt, use_var_typing_clausesP, directlyP, validity_test)));
			memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(var, formula, mt, use_var_typing_clausesP, directlyP, validity_test));
			return memoization_state.caching_results(results);
		    }
		}
	    }
	}
    }

    public static SubLObject pph_min_variable_isa_constraint(final SubLObject var, final SubLObject formula, SubLObject mt, SubLObject use_var_typing_clausesP, SubLObject directlyP, SubLObject validity_test) {
	if (mt == UNPROVIDED) {
	    mt = pph_vars.$pph_domain_mt$.getDynamicValue();
	}
	if (use_var_typing_clausesP == UNPROVIDED) {
	    use_var_typing_clausesP = T;
	}
	if (directlyP == UNPROVIDED) {
	    directlyP = NIL;
	}
	if (validity_test == UNPROVIDED) {
	    validity_test = $sym78$PPH_VALID_VAR_TYPE_;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
	SubLObject caching_state = NIL;
	if (NIL == v_memoization_state) {
	    return pph_min_variable_isa_constraint_internal(var, formula, mt, use_var_typing_clausesP, directlyP, validity_test);
	}
	caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_MIN_VARIABLE_ISA_CONSTRAINT, UNPROVIDED);
	if (NIL == caching_state) {
	    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_MIN_VARIABLE_ISA_CONSTRAINT, SIX_INTEGER, $int$98, EQUAL, UNPROVIDED);
	    memoization_state.memoization_state_put(v_memoization_state, PPH_MIN_VARIABLE_ISA_CONSTRAINT, caching_state);
	}
	final SubLObject sxhash = memoization_state.sxhash_calc_6(var, formula, mt, use_var_typing_clausesP, directlyP, validity_test);
	final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
	if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
	    SubLObject cdolist_list_var = collisions;
	    SubLObject collision = NIL;
	    collision = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		SubLObject cached_args = collision.first();
		final SubLObject results2 = second(collision);
		if (var.equal(cached_args.first())) {
		    cached_args = cached_args.rest();
		    if (formula.equal(cached_args.first())) {
			cached_args = cached_args.rest();
			if (mt.equal(cached_args.first())) {
			    cached_args = cached_args.rest();
			    if (use_var_typing_clausesP.equal(cached_args.first())) {
				cached_args = cached_args.rest();
				if (directlyP.equal(cached_args.first())) {
				    cached_args = cached_args.rest();
				    if (((NIL != cached_args) && (NIL == cached_args.rest())) && validity_test.equal(cached_args.first())) {
					return memoization_state.caching_results(results2);
				    }
				}
			    }
			}
		    }
		}
		cdolist_list_var = cdolist_list_var.rest();
		collision = cdolist_list_var.first();
	    }
	}
	final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_min_variable_isa_constraint_internal(var, formula, mt, use_var_typing_clausesP, directlyP, validity_test)));
	memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(var, formula, mt, use_var_typing_clausesP, directlyP, validity_test));
	return memoization_state.caching_results(results3);
    }

    /**
     *
     *
     * @return the most specific of ITEMS according to TEST.
     */
    @LispMethod(comment = "@return the most specific of ITEMS according to TEST.")
    public static final SubLObject pph_find_most_specific_internal_alt(SubLObject items, SubLObject test) {
	if (test == UNPROVIDED) {
	    test = $sym80$PPH_GENERALITY_ESTIMATE_;
	}
	{
	    SubLObject ans = items.first();
	    SubLObject cdolist_list_var = items.rest();
	    SubLObject other = NIL;
	    for (other = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), other = cdolist_list_var.first()) {
		{
		    SubLObject pcase_var = test;
		    if (pcase_var.eql(QUOTE) || pcase_var.eql($sym80$PPH_GENERALITY_ESTIMATE_)) {
			if (NIL != pph_utilities.pph_generality_estimateL(other, ans)) {
			    ans = other;
			}
		    } else {
			if (NIL != funcall(test, other, ans)) {
			    ans = other;
			}
		    }
		}
	    }
	    return ans;
	}
    }

    /**
     *
     *
     * @return the most specific of ITEMS according to TEST.
     */
    @LispMethod(comment = "@return the most specific of ITEMS according to TEST.")
    public static SubLObject pph_find_most_specific_internal(final SubLObject items, SubLObject test) {
	if (test == UNPROVIDED) {
	    test = $sym85$PPH_GENERALITY_ESTIMATE_;
	}
	SubLObject ans = items.first();
	SubLObject cdolist_list_var = items.rest();
	SubLObject other = NIL;
	other = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    final SubLObject pcase_var = test;
	    if (pcase_var.eql(QUOTE) || pcase_var.eql($sym85$PPH_GENERALITY_ESTIMATE_)) {
		if (NIL != pph_utilities.pph_generality_estimateL(other, ans)) {
		    ans = other;
		}
	    } else if (NIL != funcall(test, other, ans)) {
		ans = other;
	    }

	    cdolist_list_var = cdolist_list_var.rest();
	    other = cdolist_list_var.first();
	}
	return ans;
    }

    public static final SubLObject pph_find_most_specific_alt(SubLObject items, SubLObject test) {
	if (test == UNPROVIDED) {
	    test = $sym80$PPH_GENERALITY_ESTIMATE_;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
		    return pph_find_most_specific_internal(items, test);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_FIND_MOST_SPECIFIC, UNPROVIDED);
		if (NIL == caching_state) {
		    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_FIND_MOST_SPECIFIC, TWO_INTEGER, $int$100, EQUAL, UNPROVIDED);
		    memoization_state.memoization_state_put(v_memoization_state, PPH_FIND_MOST_SPECIFIC, caching_state);
		}
		{
		    SubLObject sxhash = memoization_state.sxhash_calc_2(items, test);
		    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		    if (collisions != $kw56$_MEMOIZED_ITEM_NOT_FOUND_) {
			{
			    SubLObject cdolist_list_var = collisions;
			    SubLObject collision = NIL;
			    for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
				{
				    SubLObject cached_args = collision.first();
				    SubLObject results2 = second(collision);
				    if (items.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (((NIL != cached_args) && (NIL == cached_args.rest())) && test.equal(cached_args.first())) {
					    return memoization_state.caching_results(results2);
					}
				    }
				}
			    }
			}
		    }
		    {
			SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(pph_find_most_specific_internal(items, test)));
			memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(items, test));
			return memoization_state.caching_results(results);
		    }
		}
	    }
	}
    }

    public static SubLObject pph_find_most_specific(final SubLObject items, SubLObject test) {
	if (test == UNPROVIDED) {
	    test = $sym85$PPH_GENERALITY_ESTIMATE_;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
	SubLObject caching_state = NIL;
	if (NIL == v_memoization_state) {
	    return pph_find_most_specific_internal(items, test);
	}
	caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_FIND_MOST_SPECIFIC, UNPROVIDED);
	if (NIL == caching_state) {
	    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_FIND_MOST_SPECIFIC, TWO_INTEGER, $int$100, EQUAL, UNPROVIDED);
	    memoization_state.memoization_state_put(v_memoization_state, PPH_FIND_MOST_SPECIFIC, caching_state);
	}
	final SubLObject sxhash = memoization_state.sxhash_calc_2(items, test);
	final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
	if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
	    SubLObject cdolist_list_var = collisions;
	    SubLObject collision = NIL;
	    collision = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		SubLObject cached_args = collision.first();
		final SubLObject results2 = second(collision);
		if (items.equal(cached_args.first())) {
		    cached_args = cached_args.rest();
		    if (((NIL != cached_args) && (NIL == cached_args.rest())) && test.equal(cached_args.first())) {
			return memoization_state.caching_results(results2);
		    }
		}
		cdolist_list_var = cdolist_list_var.rest();
		collision = cdolist_list_var.first();
	    }
	}
	final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_find_most_specific_internal(items, test)));
	memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(items, test));
	return memoization_state.caching_results(results3);
    }

    public static final SubLObject declare_pph_variable_handling_file_alt() {
	declareFunction("pph_var_entry_print_function_trampoline", "PPH-VAR-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("pph_var_entry_p", "PPH-VAR-ENTRY-P", 1, 0, false);
	new com.cyc.cycjava.cycl.pph_variable_handling.$pph_var_entry_p$UnaryFunction();
	declareFunction("pph_var_entry_var", "PPH-VAR-ENTRY-VAR", 1, 0, false);
	declareFunction("pph_var_entry_type", "PPH-VAR-ENTRY-TYPE", 1, 0, false);
	declareFunction("pph_var_entry_paraphrases", "PPH-VAR-ENTRY-PARAPHRASES", 1, 0, false);
	declareFunction("pph_var_entry_quantifier", "PPH-VAR-ENTRY-QUANTIFIER", 1, 0, false);
	declareFunction("pph_var_entry_single_useP", "PPH-VAR-ENTRY-SINGLE-USE?", 1, 0, false);
	declareFunction("pph_var_entry_arg_position", "PPH-VAR-ENTRY-ARG-POSITION", 1, 0, false);
	declareFunction("_csetf_pph_var_entry_var", "_CSETF-PPH-VAR-ENTRY-VAR", 2, 0, false);
	declareFunction("_csetf_pph_var_entry_type", "_CSETF-PPH-VAR-ENTRY-TYPE", 2, 0, false);
	declareFunction("_csetf_pph_var_entry_paraphrases", "_CSETF-PPH-VAR-ENTRY-PARAPHRASES", 2, 0, false);
	declareFunction("_csetf_pph_var_entry_quantifier", "_CSETF-PPH-VAR-ENTRY-QUANTIFIER", 2, 0, false);
	declareFunction("_csetf_pph_var_entry_single_useP", "_CSETF-PPH-VAR-ENTRY-SINGLE-USE?", 2, 0, false);
	declareFunction("_csetf_pph_var_entry_arg_position", "_CSETF-PPH-VAR-ENTRY-ARG-POSITION", 2, 0, false);
	declareFunction("make_pph_var_entry", "MAKE-PPH-VAR-ENTRY", 0, 1, false);
	declareFunction("pprint_pph_var_entry", "PPRINT-PPH-VAR-ENTRY", 3, 0, false);
	declareFunction("new_pph_var_entry", "NEW-PPH-VAR-ENTRY", 1, 5, false);
	declareFunction("pph_var_entry_copy", "PPH-VAR-ENTRY-COPY", 1, 0, false);
	declareFunction("set_pph_var_type", "SET-PPH-VAR-TYPE", 2, 0, false);
	declareFunction("set_pph_var_type_map", "SET-PPH-VAR-TYPE-MAP", 2, 0, false);
	declareFunction("set_pph_var_paraphrases", "SET-PPH-VAR-PARAPHRASES", 2, 0, false);
	declareFunction("set_pph_var_quantifier", "SET-PPH-VAR-QUANTIFIER", 2, 0, false);
	declareFunction("clear_pph_var_types", "CLEAR-PPH-VAR-TYPES", 0, 0, false);
	declareFunction("pph_default_var_type", "PPH-DEFAULT-VAR-TYPE", 0, 0, false);
	declareFunction("pph_registered_vars", "PPH-REGISTERED-VARS", 0, 0, false);
	declareFunction("pph_var_entry", "PPH-VAR-ENTRY", 1, 0, false);
	declareFunction("pph_var_entries", "PPH-VAR-ENTRIES", 1, 0, false);
	declareFunction("pph_var_registeredP", "PPH-VAR-REGISTERED?", 1, 0, false);
	declareFunction("pph_var_registered_as_defaultP", "PPH-VAR-REGISTERED-AS-DEFAULT?", 1, 0, false);
	declareFunction("pph_register_var", "PPH-REGISTER-VAR", 1, 2, false);
	declareFunction("pph_update_var_type", "PPH-UPDATE-VAR-TYPE", 2, 0, false);
	declareFunction("pph_deregister_var", "PPH-DEREGISTER-VAR", 1, 0, false);
	declareFunction("pph_deregister_vars", "PPH-DEREGISTER-VARS", 1, 0, false);
	declareFunction("pph_deregister_var_paraphrase", "PPH-DEREGISTER-VAR-PARAPHRASE", 2, 0, false);
	declareFunction("pph_register_var_paraphrase", "PPH-REGISTER-VAR-PARAPHRASE", 2, 0, false);
	declareFunction("pph_var_quantifiedP", "PPH-VAR-QUANTIFIED?", 1, 0, false);
	declareFunction("pph_register_var_quantifier", "PPH-REGISTER-VAR-QUANTIFIER", 2, 0, false);
	declareFunction("pph_quantifier_for_operator", "PPH-QUANTIFIER-FOR-OPERATOR", 1, 0, false);
	declareFunction("pph_register_scoped_vars", "PPH-REGISTER-SCOPED-VARS", 1, 0, false);
	declareFunction("pph_register_query_vars", "PPH-REGISTER-QUERY-VARS", 1, 0, false);
	declareFunction("pph_query_var_p", "PPH-QUERY-VAR-P", 1, 0, false);
	declareFunction("pph_existential_var_p", "PPH-EXISTENTIAL-VAR-P", 1, 0, false);
	declareFunction("pph_note_if_var_is_used_only_once_in_formula", "PPH-NOTE-IF-VAR-IS-USED-ONLY-ONCE-IN-FORMULA", 2, 0, false);
	declareFunction("pph_register_var_as_used_only_once", "PPH-REGISTER-VAR-AS-USED-ONLY-ONCE", 1, 0, false);
	declareFunction("pph_var_used_only_onceP", "PPH-VAR-USED-ONLY-ONCE?", 1, 0, false);
	declareMacro("pph_do_var_entries", "PPH-DO-VAR-ENTRIES");
	declareFunction("pph_var_quantifier", "PPH-VAR-QUANTIFIER", 1, 0, false);
	declareFunction("pph_var_type", "PPH-VAR-TYPE", 1, 0, false);
	declareFunction("pph_cycl_var_type", "PPH-CYCL-VAR-TYPE", 1, 0, false);
	declareFunction("pph_type_arg_position_map", "PPH-TYPE-ARG-POSITION-MAP", 1, 0, false);
	declareFunction("pph_var_paraphrases", "PPH-VAR-PARAPHRASES", 1, 0, false);
	declareFunction("pph_clear_var_paraphrases", "PPH-CLEAR-VAR-PARAPHRASES", 1, 0, false);
	declareFunction("pph_clear_all_var_paraphrases", "PPH-CLEAR-ALL-VAR-PARAPHRASES", 0, 0, false);
	declareFunction("pph_var_from_paraphrase", "PPH-VAR-FROM-PARAPHRASE", 1, 0, false);
	declareFunction("pph_unregistered_variableP", "PPH-UNREGISTERED-VARIABLE?", 1, 0, false);
	declareFunction("pph_duplicate_var_typeP", "PPH-DUPLICATE-VAR-TYPE?", 1, 0, false);
	declareFunction("pph_var_paraphrased_explicitlyP", "PPH-VAR-PARAPHRASED-EXPLICITLY?", 1, 0, false);
	declareFunction("pph_var_previously_paraphrasedP", "PPH-VAR-PREVIOUSLY-PARAPHRASED?", 1, 0, false);
	declareFunction("pph_var_count_previous_paraphrases", "PPH-VAR-COUNT-PREVIOUS-PARAPHRASES", 1, 0, false);
	declareFunction("string_mentions_varP", "STRING-MENTIONS-VAR?", 2, 0, false);
	declareFunction("pph_use_explicit_varP", "PPH-USE-EXPLICIT-VAR?", 1, 0, false);
	declareFunction("pph_var_type_previously_explicit_if_mentionedP", "PPH-VAR-TYPE-PREVIOUSLY-EXPLICIT-IF-MENTIONED?", 1, 0, false);
	declareFunction("pph_var_previously_explicitP", "PPH-VAR-PREVIOUSLY-EXPLICIT?", 1, 0, false);
	declareFunction("pph_var_previously_lexifiedP", "PPH-VAR-PREVIOUSLY-LEXIFIED?", 1, 0, false);
	declareFunction("pph_string_is_posP_internal", "PPH-STRING-IS-POS?-INTERNAL", 2, 2, false);
	declareFunction("pph_string_is_posP", "PPH-STRING-IS-POS?", 2, 2, false);
	declareFunction("pph_var_previously_pronounP", "PPH-VAR-PREVIOUSLY-PRONOUN?", 1, 0, false);
	declareFunction("pph_register_vars_as_different", "PPH-REGISTER-VARS-AS-DIFFERENT", 2, 0, false);
	declareFunction("pph_different_varsP", "PPH-DIFFERENT-VARS?", 2, 1, false);
	declareFunction("pph_different_varsP_int", "PPH-DIFFERENT-VARS?-INT", 2, 0, false);
	declareFunction("pph_note_var_type", "PPH-NOTE-VAR-TYPE", 2, 0, false);
	declareFunction("pph_other_vars_with_var_type", "PPH-OTHER-VARS-WITH-VAR-TYPE", 1, 0, false);
	declareFunction("pph_vars_with_type", "PPH-VARS-WITH-TYPE", 1, 0, false);
	declareFunction("pph_var_previously_paraphrased_with_otherP", "PPH-VAR-PREVIOUSLY-PARAPHRASED-WITH-OTHER?", 1, 0, false);
	declareFunction("pph_formula_free_variables_internal", "PPH-FORMULA-FREE-VARIABLES-INTERNAL", 1, 1, false);
	declareFunction("pph_formula_free_variables", "PPH-FORMULA-FREE-VARIABLES", 1, 1, false);
	declareFunction("pph_var_scoped_or_quotedP", "PPH-VAR-SCOPED-OR-QUOTED?", 2, 0, false);
	declareFunction("pph_arg_scoped_or_quotedP", "PPH-ARG-SCOPED-OR-QUOTED?", 2, 0, false);
	declareFunction("pph_quoted_collectionP", "PPH-QUOTED-COLLECTION?", 1, 0, false);
	declareFunction("pph_arg_scopedP", "PPH-ARG-SCOPED?", 2, 0, false);
	declareFunction("pph_operator_arg_scopedP_internal", "PPH-OPERATOR-ARG-SCOPED?-INTERNAL", 3, 0, false);
	declareFunction("pph_operator_arg_scopedP", "PPH-OPERATOR-ARG-SCOPED?", 3, 0, false);
	declareFunction("pph_operator_arg_quotedP_internal", "PPH-OPERATOR-ARG-QUOTED?-INTERNAL", 2, 0, false);
	declareFunction("pph_operator_arg_quotedP", "PPH-OPERATOR-ARG-QUOTED?", 2, 0, false);
	declareFunction("pph_variable_isa_constraints", "PPH-VARIABLE-ISA-CONSTRAINTS", 2, 4, false);
	declareFunction("pph_clausal_form_internal", "PPH-CLAUSAL-FORM-INTERNAL", 3, 0, false);
	declareFunction("pph_clausal_form", "PPH-CLAUSAL-FORM", 3, 0, false);
	declareFunction("pph_variable_isa_constraints_in_lit_internal", "PPH-VARIABLE-ISA-CONSTRAINTS-IN-LIT-INTERNAL", 4, 3, false);
	declareFunction("pph_variable_isa_constraints_in_lit", "PPH-VARIABLE-ISA-CONSTRAINTS-IN-LIT", 4, 3, false);
	declareFunction("pph_isa_constraints_from_type", "PPH-ISA-CONSTRAINTS-FROM-TYPE", 5, 0, false);
	declareFunction("pph_genls", "PPH-GENLS", 1, 1, false);
	declareFunction("pph_variable_isa_constraints_in_subexpressions", "PPH-VARIABLE-ISA-CONSTRAINTS-IN-SUBEXPRESSIONS", 6, 0, false);
	declareFunction("pph_truth_preserving_operatorP_internal", "PPH-TRUTH-PRESERVING-OPERATOR?-INTERNAL", 1, 1, false);
	declareFunction("pph_truth_preserving_operatorP", "PPH-TRUTH-PRESERVING-OPERATOR?", 1, 1, false);
	declareFunction("pph_strip_existentials", "PPH-STRIP-EXISTENTIALS", 1, 1, false);
	declareFunction("pph_delete_genls", "PPH-DELETE-GENLS", 1, 0, false);
	declareFunction("pph_min_variable_isa_constraint_internal", "PPH-MIN-VARIABLE-ISA-CONSTRAINT-INTERNAL", 2, 4, false);
	declareFunction("pph_min_variable_isa_constraint", "PPH-MIN-VARIABLE-ISA-CONSTRAINT", 2, 4, false);
	declareFunction("pph_find_most_specific_internal", "PPH-FIND-MOST-SPECIFIC-INTERNAL", 1, 1, false);
	declareFunction("pph_find_most_specific", "PPH-FIND-MOST-SPECIFIC", 1, 1, false);
	declareFunction("get_pph_var_types_test_case_duplicate_var", "GET-PPH-VAR-TYPES-TEST-CASE-DUPLICATE-VAR", 1, 0, false);
	declareFunction("set_pph_var_types_test_case_duplicate_var", "SET-PPH-VAR-TYPES-TEST-CASE-DUPLICATE-VAR", 2, 0, false);
	declareFunction("get_pph_var_types_test_case_test_var", "GET-PPH-VAR-TYPES-TEST-CASE-TEST-VAR", 1, 0, false);
	declareFunction("set_pph_var_types_test_case_test_var", "SET-PPH-VAR-TYPES-TEST-CASE-TEST-VAR", 2, 0, false);
	declareFunction("subloop_reserved_initialize_pph_var_types_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-PPH-VAR-TYPES-TEST-CASE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_pph_var_types_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-PPH-VAR-TYPES-TEST-CASE-INSTANCE", 1, 0, false);
	declareFunction("pph_var_types_test_case_p", "PPH-VAR-TYPES-TEST-CASE-P", 1, 0, false);
	declareFunction("subloop_reserved_initialize_variable_isa_constraints_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-VARIABLE-ISA-CONSTRAINTS-TEST-CASE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_variable_isa_constraints_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-VARIABLE-ISA-CONSTRAINTS-TEST-CASE-INSTANCE", 1, 0, false);
	declareFunction("variable_isa_constraints_test_case_p", "VARIABLE-ISA-CONSTRAINTS-TEST-CASE-P", 1, 0, false);
	return NIL;
    }

    public static SubLObject declare_pph_variable_handling_file() {
	if (SubLFiles.USE_V1) {
	    declareFunction("pph_var_entry_print_function_trampoline", "PPH-VAR-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	    declareFunction("pph_var_entry_p", "PPH-VAR-ENTRY-P", 1, 0, false);
	    new pph_variable_handling.$pph_var_entry_p$UnaryFunction();
	    declareFunction("pph_var_entry_var", "PPH-VAR-ENTRY-VAR", 1, 0, false);
	    declareFunction("pph_var_entry_type", "PPH-VAR-ENTRY-TYPE", 1, 0, false);
	    declareFunction("pph_var_entry_quantifier", "PPH-VAR-ENTRY-QUANTIFIER", 1, 0, false);
	    declareFunction("pph_var_entry_single_useP", "PPH-VAR-ENTRY-SINGLE-USE?", 1, 0, false);
	    declareFunction("pph_var_entry_arg_position", "PPH-VAR-ENTRY-ARG-POSITION", 1, 0, false);
	    declareFunction("_csetf_pph_var_entry_var", "_CSETF-PPH-VAR-ENTRY-VAR", 2, 0, false);
	    declareFunction("_csetf_pph_var_entry_type", "_CSETF-PPH-VAR-ENTRY-TYPE", 2, 0, false);
	    declareFunction("_csetf_pph_var_entry_quantifier", "_CSETF-PPH-VAR-ENTRY-QUANTIFIER", 2, 0, false);
	    declareFunction("_csetf_pph_var_entry_single_useP", "_CSETF-PPH-VAR-ENTRY-SINGLE-USE?", 2, 0, false);
	    declareFunction("_csetf_pph_var_entry_arg_position", "_CSETF-PPH-VAR-ENTRY-ARG-POSITION", 2, 0, false);
	    declareFunction("make_pph_var_entry", "MAKE-PPH-VAR-ENTRY", 0, 1, false);
	    declareFunction("visit_defstruct_pph_var_entry", "VISIT-DEFSTRUCT-PPH-VAR-ENTRY", 2, 0, false);
	    declareFunction("visit_defstruct_object_pph_var_entry_method", "VISIT-DEFSTRUCT-OBJECT-PPH-VAR-ENTRY-METHOD", 2, 0, false);
	    declareFunction("pprint_pph_var_entry", "PPRINT-PPH-VAR-ENTRY", 3, 0, false);
	    declareFunction("new_pph_var_entry", "NEW-PPH-VAR-ENTRY", 1, 4, false);
	    declareFunction("pph_var_entry_copy", "PPH-VAR-ENTRY-COPY", 1, 0, false);
	    declareFunction("set_pph_var_type", "SET-PPH-VAR-TYPE", 2, 0, false);
	    declareFunction("set_pph_var_type_map", "SET-PPH-VAR-TYPE-MAP", 2, 0, false);
	    declareFunction("set_pph_var_quantifier", "SET-PPH-VAR-QUANTIFIER", 2, 0, false);
	    declareFunction("clear_pph_var_types", "CLEAR-PPH-VAR-TYPES", 0, 0, false);
	    declareFunction("pph_default_var_type", "PPH-DEFAULT-VAR-TYPE", 0, 0, false);
	    declareFunction("pph_registered_vars", "PPH-REGISTERED-VARS", 0, 0, false);
	    declareFunction("pph_var_entry", "PPH-VAR-ENTRY", 1, 0, false);
	    declareFunction("pph_var_entries", "PPH-VAR-ENTRIES", 1, 0, false);
	    declareFunction("pph_var_registeredP", "PPH-VAR-REGISTERED?", 1, 0, false);
	    declareFunction("pph_var_registered_as_defaultP", "PPH-VAR-REGISTERED-AS-DEFAULT?", 1, 0, false);
	    declareFunction("pph_register_var", "PPH-REGISTER-VAR", 1, 2, false);
	    declareFunction("pph_update_var_type", "PPH-UPDATE-VAR-TYPE", 2, 0, false);
	    declareFunction("pph_deregister_var", "PPH-DEREGISTER-VAR", 1, 0, false);
	    declareFunction("pph_deregister_vars", "PPH-DEREGISTER-VARS", 1, 0, false);
	    declareFunction("pph_var_quantifiedP", "PPH-VAR-QUANTIFIED?", 1, 0, false);
	    declareFunction("pph_register_var_quantifier", "PPH-REGISTER-VAR-QUANTIFIER", 2, 0, false);
	    declareFunction("pph_quantifier_for_operator", "PPH-QUANTIFIER-FOR-OPERATOR", 1, 0, false);
	    declareFunction("pph_register_scoped_vars", "PPH-REGISTER-SCOPED-VARS", 1, 0, false);
	    declareMacro("with_pph_hypothesized_vars", "WITH-PPH-HYPOTHESIZED-VARS");
	    declareFunction("pph_register_query_vars", "PPH-REGISTER-QUERY-VARS", 1, 0, false);
	    declareFunction("pph_query_var_p", "PPH-QUERY-VAR-P", 1, 0, false);
	    declareFunction("pph_existential_var_p", "PPH-EXISTENTIAL-VAR-P", 1, 0, false);
	    declareFunction("pph_note_if_var_is_used_only_once_in_formula", "PPH-NOTE-IF-VAR-IS-USED-ONLY-ONCE-IN-FORMULA", 2, 0, false);
	    declareFunction("pph_register_var_as_used_only_once", "PPH-REGISTER-VAR-AS-USED-ONLY-ONCE", 1, 0, false);
	    declareFunction("pph_var_used_only_onceP", "PPH-VAR-USED-ONLY-ONCE?", 1, 0, false);
	    declareMacro("pph_do_var_entries", "PPH-DO-VAR-ENTRIES");
	    declareFunction("pph_var_quantifier", "PPH-VAR-QUANTIFIER", 1, 0, false);
	    declareFunction("pph_var_type", "PPH-VAR-TYPE", 1, 0, false);
	    declareFunction("pph_cycl_var_type", "PPH-CYCL-VAR-TYPE", 1, 0, false);
	    declareFunction("pph_type_arg_position_map", "PPH-TYPE-ARG-POSITION-MAP", 1, 0, false);
	    declareFunction("pph_unregistered_variableP", "PPH-UNREGISTERED-VARIABLE?", 1, 0, false);
	    declareFunction("pph_duplicate_var_typeP", "PPH-DUPLICATE-VAR-TYPE?", 1, 0, false);
	    declareFunction("pph_var_paraphrased_explicitlyP", "PPH-VAR-PARAPHRASED-EXPLICITLY?", 1, 0, false);
	    declareFunction("string_mentions_varP", "STRING-MENTIONS-VAR?", 2, 0, false);
	    declareFunction("pph_use_explicit_varP", "PPH-USE-EXPLICIT-VAR?", 1, 0, false);
	    declareFunction("pph_var_type_previously_explicit_if_mentionedP", "PPH-VAR-TYPE-PREVIOUSLY-EXPLICIT-IF-MENTIONED?", 1, 0, false);
	    declareFunction("pph_var_previously_explicitP", "PPH-VAR-PREVIOUSLY-EXPLICIT?", 1, 0, false);
	    declareFunction("pph_var_previously_lexifiedP", "PPH-VAR-PREVIOUSLY-LEXIFIED?", 1, 0, false);
	    declareFunction("pph_string_is_posP_internal", "PPH-STRING-IS-POS?-INTERNAL", 2, 2, false);
	    declareFunction("pph_string_is_posP", "PPH-STRING-IS-POS?", 2, 2, false);
	    declareFunction("pph_var_previously_pronounP", "PPH-VAR-PREVIOUSLY-PRONOUN?", 1, 0, false);
	    declareFunction("pph_register_vars_as_different", "PPH-REGISTER-VARS-AS-DIFFERENT", 2, 0, false);
	    declareFunction("pph_different_varsP", "PPH-DIFFERENT-VARS?", 2, 1, false);
	    declareFunction("pph_different_varsP_int", "PPH-DIFFERENT-VARS?-INT", 2, 0, false);
	    declareFunction("pph_note_var_type", "PPH-NOTE-VAR-TYPE", 2, 0, false);
	    declareFunction("pph_other_vars_with_var_type", "PPH-OTHER-VARS-WITH-VAR-TYPE", 1, 0, false);
	    declareFunction("pph_vars_with_type", "PPH-VARS-WITH-TYPE", 1, 0, false);
	    declareFunction("pph_var_previously_paraphrased_with_otherP", "PPH-VAR-PREVIOUSLY-PARAPHRASED-WITH-OTHER?", 1, 0, false);
	    declareFunction("pph_formula_free_variables_internal", "PPH-FORMULA-FREE-VARIABLES-INTERNAL", 1, 1, false);
	    declareFunction("pph_formula_free_variables", "PPH-FORMULA-FREE-VARIABLES", 1, 1, false);
	    declareFunction("pph_var_scoped_or_quotedP", "PPH-VAR-SCOPED-OR-QUOTED?", 2, 0, false);
	    declareFunction("pph_arg_scoped_or_quotedP", "PPH-ARG-SCOPED-OR-QUOTED?", 2, 0, false);
	    declareFunction("pph_quoted_collectionP", "PPH-QUOTED-COLLECTION?", 1, 0, false);
	    declareFunction("pph_arg_scopedP", "PPH-ARG-SCOPED?", 2, 0, false);
	    declareFunction("pph_operator_arg_scopedP_internal", "PPH-OPERATOR-ARG-SCOPED?-INTERNAL", 3, 0, false);
	    declareFunction("pph_operator_arg_scopedP", "PPH-OPERATOR-ARG-SCOPED?", 3, 0, false);
	    declareFunction("pph_operator_arg_quotedP_internal", "PPH-OPERATOR-ARG-QUOTED?-INTERNAL", 2, 0, false);
	    declareFunction("pph_operator_arg_quotedP", "PPH-OPERATOR-ARG-QUOTED?", 2, 0, false);
	    declareFunction("pph_variable_isa_constraints", "PPH-VARIABLE-ISA-CONSTRAINTS", 2, 4, false);
	    declareFunction("pph_replace_direct_var_types", "PPH-REPLACE-DIRECT-VAR-TYPES", 3, 0, false);
	    declareFunction("pph_clausal_form_internal", "PPH-CLAUSAL-FORM-INTERNAL", 3, 0, false);
	    declareFunction("pph_clausal_form", "PPH-CLAUSAL-FORM", 3, 0, false);
	    declareFunction("pph_variable_isa_constraints_in_lit_internal", "PPH-VARIABLE-ISA-CONSTRAINTS-IN-LIT-INTERNAL", 4, 2, false);
	    declareFunction("pph_variable_isa_constraints_in_lit", "PPH-VARIABLE-ISA-CONSTRAINTS-IN-LIT", 4, 2, false);
	    declareFunction("pph_genls", "PPH-GENLS", 1, 1, false);
	    declareFunction("pph_variable_isa_constraints_in_subexpressions", "PPH-VARIABLE-ISA-CONSTRAINTS-IN-SUBEXPRESSIONS", 5, 0, false);
	    declareFunction("pph_truth_preserving_operatorP_internal", "PPH-TRUTH-PRESERVING-OPERATOR?-INTERNAL", 1, 1, false);
	    declareFunction("pph_truth_preserving_operatorP", "PPH-TRUTH-PRESERVING-OPERATOR?", 1, 1, false);
	    declareFunction("pph_strip_existentials", "PPH-STRIP-EXISTENTIALS", 1, 1, false);
	    declareFunction("pph_delete_genls", "PPH-DELETE-GENLS", 1, 0, false);
	    declareFunction("pph_min_variable_isa_constraint_internal", "PPH-MIN-VARIABLE-ISA-CONSTRAINT-INTERNAL", 2, 4, false);
	    declareFunction("pph_min_variable_isa_constraint", "PPH-MIN-VARIABLE-ISA-CONSTRAINT", 2, 4, false);
	    declareFunction("pph_find_most_specific_internal", "PPH-FIND-MOST-SPECIFIC-INTERNAL", 1, 1, false);
	    declareFunction("pph_find_most_specific", "PPH-FIND-MOST-SPECIFIC", 1, 1, false);
	}
	if (SubLFiles.USE_V2) {
	    declareFunction("pph_var_entry_paraphrases", "PPH-VAR-ENTRY-PARAPHRASES", 1, 0, false);
	    declareFunction("_csetf_pph_var_entry_paraphrases", "_CSETF-PPH-VAR-ENTRY-PARAPHRASES", 2, 0, false);
	    declareFunction("new_pph_var_entry", "NEW-PPH-VAR-ENTRY", 1, 5, false);
	    declareFunction("set_pph_var_paraphrases", "SET-PPH-VAR-PARAPHRASES", 2, 0, false);
	    declareFunction("pph_deregister_var_paraphrase", "PPH-DEREGISTER-VAR-PARAPHRASE", 2, 0, false);
	    declareFunction("pph_register_var_paraphrase", "PPH-REGISTER-VAR-PARAPHRASE", 2, 0, false);
	    declareFunction("pph_var_paraphrases", "PPH-VAR-PARAPHRASES", 1, 0, false);
	    declareFunction("pph_clear_var_paraphrases", "PPH-CLEAR-VAR-PARAPHRASES", 1, 0, false);
	    declareFunction("pph_clear_all_var_paraphrases", "PPH-CLEAR-ALL-VAR-PARAPHRASES", 0, 0, false);
	    declareFunction("pph_var_from_paraphrase", "PPH-VAR-FROM-PARAPHRASE", 1, 0, false);
	    declareFunction("pph_var_previously_paraphrasedP", "PPH-VAR-PREVIOUSLY-PARAPHRASED?", 1, 0, false);
	    declareFunction("pph_var_count_previous_paraphrases", "PPH-VAR-COUNT-PREVIOUS-PARAPHRASES", 1, 0, false);
	    declareFunction("pph_variable_isa_constraints_in_lit_internal", "PPH-VARIABLE-ISA-CONSTRAINTS-IN-LIT-INTERNAL", 4, 3, false);
	    declareFunction("pph_variable_isa_constraints_in_lit", "PPH-VARIABLE-ISA-CONSTRAINTS-IN-LIT", 4, 3, false);
	    declareFunction("pph_isa_constraints_from_type", "PPH-ISA-CONSTRAINTS-FROM-TYPE", 5, 0, false);
	    declareFunction("pph_variable_isa_constraints_in_subexpressions", "PPH-VARIABLE-ISA-CONSTRAINTS-IN-SUBEXPRESSIONS", 6, 0, false);
	    declareFunction("get_pph_var_types_test_case_duplicate_var", "GET-PPH-VAR-TYPES-TEST-CASE-DUPLICATE-VAR", 1, 0, false);
	    declareFunction("set_pph_var_types_test_case_duplicate_var", "SET-PPH-VAR-TYPES-TEST-CASE-DUPLICATE-VAR", 2, 0, false);
	    declareFunction("get_pph_var_types_test_case_test_var", "GET-PPH-VAR-TYPES-TEST-CASE-TEST-VAR", 1, 0, false);
	    declareFunction("set_pph_var_types_test_case_test_var", "SET-PPH-VAR-TYPES-TEST-CASE-TEST-VAR", 2, 0, false);
	    declareFunction("subloop_reserved_initialize_pph_var_types_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-PPH-VAR-TYPES-TEST-CASE-CLASS", 1, 0, false);
	    declareFunction("subloop_reserved_initialize_pph_var_types_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-PPH-VAR-TYPES-TEST-CASE-INSTANCE", 1, 0, false);
	    declareFunction("pph_var_types_test_case_p", "PPH-VAR-TYPES-TEST-CASE-P", 1, 0, false);
	    declareFunction("subloop_reserved_initialize_variable_isa_constraints_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-VARIABLE-ISA-CONSTRAINTS-TEST-CASE-CLASS", 1, 0, false);
	    declareFunction("subloop_reserved_initialize_variable_isa_constraints_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-VARIABLE-ISA-CONSTRAINTS-TEST-CASE-INSTANCE", 1, 0, false);
	    declareFunction("variable_isa_constraints_test_case_p", "VARIABLE-ISA-CONSTRAINTS-TEST-CASE-P", 1, 0, false);
	}
	return NIL;
    }

    public static SubLObject declare_pph_variable_handling_file_Previous() {
	declareFunction("pph_var_entry_print_function_trampoline", "PPH-VAR-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("pph_var_entry_p", "PPH-VAR-ENTRY-P", 1, 0, false);
	new pph_variable_handling.$pph_var_entry_p$UnaryFunction();
	declareFunction("pph_var_entry_var", "PPH-VAR-ENTRY-VAR", 1, 0, false);
	declareFunction("pph_var_entry_type", "PPH-VAR-ENTRY-TYPE", 1, 0, false);
	declareFunction("pph_var_entry_quantifier", "PPH-VAR-ENTRY-QUANTIFIER", 1, 0, false);
	declareFunction("pph_var_entry_single_useP", "PPH-VAR-ENTRY-SINGLE-USE?", 1, 0, false);
	declareFunction("pph_var_entry_arg_position", "PPH-VAR-ENTRY-ARG-POSITION", 1, 0, false);
	declareFunction("_csetf_pph_var_entry_var", "_CSETF-PPH-VAR-ENTRY-VAR", 2, 0, false);
	declareFunction("_csetf_pph_var_entry_type", "_CSETF-PPH-VAR-ENTRY-TYPE", 2, 0, false);
	declareFunction("_csetf_pph_var_entry_quantifier", "_CSETF-PPH-VAR-ENTRY-QUANTIFIER", 2, 0, false);
	declareFunction("_csetf_pph_var_entry_single_useP", "_CSETF-PPH-VAR-ENTRY-SINGLE-USE?", 2, 0, false);
	declareFunction("_csetf_pph_var_entry_arg_position", "_CSETF-PPH-VAR-ENTRY-ARG-POSITION", 2, 0, false);
	declareFunction("make_pph_var_entry", "MAKE-PPH-VAR-ENTRY", 0, 1, false);
	declareFunction("visit_defstruct_pph_var_entry", "VISIT-DEFSTRUCT-PPH-VAR-ENTRY", 2, 0, false);
	declareFunction("visit_defstruct_object_pph_var_entry_method", "VISIT-DEFSTRUCT-OBJECT-PPH-VAR-ENTRY-METHOD", 2, 0, false);
	declareFunction("pprint_pph_var_entry", "PPRINT-PPH-VAR-ENTRY", 3, 0, false);
	declareFunction("new_pph_var_entry", "NEW-PPH-VAR-ENTRY", 1, 4, false);
	declareFunction("pph_var_entry_copy", "PPH-VAR-ENTRY-COPY", 1, 0, false);
	declareFunction("set_pph_var_type", "SET-PPH-VAR-TYPE", 2, 0, false);
	declareFunction("set_pph_var_type_map", "SET-PPH-VAR-TYPE-MAP", 2, 0, false);
	declareFunction("set_pph_var_quantifier", "SET-PPH-VAR-QUANTIFIER", 2, 0, false);
	declareFunction("clear_pph_var_types", "CLEAR-PPH-VAR-TYPES", 0, 0, false);
	declareFunction("pph_default_var_type", "PPH-DEFAULT-VAR-TYPE", 0, 0, false);
	declareFunction("pph_registered_vars", "PPH-REGISTERED-VARS", 0, 0, false);
	declareFunction("pph_var_entry", "PPH-VAR-ENTRY", 1, 0, false);
	declareFunction("pph_var_entries", "PPH-VAR-ENTRIES", 1, 0, false);
	declareFunction("pph_var_registeredP", "PPH-VAR-REGISTERED?", 1, 0, false);
	declareFunction("pph_var_registered_as_defaultP", "PPH-VAR-REGISTERED-AS-DEFAULT?", 1, 0, false);
	declareFunction("pph_register_var", "PPH-REGISTER-VAR", 1, 2, false);
	declareFunction("pph_update_var_type", "PPH-UPDATE-VAR-TYPE", 2, 0, false);
	declareFunction("pph_deregister_var", "PPH-DEREGISTER-VAR", 1, 0, false);
	declareFunction("pph_deregister_vars", "PPH-DEREGISTER-VARS", 1, 0, false);
	declareFunction("pph_var_quantifiedP", "PPH-VAR-QUANTIFIED?", 1, 0, false);
	declareFunction("pph_register_var_quantifier", "PPH-REGISTER-VAR-QUANTIFIER", 2, 0, false);
	declareFunction("pph_quantifier_for_operator", "PPH-QUANTIFIER-FOR-OPERATOR", 1, 0, false);
	declareFunction("pph_register_scoped_vars", "PPH-REGISTER-SCOPED-VARS", 1, 0, false);
	declareMacro("with_pph_hypothesized_vars", "WITH-PPH-HYPOTHESIZED-VARS");
	declareFunction("pph_register_query_vars", "PPH-REGISTER-QUERY-VARS", 1, 0, false);
	declareFunction("pph_query_var_p", "PPH-QUERY-VAR-P", 1, 0, false);
	declareFunction("pph_existential_var_p", "PPH-EXISTENTIAL-VAR-P", 1, 0, false);
	declareFunction("pph_note_if_var_is_used_only_once_in_formula", "PPH-NOTE-IF-VAR-IS-USED-ONLY-ONCE-IN-FORMULA", 2, 0, false);
	declareFunction("pph_register_var_as_used_only_once", "PPH-REGISTER-VAR-AS-USED-ONLY-ONCE", 1, 0, false);
	declareFunction("pph_var_used_only_onceP", "PPH-VAR-USED-ONLY-ONCE?", 1, 0, false);
	declareMacro("pph_do_var_entries", "PPH-DO-VAR-ENTRIES");
	declareFunction("pph_var_quantifier", "PPH-VAR-QUANTIFIER", 1, 0, false);
	declareFunction("pph_var_type", "PPH-VAR-TYPE", 1, 0, false);
	declareFunction("pph_cycl_var_type", "PPH-CYCL-VAR-TYPE", 1, 0, false);
	declareFunction("pph_type_arg_position_map", "PPH-TYPE-ARG-POSITION-MAP", 1, 0, false);
	declareFunction("pph_unregistered_variableP", "PPH-UNREGISTERED-VARIABLE?", 1, 0, false);
	declareFunction("pph_duplicate_var_typeP", "PPH-DUPLICATE-VAR-TYPE?", 1, 0, false);
	declareFunction("pph_var_paraphrased_explicitlyP", "PPH-VAR-PARAPHRASED-EXPLICITLY?", 1, 0, false);
	declareFunction("string_mentions_varP", "STRING-MENTIONS-VAR?", 2, 0, false);
	declareFunction("pph_use_explicit_varP", "PPH-USE-EXPLICIT-VAR?", 1, 0, false);
	declareFunction("pph_var_type_previously_explicit_if_mentionedP", "PPH-VAR-TYPE-PREVIOUSLY-EXPLICIT-IF-MENTIONED?", 1, 0, false);
	declareFunction("pph_var_previously_explicitP", "PPH-VAR-PREVIOUSLY-EXPLICIT?", 1, 0, false);
	declareFunction("pph_var_previously_lexifiedP", "PPH-VAR-PREVIOUSLY-LEXIFIED?", 1, 0, false);
	declareFunction("pph_string_is_posP_internal", "PPH-STRING-IS-POS?-INTERNAL", 2, 2, false);
	declareFunction("pph_string_is_posP", "PPH-STRING-IS-POS?", 2, 2, false);
	declareFunction("pph_var_previously_pronounP", "PPH-VAR-PREVIOUSLY-PRONOUN?", 1, 0, false);
	declareFunction("pph_register_vars_as_different", "PPH-REGISTER-VARS-AS-DIFFERENT", 2, 0, false);
	declareFunction("pph_different_varsP", "PPH-DIFFERENT-VARS?", 2, 1, false);
	declareFunction("pph_different_varsP_int", "PPH-DIFFERENT-VARS?-INT", 2, 0, false);
	declareFunction("pph_note_var_type", "PPH-NOTE-VAR-TYPE", 2, 0, false);
	declareFunction("pph_other_vars_with_var_type", "PPH-OTHER-VARS-WITH-VAR-TYPE", 1, 0, false);
	declareFunction("pph_vars_with_type", "PPH-VARS-WITH-TYPE", 1, 0, false);
	declareFunction("pph_var_previously_paraphrased_with_otherP", "PPH-VAR-PREVIOUSLY-PARAPHRASED-WITH-OTHER?", 1, 0, false);
	declareFunction("pph_formula_free_variables_internal", "PPH-FORMULA-FREE-VARIABLES-INTERNAL", 1, 1, false);
	declareFunction("pph_formula_free_variables", "PPH-FORMULA-FREE-VARIABLES", 1, 1, false);
	declareFunction("pph_var_scoped_or_quotedP", "PPH-VAR-SCOPED-OR-QUOTED?", 2, 0, false);
	declareFunction("pph_arg_scoped_or_quotedP", "PPH-ARG-SCOPED-OR-QUOTED?", 2, 0, false);
	declareFunction("pph_quoted_collectionP", "PPH-QUOTED-COLLECTION?", 1, 0, false);
	declareFunction("pph_arg_scopedP", "PPH-ARG-SCOPED?", 2, 0, false);
	declareFunction("pph_operator_arg_scopedP_internal", "PPH-OPERATOR-ARG-SCOPED?-INTERNAL", 3, 0, false);
	declareFunction("pph_operator_arg_scopedP", "PPH-OPERATOR-ARG-SCOPED?", 3, 0, false);
	declareFunction("pph_operator_arg_quotedP_internal", "PPH-OPERATOR-ARG-QUOTED?-INTERNAL", 2, 0, false);
	declareFunction("pph_operator_arg_quotedP", "PPH-OPERATOR-ARG-QUOTED?", 2, 0, false);
	declareFunction("pph_variable_isa_constraints", "PPH-VARIABLE-ISA-CONSTRAINTS", 2, 4, false);
	declareFunction("pph_replace_direct_var_types", "PPH-REPLACE-DIRECT-VAR-TYPES", 3, 0, false);
	declareFunction("pph_clausal_form_internal", "PPH-CLAUSAL-FORM-INTERNAL", 3, 0, false);
	declareFunction("pph_clausal_form", "PPH-CLAUSAL-FORM", 3, 0, false);
	declareFunction("pph_variable_isa_constraints_in_lit_internal", "PPH-VARIABLE-ISA-CONSTRAINTS-IN-LIT-INTERNAL", 4, 2, false);
	declareFunction("pph_variable_isa_constraints_in_lit", "PPH-VARIABLE-ISA-CONSTRAINTS-IN-LIT", 4, 2, false);
	declareFunction("pph_genls", "PPH-GENLS", 1, 1, false);
	declareFunction("pph_variable_isa_constraints_in_subexpressions", "PPH-VARIABLE-ISA-CONSTRAINTS-IN-SUBEXPRESSIONS", 5, 0, false);
	declareFunction("pph_truth_preserving_operatorP_internal", "PPH-TRUTH-PRESERVING-OPERATOR?-INTERNAL", 1, 1, false);
	declareFunction("pph_truth_preserving_operatorP", "PPH-TRUTH-PRESERVING-OPERATOR?", 1, 1, false);
	declareFunction("pph_strip_existentials", "PPH-STRIP-EXISTENTIALS", 1, 1, false);
	declareFunction("pph_delete_genls", "PPH-DELETE-GENLS", 1, 0, false);
	declareFunction("pph_min_variable_isa_constraint_internal", "PPH-MIN-VARIABLE-ISA-CONSTRAINT-INTERNAL", 2, 4, false);
	declareFunction("pph_min_variable_isa_constraint", "PPH-MIN-VARIABLE-ISA-CONSTRAINT", 2, 4, false);
	declareFunction("pph_find_most_specific_internal", "PPH-FIND-MOST-SPECIFIC-INTERNAL", 1, 1, false);
	declareFunction("pph_find_most_specific", "PPH-FIND-MOST-SPECIFIC", 1, 1, false);
	return NIL;
    }

    public static SubLObject init_pph_variable_handling_file() {
	defconstant("*DTP-PPH-VAR-ENTRY*", PPH_VAR_ENTRY);
	defconstant("*PPH-DEFAULT-VAR-TYPE*", $$Thing);
	defparameter("*PPH-HYPOTHESIZED-VARS*", NIL);
	defvar("*PPH-DIFFERENT-VARS*", NIL);
	return NIL;
    }

    public static final SubLObject setup_pph_variable_handling_file_alt() {
	register_method($print_object_method_table$.getGlobalValue(), $dtp_pph_var_entry$.getGlobalValue(), symbol_function(PPH_VAR_ENTRY_PRINT_FUNCTION_TRAMPOLINE));
	def_csetf(PPH_VAR_ENTRY_VAR, _CSETF_PPH_VAR_ENTRY_VAR);
	def_csetf(PPH_VAR_ENTRY_TYPE, _CSETF_PPH_VAR_ENTRY_TYPE);
	def_csetf(PPH_VAR_ENTRY_PARAPHRASES, _CSETF_PPH_VAR_ENTRY_PARAPHRASES);
	def_csetf(PPH_VAR_ENTRY_QUANTIFIER, _CSETF_PPH_VAR_ENTRY_QUANTIFIER);
	def_csetf($sym16$PPH_VAR_ENTRY_SINGLE_USE_, $sym17$_CSETF_PPH_VAR_ENTRY_SINGLE_USE_);
	def_csetf(PPH_VAR_ENTRY_ARG_POSITION, _CSETF_PPH_VAR_ENTRY_ARG_POSITION);
	identity(PPH_VAR_ENTRY);
	memoization_state.note_memoized_function($sym52$PPH_STRING_IS_POS_);
	memoization_state.note_memoized_function(PPH_FORMULA_FREE_VARIABLES);
	memoization_state.note_memoized_function($sym70$PPH_OPERATOR_ARG_SCOPED_);
	memoization_state.note_memoized_function($sym72$PPH_OPERATOR_ARG_QUOTED_);
	memoization_state.note_memoized_function(PPH_CLAUSAL_FORM);
	memoization_state.note_memoized_function(PPH_VARIABLE_ISA_CONSTRAINTS_IN_LIT);
	memoization_state.note_memoized_function($sym94$PPH_TRUTH_PRESERVING_OPERATOR_);
	memoization_state.note_memoized_function(PPH_MIN_VARIABLE_ISA_CONSTRAINT);
	memoization_state.note_memoized_function(PPH_FIND_MOST_SPECIFIC);
	sunit_external.define_test_category($$$Paraphrase_Variable_Handling, UNPROVIDED);
	sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(PPH_VAR_TYPES_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
	sunit_macros.define_test_case_preamble(PPH_VAR_TYPES_TEST_CASE);
	classes.subloop_new_class(PPH_VAR_TYPES_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt110);
	classes.class_set_implements_slot_listeners(PPH_VAR_TYPES_TEST_CASE, NIL);
	classes.subloop_note_class_initialization_function(PPH_VAR_TYPES_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_PPH_VAR_TYPES_TEST_CASE_CLASS);
	classes.subloop_note_instance_initialization_function(PPH_VAR_TYPES_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_PPH_VAR_TYPES_TEST_CASE_INSTANCE);
	subloop_reserved_initialize_pph_var_types_test_case_class(PPH_VAR_TYPES_TEST_CASE);
	sunit_macros.define_test_case_postamble(PPH_VAR_TYPES_TEST_CASE, $str_alt127$pph_variable_handling, $$$cycl, $list_alt129);
	sunit_macros.def_test_method_register(PPH_VAR_TYPES_TEST_CASE, TEST_VAR_TYPES);
	sunit_macros.def_test_method_register(PPH_VAR_TYPES_TEST_CASE, TEST_QUERY_VARS);
	sunit_macros.def_test_method_register(PPH_VAR_TYPES_TEST_CASE, TEST_VAR_PARAPHRASES);
	sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(VARIABLE_ISA_CONSTRAINTS_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
	sunit_macros.define_test_case_preamble(VARIABLE_ISA_CONSTRAINTS_TEST_CASE);
	classes.subloop_new_class(VARIABLE_ISA_CONSTRAINTS_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt134);
	classes.class_set_implements_slot_listeners(VARIABLE_ISA_CONSTRAINTS_TEST_CASE, NIL);
	classes.subloop_note_class_initialization_function(VARIABLE_ISA_CONSTRAINTS_TEST_CASE, $sym135$SUBLOOP_RESERVED_INITIALIZE_VARIABLE_ISA_CONSTRAINTS_TEST_CASE_CL);
	classes.subloop_note_instance_initialization_function(VARIABLE_ISA_CONSTRAINTS_TEST_CASE, $sym136$SUBLOOP_RESERVED_INITIALIZE_VARIABLE_ISA_CONSTRAINTS_TEST_CASE_IN);
	subloop_reserved_initialize_variable_isa_constraints_test_case_class(VARIABLE_ISA_CONSTRAINTS_TEST_CASE);
	sunit_macros.define_test_case_postamble(VARIABLE_ISA_CONSTRAINTS_TEST_CASE, $str_alt127$pph_variable_handling, $$$cycl, $list_alt129);
	sunit_macros.def_test_method_register(VARIABLE_ISA_CONSTRAINTS_TEST_CASE, TEST_VARIABLE_ISA_CONSTRAINTS);
	sunit_external.define_test_suite($str_alt138$Paraphrase_Variable_Handling_Test, $list_alt129, UNPROVIDED, UNPROVIDED);
	return NIL;
    }

    public static SubLObject setup_pph_variable_handling_file() {
	if (SubLFiles.USE_V1) {
	    register_method($print_object_method_table$.getGlobalValue(), $dtp_pph_var_entry$.getGlobalValue(), symbol_function(PPH_VAR_ENTRY_PRINT_FUNCTION_TRAMPOLINE));
	    SubLSpecialOperatorDeclarations.proclaim($list8);
	    def_csetf(PPH_VAR_ENTRY_VAR, _CSETF_PPH_VAR_ENTRY_VAR);
	    def_csetf(PPH_VAR_ENTRY_TYPE, _CSETF_PPH_VAR_ENTRY_TYPE);
	    def_csetf(PPH_VAR_ENTRY_QUANTIFIER, _CSETF_PPH_VAR_ENTRY_QUANTIFIER);
	    def_csetf($sym15$PPH_VAR_ENTRY_SINGLE_USE_, $sym16$_CSETF_PPH_VAR_ENTRY_SINGLE_USE_);
	    def_csetf(PPH_VAR_ENTRY_ARG_POSITION, _CSETF_PPH_VAR_ENTRY_ARG_POSITION);
	    identity(PPH_VAR_ENTRY);
	    register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_pph_var_entry$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PPH_VAR_ENTRY_METHOD));
	    memoization_state.note_memoized_function($sym58$PPH_STRING_IS_POS_);
	    memoization_state.note_memoized_function(PPH_FORMULA_FREE_VARIABLES);
	    memoization_state.note_memoized_function($sym75$PPH_OPERATOR_ARG_SCOPED_);
	    memoization_state.note_memoized_function($sym77$PPH_OPERATOR_ARG_QUOTED_);
	    memoization_state.note_memoized_function(PPH_CLAUSAL_FORM);
	    memoization_state.note_memoized_function(PPH_VARIABLE_ISA_CONSTRAINTS_IN_LIT);
	    memoization_state.note_memoized_function($sym97$PPH_TRUTH_PRESERVING_OPERATOR_);
	    memoization_state.note_memoized_function(PPH_MIN_VARIABLE_ISA_CONSTRAINT);
	    memoization_state.note_memoized_function(PPH_FIND_MOST_SPECIFIC);
	}
	if (SubLFiles.USE_V2) {
	    def_csetf(PPH_VAR_ENTRY_PARAPHRASES, _CSETF_PPH_VAR_ENTRY_PARAPHRASES);
	    def_csetf($sym16$PPH_VAR_ENTRY_SINGLE_USE_, $sym17$_CSETF_PPH_VAR_ENTRY_SINGLE_USE_);
	    memoization_state.note_memoized_function($sym52$PPH_STRING_IS_POS_);
	    memoization_state.note_memoized_function($sym70$PPH_OPERATOR_ARG_SCOPED_);
	    memoization_state.note_memoized_function($sym72$PPH_OPERATOR_ARG_QUOTED_);
	    memoization_state.note_memoized_function($sym94$PPH_TRUTH_PRESERVING_OPERATOR_);
	    sunit_external.define_test_category($$$Paraphrase_Variable_Handling, UNPROVIDED);
	    sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(PPH_VAR_TYPES_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
	    sunit_macros.define_test_case_preamble(PPH_VAR_TYPES_TEST_CASE);
	    classes.subloop_new_class(PPH_VAR_TYPES_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt110);
	    classes.class_set_implements_slot_listeners(PPH_VAR_TYPES_TEST_CASE, NIL);
	    classes.subloop_note_class_initialization_function(PPH_VAR_TYPES_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_PPH_VAR_TYPES_TEST_CASE_CLASS);
	    classes.subloop_note_instance_initialization_function(PPH_VAR_TYPES_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_PPH_VAR_TYPES_TEST_CASE_INSTANCE);
	    subloop_reserved_initialize_pph_var_types_test_case_class(PPH_VAR_TYPES_TEST_CASE);
	    sunit_macros.define_test_case_postamble(PPH_VAR_TYPES_TEST_CASE, $str_alt127$pph_variable_handling, $$$cycl, $list_alt129);
	    sunit_macros.def_test_method_register(PPH_VAR_TYPES_TEST_CASE, TEST_VAR_TYPES);
	    sunit_macros.def_test_method_register(PPH_VAR_TYPES_TEST_CASE, TEST_QUERY_VARS);
	    sunit_macros.def_test_method_register(PPH_VAR_TYPES_TEST_CASE, TEST_VAR_PARAPHRASES);
	    sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(VARIABLE_ISA_CONSTRAINTS_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
	    sunit_macros.define_test_case_preamble(VARIABLE_ISA_CONSTRAINTS_TEST_CASE);
	    classes.subloop_new_class(VARIABLE_ISA_CONSTRAINTS_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt134);
	    classes.class_set_implements_slot_listeners(VARIABLE_ISA_CONSTRAINTS_TEST_CASE, NIL);
	    classes.subloop_note_class_initialization_function(VARIABLE_ISA_CONSTRAINTS_TEST_CASE, $sym135$SUBLOOP_RESERVED_INITIALIZE_VARIABLE_ISA_CONSTRAINTS_TEST_CASE_CL);
	    classes.subloop_note_instance_initialization_function(VARIABLE_ISA_CONSTRAINTS_TEST_CASE, $sym136$SUBLOOP_RESERVED_INITIALIZE_VARIABLE_ISA_CONSTRAINTS_TEST_CASE_IN);
	    subloop_reserved_initialize_variable_isa_constraints_test_case_class(VARIABLE_ISA_CONSTRAINTS_TEST_CASE);
	    sunit_macros.define_test_case_postamble(VARIABLE_ISA_CONSTRAINTS_TEST_CASE, $str_alt127$pph_variable_handling, $$$cycl, $list_alt129);
	    sunit_macros.def_test_method_register(VARIABLE_ISA_CONSTRAINTS_TEST_CASE, TEST_VARIABLE_ISA_CONSTRAINTS);
	    sunit_external.define_test_suite($str_alt138$Paraphrase_Variable_Handling_Test, $list_alt129, UNPROVIDED, UNPROVIDED);
	}
	return NIL;
    }

    public static SubLObject setup_pph_variable_handling_file_Previous() {
	register_method($print_object_method_table$.getGlobalValue(), $dtp_pph_var_entry$.getGlobalValue(), symbol_function(PPH_VAR_ENTRY_PRINT_FUNCTION_TRAMPOLINE));
	SubLSpecialOperatorDeclarations.proclaim($list8);
	def_csetf(PPH_VAR_ENTRY_VAR, _CSETF_PPH_VAR_ENTRY_VAR);
	def_csetf(PPH_VAR_ENTRY_TYPE, _CSETF_PPH_VAR_ENTRY_TYPE);
	def_csetf(PPH_VAR_ENTRY_QUANTIFIER, _CSETF_PPH_VAR_ENTRY_QUANTIFIER);
	def_csetf($sym15$PPH_VAR_ENTRY_SINGLE_USE_, $sym16$_CSETF_PPH_VAR_ENTRY_SINGLE_USE_);
	def_csetf(PPH_VAR_ENTRY_ARG_POSITION, _CSETF_PPH_VAR_ENTRY_ARG_POSITION);
	identity(PPH_VAR_ENTRY);
	register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_pph_var_entry$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PPH_VAR_ENTRY_METHOD));
	memoization_state.note_memoized_function($sym58$PPH_STRING_IS_POS_);
	memoization_state.note_memoized_function(PPH_FORMULA_FREE_VARIABLES);
	memoization_state.note_memoized_function($sym75$PPH_OPERATOR_ARG_SCOPED_);
	memoization_state.note_memoized_function($sym77$PPH_OPERATOR_ARG_QUOTED_);
	memoization_state.note_memoized_function(PPH_CLAUSAL_FORM);
	memoization_state.note_memoized_function(PPH_VARIABLE_ISA_CONSTRAINTS_IN_LIT);
	memoization_state.note_memoized_function($sym97$PPH_TRUTH_PRESERVING_OPERATOR_);
	memoization_state.note_memoized_function(PPH_MIN_VARIABLE_ISA_CONSTRAINT);
	memoization_state.note_memoized_function(PPH_FIND_MOST_SPECIFIC);
	return NIL;
    }

    @Override
    public void declareFunctions() {
	declare_pph_variable_handling_file();
    }

    @Override
    public void initializeVariables() {
	init_pph_variable_handling_file();
    }

    @Override
    public void runTopLevelForms() {
	setup_pph_variable_handling_file();
    }

    static {
    }

    public static final class $pph_var_entry_p$UnaryFunction extends UnaryFunction {
	public $pph_var_entry_p$UnaryFunction() {
	    super(extractFunctionNamed("PPH-VAR-ENTRY-P"));
	}

	@Override
	public SubLObject processItem(final SubLObject arg1) {
	    return pph_var_entry_p(arg1);
	}
    }

    static private final SubLList $list_alt2 = list(makeSymbol("VAR"), makeSymbol("TYPE"), makeSymbol("PARAPHRASES"), makeSymbol("QUANTIFIER"), makeSymbol("SINGLE-USE?"), makeSymbol("ARG-POSITION"));

    static private final SubLList $list_alt3 = list(makeKeyword("VAR"), $TYPE, makeKeyword("PARAPHRASES"), makeKeyword("QUANTIFIER"), makeKeyword("SINGLE-USE?"), makeKeyword("ARG-POSITION"));

    static private final SubLList $list_alt4 = list(makeSymbol("PPH-VAR-ENTRY-VAR"), makeSymbol("PPH-VAR-ENTRY-TYPE"), makeSymbol("PPH-VAR-ENTRY-PARAPHRASES"), makeSymbol("PPH-VAR-ENTRY-QUANTIFIER"), makeSymbol("PPH-VAR-ENTRY-SINGLE-USE?"), makeSymbol("PPH-VAR-ENTRY-ARG-POSITION"));

    static private final SubLList $list_alt5 = list(makeSymbol("_CSETF-PPH-VAR-ENTRY-VAR"), makeSymbol("_CSETF-PPH-VAR-ENTRY-TYPE"), makeSymbol("_CSETF-PPH-VAR-ENTRY-PARAPHRASES"), makeSymbol("_CSETF-PPH-VAR-ENTRY-QUANTIFIER"), makeSymbol("_CSETF-PPH-VAR-ENTRY-SINGLE-USE?"),
	    makeSymbol("_CSETF-PPH-VAR-ENTRY-ARG-POSITION"));

    private static final SubLSymbol PPH_VAR_ENTRY_PARAPHRASES = makeSymbol("PPH-VAR-ENTRY-PARAPHRASES");

    public static final SubLSymbol _CSETF_PPH_VAR_ENTRY_PARAPHRASES = makeSymbol("_CSETF-PPH-VAR-ENTRY-PARAPHRASES");

    static private final SubLSymbol $sym16$PPH_VAR_ENTRY_SINGLE_USE_ = makeSymbol("PPH-VAR-ENTRY-SINGLE-USE?");

    static private final SubLSymbol $sym17$_CSETF_PPH_VAR_ENTRY_SINGLE_USE_ = makeSymbol("_CSETF-PPH-VAR-ENTRY-SINGLE-USE?");

    private static final SubLSymbol $PARAPHRASES = makeKeyword("PARAPHRASES");

    public static final SubLSymbol $kw24$SINGLE_USE_ = makeKeyword("SINGLE-USE?");

    static private final SubLString $str_alt26$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt27$_PPH_error_level_ = makeString("(PPH error level ");

    static private final SubLString $str_alt28$__ = makeString(") ");

    static private final SubLString $str_alt29$_is_not_a_ = makeString(" is not a ");

    static private final SubLString $str_alt30$__PPH_VAR_ENTRY___S__S__S__S_ = makeString("#<PPH-VAR-ENTRY: ~S ~S ~S ~S>");

    private static final SubLSymbol PPH_ARG_POSITION_MAP_P = makeSymbol("PPH-ARG-POSITION-MAP-P");

    static private final SubLString $str_alt33$Non_EL_var___S = makeString("Non EL var: ~S");

    static private final SubLString $str_alt34$Registering__S_as__S___ = makeString("Registering ~S as ~S.~%");

    private static final SubLSymbol PPH_PHRASE_P = makeSymbol("PPH-PHRASE-P");

    static private final SubLList $list_alt37 = list(makeKeyword("UNIVERSAL"), makeKeyword("EXISTENTIAL"), makeKeyword("NO"));

    static private final SubLString $str_alt38$___S_is_not_a_quantifier_keyword_ = makeString("~&~S is not a quantifier keyword among ~S");

    static private final SubLString $str_alt46$__Registering__S_as_a_query_var__ = makeString("~&Registering ~S as a query var.~%");

    static private final SubLList $list_alt48 = list(list(makeSymbol("VAR"), makeSymbol("VAR-ENTRY"), makeSymbol("STOP-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym51$PPH_SPEC_ = makeSymbol("PPH-SPEC?");

    static private final SubLSymbol $sym52$PPH_STRING_IS_POS_ = makeSymbol("PPH-STRING-IS-POS?");

    static private final SubLString $str_alt54$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    public static final SubLSymbol $kw56$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLString $str_alt58$__Noted___S_is_a__S___ = makeString("~&Noted: ~S is a ~S.~%");

    static private final SubLString $str_alt60$_other_ = makeString(" other ");

    static private final SubLString $str_alt61$other_ = makeString("other ");

    static private final SubLString $str_alt62$_another = makeString(" another");

    static private final SubLSymbol $sym65$EL_VAR_ = makeSymbol("EL-VAR?");

    static private final SubLList $list_alt67 = list(ONE_INTEGER);

    static private final SubLList $list_alt68 = list(reader_make_constant_shell("isa"), makeKeyword("ANYTHING"), list($TEST, makeSymbol("PPH-QUOTED-COLLECTION?")));

    static private final SubLSymbol $sym70$PPH_OPERATOR_ARG_SCOPED_ = makeSymbol("PPH-OPERATOR-ARG-SCOPED?");

    static private final SubLSymbol $sym72$PPH_OPERATOR_ARG_QUOTED_ = makeSymbol("PPH-OPERATOR-ARG-QUOTED?");

    static private final SubLSymbol $sym73$PPH_VALID_VAR_TYPE_ = makeSymbol("PPH-VALID-VAR-TYPE?");

    static private final SubLList $list_alt76 = list(makeSymbol("NEG-LITS"), makeSymbol("POS-LITS"));

    static private final SubLSymbol $sym78$SPECS_FN_NAT_ = makeSymbol("SPECS-FN-NAT?");

    static private final SubLString $str_alt79$Removing_non_SpecsFn_terms_from__ = makeString("Removing non-SpecsFn terms from ~S");

    static private final SubLSymbol $sym80$PPH_GENERALITY_ESTIMATE_ = makeSymbol("PPH-GENERALITY-ESTIMATE<");

    static private final SubLList $list_alt86 = list(makeSymbol("TYPE"), makeSymbol("TARGET"), makeSymbol("CONSTRAINT-MT"));

    static private final SubLList $list_alt92 = list(reader_make_constant_shell("genls"), TWO_INTEGER);

    static private final SubLSymbol $sym94$PPH_TRUTH_PRESERVING_OPERATOR_ = makeSymbol("PPH-TRUTH-PRESERVING-OPERATOR?");

    static private final SubLList $list_alt95 = list(reader_make_constant_shell("and"), reader_make_constant_shell("thereExists"), reader_make_constant_shell("forAll"));

    static private final SubLList $list_alt96 = list(reader_make_constant_shell("TheSetOf"));

    static private final SubLString $str_alt104$Constraints_on__S_are__S_____choo = makeString("Constraints on ~S are ~S;~%, choosing ~S~%");

    static private final SubLString $$$Paraphrase_Variable_Handling = makeString("Paraphrase Variable Handling");

    private static final SubLSymbol PPH_VAR_TYPES_TEST_CASE = makeSymbol("PPH-VAR-TYPES-TEST-CASE");

    static private final SubLList $list_alt110 = list(list(makeSymbol("TEST-VAR"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DUPLICATE-VAR"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-VAR-TYPES"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-VAR-PARAPHRASES"), NIL, makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-QUERY-VARS"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol DUPLICATE_VAR = makeSymbol("DUPLICATE-VAR");

    private static final SubLSymbol TEST_VAR = makeSymbol("TEST-VAR");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PPH_VAR_TYPES_TEST_CASE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PPH-VAR-TYPES-TEST-CASE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PPH_VAR_TYPES_TEST_CASE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PPH-VAR-TYPES-TEST-CASE-INSTANCE");

    static private final SubLString $str_alt127$pph_variable_handling = makeString("pph-variable-handling");

    static private final SubLString $$$cycl = makeString("cycl");

    static private final SubLList $list_alt129 = list(makeString("Paraphrase Variable Handling"));

    private static final SubLSymbol TEST_VAR_TYPES = makeSymbol("TEST-VAR-TYPES");

    private static final SubLSymbol TEST_QUERY_VARS = makeSymbol("TEST-QUERY-VARS");

    private static final SubLSymbol TEST_VAR_PARAPHRASES = makeSymbol("TEST-VAR-PARAPHRASES");

    private static final SubLSymbol VARIABLE_ISA_CONSTRAINTS_TEST_CASE = makeSymbol("VARIABLE-ISA-CONSTRAINTS-TEST-CASE");

    static private final SubLList $list_alt134 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-VARIABLE-ISA-CONSTRAINTS"), NIL, makeKeyword("PROTECTED")));

    static private final SubLSymbol $sym135$SUBLOOP_RESERVED_INITIALIZE_VARIABLE_ISA_CONSTRAINTS_TEST_CASE_CL = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VARIABLE-ISA-CONSTRAINTS-TEST-CASE-CLASS");

    static private final SubLSymbol $sym136$SUBLOOP_RESERVED_INITIALIZE_VARIABLE_ISA_CONSTRAINTS_TEST_CASE_IN = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VARIABLE-ISA-CONSTRAINTS-TEST-CASE-INSTANCE");

    private static final SubLSymbol TEST_VARIABLE_ISA_CONSTRAINTS = makeSymbol("TEST-VARIABLE-ISA-CONSTRAINTS");

    static private final SubLString $str_alt138$Paraphrase_Variable_Handling_Test = makeString("Paraphrase Variable Handling Test Suite");

    // // Definitions
    public static final class $pph_var_entry_native extends SubLStructNative {
	public SubLStructDecl getStructDecl() {
	    return $pph_var_entry_native.structDecl;
	}

	public SubLObject getField2() {
	    return $var;
	}

	public SubLObject getField3() {
	    return $type;
	}

	public SubLObject getField4() {
	    return $paraphrases;
	}

	public SubLObject getField5() {
	    return $quantifier;
	}

	public SubLObject getField6() {
	    return $single_useP;
	}

	public SubLObject getField7() {
	    return $arg_position;
	}

	public SubLObject setField2(SubLObject value) {
	    return $var = value;
	}

	public SubLObject setField3(SubLObject value) {
	    return $type = value;
	}

	public SubLObject setField4(SubLObject value) {
	    return $paraphrases = value;
	}

	public SubLObject setField5(SubLObject value) {
	    return $quantifier = value;
	}

	public SubLObject setField6(SubLObject value) {
	    return $single_useP = value;
	}

	public SubLObject setField7(SubLObject value) {
	    return $arg_position = value;
	}

	public SubLObject $var = Lisp.NIL;

	public SubLObject $type = Lisp.NIL;

	public SubLObject $paraphrases = Lisp.NIL;

	public SubLObject $quantifier = Lisp.NIL;

	public SubLObject $single_useP = Lisp.NIL;

	public SubLObject $arg_position = Lisp.NIL;

	private static final SubLStructDeclNative structDecl = makeStructDeclNative($pph_var_entry_native.class, PPH_VAR_ENTRY, PPH_VAR_ENTRY_P, $list_alt2, $list_alt3, new String[] { "$var", "$type", "$paraphrases", "$quantifier", "$single_useP", "$arg_position" }, $list_alt4, $list_alt5,
		PPRINT_PPH_VAR_ENTRY);
    }
}

/**
 * Total time: 474 ms
 */

/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      PPH-VARIABLE-HANDLING
 *  source file: /cyc/top/cycl/pph-variable-handling.lisp
 *  created:     2019/07/03 17:38:18
 */
class pph_variable_handling_v2 extends SubLTranslatedFile implements V12 {
    // // Constructor
    private pph_variable_handling_v2() {
    }

    public static final SubLFile me = new pph_variable_handling();

    public static final String myName = "com.cyc.cycjava.cycl.pph_variable_handling";

    // defconstant
    public static final SubLSymbol $dtp_pph_var_entry$ = makeSymbol("*DTP-PPH-VAR-ENTRY*");

    public static final SubLObject pph_var_entry_print_function_trampoline(SubLObject v_object, SubLObject stream) {
	pprint_pph_var_entry(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject pph_var_entry_p(SubLObject v_object) {
	return v_object.getClass() == pph_variable_handling.$pph_var_entry_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $pph_var_entry_p$UnaryFunction extends UnaryFunction {
	public $pph_var_entry_p$UnaryFunction() {
	    super(extractFunctionNamed("PPH-VAR-ENTRY-P"));
	}

	public SubLObject processItem(SubLObject arg1) {
	    return pph_var_entry_p(arg1);
	}
    }

    public static final SubLObject pph_var_entry_var(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PPH_VAR_ENTRY_P);
	return v_object.getField2();
    }

    public static final SubLObject pph_var_entry_type(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PPH_VAR_ENTRY_P);
	return v_object.getField3();
    }

    public static final SubLObject pph_var_entry_paraphrases(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PPH_VAR_ENTRY_P);
	return v_object.getField4();
    }

    public static final SubLObject pph_var_entry_quantifier(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PPH_VAR_ENTRY_P);
	return v_object.getField5();
    }

    public static final SubLObject pph_var_entry_single_useP(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PPH_VAR_ENTRY_P);
	return v_object.getField6();
    }

    public static final SubLObject pph_var_entry_arg_position(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PPH_VAR_ENTRY_P);
	return v_object.getField7();
    }

    public static final SubLObject _csetf_pph_var_entry_var(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PPH_VAR_ENTRY_P);
	return v_object.setField2(value);
    }

    public static final SubLObject _csetf_pph_var_entry_type(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PPH_VAR_ENTRY_P);
	return v_object.setField3(value);
    }

    public static final SubLObject _csetf_pph_var_entry_paraphrases(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PPH_VAR_ENTRY_P);
	return v_object.setField4(value);
    }

    public static final SubLObject _csetf_pph_var_entry_quantifier(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PPH_VAR_ENTRY_P);
	return v_object.setField5(value);
    }

    public static final SubLObject _csetf_pph_var_entry_single_useP(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PPH_VAR_ENTRY_P);
	return v_object.setField6(value);
    }

    public static final SubLObject _csetf_pph_var_entry_arg_position(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PPH_VAR_ENTRY_P);
	return v_object.setField7(value);
    }

    public static final SubLObject make_pph_var_entry(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	{
	    SubLObject v_new = new pph_variable_handling.$pph_var_entry_native();
	    SubLObject next = NIL;
	    for (next = arglist; NIL != next; next = cddr(next)) {
		{
		    SubLObject current_arg = next.first();
		    SubLObject current_value = cadr(next);
		    SubLObject pcase_var = current_arg;
		    if (pcase_var.eql($VAR)) {
			_csetf_pph_var_entry_var(v_new, current_value);
		    } else if (pcase_var.eql($TYPE)) {
			_csetf_pph_var_entry_type(v_new, current_value);
		    } else if (pcase_var.eql($PARAPHRASES)) {
			_csetf_pph_var_entry_paraphrases(v_new, current_value);
		    } else if (pcase_var.eql($QUANTIFIER)) {
			_csetf_pph_var_entry_quantifier(v_new, current_value);
		    } else if (pcase_var.eql($kw24$SINGLE_USE_)) {
			_csetf_pph_var_entry_single_useP(v_new, current_value);
		    } else if (pcase_var.eql($ARG_POSITION)) {
			_csetf_pph_var_entry_arg_position(v_new, current_value);
		    } else {
			Errors.error($str_alt26$Invalid_slot__S_for_construction_, current_arg);
		    }

		}
	    }
	    return v_new;
	}
    }

    public static final SubLObject pprint_pph_var_entry(SubLObject var_entry, SubLObject stream, SubLObject depth) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_var_entry_p(var_entry)))) {
		{
		    SubLObject new_format_string = cconcatenate($str_alt27$_PPH_error_level_,
			    new SubLObject[] { format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt28$__, format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(var_entry), new SubLObject[] { $str_alt29$_is_not_a_, format_nil.format_nil_s_no_copy(PPH_VAR_ENTRY_P) })) });
		    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
		}
	    }
	    format(stream, $str_alt30$__PPH_VAR_ENTRY___S__S__S__S_, new SubLObject[] { pph_var_entry_var(var_entry), pph_var_entry_type(var_entry), pph_var_entry_arg_position(var_entry), pph_var_entry_paraphrases(var_entry), pph_var_entry_quantifier(var_entry) });
	    return var_entry;
	}
    }

    public static final SubLObject new_pph_var_entry(SubLObject var, SubLObject type, SubLObject type_map, SubLObject paraphrases, SubLObject quantifier, SubLObject single_useP) {
	if (type == UNPROVIDED) {
	    type = pph_default_var_type();
	}
	if (type_map == UNPROVIDED) {
	    type_map = pph_utilities.pph_new_empty_map();
	}
	if (paraphrases == UNPROVIDED) {
	    paraphrases = NIL;
	}
	if (quantifier == UNPROVIDED) {
	    quantifier = NIL;
	}
	if (single_useP == UNPROVIDED) {
	    single_useP = NIL;
	}
	{
	    SubLObject new_var_entry = make_pph_var_entry(UNPROVIDED);
	    _csetf_pph_var_entry_var(new_var_entry, var);
	    _csetf_pph_var_entry_type(new_var_entry, type);
	    _csetf_pph_var_entry_arg_position(new_var_entry, type_map);
	    _csetf_pph_var_entry_paraphrases(new_var_entry, paraphrases);
	    _csetf_pph_var_entry_quantifier(new_var_entry, quantifier);
	    _csetf_pph_var_entry_single_useP(new_var_entry, single_useP);
	    return new_var_entry;
	}
    }

    public static final SubLObject pph_var_entry_copy(SubLObject old_entry) {
	{
	    SubLObject var = pph_var_entry_var(old_entry);
	    SubLObject type = pph_var_entry_type(old_entry);
	    SubLObject arg_position = pph_var_entry_arg_position(old_entry);
	    SubLObject paraphrases = pph_var_entry_paraphrases(old_entry);
	    SubLObject quantifier = pph_var_entry_quantifier(old_entry);
	    SubLObject single_useP = pph_var_entry_single_useP(old_entry);
	    return new_pph_var_entry(var, type, arg_position, paraphrases, quantifier, single_useP);
	}
    }

    public static final SubLObject set_pph_var_type(SubLObject var_entry, SubLObject type) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_var_entry_p(var_entry)))) {
		{
		    SubLObject new_format_string = cconcatenate($str_alt27$_PPH_error_level_,
			    new SubLObject[] { format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt28$__, format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(var_entry), new SubLObject[] { $str_alt29$_is_not_a_, format_nil.format_nil_s_no_copy(PPH_VAR_ENTRY_P) })) });
		    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
		}
	    }
	    _csetf_pph_var_entry_type(var_entry, type);
	    return var_entry;
	}
    }

    public static final SubLObject set_pph_var_type_map(SubLObject var_entry, SubLObject map) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_var_entry_p(var_entry)))) {
		{
		    SubLObject new_format_string = cconcatenate($str_alt27$_PPH_error_level_,
			    new SubLObject[] { format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt28$__, format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(var_entry), new SubLObject[] { $str_alt29$_is_not_a_, format_nil.format_nil_s_no_copy(PPH_VAR_ENTRY_P) })) });
		    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
		}
	    }
	    if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_utilities.pph_arg_position_map_p(map)))) {
		{
		    SubLObject new_format_string = cconcatenate($str_alt27$_PPH_error_level_,
			    new SubLObject[] { format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt28$__, format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(map), new SubLObject[] { $str_alt29$_is_not_a_, format_nil.format_nil_s_no_copy(PPH_ARG_POSITION_MAP_P) })) });
		    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
		}
	    }
	    _csetf_pph_var_entry_arg_position(var_entry, map);
	    return var_entry;
	}
    }

    public static final SubLObject set_pph_var_paraphrases(SubLObject var_entry, SubLObject paraphrases) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_var_entry_p(var_entry)))) {
		{
		    SubLObject new_format_string = cconcatenate($str_alt27$_PPH_error_level_,
			    new SubLObject[] { format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt28$__, format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(var_entry), new SubLObject[] { $str_alt29$_is_not_a_, format_nil.format_nil_s_no_copy(PPH_VAR_ENTRY_P) })) });
		    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
		}
	    }
	    _csetf_pph_var_entry_paraphrases(var_entry, paraphrases);
	    return var_entry;
	}
    }

    public static final SubLObject set_pph_var_quantifier(SubLObject var_entry, SubLObject quantifier) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_var_entry_p(var_entry)))) {
		{
		    SubLObject new_format_string = cconcatenate($str_alt27$_PPH_error_level_,
			    new SubLObject[] { format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt28$__, format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(var_entry), new SubLObject[] { $str_alt29$_is_not_a_, format_nil.format_nil_s_no_copy(PPH_VAR_ENTRY_P) })) });
		    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
		}
	    }
	    _csetf_pph_var_entry_quantifier(var_entry, quantifier);
	    return var_entry;
	}
    }

    public static final SubLObject clear_pph_var_types() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    dictionary.clear_dictionary(pph_vars.$pph_var_types$.getDynamicValue(thread));
	    return pph_vars.$pph_var_types$.getDynamicValue(thread);
	}
    }

    /**
     * What something is when we don't know what it is.
     */
    // defconstant
    private static final SubLSymbol $pph_default_var_type$ = makeSymbol("*PPH-DEFAULT-VAR-TYPE*");

    public static final SubLObject pph_default_var_type() {
	return $pph_default_var_type$.getGlobalValue();
    }

    public static final SubLObject pph_registered_vars() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    return dictionary.dictionary_keys(pph_vars.$pph_var_types$.getDynamicValue(thread));
	}
    }

    /**
     * The entry in *pph-var-types* associated with VAR
     */
    public static final SubLObject pph_var_entry(SubLObject var) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL == cycl_variables.el_varP(var)) {
		{
		    SubLObject new_format_string = cconcatenate($str_alt27$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt28$__, format_nil.format_nil_a_no_copy($str_alt33$Non_EL_var___S) });
		    pph_error.pph_handle_error(new_format_string, list(var));
		}
	    }
	    return NIL != cycl_variables.el_varP(var) ? ((SubLObject) (dictionary.dictionary_lookup(pph_vars.$pph_var_types$.getDynamicValue(thread), var, UNPROVIDED))) : NIL;
	}
    }

    public static final SubLObject pph_var_entries(SubLObject vars) {
	return Mapping.mapcar(PPH_VAR_ENTRY, vars);
    }

    /**
     *
     *
     * @return BOOLEAN; Is VAR registered?
     */
    public static final SubLObject pph_var_registeredP(SubLObject var) {
	return makeBoolean((NIL != pph_vars.pph_tracking_var_types_p()) && (NIL != pph_var_entry(var)));
    }

    /**
     *
     *
     * @return BOOLEAN; Is VAR registered as the default type?
     */
    public static final SubLObject pph_var_registered_as_defaultP(SubLObject var) {
	return eq(pph_var_type(var), pph_default_var_type());
    }

    /**
     * Note that VAR should be paraphrased as an instance of TYPE.
     */
    public static final SubLObject pph_register_var(SubLObject var, SubLObject type, SubLObject type_map) {
	if (type == UNPROVIDED) {
	    type = pph_default_var_type();
	}
	if (type_map == UNPROVIDED) {
	    type_map = pph_utilities.pph_new_empty_map();
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
		format(T, $str_alt34$Registering__S_as__S___, var, type);
	    }
	    if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_utilities.pph_arg_position_map_p(type_map)))) {
		{
		    SubLObject new_format_string = cconcatenate($str_alt27$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt28$__,
			    format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(type_map), new SubLObject[] { $str_alt29$_is_not_a_, format_nil.format_nil_s_no_copy(PPH_ARG_POSITION_MAP_P) })) });
		    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
		}
	    }
	    {
		SubLObject existing = pph_var_entry(var);
		SubLObject v_new = (NIL != existing) ? ((SubLObject) (pph_var_entry_copy(existing))) : new_pph_var_entry(var, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		set_pph_var_type(v_new, type);
		set_pph_var_type_map(v_new, type_map);
		dictionary.dictionary_enter(pph_vars.$pph_var_types$.getDynamicValue(thread), var, v_new);
	    }
	    pph_note_var_type(var, type);
	    return pph_vars.$pph_var_types$.getDynamicValue(thread);
	}
    }

    /**
     * Note that VAR should be paraphrased as an instance of TYPE, preserving all
     * other existing typing information on VAR.
     */
    public static final SubLObject pph_update_var_type(SubLObject var, SubLObject type) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject existing = pph_var_entry(var);
		SubLObject v_new = (NIL != existing) ? ((SubLObject) (pph_var_entry_copy(existing))) : new_pph_var_entry(var, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		set_pph_var_type(v_new, type);
		if (NIL == existing) {
		    set_pph_var_type_map(v_new, pph_utilities.pph_new_empty_map());
		}
		dictionary.dictionary_enter(pph_vars.$pph_var_types$.getDynamicValue(thread), var, v_new);
	    }
	    pph_note_var_type(var, type);
	    return pph_vars.$pph_var_types$.getDynamicValue(thread);
	}
    }

    public static final SubLObject pph_deregister_var(SubLObject var) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    dictionary.dictionary_remove(pph_vars.$pph_var_types$.getDynamicValue(thread), var);
	    return pph_vars.$pph_var_types$.getDynamicValue(thread);
	}
    }

    public static final SubLObject pph_deregister_vars(SubLObject vars) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    Mapping.mapcar(PPH_DEREGISTER_VAR, vars);
	    return pph_vars.$pph_var_types$.getDynamicValue(thread);
	}
    }

    /**
     * Deregister PARPAHRASE as a (used) paraphrase of VAR.
     */
    public static final SubLObject pph_deregister_var_paraphrase(SubLObject var, SubLObject paraphrase) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_phrase.pph_phrase_p(paraphrase, UNPROVIDED)))) {
		{
		    SubLObject new_format_string = cconcatenate($str_alt27$_PPH_error_level_,
			    new SubLObject[] { format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt28$__, format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(paraphrase), new SubLObject[] { $str_alt29$_is_not_a_, format_nil.format_nil_s_no_copy(PPH_PHRASE_P) })) });
		    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
		}
	    }
	    {
		SubLObject var_entry = pph_var_entry(var);
		if (NIL != var_entry) {
		    {
			SubLObject existing_paraphrases = pph_var_entry_paraphrases(var_entry);
			set_pph_var_paraphrases(var_entry, delete(paraphrase, existing_paraphrases, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
		    }
		}
	    }
	    return pph_vars.$pph_var_types$.getDynamicValue(thread);
	}
    }

    /**
     * Register PARPAHRASE as a (used) paraphrase of VAR.
     */
    public static final SubLObject pph_register_var_paraphrase(SubLObject var, SubLObject paraphrase) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_phrase.pph_phrase_p(paraphrase, UNPROVIDED)))) {
		{
		    SubLObject new_format_string = cconcatenate($str_alt27$_PPH_error_level_,
			    new SubLObject[] { format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt28$__, format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(paraphrase), new SubLObject[] { $str_alt29$_is_not_a_, format_nil.format_nil_s_no_copy(PPH_PHRASE_P) })) });
		    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
		}
	    }
	    {
		SubLObject existing = pph_var_entry(var);
		SubLObject v_new = (NIL != existing) ? ((SubLObject) (pph_var_entry_copy(existing))) : new_pph_var_entry(var, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		SubLObject paraphrases = cons(paraphrase, remove(paraphrase, pph_var_entry_paraphrases(v_new), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
		set_pph_var_paraphrases(v_new, paraphrases);
		dictionary.dictionary_enter(pph_vars.$pph_var_types$.getDynamicValue(thread), var, v_new);
	    }
	    return pph_vars.$pph_var_types$.getDynamicValue(thread);
	}
    }

    public static final SubLObject pph_var_quantifiedP(SubLObject var) {
	return makeBoolean((NIL != pph_var_registeredP(var)) && (NIL != member(pph_var_quantifier(var), $list_alt37, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject pph_register_var_quantifier(SubLObject var, SubLObject quantifier) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL == pph_vars.pph_quantifier_keyword_p(quantifier)) {
		if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
		    Errors.warn($str_alt38$___S_is_not_a_quantifier_keyword_, quantifier, pph_vars.pph_quantifier_keywords());
		}
		return NIL;
	    }
	    {
		SubLObject existing = pph_var_entry(var);
		SubLObject v_new = (NIL != existing) ? ((SubLObject) (pph_var_entry_copy(existing))) : new_pph_var_entry(var, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		set_pph_var_quantifier(v_new, quantifier);
		dictionary.dictionary_enter(pph_vars.$pph_var_types$.getDynamicValue(thread), var, v_new);
	    }
	    return pph_vars.$pph_var_types$.getDynamicValue(thread);
	}
    }

    /**
     *
     *
     * @param OPERATOR;
     * 		CycL operator with scoping args.
     */
    public static final SubLObject pph_quantifier_for_operator(SubLObject operator) {
	if (NIL != pph_utilities.pph_isaP(operator, $$ExistentialQuantifier, UNPROVIDED)) {
	    return $EXISTENTIAL;
	} else if (operator == $$forAll) {
	    return $UNIVERSAL;
	} else {
	    return $SCOPED;
	}

    }

    public static final SubLObject pph_register_scoped_vars(SubLObject formula) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if ((NIL != el_utilities.el_formula_p(formula)) && (NIL != kb_indexing_datastructures.indexed_term_p(cycl_utilities.formula_arg0(formula)))) {
		{
		    SubLObject operator = cycl_utilities.formula_arg0(formula);
		    SubLObject scoping_args = kb_accessors.scoping_args(operator, pph_vars.$pph_domain_mt$.getDynamicValue(thread));
		    SubLObject quantifier = (NIL != scoping_args) ? ((SubLObject) (pph_quantifier_for_operator(operator))) : NIL;
		    SubLObject argnum = ZERO_INTEGER;
		    SubLObject args = cycl_utilities.formula_args(formula, $IGNORE);
		    SubLObject cdolist_list_var = args;
		    SubLObject arg = NIL;
		    for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), arg = cdolist_list_var.first()) {
			argnum = add(argnum, ONE_INTEGER);
			if (NIL != member(argnum, scoping_args, UNPROVIDED, UNPROVIDED)) {
			    if ((NIL != cycl_variables.el_varP(arg)) && (NIL == pph_var_quantifier(arg))) {
				pph_register_var_quantifier(arg, quantifier);
			    }
			} else if (NIL != el_utilities.el_formula_p(arg)) {
			    pph_register_scoped_vars(arg);
			}

		    }
		}
	    }
	    return formula;
	}
    }

    /**
     * Unbound vars in a query are requests for bindings, so we shouldn't give
     * them universal quantification.
     */
    public static final SubLObject pph_register_query_vars(SubLObject query_formula) {
	{
	    SubLObject query_vars = remove_if(PPH_EXISTENTIAL_VAR_P, pph_formula_free_variables(query_formula, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    if (NIL != pph_question.pph_hypothesize_antecedent_varsP(query_formula)) {
		{
		    SubLObject antecedent_vars = pph_utilities.pph_vars_to_quantify(cycl_utilities.formula_arg1(query_formula, UNPROVIDED));
		    query_vars = set_difference(query_vars, antecedent_vars, UNPROVIDED, UNPROVIDED);
		}
	    }
	    {
		SubLObject cdolist_list_var = query_vars;
		SubLObject query_var = NIL;
		for (query_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), query_var = cdolist_list_var.first()) {
		    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
			format(T, $str_alt46$__Registering__S_as_a_query_var__, query_var);
		    }
		    pph_register_var_quantifier(query_var, $QUERY);
		}
	    }
	    return query_vars;
	}
    }

    public static final SubLObject pph_query_var_p(SubLObject var) {
	return makeBoolean((NIL != cycl_variables.el_varP(var)) && ($QUERY == pph_var_quantifier(var)));
    }

    public static final SubLObject pph_existential_var_p(SubLObject var) {
	return eq($EXISTENTIAL, pph_var_quantifier(var));
    }

    public static final SubLObject pph_note_if_var_is_used_only_once_in_formula(SubLObject var, SubLObject formula) {
	{
	    SubLObject duplicateP = list_utilities.tree_countG(var, pph_strip_existentials(formula, UNPROVIDED), ONE_INTEGER, UNPROVIDED, UNPROVIDED);
	    if (NIL == duplicateP) {
		pph_register_var_as_used_only_once(var);
	    }
	    return duplicateP;
	}
    }

    public static final SubLObject pph_register_var_as_used_only_once(SubLObject var) {
	{
	    SubLObject entry = pph_var_entry(var);
	    _csetf_pph_var_entry_single_useP(entry, T);
	    return entry;
	}
    }

    public static final SubLObject pph_var_used_only_onceP(SubLObject var) {
	{
	    SubLObject entry = pph_var_entry(var);
	    return NIL != entry ? ((SubLObject) (pph_var_entry_single_useP(entry))) : NIL;
	}
    }

    /**
     * Execute BODY for each VAR-ENTRY in *pph-var-types* until STOP-VAR
     */
    public static final SubLObject pph_do_var_entries(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    destructuring_bind_must_consp(current, datum, $list_alt48);
	    {
		SubLObject temp = current.rest();
		current = current.first();
		{
		    SubLObject var = NIL;
		    SubLObject var_entry = NIL;
		    SubLObject stop_var = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt48);
		    var = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt48);
		    var_entry = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt48);
		    stop_var = current.first();
		    current = current.rest();
		    if (NIL == current) {
			current = temp;
			{
			    SubLObject body = current;
			    return listS(DO_DICTIONARY, list(var, var_entry, $pph_var_types$, stop_var), append(body, NIL));
			}
		    } else {
			cdestructuring_bind_error(datum, $list_alt48);
		    }
		}
	    }
	}
	return NIL;
    }

    public static final SubLObject pph_var_quantifier(SubLObject var) {
	{
	    SubLObject entry = pph_var_entry(var);
	    return NIL != entry ? ((SubLObject) (pph_var_entry_quantifier(entry))) : NIL;
	}
    }

    /**
     *
     *
     * @return CycL collection or registered var that was / will be used to generate a noun for VAR.
     */
    public static final SubLObject pph_var_type(SubLObject var) {
	{
	    SubLObject entry = pph_var_entry(var);
	    return NIL != entry ? ((SubLObject) (pph_var_entry_type(entry))) : pph_default_var_type();
	}
    }

    /**
     *
     *
     * @return CycL collection that was / will be used to generate a noun for VAR.
     */
    public static final SubLObject pph_cycl_var_type(SubLObject var) {
	{
	    SubLObject entry = pph_var_entry(var);
	    SubLObject var_type = (NIL != entry) ? ((SubLObject) (pph_var_entry_type(entry))) : pph_default_var_type();
	    while (NIL != cycl_variables.el_varP(var_type)) {
		{
		    SubLObject var_type_type = pph_var_type(var_type);
		    if (NIL != pph_utilities.specs_fn_natP(var_type_type)) {
			var_type = cycl_utilities.nat_arg1(var_type_type, UNPROVIDED);
		    } else {
			var_type = pph_default_var_type();
		    }
		}
	    }
	    return var_type;
	}
    }

    /**
     *
     *
     * @return arg position map for the term that denotes the *type* of VAR in the original
    sentence being paraphrased, if known.
     */
    public static final SubLObject pph_type_arg_position_map(SubLObject var) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject entry = pph_var_entry(var);
		SubLObject type_map = (NIL != entry) ? ((SubLObject) (pph_var_entry_arg_position(entry))) : pph_utilities.pph_new_empty_map();
		if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_utilities.pph_arg_position_map_p(type_map)))) {
		    {
			SubLObject new_format_string = cconcatenate($str_alt27$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt28$__,
				format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(type_map), new SubLObject[] { $str_alt29$_is_not_a_, format_nil.format_nil_s_no_copy(PPH_ARG_POSITION_MAP_P) })) });
			pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
		    }
		}
		return type_map;
	    }
	}
    }

    /**
     *
     *
     * @return LISTP of (used) paraphrases of VAR.
     */
    public static final SubLObject pph_var_paraphrases(SubLObject var) {
	{
	    SubLObject entry = pph_var_entry(var);
	    return NIL != entry ? ((SubLObject) (pph_var_entry_paraphrases(entry))) : NIL;
	}
    }

    /**
     *
     *
     * @unknown only for debugging purposes
     */
    public static final SubLObject pph_clear_var_paraphrases(SubLObject var) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject entry = pph_var_entry(var);
		if (NIL != pph_var_entry_p(entry)) {
		    set_pph_var_paraphrases(entry, NIL);
		    dictionary.dictionary_enter(pph_vars.$pph_var_types$.getDynamicValue(thread), var, entry);
		}
		return entry;
	    }
	}
    }

    /**
     *
     *
     * @unknown debugging only
     */
    public static final SubLObject pph_clear_all_var_paraphrases() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(pph_vars.$pph_var_types$.getDynamicValue(thread)));
		while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
		    thread.resetMultipleValues();
		    {
			SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
			SubLObject entry = thread.secondMultipleValue();
			thread.resetMultipleValues();
			set_pph_var_paraphrases(entry, NIL);
			iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
		    }
		}
		dictionary_contents.do_dictionary_contents_finalize(iteration_state);
	    }
	    return pph_vars.$pph_var_types$.getDynamicValue(thread);
	}
    }

    /**
     *
     *
     * @return a variable that has been paraphrased with PARAPHRASE, if one exists.
     */
    public static final SubLObject pph_var_from_paraphrase(SubLObject paraphrase) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject var = NIL;
		SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(pph_vars.$pph_var_types$.getDynamicValue(thread)));
		while (!((NIL != var) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
		    thread.resetMultipleValues();
		    {
			SubLObject var_entry_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
			SubLObject entry = thread.secondMultipleValue();
			thread.resetMultipleValues();
			{
			    SubLObject paraphrases = pph_var_entry_paraphrases(entry);
			    if (NIL == var) {
				{
				    SubLObject csome_list_var = paraphrases;
				    SubLObject var_paraphrase = NIL;
				    for (var_paraphrase = csome_list_var.first(); !((NIL != var) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), var_paraphrase = csome_list_var.first()) {
					if (paraphrase.equalp(var_paraphrase)) {
					    var = var_entry_var;
					}
				    }
				}
			    }
			}
			iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
		    }
		}
		dictionary_contents.do_dictionary_contents_finalize(iteration_state);
		return var;
	    }
	}
    }

    /**
     *
     *
     * @return BOOLEAN; Is OBJ an unregistered variable?
     */
    public static final SubLObject pph_unregistered_variableP(SubLObject obj) {
	return makeBoolean((NIL != cycl_variables.el_varP(obj)) && (NIL == pph_var_registeredP(obj)));
    }

    /**
     *
     *
     * @return BOOLEAN; Is TYPE the type of more than one registered variable?
     */
    public static final SubLObject pph_duplicate_var_typeP(SubLObject type) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    return makeBoolean((NIL != pph_vars.pph_tracking_var_types_p())
		    && count(type, Mapping.mapcar(symbol_function(PPH_VAR_ENTRY_TYPE), dictionary.dictionary_values(pph_vars.$pph_var_types$.getDynamicValue(thread))), symbol_function($sym51$PPH_SPEC_), UNPROVIDED, UNPROVIDED, UNPROVIDED).numG(ONE_INTEGER));
	}
    }

    public static final SubLObject pph_var_paraphrased_explicitlyP(SubLObject obj) {
	{
	    SubLObject var_as_var_olist = pph_methods.pph_paraphrase_var_as_var(obj, UNPROVIDED, UNPROVIDED);
	    SubLObject var_as_var_string = pph_phrase.pph_phrase_output_list_string(var_as_var_olist, UNPROVIDED);
	    SubLObject foundP = NIL;
	    if (NIL == foundP) {
		{
		    SubLObject csome_list_var = pph_var_paraphrases(obj);
		    SubLObject paraphrase = NIL;
		    for (paraphrase = csome_list_var.first(); !((NIL != foundP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), paraphrase = csome_list_var.first()) {
			if (NIL != pph_phrase.pph_phrase_p(paraphrase, UNPROVIDED)) {
			    foundP = equal(var_as_var_string, pph_phrase.pph_phrase_string(paraphrase, UNPROVIDED));
			}
		    }
		}
	    }
	    return foundP;
	}
    }

    public static final SubLObject pph_var_previously_paraphrasedP(SubLObject obj) {
	return list_utilities.sublisp_boolean(pph_var_paraphrases(obj));
    }

    public static final SubLObject pph_var_count_previous_paraphrases(SubLObject obj) {
	return length(pph_var_paraphrases(obj));
    }

    public static final SubLObject string_mentions_varP(SubLObject string, SubLObject var) {
	return string_utilities.substringP(pph_phrase.pph_phrase_output_list_string(pph_methods.pph_paraphrase_var_as_var(var, UNPROVIDED, UNPROVIDED), NIL), string, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Should we use an explicit variable to paraphrase VAR?
     */
    public static final SubLObject pph_use_explicit_varP(SubLObject var) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != pph_vars.pph_maximize_linksP()) {
		return T;
	    } else if (NIL != pph_query_var_p(var)) {
		return makeBoolean(NIL == pph_vars.$pph_use_wh_for_query_varsP$.getDynamicValue(thread));
	    } else if (NIL != pph_var_used_only_onceP(var)) {
		return NIL;
	    } else if (NIL != pph_var_previously_explicitP(var)) {
		return T;
	    } else {
		return NIL;
	    }

	}
    }

    /**
     * If TYPE was paraphrased before, did it use an explicit variable?
     */
    public static final SubLObject pph_var_type_previously_explicit_if_mentionedP(SubLObject type) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject mentionedP = NIL;
		SubLObject explicitP = NIL;
		SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(pph_vars.$pph_var_types$.getDynamicValue(thread)));
		while (!((NIL != explicitP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
		    thread.resetMultipleValues();
		    {
			SubLObject var_entry_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
			SubLObject var_entry = thread.secondMultipleValue();
			thread.resetMultipleValues();
			if (pph_var_entry_type(var_entry).equal(type) && (NIL != pph_var_entry_paraphrases(var_entry))) {
			    mentionedP = T;
			    if (NIL == explicitP) {
				{
				    SubLObject csome_list_var = pph_var_entry_paraphrases(var_entry);
				    SubLObject paraphrase = NIL;
				    for (paraphrase = csome_list_var.first(); !((NIL != explicitP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), paraphrase = csome_list_var.first()) {
					if (NIL != pph_phrase.pph_phrase_p(paraphrase, UNPROVIDED)) {
					    explicitP = string_mentions_varP(pph_phrase.pph_phrase_string(paraphrase, NIL), var_entry_var);
					}
				    }
				}
			    }
			}
			iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
		    }
		}
		dictionary_contents.do_dictionary_contents_finalize(iteration_state);
		return makeBoolean((NIL == mentionedP) || (NIL != explicitP));
	    }
	}
    }

    /**
     * Was there any paraphrase of VAR that used an explicit variable?
     */
    public static final SubLObject pph_var_previously_explicitP(SubLObject var) {
	{
	    SubLObject paraphrases = pph_var_paraphrases(var);
	    SubLObject explicitP = NIL;
	    if (NIL == explicitP) {
		{
		    SubLObject csome_list_var = paraphrases;
		    SubLObject paraphrase = NIL;
		    for (paraphrase = csome_list_var.first(); !((NIL != explicitP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), paraphrase = csome_list_var.first()) {
			if (NIL != pph_phrase.pph_phrase_p(paraphrase, UNPROVIDED)) {
			    explicitP = string_mentions_varP(pph_phrase.pph_phrase_string(paraphrase, NIL), var);
			}
		    }
		}
	    }
	    return explicitP;
	}
    }

    /**
     * Was there any paraphrase of VAR that did *not* use an explicit variable?
     */
    public static final SubLObject pph_var_previously_lexifiedP(SubLObject var) {
	{
	    SubLObject paraphrases = pph_var_paraphrases(var);
	    SubLObject lexifiedP = NIL;
	    if (NIL == lexifiedP) {
		{
		    SubLObject csome_list_var = paraphrases;
		    SubLObject paraphrase = NIL;
		    for (paraphrase = csome_list_var.first(); !((NIL != lexifiedP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), paraphrase = csome_list_var.first()) {
			if (!((NIL != pph_phrase.pph_phrase_p(paraphrase, UNPROVIDED)) && (NIL != string_mentions_varP(pph_phrase.pph_phrase_string(paraphrase, NIL), var)))) {
			    lexifiedP = T;
			}
		    }
		}
	    }
	    return lexifiedP;
	}
    }

    public static final SubLObject pph_string_is_posP_internal(SubLObject string, SubLObject pos, SubLObject parse_morphologically, SubLObject mt) {
	if (parse_morphologically == UNPROVIDED) {
	    parse_morphologically = $NEVER;
	}
	if (mt == UNPROVIDED) {
	    mt = pph_vars.$pph_language_mt$.getDynamicValue();
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject ans = NIL;
		{
		    SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
		    SubLObject _prev_bind_1 = lexicon_vars.$parse_morphologically$.currentBinding(thread);
		    try {
			lexicon_vars.$lexicon_lookup_mt$.bind(mt, thread);
			lexicon_vars.$parse_morphologically$.bind(parse_morphologically, thread);
			{
			    SubLObject local_state = pph_macros.find_or_create_pph_external_memoization_state();
			    {
				SubLObject _prev_bind_0_1 = memoization_state.$memoization_state$.currentBinding(thread);
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
							Errors.error($str_alt54$Invalid_attempt_to_reuse_memoizat);
						    }
						}
					    }
					}
					try {
					    ans = lexicon_accessors.string_is_posP(string, pos, UNPROVIDED, UNPROVIDED, UNPROVIDED);
					} finally {
					    {
						SubLObject _prev_bind_0_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
						try {
						    $is_thread_performing_cleanupP$.bind(T, thread);
						    if ((NIL != local_state) && (NIL == original_memoization_process)) {
							memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
						    }
						} finally {
						    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_2, thread);
						}
					    }
					}
				    }
				} finally {
				    memoization_state.$memoization_state$.rebind(_prev_bind_0_1, thread);
				}
			    }
			}
		    } finally {
			lexicon_vars.$parse_morphologically$.rebind(_prev_bind_1, thread);
			lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
		    }
		}
		return ans;
	    }
	}
    }

    public static final SubLObject pph_string_is_posP(SubLObject string, SubLObject pos, SubLObject parse_morphologically, SubLObject mt) {
	if (parse_morphologically == UNPROVIDED) {
	    parse_morphologically = $NEVER;
	}
	if (mt == UNPROVIDED) {
	    mt = pph_vars.$pph_language_mt$.getDynamicValue();
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
		    return pph_string_is_posP_internal(string, pos, parse_morphologically, mt);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym52$PPH_STRING_IS_POS_, UNPROVIDED);
		if (NIL == caching_state) {
		    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym52$PPH_STRING_IS_POS_, FOUR_INTEGER, $int$128, EQUAL, UNPROVIDED);
		    memoization_state.memoization_state_put(v_memoization_state, $sym52$PPH_STRING_IS_POS_, caching_state);
		}
		{
		    SubLObject sxhash = memoization_state.sxhash_calc_4(string, pos, parse_morphologically, mt);
		    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		    if (collisions != $kw56$_MEMOIZED_ITEM_NOT_FOUND_) {
			{
			    SubLObject cdolist_list_var = collisions;
			    SubLObject collision = NIL;
			    for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
				{
				    SubLObject cached_args = collision.first();
				    SubLObject results2 = second(collision);
				    if (string.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (pos.equal(cached_args.first())) {
					    cached_args = cached_args.rest();
					    if (parse_morphologically.equal(cached_args.first())) {
						cached_args = cached_args.rest();
						if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
						    return memoization_state.caching_results(results2);
						}
					    }
					}
				    }
				}
			    }
			}
		    }
		    {
			SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(pph_string_is_posP_internal(string, pos, parse_morphologically, mt)));
			memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(string, pos, parse_morphologically, mt));
			return memoization_state.caching_results(results);
		    }
		}
	    }
	}
    }

    /**
     * Was there any paraphrase of VAR that used a pronoun?
     */
    public static final SubLObject pph_var_previously_pronounP(SubLObject var) {
	{
	    SubLObject paraphrases = pph_var_paraphrases(var);
	    SubLObject pronounP = NIL;
	    if (NIL == pronounP) {
		{
		    SubLObject csome_list_var = paraphrases;
		    SubLObject paraphrase = NIL;
		    for (paraphrase = csome_list_var.first(); !((NIL != pronounP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), paraphrase = csome_list_var.first()) {
			if (NIL != pph_phrase.pph_phrase_p(paraphrase, UNPROVIDED)) {
			    pronounP = pph_string_is_posP(pph_phrase.pph_phrase_string(paraphrase, NIL), $$Pronoun, $NEVER, UNPROVIDED);
			}
		    }
		}
	    }
	    return pronounP;
	}
    }

    // defvar
    public static final SubLSymbol $pph_different_vars$ = makeSymbol("*PPH-DIFFERENT-VARS*");

    public static final SubLObject pph_register_vars_as_different(SubLObject var1, SubLObject var2) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    $pph_different_vars$.setDynamicValue(list_utilities.alist_enter($pph_different_vars$.getDynamicValue(thread), var1, var2, UNPROVIDED), thread);
	    return $pph_different_vars$.getDynamicValue(thread);
	}
    }

    /**
     * If STRICT? is T, vars aren't considered different unless explicitly registered
     * as such (typically because #$different holds of them).
     */
    public static final SubLObject pph_different_varsP(SubLObject var1, SubLObject var2, SubLObject strictP) {
	if (strictP == UNPROVIDED) {
	    strictP = T;
	}
	if (NIL != strictP) {
	    return makeBoolean((NIL != pph_different_varsP_int(var1, var2)) || (NIL != pph_different_varsP_int(var2, var1)));
	} else {
	    return makeBoolean(!var1.eql(var2));
	}
    }

    public static final SubLObject pph_different_varsP_int(SubLObject var1, SubLObject var2) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    return eql(var2, list_utilities.alist_lookup($pph_different_vars$.getDynamicValue(thread), var1, UNPROVIDED, UNPROVIDED));
	}
    }

    /**
     * Make a note that VAR is an instance of TYPE.
     */
    public static final SubLObject pph_note_var_type(SubLObject var, SubLObject type) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != dictionary.dictionary_p(pph_vars.$pph_noted_var_types$.getDynamicValue(thread))) {
		dictionary_utilities.dictionary_pushnew(pph_vars.$pph_noted_var_types$.getDynamicValue(thread), var, type, symbol_function(EQUAL), UNPROVIDED);
		if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
		    format(T, $str_alt58$__Noted___S_is_a__S___, var, type);
		}
	    }
	    return var;
	}
    }

    /**
     * All the variables distinct from VAR that have VAR's type
     */
    public static final SubLObject pph_other_vars_with_var_type(SubLObject var) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject other_vars = NIL;
		if (NIL != dictionary.dictionary_p(pph_vars.$pph_noted_var_types$.getDynamicValue(thread))) {
		    {
			SubLObject type = pph_var_type(var);
			SubLObject found_varP = NIL;
			SubLObject cdolist_list_var = pph_vars_with_type(type);
			SubLObject other_var = NIL;
			for (other_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), other_var = cdolist_list_var.first()) {
			    if (other_var.equal(var)) {
				found_varP = T;
			    } else {
				other_vars = cons(other_var, other_vars);
			    }
			}
		    }
		}
		return other_vars;
	    }
	}
    }

    /**
     * All the variables that have TYPE.
     */
    public static final SubLObject pph_vars_with_type(SubLObject type) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject vars = NIL;
		SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(pph_vars.$pph_noted_var_types$.getDynamicValue(thread)));
		while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
		    thread.resetMultipleValues();
		    {
			SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
			SubLObject var_types = thread.secondMultipleValue();
			thread.resetMultipleValues();
			{
			    SubLObject cdolist_list_var = var_types;
			    SubLObject var_type = NIL;
			    for (var_type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), var_type = cdolist_list_var.first()) {
				if (NIL != pph_utilities.pph_genlP(var_type, type, UNPROVIDED)) {
				    vars = cons(var, vars);
				}
			    }
			}
			iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
		    }
		}
		dictionary_contents.do_dictionary_contents_finalize(iteration_state);
		return vars;
	    }
	}
    }

    /**
     * Was there any previous paraphrase of VAR that used the word 'other'?
     */
    public static final SubLObject pph_var_previously_paraphrased_with_otherP(SubLObject var) {
	{
	    SubLObject paraphrases = pph_var_paraphrases(var);
	    SubLObject v_answer = NIL;
	    if (NIL == v_answer) {
		{
		    SubLObject csome_list_var = paraphrases;
		    SubLObject paraphrase = NIL;
		    for (paraphrase = csome_list_var.first(); !((NIL != v_answer) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), paraphrase = csome_list_var.first()) {
			if (NIL != pph_phrase.pph_phrase_p(paraphrase, UNPROVIDED)) {
			    {
				SubLObject paraphrase_string = pph_phrase.pph_phrase_string(paraphrase, NIL);
				if ((NIL != string_utilities.substringP($$$other, paraphrase_string, UNPROVIDED, UNPROVIDED, UNPROVIDED))
					&& ((((NIL != string_utilities.substringP($str_alt60$_other_, paraphrase_string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != string_utilities.starts_with($str_alt61$other_, paraphrase_string)))
						|| (NIL != string_utilities.substringP($str_alt62$_another, paraphrase_string, UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (NIL != string_utilities.starts_with($$$another, paraphrase_string)))) {
				    v_answer = T;
				}
			    }
			}
		    }
		}
	    }
	    return v_answer;
	}
    }

    /**
     *
     *
     * @return LISTP of free variables in FORMULA.
     */
    public static final SubLObject pph_formula_free_variables_internal(SubLObject formula, SubLObject bound_vars) {
	if (bound_vars == UNPROVIDED) {
	    bound_vars = NIL;
	}
	{
	    SubLObject free_vars = NIL;
	    if (NIL != nart_handles.nart_p(formula)) {
	    } else if (NIL != cycl_grammar.cycl_sentence_p(formula)) {
		free_vars = el_utilities.sentence_free_variables(formula, bound_vars, $sym65$EL_VAR_, UNPROVIDED);
	    } else if (NIL != narts_high.naut_p(formula)) {
		free_vars = el_utilities.naut_free_variables(formula, bound_vars, $sym65$EL_VAR_, UNPROVIDED);
	    }

	    return free_vars;
	}
    }

    public static final SubLObject pph_formula_free_variables(SubLObject formula, SubLObject bound_vars) {
	if (bound_vars == UNPROVIDED) {
	    bound_vars = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
		    return pph_formula_free_variables_internal(formula, bound_vars);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_FORMULA_FREE_VARIABLES, UNPROVIDED);
		if (NIL == caching_state) {
		    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_FORMULA_FREE_VARIABLES, TWO_INTEGER, $int$98, EQUAL, UNPROVIDED);
		    memoization_state.memoization_state_put(v_memoization_state, PPH_FORMULA_FREE_VARIABLES, caching_state);
		}
		{
		    SubLObject sxhash = memoization_state.sxhash_calc_2(formula, bound_vars);
		    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		    if (collisions != $kw56$_MEMOIZED_ITEM_NOT_FOUND_) {
			{
			    SubLObject cdolist_list_var = collisions;
			    SubLObject collision = NIL;
			    for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
				{
				    SubLObject cached_args = collision.first();
				    SubLObject results2 = second(collision);
				    if (formula.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (((NIL != cached_args) && (NIL == cached_args.rest())) && bound_vars.equal(cached_args.first())) {
					    return memoization_state.caching_results(results2);
					}
				    }
				}
			    }
			}
		    }
		    {
			SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(pph_formula_free_variables_internal(formula, bound_vars)));
			memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(formula, bound_vars));
			return memoization_state.caching_results(results);
		    }
		}
	    }
	}
    }

    public static final SubLObject pph_var_scoped_or_quotedP(SubLObject var, SubLObject formula) {
	if (NIL != pph_utilities.pph_formula_with_dotsP(formula)) {
	    return NIL;
	}
	{
	    SubLObject freeP = NIL;
	    if (NIL == freeP) {
		{
		    SubLObject csome_list_var = cycl_utilities.arg_positions_bfs(var, formula, symbol_function(EQL));
		    SubLObject tree_position = NIL;
		    for (tree_position = csome_list_var.first(); !((NIL != freeP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), tree_position = csome_list_var.first()) {
			freeP = makeBoolean(NIL == pph_arg_scoped_or_quotedP(tree_position, formula));
		    }
		}
	    }
	    return makeBoolean(NIL == freeP);
	}
    }

    public static final SubLObject pph_arg_scoped_or_quotedP(SubLObject arg_position, SubLObject formula) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject operator = cycl_utilities.formula_arg0(formula);
		SubLObject arg_num = arg_position.first();
		if (NIL != pph_operator_arg_scopedP(operator, arg_num, pph_vars.$pph_domain_mt$.getDynamicValue(thread))) {
		    return T;
		} else if ((NIL != list_utilities.singletonP(arg_position)) && ((NIL != pph_operator_arg_quotedP(operator, arg_num)) || (arg_position.equal($list_alt67) && (NIL != formula_pattern_match.formula_matches_pattern(formula, $list_alt68))))) {
		    return T;
		} else if (NIL != list_utilities.lengthG(arg_position, ONE_INTEGER, UNPROVIDED)) {
		    {
			SubLObject sub_formula = cycl_utilities.formula_arg(formula, arg_num, UNPROVIDED);
			return pph_arg_scopedP(arg_position.rest(), sub_formula);
		    }
		}

	    }
	    return NIL;
	}
    }

    public static final SubLObject pph_quoted_collectionP(SubLObject v_object) {
	return makeBoolean((NIL != kb_indexing_datastructures.indexed_term_p(v_object)) && (NIL != pph_utilities.pph_removal_ask_boolean(list($$quotedCollection, v_object), UNPROVIDED)));
    }

    public static final SubLObject pph_arg_scopedP(SubLObject arg_position, SubLObject formula) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject operator = cycl_utilities.formula_arg0(formula);
		SubLObject arg_num = arg_position.first();
		if (NIL != pph_operator_arg_scopedP(operator, arg_num, pph_vars.$pph_domain_mt$.getDynamicValue(thread))) {
		    return T;
		} else if (NIL != list_utilities.lengthG(arg_position, ONE_INTEGER, UNPROVIDED)) {
		    {
			SubLObject sub_formula = cycl_utilities.formula_arg(formula, arg_num, UNPROVIDED);
			return pph_arg_scopedP(arg_position.rest(), sub_formula);
		    }
		}

	    }
	    return NIL;
	}
    }

    public static final SubLObject pph_operator_arg_scopedP_internal(SubLObject operator, SubLObject arg_num, SubLObject mt) {
	return makeBoolean((NIL != kb_indexing_datastructures.indexed_term_p(operator)) && (NIL != member(arg_num, kb_accessors.scoping_args(operator, mt), symbol_function(EQL), UNPROVIDED)));
    }

    public static final SubLObject pph_operator_arg_scopedP(SubLObject operator, SubLObject arg_num, SubLObject mt) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
		    return pph_operator_arg_scopedP_internal(operator, arg_num, mt);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym70$PPH_OPERATOR_ARG_SCOPED_, UNPROVIDED);
		if (NIL == caching_state) {
		    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym70$PPH_OPERATOR_ARG_SCOPED_, THREE_INTEGER, $int$200, EQL, UNPROVIDED);
		    memoization_state.memoization_state_put(v_memoization_state, $sym70$PPH_OPERATOR_ARG_SCOPED_, caching_state);
		}
		{
		    SubLObject sxhash = memoization_state.sxhash_calc_3(operator, arg_num, mt);
		    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		    if (collisions != $kw56$_MEMOIZED_ITEM_NOT_FOUND_) {
			{
			    SubLObject cdolist_list_var = collisions;
			    SubLObject collision = NIL;
			    for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
				{
				    SubLObject cached_args = collision.first();
				    SubLObject results2 = second(collision);
				    if (operator.eql(cached_args.first())) {
					cached_args = cached_args.rest();
					if (arg_num.eql(cached_args.first())) {
					    cached_args = cached_args.rest();
					    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
						return memoization_state.caching_results(results2);
					    }
					}
				    }
				}
			    }
			}
		    }
		    {
			SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(pph_operator_arg_scopedP_internal(operator, arg_num, mt)));
			memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(operator, arg_num, mt));
			return memoization_state.caching_results(results);
		    }
		}
	    }
	}
    }

    public static final SubLObject pph_operator_arg_quotedP_internal(SubLObject operator, SubLObject arg_num) {
	return makeBoolean((NIL != kb_indexing_datastructures.indexed_term_p(operator)) && (NIL != kb_accessors.quoted_argumentP(operator, arg_num)));
    }

    public static final SubLObject pph_operator_arg_quotedP(SubLObject operator, SubLObject arg_num) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
		    return pph_operator_arg_quotedP_internal(operator, arg_num);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym72$PPH_OPERATOR_ARG_QUOTED_, UNPROVIDED);
		if (NIL == caching_state) {
		    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym72$PPH_OPERATOR_ARG_QUOTED_, TWO_INTEGER, $int$200, EQL, UNPROVIDED);
		    memoization_state.memoization_state_put(v_memoization_state, $sym72$PPH_OPERATOR_ARG_QUOTED_, caching_state);
		}
		{
		    SubLObject sxhash = memoization_state.sxhash_calc_2(operator, arg_num);
		    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		    if (collisions != $kw56$_MEMOIZED_ITEM_NOT_FOUND_) {
			{
			    SubLObject cdolist_list_var = collisions;
			    SubLObject collision = NIL;
			    for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
				{
				    SubLObject cached_args = collision.first();
				    SubLObject results2 = second(collision);
				    if (operator.eql(cached_args.first())) {
					cached_args = cached_args.rest();
					if (((NIL != cached_args) && (NIL == cached_args.rest())) && arg_num.eql(cached_args.first())) {
					    return memoization_state.caching_results(results2);
					}
				    }
				}
			    }
			}
		    }
		    {
			SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(pph_operator_arg_quotedP_internal(operator, arg_num)));
			memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(operator, arg_num));
			return memoization_state.caching_results(results);
		    }
		}
	    }
	}
    }

    /**
     * All the #$isa constraints on VAR in FORMULA
     *
     * @param USE-VAR-TYPING-CLAUSES?
     * 		booleanp; Should we use explicit #$isa/#$genls, etc.
     * 		clauses from FORMULA?
     * @param DIRECTLY?
     * 		booleanp; Should we use them directly, as opposed to using their genls?
     */
    public static final SubLObject pph_variable_isa_constraints(SubLObject var, SubLObject formula, SubLObject mt, SubLObject use_var_typing_clausesP, SubLObject directlyP, SubLObject validity_test) {
	if (mt == UNPROVIDED) {
	    mt = mt_relevance_macros.$mt$.getDynamicValue();
	}
	if (use_var_typing_clausesP == UNPROVIDED) {
	    use_var_typing_clausesP = T;
	}
	if (directlyP == UNPROVIDED) {
	    directlyP = NIL;
	}
	if (validity_test == UNPROVIDED) {
	    validity_test = $sym73$PPH_VALID_VAR_TYPE_;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject ans = NIL;
		SubLObject stripped = pph_strip_existentials(formula, T);
		SubLObject clausal_form = (NIL != el_utilities.el_disjunction_p(stripped)) ? ((SubLObject) ($DNF)) : $CNF;
		thread.resetMultipleValues();
		{
		    SubLObject v_clauses = pph_clausal_form(stripped, mt, clausal_form);
		    SubLObject new_mt = thread.secondMultipleValue();
		    thread.resetMultipleValues();
		    if (v_clauses.isList()) {
			if (!((clausal_form == $DNF) && (NIL != list_utilities.lengthG(v_clauses, ONE_INTEGER, UNPROVIDED)))) {
			    {
				SubLObject cdolist_list_var = v_clauses;
				SubLObject clause = NIL;
				for (clause = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), clause = cdolist_list_var.first()) {
				    {
					SubLObject datum = clause;
					SubLObject current = datum;
					SubLObject neg_lits = NIL;
					SubLObject pos_lits = NIL;
					destructuring_bind_must_consp(current, datum, $list_alt76);
					neg_lits = current.first();
					current = current.rest();
					destructuring_bind_must_consp(current, datum, $list_alt76);
					pos_lits = current.first();
					current = current.rest();
					if (NIL == current) {
					    {
						SubLObject lits_to_use = (NIL != neg_lits) ? ((SubLObject) (neg_lits)) : pos_lits;
						SubLObject cdolist_list_var_3 = lits_to_use;
						SubLObject exp = NIL;
						for (exp = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest(), exp = cdolist_list_var_3.first()) {
						    if (NIL != cycl_utilities.expression_find(var, exp, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
							ans = append(ans, pph_variable_isa_constraints_in_lit(var, exp, lits_to_use, new_mt, use_var_typing_clausesP, directlyP, validity_test));
						    }
						}
					    }
					} else {
					    cdestructuring_bind_error(datum, $list_alt76);
					}
				    }
				}
			    }
			}
		    }
		}
		ans = list_utilities.delete_if_not(validity_test, delete($$CycLVariable, ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		if (NIL != find_if($sym78$SPECS_FN_NAT_, ans, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
		    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
			format(T, $str_alt79$Removing_non_SpecsFn_terms_from__, ans);
		    }
		    ans = list_utilities.remove_if_not($sym78$SPECS_FN_NAT_, ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		return Sort.sort(pph_delete_genls(ans), $sym80$PPH_GENERALITY_ESTIMATE_, UNPROVIDED);
	    }
	}
    }

    public static final SubLObject pph_clausal_form_internal(SubLObject expression, SubLObject mt, SubLObject dnf_or_cnf) {
	return clausifier.clausal_form(expression, mt, dnf_or_cnf);
    }

    public static final SubLObject pph_clausal_form(SubLObject expression, SubLObject mt, SubLObject dnf_or_cnf) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
		    return pph_clausal_form_internal(expression, mt, dnf_or_cnf);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_CLAUSAL_FORM, UNPROVIDED);
		if (NIL == caching_state) {
		    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_CLAUSAL_FORM, THREE_INTEGER, $int$32, EQUAL, UNPROVIDED);
		    memoization_state.memoization_state_put(v_memoization_state, PPH_CLAUSAL_FORM, caching_state);
		}
		{
		    SubLObject sxhash = memoization_state.sxhash_calc_3(expression, mt, dnf_or_cnf);
		    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		    if (collisions != $kw56$_MEMOIZED_ITEM_NOT_FOUND_) {
			{
			    SubLObject cdolist_list_var = collisions;
			    SubLObject collision = NIL;
			    for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
				{
				    SubLObject cached_args = collision.first();
				    SubLObject results2 = second(collision);
				    if (expression.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (mt.equal(cached_args.first())) {
					    cached_args = cached_args.rest();
					    if (((NIL != cached_args) && (NIL == cached_args.rest())) && dnf_or_cnf.equal(cached_args.first())) {
						return memoization_state.caching_results(results2);
					    }
					}
				    }
				}
			    }
			}
		    }
		    {
			SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(pph_clausal_form_internal(expression, mt, dnf_or_cnf)));
			memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(expression, mt, dnf_or_cnf));
			return memoization_state.caching_results(results);
		    }
		}
	    }
	}
    }

    /**
     *
     *
     * @param USE-VAR-TYPING-CLAUSES?
     * 		booleanp; Should we use explicit #$isa/#$genls, etc.
     * 		clauses from FORMULA?
     * @param DIRECTLY?
     * 		booleanp; Should we use them directly, as opposed to using their genls?
     */
    public static final SubLObject pph_variable_isa_constraints_in_lit_internal(SubLObject var, SubLObject exp, SubLObject lits, SubLObject mt, SubLObject use_var_typing_clausesP, SubLObject directlyP, SubLObject validity_test) {
	if (use_var_typing_clausesP == UNPROVIDED) {
	    use_var_typing_clausesP = T;
	}
	if (directlyP == UNPROVIDED) {
	    directlyP = NIL;
	}
	if (validity_test == UNPROVIDED) {
	    validity_test = $sym73$PPH_VALID_VAR_TYPE_;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject ans = NIL;
		SubLObject op = cycl_utilities.formula_operator(exp);
		SubLObject pos = cycl_utilities.formula_arg_positions(exp, var, symbol_function(EQL)).first();
		if ((NIL != forts.fort_p(op)) && pos.isInteger()) {
		    ans = append(kb_accessors.argn_isa(op, pos, mt), ans);
		    {
			SubLObject cdolist_list_var = kb_accessors.argn_genl(op, pos, mt);
			SubLObject genl = NIL;
			for (genl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), genl = cdolist_list_var.first()) {
			    {
				SubLObject item_var = pph_utilities.pph_make_type_level(genl);
				if (NIL == member(item_var, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
				    ans = cons(item_var, ans);
				}
			    }
			}
		    }
		}
		if (NIL != pph_utilities.pph_isaP(op, $$FamilyRelationSlot, UNPROVIDED)) {
		    ans = cons($$Agent_Generic, ans);
		}
		if (NIL != pph_types.pph_rmp_sentenceP(exp)) {
		    {
			SubLObject rbp_constraints = NIL;
			SubLObject local_state = pph_macros.find_or_create_pph_external_memoization_state();
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
						    Errors.error($str_alt54$Invalid_attempt_to_reuse_memoizat);
						}
					    }
					}
				    }
				    try {
					rbp_constraints = rbp_wff.rbp_formula_variable_isa_constraints(exp, var);
				    } finally {
					{
					    SubLObject _prev_bind_0_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
					    try {
						$is_thread_performing_cleanupP$.bind(T, thread);
						if ((NIL != local_state) && (NIL == original_memoization_process)) {
						    memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
						}
					    } finally {
						$is_thread_performing_cleanupP$.rebind(_prev_bind_0_4, thread);
					    }
					}
				    }
				}
			    } finally {
				memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
			    }
			}
			{
			    SubLObject cdolist_list_var = rbp_constraints;
			    SubLObject raw_constraint = NIL;
			    for (raw_constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), raw_constraint = cdolist_list_var.first()) {
				{
				    SubLObject datum = raw_constraint;
				    SubLObject current = datum;
				    SubLObject type = NIL;
				    SubLObject target = NIL;
				    SubLObject constraint_mt = NIL;
				    destructuring_bind_must_consp(current, datum, $list_alt86);
				    type = current.first();
				    current = current.rest();
				    destructuring_bind_must_consp(current, datum, $list_alt86);
				    target = current.first();
				    current = current.rest();
				    destructuring_bind_must_consp(current, datum, $list_alt86);
				    constraint_mt = current.first();
				    current = current.rest();
				    if (NIL == current) {
					{
					    SubLObject pcase_var = type;
					    if (pcase_var.eql($ISA)) {
						{
						    SubLObject item_var = target;
						    if (NIL == member(item_var, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
							ans = cons(item_var, ans);
						    }
						}
					    } else if (pcase_var.eql($GENL) || pcase_var.eql($NOT_DISJOINT)) {
						{
						    SubLObject item_var = pph_utilities.pph_make_type_level(target);
						    if (NIL == member(item_var, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
							ans = cons(item_var, ans);
						    }
						}
					    }

					}
				    } else {
					cdestructuring_bind_error(datum, $list_alt86);
				    }
				}
			    }
			}
		    }
		}
		if ((NIL != use_var_typing_clausesP) && (NIL != pph_utilities.pph_var_typing_clauseP(exp, var, validity_test))) {
		    {
			SubLObject base_type = pph_utilities.pph_var_type_from_asent(exp);
			ans = cconcatenate(ans, pph_isa_constraints_from_type(base_type, exp, lits, directlyP, mt));
		    }
		}
		ans = append(ans, pph_variable_isa_constraints_in_subexpressions(var, exp, lits, mt, use_var_typing_clausesP, directlyP));
		return Sort.sort(pph_delete_genls(ans), $sym80$PPH_GENERALITY_ESTIMATE_, UNPROVIDED);
	    }
	}
    }

    public static final SubLObject pph_variable_isa_constraints_in_lit(SubLObject var, SubLObject exp, SubLObject lits, SubLObject mt, SubLObject use_var_typing_clausesP, SubLObject directlyP, SubLObject validity_test) {
	if (use_var_typing_clausesP == UNPROVIDED) {
	    use_var_typing_clausesP = T;
	}
	if (directlyP == UNPROVIDED) {
	    directlyP = NIL;
	}
	if (validity_test == UNPROVIDED) {
	    validity_test = $sym73$PPH_VALID_VAR_TYPE_;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
		    return pph_variable_isa_constraints_in_lit_internal(var, exp, lits, mt, use_var_typing_clausesP, directlyP, validity_test);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_VARIABLE_ISA_CONSTRAINTS_IN_LIT, UNPROVIDED);
		if (NIL == caching_state) {
		    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_VARIABLE_ISA_CONSTRAINTS_IN_LIT, SEVEN_INTEGER, $int$100, EQUAL, UNPROVIDED);
		    memoization_state.memoization_state_put(v_memoization_state, PPH_VARIABLE_ISA_CONSTRAINTS_IN_LIT, caching_state);
		}
		{
		    SubLObject sxhash = memoization_state.sxhash_calc_7(var, exp, lits, mt, use_var_typing_clausesP, directlyP, validity_test);
		    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		    if (collisions != $kw56$_MEMOIZED_ITEM_NOT_FOUND_) {
			{
			    SubLObject cdolist_list_var = collisions;
			    SubLObject collision = NIL;
			    for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
				{
				    SubLObject cached_args = collision.first();
				    SubLObject results2 = second(collision);
				    if (var.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (exp.equal(cached_args.first())) {
					    cached_args = cached_args.rest();
					    if (lits.equal(cached_args.first())) {
						cached_args = cached_args.rest();
						if (mt.equal(cached_args.first())) {
						    cached_args = cached_args.rest();
						    if (use_var_typing_clausesP.equal(cached_args.first())) {
							cached_args = cached_args.rest();
							if (directlyP.equal(cached_args.first())) {
							    cached_args = cached_args.rest();
							    if (((NIL != cached_args) && (NIL == cached_args.rest())) && validity_test.equal(cached_args.first())) {
								return memoization_state.caching_results(results2);
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
		    {
			SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(pph_variable_isa_constraints_in_lit_internal(var, exp, lits, mt, use_var_typing_clausesP, directlyP, validity_test)));
			memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(var, exp, lits, mt, use_var_typing_clausesP, directlyP, validity_test));
			return memoization_state.caching_results(results);
		    }
		}
	    }
	}
    }

    public static final SubLObject pph_isa_constraints_from_type(SubLObject base_type, SubLObject expression, SubLObject lits, SubLObject directlyP, SubLObject mt) {
	{
	    SubLObject ans = NIL;
	    if (NIL != directlyP) {
		{
		    SubLObject item_var = base_type;
		    if (NIL == member(item_var, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
			ans = cons(item_var, ans);
		    }
		}
	    } else if (NIL != pph_utilities.pph_removal_ask_boolean(listS($$transitiveViaArg, cycl_utilities.atomic_sentence_predicate(expression), $list_alt92), mt)) {
		{
		    SubLObject cdolist_list_var = pph_genls(base_type, mt);
		    SubLObject super_type = NIL;
		    for (super_type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), super_type = cdolist_list_var.first()) {
			{
			    SubLObject more_general_asent = el_utilities.replace_formula_arg(TWO_INTEGER, super_type, expression);
			    if (NIL == subl_promotions.memberP(more_general_asent, lits, symbol_function(EQUAL), UNPROVIDED)) {
				{
				    SubLObject item_var = super_type;
				    if (NIL == member(item_var, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
					ans = cons(item_var, ans);
				    }
				}
			    }
			}
		    }
		}
	    }

	    return ans;
	}
    }

    public static final SubLObject pph_genls(SubLObject v_term, SubLObject mt) {
	if (mt == UNPROVIDED) {
	    mt = pph_vars.$pph_domain_mt$.getDynamicValue();
	}
	if (NIL != kb_indexing_datastructures.indexed_term_p(v_term)) {
	    return genls.genls(v_term, mt, UNPROVIDED);
	} else if (NIL != pph_utilities.specs_fn_natP(v_term)) {
	    {
		SubLObject core_term = pph_utilities.pph_core_term(v_term);
		return NIL != pph_utilities.specs_fn_natP(core_term) ? ((SubLObject) (NIL)) : Mapping.mapcar(PPH_MAKE_TYPE_LEVEL, pph_genls(core_term, mt));
	    }
	} else {
	    return NIL;
	}

    }

    public static final SubLObject pph_variable_isa_constraints_in_subexpressions(SubLObject var, SubLObject exp, SubLObject lits, SubLObject mt, SubLObject use_var_typing_clausesP, SubLObject directlyP) {
	{
	    SubLObject ans = NIL;
	    SubLObject use_var_typing_sub_clausesP = makeBoolean((NIL != use_var_typing_clausesP) && (NIL != pph_truth_preserving_operatorP(cycl_utilities.formula_arg0(exp), UNPROVIDED)));
	    SubLObject terms = cycl_utilities.formula_terms(exp, $IGNORE);
	    SubLObject cdolist_list_var = terms;
	    SubLObject sub_exp = NIL;
	    for (sub_exp = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), sub_exp = cdolist_list_var.first()) {
		if (NIL != el_utilities.atomic_sentenceP(sub_exp)) {
		    ans = append(ans, pph_variable_isa_constraints_in_lit(var, sub_exp, lits, mt, use_var_typing_sub_clausesP, directlyP, UNPROVIDED));
		}
		if (NIL != el_utilities.el_formula_p(sub_exp)) {
		    ans = append(ans, pph_variable_isa_constraints_in_subexpressions(var, sub_exp, lits, mt, use_var_typing_sub_clausesP, directlyP));
		}
	    }
	    return ans;
	}
    }

    /**
     *
     *
     * @return BOOLEAN; Are propositions inside the scope of OPERATOR guaranteed to
    be true if the larger proposition is true?
     */
    public static final SubLObject pph_truth_preserving_operatorP_internal(SubLObject operator, SubLObject mt) {
	if (mt == UNPROVIDED) {
	    mt = pph_vars.$pph_domain_mt$.getDynamicValue();
	}
	return makeBoolean((NIL != forts.fort_p(operator)) && (((NIL != member(operator, $list_alt95, UNPROVIDED, UNPROVIDED)) || (NIL != member(operator, $list_alt96, UNPROVIDED, UNPROVIDED))) || ((NIL != fort_types_interface.predicateP(operator))
		&& ((((NIL != pph_utilities.pph_genl_predicateP(operator, $$extentCardinality, mt)) || (NIL != pph_utilities.pph_genl_predicateP(operator, $$trueSentence, mt))) || (NIL != pph_utilities.pph_genl_predicateP(operator, $$holdsSometimeDuring, mt)))
			|| (NIL != pph_utilities.pph_genl_predicateP(operator, $$ist, mt))))));
    }

    public static final SubLObject pph_truth_preserving_operatorP(SubLObject operator, SubLObject mt) {
	if (mt == UNPROVIDED) {
	    mt = pph_vars.$pph_domain_mt$.getDynamicValue();
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
		    return pph_truth_preserving_operatorP_internal(operator, mt);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym94$PPH_TRUTH_PRESERVING_OPERATOR_, UNPROVIDED);
		if (NIL == caching_state) {
		    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym94$PPH_TRUTH_PRESERVING_OPERATOR_, TWO_INTEGER, $int$200, EQL, UNPROVIDED);
		    memoization_state.memoization_state_put(v_memoization_state, $sym94$PPH_TRUTH_PRESERVING_OPERATOR_, caching_state);
		}
		{
		    SubLObject sxhash = memoization_state.sxhash_calc_2(operator, mt);
		    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		    if (collisions != $kw56$_MEMOIZED_ITEM_NOT_FOUND_) {
			{
			    SubLObject cdolist_list_var = collisions;
			    SubLObject collision = NIL;
			    for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
				{
				    SubLObject cached_args = collision.first();
				    SubLObject results2 = second(collision);
				    if (operator.eql(cached_args.first())) {
					cached_args = cached_args.rest();
					if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
					    return memoization_state.caching_results(results2);
					}
				    }
				}
			    }
			}
		    }
		    {
			SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(pph_truth_preserving_operatorP_internal(operator, mt)));
			memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(operator, mt));
			return memoization_state.caching_results(results);
		    }
		}
	    }
	}
    }

    public static final SubLObject pph_strip_existentials(SubLObject formula, SubLObject include_nested_existentialsP) {
	if (include_nested_existentialsP == UNPROVIDED) {
	    include_nested_existentialsP = NIL;
	}
	if (NIL != include_nested_existentialsP) {
	    return cycl_utilities.expression_transform(formula, EL_EXISTENTIAL_P, QUANTIFIED_SUB_SENTENCE, UNPROVIDED, UNPROVIDED);
	} else {
	    while (NIL != el_utilities.el_existential_p(formula)) {
		formula = el_utilities.quantified_sub_sentence(formula);
	    }
	}
	return formula;
    }

    /**
     * Remove any items from COLS that are genls of anything else in COLS
     */
    public static final SubLObject pph_delete_genls(SubLObject cols) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (!cols.isList()) {
		return NIL;
	    }
	    {
		SubLObject ans = NIL;
		SubLObject col = NIL;
		for (ans = NIL, col = delete_duplicates(cols, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED).first(); NIL != col; ans = ans, col = cols.first()) {
		    cols = cols.rest();
		    {
			SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_domain_mt$.getDynamicValue(thread));
			{
			    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
			    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
			    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
			    try {
				mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
				mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
				mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
				if (!((NIL != subl_promotions.memberP(col, cols, $sym51$PPH_SPEC_, UNPROVIDED)) || (NIL != member(col, ans, $sym51$PPH_SPEC_, UNPROVIDED)))) {
				    ans = cons(col, ans);
				}
			    } finally {
				mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
				mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
				mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
			    }
			}
		    }
		}
		return ans;
	    }
	}
    }

    /**
     * A maximally specific #$isa arg-constraint on VAR in FORMULA.
     *
     * @return COLLECTION-P.
     */
    public static final SubLObject pph_min_variable_isa_constraint_internal(SubLObject var, SubLObject formula, SubLObject mt, SubLObject use_var_typing_clausesP, SubLObject directlyP, SubLObject validity_test) {
	if (mt == UNPROVIDED) {
	    mt = pph_vars.$pph_domain_mt$.getDynamicValue();
	}
	if (use_var_typing_clausesP == UNPROVIDED) {
	    use_var_typing_clausesP = T;
	}
	if (directlyP == UNPROVIDED) {
	    directlyP = NIL;
	}
	if (validity_test == UNPROVIDED) {
	    validity_test = $sym73$PPH_VALID_VAR_TYPE_;
	}
	{
	    SubLObject constraints = pph_variable_isa_constraints(var, formula, mt, use_var_typing_clausesP, directlyP, validity_test);
	    SubLObject found_constraints = pph_find_most_specific(constraints, UNPROVIDED);
	    SubLObject choice = (NIL != found_constraints) ? ((SubLObject) (found_constraints)) : pph_default_var_type();
	    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
		format(T, $str_alt104$Constraints_on__S_are__S_____choo, new SubLObject[] { var, constraints, choice });
	    }
	    return choice;
	}
    }

    public static final SubLObject pph_min_variable_isa_constraint(SubLObject var, SubLObject formula, SubLObject mt, SubLObject use_var_typing_clausesP, SubLObject directlyP, SubLObject validity_test) {
	if (mt == UNPROVIDED) {
	    mt = pph_vars.$pph_domain_mt$.getDynamicValue();
	}
	if (use_var_typing_clausesP == UNPROVIDED) {
	    use_var_typing_clausesP = T;
	}
	if (directlyP == UNPROVIDED) {
	    directlyP = NIL;
	}
	if (validity_test == UNPROVIDED) {
	    validity_test = $sym73$PPH_VALID_VAR_TYPE_;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
		    return pph_min_variable_isa_constraint_internal(var, formula, mt, use_var_typing_clausesP, directlyP, validity_test);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_MIN_VARIABLE_ISA_CONSTRAINT, UNPROVIDED);
		if (NIL == caching_state) {
		    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_MIN_VARIABLE_ISA_CONSTRAINT, SIX_INTEGER, $int$98, EQUAL, UNPROVIDED);
		    memoization_state.memoization_state_put(v_memoization_state, PPH_MIN_VARIABLE_ISA_CONSTRAINT, caching_state);
		}
		{
		    SubLObject sxhash = memoization_state.sxhash_calc_6(var, formula, mt, use_var_typing_clausesP, directlyP, validity_test);
		    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		    if (collisions != $kw56$_MEMOIZED_ITEM_NOT_FOUND_) {
			{
			    SubLObject cdolist_list_var = collisions;
			    SubLObject collision = NIL;
			    for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
				{
				    SubLObject cached_args = collision.first();
				    SubLObject results2 = second(collision);
				    if (var.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (formula.equal(cached_args.first())) {
					    cached_args = cached_args.rest();
					    if (mt.equal(cached_args.first())) {
						cached_args = cached_args.rest();
						if (use_var_typing_clausesP.equal(cached_args.first())) {
						    cached_args = cached_args.rest();
						    if (directlyP.equal(cached_args.first())) {
							cached_args = cached_args.rest();
							if (((NIL != cached_args) && (NIL == cached_args.rest())) && validity_test.equal(cached_args.first())) {
							    return memoization_state.caching_results(results2);
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
		    {
			SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(pph_min_variable_isa_constraint_internal(var, formula, mt, use_var_typing_clausesP, directlyP, validity_test)));
			memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(var, formula, mt, use_var_typing_clausesP, directlyP, validity_test));
			return memoization_state.caching_results(results);
		    }
		}
	    }
	}
    }

    /**
     *
     *
     * @return the most specific of ITEMS according to TEST.
     */
    public static final SubLObject pph_find_most_specific_internal(SubLObject items, SubLObject test) {
	if (test == UNPROVIDED) {
	    test = $sym80$PPH_GENERALITY_ESTIMATE_;
	}
	{
	    SubLObject ans = items.first();
	    SubLObject cdolist_list_var = items.rest();
	    SubLObject other = NIL;
	    for (other = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), other = cdolist_list_var.first()) {
		{
		    SubLObject pcase_var = test;
		    if (pcase_var.eql(QUOTE) || pcase_var.eql($sym80$PPH_GENERALITY_ESTIMATE_)) {
			if (NIL != pph_utilities.pph_generality_estimateL(other, ans)) {
			    ans = other;
			}
		    } else {
			if (NIL != funcall(test, other, ans)) {
			    ans = other;
			}
		    }
		}
	    }
	    return ans;
	}
    }

    public static final SubLObject pph_find_most_specific(SubLObject items, SubLObject test) {
	if (test == UNPROVIDED) {
	    test = $sym80$PPH_GENERALITY_ESTIMATE_;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
		    return pph_find_most_specific_internal(items, test);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_FIND_MOST_SPECIFIC, UNPROVIDED);
		if (NIL == caching_state) {
		    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_FIND_MOST_SPECIFIC, TWO_INTEGER, $int$100, EQUAL, UNPROVIDED);
		    memoization_state.memoization_state_put(v_memoization_state, PPH_FIND_MOST_SPECIFIC, caching_state);
		}
		{
		    SubLObject sxhash = memoization_state.sxhash_calc_2(items, test);
		    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		    if (collisions != $kw56$_MEMOIZED_ITEM_NOT_FOUND_) {
			{
			    SubLObject cdolist_list_var = collisions;
			    SubLObject collision = NIL;
			    for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
				{
				    SubLObject cached_args = collision.first();
				    SubLObject results2 = second(collision);
				    if (items.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (((NIL != cached_args) && (NIL == cached_args.rest())) && test.equal(cached_args.first())) {
					    return memoization_state.caching_results(results2);
					}
				    }
				}
			    }
			}
		    }
		    {
			SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(pph_find_most_specific_internal(items, test)));
			memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(items, test));
			return memoization_state.caching_results(results);
		    }
		}
	    }
	}
    }

    public static final SubLObject get_pph_var_types_test_case_duplicate_var(SubLObject pph_var_types_test_case) {
	return classes.subloop_get_access_protected_instance_slot(pph_var_types_test_case, FOUR_INTEGER, DUPLICATE_VAR);
    }

    public static final SubLObject set_pph_var_types_test_case_duplicate_var(SubLObject pph_var_types_test_case, SubLObject value) {
	return classes.subloop_set_access_protected_instance_slot(pph_var_types_test_case, value, FOUR_INTEGER, DUPLICATE_VAR);
    }

    public static final SubLObject get_pph_var_types_test_case_test_var(SubLObject pph_var_types_test_case) {
	return classes.subloop_get_access_protected_instance_slot(pph_var_types_test_case, THREE_INTEGER, TEST_VAR);
    }

    public static final SubLObject set_pph_var_types_test_case_test_var(SubLObject pph_var_types_test_case, SubLObject value) {
	return classes.subloop_set_access_protected_instance_slot(pph_var_types_test_case, value, THREE_INTEGER, TEST_VAR);
    }

    public static final SubLObject subloop_reserved_initialize_pph_var_types_test_case_class(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_pph_var_types_test_case_instance(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
	classes.subloop_initialize_slot(new_instance, PPH_VAR_TYPES_TEST_CASE, TEST_VAR, NIL);
	classes.subloop_initialize_slot(new_instance, PPH_VAR_TYPES_TEST_CASE, DUPLICATE_VAR, NIL);
	return NIL;
    }

    public static final SubLObject pph_var_types_test_case_p(SubLObject pph_var_types_test_case) {
	return classes.subloop_instanceof_class(pph_var_types_test_case, PPH_VAR_TYPES_TEST_CASE);
    }

    public static final SubLObject subloop_reserved_initialize_variable_isa_constraints_test_case_class(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_variable_isa_constraints_test_case_instance(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
	return NIL;
    }

    public static final SubLObject variable_isa_constraints_test_case_p(SubLObject variable_isa_constraints_test_case) {
	return classes.subloop_instanceof_class(variable_isa_constraints_test_case, VARIABLE_ISA_CONSTRAINTS_TEST_CASE);
    }

    public static final SubLObject declare_pph_variable_handling_file() {
	declareFunction("pph_var_entry_print_function_trampoline", "PPH-VAR-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("pph_var_entry_p", "PPH-VAR-ENTRY-P", 1, 0, false);
	new pph_variable_handling.$pph_var_entry_p$UnaryFunction();
	declareFunction("pph_var_entry_var", "PPH-VAR-ENTRY-VAR", 1, 0, false);
	declareFunction("pph_var_entry_type", "PPH-VAR-ENTRY-TYPE", 1, 0, false);
	declareFunction("pph_var_entry_paraphrases", "PPH-VAR-ENTRY-PARAPHRASES", 1, 0, false);
	declareFunction("pph_var_entry_quantifier", "PPH-VAR-ENTRY-QUANTIFIER", 1, 0, false);
	declareFunction("pph_var_entry_single_useP", "PPH-VAR-ENTRY-SINGLE-USE?", 1, 0, false);
	declareFunction("pph_var_entry_arg_position", "PPH-VAR-ENTRY-ARG-POSITION", 1, 0, false);
	declareFunction("_csetf_pph_var_entry_var", "_CSETF-PPH-VAR-ENTRY-VAR", 2, 0, false);
	declareFunction("_csetf_pph_var_entry_type", "_CSETF-PPH-VAR-ENTRY-TYPE", 2, 0, false);
	declareFunction("_csetf_pph_var_entry_paraphrases", "_CSETF-PPH-VAR-ENTRY-PARAPHRASES", 2, 0, false);
	declareFunction("_csetf_pph_var_entry_quantifier", "_CSETF-PPH-VAR-ENTRY-QUANTIFIER", 2, 0, false);
	declareFunction("_csetf_pph_var_entry_single_useP", "_CSETF-PPH-VAR-ENTRY-SINGLE-USE?", 2, 0, false);
	declareFunction("_csetf_pph_var_entry_arg_position", "_CSETF-PPH-VAR-ENTRY-ARG-POSITION", 2, 0, false);
	declareFunction("make_pph_var_entry", "MAKE-PPH-VAR-ENTRY", 0, 1, false);
	declareFunction("pprint_pph_var_entry", "PPRINT-PPH-VAR-ENTRY", 3, 0, false);
	declareFunction("new_pph_var_entry", "NEW-PPH-VAR-ENTRY", 1, 5, false);
	declareFunction("pph_var_entry_copy", "PPH-VAR-ENTRY-COPY", 1, 0, false);
	declareFunction("set_pph_var_type", "SET-PPH-VAR-TYPE", 2, 0, false);
	declareFunction("set_pph_var_type_map", "SET-PPH-VAR-TYPE-MAP", 2, 0, false);
	declareFunction("set_pph_var_paraphrases", "SET-PPH-VAR-PARAPHRASES", 2, 0, false);
	declareFunction("set_pph_var_quantifier", "SET-PPH-VAR-QUANTIFIER", 2, 0, false);
	declareFunction("clear_pph_var_types", "CLEAR-PPH-VAR-TYPES", 0, 0, false);
	declareFunction("pph_default_var_type", "PPH-DEFAULT-VAR-TYPE", 0, 0, false);
	declareFunction("pph_registered_vars", "PPH-REGISTERED-VARS", 0, 0, false);
	declareFunction("pph_var_entry", "PPH-VAR-ENTRY", 1, 0, false);
	declareFunction("pph_var_entries", "PPH-VAR-ENTRIES", 1, 0, false);
	declareFunction("pph_var_registeredP", "PPH-VAR-REGISTERED?", 1, 0, false);
	declareFunction("pph_var_registered_as_defaultP", "PPH-VAR-REGISTERED-AS-DEFAULT?", 1, 0, false);
	declareFunction("pph_register_var", "PPH-REGISTER-VAR", 1, 2, false);
	declareFunction("pph_update_var_type", "PPH-UPDATE-VAR-TYPE", 2, 0, false);
	declareFunction("pph_deregister_var", "PPH-DEREGISTER-VAR", 1, 0, false);
	declareFunction("pph_deregister_vars", "PPH-DEREGISTER-VARS", 1, 0, false);
	declareFunction("pph_deregister_var_paraphrase", "PPH-DEREGISTER-VAR-PARAPHRASE", 2, 0, false);
	declareFunction("pph_register_var_paraphrase", "PPH-REGISTER-VAR-PARAPHRASE", 2, 0, false);
	declareFunction("pph_var_quantifiedP", "PPH-VAR-QUANTIFIED?", 1, 0, false);
	declareFunction("pph_register_var_quantifier", "PPH-REGISTER-VAR-QUANTIFIER", 2, 0, false);
	declareFunction("pph_quantifier_for_operator", "PPH-QUANTIFIER-FOR-OPERATOR", 1, 0, false);
	declareFunction("pph_register_scoped_vars", "PPH-REGISTER-SCOPED-VARS", 1, 0, false);
	declareFunction("pph_register_query_vars", "PPH-REGISTER-QUERY-VARS", 1, 0, false);
	declareFunction("pph_query_var_p", "PPH-QUERY-VAR-P", 1, 0, false);
	declareFunction("pph_existential_var_p", "PPH-EXISTENTIAL-VAR-P", 1, 0, false);
	declareFunction("pph_note_if_var_is_used_only_once_in_formula", "PPH-NOTE-IF-VAR-IS-USED-ONLY-ONCE-IN-FORMULA", 2, 0, false);
	declareFunction("pph_register_var_as_used_only_once", "PPH-REGISTER-VAR-AS-USED-ONLY-ONCE", 1, 0, false);
	declareFunction("pph_var_used_only_onceP", "PPH-VAR-USED-ONLY-ONCE?", 1, 0, false);
	declareMacro("pph_do_var_entries", "PPH-DO-VAR-ENTRIES");
	declareFunction("pph_var_quantifier", "PPH-VAR-QUANTIFIER", 1, 0, false);
	declareFunction("pph_var_type", "PPH-VAR-TYPE", 1, 0, false);
	declareFunction("pph_cycl_var_type", "PPH-CYCL-VAR-TYPE", 1, 0, false);
	declareFunction("pph_type_arg_position_map", "PPH-TYPE-ARG-POSITION-MAP", 1, 0, false);
	declareFunction("pph_var_paraphrases", "PPH-VAR-PARAPHRASES", 1, 0, false);
	declareFunction("pph_clear_var_paraphrases", "PPH-CLEAR-VAR-PARAPHRASES", 1, 0, false);
	declareFunction("pph_clear_all_var_paraphrases", "PPH-CLEAR-ALL-VAR-PARAPHRASES", 0, 0, false);
	declareFunction("pph_var_from_paraphrase", "PPH-VAR-FROM-PARAPHRASE", 1, 0, false);
	declareFunction("pph_unregistered_variableP", "PPH-UNREGISTERED-VARIABLE?", 1, 0, false);
	declareFunction("pph_duplicate_var_typeP", "PPH-DUPLICATE-VAR-TYPE?", 1, 0, false);
	declareFunction("pph_var_paraphrased_explicitlyP", "PPH-VAR-PARAPHRASED-EXPLICITLY?", 1, 0, false);
	declareFunction("pph_var_previously_paraphrasedP", "PPH-VAR-PREVIOUSLY-PARAPHRASED?", 1, 0, false);
	declareFunction("pph_var_count_previous_paraphrases", "PPH-VAR-COUNT-PREVIOUS-PARAPHRASES", 1, 0, false);
	declareFunction("string_mentions_varP", "STRING-MENTIONS-VAR?", 2, 0, false);
	declareFunction("pph_use_explicit_varP", "PPH-USE-EXPLICIT-VAR?", 1, 0, false);
	declareFunction("pph_var_type_previously_explicit_if_mentionedP", "PPH-VAR-TYPE-PREVIOUSLY-EXPLICIT-IF-MENTIONED?", 1, 0, false);
	declareFunction("pph_var_previously_explicitP", "PPH-VAR-PREVIOUSLY-EXPLICIT?", 1, 0, false);
	declareFunction("pph_var_previously_lexifiedP", "PPH-VAR-PREVIOUSLY-LEXIFIED?", 1, 0, false);
	declareFunction("pph_string_is_posP_internal", "PPH-STRING-IS-POS?-INTERNAL", 2, 2, false);
	declareFunction("pph_string_is_posP", "PPH-STRING-IS-POS?", 2, 2, false);
	declareFunction("pph_var_previously_pronounP", "PPH-VAR-PREVIOUSLY-PRONOUN?", 1, 0, false);
	declareFunction("pph_register_vars_as_different", "PPH-REGISTER-VARS-AS-DIFFERENT", 2, 0, false);
	declareFunction("pph_different_varsP", "PPH-DIFFERENT-VARS?", 2, 1, false);
	declareFunction("pph_different_varsP_int", "PPH-DIFFERENT-VARS?-INT", 2, 0, false);
	declareFunction("pph_note_var_type", "PPH-NOTE-VAR-TYPE", 2, 0, false);
	declareFunction("pph_other_vars_with_var_type", "PPH-OTHER-VARS-WITH-VAR-TYPE", 1, 0, false);
	declareFunction("pph_vars_with_type", "PPH-VARS-WITH-TYPE", 1, 0, false);
	declareFunction("pph_var_previously_paraphrased_with_otherP", "PPH-VAR-PREVIOUSLY-PARAPHRASED-WITH-OTHER?", 1, 0, false);
	declareFunction("pph_formula_free_variables_internal", "PPH-FORMULA-FREE-VARIABLES-INTERNAL", 1, 1, false);
	declareFunction("pph_formula_free_variables", "PPH-FORMULA-FREE-VARIABLES", 1, 1, false);
	declareFunction("pph_var_scoped_or_quotedP", "PPH-VAR-SCOPED-OR-QUOTED?", 2, 0, false);
	declareFunction("pph_arg_scoped_or_quotedP", "PPH-ARG-SCOPED-OR-QUOTED?", 2, 0, false);
	declareFunction("pph_quoted_collectionP", "PPH-QUOTED-COLLECTION?", 1, 0, false);
	declareFunction("pph_arg_scopedP", "PPH-ARG-SCOPED?", 2, 0, false);
	declareFunction("pph_operator_arg_scopedP_internal", "PPH-OPERATOR-ARG-SCOPED?-INTERNAL", 3, 0, false);
	declareFunction("pph_operator_arg_scopedP", "PPH-OPERATOR-ARG-SCOPED?", 3, 0, false);
	declareFunction("pph_operator_arg_quotedP_internal", "PPH-OPERATOR-ARG-QUOTED?-INTERNAL", 2, 0, false);
	declareFunction("pph_operator_arg_quotedP", "PPH-OPERATOR-ARG-QUOTED?", 2, 0, false);
	declareFunction("pph_variable_isa_constraints", "PPH-VARIABLE-ISA-CONSTRAINTS", 2, 4, false);
	declareFunction("pph_clausal_form_internal", "PPH-CLAUSAL-FORM-INTERNAL", 3, 0, false);
	declareFunction("pph_clausal_form", "PPH-CLAUSAL-FORM", 3, 0, false);
	declareFunction("pph_variable_isa_constraints_in_lit_internal", "PPH-VARIABLE-ISA-CONSTRAINTS-IN-LIT-INTERNAL", 4, 3, false);
	declareFunction("pph_variable_isa_constraints_in_lit", "PPH-VARIABLE-ISA-CONSTRAINTS-IN-LIT", 4, 3, false);
	declareFunction("pph_isa_constraints_from_type", "PPH-ISA-CONSTRAINTS-FROM-TYPE", 5, 0, false);
	declareFunction("pph_genls", "PPH-GENLS", 1, 1, false);
	declareFunction("pph_variable_isa_constraints_in_subexpressions", "PPH-VARIABLE-ISA-CONSTRAINTS-IN-SUBEXPRESSIONS", 6, 0, false);
	declareFunction("pph_truth_preserving_operatorP_internal", "PPH-TRUTH-PRESERVING-OPERATOR?-INTERNAL", 1, 1, false);
	declareFunction("pph_truth_preserving_operatorP", "PPH-TRUTH-PRESERVING-OPERATOR?", 1, 1, false);
	declareFunction("pph_strip_existentials", "PPH-STRIP-EXISTENTIALS", 1, 1, false);
	declareFunction("pph_delete_genls", "PPH-DELETE-GENLS", 1, 0, false);
	declareFunction("pph_min_variable_isa_constraint_internal", "PPH-MIN-VARIABLE-ISA-CONSTRAINT-INTERNAL", 2, 4, false);
	declareFunction("pph_min_variable_isa_constraint", "PPH-MIN-VARIABLE-ISA-CONSTRAINT", 2, 4, false);
	declareFunction("pph_find_most_specific_internal", "PPH-FIND-MOST-SPECIFIC-INTERNAL", 1, 1, false);
	declareFunction("pph_find_most_specific", "PPH-FIND-MOST-SPECIFIC", 1, 1, false);
	declareFunction("get_pph_var_types_test_case_duplicate_var", "GET-PPH-VAR-TYPES-TEST-CASE-DUPLICATE-VAR", 1, 0, false);
	declareFunction("set_pph_var_types_test_case_duplicate_var", "SET-PPH-VAR-TYPES-TEST-CASE-DUPLICATE-VAR", 2, 0, false);
	declareFunction("get_pph_var_types_test_case_test_var", "GET-PPH-VAR-TYPES-TEST-CASE-TEST-VAR", 1, 0, false);
	declareFunction("set_pph_var_types_test_case_test_var", "SET-PPH-VAR-TYPES-TEST-CASE-TEST-VAR", 2, 0, false);
	declareFunction("subloop_reserved_initialize_pph_var_types_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-PPH-VAR-TYPES-TEST-CASE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_pph_var_types_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-PPH-VAR-TYPES-TEST-CASE-INSTANCE", 1, 0, false);
	declareFunction("pph_var_types_test_case_p", "PPH-VAR-TYPES-TEST-CASE-P", 1, 0, false);
	declareFunction("subloop_reserved_initialize_variable_isa_constraints_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-VARIABLE-ISA-CONSTRAINTS-TEST-CASE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_variable_isa_constraints_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-VARIABLE-ISA-CONSTRAINTS-TEST-CASE-INSTANCE", 1, 0, false);
	declareFunction("variable_isa_constraints_test_case_p", "VARIABLE-ISA-CONSTRAINTS-TEST-CASE-P", 1, 0, false);
	return NIL;
    }

    public static final SubLObject init_pph_variable_handling_file() {
	defconstant("*DTP-PPH-VAR-ENTRY*", PPH_VAR_ENTRY);
	defconstant("*PPH-DEFAULT-VAR-TYPE*", $$Thing);
	defvar("*PPH-DIFFERENT-VARS*", NIL);
	return NIL;
    }

    public static final SubLObject setup_pph_variable_handling_file() {
	register_method($print_object_method_table$.getGlobalValue(), $dtp_pph_var_entry$.getGlobalValue(), symbol_function(PPH_VAR_ENTRY_PRINT_FUNCTION_TRAMPOLINE));
	def_csetf(PPH_VAR_ENTRY_VAR, _CSETF_PPH_VAR_ENTRY_VAR);
	def_csetf(PPH_VAR_ENTRY_TYPE, _CSETF_PPH_VAR_ENTRY_TYPE);
	def_csetf(PPH_VAR_ENTRY_PARAPHRASES, _CSETF_PPH_VAR_ENTRY_PARAPHRASES);
	def_csetf(PPH_VAR_ENTRY_QUANTIFIER, _CSETF_PPH_VAR_ENTRY_QUANTIFIER);
	def_csetf($sym16$PPH_VAR_ENTRY_SINGLE_USE_, $sym17$_CSETF_PPH_VAR_ENTRY_SINGLE_USE_);
	def_csetf(PPH_VAR_ENTRY_ARG_POSITION, _CSETF_PPH_VAR_ENTRY_ARG_POSITION);
	identity(PPH_VAR_ENTRY);
	memoization_state.note_memoized_function($sym52$PPH_STRING_IS_POS_);
	memoization_state.note_memoized_function(PPH_FORMULA_FREE_VARIABLES);
	memoization_state.note_memoized_function($sym70$PPH_OPERATOR_ARG_SCOPED_);
	memoization_state.note_memoized_function($sym72$PPH_OPERATOR_ARG_QUOTED_);
	memoization_state.note_memoized_function(PPH_CLAUSAL_FORM);
	memoization_state.note_memoized_function(PPH_VARIABLE_ISA_CONSTRAINTS_IN_LIT);
	memoization_state.note_memoized_function($sym94$PPH_TRUTH_PRESERVING_OPERATOR_);
	memoization_state.note_memoized_function(PPH_MIN_VARIABLE_ISA_CONSTRAINT);
	memoization_state.note_memoized_function(PPH_FIND_MOST_SPECIFIC);
	sunit_external.define_test_category($$$Paraphrase_Variable_Handling, UNPROVIDED);
	sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(PPH_VAR_TYPES_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
	sunit_macros.define_test_case_preamble(PPH_VAR_TYPES_TEST_CASE);
	classes.subloop_new_class(PPH_VAR_TYPES_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt110);
	classes.class_set_implements_slot_listeners(PPH_VAR_TYPES_TEST_CASE, NIL);
	classes.subloop_note_class_initialization_function(PPH_VAR_TYPES_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_PPH_VAR_TYPES_TEST_CASE_CLASS);
	classes.subloop_note_instance_initialization_function(PPH_VAR_TYPES_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_PPH_VAR_TYPES_TEST_CASE_INSTANCE);
	subloop_reserved_initialize_pph_var_types_test_case_class(PPH_VAR_TYPES_TEST_CASE);
	sunit_macros.define_test_case_postamble(PPH_VAR_TYPES_TEST_CASE, $str_alt127$pph_variable_handling, $$$cycl, $list_alt129);
	sunit_macros.def_test_method_register(PPH_VAR_TYPES_TEST_CASE, TEST_VAR_TYPES);
	sunit_macros.def_test_method_register(PPH_VAR_TYPES_TEST_CASE, TEST_QUERY_VARS);
	sunit_macros.def_test_method_register(PPH_VAR_TYPES_TEST_CASE, TEST_VAR_PARAPHRASES);
	sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(VARIABLE_ISA_CONSTRAINTS_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
	sunit_macros.define_test_case_preamble(VARIABLE_ISA_CONSTRAINTS_TEST_CASE);
	classes.subloop_new_class(VARIABLE_ISA_CONSTRAINTS_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt134);
	classes.class_set_implements_slot_listeners(VARIABLE_ISA_CONSTRAINTS_TEST_CASE, NIL);
	classes.subloop_note_class_initialization_function(VARIABLE_ISA_CONSTRAINTS_TEST_CASE, $sym135$SUBLOOP_RESERVED_INITIALIZE_VARIABLE_ISA_CONSTRAINTS_TEST_CASE_CL);
	classes.subloop_note_instance_initialization_function(VARIABLE_ISA_CONSTRAINTS_TEST_CASE, $sym136$SUBLOOP_RESERVED_INITIALIZE_VARIABLE_ISA_CONSTRAINTS_TEST_CASE_IN);
	subloop_reserved_initialize_variable_isa_constraints_test_case_class(VARIABLE_ISA_CONSTRAINTS_TEST_CASE);
	sunit_macros.define_test_case_postamble(VARIABLE_ISA_CONSTRAINTS_TEST_CASE, $str_alt127$pph_variable_handling, $$$cycl, $list_alt129);
	sunit_macros.def_test_method_register(VARIABLE_ISA_CONSTRAINTS_TEST_CASE, TEST_VARIABLE_ISA_CONSTRAINTS);
	sunit_external.define_test_suite($str_alt138$Paraphrase_Variable_Handling_Test, $list_alt129, UNPROVIDED, UNPROVIDED);
	return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol PPH_VAR_ENTRY = makeSymbol("PPH-VAR-ENTRY");

    private static final SubLSymbol PPH_VAR_ENTRY_P = makeSymbol("PPH-VAR-ENTRY-P");

    static private final SubLList $list_alt2 = list(makeSymbol("VAR"), makeSymbol("TYPE"), makeSymbol("PARAPHRASES"), makeSymbol("QUANTIFIER"), makeSymbol("SINGLE-USE?"), makeSymbol("ARG-POSITION"));

    static private final SubLList $list_alt3 = list(makeKeyword("VAR"), $TYPE, makeKeyword("PARAPHRASES"), makeKeyword("QUANTIFIER"), makeKeyword("SINGLE-USE?"), makeKeyword("ARG-POSITION"));

    static private final SubLList $list_alt4 = list(makeSymbol("PPH-VAR-ENTRY-VAR"), makeSymbol("PPH-VAR-ENTRY-TYPE"), makeSymbol("PPH-VAR-ENTRY-PARAPHRASES"), makeSymbol("PPH-VAR-ENTRY-QUANTIFIER"), makeSymbol("PPH-VAR-ENTRY-SINGLE-USE?"), makeSymbol("PPH-VAR-ENTRY-ARG-POSITION"));

    static private final SubLList $list_alt5 = list(makeSymbol("_CSETF-PPH-VAR-ENTRY-VAR"), makeSymbol("_CSETF-PPH-VAR-ENTRY-TYPE"), makeSymbol("_CSETF-PPH-VAR-ENTRY-PARAPHRASES"), makeSymbol("_CSETF-PPH-VAR-ENTRY-QUANTIFIER"), makeSymbol("_CSETF-PPH-VAR-ENTRY-SINGLE-USE?"),
	    makeSymbol("_CSETF-PPH-VAR-ENTRY-ARG-POSITION"));

    private static final SubLSymbol PPRINT_PPH_VAR_ENTRY = makeSymbol("PPRINT-PPH-VAR-ENTRY");

    private static final SubLSymbol PPH_VAR_ENTRY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PPH-VAR-ENTRY-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol PPH_VAR_ENTRY_VAR = makeSymbol("PPH-VAR-ENTRY-VAR");

    public static final SubLSymbol _CSETF_PPH_VAR_ENTRY_VAR = makeSymbol("_CSETF-PPH-VAR-ENTRY-VAR");

    private static final SubLSymbol PPH_VAR_ENTRY_TYPE = makeSymbol("PPH-VAR-ENTRY-TYPE");

    public static final SubLSymbol _CSETF_PPH_VAR_ENTRY_TYPE = makeSymbol("_CSETF-PPH-VAR-ENTRY-TYPE");

    private static final SubLSymbol PPH_VAR_ENTRY_PARAPHRASES = makeSymbol("PPH-VAR-ENTRY-PARAPHRASES");

    public static final SubLSymbol _CSETF_PPH_VAR_ENTRY_PARAPHRASES = makeSymbol("_CSETF-PPH-VAR-ENTRY-PARAPHRASES");

    private static final SubLSymbol PPH_VAR_ENTRY_QUANTIFIER = makeSymbol("PPH-VAR-ENTRY-QUANTIFIER");

    public static final SubLSymbol _CSETF_PPH_VAR_ENTRY_QUANTIFIER = makeSymbol("_CSETF-PPH-VAR-ENTRY-QUANTIFIER");

    static private final SubLSymbol $sym16$PPH_VAR_ENTRY_SINGLE_USE_ = makeSymbol("PPH-VAR-ENTRY-SINGLE-USE?");

    static private final SubLSymbol $sym17$_CSETF_PPH_VAR_ENTRY_SINGLE_USE_ = makeSymbol("_CSETF-PPH-VAR-ENTRY-SINGLE-USE?");

    private static final SubLSymbol PPH_VAR_ENTRY_ARG_POSITION = makeSymbol("PPH-VAR-ENTRY-ARG-POSITION");

    public static final SubLSymbol _CSETF_PPH_VAR_ENTRY_ARG_POSITION = makeSymbol("_CSETF-PPH-VAR-ENTRY-ARG-POSITION");

    private static final SubLSymbol $PARAPHRASES = makeKeyword("PARAPHRASES");

    public static final SubLSymbol $kw24$SINGLE_USE_ = makeKeyword("SINGLE-USE?");

    static private final SubLString $str_alt26$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt27$_PPH_error_level_ = makeString("(PPH error level ");

    static private final SubLString $str_alt28$__ = makeString(") ");

    static private final SubLString $str_alt29$_is_not_a_ = makeString(" is not a ");

    static private final SubLString $str_alt30$__PPH_VAR_ENTRY___S__S__S__S_ = makeString("#<PPH-VAR-ENTRY: ~S ~S ~S ~S>");

    private static final SubLSymbol PPH_ARG_POSITION_MAP_P = makeSymbol("PPH-ARG-POSITION-MAP-P");

    public static final SubLObject $$Thing = constant_handles.reader_make_constant_shell(("Thing"));

    static private final SubLString $str_alt33$Non_EL_var___S = makeString("Non EL var: ~S");

    static private final SubLString $str_alt34$Registering__S_as__S___ = makeString("Registering ~S as ~S.~%");

    private static final SubLSymbol PPH_DEREGISTER_VAR = makeSymbol("PPH-DEREGISTER-VAR");

    private static final SubLSymbol PPH_PHRASE_P = makeSymbol("PPH-PHRASE-P");

    static private final SubLList $list_alt37 = list(makeKeyword("UNIVERSAL"), makeKeyword("EXISTENTIAL"), makeKeyword("NO"));

    static private final SubLString $str_alt38$___S_is_not_a_quantifier_keyword_ = makeString("~&~S is not a quantifier keyword among ~S");

    public static final SubLObject $$ExistentialQuantifier = constant_handles.reader_make_constant_shell(("ExistentialQuantifier"));

    public static final SubLObject $$forAll = constant_handles.reader_make_constant_shell(("forAll"));

    private static final SubLSymbol PPH_EXISTENTIAL_VAR_P = makeSymbol("PPH-EXISTENTIAL-VAR-P");

    static private final SubLString $str_alt46$__Registering__S_as_a_query_var__ = makeString("~&Registering ~S as a query var.~%");

    static private final SubLList $list_alt48 = list(list(makeSymbol("VAR"), makeSymbol("VAR-ENTRY"), makeSymbol("STOP-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $pph_var_types$ = makeSymbol("*PPH-VAR-TYPES*");

    static private final SubLSymbol $sym51$PPH_SPEC_ = makeSymbol("PPH-SPEC?");

    static private final SubLSymbol $sym52$PPH_STRING_IS_POS_ = makeSymbol("PPH-STRING-IS-POS?");

    static private final SubLString $str_alt54$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    public static final SubLInteger $int$128 = makeInteger(128);

    public static final SubLSymbol $kw56$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    public static final SubLObject $$Pronoun = constant_handles.reader_make_constant_shell(("Pronoun"));

    static private final SubLString $str_alt58$__Noted___S_is_a__S___ = makeString("~&Noted: ~S is a ~S.~%");

    static private final SubLString $$$other = makeString("other");

    static private final SubLString $str_alt60$_other_ = makeString(" other ");

    static private final SubLString $str_alt61$other_ = makeString("other ");

    static private final SubLString $str_alt62$_another = makeString(" another");

    static private final SubLString $$$another = makeString("another");

    private static final SubLSymbol PPH_FORMULA_FREE_VARIABLES = makeSymbol("PPH-FORMULA-FREE-VARIABLES");

    static private final SubLSymbol $sym65$EL_VAR_ = makeSymbol("EL-VAR?");

    public static final SubLInteger $int$98 = makeInteger(98);

    static private final SubLList $list_alt67 = list(ONE_INTEGER);

    static private final SubLList $list_alt68 = list(constant_handles.reader_make_constant_shell(("isa")), makeKeyword("ANYTHING"), list($TEST, makeSymbol("PPH-QUOTED-COLLECTION?")));

    public static final SubLObject $$quotedCollection = constant_handles.reader_make_constant_shell(("quotedCollection"));

    static private final SubLSymbol $sym70$PPH_OPERATOR_ARG_SCOPED_ = makeSymbol("PPH-OPERATOR-ARG-SCOPED?");

    public static final SubLInteger $int$200 = makeInteger(200);

    static private final SubLSymbol $sym72$PPH_OPERATOR_ARG_QUOTED_ = makeSymbol("PPH-OPERATOR-ARG-QUOTED?");

    static private final SubLSymbol $sym73$PPH_VALID_VAR_TYPE_ = makeSymbol("PPH-VALID-VAR-TYPE?");

    static private final SubLList $list_alt76 = list(makeSymbol("NEG-LITS"), makeSymbol("POS-LITS"));

    public static final SubLObject $$CycLVariable = constant_handles.reader_make_constant_shell(("CycLVariable"));

    static private final SubLSymbol $sym78$SPECS_FN_NAT_ = makeSymbol("SPECS-FN-NAT?");

    static private final SubLString $str_alt79$Removing_non_SpecsFn_terms_from__ = makeString("Removing non-SpecsFn terms from ~S");

    static private final SubLSymbol $sym80$PPH_GENERALITY_ESTIMATE_ = makeSymbol("PPH-GENERALITY-ESTIMATE<");

    private static final SubLSymbol PPH_CLAUSAL_FORM = makeSymbol("PPH-CLAUSAL-FORM");

    private static final SubLSymbol PPH_VARIABLE_ISA_CONSTRAINTS_IN_LIT = makeSymbol("PPH-VARIABLE-ISA-CONSTRAINTS-IN-LIT");

    public static final SubLObject $$FamilyRelationSlot = constant_handles.reader_make_constant_shell(("FamilyRelationSlot"));

    public static final SubLObject $$Agent_Generic = constant_handles.reader_make_constant_shell(("Agent-Generic"));

    static private final SubLList $list_alt86 = list(makeSymbol("TYPE"), makeSymbol("TARGET"), makeSymbol("CONSTRAINT-MT"));

    public static final SubLObject $$transitiveViaArg = constant_handles.reader_make_constant_shell(("transitiveViaArg"));

    static private final SubLList $list_alt92 = list(constant_handles.reader_make_constant_shell(("genls")), TWO_INTEGER);

    private static final SubLSymbol PPH_MAKE_TYPE_LEVEL = makeSymbol("PPH-MAKE-TYPE-LEVEL");

    static private final SubLSymbol $sym94$PPH_TRUTH_PRESERVING_OPERATOR_ = makeSymbol("PPH-TRUTH-PRESERVING-OPERATOR?");

    static private final SubLList $list_alt95 = list(constant_handles.reader_make_constant_shell(("and")), constant_handles.reader_make_constant_shell(("thereExists")), constant_handles.reader_make_constant_shell(("forAll")));

    static private final SubLList $list_alt96 = list(constant_handles.reader_make_constant_shell(("TheSetOf")));

    public static final SubLObject $$extentCardinality = constant_handles.reader_make_constant_shell(("extentCardinality"));

    public static final SubLObject $$trueSentence = constant_handles.reader_make_constant_shell(("trueSentence"));

    public static final SubLObject $$holdsSometimeDuring = constant_handles.reader_make_constant_shell(("holdsSometimeDuring"));

    public static final SubLObject $$ist = constant_handles.reader_make_constant_shell(("ist"));

    private static final SubLSymbol EL_EXISTENTIAL_P = makeSymbol("EL-EXISTENTIAL-P");

    private static final SubLSymbol QUANTIFIED_SUB_SENTENCE = makeSymbol("QUANTIFIED-SUB-SENTENCE");

    private static final SubLSymbol PPH_MIN_VARIABLE_ISA_CONSTRAINT = makeSymbol("PPH-MIN-VARIABLE-ISA-CONSTRAINT");

    static private final SubLString $str_alt104$Constraints_on__S_are__S_____choo = makeString("Constraints on ~S are ~S;~%, choosing ~S~%");

    private static final SubLSymbol PPH_FIND_MOST_SPECIFIC = makeSymbol("PPH-FIND-MOST-SPECIFIC");

    static private final SubLString $$$Paraphrase_Variable_Handling = makeString("Paraphrase Variable Handling");

    private static final SubLSymbol PPH_VAR_TYPES_TEST_CASE = makeSymbol("PPH-VAR-TYPES-TEST-CASE");

    static private final SubLList $list_alt110 = list(list(makeSymbol("TEST-VAR"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DUPLICATE-VAR"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-VAR-TYPES"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-VAR-PARAPHRASES"), NIL, makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-QUERY-VARS"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol DUPLICATE_VAR = makeSymbol("DUPLICATE-VAR");

    private static final SubLSymbol TEST_VAR = makeSymbol("TEST-VAR");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PPH_VAR_TYPES_TEST_CASE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PPH-VAR-TYPES-TEST-CASE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PPH_VAR_TYPES_TEST_CASE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PPH-VAR-TYPES-TEST-CASE-INSTANCE");

    static private final SubLString $str_alt127$pph_variable_handling = makeString("pph-variable-handling");

    static private final SubLString $$$cycl = makeString("cycl");

    static private final SubLList $list_alt129 = list(makeString("Paraphrase Variable Handling"));

    private static final SubLSymbol TEST_VAR_TYPES = makeSymbol("TEST-VAR-TYPES");

    private static final SubLSymbol TEST_QUERY_VARS = makeSymbol("TEST-QUERY-VARS");

    private static final SubLSymbol TEST_VAR_PARAPHRASES = makeSymbol("TEST-VAR-PARAPHRASES");

    private static final SubLSymbol VARIABLE_ISA_CONSTRAINTS_TEST_CASE = makeSymbol("VARIABLE-ISA-CONSTRAINTS-TEST-CASE");

    static private final SubLList $list_alt134 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-VARIABLE-ISA-CONSTRAINTS"), NIL, makeKeyword("PROTECTED")));

    static private final SubLSymbol $sym135$SUBLOOP_RESERVED_INITIALIZE_VARIABLE_ISA_CONSTRAINTS_TEST_CASE_CL = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VARIABLE-ISA-CONSTRAINTS-TEST-CASE-CLASS");

    static private final SubLSymbol $sym136$SUBLOOP_RESERVED_INITIALIZE_VARIABLE_ISA_CONSTRAINTS_TEST_CASE_IN = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VARIABLE-ISA-CONSTRAINTS-TEST-CASE-INSTANCE");

    private static final SubLSymbol TEST_VARIABLE_ISA_CONSTRAINTS = makeSymbol("TEST-VARIABLE-ISA-CONSTRAINTS");

    static private final SubLString $str_alt138$Paraphrase_Variable_Handling_Test = makeString("Paraphrase Variable Handling Test Suite");

    // // Initializers
    public void declareFunctions() {
	declare_pph_variable_handling_file();
    }

    public void initializeVariables() {
	init_pph_variable_handling_file();
    }

    public void runTopLevelForms() {
	setup_pph_variable_handling_file();
    }
}
