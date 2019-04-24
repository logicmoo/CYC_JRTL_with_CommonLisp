package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0555 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0555";
    public static final String myFingerPrint = "43550809009aec731479827745073a6ebb7673416d86bd384cec4c6b0ce8e5d4";
    private static final SubLList $ic0$;
    private static final SubLList $ic1$;
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
    private static final SubLObject $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLList $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLObject $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLList $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLObject $ic28$;
    private static final SubLList $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    
    public static SubLObject f34217(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0555.$ic0$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0555.NIL;
        SubLObject var7 = (SubLObject)module0555.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0555.$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0555.$ic0$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)module0555.NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)module0555.NIL;
        SubLObject var11_12 = (SubLObject)module0555.NIL;
        while (module0555.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0555.$ic0$);
            var11_12 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0555.$ic0$);
            if (module0555.NIL == conses_high.member(var11_12, (SubLObject)module0555.$ic1$, (SubLObject)module0555.UNPROVIDED, (SubLObject)module0555.UNPROVIDED)) {
                var10 = (SubLObject)module0555.T;
            }
            if (var11_12 == module0555.$ic2$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0555.NIL != var10 && module0555.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0555.$ic0$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0555.$ic3$, var4);
        final SubLObject var12 = (SubLObject)((module0555.NIL != var11) ? conses_high.cadr(var11) : module0555.NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)module0555.$ic4$, var4);
        final SubLObject var14 = (SubLObject)((module0555.NIL != var13) ? conses_high.cadr(var13) : module0555.NIL);
        final SubLObject var15;
        var4 = (var15 = var5);
        if (module0555.NIL != var12) {
            return (SubLObject)ConsesLow.list((SubLObject)module0555.$ic5$, var12, (SubLObject)ConsesLow.listS((SubLObject)module0555.$ic6$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)module0555.$ic4$, var14), ConsesLow.append(var15, (SubLObject)module0555.NIL)));
        }
        if (!var7.isAtom()) {
            final SubLObject var16 = (SubLObject)module0555.$ic7$;
            return (SubLObject)ConsesLow.list((SubLObject)module0555.$ic8$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var16, var7)), (SubLObject)ConsesLow.listS((SubLObject)module0555.$ic6$, (SubLObject)ConsesLow.list(var6, var16, (SubLObject)module0555.$ic4$, var14), ConsesLow.append(var15, (SubLObject)module0555.NIL)));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)module0555.$ic9$, (SubLObject)ConsesLow.list(new SubLObject[] { var6, var7, module0555.TWO_INTEGER, module0555.$ic10$, module0555.ONE_INTEGER, module0555.$ic11$, module0555.$ic12$, module0555.$ic13$, module0555.$ic14$, module0555.$ic4$, var14 }), (SubLObject)ConsesLow.list((SubLObject)module0555.$ic15$, var7, var6), ConsesLow.append(var15, (SubLObject)module0555.NIL));
    }
    
    public static SubLObject f34218(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0555.$ic16$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0555.NIL;
        SubLObject var7 = (SubLObject)module0555.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0555.$ic16$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0555.$ic16$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)module0555.NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)module0555.NIL;
        SubLObject var27_28 = (SubLObject)module0555.NIL;
        while (module0555.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0555.$ic16$);
            var27_28 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0555.$ic16$);
            if (module0555.NIL == conses_high.member(var27_28, (SubLObject)module0555.$ic1$, (SubLObject)module0555.UNPROVIDED, (SubLObject)module0555.UNPROVIDED)) {
                var10 = (SubLObject)module0555.T;
            }
            if (var27_28 == module0555.$ic2$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0555.NIL != var10 && module0555.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0555.$ic16$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0555.$ic3$, var4);
        final SubLObject var12 = (SubLObject)((module0555.NIL != var11) ? conses_high.cadr(var11) : module0555.NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)module0555.$ic4$, var4);
        final SubLObject var14 = (SubLObject)((module0555.NIL != var13) ? conses_high.cadr(var13) : module0555.NIL);
        final SubLObject var15;
        var4 = (var15 = var5);
        if (module0555.NIL != var12) {
            return (SubLObject)ConsesLow.list((SubLObject)module0555.$ic5$, var12, (SubLObject)ConsesLow.listS((SubLObject)module0555.$ic17$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)module0555.$ic4$, var14), ConsesLow.append(var15, (SubLObject)module0555.NIL)));
        }
        if (!var7.isAtom()) {
            final SubLObject var16 = (SubLObject)module0555.$ic18$;
            return (SubLObject)ConsesLow.list((SubLObject)module0555.$ic8$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var16, var7)), (SubLObject)ConsesLow.listS((SubLObject)module0555.$ic17$, (SubLObject)ConsesLow.list(var6, var16, (SubLObject)module0555.$ic4$, var14), ConsesLow.append(var15, (SubLObject)module0555.NIL)));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)module0555.$ic9$, (SubLObject)ConsesLow.list(new SubLObject[] { var6, var7, module0555.ONE_INTEGER, module0555.$ic10$, module0555.TWO_INTEGER, module0555.$ic11$, module0555.$ic12$, module0555.$ic13$, module0555.$ic14$, module0555.$ic4$, var14 }), (SubLObject)ConsesLow.list((SubLObject)module0555.$ic15$, var7, var6), ConsesLow.append(var15, (SubLObject)module0555.NIL));
    }
    
    public static SubLObject f34219(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0555.$ic19$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0555.NIL;
        SubLObject var7 = (SubLObject)module0555.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0555.$ic19$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0555.$ic19$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)module0555.NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)module0555.NIL;
        SubLObject var39_40 = (SubLObject)module0555.NIL;
        while (module0555.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0555.$ic19$);
            var39_40 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0555.$ic19$);
            if (module0555.NIL == conses_high.member(var39_40, (SubLObject)module0555.$ic1$, (SubLObject)module0555.UNPROVIDED, (SubLObject)module0555.UNPROVIDED)) {
                var10 = (SubLObject)module0555.T;
            }
            if (var39_40 == module0555.$ic2$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0555.NIL != var10 && module0555.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0555.$ic19$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0555.$ic3$, var4);
        final SubLObject var12 = (SubLObject)((module0555.NIL != var11) ? conses_high.cadr(var11) : module0555.NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)module0555.$ic4$, var4);
        final SubLObject var14 = (SubLObject)((module0555.NIL != var13) ? conses_high.cadr(var13) : module0555.NIL);
        final SubLObject var15;
        var4 = (var15 = var5);
        if (module0555.NIL != var12) {
            return (SubLObject)ConsesLow.list((SubLObject)module0555.$ic5$, var12, (SubLObject)ConsesLow.listS((SubLObject)module0555.$ic20$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)module0555.$ic4$, var14), ConsesLow.append(var15, (SubLObject)module0555.NIL)));
        }
        if (!var7.isAtom()) {
            final SubLObject var16 = (SubLObject)module0555.$ic21$;
            return (SubLObject)ConsesLow.list((SubLObject)module0555.$ic8$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var16, var7)), (SubLObject)ConsesLow.listS((SubLObject)module0555.$ic20$, (SubLObject)ConsesLow.list(var6, var16, (SubLObject)module0555.$ic4$, var14), ConsesLow.append(var15, (SubLObject)module0555.NIL)));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)module0555.$ic9$, (SubLObject)ConsesLow.list(new SubLObject[] { var6, var7, module0555.TWO_INTEGER, module0555.$ic10$, module0555.ONE_INTEGER, module0555.$ic11$, module0555.$ic22$, module0555.$ic13$, module0555.$ic14$, module0555.$ic4$, var14 }), (SubLObject)ConsesLow.list((SubLObject)module0555.$ic15$, var7, var6), ConsesLow.append(var15, (SubLObject)module0555.NIL));
    }
    
    public static SubLObject f34220(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0555.$ic16$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0555.NIL;
        SubLObject var7 = (SubLObject)module0555.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0555.$ic16$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0555.$ic16$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)module0555.NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)module0555.NIL;
        SubLObject var49_50 = (SubLObject)module0555.NIL;
        while (module0555.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0555.$ic16$);
            var49_50 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0555.$ic16$);
            if (module0555.NIL == conses_high.member(var49_50, (SubLObject)module0555.$ic1$, (SubLObject)module0555.UNPROVIDED, (SubLObject)module0555.UNPROVIDED)) {
                var10 = (SubLObject)module0555.T;
            }
            if (var49_50 == module0555.$ic2$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0555.NIL != var10 && module0555.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0555.$ic16$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0555.$ic3$, var4);
        final SubLObject var12 = (SubLObject)((module0555.NIL != var11) ? conses_high.cadr(var11) : module0555.NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)module0555.$ic4$, var4);
        final SubLObject var14 = (SubLObject)((module0555.NIL != var13) ? conses_high.cadr(var13) : module0555.NIL);
        final SubLObject var15;
        var4 = (var15 = var5);
        if (module0555.NIL != var12) {
            return (SubLObject)ConsesLow.list((SubLObject)module0555.$ic5$, var12, (SubLObject)ConsesLow.listS((SubLObject)module0555.$ic23$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)module0555.$ic4$, var14), ConsesLow.append(var15, (SubLObject)module0555.NIL)));
        }
        if (!var7.isAtom()) {
            final SubLObject var16 = (SubLObject)module0555.$ic24$;
            return (SubLObject)ConsesLow.list((SubLObject)module0555.$ic8$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var16, var7)), (SubLObject)ConsesLow.listS((SubLObject)module0555.$ic23$, (SubLObject)ConsesLow.list(var6, var16, (SubLObject)module0555.$ic4$, var14), ConsesLow.append(var15, (SubLObject)module0555.NIL)));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)module0555.$ic9$, (SubLObject)ConsesLow.list(new SubLObject[] { var6, var7, module0555.ONE_INTEGER, module0555.$ic10$, module0555.TWO_INTEGER, module0555.$ic11$, module0555.$ic22$, module0555.$ic13$, module0555.$ic14$, module0555.$ic4$, var14 }), (SubLObject)ConsesLow.list((SubLObject)module0555.$ic15$, var7, var6), ConsesLow.append(var15, (SubLObject)module0555.NIL));
    }
    
    public static SubLObject f34221(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0555.$ic25$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0555.NIL;
        SubLObject var7 = (SubLObject)module0555.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0555.$ic25$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0555.$ic25$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)module0555.NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)module0555.NIL;
        SubLObject var60_61 = (SubLObject)module0555.NIL;
        while (module0555.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0555.$ic25$);
            var60_61 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0555.$ic25$);
            if (module0555.NIL == conses_high.member(var60_61, (SubLObject)module0555.$ic1$, (SubLObject)module0555.UNPROVIDED, (SubLObject)module0555.UNPROVIDED)) {
                var10 = (SubLObject)module0555.T;
            }
            if (var60_61 == module0555.$ic2$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0555.NIL != var10 && module0555.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0555.$ic25$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0555.$ic3$, var4);
        final SubLObject var12 = (SubLObject)((module0555.NIL != var11) ? conses_high.cadr(var11) : module0555.NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)module0555.$ic4$, var4);
        final SubLObject var14 = (SubLObject)((module0555.NIL != var13) ? conses_high.cadr(var13) : module0555.NIL);
        final SubLObject var15;
        var4 = (var15 = var5);
        if (module0555.NIL != var12) {
            return (SubLObject)ConsesLow.list((SubLObject)module0555.$ic5$, var12, (SubLObject)ConsesLow.listS((SubLObject)module0555.$ic26$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)module0555.$ic4$, var14), ConsesLow.append(var15, (SubLObject)module0555.NIL)));
        }
        if (!var7.isAtom()) {
            final SubLObject var16 = (SubLObject)module0555.$ic27$;
            return (SubLObject)ConsesLow.list((SubLObject)module0555.$ic8$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var16, var7)), (SubLObject)ConsesLow.listS((SubLObject)module0555.$ic26$, (SubLObject)ConsesLow.list(var6, var16, (SubLObject)module0555.$ic4$, var14), ConsesLow.append(var15, (SubLObject)module0555.NIL)));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)module0555.$ic9$, (SubLObject)ConsesLow.list(new SubLObject[] { var6, var7, module0555.TWO_INTEGER, module0555.$ic10$, module0555.ONE_INTEGER, module0555.$ic11$, module0555.$ic28$, module0555.$ic13$, module0555.$ic14$, module0555.$ic4$, var14 }), (SubLObject)ConsesLow.list((SubLObject)module0555.$ic15$, var7, var6), ConsesLow.append(var15, (SubLObject)module0555.NIL));
    }
    
    public static SubLObject f34222(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0555.$ic29$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0555.NIL;
        SubLObject var7 = (SubLObject)module0555.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0555.$ic29$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0555.$ic29$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)module0555.NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)module0555.NIL;
        SubLObject var71_72 = (SubLObject)module0555.NIL;
        while (module0555.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0555.$ic29$);
            var71_72 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0555.$ic29$);
            if (module0555.NIL == conses_high.member(var71_72, (SubLObject)module0555.$ic1$, (SubLObject)module0555.UNPROVIDED, (SubLObject)module0555.UNPROVIDED)) {
                var10 = (SubLObject)module0555.T;
            }
            if (var71_72 == module0555.$ic2$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0555.NIL != var10 && module0555.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0555.$ic29$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0555.$ic3$, var4);
        final SubLObject var12 = (SubLObject)((module0555.NIL != var11) ? conses_high.cadr(var11) : module0555.NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)module0555.$ic4$, var4);
        final SubLObject var14 = (SubLObject)((module0555.NIL != var13) ? conses_high.cadr(var13) : module0555.NIL);
        final SubLObject var15;
        var4 = (var15 = var5);
        if (module0555.NIL != var12) {
            return (SubLObject)ConsesLow.list((SubLObject)module0555.$ic5$, var12, (SubLObject)ConsesLow.listS((SubLObject)module0555.$ic30$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)module0555.$ic4$, var14), ConsesLow.append(var15, (SubLObject)module0555.NIL)));
        }
        if (!var7.isAtom()) {
            final SubLObject var16 = (SubLObject)module0555.$ic31$;
            return (SubLObject)ConsesLow.list((SubLObject)module0555.$ic8$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var16, var7)), (SubLObject)ConsesLow.listS((SubLObject)module0555.$ic30$, (SubLObject)ConsesLow.list(var6, var16, (SubLObject)module0555.$ic4$, var14), ConsesLow.append(var15, (SubLObject)module0555.NIL)));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)module0555.$ic9$, (SubLObject)ConsesLow.list(new SubLObject[] { var6, var7, module0555.ONE_INTEGER, module0555.$ic10$, module0555.TWO_INTEGER, module0555.$ic11$, module0555.$ic28$, module0555.$ic13$, module0555.$ic14$, module0555.$ic4$, var14 }), (SubLObject)ConsesLow.list((SubLObject)module0555.$ic15$, var7, var6), ConsesLow.append(var15, (SubLObject)module0555.NIL));
    }
    
    public static SubLObject f34223(final SubLObject var75, final SubLObject var76) {
        return (SubLObject)module0555.NIL;
    }
    
    public static SubLObject f34224(final SubLObject var7, final SubLObject var23, SubLObject var14) {
        if (var14 == module0555.UNPROVIDED) {
            var14 = (SubLObject)module0555.NIL;
        }
        final SubLThread var24 = SubLProcess.currentSubLThread();
        final SubLObject var25 = module0077.f5313(Symbols.symbol_function((SubLObject)module0555.EQ), module0549.f33894(var7));
        final SubLObject var26 = module0055.f4017();
        SubLObject var27 = (SubLObject)module0555.NIL;
        final SubLObject var28 = var14;
        final SubLObject var29 = module0147.$g2095$.currentBinding(var24);
        final SubLObject var30 = module0147.$g2094$.currentBinding(var24);
        final SubLObject var31 = module0147.$g2096$.currentBinding(var24);
        try {
            module0147.$g2095$.bind(module0147.f9545(var28), var24);
            module0147.$g2094$.bind(module0147.f9546(var28), var24);
            module0147.$g2096$.bind(module0147.f9549(var28), var24);
            SubLObject var32 = (SubLObject)module0555.NIL;
            final SubLObject var33 = module0555.$ic12$;
            if (module0555.NIL != module0158.f10010(var7, (SubLObject)module0555.ONE_INTEGER, var33)) {
                final SubLObject var34 = module0158.f10011(var7, (SubLObject)module0555.ONE_INTEGER, var33);
                SubLObject var35 = (SubLObject)module0555.NIL;
                final SubLObject var36 = (SubLObject)module0555.NIL;
                while (module0555.NIL == var35) {
                    final SubLObject var37 = module0052.f3695(var34, var36);
                    final SubLObject var38 = (SubLObject)SubLObjectFactory.makeBoolean(!var36.eql(var37));
                    if (module0555.NIL != var38) {
                        SubLObject var39 = (SubLObject)module0555.NIL;
                        try {
                            var39 = module0158.f10316(var37, (SubLObject)module0555.$ic32$, (SubLObject)module0555.$ic14$, (SubLObject)module0555.NIL);
                            SubLObject var88_93 = (SubLObject)module0555.NIL;
                            final SubLObject var89_94 = (SubLObject)module0555.NIL;
                            while (module0555.NIL == var88_93) {
                                final SubLObject var40 = module0052.f3695(var39, var89_94);
                                final SubLObject var91_96 = (SubLObject)SubLObjectFactory.makeBoolean(!var89_94.eql(var40));
                                if (module0555.NIL != var91_96) {
                                    var32 = module0178.f11331(var40, (SubLObject)module0555.TWO_INTEGER);
                                    f34223(var7, var32);
                                    module0055.f4021(var32, var26);
                                }
                                var88_93 = (SubLObject)SubLObjectFactory.makeBoolean(module0555.NIL == var91_96);
                            }
                        }
                        finally {
                            final SubLObject var82_97 = Threads.$is_thread_performing_cleanupP$.currentBinding(var24);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0555.T, var24);
                                if (module0555.NIL != var39) {
                                    module0158.f10319(var39);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var82_97, var24);
                            }
                        }
                    }
                    var35 = (SubLObject)SubLObjectFactory.makeBoolean(module0555.NIL == var38);
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var31, var24);
            module0147.$g2094$.rebind(var30, var24);
            module0147.$g2095$.rebind(var29, var24);
        }
        while (module0555.NIL == var27 && module0555.NIL == module0055.f4019(var26)) {
            final SubLObject var41 = module0055.f4023(var26);
            if (module0555.NIL == module0077.f5320(var41, var25)) {
                module0077.f5326(var41, var25);
                if (var41.eql(var23)) {
                    var27 = (SubLObject)module0555.T;
                }
                else {
                    final SubLObject var42 = var14;
                    final SubLObject var43 = module0147.$g2095$.currentBinding(var24);
                    final SubLObject var44 = module0147.$g2094$.currentBinding(var24);
                    final SubLObject var45 = module0147.$g2096$.currentBinding(var24);
                    try {
                        module0147.$g2095$.bind(module0147.f9545(var42), var24);
                        module0147.$g2094$.bind(module0147.f9546(var42), var24);
                        module0147.$g2096$.bind(module0147.f9549(var42), var24);
                        SubLObject var46 = (SubLObject)module0555.NIL;
                        final SubLObject var47 = module0555.$ic28$;
                        if (module0555.NIL == module0158.f10010(var41, (SubLObject)module0555.ONE_INTEGER, var47)) {
                            continue;
                        }
                        final SubLObject var48 = module0158.f10011(var41, (SubLObject)module0555.ONE_INTEGER, var47);
                        SubLObject var49 = (SubLObject)module0555.NIL;
                        final SubLObject var50 = (SubLObject)module0555.NIL;
                        while (module0555.NIL == var49) {
                            final SubLObject var51 = module0052.f3695(var48, var50);
                            final SubLObject var52 = (SubLObject)SubLObjectFactory.makeBoolean(!var50.eql(var51));
                            if (module0555.NIL != var52) {
                                SubLObject var53 = (SubLObject)module0555.NIL;
                                try {
                                    var53 = module0158.f10316(var51, (SubLObject)module0555.$ic32$, (SubLObject)module0555.$ic14$, (SubLObject)module0555.NIL);
                                    SubLObject var88_94 = (SubLObject)module0555.NIL;
                                    final SubLObject var89_95 = (SubLObject)module0555.NIL;
                                    while (module0555.NIL == var88_94) {
                                        final SubLObject var54 = module0052.f3695(var53, var89_95);
                                        final SubLObject var91_97 = (SubLObject)SubLObjectFactory.makeBoolean(!var89_95.eql(var54));
                                        if (module0555.NIL != var91_97) {
                                            var46 = module0178.f11331(var54, (SubLObject)module0555.TWO_INTEGER);
                                            f34223(var41, var46);
                                            if (module0555.NIL == module0077.f5320(var46, var25)) {
                                                module0055.f4021(var46, var26);
                                            }
                                        }
                                        var88_94 = (SubLObject)SubLObjectFactory.makeBoolean(module0555.NIL == var91_97);
                                    }
                                }
                                finally {
                                    final SubLObject var82_98 = Threads.$is_thread_performing_cleanupP$.currentBinding(var24);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0555.T, var24);
                                        if (module0555.NIL != var53) {
                                            module0158.f10319(var53);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var82_98, var24);
                                    }
                                }
                            }
                            var49 = (SubLObject)SubLObjectFactory.makeBoolean(module0555.NIL == var52);
                        }
                    }
                    finally {
                        module0147.$g2096$.rebind(var45, var24);
                        module0147.$g2094$.rebind(var44, var24);
                        module0147.$g2095$.rebind(var43, var24);
                    }
                }
            }
        }
        return var27;
    }
    
    public static SubLObject f34225(final SubLObject var7, SubLObject var14) {
        if (var14 == module0555.UNPROVIDED) {
            var14 = (SubLObject)module0555.NIL;
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = module0077.f5313(Symbols.symbol_function((SubLObject)module0555.EQ), module0549.f33894(var7));
        final SubLObject var17 = module0055.f4017();
        SubLObject var18 = (SubLObject)module0555.NIL;
        final SubLObject var19 = var14;
        final SubLObject var20 = module0147.$g2095$.currentBinding(var15);
        final SubLObject var21 = module0147.$g2094$.currentBinding(var15);
        final SubLObject var22 = module0147.$g2096$.currentBinding(var15);
        try {
            module0147.$g2095$.bind(module0147.f9545(var19), var15);
            module0147.$g2094$.bind(module0147.f9546(var19), var15);
            module0147.$g2096$.bind(module0147.f9549(var19), var15);
            SubLObject var23 = (SubLObject)module0555.NIL;
            final SubLObject var24 = module0555.$ic12$;
            if (module0555.NIL != module0158.f10010(var7, (SubLObject)module0555.ONE_INTEGER, var24)) {
                final SubLObject var25 = module0158.f10011(var7, (SubLObject)module0555.ONE_INTEGER, var24);
                SubLObject var26 = (SubLObject)module0555.NIL;
                final SubLObject var27 = (SubLObject)module0555.NIL;
                while (module0555.NIL == var26) {
                    final SubLObject var28 = module0052.f3695(var25, var27);
                    final SubLObject var29 = (SubLObject)SubLObjectFactory.makeBoolean(!var27.eql(var28));
                    if (module0555.NIL != var29) {
                        SubLObject var30 = (SubLObject)module0555.NIL;
                        try {
                            var30 = module0158.f10316(var28, (SubLObject)module0555.$ic32$, (SubLObject)module0555.$ic14$, (SubLObject)module0555.NIL);
                            SubLObject var88_105 = (SubLObject)module0555.NIL;
                            final SubLObject var89_106 = (SubLObject)module0555.NIL;
                            while (module0555.NIL == var88_105) {
                                final SubLObject var31 = module0052.f3695(var30, var89_106);
                                final SubLObject var91_107 = (SubLObject)SubLObjectFactory.makeBoolean(!var89_106.eql(var31));
                                if (module0555.NIL != var91_107) {
                                    var23 = module0178.f11331(var31, (SubLObject)module0555.TWO_INTEGER);
                                    f34223(var7, var23);
                                    module0055.f4021(var23, var17);
                                }
                                var88_105 = (SubLObject)SubLObjectFactory.makeBoolean(module0555.NIL == var91_107);
                            }
                        }
                        finally {
                            final SubLObject var82_108 = Threads.$is_thread_performing_cleanupP$.currentBinding(var15);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0555.T, var15);
                                if (module0555.NIL != var30) {
                                    module0158.f10319(var30);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var82_108, var15);
                            }
                        }
                    }
                    var26 = (SubLObject)SubLObjectFactory.makeBoolean(module0555.NIL == var29);
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var22, var15);
            module0147.$g2094$.rebind(var21, var15);
            module0147.$g2095$.rebind(var20, var15);
        }
        while (module0555.NIL == module0055.f4019(var17)) {
            final SubLObject var32 = module0055.f4023(var17);
            if (module0555.NIL == module0077.f5320(var32, var16)) {
                module0077.f5326(var32, var16);
                var18 = (SubLObject)ConsesLow.cons(var32, var18);
                final SubLObject var33 = var14;
                final SubLObject var34 = module0147.$g2095$.currentBinding(var15);
                final SubLObject var35 = module0147.$g2094$.currentBinding(var15);
                final SubLObject var36 = module0147.$g2096$.currentBinding(var15);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var33), var15);
                    module0147.$g2094$.bind(module0147.f9546(var33), var15);
                    module0147.$g2096$.bind(module0147.f9549(var33), var15);
                    SubLObject var37 = (SubLObject)module0555.NIL;
                    final SubLObject var38 = module0555.$ic28$;
                    if (module0555.NIL == module0158.f10010(var32, (SubLObject)module0555.ONE_INTEGER, var38)) {
                        continue;
                    }
                    final SubLObject var39 = module0158.f10011(var32, (SubLObject)module0555.ONE_INTEGER, var38);
                    SubLObject var40 = (SubLObject)module0555.NIL;
                    final SubLObject var41 = (SubLObject)module0555.NIL;
                    while (module0555.NIL == var40) {
                        final SubLObject var42 = module0052.f3695(var39, var41);
                        final SubLObject var43 = (SubLObject)SubLObjectFactory.makeBoolean(!var41.eql(var42));
                        if (module0555.NIL != var43) {
                            SubLObject var44 = (SubLObject)module0555.NIL;
                            try {
                                var44 = module0158.f10316(var42, (SubLObject)module0555.$ic32$, (SubLObject)module0555.$ic14$, (SubLObject)module0555.NIL);
                                SubLObject var88_106 = (SubLObject)module0555.NIL;
                                final SubLObject var89_107 = (SubLObject)module0555.NIL;
                                while (module0555.NIL == var88_106) {
                                    final SubLObject var45 = module0052.f3695(var44, var89_107);
                                    final SubLObject var91_108 = (SubLObject)SubLObjectFactory.makeBoolean(!var89_107.eql(var45));
                                    if (module0555.NIL != var91_108) {
                                        var37 = module0178.f11331(var45, (SubLObject)module0555.TWO_INTEGER);
                                        f34223(var32, var37);
                                        if (module0555.NIL == module0077.f5320(var37, var16)) {
                                            module0055.f4021(var37, var17);
                                        }
                                    }
                                    var88_106 = (SubLObject)SubLObjectFactory.makeBoolean(module0555.NIL == var91_108);
                                }
                            }
                            finally {
                                final SubLObject var82_109 = Threads.$is_thread_performing_cleanupP$.currentBinding(var15);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0555.T, var15);
                                    if (module0555.NIL != var44) {
                                        module0158.f10319(var44);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var82_109, var15);
                                }
                            }
                        }
                        var40 = (SubLObject)SubLObjectFactory.makeBoolean(module0555.NIL == var43);
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var36, var15);
                    module0147.$g2094$.rebind(var35, var15);
                    module0147.$g2095$.rebind(var34, var15);
                }
            }
        }
        return Sequences.nreverse(var18);
    }
    
    public static SubLObject f34226(final SubLObject var23, SubLObject var14) {
        if (var14 == module0555.UNPROVIDED) {
            var14 = (SubLObject)module0555.NIL;
        }
        final SubLThread var24 = SubLProcess.currentSubLThread();
        final SubLObject var25 = module0077.f5313(Symbols.symbol_function((SubLObject)module0555.EQ), module0549.f33901(var23));
        final SubLObject var26 = module0055.f4017();
        final SubLObject var27 = module0077.f5313(Symbols.symbol_function((SubLObject)module0555.EQ), module0549.f33895(var23));
        SubLObject var28 = (SubLObject)module0555.NIL;
        module0055.f4021(var23, var26);
        while (module0555.NIL == module0055.f4019(var26)) {
            final SubLObject var29 = module0055.f4023(var26);
            if (module0555.NIL == module0077.f5320(var29, var25)) {
                module0077.f5326(var29, var25);
                SubLObject var30 = var14;
                SubLObject var31 = module0147.$g2095$.currentBinding(var24);
                SubLObject var32 = module0147.$g2094$.currentBinding(var24);
                SubLObject var33 = module0147.$g2096$.currentBinding(var24);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var30), var24);
                    module0147.$g2094$.bind(module0147.f9546(var30), var24);
                    module0147.$g2096$.bind(module0147.f9549(var30), var24);
                    SubLObject var34 = (SubLObject)module0555.NIL;
                    final SubLObject var35 = module0555.$ic12$;
                    if (module0555.NIL != module0158.f10010(var29, (SubLObject)module0555.TWO_INTEGER, var35)) {
                        final SubLObject var36 = module0158.f10011(var29, (SubLObject)module0555.TWO_INTEGER, var35);
                        SubLObject var37 = (SubLObject)module0555.NIL;
                        final SubLObject var38 = (SubLObject)module0555.NIL;
                        while (module0555.NIL == var37) {
                            final SubLObject var39 = module0052.f3695(var36, var38);
                            final SubLObject var40 = (SubLObject)SubLObjectFactory.makeBoolean(!var38.eql(var39));
                            if (module0555.NIL != var40) {
                                SubLObject var41 = (SubLObject)module0555.NIL;
                                try {
                                    var41 = module0158.f10316(var39, (SubLObject)module0555.$ic32$, (SubLObject)module0555.$ic14$, (SubLObject)module0555.NIL);
                                    SubLObject var88_117 = (SubLObject)module0555.NIL;
                                    final SubLObject var89_118 = (SubLObject)module0555.NIL;
                                    while (module0555.NIL == var88_117) {
                                        final SubLObject var42 = module0052.f3695(var41, var89_118);
                                        final SubLObject var91_119 = (SubLObject)SubLObjectFactory.makeBoolean(!var89_118.eql(var42));
                                        if (module0555.NIL != var91_119) {
                                            var34 = module0178.f11331(var42, (SubLObject)module0555.ONE_INTEGER);
                                            f34223(var29, var34);
                                            if (module0555.NIL == module0077.f5320(var34, var27)) {
                                                module0077.f5326(var34, var27);
                                                var28 = (SubLObject)ConsesLow.cons(var34, var28);
                                            }
                                        }
                                        var88_117 = (SubLObject)SubLObjectFactory.makeBoolean(module0555.NIL == var91_119);
                                    }
                                }
                                finally {
                                    final SubLObject var82_120 = Threads.$is_thread_performing_cleanupP$.currentBinding(var24);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0555.T, var24);
                                        if (module0555.NIL != var41) {
                                            module0158.f10319(var41);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var82_120, var24);
                                    }
                                }
                            }
                            var37 = (SubLObject)SubLObjectFactory.makeBoolean(module0555.NIL == var40);
                        }
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var33, var24);
                    module0147.$g2094$.rebind(var32, var24);
                    module0147.$g2095$.rebind(var31, var24);
                }
                var30 = var14;
                var31 = module0147.$g2095$.currentBinding(var24);
                var32 = module0147.$g2094$.currentBinding(var24);
                var33 = module0147.$g2096$.currentBinding(var24);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var30), var24);
                    module0147.$g2094$.bind(module0147.f9546(var30), var24);
                    module0147.$g2096$.bind(module0147.f9549(var30), var24);
                    SubLObject var43 = (SubLObject)module0555.NIL;
                    final SubLObject var35 = module0555.$ic28$;
                    if (module0555.NIL == module0158.f10010(var29, (SubLObject)module0555.TWO_INTEGER, var35)) {
                        continue;
                    }
                    final SubLObject var36 = module0158.f10011(var29, (SubLObject)module0555.TWO_INTEGER, var35);
                    SubLObject var37 = (SubLObject)module0555.NIL;
                    final SubLObject var38 = (SubLObject)module0555.NIL;
                    while (module0555.NIL == var37) {
                        final SubLObject var39 = module0052.f3695(var36, var38);
                        final SubLObject var40 = (SubLObject)SubLObjectFactory.makeBoolean(!var38.eql(var39));
                        if (module0555.NIL != var40) {
                            SubLObject var41 = (SubLObject)module0555.NIL;
                            try {
                                var41 = module0158.f10316(var39, (SubLObject)module0555.$ic32$, (SubLObject)module0555.$ic14$, (SubLObject)module0555.NIL);
                                SubLObject var88_118 = (SubLObject)module0555.NIL;
                                final SubLObject var89_119 = (SubLObject)module0555.NIL;
                                while (module0555.NIL == var88_118) {
                                    final SubLObject var42 = module0052.f3695(var41, var89_119);
                                    final SubLObject var91_120 = (SubLObject)SubLObjectFactory.makeBoolean(!var89_119.eql(var42));
                                    if (module0555.NIL != var91_120) {
                                        var43 = module0178.f11331(var42, (SubLObject)module0555.ONE_INTEGER);
                                        f34223(var29, var43);
                                        if (module0555.NIL == module0077.f5320(var43, var25)) {
                                            module0055.f4021(var43, var26);
                                        }
                                    }
                                    var88_118 = (SubLObject)SubLObjectFactory.makeBoolean(module0555.NIL == var91_120);
                                }
                            }
                            finally {
                                final SubLObject var82_121 = Threads.$is_thread_performing_cleanupP$.currentBinding(var24);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0555.T, var24);
                                    if (module0555.NIL != var41) {
                                        module0158.f10319(var41);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var82_121, var24);
                                }
                            }
                        }
                        var37 = (SubLObject)SubLObjectFactory.makeBoolean(module0555.NIL == var40);
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var33, var24);
                    module0147.$g2094$.rebind(var32, var24);
                    module0147.$g2095$.rebind(var31, var24);
                }
            }
        }
        return Sequences.nreverse(var28);
    }
    
    public static SubLObject f34227(final SubLObject var7, final SubLObject var23, SubLObject var14) {
        if (var14 == module0555.UNPROVIDED) {
            var14 = (SubLObject)module0555.NIL;
        }
        final SubLThread var24 = SubLProcess.currentSubLThread();
        final SubLObject var25 = module0077.f5313(Symbols.symbol_function((SubLObject)module0555.EQ), module0549.f33894(var7));
        final SubLObject var26 = module0055.f4017();
        SubLObject var27 = (SubLObject)module0555.NIL;
        final SubLObject var28 = var14;
        final SubLObject var29 = module0147.$g2095$.currentBinding(var24);
        final SubLObject var30 = module0147.$g2094$.currentBinding(var24);
        final SubLObject var31 = module0147.$g2096$.currentBinding(var24);
        try {
            module0147.$g2095$.bind(module0147.f9545(var28), var24);
            module0147.$g2094$.bind(module0147.f9546(var28), var24);
            module0147.$g2096$.bind(module0147.f9549(var28), var24);
            SubLObject var32 = (SubLObject)module0555.NIL;
            final SubLObject var33 = module0555.$ic22$;
            if (module0555.NIL != module0158.f10010(var7, (SubLObject)module0555.ONE_INTEGER, var33)) {
                final SubLObject var34 = module0158.f10011(var7, (SubLObject)module0555.ONE_INTEGER, var33);
                SubLObject var35 = (SubLObject)module0555.NIL;
                final SubLObject var36 = (SubLObject)module0555.NIL;
                while (module0555.NIL == var35) {
                    final SubLObject var37 = module0052.f3695(var34, var36);
                    final SubLObject var38 = (SubLObject)SubLObjectFactory.makeBoolean(!var36.eql(var37));
                    if (module0555.NIL != var38) {
                        SubLObject var39 = (SubLObject)module0555.NIL;
                        try {
                            var39 = module0158.f10316(var37, (SubLObject)module0555.$ic32$, (SubLObject)module0555.$ic14$, (SubLObject)module0555.NIL);
                            SubLObject var88_127 = (SubLObject)module0555.NIL;
                            final SubLObject var89_128 = (SubLObject)module0555.NIL;
                            while (module0555.NIL == var88_127) {
                                final SubLObject var40 = module0052.f3695(var39, var89_128);
                                final SubLObject var91_129 = (SubLObject)SubLObjectFactory.makeBoolean(!var89_128.eql(var40));
                                if (module0555.NIL != var91_129) {
                                    var32 = module0178.f11331(var40, (SubLObject)module0555.TWO_INTEGER);
                                    f34223(var7, var32);
                                    module0055.f4021(var32, var26);
                                }
                                var88_127 = (SubLObject)SubLObjectFactory.makeBoolean(module0555.NIL == var91_129);
                            }
                        }
                        finally {
                            final SubLObject var82_130 = Threads.$is_thread_performing_cleanupP$.currentBinding(var24);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0555.T, var24);
                                if (module0555.NIL != var39) {
                                    module0158.f10319(var39);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var82_130, var24);
                            }
                        }
                    }
                    var35 = (SubLObject)SubLObjectFactory.makeBoolean(module0555.NIL == var38);
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var31, var24);
            module0147.$g2094$.rebind(var30, var24);
            module0147.$g2095$.rebind(var29, var24);
        }
        while (module0555.NIL == var27 && module0555.NIL == module0055.f4019(var26)) {
            final SubLObject var41 = module0055.f4023(var26);
            if (module0555.NIL == module0077.f5320(var41, var25)) {
                module0077.f5326(var41, var25);
                if (var41.eql(var23)) {
                    var27 = (SubLObject)module0555.T;
                }
                else {
                    final SubLObject var42 = var14;
                    final SubLObject var43 = module0147.$g2095$.currentBinding(var24);
                    final SubLObject var44 = module0147.$g2094$.currentBinding(var24);
                    final SubLObject var45 = module0147.$g2096$.currentBinding(var24);
                    try {
                        module0147.$g2095$.bind(module0147.f9545(var42), var24);
                        module0147.$g2094$.bind(module0147.f9546(var42), var24);
                        module0147.$g2096$.bind(module0147.f9549(var42), var24);
                        SubLObject var46 = (SubLObject)module0555.NIL;
                        final SubLObject var47 = module0555.$ic28$;
                        if (module0555.NIL == module0158.f10010(var41, (SubLObject)module0555.ONE_INTEGER, var47)) {
                            continue;
                        }
                        final SubLObject var48 = module0158.f10011(var41, (SubLObject)module0555.ONE_INTEGER, var47);
                        SubLObject var49 = (SubLObject)module0555.NIL;
                        final SubLObject var50 = (SubLObject)module0555.NIL;
                        while (module0555.NIL == var49) {
                            final SubLObject var51 = module0052.f3695(var48, var50);
                            final SubLObject var52 = (SubLObject)SubLObjectFactory.makeBoolean(!var50.eql(var51));
                            if (module0555.NIL != var52) {
                                SubLObject var53 = (SubLObject)module0555.NIL;
                                try {
                                    var53 = module0158.f10316(var51, (SubLObject)module0555.$ic32$, (SubLObject)module0555.$ic14$, (SubLObject)module0555.NIL);
                                    SubLObject var88_128 = (SubLObject)module0555.NIL;
                                    final SubLObject var89_129 = (SubLObject)module0555.NIL;
                                    while (module0555.NIL == var88_128) {
                                        final SubLObject var54 = module0052.f3695(var53, var89_129);
                                        final SubLObject var91_130 = (SubLObject)SubLObjectFactory.makeBoolean(!var89_129.eql(var54));
                                        if (module0555.NIL != var91_130) {
                                            var46 = module0178.f11331(var54, (SubLObject)module0555.TWO_INTEGER);
                                            f34223(var41, var46);
                                            if (module0555.NIL == module0077.f5320(var46, var25)) {
                                                module0055.f4021(var46, var26);
                                            }
                                        }
                                        var88_128 = (SubLObject)SubLObjectFactory.makeBoolean(module0555.NIL == var91_130);
                                    }
                                }
                                finally {
                                    final SubLObject var82_131 = Threads.$is_thread_performing_cleanupP$.currentBinding(var24);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0555.T, var24);
                                        if (module0555.NIL != var53) {
                                            module0158.f10319(var53);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var82_131, var24);
                                    }
                                }
                            }
                            var49 = (SubLObject)SubLObjectFactory.makeBoolean(module0555.NIL == var52);
                        }
                    }
                    finally {
                        module0147.$g2096$.rebind(var45, var24);
                        module0147.$g2094$.rebind(var44, var24);
                        module0147.$g2095$.rebind(var43, var24);
                    }
                }
            }
        }
        return var27;
    }
    
    public static SubLObject f34228(final SubLObject var7, SubLObject var14) {
        if (var14 == module0555.UNPROVIDED) {
            var14 = (SubLObject)module0555.NIL;
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = module0077.f5313(Symbols.symbol_function((SubLObject)module0555.EQ), module0549.f33894(var7));
        final SubLObject var17 = module0055.f4017();
        SubLObject var18 = (SubLObject)module0555.NIL;
        final SubLObject var19 = var14;
        final SubLObject var20 = module0147.$g2095$.currentBinding(var15);
        final SubLObject var21 = module0147.$g2094$.currentBinding(var15);
        final SubLObject var22 = module0147.$g2096$.currentBinding(var15);
        try {
            module0147.$g2095$.bind(module0147.f9545(var19), var15);
            module0147.$g2094$.bind(module0147.f9546(var19), var15);
            module0147.$g2096$.bind(module0147.f9549(var19), var15);
            SubLObject var23 = (SubLObject)module0555.NIL;
            final SubLObject var24 = module0555.$ic22$;
            if (module0555.NIL != module0158.f10010(var7, (SubLObject)module0555.ONE_INTEGER, var24)) {
                final SubLObject var25 = module0158.f10011(var7, (SubLObject)module0555.ONE_INTEGER, var24);
                SubLObject var26 = (SubLObject)module0555.NIL;
                final SubLObject var27 = (SubLObject)module0555.NIL;
                while (module0555.NIL == var26) {
                    final SubLObject var28 = module0052.f3695(var25, var27);
                    final SubLObject var29 = (SubLObject)SubLObjectFactory.makeBoolean(!var27.eql(var28));
                    if (module0555.NIL != var29) {
                        SubLObject var30 = (SubLObject)module0555.NIL;
                        try {
                            var30 = module0158.f10316(var28, (SubLObject)module0555.$ic32$, (SubLObject)module0555.$ic14$, (SubLObject)module0555.NIL);
                            SubLObject var88_135 = (SubLObject)module0555.NIL;
                            final SubLObject var89_136 = (SubLObject)module0555.NIL;
                            while (module0555.NIL == var88_135) {
                                final SubLObject var31 = module0052.f3695(var30, var89_136);
                                final SubLObject var91_137 = (SubLObject)SubLObjectFactory.makeBoolean(!var89_136.eql(var31));
                                if (module0555.NIL != var91_137) {
                                    var23 = module0178.f11331(var31, (SubLObject)module0555.TWO_INTEGER);
                                    f34223(var7, var23);
                                    module0055.f4021(var23, var17);
                                }
                                var88_135 = (SubLObject)SubLObjectFactory.makeBoolean(module0555.NIL == var91_137);
                            }
                        }
                        finally {
                            final SubLObject var82_138 = Threads.$is_thread_performing_cleanupP$.currentBinding(var15);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0555.T, var15);
                                if (module0555.NIL != var30) {
                                    module0158.f10319(var30);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var82_138, var15);
                            }
                        }
                    }
                    var26 = (SubLObject)SubLObjectFactory.makeBoolean(module0555.NIL == var29);
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var22, var15);
            module0147.$g2094$.rebind(var21, var15);
            module0147.$g2095$.rebind(var20, var15);
        }
        while (module0555.NIL == module0055.f4019(var17)) {
            final SubLObject var32 = module0055.f4023(var17);
            if (module0555.NIL == module0077.f5320(var32, var16)) {
                module0077.f5326(var32, var16);
                var18 = (SubLObject)ConsesLow.cons(var32, var18);
                final SubLObject var33 = var14;
                final SubLObject var34 = module0147.$g2095$.currentBinding(var15);
                final SubLObject var35 = module0147.$g2094$.currentBinding(var15);
                final SubLObject var36 = module0147.$g2096$.currentBinding(var15);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var33), var15);
                    module0147.$g2094$.bind(module0147.f9546(var33), var15);
                    module0147.$g2096$.bind(module0147.f9549(var33), var15);
                    SubLObject var37 = (SubLObject)module0555.NIL;
                    final SubLObject var38 = module0555.$ic28$;
                    if (module0555.NIL == module0158.f10010(var32, (SubLObject)module0555.ONE_INTEGER, var38)) {
                        continue;
                    }
                    final SubLObject var39 = module0158.f10011(var32, (SubLObject)module0555.ONE_INTEGER, var38);
                    SubLObject var40 = (SubLObject)module0555.NIL;
                    final SubLObject var41 = (SubLObject)module0555.NIL;
                    while (module0555.NIL == var40) {
                        final SubLObject var42 = module0052.f3695(var39, var41);
                        final SubLObject var43 = (SubLObject)SubLObjectFactory.makeBoolean(!var41.eql(var42));
                        if (module0555.NIL != var43) {
                            SubLObject var44 = (SubLObject)module0555.NIL;
                            try {
                                var44 = module0158.f10316(var42, (SubLObject)module0555.$ic32$, (SubLObject)module0555.$ic14$, (SubLObject)module0555.NIL);
                                SubLObject var88_136 = (SubLObject)module0555.NIL;
                                final SubLObject var89_137 = (SubLObject)module0555.NIL;
                                while (module0555.NIL == var88_136) {
                                    final SubLObject var45 = module0052.f3695(var44, var89_137);
                                    final SubLObject var91_138 = (SubLObject)SubLObjectFactory.makeBoolean(!var89_137.eql(var45));
                                    if (module0555.NIL != var91_138) {
                                        var37 = module0178.f11331(var45, (SubLObject)module0555.TWO_INTEGER);
                                        f34223(var32, var37);
                                        if (module0555.NIL == module0077.f5320(var37, var16)) {
                                            module0055.f4021(var37, var17);
                                        }
                                    }
                                    var88_136 = (SubLObject)SubLObjectFactory.makeBoolean(module0555.NIL == var91_138);
                                }
                            }
                            finally {
                                final SubLObject var82_139 = Threads.$is_thread_performing_cleanupP$.currentBinding(var15);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0555.T, var15);
                                    if (module0555.NIL != var44) {
                                        module0158.f10319(var44);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var82_139, var15);
                                }
                            }
                        }
                        var40 = (SubLObject)SubLObjectFactory.makeBoolean(module0555.NIL == var43);
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var36, var15);
                    module0147.$g2094$.rebind(var35, var15);
                    module0147.$g2095$.rebind(var34, var15);
                }
            }
        }
        return Sequences.nreverse(var18);
    }
    
    public static SubLObject f34229(final SubLObject var23, SubLObject var14) {
        if (var14 == module0555.UNPROVIDED) {
            var14 = (SubLObject)module0555.NIL;
        }
        final SubLThread var24 = SubLProcess.currentSubLThread();
        final SubLObject var25 = module0077.f5313(Symbols.symbol_function((SubLObject)module0555.EQ), module0549.f33901(var23));
        final SubLObject var26 = module0055.f4017();
        final SubLObject var27 = module0077.f5313(Symbols.symbol_function((SubLObject)module0555.EQ), module0549.f33895(var23));
        SubLObject var28 = (SubLObject)module0555.NIL;
        module0055.f4021(var23, var26);
        while (module0555.NIL == module0055.f4019(var26)) {
            final SubLObject var29 = module0055.f4023(var26);
            if (module0555.NIL == module0077.f5320(var29, var25)) {
                module0077.f5326(var29, var25);
                SubLObject var30 = var14;
                SubLObject var31 = module0147.$g2095$.currentBinding(var24);
                SubLObject var32 = module0147.$g2094$.currentBinding(var24);
                SubLObject var33 = module0147.$g2096$.currentBinding(var24);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var30), var24);
                    module0147.$g2094$.bind(module0147.f9546(var30), var24);
                    module0147.$g2096$.bind(module0147.f9549(var30), var24);
                    SubLObject var34 = (SubLObject)module0555.NIL;
                    final SubLObject var35 = module0555.$ic22$;
                    if (module0555.NIL != module0158.f10010(var29, (SubLObject)module0555.TWO_INTEGER, var35)) {
                        final SubLObject var36 = module0158.f10011(var29, (SubLObject)module0555.TWO_INTEGER, var35);
                        SubLObject var37 = (SubLObject)module0555.NIL;
                        final SubLObject var38 = (SubLObject)module0555.NIL;
                        while (module0555.NIL == var37) {
                            final SubLObject var39 = module0052.f3695(var36, var38);
                            final SubLObject var40 = (SubLObject)SubLObjectFactory.makeBoolean(!var38.eql(var39));
                            if (module0555.NIL != var40) {
                                SubLObject var41 = (SubLObject)module0555.NIL;
                                try {
                                    var41 = module0158.f10316(var39, (SubLObject)module0555.$ic32$, (SubLObject)module0555.$ic14$, (SubLObject)module0555.NIL);
                                    SubLObject var88_143 = (SubLObject)module0555.NIL;
                                    final SubLObject var89_144 = (SubLObject)module0555.NIL;
                                    while (module0555.NIL == var88_143) {
                                        final SubLObject var42 = module0052.f3695(var41, var89_144);
                                        final SubLObject var91_145 = (SubLObject)SubLObjectFactory.makeBoolean(!var89_144.eql(var42));
                                        if (module0555.NIL != var91_145) {
                                            var34 = module0178.f11331(var42, (SubLObject)module0555.ONE_INTEGER);
                                            f34223(var29, var34);
                                            if (module0555.NIL == module0077.f5320(var34, var27)) {
                                                module0077.f5326(var34, var27);
                                                var28 = (SubLObject)ConsesLow.cons(var34, var28);
                                            }
                                        }
                                        var88_143 = (SubLObject)SubLObjectFactory.makeBoolean(module0555.NIL == var91_145);
                                    }
                                }
                                finally {
                                    final SubLObject var82_146 = Threads.$is_thread_performing_cleanupP$.currentBinding(var24);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0555.T, var24);
                                        if (module0555.NIL != var41) {
                                            module0158.f10319(var41);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var82_146, var24);
                                    }
                                }
                            }
                            var37 = (SubLObject)SubLObjectFactory.makeBoolean(module0555.NIL == var40);
                        }
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var33, var24);
                    module0147.$g2094$.rebind(var32, var24);
                    module0147.$g2095$.rebind(var31, var24);
                }
                var30 = var14;
                var31 = module0147.$g2095$.currentBinding(var24);
                var32 = module0147.$g2094$.currentBinding(var24);
                var33 = module0147.$g2096$.currentBinding(var24);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var30), var24);
                    module0147.$g2094$.bind(module0147.f9546(var30), var24);
                    module0147.$g2096$.bind(module0147.f9549(var30), var24);
                    SubLObject var43 = (SubLObject)module0555.NIL;
                    final SubLObject var35 = module0555.$ic28$;
                    if (module0555.NIL == module0158.f10010(var29, (SubLObject)module0555.TWO_INTEGER, var35)) {
                        continue;
                    }
                    final SubLObject var36 = module0158.f10011(var29, (SubLObject)module0555.TWO_INTEGER, var35);
                    SubLObject var37 = (SubLObject)module0555.NIL;
                    final SubLObject var38 = (SubLObject)module0555.NIL;
                    while (module0555.NIL == var37) {
                        final SubLObject var39 = module0052.f3695(var36, var38);
                        final SubLObject var40 = (SubLObject)SubLObjectFactory.makeBoolean(!var38.eql(var39));
                        if (module0555.NIL != var40) {
                            SubLObject var41 = (SubLObject)module0555.NIL;
                            try {
                                var41 = module0158.f10316(var39, (SubLObject)module0555.$ic32$, (SubLObject)module0555.$ic14$, (SubLObject)module0555.NIL);
                                SubLObject var88_144 = (SubLObject)module0555.NIL;
                                final SubLObject var89_145 = (SubLObject)module0555.NIL;
                                while (module0555.NIL == var88_144) {
                                    final SubLObject var42 = module0052.f3695(var41, var89_145);
                                    final SubLObject var91_146 = (SubLObject)SubLObjectFactory.makeBoolean(!var89_145.eql(var42));
                                    if (module0555.NIL != var91_146) {
                                        var43 = module0178.f11331(var42, (SubLObject)module0555.ONE_INTEGER);
                                        f34223(var29, var43);
                                        if (module0555.NIL == module0077.f5320(var43, var25)) {
                                            module0055.f4021(var43, var26);
                                        }
                                    }
                                    var88_144 = (SubLObject)SubLObjectFactory.makeBoolean(module0555.NIL == var91_146);
                                }
                            }
                            finally {
                                final SubLObject var82_147 = Threads.$is_thread_performing_cleanupP$.currentBinding(var24);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0555.T, var24);
                                    if (module0555.NIL != var41) {
                                        module0158.f10319(var41);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var82_147, var24);
                                }
                            }
                        }
                        var37 = (SubLObject)SubLObjectFactory.makeBoolean(module0555.NIL == var40);
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var33, var24);
                    module0147.$g2094$.rebind(var32, var24);
                    module0147.$g2095$.rebind(var31, var24);
                }
            }
        }
        return Sequences.nreverse(var28);
    }
    
    public static SubLObject f34230(final SubLObject var151, final SubLObject var152, SubLObject var14) {
        if (var14 == module0555.UNPROVIDED) {
            var14 = (SubLObject)module0555.NIL;
        }
        final SubLThread var153 = SubLProcess.currentSubLThread();
        final SubLObject var154 = module0077.f5313(Symbols.symbol_function((SubLObject)module0555.EQ), module0549.f33899(var151));
        final SubLObject var155 = module0055.f4017();
        SubLObject var156 = (SubLObject)module0555.NIL;
        module0055.f4021(var151, var155);
        while (module0555.NIL == var156 && module0555.NIL == module0055.f4019(var155)) {
            final SubLObject var157 = module0055.f4023(var155);
            if (module0555.NIL == module0077.f5320(var157, var154)) {
                module0077.f5326(var157, var154);
                if (var157.eql(var152)) {
                    var156 = (SubLObject)module0555.T;
                }
                else {
                    final SubLObject var158 = var14;
                    final SubLObject var159 = module0147.$g2095$.currentBinding(var153);
                    final SubLObject var160 = module0147.$g2094$.currentBinding(var153);
                    final SubLObject var161 = module0147.$g2096$.currentBinding(var153);
                    try {
                        module0147.$g2095$.bind(module0147.f9545(var158), var153);
                        module0147.$g2094$.bind(module0147.f9546(var158), var153);
                        module0147.$g2096$.bind(module0147.f9549(var158), var153);
                        SubLObject var162 = (SubLObject)module0555.NIL;
                        final SubLObject var163 = module0555.$ic28$;
                        if (module0555.NIL == module0158.f10010(var157, (SubLObject)module0555.ONE_INTEGER, var163)) {
                            continue;
                        }
                        final SubLObject var164 = module0158.f10011(var157, (SubLObject)module0555.ONE_INTEGER, var163);
                        SubLObject var165 = (SubLObject)module0555.NIL;
                        final SubLObject var166 = (SubLObject)module0555.NIL;
                        while (module0555.NIL == var165) {
                            final SubLObject var167 = module0052.f3695(var164, var166);
                            final SubLObject var168 = (SubLObject)SubLObjectFactory.makeBoolean(!var166.eql(var167));
                            if (module0555.NIL != var168) {
                                SubLObject var169 = (SubLObject)module0555.NIL;
                                try {
                                    var169 = module0158.f10316(var167, (SubLObject)module0555.$ic32$, (SubLObject)module0555.$ic14$, (SubLObject)module0555.NIL);
                                    SubLObject var88_153 = (SubLObject)module0555.NIL;
                                    final SubLObject var89_154 = (SubLObject)module0555.NIL;
                                    while (module0555.NIL == var88_153) {
                                        final SubLObject var170 = module0052.f3695(var169, var89_154);
                                        final SubLObject var91_155 = (SubLObject)SubLObjectFactory.makeBoolean(!var89_154.eql(var170));
                                        if (module0555.NIL != var91_155) {
                                            var162 = module0178.f11331(var170, (SubLObject)module0555.TWO_INTEGER);
                                            f34223(var157, var162);
                                            if (module0555.NIL == module0077.f5320(var162, var154)) {
                                                module0055.f4021(var162, var155);
                                            }
                                        }
                                        var88_153 = (SubLObject)SubLObjectFactory.makeBoolean(module0555.NIL == var91_155);
                                    }
                                }
                                finally {
                                    final SubLObject var82_156 = Threads.$is_thread_performing_cleanupP$.currentBinding(var153);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0555.T, var153);
                                        if (module0555.NIL != var169) {
                                            module0158.f10319(var169);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var82_156, var153);
                                    }
                                }
                            }
                            var165 = (SubLObject)SubLObjectFactory.makeBoolean(module0555.NIL == var168);
                        }
                    }
                    finally {
                        module0147.$g2096$.rebind(var161, var153);
                        module0147.$g2094$.rebind(var160, var153);
                        module0147.$g2095$.rebind(var159, var153);
                    }
                }
            }
        }
        return var156;
    }
    
    public static SubLObject f34231(final SubLObject var23, SubLObject var14) {
        if (var14 == module0555.UNPROVIDED) {
            var14 = (SubLObject)module0555.NIL;
        }
        final SubLThread var24 = SubLProcess.currentSubLThread();
        final SubLObject var25 = module0077.f5313(Symbols.symbol_function((SubLObject)module0555.EQ), module0549.f33894(var23));
        final SubLObject var26 = module0055.f4017();
        SubLObject var27 = (SubLObject)module0555.NIL;
        module0055.f4021(var23, var26);
        while (module0555.NIL == module0055.f4019(var26)) {
            final SubLObject var28 = module0055.f4023(var26);
            if (module0555.NIL == module0077.f5320(var28, var25)) {
                module0077.f5326(var28, var25);
                var27 = (SubLObject)ConsesLow.cons(var28, var27);
                final SubLObject var29 = var14;
                final SubLObject var30 = module0147.$g2095$.currentBinding(var24);
                final SubLObject var31 = module0147.$g2094$.currentBinding(var24);
                final SubLObject var32 = module0147.$g2096$.currentBinding(var24);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var29), var24);
                    module0147.$g2094$.bind(module0147.f9546(var29), var24);
                    module0147.$g2096$.bind(module0147.f9549(var29), var24);
                    SubLObject var33 = (SubLObject)module0555.NIL;
                    final SubLObject var34 = module0555.$ic28$;
                    if (module0555.NIL == module0158.f10010(var28, (SubLObject)module0555.ONE_INTEGER, var34)) {
                        continue;
                    }
                    final SubLObject var35 = module0158.f10011(var28, (SubLObject)module0555.ONE_INTEGER, var34);
                    SubLObject var36 = (SubLObject)module0555.NIL;
                    final SubLObject var37 = (SubLObject)module0555.NIL;
                    while (module0555.NIL == var36) {
                        final SubLObject var38 = module0052.f3695(var35, var37);
                        final SubLObject var39 = (SubLObject)SubLObjectFactory.makeBoolean(!var37.eql(var38));
                        if (module0555.NIL != var39) {
                            SubLObject var40 = (SubLObject)module0555.NIL;
                            try {
                                var40 = module0158.f10316(var38, (SubLObject)module0555.$ic32$, (SubLObject)module0555.$ic14$, (SubLObject)module0555.NIL);
                                SubLObject var88_157 = (SubLObject)module0555.NIL;
                                final SubLObject var89_158 = (SubLObject)module0555.NIL;
                                while (module0555.NIL == var88_157) {
                                    final SubLObject var41 = module0052.f3695(var40, var89_158);
                                    final SubLObject var91_159 = (SubLObject)SubLObjectFactory.makeBoolean(!var89_158.eql(var41));
                                    if (module0555.NIL != var91_159) {
                                        var33 = module0178.f11331(var41, (SubLObject)module0555.TWO_INTEGER);
                                        f34223(var28, var33);
                                        if (module0555.NIL == module0077.f5320(var33, var25)) {
                                            module0055.f4021(var33, var26);
                                        }
                                    }
                                    var88_157 = (SubLObject)SubLObjectFactory.makeBoolean(module0555.NIL == var91_159);
                                }
                            }
                            finally {
                                final SubLObject var82_160 = Threads.$is_thread_performing_cleanupP$.currentBinding(var24);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0555.T, var24);
                                    if (module0555.NIL != var40) {
                                        module0158.f10319(var40);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var82_160, var24);
                                }
                            }
                        }
                        var36 = (SubLObject)SubLObjectFactory.makeBoolean(module0555.NIL == var39);
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var32, var24);
                    module0147.$g2094$.rebind(var31, var24);
                    module0147.$g2095$.rebind(var30, var24);
                }
            }
        }
        return Sequences.nreverse(var27);
    }
    
    public static SubLObject f34232(final SubLObject var23, SubLObject var14) {
        if (var14 == module0555.UNPROVIDED) {
            var14 = (SubLObject)module0555.NIL;
        }
        final SubLThread var24 = SubLProcess.currentSubLThread();
        final SubLObject var25 = module0077.f5313(Symbols.symbol_function((SubLObject)module0555.EQ), module0549.f33894(var23));
        final SubLObject var26 = module0055.f4017();
        SubLObject var27 = (SubLObject)module0555.NIL;
        module0055.f4021(var23, var26);
        while (module0555.NIL == module0055.f4019(var26)) {
            final SubLObject var28 = module0055.f4023(var26);
            if (module0555.NIL == module0077.f5320(var28, var25)) {
                module0077.f5326(var28, var25);
                var27 = (SubLObject)ConsesLow.cons(var28, var27);
                final SubLObject var29 = var14;
                final SubLObject var30 = module0147.$g2095$.currentBinding(var24);
                final SubLObject var31 = module0147.$g2094$.currentBinding(var24);
                final SubLObject var32 = module0147.$g2096$.currentBinding(var24);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var29), var24);
                    module0147.$g2094$.bind(module0147.f9546(var29), var24);
                    module0147.$g2096$.bind(module0147.f9549(var29), var24);
                    SubLObject var33 = (SubLObject)module0555.NIL;
                    final SubLObject var34 = module0555.$ic28$;
                    if (module0555.NIL == module0158.f10010(var28, (SubLObject)module0555.TWO_INTEGER, var34)) {
                        continue;
                    }
                    final SubLObject var35 = module0158.f10011(var28, (SubLObject)module0555.TWO_INTEGER, var34);
                    SubLObject var36 = (SubLObject)module0555.NIL;
                    final SubLObject var37 = (SubLObject)module0555.NIL;
                    while (module0555.NIL == var36) {
                        final SubLObject var38 = module0052.f3695(var35, var37);
                        final SubLObject var39 = (SubLObject)SubLObjectFactory.makeBoolean(!var37.eql(var38));
                        if (module0555.NIL != var39) {
                            SubLObject var40 = (SubLObject)module0555.NIL;
                            try {
                                var40 = module0158.f10316(var38, (SubLObject)module0555.$ic32$, (SubLObject)module0555.$ic14$, (SubLObject)module0555.NIL);
                                SubLObject var88_161 = (SubLObject)module0555.NIL;
                                final SubLObject var89_162 = (SubLObject)module0555.NIL;
                                while (module0555.NIL == var88_161) {
                                    final SubLObject var41 = module0052.f3695(var40, var89_162);
                                    final SubLObject var91_163 = (SubLObject)SubLObjectFactory.makeBoolean(!var89_162.eql(var41));
                                    if (module0555.NIL != var91_163) {
                                        var33 = module0178.f11331(var41, (SubLObject)module0555.ONE_INTEGER);
                                        f34223(var28, var33);
                                        if (module0555.NIL == module0077.f5320(var33, var25)) {
                                            module0055.f4021(var33, var26);
                                        }
                                    }
                                    var88_161 = (SubLObject)SubLObjectFactory.makeBoolean(module0555.NIL == var91_163);
                                }
                            }
                            finally {
                                final SubLObject var82_164 = Threads.$is_thread_performing_cleanupP$.currentBinding(var24);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0555.T, var24);
                                    if (module0555.NIL != var40) {
                                        module0158.f10319(var40);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var82_164, var24);
                                }
                            }
                        }
                        var36 = (SubLObject)SubLObjectFactory.makeBoolean(module0555.NIL == var39);
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var32, var24);
                    module0147.$g2094$.rebind(var31, var24);
                    module0147.$g2095$.rebind(var30, var24);
                }
            }
        }
        return Sequences.nreverse(var27);
    }
    
    public static SubLObject f34233() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0555", "f34217", "S#37463");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0555", "f34218", "S#37464");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0555", "f34219", "S#37465");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0555", "f34220", "S#37466");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0555", "f34221", "S#37467");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0555", "f34222", "S#37468");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0555", "f34223", "S#37469", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0555", "f34224", "S#37470", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0555", "f34225", "S#37471", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0555", "f34226", "S#37472", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0555", "f34227", "S#37473", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0555", "f34228", "S#37474", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0555", "f34229", "S#37475", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0555", "f34230", "S#37476", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0555", "f34231", "S#37477", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0555", "f34232", "S#37478", 1, 1, false);
        return (SubLObject)module0555.NIL;
    }
    
    public static SubLObject f34234() {
        return (SubLObject)module0555.NIL;
    }
    
    public static SubLObject f34235() {
        return (SubLObject)module0555.NIL;
    }
    
    public void declareFunctions() {
        f34233();
    }
    
    public void initializeVariables() {
        f34234();
    }
    
    public void runTopLevelForms() {
        f34235();
    }
    
    static {
        me = (SubLFile)new module0555();
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15396", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic1$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MT"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic2$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic3$ = SubLObjectFactory.makeKeyword("MT");
        $ic4$ = SubLObjectFactory.makeKeyword("DONE");
        $ic5$ = SubLObjectFactory.makeSymbol("S#11680", "CYC");
        $ic6$ = SubLObjectFactory.makeSymbol("S#37463", "CYC");
        $ic7$ = SubLObjectFactory.makeUninternedSymbol("US#5232609");
        $ic8$ = SubLObjectFactory.makeSymbol("CLET");
        $ic9$ = SubLObjectFactory.makeSymbol("S#12703", "CYC");
        $ic10$ = SubLObjectFactory.makeKeyword("INDEX");
        $ic11$ = SubLObjectFactory.makeKeyword("PREDICATE");
        $ic12$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic13$ = SubLObjectFactory.makeKeyword("TRUTH");
        $ic14$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic15$ = SubLObjectFactory.makeSymbol("S#37469", "CYC");
        $ic16$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15398", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12455", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic17$ = SubLObjectFactory.makeSymbol("S#37464", "CYC");
        $ic18$ = SubLObjectFactory.makeUninternedSymbol("US#36E739C");
        $ic19$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15400", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic20$ = SubLObjectFactory.makeSymbol("S#37465", "CYC");
        $ic21$ = SubLObjectFactory.makeUninternedSymbol("US#5232609");
        $ic22$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $ic23$ = SubLObjectFactory.makeSymbol("S#37466", "CYC");
        $ic24$ = SubLObjectFactory.makeUninternedSymbol("US#36E739C");
        $ic25$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15406", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12455", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic26$ = SubLObjectFactory.makeSymbol("S#37467", "CYC");
        $ic27$ = SubLObjectFactory.makeUninternedSymbol("US#36E739C");
        $ic28$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic29$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15408", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12455", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic30$ = SubLObjectFactory.makeSymbol("S#37468", "CYC");
        $ic31$ = SubLObjectFactory.makeUninternedSymbol("US#36E739C");
        $ic32$ = SubLObjectFactory.makeKeyword("GAF");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0555.class
	Total time: 745 ms
	
	Decompiled with Procyon 0.5.32.
*/