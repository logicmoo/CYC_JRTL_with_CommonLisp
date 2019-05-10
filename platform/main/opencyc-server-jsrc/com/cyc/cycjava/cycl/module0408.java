package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Semaphores;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0408 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0408";
    public static final String myFingerPrint = "5f5d9dc4d3a7d76e276d7233788d3d74d5cb58f2ed1071103cc802dccd7176ba";
    public static SubLSymbol $g3301$;
    public static SubLSymbol $g3302$;
    private static SubLSymbol $g3303$;
    private static SubLSymbol $g3304$;
    private static SubLSymbol $g3305$;
    private static SubLSymbol $g3306$;
    private static SubLSymbol $g3307$;
    private static SubLSymbol $g3308$;
    private static SubLSymbol $g3309$;
    public static SubLSymbol $g3310$;
    public static SubLSymbol $g3311$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLString $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLList $ic21$;
    private static final SubLList $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLList $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLInteger $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLString $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLList $ic42$;
    private static final SubLString $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLObject $ic47$;
    private static final SubLObject $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLString $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLString $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLString $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLString $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLString $ic80$;
    private static final SubLString $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLList $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLString $ic89$;
    private static final SubLInteger $ic90$;
    private static final SubLInteger $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLList $ic96$;
    private static final SubLList $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLString $ic103$;
    private static final SubLString $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    
    public static SubLObject f28394(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        final SubLObject var7 = (SubLObject)$ic1$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list(var7), (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)$ic4$, var7, (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)$ic5$, ConsesLow.append(var6, (SubLObject)NIL))), (SubLObject)ConsesLow.listS((SubLObject)$ic6$, var7, (SubLObject)ConsesLow.listS((SubLObject)$ic7$, var5, (SubLObject)$ic8$), (SubLObject)$ic9$));
    }
    
    public static SubLObject f28395() {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        if (NIL != $g3302$.getDynamicValue(var8)) {
            Dynamic.sublisp_throw((SubLObject)$ic4$, (SubLObject)T);
        }
        return (SubLObject)$ic10$;
    }
    
    public static SubLObject f28396() {
        f28397();
        f28395();
        return (SubLObject)$ic10$;
    }
    
    public static SubLObject f28398(SubLObject var9) {
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)NIL;
        }
        final SubLObject var10 = module0339.f22757();
        if (NIL != var10) {
            final SubLObject var11 = Semaphores.new_semaphore((SubLObject)$ic11$, (SubLObject)ZERO_INTEGER);
            module0004.f78((SubLObject)$ic11$, Symbols.symbol_function((SubLObject)$ic12$), (SubLObject)ConsesLow.list(var11, var10, var9));
            Semaphores.semaphore_wait(var11);
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28399(final SubLObject var11, final SubLObject var10, final SubLObject var9) {
        Semaphores.semaphore_signal(var11);
        return f28400(var10, var9);
    }
    
    public static SubLObject f28401(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        final SubLObject var7 = (SubLObject)$ic13$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list(var7), (SubLObject)ConsesLow.list((SubLObject)$ic14$, (SubLObject)$ic15$, reader.bq_cons((SubLObject)$ic16$, ConsesLow.append(var6, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)$ic17$, var7, reader.bq_cons((SubLObject)$ic18$, ConsesLow.append(var6, (SubLObject)NIL)))), (SubLObject)ConsesLow.list((SubLObject)$ic6$, var7, (SubLObject)ConsesLow.list((SubLObject)$ic7$, var5, (SubLObject)ConsesLow.list((SubLObject)$ic19$, var7))));
    }
    
    public static SubLObject f28402(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic20$, (SubLObject)$ic21$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f28403() {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        return Dynamic.sublisp_throw((SubLObject)$ic17$, Errors.$error_message$.getDynamicValue(var8));
    }
    
    public static SubLObject f28404(final SubLObject var1, final SubLObject var2) {
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
        if (NIL == var4) {
            final SubLObject var8;
            var4 = (var8 = var5);
            final SubLObject var9 = (SubLObject)$ic23$;
            final SubLObject var10 = (SubLObject)$ic24$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var9, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic25$, (SubLObject)ConsesLow.list(var9, (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list(var10), (SubLObject)ConsesLow.listS((SubLObject)$ic26$, (SubLObject)ConsesLow.list(var9, var10), ConsesLow.append(var8, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, var10, (SubLObject)ConsesLow.listS((SubLObject)$ic7$, var6, (SubLObject)$ic27$)))), reader.bq_cons((SubLObject)T, ConsesLow.append(var8, (SubLObject)NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic22$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28405(final SubLObject var10) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        if (NIL == $g3303$.getDynamicValue(var11)) {
            return (SubLObject)NIL;
        }
        if (NIL != inference_datastructures_inference_oc.f25432(var10)) {
            return (SubLObject)NIL;
        }
        if (NIL == inference_datastructures_inference_oc.f25514(var10)) {
            return (SubLObject)NIL;
        }
        return inference_datastructures_inference_oc.f25517(var10);
    }
    
    public static SubLObject f28406(final SubLObject var24) {
        final SubLObject var25 = module0360.f23837(var24);
        return module0035.f2341(module0412.f28715(var25), var24);
    }
    
    public static SubLObject f28407(final SubLObject var24) {
        final SubLObject var25 = module0360.f23837(var24);
        if ($ic28$ == var25) {
            return var24;
        }
        SubLObject var26 = (SubLObject)NIL;
        final SubLObject var27 = module0412.f28715(var25);
        SubLObject var28;
        SubLObject var29;
        SubLObject var30;
        SubLObject var31;
        for (var28 = (SubLObject)NIL, var28 = var24; NIL != var28; var28 = conses_high.cddr(var28)) {
            var29 = var28.first();
            var30 = conses_high.cadr(var28);
            var31 = conses_high.getf(var27, var29, (SubLObject)$ic29$);
            if (!var30.equal(var31)) {
                var26 = conses_high.putf(var26, var29, var30);
            }
        }
        return var26;
    }
    
    public static SubLObject f28408(final SubLObject var24, final SubLObject var29) {
        final SubLObject var30 = f28406(var24);
        final SubLObject var31 = module0360.f23985(var29);
        return conses_high.getf(var30, var29, var31);
    }
    
    public static SubLObject f28409(final SubLObject var10) {
        assert NIL != inference_datastructures_inference_oc.f25275(var10) : var10;
        final SubLObject var11 = inference_datastructures_inference_oc.f25421(var10);
        final SubLObject var12 = inference_datastructures_inference_oc.f25514(var10);
        final SubLObject var13 = inference_datastructures_inference_oc.f25523(var10);
        final SubLObject var14 = module0361.f24164(var11);
        final SubLObject var15 = inference_datastructures_inference_oc.f25432(var10);
        final SubLObject var16 = inference_datastructures_inference_oc.f25516(var10);
        if (NIL == var14) {
            inference_datastructures_inference_oc.f25463(var10, (SubLObject)ZERO_INTEGER);
        }
        if ($ic31$ != inference_datastructures_inference_oc.f25509(var10)) {
            inference_datastructures_inference_oc.f25464(var10, (SubLObject)$ic32$);
        }
        if (NIL != module0361.f24190(var11) && NIL != inference_datastructures_inference_oc.f25603(var10) && var13.eql((SubLObject)ZERO_INTEGER)) {
            module0361.f24184(var11, (SubLObject)NIL);
        }
        final SubLObject var17 = var16;
        if (var17.eql((SubLObject)$ic33$) || var17.eql((SubLObject)$ic34$) || var17.eql((SubLObject)$ic35$)) {
            inference_datastructures_inference_oc.f25449(var10, (SubLObject)$ic36$);
        }
        if (NIL != module0360.f23961(var16) && NIL != module0035.f2434((SubLObject)$ic33$, var16)) {
            inference_datastructures_inference_oc.f25449(var10, (SubLObject)$ic36$);
        }
        if (NIL != module0361.f24190(var11)) {
            if (NIL == var12) {
                module0361.f24183(var11, (SubLObject)T);
            }
            if (NIL != module0361.f24174(var11)) {}
            final SubLObject var18 = inference_datastructures_inference_oc.f25487(var10);
            if (NIL != var12 && NIL != module0362.f24460(var18) && var13.eql((SubLObject)ZERO_INTEGER) && NIL == var15) {
                module0361.f24183(var11, (SubLObject)NIL);
            }
        }
        if (NIL != module0361.f24171(var11)) {
            inference_datastructures_inference_oc.f25558(var10, (SubLObject)$ic37$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28410(final SubLObject var10, final SubLObject var42, final SubLObject var43) {
        assert NIL != inference_datastructures_inference_oc.f25426(var10) : var10;
        f28411(var10, var42, var43);
        return f28412(var10);
    }
    
    public static SubLObject f28413(final SubLObject var10, final SubLObject var44, final SubLObject var45) {
        assert NIL != inference_datastructures_inference_oc.f25426(var10) : var10;
        f28414(var10, var44, var45);
        return f28412(var10);
    }
    
    public static SubLObject f28412(final SubLObject var10) {
        if (NIL != inference_datastructures_inference_oc.f25426(var10)) {
            if (NIL != inference_datastructures_inference_oc.f25605(var10)) {
                f28415(var10);
            }
            else {
                Errors.error((SubLObject)$ic39$, var10);
            }
            inference_datastructures_inference_oc.f25447(var10, (SubLObject)$ic40$);
        }
        return var10;
    }
    
    public static SubLObject f28415(final SubLObject var10) {
        assert NIL != inference_datastructures_inference_oc.f25605(var10) : var10;
        module0373.f26440(var10);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28416(final SubLObject var34, final SubLObject var46, final SubLObject var47, final SubLObject var48, final SubLObject var42, final SubLObject var43, final SubLObject var49, final SubLObject var35) {
        final SubLObject var50 = inference_datastructures_inference_oc.f25711(var34, var48);
        inference_datastructures_inference_oc.f25542(var50, var46);
        inference_datastructures_inference_oc.f25541(var50, var47);
        inference_datastructures_inference_oc.f25543(var50, var49);
        inference_datastructures_inference_oc.f25568(var50, var35);
        return f28410(var50, var42, var43);
    }
    
    public static SubLObject f28417(final SubLObject var34, final SubLObject var44, final SubLObject var47, final SubLObject var48, final SubLObject var45, final SubLObject var49, final SubLObject var35) {
        final SubLObject var50 = inference_datastructures_inference_oc.f25711(var34, var48);
        inference_datastructures_inference_oc.f25541(var50, var47);
        inference_datastructures_inference_oc.f25543(var50, var49);
        inference_datastructures_inference_oc.f25568(var50, var35);
        return f28413(var50, var44, var45);
    }
    
    public static SubLObject f28418(final SubLObject var10, final SubLObject var50) {
        final SubLObject var51 = module0360.f23877(var50);
        if (NIL != var50) {
            inference_datastructures_inference_oc.f25554(var10, var51);
        }
        return var10;
    }
    
    public static SubLObject f28419() {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        return $g3306$.getDynamicValue(var8);
    }
    
    public static SubLObject f28411(final SubLObject var10, final SubLObject var42, final SubLObject var43) {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        final SubLObject var46;
        final SubLObject var45 = var46 = inference_datastructures_inference_oc.f25421(var10);
        final SubLObject var47 = module0361.f24117(var46);
        final SubLObject var48 = module0034.$g879$.currentBinding(var44);
        try {
            module0034.$g879$.bind(var47, var44);
            SubLObject var49 = (SubLObject)NIL;
            if (NIL != var47 && NIL == module0034.f1842(var47)) {
                var49 = module0034.f1869(var47);
                final SubLObject var50 = Threads.current_process();
                if (NIL == var49) {
                    module0034.f1873(var47, var50);
                }
                else if (!var49.eql(var50)) {
                    Errors.error((SubLObject)$ic43$);
                }
            }
            try {
                SubLObject var51 = module0361.f24119(var46);
                final SubLObject var55_59 = module0139.$g1632$.currentBinding(var44);
                final SubLObject var52 = module0139.$g1630$.currentBinding(var44);
                final SubLObject var53 = module0139.$g1631$.currentBinding(var44);
                try {
                    module0139.$g1632$.bind(var51, var44);
                    module0139.$g1630$.bind((SubLObject)T, var44);
                    module0139.$g1631$.bind(module0139.f9023(module0139.$g1632$.getDynamicValue(var44)), var44);
                    final SubLObject var55_60 = $g3306$.currentBinding(var44);
                    try {
                        $g3306$.bind((SubLObject)T, var44);
                        final SubLObject var54 = inference_datastructures_inference_oc.f25424(var10);
                        final SubLObject var55 = inference_datastructures_inference_oc.f25423(var10);
                        final SubLObject var56 = inference_datastructures_inference_oc.f25482(var10);
                        var44.resetMultipleValues();
                        final SubLObject var57 = f28420(var54, var55, var56, var43);
                        final SubLObject var58 = var44.secondMultipleValue();
                        final SubLObject var59 = var44.thirdMultipleValue();
                        final SubLObject var60 = var44.fourthMultipleValue();
                        final SubLObject var61 = var44.fifthMultipleValue();
                        var44.resetMultipleValues();
                        if (NIL != var57 && NIL == module0161.f10481(var57)) {
                            inference_datastructures_inference_oc.f25447(var10, (SubLObject)$ic44$);
                        }
                        else if ($ic45$ == var58) {
                            inference_datastructures_inference_oc.f25447(var10, (SubLObject)$ic44$);
                        }
                        else if ($ic46$ == var58) {
                            inference_datastructures_inference_oc.f25447(var10, (SubLObject)$ic46$);
                            inference_datastructures_inference_oc.f25548(var10, $g3304$.getGlobalValue());
                            f28418(var10, var61);
                        }
                        else {
                            inference_datastructures_inference_oc.f25545(var10, var57);
                            inference_datastructures_inference_oc.f25546(var10, var58);
                            inference_datastructures_inference_oc.f25552(var10, var60);
                        }
                        if (NIL != inference_datastructures_inference_oc.f25426(var10)) {
                            var44.resetMultipleValues();
                            final SubLObject var62 = module0370.f25894(var58, var57, var42);
                            final SubLObject var63 = var44.secondMultipleValue();
                            final SubLObject var64 = var44.thirdMultipleValue();
                            var44.resetMultipleValues();
                            if (NIL != module0362.f24446(var62)) {
                                final SubLObject var65 = var62;
                                inference_datastructures_inference_oc.f25548(var10, var65);
                                inference_datastructures_inference_oc.f25547(var10, var63);
                                final SubLObject var66 = module0233.f15362(var63, var64);
                                inference_datastructures_inference_oc.f25551(var10, var66);
                                if (NIL == var56) {
                                    inference_datastructures_inference_oc.f25549(var10, (SubLObject)$ic31$);
                                    inference_datastructures_inference_oc.f25550(var10, (SubLObject)NIL);
                                }
                                else {
                                    var44.resetMultipleValues();
                                    final SubLObject var67 = module0370.f25894(var59, var57, var42);
                                    final SubLObject var68 = var44.secondMultipleValue();
                                    final SubLObject var69 = var44.thirdMultipleValue();
                                    var44.resetMultipleValues();
                                    final SubLObject var70 = var67;
                                    inference_datastructures_inference_oc.f25549(var10, var70);
                                    var44.resetMultipleValues();
                                    final SubLObject var71 = module0370.f25894(var56, var57, var42);
                                    final SubLObject var72 = var44.secondMultipleValue();
                                    final SubLObject var73 = var44.thirdMultipleValue();
                                    var44.resetMultipleValues();
                                    final SubLObject var74 = var71;
                                    final SubLObject var75 = module0233.f15362(var72, var63);
                                    inference_datastructures_inference_oc.f25550(var10, module0233.f15362(var75, var74));
                                }
                            }
                            else if ($ic47$.eql(var62)) {
                                inference_datastructures_inference_oc.f25548(var10, $g3304$.getGlobalValue());
                                inference_datastructures_inference_oc.f25447(var10, (SubLObject)$ic46$);
                            }
                            else if ($ic48$.eql(var62)) {
                                inference_datastructures_inference_oc.f25548(var10, $g3305$.getGlobalValue());
                                inference_datastructures_inference_oc.f25447(var10, (SubLObject)$ic49$);
                            }
                            else if ($ic44$ == var62) {
                                inference_datastructures_inference_oc.f25548(var10, $g3305$.getGlobalValue());
                                inference_datastructures_inference_oc.f25447(var10, (SubLObject)$ic44$);
                            }
                        }
                    }
                    finally {
                        $g3306$.rebind(var55_60, var44);
                    }
                    var51 = module0139.$g1632$.getDynamicValue(var44);
                }
                finally {
                    module0139.$g1631$.rebind(var53, var44);
                    module0139.$g1630$.rebind(var52, var44);
                    module0139.$g1632$.rebind(var55_59, var44);
                }
                module0361.f24120(var46, var51);
            }
            finally {
                final SubLObject var55_61 = Threads.$is_thread_performing_cleanupP$.currentBinding(var44);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var44);
                    if (NIL != var47 && NIL == var49) {
                        module0034.f1873(var47, (SubLObject)NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var55_61, var44);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var48, var44);
        }
        return var10;
    }
    
    public static SubLObject f28420(SubLObject var63, SubLObject var64, final SubLObject var65, final SubLObject var43) {
        final SubLThread var66 = SubLProcess.currentSubLThread();
        var66.resetMultipleValues();
        final SubLObject var82_83 = module0279.f18578(var64, var63);
        final SubLObject var84_85 = var66.secondMultipleValue();
        var66.resetMultipleValues();
        var64 = var82_83;
        var63 = var84_85;
        SubLObject var67 = (SubLObject)NIL;
        SubLObject var68 = (SubLObject)NIL;
        SubLObject var69 = (SubLObject)NIL;
        SubLObject var70 = (SubLObject)NIL;
        SubLObject var71 = (SubLObject)NIL;
        if (NIL == var43) {
            if (NIL == var65) {
                var67 = (SubLObject)((NIL != var63) ? module0162.f10628(var63) : NIL);
                var68 = var64;
                var69 = var64;
                var70 = (SubLObject)NIL;
                var71 = (SubLObject)NIL;
            }
            else {
                var67 = (SubLObject)((NIL != var63) ? module0162.f10628(var63) : NIL);
                var68 = module0202.f12773((SubLObject)ConsesLow.list(var64, var65));
                var69 = var64;
                var70 = (SubLObject)NIL;
                var71 = (SubLObject)NIL;
            }
        }
        else {
            var66.resetMultipleValues();
            final SubLObject var72 = f28421(var64, var63);
            final SubLObject var73 = var66.secondMultipleValue();
            final SubLObject var74 = var66.thirdMultipleValue();
            final SubLObject var75 = var66.fourthMultipleValue();
            var66.resetMultipleValues();
            if (NIL == var73) {
                var67 = (SubLObject)((NIL != var63) ? module0162.f10628(var63) : NIL);
                var68 = (SubLObject)$ic46$;
                var69 = (SubLObject)NIL;
                var70 = (SubLObject)NIL;
                var71 = var75;
            }
            else if (NIL == var65) {
                var67 = var73;
                var68 = var72;
                var69 = var72;
                var70 = var74;
                var71 = (SubLObject)NIL;
            }
            else {
                var67 = var73;
                var68 = module0202.f12773((SubLObject)ConsesLow.list(var72, var65));
                var69 = var72;
                var70 = var74;
                var71 = (SubLObject)NIL;
            }
        }
        return Values.values(var67, var68, var69, var70, var71);
    }
    
    public static SubLObject f28421(SubLObject var90, final SubLObject var47) {
        final SubLThread var91 = SubLProcess.currentSubLThread();
        SubLObject var92 = (SubLObject)$ic45$;
        SubLObject var93 = var47;
        SubLObject var94 = (SubLObject)NIL;
        SubLObject var95 = (SubLObject)NIL;
        var90 = f28422(var90);
        if (NIL != module0202.f12597(var90)) {
            final SubLObject var96 = module0205.f13203(var90, (SubLObject)UNPROVIDED);
            final SubLObject var97 = module0205.f13204(var90, (SubLObject)UNPROVIDED);
            var91.resetMultipleValues();
            final SubLObject var98 = module0541.f33577(var96, var97, var47);
            final SubLObject var99 = var91.secondMultipleValue();
            final SubLObject var100 = var91.thirdMultipleValue();
            final SubLObject var101 = var91.fourthMultipleValue();
            var91.resetMultipleValues();
            var92 = var98;
            var93 = var99;
            var94 = var100;
            var95 = var101;
        }
        return Values.values(var92, var93, var94, var95);
    }
    
    public static SubLObject f28423(final SubLObject var98) {
        return (SubLObject)makeBoolean(NIL != module0207.f13509(var98) && NIL != module0202.f12597(f28422(var98)));
    }
    
    public static SubLObject f28422(final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        SubLObject var101 = (SubLObject)NIL;
        final SubLObject var102 = module0146.$g2055$.currentBinding(var100);
        final SubLObject var103 = module0146.$g2056$.currentBinding(var100);
        try {
            module0146.$g2055$.bind((SubLObject)NIL, var100);
            module0146.$g2056$.bind((SubLObject)NIL, var100);
            var101 = module0276.f18302(var99, (SubLObject)UNPROVIDED);
        }
        finally {
            module0146.$g2056$.rebind(var103, var100);
            module0146.$g2055$.rebind(var102, var100);
        }
        return var101;
    }
    
    public static SubLObject f28414(final SubLObject var10, final SubLObject var101, final SubLObject var45) {
        final SubLThread var102 = SubLProcess.currentSubLThread();
        assert NIL != module0232.f15321(var101) : var101;
        assert NIL != Types.listp(var45) : var45;
        final SubLObject var103 = inference_datastructures_inference_oc.f25424(var10);
        final SubLObject var104 = inference_datastructures_inference_oc.f25482(var10);
        SubLObject var105 = var101;
        inference_datastructures_inference_oc.f25545(var10, var103);
        inference_datastructures_inference_oc.f25552(var10, (SubLObject)NIL);
        if (NIL != var104) {
            final SubLObject var106 = module0282.f18727(var104);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var102) && NIL == module0035.f1997(var106)) {
                Errors.error((SubLObject)$ic52$);
            }
            final SubLObject var107 = var106.first();
            inference_datastructures_inference_oc.f25550(var10, module0370.f25906(var107, var103));
            var105 = module0377.f26813(module0202.f12765(var101), var107);
        }
        inference_datastructures_inference_oc.f25546(var10, (SubLObject)NIL);
        inference_datastructures_inference_oc.f25547(var10, (SubLObject)NIL);
        if (NIL != module0232.f15316(var105)) {
            inference_datastructures_inference_oc.f25548(var10, $g3304$.getGlobalValue());
            inference_datastructures_inference_oc.f25447(var10, (SubLObject)$ic46$);
        }
        else {
            final SubLObject var108 = module0370.f25906(var105, var103);
            inference_datastructures_inference_oc.f25548(var10, var108);
            final SubLObject var109 = module0035.f2399(var105, (SubLObject)$ic53$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var110 = module0035.f2220(var109, var45, (SubLObject)UNPROVIDED);
            inference_datastructures_inference_oc.f25551(var10, var110);
            if (NIL == var104) {
                inference_datastructures_inference_oc.f25549(var10, (SubLObject)$ic31$);
            }
            else {
                final SubLObject var111 = module0370.f25906(var101, var103);
                inference_datastructures_inference_oc.f25549(var10, var111);
            }
        }
        return var10;
    }
    
    public static SubLObject f28424(final SubLObject var10) {
        if (NIL != inference_datastructures_inference_oc.f25605(var10)) {
            return module0387.f27559(inference_datastructures_inference_oc.f25606(var10));
        }
        Errors.error((SubLObject)$ic54$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28425(final SubLObject var10, final SubLObject var107) {
        assert NIL != inference_datastructures_inference_oc.f25431(var10) : var10;
        assert NIL != module0360.f23804(var107) : var107;
        if (NIL != f28426(var10, var107)) {
            assert NIL != inference_datastructures_inference_oc.f25605(var10) : var10;
            final SubLObject var108 = inference_datastructures_inference_oc.f25606(var10);
            module0387.f27557(var108);
        }
        final SubLObject var109 = module0360.f23844(var107);
        f28427(var10, var109);
        final SubLObject var110 = module0077.f5333(inference_datastructures_inference_oc.f25496(var10));
        SubLObject var111;
        SubLObject var112;
        SubLObject var113;
        for (var111 = module0032.f1741(var110), var112 = (SubLObject)NIL, var112 = module0032.f1742(var111, var110); NIL == module0032.f1744(var111, var112); var112 = module0032.f1743(var112)) {
            var113 = module0032.f1745(var111, var112);
            if (NIL != module0032.f1746(var112, var113) && NIL != module0363.f24504(var113)) {
                module0367.f25234(var113);
                module0367.f25238(var113);
                module0367.f25235(var113);
                module0367.f25240(var113);
            }
        }
        inference_datastructures_inference_oc.f25447(var10, (SubLObject)$ic57$);
        return var10;
    }
    
    public static SubLObject f28426(final SubLObject var10, final SubLObject var107) {
        final SubLObject var108 = module0360.f23844(var107);
        final SubLObject var109 = inference_datastructures_inference_oc.f25522(var10);
        final SubLObject var110 = module0360.f23839(var108);
        if (NIL != f28428(var109, var110)) {
            return (SubLObject)T;
        }
        final SubLObject var111 = inference_datastructures_inference_oc.f25523(var10);
        final SubLObject var112 = module0360.f23840(var108);
        if (NIL != f28428(var111, var112)) {
            return (SubLObject)T;
        }
        final SubLObject var113 = inference_datastructures_inference_oc.f25524(var10);
        final SubLObject var114 = module0360.f23841(var108);
        if (var113.numG(var114)) {
            return (SubLObject)T;
        }
        final SubLObject var115 = module0360.f23853(var107);
        final SubLObject var116 = inference_datastructures_inference_oc.f25606(var10);
        final SubLObject var117 = module0367.f25061(var116);
        final SubLObject var118 = module0360.f23854(var115);
        if (NIL != module0360.f23940(var117, var118)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28428(final SubLObject var123, final SubLObject var124) {
        if (!var123.isInteger()) {
            return (SubLObject)NIL;
        }
        if (var124.isInteger()) {
            return Numbers.numL(var123, var124);
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f28427(final SubLObject var10, final SubLObject var125) {
        assert NIL != module0360.f23843(var125) : var125;
        final SubLObject var126 = module0360.f23960(var125);
        final SubLObject var127 = module0360.f23965(var125);
        final SubLObject var128 = module0360.f23980(var125);
        final SubLObject var129 = module0360.f23981(var125);
        final SubLObject var130 = module0360.f23982(var125);
        final SubLObject var131 = module0360.f23983(var125);
        final SubLObject var132 = module0360.f23834(var125);
        final SubLObject var133 = module0360.f23835(var125);
        final SubLObject var134 = module0360.f23836(var125);
        final SubLObject var135 = module0360.f23837(var125);
        final SubLObject var136 = module0360.f23838(var125);
        final SubLObject var137 = f28429(var10, var125);
        final SubLObject var138 = module0360.f23840(var125);
        final SubLObject var139 = module0360.f23841(var125);
        final SubLObject var140 = module0360.f23842(var125);
        final SubLObject var141 = module0360.f23845(var125);
        inference_datastructures_inference_oc.f25452(var10, var130);
        inference_datastructures_inference_oc.f25453(var10, var129);
        inference_datastructures_inference_oc.f25569(var10, var126);
        inference_datastructures_inference_oc.f25449(var10, var127);
        inference_datastructures_inference_oc.f25451(var10, var128);
        if (NIL != var131) {
            inference_datastructures_inference_oc.f25570(var10);
        }
        inference_datastructures_inference_oc.f25454(var10, var132);
        inference_datastructures_inference_oc.f25455(var10, var133);
        inference_datastructures_inference_oc.f25456(var10, var134);
        inference_datastructures_inference_oc.f25457(var10, var135);
        inference_datastructures_inference_oc.f25458(var10, var136);
        inference_datastructures_inference_oc.f25462(var10, var137);
        inference_datastructures_inference_oc.f25463(var10, var138);
        inference_datastructures_inference_oc.f25464(var10, var139);
        inference_datastructures_inference_oc.f25465(var10, var140);
        inference_datastructures_inference_oc.f25466(var10, var141);
        return var10;
    }
    
    public static SubLObject f28429(final SubLObject var10, final SubLObject var125) {
        SubLObject var126 = module0360.f23839(var125);
        final SubLObject var127 = module0360.f23837(var125);
        if ($ic28$ != var127) {
            final SubLObject var128 = conses_high.getf(module0412.f28715(var127), (SubLObject)$ic59$, (SubLObject)UNPROVIDED);
            if (var126.eql(var128)) {
                final SubLObject var129 = module0363.f24561(inference_datastructures_inference_oc.f25487(var10), (SubLObject)UNPROVIDED);
                if (var126.isInteger() && var126.numL(var129)) {
                    var126 = var129;
                }
            }
        }
        return var126;
    }
    
    public static SubLObject f28430(final SubLObject var10) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_inference_oc.f25428(var10) : var10;
        assert NIL != inference_datastructures_inference_oc.f25605(var10) : var10;
        module0414.f28988(var10);
        inference_datastructures_inference_oc.f25693(var10);
        inference_datastructures_inference_oc.f25700(var10);
        SubLObject var12 = module0360.f23875((SubLObject)$ic61$);
        try {
            SubLObject var13 = (SubLObject)NIL;
            try {
                var11.throwStack.push($ic4$);
                final SubLObject var14 = $g3302$.currentBinding(var11);
                try {
                    $g3302$.bind((SubLObject)T, var11);
                    SubLObject var15 = (SubLObject)NIL;
                    if (NIL != module0018.$g629$.getDynamicValue(var11)) {
                        inference_datastructures_inference_oc.f25447(var10, (SubLObject)$ic62$);
                        var12 = f28431(var10);
                    }
                    else {
                        try {
                            var11.throwStack.push($ic17$);
                            final SubLObject var55_143 = Errors.$error_handler$.currentBinding(var11);
                            try {
                                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic63$), var11);
                                try {
                                    inference_datastructures_inference_oc.f25447(var10, (SubLObject)$ic62$);
                                    var12 = f28431(var10);
                                }
                                catch (Throwable var16) {
                                    Errors.handleThrowable(var16, (SubLObject)NIL);
                                }
                            }
                            finally {
                                Errors.$error_handler$.rebind(var55_143, var11);
                            }
                        }
                        catch (Throwable var17) {
                            var15 = Errors.handleThrowable(var17, (SubLObject)$ic17$);
                        }
                        finally {
                            var11.throwStack.pop();
                        }
                    }
                    if (NIL != var15) {
                        var12 = module0360.f23875(var15);
                    }
                }
                finally {
                    $g3302$.rebind(var14, var11);
                }
            }
            catch (Throwable var18) {
                var13 = Errors.handleThrowable(var18, (SubLObject)$ic4$);
            }
            finally {
                var11.throwStack.pop();
            }
            if (NIL != var13) {
                var12 = (SubLObject)$ic64$;
                f28396();
            }
        }
        finally {
            final SubLObject var19 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var11);
                if (NIL != inference_datastructures_inference_oc.f25417(var10)) {
                    f28432(var10, var12);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var19, var11);
            }
        }
        return var10;
    }
    
    public static SubLObject f28432(final SubLObject var10, final SubLObject var51) {
        inference_datastructures_inference_oc.f25701(var10);
        inference_datastructures_inference_oc.f25554(var10, var51);
        inference_datastructures_inference_oc.f25447(var10, (SubLObject)$ic65$);
        inference_datastructures_inference_oc.f25448(var10);
        return var10;
    }
    
    public static SubLObject f28433(final SubLObject var10) {
        return f28432(var10, (SubLObject)$ic66$);
    }
    
    public static SubLObject f28434(final SubLObject var10) {
        return f28432(var10, (SubLObject)$ic67$);
    }
    
    public static SubLObject f28435(final SubLObject var10) {
        return f28432(var10, (SubLObject)$ic68$);
    }
    
    public static SubLObject f28436(final SubLObject var10) {
        return f28432(var10, (SubLObject)$ic69$);
    }
    
    public static SubLObject f28437(final SubLObject var10) {
        return f28432(var10, (SubLObject)$ic70$);
    }
    
    public static SubLObject f28400(final SubLObject var10, SubLObject var9) {
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        enforceType(var10, $ic71$);
        if (NIL == Threads.valid_process_p(inference_datastructures_inference_oc.f25497(var10))) {
            final SubLObject var12 = (SubLObject)$ic72$;
            f28432(var10, module0360.f23875(var12));
            return var10;
        }
        if (NIL == var9) {
            return f28438(var10);
        }
        if (var9.isZero()) {
            return f28439(var10);
        }
        assert NIL != module0048.f3293(var9) : var9;
        SubLObject var13 = (SubLObject)NIL;
        final SubLObject var14 = module0003.f61();
        try {
            var11.throwStack.push(var14);
            final SubLObject var15 = module0003.$g4$.currentBinding(var11);
            try {
                module0003.$g4$.bind((SubLObject)T, var11);
                SubLObject var16 = (SubLObject)NIL;
                try {
                    final SubLObject var55_149 = module0003.$g5$.currentBinding(var11);
                    try {
                        module0003.$g5$.bind(Numbers.add((SubLObject)ONE_INTEGER, module0003.$g5$.getDynamicValue(var11)), var11);
                        var16 = module0003.f62(var9, var14);
                        f28438(var10);
                    }
                    finally {
                        module0003.$g5$.rebind(var55_149, var11);
                    }
                }
                finally {
                    final SubLObject var55_150 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var11);
                        module0003.f64(var16);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var55_150, var11);
                    }
                }
            }
            finally {
                module0003.$g4$.rebind(var15, var11);
            }
        }
        catch (Throwable var17) {
            var13 = Errors.handleThrowable(var17, var14);
        }
        finally {
            var11.throwStack.pop();
        }
        if (NIL != var13) {
            f28439(var10);
        }
        return var10;
    }
    
    public static SubLObject f28438(final SubLObject var10) {
        inference_datastructures_inference_oc.f25707(var10);
        Threads.process_block();
        return var10;
    }
    
    public static SubLObject f28440(final SubLObject var10) {
        return f28400(var10, (SubLObject)ZERO_INTEGER);
    }
    
    public static SubLObject f28441(final SubLObject var10, SubLObject var151) {
        if (var151 == UNPROVIDED) {
            var151 = (SubLObject)ZERO_INTEGER;
        }
        if (var151.isPositive()) {
            Threads.sleep(var151);
        }
        return f28440(var10);
    }
    
    public static SubLObject f28442(final SubLObject var10) {
        if (NIL != inference_datastructures_inference_oc.f25429(var10)) {
            return f28440(var10);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28397() {
        final SubLObject var10 = module0339.f22757();
        if (NIL != inference_datastructures_inference_oc.f25429(var10)) {
            return f28440(var10);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28439(final SubLObject var10) {
        try {
            final SubLObject var11 = inference_datastructures_inference_oc.f25497(var10);
            if (NIL != Types.processp(var11)) {
                Threads.interrupt_process(var11, (SubLObject)$ic74$);
            }
        }
        finally {
            final SubLObject var12 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                inference_datastructures_inference_oc.f25708(var10);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var12);
            }
        }
        return var10;
    }
    
    public static SubLObject f28443() {
        Threads.process_block();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28444(final SubLObject var10) {
        final SubLObject var11 = inference_datastructures_inference_oc.f25497(var10);
        if (NIL != Threads.valid_process_p(var11)) {
            Threads.process_unblock(var11);
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28445(final SubLObject var10) {
        if (NIL != inference_datastructures_inference_oc.f25275(var10)) {
            inference_datastructures_inference_oc.f25467(var10);
            final SubLObject var11 = inference_datastructures_inference_oc.f25497(var10);
            if (NIL != Threads.valid_process_p(var11)) {
                Threads.process_unblock(var11);
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28446(final SubLObject var10) {
        final SubLObject var11 = inference_datastructures_inference_oc.f25521(var10);
        if (NIL != var11) {
            final SubLObject var12 = inference_datastructures_inference_oc.f25666(var10);
            if (var12.numGE(var11)) {
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28447(final SubLObject var10) {
        final SubLObject var11 = inference_datastructures_inference_oc.f25529(var10);
        if (NIL != var11) {
            return Time.internal_real_time_has_arrivedP(var11);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28448() {
        final SubLObject var10 = module0339.f22757();
        if (NIL != var10 && NIL != f28447(var10)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28449() {
        final SubLObject var10 = module0339.f22757();
        return (SubLObject)((NIL != var10) ? inference_datastructures_inference_oc.f25705(var10, (SubLObject)T) : NIL);
    }
    
    public static SubLObject f28450(final SubLObject var10) {
        final SubLObject var11 = inference_datastructures_inference_oc.f25518(var10);
        if (NIL != var11) {
            final SubLObject var12 = inference_datastructures_inference_oc.f25532(var10);
            return Numbers.numGE(var12, var11);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28451(final SubLObject var10) {
        return module0361.f24231(inference_datastructures_inference_oc.f25421(var10));
    }
    
    public static SubLObject f28452(final SubLObject var10) {
        return module0361.f24232(inference_datastructures_inference_oc.f25421(var10));
    }
    
    public static SubLObject f28453(final SubLObject var10) {
        return module0361.f24235(inference_datastructures_inference_oc.f25421(var10));
    }
    
    public static SubLObject f28454(final SubLObject var10) {
        if (inference_datastructures_inference_oc.f25653(var10).isZero()) {
            final SubLObject var11 = inference_datastructures_inference_oc.f25530(var10);
            if (NIL != module0051.f3568(var11)) {
                return Time.internal_real_time_has_arrivedP(var11);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28455(final SubLObject var10) {
        return module0360.f23976(inference_datastructures_inference_oc.f25433(var10));
    }
    
    public static SubLObject f28456(final SubLObject var10) {
        if (NIL != inference_datastructures_inference_oc.f25660(var10)) {
            return (SubLObject)$ic75$;
        }
        if (NIL != f28446(var10)) {
            return (SubLObject)$ic67$;
        }
        if (NIL != f28447(var10)) {
            return (SubLObject)$ic68$;
        }
        if (NIL != f28450(var10)) {
            return (SubLObject)$ic69$;
        }
        if (NIL != f28451(var10)) {
            return (SubLObject)$ic66$;
        }
        if (NIL != f28452(var10)) {
            return (SubLObject)$ic76$;
        }
        if (NIL != f28454(var10)) {
            return (SubLObject)$ic70$;
        }
        if (NIL != f28455(var10)) {
            return inference_datastructures_inference_oc.f25433(var10);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28457(final SubLObject var99, final SubLObject var47, final SubLObject var157) {
        return f28458(var157);
    }
    
    public static SubLObject f28459(final SubLObject var44, final SubLObject var47, final SubLObject var157) {
        return f28458(var157);
    }
    
    public static SubLObject f28458(final SubLObject var157) {
        final SubLThread var158 = SubLProcess.currentSubLThread();
        if (NIL != f28460(var157)) {
            return $g3309$.getDynamicValue(var158);
        }
        if (NIL != module0360.f23901(var157)) {
            return module0392.$g3281$.getDynamicValue(var158);
        }
        if (NIL != module0360.f23918(var157)) {
            return $g3307$.getDynamicValue(var158);
        }
        return $g3308$.getDynamicValue(var158);
    }
    
    public static SubLObject f28460(final SubLObject var157) {
        final SubLObject var158 = module0360.f23822(var157);
        if (NIL != var158 && NIL != module0361.f24174(var158)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28461(final SubLObject var10) {
        final SubLObject var11 = inference_datastructures_inference_oc.f25421(var10);
        return (SubLObject)makeBoolean(NIL != module0361.f24164(var11) && !ZERO_INTEGER.eql(inference_datastructures_inference_oc.f25523(var10)));
    }
    
    public static SubLObject f28462(final SubLObject var10) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        return (SubLObject)((NIL != inference_datastructures_inference_oc.f25669(var10)) ? module0392.$g3281$.getDynamicValue(var11) : $ic77$);
    }
    
    public static SubLObject f28463(final SubLObject var10) {
        assert NIL != inference_datastructures_inference_oc.f25605(var10) : var10;
        final SubLObject var11 = f28462(var10);
        if (!var11.eql(module0367.f25035(inference_datastructures_inference_oc.f25606(var10)))) {
            f28464(var10, var11);
        }
        return var10;
    }
    
    public static SubLObject f28464(final SubLObject var10, final SubLObject var159) {
        assert NIL != inference_datastructures_inference_oc.f25605(var10) : var10;
        return var10;
    }
    
    public static SubLObject f28431(final SubLObject var10) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_inference_oc.f25605(var10) : var10;
        final SubLObject var12 = inference_datastructures_inference_oc.f25606(var10);
        final SubLObject var13 = inference_datastructures_inference_oc.f25421(var10);
        final SubLObject var14 = f28405(var10);
        SubLObject var15 = (SubLObject)NIL;
        final SubLObject var16 = module0413.f28830(var10);
        final SubLObject var17 = module0159.$g2140$.getDynamicValue(var11);
        final SubLObject var18 = module0159.$g2141$.getDynamicValue(var11);
        final SubLObject var19 = module0159.$g2142$.getDynamicValue(var11);
        final SubLObject var20 = module0159.$g2138$.getDynamicValue(var11);
        final SubLObject var21 = module0159.$g2137$.getDynamicValue(var11);
        SubLObject var22 = (SubLObject)NIL;
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var24 = (SubLObject)NIL;
        final SubLObject var25 = module0159.$g2140$.currentBinding(var11);
        final SubLObject var26 = module0159.$g2141$.currentBinding(var11);
        final SubLObject var27 = module0159.$g2142$.currentBinding(var11);
        final SubLObject var28 = module0159.$g2138$.currentBinding(var11);
        final SubLObject var29 = module0159.$g2137$.currentBinding(var11);
        try {
            module0159.$g2140$.bind((NIL != var16) ? module0077.f5313((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : var17, var11);
            module0159.$g2141$.bind((NIL != var16) ? module0077.f5313((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : var18, var11);
            module0159.$g2142$.bind((NIL != var16) ? module0077.f5313((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : var19, var11);
            module0159.$g2138$.bind((SubLObject)((NIL != var16) ? T : var20), var11);
            module0159.$g2137$.bind((SubLObject)((NIL != var16) ? T : var21), var11);
            final SubLObject var30 = var14;
            if (NIL != var30) {
                SubLObject var31 = (SubLObject)NIL;
                final SubLObject var32 = module0003.f61();
                try {
                    var11.throwStack.push(var32);
                    final SubLObject var55_174 = module0003.$g4$.currentBinding(var11);
                    try {
                        module0003.$g4$.bind((SubLObject)T, var11);
                        SubLObject var33 = (SubLObject)NIL;
                        try {
                            final SubLObject var55_175 = module0003.$g5$.currentBinding(var11);
                            try {
                                module0003.$g5$.bind(Numbers.add((SubLObject)ONE_INTEGER, module0003.$g5$.getDynamicValue(var11)), var11);
                                var33 = module0003.f62(var30, var32);
                                final SubLObject var34 = var13;
                                final SubLObject var35 = module0361.f24117(var34);
                                final SubLObject var55_176 = module0034.$g879$.currentBinding(var11);
                                try {
                                    module0034.$g879$.bind(var35, var11);
                                    SubLObject var36 = (SubLObject)NIL;
                                    if (NIL != var35 && NIL == module0034.f1842(var35)) {
                                        var36 = module0034.f1869(var35);
                                        final SubLObject var37 = Threads.current_process();
                                        if (NIL == var36) {
                                            module0034.f1873(var35, var37);
                                        }
                                        else if (!var36.eql(var37)) {
                                            Errors.error((SubLObject)$ic43$);
                                        }
                                    }
                                    try {
                                        SubLObject var38 = module0361.f24119(var34);
                                        final SubLObject var55_177 = module0139.$g1632$.currentBinding(var11);
                                        final SubLObject var60_178 = module0139.$g1630$.currentBinding(var11);
                                        final SubLObject var61_179 = module0139.$g1631$.currentBinding(var11);
                                        try {
                                            module0139.$g1632$.bind(var38, var11);
                                            module0139.$g1630$.bind((SubLObject)T, var11);
                                            module0139.$g1631$.bind(module0139.f9023(module0139.$g1632$.getDynamicValue(var11)), var11);
                                            final SubLObject var55_178 = module0361.$g3113$.currentBinding(var11);
                                            final SubLObject var60_179 = $g3301$.currentBinding(var11);
                                            try {
                                                module0361.$g3113$.bind((SubLObject)T, var11);
                                                $g3301$.bind(f28465(), var11);
                                                f28466(var10);
                                                SubLObject var40;
                                                SubLObject var39;
                                                for (var39 = (var40 = (SubLObject)NIL); NIL == var40; var40 = (SubLObject)makeBoolean(NIL != var39 || NIL != f28469(var10))) {
                                                    f28467(var10);
                                                    module0387.f27467(var12);
                                                    f28468(var10);
                                                }
                                                module0387.f27515(var12);
                                                var15 = f28470(var10, var39);
                                                if ($ic75$ == var15) {
                                                    inference_datastructures_inference_oc.f25708(var10);
                                                }
                                            }
                                            finally {
                                                $g3301$.rebind(var60_179, var11);
                                                module0361.$g3113$.rebind(var55_178, var11);
                                            }
                                            var38 = module0139.$g1632$.getDynamicValue(var11);
                                        }
                                        finally {
                                            module0139.$g1631$.rebind(var61_179, var11);
                                            module0139.$g1630$.rebind(var60_178, var11);
                                            module0139.$g1632$.rebind(var55_177, var11);
                                        }
                                        module0361.f24120(var34, var38);
                                    }
                                    finally {
                                        final SubLObject var55_179 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var11);
                                            if (NIL != var35 && NIL == var36) {
                                                module0034.f1873(var35, (SubLObject)NIL);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var55_179, var11);
                                        }
                                    }
                                }
                                finally {
                                    module0034.$g879$.rebind(var55_176, var11);
                                }
                            }
                            finally {
                                module0003.$g5$.rebind(var55_175, var11);
                            }
                        }
                        finally {
                            final SubLObject var55_180 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var11);
                                module0003.f64(var33);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var55_180, var11);
                            }
                        }
                    }
                    finally {
                        module0003.$g4$.rebind(var55_174, var11);
                    }
                }
                catch (Throwable var41) {
                    var31 = Errors.handleThrowable(var41, var32);
                }
                finally {
                    var11.throwStack.pop();
                }
                if (NIL != var31) {
                    var15 = (SubLObject)$ic68$;
                }
            }
            else {
                final SubLObject var42 = var13;
                final SubLObject var43 = module0361.f24117(var42);
                final SubLObject var55_181 = module0034.$g879$.currentBinding(var11);
                try {
                    module0034.$g879$.bind(var43, var11);
                    SubLObject var44 = (SubLObject)NIL;
                    if (NIL != var43 && NIL == module0034.f1842(var43)) {
                        var44 = module0034.f1869(var43);
                        final SubLObject var45 = Threads.current_process();
                        if (NIL == var44) {
                            module0034.f1873(var43, var45);
                        }
                        else if (!var44.eql(var45)) {
                            Errors.error((SubLObject)$ic43$);
                        }
                    }
                    try {
                        SubLObject var46 = module0361.f24119(var42);
                        final SubLObject var55_182 = module0139.$g1632$.currentBinding(var11);
                        final SubLObject var60_180 = module0139.$g1630$.currentBinding(var11);
                        final SubLObject var61_180 = module0139.$g1631$.currentBinding(var11);
                        try {
                            module0139.$g1632$.bind(var46, var11);
                            module0139.$g1630$.bind((SubLObject)T, var11);
                            module0139.$g1631$.bind(module0139.f9023(module0139.$g1632$.getDynamicValue(var11)), var11);
                            final SubLObject var55_183 = module0361.$g3113$.currentBinding(var11);
                            final SubLObject var60_181 = $g3301$.currentBinding(var11);
                            try {
                                module0361.$g3113$.bind((SubLObject)T, var11);
                                $g3301$.bind(f28465(), var11);
                                f28466(var10);
                                SubLObject var48;
                                SubLObject var47;
                                for (var47 = (var48 = (SubLObject)NIL); NIL == var48; var48 = (SubLObject)makeBoolean(NIL != var47 || NIL != f28469(var10))) {
                                    f28467(var10);
                                    module0387.f27467(var12);
                                    f28468(var10);
                                }
                                module0387.f27515(var12);
                                var15 = f28470(var10, var47);
                                if ($ic75$ == var15) {
                                    inference_datastructures_inference_oc.f25708(var10);
                                }
                            }
                            finally {
                                $g3301$.rebind(var60_181, var11);
                                module0361.$g3113$.rebind(var55_183, var11);
                            }
                            var46 = module0139.$g1632$.getDynamicValue(var11);
                        }
                        finally {
                            module0139.$g1631$.rebind(var61_180, var11);
                            module0139.$g1630$.rebind(var60_180, var11);
                            module0139.$g1632$.rebind(var55_182, var11);
                        }
                        module0361.f24120(var42, var46);
                    }
                    finally {
                        final SubLObject var55_184 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var11);
                            if (NIL != var43 && NIL == var44) {
                                module0034.f1873(var43, (SubLObject)NIL);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var55_184, var11);
                        }
                    }
                }
                finally {
                    module0034.$g879$.rebind(var55_181, var11);
                }
            }
            var22 = module0159.$g2140$.getDynamicValue(var11);
            var23 = module0159.$g2141$.getDynamicValue(var11);
            var24 = module0159.$g2142$.getDynamicValue(var11);
        }
        finally {
            module0159.$g2137$.rebind(var29, var11);
            module0159.$g2138$.rebind(var28, var11);
            module0159.$g2142$.rebind(var27, var11);
            module0159.$g2141$.rebind(var26, var11);
            module0159.$g2140$.rebind(var25, var11);
        }
        if (NIL != var17) {
            module0159.$g2140$.setDynamicValue((NIL != var16) ? module0078.f5377(var17, var22) : var22, var11);
        }
        if (NIL != var18) {
            module0159.$g2141$.setDynamicValue((NIL != var16) ? module0078.f5377(var18, var23) : var23, var11);
        }
        if (NIL != var19) {
            module0159.$g2142$.setDynamicValue((NIL != var16) ? module0078.f5377(var19, var24) : var24, var11);
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var11) && $ic79$ == var15 && NIL == inference_datastructures_inference_oc.f25432(var10)) {
            Errors.error((SubLObject)$ic80$);
        }
        return var15;
    }
    
    public static SubLObject f28465() {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        if (NIL != Types.booleanp($g3301$.getDynamicValue(var8))) {
            return $g3301$.getDynamicValue(var8);
        }
        return Functions.funcall((SubLObject)makeSymbol("S#31511", "CYC"));
    }
    
    public static SubLObject f28466(final SubLObject var10) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var12 = inference_datastructures_inference_oc.f25520(var10);
        final SubLObject var13 = inference_datastructures_inference_oc.f25484(var10);
        if (var12.isInteger() && var12.numG((SubLObject)ZERO_INTEGER)) {
            if (NIL == module0368.f25251(inference_datastructures_inference_oc.f25481(var10))) {
                inference_datastructures_inference_oc.f25540(var10, module0368.f25261(var13));
            }
            final SubLObject var15;
            final SubLObject var14 = var15 = inference_datastructures_inference_oc.f25421(var10);
            final SubLObject var16 = module0361.f24117(var15);
            final SubLObject var17 = module0034.$g879$.currentBinding(var11);
            try {
                module0034.$g879$.bind(var16, var11);
                SubLObject var18 = (SubLObject)NIL;
                if (NIL != var16 && NIL == module0034.f1842(var16)) {
                    var18 = module0034.f1869(var16);
                    final SubLObject var19 = Threads.current_process();
                    if (NIL == var18) {
                        module0034.f1873(var16, var19);
                    }
                    else if (!var18.eql(var19)) {
                        Errors.error((SubLObject)$ic43$);
                    }
                }
                try {
                    SubLObject var20 = module0361.f24119(var15);
                    final SubLObject var55_193 = module0139.$g1632$.currentBinding(var11);
                    final SubLObject var21 = module0139.$g1630$.currentBinding(var11);
                    final SubLObject var22 = module0139.$g1631$.currentBinding(var11);
                    try {
                        module0139.$g1632$.bind(var20, var11);
                        module0139.$g1630$.bind((SubLObject)T, var11);
                        module0139.$g1631$.bind(module0139.f9023(module0139.$g1632$.getDynamicValue(var11)), var11);
                        module0531.f33176(inference_datastructures_inference_oc.f25481(var10), var13, (SubLObject)NIL, var12, (SubLObject)NIL);
                        var20 = module0139.$g1632$.getDynamicValue(var11);
                    }
                    finally {
                        module0139.$g1631$.rebind(var22, var11);
                        module0139.$g1630$.rebind(var21, var11);
                        module0139.$g1632$.rebind(var55_193, var11);
                    }
                    module0361.f24120(var15, var20);
                }
                finally {
                    final SubLObject var55_194 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var11);
                        if (NIL != var16 && NIL == var18) {
                            module0034.f1873(var16, (SubLObject)NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var55_194, var11);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var17, var11);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28469(final SubLObject var10) {
        if (NIL != f28471(var10)) {
            return (SubLObject)T;
        }
        return module0035.sublisp_boolean(f28456(var10));
    }
    
    public static SubLObject f28467(final SubLObject var10) {
        if (NIL != inference_datastructures_inference_oc.f25502(var10)) {
            f28443();
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28468(final SubLObject var10) {
        if (NIL != f28451(var10) || NIL != f28452(var10) || NIL != f28472(var10)) {
            if (NIL != f28453(var10)) {
                final SubLObject var11 = inference_datastructures_inference_oc.f25421(var10);
                Errors.error((SubLObject)$ic81$, module0361.f24228(var11), var11);
            }
            final SubLObject var12 = inference_datastructures_inference_oc.f25606(var10);
            return module0387.f27473(var12);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28472(final SubLObject var10) {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28470(final SubLObject var10, final SubLObject var182) {
        if (NIL != var182) {
            return (SubLObject)$ic70$;
        }
        final SubLObject var183 = f28456(var10);
        if (NIL != var183) {
            return var183;
        }
        if (NIL == f28471(var10)) {
            return (SubLObject)NIL;
        }
        if (NIL != f28473(var10)) {
            return (SubLObject)$ic79$;
        }
        return (SubLObject)$ic82$;
    }
    
    public static SubLObject f28473(final SubLObject var10) {
        final SubLObject var11 = inference_datastructures_inference_oc.f25606(var10);
        return module0387.f27518(var11);
    }
    
    public static SubLObject f28471(final SubLObject var10) {
        final SubLObject var11 = inference_datastructures_inference_oc.f25606(var10);
        return module0387.f27469(var11);
    }
    
    public static SubLObject f28474(final SubLObject var10) {
        return (SubLObject)makeBoolean(NIL != f28471(var10) && NIL == f28473(var10));
    }
    
    public static SubLObject f28475(final SubLObject var10, final SubLObject var195) {
        if (NIL == f28476(var10, var195)) {}
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28477(final SubLObject var10) {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28476(final SubLObject var10, final SubLObject var195) {
        final SubLThread var196 = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_inference_oc.f25275(var10) : var10;
        assert NIL != module0366.f24916(var195) : var195;
        module0373.f26272(var195, var10);
        if (NIL != module0366.f24983(var195)) {
            final SubLObject var197 = f28478(var195, var10);
            if (NIL == f28479(var10, var197)) {
                SubLObject var198 = (SubLObject)NIL;
                if (NIL != inference_datastructures_inference_oc.f25600(var10)) {
                    var196.resetMultipleValues();
                    final SubLObject var199 = f28480(var10, var195);
                    final SubLObject var200 = var196.secondMultipleValue();
                    var196.resetMultipleValues();
                    final SubLObject var201 = inference_datastructures_inference_oc.f25779(var10, var197, var199, var200);
                    var198 = inference_datastructures_inference_oc.f25782(var201);
                    inference_datastructures_inference_oc.f25794(var201, var195);
                }
                else {
                    var198 = inference_datastructures_inference_oc.f25739(var10, var197);
                }
                f28481(var198, var195);
                module0373.f26245(var195);
                return var198;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28479(final SubLObject var10, final SubLObject var196) {
        if (NIL == inference_datastructures_inference_oc.f25508(var10) && NIL != f28482(var196)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28483(final SubLObject var10, final SubLObject var195) {
        final SubLObject var196 = f28478(var195, var10);
        return f28479(var10, var196);
    }
    
    public static SubLObject f28482(final SubLObject var196) {
        SubLObject var197 = var196;
        SubLObject var198 = (SubLObject)NIL;
        var198 = var197.first();
        while (NIL != var197) {
            SubLObject var200;
            final SubLObject var199 = var200 = var198;
            SubLObject var201 = (SubLObject)NIL;
            SubLObject var202 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var200, var199, (SubLObject)$ic84$);
            var201 = var200.first();
            var200 = (var202 = var200.rest());
            if (NIL != module0349.f23399(var202)) {
                return (SubLObject)T;
            }
            var197 = var197.rest();
            var198 = var197.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28484(final SubLObject var196) {
        SubLObject var197 = var196;
        SubLObject var198 = (SubLObject)NIL;
        var198 = var197.first();
        while (NIL != var197) {
            SubLObject var200;
            final SubLObject var199 = var200 = var198;
            SubLObject var201 = (SubLObject)NIL;
            SubLObject var202 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var200, var199, (SubLObject)$ic84$);
            var201 = var200.first();
            var200 = (var202 = var200.rest());
            if (NIL != module0205.f13145(Symbols.symbol_function((SubLObject)$ic85$), var202, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                return (SubLObject)T;
            }
            var197 = var197.rest();
            var198 = var197.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28485(final SubLObject var98) {
        return (SubLObject)makeBoolean(NIL != module0167.f10813(var98) || NIL != assertion_handles_oc.f11035(var98));
    }
    
    public static SubLObject f28480(final SubLObject var10, final SubLObject var195) {
        final SubLObject var196 = module0366.f24977(var195);
        final SubLObject var197 = module0373.f26277(var10, var195);
        SubLObject var198 = (SubLObject)NIL;
        SubLObject var199 = (SubLObject)NIL;
        SubLObject var200 = var196;
        SubLObject var201 = (SubLObject)NIL;
        var201 = var200.first();
        while (NIL != var200) {
            final SubLObject var202 = module0004.f104(var201, var197, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var201_215;
            final SubLObject var203 = var201_215 = module0366.f24966(var201);
            SubLObject var204 = (SubLObject)NIL;
            var204 = var201_215.first();
            while (NIL != var201_215) {
                if (NIL != var202) {
                    final SubLObject var205 = var204;
                    if (NIL == conses_high.member(var205, var199, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var199 = (SubLObject)ConsesLow.cons(var205, var199);
                    }
                }
                else {
                    final SubLObject var205 = var204;
                    if (NIL == conses_high.member(var205, var198, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var198 = (SubLObject)ConsesLow.cons(var205, var198);
                    }
                }
                var201_215 = var201_215.rest();
                var204 = var201_215.first();
            }
            var200 = var200.rest();
            var201 = var200.first();
        }
        if (NIL != var198) {
            var198 = module0191.f11998(var198);
        }
        if (NIL != var199) {
            var199 = module0191.f11998(var199);
        }
        return Values.values(var198, var199);
    }
    
    public static SubLObject f28478(final SubLObject var195, final SubLObject var10) {
        final SubLObject var196 = f28486(var195, var10);
        final SubLObject var197 = f28487(var196, inference_datastructures_inference_oc.f25490(var10));
        final SubLObject var198 = inference_datastructures_inference_oc.f25486(var10);
        final SubLObject var199 = inference_datastructures_inference_oc.f25590(var10);
        final SubLObject var200 = f28487(var198, var199);
        final SubLObject var201 = inference_datastructures_inference_oc.f25503(var10);
        final SubLObject var202 = (NIL != var200) ? f28488(var200, var197, var199, var201) : var197;
        return var202;
    }
    
    public static SubLObject f28487(final SubLObject var88, final SubLObject var221) {
        if (NIL != f28489(var88, var221)) {
            return var88;
        }
        SubLObject var222 = (SubLObject)NIL;
        SubLObject var223 = var88;
        SubLObject var224 = (SubLObject)NIL;
        var224 = var223.first();
        while (NIL != var223) {
            SubLObject var226;
            final SubLObject var225 = var226 = var224;
            SubLObject var227 = (SubLObject)NIL;
            SubLObject var228 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var226, var225, (SubLObject)$ic84$);
            var227 = var226.first();
            var226 = (var228 = var226.rest());
            if (NIL != module0004.f104(var227, var221, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var222 = (SubLObject)ConsesLow.cons(var224, var222);
            }
            var223 = var223.rest();
            var224 = var223.first();
        }
        var222 = Sequences.nreverse(var222);
        return var222;
    }
    
    public static SubLObject f28489(final SubLObject var88, final SubLObject var221) {
        SubLObject var222 = var88;
        SubLObject var223 = (SubLObject)NIL;
        var223 = var222.first();
        while (NIL != var222) {
            SubLObject var225;
            final SubLObject var224 = var225 = var223;
            SubLObject var226 = (SubLObject)NIL;
            SubLObject var227 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var225, var224, (SubLObject)$ic84$);
            var226 = var225.first();
            var225 = (var227 = var225.rest());
            if (NIL == module0004.f104(var226, var221, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                return (SubLObject)NIL;
            }
            var222 = var222.rest();
            var223 = var222.first();
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f28488(final SubLObject var69, final SubLObject var219, final SubLObject var70, final SubLObject var227) {
        final SubLThread var228 = SubLProcess.currentSubLThread();
        if ($ic86$ != var227) {
            final SubLObject var229 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic87$), var69);
            final SubLObject var230 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic88$), var219);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var228) && NIL == module0035.f2201(var229, var230, (SubLObject)UNPROVIDED)) {
                Errors.error((SubLObject)$ic89$, var69, var219);
            }
        }
        SubLObject var231 = module0233.f15388(var69, var219);
        var231 = module0233.f15399(var231, var70);
        return var231;
    }
    
    public static SubLObject f28486(final SubLObject var195, final SubLObject var10) {
        final SubLObject var196 = module0366.f24934(var195);
        final SubLObject var197 = inference_datastructures_inference_oc.f25474(var10);
        final SubLObject var198 = module0364.f24754(var197);
        final SubLObject var199 = module0364.f24737(var198);
        final SubLObject var200 = module0233.f15382(var199, var196);
        return var200;
    }
    
    public static SubLObject f28490(final SubLObject var10) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != $g3310$.getDynamicValue(var11) && module0361.f24318(inference_datastructures_inference_oc.f25421(var10)).numGE($g3310$.getDynamicValue(var11)));
    }
    
    public static SubLObject f28491(final SubLObject var10) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != $g3311$.getDynamicValue(var11) && Numbers.subtract(module0361.f24318(inference_datastructures_inference_oc.f25421(var10)), inference_datastructures_inference_oc.f25537(var10)).numGE($g3311$.getDynamicValue(var11)));
    }
    
    public static SubLObject f28492(final SubLObject var10) {
        final SubLObject var11 = inference_datastructures_inference_oc.f25421(var10);
        SubLObject var12 = (SubLObject)ZERO_INTEGER;
        if (NIL != module0361.f24236(var11) && (NIL != module0029.f1471() || (NIL != f28490(var10) && NIL != f28491(var10)))) {
            inference_datastructures_inference_oc.f25644(var10, module0361.f24318(var11));
            final SubLObject var13 = module0373.f26473(var11);
            var12 = Numbers.add(var12, var13);
            if (var13.isPositive()) {
                var12 = Numbers.add(var12, module0373.f26443(var11, (SubLObject)NIL));
            }
        }
        return var12;
    }
    
    public static SubLObject f28481(final SubLObject var197, final SubLObject var195) {
        final SubLObject var198 = module0366.f24977(var195);
        SubLObject var199 = (SubLObject)NIL;
        SubLObject var200 = var198;
        SubLObject var201 = (SubLObject)NIL;
        var201 = var200.first();
        while (NIL != var200) {
            if (NIL != module0377.f26783(var201)) {
                final SubLObject var202 = module0366.f24936(var195);
                final SubLObject var204;
                final SubLObject var203 = var204 = module0377.f26784(var201);
                if (NIL == conses_high.member(var204, var199, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var199 = (SubLObject)ConsesLow.cons(var204, var199);
                }
                module0361.f24395(var202, var203);
            }
            var200 = var200.rest();
            var201 = var200.first();
        }
        module0414.f28972(var199);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28493(final SubLObject var197) {
        SubLObject var198 = inference_datastructures_inference_oc.f25744(var197);
        SubLObject var199 = (SubLObject)NIL;
        var199 = var198.first();
        while (NIL != var198) {
            SubLObject var201_241 = inference_datastructures_inference_oc.f25785(var199);
            SubLObject var200 = (SubLObject)NIL;
            var200 = var201_241.first();
            while (NIL != var201_241) {
                f28494(var200);
                var201_241 = var201_241.rest();
                var200 = var201_241.first();
            }
            var198 = var198.rest();
            var199 = var198.first();
        }
        return var197;
    }
    
    public static SubLObject f28494(final SubLObject var195) {
        f28495(var195);
        return var195;
    }
    
    public static SubLObject f28495(final SubLObject var195) {
        if (NIL == module0366.f24974(var195) && NIL != module0035.f1994(module0366.f24967(var195), (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) {
            final SubLObject var196 = module0366.f24967(var195);
            return conses_high.copy_list(var196);
        }
        SubLObject var197 = conses_high.copy_list(module0366.f24967(var195));
        SubLObject var198 = module0366.f24938(var195);
        SubLObject var199 = (SubLObject)NIL;
        var199 = var198.first();
        while (NIL != var198) {
            var197 = ConsesLow.nconc(f28495(var199), var197);
            var198 = var198.rest();
            var199 = var198.first();
        }
        var197 = Sequences.nreverse(module0035.f2269(var197, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        if (NIL == module0373.f26173(var195) && NIL != module0035.f2000(var197, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED)) {
            f28496(var195, var197);
        }
        return var197;
    }
    
    public static SubLObject f28496(final SubLObject var195, final SubLObject var214) {
        final SubLThread var215 = SubLProcess.currentSubLThread();
        final SubLObject var216 = module0373.f26241(var195);
        assert NIL != module0204.f13059(var216) : var216;
        final SubLObject var217 = var216.first();
        assert NIL != module0232.f15312(var217) : var217;
        SubLObject var218 = (SubLObject)NIL;
        if (NIL != module0204.f13045(var217)) {
            var218 = (SubLObject)$ic94$;
        }
        else {
            var218 = (SubLObject)$ic95$;
        }
        final SubLObject var219 = module0204.f13052(var217);
        SubLObject var221;
        final SubLObject var220 = var221 = var219;
        SubLObject var222 = (SubLObject)NIL;
        SubLObject var223 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var221, var220, (SubLObject)$ic96$);
        var222 = var221.first();
        var221 = var221.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var221, var220, (SubLObject)$ic96$);
        var223 = var221.first();
        var221 = var221.rest();
        if (NIL == var221) {
            var215.resetMultipleValues();
            final SubLObject var224 = module0195.f12227(var223, var218, var222, var214, module0018.$g626$.getDynamicValue(var215));
            final SubLObject var225 = var215.secondMultipleValue();
            var215.resetMultipleValues();
            final SubLObject var226 = (SubLObject)((NIL != deduction_handles_oc.f11659(var224)) ? module0188.f11788(var224) : NIL);
            return var226;
        }
        cdestructuring_bind.cdestructuring_bind_error(var220, (SubLObject)$ic96$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28497(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic97$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        final SubLObject var7 = (SubLObject)$ic98$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.list(var7), (SubLObject)ConsesLow.list((SubLObject)$ic99$, (SubLObject)ConsesLow.listS((SubLObject)$ic16$, (SubLObject)ConsesLow.list((SubLObject)$ic7$, var7, (SubLObject)ConsesLow.list((SubLObject)$ic100$, var5)), ConsesLow.append(var6, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic101$, var7)));
    }
    
    public static SubLObject f28498(final SubLObject var255) {
        if (NIL == var255) {
            return (SubLObject)NIL;
        }
        final SubLObject var256 = Semaphores.new_semaphore((SubLObject)$ic103$, (SubLObject)ZERO_INTEGER);
        final SubLObject var257 = Semaphores.new_semaphore((SubLObject)$ic104$, (SubLObject)ZERO_INTEGER);
        final SubLObject var258 = module0004.f78((SubLObject)$ic104$, (SubLObject)$ic105$, (SubLObject)ConsesLow.list(Threads.current_process(), var255, var256, var257));
        Semaphores.semaphore_signal(var256);
        Semaphores.semaphore_wait(var257);
        return var258;
    }
    
    public static SubLObject f28499(final SubLObject var256) {
        if (NIL != Threads.valid_process_p(var256)) {
            return Threads.kill_process(var256);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28500(final SubLObject var259, final SubLObject var255, final SubLObject var257, final SubLObject var258) {
        Semaphores.semaphore_signal(var258);
        Semaphores.semaphore_wait(var257);
        Threads.sleep(var255);
        f28501(var259);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28501(final SubLObject var259) {
        if (NIL != Threads.valid_process_p(var259)) {
            return Threads.interrupt_process(var259, (SubLObject)$ic106$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28502() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0408", "f28394", "S#31514");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28395", "S#31515", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28396", "QUERY-ABORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28398", "S#31516", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28399", "S#31517", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0408", "f28401", "S#31518");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0408", "f28402", "WITH-INFERENCE-ERROR-HANDLING");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28403", "S#31519", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0408", "f28404", "S#31520");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28405", "S#31521", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28406", "S#28208", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28407", "S#28209", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28408", "S#31522", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28409", "S#31523", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28410", "S#31524", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28413", "S#31525", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28412", "S#31526", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28415", "S#31527", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28416", "S#31528", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28417", "S#31529", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28418", "S#31530", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28419", "S#31531", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28411", "S#31532", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28420", "S#31533", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28421", "S#31534", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28423", "S#25824", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28422", "S#31535", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28414", "S#31536", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28424", "S#29284", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28425", "S#31537", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28426", "S#31538", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28428", "S#31539", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28427", "S#31540", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28429", "S#31541", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28430", "S#31542", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28432", "S#31543", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28433", "S#31544", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28434", "S#31545", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28435", "S#31546", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28436", "S#31547", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28437", "S#31548", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28400", "INFERENCE-INTERRUPT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28438", "S#31549", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28440", "INFERENCE-ABORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28441", "S#31550", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28442", "S#28199", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28397", "ABORT-CURRENT-CONTROLLING-INFERENCE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28439", "S#31551", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28443", "S#31552", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28444", "S#31553", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28445", "S#31554", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28446", "S#31555", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28447", "S#31556", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28448", "S#24192", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28449", "S#24289", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28450", "S#31557", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28451", "S#31558", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28452", "S#31559", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28453", "S#31560", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28454", "S#31561", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28455", "S#31562", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28456", "S#31563", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28457", "S#31564", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28459", "S#31565", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28458", "S#31566", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28460", "S#31567", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28461", "S#30691", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28462", "S#31568", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28463", "S#31569", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28464", "S#31570", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28431", "S#31571", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28465", "S#31572", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28466", "S#31573", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28469", "S#31574", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28467", "S#31575", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28468", "S#31576", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28472", "S#31577", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28470", "S#31578", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28473", "S#31579", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28471", "S#31580", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28474", "S#31581", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28475", "S#29286", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28477", "S#29304", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28476", "S#31582", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28479", "S#31583", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28483", "S#31584", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28482", "S#25996", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28484", "S#31585", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28485", "S#31586", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28480", "S#31587", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28478", "S#31588", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28487", "S#31589", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28489", "S#31590", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28488", "S#31591", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28486", "S#31592", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28490", "S#31593", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28491", "S#31594", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28492", "S#30566", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28481", "S#31595", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28493", "S#31596", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28494", "S#31597", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28495", "S#31598", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28496", "S#31599", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0408", "f28497", "S#31600");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28498", "S#31601", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28499", "S#31602", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28500", "S#31603", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0408", "f28501", "S#31604", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28503() {
        $g3301$ = SubLFiles.defvar("S#31605", (SubLObject)T);
        $g3302$ = SubLFiles.defparameter("S#31606", (SubLObject)NIL);
        $g3303$ = SubLFiles.defparameter("S#31607", (SubLObject)T);
        $g3304$ = SubLFiles.deflexical("S#31608", (SubLObject)$ic42$);
        $g3305$ = SubLFiles.deflexical("S#31609", (SubLObject)NIL);
        $g3306$ = SubLFiles.defparameter("S#31610", (SubLObject)NIL);
        $g3307$ = SubLFiles.defvar("S#31611", (SubLObject)$ic77$);
        $g3308$ = SubLFiles.defvar("S#31612", (SubLObject)$ic78$);
        $g3309$ = SubLFiles.defvar("S#31613", (SubLObject)$ic78$);
        $g3310$ = SubLFiles.defparameter("S#31614", (SubLObject)$ic90$);
        $g3311$ = SubLFiles.defparameter("S#31615", (SubLObject)$ic91$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28504() {
        module0012.f419((SubLObject)$ic12$);
        module0002.f50((SubLObject)$ic100$, (SubLObject)$ic102$);
        module0002.f50((SubLObject)$ic101$, (SubLObject)$ic102$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f28502();
    }
    
    public void initializeVariables() {
        f28503();
    }
    
    public void runTopLevelForms() {
        f28504();
    }
    
    static {
        me = (SubLFile)new module0408();
        $g3301$ = null;
        $g3302$ = null;
        $g3303$ = null;
        $g3304$ = null;
        $g3305$ = null;
        $g3306$ = null;
        $g3307$ = null;
        $g3308$ = null;
        $g3309$ = null;
        $g3310$ = null;
        $g3311$ = null;
        $ic0$ = ConsesLow.list((SubLObject)makeSymbol("S#31616", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic1$ = makeUninternedSymbol("US#79B604E");
        $ic2$ = makeSymbol("CLET");
        $ic3$ = makeSymbol("CCATCH");
        $ic4$ = makeKeyword("INFERENCE-ABORT-TARGET");
        $ic5$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#31606", "CYC"), (SubLObject)T));
        $ic6$ = makeSymbol("PWHEN");
        $ic7$ = makeSymbol("CSETQ");
        $ic8$ = ConsesLow.list((SubLObject)makeKeyword("ABORT"));
        $ic9$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUERY-ABORT")));
        $ic10$ = makeKeyword("NOT-ABORTED");
        $ic11$ = makeString("Interruptor");
        $ic12$ = makeSymbol("S#31517", "CYC");
        $ic13$ = makeUninternedSymbol("US#36A0F49");
        $ic14$ = makeSymbol("PIF");
        $ic15$ = makeSymbol("S#1860", "CYC");
        $ic16$ = makeSymbol("PROGN");
        $ic17$ = makeKeyword("INFERENCE-ERROR");
        $ic18$ = makeSymbol("WITH-INFERENCE-ERROR-HANDLING");
        $ic19$ = makeSymbol("NEW-INFERENCE-ERROR-SUSPEND-STATUS");
        $ic20$ = makeSymbol("WITH-ERROR-HANDLER");
        $ic21$ = ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("S#31519", "CYC"));
        $ic22$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#31617", "CYC"), (SubLObject)makeSymbol("S#59", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic23$ = makeUninternedSymbol("US#7014546");
        $ic24$ = makeUninternedSymbol("US#2C5C021");
        $ic25$ = makeSymbol("PCOND");
        $ic26$ = makeSymbol("WITH-TIMEOUT");
        $ic27$ = ConsesLow.list((SubLObject)makeKeyword("MAX-TIME"));
        $ic28$ = makeKeyword("CUSTOM");
        $ic29$ = makeKeyword("UNSPECIFIED");
        $ic30$ = makeSymbol("INFERENCE-P");
        $ic31$ = makeKeyword("ALL");
        $ic32$ = makeInteger(-100);
        $ic33$ = makeKeyword("SUPPORTS");
        $ic34$ = makeKeyword("BINDINGS-AND-SUPPORTS");
        $ic35$ = makeKeyword("BINDINGS-AND-SUPPORTS-AND-PRAGMATIC-SUPPORTS");
        $ic36$ = makeKeyword("HL");
        $ic37$ = makeKeyword("PROOF");
        $ic38$ = makeSymbol("S#28370", "CYC");
        $ic39$ = makeString("can't handle non-simplest inferences like ~a");
        $ic40$ = makeKeyword("PREPARED");
        $ic41$ = makeSymbol("S#28621", "CYC");
        $ic42$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)NIL, (SubLObject)NIL));
        $ic43$ = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic44$ = makeKeyword("ILL-FORMED");
        $ic45$ = makeKeyword("NOT-AN-IMPLICATION");
        $ic46$ = makeKeyword("TAUTOLOGY");
        $ic47$ = constant_handles_oc.f8479((SubLObject)makeString("True"));
        $ic48$ = constant_handles_oc.f8479((SubLObject)makeString("False"));
        $ic49$ = makeKeyword("CONTRADICTION");
        $ic50$ = makeSymbol("S#18061", "CYC");
        $ic51$ = makeSymbol("LISTP");
        $ic52$ = makeString("Time to support disjunctive #$pragmaticRequirements");
        $ic53$ = makeSymbol("HL-VARIABLE-P");
        $ic54$ = makeString("can't handle non-simple inference seeding of strategies");
        $ic55$ = makeSymbol("S#28375", "CYC");
        $ic56$ = makeSymbol("S#26495", "CYC");
        $ic57$ = makeKeyword("READY");
        $ic58$ = makeSymbol("S#26531", "CYC");
        $ic59$ = makeKeyword("MAX-PROOF-DEPTH");
        $ic60$ = makeSymbol("S#28372", "CYC");
        $ic61$ = makeString("Unhandled inference error");
        $ic62$ = makeKeyword("RUNNING");
        $ic63$ = makeSymbol("S#31519", "CYC");
        $ic64$ = makeKeyword("ABORT");
        $ic65$ = makeKeyword("SUSPENDED");
        $ic66$ = makeKeyword("MAX-PROBLEM-COUNT");
        $ic67$ = makeKeyword("MAX-NUMBER");
        $ic68$ = makeKeyword("MAX-TIME");
        $ic69$ = makeKeyword("MAX-STEP");
        $ic70$ = makeKeyword("PROBABLY-APPROXIMATELY-DONE");
        $ic71$ = makeSymbol("S#28373", "CYC");
        $ic72$ = makeString("Inference control process was killed while running.");
        $ic73$ = makeSymbol("S#4689", "CYC");
        $ic74$ = makeSymbol("S#31515", "CYC");
        $ic75$ = makeKeyword("INTERRUPT");
        $ic76$ = makeKeyword("MAX-PROOF-COUNT");
        $ic77$ = makeKeyword("BALANCING");
        $ic78$ = makeKeyword("REMOVAL");
        $ic79$ = makeKeyword("EXHAUST");
        $ic80$ = makeString("Non-continuable inference should have been :exhaust-total instead of :exhaust");
        $ic81$ = makeString("Crazy amount of problems (~a) in store ~a");
        $ic82$ = makeKeyword("EXHAUST-TOTAL");
        $ic83$ = makeSymbol("S#26816", "CYC");
        $ic84$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("VARIABLE"), (SubLObject)makeSymbol("S#132", "CYC"));
        $ic85$ = makeSymbol("S#31586", "CYC");
        $ic86$ = makeKeyword("COMPUTE-UNION");
        $ic87$ = makeSymbol("S#17993", "CYC");
        $ic88$ = makeSymbol("S#18076", "CYC");
        $ic89$ = makeString("Expected a one-to-one match between EL and HL bindings, got ~a and ~a");
        $ic90$ = makeInteger(600);
        $ic91$ = makeInteger(50);
        $ic92$ = makeSymbol("S#15957", "CYC");
        $ic93$ = makeSymbol("ATOMIC-CLAUSE-P");
        $ic94$ = makeKeyword("TRUE");
        $ic95$ = makeKeyword("FALSE");
        $ic96$ = ConsesLow.list((SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#13100", "CYC"));
        $ic97$ = ConsesLow.list((SubLObject)makeSymbol("TIME"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic98$ = makeUninternedSymbol("US#32689D5");
        $ic99$ = makeSymbol("CUNWIND-PROTECT");
        $ic100$ = makeSymbol("S#31601", "CYC");
        $ic101$ = makeSymbol("S#31602", "CYC");
        $ic102$ = makeSymbol("S#31600", "CYC");
        $ic103$ = makeString("WITH-QUERY-ABORT-TIMEOUT client");
        $ic104$ = makeString("WITH-QUERY-ABORT-TIMEOUT timer");
        $ic105$ = makeSymbol("S#31603", "CYC");
        $ic106$ = makeSymbol("QUERY-ABORT");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 834 ms
	
	Decompiled with Procyon 0.5.32.
*/