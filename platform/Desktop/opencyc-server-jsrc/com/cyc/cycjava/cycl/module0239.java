package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
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

public final class module0239 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0239";
    public static final String myFingerPrint = "7bb9dcb892ef013d4ff0a8f6b779e824a1ffaef8e6152530488c0f34e77e92cb";
    public static SubLSymbol $g2445$;
    public static SubLSymbol $g2446$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
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
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLList $ic25$;
    private static final SubLList $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLList $ic53$;
    private static final SubLList $ic54$;
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
    private static final SubLList $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLList $ic77$;
    private static final SubLList $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLList $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLList $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLString $ic93$;
    
    public static SubLObject f15591(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0239.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0239.$ic0$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0239.$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0239.$ic2$, var5)), ConsesLow.append(var6, (SubLObject)module0239.NIL));
    }
    
    public static SubLObject f15592(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0239.$ic1$, (SubLObject)module0239.$ic3$, ConsesLow.append(var5, (SubLObject)module0239.NIL));
    }
    
    public static SubLObject f15593() {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        return module0239.$g2445$.getDynamicValue(var9);
    }
    
    public static SubLObject f15594(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0239.$ic4$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0239.NIL;
        SubLObject var7 = (SubLObject)module0239.NIL;
        SubLObject var8 = (SubLObject)module0239.NIL;
        SubLObject var9 = (SubLObject)module0239.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0239.$ic4$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0239.$ic4$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0239.$ic4$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0239.$ic4$);
        var9 = var4.first();
        var4 = var4.rest();
        SubLObject var10 = (SubLObject)module0239.NIL;
        SubLObject var11 = var4;
        SubLObject var12 = (SubLObject)module0239.NIL;
        SubLObject var20_21 = (SubLObject)module0239.NIL;
        while (module0239.NIL != var11) {
            cdestructuring_bind.destructuring_bind_must_consp(var11, var3, (SubLObject)module0239.$ic4$);
            var20_21 = var11.first();
            var11 = var11.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var11, var3, (SubLObject)module0239.$ic4$);
            if (module0239.NIL == conses_high.member(var20_21, (SubLObject)module0239.$ic5$, (SubLObject)module0239.UNPROVIDED, (SubLObject)module0239.UNPROVIDED)) {
                var12 = (SubLObject)module0239.T;
            }
            if (var20_21 == module0239.$ic6$) {
                var10 = var11.first();
            }
            var11 = var11.rest();
        }
        if (module0239.NIL != var12 && module0239.NIL == var10) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0239.$ic4$);
        }
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)module0239.$ic7$, var4);
        final SubLObject var14 = (SubLObject)((module0239.NIL != var13) ? conses_high.cadr(var13) : module0239.NIL);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)module0239.$ic8$, var4);
        final SubLObject var16 = (SubLObject)((module0239.NIL != var15) ? conses_high.cadr(var15) : module0239.$ic9$);
        final SubLObject var17 = cdestructuring_bind.property_list_member((SubLObject)module0239.$ic10$, var4);
        final SubLObject var18 = (SubLObject)((module0239.NIL != var17) ? conses_high.cadr(var17) : module0239.NIL);
        final SubLObject var19;
        var4 = (var19 = var5);
        if (module0239.NIL != var14) {
            final SubLObject var20 = (SubLObject)module0239.$ic11$;
            return (SubLObject)ConsesLow.list((SubLObject)module0239.$ic12$, (SubLObject)ConsesLow.list(var20, var8), (SubLObject)ConsesLow.list((SubLObject)module0239.$ic13$, var20, (SubLObject)ConsesLow.list((SubLObject)module0239.$ic14$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0239.$ic15$, var20), (SubLObject)ConsesLow.list((SubLObject)module0239.$ic16$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)ConsesLow.list((SubLObject)module0239.$ic17$, var20), var9, (SubLObject)module0239.$ic10$, var18), (SubLObject)ConsesLow.listS((SubLObject)module0239.$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var14, (SubLObject)ConsesLow.list((SubLObject)module0239.$ic18$, var20, var7, var6, var9))), ConsesLow.append(var19, (SubLObject)module0239.NIL)))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0239.$ic19$, var20), (SubLObject)ConsesLow.listS((SubLObject)module0239.$ic20$, (SubLObject)ConsesLow.list(new SubLObject[] { var6, var14, var7, var20, var9, module0239.$ic8$, var16, module0239.$ic10$, var18 }), ConsesLow.append(var19, (SubLObject)module0239.NIL))))));
        }
        final SubLObject var20 = (SubLObject)module0239.$ic21$;
        final SubLObject var23_28 = (SubLObject)module0239.$ic22$;
        return (SubLObject)ConsesLow.list((SubLObject)module0239.$ic12$, (SubLObject)ConsesLow.list(var20, var8), (SubLObject)ConsesLow.list((SubLObject)module0239.$ic13$, var20, (SubLObject)ConsesLow.list((SubLObject)module0239.$ic14$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0239.$ic15$, var20), (SubLObject)ConsesLow.listS((SubLObject)module0239.$ic16$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)ConsesLow.list((SubLObject)module0239.$ic17$, var20), var9, (SubLObject)module0239.$ic10$, var18), ConsesLow.append(var19, (SubLObject)module0239.NIL))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0239.$ic19$, var20), (SubLObject)ConsesLow.listS((SubLObject)module0239.$ic20$, (SubLObject)ConsesLow.list(new SubLObject[] { var6, var23_28, var7, var20, var9, module0239.$ic8$, var16, module0239.$ic10$, var18 }), (SubLObject)ConsesLow.list((SubLObject)module0239.$ic23$, var23_28), ConsesLow.append(var19, (SubLObject)module0239.NIL))))));
    }
    
    public static SubLObject f15595(final SubLObject var5, final SubLObject var14, final SubLObject var29, final SubLObject var16) {
        final SubLObject var30 = module0244.f15788(var5);
        final SubLObject var31 = (module0239.NIL != module0134.f8801(var16)) ? module0202.f12768(var5, var14, var29) : module0202.f12768(var5, var29, var14);
        return module0191.f11990(var30, var31, (SubLObject)module0239.UNPROVIDED, (SubLObject)module0239.UNPROVIDED);
    }
    
    public static SubLObject f15596(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0239.$ic25$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0239.NIL;
        SubLObject var7 = (SubLObject)module0239.NIL;
        SubLObject var8 = (SubLObject)module0239.NIL;
        SubLObject var9 = (SubLObject)module0239.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0239.$ic25$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0239.$ic25$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0239.$ic25$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0239.$ic25$);
        var9 = var4.first();
        var4 = var4.rest();
        SubLObject var10 = (SubLObject)module0239.NIL;
        SubLObject var11 = var4;
        SubLObject var12 = (SubLObject)module0239.NIL;
        SubLObject var39_40 = (SubLObject)module0239.NIL;
        while (module0239.NIL != var11) {
            cdestructuring_bind.destructuring_bind_must_consp(var11, var3, (SubLObject)module0239.$ic25$);
            var39_40 = var11.first();
            var11 = var11.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var11, var3, (SubLObject)module0239.$ic25$);
            if (module0239.NIL == conses_high.member(var39_40, (SubLObject)module0239.$ic26$, (SubLObject)module0239.UNPROVIDED, (SubLObject)module0239.UNPROVIDED)) {
                var12 = (SubLObject)module0239.T;
            }
            if (var39_40 == module0239.$ic6$) {
                var10 = var11.first();
            }
            var11 = var11.rest();
        }
        if (module0239.NIL != var12 && module0239.NIL == var10) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0239.$ic25$);
        }
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)module0239.$ic10$, var4);
        final SubLObject var14 = (SubLObject)((module0239.NIL != var13) ? conses_high.cadr(var13) : module0239.NIL);
        final SubLObject var15;
        var4 = (var15 = var5);
        final SubLObject var16 = (SubLObject)module0239.$ic27$;
        final SubLObject var17 = (SubLObject)module0239.$ic28$;
        final SubLObject var18 = (SubLObject)module0239.$ic29$;
        final SubLObject var19 = (SubLObject)module0239.$ic30$;
        final SubLObject var20 = (SubLObject)module0239.$ic31$;
        final SubLObject var21 = (SubLObject)module0239.$ic32$;
        final SubLObject var22 = (SubLObject)module0239.$ic33$;
        final SubLObject var23 = (SubLObject)module0239.$ic34$;
        return (SubLObject)ConsesLow.list((SubLObject)module0239.$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var23, (SubLObject)ConsesLow.list((SubLObject)module0239.$ic35$, var7))), (SubLObject)ConsesLow.list((SubLObject)module0239.$ic36$, var8, (SubLObject)ConsesLow.list((SubLObject)module0239.$ic37$, (SubLObject)ConsesLow.list((SubLObject)module0239.$ic14$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0239.$ic38$, var23), (SubLObject)ConsesLow.list((SubLObject)module0239.$ic39$, (SubLObject)ConsesLow.list(var19, var23, var8), (SubLObject)ConsesLow.list((SubLObject)module0239.$ic40$, (SubLObject)ConsesLow.list(var17, var9, (SubLObject)module0239.$ic10$, var14), (SubLObject)ConsesLow.list((SubLObject)module0239.$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var18, (SubLObject)ConsesLow.list((SubLObject)module0239.$ic41$, var17, var8))), (SubLObject)ConsesLow.list((SubLObject)module0239.$ic42$, (SubLObject)ConsesLow.list(var20, var21, var18, var19, var8, var14), (SubLObject)ConsesLow.list((SubLObject)module0239.$ic43$, (SubLObject)ConsesLow.list((SubLObject)module0239.$ic44$, var20), (SubLObject)ConsesLow.list((SubLObject)module0239.$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0239.$ic45$, var20)), (SubLObject)ConsesLow.list((SubLObject)module0239.$ic46$, (SubLObject)ConsesLow.list(var22, var16, var21, var14), (SubLObject)ConsesLow.list((SubLObject)module0239.$ic43$, (SubLObject)ConsesLow.list((SubLObject)module0239.$ic47$, var22), (SubLObject)ConsesLow.list((SubLObject)module0239.$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0239.$ic48$, var22)), (SubLObject)ConsesLow.listS((SubLObject)module0239.$ic49$, (SubLObject)ConsesLow.list(var6, var16, (SubLObject)module0239.$ic50$, var14), ConsesLow.append(var15, (SubLObject)module0239.NIL)))))))))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0239.$ic51$, var23), (SubLObject)ConsesLow.list((SubLObject)module0239.$ic40$, (SubLObject)ConsesLow.list(var17, var9, (SubLObject)module0239.$ic10$, var14), (SubLObject)ConsesLow.list((SubLObject)module0239.$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var18, (SubLObject)ConsesLow.list((SubLObject)module0239.$ic41$, var17, var8))), (SubLObject)ConsesLow.list((SubLObject)module0239.$ic52$, (SubLObject)ConsesLow.list(var16, var23, var18, var8, var14), (SubLObject)ConsesLow.listS((SubLObject)module0239.$ic49$, (SubLObject)ConsesLow.list(var6, var16, (SubLObject)module0239.$ic50$, var14), ConsesLow.append(var15, (SubLObject)module0239.NIL))))))))));
    }
    
    public static SubLObject f15597(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0239.$ic53$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0239.NIL;
        SubLObject var7 = (SubLObject)module0239.NIL;
        SubLObject var8 = (SubLObject)module0239.NIL;
        SubLObject var9 = (SubLObject)module0239.NIL;
        SubLObject var10 = (SubLObject)module0239.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0239.$ic53$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0239.$ic53$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0239.$ic53$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0239.$ic53$);
        var9 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0239.$ic53$);
        var10 = var4.first();
        var4 = var4.rest();
        SubLObject var11 = (SubLObject)module0239.NIL;
        SubLObject var12 = var4;
        SubLObject var13 = (SubLObject)module0239.NIL;
        SubLObject var55_56 = (SubLObject)module0239.NIL;
        while (module0239.NIL != var12) {
            cdestructuring_bind.destructuring_bind_must_consp(var12, var3, (SubLObject)module0239.$ic53$);
            var55_56 = var12.first();
            var12 = var12.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var12, var3, (SubLObject)module0239.$ic53$);
            if (module0239.NIL == conses_high.member(var55_56, (SubLObject)module0239.$ic54$, (SubLObject)module0239.UNPROVIDED, (SubLObject)module0239.UNPROVIDED)) {
                var13 = (SubLObject)module0239.T;
            }
            if (var55_56 == module0239.$ic6$) {
                var11 = var12.first();
            }
            var12 = var12.rest();
        }
        if (module0239.NIL != var13 && module0239.NIL == var11) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0239.$ic53$);
        }
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)module0239.$ic8$, var4);
        final SubLObject var15 = (SubLObject)((module0239.NIL != var14) ? conses_high.cadr(var14) : module0239.$ic9$);
        final SubLObject var16 = cdestructuring_bind.property_list_member((SubLObject)module0239.$ic10$, var4);
        final SubLObject var17 = (SubLObject)((module0239.NIL != var16) ? conses_high.cadr(var16) : module0239.NIL);
        final SubLObject var18;
        var4 = (var18 = var5);
        final SubLObject var19 = (SubLObject)module0239.$ic55$;
        final SubLObject var20 = (SubLObject)module0239.$ic56$;
        final SubLObject var21 = (SubLObject)module0239.$ic57$;
        final SubLObject var22 = (SubLObject)module0239.$ic58$;
        final SubLObject var23 = (SubLObject)module0239.$ic59$;
        final SubLObject var24 = (SubLObject)module0239.$ic60$;
        return (SubLObject)ConsesLow.list((SubLObject)module0239.$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var23, (SubLObject)ConsesLow.list((SubLObject)module0239.$ic61$, var15)), (SubLObject)ConsesLow.list(var24, (SubLObject)ConsesLow.list((SubLObject)module0239.$ic62$, var15))), (SubLObject)ConsesLow.list((SubLObject)module0239.$ic63$, (SubLObject)ConsesLow.list((SubLObject)module0239.$ic40$, (SubLObject)ConsesLow.list(var19, var10, (SubLObject)module0239.$ic10$, var17), (SubLObject)ConsesLow.list((SubLObject)module0239.$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var20, (SubLObject)ConsesLow.list((SubLObject)module0239.$ic64$, var19)), (SubLObject)ConsesLow.list(var21, (SubLObject)ConsesLow.list((SubLObject)module0239.$ic65$, var20))), (SubLObject)ConsesLow.list((SubLObject)module0239.$ic66$, (SubLObject)ConsesLow.list(new SubLObject[] { var22, var8, var9, module0239.$ic67$, var20, module0239.$ic68$, var23, module0239.$ic50$, var17 }), (SubLObject)ConsesLow.list((SubLObject)module0239.$ic43$, (SubLObject)ConsesLow.list((SubLObject)module0239.$ic69$, (SubLObject)ConsesLow.list((SubLObject)module0239.$ic70$, (SubLObject)ConsesLow.list((SubLObject)module0239.$ic71$, var22)), (SubLObject)ConsesLow.list((SubLObject)module0239.$ic72$, (SubLObject)ConsesLow.list((SubLObject)module0239.$ic73$, var22), var24)), (SubLObject)ConsesLow.listS((SubLObject)module0239.$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)module0239.$ic74$, var22, var21)), (SubLObject)ConsesLow.list(var7, var22)), ConsesLow.append(var18, (SubLObject)module0239.NIL)))), (SubLObject)ConsesLow.list((SubLObject)module0239.$ic43$, (SubLObject)module0239.$ic75$, (SubLObject)ConsesLow.list((SubLObject)module0239.$ic76$, (SubLObject)ConsesLow.list((SubLObject)module0239.$ic66$, (SubLObject)ConsesLow.list(new SubLObject[] { var22, var8, var9, module0239.$ic67$, var21, module0239.$ic68$, var23, module0239.$ic50$, var17 }), (SubLObject)ConsesLow.list((SubLObject)module0239.$ic43$, (SubLObject)ConsesLow.list((SubLObject)module0239.$ic69$, (SubLObject)ConsesLow.list((SubLObject)module0239.$ic70$, (SubLObject)ConsesLow.list((SubLObject)module0239.$ic71$, var22)), (SubLObject)ConsesLow.list((SubLObject)module0239.$ic72$, (SubLObject)ConsesLow.list((SubLObject)module0239.$ic73$, var22), var24)), (SubLObject)ConsesLow.listS((SubLObject)module0239.$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)module0239.$ic74$, var22, var20)), (SubLObject)ConsesLow.list(var7, var22)), ConsesLow.append(var18, (SubLObject)module0239.NIL))))))))));
    }
    
    public static SubLObject f15598(final SubLObject var64) {
        final SubLThread var65 = SubLProcess.currentSubLThread();
        return f15599(var64, module0239.$g2446$.getDynamicValue(var65));
    }
    
    public static SubLObject f15600(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0239.$ic77$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0239.NIL;
        SubLObject var7 = (SubLObject)module0239.NIL;
        SubLObject var8 = (SubLObject)module0239.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0239.$ic77$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0239.$ic77$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0239.$ic77$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)module0239.NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)module0239.NIL;
        SubLObject var73_74 = (SubLObject)module0239.NIL;
        while (module0239.NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0239.$ic77$);
            var73_74 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0239.$ic77$);
            if (module0239.NIL == conses_high.member(var73_74, (SubLObject)module0239.$ic78$, (SubLObject)module0239.UNPROVIDED, (SubLObject)module0239.UNPROVIDED)) {
                var11 = (SubLObject)module0239.T;
            }
            if (var73_74 == module0239.$ic6$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (module0239.NIL != var11 && module0239.NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0239.$ic77$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0239.$ic67$, var4);
        final SubLObject var13 = (SubLObject)((module0239.NIL != var12) ? conses_high.cadr(var12) : module0239.NIL);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)module0239.$ic68$, var4);
        final SubLObject var15 = (SubLObject)((module0239.NIL != var14) ? conses_high.cadr(var14) : module0239.NIL);
        final SubLObject var16 = cdestructuring_bind.property_list_member((SubLObject)module0239.$ic50$, var4);
        final SubLObject var17 = (SubLObject)((module0239.NIL != var16) ? conses_high.cadr(var16) : module0239.NIL);
        final SubLObject var18;
        var4 = (var18 = var5);
        final SubLObject var19 = (SubLObject)module0239.$ic79$;
        return (SubLObject)ConsesLow.list((SubLObject)module0239.$ic80$, (SubLObject)ConsesLow.list((SubLObject)module0239.$ic1$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0239.$ic81$, var8)), (SubLObject)ConsesLow.list((SubLObject)module0239.$ic82$, (SubLObject)module0239.$ic83$, (SubLObject)ConsesLow.listS((SubLObject)module0239.$ic84$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)module0239.$ic67$, var13, (SubLObject)module0239.$ic68$, var15, (SubLObject)module0239.$ic50$, var17), ConsesLow.append(var18, (SubLObject)module0239.NIL)))), (SubLObject)ConsesLow.list((SubLObject)module0239.$ic85$, (SubLObject)module0239.$ic86$, (SubLObject)ConsesLow.list((SubLObject)module0239.$ic43$, (SubLObject)module0239.$ic87$, (SubLObject)ConsesLow.list((SubLObject)module0239.$ic88$, var8, (SubLObject)ConsesLow.listS((SubLObject)module0239.$ic89$, (SubLObject)ConsesLow.list(new SubLObject[] { var6, var19, var7, module0239.$ic90$, var13, module0239.$ic68$, var15, module0239.$ic50$, var17 }), (SubLObject)ConsesLow.list((SubLObject)module0239.$ic23$, var19), ConsesLow.append(var18, (SubLObject)module0239.NIL))))));
    }
    
    public static SubLObject f15601(final SubLObject var5) {
        return (SubLObject)module0239.T;
    }
    
    public static SubLObject f15602(final SubLObject var16) {
        if (var16.eql((SubLObject)module0239.$ic91$)) {
            return (SubLObject)module0239.ONE_INTEGER;
        }
        if (var16.eql((SubLObject)module0239.$ic92$)) {
            return (SubLObject)module0239.TWO_INTEGER;
        }
        module0134.f8815((SubLObject)module0239.ONE_INTEGER, (SubLObject)module0239.$ic93$, var16, (SubLObject)module0239.UNPROVIDED, (SubLObject)module0239.UNPROVIDED, (SubLObject)module0239.UNPROVIDED, (SubLObject)module0239.UNPROVIDED);
        return (SubLObject)module0239.NIL;
    }
    
    public static SubLObject f15599(final SubLObject var5, final SubLObject var82) {
        if (module0239.NIL == module0134.f8807()) {
            return Equality.eql(var5, var82);
        }
        if (module0239.NIL != module0134.f8813()) {
            return module0264.f17435(var82, var5, (SubLObject)module0239.UNPROVIDED);
        }
        return module0264.f17432(var82, var5, (SubLObject)module0239.UNPROVIDED);
    }
    
    public static SubLObject f15603() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0239", "f15591", "S#18351");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0239", "f15592", "S#18352");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0239", "f15593", "S#18353", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0239", "f15594", "S#18354");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0239", "f15595", "S#18355", 4, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0239", "f15596", "S#18356");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0239", "f15597", "S#18357");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0239", "f15598", "S#12336", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0239", "f15600", "S#18358");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0239", "f15601", "S#18359", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0239", "f15602", "S#18360", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0239", "f15599", "S#10892", 2, 0, false);
        return (SubLObject)module0239.NIL;
    }
    
    public static SubLObject f15604() {
        module0239.$g2445$ = SubLFiles.defparameter("S#18361", (SubLObject)module0239.NIL);
        module0239.$g2446$ = SubLFiles.defparameter("S#18362", (SubLObject)module0239.NIL);
        return (SubLObject)module0239.NIL;
    }
    
    public static SubLObject f15605() {
        module0002.f50((SubLObject)module0239.$ic18$, (SubLObject)module0239.$ic24$);
        return (SubLObject)module0239.NIL;
    }
    
    public void declareFunctions() {
        f15603();
    }
    
    public void initializeVariables() {
        f15604();
    }
    
    public void runTopLevelForms() {
        f15605();
    }
    
    static {
        me = (SubLFile)new module0239();
        module0239.$g2445$ = null;
        module0239.$g2446$ = null;
        $ic0$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic1$ = SubLObjectFactory.makeSymbol("CLET");
        $ic2$ = SubLObjectFactory.makeSymbol("S#18361", "CYC");
        $ic3$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#18361", "CYC"), (SubLObject)module0239.NIL));
        $ic4$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15352", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9182", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10994", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5432", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#14446", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10995", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE-DEF")), (SubLObject)SubLObjectFactory.makeSymbol("S#8587", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUPPORT-VAR"), (SubLObject)SubLObjectFactory.makeKeyword("TV"), (SubLObject)SubLObjectFactory.makeKeyword("DONE-VAR"));
        $ic6$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic7$ = SubLObjectFactory.makeKeyword("SUPPORT-VAR");
        $ic8$ = SubLObjectFactory.makeKeyword("TV");
        $ic9$ = SubLObjectFactory.makeKeyword("TRUE-DEF");
        $ic10$ = SubLObjectFactory.makeKeyword("DONE-VAR");
        $ic11$ = SubLObjectFactory.makeUninternedSymbol("US#34A80D6");
        $ic12$ = SubLObjectFactory.makeSymbol("CDOLIST");
        $ic13$ = SubLObjectFactory.makeSymbol("S#18351", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("PCOND");
        $ic15$ = SubLObjectFactory.makeSymbol("S#16712", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#18356", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#11102", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#18355", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#18359", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#18357", "CYC");
        $ic21$ = SubLObjectFactory.makeUninternedSymbol("US#34A80D6");
        $ic22$ = SubLObjectFactory.makeUninternedSymbol("US#36739FB");
        $ic23$ = SubLObjectFactory.makeSymbol("IGNORE");
        $ic24$ = SubLObjectFactory.makeSymbol("S#18354", "CYC");
        $ic25$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15352", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#15366", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#205", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5432", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#8587", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic26$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE-VAR"));
        $ic27$ = SubLObjectFactory.makeUninternedSymbol("US#2CEBCFD");
        $ic28$ = SubLObjectFactory.makeUninternedSymbol("US#5C60151");
        $ic29$ = SubLObjectFactory.makeUninternedSymbol("US#5BE7BE6");
        $ic30$ = SubLObjectFactory.makeUninternedSymbol("US#24C7D9");
        $ic31$ = SubLObjectFactory.makeUninternedSymbol("US#1526883");
        $ic32$ = SubLObjectFactory.makeUninternedSymbol("US#229041E");
        $ic33$ = SubLObjectFactory.makeUninternedSymbol("US#15AA083");
        $ic34$ = SubLObjectFactory.makeUninternedSymbol("US#13E70D7");
        $ic35$ = SubLObjectFactory.makeSymbol("NAUT-TO-NART");
        $ic36$ = SubLObjectFactory.makeSymbol("S#11501", "CYC");
        $ic37$ = SubLObjectFactory.makeSymbol("S#11508", "CYC");
        $ic38$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic39$ = SubLObjectFactory.makeSymbol("S#15234", "CYC");
        $ic40$ = SubLObjectFactory.makeSymbol("S#10974", "CYC");
        $ic41$ = SubLObjectFactory.makeSymbol("S#15391", "CYC");
        $ic42$ = SubLObjectFactory.makeSymbol("S#15226", "CYC");
        $ic43$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic44$ = SubLObjectFactory.makeSymbol("RELEVANT-MT?");
        $ic45$ = SubLObjectFactory.makeSymbol("S#11261", "CYC");
        $ic46$ = SubLObjectFactory.makeSymbol("S#15223", "CYC");
        $ic47$ = SubLObjectFactory.makeSymbol("S#11591", "CYC");
        $ic48$ = SubLObjectFactory.makeSymbol("S#11262", "CYC");
        $ic49$ = SubLObjectFactory.makeSymbol("S#6945", "CYC");
        $ic50$ = SubLObjectFactory.makeKeyword("DONE");
        $ic51$ = SubLObjectFactory.makeSymbol("S#12592", "CYC");
        $ic52$ = SubLObjectFactory.makeSymbol("S#15243", "CYC");
        $ic53$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15352", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12704", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9182", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5432", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10995", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE-DEF")), (SubLObject)SubLObjectFactory.makeSymbol("S#8587", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic54$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TV"), (SubLObject)SubLObjectFactory.makeKeyword("DONE-VAR"));
        $ic55$ = SubLObjectFactory.makeUninternedSymbol("US#5C60151");
        $ic56$ = SubLObjectFactory.makeUninternedSymbol("US#4B21EB5");
        $ic57$ = SubLObjectFactory.makeUninternedSymbol("US#52F84C8");
        $ic58$ = SubLObjectFactory.makeUninternedSymbol("US#67B23EC");
        $ic59$ = SubLObjectFactory.makeUninternedSymbol("US#34A84C2");
        $ic60$ = SubLObjectFactory.makeUninternedSymbol("US#7C37F9B");
        $ic61$ = SubLObjectFactory.makeSymbol("S#10619", "CYC");
        $ic62$ = SubLObjectFactory.makeSymbol("S#10618", "CYC");
        $ic63$ = SubLObjectFactory.makeSymbol("S#10983", "CYC");
        $ic64$ = SubLObjectFactory.makeSymbol("S#18360", "CYC");
        $ic65$ = SubLObjectFactory.makeSymbol("S#9595", "CYC");
        $ic66$ = SubLObjectFactory.makeSymbol("S#18358", "CYC");
        $ic67$ = SubLObjectFactory.makeKeyword("INDEX");
        $ic68$ = SubLObjectFactory.makeKeyword("TRUTH");
        $ic69$ = SubLObjectFactory.makeSymbol("COR");
        $ic70$ = SubLObjectFactory.makeSymbol("CNOT");
        $ic71$ = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $ic72$ = SubLObjectFactory.makeSymbol("S#10606", "CYC");
        $ic73$ = SubLObjectFactory.makeSymbol("ASSERTION-STRENGTH");
        $ic74$ = SubLObjectFactory.makeSymbol("S#15512", "CYC");
        $ic75$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10979", "CYC"));
        $ic76$ = SubLObjectFactory.makeSymbol("S#10984", "CYC");
        $ic77$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#54", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#134", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12576", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic78$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic79$ = SubLObjectFactory.makeUninternedSymbol("US#513961A");
        $ic80$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic81$ = SubLObjectFactory.makeSymbol("S#18362", "CYC");
        $ic82$ = SubLObjectFactory.makeSymbol("S#12354", "CYC");
        $ic83$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12336", "CYC"));
        $ic84$ = SubLObjectFactory.makeSymbol("DO-GAF-ARG-INDEX");
        $ic85$ = SubLObjectFactory.makeSymbol("PWHEN-FEATURE");
        $ic86$ = SubLObjectFactory.makeKeyword("CYC-SKSI");
        $ic87$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#18363", "CYC"));
        $ic88$ = SubLObjectFactory.makeSymbol("S#10978", "CYC");
        $ic89$ = SubLObjectFactory.makeSymbol("S#18364", "CYC");
        $ic90$ = SubLObjectFactory.makeKeyword("INDEX-ARGNUM");
        $ic91$ = SubLObjectFactory.makeKeyword("FORWARD");
        $ic92$ = SubLObjectFactory.makeKeyword("BACKWARD");
        $ic93$ = SubLObjectFactory.makeString("Invalid direction ~a");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0239.class
	Total time: 183 ms
	
	Decompiled with Procyon 0.5.32.
*/