package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0814 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0814";
    public static final String myFingerPrint = "729311b8ee610dc53440994eeea119e8bc531df87ae40243b650225b0ad95a56";
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
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
    private static final SubLList $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
    private static final SubLList $ic18$;
    private static final SubLList $ic19$;
    private static final SubLList $ic20$;
    private static final SubLList $ic21$;
    private static final SubLList $ic22$;
    private static final SubLList $ic23$;
    private static final SubLList $ic24$;
    private static final SubLList $ic25$;
    private static final SubLList $ic26$;
    private static final SubLList $ic27$;
    private static final SubLList $ic28$;
    private static final SubLList $ic29$;
    private static final SubLList $ic30$;
    private static final SubLList $ic31$;
    private static final SubLList $ic32$;
    private static final SubLList $ic33$;
    private static final SubLList $ic34$;
    private static final SubLList $ic35$;
    private static final SubLList $ic36$;
    private static final SubLList $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLList $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLList $ic42$;
    private static final SubLList $ic43$;
    private static final SubLList $ic44$;
    private static final SubLList $ic45$;
    private static final SubLList $ic46$;
    
    public static SubLObject f52163(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0814.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0814.$ic0$);
        var3 = var1.first();
        final SubLObject var5;
        final SubLObject var4 = var5 = var1.rest();
        if (var3 == module0814.$ic1$) {
            return f52164(var1);
        }
        if (var3 == module0814.$ic2$) {
            return f52165(var1);
        }
        if (var3 == module0814.$ic3$) {
            return f52166(var1);
        }
        if (var3 == module0814.$ic4$) {
            return f52167(var1);
        }
        if (var3 == module0814.$ic5$) {
            return f52168(var1);
        }
        if (var3 == module0814.$ic6$) {
            return f52169(var1);
        }
        if (var3 == module0814.$ic7$) {
            return f52170(var1);
        }
        if (var3 == module0814.$ic8$) {
            return f52171(var1);
        }
        if (var3 == module0814.$ic9$) {
            return f52172(var1);
        }
        if (var3 == module0814.$ic10$) {
            return f52173(var1);
        }
        if (var3 == module0814.$ic11$) {
            return f52174(var1);
        }
        if (var3 == module0814.$ic12$) {
            return f52175(var1);
        }
        if (var3 == module0814.$ic13$) {
            return f52176(var1);
        }
        if (var3 == module0814.$ic14$) {
            return f52177(var1);
        }
        return var1;
    }
    
    public static SubLObject f52178(final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        var8.resetMultipleValues();
        SubLObject var9 = f52179(var7);
        final SubLObject var10 = var8.secondMultipleValue();
        SubLObject var11 = var8.thirdMultipleValue();
        var8.resetMultipleValues();
        if (module0814.NIL != var10) {
            SubLObject var13;
            final SubLObject var12 = var13 = var10;
            SubLObject var14 = (SubLObject)module0814.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0814.$ic15$);
            var14 = var13.first();
            final SubLObject var15;
            var13 = (var15 = var13.rest());
            module0035.f2502(var14, (SubLObject)module0814.$ic1$);
            return f52178(ConsesLow.append(var9, var15, var11, (SubLObject)module0814.NIL));
        }
        var8.resetMultipleValues();
        var9 = f52180(var7);
        final SubLObject var16 = var8.secondMultipleValue();
        var11 = var8.thirdMultipleValue();
        var8.resetMultipleValues();
        if (module0814.NIL != var16 && module0814.NIL != var11) {
            return f52178(ConsesLow.append(var9, (SubLObject)ConsesLow.list(var16)));
        }
        return var7;
    }
    
    public static SubLObject f52179(final SubLObject var15) {
        SubLObject var16;
        SubLObject var17;
        for (var16 = (SubLObject)module0814.NIL, var16 = var15; !var16.isAtom(); var16 = var16.rest()) {
            var17 = var16.first();
            if (module0814.NIL != module0035.f2501(var17, (SubLObject)module0814.$ic1$)) {
                return Values.values(conses_high.ldiff(var15, var16), var17, var16.rest());
            }
        }
        return Values.values((SubLObject)module0814.NIL, (SubLObject)module0814.NIL, (SubLObject)module0814.NIL);
    }
    
    public static SubLObject f52180(final SubLObject var15) {
        SubLObject var16;
        SubLObject var17;
        for (var16 = (SubLObject)module0814.NIL, var16 = var15; !var16.isAtom(); var16 = var16.rest()) {
            var17 = var16.first();
            if (module0814.NIL != module0035.f2501(var17, (SubLObject)module0814.$ic16$)) {
                return Values.values(conses_high.ldiff(var15, var16), var17, var16.rest());
            }
        }
        return Values.values((SubLObject)module0814.NIL, (SubLObject)module0814.NIL, (SubLObject)module0814.NIL);
    }
    
    public static SubLObject f52164(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0814.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0814.$ic17$);
        var2 = var1.first();
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        module0035.f2502(var2, (SubLObject)module0814.$ic1$);
        var4 = f52178(var4);
        if (module0814.NIL != var4) {
            if (module0814.NIL != module0035.f1997(var4)) {
                final SubLObject var5 = var4.first();
                return f52163(var5);
            }
            SubLObject var22_23;
            final SubLObject var20_21 = var22_23 = var4;
            SubLObject var6 = (SubLObject)module0814.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var22_23, var20_21, (SubLObject)module0814.$ic18$);
            var6 = var22_23.first();
            final SubLObject var7;
            var22_23 = (var7 = var22_23.rest());
            if (module0814.NIL != module0035.f2501(var6, (SubLObject)module0814.$ic2$)) {
                SubLObject var27_28;
                final SubLObject var25_26 = var27_28 = var6;
                SubLObject var5_29 = (SubLObject)module0814.NIL;
                SubLObject var8 = (SubLObject)module0814.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var27_28, var25_26, (SubLObject)module0814.$ic19$);
                var5_29 = var27_28.first();
                var27_28 = var27_28.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var27_28, var25_26, (SubLObject)module0814.$ic19$);
                var8 = var27_28.first();
                final SubLObject var9;
                var27_28 = (var9 = var27_28.rest());
                module0035.f2502(var5_29, (SubLObject)module0814.$ic2$);
                if (module0814.NIL != f52181(var7, var8) && module0814.NIL != f52182(var7)) {
                    return f52165((SubLObject)ConsesLow.listS((SubLObject)module0814.$ic2$, var8, ConsesLow.append(var9, var7, (SubLObject)module0814.NIL)));
                }
            }
        }
        return reader.bq_cons((SubLObject)module0814.$ic1$, ConsesLow.append(var4, (SubLObject)module0814.NIL));
    }
    
    public static SubLObject f52181(final SubLObject var7, final SubLObject var30) {
        SubLObject var31 = var30;
        SubLObject var32 = (SubLObject)module0814.NIL;
        var32 = var31.first();
        while (module0814.NIL != var31) {
            final SubLObject var33 = var32.first();
            if (module0814.NIL != module0035.f2434(var33, var7)) {
                return (SubLObject)module0814.NIL;
            }
            var31 = var31.rest();
            var32 = var31.first();
        }
        return (SubLObject)module0814.T;
    }
    
    public static SubLObject f52182(final SubLObject var7) {
        SubLObject var8 = var7;
        SubLObject var9 = (SubLObject)module0814.NIL;
        var9 = var8.first();
        while (module0814.NIL != var8) {
            if (module0814.NIL != f52183(var9)) {
                return (SubLObject)module0814.NIL;
            }
            var8 = var8.rest();
            var9 = var8.first();
        }
        return (SubLObject)module0814.T;
    }
    
    public static SubLObject f52183(final SubLObject var1) {
        if (var1.isCons()) {
            final SubLObject var2 = var1.first();
            return module0035.f2169(var2, (SubLObject)module0814.$ic20$);
        }
        return (SubLObject)module0814.NIL;
    }
    
    public static SubLObject f52166(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0814.NIL;
        SubLObject var4 = (SubLObject)module0814.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0814.$ic21$);
        var3 = var1.first();
        SubLObject var5 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var1, (SubLObject)module0814.$ic21$);
        var4 = var5.first();
        SubLObject var6;
        var5 = (var6 = var5.rest());
        module0035.f2502(var3, (SubLObject)module0814.$ic3$);
        var6 = f52178(var6);
        if (module0814.NIL != module0035.f1997(var6)) {
            final SubLObject var7 = var6.first();
            if (module0814.NIL != module0035.f2501(var7, (SubLObject)module0814.$ic3$)) {
                SubLObject var39_40;
                final SubLObject var37_38 = var39_40 = var7;
                SubLObject var5_41 = (SubLObject)module0814.NIL;
                SubLObject var8 = (SubLObject)module0814.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var39_40, var37_38, (SubLObject)module0814.$ic22$);
                var5_41 = var39_40.first();
                var39_40 = var39_40.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var39_40, var37_38, (SubLObject)module0814.$ic22$);
                var8 = var39_40.first();
                final SubLObject var9;
                var39_40 = (var9 = var39_40.rest());
                module0035.f2502(var5_41, (SubLObject)module0814.$ic3$);
                return f52166((SubLObject)ConsesLow.listS((SubLObject)module0814.$ic3$, ConsesLow.append(var4, var8, (SubLObject)module0814.NIL), ConsesLow.append(var9, (SubLObject)module0814.NIL)));
            }
        }
        return (SubLObject)ConsesLow.listS((SubLObject)module0814.$ic3$, var4, ConsesLow.append(var6, (SubLObject)module0814.NIL));
    }
    
    public static SubLObject f52165(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0814.NIL;
        SubLObject var3 = (SubLObject)module0814.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0814.$ic21$);
        var2 = var1.first();
        SubLObject var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var1, (SubLObject)module0814.$ic21$);
        var3 = var4.first();
        SubLObject var5;
        var4 = (var5 = var4.rest());
        module0035.f2502(var2, (SubLObject)module0814.$ic2$);
        var5 = f52178(var5);
        if (module0814.NIL != module0035.f1997(var5)) {
            final SubLObject var6 = var5.first();
            if (module0814.NIL != module0035.f2501(var6, (SubLObject)module0814.$ic2$)) {
                SubLObject var47_48;
                final SubLObject var45_46 = var47_48 = var6;
                SubLObject var5_49 = (SubLObject)module0814.NIL;
                SubLObject var7 = (SubLObject)module0814.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var47_48, var45_46, (SubLObject)module0814.$ic22$);
                var5_49 = var47_48.first();
                var47_48 = var47_48.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var47_48, var45_46, (SubLObject)module0814.$ic22$);
                var7 = var47_48.first();
                final SubLObject var8;
                var47_48 = (var8 = var47_48.rest());
                module0035.f2502(var5_49, (SubLObject)module0814.$ic2$);
                if (module0814.NIL == f52184(var3, var7)) {
                    return f52165((SubLObject)ConsesLow.listS((SubLObject)module0814.$ic2$, ConsesLow.append(var3, var7, (SubLObject)module0814.NIL), ConsesLow.append(var8, (SubLObject)module0814.NIL)));
                }
            }
        }
        return (SubLObject)ConsesLow.listS((SubLObject)module0814.$ic2$, var3, ConsesLow.append(var5, (SubLObject)module0814.NIL));
    }
    
    public static SubLObject f52184(final SubLObject var30, final SubLObject var42) {
        SubLObject var43 = var30;
        SubLObject var44 = (SubLObject)module0814.NIL;
        var44 = var43.first();
        while (module0814.NIL != var43) {
            final SubLObject var45 = var44.first();
            SubLObject var31_51 = var42;
            SubLObject var46 = (SubLObject)module0814.NIL;
            var46 = var31_51.first();
            while (module0814.NIL != var31_51) {
                final SubLObject var47 = var46.first();
                if (var45.eql(var47)) {
                    return var45;
                }
                var31_51 = var31_51.rest();
                var46 = var31_51.first();
            }
            var43 = var43.rest();
            var44 = var43.first();
        }
        return (SubLObject)module0814.NIL;
    }
    
    public static SubLObject f52167(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0814.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0814.$ic23$);
        var2 = var1.first();
        final SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        module0035.f2502(var2, (SubLObject)module0814.$ic4$);
        SubLObject var5 = (SubLObject)module0814.NIL;
        SubLObject var6 = (SubLObject)module0814.NIL;
        if (module0814.NIL == var6) {
            SubLObject var7 = var4;
            SubLObject var8 = (SubLObject)module0814.NIL;
            var8 = var7.first();
            while (module0814.NIL == var6 && module0814.NIL != var7) {
                SubLObject var63_64;
                final SubLObject var61_62 = var63_64 = var8;
                SubLObject var9 = (SubLObject)module0814.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var63_64, var61_62, (SubLObject)module0814.$ic24$);
                var9 = var63_64.first();
                final SubLObject var10;
                var63_64 = (var10 = var63_64.rest());
                final SubLObject var11 = f52178(var10);
                if (!var9.equal((SubLObject)module0814.$ic25$)) {
                    if (var9.equal((SubLObject)module0814.$ic26$)) {
                        var5 = (SubLObject)ConsesLow.cons(reader.bq_cons((SubLObject)module0814.$ic26$, ConsesLow.append(var11, (SubLObject)module0814.NIL)), var5);
                        var6 = (SubLObject)module0814.T;
                    }
                    else {
                        var5 = (SubLObject)ConsesLow.cons(reader.bq_cons(var9, ConsesLow.append(var11, (SubLObject)module0814.NIL)), var5);
                    }
                }
                var7 = var7.rest();
                var8 = var7.first();
            }
        }
        var5 = Sequences.nreverse(var5);
        if (module0814.NIL == var5) {
            return f52164((SubLObject)module0814.$ic27$);
        }
        if (module0814.NIL == module0035.f1997(var5)) {
            return reader.bq_cons((SubLObject)module0814.$ic4$, ConsesLow.append(var5, (SubLObject)module0814.NIL));
        }
        final SubLObject var12 = var5.first();
        SubLObject var69_70;
        final SubLObject var67_68 = var69_70 = var12;
        SubLObject var13 = (SubLObject)module0814.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var69_70, var67_68, (SubLObject)module0814.$ic24$);
        var13 = var69_70.first();
        final SubLObject var14;
        var69_70 = (var14 = var69_70.rest());
        if (var13.equal((SubLObject)module0814.$ic26$)) {
            return f52164(reader.bq_cons((SubLObject)module0814.$ic1$, ConsesLow.append(var14, (SubLObject)module0814.NIL)));
        }
        return reader.bq_cons((SubLObject)module0814.$ic4$, ConsesLow.append(var5, (SubLObject)module0814.NIL));
    }
    
    public static SubLObject f52168(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0814.NIL;
        SubLObject var3 = (SubLObject)module0814.NIL;
        SubLObject var4 = (SubLObject)module0814.NIL;
        SubLObject var5 = (SubLObject)module0814.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0814.$ic28$);
        var2 = var1.first();
        SubLObject var6 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var1, (SubLObject)module0814.$ic28$);
        var3 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var1, (SubLObject)module0814.$ic28$);
        var4 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var1, (SubLObject)module0814.$ic28$);
        var5 = var6.first();
        var6 = var6.rest();
        if (module0814.NIL == var6) {
            module0035.f2502(var2, (SubLObject)module0814.$ic5$);
            if (var3.equal((SubLObject)module0814.$ic26$)) {
                return var4;
            }
            if (var3.equal((SubLObject)module0814.$ic25$)) {
                return var5;
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0814.$ic28$);
        }
        return var1;
    }
    
    public static SubLObject f52169(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0814.NIL;
        SubLObject var3 = (SubLObject)module0814.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0814.$ic29$);
        var2 = var1.first();
        SubLObject var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var1, (SubLObject)module0814.$ic29$);
        var3 = var4.first();
        var4 = var4.rest();
        if (module0814.NIL != var4) {
            cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0814.$ic29$);
            return (SubLObject)module0814.NIL;
        }
        module0035.f2502(var2, (SubLObject)module0814.$ic6$);
        if (var3.equal((SubLObject)module0814.$ic30$)) {
            return (SubLObject)module0814.$ic26$;
        }
        if (var3.equal((SubLObject)module0814.$ic31$)) {
            return (SubLObject)module0814.$ic25$;
        }
        if (var3.isCons() && module0814.$ic7$ == var3.first()) {
            return conses_high.second(var3);
        }
        return var1;
    }
    
    public static SubLObject f52170(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0814.NIL;
        SubLObject var3 = (SubLObject)module0814.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0814.$ic29$);
        var2 = var1.first();
        SubLObject var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var1, (SubLObject)module0814.$ic29$);
        var3 = var4.first();
        var4 = var4.rest();
        if (module0814.NIL != var4) {
            cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0814.$ic29$);
            return (SubLObject)module0814.NIL;
        }
        module0035.f2502(var2, (SubLObject)module0814.$ic7$);
        if (var3.equal((SubLObject)module0814.$ic26$)) {
            return (SubLObject)module0814.$ic30$;
        }
        if (var3.equal((SubLObject)module0814.$ic25$)) {
            return (SubLObject)module0814.$ic31$;
        }
        if (var3.isCons() && module0814.$ic6$ == var3.first()) {
            return conses_high.second(var3);
        }
        return var1;
    }
    
    public static SubLObject f52171(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0814.NIL;
        SubLObject var3 = (SubLObject)module0814.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0814.$ic32$);
        var2 = var1.first();
        SubLObject var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var1, (SubLObject)module0814.$ic32$);
        var3 = var4.first();
        var4 = var4.rest();
        if (module0814.NIL != var4) {
            cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0814.$ic32$);
            return (SubLObject)module0814.NIL;
        }
        module0035.f2502(var2, (SubLObject)module0814.$ic8$);
        if (var3.equal((SubLObject)module0814.$ic26$)) {
            return (SubLObject)module0814.$ic25$;
        }
        if (var3.equal((SubLObject)module0814.$ic25$)) {
            return (SubLObject)module0814.$ic26$;
        }
        if (var3.isCons() && module0814.$ic8$ == var3.first()) {
            return conses_high.second(var3);
        }
        return var1;
    }
    
    public static SubLObject f52172(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0814.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0814.$ic33$);
        var2 = var1.first();
        final SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        module0035.f2502(var2, (SubLObject)module0814.$ic9$);
        SubLObject var5 = (SubLObject)module0814.NIL;
        SubLObject var6 = var4;
        SubLObject var7 = (SubLObject)module0814.NIL;
        var7 = var6.first();
        while (module0814.NIL != var6) {
            if (!var7.equal((SubLObject)module0814.$ic26$)) {
                if (var7.equal((SubLObject)module0814.$ic25$)) {
                    return var7;
                }
                if (var7.isCons() && module0814.$ic9$ == var7.first()) {
                    SubLObject var31_86 = var7.rest();
                    SubLObject var8 = (SubLObject)module0814.NIL;
                    var8 = var31_86.first();
                    while (module0814.NIL != var31_86) {
                        var5 = (SubLObject)ConsesLow.cons(var8, var5);
                        var31_86 = var31_86.rest();
                        var8 = var31_86.first();
                    }
                }
                else {
                    var5 = (SubLObject)ConsesLow.cons(var7, var5);
                }
            }
            var6 = var6.rest();
            var7 = var6.first();
        }
        if (module0814.NIL == var5) {
            return (SubLObject)module0814.$ic26$;
        }
        if (module0814.NIL != module0035.f1997(var5)) {
            return var5.first();
        }
        return reader.bq_cons((SubLObject)module0814.$ic9$, ConsesLow.append(Sequences.nreverse(var5), (SubLObject)module0814.NIL));
    }
    
    public static SubLObject f52173(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0814.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0814.$ic33$);
        var2 = var1.first();
        final SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        module0035.f2502(var2, (SubLObject)module0814.$ic10$);
        SubLObject var5 = (SubLObject)module0814.NIL;
        SubLObject var6 = var4;
        SubLObject var7 = (SubLObject)module0814.NIL;
        var7 = var6.first();
        while (module0814.NIL != var6) {
            if (!var7.equal((SubLObject)module0814.$ic25$)) {
                if (var7.equal((SubLObject)module0814.$ic26$)) {
                    return var7;
                }
                if (var7.isCons() && module0814.$ic10$ == var7.first()) {
                    SubLObject var31_90 = var7.rest();
                    SubLObject var8 = (SubLObject)module0814.NIL;
                    var8 = var31_90.first();
                    while (module0814.NIL != var31_90) {
                        var5 = (SubLObject)ConsesLow.cons(var8, var5);
                        var31_90 = var31_90.rest();
                        var8 = var31_90.first();
                    }
                }
                else {
                    var5 = (SubLObject)ConsesLow.cons(var7, var5);
                }
            }
            var6 = var6.rest();
            var7 = var6.first();
        }
        if (module0814.NIL == var5) {
            return (SubLObject)module0814.$ic25$;
        }
        if (module0814.NIL != module0035.f1997(var5)) {
            return var5.first();
        }
        return reader.bq_cons((SubLObject)module0814.$ic10$, ConsesLow.append(Sequences.nreverse(var5), (SubLObject)module0814.NIL));
    }
    
    public static SubLObject f52174(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0814.NIL;
        SubLObject var3 = (SubLObject)module0814.NIL;
        SubLObject var4 = (SubLObject)module0814.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0814.$ic34$);
        var2 = var1.first();
        SubLObject var5 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var1, (SubLObject)module0814.$ic34$);
        var3 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var1, (SubLObject)module0814.$ic34$);
        var4 = var5.first();
        final SubLObject var6;
        var5 = (var6 = var5.rest());
        module0035.f2502(var2, (SubLObject)module0814.$ic11$);
        final SubLObject var7 = f52163(var3);
        if (module0814.NIL == var4 && module0814.NIL == var6) {
            return var7;
        }
        final SubLObject var8 = f52178(var6);
        final SubLObject var9 = var4;
        return (SubLObject)ConsesLow.list((SubLObject)module0814.$ic11$, var7, var9, var8);
    }
    
    public static SubLObject f52175(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0814.NIL;
        SubLObject var3 = (SubLObject)module0814.NIL;
        SubLObject var4 = (SubLObject)module0814.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0814.$ic35$);
        var2 = var1.first();
        SubLObject var5 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var1, (SubLObject)module0814.$ic35$);
        var3 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var1, (SubLObject)module0814.$ic35$);
        var4 = var5.first();
        final SubLObject var6;
        var5 = (var6 = var5.rest());
        module0035.f2502(var2, (SubLObject)module0814.$ic12$);
        final SubLObject var7 = f52163(var4);
        final SubLObject var8 = f52178(var6);
        if (module0814.NIL == var8) {
            return var7;
        }
        return (SubLObject)ConsesLow.listS((SubLObject)module0814.$ic12$, var3, var7, ConsesLow.append(var8, (SubLObject)module0814.NIL));
    }
    
    public static SubLObject f52176(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0814.NIL;
        SubLObject var3 = (SubLObject)module0814.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0814.$ic36$);
        var2 = var1.first();
        SubLObject var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var1, (SubLObject)module0814.$ic36$);
        var3 = var4.first();
        final SubLObject var5;
        var4 = (var5 = var4.rest());
        module0035.f2502(var2, (SubLObject)module0814.$ic13$);
        final SubLObject var6 = f52178(var5);
        if (module0814.NIL == var6) {
            return (SubLObject)module0814.$ic27$;
        }
        return (SubLObject)ConsesLow.listS((SubLObject)module0814.$ic13$, var3, ConsesLow.append(var6, (SubLObject)module0814.NIL));
    }
    
    public static SubLObject f52177(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0814.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0814.$ic37$);
        var2 = var1.first();
        SubLObject var3 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var3, var1, (SubLObject)module0814.$ic37$);
        final SubLObject var4 = var3.rest();
        var3 = var3.first();
        SubLObject var5 = (SubLObject)module0814.NIL;
        SubLObject var6 = (SubLObject)module0814.NIL;
        SubLObject var7 = (SubLObject)module0814.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var3, var1, (SubLObject)module0814.$ic37$);
        var5 = var3.first();
        var3 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var3, var1, (SubLObject)module0814.$ic37$);
        var6 = var3.first();
        var3 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var3, var1, (SubLObject)module0814.$ic37$);
        var7 = var3.first();
        var3 = var3.rest();
        if (module0814.NIL == var3) {
            final SubLObject var8;
            var3 = (var8 = var4);
            module0035.f2502(var2, (SubLObject)module0814.$ic14$);
            final SubLObject var9 = f52178(var5);
            final SubLObject var10 = f52163(var6);
            final SubLObject var11 = f52178(var7);
            final SubLObject var12 = f52178(var8);
            return (SubLObject)ConsesLow.listS((SubLObject)module0814.$ic14$, (SubLObject)ConsesLow.list(var9, var10, var11), ConsesLow.append(var12, (SubLObject)module0814.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0814.$ic37$);
        return (SubLObject)module0814.NIL;
    }
    
    public static SubLObject f52185(final SubLObject var114) {
        final SubLThread var115 = SubLProcess.currentSubLThread();
        SubLObject var116;
        SubLObject var117;
        SubLObject var118;
        SubLObject var119;
        SubLObject var120;
        SubLObject var119_120;
        SubLObject var121_122;
        for (var116 = (SubLObject)module0814.NIL, var117 = (SubLObject)module0814.NIL, var118 = (SubLObject)module0814.NIL, var118 = var114; module0814.NIL == var117 && module0814.NIL != var118; var117 = var121_122, var116 = (SubLObject)ConsesLow.cons(var120, var116), var118 = var118.rest()) {
            var119 = var118.first();
            var120 = (SubLObject)module0814.NIL;
            var115.resetMultipleValues();
            var119_120 = f52186(var119);
            var121_122 = var115.secondMultipleValue();
            var115.resetMultipleValues();
            var120 = var119_120;
        }
        var116 = Sequences.nreverse(var116);
        return Values.values(var116, var117);
    }
    
    public static SubLObject f52187(final SubLObject var114) {
        return f52185(var114);
    }
    
    public static SubLObject f52186(final SubLObject var34) {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        final SubLObject var36 = var34.first();
        if (var36 == module0814.$ic16$) {
            return Values.values(var34, (SubLObject)module0814.T);
        }
        if (var36 == module0814.$ic1$) {
            return f52188(var34);
        }
        if (var36 == module0814.$ic4$) {
            return f52189(var34);
        }
        if (var36 == module0814.$ic2$) {
            return f52190(var34);
        }
        if (var36 == module0814.$ic3$) {
            return f52191(var34);
        }
        if (var36 == module0814.$ic40$) {
            return f52192(var34);
        }
        if (var36 == module0814.$ic12$) {
            return f52193(var34);
        }
        if (var36 == module0814.$ic41$) {
            return f52194(var34);
        }
        if (var36 == module0814.$ic14$) {
            return f52195(var34);
        }
        if (var36 == module0814.$ic13$) {
            return f52196(var34);
        }
        return Values.values(var34, (SubLObject)module0814.NIL);
    }
    
    public static SubLObject f52188(final SubLObject var34) {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        SubLObject var36 = (SubLObject)module0814.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var34, var34, (SubLObject)module0814.$ic17$);
        var36 = var34.first();
        final SubLObject var38;
        final SubLObject var37 = var38 = var34.rest();
        module0035.f2502(var36, (SubLObject)module0814.$ic1$);
        var35.resetMultipleValues();
        final SubLObject var39 = f52185(var38);
        final SubLObject var40 = var35.secondMultipleValue();
        var35.resetMultipleValues();
        final SubLObject var41 = reader.bq_cons((SubLObject)module0814.$ic1$, ConsesLow.append(var39, (SubLObject)module0814.NIL));
        return Values.values(var41, var40);
    }
    
    public static SubLObject f52189(final SubLObject var34) {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        SubLObject var36 = (SubLObject)module0814.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var34, var34, (SubLObject)module0814.$ic23$);
        var36 = var34.first();
        final SubLObject var38;
        final SubLObject var37 = var38 = var34.rest();
        module0035.f2502(var36, (SubLObject)module0814.$ic4$);
        if (module0814.NIL == var38) {
            return Values.values(var34, (SubLObject)module0814.NIL);
        }
        SubLObject var39 = (SubLObject)module0814.NIL;
        SubLObject var40 = (SubLObject)module0814.T;
        SubLObject var41 = (SubLObject)module0814.NIL;
        SubLObject var42 = var38;
        SubLObject var43 = (SubLObject)module0814.NIL;
        var43 = var42.first();
        while (module0814.NIL != var42) {
            SubLObject var132_133;
            final SubLObject var130_131 = var132_133 = var43;
            SubLObject var44 = (SubLObject)module0814.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var132_133, var130_131, (SubLObject)module0814.$ic42$);
            var44 = var132_133.first();
            final SubLObject var45;
            var132_133 = (var45 = var132_133.rest());
            var41 = var44;
            var35.resetMultipleValues();
            final SubLObject var46 = f52185(var45);
            final SubLObject var47 = var35.secondMultipleValue();
            var35.resetMultipleValues();
            final SubLObject var48 = reader.bq_cons(var44, ConsesLow.append(var46, (SubLObject)module0814.NIL));
            var39 = (SubLObject)ConsesLow.cons(var48, var39);
            var40 = (SubLObject)SubLObjectFactory.makeBoolean(module0814.NIL != var40 && module0814.NIL != var47);
            var42 = var42.rest();
            var43 = var42.first();
        }
        final SubLObject var49 = Equality.equal(var41, (SubLObject)module0814.$ic26$);
        var40 = (SubLObject)SubLObjectFactory.makeBoolean(module0814.NIL != var40 && module0814.NIL != var49);
        final SubLObject var50 = reader.bq_cons((SubLObject)module0814.$ic4$, ConsesLow.append(Sequences.nreverse(var39), (SubLObject)module0814.NIL));
        return Values.values(var50, var40);
    }
    
    public static SubLObject f52190(final SubLObject var34) {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        SubLObject var36 = (SubLObject)module0814.NIL;
        SubLObject var37 = (SubLObject)module0814.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var34, var34, (SubLObject)module0814.$ic43$);
        var36 = var34.first();
        SubLObject var38 = var34.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var38, var34, (SubLObject)module0814.$ic43$);
        var37 = var38.first();
        final SubLObject var39;
        var38 = (var39 = var38.rest());
        module0035.f2502(var36, (SubLObject)module0814.$ic2$);
        var35.resetMultipleValues();
        final SubLObject var40 = f52185(var39);
        final SubLObject var41 = var35.secondMultipleValue();
        var35.resetMultipleValues();
        final SubLObject var42 = (SubLObject)ConsesLow.listS((SubLObject)module0814.$ic2$, var37, ConsesLow.append(var40, (SubLObject)module0814.NIL));
        return Values.values(var42, var41);
    }
    
    public static SubLObject f52191(final SubLObject var34) {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        SubLObject var36 = (SubLObject)module0814.NIL;
        SubLObject var37 = (SubLObject)module0814.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var34, var34, (SubLObject)module0814.$ic44$);
        var36 = var34.first();
        SubLObject var38 = var34.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var38, var34, (SubLObject)module0814.$ic44$);
        var37 = var38.first();
        final SubLObject var39;
        var38 = (var39 = var38.rest());
        module0035.f2502(var36, (SubLObject)module0814.$ic3$);
        var35.resetMultipleValues();
        final SubLObject var40 = f52185(var39);
        final SubLObject var41 = var35.secondMultipleValue();
        var35.resetMultipleValues();
        final SubLObject var42 = (SubLObject)ConsesLow.listS((SubLObject)module0814.$ic3$, var37, ConsesLow.append(var40, (SubLObject)module0814.NIL));
        return Values.values(var42, var41);
    }
    
    public static SubLObject f52192(final SubLObject var34) {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        SubLObject var36 = (SubLObject)module0814.NIL;
        SubLObject var37 = (SubLObject)module0814.NIL;
        SubLObject var38 = (SubLObject)module0814.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var34, var34, (SubLObject)module0814.$ic45$);
        var36 = var34.first();
        SubLObject var39 = var34.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var39, var34, (SubLObject)module0814.$ic45$);
        var37 = var39.first();
        var39 = var39.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var39, var34, (SubLObject)module0814.$ic45$);
        var38 = var39.first();
        final SubLObject var40;
        var39 = (var40 = var39.rest());
        module0035.f2502(var36, (SubLObject)module0814.$ic40$);
        var35.resetMultipleValues();
        final SubLObject var41 = f52185(var40);
        final SubLObject var42 = var35.secondMultipleValue();
        var35.resetMultipleValues();
        final SubLObject var43 = (SubLObject)ConsesLow.listS((SubLObject)module0814.$ic40$, var37, var38, ConsesLow.append(var41, (SubLObject)module0814.NIL));
        return Values.values(var43, var42);
    }
    
    public static SubLObject f52193(final SubLObject var34) {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        SubLObject var36 = (SubLObject)module0814.NIL;
        SubLObject var37 = (SubLObject)module0814.NIL;
        SubLObject var38 = (SubLObject)module0814.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var34, var34, (SubLObject)module0814.$ic35$);
        var36 = var34.first();
        SubLObject var39 = var34.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var39, var34, (SubLObject)module0814.$ic35$);
        var37 = var39.first();
        var39 = var39.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var39, var34, (SubLObject)module0814.$ic35$);
        var38 = var39.first();
        final SubLObject var40;
        var39 = (var40 = var39.rest());
        module0035.f2502(var36, (SubLObject)module0814.$ic12$);
        var35.resetMultipleValues();
        final SubLObject var41 = f52186(var38);
        final SubLObject var42 = var35.secondMultipleValue();
        var35.resetMultipleValues();
        var35.resetMultipleValues();
        final SubLObject var43 = f52185(var40);
        final SubLObject var44 = var35.secondMultipleValue();
        var35.resetMultipleValues();
        final SubLObject var45 = (SubLObject)ConsesLow.listS((SubLObject)module0814.$ic12$, var37, var41, ConsesLow.append(var43, (SubLObject)module0814.NIL));
        return Values.values(var45, var42);
    }
    
    public static SubLObject f52194(final SubLObject var34) {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        SubLObject var36 = (SubLObject)module0814.NIL;
        SubLObject var37 = (SubLObject)module0814.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var34, var34, (SubLObject)module0814.$ic46$);
        var36 = var34.first();
        SubLObject var38 = var34.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var38, var34, (SubLObject)module0814.$ic46$);
        var37 = var38.first();
        final SubLObject var39;
        var38 = (var39 = var38.rest());
        module0035.f2502(var36, (SubLObject)module0814.$ic41$);
        final SubLObject var40 = f52163(var37);
        final SubLObject var41 = Equality.equal(var40, (SubLObject)module0814.$ic26$);
        var35.resetMultipleValues();
        final SubLObject var42 = f52185(var39);
        final SubLObject var43 = var35.secondMultipleValue();
        var35.resetMultipleValues();
        final SubLObject var44 = (SubLObject)ConsesLow.listS((SubLObject)module0814.$ic41$, var40, ConsesLow.append(var42, (SubLObject)module0814.NIL));
        return Values.values(var44, var41);
    }
    
    public static SubLObject f52195(final SubLObject var34) {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        SubLObject var36 = (SubLObject)module0814.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var34, var34, (SubLObject)module0814.$ic37$);
        var36 = var34.first();
        SubLObject var37 = var34.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var37, var34, (SubLObject)module0814.$ic37$);
        final SubLObject var38 = var37.rest();
        var37 = var37.first();
        SubLObject var39 = (SubLObject)module0814.NIL;
        SubLObject var40 = (SubLObject)module0814.NIL;
        SubLObject var41 = (SubLObject)module0814.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var37, var34, (SubLObject)module0814.$ic37$);
        var39 = var37.first();
        var37 = var37.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var37, var34, (SubLObject)module0814.$ic37$);
        var40 = var37.first();
        var37 = var37.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var37, var34, (SubLObject)module0814.$ic37$);
        var41 = var37.first();
        var37 = var37.rest();
        if (module0814.NIL == var37) {
            final SubLObject var42;
            var37 = (var42 = var38);
            module0035.f2502(var36, (SubLObject)module0814.$ic14$);
            final SubLObject var43 = f52163(var40);
            SubLObject var44 = Equality.equal(var43, (SubLObject)module0814.$ic26$);
            var35.resetMultipleValues();
            final SubLObject var45 = f52185(var39);
            final SubLObject var46 = var35.secondMultipleValue();
            var35.resetMultipleValues();
            var44 = (SubLObject)SubLObjectFactory.makeBoolean(module0814.NIL != var44 || module0814.NIL != var46);
            var35.resetMultipleValues();
            final SubLObject var47 = f52185(var41);
            final SubLObject var48 = var35.secondMultipleValue();
            var35.resetMultipleValues();
            var35.resetMultipleValues();
            final SubLObject var49 = f52185(var42);
            final SubLObject var50 = var35.secondMultipleValue();
            var35.resetMultipleValues();
            final SubLObject var51 = (SubLObject)ConsesLow.listS((SubLObject)module0814.$ic14$, (SubLObject)ConsesLow.list(var45, var43, var47), ConsesLow.append(var49, (SubLObject)module0814.NIL));
            return Values.values(var51, var44);
        }
        cdestructuring_bind.cdestructuring_bind_error(var34, (SubLObject)module0814.$ic37$);
        return (SubLObject)module0814.NIL;
    }
    
    public static SubLObject f52196(final SubLObject var34) {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        SubLObject var36 = (SubLObject)module0814.NIL;
        SubLObject var37 = (SubLObject)module0814.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var34, var34, (SubLObject)module0814.$ic36$);
        var36 = var34.first();
        SubLObject var38 = var34.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var38, var34, (SubLObject)module0814.$ic36$);
        var37 = var38.first();
        final SubLObject var39;
        var38 = (var39 = var38.rest());
        module0035.f2502(var36, (SubLObject)module0814.$ic13$);
        var35.resetMultipleValues();
        final SubLObject var40 = f52185(var39);
        final SubLObject var41 = var35.secondMultipleValue();
        var35.resetMultipleValues();
        final SubLObject var42 = (SubLObject)ConsesLow.listS((SubLObject)module0814.$ic13$, var37, ConsesLow.append(var40, (SubLObject)module0814.NIL));
        return Values.values(var42, var41);
    }
    
    public static SubLObject f52197() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0814", "f52163", "S#57004", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0814", "f52178", "S#56518", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0814", "f52179", "S#57005", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0814", "f52180", "S#57006", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0814", "f52164", "S#56533", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0814", "f52181", "S#57007", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0814", "f52182", "S#57008", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0814", "f52183", "S#57009", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0814", "f52166", "S#56522", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0814", "f52165", "S#56521", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0814", "f52184", "S#57010", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0814", "f52167", "S#56530", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0814", "f52168", "S#56529", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0814", "f52169", "S#56528", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0814", "f52170", "S#56519", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0814", "f52171", "S#56523", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0814", "f52172", "S#56520", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0814", "f52173", "S#56524", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0814", "f52174", "S#57011", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0814", "f52175", "S#56525", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0814", "f52176", "S#57012", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0814", "f52177", "S#56535", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0814", "f52185", "S#57013", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0814", "f52187", "S#57014", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0814", "f52186", "S#57015", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0814", "f52188", "S#57016", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0814", "f52189", "S#57017", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0814", "f52190", "S#57018", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0814", "f52191", "S#57019", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0814", "f52192", "S#57020", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0814", "f52193", "S#57021", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0814", "f52194", "S#57022", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0814", "f52195", "S#57023", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0814", "f52196", "S#57024", 1, 0, false);
        return (SubLObject)module0814.NIL;
    }
    
    public static SubLObject f52198() {
        return (SubLObject)module0814.NIL;
    }
    
    public static SubLObject f52199() {
        module0002.f35((SubLObject)module0814.$ic38$, (SubLObject)module0814.$ic39$);
        return (SubLObject)module0814.NIL;
    }
    
    public void declareFunctions() {
        f52197();
    }
    
    public void initializeVariables() {
        f52198();
    }
    
    public void runTopLevelForms() {
        f52199();
    }
    
    static {
        me = (SubLFile)new module0814();
        $ic0$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#105", "CYC"));
        $ic1$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic2$ = SubLObjectFactory.makeSymbol("S#56659", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("S#56658", "CYC");
        $ic4$ = SubLObjectFactory.makeSymbol("PCOND");
        $ic5$ = SubLObjectFactory.makeSymbol("FIF");
        $ic6$ = SubLObjectFactory.makeSymbol("S#56683", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#56691", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("S#56701", "CYC");
        $ic9$ = SubLObjectFactory.makeSymbol("S#56692", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#56702", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#57025", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#56666", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#56671", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#56663", "CYC");
        $ic15$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#57026", "CYC"));
        $ic16$ = SubLObjectFactory.makeSymbol("RET");
        $ic17$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic18$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#56716", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#57027", "CYC"));
        $ic19$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#57026", "CYC"));
        $ic20$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFINE"), (SubLObject)SubLObjectFactory.makeSymbol("S#56710", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("DEFVAR"), (SubLObject)SubLObjectFactory.makeSymbol("DEFPARAMETER"), (SubLObject)SubLObjectFactory.makeSymbol("DEFLEXICAL"), (SubLObject)SubLObjectFactory.makeSymbol("DEFCONSTANT"));
        $ic21$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic22$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#57028", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#57026", "CYC"));
        $ic23$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#735", "CYC"));
        $ic24$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONDITION"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic25$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#57029", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#57030", "CYC"));
        $ic26$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#57029", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#57031", "CYC"));
        $ic27$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"));
        $ic28$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("CONDITION"), (SubLObject)SubLObjectFactory.makeSymbol("S#56714", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56715", "CYC"));
        $ic29$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("CONDITION"));
        $ic30$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#56848", "CYC"), (SubLObject)module0814.T);
        $ic31$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#56848", "CYC"), (SubLObject)module0814.NIL);
        $ic32$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#63", "CYC"));
        $ic33$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#56690", "CYC"));
        $ic34$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#57032", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#57033", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic35$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56730", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#152", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic36$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56736", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic37$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#56727", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#122", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56728", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic38$ = SubLObjectFactory.makeSymbol("S#57014", "CYC");
        $ic39$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#57013", "CYC"));
        $ic40$ = SubLObjectFactory.makeSymbol("CPROGV");
        $ic41$ = SubLObjectFactory.makeSymbol("WHILE");
        $ic42$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#57034", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#56718", "CYC"));
        $ic43$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56724", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic44$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56723", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic45$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#56703", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic46$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#122", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0814.class
	Total time: 178 ms
	
	Decompiled with Procyon 0.5.32.
*/