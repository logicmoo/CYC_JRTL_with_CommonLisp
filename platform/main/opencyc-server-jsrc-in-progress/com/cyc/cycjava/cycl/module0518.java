package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0518 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0518";
    public static final String myFingerPrint = "bad67095c02fb1b2d80bb410303b78e362fbc825c261a460b1807069c7e906f3";
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    
    public static SubLObject f32584(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0205.f13205(var1, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0205.f13204(var1, (SubLObject)UNPROVIDED);
        SubLObject var6 = (SubLObject)NIL;
        final SubLObject var7 = Hashtables.make_hash_table((SubLObject)EIGHT_INTEGER, (SubLObject)EQL, (SubLObject)UNPROVIDED);
        SubLObject var8 = var4.rest();
        SubLObject var9 = (SubLObject)NIL;
        var9 = var8.first();
        while (NIL != var8) {
            final SubLObject var10 = ConsesLow.nth(var5, var9);
            SubLObject var11 = Hashtables.gethash(var10, var7, (SubLObject)UNPROVIDED);
            var11 = (SubLObject)ConsesLow.cons(var9, var11);
            Hashtables.sethash(var10, var7, var11);
            var8 = var8.rest();
            var9 = var8.first();
        }
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        final Iterator var14 = Hashtables.getEntrySetIterator(var7);
        try {
            while (Hashtables.iteratorHasNext(var14)) {
                final Map.Entry var15 = Hashtables.iteratorNextEntry(var14);
                var12 = Hashtables.getEntryKey(var15);
                var13 = Hashtables.getEntryValue(var15);
                var6 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons($ic4$, var13), var6);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var14);
        }
        var8 = var6;
        SubLObject var16 = (SubLObject)NIL;
        var16 = var8.first();
        while (NIL != var8) {
            var3.resetMultipleValues();
            final SubLObject var17 = module0235.f15474(var16, module0205.f13203(var1, (SubLObject)UNPROVIDED), (SubLObject)T, (SubLObject)T);
            final SubLObject var18 = var3.secondMultipleValue();
            var3.resetMultipleValues();
            if (NIL != var17) {
                final SubLObject var19 = module0233.f15361(var17, module0205.f13203(var1, (SubLObject)UNPROVIDED));
                final SubLObject var20 = module0202.f12817((SubLObject)ONE_INTEGER, var19, var1);
                module0347.f23330(module0191.f11990((SubLObject)$ic5$, var20, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var17, var18);
            }
            var8 = var8.rest();
            var16 = var8.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32585(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return Numbers.divide(Sequences.length(module0205.f13205(var1, (SubLObject)UNPROVIDED)), (SubLObject)TWO_INTEGER);
    }
    
    public static SubLObject f32586() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0518", "f32584", "S#36027", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0518", "f32585", "S#36028", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32587() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32588() {
        module0340.f22938($ic0$);
        module0358.f23771((SubLObject)$ic1$, $ic0$, (SubLObject)TWO_INTEGER);
        module0358.f23771((SubLObject)$ic1$, $ic0$, (SubLObject)THREE_INTEGER);
        module0340.f22941((SubLObject)$ic2$, (SubLObject)$ic3$);
        module0012.f419((SubLObject)$ic6$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f32586();
    }
    
    public void initializeVariables() {
        f32587();
    }
    
    public void runTopLevelForms() {
        f32588();
    }
    
    static {
        me = (SubLFile)new module0518();
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("setOfListWithSameMemberInPos"));
        $ic1$ = makeKeyword("POS");
        $ic2$ = makeKeyword("REMOVAL-SET-OF-LIST-WITH-SAME-MEMBER-IN-POS-UNIFY-ARG1");
        $ic3$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("setOfListWithSameMemberInPos")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("setOfListWithSameMemberInPos")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST"), makeSymbol("S#36028", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#36027", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$setOfListWithSameMemberInPos :not-fully-bound :fully-bound :fully-bound)"), makeKeyword("EXAMPLE"), makeString("(#$setOfListWithSameMemberInPos ?X 1 (#$TheList (#$TheList 1 2) (#$TheList 1 4) (#$TheList 3 4) (#$TheList 3 5) (#$TheList 1 6) (#$TheList 2 3)) \nwill bind ?X to (#$TheSet (#$TheList 1 2) (#$TheList 1 4) (#$TheList 1 6)), (#$TheSet (#$TheList 3 4) (#$TheList 3 5)) and (#$TheSet (#$TheList 2 3))") });
        $ic4$ = constant_handles_oc.f8479((SubLObject)makeString("TheSet"));
        $ic5$ = makeKeyword("OPAQUE");
        $ic6$ = makeSymbol("S#36027", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 81 ms
	
	Decompiled with Procyon 0.5.32.
*/