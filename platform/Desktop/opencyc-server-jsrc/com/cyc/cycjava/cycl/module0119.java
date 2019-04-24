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
        compatibility.default_struct_print_function(var1, var2, (SubLObject)module0119.ZERO_INTEGER);
        return (SubLObject)module0119.NIL;
    }
    
    public static SubLObject f8211(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX10304_native.class) ? module0119.T : module0119.NIL);
    }
    
    public static SubLObject f8212(final SubLObject var1) {
        assert module0119.NIL != f8211(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f8213(final SubLObject var1) {
        assert module0119.NIL != f8211(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f8214(final SubLObject var1, final SubLObject var4) {
        assert module0119.NIL != f8211(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f8215(final SubLObject var1, final SubLObject var4) {
        assert module0119.NIL != f8211(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f8216(SubLObject var5) {
        if (var5 == module0119.UNPROVIDED) {
            var5 = (SubLObject)module0119.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX10304_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0119.NIL, var7 = var5; module0119.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0119.$ic13$)) {
                f8214(var6, var9);
            }
            else if (var10.eql((SubLObject)module0119.$ic14$)) {
                f8215(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0119.$ic15$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f8217(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0119.$ic16$, (SubLObject)module0119.$ic17$, (SubLObject)module0119.TWO_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0119.$ic18$, (SubLObject)module0119.$ic13$, f8212(var11));
        Functions.funcall(var12, var11, (SubLObject)module0119.$ic18$, (SubLObject)module0119.$ic14$, f8213(var11));
        Functions.funcall(var12, var11, (SubLObject)module0119.$ic19$, (SubLObject)module0119.$ic17$, (SubLObject)module0119.TWO_INTEGER);
        return var11;
    }
    
    public static SubLObject f8218(final SubLObject var11, final SubLObject var12) {
        return f8217(var11, var12);
    }
    
    public static SubLObject f8219() {
        final SubLObject var13 = f8216((SubLObject)module0119.UNPROVIDED);
        f8214(var13, Locks.make_lock((SubLObject)module0119.$ic21$));
        f8215(var13, module0067.f4880(Symbols.symbol_function((SubLObject)module0119.EQUALP), (SubLObject)module0119.UNPROVIDED));
        return var13;
    }
    
    public static SubLObject f8220(final SubLObject var14, final SubLObject var15) {
        SubLObject var17;
        final SubLObject var16 = var17 = var14.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0119.$ic22$);
        final SubLObject var18 = var17.rest();
        var17 = var17.first();
        SubLObject var19 = (SubLObject)module0119.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0119.$ic22$);
        var19 = var17.first();
        var17 = var17.rest();
        if (module0119.NIL == var17) {
            final SubLObject var20;
            var17 = (var20 = var18);
            return (SubLObject)ConsesLow.listS((SubLObject)module0119.$ic23$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0119.$ic24$, var19)), ConsesLow.append(var20, (SubLObject)module0119.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var16, (SubLObject)module0119.$ic22$);
        return (SubLObject)module0119.NIL;
    }
    
    public static SubLObject f8221(final SubLObject var14, final SubLObject var15) {
        SubLObject var17;
        final SubLObject var16 = var17 = var14.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0119.$ic25$);
        final SubLObject var18 = var17.rest();
        var17 = var17.first();
        SubLObject var19 = (SubLObject)module0119.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0119.$ic25$);
        var19 = var17.first();
        var17 = var17.rest();
        if (module0119.NIL == var17) {
            final SubLObject var20;
            var17 = (var20 = var18);
            return (SubLObject)ConsesLow.listS((SubLObject)module0119.$ic26$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0119.$ic9$, var19)), ConsesLow.append(var20, (SubLObject)module0119.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var16, (SubLObject)module0119.$ic25$);
        return (SubLObject)module0119.NIL;
    }
    
    public static SubLObject f8222() {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        return module0119.$g1470$.getDynamicValue(var24);
    }
    
    public static SubLObject f8223(final SubLObject var14, final SubLObject var15) {
        final SubLObject var16 = var14.rest();
        final SubLObject var18;
        final SubLObject var17 = var18 = var16;
        return (SubLObject)ConsesLow.listS((SubLObject)module0119.$ic23$, (SubLObject)module0119.$ic28$, ConsesLow.append(var18, (SubLObject)module0119.NIL));
    }
    
    public static SubLObject f8224() {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        return Equality.eq(module0119.$g1471$.getDynamicValue(var24), (SubLObject)module0119.$ic27$);
    }
    
    public static SubLObject f8225() {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0119.NIL == f8224());
    }
    
    public static SubLObject f8226(final SubLObject var14, final SubLObject var15) {
        SubLObject var17;
        final SubLObject var16 = var17 = var14.rest();
        SubLObject var18 = (SubLObject)module0119.NIL;
        SubLObject var19 = (SubLObject)module0119.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0119.$ic29$);
        var18 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0119.$ic29$);
        var19 = var17.first();
        var17 = var17.rest();
        if (module0119.NIL == var17) {
            return (SubLObject)ConsesLow.list((SubLObject)module0119.$ic30$, (SubLObject)module0119.$ic31$, (SubLObject)ConsesLow.list((SubLObject)module0119.$ic32$, var18, var19), (SubLObject)ConsesLow.list((SubLObject)module0119.$ic33$, var18, var19));
        }
        cdestructuring_bind.cdestructuring_bind_error(var16, (SubLObject)module0119.$ic29$);
        return (SubLObject)module0119.NIL;
    }
    
    public static SubLObject f8227(final SubLObject var14, final SubLObject var15) {
        SubLObject var17;
        final SubLObject var16 = var17 = var14.rest();
        SubLObject var18 = (SubLObject)module0119.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0119.$ic34$);
        var18 = var17.first();
        var17 = var17.rest();
        if (module0119.NIL == var17) {
            return (SubLObject)ConsesLow.list((SubLObject)module0119.$ic35$, (SubLObject)module0119.$ic31$, (SubLObject)ConsesLow.list((SubLObject)module0119.$ic36$, var18), (SubLObject)ConsesLow.list((SubLObject)module0119.$ic37$, var18));
        }
        cdestructuring_bind.cdestructuring_bind_error(var16, (SubLObject)module0119.$ic34$);
        return (SubLObject)module0119.NIL;
    }
    
    public static SubLObject f8228(final SubLObject var14, final SubLObject var15) {
        SubLObject var17;
        final SubLObject var16 = var17 = var14.rest();
        SubLObject var18 = (SubLObject)module0119.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0119.$ic38$);
        var18 = var17.first();
        var17 = var17.rest();
        if (module0119.NIL == var17) {
            return (SubLObject)ConsesLow.list((SubLObject)module0119.$ic35$, (SubLObject)module0119.$ic31$, (SubLObject)module0119.$ic39$, (SubLObject)ConsesLow.list((SubLObject)module0119.$ic40$, var18));
        }
        cdestructuring_bind.cdestructuring_bind_error(var16, (SubLObject)module0119.$ic38$);
        return (SubLObject)module0119.NIL;
    }
    
    public static SubLObject f8229(final SubLObject var14, final SubLObject var15) {
        SubLObject var17;
        final SubLObject var16 = var17 = var14.rest();
        SubLObject var18 = (SubLObject)module0119.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0119.$ic34$);
        var18 = var17.first();
        var17 = var17.rest();
        if (module0119.NIL == var17) {
            return (SubLObject)ConsesLow.list((SubLObject)module0119.$ic35$, (SubLObject)module0119.$ic31$, (SubLObject)ConsesLow.list((SubLObject)module0119.$ic35$, (SubLObject)ConsesLow.list((SubLObject)module0119.$ic41$, var18), (SubLObject)module0119.$ic42$, (SubLObject)ConsesLow.list((SubLObject)module0119.$ic43$, var18)), (SubLObject)ConsesLow.list((SubLObject)module0119.$ic44$, var18));
        }
        cdestructuring_bind.cdestructuring_bind_error(var16, (SubLObject)module0119.$ic34$);
        return (SubLObject)module0119.NIL;
    }
    
    public static SubLObject f8230(final SubLObject var14, final SubLObject var15) {
        SubLObject var17;
        final SubLObject var16 = var17 = var14.rest();
        SubLObject var18 = (SubLObject)module0119.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)module0119.$ic34$);
        var18 = var17.first();
        var17 = var17.rest();
        if (module0119.NIL == var17) {
            return (SubLObject)ConsesLow.list((SubLObject)module0119.$ic35$, (SubLObject)module0119.$ic31$, (SubLObject)ConsesLow.list((SubLObject)module0119.$ic45$, var18), (SubLObject)ConsesLow.list((SubLObject)module0119.$ic46$, var18));
        }
        cdestructuring_bind.cdestructuring_bind_error(var16, (SubLObject)module0119.$ic34$);
        return (SubLObject)module0119.NIL;
    }
    
    public static SubLObject f8231(final SubLObject var39) {
        final SubLThread var40 = SubLProcess.currentSubLThread();
        final SubLObject var41 = module0119.$g1470$.getDynamicValue(var40);
        SubLObject var42 = (SubLObject)module0119.NIL;
        final SubLObject var43 = f8212(var41);
        SubLObject var44 = (SubLObject)module0119.NIL;
        try {
            var44 = Locks.seize_lock(var43);
            final SubLObject var45 = f8213(var41);
            var42 = module0067.f4884(var45, var39, (SubLObject)module0119.NIL);
        }
        finally {
            if (module0119.NIL != var44) {
                Locks.release_lock(var43);
            }
        }
        return module0035.sublisp_boolean(var42);
    }
    
    public static SubLObject f8232(final SubLObject var39, final SubLObject var29, SubLObject var13) {
        if (var13 == module0119.UNPROVIDED) {
            var13 = module0119.$g1470$.getDynamicValue();
        }
        final SubLObject var40 = f8233(var39, var13);
        final SubLObject var41 = f8212(var13);
        SubLObject var42 = (SubLObject)module0119.NIL;
        try {
            var42 = Locks.seize_lock(var41);
            if (module0119.NIL != f8224()) {
                module0055.f4021(var29, var40);
            }
            else {
                module0059.f4284(var29, var40);
            }
        }
        finally {
            if (module0119.NIL != var42) {
                Locks.release_lock(var41);
            }
        }
        return var39;
    }
    
    public static SubLObject f8233(final SubLObject var39, SubLObject var13) {
        if (var13 == module0119.UNPROVIDED) {
            var13 = module0119.$g1470$.getDynamicValue();
        }
        SubLObject var40 = (SubLObject)module0119.NIL;
        final SubLObject var41 = f8212(var13);
        SubLObject var42 = (SubLObject)module0119.NIL;
        try {
            var42 = Locks.seize_lock(var41);
            final SubLObject var43 = f8213(var13);
            var40 = module0067.f4884(var43, var39, (SubLObject)module0119.UNPROVIDED);
            if (module0119.NIL == ((module0119.NIL != f8224()) ? module0055.f4006(var40) : module0059.f4273(var40))) {
                var40 = ((module0119.NIL != f8224()) ? module0055.f4017() : module0059.f4283((SubLObject)module0119.$ic47$));
                module0067.f4886(var43, var39, var40);
            }
        }
        finally {
            if (module0119.NIL != var42) {
                Locks.release_lock(var41);
            }
        }
        return var40;
    }
    
    public static SubLObject f8234(final SubLObject var39, SubLObject var13) {
        if (var13 == module0119.UNPROVIDED) {
            var13 = module0119.$g1470$.getDynamicValue();
        }
        SubLObject var40 = (SubLObject)module0119.NIL;
        final SubLObject var41 = f8212(var13);
        SubLObject var42 = (SubLObject)module0119.NIL;
        try {
            var42 = Locks.seize_lock(var41);
            final SubLObject var43 = f8213(var13);
            var40 = module0067.f4884(var43, var39, (SubLObject)module0119.UNPROVIDED);
            if (module0119.NIL != ((module0119.NIL != f8224()) ? module0055.f4006(var40) : module0059.f4273(var40))) {
                module0067.f4887(var43, var39);
            }
        }
        finally {
            if (module0119.NIL != var42) {
                Locks.release_lock(var41);
            }
        }
        return var40;
    }
    
    public static SubLObject f8235(final SubLObject var39) {
        final SubLThread var40 = SubLProcess.currentSubLThread();
        final SubLObject var41 = module0119.$g1470$.getDynamicValue(var40);
        SubLObject var42 = (SubLObject)module0119.NIL;
        SubLObject var43 = (SubLObject)module0119.NIL;
        final SubLObject var44 = f8212(var41);
        SubLObject var45 = (SubLObject)module0119.NIL;
        try {
            var45 = Locks.seize_lock(var44);
            final SubLObject var46 = f8213(var41);
            var43 = module0067.f4884(var46, var39, (SubLObject)module0119.UNPROVIDED);
        }
        finally {
            if (module0119.NIL != var45) {
                Locks.release_lock(var44);
            }
        }
        if (module0119.NIL != ((module0119.NIL != f8224()) ? module0055.f4006(var43) : module0059.f4273(var43))) {
            if (module0119.NIL != f8224()) {
                final SubLObject var52_53 = f8212(var41);
                SubLObject var54_55 = (SubLObject)module0119.NIL;
                try {
                    var54_55 = Locks.seize_lock(var52_53);
                    var42 = (SubLObject)((module0119.NIL != f8224()) ? ((module0119.NIL != module0055.f4019(var43)) ? module0119.$ic42$ : module0055.f4023(var43)) : module0059.f4285(var43));
                }
                finally {
                    if (module0119.NIL != var54_55) {
                        Locks.release_lock(var52_53);
                    }
                }
            }
            else {
                var42 = (SubLObject)((module0119.NIL != f8224()) ? ((module0119.NIL != module0055.f4019(var43)) ? module0119.$ic42$ : module0055.f4023(var43)) : module0059.f4285(var43));
            }
        }
        return var42;
    }
    
    public static SubLObject f8236(SubLObject var2) {
        if (var2 == module0119.UNPROVIDED) {
            var2 = (SubLObject)module0119.T;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0119.$g1470$.getDynamicValue(var3);
        final SubLObject var5 = f8213(var4);
        SubLObject var6;
        for (var6 = module0066.f4838(module0067.f4891(var5)); module0119.NIL == module0066.f4841(var6); var6 = module0066.f4840(var6)) {
            var3.resetMultipleValues();
            final SubLObject var7 = module0066.f4839(var6);
            final SubLObject var8 = var3.secondMultipleValue();
            var3.resetMultipleValues();
            PrintLow.format(var2, (SubLObject)module0119.$ic48$, var7);
            PrintLow.format(var2, (SubLObject)module0119.$ic49$, (module0119.NIL != f8224()) ? module0055.f4016(var8) : module0059.f4288(var8));
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
        return (SubLObject)module0119.NIL;
    }
    
    public static SubLObject f8238() {
        module0119.$g1469$ = SubLFiles.defconstant("S#10332", (SubLObject)module0119.$ic0$);
        module0119.$g1470$ = SubLFiles.defparameter("S#10333", f8219());
        module0119.$g1471$ = SubLFiles.defparameter("S#10334", (SubLObject)module0119.$ic27$);
        return (SubLObject)module0119.NIL;
    }
    
    public static SubLObject f8239() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0119.$g1469$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0119.$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0119.$ic8$);
        Structures.def_csetf((SubLObject)module0119.$ic9$, (SubLObject)module0119.$ic10$);
        Structures.def_csetf((SubLObject)module0119.$ic11$, (SubLObject)module0119.$ic12$);
        Equality.identity((SubLObject)module0119.$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0119.$g1469$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0119.$ic20$));
        return (SubLObject)module0119.NIL;
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
        module0119.$g1469$ = null;
        module0119.$g1470$ = null;
        module0119.$g1471$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#10304", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#10305", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#672", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10335", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LOCK"), (SubLObject)SubLObjectFactory.makeKeyword("MAILBOXES"));
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10307", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10308", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10309", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10310", "CYC"));
        $ic6$ = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic7$ = SubLObjectFactory.makeSymbol("S#10306", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#10305", "CYC"));
        $ic9$ = SubLObjectFactory.makeSymbol("S#10307", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#10309", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#10308", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#10310", "CYC");
        $ic13$ = SubLObjectFactory.makeKeyword("LOCK");
        $ic14$ = SubLObjectFactory.makeKeyword("MAILBOXES");
        $ic15$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic16$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic17$ = SubLObjectFactory.makeSymbol("S#10311", "CYC");
        $ic18$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic19$ = SubLObjectFactory.makeKeyword("END");
        $ic20$ = SubLObjectFactory.makeSymbol("S#10313", "CYC");
        $ic21$ = SubLObjectFactory.makeString("Message Mailbox Suite");
        $ic22$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10336", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic23$ = SubLObjectFactory.makeSymbol("CLET");
        $ic24$ = SubLObjectFactory.makeSymbol("S#10333", "CYC");
        $ic25$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10337", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic26$ = SubLObjectFactory.makeSymbol("WITH-LOCK-HELD");
        $ic27$ = SubLObjectFactory.makeKeyword("NON-BLOCKING");
        $ic28$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10334", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("BLOCKING")));
        $ic29$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#295", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10336", "CYC"));
        $ic30$ = SubLObjectFactory.makeSymbol("PIF");
        $ic31$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10319", "CYC"));
        $ic32$ = SubLObjectFactory.makeSymbol("S#4670", "CYC");
        $ic33$ = SubLObjectFactory.makeSymbol("S#5767", "CYC");
        $ic34$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10336", "CYC"));
        $ic35$ = SubLObjectFactory.makeSymbol("FIF");
        $ic36$ = SubLObjectFactory.makeSymbol("S#690", "CYC");
        $ic37$ = SubLObjectFactory.makeSymbol("S#5676", "CYC");
        $ic38$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"));
        $ic39$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#4669", "CYC"));
        $ic40$ = SubLObjectFactory.makeSymbol("S#5766", "CYC");
        $ic41$ = SubLObjectFactory.makeSymbol("S#4672", "CYC");
        $ic42$ = SubLObjectFactory.makeString("");
        $ic43$ = SubLObjectFactory.makeSymbol("S#4671", "CYC");
        $ic44$ = SubLObjectFactory.makeSymbol("S#5768", "CYC");
        $ic45$ = SubLObjectFactory.makeSymbol("S#5502", "CYC");
        $ic46$ = SubLObjectFactory.makeSymbol("S#5771", "CYC");
        $ic47$ = SubLObjectFactory.makeString("Message Mailbox");
        $ic48$ = SubLObjectFactory.makeString("Address ~S : ");
        $ic49$ = SubLObjectFactory.makeString("~D messages.~%");
    }
    
    public static final class $sX10304_native extends SubLStructNative
    {
        public SubLObject $lock;
        public SubLObject $mailboxes;
        private static final SubLStructDeclNative structDecl;
        
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
            structDecl = Structures.makeStructDeclNative((Class)$sX10304_native.class, module0119.$ic0$, module0119.$ic1$, module0119.$ic2$, module0119.$ic3$, new String[] { "$lock", "$mailboxes" }, module0119.$ic4$, module0119.$ic5$, module0119.$ic6$);
        }
    }
    
    public static final class $f8211$UnaryFunction extends UnaryFunction
    {
        public $f8211$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#10305"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0119.f8211(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0119.class
	Total time: 140 ms
	
	Decompiled with Procyon 0.5.32.
*/