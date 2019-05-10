package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0125 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0125";
    public static final String myFingerPrint = "19be7027efccf598d4148d8970f0f917a121ea7805de0483c33f599d58cef964";
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLString $ic5$;
    private static final SubLList $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLString $ic11$;
    private static final SubLList $ic12$;
    private static final SubLList $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLString $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
    private static final SubLString $ic20$;
    private static final SubLList $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLList $ic24$;
    private static final SubLString $ic25$;
    private static final SubLList $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLString $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    
    
    public static SubLObject f8375(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)ZERO_INTEGER;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != Types.stringp(var1) : var1;
        assert NIL != Types.fixnump(var2) : var2;
        if (NIL != var3 && !areAssertionsDisabledFor(me) && NIL == Types.fixnump(var3)) {
            throw new AssertionError(var3);
        }
        if (NIL != hl_interface_infrastructure_oc.f8291()) {
            return hl_interface_infrastructure_oc.f8304((SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, var1), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var2), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var3)));
        }
        final SubLObject var4 = module0124.f8360(var1, var2, var3);
        if (NIL != var4) {
            return var4;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8376(final SubLObject var5, SubLObject var6, SubLObject var7, SubLObject var2, SubLObject var3) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)ZERO_INTEGER;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != Types.stringp(var5) : var5;
        assert NIL != Types.booleanp(var6) : var6;
        assert NIL != Types.booleanp(var7) : var7;
        assert NIL != Types.fixnump(var2) : var2;
        if (NIL != var3 && !areAssertionsDisabledFor(me) && NIL == Types.fixnump(var3)) {
            throw new AssertionError(var3);
        }
        if (NIL != hl_interface_infrastructure_oc.f8291()) {
            return hl_interface_infrastructure_oc.f8304((SubLObject)ConsesLow.list((SubLObject)$ic9$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, var5), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var7), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var2), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var3)));
        }
        final SubLObject var8 = module0124.f8361(var5, var6, var7, var2, var3);
        if (NIL != var8) {
            return var8;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8377(final SubLObject var8, SubLObject var6, SubLObject var2, SubLObject var3) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)ZERO_INTEGER;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != Types.stringp(var8) : var8;
        assert NIL != Types.booleanp(var6) : var6;
        assert NIL != Types.fixnump(var2) : var2;
        if (NIL != var3 && !areAssertionsDisabledFor(me) && NIL == Types.fixnump(var3)) {
            throw new AssertionError(var3);
        }
        if (NIL != hl_interface_infrastructure_oc.f8291()) {
            return hl_interface_infrastructure_oc.f8304((SubLObject)ConsesLow.list((SubLObject)$ic14$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, var8), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var2), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var3)));
        }
        final SubLObject var9 = module0124.f8362(var8, var6, var2, var3);
        if (NIL != var9) {
            return var9;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8378(final SubLObject var9, SubLObject var6, SubLObject var2, SubLObject var3) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)ZERO_INTEGER;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != Types.stringp(var9) : var9;
        assert NIL != Types.booleanp(var6) : var6;
        assert NIL != Types.fixnump(var2) : var2;
        if (NIL != var3 && !areAssertionsDisabledFor(me) && NIL == Types.fixnump(var3)) {
            throw new AssertionError(var3);
        }
        if (NIL != hl_interface_infrastructure_oc.f8291()) {
            return hl_interface_infrastructure_oc.f8304((SubLObject)ConsesLow.list((SubLObject)$ic18$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, var9), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var2), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var3)));
        }
        final SubLObject var10 = module0124.f8363(var9, var6, var2, var3);
        if (NIL != var10) {
            return var10;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8379(final SubLObject var10, final SubLObject var1, SubLObject var6, SubLObject var2, SubLObject var3, SubLObject var11) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)ZERO_INTEGER;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)NIL;
        }
        assert NIL != module0004.f106(var10) : var10;
        assert NIL != Types.stringp(var1) : var1;
        assert NIL != Types.booleanp(var6) : var6;
        assert NIL != Types.fixnump(var2) : var2;
        if (NIL != var3 && !areAssertionsDisabledFor(me) && NIL == Types.fixnump(var3)) {
            throw new AssertionError(var3);
        }
        if (NIL != hl_interface_infrastructure_oc.f8291()) {
            return hl_interface_infrastructure_oc.f8304((SubLObject)ConsesLow.list((SubLObject)$ic23$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, var10), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var1), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var2), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var3), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var11)));
        }
        final SubLObject var12 = module0124.f8364(var10, var1, var6, var2, var3, var11);
        if (NIL != var12) {
            return var12;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8380(final SubLObject var10, final SubLObject var1, SubLObject var6, SubLObject var2, SubLObject var3, SubLObject var11) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)ZERO_INTEGER;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)NIL;
        }
        assert NIL != module0004.f106(var10) : var10;
        assert NIL != Types.stringp(var1) : var1;
        assert NIL != Types.booleanp(var6) : var6;
        assert NIL != Types.fixnump(var2) : var2;
        if (NIL != var3 && !areAssertionsDisabledFor(me) && NIL == Types.fixnump(var3)) {
            throw new AssertionError(var3);
        }
        if (NIL != hl_interface_infrastructure_oc.f8291()) {
            return hl_interface_infrastructure_oc.f8304((SubLObject)ConsesLow.list((SubLObject)$ic27$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, var10), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var1), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var2), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var3), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var11)));
        }
        final SubLObject var12 = module0124.f8366(var10, var1, var6, var2, var3, var11);
        if (NIL != var12) {
            return var12;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8381(SubLObject var12, SubLObject var13) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)T;
        }
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)ONE_INTEGER;
        }
        return hl_interface_infrastructure_oc.f8328((SubLObject)ConsesLow.list((SubLObject)$ic29$, module0035.f2241(var12)), var13);
    }
    
    public static SubLObject f8382(final SubLObject var1, SubLObject var6, SubLObject var2, SubLObject var3, SubLObject var12, SubLObject var13) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)T;
        }
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)ZERO_INTEGER;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)T;
        }
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)ONE_INTEGER;
        }
        return hl_interface_infrastructure_oc.f8328((SubLObject)ConsesLow.list((SubLObject)$ic30$, module0035.f2241(var1), module0035.f2241(var6), module0035.f2241(var2), module0035.f2241(var3), module0035.f2241(var12)), var13);
    }
    
    public static SubLObject f8383() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0125", "f8375", "KB-CONSTANT-COMPLETE-EXACT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0125", "f8376", "KB-CONSTANT-COMPLETE", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0125", "f8377", "KB-CONSTANT-APROPOS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0125", "f8378", "KB-CONSTANT-POSTFIX", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0125", "f8379", "KB-N-CONSTANTS-BEFORE", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0125", "f8380", "KB-N-CONSTANTS-AFTER", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0125", "f8381", "S#10486", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0125", "f8382", "S#10487", 1, 5, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8384() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8385() {
        module0012.f368((SubLObject)$ic2$, (SubLObject)$ic4$, (SubLObject)$ic5$, (SubLObject)$ic6$, (SubLObject)$ic7$);
        module0012.f368((SubLObject)$ic9$, (SubLObject)$ic10$, (SubLObject)$ic11$, (SubLObject)$ic12$, (SubLObject)$ic13$);
        module0012.f368((SubLObject)$ic14$, (SubLObject)$ic15$, (SubLObject)$ic16$, (SubLObject)$ic17$, (SubLObject)$ic13$);
        module0012.f368((SubLObject)$ic18$, (SubLObject)$ic19$, (SubLObject)$ic20$, (SubLObject)$ic21$, (SubLObject)$ic13$);
        module0012.f368((SubLObject)$ic23$, (SubLObject)$ic24$, (SubLObject)$ic25$, (SubLObject)$ic26$, (SubLObject)$ic13$);
        module0012.f368((SubLObject)$ic27$, (SubLObject)$ic24$, (SubLObject)$ic28$, (SubLObject)$ic26$, (SubLObject)$ic13$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f8383();
    }
    
    public void initializeVariables() {
        f8384();
    }
    
    public void runTopLevelForms() {
        f8385();
    }
    
    static {
        me = (SubLFile)new module0125();
        $ic0$ = makeSymbol("STRINGP");
        $ic1$ = makeSymbol("FIXNUMP");
        $ic2$ = makeSymbol("KB-CONSTANT-COMPLETE-EXACT");
        $ic3$ = makeSymbol("QUOTE");
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("STRING"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#124", "CYC"), (SubLObject)ZERO_INTEGER), (SubLObject)makeSymbol("S#125", "CYC"));
        $ic5$ = makeString("Return a valid constant whose name exactly matches STRING.\n   Optionally the START and END character positions can be\n   specified, such that the STRING matches characters between the START and \n   END range.  If no constant exists, return NIL.");
        $ic6$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("STRING"), (SubLObject)makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#124", "CYC"), (SubLObject)makeSymbol("FIXNUMP")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#125", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#664", "CYC"), (SubLObject)makeSymbol("FIXNUMP"))));
        $ic7$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#664", "CYC"), (SubLObject)makeSymbol("CONSTANT-P")));
        $ic8$ = makeSymbol("BOOLEANP");
        $ic9$ = makeSymbol("KB-CONSTANT-COMPLETE");
        $ic10$ = ConsesLow.list((SubLObject)makeSymbol("S#10299", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#10488", "CYC"), (SubLObject)makeSymbol("S#10489", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#124", "CYC"), (SubLObject)ZERO_INTEGER), (SubLObject)makeSymbol("S#125", "CYC"));
        $ic11$ = makeString("Return all valid constants with PREFIX as a prefix of their name\n   When CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\n   When EXACT-LENGTH? is non-nil, the prefix must be the entire string\n   Optionally the START and END character positions can be\n   specified, such that the PREFIX matches characters between the START and \n   END range.  If no constant exists, return NIL.");
        $ic12$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10299", "CYC"), (SubLObject)makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10488", "CYC"), (SubLObject)makeSymbol("BOOLEANP")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10489", "CYC"), (SubLObject)makeSymbol("BOOLEANP")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#124", "CYC"), (SubLObject)makeSymbol("FIXNUMP")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#125", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#664", "CYC"), (SubLObject)makeSymbol("FIXNUMP"))));
        $ic13$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("LIST"), (SubLObject)makeSymbol("CONSTANT-P")));
        $ic14$ = makeSymbol("KB-CONSTANT-APROPOS");
        $ic15$ = ConsesLow.list((SubLObject)makeSymbol("S#368", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#10488", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#124", "CYC"), (SubLObject)ZERO_INTEGER), (SubLObject)makeSymbol("S#125", "CYC"));
        $ic16$ = makeString("Return all valid constants with SUBSTRING somewhere in their name\n   When CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\n   Optionally the START and END character positions can be\n   specified, such that the SUBSTRING matches characters between the START and \n   END range.  If no constant exists, return NIL.");
        $ic17$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#368", "CYC"), (SubLObject)makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10488", "CYC"), (SubLObject)makeSymbol("BOOLEANP")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#124", "CYC"), (SubLObject)makeSymbol("FIXNUMP")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#125", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#664", "CYC"), (SubLObject)makeSymbol("FIXNUMP"))));
        $ic18$ = makeSymbol("KB-CONSTANT-POSTFIX");
        $ic19$ = ConsesLow.list((SubLObject)makeSymbol("S#10300", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#10488", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#124", "CYC"), (SubLObject)ZERO_INTEGER), (SubLObject)makeSymbol("S#125", "CYC"));
        $ic20$ = makeString("Return all valid constants with POSTFIX as a postfix of their name\n   When CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\n   Optionally the START and END character positions can be\n   specified, such that the SUBSTRING matches characters between the START and \n   END range.  If no constant exists, return NIL.");
        $ic21$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10300", "CYC"), (SubLObject)makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10488", "CYC"), (SubLObject)makeSymbol("BOOLEANP")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#124", "CYC"), (SubLObject)makeSymbol("FIXNUMP")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#125", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#664", "CYC"), (SubLObject)makeSymbol("FIXNUMP"))));
        $ic22$ = makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic23$ = makeSymbol("KB-N-CONSTANTS-BEFORE");
        $ic24$ = ConsesLow.list((SubLObject)makeSymbol("S#770", "CYC"), (SubLObject)makeSymbol("STRING"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#10488", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#124", "CYC"), (SubLObject)ZERO_INTEGER), (SubLObject)makeSymbol("S#125", "CYC"), (SubLObject)makeSymbol("S#10490", "CYC"));
        $ic25$ = makeString("Return the N constants with names before STRING.  When CASE-SENSITIVE? is non-nil,\n   the comparison is done in a case-sensitive fashion.  Optionally the START and END\n   character positions can be specified, such that STRING matches characters between\n   the START and END range.  If STRICT? is non-nil, then only constants strictly\n   before the string are returned.");
        $ic26$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#770", "CYC"), (SubLObject)makeSymbol("NON-NEGATIVE-INTEGER-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("STRING"), (SubLObject)makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10488", "CYC"), (SubLObject)makeSymbol("BOOLEANP")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#124", "CYC"), (SubLObject)makeSymbol("FIXNUMP")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#125", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#664", "CYC"), (SubLObject)makeSymbol("FIXNUMP"))));
        $ic27$ = makeSymbol("KB-N-CONSTANTS-AFTER");
        $ic28$ = makeString("Return the N constants with names after STRING.  When CASE-SENSITIVE? is non-nil,\n   the comparison is done in a case-sensitive fashion.  Optionally the START and END\n   character positions can be specified, such that STRING matches characters between\n   the START and END range.  If STRICT? is non-nil, then only constants strictly after\n   the string are returned.");
        $ic29$ = makeSymbol("S#10481", "CYC");
        $ic30$ = makeSymbol("S#10482", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 109 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/