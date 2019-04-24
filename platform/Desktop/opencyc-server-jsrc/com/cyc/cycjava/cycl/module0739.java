package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0739 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0739";
    public static final String myFingerPrint = "4be428f604a7c3486a8223d7056594bde9559cf7c3b5b8d567c277f5ecaa2d0f";
    public static SubLSymbol $g5755$;
    private static SubLSymbol $g5874$;
    private static final SubLSymbol $ic0$;
    private static final SubLString $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLString $ic11$;
    private static final SubLString $ic12$;
    private static final SubLList $ic13$;
    private static final SubLList $ic14$;
    private static final SubLString $ic15$;
    private static final SubLString $ic16$;
    
    public static SubLObject f45848(final SubLObject var1, SubLObject var2) {
        if (var2 == module0739.UNPROVIDED) {
            var2 = module0585.$g4447$.getDynamicValue();
        }
        assert module0739.NIL != Types.stringp(var1) : var1;
        if (module0739.NIL == f45849(module0739.$g5755$.getGlobalValue())) {
            Errors.warn((SubLObject)module0739.$ic1$);
            return (SubLObject)module0739.NIL;
        }
        final SubLObject var3 = f45850(var1);
        final SubLObject var4 = Mapping.mapcan(Symbols.symbol_function((SubLObject)module0739.$ic2$), module0087.f5984(module0739.$g5755$.getGlobalValue(), var3), module0739.EMPTY_SUBL_OBJECT_ARRAY);
        if (module0739.NIL != var2) {
            SubLObject var5 = (SubLObject)module0739.NIL;
            SubLObject var6 = var4;
            SubLObject var7 = (SubLObject)module0739.NIL;
            var7 = var6.first();
            while (module0739.NIL != var6) {
                if (module0739.NIL != module0038.f2675(var7, var3, Symbols.symbol_function((SubLObject)module0739.$ic3$))) {
                    var5 = (SubLObject)ConsesLow.cons(f45851(var7), var5);
                }
                var6 = var6.rest();
                var7 = var6.first();
            }
            return var5;
        }
        return Mapping.mapcar((SubLObject)module0739.$ic4$, var4);
    }
    
    public static SubLObject f45852(final SubLObject var1, final SubLObject var8) {
        assert module0739.NIL != Types.stringp(var1) : var1;
        assert module0739.NIL != Types.function_spec_p(var8) : var8;
        SubLObject var9 = (SubLObject)module0739.NIL;
        SubLObject var10 = f45848(var1, (SubLObject)module0739.UNPROVIDED);
        SubLObject var11 = (SubLObject)module0739.NIL;
        var11 = var10.first();
        while (module0739.NIL != var10) {
            if (module0739.NIL != Sequences.find_if(var8, module0731.f44783(var11, (SubLObject)module0739.UNPROVIDED, (SubLObject)module0739.UNPROVIDED, (SubLObject)module0739.UNPROVIDED, (SubLObject)module0739.UNPROVIDED, (SubLObject)module0739.UNPROVIDED, (SubLObject)module0739.UNPROVIDED, (SubLObject)module0739.UNPROVIDED, (SubLObject)module0739.UNPROVIDED), (SubLObject)module0739.UNPROVIDED, (SubLObject)module0739.UNPROVIDED, (SubLObject)module0739.UNPROVIDED)) {
                var9 = (SubLObject)ConsesLow.cons(var11, var9);
            }
            var10 = var10.rest();
            var11 = var10.first();
        }
        return var9;
    }
    
    public static SubLObject f45853(final SubLObject var1, final SubLObject var11, SubLObject var12, SubLObject var13) {
        if (var12 == module0739.UNPROVIDED) {
            var12 = (SubLObject)module0739.NIL;
        }
        if (var13 == module0739.UNPROVIDED) {
            var13 = module0584.$g4396$.getDynamicValue();
        }
        assert module0739.NIL != Types.stringp(var1) : var1;
        assert module0739.NIL != module0269.f17713(var11, (SubLObject)module0739.UNPROVIDED) : var11;
        SubLObject var14 = (SubLObject)module0739.NIL;
        SubLObject var15 = f45848(var1, (SubLObject)module0739.UNPROVIDED);
        SubLObject var16 = (SubLObject)module0739.NIL;
        var16 = var15.first();
        while (module0739.NIL != var15) {
            SubLObject var17 = (SubLObject)module0739.NIL;
            if (module0739.NIL == var17) {
                SubLObject var18;
                SubLObject var19;
                for (var18 = module0731.f44783(var16, (SubLObject)module0739.NIL, (SubLObject)module0739.$ic7$, (SubLObject)module0739.T, (SubLObject)module0739.NIL, var13, (SubLObject)module0739.$ic8$, (SubLObject)module0739.NIL, (SubLObject)module0739.UNPROVIDED), var19 = (SubLObject)module0739.NIL, var19 = var18.first(); module0739.NIL == var17 && module0739.NIL != var18; var17 = module0259.f16854(var19, var11, var12, (SubLObject)module0739.UNPROVIDED), var18 = var18.rest(), var19 = var18.first()) {}
            }
            if (module0739.NIL != var17) {
                var14 = (SubLObject)ConsesLow.cons(var16, var14);
            }
            var15 = var15.rest();
            var16 = var15.first();
        }
        return var14;
    }
    
    public static SubLObject f45850(final SubLObject var1) {
        return (module0739.NIL != Sequences.find(module0087.$g1177$.getGlobalValue(), var1, (SubLObject)module0739.UNPROVIDED, (SubLObject)module0739.UNPROVIDED, (SubLObject)module0739.UNPROVIDED, (SubLObject)module0739.UNPROVIDED)) ? module0038.f2842(module0739.$g5874$.getGlobalValue(), module0087.$g1177$.getGlobalValue(), var1) : var1;
    }
    
    public static SubLObject f45851(final SubLObject var1) {
        return (module0739.NIL != Sequences.find(module0739.$g5874$.getGlobalValue(), var1, (SubLObject)module0739.UNPROVIDED, (SubLObject)module0739.UNPROVIDED, (SubLObject)module0739.UNPROVIDED, (SubLObject)module0739.UNPROVIDED)) ? module0038.f2842(module0087.$g1177$.getGlobalValue(), module0739.$g5874$.getGlobalValue(), var1) : var1;
    }
    
    public static SubLObject f45854() {
        if (module0739.NIL != f45849(module0739.$g5755$.getGlobalValue())) {
            f45855();
        }
        else {
            module0739.$g5755$.setGlobalValue(f45856());
        }
        return module0739.$g5755$.getGlobalValue();
    }
    
    public static SubLObject f45857() {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        if (module0739.NIL == Errors.$ignore_mustsP$.getDynamicValue(var17) && module0739.NIL == module0737.f45541((SubLObject)module0739.UNPROVIDED)) {
            Errors.error((SubLObject)module0739.$ic11$);
        }
        f45854();
        final SubLObject var18 = module0737.$g5846$.getGlobalValue();
        SubLObject var19 = (SubLObject)module0739.NIL;
        try {
            var19 = Locks.seize_lock(var18);
            final SubLObject var20_21 = module0737.$g5846$.getGlobalValue();
            SubLObject var22_23 = (SubLObject)module0739.NIL;
            try {
                var22_23 = Locks.seize_lock(var20_21);
                final SubLObject var20 = module0096.$g1265$.currentBinding(var17);
                try {
                    module0096.$g1265$.bind(module0737.$g5827$.getGlobalValue(), var17);
                    final SubLObject var21 = module0054.f3968();
                    final SubLObject var22 = module0737.f45538();
                    final SubLObject var23 = (SubLObject)module0739.$ic12$;
                    SubLObject var24 = (SubLObject)module0739.ZERO_INTEGER;
                    final SubLObject var25 = module0079.f5406(var22);
                    assert module0739.NIL != Types.stringp(var23) : var23;
                    final SubLObject var24_30 = module0012.$g75$.currentBinding(var17);
                    final SubLObject var26 = module0012.$g76$.currentBinding(var17);
                    final SubLObject var27 = module0012.$g77$.currentBinding(var17);
                    final SubLObject var28 = module0012.$g78$.currentBinding(var17);
                    try {
                        module0012.$g75$.bind((SubLObject)module0739.ZERO_INTEGER, var17);
                        module0012.$g76$.bind((SubLObject)module0739.NIL, var17);
                        module0012.$g77$.bind((SubLObject)module0739.T, var17);
                        module0012.$g78$.bind(Time.get_universal_time(), var17);
                        module0012.f478(var23);
                        final SubLObject var29 = module0079.f5424(var22);
                        SubLObject var32;
                        for (SubLObject var30 = (SubLObject)module0739.NIL; module0739.NIL == var30; var30 = (SubLObject)SubLObjectFactory.makeBoolean(module0739.NIL == var32)) {
                            var17.resetMultipleValues();
                            final SubLObject var31 = module0052.f3693(var29);
                            var32 = var17.secondMultipleValue();
                            var17.resetMultipleValues();
                            if (module0739.NIL != var32) {
                                SubLObject var34;
                                final SubLObject var33 = var34 = var31;
                                SubLObject var35 = (SubLObject)module0739.NIL;
                                SubLObject var36 = (SubLObject)module0739.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0739.$ic13$);
                                var35 = var34.first();
                                var34 = var34.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0739.$ic13$);
                                var36 = var34.first();
                                var34 = var34.rest();
                                if (module0739.NIL == var34) {
                                    module0012.note_percent_progress(var24, var25);
                                    var24 = Numbers.add(var24, (SubLObject)module0739.ONE_INTEGER);
                                    if (module0739.NIL != module0079.f5404(var36)) {
                                        module0054.f3973(var36, var21);
                                        while (module0739.NIL == module0054.f3970(var21)) {
                                            final SubLObject var37 = module0054.f3974(var21);
                                            final SubLObject var34_43 = module0079.f5424(var37);
                                            SubLObject var37_46;
                                            for (SubLObject var35_44 = (SubLObject)module0739.NIL; module0739.NIL == var35_44; var35_44 = (SubLObject)SubLObjectFactory.makeBoolean(module0739.NIL == var37_46)) {
                                                var17.resetMultipleValues();
                                                final SubLObject var36_45 = module0052.f3693(var34_43);
                                                var37_46 = var17.secondMultipleValue();
                                                var17.resetMultipleValues();
                                                if (module0739.NIL != var37_46) {
                                                    SubLObject var49_50;
                                                    final SubLObject var47_48 = var49_50 = var36_45;
                                                    SubLObject var38 = (SubLObject)module0739.NIL;
                                                    SubLObject var39 = (SubLObject)module0739.NIL;
                                                    cdestructuring_bind.destructuring_bind_must_consp(var49_50, var47_48, (SubLObject)module0739.$ic14$);
                                                    var38 = var49_50.first();
                                                    var49_50 = var49_50.rest();
                                                    cdestructuring_bind.destructuring_bind_must_consp(var49_50, var47_48, (SubLObject)module0739.$ic14$);
                                                    var39 = var49_50.first();
                                                    var49_50 = var49_50.rest();
                                                    if (module0739.NIL == var49_50) {
                                                        if (module0739.NIL != module0079.f5404(var39)) {
                                                            module0054.f3973(var39, var21);
                                                        }
                                                        else if (var39.isCons()) {
                                                            final SubLObject var40 = var39.first();
                                                            SubLObject var42;
                                                            final SubLObject var41 = var42 = var39.rest();
                                                            SubLObject var55_56 = (SubLObject)module0739.NIL;
                                                            var55_56 = var42.first();
                                                            while (module0739.NIL != var42) {
                                                                final SubLObject var43 = module0737.f45336(var55_56);
                                                                f45858(var43);
                                                                var42 = var42.rest();
                                                                var55_56 = var42.first();
                                                            }
                                                        }
                                                    }
                                                    else {
                                                        cdestructuring_bind.cdestructuring_bind_error(var47_48, (SubLObject)module0739.$ic14$);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    else if (var36.isCons()) {
                                        final SubLObject var44 = var36.first();
                                        SubLObject var46;
                                        final SubLObject var45 = var46 = var36.rest();
                                        SubLObject var47 = (SubLObject)module0739.NIL;
                                        var47 = var46.first();
                                        while (module0739.NIL != var46) {
                                            final SubLObject var48 = module0737.f45336(var47);
                                            f45858(var48);
                                            var46 = var46.rest();
                                            var47 = var46.first();
                                        }
                                    }
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(var33, (SubLObject)module0739.$ic13$);
                                }
                            }
                        }
                        module0012.f479();
                    }
                    finally {
                        module0012.$g78$.rebind(var28, var17);
                        module0012.$g77$.rebind(var27, var17);
                        module0012.$g76$.rebind(var26, var17);
                        module0012.$g75$.rebind(var24_30, var17);
                    }
                }
                finally {
                    module0096.$g1265$.rebind(var20, var17);
                }
            }
            finally {
                if (module0739.NIL != var22_23) {
                    Locks.release_lock(var20_21);
                }
            }
        }
        finally {
            if (module0739.NIL != var19) {
                Locks.release_lock(var18);
            }
        }
        return module0739.$g5755$.getGlobalValue();
    }
    
    public static SubLObject f45858(final SubLObject var10) {
        final SubLObject var11 = f45850(var10);
        if (module0739.NIL == module0087.f5969(var11)) {
            Errors.warn((SubLObject)module0739.$ic15$, var11);
        }
        else if (module0739.NIL == f45849(module0739.$g5755$.getGlobalValue())) {
            Errors.warn((SubLObject)module0739.$ic16$, var11);
        }
        else if (module0739.NIL == conses_high.member(var11, module0087.f5976(module0739.$g5755$.getGlobalValue(), var11), Symbols.symbol_function((SubLObject)module0739.EQUAL), (SubLObject)module0739.UNPROVIDED)) {
            module0087.f5971(module0739.$g5755$.getGlobalValue(), var11, var11);
        }
        return module0739.$g5755$.getGlobalValue();
    }
    
    public static SubLObject f45859(final SubLObject var10) {
        final SubLObject var11 = f45850(var10);
        if (module0739.NIL != module0087.f5969(var11) && module0739.NIL != f45849(module0739.$g5755$.getGlobalValue())) {
            module0087.f5975(module0739.$g5755$.getGlobalValue(), var11, var11);
        }
        return module0739.$g5755$.getGlobalValue();
    }
    
    public static SubLObject f45855() {
        module0087.f5955(module0739.$g5755$.getGlobalValue());
        return module0739.$g5755$.getGlobalValue();
    }
    
    public static SubLObject f45856() {
        return module0087.f5954(module0087.f5958(module0737.f45538()));
    }
    
    public static SubLObject f45849(final SubLObject var58) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0739.NIL != module0087.f5956(var58, (SubLObject)module0739.UNPROVIDED) && module0739.NIL != module0737.f45541((SubLObject)module0739.UNPROVIDED) && module0087.f5958(var58).eql(module0087.f5958(module0737.f45538())));
    }
    
    public static SubLObject f45860() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0739", "f45848", "S#44566", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0739", "f45852", "S#50115", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0739", "f45853", "S#44565", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0739", "f45850", "S#50116", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0739", "f45851", "S#50117", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0739", "f45854", "S#49552", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0739", "f45857", "S#50118", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0739", "f45858", "S#49561", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0739", "f45859", "S#49563", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0739", "f45855", "S#50119", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0739", "f45856", "S#50120", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0739", "f45849", "S#50121", 1, 0, false);
        return (SubLObject)module0739.NIL;
    }
    
    public static SubLObject f45861() {
        module0739.$g5755$ = SubLFiles.deflexical("S#49991", (SubLObject)((module0739.NIL != Symbols.boundp((SubLObject)module0739.$ic9$)) ? module0739.$g5755$.getGlobalValue() : module0739.$ic10$));
        module0739.$g5874$ = SubLFiles.deflexical("S#50122", Characters.code_char((SubLObject)module0739.SEVEN_INTEGER));
        return (SubLObject)module0739.NIL;
    }
    
    public static SubLObject f45862() {
        module0003.f57((SubLObject)module0739.$ic9$);
        return (SubLObject)module0739.NIL;
    }
    
    public void declareFunctions() {
        f45860();
    }
    
    public void initializeVariables() {
        f45861();
    }
    
    public void runTopLevelForms() {
        f45862();
    }
    
    static {
        me = (SubLFile)new module0739();
        module0739.$g5755$ = null;
        module0739.$g5874$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic1$ = SubLObjectFactory.makeString("NL Trie Completion Index is not initialized.");
        $ic2$ = SubLObjectFactory.makeSymbol("S#3391", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("CHAR=");
        $ic4$ = SubLObjectFactory.makeSymbol("S#50117", "CYC");
        $ic5$ = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $ic6$ = SubLObjectFactory.makeSymbol("S#17581", "CYC");
        $ic7$ = SubLObjectFactory.makeKeyword("DENOT");
        $ic8$ = SubLObjectFactory.makeKeyword("NEVER");
        $ic9$ = SubLObjectFactory.makeSymbol("S#49991", "CYC");
        $ic10$ = SubLObjectFactory.makeKeyword("UNPREPARED");
        $ic11$ = SubLObjectFactory.makeString("The NL Trie must be initialized before a completion index can be built.");
        $ic12$ = SubLObjectFactory.makeString("Populating NL Trie completion index...");
        $ic13$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("US#6CABE02"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#7901B45"));
        $ic14$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("US#794E61F"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#712B0A2"));
        $ic15$ = SubLObjectFactory.makeString("Can't use ~S as a key for the NL Trie completion index.");
        $ic16$ = SubLObjectFactory.makeString("NL Trie completion index is not prepared. Can't add ~S");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0739.class
	Total time: 201 ms
	
	Decompiled with Procyon 0.5.32.
*/