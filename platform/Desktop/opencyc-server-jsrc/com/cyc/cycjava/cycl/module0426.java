package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0426 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0426";
    public static final String myFingerPrint = "75641dd2247477f0fee6a04ea8a075a9d47e2a47ae57d5e2052118fdd4d48789";
    private static SubLSymbol $g3473$;
    private static SubLSymbol $g3474$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLString $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLString $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLString $ic15$;
    private static final SubLString $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLString $ic18$;
    private static final SubLString $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLString $ic21$;
    private static final SubLList $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLList $ic30$;
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
    private static final SubLInteger $ic41$;
    private static final SubLString $ic42$;
    private static final SubLString $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLList $ic47$;
    private static final SubLObject $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLString $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLString $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLString $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    
    public static SubLObject f30110(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var1.isCons() && module0426.$ic0$ == var1.first());
    }
    
    public static SubLObject f30111(final SubLObject var2) {
        return conses_high.second(var2);
    }
    
    public static SubLObject f30112(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0426.NIL != f30110(var1) && module0426.$ic1$ == f30111(var1));
    }
    
    public static SubLObject f30113(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0426.NIL != f30110(var1) && module0426.$ic2$ == f30111(var1));
    }
    
    public static SubLObject f30114(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0426.NIL != f30110(var1) && module0426.$ic3$ == f30111(var1));
    }
    
    public static SubLObject f30115(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0426.NIL != f30112(var1) || module0426.NIL != f30113(var1));
    }
    
    public static SubLObject f30116(final SubLObject var3, final SubLObject var4, SubLObject var5) {
        if (var5 == module0426.UNPROVIDED) {
            var5 = module0018.$g729$.getDynamicValue();
        }
        return module0571.f34986((SubLObject)ConsesLow.list((SubLObject)module0426.$ic0$, (SubLObject)module0426.$ic1$, var3, var4, var5));
    }
    
    public static SubLObject f30117(final SubLObject var6, final SubLObject var7, final SubLObject var8, final SubLObject var9) {
        return (SubLObject)ConsesLow.list(var6, var7, var8, var9);
    }
    
    public static SubLObject f30118(final SubLObject var10, final SubLObject var7, final SubLObject var11, final SubLObject var8, final SubLObject var12, final SubLObject var13, SubLObject var5) {
        if (var5 == module0426.UNPROVIDED) {
            var5 = module0018.$g729$.getDynamicValue();
        }
        return module0571.f34986((SubLObject)ConsesLow.list(new SubLObject[] { module0426.$ic0$, module0426.$ic2$, var10, var7, var11, var8, var12, var13, var5 }));
    }
    
    public static SubLObject f30119(final SubLObject var10, final SubLObject var7, final SubLObject var14, final SubLObject var15, final SubLObject var16, SubLObject var5) {
        if (var5 == module0426.UNPROVIDED) {
            var5 = module0018.$g729$.getDynamicValue();
        }
        return module0571.f34986((SubLObject)ConsesLow.list((SubLObject)module0426.$ic0$, (SubLObject)module0426.$ic3$, var10, var7, var14, var15, var16, var5));
    }
    
    public static SubLObject f30120(final SubLObject var17) {
        assert module0426.NIL != f30112(var17) : var17;
        return module0571.f34996(conses_high.third(var17));
    }
    
    public static SubLObject f30121(final SubLObject var17) {
        assert module0426.NIL != f30112(var17) : var17;
        return module0571.f34996(conses_high.fourth(var17));
    }
    
    public static SubLObject f30122(final SubLObject var17) {
        assert module0426.NIL != f30112(var17) : var17;
        return module0571.f34996(conses_high.fifth(var17));
    }
    
    public static SubLObject f30123(final SubLObject var18) {
        assert module0426.NIL != f30113(var18) : var18;
        return module0571.f34996(conses_high.third(var18));
    }
    
    public static SubLObject f30124(final SubLObject var18) {
        assert module0426.NIL != f30113(var18) : var18;
        return module0571.f34996(conses_high.fourth(var18));
    }
    
    public static SubLObject f30125(final SubLObject var18) {
        assert module0426.NIL != f30113(var18) : var18;
        return module0571.f34996(conses_high.fifth(var18));
    }
    
    public static SubLObject f30126(final SubLObject var18) {
        assert module0426.NIL != f30113(var18) : var18;
        return module0571.f34996(conses_high.sixth(var18));
    }
    
    public static SubLObject f30127(final SubLObject var18) {
        assert module0426.NIL != f30113(var18) : var18;
        return module0571.f34996(conses_high.seventh(var18));
    }
    
    public static SubLObject f30128(final SubLObject var18) {
        assert module0426.NIL != f30113(var18) : var18;
        return module0571.f34996(conses_high.eighth(var18));
    }
    
    public static SubLObject f30129(final SubLObject var18) {
        assert module0426.NIL != f30113(var18) : var18;
        return module0571.f34996(conses_high.ninth(var18));
    }
    
    public static SubLObject f30130(final SubLObject var19) {
        assert module0426.NIL != f30114(var19) : var19;
        return module0571.f34996(conses_high.third(var19));
    }
    
    public static SubLObject f30131(final SubLObject var19) {
        assert module0426.NIL != f30114(var19) : var19;
        return module0571.f34996(conses_high.fourth(var19));
    }
    
    public static SubLObject f30132(final SubLObject var19) {
        assert module0426.NIL != f30114(var19) : var19;
        return module0571.f34996(conses_high.fifth(var19));
    }
    
    public static SubLObject f30133(final SubLObject var19) {
        assert module0426.NIL != f30114(var19) : var19;
        return module0571.f34996(conses_high.sixth(var19));
    }
    
    public static SubLObject f30134(final SubLObject var19) {
        assert module0426.NIL != f30114(var19) : var19;
        return module0571.f34996(conses_high.seventh(var19));
    }
    
    public static SubLObject f30135(final SubLObject var19) {
        assert module0426.NIL != f30114(var19) : var19;
        return module0571.f34996(conses_high.eighth(var19));
    }
    
    public static SubLObject f30136(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0426.NIL != constant_handles_oc.f8449(var1) && module0426.NIL != module0004.f104(var1, module0018.$g730$.getDynamicValue(var2), (SubLObject)module0426.UNPROVIDED, (SubLObject)module0426.UNPROVIDED));
    }
    
    public static SubLObject f30137(final SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        final SubLObject var23 = Sequences.position(var21, module0018.$g730$.getDynamicValue(var22), (SubLObject)module0426.UNPROVIDED, (SubLObject)module0426.UNPROVIDED, (SubLObject)module0426.UNPROVIDED, (SubLObject)module0426.UNPROVIDED);
        return (SubLObject)ConsesLow.list((SubLObject)module0426.$ic7$, var23);
    }
    
    public static SubLObject f30138(final SubLObject var21) {
        return conses_high.second(f30137(var21));
    }
    
    public static SubLObject f30139(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0426.NIL != module0035.f1998(var1) && module0426.$ic7$ == var1.first() && module0426.NIL != module0004.f106(conses_high.second(var1)));
    }
    
    public static SubLObject f30140(final SubLObject var23) {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        SubLObject var25 = (SubLObject)module0426.NIL;
        final SubLObject var26 = module0146.$g1962$.currentBinding(var24);
        try {
            module0146.$g1962$.bind((SubLObject)module0426.$ic8$, var24);
            var25 = module0205.f13144(var23);
        }
        finally {
            module0146.$g1962$.rebind(var26, var24);
        }
        return var25;
    }
    
    public static SubLObject f30141(final SubLObject var5) {
        module0018.$g729$.setDynamicValue(var5);
        return var5;
    }
    
    public static SubLObject f30142() {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        return module0018.$g731$.getDynamicValue(var20);
    }
    
    public static SubLObject f30143() {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        return module0018.$g734$.getDynamicValue(var20);
    }
    
    public static SubLObject f30144(final SubLObject var26) {
        return module0425.f30066(var26, module0426.$g3473$.getGlobalValue());
    }
    
    public static SubLObject f30145(SubLObject var26, final SubLObject var27, SubLObject var28) {
        if (var28 == module0426.UNPROVIDED) {
            var28 = (SubLObject)module0426.NIL;
        }
        final SubLThread var29 = SubLProcess.currentSubLThread();
        var26 = f30144(var26);
        assert module0426.NIL != module0075.f5193(var26) : var26;
        var29.resetMultipleValues();
        final SubLObject var30 = f30146(var27);
        final SubLObject var31 = var29.secondMultipleValue();
        var29.resetMultipleValues();
        if (module0426.NIL != var28) {
            module0069.f4937(var30, var26);
        }
        else {
            module0069.f4941(var30, var26);
        }
        return var31;
    }
    
    public static SubLObject f30147(SubLObject var26) {
        var26 = f30144(var26);
        return module0069.f4939(var26);
    }
    
    public static SubLObject f30148(final SubLObject var29, final SubLObject var2) {
        final SubLObject var30 = f30149(var29, var2);
        final SubLObject var31 = var30.first();
        if (module0426.NIL != module0035.f2002(var30, (SubLObject)module0426.ONE_INTEGER, (SubLObject)module0426.UNPROVIDED)) {
            Errors.warn((SubLObject)module0426.$ic11$, var2, var30);
        }
        return var31;
    }
    
    public static SubLObject f30149(final SubLObject var29, final SubLObject var2) {
        SubLObject var30 = (SubLObject)module0426.NIL;
        SubLObject var31 = (SubLObject)module0426.NIL;
        SubLObject var32 = (SubLObject)module0426.NIL;
        SubLObject var33 = (SubLObject)module0426.NIL;
        var31 = var29;
        var32 = var31.first();
        for (var33 = (SubLObject)module0426.ZERO_INTEGER; module0426.NIL != var31; var31 = var31.rest(), var32 = var31.first(), var33 = Numbers.add((SubLObject)module0426.ONE_INTEGER, var33)) {
            if (var2.equalp(var32)) {
                var30 = (SubLObject)ConsesLow.cons(var33, var30);
            }
        }
        return Sequences.nreverse(var30);
    }
    
    public static SubLObject f30146(final SubLObject var27) {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        SubLObject var29 = (SubLObject)module0426.NIL;
        SubLObject var30 = (SubLObject)module0426.NIL;
        final SubLObject var31 = module0018.$g731$.currentBinding(var28);
        final SubLObject var32 = module0018.$g730$.currentBinding(var28);
        final SubLObject var33 = module0018.$g732$.currentBinding(var28);
        try {
            module0018.$g731$.bind((SubLObject)module0426.T, var28);
            module0018.$g730$.bind((SubLObject)module0426.NIL, var28);
            module0018.$g732$.bind((SubLObject)module0426.NIL, var28);
            final SubLObject var34 = Time.get_internal_real_time();
            final SubLObject var25_38 = module0018.$g571$.currentBinding(var28);
            try {
                module0018.$g571$.bind((SubLObject)module0426.NIL, var28);
                Eval.eval(var27);
            }
            finally {
                module0018.$g571$.rebind(var25_38, var28);
            }
            var30 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var34), time_high.$internal_time_units_per_second$.getGlobalValue());
            var29 = Sequences.nreverse(module0018.$g732$.getDynamicValue(var28));
        }
        finally {
            module0018.$g732$.rebind(var33, var28);
            module0018.$g730$.rebind(var32, var28);
            module0018.$g731$.rebind(var31, var28);
        }
        return Values.values(var29, var30);
    }
    
    public static SubLObject f30150(final SubLObject var39) {
        final SubLThread var40 = SubLProcess.currentSubLThread();
        if (module0426.NIL != f30142() && module0426.NIL != constant_handles_oc.f8463(var39, (SubLObject)module0426.UNPROVIDED)) {
            final SubLObject var41 = (SubLObject)ConsesLow.cons(var39, (SubLObject)module0426.NIL);
            final SubLObject var42 = module0018.$g730$.getDynamicValue(var40);
            if (module0426.NIL != var42) {
                module0005.f188(var42, var41);
            }
            else {
                module0018.$g730$.setDynamicValue(var41, var40);
            }
            final SubLObject var43 = constants_high_oc.f10743(var39);
            final SubLObject var44 = constants_high_oc.f10757(var39);
            module0018.$g732$.setDynamicValue((SubLObject)ConsesLow.cons(f30116(var43, var44, (SubLObject)module0426.UNPROVIDED), module0018.$g732$.getDynamicValue(var40)), var40);
            return (SubLObject)module0426.T;
        }
        return (SubLObject)module0426.NIL;
    }
    
    public static SubLObject f30151(final SubLObject var10, final SubLObject var7, final SubLObject var11, final SubLObject var8, SubLObject var42) {
        final SubLThread var43 = SubLProcess.currentSubLThread();
        if (module0426.NIL == f30142() || module0426.NIL != f30143()) {
            return (SubLObject)module0426.NIL;
        }
        var42 = f30140(var42);
        final SubLObject var44 = module0131.$g1537$.getDynamicValue(var43);
        if (module0426.NIL != module0205.f13145((SubLObject)module0426.$ic12$, var10, (SubLObject)module0426.UNPROVIDED, (SubLObject)module0426.UNPROVIDED) || module0426.NIL != module0205.f13145((SubLObject)module0426.$ic12$, var7, (SubLObject)module0426.UNPROVIDED, (SubLObject)module0426.UNPROVIDED) || module0426.NIL != module0205.f13145((SubLObject)module0426.$ic12$, var42, (SubLObject)module0426.UNPROVIDED, (SubLObject)module0426.UNPROVIDED) || module0426.NIL != ((module0426.$ic13$ == var44) ? module0426.NIL : Sequences.find_if((SubLObject)module0426.$ic14$, var44, (SubLObject)module0426.UNPROVIDED, (SubLObject)module0426.UNPROVIDED, (SubLObject)module0426.UNPROVIDED))) {
            Errors.warn((SubLObject)module0426.$ic15$, new SubLObject[] { var10, var7, var42, module0131.$g1537$.getDynamicValue(var43) });
            return (SubLObject)module0426.NIL;
        }
        module0018.$g732$.setDynamicValue((SubLObject)ConsesLow.cons(f30118(var10, var7, var11, var8, var42, var44, (SubLObject)module0426.UNPROVIDED), module0018.$g732$.getDynamicValue(var43)), var43);
        return (SubLObject)module0426.T;
    }
    
    public static SubLObject f30152(final SubLObject var10, final SubLObject var7, SubLObject var14, SubLObject var43, final SubLObject var44) {
        final SubLThread var45 = SubLProcess.currentSubLThread();
        if (module0426.NIL != f30142() && module0426.NIL == f30143()) {
            var43 = f30140(var43);
            if (module0426.NIL != module0205.f13145((SubLObject)module0426.$ic12$, var10, (SubLObject)module0426.UNPROVIDED, (SubLObject)module0426.UNPROVIDED) || module0426.NIL != module0205.f13145((SubLObject)module0426.$ic12$, var7, (SubLObject)module0426.UNPROVIDED, (SubLObject)module0426.UNPROVIDED)) {
                Errors.warn((SubLObject)module0426.$ic16$, var10, var7);
                return (SubLObject)module0426.NIL;
            }
            if (module0426.NIL != conses_high.getf(var14, (SubLObject)module0426.$ic17$, (SubLObject)module0426.UNPROVIDED)) {
                Errors.warn((SubLObject)module0426.$ic18$, var10, var7, var14);
                var14 = conses_high.remf(conses_high.copy_list(var14), (SubLObject)module0426.$ic17$);
            }
            module0018.$g732$.setDynamicValue((SubLObject)ConsesLow.cons(f30119(var10, var7, var14, var43, var44, (SubLObject)module0426.UNPROVIDED), module0018.$g732$.getDynamicValue(var45)), var45);
        }
        return (SubLObject)module0426.NIL;
    }
    
    public static SubLObject f30153(final SubLObject var10, final SubLObject var7, final SubLObject var45) {
        if (module0426.NIL != f30142() && module0426.NIL == f30143()) {
            Errors.warn((SubLObject)module0426.$ic19$, var10, var7, var45);
            return (SubLObject)module0426.T;
        }
        return (SubLObject)module0426.NIL;
    }
    
    public static SubLObject f30154(final SubLObject var46, SubLObject var6, SubLObject var7, final SubLObject var8, final SubLObject var9) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        if (module0426.NIL != f30142() || module0426.NIL != f30155()) {
            var6 = f30140(var6);
            var7 = f30140(var7);
            if (module0426.$ic20$ == module0191.f11917(var46)) {
                if (module0426.NIL != f30155()) {
                    module0018.$g735$.setDynamicValue((SubLObject)ConsesLow.cons(f30117(var6, var7, var8, var9), module0018.$g735$.getDynamicValue(var47)), var47);
                }
                else {
                    module0018.$g733$.setDynamicValue((SubLObject)ConsesLow.cons(f30117(var6, var7, var8, var9), module0018.$g733$.getDynamicValue(var47)), var47);
                }
                return (SubLObject)module0426.T;
            }
        }
        return (SubLObject)module0426.NIL;
    }
    
    public static SubLObject f30156(final SubLObject var26) {
        return module0425.f30066(var26, module0426.$g3474$.getGlobalValue());
    }
    
    public static SubLObject f30157(final SubLObject var47, final SubLObject var48) {
        final SubLObject var50;
        final SubLObject var49 = var50 = var47.rest();
        SubLObject var51 = (SubLObject)module0426.NIL;
        SubLObject var52 = var50;
        SubLObject var53 = (SubLObject)module0426.NIL;
        SubLObject var54_55 = (SubLObject)module0426.NIL;
        while (module0426.NIL != var52) {
            cdestructuring_bind.destructuring_bind_must_consp(var52, var49, (SubLObject)module0426.$ic22$);
            var54_55 = var52.first();
            var52 = var52.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var52, var49, (SubLObject)module0426.$ic22$);
            if (module0426.NIL == conses_high.member(var54_55, (SubLObject)module0426.$ic23$, (SubLObject)module0426.UNPROVIDED, (SubLObject)module0426.UNPROVIDED)) {
                var53 = (SubLObject)module0426.T;
            }
            if (var54_55 == module0426.$ic24$) {
                var51 = var52.first();
            }
            var52 = var52.rest();
        }
        if (module0426.NIL != var53 && module0426.NIL == var51) {
            cdestructuring_bind.cdestructuring_bind_error(var49, (SubLObject)module0426.$ic22$);
        }
        final SubLObject var54 = cdestructuring_bind.property_list_member((SubLObject)module0426.$ic25$, var50);
        final SubLObject var55 = (SubLObject)((module0426.NIL != var54) ? conses_high.cadr(var54) : module0426.NIL);
        final SubLObject var56 = cdestructuring_bind.property_list_member((SubLObject)module0426.$ic26$, var50);
        final SubLObject var57 = (SubLObject)((module0426.NIL != var56) ? conses_high.cadr(var56) : module0426.NIL);
        final SubLObject var58 = cdestructuring_bind.property_list_member((SubLObject)module0426.$ic27$, var50);
        final SubLObject var59 = (SubLObject)((module0426.NIL != var58) ? conses_high.cadr(var58) : module0426.NIL);
        final SubLObject var60 = cdestructuring_bind.property_list_member((SubLObject)module0426.$ic28$, var50);
        final SubLObject var61 = (SubLObject)((module0426.NIL != var60) ? conses_high.cadr(var60) : module0426.NIL);
        final SubLObject var62 = cdestructuring_bind.property_list_member((SubLObject)module0426.$ic29$, var50);
        final SubLObject var63 = (SubLObject)((module0426.NIL != var62) ? conses_high.cadr(var62) : module0426.$ic30$);
        final SubLObject var64 = cdestructuring_bind.property_list_member((SubLObject)module0426.$ic31$, var50);
        final SubLObject var65 = (SubLObject)((module0426.NIL != var64) ? conses_high.cadr(var64) : module0426.$ic32$);
        final SubLObject var66 = cdestructuring_bind.property_list_member((SubLObject)module0426.$ic33$, var50);
        final SubLObject var67 = (SubLObject)((module0426.NIL != var66) ? conses_high.cadr(var66) : module0426.ZERO_INTEGER);
        final SubLObject var68 = cdestructuring_bind.property_list_member((SubLObject)module0426.$ic34$, var50);
        final SubLObject var69 = (SubLObject)((module0426.NIL != var68) ? conses_high.cadr(var68) : module0426.NIL);
        final SubLObject var70 = f30147(var55);
        final SubLObject var71 = f30156(var57);
        return (SubLObject)ConsesLow.list(new SubLObject[] { module0426.$ic35$, module0426.$ic36$, ConsesLow.list((SubLObject)module0426.$ic37$, var70), module0426.$ic38$, var71, module0426.$ic27$, var59, module0426.$ic39$, module0426.T, module0426.$ic28$, var61, module0426.$ic40$, var63, module0426.$ic31$, var65, module0426.$ic33$, var67, module0426.$ic34$, var69 });
    }
    
    public static SubLObject f30155() {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        return module0018.$g736$.getDynamicValue(var20);
    }
    
    public static SubLObject f30158(final SubLObject var29, SubLObject var65, SubLObject var67, SubLObject var63, SubLObject var73, SubLObject var74, SubLObject var75) {
        if (var65 == module0426.UNPROVIDED) {
            var65 = (SubLObject)module0426.NIL;
        }
        if (var67 == module0426.UNPROVIDED) {
            var67 = (SubLObject)module0426.$ic41$;
        }
        if (var63 == module0426.UNPROVIDED) {
            var63 = (SubLObject)module0426.NIL;
        }
        if (var73 == module0426.UNPROVIDED) {
            var73 = (SubLObject)module0426.NIL;
        }
        if (var74 == module0426.UNPROVIDED) {
            var74 = (SubLObject)module0426.ZERO_INTEGER;
        }
        if (var75 == module0426.UNPROVIDED) {
            var75 = (SubLObject)module0426.NIL;
        }
        SubLObject var76 = (SubLObject)module0426.ZERO_INTEGER;
        final SubLObject var77 = (SubLObject)module0426.NIL;
        SubLObject var78 = (SubLObject)module0426.NIL;
        SubLObject var79 = (SubLObject)module0426.NIL;
        SubLObject var80 = (SubLObject)module0426.NIL;
        var78 = var29;
        var79 = var78.first();
        for (var80 = (SubLObject)module0426.ZERO_INTEGER; module0426.NIL != var78; var78 = var78.rest(), var79 = var78.first(), var80 = Numbers.add((SubLObject)module0426.ONE_INTEGER, var80)) {
            if (var80.numGE(var74) && (module0426.NIL == var75 || var80.numLE(var75))) {
                final SubLObject var81 = f30159(var79, var65, var67, var63, var73);
                var76 = Numbers.add(var76, (SubLObject)module0426.ONE_INTEGER);
            }
        }
        return Values.values(var77, var76);
    }
    
    public static SubLObject f30159(final SubLObject var2, SubLObject var65, SubLObject var67, SubLObject var63, SubLObject var73) {
        if (var65 == module0426.UNPROVIDED) {
            var65 = (SubLObject)module0426.NIL;
        }
        if (var67 == module0426.UNPROVIDED) {
            var67 = (SubLObject)module0426.$ic41$;
        }
        if (var63 == module0426.UNPROVIDED) {
            var63 = (SubLObject)module0426.NIL;
        }
        if (var73 == module0426.UNPROVIDED) {
            var73 = (SubLObject)module0426.NIL;
        }
        return module0424.f29713(var2, var65, var67, var63, var73);
    }
    
    public static SubLObject f30160(final SubLObject var29) {
        SubLObject var30 = (SubLObject)module0426.ZERO_INTEGER;
        SubLObject var31 = var29;
        SubLObject var32 = (SubLObject)module0426.NIL;
        var32 = var31.first();
        while (module0426.NIL != var31) {
            if (module0426.NIL != f30112(var32)) {
                if (module0426.NIL != f30161(var32)) {
                    var30 = Numbers.add(var30, (SubLObject)module0426.ONE_INTEGER);
                }
                else {
                    Errors.warn((SubLObject)module0426.$ic42$, var32);
                }
            }
            var31 = var31.rest();
            var32 = var31.first();
        }
        return var30;
    }
    
    public static SubLObject f30162(final SubLObject var2) {
        final SubLObject var3 = f30111(var2);
        if (var3.eql((SubLObject)module0426.$ic1$)) {
            return f30161(var2);
        }
        if (var3.eql((SubLObject)module0426.$ic2$)) {
            return f30163(var2);
        }
        return Errors.error((SubLObject)module0426.$ic43$, f30111(var2));
    }
    
    public static SubLObject f30164(final SubLObject var29) {
        SubLObject var30 = (SubLObject)module0426.ZERO_INTEGER;
        SubLObject var31 = var29;
        SubLObject var32 = (SubLObject)module0426.NIL;
        var32 = var31.first();
        while (module0426.NIL != var31) {
            if (module0426.$ic1$ == f30111(var32)) {
                final SubLObject var33 = f30121(var32);
                if (module0426.NIL != constants_high_oc.f10734(var33)) {
                    final SubLObject var34 = constants_high_oc.f10751(var33);
                    if (module0426.NIL != constant_handles_oc.f8449(var34)) {
                        module0540.f33510(var34);
                        var30 = Numbers.add(var30, (SubLObject)module0426.ONE_INTEGER);
                    }
                }
            }
            var31 = var31.rest();
            var32 = var31.first();
        }
        return var30;
    }
    
    public static SubLObject f30161(final SubLObject var2) {
        assert module0426.NIL != f30112(var2) : var2;
        final SubLObject var3 = f30120(var2);
        final SubLObject var4 = f30121(var2);
        final SubLObject var5 = module0540.f33505(var3, var4);
        return Values.values(var5, (SubLObject)module0426.$ic44$, (SubLObject)module0426.NIL, (SubLObject)module0426.NIL);
    }
    
    public static SubLObject f30163(SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        assert module0426.NIL != f30113(var2) : var2;
        var2 = f30165(var2);
        final SubLObject var4 = f30123(var2);
        final SubLObject var5 = f30124(var2);
        final SubLObject var6 = f30125(var2);
        final SubLObject var7 = f30126(var2);
        final SubLObject var8 = f30128(var2);
        SubLObject var9 = (SubLObject)module0426.NIL;
        final SubLObject var10 = module0018.$g736$.currentBinding(var3);
        final SubLObject var11 = module0018.$g735$.currentBinding(var3);
        try {
            module0018.$g736$.bind((SubLObject)module0426.T, var3);
            module0018.$g735$.bind((SubLObject)module0426.NIL, var3);
            final SubLObject var25_81 = module0131.$g1537$.currentBinding(var3);
            try {
                module0131.$g1537$.bind(var8, var3);
                module0540.f33516(var4, var5, (SubLObject)ConsesLow.list((SubLObject)module0426.$ic45$, var6, (SubLObject)module0426.$ic46$, var7));
            }
            finally {
                module0131.$g1537$.rebind(var25_81, var3);
            }
            var9 = module0018.$g735$.getDynamicValue(var3);
        }
        finally {
            module0018.$g735$.rebind(var11, var3);
            module0018.$g736$.rebind(var10, var3);
        }
        return Values.values(var9, (SubLObject)module0426.$ic44$, (SubLObject)module0426.NIL, (SubLObject)module0426.NIL);
    }
    
    public static SubLObject f30165(SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var2;
        SubLObject var5 = (SubLObject)module0426.NIL;
        SubLObject var6 = (SubLObject)module0426.NIL;
        SubLObject var7 = (SubLObject)module0426.NIL;
        SubLObject var8 = (SubLObject)module0426.NIL;
        SubLObject var9 = (SubLObject)module0426.NIL;
        SubLObject var10 = (SubLObject)module0426.NIL;
        SubLObject var11 = (SubLObject)module0426.NIL;
        SubLObject var12 = (SubLObject)module0426.NIL;
        SubLObject var13 = (SubLObject)module0426.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0426.$ic47$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0426.$ic47$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0426.$ic47$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0426.$ic47$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0426.$ic47$);
        var9 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0426.$ic47$);
        var10 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0426.$ic47$);
        var11 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0426.$ic47$);
        var12 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0426.$ic47$);
        var13 = var4.first();
        var4 = var4.rest();
        if (module0426.NIL == var4) {
            if (module0426.NIL != module0035.f2428(constants_high_oc.f10757(module0426.$ic48$), var7, Symbols.symbol_function((SubLObject)module0426.EQUALP), (SubLObject)module0426.UNPROVIDED)) {
                final SubLObject var14 = module0571.f34996(var7);
                if (module0426.NIL != module0202.f12589(var14, module0426.$ic48$)) {
                    final SubLObject var15 = module0205.f13203(var14, (SubLObject)module0426.UNPROVIDED);
                    if (module0426.NIL != module0035.f1998(var15) && module0426.$ic49$.equal(var15.first())) {
                        final SubLObject var16 = conses_high.second(var15);
                        var7 = module0202.f12817((SubLObject)module0426.ONE_INTEGER, var16, var7);
                        var2 = f30118(var7, var8, var9, var10, var11, var12, var13);
                    }
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0426.$ic47$);
        }
        return var2;
    }
    
    public static SubLObject f30166(final SubLObject var89) {
        return var89;
    }
    
    public static SubLObject f30167(final SubLObject var2, SubLObject var43, SubLObject var44) {
        if (var44 == module0426.UNPROVIDED) {
            var44 = (SubLObject)module0426.NIL;
        }
        var43 = f30140(var43);
        final SubLObject var45 = f30111(var2);
        if (var45.eql((SubLObject)module0426.$ic1$)) {
            return f30168(var2, var43);
        }
        if (var45.eql((SubLObject)module0426.$ic2$)) {
            return f30169(var2, var43);
        }
        if (var45.eql((SubLObject)module0426.$ic3$)) {
            return f30170(var2, var43, var44);
        }
        return Errors.error((SubLObject)module0426.$ic50$, f30111(var2));
    }
    
    public static SubLObject f30168(final SubLObject var2, final SubLObject var43) {
        return module0035.sublisp_boolean(var43);
    }
    
    public static SubLObject f30169(final SubLObject var2, final SubLObject var42) {
        assert module0426.NIL != Types.listp(var42) : var42;
        final SubLObject var43 = f30127(var2);
        final SubLObject var44 = module0035.f2201(var42, var43, Symbols.symbol_function((SubLObject)module0426.EQUALP));
        return var44;
    }
    
    public static SubLObject f30170(final SubLObject var2, final SubLObject var43, SubLObject var44) {
        if (var44 == module0426.UNPROVIDED) {
            var44 = (SubLObject)module0426.NIL;
        }
        final SubLObject var45 = f30133(var2);
        final SubLObject var46 = f30134(var2);
        final SubLObject var47 = f30171(var43, var45);
        final SubLObject var48 = (SubLObject)SubLObjectFactory.makeBoolean(module0426.NIL == var44 || var44.equal(var46));
        final SubLObject var49 = (SubLObject)SubLObjectFactory.makeBoolean(module0426.NIL != var47 && module0426.NIL != var48);
        if (module0426.NIL == var47) {
            PrintLow.format((SubLObject)module0426.T, (SubLObject)module0426.$ic52$, var43, var45);
        }
        if (module0426.NIL == var48) {
            PrintLow.format((SubLObject)module0426.T, (SubLObject)module0426.$ic52$, var44, var46);
        }
        return var49;
    }
    
    public static SubLObject f30171(final SubLObject var43, final SubLObject var15) {
        if (module0426.NIL != module0233.f15352(var43)) {
            return module0233.f15365(var43, var15);
        }
        return module0035.f2210(var43, var15);
    }
    
    public static SubLObject f30172(final SubLObject var26) {
        final SubLObject var27 = f30156(var26);
        return module0424.f29818(var27);
    }
    
    public static SubLObject f30173(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0426.NIL != module0424.f29703(var1) && module0426.NIL != f30110(module0424.f29669(module0424.f29708(var1).first())));
    }
    
    public static SubLObject f30174(final SubLObject var94) {
        final SubLThread var95 = SubLProcess.currentSubLThread();
        var95.resetMultipleValues();
        final SubLObject var96 = f30175(var94);
        final SubLObject var97 = var95.secondMultipleValue();
        final SubLObject var98 = var95.thirdMultipleValue();
        final SubLObject var99 = var95.fourthMultipleValue();
        var95.resetMultipleValues();
        return (SubLObject)ConsesLow.list((SubLObject)module0426.$ic53$, Sequences.length(var96), (SubLObject)module0426.$ic54$, Sequences.length(var97), (SubLObject)module0426.$ic55$, Sequences.length(var98), (SubLObject)module0426.$ic56$, Sequences.length(var99));
    }
    
    public static SubLObject f30176(final SubLObject var99, final SubLObject var100) {
        SubLObject var101 = (SubLObject)module0426.NIL;
        SubLObject var102 = module0424.f30016(var99, var100);
        SubLObject var103 = (SubLObject)module0426.NIL;
        var103 = var102.first();
        while (module0426.NIL != var102) {
            final SubLObject var104 = conses_high.getf(var103, (SubLObject)module0426.$ic57$, (SubLObject)module0426.UNPROVIDED);
            final SubLObject var105 = module0424.f29821(var99, var104);
            final SubLObject var106 = module0424.f29630(module0424.f29670(var105));
            final SubLObject var107 = module0424.f29821(var100, var104);
            final SubLObject var108 = module0424.f29630(module0424.f29670(var107));
            var101 = (SubLObject)ConsesLow.cons(f30177(var106, var108), var101);
            var102 = var102.rest();
            var103 = var102.first();
        }
        return Sequences.nreverse(var101);
    }
    
    public static SubLObject f30175(final SubLObject var94) {
        SubLObject var95 = (SubLObject)module0426.NIL;
        SubLObject var96 = (SubLObject)module0426.NIL;
        SubLObject var97 = (SubLObject)module0426.NIL;
        SubLObject var98 = (SubLObject)module0426.NIL;
        SubLObject var100;
        final SubLObject var99 = var100 = module0424.f29708(module0424.f29810(var94));
        SubLObject var101 = (SubLObject)module0426.NIL;
        var101 = var100.first();
        while (module0426.NIL != var100) {
            if (module0426.NIL != f30113(module0424.f29669(var101))) {
                final SubLObject var102 = f30178(var101);
                if (var102.eql((SubLObject)module0426.$ic53$)) {
                    var95 = (SubLObject)ConsesLow.cons(var101, var95);
                }
                else if (var102.eql((SubLObject)module0426.$ic54$)) {
                    var96 = (SubLObject)ConsesLow.cons(var101, var96);
                }
                else if (var102.eql((SubLObject)module0426.$ic55$)) {
                    var97 = (SubLObject)ConsesLow.cons(var101, var97);
                }
                else if (var102.eql((SubLObject)module0426.$ic56$)) {
                    var98 = (SubLObject)ConsesLow.cons(var101, var98);
                }
            }
            var100 = var100.rest();
            var101 = var100.first();
        }
        return Values.values(var95, var96, var97, var98);
    }
    
    public static SubLObject f30178(final SubLObject var109) {
        final SubLObject var110 = module0424.f29669(var109);
        final SubLObject var111 = f30127(var110);
        final SubLObject var112 = module0424.f29670(var109);
        final SubLObject var113 = module0424.f29630(var112);
        return f30177(var111, var113);
    }
    
    public static SubLObject f30177(final SubLObject var112, final SubLObject var113) {
        if (module0426.NIL != module0035.f2201(var112, var113, Symbols.symbol_function((SubLObject)module0426.EQUALP))) {
            return (SubLObject)module0426.$ic54$;
        }
        if (module0426.NIL != conses_high.subsetp(var112, var113, Symbols.symbol_function((SubLObject)module0426.EQUALP), (SubLObject)module0426.UNPROVIDED)) {
            return (SubLObject)module0426.$ic53$;
        }
        if (module0426.NIL != conses_high.subsetp(var113, var112, Symbols.symbol_function((SubLObject)module0426.EQUALP), (SubLObject)module0426.UNPROVIDED)) {
            return (SubLObject)module0426.$ic55$;
        }
        return (SubLObject)module0426.$ic56$;
    }
    
    public static SubLObject f30179(final SubLObject var94) {
        return module0424.f29809(var94, (SubLObject)module0426.$ic59$, (SubLObject)module0426.$ic60$, (SubLObject)module0426.UNPROVIDED);
    }
    
    public static SubLObject f30180(final SubLObject var109) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0426.NIL == module0035.f2439((SubLObject)module0426.$ic61$, var109, (SubLObject)module0426.UNPROVIDED));
    }
    
    public static SubLObject f30181(final SubLObject var94) {
        return f30182(var94, (SubLObject)module0426.$ic53$);
    }
    
    public static SubLObject f30183(final SubLObject var94) {
        return f30182(var94, (SubLObject)module0426.$ic54$);
    }
    
    public static SubLObject f30184(final SubLObject var94) {
        return f30182(var94, (SubLObject)module0426.$ic55$);
    }
    
    public static SubLObject f30185(final SubLObject var94) {
        return f30182(var94, (SubLObject)module0426.$ic56$);
    }
    
    public static SubLObject f30182(final SubLObject var94, final SubLObject var114) {
        SubLObject var115 = (SubLObject)module0426.NIL;
        SubLObject var117;
        final SubLObject var116 = var117 = module0424.f29708(var94);
        SubLObject var118 = (SubLObject)module0426.NIL;
        var118 = var117.first();
        while (module0426.NIL != var117) {
            if (module0426.$ic62$ == module0424.f29671(var118) && module0426.NIL != f30113(module0424.f29669(var118)) && var114.eql(f30178(var118))) {
                var115 = (SubLObject)ConsesLow.cons(var118, var115);
            }
            var117 = var117.rest();
            var118 = var117.first();
        }
        return Sequences.nreverse(var115);
    }
    
    public static SubLObject f30186(final SubLObject var116, final SubLObject var117) {
        return f30187(var116, var117, (SubLObject)module0426.$ic63$, (SubLObject)module0426.NIL);
    }
    
    public static SubLObject f30188(final SubLObject var116, final SubLObject var117) {
        return f30187(var116, var117, (SubLObject)module0426.$ic64$, (SubLObject)module0426.T);
    }
    
    public static SubLObject f30187(final SubLObject var116, final SubLObject var117, final SubLObject var118, final SubLObject var119) {
        SubLObject var120 = (SubLObject)module0426.NIL;
        SubLObject var122;
        final SubLObject var121 = var122 = f30189(var116, var117, var118);
        SubLObject var123 = (SubLObject)module0426.NIL;
        var123 = var122.first();
        while (module0426.NIL != var122) {
            final SubLObject var124 = module0424.f29821((module0426.NIL != var119) ? var116 : var117, var123);
            var120 = (SubLObject)ConsesLow.cons(var124, var120);
            var122 = var122.rest();
            var123 = var122.first();
        }
        return Sequences.nreverse(var120);
    }
    
    public static SubLObject f30189(final SubLObject var116, final SubLObject var117, final SubLObject var118) {
        SubLObject var119 = (SubLObject)module0426.NIL;
        SubLObject var121;
        final SubLObject var120 = var121 = module0424.f30016(var116, var117);
        SubLObject var122 = (SubLObject)module0426.NIL;
        var122 = var121.first();
        while (module0426.NIL != var121) {
            if (var118.eql(conses_high.getf(var122, (SubLObject)module0426.$ic65$, (SubLObject)module0426.UNPROVIDED))) {
                final SubLObject var123 = conses_high.getf(var122, (SubLObject)module0426.$ic57$, (SubLObject)module0426.UNPROVIDED);
                var119 = (SubLObject)ConsesLow.cons(var123, var119);
            }
            var121 = var121.rest();
            var122 = var121.first();
        }
        return Sequences.nreverse(var119);
    }
    
    public static SubLObject f30190(final SubLObject var116, final SubLObject var117) {
        SubLObject var118 = (SubLObject)module0426.NIL;
        SubLObject var119 = (SubLObject)module0426.NIL;
        SubLObject var122_123 = (SubLObject)module0426.NIL;
        SubLObject var120 = (SubLObject)module0426.NIL;
        SubLObject var125_126 = (SubLObject)module0426.NIL;
        var119 = module0424.f29708(var116);
        var122_123 = var119.first();
        var120 = module0424.f29708(var117);
        var125_126 = var120.first();
        while (module0426.NIL != var120 || module0426.NIL != var119) {
            final SubLObject var121 = module0424.f29669(var122_123);
            if (module0426.NIL != var122_123 && module0426.NIL != var125_126) {
                final SubLObject var122 = module0424.f30017(var122_123, var125_126);
                if (module0426.NIL != var122) {
                    var118 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0426.$ic57$, var121, (SubLObject)module0426.$ic65$, var122), var118);
                }
            }
            var119 = var119.rest();
            var122_123 = var119.first();
            var120 = var120.rest();
            var125_126 = var120.first();
        }
        var118 = Sequences.nreverse(var118);
        return var118;
    }
    
    public static SubLObject f30191() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30110", "S#32652", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30111", "S#33331", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30112", "S#33332", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30113", "S#33333", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30114", "S#32658", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30115", "S#32656", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30116", "S#33334", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30117", "S#33335", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30118", "S#33336", 6, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30119", "S#33337", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30120", "S#33338", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30121", "S#33339", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30122", "S#33340", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30123", "S#33341", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30124", "S#33342", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30125", "S#33343", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30126", "S#33344", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30127", "S#33345", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30128", "S#33346", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30129", "S#33347", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30130", "S#33348", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30131", "S#33349", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30132", "S#33350", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30133", "S#33351", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30134", "S#33352", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30135", "S#33353", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30136", "S#33354", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30137", "S#33355", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30138", "S#33356", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30139", "S#33357", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30140", "S#33358", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30141", "S#33359", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30142", "S#33360", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30143", "S#33361", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30144", "S#33362", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30145", "S#33363", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30147", "S#33364", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30148", "S#33365", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30149", "S#33366", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30146", "S#33367", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30150", "S#33368", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30151", "S#33369", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30152", "S#31620", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30153", "S#31622", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30154", "S#14909", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30156", "S#33370", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0426", "f30157", "S#33371");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30155", "S#33372", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30158", "S#33373", 1, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30159", "S#33374", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30160", "S#33375", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30162", "S#32657", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30164", "S#33376", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30161", "S#33377", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30163", "S#33378", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30165", "S#33379", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30166", "S#32660", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30167", "S#32775", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30168", "S#33380", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30169", "S#33381", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30170", "S#33382", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30171", "S#33383", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30172", "S#33384", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30173", "S#32788", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30174", "S#33385", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30176", "S#33386", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30175", "S#33387", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30178", "S#33388", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30177", "S#33389", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30179", "S#33390", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30180", "S#33391", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30181", "S#33392", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30183", "S#33393", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30184", "S#33394", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30185", "S#33395", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30182", "S#33396", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30186", "S#33397", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30188", "S#33398", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30187", "S#33399", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30189", "S#33400", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0426", "f30190", "S#32789", 2, 0, false);
        return (SubLObject)module0426.NIL;
    }
    
    public static SubLObject f30192() {
        module0426.$g3473$ = SubLFiles.deflexical("S#33401", (SubLObject)module0426.$ic9$);
        module0426.$g3474$ = SubLFiles.deflexical("S#33402", (SubLObject)module0426.$ic21$);
        return (SubLObject)module0426.NIL;
    }
    
    public static SubLObject f30193() {
        module0012.f419((SubLObject)module0426.$ic58$);
        return (SubLObject)module0426.NIL;
    }
    
    public void declareFunctions() {
        f30191();
    }
    
    public void initializeVariables() {
        f30192();
    }
    
    public void runTopLevelForms() {
        f30193();
    }
    
    static {
        me = (SubLFile)new module0426();
        module0426.$g3473$ = null;
        module0426.$g3474$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("JANUS-OP");
        $ic1$ = SubLObjectFactory.makeKeyword("CREATE");
        $ic2$ = SubLObjectFactory.makeKeyword("ASSERT");
        $ic3$ = SubLObjectFactory.makeKeyword("QUERY");
        $ic4$ = SubLObjectFactory.makeSymbol("S#33332", "CYC");
        $ic5$ = SubLObjectFactory.makeSymbol("S#33333", "CYC");
        $ic6$ = SubLObjectFactory.makeSymbol("S#32658", "CYC");
        $ic7$ = SubLObjectFactory.makeKeyword("CONST");
        $ic8$ = SubLObjectFactory.makeSymbol("ASSERTION-IST-FORMULA");
        $ic9$ = SubLObjectFactory.makeString("/cyc/projects/inference/janus/transcripts/");
        $ic10$ = SubLObjectFactory.makeSymbol("S#6802", "CYC");
        $ic11$ = SubLObjectFactory.makeString("~s appears more than once, in positions ~s.");
        $ic12$ = SubLObjectFactory.makeSymbol("S#2609", "CYC");
        $ic13$ = SubLObjectFactory.makeKeyword("ALL");
        $ic14$ = SubLObjectFactory.makeSymbol("S#14109", "CYC");
        $ic15$ = SubLObjectFactory.makeString("invalid term in assert op: ~s ~s ~s");
        $ic16$ = SubLObjectFactory.makeString("invalid constant in query op: ~s ~s");
        $ic17$ = SubLObjectFactory.makeKeyword("PROBLEM-STORE");
        $ic18$ = SubLObjectFactory.makeString("ignoring problem store reuse for query ~s ~s ~s");
        $ic19$ = SubLObjectFactory.makeString("NEW-CONTINUABLE-INFERENCE: ~s ~s ~s~%");
        $ic20$ = SubLObjectFactory.makeKeyword("DEDUCTION");
        $ic21$ = SubLObjectFactory.makeString("/cyc/projects/inference/janus/experiments/");
        $ic22$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("S#33403", "CYC"), SubLObjectFactory.makeSymbol("S#33404", "CYC"), SubLObjectFactory.makeSymbol("COMMENT"), SubLObjectFactory.makeSymbol("S#33246", "CYC"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#7998", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#26499", "CYC")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#33247", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#33329", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1545", "CYC"), (SubLObject)module0426.ZERO_INTEGER), SubLObjectFactory.makeSymbol("COUNT") });
        $ic23$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TRANSCRIPT-FILENAME"), (SubLObject)SubLObjectFactory.makeKeyword("EXPERIMENT-FILENAME"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeKeyword("OVERRIDING-QUERY-PROPERTIES"), (SubLObject)SubLObjectFactory.makeKeyword("METRICS"), (SubLObject)SubLObjectFactory.makeKeyword("OUTLIER-TIMEOUT"), (SubLObject)SubLObjectFactory.makeKeyword("SKIP"), (SubLObject)SubLObjectFactory.makeKeyword("COUNT"));
        $ic24$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic25$ = SubLObjectFactory.makeKeyword("TRANSCRIPT-FILENAME");
        $ic26$ = SubLObjectFactory.makeKeyword("EXPERIMENT-FILENAME");
        $ic27$ = SubLObjectFactory.makeKeyword("COMMENT");
        $ic28$ = SubLObjectFactory.makeKeyword("OVERRIDING-QUERY-PROPERTIES");
        $ic29$ = SubLObjectFactory.makeKeyword("METRICS");
        $ic30$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#26499", "CYC"));
        $ic31$ = SubLObjectFactory.makeKeyword("OUTLIER-TIMEOUT");
        $ic32$ = SubLObjectFactory.makeSymbol("S#33329", "CYC");
        $ic33$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic34$ = SubLObjectFactory.makeKeyword("COUNT");
        $ic35$ = SubLObjectFactory.makeSymbol("S#32938", "CYC");
        $ic36$ = SubLObjectFactory.makeKeyword("TEST-SPEC-SET");
        $ic37$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic38$ = SubLObjectFactory.makeKeyword("FILENAME");
        $ic39$ = SubLObjectFactory.makeKeyword("INCREMENTAL");
        $ic40$ = SubLObjectFactory.makeKeyword("OVERRIDING-METRICS");
        $ic41$ = SubLObjectFactory.makeInteger(600);
        $ic42$ = SubLObjectFactory.makeString("Execution of Janus operation ~s failed.");
        $ic43$ = SubLObjectFactory.makeString("unknown modification operation type ~s");
        $ic44$ = SubLObjectFactory.makeKeyword("NOT-A-QUERY");
        $ic45$ = SubLObjectFactory.makeKeyword("STRENGTH");
        $ic46$ = SubLObjectFactory.makeKeyword("DIRECTION");
        $ic47$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#32753", "CYC"), SubLObjectFactory.makeSymbol("TYPE"), SubLObjectFactory.makeSymbol("S#14349", "CYC"), SubLObjectFactory.makeSymbol("S#11445", "CYC"), SubLObjectFactory.makeSymbol("S#13918", "CYC"), SubLObjectFactory.makeSymbol("S#5432", "CYC"), SubLObjectFactory.makeSymbol("S#33405", "CYC"), SubLObjectFactory.makeSymbol("S#28783", "CYC"), SubLObjectFactory.makeSymbol("S#150", "CYC") });
        $ic48$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("termOfUnit"));
        $ic49$ = SubLObjectFactory.makeKeyword("NAT");
        $ic50$ = SubLObjectFactory.makeString("Janus operation of unexpected type ~s");
        $ic51$ = SubLObjectFactory.makeSymbol("LISTP");
        $ic52$ = SubLObjectFactory.makeString("~s != ~s~%");
        $ic53$ = SubLObjectFactory.makeKeyword("MORE-COMPLETE");
        $ic54$ = SubLObjectFactory.makeKeyword("EQUALLY-COMPLETE");
        $ic55$ = SubLObjectFactory.makeKeyword("LESS-COMPLETE");
        $ic56$ = SubLObjectFactory.makeKeyword("DIFFERENT");
        $ic57$ = SubLObjectFactory.makeKeyword("TEST");
        $ic58$ = SubLObjectFactory.makeSymbol("S#33389", "CYC");
        $ic59$ = SubLObjectFactory.makeString("filtered to exclude invalid forts");
        $ic60$ = SubLObjectFactory.makeSymbol("S#33391", "CYC");
        $ic61$ = SubLObjectFactory.makeSymbol("S#14187", "CYC");
        $ic62$ = SubLObjectFactory.makeKeyword("FAILURE");
        $ic63$ = SubLObjectFactory.makeKeyword("BECAME-FAILURE");
        $ic64$ = SubLObjectFactory.makeKeyword("BECAME-SUCCESS");
        $ic65$ = SubLObjectFactory.makeKeyword("CHANGE");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0426.class
	Total time: 278 ms
	
	Decompiled with Procyon 0.5.32.
*/