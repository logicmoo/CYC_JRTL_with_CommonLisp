package com.cyc.cycjava.cycl.inference.modules;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class preference_module_declarations extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.preference_module_declarations";
    public static final String myFingerPrint = "1230d3a84dde5f6b3fcfc688beaf0bccbc1563481458e2b3afdc6f1c259a6999";
    private static final SubLSymbol $kw0$ABNORMAL_DELAY_POS;
    private static final SubLList $list1;
    private static final SubLSymbol $kw2$INCREASE_OR_DECREASE_IN_VALUE_RETURNED_BY_NOT_FULLY_BOUND;
    private static final SubLList $list3;
    private static final SubLSymbol $kw4$REQUIRE_ARG1_FULLY_BOUND_GENERAL;
    private static final SubLList $list5;
    
    public static SubLObject declare_preference_module_declarations_file() {
        return (SubLObject)preference_module_declarations.NIL;
    }
    
    public static SubLObject init_preference_module_declarations_file() {
        return (SubLObject)preference_module_declarations.NIL;
    }
    
    public static SubLObject setup_preference_module_declarations_file() {
        preference_modules.inference_preference_module((SubLObject)preference_module_declarations.$kw0$ABNORMAL_DELAY_POS, (SubLObject)preference_module_declarations.$list1);
        preference_modules.inference_preference_module((SubLObject)preference_module_declarations.$kw2$INCREASE_OR_DECREASE_IN_VALUE_RETURNED_BY_NOT_FULLY_BOUND, (SubLObject)preference_module_declarations.$list3);
        preference_modules.inference_preference_module((SubLObject)preference_module_declarations.$kw4$REQUIRE_ARG1_FULLY_BOUND_GENERAL, (SubLObject)preference_module_declarations.$list5);
        return (SubLObject)preference_module_declarations.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_preference_module_declarations_file();
    }
    
    @Override
	public void initializeVariables() {
        init_preference_module_declarations_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_preference_module_declarations_file();
    }
    
    static {
        me = (SubLFile)new preference_module_declarations();
        $kw0$ABNORMAL_DELAY_POS = SubLObjectFactory.makeKeyword("ABNORMAL-DELAY-POS");
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("abnormal")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("abnormal")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("DISALLOWED"));
        $kw2$INCREASE_OR_DECREASE_IN_VALUE_RETURNED_BY_NOT_FULLY_BOUND = SubLObjectFactory.makeKeyword("INCREASE-OR-DECREASE-IN-VALUE-RETURNED-BY-NOT-FULLY-BOUND");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("ANY-PREDICATES"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("decreaseInValueReturnedBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("increaseInValueReturnedBy"))), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"))), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("GROSSLY-DISPREFERRED"));
        $kw4$REQUIRE_ARG1_FULLY_BOUND_GENERAL = SubLObjectFactory.makeKeyword("REQUIRE-ARG1-FULLY-BOUND-GENERAL");
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("ANY-PREDICATES"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("candidateTriggerSituationTypes"))), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.listS((SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("DISALLOWED"));
    }
}

/*

	Total time: 65 ms
	
*/