package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0462 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0462";
    public static final String myFingerPrint = "b8724cf630a483d32a45f367822b7af131ef9cec43707b09c6666d539bc958c7";
    private static SubLSymbol $g3642$;
    private static SubLSymbol $g3643$;
    private static SubLSymbol $g3644$;
    private static SubLSymbol $g3645$;
    private static SubLSymbol $g3646$;
    private static SubLSymbol $g3647$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLObject $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
    private static final SubLList $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLList $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLList $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLList $ic28$;
    private static final SubLObject $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLList $ic31$;
    private static final SubLList $ic32$;
    private static final SubLList $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLList $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLList $ic39$;
    private static final SubLObject $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLList $ic42$;
    private static final SubLList $ic43$;
    
    public static SubLObject f31420(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var3 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var4 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        if (var4.equal(module0205.f13276(var3))) {
            return $g3643$.getGlobalValue();
        }
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f31421(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var3 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var4 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0228.f15206(var3);
        if (NIL != var5 && var4.equal(module0205.f13276(module0178.f11331(var5, (SubLObject)TWO_INTEGER)))) {
            final SubLObject var6 = f31422();
            module0347.f23330(var5, (SubLObject)NIL, var6);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31422() {
        return (SubLObject)ConsesLow.list(f31423());
    }
    
    public static SubLObject f31423() {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        return module0191.f11990((SubLObject)$ic7$, $g3644$.getDynamicValue(var7), module0132.$g1558$.getGlobalValue(), (SubLObject)$ic8$);
    }
    
    public static SubLObject f31424(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var3 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        return Numbers.min((SubLObject)ONE_INTEGER, module0217.f14221(var3, (SubLObject)ONE_INTEGER, $ic9$, module0132.$g1558$.getGlobalValue()));
    }
    
    public static SubLObject f31425(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        final SubLObject var6 = module0228.f15206(var4);
        if (NIL != var6) {
            var3.resetMultipleValues();
            final SubLObject var7 = module0235.f15474(var5, module0205.f13276(module0178.f11331(var6, (SubLObject)TWO_INTEGER)), (SubLObject)T, (SubLObject)T);
            final SubLObject var8 = var3.secondMultipleValue();
            var3.resetMultipleValues();
            if (NIL != var7) {
                final SubLObject var9 = ConsesLow.append(f31422(), var8);
                module0347.f23330(var6, var7, var9);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31426(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var3 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        return module0217.f14257(var3);
    }
    
    public static SubLObject f31427(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0018.$g637$.currentBinding(var3);
        try {
            module0018.$g637$.bind(var1, var3);
            module0219.f14480(Symbols.symbol_function((SubLObject)$ic12$), var4);
        }
        finally {
            module0018.$g637$.rebind(var5, var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31428(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        if (NIL != module0351.f23568(var5)) {
            final SubLObject var7 = module0018.$g637$.getDynamicValue(var6);
            final SubLObject var8 = module0205.f13387(var7, (SubLObject)UNPROVIDED);
            final SubLObject var9 = module0178.f11334(var5);
            var6.resetMultipleValues();
            final SubLObject var10 = module0235.f15474(var8, var9, (SubLObject)T, (SubLObject)T);
            final SubLObject var11 = var6.secondMultipleValue();
            var6.resetMultipleValues();
            if (NIL != var10) {
                final SubLObject var12 = ConsesLow.append(f31422(), var11);
                module0347.f23330(var5, var10, var12);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31429(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0004.f106(module0205.f13388(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31430(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var3 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var4 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0205.f13389(var1, (SubLObject)UNPROVIDED);
        if (var5.equal(module0205.f13362(var3, var4, (SubLObject)UNPROVIDED))) {
            return $g3645$.getGlobalValue();
        }
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f31431(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var3 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var4 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0205.f13389(var1, (SubLObject)UNPROVIDED);
        final SubLObject var6 = module0228.f15206(var3);
        if (NIL != var6 && var5.equal(module0205.f13362(module0178.f11331(var6, (SubLObject)TWO_INTEGER), var4, (SubLObject)UNPROVIDED))) {
            final SubLObject var7 = f31432();
            module0347.f23330(var6, (SubLObject)NIL, var7);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31432() {
        return (SubLObject)ConsesLow.list(f31433());
    }
    
    public static SubLObject f31433() {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        return module0191.f11990((SubLObject)$ic7$, $g3646$.getDynamicValue(var7), module0132.$g1558$.getGlobalValue(), (SubLObject)$ic8$);
    }
    
    public static SubLObject f31434(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0004.f106(module0205.f13388(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31435(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var3 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        return Numbers.min((SubLObject)ONE_INTEGER, module0217.f14221(var3, (SubLObject)ONE_INTEGER, $ic9$, module0132.$g1558$.getGlobalValue()));
    }
    
    public static SubLObject f31436(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        final SubLObject var6 = module0205.f13389(var1, (SubLObject)UNPROVIDED);
        final SubLObject var7 = module0228.f15206(var4);
        if (NIL != var7) {
            var3.resetMultipleValues();
            final SubLObject var8 = module0235.f15474(var6, module0205.f13362(module0178.f11331(var7, (SubLObject)TWO_INTEGER), var5, (SubLObject)UNPROVIDED), (SubLObject)T, (SubLObject)T);
            final SubLObject var9 = var3.secondMultipleValue();
            var3.resetMultipleValues();
            if (NIL != var8) {
                final SubLObject var10 = ConsesLow.append(f31432(), var9);
                module0347.f23330(var7, var8, var10);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31437(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var3 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var4 = Numbers.min((SubLObject)ONE_INTEGER, module0217.f14221(var3, (SubLObject)ONE_INTEGER, $ic9$, module0132.$g1558$.getGlobalValue()));
        final SubLObject var5 = module0205.f13360(var3, (SubLObject)UNPROVIDED);
        return Numbers.multiply(var4, Numbers.add(var5, (SubLObject)ONE_INTEGER));
    }
    
    public static SubLObject f31438(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0228.f15206(var4);
        if (NIL != var5) {
            final SubLObject var6 = module0205.f13180(var4, (SubLObject)$ic23$);
            SubLObject var7 = (SubLObject)NIL;
            SubLObject var8 = (SubLObject)NIL;
            SubLObject var9 = (SubLObject)NIL;
            var7 = var6;
            var8 = var7.first();
            for (var9 = (SubLObject)ZERO_INTEGER; NIL != var7; var7 = var7.rest(), var8 = var7.first(), var9 = module0048.f_1X(var9)) {
                final SubLObject var10 = module0202.f12769($ic15$, var4, var9, var8);
                var3.resetMultipleValues();
                final SubLObject var11 = module0235.f15474(var10, var1, (SubLObject)T, (SubLObject)T);
                final SubLObject var12 = var3.secondMultipleValue();
                var3.resetMultipleValues();
                if (NIL != var11) {
                    final SubLObject var13 = ConsesLow.append(f31432(), var12);
                    module0347.f23330(var5, var11, var13);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31439(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var3 = module0205.f13389(var1, (SubLObject)UNPROVIDED);
        final SubLObject var4 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0269.f17708(var3);
        if (NIL != module0193.f12067(var4)) {
            if (NIL != var5) {
                return Numbers.add(module0217.f14238(var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), module0217.f14257(var3));
            }
            return module0217.f14238(var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else {
            if (!var4.isZero()) {
                return module0217.f14238(var3, var4, (SubLObject)UNPROVIDED);
            }
            if (NIL != var5) {
                return module0217.f14238(var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            return (SubLObject)ZERO_INTEGER;
        }
    }
    
    public static SubLObject f31440(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0205.f13389(var1, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        final SubLObject var6 = module0269.f17708(var4);
        final SubLObject var7 = module0018.$g637$.currentBinding(var3);
        try {
            module0018.$g637$.bind(var1, var3);
            if (NIL != var6 && (NIL != module0193.f12067(var5) || var5.isZero())) {
                module0219.f14480(Symbols.symbol_function((SubLObject)$ic26$), var4);
            }
            if (NIL != module0193.f12067(var5)) {
                module0219.f14479(Symbols.symbol_function((SubLObject)$ic26$), var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (var5.isPositive()) {
                module0219.f14479(Symbols.symbol_function((SubLObject)$ic26$), var4, var5, (SubLObject)UNPROVIDED);
            }
        }
        finally {
            module0018.$g637$.rebind(var7, var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31441(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        if (NIL != module0351.f23568(var5)) {
            final SubLObject var7 = module0178.f11334(var5);
            final SubLObject var8 = module0018.$g637$.getDynamicValue(var6);
            final SubLObject var9 = module0205.f13388(var8, (SubLObject)UNPROVIDED);
            final SubLObject var10 = module0205.f13180(var7, (SubLObject)$ic23$);
            SubLObject var11 = (SubLObject)NIL;
            SubLObject var12 = (SubLObject)NIL;
            SubLObject var13 = (SubLObject)NIL;
            var11 = var10;
            var12 = var11.first();
            for (var13 = (SubLObject)ZERO_INTEGER; NIL != var11; var11 = var11.rest(), var12 = var11.first(), var13 = module0048.f_1X(var13)) {
                if (NIL != module0193.f12067(var9) || var9.numE(var13)) {}
                final SubLObject var14 = module0202.f12769($ic15$, var7, var13, var12);
                var6.resetMultipleValues();
                final SubLObject var15 = module0235.f15474(var14, var8, (SubLObject)T, (SubLObject)T);
                final SubLObject var16 = var6.secondMultipleValue();
                var6.resetMultipleValues();
                if (NIL != var15) {
                    final SubLObject var17 = ConsesLow.append(f31432(), var16);
                    module0347.f23330(var5, var15, var17);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31442(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return $g3642$.getGlobalValue();
    }
    
    public static SubLObject f31443(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return f31444(var1);
    }
    
    public static SubLObject f31445(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var3 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var4 = module0205.f13388(var1, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0228.f15206(var3);
        final SubLObject var6 = module0228.f15206(var4);
        if (NIL != var5 && NIL != var6 && module0205.f13304(module0178.f11331(var5, (SubLObject)TWO_INTEGER), (SubLObject)UNPROVIDED).equal(module0205.f13304(module0178.f11331(var6, (SubLObject)TWO_INTEGER), (SubLObject)UNPROVIDED))) {
            final SubLObject var7 = f31446();
            final SubLObject var8 = (SubLObject)ConsesLow.list(var5, var6);
            module0347.f23330(var7, (SubLObject)NIL, var8);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31444(final SubLObject var1) {
        return Numbers.min((SubLObject)ONE_INTEGER, new SubLObject[] { module0217.f14221(module0205.f13387(var1, (SubLObject)UNPROVIDED), (SubLObject)ONE_INTEGER, $ic9$, module0132.$g1558$.getGlobalValue()), module0217.f14221(module0205.f13388(var1, (SubLObject)UNPROVIDED), (SubLObject)ONE_INTEGER, $ic9$, module0132.$g1558$.getGlobalValue()) });
    }
    
    public static SubLObject f31446() {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        return module0191.f11990((SubLObject)$ic7$, $g3647$.getDynamicValue(var7), module0132.$g1558$.getGlobalValue(), (SubLObject)$ic8$);
    }
    
    public static SubLObject f31447(final SubLObject var29) {
        final SubLThread var30 = SubLProcess.currentSubLThread();
        final SubLObject var31 = module0232.f15308(var29);
        final SubLObject var32 = f31448(var31);
        SubLObject var33 = (SubLObject)NIL;
        SubLObject var34 = (SubLObject)NIL;
        SubLObject var35 = (SubLObject)NIL;
        SubLObject var36 = (SubLObject)NIL;
        var34 = var31;
        var35 = var34.first();
        for (var36 = (SubLObject)ZERO_INTEGER; NIL != var34; var34 = var34.rest(), var35 = var34.first(), var36 = Numbers.add((SubLObject)ONE_INTEGER, var36)) {
            if (NIL != f31449(var35)) {
                SubLObject var38;
                final SubLObject var37 = var38 = var35;
                SubLObject var39 = (SubLObject)NIL;
                SubLObject var40 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var38, var37, (SubLObject)$ic33$);
                var39 = var38.first();
                var38 = var38.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var38, var37, (SubLObject)$ic33$);
                var40 = var38.first();
                var38 = var38.rest();
                if (NIL == var38) {
                    final SubLObject var41 = module0205.f13387(var40, (SubLObject)UNPROVIDED);
                    final SubLObject var42 = module0205.f13388(var40, (SubLObject)UNPROVIDED);
                    final SubLObject var43 = module0205.f13389(var40, (SubLObject)UNPROVIDED);
                    final SubLObject var44 = module0067.f4884(var32, var41, (SubLObject)UNPROVIDED);
                    if (NIL != module0193.f12105(var42) && NIL != module0193.f12105(var43) && NIL != var44) {
                        module0084.f5765(var32, var41, var36, Symbols.symbol_function((SubLObject)$ic34$), (SubLObject)UNPROVIDED);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var37, (SubLObject)$ic33$);
                }
            }
        }
        SubLObject var45;
        for (var45 = module0066.f4838(module0067.f4891(var32)); NIL == module0066.f4841(var45); var45 = module0066.f4840(var45)) {
            var30.resetMultipleValues();
            final SubLObject var46 = module0066.f4839(var45);
            final SubLObject var47 = var30.secondMultipleValue();
            var30.resetMultipleValues();
            if (NIL != module0035.f2002(var47, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) {
                var33 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)NIL, var47), var33);
            }
        }
        module0066.f4842(var45);
        return var33;
    }
    
    public static SubLObject f31450(final SubLObject var30) {
        final SubLObject var31 = module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var32 = (SubLObject)NIL;
        SubLObject var33 = (SubLObject)NIL;
        SubLObject var34 = (SubLObject)NIL;
        var32 = var30;
        var33 = var32.first();
        for (var34 = (SubLObject)ZERO_INTEGER; NIL != var32; var32 = var32.rest(), var33 = var32.first(), var34 = Numbers.add((SubLObject)ONE_INTEGER, var34)) {
            if (NIL != f31451(var33)) {
                SubLObject var36;
                final SubLObject var35 = var36 = var33;
                SubLObject var37 = (SubLObject)NIL;
                SubLObject var38 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)$ic36$);
                var37 = var36.first();
                var36 = var36.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)$ic36$);
                var38 = var36.first();
                var36 = var36.rest();
                if (NIL == var36) {
                    final SubLObject var39 = module0205.f13387(var38, (SubLObject)UNPROVIDED);
                    final SubLObject var40 = module0205.f13388(var38, (SubLObject)UNPROVIDED);
                    if (NIL != module0193.f12106(var39) && NIL != module0193.f12105(var40)) {
                        module0084.f5765(var31, var39, var34, Symbols.symbol_function((SubLObject)$ic34$), (SubLObject)UNPROVIDED);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var35, (SubLObject)$ic36$);
                }
            }
        }
        return var31;
    }
    
    public static SubLObject f31448(final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        final SubLObject var32 = module0034.$g879$.getDynamicValue(var31);
        SubLObject var33 = (SubLObject)NIL;
        if (NIL == var32) {
            return f31450(var30);
        }
        var33 = module0034.f1857(var32, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
        if (NIL == var33) {
            var33 = module0034.f1807(module0034.f1842(var32), (SubLObject)$ic35$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var32, (SubLObject)$ic35$, var33);
        }
        SubLObject var34 = module0034.f1814(var33, var30, (SubLObject)$ic37$);
        if (var34 == $ic37$) {
            var34 = Values.arg2(var31.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f31450(var30)));
            module0034.f1816(var33, var30, var34, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var34);
    }
    
    public static SubLObject f31452(final SubLObject var51) {
        SubLObject var52 = (SubLObject)NIL;
        SubLObject var53 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var51, var51, (SubLObject)$ic39$);
        var52 = var51.first();
        SubLObject var54 = var51.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var54, var51, (SubLObject)$ic39$);
        var53 = var54.first();
        var54 = var54.rest();
        if (NIL == var54) {
            return (SubLObject)makeBoolean(NIL != module0202.f12589(var53, $ic0$) && NIL != module0035.f1995(var53, (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED) && NIL != module0259.f16854(module0205.f13388(var53, (SubLObject)UNPROVIDED), $ic40$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        cdestructuring_bind.cdestructuring_bind_error(var51, (SubLObject)$ic39$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31451(final SubLObject var51) {
        final SubLThread var52 = SubLProcess.currentSubLThread();
        final SubLObject var53 = module0034.$g879$.getDynamicValue(var52);
        SubLObject var54 = (SubLObject)NIL;
        if (NIL == var53) {
            return f31452(var51);
        }
        var54 = module0034.f1857(var53, (SubLObject)$ic38$, (SubLObject)UNPROVIDED);
        if (NIL == var54) {
            var54 = module0034.f1807(module0034.f1842(var53), (SubLObject)$ic38$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var53, (SubLObject)$ic38$, var54);
        }
        SubLObject var55 = module0034.f1814(var54, var51, (SubLObject)$ic37$);
        if (var55 == $ic37$) {
            var55 = Values.arg2(var52.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f31452(var51)));
            module0034.f1816(var54, var51, var55, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var55);
    }
    
    public static SubLObject f31453(final SubLObject var51) {
        SubLObject var52 = (SubLObject)NIL;
        SubLObject var53 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var51, var51, (SubLObject)$ic39$);
        var52 = var51.first();
        SubLObject var54 = var51.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var54, var51, (SubLObject)$ic39$);
        var53 = var54.first();
        var54 = var54.rest();
        if (NIL == var54) {
            return (SubLObject)makeBoolean(NIL != module0202.f12589(var53, $ic15$) && NIL != module0035.f1995(var53, (SubLObject)FOUR_INTEGER, (SubLObject)UNPROVIDED));
        }
        cdestructuring_bind.cdestructuring_bind_error(var51, (SubLObject)$ic39$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31449(final SubLObject var51) {
        final SubLThread var52 = SubLProcess.currentSubLThread();
        final SubLObject var53 = module0034.$g879$.getDynamicValue(var52);
        SubLObject var54 = (SubLObject)NIL;
        if (NIL == var53) {
            return f31453(var51);
        }
        var54 = module0034.f1857(var53, (SubLObject)$ic41$, (SubLObject)UNPROVIDED);
        if (NIL == var54) {
            var54 = module0034.f1807(module0034.f1842(var53), (SubLObject)$ic41$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var53, (SubLObject)$ic41$, var54);
        }
        SubLObject var55 = module0034.f1814(var54, var51, (SubLObject)$ic37$);
        if (var55 == $ic37$) {
            var55 = Values.arg2(var52.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f31453(var51)));
            module0034.f1816(var54, var51, var55, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var55);
    }
    
    public static SubLObject f31454(final SubLObject var29) {
        return (SubLObject)ONE_INTEGER;
    }
    
    public static SubLObject f31455(final SubLObject var29) {
        final SubLThread var30 = SubLProcess.currentSubLThread();
        final SubLObject var31 = module0232.f15308(var29);
        final SubLObject var32 = Sequences.find_if((SubLObject)$ic38$, var31, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var33 = module0035.f2110((SubLObject)$ic41$, var31, (SubLObject)UNPROVIDED);
        SubLObject var34 = (SubLObject)NIL;
        SubLObject var36;
        final SubLObject var35 = var36 = var32;
        SubLObject var37 = (SubLObject)NIL;
        SubLObject var38 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)$ic42$);
        var37 = var36.first();
        var36 = var36.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)$ic42$);
        var38 = var36.first();
        var36 = var36.rest();
        if (NIL == var36) {
            final SubLObject var39 = module0205.f13387(var38, (SubLObject)UNPROVIDED);
            final SubLObject var40 = module0205.f13388(var38, (SubLObject)UNPROVIDED);
            SubLObject var41 = (SubLObject)NIL;
            var34 = (SubLObject)ConsesLow.cons(var38, var34);
            SubLObject var42 = var33;
            SubLObject var43 = (SubLObject)NIL;
            var43 = var42.first();
            while (NIL != var42) {
                SubLObject var70_71;
                final SubLObject var68_69 = var70_71 = var43;
                SubLObject var44 = (SubLObject)NIL;
                SubLObject var45 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var70_71, var68_69, (SubLObject)$ic43$);
                var44 = var70_71.first();
                var70_71 = var70_71.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var70_71, var68_69, (SubLObject)$ic43$);
                var45 = var70_71.first();
                var70_71 = var70_71.rest();
                if (NIL == var70_71) {
                    var34 = (SubLObject)ConsesLow.cons(var45, var34);
                    final SubLObject var46 = module0205.f13388(var45, (SubLObject)UNPROVIDED);
                    final SubLObject var47 = module0205.f13389(var45, (SubLObject)UNPROVIDED);
                    var41 = module0035.f2063(var41, var46, var47, (SubLObject)UNPROVIDED);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var68_69, (SubLObject)$ic43$);
                }
                var42 = var42.rest();
                var43 = var42.first();
            }
            SubLObject var48 = (SubLObject)NIL;
            SubLObject var49 = (SubLObject)NIL;
            SubLObject var50;
            SubLObject var51;
            for (var50 = (SubLObject)ZERO_INTEGER, var51 = (SubLObject)NIL, var51 = Sequences.length(var41); !var51.numLE(var50); var51 = Numbers.add(var51, (SubLObject)MINUS_ONE_INTEGER)) {
                var49 = (SubLObject)ConsesLow.cons(module0035.f2293(var41, var51, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var49);
            }
            var48 = (SubLObject)ConsesLow.cons(var40, var49);
            var30.resetMultipleValues();
            final SubLObject var52 = module0235.f15474(var39, var48, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var53 = var30.secondMultipleValue();
            var30.resetMultipleValues();
            if (NIL != var52) {
                final SubLObject var54 = f31456(var48);
                if (NIL != var54) {
                    module0376.f26641(var52, var54);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var35, (SubLObject)$ic42$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31456(final SubLObject var76) {
        final SubLObject var77 = module0172.f10921(var76);
        if (NIL != var77) {
            final SubLObject var78 = module0461.f31404(var77, var76);
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons(var78, f31422()), (SubLObject)ConsesLow.cons(var78, f31432()));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31457() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0462", "f31420", "S#34720", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0462", "f31421", "S#34721", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0462", "f31422", "S#34722", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0462", "f31423", "S#34723", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0462", "f31424", "S#34724", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0462", "f31425", "S#34725", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0462", "f31426", "S#34726", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0462", "f31427", "S#29823", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0462", "f31428", "S#34727", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0462", "f31429", "S#34728", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0462", "f31430", "S#34729", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0462", "f31431", "S#34730", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0462", "f31432", "S#34731", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0462", "f31433", "S#34732", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0462", "f31434", "S#34733", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0462", "f31435", "S#34734", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0462", "f31436", "S#34735", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0462", "f31437", "S#34736", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0462", "f31438", "S#34737", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0462", "f31439", "S#34738", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0462", "f31440", "S#29821", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0462", "f31441", "S#34739", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0462", "f31442", "S#34740", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0462", "f31443", "S#34741", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0462", "f31445", "S#34742", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0462", "f31444", "S#34743", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0462", "f31446", "S#34744", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0462", "f31447", "S#34745", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0462", "f31450", "S#34746", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0462", "f31448", "S#34747", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0462", "f31452", "S#34748", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0462", "f31451", "S#34749", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0462", "f31453", "S#34750", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0462", "f31449", "S#34751", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0462", "f31454", "S#34752", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0462", "f31455", "S#34753", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0462", "f31456", "S#34754", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31458() {
        $g3642$ = SubLFiles.deflexical("S#34755", (SubLObject)NIL);
        $g3643$ = SubLFiles.deflexical("S#34756", module0018.$g658$.getDynamicValue());
        $g3644$ = SubLFiles.defparameter("S#34757", (SubLObject)$ic6$);
        $g3645$ = SubLFiles.deflexical("S#34758", module0018.$g658$.getDynamicValue());
        $g3646$ = SubLFiles.defparameter("S#34759", (SubLObject)$ic20$);
        $g3647$ = SubLFiles.defparameter("S#34760", (SubLObject)$ic32$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31459() {
        module0340.f22938($ic0$);
        module0358.f23774((SubLObject)$ic1$, $ic0$);
        module0358.f23730((SubLObject)$ic2$, (SubLObject)$ic3$);
        module0340.f22941((SubLObject)$ic4$, (SubLObject)$ic5$);
        module0340.f22941((SubLObject)$ic10$, (SubLObject)$ic11$);
        module0340.f22941((SubLObject)$ic13$, (SubLObject)$ic14$);
        module0340.f22938($ic15$);
        module0358.f23730((SubLObject)$ic16$, (SubLObject)$ic17$);
        module0340.f22941((SubLObject)$ic18$, (SubLObject)$ic19$);
        module0340.f22941((SubLObject)$ic21$, (SubLObject)$ic22$);
        module0340.f22941((SubLObject)$ic24$, (SubLObject)$ic25$);
        module0340.f22941((SubLObject)$ic27$, (SubLObject)$ic28$);
        module0340.f22938($ic29$);
        module0358.f23771((SubLObject)$ic1$, $ic29$, (SubLObject)ONE_INTEGER);
        module0358.f23771((SubLObject)$ic1$, $ic29$, (SubLObject)TWO_INTEGER);
        module0340.f22941((SubLObject)$ic30$, (SubLObject)$ic31$);
        module0034.f1895((SubLObject)$ic35$);
        module0034.f1895((SubLObject)$ic38$);
        module0034.f1895((SubLObject)$ic41$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f31457();
    }
    
    public void initializeVariables() {
        f31458();
    }
    
    public void runTopLevelForms() {
        f31459();
    }
    
    static {
        me = (SubLFile)new module0462();
        $g3642$ = null;
        $g3643$ = null;
        $g3644$ = null;
        $g3645$ = null;
        $g3646$ = null;
        $g3647$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("natFunction"));
        $ic1$ = makeKeyword("POS");
        $ic2$ = makeKeyword("NAT-FUNCTION-LOOKUP-POS");
        $ic3$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("natFunction")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("natFunction")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic4$ = makeKeyword("REMOVAL-NAT-FUNCTION-CHECK-POS");
        $ic5$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("natFunction")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("natFunction")), (SubLObject)makeKeyword("NART"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST"), makeSymbol("S#34720", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34721", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$natFunction <reified NAT> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$natFunction (#$JuvenileFn #$Dog) #$JuvenileFn)") });
        $ic6$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termOfUnit")), (SubLObject)makeSymbol("?NAT"), (SubLObject)ConsesLow.cons((SubLObject)makeSymbol("?FUNCTION"), (SubLObject)makeSymbol("?ARGS"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("natFunction")), (SubLObject)makeSymbol("?NAT"), (SubLObject)makeSymbol("?FUNCTION")));
        $ic7$ = makeKeyword("CODE");
        $ic8$ = makeKeyword("TRUE-MON");
        $ic9$ = constant_handles_oc.f8479((SubLObject)makeString("termOfUnit"));
        $ic10$ = makeKeyword("REMOVAL-NAT-FUNCTION-UNIFY");
        $ic11$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("natFunction")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("natFunction")), (SubLObject)makeKeyword("NART"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST"), makeSymbol("S#34724", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34725", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$natFunction <reified NAT> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$natFunction (#$JuvenileFn #$Dog) ?WHAT)") });
        $ic12$ = makeSymbol("S#34727", "CYC");
        $ic13$ = makeKeyword("REMOVAL-NAT-FUNCTION-LOOKUP");
        $ic14$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("natFunction")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("natFunction")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("S#34726", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#29823", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$natFunction <not fully-bound> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$natFunction ?NAT #$JuvenileFn)") });
        $ic15$ = constant_handles_oc.f8479((SubLObject)makeString("natArgument"));
        $ic16$ = makeKeyword("NAT-ARGUMENT-LOOKUP-POS");
        $ic17$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("natArgument")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("natArgument")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic18$ = makeKeyword("REMOVAL-NAT-ARGUMENT-CHECK-POS");
        $ic19$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("natArgument")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("natArgument")), (SubLObject)makeKeyword("NART"), (SubLObject)makeKeyword("INTEGER"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("S#34728", "CYC"), makeKeyword("COST"), makeSymbol("S#34729", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34730", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$natArgument <reified NAT> <non-negative integer> <fully bound>)"), makeKeyword("EXAMPLE"), makeString("(#$natArgument (#$JuvenileFn #$Dog) 1 #$Dog)") });
        $ic20$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termOfUnit")), (SubLObject)makeSymbol("?NAT"), (SubLObject)makeSymbol("?FORMULA")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("evaluate")), (SubLObject)makeSymbol("?TERM"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("FormulaArgFn")), (SubLObject)makeSymbol("?ARG"), (SubLObject)makeSymbol("?FORMULA")))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("natArgument")), (SubLObject)makeSymbol("?NAT"), (SubLObject)makeSymbol("?ARG"), (SubLObject)makeSymbol("?TERM")));
        $ic21$ = makeKeyword("REMOVAL-NAT-ARGUMENT-TERM-UNIFY");
        $ic22$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("natArgument")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("natArgument")), (SubLObject)makeKeyword("NART"), (SubLObject)makeKeyword("INTEGER"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("S#34733", "CYC"), makeKeyword("COST"), makeSymbol("S#34734", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34735", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$natArgument <reified NAT> <non-negative integer> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$natArgument (#$JuvenileFn #$Dog) 1 ?WHAT)") });
        $ic23$ = makeKeyword("IGNORE");
        $ic24$ = makeKeyword("REMOVAL-NAT-ARGUMENT-ARG-UNIFY");
        $ic25$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("natArgument")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("natArgument")), (SubLObject)makeKeyword("NART"), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), makeKeyword("COST"), makeSymbol("S#34736", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34737", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$natArgument <reified NAT> <not fully-bound> <anything>)"), makeKeyword("EXAMPLE"), makeString("(#$natArgument (#$JuvenileFn #$Dog) ?ARG ?WHAT)\n    (#$natArgument (#$JuvenileFn #$Dog) ?ARG #$Dog)") });
        $ic26$ = makeSymbol("S#34739", "CYC");
        $ic27$ = makeKeyword("REMOVAL-NAT-ARGUMENT-LOOKUP");
        $ic28$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("natArgument")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("natArgument")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("OR"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("NON-NEGATIVE-INTEGER-P")), (SubLObject)makeKeyword("VARIABLE")), (SubLObject)makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("S#34738", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#29821", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$natArgument <not fully-bound> <variable> <fort>)\n    (#$natArgument <not fully-bound> <integer>  <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$natArgument ?NAT 1    #$Dog)\n    (#$natArgument ?NAT ?ARG #$Dog)") });
        $ic29$ = constant_handles_oc.f8479((SubLObject)makeString("natArgumentsEqual"));
        $ic30$ = makeKeyword("REMOVAL-NAT-ARGUMENTS-EQUAL-CHECK-POS");
        $ic31$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("natArgumentsEqual")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("natArgumentsEqual")), (SubLObject)makeKeyword("NART"), (SubLObject)makeKeyword("NART")), makeKeyword("REQUIRED"), makeSymbol("S#34740", "CYC"), makeKeyword("COST"), makeSymbol("S#34741", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34742", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$natArgumentsEqual <reified NAT> <reified NAT>)"), makeKeyword("EXAMPLE"), makeString("(#$natArgumentsEqual (#$LeftFn #$Leg) (#$RightFn #$Leg))") });
        $ic32$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termOfUnit")), (SubLObject)makeSymbol("?NAT1"), (SubLObject)makeSymbol("?FORMULA1")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termOfUnit")), (SubLObject)makeSymbol("?NAT2"), (SubLObject)makeSymbol("?FORMULA2")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("evaluate")), (SubLObject)makeSymbol("?ARGS-LIST"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("FormulaArgListFn")), (SubLObject)makeSymbol("?FORMULA1"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("evaluate")), (SubLObject)makeSymbol("?ARGS-LIST"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("FormulaArgListFn")), (SubLObject)makeSymbol("?FORMULA2")))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("natArgumentsEqual")), (SubLObject)makeSymbol("?NAT1"), (SubLObject)makeSymbol("?NAT2")));
        $ic33$ = ConsesLow.list((SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#34761", "CYC"));
        $ic34$ = makeSymbol("=");
        $ic35$ = makeSymbol("S#34747", "CYC");
        $ic36$ = ConsesLow.list((SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#34762", "CYC"));
        $ic37$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic38$ = makeSymbol("S#34749", "CYC");
        $ic39$ = ConsesLow.list((SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#13100", "CYC"));
        $ic40$ = constant_handles_oc.f8479((SubLObject)makeString("ReifiableFunction"));
        $ic41$ = makeSymbol("S#34751", "CYC");
        $ic42$ = ConsesLow.list((SubLObject)makeSymbol("S#34763", "CYC"), (SubLObject)makeSymbol("S#34764", "CYC"));
        $ic43$ = ConsesLow.list((SubLObject)makeSymbol("S#34765", "CYC"), (SubLObject)makeSymbol("S#34766", "CYC"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 287 ms
	
	Decompiled with Procyon 0.5.32.
*/