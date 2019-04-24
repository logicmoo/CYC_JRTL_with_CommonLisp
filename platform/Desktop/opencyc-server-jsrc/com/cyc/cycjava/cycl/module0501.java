package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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
        SubLObject var5 = (SubLObject)module0501.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0501.$ic0$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0501.$ic1$, (SubLObject)ConsesLow.listS((SubLObject)module0501.$ic2$, var5, (SubLObject)module0501.$ic3$), (SubLObject)ConsesLow.listS((SubLObject)module0501.$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0501.$ic5$, var5)), ConsesLow.append(var6, (SubLObject)module0501.NIL)));
    }
    
    public static SubLObject f32290() {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        return module0501.$g3796$.getDynamicValue(var7);
    }
    
    public static SubLObject f32291() {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        return module0501.$g3797$.getDynamicValue(var7);
    }
    
    public static SubLObject f32292(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0501.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0501.$ic6$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0501.$ic1$, (SubLObject)ConsesLow.listS((SubLObject)module0501.$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0501.$ic7$, var5)), ConsesLow.append(var6, (SubLObject)module0501.NIL)));
    }
    
    public static SubLObject f32293(final SubLObject var11) {
        SubLObject var12 = (SubLObject)module0501.NIL;
        SubLObject var13 = module0035.f2160(module0202.f12728(var11, (SubLObject)module0501.UNPROVIDED), (SubLObject)module0501.UNPROVIDED).rest();
        SubLObject var14 = (SubLObject)module0501.NIL;
        var14 = var13.first();
        while (module0501.NIL != var13) {
            if (module0501.NIL == module0206.f13500(module0205.f13384(var11, var14, (SubLObject)module0501.UNPROVIDED))) {
                var12 = (SubLObject)ConsesLow.cons(var14, var12);
            }
            var13 = var13.rest();
            var14 = var13.first();
        }
        return Sequences.nreverse(var12);
    }
    
    public static SubLObject f32294(final SubLObject var11) {
        SubLObject var12 = (SubLObject)module0501.NIL;
        SubLObject var13 = module0035.f2160(module0202.f12728(var11, (SubLObject)module0501.UNPROVIDED), (SubLObject)module0501.UNPROVIDED).rest();
        SubLObject var14 = (SubLObject)module0501.NIL;
        var14 = var13.first();
        while (module0501.NIL != var13) {
            if (module0501.NIL != module0206.f13500(module0205.f13384(var11, var14, (SubLObject)module0501.UNPROVIDED))) {
                var12 = (SubLObject)ConsesLow.cons(var14, var12);
            }
            var13 = var13.rest();
            var14 = var13.first();
        }
        return Sequences.nreverse(var12);
    }
    
    public static SubLObject f32295(final SubLObject var11) {
        if (module0501.NIL != module0206.f13500(module0205.f13384(var11, (SubLObject)module0501.ONE_INTEGER, (SubLObject)module0501.UNPROVIDED))) {
            return module0205.f13384(var11, (SubLObject)module0501.ONE_INTEGER, (SubLObject)module0501.UNPROVIDED);
        }
        if (module0501.NIL != module0206.f13500(module0205.f13384(var11, (SubLObject)module0501.TWO_INTEGER, (SubLObject)module0501.UNPROVIDED))) {
            return module0205.f13384(var11, (SubLObject)module0501.TWO_INTEGER, (SubLObject)module0501.UNPROVIDED);
        }
        module0134.f8815((SubLObject)module0501.$ic8$, var11, (SubLObject)module0501.UNPROVIDED, (SubLObject)module0501.UNPROVIDED, (SubLObject)module0501.UNPROVIDED, (SubLObject)module0501.UNPROVIDED, (SubLObject)module0501.UNPROVIDED);
        return (SubLObject)module0501.NIL;
    }
    
    public static SubLObject f32296(final SubLObject var11) {
        return module0205.f13304(module0205.f13384(var11, (SubLObject)module0501.THREE_INTEGER, (SubLObject)module0501.UNPROVIDED), (SubLObject)module0501.UNPROVIDED);
    }
    
    public static SubLObject f32297(final SubLObject var11) {
        return module0205.f13384(var11, (SubLObject)module0501.FOUR_INTEGER, (SubLObject)module0501.UNPROVIDED);
    }
    
    public static SubLObject f32298(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        if (module0501.NIL != module0004.f104((SubLObject)module0501.ONE_INTEGER, module0501.$g3794$.getDynamicValue(var12), (SubLObject)module0501.UNPROVIDED, (SubLObject)module0501.UNPROVIDED) && module0501.NIL != module0004.f104((SubLObject)module0501.TWO_INTEGER, module0501.$g3795$.getDynamicValue(var12), (SubLObject)module0501.UNPROVIDED, (SubLObject)module0501.UNPROVIDED)) {
            return module0205.f13384(var11, (SubLObject)module0501.ONE_INTEGER, (SubLObject)module0501.UNPROVIDED);
        }
        if (module0501.NIL != module0004.f104((SubLObject)module0501.TWO_INTEGER, module0501.$g3794$.getDynamicValue(var12), (SubLObject)module0501.UNPROVIDED, (SubLObject)module0501.UNPROVIDED) && module0501.NIL != module0004.f104((SubLObject)module0501.ONE_INTEGER, module0501.$g3795$.getDynamicValue(var12), (SubLObject)module0501.UNPROVIDED, (SubLObject)module0501.UNPROVIDED)) {
            return module0205.f13384(var11, (SubLObject)module0501.TWO_INTEGER, (SubLObject)module0501.UNPROVIDED);
        }
        if (module0501.NIL != module0004.f104((SubLObject)module0501.ONE_INTEGER, module0501.$g3794$.getDynamicValue(var12), (SubLObject)module0501.UNPROVIDED, (SubLObject)module0501.UNPROVIDED) && module0501.NIL != module0004.f104((SubLObject)module0501.TWO_INTEGER, module0501.$g3794$.getDynamicValue(var12), (SubLObject)module0501.UNPROVIDED, (SubLObject)module0501.UNPROVIDED)) {
            return module0205.f13384(var11, (SubLObject)module0501.ONE_INTEGER, (SubLObject)module0501.UNPROVIDED);
        }
        Errors.error((SubLObject)module0501.$ic9$, var11);
        return (SubLObject)module0501.NIL;
    }
    
    public static SubLObject f32299(final SubLObject var11) {
        return conses_high.third(var11);
    }
    
    public static SubLObject f32300(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0501.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0501.$ic10$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0501.$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0501.$ic11$, var5), (SubLObject)ConsesLow.list((SubLObject)module0501.$ic12$, (SubLObject)ConsesLow.list((SubLObject)module0501.$ic13$, var5)), (SubLObject)ConsesLow.list((SubLObject)module0501.$ic14$, (SubLObject)ConsesLow.list((SubLObject)module0501.$ic15$, var5)), (SubLObject)ConsesLow.list((SubLObject)module0501.$ic16$, (SubLObject)ConsesLow.list((SubLObject)module0501.$ic17$, var5)), (SubLObject)ConsesLow.list((SubLObject)module0501.$ic5$, (SubLObject)ConsesLow.list((SubLObject)module0501.$ic18$, var5)), (SubLObject)ConsesLow.list((SubLObject)module0501.$ic7$, (SubLObject)ConsesLow.list((SubLObject)module0501.$ic19$, var5))), ConsesLow.append(var6, (SubLObject)module0501.NIL));
    }
    
    public static SubLObject f32301(final SubLObject var17) {
        return ConsesLow.append(module0501.$g3798$.getGlobalValue(), var17);
    }
    
    public static SubLObject f32302(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0501.NIL;
        SubLObject var6 = (SubLObject)module0501.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0501.$ic21$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0501.$ic21$);
        var6 = var4.first();
        final SubLObject var7;
        var4 = (var7 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0501.$ic22$, (SubLObject)ConsesLow.listS((SubLObject)module0501.$ic23$, var6, (SubLObject)module0501.$ic24$), (SubLObject)ConsesLow.listS((SubLObject)module0501.$ic25$, var5, (SubLObject)ConsesLow.list((SubLObject)module0501.$ic26$, var6), ConsesLow.append(var7, (SubLObject)module0501.NIL)));
    }
    
    public static SubLObject f32303(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0501.$ic4$, (SubLObject)module0501.$ic27$, ConsesLow.append(var5, (SubLObject)module0501.NIL));
    }
    
    public static SubLObject f32304(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0501.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0501.$ic28$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        final SubLObject var7 = (SubLObject)module0501.$ic29$;
        final SubLObject var8 = (SubLObject)module0501.$ic30$;
        return (SubLObject)ConsesLow.list((SubLObject)module0501.$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.list((SubLObject)module0501.$ic31$, (SubLObject)module0501.$ic32$, var5)), (SubLObject)ConsesLow.list(var8, (SubLObject)ConsesLow.list((SubLObject)module0501.$ic33$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0501.$ic34$, (SubLObject)ConsesLow.list((SubLObject)module0501.$ic35$, var7)), (SubLObject)ConsesLow.list((SubLObject)module0501.$ic35$, var7)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0501.$ic34$, (SubLObject)ConsesLow.list((SubLObject)module0501.$ic36$, var7)), (SubLObject)ConsesLow.list((SubLObject)module0501.$ic36$, var7)))), (SubLObject)ConsesLow.list((SubLObject)module0501.$ic37$, (SubLObject)ConsesLow.list((SubLObject)module0501.$ic38$, var5, var8)), (SubLObject)ConsesLow.list((SubLObject)module0501.$ic39$, (SubLObject)ConsesLow.list((SubLObject)module0501.$ic40$, var5, var8))), (SubLObject)ConsesLow.listS((SubLObject)module0501.$ic4$, (SubLObject)module0501.$ic41$, ConsesLow.append(var6, (SubLObject)module0501.NIL)));
    }
    
    public static SubLObject f32305(final SubLObject var25, final SubLObject var27) {
        final SubLObject var28 = module0035.f2259((SubLObject)module0501.$ic42$, var25, (SubLObject)module0501.UNPROVIDED);
        SubLObject var29 = (SubLObject)module0501.NIL;
        SubLObject var30 = var28;
        SubLObject var31 = (SubLObject)module0501.NIL;
        var31 = var30.first();
        while (module0501.NIL != var30) {
            if (module0501.NIL == var27 || module0205.f13203(var31, (SubLObject)module0501.UNPROVIDED).eql(var27)) {
                final SubLObject var32 = module0205.f13204(var31, (SubLObject)module0501.UNPROVIDED);
                if (module0501.NIL != module0173.f10955(var32)) {
                    var29 = (SubLObject)ConsesLow.cons(var32, var29);
                }
            }
            var30 = var30.rest();
            var31 = var30.first();
        }
        return var29;
    }
    
    public static SubLObject f32306(final SubLObject var25, final SubLObject var27) {
        final SubLObject var28 = module0035.f2259((SubLObject)module0501.$ic43$, var25, (SubLObject)module0501.UNPROVIDED);
        SubLObject var29 = (SubLObject)module0501.NIL;
        SubLObject var30 = var28;
        SubLObject var31 = (SubLObject)module0501.NIL;
        var31 = var30.first();
        while (module0501.NIL != var30) {
            if (module0501.NIL == var27 || module0205.f13203(var31, (SubLObject)module0501.UNPROVIDED).eql(var27)) {
                final SubLObject var32 = module0205.f13204(var31, (SubLObject)module0501.UNPROVIDED);
                if (module0501.NIL != module0173.f10955(var32)) {
                    var29 = (SubLObject)ConsesLow.cons(var32, var29);
                }
            }
            var30 = var30.rest();
            var31 = var30.first();
        }
        return var29;
    }
    
    public static SubLObject f32307(final SubLObject var25) {
        return Equality.eql(module0205.f13132(var25), module0501.$ic44$);
    }
    
    public static SubLObject f32308(final SubLObject var25) {
        return Equality.eql(module0205.f13132(var25), module0501.$ic45$);
    }
    
    public static SubLObject f32309(final SubLObject var25) {
        return Equality.eql(module0205.f13132(var25), module0501.$ic46$);
    }
    
    public static SubLObject f32310() {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        return module0501.$g3801$.getDynamicValue(var7);
    }
    
    public static SubLObject f32311(final SubLObject var20, final SubLObject var33) {
        final SubLThread var34 = SubLProcess.currentSubLThread();
        SubLObject var35 = (SubLObject)module0501.T;
        if (module0501.NIL != module0501.$g3799$.getDynamicValue(var34) && module0501.NIL == module0259.f16902(var33, module0501.$g3799$.getDynamicValue(var34), (SubLObject)module0501.UNPROVIDED, (SubLObject)module0501.UNPROVIDED)) {
            var35 = (SubLObject)module0501.NIL;
        }
        if (module0501.NIL != module0501.$g3800$.getDynamicValue(var34) && module0501.NIL == module0256.f16606(var33, module0501.$g3800$.getDynamicValue(var34), (SubLObject)module0501.UNPROVIDED, (SubLObject)module0501.UNPROVIDED)) {
            var35 = (SubLObject)module0501.NIL;
        }
        return var35;
    }
    
    public static SubLObject f32312() {
        return (SubLObject)module0501.NIL;
    }
    
    public static SubLObject f32313(final SubLObject var35) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0501.NIL != f32314(var35) || module0501.NIL != f32315(var35));
    }
    
    public static SubLObject f32315(final SubLObject var35) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0501.NIL != module0202.f12865(var35) && module0501.NIL != module0193.f12067(module0205.f13203(var35, (SubLObject)module0501.UNPROVIDED)) && module0501.NIL != module0173.f10955(module0205.f13204(var35, (SubLObject)module0501.UNPROVIDED)));
    }
    
    public static SubLObject f32314(final SubLObject var35) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0501.NIL != module0202.f12859(var35) && module0501.NIL != module0193.f12067(module0205.f13203(var35, (SubLObject)module0501.UNPROVIDED)) && module0501.NIL != module0173.f10955(module0205.f13204(var35, (SubLObject)module0501.UNPROVIDED)));
    }
    
    public static SubLObject f32316(final SubLObject var33, final SubLObject var36, final SubLObject var10, SubLObject var37) {
        if (var37 == module0501.UNPROVIDED) {
            var37 = (SubLObject)module0501.NIL;
        }
        final SubLThread var38 = SubLProcess.currentSubLThread();
        SubLObject var39 = (SubLObject)module0501.NIL;
        assert module0501.NIL != Types.listp(var36) : var36;
        final SubLObject var40 = module0501.$g3796$.currentBinding(var38);
        try {
            module0501.$g3796$.bind(var36, var38);
            final SubLObject var41 = conses_high.getf((SubLObject)ConsesLow.listS((SubLObject)module0501.$ic48$, new SubLObject[] { module0501.$ic49$, module0501.$ic50$, var37, module0501.$ic51$, var36, module0501.$ic52$, var10, module0501.$ic53$ }), (SubLObject)module0501.$ic50$, (SubLObject)module0501.UNPROVIDED);
            final SubLObject var38_40 = module0147.$g2095$.currentBinding(var38);
            final SubLObject var42 = module0147.$g2094$.currentBinding(var38);
            final SubLObject var43 = module0147.$g2096$.currentBinding(var38);
            try {
                module0147.$g2095$.bind(module0147.f9545(var41), var38);
                module0147.$g2094$.bind(module0147.f9546(var41), var38);
                module0147.$g2096$.bind(module0147.f9549(var41), var38);
                final SubLObject var44 = module0134.f8737(f32301((SubLObject)ConsesLow.listS((SubLObject)module0501.$ic48$, new SubLObject[] { module0501.$ic49$, module0501.$ic50$, var37, module0501.$ic51$, var36, module0501.$ic52$, var10, module0501.$ic53$ })));
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
            module0501.$g3796$.rebind(var40, var38);
        }
        return var39;
    }
    
    public static SubLObject f32317(final SubLObject var33, final SubLObject var36, final SubLObject var43, final SubLObject var10, SubLObject var37) {
        if (var37 == module0501.UNPROVIDED) {
            var37 = (SubLObject)module0501.NIL;
        }
        return module0035.remove_if_not(var43, f32316(var33, var36, var10, var37), (SubLObject)module0501.UNPROVIDED, (SubLObject)module0501.UNPROVIDED, (SubLObject)module0501.UNPROVIDED, (SubLObject)module0501.UNPROVIDED);
    }
    
    public static SubLObject f32318(final SubLObject var44, final SubLObject var45, final SubLObject var36, final SubLObject var10, SubLObject var37) {
        if (var37 == module0501.UNPROVIDED) {
            var37 = (SubLObject)module0501.NIL;
        }
        final SubLThread var46 = SubLProcess.currentSubLThread();
        SubLObject var47 = (SubLObject)module0501.NIL;
        assert module0501.NIL != Types.listp(var36) : var36;
        final SubLObject var48 = module0501.$g3796$.currentBinding(var46);
        try {
            module0501.$g3796$.bind(var36, var46);
            final SubLObject var49 = conses_high.getf((SubLObject)ConsesLow.list(new SubLObject[] { module0501.$ic48$, module0501.$ic49$, module0501.$ic50$, var37, module0501.$ic51$, var36, module0501.$ic52$, var10, module0501.$ic54$, var45 }), (SubLObject)module0501.$ic50$, (SubLObject)module0501.UNPROVIDED);
            final SubLObject var38_46 = module0147.$g2095$.currentBinding(var46);
            final SubLObject var50 = module0147.$g2094$.currentBinding(var46);
            final SubLObject var51 = module0147.$g2096$.currentBinding(var46);
            try {
                module0147.$g2095$.bind(module0147.f9545(var49), var46);
                module0147.$g2094$.bind(module0147.f9546(var49), var46);
                module0147.$g2096$.bind(module0147.f9549(var49), var46);
                final SubLObject var52 = module0134.f8737(f32301((SubLObject)ConsesLow.list(new SubLObject[] { module0501.$ic48$, module0501.$ic49$, module0501.$ic50$, var37, module0501.$ic51$, var36, module0501.$ic52$, var10, module0501.$ic54$, var45 })));
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
            module0501.$g3796$.rebind(var48, var46);
        }
        return var47;
    }
    
    public static SubLObject f32319(final SubLObject var44, final SubLObject var45, final SubLObject var36, final SubLObject var10, SubLObject var37) {
        if (var37 == module0501.UNPROVIDED) {
            var37 = (SubLObject)module0501.NIL;
        }
        final SubLThread var46 = SubLProcess.currentSubLThread();
        SubLObject var47 = (SubLObject)module0501.NIL;
        final SubLObject var48 = module0145.$g1916$.currentBinding(var46);
        try {
            module0145.$g1916$.bind((SubLObject)module0501.T, var46);
            assert module0501.NIL != Types.listp(var36) : var36;
            final SubLObject var38_47 = module0501.$g3796$.currentBinding(var46);
            try {
                module0501.$g3796$.bind(var36, var46);
                final SubLObject var49 = conses_high.getf((SubLObject)ConsesLow.list(new SubLObject[] { module0501.$ic48$, module0501.$ic55$, module0501.$ic50$, var37, module0501.$ic51$, var36, module0501.$ic52$, var10, module0501.$ic56$, module0501.T, module0501.$ic57$, module0501.$ic58$, module0501.$ic54$, var45 }), (SubLObject)module0501.$ic50$, (SubLObject)module0501.UNPROVIDED);
                final SubLObject var38_48 = module0147.$g2095$.currentBinding(var46);
                final SubLObject var50 = module0147.$g2094$.currentBinding(var46);
                final SubLObject var51 = module0147.$g2096$.currentBinding(var46);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var49), var46);
                    module0147.$g2094$.bind(module0147.f9546(var49), var46);
                    module0147.$g2096$.bind(module0147.f9549(var49), var46);
                    final SubLObject var52 = module0134.f8737(f32301((SubLObject)ConsesLow.list(new SubLObject[] { module0501.$ic48$, module0501.$ic55$, module0501.$ic50$, var37, module0501.$ic51$, var36, module0501.$ic52$, var10, module0501.$ic56$, module0501.T, module0501.$ic57$, module0501.$ic58$, module0501.$ic54$, var45 })));
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
                module0501.$g3796$.rebind(var38_47, var46);
            }
        }
        finally {
            module0145.$g1916$.rebind(var48, var46);
        }
        return var47;
    }
    
    public static SubLObject f32320(final SubLObject var44, final SubLObject var45, final SubLObject var36, final SubLObject var10, SubLObject var37) {
        if (var37 == module0501.UNPROVIDED) {
            var37 = (SubLObject)module0501.NIL;
        }
        final SubLThread var46 = SubLProcess.currentSubLThread();
        SubLObject var47 = (SubLObject)module0501.NIL;
        final SubLObject var48 = module0145.$g1916$.currentBinding(var46);
        try {
            module0145.$g1916$.bind((SubLObject)module0501.T, var46);
            assert module0501.NIL != Types.listp(var36) : var36;
            final SubLObject var38_49 = module0501.$g3796$.currentBinding(var46);
            try {
                module0501.$g3796$.bind(var36, var46);
                final SubLObject var49 = conses_high.getf((SubLObject)ConsesLow.list(new SubLObject[] { module0501.$ic48$, module0501.$ic55$, module0501.$ic50$, var37, module0501.$ic51$, var36, module0501.$ic52$, var10, module0501.$ic56$, module0501.$ic59$, module0501.$ic57$, module0501.$ic58$, module0501.$ic54$, var45 }), (SubLObject)module0501.$ic50$, (SubLObject)module0501.UNPROVIDED);
                final SubLObject var38_50 = module0147.$g2095$.currentBinding(var46);
                final SubLObject var50 = module0147.$g2094$.currentBinding(var46);
                final SubLObject var51 = module0147.$g2096$.currentBinding(var46);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var49), var46);
                    module0147.$g2094$.bind(module0147.f9546(var49), var46);
                    module0147.$g2096$.bind(module0147.f9549(var49), var46);
                    final SubLObject var52 = module0134.f8737(f32301((SubLObject)ConsesLow.list(new SubLObject[] { module0501.$ic48$, module0501.$ic55$, module0501.$ic50$, var37, module0501.$ic51$, var36, module0501.$ic52$, var10, module0501.$ic56$, module0501.$ic59$, module0501.$ic57$, module0501.$ic58$, module0501.$ic54$, var45 })));
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
                module0501.$g3796$.rebind(var38_49, var46);
            }
        }
        finally {
            module0145.$g1916$.rebind(var48, var46);
        }
        return var47;
    }
    
    public static SubLObject f32321(final SubLObject var33, final SubLObject var36, final SubLObject var51, SubLObject var37) {
        if (var37 == module0501.UNPROVIDED) {
            var37 = (SubLObject)module0501.NIL;
        }
        return module0035.f2269(f32316(var33, var36, var51, var37), (SubLObject)module0501.UNPROVIDED, (SubLObject)module0501.UNPROVIDED, (SubLObject)module0501.UNPROVIDED, (SubLObject)module0501.UNPROVIDED, (SubLObject)module0501.UNPROVIDED);
    }
    
    public static SubLObject f32322(final SubLObject var33, final SubLObject var36, final SubLObject var51, SubLObject var37) {
        if (var37 == module0501.UNPROVIDED) {
            var37 = (SubLObject)module0501.NIL;
        }
        final SubLThread var52 = SubLProcess.currentSubLThread();
        SubLObject var53 = (SubLObject)module0501.NIL;
        assert module0501.NIL != Types.listp(var36) : var36;
        final SubLObject var54 = module0501.$g3796$.currentBinding(var52);
        try {
            module0501.$g3796$.bind(var36, var52);
            final SubLObject var55 = conses_high.getf((SubLObject)ConsesLow.listS((SubLObject)module0501.$ic48$, new SubLObject[] { module0501.$ic55$, module0501.$ic50$, var37, module0501.$ic51$, var36, module0501.$ic52$, var51, module0501.$ic60$ }), (SubLObject)module0501.$ic50$, (SubLObject)module0501.UNPROVIDED);
            final SubLObject var38_52 = module0147.$g2095$.currentBinding(var52);
            final SubLObject var56 = module0147.$g2094$.currentBinding(var52);
            final SubLObject var57 = module0147.$g2096$.currentBinding(var52);
            try {
                module0147.$g2095$.bind(module0147.f9545(var55), var52);
                module0147.$g2094$.bind(module0147.f9546(var55), var52);
                module0147.$g2096$.bind(module0147.f9549(var55), var52);
                final SubLObject var58 = module0134.f8737(f32301((SubLObject)ConsesLow.listS((SubLObject)module0501.$ic48$, new SubLObject[] { module0501.$ic55$, module0501.$ic50$, var37, module0501.$ic51$, var36, module0501.$ic52$, var51, module0501.$ic60$ })));
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
            module0501.$g3796$.rebind(var54, var52);
        }
        return var53;
    }
    
    public static SubLObject f32323(final SubLObject var33, final SubLObject var36, final SubLObject var51, SubLObject var37) {
        if (var37 == module0501.UNPROVIDED) {
            var37 = (SubLObject)module0501.NIL;
        }
        return f32322(var33, var36, var51, var37);
    }
    
    public static SubLObject f32324(final SubLObject var44, final SubLObject var45, final SubLObject var36, final SubLObject var51, SubLObject var37) {
        if (var37 == module0501.UNPROVIDED) {
            var37 = (SubLObject)module0501.NIL;
        }
        return f32319(var44, var45, var36, var51, var37);
    }
    
    public static SubLObject f32325(final SubLObject var44, final SubLObject var45, final SubLObject var36, final SubLObject var51, SubLObject var37) {
        if (var37 == module0501.UNPROVIDED) {
            var37 = (SubLObject)module0501.NIL;
        }
        final SubLThread var52 = SubLProcess.currentSubLThread();
        SubLObject var53 = (SubLObject)module0501.NIL;
        assert module0501.NIL != Types.listp(var36) : var36;
        final SubLObject var54 = module0501.$g3796$.currentBinding(var52);
        try {
            module0501.$g3796$.bind(var36, var52);
            final SubLObject var55 = conses_high.getf((SubLObject)ConsesLow.listS((SubLObject)module0501.$ic48$, new SubLObject[] { module0501.$ic55$, module0501.$ic50$, var37, module0501.$ic51$, var36, module0501.$ic52$, var51, module0501.$ic54$, var45, module0501.$ic61$ }), (SubLObject)module0501.$ic50$, (SubLObject)module0501.UNPROVIDED);
            final SubLObject var38_53 = module0147.$g2095$.currentBinding(var52);
            final SubLObject var56 = module0147.$g2094$.currentBinding(var52);
            final SubLObject var57 = module0147.$g2096$.currentBinding(var52);
            try {
                module0147.$g2095$.bind(module0147.f9545(var55), var52);
                module0147.$g2094$.bind(module0147.f9546(var55), var52);
                module0147.$g2096$.bind(module0147.f9549(var55), var52);
                final SubLObject var58 = module0134.f8737(f32301((SubLObject)ConsesLow.listS((SubLObject)module0501.$ic48$, new SubLObject[] { module0501.$ic55$, module0501.$ic50$, var37, module0501.$ic51$, var36, module0501.$ic52$, var51, module0501.$ic54$, var45, module0501.$ic61$ })));
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
            module0501.$g3796$.rebind(var54, var52);
        }
        return var53;
    }
    
    public static SubLObject f32326(final SubLObject var44, final SubLObject var54, final SubLObject var36, final SubLObject var51, SubLObject var37) {
        if (var37 == module0501.UNPROVIDED) {
            var37 = (SubLObject)module0501.NIL;
        }
        final SubLThread var55 = SubLProcess.currentSubLThread();
        SubLObject var56 = (SubLObject)module0501.NIL;
        assert module0501.NIL != Types.listp(var36) : var36;
        final SubLObject var57 = module0501.$g3796$.currentBinding(var55);
        try {
            module0501.$g3796$.bind(var36, var55);
            final SubLObject var58 = conses_high.getf((SubLObject)ConsesLow.listS((SubLObject)module0501.$ic48$, new SubLObject[] { module0501.$ic55$, module0501.$ic50$, var37, module0501.$ic51$, var36, module0501.$ic52$, var51, module0501.$ic54$, var54, module0501.$ic61$ }), (SubLObject)module0501.$ic50$, (SubLObject)module0501.UNPROVIDED);
            final SubLObject var38_55 = module0147.$g2095$.currentBinding(var55);
            final SubLObject var59 = module0147.$g2094$.currentBinding(var55);
            final SubLObject var60 = module0147.$g2096$.currentBinding(var55);
            try {
                module0147.$g2095$.bind(module0147.f9545(var58), var55);
                module0147.$g2094$.bind(module0147.f9546(var58), var55);
                module0147.$g2096$.bind(module0147.f9549(var58), var55);
                final SubLObject var61 = module0134.f8737(f32301((SubLObject)ConsesLow.listS((SubLObject)module0501.$ic48$, new SubLObject[] { module0501.$ic55$, module0501.$ic50$, var37, module0501.$ic51$, var36, module0501.$ic52$, var51, module0501.$ic54$, var54, module0501.$ic61$ })));
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
            module0501.$g3796$.rebind(var57, var55);
        }
        return var56;
    }
    
    public static SubLObject f32327(final SubLObject var33, final SubLObject var56, final SubLObject var36, final SubLObject var51, SubLObject var37) {
        if (var37 == module0501.UNPROVIDED) {
            var37 = (SubLObject)module0501.NIL;
        }
        final SubLThread var57 = SubLProcess.currentSubLThread();
        SubLObject var58 = (SubLObject)module0501.NIL;
        assert module0501.NIL != Types.listp(var36) : var36;
        final SubLObject var59 = module0501.$g3796$.currentBinding(var57);
        try {
            module0501.$g3796$.bind(var36, var57);
            final SubLObject var60 = Sequences.find_if((SubLObject)module0501.$ic62$, var56, (SubLObject)module0501.UNPROVIDED, (SubLObject)module0501.UNPROVIDED, (SubLObject)module0501.UNPROVIDED);
            final SubLObject var61 = (SubLObject)((module0501.NIL != module0201.f12546(module0205.f13203(var60, (SubLObject)module0501.UNPROVIDED))) ? module0205.f13203(var60, (SubLObject)module0501.UNPROVIDED) : ((module0501.NIL != module0201.f12546(module0205.f13204(var60, (SubLObject)module0501.UNPROVIDED))) ? module0205.f13204(var60, (SubLObject)module0501.UNPROVIDED) : module0501.NIL));
            final SubLObject var38_59 = module0501.$g3799$.currentBinding(var57);
            final SubLObject var62 = module0501.$g3800$.currentBinding(var57);
            final SubLObject var63 = module0501.$g3801$.currentBinding(var57);
            try {
                module0501.$g3799$.bind(f32305(var56, var61), var57);
                module0501.$g3800$.bind(f32306(var56, var61), var57);
                module0501.$g3801$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0501.NIL != module0501.$g3799$.getDynamicValue(var57) || module0501.NIL != module0501.$g3800$.getDynamicValue(var57)), var57);
                final SubLObject var64 = conses_high.getf((SubLObject)ConsesLow.listS((SubLObject)module0501.$ic48$, new SubLObject[] { module0501.$ic55$, module0501.$ic50$, var37, module0501.$ic51$, var36, module0501.$ic63$, module0501.$ic64$, module0501.$ic52$, var51, module0501.$ic65$ }), (SubLObject)module0501.$ic50$, (SubLObject)module0501.UNPROVIDED);
                final SubLObject var38_60 = module0147.$g2095$.currentBinding(var57);
                final SubLObject var41_61 = module0147.$g2094$.currentBinding(var57);
                final SubLObject var42_62 = module0147.$g2096$.currentBinding(var57);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var64), var57);
                    module0147.$g2094$.bind(module0147.f9546(var64), var57);
                    module0147.$g2096$.bind(module0147.f9549(var64), var57);
                    final SubLObject var65 = module0134.f8737(f32301((SubLObject)ConsesLow.listS((SubLObject)module0501.$ic48$, new SubLObject[] { module0501.$ic55$, module0501.$ic50$, var37, module0501.$ic51$, var36, module0501.$ic63$, module0501.$ic64$, module0501.$ic52$, var51, module0501.$ic65$ })));
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
                module0501.$g3801$.rebind(var63, var57);
                module0501.$g3800$.rebind(var62, var57);
                module0501.$g3799$.rebind(var38_59, var57);
            }
        }
        finally {
            module0501.$g3796$.rebind(var59, var57);
        }
        return var58;
    }
    
    public static SubLObject f32328(final SubLObject var33, final SubLObject var54, final SubLObject var56, final SubLObject var36, final SubLObject var51, SubLObject var37) {
        if (var37 == module0501.UNPROVIDED) {
            var37 = (SubLObject)module0501.NIL;
        }
        final SubLThread var57 = SubLProcess.currentSubLThread();
        SubLObject var58 = (SubLObject)module0501.NIL;
        assert module0501.NIL != Types.listp(var36) : var36;
        final SubLObject var59 = module0501.$g3796$.currentBinding(var57);
        try {
            module0501.$g3796$.bind(var36, var57);
            final SubLObject var60 = Sequences.find_if((SubLObject)module0501.$ic62$, var56, (SubLObject)module0501.UNPROVIDED, (SubLObject)module0501.UNPROVIDED, (SubLObject)module0501.UNPROVIDED);
            final SubLObject var61 = (SubLObject)((module0501.NIL != module0201.f12546(module0205.f13203(var60, (SubLObject)module0501.UNPROVIDED))) ? module0205.f13203(var60, (SubLObject)module0501.UNPROVIDED) : ((module0501.NIL != module0201.f12546(module0205.f13204(var60, (SubLObject)module0501.UNPROVIDED))) ? module0205.f13204(var60, (SubLObject)module0501.UNPROVIDED) : module0501.NIL));
            final SubLObject var38_63 = module0501.$g3799$.currentBinding(var57);
            final SubLObject var62 = module0501.$g3800$.currentBinding(var57);
            final SubLObject var63 = module0501.$g3801$.currentBinding(var57);
            try {
                module0501.$g3799$.bind(f32305(var56, var61), var57);
                module0501.$g3800$.bind(f32306(var56, var61), var57);
                module0501.$g3801$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0501.NIL != module0501.$g3799$.getDynamicValue(var57) || module0501.NIL != module0501.$g3800$.getDynamicValue(var57)), var57);
                final SubLObject var64 = conses_high.getf((SubLObject)ConsesLow.listS((SubLObject)module0501.$ic48$, new SubLObject[] { module0501.$ic55$, module0501.$ic50$, var37, module0501.$ic51$, var36, module0501.$ic63$, module0501.$ic64$, module0501.$ic52$, var51, module0501.$ic54$, var54, module0501.$ic65$ }), (SubLObject)module0501.$ic50$, (SubLObject)module0501.UNPROVIDED);
                final SubLObject var38_64 = module0147.$g2095$.currentBinding(var57);
                final SubLObject var41_65 = module0147.$g2094$.currentBinding(var57);
                final SubLObject var42_66 = module0147.$g2096$.currentBinding(var57);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var64), var57);
                    module0147.$g2094$.bind(module0147.f9546(var64), var57);
                    module0147.$g2096$.bind(module0147.f9549(var64), var57);
                    final SubLObject var65 = module0134.f8737(f32301((SubLObject)ConsesLow.listS((SubLObject)module0501.$ic48$, new SubLObject[] { module0501.$ic55$, module0501.$ic50$, var37, module0501.$ic51$, var36, module0501.$ic63$, module0501.$ic64$, module0501.$ic52$, var51, module0501.$ic54$, var54, module0501.$ic65$ })));
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
                module0501.$g3801$.rebind(var63, var57);
                module0501.$g3800$.rebind(var62, var57);
                module0501.$g3799$.rebind(var38_63, var57);
            }
        }
        finally {
            module0501.$g3796$.rebind(var59, var57);
        }
        return var58;
    }
    
    public static SubLObject f32329(final SubLObject var5, SubLObject var37) {
        if (var37 == module0501.UNPROVIDED) {
            var37 = (SubLObject)module0501.NIL;
        }
        final SubLThread var38 = SubLProcess.currentSubLThread();
        SubLObject var39 = (SubLObject)module0501.NIL;
        SubLObject var40 = module0141.$g1692$.currentBinding(var38);
        try {
            module0141.$g1692$.bind((SubLObject)module0501.NIL, var38);
            try {
                module0252.f16277(module0137.f8955(module0501.$ic66$), var5, var37, (SubLObject)module0501.UNPROVIDED);
            }
            finally {
                final SubLObject var38_68 = Threads.$is_thread_performing_cleanupP$.currentBinding(var38);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0501.T, var38);
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
            module0141.$g1666$.bind((SubLObject)module0501.$ic67$, var38);
            var39 = module0250.f16107(var39, (SubLObject)module0501.UNPROVIDED);
        }
        finally {
            module0141.$g1666$.rebind(var40, var38);
        }
        return var39;
    }
    
    public static SubLObject f32330(final SubLObject var11, SubLObject var37) {
        if (var37 == module0501.UNPROVIDED) {
            var37 = (SubLObject)module0501.NIL;
        }
        final SubLThread var38 = SubLProcess.currentSubLThread();
        SubLObject var39 = (SubLObject)module0501.NIL;
        final SubLObject var40 = module0501.$g3792$.currentBinding(var38);
        final SubLObject var41 = module0501.$g3793$.currentBinding(var38);
        final SubLObject var42 = module0501.$g3794$.currentBinding(var38);
        final SubLObject var43 = module0501.$g3795$.currentBinding(var38);
        final SubLObject var44 = module0501.$g3796$.currentBinding(var38);
        final SubLObject var45 = module0501.$g3797$.currentBinding(var38);
        try {
            module0501.$g3792$.bind(var11, var38);
            module0501.$g3793$.bind(module0205.f13333(var11), var38);
            module0501.$g3794$.bind(f32293(var11), var38);
            module0501.$g3795$.bind(f32294(var11), var38);
            module0501.$g3796$.bind(f32296(var11), var38);
            module0501.$g3797$.bind(f32297(var11), var38);
            var39 = f32318(f32298(var11), f32299(var11), f32290(), f32291(), var37);
        }
        finally {
            module0501.$g3797$.rebind(var45, var38);
            module0501.$g3796$.rebind(var44, var38);
            module0501.$g3795$.rebind(var43, var38);
            module0501.$g3794$.rebind(var42, var38);
            module0501.$g3793$.rebind(var41, var38);
            module0501.$g3792$.rebind(var40, var38);
        }
        return var39;
    }
    
    public static SubLObject f32331(final SubLObject var11, SubLObject var37) {
        if (var37 == module0501.UNPROVIDED) {
            var37 = (SubLObject)module0501.NIL;
        }
        final SubLThread var38 = SubLProcess.currentSubLThread();
        SubLObject var39 = (SubLObject)module0501.NIL;
        final SubLObject var40 = module0501.$g3792$.currentBinding(var38);
        final SubLObject var41 = module0501.$g3793$.currentBinding(var38);
        final SubLObject var42 = module0501.$g3794$.currentBinding(var38);
        final SubLObject var43 = module0501.$g3795$.currentBinding(var38);
        final SubLObject var44 = module0501.$g3796$.currentBinding(var38);
        final SubLObject var45 = module0501.$g3797$.currentBinding(var38);
        try {
            module0501.$g3792$.bind(var11, var38);
            module0501.$g3793$.bind(module0205.f13333(var11), var38);
            module0501.$g3794$.bind(f32293(var11), var38);
            module0501.$g3795$.bind(f32294(var11), var38);
            module0501.$g3796$.bind(f32296(var11), var38);
            module0501.$g3797$.bind(f32297(var11), var38);
            var39 = f32316(f32298(var11), f32290(), f32291(), var37);
        }
        finally {
            module0501.$g3797$.rebind(var45, var38);
            module0501.$g3796$.rebind(var44, var38);
            module0501.$g3795$.rebind(var43, var38);
            module0501.$g3794$.rebind(var42, var38);
            module0501.$g3793$.rebind(var41, var38);
            module0501.$g3792$.rebind(var40, var38);
        }
        return var39;
    }
    
    public static SubLObject f32332(final SubLObject var11, SubLObject var37) {
        if (var37 == module0501.UNPROVIDED) {
            var37 = (SubLObject)module0501.NIL;
        }
        final SubLThread var38 = SubLProcess.currentSubLThread();
        SubLObject var39 = (SubLObject)module0501.NIL;
        final SubLObject var40 = module0501.$g3792$.currentBinding(var38);
        final SubLObject var41 = module0501.$g3793$.currentBinding(var38);
        final SubLObject var42 = module0501.$g3794$.currentBinding(var38);
        final SubLObject var43 = module0501.$g3795$.currentBinding(var38);
        final SubLObject var44 = module0501.$g3796$.currentBinding(var38);
        final SubLObject var45 = module0501.$g3797$.currentBinding(var38);
        try {
            module0501.$g3792$.bind(var11, var38);
            module0501.$g3793$.bind(module0205.f13333(var11), var38);
            module0501.$g3794$.bind(f32293(var11), var38);
            module0501.$g3795$.bind(f32294(var11), var38);
            module0501.$g3796$.bind(f32296(var11), var38);
            module0501.$g3797$.bind(f32297(var11), var38);
            var39 = f32319(f32298(var11), f32299(var11), f32290(), f32291(), var37);
        }
        finally {
            module0501.$g3797$.rebind(var45, var38);
            module0501.$g3796$.rebind(var44, var38);
            module0501.$g3795$.rebind(var43, var38);
            module0501.$g3794$.rebind(var42, var38);
            module0501.$g3793$.rebind(var41, var38);
            module0501.$g3792$.rebind(var40, var38);
        }
        if (module0501.NIL != var39) {
            var39 = f32333(var39, var11, var37);
        }
        return var39;
    }
    
    public static SubLObject f32334(final SubLObject var11, SubLObject var37) {
        if (var37 == module0501.UNPROVIDED) {
            var37 = (SubLObject)module0501.NIL;
        }
        return module0035.f2269(Mapping.mapcan(Symbols.symbol_function((SubLObject)module0501.$ic68$), module0528.f32971(f32332(var11, var37)), module0501.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)module0501.UNPROVIDED, (SubLObject)module0501.UNPROVIDED, (SubLObject)module0501.UNPROVIDED, (SubLObject)module0501.UNPROVIDED, (SubLObject)module0501.UNPROVIDED);
    }
    
    public static SubLObject f32333(final SubLObject var67, final SubLObject var11, SubLObject var37) {
        if (var37 == module0501.UNPROVIDED) {
            var37 = (SubLObject)module0501.NIL;
        }
        final SubLThread var68 = SubLProcess.currentSubLThread();
        SubLObject var69 = var67;
        SubLObject var70 = (SubLObject)module0501.NIL;
        final SubLObject var71 = var37;
        final SubLObject var72 = module0147.$g2095$.currentBinding(var68);
        final SubLObject var73 = module0147.$g2094$.currentBinding(var68);
        final SubLObject var74 = module0147.$g2096$.currentBinding(var68);
        final SubLObject var75 = module0501.$g3792$.currentBinding(var68);
        final SubLObject var76 = module0501.$g3793$.currentBinding(var68);
        final SubLObject var77 = module0501.$g3794$.currentBinding(var68);
        final SubLObject var78 = module0501.$g3795$.currentBinding(var68);
        final SubLObject var79 = module0501.$g3796$.currentBinding(var68);
        final SubLObject var80 = module0501.$g3797$.currentBinding(var68);
        try {
            module0147.$g2095$.bind(module0147.f9545(var71), var68);
            module0147.$g2094$.bind(module0147.f9546(var71), var68);
            module0147.$g2096$.bind(module0147.f9549(var71), var68);
            module0501.$g3792$.bind(var11, var68);
            module0501.$g3793$.bind(module0205.f13333(var11), var68);
            module0501.$g3794$.bind(f32293(var11), var68);
            module0501.$g3795$.bind(f32294(var11), var68);
            module0501.$g3796$.bind(f32296(var11), var68);
            module0501.$g3797$.bind(f32297(var11), var68);
            SubLObject var81 = var67;
            SubLObject var82 = (SubLObject)module0501.NIL;
            var82 = var81.first();
            while (module0501.NIL != var81) {
                if (module0501.NIL != module0178.f11284(var82)) {
                    final SubLObject var83 = module0178.f11333(var82);
                    if (module0501.NIL == module0004.f104(var83, f32290(), (SubLObject)module0501.UNPROVIDED, (SubLObject)module0501.UNPROVIDED) && module0501.NIL == module0004.f104(var83, var70, (SubLObject)module0501.UNPROVIDED, (SubLObject)module0501.UNPROVIDED)) {
                        SubLObject var84 = (SubLObject)module0501.NIL;
                        if (module0501.NIL == var84) {
                            SubLObject var85 = f32290();
                            SubLObject var86 = (SubLObject)module0501.NIL;
                            var86 = var85.first();
                            while (module0501.NIL == var84 && module0501.NIL != var85) {
                                if (module0501.NIL != module0260.f17089(var83, var86, (SubLObject)module0501.UNPROVIDED, (SubLObject)module0501.UNPROVIDED)) {
                                    var84 = (SubLObject)ConsesLow.list(module0501.$ic66$, var83, var86);
                                }
                                else if (module0501.NIL != module0260.f17094(var83, var86, (SubLObject)module0501.UNPROVIDED, (SubLObject)module0501.UNPROVIDED)) {
                                    var84 = (SubLObject)ConsesLow.list(module0501.$ic69$, var83, var86);
                                }
                                var85 = var85.rest();
                                var86 = var85.first();
                            }
                        }
                        if (module0501.NIL != var84) {
                            var70 = (SubLObject)ConsesLow.cons(var83, var70);
                            var69 = ConsesLow.append(var69, (SubLObject)ConsesLow.list(module0191.f11990((SubLObject)module0501.$ic70$, var84, module0147.$g2095$.getDynamicValue(var68), (SubLObject)module0501.UNPROVIDED)));
                        }
                    }
                }
                var81 = var81.rest();
                var82 = var81.first();
            }
        }
        finally {
            module0501.$g3797$.rebind(var80, var68);
            module0501.$g3796$.rebind(var79, var68);
            module0501.$g3795$.rebind(var78, var68);
            module0501.$g3794$.rebind(var77, var68);
            module0501.$g3793$.rebind(var76, var68);
            module0501.$g3792$.rebind(var75, var68);
            module0147.$g2096$.rebind(var74, var68);
            module0147.$g2094$.rebind(var73, var68);
            module0147.$g2095$.rebind(var72, var68);
        }
        return var69;
    }
    
    public static SubLObject f32335(final SubLObject var11) {
        SubLObject var12 = (SubLObject)module0501.NIL;
        SubLObject var13 = (SubLObject)module0501.NIL;
        SubLObject var14 = (SubLObject)module0501.NIL;
        SubLObject var15 = (SubLObject)module0501.NIL;
        SubLObject var16 = (SubLObject)module0501.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var11, var11, (SubLObject)module0501.$ic71$);
        var12 = var11.first();
        SubLObject var17 = var11.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var11, (SubLObject)module0501.$ic71$);
        var13 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var11, (SubLObject)module0501.$ic71$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var11, (SubLObject)module0501.$ic71$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var11, (SubLObject)module0501.$ic71$);
        var16 = var17.first();
        var17 = var17.rest();
        if (module0501.NIL == var17) {
            if (module0501.NIL == module0004.f106(var16)) {
                return (SubLObject)module0501.NIL;
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var11, (SubLObject)module0501.$ic71$);
        }
        return (SubLObject)module0501.T;
    }
    
    public static SubLObject f32336(final SubLObject var11) {
        return module0191.f11990((SubLObject)module0501.$ic72$, var11, (SubLObject)module0501.UNPROVIDED, (SubLObject)module0501.UNPROVIDED);
    }
    
    public static SubLObject f32337(final SubLObject var11, SubLObject var86) {
        if (var86 == module0501.UNPROVIDED) {
            var86 = (SubLObject)module0501.NIL;
        }
        return f32335(var11);
    }
    
    public static SubLObject f32338(final SubLObject var11, SubLObject var86) {
        if (var86 == module0501.UNPROVIDED) {
            var86 = (SubLObject)module0501.NIL;
        }
        if (module0501.NIL != f32330(var11, (SubLObject)module0501.UNPROVIDED)) {
            final SubLObject var87 = f32336(var11);
            module0347.f23330(var87, (SubLObject)module0501.UNPROVIDED, (SubLObject)module0501.UNPROVIDED);
        }
        return (SubLObject)module0501.NIL;
    }
    
    public static SubLObject f32339(final SubLObject var11, SubLObject var86) {
        if (var86 == module0501.UNPROVIDED) {
            var86 = (SubLObject)module0501.NIL;
        }
        return f32335(var11);
    }
    
    public static SubLObject f32340(final SubLObject var11) {
        final SubLObject var12 = f32312();
        SubLObject var13 = (SubLObject)module0501.NIL;
        if (module0501.NIL != var12) {
            var13 = f32341(var11, var12);
        }
        else {
            var13 = f32331(var11, (SubLObject)module0501.UNPROVIDED);
        }
        return module0052.f3709(var13);
    }
    
    public static SubLObject f32341(final SubLObject var11, final SubLObject var88) {
        final SubLThread var89 = SubLProcess.currentSubLThread();
        SubLObject var90 = (SubLObject)module0501.NIL;
        final SubLObject var91 = module0501.$g3799$.currentBinding(var89);
        final SubLObject var92 = module0501.$g3800$.currentBinding(var89);
        final SubLObject var93 = module0501.$g3801$.currentBinding(var89);
        try {
            module0501.$g3799$.bind((SubLObject)module0501.NIL, var89);
            module0501.$g3800$.bind((SubLObject)module0501.NIL, var89);
            module0501.$g3801$.bind((SubLObject)module0501.T, var89);
            SubLObject var94 = var88;
            SubLObject var95 = (SubLObject)module0501.NIL;
            var95 = var94.first();
            while (module0501.NIL != var94) {
                final SubLObject var96 = module0205.f13132(var95);
                final SubLObject var97 = module0205.f13204(var95, (SubLObject)module0501.UNPROVIDED);
                final SubLObject var98 = var96;
                if (var98.eql(module0501.$ic45$)) {
                    module0501.$g3799$.setDynamicValue((SubLObject)ConsesLow.cons(var97, module0501.$g3799$.getDynamicValue(var89)), var89);
                }
                else if (var98.eql(module0501.$ic46$)) {
                    module0501.$g3800$.setDynamicValue((SubLObject)ConsesLow.cons(var97, module0501.$g3800$.getDynamicValue(var89)), var89);
                }
                var94 = var94.rest();
                var95 = var94.first();
            }
            final SubLObject var38_92 = module0501.$g3792$.currentBinding(var89);
            final SubLObject var41_93 = module0501.$g3793$.currentBinding(var89);
            final SubLObject var42_94 = module0501.$g3794$.currentBinding(var89);
            final SubLObject var99 = module0501.$g3795$.currentBinding(var89);
            final SubLObject var100 = module0501.$g3796$.currentBinding(var89);
            final SubLObject var101 = module0501.$g3797$.currentBinding(var89);
            try {
                module0501.$g3792$.bind(var11, var89);
                module0501.$g3793$.bind(module0205.f13333(var11), var89);
                module0501.$g3794$.bind(f32293(var11), var89);
                module0501.$g3795$.bind(f32294(var11), var89);
                module0501.$g3796$.bind(f32296(var11), var89);
                module0501.$g3797$.bind(f32297(var11), var89);
                var90 = f32317(f32298(var11), f32290(), (SubLObject)module0501.$ic64$, f32291(), (SubLObject)module0501.UNPROVIDED);
            }
            finally {
                module0501.$g3797$.rebind(var101, var89);
                module0501.$g3796$.rebind(var100, var89);
                module0501.$g3795$.rebind(var99, var89);
                module0501.$g3794$.rebind(var42_94, var89);
                module0501.$g3793$.rebind(var41_93, var89);
                module0501.$g3792$.rebind(var38_92, var89);
            }
        }
        finally {
            module0501.$g3801$.rebind(var93, var89);
            module0501.$g3800$.rebind(var92, var89);
            module0501.$g3799$.rebind(var91, var89);
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
        return (SubLObject)module0501.NIL;
    }
    
    public static SubLObject f32343() {
        module0501.$g3792$ = SubLFiles.defparameter("S#35742", (SubLObject)module0501.NIL);
        module0501.$g3793$ = SubLFiles.defparameter("S#35743", (SubLObject)module0501.NIL);
        module0501.$g3794$ = SubLFiles.defparameter("S#35744", (SubLObject)module0501.NIL);
        module0501.$g3795$ = SubLFiles.defparameter("S#35745", (SubLObject)module0501.NIL);
        module0501.$g3796$ = SubLFiles.defparameter("S#35746", (SubLObject)module0501.NIL);
        module0501.$g3797$ = SubLFiles.defparameter("S#35747", (SubLObject)module0501.NIL);
        module0501.$g3798$ = SubLFiles.deflexical("S#35748", (SubLObject)module0501.$ic20$);
        module0501.$g3799$ = SubLFiles.defparameter("S#35749", (SubLObject)module0501.NIL);
        module0501.$g3800$ = SubLFiles.defparameter("S#35750", (SubLObject)module0501.NIL);
        module0501.$g3801$ = SubLFiles.defparameter("S#35751", (SubLObject)module0501.NIL);
        module0501.$g3802$ = SubLFiles.deflexical("S#35752", module0018.$g661$.getGlobalValue());
        return (SubLObject)module0501.NIL;
    }
    
    public static SubLObject f32344() {
        module0340.f22941((SubLObject)module0501.$ic73$, (SubLObject)module0501.$ic74$);
        module0340.f22941((SubLObject)module0501.$ic75$, (SubLObject)module0501.$ic76$);
        module0340.f22938(module0501.$ic44$);
        module0358.f23771((SubLObject)module0501.$ic77$, module0501.$ic44$, (SubLObject)module0501.THREE_INTEGER);
        module0358.f23730((SubLObject)module0501.$ic78$, (SubLObject)module0501.$ic79$);
        return (SubLObject)module0501.NIL;
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
        module0501.$g3792$ = null;
        module0501.$g3793$ = null;
        module0501.$g3794$ = null;
        module0501.$g3795$ = null;
        module0501.$g3796$ = null;
        module0501.$g3797$ = null;
        module0501.$g3798$ = null;
        module0501.$g3799$ = null;
        module0501.$g3800$ = null;
        module0501.$g3801$ = null;
        module0501.$g3802$ = null;
        $ic0$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#19777", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic1$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic2$ = SubLObjectFactory.makeSymbol("CHECK-TYPE");
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"));
        $ic4$ = SubLObjectFactory.makeSymbol("CLET");
        $ic5$ = SubLObjectFactory.makeSymbol("S#35746", "CYC");
        $ic6$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#25811", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic7$ = SubLObjectFactory.makeSymbol("S#35747", "CYC");
        $ic8$ = SubLObjectFactory.makeString("No valid hl-variable in asent : ~A");
        $ic9$ = SubLObjectFactory.makeString("No initial node applicable for asent ~A~%");
        $ic10$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic11$ = SubLObjectFactory.makeSymbol("S#35742", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#35743", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("ATOMIC-SENTENCE-PREDICATE");
        $ic14$ = SubLObjectFactory.makeSymbol("S#35744", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#35696", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#35745", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#35697", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#35699", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#35700", "CYC");
        $ic20$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("TRANSITIVE-REASONING"), (SubLObject)SubLObjectFactory.makeKeyword("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("ACCESSIBLE"), (SubLObject)SubLObjectFactory.makeKeyword("MARKING"), (SubLObject)SubLObjectFactory.makeKeyword("DEPTH-MARKING"));
        $ic21$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEARCH"), (SubLObject)SubLObjectFactory.makeSymbol("S#138", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic22$ = SubLObjectFactory.makeSymbol("S#11680", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("GETF");
        $ic24$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MT"));
        $ic25$ = SubLObjectFactory.makeSymbol("S#10969", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#35704", "CYC");
        $ic27$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#35749", "CYC"), (SubLObject)module0501.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#35750", "CYC"), (SubLObject)module0501.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#35751", "CYC"), (SubLObject)module0501.T));
        $ic28$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6061", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic29$ = SubLObjectFactory.makeUninternedSymbol("US#782417F");
        $ic30$ = SubLObjectFactory.makeUninternedSymbol("US#506B097");
        $ic31$ = SubLObjectFactory.makeSymbol("FIND-IF");
        $ic32$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35710", "CYC"));
        $ic33$ = SubLObjectFactory.makeSymbol("S#534", "CYC");
        $ic34$ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $ic35$ = SubLObjectFactory.makeSymbol("S#13440", "CYC");
        $ic36$ = SubLObjectFactory.makeSymbol("S#15505", "CYC");
        $ic37$ = SubLObjectFactory.makeSymbol("S#35749", "CYC");
        $ic38$ = SubLObjectFactory.makeSymbol("S#35708", "CYC");
        $ic39$ = SubLObjectFactory.makeSymbol("S#35750", "CYC");
        $ic40$ = SubLObjectFactory.makeSymbol("S#35709", "CYC");
        $ic41$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#35751", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)SubLObjectFactory.makeSymbol("S#35749", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#35750", "CYC"))));
        $ic42$ = SubLObjectFactory.makeSymbol("S#35711", "CYC");
        $ic43$ = SubLObjectFactory.makeSymbol("S#35712", "CYC");
        $ic44$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("relatedToVia"));
        $ic45$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic46$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic47$ = SubLObjectFactory.makeSymbol("LISTP");
        $ic48$ = SubLObjectFactory.makeKeyword("ORDER");
        $ic49$ = SubLObjectFactory.makeKeyword("DEPTH-FIRST");
        $ic50$ = SubLObjectFactory.makeKeyword("MT");
        $ic51$ = SubLObjectFactory.makeKeyword("PREDICATES");
        $ic52$ = SubLObjectFactory.makeKeyword("CUTOFF");
        $ic53$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ADD-TO-RESULT?"), (SubLObject)SubLObjectFactory.makeKeyword("NODES-ON-WIND"));
        $ic54$ = SubLObjectFactory.makeKeyword("GOAL");
        $ic55$ = SubLObjectFactory.makeKeyword("ITERATIVE-DEEPENING");
        $ic56$ = SubLObjectFactory.makeKeyword("JUSTIFY?");
        $ic57$ = SubLObjectFactory.makeKeyword("ADD-TO-RESULT?");
        $ic58$ = SubLObjectFactory.makeKeyword("EDGES-ON-UNWIND");
        $ic59$ = SubLObjectFactory.makeKeyword("ALL");
        $ic60$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ADD-TO-RESULT?"), (SubLObject)SubLObjectFactory.makeKeyword("EDGES-ON-UNWIND"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY?"), (SubLObject)SubLObjectFactory.makeKeyword("ALL"));
        $ic61$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY?"), (SubLObject)SubLObjectFactory.makeKeyword("ALL"), (SubLObject)SubLObjectFactory.makeKeyword("ADD-TO-RESULT?"), (SubLObject)SubLObjectFactory.makeKeyword("EDGES-ON-UNWIND"));
        $ic62$ = SubLObjectFactory.makeSymbol("S#35710", "CYC");
        $ic63$ = SubLObjectFactory.makeKeyword("GOAL-FN");
        $ic64$ = SubLObjectFactory.makeSymbol("S#35714", "CYC");
        $ic65$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SATISFY-FN"), (SubLObject)SubLObjectFactory.makeSymbol("S#35714", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY?"), (SubLObject)SubLObjectFactory.makeKeyword("ALL"), (SubLObject)SubLObjectFactory.makeKeyword("ADD-TO-RESULT?"), (SubLObject)SubLObjectFactory.makeKeyword("EDGES-ON-UNWIND"));
        $ic66$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $ic67$ = SubLObjectFactory.makeKeyword("ASSERTION");
        $ic68$ = SubLObjectFactory.makeSymbol("FIRST");
        $ic69$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlInverse"));
        $ic70$ = SubLObjectFactory.makeKeyword("GENLPREDS");
        $ic71$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#750", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#751", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#35753", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1993", "CYC"));
        $ic72$ = SubLObjectFactory.makeKeyword("RTV");
        $ic73$ = SubLObjectFactory.makeKeyword("REMOVAL-RELATED-TO-VIA-CHECK");
        $ic74$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("relatedToVia")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("relatedToVia")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheSet")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("S#35737", "CYC"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#35752", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35738", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$relatedToVia <fort> <fort> <SOP> <num>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$relatedToVia #$KevinBacon #$KevinSpacey (#$TheSet #$costars) 2)") });
        $ic75$ = SubLObjectFactory.makeKeyword("REMOVAL-RELATED-TO-VIA-GENERATE");
        $ic76$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("relatedToVia")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("relatedToVia")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE"), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheSet")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("relatedToVia")), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheSet")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"))), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("S#35739", "CYC"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#35752", "CYC"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35740", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#18075", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("TERM-UNIFY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35698", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("RTV"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("DEFAULT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$relatedToVia <VAR> <fort> <SOP> <num>)\n    and\n    (#$relatedToVia <fort> <VAR> <SOP> <num>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$relatedToVia ?WHO #$KevinBacon (#$TheSet #$costars) 2)\n    and\n    (#$relatedToVia #$KevinBacon ?WHO (#$TheSet #$costars) 2)") });
        $ic77$ = SubLObjectFactory.makeKeyword("POS");
        $ic78$ = SubLObjectFactory.makeKeyword("RELATED-TO-VIA-EITHER-ARG1-OR-ARG2-BINDABLE");
        $ic79$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("relatedToVia")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("relatedToVia")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("S#26435", "CYC"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0501.class
	Total time: 470 ms
	
	Decompiled with Procyon 0.5.32.
*/