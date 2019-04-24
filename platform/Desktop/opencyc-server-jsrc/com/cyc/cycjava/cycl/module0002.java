package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0002 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0002";
    public static final String myFingerPrint = "1b894c3f405cedc647b83199c1dc720b9ba321880eadd90e42a952f9f5af263e";
    private static SubLSymbol $g1$;
    private static SubLSymbol $g2$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLString $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLList $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLList $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLList $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLList $ic32$;
    private static final SubLList $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLString $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLList $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLString $ic39$;
    private static final SubLString $ic40$;
    private static final SubLString $ic41$;
    private static final SubLString $ic42$;
    private static final SubLString $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLInteger $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLList $ic56$;
    private static final SubLSymbol $ic57$;
    
    public static SubLObject f9(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0002.NIL;
        SubLObject var6 = (SubLObject)module0002.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0002.$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0002.$ic0$);
        var6 = var4.first();
        final SubLObject var7;
        var4 = (var7 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0002.$ic1$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic2$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic3$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic4$, (SubLObject)module0002.$ic5$, var5))), (SubLObject)ConsesLow.listS((SubLObject)module0002.$ic6$, var5, var6, ConsesLow.append(var7, (SubLObject)module0002.NIL)));
    }
    
    public static SubLObject f10(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0002.NIL;
        SubLObject var6 = (SubLObject)module0002.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0002.$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0002.$ic0$);
        var6 = var4.first();
        final SubLObject var7;
        var4 = (var7 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0002.$ic1$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic2$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic3$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic4$, (SubLObject)module0002.$ic7$, var5))), (SubLObject)ConsesLow.listS((SubLObject)module0002.$ic6$, var5, var6, ConsesLow.append(var7, (SubLObject)module0002.NIL)));
    }
    
    public static SubLObject f11(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0002.NIL;
        SubLObject var6 = (SubLObject)module0002.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0002.$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0002.$ic0$);
        var6 = var4.first();
        final SubLObject var7;
        var4 = (var7 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0002.$ic1$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic2$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic3$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic4$, (SubLObject)module0002.$ic8$, var5))), (SubLObject)ConsesLow.listS((SubLObject)module0002.$ic6$, var5, var6, ConsesLow.append(var7, (SubLObject)module0002.NIL)));
    }
    
    public static SubLObject f12(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var5;
        final SubLObject var4 = var5 = var1.rest();
        SubLObject var6 = (SubLObject)module0002.NIL;
        SubLObject var7 = (SubLObject)module0002.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0002.$ic9$);
        var6 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0002.$ic9$);
        var7 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0002.$ic9$);
        final SubLObject var8 = var5.rest();
        var5 = var5.first();
        SubLObject var9 = (SubLObject)module0002.NIL;
        SubLObject var10 = var5;
        SubLObject var11 = (SubLObject)module0002.NIL;
        SubLObject var19_20 = (SubLObject)module0002.NIL;
        while (module0002.NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var4, (SubLObject)module0002.$ic9$);
            var19_20 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var4, (SubLObject)module0002.$ic9$);
            if (module0002.NIL == conses_high.member(var19_20, (SubLObject)module0002.$ic10$, (SubLObject)module0002.UNPROVIDED, (SubLObject)module0002.UNPROVIDED)) {
                var11 = (SubLObject)module0002.T;
            }
            if (var19_20 == module0002.$ic11$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (module0002.NIL != var11 && module0002.NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)module0002.$ic9$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0002.$ic12$, var5);
        final SubLObject var13 = (SubLObject)((module0002.NIL != var12) ? conses_high.cadr(var12) : module0002.NIL);
        final SubLObject var14;
        var5 = (var14 = var8);
        if (module0002.NIL == Errors.$ignore_mustsP$.getDynamicValue(var3) && module0002.NIL == f13(var13)) {
            Errors.error((SubLObject)module0002.$ic13$, var13);
        }
        return (SubLObject)ConsesLow.list((SubLObject)module0002.$ic1$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic14$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic3$, var6), (SubLObject)ConsesLow.list((SubLObject)module0002.$ic3$, var13)), (SubLObject)ConsesLow.listS((SubLObject)module0002.$ic15$, var6, var7, ConsesLow.append(var14, (SubLObject)module0002.NIL)));
    }
    
    public static SubLObject f13(final SubLObject var23) {
        if (var23.isSymbol()) {
            return (SubLObject)module0002.T;
        }
        if (var23.isAtom()) {
            return (SubLObject)module0002.NIL;
        }
        SubLObject var24 = var23;
        SubLObject var25 = (SubLObject)module0002.NIL;
        var25 = var24.first();
        while (module0002.NIL != var24) {
            if (!var25.isSymbol()) {
                return (SubLObject)module0002.NIL;
            }
            var24 = var24.rest();
            var25 = var24.first();
        }
        return (SubLObject)module0002.T;
    }
    
    public static SubLObject f14(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0002.NIL;
        SubLObject var6 = (SubLObject)module0002.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0002.$ic16$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0002.$ic16$);
        var6 = var4.first();
        final SubLObject var7;
        var4 = (var7 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0002.$ic1$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic2$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic3$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic4$, (SubLObject)module0002.$ic5$, var5))), (SubLObject)ConsesLow.listS((SubLObject)module0002.$ic17$, var5, var6, ConsesLow.append(var7, (SubLObject)module0002.NIL)));
    }
    
    public static SubLObject f15(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0002.NIL;
        SubLObject var6 = (SubLObject)module0002.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0002.$ic16$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0002.$ic16$);
        var6 = var4.first();
        final SubLObject var7;
        var4 = (var7 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0002.$ic1$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic2$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic3$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic4$, (SubLObject)module0002.$ic7$, var5))), (SubLObject)ConsesLow.listS((SubLObject)module0002.$ic17$, var5, var6, ConsesLow.append(var7, (SubLObject)module0002.NIL)));
    }
    
    public static SubLObject f16(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0002.NIL;
        SubLObject var6 = (SubLObject)module0002.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0002.$ic16$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0002.$ic16$);
        var6 = var4.first();
        final SubLObject var7;
        var4 = (var7 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0002.$ic1$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic2$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic3$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic4$, (SubLObject)module0002.$ic8$, var5))), (SubLObject)ConsesLow.listS((SubLObject)module0002.$ic17$, var5, var6, ConsesLow.append(var7, (SubLObject)module0002.NIL)));
    }
    
    public static SubLObject f17(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var5;
        final SubLObject var4 = var5 = var1.rest();
        SubLObject var6 = (SubLObject)module0002.NIL;
        SubLObject var7 = (SubLObject)module0002.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0002.$ic18$);
        var6 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0002.$ic18$);
        var7 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0002.$ic18$);
        final SubLObject var8 = var5.rest();
        var5 = var5.first();
        SubLObject var9 = (SubLObject)module0002.NIL;
        SubLObject var10 = var5;
        SubLObject var11 = (SubLObject)module0002.NIL;
        SubLObject var39_40 = (SubLObject)module0002.NIL;
        while (module0002.NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var4, (SubLObject)module0002.$ic18$);
            var39_40 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var4, (SubLObject)module0002.$ic18$);
            if (module0002.NIL == conses_high.member(var39_40, (SubLObject)module0002.$ic10$, (SubLObject)module0002.UNPROVIDED, (SubLObject)module0002.UNPROVIDED)) {
                var11 = (SubLObject)module0002.T;
            }
            if (var39_40 == module0002.$ic11$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (module0002.NIL != var11 && module0002.NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)module0002.$ic18$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0002.$ic12$, var5);
        final SubLObject var13 = (SubLObject)((module0002.NIL != var12) ? conses_high.cadr(var12) : module0002.NIL);
        final SubLObject var14;
        var5 = (var14 = var8);
        if (module0002.NIL == Errors.$ignore_mustsP$.getDynamicValue(var3) && module0002.NIL == f13(var13)) {
            Errors.error((SubLObject)module0002.$ic13$, var13);
        }
        return (SubLObject)ConsesLow.list((SubLObject)module0002.$ic1$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic14$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic3$, var6), (SubLObject)ConsesLow.list((SubLObject)module0002.$ic3$, var13)), (SubLObject)ConsesLow.listS((SubLObject)module0002.$ic19$, var6, var7, ConsesLow.append(var14, (SubLObject)module0002.NIL)));
    }
    
    public static SubLObject f18(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0002.NIL;
        SubLObject var6 = (SubLObject)module0002.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0002.$ic20$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0002.$ic20$);
        var6 = var4.first();
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : module0002.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0002.$ic20$);
        var4 = var4.rest();
        if (module0002.NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)module0002.$ic1$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic2$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic3$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic21$, (SubLObject)module0002.$ic5$, var5))), (SubLObject)ConsesLow.list((SubLObject)module0002.$ic22$, var5, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0002.$ic20$);
        return (SubLObject)module0002.NIL;
    }
    
    public static SubLObject f19(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0002.NIL;
        SubLObject var6 = (SubLObject)module0002.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0002.$ic20$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0002.$ic20$);
        var6 = var4.first();
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : module0002.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0002.$ic20$);
        var4 = var4.rest();
        if (module0002.NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)module0002.$ic1$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic2$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic3$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic21$, (SubLObject)module0002.$ic7$, var5))), (SubLObject)ConsesLow.list((SubLObject)module0002.$ic22$, var5, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0002.$ic20$);
        return (SubLObject)module0002.NIL;
    }
    
    public static SubLObject f20(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0002.NIL;
        SubLObject var6 = (SubLObject)module0002.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0002.$ic20$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0002.$ic20$);
        var6 = var4.first();
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : module0002.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0002.$ic20$);
        var4 = var4.rest();
        if (module0002.NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)module0002.$ic1$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic2$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic3$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic21$, (SubLObject)module0002.$ic8$, var5))), (SubLObject)ConsesLow.list((SubLObject)module0002.$ic22$, var5, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0002.$ic20$);
        return (SubLObject)module0002.NIL;
    }
    
    public static SubLObject f21(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0002.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0002.$ic23$);
        var5 = var4.first();
        var4 = var4.rest();
        final SubLObject var6 = (SubLObject)(var4.isCons() ? var4.first() : module0002.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0002.$ic23$);
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : module0002.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0002.$ic23$);
        var4 = var4.rest();
        if (module0002.NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)module0002.$ic1$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic2$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic3$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic21$, (SubLObject)module0002.$ic5$, var5))), (SubLObject)ConsesLow.list((SubLObject)module0002.$ic24$, var5, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0002.$ic23$);
        return (SubLObject)module0002.NIL;
    }
    
    public static SubLObject f22(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0002.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0002.$ic23$);
        var5 = var4.first();
        var4 = var4.rest();
        final SubLObject var6 = (SubLObject)(var4.isCons() ? var4.first() : module0002.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0002.$ic23$);
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : module0002.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0002.$ic23$);
        var4 = var4.rest();
        if (module0002.NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)module0002.$ic1$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic2$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic3$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic21$, (SubLObject)module0002.$ic7$, var5))), (SubLObject)ConsesLow.list((SubLObject)module0002.$ic24$, var5, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0002.$ic23$);
        return (SubLObject)module0002.NIL;
    }
    
    public static SubLObject f23(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0002.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0002.$ic23$);
        var5 = var4.first();
        var4 = var4.rest();
        final SubLObject var6 = (SubLObject)(var4.isCons() ? var4.first() : module0002.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0002.$ic23$);
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : module0002.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0002.$ic23$);
        var4 = var4.rest();
        if (module0002.NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)module0002.$ic1$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic2$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic3$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic21$, (SubLObject)module0002.$ic8$, var5))), (SubLObject)ConsesLow.list((SubLObject)module0002.$ic24$, var5, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0002.$ic23$);
        return (SubLObject)module0002.NIL;
    }
    
    public static SubLObject f24(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0002.NIL;
        SubLObject var6 = (SubLObject)module0002.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0002.$ic20$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0002.$ic20$);
        var6 = var4.first();
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : module0002.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0002.$ic20$);
        var4 = var4.rest();
        if (module0002.NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)module0002.$ic1$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic2$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic3$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic21$, (SubLObject)module0002.$ic5$, var5))), (SubLObject)ConsesLow.list((SubLObject)module0002.$ic25$, var5, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0002.$ic20$);
        return (SubLObject)module0002.NIL;
    }
    
    public static SubLObject f25(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0002.NIL;
        SubLObject var6 = (SubLObject)module0002.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0002.$ic20$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0002.$ic20$);
        var6 = var4.first();
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : module0002.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0002.$ic20$);
        var4 = var4.rest();
        if (module0002.NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)module0002.$ic1$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic2$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic3$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic21$, (SubLObject)module0002.$ic7$, var5))), (SubLObject)ConsesLow.list((SubLObject)module0002.$ic25$, var5, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0002.$ic20$);
        return (SubLObject)module0002.NIL;
    }
    
    public static SubLObject f26(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0002.NIL;
        SubLObject var6 = (SubLObject)module0002.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0002.$ic20$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0002.$ic20$);
        var6 = var4.first();
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : module0002.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0002.$ic20$);
        var4 = var4.rest();
        if (module0002.NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)module0002.$ic1$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic2$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic3$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic21$, (SubLObject)module0002.$ic8$, var5))), (SubLObject)ConsesLow.list((SubLObject)module0002.$ic25$, var5, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0002.$ic20$);
        return (SubLObject)module0002.NIL;
    }
    
    public static SubLObject f27(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var5;
        final SubLObject var4 = var5 = var1.rest();
        SubLObject var6 = (SubLObject)module0002.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0002.$ic26$);
        var6 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0002.$ic26$);
        final SubLObject var7 = var5.rest();
        var5 = var5.first();
        SubLObject var8 = (SubLObject)module0002.NIL;
        SubLObject var9 = var5;
        SubLObject var10 = (SubLObject)module0002.NIL;
        SubLObject var69_70 = (SubLObject)module0002.NIL;
        while (module0002.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var4, (SubLObject)module0002.$ic26$);
            var69_70 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var4, (SubLObject)module0002.$ic26$);
            if (module0002.NIL == conses_high.member(var69_70, (SubLObject)module0002.$ic10$, (SubLObject)module0002.UNPROVIDED, (SubLObject)module0002.UNPROVIDED)) {
                var10 = (SubLObject)module0002.T;
            }
            if (var69_70 == module0002.$ic11$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0002.NIL != var10 && module0002.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)module0002.$ic26$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0002.$ic12$, var5);
        final SubLObject var12 = (SubLObject)((module0002.NIL != var11) ? conses_high.cadr(var11) : module0002.NIL);
        var5 = var7;
        final SubLObject var13 = (SubLObject)(var5.isCons() ? var5.first() : module0002.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var5, var4, (SubLObject)module0002.$ic26$);
        var5 = var5.rest();
        final SubLObject var14 = (SubLObject)(var5.isCons() ? var5.first() : module0002.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var5, var4, (SubLObject)module0002.$ic26$);
        var5 = var5.rest();
        if (module0002.NIL == var5) {
            if (module0002.NIL == Errors.$ignore_mustsP$.getDynamicValue(var3) && module0002.NIL == f13(var12)) {
                Errors.error((SubLObject)module0002.$ic13$, var12);
            }
            return (SubLObject)ConsesLow.list((SubLObject)module0002.$ic27$, var6, var13, var14);
        }
        cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)module0002.$ic26$);
        return (SubLObject)module0002.NIL;
    }
    
    public static SubLObject f28(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0002.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0002.$ic23$);
        var5 = var4.first();
        var4 = var4.rest();
        final SubLObject var6 = (SubLObject)(var4.isCons() ? var4.first() : module0002.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0002.$ic23$);
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : module0002.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0002.$ic23$);
        var4 = var4.rest();
        if (module0002.NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)module0002.$ic1$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic2$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic3$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic21$, (SubLObject)module0002.$ic5$, var5))), (SubLObject)ConsesLow.list((SubLObject)module0002.$ic30$, var5, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0002.$ic23$);
        return (SubLObject)module0002.NIL;
    }
    
    public static SubLObject f29(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0002.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0002.$ic23$);
        var5 = var4.first();
        var4 = var4.rest();
        final SubLObject var6 = (SubLObject)(var4.isCons() ? var4.first() : module0002.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0002.$ic23$);
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : module0002.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0002.$ic23$);
        var4 = var4.rest();
        if (module0002.NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)module0002.$ic1$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic2$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic3$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic21$, (SubLObject)module0002.$ic7$, var5))), (SubLObject)ConsesLow.list((SubLObject)module0002.$ic30$, var5, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0002.$ic23$);
        return (SubLObject)module0002.NIL;
    }
    
    public static SubLObject f30(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0002.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0002.$ic23$);
        var5 = var4.first();
        var4 = var4.rest();
        final SubLObject var6 = (SubLObject)(var4.isCons() ? var4.first() : module0002.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0002.$ic23$);
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : module0002.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0002.$ic23$);
        var4 = var4.rest();
        if (module0002.NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)module0002.$ic1$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic2$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic3$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic21$, (SubLObject)module0002.$ic8$, var5))), (SubLObject)ConsesLow.list((SubLObject)module0002.$ic30$, var5, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0002.$ic23$);
        return (SubLObject)module0002.NIL;
    }
    
    public static SubLObject f31(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0002.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0002.$ic23$);
        var5 = var4.first();
        var4 = var4.rest();
        final SubLObject var6 = (SubLObject)(var4.isCons() ? var4.first() : module0002.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0002.$ic23$);
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : module0002.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0002.$ic23$);
        var4 = var4.rest();
        if (module0002.NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)module0002.$ic1$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic2$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic3$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic21$, (SubLObject)module0002.$ic5$, var5))), (SubLObject)ConsesLow.list((SubLObject)module0002.$ic31$, var5, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0002.$ic23$);
        return (SubLObject)module0002.NIL;
    }
    
    public static SubLObject f32(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0002.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0002.$ic23$);
        var5 = var4.first();
        var4 = var4.rest();
        final SubLObject var6 = (SubLObject)(var4.isCons() ? var4.first() : module0002.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0002.$ic23$);
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : module0002.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0002.$ic23$);
        var4 = var4.rest();
        if (module0002.NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)module0002.$ic1$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic2$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic3$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic21$, (SubLObject)module0002.$ic7$, var5))), (SubLObject)ConsesLow.list((SubLObject)module0002.$ic31$, var5, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0002.$ic23$);
        return (SubLObject)module0002.NIL;
    }
    
    public static SubLObject f33(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0002.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0002.$ic23$);
        var5 = var4.first();
        var4 = var4.rest();
        final SubLObject var6 = (SubLObject)(var4.isCons() ? var4.first() : module0002.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0002.$ic23$);
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : module0002.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0002.$ic23$);
        var4 = var4.rest();
        if (module0002.NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)module0002.$ic1$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic2$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic3$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic21$, (SubLObject)module0002.$ic8$, var5))), (SubLObject)ConsesLow.list((SubLObject)module0002.$ic31$, var5, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0002.$ic23$);
        return (SubLObject)module0002.NIL;
    }
    
    public static SubLObject f34(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var5;
        final SubLObject var4 = var5 = var1.rest();
        SubLObject var6 = (SubLObject)module0002.NIL;
        SubLObject var7 = (SubLObject)module0002.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0002.$ic32$);
        var6 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0002.$ic32$);
        var7 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0002.$ic32$);
        final SubLObject var8 = var5.rest();
        var5 = var5.first();
        SubLObject var9 = (SubLObject)module0002.NIL;
        SubLObject var10 = var5;
        SubLObject var11 = (SubLObject)module0002.NIL;
        SubLObject var90_91 = (SubLObject)module0002.NIL;
        while (module0002.NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var4, (SubLObject)module0002.$ic32$);
            var90_91 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var4, (SubLObject)module0002.$ic32$);
            if (module0002.NIL == conses_high.member(var90_91, (SubLObject)module0002.$ic33$, (SubLObject)module0002.UNPROVIDED, (SubLObject)module0002.UNPROVIDED)) {
                var11 = (SubLObject)module0002.T;
            }
            if (var90_91 == module0002.$ic11$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (module0002.NIL != var11 && module0002.NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)module0002.$ic32$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0002.$ic34$, var5);
        SubLObject var13 = (SubLObject)((module0002.NIL != var12) ? conses_high.cadr(var12) : module0002.NIL);
        final SubLObject var14;
        var5 = (var14 = var8);
        if (module0002.NIL == Errors.$ignore_mustsP$.getDynamicValue(var3) && module0002.NIL == f13(var13)) {
            Errors.error((SubLObject)module0002.$ic35$, var13);
        }
        if (!var13.isList()) {
            var13 = (SubLObject)ConsesLow.list(var13);
        }
        return (SubLObject)ConsesLow.list((SubLObject)module0002.$ic1$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic36$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic3$, var6), (SubLObject)ConsesLow.list((SubLObject)module0002.$ic3$, ConsesLow.append(var13, (SubLObject)module0002.NIL))), (SubLObject)ConsesLow.listS((SubLObject)module0002.$ic15$, var6, var7, ConsesLow.append(var14, (SubLObject)module0002.NIL)));
    }
    
    public static SubLObject f35(final SubLObject var94, final SubLObject var93) {
        return var94;
    }
    
    public static SubLObject f36(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var5;
        final SubLObject var4 = var5 = var1.rest();
        SubLObject var6 = (SubLObject)module0002.NIL;
        SubLObject var7 = (SubLObject)module0002.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0002.$ic37$);
        var6 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0002.$ic37$);
        var7 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0002.$ic37$);
        final SubLObject var8 = var5.rest();
        var5 = var5.first();
        SubLObject var9 = (SubLObject)module0002.NIL;
        SubLObject var10 = var5;
        SubLObject var11 = (SubLObject)module0002.NIL;
        SubLObject var101_102 = (SubLObject)module0002.NIL;
        while (module0002.NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var4, (SubLObject)module0002.$ic37$);
            var101_102 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var4, (SubLObject)module0002.$ic37$);
            if (module0002.NIL == conses_high.member(var101_102, (SubLObject)module0002.$ic33$, (SubLObject)module0002.UNPROVIDED, (SubLObject)module0002.UNPROVIDED)) {
                var11 = (SubLObject)module0002.T;
            }
            if (var101_102 == module0002.$ic11$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (module0002.NIL != var11 && module0002.NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)module0002.$ic37$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0002.$ic34$, var5);
        SubLObject var13 = (SubLObject)((module0002.NIL != var12) ? conses_high.cadr(var12) : module0002.NIL);
        SubLObject var14;
        var5 = (var14 = var8);
        if (module0002.NIL == Errors.$ignore_mustsP$.getDynamicValue(var3) && module0002.NIL == f13(var13)) {
            Errors.error((SubLObject)module0002.$ic35$, var13);
        }
        if (!var13.isList()) {
            var13 = (SubLObject)ConsesLow.list(var13);
        }
        SubLObject var15 = (SubLObject)module0002.NIL;
        if (var14.first().isString()) {
            var15 = var14.first();
            var14 = var14.rest();
        }
        return (SubLObject)ConsesLow.listS((SubLObject)module0002.$ic19$, var6, var7, ConsesLow.append((SubLObject)((module0002.NIL != var15) ? ConsesLow.list(var15) : module0002.NIL), (SubLObject)((module0002.NIL != var13) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0002.$ic38$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic3$, var6), (SubLObject)ConsesLow.list((SubLObject)module0002.$ic3$, ConsesLow.append(var13, (SubLObject)module0002.NIL)))) : module0002.NIL), var14, (SubLObject)module0002.NIL));
    }
    
    public static SubLObject f37(final SubLObject var94, final SubLObject var93) {
        SubLObject var95 = (SubLObject)module0002.NIL;
        SubLObject var96 = (SubLObject)module0002.NIL;
        try {
            var96 = streams_high.make_private_string_output_stream();
            PrintLow.format(var96, (SubLObject)module0002.$ic39$, var94);
            if (module0002.NIL != var93) {
                print_high.princ((SubLObject)module0002.$ic40$, var96);
                SubLObject var97 = var93;
                SubLObject var98 = (SubLObject)module0002.NIL;
                var98 = var97.first();
                while (module0002.NIL != var97) {
                    PrintLow.format(var96, (SubLObject)module0002.$ic41$, var98);
                    var97 = var97.rest();
                    var98 = var97.first();
                }
                print_high.princ((SubLObject)module0002.$ic42$, var96);
            }
            var95 = streams_high.get_output_stream_string(var96);
        }
        finally {
            final SubLObject var99 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0002.T);
                streams_high.close(var96, (SubLObject)module0002.UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var99);
            }
        }
        return Errors.warn((SubLObject)module0002.$ic43$, var95);
    }
    
    public static SubLObject f38(final SubLObject var108) {
        Hashtables.sethash(var108, module0002.$g1$.getGlobalValue(), (SubLObject)module0002.T);
        return var108;
    }
    
    public static SubLObject f39(final SubLObject var23) {
        return Hashtables.gethash_without_values(var23, module0002.$g1$.getGlobalValue(), (SubLObject)module0002.UNPROVIDED);
    }
    
    public static SubLObject f40(final SubLObject var23) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var23.isFunctionSpec() && !var23.isMacroOperator() && module0002.NIL != f39(var23));
    }
    
    public static SubLObject f41(final SubLObject var23) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var23.isMacroOperator() && module0002.NIL != f39(var23));
    }
    
    public static SubLObject f42() {
        SubLObject var109 = (SubLObject)module0002.NIL;
        SubLObject var110 = (SubLObject)module0002.NIL;
        SubLObject var111 = (SubLObject)module0002.NIL;
        final Iterator var112 = Hashtables.getEntrySetIterator(module0002.$g1$.getGlobalValue());
        try {
            while (Hashtables.iteratorHasNext(var112)) {
                final Map.Entry var113 = Hashtables.iteratorNextEntry(var112);
                var110 = Hashtables.getEntryKey(var113);
                var111 = Hashtables.getEntryValue(var113);
                var109 = (SubLObject)ConsesLow.cons(var110, var109);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var112);
        }
        var109 = Sort.sort(var109, Symbols.symbol_function((SubLObject)module0002.$ic46$), Symbols.symbol_function((SubLObject)module0002.$ic47$));
        return var109;
    }
    
    public static SubLObject f43(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0002.NIL;
        SubLObject var6 = (SubLObject)module0002.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0002.$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0002.$ic0$);
        var6 = var4.first();
        final SubLObject var7;
        var4 = (var7 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0002.$ic1$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic48$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic3$, var5)), (SubLObject)ConsesLow.listS((SubLObject)module0002.$ic49$, var5, var6, ConsesLow.append(var7, (SubLObject)module0002.NIL)));
    }
    
    public static SubLObject f44(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0002.NIL;
        SubLObject var6 = (SubLObject)module0002.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0002.$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0002.$ic0$);
        var6 = var4.first();
        final SubLObject var7;
        var4 = (var7 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0002.$ic1$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic48$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic3$, var5)), (SubLObject)ConsesLow.listS((SubLObject)module0002.$ic50$, var5, var6, ConsesLow.append(var7, (SubLObject)module0002.NIL)));
    }
    
    public static SubLObject f45(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0002.NIL;
        SubLObject var6 = (SubLObject)module0002.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0002.$ic20$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0002.$ic20$);
        var6 = var4.first();
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : module0002.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0002.$ic20$);
        var4 = var4.rest();
        if (module0002.NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)module0002.$ic1$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic48$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic3$, var5)), (SubLObject)ConsesLow.list((SubLObject)module0002.$ic51$, var5, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0002.$ic20$);
        return (SubLObject)module0002.NIL;
    }
    
    public static SubLObject f46(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0002.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0002.$ic23$);
        var5 = var4.first();
        var4 = var4.rest();
        final SubLObject var6 = (SubLObject)(var4.isCons() ? var4.first() : module0002.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0002.$ic23$);
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : module0002.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0002.$ic23$);
        var4 = var4.rest();
        if (module0002.NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)module0002.$ic1$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic48$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic3$, var5)), (SubLObject)ConsesLow.list((SubLObject)module0002.$ic52$, var5, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0002.$ic23$);
        return (SubLObject)module0002.NIL;
    }
    
    public static SubLObject f47(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0002.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0002.$ic23$);
        var5 = var4.first();
        var4 = var4.rest();
        final SubLObject var6 = (SubLObject)(var4.isCons() ? var4.first() : module0002.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0002.$ic23$);
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : module0002.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0002.$ic23$);
        var4 = var4.rest();
        if (module0002.NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)module0002.$ic1$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic48$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic3$, var5)), (SubLObject)ConsesLow.list((SubLObject)module0002.$ic53$, var5, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0002.$ic23$);
        return (SubLObject)module0002.NIL;
    }
    
    public static SubLObject f48(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0002.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0002.$ic23$);
        var5 = var4.first();
        var4 = var4.rest();
        final SubLObject var6 = (SubLObject)(var4.isCons() ? var4.first() : module0002.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0002.$ic23$);
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : module0002.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0002.$ic23$);
        var4 = var4.rest();
        if (module0002.NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)module0002.$ic1$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic48$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic3$, var5)), (SubLObject)ConsesLow.list((SubLObject)module0002.$ic54$, var5, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0002.$ic23$);
        return (SubLObject)module0002.NIL;
    }
    
    public static SubLObject f49(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0002.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0002.$ic23$);
        var5 = var4.first();
        var4 = var4.rest();
        final SubLObject var6 = (SubLObject)(var4.isCons() ? var4.first() : module0002.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0002.$ic23$);
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : module0002.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0002.$ic23$);
        var4 = var4.rest();
        if (module0002.NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)module0002.$ic1$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic48$, (SubLObject)ConsesLow.list((SubLObject)module0002.$ic3$, var5)), (SubLObject)ConsesLow.list((SubLObject)module0002.$ic55$, var5, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0002.$ic23$);
        return (SubLObject)module0002.NIL;
    }
    
    public static SubLObject f50(final SubLObject var127, final SubLObject var22) {
        SubLObject var128 = Symbols.get(var127, (SubLObject)module0002.$ic57$, (SubLObject)module0002.UNPROVIDED);
        if (var22.isCons()) {
            SubLObject var129 = var22;
            SubLObject var130 = (SubLObject)module0002.NIL;
            var130 = var129.first();
            while (module0002.NIL != var129) {
                final SubLObject var131 = var130;
                if (module0002.NIL == conses_high.member(var131, var128, Symbols.symbol_function((SubLObject)module0002.EQL), Symbols.symbol_function((SubLObject)module0002.IDENTITY))) {
                    var128 = (SubLObject)ConsesLow.cons(var131, var128);
                }
                var129 = var129.rest();
                var130 = var129.first();
            }
        }
        else if (module0002.NIL == conses_high.member(var22, var128, Symbols.symbol_function((SubLObject)module0002.EQL), Symbols.symbol_function((SubLObject)module0002.IDENTITY))) {
            var128 = (SubLObject)ConsesLow.cons(var22, var128);
        }
        Symbols.put(var127, (SubLObject)module0002.$ic57$, var128);
        return var127;
    }
    
    public static SubLObject f51(final SubLObject var127, final SubLObject var22) {
        return conses_high.member(var22, Symbols.get(var127, (SubLObject)module0002.$ic57$, (SubLObject)module0002.UNPROVIDED), (SubLObject)module0002.UNPROVIDED, (SubLObject)module0002.UNPROVIDED);
    }
    
    public static SubLObject f52(final SubLObject var127, final SubLObject var128) {
        SubLObject var129 = (SubLObject)module0002.NIL;
        if (module0002.NIL == var129) {
            SubLObject var130 = var128;
            SubLObject var131 = (SubLObject)module0002.NIL;
            var131 = var130.first();
            while (module0002.NIL == var129 && module0002.NIL != var130) {
                if (module0002.NIL != f51(var127, var131)) {
                    var129 = var131;
                }
                var130 = var130.rest();
                var131 = var130.first();
            }
        }
        return var129;
    }
    
    public static SubLObject f53() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0002", "f9", "DEFINE-PUBLIC");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0002", "f10", "DEFINE-PROTECTED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0002", "f11", "DEFINE-PRIVATE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0002", "f12", "DEFINE-MACRO-HELPER");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0002", "f13", "S#6", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0002", "f14", "DEFMACRO-PUBLIC");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0002", "f15", "DEFMACRO-PROTECTED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0002", "f16", "DEFMACRO-PRIVATE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0002", "f17", "DEFMACRO-MACRO-HELPER");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0002", "f18", "DEFCONSTANT-PUBLIC");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0002", "f19", "DEFCONSTANT-PROTECTED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0002", "f20", "DEFCONSTANT-PRIVATE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0002", "f21", "DEFLEXICAL-PUBLIC");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0002", "f22", "DEFLEXICAL-PROTECTED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0002", "f23", "DEFLEXICAL-PRIVATE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0002", "f24", "DEFPARAMETER-PUBLIC");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0002", "f25", "DEFPARAMETER-PROTECTED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0002", "f26", "DEFPARAMETER-PRIVATE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0002", "f27", "S#7");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0002", "f28", "DEFGLOBAL-PUBLIC");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0002", "f29", "DEFGLOBAL-PROTECTED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0002", "f30", "DEFGLOBAL-PRIVATE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0002", "f31", "DEFVAR-PUBLIC");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0002", "f32", "DEFVAR-PROTECTED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0002", "f33", "DEFVAR-PRIVATE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0002", "f34", "S#8");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0002", "f35", "S#9", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0002", "f36", "S#10");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0002", "f37", "S#11", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0002", "f38", "S#12", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0002", "f39", "S#13", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0002", "f40", "S#14", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0002", "f41", "S#15", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0002", "f42", "S#16", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0002", "f43", "S#17");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0002", "f44", "S#18");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0002", "f45", "S#19");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0002", "f46", "S#20");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0002", "f47", "S#21");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0002", "f48", "S#22");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0002", "f49", "S#23");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0002", "f50", "S#24", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0002", "f51", "S#25", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0002", "f52", "S#26", 2, 0, false);
        return (SubLObject)module0002.NIL;
    }
    
    public static SubLObject f54() {
        module0002.$g1$ = SubLFiles.deflexical("S#27", (module0002.NIL != Symbols.boundp((SubLObject)module0002.$ic44$)) ? module0002.$g1$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)module0002.$ic45$, Symbols.symbol_function((SubLObject)module0002.EQ), (SubLObject)module0002.UNPROVIDED));
        module0002.$g2$ = SubLFiles.deflexical("S#28", (SubLObject)module0002.$ic56$);
        return (SubLObject)module0002.NIL;
    }
    
    public static SubLObject f55() {
        module0001.f5((SubLObject)module0002.$ic28$, (SubLObject)module0002.$ic29$);
        SubLObject var24 = module0002.$g2$.getGlobalValue();
        SubLObject var25 = (SubLObject)module0002.NIL;
        var25 = var24.first();
        while (module0002.NIL != var24) {
            f38(var25);
            var24 = var24.rest();
            var25 = var24.first();
        }
        return (SubLObject)module0002.NIL;
    }
    
    public void declareFunctions() {
        f53();
    }
    
    public void initializeVariables() {
        f54();
    }
    
    public void runTopLevelForms() {
        f55();
    }
    
    static {
        me = (SubLFile)new module0002();
        module0002.$g1$ = null;
        module0002.$g2$ = null;
        $ic0$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#30", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic1$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic2$ = SubLObjectFactory.makeSymbol("PROCLAIM");
        $ic3$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic4$ = SubLObjectFactory.makeSymbol("FACCESS");
        $ic5$ = SubLObjectFactory.makeSymbol("PUBLIC");
        $ic6$ = SubLObjectFactory.makeSymbol("DEFINE");
        $ic7$ = SubLObjectFactory.makeSymbol("PROTECTED");
        $ic8$ = SubLObjectFactory.makeSymbol("PRIVATE");
        $ic9$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#30", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#31", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic10$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MACRO"));
        $ic11$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic12$ = SubLObjectFactory.makeKeyword("MACRO");
        $ic13$ = SubLObjectFactory.makeString("Macro or list of macros must be specified, not ~a");
        $ic14$ = SubLObjectFactory.makeSymbol("S#24", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("DEFINE-PROTECTED");
        $ic16$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#32", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic17$ = SubLObjectFactory.makeSymbol("DEFMACRO");
        $ic18$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#32", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#31", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic19$ = SubLObjectFactory.makeSymbol("DEFMACRO-PROTECTED");
        $ic20$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("S#33", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DOCUMENTATION"));
        $ic21$ = SubLObjectFactory.makeSymbol("VACCESS");
        $ic22$ = SubLObjectFactory.makeSymbol("DEFCONSTANT");
        $ic23$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("DOCUMENTATION"));
        $ic24$ = SubLObjectFactory.makeSymbol("DEFLEXICAL");
        $ic25$ = SubLObjectFactory.makeSymbol("DEFPARAMETER");
        $ic26$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#31", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("DOCUMENTATION"));
        $ic27$ = SubLObjectFactory.makeSymbol("DEFPARAMETER-PROTECTED");
        $ic28$ = SubLObjectFactory.makeSymbol("S#7", "CYC");
        $ic29$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic30$ = SubLObjectFactory.makeSymbol("S#34", "CYC");
        $ic31$ = SubLObjectFactory.makeSymbol("DEFVAR");
        $ic32$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#30", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#35", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic33$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REPLACEMENTS"));
        $ic34$ = SubLObjectFactory.makeKeyword("REPLACEMENTS");
        $ic35$ = SubLObjectFactory.makeString("Method or list of methods must be specified, not ~a");
        $ic36$ = SubLObjectFactory.makeSymbol("S#9", "CYC");
        $ic37$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#32", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#35", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic38$ = SubLObjectFactory.makeSymbol("S#11", "CYC");
        $ic39$ = SubLObjectFactory.makeString("Macro ~S is obsolete");
        $ic40$ = SubLObjectFactory.makeString(" -- use ");
        $ic41$ = SubLObjectFactory.makeString("~S ");
        $ic42$ = SubLObjectFactory.makeString("instead.");
        $ic43$ = SubLObjectFactory.makeString("~A");
        $ic44$ = SubLObjectFactory.makeSymbol("S#27", "CYC");
        $ic45$ = SubLObjectFactory.makeInteger(400);
        $ic46$ = SubLObjectFactory.makeSymbol("STRING-LESSP");
        $ic47$ = SubLObjectFactory.makeSymbol("SYMBOL-NAME");
        $ic48$ = SubLObjectFactory.makeSymbol("S#12", "CYC");
        $ic49$ = SubLObjectFactory.makeSymbol("DEFINE-PUBLIC");
        $ic50$ = SubLObjectFactory.makeSymbol("DEFMACRO-PUBLIC");
        $ic51$ = SubLObjectFactory.makeSymbol("DEFCONSTANT-PUBLIC");
        $ic52$ = SubLObjectFactory.makeSymbol("DEFLEXICAL-PUBLIC");
        $ic53$ = SubLObjectFactory.makeSymbol("DEFPARAMETER-PUBLIC");
        $ic54$ = SubLObjectFactory.makeSymbol("DEFGLOBAL-PUBLIC");
        $ic55$ = SubLObjectFactory.makeSymbol("DEFVAR-PUBLIC");
        $ic56$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("DEFINE-PRIVATE"), SubLObjectFactory.makeSymbol("DEFINE-PROTECTED"), SubLObjectFactory.makeSymbol("DEFINE-PUBLIC"), SubLObjectFactory.makeSymbol("DEFINE-MACRO-HELPER"), SubLObjectFactory.makeSymbol("DEFMACRO-PRIVATE"), SubLObjectFactory.makeSymbol("DEFMACRO-PROTECTED"), SubLObjectFactory.makeSymbol("DEFMACRO-PUBLIC"), SubLObjectFactory.makeSymbol("DEFMACRO-MACRO-HELPER"), SubLObjectFactory.makeSymbol("DEFCONSTANT-PRIVATE"), SubLObjectFactory.makeSymbol("DEFCONSTANT-PROTECTED"), SubLObjectFactory.makeSymbol("DEFCONSTANT-PUBLIC"), SubLObjectFactory.makeSymbol("DEFLEXICAL-PRIVATE"), SubLObjectFactory.makeSymbol("DEFLEXICAL-PROTECTED"), SubLObjectFactory.makeSymbol("DEFLEXICAL-PUBLIC"), SubLObjectFactory.makeSymbol("DEFGLOBAL-PRIVATE"), SubLObjectFactory.makeSymbol("DEFGLOBAL-PROTECTED"), SubLObjectFactory.makeSymbol("DEFGLOBAL-PUBLIC"), SubLObjectFactory.makeSymbol("DEFPARAMETER-PRIVATE"), SubLObjectFactory.makeSymbol("DEFPARAMETER-PROTECTED"), SubLObjectFactory.makeSymbol("DEFPARAMETER-PUBLIC"), SubLObjectFactory.makeSymbol("DEFVAR-PRIVATE"), SubLObjectFactory.makeSymbol("DEFVAR-PROTECTED"), SubLObjectFactory.makeSymbol("DEFVAR-PUBLIC") });
        $ic57$ = SubLObjectFactory.makeKeyword("MACRO-HELPER-FOR");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0002.class
	Total time: 218 ms
	
	Decompiled with Procyon 0.5.32.
*/