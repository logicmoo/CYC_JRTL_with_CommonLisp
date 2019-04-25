package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_sksi extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_sksi";
    public static final String myFingerPrint = "627e0be01d9f35acc392823e0f8595b634e484e1e9a180e8b062d9f6bfab6358";
    private static final SubLObject $const0$sksiEqualsAny;
    private static final SubLSymbol $kw1$POS;
    private static final SubLSymbol $kw2$REMOVAL_SKSIEQUALSANY_CHECK;
    private static final SubLList $list3;
    
    public static SubLObject declare_removal_modules_sksi_file() {
        return (SubLObject)removal_modules_sksi.NIL;
    }
    
    public static SubLObject init_removal_modules_sksi_file() {
        return (SubLObject)removal_modules_sksi.NIL;
    }
    
    public static SubLObject setup_removal_modules_sksi_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_sksi.$const0$sksiEqualsAny);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_sksi.$kw1$POS, removal_modules_sksi.$const0$sksiEqualsAny, (SubLObject)removal_modules_sksi.TWO_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_sksi.$kw2$REMOVAL_SKSIEQUALSANY_CHECK, (SubLObject)removal_modules_sksi.$list3);
        return (SubLObject)removal_modules_sksi.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_removal_modules_sksi_file();
    }
    
    @Override
	public void initializeVariables() {
        init_removal_modules_sksi_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_removal_modules_sksi_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_sksi();
        $const0$sksiEqualsAny = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksiEqualsAny"));
        $kw1$POS = SubLObjectFactory.makeKeyword("POS");
        $kw2$REMOVAL_SKSIEQUALSANY_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-SKSIEQUALSANY-CHECK");
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksiEqualsAny")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksiEqualsAny")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-ELEMENTOF-CHECK-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$sksiEqualsAny <fully-bound> (#$TheSet . <fully-bound>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$sksiEqualsAny #$Dog (#$TheSet #$Dog #$Cat))") });
    }
}

/*

	Total time: 63 ms
	
*/