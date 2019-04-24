package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0583 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0583";
    public static final String myFingerPrint = "7d74929ab01018e221be8bf5336a315fdcd26c318c9f1c3f04540d98dd90f173";
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLList $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLList $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLList $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLList $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLList $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLList $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
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
    private static final SubLSymbol $ic65$;
    private static final SubLList $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLList $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLList $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLList $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLList $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLList $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLList $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLList $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLList $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLList $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    
    public static SubLObject f35716(final SubLObject var1, final SubLObject var2) {
        assert module0583.NIL != module0747.f46315(var2) : var2;
        assert module0583.NIL != module0747.f46310(var1) : var1;
        module0582.f35701(var1, (SubLObject)module0583.$ic4$, var2);
        return var1;
    }
    
    public static SubLObject f35717(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)module0583.NIL;
        SubLObject var8 = (SubLObject)module0583.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0583.$ic5$);
        var7 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0583.$ic5$);
        var8 = var6.first();
        var6 = var6.rest();
        if (module0583.NIL == var6) {
            final SubLObject var9 = (SubLObject)module0583.$ic6$;
            return module0582.f35702(var7, var9, var8, (SubLObject)module0583.$ic0$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0583.$ic5$);
        return (SubLObject)module0583.NIL;
    }
    
    public static SubLObject f35718(final SubLObject var1, final SubLObject var2) {
        assert module0583.NIL != module0161.f10481(var2) : var2;
        assert module0583.NIL != module0747.f46310(var1) : var1;
        module0582.f35701(var1, (SubLObject)module0583.$ic12$, var2);
        return var1;
    }
    
    public static SubLObject f35719(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)module0583.NIL;
        SubLObject var8 = (SubLObject)module0583.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0583.$ic5$);
        var7 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0583.$ic5$);
        var8 = var6.first();
        var6 = var6.rest();
        if (module0583.NIL == var6) {
            final SubLObject var9 = (SubLObject)module0583.$ic13$;
            return module0582.f35702(var7, var9, var8, (SubLObject)module0583.$ic9$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0583.$ic5$);
        return (SubLObject)module0583.NIL;
    }
    
    public static SubLObject f35720(final SubLObject var1, final SubLObject var2) {
        assert module0583.NIL != Types.sublisp_true(var2) : var2;
        assert module0583.NIL != module0747.f46310(var1) : var1;
        module0582.f35701(var1, (SubLObject)module0583.$ic18$, var2);
        return var1;
    }
    
    public static SubLObject f35721(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)module0583.NIL;
        SubLObject var8 = (SubLObject)module0583.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0583.$ic5$);
        var7 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0583.$ic5$);
        var8 = var6.first();
        var6 = var6.rest();
        if (module0583.NIL == var6) {
            final SubLObject var9 = (SubLObject)module0583.$ic19$;
            return module0582.f35702(var7, var9, var8, (SubLObject)module0583.$ic15$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0583.$ic5$);
        return (SubLObject)module0583.NIL;
    }
    
    public static SubLObject f35722(final SubLObject var1, final SubLObject var2) {
        assert module0583.NIL != Types.sublisp_true(var2) : var2;
        assert module0583.NIL != module0747.f46310(var1) : var1;
        module0582.f35701(var1, (SubLObject)module0583.$ic23$, var2);
        return var1;
    }
    
    public static SubLObject f35723(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)module0583.NIL;
        SubLObject var8 = (SubLObject)module0583.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0583.$ic5$);
        var7 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0583.$ic5$);
        var8 = var6.first();
        var6 = var6.rest();
        if (module0583.NIL == var6) {
            final SubLObject var9 = (SubLObject)module0583.$ic24$;
            return module0582.f35702(var7, var9, var8, (SubLObject)module0583.$ic21$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0583.$ic5$);
        return (SubLObject)module0583.NIL;
    }
    
    public static SubLObject f35724(final SubLObject var1, final SubLObject var2) {
        assert module0583.NIL != module0048.f3358(var2) : var2;
        assert module0583.NIL != module0747.f46310(var1) : var1;
        module0582.f35701(var1, (SubLObject)module0583.$ic29$, var2);
        return var1;
    }
    
    public static SubLObject f35725(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)module0583.NIL;
        SubLObject var8 = (SubLObject)module0583.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0583.$ic5$);
        var7 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0583.$ic5$);
        var8 = var6.first();
        var6 = var6.rest();
        if (module0583.NIL == var6) {
            final SubLObject var9 = (SubLObject)module0583.$ic30$;
            return module0582.f35702(var7, var9, var8, (SubLObject)module0583.$ic26$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0583.$ic5$);
        return (SubLObject)module0583.NIL;
    }
    
    public static SubLObject f35726(final SubLObject var1, final SubLObject var2) {
        assert module0583.NIL != module0751.f46980(var2) : var2;
        assert module0583.NIL != module0747.f46310(var1) : var1;
        module0582.f35701(var1, (SubLObject)module0583.$ic35$, var2);
        return var1;
    }
    
    public static SubLObject f35727(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)module0583.NIL;
        SubLObject var8 = (SubLObject)module0583.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0583.$ic5$);
        var7 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0583.$ic5$);
        var8 = var6.first();
        var6 = var6.rest();
        if (module0583.NIL == var6) {
            final SubLObject var9 = (SubLObject)module0583.$ic36$;
            return module0582.f35702(var7, var9, var8, (SubLObject)module0583.$ic32$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0583.$ic5$);
        return (SubLObject)module0583.NIL;
    }
    
    public static SubLObject f35728(final SubLObject var1, final SubLObject var2) {
        assert module0583.NIL != module0761.f48130(var2) : var2;
        assert module0583.NIL != module0747.f46310(var1) : var1;
        module0582.f35701(var1, (SubLObject)module0583.$ic41$, var2);
        return var1;
    }
    
    public static SubLObject f35729(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)module0583.NIL;
        SubLObject var8 = (SubLObject)module0583.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0583.$ic5$);
        var7 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0583.$ic5$);
        var8 = var6.first();
        var6 = var6.rest();
        if (module0583.NIL == var6) {
            final SubLObject var9 = (SubLObject)module0583.$ic42$;
            return module0582.f35702(var7, var9, var8, (SubLObject)module0583.$ic38$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0583.$ic5$);
        return (SubLObject)module0583.NIL;
    }
    
    public static SubLObject f35730(final SubLObject var1, final SubLObject var2) {
        assert module0583.NIL != module0048.f3358(var2) : var2;
        assert module0583.NIL != module0747.f46310(var1) : var1;
        module0582.f35701(var1, (SubLObject)module0583.$ic46$, var2);
        return var1;
    }
    
    public static SubLObject f35731(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)module0583.NIL;
        SubLObject var8 = (SubLObject)module0583.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0583.$ic5$);
        var7 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0583.$ic5$);
        var8 = var6.first();
        var6 = var6.rest();
        if (module0583.NIL == var6) {
            final SubLObject var9 = (SubLObject)module0583.$ic47$;
            return module0582.f35702(var7, var9, var8, (SubLObject)module0583.$ic44$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0583.$ic5$);
        return (SubLObject)module0583.NIL;
    }
    
    public static SubLObject f35732(final SubLObject var22) {
        return Equality.eq((SubLObject)module0583.$ic49$, module0582.f35706(var22));
    }
    
    public static SubLObject f35733(final SubLObject var23) {
        return module0035.f2331(var23, (SubLObject)module0583.$ic50$);
    }
    
    public static SubLObject f35734(final SubLObject var1, final SubLObject var2) {
        assert module0583.NIL != module0048.f3358(var2) : var2;
        assert module0583.NIL != module0747.f46310(var1) : var1;
        module0582.f35701(var1, (SubLObject)module0583.$ic53$, var2);
        return var1;
    }
    
    public static SubLObject f35735(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)module0583.NIL;
        SubLObject var8 = (SubLObject)module0583.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0583.$ic5$);
        var7 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0583.$ic5$);
        var8 = var6.first();
        var6 = var6.rest();
        if (module0583.NIL == var6) {
            final SubLObject var9 = (SubLObject)module0583.$ic54$;
            return module0582.f35702(var7, var9, var8, (SubLObject)module0583.$ic51$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0583.$ic5$);
        return (SubLObject)module0583.NIL;
    }
    
    public static SubLObject f35736(final SubLObject var1, final SubLObject var2) {
        assert module0583.NIL != module0048.f3358(var2) : var2;
        assert module0583.NIL != module0747.f46310(var1) : var1;
        module0582.f35701(var1, (SubLObject)module0583.$ic58$, var2);
        return var1;
    }
    
    public static SubLObject f35737(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)module0583.NIL;
        SubLObject var8 = (SubLObject)module0583.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0583.$ic5$);
        var7 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0583.$ic5$);
        var8 = var6.first();
        var6 = var6.rest();
        if (module0583.NIL == var6) {
            final SubLObject var9 = (SubLObject)module0583.$ic59$;
            return module0582.f35702(var7, var9, var8, (SubLObject)module0583.$ic56$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0583.$ic5$);
        return (SubLObject)module0583.NIL;
    }
    
    public static SubLObject f35738(final SubLObject var1, final SubLObject var2) {
        assert module0583.NIL != Types.booleanp(var2) : var2;
        assert module0583.NIL != module0747.f46310(var1) : var1;
        module0582.f35701(var1, (SubLObject)module0583.$ic64$, var2);
        return var1;
    }
    
    public static SubLObject f35739(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)module0583.NIL;
        SubLObject var8 = (SubLObject)module0583.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0583.$ic5$);
        var7 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0583.$ic5$);
        var8 = var6.first();
        var6 = var6.rest();
        if (module0583.NIL == var6) {
            final SubLObject var9 = (SubLObject)module0583.$ic65$;
            return module0582.f35702(var7, var9, var8, (SubLObject)module0583.$ic61$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0583.$ic5$);
        return (SubLObject)module0583.NIL;
    }
    
    public static SubLObject f35740(final SubLObject var22) {
        return Equality.eq(module0582.f35706(var22), (SubLObject)module0583.$ic67$);
    }
    
    public static SubLObject f35741(final SubLObject var23) {
        return module0035.f2331(var23, (SubLObject)module0583.$ic68$);
    }
    
    public static SubLObject f35742(final SubLObject var1, final SubLObject var2) {
        assert module0583.NIL != module0048.f3331(var2) : var2;
        assert module0583.NIL != module0747.f46310(var1) : var1;
        module0582.f35701(var1, (SubLObject)module0583.$ic72$, var2);
        return var1;
    }
    
    public static SubLObject f35743(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)module0583.NIL;
        SubLObject var8 = (SubLObject)module0583.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0583.$ic5$);
        var7 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0583.$ic5$);
        var8 = var6.first();
        var6 = var6.rest();
        if (module0583.NIL == var6) {
            final SubLObject var9 = (SubLObject)module0583.$ic73$;
            return module0582.f35702(var7, var9, var8, (SubLObject)module0583.$ic69$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0583.$ic5$);
        return (SubLObject)module0583.NIL;
    }
    
    public static SubLObject f35744(final SubLObject var1, final SubLObject var2) {
        assert module0583.NIL != Types.booleanp(var2) : var2;
        assert module0583.NIL != module0747.f46310(var1) : var1;
        module0582.f35701(var1, (SubLObject)module0583.$ic77$, var2);
        return var1;
    }
    
    public static SubLObject f35745(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)module0583.NIL;
        SubLObject var8 = (SubLObject)module0583.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0583.$ic5$);
        var7 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0583.$ic5$);
        var8 = var6.first();
        var6 = var6.rest();
        if (module0583.NIL == var6) {
            final SubLObject var9 = (SubLObject)module0583.$ic78$;
            return module0582.f35702(var7, var9, var8, (SubLObject)module0583.$ic75$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0583.$ic5$);
        return (SubLObject)module0583.NIL;
    }
    
    public static SubLObject f35746(final SubLObject var1, final SubLObject var2) {
        assert module0583.NIL != module0004.f106(var2) : var2;
        assert module0583.NIL != module0747.f46310(var1) : var1;
        module0582.f35701(var1, (SubLObject)module0583.$ic83$, var2);
        return var1;
    }
    
    public static SubLObject f35747(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)module0583.NIL;
        SubLObject var8 = (SubLObject)module0583.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0583.$ic5$);
        var7 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0583.$ic5$);
        var8 = var6.first();
        var6 = var6.rest();
        if (module0583.NIL == var6) {
            final SubLObject var9 = (SubLObject)module0583.$ic84$;
            return module0582.f35702(var7, var9, var8, (SubLObject)module0583.$ic80$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0583.$ic5$);
        return (SubLObject)module0583.NIL;
    }
    
    public static SubLObject f35748(final SubLObject var22) {
        return Equality.eq(module0582.f35706(var22), (SubLObject)module0583.$ic86$);
    }
    
    public static SubLObject f35749(final SubLObject var23) {
        return module0035.f2331(var23, (SubLObject)module0583.$ic87$);
    }
    
    public static SubLObject f35750(final SubLObject var1, final SubLObject var2) {
        assert module0583.NIL != Types.booleanp(var2) : var2;
        assert module0583.NIL != module0747.f46310(var1) : var1;
        module0582.f35701(var1, (SubLObject)module0583.$ic90$, var2);
        return var1;
    }
    
    public static SubLObject f35751(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)module0583.NIL;
        SubLObject var8 = (SubLObject)module0583.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0583.$ic5$);
        var7 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0583.$ic5$);
        var8 = var6.first();
        var6 = var6.rest();
        if (module0583.NIL == var6) {
            final SubLObject var9 = (SubLObject)module0583.$ic91$;
            return module0582.f35702(var7, var9, var8, (SubLObject)module0583.$ic88$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0583.$ic5$);
        return (SubLObject)module0583.NIL;
    }
    
    public static SubLObject f35752(final SubLObject var1, final SubLObject var2) {
        assert module0583.NIL != Types.booleanp(var2) : var2;
        assert module0583.NIL != module0747.f46310(var1) : var1;
        module0582.f35701(var1, (SubLObject)module0583.$ic95$, var2);
        return var1;
    }
    
    public static SubLObject f35753(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)module0583.NIL;
        SubLObject var8 = (SubLObject)module0583.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0583.$ic5$);
        var7 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0583.$ic5$);
        var8 = var6.first();
        var6 = var6.rest();
        if (module0583.NIL == var6) {
            final SubLObject var9 = (SubLObject)module0583.$ic96$;
            return module0582.f35702(var7, var9, var8, (SubLObject)module0583.$ic93$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0583.$ic5$);
        return (SubLObject)module0583.NIL;
    }
    
    public static SubLObject f35754(final SubLObject var22) {
        return Equality.eq(module0582.f35706(var22), (SubLObject)module0583.$ic98$);
    }
    
    public static SubLObject f35755(final SubLObject var23) {
        return module0035.f2331(var23, (SubLObject)module0583.$ic99$);
    }
    
    public static SubLObject f35756(final SubLObject var22) {
        return Equality.eq(module0582.f35706(var22), (SubLObject)module0583.$ic100$);
    }
    
    public static SubLObject f35757(final SubLObject var23) {
        return module0035.f2331(var23, (SubLObject)module0583.$ic101$);
    }
    
    public static SubLObject f35758(final SubLObject var1, final SubLObject var2) {
        assert module0583.NIL != Types.booleanp(var2) : var2;
        assert module0583.NIL != module0747.f46310(var1) : var1;
        module0582.f35701(var1, (SubLObject)module0583.$ic104$, var2);
        return var1;
    }
    
    public static SubLObject f35759(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)module0583.NIL;
        SubLObject var8 = (SubLObject)module0583.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0583.$ic5$);
        var7 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0583.$ic5$);
        var8 = var6.first();
        var6 = var6.rest();
        if (module0583.NIL == var6) {
            final SubLObject var9 = (SubLObject)module0583.$ic105$;
            return module0582.f35702(var7, var9, var8, (SubLObject)module0583.$ic102$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0583.$ic5$);
        return (SubLObject)module0583.NIL;
    }
    
    public static SubLObject f35760(final SubLObject var1, final SubLObject var2) {
        assert module0583.NIL != Types.booleanp(var2) : var2;
        assert module0583.NIL != module0747.f46310(var1) : var1;
        module0582.f35701(var1, (SubLObject)module0583.$ic109$, var2);
        return var1;
    }
    
    public static SubLObject f35761(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)module0583.NIL;
        SubLObject var8 = (SubLObject)module0583.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0583.$ic5$);
        var7 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0583.$ic5$);
        var8 = var6.first();
        var6 = var6.rest();
        if (module0583.NIL == var6) {
            final SubLObject var9 = (SubLObject)module0583.$ic110$;
            return module0582.f35702(var7, var9, var8, (SubLObject)module0583.$ic107$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0583.$ic5$);
        return (SubLObject)module0583.NIL;
    }
    
    public static SubLObject f35762(final SubLObject var1, final SubLObject var2) {
        assert module0583.NIL != Types.booleanp(var2) : var2;
        assert module0583.NIL != module0747.f46310(var1) : var1;
        module0582.f35701(var1, (SubLObject)module0583.$ic114$, var2);
        return var1;
    }
    
    public static SubLObject f35763(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)module0583.NIL;
        SubLObject var8 = (SubLObject)module0583.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0583.$ic5$);
        var7 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0583.$ic5$);
        var8 = var6.first();
        var6 = var6.rest();
        if (module0583.NIL == var6) {
            final SubLObject var9 = (SubLObject)module0583.$ic115$;
            return module0582.f35702(var7, var9, var8, (SubLObject)module0583.$ic112$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0583.$ic5$);
        return (SubLObject)module0583.NIL;
    }
    
    public static SubLObject f35764(final SubLObject var1, final SubLObject var2) {
        assert module0583.NIL != Types.booleanp(var2) : var2;
        assert module0583.NIL != module0747.f46310(var1) : var1;
        module0582.f35701(var1, (SubLObject)module0583.$ic119$, var2);
        return var1;
    }
    
    public static SubLObject f35765(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)module0583.NIL;
        SubLObject var8 = (SubLObject)module0583.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0583.$ic5$);
        var7 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0583.$ic5$);
        var8 = var6.first();
        var6 = var6.rest();
        if (module0583.NIL == var6) {
            final SubLObject var9 = (SubLObject)module0583.$ic120$;
            return module0582.f35702(var7, var9, var8, (SubLObject)module0583.$ic117$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0583.$ic5$);
        return (SubLObject)module0583.NIL;
    }
    
    public static SubLObject f35766(final SubLObject var22) {
        return Equality.eq(module0582.f35706(var22), (SubLObject)module0583.$ic122$);
    }
    
    public static SubLObject f35767(final SubLObject var23) {
        return module0035.f2331(var23, (SubLObject)module0583.$ic123$);
    }
    
    public static SubLObject f35768() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0583", "f35716", "S#39397", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0583", "f35717", "SET-PPH-LEXICAL-CONTEXT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0583", "f35718", "S#39398", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0583", "f35719", "SET-PPH-SEMANTIC-MT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0583", "f35720", "S#39399", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0583", "f35721", "SET-PPH-BACKGROUND-DISCOURSE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0583", "f35722", "S#39400", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0583", "f35723", "SET-PPH-DISCOURSE-CONTEXTS-TO-UPDATE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0583", "f35724", "S#39401", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0583", "f35725", "SET-PPH-GENERATION-COUNT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0583", "f35726", "S#39402", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0583", "f35727", "SET-PPH-AGREEMENT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0583", "f35728", "S#39403", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0583", "f35729", "SET-PPH-SENTENTIAL-FORCE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0583", "f35730", "S#39404", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0583", "f35731", "SET-PPH-TIMEOUT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0583", "f35732", "S#39405", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0583", "f35733", "S#39406", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0583", "f35734", "S#39407", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0583", "f35735", "SET-MAX-DIGITS-WITHOUT-COMMA");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0583", "f35736", "S#39408", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0583", "f35737", "SET-SIGNIFICANT-DIGITS-CUTOFF");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0583", "f35738", "S#39409", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0583", "f35739", "SET-USE-INDEXICAL-DATES?");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0583", "f35740", "S#39410", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0583", "f35741", "S#39411", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0583", "f35742", "S#39412", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0583", "f35743", "SET-DEMERIT-CUTOFF");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0583", "f35744", "S#39413", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0583", "f35745", "SET-USE-SMART-VARIABLE-REPLACEMENT?");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0583", "f35746", "S#39414", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0583", "f35747", "SET-GENLPREDS-BACKOFF-LIMIT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0583", "f35748", "S#39415", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0583", "f35749", "S#39416", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0583", "f35750", "S#39417", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0583", "f35751", "SET-PREFER-TERSE-PARAPHRASE?");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0583", "f35752", "S#39418", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0583", "f35753", "SET-MAXIMIZE-LINKS?");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0583", "f35754", "S#39419", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0583", "f35755", "S#39420", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0583", "f35756", "S#39421", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0583", "f35757", "S#39422", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0583", "f35758", "S#39423", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0583", "f35759", "SET-USE-TITLE-CAPITALIZATION?");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0583", "f35760", "S#39424", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0583", "f35761", "SET-ADD-DETERMINERS-BEFORE-VARIABLES?");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0583", "f35762", "S#39425", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0583", "f35763", "SET-QUANTIFY-VARIABLES?");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0583", "f35764", "S#39426", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0583", "f35765", "SET-HIDE-EXPLICIT-UNIVERSALS?");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0583", "f35766", "S#39427", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0583", "f35767", "S#39428", 1, 0, false);
        return (SubLObject)module0583.NIL;
    }
    
    public static SubLObject f35769() {
        return (SubLObject)module0583.NIL;
    }
    
    public static SubLObject f35770() {
        module0002.f50((SubLObject)module0583.$ic0$, (SubLObject)module0583.$ic1$);
        module0002.f38((SubLObject)module0583.$ic1$);
        SubLObject var48 = (SubLObject)module0583.$ic7$;
        var48 = conses_high.putf(var48, (SubLObject)module0583.$ic8$, module0582.f35699((SubLObject)module0583.$ic4$));
        module0582.f35705((SubLObject)module0583.$ic4$, var48);
        module0582.f35697((SubLObject)module0583.$ic4$, var48);
        module0002.f50((SubLObject)module0583.$ic9$, (SubLObject)module0583.$ic10$);
        module0002.f38((SubLObject)module0583.$ic10$);
        var48 = (SubLObject)module0583.$ic14$;
        var48 = conses_high.putf(var48, (SubLObject)module0583.$ic8$, module0582.f35699((SubLObject)module0583.$ic12$));
        module0582.f35705((SubLObject)module0583.$ic12$, var48);
        module0582.f35697((SubLObject)module0583.$ic12$, var48);
        module0002.f50((SubLObject)module0583.$ic15$, (SubLObject)module0583.$ic16$);
        module0002.f38((SubLObject)module0583.$ic16$);
        var48 = (SubLObject)module0583.$ic20$;
        var48 = conses_high.putf(var48, (SubLObject)module0583.$ic8$, module0582.f35699((SubLObject)module0583.$ic18$));
        module0582.f35705((SubLObject)module0583.$ic18$, var48);
        module0582.f35697((SubLObject)module0583.$ic18$, var48);
        module0002.f50((SubLObject)module0583.$ic21$, (SubLObject)module0583.$ic22$);
        module0002.f38((SubLObject)module0583.$ic22$);
        var48 = (SubLObject)module0583.$ic25$;
        var48 = conses_high.putf(var48, (SubLObject)module0583.$ic8$, module0582.f35699((SubLObject)module0583.$ic23$));
        module0582.f35705((SubLObject)module0583.$ic23$, var48);
        module0582.f35697((SubLObject)module0583.$ic23$, var48);
        module0002.f50((SubLObject)module0583.$ic26$, (SubLObject)module0583.$ic27$);
        module0002.f38((SubLObject)module0583.$ic27$);
        var48 = (SubLObject)module0583.$ic31$;
        var48 = conses_high.putf(var48, (SubLObject)module0583.$ic8$, module0582.f35699((SubLObject)module0583.$ic29$));
        module0582.f35705((SubLObject)module0583.$ic29$, var48);
        module0582.f35697((SubLObject)module0583.$ic29$, var48);
        module0002.f50((SubLObject)module0583.$ic32$, (SubLObject)module0583.$ic33$);
        module0002.f38((SubLObject)module0583.$ic33$);
        var48 = (SubLObject)module0583.$ic37$;
        var48 = conses_high.putf(var48, (SubLObject)module0583.$ic8$, module0582.f35699((SubLObject)module0583.$ic35$));
        module0582.f35705((SubLObject)module0583.$ic35$, var48);
        module0582.f35697((SubLObject)module0583.$ic35$, var48);
        module0002.f50((SubLObject)module0583.$ic38$, (SubLObject)module0583.$ic39$);
        module0002.f38((SubLObject)module0583.$ic39$);
        var48 = (SubLObject)module0583.$ic43$;
        var48 = conses_high.putf(var48, (SubLObject)module0583.$ic8$, module0582.f35699((SubLObject)module0583.$ic41$));
        module0582.f35705((SubLObject)module0583.$ic41$, var48);
        module0582.f35697((SubLObject)module0583.$ic41$, var48);
        module0002.f50((SubLObject)module0583.$ic44$, (SubLObject)module0583.$ic45$);
        module0002.f38((SubLObject)module0583.$ic45$);
        var48 = (SubLObject)module0583.$ic48$;
        var48 = conses_high.putf(var48, (SubLObject)module0583.$ic8$, module0582.f35699((SubLObject)module0583.$ic46$));
        module0582.f35705((SubLObject)module0583.$ic46$, var48);
        module0582.f35697((SubLObject)module0583.$ic46$, var48);
        module0002.f50((SubLObject)module0583.$ic51$, (SubLObject)module0583.$ic52$);
        module0002.f38((SubLObject)module0583.$ic52$);
        var48 = (SubLObject)module0583.$ic55$;
        var48 = conses_high.putf(var48, (SubLObject)module0583.$ic8$, module0582.f35699((SubLObject)module0583.$ic53$));
        module0582.f35705((SubLObject)module0583.$ic53$, var48);
        module0582.f35697((SubLObject)module0583.$ic53$, var48);
        module0002.f50((SubLObject)module0583.$ic56$, (SubLObject)module0583.$ic57$);
        module0002.f38((SubLObject)module0583.$ic57$);
        var48 = (SubLObject)module0583.$ic60$;
        var48 = conses_high.putf(var48, (SubLObject)module0583.$ic8$, module0582.f35699((SubLObject)module0583.$ic58$));
        module0582.f35705((SubLObject)module0583.$ic58$, var48);
        module0582.f35697((SubLObject)module0583.$ic58$, var48);
        module0002.f50((SubLObject)module0583.$ic61$, (SubLObject)module0583.$ic62$);
        module0002.f38((SubLObject)module0583.$ic62$);
        var48 = (SubLObject)module0583.$ic66$;
        var48 = conses_high.putf(var48, (SubLObject)module0583.$ic8$, module0582.f35699((SubLObject)module0583.$ic64$));
        module0582.f35705((SubLObject)module0583.$ic64$, var48);
        module0582.f35697((SubLObject)module0583.$ic64$, var48);
        module0002.f50((SubLObject)module0583.$ic69$, (SubLObject)module0583.$ic70$);
        module0002.f38((SubLObject)module0583.$ic70$);
        var48 = (SubLObject)module0583.$ic74$;
        var48 = conses_high.putf(var48, (SubLObject)module0583.$ic8$, module0582.f35699((SubLObject)module0583.$ic72$));
        module0582.f35705((SubLObject)module0583.$ic72$, var48);
        module0582.f35697((SubLObject)module0583.$ic72$, var48);
        module0002.f50((SubLObject)module0583.$ic75$, (SubLObject)module0583.$ic76$);
        module0002.f38((SubLObject)module0583.$ic76$);
        var48 = (SubLObject)module0583.$ic79$;
        var48 = conses_high.putf(var48, (SubLObject)module0583.$ic8$, module0582.f35699((SubLObject)module0583.$ic77$));
        module0582.f35705((SubLObject)module0583.$ic77$, var48);
        module0582.f35697((SubLObject)module0583.$ic77$, var48);
        module0002.f50((SubLObject)module0583.$ic80$, (SubLObject)module0583.$ic81$);
        module0002.f38((SubLObject)module0583.$ic81$);
        var48 = (SubLObject)module0583.$ic85$;
        var48 = conses_high.putf(var48, (SubLObject)module0583.$ic8$, module0582.f35699((SubLObject)module0583.$ic83$));
        module0582.f35705((SubLObject)module0583.$ic83$, var48);
        module0582.f35697((SubLObject)module0583.$ic83$, var48);
        module0002.f50((SubLObject)module0583.$ic88$, (SubLObject)module0583.$ic89$);
        module0002.f38((SubLObject)module0583.$ic89$);
        var48 = (SubLObject)module0583.$ic92$;
        var48 = conses_high.putf(var48, (SubLObject)module0583.$ic8$, module0582.f35699((SubLObject)module0583.$ic90$));
        module0582.f35705((SubLObject)module0583.$ic90$, var48);
        module0582.f35697((SubLObject)module0583.$ic90$, var48);
        module0002.f50((SubLObject)module0583.$ic93$, (SubLObject)module0583.$ic94$);
        module0002.f38((SubLObject)module0583.$ic94$);
        var48 = (SubLObject)module0583.$ic97$;
        var48 = conses_high.putf(var48, (SubLObject)module0583.$ic8$, module0582.f35699((SubLObject)module0583.$ic95$));
        module0582.f35705((SubLObject)module0583.$ic95$, var48);
        module0582.f35697((SubLObject)module0583.$ic95$, var48);
        module0002.f50((SubLObject)module0583.$ic102$, (SubLObject)module0583.$ic103$);
        module0002.f38((SubLObject)module0583.$ic103$);
        var48 = (SubLObject)module0583.$ic106$;
        var48 = conses_high.putf(var48, (SubLObject)module0583.$ic8$, module0582.f35699((SubLObject)module0583.$ic104$));
        module0582.f35705((SubLObject)module0583.$ic104$, var48);
        module0582.f35697((SubLObject)module0583.$ic104$, var48);
        module0002.f50((SubLObject)module0583.$ic107$, (SubLObject)module0583.$ic108$);
        module0002.f38((SubLObject)module0583.$ic108$);
        var48 = (SubLObject)module0583.$ic111$;
        var48 = conses_high.putf(var48, (SubLObject)module0583.$ic8$, module0582.f35699((SubLObject)module0583.$ic109$));
        module0582.f35705((SubLObject)module0583.$ic109$, var48);
        module0582.f35697((SubLObject)module0583.$ic109$, var48);
        module0002.f50((SubLObject)module0583.$ic112$, (SubLObject)module0583.$ic113$);
        module0002.f38((SubLObject)module0583.$ic113$);
        var48 = (SubLObject)module0583.$ic116$;
        var48 = conses_high.putf(var48, (SubLObject)module0583.$ic8$, module0582.f35699((SubLObject)module0583.$ic114$));
        module0582.f35705((SubLObject)module0583.$ic114$, var48);
        module0582.f35697((SubLObject)module0583.$ic114$, var48);
        module0002.f50((SubLObject)module0583.$ic117$, (SubLObject)module0583.$ic118$);
        module0002.f38((SubLObject)module0583.$ic118$);
        var48 = (SubLObject)module0583.$ic121$;
        var48 = conses_high.putf(var48, (SubLObject)module0583.$ic8$, module0582.f35699((SubLObject)module0583.$ic119$));
        module0582.f35705((SubLObject)module0583.$ic119$, var48);
        module0582.f35697((SubLObject)module0583.$ic119$, var48);
        return (SubLObject)module0583.NIL;
    }
    
    public void declareFunctions() {
        f35768();
    }
    
    public void initializeVariables() {
        f35769();
    }
    
    public void runTopLevelForms() {
        f35770();
    }
    
    static {
        me = (SubLFile)new module0583();
        $ic0$ = SubLObjectFactory.makeSymbol("S#39397", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("SET-PPH-LEXICAL-CONTEXT");
        $ic2$ = SubLObjectFactory.makeSymbol("LEXICAL-CONTEXT-P");
        $ic3$ = SubLObjectFactory.makeSymbol("S#39392", "CYC");
        $ic4$ = SubLObjectFactory.makeKeyword("PPH-LEXICAL-CONTEXT");
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39393", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"));
        $ic6$ = SubLObjectFactory.makeUninternedSymbol("US#5126656");
        $ic7$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("TOP-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("CORRESPONDING-GLOBAL"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-LANGUAGE-MT*"), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICAL-CONTEXT-P"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("The context from which to look up lexical information and paraphrase templates."));
        $ic8$ = SubLObjectFactory.makeKeyword("SETTER");
        $ic9$ = SubLObjectFactory.makeSymbol("S#39398", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("SET-PPH-SEMANTIC-MT");
        $ic11$ = SubLObjectFactory.makeSymbol("S#12263", "CYC");
        $ic12$ = SubLObjectFactory.makeKeyword("PPH-SEMANTIC-MT");
        $ic13$ = SubLObjectFactory.makeUninternedSymbol("US#5126656");
        $ic14$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("TOP-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("CORRESPONDING-GLOBAL"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-DOMAIN-MT*"), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12263", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("The context from which to look up information about the domain of discourse."));
        $ic15$ = SubLObjectFactory.makeSymbol("S#39399", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("SET-PPH-BACKGROUND-DISCOURSE");
        $ic17$ = SubLObjectFactory.makeSymbol("TRUE");
        $ic18$ = SubLObjectFactory.makeKeyword("PPH-BACKGROUND-DISCOURSE");
        $ic19$ = SubLObjectFactory.makeUninternedSymbol("US#5126656");
        $ic20$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("TOP-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TRUE"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("The background discourse for paraphrasing."), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT-VALUE-FORM"), (SubLObject)module0583.NIL);
        $ic21$ = SubLObjectFactory.makeSymbol("S#39400", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("SET-PPH-DISCOURSE-CONTEXTS-TO-UPDATE");
        $ic23$ = SubLObjectFactory.makeKeyword("PPH-DISCOURSE-CONTEXTS-TO-UPDATE");
        $ic24$ = SubLObjectFactory.makeUninternedSymbol("US#5126656");
        $ic25$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("TOP-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TRUE"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("Discourse contexts that should be updated with information from this paraphrase."), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT-VALUE-FORM"), (SubLObject)module0583.NIL);
        $ic26$ = SubLObjectFactory.makeSymbol("S#39401", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("SET-PPH-GENERATION-COUNT");
        $ic28$ = SubLObjectFactory.makeSymbol("S#4751", "CYC");
        $ic29$ = SubLObjectFactory.makeKeyword("PPH-GENERATION-COUNT");
        $ic30$ = SubLObjectFactory.makeUninternedSymbol("US#5126656");
        $ic31$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("TOP-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("S#4751", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("The maximum number of paraphrases to generate."), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT-VALUE-FORM"), (SubLObject)module0583.ONE_INTEGER);
        $ic32$ = SubLObjectFactory.makeSymbol("S#39402", "CYC");
        $ic33$ = SubLObjectFactory.makeSymbol("SET-PPH-AGREEMENT");
        $ic34$ = SubLObjectFactory.makeSymbol("S#39395", "CYC");
        $ic35$ = SubLObjectFactory.makeKeyword("PPH-AGREEMENT");
        $ic36$ = SubLObjectFactory.makeUninternedSymbol("US#5126656");
        $ic37$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("TOP-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("S#39395", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("Which agreement predicates are preferred for the head of this phrase? If left at the default, the paraphrase code will attempt to set this parameter appropriately."), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT-VALUE-FORM"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT"));
        $ic38$ = SubLObjectFactory.makeSymbol("S#39403", "CYC");
        $ic39$ = SubLObjectFactory.makeSymbol("SET-PPH-SENTENTIAL-FORCE");
        $ic40$ = SubLObjectFactory.makeSymbol("S#39396", "CYC");
        $ic41$ = SubLObjectFactory.makeKeyword("PPH-SENTENTIAL-FORCE");
        $ic42$ = SubLObjectFactory.makeUninternedSymbol("US#5126656");
        $ic43$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("TOP-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("S#39396", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("What sentential force should be used for paraphrases? If left at the default, the paraphrase code will attempt to set this parameter appropriately."), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT-VALUE-FORM"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT"));
        $ic44$ = SubLObjectFactory.makeSymbol("S#39404", "CYC");
        $ic45$ = SubLObjectFactory.makeSymbol("SET-PPH-TIMEOUT");
        $ic46$ = SubLObjectFactory.makeKeyword("PPH-TIMEOUT");
        $ic47$ = SubLObjectFactory.makeUninternedSymbol("US#5126656");
        $ic48$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("TOP-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("S#4751", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("After how many seconds should we give up? Granularity is the internal time unit of the image, typically millisecond or microsecond."), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT-VALUE-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSITIVE-INFINITY")));
        $ic49$ = SubLObjectFactory.makeKeyword("TOP-LEVEL");
        $ic50$ = SubLObjectFactory.makeSymbol("S#39405", "CYC");
        $ic51$ = SubLObjectFactory.makeSymbol("S#39407", "CYC");
        $ic52$ = SubLObjectFactory.makeSymbol("SET-MAX-DIGITS-WITHOUT-COMMA");
        $ic53$ = SubLObjectFactory.makeKeyword("MAX-DIGITS-WITHOUT-COMMA");
        $ic54$ = SubLObjectFactory.makeUninternedSymbol("US#5126656");
        $ic55$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("PPH-FORMAT"), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("S#4751", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("max number of digits a number can have and still generate with no commas."), (SubLObject)SubLObjectFactory.makeKeyword("CORRESPONDING-GLOBAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#38994", "CYC"));
        $ic56$ = SubLObjectFactory.makeSymbol("S#39408", "CYC");
        $ic57$ = SubLObjectFactory.makeSymbol("SET-SIGNIFICANT-DIGITS-CUTOFF");
        $ic58$ = SubLObjectFactory.makeKeyword("SIGNIFICANT-DIGITS-CUTOFF");
        $ic59$ = SubLObjectFactory.makeUninternedSymbol("US#5126656");
        $ic60$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("PPH-FORMAT"), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("S#4751", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("To how many significant digits should we truncate the display of numbers?"), (SubLObject)SubLObjectFactory.makeKeyword("CORRESPONDING-GLOBAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#38995", "CYC"));
        $ic61$ = SubLObjectFactory.makeSymbol("S#39409", "CYC");
        $ic62$ = SubLObjectFactory.makeSymbol("SET-USE-INDEXICAL-DATES?");
        $ic63$ = SubLObjectFactory.makeSymbol("BOOLEANP");
        $ic64$ = SubLObjectFactory.makeKeyword("USE-INDEXICAL-DATES?");
        $ic65$ = SubLObjectFactory.makeUninternedSymbol("US#5126656");
        $ic66$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("PPH-FORMAT"), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("Should we use 'yesterday', etc. for dates that we can identify?"), (SubLObject)SubLObjectFactory.makeKeyword("CORRESPONDING-GLOBAL"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-USE-INDEXICAL-DATES?*"));
        $ic67$ = SubLObjectFactory.makeKeyword("PPH-FORMAT");
        $ic68$ = SubLObjectFactory.makeSymbol("S#39410", "CYC");
        $ic69$ = SubLObjectFactory.makeSymbol("S#39412", "CYC");
        $ic70$ = SubLObjectFactory.makeSymbol("SET-DEMERIT-CUTOFF");
        $ic71$ = SubLObjectFactory.makeSymbol("S#4723", "CYC");
        $ic72$ = SubLObjectFactory.makeKeyword("DEMERIT-CUTOFF");
        $ic73$ = SubLObjectFactory.makeUninternedSymbol("US#5126656");
        $ic74$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("PPH-GOODNESS"), SubLObjectFactory.makeKeyword("CORRESPONDING-GLOBAL"), SubLObjectFactory.makeSymbol("S#9978", "CYC"), SubLObjectFactory.makeKeyword("CHECK-TYPE"), SubLObjectFactory.makeSymbol("S#4723", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("What is the worst paraphase quality we should tolerate before returning NIL instead of a string.\nDefault is to consider any string better than nothing.\nSee @xref *PPH-SUGGESTED-DEMERIT-CUTOFF* for a middle-of-the-road value."), SubLObjectFactory.makeKeyword("DEFAULT-VALUE-FORM"), SubLObjectFactory.makeSymbol("S#9978", "CYC") });
        $ic75$ = SubLObjectFactory.makeSymbol("S#39413", "CYC");
        $ic76$ = SubLObjectFactory.makeSymbol("SET-USE-SMART-VARIABLE-REPLACEMENT?");
        $ic77$ = SubLObjectFactory.makeKeyword("USE-SMART-VARIABLE-REPLACEMENT?");
        $ic78$ = SubLObjectFactory.makeUninternedSymbol("US#5126656");
        $ic79$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("PPH-GOODNESS"), (SubLObject)SubLObjectFactory.makeKeyword("CORRESPONDING-GLOBAL"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-USE-SMART-VARIABLE-REPLACEMENT?*"), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("Should the paraphrase code 'intelligently' use NL phrases for variables that look like they need it?"));
        $ic80$ = SubLObjectFactory.makeSymbol("S#39414", "CYC");
        $ic81$ = SubLObjectFactory.makeSymbol("SET-GENLPREDS-BACKOFF-LIMIT");
        $ic82$ = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic83$ = SubLObjectFactory.makeKeyword("GENLPREDS-BACKOFF-LIMIT");
        $ic84$ = SubLObjectFactory.makeUninternedSymbol("US#5126656");
        $ic85$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("PPH-GOODNESS"), (SubLObject)SubLObjectFactory.makeKeyword("CORRESPONDING-GLOBAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#38988", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("When traversing the genl-preds hierarchy looking for alternative preds with which to paraphrase the input, stop looking after you've looked this many times -- then meaning starts getting lost."));
        $ic86$ = SubLObjectFactory.makeKeyword("PPH-GOODNESS");
        $ic87$ = SubLObjectFactory.makeSymbol("S#39415", "CYC");
        $ic88$ = SubLObjectFactory.makeSymbol("S#39417", "CYC");
        $ic89$ = SubLObjectFactory.makeSymbol("SET-PREFER-TERSE-PARAPHRASE?");
        $ic90$ = SubLObjectFactory.makeKeyword("PREFER-TERSE-PARAPHRASE?");
        $ic91$ = SubLObjectFactory.makeUninternedSymbol("US#5126656");
        $ic92$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("PPH-PRECISION"), (SubLObject)SubLObjectFactory.makeKeyword("CORRESPONDING-GLOBAL"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-TERSE-MODE?*"), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("Should we prefer terse paraphrases?"));
        $ic93$ = SubLObjectFactory.makeSymbol("S#39418", "CYC");
        $ic94$ = SubLObjectFactory.makeSymbol("SET-MAXIMIZE-LINKS?");
        $ic95$ = SubLObjectFactory.makeKeyword("MAXIMIZE-LINKS?");
        $ic96$ = SubLObjectFactory.makeUninternedSymbol("US#5126656");
        $ic97$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("PPH-PRECISION"), (SubLObject)SubLObjectFactory.makeKeyword("CORRESPONDING-GLOBAL"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-MAXIMIZE-LINKS?*"), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("Should we link as much of the input CycL to output strings as we can? The tradeoff for this is typically terseness and readability."));
        $ic98$ = SubLObjectFactory.makeKeyword("PPH-PRECISION");
        $ic99$ = SubLObjectFactory.makeSymbol("S#39419", "CYC");
        $ic100$ = SubLObjectFactory.makeKeyword("PPH-FORMALITY");
        $ic101$ = SubLObjectFactory.makeSymbol("S#39421", "CYC");
        $ic102$ = SubLObjectFactory.makeSymbol("S#39423", "CYC");
        $ic103$ = SubLObjectFactory.makeSymbol("SET-USE-TITLE-CAPITALIZATION?");
        $ic104$ = SubLObjectFactory.makeKeyword("USE-TITLE-CAPITALIZATION?");
        $ic105$ = SubLObjectFactory.makeUninternedSymbol("US#5126656");
        $ic106$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("PPH-MISC"), (SubLObject)SubLObjectFactory.makeKeyword("CORRESPONDING-GLOBAL"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-USE-TITLE-CAPITALIZATION?*"), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("Should we capitalize the output like a book, etc., title?"));
        $ic107$ = SubLObjectFactory.makeSymbol("S#39424", "CYC");
        $ic108$ = SubLObjectFactory.makeSymbol("SET-ADD-DETERMINERS-BEFORE-VARIABLES?");
        $ic109$ = SubLObjectFactory.makeKeyword("ADD-DETERMINERS-BEFORE-VARIABLES?");
        $ic110$ = SubLObjectFactory.makeUninternedSymbol("US#5126656");
        $ic111$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("PPH-MISC"), (SubLObject)SubLObjectFactory.makeKeyword("CORRESPONDING-GLOBAL"), (SubLObject)SubLObjectFactory.makeSymbol("*DETERMINERS-BEFORE-VARIABLES*"), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("Shall we try to put the correct determiner before variables, too?"));
        $ic112$ = SubLObjectFactory.makeSymbol("S#39425", "CYC");
        $ic113$ = SubLObjectFactory.makeSymbol("SET-QUANTIFY-VARIABLES?");
        $ic114$ = SubLObjectFactory.makeKeyword("QUANTIFY-VARIABLES?");
        $ic115$ = SubLObjectFactory.makeUninternedSymbol("US#5126656");
        $ic116$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("PPH-MISC"), (SubLObject)SubLObjectFactory.makeKeyword("CORRESPONDING-GLOBAL"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-QUANTIFY-VARS?*"), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("Should the paraphrase code 'intelligently' add quantification for variables that look like they need it?"));
        $ic117$ = SubLObjectFactory.makeSymbol("S#39426", "CYC");
        $ic118$ = SubLObjectFactory.makeSymbol("SET-HIDE-EXPLICIT-UNIVERSALS?");
        $ic119$ = SubLObjectFactory.makeKeyword("HIDE-EXPLICIT-UNIVERSALS?");
        $ic120$ = SubLObjectFactory.makeUninternedSymbol("US#5126656");
        $ic121$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("PPH-MISC"), (SubLObject)SubLObjectFactory.makeKeyword("CORRESPONDING-GLOBAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#38986", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("Should we skip the 'For every X, Y, and Z'?"));
        $ic122$ = SubLObjectFactory.makeKeyword("PPH-MISC");
        $ic123$ = SubLObjectFactory.makeSymbol("S#39427", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0583.class
	Total time: 218 ms
	
	Decompiled with Procyon 0.5.32.
*/