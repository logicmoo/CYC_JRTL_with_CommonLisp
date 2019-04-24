package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0165 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0165";
    public static final String myFingerPrint = "0c07488748f71bec4e4c6f3d290c8557455d352ed350413b5aadf4f746cee1cf";
    private static SubLSymbol $g2176$;
    private static SubLSymbol $g2177$;
    private static SubLSymbol $g2178$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLInteger $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    
    public static SubLObject f10698(final SubLObject var1, final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0165.NIL;
        if (module0165.NIL == module0065.f4719(module0165.$g2176$.getGlobalValue())) {
            module0165.$g2176$.setGlobalValue(module0065.f4745(var1, (SubLObject)module0165.ZERO_INTEGER));
            var3 = (SubLObject)module0165.T;
        }
        if (module0165.NIL == module0065.f4719(module0165.$g2177$.getGlobalValue())) {
            module0165.$g2177$.setGlobalValue(module0065.f4745((SubLObject)module0165.$ic4$, (SubLObject)module0165.ZERO_INTEGER));
            var3 = (SubLObject)module0165.T;
        }
        if (!module0165.$g2178$.getGlobalValue().isHashtable()) {
            module0165.$g2178$.setGlobalValue(Hashtables.make_hash_table(var1, Symbols.symbol_function((SubLObject)module0165.EQUALP), (SubLObject)module0165.UNPROVIDED));
            var3 = (SubLObject)module0165.T;
        }
        return var3;
    }
    
    public static SubLObject f10699(final SubLObject var4) {
        return module0065.f4750(module0165.$g2176$.getGlobalValue(), var4, (SubLObject)module0165.UNPROVIDED);
    }
    
    public static SubLObject f10700(final SubLObject var4) {
        return module0065.f4750(module0165.$g2177$.getGlobalValue(), var4, (SubLObject)module0165.UNPROVIDED);
    }
    
    public static SubLObject f10701(final SubLObject var5) {
        return Hashtables.gethash_without_values(var5, module0165.$g2178$.getGlobalValue(), (SubLObject)module0165.UNPROVIDED);
    }
    
    public static SubLObject f10702(final SubLObject var4, final SubLObject var6, final SubLObject var7) {
        module0065.f4753(module0165.$g2176$.getGlobalValue(), var4, var6);
        Hashtables.sethash(var6, module0165.$g2178$.getGlobalValue(), var7);
        return var6;
    }
    
    public static SubLObject f10703(final SubLObject var4, final SubLObject var6, final SubLObject var7) {
        module0065.f4753(module0165.$g2177$.getGlobalValue(), var4, var6);
        Hashtables.sethash(var6, module0165.$g2178$.getGlobalValue(), var7);
        return var6;
    }
    
    public static SubLObject f10704(final SubLObject var4, final SubLObject var5) {
        module0065.f4761(module0165.$g2176$.getGlobalValue(), var4);
        Hashtables.remhash(var5, module0165.$g2178$.getGlobalValue());
        return (SubLObject)module0165.NIL;
    }
    
    public static SubLObject f10705(final SubLObject var4, final SubLObject var5) {
        module0065.f4761(module0165.$g2177$.getGlobalValue(), var4);
        Hashtables.remhash(var5, module0165.$g2178$.getGlobalValue());
        return (SubLObject)module0165.NIL;
    }
    
    public static SubLObject f10706() {
        module0065.f4762(module0165.$g2176$.getGlobalValue());
        module0065.f4762(module0165.$g2177$.getGlobalValue());
        Hashtables.clrhash(module0165.$g2178$.getGlobalValue());
        return (SubLObject)module0165.NIL;
    }
    
    public static SubLObject f10707(final SubLObject var8, final SubLObject var9) {
        SubLObject var10 = f10701(var9);
        if (module0165.NIL != var10) {
            return module0166.f10749(var10);
        }
        final SubLObject var11 = module0128.f8444();
        var10 = module0128.f8477(var8, (SubLObject)module0165.T);
        module0128.f8485(var10, var11);
        if (var8.isString()) {
            module0128.f8473(var8);
        }
        f10708(var10, var8, var9);
        return var11;
    }
    
    public static SubLObject f10708(final SubLObject var7, final SubLObject var8, final SubLObject var9) {
        f10709(var7, var9);
        if (var8.isString()) {
            module0124.f8369(var7, var8);
        }
        return (SubLObject)module0165.NIL;
    }
    
    public static SubLObject f10710(final SubLObject var8, final SubLObject var11) {
        final SubLObject var12 = module0128.f8477(var8, (SubLObject)module0165.T);
        f10711(var12, var11);
        if (var8.isString()) {
            module0128.f8473(var8);
        }
        return var12;
    }
    
    public static SubLObject f10709(final SubLObject var7, final SubLObject var9) {
        SubLObject var10 = (SubLObject)module0165.NIL;
        if (module0165.NIL != module0166.f10766(var9)) {
            var10 = module0166.f10765(var9);
        }
        else if (module0165.NIL != Guids.guid_p(var9)) {
            var10 = var9;
        }
        f10712(var7, var10);
        return var7;
    }
    
    public static SubLObject f10711(final SubLObject var7, final SubLObject var11) {
        return module0128.f8485(var7, var11);
    }
    
    public static SubLObject f10713(final SubLObject var7) {
        final SubLObject var8 = f10714(var7);
        if (var8.isString()) {
            module0124.f8370(var7, var8);
            module0128.f8473(var8);
        }
        f10715(var7);
        f10716(var7);
        module0128.f8460(var7);
        return (SubLObject)module0165.NIL;
    }
    
    public static SubLObject f10715(final SubLObject var7) {
        final SubLObject var8 = module0128.f8440(var7);
        if (var8.isInteger()) {
            module0164.f10686(var8);
        }
        return var7;
    }
    
    public static SubLObject f10716(final SubLObject var7) {
        SubLObject var8 = module0166.f10744(var7);
        if (module0165.NIL != Guids.guid_p(var8)) {
            f10704(module0128.f8440(var7), var8);
        }
        var8 = module0166.f10745(var7);
        if (module0165.NIL != Guids.guid_p(var8)) {
            f10705(module0128.f8440(var7), var8);
        }
        final SubLObject var9 = module0128.f8440(var7);
        if (var9.isInteger()) {
            module0128.f8443(var9);
        }
        return var7;
    }
    
    public static SubLObject f10717(final SubLObject var7) {
        final SubLObject var8 = module0128.f8440(var7);
        return f10699(var8);
    }
    
    public static SubLObject f10718(final SubLObject var7) {
        final SubLObject var8 = module0128.f8440(var7);
        return f10700(var8);
    }
    
    public static SubLObject f10714(final SubLObject var7) {
        return module0128.f8451(var7);
    }
    
    public static SubLObject f10719(final SubLObject var7) {
        final SubLObject var8 = module0128.f8440(var7);
        if (module0165.NIL != var8) {
            return module0164.f10675(var8);
        }
        return (SubLObject)module0165.NIL;
    }
    
    public static SubLObject f10720(final SubLObject var7) {
        module0425.f30055(var7);
        final SubLObject var8 = module0128.f8440(var7);
        if (module0165.NIL != var8) {
            return module0164.f10676(var8);
        }
        return (SubLObject)module0165.NIL;
    }
    
    public static SubLObject f10721() {
        final SubLObject var12 = module0128.f8423();
        return module0052.f3724(var12, (SubLObject)module0165.$ic5$, (SubLObject)module0165.UNPROVIDED);
    }
    
    public static SubLObject f10722(final SubLObject var7) {
        final SubLObject var8 = module0128.f8440(var7);
        final SubLObject var9 = f10714(var7);
        final SubLObject var10 = (SubLObject)(var8.isInteger() ? f10717(var7) : module0165.NIL);
        return (SubLObject)ConsesLow.list(var8, var9, var10);
    }
    
    public static SubLObject f10723(final SubLObject var7, final SubLObject var13) {
        if (module0165.NIL != module0163.f10657(var13)) {
            Errors.error((SubLObject)module0165.$ic6$, var13);
        }
        final SubLObject var14 = module0166.f10743(var7);
        if (var14.isString()) {
            module0124.f8370(var7, var14);
            module0128.f8473(var14);
        }
        f10724(var7, var13);
        if (var13.isString()) {
            module0124.f8369(var7, var13);
            module0128.f8472(var13, var7);
        }
        return var7;
    }
    
    public static SubLObject f10724(final SubLObject var7, final SubLObject var13) {
        module0128.f8453(var7, var13);
        return var7;
    }
    
    public static SubLObject f10725(final SubLObject var7, final SubLObject var15) {
        module0164.f10685(module0128.f8440(var7), var15);
        return var7;
    }
    
    public static SubLObject f10712(final SubLObject var7, final SubLObject var5) {
        assert module0165.NIL != module0128.f8449(var7) : var7;
        assert module0165.NIL != Guids.guid_p(var5) : var5;
        if (module0165.NIL == Guids.guid_p(module0166.f10744(var7))) {
            f10726(var7, var5);
        }
        return var7;
    }
    
    public static SubLObject f10726(final SubLObject var7, final SubLObject var16) {
        f10702(module0128.f8440(var7), var16, var7);
        return var7;
    }
    
    public static SubLObject f10727(final SubLObject var7, final SubLObject var16) {
        assert module0165.NIL != module0128.f8449(var7) : var7;
        assert module0165.NIL != Guids.guid_p(var16) : var16;
        if (module0165.NIL != Guids.guid_p(module0166.f10744(var7))) {
            f10703(module0128.f8440(var7), var16, var7);
        }
        return var7;
    }
    
    public static SubLObject f10728(final SubLObject var7, final SubLObject var16) {
        assert module0165.NIL != module0128.f8449(var7) : var7;
        assert module0165.NIL != Guids.guid_p(var16) : var16;
        if (module0165.NIL != Guids.guid_p(module0166.f10744(var7))) {
            f10705(module0128.f8440(var7), var16);
        }
        return var7;
    }
    
    public static SubLObject f10729(final SubLObject var7, final SubLObject var17, final SubLObject var5) {
        final SubLObject var18 = f10714(var7);
        module0128.f8485(var7, var17);
        module0128.f8473(var18);
        f10708(var7, var18, var5);
        return var7;
    }
    
    public static SubLObject f10730() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0165", "f10698", "S#10531", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0165", "f10699", "S#13532", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0165", "f10700", "S#13533", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0165", "f10701", "S#13491", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0165", "f10702", "S#13534", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0165", "f10703", "S#13535", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0165", "f10704", "S#13536", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0165", "f10705", "S#13537", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0165", "f10706", "S#10524", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0165", "f10707", "S#13488", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0165", "f10708", "S#13487", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0165", "f10710", "S#13486", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0165", "f10709", "S#10527", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0165", "f10711", "S#10526", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0165", "f10713", "S#10529", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0165", "f10715", "S#13538", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0165", "f10716", "S#13539", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0165", "f10717", "S#13492", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0165", "f10718", "S#13493", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0165", "f10714", "S#13490", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0165", "f10719", "S#10522", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0165", "f10720", "S#13540", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0165", "f10721", "S#13499", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0165", "f10722", "S#10528", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0165", "f10723", "S#13494", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0165", "f10724", "S#13541", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0165", "f10725", "S#13542", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0165", "f10712", "S#13543", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0165", "f10726", "S#13544", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0165", "f10727", "S#13545", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0165", "f10728", "S#13546", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0165", "f10729", "S#13547", 3, 0, false);
        return (SubLObject)module0165.NIL;
    }
    
    public static SubLObject f10731() {
        module0165.$g2176$ = SubLFiles.deflexical("S#13548", (SubLObject)((module0165.NIL != Symbols.boundp((SubLObject)module0165.$ic0$)) ? module0165.$g2176$.getGlobalValue() : module0165.$ic1$));
        module0165.$g2177$ = SubLFiles.deflexical("S#13549", (SubLObject)((module0165.NIL != Symbols.boundp((SubLObject)module0165.$ic2$)) ? module0165.$g2177$.getGlobalValue() : module0165.$ic1$));
        module0165.$g2178$ = SubLFiles.deflexical("S#13550", (SubLObject)((module0165.NIL != Symbols.boundp((SubLObject)module0165.$ic3$)) ? module0165.$g2178$.getGlobalValue() : module0165.NIL));
        return (SubLObject)module0165.NIL;
    }
    
    public static SubLObject f10732() {
        module0003.f57((SubLObject)module0165.$ic0$);
        module0003.f57((SubLObject)module0165.$ic2$);
        module0003.f57((SubLObject)module0165.$ic3$);
        return (SubLObject)module0165.NIL;
    }
    
    public void declareFunctions() {
        f10730();
    }
    
    public void initializeVariables() {
        f10731();
    }
    
    public void runTopLevelForms() {
        f10732();
    }
    
    static {
        me = (SubLFile)new module0165();
        module0165.$g2176$ = null;
        module0165.$g2177$ = null;
        module0165.$g2178$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#13548", "CYC");
        $ic1$ = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $ic2$ = SubLObjectFactory.makeSymbol("S#13549", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("S#13550", "CYC");
        $ic4$ = SubLObjectFactory.makeInteger(750);
        $ic5$ = SubLObjectFactory.makeSymbol("S#10528", "CYC");
        $ic6$ = SubLObjectFactory.makeString("A constant with the name ~s already exists.");
        $ic7$ = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $ic8$ = SubLObjectFactory.makeSymbol("GUID-P");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0165.class
	Total time: 81 ms
	
	Decompiled with Procyon 0.5.32.
*/