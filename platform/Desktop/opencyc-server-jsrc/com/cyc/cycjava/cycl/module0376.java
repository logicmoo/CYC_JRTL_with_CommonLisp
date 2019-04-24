package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0376 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0376";
    public static final String myFingerPrint = "7c88db0806ca4f5db1111e599ed2cf1079f0284af94095de86e1e6365a3a33ef";
    public static SubLSymbol $g3189$;
    private static SubLSymbol $g3190$;
    private static SubLSymbol $g3192$;
    public static SubLSymbol $g3193$;
    private static SubLSymbol $g3191$;
    private static SubLSymbol $g3194$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLString $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLList $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLString $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLList $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLList $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLString $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLList $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLList $ic94$;
    private static final SubLString $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLList $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLList $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLString $ic110$;
    
    public static SubLObject f26594(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)module0376.ZERO_INTEGER);
        return (SubLObject)module0376.NIL;
    }
    
    public static SubLObject f26595(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX29802_native.class) ? module0376.T : module0376.NIL);
    }
    
    public static SubLObject f26596(final SubLObject var1) {
        assert module0376.NIL != f26595(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f26597(final SubLObject var1) {
        assert module0376.NIL != f26595(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f26598(final SubLObject var1) {
        assert module0376.NIL != f26595(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f26599(final SubLObject var1, final SubLObject var4) {
        assert module0376.NIL != f26595(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f26600(final SubLObject var1, final SubLObject var4) {
        assert module0376.NIL != f26595(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f26601(final SubLObject var1, final SubLObject var4) {
        assert module0376.NIL != f26595(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f26602(SubLObject var5) {
        if (var5 == module0376.UNPROVIDED) {
            var5 = (SubLObject)module0376.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX29802_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0376.NIL, var7 = var5; module0376.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0376.$ic15$)) {
                f26599(var6, var9);
            }
            else if (var10.eql((SubLObject)module0376.$ic16$)) {
                f26600(var6, var9);
            }
            else if (var10.eql((SubLObject)module0376.$ic17$)) {
                f26601(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0376.$ic18$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f26603(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0376.$ic19$, (SubLObject)module0376.$ic20$, (SubLObject)module0376.THREE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0376.$ic21$, (SubLObject)module0376.$ic15$, f26596(var11));
        Functions.funcall(var12, var11, (SubLObject)module0376.$ic21$, (SubLObject)module0376.$ic16$, f26597(var11));
        Functions.funcall(var12, var11, (SubLObject)module0376.$ic21$, (SubLObject)module0376.$ic17$, f26598(var11));
        Functions.funcall(var12, var11, (SubLObject)module0376.$ic22$, (SubLObject)module0376.$ic20$, (SubLObject)module0376.THREE_INTEGER);
        return var11;
    }
    
    public static SubLObject f26604(final SubLObject var11, final SubLObject var12) {
        return f26603(var11, var12);
    }
    
    public static SubLObject f26605(final SubLObject var13, final SubLObject var14, final SubLObject var15, final SubLObject var16) {
        assert module0376.NIL != module0363.f24478(var13) : var13;
        final SubLObject var17 = f26606(var13, var14, var15, var16);
        module0373.f26334(var17);
        return var17;
    }
    
    public static SubLObject f26606(final SubLObject var13, final SubLObject var14, final SubLObject var15, final SubLObject var16) {
        final SubLObject var17 = module0364.f24729((SubLObject)module0376.$ic25$, var13);
        f26607(var17);
        f26608(var17, var14);
        f26609(var17, var15);
        f26610(var17, var16);
        module0363.f24662(var13, var17);
        return var17;
    }
    
    public static SubLObject f26607(final SubLObject var17) {
        final SubLObject var18 = f26602((SubLObject)module0376.UNPROVIDED);
        module0364.f24744(var17, var18);
        return var17;
    }
    
    public static SubLObject f26611(final SubLObject var17) {
        module0363.f24663(module0364.f24725(var17), var17);
        final SubLObject var18 = module0364.f24742(var17);
        f26599(var18, (SubLObject)module0376.$ic26$);
        f26600(var18, (SubLObject)module0376.$ic26$);
        f26601(var18, (SubLObject)module0376.$ic26$);
        return var17;
    }
    
    public static SubLObject f26612(final SubLObject var17) {
        assert module0376.NIL != f26613(var17) : var17;
        final SubLObject var18 = module0364.f24742(var17);
        return f26596(var18);
    }
    
    public static SubLObject f26614(final SubLObject var17) {
        assert module0376.NIL != f26613(var17) : var17;
        final SubLObject var18 = module0364.f24742(var17);
        return f26597(var18);
    }
    
    public static SubLObject f26615(final SubLObject var17) {
        assert module0376.NIL != f26613(var17) : var17;
        final SubLObject var18 = module0364.f24742(var17);
        return f26598(var18);
    }
    
    public static SubLObject f26608(final SubLObject var17, final SubLObject var14) {
        assert module0376.NIL != f26613(var17) : var17;
        assert module0376.NIL != module0340.f22789(var14) : var14;
        final SubLObject var18 = module0364.f24742(var17);
        f26599(var18, var14);
        return var17;
    }
    
    public static SubLObject f26609(final SubLObject var17, final SubLObject var19) {
        assert module0376.NIL != f26613(var17) : var17;
        assert module0376.NIL != module0233.f15350(var19) : var19;
        final SubLObject var20 = module0364.f24742(var17);
        f26600(var20, var19);
        return var17;
    }
    
    public static SubLObject f26610(final SubLObject var17, final SubLObject var16) {
        assert module0376.NIL != f26613(var17) : var17;
        assert module0376.NIL != module0191.f11993(var16) : var16;
        if (module0376.NIL != module0361.f24173(module0364.f24722(var17))) {
            final SubLObject var18 = module0364.f24742(var17);
            f26601(var18, var16);
        }
        return var17;
    }
    
    public static SubLObject f26616(final SubLObject var17) {
        assert module0376.NIL != f26613(var17) : var17;
        final SubLObject var18 = f26612(var17);
        final SubLObject var19 = module0364.f24725(var17);
        final SubLObject var20 = module0364.f24722(var17);
        if (module0376.NIL != module0340.f22913(var18)) {
            SubLObject var21 = module0363.f24517(var19);
            SubLObject var22 = (SubLObject)module0376.NIL;
            var22 = var21.first();
            while (module0376.NIL != var21) {
                if (module0376.NIL != module0363.f24524(var22, (SubLObject)module0376.$ic25$) && module0365.f24865(var22).eql(var18)) {
                    return var22;
                }
                var21 = var21.rest();
                var22 = var21.first();
            }
            if (module0376.NIL != module0361.f24165(var20) && module0376.NIL != module0363.f24553(var19)) {
                final SubLObject var23 = module0363.f24530(var19);
                SubLObject var24;
                SubLObject var25;
                SubLObject var26;
                SubLObject var27;
                SubLObject var28;
                SubLObject var29;
                for (var24 = module0032.f1741(var23), var25 = (SubLObject)module0376.NIL, var25 = module0032.f1742(var24, var23); module0376.NIL == module0032.f1744(var24, var25); var25 = module0032.f1743(var25)) {
                    var26 = module0032.f1745(var24, var25);
                    if (module0376.NIL != module0032.f1746(var25, var26) && module0376.NIL != module0364.f24748(var26, (SubLObject)module0376.$ic31$)) {
                        var27 = module0364.f24725(var26);
                        var28 = module0363.f24517(var27);
                        var29 = (SubLObject)module0376.NIL;
                        var29 = var28.first();
                        while (module0376.NIL != var28) {
                            if (module0376.NIL != module0363.f24524(var29, (SubLObject)module0376.$ic25$) && module0365.f24865(var29).eql(var18)) {
                                return var29;
                            }
                            var28 = var28.rest();
                            var29 = var28.first();
                        }
                    }
                }
            }
        }
        else {
            final SubLObject var23 = module0363.f24530(var19);
            SubLObject var24;
            SubLObject var25;
            SubLObject var28;
            SubLObject var29;
            SubLObject var30;
            SubLObject var31;
            SubLObject var23_30;
            SubLObject var24_31;
            SubLObject var25_32;
            SubLObject var32;
            SubLObject var33;
            SubLObject var34;
            SubLObject var35;
            for (var24 = module0032.f1741(var23), var25 = (SubLObject)module0376.NIL, var25 = module0032.f1742(var24, var23); module0376.NIL == module0032.f1744(var24, var25); var25 = module0032.f1743(var25)) {
                var30 = module0032.f1745(var24, var25);
                if (module0376.NIL != module0032.f1746(var25, var30) && module0376.NIL != module0364.f24748(var30, (SubLObject)module0376.$ic32$)) {
                    var31 = module0364.f24725(var30);
                    var28 = module0363.f24517(var31);
                    var29 = (SubLObject)module0376.NIL;
                    var29 = var28.first();
                    while (module0376.NIL != var28) {
                        if (module0376.NIL != module0363.f24524(var29, (SubLObject)module0376.$ic33$) && module0365.f24865(var29).eql(var18)) {
                            return var29;
                        }
                        var28 = var28.rest();
                        var29 = var28.first();
                    }
                    var23_30 = module0363.f24530(var31);
                    for (var24_31 = module0032.f1741(var23_30), var25_32 = (SubLObject)module0376.NIL, var25_32 = module0032.f1742(var24_31, var23_30); module0376.NIL == module0032.f1744(var24_31, var25_32); var25_32 = module0032.f1743(var25_32)) {
                        var32 = module0032.f1745(var24_31, var25_32);
                        if (module0376.NIL != module0032.f1746(var25_32, var32) && module0376.NIL != module0364.f24748(var32, (SubLObject)module0376.$ic31$)) {
                            var33 = module0364.f24725(var32);
                            var34 = module0363.f24517(var33);
                            var35 = (SubLObject)module0376.NIL;
                            var35 = var34.first();
                            while (module0376.NIL != var34) {
                                if (module0376.NIL != module0363.f24524(var35, (SubLObject)module0376.$ic33$) && module0365.f24865(var35).eql(var18)) {
                                    return var35;
                                }
                                var34 = var34.rest();
                                var35 = var34.first();
                            }
                        }
                    }
                }
            }
        }
        return (SubLObject)module0376.NIL;
    }
    
    public static SubLObject f26617(final SubLObject var17, final SubLObject var15, final SubLObject var16) {
        final SubLObject var18 = f26614(var17);
        final SubLObject var19 = f26615(var17);
        return (SubLObject)SubLObjectFactory.makeBoolean(var15.equal(var18) && module0376.NIL != module0191.f11997(var16, var19));
    }
    
    public static SubLObject f26618(final SubLObject var35) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0376.NIL != f26619(var35) || module0376.NIL != f26620(var35) || module0376.NIL != f26621(var35));
    }
    
    public static SubLObject f26620(final SubLObject var36) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0376.NIL != module0365.f24819(var36) && module0376.$ic33$ == module0365.f24866(var36));
    }
    
    public static SubLObject f26622(final SubLObject var37) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0376.NIL != f26613(var37) && module0376.NIL != module0340.f22959(f26612(var37)));
    }
    
    public static SubLObject f26623(final SubLObject var38) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0376.NIL != module0366.f24916(var38) && module0376.NIL != f26622(module0366.f24937(var38)));
    }
    
    public static SubLObject f26624(final SubLObject var13, final SubLObject var39) {
        final SubLThread var40 = SubLProcess.currentSubLThread();
        if (module0376.NIL == module0361.f24163(module0363.f24507(var13))) {
            return (SubLObject)module0376.NIL;
        }
        SubLObject var41 = (SubLObject)module0376.NIL;
        SubLObject var42 = (SubLObject)module0376.NIL;
        SubLObject var43 = (SubLObject)module0376.NIL;
        final SubLObject var44 = module0370.f25920(var39);
        final SubLObject var45 = module0147.f9540(var44);
        final SubLObject var46 = module0147.$g2095$.currentBinding(var40);
        final SubLObject var47 = module0147.$g2094$.currentBinding(var40);
        final SubLObject var48 = module0147.$g2096$.currentBinding(var40);
        try {
            module0147.$g2095$.bind(module0147.f9545(var45), var40);
            module0147.$g2094$.bind(module0147.f9546(var45), var40);
            module0147.$g2096$.bind(module0147.f9549(var45), var40);
            SubLObject var49 = f26625(var39);
            var49 = f26626(var49);
            if (module0376.NIL == var43) {
                SubLObject var50 = var49;
                SubLObject var51 = (SubLObject)module0376.NIL;
                var51 = var50.first();
                while (module0376.NIL == var43 && module0376.NIL != var50) {
                    if (module0376.NIL == var41 || module0376.NIL == conses_high.member(var51, var41, (SubLObject)module0376.UNPROVIDED, (SubLObject)module0376.UNPROVIDED)) {
                        final SubLObject var52 = module0340.f22882(var51);
                        if (module0376.NIL == var52 || (var52.isFunctionSpec() && module0376.NIL != Functions.funcall(var52, var39))) {
                            if (module0376.NIL != var52) {
                                var40.resetMultipleValues();
                                final SubLObject var52_53 = f26627(var51, var42, var41);
                                final SubLObject var54_55 = var40.secondMultipleValue();
                                final SubLObject var56_57 = var40.thirdMultipleValue();
                                var40.resetMultipleValues();
                                var43 = var52_53;
                                var42 = var54_55;
                                var41 = var56_57;
                            }
                            final SubLObject var53 = module0340.f22866(var51, var39);
                            if (module0376.NIL != var53) {
                                final SubLObject var54 = module0360.f23935(var53);
                                final SubLObject var55 = module0340.f22908(var51, var39);
                                final SubLObject var56 = (SubLObject)ConsesLow.list(var51, var54, var55);
                                var42 = (SubLObject)ConsesLow.cons(var56, var42);
                            }
                        }
                    }
                    var50 = var50.rest();
                    var51 = var50.first();
                }
            }
            SubLObject var57 = var42;
            SubLObject var58 = (SubLObject)module0376.NIL;
            var58 = var57.first();
            while (module0376.NIL != var57) {
                SubLObject var60;
                final SubLObject var59 = var60 = var58;
                SubLObject var61 = (SubLObject)module0376.NIL;
                SubLObject var62 = (SubLObject)module0376.NIL;
                SubLObject var63 = (SubLObject)module0376.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var60, var59, (SubLObject)module0376.$ic34$);
                var61 = var60.first();
                var60 = var60.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var60, var59, (SubLObject)module0376.$ic34$);
                var62 = var60.first();
                var60 = var60.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var60, var59, (SubLObject)module0376.$ic34$);
                var63 = var60.first();
                var60 = var60.rest();
                if (module0376.NIL == var60) {
                    f26628(var13, var61, var62, var63);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var59, (SubLObject)module0376.$ic34$);
                }
                var57 = var57.rest();
                var58 = var57.first();
            }
        }
        finally {
            module0147.$g2096$.rebind(var48, var40);
            module0147.$g2094$.rebind(var47, var40);
            module0147.$g2095$.rebind(var46, var40);
        }
        return var42;
    }
    
    public static SubLObject f26626(final SubLObject var49) {
        return Sort.sort(var49, (SubLObject)module0376.$ic35$, (SubLObject)module0376.UNPROVIDED);
    }
    
    public static SubLObject f26629(final SubLObject var64, final SubLObject var65) {
        if (module0376.NIL != module0521.f32622(var64) && module0376.NIL == module0521.f32622(var65)) {
            return (SubLObject)module0376.T;
        }
        if (module0376.NIL != module0521.f32622(var65) && module0376.NIL == module0521.f32622(var64)) {
            return (SubLObject)module0376.NIL;
        }
        if (module0376.NIL != module0526.f32859(var64) && module0376.NIL == module0526.f32859(var65)) {
            return (SubLObject)module0376.T;
        }
        if (module0376.NIL != module0526.f32859(var65) && module0376.NIL == module0526.f32859(var64)) {
            return (SubLObject)module0376.NIL;
        }
        return (SubLObject)module0376.T;
    }
    
    public static SubLObject f26625(final SubLObject var66) {
        final SubLThread var67 = SubLProcess.currentSubLThread();
        final SubLObject var68 = module0349.f23461(var66);
        SubLObject var69 = (SubLObject)module0376.NIL;
        final SubLObject var70 = (SubLObject)((module0376.NIL != module0339.f22757()) ? module0369.f25511(module0339.f22757()) : module0376.$ic36$);
        final SubLObject var71 = module0077.f5333(module0340.f22958());
        SubLObject var72;
        SubLObject var73;
        SubLObject var74;
        SubLObject var76;
        SubLObject var75;
        SubLObject var77;
        for (var72 = module0032.f1741(var71), var73 = (SubLObject)module0376.NIL, var73 = module0032.f1742(var72, var71); module0376.NIL == module0032.f1744(var72, var73); var73 = module0032.f1743(var73)) {
            var74 = module0032.f1745(var72, var73);
            if (module0376.NIL != module0032.f1746(var73, var74) && (module0376.NIL == var68 || module0376.NIL != module0521.f32622(var74) || (module0376.NIL != module0375.$g3188$.getDynamicValue(var67) && module0376.NIL != module0526.f32859(var74))) && module0376.NIL != module0340.f22790(var74, var70) && module0376.NIL != module0340.f22885(var74)) {
                var75 = (var76 = f26630(var74, var66));
                var77 = (SubLObject)module0376.NIL;
                var77 = var76.first();
                while (module0376.NIL != var76) {
                    if (module0376.NIL != module0204.f13118(var77, var66)) {
                        var69 = (SubLObject)ConsesLow.cons(var74, var69);
                    }
                    var76 = var76.rest();
                    var77 = var76.first();
                }
            }
        }
        return var69;
    }
    
    public static SubLObject f26631(final SubLObject var66) {
        final SubLThread var67 = SubLProcess.currentSubLThread();
        SubLObject var68 = (SubLObject)module0376.NIL;
        if (module0376.NIL == module0349.f23461(var66)) {
            final SubLObject var70;
            final SubLObject var69 = var70 = module0370.f25920(var66);
            final SubLObject var71 = module0147.$g2095$.currentBinding(var67);
            final SubLObject var72 = module0147.$g2094$.currentBinding(var67);
            final SubLObject var73 = module0147.$g2096$.currentBinding(var67);
            try {
                module0147.$g2095$.bind(module0147.f9545(var70), var67);
                module0147.$g2094$.bind(module0147.f9546(var70), var67);
                module0147.$g2096$.bind(module0147.f9549(var70), var67);
                final SubLObject var74 = module0077.f5333(module0340.f22958());
                SubLObject var75;
                SubLObject var76;
                SubLObject var77;
                SubLObject var79;
                SubLObject var78;
                SubLObject var80;
                SubLObject var81;
                for (var75 = module0032.f1741(var74), var76 = (SubLObject)module0376.NIL, var76 = module0032.f1742(var75, var74); module0376.NIL == module0032.f1744(var75, var76); var76 = module0032.f1743(var76)) {
                    var77 = module0032.f1745(var75, var76);
                    if (module0376.NIL != module0032.f1746(var76, var77) && module0376.NIL == module0521.f32622(var77) && module0376.NIL == module0526.f32859(var77) && module0376.NIL != module0340.f22885(var77)) {
                        var78 = (var79 = f26630(var77, var66));
                        var80 = (SubLObject)module0376.NIL;
                        var80 = var79.first();
                        while (module0376.NIL != var79) {
                            if (module0376.NIL == module0204.f13118(var80, var66)) {
                                var81 = var80;
                                if (module0376.NIL == conses_high.member(var81, var68, Symbols.symbol_function((SubLObject)module0376.EQUAL), Symbols.symbol_function((SubLObject)module0376.IDENTITY))) {
                                    var68 = (SubLObject)ConsesLow.cons(var81, var68);
                                }
                            }
                            var79 = var79.rest();
                            var80 = var79.first();
                        }
                    }
                }
            }
            finally {
                module0147.$g2096$.rebind(var73, var67);
                module0147.$g2094$.rebind(var72, var67);
                module0147.$g2095$.rebind(var71, var67);
            }
        }
        return Sequences.nreverse(var68);
    }
    
    public static SubLObject f26630(final SubLObject var14, final SubLObject var66) {
        final SubLThread var67 = SubLProcess.currentSubLThread();
        final SubLObject var68 = (SubLObject)((module0376.NIL != module0339.f22757()) ? module0369.f25511(module0339.f22757()) : module0376.$ic36$);
        if (module0376.NIL == module0340.f22790(var14, var68)) {
            return (SubLObject)module0376.NIL;
        }
        SubLObject var70;
        final SubLObject var69 = var70 = module0340.f22900(var14);
        SubLObject var71 = (SubLObject)module0376.NIL;
        var71 = var70.first();
        while (module0376.NIL != var70) {
            if (module0376.NIL == module0362.f24440(var66, var71)) {
                return (SubLObject)module0376.NIL;
            }
            var70 = var70.rest();
            var71 = var70.first();
        }
        SubLObject var72 = (SubLObject)module0376.NIL;
        final SubLObject var73 = module0340.f22902(var14);
        if (module0376.NIL != var73) {
            var72 = module0337.f22649(var73, var66, (SubLObject)module0376.UNPROVIDED);
        }
        else {
            final SubLObject var74 = module0340.f22901(var14);
            if (var74.isFunctionSpec()) {
                var72 = Functions.funcall(var74, var66);
            }
        }
        SubLObject var75 = var72;
        SubLObject var76 = (SubLObject)module0376.NIL;
        var76 = var75.first();
        while (module0376.NIL != var75) {
            if (module0376.NIL == Errors.$ignore_mustsP$.getDynamicValue(var67) && module0376.NIL == module0204.f13117(var76)) {
                Errors.error((SubLObject)module0376.$ic37$, var14, var76);
            }
            var75 = var75.rest();
            var76 = var75.first();
        }
        return var72;
    }
    
    public static SubLObject f26628(final SubLObject var13, final SubLObject var14, final SubLObject var59, final SubLObject var60) {
        final SubLObject var61 = module0365.f24854(var13, var14, (SubLObject)module0376.UNPROVIDED);
        module0365.f24874(var61, var59, (SubLObject)module0376.UNPROVIDED);
        module0365.f24872(var61, var60);
        final SubLObject var62 = module0363.f24507(var13);
        final SubLObject var63 = module0361.f24123(var62);
        if (module0376.NIL == module0065.f4772(var63, (SubLObject)module0376.$ic38$)) {
            final SubLObject var81_82 = var63;
            if (module0376.NIL == module0065.f4775(var81_82, (SubLObject)module0376.$ic38$)) {
                final SubLObject var64 = module0065.f4740(var81_82);
                final SubLObject var65 = (SubLObject)module0376.NIL;
                SubLObject var66;
                SubLObject var67;
                SubLObject var68;
                SubLObject var69;
                SubLObject var70;
                SubLObject var71;
                SubLObject var72;
                SubLObject var73;
                SubLObject var74;
                for (var66 = Sequences.length(var64), var67 = (SubLObject)module0376.NIL, var67 = (SubLObject)module0376.ZERO_INTEGER; var67.numL(var66); var67 = Numbers.add(var67, (SubLObject)module0376.ONE_INTEGER)) {
                    var68 = ((module0376.NIL != var65) ? Numbers.subtract(var66, var67, (SubLObject)module0376.ONE_INTEGER) : var67);
                    var69 = Vectors.aref(var64, var68);
                    if (module0376.NIL == module0065.f4749(var69) || module0376.NIL == module0065.f4773((SubLObject)module0376.$ic38$)) {
                        if (module0376.NIL != module0065.f4749(var69)) {
                            var69 = (SubLObject)module0376.$ic38$;
                        }
                        if (module0376.NIL != module0363.f24547(var13, var69)) {
                            var70 = var69;
                            var71 = module0077.f5333(module0369.f25473(var70));
                            for (var72 = module0032.f1741(var71), var73 = (SubLObject)module0376.NIL, var73 = module0032.f1742(var72, var71); module0376.NIL == module0032.f1744(var72, var73); var73 = module0032.f1743(var73)) {
                                var74 = module0032.f1745(var72, var73);
                                if (module0376.NIL != module0032.f1746(var73, var74)) {
                                    module0387.f27563(var74, var61);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject var91_92 = var63;
            if (module0376.NIL == module0065.f4777(var91_92)) {
                final SubLObject var75 = module0065.f4738(var91_92);
                SubLObject var76 = (SubLObject)module0376.NIL;
                SubLObject var77 = (SubLObject)module0376.NIL;
                final Iterator var78 = Hashtables.getEntrySetIterator(var75);
                try {
                    while (Hashtables.iteratorHasNext(var78)) {
                        final Map.Entry var79 = Hashtables.iteratorNextEntry(var78);
                        var76 = Hashtables.getEntryKey(var79);
                        var77 = Hashtables.getEntryValue(var79);
                        if (module0376.NIL != module0363.f24547(var13, var77)) {
                            final SubLObject var80 = var77;
                            final SubLObject var81 = module0077.f5333(module0369.f25473(var80));
                            SubLObject var82;
                            SubLObject var83;
                            SubLObject var84;
                            for (var82 = module0032.f1741(var81), var83 = (SubLObject)module0376.NIL, var83 = module0032.f1742(var82, var81); module0376.NIL == module0032.f1744(var82, var83); var83 = module0032.f1743(var83)) {
                                var84 = module0032.f1745(var82, var83);
                                if (module0376.NIL != module0032.f1746(var83, var84)) {
                                    module0387.f27563(var84, var61);
                                }
                            }
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var78);
                }
            }
        }
        return var61;
    }
    
    public static SubLObject f26632(final SubLObject var36, final SubLObject var90) {
        return var36;
    }
    
    public static SubLObject f26633(final SubLObject var36) {
        if (module0376.NIL != module0365.f24883(var36)) {
            module0365.f24897(var36);
        }
        else {
            final SubLObject var37 = f26634(var36);
            if (module0376.NIL != module0365.f24845(var36) && module0376.NIL != module0384.f27359(var36, (SubLObject)module0376.$ic39$)) {
                module0373.f26209(var36);
            }
            if (module0376.NIL != var37) {
                if (var37.isList()) {
                    SubLObject var38 = var37;
                    SubLObject var39 = (SubLObject)module0376.NIL;
                    var39 = var38.first();
                    while (module0376.NIL != var38) {
                        SubLObject var41;
                        final SubLObject var40 = var41 = var39;
                        SubLObject var42 = (SubLObject)module0376.NIL;
                        SubLObject var43 = (SubLObject)module0376.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var41, var40, (SubLObject)module0376.$ic40$);
                        var42 = var41.first();
                        var41 = var41.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var41, var40, (SubLObject)module0376.$ic40$);
                        var43 = var41.first();
                        var41 = var41.rest();
                        if (module0376.NIL == var41) {
                            f26635(var36, var42, var43);
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var40, (SubLObject)module0376.$ic40$);
                        }
                        var38 = var38.rest();
                        var39 = var38.first();
                    }
                }
                else {
                    module0365.f24896(var36, var37);
                }
            }
        }
        return var36;
    }
    
    public static SubLObject f26634(final SubLObject var36) {
        return (module0376.NIL != module0340.f22876(module0365.f24865(var36))) ? f26636(var36) : f26637(var36);
    }
    
    public static SubLObject f26636(final SubLObject var36) {
        final SubLObject var37 = module0365.f24890(var36);
        final SubLObject var38 = module0365.f24865(var36);
        final SubLObject var39 = module0340.f22876(var38);
        final SubLObject var40 = module0337.f22649(var39, var37, (SubLObject)module0376.UNPROVIDED);
        if (module0376.NIL != var40) {
            module0365.f24898(var36, var40);
            return f26638(var36, var40);
        }
        return (SubLObject)module0376.NIL;
    }
    
    public static SubLObject f26638(final SubLObject var36, final SubLObject var103) {
        return module0365.f24906((SubLObject)module0376.$ic41$, var36, var103);
    }
    
    public static SubLObject f26639(final SubLObject var36, final SubLObject var103) {
        final SubLThread var104 = SubLProcess.currentSubLThread();
        SubLObject var105 = (SubLObject)module0376.NIL;
        var104.resetMultipleValues();
        final SubLObject var106 = module0052.f3693(var103);
        final SubLObject var107 = var104.secondMultipleValue();
        var104.resetMultipleValues();
        if (module0376.NIL != var107) {
            SubLObject var109;
            final SubLObject var108 = var109 = var106;
            SubLObject var110 = (SubLObject)module0376.NIL;
            SubLObject var111 = (SubLObject)module0376.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var109, var108, (SubLObject)module0376.$ic40$);
            var110 = var109.first();
            var109 = var109.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var109, var108, (SubLObject)module0376.$ic40$);
            var111 = var109.first();
            var109 = var109.rest();
            if (module0376.NIL == var109) {
                var105 = f26635(var36, var110, var111);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var108, (SubLObject)module0376.$ic40$);
            }
        }
        return var105;
    }
    
    public static SubLObject f26637(final SubLObject var36) {
        final SubLThread var37 = SubLProcess.currentSubLThread();
        final SubLObject var38 = module0365.f24890(var36);
        final SubLObject var39 = module0365.f24865(var36);
        final SubLObject var40 = module0340.f22875(var39);
        final SubLObject var41 = (SubLObject)((module0376.NIL != var40) ? module0376.NIL : module0340.f22873(var39));
        SubLObject var42 = (SubLObject)module0376.NIL;
        final SubLObject var43 = module0376.$g3190$.currentBinding(var37);
        try {
            module0376.$g3190$.bind((SubLObject)module0376.NIL, var37);
            if (module0376.NIL != var40) {
                module0337.f22649(var40, var38, (SubLObject)module0376.UNPROVIDED);
            }
            else if (var41.isFunctionSpec()) {
                Functions.funcall(var41, var38);
            }
            if (module0376.NIL != module0376.$g3190$.getDynamicValue(var37)) {
                var42 = module0376.$g3190$.getDynamicValue(var37);
            }
        }
        finally {
            module0376.$g3190$.rebind(var43, var37);
        }
        final SubLObject var44 = module0360.f23935(Sequences.length(var42));
        module0365.f24891(var36, var44);
        if (module0376.NIL != module0035.f2000(var42, module0376.$g3191$.getDynamicValue(var37), (SubLObject)module0376.UNPROVIDED)) {
            var42 = f26640(var36, var42);
        }
        return var42;
    }
    
    public static SubLObject f26640(final SubLObject var36, final SubLObject var113) {
        return module0365.f24906((SubLObject)module0376.$ic42$, var36, var113);
    }
    
    public static SubLObject f26641(SubLObject var15, final SubLObject var100) {
        final SubLThread var101 = SubLProcess.currentSubLThread();
        var15 = module0233.f15392(var15);
        module0376.$g3190$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var15, var100), module0376.$g3190$.getDynamicValue(var101)), var101);
        return (SubLObject)module0376.NIL;
    }
    
    public static SubLObject f26642(final SubLObject var36, final SubLObject var114) {
        SubLObject var115 = (SubLObject)module0376.NIL;
        SubLObject var116 = (SubLObject)module0376.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var114, var114, (SubLObject)module0376.$ic40$);
        var115 = var114.first();
        SubLObject var117 = var114.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var117, var114, (SubLObject)module0376.$ic40$);
        var116 = var117.first();
        var117 = var117.rest();
        if (module0376.NIL == var117) {
            return f26635(var36, var115, var116);
        }
        cdestructuring_bind.cdestructuring_bind_error(var114, (SubLObject)module0376.$ic40$);
        return (SubLObject)module0376.NIL;
    }
    
    public static SubLObject f26643() {
        final SubLThread var40 = SubLProcess.currentSubLThread();
        if (module0376.NIL != module0376.$g3192$.getDynamicValue(var40)) {
            final SubLObject var41 = module0339.f22757();
            final SubLObject var42 = module0369.f25526(var41);
            return (SubLObject)SubLObjectFactory.makeBoolean(module0376.NIL == Sequences.find((SubLObject)module0376.$ic43$, var42, (SubLObject)module0376.UNPROVIDED, (SubLObject)module0376.UNPROVIDED, (SubLObject)module0376.UNPROVIDED, (SubLObject)module0376.UNPROVIDED));
        }
        return (SubLObject)module0376.NIL;
    }
    
    public static SubLObject f26635(final SubLObject var36, final SubLObject var15, final SubLObject var100) {
        final SubLThread var101 = SubLProcess.currentSubLThread();
        module0365.f24892(var36, (SubLObject)module0376.ONE_INTEGER);
        final SubLObject var102 = module0365.f24850(var36);
        final SubLObject var103 = module0361.f24173(module0363.f24507(var102));
        if (module0376.NIL == var100) {
            return f26644(var102, var36, var15);
        }
        if (module0376.NIL != module0376.$g3193$.getDynamicValue(var101) && module0376.NIL == var103) {
            return f26645(var102, var36, var15, (SubLObject)module0376.NIL);
        }
        if (module0376.NIL != f26643()) {
            SubLObject var104 = (SubLObject)module0376.NIL;
            SubLObject var105 = var100;
            SubLObject var106 = (SubLObject)module0376.NIL;
            var106 = var105.first();
            while (module0376.NIL != var105) {
                SubLObject var21_121 = var106;
                SubLObject var107 = (SubLObject)module0376.NIL;
                var107 = var21_121.first();
                while (module0376.NIL != var21_121) {
                    var104 = (SubLObject)ConsesLow.cons(var107, var104);
                    var21_121 = var21_121.rest();
                    var107 = var21_121.first();
                }
                var105 = var105.rest();
                var106 = var105.first();
            }
            if (module0376.NIL == var15) {
                return f26645(var102, var36, var15, var104);
            }
            return f26646(var102, var36, var15, var104);
        }
        else {
            if (module0376.NIL == var15) {
                return f26647(var102, var36, var100);
            }
            return f26648(var102, var36, var15, var100);
        }
    }
    
    public static SubLObject f26644(final SubLObject var13, final SubLObject var36, final SubLObject var15) {
        final SubLObject var37 = module0381.f27128(var13, var15);
        return module0375.f26580(var13, var37, var15, (SubLObject)module0376.NIL, var36);
    }
    
    public static SubLObject f26648(final SubLObject var13, final SubLObject var36, final SubLObject var15, final SubLObject var100) {
        final SubLThread var101 = SubLProcess.currentSubLThread();
        final SubLObject var102 = module0381.f27128(var13, var15);
        final SubLObject var103 = module0364.f24736(var102);
        final SubLObject var104 = f26649(var100, var13, var15, var103);
        f26647(var103, var36, var104);
        final SubLObject var105 = module0375.f26580(var13, var102, var15, (SubLObject)module0376.NIL, var36);
        final SubLObject var106 = module0364.f24754(var105);
        if (module0376.NIL == Errors.$ignore_mustsP$.getDynamicValue(var101) && module0376.NIL == module0364.f24786(var106, var102)) {
            Errors.error((SubLObject)module0376.$ic44$, var106, var102);
        }
        return var105;
    }
    
    public static SubLObject f26649(final SubLObject var100, final SubLObject var27, final SubLObject var127, final SubLObject var124) {
        final SubLThread var128 = SubLProcess.currentSubLThread();
        final SubLObject var129 = module0363.f24580(var27);
        final SubLObject var130 = module0363.f24580(var124);
        final SubLObject var131 = module0233.f15362(var127, var129);
        if (var130.equal(var131)) {
            return var100;
        }
        SubLObject var132 = (SubLObject)module0376.NIL;
        SubLObject var133 = module0232.f15306(var130);
        SubLObject var134 = (SubLObject)module0376.NIL;
        var134 = var133.first();
        while (module0376.NIL != var133) {
            SubLObject var135 = (SubLObject)module0376.ZERO_INTEGER;
            SubLObject var136;
            SubLObject var137;
            SubLObject var138;
            SubLObject var139;
            for (var136 = (SubLObject)module0376.NIL, var137 = (SubLObject)module0376.NIL, var137 = module0232.f15306(var131); module0376.NIL == var136 && module0376.NIL != var137; var137 = var137.rest()) {
                var138 = var137.first();
                if (var138.equal(var134)) {
                    var139 = ConsesLow.nth(var135, var100);
                    var132 = (SubLObject)ConsesLow.cons(var139, var132);
                    var136 = (SubLObject)module0376.T;
                }
                var135 = Numbers.add(var135, (SubLObject)module0376.ONE_INTEGER);
            }
            for (var137 = (SubLObject)module0376.NIL, var137 = module0232.f15308(var131); module0376.NIL == var136 && module0376.NIL != var137; var137 = var137.rest()) {
                var138 = var137.first();
                if (var138.equal(var134)) {
                    var139 = ConsesLow.nth(var135, var100);
                    var132 = (SubLObject)ConsesLow.cons(var139, var132);
                    var136 = (SubLObject)module0376.T;
                }
                var135 = Numbers.add(var135, (SubLObject)module0376.ONE_INTEGER);
            }
            if (module0376.NIL == Errors.$ignore_mustsP$.getDynamicValue(var128) && module0376.NIL == var136) {
                Errors.error((SubLObject)module0376.$ic45$, var134);
            }
            var133 = var133.rest();
            var134 = var133.first();
        }
        var133 = module0232.f15308(var130);
        var134 = (SubLObject)module0376.NIL;
        var134 = var133.first();
        while (module0376.NIL != var133) {
            SubLObject var135 = (SubLObject)module0376.ZERO_INTEGER;
            SubLObject var136;
            SubLObject var137;
            SubLObject var138;
            SubLObject var139;
            for (var136 = (SubLObject)module0376.NIL, var137 = (SubLObject)module0376.NIL, var137 = module0232.f15306(var131); module0376.NIL == var136 && module0376.NIL != var137; var137 = var137.rest()) {
                var138 = var137.first();
                if (var138.equal(var134)) {
                    var139 = ConsesLow.nth(var135, var100);
                    var132 = (SubLObject)ConsesLow.cons(var139, var132);
                    var136 = (SubLObject)module0376.T;
                }
                var135 = Numbers.add(var135, (SubLObject)module0376.ONE_INTEGER);
            }
            for (var137 = (SubLObject)module0376.NIL, var137 = module0232.f15308(var131); module0376.NIL == var136 && module0376.NIL != var137; var137 = var137.rest()) {
                var138 = var137.first();
                if (var138.equal(var134)) {
                    var139 = ConsesLow.nth(var135, var100);
                    var132 = (SubLObject)ConsesLow.cons(var139, var132);
                    var136 = (SubLObject)module0376.T;
                }
                var135 = Numbers.add(var135, (SubLObject)module0376.ONE_INTEGER);
            }
            if (module0376.NIL == Errors.$ignore_mustsP$.getDynamicValue(var128) && module0376.NIL == var136) {
                Errors.error((SubLObject)module0376.$ic45$, var134);
            }
            var133 = var133.rest();
            var134 = var133.first();
        }
        var132 = Sequences.nreverse(var132);
        return var132;
    }
    
    public static SubLObject f26647(final SubLObject var13, final SubLObject var36, SubLObject var100) {
        final SubLObject var101 = module0363.f24580(var13);
        if (module0376.NIL != module0232.f15312(var101)) {
            f26645(var13, var36, (SubLObject)module0376.NIL, var100.first());
        }
        else {
            final SubLObject var102 = module0380.f26956(var13, var101);
            module0373.f26344(var102);
            SubLObject var103 = module0232.f15306(var101);
            SubLObject var104 = (SubLObject)module0376.NIL;
            var104 = var103.first();
            while (module0376.NIL != var103) {
                final SubLObject var105 = var100.first();
                var100 = var100.rest();
                f26650(var102, var36, var104, (SubLObject)module0376.$ic46$, var105);
                var103 = var103.rest();
                var104 = var103.first();
            }
            var103 = module0232.f15308(var101);
            var104 = (SubLObject)module0376.NIL;
            var104 = var103.first();
            while (module0376.NIL != var103) {
                final SubLObject var105 = var100.first();
                var100 = var100.rest();
                f26650(var102, var36, var104, (SubLObject)module0376.$ic47$, var105);
                var103 = var103.rest();
                var104 = var103.first();
            }
        }
        return (SubLObject)module0376.NIL;
    }
    
    public static SubLObject f26650(final SubLObject var28, final SubLObject var36, final SubLObject var136, final SubLObject var138, final SubLObject var137) {
        final SubLObject var139 = module0362.f24453(var136, var138);
        final SubLObject var140 = module0364.f24788(var28, var139);
        return f26645(var140, var36, (SubLObject)module0376.NIL, var137);
    }
    
    public static SubLObject f26651(final SubLObject var20, SubLObject var141) {
        if (var141 == module0376.UNPROVIDED) {
            var141 = (SubLObject)module0376.NIL;
        }
        SubLObject var142 = (SubLObject)module0376.NIL;
        final SubLObject var143 = module0361.f24128(var20);
        if (module0376.NIL == module0065.f4772(var143, (SubLObject)module0376.$ic38$)) {
            final SubLObject var81_143 = var143;
            if (module0376.NIL == module0065.f4775(var81_143, (SubLObject)module0376.$ic38$)) {
                final SubLObject var144 = module0065.f4740(var81_143);
                final SubLObject var145 = (SubLObject)module0376.NIL;
                SubLObject var146;
                SubLObject var147;
                SubLObject var148;
                SubLObject var149;
                SubLObject var150;
                SubLObject var151;
                SubLObject var152;
                for (var146 = Sequences.length(var144), var147 = (SubLObject)module0376.NIL, var147 = (SubLObject)module0376.ZERO_INTEGER; var147.numL(var146); var147 = Numbers.add(var147, (SubLObject)module0376.ONE_INTEGER)) {
                    var148 = ((module0376.NIL != var145) ? Numbers.subtract(var146, var147, (SubLObject)module0376.ONE_INTEGER) : var147);
                    var149 = Vectors.aref(var144, var148);
                    if (module0376.NIL == module0065.f4749(var149) || module0376.NIL == module0065.f4773((SubLObject)module0376.$ic38$)) {
                        if (module0376.NIL != module0065.f4749(var149)) {
                            var149 = (SubLObject)module0376.$ic38$;
                        }
                        for (var150 = (SubLObject)module0376.NIL, var151 = (SubLObject)module0376.NIL, var151 = module0363.f24517(var149); module0376.NIL == var150 && module0376.NIL != var151; var151 = var151.rest()) {
                            var152 = var151.first();
                            if (module0376.NIL != f26652(var152) && (module0376.NIL == var141 || module0376.NIL != module0035.f2169(var141, module0340.f22792(module0365.f24865(var152))))) {
                                var150 = var152;
                            }
                        }
                        if (module0376.NIL != var150) {
                            var142 = (SubLObject)ConsesLow.cons(var149, var142);
                        }
                    }
                }
            }
            final SubLObject var146_147 = var143;
            if (module0376.NIL == module0065.f4777(var146_147) || module0376.NIL == module0065.f4773((SubLObject)module0376.$ic38$)) {
                final SubLObject var153 = module0065.f4738(var146_147);
                SubLObject var154 = module0065.f4739(var146_147);
                final SubLObject var155 = module0065.f4734(var146_147);
                final SubLObject var156 = (SubLObject)((module0376.NIL != module0065.f4773((SubLObject)module0376.$ic38$)) ? module0376.NIL : module0376.$ic38$);
                while (var154.numL(var155)) {
                    final SubLObject var157 = Hashtables.gethash_without_values(var154, var153, var156);
                    if (module0376.NIL == module0065.f4773((SubLObject)module0376.$ic38$) || module0376.NIL == module0065.f4749(var157)) {
                        SubLObject var158;
                        SubLObject var159;
                        SubLObject var160;
                        for (var158 = (SubLObject)module0376.NIL, var159 = (SubLObject)module0376.NIL, var159 = module0363.f24517(var157); module0376.NIL == var158 && module0376.NIL != var159; var159 = var159.rest()) {
                            var160 = var159.first();
                            if (module0376.NIL != f26652(var160) && (module0376.NIL == var141 || module0376.NIL != module0035.f2169(var141, module0340.f22792(module0365.f24865(var160))))) {
                                var158 = var160;
                            }
                        }
                        if (module0376.NIL != var158) {
                            var142 = (SubLObject)ConsesLow.cons(var157, var142);
                        }
                    }
                    var154 = Numbers.add(var154, (SubLObject)module0376.ONE_INTEGER);
                }
            }
        }
        return Sequences.nreverse(var142);
    }
    
    public static SubLObject f26652(final SubLObject var36) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0376.NIL != f26620(var36) && (module0376.NIL != module0365.f24883(var36) || module0376.NIL != module0365.f24885(var36)) && module0376.NIL == module0375.f26586(var36) && module0376.NIL == module0521.f32623(var36));
    }
    
    public static SubLObject f26653(final SubLObject var151, final SubLObject var152) {
        SubLObject var154;
        final SubLObject var153 = var154 = var151.rest();
        SubLObject var155 = (SubLObject)module0376.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var154, var153, (SubLObject)module0376.$ic48$);
        var155 = var154.first();
        final SubLObject var156;
        var154 = (var156 = var154.rest());
        final SubLObject var157 = (SubLObject)module0376.$ic49$;
        return (SubLObject)ConsesLow.listS((SubLObject)module0376.$ic50$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var157, var155), (SubLObject)ConsesLow.list((SubLObject)module0376.$ic51$, (SubLObject)ConsesLow.list((SubLObject)module0376.$ic52$, var157))), ConsesLow.append(var156, (SubLObject)module0376.NIL));
    }
    
    public static SubLObject f26621(final SubLObject var35) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0376.NIL != module0365.f24819(var35) && module0376.$ic53$ == module0365.f24866(var35));
    }
    
    public static SubLObject f26654(final SubLObject var36, final SubLObject var90) {
        return f26655(var36, var90);
    }
    
    public static SubLObject f26613(final SubLObject var35) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0376.NIL != module0364.f24699(var35) && module0376.$ic25$ == module0364.f24721(var35));
    }
    
    public static SubLObject f26619(final SubLObject var35) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0376.NIL != module0365.f24819(var35) && module0376.$ic25$ == module0365.f24866(var35));
    }
    
    public static SubLObject f26656(final SubLObject var35) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0376.NIL != module0366.f24916(var35) && module0376.NIL != f26613(module0366.f24937(var35)));
    }
    
    public static SubLObject f26657(final SubLObject var157, final SubLObject var158, final SubLObject var138) {
        return module0112.f7696(var157, var158, var138);
    }
    
    public static SubLObject f26658(final SubLObject var157, final SubLObject var158, final SubLObject var138) {
        if (var157.eql((SubLObject)module0376.$ic54$)) {
            return module0451.f31038(var158, var138);
        }
        if (var157.eql((SubLObject)module0376.$ic55$)) {
            return module0451.f31037(var158, var138);
        }
        if (var157.eql((SubLObject)module0376.$ic56$)) {
            return module0450.f31024(var158, var138);
        }
        if (var157.eql((SubLObject)module0376.$ic57$)) {
            return module0481.f31832(var158, var138);
        }
        if (var157.eql((SubLObject)module0376.$ic58$)) {
            return module0481.f31826(var158, var138);
        }
        if (var157.eql((SubLObject)module0376.$ic59$)) {
            return module0453.f31071(var158, var138);
        }
        if (var157.eql((SubLObject)module0376.$ic60$)) {
            return module0499.f32211(var158, var138);
        }
        if (var157.eql((SubLObject)module0376.$ic61$)) {
            return module0499.f32213(var158, var138);
        }
        return module0112.f7696(var157, var158, var138);
    }
    
    public static SubLObject f26659(final SubLObject var157, final SubLObject var158, final SubLObject var138) {
        if (var157.eql((SubLObject)module0376.$ic62$)) {
            return module0479.f31736(var158, var138);
        }
        if (var157.eql((SubLObject)module0376.$ic63$)) {
            return module0438.f30667(var158, var138);
        }
        if (var157.eql((SubLObject)module0376.$ic64$)) {
            return module0466.f31515(var158, var138);
        }
        if (var157.eql((SubLObject)module0376.$ic65$)) {
            return module0453.f31059(var158, var138);
        }
        if (var157.eql((SubLObject)module0376.$ic66$)) {
            return module0453.f31057(var158, var138);
        }
        if (var157.eql((SubLObject)module0376.$ic67$)) {
            return module0462.f31440(var158, var138);
        }
        if (var157.eql((SubLObject)module0376.$ic68$)) {
            return module0461.f31408(var158, var138);
        }
        if (var157.eql((SubLObject)module0376.$ic69$)) {
            return module0462.f31427(var158, var138);
        }
        if (var157.eql((SubLObject)module0376.$ic70$)) {
            return module0461.f31415(var158, var138);
        }
        if (var157.eql((SubLObject)module0376.$ic71$)) {
            return module0442.f30741(var158, var138);
        }
        if (var157.eql((SubLObject)module0376.$ic72$)) {
            return module0499.f32212(var158, var138);
        }
        return module0112.f7696(var157, var158, var138);
    }
    
    public static SubLObject f26660(final SubLObject var13, final SubLObject var158, final SubLObject var138) {
        final SubLThread var159 = SubLProcess.currentSubLThread();
        if (module0376.NIL == module0361.f24163(module0363.f24507(var13))) {
            return (SubLObject)module0376.NIL;
        }
        final SubLObject var160 = module0363.f24507(var13);
        final SubLObject var161 = (SubLObject)module0376.NIL;
        final SubLObject var162 = var160;
        final SubLObject var163 = module0018.$g646$.currentBinding(var159);
        try {
            module0018.$g646$.bind(module0361.f24166(var162), var159);
            f26661(var13, var158, var138);
            f26662(var13, var158, var138);
        }
        finally {
            module0018.$g646$.rebind(var163, var159);
        }
        return var161;
    }
    
    public static SubLObject f26662(final SubLObject var13, final SubLObject var158, final SubLObject var138) {
        final SubLObject var159 = f26663(var158, var138);
        return f26664(var159, var13, var158, var138);
    }
    
    public static SubLObject f26661(final SubLObject var13, final SubLObject var158, final SubLObject var138) {
        final SubLObject var159 = f26665(var158, var138);
        return f26664(var159, var13, var158, var138);
    }
    
    public static SubLObject f26666(final SubLObject var158, final SubLObject var138, SubLObject var69) {
        if (var69 == module0376.UNPROVIDED) {
            var69 = (SubLObject)module0376.$ic36$;
        }
        final SubLObject var159 = f26667(var158, var138, var69);
        return f26668(var159, var158, var138);
    }
    
    public static SubLObject f26667(final SubLObject var158, final SubLObject var138, final SubLObject var69) {
        final SubLObject var159 = f26669(var158, var138, var69);
        return f26670(var159, var69);
    }
    
    public static SubLObject f26670(final SubLObject var161, final SubLObject var69) {
        SubLObject var162 = (SubLObject)module0376.NIL;
        if (var69 == module0376.$ic36$) {
            var162 = var161;
        }
        else {
            SubLObject var163 = var161;
            SubLObject var164 = (SubLObject)module0376.NIL;
            var164 = var163.first();
            while (module0376.NIL != var163) {
                if (module0376.NIL != module0340.f22790(var164, var69) || module0376.NIL != module0340.f22882(var164)) {
                    var162 = (SubLObject)ConsesLow.cons(var164, var162);
                }
                var163 = var163.rest();
                var164 = var163.first();
            }
            var162 = Sequences.nreverse(var162);
        }
        return var162;
    }
    
    public static SubLObject f26669(final SubLObject var158, final SubLObject var138, final SubLObject var69) {
        if (var69 == module0376.$ic36$) {
            return f26665(var158, var138);
        }
        if (module0376.NIL != module0340.f22794(var69)) {
            return module0340.f22795(var69);
        }
        return f26665(var158, var138);
    }
    
    public static SubLObject f26671(final SubLObject var14, final SubLObject var158) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0376.NIL != module0340.f22878(var14, module0205.f13333(var158)) && module0376.NIL != module0340.f22881(var14, var158) && module0376.NIL != module0340.f22852(var14, var158) && module0376.NIL != module0340.f22856(var14) && module0376.NIL != module0340.f22885(var14));
    }
    
    public static SubLObject f26664(final SubLObject var49, final SubLObject var13, final SubLObject var158, final SubLObject var138) {
        SubLObject var160;
        final SubLObject var159 = var160 = f26668(var49, var158, var138);
        SubLObject var161 = (SubLObject)module0376.NIL;
        var161 = var160.first();
        while (module0376.NIL != var160) {
            SubLObject var163;
            final SubLObject var162 = var163 = var161;
            SubLObject var164 = (SubLObject)module0376.NIL;
            SubLObject var165 = (SubLObject)module0376.NIL;
            SubLObject var166 = (SubLObject)module0376.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var163, var162, (SubLObject)module0376.$ic34$);
            var164 = var163.first();
            var163 = var163.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var163, var162, (SubLObject)module0376.$ic34$);
            var165 = var163.first();
            var163 = var163.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var163, var162, (SubLObject)module0376.$ic34$);
            var166 = var163.first();
            var163 = var163.rest();
            if (module0376.NIL == var163) {
                f26672(var13, var164, var165, var166);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var162, (SubLObject)module0376.$ic34$);
            }
            var160 = var160.rest();
            var161 = var160.first();
        }
        return var159;
    }
    
    public static SubLObject f26668(final SubLObject var49, final SubLObject var158, final SubLObject var138) {
        return f26673((SubLObject)module0376.$ic73$, var49, var158, var138, (SubLObject)module0376.UNPROVIDED, (SubLObject)module0376.UNPROVIDED);
    }
    
    public static SubLObject f26674(final SubLObject var161, final SubLObject var158, final SubLObject var138) {
        final SubLObject var162 = f26675(var161, var158, var138);
        final SubLObject var163 = f26676(var162, var158, var138);
        return var163;
    }
    
    public static SubLObject f26675(final SubLObject var161, final SubLObject var158, final SubLObject var138) {
        final SubLThread var162 = SubLProcess.currentSubLThread();
        SubLObject var163 = (SubLObject)module0376.NIL;
        SubLObject var164 = (SubLObject)module0376.NIL;
        SubLObject var165 = (SubLObject)module0376.NIL;
        if (module0376.NIL == var165) {
            SubLObject var166 = var161;
            SubLObject var167 = (SubLObject)module0376.NIL;
            var167 = var166.first();
            while (module0376.NIL == var165 && module0376.NIL != var166) {
                if (module0376.NIL == module0340.f22882(var167)) {
                    var162.resetMultipleValues();
                    final SubLObject var167_168 = f26677(var167, var158, var138, var164, var163);
                    final SubLObject var169_170 = var162.secondMultipleValue();
                    final SubLObject var171_172 = var162.thirdMultipleValue();
                    var162.resetMultipleValues();
                    var165 = var167_168;
                    var164 = var169_170;
                    var163 = var171_172;
                }
                var166 = var166.rest();
                var167 = var166.first();
            }
        }
        if (module0376.NIL == var165) {
            SubLObject var166 = var161;
            SubLObject var167 = (SubLObject)module0376.NIL;
            var167 = var166.first();
            while (module0376.NIL == var165 && module0376.NIL != var166) {
                if (module0376.NIL != module0340.f22882(var167)) {
                    var162.resetMultipleValues();
                    final SubLObject var173_174 = f26677(var167, var158, var138, var164, var163);
                    final SubLObject var175_176 = var162.secondMultipleValue();
                    final SubLObject var177_178 = var162.thirdMultipleValue();
                    var162.resetMultipleValues();
                    var165 = var173_174;
                    var164 = var175_176;
                    var163 = var177_178;
                }
                var166 = var166.rest();
                var167 = var166.first();
            }
        }
        return var164;
    }
    
    public static SubLObject f26677(final SubLObject var14, final SubLObject var158, final SubLObject var138, SubLObject var165, SubLObject var41) {
        final SubLThread var166 = SubLProcess.currentSubLThread();
        SubLObject var167 = (SubLObject)module0376.NIL;
        if ((module0376.NIL == var41 || module0376.NIL == module0035.f2169(var14, var41)) && module0376.NIL != f26671(var14, var158)) {
            final SubLObject var168 = module0340.f22882(var14);
            if (module0376.NIL == var168 || (module0376.NIL != module0112.f7693(var168) && module0376.NIL != f26657(var168, var158, var138))) {
                if (module0376.NIL != var168) {
                    var166.resetMultipleValues();
                    final SubLObject var179_180 = f26678(var14, var165, var41);
                    final SubLObject var181_182 = var166.secondMultipleValue();
                    final SubLObject var183_184 = var166.thirdMultipleValue();
                    var166.resetMultipleValues();
                    var167 = var179_180;
                    var165 = var181_182;
                    var41 = var183_184;
                }
                final SubLObject var169 = module0340.f22857(var14);
                if (module0376.NIL == var169 || (module0376.NIL != module0112.f7693(var169) && module0376.NIL != f26658(var169, var158, var138))) {
                    var165 = (SubLObject)ConsesLow.cons(var14, var165);
                }
            }
        }
        return Values.values(var167, var165, var41);
    }
    
    public static SubLObject f26678(final SubLObject var14, SubLObject var165, SubLObject var41) {
        final SubLObject var166 = module0340.f22883(var14);
        SubLObject var167 = (SubLObject)module0376.NIL;
        final SubLObject var168 = var166;
        if (var168.eql((SubLObject)module0376.$ic36$)) {
            var165 = (SubLObject)module0376.NIL;
            var167 = (SubLObject)module0376.T;
        }
        else {
            SubLObject var170;
            final SubLObject var169 = var170 = var166;
            SubLObject var171 = (SubLObject)module0376.NIL;
            var171 = var170.first();
            while (module0376.NIL != var170) {
                if (var171.isCons()) {
                    SubLObject var172 = (SubLObject)ConsesLow.list(var171);
                    SubLObject var173 = (SubLObject)module0376.NIL;
                    SubLObject var174 = (SubLObject)module0376.NIL;
                    while (module0376.NIL != var172) {
                        var174 = var172.first();
                        var172 = var172.rest();
                        final SubLObject var175 = var174.first();
                        final SubLObject var176 = var174.rest();
                        final SubLObject var10_193 = var175;
                        if (var10_193.eql((SubLObject)module0376.$ic74$)) {
                            var173 = (SubLObject)SubLObjectFactory.makeBoolean(module0376.NIL == var173);
                            var172 = (SubLObject)ConsesLow.cons(var176.first(), var172);
                        }
                        else {
                            if (!var10_193.eql((SubLObject)module0376.$ic75$)) {
                                continue;
                            }
                            final SubLObject var177 = var176.first();
                            SubLObject var21_196;
                            final SubLObject var178 = var21_196 = var165;
                            SubLObject var179 = (SubLObject)module0376.NIL;
                            var179 = var21_196.first();
                            while (module0376.NIL != var21_196) {
                                if ((module0376.NIL == var173 && module0376.NIL != module0035.f2169(var177, module0340.f22792(var179))) || (module0376.NIL != var173 && module0376.NIL == module0035.f2169(var177, module0340.f22792(var179)))) {
                                    var165 = module0035.f2073(var179, var165, Symbols.symbol_function((SubLObject)module0376.EQ));
                                }
                                var21_196 = var21_196.rest();
                                var179 = var21_196.first();
                            }
                        }
                    }
                }
                else {
                    final SubLObject var181;
                    final SubLObject var180 = var181 = module0340.f22786(var171);
                    if (module0376.NIL == conses_high.member(var181, var41, Symbols.symbol_function((SubLObject)module0376.EQ), Symbols.symbol_function((SubLObject)module0376.IDENTITY))) {
                        var41 = (SubLObject)ConsesLow.cons(var181, var41);
                    }
                    if (module0376.NIL != module0035.f2169(var180, var165)) {
                        var165 = module0035.f2073(var180, var165, Symbols.symbol_function((SubLObject)module0376.EQ));
                    }
                }
                var170 = var170.rest();
                var171 = var170.first();
            }
        }
        return Values.values(var167, var165, var41);
    }
    
    public static SubLObject f26627(final SubLObject var14, SubLObject var198, SubLObject var199) {
        final SubLObject var200 = module0340.f22883(var14);
        SubLObject var201 = (SubLObject)module0376.NIL;
        final SubLObject var202 = var200;
        if (var202.eql((SubLObject)module0376.$ic36$)) {
            var198 = (SubLObject)module0376.NIL;
            var201 = (SubLObject)module0376.T;
        }
        else {
            SubLObject var204;
            final SubLObject var203 = var204 = var200;
            SubLObject var205 = (SubLObject)module0376.NIL;
            var205 = var204.first();
            while (module0376.NIL != var204) {
                final SubLObject var206 = module0340.f22786(var205);
                var199 = (SubLObject)ConsesLow.cons(var206, var199);
                SubLObject var207 = Sequences.find(var206, var198, Symbols.symbol_function((SubLObject)module0376.EQ), Symbols.symbol_function((SubLObject)module0376.$ic76$), (SubLObject)module0376.UNPROVIDED, (SubLObject)module0376.UNPROVIDED);
                if (module0376.NIL != var207) {
                    var198 = module0035.f2073(var207, var198, Symbols.symbol_function((SubLObject)module0376.EQUAL));
                    var207 = (SubLObject)module0376.NIL;
                }
                var204 = var204.rest();
                var205 = var204.first();
            }
        }
        return Values.values(var201, var198, var199);
    }
    
    public static SubLObject f26676(final SubLObject var165, final SubLObject var158, final SubLObject var138) {
        final SubLThread var166 = SubLProcess.currentSubLThread();
        SubLObject var167 = (SubLObject)module0376.NIL;
        SubLObject var168 = var165;
        SubLObject var169 = (SubLObject)module0376.NIL;
        var169 = var168.first();
        while (module0376.NIL != var168) {
            final SubLObject var170 = module0340.f22861(var169, var158, var138);
            if (module0376.NIL != var170) {
                if (module0376.NIL != module0018.$g663$.getDynamicValue(var166) && module0376.NIL != module0193.f12105(var158) && var170.numG(module0018.$g663$.getDynamicValue(var166))) {
                    Errors.error((SubLObject)module0376.$ic77$, var158, var169, var170);
                }
                final SubLObject var171 = module0360.f23935(var170);
                final SubLObject var172 = module0340.f22906(var169, var158, (SubLObject)module0376.UNPROVIDED);
                final SubLObject var173 = (SubLObject)ConsesLow.list(var169, var171, var172);
                var167 = (SubLObject)ConsesLow.cons(var173, var167);
            }
            var168 = var168.rest();
            var169 = var168.first();
        }
        return var167;
    }
    
    public static SubLObject f26665(final SubLObject var158, final SubLObject var138) {
        final SubLObject var159 = module0205.f13333(var158);
        if (module0376.NIL != module0173.f10955(var159)) {
            return f26679(var159, var138);
        }
        return module0340.f22919(var138);
    }
    
    public static SubLObject f26679(final SubLObject var75, final SubLObject var138) {
        final SubLObject var139 = module0339.f22757();
        if (module0376.NIL != var139 && module0376.NIL != module0369.f25514(var139)) {
            final SubLObject var140 = module0369.f25511(var139);
            return f26680(var75, var138, var140);
        }
        return f26680(var75, var138, (SubLObject)module0376.$ic36$);
    }
    
    public static SubLObject f26681(final SubLObject var75, final SubLObject var138, final SubLObject var69) {
        final SubLObject var139 = module0340.f22930(var75, var138);
        final SubLObject var140 = module0340.f22931(var75, var138);
        SubLObject var141 = (SubLObject)module0376.NIL;
        if (module0376.NIL != module0340.f22940(var75)) {
            var141 = ConsesLow.nconc(var139, var140);
        }
        else {
            var141 = ConsesLow.nconc(var139, module0340.f22919(var138), var140);
        }
        var141 = f26670(var141, var69);
        return var141;
    }
    
    public static SubLObject f26680(final SubLObject var75, final SubLObject var138, final SubLObject var69) {
        final SubLThread var139 = SubLProcess.currentSubLThread();
        final SubLObject var140 = module0034.$g879$.getDynamicValue(var139);
        SubLObject var141 = (SubLObject)module0376.NIL;
        if (module0376.NIL == var140) {
            return f26681(var75, var138, var69);
        }
        var141 = module0034.f1857(var140, (SubLObject)module0376.$ic78$, (SubLObject)module0376.UNPROVIDED);
        if (module0376.NIL == var141) {
            var141 = module0034.f1807(module0034.f1842(var140), (SubLObject)module0376.$ic78$, (SubLObject)module0376.THREE_INTEGER, (SubLObject)module0376.NIL, (SubLObject)module0376.EQL, (SubLObject)module0376.UNPROVIDED);
            module0034.f1860(var140, (SubLObject)module0376.$ic78$, var141);
        }
        final SubLObject var142 = module0034.f1781(var75, var138, var69);
        final SubLObject var143 = module0034.f1814(var141, var142, (SubLObject)module0376.UNPROVIDED);
        if (var143 != module0376.$ic79$) {
            SubLObject var144 = var143;
            SubLObject var145 = (SubLObject)module0376.NIL;
            var145 = var144.first();
            while (module0376.NIL != var144) {
                SubLObject var146 = var145.first();
                final SubLObject var147 = conses_high.second(var145);
                if (var75.eql(var146.first())) {
                    var146 = var146.rest();
                    if (var138.eql(var146.first())) {
                        var146 = var146.rest();
                        if (module0376.NIL != var146 && module0376.NIL == var146.rest() && var69.eql(var146.first())) {
                            return module0034.f1959(var147);
                        }
                    }
                }
                var144 = var144.rest();
                var145 = var144.first();
            }
        }
        final SubLObject var148 = Values.arg2(var139.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f26681(var75, var138, var69)));
        module0034.f1836(var141, var142, var143, var148, (SubLObject)ConsesLow.list(var75, var138, var69));
        return module0034.f1959(var148);
    }
    
    public static SubLObject f26663(final SubLObject var158, final SubLObject var138) {
        if (var138 == module0376.$ic46$) {
            return (SubLObject)module0376.NIL;
        }
        final SubLObject var159 = module0205.f13333(var158);
        if (module0376.NIL != module0173.f10955(var159)) {
            return f26682(var159);
        }
        return module0340.f22966();
    }
    
    public static SubLObject f26683(final SubLObject var75) {
        SubLObject var76 = (SubLObject)module0376.NIL;
        SubLObject var77 = module0340.f22965();
        SubLObject var78 = (SubLObject)module0376.NIL;
        var78 = var77.first();
        while (module0376.NIL != var77) {
            if (module0376.NIL != module0340.f22971(var75, var78)) {
                var76 = (SubLObject)ConsesLow.cons(var78, var76);
            }
            var77 = var77.rest();
            var78 = var77.first();
        }
        return Sequences.nreverse(var76);
    }
    
    public static SubLObject f26682(final SubLObject var75) {
        final SubLThread var76 = SubLProcess.currentSubLThread();
        final SubLObject var77 = module0034.$g879$.getDynamicValue(var76);
        SubLObject var78 = (SubLObject)module0376.NIL;
        if (module0376.NIL == var77) {
            return f26683(var75);
        }
        var78 = module0034.f1857(var77, (SubLObject)module0376.$ic80$, (SubLObject)module0376.UNPROVIDED);
        if (module0376.NIL == var78) {
            var78 = module0034.f1807(module0034.f1842(var77), (SubLObject)module0376.$ic80$, (SubLObject)module0376.ONE_INTEGER, (SubLObject)module0376.NIL, (SubLObject)module0376.EQUAL, (SubLObject)module0376.UNPROVIDED);
            module0034.f1860(var77, (SubLObject)module0376.$ic80$, var78);
        }
        SubLObject var79 = module0034.f1814(var78, var75, (SubLObject)module0376.$ic79$);
        if (var79 == module0376.$ic79$) {
            var79 = Values.arg2(var76.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f26683(var75)));
            module0034.f1816(var78, var75, var79, (SubLObject)module0376.UNPROVIDED);
        }
        return module0034.f1959(var79);
    }
    
    public static SubLObject f26684(final SubLObject var36) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0376.NIL != f26619(var36) && module0376.NIL != module0373.f26144(var36));
    }
    
    public static SubLObject f26685(final SubLObject var36) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0376.NIL != f26621(var36) && module0376.NIL != module0373.f26144(var36));
    }
    
    public static SubLObject f26672(final SubLObject var13, final SubLObject var14, final SubLObject var59, final SubLObject var60) {
        final SubLObject var61 = module0365.f24854(var13, var14, (SubLObject)module0376.UNPROVIDED);
        module0365.f24874(var61, var59, (SubLObject)module0376.UNPROVIDED);
        module0365.f24872(var61, var60);
        final SubLObject var62 = module0363.f24507(var13);
        final SubLObject var63 = module0361.f24123(var62);
        if (module0376.NIL == module0065.f4772(var63, (SubLObject)module0376.$ic38$)) {
            final SubLObject var81_221 = var63;
            if (module0376.NIL == module0065.f4775(var81_221, (SubLObject)module0376.$ic38$)) {
                final SubLObject var64 = module0065.f4740(var81_221);
                final SubLObject var65 = (SubLObject)module0376.NIL;
                SubLObject var66;
                SubLObject var67;
                SubLObject var68;
                SubLObject var69;
                SubLObject var70;
                SubLObject var71;
                SubLObject var72;
                SubLObject var73;
                SubLObject var74;
                for (var66 = Sequences.length(var64), var67 = (SubLObject)module0376.NIL, var67 = (SubLObject)module0376.ZERO_INTEGER; var67.numL(var66); var67 = Numbers.add(var67, (SubLObject)module0376.ONE_INTEGER)) {
                    var68 = ((module0376.NIL != var65) ? Numbers.subtract(var66, var67, (SubLObject)module0376.ONE_INTEGER) : var67);
                    var69 = Vectors.aref(var64, var68);
                    if (module0376.NIL == module0065.f4749(var69) || module0376.NIL == module0065.f4773((SubLObject)module0376.$ic38$)) {
                        if (module0376.NIL != module0065.f4749(var69)) {
                            var69 = (SubLObject)module0376.$ic38$;
                        }
                        if (module0376.NIL != module0363.f24547(var13, var69)) {
                            var70 = var69;
                            var71 = module0077.f5333(module0369.f25473(var70));
                            for (var72 = module0032.f1741(var71), var73 = (SubLObject)module0376.NIL, var73 = module0032.f1742(var72, var71); module0376.NIL == module0032.f1744(var72, var73); var73 = module0032.f1743(var73)) {
                                var74 = module0032.f1745(var72, var73);
                                if (module0376.NIL != module0032.f1746(var73, var74)) {
                                    module0387.f27563(var74, var61);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject var91_222 = var63;
            if (module0376.NIL == module0065.f4777(var91_222)) {
                final SubLObject var75 = module0065.f4738(var91_222);
                SubLObject var76 = (SubLObject)module0376.NIL;
                SubLObject var77 = (SubLObject)module0376.NIL;
                final Iterator var78 = Hashtables.getEntrySetIterator(var75);
                try {
                    while (Hashtables.iteratorHasNext(var78)) {
                        final Map.Entry var79 = Hashtables.iteratorNextEntry(var78);
                        var76 = Hashtables.getEntryKey(var79);
                        var77 = Hashtables.getEntryValue(var79);
                        if (module0376.NIL != module0363.f24547(var13, var77)) {
                            final SubLObject var80 = var77;
                            final SubLObject var81 = module0077.f5333(module0369.f25473(var80));
                            SubLObject var82;
                            SubLObject var83;
                            SubLObject var84;
                            for (var82 = module0032.f1741(var81), var83 = (SubLObject)module0376.NIL, var83 = module0032.f1742(var82, var81); module0376.NIL == module0032.f1744(var82, var83); var83 = module0032.f1743(var83)) {
                                var84 = module0032.f1745(var82, var83);
                                if (module0376.NIL != module0032.f1746(var83, var84)) {
                                    module0387.f27563(var84, var61);
                                }
                            }
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var78);
                }
            }
        }
        return var61;
    }
    
    public static SubLObject f26655(final SubLObject var36, final SubLObject var90) {
        return var36;
    }
    
    public static SubLObject f26686(final SubLObject var151, final SubLObject var152) {
        SubLObject var154;
        final SubLObject var153 = var154 = var151.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var154, var153, (SubLObject)module0376.$ic81$);
        final SubLObject var155 = var154.rest();
        var154 = var154.first();
        SubLObject var156 = (SubLObject)module0376.NIL;
        SubLObject var157 = (SubLObject)module0376.NIL;
        SubLObject var158 = (SubLObject)module0376.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var154, var153, (SubLObject)module0376.$ic81$);
        var156 = var154.first();
        var154 = var154.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var154, var153, (SubLObject)module0376.$ic81$);
        var157 = var154.first();
        var154 = var154.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var154, var153, (SubLObject)module0376.$ic81$);
        var158 = var154.first();
        var154 = var154.rest();
        if (module0376.NIL == var154) {
            final SubLObject var159;
            var154 = (var159 = var155);
            final SubLObject var160 = (SubLObject)module0376.$ic82$;
            return (SubLObject)ConsesLow.list((SubLObject)module0376.$ic50$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var160, var156)), (SubLObject)ConsesLow.list((SubLObject)module0376.$ic83$, var157, (SubLObject)ConsesLow.list((SubLObject)module0376.$ic50$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0376.$ic84$, (SubLObject)ConsesLow.list((SubLObject)module0376.$ic85$, var160)), (SubLObject)ConsesLow.list((SubLObject)module0376.$ic86$, var158)), (SubLObject)ConsesLow.listS((SubLObject)module0376.$ic87$, (SubLObject)ConsesLow.list((SubLObject)module0376.$ic88$, var160), ConsesLow.append(var159, (SubLObject)module0376.NIL)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var153, (SubLObject)module0376.$ic81$);
        return (SubLObject)module0376.NIL;
    }
    
    public static SubLObject f26687(final SubLObject var36, final SubLObject var226, final SubLObject var158, final SubLObject var138) {
        final SubLThread var227 = SubLProcess.currentSubLThread();
        final SubLObject var228 = module0147.f9540(var226);
        final SubLObject var229 = module0147.$g2095$.currentBinding(var227);
        final SubLObject var230 = module0147.$g2094$.currentBinding(var227);
        final SubLObject var231 = module0147.$g2096$.currentBinding(var227);
        final SubLObject var232 = module0347.$g2969$.currentBinding(var227);
        final SubLObject var233 = module0347.$g2970$.currentBinding(var227);
        try {
            module0147.$g2095$.bind(module0147.f9545(var228), var227);
            module0147.$g2094$.bind(module0147.f9546(var228), var227);
            module0147.$g2096$.bind(module0147.f9549(var228), var227);
            module0347.$g2969$.bind(module0365.f24865(var36), var227);
            module0347.$g2970$.bind(var138, var227);
            final SubLObject var234 = module0365.f24879(var36);
            final SubLObject var46_231 = module0018.$g646$.currentBinding(var227);
            try {
                module0018.$g646$.bind(module0361.f24166(var234), var227);
                if (module0376.NIL != module0365.f24883(var36)) {
                    module0365.f24897(var36);
                }
                else {
                    final SubLObject var235 = f26688(var36, var158, var138);
                    if (module0376.NIL != var235) {
                        if (var235.isList()) {
                            SubLObject var236 = var235;
                            SubLObject var237 = (SubLObject)module0376.NIL;
                            var237 = var236.first();
                            while (module0376.NIL != var236) {
                                f26689(var36, var237);
                                var236 = var236.rest();
                                var237 = var236.first();
                            }
                        }
                        else {
                            module0365.f24896(var36, var235);
                        }
                    }
                }
            }
            finally {
                module0018.$g646$.rebind(var46_231, var227);
            }
        }
        finally {
            module0347.$g2970$.rebind(var233, var227);
            module0347.$g2969$.rebind(var232, var227);
            module0147.$g2096$.rebind(var231, var227);
            module0147.$g2094$.rebind(var230, var227);
            module0147.$g2095$.rebind(var229, var227);
        }
        return var36;
    }
    
    public static SubLObject f26688(final SubLObject var36, final SubLObject var158, final SubLObject var138) {
        if (module0376.NIL != module0340.f22890(module0365.f24865(var36))) {
            return f26690(var36, var158);
        }
        return f26691(var36, var158, var138);
    }
    
    public static SubLObject f26690(final SubLObject var36, final SubLObject var232) {
        final SubLThread var233 = SubLProcess.currentSubLThread();
        final SubLObject var234 = module0365.f24865(var36);
        var233.resetMultipleValues();
        final SubLObject var235 = f26692(var234, var232);
        final SubLObject var236 = var233.secondMultipleValue();
        var233.resetMultipleValues();
        if (module0376.NIL != var235) {
            module0365.f24898(var36, var235);
            return f26693(var36, var235, var236);
        }
        return (SubLObject)module0376.NIL;
    }
    
    public static SubLObject f26693(final SubLObject var36, final SubLObject var103, final SubLObject var233) {
        return module0365.f24906((SubLObject)module0376.$ic89$, var36, (SubLObject)ConsesLow.list(var103, var233));
    }
    
    public static SubLObject f26694(final SubLObject var234, final SubLObject var103, final SubLObject var233) {
        final SubLThread var235 = SubLProcess.currentSubLThread();
        SubLObject var236 = (SubLObject)module0376.NIL;
        final SubLObject var237 = module0365.f24865(var234);
        final SubLObject var238 = module0365.f24850(var234);
        final SubLObject var239 = module0363.f24564(var238);
        var235.resetMultipleValues();
        final SubLObject var240 = module0052.f3693(var103);
        final SubLObject var241 = var235.secondMultipleValue();
        var235.resetMultipleValues();
        if (module0376.NIL != var241) {
            final SubLObject var242 = module0347.$g2965$.currentBinding(var235);
            try {
                module0347.$g2965$.bind((SubLObject)module0376.$ic90$, var235);
                module0365.f24892(var234, (SubLObject)module0376.UNPROVIDED);
                var236 = f26695(var239, var237, var240, var233);
            }
            finally {
                module0347.$g2965$.rebind(var242, var235);
            }
        }
        return var236;
    }
    
    public static SubLObject f26696(SubLObject var15, final SubLObject var16) {
        var15 = module0233.f15392(var15);
        final SubLObject var17 = module0373.f26105();
        return f26697(var17, var15, var16);
    }
    
    public static SubLObject f26691(final SubLObject var36, final SubLObject var158, final SubLObject var138) {
        final SubLThread var159 = SubLProcess.currentSubLThread();
        SubLObject var160 = f26673((SubLObject)module0376.$ic91$, var36, var158, var138, (SubLObject)module0376.UNPROVIDED, (SubLObject)module0376.UNPROVIDED);
        final SubLObject var161 = module0360.f23935(Sequences.length(var160));
        module0365.f24891(var36, var161);
        if (module0376.NIL != module0035.f2000(var160, module0376.$g3191$.getDynamicValue(var159), (SubLObject)module0376.UNPROVIDED)) {
            var160 = f26698(var36, var160);
        }
        return var160;
    }
    
    public static SubLObject f26699(final SubLObject var36, final SubLObject var158, final SubLObject var138) {
        final SubLThread var159 = SubLProcess.currentSubLThread();
        SubLObject var160 = (SubLObject)module0376.NIL;
        final SubLObject var161 = module0376.$g3194$.currentBinding(var159);
        try {
            module0376.$g3194$.bind((SubLObject)module0376.NIL, var159);
            final SubLObject var46_235 = module0347.$g2965$.currentBinding(var159);
            try {
                module0347.$g2965$.bind((SubLObject)module0376.$ic92$, var159);
                final SubLObject var162 = module0365.f24865(var36);
                final SubLObject var163 = module0340.f22875(var162);
                if (module0376.NIL != var163) {
                    module0337.f22649(var163, var158, (SubLObject)module0376.UNPROVIDED);
                }
                else {
                    final SubLObject var164 = module0340.f22873(var162);
                    if (module0376.NIL != module0112.f7693(var164)) {
                        f26659(var164, var158, var138);
                    }
                }
            }
            finally {
                module0347.$g2965$.rebind(var46_235, var159);
            }
            if (module0376.NIL != module0376.$g3194$.getDynamicValue(var159)) {
                var160 = Sequences.nreverse(module0376.$g3194$.getDynamicValue(var159));
            }
        }
        finally {
            module0376.$g3194$.rebind(var161, var159);
        }
        return var160;
    }
    
    public static SubLObject f26700(SubLObject var15, final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        var15 = module0233.f15392(var15);
        module0376.$g3194$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var15, var16), module0376.$g3194$.getDynamicValue(var17)), var17);
        return (SubLObject)module0376.NIL;
    }
    
    public static SubLObject f26698(final SubLObject var36, final SubLObject var111) {
        return module0365.f24906((SubLObject)module0376.$ic93$, var36, var111);
    }
    
    public static SubLObject f26689(final SubLObject var234, final SubLObject var114) {
        SubLObject var235 = (SubLObject)module0376.NIL;
        SubLObject var236 = (SubLObject)module0376.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var114, var114, (SubLObject)module0376.$ic94$);
        var235 = var114.first();
        SubLObject var237 = var114.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var237, var114, (SubLObject)module0376.$ic94$);
        var236 = var237.first();
        var237 = var237.rest();
        if (module0376.NIL == var237) {
            module0365.f24892(var234, (SubLObject)module0376.UNPROVIDED);
            return f26697(var234, var235, var236);
        }
        cdestructuring_bind.cdestructuring_bind_error(var114, (SubLObject)module0376.$ic94$);
        return (SubLObject)module0376.NIL;
    }
    
    public static SubLObject f26697(final SubLObject var234, final SubLObject var15, SubLObject var16) {
        final SubLThread var235 = SubLProcess.currentSubLThread();
        final SubLObject var236 = module0365.f24850(var234);
        final SubLObject var237 = module0363.f24507(var236);
        SubLObject var238 = (SubLObject)module0376.NIL;
        var16 = f26701(var236, var15, var16);
        if (module0376.NIL == module0193.f12105(var16)) {
            module0018.f956((SubLObject)module0376.$ic95$, module0365.f24865(var234), (SubLObject)module0376.UNPROVIDED);
        }
        else {
            var235.resetMultipleValues();
            final SubLObject var239 = module0363.f24569(var236);
            final SubLObject var240 = var235.secondMultipleValue();
            final SubLObject var241 = var235.thirdMultipleValue();
            var235.resetMultipleValues();
            final SubLObject var242 = module0147.f9540(var239);
            final SubLObject var243 = module0147.$g2095$.currentBinding(var235);
            final SubLObject var244 = module0147.$g2094$.currentBinding(var235);
            final SubLObject var245 = module0147.$g2096$.currentBinding(var235);
            final SubLObject var246 = module0347.$g2969$.currentBinding(var235);
            final SubLObject var247 = module0347.$g2970$.currentBinding(var235);
            try {
                module0147.$g2095$.bind(module0147.f9545(var242), var235);
                module0147.$g2094$.bind(module0147.f9546(var242), var235);
                module0147.$g2096$.bind(module0147.f9549(var242), var235);
                module0347.$g2969$.bind(module0365.f24865(var234), var235);
                module0347.$g2970$.bind(var241, var235);
                final SubLObject var248 = module0365.f24879(var234);
                final SubLObject var46_239 = module0018.$g646$.currentBinding(var235);
                try {
                    module0018.$g646$.bind(module0361.f24166(var248), var235);
                    if (module0376.NIL != var15 && module0376.NIL != module0361.f24165(var237)) {
                        var238 = f26646(var236, var234, var15, var16);
                    }
                    else {
                        var238 = f26645(var236, var234, var15, var16);
                    }
                }
                finally {
                    module0018.$g646$.rebind(var46_239, var235);
                }
            }
            finally {
                module0347.$g2970$.rebind(var247, var235);
                module0347.$g2969$.rebind(var246, var235);
                module0147.$g2096$.rebind(var245, var235);
                module0147.$g2094$.rebind(var244, var235);
                module0147.$g2095$.rebind(var243, var235);
            }
        }
        return var238;
    }
    
    public static SubLObject f26701(final SubLObject var13, final SubLObject var15, SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        if (module0376.NIL != module0363.f24574(var13)) {
            final SubLObject var18 = module0363.f24564(var13);
            final SubLObject var19 = module0233.f15362(var15, var18);
            var16 = module0476.f31628(module0147.$g2095$.getDynamicValue(var17), var19, var16);
        }
        return var16;
    }
    
    public static SubLObject f26646(final SubLObject var13, final SubLObject var36, final SubLObject var15, final SubLObject var16) {
        final SubLObject var37 = module0381.f27128(var13, var15);
        f26645(module0364.f24736(var37), var36, (SubLObject)module0376.NIL, var16);
        return module0375.f26580(var13, var37, var15, (SubLObject)module0376.NIL, var36);
    }
    
    public static SubLObject f26645(final SubLObject var13, final SubLObject var36, final SubLObject var15, final SubLObject var16) {
        assert module0376.NIL != module0363.f24478(var13) : var13;
        final SubLObject var37 = module0365.f24865(var36);
        if (module0376.NIL == module0363.f24680(var13)) {
            return f26605(var13, var37, var15, var16);
        }
        if (module0376.NIL != f26619(var36) && module0376.NIL == module0361.f24165(module0363.f24507(var13))) {
            return f26605(var13, var37, var15, var16);
        }
        final SubLObject var38 = f26702(var13, var36, var15, var16);
        if (module0376.NIL != module0364.f24699(var38)) {
            return var38;
        }
        return f26605(var13, var37, var15, var16);
    }
    
    public static SubLObject f26702(final SubLObject var13, final SubLObject var36, final SubLObject var19, final SubLObject var16) {
        final SubLObject var37 = module0363.f24649(var13, var19);
        if (module0376.NIL != var37) {
            SubLObject var38 = var37;
            SubLObject var39 = (SubLObject)module0376.NIL;
            var39 = var38.first();
            while (module0376.NIL != var38) {
                if (module0376.NIL != f26613(var39) && var36.eql(f26616(var39)) && module0376.NIL != f26617(var39, var19, var16)) {
                    return var39;
                }
                var38 = var38.rest();
                var39 = var38.first();
            }
        }
        return (SubLObject)module0376.NIL;
    }
    
    public static SubLObject f26703(final SubLObject var17) {
        final SubLObject var18 = f26614(var17);
        return module0373.f26221(var17, var18, (SubLObject)module0376.NIL);
    }
    
    public static SubLObject f26704(final SubLObject var36, final SubLObject var226, final SubLObject var158, final SubLObject var138) {
        final SubLObject var227 = module0339.f22761();
        final SubLObject var228 = module0365.f24850(var36);
        SubLObject var229 = module0363.f24640(var228);
        SubLObject var230;
        var229 = (var230 = Sort.sort(var229, Symbols.symbol_function((SubLObject)module0376.$ic96$), Symbols.symbol_function((SubLObject)module0376.$ic97$)));
        SubLObject var231 = (SubLObject)module0376.NIL;
        var231 = var230.first();
        while (module0376.NIL != var230) {
            if (!var36.eql(var231) && module0376.NIL == module0365.f24888(var231)) {
                while (module0376.NIL != module0365.f24882(var231)) {
                    module0387.f27510(var227, var231);
                }
            }
            var230 = var230.rest();
            var231 = var230.first();
        }
        return (SubLObject)module0376.NIL;
    }
    
    public static SubLObject f26705(final SubLObject var232, SubLObject var138) {
        if (var138 == module0376.UNPROVIDED) {
            var138 = (SubLObject)module0376.NIL;
        }
        final SubLThread var233 = SubLProcess.currentSubLThread();
        final SubLObject var234 = f26706();
        var233.resetMultipleValues();
        final SubLObject var235 = f26707(var234, var232, (SubLObject)module0376.NIL);
        final SubLObject var236 = var233.secondMultipleValue();
        var233.resetMultipleValues();
        if (module0376.NIL != f26708(var234, var235)) {
            var233.resetMultipleValues();
            final SubLObject var237 = f26709(var234, var235, var236);
            final SubLObject var238 = var233.secondMultipleValue();
            var233.resetMultipleValues();
            if (module0376.NIL != f26710(var234, var237, var238)) {
                var233.resetMultipleValues();
                final SubLObject var239 = f26711(var234, var232, var238);
                final SubLObject var240 = var233.secondMultipleValue();
                var233.resetMultipleValues();
                module0347.f23330(var239, (SubLObject)module0376.NIL, var240);
            }
        }
        return (SubLObject)module0376.NIL;
    }
    
    public static SubLObject f26712(final SubLObject var151, final SubLObject var152) {
        SubLObject var154;
        final SubLObject var153 = var154 = var151.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var154, var153, (SubLObject)module0376.$ic98$);
        final SubLObject var155 = var154.rest();
        var154 = var154.first();
        SubLObject var156 = (SubLObject)module0376.NIL;
        SubLObject var157 = (SubLObject)module0376.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var154, var153, (SubLObject)module0376.$ic98$);
        var156 = var154.first();
        var154 = var154.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var154, var153, (SubLObject)module0376.$ic98$);
        var157 = var154.first();
        var154 = var154.rest();
        if (module0376.NIL == var154) {
            final SubLObject var158;
            var154 = (var158 = var155);
            final SubLObject var159 = (SubLObject)module0376.$ic99$;
            return (SubLObject)ConsesLow.list((SubLObject)module0376.$ic50$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var159, var157)), (SubLObject)ConsesLow.list((SubLObject)module0376.$ic100$, (SubLObject)ConsesLow.list((SubLObject)module0376.$ic101$, var159), (SubLObject)ConsesLow.list((SubLObject)module0376.$ic102$, (SubLObject)ConsesLow.listS((SubLObject)module0376.$ic103$, (SubLObject)ConsesLow.list(var156, var159), ConsesLow.append(var158, (SubLObject)module0376.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0376.$ic104$, var159)), (SubLObject)ConsesLow.listS((SubLObject)module0376.$ic105$, (SubLObject)ConsesLow.list(var156, var159), ConsesLow.append(var158, (SubLObject)module0376.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var153, (SubLObject)module0376.$ic98$);
        return (SubLObject)module0376.NIL;
    }
    
    public static SubLObject f26713(final SubLObject var232, SubLObject var138) {
        if (var138 == module0376.UNPROVIDED) {
            var138 = (SubLObject)module0376.NIL;
        }
        final SubLThread var233 = SubLProcess.currentSubLThread();
        final SubLObject var234 = f26706();
        var233.resetMultipleValues();
        final SubLObject var235 = f26692(var234, var232);
        final SubLObject var236 = var233.secondMultipleValue();
        var233.resetMultipleValues();
        if (module0376.NIL != var235) {
            final SubLObject var237 = var235;
            if (module0376.NIL != module0052.f3674(var237)) {
                try {
                    SubLObject var240;
                    for (SubLObject var238 = (SubLObject)module0376.NIL; module0376.NIL == var238; var238 = (SubLObject)SubLObjectFactory.makeBoolean(module0376.NIL == var240)) {
                        var233.resetMultipleValues();
                        final SubLObject var239 = module0052.f3693(var237);
                        var240 = var233.secondMultipleValue();
                        var233.resetMultipleValues();
                        if (module0376.NIL != var240) {
                            f26695(var232, var234, var239, var236);
                        }
                    }
                }
                finally {
                    final SubLObject var241 = Threads.$is_thread_performing_cleanupP$.currentBinding(var233);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0376.T, var233);
                        module0052.f3696(var237);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var241, var233);
                    }
                }
            }
            else {
                SubLObject var242 = var237;
                SubLObject var239 = (SubLObject)module0376.NIL;
                var239 = var242.first();
                while (module0376.NIL != var242) {
                    f26695(var232, var234, var239, var236);
                    var242 = var242.rest();
                    var239 = var242.first();
                }
            }
        }
        return (SubLObject)module0376.NIL;
    }
    
    public static SubLObject f26692(final SubLObject var14, final SubLObject var232) {
        return f26673((SubLObject)module0376.$ic106$, var14, var232, (SubLObject)module0376.UNPROVIDED, (SubLObject)module0376.UNPROVIDED, (SubLObject)module0376.UNPROVIDED);
    }
    
    public static SubLObject f26714(final SubLObject var14, final SubLObject var232) {
        final SubLThread var233 = SubLProcess.currentSubLThread();
        var233.resetMultipleValues();
        final SubLObject var234 = f26707(var14, var232, (SubLObject)module0376.NIL);
        final SubLObject var235 = var233.secondMultipleValue();
        var233.resetMultipleValues();
        if (module0376.NIL != f26708(var14, var234)) {
            var233.resetMultipleValues();
            final SubLObject var236 = f26709(var14, var234, var235);
            final SubLObject var237 = var233.secondMultipleValue();
            var233.resetMultipleValues();
            final SubLObject var238 = f26715(var14, var236, var237);
            return Values.values(var238, var237);
        }
        return (SubLObject)module0376.NIL;
    }
    
    public static SubLObject f26695(final SubLObject var232, final SubLObject var14, final SubLObject var105, final SubLObject var233) {
        final SubLThread var234 = SubLProcess.currentSubLThread();
        var234.resetMultipleValues();
        final SubLObject var235 = f26673((SubLObject)module0376.$ic107$, var232, var14, var105, var233, (SubLObject)module0376.UNPROVIDED);
        final SubLObject var236 = var234.secondMultipleValue();
        final SubLObject var237 = var234.thirdMultipleValue();
        final SubLObject var238 = var234.fourthMultipleValue();
        var234.resetMultipleValues();
        if (module0376.NIL != var235) {
            return module0347.f23330(var236, var237, var238);
        }
        return (SubLObject)module0376.NIL;
    }
    
    public static SubLObject f26716(final SubLObject var232, final SubLObject var14, final SubLObject var105, final SubLObject var233) {
        final SubLThread var234 = SubLProcess.currentSubLThread();
        var234.resetMultipleValues();
        final SubLObject var235 = f26717(var14, var105, var233);
        final SubLObject var236 = var234.secondMultipleValue();
        var234.resetMultipleValues();
        if (module0376.NIL != f26718(var14, var235)) {
            var234.resetMultipleValues();
            final SubLObject var237 = f26719(var14, var235, var236);
            final SubLObject var238 = var234.secondMultipleValue();
            var234.resetMultipleValues();
            var234.resetMultipleValues();
            final SubLObject var239 = module0235.f15474(var232, var237, (SubLObject)module0376.T, (SubLObject)module0376.T);
            final SubLObject var240 = var234.secondMultipleValue();
            var234.resetMultipleValues();
            if (module0376.NIL != var239) {
                var234.resetMultipleValues();
                final SubLObject var241 = f26711(var14, var237, var238);
                final SubLObject var242 = var234.secondMultipleValue();
                var234.resetMultipleValues();
                return Values.values((SubLObject)module0376.T, var241, var239, ConsesLow.append(var242, var240));
            }
        }
        return Values.values((SubLObject)module0376.NIL, (SubLObject)module0376.NIL, (SubLObject)module0376.NIL, (SubLObject)module0376.NIL);
    }
    
    public static SubLObject f26706() {
        return module0347.f23326();
    }
    
    public static SubLObject f26720() {
        return module0347.f23327();
    }
    
    public static SubLObject f26707(final SubLObject var14, final SubLObject var232, SubLObject var19) {
        if (var19 == module0376.UNPROVIDED) {
            var19 = (SubLObject)module0376.NIL;
        }
        final SubLObject var233 = module0340.f22886(var14);
        return module0337.f22649(var233, var232, var19);
    }
    
    public static SubLObject f26708(final SubLObject var14, final SubLObject var245) {
        final SubLObject var246 = module0340.f22887(var14);
        return module0337.f22628(var246, var245);
    }
    
    public static SubLObject f26709(final SubLObject var14, final SubLObject var245, SubLObject var19) {
        if (var19 == module0376.UNPROVIDED) {
            var19 = (SubLObject)module0376.NIL;
        }
        final SubLObject var246 = module0340.f22888(var14);
        return module0062.f4509(var246, var245, var19);
    }
    
    public static SubLObject f26710(final SubLObject var14, final SubLObject var247, SubLObject var19) {
        if (var19 == module0376.UNPROVIDED) {
            var19 = (SubLObject)module0376.NIL;
        }
        final SubLObject var248 = module0340.f22889(var14);
        if (module0376.NIL == var248) {
            return (SubLObject)module0376.NIL;
        }
        final SubLObject var249 = module0062.f4509(var248, var247, var19);
        return module0035.sublisp_boolean(var249);
    }
    
    public static SubLObject f26715(final SubLObject var14, final SubLObject var247, SubLObject var19) {
        if (var19 == module0376.UNPROVIDED) {
            var19 = (SubLObject)module0376.NIL;
        }
        final SubLObject var248 = module0340.f22890(var14);
        if (module0376.NIL == var248) {
            return (SubLObject)module0376.NIL;
        }
        final SubLObject var249 = module0062.f4509(var248, var247, var19);
        if (module0376.NIL != module0052.f3674(var249)) {
            return var249;
        }
        if (var249.isList()) {
            return module0052.f3709(var249);
        }
        return (SubLObject)module0376.NIL;
    }
    
    public static SubLObject f26717(final SubLObject var14, final SubLObject var105, SubLObject var19) {
        if (var19 == module0376.UNPROVIDED) {
            var19 = (SubLObject)module0376.NIL;
        }
        final SubLObject var106 = module0340.f22891(var14);
        return module0062.f4509(var106, var105, var19);
    }
    
    public static SubLObject f26718(final SubLObject var14, final SubLObject var259) {
        final SubLObject var260 = module0340.f22892(var14);
        return module0337.f22628(var260, var259);
    }
    
    public static SubLObject f26719(final SubLObject var14, final SubLObject var259, SubLObject var19) {
        if (var19 == module0376.UNPROVIDED) {
            var19 = (SubLObject)module0376.NIL;
        }
        final SubLObject var260 = module0340.f22893(var14);
        return module0062.f4509(var260, var259, var19);
    }
    
    public static SubLObject f26711(final SubLObject var14, final SubLObject var261, SubLObject var19) {
        if (var19 == module0376.UNPROVIDED) {
            var19 = (SubLObject)module0376.NIL;
        }
        final SubLThread var262 = SubLProcess.currentSubLThread();
        final SubLObject var263 = f26720();
        final SubLObject var264 = module0202.f12840(var261, var263);
        final SubLObject var265 = module0340.f22898(var14);
        final SubLObject var266 = module0340.f22894(var14);
        if (module0376.NIL != var266) {
            SubLObject var268;
            final SubLObject var267 = var268 = module0337.f22649(var266, var261, var19);
            final SubLObject var269 = (SubLObject)(var268.isCons() ? var268.first() : module0376.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(var268, var267, (SubLObject)module0376.$ic108$);
            final SubLObject var270;
            var268 = (var270 = var268.rest());
            return Values.values(var269, var270);
        }
        final SubLObject var271 = module0340.f22895(var14);
        if (module0376.NIL != module0112.f7693(var271)) {
            var262.resetMultipleValues();
            final SubLObject var272 = module0112.f7696(var271, var264, var265);
            final SubLObject var273 = var262.secondMultipleValue();
            var262.resetMultipleValues();
            return Values.values(var272, var273);
        }
        final SubLObject var274 = module0340.f22896(var14);
        final SubLObject var275 = module0340.f22899(var14);
        final SubLObject var276 = module0130.f8529((SubLObject)module0376.$ic109$, var275);
        final SubLObject var277 = module0191.f11990(var274, var264, var265, var276);
        final SubLObject var278 = (SubLObject)module0376.NIL;
        return Values.values(var277, var278);
    }
    
    public static SubLObject f26673(final SubLObject var274, SubLObject var3, SubLObject var256, SubLObject var275, SubLObject var276, SubLObject var277) {
        if (var3 == module0376.UNPROVIDED) {
            var3 = (SubLObject)module0376.NIL;
        }
        if (var256 == module0376.UNPROVIDED) {
            var256 = (SubLObject)module0376.NIL;
        }
        if (var275 == module0376.UNPROVIDED) {
            var275 = (SubLObject)module0376.NIL;
        }
        if (var276 == module0376.UNPROVIDED) {
            var276 = (SubLObject)module0376.NIL;
        }
        if (var277 == module0376.UNPROVIDED) {
            var277 = (SubLObject)module0376.NIL;
        }
        if (var274.eql((SubLObject)module0376.$ic73$)) {
            return f26674(var3, var256, var275);
        }
        if (var274.eql((SubLObject)module0376.$ic91$)) {
            return f26699(var3, var256, var275);
        }
        if (var274.eql((SubLObject)module0376.$ic107$)) {
            return f26716(var3, var256, var275, var276);
        }
        if (var274.eql((SubLObject)module0376.$ic106$)) {
            return f26714(var3, var256);
        }
        Errors.error((SubLObject)module0376.$ic110$, var274);
        return (SubLObject)module0376.NIL;
    }
    
    public static SubLObject f26721() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26594", "S#29829", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26595", "S#29803", 1, 0, false);
        new $f26595$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26596", "S#29830", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26597", "S#29831", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26598", "S#29832", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26599", "S#29833", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26600", "S#29834", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26601", "S#29835", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26602", "S#29836", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26603", "S#29837", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26604", "S#29838", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26605", "S#29839", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26606", "S#29840", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26607", "S#29841", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26611", "S#27588", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26612", "S#29241", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26614", "S#27383", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26615", "S#29238", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26608", "S#29842", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26609", "S#29843", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26610", "S#29844", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26616", "S#28939", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26617", "S#29845", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26618", "S#27341", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26620", "S#27916", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26622", "S#27606", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26623", "S#29750", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26624", "S#29182", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26626", "S#29846", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26629", "S#29847", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26625", "S#29848", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26631", "S#29849", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26630", "S#29850", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26628", "S#29851", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26632", "S#29208", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26633", "S#29220", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26634", "S#29852", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26636", "S#29853", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26638", "S#29854", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26639", "S#27723", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26637", "S#29855", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26640", "S#29856", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26641", "S#29857", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26642", "S#27722", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26643", "S#29858", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26635", "S#29859", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26644", "S#29860", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26648", "S#29861", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26649", "S#29862", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26647", "S#29863", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26650", "S#29864", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26651", "S#29865", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26652", "S#29866", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0376", "f26653", "S#29867");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26621", "S#29205", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26654", "S#29206", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26613", "S#27382", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26619", "S#28948", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26656", "S#28924", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26657", "S#29868", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26658", "S#29869", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26659", "S#29870", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26660", "S#29188", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26662", "S#29871", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26661", "S#29872", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26666", "S#25997", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26667", "S#29873", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26670", "S#29874", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26669", "S#29875", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26671", "S#29876", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26664", "S#29877", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26668", "S#29878", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26674", "S#29879", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26675", "S#29880", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26677", "S#29881", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26678", "S#29882", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26627", "S#29883", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26676", "S#29884", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26665", "S#29885", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26679", "S#29886", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26681", "S#29887", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26680", "S#29888", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26663", "S#29889", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26683", "S#29890", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26682", "S#29891", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26684", "S#29211", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26685", "S#29212", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26672", "S#29892", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26655", "S#29204", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0376", "f26686", "S#29893");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26687", "S#29215", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26688", "S#29894", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26690", "S#29895", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26693", "S#29896", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26694", "S#27721", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26696", "S#25994", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26691", "S#29897", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26699", "S#29898", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26700", "S#25995", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26698", "S#29899", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26689", "S#27720", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26697", "S#29900", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26701", "S#29901", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26646", "S#29902", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26645", "S#29903", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26702", "S#29904", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26703", "S#29258", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26704", "S#29216", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26705", "S#25693", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0376", "f26712", "S#29905");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26713", "S#25694", 1, 1, false);
        new $f26713$UnaryFunction();
        new $f26713$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26692", "S#29906", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26714", "S#29907", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26695", "S#29908", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26716", "S#29909", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26706", "S#29910", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26720", "S#29911", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26707", "S#29912", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26708", "S#29913", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26709", "S#29914", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26710", "S#29915", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26715", "S#29916", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26717", "S#29917", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26718", "S#29918", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26719", "S#29919", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26711", "S#29920", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0376", "f26673", "S#29921", 1, 5, false);
        return (SubLObject)module0376.NIL;
    }
    
    public static SubLObject f26722() {
        module0376.$g3189$ = SubLFiles.defconstant("S#29922", (SubLObject)module0376.$ic0$);
        module0376.$g3190$ = SubLFiles.defparameter("S#29923", (SubLObject)module0376.NIL);
        module0376.$g3192$ = SubLFiles.defparameter("S#29924", (SubLObject)module0376.T);
        module0376.$g3193$ = SubLFiles.defparameter("S#29925", (SubLObject)module0376.T);
        module0376.$g3191$ = SubLFiles.defparameter("S#29926", (SubLObject)module0376.TWO_INTEGER);
        module0376.$g3194$ = SubLFiles.defparameter("S#29927", (SubLObject)module0376.NIL);
        return (SubLObject)module0376.NIL;
    }
    
    public static SubLObject f26723() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0376.$g3189$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0376.$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0376.$ic8$);
        Structures.def_csetf((SubLObject)module0376.$ic9$, (SubLObject)module0376.$ic10$);
        Structures.def_csetf((SubLObject)module0376.$ic11$, (SubLObject)module0376.$ic12$);
        Structures.def_csetf((SubLObject)module0376.$ic13$, (SubLObject)module0376.$ic14$);
        Equality.identity((SubLObject)module0376.$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0376.$g3189$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0376.$ic23$));
        module0034.f1895((SubLObject)module0376.$ic78$);
        module0034.f1895((SubLObject)module0376.$ic80$);
        return (SubLObject)module0376.NIL;
    }
    
    public void declareFunctions() {
        f26721();
    }
    
    public void initializeVariables() {
        f26722();
    }
    
    public void runTopLevelForms() {
        f26723();
    }
    
    static {
        me = (SubLFile)new module0376();
        module0376.$g3189$ = null;
        module0376.$g3190$ = null;
        module0376.$g3192$ = null;
        module0376.$g3193$ = null;
        module0376.$g3191$ = null;
        module0376.$g3194$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#29802", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#29803", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14781", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#14510", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HL-MODULE"), (SubLObject)SubLObjectFactory.makeKeyword("BINDINGS"), (SubLObject)SubLObjectFactory.makeKeyword("SUPPORTS"));
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29830", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29831", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29832", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29833", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29834", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29835", "CYC"));
        $ic6$ = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic7$ = SubLObjectFactory.makeSymbol("S#29829", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#29803", "CYC"));
        $ic9$ = SubLObjectFactory.makeSymbol("S#29830", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#29833", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#29831", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#29834", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#29832", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#29835", "CYC");
        $ic15$ = SubLObjectFactory.makeKeyword("HL-MODULE");
        $ic16$ = SubLObjectFactory.makeKeyword("BINDINGS");
        $ic17$ = SubLObjectFactory.makeKeyword("SUPPORTS");
        $ic18$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic19$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic20$ = SubLObjectFactory.makeSymbol("S#29836", "CYC");
        $ic21$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic22$ = SubLObjectFactory.makeKeyword("END");
        $ic23$ = SubLObjectFactory.makeSymbol("S#29838", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#26082", "CYC");
        $ic25$ = SubLObjectFactory.makeKeyword("REMOVAL");
        $ic26$ = SubLObjectFactory.makeKeyword("FREE");
        $ic27$ = SubLObjectFactory.makeSymbol("S#27382", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#14902", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("S#18088", "CYC");
        $ic30$ = SubLObjectFactory.makeSymbol("S#14254", "CYC");
        $ic31$ = SubLObjectFactory.makeKeyword("RESTRICTION");
        $ic32$ = SubLObjectFactory.makeKeyword("SPLIT");
        $ic33$ = SubLObjectFactory.makeKeyword("REMOVAL-CONJUNCTIVE");
        $ic34$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14781", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#26071", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25691", "CYC"));
        $ic35$ = SubLObjectFactory.makeSymbol("S#29847", "CYC");
        $ic36$ = SubLObjectFactory.makeKeyword("ALL");
        $ic37$ = SubLObjectFactory.makeString("~s stated its applicability to the subclause spec ~s, which does not specify more than one literal.\nConjunctive removal modules must apply to more than one literal in the clause.");
        $ic38$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic39$ = SubLObjectFactory.makeKeyword("TACTICAL");
        $ic40$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29928", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#28818", "CYC"));
        $ic41$ = SubLObjectFactory.makeKeyword("CONJUNCTIVE-REMOVAL-EXPAND-ITERATIVE");
        $ic42$ = SubLObjectFactory.makeKeyword("CONJUNCTIVE-REMOVAL-EXPAND");
        $ic43$ = SubLObjectFactory.makeKeyword("INFERENCE-PROOF-SPEC");
        $ic44$ = SubLObjectFactory.makeString("Problem reuse assumptions were violated: ~a did not equal ~a");
        $ic45$ = SubLObjectFactory.makeString("Couldn't find the right conjunctive removal justification for ~S");
        $ic46$ = SubLObjectFactory.makeKeyword("NEG");
        $ic47$ = SubLObjectFactory.makeKeyword("POS");
        $ic48$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3268", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic49$ = SubLObjectFactory.makeUninternedSymbol("US#591F892");
        $ic50$ = SubLObjectFactory.makeSymbol("CLET");
        $ic51$ = SubLObjectFactory.makeSymbol("S#1875", "CYC");
        $ic52$ = SubLObjectFactory.makeSymbol("S#26978", "CYC");
        $ic53$ = SubLObjectFactory.makeKeyword("META-REMOVAL");
        $ic54$ = SubLObjectFactory.makeSymbol("S#29808", "CYC");
        $ic55$ = SubLObjectFactory.makeSymbol("S#29809", "CYC");
        $ic56$ = SubLObjectFactory.makeSymbol("S#29810", "CYC");
        $ic57$ = SubLObjectFactory.makeSymbol("S#29811", "CYC");
        $ic58$ = SubLObjectFactory.makeSymbol("S#29812", "CYC");
        $ic59$ = SubLObjectFactory.makeSymbol("S#29813", "CYC");
        $ic60$ = SubLObjectFactory.makeSymbol("S#29814", "CYC");
        $ic61$ = SubLObjectFactory.makeSymbol("S#29815", "CYC");
        $ic62$ = SubLObjectFactory.makeSymbol("S#29816", "CYC");
        $ic63$ = SubLObjectFactory.makeSymbol("S#29817", "CYC");
        $ic64$ = SubLObjectFactory.makeSymbol("S#29818", "CYC");
        $ic65$ = SubLObjectFactory.makeSymbol("S#29819", "CYC");
        $ic66$ = SubLObjectFactory.makeSymbol("S#29820", "CYC");
        $ic67$ = SubLObjectFactory.makeSymbol("S#29821", "CYC");
        $ic68$ = SubLObjectFactory.makeSymbol("S#29822", "CYC");
        $ic69$ = SubLObjectFactory.makeSymbol("S#29823", "CYC");
        $ic70$ = SubLObjectFactory.makeSymbol("S#29824", "CYC");
        $ic71$ = SubLObjectFactory.makeSymbol("S#29825", "CYC");
        $ic72$ = SubLObjectFactory.makeSymbol("S#29826", "CYC");
        $ic73$ = SubLObjectFactory.makeKeyword("DETERMINE-NEW-REMOVAL-TACTIC-SPECS-FROM-HL-MODULES");
        $ic74$ = SubLObjectFactory.makeKeyword("NOT");
        $ic75$ = SubLObjectFactory.makeKeyword("MODULE-SUBTYPE");
        $ic76$ = SubLObjectFactory.makeSymbol("FIRST");
        $ic77$ = SubLObjectFactory.makeString("For sentence :~%~S~%Maximum HL Module check cost exceeded by ~A (~A).");
        $ic78$ = SubLObjectFactory.makeSymbol("S#29888", "CYC");
        $ic79$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic80$ = SubLObjectFactory.makeSymbol("S#29891", "CYC");
        $ic81$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#24101", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12397", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic82$ = SubLObjectFactory.makeUninternedSymbol("US#6B70E19");
        $ic83$ = SubLObjectFactory.makeSymbol("WITH-INFERENCE-MT-RELEVANCE");
        $ic84$ = SubLObjectFactory.makeSymbol("S#26057", "CYC");
        $ic85$ = SubLObjectFactory.makeSymbol("TACTIC-HL-MODULE");
        $ic86$ = SubLObjectFactory.makeSymbol("S#26058", "CYC");
        $ic87$ = SubLObjectFactory.makeSymbol("S#29867", "CYC");
        $ic88$ = SubLObjectFactory.makeSymbol("S#27780", "CYC");
        $ic89$ = SubLObjectFactory.makeKeyword("REMOVAL-OUTPUT-GENERATE");
        $ic90$ = SubLObjectFactory.makeSymbol("S#25994", "CYC");
        $ic91$ = SubLObjectFactory.makeKeyword("MAYBE-MAKE-REMOVAL-TACTIC-EXPAND-RESULTS-PROGRESS-ITERATOR");
        $ic92$ = SubLObjectFactory.makeSymbol("S#25995", "CYC");
        $ic93$ = SubLObjectFactory.makeKeyword("REMOVAL-EXPAND");
        $ic94$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29928", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#14510", "CYC"));
        $ic95$ = SubLObjectFactory.makeString("Ignoring result from ~S due to open supports");
        $ic96$ = SubLObjectFactory.makeSymbol("S#26631", "CYC");
        $ic97$ = SubLObjectFactory.makeSymbol("S#27339", "CYC");
        $ic98$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29929", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29930", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic99$ = SubLObjectFactory.makeUninternedSymbol("US#2A76813");
        $ic100$ = SubLObjectFactory.makeSymbol("PIF");
        $ic101$ = SubLObjectFactory.makeSymbol("S#5091", "CYC");
        $ic102$ = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $ic103$ = SubLObjectFactory.makeSymbol("S#5129", "CYC");
        $ic104$ = SubLObjectFactory.makeSymbol("S#5125", "CYC");
        $ic105$ = SubLObjectFactory.makeSymbol("DO-LIST");
        $ic106$ = SubLObjectFactory.makeKeyword("MAYBE-MAKE-INFERENCE-OUTPUT-ITERATOR");
        $ic107$ = SubLObjectFactory.makeKeyword("HANDLE-ONE-OUTPUT-GENERATE-RESULT");
        $ic108$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#14595", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#24422", "CYC"));
        $ic109$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic110$ = SubLObjectFactory.makeString("unknown thing to do in the HL module guts: ~s");
    }
    
    public static final class $sX29802_native extends SubLStructNative
    {
        public SubLObject $hl_module;
        public SubLObject $bindings;
        public SubLObject $supports;
        private static final SubLStructDeclNative structDecl;
        
        public $sX29802_native() {
            this.$hl_module = (SubLObject)CommonSymbols.NIL;
            this.$bindings = (SubLObject)CommonSymbols.NIL;
            this.$supports = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX29802_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$hl_module;
        }
        
        public SubLObject getField3() {
            return this.$bindings;
        }
        
        public SubLObject getField4() {
            return this.$supports;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$hl_module = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$bindings = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$supports = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX29802_native.class, module0376.$ic0$, module0376.$ic1$, module0376.$ic2$, module0376.$ic3$, new String[] { "$hl_module", "$bindings", "$supports" }, module0376.$ic4$, module0376.$ic5$, module0376.$ic6$);
        }
    }
    
    public static final class $f26595$UnaryFunction extends UnaryFunction
    {
        public $f26595$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#29803"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0376.f26595(var3);
        }
    }
    
    public static final class $f26713$UnaryFunction extends UnaryFunction
    {
        public $f26713$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#25694"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0376.f26713(var3, (SubLObject)$f26713$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f26713$BinaryFunction extends BinaryFunction
    {
        public $f26713$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#25694"));
        }
        
        public SubLObject processItem(final SubLObject var3, final SubLObject var256) {
            return module0376.f26713(var3, var256);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0376.class
	Total time: 714 ms
	
	Decompiled with Procyon 0.5.32.
*/