package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0384 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0384";
    public static final String myFingerPrint = "7b674eea62a5a91796bb2c8dfda8c8022d96db185b06287a4be05e974ebcb15d";
    private static SubLSymbol $g3227$;
    private static SubLSymbol $g3228$;
    public static SubLSymbol $g3229$;
    private static SubLSymbol $g3230$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
    private static final SubLList $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLString $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLString $ic40$;
    private static final SubLString $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLString $ic47$;
    private static final SubLString $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLString $ic50$;
    private static final SubLString $ic51$;
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLList $ic54$;
    private static final SubLObject $ic55$;
    private static final SubLObject $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLString $ic71$;
    private static final SubLList $ic72$;
    private static final SubLList $ic73$;
    private static final SubLList $ic74$;
    private static final SubLList $ic75$;
    private static final SubLList $ic76$;
    private static final SubLList $ic77$;
    private static final SubLObject $ic78$;
    private static final SubLObject $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    
    
    public static SubLObject f27258(final SubLObject var1) {
        return Equality.eq(var1, $g3228$.getGlobalValue());
    }
    
    public static SubLObject f27259() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return (NIL != $g3227$.getDynamicValue(var2)) ? $g3227$.getDynamicValue(var2) : $g3228$.getGlobalValue();
    }
    
    public static SubLObject f27260(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)$ic3$, ConsesLow.append(var7, (SubLObject)NIL));
    }
    
    public static SubLObject f27261(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic2$, (SubLObject)$ic4$, ConsesLow.append(var7, (SubLObject)NIL));
    }
    
    public static SubLObject f27262(final SubLObject var10, final SubLObject var11, final SubLObject var12, final SubLObject var13, final SubLObject var14) {
        final SubLObject var15 = f27263(var10, var11, var12, var13, var14);
        assert NIL != f27264(var15) : var15;
        $g3227$.setDynamicValue(var15);
        return var15;
    }
    
    public static SubLObject f27265(final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        if (NIL != $g3229$.getDynamicValue(var16)) {
            $g3227$.setDynamicValue(var15, var16);
        }
        return var15;
    }
    
    public static SubLObject f27266(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic8$);
        var7 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic8$);
        final SubLObject var8 = var6.rest();
        var6 = var6.first();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var6;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var22_23 = (SubLObject)NIL;
        while (NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var5, (SubLObject)$ic8$);
            var22_23 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var5, (SubLObject)$ic8$);
            if (NIL == conses_high.member(var22_23, (SubLObject)$ic9$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var11 = (SubLObject)T;
            }
            if (var22_23 == $ic10$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (NIL != var11 && NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic8$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic11$, var6);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)$ic12$, var6);
        final SubLObject var15 = (SubLObject)((NIL != var14) ? conses_high.cadr(var14) : NIL);
        final SubLObject var16 = cdestructuring_bind.property_list_member((SubLObject)$ic13$, var6);
        final SubLObject var17 = (SubLObject)((NIL != var16) ? conses_high.cadr(var16) : NIL);
        final SubLObject var18 = cdestructuring_bind.property_list_member((SubLObject)$ic14$, var6);
        final SubLObject var19 = (SubLObject)((NIL != var18) ? conses_high.cadr(var18) : NIL);
        var6 = var8;
        if (NIL == var6) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic15$, (SubLObject)$ic16$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7, var13, var15, var17, var19));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic8$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27267() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (NIL != $g3229$.getDynamicValue(var2)) {
            $g3227$.setDynamicValue($g3228$.getGlobalValue(), var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27268(final SubLObject var10) {
        return conses_high.second(conses_high.assoc(var10, $g3230$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f27269(final SubLObject var1) {
        return (SubLObject)makeBoolean(var1.isString() || (var1.isKeyword() && NIL != conses_high.assoc(var1, $g3230$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f27264(final SubLObject var1) {
        if (var1.isCons() && NIL != module0035.f1995(var1, (SubLObject)FIVE_INTEGER, (SubLObject)UNPROVIDED)) {
            SubLObject var2 = (SubLObject)NIL;
            SubLObject var3 = (SubLObject)NIL;
            SubLObject var4 = (SubLObject)NIL;
            SubLObject var5 = (SubLObject)NIL;
            SubLObject var6 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)$ic18$);
            var2 = var1.first();
            SubLObject var7 = var1.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var7, var1, (SubLObject)$ic18$);
            var3 = var7.first();
            var7 = var7.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var7, var1, (SubLObject)$ic18$);
            var4 = var7.first();
            var7 = var7.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var7, var1, (SubLObject)$ic18$);
            var5 = var7.first();
            var7 = var7.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var7, var1, (SubLObject)$ic18$);
            var6 = var7.first();
            var7 = var7.rest();
            if (NIL == var7) {
                return (SubLObject)makeBoolean(NIL != f27269(var2) && (NIL == var3 || NIL != module0363.f24478(var3)) && (NIL == var4 || NIL != module0365.f24819(var4)) && (NIL == var5 || NIL != module0364.f24699(var5)) && (NIL == var6 || NIL != f27264(var6)));
            }
            cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)$ic18$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27270(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL == var1 || NIL != f27264(var1) || NIL != module0035.f2192((SubLObject)$ic7$, var1));
    }
    
    public static SubLObject f27263(final SubLObject var10, SubLObject var11, SubLObject var12, SubLObject var13, SubLObject var14) {
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)NIL;
        }
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        assert NIL != f27269(var10) : var10;
        if (NIL != var11 && !areAssertionsDisabledFor(me) && NIL == module0363.f24478(var11)) {
            throw new AssertionError(var11);
        }
        if (NIL != var12 && !areAssertionsDisabledFor(me) && NIL == module0365.f24819(var12)) {
            throw new AssertionError(var12);
        }
        if (NIL != var13 && !areAssertionsDisabledFor(me) && NIL == module0364.f24699(var13)) {
            throw new AssertionError(var13);
        }
        if (NIL != var14 && !areAssertionsDisabledFor(me) && NIL == f27264(var14)) {
            throw new AssertionError(var14);
        }
        return (SubLObject)ConsesLow.list(var10, var11, var12, var13, var14);
    }
    
    public static SubLObject f27271(final SubLObject var15) {
        assert NIL != f27264(var15) : var15;
        return var15.first();
    }
    
    public static SubLObject f27272(final SubLObject var1) {
        return module0004.f104(var1, (SubLObject)$ic23$, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f27273(final SubLObject var31, final SubLObject var11, SubLObject var32) {
        if (var32 == UNPROVIDED) {
            var32 = (SubLObject)NIL;
        }
        return module0367.f25109(var31, (SubLObject)$ic24$, var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f27274(final SubLObject var31, final SubLObject var11) {
        final SubLThread var32 = SubLProcess.currentSubLThread();
        SubLObject var33 = (SubLObject)NIL;
        final SubLObject var34 = $g3227$.currentBinding(var32);
        final SubLObject var35 = $g3229$.currentBinding(var32);
        try {
            $g3227$.bind((SubLObject)NIL, var32);
            $g3229$.bind((SubLObject)T, var32);
            f27273(var31, var11, (SubLObject)UNPROVIDED);
            var33 = f27259();
        }
        finally {
            $g3229$.rebind(var35, var32);
            $g3227$.rebind(var34, var32);
        }
        return var33;
    }
    
    public static SubLObject f27275(final SubLObject var31, final SubLObject var12, final SubLObject var36, final SubLObject var37) {
        return module0367.f25109(var31, (SubLObject)$ic25$, var12, var36, var37, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f27276(final SubLObject var31, final SubLObject var12, SubLObject var32) {
        if (var32 == UNPROVIDED) {
            var32 = (SubLObject)NIL;
        }
        return f27277(var31, var12);
    }
    
    public static SubLObject f27278(final SubLObject var31, final SubLObject var12, SubLObject var32) {
        if (var32 == UNPROVIDED) {
            var32 = (SubLObject)NIL;
        }
        return f27279(var31, var12);
    }
    
    public static SubLObject f27280(final SubLObject var31, final SubLObject var12) {
        final SubLThread var32 = SubLProcess.currentSubLThread();
        SubLObject var33 = (SubLObject)NIL;
        final SubLObject var34 = $g3227$.currentBinding(var32);
        final SubLObject var35 = $g3229$.currentBinding(var32);
        try {
            $g3227$.bind((SubLObject)NIL, var32);
            $g3229$.bind((SubLObject)T, var32);
            f27275(var31, var12, (SubLObject)NIL, (SubLObject)NIL);
            var33 = f27259();
        }
        finally {
            $g3229$.rebind(var35, var32);
            $g3227$.rebind(var34, var32);
        }
        return var33;
    }
    
    public static SubLObject f27281(final SubLObject var31, final SubLObject var11) {
        return module0367.f25109(var31, (SubLObject)$ic26$, var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f27282(final SubLObject var31, final SubLObject var11) {
        final SubLThread var32 = SubLProcess.currentSubLThread();
        SubLObject var33 = (SubLObject)NIL;
        final SubLObject var34 = $g3227$.currentBinding(var32);
        final SubLObject var35 = $g3229$.currentBinding(var32);
        try {
            $g3227$.bind((SubLObject)NIL, var32);
            $g3229$.bind((SubLObject)T, var32);
            f27281(var31, var11);
            var33 = f27259();
        }
        finally {
            $g3229$.rebind(var35, var32);
            $g3227$.rebind(var34, var32);
        }
        return var33;
    }
    
    public static SubLObject f27283(final SubLObject var31, final SubLObject var12, final SubLObject var36, final SubLObject var37) {
        return module0367.f25109(var31, (SubLObject)$ic27$, var12, var36, var37, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f27284(final SubLObject var31, final SubLObject var12, SubLObject var32) {
        if (var32 == UNPROVIDED) {
            var32 = (SubLObject)NIL;
        }
        return f27285(var31, var12);
    }
    
    public static SubLObject f27286(final SubLObject var31, final SubLObject var12) {
        final SubLThread var32 = SubLProcess.currentSubLThread();
        SubLObject var33 = (SubLObject)NIL;
        final SubLObject var34 = $g3227$.currentBinding(var32);
        final SubLObject var35 = $g3229$.currentBinding(var32);
        try {
            $g3227$.bind((SubLObject)NIL, var32);
            $g3229$.bind((SubLObject)T, var32);
            f27283(var31, var12, (SubLObject)NIL, (SubLObject)NIL);
            var33 = f27259();
        }
        finally {
            $g3229$.rebind(var35, var32);
            $g3227$.rebind(var34, var32);
        }
        return var33;
    }
    
    public static SubLObject f27287(final SubLObject var31, final SubLObject var12, SubLObject var32) {
        if (var32 == UNPROVIDED) {
            var32 = (SubLObject)NIL;
        }
        return f27279(var31, var12);
    }
    
    public static SubLObject f27288(final SubLObject var31, final SubLObject var11) {
        return f27289(var31, var11, (SubLObject)NIL);
    }
    
    public static SubLObject f27290(final SubLObject var31, final SubLObject var11) {
        return f27289(var31, var11, (SubLObject)T);
    }
    
    public static SubLObject f27289(final SubLObject var31, final SubLObject var11, final SubLObject var38) {
        if (NIL != f27291(var11)) {
            if (NIL != var38) {
                return (SubLObject)$ic28$;
            }
            return (SubLObject)T;
        }
        else if (NIL != f27292(var31, var11)) {
            if (NIL != var38) {
                return (SubLObject)$ic29$;
            }
            return (SubLObject)T;
        }
        else {
            final SubLObject var39 = f27293(module0367.f25037(var31), var11);
            if (NIL == var39) {
                if (NIL == inference_datastructures_inference_oc.f25432(module0367.f25037(var31))) {
                    final SubLObject var40 = f27294(var31, var11);
                    if (NIL != var40) {
                        if (NIL != var38) {
                            return Sequences.cconcatenate((SubLObject)$ic30$, var40);
                        }
                        return (SubLObject)T;
                    }
                }
                return (SubLObject)NIL;
            }
            if (NIL != var38) {
                return var39;
            }
            return (SubLObject)T;
        }
    }
    
    public static SubLObject f27277(final SubLObject var31, final SubLObject var12) {
        return f27295(var31, var12, (SubLObject)NIL);
    }
    
    public static SubLObject f27296(final SubLObject var31, final SubLObject var12) {
        return f27295(var31, var12, (SubLObject)T);
    }
    
    public static SubLObject f27295(final SubLObject var31, final SubLObject var12, final SubLObject var38) {
        if (NIL != module0365.f24886(var12) && NIL == module0398.f28152(var31)) {
            if (NIL != var38) {
                return (SubLObject)$ic31$;
            }
            return (SubLObject)T;
        }
        else if (NIL == module0373.f26203(module0365.f24850(var12), var31) && NIL != f27297(module0365.f24850(var12), var31)) {
            if (NIL != var38) {
                return (SubLObject)$ic32$;
            }
            return (SubLObject)T;
        }
        else if (NIL != f27298(var31, var12)) {
            if (NIL != var38) {
                return (SubLObject)$ic33$;
            }
            return (SubLObject)T;
        }
        else if (NIL != module0377.f26771(var12) && NIL != f27299(var31, var12)) {
            if (NIL != var38) {
                return f27300(var31, var12);
            }
            return (SubLObject)T;
        }
        else {
            if (NIL != f27301(var31, var12)) {
                if (NIL == inference_datastructures_inference_oc.f25432(module0367.f25037(var31))) {
                    final SubLObject var39 = f27302(var31, var12);
                    if (NIL != var39) {
                        if (NIL != var38) {
                            return Sequences.cconcatenate((SubLObject)$ic30$, var39);
                        }
                        return (SubLObject)T;
                    }
                }
                return (SubLObject)NIL;
            }
            if (NIL != var38) {
                return (SubLObject)$ic34$;
            }
            return (SubLObject)T;
        }
    }
    
    public static SubLObject f27297(final SubLObject var11, final SubLObject var42) {
        return f27303(var11, var42, (SubLObject)$ic35$);
    }
    
    public static SubLObject f27304(final SubLObject var11, final SubLObject var42) {
        return f27305(var11, var42, (SubLObject)$ic35$);
    }
    
    public static SubLObject f27306(final SubLObject var11, final SubLObject var42) {
        return f27307(var11, var42, (SubLObject)$ic35$);
    }
    
    public static SubLObject f27308(final SubLObject var11) {
        return f27309(var11, (SubLObject)$ic35$);
    }
    
    public static SubLObject f27301(final SubLObject var31, final SubLObject var12) {
        return f27310(var31, module0365.f24865(var12));
    }
    
    public static SubLObject f27310(final SubLObject var31, final SubLObject var43) {
        return inference_datastructures_inference_oc.f25613(module0367.f25037(var31), var43);
    }
    
    public static SubLObject f27311(final SubLObject var31, final SubLObject var11) {
        return f27312(var31, var11, (SubLObject)NIL);
    }
    
    public static SubLObject f27294(final SubLObject var31, final SubLObject var11) {
        return f27312(var31, var11, (SubLObject)T);
    }
    
    public static SubLObject f27312(final SubLObject var31, final SubLObject var11, final SubLObject var38) {
        if (NIL != module0367.f25159(var11, var31)) {
            if (NIL != var38) {
                return (SubLObject)$ic36$;
            }
            return (SubLObject)T;
        }
        else {
            final SubLObject var39 = f27313(module0367.f25037(var31), var11);
            if (NIL == var39) {
                return (SubLObject)NIL;
            }
            if (NIL != var38) {
                return var39;
            }
            return (SubLObject)T;
        }
    }
    
    public static SubLObject f27285(final SubLObject var31, final SubLObject var12) {
        return f27314(var31, var12, (SubLObject)NIL);
    }
    
    public static SubLObject f27302(final SubLObject var31, final SubLObject var12) {
        return f27314(var31, var12, (SubLObject)T);
    }
    
    public static SubLObject f27314(final SubLObject var31, final SubLObject var12, final SubLObject var38) {
        if ((NIL == module0373.f26176(var12) && NIL != module0361.f24164(module0367.f25044(var31))) || NIL == f27315(var12, var31)) {
            if (NIL != module0377.f26771(var12)) {
                final SubLObject var39 = f27316(var31, var12);
                if (NIL != var39) {
                    if (NIL != var38) {
                        return var39;
                    }
                    return (SubLObject)T;
                }
            }
            return (SubLObject)NIL;
        }
        if (NIL != var38) {
            return (SubLObject)$ic37$;
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f27317(final SubLObject var31, final SubLObject var11) {
        return (SubLObject)makeBoolean(NIL != f27288(var31, var11) || (NIL != inference_datastructures_inference_oc.f25432(module0367.f25037(var31)) && NIL != f27311(var31, var11)));
    }
    
    public static SubLObject f27279(final SubLObject var31, final SubLObject var12) {
        return (SubLObject)makeBoolean(NIL != f27277(var31, var12) || (NIL != inference_datastructures_inference_oc.f25432(module0367.f25037(var31)) && NIL != f27285(var31, var12)));
    }
    
    public static SubLObject f27318(final SubLObject var11, final SubLObject var42) {
        assert NIL != module0373.f26190(var42) : var42;
        if (NIL != module0367.f24997(var42)) {
            return (SubLObject)T;
        }
        return module0363.f24617(var11);
    }
    
    public static SubLObject f27319(final SubLObject var31, final SubLObject var11) {
        return (SubLObject)makeBoolean(NIL != f27291(var11) || NIL != f27292(var31, var11));
    }
    
    public static SubLObject f27292(final SubLObject var31, final SubLObject var11) {
        return (SubLObject)makeBoolean(NIL != module0363.f24680(var11) && (NIL != module0367.f25090(var31) || (NIL != module0367.f25089(var31) && (NIL != module0363.f24553(var11) || (var11.eql(module0367.f25080(var31)) && NIL != inference_datastructures_inference_oc.f25589(module0367.f25037(var31)))))));
    }
    
    public static SubLObject f27291(final SubLObject var11) {
        return (SubLObject)makeBoolean(NIL != module0363.f24681(var11) || NIL != module0363.f24686(var11) || (NIL != module0363.f24685(var11) && NIL != module0363.f24680(var11) && NIL != module0363.f24553(var11)));
    }
    
    public static SubLObject f27320(final SubLObject var31, final SubLObject var11) {
        return f27321(var11, var31);
    }
    
    public static SubLObject f27321(final SubLObject var11, final SubLObject var31) {
        return (SubLObject)makeBoolean(NIL != module0367.f25154(var11, var31) || NIL != module0367.f25152(var11, var31) || NIL != module0367.f25150(var11, var31));
    }
    
    public static SubLObject f27322(final SubLObject var11, final SubLObject var42, final SubLObject var46) {
        assert NIL != module0373.f26190(var42) : var42;
        if (NIL != module0367.f24997(var42)) {
            final SubLObject var47 = module0363.f24527(var11);
            SubLObject var48;
            SubLObject var49;
            SubLObject var50;
            SubLObject var51;
            SubLObject var52;
            SubLObject var53;
            SubLObject var54;
            SubLObject var55;
            for (var48 = module0032.f1741(var47), var49 = (SubLObject)NIL, var49 = module0032.f1742(var48, var47); NIL == module0032.f1744(var48, var49); var49 = module0032.f1743(var49)) {
                var50 = module0032.f1745(var48, var49);
                if (NIL != module0032.f1746(var49, var50) && (NIL != var46 || NIL == module0377.f26746(var50))) {
                    var51 = var50;
                    var52 = module0364.f24735(var51);
                    var53 = (SubLObject)NIL;
                    var53 = var52.first();
                    while (NIL != var52) {
                        if (NIL != module0339.f22743((SubLObject)NIL, var51, var53)) {
                            var54 = module0364.f24736(var53);
                            var55 = module0364.f24737(var53);
                            if (NIL != module0363.f24586(var54, var42)) {
                                return (SubLObject)T;
                            }
                        }
                        var52 = var52.rest();
                        var53 = var52.first();
                    }
                }
            }
            return (SubLObject)NIL;
        }
        return module0363.f24592(var11);
    }
    
    public static SubLObject f27323(final SubLObject var11, final SubLObject var42) {
        assert NIL != module0373.f26190(var42) : var42;
        if (NIL != module0367.f24997(var42)) {
            SubLObject var43 = module0363.f24517(var11);
            SubLObject var44 = (SubLObject)NIL;
            var44 = var43.first();
            while (NIL != var43) {
                if (NIL != module0363.f24524(var44, (SubLObject)$ic39$) && NIL == f27279(var42, var44)) {
                    return (SubLObject)T;
                }
                var43 = var43.rest();
                var44 = var43.first();
            }
            return (SubLObject)NIL;
        }
        return module0363.f24628(var11);
    }
    
    public static SubLObject f27324(final SubLObject var31, final SubLObject var11) {
        return Numbers.zerop(module0367.f25207(var11, var31));
    }
    
    public static SubLObject f27325(final SubLObject var56, final SubLObject var11) {
        return f27326(var56, var11, (SubLObject)NIL);
    }
    
    public static SubLObject f27313(final SubLObject var56, final SubLObject var11) {
        return f27326(var56, var11, (SubLObject)T);
    }
    
    public static SubLObject f27326(final SubLObject var56, final SubLObject var11, final SubLObject var38) {
        if (NIL != module0373.f26358(var56, var11)) {
            return (SubLObject)NIL;
        }
        if (NIL != var38) {
            return (SubLObject)$ic40$;
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f27327(final SubLObject var56, final SubLObject var11) {
        return f27328(var56, var11, (SubLObject)NIL);
    }
    
    public static SubLObject f27293(final SubLObject var56, final SubLObject var11) {
        return f27328(var56, var11, (SubLObject)T);
    }
    
    public static SubLObject f27328(final SubLObject var56, final SubLObject var11, final SubLObject var38) {
        if (NIL != inference_datastructures_inference_oc.f25607(var56) || NIL == module0363.f24602(var11) || NIL == f27329(var11, var56)) {
            return (SubLObject)NIL;
        }
        if (NIL != var38) {
            return (SubLObject)$ic41$;
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f27329(final SubLObject var11, final SubLObject var56) {
        final SubLObject var57 = module0363.f24530(var11);
        SubLObject var58;
        SubLObject var59;
        SubLObject var60;
        for (var58 = module0032.f1741(var57), var59 = (SubLObject)NIL, var59 = module0032.f1742(var58, var57); NIL == module0032.f1744(var58, var59); var59 = module0032.f1743(var59)) {
            var60 = module0032.f1745(var58, var59);
            if (NIL != module0032.f1746(var59, var60) && (NIL == module0377.f26746(var60) || NIL == f27330(var60, var56))) {
                return (SubLObject)NIL;
            }
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f27330(final SubLObject var57, final SubLObject var56) {
        final SubLObject var58 = module0377.f26749(var57);
        return (SubLObject)makeBoolean(NIL == inference_datastructures_inference_oc.f25608(var56, var58));
    }
    
    public static SubLObject f27331(final SubLObject var56, final SubLObject var11) {
        return f27332(var56, var11, (SubLObject)NIL);
    }
    
    public static SubLObject f27333(final SubLObject var56, final SubLObject var11) {
        final SubLThread var57 = SubLProcess.currentSubLThread();
        final SubLObject var58 = module0034.$g879$.getDynamicValue(var57);
        SubLObject var59 = (SubLObject)NIL;
        if (NIL == var58) {
            return f27331(var56, var11);
        }
        var59 = module0034.f1857(var58, (SubLObject)$ic42$, (SubLObject)UNPROVIDED);
        if (NIL == var59) {
            var59 = module0034.f1807(module0034.f1842(var58), (SubLObject)$ic42$, (SubLObject)TWO_INTEGER, (SubLObject)NIL, (SubLObject)EQ, (SubLObject)UNPROVIDED);
            module0034.f1860(var58, (SubLObject)$ic42$, var59);
        }
        final SubLObject var60 = module0034.f1782(var56, var11);
        final SubLObject var61 = module0034.f1814(var59, var60, (SubLObject)UNPROVIDED);
        if (var61 != $ic43$) {
            SubLObject var62 = var61;
            SubLObject var63 = (SubLObject)NIL;
            var63 = var62.first();
            while (NIL != var62) {
                SubLObject var64 = var63.first();
                final SubLObject var65 = conses_high.second(var63);
                if (var56.eql(var64.first())) {
                    var64 = var64.rest();
                    if (NIL != var64 && NIL == var64.rest() && var11.eql(var64.first())) {
                        return module0034.f1959(var65);
                    }
                }
                var62 = var62.rest();
                var63 = var62.first();
            }
        }
        final SubLObject var66 = Values.arg2(var57.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f27331(var56, var11)));
        module0034.f1836(var59, var60, var61, var66, (SubLObject)ConsesLow.list(var56, var11));
        return module0034.f1959(var66);
    }
    
    public static SubLObject f27334(final SubLObject var56, final SubLObject var11) {
        return f27332(var56, var11, (SubLObject)T);
    }
    
    public static SubLObject f27332(final SubLObject var56, final SubLObject var11, final SubLObject var38) {
        final SubLObject var57 = inference_datastructures_inference_oc.f25505(var56);
        final SubLObject var58 = inference_datastructures_inference_oc.f25506(var56);
        final SubLObject var59 = inference_datastructures_inference_oc.f25507(var56);
        if (NIL == var58) {
            if (NIL == var57 && NIL != f27335(var11) && NIL == f27336(var11)) {
                if (NIL != var38) {
                    return (SubLObject)$ic44$;
                }
                return (SubLObject)T;
            }
            else if (NIL == var59 && NIL != f27337(var11)) {
                if (NIL != var38) {
                    return (SubLObject)$ic45$;
                }
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27336(final SubLObject var11) {
        final SubLObject var12 = module0363.f24564(var11);
        final SubLObject var13 = module0363.f24565(var11);
        return f27338(var12, var13);
    }
    
    public static SubLObject f27335(final SubLObject var11) {
        if (NIL != module0363.f24562(var11)) {
            final SubLObject var12 = module0363.f24563(var11);
            return module0333.f22416(var12);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27337(final SubLObject var11) {
        if (NIL != module0363.f24562(var11)) {
            final SubLObject var12 = module0363.f24563(var11);
            return (SubLObject)makeBoolean(NIL != module0173.f10955(var12) && NIL != module0349.f23396(var12));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27298(final SubLObject var31, final SubLObject var12) {
        if (NIL != module0379.f26934(var12)) {
            final SubLObject var32 = module0367.f25037(var31);
            final SubLObject var33 = module0365.f24850(var12);
            final SubLObject var34 = module0365.f24865(var12);
            if (NIL != module0363.f24562(var33)) {
                SubLObject var35 = (SubLObject)NIL;
                final SubLObject var36 = module0363.f24530(var33);
                SubLObject var37;
                SubLObject var38;
                SubLObject var39;
                SubLObject var40;
                SubLObject var41;
                SubLObject var42;
                for (var37 = module0032.f1741(var36), var38 = (SubLObject)NIL, var38 = module0032.f1742(var37, var36); NIL == var35 && NIL == module0032.f1744(var37, var38); var38 = module0032.f1743(var38)) {
                    var39 = module0032.f1745(var37, var38);
                    if (NIL != module0032.f1746(var38, var39) && NIL != module0364.f24748(var39, (SubLObject)$ic46$)) {
                        var40 = module0379.f26930(var39);
                        var41 = module0365.f24865(var40);
                        if (var41.eql(var34)) {
                            var42 = module0364.f24725(var39);
                            if (NIL != module0363.f24547(var42, var32)) {
                                var35 = (SubLObject)T;
                            }
                        }
                    }
                }
                return var35;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27315(final SubLObject var12, final SubLObject var42) {
        if (NIL == module0367.f24997(var42)) {
            return (SubLObject)NIL;
        }
        final SubLObject var43 = module0367.f25061(var42);
        if (NIL != module0360.f23934(var43)) {
            return (SubLObject)NIL;
        }
        final SubLObject var44 = module0367.f25203(var12, var42);
        return module0360.f23942(var44, var43);
    }
    
    public static SubLObject f27339(final SubLObject var31, final SubLObject var81) {
        return f27340(var31, var81, (SubLObject)NIL);
    }
    
    public static SubLObject f27316(final SubLObject var31, final SubLObject var81) {
        return f27340(var31, var81, (SubLObject)T);
    }
    
    public static SubLObject f27340(final SubLObject var31, final SubLObject var81, final SubLObject var38) {
        final SubLObject var82 = module0367.f25037(var31);
        if (NIL != var38) {
            return f27341(var82, var81);
        }
        return f27342(var82, var81);
    }
    
    public static SubLObject f27342(final SubLObject var56, final SubLObject var81) {
        return f27343(var56, var81, (SubLObject)NIL);
    }
    
    public static SubLObject f27341(final SubLObject var56, final SubLObject var81) {
        return f27343(var56, var81, (SubLObject)T);
    }
    
    public static SubLObject f27343(final SubLObject var56, final SubLObject var81, final SubLObject var38) {
        final SubLObject var82 = module0377.f26753(var81);
        if (NIL != var82 && NIL != module0414.f28916(var82, var56)) {
            if (NIL != var38) {
                return (SubLObject)$ic47$;
            }
            return (SubLObject)T;
        }
        else {
            final SubLObject var83 = module0365.f24850(var81);
            if (NIL != module0373.f26364(var56, var83)) {
                return (SubLObject)NIL;
            }
            if (NIL != var38) {
                return (SubLObject)$ic48$;
            }
            return (SubLObject)T;
        }
    }
    
    public static SubLObject f27344(final SubLObject var31, final SubLObject var81) {
        return f27345(var31, var81, (SubLObject)NIL);
    }
    
    public static SubLObject f27299(final SubLObject var31, final SubLObject var81) {
        final SubLThread var82 = SubLProcess.currentSubLThread();
        final SubLObject var83 = module0034.$g879$.getDynamicValue(var82);
        SubLObject var84 = (SubLObject)NIL;
        if (NIL == var83) {
            return f27344(var31, var81);
        }
        var84 = module0034.f1857(var83, (SubLObject)$ic49$, (SubLObject)UNPROVIDED);
        if (NIL == var84) {
            var84 = module0034.f1807(module0034.f1842(var83), (SubLObject)$ic49$, (SubLObject)TWO_INTEGER, (SubLObject)NIL, (SubLObject)EQ, (SubLObject)UNPROVIDED);
            module0034.f1860(var83, (SubLObject)$ic49$, var84);
        }
        final SubLObject var85 = module0034.f1782(var31, var81);
        final SubLObject var86 = module0034.f1814(var84, var85, (SubLObject)UNPROVIDED);
        if (var86 != $ic43$) {
            SubLObject var87 = var86;
            SubLObject var88 = (SubLObject)NIL;
            var88 = var87.first();
            while (NIL != var87) {
                SubLObject var89 = var88.first();
                final SubLObject var90 = conses_high.second(var88);
                if (var31.eql(var89.first())) {
                    var89 = var89.rest();
                    if (NIL != var89 && NIL == var89.rest() && var81.eql(var89.first())) {
                        return module0034.f1959(var90);
                    }
                }
                var87 = var87.rest();
                var88 = var87.first();
            }
        }
        final SubLObject var91 = Values.arg2(var82.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f27344(var31, var81)));
        module0034.f1836(var84, var85, var86, var91, (SubLObject)ConsesLow.list(var31, var81));
        return module0034.f1959(var91);
    }
    
    public static SubLObject f27300(final SubLObject var31, final SubLObject var81) {
        return f27345(var31, var81, (SubLObject)T);
    }
    
    public static SubLObject f27345(final SubLObject var31, final SubLObject var81, final SubLObject var38) {
        final SubLObject var82 = module0367.f25037(var31);
        if (NIL != var38) {
            return f27346(var82, var81);
        }
        return f27347(var82, var81);
    }
    
    public static SubLObject f27347(final SubLObject var56, final SubLObject var81) {
        return f27348(var56, var81, (SubLObject)NIL);
    }
    
    public static SubLObject f27346(final SubLObject var56, final SubLObject var81) {
        return f27348(var56, var81, (SubLObject)T);
    }
    
    public static SubLObject f27348(final SubLObject var56, final SubLObject var81, final SubLObject var38) {
        final SubLObject var82 = module0377.f26753(var81);
        if (NIL != var82 && NIL == inference_datastructures_inference_oc.f25607(var56) && NIL == inference_datastructures_inference_oc.f25608(var56, var82)) {
            if (NIL != var38) {
                return (SubLObject)$ic50$;
            }
            return (SubLObject)T;
        }
        else {
            if (NIL != module0377.f26766(var81)) {
                final SubLObject var83 = module0365.f24850(var81);
                if (NIL != f27333(var56, var83)) {
                    if (NIL != var38) {
                        return f27334(var56, var83);
                    }
                    return (SubLObject)T;
                }
            }
            final SubLObject var84 = inference_datastructures_inference_oc.f25505(var56);
            if (NIL == var84 && NIL != f27349(var81)) {
                if (NIL != var38) {
                    return (SubLObject)$ic51$;
                }
                return (SubLObject)T;
            }
            else {
                final SubLObject var85 = inference_datastructures_inference_oc.f25506(var56);
                if (NIL == var85 && NIL != f27350(var81)) {
                    if (NIL != var38) {
                        return (SubLObject)$ic52$;
                    }
                    return (SubLObject)T;
                }
                else {
                    final SubLObject var86 = inference_datastructures_inference_oc.f25507(var56);
                    if (NIL != var86 || NIL == f27351(var81)) {
                        return (SubLObject)NIL;
                    }
                    if (NIL != var38) {
                        return (SubLObject)$ic53$;
                    }
                    return (SubLObject)T;
                }
            }
        }
    }
    
    public static SubLObject f27352(final SubLObject var31, final SubLObject var43, final SubLObject var11) {
        final SubLObject var44 = module0367.f25037(var31);
        final SubLObject var45 = inference_datastructures_inference_oc.f25505(var44);
        if (NIL == var45 && NIL != f27353(var43, var11)) {
            return (SubLObject)T;
        }
        final SubLObject var46 = inference_datastructures_inference_oc.f25506(var44);
        if (NIL == var46 && NIL != f27354(var43)) {
            return (SubLObject)T;
        }
        final SubLObject var47 = inference_datastructures_inference_oc.f25507(var44);
        if (NIL == var47 && NIL != f27337(var11)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27349(final SubLObject var12) {
        final SubLObject var13 = module0365.f24865(var12);
        final SubLObject var14 = module0365.f24850(var12);
        return f27353(var13, var14);
    }
    
    public static SubLObject f27353(final SubLObject var43, final SubLObject var11) {
        if (NIL == module0340.f22976(var43)) {
            return (SubLObject)NIL;
        }
        if (NIL != f27355(var43)) {
            return (SubLObject)makeBoolean(NIL == module0363.f24562(var11) || NIL == f27336(var11));
        }
        if (NIL != f27335(var11)) {
            return (SubLObject)makeBoolean(NIL == module0340.f22981(var43));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27356(final SubLObject var12) {
        final SubLObject var13 = module0365.f24850(var12);
        if (NIL != module0363.f24562(var13)) {
            return f27336(var13);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27338(final SubLObject var70, final SubLObject var71) {
        final SubLObject var72 = module0205.f13333(var70);
        SubLObject var73 = (SubLObject)NIL;
        if (NIL != module0004.f104(var72, (SubLObject)$ic54$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            final SubLObject var74 = module0205.f13388(var70, (SubLObject)UNPROVIDED);
            if (NIL != module0173.f10955(var74)) {
                if (var72.eql($ic55$)) {
                    var73 = (SubLObject)makeBoolean(NIL != module0349.f23477(var74, var71) || NIL != module0349.f23473(var74, var71));
                }
                else if (var72.eql($ic56$)) {
                    var73 = (SubLObject)makeBoolean(NIL != module0349.f23477(var74, var71) || NIL != module0349.f23475(var74, var71));
                }
            }
            return var73;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27357(final SubLObject var12) {
        final SubLObject var13 = module0365.f24850(var12);
        return f27335(var13);
    }
    
    public static SubLObject f27358(final SubLObject var12) {
        return f27355(module0365.f24865(var12));
    }
    
    public static SubLObject f27355(final SubLObject var43) {
        final SubLObject var44 = module0340.f22877(var43);
        return module0333.f22416(var44);
    }
    
    public static SubLObject f27350(final SubLObject var12) {
        if (NIL != module0377.f26771(var12)) {
            final SubLObject var13 = module0365.f24865(var12);
            return f27354(var13);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27354(final SubLObject var43) {
        return module0525.f32785(var43);
    }
    
    public static SubLObject f27351(final SubLObject var12) {
        if (NIL != module0377.f26771(var12)) {
            final SubLObject var13 = module0365.f24850(var12);
            return f27337(var13);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27359(final SubLObject var12, final SubLObject var42) {
        return Equality.eq((SubLObject)$ic57$, module0367.f25197(var12, var42));
    }
    
    public static SubLObject f27360(final SubLObject var12, final SubLObject var42) {
        return Equality.eq((SubLObject)$ic58$, module0367.f25197(var12, var42));
    }
    
    public static SubLObject f27361(final SubLObject var12, final SubLObject var42) {
        return Equality.eq((SubLObject)$ic59$, module0367.f25197(var12, var42));
    }
    
    public static SubLObject f27362(final SubLObject var12, final SubLObject var42) {
        return Equality.eq((SubLObject)$ic60$, module0367.f25198(var12, var42));
    }
    
    public static SubLObject f27363(final SubLObject var12, final SubLObject var42) {
        return Equality.eq((SubLObject)$ic61$, module0367.f25198(var12, var42));
    }
    
    public static SubLObject f27364(final SubLObject var12, final SubLObject var42) {
        return Equality.eq((SubLObject)$ic62$, module0367.f25198(var12, var42));
    }
    
    public static SubLObject f27365(final SubLObject var12, final SubLObject var42) {
        return Equality.eq((SubLObject)$ic63$, module0367.f25198(var12, var42));
    }
    
    public static SubLObject f27366(final SubLObject var12, final SubLObject var42) {
        return (SubLObject)makeBoolean(NIL != f27364(var12, var42) || NIL != f27365(var12, var42));
    }
    
    public static SubLObject f27303(final SubLObject var11, final SubLObject var42, SubLObject var30) {
        if (var30 == UNPROVIDED) {
            var30 = (SubLObject)$ic64$;
        }
        if (NIL == module0361.f24163(module0363.f24507(var11))) {
            return (SubLObject)NIL;
        }
        SubLObject var43 = module0363.f24517(var11);
        SubLObject var44 = (SubLObject)NIL;
        var44 = var43.first();
        while (NIL != var43) {
            if (NIL != module0363.f24524(var44, var30) && NIL != module0363.f24518(var44, (SubLObject)$ic65$) && NIL != f27359(var44, var42)) {
                return (SubLObject)T;
            }
            var43 = var43.rest();
            var44 = var43.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27305(final SubLObject var11, final SubLObject var42, SubLObject var30) {
        if (var30 == UNPROVIDED) {
            var30 = (SubLObject)$ic64$;
        }
        final SubLThread var43 = SubLProcess.currentSubLThread();
        SubLObject var44 = module0363.f24517(var11);
        SubLObject var45 = (SubLObject)NIL;
        var45 = var44.first();
        while (NIL != var44) {
            if (NIL != module0363.f24524(var45, (SubLObject)$ic66$) && NIL != f27303(module0381.f27095(var45), var42, var30)) {
                return (SubLObject)T;
            }
            var44 = var44.rest();
            var45 = var44.first();
        }
        var44 = module0363.f24517(var11);
        SubLObject var46 = (SubLObject)NIL;
        var46 = var44.first();
        while (NIL != var44) {
            if (NIL != module0363.f24524(var46, (SubLObject)$ic67$)) {
                var43.resetMultipleValues();
                final SubLObject var47 = module0382.f27211(var46);
                final SubLObject var48 = var43.secondMultipleValue();
                var43.resetMultipleValues();
                if (NIL != f27303(var47, var42, var30) || NIL != f27303(var48, var42, var30)) {
                    return (SubLObject)T;
                }
            }
            var44 = var44.rest();
            var46 = var44.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27307(final SubLObject var11, final SubLObject var42, SubLObject var30) {
        if (var30 == UNPROVIDED) {
            var30 = (SubLObject)$ic64$;
        }
        return (SubLObject)makeBoolean(NIL != f27303(var11, var42, var30) || NIL != f27305(var11, var42, var30));
    }
    
    public static SubLObject f27367(final SubLObject var11, final SubLObject var42, SubLObject var30) {
        if (var30 == UNPROVIDED) {
            var30 = (SubLObject)$ic68$;
        }
        SubLObject var43 = module0363.f24517(var11);
        SubLObject var44 = (SubLObject)NIL;
        var44 = var43.first();
        while (NIL != var43) {
            if (NIL != module0363.f24524(var44, var30) && NIL != module0363.f24518(var44, (SubLObject)$ic65$) && NIL != f27362(var44, var42)) {
                return (SubLObject)T;
            }
            var43 = var43.rest();
            var44 = var43.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27309(final SubLObject var11, final SubLObject var30) {
        SubLObject var31 = module0363.f24517(var11);
        SubLObject var32 = (SubLObject)NIL;
        var32 = var31.first();
        while (NIL != var31) {
            if (NIL != module0363.f24524(var32, var30) && NIL != module0363.f24518(var32, (SubLObject)$ic65$)) {
                return (SubLObject)T;
            }
            var31 = var31.rest();
            var32 = var31.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27368(final SubLObject var31, final SubLObject var12) {
        if (NIL != f27369(var31)) {
            return (SubLObject)T;
        }
        final SubLObject var32 = module0367.f25094(var31, module0365.f24850(var12));
        return f27370(var32, var12);
    }
    
    public static SubLObject f27369(final SubLObject var31) {
        return Equality.eq((SubLObject)$ic69$, module0367.f25063(var31));
    }
    
    public static SubLObject f27370(final SubLObject var88, final SubLObject var12) {
        if ($ic69$ == var88) {
            return (SubLObject)T;
        }
        if ($ic70$ == var88) {
            return (SubLObject)NIL;
        }
        if (NIL != module0371.f25976(var88)) {
            return f27371(var88, var12);
        }
        if (NIL != f27372(var12)) {
            return (SubLObject)T;
        }
        if (NIL != module0376.f26619(var12)) {
            return f27373(var88, var12);
        }
        if (NIL != module0381.f27067(var12)) {
            return f27374(var88, var12);
        }
        if (NIL != module0382.f27206(var12)) {
            return f27375(var88, var12);
        }
        if (NIL != module0380.f26995(var12)) {
            return (SubLObject)T;
        }
        if (NIL != module0380.f26969(var12)) {
            return f27376(var88, var12);
        }
        if (NIL != module0375.f26586(var12)) {
            return f27377(var88, var12);
        }
        if (NIL != module0376.f26620(var12)) {
            return f27378(var88, var12);
        }
        if (NIL != module0377.f26771(var12)) {
            return f27379(var88, var12);
        }
        if (NIL != module0383.f27235(var12)) {
            return f27380(var88, var12);
        }
        return Errors.error((SubLObject)$ic71$, module0365.f24866(var12));
    }
    
    public static SubLObject f27372(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0365.f24819(var1) && (NIL != module0376.f26621(var1) || NIL != module0377.f26766(var1) || NIL != module0380.f26995(var1)));
    }
    
    public static SubLObject f27371(final SubLObject var88, final SubLObject var12) {
        SubLObject var89 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var88, var88, (SubLObject)$ic72$);
        var89 = var88.first();
        final SubLObject var90 = var88.rest();
        SubLObject var92;
        final SubLObject var91 = var92 = var90;
        SubLObject var93 = (SubLObject)NIL;
        var93 = var92.first();
        while (NIL != var92) {
            if (NIL != f27370(var93, var12)) {
                return (SubLObject)T;
            }
            var92 = var92.rest();
            var93 = var92.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27373(final SubLObject var88, final SubLObject var94) {
        if (NIL != module0371.f25943(var88)) {
            return f27381(var88, var94);
        }
        if (NIL != module0371.f25940(var88)) {
            return f27382(var88, var94);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27374(final SubLObject var88, final SubLObject var95) {
        if (NIL != module0371.f25937(var88)) {
            return f27383(var88, var95);
        }
        if (NIL != module0371.f25945(var88)) {
            return f27384(var88, var95);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27375(final SubLObject var88, final SubLObject var85) {
        if (NIL != module0371.f25938(var88)) {
            return f27385(var88, var85);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27376(final SubLObject var88, final SubLObject var96) {
        if (NIL != module0371.f25939(var88)) {
            return f27386(var88, var96);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27377(final SubLObject var88, final SubLObject var12) {
        if (NIL != module0371.f25940(var88)) {
            return f27387(var88, var12);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27378(final SubLObject var88, final SubLObject var12) {
        if (NIL != module0371.f25941(var88)) {
            return f27388(var88, var12);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27379(final SubLObject var88, final SubLObject var12) {
        if (NIL != module0371.f25944(var88)) {
            return f27389(var88, var12);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27380(final SubLObject var88, final SubLObject var97) {
        if (NIL != module0371.f25936(var88)) {
            return f27390(var88, var97);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27381(final SubLObject var98, final SubLObject var94) {
        SubLObject var99 = (SubLObject)NIL;
        SubLObject var100 = (SubLObject)NIL;
        SubLObject var101 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var98, var98, (SubLObject)$ic73$);
        var99 = var98.first();
        SubLObject var102 = var98.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var102, var98, (SubLObject)$ic73$);
        var100 = var102.first();
        var102 = var102.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var102, var98, (SubLObject)$ic73$);
        var101 = var102.first();
        var102 = var102.rest();
        if (NIL == var102) {
            final SubLObject var103 = module0365.f24850(var94);
            final SubLObject var104 = module0365.f24865(var94);
            return (SubLObject)makeBoolean(NIL != f27391(var100, var103) && NIL != f27392(var101, var104));
        }
        cdestructuring_bind.cdestructuring_bind_error(var98, (SubLObject)$ic73$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27382(final SubLObject var104, final SubLObject var94) {
        SubLObject var105 = (SubLObject)NIL;
        SubLObject var106 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var104, var104, (SubLObject)$ic74$);
        var105 = var104.first();
        SubLObject var107 = var104.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var107, var104, (SubLObject)$ic74$);
        var106 = var107.first();
        var107 = var107.rest();
        if (NIL == var107) {
            return f27370(var106, var94);
        }
        cdestructuring_bind.cdestructuring_bind_error(var104, (SubLObject)$ic74$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27386(final SubLObject var108, final SubLObject var96) {
        final SubLObject var109 = module0380.f26972(var96);
        final SubLObject var110 = module0371.f25965(var108);
        SubLObject var111 = (SubLObject)NIL;
        final SubLObject var112 = var109;
        SubLObject var113;
        SubLObject var114;
        SubLObject var115;
        SubLObject var116;
        SubLObject var117;
        SubLObject var118;
        SubLObject var113_115;
        SubLObject var119;
        for (var113 = (SubLObject)NIL, var113 = module0364.f24735(var112); NIL == var111 && NIL != var113; var113 = var113.rest()) {
            var114 = var113.first();
            if (NIL != module0339.f22743((SubLObject)NIL, var112, var114)) {
                var115 = module0364.f24736(var114);
                var116 = module0364.f24737(var114);
                if (NIL == var111) {
                    var117 = var110;
                    var118 = (SubLObject)NIL;
                    var118 = var117.first();
                    while (NIL == var111 && NIL != var117) {
                        if (NIL == var111) {
                            for (var113_115 = module0363.f24517(var115), var119 = (SubLObject)NIL, var119 = var113_115.first(); NIL == var111 && NIL != var113_115; var111 = f27370(var118, var119), var113_115 = var113_115.rest(), var119 = var113_115.first()) {}
                        }
                        var117 = var117.rest();
                        var118 = var117.first();
                    }
                }
            }
        }
        return var111;
    }
    
    public static SubLObject f27387(final SubLObject var88, final SubLObject var116) {
        return (SubLObject)T;
    }
    
    public static SubLObject f27388(final SubLObject var88, final SubLObject var117) {
        return (SubLObject)T;
    }
    
    public static SubLObject f27383(final SubLObject var88, final SubLObject var95) {
        final SubLObject var96 = module0371.f25966(var88);
        final SubLObject var97 = module0381.f27095(var95);
        return module0371.f26047(var96, var97);
    }
    
    public static SubLObject f27390(final SubLObject var88, final SubLObject var97) {
        final SubLObject var98 = module0371.f25967(var88);
        final SubLObject var99 = module0383.f27248(var97);
        return module0371.f26047(var98, var99);
    }
    
    public static SubLObject f27384(final SubLObject var88, final SubLObject var95) {
        return (SubLObject)T;
    }
    
    public static SubLObject f27385(final SubLObject var88, final SubLObject var85) {
        return (SubLObject)T;
    }
    
    public static SubLObject f27389(final SubLObject var122, final SubLObject var81) {
        SubLObject var123 = (SubLObject)NIL;
        SubLObject var124 = (SubLObject)NIL;
        SubLObject var125 = (SubLObject)NIL;
        SubLObject var126 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var122, var122, (SubLObject)$ic75$);
        var123 = var122.first();
        SubLObject var127 = var122.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var127, var122, (SubLObject)$ic75$);
        var124 = var127.first();
        var127 = var127.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var127, var122, (SubLObject)$ic75$);
        var125 = var127.first();
        var127 = var127.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var127, var122, (SubLObject)$ic75$);
        var126 = var127.first();
        var127 = var127.rest();
        final SubLObject var128 = (SubLObject)(var127.isCons() ? var127.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var127, var122, (SubLObject)$ic75$);
        var127 = var127.rest();
        if (NIL == var127) {
            final SubLObject var129 = module0365.f24850(var81);
            final SubLObject var130 = module0365.f24865(var81);
            final SubLObject var131 = module0377.f26753(var81);
            return (SubLObject)makeBoolean(NIL != f27391(var124, var129) && NIL != f27393(var125, var130) && (NIL == var131 || NIL != f27394(var126, var131)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var122, (SubLObject)$ic75$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27395(final SubLObject var128) {
        SubLObject var129 = (SubLObject)NIL;
        SubLObject var130 = (SubLObject)NIL;
        SubLObject var131 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var128, var128, (SubLObject)$ic76$);
        var130 = var128.first();
        SubLObject var132 = var128.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var132, var128, (SubLObject)$ic76$);
        var131 = var132.first();
        var132 = var132.rest();
        if (NIL == var132) {
            SubLObject var133 = var130;
            SubLObject var134 = (SubLObject)NIL;
            var134 = var133.first();
            while (NIL != var133) {
                SubLObject var137_138;
                final SubLObject var135_136 = var137_138 = var134;
                SubLObject var135 = (SubLObject)NIL;
                SubLObject var136 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var137_138, var135_136, (SubLObject)$ic77$);
                var135 = var137_138.first();
                var137_138 = var137_138.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var137_138, var135_136, (SubLObject)$ic77$);
                var136 = var137_138.first();
                var137_138 = var137_138.rest();
                if (NIL == var137_138) {
                    var129 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list($ic78$, var135, (SubLObject)ConsesLow.list($ic79$, var136)), var129);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var135_136, (SubLObject)$ic77$);
                }
                var133 = var133.rest();
                var134 = var133.first();
            }
            var133 = var131;
            SubLObject var137 = (SubLObject)NIL;
            var137 = var133.first();
            while (NIL != var133) {
                SubLObject var143_144;
                final SubLObject var141_142 = var143_144 = var137;
                SubLObject var135 = (SubLObject)NIL;
                SubLObject var136 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var143_144, var141_142, (SubLObject)$ic77$);
                var135 = var143_144.first();
                var143_144 = var143_144.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var143_144, var141_142, (SubLObject)$ic77$);
                var136 = var143_144.first();
                var143_144 = var143_144.rest();
                if (NIL == var143_144) {
                    var129 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list($ic78$, var135, var136), var129);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var141_142, (SubLObject)$ic77$);
                }
                var133 = var133.rest();
                var137 = var133.first();
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var128, (SubLObject)$ic76$);
        }
        return Sequences.nreverse(var129);
    }
    
    public static SubLObject f27396(final SubLObject var145) {
        return module0202.f12883(var145, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f27391(final SubLObject var102, final SubLObject var11) {
        final SubLThread var103 = SubLProcess.currentSubLThread();
        var103.resetMultipleValues();
        final SubLObject var104 = module0363.f24569(var11);
        final SubLObject var105 = var103.secondMultipleValue();
        final SubLObject var106 = var103.thirdMultipleValue();
        var103.resetMultipleValues();
        var103.resetMultipleValues();
        final SubLObject var107 = f27397(var102);
        final SubLObject var108 = var103.secondMultipleValue();
        final SubLObject var109 = var103.thirdMultipleValue();
        var103.resetMultipleValues();
        return (SubLObject)makeBoolean(var106.eql(var109) && NIL != f27398(var107, var104) && NIL != f27399(var108, var105));
    }
    
    public static SubLObject f27397(final SubLObject var152) {
        final SubLObject var153 = module0205.f13203(var152, (SubLObject)UNPROVIDED);
        SubLObject var154 = module0205.f13204(var152, (SubLObject)UNPROVIDED);
        SubLObject var155 = (SubLObject)$ic80$;
        if (NIL != module0202.f12592(var154)) {
            var155 = (SubLObject)$ic81$;
            var154 = module0205.f13203(var154, (SubLObject)UNPROVIDED);
        }
        return Values.values(var153, var154, var155);
    }
    
    public static SubLObject f27392(final SubLObject var103, final SubLObject var43) {
        return (SubLObject)makeBoolean(NIL != module0340.f22913(var43) && NIL != f27400(var103, var43));
    }
    
    public static SubLObject f27393(final SubLObject var126, final SubLObject var43) {
        return (SubLObject)makeBoolean(NIL != module0340.f22976(var43) && NIL != f27400(var126, var43));
    }
    
    public static SubLObject f27398(final SubLObject var149, final SubLObject var71) {
        return (SubLObject)makeBoolean(NIL != module0234.f15434(var149, var71) || NIL != module0337.f22626(var149, var71));
    }
    
    public static SubLObject f27399(final SubLObject var150, final SubLObject var147) {
        return (SubLObject)makeBoolean(NIL != module0234.f15434(var150, var147) || NIL != module0337.f22626(var150, var147) || NIL != module0234.f15434(conses_high.subst(module0193.f12075((SubLObject)ZERO_INTEGER), (SubLObject)$ic69$, var150, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var147));
    }
    
    public static SubLObject f27400(final SubLObject var154, final SubLObject var43) {
        if (NIL != module0340.f22789(var43)) {
            final SubLObject var155 = module0340.f22825(var43);
            return module0062.f4489(var154, var155);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27394(final SubLObject var127, final SubLObject var58) {
        if (NIL != module0178.f11290(var58)) {
            return module0062.f4489(var127, var58);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27401() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27258", "S#30359", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27259", "S#30360", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0384", "f27260", "S#30361");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0384", "f27261", "S#30362");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27262", "S#30363", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27265", "S#30364", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0384", "f27266", "S#30365");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27267", "S#30366", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27268", "S#30367", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27269", "S#30368", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27264", "S#30369", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27270", "S#30370", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27263", "S#30371", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27271", "S#30372", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27272", "S#30373", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27273", "S#30374", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27274", "S#30375", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27275", "S#29321", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27276", "S#30376", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27278", "S#30377", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27280", "S#30378", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27281", "S#30379", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27282", "S#30380", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27283", "S#30381", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27284", "S#30382", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27286", "S#30383", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27287", "S#29297", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27288", "S#30384", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27290", "S#30385", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27289", "S#30386", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27277", "S#30387", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27296", "S#30388", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27295", "S#30389", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27297", "S#29249", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27304", "S#30390", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27306", "S#30391", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27308", "S#30392", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27301", "S#29193", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27310", "S#30393", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27311", "S#30394", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27294", "S#30395", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27312", "S#30396", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27285", "S#30397", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27302", "S#30398", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27314", "S#30399", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27317", "S#30400", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27279", "S#29245", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27318", "S#30401", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27319", "S#30402", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27292", "S#29288", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27291", "S#30403", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27320", "S#30404", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27321", "S#30405", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27322", "S#29307", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27323", "S#30406", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27324", "S#26781", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27325", "S#30407", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27313", "S#30408", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27326", "S#30409", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27327", "S#30410", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27293", "S#30411", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27328", "S#30412", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27329", "S#30413", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27330", "S#30414", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27331", "S#30415", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27333", "S#30416", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27334", "S#30417", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27332", "S#30418", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27336", "S#30419", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27335", "S#30420", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27337", "S#30421", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27298", "S#30422", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27315", "S#30423", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27339", "S#30424", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27316", "S#30425", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27340", "S#30426", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27342", "S#30427", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27341", "S#30428", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27343", "S#30429", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27344", "S#30430", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27299", "S#30431", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27300", "S#30432", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27345", "S#30433", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27347", "S#30434", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27346", "S#30435", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27348", "S#30436", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27352", "S#30437", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27349", "S#30438", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27353", "S#30439", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27356", "S#30440", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27338", "S#30441", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27357", "S#30442", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27358", "S#30443", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27355", "S#30444", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27350", "S#30445", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27354", "S#30446", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27351", "S#30447", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27359", "S#27374", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27360", "S#30448", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27361", "S#30449", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27362", "S#30164", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27363", "S#30450", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27364", "S#30451", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27365", "S#30452", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27366", "S#30453", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27303", "S#29248", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27305", "S#30454", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27307", "S#30455", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27367", "S#30456", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27309", "S#30457", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27368", "S#29192", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27369", "S#30458", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27370", "S#30459", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27372", "S#30460", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27371", "S#30461", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27373", "S#30462", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27374", "S#30463", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27375", "S#30464", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27376", "S#30465", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27377", "S#30466", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27378", "S#30467", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27379", "S#30468", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27380", "S#30469", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27381", "S#30470", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27382", "S#30471", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27386", "S#30472", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27387", "S#30473", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27388", "S#30474", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27383", "S#30475", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27390", "S#30476", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27384", "S#30477", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27385", "S#30478", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27389", "S#30479", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27395", "S#30480", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27396", "S#30481", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27391", "S#28952", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27397", "S#30482", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27392", "S#30483", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27393", "S#30484", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27398", "S#30485", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27399", "S#30486", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27400", "S#30487", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0384", "f27394", "S#29317", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27402() {
        $g3227$ = SubLFiles.defparameter("S#30488", (SubLObject)$ic0$);
        $g3228$ = SubLFiles.deflexical("S#30489", (SubLObject)$ic1$);
        $g3229$ = SubLFiles.defparameter("S#30490", (SubLObject)NIL);
        $g3230$ = SubLFiles.deflexical("S#30491", (SubLObject)$ic17$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27403() {
        module0002.f50((SubLObject)$ic5$, (SubLObject)$ic6$);
        module0034.f1895((SubLObject)$ic42$);
        module0034.f1895((SubLObject)$ic49$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f27401();
    }
    
    public void initializeVariables() {
        f27402();
    }
    
    public void runTopLevelForms() {
        f27403();
    }
    
    static {
        me = (SubLFile)new module0384();
        $g3227$ = null;
        $g3228$ = null;
        $g3229$ = null;
        $g3230$ = null;
        $ic0$ = makeKeyword("UNINITIALIZED");
        $ic1$ = ConsesLow.list((SubLObject)makeKeyword("UNKNOWN-REASON"), (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
        $ic2$ = makeSymbol("CLET");
        $ic3$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#30488", "CYC"), (SubLObject)NIL), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#30490", "CYC"), (SubLObject)T));
        $ic4$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#30490", "CYC"), (SubLObject)NIL));
        $ic5$ = makeSymbol("S#30363", "CYC");
        $ic6$ = makeSymbol("S#30365", "CYC");
        $ic7$ = makeSymbol("S#30369", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("S#30492", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#24274", "CYC"), (SubLObject)makeSymbol("S#24101", "CYC"), (SubLObject)makeSymbol("S#24487", "CYC"), (SubLObject)makeSymbol("S#30493", "CYC")));
        $ic9$ = ConsesLow.list((SubLObject)makeKeyword("PROBLEM"), (SubLObject)makeKeyword("TACTIC"), (SubLObject)makeKeyword("LINK"), (SubLObject)makeKeyword("SUBEXPLANATION"));
        $ic10$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic11$ = makeKeyword("PROBLEM");
        $ic12$ = makeKeyword("TACTIC");
        $ic13$ = makeKeyword("LINK");
        $ic14$ = makeKeyword("SUBEXPLANATION");
        $ic15$ = makeSymbol("PWHEN");
        $ic16$ = makeSymbol("S#30490", "CYC");
        $ic17$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)makeKeyword("STRATEGY-THROWS-AWAY-ALL-TRANSFORMATION"), (SubLObject)makeString(":strategy does not permit transformation at all")), ConsesLow.list((SubLObject)makeKeyword("STRATEGY-SETS-ASIDE-ALL-TRANSFORMATION"), (SubLObject)makeString(":strategy does not permit transformation with the current resource constraints")), ConsesLow.list((SubLObject)makeKeyword("PROBLEM-ALREADY-THROWN-AWAY"), (SubLObject)makeString(":problem was already noted to be pending")), ConsesLow.list((SubLObject)makeKeyword("PROBLEM-HAS-NO-TRANSFORMATION-TACTICS"), (SubLObject)makeString(":problem has no transformation tactics")), ConsesLow.list((SubLObject)makeKeyword("PROBLEM-STRATEGY-NOT-CONTINUABLE"), (SubLObject)makeString(":strategy is not continuable, and :problem was set aside because :subexplanation")), ConsesLow.list((SubLObject)makeKeyword("PROBLEM-HAS-NO-MORE-ACTIVE-REMOVAL-STRATEGEMS"), (SubLObject)makeString(":problem has deactivated all its active removal strategems")), ConsesLow.list((SubLObject)makeKeyword("PROBLEM-HAS-NO-MORE-ACTIVE-TRANSFORMATION-STRATEGEMS"), (SubLObject)makeString(":problem has deactivated all its active transformation strategems")), ConsesLow.list((SubLObject)makeKeyword("PROBLEM-HAS-NO-ACTIVATIBLE-REMOVAL-STRATEGEMS"), (SubLObject)makeString("when determining removal strategems for :problem, :strategy found none it wished to activate")), ConsesLow.list((SubLObject)makeKeyword("PROBLEM-HAS-NO-ACTIVATIBLE-TRANSFORMATION-STRATEGEMS"), (SubLObject)makeString("when determining transformation strategems for :problem, :strategy found none it wished to activate")), ConsesLow.list((SubLObject)makeKeyword("PROBLEM-HAS-NON-ABDUCIBLE-RULE-TRANSFORMATION-LINK"), (SubLObject)makeString("rules associated with tranformation links for :problem were #$NonAbducibleRule so :strategy discarded the abduction strategm")), ConsesLow.list((SubLObject)makeKeyword("DONT-DO-ABDUCTION-ON-GOOD-PROBLEM"), (SubLObject)makeString("problem :problem already deemed good so :strategy discarded the abduction strategm")), ConsesLow.list((SubLObject)makeKeyword("DONT-TRANSFORM-ON-PROBLEM-WITH-ABDUCED-TERM"), (SubLObject)makeString("problem :problem has an abduced term so :strategy discarded problem wrt transformation")), ConsesLow.list((SubLObject)makeKeyword("ALL-TACTICS-THROWN-AWAY"), (SubLObject)makeString("all of :problem's tactics are thrown away")), ConsesLow.list((SubLObject)makeKeyword("NEW-ROOT-PENDING-WRT-MOTIVATION"), (SubLObject)makeString(":problem has already propagated both R and T")), ConsesLow.list((SubLObject)makeKeyword("PROBLEM-ALREADY-SET-ASIDE"), (SubLObject)makeString(":problem was already noted to be set aside")), ConsesLow.list((SubLObject)makeKeyword("ALL-TACTICS-SET-ASIDE"), (SubLObject)makeString("all of :problem's tactics are set aside")), ConsesLow.list((SubLObject)makeKeyword("TACTIC-ALREADY-THROWN-AWAY"), (SubLObject)makeString(":tactic was already noted to be finished")), ConsesLow.list((SubLObject)makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-PROBLEM-THROWN-AWAY"), (SubLObject)makeString(":tactic is thrown away because :subexplanation")), ConsesLow.list((SubLObject)makeKeyword("TACTIC-HL-MODULE-THROWN-AWAY"), (SubLObject)makeString(":tactic uses module :tactic-hl-module, which is always thrown away")), ConsesLow.list((SubLObject)makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-LOOKAHEAD-PROBLEM-THROWN-AWAY"), (SubLObject)makeString("executing :tactic would motivate a problem that is thrown away because :subexplanation")), ConsesLow.list((SubLObject)makeKeyword("SPLIT-TACTIC-THROWN-AWAY-BECAUSE-SIBLING-TACTIC-THROWN-AWAY"), (SubLObject)makeString(":tactic has a sibling split tactic that is thrown away because :subexplanation")), ConsesLow.list((SubLObject)makeKeyword("TACTIC-STRATEGY-NOT-CONTINUABLE"), (SubLObject)makeString(":strategy is not continuable, and :tactic was set aside because :subexplanation")), ConsesLow.list((SubLObject)makeKeyword("META-REMOVAL-TACTIC-THROWN-AWAY"), (SubLObject)makeString(":tactic is a meta-removal tactic, and some other tactically possible tactics on the problem are strategically disallowed")), ConsesLow.list((SubLObject)makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-COMPLETE-SIBLING-CONJUNCTIVE-REMOVAL"), (SubLObject)makeString(":tactic has a sibling conjunctive removal tactic that is complete")), ConsesLow.list((SubLObject)makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-SIBLING-BACKCHAIN-REQUIRED"), (SubLObject)makeString(":tactic has a sibling join-ordered tactic that focuses on a backchain required problem")), ConsesLow.list((SubLObject)makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-SIBLING-IS-A-SIMPLIFICATION"), (SubLObject)makeString(":tactic has a sibling tactic that is a simplification")), ConsesLow.list((SubLObject)makeKeyword("TACTIC-ALREADY-SET-ASIDE"), (SubLObject)makeString(":tactic was already noted to be set aside")), ConsesLow.list((SubLObject)makeKeyword("TACTIC-SET-ASIDE-BECAUSE-PROBLEM-SET-ASIDE"), (SubLObject)makeString(":tactic is set aside because :subexplanation")), ConsesLow.list((SubLObject)makeKeyword("TACTIC-GENERATED-ENOUGH"), (SubLObject)makeString(":tactic has already generated enough transformation tactics")), ConsesLow.list((SubLObject)makeKeyword("TACTIC-SET-ASIDE-BECAUSE-LOOKAHEAD-PROBLEM-SET-ASIDE"), (SubLObject)makeString("executing :tactic would motivate a problem that is set aside because :subexplanation")), ConsesLow.list((SubLObject)makeKeyword("SPLIT-TACTIC-SET-ASIDE-BECAUSE-SIBLING-TACTIC-THROWN-AWAY"), (SubLObject)makeString(":tactic has a sibling split tactic that is thrown away because :subexplanation")), ConsesLow.list((SubLObject)makeKeyword("SPLIT-TACTIC-SET-ASIDE-BECAUSE-SIBLING-TACTIC-SET-ASIDE"), (SubLObject)makeString(":tactic has a sibling split tactic that is set aside wrt both removal and transformation, because :subexplanation")), ConsesLow.list((SubLObject)makeKeyword("LOGICAL-TACTIC-EXCEEDS-MAX-TRANSFORMATION-DEPTH"), (SubLObject)makeString(":tactic leads past the :max-transformation-depth")), ConsesLow.list((SubLObject)makeKeyword("JOIN-ORDERED-TACTIC-LEADS-TO-SET-ASIDE-CONJUNCTIVE-REMOVALS"), (SubLObject)makeString(":tactic leads to a conjunctive focal problem where all conjunctive removals are set aside")), ConsesLow.list((SubLObject)makeKeyword("LINK-SUPPORTED-PROBLEM-THROWN-AWAY"), (SubLObject)makeString(":link's supported problem is thrown away because :subexplanation")), ConsesLow.list((SubLObject)makeKeyword("SIBLING-EARLY-REMOVAL-LINK"), (SubLObject)makeString(":link has a sibling link :subexplanation")), ConsesLow.list((SubLObject)makeKeyword("EARLY-REMOVAL-LINK"), (SubLObject)makeString(":link, which is an early removal link")), ConsesLow.list((SubLObject)makeKeyword("LINK-RULE-DISALLOWED"), (SubLObject)makeString(":link uses a disallowed rule")), ConsesLow.list((SubLObject)makeKeyword("LINK-SUPPORTED-PROBLEM-SET-ASIDE"), (SubLObject)makeString(":link's supported problem is set aside because :subexplanation")), ConsesLow.list((SubLObject)makeKeyword("LINK-EXCEEDS-MAX-TRANSFORMATION-DEPTH"), (SubLObject)makeString(":link leads past the :max-transformation-depth")), ConsesLow.list((SubLObject)makeKeyword("UNKNOWN-REASON"), (SubLObject)makeString("an unknown reason")) });
        $ic18$ = ConsesLow.list((SubLObject)makeSymbol("TYPE"), (SubLObject)makeSymbol("S#24274", "CYC"), (SubLObject)makeSymbol("S#24101", "CYC"), (SubLObject)makeSymbol("S#24487", "CYC"), (SubLObject)makeSymbol("S#30493", "CYC"));
        $ic19$ = makeSymbol("S#30368", "CYC");
        $ic20$ = makeSymbol("S#26082", "CYC");
        $ic21$ = makeSymbol("S#26790", "CYC");
        $ic22$ = makeSymbol("S#27381", "CYC");
        $ic23$ = ConsesLow.list((SubLObject)NIL, (SubLObject)makeKeyword("SET-ASIDE"), (SubLObject)makeKeyword("THROW-AWAY"), (SubLObject)makeKeyword("IRRELEVANT"));
        $ic24$ = makeKeyword("THROW-AWAY-PROBLEM");
        $ic25$ = makeKeyword("THROW-AWAY-TACTIC");
        $ic26$ = makeKeyword("SET-ASIDE-PROBLEM");
        $ic27$ = makeKeyword("SET-ASIDE-TACTIC");
        $ic28$ = makeString("problem is tactically uninteresting");
        $ic29$ = makeString("strategy has enough proofs for problem");
        $ic30$ = makeString("inference is not continuable, and ");
        $ic31$ = makeString("tactic is discarded");
        $ic32$ = makeString("non-good problem has already executed a complete removal tactic");
        $ic33$ = makeString("rewrite tactic is redundant");
        $ic34$ = makeString("HL module is forbidden");
        $ic35$ = makeKeyword("GENERALIZED-REMOVAL");
        $ic36$ = makeString("problem is strategically no-good");
        $ic37$ = makeString("tactic exceeds productivity limit");
        $ic38$ = makeSymbol("S#27373", "CYC");
        $ic39$ = makeKeyword("TRANSFORMATION");
        $ic40$ = makeString("problem exceeds max proof depth");
        $ic41$ = makeString("proof checker mode is enabled and no allowed rules were used to link to this problem");
        $ic42$ = makeSymbol("S#30416", "CYC");
        $ic43$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic44$ = makeString("problem uses an HL predicate, HL and unbound predicate transformation are forbidden, and #$collectionBackchainEncouraged does not apply");
        $ic45$ = makeString("problem uses an evaluatable predicate and evaluatable predicate transformation is forbidden");
        $ic46$ = makeKeyword("REWRITE");
        $ic47$ = makeString("the rule for this tactic has an insuffiently high historical utility");
        $ic48$ = makeString("problem exceeds max transformation depth");
        $ic49$ = makeSymbol("S#30431", "CYC");
        $ic50$ = makeString("proof checker mode is enabled, and the rule for this tactic is forbidden");
        $ic51$ = makeString("tactic requires HL predicate transformation, which is forbidden");
        $ic52$ = makeString("tactic requires unbound predicate transformation, which is forbidden");
        $ic53$ = makeString("tactic requires evaluatable predicate transformation, which is forbidden");
        $ic54$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), constant_handles_oc.f8479((SubLObject)makeString("genls")));
        $ic55$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic56$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic57$ = makeKeyword("COMPLETE");
        $ic58$ = makeKeyword("INCOMPLETE");
        $ic59$ = makeKeyword("IMPOSSIBLE");
        $ic60$ = makeKeyword("PREFERRED");
        $ic61$ = makeKeyword("DISPREFERRED");
        $ic62$ = makeKeyword("DISALLOWED");
        $ic63$ = makeKeyword("DOOMED");
        $ic64$ = makeKeyword("CONTENT");
        $ic65$ = makeKeyword("EXECUTED");
        $ic66$ = makeKeyword("JOIN-ORDERED");
        $ic67$ = makeKeyword("JOIN");
        $ic68$ = makeKeyword("LOGICAL");
        $ic69$ = makeKeyword("ANYTHING");
        $ic70$ = makeKeyword("NOTHING");
        $ic71$ = makeString("Time to support proof-spec admittance on ~S tactics");
        $ic72$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#29122", "CYC"));
        $ic73$ = ConsesLow.list((SubLObject)makeSymbol("S#30494", "CYC"), (SubLObject)makeSymbol("S#29105", "CYC"), (SubLObject)makeSymbol("S#30495", "CYC"));
        $ic74$ = ConsesLow.list((SubLObject)makeSymbol("S#30496", "CYC"), (SubLObject)makeSymbol("S#29125", "CYC"));
        $ic75$ = ConsesLow.list((SubLObject)makeSymbol("S#30497", "CYC"), (SubLObject)makeSymbol("S#29105", "CYC"), (SubLObject)makeSymbol("S#29106", "CYC"), (SubLObject)makeSymbol("S#29107", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#29125", "CYC"));
        $ic76$ = ConsesLow.list((SubLObject)makeSymbol("NEG-LITS"), (SubLObject)makeSymbol("POS-LITS"));
        $ic77$ = ConsesLow.list((SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#14349", "CYC"));
        $ic78$ = constant_handles_oc.f8479((SubLObject)makeString("ist"));
        $ic79$ = constant_handles_oc.f8479((SubLObject)makeString("not"));
        $ic80$ = makeKeyword("POS");
        $ic81$ = makeKeyword("NEG");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 504 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/