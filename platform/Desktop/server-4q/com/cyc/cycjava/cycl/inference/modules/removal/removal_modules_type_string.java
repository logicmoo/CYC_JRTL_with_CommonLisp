package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.string_typing;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_type_string extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_string";
    public static final String myFingerPrint = "ac4a59849b6e02f3841ee7a5abc153a01252ab3569c7f17465e91ee62a27b027";
    private static final SubLObject $const0$typeFromString;
    private static final SubLSymbol $kw1$POS;
    private static final SubLSymbol $kw2$NEG;
    private static final SubLSymbol $kw3$REMOVAL_TYPE_STRING_UNIFY_ARG2;
    private static final SubLList $list4;
    private static final SubLSymbol $kw5$REMOVAL_TYPE_STRING_CHECK_POS;
    private static final SubLList $list6;
    private static final SubLSymbol $kw7$REMOVAL_TYPE_STRING_CHECK_POS_NEG;
    private static final SubLList $list8;
    private static final SubLSymbol $kw9$COLLECTION;
    private static final SubLObject $const10$Collection;
    private static final SubLSymbol $kw11$INDIVIDUAL;
    private static final SubLObject $const12$Individual;
    private static final SubLSymbol $kw13$OPAQUE;
    private static final SubLSymbol $sym14$REMOVAL_TYPE_STRING_ARG2_UNBOUND;
    private static final SubLList $list15;
    private static final SubLSymbol $sym16$REMOVAL_TYPE_STRING_ALL_BOUND;
    private static final SubLSymbol $sym17$REMOVAL_TYPE_STRING_ALL_BOUND_NEG;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-string.lisp", position = 2321L)
    public static SubLObject removal_type_string_arg2_unbound(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_type_string.UNPROVIDED) {
            sense = (SubLObject)removal_modules_type_string.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cycl_utilities.formula_arg1(asent, (SubLObject)removal_modules_type_string.UNPROVIDED).isString()) {
            final SubLObject type0 = string_typing.type_string(cycl_utilities.formula_arg1(asent, (SubLObject)removal_modules_type_string.UNPROVIDED));
            SubLObject type2 = (SubLObject)removal_modules_type_string.NIL;
            final SubLObject pcase_var = type0;
            if (pcase_var.eql((SubLObject)removal_modules_type_string.$kw9$COLLECTION)) {
                type2 = removal_modules_type_string.$const10$Collection;
            }
            else if (pcase_var.eql((SubLObject)removal_modules_type_string.$kw11$INDIVIDUAL)) {
                type2 = removal_modules_type_string.$const12$Individual;
            }
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(type2, cycl_utilities.formula_arg2(asent, (SubLObject)removal_modules_type_string.UNPROVIDED), (SubLObject)removal_modules_type_string.T, (SubLObject)removal_modules_type_string.T);
            final SubLObject justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_type_string.NIL != v_bindings) {
                final SubLObject bound_arg2 = bindings.subst_bindings(v_bindings, cycl_utilities.formula_arg2(asent, (SubLObject)removal_modules_type_string.UNPROVIDED));
                final SubLObject unified_asent = el_utilities.replace_formula_arg((SubLObject)removal_modules_type_string.TWO_INTEGER, bound_arg2, asent);
                backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_type_string.$kw13$OPAQUE, unified_asent, (SubLObject)removal_modules_type_string.UNPROVIDED, (SubLObject)removal_modules_type_string.UNPROVIDED), v_bindings, justification);
            }
        }
        return (SubLObject)removal_modules_type_string.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-string.lisp", position = 2978L)
    public static SubLObject removal_type_string_all_bound(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_type_string.UNPROVIDED) {
            sense = (SubLObject)removal_modules_type_string.NIL;
        }
        if (cycl_utilities.formula_arg1(asent, (SubLObject)removal_modules_type_string.UNPROVIDED).isString()) {
            final SubLObject type0 = string_typing.type_string(cycl_utilities.formula_arg1(asent, (SubLObject)removal_modules_type_string.UNPROVIDED));
            SubLObject type2 = (SubLObject)removal_modules_type_string.NIL;
            final SubLObject pcase_var = type0;
            if (pcase_var.eql((SubLObject)removal_modules_type_string.$kw9$COLLECTION)) {
                type2 = removal_modules_type_string.$const10$Collection;
            }
            else if (pcase_var.eql((SubLObject)removal_modules_type_string.$kw11$INDIVIDUAL)) {
                type2 = removal_modules_type_string.$const12$Individual;
            }
            if (type2.eql(cycl_utilities.formula_arg2(asent, (SubLObject)removal_modules_type_string.UNPROVIDED))) {
                backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_type_string.$kw13$OPAQUE, asent, (SubLObject)removal_modules_type_string.UNPROVIDED, (SubLObject)removal_modules_type_string.UNPROVIDED), (SubLObject)removal_modules_type_string.$list15, (SubLObject)removal_modules_type_string.NIL);
            }
        }
        return (SubLObject)removal_modules_type_string.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-string.lisp", position = 3408L)
    public static SubLObject removal_type_string_all_bound_neg(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_type_string.UNPROVIDED) {
            sense = (SubLObject)removal_modules_type_string.NIL;
        }
        if (cycl_utilities.formula_arg1(asent, (SubLObject)removal_modules_type_string.UNPROVIDED).isString()) {
            final SubLObject type0 = string_typing.type_string(cycl_utilities.formula_arg1(asent, (SubLObject)removal_modules_type_string.UNPROVIDED));
            SubLObject type2 = (SubLObject)removal_modules_type_string.NIL;
            final SubLObject pcase_var = type0;
            if (pcase_var.eql((SubLObject)removal_modules_type_string.$kw9$COLLECTION)) {
                type2 = removal_modules_type_string.$const10$Collection;
            }
            else if (pcase_var.eql((SubLObject)removal_modules_type_string.$kw11$INDIVIDUAL)) {
                type2 = removal_modules_type_string.$const12$Individual;
            }
            if (!type2.eql(cycl_utilities.formula_arg2(asent, (SubLObject)removal_modules_type_string.UNPROVIDED))) {
                backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_type_string.$kw13$OPAQUE, cycl_utilities.negate(asent), (SubLObject)removal_modules_type_string.UNPROVIDED, (SubLObject)removal_modules_type_string.UNPROVIDED), (SubLObject)removal_modules_type_string.$list15, (SubLObject)removal_modules_type_string.NIL);
            }
        }
        return (SubLObject)removal_modules_type_string.NIL;
    }
    
    public static SubLObject declare_removal_modules_type_string_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_string", "removal_type_string_arg2_unbound", "REMOVAL-TYPE-STRING-ARG2-UNBOUND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_string", "removal_type_string_all_bound", "REMOVAL-TYPE-STRING-ALL-BOUND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_string", "removal_type_string_all_bound_neg", "REMOVAL-TYPE-STRING-ALL-BOUND-NEG", 1, 1, false);
        return (SubLObject)removal_modules_type_string.NIL;
    }
    
    public static SubLObject init_removal_modules_type_string_file() {
        return (SubLObject)removal_modules_type_string.NIL;
    }
    
    public static SubLObject setup_removal_modules_type_string_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_type_string.$const0$typeFromString);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_type_string.$kw1$POS, removal_modules_type_string.$const0$typeFromString, (SubLObject)removal_modules_type_string.ONE_INTEGER);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_type_string.$kw2$NEG, removal_modules_type_string.$const0$typeFromString);
        inference_modules.inference_removal_module((SubLObject)removal_modules_type_string.$kw3$REMOVAL_TYPE_STRING_UNIFY_ARG2, (SubLObject)removal_modules_type_string.$list4);
        inference_modules.inference_removal_module((SubLObject)removal_modules_type_string.$kw5$REMOVAL_TYPE_STRING_CHECK_POS, (SubLObject)removal_modules_type_string.$list6);
        inference_modules.inference_removal_module((SubLObject)removal_modules_type_string.$kw7$REMOVAL_TYPE_STRING_CHECK_POS_NEG, (SubLObject)removal_modules_type_string.$list8);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_type_string.$sym14$REMOVAL_TYPE_STRING_ARG2_UNBOUND);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_type_string.$sym16$REMOVAL_TYPE_STRING_ALL_BOUND);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_type_string.$sym17$REMOVAL_TYPE_STRING_ALL_BOUND_NEG);
        return (SubLObject)removal_modules_type_string.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_removal_modules_type_string_file();
    }
    
    @Override
	public void initializeVariables() {
        init_removal_modules_type_string_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_removal_modules_type_string_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_type_string();
        $const0$typeFromString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("typeFromString"));
        $kw1$POS = SubLObjectFactory.makeKeyword("POS");
        $kw2$NEG = SubLObjectFactory.makeKeyword("NEG");
        $kw3$REMOVAL_TYPE_STRING_UNIFY_ARG2 = SubLObjectFactory.makeKeyword("REMOVAL-TYPE-STRING-UNIFY-ARG2");
        $list4 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("typeFromString")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("typeFromString")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_type_string.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-TYPE-STRING-ARG2-UNBOUND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$typeFromString :fully-bound :not-fully-bound)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$typeFromString \"Patrick AFB\" #$Individual)") });
        $kw5$REMOVAL_TYPE_STRING_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-TYPE-STRING-CHECK-POS");
        $list6 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("typeFromString")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("typeFromString")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_type_string.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-TYPE-STRING-ALL-BOUND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$typeFromString :fully-bound :fully-bound)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$typeFromString \"Patrick AFB\" #$Individual)") });
        $kw7$REMOVAL_TYPE_STRING_CHECK_POS_NEG = SubLObjectFactory.makeKeyword("REMOVAL-TYPE-STRING-CHECK-POS-NEG");
        $list8 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("typeFromString")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("typeFromString")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_type_string.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-TYPE-STRING-ALL-BOUND-NEG"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$typeFromString :fully-bound :fully-bound))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$typeFromString \"Patrick AFB\" #$Individual))") });
        $kw9$COLLECTION = SubLObjectFactory.makeKeyword("COLLECTION");
        $const10$Collection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"));
        $kw11$INDIVIDUAL = SubLObjectFactory.makeKeyword("INDIVIDUAL");
        $const12$Individual = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual"));
        $kw13$OPAQUE = SubLObjectFactory.makeKeyword("OPAQUE");
        $sym14$REMOVAL_TYPE_STRING_ARG2_UNBOUND = SubLObjectFactory.makeSymbol("REMOVAL-TYPE-STRING-ARG2-UNBOUND");
        $list15 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)removal_modules_type_string.T, (SubLObject)removal_modules_type_string.T));
        $sym16$REMOVAL_TYPE_STRING_ALL_BOUND = SubLObjectFactory.makeSymbol("REMOVAL-TYPE-STRING-ALL-BOUND");
        $sym17$REMOVAL_TYPE_STRING_ALL_BOUND_NEG = SubLObjectFactory.makeSymbol("REMOVAL-TYPE-STRING-ALL-BOUND-NEG");
    }
}

/*

	Total time: 84 ms
	
*/