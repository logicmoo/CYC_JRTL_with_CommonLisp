package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0364 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0364";
    public static final String myFingerPrint = "3ef675d0c7db161ff170f9b1f9557d7e48f535b52ee7ad35109852ef4a6a86a0";
    public static SubLSymbol $g3135$;
    public static SubLSymbol $g3136$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLInteger $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
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
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLString $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLString $ic41$;
    private static final SubLString $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLList $ic47$;
    private static final SubLSymbol $ic48$;
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
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLList $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLInteger $ic82$;
    private static final SubLList $ic83$;
    private static final SubLList $ic84$;
    private static final SubLList $ic85$;
    private static final SubLList $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLList $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLString $ic98$;
    private static final SubLString $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLList $ic105$;
    private static final SubLList $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLList $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    
    public static SubLObject f24697(final SubLObject var1, final SubLObject var2) {
        f24698(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24699(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX27585_native.class) ? T : NIL);
    }
    
    public static SubLObject f24700(final SubLObject var1) {
        assert NIL != f24699(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f24701(final SubLObject var1) {
        assert NIL != f24699(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f24702(final SubLObject var1) {
        assert NIL != f24699(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f24703(final SubLObject var1) {
        assert NIL != f24699(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f24704(final SubLObject var1) {
        assert NIL != f24699(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f24705(final SubLObject var1) {
        assert NIL != f24699(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f24706(final SubLObject var1) {
        assert NIL != f24699(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f24707(final SubLObject var1) {
        assert NIL != f24699(var1) : var1;
        return var1.getField9();
    }
    
    public static SubLObject f24708(final SubLObject var1, final SubLObject var4) {
        assert NIL != f24699(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f24709(final SubLObject var1, final SubLObject var4) {
        assert NIL != f24699(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f24710(final SubLObject var1, final SubLObject var4) {
        assert NIL != f24699(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f24711(final SubLObject var1, final SubLObject var4) {
        assert NIL != f24699(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f24712(final SubLObject var1, final SubLObject var4) {
        assert NIL != f24699(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f24713(final SubLObject var1, final SubLObject var4) {
        assert NIL != f24699(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f24714(final SubLObject var1, final SubLObject var4) {
        assert NIL != f24699(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f24715(final SubLObject var1, final SubLObject var4) {
        assert NIL != f24699(var1) : var1;
        return var1.setField9(var4);
    }
    
    public static SubLObject f24716(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX27585_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic26$)) {
                f24708(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic27$)) {
                f24709(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic28$)) {
                f24710(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic29$)) {
                f24711(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic30$)) {
                f24712(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic31$)) {
                f24713(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic32$)) {
                f24714(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic33$)) {
                f24715(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic34$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f24717(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic35$, (SubLObject)$ic36$, (SubLObject)EIGHT_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic37$, (SubLObject)$ic26$, f24700(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic37$, (SubLObject)$ic27$, f24701(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic37$, (SubLObject)$ic28$, f24702(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic37$, (SubLObject)$ic29$, f24703(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic37$, (SubLObject)$ic30$, f24704(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic37$, (SubLObject)$ic31$, f24705(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic37$, (SubLObject)$ic32$, f24706(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic37$, (SubLObject)$ic33$, f24707(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic38$, (SubLObject)$ic36$, (SubLObject)EIGHT_INTEGER);
        return var11;
    }
    
    public static SubLObject f24718(final SubLObject var11, final SubLObject var12) {
        return f24717(var11, var12);
    }
    
    public static SubLObject f24719(final SubLObject var13) {
        return (SubLObject)makeBoolean(NIL != f24699(var13) && NIL == f24720(var13));
    }
    
    public static SubLObject f24720(final SubLObject var14) {
        return Equality.eq((SubLObject)$ic40$, f24721(var14));
    }
    
    public static SubLObject f24698(final SubLObject var13, final SubLObject var2, final SubLObject var15) {
        if (NIL != f24720(var13)) {
            PrintLow.format(var2, (SubLObject)$ic41$, f24700(var13));
        }
        else {
            final SubLObject var16 = module0361.f23996(f24722(var13));
            final SubLObject var17 = f24721(var13);
            PrintLow.format(var2, (SubLObject)$ic42$, new SubLObject[] { var17, var16, f24723(var13) });
            if ($ic43$ == var17) {
                PrintLow.format(var2, (SubLObject)$ic44$, f24724(var13));
            }
            else {
                PrintLow.format(var2, (SubLObject)$ic45$, var16, module0363.f24508(f24725(var13)));
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24726(final SubLObject var13) {
        return f24700(var13);
    }
    
    public static SubLObject f24727(final SubLObject var18, final SubLObject var19) {
        SubLObject var21;
        final SubLObject var20 = var21 = var18.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)$ic47$);
        final SubLObject var22 = var21.rest();
        var21 = var21.first();
        SubLObject var23 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)$ic47$);
        var23 = var21.first();
        var21 = var21.rest();
        if (NIL == var21) {
            final SubLObject var24;
            var21 = (var24 = var22);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic48$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic49$, var23)), ConsesLow.append(var24, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)$ic47$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24728(final SubLObject var14) {
        return f24707(var14);
    }
    
    public static SubLObject f24729(final SubLObject var17, final SubLObject var24) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        assert NIL != module0360.f23906(var17) : var17;
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var25) && $ic43$ == var17) {
            Errors.error((SubLObject)$ic52$);
        }
        assert NIL != module0363.f24478(var24) : var24;
        final SubLObject var26 = f24730(var24, var17);
        module0363.f24660(var24, var26);
        return var26;
    }
    
    public static SubLObject f24730(final SubLObject var27, final SubLObject var17) {
        final SubLObject var28 = f24716((SubLObject)UNPROVIDED);
        f24709(var28, var17);
        f24710(var28, var27);
        final SubLObject var29 = f24722(var28);
        final SubLObject var30 = module0361.f24359(var29);
        module0413.f28775(var17);
        f24708(var28, var30);
        f24711(var28, (SubLObject)NIL);
        f24712(var28, (SubLObject)ZERO_INTEGER);
        f24715(var28, module0034.f1854((SubLObject)$ic54$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        module0361.f24372(var29, var28);
        return var28;
    }
    
    public static SubLObject f24731(final SubLObject var26) {
        if (NIL != f24719(var26)) {
            final SubLObject var27 = f24721(var26);
            final SubLObject var28 = f24722(var26);
            f24732(var26);
            final SubLObject var29 = var27;
            if (var29.eql((SubLObject)$ic43$)) {
                final SubLObject var30 = f24733(var26);
                if (NIL != inference_datastructures_inference_oc.f25417(var30)) {
                    inference_datastructures_inference_oc.f25471(var30);
                }
            }
            else if (var29.eql((SubLObject)$ic55$)) {
                module0376.f26611(var26);
            }
            else if (var29.eql((SubLObject)$ic56$)) {
                module0377.f26744(var26);
            }
            else if (var29.eql((SubLObject)$ic57$)) {
                module0378.f26864(var26);
            }
            else if (var29.eql((SubLObject)$ic58$)) {
                module0381.f27033(var26);
            }
            else if (var29.eql((SubLObject)$ic59$)) {
                module0382.f27178(var26);
            }
            else if (var29.eql((SubLObject)$ic60$)) {
                module0380.f26960(var26);
            }
            else if (var29.eql((SubLObject)$ic61$)) {
                module0383.f27230(var26);
            }
            else if (var29.eql((SubLObject)$ic62$)) {
                module0375.f26569(var26);
            }
            if ($ic43$ != var27) {
                SubLObject var32;
                final SubLObject var31 = var32 = f24734(var26);
                SubLObject var33 = (SubLObject)NIL;
                var33 = var32.first();
                while (NIL != var32) {
                    if (NIL != module0366.f24932(var33)) {
                        module0366.f24952(var33);
                    }
                    var32 = var32.rest();
                    var33 = var32.first();
                }
            }
            SubLObject var32 = f24735(var26);
            SubLObject var34 = (SubLObject)NIL;
            var34 = var32.first();
            while (NIL != var32) {
                if (NIL != module0339.f22743((SubLObject)NIL, var26, var34)) {
                    final SubLObject var35 = f24736(var34);
                    final SubLObject var36 = f24737(var34);
                    if (NIL != module0363.f24504(var35)) {
                        module0363.f24665(var35, var26);
                    }
                }
                var32 = var32.rest();
                var34 = var32.first();
            }
            if ($ic43$ != var27) {
                final SubLObject var37 = f24725(var26);
                if (NIL != module0363.f24504(var37)) {
                    module0363.f24661(var37, var26);
                }
            }
            module0361.f24373(var28, var26);
            f24715(var26, (SubLObject)$ic40$);
            return f24738(var26);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24739(final SubLObject var26) {
        if (NIL != f24719(var26)) {
            f24732(var26);
            return f24738(var26);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24738(final SubLObject var26) {
        f24713(var26, (SubLObject)$ic40$);
        f24712(var26, (SubLObject)$ic40$);
        SubLObject var27 = f24735(var26);
        SubLObject var28 = (SubLObject)NIL;
        var28 = var27.first();
        while (NIL != var27) {
            if (NIL != module0339.f22743((SubLObject)NIL, var26, var28)) {
                f24740(var28);
            }
            var27 = var27.rest();
            var28 = var27.first();
        }
        f24711(var26, (SubLObject)$ic40$);
        f24710(var26, (SubLObject)$ic40$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24732(final SubLObject var26) {
        f24709(var26, (SubLObject)$ic40$);
        return var26;
    }
    
    public static SubLObject f24723(final SubLObject var26) {
        assert NIL != f24699(var26) : var26;
        return f24700(var26);
    }
    
    public static SubLObject f24721(final SubLObject var26) {
        assert NIL != f24699(var26) : var26;
        return f24701(var26);
    }
    
    public static SubLObject f24733(final SubLObject var26) {
        assert NIL != f24699(var26) : var26;
        return f24702(var26);
    }
    
    public static SubLObject f24735(final SubLObject var26) {
        assert NIL != f24699(var26) : var26;
        return f24703(var26);
    }
    
    public static SubLObject f24741(final SubLObject var26) {
        assert NIL != f24699(var26) : var26;
        return f24704(var26);
    }
    
    public static SubLObject f24742(final SubLObject var26) {
        assert NIL != f24699(var26) : var26;
        return f24705(var26);
    }
    
    public static SubLObject f24743(final SubLObject var26, final SubLObject var39) {
        assert NIL != f24699(var26) : var26;
        assert NIL != Types.integerp(var39) : var39;
        f24712(var26, var39);
        return var26;
    }
    
    public static SubLObject f24744(final SubLObject var26, final SubLObject var40) {
        assert NIL != f24699(var26) : var26;
        f24713(var26, var40);
        return var26;
    }
    
    public static SubLObject f24745(final SubLObject var26, final SubLObject var33) {
        SubLObject var34 = f24706(var26);
        if (NIL == conses_high.member(var33, var34, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            var34 = (SubLObject)ConsesLow.cons(var33, var34);
        }
        f24714(var26, var34);
        return var34;
    }
    
    public static SubLObject f24746(final SubLObject var26, final SubLObject var43) {
        if (NIL != f24719(var26)) {
            SubLObject var44 = f24706(var26);
            var44 = Sequences.delete(var43, var44, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            f24714(var26, var44);
            return var44;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24747(final SubLObject var26) {
        SubLObject var27 = (SubLObject)NIL;
        SubLObject var28 = f24735(var26);
        SubLObject var29 = (SubLObject)NIL;
        var29 = var28.first();
        while (NIL != var28) {
            if (NIL != module0339.f22743((SubLObject)NIL, var26, var29)) {
                var27 = (SubLObject)ConsesLow.cons(f24736(var29), var27);
            }
            var28 = var28.rest();
            var29 = var28.first();
        }
        return Sequences.nreverse(var27);
    }
    
    public static SubLObject f24722(final SubLObject var26) {
        if (NIL != module0374.f26529(var26)) {
            return inference_datastructures_inference_oc.f25421(f24724(var26));
        }
        return module0363.f24507(f24725(var26));
    }
    
    public static SubLObject f24748(final SubLObject var26, final SubLObject var17) {
        if (var17.eql((SubLObject)$ic64$)) {
            return module0373.f26175(var26);
        }
        if (var17.eql((SubLObject)$ic65$)) {
            return module0373.f26170(var26);
        }
        if (var17.eql((SubLObject)$ic66$)) {
            return module0373.f26159(var26);
        }
        if (var17.eql((SubLObject)$ic67$)) {
            return module0373.f26154(var26);
        }
        if (var17.eql((SubLObject)$ic68$)) {
            return module0373.f26150(var26);
        }
        if (var17.eql((SubLObject)$ic69$)) {
            return module0373.f26162(var26);
        }
        if (var17.eql((SubLObject)$ic70$)) {
            return (SubLObject)makeBoolean(NIL != module0380.f26955(var26) || NIL != module0375.f26571(var26));
        }
        if (var17.eql((SubLObject)$ic71$)) {
            return module0375.f26587(var26);
        }
        if (var17.eql((SubLObject)$ic72$)) {
            return module0376.f26622(var26);
        }
        return Equality.eq(var17, f24721(var26));
    }
    
    public static SubLObject f24724(final SubLObject var26) {
        if (NIL != module0374.f26529(var26)) {
            return f24733(var26);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24725(final SubLObject var26) {
        if (NIL == module0374.f26529(var26)) {
            return f24733(var26);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24749(final SubLObject var13) {
        return (SubLObject)makeBoolean(NIL != f24699(var13) && NIL != module0035.sublisp_boolean(f24735(var13)));
    }
    
    public static SubLObject f24750(final SubLObject var13) {
        return (SubLObject)makeBoolean(NIL != f24699(var13) && NIL != module0035.f1997(f24735(var13)));
    }
    
    public static SubLObject f24751(final SubLObject var26) {
        return f24752(var26);
    }
    
    public static SubLObject f24752(final SubLObject var26) {
        return Sequences.length(f24735(var26));
    }
    
    public static SubLObject f24753(final SubLObject var26) {
        return f24735(var26).first();
    }
    
    public static SubLObject f24754(final SubLObject var26) {
        assert NIL != f24750(var26) : var26;
        return f24753(var26);
    }
    
    public static SubLObject f24755(final SubLObject var26) {
        final SubLObject var27 = f24754(var26);
        return f24737(var27);
    }
    
    public static SubLObject f24756(final SubLObject var26) {
        return f24736(f24753(var26));
    }
    
    public static SubLObject f24757(final SubLObject var26) {
        return f24736(f24754(var26));
    }
    
    public static SubLObject f24758(final SubLObject var26, final SubLObject var46) {
        return ConsesLow.nth(var46, f24735(var26));
    }
    
    public static SubLObject f24759(final SubLObject var26) {
        return (SubLObject)makeBoolean(!f24741(var26).isZero());
    }
    
    public static SubLObject f24760(final SubLObject var26) {
        return (SubLObject)makeBoolean(NIL == f24759(var26));
    }
    
    public static SubLObject f24761(final SubLObject var26, final SubLObject var46) {
        final SubLObject var47 = f24741(var26);
        return module0048.f3278(var47, var46);
    }
    
    public static SubLObject f24762(final SubLObject var26, final SubLObject var45) {
        final SubLObject var46 = Sequences.position(var45, f24735(var26), (SubLObject)$ic76$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return f24761(var26, var46);
    }
    
    public static SubLObject f24763(final SubLObject var26) {
        assert NIL != f24750(var26) : var26;
        return f24761(var26, (SubLObject)ZERO_INTEGER);
    }
    
    public static SubLObject f24764(final SubLObject var45, final SubLObject var26) {
        SubLObject var46 = f24735(var26);
        SubLObject var47 = (SubLObject)NIL;
        var47 = var46.first();
        while (NIL != var46) {
            if (NIL != module0339.f22743((SubLObject)T, var26, var47) && var47.eql(var45)) {
                return (SubLObject)T;
            }
            var46 = var46.rest();
            var47 = var46.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24765(final SubLObject var36, final SubLObject var26) {
        SubLObject var37 = f24735(var26);
        SubLObject var38 = (SubLObject)NIL;
        var38 = var37.first();
        while (NIL != var37) {
            if (NIL != module0339.f22743((SubLObject)T, var26, var38)) {
                final SubLObject var39 = f24736(var38);
                final SubLObject var40 = f24737(var38);
                if (var39.eql(var36)) {
                    return (SubLObject)T;
                }
            }
            var37 = var37.rest();
            var38 = var37.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24766(final SubLObject var26) {
        SubLObject var27 = f24735(var26);
        SubLObject var28 = (SubLObject)NIL;
        var28 = var27.first();
        while (NIL != var27) {
            if (NIL != module0339.f22743((SubLObject)NIL, var26, var28) && NIL == f24762(var26, var28)) {
                return (SubLObject)NIL;
            }
            var27 = var27.rest();
            var28 = var27.first();
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f24767(final SubLObject var14, SubLObject var49) {
        if (var49 == UNPROVIDED) {
            var49 = (SubLObject)NIL;
        }
        assert NIL != f24699(var14) : var14;
        SubLObject var50 = f24768(var14);
        SubLObject var51 = (SubLObject)NIL;
        var51 = var50.first();
        while (NIL != var50) {
            if (NIL != module0363.f24538(var51, var49)) {
                return (SubLObject)T;
            }
            var50 = var50.rest();
            var51 = var50.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24769(final SubLObject var26) {
        return f24767(var26, (SubLObject)$ic77$);
    }
    
    public static SubLObject f24768(final SubLObject var26) {
        return f24706(var26);
    }
    
    public static SubLObject f24734(final SubLObject var26) {
        return f24768(var26);
    }
    
    public static SubLObject f24770(final SubLObject var26) {
        assert NIL != f24699(var26) : var26;
        SubLObject var27 = (SubLObject)ZERO_INTEGER;
        SubLObject var28 = f24768(var26);
        SubLObject var29 = (SubLObject)NIL;
        var29 = var28.first();
        while (NIL != var28) {
            if (NIL != module0363.f24538(var29, (SubLObject)NIL)) {
                var27 = Numbers.add(var27, (SubLObject)ONE_INTEGER);
            }
            var28 = var28.rest();
            var29 = var28.first();
        }
        return var27;
    }
    
    public static SubLObject f24771(final SubLObject var26) {
        return module0360.f23955(f24772(var26));
    }
    
    public static SubLObject f24772(final SubLObject var26) {
        if (NIL == module0374.f26529(var26)) {
            if (NIL != module0363.f24652(f24725(var26))) {
                return (SubLObject)$ic78$;
            }
            SubLObject var27 = f24735(var26);
            SubLObject var28 = (SubLObject)NIL;
            var28 = var27.first();
            while (NIL != var27) {
                if (NIL != module0339.f22743((SubLObject)NIL, var26, var28)) {
                    final SubLObject var29 = f24736(var28);
                    final SubLObject var30 = f24737(var28);
                    if (NIL != module0363.f24652(var29)) {
                        return (SubLObject)$ic78$;
                    }
                }
                var27 = var27.rest();
                var28 = var27.first();
            }
        }
        return (SubLObject)$ic79$;
    }
    
    public static SubLObject f24773(final SubLObject var26, final SubLObject var45) {
        assert NIL != f24699(var26) : var26;
        assert NIL != f24774(var45) : var45;
        f24711(var26, (SubLObject)ConsesLow.cons(var45, f24703(var26)));
        return var26;
    }
    
    public static SubLObject f24775(final SubLObject var26) {
        final SubLObject var27 = f24752(var26);
        SubLObject var28 = (SubLObject)ZERO_INTEGER;
        SubLObject var29;
        for (var29 = (SubLObject)NIL, var29 = (SubLObject)ZERO_INTEGER; var29.numL(var27); var29 = Numbers.add(var29, (SubLObject)ONE_INTEGER)) {
            var28 = module0048.f3279(var28, var29, (SubLObject)T);
        }
        f24743(var26, var28);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24776(final SubLObject var26, final SubLObject var46) {
        SubLObject var47 = f24741(var26);
        var47 = module0048.f3279(var47, var46, (SubLObject)T);
        f24743(var26, var47);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24777(final SubLObject var26, final SubLObject var45) {
        final SubLObject var46 = Sequences.position(var45, f24735(var26), (SubLObject)$ic76$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)((NIL != var46) ? f24776(var26, var46) : NIL);
    }
    
    public static SubLObject f24778(final SubLObject var26) {
        assert NIL != f24750(var26) : var26;
        return f24776(var26, (SubLObject)ZERO_INTEGER);
    }
    
    public static SubLObject f24779(final SubLObject var26, final SubLObject var46) {
        SubLObject var47 = f24741(var26);
        var47 = module0048.f3279(var47, var46, (SubLObject)NIL);
        f24743(var26, var47);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24780(final SubLObject var26) {
        f24743(var26, (SubLObject)ZERO_INTEGER);
        return var26;
    }
    
    public static SubLObject f24781(final SubLObject var26, final SubLObject var45) {
        final SubLObject var46 = Sequences.position(var45, f24735(var26), (SubLObject)$ic76$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return f24779(var26, var46);
    }
    
    public static SubLObject f24782(final SubLObject var26) {
        assert NIL != f24750(var26) : var26;
        return f24779(var26, (SubLObject)ZERO_INTEGER);
    }
    
    public static SubLObject f24783(final SubLObject var45, final SubLObject var26) {
        assert NIL != f24774(var45) : var45;
        assert NIL != f24699(var26) : var26;
        f24773(var26, var45);
        module0363.f24664(f24736(var45), var26);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24784(final SubLObject var26) {
        final SubLObject var27 = f24735(var26);
        return Types.sublisp_null(var27);
    }
    
    public static SubLObject f24785(final SubLObject var17, final SubLObject var24, final SubLObject var45) {
        assert NIL != module0360.f23906(var17) : var17;
        assert NIL != module0363.f24478(var24) : var24;
        assert NIL != f24774(var45) : var45;
        SubLObject var46 = (SubLObject)NIL;
        final SubLObject var48;
        final SubLObject var47 = var48 = f24736(var45);
        final SubLObject var49 = module0363.f24530(var47);
        SubLObject var50;
        SubLObject var51;
        SubLObject var52;
        SubLObject var53;
        SubLObject var54;
        SubLObject var55;
        for (var50 = module0032.f1741(var49), var51 = (SubLObject)NIL, var51 = module0032.f1742(var50, var49); NIL == var46 && NIL == module0032.f1744(var50, var51); var51 = module0032.f1743(var51)) {
            var52 = module0032.f1745(var50, var51);
            if (NIL != module0032.f1746(var51, var52) && NIL != f24748(var52, var17)) {
                var53 = var52;
                for (var54 = (SubLObject)NIL, var54 = f24735(var53); NIL == var46 && NIL != var54; var54 = var54.rest()) {
                    var55 = var54.first();
                    if (NIL != module0339.f22743((SubLObject)NIL, var53, var55) && var48.eql(f24736(var55)) && var24.eql(f24725(var52)) && NIL != f24786(var45, var55)) {
                        var46 = var52;
                    }
                }
            }
        }
        return var46;
    }
    
    public static SubLObject f24787(final SubLObject var60, final SubLObject var24, final SubLObject var36) {
        final SubLObject var61 = module0363.f24530(var36);
        SubLObject var62;
        SubLObject var63;
        SubLObject var64;
        for (var62 = module0032.f1741(var61), var63 = (SubLObject)NIL, var63 = module0032.f1742(var62, var61); NIL == module0032.f1744(var62, var63); var63 = module0032.f1743(var63)) {
            var64 = module0032.f1745(var62, var63);
            if (NIL != module0032.f1746(var63, var64) && NIL != f24748(var64, var60) && var24.eql(f24725(var64))) {
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24788(final SubLObject var26, final SubLObject var61) {
        final SubLObject var62 = f24789(var26, var61, (SubLObject)NIL);
        return (SubLObject)((NIL != var62) ? f24736(var62) : NIL);
    }
    
    public static SubLObject f24789(final SubLObject var26, final SubLObject var61, final SubLObject var37) {
        SubLObject var62 = f24735(var26);
        SubLObject var63 = (SubLObject)NIL;
        var63 = var62.first();
        while (NIL != var62) {
            if (NIL != module0339.f22743((SubLObject)NIL, var26, var63) && NIL != f24790(var63, var61, var37)) {
                return var63;
            }
            var62 = var62.rest();
            var63 = var62.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24791(final SubLObject var26, final SubLObject var62) {
        SubLObject var63 = f24735(var26);
        SubLObject var64 = (SubLObject)NIL;
        var64 = var63.first();
        while (NIL != var63) {
            if (NIL != module0339.f22743((SubLObject)NIL, var26, var64) && !var64.eql(var62)) {
                return var64;
            }
            var63 = var63.rest();
            var64 = var63.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24792(final SubLObject var1, final SubLObject var2) {
        f24793(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24774(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX27607_native.class) ? T : NIL);
    }
    
    public static SubLObject f24794(final SubLObject var1) {
        assert NIL != f24774(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f24795(final SubLObject var1) {
        assert NIL != f24774(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f24796(final SubLObject var1, final SubLObject var4) {
        assert NIL != f24774(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f24797(final SubLObject var1, final SubLObject var4) {
        assert NIL != f24774(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f24798(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX27607_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic94$)) {
                f24796(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic95$)) {
                f24797(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic34$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f24799(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic35$, (SubLObject)$ic96$, (SubLObject)TWO_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic37$, (SubLObject)$ic94$, f24794(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic37$, (SubLObject)$ic95$, f24795(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic38$, (SubLObject)$ic96$, (SubLObject)TWO_INTEGER);
        return var11;
    }
    
    public static SubLObject f24800(final SubLObject var11, final SubLObject var12) {
        return f24799(var11, var12);
    }
    
    public static SubLObject f24801(final SubLObject var13) {
        return (SubLObject)makeBoolean(NIL != f24774(var13) && $ic40$ != f24737(var13) && NIL != module0363.f24504(f24736(var13)));
    }
    
    public static SubLObject f24786(final SubLObject var66, final SubLObject var67) {
        if (var66.eql(var67)) {
            return (SubLObject)T;
        }
        final SubLObject var68 = f24736(var66);
        final SubLObject var69 = f24736(var67);
        if (!var68.eql(var69)) {
            return (SubLObject)NIL;
        }
        final SubLObject var70 = f24737(var66);
        final SubLObject var71 = f24737(var67);
        return Equality.equal(var70, var71);
    }
    
    public static SubLObject f24793(final SubLObject var13, final SubLObject var2, final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        if (NIL != f24801(var13)) {
            PrintLow.format(var2, (SubLObject)$ic98$, f24736(var13), f24737(var13));
        }
        else if (NIL != print_high.$print_readably$.getDynamicValue(var16)) {
            print_high.print_not_readable(var13, var2);
        }
        else {
            streams_high.write_string((SubLObject)$ic99$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24802(final SubLObject var13) {
        return Numbers.logxor(Sxhash.sxhash(f24794(var13)), Sxhash.sxhash(f24795(var13)));
    }
    
    public static SubLObject f24803(final SubLObject var13) {
        return (SubLObject)makeBoolean(NIL != f24774(var13) && NIL != module0363.f24553(f24736(var13)) && NIL == f24737(var13));
    }
    
    public static SubLObject f24804(final SubLObject var77, final SubLObject var37) {
        assert NIL != module0363.f24478(var77) : var77;
        assert NIL != module0233.f15353(var37) : var37;
        final SubLObject var78 = f24798((SubLObject)UNPROVIDED);
        f24796(var78, var77);
        f24797(var78, var37);
        return var78;
    }
    
    public static SubLObject f24805(final SubLObject var77) {
        assert NIL != module0363.f24553(var77) : var77;
        return f24804(var77, (SubLObject)NIL);
    }
    
    public static SubLObject f24740(final SubLObject var38) {
        if (NIL != f24801(var38)) {
            f24806(var38);
            return f24807(var38);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24807(final SubLObject var38) {
        f24796(var38, (SubLObject)$ic40$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24806(final SubLObject var38) {
        f24797(var38, (SubLObject)$ic40$);
        return var38;
    }
    
    public static SubLObject f24736(final SubLObject var38) {
        assert NIL != f24774(var38) : var38;
        return f24794(var38);
    }
    
    public static SubLObject f24737(final SubLObject var38) {
        assert NIL != f24774(var38) : var38;
        return f24795(var38);
    }
    
    public static SubLObject f24808(final SubLObject var26, final SubLObject var45) {
        SubLObject var46 = (SubLObject)ZERO_INTEGER;
        SubLObject var47 = f24735(var26);
        SubLObject var48 = (SubLObject)NIL;
        var48 = var47.first();
        while (NIL != var47) {
            if (NIL != module0339.f22743((SubLObject)NIL, var26, var48)) {
                if (NIL != f24786(var48, var45)) {
                    return var46;
                }
                var46 = Numbers.add(var46, (SubLObject)ONE_INTEGER);
            }
            var47 = var47.rest();
            var48 = var47.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24809(final SubLObject var26, final SubLObject var46) {
        SubLObject var47 = (SubLObject)ZERO_INTEGER;
        SubLObject var48 = f24735(var26);
        SubLObject var49 = (SubLObject)NIL;
        var49 = var48.first();
        while (NIL != var48) {
            if (NIL != module0339.f22743((SubLObject)NIL, var26, var49)) {
                if (var46.numE(var47)) {
                    return var49;
                }
                var47 = Numbers.add(var47, (SubLObject)ONE_INTEGER);
            }
            var48 = var48.rest();
            var49 = var48.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24810(final SubLObject var38) {
        final SubLObject var39 = f24736(var38);
        final SubLObject var40 = f24737(var38);
        final SubLObject var41 = module0363.f24509(var39);
        final SubLObject var42 = module0233.f15362(var40, var41);
        return var42;
    }
    
    public static SubLObject f24790(final SubLObject var38, final SubLObject var61, final SubLObject var37) {
        final SubLObject var62 = module0363.f24509(f24736(var38));
        final SubLObject var63 = f24737(var38);
        return (SubLObject)makeBoolean(var62.equal(var61) && var63.equal(var37));
    }
    
    public static SubLObject f24811(final SubLObject var18, final SubLObject var19) {
        SubLObject var21;
        final SubLObject var20 = var21 = var18.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)$ic105$);
        final SubLObject var22 = var21.rest();
        var21 = var21.first();
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var24 = (SubLObject)NIL;
        SubLObject var25 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)$ic105$);
        var23 = var21.first();
        var21 = var21.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)$ic105$);
        var24 = var21.first();
        var21 = var21.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)$ic105$);
        var25 = var21.first();
        var21 = var21.rest();
        SubLObject var26 = (SubLObject)NIL;
        SubLObject var27 = var21;
        SubLObject var28 = (SubLObject)NIL;
        SubLObject var90_91 = (SubLObject)NIL;
        while (NIL != var27) {
            cdestructuring_bind.destructuring_bind_must_consp(var27, var20, (SubLObject)$ic105$);
            var90_91 = var27.first();
            var27 = var27.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var27, var20, (SubLObject)$ic105$);
            if (NIL == conses_high.member(var90_91, (SubLObject)$ic106$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var28 = (SubLObject)T;
            }
            if (var90_91 == $ic107$) {
                var26 = var27.first();
            }
            var27 = var27.rest();
        }
        if (NIL != var28 && NIL == var26) {
            cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)$ic105$);
        }
        final SubLObject var29 = cdestructuring_bind.property_list_member((SubLObject)$ic108$, var21);
        final SubLObject var30 = (SubLObject)((NIL != var29) ? conses_high.cadr(var29) : NIL);
        final SubLObject var31 = cdestructuring_bind.property_list_member((SubLObject)$ic109$, var21);
        final SubLObject var32 = (SubLObject)((NIL != var31) ? conses_high.cadr(var31) : NIL);
        final SubLObject var33;
        var21 = (var33 = var22);
        final SubLObject var34 = (SubLObject)$ic110$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic111$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var34, var25)), (SubLObject)ConsesLow.list((SubLObject)$ic112$, (SubLObject)ConsesLow.list(var23, var24, (SubLObject)$ic108$, var30, (SubLObject)$ic109$, var32), (SubLObject)ConsesLow.listS((SubLObject)$ic113$, (SubLObject)ConsesLow.list((SubLObject)EQ, var34, (SubLObject)ConsesLow.list((SubLObject)$ic114$, var23)), ConsesLow.append(var33, (SubLObject)NIL))));
    }
    
    public static SubLObject f24812(final SubLObject var18, final SubLObject var19) {
        SubLObject var21;
        final SubLObject var20 = var21 = var18.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)$ic115$);
        final SubLObject var22 = var21.rest();
        var21 = var21.first();
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var24 = (SubLObject)NIL;
        SubLObject var25 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)$ic115$);
        var23 = var21.first();
        var21 = var21.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)$ic115$);
        var24 = var21.first();
        var21 = var21.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)$ic115$);
        var25 = var21.first();
        var21 = var21.rest();
        SubLObject var26 = (SubLObject)NIL;
        SubLObject var27 = var21;
        SubLObject var28 = (SubLObject)NIL;
        SubLObject var104_105 = (SubLObject)NIL;
        while (NIL != var27) {
            cdestructuring_bind.destructuring_bind_must_consp(var27, var20, (SubLObject)$ic115$);
            var104_105 = var27.first();
            var27 = var27.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var27, var20, (SubLObject)$ic115$);
            if (NIL == conses_high.member(var104_105, (SubLObject)$ic106$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var28 = (SubLObject)T;
            }
            if (var104_105 == $ic107$) {
                var26 = var27.first();
            }
            var27 = var27.rest();
        }
        if (NIL != var28 && NIL == var26) {
            cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)$ic115$);
        }
        final SubLObject var29 = cdestructuring_bind.property_list_member((SubLObject)$ic108$, var21);
        final SubLObject var30 = (SubLObject)((NIL != var29) ? conses_high.cadr(var29) : NIL);
        final SubLObject var31 = cdestructuring_bind.property_list_member((SubLObject)$ic109$, var21);
        final SubLObject var32 = (SubLObject)((NIL != var31) ? conses_high.cadr(var31) : NIL);
        final SubLObject var33;
        var21 = (var33 = var22);
        final SubLObject var34 = (SubLObject)$ic116$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic117$, (SubLObject)ConsesLow.list(var34, var24, var25, (SubLObject)$ic108$, var30, (SubLObject)$ic109$, var32), (SubLObject)ConsesLow.listS((SubLObject)$ic111$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var23, (SubLObject)ConsesLow.list((SubLObject)$ic118$, var34))), ConsesLow.append(var33, (SubLObject)NIL)));
    }
    
    public static SubLObject f24813(final SubLObject var26) {
        return Numbers.numGE(module0363.f24590(f24725(var26)), (SubLObject)TWO_INTEGER);
    }
    
    public static SubLObject f24814() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24697", "S#27610", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24699", "S#27381", 1, 0, false);
        new $f24699$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24700", "S#27611", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24701", "S#27612", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24702", "S#27613", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24703", "S#27614", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24704", "S#27615", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24705", "S#27616", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24706", "S#27617", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24707", "S#27618", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24708", "S#27619", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24709", "S#27620", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24710", "S#27621", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24711", "S#27622", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24712", "S#27623", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24713", "S#27624", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24714", "S#27625", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24715", "S#27626", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24716", "S#27627", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24717", "S#27628", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24718", "S#27629", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24719", "S#27355", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24720", "S#27630", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24698", "S#27631", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24726", "S#27586", 1, 0, false);
        new $f24726$UnaryFunction();
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0364", "f24727", "S#27632");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24728", "S#27633", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24729", "S#27634", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24730", "S#27635", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24731", "S#27356", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24739", "S#26788", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24738", "S#27636", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24732", "S#27637", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24723", "S#26815", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24721", "S#27369", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24733", "S#27638", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24735", "S#25407", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24741", "S#27639", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24742", "S#27640", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24743", "S#27641", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24744", "S#27642", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24745", "S#27643", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24746", "S#27644", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24747", "S#27645", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24722", "S#27646", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24748", "S#25404", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24724", "S#27582", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24725", "PROBLEM-LINK-SUPPORTED-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24749", "S#27370", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24750", "S#26793", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24751", "S#26806", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24752", "S#27647", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24753", "S#27648", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24754", "S#27649", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24755", "S#27650", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24756", "S#27651", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24757", "S#27652", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24758", "S#27653", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24759", "S#27654", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24760", "S#27655", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24761", "S#27656", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24762", "S#25365", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24763", "S#27657", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24764", "S#27658", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24765", "S#27659", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24766", "S#27660", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24767", "S#27661", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24769", "S#27662", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24768", "S#25417", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24734", "S#27663", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24770", "S#27664", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24771", "S#27665", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24772", "S#27666", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24773", "S#27667", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24775", "S#27668", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24776", "S#27669", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24777", "S#27670", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24778", "S#27671", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24779", "S#27672", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24780", "S#27673", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24781", "S#27674", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24782", "S#27675", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24783", "S#27676", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24784", "S#27677", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24785", "S#27678", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24787", "S#27679", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24788", "S#27680", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24789", "S#27681", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24791", "S#27682", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24792", "S#27683", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24774", "S#27608", 1, 0, false);
        new $f24774$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24794", "S#27684", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24795", "S#27685", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24796", "S#27686", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24797", "S#27687", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24798", "S#27688", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24799", "S#27689", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24800", "S#27690", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24801", "S#27691", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24786", "S#27609", 2, 0, false);
        new $f24786$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24793", "S#27692", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24802", "S#27693", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24803", "S#27694", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24804", "S#27695", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24805", "S#27696", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24740", "S#27697", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24807", "S#27698", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24806", "S#27699", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24736", "MAPPED-PROBLEM-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24737", "MAPPED-PROBLEM-VARIABLE-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24808", "S#27700", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24809", "S#27701", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24810", "S#27702", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24790", "S#27703", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0364", "f24811", "S#27704");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0364", "f24812", "S#27705");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0364", "f24813", "S#27706", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24815() {
        $g3135$ = SubLFiles.defconstant("S#27707", (SubLObject)$ic0$);
        $g3136$ = SubLFiles.defconstant("S#27708", (SubLObject)$ic81$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24816() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g3135$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic8$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic9$);
        Structures.def_csetf((SubLObject)$ic10$, (SubLObject)$ic11$);
        Structures.def_csetf((SubLObject)$ic12$, (SubLObject)$ic13$);
        Structures.def_csetf((SubLObject)$ic14$, (SubLObject)$ic15$);
        Structures.def_csetf((SubLObject)$ic16$, (SubLObject)$ic17$);
        Structures.def_csetf((SubLObject)$ic18$, (SubLObject)$ic19$);
        Structures.def_csetf((SubLObject)$ic20$, (SubLObject)$ic21$);
        Structures.def_csetf((SubLObject)$ic22$, (SubLObject)$ic23$);
        Structures.def_csetf((SubLObject)$ic24$, (SubLObject)$ic25$);
        Equality.identity((SubLObject)$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g3135$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic39$));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $g3135$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic46$));
        module0002.f50((SubLObject)$ic49$, (SubLObject)$ic50$);
        module0002.f35((SubLObject)$ic73$, (SubLObject)$ic74$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g3136$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic88$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic89$);
        Structures.def_csetf((SubLObject)$ic90$, (SubLObject)$ic91$);
        Structures.def_csetf((SubLObject)$ic92$, (SubLObject)$ic93$);
        Equality.identity((SubLObject)$ic81$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g3136$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic97$));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $g3136$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic102$));
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f24814();
    }
    
    public void initializeVariables() {
        f24815();
    }
    
    public void runTopLevelForms() {
        f24816();
    }
    
    static {
        me = (SubLFile)new module0364();
        $g3135$ = null;
        $g3136$ = null;
        $ic0$ = makeSymbol("S#27585", "CYC");
        $ic1$ = makeSymbol("S#27381", "CYC");
        $ic2$ = makeInteger(213);
        $ic3$ = ConsesLow.list((SubLObject)makeSymbol("S#10593", "CYC"), (SubLObject)makeSymbol("TYPE"), (SubLObject)makeSymbol("S#14569", "CYC"), (SubLObject)makeSymbol("S#27709", "CYC"), (SubLObject)makeSymbol("S#27710", "CYC"), (SubLObject)makeSymbol("S#1625", "CYC"), (SubLObject)makeSymbol("S#27711", "CYC"), (SubLObject)makeSymbol("S#3043", "CYC"));
        $ic4$ = ConsesLow.list((SubLObject)makeKeyword("SUID"), (SubLObject)makeKeyword("TYPE"), (SubLObject)makeKeyword("SUPPORTED-OBJECT"), (SubLObject)makeKeyword("SUPPORTING-MAPPED-PROBLEMS"), (SubLObject)makeKeyword("OPEN-FLAGS"), (SubLObject)makeKeyword("DATA"), (SubLObject)makeKeyword("PROOFS"), (SubLObject)makeKeyword("MEMOIZATION-STATE"));
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#27611", "CYC"), (SubLObject)makeSymbol("S#27612", "CYC"), (SubLObject)makeSymbol("S#27613", "CYC"), (SubLObject)makeSymbol("S#27614", "CYC"), (SubLObject)makeSymbol("S#27615", "CYC"), (SubLObject)makeSymbol("S#27616", "CYC"), (SubLObject)makeSymbol("S#27617", "CYC"), (SubLObject)makeSymbol("S#27618", "CYC"));
        $ic6$ = ConsesLow.list((SubLObject)makeSymbol("S#27619", "CYC"), (SubLObject)makeSymbol("S#27620", "CYC"), (SubLObject)makeSymbol("S#27621", "CYC"), (SubLObject)makeSymbol("S#27622", "CYC"), (SubLObject)makeSymbol("S#27623", "CYC"), (SubLObject)makeSymbol("S#27624", "CYC"), (SubLObject)makeSymbol("S#27625", "CYC"), (SubLObject)makeSymbol("S#27626", "CYC"));
        $ic7$ = makeSymbol("S#27631", "CYC");
        $ic8$ = makeSymbol("S#27610", "CYC");
        $ic9$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#27381", "CYC"));
        $ic10$ = makeSymbol("S#27611", "CYC");
        $ic11$ = makeSymbol("S#27619", "CYC");
        $ic12$ = makeSymbol("S#27612", "CYC");
        $ic13$ = makeSymbol("S#27620", "CYC");
        $ic14$ = makeSymbol("S#27613", "CYC");
        $ic15$ = makeSymbol("S#27621", "CYC");
        $ic16$ = makeSymbol("S#27614", "CYC");
        $ic17$ = makeSymbol("S#27622", "CYC");
        $ic18$ = makeSymbol("S#27615", "CYC");
        $ic19$ = makeSymbol("S#27623", "CYC");
        $ic20$ = makeSymbol("S#27616", "CYC");
        $ic21$ = makeSymbol("S#27624", "CYC");
        $ic22$ = makeSymbol("S#27617", "CYC");
        $ic23$ = makeSymbol("S#27625", "CYC");
        $ic24$ = makeSymbol("S#27618", "CYC");
        $ic25$ = makeSymbol("S#27626", "CYC");
        $ic26$ = makeKeyword("SUID");
        $ic27$ = makeKeyword("TYPE");
        $ic28$ = makeKeyword("SUPPORTED-OBJECT");
        $ic29$ = makeKeyword("SUPPORTING-MAPPED-PROBLEMS");
        $ic30$ = makeKeyword("OPEN-FLAGS");
        $ic31$ = makeKeyword("DATA");
        $ic32$ = makeKeyword("PROOFS");
        $ic33$ = makeKeyword("MEMOIZATION-STATE");
        $ic34$ = makeString("Invalid slot ~S for construction function");
        $ic35$ = makeKeyword("BEGIN");
        $ic36$ = makeSymbol("S#27627", "CYC");
        $ic37$ = makeKeyword("SLOT");
        $ic38$ = makeKeyword("END");
        $ic39$ = makeSymbol("S#27629", "CYC");
        $ic40$ = makeKeyword("FREE");
        $ic41$ = makeString("<Invalid LINK ~s>");
        $ic42$ = makeString("<~a LINK ~a.~a supporting ");
        $ic43$ = makeKeyword("ANSWER");
        $ic44$ = makeString("~a>");
        $ic45$ = makeString("~a.~a>");
        $ic46$ = makeSymbol("S#27586", "CYC");
        $ic47$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#27585", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic48$ = makeSymbol("S#3165", "CYC");
        $ic49$ = makeSymbol("S#27633", "CYC");
        $ic50$ = makeSymbol("S#27632", "CYC");
        $ic51$ = makeSymbol("S#26598", "CYC");
        $ic52$ = makeString("Can't call new-problem-link for an :answer link, call new-answer-link instead");
        $ic53$ = makeSymbol("S#26082", "CYC");
        $ic54$ = makeString("problem link memoization state");
        $ic55$ = makeKeyword("REMOVAL");
        $ic56$ = makeKeyword("TRANSFORMATION");
        $ic57$ = makeKeyword("RESIDUAL-TRANSFORMATION");
        $ic58$ = makeKeyword("JOIN-ORDERED");
        $ic59$ = makeKeyword("JOIN");
        $ic60$ = makeKeyword("SPLIT");
        $ic61$ = makeKeyword("UNION");
        $ic62$ = makeKeyword("RESTRICTION");
        $ic63$ = makeSymbol("INTEGERP");
        $ic64$ = makeKeyword("CONTENT");
        $ic65$ = makeKeyword("STRUCTURAL");
        $ic66$ = makeKeyword("DISJUNCTIVE");
        $ic67$ = makeKeyword("CONJUNCTIVE");
        $ic68$ = makeKeyword("CONNECTED-CONJUNCTION");
        $ic69$ = makeKeyword("LOGICAL");
        $ic70$ = makeKeyword("SPLIT/RESTRICTION");
        $ic71$ = makeKeyword("SIMPLIFICATION");
        $ic72$ = makeKeyword("REMOVAL-CONJUNCTIVE");
        $ic73$ = makeSymbol("S#26806", "CYC");
        $ic74$ = ConsesLow.list((SubLObject)makeSymbol("S#27647", "CYC"));
        $ic75$ = makeSymbol("S#26793", "CYC");
        $ic76$ = makeSymbol("S#27609", "CYC");
        $ic77$ = makeKeyword("PROVEN");
        $ic78$ = makeKeyword("DESTRUCTIBLE");
        $ic79$ = makeKeyword("INDESTRUCTIBLE");
        $ic80$ = makeSymbol("S#27608", "CYC");
        $ic81$ = makeSymbol("S#27607", "CYC");
        $ic82$ = makeInteger(214);
        $ic83$ = ConsesLow.list((SubLObject)makeSymbol("S#24274", "CYC"), (SubLObject)makeSymbol("S#15041", "CYC"));
        $ic84$ = ConsesLow.list((SubLObject)makeKeyword("PROBLEM"), (SubLObject)makeKeyword("VARIABLE-MAP"));
        $ic85$ = ConsesLow.list((SubLObject)makeSymbol("S#27684", "CYC"), (SubLObject)makeSymbol("S#27685", "CYC"));
        $ic86$ = ConsesLow.list((SubLObject)makeSymbol("S#27686", "CYC"), (SubLObject)makeSymbol("S#27687", "CYC"));
        $ic87$ = makeSymbol("S#27692", "CYC");
        $ic88$ = makeSymbol("S#27683", "CYC");
        $ic89$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#27608", "CYC"));
        $ic90$ = makeSymbol("S#27684", "CYC");
        $ic91$ = makeSymbol("S#27686", "CYC");
        $ic92$ = makeSymbol("S#27685", "CYC");
        $ic93$ = makeSymbol("S#27687", "CYC");
        $ic94$ = makeKeyword("PROBLEM");
        $ic95$ = makeKeyword("VARIABLE-MAP");
        $ic96$ = makeSymbol("S#27688", "CYC");
        $ic97$ = makeSymbol("S#27690", "CYC");
        $ic98$ = makeString("<MAPPED PROBLEM:~a ~a>");
        $ic99$ = makeString("#<");
        $ic100$ = makeKeyword("STREAM");
        $ic101$ = makeKeyword("BASE");
        $ic102$ = makeSymbol("S#27693", "CYC");
        $ic103$ = makeSymbol("S#18091", "CYC");
        $ic104$ = makeSymbol("S#27460", "CYC");
        $ic105$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#25405", "CYC"), (SubLObject)makeSymbol("S#24487", "CYC"), (SubLObject)makeSymbol("S#24274", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#25406", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic106$ = ConsesLow.list((SubLObject)makeKeyword("OPEN?"), (SubLObject)makeKeyword("DONE"));
        $ic107$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic108$ = makeKeyword("OPEN?");
        $ic109$ = makeKeyword("DONE");
        $ic110$ = makeUninternedSymbol("US#65EE06E");
        $ic111$ = makeSymbol("CLET");
        $ic112$ = makeSymbol("S#25370", "CYC");
        $ic113$ = makeSymbol("PWHEN");
        $ic114$ = makeSymbol("MAPPED-PROBLEM-PROBLEM");
        $ic115$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#25409", "CYC"), (SubLObject)makeSymbol("S#24487", "CYC"), (SubLObject)makeSymbol("S#24274", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#25406", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic116$ = makeUninternedSymbol("US#73DCC81");
        $ic117$ = makeSymbol("S#27704", "CYC");
        $ic118$ = makeSymbol("MAPPED-PROBLEM-VARIABLE-MAP");
    }
    
    public static final class $sX27585_native extends SubLStructNative
    {
        public SubLObject $suid;
        public SubLObject $type;
        public SubLObject $supported_object;
        public SubLObject $supporting_mapped_problems;
        public SubLObject $open_flags;
        public SubLObject $data;
        public SubLObject $proofs;
        public SubLObject $memoization_state;
        public static final SubLStructDeclNative structDecl;
        
        public $sX27585_native() {
            this.$suid = (SubLObject)CommonSymbols.NIL;
            this.$type = (SubLObject)CommonSymbols.NIL;
            this.$supported_object = (SubLObject)CommonSymbols.NIL;
            this.$supporting_mapped_problems = (SubLObject)CommonSymbols.NIL;
            this.$open_flags = (SubLObject)CommonSymbols.NIL;
            this.$data = (SubLObject)CommonSymbols.NIL;
            this.$proofs = (SubLObject)CommonSymbols.NIL;
            this.$memoization_state = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX27585_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$suid;
        }
        
        public SubLObject getField3() {
            return this.$type;
        }
        
        public SubLObject getField4() {
            return this.$supported_object;
        }
        
        public SubLObject getField5() {
            return this.$supporting_mapped_problems;
        }
        
        public SubLObject getField6() {
            return this.$open_flags;
        }
        
        public SubLObject getField7() {
            return this.$data;
        }
        
        public SubLObject getField8() {
            return this.$proofs;
        }
        
        public SubLObject getField9() {
            return this.$memoization_state;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$suid = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$type = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$supported_object = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$supporting_mapped_problems = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$open_flags = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$data = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$proofs = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$memoization_state = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX27585_native.class, $ic0$, $ic1$, $ic3$, $ic4$, new String[] { "$suid", "$type", "$supported_object", "$supporting_mapped_problems", "$open_flags", "$data", "$proofs", "$memoization_state" }, $ic5$, $ic6$, $ic7$);
        }
    }
    
    public static final class $f24699$UnaryFunction extends UnaryFunction
    {
        public $f24699$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#27381"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f24699(var3);
        }
    }
    
    public static final class $f24726$UnaryFunction extends UnaryFunction
    {
        public $f24726$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#27586"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f24726(var3);
        }
    }
    
    public static final class $sX27607_native extends SubLStructNative
    {
        public SubLObject $problem;
        public SubLObject $variable_map;
        public static final SubLStructDeclNative structDecl;
        
        public $sX27607_native() {
            this.$problem = (SubLObject)CommonSymbols.NIL;
            this.$variable_map = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX27607_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$problem;
        }
        
        public SubLObject getField3() {
            return this.$variable_map;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$problem = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$variable_map = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX27607_native.class, $ic81$, $ic80$, $ic83$, $ic84$, new String[] { "$problem", "$variable_map" }, $ic85$, $ic86$, $ic87$);
        }
    }
    
    public static final class $f24774$UnaryFunction extends UnaryFunction
    {
        public $f24774$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#27608"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f24774(var3);
        }
    }
    
    public static final class $f24786$BinaryFunction extends BinaryFunction
    {
        public $f24786$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#27609"));
        }
        
        public SubLObject processItem(final SubLObject var3, final SubLObject var72) {
            return f24786(var3, var72);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 392 ms
	
	Decompiled with Procyon 0.5.32.
*/