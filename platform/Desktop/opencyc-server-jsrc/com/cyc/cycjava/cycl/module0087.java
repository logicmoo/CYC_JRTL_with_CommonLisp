package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0087 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0087";
    public static final String myFingerPrint = "519cd0b830b3cb1c7a3015d97b1e947bb04f3386a1dab7a38c4ad3d41b1e2f1a";
    public static SubLSymbol $g1177$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLString $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
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
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLList $ic39$;
    private static final SubLList $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLList $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLList $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLList $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLList $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLList $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLString $ic67$;
    private static final SubLString $ic68$;
    private static final SubLString $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLList $ic77$;
    private static final SubLString $ic78$;
    private static final SubLString $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLString $ic82$;
    private static final SubLString $ic83$;
    private static final SubLSymbol $ic84$;
    
    public static SubLObject f5947(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0087.NIL;
        SubLObject var6 = (SubLObject)module0087.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0087.$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0087.$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        if (module0087.NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)module0087.$ic1$, var5, var6);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0087.$ic0$);
        return (SubLObject)module0087.NIL;
    }
    
    public static SubLObject f5948(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0087.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0087.$ic2$);
        var5 = var4.first();
        var4 = var4.rest();
        if (module0087.NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)module0087.$ic3$, var5);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0087.$ic2$);
        return (SubLObject)module0087.NIL;
    }
    
    public static SubLObject f5949(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0087.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0087.$ic4$);
        var5 = var4.first();
        var4 = var4.rest();
        if (module0087.NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)module0087.$ic5$, var5);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0087.$ic4$);
        return (SubLObject)module0087.NIL;
    }
    
    public static SubLObject f5950(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0087.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0087.$ic4$);
        var5 = var4.first();
        var4 = var4.rest();
        if (module0087.NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)module0087.$ic6$, var5);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0087.$ic4$);
        return (SubLObject)module0087.NIL;
    }
    
    public static SubLObject f5951(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0087.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0087.$ic4$);
        var5 = var4.first();
        var4 = var4.rest();
        if (module0087.NIL == var4) {
            return var5;
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0087.$ic4$);
        return (SubLObject)module0087.NIL;
    }
    
    public static SubLObject f5952(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0087.NIL;
        SubLObject var6 = (SubLObject)module0087.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0087.$ic7$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0087.$ic7$);
        var6 = var4.first();
        var4 = var4.rest();
        if (module0087.NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)module0087.$ic8$, var5, var6);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0087.$ic7$);
        return (SubLObject)module0087.NIL;
    }
    
    public static SubLObject f5953(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0087.NIL;
        SubLObject var6 = (SubLObject)module0087.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0087.$ic9$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0087.$ic9$);
        var6 = var4.first();
        var4 = var4.rest();
        if (module0087.NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)module0087.$ic10$, var5, var6);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0087.$ic9$);
        return (SubLObject)module0087.NIL;
    }
    
    public static SubLObject f5954(SubLObject var21) {
        if (var21 == module0087.UNPROVIDED) {
            var21 = Symbols.symbol_function((SubLObject)module0087.EQUAL);
        }
        assert module0087.NIL != module0030.f1591(var21) : var21;
        return module0067.f4880(var21, (SubLObject)module0087.UNPROVIDED);
    }
    
    public static SubLObject f5955(final SubLObject var22) {
        assert module0087.NIL != f5956(var22, (SubLObject)module0087.UNPROVIDED) : var22;
        return module0079.f5420(var22);
    }
    
    public static SubLObject f5956(final SubLObject var9, SubLObject var23) {
        if (var23 == module0087.UNPROVIDED) {
            var23 = (SubLObject)module0087.T;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0087.NIL != module0079.f5404(var9) && module0087.NIL != ((module0087.NIL != var23) ? module0087.T : f5957(var9)));
    }
    
    public static SubLObject f5958(final SubLObject var22) {
        assert module0087.NIL != f5956(var22, (SubLObject)module0087.UNPROVIDED) : var22;
        return module0079.f5408(var22);
    }
    
    public static SubLObject f5959(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0087.$ic13$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0087.NIL;
        SubLObject var7 = (SubLObject)module0087.NIL;
        SubLObject var8 = (SubLObject)module0087.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0087.$ic13$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0087.$ic13$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0087.$ic13$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)module0087.NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)module0087.NIL;
        SubLObject var31_32 = (SubLObject)module0087.NIL;
        while (module0087.NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0087.$ic13$);
            var31_32 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0087.$ic13$);
            if (module0087.NIL == conses_high.member(var31_32, (SubLObject)module0087.$ic14$, (SubLObject)module0087.UNPROVIDED, (SubLObject)module0087.UNPROVIDED)) {
                var11 = (SubLObject)module0087.T;
            }
            if (var31_32 == module0087.$ic15$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (module0087.NIL != var11 && module0087.NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0087.$ic13$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0087.$ic16$, var4);
        final SubLObject var13 = (SubLObject)((module0087.NIL != var12) ? conses_high.cadr(var12) : module0087.NIL);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)module0087.$ic17$, var4);
        final SubLObject var15 = (module0087.NIL != var14) ? conses_high.cadr(var14) : PrintLow.format((SubLObject)module0087.NIL, (SubLObject)module0087.$ic18$, var8);
        final SubLObject var16;
        var4 = (var16 = var5);
        final SubLObject var17 = (SubLObject)module0087.$ic19$;
        final SubLObject var18 = (SubLObject)module0087.$ic20$;
        final SubLObject var19 = (SubLObject)module0087.$ic21$;
        final SubLObject var20 = (SubLObject)module0087.$ic22$;
        return (SubLObject)ConsesLow.list((SubLObject)module0087.$ic23$, (SubLObject)ConsesLow.list(reader.bq_cons(var17, (SubLObject)module0087.$ic24$)), (SubLObject)ConsesLow.list((SubLObject)module0087.$ic25$, (SubLObject)ConsesLow.list(var19, var20, var8, (SubLObject)module0087.$ic16$, var13, (SubLObject)module0087.$ic26$, var15), (SubLObject)ConsesLow.list((SubLObject)module0087.$ic27$, var19), (SubLObject)ConsesLow.list((SubLObject)module0087.$ic28$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0087.$ic29$, var20), (SubLObject)ConsesLow.list((SubLObject)module0087.$ic30$, var20, var17), (SubLObject)ConsesLow.list((SubLObject)module0087.$ic31$, (SubLObject)ConsesLow.list((SubLObject)module0087.$ic32$, var13, (SubLObject)ConsesLow.list((SubLObject)module0087.$ic33$, var17)), (SubLObject)ConsesLow.list((SubLObject)module0087.$ic23$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var18, (SubLObject)ConsesLow.list((SubLObject)module0087.$ic34$, var17))), (SubLObject)ConsesLow.listS((SubLObject)module0087.$ic35$, (SubLObject)ConsesLow.list(var6, var7, var18, var13, var17), ConsesLow.append(var16, (SubLObject)module0087.NIL))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0087.$ic36$, var20), (SubLObject)ConsesLow.listS((SubLObject)module0087.$ic23$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)module0087.$ic37$, var20)), (SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.list((SubLObject)module0087.$ic38$, var20))), ConsesLow.append(var16, (SubLObject)module0087.NIL))))));
    }
    
    public static SubLObject f5960(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0087.$ic39$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0087.NIL;
        SubLObject var7 = (SubLObject)module0087.NIL;
        SubLObject var8 = (SubLObject)module0087.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0087.$ic39$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0087.$ic39$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0087.$ic39$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)module0087.NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)module0087.NIL;
        SubLObject var48_49 = (SubLObject)module0087.NIL;
        while (module0087.NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0087.$ic39$);
            var48_49 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0087.$ic39$);
            if (module0087.NIL == conses_high.member(var48_49, (SubLObject)module0087.$ic40$, (SubLObject)module0087.UNPROVIDED, (SubLObject)module0087.UNPROVIDED)) {
                var11 = (SubLObject)module0087.T;
            }
            if (var48_49 == module0087.$ic15$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (module0087.NIL != var11 && module0087.NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0087.$ic39$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0087.$ic16$, var4);
        final SubLObject var13 = (SubLObject)((module0087.NIL != var12) ? conses_high.cadr(var12) : module0087.NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        final SubLObject var15 = (SubLObject)module0087.$ic41$;
        final SubLObject var16 = (SubLObject)module0087.$ic42$;
        return (SubLObject)ConsesLow.list((SubLObject)module0087.$ic23$, (SubLObject)ConsesLow.list(reader.bq_cons(var15, (SubLObject)module0087.$ic24$)), (SubLObject)ConsesLow.listS((SubLObject)module0087.$ic35$, (SubLObject)ConsesLow.list(var6, var7, var8, var13, var15), ConsesLow.append(var14, (SubLObject)module0087.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0087.$ic31$, (SubLObject)ConsesLow.list((SubLObject)module0087.$ic32$, var13, (SubLObject)ConsesLow.list((SubLObject)module0087.$ic33$, var15)), (SubLObject)ConsesLow.list((SubLObject)module0087.$ic23$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var16, (SubLObject)ConsesLow.list((SubLObject)module0087.$ic34$, var15))), (SubLObject)ConsesLow.listS((SubLObject)module0087.$ic35$, (SubLObject)ConsesLow.list(var6, var7, var16, var13, var15), ConsesLow.append(var14, (SubLObject)module0087.NIL)))));
    }
    
    public static SubLObject f5961(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0087.$ic43$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0087.NIL;
        SubLObject var7 = (SubLObject)module0087.NIL;
        SubLObject var8 = (SubLObject)module0087.NIL;
        SubLObject var9 = (SubLObject)module0087.NIL;
        SubLObject var10 = (SubLObject)module0087.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0087.$ic43$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0087.$ic43$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0087.$ic43$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0087.$ic43$);
        var9 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0087.$ic43$);
        var10 = var4.first();
        var4 = var4.rest();
        if (module0087.NIL == var4) {
            final SubLObject var11;
            var4 = (var11 = var5);
            final SubLObject var12 = (SubLObject)module0087.$ic44$;
            final SubLObject var13 = (SubLObject)module0087.$ic45$;
            return (SubLObject)ConsesLow.list((SubLObject)module0087.$ic25$, (SubLObject)ConsesLow.list(var12, var13, var8, (SubLObject)module0087.$ic16$, var9), (SubLObject)ConsesLow.list((SubLObject)module0087.$ic27$, var12), (SubLObject)ConsesLow.list((SubLObject)module0087.$ic28$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0087.$ic29$, var13), (SubLObject)ConsesLow.list((SubLObject)module0087.$ic30$, var13, var10)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0087.$ic36$, var13), (SubLObject)ConsesLow.listS((SubLObject)module0087.$ic23$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)module0087.$ic37$, var13)), (SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.list((SubLObject)module0087.$ic38$, var13))), ConsesLow.append(var11, (SubLObject)module0087.NIL)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0087.$ic43$);
        return (SubLObject)module0087.NIL;
    }
    
    public static SubLObject f5962(final SubLObject var22) {
        assert module0087.NIL != f5956(var22, (SubLObject)module0087.UNPROVIDED) : var22;
        return f5963(var22);
    }
    
    public static SubLObject f5964(final SubLObject var57) {
        SubLObject var58 = (SubLObject)module0087.NIL;
        SubLObject var59 = (SubLObject)module0087.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var57, var57, (SubLObject)module0087.$ic46$);
        var58 = var57.first();
        SubLObject var60 = var57.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var60, var57, (SubLObject)module0087.$ic46$);
        var59 = var60.first();
        var60 = var60.rest();
        if (module0087.NIL == var60) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0087.NIL != module0052.f3687(var58) && module0087.NIL != module0054.f3970(var59));
        }
        cdestructuring_bind.cdestructuring_bind_error(var57, (SubLObject)module0087.$ic46$);
        return (SubLObject)module0087.NIL;
    }
    
    public static SubLObject f5965(final SubLObject var57) {
        SubLObject var58 = (SubLObject)module0087.NIL;
        SubLObject var59 = (SubLObject)module0087.NIL;
        SubLObject var60 = (SubLObject)module0087.NIL;
        SubLObject var61 = (SubLObject)module0087.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var57, var57, (SubLObject)module0087.$ic46$);
        var60 = var57.first();
        SubLObject var62 = var57.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var62, var57, (SubLObject)module0087.$ic46$);
        var61 = var62.first();
        var62 = var62.rest();
        if (module0087.NIL == var62) {
            while ((module0087.NIL == module0052.f3687(var60) || module0087.NIL == module0054.f3970(var61)) && module0087.NIL == var58) {
                if (module0087.NIL != module0052.f3687(var60)) {
                    final SubLObject var63 = module0054.f3974(var61);
                    var60 = module0079.f5424(var63);
                }
                final SubLObject var64 = conses_high.second(module0052.f3693(var60));
                if (module0087.NIL != module0079.f5404(var64)) {
                    module0054.f3973(var64, var61);
                }
                else {
                    if (!var64.isCons()) {
                        continue;
                    }
                    var58 = var64.first();
                    var59 = var64.rest();
                    ConsesLow.rplaca(var57, var60);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var57, (SubLObject)module0087.$ic46$);
        }
        return Values.values((SubLObject)((module0087.NIL != var58) ? ConsesLow.list(var58, var59) : module0087.NIL), var57, Types.sublisp_null(var58));
    }
    
    public static SubLObject f5963(final SubLObject var22) {
        final SubLObject var23 = module0079.f5424(var22);
        final SubLObject var24 = module0054.f3968();
        final SubLObject var25 = (SubLObject)ConsesLow.list(var23, var24);
        return module0052.f3689(var25, Symbols.symbol_function((SubLObject)module0087.$ic47$), Symbols.symbol_function((SubLObject)module0087.$ic48$), (SubLObject)module0087.UNPROVIDED);
    }
    
    public static SubLObject f5966(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        assert module0087.NIL != f5956(var22, (SubLObject)module0087.UNPROVIDED) : var22;
        SubLObject var24 = (SubLObject)module0087.ZERO_INTEGER;
        final SubLObject var25 = module0054.f3968();
        final SubLObject var26 = module0079.f5424(var22);
        SubLObject var29;
        for (SubLObject var27 = (SubLObject)module0087.NIL; module0087.NIL == var27; var27 = (SubLObject)SubLObjectFactory.makeBoolean(module0087.NIL == var29)) {
            var23.resetMultipleValues();
            final SubLObject var28 = module0052.f3693(var26);
            var29 = var23.secondMultipleValue();
            var23.resetMultipleValues();
            if (module0087.NIL != var29) {
                SubLObject var31;
                final SubLObject var30 = var31 = var28;
                SubLObject var32 = (SubLObject)module0087.NIL;
                SubLObject var33 = (SubLObject)module0087.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var31, var30, (SubLObject)module0087.$ic49$);
                var32 = var31.first();
                var31 = var31.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var31, var30, (SubLObject)module0087.$ic49$);
                var33 = var31.first();
                var31 = var31.rest();
                if (module0087.NIL == var31) {
                    if (module0087.NIL != module0079.f5404(var33)) {
                        module0054.f3973(var33, var25);
                    }
                    else if (var33.isCons()) {
                        final SubLObject var34 = var33.first();
                        final SubLObject var35 = var33.rest();
                        var24 = Numbers.add(var24, (SubLObject)module0087.ONE_INTEGER);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var30, (SubLObject)module0087.$ic49$);
                }
            }
        }
        while (module0087.NIL == module0054.f3970(var25)) {
            final SubLObject var36 = module0054.f3974(var25);
            final SubLObject var37 = module0079.f5424(var36);
            SubLObject var40;
            for (SubLObject var38 = (SubLObject)module0087.NIL; module0087.NIL == var38; var38 = (SubLObject)SubLObjectFactory.makeBoolean(module0087.NIL == var40)) {
                var23.resetMultipleValues();
                final SubLObject var39 = module0052.f3693(var37);
                var40 = var23.secondMultipleValue();
                var23.resetMultipleValues();
                if (module0087.NIL != var40) {
                    SubLObject var42;
                    final SubLObject var41 = var42 = var39;
                    SubLObject var43 = (SubLObject)module0087.NIL;
                    SubLObject var44 = (SubLObject)module0087.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var42, var41, (SubLObject)module0087.$ic49$);
                    var43 = var42.first();
                    var42 = var42.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var42, var41, (SubLObject)module0087.$ic49$);
                    var44 = var42.first();
                    var42 = var42.rest();
                    if (module0087.NIL == var42) {
                        if (module0087.NIL != module0079.f5404(var44)) {
                            module0054.f3973(var44, var25);
                        }
                        else if (var44.isCons()) {
                            final SubLObject var45 = var44.first();
                            final SubLObject var46 = var44.rest();
                            var24 = Numbers.add(var24, (SubLObject)module0087.ONE_INTEGER);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var41, (SubLObject)module0087.$ic49$);
                    }
                }
            }
        }
        return var24;
    }
    
    public static SubLObject f5967(final SubLObject var22) {
        assert module0087.NIL != f5956(var22, (SubLObject)module0087.UNPROVIDED) : var22;
        return module0079.f5410(var22);
    }
    
    public static SubLObject f5968(final SubLObject var22, final SubLObject var5, final SubLObject var6) {
        assert module0087.NIL != f5956(var22, (SubLObject)module0087.UNPROVIDED) : var22;
        assert module0087.NIL != f5969(var5) : var5;
        final SubLObject var23 = f5970(var22, var5);
        final SubLObject var24 = f5971(var22, var5, var6);
        if (var23 == module0087.$ic51$) {
            return var24;
        }
        return (SubLObject)module0087.$ic52$;
    }
    
    public static SubLObject f5971(final SubLObject var22, final SubLObject var5, final SubLObject var6) {
        assert module0087.NIL != f5956(var22, (SubLObject)module0087.UNPROVIDED) : var22;
        assert module0087.NIL != f5969(var5) : var5;
        return f5972(var22, f5973(var5), (SubLObject)ConsesLow.list(var6), (SubLObject)module0087.ONE_INTEGER, var5);
    }
    
    public static SubLObject f5970(final SubLObject var22, final SubLObject var5) {
        assert module0087.NIL != f5956(var22, (SubLObject)module0087.UNPROVIDED) : var22;
        assert module0087.NIL != f5969(var5) : var5;
        return f5974(var22, f5973(var5), var5);
    }
    
    public static SubLObject f5975(final SubLObject var22, final SubLObject var5, final SubLObject var6) {
        assert module0087.NIL != f5956(var22, (SubLObject)module0087.UNPROVIDED) : var22;
        assert module0087.NIL != f5969(var5) : var5;
        final SubLObject var23 = Sequences.delete(var6, f5976(var22, var5), f5958(var22), (SubLObject)module0087.UNPROVIDED, (SubLObject)module0087.UNPROVIDED, (SubLObject)module0087.UNPROVIDED, (SubLObject)module0087.UNPROVIDED);
        f5970(var22, var5);
        SubLObject var24 = var23;
        SubLObject var25 = (SubLObject)module0087.NIL;
        var25 = var24.first();
        while (module0087.NIL != var24) {
            f5971(var22, var5, var25);
            var24 = var24.rest();
            var25 = var24.first();
        }
        return var23;
    }
    
    public static SubLObject f5976(final SubLObject var22, final SubLObject var5) {
        assert module0087.NIL != f5956(var22, (SubLObject)module0087.UNPROVIDED) : var22;
        assert module0087.NIL != f5969(var5) : var5;
        final SubLObject var23 = f5973(var5);
        SubLObject var24;
        SubLObject var25;
        SubLObject var26;
        for (var24 = var22, var25 = (SubLObject)module0087.NIL, var26 = (SubLObject)module0087.NIL, var25 = f5977(var23, (SubLObject)module0087.ZERO_INTEGER), var26 = f5978(var23, (SubLObject)module0087.ONE_INTEGER, (SubLObject)module0087.UNPROVIDED); module0087.NIL != var24 && !var24.isCons(); var24 = module0079.f5416(var24, var25, (SubLObject)module0087.UNPROVIDED), var25 = f5977(var26, (SubLObject)module0087.ZERO_INTEGER), var26 = f5978(var26, (SubLObject)module0087.ONE_INTEGER, (SubLObject)module0087.UNPROVIDED)) {}
        if (module0087.NIL != var24 && module0087.NIL != f5979(var5, var24.first(), f5958(var22))) {
            return var24.rest();
        }
        return (SubLObject)module0087.NIL;
    }
    
    public static SubLObject f5980(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        assert module0087.NIL != f5956(var22, (SubLObject)module0087.UNPROVIDED) : var22;
        SubLObject var24 = (SubLObject)module0087.NIL;
        final SubLObject var25 = module0054.f3968();
        final SubLObject var26 = module0079.f5424(var22);
        SubLObject var29;
        for (SubLObject var27 = (SubLObject)module0087.NIL; module0087.NIL == var27; var27 = (SubLObject)SubLObjectFactory.makeBoolean(module0087.NIL == var29)) {
            var23.resetMultipleValues();
            final SubLObject var28 = module0052.f3693(var26);
            var29 = var23.secondMultipleValue();
            var23.resetMultipleValues();
            if (module0087.NIL != var29) {
                SubLObject var31;
                final SubLObject var30 = var31 = var28;
                SubLObject var32 = (SubLObject)module0087.NIL;
                SubLObject var33 = (SubLObject)module0087.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var31, var30, (SubLObject)module0087.$ic49$);
                var32 = var31.first();
                var31 = var31.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var31, var30, (SubLObject)module0087.$ic49$);
                var33 = var31.first();
                var31 = var31.rest();
                if (module0087.NIL == var31) {
                    if (module0087.NIL != module0079.f5404(var33)) {
                        module0054.f3973(var33, var25);
                    }
                    else if (var33.isCons()) {
                        final SubLObject var34 = var33.first();
                        final SubLObject var35 = var33.rest();
                        var24 = (SubLObject)ConsesLow.cons(var34, var24);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var30, (SubLObject)module0087.$ic49$);
                }
            }
        }
        while (module0087.NIL == module0054.f3970(var25)) {
            final SubLObject var36 = module0054.f3974(var25);
            final SubLObject var37 = module0079.f5424(var36);
            SubLObject var40;
            for (SubLObject var38 = (SubLObject)module0087.NIL; module0087.NIL == var38; var38 = (SubLObject)SubLObjectFactory.makeBoolean(module0087.NIL == var40)) {
                var23.resetMultipleValues();
                final SubLObject var39 = module0052.f3693(var37);
                var40 = var23.secondMultipleValue();
                var23.resetMultipleValues();
                if (module0087.NIL != var40) {
                    SubLObject var42;
                    final SubLObject var41 = var42 = var39;
                    SubLObject var43 = (SubLObject)module0087.NIL;
                    SubLObject var44 = (SubLObject)module0087.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var42, var41, (SubLObject)module0087.$ic49$);
                    var43 = var42.first();
                    var42 = var42.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var42, var41, (SubLObject)module0087.$ic49$);
                    var44 = var42.first();
                    var42 = var42.rest();
                    if (module0087.NIL == var42) {
                        if (module0087.NIL != module0079.f5404(var44)) {
                            module0054.f3973(var44, var25);
                        }
                        else if (var44.isCons()) {
                            final SubLObject var45 = var44.first();
                            final SubLObject var46 = var44.rest();
                            var24 = (SubLObject)ConsesLow.cons(var45, var24);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var41, (SubLObject)module0087.$ic49$);
                    }
                }
            }
        }
        return var24;
    }
    
    public static SubLObject f5981(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        assert module0087.NIL != f5956(var22, (SubLObject)module0087.UNPROVIDED) : var22;
        SubLObject var24 = (SubLObject)module0087.NIL;
        final SubLObject var25 = module0054.f3968();
        final SubLObject var26 = module0079.f5424(var22);
        SubLObject var29;
        for (SubLObject var27 = (SubLObject)module0087.NIL; module0087.NIL == var27; var27 = (SubLObject)SubLObjectFactory.makeBoolean(module0087.NIL == var29)) {
            var23.resetMultipleValues();
            final SubLObject var28 = module0052.f3693(var26);
            var29 = var23.secondMultipleValue();
            var23.resetMultipleValues();
            if (module0087.NIL != var29) {
                SubLObject var31;
                final SubLObject var30 = var31 = var28;
                SubLObject var32 = (SubLObject)module0087.NIL;
                SubLObject var33 = (SubLObject)module0087.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var31, var30, (SubLObject)module0087.$ic49$);
                var32 = var31.first();
                var31 = var31.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var31, var30, (SubLObject)module0087.$ic49$);
                var33 = var31.first();
                var31 = var31.rest();
                if (module0087.NIL == var31) {
                    if (module0087.NIL != module0079.f5404(var33)) {
                        module0054.f3973(var33, var25);
                    }
                    else if (var33.isCons()) {
                        final SubLObject var34 = var33.first();
                        final SubLObject var35 = var33.rest();
                        var24 = (SubLObject)ConsesLow.cons(var35, var24);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var30, (SubLObject)module0087.$ic49$);
                }
            }
        }
        while (module0087.NIL == module0054.f3970(var25)) {
            final SubLObject var36 = module0054.f3974(var25);
            final SubLObject var37 = module0079.f5424(var36);
            SubLObject var40;
            for (SubLObject var38 = (SubLObject)module0087.NIL; module0087.NIL == var38; var38 = (SubLObject)SubLObjectFactory.makeBoolean(module0087.NIL == var40)) {
                var23.resetMultipleValues();
                final SubLObject var39 = module0052.f3693(var37);
                var40 = var23.secondMultipleValue();
                var23.resetMultipleValues();
                if (module0087.NIL != var40) {
                    SubLObject var42;
                    final SubLObject var41 = var42 = var39;
                    SubLObject var43 = (SubLObject)module0087.NIL;
                    SubLObject var44 = (SubLObject)module0087.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var42, var41, (SubLObject)module0087.$ic49$);
                    var43 = var42.first();
                    var42 = var42.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var42, var41, (SubLObject)module0087.$ic49$);
                    var44 = var42.first();
                    var42 = var42.rest();
                    if (module0087.NIL == var42) {
                        if (module0087.NIL != module0079.f5404(var44)) {
                            module0054.f3973(var44, var25);
                        }
                        else if (var44.isCons()) {
                            final SubLObject var45 = var44.first();
                            final SubLObject var46 = var44.rest();
                            var24 = (SubLObject)ConsesLow.cons(var46, var24);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var41, (SubLObject)module0087.$ic49$);
                    }
                }
            }
        }
        return var24;
    }
    
    public static SubLObject f5982(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        assert module0087.NIL != f5956(var22, (SubLObject)module0087.UNPROVIDED) : var22;
        SubLObject var24 = (SubLObject)module0087.NIL;
        final SubLObject var25 = module0054.f3968();
        final SubLObject var26 = module0079.f5424(var22);
        SubLObject var29;
        for (SubLObject var27 = (SubLObject)module0087.NIL; module0087.NIL == var27; var27 = (SubLObject)SubLObjectFactory.makeBoolean(module0087.NIL == var29)) {
            var23.resetMultipleValues();
            final SubLObject var28 = module0052.f3693(var26);
            var29 = var23.secondMultipleValue();
            var23.resetMultipleValues();
            if (module0087.NIL != var29) {
                SubLObject var31;
                final SubLObject var30 = var31 = var28;
                SubLObject var32 = (SubLObject)module0087.NIL;
                SubLObject var33 = (SubLObject)module0087.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var31, var30, (SubLObject)module0087.$ic49$);
                var32 = var31.first();
                var31 = var31.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var31, var30, (SubLObject)module0087.$ic49$);
                var33 = var31.first();
                var31 = var31.rest();
                if (module0087.NIL == var31) {
                    if (module0087.NIL != module0079.f5404(var33)) {
                        module0054.f3973(var33, var25);
                    }
                    else if (var33.isCons()) {
                        final SubLObject var34 = var33.first();
                        final SubLObject var35 = var33.rest();
                        var24 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var34, var35), var24);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var30, (SubLObject)module0087.$ic49$);
                }
            }
        }
        while (module0087.NIL == module0054.f3970(var25)) {
            final SubLObject var36 = module0054.f3974(var25);
            final SubLObject var37 = module0079.f5424(var36);
            SubLObject var40;
            for (SubLObject var38 = (SubLObject)module0087.NIL; module0087.NIL == var38; var38 = (SubLObject)SubLObjectFactory.makeBoolean(module0087.NIL == var40)) {
                var23.resetMultipleValues();
                final SubLObject var39 = module0052.f3693(var37);
                var40 = var23.secondMultipleValue();
                var23.resetMultipleValues();
                if (module0087.NIL != var40) {
                    SubLObject var42;
                    final SubLObject var41 = var42 = var39;
                    SubLObject var43 = (SubLObject)module0087.NIL;
                    SubLObject var44 = (SubLObject)module0087.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var42, var41, (SubLObject)module0087.$ic49$);
                    var43 = var42.first();
                    var42 = var42.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var42, var41, (SubLObject)module0087.$ic49$);
                    var44 = var42.first();
                    var42 = var42.rest();
                    if (module0087.NIL == var42) {
                        if (module0087.NIL != module0079.f5404(var44)) {
                            module0054.f3973(var44, var25);
                        }
                        else if (var44.isCons()) {
                            final SubLObject var45 = var44.first();
                            final SubLObject var46 = var44.rest();
                            var24 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var45, var46), var24);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var41, (SubLObject)module0087.$ic49$);
                    }
                }
            }
        }
        return var24;
    }
    
    public static SubLObject f5983(final SubLObject var22, final SubLObject var5) {
        assert module0087.NIL != f5956(var22, (SubLObject)module0087.UNPROVIDED) : var22;
        assert module0087.NIL != f5969(var5) : var5;
        SubLObject var23 = (SubLObject)module0087.NIL;
        SubLObject var24 = var22;
        SubLObject var25 = (SubLObject)module0087.NIL;
        SubLObject var26;
        SubLObject var27;
        for (var26 = (SubLObject)module0087.NIL, var27 = (SubLObject)module0087.NIL, var26 = f5977(var5, (SubLObject)module0087.ZERO_INTEGER), var27 = f5978(var5, (SubLObject)module0087.ONE_INTEGER, (SubLObject)module0087.UNPROVIDED); module0087.NIL != var24 && !var24.isCons(); var24 = module0079.f5416(var24, var26, (SubLObject)module0087.UNPROVIDED), var26 = f5977(var27, (SubLObject)module0087.ZERO_INTEGER), var27 = f5978(var27, (SubLObject)module0087.ONE_INTEGER, (SubLObject)module0087.UNPROVIDED)) {
            if (module0087.NIL != module0079.f5404(var24)) {
                var25 = module0079.f5416(var24, module0087.$g1177$.getGlobalValue(), (SubLObject)module0087.UNPROVIDED);
                if (module0087.NIL != var25) {
                    var23 = (SubLObject)ConsesLow.cons(var25, var23);
                }
            }
        }
        if (module0087.NIL != var24 && module0087.NIL != f5979(var24.first(), f5978(var5, (SubLObject)module0087.ZERO_INTEGER, Sequences.length(var24.first())), f5958(var22))) {
            var23 = (SubLObject)ConsesLow.cons(var24, var23);
        }
        return var23;
    }
    
    public static SubLObject f5984(final SubLObject var22, final SubLObject var5) {
        assert module0087.NIL != f5956(var22, (SubLObject)module0087.UNPROVIDED) : var22;
        assert module0087.NIL != f5969(var5) : var5;
        SubLObject var23;
        SubLObject var24;
        SubLObject var25;
        for (var23 = var22, var24 = (SubLObject)module0087.NIL, var25 = (SubLObject)module0087.NIL, var24 = f5977(var5, (SubLObject)module0087.ZERO_INTEGER), var25 = f5978(var5, (SubLObject)module0087.ONE_INTEGER, (SubLObject)module0087.UNPROVIDED); module0087.NIL != var23 && !var23.isCons() && module0087.NIL != var24; var23 = module0079.f5416(var23, var24, (SubLObject)module0087.UNPROVIDED), var24 = (SubLObject)(Sequences.length(var25).numG((SubLObject)module0087.ZERO_INTEGER) ? f5977(var25, (SubLObject)module0087.ZERO_INTEGER) : module0087.NIL), var25 = f5978(var25, (SubLObject)module0087.ONE_INTEGER, (SubLObject)module0087.UNPROVIDED)) {}
        if (module0087.NIL == var23) {
            return (SubLObject)module0087.NIL;
        }
        if (var23.isCons() && module0087.NIL != f5979(f5978(var23.first(), (SubLObject)module0087.ZERO_INTEGER, Sequences.length(var5)), var5, f5958(var22))) {
            return (SubLObject)ConsesLow.list(var23);
        }
        if (module0087.NIL != module0079.f5404(var23)) {
            return f5982(var23);
        }
        return (SubLObject)module0087.NIL;
    }
    
    public static SubLObject f5985(final SubLObject var22, final SubLObject var104) {
        final SubLThread var105 = SubLProcess.currentSubLThread();
        assert module0087.NIL != f5956(var22, (SubLObject)module0087.UNPROVIDED) : var22;
        assert module0087.NIL != Types.functionp(var104) : var104;
        final SubLObject var106 = module0054.f3968();
        final SubLObject var107 = module0079.f5424(var22);
        SubLObject var110;
        for (SubLObject var108 = (SubLObject)module0087.NIL; module0087.NIL == var108; var108 = (SubLObject)SubLObjectFactory.makeBoolean(module0087.NIL == var110)) {
            var105.resetMultipleValues();
            final SubLObject var109 = module0052.f3693(var107);
            var110 = var105.secondMultipleValue();
            var105.resetMultipleValues();
            if (module0087.NIL != var110) {
                SubLObject var112;
                final SubLObject var111 = var112 = var109;
                SubLObject var113 = (SubLObject)module0087.NIL;
                SubLObject var114 = (SubLObject)module0087.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var112, var111, (SubLObject)module0087.$ic49$);
                var113 = var112.first();
                var112 = var112.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var112, var111, (SubLObject)module0087.$ic49$);
                var114 = var112.first();
                var112 = var112.rest();
                if (module0087.NIL == var112) {
                    if (module0087.NIL != module0079.f5404(var114)) {
                        module0054.f3973(var114, var106);
                    }
                    else if (var114.isCons()) {
                        final SubLObject var115 = var114.first();
                        final SubLObject var116 = var114.rest();
                        Functions.funcall(var104, var115, var116);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var111, (SubLObject)module0087.$ic49$);
                }
            }
        }
        while (module0087.NIL == module0054.f3970(var106)) {
            final SubLObject var117 = module0054.f3974(var106);
            final SubLObject var118 = module0079.f5424(var117);
            SubLObject var121;
            for (SubLObject var119 = (SubLObject)module0087.NIL; module0087.NIL == var119; var119 = (SubLObject)SubLObjectFactory.makeBoolean(module0087.NIL == var121)) {
                var105.resetMultipleValues();
                final SubLObject var120 = module0052.f3693(var118);
                var121 = var105.secondMultipleValue();
                var105.resetMultipleValues();
                if (module0087.NIL != var121) {
                    SubLObject var123;
                    final SubLObject var122 = var123 = var120;
                    SubLObject var124 = (SubLObject)module0087.NIL;
                    SubLObject var125 = (SubLObject)module0087.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var123, var122, (SubLObject)module0087.$ic49$);
                    var124 = var123.first();
                    var123 = var123.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var123, var122, (SubLObject)module0087.$ic49$);
                    var125 = var123.first();
                    var123 = var123.rest();
                    if (module0087.NIL == var123) {
                        if (module0087.NIL != module0079.f5404(var125)) {
                            module0054.f3973(var125, var106);
                        }
                        else if (var125.isCons()) {
                            final SubLObject var126 = var125.first();
                            final SubLObject var127 = var125.rest();
                            Functions.funcall(var104, var126, var127);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var122, (SubLObject)module0087.$ic49$);
                    }
                }
            }
        }
        return (SubLObject)module0087.NIL;
    }
    
    public static SubLObject f5969(final SubLObject var9) {
        if (var9.isList()) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0087.NIL == module0004.f104(module0087.$g1177$.getGlobalValue(), var9, Symbols.symbol_function((SubLObject)module0087.EQUAL), (SubLObject)module0087.UNPROVIDED));
        }
        if (var9.isString()) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0087.NIL == module0038.f2702(module0087.$g1177$.getGlobalValue(), var9, (SubLObject)module0087.UNPROVIDED));
        }
        if (var9.isVector()) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0087.NIL == module0004.f104(module0087.$g1177$.getGlobalValue(), module0037.f2558(var9, (SubLObject)module0087.UNPROVIDED), (SubLObject)module0087.UNPROVIDED, (SubLObject)module0087.UNPROVIDED));
        }
        return (SubLObject)module0087.NIL;
    }
    
    public static SubLObject f5986(final SubLObject var22, final SubLObject var109) {
        final SubLThread var110 = SubLProcess.currentSubLThread();
        assert module0087.NIL != f5956(var22, (SubLObject)module0087.UNPROVIDED) : var22;
        assert module0087.NIL != module0086.f5908(var109) : var109;
        module0086.f5926(var109);
        final SubLObject var111 = module0054.f3968();
        module0054.f3973((SubLObject)ConsesLow.list((SubLObject)module0087.$ic55$, (SubLObject)module0087.NIL, var22), var111);
        while (module0087.NIL == module0054.f3970(var111)) {
            final SubLObject var112 = module0054.f3974(var111);
            SubLObject var114;
            final SubLObject var113 = var114 = var112;
            SubLObject var115 = (SubLObject)module0087.NIL;
            SubLObject var116 = (SubLObject)module0087.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var114, var113, (SubLObject)module0087.$ic56$);
            var115 = var114.first();
            var114 = var114.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var114, var113, (SubLObject)module0087.$ic56$);
            var116 = var114.first();
            var114 = var114.rest();
            final SubLObject var22_115 = (SubLObject)(var114.isCons() ? var114.first() : module0087.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(var114, var113, (SubLObject)module0087.$ic56$);
            var114 = var114.rest();
            if (module0087.NIL == var114) {
                final SubLObject var117 = var115;
                if (var117.eql((SubLObject)module0087.$ic55$)) {
                    module0086.f5929(var109, var116);
                    module0054.f3973((SubLObject)ConsesLow.list((SubLObject)module0087.$ic57$, var116), var111);
                    final SubLObject var118 = module0079.f5424(var22_115);
                    SubLObject var121;
                    for (SubLObject var119 = (SubLObject)module0087.NIL; module0087.NIL == var119; var119 = (SubLObject)SubLObjectFactory.makeBoolean(module0087.NIL == var121)) {
                        var110.resetMultipleValues();
                        final SubLObject var120 = module0052.f3693(var118);
                        var121 = var110.secondMultipleValue();
                        var110.resetMultipleValues();
                        if (module0087.NIL != var121) {
                            SubLObject var119_120;
                            final SubLObject var117_118 = var119_120 = var120;
                            SubLObject var122 = (SubLObject)module0087.NIL;
                            SubLObject var123 = (SubLObject)module0087.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var119_120, var117_118, (SubLObject)module0087.$ic58$);
                            var122 = var119_120.first();
                            var119_120 = var119_120.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var119_120, var117_118, (SubLObject)module0087.$ic58$);
                            var123 = var119_120.first();
                            var119_120 = var119_120.rest();
                            if (module0087.NIL == var119_120) {
                                if (module0087.NIL != module0079.f5404(var123)) {
                                    final SubLObject var124 = (SubLObject)ConsesLow.cons(var122, var116);
                                    final SubLObject var125 = (SubLObject)ConsesLow.list((SubLObject)module0087.$ic55$, var124, var123);
                                    module0054.f3973(var125, var111);
                                }
                                else if (var123.isCons()) {
                                    final SubLObject var126 = (SubLObject)ConsesLow.cons(var122, var123);
                                    module0086.f5928(var109, var126);
                                }
                                else {
                                    Errors.error((SubLObject)module0087.$ic59$, var123);
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var117_118, (SubLObject)module0087.$ic58$);
                            }
                        }
                    }
                }
                else if (var117.eql((SubLObject)module0087.$ic57$)) {
                    module0086.f5930(var109, var116);
                }
                else {
                    Errors.error((SubLObject)module0087.$ic60$, var112);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var113, (SubLObject)module0087.$ic56$);
            }
        }
        module0086.f5927(var109);
        return var109;
    }
    
    public static SubLObject f5957(final SubLObject var9) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var9.isCons() || (module0087.NIL != module0079.f5404(var9) && module0087.NIL == module0035.find_if_not(Symbols.symbol_function((SubLObject)module0087.$ic61$), module0079.f5435(var9), (SubLObject)module0087.UNPROVIDED, (SubLObject)module0087.UNPROVIDED, (SubLObject)module0087.UNPROVIDED)));
    }
    
    public static SubLObject f5972(final SubLObject var22, final SubLObject var124, final SubLObject var6, final SubLObject var125, final SubLObject var126) {
        final SubLObject var127 = f5977(var124, (SubLObject)module0087.ZERO_INTEGER);
        final SubLObject var128 = module0079.f5416(var22, var127, (SubLObject)module0087.UNPROVIDED);
        if (module0087.NIL == var128) {
            module0079.f5412(var22, var127, (SubLObject)ConsesLow.cons(var126, var6));
            return (SubLObject)module0087.$ic62$;
        }
        if (module0087.NIL != module0079.f5404(var128)) {
            final SubLObject var129 = f5972(var128, f5978(var124, (SubLObject)module0087.ONE_INTEGER, (SubLObject)module0087.UNPROVIDED), var6, Numbers.add(var125, (SubLObject)module0087.ONE_INTEGER), var126);
            module0079.f5422(var22, var127);
            return var129;
        }
        if (module0087.NIL != f5979(var126, var128.first(), f5958(var22))) {
            module0079.f5412(var22, var127, (SubLObject)ConsesLow.cons(var126, ConsesLow.append(var6, var128.rest())));
            return (SubLObject)module0087.$ic52$;
        }
        final SubLObject var130 = module0067.f4880(f5958(var22), (SubLObject)module0087.UNPROVIDED);
        module0079.f5412(var22, var127, var130);
        f5972(var130, f5978(f5973(var128.first()), var125, (SubLObject)module0087.UNPROVIDED), var128.rest(), Numbers.add(var125, (SubLObject)module0087.ONE_INTEGER), var128.first());
        f5972(var130, f5978(var124, (SubLObject)module0087.ONE_INTEGER, (SubLObject)module0087.UNPROVIDED), var6, Numbers.add(var125, (SubLObject)module0087.ONE_INTEGER), var126);
        return (SubLObject)module0087.$ic63$;
    }
    
    public static SubLObject f5974(final SubLObject var22, final SubLObject var124, final SubLObject var126) {
        final SubLObject var127 = f5977(var124, (SubLObject)module0087.ZERO_INTEGER);
        final SubLObject var128 = module0079.f5416(var22, var127, (SubLObject)module0087.UNPROVIDED);
        SubLObject var129 = (SubLObject)module0087.NIL;
        if (module0087.NIL == var128) {
            return (SubLObject)module0087.$ic51$;
        }
        if (module0087.NIL != module0079.f5404(var128)) {
            var129 = f5974(var128, f5978(var124, (SubLObject)module0087.ONE_INTEGER, (SubLObject)module0087.UNPROVIDED), var126);
            if (module0087.NIL != f5987(var129)) {
                if (module0079.f5406(var128).numE((SubLObject)module0087.ONE_INTEGER)) {
                    final SubLObject var130 = module0079.f5435(var128);
                    if (var130.first().isCons()) {
                        module0079.f5412(var22, var127, var130.first());
                        var129 = (SubLObject)module0087.$ic64$;
                    }
                    else {
                        module0079.f5422(var22, var127);
                    }
                }
                else if (module0087.NIL != module0079.f5410(var128)) {
                    module0079.f5418(var22, var127);
                    var129 = (SubLObject)module0087.$ic64$;
                }
                else {
                    module0079.f5422(var22, var127);
                }
            }
            return var129;
        }
        if (module0087.NIL != f5979(var126, var128.first(), f5958(var22))) {
            module0079.f5418(var22, var127);
            return (SubLObject)module0087.$ic65$;
        }
        return (SubLObject)module0087.$ic51$;
    }
    
    public static SubLObject f5987(final SubLObject var128) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0087.$ic65$ == var128 || module0087.$ic64$ == var128);
    }
    
    public static SubLObject f5977(final SubLObject var124, final SubLObject var130) {
        return (SubLObject)((module0087.NIL != var124) ? Sequences.elt(var124, var130) : module0087.NIL);
    }
    
    public static SubLObject f5973(final SubLObject var124) {
        if (var124.isList()) {
            return Sequences.cconcatenate(var124, (SubLObject)ConsesLow.list(module0087.$g1177$.getGlobalValue()));
        }
        if (var124.isString()) {
            return Sequences.cconcatenate(var124, Strings.string(module0087.$g1177$.getGlobalValue()));
        }
        if (var124.isVector()) {
            return Sequences.cconcatenate(var124, Strings.string(module0087.$g1177$.getGlobalValue()));
        }
        return (SubLObject)module0087.NIL;
    }
    
    public static SubLObject f5978(final SubLObject var124, final SubLObject var131, SubLObject var132) {
        if (var132 == module0087.UNPROVIDED) {
            var132 = (SubLObject)module0087.NIL;
        }
        final SubLThread var133 = SubLProcess.currentSubLThread();
        assert module0087.NIL != Types.integerp(var131) : var131;
        if (module0087.NIL == Errors.$ignore_mustsP$.getDynamicValue(var133) && module0087.NIL != var132 && !var132.isInteger()) {
            Errors.error(Errors.error((SubLObject)module0087.$ic67$));
        }
        if (module0087.NIL != var132 && var131.numG(var132)) {
            Errors.error((SubLObject)module0087.$ic68$);
        }
        if (var124.isList()) {
            return (module0087.NIL != var132) ? module0035.f2124(Numbers.subtract(var132, var131), conses_high.nthcdr(var131, var124)) : conses_high.nthcdr(var131, var124);
        }
        if (var124.isVector()) {
            return f5988(var124, var131, var132);
        }
        if (var124.isString()) {
            return f5988(var124, var131, var132);
        }
        Errors.error((SubLObject)module0087.$ic69$, var124);
        return (SubLObject)module0087.NIL;
    }
    
    public static SubLObject f5988(final SubLObject var133, final SubLObject var131, SubLObject var132) {
        if (var132 == module0087.UNPROVIDED) {
            var132 = (SubLObject)module0087.NIL;
        }
        final SubLObject var134 = Sequences.length(var133);
        final SubLObject var135 = (module0087.NIL == var132 || var132.numG(var134)) ? var134 : var132;
        return (SubLObject)(var131.numGE(var134) ? module0087.NIL : Sequences.subseq(var133, var131, var135));
    }
    
    public static SubLObject f5979(final SubLObject var136, final SubLObject var137, SubLObject var21) {
        if (var21 == module0087.UNPROVIDED) {
            var21 = Symbols.symbol_function((SubLObject)module0087.EQL);
        }
        if (var136.isList()) {
            if (var137.isList()) {
                return (SubLObject)SubLObjectFactory.makeBoolean(module0087.NIL == Sequences.mismatch(var136, var137, var21, (SubLObject)module0087.UNPROVIDED, (SubLObject)module0087.UNPROVIDED, (SubLObject)module0087.UNPROVIDED, (SubLObject)module0087.UNPROVIDED, (SubLObject)module0087.UNPROVIDED));
            }
            return f5989(var136, var137, var21);
        }
        else {
            if (var137.isList()) {
                return f5989(var137, var136, var21);
            }
            return f5990(var136, var137, var21);
        }
    }
    
    public static SubLObject f5989(final SubLObject var138, final SubLObject var133, final SubLObject var21) {
        SubLObject var139;
        SubLObject var140;
        SubLObject var141;
        SubLObject var142;
        for (var139 = (SubLObject)module0087.T, var140 = var138, var141 = (SubLObject)module0087.ZERO_INTEGER, var142 = Sequences.length(var133); module0087.NIL != var139 && var141.numL(var142) && module0087.NIL != var140; var139 = Functions.funcall(var21, var140.first(), Vectors.aref(var133, var141)), var140 = var140.rest(), var141 = Numbers.add(var141, (SubLObject)module0087.ONE_INTEGER)) {}
        if (var141.numE(var142)) {
            if (module0087.NIL != var140) {
                var139 = (SubLObject)module0087.NIL;
            }
        }
        else if (module0087.NIL == var140) {
            var139 = (SubLObject)module0087.NIL;
        }
        return var139;
    }
    
    public static SubLObject f5990(final SubLObject var143, final SubLObject var144, final SubLObject var21) {
        SubLObject var145 = (SubLObject)module0087.T;
        final SubLObject var146 = Sequences.length(var143);
        final SubLObject var147 = Sequences.length(var144);
        SubLObject var148 = (SubLObject)module0087.ZERO_INTEGER;
        if (var146.eql(var147)) {
            while (module0087.NIL != var145 && var148.numL(var146)) {
                var145 = Functions.funcall(var21, Vectors.aref(var143, var148), Vectors.aref(var144, var148));
                var148 = Numbers.add(var148, (SubLObject)module0087.ONE_INTEGER);
            }
        }
        else {
            var145 = (SubLObject)module0087.NIL;
        }
        return var145;
    }
    
    public static SubLObject f5991(final SubLObject var147) {
        final SubLThread var148 = SubLProcess.currentSubLThread();
        final SubLObject var149 = f5954(Symbols.symbol_function((SubLObject)module0087.EQUALP));
        final SubLObject var150 = module0067.f4880(Symbols.symbol_function((SubLObject)module0087.EQUALP), (SubLObject)module0087.UNPROVIDED);
        SubLObject var151 = var147;
        SubLObject var152 = (SubLObject)module0087.NIL;
        var152 = var151.first();
        while (module0087.NIL != var151) {
            module0079.f5412(var150, var152, module0038.f2752(var152, (SubLObject)module0087.UNPROVIDED));
            var151 = var151.rest();
            var152 = var151.first();
        }
        if (module0087.NIL == Errors.$ignore_mustsP$.getDynamicValue(var148) && module0087.NIL == f5967(var149)) {
            Errors.error((SubLObject)module0087.$ic78$, f5966(var149));
        }
        var151 = var147;
        var152 = (SubLObject)module0087.NIL;
        var152 = var151.first();
        while (module0087.NIL != var151) {
            final SubLObject var153 = module0079.f5416(var150, var152, (SubLObject)module0087.UNPROVIDED);
            f5971(var149, var153, var152);
            var151 = var151.rest();
            var152 = var151.first();
        }
        var151 = var147;
        var152 = (SubLObject)module0087.NIL;
        var152 = var151.first();
        while (module0087.NIL != var151) {
            final SubLObject var153 = module0079.f5416(var150, var152, (SubLObject)module0087.UNPROVIDED);
            if (module0087.NIL == Errors.$ignore_mustsP$.getDynamicValue(var148) && !var152.equalp(f5976(var149, var153).first())) {
                Errors.error((SubLObject)module0087.$ic79$, var152, var153);
            }
            var151 = var151.rest();
            var152 = var151.first();
        }
        SubLObject var155;
        final SubLObject var154 = var155 = Sort.sort(conses_high.copy_list(var147), Symbols.symbol_function((SubLObject)module0087.$ic80$), Symbols.symbol_function((SubLObject)module0087.$ic81$));
        SubLObject var156 = (SubLObject)module0087.NIL;
        var156 = var155.first();
        while (module0087.NIL != var155) {
            final SubLObject var157 = module0079.f5416(var150, var156, (SubLObject)module0087.UNPROVIDED);
            final SubLObject var158 = f5970(var149, var157);
            if (module0087.NIL == Errors.$ignore_mustsP$.getDynamicValue(var148) && module0087.NIL == f5987(var158)) {
                Errors.error((SubLObject)module0087.$ic82$, var157);
            }
            var155 = var155.rest();
            var156 = var155.first();
        }
        if (module0087.NIL == Errors.$ignore_mustsP$.getDynamicValue(var148) && module0087.NIL == f5967(var149)) {
            Errors.error((SubLObject)module0087.$ic83$, f5966(var149), module0079.f5435(var149));
        }
        return (SubLObject)module0087.$ic84$;
    }
    
    public static SubLObject f5992() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0087", "f5947", "S#7592");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0087", "f5948", "S#7593");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0087", "f5949", "S#7594");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0087", "f5950", "S#7595");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0087", "f5951", "S#7596");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0087", "f5952", "S#7597");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0087", "f5953", "S#7598");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0087", "f5954", "S#7599", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0087", "f5955", "S#7600", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0087", "f5956", "S#7601", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0087", "f5958", "S#7602", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0087", "f5959", "S#7603");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0087", "f5960", "S#7604");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0087", "f5961", "S#7605");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0087", "f5962", "S#7606", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0087", "f5964", "S#7607", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0087", "f5965", "S#7608", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0087", "f5963", "S#7609", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0087", "f5966", "S#7610", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0087", "f5967", "S#7611", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0087", "f5968", "S#7612", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0087", "f5971", "S#7613", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0087", "f5970", "S#7614", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0087", "f5975", "S#7615", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0087", "f5976", "S#7616", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0087", "f5980", "S#7617", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0087", "f5981", "S#7618", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0087", "f5982", "S#7619", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0087", "f5983", "S#7620", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0087", "f5984", "S#7621", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0087", "f5985", "S#7622", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0087", "f5969", "S#7623", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0087", "f5986", "S#7624", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0087", "f5957", "S#7625", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0087", "f5972", "S#7626", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0087", "f5974", "S#7627", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0087", "f5987", "S#7628", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0087", "f5977", "S#7306", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0087", "f5973", "S#7629", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0087", "f5978", "S#7630", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0087", "f5988", "S#7631", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0087", "f5979", "S#7632", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0087", "f5989", "S#7633", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0087", "f5990", "S#7634", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0087", "f5991", "S#7635", 1, 0, false);
        return (SubLObject)module0087.NIL;
    }
    
    public static SubLObject f5993() {
        module0087.$g1177$ = SubLFiles.defconstant("S#7636", (SubLObject)Characters.CHAR_vertical);
        return (SubLObject)module0087.NIL;
    }
    
    public static SubLObject f5994() {
        module0012.f419((SubLObject)module0087.$ic47$);
        module0012.f419((SubLObject)module0087.$ic48$);
        module0027.f1449((SubLObject)module0087.$ic70$, (SubLObject)ConsesLow.list(new SubLObject[] { module0087.$ic71$, module0087.EQUAL, module0087.$ic72$, module0087.NIL, module0087.$ic73$, module0087.NIL, module0087.$ic74$, module0087.$ic75$, module0087.$ic76$, module0087.T }), (SubLObject)module0087.$ic77$);
        return (SubLObject)module0087.NIL;
    }
    
    public void declareFunctions() {
        f5992();
    }
    
    public void initializeVariables() {
        f5993();
    }
    
    public void runTopLevelForms() {
        f5994();
    }
    
    static {
        me = (SubLFile)new module0087();
        module0087.$g1177$ = null;
        $ic0$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"));
        $ic1$ = SubLObjectFactory.makeSymbol("CONS");
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#154", "CYC"));
        $ic3$ = SubLObjectFactory.makeSymbol("CONSP");
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#7637", "CYC"));
        $ic5$ = SubLObjectFactory.makeSymbol("CAR");
        $ic6$ = SubLObjectFactory.makeSymbol("CDR");
        $ic7$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#7637", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"));
        $ic8$ = SubLObjectFactory.makeSymbol("RPLACA");
        $ic9$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#7637", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"));
        $ic10$ = SubLObjectFactory.makeSymbol("RPLACD");
        $ic11$ = SubLObjectFactory.makeSymbol("S#2831", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#7601", "CYC");
        $ic13$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("VALUES"), (SubLObject)SubLObjectFactory.makeSymbol("S#7638", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6473", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)module0087.NIL, (SubLObject)SubLObjectFactory.makeString("Mapping ~S..."), (SubLObject)SubLObjectFactory.makeSymbol("S#7638", "CYC")))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic14$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"), (SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-NOTE"));
        $ic15$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic16$ = SubLObjectFactory.makeKeyword("DONE");
        $ic17$ = SubLObjectFactory.makeKeyword("PROGRESS-NOTE");
        $ic18$ = SubLObjectFactory.makeString("Mapping ~S...");
        $ic19$ = SubLObjectFactory.makeUninternedSymbol("US#352BD50");
        $ic20$ = SubLObjectFactory.makeUninternedSymbol("US#13A0444");
        $ic21$ = SubLObjectFactory.makeUninternedSymbol("US#6CABE02");
        $ic22$ = SubLObjectFactory.makeUninternedSymbol("US#7901B45");
        $ic23$ = SubLObjectFactory.makeSymbol("CLET");
        $ic24$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3952", "CYC")));
        $ic25$ = SubLObjectFactory.makeSymbol("S#7027", "CYC");
        $ic26$ = SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE");
        $ic27$ = SubLObjectFactory.makeSymbol("IGNORE");
        $ic28$ = SubLObjectFactory.makeSymbol("PCOND");
        $ic29$ = SubLObjectFactory.makeSymbol("S#3046", "CYC");
        $ic30$ = SubLObjectFactory.makeSymbol("S#3953", "CYC");
        $ic31$ = SubLObjectFactory.makeSymbol("UNTIL");
        $ic32$ = SubLObjectFactory.makeSymbol("COR");
        $ic33$ = SubLObjectFactory.makeSymbol("S#3954", "CYC");
        $ic34$ = SubLObjectFactory.makeSymbol("S#3955", "CYC");
        $ic35$ = SubLObjectFactory.makeSymbol("S#7605", "CYC");
        $ic36$ = SubLObjectFactory.makeSymbol("S#7593", "CYC");
        $ic37$ = SubLObjectFactory.makeSymbol("S#7594", "CYC");
        $ic38$ = SubLObjectFactory.makeSymbol("S#7595", "CYC");
        $ic39$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("VALUES"), (SubLObject)SubLObjectFactory.makeSymbol("S#7638", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic40$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic41$ = SubLObjectFactory.makeUninternedSymbol("US#352BD50");
        $ic42$ = SubLObjectFactory.makeUninternedSymbol("US#13A0444");
        $ic43$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("VALUES"), (SubLObject)SubLObjectFactory.makeSymbol("S#7639", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5431", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic44$ = SubLObjectFactory.makeUninternedSymbol("US#794E61F");
        $ic45$ = SubLObjectFactory.makeUninternedSymbol("US#712B0A2");
        $ic46$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5133", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5431", "CYC"));
        $ic47$ = SubLObjectFactory.makeSymbol("S#7607", "CYC");
        $ic48$ = SubLObjectFactory.makeSymbol("S#7608", "CYC");
        $ic49$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("US#794E61F"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#712B0A2"));
        $ic50$ = SubLObjectFactory.makeSymbol("S#7623", "CYC");
        $ic51$ = SubLObjectFactory.makeKeyword("VOID");
        $ic52$ = SubLObjectFactory.makeKeyword("ADDED");
        $ic53$ = SubLObjectFactory.makeSymbol("FUNCTIONP");
        $ic54$ = SubLObjectFactory.makeSymbol("S#7547", "CYC");
        $ic55$ = SubLObjectFactory.makeKeyword("VISIT");
        $ic56$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5671", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2815", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#7638", "CYC"));
        $ic57$ = SubLObjectFactory.makeKeyword("FINISH");
        $ic58$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#7640", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5858", "CYC"));
        $ic59$ = SubLObjectFactory.makeString("Invalid STRIE entry ~A ... neither sub-tree nor info node.");
        $ic60$ = SubLObjectFactory.makeString("Invalid state transition ~A in visitng of STRIE.");
        $ic61$ = SubLObjectFactory.makeSymbol("S#7625", "CYC");
        $ic62$ = SubLObjectFactory.makeKeyword("CREATED");
        $ic63$ = SubLObjectFactory.makeKeyword("SPLICED");
        $ic64$ = SubLObjectFactory.makeKeyword("SHRUNK");
        $ic65$ = SubLObjectFactory.makeKeyword("REMOVED");
        $ic66$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic67$ = SubLObjectFactory.makeString("~A is not an integer");
        $ic68$ = SubLObjectFactory.makeString("END must not be smaller than START");
        $ic69$ = SubLObjectFactory.makeString("~A is not a sequence");
        $ic70$ = SubLObjectFactory.makeSymbol("S#7635", "CYC");
        $ic71$ = SubLObjectFactory.makeKeyword("TEST");
        $ic72$ = SubLObjectFactory.makeKeyword("OWNER");
        $ic73$ = SubLObjectFactory.makeKeyword("CLASSES");
        $ic74$ = SubLObjectFactory.makeKeyword("KB");
        $ic75$ = SubLObjectFactory.makeKeyword("TINY");
        $ic76$ = SubLObjectFactory.makeKeyword("WORKING?");
        $ic77$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("George Washington Carver"), (SubLObject)SubLObjectFactory.makeString("George Washington"), (SubLObject)SubLObjectFactory.makeString("George Washington Adams"), (SubLObject)SubLObjectFactory.makeString("George Washington Curtis Lee"))), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")));
        $ic78$ = SubLObjectFactory.makeString("There are already ~A entries in the trie???");
        $ic79$ = SubLObjectFactory.makeString("Cannot retrieve ~A with lookup-key ~A.");
        $ic80$ = SubLObjectFactory.makeSymbol(">");
        $ic81$ = SubLObjectFactory.makeSymbol("LENGTH");
        $ic82$ = SubLObjectFactory.makeString("The deletion of key ~A did not modify the STrie!");
        $ic83$ = SubLObjectFactory.makeString("There are still ~A entries left over: ~A");
        $ic84$ = SubLObjectFactory.makeKeyword("SUCCESS");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0087.class
	Total time: 312 ms
	
	Decompiled with Procyon 0.5.32.
*/