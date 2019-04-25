package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0211 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0211";
    public static final String myFingerPrint = "7512278482312bbdd288c1cb07ce5b5e2ebf571a0dfc9c14cbcf8d9f081612c9";
    private static SubLSymbol $g2331$;
    private static SubLSymbol $g2332$;
    private static SubLSymbol $g2333$;
    private static SubLSymbol $g2334$;
    private static SubLSymbol $g2335$;
    private static SubLSymbol $g2336$;
    private static SubLSymbol $g2337$;
    private static SubLSymbol $g2338$;
    private static SubLSymbol $g2339$;
    private static SubLSymbol $g2340$;
    private static SubLSymbol $g2341$;
    private static SubLSymbol $g2342$;
    private static final SubLList $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLString $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLList $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLString $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLList $ic28$;
    private static final SubLList $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLObject $ic37$;
    private static final SubLObject $ic38$;
    private static final SubLObject $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLObject $ic42$;
    private static final SubLObject $ic43$;
    private static final SubLObject $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLObject $ic46$;
    private static final SubLInteger $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLInteger $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLObject $ic57$;
    private static final SubLObject $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLString $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLString $ic64$;
    private static final SubLString $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLList $ic67$;
    private static final SubLString $ic68$;
    private static final SubLList $ic69$;
    private static final SubLList $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLString $ic83$;
    private static final SubLString $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLList $ic93$;
    private static final SubLObject $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLString $ic97$;
    private static final SubLString $ic98$;
    private static final SubLString $ic99$;
    private static final SubLObject $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLString $ic102$;
    private static final SubLString $ic103$;
    private static final SubLString $ic104$;
    private static final SubLString $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLString $ic108$;
    private static final SubLSymbol $ic109$;
    
    public static SubLObject f13628(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0211.$ic0$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0211.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0211.$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)module0211.NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)module0211.NIL;
        SubLObject var10_11 = (SubLObject)module0211.NIL;
        while (module0211.NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0211.$ic0$);
            var10_11 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0211.$ic0$);
            if (module0211.NIL == conses_high.member(var10_11, (SubLObject)module0211.$ic1$, (SubLObject)module0211.UNPROVIDED, (SubLObject)module0211.UNPROVIDED)) {
                var9 = (SubLObject)module0211.T;
            }
            if (var10_11 == module0211.$ic2$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (module0211.NIL != var9 && module0211.NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0211.$ic0$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)module0211.$ic3$, var4);
        final SubLObject var11 = (SubLObject)((module0211.NIL != var10) ? conses_high.cadr(var10) : module0211.$ic4$);
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0211.$ic5$, var4);
        final SubLObject var13 = (SubLObject)((module0211.NIL != var12) ? conses_high.cadr(var12) : module0211.NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        if (module0211.NIL == var11) {
            return (SubLObject)ConsesLow.listS((SubLObject)module0211.$ic6$, (SubLObject)ConsesLow.list(var6, (SubLObject)module0211.$ic7$, (SubLObject)module0211.$ic5$, var13), ConsesLow.append(var14, (SubLObject)module0211.NIL));
        }
        final SubLObject var15 = (SubLObject)module0211.$ic8$;
        final SubLObject var16 = (SubLObject)module0211.$ic9$;
        final SubLObject var17 = (SubLObject)module0211.$ic10$;
        return (SubLObject)ConsesLow.list((SubLObject)module0211.$ic11$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var15, var11), reader.bq_cons(var16, (SubLObject)module0211.$ic12$), reader.bq_cons(var17, (SubLObject)module0211.$ic13$)), (SubLObject)ConsesLow.list((SubLObject)module0211.$ic14$, var15, (SubLObject)ConsesLow.listS((SubLObject)module0211.$ic15$, (SubLObject)ConsesLow.list(var6, (SubLObject)module0211.$ic3$, (SubLObject)module0211.NIL, (SubLObject)module0211.$ic5$, var13), (SubLObject)ConsesLow.list((SubLObject)module0211.$ic16$, var17), (SubLObject)ConsesLow.list((SubLObject)module0211.$ic17$, var17, var16), ConsesLow.append(var14, (SubLObject)module0211.NIL))));
    }
    
    public static SubLObject f13629(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0211.$ic18$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0211.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0211.$ic18$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)module0211.NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)module0211.NIL;
        SubLObject var27_28 = (SubLObject)module0211.NIL;
        while (module0211.NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0211.$ic18$);
            var27_28 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0211.$ic18$);
            if (module0211.NIL == conses_high.member(var27_28, (SubLObject)module0211.$ic1$, (SubLObject)module0211.UNPROVIDED, (SubLObject)module0211.UNPROVIDED)) {
                var9 = (SubLObject)module0211.T;
            }
            if (var27_28 == module0211.$ic2$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (module0211.NIL != var9 && module0211.NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0211.$ic18$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)module0211.$ic3$, var4);
        final SubLObject var11 = (SubLObject)((module0211.NIL != var10) ? conses_high.cadr(var10) : module0211.$ic19$);
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0211.$ic5$, var4);
        final SubLObject var13 = (SubLObject)((module0211.NIL != var12) ? conses_high.cadr(var12) : module0211.NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)module0211.$ic20$, (SubLObject)ConsesLow.list(var6, var11, (SubLObject)module0211.$ic5$, var13), (SubLObject)ConsesLow.listS((SubLObject)module0211.$ic21$, (SubLObject)ConsesLow.list((SubLObject)module0211.$ic22$, var6), ConsesLow.append(var14, (SubLObject)module0211.NIL)));
    }
    
    public static SubLObject f13630(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0211.$ic23$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0211.NIL;
        SubLObject var7 = (SubLObject)module0211.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0211.$ic23$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0211.$ic23$);
        var7 = var4.first();
        var4 = var4.rest();
        if (module0211.NIL == var4) {
            final SubLObject var8;
            var4 = (var8 = var5);
            final SubLObject var9 = (SubLObject)module0211.$ic24$;
            return (SubLObject)ConsesLow.list((SubLObject)module0211.$ic25$, (SubLObject)ConsesLow.list(var9, var7), (SubLObject)ConsesLow.list((SubLObject)module0211.$ic11$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)module0211.$ic26$, var9))), (SubLObject)ConsesLow.listS((SubLObject)module0211.$ic21$, (SubLObject)ConsesLow.list((SubLObject)module0211.$ic27$, var6), ConsesLow.append(var8, (SubLObject)module0211.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0211.$ic23$);
        return (SubLObject)module0211.NIL;
    }
    
    public static SubLObject f13631(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0211.$ic28$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0211.NIL;
        SubLObject var7 = (SubLObject)module0211.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0211.$ic28$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0211.$ic28$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)module0211.NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)module0211.NIL;
        SubLObject var44_45 = (SubLObject)module0211.NIL;
        while (module0211.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0211.$ic28$);
            var44_45 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0211.$ic28$);
            if (module0211.NIL == conses_high.member(var44_45, (SubLObject)module0211.$ic29$, (SubLObject)module0211.UNPROVIDED, (SubLObject)module0211.UNPROVIDED)) {
                var10 = (SubLObject)module0211.T;
            }
            if (var44_45 == module0211.$ic2$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0211.NIL != var10 && module0211.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0211.$ic28$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0211.$ic5$, var4);
        final SubLObject var12 = (SubLObject)((module0211.NIL != var11) ? conses_high.cadr(var11) : module0211.NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        final SubLObject var14 = (SubLObject)module0211.$ic30$;
        return (SubLObject)ConsesLow.list((SubLObject)module0211.$ic31$, (SubLObject)ConsesLow.list(var14, var7, (SubLObject)module0211.$ic5$, var12), (SubLObject)ConsesLow.list((SubLObject)module0211.$ic21$, (SubLObject)ConsesLow.list((SubLObject)module0211.$ic32$, var14), (SubLObject)ConsesLow.list((SubLObject)module0211.$ic33$, (SubLObject)ConsesLow.list(var6, var14, (SubLObject)module0211.$ic5$, var12), (SubLObject)ConsesLow.listS((SubLObject)module0211.$ic21$, (SubLObject)ConsesLow.list((SubLObject)module0211.$ic27$, var6), ConsesLow.append(var13, (SubLObject)module0211.NIL)))));
    }
    
    public static SubLObject f13632(final SubLObject var48) {
        if (module0211.NIL != module0035.f2015(var48)) {
            SubLObject var49 = var48;
            SubLObject var50 = (SubLObject)module0211.NIL;
            var50 = var49.first();
            while (module0211.NIL != var49) {
                if (module0211.NIL == assertion_handles_oc.f11035(var50)) {
                    return (SubLObject)module0211.NIL;
                }
                var49 = var49.rest();
                var50 = var49.first();
            }
            return (SubLObject)module0211.T;
        }
        return (SubLObject)module0211.NIL;
    }
    
    public static SubLObject f13633(final SubLObject var48) {
        if (module0211.NIL != module0035.f2015(var48)) {
            SubLObject var49 = var48;
            SubLObject var50 = (SubLObject)module0211.NIL;
            var50 = var49.first();
            while (module0211.NIL != var49) {
                if (module0211.NIL == module0178.f11290(var50)) {
                    return (SubLObject)module0211.NIL;
                }
                var49 = var49.rest();
                var50 = var49.first();
            }
            return (SubLObject)module0211.T;
        }
        return (SubLObject)module0211.NIL;
    }
    
    public static SubLObject f13634(final SubLObject var35) {
        if (module0211.NIL != module0178.f11382(var35)) {
            SubLObject var36 = module0032.f1726(module0178.f11381(var35), Symbols.symbol_function((SubLObject)module0211.EQL));
            final SubLObject var37 = module0178.f11300(var35);
            SubLObject var38;
            SubLObject var39;
            SubLObject var40;
            SubLObject var41;
            for (var38 = module0032.f1741(var37), var39 = (SubLObject)module0211.NIL, var39 = module0032.f1742(var38, var37); module0211.NIL == module0032.f1744(var38, var39); var39 = module0032.f1743(var39)) {
                var40 = module0032.f1745(var38, var39);
                if (module0211.NIL != module0032.f1746(var39, var40)) {
                    var41 = module0188.f11781(var40);
                    if (module0211.NIL != assertion_handles_oc.f11035(var41)) {
                        var36 = module0032.f1736(var41, var36, Symbols.symbol_function((SubLObject)module0211.EQL));
                    }
                }
            }
            return module0032.f1753(var36);
        }
        return (SubLObject)module0211.NIL;
    }
    
    public static SubLObject f13635(final SubLObject var35) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0211.NIL != assertion_handles_oc.f11035(var35) && module0211.NIL != module0178.f11342(var35, (SubLObject)module0211.$ic34$));
    }
    
    public static SubLObject f13636(final SubLObject var35) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0211.NIL != assertion_handles_oc.f11035(var35) && module0211.NIL != module0178.f11342(var35, (SubLObject)module0211.$ic35$));
    }
    
    public static SubLObject f13637(final SubLObject var35) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0211.NIL != assertion_handles_oc.f11035(var35) && module0211.NIL != module0178.f11342(var35, (SubLObject)module0211.$ic36$));
    }
    
    public static SubLObject f13638(final SubLObject var48) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0211.NIL != module0178.f11284(var48) && module0211.NIL != f13635(var48));
    }
    
    public static SubLObject f13639(final SubLObject var48) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0211.NIL != module0178.f11284(var48) && module0211.NIL != f13636(var48));
    }
    
    public static SubLObject f13640(final SubLObject var35) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0211.NIL != assertion_handles_oc.f11035(var35) && module0211.NIL != module0259.f16891(module0205.f13136(module0178.f11303(var35)), module0211.$ic37$));
    }
    
    public static SubLObject f13641(final SubLObject var35, final SubLObject var56) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0211.NIL == var56 || module0211.NIL != module0178.f11320(var35, var56));
    }
    
    public static SubLObject f13642(final SubLObject var35, final SubLObject var57) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0211.NIL == var57 || module0211.NIL != module0178.f11343(var35, var57));
    }
    
    public static SubLObject f13643(final SubLObject var35, final SubLObject var58) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0211.NIL == var58 || module0211.NIL != module0178.f11340(var35, var58));
    }
    
    public static SubLObject f13644(final SubLObject var35, final SubLObject var57, final SubLObject var58) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0211.NIL != f13642(var35, var57) && module0211.NIL != f13643(var35, var58));
    }
    
    public static SubLObject f13645(final SubLObject var35, final SubLObject var56, final SubLObject var57, final SubLObject var58) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0211.NIL != f13641(var35, var56) && module0211.NIL != f13642(var35, var57) && module0211.NIL != f13643(var35, var58));
    }
    
    public static SubLObject f13646(final SubLObject var35, final SubLObject var59, final SubLObject var60) {
        final SubLObject var61 = module0178.f11331(var35, var60);
        return Equality.equal(var59, var61);
    }
    
    public static SubLObject f13647(final SubLObject var35, final SubLObject var59) {
        return module0202.f12723(var59, module0178.f11285(var35));
    }
    
    public static SubLObject f13648(final SubLObject var35, final SubLObject var62) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0211.NIL != f13635(var35) && var62.eql(module0178.f11332(var35)));
    }
    
    public static SubLObject f13649(final SubLObject var35, final SubLObject var62) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0211.NIL != module0178.f11284(var35) && var62.eql(module0178.f11332(var35)));
    }
    
    public static SubLObject f13650(final SubLObject var63, final SubLObject var62) {
        return Equality.eql(var62, module0178.f11332(var63));
    }
    
    public static SubLObject f13651(final SubLObject var35, final SubLObject var64) {
        if (module0211.NIL != module0178.f11284(var35)) {
            return module0004.f104(module0178.f11332(var35), var64, (SubLObject)module0211.UNPROVIDED, (SubLObject)module0211.UNPROVIDED);
        }
        return (SubLObject)module0211.NIL;
    }
    
    public static SubLObject f13652(final SubLObject var35) {
        return f13649(var35, module0211.$ic38$);
    }
    
    public static SubLObject f13653(final SubLObject var35) {
        return f13649(var35, module0211.$ic39$);
    }
    
    public static SubLObject f13654(final SubLObject var35) {
        return module0205.f13266(module0178.f11282(var35), module0178.f11348(var35));
    }
    
    public static SubLObject f13655(final SubLObject var48) {
        if (module0211.NIL != module0178.f11290(var48)) {
            SubLObject var49 = module0232.f15308(module0178.f11282(var48));
            SubLObject var50 = (SubLObject)module0211.NIL;
            var50 = var49.first();
            while (module0211.NIL != var49) {
                if (module0211.NIL != module0202.f12649(var50)) {
                    return (SubLObject)module0211.T;
                }
                var49 = var49.rest();
                var50 = var49.first();
            }
        }
        return (SubLObject)module0211.NIL;
    }
    
    public static SubLObject f13656(final SubLObject var48) {
        if (module0211.NIL != module0178.f11284(var48) && module0211.NIL != module0202.f12649(module0178.f11285(var48))) {
            return (SubLObject)module0211.T;
        }
        return (SubLObject)module0211.NIL;
    }
    
    public static SubLObject f13657(final SubLObject var48) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0211.NIL != f13655(var48) || module0211.NIL != f13656(var48));
    }
    
    public static SubLObject f13658(final SubLObject var35) {
        assert module0211.NIL != f13657(var35) : var35;
        if (module0211.NIL != f13656(var35)) {
            return module0204.f13047(module0178.f11282(var35));
        }
        SubLObject var36 = module0232.f15308(module0178.f11282(var35));
        SubLObject var37 = (SubLObject)module0211.NIL;
        var37 = var36.first();
        while (module0211.NIL != var36) {
            if (module0211.NIL != module0202.f12649(var37)) {
                return var37;
            }
            var36 = var36.rest();
            var37 = var36.first();
        }
        return (SubLObject)module0211.NIL;
    }
    
    public static SubLObject f13659(final SubLObject var35) {
        final SubLThread var36 = SubLProcess.currentSubLThread();
        SubLObject var37 = (SubLObject)module0211.NIL;
        final SubLObject var38 = module0147.$g2094$.currentBinding(var36);
        final SubLObject var39 = module0147.$g2095$.currentBinding(var36);
        try {
            module0147.$g2094$.bind((SubLObject)module0211.$ic41$, var36);
            module0147.$g2095$.bind(module0211.$ic42$, var36);
            var37 = f13660(var35);
        }
        finally {
            module0147.$g2095$.rebind(var39, var36);
            module0147.$g2094$.rebind(var38, var36);
        }
        return var37;
    }
    
    public static SubLObject f13660(final SubLObject var35) {
        return f13661(var35, (SubLObject)module0211.UNPROVIDED);
    }
    
    public static SubLObject f13661(final SubLObject var35, SubLObject var70) {
        if (var70 == module0211.UNPROVIDED) {
            var70 = (SubLObject)module0211.NIL;
        }
        assert module0211.NIL != assertion_handles_oc.f11035(var35) : var35;
        if (module0211.NIL == assertion_handles_oc.f11041(var35, (SubLObject)module0211.UNPROVIDED)) {
            return (SubLObject)module0211.NIL;
        }
        if (module0211.NIL != module0004.f104(var35, var70, (SubLObject)module0211.UNPROVIDED, (SubLObject)module0211.UNPROVIDED)) {
            return (SubLObject)module0211.NIL;
        }
        var70 = (SubLObject)ConsesLow.cons(var35, var70);
        SubLObject var71 = (SubLObject)module0211.NIL;
        final SubLObject var72 = module0178.f11287(var35);
        if (module0211.NIL != module0173.f10955(var72) && module0211.NIL != module0222.f14635(module0211.$ic43$, var72, (SubLObject)module0211.ONE_INTEGER, (SubLObject)module0211.UNPROVIDED)) {
            final SubLObject var73 = module0220.f14558(var72, module0211.$ic43$, (SubLObject)module0211.ONE_INTEGER, (SubLObject)module0211.UNPROVIDED);
            if (module0211.NIL == var71) {
                SubLObject var74 = var73;
                SubLObject var75 = (SubLObject)module0211.NIL;
                var75 = var74.first();
                while (module0211.NIL == var71 && module0211.NIL != var74) {
                    if (module0211.NIL == f13661(var75, var70)) {
                        var71 = (SubLObject)module0211.T;
                    }
                    var74 = var74.rest();
                    var75 = var74.first();
                }
            }
        }
        if (module0211.NIL == var71 && module0211.NIL != module0222.f14635(module0211.$ic44$, var35, (SubLObject)module0211.ONE_INTEGER, (SubLObject)module0211.UNPROVIDED)) {
            final SubLObject var73 = module0220.f14558(var35, module0211.$ic44$, (SubLObject)module0211.ONE_INTEGER, (SubLObject)module0211.UNPROVIDED);
            if (module0211.NIL == var71) {
                SubLObject var74 = var73;
                SubLObject var75 = (SubLObject)module0211.NIL;
                var75 = var74.first();
                while (module0211.NIL == var71 && module0211.NIL != var74) {
                    if (module0211.NIL == f13661(var75, var70)) {
                        var71 = (SubLObject)module0211.T;
                    }
                    var74 = var74.rest();
                    var75 = var74.first();
                }
            }
        }
        if (module0211.NIL == var71) {
            SubLObject var76;
            SubLObject var77;
            SubLObject var78;
            SubLObject var79;
            SubLObject var77_79;
            SubLObject var80;
            for (var76 = (SubLObject)module0211.NIL, var77 = (SubLObject)module0211.NIL, var77 = module0178.f11299(var35); module0211.NIL == var76 && module0211.NIL != var77; var77 = var77.rest()) {
                var78 = var77.first();
                if (module0211.NIL != module0191.f11932(var78)) {
                    var76 = (SubLObject)module0211.T;
                }
                else {
                    for (var79 = (SubLObject)module0211.NIL, var77_79 = (SubLObject)module0211.NIL, var77_79 = module0188.f11770(var78); module0211.NIL == var79 && module0211.NIL != var77_79; var77_79 = var77_79.rest()) {
                        var80 = var77_79.first();
                        if (module0211.NIL != assertion_handles_oc.f11035(var80) && module0211.NIL != f13661(var80, var70)) {
                            var79 = (SubLObject)module0211.T;
                        }
                    }
                    if (module0211.NIL == var79) {
                        var76 = (SubLObject)module0211.T;
                    }
                }
            }
            var71 = (SubLObject)SubLObjectFactory.makeBoolean(module0211.NIL == var76);
        }
        return var71;
    }
    
    public static SubLObject f13662(final SubLObject var35, final SubLObject var72) {
        final SubLThread var73 = SubLProcess.currentSubLThread();
        SubLObject var74 = (SubLObject)module0211.NIL;
        final SubLObject var75 = module0147.f9540(var72);
        final SubLObject var76 = module0147.$g2095$.currentBinding(var73);
        final SubLObject var77 = module0147.$g2094$.currentBinding(var73);
        final SubLObject var78 = module0147.$g2096$.currentBinding(var73);
        try {
            module0147.$g2095$.bind(module0147.f9545(var75), var73);
            module0147.$g2094$.bind(module0147.f9546(var75), var73);
            module0147.$g2096$.bind(module0147.f9549(var75), var73);
            var74 = f13660(var35);
        }
        finally {
            module0147.$g2096$.rebind(var78, var73);
            module0147.$g2094$.rebind(var77, var73);
            module0147.$g2095$.rebind(var76, var73);
        }
        return var74;
    }
    
    public static SubLObject f13663(final SubLObject var35) {
        return module0147.f9507(module0178.f11287(var35));
    }
    
    public static SubLObject f13664(final SubLObject var35) {
        return module0035.sublisp_boolean(module0178.f11299(var35));
    }
    
    public static SubLObject f13665(final SubLObject var35) {
        return Sequences.length(module0178.f11299(var35));
    }
    
    public static SubLObject f13666(final SubLObject var35, final SubLObject var80) {
        assert module0211.NIL != assertion_handles_oc.f11035(var35) : var35;
        assert module0211.NIL != module0191.f11950(var80) : var80;
        SubLObject var81 = module0178.f11299(var35);
        SubLObject var82 = (SubLObject)module0211.NIL;
        var82 = var81.first();
        while (module0211.NIL != var81) {
            if (module0211.NIL != oc_deduction_handles.f11659(var82)) {
                SubLObject var49_83 = module0188.f11770(var82);
                SubLObject var83 = (SubLObject)module0211.NIL;
                var83 = var49_83.first();
                while (module0211.NIL != var49_83) {
                    if (module0211.NIL != module0191.f11962(var83, var80)) {
                        return (SubLObject)module0211.T;
                    }
                    var49_83 = var49_83.rest();
                    var83 = var49_83.first();
                }
            }
            var81 = var81.rest();
            var82 = var81.first();
        }
        return (SubLObject)module0211.NIL;
    }
    
    public static SubLObject f13667(final SubLObject var35, final SubLObject var80) {
        assert module0211.NIL != assertion_handles_oc.f11035(var35) : var35;
        assert module0211.NIL != module0191.f11950(var80) : var80;
        final SubLObject var81 = module0178.f11300(var35);
        SubLObject var82;
        SubLObject var83;
        SubLObject var84;
        SubLObject var85;
        SubLObject var86;
        for (var82 = module0032.f1741(var81), var83 = (SubLObject)module0211.NIL, var83 = module0032.f1742(var82, var81); module0211.NIL == module0032.f1744(var82, var83); var83 = module0032.f1743(var83)) {
            var84 = module0032.f1745(var82, var83);
            if (module0211.NIL != module0032.f1746(var83, var84)) {
                var85 = module0188.f11770(var84);
                var86 = (SubLObject)module0211.NIL;
                var86 = var85.first();
                while (module0211.NIL != var85) {
                    if (module0211.NIL != module0191.f11962(var86, var80)) {
                        return (SubLObject)module0211.T;
                    }
                    var85 = var85.rest();
                    var86 = var85.first();
                }
            }
        }
        return (SubLObject)module0211.NIL;
    }
    
    public static SubLObject f13668(final SubLObject var35) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0211.NIL != assertion_handles_oc.f11035(var35) && module0211.NIL != module0205.f13222(module0211.$ic46$, var35, (SubLObject)module0211.NIL, (SubLObject)module0211.UNPROVIDED, (SubLObject)module0211.UNPROVIDED));
    }
    
    public static SubLObject f13669(final SubLObject var35, final SubLObject var85) {
        if (module0211.NIL != module0035.f2002(var85, module0211.$g2331$.getGlobalValue(), (SubLObject)module0211.UNPROVIDED)) {
            final SubLObject var86 = module0078.f5367(var85, Symbols.symbol_function((SubLObject)module0211.EQUAL), (SubLObject)module0211.UNPROVIDED);
            return f13670(var35, var86);
        }
        SubLObject var87 = var85;
        SubLObject var88 = (SubLObject)module0211.NIL;
        var88 = var87.first();
        while (module0211.NIL != var87) {
            if (module0211.NIL != module0178.f11308(var35, var88)) {
                return (SubLObject)module0211.T;
            }
            var87 = var87.rest();
            var88 = var87.first();
        }
        return (SubLObject)module0211.NIL;
    }
    
    public static SubLObject f13671(final SubLObject var48) {
        final SubLThread var49 = SubLProcess.currentSubLThread();
        return module0077.f5320(var48, module0211.$g2332$.getDynamicValue(var49));
    }
    
    public static SubLObject f13670(final SubLObject var35, final SubLObject var86) {
        final SubLThread var87 = SubLProcess.currentSubLThread();
        SubLObject var88 = (SubLObject)module0211.NIL;
        final SubLObject var89 = module0211.$g2332$.currentBinding(var87);
        try {
            module0211.$g2332$.bind(var86, var87);
            var88 = module0035.sublisp_boolean(module0205.f13216((SubLObject)module0211.$ic48$, var35, (SubLObject)module0211.T, (SubLObject)module0211.UNPROVIDED));
        }
        finally {
            module0211.$g2332$.rebind(var89, var87);
        }
        return var88;
    }
    
    public static SubLObject f13672(final SubLObject var48) {
        final SubLThread var49 = SubLProcess.currentSubLThread();
        return module0084.f5808(module0211.$g2333$.getDynamicValue(var49), var48);
    }
    
    public static SubLObject f13673(final SubLObject var35, final SubLObject var88) {
        final SubLThread var89 = SubLProcess.currentSubLThread();
        SubLObject var90 = (SubLObject)module0211.NIL;
        final SubLObject var91 = module0211.$g2333$.currentBinding(var89);
        try {
            module0211.$g2333$.bind(var88, var89);
            var90 = module0035.sublisp_boolean(module0205.f13216((SubLObject)module0211.$ic49$, var35, (SubLObject)module0211.T, (SubLObject)module0211.UNPROVIDED));
        }
        finally {
            module0211.$g2333$.rebind(var91, var89);
        }
        return var90;
    }
    
    public static SubLObject f13674(final SubLObject var62) {
        return f13675(var62);
    }
    
    public static SubLObject f13675(final SubLObject var62) {
        final SubLThread var63 = SubLProcess.currentSubLThread();
        SubLObject var64 = (SubLObject)module0211.NIL;
        if (module0217.f14247(var62, (SubLObject)module0211.UNPROVIDED).numG((SubLObject)module0211.$ic50$)) {
            while (module0211.NIL == f13649(var64, var62)) {
                var64 = module0178.f11383((SubLObject)module0211.UNPROVIDED);
            }
        }
        else {
            final SubLObject var65 = module0217.f14247(var62, (SubLObject)module0211.UNPROVIDED);
            final SubLObject var66 = random.random(var65);
            SubLObject var67 = (SubLObject)module0211.ZERO_INTEGER;
            SubLObject var67_91 = (SubLObject)module0211.NIL;
            final SubLObject var68 = module0147.$g2094$.currentBinding(var63);
            final SubLObject var69 = module0147.$g2095$.currentBinding(var63);
            try {
                module0147.$g2094$.bind((SubLObject)module0211.$ic41$, var63);
                module0147.$g2095$.bind(module0211.$ic42$, var63);
                if (module0211.NIL != module0158.f10038(var62)) {
                    final SubLObject var70 = (SubLObject)module0211.NIL;
                    final SubLObject var68_94 = module0012.$g73$.currentBinding(var63);
                    final SubLObject var69_95 = module0012.$g65$.currentBinding(var63);
                    final SubLObject var71 = module0012.$g67$.currentBinding(var63);
                    final SubLObject var72 = module0012.$g68$.currentBinding(var63);
                    final SubLObject var73 = module0012.$g66$.currentBinding(var63);
                    final SubLObject var74 = module0012.$g69$.currentBinding(var63);
                    final SubLObject var75 = module0012.$g70$.currentBinding(var63);
                    final SubLObject var76 = module0012.$silent_progressP$.currentBinding(var63);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var63);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var63), var63);
                        module0012.$g67$.bind((SubLObject)module0211.ONE_INTEGER, var63);
                        module0012.$g68$.bind((SubLObject)module0211.ZERO_INTEGER, var63);
                        module0012.$g66$.bind((SubLObject)module0211.ZERO_INTEGER, var63);
                        module0012.$g69$.bind((SubLObject)module0211.ZERO_INTEGER, var63);
                        module0012.$g70$.bind((SubLObject)module0211.T, var63);
                        module0012.$silent_progressP$.bind((SubLObject)((module0211.NIL != var70) ? module0012.$silent_progressP$.getDynamicValue(var63) : module0211.T), var63);
                        module0012.f474(var70);
                        final SubLObject var77 = module0158.f10039(var62);
                        SubLObject var78 = var67_91;
                        final SubLObject var79 = (SubLObject)module0211.NIL;
                        while (module0211.NIL == var78) {
                            final SubLObject var80 = module0052.f3695(var77, var79);
                            final SubLObject var81 = (SubLObject)SubLObjectFactory.makeBoolean(!var79.eql(var80));
                            if (module0211.NIL != var81) {
                                module0012.f476();
                                SubLObject var82 = (SubLObject)module0211.NIL;
                                try {
                                    var82 = module0158.f10316(var80, (SubLObject)module0211.$ic51$, (SubLObject)module0211.NIL, (SubLObject)module0211.NIL);
                                    SubLObject var102_107 = var67_91;
                                    final SubLObject var103_108 = (SubLObject)module0211.NIL;
                                    while (module0211.NIL == var102_107) {
                                        final SubLObject var83 = module0052.f3695(var82, var103_108);
                                        final SubLObject var105_110 = (SubLObject)SubLObjectFactory.makeBoolean(!var103_108.eql(var83));
                                        if (module0211.NIL != var105_110) {
                                            if (var66.numE(var67)) {
                                                var67_91 = var83;
                                            }
                                            else {
                                                var67 = Numbers.add(var67, (SubLObject)module0211.ONE_INTEGER);
                                            }
                                        }
                                        var102_107 = (SubLObject)SubLObjectFactory.makeBoolean(module0211.NIL == var105_110 || module0211.NIL != var67_91);
                                    }
                                }
                                finally {
                                    final SubLObject var68_95 = Threads.$is_thread_performing_cleanupP$.currentBinding(var63);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0211.T, var63);
                                        if (module0211.NIL != var82) {
                                            module0158.f10319(var82);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var68_95, var63);
                                    }
                                }
                            }
                            var78 = (SubLObject)SubLObjectFactory.makeBoolean(module0211.NIL == var81 || module0211.NIL != var67_91);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var76, var63);
                        module0012.$g70$.rebind(var75, var63);
                        module0012.$g69$.rebind(var74, var63);
                        module0012.$g66$.rebind(var73, var63);
                        module0012.$g68$.rebind(var72, var63);
                        module0012.$g67$.rebind(var71, var63);
                        module0012.$g65$.rebind(var69_95, var63);
                        module0012.$g73$.rebind(var68_94, var63);
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var69, var63);
                module0147.$g2094$.rebind(var68, var63);
            }
        }
        return var64;
    }
    
    public static SubLObject f13676(final SubLObject var62, final SubLObject var61, final SubLObject var60) {
        final SubLThread var63 = SubLProcess.currentSubLThread();
        final SubLObject var64 = module0217.f14221(var61, var60, var62, (SubLObject)module0211.UNPROVIDED);
        final SubLObject var65 = random.random(var64);
        SubLObject var66 = (SubLObject)module0211.ZERO_INTEGER;
        SubLObject var67 = (SubLObject)module0211.NIL;
        final SubLObject var68 = module0147.$g2094$.currentBinding(var63);
        final SubLObject var69 = module0147.$g2095$.currentBinding(var63);
        try {
            module0147.$g2094$.bind((SubLObject)module0211.$ic41$, var63);
            module0147.$g2095$.bind(module0211.$ic42$, var63);
            if (module0211.NIL != module0158.f10010(var61, var60, var62)) {
                final SubLObject var70 = module0158.f10011(var61, var60, var62);
                SubLObject var71 = var67;
                final SubLObject var72 = (SubLObject)module0211.NIL;
                while (module0211.NIL == var71) {
                    final SubLObject var73 = module0052.f3695(var70, var72);
                    final SubLObject var74 = (SubLObject)SubLObjectFactory.makeBoolean(!var72.eql(var73));
                    if (module0211.NIL != var74) {
                        SubLObject var75 = (SubLObject)module0211.NIL;
                        try {
                            var75 = module0158.f10316(var73, (SubLObject)module0211.$ic51$, (SubLObject)module0211.NIL, (SubLObject)module0211.NIL);
                            SubLObject var102_114 = var67;
                            final SubLObject var103_115 = (SubLObject)module0211.NIL;
                            while (module0211.NIL == var102_114) {
                                final SubLObject var76 = module0052.f3695(var75, var103_115);
                                final SubLObject var105_116 = (SubLObject)SubLObjectFactory.makeBoolean(!var103_115.eql(var76));
                                if (module0211.NIL != var105_116) {
                                    if (var65.numE(var66)) {
                                        var67 = var76;
                                    }
                                    else {
                                        var66 = Numbers.add(var66, (SubLObject)module0211.ONE_INTEGER);
                                    }
                                }
                                var102_114 = (SubLObject)SubLObjectFactory.makeBoolean(module0211.NIL == var105_116 || module0211.NIL != var67);
                            }
                        }
                        finally {
                            final SubLObject var68_117 = Threads.$is_thread_performing_cleanupP$.currentBinding(var63);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0211.T, var63);
                                if (module0211.NIL != var75) {
                                    module0158.f10319(var75);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var68_117, var63);
                            }
                        }
                    }
                    var71 = (SubLObject)SubLObjectFactory.makeBoolean(module0211.NIL == var74 || module0211.NIL != var67);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var69, var63);
            module0147.$g2094$.rebind(var68, var63);
        }
        return var67;
    }
    
    public static SubLObject f13677(final SubLObject var118) {
        return module0035.f2099(f13678(var118));
    }
    
    public static SubLObject f13678(final SubLObject var118) {
        SubLObject var119 = (SubLObject)module0211.NIL;
        if (module0211.NIL != module0158.f10282(var118, (SubLObject)module0211.$ic52$)) {
            final SubLObject var120 = module0158.f10283(var118, (SubLObject)module0211.$ic52$);
            SubLObject var121 = (SubLObject)module0211.NIL;
            final SubLObject var122 = (SubLObject)module0211.NIL;
            while (module0211.NIL == var121) {
                final SubLObject var123 = module0052.f3695(var120, var122);
                final SubLObject var124 = (SubLObject)SubLObjectFactory.makeBoolean(!var122.eql(var123));
                if (module0211.NIL != var124) {
                    SubLObject var125 = (SubLObject)module0211.NIL;
                    try {
                        var125 = module0158.f10316(var123, (SubLObject)module0211.$ic52$, (SubLObject)module0211.NIL, (SubLObject)module0211.NIL);
                        SubLObject var102_120 = (SubLObject)module0211.NIL;
                        final SubLObject var103_121 = (SubLObject)module0211.NIL;
                        while (module0211.NIL == var102_120) {
                            final SubLObject var126 = module0052.f3695(var125, var103_121);
                            final SubLObject var105_123 = (SubLObject)SubLObjectFactory.makeBoolean(!var103_121.eql(var126));
                            if (module0211.NIL != var105_123 && module0211.NIL != module0158.f10284(var126, var123)) {
                                var119 = (SubLObject)ConsesLow.cons(var126, var119);
                            }
                            var102_120 = (SubLObject)SubLObjectFactory.makeBoolean(module0211.NIL == var105_123);
                        }
                    }
                    finally {
                        final SubLObject var127 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0211.T);
                            if (module0211.NIL != var125) {
                                module0158.f10319(var125);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var127);
                        }
                    }
                }
                var121 = (SubLObject)SubLObjectFactory.makeBoolean(module0211.NIL == var124);
            }
        }
        return Sequences.nreverse(var119);
    }
    
    public static SubLObject f13679(final SubLObject var118) {
        SubLObject var119 = (SubLObject)module0211.ZERO_INTEGER;
        if (module0211.NIL != module0158.f10282(var118, (SubLObject)module0211.$ic52$)) {
            final SubLObject var120 = module0158.f10283(var118, (SubLObject)module0211.$ic52$);
            SubLObject var121 = (SubLObject)module0211.NIL;
            final SubLObject var122 = (SubLObject)module0211.NIL;
            while (module0211.NIL == var121) {
                final SubLObject var123 = module0052.f3695(var120, var122);
                final SubLObject var124 = (SubLObject)SubLObjectFactory.makeBoolean(!var122.eql(var123));
                if (module0211.NIL != var124) {
                    SubLObject var125 = (SubLObject)module0211.NIL;
                    try {
                        var125 = module0158.f10316(var123, (SubLObject)module0211.$ic52$, (SubLObject)module0211.NIL, (SubLObject)module0211.NIL);
                        SubLObject var102_124 = (SubLObject)module0211.NIL;
                        final SubLObject var103_125 = (SubLObject)module0211.NIL;
                        while (module0211.NIL == var102_124) {
                            final SubLObject var126 = module0052.f3695(var125, var103_125);
                            final SubLObject var105_126 = (SubLObject)SubLObjectFactory.makeBoolean(!var103_125.eql(var126));
                            if (module0211.NIL != var105_126 && module0211.NIL != module0158.f10284(var126, var123)) {
                                var119 = Numbers.add(var119, (SubLObject)module0211.ONE_INTEGER);
                            }
                            var102_124 = (SubLObject)SubLObjectFactory.makeBoolean(module0211.NIL == var105_126);
                        }
                    }
                    finally {
                        final SubLObject var127 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0211.T);
                            if (module0211.NIL != var125) {
                                module0158.f10319(var125);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var127);
                        }
                    }
                }
                var121 = (SubLObject)SubLObjectFactory.makeBoolean(module0211.NIL == var124);
            }
        }
        return var119;
    }
    
    public static SubLObject f13680(final SubLObject var127) {
        SubLObject var128 = (SubLObject)module0211.NIL;
        SubLObject var129;
        for (var129 = (SubLObject)module0211.NIL, var129 = (SubLObject)module0211.ZERO_INTEGER; var129.numL(var127); var129 = Numbers.add(var129, (SubLObject)module0211.ONE_INTEGER)) {
            var128 = (SubLObject)ConsesLow.cons(module0178.f11383((SubLObject)module0211.UNPROVIDED), var128);
        }
        return var128;
    }
    
    public static SubLObject f13681(final SubLObject var128, final SubLObject var129) {
        final SubLObject var130 = module0178.f11296(var128);
        final SubLObject var131 = module0178.f11296(var129);
        if (module0211.NIL == var130) {
            return (SubLObject)module0211.NIL;
        }
        if (module0211.NIL == var131) {
            return (SubLObject)module0211.NIL;
        }
        if (var130.numL(var131)) {
            return (SubLObject)module0211.T;
        }
        if (var130.numG(var131)) {
            return (SubLObject)module0211.NIL;
        }
        final SubLObject var132 = module0178.f11298(var128);
        final SubLObject var133 = module0178.f11298(var129);
        if (module0211.NIL == var132) {
            return (SubLObject)module0211.NIL;
        }
        if (module0211.NIL == var133) {
            return (SubLObject)module0211.NIL;
        }
        if (var132.numL(var133)) {
            return (SubLObject)module0211.T;
        }
        if (var132.numG(var133)) {
            return (SubLObject)module0211.NIL;
        }
        return (SubLObject)module0211.NIL;
    }
    
    public static SubLObject f13682(final SubLObject var128, final SubLObject var129) {
        final SubLObject var130 = module0178.f11296(var128);
        final SubLObject var131 = module0178.f11296(var129);
        if (module0211.NIL == var130) {
            return (SubLObject)module0211.NIL;
        }
        if (module0211.NIL == var131) {
            return (SubLObject)module0211.NIL;
        }
        if (var130.numG(var131)) {
            return (SubLObject)module0211.T;
        }
        if (var130.numL(var131)) {
            return (SubLObject)module0211.NIL;
        }
        final SubLObject var132 = module0178.f11298(var128);
        final SubLObject var133 = module0178.f11298(var129);
        if (module0211.NIL == var132) {
            return (SubLObject)module0211.NIL;
        }
        if (module0211.NIL == var133) {
            return (SubLObject)module0211.NIL;
        }
        if (var132.numG(var133)) {
            return (SubLObject)module0211.T;
        }
        if (var132.numL(var133)) {
            return (SubLObject)module0211.NIL;
        }
        return (SubLObject)module0211.NIL;
    }
    
    public static SubLObject f13683(final SubLObject var134) {
        if (module0211.NIL == var134) {
            return (SubLObject)module0211.NIL;
        }
        if (module0211.NIL != module0035.f1997(var134)) {
            return var134.first();
        }
        final SubLObject var135 = Mapping.mapcar((SubLObject)module0211.$ic53$, var134);
        if (module0211.NIL == module0035.f2370((SubLObject)module0211.$ic54$, var135, (SubLObject)module0211.UNPROVIDED)) {
            return (SubLObject)module0211.NIL;
        }
        final SubLObject var136 = module0048.f3382(var135, (SubLObject)module0211.UNPROVIDED);
        SubLObject var137 = (SubLObject)module0211.NIL;
        SubLObject var138 = var134;
        SubLObject var139 = (SubLObject)module0211.NIL;
        var139 = var138.first();
        while (module0211.NIL != var138) {
            if (var136.numE(module0178.f11296(var139))) {
                var137 = (SubLObject)ConsesLow.cons(var139, var137);
            }
            var138 = var138.rest();
            var139 = var138.first();
        }
        if (module0211.NIL != module0035.f1997(var137)) {
            return var137.first();
        }
        final SubLObject var140 = Mapping.mapcar((SubLObject)module0211.$ic55$, var137);
        if (module0211.NIL == module0035.f2370((SubLObject)module0211.$ic54$, var140, (SubLObject)module0211.UNPROVIDED)) {
            return (SubLObject)module0211.NIL;
        }
        final SubLObject var141 = module0048.f3382(var140, (SubLObject)module0211.UNPROVIDED);
        SubLObject var142 = (SubLObject)module0211.NIL;
        SubLObject var143 = var137;
        SubLObject var144 = (SubLObject)module0211.NIL;
        var144 = var143.first();
        while (module0211.NIL != var143) {
            if (var141.numE(module0178.f11298(var144))) {
                var142 = (SubLObject)ConsesLow.cons(var144, var142);
            }
            var143 = var143.rest();
            var144 = var143.first();
        }
        if (module0211.NIL != module0035.f1997(var142)) {
            return var142.first();
        }
        return (SubLObject)module0211.NIL;
    }
    
    public static SubLObject f13684(final SubLObject var35, final SubLObject var141) {
        final SubLObject var142 = module0178.f11348(var35);
        final SubLObject var143 = module0233.f15362(var141, var142);
        final SubLObject var144 = Mapping.mapcar((SubLObject)module0211.$ic56$, var143);
        oc_assertions_interface.f11080(var35, var144);
        return (SubLObject)module0211.T;
    }
    
    public static SubLObject f13685(final SubLObject var35, final SubLObject var145) {
        if (module0211.NIL != module0202.f12704(var35, var145)) {
            return (SubLObject)module0211.NIL;
        }
        return f13684(var35, var145);
    }
    
    public static SubLObject f13686(final SubLObject var35) {
        assert module0211.NIL != assertion_handles_oc.f11035(var35) : var35;
        final SubLObject var36 = module0232.f15306(module0178.f11282(var35));
        final SubLObject var37 = module0232.f15330((SubLObject)module0211.NIL, var36);
        final SubLObject var38 = module0232.f15332(var37);
        return module0538.f33479(conses_high.copy_tree(var38), module0178.f11348(var35));
    }
    
    public static SubLObject f13687(final SubLObject var35) {
        return f13688(var35, module0211.$ic57$);
    }
    
    public static SubLObject f13689(final SubLObject var35) {
        return f13688(var35, module0211.$ic58$);
    }
    
    public static SubLObject f13688(final SubLObject var35, final SubLObject var149) {
        assert module0211.NIL != assertion_handles_oc.f11035(var35) : var35;
        final SubLObject var150 = module0232.f15306(module0178.f11282(var35));
        final SubLObject var151 = module0232.f15330((SubLObject)module0211.NIL, var150);
        final SubLObject var152 = module0232.f15332(var151);
        final SubLObject var153 = module0232.f15308(module0178.f11282(var35));
        final SubLObject var154 = module0232.f15330((SubLObject)module0211.NIL, var153);
        final SubLObject var155 = module0232.f15332(var154);
        final SubLObject var156 = module0202.f12643(var149, var155);
        final SubLObject var157 = module0276.f18293(module0202.f12773((SubLObject)ConsesLow.list(var152, var156)), (SubLObject)module0211.UNPROVIDED);
        return module0538.f33479(conses_high.copy_tree(var157), module0178.f11348(var35));
    }
    
    public static SubLObject f13690(final SubLObject var35) {
        return (SubLObject)ConsesLow.list(module0538.f33367(var35, (SubLObject)module0211.UNPROVIDED), module0178.f11287(var35), module0178.f11302(var35), module0178.f11291(var35), module0178.f11299(var35), module0178.f11284(var35));
    }
    
    public static SubLObject f13691(final SubLObject var35) {
        if (module0211.NIL != module0178.f11284(var35)) {
            return (SubLObject)module0211.ONE_INTEGER;
        }
        return f13692(var35);
    }
    
    public static SubLObject f13692(final SubLObject var155) {
        final SubLObject var156 = module0178.f11282(var155);
        return module0204.f13075(var156);
    }
    
    public static SubLObject f13693(final SubLObject var35) {
        SubLObject var36 = (SubLObject)module0211.NIL;
        SubLObject var37 = module0178.f11299(var35);
        SubLObject var38 = (SubLObject)module0211.NIL;
        var38 = var37.first();
        while (module0211.NIL != var37) {
            if (module0211.NIL != oc_deduction_handles.f11659(var38)) {
                SubLObject var49_158 = module0188.f11770(var38);
                SubLObject var39 = (SubLObject)module0211.NIL;
                var39 = var49_158.first();
                while (module0211.NIL != var49_158) {
                    if (module0211.NIL != assertion_handles_oc.f11035(var39)) {
                        var36 = (SubLObject)ConsesLow.cons(var39, var36);
                    }
                    var49_158 = var49_158.rest();
                    var39 = var49_158.first();
                }
            }
            var37 = var37.rest();
            var38 = var37.first();
        }
        return Sequences.nreverse(var36);
    }
    
    public static SubLObject f13694(final SubLObject var35) {
        return module0035.remove_if_not((SubLObject)module0211.$ic59$, f13693(var35), (SubLObject)module0211.UNPROVIDED, (SubLObject)module0211.UNPROVIDED, (SubLObject)module0211.UNPROVIDED, (SubLObject)module0211.UNPROVIDED);
    }
    
    public static SubLObject f13695(final SubLObject var35) {
        final SubLObject var36 = f13694(var35);
        return (SubLObject)((module0211.NIL != var36) ? module0048.f3382(var36, (SubLObject)module0211.$ic60$) : module0211.NIL);
    }
    
    public static SubLObject f13696(final SubLObject var35) {
        final SubLObject var36 = module0178.f11298(var35);
        if (module0211.NIL != var36) {
            final SubLObject var37 = module0178.f11296(var35);
            if (module0211.NIL != var37) {
                return module0051.f3643(var37, var36);
            }
        }
        return (SubLObject)module0211.NIL;
    }
    
    public static SubLObject f13697() {
        final SubLThread var66 = SubLProcess.currentSubLThread();
        SubLObject var67 = (SubLObject)module0211.NIL;
        final SubLObject var68 = module0211.$g2334$.currentBinding(var66);
        try {
            module0211.$g2334$.bind((SubLObject)module0211.NIL, var66);
            f13698();
            final SubLObject var69 = constant_handles_oc.f8425();
            final SubLObject var70 = (SubLObject)module0211.$ic61$;
            final SubLObject var71 = module0065.f4733(var69);
            SubLObject var72 = (SubLObject)module0211.ZERO_INTEGER;
            assert module0211.NIL != Types.stringp(var70) : var70;
            final SubLObject var68_167 = module0012.$g75$.currentBinding(var66);
            final SubLObject var73 = module0012.$g76$.currentBinding(var66);
            final SubLObject var74 = module0012.$g77$.currentBinding(var66);
            final SubLObject var75 = module0012.$g78$.currentBinding(var66);
            try {
                module0012.$g75$.bind((SubLObject)module0211.ZERO_INTEGER, var66);
                module0012.$g76$.bind((SubLObject)module0211.NIL, var66);
                module0012.$g77$.bind((SubLObject)module0211.T, var66);
                module0012.$g78$.bind(Time.get_universal_time(), var66);
                module0012.f478(var70);
                final SubLObject var168_169 = var69;
                if (module0211.NIL == module0065.f4772(var168_169, (SubLObject)module0211.$ic63$)) {
                    final SubLObject var170_171 = var168_169;
                    if (module0211.NIL == module0065.f4775(var170_171, (SubLObject)module0211.$ic63$)) {
                        final SubLObject var76 = module0065.f4740(var170_171);
                        final SubLObject var77 = (SubLObject)module0211.NIL;
                        SubLObject var78;
                        SubLObject var79;
                        SubLObject var80;
                        SubLObject var81;
                        SubLObject var83;
                        SubLObject var82;
                        SubLObject var84;
                        for (var78 = Sequences.length(var76), var79 = (SubLObject)module0211.NIL, var79 = (SubLObject)module0211.ZERO_INTEGER; var79.numL(var78); var79 = Numbers.add(var79, (SubLObject)module0211.ONE_INTEGER)) {
                            var80 = ((module0211.NIL != var77) ? Numbers.subtract(var78, var79, (SubLObject)module0211.ONE_INTEGER) : var79);
                            var81 = Vectors.aref(var76, var80);
                            if (module0211.NIL == module0065.f4749(var81) || module0211.NIL == module0065.f4773((SubLObject)module0211.$ic63$)) {
                                if (module0211.NIL != module0065.f4749(var81)) {
                                    var81 = (SubLObject)module0211.$ic63$;
                                }
                                module0012.note_percent_progress(var72, var71);
                                var72 = Numbers.add(var72, (SubLObject)module0211.ONE_INTEGER);
                                var82 = (var83 = Hashtables.gethash(var81, module0211.$g2334$.getDynamicValue(var66), (SubLObject)module0211.NIL));
                                var84 = (SubLObject)module0211.NIL;
                                var84 = var83.first();
                                while (module0211.NIL != var83) {
                                    var67 = (SubLObject)ConsesLow.cons(var84, var67);
                                    var83 = var83.rest();
                                    var84 = var83.first();
                                }
                            }
                        }
                    }
                    final SubLObject var178_179 = var168_169;
                    if (module0211.NIL == module0065.f4777(var178_179) || module0211.NIL == module0065.f4773((SubLObject)module0211.$ic63$)) {
                        final SubLObject var85 = module0065.f4738(var178_179);
                        SubLObject var86 = module0065.f4739(var178_179);
                        final SubLObject var87 = module0065.f4734(var178_179);
                        final SubLObject var88 = (SubLObject)((module0211.NIL != module0065.f4773((SubLObject)module0211.$ic63$)) ? module0211.NIL : module0211.$ic63$);
                        while (var86.numL(var87)) {
                            final SubLObject var89 = Hashtables.gethash_without_values(var86, var85, var88);
                            if (module0211.NIL == module0065.f4773((SubLObject)module0211.$ic63$) || module0211.NIL == module0065.f4749(var89)) {
                                module0012.note_percent_progress(var72, var71);
                                var72 = Numbers.add(var72, (SubLObject)module0211.ONE_INTEGER);
                                SubLObject var91;
                                final SubLObject var90 = var91 = Hashtables.gethash(var89, module0211.$g2334$.getDynamicValue(var66), (SubLObject)module0211.NIL);
                                SubLObject var92 = (SubLObject)module0211.NIL;
                                var92 = var91.first();
                                while (module0211.NIL != var91) {
                                    var67 = (SubLObject)ConsesLow.cons(var92, var67);
                                    var91 = var91.rest();
                                    var92 = var91.first();
                                }
                            }
                            var86 = Numbers.add(var86, (SubLObject)module0211.ONE_INTEGER);
                        }
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var75, var66);
                module0012.$g77$.rebind(var74, var66);
                module0012.$g76$.rebind(var73, var66);
                module0012.$g75$.rebind(var68_167, var66);
            }
        }
        finally {
            module0211.$g2334$.rebind(var68, var66);
        }
        return Sequences.nreverse(var67);
    }
    
    public static SubLObject f13699(final SubLObject var35) {
        SubLObject var36 = (SubLObject)module0211.MINUS_ONE_INTEGER;
        SubLObject var38;
        final SubLObject var37 = var38 = module0178.f11327(var35);
        SubLObject var39 = (SubLObject)module0211.NIL;
        var39 = var38.first();
        while (module0211.NIL != var38) {
            if (module0211.NIL != constant_handles_oc.f8463(var39, (SubLObject)module0211.UNPROVIDED)) {
                final SubLObject var40 = constant_handles_oc.f8440(var39);
                if (var40.numG(var36)) {
                    var36 = var40;
                }
            }
            var38 = var38.rest();
            var39 = var38.first();
        }
        return constant_handles_oc.f8486(var36);
    }
    
    public static SubLObject f13698() {
        final SubLThread var66 = SubLProcess.currentSubLThread();
        module0211.$g2334$.setDynamicValue(Hashtables.make_hash_table(constant_handles_oc.f8433(), Symbols.symbol_function((SubLObject)module0211.EQL), (SubLObject)module0211.UNPROVIDED), var66);
        final SubLObject var67 = assertion_handles_oc.f11010();
        final SubLObject var68 = (SubLObject)module0211.$ic64$;
        final SubLObject var69 = module0065.f4733(var67);
        SubLObject var70 = (SubLObject)module0211.ZERO_INTEGER;
        assert module0211.NIL != Types.stringp(var68) : var68;
        final SubLObject var71 = module0012.$g75$.currentBinding(var66);
        final SubLObject var72 = module0012.$g76$.currentBinding(var66);
        final SubLObject var73 = module0012.$g77$.currentBinding(var66);
        final SubLObject var74 = module0012.$g78$.currentBinding(var66);
        try {
            module0012.$g75$.bind((SubLObject)module0211.ZERO_INTEGER, var66);
            module0012.$g76$.bind((SubLObject)module0211.NIL, var66);
            module0012.$g77$.bind((SubLObject)module0211.T, var66);
            module0012.$g78$.bind(Time.get_universal_time(), var66);
            module0012.f478(var68);
            final SubLObject var168_186 = var67;
            if (module0211.NIL == module0065.f4772(var168_186, (SubLObject)module0211.$ic63$)) {
                final SubLObject var170_187 = var168_186;
                if (module0211.NIL == module0065.f4775(var170_187, (SubLObject)module0211.$ic63$)) {
                    final SubLObject var75 = module0065.f4740(var170_187);
                    final SubLObject var76 = (SubLObject)module0211.NIL;
                    SubLObject var77;
                    SubLObject var78;
                    SubLObject var79;
                    SubLObject var80;
                    SubLObject var81;
                    for (var77 = Sequences.length(var75), var78 = (SubLObject)module0211.NIL, var78 = (SubLObject)module0211.ZERO_INTEGER; var78.numL(var77); var78 = Numbers.add(var78, (SubLObject)module0211.ONE_INTEGER)) {
                        var79 = ((module0211.NIL != var76) ? Numbers.subtract(var77, var78, (SubLObject)module0211.ONE_INTEGER) : var78);
                        var80 = Vectors.aref(var75, var79);
                        if (module0211.NIL == module0065.f4749(var80) || module0211.NIL == module0065.f4773((SubLObject)module0211.$ic63$)) {
                            if (module0211.NIL != module0065.f4749(var80)) {
                                var80 = (SubLObject)module0211.$ic63$;
                            }
                            module0012.note_percent_progress(var70, var69);
                            var70 = Numbers.add(var70, (SubLObject)module0211.ONE_INTEGER);
                            var81 = f13699(var80);
                            Hashtables.sethash(var81, module0211.$g2334$.getDynamicValue(var66), (SubLObject)ConsesLow.cons(var80, Hashtables.gethash(var81, module0211.$g2334$.getDynamicValue(var66), (SubLObject)module0211.NIL)));
                        }
                    }
                }
                final SubLObject var178_189 = var168_186;
                if (module0211.NIL == module0065.f4777(var178_189) || module0211.NIL == module0065.f4773((SubLObject)module0211.$ic63$)) {
                    final SubLObject var82 = module0065.f4738(var178_189);
                    SubLObject var83 = module0065.f4739(var178_189);
                    final SubLObject var84 = module0065.f4734(var178_189);
                    final SubLObject var85 = (SubLObject)((module0211.NIL != module0065.f4773((SubLObject)module0211.$ic63$)) ? module0211.NIL : module0211.$ic63$);
                    while (var83.numL(var84)) {
                        final SubLObject var86 = Hashtables.gethash_without_values(var83, var82, var85);
                        if (module0211.NIL == module0065.f4773((SubLObject)module0211.$ic63$) || module0211.NIL == module0065.f4749(var86)) {
                            module0012.note_percent_progress(var70, var69);
                            var70 = Numbers.add(var70, (SubLObject)module0211.ONE_INTEGER);
                            final SubLObject var87 = f13699(var86);
                            Hashtables.sethash(var87, module0211.$g2334$.getDynamicValue(var66), (SubLObject)ConsesLow.cons(var86, Hashtables.gethash(var87, module0211.$g2334$.getDynamicValue(var66), (SubLObject)module0211.NIL)));
                        }
                        var83 = Numbers.add(var83, (SubLObject)module0211.ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var74, var66);
            module0012.$g77$.rebind(var73, var66);
            module0012.$g76$.rebind(var72, var66);
            module0012.$g75$.rebind(var71, var66);
        }
        final SubLObject var88 = module0211.$g2334$.getDynamicValue(var66);
        module0012.$g82$.setDynamicValue((SubLObject)module0211.$ic65$, var66);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var66);
        module0012.$g83$.setDynamicValue(Hashtables.hash_table_count(var88), var66);
        module0012.$g84$.setDynamicValue((SubLObject)module0211.ZERO_INTEGER, var66);
        final SubLObject var89 = module0012.$g75$.currentBinding(var66);
        final SubLObject var90 = module0012.$g76$.currentBinding(var66);
        final SubLObject var91 = module0012.$g77$.currentBinding(var66);
        final SubLObject var92 = module0012.$g78$.currentBinding(var66);
        try {
            module0012.$g75$.bind((SubLObject)module0211.ZERO_INTEGER, var66);
            module0012.$g76$.bind((SubLObject)module0211.NIL, var66);
            module0012.$g77$.bind((SubLObject)module0211.T, var66);
            module0012.$g78$.bind(Time.get_universal_time(), var66);
            module0012.f478(module0012.$g82$.getDynamicValue(var66));
            SubLObject var93 = (SubLObject)module0211.NIL;
            SubLObject var94 = (SubLObject)module0211.NIL;
            final Iterator var95 = Hashtables.getEntrySetIterator(var88);
            try {
                while (Hashtables.iteratorHasNext(var95)) {
                    final Map.Entry var96 = Hashtables.iteratorNextEntry(var95);
                    var93 = Hashtables.getEntryKey(var96);
                    var94 = Hashtables.getEntryValue(var96);
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var66), module0012.$g83$.getDynamicValue(var66));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var66), (SubLObject)module0211.ONE_INTEGER), var66);
                    Hashtables.sethash(var93, module0211.$g2334$.getDynamicValue(var66), Sequences.nreverse(var94));
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(var95);
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var92, var66);
            module0012.$g77$.rebind(var91, var66);
            module0012.$g76$.rebind(var90, var66);
            module0012.$g75$.rebind(var89, var66);
        }
        return (SubLObject)module0211.NIL;
    }
    
    public static SubLObject f13700(final SubLObject var35) {
        assert module0211.NIL != assertion_handles_oc.f11035(var35) : var35;
        return module0035.sublisp_boolean(oc_assertions_low.f11242(var35));
    }
    
    public static SubLObject f13701(final SubLObject var35) {
        assert module0211.NIL != assertion_handles_oc.f11035(var35) : var35;
        if (module0211.NIL == f13700(var35)) {
            return (SubLObject)module0211.NIL;
        }
        final SubLObject var36 = module0226.f15093(var35, (SubLObject)module0211.UNPROVIDED);
        return Sequences.delete_duplicates(ConsesLow.nconc(var36, Mapping.mapcan(Symbols.symbol_function((SubLObject)module0211.$ic71$), var36, module0211.EMPTY_SUBL_OBJECT_ARRAY)), (SubLObject)module0211.UNPROVIDED, (SubLObject)module0211.UNPROVIDED, (SubLObject)module0211.UNPROVIDED, (SubLObject)module0211.UNPROVIDED);
    }
    
    public static SubLObject f13702(final SubLObject var35) {
        final SubLObject var36 = f13701(var35);
        SubLObject var37 = (SubLObject)module0211.NIL;
        SubLObject var38 = var36;
        SubLObject var39 = (SubLObject)module0211.NIL;
        var39 = var38.first();
        while (module0211.NIL != var38) {
            var37 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var39, module0178.f11287(var39)), var37);
            var38 = var38.rest();
            var39 = var38.first();
        }
        return Sequences.nreverse(var37);
    }
    
    public static SubLObject f13703(final SubLObject var35) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0211.NIL != assertion_handles_oc.f11035(var35) && module0211.NIL != module0205.f13216((SubLObject)module0211.$ic27$, var35, (SubLObject)module0211.UNPROVIDED, (SubLObject)module0211.UNPROVIDED));
    }
    
    public static SubLObject f13704(final SubLObject var195, final SubLObject var35, final SubLObject var196) {
        assert module0211.NIL != f13703(var195) : var195;
        assert module0211.NIL != assertion_handles_oc.f11035(var35) : var35;
        SubLObject var197 = module0289.f19396(var195);
        if (module0211.NIL != module0205.f13220(var35, module0178.f11289(var195), (SubLObject)module0211.UNPROVIDED, (SubLObject)module0211.UNPROVIDED, (SubLObject)module0211.UNPROVIDED)) {
            if (module0211.NIL != module0161.f10513(module0178.f11287(var35), module0178.f11287(var195))) {
                final SubLObject var198 = module0289.f19396(var35);
                var197 = module0205.f13250(var196, var198, var197, Symbols.symbol_function((SubLObject)module0211.EQUAL), (SubLObject)module0211.UNPROVIDED);
            }
            else {
                final SubLObject var199 = module0289.f19402(var35);
                var197 = module0205.f13250(var196, var199, var197, Symbols.symbol_function((SubLObject)module0211.EQUAL), (SubLObject)module0211.UNPROVIDED);
            }
        }
        return var197;
    }
    
    public static SubLObject f13705(final SubLObject var72, final SubLObject var134) {
        assert module0211.NIL != module0161.f10481(var72) : var72;
        assert module0211.NIL != f13632(var134) : var134;
        SubLObject var135 = (SubLObject)module0211.NIL;
        if (module0211.NIL == var135) {
            SubLObject var136;
            SubLObject var137;
            for (var136 = var134, var137 = (SubLObject)module0211.NIL, var137 = var136.first(); module0211.NIL == var135 && module0211.NIL != var136; var135 = (SubLObject)SubLObjectFactory.makeBoolean(module0211.NIL == module0161.f10513(var72, module0178.f11287(var137))), var136 = var136.rest(), var137 = var136.first()) {}
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0211.NIL == var135);
    }
    
    public static SubLObject f13706(final SubLObject var134, final SubLObject var72) {
        assert module0211.NIL != module0161.f10481(var72) : var72;
        assert module0211.NIL != f13632(var134) : var134;
        SubLObject var135 = (SubLObject)module0211.NIL;
        SubLObject var136 = var134;
        SubLObject var137 = (SubLObject)module0211.NIL;
        var137 = var136.first();
        while (module0211.NIL != var136) {
            if (module0211.NIL != module0161.f10513(var72, module0178.f11287(var137))) {
                var135 = (SubLObject)ConsesLow.cons(var137, var135);
            }
            var136 = var136.rest();
            var137 = var136.first();
        }
        return Sequences.nreverse(var135);
    }
    
    public static SubLObject f13707(final SubLObject var134) {
        assert module0211.NIL != f13632(var134) : var134;
        SubLObject var135 = (SubLObject)module0211.NIL;
        SubLObject var136 = var134;
        SubLObject var137 = (SubLObject)module0211.NIL;
        var137 = var136.first();
        while (module0211.NIL != var136) {
            var135 = (SubLObject)ConsesLow.cons(module0178.f11287(var137), var135);
            var136 = var136.rest();
            var137 = var136.first();
        }
        return module0035.f2269(var135, (SubLObject)module0211.UNPROVIDED, (SubLObject)module0211.UNPROVIDED, (SubLObject)module0211.UNPROVIDED, (SubLObject)module0211.UNPROVIDED, (SubLObject)module0211.UNPROVIDED);
    }
    
    public static SubLObject f13708(final SubLObject var134) {
        final SubLObject var135 = module0262.f17364(Mapping.mapcar((SubLObject)module0211.$ic75$, var134), (SubLObject)module0211.UNPROVIDED);
        if (module0211.NIL != module0035.f1997(var135)) {
            return module0035.f2113(var135);
        }
        return (SubLObject)module0211.NIL;
    }
    
    public static SubLObject f13709(SubLObject var202, SubLObject var203, SubLObject var204) {
        if (var203 == module0211.UNPROVIDED) {
            var203 = (SubLObject)module0211.$ic76$;
        }
        if (var204 == module0211.UNPROVIDED) {
            var204 = (SubLObject)module0211.$ic77$;
        }
        var202 = Sort.sort(var202, Symbols.symbol_function((SubLObject)module0211.$ic78$), Symbols.symbol_function((SubLObject)module0211.$ic79$));
        var202 = Sort.stable_sort(var202, var204, Symbols.symbol_function((SubLObject)module0211.$ic80$));
        var202 = Sort.stable_sort(var202, var203, Symbols.symbol_function((SubLObject)module0211.$ic81$));
        return var202;
    }
    
    public static SubLObject f13710(final SubLObject var155) {
        final SubLThread var156 = SubLProcess.currentSubLThread();
        final SubLObject var157 = module0178.f11282(var155);
        final SubLObject var158 = module0178.f11287(var155);
        SubLObject var159 = (SubLObject)module0211.NIL;
        final SubLObject var160 = module0144.$g1755$.currentBinding(var156);
        final SubLObject var161 = module0144.$g1757$.currentBinding(var156);
        try {
            module0144.$g1755$.bind((SubLObject)module0211.T, var156);
            module0144.$g1757$.bind((SubLObject)module0211.T, var156);
            var159 = module0307.f20782(var157, var158);
        }
        finally {
            module0144.$g1757$.rebind(var161, var156);
            module0144.$g1755$.rebind(var160, var156);
        }
        var159 = Sequences.remove_if((SubLObject)module0211.$ic82$, var159, (SubLObject)module0211.UNPROVIDED, (SubLObject)module0211.UNPROVIDED, (SubLObject)module0211.UNPROVIDED, (SubLObject)module0211.UNPROVIDED);
        if (module0211.NIL != var159 && module0211.NIL != module0205.f13207(var159, (SubLObject)module0211.UNPROVIDED)) {
            var156.resetMultipleValues();
            final SubLObject var162 = module0282.f18747(var159, var158);
            final SubLObject var163 = var156.secondMultipleValue();
            var156.resetMultipleValues();
            if (module0211.NIL == module0161.f10513(var163, var158)) {
                Errors.warn((SubLObject)module0211.$ic83$, var158, var163);
            }
            if (module0211.NIL == Errors.$ignore_mustsP$.getDynamicValue(var156) && module0211.NIL == module0035.f1997(var162)) {
                Errors.error((SubLObject)module0211.$ic84$, var155, var162);
            }
            return var162.first();
        }
        return (SubLObject)module0211.NIL;
    }
    
    public static SubLObject f13711(final SubLObject var155) {
        if (module0211.NIL != module0178.f11290(var155)) {
            return f13712(var155);
        }
        return (SubLObject)module0211.NIL;
    }
    
    public static SubLObject f13713() {
        final SubLObject var208 = module0211.$g2335$.getGlobalValue();
        if (module0211.NIL != var208) {
            module0034.f1818(var208);
        }
        return (SubLObject)module0211.NIL;
    }
    
    public static SubLObject f13714(final SubLObject var155) {
        return module0034.f1829(module0211.$g2335$.getGlobalValue(), (SubLObject)ConsesLow.list(var155), (SubLObject)module0211.UNPROVIDED, (SubLObject)module0211.UNPROVIDED);
    }
    
    public static SubLObject f13715(final SubLObject var155) {
        final SubLObject var156 = module0178.f11282(var155);
        SubLObject var157 = module0232.f15308(var156);
        SubLObject var158 = (SubLObject)module0211.NIL;
        var158 = var157.first();
        while (module0211.NIL != var157) {
            SubLObject var49_209 = module0232.f15306(var156);
            SubLObject var159 = (SubLObject)module0211.NIL;
            var159 = var49_209.first();
            while (module0211.NIL != var49_209) {
                if (module0211.NIL != module0234.f15434(var158, var159)) {
                    return (SubLObject)module0211.T;
                }
                var49_209 = var49_209.rest();
                var159 = var49_209.first();
            }
            var157 = var157.rest();
            var158 = var157.first();
        }
        return (SubLObject)module0211.NIL;
    }
    
    public static SubLObject f13712(final SubLObject var155) {
        SubLObject var156 = module0211.$g2335$.getGlobalValue();
        if (module0211.NIL == var156) {
            var156 = module0034.f1934((SubLObject)module0211.$ic85$, (SubLObject)module0211.$ic86$, (SubLObject)module0211.NIL, (SubLObject)module0211.EQL, (SubLObject)module0211.ONE_INTEGER, (SubLObject)module0211.ZERO_INTEGER);
        }
        SubLObject var157 = module0034.f1814(var156, var155, (SubLObject)module0211.$ic87$);
        if (var157 == module0211.$ic87$) {
            var157 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f13715(var155)));
            module0034.f1816(var156, var155, var157, (SubLObject)module0211.UNPROVIDED);
        }
        return module0034.f1959(var157);
    }
    
    public static SubLObject f13716(final SubLObject var155) {
        if (module0211.NIL != module0178.f11290(var155)) {
            return f13717(var155);
        }
        return (SubLObject)module0211.NIL;
    }
    
    public static SubLObject f13718() {
        final SubLObject var208 = module0211.$g2336$.getGlobalValue();
        if (module0211.NIL != var208) {
            module0034.f1818(var208);
        }
        return (SubLObject)module0211.NIL;
    }
    
    public static SubLObject f13719(final SubLObject var155) {
        return module0034.f1829(module0211.$g2336$.getGlobalValue(), (SubLObject)ConsesLow.list(var155), (SubLObject)module0211.UNPROVIDED, (SubLObject)module0211.UNPROVIDED);
    }
    
    public static SubLObject f13720(final SubLObject var155) {
        final SubLObject var156 = module0178.f11282(var155);
        SubLObject var157;
        SubLObject var158;
        SubLObject var159;
        SubLObject var160;
        SubLObject var161;
        SubLObject var162;
        for (var157 = (SubLObject)module0211.NIL, var158 = (SubLObject)module0211.NIL, var158 = module0232.f15308(var156); module0211.NIL == var157 && module0211.NIL != var158; var158 = var158.rest()) {
            var159 = var158.first();
            var160 = (SubLObject)module0211.ZERO_INTEGER;
            var161 = module0232.f15306(var156);
            var162 = (SubLObject)module0211.NIL;
            var162 = var161.first();
            while (module0211.NIL != var161) {
                if (module0211.NIL != module0234.f15434(var159, var162)) {
                    var160 = Numbers.add(var160, (SubLObject)module0211.ONE_INTEGER);
                }
                var161 = var161.rest();
                var162 = var161.first();
            }
            if (var160.numGE((SubLObject)module0211.TWO_INTEGER)) {
                var157 = var159;
            }
        }
        return module0035.sublisp_boolean(var157);
    }
    
    public static SubLObject f13717(final SubLObject var155) {
        SubLObject var156 = module0211.$g2336$.getGlobalValue();
        if (module0211.NIL == var156) {
            var156 = module0034.f1934((SubLObject)module0211.$ic88$, (SubLObject)module0211.$ic89$, (SubLObject)module0211.NIL, (SubLObject)module0211.EQL, (SubLObject)module0211.ONE_INTEGER, (SubLObject)module0211.ZERO_INTEGER);
        }
        SubLObject var157 = module0034.f1814(var156, var155, (SubLObject)module0211.$ic87$);
        if (var157 == module0211.$ic87$) {
            var157 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f13720(var155)));
            module0034.f1816(var156, var155, var157, (SubLObject)module0211.UNPROVIDED);
        }
        return module0034.f1959(var157);
    }
    
    public static SubLObject f13721(final SubLObject var118) {
        assert module0211.NIL != module0173.f10955(var118) : var118;
        SubLObject var119 = f13722(var118);
        var119 = Sort.sort(var119, Symbols.symbol_function((SubLObject)module0211.$ic91$), Symbols.symbol_function((SubLObject)module0211.$ic60$));
        return var119;
    }
    
    public static SubLObject f13723(final SubLObject var215) {
        assert module0211.NIL != module0035.f2015(var215) : var215;
        SubLObject var216 = var215;
        SubLObject var217 = (SubLObject)module0211.NIL;
        var217 = var216.first();
        while (module0211.NIL != var216) {
            assert module0211.NIL != module0173.f10955(var217) : var217;
            var216 = var216.rest();
            var217 = var216.first();
        }
        SubLObject var218 = (SubLObject)module0211.NIL;
        var216 = var215;
        SubLObject var219 = (SubLObject)module0211.NIL;
        var219 = var216.first();
        while (module0211.NIL != var216) {
            SubLObject var49_218 = f13721(var219);
            SubLObject var220 = (SubLObject)module0211.NIL;
            var220 = var49_218.first();
            while (module0211.NIL != var49_218) {
                final SubLObject var221 = var220;
                if (module0211.NIL == conses_high.member(var221, var218, Symbols.symbol_function((SubLObject)module0211.EQL), Symbols.symbol_function((SubLObject)module0211.IDENTITY))) {
                    var218 = (SubLObject)ConsesLow.cons(var221, var218);
                }
                var49_218 = var49_218.rest();
                var220 = var49_218.first();
            }
            var216 = var216.rest();
            var219 = var216.first();
        }
        var218 = Sort.sort(var218, Symbols.symbol_function((SubLObject)module0211.$ic91$), Symbols.symbol_function((SubLObject)module0211.$ic60$));
        return var218;
    }
    
    public static SubLObject f13724(final SubLObject var36) {
        SubLObject var37 = (SubLObject)module0211.NIL;
        SubLObject var38 = module0188.f11770(var36);
        SubLObject var39 = (SubLObject)module0211.NIL;
        var39 = var38.first();
        while (module0211.NIL != var38) {
            if (module0211.NIL != module0178.f11313(var39)) {
                var37 = (SubLObject)ConsesLow.cons(var39, var37);
            }
            var38 = var38.rest();
            var39 = var38.first();
        }
        return Sequences.nreverse(var37);
    }
    
    public static SubLObject f13722(final SubLObject var118) {
        final SubLThread var119 = SubLProcess.currentSubLThread();
        SubLObject var120 = (SubLObject)module0211.NIL;
        final SubLObject var121 = module0147.$g2094$.currentBinding(var119);
        final SubLObject var122 = module0147.$g2095$.currentBinding(var119);
        final SubLObject var123 = module0211.$g2337$.currentBinding(var119);
        final SubLObject var124 = module0211.$g2338$.currentBinding(var119);
        final SubLObject var125 = module0211.$g2339$.currentBinding(var119);
        final SubLObject var126 = module0211.$g2340$.currentBinding(var119);
        try {
            module0147.$g2094$.bind((SubLObject)module0211.$ic41$, var119);
            module0147.$g2095$.bind(module0211.$ic42$, var119);
            module0211.$g2337$.bind(module0077.f5313(Symbols.symbol_function((SubLObject)module0211.EQL), (SubLObject)module0211.UNPROVIDED), var119);
            module0211.$g2338$.bind(module0077.f5313(Symbols.symbol_function((SubLObject)module0211.EQL), (SubLObject)module0211.UNPROVIDED), var119);
            module0211.$g2339$.bind(module0077.f5313(Symbols.symbol_function((SubLObject)module0211.EQL), (SubLObject)module0211.UNPROVIDED), var119);
            module0211.$g2340$.bind(module0077.f5313(Symbols.symbol_function((SubLObject)module0211.EQL), (SubLObject)module0211.UNPROVIDED), var119);
            f13725(var118, (SubLObject)module0211.$ic93$);
            var120 = module0211.$g2340$.getDynamicValue(var119);
        }
        finally {
            module0211.$g2340$.rebind(var126, var119);
            module0211.$g2339$.rebind(var125, var119);
            module0211.$g2338$.rebind(var124, var119);
            module0211.$g2337$.rebind(var123, var119);
            module0147.$g2095$.rebind(var122, var119);
            module0147.$g2094$.rebind(var121, var119);
        }
        return module0077.f5312(var120);
    }
    
    public static SubLObject f13725(final SubLObject var118, final SubLObject var221) {
        if (module0211.NIL != module0158.f10282(var118, (SubLObject)module0211.NIL)) {
            final SubLObject var222 = module0158.f10283(var118, (SubLObject)module0211.NIL);
            SubLObject var223 = (SubLObject)module0211.NIL;
            final SubLObject var224 = (SubLObject)module0211.NIL;
            while (module0211.NIL == var223) {
                final SubLObject var225 = module0052.f3695(var222, var224);
                final SubLObject var226 = (SubLObject)SubLObjectFactory.makeBoolean(!var224.eql(var225));
                if (module0211.NIL != var226) {
                    SubLObject var227 = (SubLObject)module0211.NIL;
                    try {
                        var227 = module0158.f10316(var225, (SubLObject)module0211.NIL, (SubLObject)module0211.NIL, (SubLObject)module0211.NIL);
                        SubLObject var102_222 = (SubLObject)module0211.NIL;
                        final SubLObject var103_223 = (SubLObject)module0211.NIL;
                        while (module0211.NIL == var102_222) {
                            final SubLObject var228 = module0052.f3695(var227, var103_223);
                            final SubLObject var105_224 = (SubLObject)SubLObjectFactory.makeBoolean(!var103_223.eql(var228));
                            if (module0211.NIL != var105_224 && module0211.NIL != module0158.f10284(var228, var225)) {
                                SubLObject var229 = var221;
                                SubLObject var230 = (SubLObject)module0211.NIL;
                                var230 = var229.first();
                                while (module0211.NIL != var229) {
                                    f13726(var228, var230);
                                    var229 = var229.rest();
                                    var230 = var229.first();
                                }
                            }
                            var102_222 = (SubLObject)SubLObjectFactory.makeBoolean(module0211.NIL == var105_224);
                        }
                    }
                    finally {
                        final SubLObject var231 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0211.T);
                            if (module0211.NIL != var227) {
                                module0158.f10319(var227);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var231);
                        }
                    }
                }
                var223 = (SubLObject)SubLObjectFactory.makeBoolean(module0211.NIL == var226);
            }
        }
        return (SubLObject)module0211.NIL;
    }
    
    public static SubLObject f13726(final SubLObject var35, final SubLObject var225) {
        final SubLThread var226 = SubLProcess.currentSubLThread();
        if (module0211.NIL != f13649(var35, module0211.$ic94$)) {
            return (SubLObject)module0211.NIL;
        }
        if (module0211.NIL == module0178.f11377(var35, (SubLObject)module0211.NIL)) {
            return (SubLObject)module0211.NIL;
        }
        if (var225.eql((SubLObject)module0211.$ic95$)) {
            if (module0211.NIL != module0077.f5320(var35, module0211.$g2337$.getDynamicValue(var226))) {
                return (SubLObject)module0211.NIL;
            }
            module0077.f5326(var35, module0211.$g2337$.getDynamicValue(var226));
        }
        else if (var225.eql((SubLObject)module0211.$ic96$)) {
            if (module0211.NIL != module0077.f5320(var35, module0211.$g2338$.getDynamicValue(var226))) {
                return (SubLObject)module0211.NIL;
            }
            module0077.f5326(var35, module0211.$g2338$.getDynamicValue(var226));
        }
        SubLObject var227 = module0205.f13195(var35, (SubLObject)module0211.T, (SubLObject)module0211.UNPROVIDED);
        SubLObject var228 = (SubLObject)module0211.NIL;
        var228 = var227.first();
        while (module0211.NIL != var227) {
            if (module0211.NIL == module0077.f5320(var228, module0211.$g2339$.getDynamicValue(var226))) {
                module0077.f5326(var228, module0211.$g2339$.getDynamicValue(var226));
                if (module0211.NIL != module0226.f14878(module0205.f13276(var228), module0178.f11287(var35))) {
                    f13725(var228, (SubLObject)ConsesLow.list(var225));
                }
            }
            var227 = var227.rest();
            var228 = var227.first();
        }
        f13727(var35, var225);
        return (SubLObject)module0211.NIL;
    }
    
    public static SubLObject f13727(final SubLObject var35, final SubLObject var225) {
        final SubLThread var226 = SubLProcess.currentSubLThread();
        SubLObject var227 = module0178.f11299(var35);
        SubLObject var228 = (SubLObject)module0211.NIL;
        var228 = var227.first();
        while (module0211.NIL != var227) {
            if (module0211.NIL != oc_deduction_handles.f11659(var228)) {
                module0078.f5374(f13724(var228), module0211.$g2340$.getDynamicValue(var226));
            }
            var227 = var227.rest();
            var228 = var227.first();
        }
        if (var225.eql((SubLObject)module0211.$ic95$)) {
            SubLObject var229 = module0178.f11299(var35);
            SubLObject var230 = (SubLObject)module0211.NIL;
            var230 = var229.first();
            while (module0211.NIL != var229) {
                if (module0211.NIL != oc_deduction_handles.f11659(var230)) {
                    SubLObject var49_228 = module0188.f11770(var230);
                    SubLObject var231 = (SubLObject)module0211.NIL;
                    var231 = var49_228.first();
                    while (module0211.NIL != var49_228) {
                        if (module0211.NIL != assertion_handles_oc.f11035(var231)) {
                            f13726(var231, var225);
                        }
                        var49_228 = var49_228.rest();
                        var231 = var49_228.first();
                    }
                }
                var229 = var229.rest();
                var230 = var229.first();
            }
        }
        else if (var225.eql((SubLObject)module0211.$ic96$)) {
            final SubLObject var232 = module0178.f11300(var35);
            SubLObject var233;
            SubLObject var234;
            SubLObject var235;
            SubLObject var236;
            for (var233 = module0032.f1741(var232), var234 = (SubLObject)module0211.NIL, var234 = module0032.f1742(var233, var232); module0211.NIL == module0032.f1744(var233, var234); var234 = module0032.f1743(var234)) {
                var235 = module0032.f1745(var233, var234);
                if (module0211.NIL != module0032.f1746(var234, var235)) {
                    var236 = module0188.f11788(var235);
                    if (module0211.NIL != assertion_handles_oc.f11035(var236)) {
                        f13726(var236, var225);
                    }
                }
            }
        }
        return (SubLObject)module0211.NIL;
    }
    
    public static SubLObject f13728(SubLObject var72) {
        if (var72 == module0211.UNPROVIDED) {
            var72 = (SubLObject)module0211.NIL;
        }
        final SubLThread var73 = SubLProcess.currentSubLThread();
        final SubLObject var74 = module0077.f5313(Symbols.symbol_function((SubLObject)module0211.EQL), (SubLObject)module0211.UNPROVIDED);
        final SubLObject var75 = var72;
        final SubLObject var76 = module0147.$g2095$.currentBinding(var73);
        final SubLObject var77 = module0147.$g2094$.currentBinding(var73);
        final SubLObject var78 = module0147.$g2096$.currentBinding(var73);
        try {
            module0147.$g2095$.bind(module0147.f9545(var75), var73);
            module0147.$g2094$.bind(module0147.f9546(var75), var73);
            module0147.$g2096$.bind(module0147.f9549(var75), var73);
            final SubLObject var79 = (SubLObject)module0211.$ic97$;
            final SubLObject var80 = oc_assertions_low.f11226();
            SubLObject var81 = (SubLObject)module0211.ZERO_INTEGER;
            final SubLObject var68_233 = module0012.$g75$.currentBinding(var73);
            final SubLObject var69_234 = module0012.$g76$.currentBinding(var73);
            final SubLObject var82_235 = module0012.$g77$.currentBinding(var73);
            final SubLObject var82 = module0012.$g78$.currentBinding(var73);
            try {
                module0012.$g75$.bind((SubLObject)module0211.ZERO_INTEGER, var73);
                module0012.$g76$.bind((SubLObject)module0211.NIL, var73);
                module0012.$g77$.bind((SubLObject)module0211.T, var73);
                module0012.$g78$.bind(Time.get_universal_time(), var73);
                module0012.f478(var79);
                final SubLObject var83 = module0031.f1696(oc_assertions_low.f11224());
                final SubLObject var84 = (SubLObject)module0211.NIL;
                SubLObject var85;
                SubLObject var86;
                SubLObject var87;
                SubLObject var88;
                SubLObject var89;
                SubLObject var90;
                SubLObject var91;
                SubLObject var92;
                SubLObject var93;
                SubLObject var94;
                SubLObject var102_238;
                SubLObject var103_239;
                SubLObject var95;
                SubLObject var105_241;
                SubLObject var68_234;
                for (var85 = Sequences.length(var83), var86 = (SubLObject)module0211.NIL, var86 = (SubLObject)module0211.ZERO_INTEGER; var86.numL(var85); var86 = Numbers.add(var86, (SubLObject)module0211.ONE_INTEGER)) {
                    var87 = ((module0211.NIL != var84) ? Numbers.subtract(var85, var86, (SubLObject)module0211.ONE_INTEGER) : var86);
                    var88 = Vectors.aref(var83, var87);
                    if (module0211.NIL != module0031.f1697(var88)) {
                        var81 = Numbers.add(var81, (SubLObject)module0211.ONE_INTEGER);
                        module0012.note_percent_progress(var81, var80);
                        if (module0211.NIL != module0532.f33187(var88) && module0211.NIL != module0158.f10198(var88, (SubLObject)module0211.NIL)) {
                            var89 = module0158.f10199(var88, (SubLObject)module0211.NIL);
                            var90 = (SubLObject)module0211.NIL;
                            var91 = (SubLObject)module0211.NIL;
                            while (module0211.NIL == var90) {
                                var92 = module0052.f3695(var89, var91);
                                var93 = (SubLObject)SubLObjectFactory.makeBoolean(!var91.eql(var92));
                                if (module0211.NIL != var93) {
                                    var94 = (SubLObject)module0211.NIL;
                                    try {
                                        var94 = module0158.f10316(var92, (SubLObject)module0211.$ic52$, (SubLObject)module0211.NIL, (SubLObject)module0211.NIL);
                                        var102_238 = (SubLObject)module0211.NIL;
                                        var103_239 = (SubLObject)module0211.NIL;
                                        while (module0211.NIL == var102_238) {
                                            var95 = module0052.f3695(var94, var103_239);
                                            var105_241 = (SubLObject)SubLObjectFactory.makeBoolean(!var103_239.eql(var95));
                                            if (module0211.NIL != var105_241) {
                                                module0077.f5326(var95, var74);
                                            }
                                            var102_238 = (SubLObject)SubLObjectFactory.makeBoolean(module0211.NIL == var105_241);
                                        }
                                    }
                                    finally {
                                        var68_234 = Threads.$is_thread_performing_cleanupP$.currentBinding(var73);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0211.T, var73);
                                            if (module0211.NIL != var94) {
                                                module0158.f10319(var94);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var68_234, var73);
                                        }
                                    }
                                }
                                var90 = (SubLObject)SubLObjectFactory.makeBoolean(module0211.NIL == var93);
                            }
                        }
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var82, var73);
                module0012.$g77$.rebind(var82_235, var73);
                module0012.$g76$.rebind(var69_234, var73);
                module0012.$g75$.rebind(var68_233, var73);
            }
        }
        finally {
            module0147.$g2096$.rebind(var78, var73);
            module0147.$g2094$.rebind(var77, var73);
            module0147.$g2095$.rebind(var76, var73);
        }
        return Sort.sort(module0077.f5312(var74), Symbols.symbol_function((SubLObject)module0211.$ic78$), Symbols.symbol_function((SubLObject)module0211.$ic79$));
    }
    
    public static SubLObject f13729(SubLObject var72) {
        if (var72 == module0211.UNPROVIDED) {
            var72 = (SubLObject)module0211.NIL;
        }
        final SubLThread var73 = SubLProcess.currentSubLThread();
        final SubLObject var74 = module0077.f5313(Symbols.symbol_function((SubLObject)module0211.EQL), (SubLObject)module0211.UNPROVIDED);
        final SubLObject var75 = var72;
        final SubLObject var76 = module0147.$g2095$.currentBinding(var73);
        final SubLObject var77 = module0147.$g2094$.currentBinding(var73);
        final SubLObject var78 = module0147.$g2096$.currentBinding(var73);
        try {
            module0147.$g2095$.bind(module0147.f9545(var75), var73);
            module0147.$g2094$.bind(module0147.f9546(var75), var73);
            module0147.$g2096$.bind(module0147.f9549(var75), var73);
            final SubLObject var79 = (SubLObject)module0211.$ic98$;
            final SubLObject var80 = oc_assertions_low.f11226();
            SubLObject var81 = (SubLObject)module0211.ZERO_INTEGER;
            final SubLObject var68_244 = module0012.$g75$.currentBinding(var73);
            final SubLObject var69_245 = module0012.$g76$.currentBinding(var73);
            final SubLObject var82_246 = module0012.$g77$.currentBinding(var73);
            final SubLObject var82 = module0012.$g78$.currentBinding(var73);
            try {
                module0012.$g75$.bind((SubLObject)module0211.ZERO_INTEGER, var73);
                module0012.$g76$.bind((SubLObject)module0211.NIL, var73);
                module0012.$g77$.bind((SubLObject)module0211.T, var73);
                module0012.$g78$.bind(Time.get_universal_time(), var73);
                module0012.f478(var79);
                final SubLObject var83 = module0031.f1696(oc_assertions_low.f11224());
                final SubLObject var84 = (SubLObject)module0211.NIL;
                SubLObject var85;
                SubLObject var86;
                SubLObject var87;
                SubLObject var88;
                SubLObject var89;
                SubLObject var90;
                SubLObject var91;
                SubLObject var92;
                SubLObject var93;
                SubLObject var94;
                SubLObject var102_248;
                SubLObject var103_249;
                SubLObject var95;
                SubLObject var105_251;
                SubLObject var68_245;
                for (var85 = Sequences.length(var83), var86 = (SubLObject)module0211.NIL, var86 = (SubLObject)module0211.ZERO_INTEGER; var86.numL(var85); var86 = Numbers.add(var86, (SubLObject)module0211.ONE_INTEGER)) {
                    var87 = ((module0211.NIL != var84) ? Numbers.subtract(var85, var86, (SubLObject)module0211.ONE_INTEGER) : var86);
                    var88 = Vectors.aref(var83, var87);
                    if (module0211.NIL != module0031.f1697(var88)) {
                        var81 = Numbers.add(var81, (SubLObject)module0211.ONE_INTEGER);
                        module0012.note_percent_progress(var81, var80);
                        if (module0211.NIL != module0377.f26812(var88, (SubLObject)module0211.UNPROVIDED) && module0211.NIL != module0158.f10221(var88, (SubLObject)module0211.NIL)) {
                            var89 = module0158.f10222(var88, (SubLObject)module0211.NIL);
                            var90 = (SubLObject)module0211.NIL;
                            var91 = (SubLObject)module0211.NIL;
                            while (module0211.NIL == var90) {
                                var92 = module0052.f3695(var89, var91);
                                var93 = (SubLObject)SubLObjectFactory.makeBoolean(!var91.eql(var92));
                                if (module0211.NIL != var93) {
                                    var94 = (SubLObject)module0211.NIL;
                                    try {
                                        var94 = module0158.f10316(var92, (SubLObject)module0211.$ic52$, (SubLObject)module0211.NIL, (SubLObject)module0211.NIL);
                                        var102_248 = (SubLObject)module0211.NIL;
                                        var103_249 = (SubLObject)module0211.NIL;
                                        while (module0211.NIL == var102_248) {
                                            var95 = module0052.f3695(var94, var103_249);
                                            var105_251 = (SubLObject)SubLObjectFactory.makeBoolean(!var103_249.eql(var95));
                                            if (module0211.NIL != var105_251) {
                                                module0077.f5326(var95, var74);
                                            }
                                            var102_248 = (SubLObject)SubLObjectFactory.makeBoolean(module0211.NIL == var105_251);
                                        }
                                    }
                                    finally {
                                        var68_245 = Threads.$is_thread_performing_cleanupP$.currentBinding(var73);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0211.T, var73);
                                            if (module0211.NIL != var94) {
                                                module0158.f10319(var94);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var68_245, var73);
                                        }
                                    }
                                }
                                var90 = (SubLObject)SubLObjectFactory.makeBoolean(module0211.NIL == var93);
                            }
                        }
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var82, var73);
                module0012.$g77$.rebind(var82_246, var73);
                module0012.$g76$.rebind(var69_245, var73);
                module0012.$g75$.rebind(var68_244, var73);
            }
        }
        finally {
            module0147.$g2096$.rebind(var78, var73);
            module0147.$g2094$.rebind(var77, var73);
            module0147.$g2095$.rebind(var76, var73);
        }
        return Sort.sort(module0077.f5312(var74), Symbols.symbol_function((SubLObject)module0211.$ic78$), Symbols.symbol_function((SubLObject)module0211.$ic79$));
    }
    
    public static SubLObject f13730() {
        final SubLThread var66 = SubLProcess.currentSubLThread();
        final SubLObject var67 = module0077.f5313(Symbols.symbol_function((SubLObject)module0211.EQL), (SubLObject)module0211.UNPROVIDED);
        final SubLObject var68 = module0147.$g2094$.currentBinding(var66);
        final SubLObject var69 = module0147.$g2095$.currentBinding(var66);
        try {
            module0147.$g2094$.bind((SubLObject)module0211.$ic41$, var66);
            module0147.$g2095$.bind(module0211.$ic42$, var66);
            final SubLObject var70 = (SubLObject)module0211.$ic99$;
            final SubLObject var71 = oc_assertions_low.f11226();
            SubLObject var72 = (SubLObject)module0211.ZERO_INTEGER;
            final SubLObject var68_254 = module0012.$g75$.currentBinding(var66);
            final SubLObject var69_255 = module0012.$g76$.currentBinding(var66);
            final SubLObject var73 = module0012.$g77$.currentBinding(var66);
            final SubLObject var74 = module0012.$g78$.currentBinding(var66);
            try {
                module0012.$g75$.bind((SubLObject)module0211.ZERO_INTEGER, var66);
                module0012.$g76$.bind((SubLObject)module0211.NIL, var66);
                module0012.$g77$.bind((SubLObject)module0211.T, var66);
                module0012.$g78$.bind(Time.get_universal_time(), var66);
                module0012.f478(var70);
                final SubLObject var75 = module0031.f1696(oc_assertions_low.f11224());
                final SubLObject var76 = (SubLObject)module0211.NIL;
                SubLObject var77;
                SubLObject var78;
                SubLObject var79;
                SubLObject var80;
                for (var77 = Sequences.length(var75), var78 = (SubLObject)module0211.NIL, var78 = (SubLObject)module0211.ZERO_INTEGER; var78.numL(var77); var78 = Numbers.add(var78, (SubLObject)module0211.ONE_INTEGER)) {
                    var79 = ((module0211.NIL != var76) ? Numbers.subtract(var77, var78, (SubLObject)module0211.ONE_INTEGER) : var78);
                    var80 = Vectors.aref(var75, var79);
                    if (module0211.NIL != module0031.f1697(var80)) {
                        var72 = Numbers.add(var72, (SubLObject)module0211.ONE_INTEGER);
                        module0012.note_percent_progress(var72, var71);
                        if (module0211.NIL != f13731(var80)) {
                            module0077.f5326(var80, var67);
                        }
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var74, var66);
                module0012.$g77$.rebind(var73, var66);
                module0012.$g76$.rebind(var69_255, var66);
                module0012.$g75$.rebind(var68_254, var66);
            }
        }
        finally {
            module0147.$g2095$.rebind(var69, var66);
            module0147.$g2094$.rebind(var68, var66);
        }
        return Sort.sort(module0077.f5312(var67), Symbols.symbol_function((SubLObject)module0211.$ic78$), Symbols.symbol_function((SubLObject)module0211.$ic79$));
    }
    
    public static SubLObject f13731(final SubLObject var155) {
        if (module0211.NIL != module0178.f11290(var155)) {
            final SubLObject var156 = module0178.f11282(var155);
            SubLObject var157 = module0232.f15306(var156);
            SubLObject var158 = (SubLObject)module0211.NIL;
            var158 = var157.first();
            while (module0211.NIL != var157) {
                if (module0211.NIL != module0202.f12589(var158, module0211.$ic100$)) {
                    return var158;
                }
                var157 = var157.rest();
                var158 = var157.first();
            }
            var157 = module0232.f15308(var156);
            SubLObject var159 = (SubLObject)module0211.NIL;
            var159 = var157.first();
            while (module0211.NIL != var157) {
                if (module0211.NIL != module0202.f12589(var159, module0211.$ic100$)) {
                    return var159;
                }
                var157 = var157.rest();
                var159 = var157.first();
            }
        }
        return (SubLObject)module0211.NIL;
    }
    
    public static SubLObject f13732(final SubLObject var155) {
        assert module0211.NIL != module0178.f11290(var155) : var155;
        if (module0211.NIL == module0178.f11324(var155)) {
            final SubLObject var156 = module0178.f11282(var155);
            final SubLObject var157 = module0178.f11294(var155);
            SubLObject var158 = (SubLObject)module0211.NIL;
            SubLObject var159 = (SubLObject)module0211.NIL;
            SubLObject var160 = (SubLObject)module0211.NIL;
            var158 = var157;
            var159 = var158.first();
            for (var160 = (SubLObject)module0211.ZERO_INTEGER; module0211.NIL != var158; var158 = var158.rest(), var159 = var158.first(), var160 = Numbers.add((SubLObject)module0211.ONE_INTEGER, var160)) {
                final SubLObject var161 = module0193.f12079(var160);
                if (module0211.ONE_INTEGER.numE(module0035.f2448(var161, var156)) && module0211.NIL == module0038.f2684(var159, (SubLObject)module0211.$ic102$)) {
                    return var161;
                }
            }
        }
        return (SubLObject)module0211.NIL;
    }
    
    public static SubLObject f13733(final SubLObject var155) {
        assert module0211.NIL != module0178.f11290(var155) : var155;
        if (module0211.NIL == module0178.f11324(var155)) {
            final SubLObject var156 = module0178.f11282(var155);
            final SubLObject var157 = module0178.f11294(var155);
            SubLObject var158 = (SubLObject)module0211.NIL;
            SubLObject var159 = (SubLObject)module0211.NIL;
            SubLObject var160 = (SubLObject)module0211.NIL;
            SubLObject var161 = (SubLObject)module0211.NIL;
            var159 = var157;
            var160 = var159.first();
            for (var161 = (SubLObject)module0211.ZERO_INTEGER; module0211.NIL != var159; var159 = var159.rest(), var160 = var159.first(), var161 = Numbers.add((SubLObject)module0211.ONE_INTEGER, var161)) {
                final SubLObject var162 = module0193.f12079(var161);
                if (module0211.ONE_INTEGER.numE(module0035.f2448(var162, var156)) && module0211.NIL == module0038.f2684(var160, (SubLObject)module0211.$ic102$)) {
                    var158 = (SubLObject)ConsesLow.cons(var162, var158);
                }
            }
            return Sequences.nreverse(var158);
        }
        return (SubLObject)module0211.NIL;
    }
    
    public static SubLObject f13734(final SubLObject var35) {
        return Equality.eql(var35, assertion_handles_oc.f11053(assertion_handles_oc.f11025(var35)));
    }
    
    public static SubLObject f13735(final SubLObject var35, SubLObject var262, SubLObject var263) {
        if (var262 == module0211.UNPROVIDED) {
            var262 = (SubLObject)module0211.NIL;
        }
        if (var263 == module0211.UNPROVIDED) {
            var263 = (SubLObject)module0211.NIL;
        }
        final SubLObject var264 = (module0211.NIL != var262) ? module0205.f13183(var35, (SubLObject)module0211.$ic27$, (SubLObject)module0211.T, (SubLObject)module0211.UNPROVIDED, (SubLObject)module0211.UNPROVIDED, (SubLObject)module0211.UNPROVIDED) : module0205.f13183(module0538.f33367(var35, (SubLObject)module0211.UNPROVIDED), (SubLObject)module0211.$ic27$, var263, (SubLObject)module0211.UNPROVIDED, (SubLObject)module0211.UNPROVIDED, (SubLObject)module0211.UNPROVIDED);
        return var264;
    }
    
    public static SubLObject f13736(final SubLObject var35, SubLObject var262) {
        if (var262 == module0211.UNPROVIDED) {
            var262 = (SubLObject)module0211.NIL;
        }
        SubLObject var264;
        final SubLObject var263 = var264 = f13735(var35, var262, (SubLObject)module0211.UNPROVIDED);
        SubLObject var265 = (SubLObject)module0211.NIL;
        var265 = var264.first();
        while (module0211.NIL != var264) {
            if (module0211.NIL == f13734(var265)) {
                return (SubLObject)module0211.NIL;
            }
            var264 = var264.rest();
            var265 = var264.first();
        }
        return (SubLObject)module0211.T;
    }
    
    public static SubLObject f13737() {
        final SubLThread var66 = SubLProcess.currentSubLThread();
        SubLObject var67 = (SubLObject)module0211.NIL;
        final SubLObject var68 = assertion_handles_oc.f11010();
        final SubLObject var69 = (SubLObject)module0211.$ic103$;
        final SubLObject var70 = module0065.f4733(var68);
        SubLObject var71 = (SubLObject)module0211.ZERO_INTEGER;
        assert module0211.NIL != Types.stringp(var69) : var69;
        final SubLObject var72 = module0012.$g75$.currentBinding(var66);
        final SubLObject var73 = module0012.$g76$.currentBinding(var66);
        final SubLObject var74 = module0012.$g77$.currentBinding(var66);
        final SubLObject var75 = module0012.$g78$.currentBinding(var66);
        try {
            module0012.$g75$.bind((SubLObject)module0211.ZERO_INTEGER, var66);
            module0012.$g76$.bind((SubLObject)module0211.NIL, var66);
            module0012.$g77$.bind((SubLObject)module0211.T, var66);
            module0012.$g78$.bind(Time.get_universal_time(), var66);
            module0012.f478(var69);
            final SubLObject var168_267 = var68;
            if (module0211.NIL == module0065.f4772(var168_267, (SubLObject)module0211.$ic63$)) {
                final SubLObject var170_268 = var168_267;
                if (module0211.NIL == module0065.f4775(var170_268, (SubLObject)module0211.$ic63$)) {
                    final SubLObject var76 = module0065.f4740(var170_268);
                    final SubLObject var77 = (SubLObject)module0211.NIL;
                    SubLObject var78;
                    SubLObject var79;
                    SubLObject var80;
                    SubLObject var81;
                    for (var78 = Sequences.length(var76), var79 = (SubLObject)module0211.NIL, var79 = (SubLObject)module0211.ZERO_INTEGER; var79.numL(var78); var79 = Numbers.add(var79, (SubLObject)module0211.ONE_INTEGER)) {
                        var80 = ((module0211.NIL != var77) ? Numbers.subtract(var78, var79, (SubLObject)module0211.ONE_INTEGER) : var79);
                        var81 = Vectors.aref(var76, var80);
                        if (module0211.NIL == module0065.f4749(var81) || module0211.NIL == module0065.f4773((SubLObject)module0211.$ic63$)) {
                            if (module0211.NIL != module0065.f4749(var81)) {
                                var81 = (SubLObject)module0211.$ic63$;
                            }
                            module0012.note_percent_progress(var71, var70);
                            var71 = Numbers.add(var71, (SubLObject)module0211.ONE_INTEGER);
                            if (module0211.NIL != f13703(var81) && module0211.NIL == f13736(var81, (SubLObject)module0211.NIL)) {
                                var67 = (SubLObject)ConsesLow.cons(var81, var67);
                            }
                        }
                    }
                }
                final SubLObject var178_269 = var168_267;
                if (module0211.NIL == module0065.f4777(var178_269) || module0211.NIL == module0065.f4773((SubLObject)module0211.$ic63$)) {
                    final SubLObject var82 = module0065.f4738(var178_269);
                    SubLObject var83 = module0065.f4739(var178_269);
                    final SubLObject var84 = module0065.f4734(var178_269);
                    final SubLObject var85 = (SubLObject)((module0211.NIL != module0065.f4773((SubLObject)module0211.$ic63$)) ? module0211.NIL : module0211.$ic63$);
                    while (var83.numL(var84)) {
                        final SubLObject var86 = Hashtables.gethash_without_values(var83, var82, var85);
                        if (module0211.NIL == module0065.f4773((SubLObject)module0211.$ic63$) || module0211.NIL == module0065.f4749(var86)) {
                            module0012.note_percent_progress(var71, var70);
                            var71 = Numbers.add(var71, (SubLObject)module0211.ONE_INTEGER);
                            if (module0211.NIL != f13703(var86) && module0211.NIL == f13736(var86, (SubLObject)module0211.NIL)) {
                                var67 = (SubLObject)ConsesLow.cons(var86, var67);
                            }
                        }
                        var83 = Numbers.add(var83, (SubLObject)module0211.ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var75, var66);
            module0012.$g77$.rebind(var74, var66);
            module0012.$g76$.rebind(var73, var66);
            module0012.$g75$.rebind(var72, var66);
        }
        return Sequences.nreverse(var67);
    }
    
    public static SubLObject f13738(SubLObject var270) {
        if (var270 == module0211.UNPROVIDED) {
            var270 = (SubLObject)module0211.T;
        }
        final SubLThread var271 = SubLProcess.currentSubLThread();
        SubLObject var272 = (SubLObject)module0211.NIL;
        final SubLObject var273 = assertion_handles_oc.f11010();
        final SubLObject var274 = (SubLObject)module0211.$ic104$;
        final SubLObject var275 = module0065.f4733(var273);
        SubLObject var276 = (SubLObject)module0211.ZERO_INTEGER;
        assert module0211.NIL != Types.stringp(var274) : var274;
        final SubLObject var277 = module0012.$g75$.currentBinding(var271);
        final SubLObject var278 = module0012.$g76$.currentBinding(var271);
        final SubLObject var279 = module0012.$g77$.currentBinding(var271);
        final SubLObject var280 = module0012.$g78$.currentBinding(var271);
        try {
            module0012.$g75$.bind((SubLObject)module0211.ZERO_INTEGER, var271);
            module0012.$g76$.bind((SubLObject)module0211.NIL, var271);
            module0012.$g77$.bind((SubLObject)module0211.T, var271);
            module0012.$g78$.bind(Time.get_universal_time(), var271);
            module0012.f478(var274);
            final SubLObject var168_271 = var273;
            if (module0211.NIL == module0065.f4772(var168_271, (SubLObject)module0211.$ic63$)) {
                final SubLObject var170_272 = var168_271;
                if (module0211.NIL == module0065.f4775(var170_272, (SubLObject)module0211.$ic63$)) {
                    final SubLObject var281 = module0065.f4740(var170_272);
                    final SubLObject var282 = (SubLObject)module0211.NIL;
                    SubLObject var283;
                    SubLObject var284;
                    SubLObject var285;
                    SubLObject var286;
                    for (var283 = Sequences.length(var281), var284 = (SubLObject)module0211.NIL, var284 = (SubLObject)module0211.ZERO_INTEGER; var284.numL(var283); var284 = Numbers.add(var284, (SubLObject)module0211.ONE_INTEGER)) {
                        var285 = ((module0211.NIL != var282) ? Numbers.subtract(var283, var284, (SubLObject)module0211.ONE_INTEGER) : var284);
                        var286 = Vectors.aref(var281, var285);
                        if (module0211.NIL == module0065.f4749(var286) || module0211.NIL == module0065.f4773((SubLObject)module0211.$ic63$)) {
                            if (module0211.NIL != module0065.f4749(var286)) {
                                var286 = (SubLObject)module0211.$ic63$;
                            }
                            module0012.note_percent_progress(var276, var275);
                            var276 = Numbers.add(var276, (SubLObject)module0211.ONE_INTEGER);
                            if (module0211.NIL == module0178.f11299(var286)) {
                                if (module0211.NIL != var270) {
                                    print_high.print(var286, (SubLObject)module0211.UNPROVIDED);
                                    streams_high.force_output((SubLObject)module0211.UNPROVIDED);
                                }
                                var272 = (SubLObject)ConsesLow.cons(var286, var272);
                            }
                        }
                    }
                }
                final SubLObject var178_273 = var168_271;
                if (module0211.NIL == module0065.f4777(var178_273) || module0211.NIL == module0065.f4773((SubLObject)module0211.$ic63$)) {
                    final SubLObject var287 = module0065.f4738(var178_273);
                    SubLObject var288 = module0065.f4739(var178_273);
                    final SubLObject var289 = module0065.f4734(var178_273);
                    final SubLObject var290 = (SubLObject)((module0211.NIL != module0065.f4773((SubLObject)module0211.$ic63$)) ? module0211.NIL : module0211.$ic63$);
                    while (var288.numL(var289)) {
                        final SubLObject var291 = Hashtables.gethash_without_values(var288, var287, var290);
                        if (module0211.NIL == module0065.f4773((SubLObject)module0211.$ic63$) || module0211.NIL == module0065.f4749(var291)) {
                            module0012.note_percent_progress(var276, var275);
                            var276 = Numbers.add(var276, (SubLObject)module0211.ONE_INTEGER);
                            if (module0211.NIL == module0178.f11299(var291)) {
                                if (module0211.NIL != var270) {
                                    print_high.print(var291, (SubLObject)module0211.UNPROVIDED);
                                    streams_high.force_output((SubLObject)module0211.UNPROVIDED);
                                }
                                var272 = (SubLObject)ConsesLow.cons(var291, var272);
                            }
                        }
                        var288 = Numbers.add(var288, (SubLObject)module0211.ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var280, var271);
            module0012.$g77$.rebind(var279, var271);
            module0012.$g76$.rebind(var278, var271);
            module0012.$g75$.rebind(var277, var271);
        }
        return Sequences.nreverse(var272);
    }
    
    public static SubLObject f13739() {
        final SubLThread var66 = SubLProcess.currentSubLThread();
        SubLObject var67 = (SubLObject)module0211.ZERO_INTEGER;
        final SubLObject var68 = assertion_handles_oc.f11010();
        final SubLObject var69 = (SubLObject)module0211.$ic105$;
        final SubLObject var70 = module0065.f4733(var68);
        SubLObject var71 = (SubLObject)module0211.ZERO_INTEGER;
        assert module0211.NIL != Types.stringp(var69) : var69;
        final SubLObject var72 = module0012.$g75$.currentBinding(var66);
        final SubLObject var73 = module0012.$g76$.currentBinding(var66);
        final SubLObject var74 = module0012.$g77$.currentBinding(var66);
        final SubLObject var75 = module0012.$g78$.currentBinding(var66);
        try {
            module0012.$g75$.bind((SubLObject)module0211.ZERO_INTEGER, var66);
            module0012.$g76$.bind((SubLObject)module0211.NIL, var66);
            module0012.$g77$.bind((SubLObject)module0211.T, var66);
            module0012.$g78$.bind(Time.get_universal_time(), var66);
            module0012.f478(var69);
            final SubLObject var168_274 = var68;
            if (module0211.NIL == module0065.f4772(var168_274, (SubLObject)module0211.$ic63$)) {
                final SubLObject var170_275 = var168_274;
                if (module0211.NIL == module0065.f4775(var170_275, (SubLObject)module0211.$ic63$)) {
                    final SubLObject var76 = module0065.f4740(var170_275);
                    final SubLObject var77 = (SubLObject)module0211.NIL;
                    SubLObject var78;
                    SubLObject var79;
                    SubLObject var80;
                    SubLObject var81;
                    for (var78 = Sequences.length(var76), var79 = (SubLObject)module0211.NIL, var79 = (SubLObject)module0211.ZERO_INTEGER; var79.numL(var78); var79 = Numbers.add(var79, (SubLObject)module0211.ONE_INTEGER)) {
                        var80 = ((module0211.NIL != var77) ? Numbers.subtract(var78, var79, (SubLObject)module0211.ONE_INTEGER) : var79);
                        var81 = Vectors.aref(var76, var80);
                        if (module0211.NIL == module0065.f4749(var81) || module0211.NIL == module0065.f4773((SubLObject)module0211.$ic63$)) {
                            if (module0211.NIL != module0065.f4749(var81)) {
                                var81 = (SubLObject)module0211.$ic63$;
                            }
                            module0012.note_percent_progress(var71, var70);
                            var71 = Numbers.add(var71, (SubLObject)module0211.ONE_INTEGER);
                            if (module0211.NIL != f13740(var81)) {
                                var67 = Numbers.add(var67, (SubLObject)module0211.ONE_INTEGER);
                            }
                        }
                    }
                }
                final SubLObject var178_276 = var168_274;
                if (module0211.NIL == module0065.f4777(var178_276) || module0211.NIL == module0065.f4773((SubLObject)module0211.$ic63$)) {
                    final SubLObject var82 = module0065.f4738(var178_276);
                    SubLObject var83 = module0065.f4739(var178_276);
                    final SubLObject var84 = module0065.f4734(var178_276);
                    final SubLObject var85 = (SubLObject)((module0211.NIL != module0065.f4773((SubLObject)module0211.$ic63$)) ? module0211.NIL : module0211.$ic63$);
                    while (var83.numL(var84)) {
                        final SubLObject var86 = Hashtables.gethash_without_values(var83, var82, var85);
                        if (module0211.NIL == module0065.f4773((SubLObject)module0211.$ic63$) || module0211.NIL == module0065.f4749(var86)) {
                            module0012.note_percent_progress(var71, var70);
                            var71 = Numbers.add(var71, (SubLObject)module0211.ONE_INTEGER);
                            if (module0211.NIL != f13740(var86)) {
                                var67 = Numbers.add(var67, (SubLObject)module0211.ONE_INTEGER);
                            }
                        }
                        var83 = Numbers.add(var83, (SubLObject)module0211.ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var75, var66);
            module0012.$g77$.rebind(var74, var66);
            module0012.$g76$.rebind(var73, var66);
            module0012.$g75$.rebind(var72, var66);
        }
        return var67;
    }
    
    public static SubLObject f13741() {
        final SubLThread var66 = SubLProcess.currentSubLThread();
        SubLObject var67 = (SubLObject)module0211.NIL;
        final SubLObject var68 = assertion_handles_oc.f11010();
        final SubLObject var69 = (SubLObject)module0211.$ic105$;
        final SubLObject var70 = module0065.f4733(var68);
        SubLObject var71 = (SubLObject)module0211.ZERO_INTEGER;
        assert module0211.NIL != Types.stringp(var69) : var69;
        final SubLObject var72 = module0012.$g75$.currentBinding(var66);
        final SubLObject var73 = module0012.$g76$.currentBinding(var66);
        final SubLObject var74 = module0012.$g77$.currentBinding(var66);
        final SubLObject var75 = module0012.$g78$.currentBinding(var66);
        try {
            module0012.$g75$.bind((SubLObject)module0211.ZERO_INTEGER, var66);
            module0012.$g76$.bind((SubLObject)module0211.NIL, var66);
            module0012.$g77$.bind((SubLObject)module0211.T, var66);
            module0012.$g78$.bind(Time.get_universal_time(), var66);
            module0012.f478(var69);
            final SubLObject var168_277 = var68;
            if (module0211.NIL == module0065.f4772(var168_277, (SubLObject)module0211.$ic63$)) {
                final SubLObject var170_278 = var168_277;
                if (module0211.NIL == module0065.f4775(var170_278, (SubLObject)module0211.$ic63$)) {
                    final SubLObject var76 = module0065.f4740(var170_278);
                    final SubLObject var77 = (SubLObject)module0211.NIL;
                    SubLObject var78;
                    SubLObject var79;
                    SubLObject var80;
                    SubLObject var81;
                    for (var78 = Sequences.length(var76), var79 = (SubLObject)module0211.NIL, var79 = (SubLObject)module0211.ZERO_INTEGER; var79.numL(var78); var79 = Numbers.add(var79, (SubLObject)module0211.ONE_INTEGER)) {
                        var80 = ((module0211.NIL != var77) ? Numbers.subtract(var78, var79, (SubLObject)module0211.ONE_INTEGER) : var79);
                        var81 = Vectors.aref(var76, var80);
                        if (module0211.NIL == module0065.f4749(var81) || module0211.NIL == module0065.f4773((SubLObject)module0211.$ic63$)) {
                            if (module0211.NIL != module0065.f4749(var81)) {
                                var81 = (SubLObject)module0211.$ic63$;
                            }
                            module0012.note_percent_progress(var71, var70);
                            var71 = Numbers.add(var71, (SubLObject)module0211.ONE_INTEGER);
                            if (module0211.NIL != f13740(var81)) {
                                var67 = (SubLObject)ConsesLow.cons(var81, var67);
                            }
                        }
                    }
                }
                final SubLObject var178_279 = var168_277;
                if (module0211.NIL == module0065.f4777(var178_279) || module0211.NIL == module0065.f4773((SubLObject)module0211.$ic63$)) {
                    final SubLObject var82 = module0065.f4738(var178_279);
                    SubLObject var83 = module0065.f4739(var178_279);
                    final SubLObject var84 = module0065.f4734(var178_279);
                    final SubLObject var85 = (SubLObject)((module0211.NIL != module0065.f4773((SubLObject)module0211.$ic63$)) ? module0211.NIL : module0211.$ic63$);
                    while (var83.numL(var84)) {
                        final SubLObject var86 = Hashtables.gethash_without_values(var83, var82, var85);
                        if (module0211.NIL == module0065.f4773((SubLObject)module0211.$ic63$) || module0211.NIL == module0065.f4749(var86)) {
                            module0012.note_percent_progress(var71, var70);
                            var71 = Numbers.add(var71, (SubLObject)module0211.ONE_INTEGER);
                            if (module0211.NIL != f13740(var86)) {
                                var67 = (SubLObject)ConsesLow.cons(var86, var67);
                            }
                        }
                        var83 = Numbers.add(var83, (SubLObject)module0211.ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var75, var66);
            module0012.$g77$.rebind(var74, var66);
            module0012.$g76$.rebind(var73, var66);
            module0012.$g75$.rebind(var72, var66);
        }
        return Sequences.nreverse(var67);
    }
    
    public static SubLObject f13740(final SubLObject var122) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0211.NIL == module0206.f13425(module0538.f33367(var122, (SubLObject)module0211.UNPROVIDED)));
    }
    
    public static SubLObject f13742(final SubLObject var35) {
        final SubLThread var36 = SubLProcess.currentSubLThread();
        SubLObject var37 = (SubLObject)module0211.NIL;
        SubLObject var38 = (SubLObject)module0211.NIL;
        final SubLObject var39 = module0211.$g2341$.currentBinding(var36);
        final SubLObject var40 = module0211.$g2342$.currentBinding(var36);
        try {
            module0211.$g2341$.bind((SubLObject)module0211.$ic106$, var36);
            module0211.$g2342$.bind(Numbers.$most_positive_fixnum$.getGlobalValue(), var36);
            module0205.f13230(Symbols.symbol_function((SubLObject)module0211.$ic107$), var35, (SubLObject)module0211.UNPROVIDED, (SubLObject)module0211.UNPROVIDED);
            var37 = module0211.$g2341$.getDynamicValue(var36);
            var38 = module0211.$g2342$.getDynamicValue(var36);
        }
        finally {
            module0211.$g2342$.rebind(var40, var36);
            module0211.$g2341$.rebind(var39, var36);
        }
        return Values.values(var37, var38);
    }
    
    public static SubLObject f13743(final SubLObject var35) {
        final SubLThread var36 = SubLProcess.currentSubLThread();
        var36.resetMultipleValues();
        final SubLObject var37 = f13742(var35);
        final SubLObject var38 = var36.secondMultipleValue();
        var36.resetMultipleValues();
        return Values.values(var38, var37);
    }
    
    public static SubLObject f13744(SubLObject var134) {
        final SubLThread var135 = SubLProcess.currentSubLThread();
        final SubLObject var137;
        final SubLObject var136 = var137 = module0034.f1854((SubLObject)module0211.UNPROVIDED, (SubLObject)module0211.UNPROVIDED, (SubLObject)module0211.UNPROVIDED, (SubLObject)module0211.UNPROVIDED);
        final SubLObject var138 = module0034.$g879$.currentBinding(var135);
        try {
            module0034.$g879$.bind(var137, var135);
            SubLObject var139 = (SubLObject)module0211.NIL;
            if (module0211.NIL != var137 && module0211.NIL == module0034.f1842(var137)) {
                var139 = module0034.f1869(var137);
                final SubLObject var140 = Threads.current_process();
                if (module0211.NIL == var139) {
                    module0034.f1873(var137, var140);
                }
                else if (!var139.eql(var140)) {
                    Errors.error((SubLObject)module0211.$ic108$);
                }
            }
            try {
                var134 = Sort.stable_sort(var134, Symbols.symbol_function((SubLObject)module0211.$ic78$), Symbols.symbol_function((SubLObject)module0211.$ic109$));
            }
            finally {
                final SubLObject var68_284 = Threads.$is_thread_performing_cleanupP$.currentBinding(var135);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0211.T, var135);
                    if (module0211.NIL != var137 && module0211.NIL == var139) {
                        module0034.f1873(var137, (SubLObject)module0211.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var68_284, var135);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var138, var135);
        }
        return var134;
    }
    
    public static SubLObject f13745(final SubLObject var59) {
        final SubLThread var60 = SubLProcess.currentSubLThread();
        if (module0211.NIL != module0212.f13762(var59)) {
            final SubLObject var61 = module0217.f14357(var59);
            if (var61.numL(module0211.$g2342$.getDynamicValue(var60))) {
                module0211.$g2341$.setDynamicValue(var59, var60);
                module0211.$g2342$.setDynamicValue(var61, var60);
            }
        }
        return (SubLObject)module0211.NIL;
    }
    
    public static SubLObject f13746(final SubLObject var35) {
        return f13743(var35);
    }
    
    public static SubLObject f13747(final SubLObject var35) {
        final SubLThread var36 = SubLProcess.currentSubLThread();
        final SubLObject var37 = module0034.$g879$.getDynamicValue(var36);
        SubLObject var38 = (SubLObject)module0211.NIL;
        if (module0211.NIL == var37) {
            return f13746(var35);
        }
        var38 = module0034.f1857(var37, (SubLObject)module0211.$ic109$, (SubLObject)module0211.UNPROVIDED);
        if (module0211.NIL == var38) {
            var38 = module0034.f1807(module0034.f1842(var37), (SubLObject)module0211.$ic109$, (SubLObject)module0211.ONE_INTEGER, (SubLObject)module0211.NIL, (SubLObject)module0211.EQL, (SubLObject)module0211.UNPROVIDED);
            module0034.f1860(var37, (SubLObject)module0211.$ic109$, var38);
        }
        SubLObject var39 = module0034.f1814(var38, var35, (SubLObject)module0211.$ic87$);
        if (var39 == module0211.$ic87$) {
            var39 = Values.arg2(var36.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f13746(var35)));
            module0034.f1816(var38, var35, var39, (SubLObject)module0211.UNPROVIDED);
        }
        return module0034.f1959(var39);
    }
    
    public static SubLObject f13748() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0211", "f13628", "S#14088");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0211", "f13629", "S#16457");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0211", "f13630", "S#16458");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0211", "f13631", "S#16459");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13632", "S#16460", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13633", "S#16461", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13634", "S#16462", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13635", "S#16463", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13636", "S#14091", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13637", "UNKNOWN-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13638", "S#16464", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13639", "S#16465", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13640", "S#16466", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13641", "S#12748", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13642", "S#16467", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13643", "S#16468", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13644", "S#16469", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13645", "S#12746", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13646", "S#12752", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13647", "S#12751", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13648", "S#16470", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13649", "S#14571", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13650", "S#12749", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13651", "S#16471", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13652", "S#16472", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13653", "S#16473", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13654", "S#16474", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13655", "S#16475", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13656", "S#16476", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13657", "S#16477", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13658", "S#16478", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13659", "S#16479", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13660", "S#16480", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13661", "S#16481", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13662", "S#16482", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13663", "S#12740", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13664", "S#16483", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13665", "S#16484", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13666", "S#16485", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13667", "S#16486", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13668", "S#16487", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13669", "S#16488", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13671", "S#16489", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13670", "S#16490", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13672", "S#16491", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13673", "S#16492", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13674", "S#16493", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13675", "S#16494", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13676", "S#16495", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13677", "S#16496", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13678", "RULES-MENTIONING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13679", "S#16497", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13680", "S#16498", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13681", "S#16499", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13682", "S#16500", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13683", "S#16501", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13684", "S#16502", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13685", "S#16503", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13686", "S#16504", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13687", "S#16505", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13689", "S#16506", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13688", "S#16507", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13690", "S#16508", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13691", "S#16509", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13692", "S#16510", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13693", "S#16511", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13694", "S#16512", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13695", "S#16513", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13696", "S#16514", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13697", "S#16515", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13699", "S#16516", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13698", "S#16517", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13700", "ASSERTION-HAS-META-ASSERTIONS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13701", "S#16518", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13702", "S#16519", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13703", "S#16520", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13704", "S#16521", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13705", "S#16522", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13706", "S#16523", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13707", "S#16524", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13708", "S#16525", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13709", "S#16526", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13710", "S#16527", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13711", "S#16528", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13713", "S#16529", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13714", "S#16530", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13715", "S#16531", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13712", "S#16532", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13716", "S#16533", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13718", "S#16534", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13719", "S#16535", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13720", "S#16536", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13717", "S#16537", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13721", "S#16538", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13723", "S#16539", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13724", "S#16540", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13722", "S#16541", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13725", "S#16542", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13726", "S#16543", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13727", "S#16544", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13728", "S#16545", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13729", "S#16546", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13730", "S#16547", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13731", "S#16548", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13732", "S#16549", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13733", "S#16550", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13734", "S#16551", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13735", "S#16552", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13736", "S#16553", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13737", "S#16554", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13738", "S#16555", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13739", "S#16556", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13741", "S#16557", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13740", "S#16558", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13742", "S#16559", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13743", "S#16560", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13744", "S#16561", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13745", "S#16562", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13746", "S#16563", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0211", "f13747", "S#16564", 1, 0, false);
        return (SubLObject)module0211.NIL;
    }
    
    public static SubLObject f13749() {
        module0211.$g2331$ = SubLFiles.deflexical("S#16565", (SubLObject)module0211.$ic47$);
        module0211.$g2332$ = SubLFiles.defparameter("S#16566", (SubLObject)module0211.NIL);
        module0211.$g2333$ = SubLFiles.defparameter("S#16567", (SubLObject)module0211.NIL);
        module0211.$g2334$ = SubLFiles.defparameter("S#16568", (SubLObject)module0211.NIL);
        module0211.$g2335$ = SubLFiles.deflexical("S#16569", (SubLObject)module0211.NIL);
        module0211.$g2336$ = SubLFiles.deflexical("S#16570", (SubLObject)module0211.NIL);
        module0211.$g2337$ = SubLFiles.defparameter("S#16571", (SubLObject)module0211.NIL);
        module0211.$g2338$ = SubLFiles.defparameter("S#16572", (SubLObject)module0211.NIL);
        module0211.$g2339$ = SubLFiles.defparameter("S#16573", (SubLObject)module0211.NIL);
        module0211.$g2340$ = SubLFiles.defparameter("S#16574", (SubLObject)module0211.NIL);
        module0211.$g2341$ = SubLFiles.defparameter("S#16575", (SubLObject)module0211.NIL);
        module0211.$g2342$ = SubLFiles.defparameter("S#16576", (SubLObject)module0211.NIL);
        return (SubLObject)module0211.NIL;
    }
    
    public static SubLObject f13750() {
        module0012.f368((SubLObject)module0211.$ic66$, (SubLObject)module0211.$ic67$, (SubLObject)module0211.$ic68$, (SubLObject)module0211.$ic69$, (SubLObject)module0211.$ic70$);
        module0034.f1909((SubLObject)module0211.$ic85$);
        module0034.f1909((SubLObject)module0211.$ic88$);
        module0034.f1895((SubLObject)module0211.$ic109$);
        return (SubLObject)module0211.NIL;
    }
    
    public void declareFunctions() {
        f13748();
    }
    
    public void initializeVariables() {
        f13749();
    }
    
    public void runTopLevelForms() {
        f13750();
    }
    
    static {
        me = (SubLFile)new module0211();
        module0211.$g2331$ = null;
        module0211.$g2332$ = null;
        module0211.$g2333$ = null;
        module0211.$g2334$ = null;
        module0211.$g2335$ = null;
        module0211.$g2336$ = null;
        module0211.$g2337$ = null;
        module0211.$g2338$ = null;
        module0211.$g2339$ = null;
        module0211.$g2340$ = null;
        module0211.$g2341$ = null;
        module0211.$g2342$ = null;
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#16577", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#130", "CYC"), (SubLObject)SubLObjectFactory.makeString("mapping Cyc rules")), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic1$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic2$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic3$ = SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE");
        $ic4$ = SubLObjectFactory.makeString("mapping Cyc rules");
        $ic5$ = SubLObjectFactory.makeKeyword("DONE");
        $ic6$ = SubLObjectFactory.makeSymbol("S#2934", "CYC");
        $ic7$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14027", "CYC"));
        $ic8$ = SubLObjectFactory.makeUninternedSymbol("US#7028EF8");
        $ic9$ = SubLObjectFactory.makeUninternedSymbol("US#13E86D7");
        $ic10$ = SubLObjectFactory.makeUninternedSymbol("US#53EB1D3");
        $ic11$ = SubLObjectFactory.makeSymbol("CLET");
        $ic12$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14028", "CYC")));
        $ic13$ = ConsesLow.list((SubLObject)module0211.ZERO_INTEGER);
        $ic14$ = SubLObjectFactory.makeSymbol("NOTING-PERCENT-PROGRESS");
        $ic15$ = SubLObjectFactory.makeSymbol("S#14088", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("CINC");
        $ic17$ = SubLObjectFactory.makeSymbol("NOTE-PERCENT-PROGRESS");
        $ic18$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#16578", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#130", "CYC"), (SubLObject)SubLObjectFactory.makeString("mapping Cyc GAFs")), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic19$ = SubLObjectFactory.makeString("mapping Cyc GAFs");
        $ic20$ = SubLObjectFactory.makeSymbol("DO-ASSERTIONS");
        $ic21$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic22$ = SubLObjectFactory.makeSymbol("S#11995", "CYC");
        $ic23$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#16579", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic24$ = SubLObjectFactory.makeUninternedSymbol("US#230379");
        $ic25$ = SubLObjectFactory.makeSymbol("S#14113", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("DEDUCTION-ASSERTION");
        $ic27$ = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $ic28$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#16580", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic29$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic30$ = SubLObjectFactory.makeUninternedSymbol("US#69B6E12");
        $ic31$ = SubLObjectFactory.makeSymbol("S#14112", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("DEDUCTION-P");
        $ic33$ = SubLObjectFactory.makeSymbol("S#14572", "CYC");
        $ic34$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic35$ = SubLObjectFactory.makeKeyword("FALSE");
        $ic36$ = SubLObjectFactory.makeKeyword("UNKNOWN");
        $ic37$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("NLSemanticPredicate"));
        $ic38$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic39$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic40$ = SubLObjectFactory.makeSymbol("S#16477", "CYC");
        $ic41$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic42$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic43$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("exceptMt"));
        $ic44$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("except"));
        $ic45$ = SubLObjectFactory.makeSymbol("SUPPORT-P");
        $ic46$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("assertedMoreSpecifically"));
        $ic47$ = SubLObjectFactory.makeInteger(30);
        $ic48$ = SubLObjectFactory.makeSymbol("S#16489", "CYC");
        $ic49$ = SubLObjectFactory.makeSymbol("S#16491", "CYC");
        $ic50$ = SubLObjectFactory.makeInteger(10000);
        $ic51$ = SubLObjectFactory.makeKeyword("GAF");
        $ic52$ = SubLObjectFactory.makeKeyword("RULE");
        $ic53$ = SubLObjectFactory.makeSymbol("ASSERTED-WHEN");
        $ic54$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic55$ = SubLObjectFactory.makeSymbol("ASSERTED-SECOND");
        $ic56$ = SubLObjectFactory.makeSymbol("S#14106", "CYC");
        $ic57$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("knownSentence"));
        $ic58$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("unknownSentence"));
        $ic59$ = SubLObjectFactory.makeSymbol("FORWARD-ASSERTION?");
        $ic60$ = SubLObjectFactory.makeSymbol("S#14169", "CYC");
        $ic61$ = SubLObjectFactory.makeString("Sorting newest constants : Part 2");
        $ic62$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic63$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic64$ = SubLObjectFactory.makeString("Computing newest constants");
        $ic65$ = SubLObjectFactory.makeString("Sorting newest constants : Part 1");
        $ic66$ = SubLObjectFactory.makeSymbol("ASSERTION-HAS-META-ASSERTIONS?");
        $ic67$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION", "CYC"));
        $ic68$ = SubLObjectFactory.makeString("Return T iff ASSERTION has some meta-assertions.");
        $ic69$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-P")));
        $ic70$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $ic71$ = SubLObjectFactory.makeSymbol("S#16518", "CYC");
        $ic72$ = SubLObjectFactory.makeSymbol("S#16520", "CYC");
        $ic73$ = SubLObjectFactory.makeSymbol("S#12263", "CYC");
        $ic74$ = SubLObjectFactory.makeSymbol("S#16460", "CYC");
        $ic75$ = SubLObjectFactory.makeSymbol("ASSERTION-MT");
        $ic76$ = SubLObjectFactory.makeSymbol("S#3846", "CYC");
        $ic77$ = SubLObjectFactory.makeSymbol("S#16581", "CYC");
        $ic78$ = SubLObjectFactory.makeSymbol("<");
        $ic79$ = SubLObjectFactory.makeSymbol("ASSERTION-ID");
        $ic80$ = SubLObjectFactory.makeSymbol("GAF-PREDICATE");
        $ic81$ = SubLObjectFactory.makeSymbol("GAF-ARG1");
        $ic82$ = SubLObjectFactory.makeSymbol("S#15757", "CYC");
        $ic83$ = SubLObjectFactory.makeString("Type constraint: Mt should be canonical ~a, but isn't ~a");
        $ic84$ = SubLObjectFactory.makeString("Expected a single DNF clause of constraints for ~a but got more than one: ~a");
        $ic85$ = SubLObjectFactory.makeSymbol("S#16532", "CYC");
        $ic86$ = SubLObjectFactory.makeSymbol("S#16569", "CYC");
        $ic87$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic88$ = SubLObjectFactory.makeSymbol("S#16537", "CYC");
        $ic89$ = SubLObjectFactory.makeSymbol("S#16570", "CYC");
        $ic90$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic91$ = SubLObjectFactory.makeSymbol(">");
        $ic92$ = SubLObjectFactory.makeSymbol("S#747", "CYC");
        $ic93$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ARGUMENT*"), (SubLObject)SubLObjectFactory.makeKeyword("DEPENDENT*"));
        $ic94$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("trueRule"));
        $ic95$ = SubLObjectFactory.makeKeyword("ARGUMENT*");
        $ic96$ = SubLObjectFactory.makeKeyword("DEPENDENT*");
        $ic97$ = SubLObjectFactory.makeString("gathering exception rules");
        $ic98$ = SubLObjectFactory.makeString("gathering pragma rules");
        $ic99$ = SubLObjectFactory.makeString("gathering lifting rules");
        $ic100$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ist"));
        $ic101$ = SubLObjectFactory.makeSymbol("S#12732", "CYC");
        $ic102$ = SubLObjectFactory.makeString("??");
        $ic103$ = SubLObjectFactory.makeString("Verifying that all embedded assertions are findable via ID");
        $ic104$ = SubLObjectFactory.makeString("Looking for assertions with no arguments");
        $ic105$ = SubLObjectFactory.makeString("mapping Cyc assertions");
        $ic106$ = SubLObjectFactory.makeKeyword("UNSPECIFIED");
        $ic107$ = SubLObjectFactory.makeSymbol("S#16562", "CYC");
        $ic108$ = SubLObjectFactory.makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic109$ = SubLObjectFactory.makeSymbol("S#16564", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0211.class
	Total time: 990 ms
	
	Decompiled with Procyon 0.5.32.
*/