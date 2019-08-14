package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$bootstrapping_kbP$;
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
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nsubstitute;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

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
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class kb_hl_supports_low extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new kb_hl_supports_low();

    public static final String myName = "com.cyc.cycjava_2.cycl.kb_hl_supports_low";


    // defconstant
    public static final SubLSymbol $dtp_kb_hl_support_content$ = makeSymbol("*DTP-KB-HL-SUPPORT-CONTENT*");





    // deflexical
    public static final SubLSymbol $kb_hl_support_index_lock$ = makeSymbol("*KB-HL-SUPPORT-INDEX-LOCK*");

    // deflexical
    private static final SubLSymbol $kb_hl_support_index_unindexed_terms$ = makeSymbol("*KB-HL-SUPPORT-INDEX-UNINDEXED-TERMS*");

    private static final SubLSymbol KB_HL_SUPPORT_CONTENT = makeSymbol("KB-HL-SUPPORT-CONTENT");

    private static final SubLSymbol KB_HL_SUPPORT_CONTENT_P = makeSymbol("KB-HL-SUPPORT-CONTENT-P");

    private static final SubLList $list2 = list(makeSymbol("ARGUMENT"), makeSymbol("DEPENDENTS"));

    private static final SubLList $list3 = list(makeKeyword("ARGUMENT"), makeKeyword("DEPENDENTS"));

    private static final SubLList $list4 = list(makeSymbol("KB-HLSC-ARGUMENT"), makeSymbol("KB-HLSC-DEPENDENTS"));

    private static final SubLList $list5 = list(makeSymbol("_CSETF-KB-HLSC-ARGUMENT"), makeSymbol("_CSETF-KB-HLSC-DEPENDENTS"));



    private static final SubLSymbol KB_HL_SUPPORT_CONTENT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("KB-HL-SUPPORT-CONTENT-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("KB-HL-SUPPORT-CONTENT-P"));

    private static final SubLSymbol KB_HLSC_ARGUMENT = makeSymbol("KB-HLSC-ARGUMENT");

    private static final SubLSymbol _CSETF_KB_HLSC_ARGUMENT = makeSymbol("_CSETF-KB-HLSC-ARGUMENT");

    private static final SubLSymbol KB_HLSC_DEPENDENTS = makeSymbol("KB-HLSC-DEPENDENTS");

    private static final SubLSymbol _CSETF_KB_HLSC_DEPENDENTS = makeSymbol("_CSETF-KB-HLSC-DEPENDENTS");





    private static final SubLString $str15$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_KB_HL_SUPPORT_CONTENT = makeSymbol("MAKE-KB-HL-SUPPORT-CONTENT");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_KB_HL_SUPPORT_CONTENT_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-KB-HL-SUPPORT-CONTENT-METHOD");

    private static final SubLString $str21$NIL_justification_for_verified_KB = makeString("NIL justification for verified KB HL support ~a ~a");

    private static final SubLSymbol $UNJUSTIFIABLE = makeKeyword("UNJUSTIFIABLE");

    private static final SubLSymbol $kb_hl_supports_being_created$ = makeSymbol("*KB-HL-SUPPORTS-BEING-CREATED*");

    public static final SubLSymbol $kb_hl_support_index$ = makeSymbol("*KB-HL-SUPPORT-INDEX*");

    private static final SubLString $$$KB_HL_support_indexing_lock = makeString("KB HL support indexing lock");

    private static final SubLList $list26 = list(new SubLObject[]{ reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("DefaultSemanticsForStringFn")), reader_make_constant_shell(makeString("evaluate")), reader_make_constant_shell(makeString("genlInverse")), reader_make_constant_shell(makeString("genlPreds")), reader_make_constant_shell(makeString("genls")), reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("ist-Asserted")), reader_make_constant_shell(makeString("SubLStringConcatenationFn")), reader_make_constant_shell(makeString("TheList")), reader_make_constant_shell(makeString("TheSet")) });



    private static final SubLSymbol $sym28$KB_HL_SUPPORT_INDEX_UNINDEXED_TERM_ = makeSymbol("KB-HL-SUPPORT-INDEX-UNINDEXED-TERM?");

    private static final SubLList $list29 = list(makeSymbol("MODULE"), makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLString $$$mapping_Cyc_KB_HL_supports = makeString("mapping Cyc KB HL supports");





    private static final SubLString $$$reindexing_KB_HL_supports = makeString("reindexing KB HL supports");

    private static final SubLString $str34$Eliminating_duplicate_KB_HL_suppo = makeString("Eliminating duplicate KB HL supports");

    public static SubLObject kb_hl_support_content_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject kb_hl_support_content_p(final SubLObject v_object) {
        return v_object.getClass() == $kb_hl_support_content_native.class ? T : NIL;
    }

    public static SubLObject kb_hlsc_argument(final SubLObject v_object) {
        assert NIL != kb_hl_support_content_p(v_object) : "kb_hl_supports_low.kb_hl_support_content_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject kb_hlsc_dependents(final SubLObject v_object) {
        assert NIL != kb_hl_support_content_p(v_object) : "kb_hl_supports_low.kb_hl_support_content_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_kb_hlsc_argument(final SubLObject v_object, final SubLObject value) {
        assert NIL != kb_hl_support_content_p(v_object) : "kb_hl_supports_low.kb_hl_support_content_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_kb_hlsc_dependents(final SubLObject v_object, final SubLObject value) {
        assert NIL != kb_hl_support_content_p(v_object) : "kb_hl_supports_low.kb_hl_support_content_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_kb_hl_support_content(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $kb_hl_support_content_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ARGUMENT)) {
                _csetf_kb_hlsc_argument(v_new, current_value);
            } else
                if (pcase_var.eql($DEPENDENTS)) {
                    _csetf_kb_hlsc_dependents(v_new, current_value);
                } else {
                    Errors.error($str15$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_kb_hl_support_content(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_KB_HL_SUPPORT_CONTENT, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ARGUMENT, kb_hlsc_argument(obj));
        funcall(visitor_fn, obj, $SLOT, $DEPENDENTS, kb_hlsc_dependents(obj));
        funcall(visitor_fn, obj, $END, MAKE_KB_HL_SUPPORT_CONTENT, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_kb_hl_support_content_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_kb_hl_support_content(obj, visitor_fn);
    }

    public static SubLObject new_kb_hl_support_content() {
        SubLObject kb_hl_support_content = NIL;
        kb_hl_support_content = make_kb_hl_support_content(UNPROVIDED);
        return kb_hl_support_content;
    }

    public static SubLObject free_kb_hl_support_content(final SubLObject kb_hl_support_content) {
        _csetf_kb_hlsc_argument(kb_hl_support_content, NIL);
        _csetf_kb_hlsc_dependents(kb_hl_support_content, NIL);
        return kb_hl_support_content;
    }

    public static SubLObject kb_hl_support_content_get_argument(final SubLObject kb_hl_support_content) {
        return kb_hlsc_argument(kb_hl_support_content);
    }

    public static SubLObject kb_hl_support_content_get_dependents(final SubLObject kb_hl_support_content) {
        return kb_hlsc_dependents(kb_hl_support_content);
    }

    public static SubLObject kb_hl_support_content_set_argument(final SubLObject kb_hl_support_content, final SubLObject deduction) {
        _csetf_kb_hlsc_argument(kb_hl_support_content, deduction);
        return kb_hl_support_content;
    }

    public static SubLObject kb_hl_support_content_set_dependents(final SubLObject kb_hl_support_content, final SubLObject dependents) {
        _csetf_kb_hlsc_dependents(kb_hl_support_content, dependents);
        return kb_hl_support_content;
    }

    public static SubLObject dump_kb_hl_support_content(final SubLObject kb_hl_support, final SubLObject stream) {
        final SubLObject content = kb_hl_support_content(kb_hl_support);
        cfasl_output(kb_hl_support_content_get_argument(content), stream);
        cfasl_output(kb_hl_support_content_get_dependents(content), stream);
        return kb_hl_support;
    }

    public static SubLObject load_kb_hl_support_content(final SubLObject kb_hl_support, final SubLObject stream) {
        final SubLObject id = kb_hl_support_handles.kb_hl_support_id(kb_hl_support);
        final SubLObject argument = cfasl_input(stream, NIL, UNPROVIDED);
        final SubLObject dependents = cfasl_input(stream, NIL, UNPROVIDED);
        final SubLObject content = new_kb_hl_support_content();
        kb_hl_support_content_set_argument(content, argument);
        kb_hl_support_content_set_dependents(content, dependents);
        kb_hl_support_manager.register_kb_hl_support_content(id, content);
        return id;
    }

    public static SubLObject kb_create_kb_hl_support_kb_store(final SubLObject hl_support, final SubLObject justification) {
        SubLObject kb_hl_support = kb_hl_supports_high.find_kb_hl_support(hl_support);
        if (NIL != kb_hl_support) {
            return kb_hl_support_handles.kb_hl_support_id(kb_hl_support);
        }
        final SubLObject internal_id = kb_hl_support_handles.make_kb_hl_support_id();
        kb_hl_support = kb_hl_support_handles.make_kb_hl_support_shell(internal_id);
        kb_create_kb_hl_support_int(kb_hl_support, internal_id, hl_support, justification);
        return internal_id;
    }

    public static SubLObject kb_create_kb_hl_support_int(final SubLObject kb_hl_support, final SubLObject internal_id, final SubLObject hl_support, final SubLObject justification) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject kb_hl_support_content = new_kb_hl_support_content();
        note_kb_hl_support_creation_started(hl_support, kb_hl_support);
        kb_hl_support_manager.register_kb_hl_support_content(internal_id, kb_hl_support_content);
        final SubLObject canon_just = (NIL != $bootstrapping_kbP$.getDynamicValue(thread)) ? justification : arguments.canonicalize_supports(justification, T);
        final SubLObject deduction = deductions_high.create_deduction_for_hl_support(hl_support, canon_just);
        kb_hl_support_content_set_argument(kb_hl_support_content, deduction);
        index_kb_hl_support(kb_hl_support, hl_support);
        note_kb_hl_support_creation_complete(hl_support);
        return kb_hl_support;
    }

    public static SubLObject kb_create_kb_hl_support_cyc(final SubLObject internal_id) {
        final SubLObject kb_hl_support = kb_hl_support_handles.find_kb_hl_support_by_id(internal_id);
        return NIL != kb_hl_support ? kb_hl_support : kb_hl_support_handles.make_kb_hl_support_shell(internal_id);
    }

    public static SubLObject kb_hl_support_content(final SubLObject kb_hl_support) {
        return kb_hl_support_manager.lookup_kb_hl_support_content(kb_hl_support_handles.kb_hl_support_get_id(kb_hl_support));
    }

    public static SubLObject kb_hl_support_hl_support_int(final SubLObject kb_hl_support) {
        final SubLObject content = kb_hl_support_content(kb_hl_support);
        final SubLObject argument = kb_hl_support_content_get_argument(content);
        SubLObject hl_support = NIL;
        if (NIL != deduction_handles.deduction_p(argument)) {
            hl_support = deductions_high.deduction_supported_object(argument);
        } else
            if (NIL != arguments.hl_support_p(argument)) {
                hl_support = argument;
            }

        return hl_support;
    }

    public static SubLObject kb_hl_support_add_dependent_int(final SubLObject kb_hl_support, final SubLObject deduction) {
        final SubLObject content = kb_hl_support_content(kb_hl_support);
        final SubLObject old_dependents = kb_hl_support_content_get_dependents(content);
        final SubLObject new_dependents = set_contents.set_contents_add(deduction, old_dependents, symbol_function(EQ));
        kb_hl_support_content_set_dependents(content, new_dependents);
        kb_hl_support_manager.mark_kb_hl_support_content_as_muted(kb_hl_support_handles.kb_hl_support_id(kb_hl_support));
        return kb_hl_support;
    }

    public static SubLObject kb_hl_support_remove_dependent_int(final SubLObject kb_hl_support, final SubLObject deduction) {
        final SubLObject content = kb_hl_support_content(kb_hl_support);
        final SubLObject old_dependents = kb_hl_support_content_get_dependents(content);
        final SubLObject new_dependents = set_contents.set_contents_delete(deduction, old_dependents, symbol_function(EQ));
        kb_hl_support_content_set_dependents(content, new_dependents);
        kb_hl_support_manager.mark_kb_hl_support_content_as_muted(kb_hl_support_handles.kb_hl_support_id(kb_hl_support));
        return kb_hl_support;
    }

    public static SubLObject kb_hl_support_clear_dependents_int(final SubLObject kb_hl_support) {
        final SubLObject content = kb_hl_support_content(kb_hl_support);
        kb_hl_support_content_set_dependents(content, set_contents.new_set_contents(ZERO_INTEGER, symbol_function(EQ)));
        kb_hl_support_manager.mark_kb_hl_support_content_as_muted(kb_hl_support_handles.kb_hl_support_id(kb_hl_support));
        return kb_hl_support;
    }

    public static SubLObject kb_hl_support_remove_argument_int(final SubLObject kb_hl_support) {
        final SubLObject hl_support = kb_hl_support_hl_support_int(kb_hl_support);
        final SubLObject content = kb_hl_support_content(kb_hl_support);
        kb_hl_support_content_set_argument(content, hl_support);
        kb_hl_support_manager.mark_kb_hl_support_content_as_muted(kb_hl_support_handles.kb_hl_support_id(kb_hl_support));
        return kb_hl_support;
    }

    public static SubLObject kb_hl_support_reset_argument_int(final SubLObject kb_hl_support, final SubLObject new_argument) {
        final SubLObject content = kb_hl_support_content(kb_hl_support);
        final SubLObject old_argument = kb_hl_support_content_get_argument(content);
        if (NIL != deduction_handles.valid_deductionP(old_argument, UNPROVIDED)) {
            deductions_high.remove_deduction(old_argument);
        }
        kb_hl_support_content_set_argument(content, new_argument);
        kb_hl_support_manager.mark_kb_hl_support_content_as_muted(kb_hl_support_handles.kb_hl_support_id(kb_hl_support));
        return kb_hl_support;
    }

    public static SubLObject kb_hl_support_reset_justification(final SubLObject kb_hl_support, final SubLObject new_justification) {
        final SubLObject hl_support = kb_hl_support_hl_support_int(kb_hl_support);
        final SubLObject new_argument = deductions_high.create_deduction_for_hl_support(hl_support, new_justification);
        kb_hl_support_reset_argument_int(kb_hl_support, new_argument);
        return kb_hl_support;
    }

    public static SubLObject rejustify_kb_hl_support_int(final SubLObject kb_hl_support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject hl_support = kb_hl_support_hl_support_int(kb_hl_support);
        final SubLObject justification = kb_hl_support_handles.hl_justify_for_kb_hl_support(hl_support);
        if (NIL != justification) {
            return kb_hl_support_reset_justification(kb_hl_support, justification);
        }
        if (NIL != tms.$tms_debugP$.getDynamicValue(thread)) {
            Errors.error($str21$NIL_justification_for_verified_KB, kb_hl_support, hl_support);
        } else {
            Errors.warn($str21$NIL_justification_for_verified_KB, kb_hl_support, hl_support);
        }
        return $UNJUSTIFIABLE;
    }

    public static SubLObject remove_kb_hl_support_int(final SubLObject kb_hl_support) {
        final SubLObject content = kb_hl_support_content(kb_hl_support);
        final SubLObject argument = kb_hl_support_content_get_argument(content);
        if (NIL != deduction_handles.valid_deductionP(argument, UNPROVIDED)) {
            deductions_high.remove_deduction(argument);
        }
        kb_hl_support_handles.free_kb_hl_support(kb_hl_support);
        free_kb_hl_support_content(content);
        return kb_hl_support;
    }

    public static SubLObject valid_kb_hl_support_contentP(final SubLObject v_object, SubLObject robustP) {
        if (robustP == UNPROVIDED) {
            robustP = NIL;
        }
        return makeBoolean((NIL != kb_hl_support_content_p(v_object)) && (NIL != kb_hl_support_content_validP(v_object, robustP)));
    }

    public static SubLObject kb_hl_support_content_validP(final SubLObject kb_hl_support_content, SubLObject robustP) {
        if (robustP == UNPROVIDED) {
            robustP = NIL;
        }
        final SubLObject argument = kb_hl_support_content_get_argument(kb_hl_support_content);
        final SubLObject dependents = kb_hl_support_content_get_dependents(kb_hl_support_content);
        SubLObject validP = NIL;
        if (NIL != deduction_handles.valid_deductionP(argument, robustP)) {
            SubLObject invalidP = NIL;
            final SubLObject set_contents_var = dependents;
            SubLObject basis_object;
            SubLObject state;
            SubLObject dependent;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == invalidP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                dependent = set_contents.do_set_contents_next(basis_object, state);
                if ((NIL != set_contents.do_set_contents_element_validP(state, dependent)) && (NIL == deduction_handles.valid_deductionP(dependent, robustP))) {
                    invalidP = T;
                }
            }
            validP = makeBoolean(NIL == invalidP);
        }
        return validP;
    }

    public static SubLObject note_kb_hl_support_creation_started(final SubLObject hl_support, final SubLObject kb_hl_support) {
        if (NIL == dictionary.dictionary_p($kb_hl_supports_being_created$.getGlobalValue())) {
            $kb_hl_supports_being_created$.setGlobalValue(dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
        }
        dictionary.dictionary_enter($kb_hl_supports_being_created$.getGlobalValue(), hl_support, kb_hl_support);
        return hl_support;
    }

    public static SubLObject note_kb_hl_support_creation_complete(final SubLObject hl_support) {
        if (NIL != dictionary.dictionary_p($kb_hl_supports_being_created$.getGlobalValue())) {
            dictionary.dictionary_remove($kb_hl_supports_being_created$.getGlobalValue(), hl_support);
        }
        return hl_support;
    }

    public static SubLObject find_kb_hl_support_during_creation_int(final SubLObject hl_support) {
        SubLObject kb_hl_support = NIL;
        if (NIL != dictionary.dictionary_p($kb_hl_supports_being_created$.getGlobalValue())) {
            kb_hl_support = dictionary.dictionary_lookup_without_values($kb_hl_supports_being_created$.getGlobalValue(), hl_support, UNPROVIDED);
        }
        return kb_hl_support;
    }

    public static SubLObject destroy_kb_hl_support_int(final SubLObject kb_hl_support) {
        unindex_kb_hl_support(kb_hl_support, UNPROVIDED);
        final SubLObject id = kb_hl_support_handles.kb_hl_support_id(kb_hl_support);
        remove_kb_hl_support_int(kb_hl_support);
        kb_hl_support_handles.deregister_kb_hl_support_id(id);
        kb_hl_support_manager.deregister_kb_hl_support_content(id);
        return kb_hl_support;
    }

    public static SubLObject kb_hl_support_index_unindexed_termP(final SubLObject v_term) {
        return list_utilities.member_equalP(v_term, $kb_hl_support_index_unindexed_terms$.getGlobalValue());
    }

    public static SubLObject kb_hl_support_index_indexed_term_p(final SubLObject v_term) {
        return makeBoolean((NIL != indexed_term_p(v_term)) && (NIL == kb_hl_support_index_unindexed_termP(v_term)));
    }

    public static SubLObject kb_hl_support_index_indexed_terms(final SubLObject sentence) {
        final SubLObject terms = cycl_utilities.expression_gather(sentence, INDEXED_TERM_P, NIL, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
        return NIL != list_utilities.find_if_not($sym28$KB_HL_SUPPORT_INDEX_UNINDEXED_TERM_, terms, UNPROVIDED, UNPROVIDED, UNPROVIDED) ? remove_if($sym28$KB_HL_SUPPORT_INDEX_UNINDEXED_TERM_, terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : terms;
    }

    public static SubLObject lookup_kb_hl_support_int(final SubLObject hl_support) {
        SubLObject support_sets = NIL;
        SubLObject kb_hl_support = NIL;
        SubLObject module = NIL;
        SubLObject sentence = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(hl_support, hl_support, $list29);
        module = hl_support.first();
        SubLObject current = hl_support.rest();
        destructuring_bind_must_consp(current, hl_support, $list29);
        sentence = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, hl_support, $list29);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, hl_support, $list29);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject release = NIL;
            try {
                release = seize_lock($kb_hl_support_index_lock$.getGlobalValue());
                final SubLObject mt_index = dictionary.dictionary_lookup_without_values($kb_hl_support_index$.getGlobalValue(), module, UNPROVIDED);
                if (NIL != dictionary.dictionary_p(mt_index)) {
                    final SubLObject tv_index = dictionary.dictionary_lookup_without_values(mt_index, mt, UNPROVIDED);
                    if (NIL != dictionary.dictionary_p(tv_index)) {
                        final SubLObject term_index = dictionary.dictionary_lookup_without_values(tv_index, tv, UNPROVIDED);
                        if (NIL != dictionary.dictionary_p(term_index)) {
                            final SubLObject indexed_terms = kb_hl_support_index_indexed_terms(sentence);
                            SubLObject doneP = NIL;
                            if (NIL == doneP) {
                                SubLObject csome_list_var = indexed_terms;
                                SubLObject v_term = NIL;
                                v_term = csome_list_var.first();
                                while ((NIL == doneP) && (NIL != csome_list_var)) {
                                    final SubLObject support_set = dictionary.dictionary_lookup_without_values(term_index, v_term, UNPROVIDED);
                                    if (NIL != set_contents.set_contents_emptyP(support_set)) {
                                        support_sets = NIL;
                                        doneP = T;
                                    } else
                                        if (NIL != set_contents.set_contents_singletonP(support_set)) {
                                            support_sets = list(support_set);
                                            doneP = T;
                                        } else {
                                            support_sets = cons(support_set, support_sets);
                                        }

                                    csome_list_var = csome_list_var.rest();
                                    v_term = csome_list_var.first();
                                } 
                            }
                        }
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock($kb_hl_support_index_lock$.getGlobalValue());
                }
            }
            if (NIL != support_sets) {
                final SubLObject candidate_kb_hl_supports = (NIL != list_utilities.singletonP(support_sets)) ? support_sets.first() : set_utilities.set_contents_intersection(support_sets, symbol_function(EQ));
                if (NIL == set_contents.set_contents_emptyP(candidate_kb_hl_supports)) {
                    final SubLObject set_contents_var = candidate_kb_hl_supports;
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject candidate_kb_hl_support;
                    SubLObject candidate_sentence;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == kb_hl_support) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                        candidate_kb_hl_support = set_contents.do_set_contents_next(basis_object, state);
                        if ((NIL != set_contents.do_set_contents_element_validP(state, candidate_kb_hl_support)) && (NIL != kb_hl_support_handles.valid_kb_hl_supportP(candidate_kb_hl_support, UNPROVIDED))) {
                            candidate_sentence = kb_hl_supports_high.kb_hl_support_sentence(candidate_kb_hl_support);
                            if (candidate_sentence.equal(sentence)) {
                                kb_hl_support = candidate_kb_hl_support;
                            }
                        }
                    }
                }
            }
        } else {
            cdestructuring_bind_error(hl_support, $list29);
        }
        return kb_hl_support;
    }

    public static SubLObject lookup_kb_hl_supports_mentioning_term_int(final SubLObject v_term) {
        final SubLObject sentence_kb_hl_supports = lookup_kb_hl_supports_mentioning_term_in_sentence(v_term);
        final SubLObject mt_kb_hl_supports = lookup_kb_hl_supports_mentioning_term_in_mt(v_term);
        return set_contents.set_contents_element_list(set_utilities.set_contents_union(list(sentence_kb_hl_supports, mt_kb_hl_supports), symbol_function(EQ)));
    }

    public static SubLObject lookup_kb_hl_supports_mentioning_term_in_sentence(final SubLObject v_term) {
        return NIL != kb_hl_support_index_indexed_term_p(v_term) ? lookup_kb_hl_supports_mentioning_indexed_term_in_sentence(v_term) : lookup_kb_hl_supports_mentioning_unindexed_term_in_sentence(v_term);
    }

    public static SubLObject lookup_kb_hl_supports_mentioning_indexed_term_in_sentence(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject support_sets = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($kb_hl_support_index_lock$.getGlobalValue());
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($kb_hl_support_index$.getGlobalValue())); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject mt_index = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject iteration_state_$1;
                for (iteration_state_$1 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_index)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$1); iteration_state_$1 = dictionary_contents.do_dictionary_contents_next(iteration_state_$1)) {
                    thread.resetMultipleValues();
                    final SubLObject key_$2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$1);
                    final SubLObject tv_index = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    SubLObject iteration_state_$2;
                    for (iteration_state_$2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_index)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$2); iteration_state_$2 = dictionary_contents.do_dictionary_contents_next(iteration_state_$2)) {
                        thread.resetMultipleValues();
                        final SubLObject key_$3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$2);
                        final SubLObject term_index = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject support_set = dictionary.dictionary_lookup_without_values(term_index, v_term, UNPROVIDED);
                        if ((NIL != set_contents.set_contents_p(support_set)) && (NIL == set_contents.set_contents_emptyP(support_set))) {
                            support_sets = cons(support_set, support_sets);
                        }
                    }
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$2);
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$1);
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        } finally {
            if (NIL != release) {
                release_lock($kb_hl_support_index_lock$.getGlobalValue());
            }
        }
        return set_utilities.set_contents_union(support_sets, symbol_function(EQ));
    }

    public static SubLObject lookup_kb_hl_supports_mentioning_unindexed_term_in_sentence(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject kb_hl_supports = set_contents.new_set_contents(ZERO_INTEGER, symbol_function(EQ));
        final SubLObject idx = kb_hl_support_handles.do_kb_hl_supports_table();
        final SubLObject mess = $$$mapping_Cyc_KB_HL_supports;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$5 = idx;
                if (NIL == id_index_objects_empty_p(idx_$5, $SKIP)) {
                    final SubLObject idx_$6 = idx_$5;
                    if (NIL == id_index_dense_objects_empty_p(idx_$6, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$6);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject s_id;
                        SubLObject s_handle;
                        SubLObject kb_hl_support;
                        SubLObject sentence;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            s_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            s_handle = aref(vector_var, s_id);
                            if ((NIL == id_index_tombstone_p(s_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(s_handle)) {
                                    s_handle = $SKIP;
                                }
                                kb_hl_support = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id, s_handle);
                                sentence = kb_hl_supports_high.kb_hl_support_sentence(kb_hl_support);
                                if (NIL != list_utilities.simple_tree_find_via_equalP(v_term, sentence)) {
                                    set_contents.set_contents_add(kb_hl_support, kb_hl_supports, symbol_function(EQ));
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$7 = idx_$5;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$7)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$7);
                        SubLObject s_id2 = id_index_sparse_id_threshold(idx_$7);
                        final SubLObject end_id = id_index_next_id(idx_$7);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (s_id2.numL(end_id)) {
                            final SubLObject s_handle2 = gethash_without_values(s_id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(s_handle2))) {
                                final SubLObject kb_hl_support2 = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id2, s_handle2);
                                final SubLObject sentence2 = kb_hl_supports_high.kb_hl_support_sentence(kb_hl_support2);
                                if (NIL != list_utilities.simple_tree_find_via_equalP(v_term, sentence2)) {
                                    set_contents.set_contents_add(kb_hl_support2, kb_hl_supports, symbol_function(EQ));
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            s_id2 = add(s_id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return kb_hl_supports;
    }

    public static SubLObject lookup_kb_hl_supports_mentioning_term_in_mt(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject support_sets = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($kb_hl_support_index_lock$.getGlobalValue());
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($kb_hl_support_index$.getGlobalValue())); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject mt_index = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject iteration_state_$9;
                for (iteration_state_$9 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_index)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$9); iteration_state_$9 = dictionary_contents.do_dictionary_contents_next(iteration_state_$9)) {
                    thread.resetMultipleValues();
                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$9);
                    final SubLObject tv_index = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != list_utilities.simple_tree_find_via_equalP(v_term, mt)) {
                        SubLObject iteration_state_$10;
                        for (iteration_state_$10 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_index)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$10); iteration_state_$10 = dictionary_contents.do_dictionary_contents_next(iteration_state_$10)) {
                            thread.resetMultipleValues();
                            final SubLObject key_$11 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$10);
                            final SubLObject term_index = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            SubLObject iteration_state_$11;
                            for (iteration_state_$11 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(term_index)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$11); iteration_state_$11 = dictionary_contents.do_dictionary_contents_next(iteration_state_$11)) {
                                thread.resetMultipleValues();
                                final SubLObject key_$12 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$11);
                                final SubLObject support_set = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                support_sets = cons(support_set, support_sets);
                            }
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$11);
                        }
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$10);
                    }
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$9);
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        } finally {
            if (NIL != release) {
                release_lock($kb_hl_support_index_lock$.getGlobalValue());
            }
        }
        return set_utilities.set_contents_union(support_sets, symbol_function(EQ));
    }

    public static SubLObject index_kb_hl_support(final SubLObject kb_hl_support, final SubLObject hl_support) {
        SubLObject module = NIL;
        SubLObject sentence = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(hl_support, hl_support, $list29);
        module = hl_support.first();
        SubLObject current = hl_support.rest();
        destructuring_bind_must_consp(current, hl_support, $list29);
        sentence = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, hl_support, $list29);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, hl_support, $list29);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject release = NIL;
            try {
                release = seize_lock($kb_hl_support_index_lock$.getGlobalValue());
                SubLObject mt_index = dictionary.dictionary_lookup_without_values($kb_hl_support_index$.getGlobalValue(), module, UNPROVIDED);
                if (NIL == dictionary.dictionary_p(mt_index)) {
                    mt_index = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                    dictionary.dictionary_enter($kb_hl_support_index$.getGlobalValue(), module, mt_index);
                }
                SubLObject tv_index = dictionary.dictionary_lookup_without_values(mt_index, mt, UNPROVIDED);
                if (NIL == dictionary.dictionary_p(tv_index)) {
                    tv_index = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
                    dictionary.dictionary_enter(mt_index, mt, tv_index);
                }
                SubLObject term_index = dictionary.dictionary_lookup_without_values(tv_index, tv, UNPROVIDED);
                if (NIL == dictionary.dictionary_p(term_index)) {
                    term_index = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                    dictionary.dictionary_enter(tv_index, tv, term_index);
                }
                SubLObject cdolist_list_var;
                final SubLObject indexed_terms = cdolist_list_var = kb_hl_support_index_indexed_terms(sentence);
                SubLObject v_term = NIL;
                v_term = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject old_supports = dictionary.dictionary_lookup_without_values(term_index, v_term, UNPROVIDED);
                    final SubLObject new_supports = set_contents.set_contents_add(kb_hl_support, old_supports, symbol_function(EQ));
                    dictionary.dictionary_enter(term_index, v_term, new_supports);
                    cdolist_list_var = cdolist_list_var.rest();
                    v_term = cdolist_list_var.first();
                } 
            } finally {
                if (NIL != release) {
                    release_lock($kb_hl_support_index_lock$.getGlobalValue());
                }
            }
        } else {
            cdestructuring_bind_error(hl_support, $list29);
        }
        return kb_hl_support;
    }

    public static SubLObject unindex_kb_hl_support(final SubLObject kb_hl_support, SubLObject robustP) {
        if (robustP == UNPROVIDED) {
            robustP = NIL;
        }
        if (NIL != robustP) {
            unindex_kb_hl_support_without_hl_support(kb_hl_support);
        } else {
            final SubLObject hl_support = kb_hl_support_hl_support_int(kb_hl_support);
            if (NIL != arguments.hl_support_p(hl_support)) {
                unindex_kb_hl_support_with_hl_support(kb_hl_support, hl_support);
            } else {
                unindex_kb_hl_support_without_hl_support(kb_hl_support);
            }
        }
        return kb_hl_support;
    }

    public static SubLObject unindex_kb_hl_support_with_hl_support(final SubLObject kb_hl_support, final SubLObject hl_support) {
        SubLObject module = NIL;
        SubLObject sentence = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(hl_support, hl_support, $list29);
        module = hl_support.first();
        SubLObject current = hl_support.rest();
        destructuring_bind_must_consp(current, hl_support, $list29);
        sentence = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, hl_support, $list29);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, hl_support, $list29);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject release = NIL;
            try {
                release = seize_lock($kb_hl_support_index_lock$.getGlobalValue());
                final SubLObject mt_index = dictionary.dictionary_lookup_without_values($kb_hl_support_index$.getGlobalValue(), module, UNPROVIDED);
                if (NIL != dictionary.dictionary_p(mt_index)) {
                    final SubLObject tv_index = dictionary.dictionary_lookup_without_values(mt_index, mt, UNPROVIDED);
                    if (NIL != dictionary.dictionary_p(tv_index)) {
                        final SubLObject term_index = dictionary.dictionary_lookup_without_values(tv_index, tv, UNPROVIDED);
                        if (NIL != dictionary.dictionary_p(term_index)) {
                            SubLObject cdolist_list_var;
                            final SubLObject indexed_terms = cdolist_list_var = kb_hl_support_index_indexed_terms(sentence);
                            SubLObject v_term = NIL;
                            v_term = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                final SubLObject old_supports = dictionary.dictionary_lookup_without_values(term_index, v_term, UNPROVIDED);
                                final SubLObject new_supports = set_contents.set_contents_delete(kb_hl_support, old_supports, symbol_function(EQ));
                                if (NIL != set_contents.set_contents_emptyP(new_supports)) {
                                    dictionary.dictionary_remove(term_index, v_term);
                                } else {
                                    dictionary.dictionary_enter(term_index, v_term, new_supports);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                v_term = cdolist_list_var.first();
                            } 
                            if (NIL != dictionary.dictionary_empty_p(term_index)) {
                                dictionary.dictionary_remove(tv_index, tv);
                            }
                        }
                        if (NIL != dictionary.dictionary_empty_p(tv_index)) {
                            dictionary.dictionary_remove(mt_index, mt);
                        }
                    }
                    if (NIL != dictionary.dictionary_empty_p(mt_index)) {
                        dictionary.dictionary_remove($kb_hl_support_index$.getGlobalValue(), module);
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock($kb_hl_support_index_lock$.getGlobalValue());
                }
            }
        } else {
            cdestructuring_bind_error(hl_support, $list29);
        }
        return kb_hl_support;
    }

    public static SubLObject unindex_kb_hl_support_without_hl_support(final SubLObject kb_hl_support) {
        SubLObject release = NIL;
        try {
            release = seize_lock($kb_hl_support_index_lock$.getGlobalValue());
            SubLObject csome_list_var = map_utilities.map_keys($kb_hl_support_index$.getGlobalValue());
            SubLObject module = NIL;
            module = csome_list_var.first();
            while (NIL != csome_list_var) {
                final SubLObject mt_index = map_utilities.map_get_without_values($kb_hl_support_index$.getGlobalValue(), module, UNPROVIDED);
                if (NIL != map_utilities.map_p(mt_index)) {
                    SubLObject csome_list_var_$14 = map_utilities.map_keys(mt_index);
                    SubLObject mt = NIL;
                    mt = csome_list_var_$14.first();
                    while (NIL != csome_list_var_$14) {
                        final SubLObject tv_index = map_utilities.map_get_without_values(mt_index, mt, UNPROVIDED);
                        if (NIL != map_utilities.map_p(tv_index)) {
                            SubLObject csome_list_var_$15 = map_utilities.map_keys(tv_index);
                            SubLObject tv = NIL;
                            tv = csome_list_var_$15.first();
                            while (NIL != csome_list_var_$15) {
                                final SubLObject term_index = map_utilities.map_get_without_values(tv_index, tv, UNPROVIDED);
                                if (NIL != map_utilities.map_p(term_index)) {
                                    SubLObject csome_list_var_$16 = map_utilities.map_keys(term_index);
                                    SubLObject v_term = NIL;
                                    v_term = csome_list_var_$16.first();
                                    while (NIL != csome_list_var_$16) {
                                        final SubLObject supports = map_utilities.map_get_without_values(term_index, v_term, UNPROVIDED);
                                        final SubLObject new_supports = set_contents.set_contents_delete(kb_hl_support, supports, symbol_function(EQ));
                                        if (NIL != set_contents.set_contents_emptyP(new_supports)) {
                                            map_utilities.map_remove(term_index, v_term);
                                        } else {
                                            map_utilities.map_put(term_index, v_term, new_supports);
                                        }
                                        csome_list_var_$16 = csome_list_var_$16.rest();
                                        v_term = csome_list_var_$16.first();
                                    } 
                                    if (NIL != map_utilities.map_empty_p(term_index)) {
                                        map_utilities.map_remove(tv_index, tv);
                                    }
                                }
                                csome_list_var_$15 = csome_list_var_$15.rest();
                                tv = csome_list_var_$15.first();
                            } 
                            if (NIL != map_utilities.map_empty_p(tv_index)) {
                                map_utilities.map_remove(mt_index, mt);
                            }
                        }
                        csome_list_var_$14 = csome_list_var_$14.rest();
                        mt = csome_list_var_$14.first();
                    } 
                    if (NIL != map_utilities.map_empty_p(mt_index)) {
                        map_utilities.map_remove($kb_hl_support_index$.getGlobalValue(), module);
                    }
                }
                csome_list_var = csome_list_var.rest();
                module = csome_list_var.first();
            } 
        } finally {
            if (NIL != release) {
                release_lock($kb_hl_support_index_lock$.getGlobalValue());
            }
        }
        return kb_hl_support;
    }

    public static SubLObject clear_kb_hl_support_index() {
        dictionary.clear_dictionary($kb_hl_support_index$.getGlobalValue());
        return NIL;
    }

    public static SubLObject reindex_all_kb_hl_supports() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_kb_hl_support_index();
        final SubLObject idx = kb_hl_support_handles.do_kb_hl_supports_table();
        final SubLObject mess = $$$reindexing_KB_HL_supports;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$17 = idx;
                if (NIL == id_index_objects_empty_p(idx_$17, $SKIP)) {
                    final SubLObject idx_$18 = idx_$17;
                    if (NIL == id_index_dense_objects_empty_p(idx_$18, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$18);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject s_id;
                        SubLObject s_handle;
                        SubLObject kb_hl_support;
                        SubLObject hl_support;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            s_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            s_handle = aref(vector_var, s_id);
                            if ((NIL == id_index_tombstone_p(s_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(s_handle)) {
                                    s_handle = $SKIP;
                                }
                                kb_hl_support = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id, s_handle);
                                hl_support = kb_hl_support_hl_support_int(kb_hl_support);
                                index_kb_hl_support(kb_hl_support, hl_support);
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$19 = idx_$17;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$19)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$19);
                        SubLObject s_id2 = id_index_sparse_id_threshold(idx_$19);
                        final SubLObject end_id = id_index_next_id(idx_$19);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (s_id2.numL(end_id)) {
                            final SubLObject s_handle2 = gethash_without_values(s_id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(s_handle2))) {
                                final SubLObject kb_hl_support2 = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id2, s_handle2);
                                final SubLObject hl_support2 = kb_hl_support_hl_support_int(kb_hl_support2);
                                index_kb_hl_support(kb_hl_support2, hl_support2);
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            s_id2 = add(s_id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject destroy_duplicate_kb_hl_supports() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_hl_supports = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        SubLObject destroyed_count = ZERO_INTEGER;
        final SubLObject idx = kb_hl_support_handles.do_kb_hl_supports_table();
        final SubLObject mess = $str34$Eliminating_duplicate_KB_HL_suppo;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$21 = idx;
                if (NIL == id_index_objects_empty_p(idx_$21, $SKIP)) {
                    final SubLObject idx_$22 = idx_$21;
                    if (NIL == id_index_dense_objects_empty_p(idx_$22, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$22);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject s_id;
                        SubLObject s_handle;
                        SubLObject kb_hl_support;
                        SubLObject hl_support;
                        SubLObject preferred_kb_hl_support;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            s_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            s_handle = aref(vector_var, s_id);
                            if ((NIL == id_index_tombstone_p(s_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(s_handle)) {
                                    s_handle = $SKIP;
                                }
                                kb_hl_support = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id, s_handle);
                                hl_support = kb_hl_support_hl_support_int(kb_hl_support);
                                preferred_kb_hl_support = dictionary.dictionary_lookup_without_values(v_hl_supports, hl_support, UNPROVIDED);
                                if (NIL != preferred_kb_hl_support) {
                                    destroy_duplicate_kb_hl_support(preferred_kb_hl_support, kb_hl_support);
                                    destroyed_count = add(destroyed_count, ONE_INTEGER);
                                } else {
                                    dictionary.dictionary_enter(v_hl_supports, hl_support, kb_hl_support);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$23 = idx_$21;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$23)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$23);
                        SubLObject s_id2 = id_index_sparse_id_threshold(idx_$23);
                        final SubLObject end_id = id_index_next_id(idx_$23);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (s_id2.numL(end_id)) {
                            final SubLObject s_handle2 = gethash_without_values(s_id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(s_handle2))) {
                                final SubLObject kb_hl_support2 = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id2, s_handle2);
                                final SubLObject hl_support2 = kb_hl_support_hl_support_int(kb_hl_support2);
                                final SubLObject preferred_kb_hl_support2 = dictionary.dictionary_lookup_without_values(v_hl_supports, hl_support2, UNPROVIDED);
                                if (NIL != preferred_kb_hl_support2) {
                                    destroy_duplicate_kb_hl_support(preferred_kb_hl_support2, kb_hl_support2);
                                    destroyed_count = add(destroyed_count, ONE_INTEGER);
                                } else {
                                    dictionary.dictionary_enter(v_hl_supports, hl_support2, kb_hl_support2);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            s_id2 = add(s_id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$24 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return destroyed_count;
    }

    public static SubLObject destroy_duplicate_kb_hl_support(final SubLObject preferred_kb_hl_support, final SubLObject duplicate_kb_hl_support) {
        SubLObject cdolist_list_var;
        final SubLObject dependents = cdolist_list_var = kb_hl_support_handles.kb_hl_support_dependents_int(duplicate_kb_hl_support);
        SubLObject dependent = NIL;
        dependent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            kb_hl_support_remove_dependent_int(duplicate_kb_hl_support, dependent);
            final SubLObject old_supports = deductions_high.deduction_supports(dependent);
            final SubLObject new_supports = nsubstitute(preferred_kb_hl_support, duplicate_kb_hl_support, old_supports, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            deductions_low.reset_deduction_supports(dependent, new_supports);
            kb_hl_support_add_dependent_int(preferred_kb_hl_support, dependent);
            cdolist_list_var = cdolist_list_var.rest();
            dependent = cdolist_list_var.first();
        } 
        destroy_kb_hl_support_int(duplicate_kb_hl_support);
        return preferred_kb_hl_support;
    }

    public static SubLObject kb_hl_support_has_dependentsP(final SubLObject kb_hl_support) {
        return NIL != kb_hl_supports_interface.kb_kb_hl_support_dependents(kb_hl_support) ? T : NIL;
    }

    public static SubLObject declare_kb_hl_supports_low_file() {
        declareFunction("kb_hl_support_content_print_function_trampoline", "KB-HL-SUPPORT-CONTENT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("kb_hl_support_content_p", "KB-HL-SUPPORT-CONTENT-P", 1, 0, false);
        new kb_hl_supports_low.$kb_hl_support_content_p$UnaryFunction();
        declareFunction("kb_hlsc_argument", "KB-HLSC-ARGUMENT", 1, 0, false);
        declareFunction("kb_hlsc_dependents", "KB-HLSC-DEPENDENTS", 1, 0, false);
        declareFunction("_csetf_kb_hlsc_argument", "_CSETF-KB-HLSC-ARGUMENT", 2, 0, false);
        declareFunction("_csetf_kb_hlsc_dependents", "_CSETF-KB-HLSC-DEPENDENTS", 2, 0, false);
        declareFunction("make_kb_hl_support_content", "MAKE-KB-HL-SUPPORT-CONTENT", 0, 1, false);
        declareFunction("visit_defstruct_kb_hl_support_content", "VISIT-DEFSTRUCT-KB-HL-SUPPORT-CONTENT", 2, 0, false);
        declareFunction("visit_defstruct_object_kb_hl_support_content_method", "VISIT-DEFSTRUCT-OBJECT-KB-HL-SUPPORT-CONTENT-METHOD", 2, 0, false);
        declareFunction("new_kb_hl_support_content", "NEW-KB-HL-SUPPORT-CONTENT", 0, 0, false);
        declareFunction("free_kb_hl_support_content", "FREE-KB-HL-SUPPORT-CONTENT", 1, 0, false);
        declareFunction("kb_hl_support_content_get_argument", "KB-HL-SUPPORT-CONTENT-GET-ARGUMENT", 1, 0, false);
        declareFunction("kb_hl_support_content_get_dependents", "KB-HL-SUPPORT-CONTENT-GET-DEPENDENTS", 1, 0, false);
        declareFunction("kb_hl_support_content_set_argument", "KB-HL-SUPPORT-CONTENT-SET-ARGUMENT", 2, 0, false);
        declareFunction("kb_hl_support_content_set_dependents", "KB-HL-SUPPORT-CONTENT-SET-DEPENDENTS", 2, 0, false);
        declareFunction("dump_kb_hl_support_content", "DUMP-KB-HL-SUPPORT-CONTENT", 2, 0, false);
        declareFunction("load_kb_hl_support_content", "LOAD-KB-HL-SUPPORT-CONTENT", 2, 0, false);
        declareFunction("kb_create_kb_hl_support_kb_store", "KB-CREATE-KB-HL-SUPPORT-KB-STORE", 2, 0, false);
        declareFunction("kb_create_kb_hl_support_int", "KB-CREATE-KB-HL-SUPPORT-INT", 4, 0, false);
        declareFunction("kb_create_kb_hl_support_cyc", "KB-CREATE-KB-HL-SUPPORT-CYC", 1, 0, false);
        declareFunction("kb_hl_support_content", "KB-HL-SUPPORT-CONTENT", 1, 0, false);
        declareFunction("kb_hl_support_hl_support_int", "KB-HL-SUPPORT-HL-SUPPORT-INT", 1, 0, false);
        declareFunction("kb_hl_support_add_dependent_int", "KB-HL-SUPPORT-ADD-DEPENDENT-INT", 2, 0, false);
        declareFunction("kb_hl_support_remove_dependent_int", "KB-HL-SUPPORT-REMOVE-DEPENDENT-INT", 2, 0, false);
        declareFunction("kb_hl_support_clear_dependents_int", "KB-HL-SUPPORT-CLEAR-DEPENDENTS-INT", 1, 0, false);
        declareFunction("kb_hl_support_remove_argument_int", "KB-HL-SUPPORT-REMOVE-ARGUMENT-INT", 1, 0, false);
        declareFunction("kb_hl_support_reset_argument_int", "KB-HL-SUPPORT-RESET-ARGUMENT-INT", 2, 0, false);
        declareFunction("kb_hl_support_reset_justification", "KB-HL-SUPPORT-RESET-JUSTIFICATION", 2, 0, false);
        declareFunction("rejustify_kb_hl_support_int", "REJUSTIFY-KB-HL-SUPPORT-INT", 1, 0, false);
        declareFunction("remove_kb_hl_support_int", "REMOVE-KB-HL-SUPPORT-INT", 1, 0, false);
        declareFunction("valid_kb_hl_support_contentP", "VALID-KB-HL-SUPPORT-CONTENT?", 1, 1, false);
        declareFunction("kb_hl_support_content_validP", "KB-HL-SUPPORT-CONTENT-VALID?", 1, 1, false);
        declareFunction("note_kb_hl_support_creation_started", "NOTE-KB-HL-SUPPORT-CREATION-STARTED", 2, 0, false);
        declareFunction("note_kb_hl_support_creation_complete", "NOTE-KB-HL-SUPPORT-CREATION-COMPLETE", 1, 0, false);
        declareFunction("find_kb_hl_support_during_creation_int", "FIND-KB-HL-SUPPORT-DURING-CREATION-INT", 1, 0, false);
        declareFunction("destroy_kb_hl_support_int", "DESTROY-KB-HL-SUPPORT-INT", 1, 0, false);
        declareFunction("kb_hl_support_index_unindexed_termP", "KB-HL-SUPPORT-INDEX-UNINDEXED-TERM?", 1, 0, false);
        new kb_hl_supports_low.$kb_hl_support_index_unindexed_termP$UnaryFunction();
        declareFunction("kb_hl_support_index_indexed_term_p", "KB-HL-SUPPORT-INDEX-INDEXED-TERM-P", 1, 0, false);
        declareFunction("kb_hl_support_index_indexed_terms", "KB-HL-SUPPORT-INDEX-INDEXED-TERMS", 1, 0, false);
        declareFunction("lookup_kb_hl_support_int", "LOOKUP-KB-HL-SUPPORT-INT", 1, 0, false);
        declareFunction("lookup_kb_hl_supports_mentioning_term_int", "LOOKUP-KB-HL-SUPPORTS-MENTIONING-TERM-INT", 1, 0, false);
        declareFunction("lookup_kb_hl_supports_mentioning_term_in_sentence", "LOOKUP-KB-HL-SUPPORTS-MENTIONING-TERM-IN-SENTENCE", 1, 0, false);
        declareFunction("lookup_kb_hl_supports_mentioning_indexed_term_in_sentence", "LOOKUP-KB-HL-SUPPORTS-MENTIONING-INDEXED-TERM-IN-SENTENCE", 1, 0, false);
        declareFunction("lookup_kb_hl_supports_mentioning_unindexed_term_in_sentence", "LOOKUP-KB-HL-SUPPORTS-MENTIONING-UNINDEXED-TERM-IN-SENTENCE", 1, 0, false);
        declareFunction("lookup_kb_hl_supports_mentioning_term_in_mt", "LOOKUP-KB-HL-SUPPORTS-MENTIONING-TERM-IN-MT", 1, 0, false);
        declareFunction("index_kb_hl_support", "INDEX-KB-HL-SUPPORT", 2, 0, false);
        declareFunction("unindex_kb_hl_support", "UNINDEX-KB-HL-SUPPORT", 1, 1, false);
        declareFunction("unindex_kb_hl_support_with_hl_support", "UNINDEX-KB-HL-SUPPORT-WITH-HL-SUPPORT", 2, 0, false);
        declareFunction("unindex_kb_hl_support_without_hl_support", "UNINDEX-KB-HL-SUPPORT-WITHOUT-HL-SUPPORT", 1, 0, false);
        declareFunction("clear_kb_hl_support_index", "CLEAR-KB-HL-SUPPORT-INDEX", 0, 0, false);
        declareFunction("reindex_all_kb_hl_supports", "REINDEX-ALL-KB-HL-SUPPORTS", 0, 0, false);
        declareFunction("destroy_duplicate_kb_hl_supports", "DESTROY-DUPLICATE-KB-HL-SUPPORTS", 0, 0, false);
        declareFunction("destroy_duplicate_kb_hl_support", "DESTROY-DUPLICATE-KB-HL-SUPPORT", 2, 0, false);
        declareFunction("kb_hl_support_has_dependentsP", "KB-HL-SUPPORT-HAS-DEPENDENTS?", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_kb_hl_supports_low_file() {
        defconstant("*DTP-KB-HL-SUPPORT-CONTENT*", KB_HL_SUPPORT_CONTENT);
        deflexical("*KB-HL-SUPPORTS-BEING-CREATED*", SubLTrampolineFile.maybeDefault($kb_hl_supports_being_created$, $kb_hl_supports_being_created$, NIL));
        deflexical("*KB-HL-SUPPORT-INDEX*", SubLTrampolineFile.maybeDefault($kb_hl_support_index$, $kb_hl_support_index$, NIL));
        deflexical("*KB-HL-SUPPORT-INDEX-LOCK*", make_lock($$$KB_HL_support_indexing_lock));
        deflexical("*KB-HL-SUPPORT-INDEX-UNINDEXED-TERMS*", $list26);
        return NIL;
    }

    public static SubLObject setup_kb_hl_supports_low_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_kb_hl_support_content$.getGlobalValue(), symbol_function(KB_HL_SUPPORT_CONTENT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(KB_HLSC_ARGUMENT, _CSETF_KB_HLSC_ARGUMENT);
        def_csetf(KB_HLSC_DEPENDENTS, _CSETF_KB_HLSC_DEPENDENTS);
        identity(KB_HL_SUPPORT_CONTENT);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_kb_hl_support_content$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_KB_HL_SUPPORT_CONTENT_METHOD));
        declare_defglobal($kb_hl_supports_being_created$);
        declare_defglobal($kb_hl_support_index$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_kb_hl_supports_low_file();
    }

    @Override
    public void initializeVariables() {
        init_kb_hl_supports_low_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_kb_hl_supports_low_file();
    }

    static {









































    }

    public static final class $kb_hl_support_content_native extends SubLStructNative {
        public SubLObject $argument;

        public SubLObject $dependents;

        private static final SubLStructDeclNative structDecl;

        private $kb_hl_support_content_native() {
            this.$argument = Lisp.NIL;
            this.$dependents = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$argument;
        }

        @Override
        public SubLObject getField3() {
            return this.$dependents;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$argument = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$dependents = value;
        }

        static {
            structDecl = makeStructDeclNative($kb_hl_support_content_native.class, KB_HL_SUPPORT_CONTENT, KB_HL_SUPPORT_CONTENT_P, $list2, $list3, new String[]{ "$argument", "$dependents" }, $list4, $list5, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $kb_hl_support_content_p$UnaryFunction extends UnaryFunction {
        public $kb_hl_support_content_p$UnaryFunction() {
            super(extractFunctionNamed("KB-HL-SUPPORT-CONTENT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return kb_hl_support_content_p(arg1);
        }
    }

    public static final class $kb_hl_support_index_unindexed_termP$UnaryFunction extends UnaryFunction {
        public $kb_hl_support_index_unindexed_termP$UnaryFunction() {
            super(extractFunctionNamed("KB-HL-SUPPORT-INDEX-UNINDEXED-TERM?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return kb_hl_support_index_unindexed_termP(arg1);
        }
    }
}

/**
 * Total time: 464 ms
 */
