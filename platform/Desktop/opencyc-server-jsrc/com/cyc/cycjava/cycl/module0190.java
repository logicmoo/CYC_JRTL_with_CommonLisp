package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0190 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0190";
    public static final String myFingerPrint = "89a57705f3455f92ee016522c354a16a671e554ecdf75fdcc6208ffbeb678fc4";
    public static SubLSymbol $g2238$;
    public static SubLSymbol $g2239$;
    private static SubLSymbol $g2241$;
    public static SubLSymbol $g2242$;
    public static SubLSymbol $g2243$;
    public static SubLSymbol $g2244$;
    public static SubLSymbol $g2240$;
    private static SubLSymbol $g2245$;
    public static SubLSymbol $g2246$;
    private static final SubLList $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
    private static final SubLList $ic20$;
    private static final SubLString $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLList $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLList $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLList $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLList $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLList $ic44$;
    private static final SubLString $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLList $ic48$;
    private static final SubLString $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    private static final SubLString $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLString $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLString $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLInteger $ic66$;
    private static final SubLList $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLString $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLString $ic74$;
    private static final SubLString $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    
    public static SubLObject f11830(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0190.$ic0$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0190.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0190.$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)module0190.NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)module0190.NIL;
        SubLObject var10_11 = (SubLObject)module0190.NIL;
        while (module0190.NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0190.$ic0$);
            var10_11 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0190.$ic0$);
            if (module0190.NIL == conses_high.member(var10_11, (SubLObject)module0190.$ic1$, (SubLObject)module0190.UNPROVIDED, (SubLObject)module0190.UNPROVIDED)) {
                var9 = (SubLObject)module0190.T;
            }
            if (var10_11 == module0190.$ic2$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (module0190.NIL != var9 && module0190.NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0190.$ic0$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)module0190.$ic3$, var4);
        final SubLObject var11 = (SubLObject)((module0190.NIL != var10) ? conses_high.cadr(var10) : module0190.NIL);
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0190.$ic4$, var4);
        final SubLObject var13 = (SubLObject)((module0190.NIL != var12) ? conses_high.cadr(var12) : module0190.NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)module0190.$ic5$, (SubLObject)module0190.$ic6$, (SubLObject)ConsesLow.list((SubLObject)module0190.$ic7$, (SubLObject)module0190.$ic8$, (SubLObject)ConsesLow.list((SubLObject)module0190.$ic9$, (SubLObject)ConsesLow.list(var6, (SubLObject)module0190.$ic10$, (SubLObject)module0190.$ic11$, var11, (SubLObject)module0190.$ic4$, var13), (SubLObject)ConsesLow.list((SubLObject)module0190.$ic12$, (SubLObject)ConsesLow.list((SubLObject)module0190.$ic13$, var6), (SubLObject)ConsesLow.listS((SubLObject)module0190.$ic14$, (SubLObject)ConsesLow.list((SubLObject)module0190.$ic15$, var6), (SubLObject)ConsesLow.list((SubLObject)module0190.$ic16$, var6, (SubLObject)ConsesLow.list((SubLObject)module0190.$ic17$, var6)), ConsesLow.append(var14, (SubLObject)module0190.NIL))))), (SubLObject)ConsesLow.listS((SubLObject)module0190.$ic18$, (SubLObject)ConsesLow.list(var6, (SubLObject)module0190.$ic19$, (SubLObject)module0190.$ic3$, var11, (SubLObject)module0190.$ic4$, var13), ConsesLow.append(var14, (SubLObject)module0190.NIL)));
    }
    
    public static SubLObject f11831(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0190.$ic20$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0190.NIL;
        SubLObject var7 = (SubLObject)module0190.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0190.$ic20$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0190.$ic20$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)module0190.NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)module0190.NIL;
        SubLObject var25_26 = (SubLObject)module0190.NIL;
        while (module0190.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0190.$ic20$);
            var25_26 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0190.$ic20$);
            if (module0190.NIL == conses_high.member(var25_26, (SubLObject)module0190.$ic1$, (SubLObject)module0190.UNPROVIDED, (SubLObject)module0190.UNPROVIDED)) {
                var10 = (SubLObject)module0190.T;
            }
            if (var25_26 == module0190.$ic2$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0190.NIL != var10 && module0190.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0190.$ic20$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0190.$ic3$, var4);
        final SubLObject var12 = (SubLObject)((module0190.NIL != var11) ? conses_high.cadr(var11) : module0190.$ic21$);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)module0190.$ic4$, var4);
        final SubLObject var14 = (SubLObject)((module0190.NIL != var13) ? conses_high.cadr(var13) : module0190.NIL);
        final SubLObject var15;
        var4 = (var15 = var5);
        final SubLObject var16 = (SubLObject)module0190.$ic22$;
        return (SubLObject)ConsesLow.list((SubLObject)module0190.$ic5$, (SubLObject)module0190.$ic6$, (SubLObject)ConsesLow.list((SubLObject)module0190.$ic23$, (SubLObject)ConsesLow.list(var16, (SubLObject)module0190.$ic24$, var12), (SubLObject)ConsesLow.list((SubLObject)module0190.$ic14$, var14, (SubLObject)ConsesLow.listS((SubLObject)module0190.$ic25$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)module0190.$ic26$, var16)), (SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.list((SubLObject)module0190.$ic27$, var6))), ConsesLow.append(var15, (SubLObject)module0190.NIL)))), (SubLObject)ConsesLow.listS((SubLObject)module0190.$ic28$, (SubLObject)ConsesLow.list(new SubLObject[] { var6, var7, module0190.$ic19$, module0190.$ic29$, module0190.T, module0190.$ic3$, var12, module0190.$ic4$, var14 }), ConsesLow.append(var15, (SubLObject)module0190.NIL)));
    }
    
    public static SubLObject f11832(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0190.$ic20$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0190.NIL;
        SubLObject var7 = (SubLObject)module0190.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0190.$ic20$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0190.$ic20$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)module0190.NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)module0190.NIL;
        SubLObject var36_37 = (SubLObject)module0190.NIL;
        while (module0190.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0190.$ic20$);
            var36_37 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0190.$ic20$);
            if (module0190.NIL == conses_high.member(var36_37, (SubLObject)module0190.$ic1$, (SubLObject)module0190.UNPROVIDED, (SubLObject)module0190.UNPROVIDED)) {
                var10 = (SubLObject)module0190.T;
            }
            if (var36_37 == module0190.$ic2$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0190.NIL != var10 && module0190.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0190.$ic20$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0190.$ic3$, var4);
        final SubLObject var12 = (SubLObject)((module0190.NIL != var11) ? conses_high.cadr(var11) : module0190.$ic21$);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)module0190.$ic4$, var4);
        final SubLObject var14 = (SubLObject)((module0190.NIL != var13) ? conses_high.cadr(var13) : module0190.NIL);
        final SubLObject var15;
        var4 = (var15 = var5);
        final SubLObject var16 = (SubLObject)module0190.$ic30$;
        final SubLObject var17 = (SubLObject)module0190.$ic31$;
        return (SubLObject)ConsesLow.list((SubLObject)module0190.$ic5$, (SubLObject)module0190.$ic6$, (SubLObject)ConsesLow.list((SubLObject)module0190.$ic25$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var17, (SubLObject)ConsesLow.listS((SubLObject)module0190.$ic32$, var12, (SubLObject)module0190.$ic33$))), (SubLObject)ConsesLow.list((SubLObject)module0190.$ic7$, (SubLObject)module0190.$ic8$, (SubLObject)ConsesLow.list((SubLObject)module0190.$ic34$, (SubLObject)ConsesLow.list(var16, var7, (SubLObject)module0190.$ic10$, (SubLObject)module0190.$ic11$, var17, (SubLObject)module0190.$ic4$, var14), (SubLObject)ConsesLow.list((SubLObject)module0190.$ic14$, (SubLObject)ConsesLow.list((SubLObject)module0190.$ic15$, var16), (SubLObject)ConsesLow.list((SubLObject)module0190.$ic12$, (SubLObject)ConsesLow.list((SubLObject)module0190.$ic35$, var16), (SubLObject)ConsesLow.listS((SubLObject)module0190.$ic25$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)module0190.$ic26$, var16))), ConsesLow.append(var15, (SubLObject)module0190.NIL)))))), (SubLObject)ConsesLow.list((SubLObject)module0190.$ic14$, var14, (SubLObject)ConsesLow.list((SubLObject)module0190.$ic16$, var17, (SubLObject)ConsesLow.listS((SubLObject)module0190.$ic32$, var12, (SubLObject)module0190.$ic36$)), (SubLObject)ConsesLow.listS((SubLObject)module0190.$ic37$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)module0190.$ic3$, var17, (SubLObject)module0190.$ic4$, var14), ConsesLow.append(var15, (SubLObject)module0190.NIL)))), (SubLObject)ConsesLow.listS((SubLObject)module0190.$ic38$, (SubLObject)ConsesLow.list(new SubLObject[] { var6, var7, module0190.$ic19$, module0190.$ic3$, var12, module0190.$ic29$, module0190.T, module0190.$ic4$, var14 }), ConsesLow.append(var15, (SubLObject)module0190.NIL)));
    }
    
    public static SubLObject f11833(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0190.$ic0$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0190.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0190.$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)module0190.NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)module0190.NIL;
        SubLObject var48_49 = (SubLObject)module0190.NIL;
        while (module0190.NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0190.$ic0$);
            var48_49 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0190.$ic0$);
            if (module0190.NIL == conses_high.member(var48_49, (SubLObject)module0190.$ic1$, (SubLObject)module0190.UNPROVIDED, (SubLObject)module0190.UNPROVIDED)) {
                var9 = (SubLObject)module0190.T;
            }
            if (var48_49 == module0190.$ic2$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (module0190.NIL != var9 && module0190.NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0190.$ic0$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)module0190.$ic3$, var4);
        final SubLObject var11 = (SubLObject)((module0190.NIL != var10) ? conses_high.cadr(var10) : module0190.NIL);
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0190.$ic4$, var4);
        final SubLObject var13 = (SubLObject)((module0190.NIL != var12) ? conses_high.cadr(var12) : module0190.NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        final SubLObject var15 = (SubLObject)module0190.$ic39$;
        return (SubLObject)ConsesLow.listS((SubLObject)module0190.$ic37$, (SubLObject)ConsesLow.list(var15, var6, (SubLObject)module0190.$ic3$, var11, (SubLObject)module0190.$ic4$, var13), (SubLObject)ConsesLow.list((SubLObject)module0190.$ic40$, var15), ConsesLow.append(var14, (SubLObject)module0190.NIL));
    }
    
    public static SubLObject f11834(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0190.$ic41$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0190.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0190.$ic41$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)module0190.NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)module0190.NIL;
        SubLObject var59_60 = (SubLObject)module0190.NIL;
        while (module0190.NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0190.$ic41$);
            var59_60 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0190.$ic41$);
            if (module0190.NIL == conses_high.member(var59_60, (SubLObject)module0190.$ic1$, (SubLObject)module0190.UNPROVIDED, (SubLObject)module0190.UNPROVIDED)) {
                var9 = (SubLObject)module0190.T;
            }
            if (var59_60 == module0190.$ic2$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (module0190.NIL != var9 && module0190.NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0190.$ic41$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)module0190.$ic3$, var4);
        final SubLObject var11 = (SubLObject)((module0190.NIL != var10) ? conses_high.cadr(var10) : module0190.$ic21$);
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0190.$ic4$, var4);
        final SubLObject var13 = (SubLObject)((module0190.NIL != var12) ? conses_high.cadr(var12) : module0190.NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        final SubLObject var15 = (SubLObject)module0190.$ic42$;
        return (SubLObject)ConsesLow.listS((SubLObject)module0190.$ic43$, (SubLObject)ConsesLow.list(var15, var6, (SubLObject)module0190.$ic3$, var11, (SubLObject)module0190.$ic4$, var13), (SubLObject)ConsesLow.list((SubLObject)module0190.$ic40$, var15), ConsesLow.append(var14, (SubLObject)module0190.NIL));
    }
    
    public static SubLObject f11835(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0190.$ic44$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0190.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0190.$ic44$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)module0190.NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)module0190.NIL;
        SubLObject var69_70 = (SubLObject)module0190.NIL;
        while (module0190.NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0190.$ic44$);
            var69_70 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0190.$ic44$);
            if (module0190.NIL == conses_high.member(var69_70, (SubLObject)module0190.$ic1$, (SubLObject)module0190.UNPROVIDED, (SubLObject)module0190.UNPROVIDED)) {
                var9 = (SubLObject)module0190.T;
            }
            if (var69_70 == module0190.$ic2$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (module0190.NIL != var9 && module0190.NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0190.$ic44$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)module0190.$ic3$, var4);
        final SubLObject var11 = (SubLObject)((module0190.NIL != var10) ? conses_high.cadr(var10) : module0190.$ic45$);
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0190.$ic4$, var4);
        final SubLObject var13 = (SubLObject)((module0190.NIL != var12) ? conses_high.cadr(var12) : module0190.NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)module0190.$ic46$, (SubLObject)ConsesLow.list(var6, (SubLObject)module0190.$ic3$, var11, (SubLObject)module0190.$ic4$, var13), (SubLObject)ConsesLow.listS((SubLObject)module0190.$ic12$, (SubLObject)ConsesLow.list((SubLObject)module0190.$ic47$, var6), ConsesLow.append(var14, (SubLObject)module0190.NIL)));
    }
    
    public static SubLObject f11836(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0190.$ic48$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0190.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0190.$ic48$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)module0190.NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)module0190.NIL;
        SubLObject var79_80 = (SubLObject)module0190.NIL;
        while (module0190.NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0190.$ic48$);
            var79_80 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0190.$ic48$);
            if (module0190.NIL == conses_high.member(var79_80, (SubLObject)module0190.$ic1$, (SubLObject)module0190.UNPROVIDED, (SubLObject)module0190.UNPROVIDED)) {
                var9 = (SubLObject)module0190.T;
            }
            if (var79_80 == module0190.$ic2$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (module0190.NIL != var9 && module0190.NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0190.$ic48$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)module0190.$ic3$, var4);
        final SubLObject var11 = (SubLObject)((module0190.NIL != var10) ? conses_high.cadr(var10) : module0190.$ic49$);
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0190.$ic4$, var4);
        final SubLObject var13 = (SubLObject)((module0190.NIL != var12) ? conses_high.cadr(var12) : module0190.NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)module0190.$ic46$, (SubLObject)ConsesLow.list(var6, (SubLObject)module0190.$ic3$, var11, (SubLObject)module0190.$ic4$, var13), (SubLObject)ConsesLow.listS((SubLObject)module0190.$ic12$, (SubLObject)ConsesLow.list((SubLObject)module0190.$ic50$, var6), ConsesLow.append(var14, (SubLObject)module0190.NIL)));
    }
    
    public static SubLObject f11837(final SubLObject var83, final SubLObject var84) {
        SubLObject var85 = (SubLObject)module0190.NIL;
        if (module0190.NIL == module0190.$g2239$.getGlobalValue()) {
            module0190.$g2239$.setGlobalValue(module0065.f4745(var83, (SubLObject)module0190.ZERO_INTEGER));
            var85 = (SubLObject)module0190.T;
        }
        if (module0190.NIL == module0190.$g2238$.getGlobalValue()) {
            module0190.$g2238$.setGlobalValue(Hashtables.make_hash_table(var83, Symbols.symbol_function((SubLObject)module0190.EQUAL), (SubLObject)module0190.UNPROVIDED));
            var85 = (SubLObject)module0190.T;
        }
        return var85;
    }
    
    public static SubLObject f11838(SubLObject var86) {
        if (var86 == module0190.UNPROVIDED) {
            var86 = (SubLObject)module0190.NIL;
        }
        final SubLThread var87 = SubLProcess.currentSubLThread();
        f11839(var86);
        if (module0190.NIL == var86) {
            final SubLObject var88 = Storage.$current_area$.currentBinding(var87);
            try {
                Storage.$current_area$.bind(Storage.get_static_area(), var87);
                module0065.f4760(module0190.$g2239$.getGlobalValue(), (SubLObject)module0190.UNPROVIDED);
            }
            finally {
                Storage.$current_area$.rebind(var88, var87);
            }
        }
        return (SubLObject)module0190.NIL;
    }
    
    public static SubLObject f11840() {
        module0065.f4762(module0190.$g2239$.getGlobalValue());
        Hashtables.clrhash(module0190.$g2238$.getGlobalValue());
        f11839((SubLObject)module0190.UNPROVIDED);
        return (SubLObject)module0190.NIL;
    }
    
    public static SubLObject f11839(SubLObject var86) {
        if (var86 == module0190.UNPROVIDED) {
            var86 = (SubLObject)module0190.NIL;
        }
        final SubLThread var87 = SubLProcess.currentSubLThread();
        SubLObject var88 = (SubLObject)module0190.MINUS_ONE_INTEGER;
        if (module0190.NIL != var86) {
            var88 = var86;
        }
        else if (module0190.NIL != f11841()) {
            SubLObject var89 = Sequences.cconcatenate((SubLObject)module0190.$ic53$, (SubLObject)module0190.$ic54$);
            final SubLObject var90 = module0190.$g2240$.getGlobalValue();
            SubLObject var91 = (SubLObject)module0190.NIL;
            try {
                var91 = Locks.seize_lock(var90);
                final SubLObject var92 = f11842();
                module0012.$g82$.setDynamicValue(var89, var87);
                module0012.$g73$.setDynamicValue(Time.get_universal_time(), var87);
                module0012.$g83$.setDynamicValue(module0093.f6612(var92), var87);
                module0012.$g84$.setDynamicValue((SubLObject)module0190.ZERO_INTEGER, var87);
                final SubLObject var93 = module0012.$g75$.currentBinding(var87);
                final SubLObject var94 = module0012.$g76$.currentBinding(var87);
                final SubLObject var95 = module0012.$g77$.currentBinding(var87);
                final SubLObject var96 = module0012.$g78$.currentBinding(var87);
                try {
                    module0012.$g75$.bind((SubLObject)module0190.ZERO_INTEGER, var87);
                    module0012.$g76$.bind((SubLObject)module0190.NIL, var87);
                    module0012.$g77$.bind((SubLObject)module0190.T, var87);
                    module0012.$g78$.bind(Time.get_universal_time(), var87);
                    module0012.f478(module0012.$g82$.getDynamicValue(var87));
                    SubLObject var97 = (SubLObject)module0190.NIL;
                    SubLObject var101;
                    for (SubLObject var98 = (SubLObject)module0190.NIL; module0190.NIL == var98; var98 = Types.sublisp_null(var101)) {
                        var87.resetMultipleValues();
                        final SubLObject var99 = module0093.f6632(var92, var97, (SubLObject)module0190.NIL);
                        final SubLObject var100 = var87.secondMultipleValue();
                        var101 = var87.thirdMultipleValue();
                        var87.resetMultipleValues();
                        if (module0190.NIL != var101) {
                            final SubLObject var102 = var99;
                            final SubLObject var103 = var100;
                            module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var87), module0012.$g83$.getDynamicValue(var87));
                            module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var87), (SubLObject)module0190.ONE_INTEGER), var87);
                            if (module0190.NIL == f11843(var102) && module0190.NIL != f11844(var102)) {
                                final SubLObject var104 = f11845(var102);
                                final SubLObject var105 = f11846(var103);
                                var88 = Numbers.max(var88, var105);
                            }
                        }
                        var97 = var101;
                    }
                    module0012.f479();
                }
                finally {
                    module0012.$g78$.rebind(var96, var87);
                    module0012.$g77$.rebind(var95, var87);
                    module0012.$g76$.rebind(var94, var87);
                    module0012.$g75$.rebind(var93, var87);
                }
            }
            finally {
                if (module0190.NIL != var91) {
                    Locks.release_lock(var90);
                }
            }
            var89 = Sequences.cconcatenate((SubLObject)module0190.$ic53$, (SubLObject)module0190.$ic55$);
            if (module0190.NIL != f11841()) {
                final SubLObject var106 = f11847();
                module0012.$g82$.setDynamicValue(var89, var87);
                module0012.$g73$.setDynamicValue(Time.get_universal_time(), var87);
                module0012.$g83$.setDynamicValue(Sequences.length(var106), var87);
                module0012.$g84$.setDynamicValue((SubLObject)module0190.ZERO_INTEGER, var87);
                final SubLObject var93 = module0012.$g75$.currentBinding(var87);
                final SubLObject var94 = module0012.$g76$.currentBinding(var87);
                final SubLObject var95 = module0012.$g77$.currentBinding(var87);
                final SubLObject var96 = module0012.$g78$.currentBinding(var87);
                try {
                    module0012.$g75$.bind((SubLObject)module0190.ZERO_INTEGER, var87);
                    module0012.$g76$.bind((SubLObject)module0190.NIL, var87);
                    module0012.$g77$.bind((SubLObject)module0190.T, var87);
                    module0012.$g78$.bind(Time.get_universal_time(), var87);
                    module0012.f478(module0012.$g82$.getDynamicValue(var87));
                    SubLObject var107 = var106;
                    SubLObject var108 = (SubLObject)module0190.NIL;
                    var108 = var107.first();
                    while (module0190.NIL != var107) {
                        module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var87), module0012.$g83$.getDynamicValue(var87));
                        module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var87), (SubLObject)module0190.ONE_INTEGER), var87);
                        final SubLObject var109 = f11845(var108);
                        final SubLObject var110 = f11848(var109);
                        final SubLObject var111 = f11846(var110);
                        var88 = Numbers.max(var88, var111);
                        var107 = var107.rest();
                        var108 = var107.first();
                    }
                    module0012.f479();
                }
                finally {
                    module0012.$g78$.rebind(var96, var87);
                    module0012.$g77$.rebind(var95, var87);
                    module0012.$g76$.rebind(var94, var87);
                    module0012.$g75$.rebind(var93, var87);
                }
            }
            else {
                final SubLObject var112 = f11849();
                final SubLObject var113 = var89;
                final SubLObject var114 = module0065.f4737(var112);
                SubLObject var115 = (SubLObject)module0190.ZERO_INTEGER;
                assert module0190.NIL != Types.stringp(var113) : var113;
                final SubLObject var116 = module0012.$g75$.currentBinding(var87);
                final SubLObject var117 = module0012.$g76$.currentBinding(var87);
                final SubLObject var118 = module0012.$g77$.currentBinding(var87);
                final SubLObject var119 = module0012.$g78$.currentBinding(var87);
                try {
                    module0012.$g75$.bind((SubLObject)module0190.ZERO_INTEGER, var87);
                    module0012.$g76$.bind((SubLObject)module0190.NIL, var87);
                    module0012.$g77$.bind((SubLObject)module0190.T, var87);
                    module0012.$g78$.bind(Time.get_universal_time(), var87);
                    module0012.f478(var113);
                    final SubLObject var112_113 = var112;
                    if (module0190.NIL == module0065.f4777(var112_113) || module0190.NIL == module0065.f4773((SubLObject)module0190.$ic57$)) {
                        final SubLObject var120 = module0065.f4738(var112_113);
                        SubLObject var121 = module0065.f4739(var112_113);
                        final SubLObject var122 = module0065.f4734(var112_113);
                        final SubLObject var123 = (SubLObject)((module0190.NIL != module0065.f4773((SubLObject)module0190.$ic57$)) ? module0190.NIL : module0190.$ic57$);
                        while (var121.numL(var122)) {
                            final SubLObject var124 = Hashtables.gethash_without_values(var121, var120, var123);
                            if (module0190.NIL == module0065.f4773((SubLObject)module0190.$ic57$) || module0190.NIL == module0065.f4749(var124)) {
                                module0012.note_percent_progress(var115, var114);
                                var115 = Numbers.add(var115, (SubLObject)module0190.ONE_INTEGER);
                                final SubLObject var125 = f11846(var124);
                                var88 = Numbers.max(var88, var125);
                            }
                            var121 = Numbers.add(var121, (SubLObject)module0190.ONE_INTEGER);
                        }
                    }
                    module0012.f479();
                }
                finally {
                    module0012.$g78$.rebind(var119, var87);
                    module0012.$g77$.rebind(var118, var87);
                    module0012.$g76$.rebind(var117, var87);
                    module0012.$g75$.rebind(var116, var87);
                }
            }
        }
        else {
            final SubLObject var126 = f11849();
            final SubLObject var127 = (SubLObject)module0190.$ic53$;
            final SubLObject var128 = module0065.f4733(var126);
            SubLObject var129 = (SubLObject)module0190.ZERO_INTEGER;
            assert module0190.NIL != Types.stringp(var127) : var127;
            final SubLObject var93 = module0012.$g75$.currentBinding(var87);
            final SubLObject var94 = module0012.$g76$.currentBinding(var87);
            final SubLObject var95 = module0012.$g77$.currentBinding(var87);
            final SubLObject var96 = module0012.$g78$.currentBinding(var87);
            try {
                module0012.$g75$.bind((SubLObject)module0190.ZERO_INTEGER, var87);
                module0012.$g76$.bind((SubLObject)module0190.NIL, var87);
                module0012.$g77$.bind((SubLObject)module0190.T, var87);
                module0012.$g78$.bind(Time.get_universal_time(), var87);
                module0012.f478(var127);
                final SubLObject var121_122 = var126;
                if (module0190.NIL == module0065.f4772(var121_122, (SubLObject)module0190.$ic57$)) {
                    final SubLObject var123_124 = var121_122;
                    if (module0190.NIL == module0065.f4775(var123_124, (SubLObject)module0190.$ic57$)) {
                        final SubLObject var130 = module0065.f4740(var123_124);
                        final SubLObject var131 = (SubLObject)module0190.NIL;
                        SubLObject var105;
                        SubLObject var132;
                        SubLObject var133;
                        SubLObject var134;
                        SubLObject var135;
                        for (var132 = Sequences.length(var130), var133 = (SubLObject)module0190.NIL, var133 = (SubLObject)module0190.ZERO_INTEGER; var133.numL(var132); var133 = Numbers.add(var133, (SubLObject)module0190.ONE_INTEGER)) {
                            var134 = ((module0190.NIL != var131) ? Numbers.subtract(var132, var133, (SubLObject)module0190.ONE_INTEGER) : var133);
                            var135 = Vectors.aref(var130, var134);
                            if (module0190.NIL == module0065.f4749(var135) || module0190.NIL == module0065.f4773((SubLObject)module0190.$ic57$)) {
                                if (module0190.NIL != module0065.f4749(var135)) {
                                    var135 = (SubLObject)module0190.$ic57$;
                                }
                                module0012.note_percent_progress(var129, var128);
                                var129 = Numbers.add(var129, (SubLObject)module0190.ONE_INTEGER);
                                var105 = f11846(var135);
                                var88 = Numbers.max(var88, var105);
                            }
                        }
                    }
                    final SubLObject var112_114 = var121_122;
                    if (module0190.NIL == module0065.f4777(var112_114) || module0190.NIL == module0065.f4773((SubLObject)module0190.$ic57$)) {
                        final SubLObject var136 = module0065.f4738(var112_114);
                        SubLObject var137 = module0065.f4739(var112_114);
                        final SubLObject var138 = module0065.f4734(var112_114);
                        final SubLObject var139 = (SubLObject)((module0190.NIL != module0065.f4773((SubLObject)module0190.$ic57$)) ? module0190.NIL : module0190.$ic57$);
                        while (var137.numL(var138)) {
                            final SubLObject var103 = Hashtables.gethash_without_values(var137, var136, var139);
                            if (module0190.NIL == module0065.f4773((SubLObject)module0190.$ic57$) || module0190.NIL == module0065.f4749(var103)) {
                                module0012.note_percent_progress(var129, var128);
                                var129 = Numbers.add(var129, (SubLObject)module0190.ONE_INTEGER);
                                final SubLObject var140 = f11846(var103);
                                var88 = Numbers.max(var88, var140);
                            }
                            var137 = Numbers.add(var137, (SubLObject)module0190.ONE_INTEGER);
                        }
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var96, var87);
                module0012.$g77$.rebind(var95, var87);
                module0012.$g76$.rebind(var94, var87);
                module0012.$g75$.rebind(var93, var87);
            }
        }
        final SubLObject var141 = Numbers.add(var88, (SubLObject)module0190.ONE_INTEGER);
        module0065.f4741(module0190.$g2239$.getGlobalValue(), var141);
        return var141;
    }
    
    public static SubLObject f11850(final SubLObject var104) {
        return module0065.f4750(module0190.$g2239$.getGlobalValue(), var104, (SubLObject)module0190.UNPROVIDED);
    }
    
    public static SubLObject f11851(final SubLObject var21) {
        return Hashtables.gethash_without_values(var21, module0190.$g2238$.getGlobalValue(), (SubLObject)module0190.NIL);
    }
    
    public static SubLObject f11852(final SubLObject var21, final SubLObject var104) {
        module0065.f4753(module0190.$g2239$.getGlobalValue(), var104, var21);
        Hashtables.sethash(var21, module0190.$g2238$.getGlobalValue(), var104);
        return var21;
    }
    
    public static SubLObject f11853(final SubLObject var104) {
        final SubLObject var105 = f11850(var104);
        if (module0190.NIL != var105) {
            module0065.f4761(module0190.$g2239$.getGlobalValue(), var104);
            Hashtables.remhash(var105, module0190.$g2238$.getGlobalValue());
        }
        return module0035.sublisp_boolean(var105);
    }
    
    public static SubLObject f11841() {
        return module0190.$g2241$.getGlobalValue();
    }
    
    public static SubLObject f11842() {
        return module0190.$g2242$.getGlobalValue();
    }
    
    public static SubLObject f11854() {
        return module0190.$g2244$.getGlobalValue();
    }
    
    public static SubLObject f11855() {
        return (module0190.NIL != f11841()) ? f11856() : module0065.f4764(module0190.$g2239$.getGlobalValue());
    }
    
    public static SubLObject f11856() {
        return Errors.error((SubLObject)module0190.$ic64$);
    }
    
    public static SubLObject f11849() {
        return module0190.$g2239$.getGlobalValue();
    }
    
    public static SubLObject f11857(final SubLObject var131) {
        final SubLThread var132 = SubLProcess.currentSubLThread();
        if (module0190.NIL != f11841()) {
            SubLObject var133 = Sequences.cconcatenate((SubLObject)module0190.$ic21$, (SubLObject)module0190.$ic54$);
            final SubLObject var134 = module0190.$g2240$.getGlobalValue();
            SubLObject var135 = (SubLObject)module0190.NIL;
            try {
                var135 = Locks.seize_lock(var134);
                final SubLObject var136 = f11842();
                module0012.$g82$.setDynamicValue(var133, var132);
                module0012.$g73$.setDynamicValue(Time.get_universal_time(), var132);
                module0012.$g83$.setDynamicValue(module0093.f6612(var136), var132);
                module0012.$g84$.setDynamicValue((SubLObject)module0190.ZERO_INTEGER, var132);
                final SubLObject var137 = module0012.$g75$.currentBinding(var132);
                final SubLObject var138 = module0012.$g76$.currentBinding(var132);
                final SubLObject var139 = module0012.$g77$.currentBinding(var132);
                final SubLObject var140 = module0012.$g78$.currentBinding(var132);
                try {
                    module0012.$g75$.bind((SubLObject)module0190.ZERO_INTEGER, var132);
                    module0012.$g76$.bind((SubLObject)module0190.NIL, var132);
                    module0012.$g77$.bind((SubLObject)module0190.T, var132);
                    module0012.$g78$.bind(Time.get_universal_time(), var132);
                    module0012.f478(module0012.$g82$.getDynamicValue(var132));
                    SubLObject var141 = (SubLObject)module0190.NIL;
                    SubLObject var145;
                    for (SubLObject var142 = (SubLObject)module0190.NIL; module0190.NIL == var142; var142 = Types.sublisp_null(var145)) {
                        var132.resetMultipleValues();
                        final SubLObject var143 = module0093.f6632(var136, var141, (SubLObject)module0190.NIL);
                        final SubLObject var144 = var132.secondMultipleValue();
                        var145 = var132.thirdMultipleValue();
                        var132.resetMultipleValues();
                        if (module0190.NIL != var145) {
                            final SubLObject var146 = var143;
                            final SubLObject var147 = var144;
                            module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var132), module0012.$g83$.getDynamicValue(var132));
                            module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var132), (SubLObject)module0190.ONE_INTEGER), var132);
                            if (module0190.NIL == f11843(var146) && module0190.NIL != f11844(var146)) {
                                final SubLObject var148 = f11845(var146);
                                Functions.funcall(var131, var147);
                            }
                        }
                        var141 = var145;
                    }
                    module0012.f479();
                }
                finally {
                    module0012.$g78$.rebind(var140, var132);
                    module0012.$g77$.rebind(var139, var132);
                    module0012.$g76$.rebind(var138, var132);
                    module0012.$g75$.rebind(var137, var132);
                }
            }
            finally {
                if (module0190.NIL != var135) {
                    Locks.release_lock(var134);
                }
            }
            var133 = Sequences.cconcatenate((SubLObject)module0190.$ic21$, (SubLObject)module0190.$ic55$);
            if (module0190.NIL != f11841()) {
                final SubLObject var149 = f11847();
                module0012.$g82$.setDynamicValue(var133, var132);
                module0012.$g73$.setDynamicValue(Time.get_universal_time(), var132);
                module0012.$g83$.setDynamicValue(Sequences.length(var149), var132);
                module0012.$g84$.setDynamicValue((SubLObject)module0190.ZERO_INTEGER, var132);
                final SubLObject var137 = module0012.$g75$.currentBinding(var132);
                final SubLObject var138 = module0012.$g76$.currentBinding(var132);
                final SubLObject var139 = module0012.$g77$.currentBinding(var132);
                final SubLObject var140 = module0012.$g78$.currentBinding(var132);
                try {
                    module0012.$g75$.bind((SubLObject)module0190.ZERO_INTEGER, var132);
                    module0012.$g76$.bind((SubLObject)module0190.NIL, var132);
                    module0012.$g77$.bind((SubLObject)module0190.T, var132);
                    module0012.$g78$.bind(Time.get_universal_time(), var132);
                    module0012.f478(module0012.$g82$.getDynamicValue(var132));
                    SubLObject var150 = var149;
                    SubLObject var151 = (SubLObject)module0190.NIL;
                    var151 = var150.first();
                    while (module0190.NIL != var150) {
                        module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var132), module0012.$g83$.getDynamicValue(var132));
                        module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var132), (SubLObject)module0190.ONE_INTEGER), var132);
                        final SubLObject var152 = f11845(var151);
                        final SubLObject var153 = f11848(var152);
                        Functions.funcall(var131, var153);
                        var150 = var150.rest();
                        var151 = var150.first();
                    }
                    module0012.f479();
                }
                finally {
                    module0012.$g78$.rebind(var140, var132);
                    module0012.$g77$.rebind(var139, var132);
                    module0012.$g76$.rebind(var138, var132);
                    module0012.$g75$.rebind(var137, var132);
                }
            }
            else {
                final SubLObject var154 = f11849();
                final SubLObject var155 = var133;
                final SubLObject var156 = module0065.f4737(var154);
                SubLObject var157 = (SubLObject)module0190.ZERO_INTEGER;
                assert module0190.NIL != Types.stringp(var155) : var155;
                final SubLObject var158 = module0012.$g75$.currentBinding(var132);
                final SubLObject var159 = module0012.$g76$.currentBinding(var132);
                final SubLObject var160 = module0012.$g77$.currentBinding(var132);
                final SubLObject var161 = module0012.$g78$.currentBinding(var132);
                try {
                    module0012.$g75$.bind((SubLObject)module0190.ZERO_INTEGER, var132);
                    module0012.$g76$.bind((SubLObject)module0190.NIL, var132);
                    module0012.$g77$.bind((SubLObject)module0190.T, var132);
                    module0012.$g78$.bind(Time.get_universal_time(), var132);
                    module0012.f478(var155);
                    final SubLObject var112_134 = var154;
                    if (module0190.NIL == module0065.f4777(var112_134) || module0190.NIL == module0065.f4773((SubLObject)module0190.$ic57$)) {
                        final SubLObject var162 = module0065.f4738(var112_134);
                        SubLObject var163 = module0065.f4739(var112_134);
                        final SubLObject var164 = module0065.f4734(var112_134);
                        final SubLObject var165 = (SubLObject)((module0190.NIL != module0065.f4773((SubLObject)module0190.$ic57$)) ? module0190.NIL : module0190.$ic57$);
                        while (var163.numL(var164)) {
                            final SubLObject var166 = Hashtables.gethash_without_values(var163, var162, var165);
                            if (module0190.NIL == module0065.f4773((SubLObject)module0190.$ic57$) || module0190.NIL == module0065.f4749(var166)) {
                                module0012.note_percent_progress(var157, var156);
                                var157 = Numbers.add(var157, (SubLObject)module0190.ONE_INTEGER);
                                Functions.funcall(var131, var166);
                            }
                            var163 = Numbers.add(var163, (SubLObject)module0190.ONE_INTEGER);
                        }
                    }
                    module0012.f479();
                }
                finally {
                    module0012.$g78$.rebind(var161, var132);
                    module0012.$g77$.rebind(var160, var132);
                    module0012.$g76$.rebind(var159, var132);
                    module0012.$g75$.rebind(var158, var132);
                }
            }
        }
        else {
            final SubLObject var167 = f11849();
            final SubLObject var168 = (SubLObject)module0190.$ic21$;
            final SubLObject var169 = module0065.f4733(var167);
            SubLObject var170 = (SubLObject)module0190.ZERO_INTEGER;
            assert module0190.NIL != Types.stringp(var168) : var168;
            final SubLObject var137 = module0012.$g75$.currentBinding(var132);
            final SubLObject var138 = module0012.$g76$.currentBinding(var132);
            final SubLObject var139 = module0012.$g77$.currentBinding(var132);
            final SubLObject var140 = module0012.$g78$.currentBinding(var132);
            try {
                module0012.$g75$.bind((SubLObject)module0190.ZERO_INTEGER, var132);
                module0012.$g76$.bind((SubLObject)module0190.NIL, var132);
                module0012.$g77$.bind((SubLObject)module0190.T, var132);
                module0012.$g78$.bind(Time.get_universal_time(), var132);
                module0012.f478(var168);
                final SubLObject var121_135 = var167;
                if (module0190.NIL == module0065.f4772(var121_135, (SubLObject)module0190.$ic57$)) {
                    final SubLObject var123_136 = var121_135;
                    if (module0190.NIL == module0065.f4775(var123_136, (SubLObject)module0190.$ic57$)) {
                        final SubLObject var171 = module0065.f4740(var123_136);
                        final SubLObject var172 = (SubLObject)module0190.NIL;
                        SubLObject var173;
                        SubLObject var174;
                        SubLObject var175;
                        SubLObject var176;
                        for (var173 = Sequences.length(var171), var174 = (SubLObject)module0190.NIL, var174 = (SubLObject)module0190.ZERO_INTEGER; var174.numL(var173); var174 = Numbers.add(var174, (SubLObject)module0190.ONE_INTEGER)) {
                            var175 = ((module0190.NIL != var172) ? Numbers.subtract(var173, var174, (SubLObject)module0190.ONE_INTEGER) : var174);
                            var176 = Vectors.aref(var171, var175);
                            if (module0190.NIL == module0065.f4749(var176) || module0190.NIL == module0065.f4773((SubLObject)module0190.$ic57$)) {
                                if (module0190.NIL != module0065.f4749(var176)) {
                                    var176 = (SubLObject)module0190.$ic57$;
                                }
                                module0012.note_percent_progress(var170, var169);
                                var170 = Numbers.add(var170, (SubLObject)module0190.ONE_INTEGER);
                                Functions.funcall(var131, var176);
                            }
                        }
                    }
                    final SubLObject var112_135 = var121_135;
                    if (module0190.NIL == module0065.f4777(var112_135) || module0190.NIL == module0065.f4773((SubLObject)module0190.$ic57$)) {
                        final SubLObject var177 = module0065.f4738(var112_135);
                        SubLObject var178 = module0065.f4739(var112_135);
                        final SubLObject var179 = module0065.f4734(var112_135);
                        final SubLObject var180 = (SubLObject)((module0190.NIL != module0065.f4773((SubLObject)module0190.$ic57$)) ? module0190.NIL : module0190.$ic57$);
                        while (var178.numL(var179)) {
                            final SubLObject var147 = Hashtables.gethash_without_values(var178, var177, var180);
                            if (module0190.NIL == module0065.f4773((SubLObject)module0190.$ic57$) || module0190.NIL == module0065.f4749(var147)) {
                                module0012.note_percent_progress(var170, var169);
                                var170 = Numbers.add(var170, (SubLObject)module0190.ONE_INTEGER);
                                Functions.funcall(var131, var147);
                            }
                            var178 = Numbers.add(var178, (SubLObject)module0190.ONE_INTEGER);
                        }
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var140, var132);
                module0012.$g77$.rebind(var139, var132);
                module0012.$g76$.rebind(var138, var132);
                module0012.$g75$.rebind(var137, var132);
            }
        }
        return (SubLObject)module0190.NIL;
    }
    
    public static SubLObject f11858() {
        if (module0190.NIL != f11841()) {
            return f11859((SubLObject)module0190.UNPROVIDED);
        }
        if (module0190.NIL != module0035.sublisp_boolean(module0190.$g2239$.getGlobalValue())) {
            return module0065.f4733(module0190.$g2239$.getGlobalValue());
        }
        return (SubLObject)module0190.ZERO_INTEGER;
    }
    
    public static SubLObject f11859(SubLObject var138) {
        if (var138 == module0190.UNPROVIDED) {
            var138 = (SubLObject)module0190.NIL;
        }
        if (module0190.NIL == module0035.sublisp_boolean(var138)) {
            var138 = f11860();
        }
        return Numbers.add(Numbers.subtract(f11861(), f11862()), Sequences.length(var138));
    }
    
    public static SubLObject f11861() {
        final SubLObject var139 = module0093.f6612(f11842());
        final SubLObject var140 = Numbers.integerDivide(var139, (SubLObject)module0190.TWO_INTEGER);
        return var140;
    }
    
    public static SubLObject f11862() {
        final SubLObject var141 = Hashtables.hash_table_count(f11854());
        final SubLObject var142 = Numbers.integerDivide(var141, (SubLObject)module0190.TWO_INTEGER);
        return var142;
    }
    
    public static SubLObject f11863() {
        return module0057.f4177(module0190.$g2243$.getGlobalValue());
    }
    
    public static SubLObject f11864(final SubLObject var104) {
        return (module0190.NIL != f11841()) ? f11865(var104) : f11850(var104);
    }
    
    public static SubLObject f11866(final SubLObject var21) {
        return (module0190.NIL != f11841()) ? f11867(var21) : f11851(var21);
    }
    
    public static SubLObject f11848(final SubLObject var104) {
        return f11864(var104);
    }
    
    public static SubLObject f11846(final SubLObject var21) {
        return f11866(var21);
    }
    
    public static SubLObject f11868(final SubLObject var143) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0190.NIL != module0212.f13763(var143) && module0190.NIL != f11846(var143));
    }
    
    public static SubLObject f11869(final SubLObject var21, final SubLObject var104) {
        if (module0190.NIL != f11841()) {
            f11870(var21, var104);
        }
        else {
            f11852(var21, var104);
        }
        return var21;
    }
    
    public static SubLObject f11871(final SubLObject var21, final SubLObject var104, final SubLObject var144, final SubLObject var145) {
        if (module0190.NIL == f11841()) {
            module0065.f4754(var144, var104, var21);
            Hashtables.sethash(var21, var145, var104);
        }
        return var21;
    }
    
    public static SubLObject f11872(final SubLObject var104) {
        return (module0190.NIL != f11841()) ? f11873(var104) : f11853(var104);
    }
    
    public static SubLObject f11874() {
        return (module0190.NIL != f11841()) ? module0057.f4175(module0190.$g2243$.getGlobalValue()) : module0065.f4746(module0190.$g2239$.getGlobalValue());
    }
    
    public static SubLObject f11875(final SubLObject var21) {
        SubLObject var22 = f11846(var21);
        if (module0190.NIL == var22) {
            var22 = f11874();
            f11869(var21, var22);
        }
        return var22;
    }
    
    public static SubLObject f11876(SubLObject var86) {
        if (var86 == module0190.UNPROVIDED) {
            var86 = (SubLObject)module0190.NIL;
        }
        if (module0190.NIL != f11841()) {
            f11877(var86);
        }
        else {
            f11838(var86);
        }
        return (SubLObject)module0190.NIL;
    }
    
    public static SubLObject f11878(final SubLObject var21) {
        final SubLObject var22 = f11846(var21);
        return (SubLObject)((module0190.NIL != var22) ? module0189.f11810(var22) : module0190.NIL);
    }
    
    public static SubLObject f11879(final SubLObject var21) {
        return (SubLObject)module0190.NIL;
    }
    
    public static SubLObject f11880(final SubLObject var83, final SubLObject var84) {
        if (var83.numLE((SubLObject)module0190.$ic66$)) {
            module0190.$g2241$.setGlobalValue((SubLObject)module0190.NIL);
        }
        if (module0190.NIL != f11841()) {
            f11877(var83);
        }
        else {
            f11837(var83, var84);
        }
        module0189.f11802(var83, var84);
        return (SubLObject)module0190.NIL;
    }
    
    public static SubLObject f11881() {
        if (module0190.NIL != f11841()) {
            f11882();
        }
        else {
            f11840();
        }
        module0189.f11804();
        return (SubLObject)module0190.NIL;
    }
    
    public static SubLObject f11883(final SubLObject var21, final SubLObject var146, SubLObject var147) {
        if (var147 == module0190.UNPROVIDED) {
            var147 = (SubLObject)module0190.NIL;
        }
        if (module0190.NIL == var146) {
            final SubLObject var148 = f11846(var21);
            if (module0190.NIL != var148) {
                module0189.f11819(var148);
                f11872(var148);
            }
            return var21;
        }
        final SubLObject var148 = (module0190.NIL != var147) ? f11875(var21) : f11846(var21);
        if (module0190.NIL != var148) {
            module0189.f11818(var148, var146);
        }
        return var21;
    }
    
    public static SubLObject f11884(final SubLObject var21) {
        return f11883(var21, module0212.f13757(), (SubLObject)module0190.UNPROVIDED);
    }
    
    public static SubLObject f11885(final SubLObject var21) {
        return f11883(var21, (SubLObject)module0190.NIL, (SubLObject)module0190.UNPROVIDED);
    }
    
    public static SubLObject f11886(final SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        SubLObject var23 = f11846(var21);
        final SubLObject var24 = module0190.$g2246$.getDynamicValue(var22);
        if (module0190.NIL != var24) {
            var23 = module0065.f4750(var24, var23, (SubLObject)module0190.UNPROVIDED);
        }
        return var23;
    }
    
    public static SubLObject f11887(final SubLObject var149) {
        return f11848(var149);
    }
    
    public static SubLObject f11888(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0190.$ic25$, (SubLObject)module0190.$ic67$, ConsesLow.append(var5, (SubLObject)module0190.NIL));
    }
    
    public static SubLObject f11889() {
        if (module0190.NIL != f11841()) {
            return f11890();
        }
        return module0065.f4794(module0190.$g2239$.getGlobalValue());
    }
    
    public static SubLObject f11890() {
        final SubLObject var138 = f11847();
        final SubLObject var139 = f11859(var138);
        final SubLObject var140 = module0065.f4745(var139, (SubLObject)module0190.UNPROVIDED);
        final SubLObject var141 = f11891();
        SubLObject var142 = (SubLObject)module0190.ZERO_INTEGER;
        SubLObject var143;
        SubLObject var144;
        for (var143 = f11861(), var144 = (SubLObject)module0190.NIL, var144 = (SubLObject)module0190.ZERO_INTEGER; var144.numL(var143); var144 = Numbers.add(var144, (SubLObject)module0190.ONE_INTEGER)) {
            f11892(var141, var144);
            if (module0190.NIL == f11843(var141)) {
                module0065.f4754(var140, var144, var142);
                var142 = Numbers.add(var142, (SubLObject)module0190.ONE_INTEGER);
            }
        }
        SubLObject var145 = var138;
        SubLObject var29_157 = (SubLObject)module0190.NIL;
        var29_157 = var145.first();
        while (module0190.NIL != var145) {
            final SubLObject var146 = f11845(var29_157);
            module0065.f4754(var140, var146, var142);
            var142 = Numbers.add(var142, (SubLObject)module0190.ONE_INTEGER);
            var145 = var145.rest();
            var29_157 = var145.first();
        }
        return var140;
    }
    
    public static SubLObject f11893() {
        return (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_T, (SubLObject)module0190.$ic70$);
    }
    
    public static SubLObject f11891() {
        return (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_S, (SubLObject)module0190.$ic70$);
    }
    
    public static SubLObject f11894(final SubLObject var143) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var143.isCons() && Characters.CHAR_T.eql(var143.first()) && module0190.NIL != module0206.f13478(var143.rest()));
    }
    
    public static SubLObject f11844(final SubLObject var143) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var143.isCons() && Characters.CHAR_S.eql(var143.first()) && module0190.NIL != module0004.f106(var143.rest()));
    }
    
    public static SubLObject f11895(final SubLObject var158) {
        return var158.rest();
    }
    
    public static SubLObject f11845(final SubLObject var158) {
        return var158.rest();
    }
    
    public static SubLObject f11896(final SubLObject var158, final SubLObject var21) {
        ConsesLow.rplacd(var158, var21);
        return var158;
    }
    
    public static SubLObject f11892(final SubLObject var158, final SubLObject var104) {
        ConsesLow.rplacd(var158, var104);
        return var158;
    }
    
    public static SubLObject f11843(final SubLObject var158) {
        return f11897(Hashtables.gethash_without_values(var158, module0190.$g2244$.getGlobalValue(), (SubLObject)module0190.UNPROVIDED));
    }
    
    public static SubLObject f11897(final SubLObject var143) {
        return Equality.eq(module0190.$g2245$.getGlobalValue(), var143);
    }
    
    public static SubLObject f11898(final SubLObject var159) {
        final SubLThread var160 = SubLProcess.currentSubLThread();
        final SubLObject var161 = f11893();
        final SubLObject var162 = f11891();
        final SubLObject var163 = Sequences.cconcatenate((SubLObject)module0190.$ic72$, module0006.f203(var159));
        SubLObject var164 = (SubLObject)module0190.NIL;
        var164 = module0093.f6656(var159, module0075.f5180(), (SubLObject)module0190.EQUAL, (SubLObject)module0190.$ic73$);
        if (module0190.NIL != f11841()) {
            SubLObject var165 = Sequences.cconcatenate(var163, (SubLObject)module0190.$ic54$);
            final SubLObject var166 = module0190.$g2240$.getGlobalValue();
            SubLObject var167 = (SubLObject)module0190.NIL;
            try {
                var167 = Locks.seize_lock(var166);
                final SubLObject var168 = f11842();
                module0012.$g82$.setDynamicValue(var165, var160);
                module0012.$g73$.setDynamicValue(Time.get_universal_time(), var160);
                module0012.$g83$.setDynamicValue(module0093.f6612(var168), var160);
                module0012.$g84$.setDynamicValue((SubLObject)module0190.ZERO_INTEGER, var160);
                final SubLObject var169 = module0012.$g75$.currentBinding(var160);
                final SubLObject var170 = module0012.$g76$.currentBinding(var160);
                final SubLObject var171 = module0012.$g77$.currentBinding(var160);
                final SubLObject var172 = module0012.$g78$.currentBinding(var160);
                try {
                    module0012.$g75$.bind((SubLObject)module0190.ZERO_INTEGER, var160);
                    module0012.$g76$.bind((SubLObject)module0190.NIL, var160);
                    module0012.$g77$.bind((SubLObject)module0190.T, var160);
                    module0012.$g78$.bind(Time.get_universal_time(), var160);
                    module0012.f478(module0012.$g82$.getDynamicValue(var160));
                    SubLObject var173 = (SubLObject)module0190.NIL;
                    SubLObject var177;
                    for (SubLObject var174 = (SubLObject)module0190.NIL; module0190.NIL == var174; var174 = Types.sublisp_null(var177)) {
                        var160.resetMultipleValues();
                        final SubLObject var175 = module0093.f6632(var168, var173, (SubLObject)module0190.NIL);
                        final SubLObject var176 = var160.secondMultipleValue();
                        var177 = var160.thirdMultipleValue();
                        var160.resetMultipleValues();
                        if (module0190.NIL != var177) {
                            final SubLObject var178 = var175;
                            final SubLObject var179 = var176;
                            module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var160), module0012.$g83$.getDynamicValue(var160));
                            module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var160), (SubLObject)module0190.ONE_INTEGER), var160);
                            if (module0190.NIL == f11843(var178) && module0190.NIL != f11844(var178)) {
                                final SubLObject var180 = f11845(var178);
                                f11892(var162, var180);
                                module0093.f6657(var162, var164, var179);
                                f11896(var161, var179);
                                module0093.f6657(var161, var164, var180);
                            }
                        }
                        var173 = var177;
                    }
                    module0012.f479();
                }
                finally {
                    module0012.$g78$.rebind(var172, var160);
                    module0012.$g77$.rebind(var171, var160);
                    module0012.$g76$.rebind(var170, var160);
                    module0012.$g75$.rebind(var169, var160);
                }
            }
            finally {
                if (module0190.NIL != var167) {
                    Locks.release_lock(var166);
                }
            }
            var165 = Sequences.cconcatenate(var163, (SubLObject)module0190.$ic55$);
            if (module0190.NIL != f11841()) {
                final SubLObject var181 = f11847();
                module0012.$g82$.setDynamicValue(var165, var160);
                module0012.$g73$.setDynamicValue(Time.get_universal_time(), var160);
                module0012.$g83$.setDynamicValue(Sequences.length(var181), var160);
                module0012.$g84$.setDynamicValue((SubLObject)module0190.ZERO_INTEGER, var160);
                final SubLObject var169 = module0012.$g75$.currentBinding(var160);
                final SubLObject var170 = module0012.$g76$.currentBinding(var160);
                final SubLObject var171 = module0012.$g77$.currentBinding(var160);
                final SubLObject var172 = module0012.$g78$.currentBinding(var160);
                try {
                    module0012.$g75$.bind((SubLObject)module0190.ZERO_INTEGER, var160);
                    module0012.$g76$.bind((SubLObject)module0190.NIL, var160);
                    module0012.$g77$.bind((SubLObject)module0190.T, var160);
                    module0012.$g78$.bind(Time.get_universal_time(), var160);
                    module0012.f478(module0012.$g82$.getDynamicValue(var160));
                    SubLObject var182 = var181;
                    SubLObject var107_165 = (SubLObject)module0190.NIL;
                    var107_165 = var182.first();
                    while (module0190.NIL != var182) {
                        module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var160), module0012.$g83$.getDynamicValue(var160));
                        module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var160), (SubLObject)module0190.ONE_INTEGER), var160);
                        final SubLObject var183 = f11845(var107_165);
                        final SubLObject var184 = f11848(var183);
                        f11892(var162, var183);
                        module0093.f6657(var162, var164, var184);
                        f11896(var161, var184);
                        module0093.f6657(var161, var164, var183);
                        var182 = var182.rest();
                        var107_165 = var182.first();
                    }
                    module0012.f479();
                }
                finally {
                    module0012.$g78$.rebind(var172, var160);
                    module0012.$g77$.rebind(var171, var160);
                    module0012.$g76$.rebind(var170, var160);
                    module0012.$g75$.rebind(var169, var160);
                }
            }
            else {
                final SubLObject var185 = f11849();
                final SubLObject var186 = var165;
                final SubLObject var187 = module0065.f4737(var185);
                SubLObject var188 = (SubLObject)module0190.ZERO_INTEGER;
                assert module0190.NIL != Types.stringp(var186) : var186;
                final SubLObject var189 = module0012.$g75$.currentBinding(var160);
                final SubLObject var190 = module0012.$g76$.currentBinding(var160);
                final SubLObject var191 = module0012.$g77$.currentBinding(var160);
                final SubLObject var192 = module0012.$g78$.currentBinding(var160);
                try {
                    module0012.$g75$.bind((SubLObject)module0190.ZERO_INTEGER, var160);
                    module0012.$g76$.bind((SubLObject)module0190.NIL, var160);
                    module0012.$g77$.bind((SubLObject)module0190.T, var160);
                    module0012.$g78$.bind(Time.get_universal_time(), var160);
                    module0012.f478(var186);
                    final SubLObject var112_166 = var185;
                    if (module0190.NIL == module0065.f4777(var112_166) || module0190.NIL == module0065.f4773((SubLObject)module0190.$ic57$)) {
                        final SubLObject var193 = module0065.f4738(var112_166);
                        SubLObject var194 = module0065.f4739(var112_166);
                        final SubLObject var195 = module0065.f4734(var112_166);
                        final SubLObject var196 = (SubLObject)((module0190.NIL != module0065.f4773((SubLObject)module0190.$ic57$)) ? module0190.NIL : module0190.$ic57$);
                        while (var194.numL(var195)) {
                            final SubLObject var197 = Hashtables.gethash_without_values(var194, var193, var196);
                            if (module0190.NIL == module0065.f4773((SubLObject)module0190.$ic57$) || module0190.NIL == module0065.f4749(var197)) {
                                module0012.note_percent_progress(var188, var187);
                                var188 = Numbers.add(var188, (SubLObject)module0190.ONE_INTEGER);
                                f11892(var162, var194);
                                module0093.f6657(var162, var164, var197);
                                f11896(var161, var197);
                                module0093.f6657(var161, var164, var194);
                            }
                            var194 = Numbers.add(var194, (SubLObject)module0190.ONE_INTEGER);
                        }
                    }
                    module0012.f479();
                }
                finally {
                    module0012.$g78$.rebind(var192, var160);
                    module0012.$g77$.rebind(var191, var160);
                    module0012.$g76$.rebind(var190, var160);
                    module0012.$g75$.rebind(var189, var160);
                }
            }
        }
        else {
            final SubLObject var198 = f11849();
            final SubLObject var199 = var163;
            final SubLObject var200 = module0065.f4733(var198);
            SubLObject var201 = (SubLObject)module0190.ZERO_INTEGER;
            assert module0190.NIL != Types.stringp(var199) : var199;
            final SubLObject var169 = module0012.$g75$.currentBinding(var160);
            final SubLObject var170 = module0012.$g76$.currentBinding(var160);
            final SubLObject var171 = module0012.$g77$.currentBinding(var160);
            final SubLObject var172 = module0012.$g78$.currentBinding(var160);
            try {
                module0012.$g75$.bind((SubLObject)module0190.ZERO_INTEGER, var160);
                module0012.$g76$.bind((SubLObject)module0190.NIL, var160);
                module0012.$g77$.bind((SubLObject)module0190.T, var160);
                module0012.$g78$.bind(Time.get_universal_time(), var160);
                module0012.f478(var199);
                final SubLObject var121_167 = var198;
                if (module0190.NIL == module0065.f4772(var121_167, (SubLObject)module0190.$ic57$)) {
                    final SubLObject var123_168 = var121_167;
                    if (module0190.NIL == module0065.f4775(var123_168, (SubLObject)module0190.$ic57$)) {
                        final SubLObject var202 = module0065.f4740(var123_168);
                        final SubLObject var203 = (SubLObject)module0190.NIL;
                        SubLObject var204;
                        SubLObject var205;
                        SubLObject var206;
                        SubLObject var207;
                        for (var204 = Sequences.length(var202), var205 = (SubLObject)module0190.NIL, var205 = (SubLObject)module0190.ZERO_INTEGER; var205.numL(var204); var205 = Numbers.add(var205, (SubLObject)module0190.ONE_INTEGER)) {
                            var206 = ((module0190.NIL != var203) ? Numbers.subtract(var204, var205, (SubLObject)module0190.ONE_INTEGER) : var205);
                            var207 = Vectors.aref(var202, var206);
                            if (module0190.NIL == module0065.f4749(var207) || module0190.NIL == module0065.f4773((SubLObject)module0190.$ic57$)) {
                                if (module0190.NIL != module0065.f4749(var207)) {
                                    var207 = (SubLObject)module0190.$ic57$;
                                }
                                module0012.note_percent_progress(var201, var200);
                                var201 = Numbers.add(var201, (SubLObject)module0190.ONE_INTEGER);
                                f11892(var162, var206);
                                module0093.f6657(var162, var164, var207);
                                f11896(var161, var207);
                                module0093.f6657(var161, var164, var206);
                            }
                        }
                    }
                    final SubLObject var112_167 = var121_167;
                    if (module0190.NIL == module0065.f4777(var112_167) || module0190.NIL == module0065.f4773((SubLObject)module0190.$ic57$)) {
                        final SubLObject var208 = module0065.f4738(var112_167);
                        SubLObject var209 = module0065.f4739(var112_167);
                        final SubLObject var210 = module0065.f4734(var112_167);
                        final SubLObject var211 = (SubLObject)((module0190.NIL != module0065.f4773((SubLObject)module0190.$ic57$)) ? module0190.NIL : module0190.$ic57$);
                        while (var209.numL(var210)) {
                            final SubLObject var179 = Hashtables.gethash_without_values(var209, var208, var211);
                            if (module0190.NIL == module0065.f4773((SubLObject)module0190.$ic57$) || module0190.NIL == module0065.f4749(var179)) {
                                module0012.note_percent_progress(var201, var200);
                                var201 = Numbers.add(var201, (SubLObject)module0190.ONE_INTEGER);
                                f11892(var162, var209);
                                module0093.f6657(var162, var164, var179);
                                f11896(var161, var179);
                                module0093.f6657(var161, var164, var209);
                            }
                            var209 = Numbers.add(var209, (SubLObject)module0190.ONE_INTEGER);
                        }
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var172, var160);
                module0012.$g77$.rebind(var171, var160);
                module0012.$g76$.rebind(var170, var160);
                module0012.$g75$.rebind(var169, var160);
            }
        }
        module0093.f6658(var164, (SubLObject)module0190.UNPROVIDED, (SubLObject)module0190.UNPROVIDED);
        return var159;
    }
    
    public static SubLObject f11899() {
        final SubLObject var170 = module0107.f7597((SubLObject)module0190.$ic74$, (SubLObject)module0190.$ic75$);
        if (module0190.NIL != Filesys.probe_file(var170)) {
            f11900(var170);
            return (SubLObject)module0190.$ic76$;
        }
        return (SubLObject)module0190.$ic77$;
    }
    
    public static SubLObject f11900(final SubLObject var170) {
        final SubLThread var171 = SubLProcess.currentSubLThread();
        final SubLObject var172 = module0190.$g2240$.getGlobalValue();
        SubLObject var173 = (SubLObject)module0190.NIL;
        try {
            var173 = Locks.seize_lock(var172);
            if (module0190.NIL != module0093.f6457(module0190.$g2242$.getGlobalValue())) {
                SubLObject var174 = (SubLObject)module0190.NIL;
                try {
                    var171.throwStack.push(module0190.$ic78$);
                    final SubLObject var175 = Errors.$error_handler$.currentBinding(var171);
                    try {
                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0190.$ic79$), var171);
                        try {
                            module0093.f6615(module0190.$g2242$.getGlobalValue());
                        }
                        catch (Throwable var176) {
                            Errors.handleThrowable(var176, (SubLObject)module0190.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(var175, var171);
                    }
                }
                catch (Throwable var177) {
                    var174 = Errors.handleThrowable(var177, (SubLObject)module0190.$ic78$);
                }
                finally {
                    var171.throwStack.pop();
                }
            }
            f11901(var170);
        }
        finally {
            if (module0190.NIL != var173) {
                Locks.release_lock(var172);
            }
        }
        return (SubLObject)module0190.NIL;
    }
    
    public static SubLObject f11901(final SubLObject var159) {
        module0190.$g2242$.setGlobalValue(module0093.f6613(var159, (SubLObject)module0190.EQUAL, (SubLObject)module0190.$ic73$));
        return module0093.f6457(module0190.$g2242$.getGlobalValue());
    }
    
    public static SubLObject f11877(final SubLObject var176) {
        module0190.$g2243$.setGlobalValue(module0057.f4173(var176, (SubLObject)module0190.UNPROVIDED, (SubLObject)module0190.UNPROVIDED));
        return var176;
    }
    
    public static SubLObject f11882() {
        module0190.$g2242$.setGlobalValue((SubLObject)module0190.NIL);
        module0190.$g2244$.setGlobalValue(Hashtables.make_hash_table((SubLObject)module0190.TEN_INTEGER, (SubLObject)module0190.EQUAL, (SubLObject)module0190.UNPROVIDED));
        module0190.$g2243$.setGlobalValue(module0057.f4173((SubLObject)module0190.UNPROVIDED, (SubLObject)module0190.UNPROVIDED, (SubLObject)module0190.UNPROVIDED));
        return (SubLObject)module0190.NIL;
    }
    
    public static SubLObject f11865(final SubLObject var104) {
        final SubLObject var105 = f11892(f11891(), var104);
        SubLObject var106 = Hashtables.gethash(var105, module0190.$g2244$.getGlobalValue(), (SubLObject)module0190.UNPROVIDED);
        if (var106.eql(module0190.$g2245$.getGlobalValue())) {
            return (SubLObject)module0190.NIL;
        }
        if (module0190.NIL == var106 && module0190.NIL != f11902(var104) && module0190.NIL != module0093.f6457(module0190.$g2242$.getGlobalValue())) {
            final SubLObject var107 = module0190.$g2240$.getGlobalValue();
            SubLObject var108 = (SubLObject)module0190.NIL;
            try {
                var108 = Locks.seize_lock(var107);
                var106 = module0093.f6621(var105, module0190.$g2242$.getGlobalValue(), (SubLObject)module0190.UNPROVIDED);
            }
            finally {
                if (module0190.NIL != var108) {
                    Locks.release_lock(var107);
                }
            }
        }
        return var106;
    }
    
    public static SubLObject f11867(final SubLObject var21) {
        final SubLObject var22 = f11896(f11893(), var21);
        SubLObject var23 = Hashtables.gethash(var22, module0190.$g2244$.getGlobalValue(), (SubLObject)module0190.UNPROVIDED);
        if (var23.eql(module0190.$g2245$.getGlobalValue())) {
            return (SubLObject)module0190.NIL;
        }
        if (module0190.NIL == var23 && module0190.NIL != module0093.f6457(module0190.$g2242$.getGlobalValue())) {
            final SubLObject var24 = module0190.$g2240$.getGlobalValue();
            SubLObject var25 = (SubLObject)module0190.NIL;
            try {
                var25 = Locks.seize_lock(var24);
                var23 = module0093.f6621(var22, module0190.$g2242$.getGlobalValue(), (SubLObject)module0190.UNPROVIDED);
            }
            finally {
                if (module0190.NIL != var25) {
                    Locks.release_lock(var24);
                }
            }
        }
        return var23;
    }
    
    public static SubLObject f11903() {
        return module0057.f4176(module0190.$g2243$.getGlobalValue());
    }
    
    public static SubLObject f11902(final SubLObject var104) {
        return Numbers.numL(var104, f11903());
    }
    
    public static SubLObject f11870(final SubLObject var21, final SubLObject var104) {
        Hashtables.sethash(f11892(f11891(), var104), module0190.$g2244$.getGlobalValue(), var21);
        Hashtables.sethash(f11896(f11893(), var21), module0190.$g2244$.getGlobalValue(), var104);
        return (SubLObject)module0190.T;
    }
    
    public static SubLObject f11873(final SubLObject var104) {
        final SubLObject var105 = f11865(var104);
        if (module0190.NIL != var105) {
            final SubLObject var106 = f11892(f11891(), var104);
            final SubLObject var107 = f11896(f11893(), var105);
            if (module0190.NIL != f11902(var104)) {
                Hashtables.sethash(var106, module0190.$g2244$.getGlobalValue(), module0190.$g2245$.getGlobalValue());
                Hashtables.sethash(var107, module0190.$g2244$.getGlobalValue(), module0190.$g2245$.getGlobalValue());
            }
            else {
                Hashtables.remhash(var106, module0190.$g2244$.getGlobalValue());
                Hashtables.remhash(var107, module0190.$g2244$.getGlobalValue());
            }
        }
        return module0035.sublisp_boolean(var105);
    }
    
    public static SubLObject f11860() {
        SubLObject var183 = (SubLObject)module0190.NIL;
        final SubLObject var184 = f11854();
        SubLObject var185 = (SubLObject)module0190.NIL;
        SubLObject var186 = (SubLObject)module0190.NIL;
        final Iterator var187 = Hashtables.getEntrySetIterator(var184);
        try {
            while (Hashtables.iteratorHasNext(var187)) {
                final Map.Entry var188 = Hashtables.iteratorNextEntry(var187);
                var185 = Hashtables.getEntryKey(var188);
                var186 = Hashtables.getEntryValue(var188);
                if (module0190.NIL != f11844(var185) && module0190.NIL == f11897(var186)) {
                    var183 = (SubLObject)ConsesLow.cons(var185, var183);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var187);
        }
        return var183;
    }
    
    public static SubLObject f11847() {
        return Sort.sort(f11860(), (SubLObject)module0190.$ic80$, (SubLObject)module0190.$ic26$);
    }
    
    public static SubLObject f11904() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0190", "f11830", "S#14627");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0190", "f11831", "S#14628");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0190", "f11832", "S#14629");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0190", "f11833", "S#14630");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0190", "f11834", "S#14631");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0190", "f11835", "S#14632");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0190", "f11836", "S#14633");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11837", "S#14634", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11838", "S#14635", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11840", "S#14636", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11839", "S#14637", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11850", "S#14638", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11851", "S#14639", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11852", "S#14640", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11853", "S#14641", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11841", "S#14642", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11842", "S#14643", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11854", "S#14644", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11855", "S#14645", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11856", "S#14646", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11849", "S#14647", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11857", "S#14648", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11858", "S#14597", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11859", "S#14649", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11861", "S#14650", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11862", "S#14651", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11863", "S#14652", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11864", "S#14653", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11866", "S#14654", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11848", "S#14655", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11846", "S#14656", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11868", "S#14657", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11869", "S#14658", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11871", "S#14659", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11872", "S#14660", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11874", "S#14661", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11875", "S#14662", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11876", "S#14663", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11878", "S#14664", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11879", "S#14665", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11880", "S#14666", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11881", "S#14667", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11883", "S#14668", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11884", "S#14669", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11885", "S#14670", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11886", "S#14671", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11887", "S#14672", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0190", "f11888", "S#14673");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11889", "S#14674", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11890", "S#14675", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11893", "S#14676", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11891", "S#14677", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11894", "S#14678", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11844", "S#14679", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11895", "S#14680", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11845", "S#14681", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11896", "S#14682", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11892", "S#14683", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11843", "S#14684", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11897", "S#14685", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11898", "CREATE-UNREPRESENTED-TERM-FHT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11899", "S#9548", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11900", "S#14686", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11901", "S#14687", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11877", "S#14688", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11882", "S#14689", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11865", "S#14690", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11867", "S#14691", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11903", "S#14692", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11902", "S#14693", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11870", "S#14694", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11873", "S#14695", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11860", "S#14696", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0190", "f11847", "S#14697", 0, 0, false);
        return (SubLObject)module0190.NIL;
    }
    
    public static SubLObject f11905() {
        module0190.$g2238$ = SubLFiles.deflexical("S#14698", (SubLObject)((module0190.NIL != Symbols.boundp((SubLObject)module0190.$ic51$)) ? module0190.$g2238$.getGlobalValue() : module0190.NIL));
        module0190.$g2239$ = SubLFiles.deflexical("S#14699", (SubLObject)((module0190.NIL != Symbols.boundp((SubLObject)module0190.$ic52$)) ? module0190.$g2239$.getGlobalValue() : module0190.NIL));
        module0190.$g2241$ = SubLFiles.deflexical("S#14700", (SubLObject)module0190.NIL);
        module0190.$g2242$ = SubLFiles.deflexical("S#14701", (SubLObject)((module0190.NIL != Symbols.boundp((SubLObject)module0190.$ic58$)) ? module0190.$g2242$.getGlobalValue() : module0190.NIL));
        module0190.$g2243$ = SubLFiles.deflexical("S#14702", (SubLObject)((module0190.NIL != Symbols.boundp((SubLObject)module0190.$ic59$)) ? module0190.$g2243$.getGlobalValue() : module0190.NIL));
        module0190.$g2244$ = SubLFiles.deflexical("S#14703", (SubLObject)((module0190.NIL != Symbols.boundp((SubLObject)module0190.$ic60$)) ? module0190.$g2244$.getGlobalValue() : module0190.NIL));
        module0190.$g2240$ = SubLFiles.deflexical("S#14704", (module0190.NIL != Symbols.boundp((SubLObject)module0190.$ic61$)) ? module0190.$g2240$.getGlobalValue() : Locks.make_lock((SubLObject)module0190.$ic62$));
        module0190.$g2245$ = SubLFiles.deflexical("S#14705", (SubLObject)module0190.$ic63$);
        module0190.$g2246$ = SubLFiles.defparameter("S#14706", (SubLObject)module0190.NIL);
        return (SubLObject)module0190.NIL;
    }
    
    public static SubLObject f11906() {
        module0003.f57((SubLObject)module0190.$ic51$);
        module0003.f57((SubLObject)module0190.$ic52$);
        module0003.f57((SubLObject)module0190.$ic58$);
        module0003.f57((SubLObject)module0190.$ic59$);
        module0003.f57((SubLObject)module0190.$ic60$);
        module0003.f57((SubLObject)module0190.$ic61$);
        module0002.f50((SubLObject)module0190.$ic65$, (SubLObject)module0190.$ic46$);
        module0002.f50((SubLObject)module0190.$ic68$, (SubLObject)module0190.$ic69$);
        module0002.f38((SubLObject)module0190.$ic71$);
        return (SubLObject)module0190.NIL;
    }
    
    public void declareFunctions() {
        f11904();
    }
    
    public void initializeVariables() {
        f11905();
    }
    
    public void runTopLevelForms() {
        f11906();
    }
    
    static {
        me = (SubLFile)new module0190();
        module0190.$g2238$ = null;
        module0190.$g2239$ = null;
        module0190.$g2241$ = null;
        module0190.$g2242$ = null;
        module0190.$g2243$ = null;
        module0190.$g2244$ = null;
        module0190.$g2240$ = null;
        module0190.$g2245$ = null;
        module0190.$g2246$ = null;
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14707", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#130", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic1$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic2$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic3$ = SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE");
        $ic4$ = SubLObjectFactory.makeKeyword("DONE");
        $ic5$ = SubLObjectFactory.makeSymbol("PIF");
        $ic6$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14642", "CYC"));
        $ic7$ = SubLObjectFactory.makeSymbol("WITH-LOCK-HELD");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14704", "CYC"));
        $ic9$ = SubLObjectFactory.makeSymbol("S#8313", "CYC");
        $ic10$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14643", "CYC"));
        $ic11$ = SubLObjectFactory.makeKeyword("MESSAGE");
        $ic12$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic13$ = SubLObjectFactory.makeSymbol("S#14678", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("PUNLESS");
        $ic15$ = SubLObjectFactory.makeSymbol("S#14684", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic17$ = SubLObjectFactory.makeSymbol("S#14680", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#10461", "CYC");
        $ic19$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14647", "CYC"));
        $ic20$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1519", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#130", "CYC"), (SubLObject)SubLObjectFactory.makeString("mapping Cyc unrepresented terms")), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic21$ = SubLObjectFactory.makeString("mapping Cyc unrepresented terms");
        $ic22$ = SubLObjectFactory.makeUninternedSymbol("US#1C4DC79");
        $ic23$ = SubLObjectFactory.makeSymbol("PROGRESS-CDOLIST");
        $ic24$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14697", "CYC"));
        $ic25$ = SubLObjectFactory.makeSymbol("CLET");
        $ic26$ = SubLObjectFactory.makeSymbol("S#14681", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("S#14655", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#6340", "CYC");
        $ic29$ = SubLObjectFactory.makeKeyword("ORDERED");
        $ic30$ = SubLObjectFactory.makeUninternedSymbol("US#3165895");
        $ic31$ = SubLObjectFactory.makeUninternedSymbol("US#74E6892");
        $ic32$ = SubLObjectFactory.makeSymbol("CCONCATENATE");
        $ic33$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(" -- Old Space"));
        $ic34$ = SubLObjectFactory.makeSymbol("S#8308", "CYC");
        $ic35$ = SubLObjectFactory.makeSymbol("S#14679", "CYC");
        $ic36$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(" -- New Space"));
        $ic37$ = SubLObjectFactory.makeSymbol("S#14628", "CYC");
        $ic38$ = SubLObjectFactory.makeSymbol("DO-ID-INDEX");
        $ic39$ = SubLObjectFactory.makeUninternedSymbol("US#1124883");
        $ic40$ = SubLObjectFactory.makeSymbol("IGNORE");
        $ic41$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#54", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#130", "CYC"), (SubLObject)SubLObjectFactory.makeString("mapping Cyc unrepresented terms")), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic42$ = SubLObjectFactory.makeUninternedSymbol("US#1124883");
        $ic43$ = SubLObjectFactory.makeSymbol("S#14629", "CYC");
        $ic44$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#54", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#130", "CYC"), (SubLObject)SubLObjectFactory.makeString("mapping Cyc strings")), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic45$ = SubLObjectFactory.makeString("mapping Cyc strings");
        $ic46$ = SubLObjectFactory.makeSymbol("S#14631", "CYC");
        $ic47$ = SubLObjectFactory.makeSymbol("SUBL-STRING-P");
        $ic48$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#54", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#130", "CYC"), (SubLObject)SubLObjectFactory.makeString("mapping Cyc numbers")), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic49$ = SubLObjectFactory.makeString("mapping Cyc numbers");
        $ic50$ = SubLObjectFactory.makeSymbol("S#14708", "CYC");
        $ic51$ = SubLObjectFactory.makeSymbol("S#14698", "CYC");
        $ic52$ = SubLObjectFactory.makeSymbol("S#14699", "CYC");
        $ic53$ = SubLObjectFactory.makeString("Determining maximum unrepresented-term SUID");
        $ic54$ = SubLObjectFactory.makeString(" -- Old Space");
        $ic55$ = SubLObjectFactory.makeString(" -- New Space");
        $ic56$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic57$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic58$ = SubLObjectFactory.makeSymbol("S#14701", "CYC");
        $ic59$ = SubLObjectFactory.makeSymbol("S#14702", "CYC");
        $ic60$ = SubLObjectFactory.makeSymbol("S#14703", "CYC");
        $ic61$ = SubLObjectFactory.makeSymbol("S#14704", "CYC");
        $ic62$ = SubLObjectFactory.makeString("Unrepresented Terms FHT Lock");
        $ic63$ = SubLObjectFactory.makeKeyword("DELETED");
        $ic64$ = SubLObjectFactory.makeString("Not yet implemented.");
        $ic65$ = SubLObjectFactory.makeSymbol("S#14647", "CYC");
        $ic66$ = SubLObjectFactory.makeInteger(10000);
        $ic67$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14706", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14674", "CYC"))));
        $ic68$ = SubLObjectFactory.makeSymbol("S#14674", "CYC");
        $ic69$ = SubLObjectFactory.makeSymbol("S#14673", "CYC");
        $ic70$ = SubLObjectFactory.makeKeyword("MARKER");
        $ic71$ = SubLObjectFactory.makeSymbol("CREATE-UNREPRESENTED-TERM-FHT");
        $ic72$ = SubLObjectFactory.makeString("Creating unrepresented term FHT ");
        $ic73$ = SubLObjectFactory.makeKeyword("IMAGE-INDEPENDENT-CFASL");
        $ic74$ = SubLObjectFactory.makeString("unrepresented-terms");
        $ic75$ = SubLObjectFactory.makeString("fht");
        $ic76$ = SubLObjectFactory.makeKeyword("INITIALIZED");
        $ic77$ = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $ic78$ = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $ic79$ = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic80$ = SubLObjectFactory.makeSymbol("<");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0190.class
	Total time: 549 ms
	
	Decompiled with Procyon 0.5.32.
*/