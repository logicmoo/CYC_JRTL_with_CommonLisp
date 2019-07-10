package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0284 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0284";
    public static final String myFingerPrint = "7603acb2a03f450f147e4c0a5ef20bcf85c9b5b768f5a06cf52da59e4e5eac12";
    public static SubLSymbol $g2631$;
    public static SubLSymbol $g2632$;
    public static SubLSymbol $g2633$;
    public static SubLSymbol $g2634$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
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
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLString $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLList $ic33$;
    private static final SubLList $ic34$;
    private static final SubLList $ic35$;
    private static final SubLList $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLList $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLString $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLList $ic52$;
    private static final SubLList $ic53$;
    private static final SubLList $ic54$;
    private static final SubLList $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLList $ic58$;
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
    private static final SubLString $ic69$;
    private static final SubLString $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLList $ic78$;
    private static final SubLList $ic79$;
    private static final SubLList $ic80$;
    private static final SubLList $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLList $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLString $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLString $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLString $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    
    public static SubLObject f18780(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18781(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX21367_native.class) ? T : NIL);
    }
    
    public static SubLObject f18782(final SubLObject var1) {
        assert NIL != f18781(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f18783(final SubLObject var1) {
        assert NIL != f18781(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f18784(final SubLObject var1) {
        assert NIL != f18781(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f18785(final SubLObject var1) {
        assert NIL != f18781(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f18786(final SubLObject var1) {
        assert NIL != f18781(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f18787(final SubLObject var1, final SubLObject var4) {
        assert NIL != f18781(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f18788(final SubLObject var1, final SubLObject var4) {
        assert NIL != f18781(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f18789(final SubLObject var1, final SubLObject var4) {
        assert NIL != f18781(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f18790(final SubLObject var1, final SubLObject var4) {
        assert NIL != f18781(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f18791(final SubLObject var1, final SubLObject var4) {
        assert NIL != f18781(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f18792(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX21367_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic19$)) {
                f18787(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic20$)) {
                f18788(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic21$)) {
                f18789(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic22$)) {
                f18790(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic23$)) {
                f18791(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic24$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f18793(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic25$, (SubLObject)$ic26$, (SubLObject)FIVE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic27$, (SubLObject)$ic19$, f18782(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic27$, (SubLObject)$ic20$, f18783(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic27$, (SubLObject)$ic21$, f18784(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic27$, (SubLObject)$ic22$, f18785(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic27$, (SubLObject)$ic23$, f18786(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic28$, (SubLObject)$ic26$, (SubLObject)FIVE_INTEGER);
        return var11;
    }
    
    public static SubLObject f18794(final SubLObject var11, final SubLObject var12) {
        return f18793(var11, var12);
    }
    
    public static SubLObject f18795(final SubLObject var13) {
        return (SubLObject)((NIL != var13) ? ConsesLow.list(f18782(var13), f18783(var13), f18784(var13), f18785(var13), f18786(var13)) : NIL);
    }
    
    public static SubLObject f18796(final SubLObject var14) {
        return module0035.f2403(Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic30$), var14));
    }
    
    public static SubLObject f18797(final SubLObject var1, final SubLObject var2) {
        f18798(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18799(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX21369_native.class) ? T : NIL);
    }
    
    public static SubLObject f18800(final SubLObject var1) {
        assert NIL != f18799(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f18801(final SubLObject var1) {
        assert NIL != f18799(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f18802(final SubLObject var1, final SubLObject var4) {
        assert NIL != f18799(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f18803(final SubLObject var1, final SubLObject var4) {
        assert NIL != f18799(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f18804(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX21369_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic44$)) {
                f18802(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic45$)) {
                f18803(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic24$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f18805(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic25$, (SubLObject)$ic46$, (SubLObject)TWO_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic27$, (SubLObject)$ic44$, f18800(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic27$, (SubLObject)$ic45$, f18801(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic28$, (SubLObject)$ic46$, (SubLObject)TWO_INTEGER);
        return var11;
    }
    
    public static SubLObject f18806(final SubLObject var11, final SubLObject var12) {
        return f18805(var11, var12);
    }
    
    public static SubLObject f18798(final SubLObject var18, final SubLObject var2, final SubLObject var19) {
        PrintLow.format(var2, (SubLObject)$ic48$, f18807(var18));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18808(final SubLObject var20, final SubLObject var21) {
        final SubLObject var22 = f18804((SubLObject)UNPROVIDED);
        f18802(var22, var20);
        f18803(var22, var21);
        return var22;
    }
    
    public static SubLObject f18809(final SubLObject var22) {
        return (SubLObject)ConsesLow.list((SubLObject)$ic49$, f18801(var22));
    }
    
    public static SubLObject f18807(final SubLObject var22) {
        return (SubLObject)ConsesLow.list(module0201.f12550(f18800(var22)), f18801(var22));
    }
    
    public static SubLObject f18810(final SubLObject var23, final SubLObject var24, final SubLObject var25) {
        return (SubLObject)ConsesLow.list(module0035.f2048(var23, var24, (SubLObject)UNPROVIDED), module0035.f2048(var23, var25, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f18811(final SubLObject var1, final SubLObject var2) {
        f18812(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18813(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX21371_native.class) ? T : NIL);
    }
    
    public static SubLObject f18814(final SubLObject var1) {
        assert NIL != f18813(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f18815(final SubLObject var1) {
        assert NIL != f18813(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f18816(final SubLObject var1) {
        assert NIL != f18813(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f18817(final SubLObject var1, final SubLObject var4) {
        assert NIL != f18813(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f18818(final SubLObject var1, final SubLObject var4) {
        assert NIL != f18813(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f18819(final SubLObject var1, final SubLObject var4) {
        assert NIL != f18813(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f18820(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX21371_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic65$)) {
                f18817(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic45$)) {
                f18818(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic66$)) {
                f18819(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic24$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f18821(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic25$, (SubLObject)$ic67$, (SubLObject)THREE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic27$, (SubLObject)$ic65$, f18814(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic27$, (SubLObject)$ic45$, f18815(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic27$, (SubLObject)$ic66$, f18816(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic28$, (SubLObject)$ic67$, (SubLObject)THREE_INTEGER);
        return var11;
    }
    
    public static SubLObject f18822(final SubLObject var11, final SubLObject var12) {
        return f18821(var11, var12);
    }
    
    public static SubLObject f18812(final SubLObject var18, final SubLObject var2, final SubLObject var19) {
        PrintLow.format(var2, (SubLObject)$ic69$, f18823(var18));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18824(final SubLObject var29, final SubLObject var30) {
        SubLObject var31 = var30;
        SubLObject var32 = (SubLObject)NIL;
        var32 = var31.first();
        while (NIL != var31) {
            if (var29.numE(f18814(var32))) {
                return var32;
            }
            var31 = var31.rest();
            var32 = var31.first();
        }
        Errors.warn((SubLObject)$ic70$, var29);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18825(final SubLObject var33) {
        return ConsesLow.append(f18826(var33), (SubLObject)ConsesLow.list(f18827(var33)));
    }
    
    public static SubLObject f18823(final SubLObject var33) {
        return ConsesLow.append(f18828(var33), (SubLObject)ConsesLow.list(f18829(var33)));
    }
    
    public static SubLObject f18826(final SubLObject var33) {
        return (SubLObject)ConsesLow.list((SubLObject)$ic49$, f18795(f18815(var33)));
    }
    
    public static SubLObject f18828(final SubLObject var33) {
        return (SubLObject)ConsesLow.list(module0201.f12550(f18814(var33)), f18795(f18815(var33)));
    }
    
    public static SubLObject f18827(final SubLObject var33) {
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic71$), f18816(var33));
    }
    
    public static SubLObject f18829(final SubLObject var33) {
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic72$), f18816(var33));
    }
    
    public static SubLObject f18830(final SubLObject var34, final SubLObject var35, final SubLObject var21) {
        f18819(var34, (SubLObject)ConsesLow.cons(f18808(var35, var21), f18816(var34)));
        return (SubLObject)T;
    }
    
    public static SubLObject f18831(final SubLObject var36, final SubLObject var37) {
        final SubLObject var38 = f18792((SubLObject)UNPROVIDED);
        SubLObject var39 = (SubLObject)NIL;
        f18787(var38, module0205.f13311(var36));
        f18788(var38, Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic73$), module0205.f13312(var36)));
        f18789(var38, Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic74$), module0205.f13314(var36)));
        f18790(var38, module0035.f2398(var36, (SubLObject)MINUS_ONE_INTEGER));
        SubLObject var40 = var37;
        SubLObject var41 = (SubLObject)NIL;
        var41 = var40.first();
        while (NIL != var40) {
            var39 = (SubLObject)ConsesLow.cons(module0035.f2031(var41, var36, (SubLObject)UNPROVIDED), var39);
            var40 = var40.rest();
            var41 = var40.first();
        }
        f18791(var38, var39);
        return var38;
    }
    
    public static SubLObject f18832(final SubLObject var29, final SubLObject var40, final SubLObject var37) {
        final SubLObject var41 = f18820((SubLObject)UNPROVIDED);
        final SubLObject var42 = ConsesLow.nth(var29, var40);
        f18817(var41, var29);
        f18818(var41, f18831(var42, var37));
        SubLObject var43 = module0035.f2399(var42, Symbols.symbol_function((SubLObject)$ic75$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var44 = (SubLObject)NIL;
        var44 = var43.first();
        while (NIL != var43) {
            SubLObject var45;
            SubLObject var46;
            for (var45 = Sequences.length(var40), var46 = (SubLObject)NIL, var46 = (SubLObject)ZERO_INTEGER; var46.numL(var45); var46 = Numbers.add(var46, (SubLObject)ONE_INTEGER)) {
                if (NIL != module0035.f2428(var44, ConsesLow.nth(var46, var40), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    f18830(var41, var46, f18810(var44, var42, ConsesLow.nth(var46, var40)));
                }
            }
            var43 = var43.rest();
            var44 = var43.first();
        }
        return var41;
    }
    
    public static SubLObject f18833(final SubLObject var1, final SubLObject var2) {
        f18834(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18835(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX21373_native.class) ? T : NIL);
    }
    
    public static SubLObject f18836(final SubLObject var1) {
        assert NIL != f18835(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f18837(final SubLObject var1) {
        assert NIL != f18835(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f18838(final SubLObject var1, final SubLObject var4) {
        assert NIL != f18835(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f18839(final SubLObject var1, final SubLObject var4) {
        assert NIL != f18835(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f18840(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX21373_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic89$)) {
                f18838(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic90$)) {
                f18839(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic24$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f18841(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic25$, (SubLObject)$ic91$, (SubLObject)TWO_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic27$, (SubLObject)$ic89$, f18836(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic27$, (SubLObject)$ic90$, f18837(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic28$, (SubLObject)$ic91$, (SubLObject)TWO_INTEGER);
        return var11;
    }
    
    public static SubLObject f18842(final SubLObject var11, final SubLObject var12) {
        return f18841(var11, var12);
    }
    
    public static SubLObject f18834(final SubLObject var18, final SubLObject var2, final SubLObject var19) {
        PrintLow.format(var2, (SubLObject)$ic93$, f18836(var18), f18837(var18));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18843(final SubLObject var46) {
        return (SubLObject)$ic49$;
    }
    
    public static SubLObject f18844(final SubLObject var47) {
        return module0036.f2532(f18845(var47), Symbols.symbol_function((SubLObject)$ic94$), Symbols.symbol_function((SubLObject)$ic95$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f18845(final SubLObject var47) {
        SubLObject var48 = (SubLObject)NIL;
        SubLObject var49 = f18837(var47);
        SubLObject var50 = (SubLObject)NIL;
        var50 = var49.first();
        while (NIL != var49) {
            final SubLObject var51 = f18807(var50.first());
            final SubLObject var52 = f18828(var50.rest());
            final SubLObject var53 = f18829(var50.rest());
            var48 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)$ic96$, var51), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)$ic97$, var52), var53)), var48);
            var49 = var49.rest();
            var50 = var49.first();
        }
        return (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)$ic97$, f18828(f18836(var47))), f18829(f18836(var47))), var48);
    }
    
    public static SubLObject f18846(final SubLObject var52, final SubLObject var53) {
        return module0235.f15490(f18845(var52), f18845(var53), (SubLObject)T, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f18847(final SubLObject var52, final SubLObject var53) {
        return Equality.equal((SubLObject)ConsesLow.list(module0233.f15403()), f18846(var52, var53));
    }
    
    public static SubLObject f18848(final SubLObject var52, final SubLObject var53) {
        final SubLObject var54 = f18844(var52);
        final SubLObject var55 = f18844(var53);
        if (NIL != module0035.f2396(var54, var55, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        if (NIL != module0035.f2396(var55, var54, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        Errors.warn((SubLObject)$ic98$, var52, var53);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18849(final SubLObject var56) {
        if (NIL != module0035.f1997(var56)) {
            return var56.first();
        }
        final SubLObject var57 = Sort.sort(conses_high.copy_list(var56), Symbols.symbol_function((SubLObject)$ic99$), (SubLObject)UNPROVIDED);
        if (!var57.first().equal(conses_high.second(var57))) {
            return var57.first();
        }
        Errors.warn((SubLObject)$ic100$, var56);
        return var56.first();
    }
    
    public static SubLObject f18850(final SubLObject var58) {
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic101$), var58);
    }
    
    public static SubLObject f18851(final SubLObject var58) {
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic102$), var58);
    }
    
    public static SubLObject f18852(final SubLObject var59, final SubLObject var60) {
        return module0235.f15491(f18850(var59), f18850(var60), (SubLObject)T, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f18853(final SubLObject var59, final SubLObject var60) {
        return Equality.equal((SubLObject)ConsesLow.list(module0233.f15403()), f18852(var59, var60));
    }
    
    public static SubLObject f18854(final SubLObject var59, final SubLObject var60) {
        final SubLObject var61 = f18851(var59);
        final SubLObject var62 = f18851(var60);
        return module0035.f2395(var61, var62, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f18855(final SubLObject var63, final SubLObject var64) {
        if (var63.numE(Sequences.length(var64))) {
            return var64.first();
        }
        final SubLObject var65 = Sort.sort(var64, Symbols.symbol_function((SubLObject)$ic103$), (SubLObject)UNPROVIDED);
        if (var65.first().equal(ConsesLow.nth(var63, var65))) {
            return (SubLObject)NIL;
        }
        return var65.first();
    }
    
    public static SubLObject f18856(final SubLObject var66) {
        SubLObject var67 = var66;
        SubLObject var68 = (SubLObject)NIL;
        var68 = var67.first();
        while (NIL != var67) {
            if (NIL == f18837(var68)) {
                return f18836(var68);
            }
            var67 = var67.rest();
            var68 = var67.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18857(final SubLObject var67) {
        SubLObject var68 = (SubLObject)NIL;
        SubLObject var69 = var67;
        SubLObject var70 = (SubLObject)NIL;
        var70 = var69.first();
        while (NIL != var69) {
            var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(f18840((SubLObject)ConsesLow.list((SubLObject)$ic89$, var70))), var68);
            var69 = var69.rest();
            var70 = var69.first();
        }
        return var68;
    }
    
    public static SubLObject f18858(final SubLObject var67, final SubLObject var68) {
        SubLObject var69 = (SubLObject)NIL;
        if (NIL == var69) {
            SubLObject var70 = var68;
            SubLObject var71 = (SubLObject)NIL;
            var71 = var70.first();
            while (NIL == var69 && NIL != var70) {
                if (Sequences.length(var71).numGE(Sequences.length(var67))) {
                    SubLObject var72 = (SubLObject)NIL;
                    SubLObject var73 = var71;
                    SubLObject var74 = (SubLObject)NIL;
                    var74 = var73.first();
                    while (NIL != var73) {
                        final SubLObject var75 = f18814(f18836(var74));
                        if (NIL == conses_high.member(var75, var72, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                            var72 = (SubLObject)ConsesLow.cons(var75, var72);
                        }
                        var73 = var73.rest();
                        var74 = var73.first();
                    }
                    var69 = Numbers.numL(Sequences.length(var72), Sequences.length(var67));
                }
                else {
                    var69 = (SubLObject)T;
                }
                var70 = var70.rest();
                var71 = var70.first();
            }
        }
        return var69;
    }
    
    public static SubLObject f18859(final SubLObject var67, SubLObject var63) {
        if (var63 == UNPROVIDED) {
            var63 = (SubLObject)ONE_INTEGER;
        }
        final SubLObject var68 = f18857(var67);
        final SubLObject var69 = f18860(var67, var68, var63);
        if (NIL != var69) {
            return var69;
        }
        if (var63.numE(Sequences.length(var67))) {
            return var67.first();
        }
        return f18859(var67, Numbers.add((SubLObject)ONE_INTEGER, var63));
    }
    
    public static SubLObject f18860(final SubLObject var67, final SubLObject var68, final SubLObject var63) {
        final SubLObject var69 = f18855(var63, var68);
        if (NIL != var69) {
            return f18856(var69);
        }
        if (NIL != f18858(var67, var68)) {
            return (SubLObject)NIL;
        }
        SubLObject var70 = (SubLObject)NIL;
        SubLObject var71 = var68;
        SubLObject var72 = (SubLObject)NIL;
        var72 = var71.first();
        while (NIL != var71) {
            SubLObject var73 = var72;
            SubLObject var31_77 = var72;
            SubLObject var74 = (SubLObject)NIL;
            var74 = var31_77.first();
            while (NIL != var31_77) {
                final SubLObject var75 = f18836(var74);
                SubLObject var31_78 = f18816(var75);
                SubLObject var76 = (SubLObject)NIL;
                var76 = var31_78.first();
                while (NIL != var31_78) {
                    final SubLObject var77 = f18824(f18800(var76), var67);
                    final SubLObject var78 = (SubLObject)ConsesLow.list(var76, var75);
                    final SubLObject var79 = (SubLObject)ConsesLow.cons(var78, f18837(var74));
                    final SubLObject var80 = f18840((SubLObject)ConsesLow.list((SubLObject)$ic89$, var77, (SubLObject)$ic90$, var79));
                    var73 = (SubLObject)ConsesLow.cons(var80, var73);
                    var31_78 = var31_78.rest();
                    var76 = var31_78.first();
                }
                var31_77 = var31_77.rest();
                var74 = var31_77.first();
            }
            var70 = (SubLObject)ConsesLow.cons(var73, var70);
            var71 = var71.rest();
            var72 = var71.first();
        }
        return f18860(var67, var70, var63);
    }
    
    public static SubLObject f18861(final SubLObject var40) {
        final SubLObject var41 = module0285.f19059(var40);
        if (NIL != var41) {
            return (SubLObject)ConsesLow.list(var41);
        }
        final SubLObject var42 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic104$), var40);
        final SubLObject var43 = Sort.sort(conses_high.copy_list(var42), Symbols.symbol_function((SubLObject)$ic105$), (SubLObject)UNPROVIDED);
        if (!var43.first().equal(conses_high.second(var43))) {
            return (SubLObject)ConsesLow.list(ConsesLow.nth(Sequences.position(var43.first(), var42, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var40));
        }
        return var40;
    }
    
    public static SubLObject f18862(final SubLObject var40, final SubLObject var87) {
        final SubLObject var88 = f18863(var87, var40);
        SubLObject var89 = (SubLObject)NIL;
        SubLObject var90;
        SubLObject var91;
        SubLObject var92;
        for (var90 = Sequences.length(var40), var91 = (SubLObject)NIL, var91 = (SubLObject)ZERO_INTEGER; var91.numL(var90); var91 = Numbers.add(var91, (SubLObject)ONE_INTEGER)) {
            var92 = f18832(var91, var40, var88);
            var89 = (SubLObject)ConsesLow.cons(var92, var89);
        }
        return ConsesLow.nth(f18814(f18859(var89, (SubLObject)UNPROVIDED)), var40);
    }
    
    public static SubLObject f18863(final SubLObject var87, final SubLObject var40) {
        return (SubLObject)((NIL != var87) ? module0035.f2226(module0202.f12948(var87, Symbols.symbol_function((SubLObject)$ic75$)), module0202.f12948(var40, Symbols.symbol_function((SubLObject)$ic75$)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL);
    }
    
    public static SubLObject f18864() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18780", "S#21376", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18781", "S#21368", 1, 0, false);
        new $f18781$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18782", "S#21377", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18783", "S#21378", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18784", "S#21379", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18785", "S#21380", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18786", "S#21381", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18787", "S#21382", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18788", "S#21383", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18789", "S#21384", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18790", "S#21385", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18791", "S#21386", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18792", "S#21387", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18793", "S#21388", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18794", "S#21389", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18795", "S#21390", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18796", "S#21391", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18797", "S#21392", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18799", "S#21370", 1, 0, false);
        new $f18799$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18800", "S#21393", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18801", "S#21394", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18802", "S#21395", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18803", "S#21396", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18804", "S#21397", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18805", "S#21398", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18806", "S#21399", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18798", "S#21400", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18808", "S#21401", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18809", "S#21402", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18807", "S#21403", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18810", "S#21404", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18811", "S#21405", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18813", "S#21372", 1, 0, false);
        new $f18813$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18814", "S#21406", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18815", "S#21407", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18816", "S#21408", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18817", "S#21409", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18818", "S#21410", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18819", "S#21411", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18820", "S#21412", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18821", "S#21413", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18822", "S#21414", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18812", "S#21415", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18824", "S#21416", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18825", "S#21417", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18823", "S#21418", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18826", "S#21419", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18828", "S#21420", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18827", "S#21421", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18829", "S#21422", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18830", "S#21423", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18831", "S#21424", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18832", "S#21425", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18833", "S#21426", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18835", "S#21374", 1, 0, false);
        new $f18835$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18836", "S#21427", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18837", "S#21428", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18838", "S#21429", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18839", "S#21430", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18840", "S#21431", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18841", "S#21432", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18842", "S#21433", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18834", "S#21434", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18843", "S#21435", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18844", "S#21436", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18845", "S#21437", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18846", "S#21438", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18847", "S#21439", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18848", "S#21440", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18849", "S#21441", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18850", "S#21442", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18851", "S#21443", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18852", "S#21444", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18853", "S#21445", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18854", "S#21446", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18855", "S#21447", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18856", "S#21448", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18857", "S#21449", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18858", "S#21450", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18859", "S#21451", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18860", "S#21452", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18861", "S#21453", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18862", "S#21454", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0284", "f18863", "S#21455", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18865() {
        $g2631$ = SubLFiles.defconstant("S#21456", (SubLObject)$ic0$);
        $g2632$ = SubLFiles.defconstant("S#21457", (SubLObject)$ic31$);
        $g2633$ = SubLFiles.defconstant("S#21458", (SubLObject)$ic50$);
        $g2634$ = SubLFiles.defconstant("S#21459", (SubLObject)$ic76$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18866() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g2631$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic8$);
        Structures.def_csetf((SubLObject)$ic9$, (SubLObject)$ic10$);
        Structures.def_csetf((SubLObject)$ic11$, (SubLObject)$ic12$);
        Structures.def_csetf((SubLObject)$ic13$, (SubLObject)$ic14$);
        Structures.def_csetf((SubLObject)$ic15$, (SubLObject)$ic16$);
        Structures.def_csetf((SubLObject)$ic17$, (SubLObject)$ic18$);
        Equality.identity((SubLObject)$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g2631$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic29$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g2632$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic38$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic39$);
        Structures.def_csetf((SubLObject)$ic40$, (SubLObject)$ic41$);
        Structures.def_csetf((SubLObject)$ic42$, (SubLObject)$ic43$);
        Equality.identity((SubLObject)$ic31$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g2632$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic47$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g2633$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic57$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic58$);
        Structures.def_csetf((SubLObject)$ic59$, (SubLObject)$ic60$);
        Structures.def_csetf((SubLObject)$ic61$, (SubLObject)$ic62$);
        Structures.def_csetf((SubLObject)$ic63$, (SubLObject)$ic64$);
        Equality.identity((SubLObject)$ic50$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g2633$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic68$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g2634$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic83$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic84$);
        Structures.def_csetf((SubLObject)$ic85$, (SubLObject)$ic86$);
        Structures.def_csetf((SubLObject)$ic87$, (SubLObject)$ic88$);
        Equality.identity((SubLObject)$ic76$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g2634$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic92$));
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f18864();
    }
    
    public void initializeVariables() {
        f18865();
    }
    
    public void runTopLevelForms() {
        f18866();
    }
    
    static {
        me = (SubLFile)new module0284();
        $g2631$ = null;
        $g2632$ = null;
        $g2633$ = null;
        $g2634$ = null;
        $ic0$ = makeSymbol("S#21367", "CYC");
        $ic1$ = makeSymbol("S#21368", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)makeSymbol("S#16187", "CYC"), (SubLObject)makeSymbol("S#16191", "CYC"), (SubLObject)makeSymbol("S#16193", "CYC"), (SubLObject)makeSymbol("S#3695", "CYC"), (SubLObject)makeSymbol("S#21460", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)makeKeyword("SORTED-CONSTANT-LIST"), (SubLObject)makeKeyword("SORTED-NAT-LIST"), (SubLObject)makeKeyword("SORTED-ASSERTION-LIST"), (SubLObject)makeKeyword("LIST-STRUCTURE"), (SubLObject)makeKeyword("SORTED-VAR-POSITIONS"));
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("S#21377", "CYC"), (SubLObject)makeSymbol("S#21378", "CYC"), (SubLObject)makeSymbol("S#21379", "CYC"), (SubLObject)makeSymbol("S#21380", "CYC"), (SubLObject)makeSymbol("S#21381", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#21382", "CYC"), (SubLObject)makeSymbol("S#21383", "CYC"), (SubLObject)makeSymbol("S#21384", "CYC"), (SubLObject)makeSymbol("S#21385", "CYC"), (SubLObject)makeSymbol("S#21386", "CYC"));
        $ic6$ = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic7$ = makeSymbol("S#21376", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#21368", "CYC"));
        $ic9$ = makeSymbol("S#21377", "CYC");
        $ic10$ = makeSymbol("S#21382", "CYC");
        $ic11$ = makeSymbol("S#21378", "CYC");
        $ic12$ = makeSymbol("S#21383", "CYC");
        $ic13$ = makeSymbol("S#21379", "CYC");
        $ic14$ = makeSymbol("S#21384", "CYC");
        $ic15$ = makeSymbol("S#21380", "CYC");
        $ic16$ = makeSymbol("S#21385", "CYC");
        $ic17$ = makeSymbol("S#21381", "CYC");
        $ic18$ = makeSymbol("S#21386", "CYC");
        $ic19$ = makeKeyword("SORTED-CONSTANT-LIST");
        $ic20$ = makeKeyword("SORTED-NAT-LIST");
        $ic21$ = makeKeyword("SORTED-ASSERTION-LIST");
        $ic22$ = makeKeyword("LIST-STRUCTURE");
        $ic23$ = makeKeyword("SORTED-VAR-POSITIONS");
        $ic24$ = makeString("Invalid slot ~S for construction function");
        $ic25$ = makeKeyword("BEGIN");
        $ic26$ = makeSymbol("S#21387", "CYC");
        $ic27$ = makeKeyword("SLOT");
        $ic28$ = makeKeyword("END");
        $ic29$ = makeSymbol("S#21389", "CYC");
        $ic30$ = makeSymbol("S#21390", "CYC");
        $ic31$ = makeSymbol("S#21369", "CYC");
        $ic32$ = makeSymbol("S#21370", "CYC");
        $ic33$ = ConsesLow.list((SubLObject)makeSymbol("S#1503", "CYC"), (SubLObject)makeSymbol("S#21461", "CYC"));
        $ic34$ = ConsesLow.list((SubLObject)makeKeyword("HEAD"), (SubLObject)makeKeyword("COLOUR"));
        $ic35$ = ConsesLow.list((SubLObject)makeSymbol("S#21393", "CYC"), (SubLObject)makeSymbol("S#21394", "CYC"));
        $ic36$ = ConsesLow.list((SubLObject)makeSymbol("S#21395", "CYC"), (SubLObject)makeSymbol("S#21396", "CYC"));
        $ic37$ = makeSymbol("S#21400", "CYC");
        $ic38$ = makeSymbol("S#21392", "CYC");
        $ic39$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#21370", "CYC"));
        $ic40$ = makeSymbol("S#21393", "CYC");
        $ic41$ = makeSymbol("S#21395", "CYC");
        $ic42$ = makeSymbol("S#21394", "CYC");
        $ic43$ = makeSymbol("S#21396", "CYC");
        $ic44$ = makeKeyword("HEAD");
        $ic45$ = makeKeyword("COLOUR");
        $ic46$ = makeSymbol("S#21397", "CYC");
        $ic47$ = makeSymbol("S#21399", "CYC");
        $ic48$ = makeString("#<ARC:~a>");
        $ic49$ = makeKeyword("VARIABLE");
        $ic50$ = makeSymbol("S#21371", "CYC");
        $ic51$ = makeSymbol("S#21372", "CYC");
        $ic52$ = ConsesLow.list((SubLObject)makeSymbol("S#1519", "CYC"), (SubLObject)makeSymbol("S#21461", "CYC"), (SubLObject)makeSymbol("S#21462", "CYC"));
        $ic53$ = ConsesLow.list((SubLObject)makeKeyword("ID"), (SubLObject)makeKeyword("COLOUR"), (SubLObject)makeKeyword("ARC-SET"));
        $ic54$ = ConsesLow.list((SubLObject)makeSymbol("S#21406", "CYC"), (SubLObject)makeSymbol("S#21407", "CYC"), (SubLObject)makeSymbol("S#21408", "CYC"));
        $ic55$ = ConsesLow.list((SubLObject)makeSymbol("S#21409", "CYC"), (SubLObject)makeSymbol("S#21410", "CYC"), (SubLObject)makeSymbol("S#21411", "CYC"));
        $ic56$ = makeSymbol("S#21415", "CYC");
        $ic57$ = makeSymbol("S#21405", "CYC");
        $ic58$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#21372", "CYC"));
        $ic59$ = makeSymbol("S#21406", "CYC");
        $ic60$ = makeSymbol("S#21409", "CYC");
        $ic61$ = makeSymbol("S#21407", "CYC");
        $ic62$ = makeSymbol("S#21410", "CYC");
        $ic63$ = makeSymbol("S#21408", "CYC");
        $ic64$ = makeSymbol("S#21411", "CYC");
        $ic65$ = makeKeyword("ID");
        $ic66$ = makeKeyword("ARC-SET");
        $ic67$ = makeSymbol("S#21412", "CYC");
        $ic68$ = makeSymbol("S#21414", "CYC");
        $ic69$ = makeString("#<VERTEX:~a>");
        $ic70$ = makeString("vertex number ~a not found");
        $ic71$ = makeSymbol("S#21402", "CYC");
        $ic72$ = makeSymbol("S#21403", "CYC");
        $ic73$ = makeSymbol("NART-ID");
        $ic74$ = makeSymbol("ASSERTION-ID");
        $ic75$ = makeSymbol("VARIABLE-P");
        $ic76$ = makeSymbol("S#21373", "CYC");
        $ic77$ = makeSymbol("S#21374", "CYC");
        $ic78$ = ConsesLow.list((SubLObject)makeSymbol("S#21371", "CYC"), (SubLObject)makeSymbol("S#21463", "CYC"));
        $ic79$ = ConsesLow.list((SubLObject)makeKeyword("VERTEX"), (SubLObject)makeKeyword("SEARCH-HISTORY"));
        $ic80$ = ConsesLow.list((SubLObject)makeSymbol("S#21427", "CYC"), (SubLObject)makeSymbol("S#21428", "CYC"));
        $ic81$ = ConsesLow.list((SubLObject)makeSymbol("S#21429", "CYC"), (SubLObject)makeSymbol("S#21430", "CYC"));
        $ic82$ = makeSymbol("S#21434", "CYC");
        $ic83$ = makeSymbol("S#21426", "CYC");
        $ic84$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#21374", "CYC"));
        $ic85$ = makeSymbol("S#21427", "CYC");
        $ic86$ = makeSymbol("S#21429", "CYC");
        $ic87$ = makeSymbol("S#21428", "CYC");
        $ic88$ = makeSymbol("S#21430", "CYC");
        $ic89$ = makeKeyword("VERTEX");
        $ic90$ = makeKeyword("SEARCH-HISTORY");
        $ic91$ = makeSymbol("S#21431", "CYC");
        $ic92$ = makeSymbol("S#21433", "CYC");
        $ic93$ = makeString("#<NODE:~s ~s>");
        $ic94$ = makeSymbol("EL-VAR?");
        $ic95$ = makeSymbol("S#21435", "CYC");
        $ic96$ = makeKeyword("ARC");
        $ic97$ = makeKeyword("VERTEX-INFO");
        $ic98$ = makeString("graph-search-node-< failed to compare nodes ~%~s and ~%~s");
        $ic99$ = makeSymbol("S#21440", "CYC");
        $ic100$ = makeString("min-graph-search-node failed on nodes ~s");
        $ic101$ = makeSymbol("S#21437", "CYC");
        $ic102$ = makeSymbol("S#21436", "CYC");
        $ic103$ = makeSymbol("S#21446", "CYC");
        $ic104$ = makeSymbol("S#16189", "CYC");
        $ic105$ = makeSymbol("S#3713", "CYC");
    }
    
    public static final class $sX21367_native extends SubLStructNative
    {
        public SubLObject $sorted_constant_list;
        public SubLObject $sorted_nat_list;
        public SubLObject $sorted_assertion_list;
        public SubLObject $list_structure;
        public SubLObject $sorted_var_positions;
        public static final SubLStructDeclNative structDecl;
        
        public $sX21367_native() {
            this.$sorted_constant_list = (SubLObject)CommonSymbols.NIL;
            this.$sorted_nat_list = (SubLObject)CommonSymbols.NIL;
            this.$sorted_assertion_list = (SubLObject)CommonSymbols.NIL;
            this.$list_structure = (SubLObject)CommonSymbols.NIL;
            this.$sorted_var_positions = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX21367_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$sorted_constant_list;
        }
        
        public SubLObject getField3() {
            return this.$sorted_nat_list;
        }
        
        public SubLObject getField4() {
            return this.$sorted_assertion_list;
        }
        
        public SubLObject getField5() {
            return this.$list_structure;
        }
        
        public SubLObject getField6() {
            return this.$sorted_var_positions;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$sorted_constant_list = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$sorted_nat_list = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$sorted_assertion_list = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$list_structure = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$sorted_var_positions = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX21367_native.class, $ic0$, $ic1$, $ic2$, $ic3$, new String[] { "$sorted_constant_list", "$sorted_nat_list", "$sorted_assertion_list", "$list_structure", "$sorted_var_positions" }, $ic4$, $ic5$, $ic6$);
        }
    }
    
    public static final class $f18781$UnaryFunction extends UnaryFunction
    {
        public $f18781$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#21368"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f18781(var3);
        }
    }
    
    public static final class $sX21369_native extends SubLStructNative
    {
        public SubLObject $head;
        public SubLObject $colour;
        public static final SubLStructDeclNative structDecl;
        
        public $sX21369_native() {
            this.$head = (SubLObject)CommonSymbols.NIL;
            this.$colour = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX21369_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$head;
        }
        
        public SubLObject getField3() {
            return this.$colour;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$head = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$colour = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX21369_native.class, $ic31$, $ic32$, $ic33$, $ic34$, new String[] { "$head", "$colour" }, $ic35$, $ic36$, $ic37$);
        }
    }
    
    public static final class $f18799$UnaryFunction extends UnaryFunction
    {
        public $f18799$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#21370"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f18799(var3);
        }
    }
    
    public static final class $sX21371_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $colour;
        public SubLObject $arc_set;
        public static final SubLStructDeclNative structDecl;
        
        public $sX21371_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$colour = (SubLObject)CommonSymbols.NIL;
            this.$arc_set = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX21371_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$id;
        }
        
        public SubLObject getField3() {
            return this.$colour;
        }
        
        public SubLObject getField4() {
            return this.$arc_set;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$colour = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$arc_set = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX21371_native.class, $ic50$, $ic51$, $ic52$, $ic53$, new String[] { "$id", "$colour", "$arc_set" }, $ic54$, $ic55$, $ic56$);
        }
    }
    
    public static final class $f18813$UnaryFunction extends UnaryFunction
    {
        public $f18813$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#21372"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f18813(var3);
        }
    }
    
    public static final class $sX21373_native extends SubLStructNative
    {
        public SubLObject $vertex;
        public SubLObject $search_history;
        public static final SubLStructDeclNative structDecl;
        
        public $sX21373_native() {
            this.$vertex = (SubLObject)CommonSymbols.NIL;
            this.$search_history = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX21373_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$vertex;
        }
        
        public SubLObject getField3() {
            return this.$search_history;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$vertex = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$search_history = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX21373_native.class, $ic76$, $ic77$, $ic78$, $ic79$, new String[] { "$vertex", "$search_history" }, $ic80$, $ic81$, $ic82$);
        }
    }
    
    public static final class $f18835$UnaryFunction extends UnaryFunction
    {
        public $f18835$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#21374"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f18835(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 279 ms
	
	Decompiled with Procyon 0.5.32.
*/