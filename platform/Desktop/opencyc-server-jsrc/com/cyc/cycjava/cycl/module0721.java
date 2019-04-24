package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0721 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0721";
    public static final String myFingerPrint = "25a32c1181bf144f20d83b0ccc81fe98b6e261327117e838e8fee1b92ad267e3";
    public static SubLSymbol $g5688$;
    private static SubLSymbol $g5689$;
    private static SubLSymbol $g5690$;
    private static SubLSymbol $g5691$;
    private static SubLSymbol $g5692$;
    private static SubLSymbol $g5693$;
    public static SubLSymbol $g5694$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLFloat $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLString $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLObject $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLObject $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLList $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLObject $ic28$;
    private static final SubLObject $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLObject $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLList $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLList $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLList $ic44$;
    private static final SubLList $ic45$;
    private static final SubLList $ic46$;
    private static final SubLObject $ic47$;
    private static final SubLObject $ic48$;
    private static final SubLObject $ic49$;
    private static final SubLObject $ic50$;
    private static final SubLObject $ic51$;
    private static final SubLObject $ic52$;
    private static final SubLList $ic53$;
    private static final SubLList $ic54$;
    private static final SubLObject $ic55$;
    private static final SubLObject $ic56$;
    private static final SubLObject $ic57$;
    private static final SubLObject $ic58$;
    private static final SubLList $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLObject $ic62$;
    private static final SubLObject $ic63$;
    private static final SubLObject $ic64$;
    private static final SubLList $ic65$;
    private static final SubLString $ic66$;
    private static final SubLObject $ic67$;
    private static final SubLObject $ic68$;
    private static final SubLObject $ic69$;
    private static final SubLList $ic70$;
    private static final SubLList $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLList $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLObject $ic76$;
    private static final SubLString $ic77$;
    private static final SubLString $ic78$;
    private static final SubLObject $ic79$;
    private static final SubLObject $ic80$;
    private static final SubLObject $ic81$;
    private static final SubLObject $ic82$;
    private static final SubLObject $ic83$;
    private static final SubLObject $ic84$;
    private static final SubLObject $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLString $ic87$;
    private static final SubLObject $ic88$;
    private static final SubLString $ic89$;
    private static final SubLObject $ic90$;
    
    public static SubLObject f44190(final SubLObject var1, final SubLObject var2, final SubLObject var3, SubLObject var4, SubLObject var5) {
        if (var4 == module0721.UNPROVIDED) {
            var4 = (SubLObject)module0721.$ic0$;
        }
        if (var5 == module0721.UNPROVIDED) {
            var5 = (SubLObject)module0721.NIL;
        }
        final SubLThread var6 = SubLProcess.currentSubLThread();
        assert module0721.NIL != module0201.f12546(var1) : var1;
        assert module0721.NIL != Types.listp(var2) : var2;
        assert module0721.NIL != module0161.f10481(var3) : var3;
        assert module0721.NIL != module0035.f2327(var4) : var4;
        var6.resetMultipleValues();
        final SubLObject var7 = f44191(var1, var2, var4, var3, var5);
        final SubLObject var8 = var6.secondMultipleValue();
        var6.resetMultipleValues();
        return f44192(var1, var7, var3);
    }
    
    public static SubLObject f44192(final SubLObject var1, final SubLObject var7, final SubLObject var3) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        final SubLObject var9 = (SubLObject)ConsesLow.list((SubLObject)module0721.$ic5$, (SubLObject)module0721.$ic6$, (SubLObject)module0721.$ic7$, (SubLObject)module0721.$ic8$, (SubLObject)module0721.$ic9$, (SubLObject)module0721.NIL, (SubLObject)module0721.$ic10$, module0721.$g5688$.getDynamicValue(var8));
        return module0434.f30578(var1, var7, var3, var9);
    }
    
    public static SubLObject f44193(final SubLObject var10, final SubLObject var11) {
        final SubLObject var12 = var10.rest();
        final SubLObject var14;
        final SubLObject var13 = var14 = var12;
        return (SubLObject)ConsesLow.listS((SubLObject)module0721.$ic11$, (SubLObject)module0721.$ic12$, ConsesLow.append(var14, (SubLObject)module0721.NIL));
    }
    
    public static SubLObject f44194(final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        SubLObject var17 = (SubLObject)module0721.ZERO_INTEGER;
        SubLObject var18 = (SubLObject)module0721.NIL;
        while (module0721.NIL == var18) {
            final SubLObject var19 = PrintLow.format((SubLObject)module0721.NIL, (SubLObject)module0721.$ic13$, var15, var17);
            final SubLObject var20 = module0201.f12550(var19);
            if (module0721.NIL == module0004.f104(var20, module0721.$g5689$.getDynamicValue(var16), (SubLObject)module0721.UNPROVIDED, (SubLObject)module0721.UNPROVIDED)) {
                var18 = var20;
            }
            var17 = Numbers.add(var17, (SubLObject)module0721.ONE_INTEGER);
        }
        module0721.$g5689$.setDynamicValue((SubLObject)ConsesLow.cons(var18, module0721.$g5689$.getDynamicValue(var16)), var16);
        return var18;
    }
    
    public static SubLObject f44195(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)module0721.NIL;
        final SubLObject var23 = module0205.f13183(var20, (SubLObject)module0721.$ic1$, (SubLObject)module0721.UNPROVIDED, (SubLObject)module0721.UNPROVIDED, (SubLObject)module0721.UNPROVIDED, (SubLObject)module0721.UNPROVIDED);
        if (module0721.NIL == var22) {
            SubLObject var24 = var23;
            SubLObject var25 = (SubLObject)module0721.NIL;
            var25 = var24.first();
            while (module0721.NIL == var22 && module0721.NIL != var24) {
                if (module0721.NIL == var22) {
                    SubLObject var23_25 = module0721.$g5690$.getDynamicValue(var21);
                    SubLObject var20_26 = (SubLObject)module0721.NIL;
                    var20_26 = var23_25.first();
                    while (module0721.NIL == var22 && module0721.NIL != var23_25) {
                        if (module0721.NIL != module0202.f12589(var20_26, module0721.$ic15$) && module0721.NIL != module0205.f13220(var25, var20_26, (SubLObject)module0721.UNPROVIDED, (SubLObject)module0721.UNPROVIDED, (SubLObject)module0721.UNPROVIDED)) {
                            var22 = (SubLObject)module0721.T;
                        }
                        var23_25 = var23_25.rest();
                        var20_26 = var23_25.first();
                    }
                }
                var24 = var24.rest();
                var25 = var24.first();
            }
        }
        return var22;
    }
    
    public static SubLObject f44191(final SubLObject var1, final SubLObject var2, final SubLObject var4, final SubLObject var27, final SubLObject var5) {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        final SubLObject var29 = Equality.eq((SubLObject)module0721.$ic16$, conses_high.getf(var4, (SubLObject)module0721.$ic17$, (SubLObject)module0721.UNPROVIDED));
        final SubLObject var30 = (SubLObject)SubLObjectFactory.makeBoolean(module0721.NIL != module0024.f1250() && module0721.$ic16$ == conses_high.getf(var4, (SubLObject)module0721.$ic18$, (SubLObject)module0721.UNPROVIDED));
        SubLObject var31 = (SubLObject)module0721.NIL;
        SubLObject var32 = (SubLObject)module0721.NIL;
        SubLObject var33 = (SubLObject)module0721.NIL;
        final SubLObject var34 = module0721.$g5689$.currentBinding(var28);
        final SubLObject var35 = module0721.$g5690$.currentBinding(var28);
        try {
            module0721.$g5689$.bind((SubLObject)module0721.NIL, var28);
            module0721.$g5690$.bind(var2, var28);
            SubLObject var36 = var2;
            SubLObject var37 = (SubLObject)module0721.NIL;
            var37 = var36.first();
            while (module0721.NIL != var36) {
                final SubLObject var38 = f44196(var1, var37, var29, var30, var27, (SubLObject)module0721.T);
                if (module0721.NIL != var38) {
                    var31 = (SubLObject)ConsesLow.cons(var38, var31);
                }
                else {
                    var32 = (SubLObject)ConsesLow.cons(var37, var32);
                }
                var36 = var36.rest();
                var37 = var36.first();
            }
            var36 = var5;
            var37 = (SubLObject)module0721.NIL;
            var37 = var36.first();
            while (module0721.NIL != var36) {
                final SubLObject var38 = f44196(var1, var37, var29, var30, var27, (SubLObject)module0721.NIL);
                if (module0721.NIL != var38) {
                    var31 = (SubLObject)ConsesLow.cons(var38, var31);
                }
                else {
                    var32 = (SubLObject)ConsesLow.cons(var37, var32);
                }
                var36 = var36.rest();
                var37 = var36.first();
            }
            var33 = module0276.f18287(Sequences.nreverse(var31), (SubLObject)module0721.UNPROVIDED);
        }
        finally {
            module0721.$g5690$.rebind(var35, var28);
            module0721.$g5689$.rebind(var34, var28);
        }
        SubLObject var39 = module0155.f9795(var33, (SubLObject)ConsesLow.list(var1), (SubLObject)module0721.$ic1$, (SubLObject)module0721.UNPROVIDED);
        SubLObject var40 = (SubLObject)module0721.NIL;
        var40 = var39.first();
        while (module0721.NIL != var39) {
            var33 = module0202.f12776(var40, var33);
            var39 = var39.rest();
            var40 = var39.first();
        }
        return Values.values(var33, var32);
    }
    
    public static SubLObject f44197(final SubLObject var20) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0721.NIL != module0202.f12589(var20, module0721.$ic19$) && module0721.NIL != f44195(var20));
    }
    
    public static SubLObject f44198(final SubLObject var36, final SubLObject var37) {
        final SubLObject var38 = module0205.f13204(var36, (SubLObject)module0721.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0721.NIL != module0201.f12546(var38) && module0721.NIL != module0205.f13220(var38, var37, (SubLObject)module0721.UNPROVIDED, (SubLObject)module0721.UNPROVIDED, (SubLObject)module0721.UNPROVIDED));
    }
    
    public static SubLObject f44196(final SubLObject var1, SubLObject var20, final SubLObject var28, final SubLObject var29, final SubLObject var27, final SubLObject var38) {
        final SubLObject var39 = module0202.f12702(var20);
        if (module0721.NIL != f44197(var20)) {
            var20 = (SubLObject)module0721.NIL;
        }
        else if (module0721.NIL != module0202.f12589(var20, module0721.$ic15$)) {
            var20 = f44199(var20, var27);
        }
        else if (module0721.NIL != f44200(var20, var27)) {
            var20 = f44201(var20);
        }
        if (module0721.NIL != var20 && module0721.NIL != var29 && module0721.NIL != module0205.f13145(Symbols.symbol_function((SubLObject)module0721.$ic20$), var20, (SubLObject)module0721.UNPROVIDED, (SubLObject)module0721.UNPROVIDED)) {
            var20 = f44202(var20, var28);
        }
        if (module0721.NIL != var20 && module0721.NIL != var28 && (module0721.NIL == var29 || module0721.NIL != module0205.f13145(Symbols.symbol_function((SubLObject)module0721.$ic21$), var20, (SubLObject)module0721.UNPROVIDED, (SubLObject)module0721.UNPROVIDED)) && module0721.NIL != module0202.f12928(var20)) {
            var20 = f44203(var20);
        }
        while (module0721.NIL != module0205.f13145((SubLObject)module0721.$ic22$, var20, (SubLObject)module0721.UNPROVIDED, (SubLObject)module0721.UNPROVIDED)) {
            var20 = f44204(var20);
        }
        for (var20 = f44205(var20), var20 = f44206(var20); module0721.NIL != module0205.f13145((SubLObject)module0721.$ic23$, var20, (SubLObject)module0721.UNPROVIDED, (SubLObject)module0721.UNPROVIDED); var20 = f44207(var20)) {}
        if (module0721.NIL != var38 && module0721.NIL != var20) {
            var20 = f44208(var1, var20, var39);
        }
        while (module0721.NIL != module0205.f13145((SubLObject)module0721.$ic24$, var20, (SubLObject)module0721.UNPROVIDED, (SubLObject)module0721.UNPROVIDED)) {
            var20 = f44209(var20);
        }
        return var20;
    }
    
    public static SubLObject f44200(final SubLObject var20, final SubLObject var3) {
        return f44210(var20, module0721.$ic19$);
    }
    
    public static SubLObject f44210(final SubLObject var20, final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        SubLObject var42 = (SubLObject)module0721.NIL;
        var41.resetMultipleValues();
        final SubLObject var43 = module0337.f22630(var20, (SubLObject)module0721.$ic25$);
        final SubLObject var44 = var41.secondMultipleValue();
        var41.resetMultipleValues();
        if (module0721.NIL != var43) {
            final SubLObject var45 = module0035.f2294(var44, (SubLObject)module0721.$ic26$, (SubLObject)module0721.UNPROVIDED, (SubLObject)module0721.UNPROVIDED);
            if (!var45.eql(var40)) {
                final SubLObject var46 = module0147.$g2094$.currentBinding(var41);
                final SubLObject var47 = module0147.$g2095$.currentBinding(var41);
                try {
                    module0147.$g2094$.bind((SubLObject)module0721.$ic27$, var41);
                    module0147.$g2095$.bind(module0721.$ic28$, var41);
                    final SubLObject var48 = module0721.$ic29$;
                    if (module0721.NIL != module0158.f10010(var45, (SubLObject)module0721.NIL, var48)) {
                        final SubLObject var49 = module0158.f10011(var45, (SubLObject)module0721.NIL, var48);
                        SubLObject var50 = var42;
                        final SubLObject var51 = (SubLObject)module0721.NIL;
                        while (module0721.NIL == var50) {
                            final SubLObject var52 = module0052.f3695(var49, var51);
                            final SubLObject var53 = (SubLObject)SubLObjectFactory.makeBoolean(!var51.eql(var52));
                            if (module0721.NIL != var53) {
                                SubLObject var54 = (SubLObject)module0721.NIL;
                                try {
                                    var54 = module0158.f10316(var52, (SubLObject)module0721.$ic30$, (SubLObject)module0721.NIL, (SubLObject)module0721.NIL);
                                    SubLObject var46_51 = var42;
                                    final SubLObject var47_52 = (SubLObject)module0721.NIL;
                                    while (module0721.NIL == var46_51) {
                                        final SubLObject var55 = module0052.f3695(var54, var47_52);
                                        final SubLObject var49_54 = (SubLObject)SubLObjectFactory.makeBoolean(!var47_52.eql(var55));
                                        if (module0721.NIL != var49_54) {
                                            var42 = (SubLObject)SubLObjectFactory.makeBoolean(var40.eql(module0178.f11335(var55)) && module0721.TWO_INTEGER.eql(module0178.f11336(var55)));
                                        }
                                        var46_51 = (SubLObject)SubLObjectFactory.makeBoolean(module0721.NIL == var49_54 || module0721.NIL != var42);
                                    }
                                }
                                finally {
                                    final SubLObject var31_55 = Threads.$is_thread_performing_cleanupP$.currentBinding(var41);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0721.T, var41);
                                        if (module0721.NIL != var54) {
                                            module0158.f10319(var54);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var31_55, var41);
                                    }
                                }
                            }
                            var50 = (SubLObject)SubLObjectFactory.makeBoolean(module0721.NIL == var53 || module0721.NIL != var42);
                        }
                    }
                }
                finally {
                    module0147.$g2095$.rebind(var47, var41);
                    module0147.$g2094$.rebind(var46, var41);
                }
            }
        }
        return var42;
    }
    
    public static SubLObject f44201(final SubLObject var20) {
        final SubLObject var21 = module0279.f18513(var20, (SubLObject)module0721.$ic31$);
        final SubLObject var22 = module0202.f12817((SubLObject)module0721.TWO_INTEGER, var21, var20);
        final SubLObject var23 = (SubLObject)ConsesLow.list(module0721.$ic19$, module0205.f13204(var20, (SubLObject)module0721.UNPROVIDED), var21);
        return module0202.f12776(var21, module0276.f18287((SubLObject)ConsesLow.list(var22, var23), (SubLObject)module0721.UNPROVIDED));
    }
    
    public static SubLObject f44206(SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        if (module0721.NIL != module0721.$g5691$.getDynamicValue(var21)) {
            final SubLObject var22 = module0721.$g5692$.currentBinding(var21);
            try {
                module0721.$g5692$.bind((SubLObject)module0721.NIL, var21);
                var20 = module0205.f13147(var20, (SubLObject)module0721.$ic32$, (SubLObject)module0721.$ic33$, (SubLObject)module0721.UNPROVIDED, (SubLObject)module0721.UNPROVIDED);
                SubLObject var23 = module0721.$g5692$.getDynamicValue(var21);
                SubLObject var24 = (SubLObject)module0721.NIL;
                var24 = var23.first();
                while (module0721.NIL != var23) {
                    final SubLObject var25 = module0205.f13204(var24, (SubLObject)module0721.UNPROVIDED);
                    var20 = module0202.f12776(var25, module0276.f18287((SubLObject)ConsesLow.list(var24, var20), (SubLObject)module0721.UNPROVIDED));
                    var23 = var23.rest();
                    var24 = var23.first();
                }
            }
            finally {
                module0721.$g5692$.rebind(var22, var21);
            }
        }
        return var20;
    }
    
    public static SubLObject f44211(final SubLObject var20) {
        return f44210(var20, module0721.$ic34$);
    }
    
    public static SubLObject f44212(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = module0279.f18513(var20, (SubLObject)module0721.$ic35$);
        if (module0721.$g5692$.getDynamicValue(var21).isList()) {
            SubLObject var23 = module0721.$g5692$.getDynamicValue(var21);
            SubLObject var24 = (SubLObject)module0721.NIL;
            var24 = var23.first();
            while (module0721.NIL != var23) {
                var22 = module0279.f18513(var24, (SubLObject)module0721.$ic35$);
                var23 = var23.rest();
                var24 = var23.first();
            }
        }
        final SubLObject var25 = module0202.f12817((SubLObject)module0721.TWO_INTEGER, var22, var20);
        final SubLObject var26 = (SubLObject)ConsesLow.list(module0721.$ic34$, module0205.f13204(var20, (SubLObject)module0721.UNPROVIDED), var22);
        if (module0721.$g5692$.getDynamicValue(var21).isList()) {
            module0721.$g5692$.setDynamicValue((SubLObject)ConsesLow.cons(var26, module0721.$g5692$.getDynamicValue(var21)), var21);
        }
        return var25;
    }
    
    public static SubLObject f44208(final SubLObject var1, final SubLObject var62, final SubLObject var39) {
        final SubLThread var63 = SubLProcess.currentSubLThread();
        final SubLObject var64 = (SubLObject)module0721.$ic36$;
        final SubLObject var65 = (SubLObject)module0721.$ic37$;
        SubLObject var66 = module0202.f12776(var65, module0202.f12776(var64, f44213(var65, var1, var39, var64)));
        if (module0721.NIL != module0202.f12589(var39, module0721.$ic15$)) {
            SubLObject var68;
            final SubLObject var67 = var68 = module0035.f2110((SubLObject)module0721.$ic38$, module0721.$g5690$.getDynamicValue(var63), (SubLObject)module0721.UNPROVIDED);
            SubLObject var69 = (SubLObject)module0721.NIL;
            var69 = var68.first();
            while (module0721.NIL != var68) {
                if (module0721.NIL != f44198(var69, var39)) {
                    final SubLObject var70 = f44205(var69);
                    var66 = module0276.f18287((SubLObject)ConsesLow.list(var66, var70), (SubLObject)module0721.UNPROVIDED);
                }
                var68 = var68.rest();
                var69 = var68.first();
            }
        }
        var66 = f44206(var66);
        var66 = f44207(var66);
        final SubLObject var71 = (SubLObject)ConsesLow.list(var62, var66);
        return module0276.f18280(var71, (SubLObject)module0721.UNPROVIDED);
    }
    
    public static SubLObject f44205(final SubLObject var36) {
        final SubLThread var37 = SubLProcess.currentSubLThread();
        var37.resetMultipleValues();
        SubLObject var38 = module0337.f22630(var36, (SubLObject)module0721.$ic39$);
        SubLObject var39 = var37.secondMultipleValue();
        var37.resetMultipleValues();
        if (module0721.NIL != var38) {
            final SubLObject var40 = module0035.f2294(var39, (SubLObject)module0721.$ic40$, (SubLObject)module0721.UNPROVIDED, (SubLObject)module0721.UNPROVIDED);
            return f44205(module0202.f12817((SubLObject)module0721.ONE_INTEGER, var40, var36));
        }
        var37.resetMultipleValues();
        var38 = module0337.f22630(var36, (SubLObject)module0721.$ic41$);
        var39 = var37.secondMultipleValue();
        var37.resetMultipleValues();
        if (module0721.NIL != var38) {
            final SubLObject var41 = module0035.f2294(var39, (SubLObject)module0721.$ic42$, (SubLObject)module0721.UNPROVIDED, (SubLObject)module0721.UNPROVIDED);
            final SubLObject var42 = module0035.f2294(var39, (SubLObject)module0721.$ic43$, (SubLObject)module0721.UNPROVIDED, (SubLObject)module0721.UNPROVIDED);
            return f44205(module0202.f12820((SubLObject)module0721.$ic44$, var42, module0202.f12820((SubLObject)module0721.$ic45$, var41, var36)));
        }
        return var36;
    }
    
    public static SubLObject f44214(final SubLObject var72) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0721.NIL != module0210.f13576(var72, (SubLObject)module0721.UNPROVIDED) && module0721.NIL != f44215(module0205.f13276(var72)));
    }
    
    public static SubLObject f44215(final SubLObject var72) {
        return module0004.f104(var72, module0721.$g5693$.getGlobalValue(), (SubLObject)module0721.UNPROVIDED, (SubLObject)module0721.UNPROVIDED);
    }
    
    public static SubLObject f44216(final SubLObject var73, final SubLObject var74) {
        final SubLObject var75 = module0205.f13276(var74);
        if (var75.eql(module0721.$ic47$)) {
            final SubLObject var76 = module0205.f13368(var74, (SubLObject)module0721.UNPROVIDED);
            return module0202.f12768(module0721.$ic48$, var73, var76);
        }
        if (var75.eql(module0721.$ic49$)) {
            final SubLObject var76 = module0205.f13368(var74, (SubLObject)module0721.UNPROVIDED);
            return module0202.f12768(module0721.$ic50$, var73, var76);
        }
        if (var75.eql(module0721.$ic51$)) {
            final SubLObject var77 = module0205.f13277(var74, (SubLObject)module0721.UNPROVIDED);
            final SubLObject var78 = module0229.f15243((SubLObject)ConsesLow.listS(module0721.$ic52$, var77, (SubLObject)module0721.$ic53$));
            final SubLObject var79 = module0229.f15243((SubLObject)ConsesLow.listS(module0721.$ic52$, var77, (SubLObject)module0721.$ic54$));
            return module0276.f18288((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0721.$ic48$, var73, var78), (SubLObject)ConsesLow.list(module0721.$ic50$, var73, var79)), (SubLObject)module0721.UNPROVIDED);
        }
        if (var75.eql(module0721.$ic55$)) {
            final SubLObject var77 = module0205.f13277(var74, (SubLObject)module0721.UNPROVIDED);
            final SubLObject var78 = module0229.f15243((SubLObject)ConsesLow.listS(module0721.$ic52$, var77, (SubLObject)module0721.$ic53$));
            return module0276.f18288((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0721.$ic48$, var73, var78), (SubLObject)ConsesLow.list(module0721.$ic56$, var73, var77)), (SubLObject)module0721.UNPROVIDED);
        }
        if (!var75.eql(module0721.$ic57$) && !var75.eql(module0721.$ic58$)) {
            return (SubLObject)module0721.NIL;
        }
        if (module0721.NIL == module0205.f13368(var74, (SubLObject)module0721.UNPROVIDED)) {
            return module0205.f13277(var74, (SubLObject)module0721.UNPROVIDED);
        }
        SubLObject var81;
        final SubLObject var80 = var81 = module0205.f13304(var74, (SubLObject)module0721.UNPROVIDED);
        SubLObject var82 = (SubLObject)module0721.NIL;
        SubLObject var83 = (SubLObject)module0721.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var81, var80, (SubLObject)module0721.$ic59$);
        var82 = var81.first();
        var81 = var81.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var81, var80, (SubLObject)module0721.$ic59$);
        var83 = var81.first();
        var81 = var81.rest();
        if (module0721.NIL == var81) {
            return module0276.f18288((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0721.$ic48$, var73, var82), (SubLObject)ConsesLow.list(module0721.$ic50$, var73, var83)), (SubLObject)module0721.UNPROVIDED);
        }
        cdestructuring_bind.cdestructuring_bind_error(var80, (SubLObject)module0721.$ic59$);
        return (SubLObject)module0721.NIL;
    }
    
    public static SubLObject f44204(final SubLObject var20) {
        final SubLObject var21 = module0205.f13145((SubLObject)module0721.$ic22$, var20, (SubLObject)module0721.UNPROVIDED, (SubLObject)module0721.UNPROVIDED);
        final SubLObject var22 = module0205.f13397(var21, var20, Symbols.symbol_function((SubLObject)module0721.EQUAL)).first();
        final SubLObject var23 = f44194((SubLObject)module0721.$ic60$);
        final SubLObject var24 = module0202.f12820(var22, var23, var20);
        final SubLObject var25 = f44216(var23, var21);
        return (module0721.NIL != var25) ? module0276.f18288((SubLObject)ConsesLow.list(var24, var25), (SubLObject)module0721.UNPROVIDED) : var24;
    }
    
    public static SubLObject f44207(final SubLObject var20) {
        final SubLObject var21 = module0205.f13145((SubLObject)module0721.$ic23$, var20, (SubLObject)module0721.UNPROVIDED, (SubLObject)module0721.UNPROVIDED);
        if (module0721.NIL == var21) {
            return var20;
        }
        final SubLObject var22 = module0205.f13397(var21, var20, Symbols.symbol_function((SubLObject)module0721.EQUAL)).first();
        final SubLObject var23 = f44194((SubLObject)module0721.$ic61$);
        final SubLObject var24 = module0202.f12820(var22, var23, var20);
        final SubLObject var25 = f44217(var23, var21);
        return (module0721.NIL != var25) ? module0276.f18288((SubLObject)ConsesLow.list(var24, var25), (SubLObject)module0721.UNPROVIDED) : var24;
    }
    
    public static SubLObject f44218(final SubLObject var72) {
        return module0205.f13374(var72, module0721.$ic62$);
    }
    
    public static SubLObject f44217(final SubLObject var86, final SubLObject var84) {
        final SubLObject var87 = module0205.f13277(var84, (SubLObject)module0721.UNPROVIDED);
        return (SubLObject)(var87.eql(module0721.$ic63$) ? module0721.NIL : module0202.f12768(module0721.$ic64$, var86, var87));
    }
    
    public static SubLObject f44209(final SubLObject var20) {
        final SubLObject var21 = module0205.f13145((SubLObject)module0721.$ic24$, var20, (SubLObject)module0721.UNPROVIDED, (SubLObject)module0721.UNPROVIDED);
        final SubLObject var22 = module0205.f13397(var21, var20, Symbols.symbol_function((SubLObject)module0721.EQUAL)).first();
        final SubLObject var23 = ConsesLow.append(var22, (SubLObject)module0721.$ic65$);
        final SubLObject var24 = f44194((SubLObject)module0721.$ic66$);
        final SubLObject var25 = module0202.f12820(var23, var24, var20);
        return var25;
    }
    
    public static SubLObject f44219(final SubLObject var72) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0721.NIL != module0205.f13374(var72, module0721.$ic67$) && module0205.f13370(var72, (SubLObject)module0721.UNPROVIDED).isString());
    }
    
    public static SubLObject f44203(final SubLObject var20) {
        return module0202.f12643(module0721.$ic68$, var20);
    }
    
    public static SubLObject f44199(final SubLObject var20, final SubLObject var27) {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        if (module0721.NIL != module0721.$g5694$.getDynamicValue(var28)) {
            return f44220(var20, var27);
        }
        return f44221(var20, var27);
    }
    
    public static SubLObject f44221(final SubLObject var20, final SubLObject var27) {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        SubLObject var29 = module0202.f12817((SubLObject)module0721.ZERO_INTEGER, module0721.$ic69$, module0205.f13250(var27, module0172.f10921((SubLObject)module0721.$ic70$), var20, (SubLObject)module0721.UNPROVIDED, (SubLObject)module0721.UNPROVIDED));
        final SubLObject var30 = module0035.f2110((SubLObject)module0721.$ic38$, module0721.$g5690$.getDynamicValue(var28), (SubLObject)module0721.UNPROVIDED);
        SubLObject var31 = (SubLObject)module0721.NIL;
        var28.resetMultipleValues();
        final SubLObject var32 = module0337.f22630(var29, (SubLObject)module0721.$ic71$);
        final SubLObject var33 = var28.secondMultipleValue();
        var28.resetMultipleValues();
        if (module0721.NIL != var32) {
            final SubLObject var34 = module0035.f2294(var33, (SubLObject)module0721.$ic72$, (SubLObject)module0721.UNPROVIDED, (SubLObject)module0721.UNPROVIDED);
            final SubLObject var35 = module0035.f2294(var33, (SubLObject)module0721.$ic73$, (SubLObject)module0721.UNPROVIDED, (SubLObject)module0721.UNPROVIDED);
            if (module0721.NIL == var31) {
                SubLObject var36 = var30;
                SubLObject var37 = (SubLObject)module0721.NIL;
                var37 = var36.first();
                while (module0721.NIL == var31 && module0721.NIL != var36) {
                    if (module0721.NIL != f44198(var37, var29)) {
                        final SubLObject var38 = f44205(var37);
                        var28.resetMultipleValues();
                        final SubLObject var41_96 = module0337.f22630(var38, (SubLObject)ConsesLow.list(module0721.$ic19$, (SubLObject)module0721.$ic74$, var34));
                        final SubLObject var42_97 = var28.secondMultipleValue();
                        var28.resetMultipleValues();
                        if (module0721.NIL != var41_96) {
                            final SubLObject var39 = module0035.f2294(var42_97, (SubLObject)module0721.$ic75$, (SubLObject)module0721.UNPROVIDED, (SubLObject)module0721.UNPROVIDED);
                            final SubLObject var40 = (SubLObject)ConsesLow.list(module0721.$ic76$, var39);
                            var29 = module0202.f12820((SubLObject)module0721.$ic45$, var40, var29);
                            var31 = (SubLObject)module0721.T;
                        }
                    }
                    var36 = var36.rest();
                    var37 = var36.first();
                }
            }
        }
        return var29;
    }
    
    public static SubLObject f44220(final SubLObject var20, final SubLObject var27) {
        final SubLObject var28 = module0205.f13204(var20, (SubLObject)module0721.UNPROVIDED);
        final SubLObject var29 = f44194((SubLObject)module0721.$ic77$);
        final SubLObject var30 = f44194((SubLObject)module0721.$ic78$);
        final SubLObject var31 = module0202.f12683(module0721.$ic79$, (SubLObject)ConsesLow.list(var29), var30);
        final SubLObject var32 = module0202.f12768(module0721.$ic80$, var31, var28);
        final SubLObject var33 = f44222(var29, var27);
        return module0202.f12768(module0721.$ic81$, var33, var32);
    }
    
    public static SubLObject f44222(final SubLObject var101, final SubLObject var27) {
        if (module0721.NIL != module0202.f12589(var27, module0721.$ic82$)) {
            SubLObject var102 = (SubLObject)module0721.NIL;
            SubLObject var103 = module0035.f2119(f44223(var27));
            SubLObject var104 = (SubLObject)module0721.NIL;
            var104 = var103.first();
            while (module0721.NIL != var103) {
                var102 = (SubLObject)ConsesLow.cons(module0202.f12768(module0721.$ic83$, var104, var101), var102);
                var103 = var103.rest();
                var104 = var103.first();
            }
            return module0276.f18280(var102, (SubLObject)module0721.UNPROVIDED);
        }
        return module0202.f12768(module0721.$ic83$, var27, var101);
    }
    
    public static SubLObject f44223(final SubLObject var107) {
        if (module0721.NIL != module0173.f10955(var107)) {
            return var107;
        }
        if (module0721.NIL != module0202.f12589(var107, module0721.$ic82$)) {
            return f44223(module0205.f13304(var107, (SubLObject)module0721.UNPROVIDED));
        }
        if (module0721.NIL != module0172.f10917(var107)) {
            return var107;
        }
        if (module0721.NIL != module0035.f2014(var107)) {
            return (SubLObject)ConsesLow.cons(f44223(var107.first()), f44223(var107.rest()));
        }
        return var107;
    }
    
    public static SubLObject f44202(final SubLObject var20, final SubLObject var28) {
        SubLObject var29 = module0202.f12764(var20);
        final SubLObject var30 = (module0721.NIL != var28) ? module0721.$ic84$ : module0721.$ic85$;
        final SubLObject var31 = module0205.f13145(Symbols.symbol_function((SubLObject)module0721.$ic86$), var29, (SubLObject)module0721.UNPROVIDED, (SubLObject)module0721.UNPROVIDED);
        if (module0721.NIL != var31) {
            final SubLObject var32 = module0205.f13145(Symbols.symbol_function((SubLObject)module0721.$ic20$), var31, (SubLObject)module0721.UNPROVIDED, (SubLObject)module0721.UNPROVIDED);
            final SubLObject var33 = f44194((SubLObject)module0721.$ic87$);
            var29 = module0205.f13251(var33, var31, var29, (SubLObject)module0721.UNPROVIDED, (SubLObject)module0721.UNPROVIDED);
            var29 = module0276.f18287((SubLObject)ConsesLow.list(var29, module0202.f12768(module0721.$ic88$, var33, var32)), (SubLObject)module0721.UNPROVIDED);
        }
        final SubLObject var32 = module0205.f13145(Symbols.symbol_function((SubLObject)module0721.$ic20$), var29, (SubLObject)module0721.UNPROVIDED, (SubLObject)module0721.UNPROVIDED);
        final SubLObject var33 = f44194((SubLObject)module0721.$ic89$);
        var29 = module0205.f13251(var33, var32, var29, (SubLObject)module0721.UNPROVIDED, (SubLObject)module0721.UNPROVIDED);
        return module0202.f12768(module0721.$ic81$, var29, module0202.f12768(var30, var32, var33));
    }
    
    public static SubLObject f44213(final SubLObject var111, final SubLObject var112, final SubLObject var113, final SubLObject var114) {
        return module0202.f12770(module0721.$ic90$, var111, var112, var113, var114);
    }
    
    public static SubLObject f44224(final SubLObject var115) {
        return module0211.f13649(var115, module0721.$ic90$);
    }
    
    public static SubLObject f44225() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0721", "f44190", "S#48365", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0721", "f44192", "S#48366", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0721", "f44193", "S#48367");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0721", "f44194", "S#48368", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0721", "f44195", "S#48369", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0721", "f44191", "S#48370", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0721", "f44197", "S#48371", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0721", "f44198", "S#48372", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0721", "f44196", "S#48373", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0721", "f44200", "S#48374", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0721", "f44210", "S#48375", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0721", "f44201", "S#48376", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0721", "f44206", "S#48377", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0721", "f44211", "S#48378", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0721", "f44212", "S#48379", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0721", "f44208", "S#48380", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0721", "f44205", "S#48381", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0721", "f44214", "S#48382", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0721", "f44215", "S#48383", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0721", "f44216", "S#48384", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0721", "f44204", "S#48385", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0721", "f44207", "S#48386", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0721", "f44218", "S#48387", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0721", "f44217", "S#48388", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0721", "f44209", "S#48389", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0721", "f44219", "S#48390", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0721", "f44203", "S#48391", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0721", "f44199", "S#48392", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0721", "f44221", "S#48393", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0721", "f44220", "S#48394", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0721", "f44222", "S#48395", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0721", "f44223", "S#48396", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0721", "f44202", "S#48397", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0721", "f44213", "S#43026", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0721", "f44224", "S#43027", 1, 0, false);
        return (SubLObject)module0721.NIL;
    }
    
    public static SubLObject f44226() {
        module0721.$g5688$ = SubLFiles.defparameter("S#48398", (SubLObject)module0721.NIL);
        module0721.$g5689$ = SubLFiles.defparameter("S#48399", (SubLObject)module0721.NIL);
        module0721.$g5690$ = SubLFiles.defparameter("S#48400", (SubLObject)module0721.NIL);
        module0721.$g5691$ = SubLFiles.defparameter("S#48401", (SubLObject)module0721.NIL);
        module0721.$g5692$ = SubLFiles.defparameter("S#48402", (SubLObject)module0721.$ic14$);
        module0721.$g5693$ = SubLFiles.deflexical("S#48403", (SubLObject)module0721.$ic46$);
        module0721.$g5694$ = SubLFiles.defparameter("S#48404", (SubLObject)module0721.NIL);
        return (SubLObject)module0721.NIL;
    }
    
    public static SubLObject f44227() {
        return (SubLObject)module0721.NIL;
    }
    
    public void declareFunctions() {
        f44225();
    }
    
    public void initializeVariables() {
        f44226();
    }
    
    public void runTopLevelForms() {
        f44227();
    }
    
    static {
        me = (SubLFile)new module0721();
        module0721.$g5688$ = null;
        module0721.$g5689$ = null;
        module0721.$g5690$ = null;
        module0721.$g5691$ = null;
        module0721.$g5692$ = null;
        module0721.$g5693$ = null;
        module0721.$g5694$ = null;
        $ic0$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CASE-INSENSITIVE"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE"), (SubLObject)SubLObjectFactory.makeKeyword("REGULAR-EXPRESSIONS"), (SubLObject)SubLObjectFactory.makeKeyword("FALSE"));
        $ic1$ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $ic2$ = SubLObjectFactory.makeSymbol("LISTP");
        $ic3$ = SubLObjectFactory.makeSymbol("S#12263", "CYC");
        $ic4$ = SubLObjectFactory.makeSymbol("S#748", "CYC");
        $ic5$ = SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE");
        $ic6$ = SubLObjectFactory.makeKeyword("HL");
        $ic7$ = SubLObjectFactory.makeKeyword("PROBABLY-APPROXIMATELY-DONE");
        $ic8$ = (SubLFloat)SubLObjectFactory.makeDouble(1.0);
        $ic9$ = SubLObjectFactory.makeKeyword("NEW-TERMS-ALLOWED?");
        $ic10$ = SubLObjectFactory.makeKeyword("BROWSABLE?");
        $ic11$ = SubLObjectFactory.makeSymbol("CLET");
        $ic12$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#48399", "CYC"), (SubLObject)module0721.NIL));
        $ic13$ = SubLObjectFactory.makeString("??~A~D");
        $ic14$ = SubLObjectFactory.makeKeyword("UNBOUND");
        $ic15$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ist-Intermediate"));
        $ic16$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic17$ = SubLObjectFactory.makeKeyword("CASE-INSENSITIVE");
        $ic18$ = SubLObjectFactory.makeKeyword("REGULAR-EXPRESSIONS");
        $ic19$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("temporallySubsumes"));
        $ic20$ = SubLObjectFactory.makeSymbol("S#4512", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#4513", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#48382", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("S#48387", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#48390", "CYC");
        $ic25$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#39252", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"));
        $ic26$ = SubLObjectFactory.makeSymbol("S#39252", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic28$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic29$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("transitiveViaArgInverse"));
        $ic30$ = SubLObjectFactory.makeKeyword("GAF");
        $ic31$ = SubLObjectFactory.makeSymbol("?DATE");
        $ic32$ = SubLObjectFactory.makeSymbol("S#48378", "CYC");
        $ic33$ = SubLObjectFactory.makeSymbol("S#48379", "CYC");
        $ic34$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("geographicallySubsumes"));
        $ic35$ = SubLObjectFactory.makeSymbol("?PLACE");
        $ic36$ = SubLObjectFactory.makeSymbol("?REFSPEC");
        $ic37$ = SubLObjectFactory.makeSymbol("?ASSERTION");
        $ic38$ = SubLObjectFactory.makeSymbol("S#48371", "CYC");
        $ic39$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("temporallySubsumes")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("SomeTimeInIntervalFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#48405", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $ic40$ = SubLObjectFactory.makeSymbol("S#48405", "CYC");
        $ic41$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("temporallySubsumes")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TimeIntervalInclusiveFn")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("SomeTimeInIntervalFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#124", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("SomeTimeInIntervalFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#125", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $ic42$ = SubLObjectFactory.makeSymbol("S#125", "CYC");
        $ic43$ = SubLObjectFactory.makeSymbol("S#124", "CYC");
        $ic44$ = ConsesLow.list((SubLObject)module0721.ONE_INTEGER, (SubLObject)module0721.ONE_INTEGER);
        $ic45$ = ConsesLow.list((SubLObject)module0721.ONE_INTEGER, (SubLObject)module0721.TWO_INTEGER);
        $ic46$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("IntervalOfTypeMinFn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("IntervalOfTypeMaxFn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("IntervalRangeFn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("ApproximatelyFn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("AlmostFn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Unity")));
        $ic47$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("IntervalOfTypeMinFn"));
        $ic48$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("greaterThanOrEqualTo"));
        $ic49$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("IntervalOfTypeMaxFn"));
        $ic50$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("lessThanOrEqualTo"));
        $ic51$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ApproximatelyFn"));
        $ic52$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TimesFn"));
        $ic53$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeDouble(0.9));
        $ic54$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeDouble(1.1));
        $ic55$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("AlmostFn"));
        $ic56$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("lessThan"));
        $ic57$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Unity"));
        $ic58$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("IntervalRangeFn"));
        $ic59$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MIN"), (SubLObject)SubLObjectFactory.makeSymbol("MAX"));
        $ic60$ = SubLObjectFactory.makeString("QUANTITY");
        $ic61$ = SubLObjectFactory.makeString("INSTANCE");
        $ic62$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SomeFn"));
        $ic63$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Thing"));
        $ic64$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic65$ = ConsesLow.list((SubLObject)module0721.THREE_INTEGER);
        $ic66$ = SubLObjectFactory.makeString("GUID");
        $ic67$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("InstanceNamedFn-Ternary"));
        $ic68$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("trueSentence-CaseInsensitive"));
        $ic69$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ist"));
        $ic70$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("The")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Microtheory")));
        $ic71$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("ist")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("MtSpace")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#48406", "CYC")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("MtTimeWithGranularityDimFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("EL-VARIABLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#48407", "CYC"))), module0128.f8479((SubLObject)SubLObjectFactory.makeString("TimePoint"))))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $ic72$ = SubLObjectFactory.makeSymbol("S#48407", "CYC");
        $ic73$ = SubLObjectFactory.makeSymbol("S#48406", "CYC");
        $ic74$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#13151", "CYC"));
        $ic75$ = SubLObjectFactory.makeSymbol("S#13151", "CYC");
        $ic76$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("AnytimeDuringPSCFn"));
        $ic77$ = SubLObjectFactory.makeString("MT");
        $ic78$ = SubLObjectFactory.makeString("MT-DIMS");
        $ic79$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("MtSpace"));
        $ic80$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ist-Asserted"));
        $ic81$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("and"));
        $ic82$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("MtUnionFn"));
        $ic83$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $ic84$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("regexStringMatch-CaseInsensitive"));
        $ic85$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("regexStringMatch"));
        $ic86$ = SubLObjectFactory.makeSymbol("S#48408", "CYC");
        $ic87$ = SubLObjectFactory.makeString("STANDIN");
        $ic88$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("termStrings"));
        $ic89$ = SubLObjectFactory.makeString("REGEX");
        $ic90$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertionProducedByReformulation"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0721.class
	Total time: 284 ms
	
	Decompiled with Procyon 0.5.32.
*/