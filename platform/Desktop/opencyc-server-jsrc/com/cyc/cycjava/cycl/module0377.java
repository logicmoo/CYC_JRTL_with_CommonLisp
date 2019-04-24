package com.cyc.cycjava.cycl;

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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
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

public final class module0377 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0377";
    public static final String myFingerPrint = "719aa5b9bcb54be4707f2478b1fff055e0bfc081cce2253cdf98d9d38cf47a63";
    public static SubLSymbol $g3195$;
    private static SubLSymbol $g3196$;
    private static SubLSymbol $g3197$;
    private static SubLSymbol $g3198$;
    public static SubLSymbol $g3199$;
    private static SubLSymbol $g3200$;
    private static SubLSymbol $g3201$;
    private static SubLSymbol $g3202$;
    private static SubLSymbol $g3203$;
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
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLString $ic21$;
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
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLString $ic36$;
    private static final SubLList $ic37$;
    private static final SubLList $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLList $ic41$;
    private static final SubLList $ic42$;
    private static final SubLList $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLList $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLString $ic61$;
    private static final SubLString $ic62$;
    private static final SubLList $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLString $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLString $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLList $ic77$;
    private static final SubLObject $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLString $ic81$;
    private static final SubLString $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLObject $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLObject $ic94$;
    
    
    public static SubLObject f26724(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)module0377.ZERO_INTEGER);
        return (SubLObject)module0377.NIL;
    }
    
    public static SubLObject f26725(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX29931_native.class) ? module0377.T : module0377.NIL);
    }
    
    public static SubLObject f26726(final SubLObject var1) {
        assert module0377.NIL != f26725(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f26727(final SubLObject var1) {
        assert module0377.NIL != f26725(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f26728(final SubLObject var1) {
        assert module0377.NIL != f26725(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f26729(final SubLObject var1) {
        assert module0377.NIL != f26725(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f26730(final SubLObject var1, final SubLObject var4) {
        assert module0377.NIL != f26725(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f26731(final SubLObject var1, final SubLObject var4) {
        assert module0377.NIL != f26725(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f26732(final SubLObject var1, final SubLObject var4) {
        assert module0377.NIL != f26725(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f26733(final SubLObject var1, final SubLObject var4) {
        assert module0377.NIL != f26725(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f26734(SubLObject var5) {
        if (var5 == module0377.UNPROVIDED) {
            var5 = (SubLObject)module0377.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX29931_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0377.NIL, var7 = var5; module0377.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0377.$ic17$)) {
                f26730(var6, var9);
            }
            else if (var10.eql((SubLObject)module0377.$ic18$)) {
                f26731(var6, var9);
            }
            else if (var10.eql((SubLObject)module0377.$ic19$)) {
                f26732(var6, var9);
            }
            else if (var10.eql((SubLObject)module0377.$ic20$)) {
                f26733(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0377.$ic21$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f26735(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0377.$ic22$, (SubLObject)module0377.$ic23$, (SubLObject)module0377.FOUR_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0377.$ic24$, (SubLObject)module0377.$ic17$, f26726(var11));
        Functions.funcall(var12, var11, (SubLObject)module0377.$ic24$, (SubLObject)module0377.$ic18$, f26727(var11));
        Functions.funcall(var12, var11, (SubLObject)module0377.$ic24$, (SubLObject)module0377.$ic19$, f26728(var11));
        Functions.funcall(var12, var11, (SubLObject)module0377.$ic24$, (SubLObject)module0377.$ic20$, f26729(var11));
        Functions.funcall(var12, var11, (SubLObject)module0377.$ic25$, (SubLObject)module0377.$ic23$, (SubLObject)module0377.FOUR_INTEGER);
        return var11;
    }
    
    public static SubLObject f26736(final SubLObject var11, final SubLObject var12) {
        return f26735(var11, var12);
    }
    
    public static SubLObject f26737(final SubLObject var13, final SubLObject var14, final SubLObject var15, final SubLObject var16, final SubLObject var17, final SubLObject var18, final SubLObject var19) {
        assert module0377.NIL != module0363.f24478(var13) : var13;
        if (module0377.NIL != var14 && !module0377.areAssertionsDisabledFor(me) && module0377.NIL == module0364.f24774(var14)) {
            throw new AssertionError(var14);
        }
        final SubLObject var20 = (SubLObject)ConsesLow.cons(var17, var18);
        final SubLObject var21 = f26738(var13, var15, var16, var20, var19);
        if (module0377.NIL != var14) {
            module0364.f24783(var14, var21);
        }
        module0364.f24775(var21);
        module0373.f26334(var21);
        return var21;
    }
    
    public static SubLObject f26738(final SubLObject var22, final SubLObject var15, final SubLObject var16, final SubLObject var20, final SubLObject var19) {
        final SubLObject var23 = module0364.f24729((SubLObject)module0377.$ic29$, var22);
        f26739(var23);
        f26740(var23, var15);
        f26741(var23, var16);
        f26742(var23, var20);
        f26743(var23, var19);
        if (module0377.NIL != var19) {
            module0361.f24381(module0363.f24507(var22));
        }
        return var23;
    }
    
    public static SubLObject f26739(final SubLObject var21) {
        final SubLObject var22 = f26734((SubLObject)module0377.UNPROVIDED);
        module0364.f24744(var21, var22);
        return var21;
    }
    
    public static SubLObject f26744(final SubLObject var21) {
        module0378.f26867(var21);
        final SubLObject var22 = module0364.f24742(var21);
        f26730(var22, (SubLObject)module0377.$ic30$);
        f26731(var22, (SubLObject)module0377.$ic30$);
        f26732(var22, (SubLObject)module0377.$ic30$);
        f26733(var22, (SubLObject)module0377.$ic30$);
        return var21;
    }
    
    public static SubLObject f26745(final SubLObject var21) {
        assert module0377.NIL != f26746(var21) : var21;
        final SubLObject var22 = module0364.f24742(var21);
        return f26726(var22);
    }
    
    public static SubLObject f26747(final SubLObject var21) {
        assert module0377.NIL != f26746(var21) : var21;
        final SubLObject var22 = module0364.f24742(var21);
        return f26727(var22);
    }
    
    public static SubLObject f26748(final SubLObject var21) {
        assert module0377.NIL != f26746(var21) : var21;
        final SubLObject var22 = module0364.f24742(var21);
        return f26728(var22);
    }
    
    public static SubLObject f26749(final SubLObject var21) {
        return f26748(var21).first();
    }
    
    public static SubLObject f26750(final SubLObject var21) {
        return f26748(var21).rest();
    }
    
    public static SubLObject f26751(final SubLObject var21) {
        assert module0377.NIL != f26746(var21) : var21;
        final SubLObject var22 = module0364.f24742(var21);
        return f26729(var22);
    }
    
    public static SubLObject f26740(final SubLObject var21, final SubLObject var15) {
        assert module0377.NIL != module0340.f22789(var15) : var15;
        final SubLObject var22 = module0364.f24742(var21);
        f26730(var22, var15);
        return var21;
    }
    
    public static SubLObject f26741(final SubLObject var21, final SubLObject var24) {
        assert module0377.NIL != module0233.f15350(var24) : var24;
        final SubLObject var25 = module0364.f24742(var21);
        f26731(var25, var24);
        return var21;
    }
    
    public static SubLObject f26742(final SubLObject var21, final SubLObject var20) {
        assert module0377.NIL != module0191.f11993(var20) : var20;
        final SubLObject var22 = module0364.f24742(var21);
        f26732(var22, var20);
        return var21;
    }
    
    public static SubLObject f26743(final SubLObject var21, final SubLObject var25) {
        assert module0377.NIL != module0362.f24448(var25) : var25;
        final SubLObject var26 = module0364.f24742(var21);
        f26733(var26, var25);
        return var21;
    }
    
    public static SubLObject f26752(final SubLObject var21) {
        assert module0377.NIL != f26746(var21) : var21;
        final SubLObject var22 = module0364.f24725(var21);
        final SubLObject var23 = f26745(var21);
        final SubLObject var24 = f26749(var21);
        SubLObject var25 = module0363.f24517(var22);
        SubLObject var26 = (SubLObject)module0377.NIL;
        var26 = var25.first();
        while (module0377.NIL != var25) {
            if (module0377.NIL != module0363.f24524(var26, (SubLObject)module0377.$ic29$) && var23.eql(module0365.f24865(var26)) && var24.eql(f26753(var26))) {
                return var26;
            }
            var25 = var25.rest();
            var26 = var25.first();
        }
        if (module0377.NIL == module0363.f24685(var22)) {
            return Errors.error((SubLObject)module0377.$ic36$, var21);
        }
        return (SubLObject)module0377.NIL;
    }
    
    public static SubLObject f26754(final SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        final SubLObject var23 = f26749(var21);
        final SubLObject var24 = f26755(var21);
        SubLObject var25 = (SubLObject)module0377.NIL;
        final SubLObject var26 = module0147.f9540(var24);
        final SubLObject var27 = module0147.$g2095$.currentBinding(var22);
        final SubLObject var28 = module0147.$g2094$.currentBinding(var22);
        final SubLObject var29 = module0147.$g2096$.currentBinding(var22);
        try {
            module0147.$g2095$.bind(module0147.f9545(var26), var22);
            module0147.$g2094$.bind(module0147.f9546(var26), var22);
            module0147.$g2096$.bind(module0147.f9549(var26), var22);
            var25 = module0234.f15470(f26756(var23, var24));
        }
        finally {
            module0147.$g2096$.rebind(var29, var22);
            module0147.$g2094$.rebind(var28, var22);
            module0147.$g2095$.rebind(var27, var22);
        }
        return module0370.f25896(var25, var24, (SubLObject)module0377.UNPROVIDED);
    }
    
    public static SubLObject f26757(final SubLObject var21) {
        return module0364.f24753(var21);
    }
    
    public static SubLObject f26758(final SubLObject var21) {
        final SubLObject var22 = f26757(var21);
        if (module0377.NIL != var22) {
            return module0364.f24736(var22);
        }
        return (SubLObject)module0377.NIL;
    }
    
    public static SubLObject f26759(final SubLObject var21) {
        final SubLObject var22 = f26757(var21);
        if (module0377.NIL != var22) {
            return module0364.f24737(var22);
        }
        return (SubLObject)module0377.NIL;
    }
    
    public static SubLObject f26755(final SubLObject var21) {
        final SubLObject var22 = module0364.f24725(var21);
        return module0363.f24565(var22);
    }
    
    public static SubLObject f26760(final SubLObject var21) {
        return Types.sublisp_null(f26751(var21));
    }
    
    public static SubLObject f26761(final SubLObject var13, final SubLObject var26) {
        final SubLObject var27 = module0363.f24527(var13);
        SubLObject var28;
        SubLObject var29;
        SubLObject var30;
        SubLObject var31;
        for (var28 = module0032.f1741(var27), var29 = (SubLObject)module0377.NIL, var29 = module0032.f1742(var28, var27); module0377.NIL == module0032.f1744(var28, var29); var29 = module0032.f1743(var29)) {
            var30 = module0032.f1745(var28, var29);
            if (module0377.NIL != module0032.f1746(var29, var30) && module0377.NIL != module0364.f24748(var30, (SubLObject)module0377.$ic29$)) {
                var31 = f26749(var30);
                if (var26.eql(var31)) {
                    return f26758(var30);
                }
            }
        }
        return (SubLObject)module0377.NIL;
    }
    
    public static SubLObject f26762(final SubLObject var13, final SubLObject var26, final SubLObject var15) {
        final SubLObject var27 = module0363.f24527(var13);
        SubLObject var28;
        SubLObject var29;
        SubLObject var30;
        SubLObject var31;
        SubLObject var32;
        for (var28 = module0032.f1741(var27), var29 = (SubLObject)module0377.NIL, var29 = module0032.f1742(var28, var27); module0377.NIL == module0032.f1744(var28, var29); var29 = module0032.f1743(var29)) {
            var30 = module0032.f1745(var28, var29);
            if (module0377.NIL != module0032.f1746(var29, var30) && module0377.NIL != module0364.f24748(var30, (SubLObject)module0377.$ic29$)) {
                var31 = f26749(var30);
                if (var26.eql(var31)) {
                    var32 = f26745(var30);
                    if (var15.eql(var32)) {
                        return f26758(var30);
                    }
                }
            }
        }
        return (SubLObject)module0377.NIL;
    }
    
    public static SubLObject f26763(final SubLObject var21) {
        return f26764(f26747(var21));
    }
    
    public static SubLObject f26764(final SubLObject var16) {
        SubLObject var17 = (SubLObject)module0377.NIL;
        SubLObject var18 = var16;
        SubLObject var19 = (SubLObject)module0377.NIL;
        var19 = var18.first();
        while (module0377.NIL != var18) {
            SubLObject var21;
            final SubLObject var20 = var21 = var19;
            SubLObject var22 = (SubLObject)module0377.NIL;
            SubLObject var23 = (SubLObject)module0377.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0377.$ic37$);
            var22 = var21.first();
            var21 = (var23 = var21.rest());
            if (module0377.NIL != module0234.f15464(var22) && module0377.NIL != module0193.f12105(var23)) {
                var17 = (SubLObject)ConsesLow.cons(var19, var17);
            }
            var18 = var18.rest();
            var19 = var18.first();
        }
        return Sequences.nreverse(var17);
    }
    
    public static SubLObject f26765(final SubLObject var46, final SubLObject var47) {
        SubLObject var49;
        final SubLObject var48 = var49 = var46.rest();
        SubLObject var50 = (SubLObject)module0377.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var49, var48, (SubLObject)module0377.$ic38$);
        var50 = var49.first();
        final SubLObject var51;
        var49 = (var51 = var49.rest());
        final SubLObject var52 = (SubLObject)module0377.$ic39$;
        return (SubLObject)ConsesLow.listS((SubLObject)module0377.$ic40$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var52, var50), (SubLObject)module0377.$ic41$, (SubLObject)module0377.$ic42$, (SubLObject)module0377.$ic43$, (SubLObject)ConsesLow.list((SubLObject)module0377.$ic44$, (SubLObject)ConsesLow.list((SubLObject)module0377.$ic45$, var52))), ConsesLow.append(var51, (SubLObject)module0377.NIL));
    }
    
    public static SubLObject f26766(final SubLObject var53) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0377.NIL != module0365.f24819(var53) && module0377.NIL != module0340.f22981(module0365.f24865(var53)));
    }
    
    public static SubLObject f26767(final SubLObject var22, final SubLObject var54, final SubLObject var55, final SubLObject var56) {
        if (module0377.NIL == f26768(var54, var56)) {
            f26769(var22, var54, var55);
            return (SubLObject)module0377.T;
        }
        return (SubLObject)module0377.NIL;
    }
    
    public static SubLObject f26768(final SubLObject var54, final SubLObject var56) {
        final SubLObject var57 = module0205.f13333(var54);
        if (module0377.NIL != module0173.f10955(var57) && module0377.NIL != module0349.f23471(var57, var56)) {
            return (SubLObject)module0377.T;
        }
        if (module0377.NIL != module0350.f23544(var54, var56)) {
            return (SubLObject)module0377.T;
        }
        return (SubLObject)module0377.NIL;
    }
    
    public static SubLObject f26769(final SubLObject var22, final SubLObject var54, final SubLObject var55) {
        final SubLObject var56 = module0365.f24854(var22, module0377.$g3196$.getGlobalValue(), (SubLObject)module0377.UNPROVIDED);
        final SubLObject var57 = (SubLObject)module0377.ZERO_INTEGER;
        module0365.f24872(var56, (SubLObject)module0377.$ic48$);
        module0365.f24874(var56, var57, (SubLObject)module0377.UNPROVIDED);
        final SubLObject var58 = module0363.f24507(var22);
        final SubLObject var59 = module0361.f24123(var58);
        if (module0377.NIL == module0065.f4772(var59, (SubLObject)module0377.$ic49$)) {
            final SubLObject var63_64 = var59;
            if (module0377.NIL == module0065.f4775(var63_64, (SubLObject)module0377.$ic49$)) {
                final SubLObject var60 = module0065.f4740(var63_64);
                final SubLObject var61 = (SubLObject)module0377.NIL;
                SubLObject var62;
                SubLObject var63;
                SubLObject var64;
                SubLObject var65;
                SubLObject var66;
                SubLObject var67;
                SubLObject var68;
                SubLObject var69;
                SubLObject var70;
                for (var62 = Sequences.length(var60), var63 = (SubLObject)module0377.NIL, var63 = (SubLObject)module0377.ZERO_INTEGER; var63.numL(var62); var63 = Numbers.add(var63, (SubLObject)module0377.ONE_INTEGER)) {
                    var64 = ((module0377.NIL != var61) ? Numbers.subtract(var62, var63, (SubLObject)module0377.ONE_INTEGER) : var63);
                    var65 = Vectors.aref(var60, var64);
                    if (module0377.NIL == module0065.f4749(var65) || module0377.NIL == module0065.f4773((SubLObject)module0377.$ic49$)) {
                        if (module0377.NIL != module0065.f4749(var65)) {
                            var65 = (SubLObject)module0377.$ic49$;
                        }
                        if (module0377.NIL != module0363.f24547(var22, var65)) {
                            var66 = var65;
                            var67 = module0077.f5333(module0369.f25473(var66));
                            for (var68 = module0032.f1741(var67), var69 = (SubLObject)module0377.NIL, var69 = module0032.f1742(var68, var67); module0377.NIL == module0032.f1744(var68, var69); var69 = module0032.f1743(var69)) {
                                var70 = module0032.f1745(var68, var69);
                                if (module0377.NIL != module0032.f1746(var69, var70)) {
                                    module0387.f27563(var70, var56);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject var73_74 = var59;
            if (module0377.NIL == module0065.f4777(var73_74)) {
                final SubLObject var71 = module0065.f4738(var73_74);
                SubLObject var72 = (SubLObject)module0377.NIL;
                SubLObject var73 = (SubLObject)module0377.NIL;
                final Iterator var74 = Hashtables.getEntrySetIterator(var71);
                try {
                    while (Hashtables.iteratorHasNext(var74)) {
                        final Map.Entry var75 = Hashtables.iteratorNextEntry(var74);
                        var72 = Hashtables.getEntryKey(var75);
                        var73 = Hashtables.getEntryValue(var75);
                        if (module0377.NIL != module0363.f24547(var22, var73)) {
                            final SubLObject var76 = var73;
                            final SubLObject var77 = module0077.f5333(module0369.f25473(var76));
                            SubLObject var78;
                            SubLObject var79;
                            SubLObject var80;
                            for (var78 = module0032.f1741(var77), var79 = (SubLObject)module0377.NIL, var79 = module0032.f1742(var78, var77); module0377.NIL == module0032.f1744(var78, var79); var79 = module0032.f1743(var79)) {
                                var80 = module0032.f1745(var78, var79);
                                if (module0377.NIL != module0032.f1746(var79, var80)) {
                                    module0387.f27563(var80, var56);
                                }
                            }
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var74);
                }
            }
        }
        return var56;
    }
    
    public static SubLObject f26770(final SubLObject var58, final SubLObject var72) {
        return var58;
    }
    
    public static SubLObject f26746(final SubLObject var53) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0377.NIL != module0364.f24699(var53) && module0377.$ic29$ == module0364.f24721(var53));
    }
    
    public static SubLObject f26771(final SubLObject var58) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0377.NIL != module0365.f24819(var58) && module0377.$ic29$ == module0365.f24866(var58));
    }
    
    public static SubLObject f26753(final SubLObject var78) {
        return module0365.f24871(var78);
    }
    
    public static SubLObject f26772(final SubLObject var53) {
        if (module0377.NIL != f26771(var53)) {
            return module0035.sublisp_boolean(f26753(var53));
        }
        return (SubLObject)module0377.NIL;
    }
    
    public static SubLObject f26773(final SubLObject var53) {
        if (module0377.NIL != f26771(var53)) {
            return Types.sublisp_null(f26753(var53));
        }
        return (SubLObject)module0377.NIL;
    }
    
    public static SubLObject f26774(final SubLObject var79) {
        assert module0377.NIL != f26773(var79) : var79;
        final SubLObject var80 = module0365.f24862(var79);
        if (module0377.NIL != module0052.f3674(var80)) {
            final SubLObject var81 = module0052.f3697(var80);
            if (var81.isList()) {
                final SubLObject var82 = var81.first();
                if (var82.isList()) {
                    final SubLObject var83 = var82.first();
                    if (module0377.NIL != module0174.f11035(var83)) {
                        return var83;
                    }
                }
            }
        }
        return (SubLObject)module0377.NIL;
    }
    
    public static SubLObject f26775(final SubLObject var78) {
        SubLObject var79 = f26753(var78);
        if (module0377.NIL == var79) {
            var79 = f26774(var78);
        }
        return var79;
    }
    
    public static SubLObject f26776(final SubLObject var53) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0377.NIL != module0366.f24916(var53) && module0377.NIL != f26746(module0366.f24937(var53)));
    }
    
    public static SubLObject f26777(final SubLObject var83) {
        assert module0377.NIL != f26776(var83) : var83;
        return module0366.f24966(var83).first();
    }
    
    public static SubLObject f26778(final SubLObject var83) {
        assert module0377.NIL != f26776(var83) : var83;
        return module0366.f24966(var83).rest();
    }
    
    public static SubLObject f26779(final SubLObject var83) {
        assert module0377.NIL != f26776(var83) : var83;
        return module0366.f24976(var83);
    }
    
    public static SubLObject f26780(final SubLObject var53) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0377.NIL != f26746(var53) || module0377.NIL != module0378.f26860(var53));
    }
    
    public static SubLObject f26781(final SubLObject var84) {
        if (module0377.NIL != f26746(var84)) {
            return f26749(var84);
        }
        if (module0377.NIL != module0378.f26860(var84)) {
            return module0378.f26878(var84);
        }
        return Errors.error((SubLObject)module0377.$ic52$, var84);
    }
    
    public static SubLObject f26782(final SubLObject var84) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0377.NIL == module0532.f33187(f26781(var84)));
    }
    
    public static SubLObject f26783(final SubLObject var53) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0377.NIL != module0366.f24916(var53) && module0377.NIL != f26780(module0366.f24937(var53)));
    }
    
    public static SubLObject f26784(final SubLObject var83) {
        if (module0377.NIL != f26776(var83)) {
            return f26777(var83);
        }
        if (module0377.NIL != module0378.f26897(var83)) {
            return module0378.f26898(var83);
        }
        return Errors.error((SubLObject)module0377.$ic53$, var83);
    }
    
    public static SubLObject f26785(final SubLObject var83) {
        if (module0377.NIL != f26776(var83)) {
            return module0366.f24937(var83);
        }
        if (module0377.NIL != module0378.f26897(var83)) {
            return module0378.f26894(var83);
        }
        return Errors.error((SubLObject)module0377.$ic53$, var83);
    }
    
    public static SubLObject f26786(final SubLObject var22, final SubLObject var54, final SubLObject var55) {
        final SubLThread var56 = SubLProcess.currentSubLThread();
        final SubLObject var57 = module0363.f24507(var22);
        final SubLObject var58 = module0018.$g644$.currentBinding(var56);
        final SubLObject var59 = module0018.$g648$.currentBinding(var56);
        final SubLObject var60 = module0018.$g645$.currentBinding(var56);
        final SubLObject var61 = module0018.$g646$.currentBinding(var56);
        try {
            module0018.$g644$.bind((SubLObject)module0377.T, var56);
            module0018.$g648$.bind((SubLObject)module0377.T, var56);
            module0018.$g645$.bind((SubLObject)module0377.T, var56);
            module0018.$g646$.bind(module0361.f24166(var57), var56);
            f26787(var22, var54, var55, (SubLObject)module0377.UNPROVIDED);
        }
        finally {
            module0018.$g646$.rebind(var61, var56);
            module0018.$g645$.rebind(var60, var56);
            module0018.$g648$.rebind(var59, var56);
            module0018.$g644$.rebind(var58, var56);
        }
        return (SubLObject)module0377.NIL;
    }
    
    public static SubLObject f26787(final SubLObject var22, final SubLObject var54, final SubLObject var55, SubLObject var87) {
        if (var87 == module0377.UNPROVIDED) {
            var87 = (SubLObject)module0377.NIL;
        }
        SubLObject var89;
        final SubLObject var88 = var89 = f26788(var54, var55, var87);
        SubLObject var90 = (SubLObject)module0377.NIL;
        var90 = var89.first();
        while (module0377.NIL != var89) {
            SubLObject var92;
            final SubLObject var91 = var92 = var90;
            SubLObject var93 = (SubLObject)module0377.NIL;
            SubLObject var94 = (SubLObject)module0377.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var92, var91, (SubLObject)module0377.$ic54$);
            var93 = var92.first();
            var92 = var92.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var92, var91, (SubLObject)module0377.$ic54$);
            var94 = var92.first();
            var92 = var92.rest();
            if (module0377.NIL == var92) {
                f26789(var22, var93, var94, (SubLObject)module0377.NIL);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var91, (SubLObject)module0377.$ic54$);
            }
            var89 = var89.rest();
            var90 = var89.first();
        }
        return var88;
    }
    
    public static SubLObject f26790(final SubLObject var22, final SubLObject var54, final SubLObject var15) {
        final SubLThread var55 = SubLProcess.currentSubLThread();
        SubLObject var56 = (SubLObject)module0377.NIL;
        var55.resetMultipleValues();
        final SubLObject var57 = f26791(var22);
        final SubLObject var58 = var55.secondMultipleValue();
        var55.resetMultipleValues();
        if (module0377.NIL != var58 && module0377.NIL == module0369.f25607(var57)) {
            SubLObject var59 = (SubLObject)module0377.NIL;
            final SubLObject var60 = module0077.f5333(module0369.f25509(var57));
            SubLObject var61;
            SubLObject var62;
            SubLObject var63;
            for (var61 = module0032.f1741(var60), var62 = (SubLObject)module0377.NIL, var62 = module0032.f1742(var61, var60); module0377.NIL == module0032.f1744(var61, var62); var62 = module0032.f1743(var62)) {
                var63 = module0032.f1745(var61, var62);
                if (module0377.NIL != module0032.f1746(var62, var63)) {
                    var59 = (SubLObject)ConsesLow.cons(var63, var59);
                }
            }
            var56 = module0525.f32693(var59);
        }
        else {
            final SubLObject var64 = module0340.f22871(var15);
            if (var64.isFunctionSpec()) {
                var56 = Functions.funcall(var64, var54);
            }
        }
        final SubLObject var65 = module0340.f22872(var15);
        SubLObject var66 = (SubLObject)module0377.NIL;
        if (!var65.isFunctionSpec()) {
            var66 = conses_high.copy_list(var56);
        }
        else {
            SubLObject var67 = var56;
            SubLObject var68 = (SubLObject)module0377.NIL;
            var68 = var67.first();
            while (module0377.NIL != var67) {
                if (module0377.NIL != Functions.funcall(var65, var54, var68)) {
                    var66 = (SubLObject)ConsesLow.cons(var68, var66);
                }
                var67 = var67.rest();
                var68 = var67.first();
            }
            var66 = Sequences.nreverse(var66);
        }
        var66 = Sequences.delete_if(Symbols.symbol_function((SubLObject)module0377.$ic55$), var66, (SubLObject)module0377.UNPROVIDED, (SubLObject)module0377.UNPROVIDED, (SubLObject)module0377.UNPROVIDED, (SubLObject)module0377.UNPROVIDED);
        if (module0377.NIL != f26792()) {
            var66 = f26793(var66, (SubLObject)module0377.UNPROVIDED);
        }
        return var66;
    }
    
    public static SubLObject f26794(final SubLObject var97) {
        return f26795(var97, module0147.f9496());
    }
    
    public static SubLObject f26796(final SubLObject var97, final SubLObject var56) {
        return module0211.f13662(var97, module0147.f9558(var56));
    }
    
    public static SubLObject f26795(final SubLObject var97, final SubLObject var56) {
        final SubLThread var98 = SubLProcess.currentSubLThread();
        final SubLObject var99 = module0034.$g879$.getDynamicValue(var98);
        SubLObject var100 = (SubLObject)module0377.NIL;
        if (module0377.NIL == var99) {
            return f26796(var97, var56);
        }
        var100 = module0034.f1857(var99, (SubLObject)module0377.$ic56$, (SubLObject)module0377.UNPROVIDED);
        if (module0377.NIL == var100) {
            var100 = module0034.f1807(module0034.f1842(var99), (SubLObject)module0377.$ic56$, (SubLObject)module0377.TWO_INTEGER, (SubLObject)module0377.NIL, (SubLObject)module0377.EQUAL, (SubLObject)module0377.UNPROVIDED);
            module0034.f1860(var99, (SubLObject)module0377.$ic56$, var100);
        }
        final SubLObject var101 = module0034.f1782(var97, var56);
        final SubLObject var102 = module0034.f1814(var100, var101, (SubLObject)module0377.UNPROVIDED);
        if (var102 != module0377.$ic57$) {
            SubLObject var103 = var102;
            SubLObject var104 = (SubLObject)module0377.NIL;
            var104 = var103.first();
            while (module0377.NIL != var103) {
                SubLObject var105 = var104.first();
                final SubLObject var106 = conses_high.second(var104);
                if (var97.equal(var105.first())) {
                    var105 = var105.rest();
                    if (module0377.NIL != var105 && module0377.NIL == var105.rest() && var56.equal(var105.first())) {
                        return module0034.f1959(var106);
                    }
                }
                var103 = var103.rest();
                var104 = var103.first();
            }
        }
        final SubLObject var107 = Values.arg2(var98.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f26796(var97, var56)));
        module0034.f1836(var100, var101, var102, var107, (SubLObject)ConsesLow.list(var97, var56));
        return module0034.f1959(var107);
    }
    
    public static SubLObject f26791(final SubLObject var22) {
        final SubLObject var23 = module0363.f24507(var22);
        SubLObject var24 = (SubLObject)module0377.NIL;
        SubLObject var25 = (SubLObject)module0377.NIL;
        SubLObject var26 = (SubLObject)module0377.NIL;
        if (module0377.NIL != module0361.f24192(var23)) {
            var26 = module0361.f24196(var23);
            var25 = module0369.f25514(var26);
            var24 = (SubLObject)SubLObjectFactory.makeBoolean(module0377.NIL == module0369.f25432(var26));
        }
        return Values.values(var26, (SubLObject)SubLObjectFactory.makeBoolean(module0377.NIL != var25 && module0377.NIL != var24));
    }
    
    public static SubLObject f26797(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        assert module0377.NIL != module0363.f24562(var22) : var22;
        final SubLObject var24 = module0363.f24564(var22);
        final SubLObject var25 = module0363.f24568(var22);
        SubLObject var26 = (SubLObject)module0377.NIL;
        final SubLObject var27 = module0363.f24507(var22);
        final SubLObject var28 = module0018.$g644$.currentBinding(var23);
        final SubLObject var29 = module0018.$g648$.currentBinding(var23);
        final SubLObject var30 = module0018.$g645$.currentBinding(var23);
        final SubLObject var31 = module0018.$g646$.currentBinding(var23);
        try {
            module0018.$g644$.bind((SubLObject)module0377.T, var23);
            module0018.$g648$.bind((SubLObject)module0377.T, var23);
            module0018.$g645$.bind((SubLObject)module0377.T, var23);
            module0018.$g646$.bind(module0361.f24166(var27), var23);
            var26 = f26788(var24, var25, (SubLObject)module0377.NIL);
        }
        finally {
            module0018.$g646$.rebind(var31, var23);
            module0018.$g645$.rebind(var30, var23);
            module0018.$g648$.rebind(var29, var23);
            module0018.$g644$.rebind(var28, var23);
        }
        return var26;
    }
    
    public static SubLObject f26788(final SubLObject var54, final SubLObject var55, final SubLObject var87) {
        return f26798(var54, var55, var87, (SubLObject)module0377.$ic59$);
    }
    
    public static SubLObject f26798(final SubLObject var54, final SubLObject var55, final SubLObject var87, final SubLObject var109) {
        final SubLThread var110 = SubLProcess.currentSubLThread();
        SubLObject var111 = (SubLObject)module0377.NIL;
        SubLObject var112 = (SubLObject)module0377.ZERO_INTEGER;
        final SubLObject var113 = module0205.f13333(var54);
        SubLObject var114 = (SubLObject)module0377.NIL;
        SubLObject var115;
        SubLObject var116;
        SubLObject var117;
        SubLObject var118;
        SubLObject var115_116;
        SubLObject var117_118;
        SubLObject var119_120;
        SubLObject var119;
        SubLObject var120;
        SubLObject var121;
        SubLObject var122;
        for (var115 = (SubLObject)module0377.NIL, var116 = (SubLObject)module0377.NIL, var116 = module0340.f22975(); module0377.NIL == var115 && module0377.NIL != var116; var116 = var116.rest()) {
            var117 = var116.first();
            if (module0377.NIL != module0340.f22910(var117, var87) && (module0377.NIL == var114 || module0377.NIL == conses_high.member(var117, var114, (SubLObject)module0377.UNPROVIDED, (SubLObject)module0377.UNPROVIDED)) && module0377.NIL != module0340.f22850(var117, var55) && module0377.NIL != module0340.f22878(var117, var113) && module0377.NIL != module0340.f22852(var117, var54) && module0377.NIL != module0340.f22856(var117) && module0377.NIL != module0340.f22885(var117)) {
                var118 = module0340.f22882(var117);
                if (module0377.NIL == var118 || (var118.isFunctionSpec() && module0377.NIL != Functions.funcall(var118, var54))) {
                    if (module0377.NIL != var118) {
                        var110.resetMultipleValues();
                        var115_116 = module0376.f26627(var117, var111, var114);
                        var117_118 = var110.secondMultipleValue();
                        var119_120 = var110.thirdMultipleValue();
                        var110.resetMultipleValues();
                        var115 = var115_116;
                        var111 = var117_118;
                        var114 = var119_120;
                    }
                    var119 = module0340.f22857(var117);
                    if (module0377.NIL == var119 || (var119.isFunctionSpec() && module0377.NIL != Functions.funcall(var119, var54))) {
                        var120 = module0340.f22865(var117, var54);
                        if (module0377.NIL != var120) {
                            var121 = module0360.f23935(var120);
                            if (var109.eql((SubLObject)module0377.$ic59$)) {
                                var122 = (SubLObject)ConsesLow.list(var117, var121);
                                var111 = (SubLObject)ConsesLow.cons(var122, var111);
                            }
                            else if (var109.eql((SubLObject)module0377.$ic60$)) {
                                var112 = module0360.f23944(var112, var121);
                            }
                        }
                    }
                }
            }
        }
        if (var109.eql((SubLObject)module0377.$ic59$)) {
            return var111;
        }
        if (var109.eql((SubLObject)module0377.$ic60$)) {
            return var112;
        }
        Errors.error((SubLObject)module0377.$ic61$, var109);
        return (SubLObject)module0377.NIL;
    }
    
    public static SubLObject f26799(final SubLObject var58) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0377.NIL != f26771(var58) && module0377.NIL != module0373.f26144(var58));
    }
    
    public static SubLObject f26800(final SubLObject var13, final SubLObject var14, final SubLObject var58, final SubLObject var16, final SubLObject var17, final SubLObject var18, final SubLObject var19) {
        final SubLObject var59 = module0363.f24565(var13);
        if (module0377.NIL == module0427.f30295(var17, var16, var59)) {
            Errors.warn((SubLObject)module0377.$ic62$, var17, var59, var16);
            return (SubLObject)module0377.NIL;
        }
        final SubLObject var60 = module0365.f24865(var58);
        final SubLObject var61 = f26737(var13, var14, var60, var16, var17, var18, var19);
        final SubLObject var62 = module0363.f24507(var13);
        module0361.f24393(var62, var17);
        module0378.f26881(var61);
        if (module0377.NIL != var14) {
            f26801(module0364.f24736(var14));
        }
        return var61;
    }
    
    public static SubLObject f26801(final SubLObject var22) {
        final SubLObject var23 = module0363.f24507(var22);
        final SubLObject var24 = module0361.f24123(var23);
        if (module0377.NIL == module0065.f4772(var24, (SubLObject)module0377.$ic49$)) {
            final SubLObject var63_123 = var24;
            if (module0377.NIL == module0065.f4775(var63_123, (SubLObject)module0377.$ic49$)) {
                final SubLObject var25 = module0065.f4740(var63_123);
                final SubLObject var26 = (SubLObject)module0377.NIL;
                SubLObject var27;
                SubLObject var28;
                SubLObject var29;
                SubLObject var30;
                SubLObject var31;
                SubLObject var32;
                SubLObject var33;
                SubLObject var34;
                SubLObject var35;
                SubLObject var36;
                SubLObject var37;
                for (var27 = Sequences.length(var25), var28 = (SubLObject)module0377.NIL, var28 = (SubLObject)module0377.ZERO_INTEGER; var28.numL(var27); var28 = Numbers.add(var28, (SubLObject)module0377.ONE_INTEGER)) {
                    var29 = ((module0377.NIL != var26) ? Numbers.subtract(var27, var28, (SubLObject)module0377.ONE_INTEGER) : var28);
                    var30 = Vectors.aref(var25, var29);
                    if (module0377.NIL == module0065.f4749(var30) || module0377.NIL == module0065.f4773((SubLObject)module0377.$ic49$)) {
                        if (module0377.NIL != module0065.f4749(var30)) {
                            var30 = (SubLObject)module0377.$ic49$;
                        }
                        if (module0377.NIL != module0363.f24547(var22, var30)) {
                            var31 = var30;
                            var32 = module0077.f5333(module0369.f25473(var31));
                            for (var33 = module0032.f1741(var32), var34 = (SubLObject)module0377.NIL, var34 = module0032.f1742(var33, var32); module0377.NIL == module0032.f1744(var33, var34); var34 = module0032.f1743(var34)) {
                                var35 = module0032.f1745(var33, var34);
                                if (module0377.NIL != module0032.f1746(var34, var35)) {
                                    module0367.f25107(var22, var35);
                                    if (module0377.NIL != module0392.f27957(var35)) {
                                        var36 = module0363.f24517(var22);
                                        var37 = (SubLObject)module0377.NIL;
                                        var37 = var36.first();
                                        while (module0377.NIL != var36) {
                                            module0367.f25230(var37, var35);
                                            var36 = var36.rest();
                                            var37 = var36.first();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject var73_125 = var24;
            if (module0377.NIL == module0065.f4777(var73_125)) {
                final SubLObject var38 = module0065.f4738(var73_125);
                SubLObject var39 = (SubLObject)module0377.NIL;
                SubLObject var40 = (SubLObject)module0377.NIL;
                final Iterator var41 = Hashtables.getEntrySetIterator(var38);
                try {
                    while (Hashtables.iteratorHasNext(var41)) {
                        final Map.Entry var42 = Hashtables.iteratorNextEntry(var41);
                        var39 = Hashtables.getEntryKey(var42);
                        var40 = Hashtables.getEntryValue(var42);
                        if (module0377.NIL != module0363.f24547(var22, var40)) {
                            final SubLObject var43 = var40;
                            final SubLObject var44 = module0077.f5333(module0369.f25473(var43));
                            SubLObject var45;
                            SubLObject var46;
                            SubLObject var47;
                            SubLObject var48;
                            SubLObject var49;
                            for (var45 = module0032.f1741(var44), var46 = (SubLObject)module0377.NIL, var46 = module0032.f1742(var45, var44); module0377.NIL == module0032.f1744(var45, var46); var46 = module0032.f1743(var46)) {
                                var47 = module0032.f1745(var45, var46);
                                if (module0377.NIL != module0032.f1746(var46, var47)) {
                                    module0367.f25107(var22, var47);
                                    if (module0377.NIL != module0392.f27957(var47)) {
                                        var48 = module0363.f24517(var22);
                                        var49 = (SubLObject)module0377.NIL;
                                        var49 = var48.first();
                                        while (module0377.NIL != var48) {
                                            module0367.f25230(var49, var47);
                                            var48 = var48.rest();
                                            var49 = var48.first();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var41);
                }
            }
        }
        return (SubLObject)module0377.NIL;
    }
    
    public static SubLObject f26789(final SubLObject var22, final SubLObject var15, final SubLObject var59, final SubLObject var26) {
        final SubLObject var60 = module0365.f24854(var22, var15, var26);
        final SubLObject var61 = (SubLObject)module0377.$ic48$;
        module0365.f24874(var60, var59, (SubLObject)module0377.UNPROVIDED);
        module0365.f24872(var60, var61);
        final SubLObject var62 = module0363.f24507(var22);
        final SubLObject var63 = module0361.f24123(var62);
        if (module0377.NIL == module0065.f4772(var63, (SubLObject)module0377.$ic49$)) {
            final SubLObject var63_127 = var63;
            if (module0377.NIL == module0065.f4775(var63_127, (SubLObject)module0377.$ic49$)) {
                final SubLObject var64 = module0065.f4740(var63_127);
                final SubLObject var65 = (SubLObject)module0377.NIL;
                SubLObject var66;
                SubLObject var67;
                SubLObject var68;
                SubLObject var69;
                SubLObject var70;
                SubLObject var71;
                SubLObject var72;
                SubLObject var73;
                SubLObject var74;
                for (var66 = Sequences.length(var64), var67 = (SubLObject)module0377.NIL, var67 = (SubLObject)module0377.ZERO_INTEGER; var67.numL(var66); var67 = Numbers.add(var67, (SubLObject)module0377.ONE_INTEGER)) {
                    var68 = ((module0377.NIL != var65) ? Numbers.subtract(var66, var67, (SubLObject)module0377.ONE_INTEGER) : var67);
                    var69 = Vectors.aref(var64, var68);
                    if (module0377.NIL == module0065.f4749(var69) || module0377.NIL == module0065.f4773((SubLObject)module0377.$ic49$)) {
                        if (module0377.NIL != module0065.f4749(var69)) {
                            var69 = (SubLObject)module0377.$ic49$;
                        }
                        if (module0377.NIL != module0363.f24547(var22, var69)) {
                            var70 = var69;
                            var71 = module0077.f5333(module0369.f25473(var70));
                            for (var72 = module0032.f1741(var71), var73 = (SubLObject)module0377.NIL, var73 = module0032.f1742(var72, var71); module0377.NIL == module0032.f1744(var72, var73); var73 = module0032.f1743(var73)) {
                                var74 = module0032.f1745(var72, var73);
                                if (module0377.NIL != module0032.f1746(var73, var74)) {
                                    module0387.f27563(var74, var60);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject var73_128 = var63;
            if (module0377.NIL == module0065.f4777(var73_128)) {
                final SubLObject var75 = module0065.f4738(var73_128);
                SubLObject var76 = (SubLObject)module0377.NIL;
                SubLObject var77 = (SubLObject)module0377.NIL;
                final Iterator var78 = Hashtables.getEntrySetIterator(var75);
                try {
                    while (Hashtables.iteratorHasNext(var78)) {
                        final Map.Entry var79 = Hashtables.iteratorNextEntry(var78);
                        var76 = Hashtables.getEntryKey(var79);
                        var77 = Hashtables.getEntryValue(var79);
                        if (module0377.NIL != module0363.f24547(var22, var77)) {
                            final SubLObject var80 = var77;
                            final SubLObject var81 = module0077.f5333(module0369.f25473(var80));
                            SubLObject var82;
                            SubLObject var83;
                            SubLObject var84;
                            for (var82 = module0032.f1741(var81), var83 = (SubLObject)module0377.NIL, var83 = module0032.f1742(var82, var81); module0377.NIL == module0032.f1744(var82, var83); var83 = module0032.f1743(var83)) {
                                var84 = module0032.f1745(var82, var83);
                                if (module0377.NIL != module0032.f1746(var83, var84)) {
                                    module0387.f27563(var84, var60);
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
        return var60;
    }
    
    public static SubLObject f26802(final SubLObject var58, final SubLObject var72) {
        return var58;
    }
    
    public static SubLObject f26803(final SubLObject var46, final SubLObject var47) {
        SubLObject var49;
        final SubLObject var48 = var49 = var46.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var49, var48, (SubLObject)module0377.$ic63$);
        final SubLObject var50 = var49.rest();
        var49 = var49.first();
        SubLObject var51 = (SubLObject)module0377.NIL;
        SubLObject var52 = (SubLObject)module0377.NIL;
        SubLObject var53 = (SubLObject)module0377.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var49, var48, (SubLObject)module0377.$ic63$);
        var51 = var49.first();
        var49 = var49.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var49, var48, (SubLObject)module0377.$ic63$);
        var52 = var49.first();
        var49 = var49.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var49, var48, (SubLObject)module0377.$ic63$);
        var53 = var49.first();
        var49 = var49.rest();
        if (module0377.NIL == var49) {
            final SubLObject var54;
            var49 = (var54 = var50);
            final SubLObject var55 = (SubLObject)module0377.$ic64$;
            return (SubLObject)ConsesLow.list((SubLObject)module0377.$ic40$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var55, var51)), (SubLObject)ConsesLow.list((SubLObject)module0377.$ic65$, var52, (SubLObject)ConsesLow.list((SubLObject)module0377.$ic40$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0377.$ic66$, (SubLObject)ConsesLow.list((SubLObject)module0377.$ic67$, var55)), (SubLObject)ConsesLow.list((SubLObject)module0377.$ic68$, var53)), (SubLObject)ConsesLow.listS((SubLObject)module0377.$ic69$, (SubLObject)ConsesLow.list((SubLObject)module0377.$ic70$, var55), ConsesLow.append(var54, (SubLObject)module0377.NIL)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var48, (SubLObject)module0377.$ic63$);
        return (SubLObject)module0377.NIL;
    }
    
    public static SubLObject f26804(final SubLObject var58, final SubLObject var56, final SubLObject var54, final SubLObject var55) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        final SubLObject var60 = module0147.f9540(var56);
        final SubLObject var61 = module0147.$g2095$.currentBinding(var59);
        final SubLObject var62 = module0147.$g2094$.currentBinding(var59);
        final SubLObject var63 = module0147.$g2096$.currentBinding(var59);
        final SubLObject var64 = module0347.$g2969$.currentBinding(var59);
        final SubLObject var65 = module0347.$g2970$.currentBinding(var59);
        try {
            module0147.$g2095$.bind(module0147.f9545(var60), var59);
            module0147.$g2094$.bind(module0147.f9546(var60), var59);
            module0147.$g2096$.bind(module0147.f9549(var60), var59);
            module0347.$g2969$.bind(module0365.f24865(var58), var59);
            module0347.$g2970$.bind(var55, var59);
            final SubLObject var66 = module0365.f24879(var58);
            final SubLObject var33_135 = module0018.$g644$.currentBinding(var59);
            final SubLObject var34_136 = module0018.$g648$.currentBinding(var59);
            final SubLObject var35_137 = module0018.$g645$.currentBinding(var59);
            final SubLObject var86_138 = module0018.$g646$.currentBinding(var59);
            try {
                module0018.$g644$.bind((SubLObject)module0377.T, var59);
                module0018.$g648$.bind((SubLObject)module0377.T, var59);
                module0018.$g645$.bind((SubLObject)module0377.T, var59);
                module0018.$g646$.bind(module0361.f24166(var66), var59);
                if (module0377.NIL != module0365.f24883(var58)) {
                    module0365.f24897(var58);
                }
                else {
                    final SubLObject var67 = f26805(var58, var54, var55);
                    if (module0377.NIL != var67) {
                        if (var67.isList()) {
                            SubLObject var68 = var67;
                            SubLObject var69 = (SubLObject)module0377.NIL;
                            var69 = var68.first();
                            while (module0377.NIL != var68) {
                                f26806(var58, var69);
                                var68 = var68.rest();
                                var69 = var68.first();
                            }
                        }
                        else {
                            module0365.f24896(var58, var67);
                        }
                    }
                }
            }
            finally {
                module0018.$g646$.rebind(var86_138, var59);
                module0018.$g645$.rebind(var35_137, var59);
                module0018.$g648$.rebind(var34_136, var59);
                module0018.$g644$.rebind(var33_135, var59);
            }
        }
        finally {
            module0347.$g2970$.rebind(var65, var59);
            module0347.$g2969$.rebind(var64, var59);
            module0147.$g2096$.rebind(var63, var59);
            module0147.$g2094$.rebind(var62, var59);
            module0147.$g2095$.rebind(var61, var59);
        }
        return var58;
    }
    
    public static SubLObject f26805(final SubLObject var58, final SubLObject var54, final SubLObject var55) {
        if (module0377.NIL != f26766(var58)) {
            return f26807(var58, var54, var55);
        }
        if (module0377.NIL == f26753(var58)) {
            return f26808(var58, var54);
        }
        return f26809(var58, var54);
    }
    
    public static SubLObject f26807(final SubLObject var58, final SubLObject var54, final SubLObject var55) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        final SubLObject var60 = module0365.f24851(var58);
        if (module0377.NIL == Errors.$ignore_mustsP$.getDynamicValue(var59) && var60 != module0377.$ic47$) {
            Errors.error((SubLObject)module0377.$ic71$, var60);
        }
        final SubLObject var61 = (SubLObject)module0377.NIL;
        final SubLObject var62 = module0365.f24850(var58);
        SubLObject var64;
        final SubLObject var63 = var64 = f26788(var54, var55, (SubLObject)module0377.NIL);
        SubLObject var65 = (SubLObject)module0377.NIL;
        var65 = var64.first();
        while (module0377.NIL != var64) {
            SubLObject var67;
            final SubLObject var66 = var67 = var65;
            SubLObject var68 = (SubLObject)module0377.NIL;
            SubLObject var69 = (SubLObject)module0377.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var67, var66, (SubLObject)module0377.$ic54$);
            var68 = var67.first();
            var67 = var67.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var67, var66, (SubLObject)module0377.$ic54$);
            var69 = var67.first();
            var67 = var67.rest();
            if (module0377.NIL == var67) {
                f26789(var62, var68, var69, (SubLObject)module0377.NIL);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var66, (SubLObject)module0377.$ic54$);
            }
            var64 = var64.rest();
            var65 = var64.first();
        }
        return var61;
    }
    
    public static SubLObject f26808(final SubLObject var58, final SubLObject var54) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        SubLObject var60 = (SubLObject)module0377.NIL;
        final SubLObject var61 = module0365.f24850(var58);
        final SubLObject var62 = module0365.f24865(var58);
        var60 = f26790(var61, var54, var62);
        final SubLObject var63 = module0365.f24852(var58);
        final SubLObject var64 = module0360.f23935(Sequences.length(var60));
        module0365.f24874(var58, var64, (SubLObject)module0377.NIL);
        if (module0377.NIL != module0035.f2000(var60, module0377.$g3197$.getDynamicValue(var59), (SubLObject)module0377.UNPROVIDED)) {
            var60 = f26810(var58, var60);
        }
        return var60;
    }
    
    public static SubLObject f26810(final SubLObject var58, final SubLObject var88) {
        return module0365.f24906((SubLObject)module0377.$ic72$, var58, var88);
    }
    
    public static SubLObject f26806(final SubLObject var78, final SubLObject var26) {
        final SubLThread var79 = SubLProcess.currentSubLThread();
        final SubLObject var80 = f26753(var78);
        if (module0377.NIL == Errors.$ignore_mustsP$.getDynamicValue(var79) && module0377.NIL != var80) {
            Errors.error((SubLObject)module0377.$ic73$, var78, var80);
        }
        final SubLObject var81 = module0365.f24850(var78);
        final SubLObject var82 = module0365.f24865(var78);
        final SubLObject var83 = module0360.f23935((SubLObject)module0377.ONE_INTEGER);
        module0365.f24892(var78, (SubLObject)module0377.UNPROVIDED);
        return f26789(var81, var82, var83, var26);
    }
    
    public static SubLObject f26809(final SubLObject var58, final SubLObject var54) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        final SubLObject var60 = (SubLObject)module0377.NIL;
        final SubLObject var61 = module0347.$g2966$.currentBinding(var59);
        try {
            module0347.$g2966$.bind((SubLObject)module0377.$ic74$, var59);
            final SubLObject var62 = module0365.f24865(var58);
            final SubLObject var63 = f26753(var58);
            final SubLObject var64 = module0340.f22873(var62);
            if (var64.isFunctionSpec()) {
                Functions.funcall(var64, var54, var63);
            }
        }
        finally {
            module0347.$g2966$.rebind(var61, var59);
        }
        return var60;
    }
    
    public static SubLObject f26811(final SubLObject var17, final SubLObject var147, final SubLObject var148, SubLObject var149, SubLObject var150, final SubLObject var18) {
        final SubLThread var151 = SubLProcess.currentSubLThread();
        var149 = module0233.f15392(var149);
        var149 = module0233.f15394(var149);
        if (module0377.NIL != module0377.$g3198$.getDynamicValue(var151)) {
            var149 = module0233.f15395(var149);
        }
        final SubLObject var152 = module0373.f26105();
        final SubLObject var153 = module0202.f12765(var150);
        if (module0377.NIL != f26812(var17, (SubLObject)module0377.NIL)) {
            final SubLObject var154 = f26756(var17, (SubLObject)module0377.NIL);
            var150 = f26813(var150, var154);
        }
        if (module0377.NIL != f26814(var17)) {
            final SubLObject var155 = module0349.f23505(var17);
            var150 = f26813(var150, var155);
        }
        final SubLObject var156 = f26815(var147, var150, var17, var149);
        if (module0377.NIL != var156) {
            final SubLObject var157 = module0232.f15330((SubLObject)module0377.NIL, var156);
            var150 = f26813(var150, var157);
        }
        final SubLObject var158 = f26816(var150);
        final SubLObject var159 = f26816(var153);
        final SubLObject var160 = f26817(var149);
        return f26818(var152, var160, var17, var18, var158, var159);
    }
    
    public static SubLObject f26814(final SubLObject var26) {
        final SubLThread var27 = SubLProcess.currentSubLThread();
        if (module0377.NIL == module0377.$g3199$.getDynamicValue(var27)) {
            return (SubLObject)module0377.NIL;
        }
        return (SubLObject)module0377.T;
    }
    
    public static SubLObject f26815(final SubLObject var147, final SubLObject var150, final SubLObject var17, final SubLObject var149) {
        final SubLObject var151 = module0351.f23570(var147, var150, var17);
        SubLObject var152 = (SubLObject)module0377.NIL;
        SubLObject var153 = var151;
        SubLObject var154 = (SubLObject)module0377.NIL;
        var154 = var153.first();
        while (module0377.NIL != var153) {
            final SubLObject var155 = module0233.f15362(var149, var154);
            if (module0377.NIL == module0193.f12105(var155)) {
                var152 = (SubLObject)ConsesLow.cons(var154, var152);
            }
            var153 = var153.rest();
            var154 = var153.first();
        }
        return Sequences.nreverse(var152);
    }
    
    public static SubLObject f26813(final SubLObject var160, final SubLObject var161) {
        return module0232.f15330(ConsesLow.append(module0232.f15306(var160), module0232.f15306(var161)), ConsesLow.append(module0232.f15308(var160), module0232.f15308(var161)));
    }
    
    public static SubLObject f26819(final SubLObject var162, final SubLObject var163) {
        return f26813(module0202.f12765(var162), var163);
    }
    
    public static SubLObject f26818(final SubLObject var58, final SubLObject var16, final SubLObject var17, final SubLObject var18, final SubLObject var155, final SubLObject var156) {
        final SubLThread var157 = SubLProcess.currentSubLThread();
        final SubLObject var158 = module0365.f24850(var58);
        final SubLObject var159 = module0363.f24507(var158);
        final SubLObject var160 = module0233.f15362(var16, var155);
        SubLObject var161 = (SubLObject)module0377.NIL;
        if (module0377.NIL == module0232.f15316(var160)) {
            final SubLObject var162 = module0370.f25906(var160, module0147.$g2095$.getDynamicValue(var157));
            final SubLObject var163 = module0361.f24171(module0363.f24507(module0365.f24850(var58)));
            if (module0377.NIL == f26820(var162, var163)) {
                return (SubLObject)module0377.NIL;
            }
            var161 = module0373.f26435(var159, var162, (SubLObject)module0377.UNPROVIDED);
        }
        final SubLObject var164 = f26821(var155, var156, var160, var16, var161);
        return f26800(var158, var161, var58, var16, var17, var18, var164);
    }
    
    public static SubLObject f26821(final SubLObject var155, final SubLObject var156, final SubLObject var164, final SubLObject var16, final SubLObject var14) {
        final SubLThread var165 = SubLProcess.currentSubLThread();
        if (var155.equal(var156)) {
            return (SubLObject)module0377.NIL;
        }
        final SubLObject var166 = module0204.f13119(var155, var156);
        final SubLObject var167 = module0233.f15362(var16, var166);
        final SubLObject var168 = module0370.f25906(var167, module0147.$g2095$.getDynamicValue(var165));
        final SubLObject var169 = module0233.f15376(module0364.f24737(var14), var168);
        return var169;
    }
    
    public static SubLObject f26820(final SubLObject var165, final SubLObject var166) {
        SubLObject var167 = var165;
        SubLObject var168 = (SubLObject)module0377.NIL;
        var168 = var167.first();
        while (module0377.NIL != var167) {
            SubLObject var169 = (SubLObject)module0377.ZERO_INTEGER;
            SubLObject var27_172 = module0232.f15306(var168);
            SubLObject var170 = (SubLObject)module0377.NIL;
            var170 = var27_172.first();
            while (module0377.NIL != var27_172) {
                final SubLObject var171 = (SubLObject)module0377.$ic75$;
                if (module0377.NIL == f26822(var170, var171, var166)) {
                    return (SubLObject)module0377.NIL;
                }
                var169 = Numbers.add(var169, (SubLObject)module0377.ONE_INTEGER);
                var27_172 = var27_172.rest();
                var170 = var27_172.first();
            }
            var169 = (SubLObject)module0377.ZERO_INTEGER;
            SubLObject var27_173 = module0232.f15308(var168);
            var170 = (SubLObject)module0377.NIL;
            var170 = var27_173.first();
            while (module0377.NIL != var27_173) {
                final SubLObject var171 = (SubLObject)module0377.$ic76$;
                if (module0377.NIL == f26822(var170, var171, var166)) {
                    return (SubLObject)module0377.NIL;
                }
                var169 = Numbers.add(var169, (SubLObject)module0377.ONE_INTEGER);
                var27_173 = var27_173.rest();
                var170 = var27_173.first();
            }
            var167 = var167.rest();
            var168 = var167.first();
        }
        return (SubLObject)module0377.T;
    }
    
    public static SubLObject f26822(final SubLObject var173, final SubLObject var55, final SubLObject var166) {
        SubLObject var174 = (SubLObject)module0377.NIL;
        SubLObject var175 = (SubLObject)module0377.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var173, var173, (SubLObject)module0377.$ic77$);
        var174 = var173.first();
        SubLObject var176 = var173.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var176, var173, (SubLObject)module0377.$ic77$);
        var175 = var176.first();
        var176 = var176.rest();
        if (module0377.NIL == var176) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0377.NIL != f26823(var175) && (module0377.NIL != var166 || module0377.NIL == module0205.f13332(var175, module0377.$ic78$) || module0377.NIL != f26824(var175, var55)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var173, (SubLObject)module0377.$ic77$);
        return (SubLObject)module0377.NIL;
    }
    
    public static SubLObject f26823(final SubLObject var54) {
        return module0206.f13433(var54);
    }
    
    public static SubLObject f26824(final SubLObject var54, final SubLObject var55) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0377.$ic76$ == var55 && module0377.NIL != module0347.f23370(var54));
    }
    
    public static SubLObject f26825(final SubLObject var21, final SubLObject var177, final SubLObject var178) {
        assert module0377.NIL != f26746(var21) : var21;
        if (module0377.NIL != var177 && !module0377.areAssertionsDisabledFor(me) && module0377.NIL == module0366.f24916(var177)) {
            throw new AssertionError(var177);
        }
        final SubLObject var179 = f26747(var21);
        final SubLObject var180 = (SubLObject)((module0377.NIL != var177) ? module0366.f24934(var177) : module0377.NIL);
        final SubLObject var181 = (SubLObject)((module0377.NIL != var177) ? ConsesLow.list(var177) : module0377.NIL);
        final SubLObject var182 = f26826(var178, var179, var180);
        return module0373.f26221(var21, var182, var181);
    }
    
    public static SubLObject f26826(final SubLObject var182, final SubLObject var16, final SubLObject var179) {
        final SubLObject var183 = module0233.f15384(var182, var179);
        final SubLObject var184 = f26827(var16, var183);
        final SubLObject var185 = f26828(var184);
        final SubLObject var186 = module0373.f26258(var185);
        return var186;
    }
    
    public static SubLObject f26816(final SubLObject var150) {
        return module0234.f15470(var150);
    }
    
    public static SubLObject f26817(final SubLObject var149) {
        SubLObject var150 = f26829(var149);
        final SubLObject var151 = module0233.f15398(var150);
        if (module0377.NIL != var151) {
            SubLObject var152 = (SubLObject)module0377.NIL;
            SubLObject var153 = var150;
            SubLObject var154 = (SubLObject)module0377.NIL;
            var154 = var153.first();
            while (module0377.NIL != var153) {
                final SubLObject var155 = module0233.f15370(var154);
                final SubLObject var156 = module0233.f15362(var151, var155);
                var152 = (SubLObject)ConsesLow.cons(module0233.f15340(module0233.f15355(var154), var156), var152);
                var153 = var153.rest();
                var154 = var153.first();
            }
            var150 = Sequences.nreverse(var152);
        }
        return var150;
    }
    
    public static SubLObject f26829(final SubLObject var149) {
        return module0234.f15470(var149);
    }
    
    public static SubLObject f26830(final SubLObject var190) {
        assert module0377.NIL != f26776(var190) : var190;
        final SubLObject var191 = module0366.f24937(var190);
        final SubLObject var192 = f26779(var190);
        final SubLObject var193 = (SubLObject)((module0377.NIL != var192) ? module0366.f24934(var192) : module0377.NIL);
        final SubLObject var194 = f26831(var191, var193);
        return var194;
    }
    
    public static SubLObject f26831(final SubLObject var21, final SubLObject var179) {
        assert module0377.NIL != f26746(var21) : var21;
        assert module0377.NIL != module0233.f15349(var179) : var179;
        final SubLObject var180 = f26759(var21);
        final SubLObject var181 = f26747(var21);
        final SubLObject var182 = module0233.f15384(var180, var179);
        final SubLObject var183 = f26827(var181, var182);
        final SubLObject var184 = f26832(var183);
        return var184;
    }
    
    public static SubLObject f26833(final SubLObject var190) {
        assert module0377.NIL != f26776(var190) : var190;
        final SubLObject var191 = f26777(var190);
        final SubLObject var192 = f26834(var191);
        final SubLObject var193 = f26830(var190);
        final SubLObject var194 = module0233.f15385(var192, var193);
        return var194;
    }
    
    public static SubLObject f26835(final SubLObject var190) {
        final SubLObject var191 = module0366.f24934(var190);
        final SubLObject var192 = module0366.f24937(var190);
        final SubLObject var193 = f26747(var192);
        final SubLObject var194 = module0233.f15362(var193, var191);
        final SubLObject var195 = f26777(var190);
        final SubLObject var196 = f26834(var195);
        return module0233.f15385(var196, var194);
    }
    
    public static SubLObject f26827(final SubLObject var16, final SubLObject var183) {
        final SubLObject var184 = ConsesLow.append(var183, var16);
        if (module0377.NIL != module0373.f26263(var184)) {
            return var184;
        }
        final SubLObject var185 = module0373.f26261(var184);
        final SubLObject var186 = ConsesLow.append(var185, var184);
        SubLObject var187 = (SubLObject)module0377.NIL;
        SubLObject var188 = (SubLObject)module0377.NIL;
        SubLObject var189 = var186;
        SubLObject var190 = (SubLObject)module0377.NIL;
        var190 = var189.first();
        while (module0377.NIL != var189) {
            if (module0377.NIL != module0373.f26264(var190)) {
                var187 = (SubLObject)ConsesLow.cons(var190, var187);
            }
            else {
                var188 = (SubLObject)ConsesLow.cons(var190, var188);
            }
            var189 = var189.rest();
            var190 = var189.first();
        }
        var187 = Sequences.nreverse(var187);
        var188 = Sequences.nreverse(var188);
        if (module0377.NIL == var187) {
            Errors.error((SubLObject)module0377.$ic81$, var16, var183);
        }
        final SubLObject var191 = module0233.f15375(var187, var188);
        if (var16.equal(var191) && var183.equal(var187)) {
            Errors.error((SubLObject)module0377.$ic82$, var16, var183);
        }
        return f26827(var191, var187);
    }
    
    public static SubLObject f26828(final SubLObject var201) {
        SubLObject var202 = (SubLObject)module0377.NIL;
        SubLObject var203 = var201;
        SubLObject var204 = (SubLObject)module0377.NIL;
        var204 = var203.first();
        while (module0377.NIL != var203) {
            final SubLObject var205 = module0233.f15355(var204);
            if (module0377.NIL != f26836(var205)) {
                var202 = (SubLObject)ConsesLow.cons(var204, var202);
            }
            var203 = var203.rest();
            var204 = var203.first();
        }
        return Sequences.nreverse(var202);
    }
    
    public static SubLObject f26836(final SubLObject var44) {
        return module0234.f15458(var44);
    }
    
    public static SubLObject f26832(final SubLObject var201) {
        SubLObject var202 = (SubLObject)module0377.NIL;
        SubLObject var203 = var201;
        SubLObject var204 = (SubLObject)module0377.NIL;
        var204 = var203.first();
        while (module0377.NIL != var203) {
            final SubLObject var205 = module0233.f15355(var204);
            if (module0377.NIL != f26837(var205)) {
                var202 = (SubLObject)ConsesLow.cons(var204, var202);
            }
            var203 = var203.rest();
            var204 = var203.first();
        }
        return Sequences.nreverse(var202);
    }
    
    public static SubLObject f26837(final SubLObject var44) {
        return module0234.f15464(var44);
    }
    
    public static SubLObject f26834(final SubLObject var17) {
        assert module0377.NIL != module0178.f11290(var17) : var17;
        final SubLObject var18 = module0178.f11294(var17);
        SubLObject var19 = (SubLObject)module0377.NIL;
        SubLObject var20 = (SubLObject)module0377.NIL;
        SubLObject var21 = (SubLObject)module0377.NIL;
        SubLObject var22 = (SubLObject)module0377.NIL;
        var20 = var18;
        var21 = var20.first();
        for (var22 = (SubLObject)module0377.ZERO_INTEGER; module0377.NIL != var20; var20 = var20.rest(), var21 = var20.first(), var22 = Numbers.add((SubLObject)module0377.ONE_INTEGER, var22)) {
            final SubLObject var23 = module0234.f15466(module0193.f12079(var22));
            final SubLObject var24 = module0201.f12550(var21);
            var19 = module0233.f15345(var24, var23, var19);
        }
        var19 = Sequences.nreverse(var19);
        return var19;
    }
    
    public static SubLObject f26812(final SubLObject var17, SubLObject var56) {
        if (var56 == module0377.UNPROVIDED) {
            var56 = (SubLObject)module0377.NIL;
        }
        final SubLThread var57 = SubLProcess.currentSubLThread();
        assert module0377.NIL != module0178.f11290(var17) : var17;
        SubLObject var58 = (SubLObject)module0377.NIL;
        final SubLObject var59 = var56;
        final SubLObject var60 = module0147.$g2094$.currentBinding(var57);
        final SubLObject var61 = module0147.$g2095$.currentBinding(var57);
        try {
            module0147.$g2094$.bind(module0147.f9531(var59), var57);
            module0147.$g2095$.bind(module0147.f9534(var59), var57);
            var58 = Numbers.plusp(module0217.f14329(var17));
        }
        finally {
            module0147.$g2095$.rebind(var61, var57);
            module0147.$g2094$.rebind(var60, var57);
        }
        return var58;
    }
    
    public static SubLObject f26756(final SubLObject var17, SubLObject var56) {
        if (var56 == module0377.UNPROVIDED) {
            var56 = (SubLObject)module0377.NIL;
        }
        return module0528.f32959(f26838(var17, var56));
    }
    
    public static SubLObject f26839(final SubLObject var26, final SubLObject var211) {
        final SubLObject var212 = module0377.$ic84$.equal(var211) ? module0178.f11287(var26) : var211;
        final SubLObject var213 = (module0377.NIL != module0377.$g3200$.getGlobalValue() && module0377.NIL != f26812(var26, var212)) ? f26838(var26, var212) : module0232.f15315();
        return var213;
    }
    
    public static SubLObject f26838(final SubLObject var17, SubLObject var56) {
        if (var56 == module0377.UNPROVIDED) {
            var56 = (SubLObject)module0377.NIL;
        }
        final SubLThread var57 = SubLProcess.currentSubLThread();
        assert module0377.NIL != module0174.f11035(var17) : var17;
        SubLObject var58 = module0232.f15330((SubLObject)module0377.NIL, (SubLObject)module0377.NIL);
        final SubLObject var59 = var56;
        final SubLObject var60 = module0147.$g2094$.currentBinding(var57);
        final SubLObject var61 = module0147.$g2095$.currentBinding(var57);
        try {
            module0147.$g2094$.bind(module0147.f9531(var59), var57);
            module0147.$g2095$.bind(module0147.f9534(var59), var57);
            if (module0377.NIL != module0158.f10221(var17, (SubLObject)module0377.NIL)) {
                final SubLObject var62 = module0158.f10222(var17, (SubLObject)module0377.NIL);
                SubLObject var63 = (SubLObject)module0377.NIL;
                final SubLObject var64 = (SubLObject)module0377.NIL;
                while (module0377.NIL == var63) {
                    final SubLObject var65 = module0052.f3695(var62, var64);
                    final SubLObject var66 = (SubLObject)SubLObjectFactory.makeBoolean(!var64.eql(var65));
                    if (module0377.NIL != var66) {
                        SubLObject var67 = (SubLObject)module0377.NIL;
                        try {
                            var67 = module0158.f10316(var65, (SubLObject)module0377.$ic86$, (SubLObject)module0377.NIL, (SubLObject)module0377.NIL);
                            SubLObject var216_221 = (SubLObject)module0377.NIL;
                            final SubLObject var217_222 = (SubLObject)module0377.NIL;
                            while (module0377.NIL == var216_221) {
                                final SubLObject var68 = module0052.f3695(var67, var217_222);
                                final SubLObject var219_224 = (SubLObject)SubLObjectFactory.makeBoolean(!var217_222.eql(var68));
                                if (module0377.NIL != var219_224) {
                                    var58 = f26840(var17, var68, var58);
                                }
                                var216_221 = (SubLObject)SubLObjectFactory.makeBoolean(module0377.NIL == var219_224);
                            }
                        }
                        finally {
                            final SubLObject var33_225 = Threads.$is_thread_performing_cleanupP$.currentBinding(var57);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0377.T, var57);
                                if (module0377.NIL != var67) {
                                    module0158.f10319(var67);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var33_225, var57);
                            }
                        }
                    }
                    var63 = (SubLObject)SubLObjectFactory.makeBoolean(module0377.NIL == var66);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var61, var57);
            module0147.$g2094$.rebind(var60, var57);
        }
        return var58;
    }
    
    public static SubLObject f26840(final SubLObject var17, final SubLObject var223, final SubLObject var226) {
        SubLObject var227 = module0232.f15306(var226);
        SubLObject var228 = module0232.f15308(var226);
        final SubLObject var229 = module0178.f11282(var17);
        final SubLObject var230 = module0178.f11282(var223);
        SubLObject var231 = module0232.f15306(var230);
        SubLObject var232 = (SubLObject)module0377.NIL;
        var232 = var231.first();
        while (module0377.NIL != var231) {
            final SubLObject var233;
            var232 = (var233 = f26841(var232, var226, var229));
            if (module0377.NIL == conses_high.member(var233, var228, Symbols.symbol_function((SubLObject)module0377.EQUAL), Symbols.symbol_function((SubLObject)module0377.IDENTITY))) {
                var228 = (SubLObject)ConsesLow.cons(var233, var228);
            }
            var231 = var231.rest();
            var232 = var231.first();
        }
        var231 = module0232.f15308(var230);
        var232 = (SubLObject)module0377.NIL;
        var232 = var231.first();
        while (module0377.NIL != var231) {
            if (module0377.NIL == module0202.f12652(var232)) {
                final SubLObject var233;
                var232 = (var233 = f26841(var232, var226, var229));
                if (module0377.NIL == conses_high.member(var233, var227, Symbols.symbol_function((SubLObject)module0377.EQUAL), Symbols.symbol_function((SubLObject)module0377.IDENTITY))) {
                    var227 = (SubLObject)ConsesLow.cons(var233, var227);
                }
            }
            var231 = var231.rest();
            var232 = var231.first();
        }
        return module0204.f13040(var227, var228, var226);
    }
    
    public static SubLObject f26841(final SubLObject var233, final SubLObject var226, final SubLObject var234) {
        final SubLThread var235 = SubLProcess.currentSubLThread();
        SubLObject var236 = var233;
        final SubLObject var237 = module0377.$g3201$.currentBinding(var235);
        final SubLObject var238 = module0377.$g3202$.currentBinding(var235);
        try {
            module0377.$g3201$.bind(var226, var235);
            module0377.$g3202$.bind(var234, var235);
            final SubLObject var239 = module0205.f13145((SubLObject)module0377.$ic87$, var233, (SubLObject)module0377.NIL, (SubLObject)module0377.UNPROVIDED);
            if (module0377.NIL != var239) {
                final SubLObject var240 = module0279.f18514(var226, var234);
                final SubLObject var241 = module0205.f13250(var240, var239, var233, (SubLObject)module0377.UNPROVIDED, (SubLObject)module0377.UNPROVIDED);
                var236 = f26841(var241, var226, var234);
            }
        }
        finally {
            module0377.$g3202$.rebind(var238, var235);
            module0377.$g3201$.rebind(var237, var235);
        }
        return var236;
    }
    
    public static SubLObject f26842(final SubLObject var53) {
        final SubLThread var54 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0377.NIL != module0206.f13500(var53) && module0377.NIL == module0205.f13220(var53, module0377.$g3202$.getDynamicValue(var54), (SubLObject)module0377.NIL, (SubLObject)module0377.UNPROVIDED, (SubLObject)module0377.UNPROVIDED) && module0377.NIL != module0205.f13220(var53, module0377.$g3201$.getDynamicValue(var54), (SubLObject)module0377.NIL, (SubLObject)module0377.UNPROVIDED, (SubLObject)module0377.UNPROVIDED));
    }
    
    public static SubLObject f26843(final SubLObject var239, final SubLObject var178, final SubLObject var21) {
        final SubLThread var240 = SubLProcess.currentSubLThread();
        assert module0377.NIL != module0364.f24750(var21) : var21;
        var240.resetMultipleValues();
        final SubLObject var241 = f26825(var21, var239, var178);
        final SubLObject var242 = var240.secondMultipleValue();
        var240.resetMultipleValues();
        if (module0377.NIL != var242) {
            module0373.f26265(var241);
        }
        else {
            module0373.f26245(var239);
        }
        return var241;
    }
    
    public static SubLObject f26844(final SubLObject var190) {
        return f26845(var190);
    }
    
    public static SubLObject f26846(final SubLObject var190) {
        final SubLThread var191 = SubLProcess.currentSubLThread();
        final SubLObject var192 = module0034.$g879$.getDynamicValue(var191);
        SubLObject var193 = (SubLObject)module0377.NIL;
        if (module0377.NIL == var192) {
            return f26844(var190);
        }
        var193 = module0034.f1857(var192, (SubLObject)module0377.$ic89$, (SubLObject)module0377.UNPROVIDED);
        if (module0377.NIL == var193) {
            var193 = module0034.f1807(module0034.f1842(var192), (SubLObject)module0377.$ic89$, (SubLObject)module0377.ONE_INTEGER, (SubLObject)module0377.NIL, (SubLObject)module0377.EQ, (SubLObject)module0377.UNPROVIDED);
            module0034.f1860(var192, (SubLObject)module0377.$ic89$, var193);
        }
        SubLObject var194 = module0034.f1814(var193, var190, (SubLObject)module0377.$ic57$);
        if (var194 == module0377.$ic57$) {
            var194 = Values.arg2(var191.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f26844(var190)));
            module0034.f1816(var193, var190, var194, (SubLObject)module0377.UNPROVIDED);
        }
        return module0034.f1959(var194);
    }
    
    public static SubLObject f26845(final SubLObject var190) {
        assert module0377.NIL != f26776(var190) : var190;
        final SubLObject var191 = module0366.f24937(var190);
        final SubLObject var192 = module0364.f24722(var191);
        final SubLObject var193 = f26749(var191);
        final SubLObject var194 = f26755(var191);
        final SubLObject var195 = f26830(var190);
        return module0532.f33188(var192, var193, var195, var194);
    }
    
    public static SubLObject f26847(final SubLObject var83) {
        return f26848(module0366.f24966(var83));
    }
    
    public static SubLObject f26848(final SubLObject var20) {
        SubLObject var21 = var20;
        SubLObject var22 = (SubLObject)module0377.NIL;
        var22 = var21.first();
        while (module0377.NIL != var21) {
            if (module0377.NIL != module0174.f11035(var22) && module0377.NIL != f26794(var22)) {
                return (SubLObject)module0377.T;
            }
            var21 = var21.rest();
            var22 = var21.first();
        }
        return (SubLObject)module0377.NIL;
    }
    
    public static SubLObject f26849(final SubLObject var20, final SubLObject var56) {
        final SubLThread var57 = SubLProcess.currentSubLThread();
        SubLObject var58 = (SubLObject)module0377.NIL;
        final SubLObject var59 = module0147.f9540(var56);
        final SubLObject var60 = module0147.$g2095$.currentBinding(var57);
        final SubLObject var61 = module0147.$g2094$.currentBinding(var57);
        final SubLObject var62 = module0147.$g2096$.currentBinding(var57);
        try {
            module0147.$g2095$.bind(module0147.f9545(var59), var57);
            module0147.$g2094$.bind(module0147.f9546(var59), var57);
            module0147.$g2096$.bind(module0147.f9549(var59), var57);
            var58 = f26848(var20);
        }
        finally {
            module0147.$g2096$.rebind(var62, var57);
            module0147.$g2094$.rebind(var61, var57);
            module0147.$g2095$.rebind(var60, var57);
        }
        return var58;
    }
    
    public static SubLObject f26850(final SubLObject var57, final SubLObject var56) {
        SubLObject var58 = (SubLObject)module0377.NIL;
        if (module0377.NIL != module0173.f10955(var57) && module0377.NIL != module0193.f12105(var56) && module0377.NIL != module0226.f14873(var57)) {
            var58 = f26851(var57, var56);
        }
        return var58;
    }
    
    public static SubLObject f26852(final SubLObject var57, final SubLObject var56) {
        final SubLThread var58 = SubLProcess.currentSubLThread();
        SubLObject var59 = (SubLObject)module0377.NIL;
        final SubLObject var60 = module0147.f9540(var56);
        final SubLObject var61 = module0147.$g2095$.currentBinding(var58);
        final SubLObject var62 = module0147.$g2094$.currentBinding(var58);
        final SubLObject var63 = module0147.$g2096$.currentBinding(var58);
        try {
            module0147.$g2095$.bind(module0147.f9545(var60), var58);
            module0147.$g2094$.bind(module0147.f9546(var60), var58);
            module0147.$g2096$.bind(module0147.f9549(var60), var58);
            var59 = module0226.f14874(var57, var56);
        }
        finally {
            module0147.$g2096$.rebind(var63, var58);
            module0147.$g2094$.rebind(var62, var58);
            module0147.$g2095$.rebind(var61, var58);
        }
        return var59;
    }
    
    public static SubLObject f26851(final SubLObject var57, final SubLObject var56) {
        final SubLThread var58 = SubLProcess.currentSubLThread();
        final SubLObject var59 = module0034.$g879$.getDynamicValue(var58);
        SubLObject var60 = (SubLObject)module0377.NIL;
        if (module0377.NIL == var59) {
            return f26852(var57, var56);
        }
        var60 = module0034.f1857(var59, (SubLObject)module0377.$ic90$, (SubLObject)module0377.UNPROVIDED);
        if (module0377.NIL == var60) {
            var60 = module0034.f1807(module0034.f1842(var59), (SubLObject)module0377.$ic90$, (SubLObject)module0377.TWO_INTEGER, (SubLObject)module0377.NIL, (SubLObject)module0377.EQUAL, (SubLObject)module0377.UNPROVIDED);
            module0034.f1860(var59, (SubLObject)module0377.$ic90$, var60);
        }
        final SubLObject var61 = module0034.f1782(var57, var56);
        final SubLObject var62 = module0034.f1814(var60, var61, (SubLObject)module0377.UNPROVIDED);
        if (var62 != module0377.$ic57$) {
            SubLObject var63 = var62;
            SubLObject var64 = (SubLObject)module0377.NIL;
            var64 = var63.first();
            while (module0377.NIL != var63) {
                SubLObject var65 = var64.first();
                final SubLObject var66 = conses_high.second(var64);
                if (var57.equal(var65.first())) {
                    var65 = var65.rest();
                    if (module0377.NIL != var65 && module0377.NIL == var65.rest() && var56.equal(var65.first())) {
                        return module0034.f1959(var66);
                    }
                }
                var63 = var63.rest();
                var64 = var63.first();
            }
        }
        final SubLObject var67 = Values.arg2(var58.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f26852(var57, var56)));
        module0034.f1836(var60, var61, var62, var67, (SubLObject)ConsesLow.list(var57, var56));
        return module0034.f1959(var67);
    }
    
    public static SubLObject f26853(final SubLObject var54, final SubLObject var56) {
        return f26854(var54, var56, (SubLObject)module0377.NIL);
    }
    
    public static SubLObject f26855(final SubLObject var54, final SubLObject var56) {
        return f26854(var54, var56, (SubLObject)module0377.T);
    }
    
    public static SubLObject f26854(final SubLObject var54, final SubLObject var56, final SubLObject var246) {
        SubLObject var247 = (SubLObject)module0377.NIL;
        if (module0377.NIL == module0193.f12105(var54)) {
            final SubLObject var248 = module0205.f13333(var54);
            final SubLObject var249 = f26850(var248, var56);
            if (module0377.NIL != var249) {
                SubLObject var250 = (SubLObject)module0377.ZERO_INTEGER;
                SubLObject var252;
                final SubLObject var251 = var252 = module0205.f13207(var54, (SubLObject)module0377.$ic91$);
                SubLObject var253 = (SubLObject)module0377.NIL;
                var253 = var252.first();
                while (module0377.NIL != var252) {
                    var250 = Numbers.add(var250, (SubLObject)module0377.ONE_INTEGER);
                    if (module0377.NIL != module0004.f104(var250, var249, Symbols.symbol_function((SubLObject)module0377.EQL), (SubLObject)module0377.UNPROVIDED) && module0377.NIL == module0193.f12105(var253)) {
                        if (module0377.NIL == var246) {
                            return (SubLObject)module0377.T;
                        }
                        SubLObject var27_251 = module0193.f12102(var253);
                        SubLObject var254 = (SubLObject)module0377.NIL;
                        var254 = var27_251.first();
                        while (module0377.NIL != var27_251) {
                            final SubLObject var255 = var254;
                            if (module0377.NIL == conses_high.member(var255, var247, Symbols.symbol_function((SubLObject)module0377.EQL), Symbols.symbol_function((SubLObject)module0377.IDENTITY))) {
                                var247 = (SubLObject)ConsesLow.cons(var255, var247);
                            }
                            var27_251 = var27_251.rest();
                            var254 = var27_251.first();
                        }
                    }
                    var252 = var252.rest();
                    var253 = var252.first();
                }
                var247 = Sort.sort(var247, Symbols.symbol_function((SubLObject)module0377.$ic92$), Symbols.symbol_function((SubLObject)module0377.$ic93$));
            }
        }
        return var247;
    }
    
    public static SubLObject f26792() {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        return module0377.$g3203$.getDynamicValue(var29);
    }
    
    public static SubLObject f26856(final SubLObject var26, SubLObject var56) {
        if (var56 == module0377.UNPROVIDED) {
            var56 = (SubLObject)module0377.NIL;
        }
        return module0315.f21257(module0377.$ic94$, var26, var56);
    }
    
    public static SubLObject f26793(final SubLObject var82, SubLObject var56) {
        if (var56 == module0377.UNPROVIDED) {
            var56 = (SubLObject)module0377.NIL;
        }
        if (module0377.NIL == module0128.f8463(module0377.$ic94$, (SubLObject)module0377.UNPROVIDED)) {
            return var82;
        }
        SubLObject var83 = (SubLObject)module0377.NIL;
        if (module0377.NIL == var83) {
            SubLObject var84 = var82;
            SubLObject var85 = (SubLObject)module0377.NIL;
            var85 = var84.first();
            while (module0377.NIL == var83 && module0377.NIL != var84) {
                if (module0377.NIL != module0222.f14635(module0377.$ic94$, var85, (SubLObject)module0377.ONE_INTEGER, (SubLObject)module0377.UNPROVIDED)) {
                    var83 = (SubLObject)module0377.T;
                }
                var84 = var84.rest();
                var85 = var84.first();
            }
        }
        if (module0377.NIL == var83) {
            return var82;
        }
        return module0315.f21322(module0377.$ic94$, var82, var56, (SubLObject)module0377.UNPROVIDED);
    }
    
    public static SubLObject f26857() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26724", "S#29941", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26725", "S#29932", 1, 0, false);
        new $f26725$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26726", "S#29942", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26727", "S#29943", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26728", "S#29944", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26729", "S#29945", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26730", "S#29946", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26731", "S#29947", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26732", "S#29948", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26733", "S#29949", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26734", "S#29950", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26735", "S#29951", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26736", "S#29952", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26737", "S#29953", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26738", "S#29954", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26739", "S#29955", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26744", "S#27589", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26745", "S#29242", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26747", "S#29956", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26748", "S#29239", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26749", "S#26807", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26750", "S#29957", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26751", "S#29274", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26740", "S#29958", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26741", "S#29959", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26742", "S#29960", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26743", "S#29961", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26752", "S#28940", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26754", "S#29962", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26757", "S#29963", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26758", "S#29964", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26759", "S#29965", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26755", "S#29966", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26760", "S#29273", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26761", "S#29967", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26762", "S#29968", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26763", "S#26809", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26764", "S#29969", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0377", "f26765", "S#29970");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26766", "S#29202", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26767", "S#29190", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26768", "S#29971", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26769", "S#29972", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26770", "S#29203", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26746", "S#27817", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26771", "S#27340", 1, 0, false);
        new $f26771$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26753", "S#29244", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26772", "S#29973", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26773", "S#29974", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26774", "S#29975", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26775", "S#28947", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26776", "S#28925", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26777", "S#28929", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26778", "S#29976", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26779", "S#28930", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26780", "S#29254", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26781", "S#29977", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26782", "S#29255", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26783", "S#29253", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26784", "S#29978", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26785", "S#29272", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26786", "S#29979", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26787", "S#29980", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26790", "S#29981", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26794", "S#29982", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26796", "S#29983", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26795", "S#29984", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26791", "S#29985", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26797", "S#29986", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26788", "S#29987", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26798", "S#29988", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26799", "S#29213", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26800", "S#29989", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26801", "S#29990", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26789", "S#29991", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26802", "S#29201", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0377", "f26803", "S#29992");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26804", "S#29217", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26805", "S#29993", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26807", "S#29994", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26808", "S#29995", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26810", "S#29996", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26806", "S#27724", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26809", "S#29997", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26811", "S#29998", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26814", "S#29999", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26815", "S#30000", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26813", "S#30001", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26819", "S#30002", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26818", "S#30003", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26821", "S#30004", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26820", "S#30005", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26822", "S#30006", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26823", "S#30007", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26824", "S#30008", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26825", "S#29259", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26826", "S#30009", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26816", "S#30010", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26817", "S#30011", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26829", "S#30012", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26830", "S#30013", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26831", "S#30014", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26833", "S#30015", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26835", "S#30016", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26827", "S#30017", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26828", "S#30018", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26836", "S#30019", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26832", "S#30020", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26837", "S#30021", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26834", "S#30022", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26812", "S#16456", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26756", "S#30023", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26839", "S#30024", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26838", "S#30025", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26840", "S#30026", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26841", "S#30027", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26842", "S#29939", 1, 0, false);
        new $f26842$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26843", "S#29260", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26844", "S#30028", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26846", "S#29268", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26845", "S#30029", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26847", "S#29270", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26848", "S#26001", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26849", "S#30030", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26850", "S#30031", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26852", "S#30032", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26851", "S#30033", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26853", "S#30034", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26855", "S#30035", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26854", "S#30036", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26792", "S#30037", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26856", "S#30038", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0377", "f26793", "S#30039", 1, 1, false);
        return (SubLObject)module0377.NIL;
    }
    
    public static SubLObject f26858() {
        module0377.$g3195$ = SubLFiles.defconstant("S#30040", (SubLObject)module0377.$ic0$);
        module0377.$g3196$ = SubLFiles.deflexical("S#30041", (module0377.NIL != Symbols.boundp((SubLObject)module0377.$ic46$)) ? module0377.$g3196$.getGlobalValue() : module0340.f22983((SubLObject)module0377.$ic47$, (SubLObject)module0377.UNPROVIDED));
        module0377.$g3197$ = SubLFiles.defparameter("S#30042", (SubLObject)module0377.TWO_INTEGER);
        module0377.$g3198$ = SubLFiles.defparameter("S#30043", (SubLObject)module0377.T);
        module0377.$g3199$ = SubLFiles.defparameter("S#30044", (SubLObject)module0377.NIL);
        module0377.$g3200$ = SubLFiles.deflexical("S#30045", (SubLObject)module0377.T);
        module0377.$g3201$ = SubLFiles.defparameter("S#30046", (SubLObject)module0377.NIL);
        module0377.$g3202$ = SubLFiles.defparameter("S#30047", (SubLObject)module0377.NIL);
        module0377.$g3203$ = SubLFiles.defvar("S#30048", (SubLObject)module0377.T);
        return (SubLObject)module0377.NIL;
    }
    
    public static SubLObject f26859() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0377.$g3195$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0377.$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0377.$ic8$);
        Structures.def_csetf((SubLObject)module0377.$ic9$, (SubLObject)module0377.$ic10$);
        Structures.def_csetf((SubLObject)module0377.$ic11$, (SubLObject)module0377.$ic12$);
        Structures.def_csetf((SubLObject)module0377.$ic13$, (SubLObject)module0377.$ic14$);
        Structures.def_csetf((SubLObject)module0377.$ic15$, (SubLObject)module0377.$ic16$);
        Equality.identity((SubLObject)module0377.$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0377.$g3195$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0377.$ic26$));
        module0003.f57((SubLObject)module0377.$ic46$);
        module0034.f1895((SubLObject)module0377.$ic56$);
        module0034.f1895((SubLObject)module0377.$ic89$);
        module0034.f1895((SubLObject)module0377.$ic90$);
        return (SubLObject)module0377.NIL;
    }
    
    public void declareFunctions() {
        f26857();
    }
    
    public void initializeVariables() {
        f26858();
    }
    
    public void runTopLevelForms() {
        f26859();
    }
    
    static {
        me = (SubLFile)new module0377();
        module0377.$g3195$ = null;
        module0377.$g3196$ = null;
        module0377.$g3197$ = null;
        module0377.$g3198$ = null;
        module0377.$g3199$ = null;
        module0377.$g3200$ = null;
        module0377.$g3201$ = null;
        module0377.$g3202$ = null;
        module0377.$g3203$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#29931", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#29932", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14781", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#14510", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#28764", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HL-MODULE"), (SubLObject)SubLObjectFactory.makeKeyword("BINDINGS"), (SubLObject)SubLObjectFactory.makeKeyword("SUPPORTS"), (SubLObject)SubLObjectFactory.makeKeyword("NON-EXPLANATORY-SUBQUERY"));
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29942", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29943", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29944", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29945", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29946", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29947", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29948", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29949", "CYC"));
        $ic6$ = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic7$ = SubLObjectFactory.makeSymbol("S#29941", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#29932", "CYC"));
        $ic9$ = SubLObjectFactory.makeSymbol("S#29942", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#29946", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#29943", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#29947", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#29944", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#29948", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#29945", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#29949", "CYC");
        $ic17$ = SubLObjectFactory.makeKeyword("HL-MODULE");
        $ic18$ = SubLObjectFactory.makeKeyword("BINDINGS");
        $ic19$ = SubLObjectFactory.makeKeyword("SUPPORTS");
        $ic20$ = SubLObjectFactory.makeKeyword("NON-EXPLANATORY-SUBQUERY");
        $ic21$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic22$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic23$ = SubLObjectFactory.makeSymbol("S#29950", "CYC");
        $ic24$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic25$ = SubLObjectFactory.makeKeyword("END");
        $ic26$ = SubLObjectFactory.makeSymbol("S#29952", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("S#26082", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#27608", "CYC");
        $ic29$ = SubLObjectFactory.makeKeyword("TRANSFORMATION");
        $ic30$ = SubLObjectFactory.makeKeyword("FREE");
        $ic31$ = SubLObjectFactory.makeSymbol("S#27817", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("S#14902", "CYC");
        $ic33$ = SubLObjectFactory.makeSymbol("S#18088", "CYC");
        $ic34$ = SubLObjectFactory.makeSymbol("S#14254", "CYC");
        $ic35$ = SubLObjectFactory.makeSymbol("S#27308", "CYC");
        $ic36$ = SubLObjectFactory.makeString("No tactic found for ~S");
        $ic37$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"));
        $ic38$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3268", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic39$ = SubLObjectFactory.makeUninternedSymbol("US#591F892");
        $ic40$ = SubLObjectFactory.makeSymbol("CLET");
        $ic41$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HL-FAILURE-BACKCHAINING*"), (SubLObject)module0377.T);
        $ic42$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*UNBOUND-RULE-BACKCHAIN-ENABLED*"), (SubLObject)module0377.T);
        $ic43$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*EVALUATABLE-BACKCHAIN-ENABLED*"), (SubLObject)module0377.T);
        $ic44$ = SubLObjectFactory.makeSymbol("S#1875", "CYC");
        $ic45$ = SubLObjectFactory.makeSymbol("S#26978", "CYC");
        $ic46$ = SubLObjectFactory.makeSymbol("S#30041", "CYC");
        $ic47$ = SubLObjectFactory.makeKeyword("DETERMINE-NEW-TRANSFORMATION-TACTICS");
        $ic48$ = SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE");
        $ic49$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic50$ = SubLObjectFactory.makeSymbol("S#29974", "CYC");
        $ic51$ = SubLObjectFactory.makeSymbol("S#28925", "CYC");
        $ic52$ = SubLObjectFactory.makeString("generalized transformation link of unexpected type: ~s");
        $ic53$ = SubLObjectFactory.makeString("generalized transformation proof of unexpected type: ~s");
        $ic54$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14781", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#26071", "CYC"));
        $ic55$ = SubLObjectFactory.makeSymbol("S#29982", "CYC");
        $ic56$ = SubLObjectFactory.makeSymbol("S#29984", "CYC");
        $ic57$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic58$ = SubLObjectFactory.makeSymbol("S#26331", "CYC");
        $ic59$ = SubLObjectFactory.makeKeyword("TACTIC-SPECS");
        $ic60$ = SubLObjectFactory.makeKeyword("TOTAL-PRODUCTIVITY");
        $ic61$ = SubLObjectFactory.makeString("unexpected tactic-specs return type ~a");
        $ic62$ = SubLObjectFactory.makeString("pruning ~s ~s ~s");
        $ic63$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#24101", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12397", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic64$ = SubLObjectFactory.makeUninternedSymbol("US#6B70E19");
        $ic65$ = SubLObjectFactory.makeSymbol("WITH-INFERENCE-MT-RELEVANCE");
        $ic66$ = SubLObjectFactory.makeSymbol("S#26057", "CYC");
        $ic67$ = SubLObjectFactory.makeSymbol("TACTIC-HL-MODULE");
        $ic68$ = SubLObjectFactory.makeSymbol("S#26058", "CYC");
        $ic69$ = SubLObjectFactory.makeSymbol("S#29970", "CYC");
        $ic70$ = SubLObjectFactory.makeSymbol("S#27780", "CYC");
        $ic71$ = SubLObjectFactory.makeString("time to add meta-transformation support for ~S");
        $ic72$ = SubLObjectFactory.makeKeyword("TRANSFORMATION-RULE-SELECT");
        $ic73$ = SubLObjectFactory.makeString("transformation tactic ~S already has rule ~S");
        $ic74$ = SubLObjectFactory.makeSymbol("S#29998", "CYC");
        $ic75$ = SubLObjectFactory.makeKeyword("NEG");
        $ic76$ = SubLObjectFactory.makeKeyword("POS");
        $ic77$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"));
        $ic78$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("termOfUnit"));
        $ic79$ = SubLObjectFactory.makeSymbol("S#26816", "CYC");
        $ic80$ = SubLObjectFactory.makeSymbol("S#18087", "CYC");
        $ic81$ = SubLObjectFactory.makeString("Could not ground out ~s and ~s");
        $ic82$ = SubLObjectFactory.makeString("Could not unify transformation bindings ~a with subproof bindings ~a");
        $ic83$ = SubLObjectFactory.makeSymbol("S#12732", "CYC");
        $ic84$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $ic85$ = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $ic86$ = SubLObjectFactory.makeKeyword("RULE");
        $ic87$ = SubLObjectFactory.makeSymbol("S#29939", "CYC");
        $ic88$ = SubLObjectFactory.makeSymbol("S#26793", "CYC");
        $ic89$ = SubLObjectFactory.makeSymbol("S#29268", "CYC");
        $ic90$ = SubLObjectFactory.makeSymbol("S#30033", "CYC");
        $ic91$ = SubLObjectFactory.makeKeyword("IGNORE");
        $ic92$ = SubLObjectFactory.makeSymbol("<");
        $ic93$ = SubLObjectFactory.makeSymbol("VARIABLE-ID");
        $ic94$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlRules"));
    }
    
    public static final class $sX29931_native extends SubLStructNative
    {
        public SubLObject $hl_module;
        public SubLObject $bindings;
        public SubLObject $supports;
        public SubLObject $non_explanatory_subquery;
        private static final SubLStructDeclNative structDecl;
        
        public $sX29931_native() {
            this.$hl_module = (SubLObject)CommonSymbols.NIL;
            this.$bindings = (SubLObject)CommonSymbols.NIL;
            this.$supports = (SubLObject)CommonSymbols.NIL;
            this.$non_explanatory_subquery = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX29931_native.structDecl;
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
        
        public SubLObject getField5() {
            return this.$non_explanatory_subquery;
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
        
        public SubLObject setField5(final SubLObject value) {
            return this.$non_explanatory_subquery = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX29931_native.class, module0377.$ic0$, module0377.$ic1$, module0377.$ic2$, module0377.$ic3$, new String[] { "$hl_module", "$bindings", "$supports", "$non_explanatory_subquery" }, module0377.$ic4$, module0377.$ic5$, module0377.$ic6$);
        }
    }
    
    public static final class $f26725$UnaryFunction extends UnaryFunction
    {
        public $f26725$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#29932"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0377.f26725(var3);
        }
    }
    
    public static final class $f26771$UnaryFunction extends UnaryFunction
    {
        public $f26771$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#27340"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0377.f26771(var3);
        }
    }
    
    public static final class $f26842$UnaryFunction extends UnaryFunction
    {
        public $f26842$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#29939"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0377.f26842(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0377.class
	Total time: 719 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/