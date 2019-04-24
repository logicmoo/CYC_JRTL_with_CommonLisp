package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0245 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0245";
    public static final String myFingerPrint = "aa4cbadd21758409fd330e063ba7cfae7b717f4c23247dbf5a86222c5c7008d6";
    public static SubLSymbol $g2462$;
    public static SubLSymbol $g2463$;
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
    private static final SubLString $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLInteger $ic24$;
    private static final SubLList $ic25$;
    private static final SubLList $ic26$;
    private static final SubLList $ic27$;
    private static final SubLList $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLList $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLString $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLString $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLString $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLString $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLString $ic53$;
    private static final SubLSymbol $ic54$;
    
    public static SubLObject f15807(final SubLObject var1, final SubLObject var2) {
        f15808(var1, var2, (SubLObject)module0245.ZERO_INTEGER);
        return (SubLObject)module0245.NIL;
    }
    
    public static SubLObject f15809(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX18553_native.class) ? module0245.T : module0245.NIL);
    }
    
    public static SubLObject f15810(final SubLObject var1) {
        assert module0245.NIL != f15809(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f15811(final SubLObject var1) {
        assert module0245.NIL != f15809(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f15812(final SubLObject var1, final SubLObject var4) {
        assert module0245.NIL != f15809(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f15813(final SubLObject var1, final SubLObject var4) {
        assert module0245.NIL != f15809(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f15814(SubLObject var5) {
        if (var5 == module0245.UNPROVIDED) {
            var5 = (SubLObject)module0245.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX18553_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0245.NIL, var7 = var5; module0245.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0245.$ic14$)) {
                f15812(var6, var9);
            }
            else if (var10.eql((SubLObject)module0245.$ic15$)) {
                f15813(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0245.$ic16$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f15815(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0245.$ic17$, (SubLObject)module0245.$ic18$, (SubLObject)module0245.TWO_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0245.$ic19$, (SubLObject)module0245.$ic14$, f15810(var11));
        Functions.funcall(var12, var11, (SubLObject)module0245.$ic19$, (SubLObject)module0245.$ic15$, f15811(var11));
        Functions.funcall(var12, var11, (SubLObject)module0245.$ic20$, (SubLObject)module0245.$ic18$, (SubLObject)module0245.TWO_INTEGER);
        return var11;
    }
    
    public static SubLObject f15816(final SubLObject var11, final SubLObject var12) {
        return f15815(var11, var12);
    }
    
    public static SubLObject f15817(final SubLObject var1, final SubLObject var2) {
        f15808(var1, var2, (SubLObject)module0245.ZERO_INTEGER);
        return (SubLObject)module0245.NIL;
    }
    
    public static SubLObject f15818(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX18555_native.class) ? module0245.T : module0245.NIL);
    }
    
    public static SubLObject f15819(final SubLObject var1) {
        assert module0245.NIL != f15818(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f15820(final SubLObject var1, final SubLObject var4) {
        assert module0245.NIL != f15818(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f15821(SubLObject var5) {
        if (var5 == module0245.UNPROVIDED) {
            var5 = (SubLObject)module0245.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX18555_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0245.NIL, var7 = var5; module0245.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0245.$ic33$)) {
                f15820(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0245.$ic16$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f15822(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0245.$ic17$, (SubLObject)module0245.$ic34$, (SubLObject)module0245.ONE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0245.$ic19$, (SubLObject)module0245.$ic33$, f15819(var11));
        Functions.funcall(var12, var11, (SubLObject)module0245.$ic20$, (SubLObject)module0245.$ic34$, (SubLObject)module0245.ONE_INTEGER);
        return var11;
    }
    
    public static SubLObject f15823(final SubLObject var11, final SubLObject var12) {
        return f15822(var11, var12);
    }
    
    public static SubLObject f15808(final SubLObject var16, final SubLObject var2, final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        if (module0245.NIL != print_high.$print_readably$.getDynamicValue(var18)) {
            print_high.print_not_readable(var16, var2);
        }
        else {
            streams_high.write_string((SubLObject)module0245.$ic36$, var2, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var16), new SubLObject[] { module0245.$ic37$, var2 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            PrintLow.write(Equality.pointer(var16), new SubLObject[] { module0245.$ic37$, var2, module0245.$ic38$, module0245.SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var2);
        }
        return (SubLObject)module0245.NIL;
    }
    
    public static SubLObject f15824(final SubLObject var22, final SubLObject var23) {
        final SubLObject var24 = f15814((SubLObject)module0245.UNPROVIDED);
        f15825(var24, var22, var23);
        return var24;
    }
    
    public static SubLObject f15826(final SubLObject var23) {
        final SubLObject var24 = f15821((SubLObject)module0245.UNPROVIDED);
        f15827(var24, var23);
        return var24;
    }
    
    public static SubLObject f15828(final SubLObject var22, final SubLObject var23, final SubLObject var25) {
        assert module0245.NIL != module0137.f8885(var25) : var25;
        SubLObject var26 = (SubLObject)module0245.NIL;
        var26 = ((module0245.NIL != module0244.f15779(var25)) ? f15824(var22, var23) : f15826(var23));
        return var26;
    }
    
    public static SubLObject f15829(final SubLObject var26) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0245.NIL != f15809(var26) || module0245.NIL != f15818(var26));
    }
    
    public static SubLObject f15830(final SubLObject var27, final SubLObject var28) {
        return module0035.sublisp_boolean(module0242.f15664(var27, module0137.f8955(var28)));
    }
    
    public static SubLObject f15831(final SubLObject var27, final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        if (module0245.NIL != module0136.f8864() && module0245.NIL == module0244.f15730(var28)) {
            final SubLObject var30 = module0136.$g1591$.getDynamicValue(var29);
            if (var30.eql((SubLObject)module0245.$ic40$)) {
                module0136.f8870((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic41$, var28, (SubLObject)module0245.$ic42$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var30.eql((SubLObject)module0245.$ic43$)) {
                module0136.f8871((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var28, (SubLObject)module0245.$ic42$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var30.eql((SubLObject)module0245.$ic45$)) {
                Errors.warn((SubLObject)module0245.$ic41$, var28, (SubLObject)module0245.$ic42$);
            }
            else {
                Errors.warn((SubLObject)module0245.$ic46$, module0136.$g1591$.getDynamicValue(var29));
                Errors.cerror((SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var28, (SubLObject)module0245.$ic42$);
            }
        }
        final SubLObject var31 = module0137.f8955(var28);
        final SubLObject var32 = module0242.f15664(var27, var31);
        if (module0245.NIL == var32) {
            return (SubLObject)module0245.NIL;
        }
        if (module0245.NIL != module0244.f15779(var31)) {
            return module0035.sublisp_boolean(f15810(var32));
        }
        return module0035.sublisp_boolean(f15819(var32));
    }
    
    public static SubLObject f15832(final SubLObject var29, final SubLObject var22) {
        final SubLThread var30 = SubLProcess.currentSubLThread();
        if (var22.eql(module0138.f8971())) {
            return f15810(var29);
        }
        if (var22.eql(module0138.f8974())) {
            return f15811(var29);
        }
        if (module0245.NIL != module0136.f8864() && module0245.NIL == module0138.f8968(var22)) {
            final SubLObject var31 = module0136.$g1591$.getDynamicValue(var30);
            if (var31.eql((SubLObject)module0245.$ic40$)) {
                module0136.f8870((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic41$, var22, (SubLObject)module0245.$ic47$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var31.eql((SubLObject)module0245.$ic43$)) {
                module0136.f8871((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var22, (SubLObject)module0245.$ic47$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var31.eql((SubLObject)module0245.$ic45$)) {
                Errors.warn((SubLObject)module0245.$ic41$, var22, (SubLObject)module0245.$ic47$);
            }
            else {
                Errors.warn((SubLObject)module0245.$ic46$, module0136.$g1591$.getDynamicValue(var30));
                Errors.cerror((SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var22, (SubLObject)module0245.$ic47$);
            }
        }
        return (SubLObject)module0245.NIL;
    }
    
    public static SubLObject f15833(final SubLObject var30) {
        return f15819(var30);
    }
    
    public static SubLObject f15834(final SubLObject var24, final SubLObject var22, final SubLObject var25) {
        assert module0245.NIL != module0137.f8885(var25) : var25;
        SubLObject var26 = (SubLObject)module0245.NIL;
        var26 = ((module0245.NIL != module0244.f15779(var25)) ? f15832(var24, var22) : f15833(var24));
        return var26;
    }
    
    public static SubLObject f15825(final SubLObject var29, final SubLObject var22, final SubLObject var31) {
        final SubLThread var32 = SubLProcess.currentSubLThread();
        if (module0245.NIL != module0136.f8864() && module0245.NIL == f15809(var29)) {
            final SubLObject var33 = module0136.$g1591$.getDynamicValue(var32);
            if (var33.eql((SubLObject)module0245.$ic40$)) {
                module0136.f8870((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic41$, var29, (SubLObject)module0245.$ic1$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var33.eql((SubLObject)module0245.$ic43$)) {
                module0136.f8871((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var29, (SubLObject)module0245.$ic1$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var33.eql((SubLObject)module0245.$ic45$)) {
                Errors.warn((SubLObject)module0245.$ic41$, var29, (SubLObject)module0245.$ic1$);
            }
            else {
                Errors.warn((SubLObject)module0245.$ic46$, module0136.$g1591$.getDynamicValue(var32));
                Errors.cerror((SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var29, (SubLObject)module0245.$ic1$);
            }
        }
        if (module0245.NIL != module0136.f8864() && module0245.NIL == module0138.f8968(var22)) {
            final SubLObject var33 = module0136.$g1591$.getDynamicValue(var32);
            if (var33.eql((SubLObject)module0245.$ic40$)) {
                module0136.f8870((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic41$, var22, (SubLObject)module0245.$ic47$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var33.eql((SubLObject)module0245.$ic43$)) {
                module0136.f8871((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var22, (SubLObject)module0245.$ic47$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var33.eql((SubLObject)module0245.$ic45$)) {
                Errors.warn((SubLObject)module0245.$ic41$, var22, (SubLObject)module0245.$ic47$);
            }
            else {
                Errors.warn((SubLObject)module0245.$ic46$, module0136.$g1591$.getDynamicValue(var32));
                Errors.cerror((SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var22, (SubLObject)module0245.$ic47$);
            }
        }
        if (module0245.NIL != var31 && module0245.NIL != module0136.f8864() && module0245.NIL == f15835(var31)) {
            final SubLObject var33 = module0136.$g1591$.getDynamicValue(var32);
            if (var33.eql((SubLObject)module0245.$ic40$)) {
                module0136.f8870((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic41$, var31, (SubLObject)module0245.$ic48$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var33.eql((SubLObject)module0245.$ic43$)) {
                module0136.f8871((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var31, (SubLObject)module0245.$ic48$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var33.eql((SubLObject)module0245.$ic45$)) {
                Errors.warn((SubLObject)module0245.$ic41$, var31, (SubLObject)module0245.$ic48$);
            }
            else {
                Errors.warn((SubLObject)module0245.$ic46$, module0136.$g1591$.getDynamicValue(var32));
                Errors.cerror((SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var31, (SubLObject)module0245.$ic48$);
            }
        }
        if (var22.eql(module0138.f8971())) {
            f15812(var29, var31);
        }
        else if (var22.eql(module0138.f8974())) {
            f15813(var29, var31);
        }
        return (SubLObject)module0245.NIL;
    }
    
    public static SubLObject f15827(final SubLObject var30, final SubLObject var31) {
        final SubLThread var32 = SubLProcess.currentSubLThread();
        if (module0245.NIL != module0136.f8864() && module0245.NIL == f15818(var30)) {
            final SubLObject var33 = module0136.$g1591$.getDynamicValue(var32);
            if (var33.eql((SubLObject)module0245.$ic40$)) {
                module0136.f8870((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic41$, var30, (SubLObject)module0245.$ic23$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var33.eql((SubLObject)module0245.$ic43$)) {
                module0136.f8871((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var30, (SubLObject)module0245.$ic23$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var33.eql((SubLObject)module0245.$ic45$)) {
                Errors.warn((SubLObject)module0245.$ic41$, var30, (SubLObject)module0245.$ic23$);
            }
            else {
                Errors.warn((SubLObject)module0245.$ic46$, module0136.$g1591$.getDynamicValue(var32));
                Errors.cerror((SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var30, (SubLObject)module0245.$ic23$);
            }
        }
        if (module0245.NIL != var31 && module0245.NIL != module0136.f8864() && module0245.NIL == f15835(var31)) {
            final SubLObject var33 = module0136.$g1591$.getDynamicValue(var32);
            if (var33.eql((SubLObject)module0245.$ic40$)) {
                module0136.f8870((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic41$, var31, (SubLObject)module0245.$ic48$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var33.eql((SubLObject)module0245.$ic43$)) {
                module0136.f8871((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var31, (SubLObject)module0245.$ic48$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var33.eql((SubLObject)module0245.$ic45$)) {
                Errors.warn((SubLObject)module0245.$ic41$, var31, (SubLObject)module0245.$ic48$);
            }
            else {
                Errors.warn((SubLObject)module0245.$ic46$, module0136.$g1591$.getDynamicValue(var32));
                Errors.cerror((SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var31, (SubLObject)module0245.$ic48$);
            }
        }
        f15820(var30, var31);
        return (SubLObject)module0245.NIL;
    }
    
    public static SubLObject f15836(final SubLObject var24, final SubLObject var22, final SubLObject var31, final SubLObject var25) {
        assert module0245.NIL != module0137.f8885(var25) : var25;
        if (module0245.NIL != module0244.f15779(var25)) {
            f15825(var24, var22, var31);
        }
        else {
            f15827(var24, var31);
        }
        return (SubLObject)module0245.NIL;
    }
    
    public static SubLObject f15837(final SubLObject var24, final SubLObject var22, final SubLObject var25) {
        assert module0245.NIL != module0137.f8885(var25) : var25;
        f15836(var24, var22, (SubLObject)module0245.NIL, var25);
        return (SubLObject)module0245.NIL;
    }
    
    public static SubLObject f15838(final SubLObject var32, final SubLObject var33) {
        final SubLThread var34 = SubLProcess.currentSubLThread();
        if (module0245.NIL != module0136.f8864() && module0245.NIL == f15839(var33)) {
            final SubLObject var35 = module0136.$g1591$.getDynamicValue(var34);
            if (var35.eql((SubLObject)module0245.$ic40$)) {
                module0136.f8870((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic41$, var33, (SubLObject)module0245.$ic49$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var35.eql((SubLObject)module0245.$ic43$)) {
                module0136.f8871((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var33, (SubLObject)module0245.$ic49$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var35.eql((SubLObject)module0245.$ic45$)) {
                Errors.warn((SubLObject)module0245.$ic41$, var33, (SubLObject)module0245.$ic49$);
            }
            else {
                Errors.warn((SubLObject)module0245.$ic46$, module0136.$g1591$.getDynamicValue(var34));
                Errors.cerror((SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var33, (SubLObject)module0245.$ic49$);
            }
        }
        if (module0245.NIL != module0136.f8864() && module0245.NIL == module0138.f8993(var32)) {
            final SubLObject var35 = module0136.$g1591$.getDynamicValue(var34);
            if (var35.eql((SubLObject)module0245.$ic40$)) {
                module0136.f8870((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic41$, var32, (SubLObject)module0245.$ic50$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var35.eql((SubLObject)module0245.$ic43$)) {
                module0136.f8871((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var32, (SubLObject)module0245.$ic50$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var35.eql((SubLObject)module0245.$ic45$)) {
                Errors.warn((SubLObject)module0245.$ic41$, var32, (SubLObject)module0245.$ic50$);
            }
            else {
                Errors.warn((SubLObject)module0245.$ic46$, module0136.$g1591$.getDynamicValue(var34));
                Errors.cerror((SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var32, (SubLObject)module0245.$ic50$);
            }
        }
        final SubLObject var36 = module0067.f4880(Symbols.symbol_function((SubLObject)module0245.EQUAL), (SubLObject)module0245.UNPROVIDED);
        module0067.f4886(var36, var32, var33);
        return var36;
    }
    
    public static SubLObject f15835(final SubLObject var34) {
        return module0067.f4852(var34);
    }
    
    public static SubLObject f15840(final SubLObject var23) {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        SubLObject var25;
        SubLObject var26;
        for (var25 = (SubLObject)module0245.NIL, var26 = module0066.f4838(module0067.f4891(var23)); module0245.NIL == var25 && module0245.NIL == module0066.f4841(var26); var26 = module0066.f4840(var26)) {
            var24.resetMultipleValues();
            final SubLObject var27 = module0066.f4839(var26);
            final SubLObject var28 = var24.secondMultipleValue();
            var24.resetMultipleValues();
            if (module0245.NIL != module0138.f8993(var27)) {
                if (module0245.NIL == f15841(var28)) {
                    var25 = (SubLObject)module0245.T;
                }
            }
            else {
                var25 = (SubLObject)module0245.T;
            }
        }
        module0066.f4842(var26);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0245.NIL == var25);
    }
    
    public static SubLObject f15842(final SubLObject var27, final SubLObject var22, final SubLObject var25) {
        assert module0245.NIL != module0137.f8885(var25) : var25;
        return f15834(module0242.f15664(var27, var25), var22, var25);
    }
    
    public static SubLObject f15843(final SubLObject var27, final SubLObject var22, final SubLObject var25) {
        assert module0245.NIL != module0137.f8885(var25) : var25;
        return module0067.f4902(f15842(var27, var22, var25));
    }
    
    public static SubLObject f15844(final SubLObject var23, final SubLObject var32) {
        return module0067.f4885(var23, var32, (SubLObject)module0245.UNPROVIDED);
    }
    
    public static SubLObject f15845(final SubLObject var23, final SubLObject var32, final SubLObject var33) {
        final SubLThread var34 = SubLProcess.currentSubLThread();
        if (module0245.NIL != var33) {
            if (module0245.NIL != module0136.f8864() && module0245.NIL == f15839(var33)) {
                final SubLObject var35 = module0136.$g1591$.getDynamicValue(var34);
                if (var35.eql((SubLObject)module0245.$ic40$)) {
                    module0136.f8870((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic41$, var33, (SubLObject)module0245.$ic49$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
                }
                else if (var35.eql((SubLObject)module0245.$ic43$)) {
                    module0136.f8871((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var33, (SubLObject)module0245.$ic49$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
                }
                else if (var35.eql((SubLObject)module0245.$ic45$)) {
                    Errors.warn((SubLObject)module0245.$ic41$, var33, (SubLObject)module0245.$ic49$);
                }
                else {
                    Errors.warn((SubLObject)module0245.$ic46$, module0136.$g1591$.getDynamicValue(var34));
                    Errors.cerror((SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var33, (SubLObject)module0245.$ic49$);
                }
            }
            if (module0245.NIL != module0136.f8864() && module0245.NIL == module0138.f8993(var32)) {
                final SubLObject var35 = module0136.$g1591$.getDynamicValue(var34);
                if (var35.eql((SubLObject)module0245.$ic40$)) {
                    module0136.f8870((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic41$, var32, (SubLObject)module0245.$ic50$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
                }
                else if (var35.eql((SubLObject)module0245.$ic43$)) {
                    module0136.f8871((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var32, (SubLObject)module0245.$ic50$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
                }
                else if (var35.eql((SubLObject)module0245.$ic45$)) {
                    Errors.warn((SubLObject)module0245.$ic41$, var32, (SubLObject)module0245.$ic50$);
                }
                else {
                    Errors.warn((SubLObject)module0245.$ic46$, module0136.$g1591$.getDynamicValue(var34));
                    Errors.cerror((SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var32, (SubLObject)module0245.$ic50$);
                }
            }
            module0067.f4886(var23, var32, var33);
        }
        else {
            module0067.f4887(var23, var32);
        }
        return (SubLObject)module0245.NIL;
    }
    
    public static SubLObject f15846(final SubLObject var27, final SubLObject var32, final SubLObject var22, final SubLObject var25) {
        assert module0245.NIL != module0137.f8885(var25) : var25;
        final SubLObject var33 = module0242.f15664(var27, var25);
        module0067.f4887(f15834(var33, var22, var25), var32);
        return (SubLObject)module0245.NIL;
    }
    
    public static SubLObject f15847(final SubLObject var27, final SubLObject var32, final SubLObject var25) {
        assert module0245.NIL != module0137.f8885(var25) : var25;
        SubLObject var33 = module0244.f15784(var25);
        SubLObject var34 = (SubLObject)module0245.NIL;
        var34 = var33.first();
        while (module0245.NIL != var33) {
            f15846(var27, var32, var34, var25);
            var33 = var33.rest();
            var34 = var33.first();
        }
        return (SubLObject)module0245.NIL;
    }
    
    public static SubLObject f15848(final SubLObject var23, final SubLObject var32) {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        if (module0245.NIL != module0136.f8864() && module0245.NIL == f15835(var23)) {
            final SubLObject var34 = module0136.$g1591$.getDynamicValue(var33);
            if (var34.eql((SubLObject)module0245.$ic40$)) {
                module0136.f8870((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic41$, var23, (SubLObject)module0245.$ic48$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var34.eql((SubLObject)module0245.$ic43$)) {
                module0136.f8871((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var23, (SubLObject)module0245.$ic48$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var34.eql((SubLObject)module0245.$ic45$)) {
                Errors.warn((SubLObject)module0245.$ic41$, var23, (SubLObject)module0245.$ic48$);
            }
            else {
                Errors.warn((SubLObject)module0245.$ic46$, module0136.$g1591$.getDynamicValue(var33));
                Errors.cerror((SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var23, (SubLObject)module0245.$ic48$);
            }
        }
        if (module0245.NIL != module0136.f8864() && module0245.NIL == module0138.f8993(var32)) {
            final SubLObject var34 = module0136.$g1591$.getDynamicValue(var33);
            if (var34.eql((SubLObject)module0245.$ic40$)) {
                module0136.f8870((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic41$, var32, (SubLObject)module0245.$ic50$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var34.eql((SubLObject)module0245.$ic43$)) {
                module0136.f8871((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var32, (SubLObject)module0245.$ic50$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var34.eql((SubLObject)module0245.$ic45$)) {
                Errors.warn((SubLObject)module0245.$ic41$, var32, (SubLObject)module0245.$ic50$);
            }
            else {
                Errors.warn((SubLObject)module0245.$ic46$, module0136.$g1591$.getDynamicValue(var33));
                Errors.cerror((SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var32, (SubLObject)module0245.$ic50$);
            }
        }
        module0067.f4887(var23, var32);
        return (SubLObject)module0245.NIL;
    }
    
    public static SubLObject f15849(final SubLObject var38, final SubLObject var27) {
        final SubLThread var39 = SubLProcess.currentSubLThread();
        if (module0245.NIL != module0136.f8864() && module0245.NIL == module0138.f8990(var38)) {
            final SubLObject var40 = module0136.$g1591$.getDynamicValue(var39);
            if (var40.eql((SubLObject)module0245.$ic40$)) {
                module0136.f8870((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic41$, var38, (SubLObject)module0245.$ic51$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var40.eql((SubLObject)module0245.$ic43$)) {
                module0136.f8871((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var38, (SubLObject)module0245.$ic51$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var40.eql((SubLObject)module0245.$ic45$)) {
                Errors.warn((SubLObject)module0245.$ic41$, var38, (SubLObject)module0245.$ic51$);
            }
            else {
                Errors.warn((SubLObject)module0245.$ic46$, module0136.$g1591$.getDynamicValue(var39));
                Errors.cerror((SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var38, (SubLObject)module0245.$ic51$);
            }
        }
        if (module0245.NIL != module0136.f8864() && module0245.NIL == module0138.f8992(var27)) {
            final SubLObject var40 = module0136.$g1591$.getDynamicValue(var39);
            if (var40.eql((SubLObject)module0245.$ic40$)) {
                module0136.f8870((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic41$, var27, (SubLObject)module0245.$ic52$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var40.eql((SubLObject)module0245.$ic43$)) {
                module0136.f8871((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var27, (SubLObject)module0245.$ic52$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var40.eql((SubLObject)module0245.$ic45$)) {
                Errors.warn((SubLObject)module0245.$ic41$, var27, (SubLObject)module0245.$ic52$);
            }
            else {
                Errors.warn((SubLObject)module0245.$ic46$, module0136.$g1591$.getDynamicValue(var39));
                Errors.cerror((SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var27, (SubLObject)module0245.$ic52$);
            }
        }
        final SubLObject var41 = module0067.f4880(Symbols.symbol_function((SubLObject)module0245.EQL), (SubLObject)module0245.UNPROVIDED);
        f15850(var41, var38, var27);
        return var41;
    }
    
    public static SubLObject f15839(final SubLObject var34) {
        return module0067.f4852(var34);
    }
    
    public static SubLObject f15841(final SubLObject var33) {
        final SubLThread var34 = SubLProcess.currentSubLThread();
        SubLObject var35;
        SubLObject var36;
        for (var35 = (SubLObject)module0245.NIL, var36 = module0066.f4838(module0067.f4891(var33)); module0245.NIL == var35 && module0245.NIL == module0066.f4841(var36); var36 = module0066.f4840(var36)) {
            var34.resetMultipleValues();
            final SubLObject var37 = module0066.f4839(var36);
            final SubLObject var38 = var34.secondMultipleValue();
            var34.resetMultipleValues();
            if (module0245.NIL != module0138.f8990(var37)) {
                final SubLObject var39 = var38;
                if (module0245.NIL != module0077.f5302(var39)) {
                    final SubLObject var40 = module0077.f5333(var39);
                    SubLObject var41;
                    SubLObject var42;
                    SubLObject var43;
                    for (var41 = module0032.f1741(var40), var42 = (SubLObject)module0245.NIL, var42 = module0032.f1742(var41, var40); module0245.NIL == var35 && module0245.NIL == module0032.f1744(var41, var42); var42 = module0032.f1743(var42)) {
                        var43 = module0032.f1745(var41, var42);
                        if (module0245.NIL != module0032.f1746(var42, var43) && module0245.NIL == module0138.f8992(var43)) {
                            var35 = (SubLObject)module0245.T;
                        }
                    }
                }
                else if (var39.isList()) {
                    if (module0245.NIL == var35) {
                        SubLObject var44 = var39;
                        SubLObject var45 = (SubLObject)module0245.NIL;
                        var45 = var44.first();
                        while (module0245.NIL == var35 && module0245.NIL != var44) {
                            if (module0245.NIL == module0138.f8992(var45)) {
                                var35 = (SubLObject)module0245.T;
                            }
                            var44 = var44.rest();
                            var45 = var44.first();
                        }
                    }
                }
                else {
                    Errors.error((SubLObject)module0245.$ic53$, var39);
                }
            }
            else {
                var35 = (SubLObject)module0245.T;
            }
        }
        module0066.f4842(var36);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0245.NIL == var35);
    }
    
    public static SubLObject f15851(final SubLObject var27, final SubLObject var22, final SubLObject var32, final SubLObject var25) {
        assert module0245.NIL != module0137.f8885(var25) : var25;
        return f15844(f15834(module0242.f15664(var27, var25), var22, var25), var32);
    }
    
    public static SubLObject f15852(final SubLObject var33, final SubLObject var38) {
        return module0067.f4884(var33, var38, (SubLObject)module0245.UNPROVIDED);
    }
    
    public static SubLObject f15853(final SubLObject var27, final SubLObject var38, final SubLObject var33) {
        if (module0245.NIL != module0067.f4852(var33)) {
            return module0077.f5322(var27, f15852(var33, var38));
        }
        return (SubLObject)module0245.NIL;
    }
    
    public static SubLObject f15854(final SubLObject var33) {
        SubLObject var34 = (SubLObject)module0245.NIL;
        final SubLObject var35 = module0138.$g1621$.getGlobalValue();
        if (module0245.NIL != module0077.f5302(var35)) {
            final SubLObject var36 = module0077.f5333(var35);
            SubLObject var37;
            SubLObject var38;
            SubLObject var39;
            for (var37 = module0032.f1741(var36), var38 = (SubLObject)module0245.NIL, var38 = module0032.f1742(var37, var36); module0245.NIL == module0032.f1744(var37, var38); var38 = module0032.f1743(var38)) {
                var39 = module0032.f1745(var37, var38);
                if (module0245.NIL != module0032.f1746(var38, var39) && module0245.NIL != f15852(var33, var39)) {
                    var34 = (SubLObject)module0245.T;
                }
            }
        }
        else if (var35.isList()) {
            SubLObject var40 = var35;
            SubLObject var41 = (SubLObject)module0245.NIL;
            var41 = var40.first();
            while (module0245.NIL != var40) {
                if (module0245.NIL != f15852(var33, var41)) {
                    var34 = (SubLObject)module0245.T;
                }
                var40 = var40.rest();
                var41 = var40.first();
            }
        }
        else {
            Errors.error((SubLObject)module0245.$ic53$, var35);
        }
        return var34;
    }
    
    public static SubLObject f15855(final SubLObject var33, final SubLObject var38, SubLObject var31) {
        final SubLThread var39 = SubLProcess.currentSubLThread();
        if (module0245.NIL != module0136.f8864() && module0245.NIL == f15839(var33)) {
            final SubLObject var40 = module0136.$g1591$.getDynamicValue(var39);
            if (var40.eql((SubLObject)module0245.$ic40$)) {
                module0136.f8870((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic41$, var33, (SubLObject)module0245.$ic49$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var40.eql((SubLObject)module0245.$ic43$)) {
                module0136.f8871((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var33, (SubLObject)module0245.$ic49$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var40.eql((SubLObject)module0245.$ic45$)) {
                Errors.warn((SubLObject)module0245.$ic41$, var33, (SubLObject)module0245.$ic49$);
            }
            else {
                Errors.warn((SubLObject)module0245.$ic46$, module0136.$g1591$.getDynamicValue(var39));
                Errors.cerror((SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var33, (SubLObject)module0245.$ic49$);
            }
        }
        if (module0245.NIL != module0136.f8864() && module0245.NIL == module0138.f8990(var38)) {
            final SubLObject var40 = module0136.$g1591$.getDynamicValue(var39);
            if (var40.eql((SubLObject)module0245.$ic40$)) {
                module0136.f8870((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic41$, var38, (SubLObject)module0245.$ic51$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var40.eql((SubLObject)module0245.$ic43$)) {
                module0136.f8871((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var38, (SubLObject)module0245.$ic51$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var40.eql((SubLObject)module0245.$ic45$)) {
                Errors.warn((SubLObject)module0245.$ic41$, var38, (SubLObject)module0245.$ic51$);
            }
            else {
                Errors.warn((SubLObject)module0245.$ic46$, module0136.$g1591$.getDynamicValue(var39));
                Errors.cerror((SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var38, (SubLObject)module0245.$ic51$);
            }
        }
        if (var31.isList()) {
            final SubLObject var41 = module0077.f5313(Symbols.symbol_function((SubLObject)module0245.EQUAL), (SubLObject)module0245.UNPROVIDED);
            SubLObject var42 = var31;
            SubLObject var43 = (SubLObject)module0245.NIL;
            var43 = var42.first();
            while (module0245.NIL != var42) {
                module0077.f5326(var43, var41);
                var42 = var42.rest();
                var43 = var42.first();
            }
            var31 = var41;
        }
        if (module0245.NIL != module0136.f8864() && module0245.NIL == module0138.f8991(var31)) {
            final SubLObject var40 = module0136.$g1591$.getDynamicValue(var39);
            if (var40.eql((SubLObject)module0245.$ic40$)) {
                module0136.f8870((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic41$, var31, (SubLObject)module0245.$ic54$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var40.eql((SubLObject)module0245.$ic43$)) {
                module0136.f8871((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var31, (SubLObject)module0245.$ic54$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var40.eql((SubLObject)module0245.$ic45$)) {
                Errors.warn((SubLObject)module0245.$ic41$, var31, (SubLObject)module0245.$ic54$);
            }
            else {
                Errors.warn((SubLObject)module0245.$ic46$, module0136.$g1591$.getDynamicValue(var39));
                Errors.cerror((SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var31, (SubLObject)module0245.$ic54$);
            }
        }
        module0067.f4886(var33, var38, var31);
        return (SubLObject)module0245.NIL;
    }
    
    public static SubLObject f15850(final SubLObject var33, final SubLObject var38, final SubLObject var27) {
        final SubLThread var39 = SubLProcess.currentSubLThread();
        if (module0245.NIL != module0136.f8864() && module0245.NIL == f15839(var33)) {
            final SubLObject var40 = module0136.$g1591$.getDynamicValue(var39);
            if (var40.eql((SubLObject)module0245.$ic40$)) {
                module0136.f8870((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic41$, var33, (SubLObject)module0245.$ic49$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var40.eql((SubLObject)module0245.$ic43$)) {
                module0136.f8871((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var33, (SubLObject)module0245.$ic49$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var40.eql((SubLObject)module0245.$ic45$)) {
                Errors.warn((SubLObject)module0245.$ic41$, var33, (SubLObject)module0245.$ic49$);
            }
            else {
                Errors.warn((SubLObject)module0245.$ic46$, module0136.$g1591$.getDynamicValue(var39));
                Errors.cerror((SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var33, (SubLObject)module0245.$ic49$);
            }
        }
        if (module0245.NIL != module0136.f8864() && module0245.NIL == module0138.f8990(var38)) {
            final SubLObject var40 = module0136.$g1591$.getDynamicValue(var39);
            if (var40.eql((SubLObject)module0245.$ic40$)) {
                module0136.f8870((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic41$, var38, (SubLObject)module0245.$ic51$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var40.eql((SubLObject)module0245.$ic43$)) {
                module0136.f8871((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var38, (SubLObject)module0245.$ic51$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var40.eql((SubLObject)module0245.$ic45$)) {
                Errors.warn((SubLObject)module0245.$ic41$, var38, (SubLObject)module0245.$ic51$);
            }
            else {
                Errors.warn((SubLObject)module0245.$ic46$, module0136.$g1591$.getDynamicValue(var39));
                Errors.cerror((SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var38, (SubLObject)module0245.$ic51$);
            }
        }
        if (module0245.NIL != module0136.f8864() && module0245.NIL == module0138.f8992(var27)) {
            final SubLObject var40 = module0136.$g1591$.getDynamicValue(var39);
            if (var40.eql((SubLObject)module0245.$ic40$)) {
                module0136.f8870((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic41$, var27, (SubLObject)module0245.$ic52$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var40.eql((SubLObject)module0245.$ic43$)) {
                module0136.f8871((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var27, (SubLObject)module0245.$ic52$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var40.eql((SubLObject)module0245.$ic45$)) {
                Errors.warn((SubLObject)module0245.$ic41$, var27, (SubLObject)module0245.$ic52$);
            }
            else {
                Errors.warn((SubLObject)module0245.$ic46$, module0136.$g1591$.getDynamicValue(var39));
                Errors.cerror((SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var27, (SubLObject)module0245.$ic52$);
            }
        }
        SubLObject var41 = f15852(var33, var38);
        if (module0245.NIL == var41) {
            var41 = module0077.f5313(Symbols.symbol_function((SubLObject)module0245.EQUAL), (SubLObject)module0245.UNPROVIDED);
            module0067.f4886(var33, var38, var41);
        }
        if (var41.isList()) {
            f15856(var33);
            var41 = f15852(var33, var38);
        }
        module0077.f5326(var27, var41);
        return var33;
    }
    
    public static SubLObject f15856(final SubLObject var33) {
        final SubLThread var34 = SubLProcess.currentSubLThread();
        SubLObject var35 = (SubLObject)module0245.NIL;
        SubLObject var36;
        for (var36 = module0066.f4838(module0067.f4891(var33)); module0245.NIL == module0066.f4841(var36); var36 = module0066.f4840(var36)) {
            var34.resetMultipleValues();
            final SubLObject var37 = module0066.f4839(var36);
            final SubLObject var38 = var34.secondMultipleValue();
            var34.resetMultipleValues();
            if (var38.isList()) {
                final SubLObject var39 = module0077.f5313(Symbols.symbol_function((SubLObject)module0245.EQUAL), (SubLObject)module0245.UNPROVIDED);
                SubLObject var40 = var38;
                SubLObject var41 = (SubLObject)module0245.NIL;
                var41 = var40.first();
                while (module0245.NIL != var40) {
                    module0077.f5326(var41, var39);
                    var40 = var40.rest();
                    var41 = var40.first();
                }
                var35 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var37, var39), var35);
            }
        }
        module0066.f4842(var36);
        module0067.f4881(var33);
        SubLObject var42 = var35;
        SubLObject var43 = (SubLObject)module0245.NIL;
        var43 = var42.first();
        while (module0245.NIL != var42) {
            module0067.f4886(var33, var43.first(), var43.rest());
            var42 = var42.rest();
            var43 = var42.first();
        }
        return var33;
    }
    
    public static SubLObject f15857(final SubLObject var33, final SubLObject var38, final SubLObject var27) {
        final SubLThread var39 = SubLProcess.currentSubLThread();
        if (module0245.NIL != module0136.f8864() && module0245.NIL == f15839(var33)) {
            final SubLObject var40 = module0136.$g1591$.getDynamicValue(var39);
            if (var40.eql((SubLObject)module0245.$ic40$)) {
                module0136.f8870((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic41$, var33, (SubLObject)module0245.$ic49$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var40.eql((SubLObject)module0245.$ic43$)) {
                module0136.f8871((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var33, (SubLObject)module0245.$ic49$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var40.eql((SubLObject)module0245.$ic45$)) {
                Errors.warn((SubLObject)module0245.$ic41$, var33, (SubLObject)module0245.$ic49$);
            }
            else {
                Errors.warn((SubLObject)module0245.$ic46$, module0136.$g1591$.getDynamicValue(var39));
                Errors.cerror((SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var33, (SubLObject)module0245.$ic49$);
            }
        }
        if (module0245.NIL != module0136.f8864() && module0245.NIL == module0138.f8990(var38)) {
            final SubLObject var40 = module0136.$g1591$.getDynamicValue(var39);
            if (var40.eql((SubLObject)module0245.$ic40$)) {
                module0136.f8870((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic41$, var38, (SubLObject)module0245.$ic51$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var40.eql((SubLObject)module0245.$ic43$)) {
                module0136.f8871((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var38, (SubLObject)module0245.$ic51$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var40.eql((SubLObject)module0245.$ic45$)) {
                Errors.warn((SubLObject)module0245.$ic41$, var38, (SubLObject)module0245.$ic51$);
            }
            else {
                Errors.warn((SubLObject)module0245.$ic46$, module0136.$g1591$.getDynamicValue(var39));
                Errors.cerror((SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var38, (SubLObject)module0245.$ic51$);
            }
        }
        if (module0245.NIL != module0136.f8864() && module0245.NIL == module0138.f8992(var27)) {
            final SubLObject var40 = module0136.$g1591$.getDynamicValue(var39);
            if (var40.eql((SubLObject)module0245.$ic40$)) {
                module0136.f8870((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic41$, var27, (SubLObject)module0245.$ic52$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var40.eql((SubLObject)module0245.$ic43$)) {
                module0136.f8871((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var27, (SubLObject)module0245.$ic52$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var40.eql((SubLObject)module0245.$ic45$)) {
                Errors.warn((SubLObject)module0245.$ic41$, var27, (SubLObject)module0245.$ic52$);
            }
            else {
                Errors.warn((SubLObject)module0245.$ic46$, module0136.$g1591$.getDynamicValue(var39));
                Errors.cerror((SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var27, (SubLObject)module0245.$ic52$);
            }
        }
        SubLObject var41 = f15852(var33, var38);
        if (var41.isList()) {
            if (module0245.NIL == var41) {
                return var33;
            }
            final SubLObject var42 = module0077.f5313(Symbols.symbol_function((SubLObject)module0245.EQUAL), (SubLObject)module0245.UNPROVIDED);
            module0078.f5374(var41, var42);
            var41 = var42;
            module0067.f4886(var33, var38, var41);
        }
        module0077.f5327(var27, var41);
        return var33;
    }
    
    public static SubLObject f15858(final SubLObject var33, final SubLObject var38) {
        final SubLThread var39 = SubLProcess.currentSubLThread();
        if (module0245.NIL != module0136.f8864() && module0245.NIL == f15839(var33)) {
            final SubLObject var40 = module0136.$g1591$.getDynamicValue(var39);
            if (var40.eql((SubLObject)module0245.$ic40$)) {
                module0136.f8870((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic41$, var33, (SubLObject)module0245.$ic49$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var40.eql((SubLObject)module0245.$ic43$)) {
                module0136.f8871((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var33, (SubLObject)module0245.$ic49$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var40.eql((SubLObject)module0245.$ic45$)) {
                Errors.warn((SubLObject)module0245.$ic41$, var33, (SubLObject)module0245.$ic49$);
            }
            else {
                Errors.warn((SubLObject)module0245.$ic46$, module0136.$g1591$.getDynamicValue(var39));
                Errors.cerror((SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var33, (SubLObject)module0245.$ic49$);
            }
        }
        if (module0245.NIL != module0136.f8864() && module0245.NIL == module0138.f8990(var38)) {
            final SubLObject var40 = module0136.$g1591$.getDynamicValue(var39);
            if (var40.eql((SubLObject)module0245.$ic40$)) {
                module0136.f8870((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic41$, var38, (SubLObject)module0245.$ic51$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var40.eql((SubLObject)module0245.$ic43$)) {
                module0136.f8871((SubLObject)module0245.ONE_INTEGER, (SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var38, (SubLObject)module0245.$ic51$, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED, (SubLObject)module0245.UNPROVIDED);
            }
            else if (var40.eql((SubLObject)module0245.$ic45$)) {
                Errors.warn((SubLObject)module0245.$ic41$, var38, (SubLObject)module0245.$ic51$);
            }
            else {
                Errors.warn((SubLObject)module0245.$ic46$, module0136.$g1591$.getDynamicValue(var39));
                Errors.cerror((SubLObject)module0245.$ic44$, (SubLObject)module0245.$ic41$, var38, (SubLObject)module0245.$ic51$);
            }
        }
        module0067.f4887(var33, var38);
        return (SubLObject)module0245.NIL;
    }
    
    public static SubLObject f15859() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15807", "S#18557", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15809", "S#18554", 1, 0, false);
        new $f15809$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15810", "S#18558", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15811", "S#18559", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15812", "S#18560", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15813", "S#18561", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15814", "S#18562", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15815", "S#18563", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15816", "S#18564", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15817", "S#18565", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15818", "S#18556", 1, 0, false);
        new $f15818$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15819", "S#18566", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15820", "S#18567", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15821", "S#18568", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15822", "S#18569", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15823", "S#18570", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15808", "S#18571", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15824", "S#18572", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15826", "S#18573", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15828", "S#18574", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15829", "S#18404", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15830", "S#18500", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15831", "S#16404", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15832", "S#18575", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15833", "S#18576", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15834", "S#11727", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15825", "S#18577", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15827", "S#18578", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15836", "S#18579", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15837", "S#18580", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15838", "S#18581", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15835", "S#18582", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15840", "S#18583", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15842", "S#18584", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15843", "S#18585", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15844", "S#15357", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15845", "S#18586", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15846", "S#18587", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15847", "S#18588", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15848", "S#18589", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15849", "S#18590", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15839", "S#18591", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15841", "S#18592", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15851", "S#18593", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15852", "S#15353", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15853", "S#18594", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15854", "S#15364", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15855", "S#18595", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15850", "S#18596", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15856", "S#18597", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15857", "S#18598", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0245", "f15858", "S#18599", 2, 0, false);
        return (SubLObject)module0245.NIL;
    }
    
    public static SubLObject f15860() {
        module0245.$g2462$ = SubLFiles.defconstant("S#18600", (SubLObject)module0245.$ic0$);
        module0245.$g2463$ = SubLFiles.defconstant("S#18601", (SubLObject)module0245.$ic22$);
        return (SubLObject)module0245.NIL;
    }
    
    public static SubLObject f15861() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0245.$g2462$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0245.$ic8$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0245.$ic9$);
        Structures.def_csetf((SubLObject)module0245.$ic10$, (SubLObject)module0245.$ic11$);
        Structures.def_csetf((SubLObject)module0245.$ic12$, (SubLObject)module0245.$ic13$);
        Equality.identity((SubLObject)module0245.$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0245.$g2462$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0245.$ic21$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0245.$g2463$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0245.$ic29$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0245.$ic30$);
        Structures.def_csetf((SubLObject)module0245.$ic31$, (SubLObject)module0245.$ic32$);
        Equality.identity((SubLObject)module0245.$ic22$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0245.$g2463$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0245.$ic35$));
        return (SubLObject)module0245.NIL;
    }
    
    public void declareFunctions() {
        f15859();
    }
    
    public void initializeVariables() {
        f15860();
    }
    
    public void runTopLevelForms() {
        f15861();
    }
    
    static {
        me = (SubLFile)new module0245();
        module0245.$g2462$ = null;
        module0245.$g2463$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#18553", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#18554", "CYC");
        $ic2$ = SubLObjectFactory.makeInteger(220);
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#18602", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#18603", "CYC"));
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PREDICATE-LINKS"), (SubLObject)SubLObjectFactory.makeKeyword("INVERSE-LINKS"));
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#18558", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#18559", "CYC"));
        $ic6$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#18560", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#18561", "CYC"));
        $ic7$ = SubLObjectFactory.makeSymbol("S#18571", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("S#18557", "CYC");
        $ic9$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#18554", "CYC"));
        $ic10$ = SubLObjectFactory.makeSymbol("S#18558", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#18560", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#18559", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#18561", "CYC");
        $ic14$ = SubLObjectFactory.makeKeyword("PREDICATE-LINKS");
        $ic15$ = SubLObjectFactory.makeKeyword("INVERSE-LINKS");
        $ic16$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic17$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic18$ = SubLObjectFactory.makeSymbol("S#18562", "CYC");
        $ic19$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic20$ = SubLObjectFactory.makeKeyword("END");
        $ic21$ = SubLObjectFactory.makeSymbol("S#18564", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#18555", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("S#18556", "CYC");
        $ic24$ = SubLObjectFactory.makeInteger(221);
        $ic25$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9175", "CYC"));
        $ic26$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LINKS"));
        $ic27$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#18566", "CYC"));
        $ic28$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#18567", "CYC"));
        $ic29$ = SubLObjectFactory.makeSymbol("S#18565", "CYC");
        $ic30$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#18556", "CYC"));
        $ic31$ = SubLObjectFactory.makeSymbol("S#18566", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("S#18567", "CYC");
        $ic33$ = SubLObjectFactory.makeKeyword("LINKS");
        $ic34$ = SubLObjectFactory.makeSymbol("S#18568", "CYC");
        $ic35$ = SubLObjectFactory.makeSymbol("S#18570", "CYC");
        $ic36$ = SubLObjectFactory.makeString("#<");
        $ic37$ = SubLObjectFactory.makeKeyword("STREAM");
        $ic38$ = SubLObjectFactory.makeKeyword("BASE");
        $ic39$ = SubLObjectFactory.makeSymbol("S#11099", "CYC");
        $ic40$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic41$ = SubLObjectFactory.makeString("~A is not a ~A");
        $ic42$ = SubLObjectFactory.makeSymbol("S#16712", "CYC");
        $ic43$ = SubLObjectFactory.makeKeyword("CERROR");
        $ic44$ = SubLObjectFactory.makeString("continue anyway");
        $ic45$ = SubLObjectFactory.makeKeyword("WARN");
        $ic46$ = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic47$ = SubLObjectFactory.makeSymbol("S#11216", "CYC");
        $ic48$ = SubLObjectFactory.makeSymbol("S#18582", "CYC");
        $ic49$ = SubLObjectFactory.makeSymbol("S#18591", "CYC");
        $ic50$ = SubLObjectFactory.makeSymbol("S#11240", "CYC");
        $ic51$ = SubLObjectFactory.makeSymbol("S#11238", "CYC");
        $ic52$ = SubLObjectFactory.makeSymbol("S#11210", "CYC");
        $ic53$ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $ic54$ = SubLObjectFactory.makeSymbol("S#11239", "CYC");
    }
    
    public static final class $sX18553_native extends SubLStructNative
    {
        public SubLObject $predicate_links;
        public SubLObject $inverse_links;
        private static final SubLStructDeclNative structDecl;
        
        public $sX18553_native() {
            this.$predicate_links = (SubLObject)CommonSymbols.NIL;
            this.$inverse_links = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX18553_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$predicate_links;
        }
        
        public SubLObject getField3() {
            return this.$inverse_links;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$predicate_links = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$inverse_links = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX18553_native.class, module0245.$ic0$, module0245.$ic1$, module0245.$ic3$, module0245.$ic4$, new String[] { "$predicate_links", "$inverse_links" }, module0245.$ic5$, module0245.$ic6$, module0245.$ic7$);
        }
    }
    
    public static final class $f15809$UnaryFunction extends UnaryFunction
    {
        public $f15809$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#18554"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0245.f15809(var3);
        }
    }
    
    public static final class $sX18555_native extends SubLStructNative
    {
        public SubLObject $links;
        private static final SubLStructDeclNative structDecl;
        
        public $sX18555_native() {
            this.$links = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX18555_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$links;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$links = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX18555_native.class, module0245.$ic22$, module0245.$ic23$, module0245.$ic25$, module0245.$ic26$, new String[] { "$links" }, module0245.$ic27$, module0245.$ic28$, module0245.$ic7$);
        }
    }
    
    public static final class $f15818$UnaryFunction extends UnaryFunction
    {
        public $f15818$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#18556"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0245.f15818(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0245.class
	Total time: 291 ms
	
	Decompiled with Procyon 0.5.32.
*/