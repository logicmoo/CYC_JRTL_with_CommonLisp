package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_set_of_list_with_same_member_in_pos extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_set_of_list_with_same_member_in_pos";
    public static final String myFingerPrint = "92d4731a6764c24c2604100e1ce8b9240876815ae9ea171275054d674b66bf80";
    private static final SubLObject $const0$setOfListWithSameMemberInPos;
    private static final SubLSymbol $kw1$POS;
    private static final SubLSymbol $kw2$REMOVAL_SET_OF_LIST_WITH_SAME_MEMBER_IN_POS_UNIFY_ARG1;
    private static final SubLList $list3;
    private static final SubLObject $const4$TheSet;
    private static final SubLSymbol $kw5$OPAQUE;
    private static final SubLSymbol $sym6$SET_OF_LIST_WITH_SAME_MEMBER_IN_POS;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-set-of-list-with-same-member-in-pos.lisp", position = 1995L)
    public static SubLObject set_of_list_with_same_member_in_pos(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_set_of_list_with_same_member_in_pos.UNPROVIDED) {
            sense = (SubLObject)removal_modules_set_of_list_with_same_member_in_pos.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject list_of_lists = cycl_utilities.formula_arg3(asent, (SubLObject)removal_modules_set_of_list_with_same_member_in_pos.UNPROVIDED);
        final SubLObject n = cycl_utilities.formula_arg2(asent, (SubLObject)removal_modules_set_of_list_with_same_member_in_pos.UNPROVIDED);
        SubLObject result = (SubLObject)removal_modules_set_of_list_with_same_member_in_pos.NIL;
        final SubLObject found = Hashtables.make_hash_table((SubLObject)removal_modules_set_of_list_with_same_member_in_pos.EIGHT_INTEGER, (SubLObject)removal_modules_set_of_list_with_same_member_in_pos.EQUAL, (SubLObject)removal_modules_set_of_list_with_same_member_in_pos.UNPROVIDED);
        SubLObject cdolist_list_var = list_of_lists.rest();
        SubLObject list = (SubLObject)removal_modules_set_of_list_with_same_member_in_pos.NIL;
        list = cdolist_list_var.first();
        while (removal_modules_set_of_list_with_same_member_in_pos.NIL != cdolist_list_var) {
            final SubLObject element = ConsesLow.nth(n, list);
            SubLObject value = Hashtables.gethash(element, found, (SubLObject)removal_modules_set_of_list_with_same_member_in_pos.UNPROVIDED);
            value = (SubLObject)ConsesLow.cons(list, value);
            Hashtables.sethash(element, found, value);
            cdolist_list_var = cdolist_list_var.rest();
            list = cdolist_list_var.first();
        }
        SubLObject key = (SubLObject)removal_modules_set_of_list_with_same_member_in_pos.NIL;
        SubLObject val = (SubLObject)removal_modules_set_of_list_with_same_member_in_pos.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(found);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                key = Hashtables.getEntryKey(cdohash_entry);
                val = Hashtables.getEntryValue(cdohash_entry);
                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(removal_modules_set_of_list_with_same_member_in_pos.$const4$TheSet, val), result);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        cdolist_list_var = result;
        SubLObject binding = (SubLObject)removal_modules_set_of_list_with_same_member_in_pos.NIL;
        binding = cdolist_list_var.first();
        while (removal_modules_set_of_list_with_same_member_in_pos.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(binding, cycl_utilities.formula_arg1(asent, (SubLObject)removal_modules_set_of_list_with_same_member_in_pos.UNPROVIDED), (SubLObject)removal_modules_set_of_list_with_same_member_in_pos.T, (SubLObject)removal_modules_set_of_list_with_same_member_in_pos.T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_set_of_list_with_same_member_in_pos.NIL != v_bindings) {
                final SubLObject bound_arg1 = bindings.subst_bindings(v_bindings, cycl_utilities.formula_arg1(asent, (SubLObject)removal_modules_set_of_list_with_same_member_in_pos.UNPROVIDED));
                final SubLObject unified_asent = el_utilities.replace_formula_arg((SubLObject)removal_modules_set_of_list_with_same_member_in_pos.ONE_INTEGER, bound_arg1, asent);
                backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_set_of_list_with_same_member_in_pos.$kw5$OPAQUE, unified_asent, (SubLObject)removal_modules_set_of_list_with_same_member_in_pos.UNPROVIDED, (SubLObject)removal_modules_set_of_list_with_same_member_in_pos.UNPROVIDED), v_bindings, unify_justification);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        return (SubLObject)removal_modules_set_of_list_with_same_member_in_pos.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-set-of-list-with-same-member-in-pos.lisp", position = 2881L)
    public static SubLObject removal_set_of_list_with_same_member_in_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_set_of_list_with_same_member_in_pos.UNPROVIDED) {
            sense = (SubLObject)removal_modules_set_of_list_with_same_member_in_pos.NIL;
        }
        return Numbers.divide(Sequences.length(cycl_utilities.formula_arg3(asent, (SubLObject)removal_modules_set_of_list_with_same_member_in_pos.UNPROVIDED)), (SubLObject)removal_modules_set_of_list_with_same_member_in_pos.TWO_INTEGER);
    }
    
    public static SubLObject declare_removal_modules_set_of_list_with_same_member_in_pos_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_set_of_list_with_same_member_in_pos", "set_of_list_with_same_member_in_pos", "SET-OF-LIST-WITH-SAME-MEMBER-IN-POS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_set_of_list_with_same_member_in_pos", "removal_set_of_list_with_same_member_in_pos_cost", "REMOVAL-SET-OF-LIST-WITH-SAME-MEMBER-IN-POS-COST", 1, 1, false);
        return (SubLObject)removal_modules_set_of_list_with_same_member_in_pos.NIL;
    }
    
    public static SubLObject init_removal_modules_set_of_list_with_same_member_in_pos_file() {
        return (SubLObject)removal_modules_set_of_list_with_same_member_in_pos.NIL;
    }
    
    public static SubLObject setup_removal_modules_set_of_list_with_same_member_in_pos_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_set_of_list_with_same_member_in_pos.$const0$setOfListWithSameMemberInPos);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_set_of_list_with_same_member_in_pos.$kw1$POS, removal_modules_set_of_list_with_same_member_in_pos.$const0$setOfListWithSameMemberInPos, (SubLObject)removal_modules_set_of_list_with_same_member_in_pos.TWO_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_set_of_list_with_same_member_in_pos.$kw1$POS, removal_modules_set_of_list_with_same_member_in_pos.$const0$setOfListWithSameMemberInPos, (SubLObject)removal_modules_set_of_list_with_same_member_in_pos.THREE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_set_of_list_with_same_member_in_pos.$kw2$REMOVAL_SET_OF_LIST_WITH_SAME_MEMBER_IN_POS_UNIFY_ARG1, (SubLObject)removal_modules_set_of_list_with_same_member_in_pos.$list3);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_set_of_list_with_same_member_in_pos.$sym6$SET_OF_LIST_WITH_SAME_MEMBER_IN_POS);
        return (SubLObject)removal_modules_set_of_list_with_same_member_in_pos.NIL;
    }
    
    public void declareFunctions() {
        declare_removal_modules_set_of_list_with_same_member_in_pos_file();
    }
    
    public void initializeVariables() {
        init_removal_modules_set_of_list_with_same_member_in_pos_file();
    }
    
    public void runTopLevelForms() {
        setup_removal_modules_set_of_list_with_same_member_in_pos_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_set_of_list_with_same_member_in_pos();
        $const0$setOfListWithSameMemberInPos = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("setOfListWithSameMemberInPos"));
        $kw1$POS = SubLObjectFactory.makeKeyword("POS");
        $kw2$REMOVAL_SET_OF_LIST_WITH_SAME_MEMBER_IN_POS_UNIFY_ARG1 = SubLObjectFactory.makeKeyword("REMOVAL-SET-OF-LIST-WITH-SAME-MEMBER-IN-POS-UNIFY-ARG1");
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("setOfListWithSameMemberInPos")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("setOfListWithSameMemberInPos")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-SET-OF-LIST-WITH-SAME-MEMBER-IN-POS-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("SET-OF-LIST-WITH-SAME-MEMBER-IN-POS"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$setOfListWithSameMemberInPos :not-fully-bound :fully-bound :fully-bound)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$setOfListWithSameMemberInPos ?X 1 (#$TheList (#$TheList 1 2) (#$TheList 1 4) (#$TheList 3 4) (#$TheList 3 5) (#$TheList 1 6) (#$TheList 2 3)) \nwill bind ?X to (#$TheSet (#$TheList 1 2) (#$TheList 1 4) (#$TheList 1 6)), (#$TheSet (#$TheList 3 4) (#$TheList 3 5)) and (#$TheSet (#$TheList 2 3))") });
        $const4$TheSet = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet"));
        $kw5$OPAQUE = SubLObjectFactory.makeKeyword("OPAQUE");
        $sym6$SET_OF_LIST_WITH_SAME_MEMBER_IN_POS = SubLObjectFactory.makeSymbol("SET-OF-LIST-WITH-SAME-MEMBER-IN-POS");
    }
}

/*

	Total time: 96 ms
	
*/