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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
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

public final class module0119 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0119";
    public static final String myFingerPrint = "26e3e349aaa14c9cdee94a2e0cc7e179d893dce78516684832a93afe8749de0f";
    public static SubLSymbol $g1469$;
    public static SubLSymbol $g1470$;
    public static SubLSymbol $g1471$;
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
    private static final SubLString $ic21$;
    private static final SubLList $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLList $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLList $ic28$;
    private static final SubLList $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLList $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLList $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLList $ic38$;
    private static final SubLList $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLString $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLString $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    
    public static SubLObject f8210(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8211(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX10304_native.class) ? T : NIL);
    }
    
    public static SubLObject f8212(final SubLObject var1) {
        assert NIL != f8211(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f8213(final SubLObject var1) {
        assert NIL != f8211(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f8214(final SubLObject var1, final SubLObject var4) {
        assert NIL != f8211(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f8215(final SubLObject var1, final SubLObject var4) {
        assert NIL != f8211(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f8216(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX10304_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic13$)) {
                f8214(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic14$)) {
                f8215(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic15$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f8217(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic16$, (SubLObject)$ic17$, (SubLObject)TWO_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic18$, (SubLObject)$ic13$, f8212(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic18$, (SubLObject)$ic14$, f8213(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic19$, (SubLObject)$ic17$, (SubLObject)TWO_INTEGER);
        return var11;
    }
    
    public static SubLObject f8218(final SubLObject var11, final SubLObject var12) {
        return f8217(var11, var12);
    }
    
    public static SubLObject f8219() {
        final SubLObject var13 = f8216((SubLObject)UNPROVIDED);
        f8214(var13, Locks.make_lock((SubLObject)$ic21$));
        f8215(var13, module0067.f4880(Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)UNPROVIDED));
        return var13;
    }
    
    public static SubLObject f8220(final SubLObject var14, final SubLObject var15) {
        SubLObject var17;
        final SubLObject var16 = var17 = var14.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic22$);
        final SubLObject var18 = var17.rest();
        var17 = var17.first();
        SubLObject var19 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic22$);
        var19 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            final SubLObject var20;
            var17 = (var20 = var18);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic23$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic24$, var19)), ConsesLow.append(var20, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var16, (SubLObject)$ic22$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8221(final SubLObject var14, final SubLObject var15) {
        SubLObject var17;
        final SubLObject var16 = var17 = var14.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic25$);
        final SubLObject var18 = var17.rest();
        var17 = var17.first();
        SubLObject var19 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic25$);
        var19 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            final SubLObject var20;
            var17 = (var20 = var18);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic26$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic9$, var19)), ConsesLow.append(var20, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var16, (SubLObject)$ic25$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8222() {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        return $g1470$.getDynamicValue(var24);
    }
    
    public static SubLObject f8223(final SubLObject var14, final SubLObject var15) {
        final SubLObject var16 = var14.rest();
        final SubLObject var18;
        final SubLObject var17 = var18 = var16;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic23$, (SubLObject)$ic28$, ConsesLow.append(var18, (SubLObject)NIL));
    }
    
    public static SubLObject f8224() {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        return Equality.eq($g1471$.getDynamicValue(var24), (SubLObject)$ic27$);
    }
    
    public static SubLObject f8225() {
        return (SubLObject)makeBoolean(NIL == f8224());
    }
    
    public static SubLObject f8226(final SubLObject var14, final SubLObject var15) {
        SubLObject var17;
        final SubLObject var16 = var17 = var14.rest();
        SubLObject var18 = (SubLObject)NIL;
        SubLObject var19 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic29$);
        var18 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic29$);
        var19 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic30$, (SubLObject)$ic31$, (SubLObject)ConsesLow.list((SubLObject)$ic32$, var18, var19), (SubLObject)ConsesLow.list((SubLObject)$ic33$, var18, var19));
        }
        cdestructuring_bind.cdestructuring_bind_error(var16, (SubLObject)$ic29$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8227(final SubLObject var14, final SubLObject var15) {
        SubLObject var17;
        final SubLObject var16 = var17 = var14.rest();
        SubLObject var18 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic34$);
        var18 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic35$, (SubLObject)$ic31$, (SubLObject)ConsesLow.list((SubLObject)$ic36$, var18), (SubLObject)ConsesLow.list((SubLObject)$ic37$, var18));
        }
        cdestructuring_bind.cdestructuring_bind_error(var16, (SubLObject)$ic34$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8228(final SubLObject var14, final SubLObject var15) {
        SubLObject var17;
        final SubLObject var16 = var17 = var14.rest();
        SubLObject var18 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic38$);
        var18 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic35$, (SubLObject)$ic31$, (SubLObject)$ic39$, (SubLObject)ConsesLow.list((SubLObject)$ic40$, var18));
        }
        cdestructuring_bind.cdestructuring_bind_error(var16, (SubLObject)$ic38$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8229(final SubLObject var14, final SubLObject var15) {
        SubLObject var17;
        final SubLObject var16 = var17 = var14.rest();
        SubLObject var18 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic34$);
        var18 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic35$, (SubLObject)$ic31$, (SubLObject)ConsesLow.list((SubLObject)$ic35$, (SubLObject)ConsesLow.list((SubLObject)$ic41$, var18), (SubLObject)$ic42$, (SubLObject)ConsesLow.list((SubLObject)$ic43$, var18)), (SubLObject)ConsesLow.list((SubLObject)$ic44$, var18));
        }
        cdestructuring_bind.cdestructuring_bind_error(var16, (SubLObject)$ic34$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8230(final SubLObject var14, final SubLObject var15) {
        SubLObject var17;
        final SubLObject var16 = var17 = var14.rest();
        SubLObject var18 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic34$);
        var18 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic35$, (SubLObject)$ic31$, (SubLObject)ConsesLow.list((SubLObject)$ic45$, var18), (SubLObject)ConsesLow.list((SubLObject)$ic46$, var18));
        }
        cdestructuring_bind.cdestructuring_bind_error(var16, (SubLObject)$ic34$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8231(final SubLObject var39) {
        final SubLThread var40 = SubLProcess.currentSubLThread();
        final SubLObject var41 = $g1470$.getDynamicValue(var40);
        SubLObject var42 = (SubLObject)NIL;
        final SubLObject var43 = f8212(var41);
        SubLObject var44 = (SubLObject)NIL;
        try {
            var44 = Locks.seize_lock(var43);
            final SubLObject var45 = f8213(var41);
            var42 = module0067.f4884(var45, var39, (SubLObject)NIL);
        }
        finally {
            if (NIL != var44) {
                Locks.release_lock(var43);
            }
        }
        return module0035.sublisp_boolean(var42);
    }
    
    public static SubLObject f8232(final SubLObject var39, final SubLObject var29, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = $g1470$.getDynamicValue();
        }
        final SubLObject var40 = f8233(var39, var13);
        final SubLObject var41 = f8212(var13);
        SubLObject var42 = (SubLObject)NIL;
        try {
            var42 = Locks.seize_lock(var41);
            if (NIL != f8224()) {
                module0055.f4021(var29, var40);
            }
            else {
                module0059.f4284(var29, var40);
            }
        }
        finally {
            if (NIL != var42) {
                Locks.release_lock(var41);
            }
        }
        return var39;
    }
    
    public static SubLObject f8233(final SubLObject var39, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = $g1470$.getDynamicValue();
        }
        SubLObject var40 = (SubLObject)NIL;
        final SubLObject var41 = f8212(var13);
        SubLObject var42 = (SubLObject)NIL;
        try {
            var42 = Locks.seize_lock(var41);
            final SubLObject var43 = f8213(var13);
            var40 = module0067.f4884(var43, var39, (SubLObject)UNPROVIDED);
            if (NIL == ((NIL != f8224()) ? module0055.f4006(var40) : module0059.f4273(var40))) {
                var40 = ((NIL != f8224()) ? module0055.f4017() : module0059.f4283((SubLObject)$ic47$));
                module0067.f4886(var43, var39, var40);
            }
        }
        finally {
            if (NIL != var42) {
                Locks.release_lock(var41);
            }
        }
        return var40;
    }
    
    public static SubLObject f8234(final SubLObject var39, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = $g1470$.getDynamicValue();
        }
        SubLObject var40 = (SubLObject)NIL;
        final SubLObject var41 = f8212(var13);
        SubLObject var42 = (SubLObject)NIL;
        try {
            var42 = Locks.seize_lock(var41);
            final SubLObject var43 = f8213(var13);
            var40 = module0067.f4884(var43, var39, (SubLObject)UNPROVIDED);
            if (NIL != ((NIL != f8224()) ? module0055.f4006(var40) : module0059.f4273(var40))) {
                module0067.f4887(var43, var39);
            }
        }
        finally {
            if (NIL != var42) {
                Locks.release_lock(var41);
            }
        }
        return var40;
    }
    
    public static SubLObject f8235(final SubLObject var39) {
        final SubLThread var40 = SubLProcess.currentSubLThread();
        final SubLObject var41 = $g1470$.getDynamicValue(var40);
        SubLObject var42 = (SubLObject)NIL;
        SubLObject var43 = (SubLObject)NIL;
        final SubLObject var44 = f8212(var41);
        SubLObject var45 = (SubLObject)NIL;
        try {
            var45 = Locks.seize_lock(var44);
            final SubLObject var46 = f8213(var41);
            var43 = module0067.f4884(var46, var39, (SubLObject)UNPROVIDED);
        }
        finally {
            if (NIL != var45) {
                Locks.release_lock(var44);
            }
        }
        if (NIL != ((NIL != f8224()) ? module0055.f4006(var43) : module0059.f4273(var43))) {
            if (NIL != f8224()) {
                final SubLObject var52_53 = f8212(var41);
                SubLObject var54_55 = (SubLObject)NIL;
                try {
                    var54_55 = Locks.seize_lock(var52_53);
                    var42 = (SubLObject)((NIL != f8224()) ? ((NIL != module0055.f4019(var43)) ? $ic42$ : module0055.f4023(var43)) : module0059.f4285(var43));
                }
                finally {
                    if (NIL != var54_55) {
                        Locks.release_lock(var52_53);
                    }
                }
            }
            else {
                var42 = (SubLObject)((NIL != f8224()) ? ((NIL != module0055.f4019(var43)) ? $ic42$ : module0055.f4023(var43)) : module0059.f4285(var43));
            }
        }
        return var42;
    }
    
    public static SubLObject f8236(SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)T;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = $g1470$.getDynamicValue(var3);
        final SubLObject var5 = f8213(var4);
        SubLObject var6;
        for (var6 = module0066.f4838(module0067.f4891(var5)); NIL == module0066.f4841(var6); var6 = module0066.f4840(var6)) {
            var3.resetMultipleValues();
            final SubLObject var7 = module0066.f4839(var6);
            final SubLObject var8 = var3.secondMultipleValue();
            var3.resetMultipleValues();
            PrintLow.format(var2, (SubLObject)$ic48$, var7);
            PrintLow.format(var2, (SubLObject)$ic49$, (NIL != f8224()) ? module0055.f4016(var8) : module0059.f4288(var8));
        }
        module0066.f4842(var6);
        return var2;
    }
    
    public static SubLObject f8237() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0119", "f8210", "S#10306", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0119", "f8211", "S#10305", 1, 0, false);
        new $f8211$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0119", "f8212", "S#10307", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0119", "f8213", "S#10308", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0119", "f8214", "S#10309", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0119", "f8215", "S#10310", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0119", "f8216", "S#10311", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0119", "f8217", "S#10312", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0119", "f8218", "S#10313", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0119", "f8219", "S#10314", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0119", "f8220", "S#10315");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0119", "f8221", "S#10316");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0119", "f8222", "S#10317", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0119", "f8223", "S#10318");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0119", "f8224", "S#10319", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0119", "f8225", "S#10320", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0119", "f8226", "S#10321");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0119", "f8227", "S#10322");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0119", "f8228", "S#10323");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0119", "f8229", "S#10324");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0119", "f8230", "S#10325");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0119", "f8231", "S#10326", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0119", "f8232", "S#10327", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0119", "f8233", "S#10328", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0119", "f8234", "S#10329", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0119", "f8235", "S#10330", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0119", "f8236", "S#10331", 0, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8238() {
        $g1469$ = SubLFiles.defconstant("S#10332", (SubLObject)$ic0$);
        $g1470$ = SubLFiles.defparameter("S#10333", f8219());
        $g1471$ = SubLFiles.defparameter("S#10334", (SubLObject)$ic27$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8239() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1469$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic8$);
        Structures.def_csetf((SubLObject)$ic9$, (SubLObject)$ic10$);
        Structures.def_csetf((SubLObject)$ic11$, (SubLObject)$ic12$);
        Equality.identity((SubLObject)$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1469$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic20$));
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f8237();
    }
    
    public void initializeVariables() {
        f8238();
    }
    
    public void runTopLevelForms() {
        f8239();
    }
    
    static {
        me = (SubLFile)new module0119();
        $g1469$ = null;
        $g1470$ = null;
        $g1471$ = null;
        $ic0$ = makeSymbol("S#10304", "CYC");
        $ic1$ = makeSymbol("S#10305", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)makeSymbol("S#672", "CYC"), (SubLObject)makeSymbol("S#10335", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)makeKeyword("LOCK"), (SubLObject)makeKeyword("MAILBOXES"));
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("S#10307", "CYC"), (SubLObject)makeSymbol("S#10308", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#10309", "CYC"), (SubLObject)makeSymbol("S#10310", "CYC"));
        $ic6$ = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic7$ = makeSymbol("S#10306", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#10305", "CYC"));
        $ic9$ = makeSymbol("S#10307", "CYC");
        $ic10$ = makeSymbol("S#10309", "CYC");
        $ic11$ = makeSymbol("S#10308", "CYC");
        $ic12$ = makeSymbol("S#10310", "CYC");
        $ic13$ = makeKeyword("LOCK");
        $ic14$ = makeKeyword("MAILBOXES");
        $ic15$ = makeString("Invalid slot ~S for construction function");
        $ic16$ = makeKeyword("BEGIN");
        $ic17$ = makeSymbol("S#10311", "CYC");
        $ic18$ = makeKeyword("SLOT");
        $ic19$ = makeKeyword("END");
        $ic20$ = makeSymbol("S#10313", "CYC");
        $ic21$ = makeString("Message Mailbox Suite");
        $ic22$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10336", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic23$ = makeSymbol("CLET");
        $ic24$ = makeSymbol("S#10333", "CYC");
        $ic25$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10337", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic26$ = makeSymbol("WITH-LOCK-HELD");
        $ic27$ = makeKeyword("NON-BLOCKING");
        $ic28$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10334", "CYC"), (SubLObject)makeKeyword("BLOCKING")));
        $ic29$ = ConsesLow.list((SubLObject)makeSymbol("S#295", "CYC"), (SubLObject)makeSymbol("S#10336", "CYC"));
        $ic30$ = makeSymbol("PIF");
        $ic31$ = ConsesLow.list((SubLObject)makeSymbol("S#10319", "CYC"));
        $ic32$ = makeSymbol("S#4670", "CYC");
        $ic33$ = makeSymbol("S#5767", "CYC");
        $ic34$ = ConsesLow.list((SubLObject)makeSymbol("S#10336", "CYC"));
        $ic35$ = makeSymbol("FIF");
        $ic36$ = makeSymbol("S#690", "CYC");
        $ic37$ = makeSymbol("S#5676", "CYC");
        $ic38$ = ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"));
        $ic39$ = ConsesLow.list((SubLObject)makeSymbol("S#4669", "CYC"));
        $ic40$ = makeSymbol("S#5766", "CYC");
        $ic41$ = makeSymbol("S#4672", "CYC");
        $ic42$ = makeString("");
        $ic43$ = makeSymbol("S#4671", "CYC");
        $ic44$ = makeSymbol("S#5768", "CYC");
        $ic45$ = makeSymbol("S#5502", "CYC");
        $ic46$ = makeSymbol("S#5771", "CYC");
        $ic47$ = makeString("Message Mailbox");
        $ic48$ = makeString("Address ~S : ");
        $ic49$ = makeString("~D messages.~%");
    }
    
    public static final class $sX10304_native extends SubLStructNative
    {
        public SubLObject $lock;
        public SubLObject $mailboxes;
        public static final SubLStructDeclNative structDecl;
        
        public $sX10304_native() {
            this.$lock = (SubLObject)CommonSymbols.NIL;
            this.$mailboxes = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX10304_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$lock;
        }
        
        public SubLObject getField3() {
            return this.$mailboxes;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$lock = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$mailboxes = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX10304_native.class, $ic0$, $ic1$, $ic2$, $ic3$, new String[] { "$lock", "$mailboxes" }, $ic4$, $ic5$, $ic6$);
        }
    }
    
    public static final class $f8211$UnaryFunction extends UnaryFunction
    {
        public $f8211$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#10305"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f8211(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 140 ms
	
	Decompiled with Procyon 0.5.32.
*/