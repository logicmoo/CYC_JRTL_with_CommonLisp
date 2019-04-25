package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0398 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0398";
    public static final String myFingerPrint = "9464ac89277224664a5f6e6f1184f1dd49a3e7ef7199bd129a9be6d82b89f800";
    public static SubLSymbol $g3287$;
    private static final SubLSymbol $ic0$;
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
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLString $ic28$;
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
    
    public static SubLObject f28134(final SubLObject var1) {
        return Equality.eq(var1, (SubLObject)$ic0$);
    }
    
    public static SubLObject f28135(final SubLObject var2, final SubLObject var3) {
        compatibility.default_struct_print_function(var2, var3, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28136(final SubLObject var2) {
        return (SubLObject)((var2.getClass() == $sX31261_native.class) ? T : NIL);
    }
    
    public static SubLObject f28137(final SubLObject var2) {
        assert NIL != f28136(var2) : var2;
        return var2.getField2();
    }
    
    public static SubLObject f28138(final SubLObject var2) {
        assert NIL != f28136(var2) : var2;
        return var2.getField3();
    }
    
    public static SubLObject f28139(final SubLObject var2) {
        assert NIL != f28136(var2) : var2;
        return var2.getField4();
    }
    
    public static SubLObject f28140(final SubLObject var2) {
        assert NIL != f28136(var2) : var2;
        return var2.getField5();
    }
    
    public static SubLObject f28141(final SubLObject var2) {
        assert NIL != f28136(var2) : var2;
        return var2.getField6();
    }
    
    public static SubLObject f28142(final SubLObject var2) {
        assert NIL != f28136(var2) : var2;
        return var2.getField7();
    }
    
    public static SubLObject f28143(final SubLObject var2, final SubLObject var5) {
        assert NIL != f28136(var2) : var2;
        return var2.setField2(var5);
    }
    
    public static SubLObject f28144(final SubLObject var2, final SubLObject var5) {
        assert NIL != f28136(var2) : var2;
        return var2.setField3(var5);
    }
    
    public static SubLObject f28145(final SubLObject var2, final SubLObject var5) {
        assert NIL != f28136(var2) : var2;
        return var2.setField4(var5);
    }
    
    public static SubLObject f28146(final SubLObject var2, final SubLObject var5) {
        assert NIL != f28136(var2) : var2;
        return var2.setField5(var5);
    }
    
    public static SubLObject f28147(final SubLObject var2, final SubLObject var5) {
        assert NIL != f28136(var2) : var2;
        return var2.setField6(var5);
    }
    
    public static SubLObject f28148(final SubLObject var2, final SubLObject var5) {
        assert NIL != f28136(var2) : var2;
        return var2.setField7(var5);
    }
    
    public static SubLObject f28149(SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        final SubLObject var7 = (SubLObject)new $sX31261_native();
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        SubLObject var11;
        for (var8 = (SubLObject)NIL, var8 = var6; NIL != var8; var8 = conses_high.cddr(var8)) {
            var9 = var8.first();
            var10 = conses_high.cadr(var8);
            var11 = var9;
            if (var11.eql((SubLObject)$ic22$)) {
                f28143(var7, var10);
            }
            else if (var11.eql((SubLObject)$ic23$)) {
                f28144(var7, var10);
            }
            else if (var11.eql((SubLObject)$ic24$)) {
                f28145(var7, var10);
            }
            else if (var11.eql((SubLObject)$ic25$)) {
                f28146(var7, var10);
            }
            else if (var11.eql((SubLObject)$ic26$)) {
                f28147(var7, var10);
            }
            else if (var11.eql((SubLObject)$ic27$)) {
                f28148(var7, var10);
            }
            else {
                Errors.error((SubLObject)$ic28$, var9);
            }
        }
        return var7;
    }
    
    public static SubLObject f28150(final SubLObject var12, final SubLObject var13) {
        Functions.funcall(var13, var12, (SubLObject)$ic29$, (SubLObject)$ic30$, (SubLObject)SIX_INTEGER);
        Functions.funcall(var13, var12, (SubLObject)$ic31$, (SubLObject)$ic22$, f28137(var12));
        Functions.funcall(var13, var12, (SubLObject)$ic31$, (SubLObject)$ic23$, f28138(var12));
        Functions.funcall(var13, var12, (SubLObject)$ic31$, (SubLObject)$ic24$, f28139(var12));
        Functions.funcall(var13, var12, (SubLObject)$ic31$, (SubLObject)$ic25$, f28140(var12));
        Functions.funcall(var13, var12, (SubLObject)$ic31$, (SubLObject)$ic26$, f28141(var12));
        Functions.funcall(var13, var12, (SubLObject)$ic31$, (SubLObject)$ic27$, f28142(var12));
        Functions.funcall(var13, var12, (SubLObject)$ic32$, (SubLObject)$ic30$, (SubLObject)SIX_INTEGER);
        return var12;
    }
    
    public static SubLObject f28151(final SubLObject var12, final SubLObject var13) {
        return f28150(var12, var13);
    }
    
    public static SubLObject f28152(final SubLObject var1) {
        return (SubLObject)makeBoolean((NIL != module0367.f24997(var1) && $ic0$ == module0367.f25035(var1)) || NIL != module0392.f27957(var1));
    }
    
    public static SubLObject f28153(final SubLObject var14) {
        final SubLObject var15 = f28149((SubLObject)UNPROVIDED);
        f28143(var15, module0077.f5313(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        f28144(var15, module0077.f5313(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        f28145(var15, var14);
        f28146(var15, module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        f28147(var15, module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        f28148(var15, module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        return var15;
    }
    
    public static SubLObject f28154(final SubLObject var16) {
        assert NIL != f28152(var16) : var16;
        final SubLObject var17 = module0367.f25056(var16);
        return f28137(var17);
    }
    
    public static SubLObject f28155(final SubLObject var16) {
        assert NIL != f28152(var16) : var16;
        final SubLObject var17 = module0367.f25056(var16);
        return f28138(var17);
    }
    
    public static SubLObject f28156(final SubLObject var16) {
        assert NIL != f28152(var16) : var16;
        final SubLObject var17 = module0367.f25056(var16);
        return f28139(var17);
    }
    
    public static SubLObject f28157(final SubLObject var16) {
        assert NIL != f28152(var16) : var16;
        final SubLObject var17 = module0367.f25056(var16);
        return f28140(var17);
    }
    
    public static SubLObject f28158(final SubLObject var16) {
        assert NIL != f28152(var16) : var16;
        final SubLObject var17 = module0367.f25056(var16);
        return f28141(var17);
    }
    
    public static SubLObject f28159(final SubLObject var16) {
        assert NIL != f28152(var16) : var16;
        final SubLObject var17 = module0367.f25056(var16);
        return f28142(var17);
    }
    
    public static SubLObject f28160(final SubLObject var16, final SubLObject var17) {
        assert NIL != f28152(var16) : var16;
        assert NIL != module0363.f24478(var17) : var17;
        return module0367.f25083(var17, var16);
    }
    
    public static SubLObject f28161(final SubLObject var16, final SubLObject var18) {
        assert NIL != module0387.f27528(var18) : var18;
        return module0077.f5320(var18, f28154(var16));
    }
    
    public static SubLObject f28162(final SubLObject var16, final SubLObject var17) {
        assert NIL != module0363.f24478(var17) : var17;
        return module0077.f5320(var17, f28155(var16));
    }
    
    public static SubLObject f28163(final SubLObject var16, final SubLObject var17) {
        assert NIL != module0363.f24478(var17) : var17;
        final SubLObject var18 = f28157(var16);
        return Numbers.plusp(module0067.f4885(var18, var17, (SubLObject)ZERO_INTEGER));
    }
    
    public static SubLObject f28164(final SubLObject var16, final SubLObject var17) {
        assert NIL != module0363.f24478(var17) : var17;
        if (NIL == f28163(var16, var17)) {
            final SubLObject var18 = f28158(var16);
            final SubLObject var19 = module0067.f4885(var18, var17, (SubLObject)NIL);
            if (NIL != var19 && NIL == module0077.f5316(var19)) {
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28165(final SubLObject var16, final SubLObject var21) {
        assert NIL != module0387.f27526(var21) : var21;
        final SubLObject var22 = module0387.f27530(var21);
        final SubLObject var23 = f28158(var16);
        final SubLObject var24 = module0067.f4885(var23, var22, (SubLObject)NIL);
        return (SubLObject)makeBoolean(NIL != module0077.f5302(var24) && NIL != module0077.f5320(var21, var24));
    }
    
    public static SubLObject f28166(final SubLObject var16, final SubLObject var21) {
        assert NIL != module0387.f27526(var21) : var21;
        final SubLObject var22 = module0387.f27530(var21);
        final SubLObject var23 = f28159(var16);
        final SubLObject var24 = module0067.f4885(var23, var22, (SubLObject)NIL);
        return (SubLObject)makeBoolean(NIL != module0077.f5302(var24) && NIL != module0077.f5320(var21, var24));
    }
    
    public static SubLObject f28167(final SubLObject var16, final SubLObject var17) {
        assert NIL != f28152(var16) : var16;
        assert NIL != module0363.f24478(var17) : var17;
        return module0367.f25099(var16, var17);
    }
    
    public static SubLObject f28168(final SubLObject var16, final SubLObject var18) {
        assert NIL != f28152(var16) : var16;
        assert NIL != module0387.f27528(var18) : var18;
        return module0077.f5326(var18, f28154(var16));
    }
    
    public static SubLObject f28169(final SubLObject var16, final SubLObject var17) {
        assert NIL != f28152(var16) : var16;
        assert NIL != module0363.f24478(var17) : var17;
        return module0077.f5326(var17, f28155(var16));
    }
    
    public static SubLObject f28170(final SubLObject var16, final SubLObject var17) {
        assert NIL != f28152(var16) : var16;
        assert NIL != module0363.f24478(var17) : var17;
        return module0077.f5327(var17, f28155(var16));
    }
    
    public static SubLObject f28171(final SubLObject var16, final SubLObject var22) {
        assert NIL != f28152(var16) : var16;
        assert NIL != module0387.f27533(var22) : var22;
        if (NIL != module0377.f26771(var22) && NIL != module0365.f24885(var22)) {
            return module0400.f28248(var16, module0365.f24850(var22));
        }
        SubLObject var23 = (SubLObject)NIL;
        var23 = module0402.f28285(var16, var22);
        if (NIL != var23) {
            final SubLObject var24 = module0387.f27530(var22);
            final SubLObject var25 = f28157(var16);
            SubLObject var26 = module0067.f4885(var25, var24, (SubLObject)ZERO_INTEGER);
            var26 = Numbers.add(var26, (SubLObject)ONE_INTEGER);
            if (ONE_INTEGER.numE(var26)) {
                f28170(var16, var24);
            }
            module0067.f4886(var25, var24, var26);
            return var26;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28172(final SubLObject var16, final SubLObject var22) {
        assert NIL != f28152(var16) : var16;
        assert NIL != module0387.f27533(var22) : var22;
        final SubLObject var23 = f28158(var16);
        final SubLObject var24 = module0387.f27530(var22);
        SubLObject var25 = module0067.f4885(var23, var24, (SubLObject)NIL);
        if (NIL == module0077.f5302(var25)) {
            var25 = module0077.f5313(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
            module0067.f4886(var23, var24, var25);
        }
        return module0077.f5326(var22, var25);
    }
    
    public static SubLObject f28173(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        assert NIL != f28152(var16) : var16;
        final SubLObject var18 = f28158(var16);
        SubLObject var19;
        for (var19 = module0066.f4838(module0067.f4891(var18)); NIL == module0066.f4841(var19); var19 = module0066.f4840(var19)) {
            var17.resetMultipleValues();
            final SubLObject var20 = module0066.f4839(var19);
            final SubLObject var21 = var17.secondMultipleValue();
            var17.resetMultipleValues();
            f28170(var16, var20);
        }
        module0066.f4842(var19);
        module0067.f4881(var18);
        return var16;
    }
    
    public static SubLObject f28174(final SubLObject var16, final SubLObject var22) {
        assert NIL != f28152(var16) : var16;
        assert NIL != module0387.f27533(var22) : var22;
        final SubLObject var23 = f28159(var16);
        final SubLObject var24 = module0387.f27530(var22);
        SubLObject var25 = module0067.f4885(var23, var24, (SubLObject)NIL);
        if (NIL == module0077.f5302(var25)) {
            var25 = module0077.f5313(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
            module0067.f4886(var23, var24, var25);
        }
        return module0077.f5326(var22, var25);
    }
    
    public static SubLObject f28175(final SubLObject var16) {
        f28173(var16);
        return var16;
    }
    
    public static SubLObject f28176() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0398", "f28134", "S#31265", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0398", "f28135", "S#31266", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0398", "f28136", "S#31262", 1, 0, false);
        new $f28136$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0398", "f28137", "S#31267", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0398", "f28138", "S#31268", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0398", "f28139", "S#31269", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0398", "f28140", "S#31270", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0398", "f28141", "S#31271", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0398", "f28142", "S#31272", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0398", "f28143", "S#31273", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0398", "f28144", "S#31274", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0398", "f28145", "S#31275", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0398", "f28146", "S#31276", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0398", "f28147", "S#31277", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0398", "f28148", "S#31278", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0398", "f28149", "S#31279", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0398", "f28150", "S#31280", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0398", "f28151", "S#31281", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0398", "f28152", "S#30356", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0398", "f28153", "S#31282", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0398", "f28154", "S#31283", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0398", "f28155", "S#31284", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0398", "f28156", "S#31285", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0398", "f28157", "S#31286", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0398", "f28158", "S#31287", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0398", "f28159", "S#31288", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0398", "f28160", "S#31289", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0398", "f28161", "S#31290", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0398", "f28162", "S#31291", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0398", "f28163", "S#31292", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0398", "f28164", "S#31293", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0398", "f28165", "S#31294", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0398", "f28166", "S#31295", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0398", "f28167", "S#31296", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0398", "f28168", "S#31297", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0398", "f28169", "S#31298", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0398", "f28170", "S#31299", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0398", "f28171", "S#31300", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0398", "f28172", "S#31301", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0398", "f28173", "S#31302", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0398", "f28174", "S#31303", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0398", "f28175", "S#31304", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28177() {
        $g3287$ = SubLFiles.defconstant("S#31305", (SubLObject)$ic1$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28178() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g3287$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic8$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic9$);
        Structures.def_csetf((SubLObject)$ic10$, (SubLObject)$ic11$);
        Structures.def_csetf((SubLObject)$ic12$, (SubLObject)$ic13$);
        Structures.def_csetf((SubLObject)$ic14$, (SubLObject)$ic15$);
        Structures.def_csetf((SubLObject)$ic16$, (SubLObject)$ic17$);
        Structures.def_csetf((SubLObject)$ic18$, (SubLObject)$ic19$);
        Structures.def_csetf((SubLObject)$ic20$, (SubLObject)$ic21$);
        Equality.identity((SubLObject)$ic1$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g3287$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic33$));
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f28176();
    }
    
    public void initializeVariables() {
        f28177();
    }
    
    public void runTopLevelForms() {
        f28178();
    }
    
    static {
        me = (SubLFile)new module0398();
        $g3287$ = null;
        $ic0$ = makeKeyword("TRANSFORMATION");
        $ic1$ = makeSymbol("S#31261", "CYC");
        $ic2$ = makeSymbol("S#31262", "CYC");
        $ic3$ = ConsesLow.list((SubLObject)makeSymbol("S#31138", "CYC"), (SubLObject)makeSymbol("S#31139", "CYC"), (SubLObject)makeSymbol("S#31306", "CYC"), (SubLObject)makeSymbol("S#31141", "CYC"), (SubLObject)makeSymbol("S#31142", "CYC"), (SubLObject)makeSymbol("S#31143", "CYC"));
        $ic4$ = ConsesLow.list((SubLObject)makeKeyword("LINK-HEADS-MOTIVATED"), (SubLObject)makeKeyword("PROBLEMS-PENDING"), (SubLObject)makeKeyword("TRANSFORMATION-STRATEGEM-INDEX"), (SubLObject)makeKeyword("PROBLEM-TOTAL-STRATEGEMS-ACTIVE"), (SubLObject)makeKeyword("PROBLEM-STRATEGEMS-SET-ASIDE"), (SubLObject)makeKeyword("PROBLEM-STRATEGEMS-THROWN-AWAY"));
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#31267", "CYC"), (SubLObject)makeSymbol("S#31268", "CYC"), (SubLObject)makeSymbol("S#31269", "CYC"), (SubLObject)makeSymbol("S#31270", "CYC"), (SubLObject)makeSymbol("S#31271", "CYC"), (SubLObject)makeSymbol("S#31272", "CYC"));
        $ic6$ = ConsesLow.list((SubLObject)makeSymbol("S#31273", "CYC"), (SubLObject)makeSymbol("S#31274", "CYC"), (SubLObject)makeSymbol("S#31275", "CYC"), (SubLObject)makeSymbol("S#31276", "CYC"), (SubLObject)makeSymbol("S#31277", "CYC"), (SubLObject)makeSymbol("S#31278", "CYC"));
        $ic7$ = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic8$ = makeSymbol("S#31266", "CYC");
        $ic9$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#31262", "CYC"));
        $ic10$ = makeSymbol("S#31267", "CYC");
        $ic11$ = makeSymbol("S#31273", "CYC");
        $ic12$ = makeSymbol("S#31268", "CYC");
        $ic13$ = makeSymbol("S#31274", "CYC");
        $ic14$ = makeSymbol("S#31269", "CYC");
        $ic15$ = makeSymbol("S#31275", "CYC");
        $ic16$ = makeSymbol("S#31270", "CYC");
        $ic17$ = makeSymbol("S#31276", "CYC");
        $ic18$ = makeSymbol("S#31271", "CYC");
        $ic19$ = makeSymbol("S#31277", "CYC");
        $ic20$ = makeSymbol("S#31272", "CYC");
        $ic21$ = makeSymbol("S#31278", "CYC");
        $ic22$ = makeKeyword("LINK-HEADS-MOTIVATED");
        $ic23$ = makeKeyword("PROBLEMS-PENDING");
        $ic24$ = makeKeyword("TRANSFORMATION-STRATEGEM-INDEX");
        $ic25$ = makeKeyword("PROBLEM-TOTAL-STRATEGEMS-ACTIVE");
        $ic26$ = makeKeyword("PROBLEM-STRATEGEMS-SET-ASIDE");
        $ic27$ = makeKeyword("PROBLEM-STRATEGEMS-THROWN-AWAY");
        $ic28$ = makeString("Invalid slot ~S for construction function");
        $ic29$ = makeKeyword("BEGIN");
        $ic30$ = makeSymbol("S#31279", "CYC");
        $ic31$ = makeKeyword("SLOT");
        $ic32$ = makeKeyword("END");
        $ic33$ = makeSymbol("S#31281", "CYC");
        $ic34$ = makeSymbol("S#30356", "CYC");
        $ic35$ = makeSymbol("S#26082", "CYC");
        $ic36$ = makeSymbol("S#30620", "CYC");
        $ic37$ = makeSymbol("S#30616", "CYC");
        $ic38$ = makeSymbol("S#30623", "CYC");
    }
    
    public static final class $sX31261_native extends SubLStructNative
    {
        public SubLObject $link_heads_motivated;
        public SubLObject $problems_pending;
        public SubLObject $transformation_strategem_index;
        public SubLObject $problem_total_strategems_active;
        public SubLObject $problem_strategems_set_aside;
        public SubLObject $problem_strategems_thrown_away;
        private static final SubLStructDeclNative structDecl;
        
        public $sX31261_native() {
            this.$link_heads_motivated = (SubLObject)CommonSymbols.NIL;
            this.$problems_pending = (SubLObject)CommonSymbols.NIL;
            this.$transformation_strategem_index = (SubLObject)CommonSymbols.NIL;
            this.$problem_total_strategems_active = (SubLObject)CommonSymbols.NIL;
            this.$problem_strategems_set_aside = (SubLObject)CommonSymbols.NIL;
            this.$problem_strategems_thrown_away = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX31261_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$link_heads_motivated;
        }
        
        public SubLObject getField3() {
            return this.$problems_pending;
        }
        
        public SubLObject getField4() {
            return this.$transformation_strategem_index;
        }
        
        public SubLObject getField5() {
            return this.$problem_total_strategems_active;
        }
        
        public SubLObject getField6() {
            return this.$problem_strategems_set_aside;
        }
        
        public SubLObject getField7() {
            return this.$problem_strategems_thrown_away;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$link_heads_motivated = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$problems_pending = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$transformation_strategem_index = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$problem_total_strategems_active = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$problem_strategems_set_aside = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$problem_strategems_thrown_away = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX31261_native.class, $ic1$, $ic2$, $ic3$, $ic4$, new String[] { "$link_heads_motivated", "$problems_pending", "$transformation_strategem_index", "$problem_total_strategems_active", "$problem_strategems_set_aside", "$problem_strategems_thrown_away" }, $ic5$, $ic6$, $ic7$);
        }
    }
    
    public static final class $f28136$UnaryFunction extends UnaryFunction
    {
        public $f28136$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#31262"));
        }
        
        public SubLObject processItem(final SubLObject var4) {
            return f28136(var4);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 143 ms
	
	Decompiled with Procyon 0.5.32.
*/