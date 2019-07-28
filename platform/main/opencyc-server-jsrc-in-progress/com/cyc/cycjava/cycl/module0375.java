package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
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

public final class module0375 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0375";
    public static final String myFingerPrint = "139c2c2a29122c6811adf3405fd3e349b633800c1bca122ce7959544975a16bc";
    public static SubLSymbol $g3186$;
    public static SubLSymbol $g3187$;
    public static SubLSymbol $g3188$;
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
    private static final SubLString $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLList $ic24$;
    private static final SubLList $ic25$;
    private static final SubLList $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLList $ic28$;
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
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLList $ic47$;
    private static final SubLList $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLString $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    
    
    public static SubLObject f26543(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26544(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX29754_native.class) ? T : NIL);
    }
    
    public static SubLObject f26545(final SubLObject var1) {
        assert NIL != f26544(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f26546(final SubLObject var1) {
        assert NIL != f26544(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f26547(final SubLObject var1, final SubLObject var4) {
        assert NIL != f26544(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f26548(final SubLObject var1, final SubLObject var4) {
        assert NIL != f26544(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f26549(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX29754_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic13$)) {
                f26547(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic14$)) {
                f26548(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic15$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f26550(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic16$, (SubLObject)$ic17$, (SubLObject)TWO_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic18$, (SubLObject)$ic13$, f26545(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic18$, (SubLObject)$ic14$, f26546(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic19$, (SubLObject)$ic17$, (SubLObject)TWO_INTEGER);
        return var11;
    }
    
    public static SubLObject f26551(final SubLObject var11, final SubLObject var12) {
        return f26550(var11, var12);
    }
    
    public static SubLObject f26552(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26553(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX29756_native.class) ? T : NIL);
    }
    
    public static SubLObject f26554(final SubLObject var1) {
        assert NIL != f26553(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f26555(final SubLObject var1) {
        assert NIL != f26553(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f26556(final SubLObject var1) {
        assert NIL != f26553(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f26557(final SubLObject var1, final SubLObject var4) {
        assert NIL != f26553(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f26558(final SubLObject var1, final SubLObject var4) {
        assert NIL != f26553(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f26559(final SubLObject var1, final SubLObject var4) {
        assert NIL != f26553(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f26560(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX29756_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic13$)) {
                f26557(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic14$)) {
                f26558(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic35$)) {
                f26559(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic15$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f26561(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic16$, (SubLObject)$ic36$, (SubLObject)THREE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic18$, (SubLObject)$ic13$, f26554(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic18$, (SubLObject)$ic14$, f26555(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic18$, (SubLObject)$ic35$, f26556(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic19$, (SubLObject)$ic36$, (SubLObject)THREE_INTEGER);
        return var11;
    }
    
    public static SubLObject f26562(final SubLObject var11, final SubLObject var12) {
        return f26561(var11, var12);
    }
    
    public static SubLObject f26563(final SubLObject var16, final SubLObject var17, final SubLObject var18, SubLObject var19, SubLObject var20) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (var20 == UNPROVIDED) {
            var20 = (SubLObject)NIL;
        }
        assert NIL != module0363.f24478(var16) : var16;
        if (NIL != var17 && !areAssertionsDisabledFor(me) && NIL == module0364.f24774(var17)) {
            throw new AssertionError(var17);
        }
        final SubLObject var21 = module0364.f24729((SubLObject)$ic40$, var16);
        if (NIL != var19) {
            f26564(var21);
        }
        else {
            f26565(var21);
        }
        if (NIL != var20) {
            f26566(var21, var20);
        }
        f26567(var21, var18);
        f26568(var21);
        module0364.f24783(var17, var21);
        module0364.f24775(var21);
        module0373.f26334(var21);
        return var21;
    }
    
    public static SubLObject f26565(final SubLObject var22) {
        final SubLObject var23 = f26549((SubLObject)UNPROVIDED);
        module0364.f24744(var22, var23);
        return var22;
    }
    
    public static SubLObject f26564(final SubLObject var22) {
        final SubLObject var23 = f26560((SubLObject)UNPROVIDED);
        module0364.f24744(var22, var23);
        return var22;
    }
    
    public static SubLObject f26569(final SubLObject var22) {
        final SubLObject var23 = module0364.f24725(var22);
        final SubLObject var24 = module0363.f24530(var23);
        SubLObject var25;
        SubLObject var26;
        SubLObject var27;
        for (var25 = module0032.f1741(var24), var26 = (SubLObject)NIL, var26 = module0032.f1742(var25, var24); NIL == module0032.f1744(var25, var26); var26 = module0032.f1743(var26)) {
            var27 = module0032.f1745(var25, var26);
            if (NIL != module0032.f1746(var26, var27) && NIL != module0364.f24748(var27, (SubLObject)$ic41$)) {
                module0381.f27063(var27, var22);
            }
        }
        final SubLObject var28 = module0364.f24742(var22);
        if (NIL != f26544(var28)) {
            f26547(var28, (SubLObject)$ic42$);
            f26548(var28, (SubLObject)$ic42$);
        }
        else {
            f26557(var28, (SubLObject)$ic42$);
            f26558(var28, (SubLObject)$ic42$);
            f26559(var28, (SubLObject)$ic42$);
        }
        return var22;
    }
    
    public static SubLObject f26570(final SubLObject var22) {
        assert NIL != f26571(var22) : var22;
        final SubLObject var23 = module0364.f24742(var22);
        if (NIL != f26544(var23)) {
            return f26545(var23);
        }
        return f26554(var23);
    }
    
    public static SubLObject f26572(final SubLObject var22) {
        assert NIL != f26571(var22) : var22;
        final SubLObject var23 = module0364.f24742(var22);
        if (NIL != f26544(var23)) {
            return f26546(var23);
        }
        return f26555(var23);
    }
    
    public static SubLObject f26573(final SubLObject var22) {
        assert NIL != f26571(var22) : var22;
        final SubLObject var23 = module0364.f24742(var22);
        if (NIL != f26553(var23)) {
            return f26556(var23);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26567(final SubLObject var22, final SubLObject var29) {
        assert NIL != f26571(var22) : var22;
        assert NIL != module0233.f15350(var29) : var29;
        final SubLObject var30 = module0364.f24742(var22);
        if (NIL != f26544(var30)) {
            f26547(var30, var29);
        }
        else {
            f26557(var30, var29);
        }
        return var22;
    }
    
    public static SubLObject f26566(final SubLObject var22, final SubLObject var20) {
        assert NIL != f26571(var22) : var22;
        assert NIL != module0340.f22789(var20) : var20;
        final SubLObject var23 = module0364.f24742(var22);
        if (NIL != f26544(var23)) {
            f26548(var23, var20);
        }
        else {
            f26558(var23, var20);
        }
        return var22;
    }
    
    public static SubLObject f26568(final SubLObject var22) {
        assert NIL != f26571(var22) : var22;
        final SubLObject var23 = module0364.f24742(var22);
        if (NIL != f26553(var23)) {
            f26559(var23, (SubLObject)NIL);
        }
        return var22;
    }
    
    public static SubLObject f26574(final SubLObject var22, final SubLObject var30) {
        assert NIL != f26571(var22) : var22;
        assert NIL != module0365.f24819(var30) : var30;
        final SubLObject var31 = module0364.f24742(var22);
        if (NIL != f26553(var31) && NIL == conses_high.member(var30, f26556(var31), (SubLObject)EQUAL, Symbols.symbol_function((SubLObject)IDENTITY))) {
            f26559(var31, (SubLObject)ConsesLow.cons(var30, f26556(var31)));
        }
        return var22;
    }
    
    public static SubLObject f26575(final SubLObject var32, final SubLObject var33) {
        SubLObject var35;
        final SubLObject var34 = var35 = var32.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)$ic47$);
        final SubLObject var36 = var35.rest();
        var35 = var35.first();
        SubLObject var37 = (SubLObject)NIL;
        SubLObject var38 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)$ic47$);
        var37 = var35.first();
        var35 = var35.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)$ic47$);
        var38 = var35.first();
        var35 = var35.rest();
        SubLObject var39 = (SubLObject)NIL;
        SubLObject var40 = var35;
        SubLObject var41 = (SubLObject)NIL;
        SubLObject var41_42 = (SubLObject)NIL;
        while (NIL != var40) {
            cdestructuring_bind.destructuring_bind_must_consp(var40, var34, (SubLObject)$ic47$);
            var41_42 = var40.first();
            var40 = var40.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var40, var34, (SubLObject)$ic47$);
            if (NIL == conses_high.member(var41_42, (SubLObject)$ic48$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var41 = (SubLObject)T;
            }
            if (var41_42 == $ic49$) {
                var39 = var40.first();
            }
            var40 = var40.rest();
        }
        if (NIL != var41 && NIL == var39) {
            cdestructuring_bind.cdestructuring_bind_error(var34, (SubLObject)$ic47$);
        }
        final SubLObject var42 = cdestructuring_bind.property_list_member((SubLObject)$ic50$, var35);
        final SubLObject var43 = (SubLObject)((NIL != var42) ? conses_high.cadr(var42) : NIL);
        final SubLObject var44;
        var35 = (var44 = var36);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic51$, (SubLObject)ConsesLow.list(var37, (SubLObject)ConsesLow.list((SubLObject)$ic52$, var38), (SubLObject)$ic50$, var43), ConsesLow.append(var44, (SubLObject)NIL));
    }
    
    public static SubLObject f26576(final SubLObject var46) {
        return (SubLObject)makeBoolean(NIL != module0364.f24699(var46) && NIL != f26553(module0364.f24742(var46)));
    }
    
    public static SubLObject f26577(final SubLObject var22) {
        return module0364.f24753(var22);
    }
    
    public static SubLObject f26578(final SubLObject var22) {
        final SubLObject var23 = f26577(var22);
        if (NIL != var23) {
            return module0364.f24737(var23);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26579(final SubLObject var22) {
        assert NIL != f26571(var22) : var22;
        final SubLObject var23 = module0364.f24725(var22);
        final SubLObject var24 = f26572(var22);
        if (NIL != var24) {
            SubLObject var25 = module0363.f24517(var23);
            SubLObject var26 = (SubLObject)NIL;
            var26 = var25.first();
            while (NIL != var25) {
                if (var24.eql(module0365.f24865(var26))) {
                    return var26;
                }
                var25 = var25.rest();
                var26 = var25.first();
            }
            if (NIL == module0363.f24685(var23)) {
                return Errors.error((SubLObject)$ic53$, var22);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26571(final SubLObject var46) {
        return (SubLObject)makeBoolean(NIL != module0364.f24699(var46) && $ic40$ == module0364.f24721(var46));
    }
    
    public static SubLObject f26580(final SubLObject var16, final SubLObject var17, final SubLObject var18, SubLObject var19, SubLObject var30) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (var30 == UNPROVIDED) {
            var30 = (SubLObject)NIL;
        }
        final SubLObject var31 = module0363.f24530(module0364.f24736(var17));
        SubLObject var32;
        SubLObject var33;
        SubLObject var34;
        for (var32 = module0032.f1741(var31), var33 = (SubLObject)NIL, var33 = module0032.f1742(var32, var31); NIL == module0032.f1744(var32, var33); var33 = module0032.f1743(var33)) {
            var34 = module0032.f1745(var32, var33);
            if (NIL != module0032.f1746(var33, var34) && NIL != f26571(var34) && var16.eql(module0364.f24725(var34)) && NIL != module0233.f15364(var18, f26570(var34))) {
                return var34;
            }
        }
        final SubLObject var35 = (SubLObject)((NIL != var30) ? module0365.f24865(var30) : NIL);
        return f26563(var16, var17, var18, var19, var35);
    }
    
    public static SubLObject f26581(final SubLObject var51, final SubLObject var52, final SubLObject var22) {
        final SubLThread var53 = SubLProcess.currentSubLThread();
        final SubLObject var54 = module0366.f24934(var51);
        final SubLObject var55 = f26570(var22);
        final SubLObject var56 = module0373.f26255(var55, var54, var52);
        var53.resetMultipleValues();
        final SubLObject var57 = f26582(var22, var51, var56);
        final SubLObject var58 = var53.secondMultipleValue();
        var53.resetMultipleValues();
        module0379.f26947(var22, var51);
        if (NIL != var58) {
            module0373.f26265(var57);
        }
        else {
            module0373.f26245(var51);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26582(final SubLObject var22, final SubLObject var51, final SubLObject var55) {
        final SubLObject var56 = (SubLObject)ConsesLow.list(var51);
        return module0373.f26221(var22, module0373.f26258(var55), var56);
    }
    
    public static SubLObject f26583(final SubLObject var46) {
        return (SubLObject)makeBoolean(NIL != module0366.f24916(var46) && $ic40$ == module0366.f24989(var46));
    }
    
    public static SubLObject f26584(final SubLObject var47) {
        return module0363.f24593(var47, (SubLObject)$ic40$);
    }
    
    public static SubLObject f26585(final SubLObject var59) {
        assert NIL != f26583(var59) : var59;
        return f26572(module0366.f24937(var59));
    }
    
    public static SubLObject f26586(final SubLObject var30) {
        return (SubLObject)makeBoolean(NIL != module0365.f24819(var30) && NIL != module0526.f32859(module0365.f24865(var30)));
    }
    
    public static SubLObject f26587(final SubLObject var46) {
        return (SubLObject)makeBoolean(NIL != f26571(var46) && NIL != module0526.f32859(f26572(var46)));
    }
    
    public static SubLObject f26588(final SubLObject var47) {
        return module0363.f24603(var47, (SubLObject)$ic55$);
    }
    
    public static SubLObject f26589(final SubLObject var47) {
        return module0363.f24593(var47, (SubLObject)$ic55$);
    }
    
    public static SubLObject f26590(final SubLObject var47) {
        final SubLObject var48 = module0363.f24527(var47);
        SubLObject var49;
        SubLObject var50;
        SubLObject var51;
        for (var49 = module0032.f1741(var48), var50 = (SubLObject)NIL, var50 = module0032.f1742(var49, var48); NIL == module0032.f1744(var49, var50); var50 = module0032.f1743(var50)) {
            var51 = module0032.f1745(var49, var50);
            if (NIL != module0032.f1746(var50, var51) && NIL != module0364.f24748(var51, (SubLObject)$ic55$)) {
                return module0364.f24757(var51);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26591() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0375", "f26543", "S#29761", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0375", "f26544", "S#29755", 1, 0, false);
        new $f26544$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0375", "f26545", "S#29762", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0375", "f26546", "S#29763", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0375", "f26547", "S#29764", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0375", "f26548", "S#29765", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0375", "f26549", "S#29766", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0375", "f26550", "S#29767", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0375", "f26551", "S#29768", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0375", "f26552", "S#29769", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0375", "f26553", "S#29757", 1, 0, false);
        new $f26553$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0375", "f26554", "S#29770", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0375", "f26555", "S#29771", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0375", "f26556", "S#29772", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0375", "f26557", "S#29773", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0375", "f26558", "S#29774", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0375", "f26559", "S#29775", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0375", "f26560", "S#29776", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0375", "f26561", "S#29777", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0375", "f26562", "S#29778", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0375", "f26563", "S#29779", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0375", "f26565", "S#29780", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0375", "f26564", "S#29781", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0375", "f26569", "S#27595", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0375", "f26570", "S#27384", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0375", "f26572", "S#29782", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0375", "f26573", "S#29783", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0375", "f26567", "S#29784", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0375", "f26566", "S#29785", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0375", "f26568", "S#29786", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0375", "f26574", "S#29787", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0375", "f26575", "S#29788");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0375", "f26576", "S#29789", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0375", "f26577", "S#29790", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0375", "f26578", "S#29791", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0375", "f26579", "S#28941", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0375", "f26571", "S#27357", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0375", "f26580", "S#29792", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0375", "f26581", "S#29265", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0375", "f26582", "S#29793", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0375", "f26583", "S#28935", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0375", "f26584", "S#29794", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0375", "f26585", "S#28936", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0375", "f26586", "S#29795", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0375", "f26587", "S#27605", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0375", "f26588", "S#29796", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0375", "f26589", "S#29309", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0375", "f26590", "S#29797", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26592() {
        $g3186$ = SubLFiles.defconstant("S#29798", (SubLObject)$ic0$);
        $g3187$ = SubLFiles.defconstant("S#29799", (SubLObject)$ic21$);
        $g3188$ = SubLFiles.defparameter("S#29800", (SubLObject)T);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26593() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g3186$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic8$);
        Structures.def_csetf((SubLObject)$ic9$, (SubLObject)$ic10$);
        Structures.def_csetf((SubLObject)$ic11$, (SubLObject)$ic12$);
        Equality.identity((SubLObject)$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g3186$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic20$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g3187$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic27$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic28$);
        Structures.def_csetf((SubLObject)$ic29$, (SubLObject)$ic30$);
        Structures.def_csetf((SubLObject)$ic31$, (SubLObject)$ic32$);
        Structures.def_csetf((SubLObject)$ic33$, (SubLObject)$ic34$);
        Equality.identity((SubLObject)$ic21$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g3187$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic37$));
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f26591();
    }
    
    public void initializeVariables() {
        f26592();
    }
    
    public void runTopLevelForms() {
        f26593();
    }
    
    static {
        me = (SubLFile)new module0375();
        $g3186$ = null;
        $g3187$ = null;
        $g3188$ = null;
        $ic0$ = makeSymbol("S#29754", "CYC");
        $ic1$ = makeSymbol("S#29755", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)makeSymbol("S#713", "CYC"), (SubLObject)makeSymbol("S#14781", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)makeKeyword("BINDINGS"), (SubLObject)makeKeyword("HL-MODULE"));
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("S#29762", "CYC"), (SubLObject)makeSymbol("S#29763", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#29764", "CYC"), (SubLObject)makeSymbol("S#29765", "CYC"));
        $ic6$ = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic7$ = makeSymbol("S#29761", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#29755", "CYC"));
        $ic9$ = makeSymbol("S#29762", "CYC");
        $ic10$ = makeSymbol("S#29764", "CYC");
        $ic11$ = makeSymbol("S#29763", "CYC");
        $ic12$ = makeSymbol("S#29765", "CYC");
        $ic13$ = makeKeyword("BINDINGS");
        $ic14$ = makeKeyword("HL-MODULE");
        $ic15$ = makeString("Invalid slot ~S for construction function");
        $ic16$ = makeKeyword("BEGIN");
        $ic17$ = makeSymbol("S#29766", "CYC");
        $ic18$ = makeKeyword("SLOT");
        $ic19$ = makeKeyword("END");
        $ic20$ = makeSymbol("S#29768", "CYC");
        $ic21$ = makeSymbol("S#29756", "CYC");
        $ic22$ = makeSymbol("S#29757", "CYC");
        $ic23$ = ConsesLow.list((SubLObject)makeSymbol("S#713", "CYC"), (SubLObject)makeSymbol("S#14781", "CYC"), (SubLObject)makeSymbol("S#10255", "CYC"));
        $ic24$ = ConsesLow.list((SubLObject)makeKeyword("BINDINGS"), (SubLObject)makeKeyword("HL-MODULE"), (SubLObject)makeKeyword("LISTENERS"));
        $ic25$ = ConsesLow.list((SubLObject)makeSymbol("S#29770", "CYC"), (SubLObject)makeSymbol("S#29771", "CYC"), (SubLObject)makeSymbol("S#29772", "CYC"));
        $ic26$ = ConsesLow.list((SubLObject)makeSymbol("S#29773", "CYC"), (SubLObject)makeSymbol("S#29774", "CYC"), (SubLObject)makeSymbol("S#29775", "CYC"));
        $ic27$ = makeSymbol("S#29769", "CYC");
        $ic28$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#29757", "CYC"));
        $ic29$ = makeSymbol("S#29770", "CYC");
        $ic30$ = makeSymbol("S#29773", "CYC");
        $ic31$ = makeSymbol("S#29771", "CYC");
        $ic32$ = makeSymbol("S#29774", "CYC");
        $ic33$ = makeSymbol("S#29772", "CYC");
        $ic34$ = makeSymbol("S#29775", "CYC");
        $ic35$ = makeKeyword("LISTENERS");
        $ic36$ = makeSymbol("S#29776", "CYC");
        $ic37$ = makeSymbol("S#29778", "CYC");
        $ic38$ = makeSymbol("S#26082", "CYC");
        $ic39$ = makeSymbol("S#27608", "CYC");
        $ic40$ = makeKeyword("RESTRICTION");
        $ic41$ = makeKeyword("JOIN-ORDERED");
        $ic42$ = makeKeyword("FREE");
        $ic43$ = makeSymbol("S#27357", "CYC");
        $ic44$ = makeSymbol("S#18088", "CYC");
        $ic45$ = makeSymbol("S#14902", "CYC");
        $ic46$ = makeSymbol("S#26790", "CYC");
        $ic47$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10258", "CYC"), (SubLObject)makeSymbol("S#29801", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic48$ = ConsesLow.list((SubLObject)makeKeyword("DONE"));
        $ic49$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic50$ = makeKeyword("DONE");
        $ic51$ = makeSymbol("DO-LIST");
        $ic52$ = makeSymbol("S#29783", "CYC");
        $ic53$ = makeString("No tactic found for ~S");
        $ic54$ = makeSymbol("S#28935", "CYC");
        $ic55$ = makeKeyword("SIMPLIFICATION");
    }
    
    public static final class $sX29754_native extends SubLStructNative
    {
        public SubLObject $bindings;
        public SubLObject $hl_module;
        public static final SubLStructDeclNative structDecl;
        
        public $sX29754_native() {
            this.$bindings = (SubLObject)CommonSymbols.NIL;
            this.$hl_module = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$bindings;
        }
        
        public SubLObject getField3() {
            return this.$hl_module;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$bindings = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$hl_module = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX29754_native.class, $ic0$, $ic1$, $ic2$, $ic3$, new String[] { "$bindings", "$hl_module" }, $ic4$, $ic5$, $ic6$);
        }
    }
    
    public static final class $f26544$UnaryFunction extends UnaryFunction
    {
        public $f26544$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#29755"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f26544(var3);
        }
    }
    
    public static final class $sX29756_native extends SubLStructNative
    {
        public SubLObject $bindings;
        public SubLObject $hl_module;
        public SubLObject $listeners;
        public static final SubLStructDeclNative structDecl;
        
        public $sX29756_native() {
            this.$bindings = (SubLObject)CommonSymbols.NIL;
            this.$hl_module = (SubLObject)CommonSymbols.NIL;
            this.$listeners = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$bindings;
        }
        
        public SubLObject getField3() {
            return this.$hl_module;
        }
        
        public SubLObject getField4() {
            return this.$listeners;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$bindings = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$hl_module = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$listeners = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX29756_native.class, $ic21$, $ic22$, $ic23$, $ic24$, new String[] { "$bindings", "$hl_module", "$listeners" }, $ic25$, $ic26$, $ic6$);
        }
    }
    
    public static final class $f26553$UnaryFunction extends UnaryFunction
    {
        public $f26553$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#29757"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f26553(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 184 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/