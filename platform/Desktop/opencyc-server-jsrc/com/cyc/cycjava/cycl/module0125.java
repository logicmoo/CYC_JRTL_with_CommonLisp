package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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
        if (var2 == module0125.UNPROVIDED) {
            var2 = (SubLObject)module0125.ZERO_INTEGER;
        }
        if (var3 == module0125.UNPROVIDED) {
            var3 = (SubLObject)module0125.NIL;
        }
        assert module0125.NIL != Types.stringp(var1) : var1;
        assert module0125.NIL != Types.fixnump(var2) : var2;
        if (module0125.NIL != var3 && !module0125.areAssertionsDisabledFor(me) && module0125.NIL == Types.fixnump(var3)) {
            throw new AssertionError(var3);
        }
        if (module0125.NIL != oc_hl_interface_infrastructure.f8291()) {
            return oc_hl_interface_infrastructure.f8304((SubLObject)ConsesLow.list((SubLObject)module0125.$ic2$, (SubLObject)ConsesLow.list((SubLObject)module0125.$ic3$, var1), (SubLObject)ConsesLow.list((SubLObject)module0125.$ic3$, var2), (SubLObject)ConsesLow.list((SubLObject)module0125.$ic3$, var3)));
        }
        final SubLObject var4 = module0124.f8360(var1, var2, var3);
        if (module0125.NIL != var4) {
            return var4;
        }
        return (SubLObject)module0125.NIL;
    }
    
    public static SubLObject f8376(final SubLObject var5, SubLObject var6, SubLObject var7, SubLObject var2, SubLObject var3) {
        if (var6 == module0125.UNPROVIDED) {
            var6 = (SubLObject)module0125.NIL;
        }
        if (var7 == module0125.UNPROVIDED) {
            var7 = (SubLObject)module0125.NIL;
        }
        if (var2 == module0125.UNPROVIDED) {
            var2 = (SubLObject)module0125.ZERO_INTEGER;
        }
        if (var3 == module0125.UNPROVIDED) {
            var3 = (SubLObject)module0125.NIL;
        }
        assert module0125.NIL != Types.stringp(var5) : var5;
        assert module0125.NIL != Types.booleanp(var6) : var6;
        assert module0125.NIL != Types.booleanp(var7) : var7;
        assert module0125.NIL != Types.fixnump(var2) : var2;
        if (module0125.NIL != var3 && !module0125.areAssertionsDisabledFor(me) && module0125.NIL == Types.fixnump(var3)) {
            throw new AssertionError(var3);
        }
        if (module0125.NIL != oc_hl_interface_infrastructure.f8291()) {
            return oc_hl_interface_infrastructure.f8304((SubLObject)ConsesLow.list((SubLObject)module0125.$ic9$, (SubLObject)ConsesLow.list((SubLObject)module0125.$ic3$, var5), (SubLObject)ConsesLow.list((SubLObject)module0125.$ic3$, var6), (SubLObject)ConsesLow.list((SubLObject)module0125.$ic3$, var7), (SubLObject)ConsesLow.list((SubLObject)module0125.$ic3$, var2), (SubLObject)ConsesLow.list((SubLObject)module0125.$ic3$, var3)));
        }
        final SubLObject var8 = module0124.f8361(var5, var6, var7, var2, var3);
        if (module0125.NIL != var8) {
            return var8;
        }
        return (SubLObject)module0125.NIL;
    }
    
    public static SubLObject f8377(final SubLObject var8, SubLObject var6, SubLObject var2, SubLObject var3) {
        if (var6 == module0125.UNPROVIDED) {
            var6 = (SubLObject)module0125.NIL;
        }
        if (var2 == module0125.UNPROVIDED) {
            var2 = (SubLObject)module0125.ZERO_INTEGER;
        }
        if (var3 == module0125.UNPROVIDED) {
            var3 = (SubLObject)module0125.NIL;
        }
        assert module0125.NIL != Types.stringp(var8) : var8;
        assert module0125.NIL != Types.booleanp(var6) : var6;
        assert module0125.NIL != Types.fixnump(var2) : var2;
        if (module0125.NIL != var3 && !module0125.areAssertionsDisabledFor(me) && module0125.NIL == Types.fixnump(var3)) {
            throw new AssertionError(var3);
        }
        if (module0125.NIL != oc_hl_interface_infrastructure.f8291()) {
            return oc_hl_interface_infrastructure.f8304((SubLObject)ConsesLow.list((SubLObject)module0125.$ic14$, (SubLObject)ConsesLow.list((SubLObject)module0125.$ic3$, var8), (SubLObject)ConsesLow.list((SubLObject)module0125.$ic3$, var6), (SubLObject)ConsesLow.list((SubLObject)module0125.$ic3$, var2), (SubLObject)ConsesLow.list((SubLObject)module0125.$ic3$, var3)));
        }
        final SubLObject var9 = module0124.f8362(var8, var6, var2, var3);
        if (module0125.NIL != var9) {
            return var9;
        }
        return (SubLObject)module0125.NIL;
    }
    
    public static SubLObject f8378(final SubLObject var9, SubLObject var6, SubLObject var2, SubLObject var3) {
        if (var6 == module0125.UNPROVIDED) {
            var6 = (SubLObject)module0125.NIL;
        }
        if (var2 == module0125.UNPROVIDED) {
            var2 = (SubLObject)module0125.ZERO_INTEGER;
        }
        if (var3 == module0125.UNPROVIDED) {
            var3 = (SubLObject)module0125.NIL;
        }
        assert module0125.NIL != Types.stringp(var9) : var9;
        assert module0125.NIL != Types.booleanp(var6) : var6;
        assert module0125.NIL != Types.fixnump(var2) : var2;
        if (module0125.NIL != var3 && !module0125.areAssertionsDisabledFor(me) && module0125.NIL == Types.fixnump(var3)) {
            throw new AssertionError(var3);
        }
        if (module0125.NIL != oc_hl_interface_infrastructure.f8291()) {
            return oc_hl_interface_infrastructure.f8304((SubLObject)ConsesLow.list((SubLObject)module0125.$ic18$, (SubLObject)ConsesLow.list((SubLObject)module0125.$ic3$, var9), (SubLObject)ConsesLow.list((SubLObject)module0125.$ic3$, var6), (SubLObject)ConsesLow.list((SubLObject)module0125.$ic3$, var2), (SubLObject)ConsesLow.list((SubLObject)module0125.$ic3$, var3)));
        }
        final SubLObject var10 = module0124.f8363(var9, var6, var2, var3);
        if (module0125.NIL != var10) {
            return var10;
        }
        return (SubLObject)module0125.NIL;
    }
    
    public static SubLObject f8379(final SubLObject var10, final SubLObject var1, SubLObject var6, SubLObject var2, SubLObject var3, SubLObject var11) {
        if (var6 == module0125.UNPROVIDED) {
            var6 = (SubLObject)module0125.NIL;
        }
        if (var2 == module0125.UNPROVIDED) {
            var2 = (SubLObject)module0125.ZERO_INTEGER;
        }
        if (var3 == module0125.UNPROVIDED) {
            var3 = (SubLObject)module0125.NIL;
        }
        if (var11 == module0125.UNPROVIDED) {
            var11 = (SubLObject)module0125.NIL;
        }
        assert module0125.NIL != module0004.f106(var10) : var10;
        assert module0125.NIL != Types.stringp(var1) : var1;
        assert module0125.NIL != Types.booleanp(var6) : var6;
        assert module0125.NIL != Types.fixnump(var2) : var2;
        if (module0125.NIL != var3 && !module0125.areAssertionsDisabledFor(me) && module0125.NIL == Types.fixnump(var3)) {
            throw new AssertionError(var3);
        }
        if (module0125.NIL != oc_hl_interface_infrastructure.f8291()) {
            return oc_hl_interface_infrastructure.f8304((SubLObject)ConsesLow.list((SubLObject)module0125.$ic23$, (SubLObject)ConsesLow.list((SubLObject)module0125.$ic3$, var10), (SubLObject)ConsesLow.list((SubLObject)module0125.$ic3$, var1), (SubLObject)ConsesLow.list((SubLObject)module0125.$ic3$, var6), (SubLObject)ConsesLow.list((SubLObject)module0125.$ic3$, var2), (SubLObject)ConsesLow.list((SubLObject)module0125.$ic3$, var3), (SubLObject)ConsesLow.list((SubLObject)module0125.$ic3$, var11)));
        }
        final SubLObject var12 = module0124.f8364(var10, var1, var6, var2, var3, var11);
        if (module0125.NIL != var12) {
            return var12;
        }
        return (SubLObject)module0125.NIL;
    }
    
    public static SubLObject f8380(final SubLObject var10, final SubLObject var1, SubLObject var6, SubLObject var2, SubLObject var3, SubLObject var11) {
        if (var6 == module0125.UNPROVIDED) {
            var6 = (SubLObject)module0125.NIL;
        }
        if (var2 == module0125.UNPROVIDED) {
            var2 = (SubLObject)module0125.ZERO_INTEGER;
        }
        if (var3 == module0125.UNPROVIDED) {
            var3 = (SubLObject)module0125.NIL;
        }
        if (var11 == module0125.UNPROVIDED) {
            var11 = (SubLObject)module0125.NIL;
        }
        assert module0125.NIL != module0004.f106(var10) : var10;
        assert module0125.NIL != Types.stringp(var1) : var1;
        assert module0125.NIL != Types.booleanp(var6) : var6;
        assert module0125.NIL != Types.fixnump(var2) : var2;
        if (module0125.NIL != var3 && !module0125.areAssertionsDisabledFor(me) && module0125.NIL == Types.fixnump(var3)) {
            throw new AssertionError(var3);
        }
        if (module0125.NIL != oc_hl_interface_infrastructure.f8291()) {
            return oc_hl_interface_infrastructure.f8304((SubLObject)ConsesLow.list((SubLObject)module0125.$ic27$, (SubLObject)ConsesLow.list((SubLObject)module0125.$ic3$, var10), (SubLObject)ConsesLow.list((SubLObject)module0125.$ic3$, var1), (SubLObject)ConsesLow.list((SubLObject)module0125.$ic3$, var6), (SubLObject)ConsesLow.list((SubLObject)module0125.$ic3$, var2), (SubLObject)ConsesLow.list((SubLObject)module0125.$ic3$, var3), (SubLObject)ConsesLow.list((SubLObject)module0125.$ic3$, var11)));
        }
        final SubLObject var12 = module0124.f8366(var10, var1, var6, var2, var3, var11);
        if (module0125.NIL != var12) {
            return var12;
        }
        return (SubLObject)module0125.NIL;
    }
    
    public static SubLObject f8381(SubLObject var12, SubLObject var13) {
        if (var12 == module0125.UNPROVIDED) {
            var12 = (SubLObject)module0125.T;
        }
        if (var13 == module0125.UNPROVIDED) {
            var13 = (SubLObject)module0125.ONE_INTEGER;
        }
        return oc_hl_interface_infrastructure.f8328((SubLObject)ConsesLow.list((SubLObject)module0125.$ic29$, module0035.f2241(var12)), var13);
    }
    
    public static SubLObject f8382(final SubLObject var1, SubLObject var6, SubLObject var2, SubLObject var3, SubLObject var12, SubLObject var13) {
        if (var6 == module0125.UNPROVIDED) {
            var6 = (SubLObject)module0125.T;
        }
        if (var2 == module0125.UNPROVIDED) {
            var2 = (SubLObject)module0125.ZERO_INTEGER;
        }
        if (var3 == module0125.UNPROVIDED) {
            var3 = (SubLObject)module0125.NIL;
        }
        if (var12 == module0125.UNPROVIDED) {
            var12 = (SubLObject)module0125.T;
        }
        if (var13 == module0125.UNPROVIDED) {
            var13 = (SubLObject)module0125.ONE_INTEGER;
        }
        return oc_hl_interface_infrastructure.f8328((SubLObject)ConsesLow.list((SubLObject)module0125.$ic30$, module0035.f2241(var1), module0035.f2241(var6), module0035.f2241(var2), module0035.f2241(var3), module0035.f2241(var12)), var13);
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
        return (SubLObject)module0125.NIL;
    }
    
    public static SubLObject f8384() {
        return (SubLObject)module0125.NIL;
    }
    
    public static SubLObject f8385() {
        module0012.f368((SubLObject)module0125.$ic2$, (SubLObject)module0125.$ic4$, (SubLObject)module0125.$ic5$, (SubLObject)module0125.$ic6$, (SubLObject)module0125.$ic7$);
        module0012.f368((SubLObject)module0125.$ic9$, (SubLObject)module0125.$ic10$, (SubLObject)module0125.$ic11$, (SubLObject)module0125.$ic12$, (SubLObject)module0125.$ic13$);
        module0012.f368((SubLObject)module0125.$ic14$, (SubLObject)module0125.$ic15$, (SubLObject)module0125.$ic16$, (SubLObject)module0125.$ic17$, (SubLObject)module0125.$ic13$);
        module0012.f368((SubLObject)module0125.$ic18$, (SubLObject)module0125.$ic19$, (SubLObject)module0125.$ic20$, (SubLObject)module0125.$ic21$, (SubLObject)module0125.$ic13$);
        module0012.f368((SubLObject)module0125.$ic23$, (SubLObject)module0125.$ic24$, (SubLObject)module0125.$ic25$, (SubLObject)module0125.$ic26$, (SubLObject)module0125.$ic13$);
        module0012.f368((SubLObject)module0125.$ic27$, (SubLObject)module0125.$ic24$, (SubLObject)module0125.$ic28$, (SubLObject)module0125.$ic26$, (SubLObject)module0125.$ic13$);
        return (SubLObject)module0125.NIL;
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
        $ic0$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic1$ = SubLObjectFactory.makeSymbol("FIXNUMP");
        $ic2$ = SubLObjectFactory.makeSymbol("KB-CONSTANT-COMPLETE-EXACT");
        $ic3$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#124", "CYC"), (SubLObject)module0125.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("S#125", "CYC"));
        $ic5$ = SubLObjectFactory.makeString("Return a valid constant whose name exactly matches STRING.\n   Optionally the START and END character positions can be\n   specified, such that the STRING matches characters between the START and \n   END range.  If no constant exists, return NIL.");
        $ic6$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#124", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FIXNUMP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#125", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#664", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FIXNUMP"))));
        $ic7$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#664", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-P")));
        $ic8$ = SubLObjectFactory.makeSymbol("BOOLEANP");
        $ic9$ = SubLObjectFactory.makeSymbol("KB-CONSTANT-COMPLETE");
        $ic10$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10299", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#10488", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10489", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#124", "CYC"), (SubLObject)module0125.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("S#125", "CYC"));
        $ic11$ = SubLObjectFactory.makeString("Return all valid constants with PREFIX as a prefix of their name\n   When CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\n   When EXACT-LENGTH? is non-nil, the prefix must be the entire string\n   Optionally the START and END character positions can be\n   specified, such that the PREFIX matches characters between the START and \n   END range.  If no constant exists, return NIL.");
        $ic12$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10299", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10488", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10489", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#124", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FIXNUMP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#125", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#664", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FIXNUMP"))));
        $ic13$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-P")));
        $ic14$ = SubLObjectFactory.makeSymbol("KB-CONSTANT-APROPOS");
        $ic15$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#368", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#10488", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#124", "CYC"), (SubLObject)module0125.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("S#125", "CYC"));
        $ic16$ = SubLObjectFactory.makeString("Return all valid constants with SUBSTRING somewhere in their name\n   When CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\n   Optionally the START and END character positions can be\n   specified, such that the SUBSTRING matches characters between the START and \n   END range.  If no constant exists, return NIL.");
        $ic17$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#368", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10488", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#124", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FIXNUMP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#125", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#664", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FIXNUMP"))));
        $ic18$ = SubLObjectFactory.makeSymbol("KB-CONSTANT-POSTFIX");
        $ic19$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10300", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#10488", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#124", "CYC"), (SubLObject)module0125.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("S#125", "CYC"));
        $ic20$ = SubLObjectFactory.makeString("Return all valid constants with POSTFIX as a postfix of their name\n   When CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\n   Optionally the START and END character positions can be\n   specified, such that the SUBSTRING matches characters between the START and \n   END range.  If no constant exists, return NIL.");
        $ic21$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10300", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10488", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#124", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FIXNUMP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#125", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#664", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FIXNUMP"))));
        $ic22$ = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic23$ = SubLObjectFactory.makeSymbol("KB-N-CONSTANTS-BEFORE");
        $ic24$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#770", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#10488", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#124", "CYC"), (SubLObject)module0125.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("S#125", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10490", "CYC"));
        $ic25$ = SubLObjectFactory.makeString("Return the N constants with names before STRING.  When CASE-SENSITIVE? is non-nil,\n   the comparison is done in a case-sensitive fashion.  Optionally the START and END\n   character positions can be specified, such that STRING matches characters between\n   the START and END range.  If STRICT? is non-nil, then only constants strictly\n   before the string are returned.");
        $ic26$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#770", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10488", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#124", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FIXNUMP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#125", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#664", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FIXNUMP"))));
        $ic27$ = SubLObjectFactory.makeSymbol("KB-N-CONSTANTS-AFTER");
        $ic28$ = SubLObjectFactory.makeString("Return the N constants with names after STRING.  When CASE-SENSITIVE? is non-nil,\n   the comparison is done in a case-sensitive fashion.  Optionally the START and END\n   character positions can be specified, such that STRING matches characters between\n   the START and END range.  If STRICT? is non-nil, then only constants strictly after\n   the string are returned.");
        $ic29$ = SubLObjectFactory.makeSymbol("S#10481", "CYC");
        $ic30$ = SubLObjectFactory.makeSymbol("S#10482", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0125.class
	Total time: 109 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/