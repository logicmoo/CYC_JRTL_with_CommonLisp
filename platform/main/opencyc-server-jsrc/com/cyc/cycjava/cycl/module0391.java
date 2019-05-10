package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0391 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0391";
    public static final String myFingerPrint = "cf2cf8ca60bd36735e59b0b756563432cfd7001c46f151a7c67ae46c6edb701e";
    public static SubLSymbol $g3271$;
    public static SubLSymbol $g3272$;
    private static SubLSymbol $g3273$;
    private static SubLSymbol $g3274$;
    private static SubLSymbol $g3275$;
    private static SubLSymbol $g3276$;
    private static SubLSymbol $g3277$;
    public static SubLSymbol $g3278$;
    private static SubLSymbol $g3279$;
    private static SubLSymbol $g3280$;
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
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLString $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLList $ic38$;
    private static final SubLList $ic39$;
    private static final SubLList $ic40$;
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
    private static final SubLString $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLString $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLList $ic64$;
    private static final SubLList $ic65$;
    private static final SubLList $ic66$;
    private static final SubLList $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLList $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
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
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLInteger $ic108$;
    private static final SubLInteger $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLString $ic119$;
    private static final SubLInteger $ic120$;
    private static final SubLInteger $ic121$;
    private static final SubLInteger $ic122$;
    private static final SubLInteger $ic123$;
    private static final SubLInteger $ic124$;
    private static final SubLInteger $ic125$;
    private static final SubLInteger $ic126$;
    private static final SubLInteger $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLString $ic165$;
    private static final SubLString $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLSymbol $ic170$;
    private static final SubLSymbol $ic171$;
    private static final SubLSymbol $ic172$;
    private static final SubLSymbol $ic173$;
    private static final SubLSymbol $ic174$;
    
    public static SubLObject f27776(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27777(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX30893_native.class) ? T : NIL);
    }
    
    public static SubLObject f27778(final SubLObject var1) {
        assert NIL != f27777(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f27779(final SubLObject var1) {
        assert NIL != f27777(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f27780(final SubLObject var1) {
        assert NIL != f27777(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f27781(final SubLObject var1) {
        assert NIL != f27777(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f27782(final SubLObject var1) {
        assert NIL != f27777(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f27783(final SubLObject var1) {
        assert NIL != f27777(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f27784(final SubLObject var1) {
        assert NIL != f27777(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f27785(final SubLObject var1, final SubLObject var4) {
        assert NIL != f27777(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f27786(final SubLObject var1, final SubLObject var4) {
        assert NIL != f27777(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f27787(final SubLObject var1, final SubLObject var4) {
        assert NIL != f27777(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f27788(final SubLObject var1, final SubLObject var4) {
        assert NIL != f27777(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f27789(final SubLObject var1, final SubLObject var4) {
        assert NIL != f27777(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f27790(final SubLObject var1, final SubLObject var4) {
        assert NIL != f27777(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f27791(final SubLObject var1, final SubLObject var4) {
        assert NIL != f27777(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f27792(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX30893_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic25$)) {
                f27785(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic26$)) {
                f27786(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic27$)) {
                f27787(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic28$)) {
                f27788(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic29$)) {
                f27789(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic30$)) {
                f27790(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic31$)) {
                f27791(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic32$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f27793(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic33$, (SubLObject)$ic34$, (SubLObject)SEVEN_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic35$, (SubLObject)$ic25$, f27778(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic35$, (SubLObject)$ic26$, f27779(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic35$, (SubLObject)$ic27$, f27780(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic35$, (SubLObject)$ic28$, f27781(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic35$, (SubLObject)$ic29$, f27782(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic35$, (SubLObject)$ic30$, f27783(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic35$, (SubLObject)$ic31$, f27784(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic36$, (SubLObject)$ic34$, (SubLObject)SEVEN_INTEGER);
        return var11;
    }
    
    public static SubLObject f27794(final SubLObject var11, final SubLObject var12) {
        return f27793(var11, var12);
    }
    
    public static SubLObject f27795(final SubLObject var13) {
        return (SubLObject)makeBoolean(NIL != module0367.f24997(var13) && NIL != module0035.f2169(module0367.f25035(var13), (SubLObject)$ic38$));
    }
    
    public static SubLObject f27796(final SubLObject var14, final SubLObject var15) {
        SubLObject var17;
        final SubLObject var16 = var17 = var14.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic39$);
        final SubLObject var18 = var17.rest();
        var17 = var17.first();
        SubLObject var19 = (SubLObject)NIL;
        SubLObject var20 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic39$);
        var19 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic39$);
        var20 = var17.first();
        var17 = var17.rest();
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22 = var17;
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var24_25 = (SubLObject)NIL;
        while (NIL != var22) {
            cdestructuring_bind.destructuring_bind_must_consp(var22, var16, (SubLObject)$ic39$);
            var24_25 = var22.first();
            var22 = var22.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var22, var16, (SubLObject)$ic39$);
            if (NIL == conses_high.member(var24_25, (SubLObject)$ic40$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var23 = (SubLObject)T;
            }
            if (var24_25 == $ic41$) {
                var21 = var22.first();
            }
            var22 = var22.rest();
        }
        if (NIL != var23 && NIL == var21) {
            cdestructuring_bind.cdestructuring_bind_error(var16, (SubLObject)$ic39$);
        }
        final SubLObject var24 = cdestructuring_bind.property_list_member((SubLObject)$ic42$, var17);
        final SubLObject var25 = (SubLObject)((NIL != var24) ? conses_high.cadr(var24) : NIL);
        final SubLObject var26;
        var17 = (var26 = var18);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic43$, (SubLObject)ConsesLow.list(var19, (SubLObject)ConsesLow.list((SubLObject)$ic44$, var20), var25), ConsesLow.append(var26, (SubLObject)NIL));
    }
    
    public static SubLObject f27797(final SubLObject var14, final SubLObject var15) {
        SubLObject var17;
        final SubLObject var16 = var17 = var14.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic39$);
        final SubLObject var18 = var17.rest();
        var17 = var17.first();
        SubLObject var19 = (SubLObject)NIL;
        SubLObject var20 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic39$);
        var19 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic39$);
        var20 = var17.first();
        var17 = var17.rest();
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22 = var17;
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var35_36 = (SubLObject)NIL;
        while (NIL != var22) {
            cdestructuring_bind.destructuring_bind_must_consp(var22, var16, (SubLObject)$ic39$);
            var35_36 = var22.first();
            var22 = var22.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var22, var16, (SubLObject)$ic39$);
            if (NIL == conses_high.member(var35_36, (SubLObject)$ic40$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var23 = (SubLObject)T;
            }
            if (var35_36 == $ic41$) {
                var21 = var22.first();
            }
            var22 = var22.rest();
        }
        if (NIL != var23 && NIL == var21) {
            cdestructuring_bind.cdestructuring_bind_error(var16, (SubLObject)$ic39$);
        }
        final SubLObject var24 = cdestructuring_bind.property_list_member((SubLObject)$ic42$, var17);
        final SubLObject var25 = (SubLObject)((NIL != var24) ? conses_high.cadr(var24) : NIL);
        final SubLObject var26;
        var17 = (var26 = var18);
        return (SubLObject)ConsesLow.list((SubLObject)$ic45$, (SubLObject)ConsesLow.list(var19, var20, (SubLObject)$ic42$, var25), (SubLObject)ConsesLow.listS((SubLObject)$ic46$, (SubLObject)ConsesLow.list((SubLObject)$ic47$, var19), ConsesLow.append(var26, (SubLObject)NIL)));
    }
    
    public static SubLObject f27798(final SubLObject var14, final SubLObject var15) {
        SubLObject var17;
        final SubLObject var16 = var17 = var14.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic39$);
        final SubLObject var18 = var17.rest();
        var17 = var17.first();
        SubLObject var19 = (SubLObject)NIL;
        SubLObject var20 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic39$);
        var19 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic39$);
        var20 = var17.first();
        var17 = var17.rest();
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22 = var17;
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var44_45 = (SubLObject)NIL;
        while (NIL != var22) {
            cdestructuring_bind.destructuring_bind_must_consp(var22, var16, (SubLObject)$ic39$);
            var44_45 = var22.first();
            var22 = var22.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var22, var16, (SubLObject)$ic39$);
            if (NIL == conses_high.member(var44_45, (SubLObject)$ic40$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var23 = (SubLObject)T;
            }
            if (var44_45 == $ic41$) {
                var21 = var22.first();
            }
            var22 = var22.rest();
        }
        if (NIL != var23 && NIL == var21) {
            cdestructuring_bind.cdestructuring_bind_error(var16, (SubLObject)$ic39$);
        }
        final SubLObject var24 = cdestructuring_bind.property_list_member((SubLObject)$ic42$, var17);
        final SubLObject var25 = (SubLObject)((NIL != var24) ? conses_high.cadr(var24) : NIL);
        final SubLObject var26;
        var17 = (var26 = var18);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic48$, (SubLObject)ConsesLow.list(var19, (SubLObject)ConsesLow.list((SubLObject)$ic49$, var20), (SubLObject)$ic42$, var25), ConsesLow.append(var26, (SubLObject)NIL));
    }
    
    public static SubLObject f27799(final SubLObject var14, final SubLObject var15) {
        SubLObject var17;
        final SubLObject var16 = var17 = var14.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic39$);
        final SubLObject var18 = var17.rest();
        var17 = var17.first();
        SubLObject var19 = (SubLObject)NIL;
        SubLObject var20 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic39$);
        var19 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic39$);
        var20 = var17.first();
        var17 = var17.rest();
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22 = var17;
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var53_54 = (SubLObject)NIL;
        while (NIL != var22) {
            cdestructuring_bind.destructuring_bind_must_consp(var22, var16, (SubLObject)$ic39$);
            var53_54 = var22.first();
            var22 = var22.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var22, var16, (SubLObject)$ic39$);
            if (NIL == conses_high.member(var53_54, (SubLObject)$ic40$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var23 = (SubLObject)T;
            }
            if (var53_54 == $ic41$) {
                var21 = var22.first();
            }
            var22 = var22.rest();
        }
        if (NIL != var23 && NIL == var21) {
            cdestructuring_bind.cdestructuring_bind_error(var16, (SubLObject)$ic39$);
        }
        final SubLObject var24 = cdestructuring_bind.property_list_member((SubLObject)$ic42$, var17);
        final SubLObject var25 = (SubLObject)((NIL != var24) ? conses_high.cadr(var24) : NIL);
        final SubLObject var26;
        var17 = (var26 = var18);
        return (SubLObject)ConsesLow.list((SubLObject)$ic48$, (SubLObject)ConsesLow.list(var19, (SubLObject)ConsesLow.list((SubLObject)$ic49$, var20), (SubLObject)$ic42$, var25), (SubLObject)ConsesLow.listS((SubLObject)$ic46$, (SubLObject)ConsesLow.list((SubLObject)$ic50$, var19), ConsesLow.append(var26, (SubLObject)NIL)));
    }
    
    public static SubLObject f27800(final SubLObject var14, final SubLObject var15) {
        SubLObject var17;
        final SubLObject var16 = var17 = var14.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic39$);
        final SubLObject var18 = var17.rest();
        var17 = var17.first();
        SubLObject var19 = (SubLObject)NIL;
        SubLObject var20 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic39$);
        var19 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic39$);
        var20 = var17.first();
        var17 = var17.rest();
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22 = var17;
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var62_63 = (SubLObject)NIL;
        while (NIL != var22) {
            cdestructuring_bind.destructuring_bind_must_consp(var22, var16, (SubLObject)$ic39$);
            var62_63 = var22.first();
            var22 = var22.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var22, var16, (SubLObject)$ic39$);
            if (NIL == conses_high.member(var62_63, (SubLObject)$ic40$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var23 = (SubLObject)T;
            }
            if (var62_63 == $ic41$) {
                var21 = var22.first();
            }
            var22 = var22.rest();
        }
        if (NIL != var23 && NIL == var21) {
            cdestructuring_bind.cdestructuring_bind_error(var16, (SubLObject)$ic39$);
        }
        final SubLObject var24 = cdestructuring_bind.property_list_member((SubLObject)$ic42$, var17);
        final SubLObject var25 = (SubLObject)((NIL != var24) ? conses_high.cadr(var24) : NIL);
        final SubLObject var26;
        var17 = (var26 = var18);
        return (SubLObject)ConsesLow.list((SubLObject)$ic48$, (SubLObject)ConsesLow.list(var19, (SubLObject)ConsesLow.list((SubLObject)$ic49$, var20), (SubLObject)$ic42$, var25), (SubLObject)ConsesLow.listS((SubLObject)$ic51$, (SubLObject)ConsesLow.list((SubLObject)$ic50$, var19), ConsesLow.append(var26, (SubLObject)NIL)));
    }
    
    public static SubLObject f27801(final SubLObject var65, final SubLObject var66) {
        final SubLObject var67 = f27792((SubLObject)UNPROVIDED);
        f27785(var67, var65);
        f27786(var67, var66);
        f27787(var67, (SubLObject)NIL);
        f27788(var67, module0070.f4992(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        f27789(var67, Hashtables.make_hash_table((SubLObject)EIGHT_INTEGER, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        f27790(var67, Hashtables.make_hash_table((SubLObject)EIGHT_INTEGER, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        f27791(var67, Hashtables.make_hash_table((SubLObject)EIGHT_INTEGER, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        return var67;
    }
    
    public static SubLObject f27802(final SubLObject var20) {
        module0367.f25070(var20, f27803(module0367.f25037(var20)));
        return var20;
    }
    
    public static SubLObject f27803(final SubLObject var68) {
        final SubLObject var69 = module0367.f25039((SubLObject)$ic53$, var68);
        final SubLObject var70 = module0367.f25039((SubLObject)$ic54$, var68);
        return f27801(var69, var70);
    }
    
    public static SubLObject f27804(final SubLObject var20) {
        assert NIL != f27795(var20) : var20;
        final SubLObject var21 = module0367.f25056(var20);
        return f27778(var21);
    }
    
    public static SubLObject f27805(final SubLObject var20) {
        assert NIL != f27795(var20) : var20;
        final SubLObject var21 = module0367.f25056(var20);
        return f27779(var21);
    }
    
    public static SubLObject f27806(final SubLObject var20) {
        assert NIL != f27795(var20) : var20;
        final SubLObject var21 = module0367.f25056(var20);
        return f27780(var21);
    }
    
    public static SubLObject f27807(final SubLObject var20) {
        assert NIL != f27795(var20) : var20;
        final SubLObject var21 = module0367.f25056(var20);
        return f27781(var21);
    }
    
    public static SubLObject f27808(final SubLObject var20) {
        assert NIL != f27795(var20) : var20;
        final SubLObject var21 = module0367.f25056(var20);
        return f27782(var21);
    }
    
    public static SubLObject f27809(final SubLObject var20) {
        assert NIL != f27795(var20) : var20;
        final SubLObject var21 = module0367.f25056(var20);
        return f27783(var21);
    }
    
    public static SubLObject f27810(final SubLObject var20) {
        assert NIL != f27795(var20) : var20;
        final SubLObject var21 = module0367.f25056(var20);
        return f27784(var21);
    }
    
    public static SubLObject f27811(final SubLObject var20, final SubLObject var69) {
        final SubLThread var70 = SubLProcess.currentSubLThread();
        assert NIL != module0363.f24478(var69) : var69;
        final SubLObject var71 = module0367.f25056(var20);
        final SubLObject var72 = f27807(var20);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var70) && NIL != module0070.f4996(var72, var69, (SubLObject)UNPROVIDED)) {
            Errors.error((SubLObject)$ic57$, var69, module0070.f4996(var72, var69, (SubLObject)UNPROVIDED));
        }
        final SubLObject var73 = module0367.f25037(var20);
        final SubLObject var74 = module0367.f25039((SubLObject)$ic58$, var73);
        module0367.f25096(var20, var74);
        f27812(var20, var74, var73);
        f27787(var71, (SubLObject)ConsesLow.cons(var74, f27780(var71)));
        module0070.f4998(var72, var69, var74);
        return var74;
    }
    
    public static SubLObject f27813(final SubLObject var20) {
        Errors.warn((SubLObject)$ic59$, var20);
        final SubLObject var21 = module0367.f25056(var20);
        final SubLObject var22 = module0367.f25039((SubLObject)$ic58$, module0367.f25037(var20));
        module0367.f25096(var20, var22);
        f27787(var21, (SubLObject)ConsesLow.cons(var22, f27780(var21)));
        return var22;
    }
    
    public static SubLObject f27814(final SubLObject var20, final SubLObject var72, final SubLObject var73) {
        final SubLObject var74 = f27810(var20);
        return Hashtables.sethash(var72, var74, var73);
    }
    
    public static SubLObject f27815(final SubLObject var72, final SubLObject var74) {
        assert NIL != module0397.f28129(var72) : var72;
        assert NIL != module0004.f106(var74) : var74;
        return Hashtables.sethash(var72, f27808(module0387.f27481(var72)), var74);
    }
    
    public static SubLObject f27816(final SubLObject var72) {
        final SubLObject var73 = f27817(var72);
        final SubLObject var74 = module0048.f_1_(var73);
        f27815(var72, var74);
        return var74;
    }
    
    public static SubLObject f27818(final SubLObject var72, final SubLObject var77) {
        assert NIL != module0397.f28129(var72) : var72;
        assert NIL != module0004.f106(var77) : var77;
        return Hashtables.sethash(var72, f27809(module0387.f27481(var72)), var77);
    }
    
    public static SubLObject f27819(final SubLObject var72, final SubLObject var78) {
        assert NIL != module0397.f28129(var72) : var72;
        assert NIL != module0004.f106(var78) : var78;
        if (var78.isPositive()) {
            final SubLObject var79 = f27820(var72);
            final SubLObject var80 = f27809(module0387.f27481(var72));
            SubLObject var81 = Numbers.subtract(var79, var78);
            if (NIL == module0004.f106(var81)) {
                var81 = (SubLObject)ZERO_INTEGER;
            }
            return Hashtables.sethash(var72, var80, var81);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27821(final SubLObject var20) {
        return (SubLObject)ConsesLow.listS(f27804(var20), f27805(var20), f27806(var20));
    }
    
    public static SubLObject f27822(final SubLObject var20) {
        SubLObject var21 = (SubLObject)ZERO_INTEGER;
        SubLObject var22 = f27806(var20);
        SubLObject var23 = (SubLObject)NIL;
        var23 = var22.first();
        while (NIL != var22) {
            var21 = Numbers.add(var21, (SubLObject)ONE_INTEGER);
            var22 = var22.rest();
            var23 = var22.first();
        }
        return var21;
    }
    
    public static SubLObject f27823(final SubLObject var20, final SubLObject var83) {
        return module0367.f25083(var83, f27804(var20));
    }
    
    public static SubLObject f27824(final SubLObject var20, final SubLObject var83) {
        SubLObject var84 = f27806(var20);
        SubLObject var85 = (SubLObject)NIL;
        var85 = var84.first();
        while (NIL != var84) {
            if (NIL != module0367.f25083(var83, var85)) {
                return (SubLObject)T;
            }
            var84 = var84.rest();
            var85 = var84.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27825(final SubLObject var20, final SubLObject var83) {
        return module0367.f25083(var83, f27805(var20));
    }
    
    public static SubLObject f27826(final SubLObject var20, final SubLObject var84) {
        SubLObject var85 = f27806(var20);
        SubLObject var86 = (SubLObject)NIL;
        var86 = var85.first();
        while (NIL != var85) {
            if (NIL != module0387.f27572(var86, var84)) {
                return (SubLObject)T;
            }
            var85 = var85.rest();
            var86 = var85.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27827(final SubLObject var13) {
        return (SubLObject)makeBoolean(NIL != module0367.f24997(var13) && NIL != f27795(module0387.f27481(var13)));
    }
    
    public static SubLObject f27828(final SubLObject var13) {
        return (SubLObject)makeBoolean(NIL != module0367.f24997(var13) && NIL == f27795(var13) && NIL != f27795(module0387.f27481(var13)));
    }
    
    public static SubLObject f27829(final SubLObject var13) {
        return module0406.f28343(var13);
    }
    
    public static SubLObject f27830(final SubLObject var20, final SubLObject var69) {
        assert NIL != module0363.f24478(var69) : var69;
        return module0070.f4996(f27807(var20), var69, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f27831(final SubLObject var20, final SubLObject var72) {
        assert NIL != module0397.f28129(var72) : var72;
        return module0070.f4997(f27807(var20), var72, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f27817(final SubLObject var72) {
        return Hashtables.gethash_without_values(var72, f27808(module0387.f27481(var72)), (SubLObject)ZERO_INTEGER);
    }
    
    public static SubLObject f27820(final SubLObject var72) {
        return Hashtables.gethash_without_values(var72, f27809(module0387.f27481(var72)), (SubLObject)ZERO_INTEGER);
    }
    
    public static SubLObject f27832(final SubLObject var72) {
        return Hashtables.gethash_without_values(var72, f27810(module0387.f27481(var72)), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f27833(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27834(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX30895_native.class) ? T : NIL);
    }
    
    public static SubLObject f27835(final SubLObject var1) {
        assert NIL != f27834(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f27836(final SubLObject var1) {
        assert NIL != f27834(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f27837(final SubLObject var1) {
        assert NIL != f27834(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f27838(final SubLObject var1) {
        assert NIL != f27834(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f27839(final SubLObject var1) {
        assert NIL != f27834(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f27840(final SubLObject var1) {
        assert NIL != f27834(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f27841(final SubLObject var1) {
        assert NIL != f27834(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f27842(final SubLObject var1) {
        assert NIL != f27834(var1) : var1;
        return var1.getField9();
    }
    
    public static SubLObject f27843(final SubLObject var1, final SubLObject var4) {
        assert NIL != f27834(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f27844(final SubLObject var1, final SubLObject var4) {
        assert NIL != f27834(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f27845(final SubLObject var1, final SubLObject var4) {
        assert NIL != f27834(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f27846(final SubLObject var1, final SubLObject var4) {
        assert NIL != f27834(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f27847(final SubLObject var1, final SubLObject var4) {
        assert NIL != f27834(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f27848(final SubLObject var1, final SubLObject var4) {
        assert NIL != f27834(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f27849(final SubLObject var1, final SubLObject var4) {
        assert NIL != f27834(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f27850(final SubLObject var1, final SubLObject var4) {
        assert NIL != f27834(var1) : var1;
        return var1.setField9(var4);
    }
    
    public static SubLObject f27851(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX30895_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic86$)) {
                f27843(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic87$)) {
                f27844(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic88$)) {
                f27845(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic89$)) {
                f27846(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic90$)) {
                f27847(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic91$)) {
                f27848(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic92$)) {
                f27849(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic93$)) {
                f27850(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic32$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f27852(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic33$, (SubLObject)$ic94$, (SubLObject)EIGHT_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic35$, (SubLObject)$ic86$, f27835(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic35$, (SubLObject)$ic87$, f27836(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic35$, (SubLObject)$ic88$, f27837(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic35$, (SubLObject)$ic89$, f27838(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic35$, (SubLObject)$ic90$, f27839(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic35$, (SubLObject)$ic91$, f27840(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic35$, (SubLObject)$ic92$, f27841(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic35$, (SubLObject)$ic93$, f27842(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic36$, (SubLObject)$ic94$, (SubLObject)EIGHT_INTEGER);
        return var11;
    }
    
    public static SubLObject f27853(final SubLObject var11, final SubLObject var12) {
        return f27852(var11, var12);
    }
    
    public static SubLObject f27812(final SubLObject var20, final SubLObject var72, final SubLObject var68) {
        final SubLObject var73 = inference_datastructures_inference_oc.f25533(var68);
        final SubLObject var74 = inference_datastructures_inference_oc.f25706(var68, (SubLObject)NIL);
        final SubLObject var75 = f27822(var20);
        final SubLObject var76 = f27851((SubLObject)UNPROVIDED);
        f27843(var76, var73);
        f27844(var76, var75);
        f27845(var76, var74);
        f27846(var76, (SubLObject)NIL);
        f27847(var76, (SubLObject)NIL);
        f27848(var76, (SubLObject)NIL);
        f27849(var76, (SubLObject)NIL);
        f27850(var76, (SubLObject)ZERO_INTEGER);
        return f27814(var20, var72, var76);
    }
    
    public static SubLObject f27854(final SubLObject var72) {
        return f27835(f27832(var72));
    }
    
    public static SubLObject f27855(final SubLObject var72) {
        return f27836(f27832(var72));
    }
    
    public static SubLObject f27856(final SubLObject var72) {
        return f27837(f27832(var72));
    }
    
    public static SubLObject f27857(final SubLObject var72) {
        return f27838(f27832(var72));
    }
    
    public static SubLObject f27858(final SubLObject var72) {
        return f27839(f27832(var72));
    }
    
    public static SubLObject f27859(final SubLObject var72) {
        return f27840(f27832(var72));
    }
    
    public static SubLObject f27860(final SubLObject var72) {
        return f27841(f27832(var72));
    }
    
    public static SubLObject f27861(final SubLObject var72) {
        return f27842(f27832(var72));
    }
    
    public static SubLObject f27862(final SubLObject var72, final SubLObject var91) {
        final SubLObject var92 = f27832(var72);
        f27846(var92, var91);
        return var91;
    }
    
    public static SubLObject f27863(final SubLObject var72, final SubLObject var92) {
        final SubLObject var93 = f27832(var72);
        f27847(var93, var92);
        return var92;
    }
    
    public static SubLObject f27864(final SubLObject var72, final SubLObject var93) {
        final SubLObject var94 = f27832(var72);
        f27848(var94, var93);
        return var93;
    }
    
    public static SubLObject f27865(final SubLObject var72, final SubLObject var94) {
        final SubLObject var95 = f27832(var72);
        f27849(var95, var94);
        return var94;
    }
    
    public static SubLObject f27866(final SubLObject var72, final SubLObject var95) {
        final SubLObject var96 = f27832(var72);
        f27850(var96, var95);
        return var95;
    }
    
    public static SubLObject f27867(final SubLObject var72) {
        return f27868(f27854(var72), f27856(var72), f27857(var72), f27858(var72), f27859(var72), f27860(var72), f27861(var72), module0367.f25065(var72), module0387.f27469(var72));
    }
    
    public static SubLObject f27868(final SubLObject var96, final SubLObject var89, final SubLObject var91, final SubLObject var92, final SubLObject var93, final SubLObject var94, final SubLObject var95, final SubLObject var88, final SubLObject var97) {
        return (SubLObject)ConsesLow.list(new SubLObject[] { $ic96$, var96, $ic97$, var89, $ic98$, var91, $ic99$, var92, $ic100$, var93, $ic101$, var94, $ic102$, var95, $ic103$, var88, $ic104$, var97 });
    }
    
    public static SubLObject f27869(final SubLObject var20) {
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22 = f27806(var20);
        SubLObject var23 = (SubLObject)NIL;
        var23 = var22.first();
        while (NIL != var22) {
            var21 = (SubLObject)ConsesLow.cons(f27867(var23), var21);
            var22 = var22.rest();
            var23 = var22.first();
        }
        return Sequences.nreverse(var21);
    }
    
    public static SubLObject f27870(final SubLObject var72) {
        SubLObject var73 = (SubLObject)NIL;
        final SubLObject var74 = module0367.f25037(var72);
        var73 = inference_datastructures_inference_oc.f25628(var74);
        return var73;
    }
    
    public static SubLObject f27871(final SubLObject var72) {
        return Numbers.plusp(f27861(var72));
    }
    
    public static SubLObject f27872(final SubLObject var72) {
        return Numbers.zerop(f27861(var72));
    }
    
    public static SubLObject f27873(final SubLObject var72, final SubLObject var99) {
        SubLObject var100 = f27861(var72);
        var100 = Numbers.add(var100, var99);
        f27866(var72, var100);
        return var100;
    }
    
    public static SubLObject f27874(final SubLObject var72, SubLObject var100) {
        final SubLObject var101 = module0367.f25037(var72);
        final SubLObject var102 = inference_datastructures_inference_oc.f25628(var101);
        if (NIL == var100) {
            var100 = (SubLObject)MINUS_ONE_INTEGER;
        }
        if (NIL != var102 && var102.numG(var100)) {
            final SubLObject var103 = module0048.f_1X(var100);
            if (NIL == f27857(var72)) {
                final SubLObject var104 = inference_datastructures_inference_oc.f25619(var101, var103);
                final SubLObject var105 = module0367.f25065(var72);
                final SubLObject var106 = inference_datastructures_inference_oc.f25623(var104, (SubLObject)NIL);
                final SubLObject var107 = Numbers.subtract(var106, f27856(var72));
                f27862(var72, var107);
                f27863(var72, var105);
            }
            final SubLObject var108 = inference_datastructures_inference_oc.f25620(var101);
            final SubLObject var105 = module0367.f25065(var72);
            final SubLObject var106 = inference_datastructures_inference_oc.f25623(var108, (SubLObject)NIL);
            final SubLObject var107 = Numbers.subtract(var106, f27856(var72));
            f27864(var72, var107);
            f27865(var72, var105);
            SubLObject var109 = var103;
            SubLObject var110 = (SubLObject)ZERO_INTEGER;
            final SubLObject var111 = var101;
            final SubLObject var111_112 = var109;
            SubLObject var112;
            SubLObject var113;
            SubLObject var114;
            for (var112 = inference_datastructures_inference_oc.f25621(var101), var113 = (SubLObject)NIL, var113 = var111_112; !var113.numGE(var112); var113 = module0048.f_1X(var113)) {
                var114 = inference_datastructures_inference_oc.f25616(var111, var113);
                var110 = Numbers.add(var110, (SubLObject)ONE_INTEGER);
            }
            var109 = var112;
            f27873(var72, var110);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27875(final SubLObject var20) {
        SubLObject var21 = (SubLObject)NIL;
        if (NIL == var21) {
            SubLObject var22 = f27821(var20);
            SubLObject var23 = (SubLObject)NIL;
            var23 = var22.first();
            while (NIL == var21 && NIL != var22) {
                if (NIL == module0387.f27469(var23)) {
                    var21 = (SubLObject)T;
                }
                var22 = var22.rest();
                var23 = var22.first();
            }
        }
        return (SubLObject)makeBoolean(NIL == var21);
    }
    
    public static SubLObject f27876(final SubLObject var20) {
        SubLObject var21;
        for (var21 = (SubLObject)$ic106$; $ic106$ == var21; var21 = f27877(var20)) {}
        return Equality.eq((SubLObject)$ic42$, var21);
    }
    
    public static SubLObject f27877(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)NIL;
        SubLObject var23 = (SubLObject)NIL;
        if (NIL != f27878(var20)) {
            f27879(var20);
            var23 = (SubLObject)$ic110$;
            var22 = (SubLObject)$ic106$;
        }
        else if (NIL != module0367.f25079(var20)) {
            final SubLObject var24 = inference_datastructures_inference_oc.f25474(module0367.f25037(var20));
            final SubLObject var25 = module0374.f26538(var24);
            final SubLObject var26 = f27804(var20);
            module0387.f27570(var26, var25);
            f27811(var20, var25);
            module0373.f26349(var24);
            var23 = (SubLObject)$ic111$;
            var22 = (SubLObject)$ic112$;
        }
        else if (NIL != $g3275$.getDynamicValue(var21) && NIL != f27880(var20)) {
            final SubLObject var27 = f27881(var20);
            var23 = (SubLObject)ConsesLow.list(var27, (SubLObject)$ic113$);
            var22 = f27882(var27);
        }
        else {
            var21.resetMultipleValues();
            final SubLObject var28 = f27883(var20);
            final SubLObject var29 = var21.secondMultipleValue();
            var21.resetMultipleValues();
            if (NIL != module0004.f105(var29)) {
                var23 = (SubLObject)ConsesLow.list(var28, (SubLObject)$ic114$, var29);
                var22 = f27882(var28);
                f27816(var28);
            }
            else if (NIL != f27884(var20)) {
                var21.resetMultipleValues();
                final SubLObject var30 = f27885(var20);
                final SubLObject var31 = var21.secondMultipleValue();
                var21.resetMultipleValues();
                var23 = (SubLObject)ConsesLow.list(var30, (SubLObject)$ic115$, var31);
                var22 = f27882(var30);
                f27886(var20);
                f27887(var30);
                f27888(var20, var30, var31);
            }
            else if (NIL != f27889(var20)) {
                final SubLObject var26 = f27804(var20);
                final SubLObject var32 = f27805(var20);
                final SubLObject var33 = module0387.f27569(var26);
                var23 = var26;
                var22 = module0387.f27568(var26);
                SubLObject var34 = (SubLObject)NIL;
                if (NIL == f27824(var20, module0367.f25080(var20))) {
                    var34 = (SubLObject)T;
                    final SubLObject var35 = module0367.f25080(var20);
                    final SubLObject var36 = f27830(var20, var35);
                    var23 = (SubLObject)ConsesLow.list((SubLObject)$ic116$, var36, module0367.f25080(var20));
                    module0387.f27570(var36, var35);
                }
                else if (NIL != f27890(var33, var20)) {
                    var34 = (SubLObject)T;
                    SubLObject var37 = f27830(var20, var33);
                    if (NIL == var37) {
                        var37 = f27811(var20, var33);
                    }
                    var23 = (SubLObject)ConsesLow.list((SubLObject)$ic117$, var37, var33);
                    module0387.f27570(var37, var33);
                }
                else if (NIL == f27825(var20, var33) && NIL == module0387.f27516(var32)) {
                    var34 = (SubLObject)T;
                    var23 = (SubLObject)ConsesLow.list((SubLObject)$ic117$, var32, var33);
                    module0387.f27570(var32, var33);
                }
                if (NIL != var34) {
                    module0387.f27571(var26, var33);
                }
            }
            else if (NIL == module0387.f27469(f27805(var20))) {
                var23 = f27805(var20);
                var22 = module0390.f27732(module0387.f27568(f27805(var20)));
            }
            else if (NIL == f27875(var20)) {
                var23 = (SubLObject)$ic118$;
                var22 = (SubLObject)$ic106$;
                f27886(var20);
            }
            else {
                var23 = (SubLObject)$ic42$;
                var22 = (SubLObject)$ic42$;
            }
        }
        if (module0018.$g630$.getDynamicValue(var21).numGE((SubLObject)ONE_INTEGER)) {
            module0006.f218((SubLObject)T, (SubLObject)$ic119$, var20, var23, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
        }
        return var22;
    }
    
    public static SubLObject f27890(final SubLObject var69, final SubLObject var20) {
        return (SubLObject)makeBoolean(NIL == f27824(var20, var69) && NIL == f27830(var20, var69));
    }
    
    public static SubLObject f27878(final SubLObject var20) {
        SubLObject var21 = f27821(var20);
        SubLObject var22 = (SubLObject)NIL;
        var22 = var21.first();
        while (NIL != var21) {
            if (NIL != module0367.f25060(var22)) {
                return (SubLObject)T;
            }
            var21 = var21.rest();
            var22 = var21.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27879(final SubLObject var20) {
        SubLObject var21 = (SubLObject)ZERO_INTEGER;
        SubLObject var22 = f27821(var20);
        SubLObject var23 = (SubLObject)NIL;
        var23 = var22.first();
        while (NIL != var22) {
            var21 = Numbers.add(var21, module0387.f27567(var23));
            var22 = var22.rest();
            var23 = var22.first();
        }
        return var21;
    }
    
    public static SubLObject f27883(final SubLObject var20) {
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22 = (SubLObject)ZERO_INTEGER;
        SubLObject var23 = f27806(var20);
        SubLObject var24 = (SubLObject)NIL;
        var24 = var23.first();
        while (NIL != var23) {
            if (NIL == module0387.f27469(var24)) {
                final SubLObject var25 = f27817(var24);
                if (var25.numG(var22)) {
                    var21 = var24;
                    var22 = var25;
                }
            }
            var23 = var23.rest();
            var24 = var23.first();
        }
        return Values.values(var21, var22);
    }
    
    public static SubLObject f27884(final SubLObject var20) {
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22 = f27806(var20);
        SubLObject var23 = (SubLObject)NIL;
        var23 = var22.first();
        while (NIL != var22) {
            if (NIL == module0387.f27469(var23) && NIL != f27872(var23)) {
                var21 = (SubLObject)T;
                if (NIL != f27891(var23)) {
                    return (SubLObject)T;
                }
            }
            var22 = var22.rest();
            var23 = var22.first();
        }
        return (SubLObject)makeBoolean(NIL != var21 && NIL != module0387.f27469(f27805(var20)) && NIL != module0387.f27469(f27804(var20)));
    }
    
    public static SubLObject f27889(final SubLObject var20) {
        if (NIL != module0387.f27469(f27804(var20))) {
            return (SubLObject)NIL;
        }
        if (NIL != module0387.f27469(f27805(var20))) {
            return (SubLObject)T;
        }
        if (NIL != f27823(var20, module0367.f25080(var20))) {
            return (SubLObject)T;
        }
        return Numbers.zerop(Numbers.mod(module0367.f25065(var20), (SubLObject)THREE_INTEGER));
    }
    
    public static SubLObject f27891(final SubLObject var72) {
        final SubLThread var73 = SubLProcess.currentSubLThread();
        return Numbers.numLE(module0367.f25065(var72), $g3274$.getDynamicValue(var73));
    }
    
    public static SubLObject f27885(final SubLObject var20) {
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22 = module0048.f3326();
        SubLObject var23 = f27806(var20);
        SubLObject var24 = (SubLObject)NIL;
        var24 = var23.first();
        while (NIL != var23) {
            if (NIL == module0387.f27469(var24) && NIL != f27872(var24)) {
                final SubLObject var25 = f27820(var24);
                if (NIL != module0048.f3360(var25, var22)) {
                    var21 = var24;
                    var22 = var25;
                }
            }
            var23 = var23.rest();
            var24 = var23.first();
        }
        return Values.values(var21, var22);
    }
    
    public static SubLObject f27886(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)ZERO_INTEGER;
        SubLObject var23 = f27806(var20);
        SubLObject var24 = (SubLObject)NIL;
        var24 = var23.first();
        while (NIL != var23) {
            if (NIL == module0387.f27469(var24) && NIL != f27871(var24)) {
                f27815(var24, $g3273$.getDynamicValue(var21));
                var22 = Numbers.add(var22, (SubLObject)ONE_INTEGER);
            }
            var23 = var23.rest();
            var24 = var23.first();
        }
        return var22;
    }
    
    public static SubLObject f27887(final SubLObject var135) {
        final SubLObject var136 = f27892(var135);
        f27818(var135, var136);
        return var136;
    }
    
    public static SubLObject f27892(final SubLObject var135) {
        final SubLObject var136 = module0367.f25065(var135);
        final SubLObject var137 = f27855(var135);
        return Numbers.multiply(f27893(var136), f27894(var137));
    }
    
    public static SubLObject f27893(final SubLObject var88) {
        if (var88.numL((SubLObject)TEN_INTEGER)) {
            return (SubLObject)ONE_INTEGER;
        }
        if (var88.numL((SubLObject)$ic109$)) {
            return (SubLObject)THREE_INTEGER;
        }
        if (var88.numL((SubLObject)$ic120$)) {
            return (SubLObject)NINE_INTEGER;
        }
        if (var88.numL((SubLObject)$ic121$)) {
            return (SubLObject)$ic122$;
        }
        return (SubLObject)$ic123$;
    }
    
    public static SubLObject f27894(final SubLObject var90) {
        if (var90.numL((SubLObject)TWO_INTEGER)) {
            return (SubLObject)ONE_INTEGER;
        }
        if (var90.numL((SubLObject)$ic124$)) {
            return (SubLObject)TEN_INTEGER;
        }
        if (var90.numL((SubLObject)$ic125$)) {
            return (SubLObject)$ic126$;
        }
        return (SubLObject)$ic127$;
    }
    
    public static SubLObject f27888(final SubLObject var20, final SubLObject var125, final SubLObject var78) {
        SubLObject var126 = f27806(var20);
        SubLObject var127 = (SubLObject)NIL;
        var127 = var126.first();
        while (NIL != var126) {
            if (NIL == module0387.f27469(var127) && !var127.eql(var125) && NIL != f27872(var127)) {
                f27819(var127, var78);
            }
            var126 = var126.rest();
            var127 = var126.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27882(final SubLObject var72) {
        SubLObject var73 = (SubLObject)NIL;
        final SubLObject var74 = f27870(var72);
        var73 = module0390.f27732(module0387.f27568(var72));
        f27874(var72, var74);
        return var73;
    }
    
    public static SubLObject f27895(final SubLObject var20) {
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22 = f27806(var20);
        SubLObject var23 = (SubLObject)NIL;
        var23 = var22.first();
        while (NIL != var22) {
            if (NIL == module0387.f27469(var23)) {
                var21 = (SubLObject)ConsesLow.cons(var23, var21);
            }
            var22 = var22.rest();
            var23 = var22.first();
        }
        return Sequences.nreverse(var21);
    }
    
    public static SubLObject f27880(final SubLObject var20) {
        SubLObject var21 = f27806(var20);
        SubLObject var22 = (SubLObject)NIL;
        var22 = var21.first();
        while (NIL != var21) {
            if (NIL == module0387.f27469(var22)) {
                return (SubLObject)T;
            }
            var21 = var21.rest();
            var22 = var21.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27881(final SubLObject var20) {
        SubLObject var21 = f27806(var20);
        SubLObject var22 = (SubLObject)NIL;
        var22 = var21.first();
        while (NIL != var21) {
            if (NIL == module0387.f27469(var22)) {
                return var22;
            }
            var21 = var21.rest();
            var22 = var21.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27896(final SubLObject var20) {
        SubLObject var21 = (SubLObject)NIL;
        if (NIL == var21) {
            SubLObject var22 = f27821(var20);
            SubLObject var23 = (SubLObject)NIL;
            var23 = var22.first();
            while (NIL == var21 && NIL != var22) {
                if (NIL != module0387.f27518(var23)) {
                    var21 = (SubLObject)T;
                }
                var22 = var22.rest();
                var23 = var22.first();
            }
        }
        return var21;
    }
    
    public static SubLObject f27897(final SubLObject var20, final SubLObject var83) {
        final SubLObject var84 = f27805(var20);
        final SubLObject var85 = module0384.f27273(var84, var83, (SubLObject)UNPROVIDED);
        if (NIL == var85) {
            return (SubLObject)NIL;
        }
        final SubLObject var86 = f27898(var20, var83);
        final SubLObject var87 = module0384.f27273(var86, var83, (SubLObject)UNPROVIDED);
        if (NIL == var87) {
            return (SubLObject)NIL;
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f27899(final SubLObject var20, final SubLObject var83) {
        final SubLObject var84 = f27805(var20);
        final SubLObject var85 = module0384.f27281(var84, var83);
        if (NIL == var85) {
            return (SubLObject)NIL;
        }
        final SubLObject var86 = f27898(var20, var83);
        final SubLObject var87 = module0384.f27281(var86, var83);
        if (NIL == var87) {
            return (SubLObject)NIL;
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f27900(final SubLObject var20, final SubLObject var140, final SubLObject var141, final SubLObject var142) {
        final SubLObject var143 = f27805(var20);
        final SubLObject var144 = module0384.f27275(var143, var140, var141, var142);
        if (NIL == var144) {
            return (SubLObject)NIL;
        }
        final SubLObject var145 = f27898(var20, module0365.f24850(var140));
        final SubLObject var146 = module0384.f27275(var145, var140, var141, var142);
        if (NIL == var146) {
            return (SubLObject)NIL;
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f27901(final SubLObject var20, final SubLObject var140, final SubLObject var141, final SubLObject var142) {
        final SubLObject var143 = f27805(var20);
        final SubLObject var144 = module0384.f27283(var143, var140, var141, var142);
        if (NIL == var144) {
            return (SubLObject)NIL;
        }
        final SubLObject var145 = f27898(var20, module0365.f24850(var140));
        final SubLObject var146 = module0384.f27283(var145, var140, var141, var142);
        if (NIL == var146) {
            return (SubLObject)NIL;
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f27902(final SubLObject var20) {
        SubLObject var21 = (SubLObject)ZERO_INTEGER;
        SubLObject var22 = f27821(var20);
        SubLObject var23 = (SubLObject)NIL;
        var23 = var22.first();
        while (NIL != var22) {
            var21 = Numbers.add(var21, module0387.f27515(var23));
            var22 = var22.rest();
            var23 = var22.first();
        }
        return var21;
    }
    
    public static SubLObject f27903(final SubLObject var20) {
        SubLObject var21 = f27821(var20);
        SubLObject var22 = (SubLObject)NIL;
        var22 = var21.first();
        while (NIL != var21) {
            module0387.f27557(var22);
            var21 = var21.rest();
            var22 = var21.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27904(final SubLObject var20, final SubLObject var143) {
        module0367.f25097(var20, var143);
        SubLObject var144 = f27821(var20);
        SubLObject var145 = (SubLObject)NIL;
        var145 = var144.first();
        while (NIL != var144) {
            module0387.f27553(var145, var143);
            var144 = var144.rest();
            var145 = var144.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27905(final SubLObject var20, final SubLObject var144) {
        module0367.f25097(var20, var144);
        SubLObject var145 = f27821(var20);
        SubLObject var146 = (SubLObject)NIL;
        var146 = var145.first();
        while (NIL != var145) {
            module0387.f27555(var146, var144);
            var145 = var145.rest();
            var146 = var145.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27906(final SubLObject var20) {
        return f27821(var20);
    }
    
    public static SubLObject f27907(final SubLObject var20, final SubLObject var83) {
        if (NIL == module0387.f27516(var20)) {
            if (NIL != f27908(var20, var83)) {
                f27909(var20, var83);
            }
            else if (NIL != f27910(var20, var83)) {
                f27909(var20, var83);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27908(final SubLObject var20, final SubLObject var83) {
        final SubLObject var84 = module0363.f24530(var83);
        SubLObject var85;
        SubLObject var86;
        SubLObject var87;
        SubLObject var88;
        SubLObject var145_150;
        SubLObject var146_151;
        SubLObject var147_152;
        SubLObject var89;
        for (var85 = module0032.f1741(var84), var86 = (SubLObject)NIL, var86 = module0032.f1742(var85, var84); NIL == module0032.f1744(var85, var86); var86 = module0032.f1743(var86)) {
            var87 = module0032.f1745(var85, var86);
            if (NIL != module0032.f1746(var86, var87) && NIL != module0364.f24748(var87, (SubLObject)$ic139$)) {
                var88 = module0364.f24725(var87);
                var145_150 = module0363.f24530(var88);
                for (var146_151 = module0032.f1741(var145_150), var147_152 = (SubLObject)NIL, var147_152 = module0032.f1742(var146_151, var145_150); NIL == module0032.f1744(var146_151, var147_152); var147_152 = module0032.f1743(var147_152)) {
                    var89 = module0032.f1745(var146_151, var147_152);
                    if (NIL != module0032.f1746(var147_152, var89) && NIL != module0364.f24748(var89, (SubLObject)$ic140$) && NIL != module0381.f27056(var89, var87) && var88.eql(module0381.f27051(var89)) && NIL != f27911(var20, var83, var89)) {
                        return (SubLObject)T;
                    }
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27911(final SubLObject var20, final SubLObject var83, final SubLObject var153) {
        if (NIL != f27912(var20, var153)) {
            return (SubLObject)T;
        }
        if (NIL != f27913(var20, var153)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27912(final SubLObject var20, final SubLObject var153) {
        return (SubLObject)makeBoolean(NIL != module0381.f27154(var153) || NIL != module0381.f27155(var153));
    }
    
    public static SubLObject f27913(final SubLObject var20, final SubLObject var154) {
        assert NIL != f27795(var20) : var20;
        assert NIL != module0364.f24699(var154) : var154;
        SubLObject var155 = f27806(var20);
        SubLObject var156 = (SubLObject)NIL;
        var156 = var155.first();
        while (NIL != var155) {
            if (NIL != module0381.f27029(var154) && NIL != module0364.f24759(var154) && NIL != module0390.f27750(var156, var154) && NIL != f27823(var20, module0364.f24725(var154)) && $ic142$ == module0373.f26193(module0381.f27095(module0381.f27034(var154)), var156) && NIL != module0387.f27505(var154, var20)) {
                return (SubLObject)T;
            }
            var155 = var155.rest();
            var156 = var155.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27910(final SubLObject var20, final SubLObject var83) {
        if (NIL != module0375.f26588(var83)) {
            final SubLObject var84 = module0363.f24530(var83);
            SubLObject var85;
            SubLObject var86;
            SubLObject var87;
            for (var85 = module0032.f1741(var84), var86 = (SubLObject)NIL, var86 = module0032.f1742(var85, var84); NIL == module0032.f1744(var85, var86); var86 = module0032.f1743(var86)) {
                var87 = module0032.f1745(var85, var86);
                if (NIL != module0032.f1746(var86, var87) && NIL != module0364.f24748(var87, (SubLObject)$ic143$) && NIL != f27823(var20, module0364.f24725(var87))) {
                    return (SubLObject)T;
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27914(final SubLObject var20, final SubLObject var154) {
        if (NIL != module0378.f26860(var154)) {
            final SubLObject var155 = f27805(var20);
            final SubLObject var156 = module0378.f26873(var154);
            if (NIL != module0387.f27572(var155, var156)) {
                f27915(var20, var155, var156);
            }
            return (SubLObject)NIL;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27916(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        return $g3276$.getDynamicValue(var21);
    }
    
    public static SubLObject f27917(final SubLObject var20, final SubLObject var118, final SubLObject var158) {
        if (NIL != module0363.f24478(var158)) {
            return f27918(var20, var118, var158);
        }
        if (NIL != module0364.f24699(var158)) {
            return f27915(var20, var118, var158);
        }
        if (NIL != module0365.f24819(var158)) {
            return f27919(var20, var118, var158);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27918(final SubLObject var20, final SubLObject var118, final SubLObject var83) {
        module0367.f25099(var20, var83);
        if (NIL != module0406.f28343(var118)) {
            SubLObject var119 = module0363.f24527(var83);
            SubLObject var120;
            SubLObject var121;
            SubLObject var122;
            for (var120 = module0032.f1741(var119), var121 = (SubLObject)NIL, var121 = module0032.f1742(var120, var119); NIL == module0032.f1744(var120, var121); var121 = module0032.f1743(var121)) {
                var122 = module0032.f1745(var120, var121);
                if (NIL != module0032.f1746(var121, var122) && NIL != module0364.f24748(var122, (SubLObject)$ic147$)) {
                    f27920(var20, var122);
                }
            }
            var119 = module0363.f24527(var83);
            SubLObject var123;
            for (var120 = module0032.f1741(var119), var121 = (SubLObject)NIL, var121 = module0032.f1742(var120, var119); NIL == module0032.f1744(var120, var121); var121 = module0032.f1743(var121)) {
                var123 = module0032.f1745(var120, var121);
                if (NIL != module0032.f1746(var121, var123) && NIL != module0364.f24748(var123, (SubLObject)$ic148$)) {
                    f27921(var20, var123);
                }
            }
            var119 = module0363.f24527(var83);
            SubLObject var124;
            SubLObject var125;
            SubLObject var145_162;
            SubLObject var146_163;
            SubLObject var147_164;
            SubLObject var126;
            SubLObject var127;
            for (var120 = module0032.f1741(var119), var121 = (SubLObject)NIL, var121 = module0032.f1742(var120, var119); NIL == module0032.f1744(var120, var121); var121 = module0032.f1743(var121)) {
                var124 = module0032.f1745(var120, var121);
                if (NIL != module0032.f1746(var121, var124) && NIL != module0364.f24748(var124, (SubLObject)$ic140$) && NIL != f27913(var20, var124)) {
                    var125 = var124;
                    var145_162 = module0363.f24527(module0381.f27051(var125));
                    for (var146_163 = module0032.f1741(var145_162), var147_164 = (SubLObject)NIL, var147_164 = module0032.f1742(var146_163, var145_162); NIL == module0032.f1744(var146_163, var147_164); var147_164 = module0032.f1743(var147_164)) {
                        var126 = module0032.f1745(var146_163, var147_164);
                        if (NIL != module0032.f1746(var147_164, var126) && NIL != module0364.f24748(var126, (SubLObject)$ic139$) && NIL != module0381.f27133(var126, var125)) {
                            var127 = module0364.f24757(var126);
                            f27909(var20, var127);
                        }
                    }
                }
            }
        }
        else if (NIL != module0397.f28129(var118)) {
            final SubLObject var119 = module0363.f24527(var83);
            SubLObject var120;
            SubLObject var121;
            SubLObject var128;
            SubLObject var129;
            for (var120 = module0032.f1741(var119), var121 = (SubLObject)NIL, var121 = module0032.f1742(var120, var119); NIL == module0032.f1744(var120, var121); var121 = module0032.f1743(var121)) {
                var128 = module0032.f1745(var120, var121);
                if (NIL != module0032.f1746(var121, var128) && NIL != module0364.f24748(var128, (SubLObject)$ic54$) && NIL != f27922(var20, var128)) {
                    var129 = module0377.f26758(var128);
                    return f27909(var20, var129);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27915(final SubLObject var20, final SubLObject var118, final SubLObject var154) {
        assert NIL != module0398.f28152(var118) : var118;
        assert NIL != module0364.f24699(var154) : var154;
        if (NIL != module0377.f26746(var154)) {
            if (NIL == f27922(var20, var154)) {
                SubLObject var155 = (SubLObject)ZERO_INTEGER;
                SubLObject var156 = f27923(var20, var154);
                SubLObject var157 = (SubLObject)NIL;
                var157 = var156.first();
                while (NIL != var156) {
                    if (NIL != f27909(var20, var157)) {
                        var155 = Numbers.add(var155, (SubLObject)ONE_INTEGER);
                    }
                    var156 = var156.rest();
                    var157 = var156.first();
                }
                return var155;
            }
            if (NIL != f27824(var20, module0364.f24725(var154))) {
                final SubLObject var158 = module0377.f26758(var154);
                return f27909(var20, var158);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27922(final SubLObject var20, final SubLObject var157) {
        return Types.sublisp_null(f27924(var20, var157));
    }
    
    public static SubLObject f27924(final SubLObject var20, final SubLObject var157) {
        final SubLThread var158 = SubLProcess.currentSubLThread();
        final SubLObject var159 = f27805(var20);
        SubLObject var160 = (SubLObject)NIL;
        if (NIL == $g3277$.getDynamicValue(var158) || NIL == module0211.f13716(module0377.f26749(var157))) {
            final SubLObject var161 = module0364.f24725(var157);
            final SubLObject var162 = module0363.f24530(var161);
            SubLObject var163;
            SubLObject var164;
            SubLObject var165;
            SubLObject var172_173;
            SubLObject var166;
            SubLObject var145_175;
            SubLObject var146_176;
            SubLObject var147_177;
            SubLObject var167;
            SubLObject var168;
            SubLObject var169;
            SubLObject var170;
            for (var163 = module0032.f1741(var162), var164 = (SubLObject)NIL, var164 = module0032.f1742(var163, var162); NIL == module0032.f1744(var163, var164); var164 = module0032.f1743(var164)) {
                var165 = module0032.f1745(var163, var164);
                if (NIL != module0032.f1746(var164, var165) && NIL != module0364.f24748(var165, (SubLObject)$ic140$)) {
                    var172_173 = var165;
                    var166 = module0364.f24725(var172_173);
                    var145_175 = module0363.f24527(var166);
                    for (var146_176 = module0032.f1741(var145_175), var147_177 = (SubLObject)NIL, var147_177 = module0032.f1742(var146_176, var145_175); NIL == module0032.f1744(var146_176, var147_177); var147_177 = module0032.f1743(var147_177)) {
                        var167 = module0032.f1745(var146_176, var147_177);
                        if (NIL != module0032.f1746(var147_177, var167) && NIL != module0364.f24748(var167, (SubLObject)$ic150$) && NIL != module0378.f26866(var167, var172_173) && NIL != module0378.f26868(var167, var157)) {
                            var168 = module0378.f26870(var167);
                            if (NIL != module0363.f24586(var168, var159) || NIL != module0367.f25083(var168, var159)) {
                                var169 = module0378.f26872(var167);
                                var170 = module0381.f27034(var169);
                                if (NIL == $g3278$.getDynamicValue(var158) || NIL != module0387.f27572(var159, var170)) {
                                    var160 = (SubLObject)ConsesLow.cons(var168, var160);
                                }
                            }
                        }
                    }
                }
            }
        }
        return Sequences.nreverse(var160);
    }
    
    public static SubLObject f27923(final SubLObject var20, final SubLObject var157) {
        if (NIL != module0387.f27520(var157)) {
            return module0387.f27523(var157);
        }
        return f27924(var20, var157);
    }
    
    public static SubLObject f27909(final SubLObject var20, final SubLObject var83) {
        return module0387.f27570(f27804(var20), var83);
    }
    
    public static SubLObject f27919(final SubLObject var20, final SubLObject var118, final SubLObject var140) {
        if (NIL != module0373.f26151(var140)) {
            return f27925(var20, var118, var140);
        }
        if (NIL != module0380.f26969(var140)) {
            return f27926(var20, var118, var140);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27925(final SubLObject var20, final SubLObject var118, final SubLObject var181) {
        final SubLThread var182 = SubLProcess.currentSubLThread();
        assert NIL != module0398.f28152(var118) : var118;
        assert NIL != module0373.f26151(var181) : var181;
        if (NIL != $g3279$.getDynamicValue(var182)) {
            final SubLObject var183 = module0373.f26153(var181);
            if (NIL != module0381.f27029(var183)) {
                final SubLObject var184 = var183;
                final SubLObject var185 = module0364.f24725(var184);
                final SubLObject var186 = module0363.f24527(var185);
                SubLObject var187;
                SubLObject var188;
                SubLObject var189;
                for (var187 = module0032.f1741(var186), var188 = (SubLObject)NIL, var188 = module0032.f1742(var187, var186); NIL == module0032.f1744(var187, var188); var188 = module0032.f1743(var188)) {
                    var189 = module0032.f1745(var187, var188);
                    if (NIL != module0032.f1746(var188, var189) && NIL != module0364.f24748(var189, (SubLObject)$ic150$) && NIL != module0378.f26866(var189, var184)) {
                        f27927(var20, var189);
                    }
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27927(final SubLObject var20, final SubLObject var156) {
        final SubLObject var157 = f27805(var20);
        final SubLObject var158 = module0378.f26873(var156);
        if (NIL != module0387.f27572(var157, var158)) {
            return f27915(var20, var157, var158);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27926(final SubLObject var20, final SubLObject var118, final SubLObject var182) {
        assert NIL != module0398.f28152(var118) : var118;
        assert NIL != module0380.f26969(var182) : var182;
        final SubLObject var183 = module0365.f24850(var182);
        SubLObject var184 = f27806(var20);
        SubLObject var185 = (SubLObject)NIL;
        var185 = var184.first();
        while (NIL != var184) {
            module0367.f25241(var183, var185);
            var184 = var184.rest();
            var185 = var184.first();
        }
        f27920(var20, module0380.f26972(var182));
        var184 = f27806(var20);
        var185 = (SubLObject)NIL;
        var185 = var184.first();
        while (NIL != var184) {
            if (NIL != module0367.f25083(var183, var185)) {
                module0387.f27573(var185, var182);
            }
            var184 = var184.rest();
            var185 = var184.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27920(final SubLObject var20, final SubLObject var159) {
        SubLObject var160 = (SubLObject)ZERO_INTEGER;
        if (NIL != f27823(var20, module0364.f24725(var159))) {
            SubLObject var161 = module0364.f24735(var159);
            SubLObject var162 = (SubLObject)NIL;
            var162 = var161.first();
            while (NIL != var161) {
                if (NIL != module0339.f22743((SubLObject)NIL, var159, var162)) {
                    final SubLObject var163 = module0364.f24736(var162);
                    final SubLObject var164 = module0364.f24737(var162);
                    if (NIL != f27825(var20, var163) && NIL != module0387.f27570(f27804(var20), var163)) {
                        var160 = Numbers.add(var160, (SubLObject)ONE_INTEGER);
                    }
                }
                var161 = var161.rest();
                var162 = var161.first();
            }
        }
        return var160;
    }
    
    public static SubLObject f27928(final SubLObject var20, final SubLObject var118, final SubLObject var187) {
        if (NIL != module0398.f28152(var118)) {
            return f27921(var20, module0383.f27238(var187));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27921(final SubLObject var20, final SubLObject var160) {
        if (NIL != f27823(var20, module0364.f24725(var160))) {
            final SubLObject var161 = module0364.f24757(var160);
            if (NIL != f27825(var20, var161)) {
                return f27909(var20, var161);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27929(final SubLObject var20, final SubLObject var118, final SubLObject var182) {
        assert NIL != module0397.f28129(var118) : var118;
        return (SubLObject)makeBoolean(NIL == module0387.f27572(f27805(var20), var182));
    }
    
    public static SubLObject f27930(final SubLObject var20, final SubLObject var118, final SubLObject var140, final SubLObject var141, final SubLObject var142) {
        return f27900(var20, var140, var141, var142);
    }
    
    public static SubLObject f27931(final SubLObject var20, final SubLObject var118, final SubLObject var83, final SubLObject var188, final SubLObject var189) {
        f27932(var20, var83);
        if (NIL != module0397.f28129(var118) && NIL != module0384.f27297(var83, var118) && NIL == module0360.f23889(var188) && NIL != module0360.f23889(var189)) {
            f27933(var20, var83);
            return (SubLObject)$ic155$;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27932(final SubLObject var20, final SubLObject var83) {
        final SubLThread var84 = SubLProcess.currentSubLThread();
        SubLObject var85 = (SubLObject)$ic157$;
        SubLObject var86 = (SubLObject)$ic158$;
        SubLObject var87 = f27821(var20);
        SubLObject var88 = (SubLObject)NIL;
        var88 = var87.first();
        while (NIL != var87) {
            if (NIL == f27829(var88)) {
                final SubLObject var89 = module0367.f25144(var83, var88);
                if (NIL != module0360.f23883(var89, var85)) {
                    var85 = var89;
                }
                final SubLObject var91;
                final SubLObject var90 = var91 = module0367.f25147(var83, var88);
                if (!var91.eql((SubLObject)$ic158$)) {
                    if (var91.eql((SubLObject)$ic159$)) {
                        var86 = (SubLObject)$ic160$;
                    }
                    else if (var91.eql((SubLObject)$ic160$)) {
                        var86 = (SubLObject)$ic160$;
                    }
                }
            }
            var87 = var87.rest();
            var88 = var87.first();
        }
        if ($ic161$ == var85 && $ic158$ == var86) {
            var85 = (SubLObject)$ic162$;
        }
        if ($ic157$ == var85 && NIL == module0373.f26320(var83, var20)) {
            f27934(var20, var83);
        }
        final SubLObject var92 = module0360.f23885(var85, var86);
        module0367.f25148(var83, var20, var92);
        if (NIL != $g3280$.getDynamicValue(var84) && NIL != module0387.f27484(var20) && NIL == module0367.f25081(var20)) {
            f27935(var83, var86, var85);
        }
        return var92;
    }
    
    public static SubLObject f27934(final SubLObject var20, final SubLObject var195) {
        final SubLObject var196 = module0363.f24530(var195);
        SubLObject var197;
        SubLObject var198;
        SubLObject var199;
        SubLObject var200;
        SubLObject var201;
        SubLObject var202;
        SubLObject var82_196;
        SubLObject var203;
        for (var197 = module0032.f1741(var196), var198 = (SubLObject)NIL, var198 = module0032.f1742(var197, var196); NIL == module0032.f1744(var197, var198); var198 = module0032.f1743(var198)) {
            var199 = module0032.f1745(var197, var198);
            if (NIL != module0032.f1746(var198, var199) && NIL != module0364.f24748(var199, (SubLObject)$ic147$)) {
                var200 = module0364.f24725(var199);
                var201 = module0363.f24517(var200);
                var202 = (SubLObject)NIL;
                var202 = var201.first();
                while (NIL != var201) {
                    if (NIL != module0363.f24524(var202, (SubLObject)$ic147$)) {
                        var82_196 = f27806(var20);
                        var203 = (SubLObject)NIL;
                        var203 = var82_196.first();
                        while (NIL != var82_196) {
                            module0367.f25233(var202, var203);
                            module0367.f25230(var202, var203);
                            var82_196 = var82_196.rest();
                            var203 = var82_196.first();
                        }
                    }
                    var201 = var201.rest();
                    var202 = var201.first();
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27935(final SubLObject var83, final SubLObject var191, final SubLObject var190) {
        if ($ic158$ == var191) {
            module0373.f26244(var83, (SubLObject)NIL, (SubLObject)$ic163$);
        }
        if ($ic162$ == var190) {
            module0373.f26391(var83);
            module0373.f26293(var83, (SubLObject)$ic163$);
        }
        if ($ic157$ == var190) {
            module0373.f26313(var83, (SubLObject)$ic163$);
        }
        return var83;
    }
    
    public static SubLObject f27933(final SubLObject var20, final SubLObject var83) {
        module0373.f26244(var83, (SubLObject)NIL, var20);
        SubLObject var84 = f27821(var20);
        SubLObject var85 = (SubLObject)NIL;
        var85 = var84.first();
        while (NIL != var84) {
            module0373.f26244(var83, (SubLObject)NIL, var85);
            var84 = var84.rest();
            var85 = var84.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27936(final SubLObject var20, final SubLObject var83) {
        SubLObject var84 = f27821(var20);
        SubLObject var85 = (SubLObject)NIL;
        var85 = var84.first();
        while (NIL != var84) {
            module0373.f26293(var83, var85);
            var84 = var84.rest();
            var85 = var84.first();
        }
        final SubLObject var86 = module0363.f24530(var83);
        SubLObject var87;
        SubLObject var88;
        SubLObject var89;
        for (var87 = module0032.f1741(var86), var88 = (SubLObject)NIL, var88 = module0032.f1742(var87, var86); NIL == module0032.f1744(var87, var88); var88 = module0032.f1743(var88)) {
            var89 = module0032.f1745(var87, var88);
            if (NIL != module0032.f1746(var88, var89) && NIL != module0364.f24748(var89, (SubLObject)$ic164$)) {
                f27936(var20, module0364.f24725(var89));
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27898(final SubLObject var198, final SubLObject var83) {
        final SubLObject var199 = f27830(var198, var83);
        if (NIL != var199) {
            return var199;
        }
        SubLObject var200 = f27806(var198);
        SubLObject var201 = (SubLObject)NIL;
        var201 = var200.first();
        while (NIL != var200) {
            if (NIL != module0367.f25083(var83, var201)) {
                return var201;
            }
            var200 = var200.rest();
            var201 = var200.first();
        }
        var200 = f27806(var198);
        var201 = (SubLObject)NIL;
        var201 = var200.first();
        while (NIL != var200) {
            if (NIL != module0363.f24586(var83, var201)) {
                return var201;
            }
            var200 = var200.rest();
            var201 = var200.first();
        }
        return f27806(var198).first();
    }
    
    public static SubLObject f27937(final SubLObject var20, final SubLObject var83) {
        final SubLObject var84 = module0387.f27481(var20);
        if (NIL != f27795(var84)) {
            return f27898(var84, var83);
        }
        if (NIL != module0390.f27709(var84)) {
            return module0390.f27718(var84);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27938(final SubLObject var20) {
        final SubLObject var21 = module0387.f27481(var20);
        if (NIL != f27795(var21)) {
            return f27805(var21);
        }
        if (NIL != module0390.f27709(var21)) {
            return module0390.f27716(var21);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27939(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39021((SubLObject)$ic165$);
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ONE_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g353$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)TWO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        SubLObject var22 = module0015.$g533$.currentBinding(var21);
        try {
            module0015.$g533$.bind((SubLObject)T, var21);
            SubLObject var23 = f27806(var20);
            SubLObject var24 = (SubLObject)NIL;
            var24 = var23.first();
            while (NIL != var23) {
                if (NIL == module0387.f27469(var24)) {
                    f27940(var20, var24);
                }
                var23 = var23.rest();
                var24 = var23.first();
            }
        }
        finally {
            module0015.$g533$.rebind(var22, var21);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        module0642.f39026((SubLObject)TWO_INTEGER);
        module0642.f39021((SubLObject)$ic166$);
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ONE_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g353$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)TWO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        var22 = module0015.$g533$.currentBinding(var21);
        try {
            module0015.$g533$.bind((SubLObject)T, var21);
            SubLObject var23 = f27806(var20);
            SubLObject var24 = (SubLObject)NIL;
            var24 = var23.first();
            while (NIL != var23) {
                if (NIL != module0387.f27469(var24)) {
                    f27940(var20, var24);
                }
                var23 = var23.rest();
                var24 = var23.first();
            }
        }
        finally {
            module0015.$g533$.rebind(var22, var21);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27940(final SubLObject var20, final SubLObject var72) {
        final SubLThread var73 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g364$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var74 = module0015.$g533$.currentBinding(var73);
        try {
            module0015.$g533$.bind((SubLObject)T, var73);
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var201_202 = module0015.$g533$.currentBinding(var73);
            try {
                module0015.$g533$.bind((SubLObject)T, var73);
                final SubLObject var75 = (SubLObject)makeBoolean(NIL == module0387.f27469(var72));
                final SubLObject var76 = (NIL != var75) ? module0015.$g234$.getGlobalValue() : module0038.$g916$.getGlobalValue();
                final SubLObject var77 = (NIL != var75) ? module0015.$g235$.getGlobalValue() : module0038.$g916$.getGlobalValue();
                module0642.f39020(var76);
                module0656.f39837((SubLObject)$ic167$, var72, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39020(var77);
            }
            finally {
                module0015.$g533$.rebind(var201_202, var73);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var201_203 = module0015.$g533$.currentBinding(var73);
            try {
                module0015.$g533$.bind((SubLObject)T, var73);
                module0642.f39019(module0367.f25065(var72));
            }
            finally {
                module0015.$g533$.rebind(var201_203, var73);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var201_204 = module0015.$g533$.currentBinding(var73);
            try {
                module0015.$g533$.bind((SubLObject)T, var73);
                final SubLObject var78 = f27831(var20, var72);
                module0656.f39837((SubLObject)$ic168$, var78, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39026((SubLObject)UNPROVIDED);
                Functions.funcall((SubLObject)makeSymbol("S#30898", "CYC"), module0363.f24509(var78), (SubLObject)NIL);
            }
            finally {
                module0015.$g533$.rebind(var201_204, var73);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var74, var73);
        }
        module0642.f39020(module0015.$g365$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27941(final SubLObject var209) {
        SubLObject var210 = (SubLObject)NIL;
        SubLObject var211 = module0424.f29678(var209);
        SubLObject var212 = (SubLObject)NIL;
        var212 = var211.first();
        while (NIL != var211) {
            SubLObject var82_212;
            final SubLObject var213 = var82_212 = module0424.f29640(var212, (SubLObject)$ic169$, (SubLObject)UNPROVIDED);
            SubLObject var214 = (SubLObject)NIL;
            var214 = var82_212.first();
            while (NIL != var82_212) {
                var210 = (SubLObject)ConsesLow.cons(var214, var210);
                var82_212 = var82_212.rest();
                var214 = var82_212.first();
            }
            var211 = var211.rest();
            var212 = var211.first();
        }
        return Sequences.nreverse(var210);
    }
    
    public static SubLObject f27942(final SubLObject var211) {
        return module0035.remove_if_not((SubLObject)$ic170$, var211, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f27943(final SubLObject var211) {
        return Sequences.count_if((SubLObject)$ic170$, var211, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f27944(final SubLObject var211) {
        return Sequences.remove_if((SubLObject)$ic170$, var211, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f27945(final SubLObject var214) {
        return Numbers.plusp(conses_high.getf(var214, (SubLObject)$ic102$, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f27946(final SubLObject var214) {
        return conses_high.getf(var214, (SubLObject)$ic103$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f27947(final SubLObject var214) {
        return conses_high.getf(var214, (SubLObject)$ic104$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f27948(final SubLObject var214) {
        return conses_high.getf(var214, (SubLObject)$ic96$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f27949(final SubLObject var214) {
        return conses_high.getf(var214, (SubLObject)$ic99$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f27950(final SubLObject var211) {
        return Sort.sort(Mapping.mapcar((SubLObject)$ic171$, f27942(var211)), Symbols.symbol_function((SubLObject)$ic172$), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f27951(final SubLObject var211) {
        return Sort.sort(Mapping.mapcar((SubLObject)$ic173$, f27944(var211)), Symbols.symbol_function((SubLObject)$ic172$), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f27952(final SubLObject var209) {
        final SubLObject var210 = f27941(var209);
        final SubLObject var211 = Sequences.length(var210);
        final SubLObject var212 = f27943(var210);
        return Numbers.round(Numbers.divide(var211, var212), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f27953(final SubLObject var209) {
        final SubLObject var210 = module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)$ic127$);
        final SubLObject var211 = module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)$ic127$);
        SubLObject var212 = (SubLObject)ZERO_INTEGER;
        SubLObject var213 = module0424.f29678(var209);
        SubLObject var214 = (SubLObject)NIL;
        var214 = var213.first();
        while (NIL != var213) {
            final SubLObject var215 = module0424.f29640(var214, (SubLObject)$ic169$, (SubLObject)UNPROVIDED);
            final SubLObject var216 = Sort.sort(conses_high.copy_list(var215), Symbols.symbol_function((SubLObject)$ic172$), (SubLObject)$ic174$);
            SubLObject var217 = (SubLObject)NIL;
            SubLObject var218 = (SubLObject)NIL;
            SubLObject var219 = (SubLObject)NIL;
            var217 = var216;
            var218 = var217.first();
            for (var219 = (SubLObject)ZERO_INTEGER; NIL != var217; var217 = var217.rest(), var218 = var217.first(), var219 = Numbers.add((SubLObject)ONE_INTEGER, var219)) {
                if (var219.numG(var212)) {
                    var212 = var219;
                }
                if (NIL != f27947(var218)) {
                    module0084.f5775(var210, var219, (SubLObject)UNPROVIDED);
                    if (NIL != f27945(var218)) {
                        module0084.f5775(var211, var219, (SubLObject)UNPROVIDED);
                    }
                }
            }
            var213 = var213.rest();
            var214 = var213.first();
        }
        SubLObject var220 = (SubLObject)NIL;
        SubLObject var221 = (SubLObject)NIL;
        SubLObject var222;
        SubLObject var223;
        SubLObject var224;
        SubLObject var225;
        SubLObject var226;
        for (var222 = module0048.f_1X(var212), var223 = (SubLObject)NIL, var223 = (SubLObject)ZERO_INTEGER; var223.numL(var222); var223 = Numbers.add(var223, (SubLObject)ONE_INTEGER)) {
            var224 = module0067.f4885(var210, var223, (SubLObject)ZERO_INTEGER);
            var225 = module0067.f4885(var211, var223, (SubLObject)ZERO_INTEGER);
            var226 = (SubLObject)(var224.isZero() ? ZERO_INTEGER : Numbers.divide(var225, var224));
            var220 = (SubLObject)ConsesLow.cons(var226, var220);
            var221 = (SubLObject)ConsesLow.cons(var224, var221);
        }
        return Values.values(Sequences.nreverse(var220), Sequences.nreverse(var221));
    }
    
    public static SubLObject f27954() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27776", "S#30899", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27777", "S#30894", 1, 0, false);
        new $f27777$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27778", "S#30900", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27779", "S#30901", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27780", "S#30902", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27781", "S#30903", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27782", "S#30904", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27783", "S#30905", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27784", "S#30906", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27785", "S#30907", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27786", "S#30908", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27787", "S#30909", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27788", "S#30910", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27789", "S#30911", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27790", "S#30912", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27791", "S#30913", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27792", "S#30914", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27793", "S#30915", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27794", "S#30916", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27795", "S#28203", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0391", "f27796", "S#30917");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0391", "f27797", "S#30918");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0391", "f27798", "S#30919");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0391", "f27799", "S#30920");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0391", "f27800", "S#30921");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27801", "S#30922", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27802", "S#30923", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27803", "S#30924", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27804", "S#30925", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27805", "S#30926", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27806", "S#29329", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27807", "S#30927", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27808", "S#30928", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27809", "S#30929", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27810", "S#30930", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27811", "S#30931", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27813", "S#30932", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27814", "S#30933", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27815", "S#30934", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27816", "S#30935", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27818", "S#30936", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27819", "S#30937", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27821", "S#30938", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27822", "S#30939", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27823", "S#30940", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27824", "S#30941", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27825", "S#30942", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27826", "S#30943", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27827", "S#30944", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27828", "S#30945", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27829", "S#30946", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27830", "S#30947", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27831", "S#30948", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27817", "S#30949", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27820", "S#30950", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27832", "S#30895", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27833", "S#30951", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27834", "S#30896", 1, 0, false);
        new $f27834$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27835", "S#30952", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27836", "S#30953", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27837", "S#30954", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27838", "S#30955", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27839", "S#30956", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27840", "S#30957", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27841", "S#30958", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27842", "S#30959", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27843", "S#30960", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27844", "S#30961", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27845", "S#30962", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27846", "S#30963", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27847", "S#30964", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27848", "S#30965", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27849", "S#30966", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27850", "S#30967", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27851", "S#30968", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27852", "S#30969", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27853", "S#30970", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27812", "S#30971", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27854", "S#30972", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27855", "S#30973", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27856", "S#30974", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27857", "S#30975", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27858", "S#30976", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27859", "S#30977", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27860", "S#30978", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27861", "S#30979", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27862", "S#30980", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27863", "S#30981", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27864", "S#30982", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27865", "S#30983", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27866", "S#30984", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27867", "S#30985", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27868", "S#30986", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27869", "S#28204", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27870", "S#30987", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27871", "S#30988", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27872", "S#30989", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27873", "S#30990", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27874", "S#30991", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27875", "S#30992", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27876", "S#30993", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27877", "S#30994", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27890", "S#30995", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27878", "S#30996", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27879", "S#30997", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27883", "S#30998", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27884", "S#30999", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27889", "S#31000", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27891", "S#31001", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27885", "S#31002", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27886", "S#31003", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27887", "S#31004", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27892", "S#31005", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27893", "S#31006", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27894", "S#31007", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27888", "S#31008", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27882", "S#31009", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27895", "S#31010", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27880", "S#31011", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27881", "S#31012", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27896", "S#31013", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27897", "S#31014", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27899", "S#31015", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27900", "S#31016", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27901", "S#31017", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27902", "S#31018", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27903", "S#31019", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27904", "S#31020", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27905", "S#31021", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27906", "S#31022", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27907", "S#31023", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27908", "S#31024", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27911", "S#31025", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27912", "S#31026", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27913", "S#31027", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27910", "S#31028", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27914", "S#31029", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27916", "S#31030", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27917", "S#31031", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27918", "S#31032", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27915", "S#31033", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27922", "S#31034", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27924", "S#31035", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27923", "S#31036", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27909", "S#31037", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27919", "S#31038", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27925", "S#31039", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27927", "S#31040", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27926", "S#31041", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27920", "S#31042", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27928", "S#31043", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27921", "S#31044", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27929", "S#31045", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27930", "S#31046", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27931", "S#31047", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27932", "S#31048", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27934", "S#31049", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27935", "S#31050", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27933", "S#31051", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27936", "S#31052", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27898", "S#30498", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27937", "S#30688", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27938", "S#31053", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27939", "S#31054", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27940", "S#31055", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27941", "S#31056", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27942", "S#31057", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27943", "S#31058", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27944", "S#31059", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27945", "S#31060", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27946", "S#31061", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27947", "S#31062", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27948", "S#31063", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27949", "S#31064", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27950", "S#31065", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27951", "S#31066", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27952", "S#31067", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0391", "f27953", "S#31068", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27955() {
        $g3271$ = SubLFiles.defconstant("S#31069", (SubLObject)$ic2$);
        $g3272$ = SubLFiles.defconstant("S#31070", (SubLObject)$ic62$);
        $g3273$ = SubLFiles.defparameter("S#31071", (SubLObject)$ic108$);
        $g3274$ = SubLFiles.defparameter("S#31072", (SubLObject)$ic109$);
        $g3275$ = SubLFiles.defparameter("S#31073", (SubLObject)NIL);
        $g3276$ = SubLFiles.defvar("S#31074", module0360.f23935(module0347.$g2967$.getDynamicValue()));
        $g3277$ = SubLFiles.defparameter("S#31075", (SubLObject)T);
        $g3278$ = SubLFiles.defvar("S#31076", (SubLObject)T);
        $g3279$ = SubLFiles.defparameter("S#31077", (SubLObject)T);
        $g3280$ = SubLFiles.defparameter("S#31078", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27956() {
        module0387.f27534((SubLObject)$ic0$, (SubLObject)$ic1$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g3271$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic9$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic10$);
        Structures.def_csetf((SubLObject)$ic11$, (SubLObject)$ic12$);
        Structures.def_csetf((SubLObject)$ic13$, (SubLObject)$ic14$);
        Structures.def_csetf((SubLObject)$ic15$, (SubLObject)$ic16$);
        Structures.def_csetf((SubLObject)$ic17$, (SubLObject)$ic18$);
        Structures.def_csetf((SubLObject)$ic19$, (SubLObject)$ic20$);
        Structures.def_csetf((SubLObject)$ic21$, (SubLObject)$ic22$);
        Structures.def_csetf((SubLObject)$ic23$, (SubLObject)$ic24$);
        Equality.identity((SubLObject)$ic2$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g3271$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic37$));
        module0012.f419((SubLObject)$ic52$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g3272$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic68$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic69$);
        Structures.def_csetf((SubLObject)$ic70$, (SubLObject)$ic71$);
        Structures.def_csetf((SubLObject)$ic72$, (SubLObject)$ic73$);
        Structures.def_csetf((SubLObject)$ic74$, (SubLObject)$ic75$);
        Structures.def_csetf((SubLObject)$ic76$, (SubLObject)$ic77$);
        Structures.def_csetf((SubLObject)$ic78$, (SubLObject)$ic79$);
        Structures.def_csetf((SubLObject)$ic80$, (SubLObject)$ic81$);
        Structures.def_csetf((SubLObject)$ic82$, (SubLObject)$ic83$);
        Structures.def_csetf((SubLObject)$ic84$, (SubLObject)$ic85$);
        Equality.identity((SubLObject)$ic62$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g3272$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic95$));
        module0012.f419((SubLObject)$ic105$);
        module0012.f419((SubLObject)$ic107$);
        module0012.f419((SubLObject)$ic128$);
        module0012.f419((SubLObject)$ic129$);
        module0012.f419((SubLObject)$ic130$);
        module0012.f419((SubLObject)$ic131$);
        module0012.f419((SubLObject)$ic132$);
        module0012.f419((SubLObject)$ic133$);
        module0012.f419((SubLObject)$ic134$);
        module0012.f419((SubLObject)$ic135$);
        module0012.f419((SubLObject)$ic136$);
        module0012.f419((SubLObject)$ic137$);
        module0012.f419((SubLObject)$ic138$);
        module0012.f419((SubLObject)$ic144$);
        module0012.f419((SubLObject)$ic145$);
        module0012.f419((SubLObject)$ic146$);
        module0012.f419((SubLObject)$ic153$);
        module0012.f419((SubLObject)$ic154$);
        module0012.f419((SubLObject)$ic156$);
        module0012.f419((SubLObject)$ic170$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f27954();
    }
    
    public void initializeVariables() {
        f27955();
    }
    
    public void runTopLevelForms() {
        f27956();
    }
    
    static {
        me = (SubLFile)new module0391();
        $g3271$ = null;
        $g3272$ = null;
        $g3273$ = null;
        $g3274$ = null;
        $g3275$ = null;
        $g3276$ = null;
        $g3277$ = null;
        $g3278$ = null;
        $g3279$ = null;
        $g3280$ = null;
        $ic0$ = makeKeyword("STRIPING");
        $ic1$ = ConsesLow.list(new SubLObject[] { makeKeyword("NAME"), makeString("Striping Tactician"), makeKeyword("COMMENT"), makeString("A balancing tactician type which delegates to a new-root tactician,\n a transformation tactician, and multiple removal tacticians."), makeKeyword("CONSTRUCTOR"), makeSymbol("S#30923", "CYC"), makeKeyword("DONE?"), makeSymbol("S#30992", "CYC"), makeKeyword("DO-ONE-STEP"), makeSymbol("S#30993", "CYC"), makeKeyword("INITIAL-RELEVANT-STRATEGIES"), makeSymbol("S#31022", "CYC"), makeKeyword("INITIALIZE-PROPERTIES"), makeSymbol("S#31020", "CYC"), makeKeyword("UPDATE-PROPERTIES"), makeSymbol("S#31021", "CYC"), makeKeyword("INFERENCE-DYNAMIC-PROPERTIES-UPDATED"), makeSymbol("S#31019", "CYC"), makeKeyword("CONTINUATION-POSSIBLE?"), makeSymbol("S#31013", "CYC"), makeKeyword("THROW-AWAY-UNINTERESTING-SET-ASIDES"), makeSymbol("S#31018", "CYC"), makeKeyword("EARLY-REMOVAL-PRODUCTIVITY-LIMIT"), makeSymbol("S#31030", "CYC"), makeKeyword("POSSIBLY-ACTIVATE-PROBLEM"), makeSymbol("S#31023", "CYC"), makeKeyword("THROW-AWAY-PROBLEM"), makeSymbol("S#31014", "CYC"), makeKeyword("SET-ASIDE-PROBLEM"), makeSymbol("S#31015", "CYC"), makeKeyword("THROW-AWAY-TACTIC"), makeSymbol("S#31016", "CYC"), makeKeyword("SET-ASIDE-TACTIC"), makeSymbol("S#31017", "CYC"), makeKeyword("NEW-ARGUMENT-LINK"), makeSymbol("S#31029", "CYC"), makeKeyword("NEW-TACTIC"), makeSymbol("IGNORE"), makeKeyword("SPLIT-TACTICS-POSSIBLE"), makeSymbol("IGNORE"), makeKeyword("PROBLEM-COULD-BE-PENDING"), makeSymbol("IGNORE"), makeKeyword("LINK-HEAD-MOTIVATED?"), makeSymbol("FALSE"), makeKeyword("PROBLEM-NOTHING-TO-DO?"), makeSymbol("FALSE"), makeKeyword("SUBSTRATEGY-STRATEGEM-MOTIVATED"), makeSymbol("S#31031", "CYC"), makeKeyword("SUBSTRATEGY-TOTALLY-THROW-AWAY-TACTIC"), makeSymbol("S#31046", "CYC"), makeKeyword("SUBSTRATEGY-ALLOW-SPLIT-TACTIC-SET-ASIDE-WRT-REMOVAL"), makeSymbol("S#31045", "CYC"), makeKeyword("SUBSTRATEGY-PROBLEM-STATUS-CHANGE"), makeSymbol("S#31047", "CYC") });
        $ic2$ = makeSymbol("S#30893", "CYC");
        $ic3$ = makeSymbol("S#30894", "CYC");
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("S#30889", "CYC"), (SubLObject)makeSymbol("S#30890", "CYC"), (SubLObject)makeSymbol("S#30891", "CYC"), (SubLObject)makeSymbol("S#31079", "CYC"), (SubLObject)makeSymbol("S#31080", "CYC"), (SubLObject)makeSymbol("S#31081", "CYC"), (SubLObject)makeSymbol("S#31082", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)makeKeyword("NEW-ROOT-SUBSTRATEGY"), (SubLObject)makeKeyword("TRANSFORMATION-SUBSTRATEGY"), (SubLObject)makeKeyword("REMOVAL-SUBSTRATEGIES"), (SubLObject)makeKeyword("NEW-ROOT-R-MAP"), (SubLObject)makeKeyword("NEW-ROOT-PROOFINESS-MAP"), (SubLObject)makeKeyword("NEW-ROOT-DELAY-MAP"), (SubLObject)makeKeyword("NEW-ROOT-METRICS-MAP"));
        $ic6$ = ConsesLow.list((SubLObject)makeSymbol("S#30900", "CYC"), (SubLObject)makeSymbol("S#30901", "CYC"), (SubLObject)makeSymbol("S#30902", "CYC"), (SubLObject)makeSymbol("S#30903", "CYC"), (SubLObject)makeSymbol("S#30904", "CYC"), (SubLObject)makeSymbol("S#30905", "CYC"), (SubLObject)makeSymbol("S#30906", "CYC"));
        $ic7$ = ConsesLow.list((SubLObject)makeSymbol("S#30907", "CYC"), (SubLObject)makeSymbol("S#30908", "CYC"), (SubLObject)makeSymbol("S#30909", "CYC"), (SubLObject)makeSymbol("S#30910", "CYC"), (SubLObject)makeSymbol("S#30911", "CYC"), (SubLObject)makeSymbol("S#30912", "CYC"), (SubLObject)makeSymbol("S#30913", "CYC"));
        $ic8$ = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic9$ = makeSymbol("S#30899", "CYC");
        $ic10$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#30894", "CYC"));
        $ic11$ = makeSymbol("S#30900", "CYC");
        $ic12$ = makeSymbol("S#30907", "CYC");
        $ic13$ = makeSymbol("S#30901", "CYC");
        $ic14$ = makeSymbol("S#30908", "CYC");
        $ic15$ = makeSymbol("S#30902", "CYC");
        $ic16$ = makeSymbol("S#30909", "CYC");
        $ic17$ = makeSymbol("S#30903", "CYC");
        $ic18$ = makeSymbol("S#30910", "CYC");
        $ic19$ = makeSymbol("S#30904", "CYC");
        $ic20$ = makeSymbol("S#30911", "CYC");
        $ic21$ = makeSymbol("S#30905", "CYC");
        $ic22$ = makeSymbol("S#30912", "CYC");
        $ic23$ = makeSymbol("S#30906", "CYC");
        $ic24$ = makeSymbol("S#30913", "CYC");
        $ic25$ = makeKeyword("NEW-ROOT-SUBSTRATEGY");
        $ic26$ = makeKeyword("TRANSFORMATION-SUBSTRATEGY");
        $ic27$ = makeKeyword("REMOVAL-SUBSTRATEGIES");
        $ic28$ = makeKeyword("NEW-ROOT-R-MAP");
        $ic29$ = makeKeyword("NEW-ROOT-PROOFINESS-MAP");
        $ic30$ = makeKeyword("NEW-ROOT-DELAY-MAP");
        $ic31$ = makeKeyword("NEW-ROOT-METRICS-MAP");
        $ic32$ = makeString("Invalid slot ~S for construction function");
        $ic33$ = makeKeyword("BEGIN");
        $ic34$ = makeSymbol("S#30914", "CYC");
        $ic35$ = makeKeyword("SLOT");
        $ic36$ = makeKeyword("END");
        $ic37$ = makeSymbol("S#30916", "CYC");
        $ic38$ = ConsesLow.list((SubLObject)makeKeyword("STRIPING"));
        $ic39$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#30892", "CYC"), (SubLObject)makeSymbol("S#8816", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic40$ = ConsesLow.list((SubLObject)makeKeyword("DONE"));
        $ic41$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic42$ = makeKeyword("DONE");
        $ic43$ = makeSymbol("CSOME");
        $ic44$ = makeSymbol("S#30938", "CYC");
        $ic45$ = makeSymbol("S#30917", "CYC");
        $ic46$ = makeSymbol("PUNLESS");
        $ic47$ = makeSymbol("S#30946", "CYC");
        $ic48$ = makeSymbol("DO-LIST");
        $ic49$ = makeSymbol("S#29329", "CYC");
        $ic50$ = makeSymbol("S#30570", "CYC");
        $ic51$ = makeSymbol("PWHEN");
        $ic52$ = makeSymbol("S#30923", "CYC");
        $ic53$ = makeKeyword("NEW-ROOT");
        $ic54$ = makeKeyword("TRANSFORMATION");
        $ic55$ = makeSymbol("S#28203", "CYC");
        $ic56$ = makeSymbol("S#26082", "CYC");
        $ic57$ = makeString("~a already has a removal substrategy ~a");
        $ic58$ = makeKeyword("REMOVAL");
        $ic59$ = makeString("Creating a throwaway removal substrategy of ~a");
        $ic60$ = makeSymbol("S#29327", "CYC");
        $ic61$ = makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic62$ = makeSymbol("S#30895", "CYC");
        $ic63$ = makeSymbol("S#30896", "CYC");
        $ic64$ = ConsesLow.list((SubLObject)makeSymbol("S#31083", "CYC"), (SubLObject)makeSymbol("S#134", "CYC"), (SubLObject)makeSymbol("S#5849", "CYC"), (SubLObject)makeSymbol("S#31084", "CYC"), (SubLObject)makeSymbol("S#31085", "CYC"), (SubLObject)makeSymbol("S#31086", "CYC"), (SubLObject)makeSymbol("S#31087", "CYC"), (SubLObject)makeSymbol("S#31088", "CYC"));
        $ic65$ = ConsesLow.list((SubLObject)makeKeyword("START-INFERENCE-STEP-COUNT"), (SubLObject)makeKeyword("INDEX"), (SubLObject)makeKeyword("START-TIME"), (SubLObject)makeKeyword("TIME-TO-FIRST-ANSWER"), (SubLObject)makeKeyword("STEPS-TO-FIRST-ANSWER"), (SubLObject)makeKeyword("TIME-TO-LAST-ANSWER"), (SubLObject)makeKeyword("STEPS-TO-LAST-ANSWER"), (SubLObject)makeKeyword("ANSWER-COUNT"));
        $ic66$ = ConsesLow.list((SubLObject)makeSymbol("S#30952", "CYC"), (SubLObject)makeSymbol("S#30953", "CYC"), (SubLObject)makeSymbol("S#30954", "CYC"), (SubLObject)makeSymbol("S#30955", "CYC"), (SubLObject)makeSymbol("S#30956", "CYC"), (SubLObject)makeSymbol("S#30957", "CYC"), (SubLObject)makeSymbol("S#30958", "CYC"), (SubLObject)makeSymbol("S#30959", "CYC"));
        $ic67$ = ConsesLow.list((SubLObject)makeSymbol("S#30960", "CYC"), (SubLObject)makeSymbol("S#30961", "CYC"), (SubLObject)makeSymbol("S#30962", "CYC"), (SubLObject)makeSymbol("S#30963", "CYC"), (SubLObject)makeSymbol("S#30964", "CYC"), (SubLObject)makeSymbol("S#30965", "CYC"), (SubLObject)makeSymbol("S#30966", "CYC"), (SubLObject)makeSymbol("S#30967", "CYC"));
        $ic68$ = makeSymbol("S#30951", "CYC");
        $ic69$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#30896", "CYC"));
        $ic70$ = makeSymbol("S#30952", "CYC");
        $ic71$ = makeSymbol("S#30960", "CYC");
        $ic72$ = makeSymbol("S#30953", "CYC");
        $ic73$ = makeSymbol("S#30961", "CYC");
        $ic74$ = makeSymbol("S#30954", "CYC");
        $ic75$ = makeSymbol("S#30962", "CYC");
        $ic76$ = makeSymbol("S#30955", "CYC");
        $ic77$ = makeSymbol("S#30963", "CYC");
        $ic78$ = makeSymbol("S#30956", "CYC");
        $ic79$ = makeSymbol("S#30964", "CYC");
        $ic80$ = makeSymbol("S#30957", "CYC");
        $ic81$ = makeSymbol("S#30965", "CYC");
        $ic82$ = makeSymbol("S#30958", "CYC");
        $ic83$ = makeSymbol("S#30966", "CYC");
        $ic84$ = makeSymbol("S#30959", "CYC");
        $ic85$ = makeSymbol("S#30967", "CYC");
        $ic86$ = makeKeyword("START-INFERENCE-STEP-COUNT");
        $ic87$ = makeKeyword("INDEX");
        $ic88$ = makeKeyword("START-TIME");
        $ic89$ = makeKeyword("TIME-TO-FIRST-ANSWER");
        $ic90$ = makeKeyword("STEPS-TO-FIRST-ANSWER");
        $ic91$ = makeKeyword("TIME-TO-LAST-ANSWER");
        $ic92$ = makeKeyword("STEPS-TO-LAST-ANSWER");
        $ic93$ = makeKeyword("ANSWER-COUNT");
        $ic94$ = makeSymbol("S#30968", "CYC");
        $ic95$ = makeSymbol("S#30970", "CYC");
        $ic96$ = makeKeyword("NEW-ROOT-START-INFERENCE-STEP-COUNT");
        $ic97$ = makeKeyword("NEW-ROOT-START-TIME");
        $ic98$ = makeKeyword("NEW-ROOT-TIME-TO-FIRST-ANSWER");
        $ic99$ = makeKeyword("NEW-ROOT-STEPS-TO-FIRST-ANSWER");
        $ic100$ = makeKeyword("NEW-ROOT-TIME-TO-LAST-ANSWER");
        $ic101$ = makeKeyword("NEW-ROOT-STEPS-TO-LAST-ANSWER");
        $ic102$ = makeKeyword("NEW-ROOT-ANSWER-COUNT");
        $ic103$ = makeKeyword("NEW-ROOT-STEP-COUNT");
        $ic104$ = makeKeyword("NEW-ROOT-EXHAUSTED?");
        $ic105$ = makeSymbol("S#30992", "CYC");
        $ic106$ = makeKeyword("UNINTERESTING");
        $ic107$ = makeSymbol("S#30993", "CYC");
        $ic108$ = makeInteger(33);
        $ic109$ = makeInteger(40);
        $ic110$ = makeKeyword("RECONSIDER-SET-ASIDES");
        $ic111$ = makeKeyword("PROPAGATE-ANSWER-LINK");
        $ic112$ = makeKeyword("INTERESTING");
        $ic113$ = makeKeyword("ONE-STRIPE");
        $ic114$ = makeKeyword("PROOFINESS");
        $ic115$ = makeKeyword("DELAY");
        $ic116$ = makeKeyword("ROOT-MOTIVATION");
        $ic117$ = makeKeyword("MOTIVATION");
        $ic118$ = makeKeyword("FAVOR-ANSWERABLE-NEW-ROOTS");
        $ic119$ = makeString("~a do-one-step: ~a~%");
        $ic120$ = makeInteger(300);
        $ic121$ = makeInteger(11000);
        $ic122$ = makeInteger(27);
        $ic123$ = makeInteger(81);
        $ic124$ = makeInteger(120);
        $ic125$ = makeInteger(500);
        $ic126$ = makeInteger(100);
        $ic127$ = makeInteger(1000);
        $ic128$ = makeSymbol("S#31013", "CYC");
        $ic129$ = makeSymbol("S#31014", "CYC");
        $ic130$ = makeSymbol("S#31015", "CYC");
        $ic131$ = makeSymbol("S#31016", "CYC");
        $ic132$ = makeSymbol("S#31017", "CYC");
        $ic133$ = makeSymbol("S#31018", "CYC");
        $ic134$ = makeSymbol("S#31019", "CYC");
        $ic135$ = makeSymbol("S#31020", "CYC");
        $ic136$ = makeSymbol("S#31021", "CYC");
        $ic137$ = makeSymbol("S#31022", "CYC");
        $ic138$ = makeSymbol("S#31023", "CYC");
        $ic139$ = makeKeyword("RESTRICTION");
        $ic140$ = makeKeyword("JOIN-ORDERED");
        $ic141$ = makeSymbol("S#27381", "CYC");
        $ic142$ = makeKeyword("COMPLETE");
        $ic143$ = makeKeyword("SIMPLIFICATION");
        $ic144$ = makeSymbol("S#31029", "CYC");
        $ic145$ = makeSymbol("S#31030", "CYC");
        $ic146$ = makeSymbol("S#31031", "CYC");
        $ic147$ = makeKeyword("SPLIT");
        $ic148$ = makeKeyword("UNION");
        $ic149$ = makeSymbol("S#30356", "CYC");
        $ic150$ = makeKeyword("RESIDUAL-TRANSFORMATION");
        $ic151$ = makeSymbol("S#27343", "CYC");
        $ic152$ = makeSymbol("S#27351", "CYC");
        $ic153$ = makeSymbol("S#31045", "CYC");
        $ic154$ = makeSymbol("S#31046", "CYC");
        $ic155$ = makeKeyword("COMPLETE-REMOVAL-TACTIC-NO-GOOD");
        $ic156$ = makeSymbol("S#31047", "CYC");
        $ic157$ = makeKeyword("FINISHED");
        $ic158$ = makeKeyword("NO-GOOD");
        $ic159$ = makeKeyword("GOOD");
        $ic160$ = makeKeyword("NEUTRAL");
        $ic161$ = makeKeyword("POSSIBLE");
        $ic162$ = makeKeyword("PENDING");
        $ic163$ = makeKeyword("TACTICAL");
        $ic164$ = makeKeyword("CONNECTED-CONJUNCTION");
        $ic165$ = makeString("Active Removal Substrategies:");
        $ic166$ = makeString("Inactive Removal Substrategies:");
        $ic167$ = makeKeyword("STRATEGY");
        $ic168$ = makeKeyword("PROBLEM");
        $ic169$ = makeKeyword("NEW-ROOT-METRICS");
        $ic170$ = makeSymbol("S#31060", "CYC");
        $ic171$ = makeSymbol("S#31064", "CYC");
        $ic172$ = makeSymbol("<");
        $ic173$ = makeSymbol("S#31061", "CYC");
        $ic174$ = makeSymbol("S#31063", "CYC");
    }
    
    public static final class $sX30893_native extends SubLStructNative
    {
        public SubLObject $new_root_substrategy;
        public SubLObject $transformation_substrategy;
        public SubLObject $removal_substrategies;
        public SubLObject $new_root_r_map;
        public SubLObject $new_root_proofiness_map;
        public SubLObject $new_root_delay_map;
        public SubLObject $new_root_metrics_map;
        private static final SubLStructDeclNative structDecl;
        
        public $sX30893_native() {
            this.$new_root_substrategy = (SubLObject)CommonSymbols.NIL;
            this.$transformation_substrategy = (SubLObject)CommonSymbols.NIL;
            this.$removal_substrategies = (SubLObject)CommonSymbols.NIL;
            this.$new_root_r_map = (SubLObject)CommonSymbols.NIL;
            this.$new_root_proofiness_map = (SubLObject)CommonSymbols.NIL;
            this.$new_root_delay_map = (SubLObject)CommonSymbols.NIL;
            this.$new_root_metrics_map = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX30893_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$new_root_substrategy;
        }
        
        public SubLObject getField3() {
            return this.$transformation_substrategy;
        }
        
        public SubLObject getField4() {
            return this.$removal_substrategies;
        }
        
        public SubLObject getField5() {
            return this.$new_root_r_map;
        }
        
        public SubLObject getField6() {
            return this.$new_root_proofiness_map;
        }
        
        public SubLObject getField7() {
            return this.$new_root_delay_map;
        }
        
        public SubLObject getField8() {
            return this.$new_root_metrics_map;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$new_root_substrategy = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$transformation_substrategy = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$removal_substrategies = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$new_root_r_map = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$new_root_proofiness_map = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$new_root_delay_map = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$new_root_metrics_map = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX30893_native.class, $ic2$, $ic3$, $ic4$, $ic5$, new String[] { "$new_root_substrategy", "$transformation_substrategy", "$removal_substrategies", "$new_root_r_map", "$new_root_proofiness_map", "$new_root_delay_map", "$new_root_metrics_map" }, $ic6$, $ic7$, $ic8$);
        }
    }
    
    public static final class $f27777$UnaryFunction extends UnaryFunction
    {
        public $f27777$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#30894"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f27777(var3);
        }
    }
    
    public static final class $sX30895_native extends SubLStructNative
    {
        public SubLObject $start_inference_step_count;
        public SubLObject $index;
        public SubLObject $start_time;
        public SubLObject $time_to_first_answer;
        public SubLObject $steps_to_first_answer;
        public SubLObject $time_to_last_answer;
        public SubLObject $steps_to_last_answer;
        public SubLObject $answer_count;
        private static final SubLStructDeclNative structDecl;
        
        public $sX30895_native() {
            this.$start_inference_step_count = (SubLObject)CommonSymbols.NIL;
            this.$index = (SubLObject)CommonSymbols.NIL;
            this.$start_time = (SubLObject)CommonSymbols.NIL;
            this.$time_to_first_answer = (SubLObject)CommonSymbols.NIL;
            this.$steps_to_first_answer = (SubLObject)CommonSymbols.NIL;
            this.$time_to_last_answer = (SubLObject)CommonSymbols.NIL;
            this.$steps_to_last_answer = (SubLObject)CommonSymbols.NIL;
            this.$answer_count = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX30895_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$start_inference_step_count;
        }
        
        public SubLObject getField3() {
            return this.$index;
        }
        
        public SubLObject getField4() {
            return this.$start_time;
        }
        
        public SubLObject getField5() {
            return this.$time_to_first_answer;
        }
        
        public SubLObject getField6() {
            return this.$steps_to_first_answer;
        }
        
        public SubLObject getField7() {
            return this.$time_to_last_answer;
        }
        
        public SubLObject getField8() {
            return this.$steps_to_last_answer;
        }
        
        public SubLObject getField9() {
            return this.$answer_count;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$start_inference_step_count = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$index = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$start_time = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$time_to_first_answer = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$steps_to_first_answer = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$time_to_last_answer = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$steps_to_last_answer = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$answer_count = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX30895_native.class, $ic62$, $ic63$, $ic64$, $ic65$, new String[] { "$start_inference_step_count", "$index", "$start_time", "$time_to_first_answer", "$steps_to_first_answer", "$time_to_last_answer", "$steps_to_last_answer", "$answer_count" }, $ic66$, $ic67$, $ic8$);
        }
    }
    
    public static final class $f27834$UnaryFunction extends UnaryFunction
    {
        public $f27834$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#30896"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f27834(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 728 ms
	
	Decompiled with Procyon 0.5.32.
*/