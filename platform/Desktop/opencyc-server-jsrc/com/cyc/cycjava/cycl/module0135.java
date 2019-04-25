package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0135 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0135";
    public static final String myFingerPrint = "3008f15e60c7eb93b68b385ad71952d8914e6c5c8e4ab44cd3f9919eef3d8a83";
    public static SubLSymbol $g1586$;
    private static SubLSymbol $g1587$;
    public static SubLSymbol $g1588$;
    private static SubLSymbol $g1589$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLList $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
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
    private static final SubLString $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLString $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLString $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
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
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
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
    private static final SubLList $ic70$;
    private static final SubLList $ic71$;
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
    private static final SubLList $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLList $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLList $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    
    public static SubLObject f8819() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0140.f9094(module0135.$g1586$.getDynamicValue(var1));
    }
    
    public static SubLObject f8820(final SubLObject var2, final SubLObject var3) {
        final SubLObject var4 = var2.rest();
        final SubLObject var6;
        final SubLObject var5 = var6 = var4;
        return (SubLObject)ConsesLow.listS((SubLObject)module0135.$ic0$, (SubLObject)module0135.$ic1$, ConsesLow.append(var6, (SubLObject)module0135.NIL));
    }
    
    public static SubLObject f8821() {
        final SubLObject var7 = f8822();
        return (module0135.NIL != var7) ? var7 : f8823((SubLObject)module0135.UNPROVIDED);
    }
    
    public static SubLObject f8822() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return (SubLObject)((module0135.NIL != f8819()) ? module0140.f9106(module0135.$g1586$.getDynamicValue(var1)) : module0135.NIL);
    }
    
    public static SubLObject f8824(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (module0135.NIL != f8819() && (!module0135.$g1587$.getGlobalValue().isInteger() || !module0140.f9102(module0135.$g1586$.getDynamicValue(var9)).numGE(module0135.$g1587$.getGlobalValue()))) {
            module0140.f9105(var8, module0135.$g1586$.getDynamicValue(var9));
        }
        return (SubLObject)module0135.NIL;
    }
    
    public static SubLObject f8825(final SubLObject var9, final SubLObject var10) {
        f8826(var9, var10, (SubLObject)module0135.ZERO_INTEGER);
        return (SubLObject)module0135.NIL;
    }
    
    public static SubLObject f8827(final SubLObject var9) {
        return (SubLObject)((var9.getClass() == $sX11003_native.class) ? module0135.T : module0135.NIL);
    }
    
    public static SubLObject f8828(final SubLObject var9) {
        assert module0135.NIL != f8827(var9) : var9;
        return var9.getField2();
    }
    
    public static SubLObject f8829(final SubLObject var9) {
        assert module0135.NIL != f8827(var9) : var9;
        return var9.getField3();
    }
    
    public static SubLObject f8830(final SubLObject var9) {
        assert module0135.NIL != f8827(var9) : var9;
        return var9.getField4();
    }
    
    public static SubLObject f8831(final SubLObject var9) {
        assert module0135.NIL != f8827(var9) : var9;
        return var9.getField5();
    }
    
    public static SubLObject f8832(final SubLObject var9, final SubLObject var12) {
        assert module0135.NIL != f8827(var9) : var9;
        return var9.setField2(var12);
    }
    
    public static SubLObject f8833(final SubLObject var9, final SubLObject var12) {
        assert module0135.NIL != f8827(var9) : var9;
        return var9.setField3(var12);
    }
    
    public static SubLObject f8834(final SubLObject var9, final SubLObject var12) {
        assert module0135.NIL != f8827(var9) : var9;
        return var9.setField4(var12);
    }
    
    public static SubLObject f8835(final SubLObject var9, final SubLObject var12) {
        assert module0135.NIL != f8827(var9) : var9;
        return var9.setField5(var12);
    }
    
    public static SubLObject f8823(SubLObject var13) {
        if (var13 == module0135.UNPROVIDED) {
            var13 = (SubLObject)module0135.NIL;
        }
        final SubLObject var14 = (SubLObject)new $sX11003_native();
        SubLObject var15;
        SubLObject var16;
        SubLObject var17;
        SubLObject var18;
        for (var15 = (SubLObject)module0135.NIL, var15 = var13; module0135.NIL != var15; var15 = conses_high.cddr(var15)) {
            var16 = var15.first();
            var17 = conses_high.cadr(var15);
            var18 = var16;
            if (var18.eql((SubLObject)module0135.$ic19$)) {
                f8832(var14, var17);
            }
            else if (var18.eql((SubLObject)module0135.$ic20$)) {
                f8833(var14, var17);
            }
            else if (var18.eql((SubLObject)module0135.$ic21$)) {
                f8834(var14, var17);
            }
            else if (var18.eql((SubLObject)module0135.$ic22$)) {
                f8835(var14, var17);
            }
            else {
                Errors.error((SubLObject)module0135.$ic23$, var16);
            }
        }
        return var14;
    }
    
    public static SubLObject f8836(final SubLObject var19, final SubLObject var20) {
        Functions.funcall(var20, var19, (SubLObject)module0135.$ic24$, (SubLObject)module0135.$ic25$, (SubLObject)module0135.FOUR_INTEGER);
        Functions.funcall(var20, var19, (SubLObject)module0135.$ic26$, (SubLObject)module0135.$ic19$, f8828(var19));
        Functions.funcall(var20, var19, (SubLObject)module0135.$ic26$, (SubLObject)module0135.$ic20$, f8829(var19));
        Functions.funcall(var20, var19, (SubLObject)module0135.$ic26$, (SubLObject)module0135.$ic21$, f8830(var19));
        Functions.funcall(var20, var19, (SubLObject)module0135.$ic26$, (SubLObject)module0135.$ic22$, f8831(var19));
        Functions.funcall(var20, var19, (SubLObject)module0135.$ic27$, (SubLObject)module0135.$ic25$, (SubLObject)module0135.FOUR_INTEGER);
        return var19;
    }
    
    public static SubLObject f8837(final SubLObject var19, final SubLObject var20) {
        return f8836(var19, var20);
    }
    
    public static SubLObject f8826(final SubLObject var21, final SubLObject var10, final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0135.NIL != print_high.$print_readably$.getDynamicValue(var23)) {
            print_high.print_not_readable(var21, var10);
        }
        else {
            streams_high.write_string((SubLObject)module0135.$ic29$, var10, (SubLObject)module0135.UNPROVIDED, (SubLObject)module0135.UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var21), new SubLObject[] { module0135.$ic30$, var10 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var10);
            if (module0135.NIL != f8838(var21)) {
                streams_high.write_string((SubLObject)module0135.$ic31$, var10, (SubLObject)module0135.UNPROVIDED, (SubLObject)module0135.UNPROVIDED);
            }
            streams_high.write_char((SubLObject)Characters.CHAR_space, var10);
            PrintLow.write(Equality.pointer(var21), new SubLObject[] { module0135.$ic30$, var10, module0135.$ic32$, module0135.SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var10);
        }
        return var21;
    }
    
    public static SubLObject f8839(final SubLObject var26, final SubLObject var27, final SubLObject var28, final SubLObject var29) {
        final SubLObject var30 = f8821();
        f8832(var30, var26);
        f8833(var30, var27);
        f8834(var30, var28);
        f8835(var30, var29);
        return var30;
    }
    
    public static SubLObject f8838(final SubLObject var8) {
        final SubLObject var9 = f8829(var8);
        if (var9.eql((SubLObject)module0135.$ic33$)) {
            return module0143.f9345(f8828(var8));
        }
        if (var9.eql((SubLObject)module0135.$ic34$)) {
            return module0143.f9377(f8828(var8));
        }
        if (var9.eql((SubLObject)module0135.$ic35$)) {
            return module0143.f9407(f8828(var8));
        }
        if (var9.eql((SubLObject)module0135.$ic36$)) {
            return module0143.f9439(f8828(var8));
        }
        if (var9.eql((SubLObject)module0135.$ic37$)) {
            return f8840(f8828(var8));
        }
        if (var9.eql((SubLObject)module0135.$ic38$)) {
            return f8841(f8828(var8));
        }
        if (var9.eql((SubLObject)module0135.$ic39$)) {
            return f8842(f8828(var8));
        }
        if (var9.eql((SubLObject)module0135.$ic40$)) {
            return f8843(f8828(var8));
        }
        if (var9.eql((SubLObject)module0135.$ic41$)) {
            return module0053.f3934(f8828(var8));
        }
        if (var9.eql((SubLObject)module0135.$ic42$)) {
            return (SubLObject)module0135.T;
        }
        if (var9.eql((SubLObject)module0135.$ic43$)) {
            return (SubLObject)module0135.NIL;
        }
        final SubLObject var18_30 = f8829(var8);
        if (var18_30.eql((SubLObject)module0135.$ic44$)) {
            return module0323.f21892(f8828(var8));
        }
        if (var18_30.eql((SubLObject)module0135.$ic45$)) {
            return module0323.f21897(f8828(var8));
        }
        if (var18_30.eql((SubLObject)module0135.$ic46$)) {
            return module0323.f21901(f8828(var8));
        }
        if (var18_30.eql((SubLObject)module0135.$ic47$)) {
            return module0323.f21906(f8828(var8));
        }
        return Functions.funcall(f8829(var8), f8828(var8));
    }
    
    public static SubLObject f8844(final SubLObject var8) {
        SubLObject var9 = (SubLObject)module0135.NIL;
        final SubLObject var10 = f8830(var8);
        if (var10.eql((SubLObject)module0135.$ic48$)) {
            var9 = module0143.f9346(f8828(var8));
        }
        else if (var10.eql((SubLObject)module0135.$ic49$)) {
            var9 = module0143.f9378(f8828(var8));
        }
        else if (var10.eql((SubLObject)module0135.$ic50$)) {
            var9 = module0143.f9408(f8828(var8));
        }
        else if (var10.eql((SubLObject)module0135.$ic51$)) {
            var9 = module0143.f9440(f8828(var8));
        }
        else if (var10.eql((SubLObject)module0135.$ic52$)) {
            var9 = f8845(f8828(var8));
        }
        else if (var10.eql((SubLObject)module0135.$ic53$)) {
            var9 = f8846(f8828(var8));
        }
        else if (var10.eql((SubLObject)module0135.$ic54$)) {
            var9 = f8847(f8828(var8));
        }
        else if (var10.eql((SubLObject)module0135.$ic55$)) {
            var9 = f8848(f8828(var8));
        }
        else if (var10.eql((SubLObject)module0135.$ic56$)) {
            var9 = module0053.f3935(f8828(var8));
        }
        else if (var10.eql((SubLObject)module0135.$ic43$)) {
            var9 = (SubLObject)module0135.NIL;
        }
        else {
            final SubLObject var18_32 = f8830(var8);
            if (var18_32.eql((SubLObject)module0135.$ic57$)) {
                var9 = module0323.f21893(f8828(var8));
            }
            else if (var18_32.eql((SubLObject)module0135.$ic58$)) {
                var9 = module0323.f21898(f8828(var8));
            }
            else if (var18_32.eql((SubLObject)module0135.$ic59$)) {
                var9 = module0323.f21902(f8828(var8));
            }
            else if (var18_32.eql((SubLObject)module0135.$ic60$)) {
                var9 = module0323.f21907(f8828(var8));
            }
            if (module0135.NIL == var9) {
                var9 = Functions.funcall(f8830(var8), f8828(var8));
            }
        }
        if (module0135.NIL == var9) {
            f8833(var8, (SubLObject)module0135.$ic42$);
        }
        return var9;
    }
    
    public static SubLObject f8849(final SubLObject var8) {
        SubLObject var9 = (SubLObject)module0135.NIL;
        final SubLObject var10 = f8831(var8);
        if (var10.eql((SubLObject)module0135.$ic61$)) {
            var9 = module0143.f9347(f8828(var8));
        }
        else if (var10.eql((SubLObject)module0135.$ic62$)) {
            var9 = module0143.f9379(f8828(var8));
        }
        else if (var10.eql((SubLObject)module0135.$ic63$)) {
            var9 = module0143.f9409(f8828(var8));
        }
        else if (var10.eql((SubLObject)module0135.$ic64$)) {
            var9 = module0143.f9441(f8828(var8));
        }
        else if (var10.eql((SubLObject)module0135.$ic65$)) {
            var9 = f8850(f8828(var8));
        }
        else if (var10.eql((SubLObject)module0135.$ic42$)) {
            var9 = (SubLObject)module0135.T;
        }
        else {
            SubLObject var11 = (SubLObject)module0135.NIL;
            var11 = (SubLObject)module0135.T;
            final SubLObject var18_34 = f8831(var8);
            if (var18_34.eql((SubLObject)module0135.$ic66$)) {
                var9 = module0323.f21894(f8828(var8));
            }
            else if (var18_34.eql((SubLObject)module0135.$ic67$)) {
                var9 = module0323.f21899(f8828(var8));
            }
            else if (var18_34.eql((SubLObject)module0135.$ic68$)) {
                var9 = module0323.f21904(f8828(var8));
            }
            else if (var18_34.eql((SubLObject)module0135.$ic69$)) {
                var9 = module0323.f21908(f8828(var8));
            }
            else {
                var11 = (SubLObject)module0135.NIL;
            }
            if (module0135.NIL == var11) {
                var9 = Functions.funcall(f8831(var8), f8828(var8));
            }
        }
        f8824(var8);
        return var9;
    }
    
    public static SubLObject f8851(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0135.$ic70$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)module0135.NIL;
        SubLObject var8 = (SubLObject)module0135.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0135.$ic70$);
        var7 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0135.$ic70$);
        var8 = var5.first();
        var5 = var5.rest();
        SubLObject var9 = (SubLObject)module0135.NIL;
        SubLObject var10 = var5;
        SubLObject var11 = (SubLObject)module0135.NIL;
        SubLObject var42_43 = (SubLObject)module0135.NIL;
        while (module0135.NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var4, (SubLObject)module0135.$ic70$);
            var42_43 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var4, (SubLObject)module0135.$ic70$);
            if (module0135.NIL == conses_high.member(var42_43, (SubLObject)module0135.$ic71$, (SubLObject)module0135.UNPROVIDED, (SubLObject)module0135.UNPROVIDED)) {
                var11 = (SubLObject)module0135.T;
            }
            if (var42_43 == module0135.$ic72$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (module0135.NIL != var11 && module0135.NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)module0135.$ic70$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0135.$ic20$, var5);
        final SubLObject var13 = (SubLObject)((module0135.NIL != var12) ? conses_high.cadr(var12) : module0135.NIL);
        final SubLObject var14;
        var5 = (var14 = var6);
        if (!var8.isSymbol()) {
            final SubLObject var15 = (SubLObject)module0135.$ic73$;
            return (SubLObject)ConsesLow.list((SubLObject)module0135.$ic0$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var15, var8)), (SubLObject)ConsesLow.listS((SubLObject)module0135.$ic74$, (SubLObject)ConsesLow.list(var7, var15, (SubLObject)module0135.$ic20$, var13), ConsesLow.append(var14, (SubLObject)module0135.NIL)));
        }
        final SubLObject var16 = (SubLObject)module0135.$ic75$;
        return (SubLObject)ConsesLow.list((SubLObject)module0135.$ic0$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var16, var13)), (SubLObject)ConsesLow.list((SubLObject)module0135.$ic76$, var16, (SubLObject)ConsesLow.list((SubLObject)module0135.$ic0$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.list((SubLObject)module0135.$ic77$, var8))), (SubLObject)ConsesLow.listS((SubLObject)module0135.$ic78$, var7, ConsesLow.append(var14, (SubLObject)module0135.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0135.$ic79$, var16, (SubLObject)((module0135.NIL != var13) ? ConsesLow.list((SubLObject)module0135.$ic80$, (SubLObject)ConsesLow.list((SubLObject)module0135.$ic81$, var7), var13) : ConsesLow.list((SubLObject)module0135.$ic81$, var7))))));
    }
    
    public static SubLObject f8852(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0135.$ic82$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)module0135.NIL;
        SubLObject var8 = (SubLObject)module0135.NIL;
        SubLObject var9 = (SubLObject)module0135.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0135.$ic82$);
        var7 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0135.$ic82$);
        var8 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0135.$ic82$);
        var9 = var5.first();
        var5 = var5.rest();
        SubLObject var10 = (SubLObject)module0135.NIL;
        SubLObject var11 = var5;
        SubLObject var12 = (SubLObject)module0135.NIL;
        SubLObject var54_55 = (SubLObject)module0135.NIL;
        while (module0135.NIL != var11) {
            cdestructuring_bind.destructuring_bind_must_consp(var11, var4, (SubLObject)module0135.$ic82$);
            var54_55 = var11.first();
            var11 = var11.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var11, var4, (SubLObject)module0135.$ic82$);
            if (module0135.NIL == conses_high.member(var54_55, (SubLObject)module0135.$ic71$, (SubLObject)module0135.UNPROVIDED, (SubLObject)module0135.UNPROVIDED)) {
                var12 = (SubLObject)module0135.T;
            }
            if (var54_55 == module0135.$ic72$) {
                var10 = var11.first();
            }
            var11 = var11.rest();
        }
        if (module0135.NIL != var12 && module0135.NIL == var10) {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)module0135.$ic82$);
        }
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)module0135.$ic20$, var5);
        final SubLObject var14 = (SubLObject)((module0135.NIL != var13) ? conses_high.cadr(var13) : module0135.NIL);
        final SubLObject var15;
        var5 = (var15 = var6);
        final SubLObject var16 = (SubLObject)module0135.$ic83$;
        final SubLObject var17 = (SubLObject)module0135.$ic84$;
        return (SubLObject)ConsesLow.list((SubLObject)module0135.$ic0$, (SubLObject)ConsesLow.list(reader.bq_cons(var16, (SubLObject)module0135.$ic85$), (SubLObject)ConsesLow.list(var17, (SubLObject)ConsesLow.list((SubLObject)module0135.$ic80$, var14, (SubLObject)ConsesLow.list((SubLObject)module0135.$ic86$, var16, var8)))), (SubLObject)ConsesLow.list((SubLObject)module0135.$ic74$, (SubLObject)ConsesLow.list(var7, var9, (SubLObject)module0135.$ic20$, var17), reader.bq_cons((SubLObject)module0135.$ic87$, ConsesLow.append(var15, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0135.$ic88$, var16), (SubLObject)ConsesLow.list((SubLObject)module0135.$ic78$, (SubLObject)ConsesLow.list((SubLObject)module0135.$ic80$, var14, (SubLObject)ConsesLow.list((SubLObject)module0135.$ic86$, var16, var8)), (SubLObject)ConsesLow.listS((SubLObject)module0135.$ic79$, var17, (SubLObject)module0135.$ic89$)))))));
    }
    
    public static SubLObject f8853() {
        if (module0135.NIL == module0135.$g1589$.getGlobalValue()) {
            module0135.$g1589$.setGlobalValue(f8839((SubLObject)module0135.NIL, (SubLObject)module0135.$ic42$, (SubLObject)module0135.$ic43$, (SubLObject)module0135.$ic42$));
        }
        return module0135.$g1589$.getGlobalValue();
    }
    
    public static SubLObject f8854(final SubLObject var59) {
        return Equality.eq(var59, module0135.$g1589$.getGlobalValue());
    }
    
    public static SubLObject f8855(final SubLObject var60) {
        return f8839(Vectors.make_vector((SubLObject)module0135.ONE_INTEGER, var60), (SubLObject)module0135.$ic37$, (SubLObject)module0135.$ic52$, (SubLObject)module0135.$ic42$);
    }
    
    public static SubLObject f8840(final SubLObject var26) {
        return Types.sublisp_null(Vectors.aref(var26, (SubLObject)module0135.ZERO_INTEGER));
    }
    
    public static SubLObject f8845(final SubLObject var26) {
        final SubLObject var27 = Vectors.aref(var26, (SubLObject)module0135.ZERO_INTEGER);
        Vectors.set_aref(var26, (SubLObject)module0135.ZERO_INTEGER, var27.rest());
        return var27.first();
    }
    
    public static SubLObject f8856(final SubLObject var61) {
        return f8839(Vectors.make_vector((SubLObject)module0135.ONE_INTEGER, var61), (SubLObject)module0135.$ic38$, (SubLObject)module0135.$ic53$, (SubLObject)module0135.$ic42$);
    }
    
    public static SubLObject f8841(final SubLObject var26) {
        return Types.sublisp_null(Vectors.aref(var26, (SubLObject)module0135.ZERO_INTEGER));
    }
    
    public static SubLObject f8846(final SubLObject var26) {
        final SubLObject var27 = Vectors.aref(var26, (SubLObject)module0135.ZERO_INTEGER);
        Vectors.set_aref(var26, (SubLObject)module0135.ZERO_INTEGER, var27.rest());
        if (module0135.NIL != var27.first()) {
            return (SubLObject)ConsesLow.list(conses_high.caar(var27), conses_high.cdar(var27));
        }
        return (SubLObject)module0135.NIL;
    }
    
    public static SubLObject f8857(final SubLObject var62) {
        return f8839(f8858(var62), (SubLObject)module0135.$ic39$, (SubLObject)module0135.$ic54$, (SubLObject)module0135.$ic42$);
    }
    
    public static SubLObject f8842(final SubLObject var26) {
        return Types.sublisp_null(Vectors.aref(var26, (SubLObject)module0135.ZERO_INTEGER));
    }
    
    public static SubLObject f8847(final SubLObject var26) {
        final SubLObject var27 = Vectors.aref(var26, (SubLObject)module0135.ZERO_INTEGER);
        final SubLObject var28 = var27.first();
        Vectors.set_aref(var26, (SubLObject)module0135.ZERO_INTEGER, var27.rest());
        return (SubLObject)((module0135.NIL != var28) ? ConsesLow.list(var28, Hashtables.gethash(var28, Vectors.aref(var26, (SubLObject)module0135.ONE_INTEGER), (SubLObject)module0135.UNPROVIDED)) : module0135.NIL);
    }
    
    public static SubLObject f8858(final SubLObject var62) {
        final SubLObject var63 = Vectors.make_vector((SubLObject)module0135.TWO_INTEGER, (SubLObject)module0135.NIL);
        Vectors.set_aref(var63, (SubLObject)module0135.ZERO_INTEGER, module0030.f1625(var62));
        Vectors.set_aref(var63, (SubLObject)module0135.ONE_INTEGER, var62);
        return var63;
    }
    
    public static SubLObject f8859(final SubLObject var65) {
        final SubLObject var66 = module0067.f4891(var65);
        final SubLObject var67 = module0067.f4860(var65);
        if (var67.eql((SubLObject)module0135.$ic90$)) {
            return f8856(var66);
        }
        if (var67.eql((SubLObject)module0135.$ic91$)) {
            return f8857(var66);
        }
        return module0067.f4863(var65);
    }
    
    public static SubLObject f8860(final SubLObject var67) {
        final SubLObject var68 = Vectors.make_vector((SubLObject)module0135.ONE_INTEGER, (SubLObject)module0135.UNPROVIDED);
        Vectors.set_aref(var68, (SubLObject)module0135.ZERO_INTEGER, var67);
        return f8839(var68, (SubLObject)module0135.$ic40$, (SubLObject)module0135.$ic55$, (SubLObject)module0135.$ic65$);
    }
    
    public static SubLObject f8843(final SubLObject var26) {
        return Types.sublisp_null(Vectors.aref(var26, (SubLObject)module0135.ZERO_INTEGER));
    }
    
    public static SubLObject f8848(final SubLObject var26) {
        SubLObject var27 = Vectors.aref(var26, (SubLObject)module0135.ZERO_INTEGER).first();
        SubLObject var28 = (SubLObject)module0135.NIL;
        SubLObject var29 = (SubLObject)module0135.NIL;
        while (module0135.NIL == var28 && module0135.NIL == var29) {
            if (module0135.NIL == var27) {
                var29 = (SubLObject)module0135.T;
            }
            else if (module0135.NIL != f8838(var27)) {
                f8849(var27);
                Vectors.set_aref(var26, (SubLObject)module0135.ZERO_INTEGER, Vectors.aref(var26, (SubLObject)module0135.ZERO_INTEGER).rest());
                var27 = Vectors.aref(var26, (SubLObject)module0135.ZERO_INTEGER).first();
            }
            else {
                var28 = f8844(var27);
            }
        }
        return var28;
    }
    
    public static SubLObject f8850(final SubLObject var26) {
        SubLObject var27 = Vectors.aref(var26, (SubLObject)module0135.ZERO_INTEGER);
        SubLObject var28 = (SubLObject)module0135.NIL;
        var28 = var27.first();
        while (module0135.NIL != var27) {
            f8849(var28);
            var27 = var27.rest();
            var28 = var27.first();
        }
        return (SubLObject)module0135.T;
    }
    
    public static SubLObject f8861() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0135", "f8819", "S#11029", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0135", "f8820", "S#11030");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0135", "f8821", "S#11031", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0135", "f8822", "S#11032", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0135", "f8824", "S#11033", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0135", "f8825", "S#11034", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0135", "f8827", "S#11004", 1, 0, false);
        new $f8827$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0135", "f8828", "S#11035", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0135", "f8829", "S#11036", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0135", "f8830", "S#11037", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0135", "f8831", "S#11038", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0135", "f8832", "S#11039", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0135", "f8833", "S#11040", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0135", "f8834", "S#11041", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0135", "f8835", "S#11042", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0135", "f8823", "S#11043", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0135", "f8836", "S#11044", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0135", "f8837", "S#11045", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0135", "f8826", "S#11046", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0135", "f8839", "S#5258", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0135", "f8838", "S#11047", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0135", "f8844", "S#11048", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0135", "f8849", "S#11049", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0135", "f8851", "S#11050");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0135", "f8852", "S#11051");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0135", "f8853", "S#11052", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0135", "f8854", "S#11053", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0135", "f8855", "S#11054", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0135", "f8840", "S#11055", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0135", "f8845", "S#11056", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0135", "f8856", "S#11057", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0135", "f8841", "S#11058", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0135", "f8846", "S#11059", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0135", "f8857", "S#11060", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0135", "f8842", "S#11061", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0135", "f8847", "S#11062", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0135", "f8858", "S#11063", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0135", "f8859", "S#11064", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0135", "f8860", "S#11065", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0135", "f8843", "S#11066", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0135", "f8848", "S#11067", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0135", "f8850", "S#11068", 1, 0, false);
        return (SubLObject)module0135.NIL;
    }
    
    public static SubLObject f8862() {
        module0135.$g1586$ = SubLFiles.defparameter("S#11069", (SubLObject)module0135.NIL);
        module0135.$g1587$ = SubLFiles.deflexical("S#11070", (SubLObject)module0135.TEN_INTEGER);
        module0135.$g1588$ = SubLFiles.defconstant("S#11071", (SubLObject)module0135.$ic2$);
        module0135.$g1589$ = SubLFiles.deflexical("S#11072", (SubLObject)module0135.NIL);
        return (SubLObject)module0135.NIL;
    }
    
    public static SubLObject f8863() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0135.$g1588$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0135.$ic9$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0135.$ic10$);
        Structures.def_csetf((SubLObject)module0135.$ic11$, (SubLObject)module0135.$ic12$);
        Structures.def_csetf((SubLObject)module0135.$ic13$, (SubLObject)module0135.$ic14$);
        Structures.def_csetf((SubLObject)module0135.$ic15$, (SubLObject)module0135.$ic16$);
        Structures.def_csetf((SubLObject)module0135.$ic17$, (SubLObject)module0135.$ic18$);
        Equality.identity((SubLObject)module0135.$ic2$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0135.$g1588$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0135.$ic28$));
        return (SubLObject)module0135.NIL;
    }
    
    public void declareFunctions() {
        f8861();
    }
    
    public void initializeVariables() {
        f8862();
    }
    
    public void runTopLevelForms() {
        f8863();
    }
    
    static {
        me = (SubLFile)new module0135();
        module0135.$g1586$ = null;
        module0135.$g1587$ = null;
        module0135.$g1588$ = null;
        module0135.$g1589$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("CLET");
        $ic1$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11069", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11029", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("S#11069", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11073", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11070", "CYC")))));
        $ic2$ = SubLObjectFactory.makeSymbol("S#11003", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("S#11004", "CYC");
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3266", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5217", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5218", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STATE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"), (SubLObject)SubLObjectFactory.makeKeyword("NEXT"), (SubLObject)SubLObjectFactory.makeKeyword("FINALIZE"));
        $ic6$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11035", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11036", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11037", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11038", "CYC"));
        $ic7$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11039", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11040", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11041", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11042", "CYC"));
        $ic8$ = SubLObjectFactory.makeSymbol("S#11046", "CYC");
        $ic9$ = SubLObjectFactory.makeSymbol("S#11034", "CYC");
        $ic10$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11004", "CYC"));
        $ic11$ = SubLObjectFactory.makeSymbol("S#11035", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#11039", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#11036", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#11040", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#11037", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#11041", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#11038", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#11042", "CYC");
        $ic19$ = SubLObjectFactory.makeKeyword("STATE");
        $ic20$ = SubLObjectFactory.makeKeyword("DONE");
        $ic21$ = SubLObjectFactory.makeKeyword("NEXT");
        $ic22$ = SubLObjectFactory.makeKeyword("FINALIZE");
        $ic23$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic24$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic25$ = SubLObjectFactory.makeSymbol("S#11043", "CYC");
        $ic26$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic27$ = SubLObjectFactory.makeKeyword("END");
        $ic28$ = SubLObjectFactory.makeSymbol("S#11045", "CYC");
        $ic29$ = SubLObjectFactory.makeString("#<");
        $ic30$ = SubLObjectFactory.makeKeyword("STREAM");
        $ic31$ = SubLObjectFactory.makeString(" DONE");
        $ic32$ = SubLObjectFactory.makeKeyword("BASE");
        $ic33$ = SubLObjectFactory.makeSymbol("S#11005", "CYC");
        $ic34$ = SubLObjectFactory.makeSymbol("S#11006", "CYC");
        $ic35$ = SubLObjectFactory.makeSymbol("S#11007", "CYC");
        $ic36$ = SubLObjectFactory.makeSymbol("S#11008", "CYC");
        $ic37$ = SubLObjectFactory.makeSymbol("S#11055", "CYC");
        $ic38$ = SubLObjectFactory.makeSymbol("S#11058", "CYC");
        $ic39$ = SubLObjectFactory.makeSymbol("S#11061", "CYC");
        $ic40$ = SubLObjectFactory.makeSymbol("S#11066", "CYC");
        $ic41$ = SubLObjectFactory.makeSymbol("S#5379", "CYC");
        $ic42$ = SubLObjectFactory.makeSymbol("TRUE");
        $ic43$ = SubLObjectFactory.makeSymbol("FALSE");
        $ic44$ = SubLObjectFactory.makeSymbol("S#11009", "CYC");
        $ic45$ = SubLObjectFactory.makeSymbol("S#11010", "CYC");
        $ic46$ = SubLObjectFactory.makeSymbol("S#11011", "CYC");
        $ic47$ = SubLObjectFactory.makeSymbol("S#11012", "CYC");
        $ic48$ = SubLObjectFactory.makeSymbol("S#11013", "CYC");
        $ic49$ = SubLObjectFactory.makeSymbol("S#11014", "CYC");
        $ic50$ = SubLObjectFactory.makeSymbol("S#11015", "CYC");
        $ic51$ = SubLObjectFactory.makeSymbol("S#11016", "CYC");
        $ic52$ = SubLObjectFactory.makeSymbol("S#11056", "CYC");
        $ic53$ = SubLObjectFactory.makeSymbol("S#11059", "CYC");
        $ic54$ = SubLObjectFactory.makeSymbol("S#11062", "CYC");
        $ic55$ = SubLObjectFactory.makeSymbol("S#11067", "CYC");
        $ic56$ = SubLObjectFactory.makeSymbol("S#5380", "CYC");
        $ic57$ = SubLObjectFactory.makeSymbol("S#11017", "CYC");
        $ic58$ = SubLObjectFactory.makeSymbol("S#11018", "CYC");
        $ic59$ = SubLObjectFactory.makeSymbol("S#11019", "CYC");
        $ic60$ = SubLObjectFactory.makeSymbol("S#11020", "CYC");
        $ic61$ = SubLObjectFactory.makeSymbol("S#11021", "CYC");
        $ic62$ = SubLObjectFactory.makeSymbol("S#11022", "CYC");
        $ic63$ = SubLObjectFactory.makeSymbol("S#11023", "CYC");
        $ic64$ = SubLObjectFactory.makeSymbol("S#11024", "CYC");
        $ic65$ = SubLObjectFactory.makeSymbol("S#11068", "CYC");
        $ic66$ = SubLObjectFactory.makeSymbol("S#11025", "CYC");
        $ic67$ = SubLObjectFactory.makeSymbol("S#11026", "CYC");
        $ic68$ = SubLObjectFactory.makeSymbol("S#11027", "CYC");
        $ic69$ = SubLObjectFactory.makeSymbol("S#11028", "CYC");
        $ic70$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11003", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic71$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic72$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic73$ = SubLObjectFactory.makeUninternedSymbol("US#243071");
        $ic74$ = SubLObjectFactory.makeSymbol("S#11050", "CYC");
        $ic75$ = SubLObjectFactory.makeUninternedSymbol("US#50BA606");
        $ic76$ = SubLObjectFactory.makeSymbol("UNTIL");
        $ic77$ = SubLObjectFactory.makeSymbol("S#11048", "CYC");
        $ic78$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic79$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic80$ = SubLObjectFactory.makeSymbol("COR");
        $ic81$ = SubLObjectFactory.makeSymbol("NULL");
        $ic82$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#770", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11003", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic83$ = SubLObjectFactory.makeUninternedSymbol("US#33E32D8");
        $ic84$ = SubLObjectFactory.makeUninternedSymbol("US#6C592DF");
        $ic85$ = ConsesLow.list((SubLObject)module0135.ZERO_INTEGER);
        $ic86$ = SubLObjectFactory.makeSymbol(">=");
        $ic87$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic88$ = SubLObjectFactory.makeSymbol("CINC");
        $ic89$ = ConsesLow.list((SubLObject)module0135.T);
        $ic90$ = SubLObjectFactory.makeKeyword("ALIST");
        $ic91$ = SubLObjectFactory.makeKeyword("HASHTABLE");
    }
    
    public static final class $sX11003_native extends SubLStructNative
    {
        public SubLObject $state;
        public SubLObject $done;
        public SubLObject $next;
        public SubLObject $finalize;
        private static final SubLStructDeclNative structDecl;
        
        public $sX11003_native() {
            this.$state = (SubLObject)CommonSymbols.NIL;
            this.$done = (SubLObject)CommonSymbols.NIL;
            this.$next = (SubLObject)CommonSymbols.NIL;
            this.$finalize = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX11003_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$state;
        }
        
        public SubLObject getField3() {
            return this.$done;
        }
        
        public SubLObject getField4() {
            return this.$next;
        }
        
        public SubLObject getField5() {
            return this.$finalize;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$state = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$done = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$next = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$finalize = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX11003_native.class, module0135.$ic2$, module0135.$ic3$, module0135.$ic4$, module0135.$ic5$, new String[] { "$state", "$done", "$next", "$finalize" }, module0135.$ic6$, module0135.$ic7$, module0135.$ic8$);
        }
    }
    
    public static final class $f8827$UnaryFunction extends UnaryFunction
    {
        public $f8827$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#11004"));
        }
        
        public SubLObject processItem(final SubLObject var11) {
            return module0135.f8827(var11);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0135.class
	Total time: 178 ms
	
	Decompiled with Procyon 0.5.32.
*/