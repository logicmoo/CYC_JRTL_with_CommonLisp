package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0199 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0199";
    public static final String myFingerPrint = "73bd8e7f8016851e62e076ec451c07e0d9b0e2f5cebd7dc2fd1d33bfb749b99b";
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
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
    private static final SubLList $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLList $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLList $ic32$;
    private static final SubLList $ic33$;
    private static final SubLList $ic34$;
    private static final SubLList $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLList $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLList $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLList $ic44$;
    private static final SubLList $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLList $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLList $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLList $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLList $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLList $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLList $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLList $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLList $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLList $ic89$;
    private static final SubLList $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLList $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLList $ic95$;
    private static final SubLList $ic96$;
    private static final SubLList $ic97$;
    private static final SubLList $ic98$;
    private static final SubLList $ic99$;
    private static final SubLList $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLList $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLList $ic106$;
    private static final SubLList $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLString $ic114$;
    private static final SubLList $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLList $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLList $ic119$;
    private static final SubLList $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLList $ic124$;
    private static final SubLList $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLList $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLList $ic131$;
    private static final SubLSymbol $ic132$;
    
    public static SubLObject f12361(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var7;
            var4 = (var7 = var5);
            final SubLObject var8 = (SubLObject)$ic1$;
            return (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var8, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var6), var6)), (SubLObject)ConsesLow.list(var6, var8)), ConsesLow.append(var7, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12362(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var7;
            var4 = (var7 = var5);
            final SubLObject var8 = (SubLObject)$ic6$;
            final SubLObject var9 = (SubLObject)$ic7$;
            return (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var8, (SubLObject)ConsesLow.list((SubLObject)$ic4$, var6)), (SubLObject)ConsesLow.list(var9, (SubLObject)ConsesLow.list((SubLObject)$ic3$, var8, (SubLObject)ConsesLow.list((SubLObject)$ic8$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic9$, var8)), var6)), (SubLObject)ConsesLow.list(var6, var9)), ConsesLow.append(var7, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12363(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic10$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic10$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic10$);
        var7 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var8;
            var4 = (var8 = var5);
            final SubLObject var9 = (SubLObject)$ic11$;
            final SubLObject var10 = (SubLObject)$ic12$;
            return (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var9, (SubLObject)ConsesLow.list((SubLObject)$ic4$, var6)), (SubLObject)ConsesLow.list(var10, var6), (SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic3$, var9, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var10), var10)), reader.bq_cons(var7, (SubLObject)$ic13$)), ConsesLow.append(var8, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic14$, var9, (SubLObject)ConsesLow.list((SubLObject)$ic15$, (SubLObject)ConsesLow.list((SubLObject)$ic16$, var9, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic15$, var7)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic10$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12364(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic10$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic10$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic10$);
        var7 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var8;
            var4 = (var8 = var5);
            final SubLObject var9 = (SubLObject)$ic17$;
            final SubLObject var10 = (SubLObject)$ic18$;
            return (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var9, (SubLObject)ConsesLow.list((SubLObject)$ic4$, var6)), (SubLObject)ConsesLow.list(var10, (SubLObject)ConsesLow.list((SubLObject)$ic3$, var9, (SubLObject)ConsesLow.list((SubLObject)$ic8$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic9$, var9)), var6)), (SubLObject)ConsesLow.list(var6, var10), reader.bq_cons(var7, (SubLObject)$ic13$)), ConsesLow.append(var8, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic14$, var9, (SubLObject)ConsesLow.list((SubLObject)$ic15$, (SubLObject)ConsesLow.list((SubLObject)$ic16$, var9, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7))), (SubLObject)ConsesLow.list((SubLObject)$ic15$, var7)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic10$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12365(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic19$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic19$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic19$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var27_28 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic19$);
            var27_28 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic19$);
            if (NIL == conses_high.member(var27_28, (SubLObject)$ic20$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var27_28 == $ic21$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic19$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic22$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic23$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : $ic24$);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)$ic25$, var4);
        final SubLObject var16 = (SubLObject)((NIL != var15) ? conses_high.cadr(var15) : NIL);
        final SubLObject var17;
        var4 = (var17 = var5);
        if (NIL != var12) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list(reader.bq_cons(var12, (SubLObject)$ic26$)), (SubLObject)ConsesLow.listS((SubLObject)$ic27$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)$ic23$, var14, (SubLObject)$ic25$, var16), (SubLObject)ConsesLow.list((SubLObject)$ic28$, var12), ConsesLow.append(var17, (SubLObject)NIL)));
        }
        final SubLObject var18 = (SubLObject)$ic29$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var18, (SubLObject)ConsesLow.list((SubLObject)$ic30$, var7, var14))), (SubLObject)ConsesLow.listS((SubLObject)$ic31$, (SubLObject)ConsesLow.list(var6, var18, (SubLObject)$ic25$, var16), ConsesLow.append(var17, (SubLObject)NIL)));
    }
    
    public static SubLObject f12366(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic32$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic32$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic32$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic32$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var43_44 = (SubLObject)NIL;
        while (NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic32$);
            var43_44 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic32$);
            if (NIL == conses_high.member(var43_44, (SubLObject)$ic33$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var11 = (SubLObject)T;
            }
            if (var43_44 == $ic21$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (NIL != var11 && NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic32$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic23$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : $ic24$);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)$ic25$, var4);
        final SubLObject var15 = (SubLObject)((NIL != var14) ? conses_high.cadr(var14) : NIL);
        final SubLObject var16;
        var4 = (var16 = var5);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic27$, (SubLObject)ConsesLow.list(var6, var8, (SubLObject)$ic22$, var7, (SubLObject)$ic23$, var13, (SubLObject)$ic25$, var15), ConsesLow.append(var16, (SubLObject)NIL));
    }
    
    public static SubLObject f12367(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic34$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic34$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic34$);
        var7 = var4.first();
        var4 = var4.rest();
        final SubLObject var8 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic34$);
        var4 = var4.rest();
        final SubLObject var9 = (SubLObject)(var4.isCons() ? var4.first() : $ic24$);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic34$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var10;
            var4 = (var10 = var5);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic27$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)$ic23$, var9, (SubLObject)$ic25$, var8), ConsesLow.append(var10, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic34$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12368(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic35$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic35$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic35$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic35$);
        var8 = var4.first();
        var4 = var4.rest();
        final SubLObject var9 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic35$);
        var4 = var4.rest();
        final SubLObject var10 = (SubLObject)(var4.isCons() ? var4.first() : $ic24$);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic35$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var11;
            var4 = (var11 = var5);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic36$, (SubLObject)ConsesLow.list(var6, var7, var8, (SubLObject)$ic23$, var10, (SubLObject)$ic25$, var9), ConsesLow.append(var11, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic35$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12369(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic37$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic37$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic37$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var61_62 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic37$);
            var61_62 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic37$);
            if (NIL == conses_high.member(var61_62, (SubLObject)$ic20$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var61_62 == $ic21$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic37$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic22$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic23$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : $ic24$);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)$ic25$, var4);
        final SubLObject var16 = (SubLObject)((NIL != var15) ? conses_high.cadr(var15) : NIL);
        final SubLObject var17;
        var4 = (var17 = var5);
        if (NIL != var12) {
            final SubLObject var18 = (SubLObject)$ic38$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var18, (SubLObject)ConsesLow.list((SubLObject)$ic39$, var7, var14))), (SubLObject)ConsesLow.listS((SubLObject)$ic40$, (SubLObject)ConsesLow.list(var12, var6, var18, (SubLObject)$ic25$, var16), ConsesLow.append(var17, (SubLObject)NIL)));
        }
        final SubLObject var18 = (SubLObject)$ic41$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var18, (SubLObject)ConsesLow.list((SubLObject)$ic39$, var7, var14))), (SubLObject)ConsesLow.listS((SubLObject)$ic31$, (SubLObject)ConsesLow.list(var6, var18, (SubLObject)$ic25$, var16), ConsesLow.append(var17, (SubLObject)NIL)));
    }
    
    public static SubLObject f12370(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic42$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic42$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic42$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic42$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var73_74 = (SubLObject)NIL;
        while (NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic42$);
            var73_74 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic42$);
            if (NIL == conses_high.member(var73_74, (SubLObject)$ic33$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var11 = (SubLObject)T;
            }
            if (var73_74 == $ic21$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (NIL != var11 && NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic42$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic23$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : $ic24$);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)$ic25$, var4);
        final SubLObject var15 = (SubLObject)((NIL != var14) ? conses_high.cadr(var14) : NIL);
        final SubLObject var16;
        var4 = (var16 = var5);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic43$, (SubLObject)ConsesLow.list(var6, var8, (SubLObject)$ic22$, var7, (SubLObject)$ic23$, var13, (SubLObject)$ic25$, var15), ConsesLow.append(var16, (SubLObject)NIL));
    }
    
    public static SubLObject f12371(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic44$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic44$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic44$);
        var7 = var4.first();
        var4 = var4.rest();
        final SubLObject var8 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic44$);
        var4 = var4.rest();
        final SubLObject var9 = (SubLObject)(var4.isCons() ? var4.first() : $ic24$);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic44$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var10;
            var4 = (var10 = var5);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic43$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)$ic23$, var9, (SubLObject)$ic25$, var8), ConsesLow.append(var10, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic44$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12372(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic45$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic45$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic45$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic45$);
        var8 = var4.first();
        var4 = var4.rest();
        final SubLObject var9 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic45$);
        var4 = var4.rest();
        final SubLObject var10 = (SubLObject)(var4.isCons() ? var4.first() : $ic24$);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic45$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var11;
            var4 = (var11 = var5);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic46$, (SubLObject)ConsesLow.list(var6, var7, var8, (SubLObject)$ic23$, var10, (SubLObject)$ic25$, var9), ConsesLow.append(var11, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic45$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12373(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic47$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic47$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic47$);
        var7 = var4.first();
        var4 = var4.rest();
        final SubLObject var8 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic47$);
        var4 = var4.rest();
        final SubLObject var9 = (SubLObject)(var4.isCons() ? var4.first() : $ic24$);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic47$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var10;
            var4 = (var10 = var5);
            final SubLObject var11 = (SubLObject)$ic48$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var11, (SubLObject)ConsesLow.list((SubLObject)$ic49$, var7, var9))), (SubLObject)ConsesLow.listS((SubLObject)$ic31$, (SubLObject)ConsesLow.list(var6, var11, (SubLObject)$ic25$, var8), ConsesLow.append(var10, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic47$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12374(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic50$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic50$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic50$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic50$);
        var8 = var4.first();
        var4 = var4.rest();
        final SubLObject var9 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic50$);
        var4 = var4.rest();
        final SubLObject var10 = (SubLObject)(var4.isCons() ? var4.first() : $ic24$);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic50$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var11;
            var4 = (var11 = var5);
            final SubLObject var12 = (SubLObject)$ic51$;
            final SubLObject var13 = (SubLObject)$ic52$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var12, (SubLObject)ConsesLow.list((SubLObject)$ic49$, var8, var10))), (SubLObject)ConsesLow.listS((SubLObject)$ic53$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var13, var12, (SubLObject)ConsesLow.list((SubLObject)$ic54$, var13)), (SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic55$, var13), (SubLObject)ConsesLow.list((SubLObject)$ic55$, var13)), (SubLObject)ConsesLow.list(var7, (SubLObject)ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)$ic56$, (SubLObject)ONE_INTEGER, var7))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic57$, var9, (SubLObject)ConsesLow.list((SubLObject)$ic58$, var13))), ConsesLow.append(var11, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic50$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12375(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic59$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic59$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic59$);
        var7 = var4.first();
        var4 = var4.rest();
        final SubLObject var8 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic59$);
        var4 = var4.rest();
        final SubLObject var9 = (SubLObject)(var4.isCons() ? var4.first() : $ic24$);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic59$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var10;
            var4 = (var10 = var5);
            final SubLObject var11 = (SubLObject)$ic60$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var11, (SubLObject)ConsesLow.list((SubLObject)$ic61$, var7, var9))), (SubLObject)ConsesLow.listS((SubLObject)$ic31$, (SubLObject)ConsesLow.list(var6, var11, (SubLObject)$ic25$, var8), ConsesLow.append(var10, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic59$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12376(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic62$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic62$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic62$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic62$);
        var8 = var4.first();
        var4 = var4.rest();
        final SubLObject var9 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic62$);
        var4 = var4.rest();
        final SubLObject var10 = (SubLObject)(var4.isCons() ? var4.first() : $ic24$);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic62$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var11;
            var4 = (var11 = var5);
            final SubLObject var12 = (SubLObject)$ic63$;
            final SubLObject var13 = (SubLObject)$ic64$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var12, (SubLObject)ConsesLow.list((SubLObject)$ic61$, var8, var10))), (SubLObject)ConsesLow.listS((SubLObject)$ic53$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var13, var12, (SubLObject)ConsesLow.list((SubLObject)$ic54$, var13)), (SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic55$, var13), (SubLObject)ConsesLow.list((SubLObject)$ic55$, var13)), (SubLObject)ConsesLow.list(var7, (SubLObject)ZERO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)$ic56$, (SubLObject)ONE_INTEGER, var7))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic57$, var9, (SubLObject)ConsesLow.list((SubLObject)$ic58$, var13))), ConsesLow.append(var11, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic62$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12377(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic65$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic65$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic65$);
        var7 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var8;
            var4 = (var8 = var5);
            final SubLObject var9 = (SubLObject)$ic66$;
            final SubLObject var10 = (SubLObject)$ic67$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list(reader.bq_cons(var9, (SubLObject)$ic68$), var6), (SubLObject)ConsesLow.list((SubLObject)$ic69$, var7, var9), (SubLObject)ConsesLow.list((SubLObject)$ic70$, (SubLObject)ConsesLow.list((SubLObject)$ic71$, var9), (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var10, (SubLObject)ConsesLow.list((SubLObject)$ic72$, var9))), (SubLObject)ConsesLow.list((SubLObject)$ic73$, (SubLObject)ConsesLow.list((SubLObject)$ic74$, var10), (SubLObject)ConsesLow.listS((SubLObject)$ic75$, (SubLObject)ConsesLow.list((SubLObject)$ic76$, var6, var10), ConsesLow.append(var8, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)$ic77$, (SubLObject)ConsesLow.list((SubLObject)$ic78$, (SubLObject)ConsesLow.list((SubLObject)$ic30$, var10)), (SubLObject)ConsesLow.list((SubLObject)$ic69$, (SubLObject)$ic78$, var9)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic65$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12378(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic79$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic79$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic79$);
        var7 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var8;
            var4 = (var8 = var5);
            final SubLObject var9 = (SubLObject)$ic80$;
            final SubLObject var10 = (SubLObject)$ic81$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list(reader.bq_cons(var9, (SubLObject)$ic68$), var6), (SubLObject)ConsesLow.list((SubLObject)$ic69$, var7, var9), (SubLObject)ConsesLow.list((SubLObject)$ic70$, (SubLObject)ConsesLow.list((SubLObject)$ic71$, var9), (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var10, (SubLObject)ConsesLow.list((SubLObject)$ic72$, var9))), (SubLObject)ConsesLow.listS((SubLObject)$ic75$, (SubLObject)ConsesLow.list((SubLObject)$ic76$, var6, var10), ConsesLow.append(var8, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic77$, (SubLObject)ConsesLow.list((SubLObject)$ic78$, (SubLObject)ConsesLow.list((SubLObject)$ic30$, var10)), (SubLObject)ConsesLow.list((SubLObject)$ic69$, (SubLObject)$ic78$, var9)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic79$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12379(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic82$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic82$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic82$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic82$);
        var8 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var9;
            var4 = (var9 = var5);
            final SubLObject var10 = (SubLObject)$ic83$;
            final SubLObject var11 = (SubLObject)$ic84$;
            final SubLObject var12 = (SubLObject)$ic85$;
            final SubLObject var13 = (SubLObject)$ic86$;
            final SubLObject var14 = (SubLObject)$ic87$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list(reader.bq_cons(var10, (SubLObject)$ic68$), reader.bq_cons(var11, (SubLObject)$ic68$), var6, var7), (SubLObject)ConsesLow.list((SubLObject)$ic69$, var8, var10), (SubLObject)ConsesLow.list((SubLObject)$ic69$, var7, var11), (SubLObject)ConsesLow.list((SubLObject)$ic70$, (SubLObject)ConsesLow.list((SubLObject)$ic71$, var10), (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var12, (SubLObject)ConsesLow.list((SubLObject)$ic72$, var10)), (SubLObject)ConsesLow.list(var13, (SubLObject)ConsesLow.list((SubLObject)$ic72$, var11))), (SubLObject)ConsesLow.listS((SubLObject)$ic75$, (SubLObject)ConsesLow.list((SubLObject)$ic76$, var6, var12), (SubLObject)ConsesLow.list((SubLObject)$ic76$, var7, var13), ConsesLow.append(var9, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic46$, (SubLObject)ConsesLow.list((SubLObject)$ic78$, var14, var12), (SubLObject)ConsesLow.list((SubLObject)$ic69$, (SubLObject)$ic78$, var10), (SubLObject)ConsesLow.list((SubLObject)$ic69$, (SubLObject)ConsesLow.list((SubLObject)$ic88$, var14, var7), var11)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic82$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12380(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)$ic89$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f12381(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)$ic90$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f12382(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)$ic91$, (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)$ic92$, ConsesLow.append(var5, (SubLObject)NIL)));
    }
    
    public static SubLObject f12383(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)$ic93$, reader.bq_cons((SubLObject)$ic94$, ConsesLow.append(var5, (SubLObject)NIL)));
    }
    
    public static SubLObject f12384(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)$ic95$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f12385(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)$ic96$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f12386(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)$ic97$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f12387(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic98$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic98$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic98$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var136_137 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic98$);
            var136_137 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic98$);
            if (NIL == conses_high.member(var136_137, (SubLObject)$ic99$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var136_137 == $ic21$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic98$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic25$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic31$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)$ic25$, var12), ConsesLow.append(var13, (SubLObject)NIL));
    }
    
    public static SubLObject f12388(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic100$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic100$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic100$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var147_148 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic100$);
            var147_148 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic100$);
            if (NIL == conses_high.member(var147_148, (SubLObject)$ic99$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var147_148 == $ic21$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic100$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic25$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic31$, (SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic101$, var7), (SubLObject)$ic25$, var12), ConsesLow.append(var13, (SubLObject)NIL));
    }
    
    public static SubLObject f12389(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic102$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic102$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic102$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic102$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var157_158 = (SubLObject)NIL;
        while (NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic102$);
            var157_158 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic102$);
            if (NIL == conses_high.member(var157_158, (SubLObject)$ic99$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var11 = (SubLObject)T;
            }
            if (var157_158 == $ic21$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (NIL != var11 && NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic102$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic25$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list(reader.bq_cons(var7, (SubLObject)$ic26$)), (SubLObject)ConsesLow.listS((SubLObject)$ic103$, (SubLObject)ConsesLow.list(var6, var8, (SubLObject)$ic25$, var13), ConsesLow.append(var14, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic28$, var7)))));
    }
    
    public static SubLObject f12390(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic100$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic100$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic100$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var166_167 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic100$);
            var166_167 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic100$);
            if (NIL == conses_high.member(var166_167, (SubLObject)$ic99$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var166_167 == $ic21$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic100$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic25$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic31$, (SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic104$, var7), (SubLObject)$ic25$, var12), ConsesLow.append(var13, (SubLObject)NIL));
    }
    
    public static SubLObject f12391(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic102$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic102$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic102$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic102$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var175_176 = (SubLObject)NIL;
        while (NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic102$);
            var175_176 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic102$);
            if (NIL == conses_high.member(var175_176, (SubLObject)$ic99$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var11 = (SubLObject)T;
            }
            if (var175_176 == $ic21$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (NIL != var11 && NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic102$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic25$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list(reader.bq_cons(var7, (SubLObject)$ic26$)), (SubLObject)ConsesLow.listS((SubLObject)$ic105$, (SubLObject)ConsesLow.list(var6, var8, (SubLObject)$ic25$, var13), ConsesLow.append(var14, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic28$, var7)))));
    }
    
    public static SubLObject f12392(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic106$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic106$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic106$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var185_186 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic106$);
            var185_186 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic106$);
            if (NIL == conses_high.member(var185_186, (SubLObject)$ic107$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var185_186 == $ic21$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic106$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic108$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic25$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15;
        var4 = (var15 = var5);
        if ($ic109$ == var12) {
            return (SubLObject)ConsesLow.listS((SubLObject)$ic105$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)$ic25$, var14), ConsesLow.append(var15, (SubLObject)NIL));
        }
        if ($ic110$ == var12) {
            return (SubLObject)ConsesLow.listS((SubLObject)$ic103$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)$ic25$, var14), ConsesLow.append(var15, (SubLObject)NIL));
        }
        if (NIL == var12) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic75$, (SubLObject)ConsesLow.listS((SubLObject)$ic111$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)$ic108$, (SubLObject)$ic110$, (SubLObject)$ic25$, var14), ConsesLow.append(var15, (SubLObject)NIL)), (SubLObject)ConsesLow.listS((SubLObject)$ic111$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)$ic108$, (SubLObject)$ic109$, (SubLObject)$ic25$, var14), ConsesLow.append(var15, (SubLObject)NIL)));
        }
        return (SubLObject)ConsesLow.list((SubLObject)$ic112$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)EQ, (SubLObject)$ic109$, var12), (SubLObject)ConsesLow.listS((SubLObject)$ic111$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)$ic108$, (SubLObject)$ic109$, (SubLObject)$ic25$, var14), ConsesLow.append(var15, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)EQ, (SubLObject)$ic110$, var12), (SubLObject)ConsesLow.listS((SubLObject)$ic111$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)$ic108$, (SubLObject)$ic110$, (SubLObject)$ic25$, var14), ConsesLow.append(var15, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)T, (SubLObject)ConsesLow.list((SubLObject)$ic113$, (SubLObject)$ic114$, var12)));
    }
    
    public static SubLObject f12393(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic115$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic115$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic115$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic115$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic115$);
        var9 = var4.first();
        var4 = var4.rest();
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = var4;
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var198_199 = (SubLObject)NIL;
        while (NIL != var11) {
            cdestructuring_bind.destructuring_bind_must_consp(var11, var3, (SubLObject)$ic115$);
            var198_199 = var11.first();
            var11 = var11.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var11, var3, (SubLObject)$ic115$);
            if (NIL == conses_high.member(var198_199, (SubLObject)$ic99$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var12 = (SubLObject)T;
            }
            if (var198_199 == $ic21$) {
                var10 = var11.first();
            }
            var11 = var11.rest();
        }
        if (NIL != var12 && NIL == var10) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic115$);
        }
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic25$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15;
        var4 = (var15 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)$ic75$, (SubLObject)ConsesLow.list((SubLObject)$ic116$, (SubLObject)ConsesLow.list(var6, var7, var9, (SubLObject)$ic25$, var14), (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list(reader.bq_cons(var8, (SubLObject)$ic117$)), ConsesLow.append(var15, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)$ic118$, (SubLObject)ConsesLow.list(var6, var7, var9, (SubLObject)$ic25$, var14), (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list(reader.bq_cons(var8, (SubLObject)$ic119$)), ConsesLow.append(var15, (SubLObject)NIL))));
    }
    
    public static SubLObject f12394(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic120$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic120$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic120$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic120$);
        var8 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var9;
            var4 = (var9 = var5);
            final SubLObject var10 = (SubLObject)$ic121$;
            return (SubLObject)ConsesLow.listS((SubLObject)$ic122$, (SubLObject)ConsesLow.list(var6, var10, var7, var8), (SubLObject)ConsesLow.list((SubLObject)$ic123$, var10), ConsesLow.append(var9, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic120$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12395(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic124$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic124$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic124$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var211_212 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic124$);
            var211_212 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic124$);
            if (NIL == conses_high.member(var211_212, (SubLObject)$ic125$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var211_212 == $ic21$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic124$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic25$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic126$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15;
        var4 = (var15 = var5);
        final SubLObject var16 = (SubLObject)$ic127$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic31$, (SubLObject)ConsesLow.list(var16, var7, (SubLObject)$ic25$, var12), (SubLObject)ConsesLow.listS((SubLObject)$ic111$, (SubLObject)ConsesLow.list(var6, var16, (SubLObject)$ic108$, var14, (SubLObject)$ic25$, var12), ConsesLow.append(var15, (SubLObject)NIL)));
    }
    
    public static SubLObject f12396(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic128$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic128$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic128$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic128$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic128$);
        var9 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic128$);
        var10 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var11;
            var4 = (var11 = var5);
            final SubLObject var12 = (SubLObject)$ic129$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic130$, (SubLObject)ConsesLow.list(var12, var9, var10), (SubLObject)ConsesLow.listS((SubLObject)$ic122$, (SubLObject)ConsesLow.list(var6, var7, var8, var12), ConsesLow.append(var11, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic128$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12397(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic131$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic131$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic131$);
        var7 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            var4 = var5;
            SubLObject var8 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic131$);
            var8 = var4.first();
            final SubLObject var9;
            var4 = (var9 = var4.rest());
            return (SubLObject)ConsesLow.listS((SubLObject)$ic132$, reader.bq_cons(var6, var7), var8, ConsesLow.append(var9, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic131$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12398() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0199", "f12361", "S#15161");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0199", "f12362", "S#15162");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0199", "f12363", "S#15163");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0199", "f12364", "S#15164");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0199", "f12365", "S#15165");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0199", "f12366", "S#15166");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0199", "f12367", "S#15167");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0199", "f12368", "S#15168");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0199", "f12369", "S#15169");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0199", "f12370", "S#15170");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0199", "f12371", "S#15171");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0199", "f12372", "S#15172");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0199", "f12373", "S#15173");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0199", "f12374", "S#15174");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0199", "f12375", "S#15175");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0199", "f12376", "S#15176");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0199", "f12377", "S#15177");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0199", "f12378", "S#15178");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0199", "f12379", "S#15179");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0199", "f12380", "WITHOUT-WFF-SEMANTICS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0199", "f12381", "S#15180");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0199", "f12382", "S#15181");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0199", "f12383", "S#15182");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0199", "f12384", "S#15183");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0199", "f12385", "S#15184");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0199", "f12386", "S#15185");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0199", "f12387", "S#15186");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0199", "f12388", "S#15187");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0199", "f12389", "S#15188");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0199", "f12390", "S#15189");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0199", "f12391", "S#15190");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0199", "f12392", "S#14184");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0199", "f12393", "S#15191");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0199", "f12394", "S#15192");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0199", "f12395", "S#15193");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0199", "f12396", "S#15194");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0199", "f12397", "S#15195");
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12399() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12400() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f12398();
    }
    
    public void initializeVariables() {
        f12399();
    }
    
    public void runTopLevelForms() {
        f12400();
    }
    
    static {
        me = (SubLFile)new module0199();
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#6061", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic1$ = makeUninternedSymbol("US#1C67124");
        $ic2$ = makeSymbol("CLET");
        $ic3$ = makeSymbol("FIF");
        $ic4$ = makeSymbol("S#15196", "CYC");
        $ic5$ = makeSymbol("S#15197", "CYC");
        $ic6$ = makeUninternedSymbol("US#3023841");
        $ic7$ = makeUninternedSymbol("US#1C67124");
        $ic8$ = makeSymbol("APPEND");
        $ic9$ = makeSymbol("LIST");
        $ic10$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#6061", "CYC"), (SubLObject)makeSymbol("S#3267", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic11$ = makeUninternedSymbol("US#3023841");
        $ic12$ = makeUninternedSymbol("US#1C67124");
        $ic13$ = ConsesLow.list((SubLObject)NIL);
        $ic14$ = makeSymbol("PIF");
        $ic15$ = makeSymbol("RET");
        $ic16$ = makeSymbol("S#15198", "CYC");
        $ic17$ = makeUninternedSymbol("US#3023841");
        $ic18$ = makeUninternedSymbol("US#1C67124");
        $ic19$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#15199", "CYC"), (SubLObject)makeSymbol("S#6061", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#15200", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#15201", "CYC"), (SubLObject)makeKeyword("IGNORE")), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic20$ = ConsesLow.list((SubLObject)makeKeyword("ARGNUM"), (SubLObject)makeKeyword("SEQVAR-HANDLING"), (SubLObject)makeKeyword("DONE"));
        $ic21$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic22$ = makeKeyword("ARGNUM");
        $ic23$ = makeKeyword("SEQVAR-HANDLING");
        $ic24$ = makeKeyword("IGNORE");
        $ic25$ = makeKeyword("DONE");
        $ic26$ = ConsesLow.list((SubLObject)ZERO_INTEGER);
        $ic27$ = makeSymbol("S#15165", "CYC");
        $ic28$ = makeSymbol("CINC");
        $ic29$ = makeUninternedSymbol("US#74A08C1");
        $ic30$ = makeSymbol("FORMULA-ARGS");
        $ic31$ = makeSymbol("DO-LIST");
        $ic32$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#15199", "CYC"), (SubLObject)makeSymbol("S#15202", "CYC"), (SubLObject)makeSymbol("S#6061", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#15201", "CYC"), (SubLObject)makeKeyword("IGNORE")), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic33$ = ConsesLow.list((SubLObject)makeKeyword("SEQVAR-HANDLING"), (SubLObject)makeKeyword("DONE"));
        $ic34$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#15199", "CYC"), (SubLObject)makeSymbol("S#6061", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#8587", "CYC"), (SubLObject)NIL), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#15201", "CYC"), (SubLObject)makeKeyword("IGNORE"))), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic35$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#15199", "CYC"), (SubLObject)makeSymbol("S#15202", "CYC"), (SubLObject)makeSymbol("S#6061", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#8587", "CYC"), (SubLObject)NIL), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#15201", "CYC"), (SubLObject)makeKeyword("IGNORE"))), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic36$ = makeSymbol("S#15166", "CYC");
        $ic37$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#15203", "CYC"), (SubLObject)makeSymbol("S#6061", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#15200", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#15201", "CYC"), (SubLObject)makeKeyword("IGNORE")), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic38$ = makeUninternedSymbol("US#516895A");
        $ic39$ = makeSymbol("S#15204", "CYC");
        $ic40$ = makeSymbol("DO-LIST-INDEX");
        $ic41$ = makeUninternedSymbol("US#516895A");
        $ic42$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#15203", "CYC"), (SubLObject)makeSymbol("S#15202", "CYC"), (SubLObject)makeSymbol("S#6061", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#15201", "CYC"), (SubLObject)makeKeyword("IGNORE")), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic43$ = makeSymbol("S#15169", "CYC");
        $ic44$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#15203", "CYC"), (SubLObject)makeSymbol("S#6061", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#8587", "CYC"), (SubLObject)NIL), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#15201", "CYC"), (SubLObject)makeKeyword("IGNORE"))), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic45$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#15203", "CYC"), (SubLObject)makeSymbol("S#15202", "CYC"), (SubLObject)makeSymbol("S#6061", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#8587", "CYC"), (SubLObject)NIL), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#15201", "CYC"), (SubLObject)makeKeyword("IGNORE"))), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic46$ = makeSymbol("S#15170", "CYC");
        $ic47$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#15199", "CYC"), (SubLObject)makeSymbol("S#12398", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#8587", "CYC"), (SubLObject)NIL), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#15201", "CYC"), (SubLObject)makeKeyword("IGNORE"))), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic48$ = makeUninternedSymbol("US#74A08C1");
        $ic49$ = makeSymbol("S#15205", "CYC");
        $ic50$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#15199", "CYC"), (SubLObject)makeSymbol("S#15202", "CYC"), (SubLObject)makeSymbol("S#12398", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#8587", "CYC"), (SubLObject)NIL), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#15201", "CYC"), (SubLObject)makeKeyword("IGNORE"))), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic51$ = makeUninternedSymbol("US#74A08C1");
        $ic52$ = makeUninternedSymbol("US#713E610");
        $ic53$ = makeSymbol("CDO");
        $ic54$ = makeSymbol("CDR");
        $ic55$ = makeSymbol("CAR");
        $ic56$ = makeSymbol("+");
        $ic57$ = makeSymbol("COR");
        $ic58$ = makeSymbol("NULL");
        $ic59$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#15203", "CYC"), (SubLObject)makeSymbol("S#12398", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#8587", "CYC"), (SubLObject)NIL), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#15201", "CYC"), (SubLObject)makeKeyword("IGNORE"))), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic60$ = makeUninternedSymbol("US#516895A");
        $ic61$ = makeSymbol("S#15206", "CYC");
        $ic62$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#15203", "CYC"), (SubLObject)makeSymbol("S#15202", "CYC"), (SubLObject)makeSymbol("S#12398", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#8587", "CYC"), (SubLObject)NIL), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#15201", "CYC"), (SubLObject)makeKeyword("IGNORE"))), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic63$ = makeUninternedSymbol("US#516895A");
        $ic64$ = makeUninternedSymbol("US#713E610");
        $ic65$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12398", "CYC"), (SubLObject)makeSymbol("S#6061", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic66$ = makeUninternedSymbol("US#352BD50");
        $ic67$ = makeUninternedSymbol("US#13A0444");
        $ic68$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#3952", "CYC")));
        $ic69$ = makeSymbol("S#3953", "CYC");
        $ic70$ = makeSymbol("UNTIL");
        $ic71$ = makeSymbol("S#3954", "CYC");
        $ic72$ = makeSymbol("S#3955", "CYC");
        $ic73$ = makeSymbol("PWHEN");
        $ic74$ = makeSymbol("S#15207", "CYC");
        $ic75$ = makeSymbol("PROGN");
        $ic76$ = makeSymbol("CSETQ");
        $ic77$ = makeSymbol("CDOLIST");
        $ic78$ = makeSymbol("S#202", "CYC");
        $ic79$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#202", "CYC"), (SubLObject)makeSymbol("S#6061", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic80$ = makeUninternedSymbol("US#352BD50");
        $ic81$ = makeUninternedSymbol("US#13A0444");
        $ic82$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#202", "CYC"), (SubLObject)makeSymbol("S#15208", "CYC"), (SubLObject)makeSymbol("S#6061", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic83$ = makeUninternedSymbol("US#77F2305");
        $ic84$ = makeUninternedSymbol("US#70BAB00");
        $ic85$ = makeUninternedSymbol("US#13A0444");
        $ic86$ = makeUninternedSymbol("US#5AD2081");
        $ic87$ = makeUninternedSymbol("US#6FF6F9E");
        $ic88$ = makeSymbol("S#3309", "CYC");
        $ic89$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)makeSymbol("S#1922", "CYC"), (SubLObject)NIL), ConsesLow.list((SubLObject)makeSymbol("S#15209", "CYC"), (SubLObject)NIL), ConsesLow.list((SubLObject)makeSymbol("S#11880", "CYC"), (SubLObject)NIL), ConsesLow.list((SubLObject)makeSymbol("S#15210", "CYC"), (SubLObject)NIL), ConsesLow.list((SubLObject)makeSymbol("*CHECK-WFF-COHERENCE?*"), (SubLObject)NIL), ConsesLow.list((SubLObject)makeSymbol("S#15211", "CYC"), (SubLObject)NIL), ConsesLow.list((SubLObject)makeSymbol("S#12231", "CYC"), (SubLObject)NIL), ConsesLow.list((SubLObject)makeSymbol("S#11891", "CYC"), (SubLObject)NIL), ConsesLow.list((SubLObject)makeSymbol("S#11889", "CYC"), (SubLObject)NIL), ConsesLow.list((SubLObject)makeSymbol("S#12525", "CYC"), (SubLObject)NIL), ConsesLow.list((SubLObject)makeSymbol("*SUSPEND-SBHL-TYPE-CHECKING?*"), (SubLObject)T) });
        $ic90$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#15210", "CYC"), (SubLObject)T));
        $ic91$ = makeSymbol("WITHOUT-WFF-SEMANTICS");
        $ic92$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#15212", "CYC"), (SubLObject)NIL));
        $ic93$ = makeSymbol("S#15181", "CYC");
        $ic94$ = makeSymbol("S#15213", "CYC");
        $ic95$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12215", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FIF"), (SubLObject)makeSymbol("S#12215", "CYC"), (SubLObject)makeSymbol("S#12215", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("MAKE-HASH-TABLE"), (SubLObject)makeInteger(32), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)EQL)))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("*STANDARDIZE-VARIABLES-MEMORY*"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FIF"), (SubLObject)makeSymbol("*STANDARDIZE-VARIABLES-MEMORY*"), (SubLObject)makeSymbol("*STANDARDIZE-VARIABLES-MEMORY*"), (SubLObject)NIL)));
        $ic96$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12215", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("MAKE-HASH-TABLE"), (SubLObject)FOUR_INTEGER, (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)EQL))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("*STANDARDIZE-VARIABLES-MEMORY*"), (SubLObject)NIL));
        $ic97$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12212", "CYC"), (SubLObject)NIL), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("*ENCAPSULATE-INTENSIONAL-FORMULA?*"), (SubLObject)NIL));
        $ic98$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#15214", "CYC"), (SubLObject)makeSymbol("S#735", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic99$ = ConsesLow.list((SubLObject)makeKeyword("DONE"));
        $ic100$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#14183", "CYC"), (SubLObject)makeSymbol("S#13916", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic101$ = makeSymbol("NEG-LITS");
        $ic102$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#14183", "CYC"), (SubLObject)makeSymbol("S#134", "CYC"), (SubLObject)makeSymbol("S#13916", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic103$ = makeSymbol("S#15187", "CYC");
        $ic104$ = makeSymbol("POS-LITS");
        $ic105$ = makeSymbol("S#15189", "CYC");
        $ic106$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#14183", "CYC"), (SubLObject)makeSymbol("S#15215", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#12397", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic107$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("DONE"));
        $ic108$ = makeKeyword("SENSE");
        $ic109$ = makeKeyword("POS");
        $ic110$ = makeKeyword("NEG");
        $ic111$ = makeSymbol("S#14184", "CYC");
        $ic112$ = makeSymbol("PCOND");
        $ic113$ = makeSymbol("ERROR");
        $ic114$ = makeString("Invalid sense ~s");
        $ic115$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#14183", "CYC"), (SubLObject)makeSymbol("S#15216", "CYC"), (SubLObject)makeSymbol("S#15217", "CYC"), (SubLObject)makeSymbol("S#15215", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic116$ = makeSymbol("S#15188", "CYC");
        $ic117$ = ConsesLow.list((SubLObject)makeKeyword("NEG"));
        $ic118$ = makeSymbol("S#15190", "CYC");
        $ic119$ = ConsesLow.list((SubLObject)makeKeyword("POS"));
        $ic120$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#15218", "CYC"), (SubLObject)makeSymbol("S#15217", "CYC"), (SubLObject)makeSymbol("S#15215", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic121$ = makeUninternedSymbol("US#3F92607");
        $ic122$ = makeSymbol("S#15191", "CYC");
        $ic123$ = makeSymbol("IGNORE");
        $ic124$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#14183", "CYC"), (SubLObject)makeSymbol("S#735", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC"), (SubLObject)makeSymbol("S#15217", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic125$ = ConsesLow.list((SubLObject)makeKeyword("DONE"), (SubLObject)makeKeyword("SENSE-VAR"));
        $ic126$ = makeKeyword("SENSE-VAR");
        $ic127$ = makeUninternedSymbol("US#3237146");
        $ic128$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#14183", "CYC"), (SubLObject)makeSymbol("S#15219", "CYC"), (SubLObject)makeSymbol("S#15217", "CYC"), (SubLObject)makeSymbol("S#15220", "CYC"), (SubLObject)makeSymbol("S#735", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic129$ = makeUninternedSymbol("US#3237146");
        $ic130$ = makeSymbol("S#1601", "CYC");
        $ic131$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#15221", "CYC"), (SubLObject)makeSymbol("S#149", "CYC")), (SubLObject)makeSymbol("S#9955", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic132$ = makeSymbol("CDESTRUCTURING-BIND");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 346 ms
	
	Decompiled with Procyon 0.5.32.
*/