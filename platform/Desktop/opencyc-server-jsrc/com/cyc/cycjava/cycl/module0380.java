package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0380 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0380";
    public static final String myFingerPrint = "d1fa8c276c549a3bf4438d8b9fae8d8349098c8e9bb90cb2db30777d59302b74";
    private static SubLSymbol $g3208$;
    public static SubLSymbol $g3209$;
    public static SubLSymbol $g3210$;
    public static SubLSymbol $g3211$;
    private static SubLSymbol $g3212$;
    public static SubLSymbol $g3213$;
    public static SubLSymbol $g3214$;
    private static SubLSymbol $g3215$;
    private static SubLSymbol $g3216$;
    private static SubLSymbol $g3217$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLString $ic7$;
    private static final SubLString $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLString $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLString $ic12$;
    private static final SubLString $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLString $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLString $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLString $ic25$;
    private static final SubLList $ic26$;
    private static final SubLList $ic27$;
    private static final SubLList $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLString $ic36$;
    private static final SubLList $ic37$;
    
    public static SubLObject f26955(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0364.f24699(var1) && $ic0$ == module0364.f24721(var1));
    }
    
    public static SubLObject f26956(final SubLObject var2, final SubLObject var3) {
        SubLObject var4 = f26957(var2);
        if (NIL == var4) {
            final SubLObject var5 = module0363.f24507(var2);
            final SubLObject var6 = f26958(var5, var3);
            var4 = f26959(var2, var6);
        }
        return var4;
    }
    
    public static SubLObject f26959(final SubLObject var2, final SubLObject var6) {
        final SubLObject var7 = module0364.f24729((SubLObject)$ic0$, var2);
        SubLObject var8 = var6;
        SubLObject var9 = (SubLObject)NIL;
        var9 = var8.first();
        while (NIL != var8) {
            module0364.f24783(var9, var7);
            var8 = var8.rest();
            var9 = var8.first();
        }
        module0373.f26334(var7);
        return var7;
    }
    
    public static SubLObject f26960(final SubLObject var4) {
        SubLObject var5 = f26961(var4);
        SubLObject var6 = (SubLObject)NIL;
        var6 = var5.first();
        while (NIL != var5) {
            if (NIL != module0365.f24845(var6)) {
                module0365.f24861(var6);
            }
            var5 = var5.rest();
            var6 = var5.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26962(final SubLObject var10, final SubLObject var11) {
        SubLObject var13;
        final SubLObject var12 = var13 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic1$);
        final SubLObject var14 = var13.rest();
        var13 = var13.first();
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var17 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic1$);
        var15 = var13.first();
        var13 = var13.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic1$);
        var16 = var13.first();
        var13 = var13.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic1$);
        var17 = var13.first();
        var13 = var13.rest();
        if (NIL == var13) {
            final SubLObject var18;
            var13 = (var18 = var14);
            final SubLObject var19 = (SubLObject)$ic2$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var19, var17)), (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list(var15, var16, var19), (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)ConsesLow.list((SubLObject)$ic6$, var19, var16), ConsesLow.append(var18, (SubLObject)NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic1$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26963(final SubLObject var4, final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var9) && NIL == module0004.f104(var8, module0364.f24735(var4), Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED)) {
            Errors.error((SubLObject)$ic7$, var8, var4);
        }
        final SubLObject var10 = module0364.f24725(var4);
        SubLObject var11 = module0363.f24517(var10);
        SubLObject var12 = (SubLObject)NIL;
        var12 = var11.first();
        while (NIL != var11) {
            if (NIL != module0363.f24522(var12, $g3208$.getDynamicValue(var9))) {
                final SubLObject var13 = f26964(var12);
                if (var13.eql(var8)) {
                    return var12;
                }
            }
            var11 = var11.rest();
            var12 = var11.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26965(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = f26961(var4);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var5) && NIL == var6) {
            Errors.error((SubLObject)$ic8$, var4);
        }
        return var6;
    }
    
    public static SubLObject f26961(final SubLObject var4) {
        SubLObject var5 = (SubLObject)NIL;
        final SubLObject var6 = module0364.f24725(var4);
        SubLObject var7 = module0363.f24517(var6);
        SubLObject var8 = (SubLObject)NIL;
        var8 = var7.first();
        while (NIL != var7) {
            if (NIL != f26966(var8)) {
                var5 = (SubLObject)ConsesLow.cons(var8, var5);
            }
            var7 = var7.rest();
            var8 = var7.first();
        }
        return Sequences.nreverse(var5);
    }
    
    public static SubLObject f26967(final SubLObject var4) {
        SubLObject var5 = (SubLObject)ZERO_INTEGER;
        SubLObject var6 = module0364.f24735(var4);
        SubLObject var7 = (SubLObject)NIL;
        var7 = var6.first();
        while (NIL != var6) {
            if (NIL != module0339.f22743((SubLObject)NIL, var4, var7)) {
                if (NIL != module0364.f24761(var4, var5)) {
                    module0364.f24779(var4, var5);
                    module0373.f26370(var7, var4);
                }
                var5 = Numbers.add(var5, (SubLObject)ONE_INTEGER);
            }
            var6 = var6.rest();
            var7 = var6.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26958(final SubLObject var5, final SubLObject var3) {
        final SubLObject var6 = f26968(var3);
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = var6;
        SubLObject var9 = (SubLObject)NIL;
        var9 = var8.first();
        while (NIL != var8) {
            final SubLObject var10 = module0373.f26435(var5, var9, (SubLObject)UNPROVIDED);
            var7 = (SubLObject)ConsesLow.cons(var10, var7);
            var8 = var8.rest();
            var9 = var8.first();
        }
        return Sequences.nreverse(var7);
    }
    
    public static SubLObject f26969(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != module0365.f24819(var1) && $g3208$.getDynamicValue(var2).eql(module0365.f24865(var1)));
    }
    
    public static SubLObject f26970(final SubLObject var2, final SubLObject var23) {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        final SubLObject var25 = module0365.f24854(var2, $g3208$.getDynamicValue(var24), var23);
        final SubLObject var26 = module0363.f24507(var2);
        final SubLObject var27 = module0361.f24123(var26);
        if (NIL == module0065.f4772(var27, (SubLObject)$ic9$)) {
            final SubLObject var30_31 = var27;
            if (NIL == module0065.f4775(var30_31, (SubLObject)$ic9$)) {
                final SubLObject var28 = module0065.f4740(var30_31);
                final SubLObject var29 = (SubLObject)NIL;
                SubLObject var30;
                SubLObject var31;
                SubLObject var32;
                SubLObject var33;
                SubLObject var34;
                SubLObject var35;
                SubLObject var36;
                SubLObject var37;
                SubLObject var38;
                for (var30 = Sequences.length(var28), var31 = (SubLObject)NIL, var31 = (SubLObject)ZERO_INTEGER; var31.numL(var30); var31 = Numbers.add(var31, (SubLObject)ONE_INTEGER)) {
                    var32 = ((NIL != var29) ? Numbers.subtract(var30, var31, (SubLObject)ONE_INTEGER) : var31);
                    var33 = Vectors.aref(var28, var32);
                    if (NIL == module0065.f4749(var33) || NIL == module0065.f4773((SubLObject)$ic9$)) {
                        if (NIL != module0065.f4749(var33)) {
                            var33 = (SubLObject)$ic9$;
                        }
                        if (NIL != module0363.f24547(var2, var33)) {
                            var34 = var33;
                            var35 = module0077.f5333(inference_datastructures_inference_oc.f25473(var34));
                            for (var36 = module0032.f1741(var35), var37 = (SubLObject)NIL, var37 = module0032.f1742(var36, var35); NIL == module0032.f1744(var36, var37); var37 = module0032.f1743(var37)) {
                                var38 = module0032.f1745(var36, var37);
                                if (NIL != module0032.f1746(var37, var38)) {
                                    module0387.f27563(var38, var25);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject var43_44 = var27;
            if (NIL == module0065.f4777(var43_44)) {
                final SubLObject var39 = module0065.f4738(var43_44);
                SubLObject var40 = (SubLObject)NIL;
                SubLObject var41 = (SubLObject)NIL;
                final Iterator var42 = Hashtables.getEntrySetIterator(var39);
                try {
                    while (Hashtables.iteratorHasNext(var42)) {
                        final Map.Entry var43 = Hashtables.iteratorNextEntry(var42);
                        var40 = Hashtables.getEntryKey(var43);
                        var41 = Hashtables.getEntryValue(var43);
                        if (NIL != module0363.f24547(var2, var41)) {
                            final SubLObject var44 = var41;
                            final SubLObject var45 = module0077.f5333(inference_datastructures_inference_oc.f25473(var44));
                            SubLObject var46;
                            SubLObject var47;
                            SubLObject var48;
                            for (var46 = module0032.f1741(var45), var47 = (SubLObject)NIL, var47 = module0032.f1742(var46, var45); NIL == module0032.f1744(var46, var47); var47 = module0032.f1743(var47)) {
                                var48 = module0032.f1745(var46, var47);
                                if (NIL != module0032.f1746(var47, var48)) {
                                    module0387.f27563(var48, var25);
                                }
                            }
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var42);
                }
            }
        }
        return var25;
    }
    
    public static SubLObject f26971(final SubLObject var9) {
        return module0365.f24871(var9);
    }
    
    public static SubLObject f26972(final SubLObject var48) {
        final SubLObject var49 = module0365.f24850(var48);
        final SubLObject var50 = f26973(var49);
        if (NIL != var50) {
            return var50;
        }
        return Errors.error((SubLObject)$ic10$, var48);
    }
    
    public static SubLObject f26964(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        assert NIL != f26969(var9) : var9;
        final SubLObject var11 = f26971(var9);
        final SubLObject var12 = f26972(var9);
        final SubLObject var13 = module0364.f24809(var12, var11);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var10) && NIL == var13) {
            Errors.error((SubLObject)$ic12$, var9);
        }
        return Values.values(var13, var12);
    }
    
    public static SubLObject f26974(final SubLObject var9) {
        return module0364.f24736(f26964(var9));
    }
    
    public static SubLObject f26975(final SubLObject var9) {
        if (NIL == module0361.f24164(module0365.f24879(var9))) {
            final SubLObject var10 = module0365.f24850(var9);
            return module0373.f26208(var10, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)$ic0$, var9, (SubLObject)NIL);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26976(final SubLObject var2, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = f26956(var2, var3);
        final SubLObject var6 = module0364.f24752(var5);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var4) && !var6.numG((SubLObject)ONE_INTEGER)) {
            Errors.error((SubLObject)$ic13$, var5);
        }
        module0373.f26120(var2, (SubLObject)NIL, (SubLObject)$ic14$, (SubLObject)T);
        if (NIL == module0373.f26327(var2, (SubLObject)$ic14$)) {
            SubLObject var7 = (SubLObject)ZERO_INTEGER;
            final SubLObject var8 = var5;
            SubLObject var9 = module0364.f24735(var8);
            SubLObject var10 = (SubLObject)NIL;
            var10 = var9.first();
            while (NIL != var9) {
                if (NIL != module0339.f22743((SubLObject)NIL, var8, var10)) {
                    f26970(var2, var7);
                    var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                }
                var9 = var9.rest();
                var10 = var9.first();
            }
        }
        return var2;
    }
    
    public static SubLObject f26977(final SubLObject var9, final SubLObject var52, final SubLObject var42) {
        final SubLThread var53 = SubLProcess.currentSubLThread();
        final SubLObject var54 = module0365.f24850(var9);
        if (NIL == module0358.f23680(module0365.f24868(var9))) {
            var53.resetMultipleValues();
            final SubLObject var55 = f26978(var54, var52, (SubLObject)$ic14$);
            final SubLObject var56 = var53.secondMultipleValue();
            var53.resetMultipleValues();
            module0365.f24873(var9, var55, var56);
        }
        var53.resetMultipleValues();
        final SubLObject var57 = f26978(var54, var52, var42);
        final SubLObject var56 = var53.secondMultipleValue();
        var53.resetMultipleValues();
        module0367.f25205(var9, var42, var57, var56);
        final SubLObject var58 = f26979(var54, var52, var42);
        module0367.f25206(var9, var42, var58);
        return var9;
    }
    
    public static SubLObject f26979(final SubLObject var2, final SubLObject var52, final SubLObject var42) {
        return module0385.f27404(var52, var42);
    }
    
    public static SubLObject f26978(final SubLObject var2, final SubLObject var52, final SubLObject var57) {
        final SubLThread var58 = SubLProcess.currentSubLThread();
        var58.resetMultipleValues();
        SubLObject var59 = module0388.f27577(var52, var57, (SubLObject)NIL);
        SubLObject var60 = var58.secondMultipleValue();
        var58.resetMultipleValues();
        if (NIL == module0358.f23683(var59)) {
            var59 = $g3209$.getGlobalValue();
            var60 = $g3210$.getGlobalValue();
        }
        return Values.values(var59, var60);
    }
    
    public static SubLObject f26980(final SubLObject var9) {
        final SubLObject var10 = f26972(var9);
        final SubLObject var11 = f26971(var9);
        module0373.f26342(var10, var11);
        return var9;
    }
    
    public static SubLObject f26973(final SubLObject var49) {
        return module0363.f24595(var49, (SubLObject)$ic0$);
    }
    
    public static SubLObject f26957(final SubLObject var49) {
        return module0363.f24594(var49, (SubLObject)$ic0$);
    }
    
    public static SubLObject f26981(final SubLObject var49) {
        return module0035.sublisp_boolean(f26957(var49));
    }
    
    public static SubLObject f26982(final SubLObject var48) {
        final SubLObject var49 = f26964(var48);
        return module0364.f24736(var49);
    }
    
    public static SubLObject f26983(final SubLObject var4) {
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = module0364.f24735(var4);
        SubLObject var7 = (SubLObject)NIL;
        var7 = var6.first();
        while (NIL != var6) {
            if (NIL != module0339.f22743((SubLObject)NIL, var4, var7)) {
                final SubLObject var8 = module0364.f24736(var7);
                final SubLObject var9 = module0364.f24737(var7);
                if (NIL != module0363.f24555(var8)) {
                    var5 = (SubLObject)ConsesLow.cons(var8, var5);
                }
            }
            var6 = var6.rest();
            var7 = var6.first();
        }
        return Sequences.nreverse(var5);
    }
    
    public static SubLObject f26984(final SubLObject var50, final SubLObject var62) {
        return module0381.f27097(var50, var62);
    }
    
    public static SubLObject f26985(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0366.f24916(var1) && $ic0$ == module0366.f24989(var1));
    }
    
    public static SubLObject f26986(final SubLObject var63, final SubLObject var64, final SubLObject var4) {
        final SubLThread var65 = SubLProcess.currentSubLThread();
        SubLObject var66 = (SubLObject)NIL;
        SubLObject var67 = (SubLObject)NIL;
        final SubLObject var68 = module0366.f24956(var63);
        SubLObject var69 = module0364.f24735(var4);
        SubLObject var70 = (SubLObject)NIL;
        var70 = var69.first();
        while (NIL != var69) {
            if (NIL != module0339.f22743((SubLObject)NIL, var4, var70)) {
                final SubLObject var71 = module0364.f24736(var70);
                final SubLObject var72 = module0364.f24737(var70);
                if (var71.eql(var68) && NIL != module0233.f15364(var72, var64)) {
                    final SubLObject var73 = module0366.f24934(var63);
                    final SubLObject var74 = module0233.f15382(var64, var73);
                    var67 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons(var63, var74)), var67);
                }
                else {
                    SubLObject var75 = (SubLObject)NIL;
                    final SubLObject var76 = (SubLObject)$ic17$;
                    SubLObject var77;
                    for (var77 = module0066.f4838(module0363.f24537(var71)); NIL == module0066.f4841(var77); var77 = module0066.f4840(var77)) {
                        var65.resetMultipleValues();
                        final SubLObject var78 = module0066.f4839(var77);
                        final SubLObject var79 = var65.secondMultipleValue();
                        var65.resetMultipleValues();
                        SubLObject var7_75 = var79;
                        SubLObject var80 = (SubLObject)NIL;
                        var80 = var7_75.first();
                        while (NIL != var7_75) {
                            if (NIL != module0363.f24538(var80, var76)) {
                                final SubLObject var81 = module0233.f15382(var72, module0366.f24934(var80));
                                var75 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var80, var81), var75);
                            }
                            var7_75 = var7_75.rest();
                            var80 = var7_75.first();
                        }
                    }
                    module0066.f4842(var77);
                    var67 = (SubLObject)ConsesLow.cons(var75, var67);
                }
            }
            var69 = var69.rest();
            var70 = var69.first();
        }
        var67 = Sequences.nreverse(var67);
        final SubLObject var82 = var69 = module0035.f2489(var67, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var83 = (SubLObject)NIL;
        var83 = var69.first();
        while (NIL != var69) {
            var65.resetMultipleValues();
            final SubLObject var84 = f26984(var4, var83);
            final SubLObject var85 = var65.secondMultipleValue();
            var65.resetMultipleValues();
            if (NIL != var85) {
                var66 = (SubLObject)ConsesLow.cons(var84, var66);
            }
            else {
                module0373.f26245(var63);
            }
            var69 = var69.rest();
            var83 = var69.first();
        }
        SubLObject var86;
        var66 = (var86 = Sequences.nreverse(var66));
        SubLObject var87 = (SubLObject)NIL;
        var87 = var86.first();
        while (NIL != var86) {
            module0373.f26265(var87);
            var86 = var86.rest();
            var87 = var86.first();
        }
        return var66;
    }
    
    public static SubLObject f26987(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = module0232.f15306(var3);
        SubLObject var6 = (SubLObject)NIL;
        var6 = var5.first();
        while (NIL != var5) {
            if (NIL != module0202.f12690(var6)) {
                return (SubLObject)NIL;
            }
            var5 = var5.rest();
            var6 = var5.first();
        }
        var5 = module0232.f15308(var3);
        var6 = (SubLObject)NIL;
        var6 = var5.first();
        while (NIL != var5) {
            if (NIL != module0202.f12690(var6)) {
                return (SubLObject)NIL;
            }
            var5 = var5.rest();
            var6 = var5.first();
        }
        var4.resetMultipleValues();
        final SubLObject var7 = f26988(var3);
        final SubLObject var8 = var4.secondMultipleValue();
        var4.resetMultipleValues();
        return (SubLObject)makeBoolean(NIL == var8 && NIL != module0035.f1997(var7));
    }
    
    public static SubLObject f26968(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)NIL;
        if (NIL != module0202.f12690(var3)) {
            SubLObject var6 = (SubLObject)ZERO_INTEGER;
            SubLObject var7 = module0232.f15306(var3);
            SubLObject var8 = (SubLObject)NIL;
            var8 = var7.first();
            while (NIL != var7) {
                final SubLObject var9 = (SubLObject)$ic18$;
                final SubLObject var10 = module0362.f24453(var8, var9);
                var5 = (SubLObject)ConsesLow.cons(var10, var5);
                var6 = Numbers.add(var6, (SubLObject)ONE_INTEGER);
                var7 = var7.rest();
                var8 = var7.first();
            }
            var6 = (SubLObject)ZERO_INTEGER;
            var7 = module0232.f15308(var3);
            var8 = (SubLObject)NIL;
            var8 = var7.first();
            while (NIL != var7) {
                final SubLObject var9 = (SubLObject)$ic19$;
                final SubLObject var10 = module0362.f24453(var8, var9);
                var5 = (SubLObject)ConsesLow.cons(var10, var5);
                var6 = Numbers.add(var6, (SubLObject)ONE_INTEGER);
                var7 = var7.rest();
                var8 = var7.first();
            }
        }
        else {
            final SubLObject var11 = f26989(var3);
            var4.resetMultipleValues();
            final SubLObject var12 = f26990(var11);
            final SubLObject var13 = var4.secondMultipleValue();
            var4.resetMultipleValues();
            SubLObject var14 = var12;
            SubLObject var15 = (SubLObject)NIL;
            var15 = var14.first();
            while (NIL != var14) {
                final SubLObject var16 = f26991(var15);
                var5 = (SubLObject)ConsesLow.cons(var16, var5);
                var14 = var14.rest();
                var15 = var14.first();
            }
            var14 = var13;
            var15 = (SubLObject)NIL;
            var15 = var14.first();
            while (NIL != var14) {
                final SubLObject var16 = f26991(var15);
                var5 = (SubLObject)ConsesLow.cons(var16, var5);
                var14 = var14.rest();
                var15 = var14.first();
            }
        }
        return module0035.f2269(var5, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f26988(final SubLObject var88) {
        final SubLObject var89 = module0035.f2399(var88, (SubLObject)$ic20$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var90 = module0204.f13079(var88);
        return module0100.f7254(var89, var90, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f26990(final SubLObject var86) {
        final SubLThread var87 = SubLProcess.currentSubLThread();
        SubLObject var88 = (SubLObject)NIL;
        SubLObject var89 = var86;
        SubLObject var90 = (SubLObject)NIL;
        var90 = var89.first();
        while (NIL != var89) {
            if (NIL != module0202.f12690(var90)) {
                final SubLObject var91 = f26992(var90);
                var88 = (SubLObject)ConsesLow.cons(var91, var88);
            }
            var89 = var89.rest();
            var90 = var89.first();
        }
        final SubLObject var92 = module0035.f2399(var86, (SubLObject)$ic20$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        var87.resetMultipleValues();
        final SubLObject var93 = module0100.f7254(var92, var86, (SubLObject)UNPROVIDED);
        final SubLObject var94 = var87.secondMultipleValue();
        final SubLObject var95 = var87.thirdMultipleValue();
        var87.resetMultipleValues();
        return Values.values(var93, ConsesLow.nconc(var88, var94));
    }
    
    public static SubLObject f26989(final SubLObject var88) {
        SubLObject var89 = (SubLObject)NIL;
        SubLObject var90 = (SubLObject)ZERO_INTEGER;
        SubLObject var91 = module0232.f15306(var88);
        SubLObject var92 = (SubLObject)NIL;
        var92 = var91.first();
        while (NIL != var91) {
            var89 = (SubLObject)ConsesLow.cons(module0205.f13338(var92), var89);
            var90 = Numbers.add(var90, (SubLObject)ONE_INTEGER);
            var91 = var91.rest();
            var92 = var91.first();
        }
        var90 = (SubLObject)ZERO_INTEGER;
        var91 = module0232.f15308(var88);
        var92 = (SubLObject)NIL;
        var92 = var91.first();
        while (NIL != var91) {
            var89 = (SubLObject)ConsesLow.cons(var92, var89);
            var90 = Numbers.add(var90, (SubLObject)ONE_INTEGER);
            var91 = var91.rest();
            var92 = var91.first();
        }
        return Sequences.nreverse(var89);
    }
    
    public static SubLObject f26993(final SubLObject var92) {
        if (NIL != module0202.f12592(var92)) {
            return Values.values(module0202.f12826(var92), (SubLObject)$ic18$);
        }
        return Values.values(var92, (SubLObject)$ic19$);
    }
    
    public static SubLObject f26992(final SubLObject var92) {
        return (SubLObject)ConsesLow.list((SubLObject)NIL, (SubLObject)ConsesLow.list(var92));
    }
    
    public static SubLObject f26991(final SubLObject var87) {
        SubLObject var88 = (SubLObject)NIL;
        SubLObject var89 = (SubLObject)NIL;
        SubLObject var91;
        final SubLObject var90 = var91 = conses_high.second(var87);
        SubLObject var92 = (SubLObject)NIL;
        var92 = var91.first();
        while (NIL != var91) {
            if (NIL != module0202.f12592(var92)) {
                var88 = (SubLObject)ConsesLow.cons(module0202.f12826(var92), var88);
            }
            else {
                var89 = (SubLObject)ConsesLow.cons(var92, var89);
            }
            var91 = var91.rest();
            var92 = var91.first();
        }
        var88 = Sequences.nreverse(var88);
        var89 = Sequences.nreverse(var89);
        return module0362.f24449(module0232.f15305(var88, var89));
    }
    
    public static SubLObject f26994() {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        return $g3211$.getDynamicValue(var19);
    }
    
    public static SubLObject f26995(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0365.f24819(var1) && $g3212$.getGlobalValue().eql(module0365.f24865(var1)));
    }
    
    public static SubLObject f26966(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f26969(var1) || NIL != f26995(var1));
    }
    
    public static SubLObject f26996(final SubLObject var99) {
        return f26972(var99);
    }
    
    public static SubLObject f26997(final SubLObject var99) {
        return module0365.f24871(var99);
    }
    
    public static SubLObject f26998(final SubLObject var99, final SubLObject var23) {
        final SubLObject var100 = f26997(var99);
        return (SubLObject)makeBoolean(NIL == module0035.f2169(var23, var100));
    }
    
    public static SubLObject f26999(final SubLObject var99) {
        return module0360.f23935(Sequences.length(f26997(var99)));
    }
    
    public static SubLObject f27000(final SubLObject var2, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = f26956(var2, var3);
        final SubLObject var6 = module0364.f24752(var5);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var4) && !var6.numG((SubLObject)ONE_INTEGER)) {
            Errors.error((SubLObject)$ic13$, var5);
        }
        module0373.f26120(var2, (SubLObject)NIL, (SubLObject)$ic14$, (SubLObject)T);
        if (NIL == module0373.f26327(var2, (SubLObject)$ic14$)) {
            f27001(var2);
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27001(final SubLObject var49) {
        final SubLObject var50 = f26973(var49);
        final SubLObject var51 = module0364.f24752(var50);
        final SubLObject var52 = conses_high.copy_list(module0035.f2160(var51, (SubLObject)UNPROVIDED));
        final SubLObject var53 = module0365.f24854(var49, $g3212$.getGlobalValue(), var52);
        module0365.f24896(var53, f27002(var53));
        final SubLObject var54 = module0363.f24507(var49);
        final SubLObject var55 = module0361.f24123(var54);
        if (NIL == module0065.f4772(var55, (SubLObject)$ic9$)) {
            final SubLObject var30_101 = var55;
            if (NIL == module0065.f4775(var30_101, (SubLObject)$ic9$)) {
                final SubLObject var56 = module0065.f4740(var30_101);
                final SubLObject var57 = (SubLObject)NIL;
                SubLObject var58;
                SubLObject var59;
                SubLObject var60;
                SubLObject var61;
                SubLObject var62;
                SubLObject var63;
                SubLObject var64;
                SubLObject var65;
                SubLObject var66;
                for (var58 = Sequences.length(var56), var59 = (SubLObject)NIL, var59 = (SubLObject)ZERO_INTEGER; var59.numL(var58); var59 = Numbers.add(var59, (SubLObject)ONE_INTEGER)) {
                    var60 = ((NIL != var57) ? Numbers.subtract(var58, var59, (SubLObject)ONE_INTEGER) : var59);
                    var61 = Vectors.aref(var56, var60);
                    if (NIL == module0065.f4749(var61) || NIL == module0065.f4773((SubLObject)$ic9$)) {
                        if (NIL != module0065.f4749(var61)) {
                            var61 = (SubLObject)$ic9$;
                        }
                        if (NIL != module0363.f24547(var49, var61)) {
                            var62 = var61;
                            var63 = module0077.f5333(inference_datastructures_inference_oc.f25473(var62));
                            for (var64 = module0032.f1741(var63), var65 = (SubLObject)NIL, var65 = module0032.f1742(var64, var63); NIL == module0032.f1744(var64, var65); var65 = module0032.f1743(var65)) {
                                var66 = module0032.f1745(var64, var65);
                                if (NIL != module0032.f1746(var65, var66)) {
                                    module0387.f27563(var66, var53);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject var43_102 = var55;
            if (NIL == module0065.f4777(var43_102)) {
                final SubLObject var67 = module0065.f4738(var43_102);
                SubLObject var68 = (SubLObject)NIL;
                SubLObject var69 = (SubLObject)NIL;
                final Iterator var70 = Hashtables.getEntrySetIterator(var67);
                try {
                    while (Hashtables.iteratorHasNext(var70)) {
                        final Map.Entry var71 = Hashtables.iteratorNextEntry(var70);
                        var68 = Hashtables.getEntryKey(var71);
                        var69 = Hashtables.getEntryValue(var71);
                        if (NIL != module0363.f24547(var49, var69)) {
                            final SubLObject var72 = var69;
                            final SubLObject var73 = module0077.f5333(inference_datastructures_inference_oc.f25473(var72));
                            SubLObject var74;
                            SubLObject var75;
                            SubLObject var76;
                            for (var74 = module0032.f1741(var73), var75 = (SubLObject)NIL, var75 = module0032.f1742(var74, var73); NIL == module0032.f1744(var74, var75); var75 = module0032.f1743(var75)) {
                                var76 = module0032.f1745(var74, var75);
                                if (NIL != module0032.f1746(var75, var76)) {
                                    module0387.f27563(var76, var53);
                                }
                            }
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var70);
                }
            }
        }
        return var53;
    }
    
    public static SubLObject f27003(final SubLObject var9, final SubLObject var42) {
        if (NIL == module0358.f23680(module0365.f24868(var9))) {
            module0365.f24873(var9, $g3213$.getGlobalValue(), $g3214$.getGlobalValue());
        }
        module0367.f25205(var9, var42, $g3213$.getGlobalValue(), $g3214$.getGlobalValue());
        module0367.f25206(var9, var42, (SubLObject)ZERO_INTEGER);
        return var9;
    }
    
    public static SubLObject f27002(final SubLObject var9) {
        return module0365.f24906((SubLObject)$ic24$, var9, (SubLObject)NIL);
    }
    
    public static SubLObject f27004(final SubLObject var9) {
        if (NIL != f26995(var9)) {
            return f27005(var9);
        }
        return Errors.error((SubLObject)$ic25$, var9);
    }
    
    public static SubLObject f27005(final SubLObject var9) {
        final SubLObject var10 = module0365.f24850(var9);
        final SubLObject var11 = f26997(var9);
        return (SubLObject)makeBoolean(NIL == var11 || NIL != module0373.f26327(var10, (SubLObject)$ic14$));
    }
    
    public static SubLObject f27006() {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        if (NIL != $g3215$.getDynamicValue(var19)) {
            return $g3215$.getDynamicValue(var19);
        }
        if (NIL != $g3216$.getDynamicValue(var19)) {
            return (SubLObject)$ic26$;
        }
        if (NIL != $g3217$.getDynamicValue(var19)) {
            return (SubLObject)$ic27$;
        }
        return (SubLObject)$ic28$;
    }
    
    public static SubLObject f27007(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        final SubLObject var11 = module0365.f24850(var9);
        if (NIL == module0363.f24681(var11)) {
            final SubLObject var12 = f26996(var9);
            SubLObject var13 = (SubLObject)NIL;
            SubLObject var14 = (SubLObject)NIL;
            if (NIL == var14) {
                SubLObject var15 = f27006();
                SubLObject var16 = (SubLObject)NIL;
                var16 = var15.first();
                while (NIL == var14 && NIL != var15) {
                    SubLObject var17 = (SubLObject)ZERO_INTEGER;
                    final SubLObject var18 = var12;
                    SubLObject var19;
                    SubLObject var20;
                    SubLObject var21;
                    SubLObject var22;
                    SubLObject var23;
                    for (var19 = (SubLObject)NIL, var19 = module0364.f24735(var18); NIL == var14 && NIL != var19; var19 = var19.rest()) {
                        var20 = var19.first();
                        if (NIL != module0339.f22743((SubLObject)NIL, var18, var20)) {
                            if (NIL == f26998(var9, var17)) {
                                var21 = module0364.f24736(var20);
                                var10.resetMultipleValues();
                                var22 = f27008(var16, var21);
                                var23 = var10.secondMultipleValue();
                                var10.resetMultipleValues();
                                if (NIL != var22) {
                                    var13 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var17, var21), var13);
                                    if (NIL != var23) {
                                        var14 = (SubLObject)T;
                                    }
                                }
                            }
                            var17 = Numbers.add(var17, (SubLObject)ONE_INTEGER);
                        }
                    }
                    if (NIL != var13) {
                        var14 = (SubLObject)T;
                    }
                    var15 = var15.rest();
                    var16 = var15.first();
                }
            }
            f27009(var9, var11, var13);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27008(final SubLObject var106, final SubLObject var110) {
        if (var106.eql((SubLObject)$ic29$)) {
            return Values.values(module0363.f24681(var110), (SubLObject)T);
        }
        if (var106.eql((SubLObject)$ic30$)) {
            return Values.values(module0363.f24562(var110), (SubLObject)NIL);
        }
        if (var106.eql((SubLObject)$ic31$)) {
            return Values.values(Numbers.numG(module0363.f24600(var110), (SubLObject)ONE_INTEGER), (SubLObject)NIL);
        }
        if (var106.eql((SubLObject)$ic32$)) {
            return Values.values(module0363.f24553(var110), (SubLObject)T);
        }
        if (var106.eql((SubLObject)$ic33$)) {
            return Values.values((SubLObject)makeBoolean(NIL != module0363.f24553(var110) && module0363.f24600(var110).numG((SubLObject)ONE_INTEGER)), (SubLObject)T);
        }
        if (var106.eql((SubLObject)$ic34$)) {
            return Values.values((SubLObject)makeBoolean(NIL != module0363.f24562(var110) && module0363.f24600(var110).numG((SubLObject)ONE_INTEGER)), (SubLObject)NIL);
        }
        if (var106.eql((SubLObject)$ic35$)) {
            return Values.values((SubLObject)T, (SubLObject)NIL);
        }
        return Errors.error((SubLObject)$ic36$, var106);
    }
    
    public static SubLObject f27009(final SubLObject var99, final SubLObject var2, final SubLObject var103) {
        SubLObject var104 = (SubLObject)NIL;
        SubLObject var105 = var103;
        SubLObject var106 = (SubLObject)NIL;
        var106 = var105.first();
        while (NIL != var105) {
            SubLObject var108;
            final SubLObject var107 = var108 = var106;
            SubLObject var109 = (SubLObject)NIL;
            SubLObject var110 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var108, var107, (SubLObject)$ic37$);
            var109 = var108.first();
            var108 = var108.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var108, var107, (SubLObject)$ic37$);
            var110 = var108.first();
            var108 = var108.rest();
            if (NIL == var108) {
                final SubLObject var111 = f27010(var99, var2, var109);
                var104 = (SubLObject)ConsesLow.cons(var111, var104);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var107, (SubLObject)$ic37$);
            }
            var105 = var105.rest();
            var106 = var105.first();
        }
        f27011(var104);
        return var104;
    }
    
    public static SubLObject f27010(final SubLObject var99, final SubLObject var2, final SubLObject var23) {
        f27012(var99, var23);
        return f26970(var2, var23);
    }
    
    public static SubLObject f27012(final SubLObject var9, final SubLObject var23) {
        SubLObject var24 = f26997(var9);
        var24 = Sequences.delete(var23, var24, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0365.f24875(var9, var24);
        return var9;
    }
    
    public static SubLObject f27011(final SubLObject var112) {
        if (NIL != var112) {
            final SubLObject var114;
            final SubLObject var113 = var114 = module0365.f24850(var112.first());
            final SubLObject var115 = module0363.f24507(var114);
            final SubLObject var116 = module0361.f24123(var115);
            if (NIL == module0065.f4772(var116, (SubLObject)$ic9$)) {
                final SubLObject var30_116 = var116;
                if (NIL == module0065.f4775(var30_116, (SubLObject)$ic9$)) {
                    final SubLObject var117 = module0065.f4740(var30_116);
                    final SubLObject var118 = (SubLObject)NIL;
                    SubLObject var119;
                    SubLObject var120;
                    SubLObject var121;
                    SubLObject var122;
                    SubLObject var123;
                    SubLObject var124;
                    SubLObject var125;
                    SubLObject var126;
                    SubLObject var127;
                    for (var119 = Sequences.length(var117), var120 = (SubLObject)NIL, var120 = (SubLObject)ZERO_INTEGER; var120.numL(var119); var120 = Numbers.add(var120, (SubLObject)ONE_INTEGER)) {
                        var121 = ((NIL != var118) ? Numbers.subtract(var119, var120, (SubLObject)ONE_INTEGER) : var120);
                        var122 = Vectors.aref(var117, var121);
                        if (NIL == module0065.f4749(var122) || NIL == module0065.f4773((SubLObject)$ic9$)) {
                            if (NIL != module0065.f4749(var122)) {
                                var122 = (SubLObject)$ic9$;
                            }
                            if (NIL != module0363.f24547(var114, var122)) {
                                var123 = var122;
                                var124 = module0077.f5333(inference_datastructures_inference_oc.f25473(var123));
                                for (var125 = module0032.f1741(var124), var126 = (SubLObject)NIL, var126 = module0032.f1742(var125, var124); NIL == module0032.f1744(var125, var126); var126 = module0032.f1743(var126)) {
                                    var127 = module0032.f1745(var125, var126);
                                    if (NIL != module0032.f1746(var126, var127)) {
                                        module0387.f27561(var127, var112);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject var43_117 = var116;
                if (NIL == module0065.f4777(var43_117)) {
                    final SubLObject var128 = module0065.f4738(var43_117);
                    SubLObject var129 = (SubLObject)NIL;
                    SubLObject var130 = (SubLObject)NIL;
                    final Iterator var131 = Hashtables.getEntrySetIterator(var128);
                    try {
                        while (Hashtables.iteratorHasNext(var131)) {
                            final Map.Entry var132 = Hashtables.iteratorNextEntry(var131);
                            var129 = Hashtables.getEntryKey(var132);
                            var130 = Hashtables.getEntryValue(var132);
                            if (NIL != module0363.f24547(var114, var130)) {
                                final SubLObject var133 = var130;
                                final SubLObject var134 = module0077.f5333(inference_datastructures_inference_oc.f25473(var133));
                                SubLObject var135;
                                SubLObject var136;
                                SubLObject var137;
                                for (var135 = module0032.f1741(var134), var136 = (SubLObject)NIL, var136 = module0032.f1742(var135, var134); NIL == module0032.f1744(var135, var136); var136 = module0032.f1743(var136)) {
                                    var137 = module0032.f1745(var135, var136);
                                    if (NIL != module0032.f1746(var136, var137)) {
                                        module0387.f27561(var137, var112);
                                    }
                                }
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(var131);
                    }
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27013() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f26955", "S#27604", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f26956", "S#29806", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f26959", "S#30114", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f26960", "S#27593", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0380", "f26962", "S#30115");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f26963", "S#29331", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f26965", "S#28942", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f26961", "S#30116", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f26967", "S#29306", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f26958", "S#30117", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f26969", "S#27351", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f26970", "S#30118", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f26971", "S#30119", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f26972", "S#29231", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f26964", "S#30120", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f26974", "S#29194", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f26975", "S#30121", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f26976", "S#29185", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f26977", "S#29195", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f26979", "S#30122", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f26978", "S#30123", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f26980", "S#29221", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f26973", "S#30124", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f26957", "S#30125", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f26981", "S#30126", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f26982", "S#29233", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f26983", "S#29332", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f26984", "S#30127", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f26985", "S#29257", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f26986", "S#29264", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f26987", "S#27364", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f26968", "S#30128", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f26988", "S#30129", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f26990", "S#30130", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f26989", "S#30131", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f26993", "S#30132", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f26992", "S#30133", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f26991", "S#30134", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f26994", "S#29183", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f26995", "S#27714", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f26966", "S#30135", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f26996", "S#30136", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f26997", "S#30137", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f26998", "S#30138", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f26999", "S#30139", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f27000", "S#29184", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f27001", "S#30140", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f27003", "S#29196", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f27002", "S#30141", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f27004", "S#27718", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f27005", "S#30142", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f27006", "S#30143", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f27007", "S#27725", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f27008", "S#30144", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f27009", "S#30145", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f27010", "S#30146", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f27012", "S#30147", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0380", "f27011", "S#30148", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27014() {
        $g3208$ = SubLFiles.defparameter("S#30149", module0340.f22997((SubLObject)$ic0$, (SubLObject)UNPROVIDED));
        $g3209$ = SubLFiles.deflexical("S#30150", (SubLObject)$ic15$);
        $g3210$ = SubLFiles.deflexical("S#30151", (SubLObject)$ic16$);
        $g3211$ = SubLFiles.defparameter("S#30152", (SubLObject)T);
        $g3212$ = SubLFiles.deflexical("S#30153", (NIL != Symbols.boundp((SubLObject)$ic21$)) ? $g3212$.getGlobalValue() : module0340.f23003((SubLObject)$ic22$, (SubLObject)UNPROVIDED));
        $g3213$ = SubLFiles.deflexical("S#30154", (SubLObject)$ic15$);
        $g3214$ = SubLFiles.deflexical("S#30155", (SubLObject)$ic23$);
        $g3215$ = SubLFiles.defparameter("S#30156", (SubLObject)NIL);
        $g3216$ = SubLFiles.defparameter("S#30157", (SubLObject)T);
        $g3217$ = SubLFiles.defparameter("S#30158", (SubLObject)T);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27015() {
        module0003.f57((SubLObject)$ic21$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f27013();
    }
    
    public void initializeVariables() {
        f27014();
    }
    
    public void runTopLevelForms() {
        f27015();
    }
    
    static {
        me = (SubLFile)new module0380();
        $g3208$ = null;
        $g3209$ = null;
        $g3210$ = null;
        $g3211$ = null;
        $g3212$ = null;
        $g3213$ = null;
        $g3214$ = null;
        $g3215$ = null;
        $g3216$ = null;
        $g3217$ = null;
        $ic0$ = makeKeyword("SPLIT");
        $ic1$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#25405", "CYC"), (SubLObject)makeSymbol("S#15216", "CYC"), (SubLObject)makeSymbol("S#30159", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic2$ = makeUninternedSymbol("US#6DAC82A");
        $ic3$ = makeSymbol("CLET");
        $ic4$ = makeSymbol("S#25372", "CYC");
        $ic5$ = makeSymbol("PWHEN");
        $ic6$ = makeSymbol("S#27656", "CYC");
        $ic7$ = makeString("~s is not a supporting mapped problem of ~s.");
        $ic8$ = makeString("couldn't find any split tactics for ~s");
        $ic9$ = makeKeyword("SKIP");
        $ic10$ = makeString("Could not find the link for ~a");
        $ic11$ = makeSymbol("S#27351", "CYC");
        $ic12$ = makeString("Generalized tactic ~a did not indicate a valid supporting mapped problem");
        $ic13$ = makeString("Tried to make a split link with less than two supporting problems: ~a");
        $ic14$ = makeKeyword("TACTICAL");
        $ic15$ = makeKeyword("PREFERRED");
        $ic16$ = makeString("the default for split tactics");
        $ic17$ = makeKeyword("PROVEN");
        $ic18$ = makeKeyword("NEG");
        $ic19$ = makeKeyword("POS");
        $ic20$ = makeSymbol("HL-VARIABLE-P");
        $ic21$ = makeSymbol("S#30153", "CYC");
        $ic22$ = makeKeyword("DETERMINE-NEW-SPLIT-TACTICS");
        $ic23$ = makeString("the default for meta-split tactics");
        $ic24$ = makeKeyword("META-STRUCTURAL");
        $ic25$ = makeString("unexpected meta-structural tactic ~s");
        $ic26$ = ConsesLow.list((SubLObject)makeKeyword("ONE-NO-GOOD"), (SubLObject)makeKeyword("ALL-SINGLE-LITERAL"), (SubLObject)makeKeyword("ALL-THE-REST"));
        $ic27$ = ConsesLow.list((SubLObject)makeKeyword("ONE-NO-GOOD"), (SubLObject)makeKeyword("ONE-CLOSED-PROBLEM-REUSE"), (SubLObject)makeKeyword("ALL-SINGLE-LITERAL-PROBLEM-REUSE"), (SubLObject)makeKeyword("ONE-CLOSED"), (SubLObject)makeKeyword("ALL-THE-REST"));
        $ic28$ = ConsesLow.list((SubLObject)makeKeyword("ONE-NO-GOOD"), (SubLObject)makeKeyword("ONE-CLOSED"), (SubLObject)makeKeyword("ALL-THE-REST"));
        $ic29$ = makeKeyword("ONE-NO-GOOD");
        $ic30$ = makeKeyword("ALL-SINGLE-LITERAL");
        $ic31$ = makeKeyword("ALL-PROBLEM-REUSE");
        $ic32$ = makeKeyword("ONE-CLOSED");
        $ic33$ = makeKeyword("ONE-CLOSED-PROBLEM-REUSE");
        $ic34$ = makeKeyword("ALL-SINGLE-LITERAL-PROBLEM-REUSE");
        $ic35$ = makeKeyword("ALL-THE-REST");
        $ic36$ = makeString("Unknown meta-split criterion ~s");
        $ic37$ = ConsesLow.list((SubLObject)makeSymbol("S#134", "CYC"), (SubLObject)makeSymbol("S#30160", "CYC"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 341 ms
	
	Decompiled with Procyon 0.5.32.
*/