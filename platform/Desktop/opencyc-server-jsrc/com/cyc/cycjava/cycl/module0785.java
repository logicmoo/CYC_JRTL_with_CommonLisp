package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0785 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0785";
    public static final String myFingerPrint = "cbf4696da70a1d4c31ae68a25fb17b36ffa8c0a683a05eaf9cb733794abd42ae";
    private static SubLSymbol $g6294$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLString $ic20$;
    private static final SubLString $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLString $ic40$;
    private static final SubLString $ic41$;
    private static final SubLString $ic42$;
    private static final SubLString $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLString $ic46$;
    private static final SubLString $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLList $ic52$;
    private static final SubLList $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLList $ic62$;
    private static final SubLList $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLList $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLList $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLObject $ic78$;
    private static final SubLList $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLList $ic81$;
    private static final SubLList $ic82$;
    private static final SubLList $ic83$;
    private static final SubLSymbol $ic84$;
    
    public static SubLObject f50382(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0743.f46012(var1) && module0743.f46029(var1).isList());
    }
    
    public static SubLObject f50383(final SubLObject var2) {
        assert NIL != Types.stringp(var2) : var2;
        final SubLObject var3 = module0743.f46023((SubLObject)ConsesLow.list((SubLObject)$ic1$, var2));
        f50384(var3, (SubLObject)$ic2$, module0784.f50375());
        return var3;
    }
    
    public static SubLObject f50385(final SubLObject var4) {
        assert NIL != f50382(var4) : var4;
        return module0743.f46028(var4);
    }
    
    public static SubLObject f50386(final SubLObject var4) {
        assert NIL != f50382(var4) : var4;
        return f50387(var4, (SubLObject)$ic2$);
    }
    
    public static SubLObject f50388(final SubLObject var4, final SubLObject var5) {
        final SubLObject var6 = f50387(var4, (SubLObject)$ic2$);
        final SubLObject var7 = module0784.f50376(var6, var5);
        return (SubLObject)((NIL != var7) ? $ic4$ : $ic5$);
    }
    
    public static SubLObject f50389(final SubLObject var4, final SubLObject var6) {
        return f50384(var4, (SubLObject)$ic2$, var6);
    }
    
    public static SubLObject f50390(final SubLObject var8, final SubLObject var9) {
        SubLObject var11;
        final SubLObject var10 = var11 = var8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var11, var10, (SubLObject)$ic6$);
        final SubLObject var12 = var11.rest();
        var11 = var11.first();
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var11, var10, (SubLObject)$ic6$);
        var13 = var11.first();
        var11 = var11.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var11, var10, (SubLObject)$ic6$);
        var14 = var11.first();
        var11 = var11.rest();
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = var11;
        SubLObject var17 = (SubLObject)NIL;
        SubLObject var16_17 = (SubLObject)NIL;
        while (NIL != var16) {
            cdestructuring_bind.destructuring_bind_must_consp(var16, var10, (SubLObject)$ic6$);
            var16_17 = var16.first();
            var16 = var16.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var16, var10, (SubLObject)$ic6$);
            if (NIL == conses_high.member(var16_17, (SubLObject)$ic7$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var17 = (SubLObject)T;
            }
            if (var16_17 == $ic8$) {
                var15 = var16.first();
            }
            var16 = var16.rest();
        }
        if (NIL != var17 && NIL == var15) {
            cdestructuring_bind.cdestructuring_bind_error(var10, (SubLObject)$ic6$);
        }
        final SubLObject var18 = cdestructuring_bind.property_list_member((SubLObject)$ic9$, var11);
        final SubLObject var19 = (SubLObject)((NIL != var18) ? conses_high.cadr(var18) : NIL);
        final SubLObject var20 = cdestructuring_bind.property_list_member((SubLObject)$ic10$, var11);
        final SubLObject var21 = (SubLObject)((NIL != var20) ? conses_high.cadr(var20) : NIL);
        final SubLObject var22;
        var11 = (var22 = var12);
        if (NIL != var19) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic11$, (SubLObject)ConsesLow.list(var13, (SubLObject)ConsesLow.list((SubLObject)$ic12$, var14)), (SubLObject)ConsesLow.listS((SubLObject)$ic13$, (SubLObject)ConsesLow.list((SubLObject)$ic14$, (SubLObject)ConsesLow.list((SubLObject)EQ, (SubLObject)ConsesLow.list((SubLObject)$ic15$, var13), var19), (SubLObject)ConsesLow.list((SubLObject)$ic16$, var21, (SubLObject)ConsesLow.list((SubLObject)$ic17$, var13))), ConsesLow.append(var22, (SubLObject)NIL)));
        }
        return (SubLObject)ConsesLow.list((SubLObject)$ic11$, (SubLObject)ConsesLow.list(var13, (SubLObject)ConsesLow.list((SubLObject)$ic12$, var14)), (SubLObject)ConsesLow.listS((SubLObject)$ic13$, (SubLObject)ConsesLow.list((SubLObject)$ic16$, var21, (SubLObject)ConsesLow.list((SubLObject)$ic17$, var13)), ConsesLow.append(var22, (SubLObject)NIL)));
    }
    
    public static SubLObject f50391(final SubLObject var5) {
        return f50392(module0784.f50368(var5, (SubLObject)$ic19$));
    }
    
    public static SubLObject f50392(final SubLObject var3) {
        return (SubLObject)makeBoolean(NIL == constant_handles_oc.f8449(var3));
    }
    
    public static SubLObject f50393(final SubLObject var4) {
        PrintLow.format((SubLObject)T, (SubLObject)$ic20$, f50385(var4));
        final SubLObject var5 = module0077.f5333(f50386(var4));
        SubLObject var6;
        SubLObject var7;
        SubLObject var8;
        for (var6 = module0032.f1741(var5), var7 = (SubLObject)NIL, var7 = module0032.f1742(var6, var5); NIL == module0032.f1744(var6, var7); var7 = module0032.f1743(var7)) {
            var8 = module0032.f1745(var6, var7);
            if (NIL != module0032.f1746(var7, var8)) {
                f50394(var8);
            }
        }
        return var4;
    }
    
    public static SubLObject f50394(final SubLObject var5) {
        module0107.f7612(var5.rest().rest(), (SubLObject)TWO_INTEGER, (SubLObject)Characters.CHAR_tab);
        streams_high.terpri((SubLObject)UNPROVIDED);
        return var5;
    }
    
    public static SubLObject f50395(final SubLObject var4, SubLObject var26) {
        if (var26 == UNPROVIDED) {
            var26 = (SubLObject)NIL;
        }
        final SubLThread var27 = SubLProcess.currentSubLThread();
        assert NIL != f50382(var4) : var4;
        SubLObject var28 = (SubLObject)NIL;
        final SubLObject var30;
        final SubLObject var29 = var30 = module0034.f1888();
        final SubLObject var31 = module0034.$g879$.currentBinding(var27);
        try {
            module0034.$g879$.bind(var30, var27);
            SubLObject var32 = (SubLObject)NIL;
            if (NIL != var30 && NIL == module0034.f1842(var30)) {
                var32 = module0034.f1869(var30);
                final SubLObject var33 = Threads.current_process();
                if (NIL == var32) {
                    module0034.f1873(var30, var33);
                }
                else if (!var32.eql(var33)) {
                    Errors.error((SubLObject)$ic21$);
                }
            }
            try {
                SubLObject var34 = module0584.$g4440$.getGlobalValue();
                SubLObject var35 = (SubLObject)NIL;
                var35 = var34.first();
                while (NIL != var34) {
                    if (NIL == var26 || var35 == $ic22$) {
                        f50396(var4, var35);
                        var28 = (SubLObject)ConsesLow.cons(module0784.f50378(f50386(var4)), var28);
                    }
                    var34 = var34.rest();
                    var35 = var34.first();
                }
            }
            finally {
                final SubLObject var31_36 = Threads.$is_thread_performing_cleanupP$.currentBinding(var27);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var27);
                    if (NIL != var30 && NIL == var32) {
                        module0034.f1873(var30, (SubLObject)NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var31_36, var27);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var31, var27);
        }
        f50389(var4, module0784.f50377(var28));
        return var4;
    }
    
    public static SubLObject f50396(final SubLObject var4, final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        f50397(var4, var19);
        f50398(var4, var19);
        f50399(var4, var19);
        if (NIL != module0584.$g4432$.getDynamicValue(var20)) {
            f50400(var4);
        }
        return var4;
    }
    
    public static SubLObject f50401(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)NIL;
        final SubLObject var5 = module0585.$g4449$.currentBinding(var3);
        try {
            module0585.$g4449$.bind((SubLObject)T, var3);
            final SubLObject var6 = module0737.f45432(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (var6.isList()) {
                SubLObject var7 = var6;
                SubLObject var8 = (SubLObject)NIL;
                var8 = var7.first();
                while (NIL != var7) {
                    if (NIL != f50402(var8)) {
                        var4 = (SubLObject)ConsesLow.cons(var8, var4);
                    }
                    var7 = var7.rest();
                    var8 = var7.first();
                }
            }
        }
        finally {
            module0585.$g4449$.rebind(var5, var3);
        }
        return var4;
    }
    
    public static SubLObject f50403(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0034.$g879$.getDynamicValue(var3);
        SubLObject var5 = (SubLObject)NIL;
        if (NIL == var4) {
            return f50401(var2);
        }
        var5 = module0034.f1857(var4, (SubLObject)$ic23$, (SubLObject)UNPROVIDED);
        if (NIL == var5) {
            var5 = module0034.f1807(module0034.f1842(var4), (SubLObject)$ic23$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var4, (SubLObject)$ic23$, var5);
        }
        SubLObject var6 = module0034.f1814(var5, var2, (SubLObject)$ic24$);
        if (var6 == $ic24$) {
            var6 = Values.arg2(var3.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f50401(var2)));
            module0034.f1816(var5, var2, var6, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var6);
    }
    
    public static SubLObject f50402(final SubLObject var39) {
        SubLObject var40 = (SubLObject)NIL;
        if (NIL != module0737.f45321(var39, (SubLObject)UNPROVIDED)) {
            final SubLObject var41 = module0737.f45373(var39, (SubLObject)UNPROVIDED);
            if (NIL == conses_high.member(var41, module0731.f44818((SubLObject)$ic25$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != conses_high.member(var41, module0731.f44818((SubLObject)$ic26$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var40 = (SubLObject)T;
            }
        }
        return var40;
    }
    
    public static SubLObject f50400(final SubLObject var4) {
        return var4;
    }
    
    public static SubLObject f50397(final SubLObject var4, final SubLObject var19) {
        f50404(var4, var19);
        f50405(var4, var19);
        return var4;
    }
    
    public static SubLObject f50404(final SubLObject var4, final SubLObject var19) {
        final SubLObject var20 = f50385(var4);
        final SubLObject var21 = f50386(var4);
        SubLObject var22 = f50406(var19, var20);
        SubLObject var23 = (SubLObject)NIL;
        var23 = var22.first();
        while (NIL != var22) {
            final SubLObject var24 = module0782.f50333(var23);
            final SubLObject var25 = module0782.f50334(var23);
            SubLObject var34_49 = f50407(var20, var24);
            SubLObject var26 = (SubLObject)NIL;
            var26 = var34_49.first();
            while (NIL != var34_49) {
                SubLObject var34_50 = var25;
                SubLObject var27 = (SubLObject)NIL;
                var27 = var34_50.first();
                while (NIL != var34_50) {
                    SubLObject var28 = module0784.f50366();
                    var28 = conses_high.putf(var28, (SubLObject)$ic9$, var19);
                    var28 = conses_high.putf(var28, (SubLObject)$ic27$, var26);
                    var28 = conses_high.putf(var28, (SubLObject)$ic28$, var24);
                    var28 = conses_high.putf(var28, (SubLObject)$ic29$, (SubLObject)$ic30$);
                    if (var19 == $ic22$) {
                        var28 = conses_high.putf(var28, (SubLObject)$ic31$, var27);
                    }
                    var28 = conses_high.putf(var28, (SubLObject)$ic32$, var27);
                    module0784.f50376(var21, var28);
                    var34_50 = var34_50.rest();
                    var27 = var34_50.first();
                }
                var34_49 = var34_49.rest();
                var26 = var34_49.first();
            }
            var22 = var22.rest();
            var23 = var22.first();
        }
        f50389(var4, var21);
        return var4;
    }
    
    public static SubLObject f50407(final SubLObject var45, final SubLObject var54) {
        final SubLObject var55 = module0038.f2623(var45, (SubLObject)ZERO_INTEGER, Numbers.subtract(Sequences.length(var45), Sequences.length(var54)));
        SubLObject var56 = (SubLObject)NIL;
        if (var54.equalp((SubLObject)$ic33$)) {
            var56 = (SubLObject)ConsesLow.list(Sequences.cconcatenate(var55, (SubLObject)$ic34$));
        }
        else if (var54.equalp((SubLObject)$ic35$) && NIL != module0038.f2673(var55, (SubLObject)$ic36$, (SubLObject)UNPROVIDED)) {
            var56 = (SubLObject)ConsesLow.list(module0038.f2621(var55, (SubLObject)$ic36$, (SubLObject)UNPROVIDED));
        }
        else if (NIL != module0038.f2673(var55, (SubLObject)$ic37$, (SubLObject)UNPROVIDED) && var54.equalp((SubLObject)$ic38$)) {
            var56 = (SubLObject)ConsesLow.list(Sequences.cconcatenate(module0038.f2621(var55, (SubLObject)$ic37$, (SubLObject)UNPROVIDED), (SubLObject)$ic39$));
        }
        else if (NIL != module0038.f2715(var55) && NIL != module0728.f44438(var55) && NIL != module0038.f2611(var54)) {
            SubLObject var57 = (SubLObject)ConsesLow.list(module0038.f2677(var55, (SubLObject)UNPROVIDED));
            if (NIL != module0038.f2673(var55, (SubLObject)$ic40$, (SubLObject)UNPROVIDED)) {
                var57 = (SubLObject)ConsesLow.cons(var55, var57);
            }
            var56 = var57;
        }
        else if (NIL != module0038.f2673(var55, (SubLObject)$ic41$, (SubLObject)UNPROVIDED) && NIL != module0038.f2684(var54, (SubLObject)$ic42$)) {
            SubLObject var57 = (SubLObject)ConsesLow.list(var55);
            final SubLObject var58 = module0038.f2677(var55, (SubLObject)UNPROVIDED);
            if (NIL != module0728.f44463(var58)) {
                var57 = (SubLObject)ConsesLow.cons(var58, var57);
            }
            var56 = var57;
        }
        else if (NIL != module0038.f2673(var55, (SubLObject)$ic43$, Symbols.symbol_function((SubLObject)EQUALP)) && var54.equalp((SubLObject)$ic44$)) {
            var56 = (SubLObject)ConsesLow.list(Sequences.cconcatenate(module0038.f2677(var55, (SubLObject)TWO_INTEGER), (SubLObject)$ic45$));
        }
        else if (NIL != module0038.f2673(var55, (SubLObject)$ic43$, Symbols.symbol_function((SubLObject)EQUALP))) {
            var56 = (SubLObject)ConsesLow.list(Sequences.cconcatenate(var55, (SubLObject)$ic41$));
        }
        else if (NIL != module0728.f44434(var54) && (NIL != module0728.f44437(var55) || NIL != module0038.f2673(var55, (SubLObject)$ic46$, (SubLObject)UNPROVIDED))) {
            var56 = (SubLObject)ConsesLow.list(Sequences.cconcatenate(var55, (SubLObject)$ic41$), var55);
        }
        else if (NIL != module0038.f2673(var55, (SubLObject)$ic47$, Symbols.symbol_function((SubLObject)EQUALP))) {
            if (!var54.equalp((SubLObject)$ic33$)) {
                var56 = (SubLObject)ConsesLow.list(Sequences.cconcatenate(module0038.f2677(var55, (SubLObject)UNPROVIDED), (SubLObject)$ic39$));
            }
        }
        else if (var54.equalp((SubLObject)$ic44$) && NIL != module0038.f2673(var55, (SubLObject)$ic48$, Symbols.symbol_function((SubLObject)EQUALP))) {
            var56 = (SubLObject)ConsesLow.list(Sequences.cconcatenate(module0038.f2677(var55, (SubLObject)TWO_INTEGER), (SubLObject)$ic49$));
        }
        else {
            var56 = (SubLObject)ConsesLow.list(var55);
        }
        return f50408(var56, var54, var45);
    }
    
    public static SubLObject f50408(final SubLObject var55, final SubLObject var54, final SubLObject var45) {
        SubLObject var56 = (SubLObject)NIL;
        SubLObject var57 = var55;
        SubLObject var58 = (SubLObject)NIL;
        var58 = var57.first();
        while (NIL != var57) {
            if (module0728.f44459(var58, var54).equalp(var45)) {
                var56 = (SubLObject)ConsesLow.cons(var58, var56);
            }
            var57 = var57.rest();
            var58 = var57.first();
        }
        return var56;
    }
    
    public static SubLObject f50406(final SubLObject var19, final SubLObject var45) {
        final SubLObject var46 = module0787.f50470(var19);
        return module0787.f50472(var46, var45);
    }
    
    public static SubLObject f50405(final SubLObject var4, final SubLObject var19) {
        final SubLObject var20 = f50385(var4);
        final SubLObject var21 = f50386(var4);
        SubLObject var22 = f50409(var19, var20);
        SubLObject var23 = (SubLObject)NIL;
        var23 = var22.first();
        while (NIL != var22) {
            final SubLObject var24 = module0782.f50333(var23);
            final SubLObject var25 = module0782.f50334(var23);
            SubLObject var34_62 = f50410(var20, var24);
            SubLObject var26 = (SubLObject)NIL;
            var26 = var34_62.first();
            while (NIL != var34_62) {
                SubLObject var34_63 = var25;
                SubLObject var27 = (SubLObject)NIL;
                var27 = var34_63.first();
                while (NIL != var34_63) {
                    SubLObject var28 = module0784.f50366();
                    var28 = conses_high.putf(var28, (SubLObject)$ic9$, var19);
                    var28 = conses_high.putf(var28, (SubLObject)$ic27$, var26);
                    var28 = conses_high.putf(var28, (SubLObject)$ic28$, var24);
                    var28 = conses_high.putf(var28, (SubLObject)$ic29$, (SubLObject)$ic50$);
                    if (var19 == $ic22$) {
                        var28 = conses_high.putf(var28, (SubLObject)$ic31$, var27);
                    }
                    var28 = conses_high.putf(var28, (SubLObject)$ic32$, var27);
                    module0784.f50376(var21, var28);
                    var34_63 = var34_63.rest();
                    var27 = var34_63.first();
                }
                var34_62 = var34_62.rest();
                var26 = var34_62.first();
            }
            var22 = var22.rest();
            var23 = var22.first();
        }
        f50389(var4, var21);
        return var4;
    }
    
    public static SubLObject f50410(final SubLObject var45, final SubLObject var64) {
        final SubLObject var65 = module0038.f2623(var45, Sequences.length(var64), (SubLObject)UNPROVIDED);
        return (SubLObject)ConsesLow.list(var65);
    }
    
    public static SubLObject f50411(final SubLObject var19, final SubLObject var45) {
        final SubLObject var46 = module0787.f50471(var19);
        return module0787.f50473(var46, var45);
    }
    
    public static SubLObject f50409(final SubLObject var19, final SubLObject var45) {
        final SubLThread var46 = SubLProcess.currentSubLThread();
        final SubLObject var47 = module0034.$g879$.getDynamicValue(var46);
        SubLObject var48 = (SubLObject)NIL;
        if (NIL == var47) {
            return f50411(var19, var45);
        }
        var48 = module0034.f1857(var47, (SubLObject)$ic51$, (SubLObject)UNPROVIDED);
        if (NIL == var48) {
            var48 = module0034.f1807(module0034.f1842(var47), (SubLObject)$ic51$, (SubLObject)TWO_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var47, (SubLObject)$ic51$, var48);
        }
        final SubLObject var49 = module0034.f1782(var19, var45);
        final SubLObject var50 = module0034.f1814(var48, var49, (SubLObject)UNPROVIDED);
        if (var50 != $ic24$) {
            SubLObject var51 = var50;
            SubLObject var52 = (SubLObject)NIL;
            var52 = var51.first();
            while (NIL != var51) {
                SubLObject var53 = var52.first();
                final SubLObject var54 = conses_high.second(var52);
                if (var19.equal(var53.first())) {
                    var53 = var53.rest();
                    if (NIL != var53 && NIL == var53.rest() && var45.equal(var53.first())) {
                        return module0034.f1959(var54);
                    }
                }
                var51 = var51.rest();
                var52 = var51.first();
            }
        }
        final SubLObject var55 = Values.arg2(var46.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f50411(var19, var45)));
        module0034.f1836(var48, var49, var50, var55, (SubLObject)ConsesLow.list(var19, var45));
        return module0034.f1959(var55);
    }
    
    public static SubLObject f50398(final SubLObject var4, final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        final SubLObject var21 = f50385(var4);
        final SubLObject var22 = module0784.f50375();
        SubLObject var23 = (SubLObject)NIL;
        final SubLObject var24 = module0077.f5333(f50386(var4));
        SubLObject var25;
        SubLObject var26;
        SubLObject var27;
        SubLObject var29;
        SubLObject var28;
        SubLObject var30;
        SubLObject var31;
        SubLObject var32;
        SubLObject var81_82;
        SubLObject var33;
        SubLObject var34;
        SubLObject var35;
        SubLObject var36;
        SubLObject var37;
        SubLObject var38;
        SubLObject var39;
        SubLObject var40;
        SubLObject var34_88;
        SubLObject var41;
        SubLObject var34_89;
        SubLObject var42;
        SubLObject var43;
        for (var25 = module0032.f1741(var24), var26 = (SubLObject)NIL, var26 = module0032.f1742(var25, var24); NIL == module0032.f1744(var25, var26); var26 = module0032.f1743(var26)) {
            var27 = module0032.f1745(var25, var26);
            if (NIL != module0032.f1746(var26, var27) && module0784.f50370(var27).eql(var19)) {
                var28 = (var29 = var27);
                var30 = (SubLObject)NIL;
                var31 = var29;
                var32 = (SubLObject)NIL;
                var81_82 = (SubLObject)NIL;
                while (NIL != var31) {
                    cdestructuring_bind.destructuring_bind_must_consp(var31, var28, (SubLObject)$ic52$);
                    var81_82 = var31.first();
                    var31 = var31.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var31, var28, (SubLObject)$ic52$);
                    if (NIL == conses_high.member(var81_82, (SubLObject)$ic53$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var32 = (SubLObject)T;
                    }
                    if (var81_82 == $ic8$) {
                        var30 = var31.first();
                    }
                    var31 = var31.rest();
                }
                if (NIL != var32 && NIL == var30) {
                    cdestructuring_bind.cdestructuring_bind_error(var28, (SubLObject)$ic52$);
                }
                var33 = cdestructuring_bind.property_list_member((SubLObject)$ic32$, var29);
                var34 = (SubLObject)((NIL != var33) ? conses_high.cadr(var33) : NIL);
                var35 = cdestructuring_bind.property_list_member((SubLObject)$ic27$, var29);
                var36 = (SubLObject)((NIL != var35) ? conses_high.cadr(var35) : NIL);
                if (NIL != var34 && NIL != var36) {
                    var37 = Strings.stringE(var36, var21, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    var38 = module0035.f2294(var23, var36, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)$ic54$);
                    if (var38 == $ic54$) {
                        var38 = f50403(var36);
                        if ((NIL == var37 || var19 != $ic22$) && NIL == module0584.$g4439$.getDynamicValue(var20)) {
                            var38 = ConsesLow.append(var38, f50412(var36, (SubLObject)T));
                        }
                        var23 = module0035.f2063(var23, var36, var38, Symbols.symbol_function((SubLObject)EQUAL));
                    }
                    var39 = f50413(var34, var36, var19, var38);
                    var40 = (SubLObject)NIL;
                    var40 = var39.first();
                    while (NIL != var39) {
                        var34_88 = f50414(var40);
                        var41 = (SubLObject)NIL;
                        var41 = var34_88.first();
                        while (NIL != var34_88) {
                            var34_89 = module0737.f45360(var40);
                            var42 = (SubLObject)NIL;
                            var42 = var34_89.first();
                            while (NIL != var34_89) {
                                var43 = module0784.f50367(var27);
                                var43 = conses_high.putf(var43, (SubLObject)$ic55$, var41);
                                var43 = conses_high.putf(var43, (SubLObject)$ic19$, module0737.f45495(var40, (SubLObject)UNPROVIDED));
                                var43 = conses_high.putf(var43, (SubLObject)$ic56$, module0737.f45390(var40));
                                var43 = conses_high.putf(var43, (SubLObject)$ic57$, module0737.f45341(var40));
                                var43 = conses_high.putf(var43, (SubLObject)$ic58$, module0737.f45373(var40, (SubLObject)UNPROVIDED));
                                var43 = conses_high.putf(var43, (SubLObject)$ic59$, var42);
                                module0784.f50376(var22, var43);
                                var34_89 = var34_89.rest();
                                var42 = var34_89.first();
                            }
                            var34_88 = var34_88.rest();
                            var41 = var34_88.first();
                        }
                        var39 = var39.rest();
                        var40 = var39.first();
                    }
                }
            }
        }
        f50389(var4, var22);
        return var4;
    }
    
    public static SubLObject f50414(final SubLObject var87) {
        final SubLObject var88 = module0737.f45361(var87);
        final SubLObject var89 = module0737.f45495(var87, (SubLObject)UNPROVIDED);
        return (SubLObject)((NIL != var89) ? ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic60$, var89), var88) : var88);
    }
    
    public static SubLObject f50413(final SubLObject var52, final SubLObject var50, final SubLObject var19, final SubLObject var94) {
        final SubLThread var95 = SubLProcess.currentSubLThread();
        final SubLObject var96 = module0786.f50435(var52, var19);
        SubLObject var97 = (SubLObject)NIL;
        SubLObject var98 = var94;
        SubLObject var99 = (SubLObject)NIL;
        var99 = var98.first();
        while (NIL != var98) {
            final SubLObject var100 = f50415(var99, var96);
            if (NIL != module0737.f45360(var100)) {
                var97 = (SubLObject)ConsesLow.cons(var100, var97);
            }
            var98 = var98.rest();
            var99 = var98.first();
        }
        if (NIL == var97 && NIL != module0584.$g4434$.getDynamicValue(var95)) {
            var97 = f50416(var52, var50, var19);
        }
        return var97;
    }
    
    public static SubLObject f50417(final SubLObject var45, final SubLObject var26) {
        assert NIL != Types.stringp(var45) : var45;
        module0788.f50491();
        final SubLObject var46 = f50383(var45);
        SubLObject var47 = (SubLObject)NIL;
        f50395(var46, var26);
        final SubLObject var48 = module0077.f5333(f50386(var46));
        SubLObject var49;
        SubLObject var50;
        SubLObject var51;
        SubLObject var53;
        SubLObject var52;
        SubLObject var54;
        SubLObject var55;
        SubLObject var56;
        SubLObject var102_103;
        SubLObject var57;
        SubLObject var58;
        SubLObject var59;
        SubLObject var60;
        SubLObject var61;
        SubLObject var62;
        SubLObject var63;
        SubLObject var64;
        SubLObject var65;
        SubLObject var66;
        SubLObject var67;
        SubLObject var68;
        SubLObject var69;
        SubLObject var70;
        SubLObject var71;
        SubLObject var72;
        for (var49 = module0032.f1741(var48), var50 = (SubLObject)NIL, var50 = module0032.f1742(var49, var48); NIL == module0032.f1744(var49, var50); var50 = module0032.f1743(var50)) {
            var51 = module0032.f1745(var49, var50);
            if (NIL != module0032.f1746(var50, var51)) {
                var52 = (var53 = var51);
                var54 = (SubLObject)NIL;
                var55 = var53;
                var56 = (SubLObject)NIL;
                var102_103 = (SubLObject)NIL;
                while (NIL != var55) {
                    cdestructuring_bind.destructuring_bind_must_consp(var55, var52, (SubLObject)$ic62$);
                    var102_103 = var55.first();
                    var55 = var55.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var55, var52, (SubLObject)$ic62$);
                    if (NIL == conses_high.member(var102_103, (SubLObject)$ic63$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var56 = (SubLObject)T;
                    }
                    if (var102_103 == $ic8$) {
                        var54 = var55.first();
                    }
                    var55 = var55.rest();
                }
                if (NIL != var56 && NIL == var54) {
                    cdestructuring_bind.cdestructuring_bind_error(var52, (SubLObject)$ic62$);
                }
                var57 = cdestructuring_bind.property_list_member((SubLObject)$ic64$, var53);
                var58 = (SubLObject)((NIL != var57) ? conses_high.cadr(var57) : NIL);
                var59 = cdestructuring_bind.property_list_member((SubLObject)$ic65$, var53);
                var60 = (SubLObject)((NIL != var59) ? conses_high.cadr(var59) : NIL);
                var61 = cdestructuring_bind.property_list_member((SubLObject)$ic19$, var53);
                var62 = (SubLObject)((NIL != var61) ? conses_high.cadr(var61) : NIL);
                var63 = cdestructuring_bind.property_list_member((SubLObject)$ic57$, var53);
                var64 = (SubLObject)((NIL != var63) ? conses_high.cadr(var63) : NIL);
                if (NIL != var58 || NIL != var60 || NIL != var62) {
                    var65 = module0202.f12768(var60, var62, var45);
                    var66 = module0737.f45434(var65, var64);
                    var67 = module0737.f45435(module0078.f5369(var58, Symbols.symbol_function((SubLObject)EQUALP)), var64);
                    var68 = module0737.f45403(module0078.f5369(var66, Symbols.symbol_function((SubLObject)EQUALP)), module0078.f5369(var67, Symbols.symbol_function((SubLObject)EQUALP)));
                    var69 = (SubLObject)T;
                    var70 = (SubLObject)NIL;
                    if (NIL == var70) {
                        var71 = var47;
                        var72 = (SubLObject)NIL;
                        var72 = var71.first();
                        while (NIL == var70 && NIL != var71) {
                            if (NIL != module0737.f45682(var72, var68, var69)) {
                                module0737.f45683(var72, var68, (SubLObject)T);
                                var70 = (SubLObject)T;
                            }
                            var71 = var71.rest();
                            var72 = var71.first();
                        }
                    }
                    if (NIL == var70) {
                        var47 = (SubLObject)ConsesLow.cons(var68, var47);
                    }
                }
            }
        }
        return var47;
    }
    
    public static SubLObject f50412(final SubLObject var45, final SubLObject var26) {
        final SubLThread var46 = SubLProcess.currentSubLThread();
        final SubLObject var47 = module0034.$g879$.getDynamicValue(var46);
        SubLObject var48 = (SubLObject)NIL;
        if (NIL == var47) {
            return f50417(var45, var26);
        }
        var48 = module0034.f1857(var47, (SubLObject)$ic61$, (SubLObject)UNPROVIDED);
        if (NIL == var48) {
            var48 = module0034.f1807(module0034.f1842(var47), (SubLObject)$ic61$, (SubLObject)TWO_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var47, (SubLObject)$ic61$, var48);
        }
        final SubLObject var49 = module0034.f1782(var45, var26);
        final SubLObject var50 = module0034.f1814(var48, var49, (SubLObject)UNPROVIDED);
        if (var50 != $ic24$) {
            SubLObject var51 = var50;
            SubLObject var52 = (SubLObject)NIL;
            var52 = var51.first();
            while (NIL != var51) {
                SubLObject var53 = var52.first();
                final SubLObject var54 = conses_high.second(var52);
                if (var45.equal(var53.first())) {
                    var53 = var53.rest();
                    if (NIL != var53 && NIL == var53.rest() && var26.equal(var53.first())) {
                        return module0034.f1959(var54);
                    }
                }
                var51 = var51.rest();
                var52 = var51.first();
            }
        }
        final SubLObject var55 = Values.arg2(var46.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f50417(var45, var26)));
        module0034.f1836(var48, var49, var50, var55, (SubLObject)ConsesLow.list(var45, var26));
        return module0034.f1959(var55);
    }
    
    public static SubLObject f50416(final SubLObject var52, final SubLObject var50, final SubLObject var19) {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50415(SubLObject var87, final SubLObject var95) {
        final SubLThread var96 = SubLProcess.currentSubLThread();
        final SubLObject var97 = module0737.f45379(var87);
        final SubLObject var98 = module0737.f45400(var87);
        final SubLObject var99 = module0737.f45374(var87, (SubLObject)UNPROVIDED);
        final SubLObject var100 = (SubLObject)((NIL != module0212.f13762(var99)) ? module0732.f44992(var99) : NIL);
        var96.resetMultipleValues();
        final SubLObject var101 = module0035.f2092(var95, Symbols.symbol_function((SubLObject)$ic66$));
        final SubLObject var102 = var96.secondMultipleValue();
        var96.resetMultipleValues();
        final SubLObject var103 = (NIL != var101 && var100.isInteger()) ? f50418(var97, var101, var100) : var97;
        final SubLObject var104 = (NIL != var102) ? f50419(var98, var102) : var98;
        if (NIL == module0078.f5359(var103, var97) || NIL == module0078.f5359(var104, var98)) {
            var87 = module0737.f45403(var104, var103);
        }
        return var87;
    }
    
    public static SubLObject f50420(final SubLObject var113, final SubLObject var127, final SubLObject var122) {
        final SubLObject var128 = module0205.f13384(module0737.f45433(var113), var122, (SubLObject)UNPROVIDED);
        return f50421(var128, var127);
    }
    
    public static SubLObject f50422(final SubLObject var112, final SubLObject var127) {
        SubLObject var128 = module0737.f45483(var112);
        if (NIL == var128) {
            SubLObject var129 = module0737.f45471(var112);
            SubLObject var130 = (SubLObject)NIL;
            var130 = var129.first();
            while (NIL == var128 && NIL != var129) {
                if (NIL == f50423(var130, var127)) {
                    var128 = (SubLObject)T;
                }
                var129 = var129.rest();
                var130 = var129.first();
            }
        }
        return (SubLObject)makeBoolean(NIL == var128);
    }
    
    public static SubLObject f50424(final SubLObject var127) {
        return module0004.f104(var127.first(), (SubLObject)$ic67$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f50418(final SubLObject var119, final SubLObject var123, final SubLObject var122) {
        assert NIL != module0077.f5302(var119) : var119;
        assert NIL != module0035.f2014(var123) : var123;
        assert NIL != Types.integerp(var122) : var122;
        final SubLObject var124 = module0077.f5313(Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)UNPROVIDED);
        final SubLObject var125 = module0077.f5333(var119);
        SubLObject var126;
        SubLObject var127;
        SubLObject var128;
        SubLObject var129;
        SubLObject var130;
        SubLObject var131;
        for (var126 = module0032.f1741(var125), var127 = (SubLObject)NIL, var127 = module0032.f1742(var126, var125); NIL == module0032.f1744(var126, var127); var127 = module0032.f1743(var127)) {
            var128 = module0032.f1745(var126, var127);
            if (NIL != module0032.f1746(var127, var128)) {
                var129 = (SubLObject)NIL;
                if (NIL == var129) {
                    var130 = var123;
                    var131 = (SubLObject)NIL;
                    var131 = var130.first();
                    while (NIL == var129 && NIL != var130) {
                        if (NIL == f50420(var128, var131, var122)) {
                            var129 = (SubLObject)T;
                        }
                        var130 = var130.rest();
                        var131 = var130.first();
                    }
                }
                if (NIL == var129) {
                    module0077.f5326(var128, var124);
                }
            }
        }
        return var124;
    }
    
    public static SubLObject f50419(final SubLObject var120, final SubLObject var124) {
        assert NIL != module0077.f5302(var120) : var120;
        assert NIL != module0035.f2014(var124) : var124;
        final SubLObject var125 = module0077.f5313(Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)UNPROVIDED);
        final SubLObject var126 = module0077.f5333(var120);
        SubLObject var127;
        SubLObject var128;
        SubLObject var129;
        SubLObject var130;
        SubLObject var131;
        SubLObject var132;
        for (var127 = module0032.f1741(var126), var128 = (SubLObject)NIL, var128 = module0032.f1742(var127, var126); NIL == module0032.f1744(var127, var128); var128 = module0032.f1743(var128)) {
            var129 = module0032.f1745(var127, var128);
            if (NIL != module0032.f1746(var128, var129)) {
                var130 = (SubLObject)NIL;
                if (NIL == var130) {
                    var131 = var124;
                    var132 = (SubLObject)NIL;
                    var132 = var131.first();
                    while (NIL == var130 && NIL != var131) {
                        if (NIL != f50422(var129, var132)) {
                            module0077.f5326(var129, var125);
                            var130 = (SubLObject)T;
                        }
                        var131 = var131.rest();
                        var132 = var131.first();
                    }
                }
            }
        }
        return var125;
    }
    
    public static SubLObject f50421(final SubLObject var128, final SubLObject var127) {
        final SubLThread var129 = SubLProcess.currentSubLThread();
        SubLObject var130 = (SubLObject)NIL;
        SubLObject var131 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var127, var127, (SubLObject)$ic71$);
        var130 = var127.first();
        SubLObject var132 = var127.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var132, var127, (SubLObject)$ic71$);
        var131 = var132.first();
        var132 = var132.rest();
        if (NIL != var132) {
            cdestructuring_bind.cdestructuring_bind_error(var127, (SubLObject)$ic71$);
            return (SubLObject)NIL;
        }
        final SubLObject var133 = var130;
        if (var133.eql((SubLObject)$ic72$)) {
            return (SubLObject)makeBoolean(NIL != module0210.f13565(var128) && NIL != module0256.f16576(var128, var131, module0584.$g4435$.getDynamicValue(var129), (SubLObject)UNPROVIDED));
        }
        if (var133.eql((SubLObject)$ic73$)) {
            return (SubLObject)makeBoolean(NIL != module0210.f13565(var128) && NIL != module0259.f16854(var128, var131, module0584.$g4435$.getDynamicValue(var129), (SubLObject)UNPROVIDED));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50423(final SubLObject var130, final SubLObject var127) {
        final SubLThread var131 = SubLProcess.currentSubLThread();
        SubLObject var132 = (SubLObject)NIL;
        SubLObject var133 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var127, var127, (SubLObject)$ic71$);
        var132 = var127.first();
        SubLObject var134 = var127.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var134, var127, (SubLObject)$ic71$);
        var133 = var134.first();
        var134 = var134.rest();
        if (NIL != var134) {
            cdestructuring_bind.cdestructuring_bind_error(var127, (SubLObject)$ic71$);
            return (SubLObject)NIL;
        }
        final SubLObject var135 = var132;
        if (var135.eql((SubLObject)$ic74$)) {
            return module0731.f44702(var130, var133, module0584.$g4436$.getDynamicValue(var131));
        }
        if (var135.eql((SubLObject)$ic75$)) {
            return f50425(var130, var133);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50425(final SubLObject var141, final SubLObject var137) {
        return module0731.f44713(module0731.f44691(var141), var137, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f50426() {
        final SubLObject var142 = $g6294$.getGlobalValue();
        if (NIL != var142) {
            module0034.f1818(var142);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50427(final SubLObject var143, SubLObject var110) {
        if (var110 == UNPROVIDED) {
            var110 = module0584.$g4436$.getDynamicValue();
        }
        return module0034.f1829($g6294$.getGlobalValue(), (SubLObject)ConsesLow.list(var143, var110), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f50428(final SubLObject var143, final SubLObject var110) {
        return module0434.f30579((SubLObject)$ic77$, (SubLObject)ConsesLow.listS($ic78$, var143, (SubLObject)$ic79$), var110, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).first();
    }
    
    public static SubLObject f50429(final SubLObject var143, SubLObject var110) {
        if (var110 == UNPROVIDED) {
            var110 = module0584.$g4436$.getDynamicValue();
        }
        SubLObject var144 = $g6294$.getGlobalValue();
        if (NIL == var144) {
            var144 = module0034.f1934((SubLObject)$ic76$, (SubLObject)$ic80$, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)TWO_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        final SubLObject var145 = module0034.f1782(var143, var110);
        final SubLObject var146 = module0034.f1814(var144, var145, (SubLObject)UNPROVIDED);
        if (var146 != $ic24$) {
            SubLObject var147 = var146;
            SubLObject var148 = (SubLObject)NIL;
            var148 = var147.first();
            while (NIL != var147) {
                SubLObject var149 = var148.first();
                final SubLObject var150 = conses_high.second(var148);
                if (var143.eql(var149.first())) {
                    var149 = var149.rest();
                    if (NIL != var149 && NIL == var149.rest() && var110.eql(var149.first())) {
                        return module0034.f1959(var150);
                    }
                }
                var147 = var147.rest();
                var148 = var147.first();
            }
        }
        final SubLObject var151 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f50428(var143, var110)));
        module0034.f1836(var144, var145, var146, var151, (SubLObject)ConsesLow.list(var143, var110));
        return module0034.f1959(var151);
    }
    
    public static SubLObject f50399(final SubLObject var4, final SubLObject var19) {
        final SubLObject var20 = module0784.f50375();
        final SubLObject var21 = module0077.f5333(f50386(var4));
        SubLObject var22;
        SubLObject var23;
        SubLObject var24;
        SubLObject var26;
        SubLObject var25;
        SubLObject var27;
        SubLObject var28;
        SubLObject var29;
        SubLObject var153_154;
        SubLObject var30;
        SubLObject var31;
        SubLObject var32;
        SubLObject var33;
        SubLObject var34;
        SubLObject var35;
        SubLObject var36;
        SubLObject var37;
        SubLObject var38;
        SubLObject var39;
        SubLObject var40;
        SubLObject var41;
        SubLObject var164_165;
        SubLObject var162_163;
        SubLObject var42;
        SubLObject var43;
        SubLObject var44;
        SubLObject var45;
        for (var22 = module0032.f1741(var21), var23 = (SubLObject)NIL, var23 = module0032.f1742(var22, var21); NIL == module0032.f1744(var22, var23); var23 = module0032.f1743(var23)) {
            var24 = module0032.f1745(var22, var23);
            if (NIL != module0032.f1746(var23, var24) && module0784.f50370(var24).eql(var19)) {
                var25 = (var26 = var24);
                var27 = (SubLObject)NIL;
                var28 = var26;
                var29 = (SubLObject)NIL;
                var153_154 = (SubLObject)NIL;
                while (NIL != var28) {
                    cdestructuring_bind.destructuring_bind_must_consp(var28, var25, (SubLObject)$ic81$);
                    var153_154 = var28.first();
                    var28 = var28.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var28, var25, (SubLObject)$ic81$);
                    if (NIL == conses_high.member(var153_154, (SubLObject)$ic82$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var29 = (SubLObject)T;
                    }
                    if (var153_154 == $ic8$) {
                        var27 = var28.first();
                    }
                    var28 = var28.rest();
                }
                if (NIL != var29 && NIL == var27) {
                    cdestructuring_bind.cdestructuring_bind_error(var25, (SubLObject)$ic81$);
                }
                var30 = cdestructuring_bind.property_list_member((SubLObject)$ic32$, var26);
                var31 = (SubLObject)((NIL != var30) ? conses_high.cadr(var30) : NIL);
                var32 = cdestructuring_bind.property_list_member((SubLObject)$ic55$, var26);
                var33 = (SubLObject)((NIL != var32) ? conses_high.cadr(var32) : NIL);
                var34 = cdestructuring_bind.property_list_member((SubLObject)$ic19$, var26);
                var35 = (SubLObject)((NIL != var34) ? conses_high.cadr(var34) : NIL);
                var36 = cdestructuring_bind.property_list_member((SubLObject)$ic59$, var26);
                var37 = (SubLObject)((NIL != var36) ? conses_high.cadr(var36) : NIL);
                var38 = cdestructuring_bind.property_list_member((SubLObject)$ic29$, var26);
                var39 = (SubLObject)((NIL != var38) ? conses_high.cadr(var38) : NIL);
                if (NIL != var33 && NIL != var37 && NIL != var35 && NIL != var31) {
                    var40 = (SubLObject)ConsesLow.list(var33, var37, var35);
                    var41 = module0786.f50443(var40, var31, var19, var39);
                    if (var41.isList()) {
                        var162_163 = (var164_165 = var41);
                        var42 = (SubLObject)NIL;
                        var43 = (SubLObject)NIL;
                        var44 = (SubLObject)NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var164_165, var162_163, (SubLObject)$ic83$);
                        var42 = var164_165.first();
                        var164_165 = var164_165.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var164_165, var162_163, (SubLObject)$ic83$);
                        var43 = var164_165.first();
                        var164_165 = var164_165.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var164_165, var162_163, (SubLObject)$ic83$);
                        var44 = var164_165.first();
                        var164_165 = var164_165.rest();
                        if (NIL == var164_165) {
                            var45 = module0784.f50367(var24);
                            var45 = conses_high.putf(var45, (SubLObject)$ic64$, var42);
                            var45 = conses_high.putf(var45, (SubLObject)$ic65$, var43);
                            var45 = conses_high.putf(var45, (SubLObject)$ic19$, var44);
                            module0784.f50376(var20, var45);
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var162_163, (SubLObject)$ic83$);
                        }
                    }
                }
            }
        }
        f50389(var4, var20);
        return var4;
    }
    
    public static SubLObject f50387(final SubLObject var4, final SubLObject var167) {
        final SubLObject var168 = module0743.f46029(var4);
        return module0035.f2293(var168, var167, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f50384(final SubLObject var4, final SubLObject var167, final SubLObject var169) {
        final SubLObject var170 = module0743.f46029(var4);
        final SubLObject var171 = module0035.f2063(var170, var167, var169, (SubLObject)UNPROVIDED);
        module0743.f46027(var4, (SubLObject)ConsesLow.list((SubLObject)$ic84$, var171));
        return var171;
    }
    
    public static SubLObject f50430() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0785", "f50382", "S#54934", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0785", "f50383", "S#54935", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0785", "f50385", "S#54936", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0785", "f50386", "S#54937", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0785", "f50388", "S#54938", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0785", "f50389", "S#54939", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0785", "f50390", "S#54940");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0785", "f50391", "S#54941", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0785", "f50392", "S#54942", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0785", "f50393", "S#54943", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0785", "f50394", "S#54944", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0785", "f50395", "S#54945", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0785", "f50396", "S#54946", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0785", "f50401", "S#54947", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0785", "f50403", "S#54948", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0785", "f50402", "S#54949", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0785", "f50400", "S#54950", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0785", "f50397", "S#54951", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0785", "f50404", "S#54952", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0785", "f50407", "S#54953", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0785", "f50408", "S#54954", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0785", "f50406", "S#54955", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0785", "f50405", "S#54956", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0785", "f50410", "S#54957", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0785", "f50411", "S#54958", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0785", "f50409", "S#54959", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0785", "f50398", "S#54960", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0785", "f50414", "S#54961", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0785", "f50413", "S#54962", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0785", "f50417", "S#54963", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0785", "f50412", "S#54964", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0785", "f50416", "S#54965", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0785", "f50415", "S#54966", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0785", "f50420", "S#54967", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0785", "f50422", "S#54968", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0785", "f50424", "S#54969", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0785", "f50418", "S#54970", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0785", "f50419", "S#54971", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0785", "f50421", "S#54972", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0785", "f50423", "S#54973", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0785", "f50425", "S#54974", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0785", "f50426", "S#49409", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0785", "f50427", "S#54975", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0785", "f50428", "S#54976", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0785", "f50429", "S#54977", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0785", "f50399", "S#54978", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0785", "f50387", "S#54979", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0785", "f50384", "S#54980", 3, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50431() {
        $g6294$ = SubLFiles.deflexical("S#54981", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50432() {
        module0002.f50((SubLObject)$ic17$, (SubLObject)$ic18$);
        module0034.f1895((SubLObject)$ic23$);
        module0034.f1895((SubLObject)$ic51$);
        module0034.f1895((SubLObject)$ic61$);
        module0034.f1909((SubLObject)$ic76$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f50430();
    }
    
    public void initializeVariables() {
        f50431();
    }
    
    public void runTopLevelForms() {
        f50432();
    }
    
    static {
        me = (SubLFile)new module0785();
        $g6294$ = null;
        $ic0$ = makeSymbol("STRINGP");
        $ic1$ = makeKeyword("STRING");
        $ic2$ = makeKeyword("PARSES");
        $ic3$ = makeSymbol("S#54934", "CYC");
        $ic4$ = makeKeyword("ADDED");
        $ic5$ = makeKeyword("ALREADY-THERE");
        $ic6$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#54926", "CYC"), (SubLObject)makeSymbol("S#54982", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("TYPE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#54983", "CYC"), (SubLObject)NIL)), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic7$ = ConsesLow.list((SubLObject)makeKeyword("TYPE"), (SubLObject)makeKeyword("COMPLEX-ONLY?"));
        $ic8$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic9$ = makeKeyword("TYPE");
        $ic10$ = makeKeyword("COMPLEX-ONLY?");
        $ic11$ = makeSymbol("S#708", "CYC");
        $ic12$ = makeSymbol("S#54937", "CYC");
        $ic13$ = makeSymbol("PWHEN");
        $ic14$ = makeSymbol("CAND");
        $ic15$ = makeSymbol("S#54916", "CYC");
        $ic16$ = makeSymbol("FIMPLIES");
        $ic17$ = makeSymbol("S#54941", "CYC");
        $ic18$ = makeSymbol("S#54940", "CYC");
        $ic19$ = makeKeyword("WORD-UNIT");
        $ic20$ = makeString("~&Parses for ~S:~%");
        $ic21$ = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic22$ = makeKeyword("DERIV");
        $ic23$ = makeSymbol("S#54948", "CYC");
        $ic24$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic25$ = makeKeyword("ANY");
        $ic26$ = makeKeyword("DENOT");
        $ic27$ = makeKeyword("BASE");
        $ic28$ = makeKeyword("AFFIX");
        $ic29$ = makeKeyword("AFFIX-TYPE");
        $ic30$ = makeKeyword("SUFFIX");
        $ic31$ = makeKeyword("AFFIX-UNIT");
        $ic32$ = makeKeyword("RULE");
        $ic33$ = makeString("ence");
        $ic34$ = makeString("ent");
        $ic35$ = makeString("ily");
        $ic36$ = makeString("ey");
        $ic37$ = makeString("ic");
        $ic38$ = makeString("al");
        $ic39$ = makeString("y");
        $ic40$ = makeString("l");
        $ic41$ = makeString("e");
        $ic42$ = makeString("s");
        $ic43$ = makeString("is");
        $ic44$ = makeString("ion");
        $ic45$ = makeString("ide");
        $ic46$ = makeString("u");
        $ic47$ = makeString("i");
        $ic48$ = makeString("cept");
        $ic49$ = makeString("ive");
        $ic50$ = makeKeyword("PREFIX");
        $ic51$ = makeSymbol("S#54959", "CYC");
        $ic52$ = ConsesLow.list((SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#13097", "CYC"), (SubLObject)makeSymbol("S#53521", "CYC"));
        $ic53$ = ConsesLow.list((SubLObject)makeKeyword("RULE"), (SubLObject)makeKeyword("BASE"));
        $ic54$ = makeKeyword("NEW");
        $ic55$ = makeKeyword("BASE-DENOT");
        $ic56$ = makeKeyword("PRAGMATICS");
        $ic57$ = makeKeyword("MT");
        $ic58$ = makeKeyword("SEM-PRED");
        $ic59$ = makeKeyword("BASE-POS-PRED");
        $ic60$ = makeKeyword("DENOT-OF");
        $ic61$ = makeSymbol("S#54964", "CYC");
        $ic62$ = ConsesLow.list((SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#54984", "CYC"), (SubLObject)makeSymbol("S#54985", "CYC"), (SubLObject)makeSymbol("S#54807", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"));
        $ic63$ = ConsesLow.list((SubLObject)makeKeyword("WORD-DENOT"), (SubLObject)makeKeyword("WORD-POS-PRED"), (SubLObject)makeKeyword("WORD-UNIT"), (SubLObject)makeKeyword("MT"));
        $ic64$ = makeKeyword("WORD-DENOT");
        $ic65$ = makeKeyword("WORD-POS-PRED");
        $ic66$ = makeSymbol("S#54969", "CYC");
        $ic67$ = ConsesLow.list((SubLObject)makeKeyword("GENL"), (SubLObject)makeKeyword("ISA"));
        $ic68$ = makeSymbol("S#6920", "CYC");
        $ic69$ = makeSymbol("S#2028", "CYC");
        $ic70$ = makeSymbol("INTEGERP");
        $ic71$ = ConsesLow.list((SubLObject)makeSymbol("TYPE"), (SubLObject)makeSymbol("S#1553", "CYC"));
        $ic72$ = makeKeyword("GENL");
        $ic73$ = makeKeyword("ISA");
        $ic74$ = makeKeyword("PRED");
        $ic75$ = makeKeyword("POS");
        $ic76$ = makeSymbol("S#54977", "CYC");
        $ic77$ = makeSymbol("?PRED");
        $ic78$ = constant_handles_oc.f8479((SubLObject)makeString("basicSpeechPartPred"));
        $ic79$ = ConsesLow.list((SubLObject)makeSymbol("?PRED"));
        $ic80$ = makeSymbol("S#54981", "CYC");
        $ic81$ = ConsesLow.list((SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#13097", "CYC"), (SubLObject)makeSymbol("S#54986", "CYC"), (SubLObject)makeSymbol("S#54807", "CYC"), (SubLObject)makeSymbol("S#54987", "CYC"), (SubLObject)makeSymbol("S#39564", "CYC"));
        $ic82$ = ConsesLow.list((SubLObject)makeKeyword("RULE"), (SubLObject)makeKeyword("BASE-DENOT"), (SubLObject)makeKeyword("WORD-UNIT"), (SubLObject)makeKeyword("BASE-POS-PRED"), (SubLObject)makeKeyword("AFFIX-TYPE"));
        $ic83$ = ConsesLow.list((SubLObject)makeSymbol("S#54984", "CYC"), (SubLObject)makeSymbol("S#54985", "CYC"), (SubLObject)makeSymbol("S#54988", "CYC"));
        $ic84$ = makeKeyword("INFO");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 441 ms
	
	Decompiled with Procyon 0.5.32.
*/