package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0746 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0746";
    public static final String myFingerPrint = "0cb91203e8365a2273d1e484b8fb782c30fadce118f600a9c40a1ff743243b7c";
    private static SubLSymbol $g5963$;
    public static SubLSymbol $g5964$;
    private static SubLSymbol $g5965$;
    public static SubLSymbol $g5966$;
    private static final SubLSymbol $ic0$;
    private static final SubLString $ic1$;
    private static final SubLString $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLList $ic6$;
    private static final SubLList $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
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
    private static final SubLString $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLString $ic40$;
    private static final SubLString $ic41$;
    private static final SubLString $ic42$;
    private static final SubLString $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLString $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLString $ic50$;
    private static final SubLString $ic51$;
    private static final SubLInteger $ic52$;
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    private static final SubLString $ic55$;
    private static final SubLString $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLString $ic61$;
    private static final SubLString $ic62$;
    private static final SubLString $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLString $ic67$;
    private static final SubLString $ic68$;
    
    public static SubLObject f46276(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)module0746.ZERO_INTEGER);
        return (SubLObject)module0746.NIL;
    }
    
    public static SubLObject f46277(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX50607_native.class) ? module0746.T : module0746.NIL);
    }
    
    public static SubLObject f46278(final SubLObject var1) {
        assert module0746.NIL != f46277(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f46279(final SubLObject var1) {
        assert module0746.NIL != f46277(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f46280(final SubLObject var1) {
        assert module0746.NIL != f46277(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f46281(final SubLObject var1) {
        assert module0746.NIL != f46277(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f46282(final SubLObject var1) {
        assert module0746.NIL != f46277(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f46283(final SubLObject var1) {
        assert module0746.NIL != f46277(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f46284(final SubLObject var1) {
        assert module0746.NIL != f46277(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f46285(final SubLObject var1, final SubLObject var4) {
        assert module0746.NIL != f46277(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f46286(final SubLObject var1, final SubLObject var4) {
        assert module0746.NIL != f46277(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f46287(final SubLObject var1, final SubLObject var4) {
        assert module0746.NIL != f46277(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f46288(final SubLObject var1, final SubLObject var4) {
        assert module0746.NIL != f46277(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f46289(final SubLObject var1, final SubLObject var4) {
        assert module0746.NIL != f46277(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f46290(final SubLObject var1, final SubLObject var4) {
        assert module0746.NIL != f46277(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f46291(final SubLObject var1, final SubLObject var4) {
        assert module0746.NIL != f46277(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f46292(SubLObject var5) {
        if (var5 == module0746.UNPROVIDED) {
            var5 = (SubLObject)module0746.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX50607_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0746.NIL, var7 = var5; module0746.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0746.$ic26$)) {
                f46285(var6, var9);
            }
            else if (var10.eql((SubLObject)module0746.$ic27$)) {
                f46286(var6, var9);
            }
            else if (var10.eql((SubLObject)module0746.$ic28$)) {
                f46287(var6, var9);
            }
            else if (var10.eql((SubLObject)module0746.$ic29$)) {
                f46288(var6, var9);
            }
            else if (var10.eql((SubLObject)module0746.$ic30$)) {
                f46289(var6, var9);
            }
            else if (var10.eql((SubLObject)module0746.$ic31$)) {
                f46290(var6, var9);
            }
            else if (var10.eql((SubLObject)module0746.$ic32$)) {
                f46291(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0746.$ic33$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f46293(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0746.$ic34$, (SubLObject)module0746.$ic35$, (SubLObject)module0746.SEVEN_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0746.$ic36$, (SubLObject)module0746.$ic26$, f46278(var11));
        Functions.funcall(var12, var11, (SubLObject)module0746.$ic36$, (SubLObject)module0746.$ic27$, f46279(var11));
        Functions.funcall(var12, var11, (SubLObject)module0746.$ic36$, (SubLObject)module0746.$ic28$, f46280(var11));
        Functions.funcall(var12, var11, (SubLObject)module0746.$ic36$, (SubLObject)module0746.$ic29$, f46281(var11));
        Functions.funcall(var12, var11, (SubLObject)module0746.$ic36$, (SubLObject)module0746.$ic30$, f46282(var11));
        Functions.funcall(var12, var11, (SubLObject)module0746.$ic36$, (SubLObject)module0746.$ic31$, f46283(var11));
        Functions.funcall(var12, var11, (SubLObject)module0746.$ic36$, (SubLObject)module0746.$ic32$, f46284(var11));
        Functions.funcall(var12, var11, (SubLObject)module0746.$ic37$, (SubLObject)module0746.$ic35$, (SubLObject)module0746.SEVEN_INTEGER);
        return var11;
    }
    
    public static SubLObject f46294(final SubLObject var11, final SubLObject var12) {
        return f46293(var11, var12);
    }
    
    public static SubLObject f46295(final SubLObject var13, final SubLObject var14, final SubLObject var15, final SubLObject var16, final SubLObject var17, final SubLObject var18, final SubLObject var19) {
        final SubLObject var20 = module0746.$g5965$.getGlobalValue();
        SubLObject var21 = (SubLObject)module0746.NIL;
        try {
            var21 = Locks.seize_lock(var20);
            SubLObject var22 = (SubLObject)module0746.NIL;
            SubLObject var23 = module0746.$g5963$.getGlobalValue();
            SubLObject var24 = (SubLObject)module0746.NIL;
            var24 = var23.first();
            while (module0746.NIL != var23) {
                if (!var16.equal(f46281(var24))) {
                    var22 = (SubLObject)ConsesLow.cons(var24, var22);
                }
                var23 = var23.rest();
                var24 = var23.first();
            }
            module0746.$g5963$.setGlobalValue(var22);
            final SubLObject var25 = f46292((SubLObject)module0746.UNPROVIDED);
            f46285(var25, var13);
            f46286(var25, var14);
            f46287(var25, var15);
            f46288(var25, var16);
            f46289(var25, var19);
            f46290(var25, var17);
            f46291(var25, var18);
            module0746.$g5963$.setGlobalValue((SubLObject)ConsesLow.cons(var25, module0746.$g5963$.getGlobalValue()));
        }
        finally {
            if (module0746.NIL != var21) {
                Locks.release_lock(var20);
            }
        }
        return (SubLObject)module0746.NIL;
    }
    
    public static SubLObject f46296(final SubLObject var17) {
        SubLObject var18 = (SubLObject)module0746.NIL;
        if (module0746.NIL == var18) {
            SubLObject var19 = module0746.$g5963$.getGlobalValue();
            SubLObject var20 = (SubLObject)module0746.NIL;
            var20 = var19.first();
            while (module0746.NIL == var18 && module0746.NIL != var19) {
                if (module0746.NIL != Strings.stringE(var17, f46283(var20), (SubLObject)module0746.UNPROVIDED, (SubLObject)module0746.UNPROVIDED, (SubLObject)module0746.UNPROVIDED, (SubLObject)module0746.UNPROVIDED)) {
                    var18 = var20;
                }
                var19 = var19.rest();
                var20 = var19.first();
            }
        }
        return var18;
    }
    
    public static SubLObject f46297(SubLObject var27, SubLObject var28) {
        if (var27 == module0746.UNPROVIDED) {
            var27 = (SubLObject)module0746.$ic40$;
        }
        if (var28 == module0746.UNPROVIDED) {
            var28 = module0746.$g5964$.getDynamicValue();
        }
        PrintLow.format((SubLObject)module0746.T, (SubLObject)module0746.$ic41$);
        SubLObject var29 = (SubLObject)module0746.ZERO_INTEGER;
        SubLObject var30 = module0746.$g5963$.getGlobalValue();
        SubLObject var31 = (SubLObject)module0746.NIL;
        var31 = var30.first();
        while (module0746.NIL != var30) {
            if (module0746.NIL != f46278(var31) && module0746.NIL != f46298(var31, (SubLObject)module0746.T, (SubLObject)module0746.T, (SubLObject)module0746.T, var27, var28)) {
                var29 = Numbers.add((SubLObject)module0746.ONE_INTEGER, var29);
            }
            var30 = var30.rest();
            var31 = var30.first();
        }
        PrintLow.format((SubLObject)module0746.T, (SubLObject)module0746.$ic42$, new SubLObject[] { Numbers.subtract(Sequences.length(module0746.$g5963$.getGlobalValue()), var29), Sequences.length(module0746.$g5963$.getGlobalValue()), var29 });
        return (SubLObject)module0746.NIL;
    }
    
    public static SubLObject f46299(SubLObject var27, SubLObject var28) {
        if (var27 == module0746.UNPROVIDED) {
            var27 = (SubLObject)module0746.$ic40$;
        }
        if (var28 == module0746.UNPROVIDED) {
            var28 = module0746.$g5964$.getDynamicValue();
        }
        PrintLow.format((SubLObject)module0746.T, (SubLObject)module0746.$ic43$);
        SubLObject var29 = (SubLObject)module0746.ZERO_INTEGER;
        SubLObject var30 = module0746.$g5963$.getGlobalValue();
        SubLObject var31 = (SubLObject)module0746.NIL;
        var31 = var30.first();
        while (module0746.NIL != var30) {
            if (module0746.NIL != f46278(var31) && module0746.NIL != f46298(var31, (SubLObject)module0746.T, (SubLObject)module0746.NIL, (SubLObject)module0746.NIL, var27, var28)) {
                var29 = Numbers.add((SubLObject)module0746.ONE_INTEGER, var29);
            }
            var30 = var30.rest();
            var31 = var30.first();
        }
        PrintLow.format((SubLObject)module0746.T, (SubLObject)module0746.$ic42$, new SubLObject[] { Numbers.subtract(Sequences.length(module0746.$g5963$.getGlobalValue()), var29), Sequences.length(module0746.$g5963$.getGlobalValue()), var29 });
        return (SubLObject)module0746.NIL;
    }
    
    public static SubLObject f46300(SubLObject var27, SubLObject var28) {
        if (var27 == module0746.UNPROVIDED) {
            var27 = (SubLObject)module0746.$ic40$;
        }
        if (var28 == module0746.UNPROVIDED) {
            var28 = module0746.$g5964$.getDynamicValue();
        }
        PrintLow.format((SubLObject)module0746.T, (SubLObject)module0746.$ic44$);
        SubLObject var29 = (SubLObject)module0746.ZERO_INTEGER;
        SubLObject var30 = module0746.$g5963$.getGlobalValue();
        SubLObject var31 = (SubLObject)module0746.NIL;
        var31 = var30.first();
        while (module0746.NIL != var30) {
            if (module0746.NIL != f46278(var31) && module0746.NIL != f46298(var31, (SubLObject)module0746.NIL, (SubLObject)module0746.T, (SubLObject)module0746.NIL, var27, var28)) {
                var29 = Numbers.add((SubLObject)module0746.ONE_INTEGER, var29);
            }
            var30 = var30.rest();
            var31 = var30.first();
        }
        PrintLow.format((SubLObject)module0746.T, (SubLObject)module0746.$ic42$, new SubLObject[] { Numbers.subtract(Sequences.length(module0746.$g5963$.getGlobalValue()), var29), Sequences.length(module0746.$g5963$.getGlobalValue()), var29 });
        return (SubLObject)module0746.NIL;
    }
    
    public static SubLObject f46301(SubLObject var27, SubLObject var28) {
        if (var27 == module0746.UNPROVIDED) {
            var27 = (SubLObject)module0746.$ic40$;
        }
        if (var28 == module0746.UNPROVIDED) {
            var28 = module0746.$g5964$.getDynamicValue();
        }
        PrintLow.format((SubLObject)module0746.T, (SubLObject)module0746.$ic45$);
        SubLObject var29 = (SubLObject)module0746.ZERO_INTEGER;
        SubLObject var30 = module0746.$g5963$.getGlobalValue();
        SubLObject var31 = (SubLObject)module0746.NIL;
        var31 = var30.first();
        while (module0746.NIL != var30) {
            if (module0746.NIL != f46278(var31) && module0746.NIL != f46298(var31, (SubLObject)module0746.NIL, (SubLObject)module0746.NIL, (SubLObject)module0746.T, var27, var28)) {
                var29 = Numbers.add((SubLObject)module0746.ONE_INTEGER, var29);
            }
            var30 = var30.rest();
            var31 = var30.first();
        }
        PrintLow.format((SubLObject)module0746.T, (SubLObject)module0746.$ic42$, new SubLObject[] { Numbers.subtract(Sequences.length(module0746.$g5963$.getGlobalValue()), var29), Sequences.length(module0746.$g5963$.getGlobalValue()), var29 });
        return (SubLObject)module0746.NIL;
    }
    
    public static SubLObject f46298(final SubLObject var30, final SubLObject var31, final SubLObject var32, final SubLObject var33, SubLObject var27, SubLObject var28) {
        if (var27 == module0746.UNPROVIDED) {
            var27 = (SubLObject)module0746.$ic40$;
        }
        if (var28 == module0746.UNPROVIDED) {
            var28 = module0746.$g5964$.getDynamicValue();
        }
        final SubLThread var34 = SubLProcess.currentSubLThread();
        if (module0746.NIL == f46277(var30)) {
            Errors.error((SubLObject)module0746.$ic46$, var30);
        }
        f46302();
        SubLObject var35 = (SubLObject)module0746.NIL;
        SubLObject var36 = (SubLObject)module0746.NIL;
        final SubLObject var37 = Sequences.cconcatenate(Functions.funcall(f46281(var30)), var27);
        try {
            var34.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var38 = Errors.$error_handler$.currentBinding(var34);
            try {
                Errors.$error_handler$.bind((SubLObject)module0746.$ic47$, var34);
                try {
                    if (module0746.NIL != Filesys.probe_file(var37)) {
                        Filesys.delete_file(var37);
                    }
                    if (module0746.NIL == var35 && module0746.NIL != var31) {
                        PrintLow.format((SubLObject)module0746.T, (SubLObject)module0746.$ic48$, var37);
                        Functions.funcall(f46278(var30), var37, var28);
                    }
                    if (module0746.NIL == var35 && module0746.NIL != var33) {
                        PrintLow.format((SubLObject)module0746.T, (SubLObject)module0746.$ic49$, var37, Functions.funcall(f46281(var30)));
                        if (module0746.NIL != Filesys.probe_file(Functions.funcall(f46281(var30)))) {
                            Filesys.delete_file(Functions.funcall(f46281(var30)));
                        }
                        Filesys.rename_file(var37, Functions.funcall(f46281(var30)));
                    }
                }
                catch (Throwable var39) {
                    Errors.handleThrowable(var39, (SubLObject)module0746.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var38, var34);
            }
        }
        catch (Throwable var40) {
            var35 = Errors.handleThrowable(var40, module0003.$g3$.getGlobalValue());
        }
        finally {
            var34.throwStack.pop();
        }
        if (module0746.NIL != var35) {
            var36 = (SubLObject)module0746.T;
            PrintLow.format((SubLObject)module0746.T, (SubLObject)module0746.$ic50$, var37);
            Errors.warn(var35);
            PrintLow.format((SubLObject)module0746.T, (SubLObject)module0746.$ic51$);
        }
        return var36;
    }
    
    public static SubLObject f46302() {
        if (module0746.NIL == Filesys.directory_p(module0236.$g2442$.getGlobalValue())) {
            Filesys.make_directory(module0236.$g2442$.getGlobalValue(), (SubLObject)module0746.NIL, (SubLObject)module0746.$ic52$);
            if (module0746.NIL == Filesys.directory_p(module0236.$g2442$.getGlobalValue())) {
                Errors.error((SubLObject)module0746.$ic53$, module0236.$g2442$.getGlobalValue());
            }
        }
        final SubLObject var41 = Sequences.cconcatenate(module0236.$g2442$.getGlobalValue(), new SubLObject[] { module0746.$ic54$, module0574.f35167(), module0746.$ic54$ });
        if (module0746.NIL == Filesys.directory_p(var41)) {
            Filesys.make_directory(var41, (SubLObject)module0746.NIL, (SubLObject)module0746.$ic52$);
            if (module0746.NIL == Filesys.directory_p(var41)) {
                Errors.error((SubLObject)module0746.$ic53$, var41);
            }
        }
        return (SubLObject)module0746.NIL;
    }
    
    public static SubLObject f46303() {
        final SubLThread var34 = SubLProcess.currentSubLThread();
        if (module0746.NIL == module0018.f971()) {
            return (SubLObject)module0746.NIL;
        }
        SubLObject var35 = module0746.$g5963$.getGlobalValue();
        SubLObject var36 = (SubLObject)module0746.NIL;
        var36 = var35.first();
        while (module0746.NIL != var35) {
            SubLObject var37 = (SubLObject)module0746.NIL;
            try {
                var34.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var38 = Errors.$error_handler$.currentBinding(var34);
                try {
                    Errors.$error_handler$.bind((SubLObject)module0746.$ic47$, var34);
                    try {
                        Functions.funcall(f46279(var36));
                    }
                    catch (Throwable var39) {
                        Errors.handleThrowable(var39, (SubLObject)module0746.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var38, var34);
                }
            }
            catch (Throwable var40) {
                var37 = Errors.handleThrowable(var40, module0003.$g3$.getGlobalValue());
            }
            finally {
                var34.throwStack.pop();
            }
            if (var37.isString()) {
                Errors.warn((SubLObject)module0746.$ic55$, var37);
            }
            var35 = var35.rest();
            var36 = var35.first();
        }
        return (SubLObject)module0746.NIL;
    }
    
    public static SubLObject f46304() {
        final SubLThread var34 = SubLProcess.currentSubLThread();
        if (module0746.NIL == module0018.f971()) {
            return (SubLObject)module0746.NIL;
        }
        if (module0746.NIL != module0746.$g5963$.getGlobalValue()) {
            PrintLow.format((SubLObject)module0746.T, (SubLObject)module0746.$ic56$);
            streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(var34));
        }
        SubLObject var35 = module0746.$g5963$.getGlobalValue();
        SubLObject var36 = (SubLObject)module0746.NIL;
        var36 = var35.first();
        while (module0746.NIL != var35) {
            SubLObject var37 = (SubLObject)module0746.NIL;
            try {
                var34.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var38 = Errors.$error_handler$.currentBinding(var34);
                try {
                    Errors.$error_handler$.bind((SubLObject)module0746.$ic47$, var34);
                    try {
                        Functions.funcall(f46280(var36));
                    }
                    catch (Throwable var39) {
                        Errors.handleThrowable(var39, (SubLObject)module0746.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var38, var34);
                }
            }
            catch (Throwable var40) {
                var37 = Errors.handleThrowable(var40, module0003.$g3$.getGlobalValue());
            }
            finally {
                var34.throwStack.pop();
            }
            if (var37.isString()) {
                Errors.warn((SubLObject)module0746.$ic55$, var37);
            }
            var35 = var35.rest();
            var36 = var35.first();
        }
        return (SubLObject)module0746.NIL;
    }
    
    public static SubLObject f46305() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0746", "f46276", "S#50609", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0746", "f46277", "S#50608", 1, 0, false);
        new $f46277$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0746", "f46278", "S#50610", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0746", "f46279", "S#50611", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0746", "f46280", "S#50612", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0746", "f46281", "S#50613", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0746", "f46282", "S#50614", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0746", "f46283", "S#50615", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0746", "f46284", "S#50616", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0746", "f46285", "S#50617", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0746", "f46286", "S#50618", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0746", "f46287", "S#50619", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0746", "f46288", "S#50620", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0746", "f46289", "S#50621", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0746", "f46290", "S#50622", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0746", "f46291", "S#50623", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0746", "f46292", "S#50624", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0746", "f46293", "S#50625", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0746", "f46294", "S#50626", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0746", "f46295", "S#50627", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0746", "f46296", "S#50628", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0746", "f46297", "GENERATE-TEST-INSTALL-ALL-FILE-BACKED-CACHES", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0746", "f46299", "S#50629", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0746", "f46300", "S#50630", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0746", "f46301", "S#50631", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0746", "f46298", "S#50632", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0746", "f46302", "S#50633", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0746", "f46303", "S#50634", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0746", "f46304", "S#50635", 0, 0, false);
        return (SubLObject)module0746.NIL;
    }
    
    public static SubLObject f46306() {
        module0746.$g5963$ = SubLFiles.deflexical("S#50636", (SubLObject)((module0746.NIL != Symbols.boundp((SubLObject)module0746.$ic0$)) ? module0746.$g5963$.getGlobalValue() : module0746.NIL));
        module0746.$g5964$ = SubLFiles.defparameter("S#50637", (SubLObject)module0746.$ic1$);
        module0746.$g5965$ = SubLFiles.deflexical("S#50638", Locks.make_lock((SubLObject)module0746.$ic2$));
        module0746.$g5966$ = SubLFiles.defconstant("S#50639", (SubLObject)module0746.$ic3$);
        return (SubLObject)module0746.NIL;
    }
    
    public static SubLObject f46307() {
        module0003.f57((SubLObject)module0746.$ic0$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0746.$g5966$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0746.$ic10$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0746.$ic11$);
        Structures.def_csetf((SubLObject)module0746.$ic12$, (SubLObject)module0746.$ic13$);
        Structures.def_csetf((SubLObject)module0746.$ic14$, (SubLObject)module0746.$ic15$);
        Structures.def_csetf((SubLObject)module0746.$ic16$, (SubLObject)module0746.$ic17$);
        Structures.def_csetf((SubLObject)module0746.$ic18$, (SubLObject)module0746.$ic19$);
        Structures.def_csetf((SubLObject)module0746.$ic20$, (SubLObject)module0746.$ic21$);
        Structures.def_csetf((SubLObject)module0746.$ic22$, (SubLObject)module0746.$ic23$);
        Structures.def_csetf((SubLObject)module0746.$ic24$, (SubLObject)module0746.$ic25$);
        Equality.identity((SubLObject)module0746.$ic3$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0746.$g5966$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0746.$ic38$));
        module0002.f38((SubLObject)module0746.$ic39$);
        f46295((SubLObject)module0746.$ic57$, (SubLObject)module0746.$ic58$, (SubLObject)module0746.$ic59$, (SubLObject)module0746.$ic60$, (SubLObject)module0746.$ic61$, (SubLObject)module0746.$ic62$, (SubLObject)module0746.$ic63$);
        f46295((SubLObject)module0746.NIL, (SubLObject)module0746.$ic64$, (SubLObject)module0746.$ic65$, (SubLObject)module0746.$ic66$, (SubLObject)module0746.$ic67$, (SubLObject)module0746.$ic62$, (SubLObject)module0746.$ic68$);
        return (SubLObject)module0746.NIL;
    }
    
    public void declareFunctions() {
        f46305();
    }
    
    public void initializeVariables() {
        f46306();
    }
    
    public void runTopLevelForms() {
        f46307();
    }
    
    static {
        me = (SubLFile)new module0746();
        module0746.$g5963$ = null;
        module0746.$g5964$ = null;
        module0746.$g5965$ = null;
        module0746.$g5966$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#50636", "CYC");
        $ic1$ = SubLObjectFactory.makeString("tmp/");
        $ic2$ = SubLObjectFactory.makeString("fbc-registration-lock");
        $ic3$ = SubLObjectFactory.makeSymbol("S#50607", "CYC");
        $ic4$ = SubLObjectFactory.makeSymbol("S#50608", "CYC");
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#50640", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50641", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50642", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50643", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50644", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#214", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#254", "CYC"));
        $ic6$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GENERATION-FUNCTION"), (SubLObject)SubLObjectFactory.makeKeyword("INITIALIZATION-FUNCTION"), (SubLObject)SubLObjectFactory.makeKeyword("RESET-FUNCTION"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT-FHT-NAME-FUNCTION"), (SubLObject)SubLObjectFactory.makeKeyword("TEST-SUITE-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("MODULE-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("SYSTEM-NAME"));
        $ic7$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#50610", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50611", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50612", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50613", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50614", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50615", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50616", "CYC"));
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#50617", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50618", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50619", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50620", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50621", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50622", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50623", "CYC"));
        $ic9$ = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic10$ = SubLObjectFactory.makeSymbol("S#50609", "CYC");
        $ic11$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#50608", "CYC"));
        $ic12$ = SubLObjectFactory.makeSymbol("S#50610", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#50617", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#50611", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#50618", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#50612", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#50619", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#50613", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#50620", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#50614", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#50621", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#50615", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("S#50622", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#50616", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#50623", "CYC");
        $ic26$ = SubLObjectFactory.makeKeyword("GENERATION-FUNCTION");
        $ic27$ = SubLObjectFactory.makeKeyword("INITIALIZATION-FUNCTION");
        $ic28$ = SubLObjectFactory.makeKeyword("RESET-FUNCTION");
        $ic29$ = SubLObjectFactory.makeKeyword("DEFAULT-FHT-NAME-FUNCTION");
        $ic30$ = SubLObjectFactory.makeKeyword("TEST-SUITE-NAME");
        $ic31$ = SubLObjectFactory.makeKeyword("MODULE-NAME");
        $ic32$ = SubLObjectFactory.makeKeyword("SYSTEM-NAME");
        $ic33$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic34$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic35$ = SubLObjectFactory.makeSymbol("S#50624", "CYC");
        $ic36$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic37$ = SubLObjectFactory.makeKeyword("END");
        $ic38$ = SubLObjectFactory.makeSymbol("S#50626", "CYC");
        $ic39$ = SubLObjectFactory.makeSymbol("GENERATE-TEST-INSTALL-ALL-FILE-BACKED-CACHES");
        $ic40$ = SubLObjectFactory.makeString(".tmp");
        $ic41$ = SubLObjectFactory.makeString("Starting file backed cache generation(s)/test(s)/install(s).~%");
        $ic42$ = SubLObjectFactory.makeString("Done installing ~A cache(s) out of ~A attempt(s) with ~A error(s).~%");
        $ic43$ = SubLObjectFactory.makeString("Starting file backed cache generation(s).~%");
        $ic44$ = SubLObjectFactory.makeString("Starting file backed cache test(s).~%");
        $ic45$ = SubLObjectFactory.makeString("Starting file backed cache install(s).~%");
        $ic46$ = SubLObjectFactory.makeString("Provided cache ~A is not a file-backed-cache-p");
        $ic47$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic48$ = SubLObjectFactory.makeString("Generating cache for file: ~A~%");
        $ic49$ = SubLObjectFactory.makeString("Moving ~A to ~A~%");
        $ic50$ = SubLObjectFactory.makeString("Encountered a problem either generating, testing or installing a file backed cache ~A.~%");
        $ic51$ = SubLObjectFactory.makeString("~%");
        $ic52$ = SubLObjectFactory.makeInteger(509);
        $ic53$ = SubLObjectFactory.makeString("~A is not a valid directory.~%");
        $ic54$ = SubLObjectFactory.makeString("/");
        $ic55$ = SubLObjectFactory.makeString("~A");
        $ic56$ = SubLObjectFactory.makeString("~&Resetting all file-backed caches.~%");
        $ic57$ = SubLObjectFactory.makeSymbol("S#50535", "CYC");
        $ic58$ = SubLObjectFactory.makeSymbol("S#50525", "CYC");
        $ic59$ = SubLObjectFactory.makeSymbol("S#50529", "CYC");
        $ic60$ = SubLObjectFactory.makeSymbol("S#50522", "CYC");
        $ic61$ = SubLObjectFactory.makeString("nl-generation-fort-cache");
        $ic62$ = SubLObjectFactory.makeString("cycl");
        $ic63$ = SubLObjectFactory.makeString("NL Fort Cache Test Suite");
        $ic64$ = SubLObjectFactory.makeSymbol("S#50155", "CYC");
        $ic65$ = SubLObjectFactory.makeSymbol("S#50156", "CYC");
        $ic66$ = SubLObjectFactory.makeSymbol("S#50161", "CYC");
        $ic67$ = SubLObjectFactory.makeString("nl-trie-subword-index");
        $ic68$ = SubLObjectFactory.makeString("NL Trie subword index");
    }
    
    public static final class $sX50607_native extends SubLStructNative
    {
        public SubLObject $generation_function;
        public SubLObject $initialization_function;
        public SubLObject $reset_function;
        public SubLObject $default_fht_name_function;
        public SubLObject $test_suite_name;
        public SubLObject $module_name;
        public SubLObject $system_name;
        private static final SubLStructDeclNative structDecl;
        
        public $sX50607_native() {
            this.$generation_function = (SubLObject)CommonSymbols.NIL;
            this.$initialization_function = (SubLObject)CommonSymbols.NIL;
            this.$reset_function = (SubLObject)CommonSymbols.NIL;
            this.$default_fht_name_function = (SubLObject)CommonSymbols.NIL;
            this.$test_suite_name = (SubLObject)CommonSymbols.NIL;
            this.$module_name = (SubLObject)CommonSymbols.NIL;
            this.$system_name = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX50607_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$generation_function;
        }
        
        public SubLObject getField3() {
            return this.$initialization_function;
        }
        
        public SubLObject getField4() {
            return this.$reset_function;
        }
        
        public SubLObject getField5() {
            return this.$default_fht_name_function;
        }
        
        public SubLObject getField6() {
            return this.$test_suite_name;
        }
        
        public SubLObject getField7() {
            return this.$module_name;
        }
        
        public SubLObject getField8() {
            return this.$system_name;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$generation_function = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$initialization_function = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$reset_function = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$default_fht_name_function = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$test_suite_name = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$module_name = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$system_name = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX50607_native.class, module0746.$ic3$, module0746.$ic4$, module0746.$ic5$, module0746.$ic6$, new String[] { "$generation_function", "$initialization_function", "$reset_function", "$default_fht_name_function", "$test_suite_name", "$module_name", "$system_name" }, module0746.$ic7$, module0746.$ic8$, module0746.$ic9$);
        }
    }
    
    public static final class $f46277$UnaryFunction extends UnaryFunction
    {
        public $f46277$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#50608"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0746.f46277(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0746.class
	Total time: 166 ms
	
	Decompiled with Procyon 0.5.32.
*/