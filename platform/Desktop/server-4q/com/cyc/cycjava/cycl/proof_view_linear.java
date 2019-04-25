package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class proof_view_linear extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.proof_view_linear";
    public static final String myFingerPrint = "73b3cac0f879ed3081d63f51f60bb91c4ae832c234b7bd8375334dcccf09169c";
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-linear.lisp", position = 2143L)
    private static SubLSymbol $proof_view_linear_section_max_depth$;
    private static final SubLSymbol $kw0$JUSTIFICATION_ROOT;
    private static final SubLSymbol $kw1$LINEAR_ROOT;
    private static final SubLSymbol $sym2$PROOF_VIEW_ADD_LINEAR_SECTION;
    private static final SubLSymbol $kw3$LINEAR;
    private static final SubLObject $const4$CycProofViewLinearSection;
    private static final SubLSymbol $sym5$BOOLEANP;
    private static final SubLString $str6$Rule__;
    private static final SubLSymbol $kw7$RULE;
    private static final SubLString $str8$Reached_linear_depth_cutoff_of__D;
    private static final SubLString $str9$;
    private static final SubLSymbol $kw10$PREMISE;
    private static final SubLString $str11$Therefore_;
    private static final SubLSymbol $kw12$CONCLUSION;
    private static final SubLSymbol $kw13$FROM;
    private static final SubLSymbol $sym14$PROOF_VIEW_ENTRY_GET_OBJECT_TYPE;
    private static final SubLSymbol $sym15$_;
    private static final SubLSymbol $sym16$PROOF_VIEW_ENTRY_GET_ID;
    private static final SubLSymbol $kw17$FN;
    private static final SubLSymbol $sym18$PROOF_VIEW_BUILD_LINEAR_SECTION;
    private static final SubLString $str19$Reusing_linear_entry_for__S;
    private static final SubLSymbol $kw20$LINEAR_ID;
    private static final SubLList $list21;
    private static final SubLString $str22$Pruning_supports_for__S;
    private static final SubLSymbol $sym23$PROOF_VIEW_LINEAR_SECTION_VALID_OBJECT_TYPE_P;
    private static final SubLSymbol $sym24$SUPPORT_P;
    private static final SubLSymbol $sym25$ASSERTION_P;
    private static final SubLSymbol $sym26$EL_SENTENCE_P;
    private static final SubLSymbol $kw27$ASSERTION_BOOKKEEPING;
    private static final SubLSymbol $kw28$UNSUPPORTED_SUPPORT;
    private static final SubLSymbol $kw29$CIRCULAR_SUPPORT;
    private static final SubLSymbol $kw30$GIVEN;
    private static final SubLString $str31$Unrecognized_linear_section_objec;
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-linear.lisp", position = 814L)
    public static SubLObject proof_view_add_linear_section(final SubLObject v_proof_view) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject justification_root_entry = proof_view.proof_view_get_property(v_proof_view, (SubLObject)proof_view_linear.$kw0$JUSTIFICATION_ROOT, (SubLObject)proof_view_linear.UNPROVIDED);
        final SubLObject linear_root_entry = proof_view_populator.proof_view_add_section_root(v_proof_view, proof_view.$proof_view_linear_label$.getDynamicValue(thread));
        proof_view_build_linear_section(linear_root_entry, justification_root_entry, v_proof_view, (SubLObject)proof_view_linear.UNPROVIDED, (SubLObject)proof_view_linear.UNPROVIDED, (SubLObject)proof_view_linear.UNPROVIDED);
        proof_view_populator.proof_view_entry_note_expand_initially(linear_root_entry);
        if (proof_view_linear.NIL != list_utilities.lengthG(proof_view.proof_view_entry_get_children(linear_root_entry), (SubLObject)proof_view_linear.ONE_INTEGER, (SubLObject)proof_view_linear.UNPROVIDED)) {
            proof_view.proof_view_set_property(v_proof_view, (SubLObject)proof_view_linear.$kw1$LINEAR_ROOT, linear_root_entry);
        }
        else {
            proof_view_populator.proof_view_remove_entry(v_proof_view, linear_root_entry);
        }
        return linear_root_entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-linear.lisp", position = 1512L)
    public static SubLObject proof_view_get_include_linear_sectionP(final SubLObject v_proof_view) {
        return set.set_memberP((SubLObject)proof_view_linear.$kw3$LINEAR, proof_view_populator.proof_view_special_sections_to_include(v_proof_view));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-linear.lisp", position = 1663L)
    public static SubLObject proof_view_set_include_linear_sectionP(final SubLObject v_proof_view, final SubLObject include_linear_sectionP) {
        assert proof_view_linear.NIL != Types.booleanp(include_linear_sectionP) : include_linear_sectionP;
        final SubLObject special_sections = proof_view_populator.proof_view_special_sections_to_include(v_proof_view);
        if (proof_view_linear.NIL != include_linear_sectionP) {
            set.set_add((SubLObject)proof_view_linear.$kw3$LINEAR, special_sections);
        }
        else {
            set.set_remove((SubLObject)proof_view_linear.$kw3$LINEAR, special_sections);
        }
        return special_sections;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-linear.lisp", position = 2024L)
    public static SubLObject proof_view_has_linear_sectionP(final SubLObject v_proof_view) {
        return proof_view.proof_view_has_sectionP(v_proof_view, (SubLObject)proof_view_linear.$kw1$LINEAR_ROOT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-linear.lisp", position = 2207L)
    public static SubLObject proof_view_build_linear_section(final SubLObject linear_root_entry, final SubLObject justification_entry, final SubLObject v_proof_view, SubLObject depth, SubLObject isg, SubLObject detailed_to_linear_map) {
        if (depth == proof_view_linear.UNPROVIDED) {
            depth = (SubLObject)proof_view_linear.ZERO_INTEGER;
        }
        if (isg == proof_view_linear.UNPROVIDED) {
            isg = integer_sequence_generator.new_integer_sequence_generator((SubLObject)proof_view_linear.ONE_INTEGER, (SubLObject)proof_view_linear.UNPROVIDED, (SubLObject)proof_view_linear.UNPROVIDED);
        }
        if (detailed_to_linear_map == proof_view_linear.UNPROVIDED) {
            detailed_to_linear_map = dictionary.new_dictionary((SubLObject)proof_view_linear.UNPROVIDED, (SubLObject)proof_view_linear.UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = proof_view.proof_view_entry_get_children(justification_entry);
        SubLObject child = (SubLObject)proof_view_linear.NIL;
        child = cdolist_list_var.first();
        while (proof_view_linear.NIL != cdolist_list_var) {
            if (proof_view_linear.NIL != proof_view.proof_view_rule_support_entryP(child)) {
                add_linear_entry(v_proof_view, (SubLObject)proof_view_linear.$str6$Rule__, linear_root_entry, (SubLObject)proof_view_linear.$kw7$RULE, child, isg, detailed_to_linear_map);
            }
            else if (depth.numGE(proof_view_linear.$proof_view_linear_section_max_depth$.getDynamicValue(thread))) {
                if (proof_view_linear.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                    Errors.warn((SubLObject)proof_view_linear.$str8$Reached_linear_depth_cutoff_of__D, proof_view_linear.$proof_view_linear_section_max_depth$.getDynamicValue(thread), proof_view.proof_view_entry_get_object(child));
                }
                add_linear_entry(v_proof_view, (SubLObject)proof_view_linear.$str9$, linear_root_entry, (SubLObject)proof_view_linear.$kw10$PREMISE, child, isg, detailed_to_linear_map);
            }
            else if (proof_view_linear.NIL != proof_view_linear_section_show_supportsP(child)) {
                proof_view_build_linear_section(linear_root_entry, child, v_proof_view, number_utilities.f_1X(depth), isg, detailed_to_linear_map);
                final SubLObject conclusion = add_linear_entry(v_proof_view, (SubLObject)proof_view_linear.$str11$Therefore_, linear_root_entry, (SubLObject)proof_view_linear.$kw12$CONCLUSION, child, isg, detailed_to_linear_map);
                SubLObject from = (SubLObject)proof_view_linear.NIL;
                if (proof_view_linear.NIL == Sequences.find((SubLObject)proof_view_linear.$kw13$FROM, proof_view.proof_view_entry_get_children(conclusion), Symbols.symbol_function((SubLObject)proof_view_linear.EQL), (SubLObject)proof_view_linear.$sym14$PROOF_VIEW_ENTRY_GET_OBJECT_TYPE, (SubLObject)proof_view_linear.UNPROVIDED, (SubLObject)proof_view_linear.UNPROVIDED)) {
                    SubLObject cdolist_list_var_$1 = proof_view.proof_view_entry_get_children(child);
                    SubLObject grandchild = (SubLObject)proof_view_linear.NIL;
                    grandchild = cdolist_list_var_$1.first();
                    while (proof_view_linear.NIL != cdolist_list_var_$1) {
                        from = (SubLObject)ConsesLow.cons(dictionary.dictionary_lookup(detailed_to_linear_map, grandchild, (SubLObject)proof_view_linear.UNPROVIDED), from);
                        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                        grandchild = cdolist_list_var_$1.first();
                    }
                    proof_view_populator.proof_view_add_new_entry(v_proof_view, (SubLObject)proof_view_linear.$str9$, conclusion, (SubLObject)proof_view_linear.$kw13$FROM, Sort.sort(from, Symbols.symbol_function((SubLObject)proof_view_linear.$sym15$_), (SubLObject)proof_view_linear.$sym16$PROOF_VIEW_ENTRY_GET_ID), (SubLObject)ConsesLow.list((SubLObject)proof_view_linear.$kw17$FN, (SubLObject)proof_view_linear.$sym18$PROOF_VIEW_BUILD_LINEAR_SECTION));
                }
            }
            else {
                add_linear_entry(v_proof_view, (SubLObject)proof_view_linear.$str9$, linear_root_entry, (SubLObject)proof_view_linear.$kw10$PREMISE, child, isg, detailed_to_linear_map);
            }
            cdolist_list_var = cdolist_list_var.rest();
            child = cdolist_list_var.first();
        }
        return linear_root_entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-linear.lisp", position = 3890L)
    public static SubLObject add_linear_entry(final SubLObject v_proof_view, final SubLObject label, final SubLObject parent, final SubLObject object_type, final SubLObject detailed_entry, final SubLObject isg, final SubLObject detailed_to_linear_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject linear_entry = (SubLObject)proof_view_linear.NIL;
        final SubLObject obj = proof_view.proof_view_entry_get_object(detailed_entry);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(detailed_to_linear_map)); proof_view_linear.NIL == linear_entry && proof_view_linear.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject other_detailed_entry = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject existing_linear = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (proof_view.proof_view_entry_get_object(other_detailed_entry).eql(obj)) {
                if (proof_view_linear.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                    Errors.warn((SubLObject)proof_view_linear.$str19$Reusing_linear_entry_for__S, obj);
                }
                linear_entry = existing_linear;
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        if (proof_view_linear.NIL == linear_entry) {
            linear_entry = proof_view_populator.proof_view_add_new_entry(v_proof_view, label, parent, object_type, detailed_entry, (SubLObject)ConsesLow.listS((SubLObject)proof_view_linear.$kw20$LINEAR_ID, integer_sequence_generator.integer_sequence_generator_next(isg), (SubLObject)proof_view_linear.$list21));
        }
        dictionary.dictionary_enter(detailed_to_linear_map, detailed_entry, linear_entry);
        return linear_entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-linear.lisp", position = 4672L)
    public static SubLObject proof_view_linear_section_show_supportsP(final SubLObject entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject obj = proof_view.proof_view_entry_get_object(entry);
        if (proof_view_linear.NIL != proof_view.proof_view_transitive_support_p(obj)) {
            if (proof_view_linear.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                Errors.warn((SubLObject)proof_view_linear.$str22$Pruning_supports_for__S, obj);
            }
            return (SubLObject)proof_view_linear.NIL;
        }
        if (proof_view_linear.NIL != Sequences.find_if((SubLObject)proof_view_linear.$sym23$PROOF_VIEW_LINEAR_SECTION_VALID_OBJECT_TYPE_P, proof_view.proof_view_entry_get_children(entry), (SubLObject)proof_view_linear.$sym14$PROOF_VIEW_ENTRY_GET_OBJECT_TYPE, (SubLObject)proof_view_linear.UNPROVIDED, (SubLObject)proof_view_linear.UNPROVIDED)) {
            return (SubLObject)proof_view_linear.T;
        }
        return (SubLObject)proof_view_linear.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-linear.lisp", position = 5097L)
    public static SubLObject proof_view_linear_section_valid_object_type_p(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (obj.eql((SubLObject)proof_view_linear.$sym24$SUPPORT_P) || obj.eql((SubLObject)proof_view_linear.$sym25$ASSERTION_P) || obj.eql((SubLObject)proof_view_linear.$sym26$EL_SENTENCE_P)) {
            return (SubLObject)proof_view_linear.T;
        }
        if (obj.eql((SubLObject)proof_view_linear.$kw27$ASSERTION_BOOKKEEPING) || obj.eql((SubLObject)proof_view_linear.$kw28$UNSUPPORTED_SUPPORT) || obj.eql((SubLObject)proof_view_linear.$kw29$CIRCULAR_SUPPORT) || obj.eql((SubLObject)proof_view_linear.$kw30$GIVEN)) {
            return (SubLObject)proof_view_linear.NIL;
        }
        if (proof_view_linear.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
            Errors.warn((SubLObject)proof_view_linear.$str31$Unrecognized_linear_section_objec, obj);
        }
        return (SubLObject)proof_view_linear.NIL;
    }
    
    public static SubLObject declare_proof_view_linear_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_linear", "proof_view_add_linear_section", "PROOF-VIEW-ADD-LINEAR-SECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_linear", "proof_view_get_include_linear_sectionP", "PROOF-VIEW-GET-INCLUDE-LINEAR-SECTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_linear", "proof_view_set_include_linear_sectionP", "PROOF-VIEW-SET-INCLUDE-LINEAR-SECTION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_linear", "proof_view_has_linear_sectionP", "PROOF-VIEW-HAS-LINEAR-SECTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_linear", "proof_view_build_linear_section", "PROOF-VIEW-BUILD-LINEAR-SECTION", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_linear", "add_linear_entry", "ADD-LINEAR-ENTRY", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_linear", "proof_view_linear_section_show_supportsP", "PROOF-VIEW-LINEAR-SECTION-SHOW-SUPPORTS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_linear", "proof_view_linear_section_valid_object_type_p", "PROOF-VIEW-LINEAR-SECTION-VALID-OBJECT-TYPE-P", 1, 0, false);
        return (SubLObject)proof_view_linear.NIL;
    }
    
    public static SubLObject init_proof_view_linear_file() {
        proof_view_linear.$proof_view_linear_section_max_depth$ = SubLFiles.defparameter("*PROOF-VIEW-LINEAR-SECTION-MAX-DEPTH*", (SubLObject)proof_view_linear.THREE_INTEGER);
        return (SubLObject)proof_view_linear.NIL;
    }
    
    public static SubLObject setup_proof_view_linear_file() {
        utilities_macros.note_funcall_helper_function((SubLObject)proof_view_linear.$sym2$PROOF_VIEW_ADD_LINEAR_SECTION);
        proof_view_populator.note_proof_view_special_section_populator((SubLObject)proof_view_linear.$sym2$PROOF_VIEW_ADD_LINEAR_SECTION, (SubLObject)proof_view_linear.$kw3$LINEAR, (SubLObject)proof_view_linear.T, proof_view_linear.$const4$CycProofViewLinearSection);
        return (SubLObject)proof_view_linear.NIL;
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
        me = (SubLFile)new proof_view_linear();
        proof_view_linear.$proof_view_linear_section_max_depth$ = null;
        $kw0$JUSTIFICATION_ROOT = SubLObjectFactory.makeKeyword("JUSTIFICATION-ROOT");
        $kw1$LINEAR_ROOT = SubLObjectFactory.makeKeyword("LINEAR-ROOT");
        $sym2$PROOF_VIEW_ADD_LINEAR_SECTION = SubLObjectFactory.makeSymbol("PROOF-VIEW-ADD-LINEAR-SECTION");
        $kw3$LINEAR = SubLObjectFactory.makeKeyword("LINEAR");
        $const4$CycProofViewLinearSection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycProofViewLinearSection"));
        $sym5$BOOLEANP = SubLObjectFactory.makeSymbol("BOOLEANP");
        $str6$Rule__ = SubLObjectFactory.makeString("Rule: ");
        $kw7$RULE = SubLObjectFactory.makeKeyword("RULE");
        $str8$Reached_linear_depth_cutoff_of__D = SubLObjectFactory.makeString("Reached linear depth cutoff of ~D.~% Pruning supports for~% ~S");
        $str9$ = SubLObjectFactory.makeString("");
        $kw10$PREMISE = SubLObjectFactory.makeKeyword("PREMISE");
        $str11$Therefore_ = SubLObjectFactory.makeString("Therefore:");
        $kw12$CONCLUSION = SubLObjectFactory.makeKeyword("CONCLUSION");
        $kw13$FROM = SubLObjectFactory.makeKeyword("FROM");
        $sym14$PROOF_VIEW_ENTRY_GET_OBJECT_TYPE = SubLObjectFactory.makeSymbol("PROOF-VIEW-ENTRY-GET-OBJECT-TYPE");
        $sym15$_ = SubLObjectFactory.makeSymbol("<");
        $sym16$PROOF_VIEW_ENTRY_GET_ID = SubLObjectFactory.makeSymbol("PROOF-VIEW-ENTRY-GET-ID");
        $kw17$FN = SubLObjectFactory.makeKeyword("FN");
        $sym18$PROOF_VIEW_BUILD_LINEAR_SECTION = SubLObjectFactory.makeSymbol("PROOF-VIEW-BUILD-LINEAR-SECTION");
        $str19$Reusing_linear_entry_for__S = SubLObjectFactory.makeString("Reusing linear entry for ~S");
        $kw20$LINEAR_ID = SubLObjectFactory.makeKeyword("LINEAR-ID");
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FN"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-LINEAR-ENTRY"));
        $str22$Pruning_supports_for__S = SubLObjectFactory.makeString("Pruning supports for ~S");
        $sym23$PROOF_VIEW_LINEAR_SECTION_VALID_OBJECT_TYPE_P = SubLObjectFactory.makeSymbol("PROOF-VIEW-LINEAR-SECTION-VALID-OBJECT-TYPE-P");
        $sym24$SUPPORT_P = SubLObjectFactory.makeSymbol("SUPPORT-P");
        $sym25$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $sym26$EL_SENTENCE_P = SubLObjectFactory.makeSymbol("EL-SENTENCE-P");
        $kw27$ASSERTION_BOOKKEEPING = SubLObjectFactory.makeKeyword("ASSERTION-BOOKKEEPING");
        $kw28$UNSUPPORTED_SUPPORT = SubLObjectFactory.makeKeyword("UNSUPPORTED-SUPPORT");
        $kw29$CIRCULAR_SUPPORT = SubLObjectFactory.makeKeyword("CIRCULAR-SUPPORT");
        $kw30$GIVEN = SubLObjectFactory.makeKeyword("GIVEN");
        $str31$Unrecognized_linear_section_objec = SubLObjectFactory.makeString("Unrecognized linear section object type: ~S");
    }
}

/*

	Total time: 104 ms
	
*/