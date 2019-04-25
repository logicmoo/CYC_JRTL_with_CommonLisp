package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0339 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0339";
    public static final String myFingerPrint = "869e3f2b02e700e6e820561705ed41defabc53c695121c20bbd25b99bc83bfc7";
    public static SubLSymbol $g2901$;
    public static SubLSymbol $g2902$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLList $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLList $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLList $ic30$;
    private static final SubLList $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLList $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLList $ic37$;
    private static final SubLList $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLList $ic43$;
    private static final SubLList $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLList $ic48$;
    private static final SubLList $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLList $ic54$;
    private static final SubLList $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLList $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLList $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLList $ic72$;
    private static final SubLList $ic73$;
    private static final SubLList $ic74$;
    private static final SubLList $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLList $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLList $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLList $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLList $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLList $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLList $ic99$;
    private static final SubLList $ic100$;
    private static final SubLList $ic101$;
    private static final SubLList $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLList $ic118$;
    private static final SubLList $ic119$;
    private static final SubLList $ic120$;
    private static final SubLList $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLList $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLList $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLList $ic133$;
    private static final SubLList $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLList $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLList $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLList $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLList $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLString $ic152$;
    private static final SubLList $ic153$;
    private static final SubLList $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLList $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLSymbol $ic161$;
    
    public static SubLObject f22738(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        if (NIL != var4) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
            return (SubLObject)NIL;
        }
        final SubLObject var7;
        var4 = (var7 = var5);
        assert NIL != Types.symbolp(var6) : var6;
        return (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list(var6), (SubLObject)ConsesLow.list((SubLObject)$ic3$, reader.bq_cons((SubLObject)$ic4$, ConsesLow.append(var7, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var6)));
    }
    
    public static SubLObject f22739(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic6$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic6$);
        var6 = var4.first();
        var4 = var4.rest();
        if (NIL != var4) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic6$);
            return (SubLObject)NIL;
        }
        final SubLObject var7;
        var4 = (var7 = var5);
        assert NIL != Types.symbolp(var6) : var6;
        return (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list(var6), (SubLObject)ConsesLow.list((SubLObject)$ic3$, reader.bq_cons((SubLObject)$ic4$, ConsesLow.append(var7, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic7$, var6)));
    }
    
    public static SubLObject f22740(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic8$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic8$);
        var6 = var4.first();
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic8$);
        var4 = var4.rest();
        if (NIL != var4) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic8$);
            return (SubLObject)NIL;
        }
        final SubLObject var8;
        var4 = (var8 = var5);
        assert NIL != Types.symbolp(var6) : var6;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic9$, (SubLObject)ConsesLow.list(var6), (SubLObject)ConsesLow.list((SubLObject)$ic10$, var6, (SubLObject)ConsesLow.list((SubLObject)$ic11$, var7)), ConsesLow.append(var8, (SubLObject)NIL));
    }
    
    public static SubLObject f22741(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic12$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic12$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic12$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var24_25 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic12$);
            var24_25 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic12$);
            if (NIL == conses_high.member(var24_25, (SubLObject)$ic13$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var24_25 == $ic14$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic12$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic15$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic16$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15;
        var4 = (var15 = var5);
        if (NIL == var12) {
            return (SubLObject)ConsesLow.listS((SubLObject)$ic17$, (SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic18$, var7), (SubLObject)$ic16$, var14), ConsesLow.append(var15, (SubLObject)NIL));
        }
        return (SubLObject)ConsesLow.list((SubLObject)$ic19$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)$ic16$, var14), (SubLObject)ConsesLow.listS((SubLObject)$ic20$, (SubLObject)ConsesLow.list((SubLObject)$ic21$, var6, var12), ConsesLow.append(var15, (SubLObject)NIL)));
    }
    
    public static SubLObject f22742(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic22$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic22$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic22$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var38_39 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic22$);
            var38_39 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic22$);
            if (NIL == conses_high.member(var38_39, (SubLObject)$ic23$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var38_39 == $ic14$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic22$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic24$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic16$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15;
        var4 = (var15 = var5);
        final SubLObject var16 = (SubLObject)$ic25$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var16, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic26$, (SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic27$, var16), (SubLObject)$ic16$, var14), (SubLObject)ConsesLow.listS((SubLObject)$ic20$, (SubLObject)ConsesLow.list((SubLObject)$ic28$, var12, var16, var6), ConsesLow.append(var15, (SubLObject)NIL))));
    }
    
    public static SubLObject f22743(final SubLObject var41, final SubLObject var34, final SubLObject var43) {
        return (SubLObject)makeBoolean(NIL == var41 || NIL != module0364.f24762(var34, var43));
    }
    
    public static SubLObject f22744(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic30$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic30$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic30$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic30$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var51_52 = (SubLObject)NIL;
        while (NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic30$);
            var51_52 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic30$);
            if (NIL == conses_high.member(var51_52, (SubLObject)$ic23$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var11 = (SubLObject)T;
            }
            if (var51_52 == $ic14$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (NIL != var11 && NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic30$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic24$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)$ic16$, var4);
        final SubLObject var15 = (SubLObject)((NIL != var14) ? conses_high.cadr(var14) : NIL);
        final SubLObject var16;
        var4 = (var16 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list(reader.bq_cons(var7, (SubLObject)$ic31$)), (SubLObject)ConsesLow.listS((SubLObject)$ic29$, (SubLObject)ConsesLow.list(var6, var8, (SubLObject)$ic24$, var13, (SubLObject)$ic16$, var15), ConsesLow.append(var16, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic32$, var7)))));
    }
    
    public static SubLObject f22745(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic33$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic33$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic33$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic33$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var63_64 = (SubLObject)NIL;
        while (NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic33$);
            var63_64 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic33$);
            if (NIL == conses_high.member(var63_64, (SubLObject)$ic23$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var11 = (SubLObject)T;
            }
            if (var63_64 == $ic14$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (NIL != var11 && NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic33$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic24$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)$ic16$, var4);
        final SubLObject var15 = (SubLObject)((NIL != var14) ? conses_high.cadr(var14) : NIL);
        final SubLObject var16;
        var4 = (var16 = var5);
        final SubLObject var17 = (SubLObject)$ic34$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic29$, (SubLObject)ConsesLow.list(var17, var8, (SubLObject)$ic24$, var13, (SubLObject)$ic16$, var15), (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic35$, var17)), (SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.list((SubLObject)$ic36$, var17))), ConsesLow.append(var16, (SubLObject)NIL)));
    }
    
    public static SubLObject f22746(final SubLObject var1, final SubLObject var2) {
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
        SubLObject var74_75 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic37$);
            var74_75 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic37$);
            if (NIL == conses_high.member(var74_75, (SubLObject)$ic38$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var74_75 == $ic14$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic37$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic16$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        final SubLObject var14 = (SubLObject)$ic39$;
        final SubLObject var15 = (SubLObject)$ic40$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var15, var7), (SubLObject)ConsesLow.list(var14, (SubLObject)ConsesLow.list((SubLObject)$ic41$, var15))), (SubLObject)ConsesLow.list((SubLObject)$ic19$, (SubLObject)ConsesLow.list(var6, var14, (SubLObject)$ic16$, var12), (SubLObject)ConsesLow.listS((SubLObject)$ic42$, (SubLObject)ConsesLow.list((SubLObject)EQ, var15, var6), ConsesLow.append(var13, (SubLObject)NIL))));
    }
    
    public static SubLObject f22747(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic43$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic43$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic43$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var85_86 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic43$);
            var85_86 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic43$);
            if (NIL == conses_high.member(var85_86, (SubLObject)$ic44$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var85_86 == $ic14$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic43$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic45$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic16$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15;
        var4 = (var15 = var5);
        final SubLObject var16 = (SubLObject)$ic46$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var16, (SubLObject)ConsesLow.list((SubLObject)$ic41$, var7))), (SubLObject)ConsesLow.listS((SubLObject)$ic47$, (SubLObject)ConsesLow.list(var6, var16, (SubLObject)$ic15$, var12, (SubLObject)$ic16$, var14), ConsesLow.append(var15, (SubLObject)NIL)));
    }
    
    public static SubLObject f22748(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic48$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic48$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic48$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var97_98 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic48$);
            var97_98 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic48$);
            if (NIL == conses_high.member(var97_98, (SubLObject)$ic49$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var97_98 == $ic14$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic48$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic24$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic45$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)$ic16$, var4);
        final SubLObject var16 = (SubLObject)((NIL != var15) ? conses_high.cadr(var15) : NIL);
        final SubLObject var17;
        var4 = (var17 = var5);
        final SubLObject var18 = (SubLObject)$ic50$;
        final SubLObject var19 = (SubLObject)$ic51$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic52$, (SubLObject)ConsesLow.list(var18, var19, var7, (SubLObject)$ic24$, var12, (SubLObject)$ic16$, var16), (SubLObject)ConsesLow.list((SubLObject)$ic53$, var19), (SubLObject)ConsesLow.listS((SubLObject)$ic19$, (SubLObject)ConsesLow.list(var6, var18, (SubLObject)$ic15$, var14, (SubLObject)$ic16$, var16), ConsesLow.append(var17, (SubLObject)NIL)));
    }
    
    public static SubLObject f22749(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic54$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic54$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic54$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var111_112 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic54$);
            var111_112 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic54$);
            if (NIL == conses_high.member(var111_112, (SubLObject)$ic55$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var111_112 == $ic14$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic54$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic56$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)$ic57$, (SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic58$, var7)), (SubLObject)ConsesLow.listS((SubLObject)$ic20$, (SubLObject)ConsesLow.list((SubLObject)$ic59$, var6, var12), ConsesLow.append(var13, (SubLObject)NIL)));
    }
    
    public static SubLObject f22750(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic60$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic60$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic60$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var123_124 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic60$);
            var123_124 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic60$);
            if (NIL == conses_high.member(var123_124, (SubLObject)$ic38$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var123_124 == $ic14$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic60$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic16$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        final SubLObject var14 = (SubLObject)$ic61$;
        final SubLObject var15 = (SubLObject)$ic62$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var14, var7), (SubLObject)ConsesLow.list(var15, (SubLObject)ConsesLow.list((SubLObject)$ic41$, var14))), (SubLObject)ConsesLow.list((SubLObject)$ic19$, (SubLObject)ConsesLow.list(var6, var15, (SubLObject)$ic15$, (SubLObject)$ic63$, (SubLObject)$ic16$, var12), (SubLObject)ConsesLow.listS((SubLObject)$ic20$, (SubLObject)ConsesLow.list((SubLObject)$ic64$, var6, var14), ConsesLow.append(var13, (SubLObject)NIL))));
    }
    
    public static SubLObject f22751(final SubLObject var1, final SubLObject var2) {
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
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var135_136 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic65$);
            var135_136 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic65$);
            if (NIL == conses_high.member(var135_136, (SubLObject)$ic38$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var135_136 == $ic14$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic65$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic16$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        final SubLObject var14 = (SubLObject)$ic66$;
        final SubLObject var15 = (SubLObject)$ic67$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var14, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic68$, (SubLObject)ConsesLow.list(var15, var14, (SubLObject)$ic45$, (SubLObject)$ic69$, (SubLObject)$ic16$, var12), (SubLObject)ConsesLow.list((SubLObject)$ic70$, (SubLObject)ConsesLow.list(var6, var15, (SubLObject)$ic16$, var12), (SubLObject)ConsesLow.listS((SubLObject)$ic20$, (SubLObject)ConsesLow.list((SubLObject)$ic71$, var6, var14), ConsesLow.append(var13, (SubLObject)NIL)))));
    }
    
    public static SubLObject f22752(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)$ic72$, (SubLObject)ConsesLow.listS((SubLObject)$ic3$, reader.bq_cons((SubLObject)$ic4$, ConsesLow.append(var5, (SubLObject)NIL)), (SubLObject)$ic73$));
    }
    
    public static SubLObject f22753(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)$ic74$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f22754(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)$ic75$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f22755(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic76$, (SubLObject)NIL, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f22756(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic77$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic78$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f22757() {
        final SubLThread var150 = SubLProcess.currentSubLThread();
        return $g2901$.getDynamicValue(var150).first();
    }
    
    public static SubLObject f22758() {
        final SubLThread var150 = SubLProcess.currentSubLThread();
        return module0035.f2110((SubLObject)$ic79$, $g2901$.getDynamicValue(var150), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f22759(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic80$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic81$, (SubLObject)ConsesLow.listS((SubLObject)$ic82$, var5, (SubLObject)$ic83$))), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f22760(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)$ic84$, (SubLObject)NIL, reader.bq_cons((SubLObject)$ic85$, ConsesLow.append(var5, (SubLObject)NIL)));
    }
    
    public static SubLObject f22761() {
        final SubLThread var150 = SubLProcess.currentSubLThread();
        return $g2902$.getDynamicValue(var150);
    }
    
    public static SubLObject f22762(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic86$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic87$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f22763(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic88$, (SubLObject)NIL, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f22764(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var5;
        final SubLObject var4 = var5 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic89$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic89$);
        var7 = var5.first();
        var5 = var5.rest();
        if (NIL != var5) {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic89$);
            return (SubLObject)NIL;
        }
        final SubLObject var8;
        var5 = (var8 = var6);
        if (NIL == module0035.f2169((SubLObject)$ic90$, reader.$features$.getDynamicValue(var3))) {
            return reader.bq_cons((SubLObject)$ic4$, ConsesLow.append(var8, (SubLObject)NIL));
        }
        return reader.bq_cons((SubLObject)$ic4$, ConsesLow.append(var8, (SubLObject)NIL));
    }
    
    public static SubLObject f22765(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic89$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic89$);
        var6 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var7;
            var4 = (var7 = var5);
            final SubLObject var8 = (SubLObject)$ic91$;
            final SubLObject var9 = (SubLObject)$ic92$;
            final SubLObject var10 = (SubLObject)$ic93$;
            final SubLObject var11 = (SubLObject)$ic94$;
            final SubLObject var12 = (SubLObject)$ic95$;
            final SubLObject var13 = (SubLObject)$ic96$;
            final SubLObject var14 = (SubLObject)$ic97$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var8, (SubLObject)ConsesLow.list((SubLObject)$ic98$, var6)), reader.bq_cons(var9, (SubLObject)$ic99$), reader.bq_cons(var10, (SubLObject)$ic100$), reader.bq_cons(var11, (SubLObject)$ic101$), reader.bq_cons(var12, (SubLObject)$ic102$), var13, var14), (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic103$, (SubLObject)ConsesLow.list((SubLObject)$ic104$, var8, (SubLObject)ZERO_INTEGER, var9)), (SubLObject)ConsesLow.list((SubLObject)$ic105$, (SubLObject)ConsesLow.list((SubLObject)$ic104$, var8, (SubLObject)ZERO_INTEGER, var10)), (SubLObject)ConsesLow.list((SubLObject)$ic106$, (SubLObject)ConsesLow.list((SubLObject)$ic104$, var8, (SubLObject)T, var11)), (SubLObject)ConsesLow.list((SubLObject)$ic107$, (SubLObject)ConsesLow.list((SubLObject)$ic104$, var8, (SubLObject)T, var12))), ConsesLow.append(var7, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)$ic10$, var13, (SubLObject)$ic99$), (SubLObject)ConsesLow.listS((SubLObject)$ic10$, var14, (SubLObject)$ic100$)))), (SubLObject)ConsesLow.list((SubLObject)$ic20$, var9, (SubLObject)ConsesLow.list((SubLObject)$ic10$, (SubLObject)$ic103$, (SubLObject)ConsesLow.list((SubLObject)$ic104$, var8, (SubLObject)ConsesLow.list((SubLObject)$ic108$, var9, var14), var13))), (SubLObject)ConsesLow.list((SubLObject)$ic20$, var10, (SubLObject)ConsesLow.list((SubLObject)$ic10$, (SubLObject)$ic105$, (SubLObject)ConsesLow.list((SubLObject)$ic104$, var8, (SubLObject)ConsesLow.list((SubLObject)$ic108$, var10, var14), var14))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic89$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22766(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic89$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic89$);
        var6 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var7;
            var4 = (var7 = var5);
            final SubLObject var8 = (SubLObject)$ic109$;
            final SubLObject var9 = (SubLObject)$ic110$;
            final SubLObject var10 = (SubLObject)$ic111$;
            final SubLObject var11 = (SubLObject)$ic112$;
            final SubLObject var12 = (SubLObject)$ic113$;
            final SubLObject var13 = (SubLObject)$ic114$;
            final SubLObject var14 = (SubLObject)$ic115$;
            final SubLObject var15 = (SubLObject)$ic116$;
            final SubLObject var16 = (SubLObject)$ic117$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list(var8, (SubLObject)ConsesLow.list((SubLObject)$ic98$, var6)), reader.bq_cons(var9, (SubLObject)$ic118$), reader.bq_cons(var10, (SubLObject)$ic119$), reader.bq_cons(var11, (SubLObject)$ic120$), reader.bq_cons(var12, (SubLObject)$ic101$), reader.bq_cons(var13, (SubLObject)$ic121$), var14, var15, var16 }), (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic122$, (SubLObject)ConsesLow.list((SubLObject)$ic104$, var8, (SubLObject)$ic123$, var9)), (SubLObject)ConsesLow.list((SubLObject)$ic124$, (SubLObject)ConsesLow.list((SubLObject)$ic104$, var8, (SubLObject)$ic123$, var10)), (SubLObject)ConsesLow.list((SubLObject)$ic125$, (SubLObject)ConsesLow.list((SubLObject)$ic104$, var8, (SubLObject)$ic123$, var11)), (SubLObject)ConsesLow.list((SubLObject)$ic106$, (SubLObject)ConsesLow.list((SubLObject)$ic104$, var8, (SubLObject)T, var12)), (SubLObject)ConsesLow.list((SubLObject)$ic126$, (SubLObject)ConsesLow.list((SubLObject)$ic104$, var8, (SubLObject)T, var13))), ConsesLow.append(var7, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)$ic10$, var14, (SubLObject)$ic118$), (SubLObject)ConsesLow.listS((SubLObject)$ic10$, var15, (SubLObject)$ic119$), (SubLObject)ConsesLow.listS((SubLObject)$ic10$, var16, (SubLObject)$ic120$)))), (SubLObject)ConsesLow.list((SubLObject)$ic20$, var9, (SubLObject)ConsesLow.list((SubLObject)$ic10$, (SubLObject)$ic122$, (SubLObject)ConsesLow.list((SubLObject)$ic104$, var8, (SubLObject)ConsesLow.list((SubLObject)$ic127$, var9, var14), var14))), (SubLObject)ConsesLow.list((SubLObject)$ic20$, var10, (SubLObject)ConsesLow.list((SubLObject)$ic10$, (SubLObject)$ic124$, (SubLObject)ConsesLow.list((SubLObject)$ic104$, var8, (SubLObject)ConsesLow.list((SubLObject)$ic127$, var10, var15), var15))), (SubLObject)ConsesLow.list((SubLObject)$ic20$, var11, (SubLObject)ConsesLow.list((SubLObject)$ic10$, (SubLObject)$ic125$, (SubLObject)ConsesLow.list((SubLObject)$ic104$, var8, (SubLObject)ConsesLow.list((SubLObject)$ic127$, var11, var16), var16))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic89$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22767(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic128$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic128$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic128$);
        var7 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var8;
            var4 = (var8 = var5);
            final SubLObject var9 = (SubLObject)$ic129$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var9, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic130$, (SubLObject)ConsesLow.list((SubLObject)$ic131$, var9), (SubLObject)ConsesLow.listS((SubLObject)$ic57$, (SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic132$, var9)), ConsesLow.append(var8, (SubLObject)NIL)), (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, var9)), ConsesLow.append(var8, (SubLObject)NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic128$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22768(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic133$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic133$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic133$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var198_199 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic133$);
            var198_199 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic133$);
            if (NIL == conses_high.member(var198_199, (SubLObject)$ic134$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var198_199 == $ic14$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic133$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic135$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic136$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15;
        var4 = (var15 = var5);
        final SubLObject var16 = (SubLObject)$ic137$;
        final SubLObject var17 = (SubLObject)$ic138$;
        final SubLObject var18 = (SubLObject)$ic139$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list(reader.bq_cons(var16, (SubLObject)$ic140$), reader.bq_cons(var17, (SubLObject)$ic31$)), (SubLObject)ConsesLow.list((SubLObject)$ic141$, (SubLObject)ConsesLow.listS(var18, var7, (SubLObject)$ic142$), (SubLObject)ConsesLow.list((SubLObject)$ic143$, (SubLObject)$ic144$, (SubLObject)ConsesLow.list((SubLObject)$ic145$, var16, (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic146$, var18))), (SubLObject)ConsesLow.list((SubLObject)$ic147$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)EQ, (SubLObject)$ic148$, var6), (SubLObject)ConsesLow.listS((SubLObject)$ic10$, var16, (SubLObject)$ic149$)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic150$, var6), (SubLObject)ConsesLow.list((SubLObject)$ic151$, (SubLObject)$ic152$, var6)), (SubLObject)ConsesLow.list((SubLObject)T, (SubLObject)((NIL != var12) ? ConsesLow.listS((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var12, var17)), ConsesLow.append(var15, (SubLObject)NIL)) : reader.bq_cons((SubLObject)$ic4$, ConsesLow.append(var15, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)$ic32$, var17)))), (SubLObject)ConsesLow.list((SubLObject)$ic20$, var14, (SubLObject)ConsesLow.list((SubLObject)$ic10$, var16, var14))))));
    }
    
    public static SubLObject f22769(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic153$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic153$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic153$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic153$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var215_216 = (SubLObject)NIL;
        while (NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic153$);
            var215_216 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic153$);
            if (NIL == conses_high.member(var215_216, (SubLObject)$ic154$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var11 = (SubLObject)T;
            }
            if (var215_216 == $ic14$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (NIL != var11 && NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic153$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic136$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)$ic155$, (SubLObject)ConsesLow.list(var7, var8, (SubLObject)$ic16$, var13), (SubLObject)ConsesLow.list((SubLObject)$ic20$, (SubLObject)ConsesLow.list((SubLObject)$ic156$, var7), (SubLObject)ConsesLow.listS((SubLObject)$ic157$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)$ic136$, var13), ConsesLow.append(var14, (SubLObject)NIL))));
    }
    
    public static SubLObject f22770(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic158$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic158$);
        var6 = var4.first();
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic158$);
        var4 = var4.rest();
        final SubLObject var8 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic158$);
        var4 = var4.rest();
        final SubLObject var9 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic158$);
        var4 = var4.rest();
        final SubLObject var10 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic158$);
        var4 = var4.rest();
        final SubLObject var11 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic158$);
        var4 = var4.rest();
        final SubLObject var12 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic158$);
        var4 = var4.rest();
        final SubLObject var13 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic158$);
        var4 = var4.rest();
        final SubLObject var14 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic158$);
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic20$, (SubLObject)ConsesLow.list((SubLObject)$ic159$, (SubLObject)$ic160$, var5), (SubLObject)ConsesLow.list(new SubLObject[] { $ic161$, T, var6, var7, var8, var9, var10, var11, var12, var13, var14 }));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic158$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22771() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0339", "f22738", "S#25366");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0339", "f22739", "S#25367");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0339", "f22740", "S#25368");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0339", "f22741", "S#25369");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0339", "f22742", "S#25370");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0339", "f22743", "S#25371", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0339", "f22744", "S#25372");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0339", "f22745", "S#25373");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0339", "f22746", "S#25374");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0339", "f22747", "S#25375");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0339", "f22748", "S#25376");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0339", "f22749", "S#25377");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0339", "f22750", "S#25378");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0339", "f22751", "S#25379");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0339", "f22752", "S#25380");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0339", "f22753", "S#25381");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0339", "f22754", "S#25382");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0339", "f22755", "S#25383");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0339", "f22756", "S#25384");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0339", "f22757", "CURRENT-CONTROLLING-INFERENCE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0339", "f22758", "S#25385", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0339", "f22759", "S#25386");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0339", "f22760", "S#25387");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0339", "f22761", "S#25388", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0339", "f22762", "S#25389");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0339", "f22763", "S#25390");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0339", "f22764", "S#25391");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0339", "f22765", "S#25392");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0339", "f22766", "S#25393");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0339", "f22767", "S#25394");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0339", "f22768", "S#25395");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0339", "f22769", "S#25396");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0339", "f22770", "S#25397");
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22772() {
        $g2901$ = SubLFiles.defparameter("S#25398", (SubLObject)NIL);
        $g2902$ = SubLFiles.defparameter("S#25399", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22773() {
        module0002.f50((SubLObject)$ic28$, (SubLObject)$ic29$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f22771();
    }
    
    public void initializeVariables() {
        f22772();
    }
    
    public void runTopLevelForms() {
        f22773();
    }
    
    static {
        me = (SubLFile)new module0339();
        $g2901$ = null;
        $g2902$ = null;
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#25400", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic1$ = makeSymbol("SYMBOLP");
        $ic2$ = makeSymbol("CLET");
        $ic3$ = makeSymbol("CUNWIND-PROTECT");
        $ic4$ = makeSymbol("PROGN");
        $ic5$ = makeSymbol("S#25401", "CYC");
        $ic6$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#25402", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic7$ = makeSymbol("DESTROY-PROBLEM-STORE");
        $ic8$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#25402", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#5852", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic9$ = makeSymbol("S#25367", "CYC");
        $ic10$ = makeSymbol("CSETQ");
        $ic11$ = makeSymbol("NEW-PROBLEM-STORE");
        $ic12$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#15376", "CYC"), (SubLObject)makeSymbol("S#24274", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("TYPE"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic13$ = ConsesLow.list((SubLObject)makeKeyword("TYPE"), (SubLObject)makeKeyword("DONE"));
        $ic14$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic15$ = makeKeyword("TYPE");
        $ic16$ = makeKeyword("DONE");
        $ic17$ = makeSymbol("S#2964", "CYC");
        $ic18$ = makeSymbol("S#25403", "CYC");
        $ic19$ = makeSymbol("S#25369", "CYC");
        $ic20$ = makeSymbol("PWHEN");
        $ic21$ = makeSymbol("S#25404", "CYC");
        $ic22$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#25405", "CYC"), (SubLObject)makeSymbol("S#24487", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#25406", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic23$ = ConsesLow.list((SubLObject)makeKeyword("OPEN?"), (SubLObject)makeKeyword("DONE"));
        $ic24$ = makeKeyword("OPEN?");
        $ic25$ = makeUninternedSymbol("US#513E608");
        $ic26$ = makeSymbol("DO-LIST");
        $ic27$ = makeSymbol("S#25407", "CYC");
        $ic28$ = makeSymbol("S#25371", "CYC");
        $ic29$ = makeSymbol("S#25370", "CYC");
        $ic30$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#25405", "CYC"), (SubLObject)makeSymbol("S#15216", "CYC"), (SubLObject)makeSymbol("S#24487", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#25406", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic31$ = ConsesLow.list((SubLObject)ZERO_INTEGER);
        $ic32$ = makeSymbol("CINC");
        $ic33$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#25408", "CYC"), (SubLObject)makeSymbol("S#25409", "CYC"), (SubLObject)makeSymbol("S#24487", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#25406", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic34$ = makeUninternedSymbol("US#73DCC81");
        $ic35$ = makeSymbol("MAPPED-PROBLEM-PROBLEM");
        $ic36$ = makeSymbol("MAPPED-PROBLEM-VARIABLE-MAP");
        $ic37$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#25410", "CYC"), (SubLObject)makeSymbol("S#24487", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic38$ = ConsesLow.list((SubLObject)makeKeyword("DONE"));
        $ic39$ = makeUninternedSymbol("US#53B99AB");
        $ic40$ = makeUninternedSymbol("US#513E608");
        $ic41$ = makeSymbol("PROBLEM-LINK-SUPPORTED-PROBLEM");
        $ic42$ = makeSymbol("PUNLESS");
        $ic43$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#25411", "CYC"), (SubLObject)makeSymbol("S#24487", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#25412", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic44$ = ConsesLow.list((SubLObject)makeKeyword("LINK-TYPE"), (SubLObject)makeKeyword("DONE"));
        $ic45$ = makeKeyword("LINK-TYPE");
        $ic46$ = makeUninternedSymbol("US#53B99AB");
        $ic47$ = makeSymbol("S#25413", "CYC");
        $ic48$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#25414", "CYC"), (SubLObject)makeSymbol("S#24487", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#25406", "CYC"), (SubLObject)makeSymbol("S#25412", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic49$ = ConsesLow.list((SubLObject)makeKeyword("OPEN?"), (SubLObject)makeKeyword("LINK-TYPE"), (SubLObject)makeKeyword("DONE"));
        $ic50$ = makeUninternedSymbol("US#7117396");
        $ic51$ = makeUninternedSymbol("US#4152478");
        $ic52$ = makeSymbol("S#25373", "CYC");
        $ic53$ = makeSymbol("IGNORE");
        $ic54$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#25415", "CYC"), (SubLObject)makeSymbol("S#24487", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#25416", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic55$ = ConsesLow.list((SubLObject)makeKeyword("PROOF-STATUS"));
        $ic56$ = makeKeyword("PROOF-STATUS");
        $ic57$ = makeSymbol("CDOLIST");
        $ic58$ = makeSymbol("S#25417", "CYC");
        $ic59$ = makeSymbol("S#25418", "CYC");
        $ic60$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#25419", "CYC"), (SubLObject)makeSymbol("S#25420", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic61$ = makeUninternedSymbol("US#2E8F2F0");
        $ic62$ = makeUninternedSymbol("US#7D22A29");
        $ic63$ = makeKeyword("RESIDUAL-TRANSFORMATION");
        $ic64$ = makeSymbol("S#25421", "CYC");
        $ic65$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#25419", "CYC"), (SubLObject)makeSymbol("S#25422", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic66$ = makeUninternedSymbol("US#1850D87");
        $ic67$ = makeUninternedSymbol("US#2E8F2F0");
        $ic68$ = makeSymbol("S#25375", "CYC");
        $ic69$ = makeKeyword("JOIN-ORDERED");
        $ic70$ = makeSymbol("S#25378", "CYC");
        $ic71$ = makeSymbol("S#25423", "CYC");
        $ic72$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#619", "CYC"), (SubLObject)NIL));
        $ic73$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#692", "CYC")));
        $ic74$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#25424", "CYC"), (SubLObject)T));
        $ic75$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10709", "CYC"), (SubLObject)makeKeyword("ALL")));
        $ic76$ = makeSymbol("S#25384", "CYC");
        $ic77$ = ConsesLow.list((SubLObject)makeSymbol("S#25425", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic78$ = makeSymbol("S#10709", "CYC");
        $ic79$ = makeSymbol("INFERENCE-P");
        $ic80$ = ConsesLow.list((SubLObject)makeSymbol("S#25426", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic81$ = makeSymbol("S#25398", "CYC");
        $ic82$ = makeSymbol("CONS");
        $ic83$ = ConsesLow.list((SubLObject)makeSymbol("S#25398", "CYC"));
        $ic84$ = makeSymbol("S#25386", "CYC");
        $ic85$ = makeSymbol("S#25390", "CYC");
        $ic86$ = ConsesLow.list((SubLObject)makeSymbol("S#8816", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic87$ = makeSymbol("S#25399", "CYC");
        $ic88$ = makeSymbol("S#25389", "CYC");
        $ic89$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#25426", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic90$ = makeKeyword("CYC-MAINT");
        $ic91$ = makeUninternedSymbol("US#13F0458");
        $ic92$ = makeUninternedSymbol("US#5D151DF");
        $ic93$ = makeUninternedSymbol("US#2984777");
        $ic94$ = makeUninternedSymbol("US#5E702D8");
        $ic95$ = makeUninternedSymbol("US#31E74BB");
        $ic96$ = makeUninternedSymbol("US#3156B48");
        $ic97$ = makeUninternedSymbol("US#192160B");
        $ic98$ = makeSymbol("S#25427", "CYC");
        $ic99$ = ConsesLow.list((SubLObject)makeSymbol("S#13144", "CYC"));
        $ic100$ = ConsesLow.list((SubLObject)makeSymbol("S#13143", "CYC"));
        $ic101$ = ConsesLow.list((SubLObject)makeSymbol("S#13134", "CYC"));
        $ic102$ = ConsesLow.list((SubLObject)makeSymbol("S#13135", "CYC"));
        $ic103$ = makeSymbol("S#13144", "CYC");
        $ic104$ = makeSymbol("FIF");
        $ic105$ = makeSymbol("S#13143", "CYC");
        $ic106$ = makeSymbol("S#13134", "CYC");
        $ic107$ = makeSymbol("S#13135", "CYC");
        $ic108$ = makeSymbol("+");
        $ic109$ = makeUninternedSymbol("US#13F0458");
        $ic110$ = makeUninternedSymbol("US#5810831");
        $ic111$ = makeUninternedSymbol("US#25C35B7");
        $ic112$ = makeUninternedSymbol("US#671380C");
        $ic113$ = makeUninternedSymbol("US#5E702D8");
        $ic114$ = makeUninternedSymbol("US#608F927");
        $ic115$ = makeUninternedSymbol("US#4C46A71");
        $ic116$ = makeUninternedSymbol("US#2EDF541");
        $ic117$ = makeUninternedSymbol("US#52FA584");
        $ic118$ = ConsesLow.list((SubLObject)makeSymbol("S#13136", "CYC"));
        $ic119$ = ConsesLow.list((SubLObject)makeSymbol("S#13137", "CYC"));
        $ic120$ = ConsesLow.list((SubLObject)makeSymbol("S#13138", "CYC"));
        $ic121$ = ConsesLow.list((SubLObject)makeSymbol("S#13133", "CYC"));
        $ic122$ = makeSymbol("S#13136", "CYC");
        $ic123$ = ConsesLow.list((SubLObject)makeSymbol("NEW-SET"));
        $ic124$ = makeSymbol("S#13137", "CYC");
        $ic125$ = makeSymbol("S#13138", "CYC");
        $ic126$ = makeSymbol("S#13133", "CYC");
        $ic127$ = makeSymbol("S#6989", "CYC");
        $ic128$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#25428", "CYC"), (SubLObject)makeSymbol("S#32", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic129$ = makeUninternedSymbol("US#7724FE");
        $ic130$ = makeSymbol("PIF");
        $ic131$ = makeSymbol("S#25429", "CYC");
        $ic132$ = makeSymbol("REST");
        $ic133$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#25430", "CYC"), (SubLObject)makeSymbol("S#885", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#146", "CYC"), (SubLObject)makeSymbol("S#15403", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic134$ = ConsesLow.list((SubLObject)makeKeyword("ELEMENT-NUM"), (SubLObject)makeKeyword("DONE?"));
        $ic135$ = makeKeyword("ELEMENT-NUM");
        $ic136$ = makeKeyword("DONE?");
        $ic137$ = makeUninternedSymbol("US#50BA6FE");
        $ic138$ = makeUninternedSymbol("US#24883");
        $ic139$ = makeUninternedSymbol("US#6DA340E");
        $ic140$ = ConsesLow.list((SubLObject)NIL);
        $ic141$ = makeSymbol("WITH-PRIVATE-BINARY-FILE");
        $ic142$ = ConsesLow.list((SubLObject)makeKeyword("INPUT"));
        $ic143$ = makeSymbol("S#2152", "CYC");
        $ic144$ = ConsesLow.list((SubLObject)makeSymbol("S#25431", "CYC"));
        $ic145$ = makeSymbol("UNTIL");
        $ic146$ = makeSymbol("S#25432", "CYC");
        $ic147$ = makeSymbol("PCOND");
        $ic148$ = makeKeyword("EOF");
        $ic149$ = ConsesLow.list((SubLObject)T);
        $ic150$ = makeSymbol("STRINGP");
        $ic151$ = makeSymbol("WARN");
        $ic152$ = makeString("Read invalid query info ~s");
        $ic153$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#25430", "CYC"), (SubLObject)makeSymbol("S#25433", "CYC"), (SubLObject)makeSymbol("DIRECTORY"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#15403", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic154$ = ConsesLow.list((SubLObject)makeKeyword("DONE?"));
        $ic155$ = makeSymbol("S#6816", "CYC");
        $ic156$ = makeSymbol("S#25434", "CYC");
        $ic157$ = makeSymbol("S#25395", "CYC");
        $ic158$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#25435", "CYC"), makeSymbol("S#1502", "CYC"), makeSymbol("&OPTIONAL"), makeSymbol("S#750", "CYC"), makeSymbol("S#751", "CYC"), makeSymbol("S#6053", "CYC"), makeSymbol("S#6054", "CYC"), makeSymbol("S#25436", "CYC"), makeSymbol("S#25437", "CYC"), makeSymbol("S#25438", "CYC"), makeSymbol("S#25439", "CYC") });
        $ic159$ = makeSymbol(">=");
        $ic160$ = makeSymbol("S#1861", "CYC");
        $ic161$ = makeSymbol("S#197", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 313 ms
	
	Decompiled with Procyon 0.5.32.
*/