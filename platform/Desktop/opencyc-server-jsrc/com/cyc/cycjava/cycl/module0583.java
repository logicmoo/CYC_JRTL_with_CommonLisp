package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        assert NIL != module0747.f46315(var2) : var2;
        assert NIL != module0747.f46310(var1) : var1;
        module0582.f35701(var1, (SubLObject)$ic4$, var2);
        return var1;
    }
    
    public static SubLObject f35717(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic5$);
        var7 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic5$);
        var8 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var9 = (SubLObject)$ic6$;
            return module0582.f35702(var7, var9, var8, (SubLObject)$ic0$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic5$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35718(final SubLObject var1, final SubLObject var2) {
        assert NIL != module0161.f10481(var2) : var2;
        assert NIL != module0747.f46310(var1) : var1;
        module0582.f35701(var1, (SubLObject)$ic12$, var2);
        return var1;
    }
    
    public static SubLObject f35719(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic5$);
        var7 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic5$);
        var8 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var9 = (SubLObject)$ic13$;
            return module0582.f35702(var7, var9, var8, (SubLObject)$ic9$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic5$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35720(final SubLObject var1, final SubLObject var2) {
        assert NIL != Types.sublisp_true(var2) : var2;
        assert NIL != module0747.f46310(var1) : var1;
        module0582.f35701(var1, (SubLObject)$ic18$, var2);
        return var1;
    }
    
    public static SubLObject f35721(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic5$);
        var7 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic5$);
        var8 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var9 = (SubLObject)$ic19$;
            return module0582.f35702(var7, var9, var8, (SubLObject)$ic15$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic5$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35722(final SubLObject var1, final SubLObject var2) {
        assert NIL != Types.sublisp_true(var2) : var2;
        assert NIL != module0747.f46310(var1) : var1;
        module0582.f35701(var1, (SubLObject)$ic23$, var2);
        return var1;
    }
    
    public static SubLObject f35723(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic5$);
        var7 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic5$);
        var8 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var9 = (SubLObject)$ic24$;
            return module0582.f35702(var7, var9, var8, (SubLObject)$ic21$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic5$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35724(final SubLObject var1, final SubLObject var2) {
        assert NIL != module0048.f3358(var2) : var2;
        assert NIL != module0747.f46310(var1) : var1;
        module0582.f35701(var1, (SubLObject)$ic29$, var2);
        return var1;
    }
    
    public static SubLObject f35725(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic5$);
        var7 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic5$);
        var8 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var9 = (SubLObject)$ic30$;
            return module0582.f35702(var7, var9, var8, (SubLObject)$ic26$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic5$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35726(final SubLObject var1, final SubLObject var2) {
        assert NIL != module0751.f46980(var2) : var2;
        assert NIL != module0747.f46310(var1) : var1;
        module0582.f35701(var1, (SubLObject)$ic35$, var2);
        return var1;
    }
    
    public static SubLObject f35727(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic5$);
        var7 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic5$);
        var8 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var9 = (SubLObject)$ic36$;
            return module0582.f35702(var7, var9, var8, (SubLObject)$ic32$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic5$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35728(final SubLObject var1, final SubLObject var2) {
        assert NIL != module0761.f48130(var2) : var2;
        assert NIL != module0747.f46310(var1) : var1;
        module0582.f35701(var1, (SubLObject)$ic41$, var2);
        return var1;
    }
    
    public static SubLObject f35729(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic5$);
        var7 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic5$);
        var8 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var9 = (SubLObject)$ic42$;
            return module0582.f35702(var7, var9, var8, (SubLObject)$ic38$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic5$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35730(final SubLObject var1, final SubLObject var2) {
        assert NIL != module0048.f3358(var2) : var2;
        assert NIL != module0747.f46310(var1) : var1;
        module0582.f35701(var1, (SubLObject)$ic46$, var2);
        return var1;
    }
    
    public static SubLObject f35731(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic5$);
        var7 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic5$);
        var8 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var9 = (SubLObject)$ic47$;
            return module0582.f35702(var7, var9, var8, (SubLObject)$ic44$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic5$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35732(final SubLObject var22) {
        return Equality.eq((SubLObject)$ic49$, module0582.f35706(var22));
    }
    
    public static SubLObject f35733(final SubLObject var23) {
        return module0035.f2331(var23, (SubLObject)$ic50$);
    }
    
    public static SubLObject f35734(final SubLObject var1, final SubLObject var2) {
        assert NIL != module0048.f3358(var2) : var2;
        assert NIL != module0747.f46310(var1) : var1;
        module0582.f35701(var1, (SubLObject)$ic53$, var2);
        return var1;
    }
    
    public static SubLObject f35735(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic5$);
        var7 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic5$);
        var8 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var9 = (SubLObject)$ic54$;
            return module0582.f35702(var7, var9, var8, (SubLObject)$ic51$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic5$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35736(final SubLObject var1, final SubLObject var2) {
        assert NIL != module0048.f3358(var2) : var2;
        assert NIL != module0747.f46310(var1) : var1;
        module0582.f35701(var1, (SubLObject)$ic58$, var2);
        return var1;
    }
    
    public static SubLObject f35737(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic5$);
        var7 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic5$);
        var8 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var9 = (SubLObject)$ic59$;
            return module0582.f35702(var7, var9, var8, (SubLObject)$ic56$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic5$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35738(final SubLObject var1, final SubLObject var2) {
        assert NIL != Types.booleanp(var2) : var2;
        assert NIL != module0747.f46310(var1) : var1;
        module0582.f35701(var1, (SubLObject)$ic64$, var2);
        return var1;
    }
    
    public static SubLObject f35739(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic5$);
        var7 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic5$);
        var8 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var9 = (SubLObject)$ic65$;
            return module0582.f35702(var7, var9, var8, (SubLObject)$ic61$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic5$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35740(final SubLObject var22) {
        return Equality.eq(module0582.f35706(var22), (SubLObject)$ic67$);
    }
    
    public static SubLObject f35741(final SubLObject var23) {
        return module0035.f2331(var23, (SubLObject)$ic68$);
    }
    
    public static SubLObject f35742(final SubLObject var1, final SubLObject var2) {
        assert NIL != module0048.f3331(var2) : var2;
        assert NIL != module0747.f46310(var1) : var1;
        module0582.f35701(var1, (SubLObject)$ic72$, var2);
        return var1;
    }
    
    public static SubLObject f35743(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic5$);
        var7 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic5$);
        var8 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var9 = (SubLObject)$ic73$;
            return module0582.f35702(var7, var9, var8, (SubLObject)$ic69$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic5$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35744(final SubLObject var1, final SubLObject var2) {
        assert NIL != Types.booleanp(var2) : var2;
        assert NIL != module0747.f46310(var1) : var1;
        module0582.f35701(var1, (SubLObject)$ic77$, var2);
        return var1;
    }
    
    public static SubLObject f35745(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic5$);
        var7 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic5$);
        var8 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var9 = (SubLObject)$ic78$;
            return module0582.f35702(var7, var9, var8, (SubLObject)$ic75$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic5$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35746(final SubLObject var1, final SubLObject var2) {
        assert NIL != module0004.f106(var2) : var2;
        assert NIL != module0747.f46310(var1) : var1;
        module0582.f35701(var1, (SubLObject)$ic83$, var2);
        return var1;
    }
    
    public static SubLObject f35747(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic5$);
        var7 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic5$);
        var8 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var9 = (SubLObject)$ic84$;
            return module0582.f35702(var7, var9, var8, (SubLObject)$ic80$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic5$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35748(final SubLObject var22) {
        return Equality.eq(module0582.f35706(var22), (SubLObject)$ic86$);
    }
    
    public static SubLObject f35749(final SubLObject var23) {
        return module0035.f2331(var23, (SubLObject)$ic87$);
    }
    
    public static SubLObject f35750(final SubLObject var1, final SubLObject var2) {
        assert NIL != Types.booleanp(var2) : var2;
        assert NIL != module0747.f46310(var1) : var1;
        module0582.f35701(var1, (SubLObject)$ic90$, var2);
        return var1;
    }
    
    public static SubLObject f35751(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic5$);
        var7 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic5$);
        var8 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var9 = (SubLObject)$ic91$;
            return module0582.f35702(var7, var9, var8, (SubLObject)$ic88$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic5$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35752(final SubLObject var1, final SubLObject var2) {
        assert NIL != Types.booleanp(var2) : var2;
        assert NIL != module0747.f46310(var1) : var1;
        module0582.f35701(var1, (SubLObject)$ic95$, var2);
        return var1;
    }
    
    public static SubLObject f35753(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic5$);
        var7 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic5$);
        var8 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var9 = (SubLObject)$ic96$;
            return module0582.f35702(var7, var9, var8, (SubLObject)$ic93$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic5$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35754(final SubLObject var22) {
        return Equality.eq(module0582.f35706(var22), (SubLObject)$ic98$);
    }
    
    public static SubLObject f35755(final SubLObject var23) {
        return module0035.f2331(var23, (SubLObject)$ic99$);
    }
    
    public static SubLObject f35756(final SubLObject var22) {
        return Equality.eq(module0582.f35706(var22), (SubLObject)$ic100$);
    }
    
    public static SubLObject f35757(final SubLObject var23) {
        return module0035.f2331(var23, (SubLObject)$ic101$);
    }
    
    public static SubLObject f35758(final SubLObject var1, final SubLObject var2) {
        assert NIL != Types.booleanp(var2) : var2;
        assert NIL != module0747.f46310(var1) : var1;
        module0582.f35701(var1, (SubLObject)$ic104$, var2);
        return var1;
    }
    
    public static SubLObject f35759(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic5$);
        var7 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic5$);
        var8 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var9 = (SubLObject)$ic105$;
            return module0582.f35702(var7, var9, var8, (SubLObject)$ic102$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic5$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35760(final SubLObject var1, final SubLObject var2) {
        assert NIL != Types.booleanp(var2) : var2;
        assert NIL != module0747.f46310(var1) : var1;
        module0582.f35701(var1, (SubLObject)$ic109$, var2);
        return var1;
    }
    
    public static SubLObject f35761(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic5$);
        var7 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic5$);
        var8 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var9 = (SubLObject)$ic110$;
            return module0582.f35702(var7, var9, var8, (SubLObject)$ic107$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic5$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35762(final SubLObject var1, final SubLObject var2) {
        assert NIL != Types.booleanp(var2) : var2;
        assert NIL != module0747.f46310(var1) : var1;
        module0582.f35701(var1, (SubLObject)$ic114$, var2);
        return var1;
    }
    
    public static SubLObject f35763(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic5$);
        var7 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic5$);
        var8 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var9 = (SubLObject)$ic115$;
            return module0582.f35702(var7, var9, var8, (SubLObject)$ic112$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic5$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35764(final SubLObject var1, final SubLObject var2) {
        assert NIL != Types.booleanp(var2) : var2;
        assert NIL != module0747.f46310(var1) : var1;
        module0582.f35701(var1, (SubLObject)$ic119$, var2);
        return var1;
    }
    
    public static SubLObject f35765(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic5$);
        var7 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic5$);
        var8 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            final SubLObject var9 = (SubLObject)$ic120$;
            return module0582.f35702(var7, var9, var8, (SubLObject)$ic117$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic5$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35766(final SubLObject var22) {
        return Equality.eq(module0582.f35706(var22), (SubLObject)$ic122$);
    }
    
    public static SubLObject f35767(final SubLObject var23) {
        return module0035.f2331(var23, (SubLObject)$ic123$);
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35769() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35770() {
        module0002.f50((SubLObject)$ic0$, (SubLObject)$ic1$);
        module0002.f38((SubLObject)$ic1$);
        SubLObject var48 = (SubLObject)$ic7$;
        var48 = conses_high.putf(var48, (SubLObject)$ic8$, module0582.f35699((SubLObject)$ic4$));
        module0582.f35705((SubLObject)$ic4$, var48);
        module0582.f35697((SubLObject)$ic4$, var48);
        module0002.f50((SubLObject)$ic9$, (SubLObject)$ic10$);
        module0002.f38((SubLObject)$ic10$);
        var48 = (SubLObject)$ic14$;
        var48 = conses_high.putf(var48, (SubLObject)$ic8$, module0582.f35699((SubLObject)$ic12$));
        module0582.f35705((SubLObject)$ic12$, var48);
        module0582.f35697((SubLObject)$ic12$, var48);
        module0002.f50((SubLObject)$ic15$, (SubLObject)$ic16$);
        module0002.f38((SubLObject)$ic16$);
        var48 = (SubLObject)$ic20$;
        var48 = conses_high.putf(var48, (SubLObject)$ic8$, module0582.f35699((SubLObject)$ic18$));
        module0582.f35705((SubLObject)$ic18$, var48);
        module0582.f35697((SubLObject)$ic18$, var48);
        module0002.f50((SubLObject)$ic21$, (SubLObject)$ic22$);
        module0002.f38((SubLObject)$ic22$);
        var48 = (SubLObject)$ic25$;
        var48 = conses_high.putf(var48, (SubLObject)$ic8$, module0582.f35699((SubLObject)$ic23$));
        module0582.f35705((SubLObject)$ic23$, var48);
        module0582.f35697((SubLObject)$ic23$, var48);
        module0002.f50((SubLObject)$ic26$, (SubLObject)$ic27$);
        module0002.f38((SubLObject)$ic27$);
        var48 = (SubLObject)$ic31$;
        var48 = conses_high.putf(var48, (SubLObject)$ic8$, module0582.f35699((SubLObject)$ic29$));
        module0582.f35705((SubLObject)$ic29$, var48);
        module0582.f35697((SubLObject)$ic29$, var48);
        module0002.f50((SubLObject)$ic32$, (SubLObject)$ic33$);
        module0002.f38((SubLObject)$ic33$);
        var48 = (SubLObject)$ic37$;
        var48 = conses_high.putf(var48, (SubLObject)$ic8$, module0582.f35699((SubLObject)$ic35$));
        module0582.f35705((SubLObject)$ic35$, var48);
        module0582.f35697((SubLObject)$ic35$, var48);
        module0002.f50((SubLObject)$ic38$, (SubLObject)$ic39$);
        module0002.f38((SubLObject)$ic39$);
        var48 = (SubLObject)$ic43$;
        var48 = conses_high.putf(var48, (SubLObject)$ic8$, module0582.f35699((SubLObject)$ic41$));
        module0582.f35705((SubLObject)$ic41$, var48);
        module0582.f35697((SubLObject)$ic41$, var48);
        module0002.f50((SubLObject)$ic44$, (SubLObject)$ic45$);
        module0002.f38((SubLObject)$ic45$);
        var48 = (SubLObject)$ic48$;
        var48 = conses_high.putf(var48, (SubLObject)$ic8$, module0582.f35699((SubLObject)$ic46$));
        module0582.f35705((SubLObject)$ic46$, var48);
        module0582.f35697((SubLObject)$ic46$, var48);
        module0002.f50((SubLObject)$ic51$, (SubLObject)$ic52$);
        module0002.f38((SubLObject)$ic52$);
        var48 = (SubLObject)$ic55$;
        var48 = conses_high.putf(var48, (SubLObject)$ic8$, module0582.f35699((SubLObject)$ic53$));
        module0582.f35705((SubLObject)$ic53$, var48);
        module0582.f35697((SubLObject)$ic53$, var48);
        module0002.f50((SubLObject)$ic56$, (SubLObject)$ic57$);
        module0002.f38((SubLObject)$ic57$);
        var48 = (SubLObject)$ic60$;
        var48 = conses_high.putf(var48, (SubLObject)$ic8$, module0582.f35699((SubLObject)$ic58$));
        module0582.f35705((SubLObject)$ic58$, var48);
        module0582.f35697((SubLObject)$ic58$, var48);
        module0002.f50((SubLObject)$ic61$, (SubLObject)$ic62$);
        module0002.f38((SubLObject)$ic62$);
        var48 = (SubLObject)$ic66$;
        var48 = conses_high.putf(var48, (SubLObject)$ic8$, module0582.f35699((SubLObject)$ic64$));
        module0582.f35705((SubLObject)$ic64$, var48);
        module0582.f35697((SubLObject)$ic64$, var48);
        module0002.f50((SubLObject)$ic69$, (SubLObject)$ic70$);
        module0002.f38((SubLObject)$ic70$);
        var48 = (SubLObject)$ic74$;
        var48 = conses_high.putf(var48, (SubLObject)$ic8$, module0582.f35699((SubLObject)$ic72$));
        module0582.f35705((SubLObject)$ic72$, var48);
        module0582.f35697((SubLObject)$ic72$, var48);
        module0002.f50((SubLObject)$ic75$, (SubLObject)$ic76$);
        module0002.f38((SubLObject)$ic76$);
        var48 = (SubLObject)$ic79$;
        var48 = conses_high.putf(var48, (SubLObject)$ic8$, module0582.f35699((SubLObject)$ic77$));
        module0582.f35705((SubLObject)$ic77$, var48);
        module0582.f35697((SubLObject)$ic77$, var48);
        module0002.f50((SubLObject)$ic80$, (SubLObject)$ic81$);
        module0002.f38((SubLObject)$ic81$);
        var48 = (SubLObject)$ic85$;
        var48 = conses_high.putf(var48, (SubLObject)$ic8$, module0582.f35699((SubLObject)$ic83$));
        module0582.f35705((SubLObject)$ic83$, var48);
        module0582.f35697((SubLObject)$ic83$, var48);
        module0002.f50((SubLObject)$ic88$, (SubLObject)$ic89$);
        module0002.f38((SubLObject)$ic89$);
        var48 = (SubLObject)$ic92$;
        var48 = conses_high.putf(var48, (SubLObject)$ic8$, module0582.f35699((SubLObject)$ic90$));
        module0582.f35705((SubLObject)$ic90$, var48);
        module0582.f35697((SubLObject)$ic90$, var48);
        module0002.f50((SubLObject)$ic93$, (SubLObject)$ic94$);
        module0002.f38((SubLObject)$ic94$);
        var48 = (SubLObject)$ic97$;
        var48 = conses_high.putf(var48, (SubLObject)$ic8$, module0582.f35699((SubLObject)$ic95$));
        module0582.f35705((SubLObject)$ic95$, var48);
        module0582.f35697((SubLObject)$ic95$, var48);
        module0002.f50((SubLObject)$ic102$, (SubLObject)$ic103$);
        module0002.f38((SubLObject)$ic103$);
        var48 = (SubLObject)$ic106$;
        var48 = conses_high.putf(var48, (SubLObject)$ic8$, module0582.f35699((SubLObject)$ic104$));
        module0582.f35705((SubLObject)$ic104$, var48);
        module0582.f35697((SubLObject)$ic104$, var48);
        module0002.f50((SubLObject)$ic107$, (SubLObject)$ic108$);
        module0002.f38((SubLObject)$ic108$);
        var48 = (SubLObject)$ic111$;
        var48 = conses_high.putf(var48, (SubLObject)$ic8$, module0582.f35699((SubLObject)$ic109$));
        module0582.f35705((SubLObject)$ic109$, var48);
        module0582.f35697((SubLObject)$ic109$, var48);
        module0002.f50((SubLObject)$ic112$, (SubLObject)$ic113$);
        module0002.f38((SubLObject)$ic113$);
        var48 = (SubLObject)$ic116$;
        var48 = conses_high.putf(var48, (SubLObject)$ic8$, module0582.f35699((SubLObject)$ic114$));
        module0582.f35705((SubLObject)$ic114$, var48);
        module0582.f35697((SubLObject)$ic114$, var48);
        module0002.f50((SubLObject)$ic117$, (SubLObject)$ic118$);
        module0002.f38((SubLObject)$ic118$);
        var48 = (SubLObject)$ic121$;
        var48 = conses_high.putf(var48, (SubLObject)$ic8$, module0582.f35699((SubLObject)$ic119$));
        module0582.f35705((SubLObject)$ic119$, var48);
        module0582.f35697((SubLObject)$ic119$, var48);
        return (SubLObject)NIL;
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
        $ic0$ = makeSymbol("S#39397", "CYC");
        $ic1$ = makeSymbol("SET-PPH-LEXICAL-CONTEXT");
        $ic2$ = makeSymbol("LEXICAL-CONTEXT-P");
        $ic3$ = makeSymbol("S#39392", "CYC");
        $ic4$ = makeKeyword("PPH-LEXICAL-CONTEXT");
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#39393", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"));
        $ic6$ = makeUninternedSymbol("US#5126656");
        $ic7$ = ConsesLow.list((SubLObject)makeKeyword("TYPE"), (SubLObject)makeKeyword("TOP-LEVEL"), (SubLObject)makeKeyword("CORRESPONDING-GLOBAL"), (SubLObject)makeSymbol("*PPH-LANGUAGE-MT*"), (SubLObject)makeKeyword("CHECK-TYPE"), (SubLObject)makeSymbol("LEXICAL-CONTEXT-P"), (SubLObject)makeKeyword("DOCUMENTATION"), (SubLObject)makeString("The context from which to look up lexical information and paraphrase templates."));
        $ic8$ = makeKeyword("SETTER");
        $ic9$ = makeSymbol("S#39398", "CYC");
        $ic10$ = makeSymbol("SET-PPH-SEMANTIC-MT");
        $ic11$ = makeSymbol("S#12263", "CYC");
        $ic12$ = makeKeyword("PPH-SEMANTIC-MT");
        $ic13$ = makeUninternedSymbol("US#5126656");
        $ic14$ = ConsesLow.list((SubLObject)makeKeyword("TYPE"), (SubLObject)makeKeyword("TOP-LEVEL"), (SubLObject)makeKeyword("CORRESPONDING-GLOBAL"), (SubLObject)makeSymbol("*PPH-DOMAIN-MT*"), (SubLObject)makeKeyword("CHECK-TYPE"), (SubLObject)makeSymbol("S#12263", "CYC"), (SubLObject)makeKeyword("DOCUMENTATION"), (SubLObject)makeString("The context from which to look up information about the domain of discourse."));
        $ic15$ = makeSymbol("S#39399", "CYC");
        $ic16$ = makeSymbol("SET-PPH-BACKGROUND-DISCOURSE");
        $ic17$ = makeSymbol("TRUE");
        $ic18$ = makeKeyword("PPH-BACKGROUND-DISCOURSE");
        $ic19$ = makeUninternedSymbol("US#5126656");
        $ic20$ = ConsesLow.list((SubLObject)makeKeyword("TYPE"), (SubLObject)makeKeyword("TOP-LEVEL"), (SubLObject)makeKeyword("CHECK-TYPE"), (SubLObject)makeSymbol("TRUE"), (SubLObject)makeKeyword("DOCUMENTATION"), (SubLObject)makeString("The background discourse for paraphrasing."), (SubLObject)makeKeyword("DEFAULT-VALUE-FORM"), (SubLObject)NIL);
        $ic21$ = makeSymbol("S#39400", "CYC");
        $ic22$ = makeSymbol("SET-PPH-DISCOURSE-CONTEXTS-TO-UPDATE");
        $ic23$ = makeKeyword("PPH-DISCOURSE-CONTEXTS-TO-UPDATE");
        $ic24$ = makeUninternedSymbol("US#5126656");
        $ic25$ = ConsesLow.list((SubLObject)makeKeyword("TYPE"), (SubLObject)makeKeyword("TOP-LEVEL"), (SubLObject)makeKeyword("CHECK-TYPE"), (SubLObject)makeSymbol("TRUE"), (SubLObject)makeKeyword("DOCUMENTATION"), (SubLObject)makeString("Discourse contexts that should be updated with information from this paraphrase."), (SubLObject)makeKeyword("DEFAULT-VALUE-FORM"), (SubLObject)NIL);
        $ic26$ = makeSymbol("S#39401", "CYC");
        $ic27$ = makeSymbol("SET-PPH-GENERATION-COUNT");
        $ic28$ = makeSymbol("S#4751", "CYC");
        $ic29$ = makeKeyword("PPH-GENERATION-COUNT");
        $ic30$ = makeUninternedSymbol("US#5126656");
        $ic31$ = ConsesLow.list((SubLObject)makeKeyword("TYPE"), (SubLObject)makeKeyword("TOP-LEVEL"), (SubLObject)makeKeyword("CHECK-TYPE"), (SubLObject)makeSymbol("S#4751", "CYC"), (SubLObject)makeKeyword("DOCUMENTATION"), (SubLObject)makeString("The maximum number of paraphrases to generate."), (SubLObject)makeKeyword("DEFAULT-VALUE-FORM"), (SubLObject)ONE_INTEGER);
        $ic32$ = makeSymbol("S#39402", "CYC");
        $ic33$ = makeSymbol("SET-PPH-AGREEMENT");
        $ic34$ = makeSymbol("S#39395", "CYC");
        $ic35$ = makeKeyword("PPH-AGREEMENT");
        $ic36$ = makeUninternedSymbol("US#5126656");
        $ic37$ = ConsesLow.list((SubLObject)makeKeyword("TYPE"), (SubLObject)makeKeyword("TOP-LEVEL"), (SubLObject)makeKeyword("CHECK-TYPE"), (SubLObject)makeSymbol("S#39395", "CYC"), (SubLObject)makeKeyword("DOCUMENTATION"), (SubLObject)makeString("Which agreement predicates are preferred for the head of this phrase? If left at the default, the paraphrase code will attempt to set this parameter appropriately."), (SubLObject)makeKeyword("DEFAULT-VALUE-FORM"), (SubLObject)makeKeyword("DEFAULT"));
        $ic38$ = makeSymbol("S#39403", "CYC");
        $ic39$ = makeSymbol("SET-PPH-SENTENTIAL-FORCE");
        $ic40$ = makeSymbol("S#39396", "CYC");
        $ic41$ = makeKeyword("PPH-SENTENTIAL-FORCE");
        $ic42$ = makeUninternedSymbol("US#5126656");
        $ic43$ = ConsesLow.list((SubLObject)makeKeyword("TYPE"), (SubLObject)makeKeyword("TOP-LEVEL"), (SubLObject)makeKeyword("CHECK-TYPE"), (SubLObject)makeSymbol("S#39396", "CYC"), (SubLObject)makeKeyword("DOCUMENTATION"), (SubLObject)makeString("What sentential force should be used for paraphrases? If left at the default, the paraphrase code will attempt to set this parameter appropriately."), (SubLObject)makeKeyword("DEFAULT-VALUE-FORM"), (SubLObject)makeKeyword("DEFAULT"));
        $ic44$ = makeSymbol("S#39404", "CYC");
        $ic45$ = makeSymbol("SET-PPH-TIMEOUT");
        $ic46$ = makeKeyword("PPH-TIMEOUT");
        $ic47$ = makeUninternedSymbol("US#5126656");
        $ic48$ = ConsesLow.list((SubLObject)makeKeyword("TYPE"), (SubLObject)makeKeyword("TOP-LEVEL"), (SubLObject)makeKeyword("CHECK-TYPE"), (SubLObject)makeSymbol("S#4751", "CYC"), (SubLObject)makeKeyword("DOCUMENTATION"), (SubLObject)makeString("After how many seconds should we give up? Granularity is the internal time unit of the image, typically millisecond or microsecond."), (SubLObject)makeKeyword("DEFAULT-VALUE-FORM"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("POSITIVE-INFINITY")));
        $ic49$ = makeKeyword("TOP-LEVEL");
        $ic50$ = makeSymbol("S#39405", "CYC");
        $ic51$ = makeSymbol("S#39407", "CYC");
        $ic52$ = makeSymbol("SET-MAX-DIGITS-WITHOUT-COMMA");
        $ic53$ = makeKeyword("MAX-DIGITS-WITHOUT-COMMA");
        $ic54$ = makeUninternedSymbol("US#5126656");
        $ic55$ = ConsesLow.list((SubLObject)makeKeyword("TYPE"), (SubLObject)makeKeyword("PPH-FORMAT"), (SubLObject)makeKeyword("CHECK-TYPE"), (SubLObject)makeSymbol("S#4751", "CYC"), (SubLObject)makeKeyword("DOCUMENTATION"), (SubLObject)makeString("max number of digits a number can have and still generate with no commas."), (SubLObject)makeKeyword("CORRESPONDING-GLOBAL"), (SubLObject)makeSymbol("S#38994", "CYC"));
        $ic56$ = makeSymbol("S#39408", "CYC");
        $ic57$ = makeSymbol("SET-SIGNIFICANT-DIGITS-CUTOFF");
        $ic58$ = makeKeyword("SIGNIFICANT-DIGITS-CUTOFF");
        $ic59$ = makeUninternedSymbol("US#5126656");
        $ic60$ = ConsesLow.list((SubLObject)makeKeyword("TYPE"), (SubLObject)makeKeyword("PPH-FORMAT"), (SubLObject)makeKeyword("CHECK-TYPE"), (SubLObject)makeSymbol("S#4751", "CYC"), (SubLObject)makeKeyword("DOCUMENTATION"), (SubLObject)makeString("To how many significant digits should we truncate the display of numbers?"), (SubLObject)makeKeyword("CORRESPONDING-GLOBAL"), (SubLObject)makeSymbol("S#38995", "CYC"));
        $ic61$ = makeSymbol("S#39409", "CYC");
        $ic62$ = makeSymbol("SET-USE-INDEXICAL-DATES?");
        $ic63$ = makeSymbol("BOOLEANP");
        $ic64$ = makeKeyword("USE-INDEXICAL-DATES?");
        $ic65$ = makeUninternedSymbol("US#5126656");
        $ic66$ = ConsesLow.list((SubLObject)makeKeyword("TYPE"), (SubLObject)makeKeyword("PPH-FORMAT"), (SubLObject)makeKeyword("CHECK-TYPE"), (SubLObject)makeSymbol("BOOLEANP"), (SubLObject)makeKeyword("DOCUMENTATION"), (SubLObject)makeString("Should we use 'yesterday', etc. for dates that we can identify?"), (SubLObject)makeKeyword("CORRESPONDING-GLOBAL"), (SubLObject)makeSymbol("*PPH-USE-INDEXICAL-DATES?*"));
        $ic67$ = makeKeyword("PPH-FORMAT");
        $ic68$ = makeSymbol("S#39410", "CYC");
        $ic69$ = makeSymbol("S#39412", "CYC");
        $ic70$ = makeSymbol("SET-DEMERIT-CUTOFF");
        $ic71$ = makeSymbol("S#4723", "CYC");
        $ic72$ = makeKeyword("DEMERIT-CUTOFF");
        $ic73$ = makeUninternedSymbol("US#5126656");
        $ic74$ = ConsesLow.list(new SubLObject[] { makeKeyword("TYPE"), makeKeyword("PPH-GOODNESS"), makeKeyword("CORRESPONDING-GLOBAL"), makeSymbol("S#9978", "CYC"), makeKeyword("CHECK-TYPE"), makeSymbol("S#4723", "CYC"), makeKeyword("DOCUMENTATION"), makeString("What is the worst paraphase quality we should tolerate before returning NIL instead of a string.\nDefault is to consider any string better than nothing.\nSee @xref *PPH-SUGGESTED-DEMERIT-CUTOFF* for a middle-of-the-road value."), makeKeyword("DEFAULT-VALUE-FORM"), makeSymbol("S#9978", "CYC") });
        $ic75$ = makeSymbol("S#39413", "CYC");
        $ic76$ = makeSymbol("SET-USE-SMART-VARIABLE-REPLACEMENT?");
        $ic77$ = makeKeyword("USE-SMART-VARIABLE-REPLACEMENT?");
        $ic78$ = makeUninternedSymbol("US#5126656");
        $ic79$ = ConsesLow.list((SubLObject)makeKeyword("TYPE"), (SubLObject)makeKeyword("PPH-GOODNESS"), (SubLObject)makeKeyword("CORRESPONDING-GLOBAL"), (SubLObject)makeSymbol("*PPH-USE-SMART-VARIABLE-REPLACEMENT?*"), (SubLObject)makeKeyword("CHECK-TYPE"), (SubLObject)makeSymbol("BOOLEANP"), (SubLObject)makeKeyword("DOCUMENTATION"), (SubLObject)makeString("Should the paraphrase code 'intelligently' use NL phrases for variables that look like they need it?"));
        $ic80$ = makeSymbol("S#39414", "CYC");
        $ic81$ = makeSymbol("SET-GENLPREDS-BACKOFF-LIMIT");
        $ic82$ = makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic83$ = makeKeyword("GENLPREDS-BACKOFF-LIMIT");
        $ic84$ = makeUninternedSymbol("US#5126656");
        $ic85$ = ConsesLow.list((SubLObject)makeKeyword("TYPE"), (SubLObject)makeKeyword("PPH-GOODNESS"), (SubLObject)makeKeyword("CORRESPONDING-GLOBAL"), (SubLObject)makeSymbol("S#38988", "CYC"), (SubLObject)makeKeyword("CHECK-TYPE"), (SubLObject)makeSymbol("NON-NEGATIVE-INTEGER-P"), (SubLObject)makeKeyword("DOCUMENTATION"), (SubLObject)makeString("When traversing the genl-preds hierarchy looking for alternative preds with which to paraphrase the input, stop looking after you've looked this many times -- then meaning starts getting lost."));
        $ic86$ = makeKeyword("PPH-GOODNESS");
        $ic87$ = makeSymbol("S#39415", "CYC");
        $ic88$ = makeSymbol("S#39417", "CYC");
        $ic89$ = makeSymbol("SET-PREFER-TERSE-PARAPHRASE?");
        $ic90$ = makeKeyword("PREFER-TERSE-PARAPHRASE?");
        $ic91$ = makeUninternedSymbol("US#5126656");
        $ic92$ = ConsesLow.list((SubLObject)makeKeyword("TYPE"), (SubLObject)makeKeyword("PPH-PRECISION"), (SubLObject)makeKeyword("CORRESPONDING-GLOBAL"), (SubLObject)makeSymbol("*PPH-TERSE-MODE?*"), (SubLObject)makeKeyword("CHECK-TYPE"), (SubLObject)makeSymbol("BOOLEANP"), (SubLObject)makeKeyword("DOCUMENTATION"), (SubLObject)makeString("Should we prefer terse paraphrases?"));
        $ic93$ = makeSymbol("S#39418", "CYC");
        $ic94$ = makeSymbol("SET-MAXIMIZE-LINKS?");
        $ic95$ = makeKeyword("MAXIMIZE-LINKS?");
        $ic96$ = makeUninternedSymbol("US#5126656");
        $ic97$ = ConsesLow.list((SubLObject)makeKeyword("TYPE"), (SubLObject)makeKeyword("PPH-PRECISION"), (SubLObject)makeKeyword("CORRESPONDING-GLOBAL"), (SubLObject)makeSymbol("*PPH-MAXIMIZE-LINKS?*"), (SubLObject)makeKeyword("CHECK-TYPE"), (SubLObject)makeSymbol("BOOLEANP"), (SubLObject)makeKeyword("DOCUMENTATION"), (SubLObject)makeString("Should we link as much of the input CycL to output strings as we can? The tradeoff for this is typically terseness and readability."));
        $ic98$ = makeKeyword("PPH-PRECISION");
        $ic99$ = makeSymbol("S#39419", "CYC");
        $ic100$ = makeKeyword("PPH-FORMALITY");
        $ic101$ = makeSymbol("S#39421", "CYC");
        $ic102$ = makeSymbol("S#39423", "CYC");
        $ic103$ = makeSymbol("SET-USE-TITLE-CAPITALIZATION?");
        $ic104$ = makeKeyword("USE-TITLE-CAPITALIZATION?");
        $ic105$ = makeUninternedSymbol("US#5126656");
        $ic106$ = ConsesLow.list((SubLObject)makeKeyword("TYPE"), (SubLObject)makeKeyword("PPH-MISC"), (SubLObject)makeKeyword("CORRESPONDING-GLOBAL"), (SubLObject)makeSymbol("*PPH-USE-TITLE-CAPITALIZATION?*"), (SubLObject)makeKeyword("CHECK-TYPE"), (SubLObject)makeSymbol("BOOLEANP"), (SubLObject)makeKeyword("DOCUMENTATION"), (SubLObject)makeString("Should we capitalize the output like a book, etc., title?"));
        $ic107$ = makeSymbol("S#39424", "CYC");
        $ic108$ = makeSymbol("SET-ADD-DETERMINERS-BEFORE-VARIABLES?");
        $ic109$ = makeKeyword("ADD-DETERMINERS-BEFORE-VARIABLES?");
        $ic110$ = makeUninternedSymbol("US#5126656");
        $ic111$ = ConsesLow.list((SubLObject)makeKeyword("TYPE"), (SubLObject)makeKeyword("PPH-MISC"), (SubLObject)makeKeyword("CORRESPONDING-GLOBAL"), (SubLObject)makeSymbol("*DETERMINERS-BEFORE-VARIABLES*"), (SubLObject)makeKeyword("CHECK-TYPE"), (SubLObject)makeSymbol("BOOLEANP"), (SubLObject)makeKeyword("DOCUMENTATION"), (SubLObject)makeString("Shall we try to put the correct determiner before variables, too?"));
        $ic112$ = makeSymbol("S#39425", "CYC");
        $ic113$ = makeSymbol("SET-QUANTIFY-VARIABLES?");
        $ic114$ = makeKeyword("QUANTIFY-VARIABLES?");
        $ic115$ = makeUninternedSymbol("US#5126656");
        $ic116$ = ConsesLow.list((SubLObject)makeKeyword("TYPE"), (SubLObject)makeKeyword("PPH-MISC"), (SubLObject)makeKeyword("CORRESPONDING-GLOBAL"), (SubLObject)makeSymbol("*PPH-QUANTIFY-VARS?*"), (SubLObject)makeKeyword("CHECK-TYPE"), (SubLObject)makeSymbol("BOOLEANP"), (SubLObject)makeKeyword("DOCUMENTATION"), (SubLObject)makeString("Should the paraphrase code 'intelligently' add quantification for variables that look like they need it?"));
        $ic117$ = makeSymbol("S#39426", "CYC");
        $ic118$ = makeSymbol("SET-HIDE-EXPLICIT-UNIVERSALS?");
        $ic119$ = makeKeyword("HIDE-EXPLICIT-UNIVERSALS?");
        $ic120$ = makeUninternedSymbol("US#5126656");
        $ic121$ = ConsesLow.list((SubLObject)makeKeyword("TYPE"), (SubLObject)makeKeyword("PPH-MISC"), (SubLObject)makeKeyword("CORRESPONDING-GLOBAL"), (SubLObject)makeSymbol("S#38986", "CYC"), (SubLObject)makeKeyword("CHECK-TYPE"), (SubLObject)makeSymbol("BOOLEANP"), (SubLObject)makeKeyword("DOCUMENTATION"), (SubLObject)makeString("Should we skip the 'For every X, Y, and Z'?"));
        $ic122$ = makeKeyword("PPH-MISC");
        $ic123$ = makeSymbol("S#39427", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 218 ms
	
	Decompiled with Procyon 0.5.32.
*/