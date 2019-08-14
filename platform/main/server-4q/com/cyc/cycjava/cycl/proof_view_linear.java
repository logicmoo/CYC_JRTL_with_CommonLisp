package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.booleanp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class proof_view_linear extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new proof_view_linear();

    public static final String myName = "com.cyc.cycjava_2.cycl.proof_view_linear";


    // defparameter
    private static final SubLSymbol $proof_view_linear_section_max_depth$ = makeSymbol("*PROOF-VIEW-LINEAR-SECTION-MAX-DEPTH*");



    private static final SubLSymbol $LINEAR_ROOT = makeKeyword("LINEAR-ROOT");

    private static final SubLSymbol PROOF_VIEW_ADD_LINEAR_SECTION = makeSymbol("PROOF-VIEW-ADD-LINEAR-SECTION");

    private static final SubLSymbol $LINEAR = makeKeyword("LINEAR");

    private static final SubLObject $$CycProofViewLinearSection = reader_make_constant_shell(makeString("CycProofViewLinearSection"));



    private static final SubLString $str6$Rule__ = makeString("Rule: ");



    private static final SubLString $str8$Reached_linear_depth_cutoff_of__D = makeString("Reached linear depth cutoff of ~D.~% Pruning supports for~% ~S");

    private static final SubLString $str9$ = makeString("");



    private static final SubLString $str11$Therefore_ = makeString("Therefore:");





    private static final SubLSymbol PROOF_VIEW_ENTRY_GET_OBJECT_TYPE = makeSymbol("PROOF-VIEW-ENTRY-GET-OBJECT-TYPE");

    private static final SubLSymbol $sym15$_ = makeSymbol("<");

    private static final SubLSymbol PROOF_VIEW_ENTRY_GET_ID = makeSymbol("PROOF-VIEW-ENTRY-GET-ID");



    private static final SubLSymbol PROOF_VIEW_BUILD_LINEAR_SECTION = makeSymbol("PROOF-VIEW-BUILD-LINEAR-SECTION");

    private static final SubLString $str19$Reusing_linear_entry_for__S = makeString("Reusing linear entry for ~S");



    private static final SubLList $list21 = list(makeKeyword("FN"), makeSymbol("ADD-LINEAR-ENTRY"));

    private static final SubLString $str22$Pruning_supports_for__S = makeString("Pruning supports for ~S");

    private static final SubLSymbol PROOF_VIEW_LINEAR_SECTION_VALID_OBJECT_TYPE_P = makeSymbol("PROOF-VIEW-LINEAR-SECTION-VALID-OBJECT-TYPE-P");















    private static final SubLString $str31$Unrecognized_linear_section_objec = makeString("Unrecognized linear section object type: ~S");

    public static SubLObject proof_view_add_linear_section(final SubLObject v_proof_view) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject justification_root_entry = proof_view.proof_view_get_property(v_proof_view, $JUSTIFICATION_ROOT, UNPROVIDED);
        final SubLObject linear_root_entry = proof_view_populator.proof_view_add_section_root(v_proof_view, proof_view.$proof_view_linear_label$.getDynamicValue(thread));
        proof_view_build_linear_section(linear_root_entry, justification_root_entry, v_proof_view, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        proof_view_populator.proof_view_entry_note_expand_initially(linear_root_entry);
        if (NIL != list_utilities.lengthG(proof_view.proof_view_entry_get_children(linear_root_entry), ONE_INTEGER, UNPROVIDED)) {
            proof_view.proof_view_set_property(v_proof_view, $LINEAR_ROOT, linear_root_entry);
        } else {
            proof_view_populator.proof_view_remove_entry(v_proof_view, linear_root_entry);
        }
        return linear_root_entry;
    }

    public static SubLObject proof_view_get_include_linear_sectionP(final SubLObject v_proof_view) {
        return set.set_memberP($LINEAR, proof_view_populator.proof_view_special_sections_to_include(v_proof_view));
    }

    public static SubLObject proof_view_set_include_linear_sectionP(final SubLObject v_proof_view, final SubLObject include_linear_sectionP) {
        assert NIL != booleanp(include_linear_sectionP) : "Types.booleanp(include_linear_sectionP) " + "CommonSymbols.NIL != Types.booleanp(include_linear_sectionP) " + include_linear_sectionP;
        final SubLObject special_sections = proof_view_populator.proof_view_special_sections_to_include(v_proof_view);
        if (NIL != include_linear_sectionP) {
            set.set_add($LINEAR, special_sections);
        } else {
            set.set_remove($LINEAR, special_sections);
        }
        return special_sections;
    }

    public static SubLObject proof_view_has_linear_sectionP(final SubLObject v_proof_view) {
        return proof_view.proof_view_has_sectionP(v_proof_view, $LINEAR_ROOT);
    }

    public static SubLObject proof_view_build_linear_section(final SubLObject linear_root_entry, final SubLObject justification_entry, final SubLObject v_proof_view, SubLObject depth, SubLObject isg, SubLObject detailed_to_linear_map) {
        if (depth == UNPROVIDED) {
            depth = ZERO_INTEGER;
        }
        if (isg == UNPROVIDED) {
            isg = integer_sequence_generator.new_integer_sequence_generator(ONE_INTEGER, UNPROVIDED, UNPROVIDED);
        }
        if (detailed_to_linear_map == UNPROVIDED) {
            detailed_to_linear_map = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = proof_view.proof_view_entry_get_children(justification_entry);
        SubLObject child = NIL;
        child = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != proof_view.proof_view_rule_support_entryP(child)) {
                add_linear_entry(v_proof_view, $str6$Rule__, linear_root_entry, $RULE, child, isg, detailed_to_linear_map);
            } else
                if (depth.numGE($proof_view_linear_section_max_depth$.getDynamicValue(thread))) {
                    if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                        Errors.warn($str8$Reached_linear_depth_cutoff_of__D, $proof_view_linear_section_max_depth$.getDynamicValue(thread), proof_view.proof_view_entry_get_object(child));
                    }
                    add_linear_entry(v_proof_view, $str9$, linear_root_entry, $PREMISE, child, isg, detailed_to_linear_map);
                } else
                    if (NIL != proof_view_linear_section_show_supportsP(child)) {
                        proof_view_build_linear_section(linear_root_entry, child, v_proof_view, number_utilities.f_1X(depth), isg, detailed_to_linear_map);
                        final SubLObject conclusion = add_linear_entry(v_proof_view, $str11$Therefore_, linear_root_entry, $CONCLUSION, child, isg, detailed_to_linear_map);
                        SubLObject from = NIL;
                        if (NIL == find($FROM, proof_view.proof_view_entry_get_children(conclusion), symbol_function(EQL), PROOF_VIEW_ENTRY_GET_OBJECT_TYPE, UNPROVIDED, UNPROVIDED)) {
                            SubLObject cdolist_list_var_$1 = proof_view.proof_view_entry_get_children(child);
                            SubLObject grandchild = NIL;
                            grandchild = cdolist_list_var_$1.first();
                            while (NIL != cdolist_list_var_$1) {
                                from = cons(dictionary.dictionary_lookup(detailed_to_linear_map, grandchild, UNPROVIDED), from);
                                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                                grandchild = cdolist_list_var_$1.first();
                            } 
                            proof_view_populator.proof_view_add_new_entry(v_proof_view, $str9$, conclusion, $FROM, Sort.sort(from, symbol_function($sym15$_), PROOF_VIEW_ENTRY_GET_ID), list($FN, PROOF_VIEW_BUILD_LINEAR_SECTION));
                        }
                    } else {
                        add_linear_entry(v_proof_view, $str9$, linear_root_entry, $PREMISE, child, isg, detailed_to_linear_map);
                    }


            cdolist_list_var = cdolist_list_var.rest();
            child = cdolist_list_var.first();
        } 
        return linear_root_entry;
    }

    public static SubLObject add_linear_entry(final SubLObject v_proof_view, final SubLObject label, final SubLObject parent, final SubLObject object_type, final SubLObject detailed_entry, final SubLObject isg, final SubLObject detailed_to_linear_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject linear_entry = NIL;
        final SubLObject obj = proof_view.proof_view_entry_get_object(detailed_entry);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(detailed_to_linear_map)); (NIL == linear_entry) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject other_detailed_entry = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject existing_linear = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (proof_view.proof_view_entry_get_object(other_detailed_entry).eql(obj)) {
                if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                    Errors.warn($str19$Reusing_linear_entry_for__S, obj);
                }
                linear_entry = existing_linear;
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        if (NIL == linear_entry) {
            linear_entry = proof_view_populator.proof_view_add_new_entry(v_proof_view, label, parent, object_type, detailed_entry, listS($LINEAR_ID, integer_sequence_generator.integer_sequence_generator_next(isg), $list21));
        }
        dictionary.dictionary_enter(detailed_to_linear_map, detailed_entry, linear_entry);
        return linear_entry;
    }

    public static SubLObject proof_view_linear_section_show_supportsP(final SubLObject entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject obj = proof_view.proof_view_entry_get_object(entry);
        if (NIL != proof_view.proof_view_transitive_support_p(obj)) {
            if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                Errors.warn($str22$Pruning_supports_for__S, obj);
            }
            return NIL;
        }
        if (NIL != find_if(PROOF_VIEW_LINEAR_SECTION_VALID_OBJECT_TYPE_P, proof_view.proof_view_entry_get_children(entry), PROOF_VIEW_ENTRY_GET_OBJECT_TYPE, UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject proof_view_linear_section_valid_object_type_p(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((obj.eql(SUPPORT_P) || obj.eql(ASSERTION_P)) || obj.eql(EL_SENTENCE_P)) {
            return T;
        }
        if (((obj.eql($ASSERTION_BOOKKEEPING) || obj.eql($UNSUPPORTED_SUPPORT)) || obj.eql($CIRCULAR_SUPPORT)) || obj.eql($GIVEN)) {
            return NIL;
        }
        if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
            Errors.warn($str31$Unrecognized_linear_section_objec, obj);
        }
        return NIL;
    }

    public static SubLObject declare_proof_view_linear_file() {
        declareFunction("proof_view_add_linear_section", "PROOF-VIEW-ADD-LINEAR-SECTION", 1, 0, false);
        declareFunction("proof_view_get_include_linear_sectionP", "PROOF-VIEW-GET-INCLUDE-LINEAR-SECTION?", 1, 0, false);
        declareFunction("proof_view_set_include_linear_sectionP", "PROOF-VIEW-SET-INCLUDE-LINEAR-SECTION?", 2, 0, false);
        declareFunction("proof_view_has_linear_sectionP", "PROOF-VIEW-HAS-LINEAR-SECTION?", 1, 0, false);
        declareFunction("proof_view_build_linear_section", "PROOF-VIEW-BUILD-LINEAR-SECTION", 3, 3, false);
        declareFunction("add_linear_entry", "ADD-LINEAR-ENTRY", 7, 0, false);
        declareFunction("proof_view_linear_section_show_supportsP", "PROOF-VIEW-LINEAR-SECTION-SHOW-SUPPORTS?", 1, 0, false);
        declareFunction("proof_view_linear_section_valid_object_type_p", "PROOF-VIEW-LINEAR-SECTION-VALID-OBJECT-TYPE-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_proof_view_linear_file() {
        defparameter("*PROOF-VIEW-LINEAR-SECTION-MAX-DEPTH*", THREE_INTEGER);
        return NIL;
    }

    public static SubLObject setup_proof_view_linear_file() {
        note_funcall_helper_function(PROOF_VIEW_ADD_LINEAR_SECTION);
        proof_view_populator.note_proof_view_special_section_populator(PROOF_VIEW_ADD_LINEAR_SECTION, $LINEAR, T, $$CycProofViewLinearSection);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_proof_view_linear_file();
    }

    @Override
    public void initializeVariables() {
        init_proof_view_linear_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_proof_view_linear_file();
    }

    static {


































    }
}

/**
 * Total time: 104 ms
 */
