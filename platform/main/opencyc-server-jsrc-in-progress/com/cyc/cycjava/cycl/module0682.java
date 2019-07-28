package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
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

public final class module0682 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0682";
    public static final String myFingerPrint = "783bf98cb9d55cdb99bd16b7c12aba5982c1d3a44742046d90687a36d87bb7c1";
    public static SubLSymbol $g5350$;
    public static SubLSymbol $g5351$;
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
    private static final SubLSymbol $ic27$;
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
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLString $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    
    
    public static SubLObject f41625(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41626(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX45613_native.class) ? T : NIL);
    }
    
    public static SubLObject f41627(final SubLObject var1) {
        assert NIL != f41626(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f41628(final SubLObject var1) {
        assert NIL != f41626(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f41629(final SubLObject var1) {
        assert NIL != f41626(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f41630(final SubLObject var1) {
        assert NIL != f41626(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f41631(final SubLObject var1) {
        assert NIL != f41626(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f41632(final SubLObject var1) {
        assert NIL != f41626(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f41633(final SubLObject var1) {
        assert NIL != f41626(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f41634(final SubLObject var1) {
        assert NIL != f41626(var1) : var1;
        return var1.getField9();
    }
    
    public static SubLObject f41635(final SubLObject var1) {
        assert NIL != f41626(var1) : var1;
        return var1.getField10();
    }
    
    public static SubLObject f41636(final SubLObject var1) {
        assert NIL != f41626(var1) : var1;
        return var1.getField11();
    }
    
    public static SubLObject f41637(final SubLObject var1) {
        assert NIL != f41626(var1) : var1;
        return var1.getField12();
    }
    
    public static SubLObject f41638(final SubLObject var1) {
        assert NIL != f41626(var1) : var1;
        return var1.getField13();
    }
    
    public static SubLObject f41639(final SubLObject var1) {
        assert NIL != f41626(var1) : var1;
        return var1.getField14();
    }
    
    public static SubLObject f41640(final SubLObject var1) {
        assert NIL != f41626(var1) : var1;
        return var1.getField15();
    }
    
    public static SubLObject f41641(final SubLObject var1, final SubLObject var4) {
        assert NIL != f41626(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f41642(final SubLObject var1, final SubLObject var4) {
        assert NIL != f41626(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f41643(final SubLObject var1, final SubLObject var4) {
        assert NIL != f41626(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f41644(final SubLObject var1, final SubLObject var4) {
        assert NIL != f41626(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f41645(final SubLObject var1, final SubLObject var4) {
        assert NIL != f41626(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f41646(final SubLObject var1, final SubLObject var4) {
        assert NIL != f41626(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f41647(final SubLObject var1, final SubLObject var4) {
        assert NIL != f41626(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f41648(final SubLObject var1, final SubLObject var4) {
        assert NIL != f41626(var1) : var1;
        return var1.setField9(var4);
    }
    
    public static SubLObject f41649(final SubLObject var1, final SubLObject var4) {
        assert NIL != f41626(var1) : var1;
        return var1.setField10(var4);
    }
    
    public static SubLObject f41650(final SubLObject var1, final SubLObject var4) {
        assert NIL != f41626(var1) : var1;
        return var1.setField11(var4);
    }
    
    public static SubLObject f41651(final SubLObject var1, final SubLObject var4) {
        assert NIL != f41626(var1) : var1;
        return var1.setField12(var4);
    }
    
    public static SubLObject f41652(final SubLObject var1, final SubLObject var4) {
        assert NIL != f41626(var1) : var1;
        return var1.setField13(var4);
    }
    
    public static SubLObject f41653(final SubLObject var1, final SubLObject var4) {
        assert NIL != f41626(var1) : var1;
        return var1.setField14(var4);
    }
    
    public static SubLObject f41654(final SubLObject var1, final SubLObject var4) {
        assert NIL != f41626(var1) : var1;
        return var1.setField15(var4);
    }
    
    public static SubLObject f41655(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX45613_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic37$)) {
                f41641(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic38$)) {
                f41642(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic39$)) {
                f41643(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic40$)) {
                f41644(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic41$)) {
                f41645(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic42$)) {
                f41646(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic43$)) {
                f41647(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic44$)) {
                f41648(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic45$)) {
                f41649(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic46$)) {
                f41650(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic47$)) {
                f41651(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic48$)) {
                f41652(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic49$)) {
                f41653(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic50$)) {
                f41654(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic51$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f41656(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic52$, (SubLObject)$ic53$, (SubLObject)FOURTEEN_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic54$, (SubLObject)$ic37$, f41627(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic54$, (SubLObject)$ic38$, f41628(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic54$, (SubLObject)$ic39$, f41629(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic54$, (SubLObject)$ic40$, f41630(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic54$, (SubLObject)$ic41$, f41631(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic54$, (SubLObject)$ic42$, f41632(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic54$, (SubLObject)$ic43$, f41633(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic54$, (SubLObject)$ic44$, f41634(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic54$, (SubLObject)$ic45$, f41635(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic54$, (SubLObject)$ic46$, f41636(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic54$, (SubLObject)$ic47$, f41637(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic54$, (SubLObject)$ic48$, f41638(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic54$, (SubLObject)$ic49$, f41639(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic54$, (SubLObject)$ic50$, f41640(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic55$, (SubLObject)$ic53$, (SubLObject)FOURTEEN_INTEGER);
        return var11;
    }
    
    public static SubLObject f41657(final SubLObject var11, final SubLObject var12) {
        return f41656(var11, var12);
    }
    
    public static SubLObject f41658(final SubLObject var13, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        assert NIL != module0423.f29532(var13) : var13;
        if (NIL != var14 && !areAssertionsDisabledFor(me) && NIL == module0686.f42037(var14)) {
            throw new AssertionError(var14);
        }
        final SubLObject var15 = f41655((SubLObject)UNPROVIDED);
        f41641(var15, var13);
        f41642(var15, module0656.f39942(var13));
        f41643(var15, module0423.f29571(var13));
        f41644(var15, var14);
        f41645(var15, module0423.f29581(var13));
        f41647(var15, module0423.f29562(var13));
        f41653(var15, module0423.f29566(var13));
        f41648(var15, module0423.f29568(var13));
        f41649(var15, module0423.f29555(var13));
        if (NIL != f41635(var15)) {
            f41650(var15, module0423.f29561(f41635(var15)));
            f41651(var15, module0423.f29572(f41635(var15)));
        }
        f41652(var15, conses_high.remf(module0423.f29573(var13), (SubLObject)$ic49$));
        f41654(var15, module0423.f29551(var13));
        return var15;
    }
    
    public static SubLObject f41659(final SubLObject var16, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        assert NIL != inference_datastructures_inference_oc.f25275(var16) : var16;
        if (NIL != var14 && !areAssertionsDisabledFor(me) && NIL == module0686.f42037(var14)) {
            throw new AssertionError(var14);
        }
        final SubLObject var17 = f41655((SubLObject)UNPROVIDED);
        f41641(var17, module0684.f41928(var16));
        f41645(var17, module0423.f29580());
        f41646(var17, var16);
        f41647(var17, (SubLObject)ConsesLow.list(inference_datastructures_inference_oc.f25423(var16)));
        f41648(var17, (SubLObject)ConsesLow.list(inference_datastructures_inference_oc.f25424(var16)));
        f41652(var17, inference_datastructures_inference_oc.f25483(var16));
        f41653(var17, inference_datastructures_inference_oc.f25482(var16));
        f41654(var17, (SubLObject)NIL);
        return var17;
    }
    
    public static SubLObject f41660(final SubLObject var15) {
        assert NIL != f41626(var15) : var15;
        return f41633(var15).first();
    }
    
    public static SubLObject f41661(final SubLObject var15) {
        assert NIL != f41626(var15) : var15;
        return f41633(var15).rest();
    }
    
    public static SubLObject f41662(final SubLObject var15) {
        assert NIL != f41626(var15) : var15;
        return f41634(var15).first();
    }
    
    public static SubLObject f41663(final SubLObject var15) {
        assert NIL != f41626(var15) : var15;
        return f41634(var15).rest();
    }
    
    public static SubLObject f41664() {
        $g5351$.setDynamicValue((SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41665() {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        return $g5351$.getDynamicValue(var17);
    }
    
    public static SubLObject f41666(final SubLObject var18) {
        $g5351$.setDynamicValue(var18);
        return var18;
    }
    
    public static SubLObject f41667() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0682", "f41625", "S#45617", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0682", "f41626", "S#45614", 1, 0, false);
        new $f41626$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0682", "f41627", "S#45618", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0682", "f41628", "S#45619", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0682", "f41629", "S#45620", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0682", "f41630", "S#45621", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0682", "f41631", "S#45622", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0682", "f41632", "S#45623", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0682", "f41633", "S#45624", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0682", "f41634", "S#45625", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0682", "f41635", "S#45626", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0682", "f41636", "S#45627", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0682", "f41637", "S#45628", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0682", "f41638", "S#45629", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0682", "f41639", "S#45630", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0682", "f41640", "S#45631", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0682", "f41641", "S#45632", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0682", "f41642", "S#45633", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0682", "f41643", "S#45634", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0682", "f41644", "S#45635", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0682", "f41645", "S#45636", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0682", "f41646", "S#45637", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0682", "f41647", "S#45638", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0682", "f41648", "S#45639", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0682", "f41649", "S#45640", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0682", "f41650", "S#45641", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0682", "f41651", "S#45642", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0682", "f41652", "S#45643", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0682", "f41653", "S#45644", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0682", "f41654", "S#45645", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0682", "f41655", "S#45646", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0682", "f41656", "S#45647", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0682", "f41657", "S#45648", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0682", "f41658", "S#45649", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0682", "f41659", "S#45650", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0682", "f41660", "S#45651", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0682", "f41661", "S#45652", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0682", "f41662", "S#45653", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0682", "f41663", "S#45654", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0682", "f41664", "S#45655", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0682", "f41665", "S#45656", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0682", "f41666", "S#45657", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41668() {
        $g5350$ = SubLFiles.defconstant("S#45658", (SubLObject)$ic0$);
        $g5351$ = SubLFiles.defvar("S#45659", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41669() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g5350$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic8$);
        Structures.def_csetf((SubLObject)$ic9$, (SubLObject)$ic10$);
        Structures.def_csetf((SubLObject)$ic11$, (SubLObject)$ic12$);
        Structures.def_csetf((SubLObject)$ic13$, (SubLObject)$ic14$);
        Structures.def_csetf((SubLObject)$ic15$, (SubLObject)$ic16$);
        Structures.def_csetf((SubLObject)$ic17$, (SubLObject)$ic18$);
        Structures.def_csetf((SubLObject)$ic19$, (SubLObject)$ic20$);
        Structures.def_csetf((SubLObject)$ic21$, (SubLObject)$ic22$);
        Structures.def_csetf((SubLObject)$ic23$, (SubLObject)$ic24$);
        Structures.def_csetf((SubLObject)$ic25$, (SubLObject)$ic26$);
        Structures.def_csetf((SubLObject)$ic27$, (SubLObject)$ic28$);
        Structures.def_csetf((SubLObject)$ic29$, (SubLObject)$ic30$);
        Structures.def_csetf((SubLObject)$ic31$, (SubLObject)$ic32$);
        Structures.def_csetf((SubLObject)$ic33$, (SubLObject)$ic34$);
        Structures.def_csetf((SubLObject)$ic35$, (SubLObject)$ic36$);
        Equality.identity((SubLObject)$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g5350$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic56$));
        module0012.f441((SubLObject)$ic60$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f41667();
    }
    
    public void initializeVariables() {
        f41668();
    }
    
    public void runTopLevelForms() {
        f41669();
    }
    
    static {
        me = (SubLFile)new module0682();
        $g5350$ = null;
        $g5351$ = null;
        $ic0$ = makeSymbol("S#45613", "CYC");
        $ic1$ = makeSymbol("S#45614", "CYC");
        $ic2$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#33256", "CYC"), makeSymbol("S#29", "CYC"), makeSymbol("S#45660", "CYC"), makeSymbol("S#45661", "CYC"), makeSymbol("S#45662", "CYC"), makeSymbol("S#25426", "CYC"), makeSymbol("S#45663", "CYC"), makeSymbol("S#45664", "CYC"), makeSymbol("S#33867", "CYC"), makeSymbol("S#45665", "CYC"), makeSymbol("S#45666", "CYC"), makeSymbol("S#32187", "CYC"), makeSymbol("S#45667", "CYC"), makeSymbol("S#45668", "CYC") });
        $ic3$ = ConsesLow.list(new SubLObject[] { makeKeyword("QUERY-SPEC"), makeKeyword("NAME"), makeKeyword("COMMENTS"), makeKeyword("TEST-STATE"), makeKeyword("SAVE-MT"), makeKeyword("INFERENCE"), makeKeyword("SENTENCES"), makeKeyword("QUERY-MTS"), makeKeyword("TEMPLATE"), makeKeyword("TEMPLATE-FOLDER-MT-PAIRS"), makeKeyword("TEMPLATE-GLOSSES"), makeKeyword("QUERY-PROPERTIES"), makeKeyword("NON-EXPLANATORY-SENTENCE"), makeKeyword("MULTIPLE-CHOICE-OPTION-SPECS") });
        $ic4$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#45618", "CYC"), makeSymbol("S#45619", "CYC"), makeSymbol("S#45620", "CYC"), makeSymbol("S#45621", "CYC"), makeSymbol("S#45622", "CYC"), makeSymbol("S#45623", "CYC"), makeSymbol("S#45624", "CYC"), makeSymbol("S#45625", "CYC"), makeSymbol("S#45626", "CYC"), makeSymbol("S#45627", "CYC"), makeSymbol("S#45628", "CYC"), makeSymbol("S#45629", "CYC"), makeSymbol("S#45630", "CYC"), makeSymbol("S#45631", "CYC") });
        $ic5$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#45632", "CYC"), makeSymbol("S#45633", "CYC"), makeSymbol("S#45634", "CYC"), makeSymbol("S#45635", "CYC"), makeSymbol("S#45636", "CYC"), makeSymbol("S#45637", "CYC"), makeSymbol("S#45638", "CYC"), makeSymbol("S#45639", "CYC"), makeSymbol("S#45640", "CYC"), makeSymbol("S#45641", "CYC"), makeSymbol("S#45642", "CYC"), makeSymbol("S#45643", "CYC"), makeSymbol("S#45644", "CYC"), makeSymbol("S#45645", "CYC") });
        $ic6$ = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic7$ = makeSymbol("S#45617", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#45614", "CYC"));
        $ic9$ = makeSymbol("S#45618", "CYC");
        $ic10$ = makeSymbol("S#45632", "CYC");
        $ic11$ = makeSymbol("S#45619", "CYC");
        $ic12$ = makeSymbol("S#45633", "CYC");
        $ic13$ = makeSymbol("S#45620", "CYC");
        $ic14$ = makeSymbol("S#45634", "CYC");
        $ic15$ = makeSymbol("S#45621", "CYC");
        $ic16$ = makeSymbol("S#45635", "CYC");
        $ic17$ = makeSymbol("S#45622", "CYC");
        $ic18$ = makeSymbol("S#45636", "CYC");
        $ic19$ = makeSymbol("S#45623", "CYC");
        $ic20$ = makeSymbol("S#45637", "CYC");
        $ic21$ = makeSymbol("S#45624", "CYC");
        $ic22$ = makeSymbol("S#45638", "CYC");
        $ic23$ = makeSymbol("S#45625", "CYC");
        $ic24$ = makeSymbol("S#45639", "CYC");
        $ic25$ = makeSymbol("S#45626", "CYC");
        $ic26$ = makeSymbol("S#45640", "CYC");
        $ic27$ = makeSymbol("S#45627", "CYC");
        $ic28$ = makeSymbol("S#45641", "CYC");
        $ic29$ = makeSymbol("S#45628", "CYC");
        $ic30$ = makeSymbol("S#45642", "CYC");
        $ic31$ = makeSymbol("S#45629", "CYC");
        $ic32$ = makeSymbol("S#45643", "CYC");
        $ic33$ = makeSymbol("S#45630", "CYC");
        $ic34$ = makeSymbol("S#45644", "CYC");
        $ic35$ = makeSymbol("S#45631", "CYC");
        $ic36$ = makeSymbol("S#45645", "CYC");
        $ic37$ = makeKeyword("QUERY-SPEC");
        $ic38$ = makeKeyword("NAME");
        $ic39$ = makeKeyword("COMMENTS");
        $ic40$ = makeKeyword("TEST-STATE");
        $ic41$ = makeKeyword("SAVE-MT");
        $ic42$ = makeKeyword("INFERENCE");
        $ic43$ = makeKeyword("SENTENCES");
        $ic44$ = makeKeyword("QUERY-MTS");
        $ic45$ = makeKeyword("TEMPLATE");
        $ic46$ = makeKeyword("TEMPLATE-FOLDER-MT-PAIRS");
        $ic47$ = makeKeyword("TEMPLATE-GLOSSES");
        $ic48$ = makeKeyword("QUERY-PROPERTIES");
        $ic49$ = makeKeyword("NON-EXPLANATORY-SENTENCE");
        $ic50$ = makeKeyword("MULTIPLE-CHOICE-OPTION-SPECS");
        $ic51$ = makeString("Invalid slot ~S for construction function");
        $ic52$ = makeKeyword("BEGIN");
        $ic53$ = makeSymbol("S#45646", "CYC");
        $ic54$ = makeKeyword("SLOT");
        $ic55$ = makeKeyword("END");
        $ic56$ = makeSymbol("S#45648", "CYC");
        $ic57$ = makeSymbol("S#32663", "CYC");
        $ic58$ = makeSymbol("S#45615", "CYC");
        $ic59$ = makeSymbol("INFERENCE-P");
        $ic60$ = makeSymbol("S#45659", "CYC");
    }
    
    public static final class $sX45613_native extends SubLStructNative
    {
        public SubLObject $query_spec;
        public SubLObject $name;
        public SubLObject $comments;
        public SubLObject $test_state;
        public SubLObject $save_mt;
        public SubLObject $inference;
        public SubLObject $sentences;
        public SubLObject $query_mts;
        public SubLObject $template;
        public SubLObject $template_folder_mt_pairs;
        public SubLObject $template_glosses;
        public SubLObject $query_properties;
        public SubLObject $non_explanatory_sentence;
        public SubLObject $multiple_choice_option_specs;
        public static final SubLStructDeclNative structDecl;
        
        public $sX45613_native() {
            this.$query_spec = (SubLObject)CommonSymbols.NIL;
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$comments = (SubLObject)CommonSymbols.NIL;
            this.$test_state = (SubLObject)CommonSymbols.NIL;
            this.$save_mt = (SubLObject)CommonSymbols.NIL;
            this.$inference = (SubLObject)CommonSymbols.NIL;
            this.$sentences = (SubLObject)CommonSymbols.NIL;
            this.$query_mts = (SubLObject)CommonSymbols.NIL;
            this.$template = (SubLObject)CommonSymbols.NIL;
            this.$template_folder_mt_pairs = (SubLObject)CommonSymbols.NIL;
            this.$template_glosses = (SubLObject)CommonSymbols.NIL;
            this.$query_properties = (SubLObject)CommonSymbols.NIL;
            this.$non_explanatory_sentence = (SubLObject)CommonSymbols.NIL;
            this.$multiple_choice_option_specs = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$query_spec;
        }
        
        public SubLObject getField3() {
            return this.$name;
        }
        
        public SubLObject getField4() {
            return this.$comments;
        }
        
        public SubLObject getField5() {
            return this.$test_state;
        }
        
        public SubLObject getField6() {
            return this.$save_mt;
        }
        
        public SubLObject getField7() {
            return this.$inference;
        }
        
        public SubLObject getField8() {
            return this.$sentences;
        }
        
        public SubLObject getField9() {
            return this.$query_mts;
        }
        
        public SubLObject getField10() {
            return this.$template;
        }
        
        public SubLObject getField11() {
            return this.$template_folder_mt_pairs;
        }
        
        public SubLObject getField12() {
            return this.$template_glosses;
        }
        
        public SubLObject getField13() {
            return this.$query_properties;
        }
        
        public SubLObject getField14() {
            return this.$non_explanatory_sentence;
        }
        
        public SubLObject getField15() {
            return this.$multiple_choice_option_specs;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$query_spec = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$name = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$comments = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$test_state = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$save_mt = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$inference = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$sentences = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$query_mts = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$template = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$template_folder_mt_pairs = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$template_glosses = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$query_properties = value;
        }
        
        public SubLObject setField14(final SubLObject value) {
            return this.$non_explanatory_sentence = value;
        }
        
        public SubLObject setField15(final SubLObject value) {
            return this.$multiple_choice_option_specs = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX45613_native.class, $ic0$, $ic1$, $ic2$, $ic3$, new String[] { "$query_spec", "$name", "$comments", "$test_state", "$save_mt", "$inference", "$sentences", "$query_mts", "$template", "$template_folder_mt_pairs", "$template_glosses", "$query_properties", "$non_explanatory_sentence", "$multiple_choice_option_specs" }, $ic4$, $ic5$, $ic6$);
        }
    }
    
    public static final class $f41626$UnaryFunction extends UnaryFunction
    {
        public $f41626$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#45614"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f41626(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 165 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/