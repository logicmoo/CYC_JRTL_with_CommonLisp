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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0134 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0134";
    public static final String myFingerPrint = "fcf545a4ed4349c1b688ce818327cf5187e7207054d654987cbaa99ff7ff1b92";
    private static SubLSymbol $g1580$;
    public static SubLSymbol $g1581$;
    public static SubLSymbol $g1582$;
    public static SubLSymbol $g1583$;
    public static SubLSymbol $g1584$;
    public static SubLSymbol $g1585$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
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
    private static final SubLString $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLString $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLString $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLList $ic34$;
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
    private static final SubLList $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLList $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLList $ic53$;
    private static final SubLList $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLList $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLList $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLList $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLList $ic67$;
    private static final SubLList $ic68$;
    private static final SubLList $ic69$;
    private static final SubLList $ic70$;
    private static final SubLList $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLString $ic73$;
    
    public static SubLObject f8722(final SubLObject var1) {
        return conses_high.assoc(var1, $g1580$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED).rest();
    }
    
    public static SubLObject f8723(final SubLObject var2, final SubLObject var3) {
        f8724(var2, var3, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8725(final SubLObject var2) {
        return (SubLObject)((var2.getClass() == $sX10889_native.class) ? T : NIL);
    }
    
    public static SubLObject f8726(final SubLObject var2) {
        assert NIL != f8725(var2) : var2;
        return var2.getField2();
    }
    
    public static SubLObject f8727(final SubLObject var2) {
        assert NIL != f8725(var2) : var2;
        return var2.getField3();
    }
    
    public static SubLObject f8728(final SubLObject var2) {
        assert NIL != f8725(var2) : var2;
        return var2.getField4();
    }
    
    public static SubLObject f8729(final SubLObject var2, final SubLObject var5) {
        assert NIL != f8725(var2) : var2;
        return var2.setField2(var5);
    }
    
    public static SubLObject f8730(final SubLObject var2, final SubLObject var5) {
        assert NIL != f8725(var2) : var2;
        return var2.setField3(var5);
    }
    
    public static SubLObject f8731(final SubLObject var2, final SubLObject var5) {
        assert NIL != f8725(var2) : var2;
        return var2.setField4(var5);
    }
    
    public static SubLObject f8732(SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        final SubLObject var7 = (SubLObject)new $sX10889_native();
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        SubLObject var11;
        for (var8 = (SubLObject)NIL, var8 = var6; NIL != var8; var8 = conses_high.cddr(var8)) {
            var9 = var8.first();
            var10 = conses_high.cadr(var8);
            var11 = var9;
            if (var11.eql((SubLObject)$ic16$)) {
                f8729(var7, var10);
            }
            else if (var11.eql((SubLObject)$ic17$)) {
                f8730(var7, var10);
            }
            else if (var11.eql((SubLObject)$ic18$)) {
                f8731(var7, var10);
            }
            else {
                Errors.error((SubLObject)$ic19$, var9);
            }
        }
        return var7;
    }
    
    public static SubLObject f8733(final SubLObject var12, final SubLObject var13) {
        Functions.funcall(var13, var12, (SubLObject)$ic20$, (SubLObject)$ic21$, (SubLObject)THREE_INTEGER);
        Functions.funcall(var13, var12, (SubLObject)$ic22$, (SubLObject)$ic16$, f8726(var12));
        Functions.funcall(var13, var12, (SubLObject)$ic22$, (SubLObject)$ic17$, f8727(var12));
        Functions.funcall(var13, var12, (SubLObject)$ic22$, (SubLObject)$ic18$, f8728(var12));
        Functions.funcall(var13, var12, (SubLObject)$ic23$, (SubLObject)$ic21$, (SubLObject)THREE_INTEGER);
        return var12;
    }
    
    public static SubLObject f8734(final SubLObject var12, final SubLObject var13) {
        return f8733(var12, var13);
    }
    
    public static SubLObject f8724(final SubLObject var14, final SubLObject var3, final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        if (NIL != print_high.$print_readably$.getDynamicValue(var16)) {
            print_high.print_not_readable(var14, var3);
        }
        else {
            streams_high.write_string((SubLObject)$ic25$, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var14), new SubLObject[] { $ic26$, var3 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var3);
            PrintLow.write(Equality.pointer(var14), new SubLObject[] { $ic26$, var3, $ic27$, SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8735(final SubLObject var14) {
        PrintLow.format((SubLObject)T, (SubLObject)$ic28$, var14);
        PrintLow.format((SubLObject)T, (SubLObject)$ic29$, f8727(var14));
        PrintLow.format((SubLObject)T, (SubLObject)$ic30$, f8728(var14));
        module0133.f8649(f8736(var14));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8737(final SubLObject var21) {
        final SubLObject var22 = f8732((SubLObject)UNPROVIDED);
        final SubLObject var23 = module0133.f8650((SubLObject)NIL);
        f8738(var22, var23);
        f8739(var22, var21);
        return var22;
    }
    
    public static SubLObject f8740(final SubLObject var24) {
        module0133.f8654(f8726(var24));
        f8729(var24, (SubLObject)$ic31$);
        f8730(var24, (SubLObject)$ic31$);
        f8731(var24, (SubLObject)$ic31$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8736(final SubLObject var25) {
        return f8726(var25);
    }
    
    public static SubLObject f8741(final SubLObject var25) {
        return f8727(var25);
    }
    
    public static SubLObject f8742(final SubLObject var25) {
        return f8728(var25);
    }
    
    public static SubLObject f8743(final SubLObject var25) {
        return module0133.f8667(f8736(var25));
    }
    
    public static SubLObject f8744(final SubLObject var25) {
        return module0133.f8659(f8736(var25));
    }
    
    public static SubLObject f8745(final SubLObject var25) {
        return module0133.f8661(f8736(var25));
    }
    
    public static SubLObject f8746(final SubLObject var25) {
        return module0133.f8656(f8736(var25));
    }
    
    public static SubLObject f8747(final SubLObject var25) {
        return module0130.f8524(f8742(var25));
    }
    
    public static SubLObject f8748(final SubLObject var25) {
        return module0130.f8523(f8742(var25));
    }
    
    public static SubLObject f8749(final SubLObject var25) {
        return module0133.f8664(f8736(var25));
    }
    
    public static SubLObject f8750(final SubLObject var25) {
        return module0133.f8625(f8736(var25));
    }
    
    public static SubLObject f8751(final SubLObject var25) {
        return module0133.f8619(f8736(var25));
    }
    
    public static SubLObject f8752(final SubLObject var25) {
        return module0133.f8620(f8736(var25));
    }
    
    public static SubLObject f8753(final SubLObject var25) {
        return module0133.f8665(f8736(var25));
    }
    
    public static SubLObject f8754(final SubLObject var25) {
        return module0133.f8665(f8736(var25));
    }
    
    public static SubLObject f8755(final SubLObject var25) {
        return module0133.f8657(f8736(var25));
    }
    
    public static SubLObject f8756(final SubLObject var25) {
        return module0133.f8673(f8736(var25));
    }
    
    public static SubLObject f8757(final SubLObject var25) {
        return module0133.f8663(f8736(var25));
    }
    
    public static SubLObject f8758(final SubLObject var25) {
        return module0133.f8679(f8736(var25));
    }
    
    public static SubLObject f8759(final SubLObject var25) {
        return module0133.f8668(f8736(var25));
    }
    
    public static SubLObject f8760(final SubLObject var25) {
        return module0133.f8669(f8736(var25));
    }
    
    public static SubLObject f8761(final SubLObject var25) {
        return module0133.f8671(f8736(var25));
    }
    
    public static SubLObject f8762(final SubLObject var25) {
        return module0133.f8670(f8736(var25));
    }
    
    public static SubLObject f8763(final SubLObject var25) {
        return module0133.f8674(f8736(var25));
    }
    
    public static SubLObject f8764(final SubLObject var25) {
        return module0133.f8675(f8736(var25));
    }
    
    public static SubLObject f8765(final SubLObject var25) {
        return module0237.f15576(f8736(var25));
    }
    
    public static SubLObject f8766(final SubLObject var25) {
        return module0133.f8662(f8736(var25));
    }
    
    public static SubLObject f8767(final SubLObject var25) {
        return module0133.f8676(f8736(var25));
    }
    
    public static SubLObject f8768(final SubLObject var25) {
        return module0133.f8677(f8736(var25));
    }
    
    public static SubLObject f8769(final SubLObject var25) {
        return module0133.f8678(f8736(var25));
    }
    
    public static SubLObject f8770(final SubLObject var25) {
        return module0133.f8668(f8736(var25));
    }
    
    public static SubLObject f8771(final SubLObject var25) {
        return module0133.f8669(f8736(var25));
    }
    
    public static SubLObject f8772(final SubLObject var26) {
        return module0133.f8718(var26);
    }
    
    public static SubLObject f8773(final SubLObject var25) {
        return Equality.eq(module0133.f8655(f8736(var25)), (SubLObject)$ic32$);
    }
    
    public static SubLObject f8774(final SubLObject var25) {
        return f8756(var25);
    }
    
    public static SubLObject f8775(final SubLObject var25, final SubLObject var27) {
        if (f8727(var25).isList()) {
            SubLObject var28 = (SubLObject)NIL;
            if (NIL == var28) {
                SubLObject var29 = f8727(var25);
                SubLObject var30 = (SubLObject)NIL;
                var30 = var29.first();
                while (NIL == var28 && NIL != var29) {
                    if (NIL != module0239.f15599(var27, var30)) {
                        var28 = (SubLObject)T;
                    }
                    var29 = var29.rest();
                    var30 = var29.first();
                }
            }
            return var28;
        }
        return module0239.f15599(var27, f8727(var27));
    }
    
    public static SubLObject f8776(final SubLObject var25) {
        return Equality.eq(f8749(var25), (SubLObject)$ic33$);
    }
    
    public static SubLObject f8739(final SubLObject var25, final SubLObject var21) {
        SubLObject var26 = $g1580$.getGlobalValue();
        SubLObject var27 = (SubLObject)NIL;
        var27 = var26.first();
        while (NIL != var26) {
            SubLObject var29;
            final SubLObject var28 = var29 = var27;
            SubLObject var30 = (SubLObject)NIL;
            SubLObject var31 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)$ic34$);
            var30 = var29.first();
            var29 = (var31 = var29.rest());
            if (NIL != var31) {
                f8777(var25, var30, var31);
            }
            var26 = var26.rest();
            var27 = var26.first();
        }
        SubLObject var32;
        SubLObject var33;
        SubLObject var34;
        for (var32 = (SubLObject)NIL, var32 = var21; NIL != var32; var32 = conses_high.cddr(var32)) {
            var33 = var32.first();
            var34 = conses_high.cadr(var32);
            f8777(var25, var33, var34);
        }
        return var25;
    }
    
    public static SubLObject f8777(final SubLObject var25, final SubLObject var1, SubLObject var36) {
        if (NIL == var36) {
            var36 = f8722(var1);
        }
        final SubLObject var37 = f8736(var25);
        if (var1.eql((SubLObject)$ic17$)) {
            f8778(var25, var36);
        }
        else if (var1.eql((SubLObject)$ic35$)) {
            module0133.f8690(var37, var36);
        }
        else if (var1.eql((SubLObject)$ic18$)) {
            f8779(var25, var36);
        }
        else if (var1.eql((SubLObject)$ic36$)) {
            module0133.f8689(var37, var36);
        }
        else if (var1.eql((SubLObject)$ic37$)) {
            module0133.f8691(var37, var36);
        }
        else if (var1.eql((SubLObject)$ic38$)) {
            module0133.f8692(var37, var36);
        }
        else if (var1.eql((SubLObject)$ic39$)) {
            module0133.f8693(var37, var36);
        }
        else if (var1.eql((SubLObject)$ic40$)) {
            module0133.f8694(var37, var36);
        }
        else if (var1.eql((SubLObject)$ic41$)) {
            module0133.f8695(var37, var36);
        }
        else if (var1.eql((SubLObject)$ic42$)) {
            module0133.f8696(var37, var36);
        }
        else if (var1.eql((SubLObject)$ic43$)) {
            module0133.f8698(var37, var36);
        }
        else if (var1.eql((SubLObject)$ic44$)) {
            module0133.f8699(var37, var36);
        }
        else if (var1.eql((SubLObject)$ic45$)) {
            module0133.f8700(var37, var36);
        }
        else if (var1.eql((SubLObject)$ic46$)) {
            module0133.f8701(var37, var36);
        }
        else if (var1.eql((SubLObject)$ic47$)) {
            module0133.f8702(var37, var36);
        }
        return var25;
    }
    
    public static SubLObject f8738(final SubLObject var25, final SubLObject var23) {
        f8729(var25, var23);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8778(final SubLObject var25, final SubLObject var39) {
        f8730(var25, var39);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8780(final SubLObject var25, final SubLObject var40) {
        module0133.f8690(f8736(var25), var40);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8779(final SubLObject var25, final SubLObject var41) {
        f8731(var25, var41);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8781(final SubLObject var25, final SubLObject var42) {
        module0133.f8691(f8736(var25), var42);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8782(final SubLObject var25, final SubLObject var43) {
        module0133.f8692(f8736(var25), var43);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8783(final SubLObject var25, final SubLObject var44) {
        module0133.f8693(f8736(var25), var44);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8784(final SubLObject var25, final SubLObject var45) {
        module0133.f8694(f8736(var25), var45);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8785(final SubLObject var25, final SubLObject var46) {
        module0133.f8695(f8736(var25), var46);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8786(final SubLObject var25, final SubLObject var47) {
        module0133.f8696(f8736(var25), var47);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8787(final SubLObject var25, final SubLObject var48) {
        module0133.f8698(f8736(var25), var48);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8788(final SubLObject var25, final SubLObject var49) {
        module0133.f8699(f8736(var25), var49);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8789(final SubLObject var25, final SubLObject var50) {
        module0133.f8700(f8736(var25), var50);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8790(final SubLObject var25, final SubLObject var51) {
        module0133.f8701(f8736(var25), var51);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8791(final SubLObject var25, final SubLObject var52) {
        module0133.f8653(f8736(var25), var52);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8792(final SubLObject var25, final SubLObject var53) {
        module0133.f8697(f8736(var25), var53);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8793(final SubLObject var25, final SubLObject var52) {
        f8791(var25, var52);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8794(final SubLObject var25, final SubLObject var54) {
        module0133.f8705(f8736(var25), var54);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8795(final SubLObject var25, final SubLObject var55, SubLObject var56) {
        if (var56 == UNPROVIDED) {
            var56 = Symbols.symbol_function((SubLObject)EQL);
        }
        module0133.f8706(f8736(var25), var55, var56);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8796(final SubLObject var25, final SubLObject var55) {
        module0133.f8707(f8736(var25), var55);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8797(final SubLObject var57, final SubLObject var58) {
        SubLObject var60;
        final SubLObject var59 = var60 = var57.rest();
        SubLObject var61 = (SubLObject)NIL;
        SubLObject var62 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var60, var59, (SubLObject)$ic48$);
        var61 = var60.first();
        var60 = var60.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var60, var59, (SubLObject)$ic48$);
        var62 = var60.first();
        final SubLObject var63;
        var60 = (var63 = var60.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic49$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var61, (SubLObject)ConsesLow.list((SubLObject)$ic50$, var62))), (SubLObject)$ic51$, ConsesLow.append(var63, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic52$, var61))));
    }
    
    public static SubLObject f8798(final SubLObject var25) {
        module0133.f8704(f8736(var25));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8799() {
        return module0133.f8712();
    }
    
    public static SubLObject f8800() {
        return module0133.f8713();
    }
    
    public static SubLObject f8801(final SubLObject var40) {
        return module0133.f8714(var40);
    }
    
    public static SubLObject f8802(final SubLObject var57, final SubLObject var58) {
        SubLObject var60;
        final SubLObject var59 = var60 = var57.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var60, var59, (SubLObject)$ic53$);
        final SubLObject var61 = var60.rest();
        var60 = var60.first();
        SubLObject var62 = (SubLObject)NIL;
        SubLObject var63 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var60, var59, (SubLObject)$ic53$);
        var62 = var60.first();
        var60 = var60.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var60, var59, (SubLObject)$ic53$);
        var63 = var60.first();
        var60 = var60.rest();
        SubLObject var64 = (SubLObject)NIL;
        SubLObject var65 = var60;
        SubLObject var66 = (SubLObject)NIL;
        SubLObject var70_71 = (SubLObject)NIL;
        while (NIL != var65) {
            cdestructuring_bind.destructuring_bind_must_consp(var65, var59, (SubLObject)$ic53$);
            var70_71 = var65.first();
            var65 = var65.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var65, var59, (SubLObject)$ic53$);
            if (NIL == conses_high.member(var70_71, (SubLObject)$ic54$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var66 = (SubLObject)T;
            }
            if (var70_71 == $ic55$) {
                var64 = var65.first();
            }
            var65 = var65.rest();
        }
        if (NIL != var66 && NIL == var64) {
            cdestructuring_bind.cdestructuring_bind_error(var59, (SubLObject)$ic53$);
        }
        final SubLObject var67 = cdestructuring_bind.property_list_member((SubLObject)$ic56$, var60);
        final SubLObject var68 = (SubLObject)((NIL != var67) ? conses_high.cadr(var67) : NIL);
        final SubLObject var69;
        var60 = (var69 = var61);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic57$, (SubLObject)ConsesLow.list(var62, var63, (SubLObject)$ic56$, var68), ConsesLow.append(var69, (SubLObject)NIL));
    }
    
    public static SubLObject f8803(final SubLObject var40) {
        return module0133.f8717(var40);
    }
    
    public static SubLObject f8804(final SubLObject var27) {
        return (SubLObject)(ONE_INTEGER.eql(module0226.f15068(var27, (SubLObject)UNPROVIDED)) ? $ic58$ : $ic59$);
    }
    
    public static SubLObject f8805(final SubLObject var27) {
        final SubLObject var28 = module0226.f15069(var27, (SubLObject)UNPROVIDED);
        if (var28.eql((SubLObject)ONE_INTEGER)) {
            return (SubLObject)$ic59$;
        }
        if (var28.eql((SubLObject)TWO_INTEGER)) {
            return (SubLObject)$ic58$;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8806(final SubLObject var57, final SubLObject var58) {
        SubLObject var60;
        final SubLObject var59 = var60 = var57.rest();
        SubLObject var61 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var60, var59, (SubLObject)$ic60$);
        var61 = var60.first();
        final SubLObject var62;
        var60 = (var62 = var60.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic49$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic61$, var61)), ConsesLow.append(var62, (SubLObject)NIL));
    }
    
    public static SubLObject f8807() {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        return $g1583$.getDynamicValue(var16);
    }
    
    public static SubLObject f8808(final SubLObject var57, final SubLObject var58) {
        SubLObject var60;
        final SubLObject var59 = var60 = var57.rest();
        SubLObject var61 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var60, var59, (SubLObject)$ic62$);
        var61 = var60.first();
        final SubLObject var62;
        var60 = (var62 = var60.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic63$, (SubLObject)ConsesLow.listS((SubLObject)$ic64$, var61, (SubLObject)$ic65$), (SubLObject)ConsesLow.listS((SubLObject)$ic49$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic66$, var61)), ConsesLow.append(var62, (SubLObject)NIL)));
    }
    
    public static SubLObject f8809(final SubLObject var57, final SubLObject var58) {
        final SubLObject var59 = var57.rest();
        final SubLObject var61;
        final SubLObject var60 = var61 = var59;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic49$, (SubLObject)$ic67$, ConsesLow.append(var61, (SubLObject)NIL));
    }
    
    public static SubLObject f8810(final SubLObject var57, final SubLObject var58) {
        final SubLObject var59 = var57.rest();
        final SubLObject var61;
        final SubLObject var60 = var61 = var59;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic49$, (SubLObject)$ic68$, ConsesLow.append(var61, (SubLObject)NIL));
    }
    
    public static SubLObject f8811(final SubLObject var57, final SubLObject var58) {
        final SubLObject var59 = var57.rest();
        final SubLObject var61;
        final SubLObject var60 = var61 = var59;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic49$, (SubLObject)$ic69$, ConsesLow.append(var61, (SubLObject)NIL));
    }
    
    public static SubLObject f8812(final SubLObject var57, final SubLObject var58) {
        final SubLObject var59 = var57.rest();
        final SubLObject var61;
        final SubLObject var60 = var61 = var59;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic49$, (SubLObject)$ic70$, ConsesLow.append(var61, (SubLObject)NIL));
    }
    
    public static SubLObject f8813() {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        return $g1584$.getDynamicValue(var16);
    }
    
    public static SubLObject f8814(final SubLObject var57, final SubLObject var58) {
        SubLObject var60;
        final SubLObject var59 = var60 = var57.rest();
        SubLObject var61 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var60, var59, (SubLObject)$ic71$);
        var61 = var60.first();
        final SubLObject var62;
        var60 = (var62 = var60.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic49$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic72$, var61)), ConsesLow.append(var62, (SubLObject)NIL));
    }
    
    public static SubLObject f8815(final SubLObject var89, final SubLObject var90, SubLObject var4, SubLObject var91, SubLObject var92, SubLObject var93, SubLObject var94) {
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        if (var91 == UNPROVIDED) {
            var91 = (SubLObject)NIL;
        }
        if (var92 == UNPROVIDED) {
            var92 = (SubLObject)NIL;
        }
        if (var93 == UNPROVIDED) {
            var93 = (SubLObject)NIL;
        }
        if (var94 == UNPROVIDED) {
            var94 = (SubLObject)NIL;
        }
        final SubLThread var95 = SubLProcess.currentSubLThread();
        if ($g1585$.getDynamicValue(var95).numGE(var89)) {
            Errors.cerror((SubLObject)$ic73$, var90, new SubLObject[] { var4, var91, var92, var93, var94 });
        }
        else if (Numbers.add((SubLObject)TWO_INTEGER, $g1585$.getDynamicValue(var95)).numGE(var89)) {
            Errors.warn(var90, new SubLObject[] { var4, var91, var92, var93, var94 });
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8816() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8722", "S#10895", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8723", "S#10896", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8725", "S#10890", 1, 0, false);
        new $f8725$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8726", "S#10897", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8727", "S#10898", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8728", "S#10899", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8729", "S#10900", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8730", "S#10901", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8731", "S#10902", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8732", "S#10903", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8733", "S#10904", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8734", "S#10905", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8724", "S#10906", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8735", "S#10907", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8737", "S#10908", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8740", "S#10909", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8736", "S#10910", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8741", "S#10911", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8742", "S#10912", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8743", "S#10913", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8744", "S#10914", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8745", "S#10915", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8746", "S#10916", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8747", "S#10917", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8748", "S#10918", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8749", "S#10919", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8750", "S#10920", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8751", "S#10921", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8752", "S#10922", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8753", "S#10923", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8754", "S#10924", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8755", "S#10925", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8756", "S#10926", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8757", "S#10927", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8758", "S#10928", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8759", "S#10929", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8760", "S#10930", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8761", "S#10931", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8762", "S#10932", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8763", "S#10933", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8764", "S#10934", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8765", "S#10935", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8766", "S#10936", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8767", "S#10937", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8768", "S#10938", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8769", "S#10939", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8770", "S#10940", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8771", "S#10941", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8772", "S#10942", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8773", "S#10943", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8774", "S#10944", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8775", "S#10945", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8776", "S#10946", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8739", "S#10947", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8777", "S#10948", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8738", "S#10949", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8778", "S#10950", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8780", "S#10951", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8779", "S#10952", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8781", "S#10953", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8782", "S#10954", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8783", "S#10955", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8784", "S#10956", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8785", "S#10957", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8786", "S#10958", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8787", "S#10959", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8788", "S#10960", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8789", "S#10961", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8790", "S#10962", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8791", "S#10963", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8792", "S#10964", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8793", "S#10965", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8794", "S#10966", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8795", "S#10967", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8796", "S#10968", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0134", "f8797", "S#10969");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8798", "S#10970", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8799", "S#10971", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8800", "S#10972", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8801", "S#10973", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0134", "f8802", "S#10974");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8803", "S#10975", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8804", "S#10976", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8805", "S#10977", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0134", "f8806", "S#10978");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8807", "S#10979", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0134", "f8808", "S#10980");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0134", "f8809", "S#10981");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0134", "f8810", "S#10982");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0134", "f8811", "S#10983");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0134", "f8812", "S#10984");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8813", "S#10985", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0134", "f8814", "S#10986");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0134", "f8815", "S#10987", 2, 5, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8817() {
        $g1580$ = SubLFiles.deflexical("S#10988", (SubLObject)$ic0$);
        $g1581$ = SubLFiles.defconstant("S#10989", (SubLObject)$ic1$);
        $g1582$ = SubLFiles.defparameter("S#10990", (SubLObject)NIL);
        $g1583$ = SubLFiles.defparameter("S#10991", (SubLObject)T);
        $g1584$ = SubLFiles.defparameter("S#10992", (SubLObject)NIL);
        $g1585$ = SubLFiles.defparameter("S#10993", (SubLObject)ONE_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8818() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1581$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic8$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic9$);
        Structures.def_csetf((SubLObject)$ic10$, (SubLObject)$ic11$);
        Structures.def_csetf((SubLObject)$ic12$, (SubLObject)$ic13$);
        Structures.def_csetf((SubLObject)$ic14$, (SubLObject)$ic15$);
        Equality.identity((SubLObject)$ic1$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1581$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic24$));
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f8816();
    }
    
    public void initializeVariables() {
        f8817();
    }
    
    public void runTopLevelForms() {
        f8818();
    }
    
    static {
        me = (SubLFile)new module0134();
        $g1580$ = null;
        $g1581$ = null;
        $g1582$ = null;
        $g1583$ = null;
        $g1584$ = null;
        $g1585$ = null;
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)makeKeyword("DIRECTION"), (SubLObject)makeKeyword("FORWARD")), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("TV"), (SubLObject)makeKeyword("TRUE-DEF")), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("ORDER"), (SubLObject)makeKeyword("BREADTH-FIRST")));
        $ic1$ = makeSymbol("S#10889", "CYC");
        $ic2$ = makeSymbol("S#10890", "CYC");
        $ic3$ = ConsesLow.list((SubLObject)makeSymbol("S#10762", "CYC"), (SubLObject)makeSymbol("S#10994", "CYC"), (SubLObject)makeSymbol("S#10995", "CYC"));
        $ic4$ = ConsesLow.list((SubLObject)makeKeyword("GRAPHL-SEARCH"), (SubLObject)makeKeyword("PREDICATES"), (SubLObject)makeKeyword("TV"));
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#10897", "CYC"), (SubLObject)makeSymbol("S#10898", "CYC"), (SubLObject)makeSymbol("S#10899", "CYC"));
        $ic6$ = ConsesLow.list((SubLObject)makeSymbol("S#10900", "CYC"), (SubLObject)makeSymbol("S#10901", "CYC"), (SubLObject)makeSymbol("S#10902", "CYC"));
        $ic7$ = makeSymbol("S#10906", "CYC");
        $ic8$ = makeSymbol("S#10896", "CYC");
        $ic9$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#10890", "CYC"));
        $ic10$ = makeSymbol("S#10897", "CYC");
        $ic11$ = makeSymbol("S#10900", "CYC");
        $ic12$ = makeSymbol("S#10898", "CYC");
        $ic13$ = makeSymbol("S#10901", "CYC");
        $ic14$ = makeSymbol("S#10899", "CYC");
        $ic15$ = makeSymbol("S#10902", "CYC");
        $ic16$ = makeKeyword("GRAPHL-SEARCH");
        $ic17$ = makeKeyword("PREDICATES");
        $ic18$ = makeKeyword("TV");
        $ic19$ = makeString("Invalid slot ~S for construction function");
        $ic20$ = makeKeyword("BEGIN");
        $ic21$ = makeSymbol("S#10903", "CYC");
        $ic22$ = makeKeyword("SLOT");
        $ic23$ = makeKeyword("END");
        $ic24$ = makeSymbol("S#10905", "CYC");
        $ic25$ = makeString("#<");
        $ic26$ = makeKeyword("STREAM");
        $ic27$ = makeKeyword("BASE");
        $ic28$ = makeString("GHL Search : ~a~%");
        $ic29$ = makeString("Predicates ~a~%");
        $ic30$ = makeString("TV ~s~%");
        $ic31$ = makeKeyword("FREE");
        $ic32$ = makeKeyword("TRANSITIVE-REASONING");
        $ic33$ = makeKeyword("ALL");
        $ic34$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#10996", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"));
        $ic35$ = makeKeyword("DIRECTION");
        $ic36$ = makeKeyword("TYPE");
        $ic37$ = makeKeyword("ORDER");
        $ic38$ = makeKeyword("CUTOFF");
        $ic39$ = makeKeyword("MARKING");
        $ic40$ = makeKeyword("MARKING-SPACE");
        $ic41$ = makeKeyword("GOAL");
        $ic42$ = makeKeyword("GOAL-FN");
        $ic43$ = makeKeyword("GOAL-SPACE");
        $ic44$ = makeKeyword("SATISFY-FN");
        $ic45$ = makeKeyword("MAP-FN");
        $ic46$ = makeKeyword("JUSTIFY?");
        $ic47$ = makeKeyword("ADD-TO-RESULT?");
        $ic48$ = ConsesLow.list((SubLObject)makeSymbol("S#10887", "CYC"), (SubLObject)makeSymbol("S#138", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic49$ = makeSymbol("CLET");
        $ic50$ = makeSymbol("S#10908", "CYC");
        $ic51$ = ConsesLow.list((SubLObject)makeSymbol("S#10997", "CYC"));
        $ic52$ = makeSymbol("S#10909", "CYC");
        $ic53$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10888", "CYC"), (SubLObject)makeSymbol("S#5432", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#8587", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic54$ = ConsesLow.list((SubLObject)makeKeyword("DONE-VAR"));
        $ic55$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic56$ = makeKeyword("DONE-VAR");
        $ic57$ = makeSymbol("S#10870", "CYC");
        $ic58$ = makeKeyword("FORWARD");
        $ic59$ = makeKeyword("BACKWARD");
        $ic60$ = ConsesLow.list((SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic61$ = makeSymbol("S#10990", "CYC");
        $ic62$ = ConsesLow.list((SubLObject)makeSymbol("S#10998", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic63$ = makeSymbol("PROGN");
        $ic64$ = makeSymbol("CHECK-TYPE");
        $ic65$ = ConsesLow.list((SubLObject)makeSymbol("BOOLEANP"));
        $ic66$ = makeSymbol("S#10991", "CYC");
        $ic67$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10991", "CYC"), (SubLObject)T));
        $ic68$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10991", "CYC"), (SubLObject)NIL));
        $ic69$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10992", "CYC"), (SubLObject)NIL));
        $ic70$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10992", "CYC"), (SubLObject)T));
        $ic71$ = ConsesLow.list((SubLObject)makeSymbol("S#696", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic72$ = makeSymbol("S#10993", "CYC");
        $ic73$ = makeString("continue anyway");
    }
    
    public static final class $sX10889_native extends SubLStructNative
    {
        public SubLObject $graphl_search;
        public SubLObject $predicates;
        public SubLObject $tv;
        public static final SubLStructDeclNative structDecl;
        
        public $sX10889_native() {
            this.$graphl_search = (SubLObject)CommonSymbols.NIL;
            this.$predicates = (SubLObject)CommonSymbols.NIL;
            this.$tv = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$graphl_search;
        }
        
        public SubLObject getField3() {
            return this.$predicates;
        }
        
        public SubLObject getField4() {
            return this.$tv;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$graphl_search = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$predicates = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$tv = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX10889_native.class, $ic1$, $ic2$, $ic3$, $ic4$, new String[] { "$graphl_search", "$predicates", "$tv" }, $ic5$, $ic6$, $ic7$);
        }
    }
    
    public static final class $f8725$UnaryFunction extends UnaryFunction
    {
        public $f8725$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#10890"));
        }
        
        public SubLObject processItem(final SubLObject var4) {
            return f8725(var4);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 186 ms
	
	Decompiled with Procyon 0.5.32.
*/