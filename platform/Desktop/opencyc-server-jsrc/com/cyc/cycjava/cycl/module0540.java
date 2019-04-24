package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0540 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0540";
    public static final String myFingerPrint = "43ba8b30b5512075177cf8a24f3511cc61c8fac0f290cea10a3ffdeb40eb6fbf";
    private static SubLSymbol $g3937$;
    private static SubLSymbol $g3938$;
    private static SubLSymbol $g3939$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLString $ic4$;
    private static final SubLList $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLString $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLString $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLString $ic15$;
    private static final SubLList $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
    private static final SubLString $ic20$;
    private static final SubLList $ic21$;
    private static final SubLList $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLList $ic24$;
    private static final SubLString $ic25$;
    private static final SubLList $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLList $ic30$;
    private static final SubLString $ic31$;
    private static final SubLList $ic32$;
    private static final SubLList $ic33$;
    private static final SubLString $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLList $ic36$;
    private static final SubLString $ic37$;
    private static final SubLList $ic38$;
    private static final SubLList $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLList $ic41$;
    private static final SubLString $ic42$;
    private static final SubLList $ic43$;
    private static final SubLList $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLList $ic55$;
    private static final SubLString $ic56$;
    private static final SubLList $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLList $ic59$;
    private static final SubLString $ic60$;
    private static final SubLList $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLList $ic63$;
    private static final SubLString $ic64$;
    private static final SubLList $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLList $ic69$;
    private static final SubLString $ic70$;
    private static final SubLList $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLList $ic73$;
    private static final SubLString $ic74$;
    private static final SubLList $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLString $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLString $ic85$;
    private static final SubLList $ic86$;
    private static final SubLList $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLString $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLList $ic93$;
    private static final SubLList $ic94$;
    private static final SubLString $ic95$;
    private static final SubLList $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLString $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLList $ic101$;
    private static final SubLString $ic102$;
    private static final SubLList $ic103$;
    
    
    public static SubLObject f33502(final SubLObject var1) {
        assert module0540.NIL != f33503(var1) : var1;
        return module0572.f35011((SubLObject)ConsesLow.list((SubLObject)module0540.$ic1$, var1, module0166.f10735()), (SubLObject)module0540.UNPROVIDED);
    }
    
    public static SubLObject f33504(final SubLObject var1) {
        assert module0540.NIL != f33503(var1) : var1;
        return f33505(var1, module0166.f10735());
    }
    
    public static SubLObject f33505(final SubLObject var1, final SubLObject var2) {
        assert module0540.NIL != f33503(var1) : var1;
        if (module0540.NIL != var2 && !module0540.areAssertionsDisabledFor(me) && module0540.NIL == module0166.f10734(var2)) {
            throw new AssertionError(var2);
        }
        SubLObject var3 = (SubLObject)module0540.NIL;
        var3 = module0538.f33341(var1, var2);
        module0539.f33497(var3);
        return var3;
    }
    
    public static SubLObject f33506(final SubLObject var1, final SubLObject var2) {
        assert module0540.NIL != module0126.f8389(var1) : var1;
        if (module0540.NIL != var2 && !module0540.areAssertionsDisabledFor(me) && module0540.NIL == module0166.f10734(var2)) {
            throw new AssertionError(var2);
        }
        SubLObject var3 = (SubLObject)module0540.NIL;
        var3 = module0538.f33337(var1);
        if (module0540.NIL == var3) {
            var3 = f33505(var1, var2);
        }
        return var3;
    }
    
    public static SubLObject f33507(final SubLObject var1) {
        assert module0540.NIL != module0126.f8389(var1) : var1;
        SubLObject var2 = (SubLObject)module0540.NIL;
        var2 = module0538.f33337(var1);
        if (module0540.NIL == var2) {
            var2 = f33502(var1);
        }
        return var2;
    }
    
    public static SubLObject f33508(final SubLObject var4, final SubLObject var1) {
        assert module0540.NIL != module0128.f8449(var4) : var4;
        assert module0540.NIL != module0126.f8389(var1) : var1;
        return module0538.f33377(var4, var1);
    }
    
    public static SubLObject f33509(final SubLObject var4) {
        assert module0540.NIL != module0128.f8449(var4) : var4;
        module0166.f10742(var4);
        return var4;
    }
    
    public static SubLObject f33503(final SubLObject var5) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var5 == module0540.$ic27$ || module0540.NIL != module0126.f8389(var5));
    }
    
    public static SubLObject f33510(final SubLObject var6) {
        assert module0540.NIL != module0173.f10955(var6) : var6;
        SubLObject var7 = (SubLObject)module0540.NIL;
        var7 = module0538.f33365(var6);
        return var7;
    }
    
    public static SubLObject f33511(final SubLObject var7, final SubLObject var8) {
        assert module0540.NIL != module0173.f10955(var7) : var7;
        assert module0540.NIL != module0173.f10955(var8) : var8;
        Errors.error((SubLObject)module0540.$ic34$);
        return var8;
    }
    
    public static SubLObject f33512(final SubLObject var9, final SubLObject var10) {
        assert module0540.NIL != module0173.f10955(var9) : var9;
        assert module0540.NIL != module0173.f10955(var10) : var10;
        return module0538.f33355(var9, var10);
    }
    
    public static SubLObject f33513(final SubLObject var5) {
        return module0035.f2169(var5, module0540.$g3937$.getGlobalValue());
    }
    
    public static SubLObject f33514(final SubLObject var5) {
        return module0035.f2331(var5, (SubLObject)module0540.$ic45$);
    }
    
    public static SubLObject f33515(final SubLObject var11, final SubLObject var12, SubLObject var13) {
        if (var13 == module0540.UNPROVIDED) {
            var13 = (SubLObject)module0540.NIL;
        }
        return conses_high.getf(var11, var12, var13);
    }
    
    public static SubLObject f33516(final SubLObject var14, SubLObject var15, SubLObject var11) {
        if (var15 == module0540.UNPROVIDED) {
            var15 = (SubLObject)module0540.NIL;
        }
        if (var11 == module0540.UNPROVIDED) {
            var11 = (SubLObject)module0540.NIL;
        }
        final SubLThread var16 = SubLProcess.currentSubLThread();
        assert module0540.NIL != module0202.f12660(var14) : var14;
        if (module0540.NIL != var15 && !module0540.areAssertionsDisabledFor(me) && module0540.NIL == module0161.f10479(var15)) {
            throw new AssertionError(var15);
        }
        assert module0540.NIL != f33514(var11) : var11;
        SubLObject var17 = (SubLObject)module0540.NIL;
        final SubLObject var18 = f33515(var11, (SubLObject)module0540.$ic49$, (SubLObject)module0540.$ic50$);
        final SubLObject var19 = f33515(var11, (SubLObject)module0540.$ic51$, (SubLObject)module0540.UNPROVIDED);
        final SubLObject var20 = f33515(var11, (SubLObject)module0540.$ic52$, (SubLObject)SubLObjectFactory.makeBoolean(module0540.NIL == module0538.$g3929$.getDynamicValue(var16)));
        final SubLObject var21 = f33515(var11, (SubLObject)module0540.$ic53$, module0131.$g1537$.getDynamicValue(var16));
        var16.resetMultipleValues();
        final SubLObject var22 = module0279.f18576(var14, var15);
        final SubLObject var23 = var16.secondMultipleValue();
        var16.resetMultipleValues();
        final SubLObject var24 = module0538.$g3929$.currentBinding(var16);
        final SubLObject var25 = module0131.$g1537$.currentBinding(var16);
        try {
            module0538.$g3929$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0540.NIL == var20), var16);
            module0131.$g1537$.bind(var21, var16);
            var17 = module0538.f33349(var22, var23, var18, var19);
        }
        finally {
            module0131.$g1537$.rebind(var25, var16);
            module0538.$g3929$.rebind(var24, var16);
        }
        module0539.f33498(var17);
        return var17;
    }
    
    public static SubLObject f33517(final SubLObject var14, SubLObject var15, SubLObject var11) {
        if (var15 == module0540.UNPROVIDED) {
            var15 = (SubLObject)module0540.NIL;
        }
        if (var11 == module0540.UNPROVIDED) {
            var11 = (SubLObject)module0540.NIL;
        }
        SubLObject var16 = (SubLObject)module0540.NIL;
        final SubLObject var17 = conses_high.putf(conses_high.copy_list(var11), (SubLObject)module0540.$ic52$, (SubLObject)module0540.NIL);
        var16 = f33516(var14, var15, var17);
        return var16;
    }
    
    public static SubLObject f33518(final SubLObject var14, SubLObject var15) {
        if (var15 == module0540.UNPROVIDED) {
            var15 = (SubLObject)module0540.NIL;
        }
        final SubLThread var16 = SubLProcess.currentSubLThread();
        assert module0540.NIL != module0202.f12660(var14) : var14;
        if (module0540.NIL != var15 && !module0540.areAssertionsDisabledFor(me) && module0540.NIL == module0161.f10479(var15)) {
            throw new AssertionError(var15);
        }
        SubLObject var17 = (SubLObject)module0540.NIL;
        var16.resetMultipleValues();
        final SubLObject var18 = module0279.f18576(var14, var15);
        final SubLObject var19 = var16.secondMultipleValue();
        var16.resetMultipleValues();
        var17 = module0538.f33400(var18, var19);
        return var17;
    }
    
    public static SubLObject f33519(final SubLObject var26, final SubLObject var27, SubLObject var28, SubLObject var29, SubLObject var11) {
        if (var28 == module0540.UNPROVIDED) {
            var28 = (SubLObject)module0540.NIL;
        }
        if (var29 == module0540.UNPROVIDED) {
            var29 = var28;
        }
        if (var11 == module0540.UNPROVIDED) {
            var11 = (SubLObject)module0540.NIL;
        }
        final SubLThread var30 = SubLProcess.currentSubLThread();
        assert module0540.NIL != module0202.f12660(var26) : var26;
        assert module0540.NIL != module0202.f12660(var27) : var27;
        if (module0540.NIL != var28 && !module0540.areAssertionsDisabledFor(me) && module0540.NIL == module0161.f10479(var28)) {
            throw new AssertionError(var28);
        }
        if (module0540.NIL != var29 && !module0540.areAssertionsDisabledFor(me) && module0540.NIL == module0161.f10479(var29)) {
            throw new AssertionError(var29);
        }
        SubLObject var31 = (SubLObject)module0540.NIL;
        final SubLObject var32 = conses_high.getf(var11, (SubLObject)module0540.$ic49$, (SubLObject)module0540.UNPROVIDED);
        final SubLObject var33 = conses_high.getf(var11, (SubLObject)module0540.$ic51$, (SubLObject)module0540.UNPROVIDED);
        var30.resetMultipleValues();
        final SubLObject var34 = module0279.f18576(var26, var28);
        final SubLObject var35 = var30.secondMultipleValue();
        var30.resetMultipleValues();
        var30.resetMultipleValues();
        final SubLObject var36 = module0279.f18576(var27, var29);
        final SubLObject var37 = var30.secondMultipleValue();
        var30.resetMultipleValues();
        var31 = module0538.f33406(var34, var36, var35, var37, var32, var33);
        module0539.f33498(var31);
        return var31;
    }
    
    public static SubLObject f33520(final SubLObject var14, final SubLObject var34, SubLObject var15, SubLObject var11, SubLObject var35) {
        if (var15 == module0540.UNPROVIDED) {
            var15 = (SubLObject)module0540.NIL;
        }
        if (var11 == module0540.UNPROVIDED) {
            var11 = (SubLObject)module0540.NIL;
        }
        if (var35 == module0540.UNPROVIDED) {
            var35 = (SubLObject)module0540.NIL;
        }
        final SubLThread var36 = SubLProcess.currentSubLThread();
        assert module0540.NIL != module0202.f12660(var14) : var14;
        assert module0540.NIL != module0191.f11948(var34) : var34;
        if (module0540.NIL != var15 && !module0540.areAssertionsDisabledFor(me) && module0540.NIL == module0161.f10479(var15)) {
            throw new AssertionError(var15);
        }
        assert module0540.NIL != f33514(var11) : var11;
        assert module0540.NIL != Types.booleanp(var35) : var35;
        SubLObject var37 = (SubLObject)module0540.NIL;
        final SubLObject var38 = conses_high.getf(var11, (SubLObject)module0540.$ic51$, (SubLObject)module0540.UNPROVIDED);
        final SubLObject var39 = f33515(var11, (SubLObject)module0540.$ic52$, (SubLObject)SubLObjectFactory.makeBoolean(module0540.NIL == module0538.$g3929$.getDynamicValue(var36)));
        var36.resetMultipleValues();
        final SubLObject var40 = module0279.f18576(var14, var15);
        final SubLObject var41 = var36.secondMultipleValue();
        var36.resetMultipleValues();
        final SubLObject var42 = module0538.$g3929$.currentBinding(var36);
        try {
            module0538.$g3929$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0540.NIL == var39), var36);
            var37 = module0538.f33372(var40, var41, var34, var38, var35);
        }
        finally {
            module0538.$g3929$.rebind(var42, var36);
        }
        return var37;
    }
    
    public static SubLObject f33521(final SubLObject var14, final SubLObject var34, SubLObject var15) {
        if (var15 == module0540.UNPROVIDED) {
            var15 = (SubLObject)module0540.NIL;
        }
        final SubLThread var35 = SubLProcess.currentSubLThread();
        assert module0540.NIL != module0202.f12660(var14) : var14;
        assert module0540.NIL != module0191.f11948(var34) : var34;
        if (module0540.NIL != var15 && !module0540.areAssertionsDisabledFor(me) && module0540.NIL == module0161.f10479(var15)) {
            throw new AssertionError(var15);
        }
        SubLObject var36 = (SubLObject)module0540.NIL;
        var35.resetMultipleValues();
        final SubLObject var37 = module0279.f18576(var14, var15);
        final SubLObject var38 = var35.secondMultipleValue();
        var35.resetMultipleValues();
        var36 = module0538.f33424(var37, var38, var34, (SubLObject)module0540.NIL);
        return var36;
    }
    
    public static SubLObject f33522(final SubLObject var14, SubLObject var15) {
        if (var15 == module0540.UNPROVIDED) {
            var15 = (SubLObject)module0540.NIL;
        }
        final SubLThread var16 = SubLProcess.currentSubLThread();
        assert module0540.NIL != module0202.f12660(var14) : var14;
        if (module0540.NIL != var15 && !module0540.areAssertionsDisabledFor(me) && module0540.NIL == module0161.f10479(var15)) {
            throw new AssertionError(var15);
        }
        SubLObject var17 = (SubLObject)module0540.NIL;
        var16.resetMultipleValues();
        final SubLObject var18 = module0279.f18576(var14, var15);
        final SubLObject var19 = var16.secondMultipleValue();
        var16.resetMultipleValues();
        var17 = module0538.f33426(var18, var19);
        return var17;
    }
    
    public static SubLObject f33523(final SubLObject var5) {
        return Types.listp(var5);
    }
    
    public static SubLObject f33524(final SubLObject var5) {
        return Types.listp(var5);
    }
    
    public static SubLObject f33525(final SubLObject var14, SubLObject var15, SubLObject var11) {
        if (var15 == module0540.UNPROVIDED) {
            var15 = (SubLObject)module0540.NIL;
        }
        if (var11 == module0540.UNPROVIDED) {
            var11 = (SubLObject)module0540.NIL;
        }
        final SubLThread var16 = SubLProcess.currentSubLThread();
        assert module0540.NIL != module0202.f12660(var14) : var14;
        if (module0540.NIL != var15 && !module0540.areAssertionsDisabledFor(me) && module0540.NIL == module0161.f10479(var15)) {
            throw new AssertionError(var15);
        }
        assert module0540.NIL != f33523(var11) : var11;
        final SubLObject var17 = conses_high.getf(var11, (SubLObject)module0540.$ic79$, (SubLObject)module0540.UNPROVIDED);
        final SubLObject var18 = conses_high.getf(var11, (SubLObject)module0540.$ic80$, (SubLObject)module0540.UNPROVIDED);
        final SubLObject var19 = conses_high.getf(var11, (SubLObject)module0540.$ic81$, (SubLObject)module0540.UNPROVIDED);
        final SubLObject var20 = conses_high.getf(var11, (SubLObject)module0540.$ic82$, (SubLObject)module0540.UNPROVIDED);
        final SubLObject var21 = conses_high.getf(var11, (SubLObject)module0540.$ic83$, (SubLObject)module0540.UNPROVIDED);
        var16.resetMultipleValues();
        final SubLObject var22 = module0279.f18576(var14, var15);
        final SubLObject var23 = var16.secondMultipleValue();
        var16.resetMultipleValues();
        var16.resetMultipleValues();
        SubLObject var24 = (module0540.NIL != var21) ? module0541.f33545(var22, var23, var17, var18, var19, var20) : module0538.f33428(var22, var23, var17, var18, var19, var20);
        final SubLObject var25 = var16.secondMultipleValue();
        var16.resetMultipleValues();
        if (module0540.NIL != f33526(var24)) {
            var24 = f33527();
        }
        return Values.values(var24, var25);
    }
    
    public static SubLObject f33528(final SubLObject var5) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0540.NIL != f33529(var5) || module0540.NIL != f33526(var5));
    }
    
    public static SubLObject f33530(final SubLObject var5) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0540.NIL != module0233.f15352(var5) && module0540.NIL == f33526(var5));
    }
    
    public static SubLObject f33529(final SubLObject var5) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0540.NIL != module0035.f2014(var5) && module0540.NIL != f33530(var5));
    }
    
    public static SubLObject f33531(final SubLObject var5) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var5.equal(module0540.$g3938$.getGlobalValue()) || module0540.NIL != module0233.f15393(var5));
    }
    
    public static SubLObject f33532(final SubLObject var5) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0540.NIL != module0035.f2014(var5) && module0540.NIL != module0035.f1995(var5, (SubLObject)module0540.TWO_INTEGER, (SubLObject)module0540.UNPROVIDED) && module0540.NIL != f33531(var5.first()) && module0540.NIL != module0191.f11953(conses_high.second(var5)));
    }
    
    public static SubLObject f33527() {
        return module0540.$g3939$.getGlobalValue();
    }
    
    public static SubLObject f33533(final SubLObject var5) {
        return Equality.equal(var5, module0540.$g3939$.getGlobalValue());
    }
    
    public static SubLObject f33526(final SubLObject var5) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var5.isCons() && module0540.NIL != module0035.f1997(var5) && module0540.NIL != f33531(var5.first()));
    }
    
    public static SubLObject f33534(final SubLObject var5) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0540.NIL != module0035.f2014(var5) && module0540.NIL != module0035.f2370((SubLObject)module0540.$ic88$, var5, (SubLObject)module0540.UNPROVIDED));
    }
    
    public static SubLObject f33535(final SubLObject var5) {
        return Equality.eq((SubLObject)module0540.$ic89$, var5);
    }
    
    public static SubLObject f33536(SubLObject var42, SubLObject var11) {
        if (var42 == module0540.UNPROVIDED) {
            var42 = (SubLObject)module0540.$ic89$;
        }
        if (var11 == module0540.UNPROVIDED) {
            var11 = (SubLObject)module0540.NIL;
        }
        assert module0540.NIL != f33535(var42) : var42;
        assert module0540.NIL != f33523(var11) : var11;
        Errors.error((SubLObject)module0540.$ic91$);
        return (SubLObject)module0540.NIL;
    }
    
    public static SubLObject f33537(final SubLObject var14, SubLObject var15) {
        if (var15 == module0540.UNPROVIDED) {
            var15 = (SubLObject)module0540.NIL;
        }
        final SubLThread var16 = SubLProcess.currentSubLThread();
        assert module0540.NIL != module0202.f12660(var14) : var14;
        if (module0540.NIL != var15 && !module0540.areAssertionsDisabledFor(me) && module0540.NIL == module0161.f10479(var15)) {
            throw new AssertionError(var15);
        }
        SubLObject var17 = (SubLObject)module0540.NIL;
        var16.resetMultipleValues();
        final SubLObject var18 = module0279.f18576(var14, var15);
        final SubLObject var19 = var16.secondMultipleValue();
        var16.resetMultipleValues();
        var17 = module0538.f33437(var18, var19);
        return var17;
    }
    
    public static SubLObject f33538(final SubLObject var43, SubLObject var15) {
        if (var15 == module0540.UNPROVIDED) {
            var15 = (SubLObject)module0540.NIL;
        }
        return module0538.f33443(var43, var15);
    }
    
    public static SubLObject f33539(final SubLObject var15) {
        return module0538.f33439(var15);
    }
    
    public static SubLObject f33540(final SubLObject var14, final SubLObject var44, SubLObject var15) {
        if (var15 == module0540.UNPROVIDED) {
            var15 = (SubLObject)module0540.NIL;
        }
        assert module0540.NIL != module0202.f12660(var14) : var14;
        if (module0540.NIL != var15 && !module0540.areAssertionsDisabledFor(me) && module0540.NIL == module0161.f10479(var15)) {
            throw new AssertionError(var15);
        }
        assert module0540.NIL != module0035.f2292(var44) : var44;
        return module0538.f33456(var14, var15, var44);
    }
    
    public static SubLObject f33541() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0540", "f33502", "CYC-CREATE-NEW-PERMANENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0540", "f33504", "CYC-CREATE-NEW-EPHEMERAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0540", "f33505", "CYC-CREATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0540", "f33506", "CYC-FIND-OR-CREATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0540", "f33507", "S#36907", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0540", "f33508", "CYC-RENAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0540", "f33509", "CYC-RECREATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0540", "f33503", "NEW-CONSTANT-NAME-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0540", "f33510", "CYC-KILL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0540", "f33511", "CYC-REWRITE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0540", "f33512", "CYC-MERGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0540", "f33513", "S#36908", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0540", "f33514", "S#36909", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0540", "f33515", "S#36910", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0540", "f33516", "CYC-ASSERT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0540", "f33517", "S#21465", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0540", "f33518", "CYC-UNASSERT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0540", "f33519", "CYC-EDIT", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0540", "f33520", "CYC-ADD-ARGUMENT", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0540", "f33521", "CYC-REMOVE-ARGUMENT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0540", "f33522", "CYC-REMOVE-ALL-ARGUMENTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0540", "f33523", "S#36911", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0540", "f33524", "S#36912", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0540", "f33525", "CYC-QUERY", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0540", "f33528", "S#36913", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0540", "f33530", "S#36914", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0540", "f33529", "S#36915", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0540", "f33531", "S#33828", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0540", "f33532", "S#36916", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0540", "f33527", "CLOSED-QUERY-SUCCESS-TOKEN", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0540", "f33533", "S#34323", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0540", "f33526", "S#22566", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0540", "f33534", "S#36917", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0540", "f33535", "S#36918", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0540", "f33536", "CYC-CONTINUE-QUERY", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0540", "f33537", "CYC-TMS-RECONSIDER-SENTENCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0540", "f33538", "S#36919", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0540", "f33539", "S#36920", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0540", "f33540", "CYC-RENAME-VARIABLES", 2, 1, false);
        return (SubLObject)module0540.NIL;
    }
    
    public static SubLObject f33542() {
        module0540.$g3937$ = SubLFiles.deflexical("S#36921", (SubLObject)module0540.$ic44$);
        module0540.$g3938$ = SubLFiles.deflexical("S#36922", (SubLObject)module0540.NIL);
        module0540.$g3939$ = SubLFiles.deflexical("S#36923", (SubLObject)ConsesLow.list(module0540.$g3938$.getGlobalValue()));
        return (SubLObject)module0540.NIL;
    }
    
    public static SubLObject f33543() {
        module0012.f368((SubLObject)module0540.$ic2$, (SubLObject)module0540.$ic3$, (SubLObject)module0540.$ic4$, (SubLObject)module0540.$ic5$, (SubLObject)module0540.$ic6$);
        module0012.f368((SubLObject)module0540.$ic7$, (SubLObject)module0540.$ic3$, (SubLObject)module0540.$ic8$, (SubLObject)module0540.$ic5$, (SubLObject)module0540.$ic6$);
        module0012.f368((SubLObject)module0540.$ic1$, (SubLObject)module0540.$ic10$, (SubLObject)module0540.$ic11$, (SubLObject)module0540.$ic12$, (SubLObject)module0540.$ic6$);
        module0012.f368((SubLObject)module0540.$ic14$, (SubLObject)module0540.$ic10$, (SubLObject)module0540.$ic15$, (SubLObject)module0540.$ic16$, (SubLObject)module0540.$ic6$);
        module0012.f368((SubLObject)module0540.$ic18$, (SubLObject)module0540.$ic19$, (SubLObject)module0540.$ic20$, (SubLObject)module0540.$ic21$, (SubLObject)module0540.$ic22$);
        module0012.f368((SubLObject)module0540.$ic23$, (SubLObject)module0540.$ic24$, (SubLObject)module0540.$ic25$, (SubLObject)module0540.$ic26$, (SubLObject)module0540.$ic6$);
        module0012.f368((SubLObject)module0540.$ic29$, (SubLObject)module0540.$ic30$, (SubLObject)module0540.$ic31$, (SubLObject)module0540.$ic32$, (SubLObject)module0540.$ic33$);
        module0012.f368((SubLObject)module0540.$ic35$, (SubLObject)module0540.$ic36$, (SubLObject)module0540.$ic37$, (SubLObject)module0540.$ic38$, (SubLObject)module0540.$ic39$);
        module0012.f368((SubLObject)module0540.$ic40$, (SubLObject)module0540.$ic41$, (SubLObject)module0540.$ic42$, (SubLObject)module0540.$ic43$, (SubLObject)module0540.$ic39$);
        module0012.f368((SubLObject)module0540.$ic54$, (SubLObject)module0540.$ic55$, (SubLObject)module0540.$ic56$, (SubLObject)module0540.$ic57$, (SubLObject)module0540.$ic33$);
        module0012.f368((SubLObject)module0540.$ic58$, (SubLObject)module0540.$ic59$, (SubLObject)module0540.$ic60$, (SubLObject)module0540.$ic61$, (SubLObject)module0540.$ic33$);
        module0012.f368((SubLObject)module0540.$ic62$, (SubLObject)module0540.$ic63$, (SubLObject)module0540.$ic64$, (SubLObject)module0540.$ic65$, (SubLObject)module0540.$ic33$);
        module0012.f368((SubLObject)module0540.$ic68$, (SubLObject)module0540.$ic69$, (SubLObject)module0540.$ic70$, (SubLObject)module0540.$ic71$, (SubLObject)module0540.$ic33$);
        module0012.f368((SubLObject)module0540.$ic72$, (SubLObject)module0540.$ic73$, (SubLObject)module0540.$ic74$, (SubLObject)module0540.$ic75$, (SubLObject)module0540.$ic33$);
        module0012.f368((SubLObject)module0540.$ic76$, (SubLObject)module0540.$ic59$, (SubLObject)module0540.$ic77$, (SubLObject)module0540.$ic61$, (SubLObject)module0540.$ic33$);
        module0012.f368((SubLObject)module0540.$ic84$, (SubLObject)module0540.$ic55$, (SubLObject)module0540.$ic85$, (SubLObject)module0540.$ic86$, (SubLObject)module0540.$ic87$);
        module0012.f588((SubLObject)module0540.$ic92$, (SubLObject)module0540.$ic93$, (SubLObject)module0540.$ic94$, (SubLObject)module0540.$ic95$, (SubLObject)module0540.$ic96$, (SubLObject)module0540.$ic87$);
        module0012.f368((SubLObject)module0540.$ic97$, (SubLObject)module0540.$ic59$, (SubLObject)module0540.$ic98$, (SubLObject)module0540.$ic61$, (SubLObject)module0540.$ic33$);
        module0012.f368((SubLObject)module0540.$ic100$, (SubLObject)module0540.$ic101$, (SubLObject)module0540.$ic102$, (SubLObject)module0540.$ic103$, (SubLObject)module0540.$ic33$);
        return (SubLObject)module0540.NIL;
    }
    
    public void declareFunctions() {
        f33541();
    }
    
    public void initializeVariables() {
        f33542();
    }
    
    public void runTopLevelForms() {
        f33543();
    }
    
    static {
        me = (SubLFile)new module0540();
        module0540.$g3937$ = null;
        module0540.$g3938$ = null;
        module0540.$g3939$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("NEW-CONSTANT-NAME-SPEC-P");
        $ic1$ = SubLObjectFactory.makeSymbol("CYC-CREATE");
        $ic2$ = SubLObjectFactory.makeSymbol("CYC-CREATE-NEW-PERMANENT");
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"));
        $ic4$ = SubLObjectFactory.makeString("Creates a new constant with name NAME, gives it a\n   permanent unique external ID, and adds the constant\n   creation operation to the transcript queue.");
        $ic5$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CONSTANT-NAME-SPEC-P")));
        $ic6$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-P"));
        $ic7$ = SubLObjectFactory.makeSymbol("CYC-CREATE-NEW-EPHEMERAL");
        $ic8$ = SubLObjectFactory.makeString("Creates a new constant with name NAME, but makes\n   no effort to synchronize its external ID with\n   other Cyc images.  This is intended for constants\n   that will not be transmitted to other Cyc images.");
        $ic9$ = SubLObjectFactory.makeSymbol("S#13484", "CYC");
        $ic10$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10596", "CYC"));
        $ic11$ = SubLObjectFactory.makeString("Create a new constant with id EXTERNAL-ID.\n   If NAME is anything other than :unnamed,\n   the new constant will be given the name NAME.");
        $ic12$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CONSTANT-NAME-SPEC-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10596", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#664", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13484", "CYC"))));
        $ic13$ = SubLObjectFactory.makeSymbol("VALID-CONSTANT-NAME-P");
        $ic14$ = SubLObjectFactory.makeSymbol("CYC-FIND-OR-CREATE");
        $ic15$ = SubLObjectFactory.makeString("Return constant with NAME if it is present.  \n   If not present, then create constant with NAME, using EXTERNAL-ID if given.\n   If EXTERNAL-ID is not given, generate a new one for the new constant.");
        $ic16$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("VALID-CONSTANT-NAME-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10596", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#664", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13484", "CYC"))));
        $ic17$ = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $ic18$ = SubLObjectFactory.makeSymbol("CYC-RENAME");
        $ic19$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10505", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"));
        $ic20$ = SubLObjectFactory.makeString("Change name of CONSTANT to NAME. Return the constant if no error, otherwise return NIL.");
        $ic21$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10505", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("VALID-CONSTANT-NAME-P")));
        $ic22$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#664", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-P")));
        $ic23$ = SubLObjectFactory.makeSymbol("CYC-RECREATE");
        $ic24$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10505", "CYC"));
        $ic25$ = SubLObjectFactory.makeString("Doesn't unassert the bookkeeping info,\n   but it might actually move it, or change\n   its format somehow.");
        $ic26$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10505", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-P")));
        $ic27$ = SubLObjectFactory.makeKeyword("UNNAMED");
        $ic28$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic29$ = SubLObjectFactory.makeSymbol("CYC-KILL");
        $ic30$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10466", "CYC"));
        $ic31$ = SubLObjectFactory.makeString("Kill FORT and all its uses from the KB.  If FORT is a microtheory, all assertions\n   in that microtheory are removed.");
        $ic32$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10466", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")));
        $ic33$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $ic34$ = SubLObjectFactory.makeString("cyc-rewrite is not implemented yet");
        $ic35$ = SubLObjectFactory.makeSymbol("CYC-REWRITE");
        $ic36$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#36924", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#36925", "CYC"));
        $ic37$ = SubLObjectFactory.makeString("'moves' all asserted arguments from SOURCE-FORT to TARGET-FORT\n   @return fort-p; TARGET-FORT");
        $ic38$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#36924", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#36925", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")));
        $ic39$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT-P"));
        $ic40$ = SubLObjectFactory.makeSymbol("CYC-MERGE");
        $ic41$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#36926", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#36927", "CYC"));
        $ic42$ = SubLObjectFactory.makeString("Move asserted assertions on KILL-TERM onto KEEP-TERM before killing KILL-TERM.\n   @return fort-p; KEEP-FORT");
        $ic43$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#36926", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#36927", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")));
        $ic44$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STRENGTH"), (SubLObject)SubLObjectFactory.makeKeyword("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-WFF?"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD-RULES"));
        $ic45$ = SubLObjectFactory.makeSymbol("S#36908", "CYC");
        $ic46$ = SubLObjectFactory.makeSymbol("S#13920", "CYC");
        $ic47$ = SubLObjectFactory.makeSymbol("S#12264", "CYC");
        $ic48$ = SubLObjectFactory.makeSymbol("S#36909", "CYC");
        $ic49$ = SubLObjectFactory.makeKeyword("STRENGTH");
        $ic50$ = SubLObjectFactory.makeKeyword("DEFAULT");
        $ic51$ = SubLObjectFactory.makeKeyword("DIRECTION");
        $ic52$ = SubLObjectFactory.makeKeyword("CHECK-WFF?");
        $ic53$ = SubLObjectFactory.makeKeyword("FORWARD-RULES");
        $ic54$ = SubLObjectFactory.makeSymbol("CYC-ASSERT");
        $ic55$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14349", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5852", "CYC"));
        $ic56$ = SubLObjectFactory.makeString("Assert SENTENCE in the specified MT.\n   properties; :strength el-strength-p (:default or :monotonic)\n               :direction direction-p  (:forward or :backward)\n               :check-wff? booleanp\n               :forward-rules listp\n   GAF assertion direction defaults to :forward,\n     and rule assertion direction defaults to :backward.\n   :check-wff? indicates whether to enforce WFF checking, and defaults to T\n     (unless *assume-assert-sentence-is-wf?* is bound from outside).\n   :forward-rules defaults to :all (unless *forward-inference-allowed-rules* is bound from outside)\n     and indicates which forward rules to use during post-assert processing.\n     NIL means 'do no forward inference at all.'\n   @return booleanp; t iff the assert succeeded.  If the assertion\n   already existed, it is considered a success.");
        $ic57$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14349", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13920", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#664", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12264", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5852", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#36909", "CYC")));
        $ic58$ = SubLObjectFactory.makeSymbol("CYC-UNASSERT");
        $ic59$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14349", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"));
        $ic60$ = SubLObjectFactory.makeString("Remove the assertions canonicalized from FORMULA in the microtheory MT.\n   Return T if the operation succeeded, otherwise return NIL.");
        $ic61$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14349", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13920", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#664", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12264", "CYC"))));
        $ic62$ = SubLObjectFactory.makeSymbol("CYC-EDIT");
        $ic63$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#36928", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#36929", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#36887", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#36888", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#36887", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("S#5852", "CYC"));
        $ic64$ = SubLObjectFactory.makeString("Unassert OLD-SENTENCE in OLD-MT, and assert NEW-SENTENCE in the specified NEW-MT.\n   @see cyc-unassert and @xref cyc-assert");
        $ic65$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#36928", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13920", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#36929", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13920", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#36887", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#664", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12264", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#36888", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#664", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12264", "CYC"))));
        $ic66$ = SubLObjectFactory.makeSymbol("S#14742", "CYC");
        $ic67$ = SubLObjectFactory.makeSymbol("BOOLEANP");
        $ic68$ = SubLObjectFactory.makeSymbol("CYC-ADD-ARGUMENT");
        $ic69$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14349", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#36930", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5852", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#36931", "CYC"));
        $ic70$ = SubLObjectFactory.makeString("Tell Cyc to conclude SENTENCE (optionally in MT) based on the list of CYCL-SUPPORTS which should themselves be assertions or \n   otherwise valid for support-p. If VERIFY-SUPPORTS is non-nil, then this function will attempt to verify the list of supports \n   before making the assertion.\n   Properties: :direction :forward or :backward");
        $ic71$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14349", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13920", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#36930", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#14742", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#664", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12264", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5852", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#36909", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#36931", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP")));
        $ic72$ = SubLObjectFactory.makeSymbol("CYC-REMOVE-ARGUMENT");
        $ic73$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14349", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#36930", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"));
        $ic74$ = SubLObjectFactory.makeString("Remove the argument for SENTENCE specified by CYCL-SUPPORTS.");
        $ic75$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14349", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13920", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#36930", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#14742", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#664", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12264", "CYC"))));
        $ic76$ = SubLObjectFactory.makeSymbol("CYC-REMOVE-ALL-ARGUMENTS");
        $ic77$ = SubLObjectFactory.makeString("Remove all arguments for SENTENCE within MT, including both those \n   arguments resulting the direct assertion of SENTENCE, and \n   those arguments supporting SENTENCE which were derived through inference.\n   Return T if successful, otherwise return NIL.");
        $ic78$ = SubLObjectFactory.makeSymbol("S#36911", "CYC");
        $ic79$ = SubLObjectFactory.makeKeyword("BACKCHAIN");
        $ic80$ = SubLObjectFactory.makeKeyword("NUMBER");
        $ic81$ = SubLObjectFactory.makeKeyword("TIME");
        $ic82$ = SubLObjectFactory.makeKeyword("DEPTH");
        $ic83$ = SubLObjectFactory.makeKeyword("CONDITIONAL-SENTENCE");
        $ic84$ = SubLObjectFactory.makeSymbol("CYC-QUERY");
        $ic85$ = SubLObjectFactory.makeString("Query for bindings for free variables which will satisfy SENTENCE within MT.\n;;;{{{DOC\n   Properties: :backchain NIL or an integer or T\n               :number    NIL or an integer\n               :time      NIL or an integer\n               :depth     NIL or an integer\n               :conditional-sentence boolean\n   If :backchain is NIL, no backchaining is performed.\n   If :backchain is an integer, then at most that many backchaining steps using rules\n   are performed.\n   If :backchain is T, then inference is performed without limit on the number of\n   backchaining steps when searching for bindings.\n   If :number is an integer, then at most that number of bindings are returned.\n   If :time is an integer, then at most that many seconds are consumed by the search for\n   bindings.\n   If :depth is an integer, then the inference paths are limited to that number of\n   total steps.\n   Returns NIL if the operation had an error.  Otherwise returns a (possibly empty)\n   binding set.  In the case where the SENTENCE has no free variables,\n   the form (NIL), the empty binding set is returned, indicating that the gaf is either\n   directly asserted in the KB, or that it can be derived via rules in the KB.\n   If it fails to be proven, NIL will be returned.\n   The second return value indicates the reason why the query halted.\n   If SENTENCE is an implication, or an ist wrapped around an implication,\n   and the :conditional-sentence property is non-nil, cyc-query will attempt to\n   prove SENTENCE by reductio ad absurdum.\n;;;}}}EDOC");
        $ic86$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14349", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13920", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#664", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12264", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5852", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#36911", "CYC")));
        $ic87$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#36912", "CYC"));
        $ic88$ = SubLObjectFactory.makeSymbol("S#36916", "CYC");
        $ic89$ = SubLObjectFactory.makeKeyword("LAST");
        $ic90$ = SubLObjectFactory.makeSymbol("S#36918", "CYC");
        $ic91$ = SubLObjectFactory.makeString("cyc-continue-query is deprecated; use CONTINUE-INFERENCE instead.");
        $ic92$ = SubLObjectFactory.makeSymbol("CYC-CONTINUE-QUERY");
        $ic93$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONTINUE-INFERENCE"));
        $ic94$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#36932", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("LAST")), (SubLObject)SubLObjectFactory.makeSymbol("S#5852", "CYC"));
        $ic95$ = SubLObjectFactory.makeString("Continues a query started by @xref cyc-query.\n   If QUERY-ID is :last, the most recent query is continued.");
        $ic96$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#36932", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#36918", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5852", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#36911", "CYC")));
        $ic97$ = SubLObjectFactory.makeSymbol("CYC-TMS-RECONSIDER-SENTENCE");
        $ic98$ = SubLObjectFactory.makeString("Reconsider all arguments for SENTENCE within MT.  Return T if the\n   operation succeeded, NIL if there was an error.");
        $ic99$ = SubLObjectFactory.makeSymbol("S#3593", "CYC");
        $ic100$ = SubLObjectFactory.makeSymbol("CYC-RENAME-VARIABLES");
        $ic101$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14349", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#36933", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"));
        $ic102$ = SubLObjectFactory.makeString("Rename the variables in SENTENCE by resetting the EL variable names of SENTENCE assertion,\n   if it is provably possible to do so without changing the logical intent of SENTENCE.\n   @see simple-variable-rename-impossible?\n   @return booleanp; T if the operation succeeded, NIL if there was an error.");
        $ic103$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14349", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13920", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#664", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12264", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#36933", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3593", "CYC")));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0540.class
	Total time: 222 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/