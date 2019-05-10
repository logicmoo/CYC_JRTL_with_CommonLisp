package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0261 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0261";
    public static final String myFingerPrint = "1dbd57365a500dc852bb214404100124bb361a19618c7734fcf28cb932bd9630";
    private static final SubLObject $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLList $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
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
    
    public static SubLObject f17214(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0248.f15931(module0137.f8955($ic0$), var1, var2, var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17215(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0248.f15931(module0137.f8955($ic1$), var1, var2, var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17216(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0252.f16304(module0137.f8955($ic0$), var1, var2, var3);
    }
    
    public static SubLObject f17217(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0252.f16304(module0137.f8955($ic1$), var1, var2, var3);
    }
    
    public static SubLObject f17218(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0248.f15932(module0137.f8955($ic0$), var1, var2, var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17219(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0248.f15932(module0137.f8955($ic1$), var1, var2, var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17220(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0252.f16305(module0137.f8955($ic0$), var1, var2, var3);
    }
    
    public static SubLObject f17221(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0252.f16305(module0137.f8955($ic1$), var1, var2, var3);
    }
    
    public static SubLObject f17222(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0254.f16479(module0137.f8955($ic0$), var1, var2, var3);
    }
    
    public static SubLObject f17223(final SubLObject var4, final SubLObject var5) {
        SubLObject var7;
        final SubLObject var6 = var7 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic2$);
        final SubLObject var8 = var7.rest();
        var7 = var7.first();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic2$);
        var9 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic2$);
        var10 = var7.first();
        var7 = var7.rest();
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = var7;
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var13_14 = (SubLObject)NIL;
        while (NIL != var12) {
            cdestructuring_bind.destructuring_bind_must_consp(var12, var6, (SubLObject)$ic2$);
            var13_14 = var12.first();
            var12 = var12.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var12, var6, (SubLObject)$ic2$);
            if (NIL == conses_high.member(var13_14, (SubLObject)$ic3$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var13 = (SubLObject)T;
            }
            if (var13_14 == $ic4$) {
                var11 = var12.first();
            }
            var12 = var12.rest();
        }
        if (NIL != var13 && NIL == var11) {
            cdestructuring_bind.cdestructuring_bind_error(var6, (SubLObject)$ic2$);
        }
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)$ic5$, var7);
        final SubLObject var15 = (SubLObject)((NIL != var14) ? conses_high.cadr(var14) : NIL);
        final SubLObject var16 = cdestructuring_bind.property_list_member((SubLObject)$ic6$, var7);
        final SubLObject var17 = (SubLObject)((NIL != var16) ? conses_high.cadr(var16) : NIL);
        final SubLObject var18 = cdestructuring_bind.property_list_member((SubLObject)$ic7$, var7);
        final SubLObject var19 = (SubLObject)((NIL != var18) ? conses_high.cadr(var18) : NIL);
        final SubLObject var20;
        var7 = (var20 = var8);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic8$, (SubLObject)ConsesLow.list(var9, (SubLObject)ConsesLow.list((SubLObject)$ic9$, var10, var15, var17), (SubLObject)$ic7$, var19), ConsesLow.append(var20, (SubLObject)NIL));
    }
    
    public static SubLObject f17224(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return f17222(var1, var2, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17225(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0254.f16479(module0137.f8955($ic1$), var1, var2, var3);
    }
    
    public static SubLObject f17226(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0252.f16247(module0137.f8955($ic0$), var1, var2, var3);
    }
    
    public static SubLObject f17227(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return f17226(var1, var2, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17228(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0252.f16247(module0137.f8955($ic1$), var1, var2, var3);
    }
    
    public static SubLObject f17229(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0254.f16480(module0137.f8955($ic0$), var1, var2, var3);
    }
    
    public static SubLObject f17230(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return f17229(var1, var2, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17231(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return f17229(var1, var2, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17232(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return f17229(var1, var2, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17233(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0254.f16480(module0137.f8955($ic1$), var1, var2, var3);
    }
    
    public static SubLObject f17234(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return f17233(var1, var2, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17235(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0252.f16264(module0137.f8955($ic0$), var1, var2, var3);
    }
    
    public static SubLObject f17236(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0252.f16257(module0244.f15774(module0137.f8955($ic0$)), var1, var2, var3);
    }
    
    public static SubLObject f17237(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0252.f16261(module0137.f8955($ic0$), var1, var2, var3);
    }
    
    public static SubLObject f17238(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return f17235(var1, var2, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17239(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return f17235(var1, var2, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17240(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return f17235(var1, var2, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17241(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0252.f16264(module0137.f8955($ic1$), var1, var2, var3);
    }
    
    public static SubLObject f17242(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0252.f16257(module0244.f15774(module0137.f8955($ic1$)), var1, var2, var3);
    }
    
    public static SubLObject f17243(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0252.f16261(module0137.f8955($ic1$), var1, var2, var3);
    }
    
    public static SubLObject f17244(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return f17241(var1, var2, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17245(final SubLObject var20, final SubLObject var21, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return f17246(var20, var21, var2, var3);
    }
    
    public static SubLObject f17247(final SubLObject var20, final SubLObject var21, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        final SubLObject var23 = module0034.$g879$.getDynamicValue(var22);
        SubLObject var24 = (SubLObject)NIL;
        if (NIL == var23) {
            return f17245(var20, var21, var2, var3);
        }
        var24 = module0034.f1857(var23, (SubLObject)$ic10$, (SubLObject)UNPROVIDED);
        if (NIL == var24) {
            var24 = module0034.f1807(module0034.f1842(var23), (SubLObject)$ic10$, (SubLObject)FOUR_INTEGER, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)UNPROVIDED);
            module0034.f1860(var23, (SubLObject)$ic10$, var24);
        }
        final SubLObject var25 = module0034.f1780(var20, var21, var2, var3);
        final SubLObject var26 = module0034.f1814(var24, var25, (SubLObject)UNPROVIDED);
        if (var26 != $ic11$) {
            SubLObject var27 = var26;
            SubLObject var28 = (SubLObject)NIL;
            var28 = var27.first();
            while (NIL != var27) {
                SubLObject var29 = var28.first();
                final SubLObject var30 = conses_high.second(var28);
                if (var20.eql(var29.first())) {
                    var29 = var29.rest();
                    if (var21.eql(var29.first())) {
                        var29 = var29.rest();
                        if (var2.eql(var29.first())) {
                            var29 = var29.rest();
                            if (NIL != var29 && NIL == var29.rest() && var3.eql(var29.first())) {
                                return module0034.f1959(var30);
                            }
                        }
                    }
                }
                var27 = var27.rest();
                var28 = var27.first();
            }
        }
        final SubLObject var31 = Values.arg2(var22.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f17245(var20, var21, var2, var3)));
        module0034.f1836(var24, var25, var26, var31, (SubLObject)ConsesLow.list(var20, var21, var2, var3));
        return module0034.f1959(var31);
    }
    
    public static SubLObject f17246(final SubLObject var20, final SubLObject var21, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0254.f16490(module0137.f8955($ic0$), var20, var21, var2, var3);
    }
    
    public static SubLObject f17248(final SubLObject var20, final SubLObject var21, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return f17246(var20, var21, var2, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17249(final SubLObject var20, final SubLObject var21, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return f17250(var20, var21, var2, var3);
    }
    
    public static SubLObject f17251(final SubLObject var20, final SubLObject var21, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        final SubLObject var23 = module0034.$g879$.getDynamicValue(var22);
        SubLObject var24 = (SubLObject)NIL;
        if (NIL == var23) {
            return f17249(var20, var21, var2, var3);
        }
        var24 = module0034.f1857(var23, (SubLObject)$ic12$, (SubLObject)UNPROVIDED);
        if (NIL == var24) {
            var24 = module0034.f1807(module0034.f1842(var23), (SubLObject)$ic12$, (SubLObject)FOUR_INTEGER, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)UNPROVIDED);
            module0034.f1860(var23, (SubLObject)$ic12$, var24);
        }
        final SubLObject var25 = module0034.f1780(var20, var21, var2, var3);
        final SubLObject var26 = module0034.f1814(var24, var25, (SubLObject)UNPROVIDED);
        if (var26 != $ic11$) {
            SubLObject var27 = var26;
            SubLObject var28 = (SubLObject)NIL;
            var28 = var27.first();
            while (NIL != var27) {
                SubLObject var29 = var28.first();
                final SubLObject var30 = conses_high.second(var28);
                if (var20.eql(var29.first())) {
                    var29 = var29.rest();
                    if (var21.eql(var29.first())) {
                        var29 = var29.rest();
                        if (var2.eql(var29.first())) {
                            var29 = var29.rest();
                            if (NIL != var29 && NIL == var29.rest() && var3.eql(var29.first())) {
                                return module0034.f1959(var30);
                            }
                        }
                    }
                }
                var27 = var27.rest();
                var28 = var27.first();
            }
        }
        final SubLObject var31 = Values.arg2(var22.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f17249(var20, var21, var2, var3)));
        module0034.f1836(var24, var25, var26, var31, (SubLObject)ConsesLow.list(var20, var21, var2, var3));
        return module0034.f1959(var31);
    }
    
    public static SubLObject f17250(final SubLObject var20, final SubLObject var21, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0254.f16490(module0137.f8955($ic1$), var20, var21, var2, var3);
    }
    
    public static SubLObject f17252(final SubLObject var20, final SubLObject var21, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return f17253(var20, var21, var2, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17253(final SubLObject var20, final SubLObject var21, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0252.f16346(module0137.f8955($ic0$), var20, var21, var2, var3);
    }
    
    public static SubLObject f17254(final SubLObject var20, final SubLObject var21, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0252.f16346(module0137.f8955($ic1$), var20, var21, var2, var3);
    }
    
    public static SubLObject f17255(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0035.sublisp_boolean(f17256(var1, var2, var3));
    }
    
    public static SubLObject f17256(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0252.f16265(module0137.f8955($ic0$), var1, var2, var3);
    }
    
    public static SubLObject f17257(final SubLObject var32, final SubLObject var33, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var34 = SubLProcess.currentSubLThread();
        SubLObject var35 = (SubLObject)NIL;
        if (var32.eql(var33)) {
            final SubLObject var36 = module0137.$g1609$.currentBinding(var34);
            try {
                module0137.$g1609$.bind((SubLObject)NIL, var34);
                var35 = f17252(var32, var33, var2);
            }
            finally {
                module0137.$g1609$.rebind(var36, var34);
            }
        }
        return (SubLObject)makeBoolean((var32.eql(var33) && NIL != var35) || (!var32.eql(var33) && NIL != f17252(var32, var33, var2)));
    }
    
    public static SubLObject f17258(final SubLObject var32, final SubLObject var33, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var34 = SubLProcess.currentSubLThread();
        SubLObject var35 = (SubLObject)NIL;
        if (var32.eql(var33)) {
            final SubLObject var36 = module0137.$g1609$.currentBinding(var34);
            try {
                module0137.$g1609$.bind((SubLObject)NIL, var34);
                var35 = f17254(var32, var33, var2, (SubLObject)UNPROVIDED);
            }
            finally {
                module0137.$g1609$.rebind(var36, var34);
            }
        }
        return (SubLObject)makeBoolean((var32.eql(var33) && NIL != var35) || (!var32.eql(var33) && NIL != f17254(var32, var33, var2, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f17259(final SubLObject var20, final SubLObject var21, SubLObject var2, SubLObject var3, SubLObject var37) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        return module0254.f16498(module0137.f8955($ic0$), var20, var21, var2, var3, var37);
    }
    
    public static SubLObject f17260(final SubLObject var20, final SubLObject var21, SubLObject var2, SubLObject var3, SubLObject var37) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        return module0254.f16498(module0137.f8955($ic1$), var20, var21, var2, var3, var37);
    }
    
    public static SubLObject f17261(final SubLObject var20, final SubLObject var21, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0253.f16446(module0137.f8955($ic0$), var20, var21, var3);
    }
    
    public static SubLObject f17262(final SubLObject var20, final SubLObject var21) {
        return f17261(var20, var21, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17263(final SubLObject var20, final SubLObject var21, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0253.f16440(module0137.f8955($ic0$), var20, var21, var3);
    }
    
    public static SubLObject f17264(final SubLObject var20, final SubLObject var21) {
        return f17263(var20, var21, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17265(final SubLObject var20, final SubLObject var21, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0253.f16448(module0137.f8955($ic0$), var21, var20, var3);
    }
    
    public static SubLObject f17266(final SubLObject var20, final SubLObject var21, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0253.f16442(module0137.f8955($ic0$), var21, var20, var3);
    }
    
    public static SubLObject f17267(final SubLObject var20, final SubLObject var21, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0253.f16446(module0137.f8955($ic1$), var20, var21, var3);
    }
    
    public static SubLObject f17268(final SubLObject var20, final SubLObject var21, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0253.f16440(module0137.f8955($ic1$), var20, var21, var3);
    }
    
    public static SubLObject f17269(final SubLObject var20, final SubLObject var21, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0253.f16448(module0137.f8955($ic1$), var21, var20, var3);
    }
    
    public static SubLObject f17270(final SubLObject var20, final SubLObject var21, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0253.f16442(module0137.f8955($ic1$), var21, var20, var3);
    }
    
    public static SubLObject f17271(final SubLObject var1) {
        return module0226.f15062(var1, $ic0$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17272(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0248.f16007(module0137.f8955($ic0$), var1, var2);
    }
    
    public static SubLObject f17273(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0248.f16008(module0137.f8955($ic0$), var1, var2);
    }
    
    public static SubLObject f17274(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0248.f16011(module0137.f8955($ic0$), var1, var2);
    }
    
    public static SubLObject f17275(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0248.f16012(module0137.f8955($ic0$), var1, var2);
    }
    
    public static SubLObject f17276(final SubLObject var1) {
        return module0226.f15062(var1, module0137.f8955($ic1$), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17277(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0248.f16007(module0137.f8955($ic1$), var1, var2);
    }
    
    public static SubLObject f17278(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0248.f16008(module0137.f8955($ic1$), var1, var2);
    }
    
    public static SubLObject f17279(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0248.f16011(module0137.f8955($ic1$), var1, var2);
    }
    
    public static SubLObject f17280(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0248.f16012(module0137.f8955($ic1$), var1, var2);
    }
    
    public static SubLObject f17281(final SubLObject var38, final SubLObject var39) {
        module0248.f15957(var38, var39, module0137.f8955($ic0$));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17282(final SubLObject var38, final SubLObject var39) {
        module0248.f15957(var38, var39, module0137.f8955($ic1$));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17283(final SubLObject var38, final SubLObject var39) {
        f17282(var38, var39);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17284(final SubLObject var38, final SubLObject var39) {
        module0248.f15962(var38, var39, module0137.f8955($ic0$));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17285(final SubLObject var38, final SubLObject var39) {
        module0248.f15962(var38, var39, module0137.f8955($ic1$));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17286(final SubLObject var38, final SubLObject var39) {
        f17285(var38, var39);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17287() {
        module0248.f16004(module0137.f8955($ic0$));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17288() {
        module0248.f16004(module0137.f8955($ic1$));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17289(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        final SubLObject var42 = module0141.$g1670$.currentBinding(var41);
        final SubLObject var43 = module0141.$g1671$.currentBinding(var41);
        final SubLObject var44 = module0141.$g1672$.currentBinding(var41);
        final SubLObject var45 = module0141.$g1674$.currentBinding(var41);
        final SubLObject var46 = module0137.$g1605$.currentBinding(var41);
        try {
            module0141.$g1670$.bind(module0137.f8955($ic0$), var41);
            module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic0$)), var41);
            module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic0$)), var41);
            module0141.$g1674$.bind((SubLObject)NIL, var41);
            module0137.$g1605$.bind(module0137.f8955($ic0$), var41);
            SubLObject var47 = module0248.f15925(module0137.f8955($ic0$), var40);
            SubLObject var48 = (SubLObject)NIL;
            var48 = var47.first();
            while (NIL != var47) {
                if (NIL != module0269.f17706(var40)) {
                    module0248.f15999(var40, var48, (SubLObject)UNPROVIDED);
                }
                var47 = var47.rest();
                var48 = var47.first();
            }
        }
        finally {
            module0137.$g1605$.rebind(var46, var41);
            module0141.$g1674$.rebind(var45, var41);
            module0141.$g1672$.rebind(var44, var41);
            module0141.$g1671$.rebind(var43, var41);
            module0141.$g1670$.rebind(var42, var41);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17290(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        final SubLObject var42 = module0141.$g1670$.currentBinding(var41);
        final SubLObject var43 = module0141.$g1671$.currentBinding(var41);
        final SubLObject var44 = module0141.$g1672$.currentBinding(var41);
        final SubLObject var45 = module0141.$g1674$.currentBinding(var41);
        final SubLObject var46 = module0137.$g1605$.currentBinding(var41);
        try {
            module0141.$g1670$.bind(module0137.f8955($ic1$), var41);
            module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic1$)), var41);
            module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic1$)), var41);
            module0141.$g1674$.bind((SubLObject)NIL, var41);
            module0137.$g1605$.bind(module0137.f8955($ic1$), var41);
            SubLObject var47 = module0248.f15925(module0137.f8955($ic1$), var40);
            SubLObject var48 = (SubLObject)NIL;
            var48 = var47.first();
            while (NIL != var47) {
                if (NIL != module0269.f17706(var40)) {
                    module0248.f15999(var40, var48, (SubLObject)UNPROVIDED);
                }
                var47 = var47.rest();
                var48 = var47.first();
            }
        }
        finally {
            module0137.$g1605$.rebind(var46, var41);
            module0141.$g1674$.rebind(var45, var41);
            module0141.$g1672$.rebind(var44, var41);
            module0141.$g1671$.rebind(var43, var41);
            module0141.$g1670$.rebind(var42, var41);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17291(final SubLObject var1) {
        final SubLObject var2 = f17271(var1);
        f17289(var1);
        SubLObject var3 = var2;
        SubLObject var4 = (SubLObject)NIL;
        var4 = var3.first();
        while (NIL != var3) {
            if (NIL != module0269.f17706(var1)) {
                f17292(var1, var4);
            }
            var3 = var3.rest();
            var4 = var3.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17293(final SubLObject var1) {
        final SubLObject var2 = f17276(var1);
        f17290(var1);
        SubLObject var3 = var2;
        SubLObject var4 = (SubLObject)NIL;
        var4 = var3.first();
        while (NIL != var3) {
            if (NIL != module0269.f17706(var1)) {
                f17294(var1, var4);
            }
            var3 = var3.rest();
            var4 = var3.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17292(final SubLObject var1, final SubLObject var2) {
        module0248.f15951(var1, var2, module0137.f8955($ic0$));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17294(final SubLObject var1, final SubLObject var2) {
        module0248.f15951(var1, var2, module0137.f8955($ic1$));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17295(SubLObject var46) {
        if (var46 == UNPROVIDED) {
            var46 = (SubLObject)T;
        }
        if (NIL != var46) {
            f17287();
        }
        module0248.f15952(module0137.f8955($ic0$));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17296(SubLObject var46) {
        if (var46 == UNPROVIDED) {
            var46 = (SubLObject)T;
        }
        if (NIL != var46) {
            f17288();
        }
        module0248.f15952(module0137.f8955($ic1$));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17297() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17214", "S#19781", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17215", "S#19782", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17216", "S#19783", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17217", "S#19784", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17218", "S#19785", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17219", "S#19786", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17220", "S#19787", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17221", "S#19788", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17222", "ALL-NEGATION-PREDICATES", 1, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0261", "f17223", "S#19789");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17224", "ALL-NEGATION-PREDS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17225", "ALL-NEGATION-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17226", "S#19790", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17227", "S#19791", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17228", "S#19792", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17229", "S#19793", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17230", "NEGATION-PREDS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17231", "S#19794", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17232", "S#19795", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17233", "S#19796", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17234", "MAX-NEGATION-INVERSES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17235", "S#19797", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17236", "S#19798", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17237", "S#19799", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17238", "S#19800", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17239", "S#19801", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17240", "S#19802", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17241", "S#19803", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17242", "S#19804", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17243", "S#19805", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17244", "S#19806", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17245", "S#19807", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17247", "S#19808", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17246", "S#12340", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17248", "NEGATION-PRED?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17249", "S#19809", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17251", "S#19810", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17250", "NEGATION-INVERSE?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17252", "S#19811", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17253", "S#19645", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17254", "S#19812", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17255", "SOME-NEGATION-PRED-OR-INVERSE?", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17256", "S#19813", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17257", "S#19814", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17258", "S#19815", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17259", "S#19816", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17260", "S#19817", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17261", "S#19818", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17262", "MAX-FLOOR-MTS-OF-NEGATION-PRED-PATHS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17263", "S#19819", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17264", "MIN-MTS-OF-NEGATION-PRED-PATHS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17265", "S#19820", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17266", "S#19821", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17267", "MAX-FLOOR-MTS-OF-NEGATION-INVERSE-PATHS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17268", "MIN-MTS-OF-NEGATION-INVERSE-PATHS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17269", "S#19822", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17270", "S#19823", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17271", "S#19824", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17272", "S#19825", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17273", "S#19826", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17274", "S#19827", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17275", "S#19828", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17276", "S#19829", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17277", "S#19830", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17278", "S#19831", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17279", "S#19832", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17280", "S#19833", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17281", "NEGATION-PREDICATE-AFTER-ADDING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17282", "NEGATION-INVERSE-AFTER-ADDING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17283", "ADD-NEGATION-INVERSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17284", "NEGATION-PREDICATE-AFTER-REMOVING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17285", "NEGATION-INVERSE-AFTER-REMOVING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17286", "REMOVE-NEGATION-INVERSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17287", "S#19834", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17288", "S#19835", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17289", "S#19836", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17290", "S#19837", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17291", "S#19838", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17293", "S#19839", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17292", "S#19840", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17294", "S#19841", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17295", "S#19842", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0261", "f17296", "S#19843", 0, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17298() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17299() {
        module0034.f1895((SubLObject)$ic10$);
        module0034.f1895((SubLObject)$ic12$);
        module0012.f416((SubLObject)$ic13$);
        module0012.f416((SubLObject)$ic14$);
        module0012.f416((SubLObject)$ic15$);
        module0012.f416((SubLObject)$ic16$);
        module0012.f416((SubLObject)$ic17$);
        module0012.f416((SubLObject)$ic18$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f17297();
    }
    
    public void initializeVariables() {
        f17298();
    }
    
    public void runTopLevelForms() {
        f17299();
    }
    
    static {
        me = (SubLFile)new module0261();
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("negationPreds"));
        $ic1$ = constant_handles_oc.f8479((SubLObject)makeString("negationInverse"));
        $ic2$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#19844", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#10995", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)makeKeyword("MT"), (SubLObject)makeKeyword("TV"), (SubLObject)makeKeyword("DONE"));
        $ic4$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic5$ = makeKeyword("MT");
        $ic6$ = makeKeyword("TV");
        $ic7$ = makeKeyword("DONE");
        $ic8$ = makeSymbol("DO-LIST");
        $ic9$ = makeSymbol("ALL-NEGATION-PREDICATES");
        $ic10$ = makeSymbol("S#19808", "CYC");
        $ic11$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic12$ = makeSymbol("S#19810", "CYC");
        $ic13$ = makeSymbol("NEGATION-PREDICATE-AFTER-ADDING");
        $ic14$ = makeSymbol("NEGATION-INVERSE-AFTER-ADDING");
        $ic15$ = makeSymbol("ADD-NEGATION-INVERSE");
        $ic16$ = makeSymbol("NEGATION-PREDICATE-AFTER-REMOVING");
        $ic17$ = makeSymbol("NEGATION-INVERSE-AFTER-REMOVING");
        $ic18$ = makeSymbol("REMOVE-NEGATION-INVERSE");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 228 ms
	
	Decompiled with Procyon 0.5.32.
*/