package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0337 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0337";
    public static final String myFingerPrint = "6cf4dadadef04c77261ad48cf49519099a0a01f196b3ddc1c09436096985190d";
    private static SubLSymbol $g2877$;
    private static SubLSymbol $g2878$;
    private static final SubLList $ic0$;
    private static final SubLList $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    
    public static SubLObject f22626(final SubLObject var1, final SubLObject var2) {
        return f22627(var1, var2);
    }
    
    public static SubLObject f22628(final SubLObject var1, final SubLObject var2) {
        return f22629(var1, var2);
    }
    
    public static SubLObject f22630(final SubLObject var2, final SubLObject var1) {
        return f22627(var1, var2);
    }
    
    public static SubLObject f22627(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0337.NIL;
        SubLObject var5 = (SubLObject)module0337.NIL;
        final SubLObject var6 = module0062.$g1060$.currentBinding(var3);
        final SubLObject var7 = module0062.$g1061$.currentBinding(var3);
        try {
            module0062.$g1060$.bind(module0337.$g2877$.getGlobalValue(), var3);
            module0062.$g1061$.bind(module0337.$g2878$.getGlobalValue(), var3);
            var3.resetMultipleValues();
            final SubLObject var8 = module0062.f4489(var1, var2);
            final SubLObject var9 = var3.secondMultipleValue();
            var3.resetMultipleValues();
            var4 = var8;
            var5 = var9;
        }
        finally {
            module0062.$g1061$.rebind(var7, var3);
            module0062.$g1060$.rebind(var6, var3);
        }
        return Values.values(var4, var5);
    }
    
    public static SubLObject f22629(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0337.NIL;
        final SubLObject var5 = module0062.$g1060$.currentBinding(var3);
        final SubLObject var6 = module0062.$g1061$.currentBinding(var3);
        try {
            module0062.$g1060$.bind(module0337.$g2877$.getGlobalValue(), var3);
            module0062.$g1061$.bind(module0337.$g2878$.getGlobalValue(), var3);
            var4 = module0062.f4491(var1, var2);
        }
        finally {
            module0062.$g1061$.rebind(var6, var3);
            module0062.$g1060$.rebind(var5, var3);
        }
        return var4;
    }
    
    public static SubLObject f22631(final SubLObject var1, final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0337.NIL;
        SubLObject var4 = (SubLObject)module0337.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0337.$ic2$);
        var3 = var1.first();
        SubLObject var5 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var1, (SubLObject)module0337.$ic2$);
        var4 = var5.first();
        var5 = var5.rest();
        final SubLObject var6 = (SubLObject)(var5.isCons() ? var5.first() : module0337.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var5, var1, (SubLObject)module0337.$ic2$);
        var5 = var5.rest();
        if (module0337.NIL == var5) {
            return f22632(var2, var4, var6);
        }
        cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0337.$ic2$);
        return (SubLObject)module0337.NIL;
    }
    
    public static SubLObject f22632(final SubLObject var2, final SubLObject var15, final SubLObject var16) {
        return module0305.f20438(var2, var15, var16);
    }
    
    public static SubLObject f22633(final SubLObject var1, final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0337.NIL;
        SubLObject var4 = (SubLObject)module0337.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0337.$ic2$);
        var3 = var1.first();
        SubLObject var5 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var1, (SubLObject)module0337.$ic2$);
        var4 = var5.first();
        var5 = var5.rest();
        final SubLObject var6 = (SubLObject)(var5.isCons() ? var5.first() : module0337.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var5, var1, (SubLObject)module0337.$ic2$);
        var5 = var5.rest();
        if (module0337.NIL == var5) {
            return f22634(var2, var4, var6, (SubLObject)module0337.UNPROVIDED);
        }
        cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0337.$ic2$);
        return (SubLObject)module0337.NIL;
    }
    
    public static SubLObject f22635(final SubLObject var2, final SubLObject var15, final SubLObject var16, SubLObject var19) {
        if (var19 == module0337.UNPROVIDED) {
            var19 = module0147.f9552((SubLObject)module0337.UNPROVIDED);
        }
        return f22632(var2, var15, var16);
    }
    
    public static SubLObject f22634(final SubLObject var2, final SubLObject var15, final SubLObject var16, SubLObject var19) {
        if (var19 == module0337.UNPROVIDED) {
            var19 = module0147.f9552((SubLObject)module0337.UNPROVIDED);
        }
        final SubLThread var20 = SubLProcess.currentSubLThread();
        final SubLObject var21 = module0034.$g879$.getDynamicValue(var20);
        SubLObject var22 = (SubLObject)module0337.NIL;
        if (module0337.NIL == var21) {
            return f22635(var2, var15, var16, var19);
        }
        var22 = module0034.f1857(var21, (SubLObject)module0337.$ic3$, (SubLObject)module0337.UNPROVIDED);
        if (module0337.NIL == var22) {
            var22 = module0034.f1807(module0034.f1842(var21), (SubLObject)module0337.$ic3$, (SubLObject)module0337.FOUR_INTEGER, (SubLObject)module0337.NIL, (SubLObject)module0337.EQUAL, (SubLObject)module0337.UNPROVIDED);
            module0034.f1860(var21, (SubLObject)module0337.$ic3$, var22);
        }
        final SubLObject var23 = module0034.f1780(var2, var15, var16, var19);
        final SubLObject var24 = module0034.f1814(var22, var23, (SubLObject)module0337.UNPROVIDED);
        if (var24 != module0337.$ic4$) {
            SubLObject var25 = var24;
            SubLObject var26 = (SubLObject)module0337.NIL;
            var26 = var25.first();
            while (module0337.NIL != var25) {
                SubLObject var27 = var26.first();
                final SubLObject var28 = conses_high.second(var26);
                if (var2.equal(var27.first())) {
                    var27 = var27.rest();
                    if (var15.equal(var27.first())) {
                        var27 = var27.rest();
                        if (var16.equal(var27.first())) {
                            var27 = var27.rest();
                            if (module0337.NIL != var27 && module0337.NIL == var27.rest() && var19.equal(var27.first())) {
                                return module0034.f1959(var28);
                            }
                        }
                    }
                }
                var25 = var25.rest();
                var26 = var25.first();
            }
        }
        final SubLObject var29 = Values.arg2(var20.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f22635(var2, var15, var16, var19)));
        module0034.f1836(var22, var23, var24, var29, (SubLObject)ConsesLow.list(var2, var15, var16, var19));
        return module0034.f1959(var29);
    }
    
    public static SubLObject f22636(final SubLObject var1, final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0337.NIL;
        SubLObject var4 = (SubLObject)module0337.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0337.$ic2$);
        var3 = var1.first();
        SubLObject var5 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var1, (SubLObject)module0337.$ic2$);
        var4 = var5.first();
        var5 = var5.rest();
        final SubLObject var6 = (SubLObject)(var5.isCons() ? var5.first() : module0337.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var5, var1, (SubLObject)module0337.$ic2$);
        var5 = var5.rest();
        if (module0337.NIL == var5) {
            return f22637(var2, var4, var6);
        }
        cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0337.$ic2$);
        return (SubLObject)module0337.NIL;
    }
    
    public static SubLObject f22637(final SubLObject var2, final SubLObject var15, final SubLObject var16) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0337.NIL == module0305.f20444(var2, var15, var16));
    }
    
    public static SubLObject f22638(final SubLObject var1, final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0337.NIL;
        SubLObject var4 = (SubLObject)module0337.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0337.$ic2$);
        var3 = var1.first();
        SubLObject var5 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var1, (SubLObject)module0337.$ic2$);
        var4 = var5.first();
        var5 = var5.rest();
        final SubLObject var6 = (SubLObject)(var5.isCons() ? var5.first() : module0337.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var5, var1, (SubLObject)module0337.$ic2$);
        var5 = var5.rest();
        if (module0337.NIL == var5) {
            return f22639(var2, var4, var6, (SubLObject)module0337.UNPROVIDED);
        }
        cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0337.$ic2$);
        return (SubLObject)module0337.NIL;
    }
    
    public static SubLObject f22640(final SubLObject var2, final SubLObject var15, final SubLObject var16, SubLObject var19) {
        if (var19 == module0337.UNPROVIDED) {
            var19 = module0147.f9552((SubLObject)module0337.UNPROVIDED);
        }
        return f22637(var2, var15, var16);
    }
    
    public static SubLObject f22639(final SubLObject var2, final SubLObject var15, final SubLObject var16, SubLObject var19) {
        if (var19 == module0337.UNPROVIDED) {
            var19 = module0147.f9552((SubLObject)module0337.UNPROVIDED);
        }
        final SubLThread var20 = SubLProcess.currentSubLThread();
        final SubLObject var21 = module0034.$g879$.getDynamicValue(var20);
        SubLObject var22 = (SubLObject)module0337.NIL;
        if (module0337.NIL == var21) {
            return f22640(var2, var15, var16, var19);
        }
        var22 = module0034.f1857(var21, (SubLObject)module0337.$ic5$, (SubLObject)module0337.UNPROVIDED);
        if (module0337.NIL == var22) {
            var22 = module0034.f1807(module0034.f1842(var21), (SubLObject)module0337.$ic5$, (SubLObject)module0337.FOUR_INTEGER, (SubLObject)module0337.NIL, (SubLObject)module0337.EQUAL, (SubLObject)module0337.UNPROVIDED);
            module0034.f1860(var21, (SubLObject)module0337.$ic5$, var22);
        }
        final SubLObject var23 = module0034.f1780(var2, var15, var16, var19);
        final SubLObject var24 = module0034.f1814(var22, var23, (SubLObject)module0337.UNPROVIDED);
        if (var24 != module0337.$ic4$) {
            SubLObject var25 = var24;
            SubLObject var26 = (SubLObject)module0337.NIL;
            var26 = var25.first();
            while (module0337.NIL != var25) {
                SubLObject var27 = var26.first();
                final SubLObject var28 = conses_high.second(var26);
                if (var2.equal(var27.first())) {
                    var27 = var27.rest();
                    if (var15.equal(var27.first())) {
                        var27 = var27.rest();
                        if (var16.equal(var27.first())) {
                            var27 = var27.rest();
                            if (module0337.NIL != var27 && module0337.NIL == var27.rest() && var19.equal(var27.first())) {
                                return module0034.f1959(var28);
                            }
                        }
                    }
                }
                var25 = var25.rest();
                var26 = var25.first();
            }
        }
        final SubLObject var29 = Values.arg2(var20.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f22640(var2, var15, var16, var19)));
        module0034.f1836(var22, var23, var24, var29, (SubLObject)ConsesLow.list(var2, var15, var16, var19));
        return module0034.f1959(var29);
    }
    
    public static SubLObject f22641(final SubLObject var1, final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0337.NIL;
        SubLObject var4 = (SubLObject)module0337.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0337.$ic2$);
        var3 = var1.first();
        SubLObject var5 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var1, (SubLObject)module0337.$ic2$);
        var4 = var5.first();
        var5 = var5.rest();
        final SubLObject var6 = (SubLObject)(var5.isCons() ? var5.first() : module0337.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var5, var1, (SubLObject)module0337.$ic2$);
        var5 = var5.rest();
        if (module0337.NIL == var5) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0337.NIL != module0210.f13565(var2) && module0337.NIL != module0256.f16596(var2, var4, var6, (SubLObject)module0337.UNPROVIDED));
        }
        cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0337.$ic2$);
        return (SubLObject)module0337.NIL;
    }
    
    public static SubLObject f22642(final SubLObject var1, final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0337.NIL;
        SubLObject var4 = (SubLObject)module0337.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0337.$ic2$);
        var3 = var1.first();
        SubLObject var5 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var1, (SubLObject)module0337.$ic2$);
        var4 = var5.first();
        var5 = var5.rest();
        final SubLObject var6 = (SubLObject)(var5.isCons() ? var5.first() : module0337.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var5, var1, (SubLObject)module0337.$ic2$);
        var5 = var5.rest();
        if (module0337.NIL == var5) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0337.NIL != module0210.f13565(var2) && module0337.NIL != module0256.f16577(var2, var4, var6, (SubLObject)module0337.UNPROVIDED));
        }
        cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0337.$ic2$);
        return (SubLObject)module0337.NIL;
    }
    
    public static SubLObject f22643(final SubLObject var1, final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0337.NIL;
        SubLObject var4 = (SubLObject)module0337.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0337.$ic6$);
        var3 = var1.first();
        SubLObject var5 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var1, (SubLObject)module0337.$ic6$);
        var4 = var5.first();
        var5 = var5.rest();
        if (module0337.NIL != var5) {
            cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0337.$ic6$);
            return (SubLObject)module0337.NIL;
        }
        if (module0337.NIL != module0167.f10813(var2)) {
            return module0062.f4490(var4, module0172.f10920(var2));
        }
        return module0062.f4490(var4, var2);
    }
    
    public static SubLObject f22644(final SubLObject var1, final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0337.NIL;
        SubLObject var4 = (SubLObject)module0337.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0337.$ic6$);
        var3 = var1.first();
        SubLObject var5 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var1, (SubLObject)module0337.$ic6$);
        var4 = var5.first();
        var5 = var5.rest();
        if (module0337.NIL == var5) {
            return module0234.f15434(var4, var2);
        }
        cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0337.$ic6$);
        return (SubLObject)module0337.NIL;
    }
    
    public static SubLObject f22645(final SubLObject var1, final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0337.NIL;
        SubLObject var4 = (SubLObject)module0337.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0337.$ic7$);
        var3 = var1.first();
        SubLObject var5 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var1, (SubLObject)module0337.$ic7$);
        var4 = var5.first();
        var5 = var5.rest();
        final SubLObject var6 = (SubLObject)(var5.isCons() ? var5.first() : module0337.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var5, var1, (SubLObject)module0337.$ic7$);
        var5 = var5.rest();
        if (module0337.NIL == var5) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0337.NIL != module0173.f10955(var2) && module0337.NIL != module0260.f17089(var2, var4, var6, (SubLObject)module0337.UNPROVIDED));
        }
        cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0337.$ic7$);
        return (SubLObject)module0337.NIL;
    }
    
    public static SubLObject f22646(final SubLObject var1, final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0337.NIL;
        SubLObject var4 = (SubLObject)module0337.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0337.$ic7$);
        var3 = var1.first();
        SubLObject var5 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var1, (SubLObject)module0337.$ic7$);
        var4 = var5.first();
        var5 = var5.rest();
        final SubLObject var6 = (SubLObject)(var5.isCons() ? var5.first() : module0337.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var5, var1, (SubLObject)module0337.$ic7$);
        var5 = var5.rest();
        if (module0337.NIL == var5) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0337.NIL != module0173.f10955(var2) && module0337.NIL != module0260.f17094(var2, var4, var6, (SubLObject)module0337.UNPROVIDED));
        }
        cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0337.$ic7$);
        return (SubLObject)module0337.NIL;
    }
    
    public static SubLObject f22647(final SubLObject var1, final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0337.NIL;
        SubLObject var4 = (SubLObject)module0337.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0337.$ic7$);
        var3 = var1.first();
        SubLObject var5 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var1, (SubLObject)module0337.$ic7$);
        var4 = var5.first();
        var5 = var5.rest();
        final SubLObject var6 = (SubLObject)(var5.isCons() ? var5.first() : module0337.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var5, var1, (SubLObject)module0337.$ic7$);
        var5 = var5.rest();
        if (module0337.NIL == var5) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0337.NIL != module0173.f10955(var2) && module0337.NIL != module0260.f17093(var2, var4, var6, (SubLObject)module0337.UNPROVIDED));
        }
        cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0337.$ic7$);
        return (SubLObject)module0337.NIL;
    }
    
    public static SubLObject f22648(final SubLObject var1, final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0337.NIL;
        SubLObject var4 = (SubLObject)module0337.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0337.$ic7$);
        var3 = var1.first();
        SubLObject var5 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var1, (SubLObject)module0337.$ic7$);
        var4 = var5.first();
        var5 = var5.rest();
        final SubLObject var6 = (SubLObject)(var5.isCons() ? var5.first() : module0337.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var5, var1, (SubLObject)module0337.$ic7$);
        var5 = var5.rest();
        if (module0337.NIL == var5) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0337.NIL != module0173.f10955(var2) && module0337.NIL != module0260.f17095(var2, var4, var6, (SubLObject)module0337.UNPROVIDED));
        }
        cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0337.$ic7$);
        return (SubLObject)module0337.NIL;
    }
    
    public static SubLObject f22649(final SubLObject var1, final SubLObject var2, SubLObject var7) {
        if (var7 == module0337.UNPROVIDED) {
            var7 = (SubLObject)module0337.NIL;
        }
        return f22650(var1, var2, var7);
    }
    
    public static SubLObject f22651(final SubLObject var2, final SubLObject var1, SubLObject var7) {
        if (var7 == module0337.UNPROVIDED) {
            var7 = (SubLObject)module0337.NIL;
        }
        return f22650(var1, var2, var7);
    }
    
    public static SubLObject f22650(final SubLObject var1, final SubLObject var2, final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        SubLObject var9 = (SubLObject)module0337.NIL;
        SubLObject var10 = (SubLObject)module0337.NIL;
        final SubLObject var11 = module0062.$g1063$.currentBinding(var8);
        try {
            module0062.$g1063$.bind((SubLObject)module0337.$ic8$, var8);
            var8.resetMultipleValues();
            final SubLObject var12 = module0062.f4509(var1, var2, var7);
            final SubLObject var13 = var8.secondMultipleValue();
            var8.resetMultipleValues();
            var9 = var12;
            var10 = var13;
        }
        finally {
            module0062.$g1063$.rebind(var11, var8);
        }
        return Values.values(var9, var10);
    }
    
    public static SubLObject f22652() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0337", "f22626", "S#14908", 2, 0, false);
        new $f22626$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0337", "f22628", "S#25244", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0337", "f22630", "S#6062", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0337", "f22627", "S#25245", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0337", "f22629", "S#25246", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0337", "f22631", "S#25247", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0337", "f22632", "S#25248", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0337", "f22633", "S#25249", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0337", "f22635", "S#25250", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0337", "f22634", "S#25251", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0337", "f22636", "S#25252", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0337", "f22637", "S#25253", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0337", "f22638", "S#25254", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0337", "f22640", "S#25255", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0337", "f22639", "S#25256", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0337", "f22641", "S#25257", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0337", "f22642", "S#25258", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0337", "f22643", "S#25243", 2, 0, false);
        new $f22643$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0337", "f22644", "S#25259", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0337", "f22645", "S#25260", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0337", "f22646", "S#25261", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0337", "f22647", "S#25262", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0337", "f22648", "S#25263", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0337", "f22649", "S#25264", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0337", "f22651", "S#25265", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0337", "f22650", "S#25266", 3, 0, false);
        return (SubLObject)module0337.NIL;
    }
    
    public static SubLObject f22653() {
        module0337.$g2877$ = SubLFiles.deflexical("S#25267", (SubLObject)module0337.$ic0$);
        module0337.$g2878$ = SubLFiles.deflexical("S#25268", (SubLObject)module0337.$ic1$);
        return (SubLObject)module0337.NIL;
    }
    
    public static SubLObject f22654() {
        module0034.f1895((SubLObject)module0337.$ic3$);
        module0034.f1895((SubLObject)module0337.$ic5$);
        return (SubLObject)module0337.NIL;
    }
    
    public void declareFunctions() {
        f22652();
    }
    
    public void initializeVariables() {
        f22653();
    }
    
    public void runTopLevelForms() {
        f22654();
    }
    
    static {
        me = (SubLFile)new module0337();
        module0337.$g2877$ = null;
        module0337.$g2878$ = null;
        $ic0$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeSymbol("FULLY-BOUND-P")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeSymbol("NOT-FULLY-BOUND-P")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INTEGER"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HLMT"), (SubLObject)SubLObjectFactory.makeSymbol("S#12263", "CYC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CLOSED-HLMT"), (SubLObject)SubLObjectFactory.makeSymbol("S#13261", "CYC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CONSTANT"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-P")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NART"), (SubLObject)SubLObjectFactory.makeSymbol("NART-P")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CLOSED-NAUT"), (SubLObject)SubLObjectFactory.makeSymbol("S#12592", "CYC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OPEN-NAUT"), (SubLObject)SubLObjectFactory.makeSymbol("S#12597", "CYC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-P")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("S#15496", "CYC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-P")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EL-VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("EL-VARIABLE-P")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COLLECTION-FORT"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION-P")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PREDICATE-FORT"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE-P")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FUNCTOR-FORT"), (SubLObject)SubLObjectFactory.makeSymbol("S#20286", "CYC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MT-FORT"), (SubLObject)SubLObjectFactory.makeSymbol("S#16717", "CYC")) });
        $ic1$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ISA"), (SubLObject)SubLObjectFactory.makeSymbol("S#25247", "CYC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ISA-MEMOIZED"), (SubLObject)SubLObjectFactory.makeSymbol("S#25249", "CYC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT-ISA-DISJOINT"), (SubLObject)SubLObjectFactory.makeSymbol("S#25252", "CYC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT-ISA-DISJOINT-MEMOIZED"), (SubLObject)SubLObjectFactory.makeSymbol("S#25254", "CYC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GENLS"), (SubLObject)SubLObjectFactory.makeSymbol("S#25257", "CYC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25258", "CYC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAT"), (SubLObject)SubLObjectFactory.makeSymbol("S#25243", "CYC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("UNIFY"), (SubLObject)SubLObjectFactory.makeSymbol("S#25259", "CYC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GENL-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("S#25260", "CYC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GENL-INVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("S#25261", "CYC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SPEC-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("S#25262", "CYC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SPEC-INVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("S#25263", "CYC")) });
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6050", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12458", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"));
        $ic3$ = SubLObjectFactory.makeSymbol("S#25251", "CYC");
        $ic4$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic5$ = SubLObjectFactory.makeSymbol("S#25256", "CYC");
        $ic6$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6050", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6058", "CYC"));
        $ic7$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6050", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#717", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"));
        $ic8$ = SubLObjectFactory.makeSymbol("S#14908", "CYC");
    }
    
    public static final class $f22626$BinaryFunction extends BinaryFunction
    {
        public $f22626$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#14908"));
        }
        
        public SubLObject processItem(final SubLObject var3, final SubLObject var4) {
            return module0337.f22626(var3, var4);
        }
    }
    
    public static final class $f22643$BinaryFunction extends BinaryFunction
    {
        public $f22643$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#25243"));
        }
        
        public SubLObject processItem(final SubLObject var3, final SubLObject var4) {
            return module0337.f22643(var3, var4);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0337.class
	Total time: 138 ms
	
	Decompiled with Procyon 0.5.32.
*/