package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_term_chosen extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_term_chosen";
    public static final String myFingerPrint = "280c322a755fbbde25db3f34a3a7dd3a917a45f314ed1a9615cf1d35a72385f6";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-term-chosen.lisp", position = 720L)
    private static SubLSymbol $default_term_chosen_pos_cost$;
    private static final SubLObject $const0$termChosen;
    private static final SubLSymbol $kw1$POS;
    private static final SubLSymbol $kw2$REMOVAL_TERM_CHOSEN_POS;
    private static final SubLList $list3;
    private static final SubLSymbol $kw4$CODE;
    private static final SubLSymbol $kw5$TRUE_MON;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-term-chosen.lisp", position = 783L)
    public static SubLObject removal_term_chosen_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_term_chosen.UNPROVIDED) {
            sense = (SubLObject)removal_modules_term_chosen.NIL;
        }
        if (removal_modules_term_chosen.NIL != variables.fully_bound_p(cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_term_chosen.UNPROVIDED))) {
            backward.removal_add_node(make_term_chosen_support(asent), (SubLObject)removal_modules_term_chosen.UNPROVIDED, (SubLObject)removal_modules_term_chosen.UNPROVIDED);
        }
        return (SubLObject)removal_modules_term_chosen.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-term-chosen.lisp", position = 1505L)
    public static SubLObject make_term_chosen_support(final SubLObject asent) {
        return arguments.make_hl_support((SubLObject)removal_modules_term_chosen.$kw4$CODE, asent, mt_vars.$mt_mt$.getGlobalValue(), (SubLObject)removal_modules_term_chosen.$kw5$TRUE_MON);
    }
    
    public static SubLObject declare_removal_modules_term_chosen_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_term_chosen", "removal_term_chosen_pos_expand", "REMOVAL-TERM-CHOSEN-POS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_term_chosen", "make_term_chosen_support", "MAKE-TERM-CHOSEN-SUPPORT", 1, 0, false);
        return (SubLObject)removal_modules_term_chosen.NIL;
    }
    
    public static SubLObject init_removal_modules_term_chosen_file() {
        removal_modules_term_chosen.$default_term_chosen_pos_cost$ = SubLFiles.deflexical("*DEFAULT-TERM-CHOSEN-POS-COST*", (SubLObject)removal_modules_term_chosen.ZERO_INTEGER);
        return (SubLObject)removal_modules_term_chosen.NIL;
    }
    
    public static SubLObject setup_removal_modules_term_chosen_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_term_chosen.$const0$termChosen);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_term_chosen.$kw1$POS, removal_modules_term_chosen.$const0$termChosen, (SubLObject)removal_modules_term_chosen.ONE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_term_chosen.$kw2$REMOVAL_TERM_CHOSEN_POS, (SubLObject)removal_modules_term_chosen.$list3);
        return (SubLObject)removal_modules_term_chosen.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_removal_modules_term_chosen_file();
    }
    
    @Override
	public void initializeVariables() {
        init_removal_modules_term_chosen_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_removal_modules_term_chosen_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_term_chosen();
        removal_modules_term_chosen.$default_term_chosen_pos_cost$ = null;
        $const0$termChosen = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termChosen"));
        $kw1$POS = SubLObjectFactory.makeKeyword("POS");
        $kw2$REMOVAL_TERM_CHOSEN_POS = SubLObjectFactory.makeKeyword("REMOVAL-TERM-CHOSEN-POS");
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termChosen")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termChosen")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-TERM-CHOSEN-POS-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-TERM-CHOSEN-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$termChosen <whatever>)\nimmediately succeeds when ARG1 is fully bound\nimmediately fails when ARG1 is not fully bound."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$termChosen #$Dog)\n    (#$termChosen ?WHAT)") });
        $kw4$CODE = SubLObjectFactory.makeKeyword("CODE");
        $kw5$TRUE_MON = SubLObjectFactory.makeKeyword("TRUE-MON");
    }
}

/*

	Total time: 16 ms
	
*/