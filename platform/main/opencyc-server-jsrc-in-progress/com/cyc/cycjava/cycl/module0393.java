package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
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

public final class module0393 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0393";
    public static final String myFingerPrint = "ca40ebbe75243f028843d4ae937853722381d42b2ca33d4186046f8c39bc2d18";
    public static SubLSymbol $g3282$;
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
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLString $ic27$;
    private static final SubLSymbol $ic28$;
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
    
    public static SubLObject f27961(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27962(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX31090_native.class) ? T : NIL);
    }
    
    public static SubLObject f27963(final SubLObject var1) {
        assert NIL != f27962(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f27964(final SubLObject var1) {
        assert NIL != f27962(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f27965(final SubLObject var1) {
        assert NIL != f27962(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f27966(final SubLObject var1) {
        assert NIL != f27962(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f27967(final SubLObject var1) {
        assert NIL != f27962(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f27968(final SubLObject var1) {
        assert NIL != f27962(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f27969(final SubLObject var1, final SubLObject var4) {
        assert NIL != f27962(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f27970(final SubLObject var1, final SubLObject var4) {
        assert NIL != f27962(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f27971(final SubLObject var1, final SubLObject var4) {
        assert NIL != f27962(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f27972(final SubLObject var1, final SubLObject var4) {
        assert NIL != f27962(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f27973(final SubLObject var1, final SubLObject var4) {
        assert NIL != f27962(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f27974(final SubLObject var1, final SubLObject var4) {
        assert NIL != f27962(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f27975(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX31090_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic21$)) {
                f27969(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic22$)) {
                f27970(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic23$)) {
                f27971(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic24$)) {
                f27972(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic25$)) {
                f27973(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic26$)) {
                f27974(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic27$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f27976(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic28$, (SubLObject)$ic29$, (SubLObject)SIX_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic30$, (SubLObject)$ic21$, f27963(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic30$, (SubLObject)$ic22$, f27964(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic30$, (SubLObject)$ic23$, f27965(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic30$, (SubLObject)$ic24$, f27966(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic30$, (SubLObject)$ic25$, f27967(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic30$, (SubLObject)$ic26$, f27968(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic31$, (SubLObject)$ic29$, (SubLObject)SIX_INTEGER);
        return var11;
    }
    
    public static SubLObject f27977(final SubLObject var11, final SubLObject var12) {
        return f27976(var11, var12);
    }
    
    public static SubLObject f27978(final SubLObject var13) {
        final SubLObject var14 = f27975((SubLObject)UNPROVIDED);
        f27969(var14, module0077.f5313(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        f27970(var14, module0077.f5313(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        f27971(var14, var13);
        f27972(var14, module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        f27973(var14, module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        f27974(var14, module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        return var14;
    }
    
    public static SubLObject f27979(final SubLObject var15) {
        assert NIL != module0397.f28129(var15) : var15;
        final SubLObject var16 = module0367.f25056(var15);
        return f27963(var16);
    }
    
    public static SubLObject f27980(final SubLObject var15) {
        assert NIL != module0397.f28129(var15) : var15;
        final SubLObject var16 = module0367.f25056(var15);
        return f27964(var16);
    }
    
    public static SubLObject f27981(final SubLObject var15) {
        assert NIL != module0397.f28129(var15) : var15;
        final SubLObject var16 = module0367.f25056(var15);
        return f27965(var16);
    }
    
    public static SubLObject f27982(final SubLObject var15) {
        assert NIL != module0397.f28129(var15) : var15;
        final SubLObject var16 = module0367.f25056(var15);
        return f27966(var16);
    }
    
    public static SubLObject f27983(final SubLObject var15) {
        assert NIL != module0397.f28129(var15) : var15;
        final SubLObject var16 = module0367.f25056(var15);
        return f27967(var16);
    }
    
    public static SubLObject f27984(final SubLObject var15) {
        assert NIL != module0397.f28129(var15) : var15;
        final SubLObject var16 = module0367.f25056(var15);
        return f27968(var16);
    }
    
    public static SubLObject f27985(final SubLObject var15, final SubLObject var16) {
        assert NIL != module0387.f27528(var16) : var16;
        return module0077.f5320(var16, f27979(var15));
    }
    
    public static SubLObject f27986(final SubLObject var15, final SubLObject var17) {
        assert NIL != module0397.f28129(var15) : var15;
        assert NIL != module0373.f26150(var17) : var17;
        final SubLObject var18 = module0373.f26152(var17);
        return f27985(var15, var18);
    }
    
    public static SubLObject f27987(final SubLObject var15, final SubLObject var18) {
        assert NIL != module0363.f24478(var18) : var18;
        return module0077.f5320(var18, f27980(var15));
    }
    
    public static SubLObject f27988(final SubLObject var15, final SubLObject var18) {
        assert NIL != module0363.f24478(var18) : var18;
        final SubLObject var19 = f27982(var15);
        return Numbers.plusp(module0067.f4885(var19, var18, (SubLObject)ZERO_INTEGER));
    }
    
    public static SubLObject f27989(final SubLObject var15, final SubLObject var18) {
        assert NIL != module0363.f24478(var18) : var18;
        if (NIL == f27988(var15, var18)) {
            final SubLObject var19 = f27983(var15);
            final SubLObject var20 = module0067.f4885(var19, var18, (SubLObject)NIL);
            if (NIL != var20 && NIL == module0077.f5316(var20)) {
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27990(final SubLObject var15, final SubLObject var21) {
        assert NIL != module0387.f27526(var21) : var21;
        final SubLObject var22 = module0387.f27530(var21);
        final SubLObject var23 = f27983(var15);
        final SubLObject var24 = module0067.f4885(var23, var22, (SubLObject)NIL);
        return (SubLObject)makeBoolean(NIL != module0077.f5302(var24) && NIL != module0077.f5320(var21, var24));
    }
    
    public static SubLObject f27991(final SubLObject var15, final SubLObject var21) {
        assert NIL != module0387.f27526(var21) : var21;
        final SubLObject var22 = module0387.f27530(var21);
        final SubLObject var23 = f27984(var15);
        final SubLObject var24 = module0067.f4885(var23, var22, (SubLObject)NIL);
        return (SubLObject)makeBoolean(NIL != module0077.f5302(var24) && NIL != module0077.f5320(var21, var24));
    }
    
    public static SubLObject f27992(final SubLObject var15) {
        return module0367.f25062(var15);
    }
    
    public static SubLObject f27993(final SubLObject var15) {
        final SubLObject var16 = f27981(var15);
        if (NIL == module0054.f3970(var16)) {
            return module0054.f3975(var16);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27994(final SubLObject var15, final SubLObject var18) {
        assert NIL != module0397.f28129(var15) : var15;
        assert NIL != module0363.f24478(var18) : var18;
        return module0367.f25099(var15, var18);
    }
    
    public static SubLObject f27995(final SubLObject var15, final SubLObject var16) {
        assert NIL != module0397.f28129(var15) : var15;
        assert NIL != module0387.f27528(var16) : var16;
        return module0077.f5326(var16, f27979(var15));
    }
    
    public static SubLObject f27996(final SubLObject var15, final SubLObject var18) {
        assert NIL != module0397.f28129(var15) : var15;
        assert NIL != module0363.f24478(var18) : var18;
        module0077.f5326(var18, f27980(var15));
        module0367.f25107(var18, var15);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27997(final SubLObject var15, final SubLObject var18) {
        assert NIL != module0397.f28129(var15) : var15;
        assert NIL != module0363.f24478(var18) : var18;
        module0077.f5327(var18, f27980(var15));
        module0367.f25239(var18, var15);
        module0367.f25241(var18, var15);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27998(final SubLObject var15, final SubLObject var21) {
        assert NIL != module0397.f28129(var15) : var15;
        assert NIL != module0387.f27532(var21) : var21;
        final SubLObject var22 = f27981(var15);
        module0054.f3973(var21, var22);
        final SubLObject var23 = module0387.f27530(var21);
        final SubLObject var24 = f27982(var15);
        SubLObject var25 = module0067.f4885(var24, var23, (SubLObject)ZERO_INTEGER);
        var25 = Numbers.add(var25, (SubLObject)ONE_INTEGER);
        if (ONE_INTEGER.numE(var25)) {
            f27997(var15, var23);
        }
        module0067.f4886(var24, var23, var25);
        return var25;
    }
    
    public static SubLObject f27999(final SubLObject var15) {
        module0054.f3969(f27981(var15));
        module0067.f4881(f27982(var15));
        return var15;
    }
    
    public static SubLObject f28000(final SubLObject var15) {
        assert NIL != module0397.f28129(var15) : var15;
        return module0054.f3972(f27981(var15));
    }
    
    public static SubLObject f28001(final SubLObject var15) {
        final SubLObject var16 = f27981(var15);
        return module0054.f3974(var16);
    }
    
    public static SubLObject f28002(final SubLObject var15, final SubLObject var21) {
        assert NIL != module0397.f28129(var15) : var15;
        assert NIL != module0387.f27532(var21) : var21;
        final SubLObject var22 = f27983(var15);
        final SubLObject var23 = module0387.f27530(var21);
        SubLObject var24 = module0067.f4885(var22, var23, (SubLObject)NIL);
        if (NIL != module0365.f24819(var21)) {
            module0367.f25231(var21, var15, (SubLObject)UNPROVIDED);
        }
        module0367.f25179(var23, var15);
        module0367.f25107(var23, var15);
        if (NIL == module0077.f5302(var24)) {
            var24 = module0077.f5313(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
            module0067.f4886(var22, var23, var24);
        }
        return module0077.f5326(var21, var24);
    }
    
    public static SubLObject f28003(final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        assert NIL != module0397.f28129(var15) : var15;
        final SubLObject var17 = f27983(var15);
        SubLObject var18;
        for (var18 = module0066.f4838(module0067.f4891(var17)); NIL == module0066.f4841(var18); var18 = module0066.f4840(var18)) {
            var16.resetMultipleValues();
            final SubLObject var19 = module0066.f4839(var18);
            final SubLObject var20 = var16.secondMultipleValue();
            var16.resetMultipleValues();
            if (NIL != module0363.f24504(var19)) {
                f27997(var15, var19);
            }
        }
        module0066.f4842(var18);
        module0067.f4881(var17);
        return var15;
    }
    
    public static SubLObject f28004(final SubLObject var15, final SubLObject var21) {
        assert NIL != module0397.f28129(var15) : var15;
        assert NIL != module0387.f27532(var21) : var21;
        if (NIL != module0365.f24819(var21)) {
            module0367.f25228(var21, var15, (SubLObject)UNPROVIDED);
            if (NIL != module0380.f26969(var21)) {
                SubLObject var22 = module0363.f24517(module0365.f24850(var21));
                SubLObject var23 = (SubLObject)NIL;
                var23 = var22.first();
                while (NIL != var22) {
                    if (NIL != module0363.f24524(var23, (SubLObject)$ic39$) && !var23.eql(var21)) {
                        module0367.f25233(var23, var15);
                    }
                    var22 = var22.rest();
                    var23 = var22.first();
                }
            }
        }
        final SubLObject var24 = f27984(var15);
        final SubLObject var25 = module0387.f27530(var21);
        SubLObject var26 = module0067.f4885(var24, var25, (SubLObject)NIL);
        if (NIL == module0077.f5302(var26)) {
            var26 = module0077.f5313(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
            module0067.f4886(var24, var25, var26);
        }
        return module0077.f5326(var21, var26);
    }
    
    public static SubLObject f28005(final SubLObject var15) {
        assert NIL != module0397.f28129(var15) : var15;
        return module0054.f3970(f27981(var15));
    }
    
    public static SubLObject f28006(final SubLObject var15) {
        f28003(var15);
        return var15;
    }
    
    public static SubLObject f28007() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0393", "f27961", "S#31092", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0393", "f27962", "S#31091", 1, 0, false);
        new $f27962$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0393", "f27963", "S#31093", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0393", "f27964", "S#31094", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0393", "f27965", "S#31095", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0393", "f27966", "S#31096", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0393", "f27967", "S#31097", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0393", "f27968", "S#31098", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0393", "f27969", "S#31099", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0393", "f27970", "S#31100", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0393", "f27971", "S#31101", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0393", "f27972", "S#31102", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0393", "f27973", "S#31103", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0393", "f27974", "S#31104", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0393", "f27975", "S#31105", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0393", "f27976", "S#31106", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0393", "f27977", "S#31107", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0393", "f27978", "S#31108", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0393", "f27979", "S#31109", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0393", "f27980", "S#31110", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0393", "f27981", "S#31111", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0393", "f27982", "S#31112", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0393", "f27983", "S#31113", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0393", "f27984", "S#31114", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0393", "f27985", "S#31115", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0393", "f27986", "S#31116", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0393", "f27987", "S#31117", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0393", "f27988", "S#31118", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0393", "f27989", "S#31119", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0393", "f27990", "S#31120", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0393", "f27991", "S#31121", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0393", "f27992", "S#31122", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0393", "f27993", "S#31123", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0393", "f27994", "S#31124", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0393", "f27995", "S#31125", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0393", "f27996", "S#31126", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0393", "f27997", "S#31127", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0393", "f27998", "S#31128", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0393", "f27999", "S#31129", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0393", "f28000", "S#31130", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0393", "f28001", "S#31131", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0393", "f28002", "S#31132", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0393", "f28003", "S#31133", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0393", "f28004", "S#31134", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0393", "f28005", "S#31135", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0393", "f28006", "S#31136", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28008() {
        $g3282$ = SubLFiles.defconstant("S#31137", (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28009() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g3282$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic8$);
        Structures.def_csetf((SubLObject)$ic9$, (SubLObject)$ic10$);
        Structures.def_csetf((SubLObject)$ic11$, (SubLObject)$ic12$);
        Structures.def_csetf((SubLObject)$ic13$, (SubLObject)$ic14$);
        Structures.def_csetf((SubLObject)$ic15$, (SubLObject)$ic16$);
        Structures.def_csetf((SubLObject)$ic17$, (SubLObject)$ic18$);
        Structures.def_csetf((SubLObject)$ic19$, (SubLObject)$ic20$);
        Equality.identity((SubLObject)$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g3282$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic32$));
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f28007();
    }
    
    public void initializeVariables() {
        f28008();
    }
    
    public void runTopLevelForms() {
        f28009();
    }
    
    static {
        me = (SubLFile)new module0393();
        $g3282$ = null;
        $ic0$ = makeSymbol("S#31090", "CYC");
        $ic1$ = makeSymbol("S#31091", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)makeSymbol("S#31138", "CYC"), (SubLObject)makeSymbol("S#31139", "CYC"), (SubLObject)makeSymbol("S#31140", "CYC"), (SubLObject)makeSymbol("S#31141", "CYC"), (SubLObject)makeSymbol("S#31142", "CYC"), (SubLObject)makeSymbol("S#31143", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)makeKeyword("LINK-HEADS-MOTIVATED"), (SubLObject)makeKeyword("PROBLEMS-PENDING"), (SubLObject)makeKeyword("REMOVAL-STRATEGEM-INDEX"), (SubLObject)makeKeyword("PROBLEM-TOTAL-STRATEGEMS-ACTIVE"), (SubLObject)makeKeyword("PROBLEM-STRATEGEMS-SET-ASIDE"), (SubLObject)makeKeyword("PROBLEM-STRATEGEMS-THROWN-AWAY"));
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("S#31093", "CYC"), (SubLObject)makeSymbol("S#31094", "CYC"), (SubLObject)makeSymbol("S#31095", "CYC"), (SubLObject)makeSymbol("S#31096", "CYC"), (SubLObject)makeSymbol("S#31097", "CYC"), (SubLObject)makeSymbol("S#31098", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#31099", "CYC"), (SubLObject)makeSymbol("S#31100", "CYC"), (SubLObject)makeSymbol("S#31101", "CYC"), (SubLObject)makeSymbol("S#31102", "CYC"), (SubLObject)makeSymbol("S#31103", "CYC"), (SubLObject)makeSymbol("S#31104", "CYC"));
        $ic6$ = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic7$ = makeSymbol("S#31092", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#31091", "CYC"));
        $ic9$ = makeSymbol("S#31093", "CYC");
        $ic10$ = makeSymbol("S#31099", "CYC");
        $ic11$ = makeSymbol("S#31094", "CYC");
        $ic12$ = makeSymbol("S#31100", "CYC");
        $ic13$ = makeSymbol("S#31095", "CYC");
        $ic14$ = makeSymbol("S#31101", "CYC");
        $ic15$ = makeSymbol("S#31096", "CYC");
        $ic16$ = makeSymbol("S#31102", "CYC");
        $ic17$ = makeSymbol("S#31097", "CYC");
        $ic18$ = makeSymbol("S#31103", "CYC");
        $ic19$ = makeSymbol("S#31098", "CYC");
        $ic20$ = makeSymbol("S#31104", "CYC");
        $ic21$ = makeKeyword("LINK-HEADS-MOTIVATED");
        $ic22$ = makeKeyword("PROBLEMS-PENDING");
        $ic23$ = makeKeyword("REMOVAL-STRATEGEM-INDEX");
        $ic24$ = makeKeyword("PROBLEM-TOTAL-STRATEGEMS-ACTIVE");
        $ic25$ = makeKeyword("PROBLEM-STRATEGEMS-SET-ASIDE");
        $ic26$ = makeKeyword("PROBLEM-STRATEGEMS-THROWN-AWAY");
        $ic27$ = makeString("Invalid slot ~S for construction function");
        $ic28$ = makeKeyword("BEGIN");
        $ic29$ = makeSymbol("S#31105", "CYC");
        $ic30$ = makeKeyword("SLOT");
        $ic31$ = makeKeyword("END");
        $ic32$ = makeSymbol("S#31107", "CYC");
        $ic33$ = makeSymbol("S#29327", "CYC");
        $ic34$ = makeSymbol("S#30620", "CYC");
        $ic35$ = makeSymbol("S#27602", "CYC");
        $ic36$ = makeSymbol("S#26082", "CYC");
        $ic37$ = makeSymbol("S#30616", "CYC");
        $ic38$ = makeSymbol("S#30622", "CYC");
        $ic39$ = makeKeyword("SPLIT");
    }
    
    public static final class $sX31090_native extends SubLStructNative
    {
        public SubLObject $link_heads_motivated;
        public SubLObject $problems_pending;
        public SubLObject $removal_strategem_index;
        public SubLObject $problem_total_strategems_active;
        public SubLObject $problem_strategems_set_aside;
        public SubLObject $problem_strategems_thrown_away;
        public static final SubLStructDeclNative structDecl;
        
        public $sX31090_native() {
            this.$link_heads_motivated = (SubLObject)CommonSymbols.NIL;
            this.$problems_pending = (SubLObject)CommonSymbols.NIL;
            this.$removal_strategem_index = (SubLObject)CommonSymbols.NIL;
            this.$problem_total_strategems_active = (SubLObject)CommonSymbols.NIL;
            this.$problem_strategems_set_aside = (SubLObject)CommonSymbols.NIL;
            this.$problem_strategems_thrown_away = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$link_heads_motivated;
        }
        
        public SubLObject getField3() {
            return this.$problems_pending;
        }
        
        public SubLObject getField4() {
            return this.$removal_strategem_index;
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
            return this.$removal_strategem_index = value;
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
            structDecl = Structures.makeStructDeclNative((Class)$sX31090_native.class, $ic0$, $ic1$, $ic2$, $ic3$, new String[] { "$link_heads_motivated", "$problems_pending", "$removal_strategem_index", "$problem_total_strategems_active", "$problem_strategems_set_aside", "$problem_strategems_thrown_away" }, $ic4$, $ic5$, $ic6$);
        }
    }
    
    public static final class $f27962$UnaryFunction extends UnaryFunction
    {
        public $f27962$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#31091"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f27962(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 155 ms
	
	Decompiled with Procyon 0.5.32.
*/