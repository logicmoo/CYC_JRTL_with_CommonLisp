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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0755 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0755";
    public static final String myFingerPrint = "b54af678ed2f5fb856915dbafbe8b0707c7c4cb2092bce8b8e4a8abcfa6bd19b";
    private static SubLSymbol $g6065$;
    public static SubLSymbol $g6066$;
    public static SubLSymbol $g6067$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLString $ic2$;
    private static final SubLString $ic3$;
    private static final SubLString $ic4$;
    private static final SubLString $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLString $ic10$;
    private static final SubLString $ic11$;
    private static final SubLString $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLList $ic16$;
    private static final SubLList $ic17$;
    private static final SubLList $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLList $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLString $ic30$;
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
    private static final SubLSymbol $ic41$;
    private static final SubLList $ic42$;
    private static final SubLList $ic43$;
    private static final SubLList $ic44$;
    private static final SubLList $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLList $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLString $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLString $ic62$;
    private static final SubLString $ic63$;
    private static final SubLString $ic64$;
    private static final SubLString $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLString $ic68$;
    private static final SubLString $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLObject $ic72$;
    private static final SubLList $ic73$;
    private static final SubLObject $ic74$;
    
    public static SubLObject f47378(final SubLObject var1) {
        return f47379(var1);
    }
    
    public static SubLObject f47380() {
        return f47381((SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f47382() {
        return f47381((SubLObject)ConsesLow.list((SubLObject)$ic0$, f47383((SubLObject)UNPROVIDED), (SubLObject)$ic1$, f47384((SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f47385(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL == module0579.$g4322$.getDynamicValue(var3)) {
            if (NIL != module0578.f35470((SubLObject)THREE_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic2$, var2);
            }
        }
        else if (NIL == f47379(module0579.$g4321$.getDynamicValue(var3))) {
            if (NIL != module0578.f35470((SubLObject)THREE_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic3$, var2);
            }
        }
        else if (NIL != f47386(var2)) {
            if (NIL != module0578.f35470((SubLObject)THREE_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic4$, var2);
            }
        }
        else if (NIL != module0756.f47476(var2) || (NIL == module0202.f12691(var2, (SubLObject)UNPROVIDED) && NIL == module0206.f13438(var2))) {
            if (NIL != module0578.f35470((SubLObject)THREE_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic5$, var2);
            }
        }
        else {
            f47387(var2, (SubLObject)UNPROVIDED);
        }
        return module0579.$g4321$.getDynamicValue(var3);
    }
    
    public static SubLObject f47388() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5_6 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var8_9 = (SubLObject)NIL;
        var4 = (SubLObject)ConsesLow.list(module0579.$g4284$.getDynamicValue(var3), module0579.$g4283$.getDynamicValue(var3));
        var5_6 = var4.first();
        var5 = (SubLObject)$ic6$;
        var8_9 = var5.first();
        while (NIL != var5 || NIL != var4) {
            if ($ic7$ != var5_6) {
                f47389(var5_6, var8_9);
            }
            var4 = var4.rest();
            var5_6 = var4.first();
            var5 = var5.rest();
            var8_9 = var5.first();
        }
        return (SubLObject)$ic8$;
    }
    
    public static SubLObject f47390(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = f47391(var2);
        if (NIL != var4) {
            var3 = f47392(var4, (SubLObject)T);
        }
        return var3;
    }
    
    public static SubLObject f47393(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = f47391(var2);
        if (NIL != var4) {
            var3 = f47394(var4, (SubLObject)T);
        }
        return var3;
    }
    
    public static SubLObject f47395(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = f47391(var2);
        if (NIL != var4) {
            var3 = f47396(var4);
        }
        return var3;
    }
    
    public static SubLObject f47397(final SubLObject var12) {
        return Sequences.length(f47395(var12));
    }
    
    public static SubLObject f47386(final SubLObject var2) {
        return module0004.f104(var2, f47383((SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)$ic9$);
    }
    
    public static SubLObject f47398(final SubLObject var2, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        return module0035.sublisp_boolean(f47399(var2, var13));
    }
    
    public static SubLObject f47399(final SubLObject var2, SubLObject var13) {
        SubLObject var14 = (SubLObject)NIL;
        if (NIL != module0578.f35470((SubLObject)THREE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic10$, var2, var13);
        }
        if (NIL == module0764.f48477(var13)) {
            var13 = module0764.f48484();
        }
        if (NIL == var14) {
            SubLObject var15 = f47383((SubLObject)UNPROVIDED);
            SubLObject var16 = (SubLObject)NIL;
            var16 = var15.first();
            while (NIL == var14 && NIL != var15) {
                if (NIL != module0578.f35470((SubLObject)THREE_INTEGER)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic11$, var16);
                }
                if (NIL == f47400(var16, var2) && NIL != f47401(var16, var2, var13)) {
                    var14 = var16;
                    if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                        PrintLow.format((SubLObject)T, (SubLObject)$ic12$, new SubLObject[] { var2, f47402(var16), var16 });
                    }
                }
                var15 = var15.rest();
                var16 = var15.first();
            }
        }
        return var14;
    }
    
    public static SubLObject f47403(final SubLObject var16, final SubLObject var17) {
        f47404(var16, var17, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47405(final SubLObject var16) {
        return (SubLObject)((var16.getClass() == $sX51826_native.class) ? T : NIL);
    }
    
    public static SubLObject f47402(final SubLObject var16) {
        assert NIL != f47405(var16) : var16;
        return var16.getField2();
    }
    
    public static SubLObject f47406(final SubLObject var16) {
        assert NIL != f47405(var16) : var16;
        return var16.getField3();
    }
    
    public static SubLObject f47396(final SubLObject var16) {
        assert NIL != f47405(var16) : var16;
        return var16.getField4();
    }
    
    public static SubLObject f47407(final SubLObject var16, final SubLObject var19) {
        assert NIL != f47405(var16) : var16;
        return var16.setField2(var19);
    }
    
    public static SubLObject f47408(final SubLObject var16, final SubLObject var19) {
        assert NIL != f47405(var16) : var16;
        return var16.setField3(var19);
    }
    
    public static SubLObject f47409(final SubLObject var16, final SubLObject var19) {
        assert NIL != f47405(var16) : var16;
        return var16.setField4(var19);
    }
    
    public static SubLObject f47410(SubLObject var20) {
        if (var20 == UNPROVIDED) {
            var20 = (SubLObject)NIL;
        }
        final SubLObject var21 = (SubLObject)new $sX51826_native();
        SubLObject var22;
        SubLObject var23;
        SubLObject var24;
        SubLObject var25;
        for (var22 = (SubLObject)NIL, var22 = var20; NIL != var22; var22 = conses_high.cddr(var22)) {
            var23 = var22.first();
            var24 = conses_high.cadr(var22);
            var25 = var23;
            if (var25.eql((SubLObject)$ic27$)) {
                f47407(var21, var24);
            }
            else if (var25.eql((SubLObject)$ic28$)) {
                f47408(var21, var24);
            }
            else if (var25.eql((SubLObject)$ic29$)) {
                f47409(var21, var24);
            }
            else {
                Errors.error((SubLObject)$ic30$, var23);
            }
        }
        return var21;
    }
    
    public static SubLObject f47411(final SubLObject var26, final SubLObject var27) {
        Functions.funcall(var27, var26, (SubLObject)$ic31$, (SubLObject)$ic32$, (SubLObject)THREE_INTEGER);
        Functions.funcall(var27, var26, (SubLObject)$ic33$, (SubLObject)$ic27$, f47402(var26));
        Functions.funcall(var27, var26, (SubLObject)$ic33$, (SubLObject)$ic28$, f47406(var26));
        Functions.funcall(var27, var26, (SubLObject)$ic33$, (SubLObject)$ic29$, f47396(var26));
        Functions.funcall(var27, var26, (SubLObject)$ic34$, (SubLObject)$ic32$, (SubLObject)THREE_INTEGER);
        return var26;
    }
    
    public static SubLObject f47412(final SubLObject var26, final SubLObject var27) {
        return f47411(var26, var27);
    }
    
    public static SubLObject f47404(final SubLObject var11, final SubLObject var17, final SubLObject var28) {
        PrintLow.format(var17, (SubLObject)$ic36$, new SubLObject[] { f47402(var11), f47406(var11), Mapping.mapcar((SubLObject)$ic37$, Mapping.mapcar((SubLObject)$ic38$, module0035.remove_if_not((SubLObject)$ic39$, f47396(var11), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) });
        return var11;
    }
    
    public static SubLObject f47413(SubLObject var2, SubLObject var13) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLObject var14 = f47410((SubLObject)UNPROVIDED);
        f47414(var14, var2);
        if (NIL != var13) {
            f47415(var14, var13);
        }
        return var14;
    }
    
    public static SubLObject f47414(final SubLObject var29, final SubLObject var2) {
        f47407(var29, var2);
        return var29;
    }
    
    public static SubLObject f47415(final SubLObject var29, final SubLObject var13) {
        f47408(var29, var13);
        return var29;
    }
    
    public static SubLObject f47416(final SubLObject var29, final SubLObject var30) {
        final SubLObject var31 = f47406(var29);
        if (NIL != var31) {
            module0764.f48490(var31, var30);
        }
        else {
            f47408(var29, module0764.f48485((SubLObject)NIL, var30, (SubLObject)NIL));
        }
        return var29;
    }
    
    public static SubLObject f47417(final SubLObject var29, final SubLObject var31) {
        final SubLObject var32 = f47406(var29);
        if (NIL != var32) {
            module0764.f48491(var32, var31);
        }
        else {
            f47408(var29, module0764.f48485((SubLObject)NIL, (SubLObject)NIL, var31));
        }
        return var29;
    }
    
    public static SubLObject f47418(final SubLObject var29, final SubLObject var8) {
        final SubLObject var30 = f47406(var29);
        if (NIL != var30) {
            module0764.f48489(var30, var8);
        }
        else {
            f47408(var29, module0764.f48485(var8, (SubLObject)NIL, (SubLObject)NIL));
        }
        return var29;
    }
    
    public static SubLObject f47419(final SubLObject var29, final SubLObject var32) {
        f47409(var29, (SubLObject)ConsesLow.cons(var32, f47396(var29)));
        f47409(var29, Sequences.delete_duplicates(f47396(var29), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        return var29;
    }
    
    public static SubLObject f47420(final SubLObject var29, final SubLObject var32) {
        f47409(var29, Sequences.delete(var32, f47396(var29), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        return var29;
    }
    
    public static SubLObject f47392(final SubLObject var11, SubLObject var33) {
        if (var33 == UNPROVIDED) {
            var33 = (SubLObject)T;
        }
        if (NIL != var33 && NIL != f47421(var11)) {
            f47422(var11);
        }
        final SubLObject var34 = f47406(var11);
        return module0764.f48486(var34);
    }
    
    public static SubLObject f47421(final SubLObject var11) {
        final SubLObject var12 = f47406(var11);
        return (SubLObject)makeBoolean(NIL == module0764.f48479(module0764.f48486(var12)));
    }
    
    public static SubLObject f47422(final SubLObject var11) {
        final SubLObject var12 = f47406(var11);
        final SubLObject var13 = f47402(var11);
        final SubLObject var14 = f47423(var12, var13);
        f47415(var11, var14);
        return var11;
    }
    
    public static SubLObject f47424(final SubLObject var13, final SubLObject var2) {
        if (NIL == module0764.f48478(module0764.f48486(var13))) {
            f47423(var13, var2);
        }
        return var13;
    }
    
    public static SubLObject f47423(final SubLObject var13, final SubLObject var2) {
        module0764.f48489(var13, module0767.f48988());
        return var13;
    }
    
    public static SubLObject f47394(final SubLObject var11, SubLObject var33) {
        if (var33 == UNPROVIDED) {
            var33 = (SubLObject)T;
        }
        if (NIL != var33 && NIL != f47425(var11)) {
            f47426(var11);
        }
        final SubLObject var34 = f47406(var11);
        return module0764.f48487(var34);
    }
    
    public static SubLObject f47425(final SubLObject var11) {
        final SubLObject var12 = f47406(var11);
        return (SubLObject)makeBoolean(NIL == module0764.f48481(module0764.f48487(var12)));
    }
    
    public static SubLObject f47426(final SubLObject var11) {
        final SubLObject var12 = f47406(var11);
        final SubLObject var13 = f47402(var11);
        final SubLObject var14 = f47427(var12, var13);
        f47415(var11, var14);
        return var11;
    }
    
    public static SubLObject f47428(final SubLObject var13, final SubLObject var2) {
        if (NIL == module0764.f48480(module0764.f48487(var13))) {
            f47427(var13, var2);
        }
        return var13;
    }
    
    public static SubLObject f47427(final SubLObject var13, final SubLObject var2) {
        module0764.f48490(var13, module0767.f48986(var2));
        return var13;
    }
    
    public static SubLObject f47429(final SubLObject var11, SubLObject var33) {
        if (var33 == UNPROVIDED) {
            var33 = (SubLObject)T;
        }
        if (NIL != var33 && NIL != f47430(var11)) {
            f47431(var11);
        }
        final SubLObject var34 = f47406(var11);
        return module0764.f48488(var34);
    }
    
    public static SubLObject f47430(final SubLObject var11) {
        final SubLObject var12 = f47406(var11);
        return (SubLObject)makeBoolean(NIL == module0764.f48483(module0764.f48488(var12)));
    }
    
    public static SubLObject f47431(final SubLObject var11) {
        final SubLObject var12 = f47406(var11);
        final SubLObject var13 = f47402(var11);
        final SubLObject var14 = f47432(var12, var13);
        f47415(var11, var14);
        return var11;
    }
    
    public static SubLObject f47433(final SubLObject var13, final SubLObject var2) {
        if (NIL == module0764.f48482(module0764.f48488(var13))) {
            f47432(var13, var2);
        }
        return var13;
    }
    
    public static SubLObject f47432(final SubLObject var13, final SubLObject var2) {
        module0764.f48491(var13, module0767.f48968(var2));
        return var13;
    }
    
    public static SubLObject f47434(final SubLObject var16, final SubLObject var17) {
        f47435(var16, var17, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47379(final SubLObject var16) {
        return (SubLObject)((var16.getClass() == $sX51845_native.class) ? T : NIL);
    }
    
    public static SubLObject f47436(final SubLObject var16) {
        assert NIL != f47379(var16) : var16;
        return var16.getField2();
    }
    
    public static SubLObject f47437(final SubLObject var16) {
        assert NIL != f47379(var16) : var16;
        return var16.getField3();
    }
    
    public static SubLObject f47438(final SubLObject var16) {
        assert NIL != f47379(var16) : var16;
        return var16.getField4();
    }
    
    public static SubLObject f47439(final SubLObject var16, final SubLObject var19) {
        assert NIL != f47379(var16) : var16;
        return var16.setField2(var19);
    }
    
    public static SubLObject f47440(final SubLObject var16, final SubLObject var19) {
        assert NIL != f47379(var16) : var16;
        return var16.setField3(var19);
    }
    
    public static SubLObject f47441(final SubLObject var16, final SubLObject var19) {
        assert NIL != f47379(var16) : var16;
        return var16.setField4(var19);
    }
    
    public static SubLObject f47442(SubLObject var20) {
        if (var20 == UNPROVIDED) {
            var20 = (SubLObject)NIL;
        }
        final SubLObject var21 = (SubLObject)new $sX51845_native();
        SubLObject var22;
        SubLObject var23;
        SubLObject var24;
        SubLObject var25;
        for (var22 = (SubLObject)NIL, var22 = var20; NIL != var22; var22 = conses_high.cddr(var22)) {
            var23 = var22.first();
            var24 = conses_high.cadr(var22);
            var25 = var23;
            if (var25.eql((SubLObject)$ic0$)) {
                f47439(var21, var24);
            }
            else if (var25.eql((SubLObject)$ic1$)) {
                f47440(var21, var24);
            }
            else if (var25.eql((SubLObject)$ic55$)) {
                f47441(var21, var24);
            }
            else {
                Errors.error((SubLObject)$ic30$, var23);
            }
        }
        return var21;
    }
    
    public static SubLObject f47443(final SubLObject var26, final SubLObject var27) {
        Functions.funcall(var27, var26, (SubLObject)$ic31$, (SubLObject)$ic56$, (SubLObject)THREE_INTEGER);
        Functions.funcall(var27, var26, (SubLObject)$ic33$, (SubLObject)$ic0$, f47436(var26));
        Functions.funcall(var27, var26, (SubLObject)$ic33$, (SubLObject)$ic1$, f47437(var26));
        Functions.funcall(var27, var26, (SubLObject)$ic33$, (SubLObject)$ic55$, f47438(var26));
        Functions.funcall(var27, var26, (SubLObject)$ic34$, (SubLObject)$ic56$, (SubLObject)THREE_INTEGER);
        return var26;
    }
    
    public static SubLObject f47444(final SubLObject var26, final SubLObject var27) {
        return f47443(var26, var27);
    }
    
    public static SubLObject f47435(final SubLObject var40, final SubLObject var17, final SubLObject var28) {
        PrintLow.format(var17, (SubLObject)$ic58$, new SubLObject[] { f47438(var40), f47436(var40), f47437(var40) });
        return var40;
    }
    
    public static SubLObject f47381(SubLObject var41) {
        if (var41 == UNPROVIDED) {
            var41 = (SubLObject)NIL;
        }
        final SubLObject var42 = f47442(var41);
        f47441(var42, module0057.f4175($g6065$.getGlobalValue()));
        return var42;
    }
    
    public static SubLObject f47445(final SubLObject var11, SubLObject var42) {
        if (var42 == UNPROVIDED) {
            var42 = module0579.$g4321$.getDynamicValue();
        }
        if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic59$, f47438(var42), var11);
        }
        if (NIL == module0004.f104(var11, f47436(var42), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            final SubLObject var43 = Sequences.cconcatenate((SubLObject)$ic60$, new SubLObject[] { module0006.f205((SubLObject)$ic61$), $ic62$, module0006.f203(var11) });
            module0578.f35476(var43, (SubLObject)ConsesLow.list(EMPTY_SUBL_OBJECT_ARRAY));
        }
        f47440(var42, var11);
        if (NIL != module0578.f35470((SubLObject)TWO_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic63$, var11);
        }
        return var42;
    }
    
    public static SubLObject f47446(SubLObject var42) {
        if (var42 == UNPROVIDED) {
            var42 = module0579.$g4321$.getDynamicValue();
        }
        final SubLThread var43 = SubLProcess.currentSubLThread();
        if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic64$, f47438(var42));
        }
        f47440(var42, (SubLObject)NIL);
        return module0579.$g4321$.getDynamicValue(var43);
    }
    
    public static SubLObject f47384(SubLObject var42) {
        if (var42 == UNPROVIDED) {
            var42 = module0579.$g4321$.getDynamicValue();
        }
        final SubLObject var43 = f47437(var42);
        final SubLObject var44 = (SubLObject)((NIL != var43) ? Sequences.find_if((SubLObject)$ic39$, f47396(var43), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL);
        if (NIL != var44) {
            return var43;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47383(SubLObject var46) {
        if (var46 == UNPROVIDED) {
            var46 = module0579.$g4321$.getDynamicValue();
        }
        return (SubLObject)((NIL != f47379(var46)) ? f47436(var46) : NIL);
    }
    
    public static SubLObject f47391(final SubLObject var2) {
        return Sequences.find(var2, f47383((SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)$ic9$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f47387(final SubLObject var2, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = module0764.f48484();
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        f47447(f47413(var2, var13));
        return module0579.$g4321$.getDynamicValue(var14);
    }
    
    public static SubLObject f47448(final SubLObject var47) {
        final SubLThread var48 = SubLProcess.currentSubLThread();
        SubLObject var49 = var47;
        SubLObject var50 = (SubLObject)NIL;
        var50 = var49.first();
        while (NIL != var49) {
            f47447(var50);
            var49 = var49.rest();
            var50 = var49.first();
        }
        return module0579.$g4321$.getDynamicValue(var48);
    }
    
    public static SubLObject f47447(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        if (NIL == conses_high.member(var11, f47436(module0579.$g4321$.getDynamicValue(var12)), Symbols.symbol_function((SubLObject)EQUALP), Symbols.symbol_function((SubLObject)IDENTITY))) {
            f47439(module0579.$g4321$.getDynamicValue(var12), (SubLObject)ConsesLow.cons(var11, f47436(module0579.$g4321$.getDynamicValue(var12))));
        }
        return module0579.$g4321$.getDynamicValue(var12);
    }
    
    public static SubLObject f47449(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        final SubLObject var13 = f47383((SubLObject)UNPROVIDED);
        final SubLObject var14 = Sequences.remove(var11, var13, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != f47379(module0579.$g4321$.getDynamicValue(var12))) {
            if (NIL != module0578.f35470((SubLObject)THREE_INTEGER)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic65$, var11, module0579.$g4321$.getDynamicValue(var12));
            }
            f47439(module0579.$g4321$.getDynamicValue(var12), var14);
        }
        return module0579.$g4321$.getDynamicValue(var12);
    }
    
    public static SubLObject f47450(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = f47391(var2);
        f47449(var4);
        return module0579.$g4321$.getDynamicValue(var3);
    }
    
    public static SubLObject f47451(final SubLObject var51, SubLObject var42) {
        if (var42 == UNPROVIDED) {
            var42 = module0579.$g4321$.getDynamicValue();
        }
        if (NIL != var42) {
            SubLObject var52 = (SubLObject)NIL;
            SubLObject var53 = f47436(var42);
            SubLObject var54 = (SubLObject)NIL;
            var54 = var53.first();
            while (NIL != var53) {
                if (NIL != module0004.f104(var51, f47396(var54), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    f47420(var54, var51);
                    if (NIL != module0035.f2012(f47396(var54))) {
                        if (var54.eql(f47437(var42))) {
                            f47446(var42);
                        }
                        var52 = (SubLObject)ConsesLow.cons(var54, var52);
                    }
                }
                var53 = var53.rest();
                var54 = var53.first();
            }
            var53 = var52;
            var54 = (SubLObject)NIL;
            var54 = var53.first();
            while (NIL != var53) {
                f47449(var54);
                var53 = var53.rest();
                var54 = var53.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47389(final SubLObject var5, final SubLObject var8) {
        if (NIL != f47386(var5)) {
            final SubLObject var9 = f47391(var5);
            final SubLObject var10 = f47406(var9);
            final SubLObject var11 = (SubLObject)((NIL != module0764.f48477(var10)) ? module0764.f48486(var10) : NIL);
            if (var11.equal(var8)) {
                return (SubLObject)$ic66$;
            }
        }
        return f47452(var5, var8);
    }
    
    public static SubLObject f47452(final SubLObject var5, final SubLObject var8) {
        final SubLObject var9 = (SubLObject)NIL;
        final SubLObject var10 = (SubLObject)NIL;
        final SubLObject var11 = module0764.f48485(var8, var9, var10);
        f47387(var5, var11);
        return (SubLObject)$ic67$;
    }
    
    public static SubLObject f47401(final SubLObject var11, final SubLObject var2, final SubLObject var13) {
        if (NIL != module0751.f46661((SubLObject)UNPROVIDED)) {
            return (SubLObject)makeBoolean(NIL != f47453(var11, var2, var13) && NIL != f47454(var11, var2, var13) && NIL != f47455(var11, var2, var13));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47453(final SubLObject var11, final SubLObject var2, final SubLObject var13) {
        f47424(var13, var2);
        return Equality.eql(f47392(var11, (SubLObject)UNPROVIDED), module0764.f48486(var13));
    }
    
    public static SubLObject f47454(final SubLObject var11, final SubLObject var2, final SubLObject var13) {
        f47428(var13, var2);
        return Equality.eql(f47394(var11, (SubLObject)UNPROVIDED), module0764.f48487(var13));
    }
    
    public static SubLObject f47455(final SubLObject var11, final SubLObject var2, final SubLObject var13) {
        f47433(var13, var2);
        return module0764.f48493(f47429(var11, (SubLObject)UNPROVIDED), module0764.f48488(var13));
    }
    
    public static SubLObject f47400(final SubLObject var11, final SubLObject var2) {
        return Equality.equal(var2, f47402(var11));
    }
    
    public static SubLObject f47456(final SubLObject var32) {
        SubLObject var33 = module0756.f47487(var32, (SubLObject)UNPROVIDED);
        final SubLObject var34 = module0756.f47481(var32, (SubLObject)UNPROVIDED);
        if (NIL != module0751.f47119(var34) && NIL != module0756.f47476(var33)) {
            final SubLObject var35 = module0756.f47648(var32);
            if (NIL != module0756.f47497(var35, (SubLObject)UNPROVIDED)) {
                if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic68$, module0756.f47487(var35, (SubLObject)UNPROVIDED));
                }
                var33 = module0756.f47487(var35, (SubLObject)UNPROVIDED);
            }
        }
        if (NIL != module0758.f47939(var34) || NIL != module0206.f13438(var33)) {
            f47385(var33);
            final SubLObject var36 = f47391(var33);
            if (NIL != var36) {
                f47419(var36, var32);
                if (NIL != module0756.f47654(var32) || NIL != module0756.f47654(module0756.f47633(var32))) {
                    f47445(var36, (SubLObject)UNPROVIDED);
                }
                final SubLObject var37 = f47457(var32);
                if (NIL != module0578.f35470((SubLObject)TWO_INTEGER)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic69$, var36, var37);
                }
                f47416(var36, var37);
                module0749.f46424(var32, (SubLObject)$ic70$, f47406(var36));
            }
        }
        return var32;
    }
    
    public static SubLObject f47458(final SubLObject var32) {
        final SubLObject var33 = module0756.f47487(var32, (SubLObject)UNPROVIDED);
        final SubLObject var34 = f47391(var33);
        final SubLObject var35 = f47384((SubLObject)UNPROVIDED);
        return (SubLObject)makeBoolean(var34.equal(var35) && NIL != Sequences.find_if((SubLObject)$ic39$, Sequences.remove(var32, f47396(var34), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f47457(final SubLObject var32) {
        final SubLObject var33 = module0756.f47488(var32, (SubLObject)UNPROVIDED);
        SubLObject var34 = (SubLObject)NIL;
        if (var33.isList()) {
            SubLObject var35 = var33;
            SubLObject var36 = (SubLObject)NIL;
            var36 = var35.first();
            while (NIL != var35) {
                final SubLObject var37 = f47459(var36);
                if (NIL != var37) {
                    var34 = (SubLObject)ConsesLow.cons(var37, var34);
                }
                var35 = var35.rest();
                var36 = var35.first();
            }
            var34 = Sequences.delete_duplicates(var34, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)((NIL != module0035.f1997(var34)) ? var34.first() : NIL);
    }
    
    public static SubLObject f47459(final SubLObject var60) {
        final SubLObject var61 = module0751.f46628((SubLObject)$ic71$, (SubLObject)ConsesLow.listS($ic72$, var60, (SubLObject)$ic73$), $ic74$, (SubLObject)UNPROVIDED);
        return (SubLObject)((NIL != var61) ? var61.first() : NIL);
    }
    
    public static SubLObject f47460() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47378", "S#39068", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47380", "S#39255", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47382", "S#39257", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47385", "S#51732", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47388", "S#39254", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47390", "S#51851", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47393", "S#51852", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47395", "S#51738", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47397", "S#51853", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47386", "S#51740", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47398", "S#51854", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47399", "S#51855", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47403", "S#51856", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47405", "S#51827", 1, 0, false);
        new $f47405$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47402", "S#51828", 1, 0, false);
        new $f47402$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47406", "S#51857", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47396", "S#51858", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47407", "S#51859", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47408", "S#51860", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47409", "S#51861", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47410", "S#51862", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47411", "S#51863", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47412", "S#51864", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47404", "S#51865", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47413", "S#51866", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47414", "S#51867", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47415", "S#51868", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47416", "S#51869", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47417", "S#51870", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47418", "S#51871", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47419", "S#51872", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47420", "S#51873", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47392", "S#51874", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47421", "S#51875", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47422", "S#51876", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47424", "S#51877", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47423", "S#51878", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47394", "S#51879", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47425", "S#51880", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47426", "S#51881", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47428", "S#51882", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47427", "S#51883", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47429", "S#51884", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47430", "S#51885", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47431", "S#51886", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47433", "S#51887", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47432", "S#51888", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47434", "S#51889", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47379", "S#51846", 1, 0, false);
        new $f47379$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47436", "S#51890", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47437", "S#51891", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47438", "S#51892", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47439", "S#51893", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47440", "S#51894", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47441", "S#51895", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47442", "S#51896", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47443", "S#51897", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47444", "S#51898", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47435", "S#51899", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47381", "S#51900", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47445", "S#51901", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47446", "S#51902", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47384", "S#51903", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47383", "S#39069", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47391", "S#51904", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47387", "S#51905", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47448", "S#51906", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47447", "S#51907", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47449", "S#51908", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47450", "S#39082", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47451", "S#51909", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47389", "S#51910", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47452", "S#51911", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47401", "S#51912", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47453", "S#51913", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47454", "S#51914", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47455", "S#51915", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47400", "S#51916", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47456", "S#51917", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47458", "S#51918", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47457", "S#51919", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0755", "f47459", "S#51920", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47461() {
        $g6065$ = SubLFiles.deflexical("S#51921", module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g6066$ = SubLFiles.defconstant("S#51922", (SubLObject)$ic13$);
        $g6067$ = SubLFiles.defconstant("S#51923", (SubLObject)$ic40$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f47462() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g6066$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic20$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic21$);
        Structures.def_csetf((SubLObject)$ic9$, (SubLObject)$ic22$);
        Structures.def_csetf((SubLObject)$ic23$, (SubLObject)$ic24$);
        Structures.def_csetf((SubLObject)$ic25$, (SubLObject)$ic26$);
        Equality.identity((SubLObject)$ic13$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g6066$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic35$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g6067$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic47$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic48$);
        Structures.def_csetf((SubLObject)$ic49$, (SubLObject)$ic50$);
        Structures.def_csetf((SubLObject)$ic51$, (SubLObject)$ic52$);
        Structures.def_csetf((SubLObject)$ic53$, (SubLObject)$ic54$);
        Equality.identity((SubLObject)$ic40$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g6067$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic57$));
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f47460();
    }
    
    public void initializeVariables() {
        f47461();
    }
    
    public void runTopLevelForms() {
        f47462();
    }
    
    static {
        me = (SubLFile)new module0755();
        $g6065$ = null;
        $g6066$ = null;
        $g6067$ = null;
        $ic0$ = makeKeyword("RMS");
        $ic1$ = makeKeyword("BACKWARD-LOOKING-CENTER");
        $ic2$ = makeString("~&Not adding ~S to the discourse context because *pph-track-discourse-referents?* is NIL~%");
        $ic3$ = makeString("~&Not adding ~S to the discourse context because *pph-discourse-context* is not initialized~%");
        $ic4$ = makeString("~&Not adding ~S to the discourse context because it is already there~%");
        $ic5$ = makeString("~&Not adding ~S to the discourse context because it is not valid discourse-referent cycl");
        $ic6$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("FirstPerson-NLAttr")), constant_handles_oc.f8479((SubLObject)makeString("SecondPerson-NLAttr")));
        $ic7$ = makeKeyword("UNKNOWN");
        $ic8$ = makeKeyword("ENSURED");
        $ic9$ = makeSymbol("S#51828", "CYC");
        $ic10$ = makeString("~&Looking for rival for ~S ~S...~%");
        $ic11$ = makeString("~&Checking ~S...~%");
        $ic12$ = makeString("~&~S has a possible antecedent ambiguity: ~S with~% RM ~S~%");
        $ic13$ = makeSymbol("S#51826", "CYC");
        $ic14$ = makeSymbol("S#51827", "CYC");
        $ic15$ = ConsesLow.list((SubLObject)makeSymbol("S#42702", "CYC"), (SubLObject)makeSymbol("S#50921", "CYC"), (SubLObject)makeSymbol("S#51924", "CYC"));
        $ic16$ = ConsesLow.list((SubLObject)makeKeyword("CYCL"), (SubLObject)makeKeyword("AGR"), (SubLObject)makeKeyword("PHRASES"));
        $ic17$ = ConsesLow.list((SubLObject)makeSymbol("S#51828", "CYC"), (SubLObject)makeSymbol("S#51857", "CYC"), (SubLObject)makeSymbol("S#51858", "CYC"));
        $ic18$ = ConsesLow.list((SubLObject)makeSymbol("S#51859", "CYC"), (SubLObject)makeSymbol("S#51860", "CYC"), (SubLObject)makeSymbol("S#51861", "CYC"));
        $ic19$ = makeSymbol("S#51865", "CYC");
        $ic20$ = makeSymbol("S#51856", "CYC");
        $ic21$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#51827", "CYC"));
        $ic22$ = makeSymbol("S#51859", "CYC");
        $ic23$ = makeSymbol("S#51857", "CYC");
        $ic24$ = makeSymbol("S#51860", "CYC");
        $ic25$ = makeSymbol("S#51858", "CYC");
        $ic26$ = makeSymbol("S#51861", "CYC");
        $ic27$ = makeKeyword("CYCL");
        $ic28$ = makeKeyword("AGR");
        $ic29$ = makeKeyword("PHRASES");
        $ic30$ = makeString("Invalid slot ~S for construction function");
        $ic31$ = makeKeyword("BEGIN");
        $ic32$ = makeSymbol("S#51862", "CYC");
        $ic33$ = makeKeyword("SLOT");
        $ic34$ = makeKeyword("END");
        $ic35$ = makeSymbol("S#51864", "CYC");
        $ic36$ = makeString("#<PPH-RM: ~S ~S ~S>");
        $ic37$ = makeSymbol("S#39074", "CYC");
        $ic38$ = makeSymbol("S#51739", "CYC");
        $ic39$ = makeSymbol("S#50854", "CYC");
        $ic40$ = makeSymbol("S#51845", "CYC");
        $ic41$ = makeSymbol("S#51846", "CYC");
        $ic42$ = ConsesLow.list((SubLObject)makeSymbol("S#51925", "CYC"), (SubLObject)makeSymbol("S#51926", "CYC"), (SubLObject)makeSymbol("S#1519", "CYC"));
        $ic43$ = ConsesLow.list((SubLObject)makeKeyword("RMS"), (SubLObject)makeKeyword("BACKWARD-LOOKING-CENTER"), (SubLObject)makeKeyword("ID"));
        $ic44$ = ConsesLow.list((SubLObject)makeSymbol("S#51890", "CYC"), (SubLObject)makeSymbol("S#51891", "CYC"), (SubLObject)makeSymbol("S#51892", "CYC"));
        $ic45$ = ConsesLow.list((SubLObject)makeSymbol("S#51893", "CYC"), (SubLObject)makeSymbol("S#51894", "CYC"), (SubLObject)makeSymbol("S#51895", "CYC"));
        $ic46$ = makeSymbol("S#51899", "CYC");
        $ic47$ = makeSymbol("S#51889", "CYC");
        $ic48$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#51846", "CYC"));
        $ic49$ = makeSymbol("S#51890", "CYC");
        $ic50$ = makeSymbol("S#51893", "CYC");
        $ic51$ = makeSymbol("S#51891", "CYC");
        $ic52$ = makeSymbol("S#51894", "CYC");
        $ic53$ = makeSymbol("S#51892", "CYC");
        $ic54$ = makeSymbol("S#51895", "CYC");
        $ic55$ = makeKeyword("ID");
        $ic56$ = makeSymbol("S#51896", "CYC");
        $ic57$ = makeSymbol("S#51898", "CYC");
        $ic58$ = makeString("#<PPH-DRS ~S: ~S (~S)>");
        $ic59$ = makeString("Setting BLC for DRS ~S:~% ~S");
        $ic60$ = makeString("(PPH error level ");
        $ic61$ = makeString("Setting backward looking center to ~S but it's not in the discourse context!");
        $ic62$ = makeString(") ");
        $ic63$ = makeString("Set backward-looking center to ~S~%");
        $ic64$ = makeString("Removing BLC for DRS ~S");
        $ic65$ = makeString("Removing rm ~S from *pph-discourse-context* ~S");
        $ic66$ = makeKeyword("ALREADY-REGISTERED");
        $ic67$ = makeKeyword("ADDED");
        $ic68$ = makeString("Getting CycL for NP from head dtr:~% ~S");
        $ic69$ = makeString("Setting number of reference marker ~S to ~S");
        $ic70$ = makeKeyword("INDEX");
        $ic71$ = makeSymbol("?NUM");
        $ic72$ = constant_handles_oc.f8479((SubLObject)makeString("agrPredNumber"));
        $ic73$ = ConsesLow.list((SubLObject)makeSymbol("?NUM"));
        $ic74$ = constant_handles_oc.f8479((SubLObject)makeString("GeneralLexiconMt"));
    }
    
    public static final class $sX51826_native extends SubLStructNative
    {
        public SubLObject $cycl;
        public SubLObject $agr;
        public SubLObject $phrases;
        public static final SubLStructDeclNative structDecl;
        
        public $sX51826_native() {
            this.$cycl = (SubLObject)CommonSymbols.NIL;
            this.$agr = (SubLObject)CommonSymbols.NIL;
            this.$phrases = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX51826_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$cycl;
        }
        
        public SubLObject getField3() {
            return this.$agr;
        }
        
        public SubLObject getField4() {
            return this.$phrases;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$cycl = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$agr = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$phrases = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX51826_native.class, $ic13$, $ic14$, $ic15$, $ic16$, new String[] { "$cycl", "$agr", "$phrases" }, $ic17$, $ic18$, $ic19$);
        }
    }
    
    public static final class $f47405$UnaryFunction extends UnaryFunction
    {
        public $f47405$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#51827"));
        }
        
        public SubLObject processItem(final SubLObject var18) {
            return f47405(var18);
        }
    }
    
    public static final class $f47402$UnaryFunction extends UnaryFunction
    {
        public $f47402$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#51828"));
        }
        
        public SubLObject processItem(final SubLObject var18) {
            return f47402(var18);
        }
    }
    
    public static final class $sX51845_native extends SubLStructNative
    {
        public SubLObject $rms;
        public SubLObject $backward_looking_center;
        public SubLObject $id;
        public static final SubLStructDeclNative structDecl;
        
        public $sX51845_native() {
            this.$rms = (SubLObject)CommonSymbols.NIL;
            this.$backward_looking_center = (SubLObject)CommonSymbols.NIL;
            this.$id = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX51845_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$rms;
        }
        
        public SubLObject getField3() {
            return this.$backward_looking_center;
        }
        
        public SubLObject getField4() {
            return this.$id;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$rms = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$backward_looking_center = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$id = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX51845_native.class, $ic40$, $ic41$, $ic42$, $ic43$, new String[] { "$rms", "$backward_looking_center", "$id" }, $ic44$, $ic45$, $ic46$);
        }
    }
    
    public static final class $f47379$UnaryFunction extends UnaryFunction
    {
        public $f47379$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#51846"));
        }
        
        public SubLObject processItem(final SubLObject var18) {
            return f47379(var18);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 283 ms
	
	Decompiled with Procyon 0.5.32.
*/