package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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

public final class module0178 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0178";
    public static final String myFingerPrint = "499095bdf54005f78f8a1fe6335384dba9771e180f9f286f5ddd92fcb8d3fa75";
    private static SubLSymbol $g2209$;
    private static SubLSymbol $g2210$;
    public static SubLSymbol $g2211$;
    private static final SubLList $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLString $ic24$;
    private static final SubLList $ic25$;
    private static final SubLList $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLString $ic28$;
    private static final SubLList $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLString $ic31$;
    private static final SubLList $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLString $ic34$;
    private static final SubLList $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLString $ic37$;
    private static final SubLList $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLString $ic40$;
    private static final SubLList $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLString $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLString $ic45$;
    private static final SubLList $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLString $ic48$;
    private static final SubLList $ic49$;
    private static final SubLObject $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLString $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLList $ic55$;
    private static final SubLString $ic56$;
    private static final SubLList $ic57$;
    private static final SubLList $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLString $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLList $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLString $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLString $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLString $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLString $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLString $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLString $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLString $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLList $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLString $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLString $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLString $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLList $ic96$;
    private static final SubLString $ic97$;
    private static final SubLList $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLString $ic100$;
    private static final SubLInteger $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLList $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLList $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLString $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLList $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLString $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLString $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLString $ic139$;
    private static final SubLList $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLString $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLInteger $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLList $ic146$;
    private static final SubLList $ic147$;
    
    public static SubLObject f11279(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0178.$ic0$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0178.NIL;
        SubLObject var7 = (SubLObject)module0178.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0178.$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0178.$ic0$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)module0178.NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)module0178.NIL;
        SubLObject var11_12 = (SubLObject)module0178.NIL;
        while (module0178.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0178.$ic0$);
            var11_12 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0178.$ic0$);
            if (module0178.NIL == conses_high.member(var11_12, (SubLObject)module0178.$ic1$, (SubLObject)module0178.UNPROVIDED, (SubLObject)module0178.UNPROVIDED)) {
                var10 = (SubLObject)module0178.T;
            }
            if (var11_12 == module0178.$ic2$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0178.NIL != var10 && module0178.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0178.$ic0$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0178.$ic3$, var4);
        final SubLObject var12 = (SubLObject)((module0178.NIL != var11) ? conses_high.cadr(var11) : module0178.NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        return (SubLObject)ConsesLow.listS((SubLObject)module0178.$ic4$, (SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)module0178.$ic5$, var7), (SubLObject)module0178.$ic3$, var12), ConsesLow.append(var13, (SubLObject)module0178.NIL));
    }
    
    public static SubLObject f11280(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0178.$ic6$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0178.NIL;
        SubLObject var7 = (SubLObject)module0178.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0178.$ic6$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0178.$ic6$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)module0178.NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)module0178.NIL;
        SubLObject var23_24 = (SubLObject)module0178.NIL;
        while (module0178.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0178.$ic6$);
            var23_24 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0178.$ic6$);
            if (module0178.NIL == conses_high.member(var23_24, (SubLObject)module0178.$ic1$, (SubLObject)module0178.UNPROVIDED, (SubLObject)module0178.UNPROVIDED)) {
                var10 = (SubLObject)module0178.T;
            }
            if (var23_24 == module0178.$ic2$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0178.NIL != var10 && module0178.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0178.$ic6$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0178.$ic3$, var4);
        final SubLObject var12 = (SubLObject)((module0178.NIL != var11) ? conses_high.cadr(var11) : module0178.NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        return (SubLObject)ConsesLow.listS((SubLObject)module0178.$ic7$, (SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)module0178.$ic8$, var7), (SubLObject)module0178.$ic3$, var12), ConsesLow.append(var13, (SubLObject)module0178.NIL));
    }
    
    public static SubLObject f11281(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0178.$ic9$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0178.NIL;
        SubLObject var7 = (SubLObject)module0178.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0178.$ic9$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0178.$ic9$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)module0178.NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)module0178.NIL;
        SubLObject var33_34 = (SubLObject)module0178.NIL;
        while (module0178.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0178.$ic9$);
            var33_34 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0178.$ic9$);
            if (module0178.NIL == conses_high.member(var33_34, (SubLObject)module0178.$ic10$, (SubLObject)module0178.UNPROVIDED, (SubLObject)module0178.UNPROVIDED)) {
                var10 = (SubLObject)module0178.T;
            }
            if (var33_34 == module0178.$ic2$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0178.NIL != var10 && module0178.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0178.$ic9$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0178.$ic11$, var4);
        final SubLObject var12 = (SubLObject)((module0178.NIL != var11) ? conses_high.cadr(var11) : module0178.NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)module0178.$ic12$, var4);
        final SubLObject var14 = (SubLObject)((module0178.NIL != var13) ? conses_high.cadr(var13) : module0178.NIL);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)module0178.$ic3$, var4);
        final SubLObject var16 = (SubLObject)((module0178.NIL != var15) ? conses_high.cadr(var15) : module0178.NIL);
        final SubLObject var17;
        var4 = (var17 = var5);
        if (module0178.NIL != var14) {
            final SubLObject var18 = (SubLObject)module0178.$ic13$;
            return (SubLObject)ConsesLow.list((SubLObject)module0178.$ic14$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var18, var14)), (SubLObject)ConsesLow.list((SubLObject)module0178.$ic15$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)module0178.$ic11$, var12, (SubLObject)module0178.$ic3$, var16), (SubLObject)ConsesLow.listS((SubLObject)module0178.$ic16$, (SubLObject)ConsesLow.list((SubLObject)module0178.EQL, var18, (SubLObject)ConsesLow.list((SubLObject)module0178.$ic17$, var6)), ConsesLow.append(var17, (SubLObject)module0178.NIL))));
        }
        final SubLObject var19 = (SubLObject)module0178.$ic18$;
        final SubLObject var20 = (SubLObject)module0178.$ic19$;
        return (SubLObject)ConsesLow.list((SubLObject)module0178.$ic14$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var20, var7)), (SubLObject)ConsesLow.list((SubLObject)module0178.$ic14$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var19, (SubLObject)ConsesLow.list((SubLObject)module0178.$ic20$, var20))), (SubLObject)ConsesLow.listS((SubLObject)module0178.$ic21$, (SubLObject)ConsesLow.list(var6, var19, (SubLObject)module0178.$ic11$, var12, (SubLObject)module0178.$ic3$, var16), ConsesLow.append(var17, (SubLObject)module0178.NIL))));
    }
    
    public static SubLObject f11282(final SubLObject var7) {
        assert module0178.NIL != module0174.f11035(var7) : var7;
        return (SubLObject)((module0178.NIL != module0174.f11046(var7)) ? module0175.f11061(var7) : module0178.NIL);
    }
    
    public static SubLObject f11283(final SubLObject var7) {
        if (module0178.NIL == module0174.f11046(var7)) {
            return (SubLObject)module0178.NIL;
        }
        if (module0178.NIL != module0211.f13636(var7) && module0178.NIL != f11284(var7)) {
            return module0204.f13034(f11285(var7));
        }
        return module0175.f11061(var7);
    }
    
    public static SubLObject f11286(final SubLObject var7) {
        return (SubLObject)((module0178.NIL != module0174.f11046(var7)) ? module0175.f11062(var7) : module0178.NIL);
    }
    
    public static SubLObject f11287(final SubLObject var7) {
        assert module0178.NIL != module0174.f11035(var7) : var7;
        return (SubLObject)((module0178.NIL != module0174.f11046(var7)) ? module0175.f11063(var7) : module0178.NIL);
    }
    
    public static SubLObject f11288(final SubLObject var7) {
        return (SubLObject)((module0178.NIL != module0174.f11046(var7)) ? module0175.f11067(var7) : module0178.NIL);
    }
    
    public static SubLObject f11289(final SubLObject var7) {
        return (SubLObject)((module0178.NIL != module0174.f11046(var7)) ? module0175.f11068(var7) : module0178.NIL);
    }
    
    public static SubLObject f11284(final SubLObject var7) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0178.NIL != module0174.f11045(var7) && module0178.NIL != module0175.f11065(var7));
    }
    
    public static SubLObject f11290(final SubLObject var7) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0178.NIL != module0174.f11045(var7) && module0178.NIL != module0175.f11066(var7));
    }
    
    public static SubLObject f11291(final SubLObject var7) {
        assert module0178.NIL != module0174.f11035(var7) : var7;
        return (SubLObject)((module0178.NIL != module0174.f11046(var7)) ? module0175.f11069(var7) : module0178.NIL);
    }
    
    public static SubLObject f11292(final SubLObject var7) {
        assert module0178.NIL != module0174.f11035(var7) : var7;
        return (SubLObject)((module0178.NIL != module0174.f11046(var7)) ? module0175.f11070(var7) : module0178.NIL);
    }
    
    public static SubLObject f11293(final SubLObject var7) {
        assert module0178.NIL != module0174.f11035(var7) : var7;
        return (SubLObject)((module0178.NIL != module0174.f11046(var7)) ? module0175.f11071(var7) : module0178.NIL);
    }
    
    public static SubLObject f11294(final SubLObject var7) {
        assert module0178.NIL != module0174.f11035(var7) : var7;
        return (SubLObject)((module0178.NIL != module0174.f11046(var7)) ? module0175.f11072(var7) : module0178.NIL);
    }
    
    public static SubLObject f11295(final SubLObject var7) {
        assert module0178.NIL != module0174.f11035(var7) : var7;
        return (SubLObject)((module0178.NIL != module0174.f11046(var7)) ? module0175.f11073(var7) : module0178.NIL);
    }
    
    public static SubLObject f11296(final SubLObject var7) {
        assert module0178.NIL != module0174.f11035(var7) : var7;
        return (SubLObject)((module0178.NIL != module0174.f11046(var7)) ? module0175.f11074(var7) : module0178.NIL);
    }
    
    public static SubLObject f11297(final SubLObject var7) {
        assert module0178.NIL != module0174.f11035(var7) : var7;
        return (SubLObject)((module0178.NIL != module0174.f11046(var7)) ? module0175.f11075(var7) : module0178.NIL);
    }
    
    public static SubLObject f11298(final SubLObject var7) {
        assert module0178.NIL != module0174.f11035(var7) : var7;
        return (SubLObject)((module0178.NIL != module0174.f11046(var7)) ? module0175.f11076(var7) : module0178.NIL);
    }
    
    public static SubLObject f11299(final SubLObject var7) {
        assert module0178.NIL != module0174.f11035(var7) : var7;
        return (SubLObject)((module0178.NIL != module0174.f11046(var7)) ? module0175.f11090(var7) : module0178.NIL);
    }
    
    public static SubLObject f11300(final SubLObject var7) {
        assert module0178.NIL != module0174.f11035(var7) : var7;
        return (SubLObject)((module0178.NIL != module0174.f11046(var7)) ? module0175.f11099(var7) : module0178.NIL);
    }
    
    public static SubLObject f11301(final SubLObject var7) {
        assert module0178.NIL != module0174.f11035(var7) : var7;
        return (SubLObject)((module0178.NIL != module0174.f11046(var7)) ? module0032.f1753(module0175.f11099(var7)) : module0178.NIL);
    }
    
    public static SubLObject f11302(final SubLObject var7) {
        final SubLObject var8 = f11292(var7);
        final SubLObject var9 = f11293(var7);
        return module0130.f8529(var8, var9);
    }
    
    public static SubLObject f11303(final SubLObject var7) {
        assert module0178.NIL != module0174.f11035(var7) : var7;
        if (module0178.NIL != f11284(var7)) {
            return f11304(var7);
        }
        final SubLObject var8 = f11282(var7);
        if (module0178.NIL != module0232.f15320(var8)) {
            return module0232.f15328(var8, f11292(var7));
        }
        return (SubLObject)module0178.NIL;
    }
    
    public static SubLObject f11305(final SubLObject var7) {
        assert module0178.NIL != module0174.f11035(var7) : var7;
        return (SubLObject)ConsesLow.list(module0178.$ic50$, f11287(var7), f11303(var7));
    }
    
    public static SubLObject f11306(final SubLObject var7) {
        final SubLObject var8 = f11282(var7);
        final SubLObject var9 = f11287(var7);
        final SubLObject var10 = f11291(var7);
        final SubLObject var11 = f11294(var7);
        return module0195.f12200(var8, var9, var10, var11);
    }
    
    public static SubLObject f11307(final SubLObject var7) {
        SubLObject var8 = (SubLObject)module0178.NIL;
        final SubLObject var9 = f11306(var7);
        SubLObject var11;
        final SubLObject var10 = var11 = f11299(var7);
        SubLObject var12 = (SubLObject)module0178.NIL;
        var12 = var11.first();
        while (module0178.NIL != var11) {
            final SubLObject var13 = module0191.f11915(var12);
            final SubLObject var14 = module0195.f12208(var9, var13);
            var8 = (SubLObject)ConsesLow.cons(var14, var8);
            var11 = var11.rest();
            var12 = var11.first();
        }
        return var8;
    }
    
    public static SubLObject f11308(final SubLObject var7, final SubLObject var57) {
        assert module0178.NIL != module0174.f11035(var7) : var7;
        assert module0178.NIL != module0210.f13572(var57) : var57;
        final SubLObject var58 = f11289(var7);
        if (module0178.NIL != module0035.f2428(var57, var58, Symbols.symbol_function((SubLObject)module0178.EQUAL), (SubLObject)module0178.UNPROVIDED)) {
            return (SubLObject)module0178.T;
        }
        final SubLObject var59 = f11287(var7);
        if (module0178.NIL != module0035.f2428(var57, var59, Symbols.symbol_function((SubLObject)module0178.EQUAL), (SubLObject)module0178.UNPROVIDED)) {
            return (SubLObject)module0178.T;
        }
        if (module0178.NIL != module0035.f2439(Symbols.symbol_function((SubLObject)module0178.$ic22$), var58, (SubLObject)module0178.UNPROVIDED)) {
            SubLObject var61;
            final SubLObject var60 = var61 = module0035.f2399(var58, Symbols.symbol_function((SubLObject)module0178.$ic22$), (SubLObject)module0178.UNPROVIDED, (SubLObject)module0178.UNPROVIDED, (SubLObject)module0178.UNPROVIDED);
            SubLObject var62 = (SubLObject)module0178.NIL;
            var62 = var61.first();
            while (module0178.NIL != var61) {
                if (module0178.NIL != f11308(var62, var57)) {
                    return (SubLObject)module0178.T;
                }
                var61 = var61.rest();
                var62 = var61.first();
            }
            return (SubLObject)module0178.NIL;
        }
        return (SubLObject)module0178.NIL;
    }
    
    public static SubLObject f11309(final SubLObject var7, final SubLObject var57) {
        assert module0178.NIL != module0174.f11035(var7) : var7;
        assert module0178.NIL != module0210.f13572(var57) : var57;
        return f11308(var7, var57);
    }
    
    public static SubLObject f11310(final SubLObject var7) {
        return (module0178.NIL != f11284(var7)) ? f11288(var7) : f11282(var7);
    }
    
    public static SubLObject f11311(final SubLObject var7) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0178.NIL != f11290(var7) && module0178.NIL != f11312(var7));
    }
    
    public static SubLObject f11313(final SubLObject var7) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0178.NIL != f11290(var7) && module0178.NIL != f11314(var7));
    }
    
    public static SubLObject f11315(final SubLObject var7) {
        if (module0178.NIL != f11290(var7)) {
            final SubLObject var8 = f11282(var7);
            final SubLObject var9 = Sequences.length(module0232.f15308(var8));
            final SubLObject var10 = Sequences.length(module0232.f15306(var8));
            return Numbers.numE((SubLObject)module0178.ONE_INTEGER, Numbers.add(var9, var10));
        }
        return (SubLObject)module0178.NIL;
    }
    
    public static SubLObject f11316(final SubLObject var7) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0178.NIL != f11284(var7) && module0178.NIL != f11312(var7));
    }
    
    public static SubLObject f11317(final SubLObject var7) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0178.NIL != f11284(var7) && module0178.NIL != f11314(var7));
    }
    
    public static SubLObject f11318(final SubLObject var7) {
        assert module0178.NIL != module0174.f11035(var7) : var7;
        if (module0178.NIL != f11284(var7)) {
            return (SubLObject)module0178.$ic61$;
        }
        if (module0178.NIL != f11290(var7)) {
            return (SubLObject)module0178.$ic62$;
        }
        return (SubLObject)module0178.NIL;
    }
    
    public static SubLObject f11319(final SubLObject var7, final SubLObject var47) {
        return module0161.f10513(var47, f11287(var7));
    }
    
    public static SubLObject f11320(final SubLObject var7, final SubLObject var63) {
        assert module0178.NIL != module0174.f11035(var7) : var7;
        assert module0178.NIL != module0130.f8506(var63) : var63;
        return Equality.eq(var63, f11318(var7));
    }
    
    public static SubLObject f11321(final SubLObject var7, final SubLObject var63) {
        return f11320(var7, var63);
    }
    
    public static SubLObject f11322(final SubLObject var7) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0178.NIL != module0174.f11035(var7) && (module0178.NIL != f11284(var7) || module0178.NIL != module0232.f15311(f11282(var7))));
    }
    
    public static SubLObject f11323(final SubLObject var7) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0178.NIL != module0174.f11035(var7) && (module0178.NIL != f11284(var7) || module0178.NIL != module0232.f15312(f11282(var7))));
    }
    
    public static SubLObject f11324(final SubLObject var7) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0178.NIL != module0174.f11035(var7) && module0178.NIL != module0035.f2439(Symbols.symbol_function((SubLObject)module0178.$ic22$), f11289(var7), (SubLObject)module0178.UNPROVIDED));
    }
    
    public static SubLObject f11325(final SubLObject var7) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0178.NIL != f11290(var7) && module0178.NIL != module0232.f15313(f11282(var7)));
    }
    
    public static SubLObject f11326(final SubLObject var7, SubLObject var64, SubLObject var65, SubLObject var66, SubLObject var67) {
        if (var64 == module0178.UNPROVIDED) {
            var64 = (SubLObject)module0178.T;
        }
        if (var65 == module0178.UNPROVIDED) {
            var65 = (SubLObject)module0178.T;
        }
        if (var66 == module0178.UNPROVIDED) {
            var66 = (SubLObject)module0178.T;
        }
        if (var67 == module0178.UNPROVIDED) {
            var67 = (SubLObject)module0178.T;
        }
        assert module0178.NIL != module0174.f11035(var7) : var7;
        SubLObject var68 = module0205.f13191(f11310(var7), var64, var65, var67);
        if (module0178.NIL != var66) {
            final SubLObject var69 = module0205.f13189(f11287(var7), var64, var65, (SubLObject)module0178.UNPROVIDED);
            var68 = ConsesLow.append(var68, var69);
            if (module0178.NIL != var67) {
                var68 = module0035.f2269(var68, Symbols.symbol_function((SubLObject)module0178.EQL), (SubLObject)module0178.UNPROVIDED, (SubLObject)module0178.UNPROVIDED, (SubLObject)module0178.UNPROVIDED, (SubLObject)module0178.UNPROVIDED);
            }
        }
        return var68;
    }
    
    public static SubLObject f11327(final SubLObject var7) {
        assert module0178.NIL != module0174.f11035(var7) : var7;
        return module0205.f13194((SubLObject)ConsesLow.list(f11310(var7), f11287(var7)), (SubLObject)module0178.T);
    }
    
    public static SubLObject f11285(final SubLObject var7) {
        return f11328(var7);
    }
    
    public static SubLObject f11328(final SubLObject var7) {
        assert module0178.NIL != f11284(var7) : var7;
        return f11288(var7);
    }
    
    public static SubLObject f11304(final SubLObject var7) {
        assert module0178.NIL != f11284(var7) : var7;
        return f11329(var7);
    }
    
    public static SubLObject f11329(final SubLObject var7) {
        final SubLObject var8 = f11288(var7);
        return (module0178.NIL != var8 && module0178.$ic67$ == f11292(var7)) ? module0205.f13338(var8) : var8;
    }
    
    public static SubLObject f11330(final SubLObject var7) {
        return module0205.f13207(f11285(var7), (SubLObject)module0178.UNPROVIDED);
    }
    
    public static SubLObject f11331(final SubLObject var7, final SubLObject var71) {
        return ConsesLow.nth(var71, f11285(var7));
    }
    
    public static SubLObject f11332(final SubLObject var7) {
        assert module0178.NIL != module0174.f11035(var7) : var7;
        return module0205.f13132(f11328(var7));
    }
    
    public static SubLObject f11333(final SubLObject var7) {
        assert module0178.NIL != module0174.f11035(var7) : var7;
        return module0205.f13132(f11328(var7));
    }
    
    public static SubLObject f11334(final SubLObject var7) {
        assert module0178.NIL != module0174.f11035(var7) : var7;
        return f11331(var7, (SubLObject)module0178.ONE_INTEGER);
    }
    
    public static SubLObject f11335(final SubLObject var7) {
        assert module0178.NIL != module0174.f11035(var7) : var7;
        return f11331(var7, (SubLObject)module0178.TWO_INTEGER);
    }
    
    public static SubLObject f11336(final SubLObject var7) {
        assert module0178.NIL != module0174.f11035(var7) : var7;
        return f11331(var7, (SubLObject)module0178.THREE_INTEGER);
    }
    
    public static SubLObject f11337(final SubLObject var7) {
        assert module0178.NIL != module0174.f11035(var7) : var7;
        return f11331(var7, (SubLObject)module0178.FOUR_INTEGER);
    }
    
    public static SubLObject f11338(final SubLObject var7) {
        assert module0178.NIL != module0174.f11035(var7) : var7;
        return f11331(var7, (SubLObject)module0178.FIVE_INTEGER);
    }
    
    public static SubLObject f11339(final SubLObject var7, final SubLObject var48) {
        assert module0178.NIL != module0174.f11035(var7) : var7;
        assert module0178.NIL != module0130.f8503(var48) : var48;
        return Equality.eq(var48, f11291(var7));
    }
    
    public static SubLObject f11340(final SubLObject var7, final SubLObject var48) {
        return f11339(var7, var48);
    }
    
    public static SubLObject f11314(final SubLObject var7) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0178.NIL != module0174.f11035(var7) && module0178.$ic85$ == f11291(var7));
    }
    
    public static SubLObject f11312(final SubLObject var7) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0178.NIL != module0174.f11035(var7) && module0178.$ic88$ == f11291(var7));
    }
    
    public static SubLObject f11341(final SubLObject var7) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0178.NIL != module0174.f11035(var7) && module0178.$ic91$ == f11291(var7));
    }
    
    public static SubLObject f11342(final SubLObject var7, final SubLObject var44) {
        assert module0178.NIL != module0174.f11035(var7) : var7;
        assert module0178.NIL != module0130.f8511(var44) : var44;
        return Equality.eq(f11292(var7), var44);
    }
    
    public static SubLObject f11343(final SubLObject var7, final SubLObject var44) {
        assert module0178.NIL != module0174.f11035(var7) : var7;
        assert module0178.NIL != module0130.f8511(var44) : var44;
        return f11342(var7, var44);
    }
    
    public static SubLObject f11344(final SubLObject var7) {
        assert module0178.NIL != module0174.f11035(var7) : var7;
        final SubLObject var8 = f11296(var7);
        final SubLObject var9 = f11298(var7);
        if (module0178.NIL == var8) {
            return (SubLObject)module0178.NIL;
        }
        if (module0178.NIL == var9) {
            return module0612.f37514(var8);
        }
        return module0612.f37535(Numbers.add(Numbers.multiply(var8, (SubLObject)module0178.$ic101$), var9));
    }
    
    public static SubLObject f11345(final SubLObject var7, final SubLObject var74) {
        assert module0178.NIL != module0174.f11035(var7) : var7;
        assert module0178.NIL != module0612.f37387(var74) : var74;
        final SubLObject var75 = f11344(var7);
        return (SubLObject)((module0178.NIL != var75) ? module0614.f37628(var74, var75) : module0178.NIL);
    }
    
    public static SubLObject f11346(final SubLObject var74) {
        assert module0178.NIL != module0612.f37387(var74) : var74;
        final SubLObject var75 = module0174.f11008();
        final SubLObject var76 = (SubLObject)ConsesLow.list(var74);
        return module0052.f3781(var75, (SubLObject)module0178.$ic103$, var76);
    }
    
    public static SubLObject f11347(final SubLObject var74) {
        assert module0178.NIL != module0612.f37387(var74) : var74;
        SubLObject var75 = (SubLObject)module0178.NIL;
        final SubLObject var76 = f11346(var74);
        SubLObject var77 = (SubLObject)module0178.NIL;
        final SubLObject var78 = (SubLObject)module0178.NIL;
        while (module0178.NIL == var77) {
            final SubLObject var79 = module0052.f3695(var76, var78);
            final SubLObject var80 = (SubLObject)SubLObjectFactory.makeBoolean(!var78.eql(var79));
            if (module0178.NIL != var80) {
                var75 = (SubLObject)ConsesLow.cons(var79, var75);
            }
            var77 = (SubLObject)SubLObjectFactory.makeBoolean(module0178.NIL == var80);
        }
        return Sequences.nreverse(var75);
    }
    
    public static SubLObject f11348(final SubLObject var7) {
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)module0178.$ic104$), f11294(var7));
    }
    
    public static SubLObject f11349(final SubLObject var7) {
        assert module0178.NIL != module0174.f11035(var7) : var7;
        return (SubLObject)((module0178.NIL != f11284(var7)) ? module0178.NIL : module0193.f12102(f11282(var7)));
    }
    
    public static SubLObject f11350(final SubLObject var7) {
        assert module0178.NIL != module0174.f11035(var7) : var7;
        return module0351.f23582(f11282(var7));
    }
    
    public static SubLObject f11351(final SubLObject var7, final SubLObject var83) {
        assert module0178.NIL != module0174.f11035(var7) : var7;
        assert module0178.NIL != module0206.f13497(var83) : var83;
        final SubLObject var84 = f11294(var7);
        final SubLObject var85 = module0201.f12548(var83);
        final SubLObject var86 = Sequences.position(var85, var84, Symbols.symbol_function((SubLObject)module0178.EQUAL), (SubLObject)module0178.UNPROVIDED, (SubLObject)module0178.UNPROVIDED, (SubLObject)module0178.UNPROVIDED);
        if (module0178.NIL != var86) {
            return module0193.f12079(var86);
        }
        return (SubLObject)module0178.NIL;
    }
    
    public static SubLObject f11352(final SubLObject var7, final SubLObject var87) {
        assert module0178.NIL != module0174.f11035(var7) : var7;
        assert module0178.NIL != module0193.f12067(var87) : var87;
        final SubLObject var88 = f11294(var7);
        final SubLObject var89 = module0193.f12073(var87);
        final SubLObject var90 = ConsesLow.nth(var89, var88);
        if (var90.isString()) {
            return module0201.f12550(var90);
        }
        return (SubLObject)module0178.NIL;
    }
    
    public static SubLObject f11353(final SubLObject var7) {
        assert module0178.NIL != module0174.f11035(var7) : var7;
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)module0178.$ic107$), f11349(var7), new SubLObject[] { f11348(var7) });
    }
    
    public static SubLObject f11354(final SubLObject var7, SubLObject var88, SubLObject var89, SubLObject var90, SubLObject var73) {
        if (var88 == module0178.UNPROVIDED) {
            var88 = (SubLObject)module0178.NIL;
        }
        if (var89 == module0178.UNPROVIDED) {
            var89 = (SubLObject)module0178.NIL;
        }
        if (var90 == module0178.UNPROVIDED) {
            var90 = (SubLObject)module0178.NIL;
        }
        if (var73 == module0178.UNPROVIDED) {
            var73 = (SubLObject)module0178.NIL;
        }
        final SubLThread var91 = SubLProcess.currentSubLThread();
        if (module0178.NIL != module0131.$g1540$.getDynamicValue(var91)) {
            module0131.f8588((SubLObject)ConsesLow.list((SubLObject)module0178.$ic108$, module0290.f19524(var7), module0035.f2241(var88), module0035.f2241(var89), module0035.f2241(var90), module0035.f2241(var73)));
        }
        return module0175.f11085(var7, var88, var89, var90, var73);
    }
    
    public static SubLObject f11355(final SubLObject var7) {
        assert module0178.NIL != module0174.f11035(var7) : var7;
        final SubLObject var8 = module0177.f11248(var7);
        f11354(var7, (SubLObject)module0178.NIL, (SubLObject)module0178.NIL, (SubLObject)module0178.NIL, (SubLObject)module0178.NIL);
        return var8;
    }
    
    public static SubLObject f11356(final SubLObject var92, final SubLObject var88, final SubLObject var89, final SubLObject var90, final SubLObject var73) {
        return f11354(f11357(var92), module0290.f19514(var88), module0290.f19514(var89), module0290.f19514(var90), module0290.f19514(var73));
    }
    
    public static SubLObject f11358(final SubLObject var92, final SubLObject var93) {
        module0178.$g2209$.setGlobalValue(module0035.f2307(module0178.$g2209$.getGlobalValue(), var92, var93, module0178.$g2210$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0178.EQUAL)));
        return var92;
    }
    
    public static SubLObject f11357(final SubLObject var92) {
        SubLObject var93 = module0035.f2294(module0178.$g2209$.getGlobalValue(), var92, Symbols.symbol_function((SubLObject)module0178.EQUAL), (SubLObject)module0178.UNPROVIDED);
        if (module0178.NIL != var93) {
            module0178.$g2209$.setGlobalValue(module0035.f2308(module0178.$g2209$.getGlobalValue(), var92, Symbols.symbol_function((SubLObject)module0178.EQUAL)));
        }
        else {
            var93 = module0290.f19510(var92);
            f11358(var92, var93);
        }
        return var93;
    }
    
    public static SubLObject f11359(final SubLObject var7, SubLObject var94) {
        if (var94 == module0178.UNPROVIDED) {
            var94 = (SubLObject)module0178.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0178.NIL != module0174.f11035(var7) && module0178.NIL == module0174.f11041(var7, (SubLObject)module0178.UNPROVIDED));
    }
    
    public static SubLObject f11360(final SubLObject var7) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0178.NIL != module0174.f11035(var7) && module0178.NIL == module0177.f11254(var7));
    }
    
    public static SubLObject f11361(final SubLObject var7, SubLObject var94) {
        if (var94 == module0178.UNPROVIDED) {
            var94 = (SubLObject)module0178.NIL;
        }
        return module0174.f11041(var7, (SubLObject)module0178.UNPROVIDED);
    }
    
    public static SubLObject f11362(final SubLObject var7, SubLObject var94) {
        if (var94 == module0178.UNPROVIDED) {
            var94 = (SubLObject)module0178.NIL;
        }
        return f11359(var7, (SubLObject)module0178.UNPROVIDED);
    }
    
    public static SubLObject f11363(final SubLObject var46, final SubLObject var47) {
        final SubLObject var48 = module0217.f14415(var46, var47);
        return (SubLObject)((module0178.NIL != module0174.f11035(var48)) ? module0174.f11025(var48) : module0178.NIL);
    }
    
    public static SubLObject f11364(final SubLObject var46, final SubLObject var47, SubLObject var96, SubLObject var48, SubLObject var44, SubLObject var45, SubLObject var97) {
        if (var96 == module0178.UNPROVIDED) {
            var96 = (SubLObject)module0178.NIL;
        }
        if (var48 == module0178.UNPROVIDED) {
            var48 = (SubLObject)module0178.$ic88$;
        }
        if (var44 == module0178.UNPROVIDED) {
            var44 = (SubLObject)module0178.$ic114$;
        }
        if (var45 == module0178.UNPROVIDED) {
            var45 = (SubLObject)module0178.$ic115$;
        }
        if (var97 == module0178.UNPROVIDED) {
            var97 = (SubLObject)module0178.NIL;
        }
        assert module0178.NIL != module0232.f15320(var46) : var46;
        assert module0178.NIL != module0161.f10481(var47) : var47;
        assert module0178.NIL != module0130.f8503(var48) : var48;
        return f11365(var46, var47, var96, var48, var44, var45, var97);
    }
    
    public static SubLObject f11366(final SubLObject var98, final SubLObject var47, SubLObject var48, SubLObject var44, SubLObject var45, SubLObject var97) {
        if (var48 == module0178.UNPROVIDED) {
            var48 = (SubLObject)module0178.$ic85$;
        }
        if (var44 == module0178.UNPROVIDED) {
            var44 = (SubLObject)module0178.$ic114$;
        }
        if (var45 == module0178.UNPROVIDED) {
            var45 = (SubLObject)module0178.$ic115$;
        }
        if (var97 == module0178.UNPROVIDED) {
            var97 = (SubLObject)module0178.NIL;
        }
        assert module0178.NIL != module0202.f12590(var98) : var98;
        assert module0178.NIL != module0161.f10481(var47) : var47;
        assert module0178.NIL != module0130.f8503(var48) : var48;
        return f11365(module0204.f13033(var98), var47, (SubLObject)module0178.NIL, var48, var44, var45, var97);
    }
    
    public static SubLObject f11367(final SubLObject var46, final SubLObject var47, SubLObject var96, SubLObject var48, SubLObject var44, SubLObject var45, SubLObject var97) {
        if (var96 == module0178.UNPROVIDED) {
            var96 = (SubLObject)module0178.NIL;
        }
        if (var48 == module0178.UNPROVIDED) {
            var48 = (SubLObject)module0178.$ic88$;
        }
        if (var44 == module0178.UNPROVIDED) {
            var44 = (SubLObject)module0178.$ic114$;
        }
        if (var45 == module0178.UNPROVIDED) {
            var45 = (SubLObject)module0178.$ic115$;
        }
        if (var97 == module0178.UNPROVIDED) {
            var97 = (SubLObject)module0178.NIL;
        }
        assert module0178.NIL != module0232.f15320(var46) : var46;
        assert module0178.NIL != module0161.f10481(var47) : var47;
        assert module0178.NIL != module0130.f8503(var48) : var48;
        final SubLObject var98 = module0217.f14415(var46, var47);
        return (module0178.NIL != var98) ? var98 : f11364(var46, var47, var96, var48, var44, var45, var97);
    }
    
    public static SubLObject f11368(final SubLObject var98, final SubLObject var47, SubLObject var48, SubLObject var44, SubLObject var45, SubLObject var97) {
        if (var48 == module0178.UNPROVIDED) {
            var48 = (SubLObject)module0178.$ic85$;
        }
        if (var44 == module0178.UNPROVIDED) {
            var44 = (SubLObject)module0178.$ic114$;
        }
        if (var45 == module0178.UNPROVIDED) {
            var45 = (SubLObject)module0178.$ic115$;
        }
        if (var97 == module0178.UNPROVIDED) {
            var97 = (SubLObject)module0178.NIL;
        }
        assert module0178.NIL != module0161.f10481(var47) : var47;
        assert module0178.NIL != module0130.f8503(var48) : var48;
        final SubLObject var99 = module0217.f14421(var98, var47);
        return (module0178.NIL != var99) ? var99 : f11366(var98, var47, var48, var44, var45, var97);
    }
    
    public static SubLObject f11365(final SubLObject var46, final SubLObject var47, SubLObject var96, SubLObject var48, SubLObject var44, SubLObject var45, SubLObject var97) {
        if (var96 == module0178.UNPROVIDED) {
            var96 = (SubLObject)module0178.NIL;
        }
        if (var48 == module0178.UNPROVIDED) {
            var48 = (SubLObject)((module0178.NIL != module0232.f15322(var46)) ? module0178.$ic85$ : module0178.$ic88$);
        }
        if (var44 == module0178.UNPROVIDED) {
            var44 = (SubLObject)module0178.$ic114$;
        }
        if (var45 == module0178.UNPROVIDED) {
            var45 = (SubLObject)module0178.$ic115$;
        }
        if (var97 == module0178.UNPROVIDED) {
            var97 = (SubLObject)module0178.NIL;
        }
        return module0175.f11057(var46, var47, var96, var48, var44, var45, var97);
    }
    
    public static SubLObject f11369(final SubLObject var7) {
        return module0175.f11060(var7);
    }
    
    public static SubLObject f11370() {
        final SubLThread var91 = SubLProcess.currentSubLThread();
        SubLObject var92 = (SubLObject)module0178.ZERO_INTEGER;
        SubLObject var93 = (SubLObject)module0178.ZERO_INTEGER;
        SubLObject var96;
        for (SubLObject var94 = (SubLObject)module0178.NIL; module0178.NIL == var94; var94 = Numbers.zerop(var96)) {
            var93 = Numbers.add(var93, (SubLObject)module0178.ONE_INTEGER);
            final SubLObject var95 = PrintLow.format((SubLObject)module0178.NIL, (SubLObject)module0178.$ic119$, var93);
            var96 = (SubLObject)module0178.ZERO_INTEGER;
            final SubLObject var97 = module0174.f11010();
            final SubLObject var98 = var95;
            final SubLObject var106_107 = module0065.f4733(var97);
            SubLObject var99 = (SubLObject)module0178.ZERO_INTEGER;
            assert module0178.NIL != Types.stringp(var98) : var98;
            final SubLObject var100 = module0012.$g75$.currentBinding(var91);
            final SubLObject var101 = module0012.$g76$.currentBinding(var91);
            final SubLObject var102 = module0012.$g77$.currentBinding(var91);
            final SubLObject var103 = module0012.$g78$.currentBinding(var91);
            try {
                module0012.$g75$.bind((SubLObject)module0178.ZERO_INTEGER, var91);
                module0012.$g76$.bind((SubLObject)module0178.NIL, var91);
                module0012.$g77$.bind((SubLObject)module0178.T, var91);
                module0012.$g78$.bind(Time.get_universal_time(), var91);
                module0012.f478(var98);
                final SubLObject var113_114 = var97;
                if (module0178.NIL == module0065.f4772(var113_114, (SubLObject)module0178.$ic121$)) {
                    final SubLObject var115_116 = var113_114;
                    if (module0178.NIL == module0065.f4775(var115_116, (SubLObject)module0178.$ic121$)) {
                        final SubLObject var104 = module0065.f4740(var115_116);
                        final SubLObject var105 = (SubLObject)module0178.NIL;
                        SubLObject var106;
                        SubLObject var107;
                        SubLObject var108;
                        SubLObject var109;
                        for (var106 = Sequences.length(var104), var107 = (SubLObject)module0178.NIL, var107 = (SubLObject)module0178.ZERO_INTEGER; var107.numL(var106); var107 = Numbers.add(var107, (SubLObject)module0178.ONE_INTEGER)) {
                            var108 = ((module0178.NIL != var105) ? Numbers.subtract(var106, var107, (SubLObject)module0178.ONE_INTEGER) : var107);
                            var109 = Vectors.aref(var104, var108);
                            if (module0178.NIL == module0065.f4749(var109) || module0178.NIL == module0065.f4773((SubLObject)module0178.$ic121$)) {
                                if (module0178.NIL != module0065.f4749(var109)) {
                                    var109 = (SubLObject)module0178.$ic121$;
                                }
                                module0012.note_percent_progress(var99, var106_107);
                                var99 = Numbers.add(var99, (SubLObject)module0178.ONE_INTEGER);
                                if (module0178.NIL != f11371(var109)) {
                                    var96 = Numbers.add(var96, (SubLObject)module0178.ONE_INTEGER);
                                }
                            }
                        }
                    }
                    final SubLObject var123_124 = var113_114;
                    if (module0178.NIL == module0065.f4777(var123_124) || module0178.NIL == module0065.f4773((SubLObject)module0178.$ic121$)) {
                        final SubLObject var110 = module0065.f4738(var123_124);
                        SubLObject var111 = module0065.f4739(var123_124);
                        final SubLObject var112 = module0065.f4734(var123_124);
                        final SubLObject var113 = (SubLObject)((module0178.NIL != module0065.f4773((SubLObject)module0178.$ic121$)) ? module0178.NIL : module0178.$ic121$);
                        while (var111.numL(var112)) {
                            final SubLObject var114 = Hashtables.gethash_without_values(var111, var110, var113);
                            if (module0178.NIL == module0065.f4773((SubLObject)module0178.$ic121$) || module0178.NIL == module0065.f4749(var114)) {
                                module0012.note_percent_progress(var99, var106_107);
                                var99 = Numbers.add(var99, (SubLObject)module0178.ONE_INTEGER);
                                if (module0178.NIL != f11371(var114)) {
                                    var96 = Numbers.add(var96, (SubLObject)module0178.ONE_INTEGER);
                                }
                            }
                            var111 = Numbers.add(var111, (SubLObject)module0178.ONE_INTEGER);
                        }
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var103, var91);
                module0012.$g77$.rebind(var102, var91);
                module0012.$g76$.rebind(var101, var91);
                module0012.$g75$.rebind(var100, var91);
            }
            var92 = Numbers.add(var92, var96);
        }
        return Values.values(var92, var93);
    }
    
    public static SubLObject f11371(final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        assert module0178.NIL != module0174.f11035(var7) : var7;
        if (module0178.NIL != module0174.f11041(var7, (SubLObject)module0178.UNPROVIDED)) {
            SubLObject var9 = (SubLObject)module0178.NIL;
            try {
                var8.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var10 = Errors.$error_handler$.currentBinding(var8);
                try {
                    Errors.$error_handler$.bind((SubLObject)module0178.$ic122$, var8);
                    try {
                        final SubLObject var11 = f11289(var7);
                        final SubLObject var12 = f11287(var7);
                        final SubLObject var13 = f11294(var7);
                        var9 = (SubLObject)SubLObjectFactory.makeBoolean(module0178.$ic123$.equal(var11) || module0178.NIL == var11 || module0178.NIL != module0035.f2439(Symbols.symbol_function((SubLObject)module0178.$ic124$), var11, (SubLObject)module0178.UNPROVIDED) || module0178.NIL != module0035.f2439(Symbols.symbol_function((SubLObject)module0178.$ic124$), var12, (SubLObject)module0178.UNPROVIDED) || !var13.isList());
                    }
                    catch (Throwable var14) {
                        Errors.handleThrowable(var14, (SubLObject)module0178.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var10, var8);
                }
            }
            catch (Throwable var15) {
                var9 = Errors.handleThrowable(var15, module0003.$g3$.getGlobalValue());
            }
            finally {
                var8.throwStack.pop();
            }
            if (module0178.NIL != var9) {
                SubLObject var16 = (SubLObject)module0178.NIL;
                try {
                    var8.throwStack.push(module0178.$ic125$);
                    final SubLObject var17 = Errors.$error_handler$.currentBinding(var8);
                    try {
                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0178.$ic126$), var8);
                        try {
                            final SubLObject var109_132 = Errors.$continue_cerrorP$.currentBinding(var8);
                            try {
                                Errors.$continue_cerrorP$.bind((SubLObject)module0178.T, var8);
                                try {
                                    module0342.f23126(var7);
                                }
                                finally {
                                    final SubLObject var109_133 = Threads.$is_thread_performing_cleanupP$.currentBinding(var8);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0178.T, var8);
                                        if (module0178.NIL != module0174.f11041(var7, (SubLObject)module0178.UNPROVIDED)) {
                                            try {
                                                f11369(var7);
                                            }
                                            finally {
                                                final SubLObject var109_134 = Threads.$is_thread_performing_cleanupP$.currentBinding(var8);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0178.T, var8);
                                                    if (module0178.NIL != module0174.f11041(var7, (SubLObject)module0178.UNPROVIDED)) {
                                                        module0174.f11028(module0174.f11025(var7));
                                                    }
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var109_134, var8);
                                                }
                                            }
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var109_133, var8);
                                    }
                                }
                            }
                            finally {
                                Errors.$continue_cerrorP$.rebind(var109_132, var8);
                            }
                        }
                        catch (Throwable var18) {
                            Errors.handleThrowable(var18, (SubLObject)module0178.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(var17, var8);
                    }
                }
                catch (Throwable var19) {
                    var16 = Errors.handleThrowable(var19, (SubLObject)module0178.$ic125$);
                }
                finally {
                    var8.throwStack.pop();
                }
            }
            return var9;
        }
        return (SubLObject)module0178.NIL;
    }
    
    public static SubLObject f11372(final SubLObject var7, final SubLObject var54) {
        assert module0178.NIL != module0174.f11035(var7) : var7;
        assert module0178.NIL != module0191.f11910(var54) : var54;
        return Sequences.find(var54, f11299(var7), Symbols.symbol_function((SubLObject)module0178.$ic128$), (SubLObject)module0178.UNPROVIDED, (SubLObject)module0178.UNPROVIDED, (SubLObject)module0178.UNPROVIDED);
    }
    
    public static SubLObject f11373(final SubLObject var7, final SubLObject var54) {
        assert module0178.NIL != module0174.f11035(var7) : var7;
        assert module0178.NIL != module0191.f11910(var54) : var54;
        return (SubLObject)SubLObjectFactory.makeBoolean(module0178.NIL == f11374(var7, var54));
    }
    
    public static SubLObject f11374(final SubLObject var7, final SubLObject var54) {
        return module0004.f104(var54, f11299(var7), (SubLObject)module0178.$ic129$, (SubLObject)module0178.UNPROVIDED);
    }
    
    public static SubLObject f11375(final SubLObject var7) {
        assert module0178.NIL != module0174.f11035(var7) : var7;
        return module0035.sublisp_boolean(Sequences.find_if(Symbols.symbol_function((SubLObject)module0178.$ic130$), f11299(var7), (SubLObject)module0178.UNPROVIDED, (SubLObject)module0178.UNPROVIDED, (SubLObject)module0178.UNPROVIDED));
    }
    
    public static SubLObject f11376(final SubLObject var7) {
        assert module0178.NIL != module0174.f11035(var7) : var7;
        return module0035.sublisp_boolean(Sequences.find_if(Symbols.symbol_function((SubLObject)module0178.$ic133$), f11299(var7), (SubLObject)module0178.UNPROVIDED, (SubLObject)module0178.UNPROVIDED, (SubLObject)module0178.UNPROVIDED));
    }
    
    public static SubLObject f11377(final SubLObject var7, SubLObject var135) {
        if (var135 == module0178.UNPROVIDED) {
            var135 = (SubLObject)module0178.T;
        }
        return module0035.sublisp_boolean(Sequences.find_if((module0178.NIL != var135) ? Symbols.symbol_function((SubLObject)module0178.$ic136$) : Symbols.symbol_function((SubLObject)module0178.$ic137$), f11299(var7), (SubLObject)module0178.UNPROVIDED, (SubLObject)module0178.UNPROVIDED, (SubLObject)module0178.UNPROVIDED));
    }
    
    public static SubLObject f11378(final SubLObject var7) {
        assert module0178.NIL != module0174.f11035(var7) : var7;
        return Sequences.find_if(Symbols.symbol_function((SubLObject)module0178.$ic130$), f11299(var7), (SubLObject)module0178.UNPROVIDED, (SubLObject)module0178.UNPROVIDED, (SubLObject)module0178.UNPROVIDED);
    }
    
    public static SubLObject f11379(final SubLObject var7) {
        final SubLObject var8 = f11299(var7);
        final SubLObject var9 = Sequences.find_if(Symbols.symbol_function((SubLObject)module0178.$ic130$), var8, (SubLObject)module0178.UNPROVIDED, (SubLObject)module0178.UNPROVIDED, (SubLObject)module0178.UNPROVIDED);
        final SubLObject var10 = (SubLObject)((module0178.NIL != var9) ? module0035.f1997(var8) : module0178.NIL);
        return Values.values(var9, var10);
    }
    
    public static SubLObject f11380(final SubLObject var7) {
        assert module0178.NIL != module0174.f11035(var7) : var7;
        return module0035.remove_if_not(Symbols.symbol_function((SubLObject)module0178.$ic133$), f11299(var7), (SubLObject)module0178.UNPROVIDED, (SubLObject)module0178.UNPROVIDED, (SubLObject)module0178.UNPROVIDED, (SubLObject)module0178.UNPROVIDED);
    }
    
    public static SubLObject f11381(final SubLObject var7) {
        return module0032.f1728(f11300(var7));
    }
    
    public static SubLObject f11382(final SubLObject var7) {
        assert module0178.NIL != module0174.f11035(var7) : var7;
        return (SubLObject)SubLObjectFactory.makeBoolean(module0178.NIL == module0032.f1729(f11300(var7)));
    }
    
    public static SubLObject f11383(SubLObject var137) {
        if (var137 == module0178.UNPROVIDED) {
            var137 = Symbols.symbol_function((SubLObject)module0178.$ic143$);
        }
        if (module0174.f11019().numG((SubLObject)module0178.ZERO_INTEGER)) {
            final SubLObject var138 = module0174.f11021();
            SubLObject var139;
            SubLObject var140;
            for (var139 = (SubLObject)module0178.NIL; module0178.NIL == var139; var139 = var140) {
                var140 = module0174.f11053(random.random(var138));
                if (module0178.NIL != var140 && module0178.NIL != Functions.funcall(var137, var140)) {}
            }
            return var139;
        }
        return (SubLObject)module0178.NIL;
    }
    
    public static SubLObject f11384(SubLObject var71, SubLObject var141, SubLObject var137) {
        if (var71 == module0178.UNPROVIDED) {
            var71 = (SubLObject)module0178.$ic144$;
        }
        if (var141 == module0178.UNPROVIDED) {
            var141 = (SubLObject)module0178.NIL;
        }
        if (var137 == module0178.UNPROVIDED) {
            var137 = Symbols.symbol_function((SubLObject)module0178.$ic143$);
        }
        assert module0178.NIL != module0004.f106(var71) : var71;
        if (module0178.NIL != var141) {
            SubLObject var142 = (SubLObject)module0178.NIL;
            SubLObject var143;
            for (var143 = (SubLObject)module0178.NIL, var143 = (SubLObject)module0178.ZERO_INTEGER; var143.numL(var71); var143 = Numbers.add(var143, (SubLObject)module0178.ONE_INTEGER)) {
                var142 = (SubLObject)ConsesLow.cons(f11383(var137), var142);
            }
            return var142;
        }
        SubLObject var142;
        for (var142 = module0032.f1726(var71, Symbols.symbol_function((SubLObject)module0178.EQL)); module0032.f1728(var142).numL(var71); var142 = module0032.f1736(f11383(var137), var142, Symbols.symbol_function((SubLObject)module0178.EQL))) {}
        return module0032.f1753(var142);
    }
    
    public static SubLObject f11385() {
        return module0031.f1705(module0177.f11224());
    }
    
    public static SubLObject f11386() {
        SubLObject var98;
        for (var98 = (SubLObject)module0178.NIL; module0178.NIL == f11284(var98); var98 = f11383((SubLObject)module0178.UNPROVIDED)) {}
        return var98;
    }
    
    public static SubLObject f11387(final SubLObject var143) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0178.NIL != module0035.f2014(var143) && module0178.NIL != module0035.f1995(var143, (SubLObject)module0178.TWO_INTEGER, (SubLObject)module0178.UNPROVIDED) && module0178.NIL != module0035.f2370((SubLObject)module0178.$ic145$, var143, (SubLObject)module0178.UNPROVIDED));
    }
    
    public static SubLObject f11388() {
        final SubLObject var144 = module0174.f11019();
        final SubLObject var145 = module0174.f11021();
        return (SubLObject)ConsesLow.list(var144, var145);
    }
    
    public static SubLObject f11389(final SubLObject var146) {
        SubLObject var147 = (SubLObject)module0178.NIL;
        SubLObject var148 = (SubLObject)module0178.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var146, var146, (SubLObject)module0178.$ic146$);
        var147 = var146.first();
        SubLObject var149 = var146.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var149, var146, (SubLObject)module0178.$ic146$);
        var148 = var149.first();
        var149 = var149.rest();
        if (module0178.NIL == var149) {
            return (SubLObject)SubLObjectFactory.makeBoolean(var147.numE(module0174.f11019()) && var148.numE(module0174.f11021()));
        }
        cdestructuring_bind.cdestructuring_bind_error(var146, (SubLObject)module0178.$ic146$);
        return (SubLObject)module0178.NIL;
    }
    
    public static SubLObject f11390(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0178.$ic14$, (SubLObject)module0178.$ic147$, ConsesLow.append(var5, (SubLObject)module0178.NIL));
    }
    
    public static SubLObject f11391(final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        SubLObject var9 = module0174.f11025(var7);
        final SubLObject var10 = module0178.$g2211$.getDynamicValue(var8);
        if (module0178.NIL != var10) {
            var9 = module0065.f4750(var10, var9, (SubLObject)module0178.UNPROVIDED);
        }
        return var9;
    }
    
    public static SubLObject f11392(final SubLObject var155) {
        return module0174.f11053(var155);
    }
    
    public static SubLObject f11393() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0178", "f11279", "S#14112");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0178", "f11280", "S#14113");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0178", "f11281", "S#14114");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11282", "ASSERTION-CNF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11283", "S#14115", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11286", "S#13808", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11287", "ASSERTION-MT", 1, 0, false);
        new $f11287$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11288", "S#13959", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11289", "ASSERTION-CONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11284", "S#11995", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11290", "S#12732", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11291", "ASSERTION-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11292", "ASSERTION-TRUTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11293", "ASSERTION-STRENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11294", "ASSERTION-VARIABLE-NAMES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11295", "ASSERTED-BY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11296", "ASSERTED-WHEN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11297", "ASSERTED-WHY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11298", "ASSERTED-SECOND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11299", "ASSERTION-ARGUMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11300", "S#13965", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11301", "S#14116", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11302", "S#14117", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11303", "ASSERTION-FORMULA", 1, 0, false);
        new $f11303$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11305", "ASSERTION-IST-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11306", "S#14118", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11307", "S#14119", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11308", "ASSERTION-MENTIONS-TERM?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11309", "ASSERTION-MENTIONS-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11310", "S#14120", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11311", "S#14121", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11313", "S#14122", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11315", "S#14123", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11316", "S#14124", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11317", "S#14125", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11318", "S#14126", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11319", "S#12750", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11320", "S#14127", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11321", "S#12738", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11322", "S#14128", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11323", "S#14129", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11324", "S#14130", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11325", "S#14131", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11326", "S#14132", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11327", "S#14133", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11285", "GAF-FORMULA", 1, 0, false);
        new $f11285$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11328", "S#14134", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11304", "S#14135", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11329", "S#14136", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11330", "S#14137", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11331", "GAF-ARG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11332", "GAF-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11333", "GAF-ARG0", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11334", "GAF-ARG1", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11335", "GAF-ARG2", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11336", "GAF-ARG3", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11337", "GAF-ARG4", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11338", "GAF-ARG5", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11339", "S#14138", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11340", "S#12717", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11314", "FORWARD-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11312", "BACKWARD-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11341", "CODE-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11342", "ASSERTION-HAS-TRUTH?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11343", "ASSERTION-HAS-TRUTH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11344", "S#14139", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11345", "S#14140", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11346", "S#14141", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11347", "S#14142", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11348", "S#14143", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11349", "S#14144", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11350", "S#14145", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11351", "S#14146", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11352", "S#14147", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11353", "S#14148", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11354", "S#13892", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11355", "S#14149", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11356", "S#14150", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11358", "S#14151", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11357", "S#14152", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11359", "S#14109", 1, 1, false);
        new $f11359$UnaryFunction();
        new $f11359$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11360", "S#14153", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11361", "S#14110", 1, 1, false);
        new $f11361$UnaryFunction();
        new $f11361$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11362", "S#14154", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11363", "S#14155", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11364", "S#14156", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11366", "S#14157", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11367", "FIND-OR-CREATE-ASSERTION", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11368", "S#14158", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11365", "S#14159", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11369", "S#14160", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11370", "S#14161", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11371", "S#14162", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11372", "S#14163", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11373", "S#14164", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11374", "S#14165", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11375", "ASSERTED-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11376", "DEDUCED-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11377", "S#14166", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11378", "GET-ASSERTED-ARGUMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11379", "S#14167", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11380", "S#14168", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11381", "S#14169", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11382", "ASSERTION-HAS-DEPENDENTS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11383", "RANDOM-ASSERTION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11384", "S#14170", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11385", "S#14171", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11386", "S#14172", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11387", "S#14173", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11388", "S#14174", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11389", "S#14175", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0178", "f11390", "S#13855");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11391", "S#14176", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0178", "f11392", "S#14177", 1, 0, false);
        return (SubLObject)module0178.NIL;
    }
    
    public static SubLObject f11394() {
        module0178.$g2209$ = SubLFiles.deflexical("S#14178", (SubLObject)((module0178.NIL != Symbols.boundp((SubLObject)module0178.$ic109$)) ? module0178.$g2209$.getGlobalValue() : module0178.NIL));
        module0178.$g2210$ = SubLFiles.deflexical("S#14179", (SubLObject)module0178.FIVE_INTEGER);
        module0178.$g2211$ = SubLFiles.defparameter("S#14180", (SubLObject)module0178.NIL);
        return (SubLObject)module0178.NIL;
    }
    
    public static SubLObject f11395() {
        module0012.f368((SubLObject)module0178.$ic20$, (SubLObject)module0178.$ic23$, (SubLObject)module0178.$ic24$, (SubLObject)module0178.$ic25$, (SubLObject)module0178.$ic26$);
        module0012.f368((SubLObject)module0178.$ic27$, (SubLObject)module0178.$ic23$, (SubLObject)module0178.$ic28$, (SubLObject)module0178.$ic25$, (SubLObject)module0178.$ic29$);
        module0012.f368((SubLObject)module0178.$ic30$, (SubLObject)module0178.$ic23$, (SubLObject)module0178.$ic31$, (SubLObject)module0178.$ic25$, (SubLObject)module0178.$ic32$);
        module0012.f368((SubLObject)module0178.$ic33$, (SubLObject)module0178.$ic23$, (SubLObject)module0178.$ic34$, (SubLObject)module0178.$ic25$, (SubLObject)module0178.$ic35$);
        module0012.f368((SubLObject)module0178.$ic36$, (SubLObject)module0178.$ic23$, (SubLObject)module0178.$ic37$, (SubLObject)module0178.$ic25$, (SubLObject)module0178.$ic38$);
        module0012.f368((SubLObject)module0178.$ic39$, (SubLObject)module0178.$ic23$, (SubLObject)module0178.$ic40$, (SubLObject)module0178.$ic25$, (SubLObject)module0178.$ic41$);
        module0012.f368((SubLObject)module0178.$ic42$, (SubLObject)module0178.$ic23$, (SubLObject)module0178.$ic43$, (SubLObject)module0178.$ic25$, (SubLObject)module0178.NIL);
        module0012.f368((SubLObject)module0178.$ic44$, (SubLObject)module0178.$ic23$, (SubLObject)module0178.$ic45$, (SubLObject)module0178.$ic25$, (SubLObject)module0178.$ic46$);
        module0012.f368((SubLObject)module0178.$ic47$, (SubLObject)module0178.$ic23$, (SubLObject)module0178.$ic48$, (SubLObject)module0178.$ic25$, (SubLObject)module0178.$ic49$);
        module0012.f368((SubLObject)module0178.$ic51$, (SubLObject)module0178.$ic23$, (SubLObject)module0178.$ic52$, (SubLObject)module0178.$ic25$, (SubLObject)module0178.$ic49$);
        module0012.f368((SubLObject)module0178.$ic54$, (SubLObject)module0178.$ic55$, (SubLObject)module0178.$ic56$, (SubLObject)module0178.$ic57$, (SubLObject)module0178.$ic58$);
        module0012.f588((SubLObject)module0178.$ic59$, (SubLObject)module0178.NIL, (SubLObject)module0178.$ic55$, (SubLObject)module0178.$ic60$, (SubLObject)module0178.$ic57$, (SubLObject)module0178.$ic58$);
        module0002.f35((SubLObject)module0178.$ic64$, (SubLObject)module0178.$ic65$);
        module0012.f368((SubLObject)module0178.$ic68$, (SubLObject)module0178.$ic23$, (SubLObject)module0178.$ic69$, (SubLObject)module0178.$ic25$, (SubLObject)module0178.NIL);
        module0012.f368((SubLObject)module0178.$ic70$, (SubLObject)module0178.$ic23$, (SubLObject)module0178.$ic71$, (SubLObject)module0178.$ic25$, (SubLObject)module0178.NIL);
        module0012.f368((SubLObject)module0178.$ic72$, (SubLObject)module0178.$ic23$, (SubLObject)module0178.$ic73$, (SubLObject)module0178.$ic25$, (SubLObject)module0178.NIL);
        module0012.f368((SubLObject)module0178.$ic74$, (SubLObject)module0178.$ic23$, (SubLObject)module0178.$ic75$, (SubLObject)module0178.$ic25$, (SubLObject)module0178.NIL);
        module0012.f368((SubLObject)module0178.$ic76$, (SubLObject)module0178.$ic23$, (SubLObject)module0178.$ic77$, (SubLObject)module0178.$ic25$, (SubLObject)module0178.NIL);
        module0012.f368((SubLObject)module0178.$ic78$, (SubLObject)module0178.$ic23$, (SubLObject)module0178.$ic79$, (SubLObject)module0178.$ic25$, (SubLObject)module0178.NIL);
        module0012.f368((SubLObject)module0178.$ic80$, (SubLObject)module0178.$ic23$, (SubLObject)module0178.$ic81$, (SubLObject)module0178.$ic25$, (SubLObject)module0178.NIL);
        module0002.f35((SubLObject)module0178.$ic83$, (SubLObject)module0178.$ic84$);
        module0012.f368((SubLObject)module0178.$ic86$, (SubLObject)module0178.$ic23$, (SubLObject)module0178.$ic87$, (SubLObject)module0178.NIL, (SubLObject)module0178.$ic58$);
        module0012.f368((SubLObject)module0178.$ic89$, (SubLObject)module0178.$ic23$, (SubLObject)module0178.$ic90$, (SubLObject)module0178.NIL, (SubLObject)module0178.$ic58$);
        module0012.f368((SubLObject)module0178.$ic92$, (SubLObject)module0178.$ic23$, (SubLObject)module0178.$ic93$, (SubLObject)module0178.NIL, (SubLObject)module0178.$ic58$);
        module0012.f368((SubLObject)module0178.$ic95$, (SubLObject)module0178.$ic96$, (SubLObject)module0178.$ic97$, (SubLObject)module0178.$ic98$, (SubLObject)module0178.$ic58$);
        module0012.f588((SubLObject)module0178.$ic99$, (SubLObject)module0178.NIL, (SubLObject)module0178.$ic96$, (SubLObject)module0178.$ic100$, (SubLObject)module0178.$ic98$, (SubLObject)module0178.$ic58$);
        module0003.f57((SubLObject)module0178.$ic109$);
        module0002.f35((SubLObject)module0178.$ic110$, (SubLObject)module0178.$ic111$);
        module0002.f35((SubLObject)module0178.$ic112$, (SubLObject)module0178.$ic113$);
        module0012.f368((SubLObject)module0178.$ic131$, (SubLObject)module0178.$ic23$, (SubLObject)module0178.$ic132$, (SubLObject)module0178.$ic25$, (SubLObject)module0178.$ic58$);
        module0012.f368((SubLObject)module0178.$ic134$, (SubLObject)module0178.$ic23$, (SubLObject)module0178.$ic135$, (SubLObject)module0178.$ic25$, (SubLObject)module0178.$ic58$);
        module0012.f368((SubLObject)module0178.$ic138$, (SubLObject)module0178.$ic23$, (SubLObject)module0178.$ic139$, (SubLObject)module0178.$ic25$, (SubLObject)module0178.$ic140$);
        module0012.f368((SubLObject)module0178.$ic141$, (SubLObject)module0178.$ic23$, (SubLObject)module0178.$ic142$, (SubLObject)module0178.$ic25$, (SubLObject)module0178.$ic58$);
        return (SubLObject)module0178.NIL;
    }
    
    public void declareFunctions() {
        f11393();
    }
    
    public void initializeVariables() {
        f11394();
    }
    
    public void runTopLevelForms() {
        f11395();
    }
    
    static {
        me = (SubLFile)new module0178();
        module0178.$g2209$ = null;
        module0178.$g2210$ = null;
        module0178.$g2211$ = null;
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14181", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic1$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic2$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic3$ = SubLObjectFactory.makeKeyword("DONE");
        $ic4$ = SubLObjectFactory.makeSymbol("DO-LIST");
        $ic5$ = SubLObjectFactory.makeSymbol("ASSERTION-ARGUMENTS");
        $ic6$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14182", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic7$ = SubLObjectFactory.makeSymbol("S#2964", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("S#13965", "CYC");
        $ic9$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14183", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#12397", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#717", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic10$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic11$ = SubLObjectFactory.makeKeyword("SENSE");
        $ic12$ = SubLObjectFactory.makeKeyword("PREDICATE");
        $ic13$ = SubLObjectFactory.makeUninternedSymbol("US#2D65271");
        $ic14$ = SubLObjectFactory.makeSymbol("CLET");
        $ic15$ = SubLObjectFactory.makeSymbol("S#14114", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic17$ = SubLObjectFactory.makeSymbol("ATOMIC-SENTENCE-PREDICATE");
        $ic18$ = SubLObjectFactory.makeUninternedSymbol("US#76A739E");
        $ic19$ = SubLObjectFactory.makeUninternedSymbol("US#7D717B6");
        $ic20$ = SubLObjectFactory.makeSymbol("ASSERTION-CNF");
        $ic21$ = SubLObjectFactory.makeSymbol("S#14184", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $ic23$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"));
        $ic24$ = SubLObjectFactory.makeString("Return the cnf of ASSERTION.\n   @note If you know the assertion is a gaf,\n   consider using gaf-formula instead,\n   if you do not explicitly need a CNF.");
        $ic25$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-P")));
        $ic26$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNF-P"));
        $ic27$ = SubLObjectFactory.makeSymbol("ASSERTION-MT");
        $ic28$ = SubLObjectFactory.makeString("Return the mt of ASSERTION.");
        $ic29$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12263", "CYC"));
        $ic30$ = SubLObjectFactory.makeSymbol("ASSERTION-DIRECTION");
        $ic31$ = SubLObjectFactory.makeString("Return the direction of ASSERTION (either :backward, :forward or :code).");
        $ic32$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECTION-P"));
        $ic33$ = SubLObjectFactory.makeSymbol("ASSERTION-TRUTH");
        $ic34$ = SubLObjectFactory.makeString("Return the current truth of ASSERTION -- either :true :false or :unknown.");
        $ic35$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH-P"));
        $ic36$ = SubLObjectFactory.makeSymbol("ASSERTION-STRENGTH");
        $ic37$ = SubLObjectFactory.makeString("Return the current argumentation strength of ASSERTION -- either :monotonic, :default, or :unknown.");
        $ic38$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EL-STRENGTH-P"));
        $ic39$ = SubLObjectFactory.makeSymbol("ASSERTION-VARIABLE-NAMES");
        $ic40$ = SubLObjectFactory.makeString("Return the variable names for ASSERTION.");
        $ic41$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"));
        $ic42$ = SubLObjectFactory.makeSymbol("ASSERTED-BY");
        $ic43$ = SubLObjectFactory.makeString("Returns the cyclist who asserted ASSERTION.");
        $ic44$ = SubLObjectFactory.makeSymbol("ASSERTED-WHEN");
        $ic45$ = SubLObjectFactory.makeString("Returns the day when ASSERTION was asserted.");
        $ic46$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTEGERP"));
        $ic47$ = SubLObjectFactory.makeSymbol("ASSERTION-FORMULA");
        $ic48$ = SubLObjectFactory.makeString("Return a formula for ASSERTION.");
        $ic49$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12753", "CYC"));
        $ic50$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ist"));
        $ic51$ = SubLObjectFactory.makeSymbol("ASSERTION-IST-FORMULA");
        $ic52$ = SubLObjectFactory.makeString("Return a formula in #$ist format for ASSERTION.");
        $ic53$ = SubLObjectFactory.makeSymbol("HL-TERM-P");
        $ic54$ = SubLObjectFactory.makeSymbol("ASSERTION-MENTIONS-TERM?");
        $ic55$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"));
        $ic56$ = SubLObjectFactory.makeString("Return T iff ASSERTION's formula or mt contains TERM.\n   If assertion is a meta-assertion, recurse down sub-assertions.\n   By convention, negated gafs do not necessarily mention the term #$not.");
        $ic57$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("HL-TERM-P")));
        $ic58$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $ic59$ = SubLObjectFactory.makeSymbol("ASSERTION-MENTIONS-TERM");
        $ic60$ = SubLObjectFactory.makeString("@see assertion-mentions-term?");
        $ic61$ = SubLObjectFactory.makeKeyword("GAF");
        $ic62$ = SubLObjectFactory.makeKeyword("RULE");
        $ic63$ = SubLObjectFactory.makeSymbol("S#10604", "CYC");
        $ic64$ = SubLObjectFactory.makeSymbol("S#12738", "CYC");
        $ic65$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14127", "CYC"));
        $ic66$ = SubLObjectFactory.makeSymbol("S#11995", "CYC");
        $ic67$ = SubLObjectFactory.makeKeyword("FALSE");
        $ic68$ = SubLObjectFactory.makeSymbol("GAF-PREDICATE");
        $ic69$ = SubLObjectFactory.makeString("Return the predicate of gaf ASSERTION.");
        $ic70$ = SubLObjectFactory.makeSymbol("GAF-ARG0");
        $ic71$ = SubLObjectFactory.makeString("Return arg 0 (the predicate) of the gaf ASSERTION.");
        $ic72$ = SubLObjectFactory.makeSymbol("GAF-ARG1");
        $ic73$ = SubLObjectFactory.makeString("Return arg 1 of the gaf ASSERTION.");
        $ic74$ = SubLObjectFactory.makeSymbol("GAF-ARG2");
        $ic75$ = SubLObjectFactory.makeString("Return arg 2 of the gaf ASSERTION.");
        $ic76$ = SubLObjectFactory.makeSymbol("GAF-ARG3");
        $ic77$ = SubLObjectFactory.makeString("Return arg 3 of the gaf ASSERTION.");
        $ic78$ = SubLObjectFactory.makeSymbol("GAF-ARG4");
        $ic79$ = SubLObjectFactory.makeString("Return arg 4 of the gaf ASSERTION.");
        $ic80$ = SubLObjectFactory.makeSymbol("GAF-ARG5");
        $ic81$ = SubLObjectFactory.makeString("Return arg 5 of the gaf ASSERTION.");
        $ic82$ = SubLObjectFactory.makeSymbol("DIRECTION-P");
        $ic83$ = SubLObjectFactory.makeSymbol("S#12717", "CYC");
        $ic84$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14138", "CYC"));
        $ic85$ = SubLObjectFactory.makeKeyword("FORWARD");
        $ic86$ = SubLObjectFactory.makeSymbol("FORWARD-ASSERTION?");
        $ic87$ = SubLObjectFactory.makeString("Predicate returns T iff ASSERTION's direction is :FORWARD.");
        $ic88$ = SubLObjectFactory.makeKeyword("BACKWARD");
        $ic89$ = SubLObjectFactory.makeSymbol("BACKWARD-ASSERTION?");
        $ic90$ = SubLObjectFactory.makeString("Predicate returns T iff ASSERTION's direction is :BACKWARD.");
        $ic91$ = SubLObjectFactory.makeKeyword("CODE");
        $ic92$ = SubLObjectFactory.makeSymbol("CODE-ASSERTION?");
        $ic93$ = SubLObjectFactory.makeString("Predicate returns T iff ASSERTION's direction is :CODE.");
        $ic94$ = SubLObjectFactory.makeSymbol("TRUTH-P");
        $ic95$ = SubLObjectFactory.makeSymbol("ASSERTION-HAS-TRUTH?");
        $ic96$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12576", "CYC"));
        $ic97$ = SubLObjectFactory.makeString("Return T iff ASSERTION's current truth is TRUTH.");
        $ic98$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12576", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH-P")));
        $ic99$ = SubLObjectFactory.makeSymbol("ASSERTION-HAS-TRUTH");
        $ic100$ = SubLObjectFactory.makeString("@see assertion-has-truth?");
        $ic101$ = SubLObjectFactory.makeInteger(1000000);
        $ic102$ = SubLObjectFactory.makeSymbol("S#14102", "CYC");
        $ic103$ = SubLObjectFactory.makeSymbol("S#14140", "CYC");
        $ic104$ = SubLObjectFactory.makeSymbol("S#14185", "CYC");
        $ic105$ = SubLObjectFactory.makeSymbol("EL-VARIABLE-P");
        $ic106$ = SubLObjectFactory.makeSymbol("VARIABLE-P");
        $ic107$ = SubLObjectFactory.makeSymbol("S#14186", "CYC");
        $ic108$ = SubLObjectFactory.makeSymbol("S#14150", "CYC");
        $ic109$ = SubLObjectFactory.makeSymbol("S#14178", "CYC");
        $ic110$ = SubLObjectFactory.makeSymbol("S#14110", "CYC");
        $ic111$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALID-ASSERTION?"));
        $ic112$ = SubLObjectFactory.makeSymbol("S#14154", "CYC");
        $ic113$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14109", "CYC"));
        $ic114$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic115$ = SubLObjectFactory.makeKeyword("DEFAULT");
        $ic116$ = SubLObjectFactory.makeSymbol("CNF-P");
        $ic117$ = SubLObjectFactory.makeSymbol("S#12263", "CYC");
        $ic118$ = SubLObjectFactory.makeSymbol("S#12753", "CYC");
        $ic119$ = SubLObjectFactory.makeString("Removing broken assertions: pass ~S");
        $ic120$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic121$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic122$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic123$ = ConsesLow.list((SubLObject)module0178.NIL);
        $ic124$ = SubLObjectFactory.makeSymbol("S#14187", "CYC");
        $ic125$ = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $ic126$ = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic127$ = SubLObjectFactory.makeSymbol("ARGUMENT-P");
        $ic128$ = SubLObjectFactory.makeSymbol("ARGUMENT-EQUAL");
        $ic129$ = SubLObjectFactory.makeSymbol("S#3302", "CYC");
        $ic130$ = SubLObjectFactory.makeSymbol("ASSERTED-ARGUMENT-P");
        $ic131$ = SubLObjectFactory.makeSymbol("ASSERTED-ASSERTION?");
        $ic132$ = SubLObjectFactory.makeString("Return non-nil IFF assertion has an asserted argument.");
        $ic133$ = SubLObjectFactory.makeSymbol("DEDUCTION-P");
        $ic134$ = SubLObjectFactory.makeSymbol("DEDUCED-ASSERTION?");
        $ic135$ = SubLObjectFactory.makeString("Return non-nil IFF assertion has some deduced argument");
        $ic136$ = SubLObjectFactory.makeSymbol("S#14188", "CYC");
        $ic137$ = SubLObjectFactory.makeSymbol("S#14189", "CYC");
        $ic138$ = SubLObjectFactory.makeSymbol("GET-ASSERTED-ARGUMENT");
        $ic139$ = SubLObjectFactory.makeString("Return the asserted argument for ASSERTION, or nil if none present.");
        $ic140$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#664", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTED-ARGUMENT-P")));
        $ic141$ = SubLObjectFactory.makeSymbol("ASSERTION-HAS-DEPENDENTS-P");
        $ic142$ = SubLObjectFactory.makeString("Return non-nil IFF assertion has dependents.");
        $ic143$ = SubLObjectFactory.makeSymbol("TRUE");
        $ic144$ = SubLObjectFactory.makeInteger(500);
        $ic145$ = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic146$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13597", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13598", "CYC"));
        $ic147$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14180", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13820", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9679", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#14176", "CYC"))));
    }
    
    public static final class $f11287$UnaryFunction extends UnaryFunction
    {
        public $f11287$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ASSERTION-MT"));
        }
        
        public SubLObject processItem(final SubLObject var43) {
            return module0178.f11287(var43);
        }
    }
    
    public static final class $f11303$UnaryFunction extends UnaryFunction
    {
        public $f11303$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ASSERTION-FORMULA"));
        }
        
        public SubLObject processItem(final SubLObject var43) {
            return module0178.f11303(var43);
        }
    }
    
    public static final class $f11285$UnaryFunction extends UnaryFunction
    {
        public $f11285$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("GAF-FORMULA"));
        }
        
        public SubLObject processItem(final SubLObject var43) {
            return module0178.f11285(var43);
        }
    }
    
    public static final class $f11359$UnaryFunction extends UnaryFunction
    {
        public $f11359$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#14109"));
        }
        
        public SubLObject processItem(final SubLObject var43) {
            return module0178.f11359(var43, (SubLObject)$f11359$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f11359$BinaryFunction extends BinaryFunction
    {
        public $f11359$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#14109"));
        }
        
        public SubLObject processItem(final SubLObject var43, final SubLObject var95) {
            return module0178.f11359(var43, var95);
        }
    }
    
    public static final class $f11361$UnaryFunction extends UnaryFunction
    {
        public $f11361$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#14110"));
        }
        
        public SubLObject processItem(final SubLObject var43) {
            return module0178.f11361(var43, (SubLObject)$f11361$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f11361$BinaryFunction extends BinaryFunction
    {
        public $f11361$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#14110"));
        }
        
        public SubLObject processItem(final SubLObject var43, final SubLObject var95) {
            return module0178.f11361(var43, var95);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0178.class
	Total time: 537 ms
	
	Decompiled with Procyon 0.5.32.
*/