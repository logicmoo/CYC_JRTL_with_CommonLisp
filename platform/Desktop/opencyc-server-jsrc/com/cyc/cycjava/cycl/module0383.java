package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0383 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0383";
    public static final String myFingerPrint = "e2efb35cebcddf2457fbd04dd7ecd729f2f8262a5a3475905bc106c925b2a0dc";
    private static SubLSymbol $g3223$;
    public static SubLSymbol $g3224$;
    public static SubLSymbol $g3225$;
    private static SubLSymbol $g3226$;
    private static final SubLSymbol $ic0$;
    private static final SubLString $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    
    public static SubLObject f27227(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0383.NIL != module0364.f24699(var1) && module0383.$ic0$ == module0364.f24721(var1));
    }
    
    public static SubLObject f27228(final SubLObject var2, final SubLObject var3) {
        final SubLObject var4 = module0363.f24527(var2);
        SubLObject var5;
        SubLObject var6;
        SubLObject var7;
        SubLObject var8;
        for (var5 = module0032.f1741(var4), var6 = (SubLObject)module0383.NIL, var6 = module0032.f1742(var5, var4); module0383.NIL == module0032.f1744(var5, var6); var6 = module0032.f1743(var6)) {
            var7 = module0032.f1745(var5, var6);
            if (module0383.NIL != module0032.f1746(var6, var7) && module0383.NIL != module0364.f24748(var7, (SubLObject)module0383.$ic0$)) {
                var8 = module0364.f24754(var7);
                if (module0383.NIL != module0364.f24786(var3, var8)) {
                    return var7;
                }
            }
        }
        return f27229(var2, var3);
    }
    
    public static SubLObject f27229(final SubLObject var2, final SubLObject var3) {
        final SubLObject var4 = module0364.f24729((SubLObject)module0383.$ic0$, var2);
        module0364.f24783(var3, var4);
        module0373.f26334(var4);
        return var4;
    }
    
    public static SubLObject f27230(final SubLObject var10) {
        final SubLObject var11 = f27231(var10);
        if (module0383.NIL != module0365.f24845(var11)) {
            module0365.f24861(var11);
        }
        return var10;
    }
    
    public static SubLObject f27232(final SubLObject var10) {
        return module0364.f24757(var10);
    }
    
    public static SubLObject f27233(final SubLObject var10) {
        final SubLObject var11 = f27231(var10);
        if (module0383.NIL == var11 && module0383.NIL == module0363.f24685(module0364.f24725(var10))) {
            return Errors.error((SubLObject)module0383.$ic1$, var10);
        }
        return var11;
    }
    
    public static SubLObject f27231(final SubLObject var10) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var12 = module0364.f24725(var10);
        final SubLObject var13 = module0364.f24754(var10);
        final SubLObject var14 = module0364.f24737(var13);
        final SubLObject var15 = module0364.f24736(var13);
        final SubLObject var16 = module0363.f24509(var15);
        SubLObject var17 = module0363.f24517(var12);
        SubLObject var18 = (SubLObject)module0383.NIL;
        var18 = var17.first();
        while (module0383.NIL != var17) {
            if (module0383.NIL != module0363.f24522(var18, module0383.$g3223$.getDynamicValue(var11))) {
                final SubLObject var19 = f27234(var18, (SubLObject)module0383.NIL);
                if (module0383.NIL != var19 && var16.equal(module0363.f24509(module0364.f24736(var19))) && var14.equal(module0364.f24737(var19))) {
                    return var18;
                }
            }
            var17 = var17.rest();
            var18 = var17.first();
        }
        return (SubLObject)module0383.NIL;
    }
    
    public static SubLObject f27235(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0383.NIL != module0365.f24819(var1) && module0383.$g3223$.getDynamicValue(var2).eql(module0365.f24865(var1)));
    }
    
    public static SubLObject f27236(final SubLObject var19, final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        final SubLObject var22 = module0365.f24854(var19, module0383.$g3223$.getDynamicValue(var21), var20);
        final SubLObject var23 = module0363.f24507(var19);
        final SubLObject var24 = module0361.f24123(var23);
        if (module0383.NIL == module0065.f4772(var24, (SubLObject)module0383.$ic2$)) {
            final SubLObject var24_25 = var24;
            if (module0383.NIL == module0065.f4775(var24_25, (SubLObject)module0383.$ic2$)) {
                final SubLObject var25 = module0065.f4740(var24_25);
                final SubLObject var26 = (SubLObject)module0383.NIL;
                SubLObject var27;
                SubLObject var28;
                SubLObject var29;
                SubLObject var30;
                SubLObject var31;
                SubLObject var32;
                SubLObject var33;
                SubLObject var34;
                SubLObject var35;
                for (var27 = Sequences.length(var25), var28 = (SubLObject)module0383.NIL, var28 = (SubLObject)module0383.ZERO_INTEGER; var28.numL(var27); var28 = Numbers.add(var28, (SubLObject)module0383.ONE_INTEGER)) {
                    var29 = ((module0383.NIL != var26) ? Numbers.subtract(var27, var28, (SubLObject)module0383.ONE_INTEGER) : var28);
                    var30 = Vectors.aref(var25, var29);
                    if (module0383.NIL == module0065.f4749(var30) || module0383.NIL == module0065.f4773((SubLObject)module0383.$ic2$)) {
                        if (module0383.NIL != module0065.f4749(var30)) {
                            var30 = (SubLObject)module0383.$ic2$;
                        }
                        if (module0383.NIL != module0363.f24547(var19, var30)) {
                            var31 = var30;
                            var32 = module0077.f5333(module0369.f25473(var31));
                            for (var33 = module0032.f1741(var32), var34 = (SubLObject)module0383.NIL, var34 = module0032.f1742(var33, var32); module0383.NIL == module0032.f1744(var33, var34); var34 = module0032.f1743(var34)) {
                                var35 = module0032.f1745(var33, var34);
                                if (module0383.NIL != module0032.f1746(var34, var35)) {
                                    module0387.f27563(var35, var22);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject var34_35 = var24;
            if (module0383.NIL == module0065.f4777(var34_35)) {
                final SubLObject var36 = module0065.f4738(var34_35);
                SubLObject var37 = (SubLObject)module0383.NIL;
                SubLObject var38 = (SubLObject)module0383.NIL;
                final Iterator var39 = Hashtables.getEntrySetIterator(var36);
                try {
                    while (Hashtables.iteratorHasNext(var39)) {
                        final Map.Entry var40 = Hashtables.iteratorNextEntry(var39);
                        var37 = Hashtables.getEntryKey(var40);
                        var38 = Hashtables.getEntryValue(var40);
                        if (module0383.NIL != module0363.f24547(var19, var38)) {
                            final SubLObject var41 = var38;
                            final SubLObject var42 = module0077.f5333(module0369.f25473(var41));
                            SubLObject var43;
                            SubLObject var44;
                            SubLObject var45;
                            for (var43 = module0032.f1741(var42), var44 = (SubLObject)module0383.NIL, var44 = module0032.f1742(var43, var42); module0383.NIL == module0032.f1744(var43, var44); var44 = module0032.f1743(var44)) {
                                var45 = module0032.f1745(var43, var44);
                                if (module0383.NIL != module0032.f1746(var44, var45)) {
                                    module0387.f27563(var45, var22);
                                }
                            }
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var39);
                }
            }
        }
        return var22;
    }
    
    public static SubLObject f27237(final SubLObject var18) {
        return module0365.f24871(var18);
    }
    
    public static SubLObject f27238(final SubLObject var18) {
        final SubLObject var19 = f27239(var18);
        if (module0383.NIL == module0364.f24699(var19)) {
            return Errors.error((SubLObject)module0383.$ic3$, var18);
        }
        return var19;
    }
    
    public static SubLObject f27239(final SubLObject var18) {
        final SubLObject var19 = module0365.f24850(var18);
        final SubLObject var20 = f27234(var18, (SubLObject)module0383.NIL);
        if (module0383.NIL != var20) {
            final SubLObject var21 = module0364.f24736(var20);
            final SubLObject var22 = module0363.f24530(var21);
            SubLObject var23;
            SubLObject var24;
            SubLObject var25;
            for (var23 = module0032.f1741(var22), var24 = (SubLObject)module0383.NIL, var24 = module0032.f1742(var23, var22); module0383.NIL == module0032.f1744(var23, var24); var24 = module0032.f1743(var24)) {
                var25 = module0032.f1745(var23, var24);
                if (module0383.NIL != module0032.f1746(var24, var25) && module0383.NIL != module0364.f24748(var25, (SubLObject)module0383.$ic0$) && var19.eql(module0364.f24725(var25))) {
                    return var25;
                }
            }
        }
        return (SubLObject)module0383.NIL;
    }
    
    public static SubLObject f27234(final SubLObject var11, final SubLObject var40) {
        final SubLObject var41 = f27237(var11);
        final SubLObject var42 = module0365.f24850(var11);
        return f27240(var42, var41, var40);
    }
    
    public static SubLObject f27240(final SubLObject var2, final SubLObject var20, final SubLObject var40) {
        final SubLObject var41 = module0363.f24509(var2);
        final SubLObject var42 = ConsesLow.nth(var20, var41);
        return f27241(var2, var42, var40);
    }
    
    public static SubLObject f27241(final SubLObject var39, final SubLObject var42, final SubLObject var40) {
        final SubLThread var43 = SubLProcess.currentSubLThread();
        var43.resetMultipleValues();
        final SubLObject var44 = module0370.f25838((SubLObject)ConsesLow.list(var42));
        final SubLObject var45 = var43.secondMultipleValue();
        var43.resetMultipleValues();
        final SubLObject var46 = module0363.f24581(var44);
        final SubLObject var47 = module0363.f24527(var39);
        SubLObject var48;
        SubLObject var49;
        SubLObject var50;
        SubLObject var51;
        SubLObject var52;
        SubLObject var53;
        for (var48 = module0032.f1741(var47), var49 = (SubLObject)module0383.NIL, var49 = module0032.f1742(var48, var47); module0383.NIL == module0032.f1744(var48, var49); var49 = module0032.f1743(var49)) {
            var50 = module0032.f1745(var48, var49);
            if (module0383.NIL != module0032.f1746(var49, var50) && module0383.NIL != module0364.f24748(var50, (SubLObject)module0383.$ic0$)) {
                var51 = f27232(var50);
                var52 = module0363.f24509(var51);
                var53 = module0363.f24581(var52);
                if (var53.equal(var46) && (module0383.NIL == var40 || module0383.NIL != module0373.f26500(var51))) {
                    return module0364.f24804(var51, var45);
                }
            }
        }
        return (SubLObject)module0383.NIL;
    }
    
    public static SubLObject f27242(final SubLObject var11) {
        final SubLObject var12 = f27237(var11);
        final SubLObject var13 = module0365.f24850(var11);
        return f27243(var13, var12);
    }
    
    public static SubLObject f27243(final SubLObject var2, final SubLObject var20) {
        final SubLObject var21 = module0363.f24507(var2);
        final SubLObject var22 = module0363.f24509(var2);
        final SubLObject var23 = ConsesLow.nth(var20, var22);
        return module0373.f26437(var21, var23);
    }
    
    public static SubLObject f27244(final SubLObject var19, final SubLObject var50) {
        SubLObject var51 = (SubLObject)module0383.NIL;
        SubLObject var52 = (SubLObject)module0383.NIL;
        SubLObject var53 = (SubLObject)module0383.NIL;
        var51 = var50;
        var52 = var51.first();
        for (var53 = (SubLObject)module0383.ZERO_INTEGER; module0383.NIL != var51; var51 = var51.rest(), var52 = var51.first(), var53 = Numbers.add((SubLObject)module0383.ONE_INTEGER, var53)) {
            final SubLObject var54 = f27243(var19, var53);
            f27228(var19, var54);
            f27236(var19, var53);
        }
        return var19;
    }
    
    public static SubLObject f27245(final SubLObject var11, final SubLObject var20, final SubLObject var33) {
        final SubLThread var34 = SubLProcess.currentSubLThread();
        final SubLObject var35 = module0365.f24850(var11);
        if (module0383.NIL == module0358.f23680(module0365.f24868(var11))) {
            var34.resetMultipleValues();
            final SubLObject var36 = f27246(var35, var20, (SubLObject)module0383.$ic4$);
            final SubLObject var37 = var34.secondMultipleValue();
            var34.resetMultipleValues();
            module0365.f24873(var11, var36, var37);
        }
        var34.resetMultipleValues();
        final SubLObject var38 = f27246(var35, var20, var33);
        final SubLObject var39 = var34.secondMultipleValue();
        var34.resetMultipleValues();
        module0367.f25205(var11, var33, var38, var39);
        final SubLObject var40 = f27247(var35, var20, var33);
        module0367.f25206(var11, var33, var40);
        return var11;
    }
    
    public static SubLObject f27247(final SubLObject var2, final SubLObject var20, final SubLObject var33) {
        final SubLObject var34 = f27240(var2, var20, (SubLObject)module0383.NIL);
        final SubLObject var35 = module0364.f24736(var34);
        final SubLObject var36 = module0385.f27404(var35, var33);
        return var36;
    }
    
    public static SubLObject f27246(final SubLObject var2, final SubLObject var20, final SubLObject var58) {
        return Values.values(module0383.$g3224$.getGlobalValue(), module0383.$g3225$.getGlobalValue());
    }
    
    public static SubLObject f27248(final SubLObject var18) {
        final SubLObject var19 = f27234(var18, (SubLObject)module0383.NIL);
        return module0364.f24736(var19);
    }
    
    public static SubLObject f27249(final SubLObject var11) {
        f27250(var11);
        final SubLObject var12 = f27238(var11);
        module0373.f26341(var12);
        return var11;
    }
    
    public static SubLObject f27250(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        assert module0383.NIL != f27235(var11) : var11;
        final SubLObject var13 = f27234(var11, (SubLObject)module0383.T);
        if (module0383.NIL == var13 && module0383.NIL == module0365.f24886(var11) && module0383.NIL != module0361.$g3113$.getDynamicValue(var12)) {
            final SubLObject var14 = module0365.f24850(var11);
            SubLObject var15 = (SubLObject)module0383.NIL;
            final SubLObject var16 = f27234(var11, (SubLObject)module0383.NIL);
            final SubLObject var17 = module0363.f24527(var14);
            SubLObject var18;
            SubLObject var19;
            SubLObject var20;
            SubLObject var21;
            for (var18 = module0032.f1741(var17), var19 = (SubLObject)module0383.NIL, var19 = module0032.f1742(var18, var17); module0383.NIL == var15 && module0383.NIL == module0032.f1744(var18, var19); var19 = module0032.f1743(var19)) {
                var20 = module0032.f1745(var18, var19);
                if (module0383.NIL != module0032.f1746(var19, var20) && module0383.NIL != module0364.f24748(var20, (SubLObject)module0383.$ic0$)) {
                    var21 = module0364.f24754(var20);
                    if (module0383.NIL != module0364.f24786(var21, var16)) {
                        var15 = var20;
                    }
                }
            }
            if (module0383.NIL != var15) {
                module0364.f24731(var15);
            }
            final SubLObject var59_62 = f27242(var11);
            final SubLObject var22 = f27229(var14, var59_62);
            f27233(var22);
            return var22;
        }
        return (SubLObject)module0383.NIL;
    }
    
    public static SubLObject f27251(final SubLObject var10, final SubLObject var64, SubLObject var65) {
        final SubLObject var66 = (SubLObject)ConsesLow.list(var64);
        var65 = module0373.f26258(var65);
        return module0373.f26221(var10, var65, var66);
    }
    
    public static SubLObject f27252(final SubLObject var67, final SubLObject var14, final SubLObject var10) {
        final SubLThread var68 = SubLProcess.currentSubLThread();
        final SubLObject var69 = module0366.f24934(var67);
        final SubLObject var70 = module0233.f15382(var14, var69);
        var68.resetMultipleValues();
        final SubLObject var71 = f27251(var10, var67, var70);
        final SubLObject var72 = var68.secondMultipleValue();
        var68.resetMultipleValues();
        if (module0383.NIL != var72) {
            module0373.f26265(var71);
        }
        else {
            module0373.f26245(var67);
        }
        return (SubLObject)module0383.NIL;
    }
    
    public static SubLObject f27253(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0383.NIL != module0364.f24699(var1) && module0383.$ic7$ == module0364.f24721(var1));
    }
    
    public static SubLObject f27254(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0383.NIL != module0365.f24819(var1) && module0383.$g3226$.getDynamicValue(var2).eql(module0365.f24865(var1)));
    }
    
    public static SubLObject f27255() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0383", "f27227", "S#27818", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0383", "f27228", "S#30339", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0383", "f27229", "S#30340", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0383", "f27230", "S#27594", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0383", "f27232", "S#29316", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0383", "f27233", "S#28945", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0383", "f27231", "S#30341", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0383", "f27235", "S#27350", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0383", "f27236", "S#30342", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0383", "f27237", "S#29197", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0383", "f27238", "S#29232", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0383", "f27239", "S#30343", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0383", "f27234", "S#28938", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0383", "f27240", "S#30344", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0383", "f27241", "S#30345", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0383", "f27242", "S#30346", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0383", "f27243", "S#30347", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0383", "f27244", "S#29181", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0383", "f27245", "S#29198", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0383", "f27247", "S#30348", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0383", "f27246", "S#30349", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0383", "f27248", "S#29235", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0383", "f27249", "S#29219", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0383", "f27250", "S#30350", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0383", "f27251", "S#30351", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0383", "f27252", "S#29267", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0383", "f27253", "S#29229", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0383", "f27254", "S#29230", 1, 0, false);
        return (SubLObject)module0383.NIL;
    }
    
    public static SubLObject f27256() {
        module0383.$g3223$ = SubLFiles.defparameter("S#30352", module0340.f22997((SubLObject)module0383.$ic0$, (SubLObject)module0383.UNPROVIDED));
        module0383.$g3224$ = SubLFiles.deflexical("S#30353", (SubLObject)module0383.$ic5$);
        module0383.$g3225$ = SubLFiles.deflexical("S#30354", (SubLObject)module0383.$ic5$);
        module0383.$g3226$ = SubLFiles.defparameter("S#30355", module0340.f22997((SubLObject)module0383.$ic7$, (SubLObject)module0383.UNPROVIDED));
        return (SubLObject)module0383.NIL;
    }
    
    public static SubLObject f27257() {
        return (SubLObject)module0383.NIL;
    }
    
    public void declareFunctions() {
        f27255();
    }
    
    public void initializeVariables() {
        f27256();
    }
    
    public void runTopLevelForms() {
        f27257();
    }
    
    static {
        me = (SubLFile)new module0383();
        module0383.$g3223$ = null;
        module0383.$g3224$ = null;
        module0383.$g3225$ = null;
        module0383.$g3226$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("UNION");
        $ic1$ = SubLObjectFactory.makeString("couldn't find the union tactic for ~s");
        $ic2$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic3$ = SubLObjectFactory.makeString("Could not find the link for ~a");
        $ic4$ = SubLObjectFactory.makeKeyword("TACTICAL");
        $ic5$ = SubLObjectFactory.makeKeyword("PREFERRED");
        $ic6$ = SubLObjectFactory.makeSymbol("S#27350", "CYC");
        $ic7$ = SubLObjectFactory.makeKeyword("DISJUNCTIVE-ASSUMPTION");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0383.class
	Total time: 169 ms
	
	Decompiled with Procyon 0.5.32.
*/