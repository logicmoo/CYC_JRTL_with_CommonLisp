package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0501 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0501";
    public static final String myFingerPrint = "bf20fe72e7760683a675f1246e57f95eff235ad9ea26aa36a52de8aa723a6e31";
    private static SubLSymbol $g3792$;
    private static SubLSymbol $g3793$;
    private static SubLSymbol $g3794$;
    private static SubLSymbol $g3795$;
    private static SubLSymbol $g3796$;
    private static SubLSymbol $g3797$;
    private static SubLSymbol $g3798$;
    private static SubLSymbol $g3799$;
    private static SubLSymbol $g3800$;
    private static SubLSymbol $g3801$;
    private static SubLSymbol $g3802$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLString $ic8$;
    private static final SubLString $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLList $ic20$;
    private static final SubLList $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLList $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLList $ic27$;
    private static final SubLList $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLList $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLList $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLObject $ic44$;
    private static final SubLObject $ic45$;
    private static final SubLObject $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLList $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLList $ic60$;
    private static final SubLList $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLList $ic65$;
    private static final SubLObject $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLObject $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLList $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLList $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLList $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLList $ic79$;
    
    public static SubLObject f32289(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.listS((SubLObject)$ic2$, var5, (SubLObject)$ic3$), (SubLObject)ConsesLow.listS((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), ConsesLow.append(var6, (SubLObject)NIL)));
    }
    
    public static SubLObject f32290() {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        return $g3796$.getDynamicValue(var7);
    }
    
    public static SubLObject f32291() {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        return $g3797$.getDynamicValue(var7);
    }
    
    public static SubLObject f32292(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic6$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.listS((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic7$, var5)), ConsesLow.append(var6, (SubLObject)NIL)));
    }
    
    public static SubLObject f32293(final SubLObject var11) {
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = module0035.f2160(module0202.f12728(var11, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED).rest();
        SubLObject var14 = (SubLObject)NIL;
        var14 = var13.first();
        while (NIL != var13) {
            if (NIL == module0206.f13500(module0205.f13384(var11, var14, (SubLObject)UNPROVIDED))) {
                var12 = (SubLObject)ConsesLow.cons(var14, var12);
            }
            var13 = var13.rest();
            var14 = var13.first();
        }
        return Sequences.nreverse(var12);
    }
    
    public static SubLObject f32294(final SubLObject var11) {
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = module0035.f2160(module0202.f12728(var11, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED).rest();
        SubLObject var14 = (SubLObject)NIL;
        var14 = var13.first();
        while (NIL != var13) {
            if (NIL != module0206.f13500(module0205.f13384(var11, var14, (SubLObject)UNPROVIDED))) {
                var12 = (SubLObject)ConsesLow.cons(var14, var12);
            }
            var13 = var13.rest();
            var14 = var13.first();
        }
        return Sequences.nreverse(var12);
    }
    
    public static SubLObject f32295(final SubLObject var11) {
        if (NIL != module0206.f13500(module0205.f13384(var11, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED))) {
            return module0205.f13384(var11, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0206.f13500(module0205.f13384(var11, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED))) {
            return module0205.f13384(var11, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
        }
        module0134.f8815((SubLObject)$ic8$, var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32296(final SubLObject var11) {
        return module0205.f13304(module0205.f13384(var11, (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f32297(final SubLObject var11) {
        return module0205.f13384(var11, (SubLObject)FOUR_INTEGER, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f32298(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        if (NIL != module0004.f104((SubLObject)ONE_INTEGER, $g3794$.getDynamicValue(var12), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL != module0004.f104((SubLObject)TWO_INTEGER, $g3795$.getDynamicValue(var12), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return module0205.f13384(var11, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0004.f104((SubLObject)TWO_INTEGER, $g3794$.getDynamicValue(var12), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL != module0004.f104((SubLObject)ONE_INTEGER, $g3795$.getDynamicValue(var12), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return module0205.f13384(var11, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0004.f104((SubLObject)ONE_INTEGER, $g3794$.getDynamicValue(var12), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL != module0004.f104((SubLObject)TWO_INTEGER, $g3794$.getDynamicValue(var12), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return module0205.f13384(var11, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
        }
        Errors.error((SubLObject)$ic9$, var11);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32299(final SubLObject var11) {
        return conses_high.third(var11);
    }
    
    public static SubLObject f32300(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic10$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic11$, var5), (SubLObject)ConsesLow.list((SubLObject)$ic12$, (SubLObject)ConsesLow.list((SubLObject)$ic13$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic14$, (SubLObject)ConsesLow.list((SubLObject)$ic15$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic16$, (SubLObject)ConsesLow.list((SubLObject)$ic17$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, (SubLObject)ConsesLow.list((SubLObject)$ic18$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic7$, (SubLObject)ConsesLow.list((SubLObject)$ic19$, var5))), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f32301(final SubLObject var17) {
        return ConsesLow.append($g3798$.getGlobalValue(), var17);
    }
    
    public static SubLObject f32302(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic21$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic21$);
        var6 = var4.first();
        final SubLObject var7;
        var4 = (var7 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic22$, (SubLObject)ConsesLow.listS((SubLObject)$ic23$, var6, (SubLObject)$ic24$), (SubLObject)ConsesLow.listS((SubLObject)$ic25$, var5, (SubLObject)ConsesLow.list((SubLObject)$ic26$, var6), ConsesLow.append(var7, (SubLObject)NIL)));
    }
    
    public static SubLObject f32303(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic4$, (SubLObject)$ic27$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f32304(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic28$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        final SubLObject var7 = (SubLObject)$ic29$;
        final SubLObject var8 = (SubLObject)$ic30$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.list((SubLObject)$ic31$, (SubLObject)$ic32$, var5)), (SubLObject)ConsesLow.list(var8, (SubLObject)ConsesLow.list((SubLObject)$ic33$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic34$, (SubLObject)ConsesLow.list((SubLObject)$ic35$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic35$, var7)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic34$, (SubLObject)ConsesLow.list((SubLObject)$ic36$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic36$, var7)))), (SubLObject)ConsesLow.list((SubLObject)$ic37$, (SubLObject)ConsesLow.list((SubLObject)$ic38$, var5, var8)), (SubLObject)ConsesLow.list((SubLObject)$ic39$, (SubLObject)ConsesLow.list((SubLObject)$ic40$, var5, var8))), (SubLObject)ConsesLow.listS((SubLObject)$ic4$, (SubLObject)$ic41$, ConsesLow.append(var6, (SubLObject)NIL)));
    }
    
    public static SubLObject f32305(final SubLObject var25, final SubLObject var27) {
        final SubLObject var28 = module0035.f2259((SubLObject)$ic42$, var25, (SubLObject)UNPROVIDED);
        SubLObject var29 = (SubLObject)NIL;
        SubLObject var30 = var28;
        SubLObject var31 = (SubLObject)NIL;
        var31 = var30.first();
        while (NIL != var30) {
            if (NIL == var27 || module0205.f13203(var31, (SubLObject)UNPROVIDED).eql(var27)) {
                final SubLObject var32 = module0205.f13204(var31, (SubLObject)UNPROVIDED);
                if (NIL != module0173.f10955(var32)) {
                    var29 = (SubLObject)ConsesLow.cons(var32, var29);
                }
            }
            var30 = var30.rest();
            var31 = var30.first();
        }
        return var29;
    }
    
    public static SubLObject f32306(final SubLObject var25, final SubLObject var27) {
        final SubLObject var28 = module0035.f2259((SubLObject)$ic43$, var25, (SubLObject)UNPROVIDED);
        SubLObject var29 = (SubLObject)NIL;
        SubLObject var30 = var28;
        SubLObject var31 = (SubLObject)NIL;
        var31 = var30.first();
        while (NIL != var30) {
            if (NIL == var27 || module0205.f13203(var31, (SubLObject)UNPROVIDED).eql(var27)) {
                final SubLObject var32 = module0205.f13204(var31, (SubLObject)UNPROVIDED);
                if (NIL != module0173.f10955(var32)) {
                    var29 = (SubLObject)ConsesLow.cons(var32, var29);
                }
            }
            var30 = var30.rest();
            var31 = var30.first();
        }
        return var29;
    }
    
    public static SubLObject f32307(final SubLObject var25) {
        return Equality.eql(module0205.f13132(var25), $ic44$);
    }
    
    public static SubLObject f32308(final SubLObject var25) {
        return Equality.eql(module0205.f13132(var25), $ic45$);
    }
    
    public static SubLObject f32309(final SubLObject var25) {
        return Equality.eql(module0205.f13132(var25), $ic46$);
    }
    
    public static SubLObject f32310() {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        return $g3801$.getDynamicValue(var7);
    }
    
    public static SubLObject f32311(final SubLObject var20, final SubLObject var33) {
        final SubLThread var34 = SubLProcess.currentSubLThread();
        SubLObject var35 = (SubLObject)T;
        if (NIL != $g3799$.getDynamicValue(var34) && NIL == module0259.f16902(var33, $g3799$.getDynamicValue(var34), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            var35 = (SubLObject)NIL;
        }
        if (NIL != $g3800$.getDynamicValue(var34) && NIL == module0256.f16606(var33, $g3800$.getDynamicValue(var34), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            var35 = (SubLObject)NIL;
        }
        return var35;
    }
    
    public static SubLObject f32312() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32313(final SubLObject var35) {
        return (SubLObject)makeBoolean(NIL != f32314(var35) || NIL != f32315(var35));
    }
    
    public static SubLObject f32315(final SubLObject var35) {
        return (SubLObject)makeBoolean(NIL != module0202.f12865(var35) && NIL != module0193.f12067(module0205.f13203(var35, (SubLObject)UNPROVIDED)) && NIL != module0173.f10955(module0205.f13204(var35, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f32314(final SubLObject var35) {
        return (SubLObject)makeBoolean(NIL != module0202.f12859(var35) && NIL != module0193.f12067(module0205.f13203(var35, (SubLObject)UNPROVIDED)) && NIL != module0173.f10955(module0205.f13204(var35, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f32316(final SubLObject var33, final SubLObject var36, final SubLObject var10, SubLObject var37) {
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        final SubLThread var38 = SubLProcess.currentSubLThread();
        SubLObject var39 = (SubLObject)NIL;
        assert NIL != Types.listp(var36) : var36;
        final SubLObject var40 = $g3796$.currentBinding(var38);
        try {
            $g3796$.bind(var36, var38);
            final SubLObject var41 = conses_high.getf((SubLObject)ConsesLow.listS((SubLObject)$ic48$, new SubLObject[] { $ic49$, $ic50$, var37, $ic51$, var36, $ic52$, var10, $ic53$ }), (SubLObject)$ic50$, (SubLObject)UNPROVIDED);
            final SubLObject var38_40 = module0147.$g2095$.currentBinding(var38);
            final SubLObject var42 = module0147.$g2094$.currentBinding(var38);
            final SubLObject var43 = module0147.$g2096$.currentBinding(var38);
            try {
                module0147.$g2095$.bind(module0147.f9545(var41), var38);
                module0147.$g2094$.bind(module0147.f9546(var41), var38);
                module0147.$g2096$.bind(module0147.f9549(var41), var38);
                final SubLObject var44 = module0134.f8737(f32301((SubLObject)ConsesLow.listS((SubLObject)$ic48$, new SubLObject[] { $ic49$, $ic50$, var37, $ic51$, var36, $ic52$, var10, $ic53$ })));
                module0237.f15575();
                module0266.f17496(var44, var33);
                var39 = module0134.f8743(var44);
                module0134.f8740(var44);
            }
            finally {
                module0147.$g2096$.rebind(var43, var38);
                module0147.$g2094$.rebind(var42, var38);
                module0147.$g2095$.rebind(var38_40, var38);
            }
        }
        finally {
            $g3796$.rebind(var40, var38);
        }
        return var39;
    }
    
    public static SubLObject f32317(final SubLObject var33, final SubLObject var36, final SubLObject var43, final SubLObject var10, SubLObject var37) {
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        return module0035.remove_if_not(var43, f32316(var33, var36, var10, var37), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f32318(final SubLObject var44, final SubLObject var45, final SubLObject var36, final SubLObject var10, SubLObject var37) {
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        final SubLThread var46 = SubLProcess.currentSubLThread();
        SubLObject var47 = (SubLObject)NIL;
        assert NIL != Types.listp(var36) : var36;
        final SubLObject var48 = $g3796$.currentBinding(var46);
        try {
            $g3796$.bind(var36, var46);
            final SubLObject var49 = conses_high.getf((SubLObject)ConsesLow.list(new SubLObject[] { $ic48$, $ic49$, $ic50$, var37, $ic51$, var36, $ic52$, var10, $ic54$, var45 }), (SubLObject)$ic50$, (SubLObject)UNPROVIDED);
            final SubLObject var38_46 = module0147.$g2095$.currentBinding(var46);
            final SubLObject var50 = module0147.$g2094$.currentBinding(var46);
            final SubLObject var51 = module0147.$g2096$.currentBinding(var46);
            try {
                module0147.$g2095$.bind(module0147.f9545(var49), var46);
                module0147.$g2094$.bind(module0147.f9546(var49), var46);
                module0147.$g2096$.bind(module0147.f9549(var49), var46);
                final SubLObject var52 = module0134.f8737(f32301((SubLObject)ConsesLow.list(new SubLObject[] { $ic48$, $ic49$, $ic50$, var37, $ic51$, var36, $ic52$, var10, $ic54$, var45 })));
                module0237.f15575();
                module0266.f17496(var52, var44);
                var47 = module0134.f8743(var52);
                module0134.f8740(var52);
            }
            finally {
                module0147.$g2096$.rebind(var51, var46);
                module0147.$g2094$.rebind(var50, var46);
                module0147.$g2095$.rebind(var38_46, var46);
            }
        }
        finally {
            $g3796$.rebind(var48, var46);
        }
        return var47;
    }
    
    public static SubLObject f32319(final SubLObject var44, final SubLObject var45, final SubLObject var36, final SubLObject var10, SubLObject var37) {
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        final SubLThread var46 = SubLProcess.currentSubLThread();
        SubLObject var47 = (SubLObject)NIL;
        final SubLObject var48 = module0145.$g1916$.currentBinding(var46);
        try {
            module0145.$g1916$.bind((SubLObject)T, var46);
            assert NIL != Types.listp(var36) : var36;
            final SubLObject var38_47 = $g3796$.currentBinding(var46);
            try {
                $g3796$.bind(var36, var46);
                final SubLObject var49 = conses_high.getf((SubLObject)ConsesLow.list(new SubLObject[] { $ic48$, $ic55$, $ic50$, var37, $ic51$, var36, $ic52$, var10, $ic56$, T, $ic57$, $ic58$, $ic54$, var45 }), (SubLObject)$ic50$, (SubLObject)UNPROVIDED);
                final SubLObject var38_48 = module0147.$g2095$.currentBinding(var46);
                final SubLObject var50 = module0147.$g2094$.currentBinding(var46);
                final SubLObject var51 = module0147.$g2096$.currentBinding(var46);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var49), var46);
                    module0147.$g2094$.bind(module0147.f9546(var49), var46);
                    module0147.$g2096$.bind(module0147.f9549(var49), var46);
                    final SubLObject var52 = module0134.f8737(f32301((SubLObject)ConsesLow.list(new SubLObject[] { $ic48$, $ic55$, $ic50$, var37, $ic51$, var36, $ic52$, var10, $ic56$, T, $ic57$, $ic58$, $ic54$, var45 })));
                    module0237.f15575();
                    module0266.f17496(var52, var44);
                    var47 = module0134.f8743(var52);
                    module0134.f8740(var52);
                }
                finally {
                    module0147.$g2096$.rebind(var51, var46);
                    module0147.$g2094$.rebind(var50, var46);
                    module0147.$g2095$.rebind(var38_48, var46);
                }
            }
            finally {
                $g3796$.rebind(var38_47, var46);
            }
        }
        finally {
            module0145.$g1916$.rebind(var48, var46);
        }
        return var47;
    }
    
    public static SubLObject f32320(final SubLObject var44, final SubLObject var45, final SubLObject var36, final SubLObject var10, SubLObject var37) {
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        final SubLThread var46 = SubLProcess.currentSubLThread();
        SubLObject var47 = (SubLObject)NIL;
        final SubLObject var48 = module0145.$g1916$.currentBinding(var46);
        try {
            module0145.$g1916$.bind((SubLObject)T, var46);
            assert NIL != Types.listp(var36) : var36;
            final SubLObject var38_49 = $g3796$.currentBinding(var46);
            try {
                $g3796$.bind(var36, var46);
                final SubLObject var49 = conses_high.getf((SubLObject)ConsesLow.list(new SubLObject[] { $ic48$, $ic55$, $ic50$, var37, $ic51$, var36, $ic52$, var10, $ic56$, $ic59$, $ic57$, $ic58$, $ic54$, var45 }), (SubLObject)$ic50$, (SubLObject)UNPROVIDED);
                final SubLObject var38_50 = module0147.$g2095$.currentBinding(var46);
                final SubLObject var50 = module0147.$g2094$.currentBinding(var46);
                final SubLObject var51 = module0147.$g2096$.currentBinding(var46);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var49), var46);
                    module0147.$g2094$.bind(module0147.f9546(var49), var46);
                    module0147.$g2096$.bind(module0147.f9549(var49), var46);
                    final SubLObject var52 = module0134.f8737(f32301((SubLObject)ConsesLow.list(new SubLObject[] { $ic48$, $ic55$, $ic50$, var37, $ic51$, var36, $ic52$, var10, $ic56$, $ic59$, $ic57$, $ic58$, $ic54$, var45 })));
                    module0237.f15575();
                    module0266.f17496(var52, var44);
                    var47 = module0134.f8743(var52);
                    module0134.f8740(var52);
                }
                finally {
                    module0147.$g2096$.rebind(var51, var46);
                    module0147.$g2094$.rebind(var50, var46);
                    module0147.$g2095$.rebind(var38_50, var46);
                }
            }
            finally {
                $g3796$.rebind(var38_49, var46);
            }
        }
        finally {
            module0145.$g1916$.rebind(var48, var46);
        }
        return var47;
    }
    
    public static SubLObject f32321(final SubLObject var33, final SubLObject var36, final SubLObject var51, SubLObject var37) {
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        return module0035.f2269(f32316(var33, var36, var51, var37), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f32322(final SubLObject var33, final SubLObject var36, final SubLObject var51, SubLObject var37) {
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        final SubLThread var52 = SubLProcess.currentSubLThread();
        SubLObject var53 = (SubLObject)NIL;
        assert NIL != Types.listp(var36) : var36;
        final SubLObject var54 = $g3796$.currentBinding(var52);
        try {
            $g3796$.bind(var36, var52);
            final SubLObject var55 = conses_high.getf((SubLObject)ConsesLow.listS((SubLObject)$ic48$, new SubLObject[] { $ic55$, $ic50$, var37, $ic51$, var36, $ic52$, var51, $ic60$ }), (SubLObject)$ic50$, (SubLObject)UNPROVIDED);
            final SubLObject var38_52 = module0147.$g2095$.currentBinding(var52);
            final SubLObject var56 = module0147.$g2094$.currentBinding(var52);
            final SubLObject var57 = module0147.$g2096$.currentBinding(var52);
            try {
                module0147.$g2095$.bind(module0147.f9545(var55), var52);
                module0147.$g2094$.bind(module0147.f9546(var55), var52);
                module0147.$g2096$.bind(module0147.f9549(var55), var52);
                final SubLObject var58 = module0134.f8737(f32301((SubLObject)ConsesLow.listS((SubLObject)$ic48$, new SubLObject[] { $ic55$, $ic50$, var37, $ic51$, var36, $ic52$, var51, $ic60$ })));
                module0237.f15575();
                module0266.f17496(var58, var33);
                var53 = module0134.f8743(var58);
                module0134.f8740(var58);
            }
            finally {
                module0147.$g2096$.rebind(var57, var52);
                module0147.$g2094$.rebind(var56, var52);
                module0147.$g2095$.rebind(var38_52, var52);
            }
        }
        finally {
            $g3796$.rebind(var54, var52);
        }
        return var53;
    }
    
    public static SubLObject f32323(final SubLObject var33, final SubLObject var36, final SubLObject var51, SubLObject var37) {
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        return f32322(var33, var36, var51, var37);
    }
    
    public static SubLObject f32324(final SubLObject var44, final SubLObject var45, final SubLObject var36, final SubLObject var51, SubLObject var37) {
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        return f32319(var44, var45, var36, var51, var37);
    }
    
    public static SubLObject f32325(final SubLObject var44, final SubLObject var45, final SubLObject var36, final SubLObject var51, SubLObject var37) {
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        final SubLThread var52 = SubLProcess.currentSubLThread();
        SubLObject var53 = (SubLObject)NIL;
        assert NIL != Types.listp(var36) : var36;
        final SubLObject var54 = $g3796$.currentBinding(var52);
        try {
            $g3796$.bind(var36, var52);
            final SubLObject var55 = conses_high.getf((SubLObject)ConsesLow.listS((SubLObject)$ic48$, new SubLObject[] { $ic55$, $ic50$, var37, $ic51$, var36, $ic52$, var51, $ic54$, var45, $ic61$ }), (SubLObject)$ic50$, (SubLObject)UNPROVIDED);
            final SubLObject var38_53 = module0147.$g2095$.currentBinding(var52);
            final SubLObject var56 = module0147.$g2094$.currentBinding(var52);
            final SubLObject var57 = module0147.$g2096$.currentBinding(var52);
            try {
                module0147.$g2095$.bind(module0147.f9545(var55), var52);
                module0147.$g2094$.bind(module0147.f9546(var55), var52);
                module0147.$g2096$.bind(module0147.f9549(var55), var52);
                final SubLObject var58 = module0134.f8737(f32301((SubLObject)ConsesLow.listS((SubLObject)$ic48$, new SubLObject[] { $ic55$, $ic50$, var37, $ic51$, var36, $ic52$, var51, $ic54$, var45, $ic61$ })));
                module0237.f15575();
                module0266.f17496(var58, var44);
                var53 = module0134.f8743(var58);
                module0134.f8740(var58);
            }
            finally {
                module0147.$g2096$.rebind(var57, var52);
                module0147.$g2094$.rebind(var56, var52);
                module0147.$g2095$.rebind(var38_53, var52);
            }
        }
        finally {
            $g3796$.rebind(var54, var52);
        }
        return var53;
    }
    
    public static SubLObject f32326(final SubLObject var44, final SubLObject var54, final SubLObject var36, final SubLObject var51, SubLObject var37) {
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        final SubLThread var55 = SubLProcess.currentSubLThread();
        SubLObject var56 = (SubLObject)NIL;
        assert NIL != Types.listp(var36) : var36;
        final SubLObject var57 = $g3796$.currentBinding(var55);
        try {
            $g3796$.bind(var36, var55);
            final SubLObject var58 = conses_high.getf((SubLObject)ConsesLow.listS((SubLObject)$ic48$, new SubLObject[] { $ic55$, $ic50$, var37, $ic51$, var36, $ic52$, var51, $ic54$, var54, $ic61$ }), (SubLObject)$ic50$, (SubLObject)UNPROVIDED);
            final SubLObject var38_55 = module0147.$g2095$.currentBinding(var55);
            final SubLObject var59 = module0147.$g2094$.currentBinding(var55);
            final SubLObject var60 = module0147.$g2096$.currentBinding(var55);
            try {
                module0147.$g2095$.bind(module0147.f9545(var58), var55);
                module0147.$g2094$.bind(module0147.f9546(var58), var55);
                module0147.$g2096$.bind(module0147.f9549(var58), var55);
                final SubLObject var61 = module0134.f8737(f32301((SubLObject)ConsesLow.listS((SubLObject)$ic48$, new SubLObject[] { $ic55$, $ic50$, var37, $ic51$, var36, $ic52$, var51, $ic54$, var54, $ic61$ })));
                module0237.f15575();
                module0266.f17496(var61, var44);
                var56 = module0134.f8743(var61);
                module0134.f8740(var61);
            }
            finally {
                module0147.$g2096$.rebind(var60, var55);
                module0147.$g2094$.rebind(var59, var55);
                module0147.$g2095$.rebind(var38_55, var55);
            }
        }
        finally {
            $g3796$.rebind(var57, var55);
        }
        return var56;
    }
    
    public static SubLObject f32327(final SubLObject var33, final SubLObject var56, final SubLObject var36, final SubLObject var51, SubLObject var37) {
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        final SubLThread var57 = SubLProcess.currentSubLThread();
        SubLObject var58 = (SubLObject)NIL;
        assert NIL != Types.listp(var36) : var36;
        final SubLObject var59 = $g3796$.currentBinding(var57);
        try {
            $g3796$.bind(var36, var57);
            final SubLObject var60 = Sequences.find_if((SubLObject)$ic62$, var56, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var61 = (SubLObject)((NIL != module0201.f12546(module0205.f13203(var60, (SubLObject)UNPROVIDED))) ? module0205.f13203(var60, (SubLObject)UNPROVIDED) : ((NIL != module0201.f12546(module0205.f13204(var60, (SubLObject)UNPROVIDED))) ? module0205.f13204(var60, (SubLObject)UNPROVIDED) : NIL));
            final SubLObject var38_59 = $g3799$.currentBinding(var57);
            final SubLObject var62 = $g3800$.currentBinding(var57);
            final SubLObject var63 = $g3801$.currentBinding(var57);
            try {
                $g3799$.bind(f32305(var56, var61), var57);
                $g3800$.bind(f32306(var56, var61), var57);
                $g3801$.bind((SubLObject)makeBoolean(NIL != $g3799$.getDynamicValue(var57) || NIL != $g3800$.getDynamicValue(var57)), var57);
                final SubLObject var64 = conses_high.getf((SubLObject)ConsesLow.listS((SubLObject)$ic48$, new SubLObject[] { $ic55$, $ic50$, var37, $ic51$, var36, $ic63$, $ic64$, $ic52$, var51, $ic65$ }), (SubLObject)$ic50$, (SubLObject)UNPROVIDED);
                final SubLObject var38_60 = module0147.$g2095$.currentBinding(var57);
                final SubLObject var41_61 = module0147.$g2094$.currentBinding(var57);
                final SubLObject var42_62 = module0147.$g2096$.currentBinding(var57);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var64), var57);
                    module0147.$g2094$.bind(module0147.f9546(var64), var57);
                    module0147.$g2096$.bind(module0147.f9549(var64), var57);
                    final SubLObject var65 = module0134.f8737(f32301((SubLObject)ConsesLow.listS((SubLObject)$ic48$, new SubLObject[] { $ic55$, $ic50$, var37, $ic51$, var36, $ic63$, $ic64$, $ic52$, var51, $ic65$ })));
                    module0237.f15575();
                    module0266.f17496(var65, var33);
                    var58 = module0134.f8743(var65);
                    module0134.f8740(var65);
                }
                finally {
                    module0147.$g2096$.rebind(var42_62, var57);
                    module0147.$g2094$.rebind(var41_61, var57);
                    module0147.$g2095$.rebind(var38_60, var57);
                }
            }
            finally {
                $g3801$.rebind(var63, var57);
                $g3800$.rebind(var62, var57);
                $g3799$.rebind(var38_59, var57);
            }
        }
        finally {
            $g3796$.rebind(var59, var57);
        }
        return var58;
    }
    
    public static SubLObject f32328(final SubLObject var33, final SubLObject var54, final SubLObject var56, final SubLObject var36, final SubLObject var51, SubLObject var37) {
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        final SubLThread var57 = SubLProcess.currentSubLThread();
        SubLObject var58 = (SubLObject)NIL;
        assert NIL != Types.listp(var36) : var36;
        final SubLObject var59 = $g3796$.currentBinding(var57);
        try {
            $g3796$.bind(var36, var57);
            final SubLObject var60 = Sequences.find_if((SubLObject)$ic62$, var56, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var61 = (SubLObject)((NIL != module0201.f12546(module0205.f13203(var60, (SubLObject)UNPROVIDED))) ? module0205.f13203(var60, (SubLObject)UNPROVIDED) : ((NIL != module0201.f12546(module0205.f13204(var60, (SubLObject)UNPROVIDED))) ? module0205.f13204(var60, (SubLObject)UNPROVIDED) : NIL));
            final SubLObject var38_63 = $g3799$.currentBinding(var57);
            final SubLObject var62 = $g3800$.currentBinding(var57);
            final SubLObject var63 = $g3801$.currentBinding(var57);
            try {
                $g3799$.bind(f32305(var56, var61), var57);
                $g3800$.bind(f32306(var56, var61), var57);
                $g3801$.bind((SubLObject)makeBoolean(NIL != $g3799$.getDynamicValue(var57) || NIL != $g3800$.getDynamicValue(var57)), var57);
                final SubLObject var64 = conses_high.getf((SubLObject)ConsesLow.listS((SubLObject)$ic48$, new SubLObject[] { $ic55$, $ic50$, var37, $ic51$, var36, $ic63$, $ic64$, $ic52$, var51, $ic54$, var54, $ic65$ }), (SubLObject)$ic50$, (SubLObject)UNPROVIDED);
                final SubLObject var38_64 = module0147.$g2095$.currentBinding(var57);
                final SubLObject var41_65 = module0147.$g2094$.currentBinding(var57);
                final SubLObject var42_66 = module0147.$g2096$.currentBinding(var57);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var64), var57);
                    module0147.$g2094$.bind(module0147.f9546(var64), var57);
                    module0147.$g2096$.bind(module0147.f9549(var64), var57);
                    final SubLObject var65 = module0134.f8737(f32301((SubLObject)ConsesLow.listS((SubLObject)$ic48$, new SubLObject[] { $ic55$, $ic50$, var37, $ic51$, var36, $ic63$, $ic64$, $ic52$, var51, $ic54$, var54, $ic65$ })));
                    module0237.f15575();
                    module0266.f17496(var65, var33);
                    var58 = module0134.f8743(var65);
                    module0134.f8740(var65);
                }
                finally {
                    module0147.$g2096$.rebind(var42_66, var57);
                    module0147.$g2094$.rebind(var41_65, var57);
                    module0147.$g2095$.rebind(var38_64, var57);
                }
            }
            finally {
                $g3801$.rebind(var63, var57);
                $g3800$.rebind(var62, var57);
                $g3799$.rebind(var38_63, var57);
            }
        }
        finally {
            $g3796$.rebind(var59, var57);
        }
        return var58;
    }
    
    public static SubLObject f32329(final SubLObject var5, SubLObject var37) {
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        final SubLThread var38 = SubLProcess.currentSubLThread();
        SubLObject var39 = (SubLObject)NIL;
        SubLObject var40 = module0141.$g1692$.currentBinding(var38);
        try {
            module0141.$g1692$.bind((SubLObject)NIL, var38);
            try {
                module0252.f16277(module0137.f8955($ic66$), var5, var37, (SubLObject)UNPROVIDED);
            }
            finally {
                final SubLObject var38_68 = Threads.$is_thread_performing_cleanupP$.currentBinding(var38);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var38);
                    var39 = module0141.$g1692$.getDynamicValue(var38);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var38_68, var38);
                }
            }
        }
        finally {
            module0141.$g1692$.rebind(var40, var38);
        }
        var40 = module0141.$g1666$.currentBinding(var38);
        try {
            module0141.$g1666$.bind((SubLObject)$ic67$, var38);
            var39 = module0250.f16107(var39, (SubLObject)UNPROVIDED);
        }
        finally {
            module0141.$g1666$.rebind(var40, var38);
        }
        return var39;
    }
    
    public static SubLObject f32330(final SubLObject var11, SubLObject var37) {
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        final SubLThread var38 = SubLProcess.currentSubLThread();
        SubLObject var39 = (SubLObject)NIL;
        final SubLObject var40 = $g3792$.currentBinding(var38);
        final SubLObject var41 = $g3793$.currentBinding(var38);
        final SubLObject var42 = $g3794$.currentBinding(var38);
        final SubLObject var43 = $g3795$.currentBinding(var38);
        final SubLObject var44 = $g3796$.currentBinding(var38);
        final SubLObject var45 = $g3797$.currentBinding(var38);
        try {
            $g3792$.bind(var11, var38);
            $g3793$.bind(module0205.f13333(var11), var38);
            $g3794$.bind(f32293(var11), var38);
            $g3795$.bind(f32294(var11), var38);
            $g3796$.bind(f32296(var11), var38);
            $g3797$.bind(f32297(var11), var38);
            var39 = f32318(f32298(var11), f32299(var11), f32290(), f32291(), var37);
        }
        finally {
            $g3797$.rebind(var45, var38);
            $g3796$.rebind(var44, var38);
            $g3795$.rebind(var43, var38);
            $g3794$.rebind(var42, var38);
            $g3793$.rebind(var41, var38);
            $g3792$.rebind(var40, var38);
        }
        return var39;
    }
    
    public static SubLObject f32331(final SubLObject var11, SubLObject var37) {
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        final SubLThread var38 = SubLProcess.currentSubLThread();
        SubLObject var39 = (SubLObject)NIL;
        final SubLObject var40 = $g3792$.currentBinding(var38);
        final SubLObject var41 = $g3793$.currentBinding(var38);
        final SubLObject var42 = $g3794$.currentBinding(var38);
        final SubLObject var43 = $g3795$.currentBinding(var38);
        final SubLObject var44 = $g3796$.currentBinding(var38);
        final SubLObject var45 = $g3797$.currentBinding(var38);
        try {
            $g3792$.bind(var11, var38);
            $g3793$.bind(module0205.f13333(var11), var38);
            $g3794$.bind(f32293(var11), var38);
            $g3795$.bind(f32294(var11), var38);
            $g3796$.bind(f32296(var11), var38);
            $g3797$.bind(f32297(var11), var38);
            var39 = f32316(f32298(var11), f32290(), f32291(), var37);
        }
        finally {
            $g3797$.rebind(var45, var38);
            $g3796$.rebind(var44, var38);
            $g3795$.rebind(var43, var38);
            $g3794$.rebind(var42, var38);
            $g3793$.rebind(var41, var38);
            $g3792$.rebind(var40, var38);
        }
        return var39;
    }
    
    public static SubLObject f32332(final SubLObject var11, SubLObject var37) {
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        final SubLThread var38 = SubLProcess.currentSubLThread();
        SubLObject var39 = (SubLObject)NIL;
        final SubLObject var40 = $g3792$.currentBinding(var38);
        final SubLObject var41 = $g3793$.currentBinding(var38);
        final SubLObject var42 = $g3794$.currentBinding(var38);
        final SubLObject var43 = $g3795$.currentBinding(var38);
        final SubLObject var44 = $g3796$.currentBinding(var38);
        final SubLObject var45 = $g3797$.currentBinding(var38);
        try {
            $g3792$.bind(var11, var38);
            $g3793$.bind(module0205.f13333(var11), var38);
            $g3794$.bind(f32293(var11), var38);
            $g3795$.bind(f32294(var11), var38);
            $g3796$.bind(f32296(var11), var38);
            $g3797$.bind(f32297(var11), var38);
            var39 = f32319(f32298(var11), f32299(var11), f32290(), f32291(), var37);
        }
        finally {
            $g3797$.rebind(var45, var38);
            $g3796$.rebind(var44, var38);
            $g3795$.rebind(var43, var38);
            $g3794$.rebind(var42, var38);
            $g3793$.rebind(var41, var38);
            $g3792$.rebind(var40, var38);
        }
        if (NIL != var39) {
            var39 = f32333(var39, var11, var37);
        }
        return var39;
    }
    
    public static SubLObject f32334(final SubLObject var11, SubLObject var37) {
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        return module0035.f2269(Mapping.mapcan(Symbols.symbol_function((SubLObject)$ic68$), module0528.f32971(f32332(var11, var37)), EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f32333(final SubLObject var67, final SubLObject var11, SubLObject var37) {
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        final SubLThread var68 = SubLProcess.currentSubLThread();
        SubLObject var69 = var67;
        SubLObject var70 = (SubLObject)NIL;
        final SubLObject var71 = var37;
        final SubLObject var72 = module0147.$g2095$.currentBinding(var68);
        final SubLObject var73 = module0147.$g2094$.currentBinding(var68);
        final SubLObject var74 = module0147.$g2096$.currentBinding(var68);
        final SubLObject var75 = $g3792$.currentBinding(var68);
        final SubLObject var76 = $g3793$.currentBinding(var68);
        final SubLObject var77 = $g3794$.currentBinding(var68);
        final SubLObject var78 = $g3795$.currentBinding(var68);
        final SubLObject var79 = $g3796$.currentBinding(var68);
        final SubLObject var80 = $g3797$.currentBinding(var68);
        try {
            module0147.$g2095$.bind(module0147.f9545(var71), var68);
            module0147.$g2094$.bind(module0147.f9546(var71), var68);
            module0147.$g2096$.bind(module0147.f9549(var71), var68);
            $g3792$.bind(var11, var68);
            $g3793$.bind(module0205.f13333(var11), var68);
            $g3794$.bind(f32293(var11), var68);
            $g3795$.bind(f32294(var11), var68);
            $g3796$.bind(f32296(var11), var68);
            $g3797$.bind(f32297(var11), var68);
            SubLObject var81 = var67;
            SubLObject var82 = (SubLObject)NIL;
            var82 = var81.first();
            while (NIL != var81) {
                if (NIL != module0178.f11284(var82)) {
                    final SubLObject var83 = module0178.f11333(var82);
                    if (NIL == module0004.f104(var83, f32290(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL == module0004.f104(var83, var70, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        SubLObject var84 = (SubLObject)NIL;
                        if (NIL == var84) {
                            SubLObject var85 = f32290();
                            SubLObject var86 = (SubLObject)NIL;
                            var86 = var85.first();
                            while (NIL == var84 && NIL != var85) {
                                if (NIL != module0260.f17089(var83, var86, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                    var84 = (SubLObject)ConsesLow.list($ic66$, var83, var86);
                                }
                                else if (NIL != module0260.f17094(var83, var86, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                    var84 = (SubLObject)ConsesLow.list($ic69$, var83, var86);
                                }
                                var85 = var85.rest();
                                var86 = var85.first();
                            }
                        }
                        if (NIL != var84) {
                            var70 = (SubLObject)ConsesLow.cons(var83, var70);
                            var69 = ConsesLow.append(var69, (SubLObject)ConsesLow.list(module0191.f11990((SubLObject)$ic70$, var84, module0147.$g2095$.getDynamicValue(var68), (SubLObject)UNPROVIDED)));
                        }
                    }
                }
                var81 = var81.rest();
                var82 = var81.first();
            }
        }
        finally {
            $g3797$.rebind(var80, var68);
            $g3796$.rebind(var79, var68);
            $g3795$.rebind(var78, var68);
            $g3794$.rebind(var77, var68);
            $g3793$.rebind(var76, var68);
            $g3792$.rebind(var75, var68);
            module0147.$g2096$.rebind(var74, var68);
            module0147.$g2094$.rebind(var73, var68);
            module0147.$g2095$.rebind(var72, var68);
        }
        return var69;
    }
    
    public static SubLObject f32335(final SubLObject var11) {
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var11, var11, (SubLObject)$ic71$);
        var12 = var11.first();
        SubLObject var17 = var11.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var11, (SubLObject)$ic71$);
        var13 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var11, (SubLObject)$ic71$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var11, (SubLObject)$ic71$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var11, (SubLObject)$ic71$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            if (NIL == module0004.f106(var16)) {
                return (SubLObject)NIL;
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var11, (SubLObject)$ic71$);
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f32336(final SubLObject var11) {
        return module0191.f11990((SubLObject)$ic72$, var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f32337(final SubLObject var11, SubLObject var86) {
        if (var86 == UNPROVIDED) {
            var86 = (SubLObject)NIL;
        }
        return f32335(var11);
    }
    
    public static SubLObject f32338(final SubLObject var11, SubLObject var86) {
        if (var86 == UNPROVIDED) {
            var86 = (SubLObject)NIL;
        }
        if (NIL != f32330(var11, (SubLObject)UNPROVIDED)) {
            final SubLObject var87 = f32336(var11);
            module0347.f23330(var87, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32339(final SubLObject var11, SubLObject var86) {
        if (var86 == UNPROVIDED) {
            var86 = (SubLObject)NIL;
        }
        return f32335(var11);
    }
    
    public static SubLObject f32340(final SubLObject var11) {
        final SubLObject var12 = f32312();
        SubLObject var13 = (SubLObject)NIL;
        if (NIL != var12) {
            var13 = f32341(var11, var12);
        }
        else {
            var13 = f32331(var11, (SubLObject)UNPROVIDED);
        }
        return module0052.f3709(var13);
    }
    
    public static SubLObject f32341(final SubLObject var11, final SubLObject var88) {
        final SubLThread var89 = SubLProcess.currentSubLThread();
        SubLObject var90 = (SubLObject)NIL;
        final SubLObject var91 = $g3799$.currentBinding(var89);
        final SubLObject var92 = $g3800$.currentBinding(var89);
        final SubLObject var93 = $g3801$.currentBinding(var89);
        try {
            $g3799$.bind((SubLObject)NIL, var89);
            $g3800$.bind((SubLObject)NIL, var89);
            $g3801$.bind((SubLObject)T, var89);
            SubLObject var94 = var88;
            SubLObject var95 = (SubLObject)NIL;
            var95 = var94.first();
            while (NIL != var94) {
                final SubLObject var96 = module0205.f13132(var95);
                final SubLObject var97 = module0205.f13204(var95, (SubLObject)UNPROVIDED);
                final SubLObject var98 = var96;
                if (var98.eql($ic45$)) {
                    $g3799$.setDynamicValue((SubLObject)ConsesLow.cons(var97, $g3799$.getDynamicValue(var89)), var89);
                }
                else if (var98.eql($ic46$)) {
                    $g3800$.setDynamicValue((SubLObject)ConsesLow.cons(var97, $g3800$.getDynamicValue(var89)), var89);
                }
                var94 = var94.rest();
                var95 = var94.first();
            }
            final SubLObject var38_92 = $g3792$.currentBinding(var89);
            final SubLObject var41_93 = $g3793$.currentBinding(var89);
            final SubLObject var42_94 = $g3794$.currentBinding(var89);
            final SubLObject var99 = $g3795$.currentBinding(var89);
            final SubLObject var100 = $g3796$.currentBinding(var89);
            final SubLObject var101 = $g3797$.currentBinding(var89);
            try {
                $g3792$.bind(var11, var89);
                $g3793$.bind(module0205.f13333(var11), var89);
                $g3794$.bind(f32293(var11), var89);
                $g3795$.bind(f32294(var11), var89);
                $g3796$.bind(f32296(var11), var89);
                $g3797$.bind(f32297(var11), var89);
                var90 = f32317(f32298(var11), f32290(), (SubLObject)$ic64$, f32291(), (SubLObject)UNPROVIDED);
            }
            finally {
                $g3797$.rebind(var101, var89);
                $g3796$.rebind(var100, var89);
                $g3795$.rebind(var99, var89);
                $g3794$.rebind(var42_94, var89);
                $g3793$.rebind(var41_93, var89);
                $g3792$.rebind(var38_92, var89);
            }
        }
        finally {
            $g3801$.rebind(var93, var89);
            $g3800$.rebind(var92, var89);
            $g3799$.rebind(var91, var89);
        }
        return var90;
    }
    
    public static SubLObject f32342() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0501", "f32289", "S#35692");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0501", "f32290", "S#35693", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0501", "f32291", "S#35694", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0501", "f32292", "S#35695");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0501", "f32293", "S#35696", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0501", "f32294", "S#35697", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0501", "f32295", "S#35698", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0501", "f32296", "S#35699", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0501", "f32297", "S#35700", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0501", "f32298", "S#35701", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0501", "f32299", "S#35702", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0501", "f32300", "S#35703");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0501", "f32301", "S#35704", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0501", "f32302", "S#35705");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0501", "f32303", "S#35706");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0501", "f32304", "S#35707");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0501", "f32305", "S#35708", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0501", "f32306", "S#35709", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0501", "f32307", "S#35710", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0501", "f32308", "S#35711", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0501", "f32309", "S#35712", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0501", "f32310", "S#35713", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0501", "f32311", "S#35714", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0501", "f32312", "S#35715", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0501", "f32313", "S#35716", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0501", "f32315", "S#35717", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0501", "f32314", "S#35718", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0501", "f32316", "S#35719", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0501", "f32317", "S#35720", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0501", "f32318", "S#35721", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0501", "f32319", "S#35722", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0501", "f32320", "S#35723", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0501", "f32321", "S#35724", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0501", "f32322", "S#35725", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0501", "f32323", "S#35726", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0501", "f32324", "S#35727", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0501", "f32325", "S#35728", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0501", "f32326", "S#35729", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0501", "f32327", "S#35730", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0501", "f32328", "S#35731", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0501", "f32329", "S#35732", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0501", "f32330", "S#24943", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0501", "f32331", "S#35733", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0501", "f32332", "S#24944", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0501", "f32334", "S#24945", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0501", "f32333", "S#35734", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0501", "f32335", "S#35735", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0501", "f32336", "S#35736", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0501", "f32337", "S#35737", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0501", "f32338", "S#35738", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0501", "f32339", "S#35739", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0501", "f32340", "S#35740", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0501", "f32341", "S#35741", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32343() {
        $g3792$ = SubLFiles.defparameter("S#35742", (SubLObject)NIL);
        $g3793$ = SubLFiles.defparameter("S#35743", (SubLObject)NIL);
        $g3794$ = SubLFiles.defparameter("S#35744", (SubLObject)NIL);
        $g3795$ = SubLFiles.defparameter("S#35745", (SubLObject)NIL);
        $g3796$ = SubLFiles.defparameter("S#35746", (SubLObject)NIL);
        $g3797$ = SubLFiles.defparameter("S#35747", (SubLObject)NIL);
        $g3798$ = SubLFiles.deflexical("S#35748", (SubLObject)$ic20$);
        $g3799$ = SubLFiles.defparameter("S#35749", (SubLObject)NIL);
        $g3800$ = SubLFiles.defparameter("S#35750", (SubLObject)NIL);
        $g3801$ = SubLFiles.defparameter("S#35751", (SubLObject)NIL);
        $g3802$ = SubLFiles.deflexical("S#35752", module0018.$g661$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32344() {
        module0340.f22941((SubLObject)$ic73$, (SubLObject)$ic74$);
        module0340.f22941((SubLObject)$ic75$, (SubLObject)$ic76$);
        module0340.f22938($ic44$);
        module0358.f23771((SubLObject)$ic77$, $ic44$, (SubLObject)THREE_INTEGER);
        module0358.f23730((SubLObject)$ic78$, (SubLObject)$ic79$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f32342();
    }
    
    public void initializeVariables() {
        f32343();
    }
    
    public void runTopLevelForms() {
        f32344();
    }
    
    static {
        me = (SubLFile)new module0501();
        $g3792$ = null;
        $g3793$ = null;
        $g3794$ = null;
        $g3795$ = null;
        $g3796$ = null;
        $g3797$ = null;
        $g3798$ = null;
        $g3799$ = null;
        $g3800$ = null;
        $g3801$ = null;
        $g3802$ = null;
        $ic0$ = ConsesLow.list((SubLObject)makeSymbol("S#19777", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic1$ = makeSymbol("PROGN");
        $ic2$ = makeSymbol("CHECK-TYPE");
        $ic3$ = ConsesLow.list((SubLObject)makeSymbol("LISTP"));
        $ic4$ = makeSymbol("CLET");
        $ic5$ = makeSymbol("S#35746", "CYC");
        $ic6$ = ConsesLow.list((SubLObject)makeSymbol("S#25811", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic7$ = makeSymbol("S#35747", "CYC");
        $ic8$ = makeString("No valid hl-variable in asent : ~A");
        $ic9$ = makeString("No initial node applicable for asent ~A~%");
        $ic10$ = ConsesLow.list((SubLObject)makeSymbol("S#13100", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic11$ = makeSymbol("S#35742", "CYC");
        $ic12$ = makeSymbol("S#35743", "CYC");
        $ic13$ = makeSymbol("ATOMIC-SENTENCE-PREDICATE");
        $ic14$ = makeSymbol("S#35744", "CYC");
        $ic15$ = makeSymbol("S#35696", "CYC");
        $ic16$ = makeSymbol("S#35745", "CYC");
        $ic17$ = makeSymbol("S#35697", "CYC");
        $ic18$ = makeSymbol("S#35699", "CYC");
        $ic19$ = makeSymbol("S#35700", "CYC");
        $ic20$ = ConsesLow.list((SubLObject)makeKeyword("TYPE"), (SubLObject)makeKeyword("TRANSITIVE-REASONING"), (SubLObject)makeKeyword("DIRECTION"), (SubLObject)makeKeyword("ACCESSIBLE"), (SubLObject)makeKeyword("MARKING"), (SubLObject)makeKeyword("DEPTH-MARKING"));
        $ic21$ = ConsesLow.list((SubLObject)makeSymbol("SEARCH"), (SubLObject)makeSymbol("S#138", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic22$ = makeSymbol("S#11680", "CYC");
        $ic23$ = makeSymbol("GETF");
        $ic24$ = ConsesLow.list((SubLObject)makeKeyword("MT"));
        $ic25$ = makeSymbol("S#10969", "CYC");
        $ic26$ = makeSymbol("S#35704", "CYC");
        $ic27$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#35749", "CYC"), (SubLObject)NIL), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#35750", "CYC"), (SubLObject)NIL), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#35751", "CYC"), (SubLObject)T));
        $ic28$ = ConsesLow.list((SubLObject)makeSymbol("S#6061", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic29$ = makeUninternedSymbol("US#782417F");
        $ic30$ = makeUninternedSymbol("US#506B097");
        $ic31$ = makeSymbol("FIND-IF");
        $ic32$ = ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#35710", "CYC"));
        $ic33$ = makeSymbol("S#534", "CYC");
        $ic34$ = makeSymbol("EL-VAR?");
        $ic35$ = makeSymbol("S#13440", "CYC");
        $ic36$ = makeSymbol("S#15505", "CYC");
        $ic37$ = makeSymbol("S#35749", "CYC");
        $ic38$ = makeSymbol("S#35708", "CYC");
        $ic39$ = makeSymbol("S#35750", "CYC");
        $ic40$ = makeSymbol("S#35709", "CYC");
        $ic41$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#35751", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("COR"), (SubLObject)makeSymbol("S#35749", "CYC"), (SubLObject)makeSymbol("S#35750", "CYC"))));
        $ic42$ = makeSymbol("S#35711", "CYC");
        $ic43$ = makeSymbol("S#35712", "CYC");
        $ic44$ = constant_handles_oc.f8479((SubLObject)makeString("relatedToVia"));
        $ic45$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic46$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic47$ = makeSymbol("LISTP");
        $ic48$ = makeKeyword("ORDER");
        $ic49$ = makeKeyword("DEPTH-FIRST");
        $ic50$ = makeKeyword("MT");
        $ic51$ = makeKeyword("PREDICATES");
        $ic52$ = makeKeyword("CUTOFF");
        $ic53$ = ConsesLow.list((SubLObject)makeKeyword("ADD-TO-RESULT?"), (SubLObject)makeKeyword("NODES-ON-WIND"));
        $ic54$ = makeKeyword("GOAL");
        $ic55$ = makeKeyword("ITERATIVE-DEEPENING");
        $ic56$ = makeKeyword("JUSTIFY?");
        $ic57$ = makeKeyword("ADD-TO-RESULT?");
        $ic58$ = makeKeyword("EDGES-ON-UNWIND");
        $ic59$ = makeKeyword("ALL");
        $ic60$ = ConsesLow.list((SubLObject)makeKeyword("ADD-TO-RESULT?"), (SubLObject)makeKeyword("EDGES-ON-UNWIND"), (SubLObject)makeKeyword("JUSTIFY?"), (SubLObject)makeKeyword("ALL"));
        $ic61$ = ConsesLow.list((SubLObject)makeKeyword("JUSTIFY?"), (SubLObject)makeKeyword("ALL"), (SubLObject)makeKeyword("ADD-TO-RESULT?"), (SubLObject)makeKeyword("EDGES-ON-UNWIND"));
        $ic62$ = makeSymbol("S#35710", "CYC");
        $ic63$ = makeKeyword("GOAL-FN");
        $ic64$ = makeSymbol("S#35714", "CYC");
        $ic65$ = ConsesLow.list((SubLObject)makeKeyword("SATISFY-FN"), (SubLObject)makeSymbol("S#35714", "CYC"), (SubLObject)makeKeyword("JUSTIFY?"), (SubLObject)makeKeyword("ALL"), (SubLObject)makeKeyword("ADD-TO-RESULT?"), (SubLObject)makeKeyword("EDGES-ON-UNWIND"));
        $ic66$ = constant_handles_oc.f8479((SubLObject)makeString("genlPreds"));
        $ic67$ = makeKeyword("ASSERTION");
        $ic68$ = makeSymbol("FIRST");
        $ic69$ = constant_handles_oc.f8479((SubLObject)makeString("genlInverse"));
        $ic70$ = makeKeyword("GENLPREDS");
        $ic71$ = ConsesLow.list((SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#750", "CYC"), (SubLObject)makeSymbol("S#751", "CYC"), (SubLObject)makeSymbol("S#35753", "CYC"), (SubLObject)makeSymbol("S#1993", "CYC"));
        $ic72$ = makeKeyword("RTV");
        $ic73$ = makeKeyword("REMOVAL-RELATED-TO-VIA-CHECK");
        $ic74$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("relatedToVia")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("relatedToVia")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("TheSet")), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)makeKeyword("INTEGER")), makeKeyword("REQUIRED"), makeSymbol("S#35737", "CYC"), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35752", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#35738", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$relatedToVia <fort> <fort> <SOP> <num>)"), makeKeyword("EXAMPLE"), makeString("(#$relatedToVia #$KevinBacon #$KevinSpacey (#$TheSet #$costars) 2)") });
        $ic75$ = makeKeyword("REMOVAL-RELATED-TO-VIA-GENERATE");
        $ic76$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("relatedToVia")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("relatedToVia")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("VARIABLE"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("TheSet")), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)makeKeyword("INTEGER")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("relatedToVia")), (SubLObject)makeKeyword("VARIABLE"), (SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("TheSet")), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)makeKeyword("INTEGER"))), makeKeyword("REQUIRED"), makeSymbol("S#35739", "CYC"), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35752", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#13100", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13100", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35740", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18075", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("TERM-UNIFY"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35698", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13100", "CYC"))), (SubLObject)makeKeyword("INPUT")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13100", "CYC"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("RTV"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(#$relatedToVia <VAR> <fort> <SOP> <num>)\n    and\n    (#$relatedToVia <fort> <VAR> <SOP> <num>)"), makeKeyword("EXAMPLE"), makeString("(#$relatedToVia ?WHO #$KevinBacon (#$TheSet #$costars) 2)\n    and\n    (#$relatedToVia #$KevinBacon ?WHO (#$TheSet #$costars) 2)") });
        $ic77$ = makeKeyword("POS");
        $ic78$ = makeKeyword("RELATED-TO-VIA-EITHER-ARG1-OR-ARG2-BINDABLE");
        $ic79$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("relatedToVia")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("relatedToVia")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)makeKeyword("PREFERENCE"), (SubLObject)makeSymbol("S#26435", "CYC"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 470 ms
	
	Decompiled with Procyon 0.5.32.
*/