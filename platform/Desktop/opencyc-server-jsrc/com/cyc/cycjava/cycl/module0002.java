package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        final SubLObject var7;
        var4 = (var7 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)$ic5$, var5))), (SubLObject)ConsesLow.listS((SubLObject)$ic6$, var5, var6, ConsesLow.append(var7, (SubLObject)NIL)));
    }
    
    public static SubLObject f10(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        final SubLObject var7;
        var4 = (var7 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)$ic7$, var5))), (SubLObject)ConsesLow.listS((SubLObject)$ic6$, var5, var6, ConsesLow.append(var7, (SubLObject)NIL)));
    }
    
    public static SubLObject f11(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        final SubLObject var7;
        var4 = (var7 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)$ic8$, var5))), (SubLObject)ConsesLow.listS((SubLObject)$ic6$, var5, var6, ConsesLow.append(var7, (SubLObject)NIL)));
    }
    
    public static SubLObject f12(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var5;
        final SubLObject var4 = var5 = var1.rest();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic9$);
        var6 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic9$);
        var7 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic9$);
        final SubLObject var8 = var5.rest();
        var5 = var5.first();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var5;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var19_20 = (SubLObject)NIL;
        while (NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var4, (SubLObject)$ic9$);
            var19_20 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var4, (SubLObject)$ic9$);
            if (NIL == conses_high.member(var19_20, (SubLObject)$ic10$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var11 = (SubLObject)T;
            }
            if (var19_20 == $ic11$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (NIL != var11 && NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic9$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic12$, var5);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14;
        var5 = (var14 = var8);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var3) && NIL == f13(var13)) {
            Errors.error((SubLObject)$ic13$, var13);
        }
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic14$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var13)), (SubLObject)ConsesLow.listS((SubLObject)$ic15$, var6, var7, ConsesLow.append(var14, (SubLObject)NIL)));
    }
    
    public static SubLObject f13(final SubLObject var23) {
        if (var23.isSymbol()) {
            return (SubLObject)T;
        }
        if (var23.isAtom()) {
            return (SubLObject)NIL;
        }
        SubLObject var24 = var23;
        SubLObject var25 = (SubLObject)NIL;
        var25 = var24.first();
        while (NIL != var24) {
            if (!var25.isSymbol()) {
                return (SubLObject)NIL;
            }
            var24 = var24.rest();
            var25 = var24.first();
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f14(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic16$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic16$);
        var6 = var4.first();
        final SubLObject var7;
        var4 = (var7 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)$ic5$, var5))), (SubLObject)ConsesLow.listS((SubLObject)$ic17$, var5, var6, ConsesLow.append(var7, (SubLObject)NIL)));
    }
    
    public static SubLObject f15(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic16$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic16$);
        var6 = var4.first();
        final SubLObject var7;
        var4 = (var7 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)$ic7$, var5))), (SubLObject)ConsesLow.listS((SubLObject)$ic17$, var5, var6, ConsesLow.append(var7, (SubLObject)NIL)));
    }
    
    public static SubLObject f16(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic16$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic16$);
        var6 = var4.first();
        final SubLObject var7;
        var4 = (var7 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)$ic8$, var5))), (SubLObject)ConsesLow.listS((SubLObject)$ic17$, var5, var6, ConsesLow.append(var7, (SubLObject)NIL)));
    }
    
    public static SubLObject f17(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var5;
        final SubLObject var4 = var5 = var1.rest();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic18$);
        var6 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic18$);
        var7 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic18$);
        final SubLObject var8 = var5.rest();
        var5 = var5.first();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var5;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var39_40 = (SubLObject)NIL;
        while (NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var4, (SubLObject)$ic18$);
            var39_40 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var4, (SubLObject)$ic18$);
            if (NIL == conses_high.member(var39_40, (SubLObject)$ic10$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var11 = (SubLObject)T;
            }
            if (var39_40 == $ic11$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (NIL != var11 && NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic18$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic12$, var5);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14;
        var5 = (var14 = var8);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var3) && NIL == f13(var13)) {
            Errors.error((SubLObject)$ic13$, var13);
        }
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic14$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic3$, var13)), (SubLObject)ConsesLow.listS((SubLObject)$ic19$, var6, var7, ConsesLow.append(var14, (SubLObject)NIL)));
    }
    
    public static SubLObject f18(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic20$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic20$);
        var6 = var4.first();
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic20$);
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)$ic5$, var5))), (SubLObject)ConsesLow.list((SubLObject)$ic22$, var5, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic20$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic20$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic20$);
        var6 = var4.first();
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic20$);
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)$ic7$, var5))), (SubLObject)ConsesLow.list((SubLObject)$ic22$, var5, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic20$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f20(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic20$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic20$);
        var6 = var4.first();
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic20$);
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)$ic8$, var5))), (SubLObject)ConsesLow.list((SubLObject)$ic22$, var5, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic20$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic23$);
        var5 = var4.first();
        var4 = var4.rest();
        final SubLObject var6 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic23$);
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic23$);
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)$ic5$, var5))), (SubLObject)ConsesLow.list((SubLObject)$ic24$, var5, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic23$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic23$);
        var5 = var4.first();
        var4 = var4.rest();
        final SubLObject var6 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic23$);
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic23$);
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)$ic7$, var5))), (SubLObject)ConsesLow.list((SubLObject)$ic24$, var5, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic23$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic23$);
        var5 = var4.first();
        var4 = var4.rest();
        final SubLObject var6 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic23$);
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic23$);
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)$ic8$, var5))), (SubLObject)ConsesLow.list((SubLObject)$ic24$, var5, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic23$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic20$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic20$);
        var6 = var4.first();
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic20$);
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)$ic5$, var5))), (SubLObject)ConsesLow.list((SubLObject)$ic25$, var5, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic20$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f25(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic20$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic20$);
        var6 = var4.first();
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic20$);
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)$ic7$, var5))), (SubLObject)ConsesLow.list((SubLObject)$ic25$, var5, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic20$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic20$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic20$);
        var6 = var4.first();
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic20$);
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)$ic8$, var5))), (SubLObject)ConsesLow.list((SubLObject)$ic25$, var5, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic20$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var5;
        final SubLObject var4 = var5 = var1.rest();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic26$);
        var6 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic26$);
        final SubLObject var7 = var5.rest();
        var5 = var5.first();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var5;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var69_70 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var4, (SubLObject)$ic26$);
            var69_70 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var4, (SubLObject)$ic26$);
            if (NIL == conses_high.member(var69_70, (SubLObject)$ic10$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var69_70 == $ic11$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic26$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic12$, var5);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        var5 = var7;
        final SubLObject var13 = (SubLObject)(var5.isCons() ? var5.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var5, var4, (SubLObject)$ic26$);
        var5 = var5.rest();
        final SubLObject var14 = (SubLObject)(var5.isCons() ? var5.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var5, var4, (SubLObject)$ic26$);
        var5 = var5.rest();
        if (NIL == var5) {
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var3) && NIL == f13(var12)) {
                Errors.error((SubLObject)$ic13$, var12);
            }
            return (SubLObject)ConsesLow.list((SubLObject)$ic27$, var6, var13, var14);
        }
        cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic26$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic23$);
        var5 = var4.first();
        var4 = var4.rest();
        final SubLObject var6 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic23$);
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic23$);
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)$ic5$, var5))), (SubLObject)ConsesLow.list((SubLObject)$ic30$, var5, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic23$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic23$);
        var5 = var4.first();
        var4 = var4.rest();
        final SubLObject var6 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic23$);
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic23$);
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)$ic7$, var5))), (SubLObject)ConsesLow.list((SubLObject)$ic30$, var5, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic23$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic23$);
        var5 = var4.first();
        var4 = var4.rest();
        final SubLObject var6 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic23$);
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic23$);
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)$ic8$, var5))), (SubLObject)ConsesLow.list((SubLObject)$ic30$, var5, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic23$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic23$);
        var5 = var4.first();
        var4 = var4.rest();
        final SubLObject var6 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic23$);
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic23$);
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)$ic5$, var5))), (SubLObject)ConsesLow.list((SubLObject)$ic31$, var5, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic23$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic23$);
        var5 = var4.first();
        var4 = var4.rest();
        final SubLObject var6 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic23$);
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic23$);
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)$ic7$, var5))), (SubLObject)ConsesLow.list((SubLObject)$ic31$, var5, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic23$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic23$);
        var5 = var4.first();
        var4 = var4.rest();
        final SubLObject var6 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic23$);
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic23$);
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)$ic8$, var5))), (SubLObject)ConsesLow.list((SubLObject)$ic31$, var5, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic23$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var5;
        final SubLObject var4 = var5 = var1.rest();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic32$);
        var6 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic32$);
        var7 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic32$);
        final SubLObject var8 = var5.rest();
        var5 = var5.first();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var5;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var90_91 = (SubLObject)NIL;
        while (NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var4, (SubLObject)$ic32$);
            var90_91 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var4, (SubLObject)$ic32$);
            if (NIL == conses_high.member(var90_91, (SubLObject)$ic33$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var11 = (SubLObject)T;
            }
            if (var90_91 == $ic11$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (NIL != var11 && NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic32$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic34$, var5);
        SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14;
        var5 = (var14 = var8);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var3) && NIL == f13(var13)) {
            Errors.error((SubLObject)$ic35$, var13);
        }
        if (!var13.isList()) {
            var13 = (SubLObject)ConsesLow.list(var13);
        }
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic36$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic3$, ConsesLow.append(var13, (SubLObject)NIL))), (SubLObject)ConsesLow.listS((SubLObject)$ic15$, var6, var7, ConsesLow.append(var14, (SubLObject)NIL)));
    }
    
    public static SubLObject f35(final SubLObject var94, final SubLObject var93) {
        return var94;
    }
    
    public static SubLObject f36(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var5;
        final SubLObject var4 = var5 = var1.rest();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic37$);
        var6 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic37$);
        var7 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic37$);
        final SubLObject var8 = var5.rest();
        var5 = var5.first();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var5;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var101_102 = (SubLObject)NIL;
        while (NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var4, (SubLObject)$ic37$);
            var101_102 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var4, (SubLObject)$ic37$);
            if (NIL == conses_high.member(var101_102, (SubLObject)$ic33$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var11 = (SubLObject)T;
            }
            if (var101_102 == $ic11$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (NIL != var11 && NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic37$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic34$, var5);
        SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        SubLObject var14;
        var5 = (var14 = var8);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var3) && NIL == f13(var13)) {
            Errors.error((SubLObject)$ic35$, var13);
        }
        if (!var13.isList()) {
            var13 = (SubLObject)ConsesLow.list(var13);
        }
        SubLObject var15 = (SubLObject)NIL;
        if (var14.first().isString()) {
            var15 = var14.first();
            var14 = var14.rest();
        }
        return (SubLObject)ConsesLow.listS((SubLObject)$ic19$, var6, var7, ConsesLow.append((SubLObject)((NIL != var15) ? ConsesLow.list(var15) : NIL), (SubLObject)((NIL != var13) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic38$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic3$, ConsesLow.append(var13, (SubLObject)NIL)))) : NIL), var14, (SubLObject)NIL));
    }
    
    public static SubLObject f37(final SubLObject var94, final SubLObject var93) {
        SubLObject var95 = (SubLObject)NIL;
        SubLObject var96 = (SubLObject)NIL;
        try {
            var96 = streams_high.make_private_string_output_stream();
            PrintLow.format(var96, (SubLObject)$ic39$, var94);
            if (NIL != var93) {
                print_high.princ((SubLObject)$ic40$, var96);
                SubLObject var97 = var93;
                SubLObject var98 = (SubLObject)NIL;
                var98 = var97.first();
                while (NIL != var97) {
                    PrintLow.format(var96, (SubLObject)$ic41$, var98);
                    var97 = var97.rest();
                    var98 = var97.first();
                }
                print_high.princ((SubLObject)$ic42$, var96);
            }
            var95 = streams_high.get_output_stream_string(var96);
        }
        finally {
            final SubLObject var99 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                streams_high.close(var96, (SubLObject)UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var99);
            }
        }
        return Errors.warn((SubLObject)$ic43$, var95);
    }
    
    public static SubLObject f38(final SubLObject var108) {
        Hashtables.sethash(var108, $g1$.getGlobalValue(), (SubLObject)T);
        return var108;
    }
    
    public static SubLObject f39(final SubLObject var23) {
        return Hashtables.gethash_without_values(var23, $g1$.getGlobalValue(), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f40(final SubLObject var23) {
        return (SubLObject)makeBoolean(var23.isFunctionSpec() && !var23.isMacroOperator() && NIL != f39(var23));
    }
    
    public static SubLObject f41(final SubLObject var23) {
        return (SubLObject)makeBoolean(var23.isMacroOperator() && NIL != f39(var23));
    }
    
    public static SubLObject f42() {
        SubLObject var109 = (SubLObject)NIL;
        SubLObject var110 = (SubLObject)NIL;
        SubLObject var111 = (SubLObject)NIL;
        final Iterator var112 = Hashtables.getEntrySetIterator($g1$.getGlobalValue());
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
        var109 = Sort.sort(var109, Symbols.symbol_function((SubLObject)$ic46$), Symbols.symbol_function((SubLObject)$ic47$));
        return var109;
    }
    
    public static SubLObject f43(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        final SubLObject var7;
        var4 = (var7 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic48$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, var5)), (SubLObject)ConsesLow.listS((SubLObject)$ic49$, var5, var6, ConsesLow.append(var7, (SubLObject)NIL)));
    }
    
    public static SubLObject f44(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        final SubLObject var7;
        var4 = (var7 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic48$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, var5)), (SubLObject)ConsesLow.listS((SubLObject)$ic50$, var5, var6, ConsesLow.append(var7, (SubLObject)NIL)));
    }
    
    public static SubLObject f45(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic20$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic20$);
        var6 = var4.first();
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic20$);
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic48$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic51$, var5, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic20$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f46(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic23$);
        var5 = var4.first();
        var4 = var4.rest();
        final SubLObject var6 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic23$);
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic23$);
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic48$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic52$, var5, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic23$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic23$);
        var5 = var4.first();
        var4 = var4.rest();
        final SubLObject var6 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic23$);
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic23$);
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic48$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic53$, var5, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic23$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f48(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic23$);
        var5 = var4.first();
        var4 = var4.rest();
        final SubLObject var6 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic23$);
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic23$);
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic48$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic54$, var5, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic23$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic23$);
        var5 = var4.first();
        var4 = var4.rest();
        final SubLObject var6 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic23$);
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic23$);
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic48$, (SubLObject)ConsesLow.list((SubLObject)$ic3$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic55$, var5, var6, var7));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic23$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50(final SubLObject var127, final SubLObject var22) {
        SubLObject var128 = Symbols.get(var127, (SubLObject)$ic57$, (SubLObject)UNPROVIDED);
        if (var22.isCons()) {
            SubLObject var129 = var22;
            SubLObject var130 = (SubLObject)NIL;
            var130 = var129.first();
            while (NIL != var129) {
                final SubLObject var131 = var130;
                if (NIL == conses_high.member(var131, var128, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var128 = (SubLObject)ConsesLow.cons(var131, var128);
                }
                var129 = var129.rest();
                var130 = var129.first();
            }
        }
        else if (NIL == conses_high.member(var22, var128, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            var128 = (SubLObject)ConsesLow.cons(var22, var128);
        }
        Symbols.put(var127, (SubLObject)$ic57$, var128);
        return var127;
    }
    
    public static SubLObject f51(final SubLObject var127, final SubLObject var22) {
        return conses_high.member(var22, Symbols.get(var127, (SubLObject)$ic57$, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f52(final SubLObject var127, final SubLObject var128) {
        SubLObject var129 = (SubLObject)NIL;
        if (NIL == var129) {
            SubLObject var130 = var128;
            SubLObject var131 = (SubLObject)NIL;
            var131 = var130.first();
            while (NIL == var129 && NIL != var130) {
                if (NIL != f51(var127, var131)) {
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f54() {
        $g1$ = SubLFiles.deflexical("S#27", (NIL != Symbols.boundp((SubLObject)$ic44$)) ? $g1$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)$ic45$, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        $g2$ = SubLFiles.deflexical("S#28", (SubLObject)$ic56$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f55() {
        module0001.f5((SubLObject)$ic28$, (SubLObject)$ic29$);
        SubLObject var24 = $g2$.getGlobalValue();
        SubLObject var25 = (SubLObject)NIL;
        var25 = var24.first();
        while (NIL != var24) {
            f38(var25);
            var24 = var24.rest();
            var25 = var24.first();
        }
        return (SubLObject)NIL;
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
        $g1$ = null;
        $g2$ = null;
        $ic0$ = ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("S#30", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic1$ = makeSymbol("PROGN");
        $ic2$ = makeSymbol("PROCLAIM");
        $ic3$ = makeSymbol("QUOTE");
        $ic4$ = makeSymbol("FACCESS");
        $ic5$ = makeSymbol("PUBLIC");
        $ic6$ = makeSymbol("DEFINE");
        $ic7$ = makeSymbol("PROTECTED");
        $ic8$ = makeSymbol("PRIVATE");
        $ic9$ = ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("S#30", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#31", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic10$ = ConsesLow.list((SubLObject)makeKeyword("MACRO"));
        $ic11$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic12$ = makeKeyword("MACRO");
        $ic13$ = makeString("Macro or list of macros must be specified, not ~a");
        $ic14$ = makeSymbol("S#24", "CYC");
        $ic15$ = makeSymbol("DEFINE-PROTECTED");
        $ic16$ = ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("S#32", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic17$ = makeSymbol("DEFMACRO");
        $ic18$ = ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("S#32", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#31", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic19$ = makeSymbol("DEFMACRO-PROTECTED");
        $ic20$ = ConsesLow.list((SubLObject)makeSymbol("VARIABLE"), (SubLObject)makeSymbol("S#33", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("DOCUMENTATION"));
        $ic21$ = makeSymbol("VACCESS");
        $ic22$ = makeSymbol("DEFCONSTANT");
        $ic23$ = ConsesLow.list((SubLObject)makeSymbol("VARIABLE"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#33", "CYC"), (SubLObject)makeSymbol("DOCUMENTATION"));
        $ic24$ = makeSymbol("DEFLEXICAL");
        $ic25$ = makeSymbol("DEFPARAMETER");
        $ic26$ = ConsesLow.list((SubLObject)makeSymbol("VARIABLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#31", "CYC")), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#33", "CYC"), (SubLObject)makeSymbol("DOCUMENTATION"));
        $ic27$ = makeSymbol("DEFPARAMETER-PROTECTED");
        $ic28$ = makeSymbol("S#7", "CYC");
        $ic29$ = ConsesLow.list((SubLObject)makeSymbol("VARIABLE"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic30$ = makeSymbol("S#34", "CYC");
        $ic31$ = makeSymbol("DEFVAR");
        $ic32$ = ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("S#30", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#35", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic33$ = ConsesLow.list((SubLObject)makeKeyword("REPLACEMENTS"));
        $ic34$ = makeKeyword("REPLACEMENTS");
        $ic35$ = makeString("Method or list of methods must be specified, not ~a");
        $ic36$ = makeSymbol("S#9", "CYC");
        $ic37$ = ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("S#32", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#35", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic38$ = makeSymbol("S#11", "CYC");
        $ic39$ = makeString("Macro ~S is obsolete");
        $ic40$ = makeString(" -- use ");
        $ic41$ = makeString("~S ");
        $ic42$ = makeString("instead.");
        $ic43$ = makeString("~A");
        $ic44$ = makeSymbol("S#27", "CYC");
        $ic45$ = makeInteger(400);
        $ic46$ = makeSymbol("STRING-LESSP");
        $ic47$ = makeSymbol("SYMBOL-NAME");
        $ic48$ = makeSymbol("S#12", "CYC");
        $ic49$ = makeSymbol("DEFINE-PUBLIC");
        $ic50$ = makeSymbol("DEFMACRO-PUBLIC");
        $ic51$ = makeSymbol("DEFCONSTANT-PUBLIC");
        $ic52$ = makeSymbol("DEFLEXICAL-PUBLIC");
        $ic53$ = makeSymbol("DEFPARAMETER-PUBLIC");
        $ic54$ = makeSymbol("DEFGLOBAL-PUBLIC");
        $ic55$ = makeSymbol("DEFVAR-PUBLIC");
        $ic56$ = ConsesLow.list(new SubLObject[] { makeSymbol("DEFINE-PRIVATE"), makeSymbol("DEFINE-PROTECTED"), makeSymbol("DEFINE-PUBLIC"), makeSymbol("DEFINE-MACRO-HELPER"), makeSymbol("DEFMACRO-PRIVATE"), makeSymbol("DEFMACRO-PROTECTED"), makeSymbol("DEFMACRO-PUBLIC"), makeSymbol("DEFMACRO-MACRO-HELPER"), makeSymbol("DEFCONSTANT-PRIVATE"), makeSymbol("DEFCONSTANT-PROTECTED"), makeSymbol("DEFCONSTANT-PUBLIC"), makeSymbol("DEFLEXICAL-PRIVATE"), makeSymbol("DEFLEXICAL-PROTECTED"), makeSymbol("DEFLEXICAL-PUBLIC"), makeSymbol("DEFGLOBAL-PRIVATE"), makeSymbol("DEFGLOBAL-PROTECTED"), makeSymbol("DEFGLOBAL-PUBLIC"), makeSymbol("DEFPARAMETER-PRIVATE"), makeSymbol("DEFPARAMETER-PROTECTED"), makeSymbol("DEFPARAMETER-PUBLIC"), makeSymbol("DEFVAR-PRIVATE"), makeSymbol("DEFVAR-PROTECTED"), makeSymbol("DEFVAR-PUBLIC") });
        $ic57$ = makeKeyword("MACRO-HELPER-FOR");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 218 ms
	
	Decompiled with Procyon 0.5.32.
*/