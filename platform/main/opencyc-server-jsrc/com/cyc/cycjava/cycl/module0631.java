package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0631 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0631";
    public static final String myFingerPrint = "0ad818adf251d98a103d124a4b13fd2ef70b07d8ea2de1448134e943fcdc23c3";
    public static SubLSymbol $g4837$;
    public static SubLSymbol $g4838$;
    public static SubLSymbol $g4839$;
    public static SubLSymbol $g4840$;
    public static SubLSymbol $g4841$;
    public static SubLSymbol $g4842$;
    public static SubLSymbol $g4843$;
    public static SubLSymbol $g4844$;
    public static SubLSymbol $g4845$;
    public static SubLSymbol $g4846$;
    public static SubLSymbol $g4847$;
    public static SubLSymbol $g4848$;
    public static SubLSymbol $g4849$;
    public static SubLSymbol $g4850$;
    public static SubLSymbol $g4851$;
    public static SubLSymbol $g4852$;
    public static SubLSymbol $g4853$;
    public static SubLSymbol $g4854$;
    public static SubLSymbol $g4855$;
    public static SubLSymbol $g4856$;
    public static SubLSymbol $g4857$;
    public static SubLSymbol $g4858$;
    public static SubLSymbol $g4859$;
    public static SubLSymbol $g4860$;
    public static SubLSymbol $g4861$;
    public static SubLSymbol $g4862$;
    public static SubLSymbol $g4863$;
    public static SubLSymbol $g4864$;
    public static SubLSymbol $g4865$;
    public static SubLSymbol $g4866$;
    public static SubLSymbol $g4867$;
    public static SubLSymbol $g4868$;
    public static SubLSymbol $g4869$;
    public static SubLSymbol $g4870$;
    public static SubLSymbol $g4871$;
    public static SubLSymbol $g4872$;
    public static SubLSymbol $g4873$;
    public static SubLSymbol $g4874$;
    public static SubLSymbol $g4875$;
    public static SubLSymbol $g4876$;
    public static SubLSymbol $g4877$;
    public static SubLSymbol $g4878$;
    public static SubLSymbol $g4879$;
    public static SubLSymbol $g4880$;
    public static SubLSymbol $g4881$;
    public static SubLSymbol $g4882$;
    public static SubLSymbol $g4883$;
    public static SubLSymbol $g4884$;
    public static SubLSymbol $g4885$;
    public static SubLSymbol $g4886$;
    public static SubLSymbol $g4887$;
    public static SubLSymbol $g4888$;
    public static SubLSymbol $g4889$;
    public static SubLSymbol $g4890$;
    public static SubLSymbol $g4891$;
    public static SubLSymbol $g4892$;
    public static SubLSymbol $g4893$;
    public static SubLSymbol $g4894$;
    public static SubLSymbol $g4895$;
    public static SubLSymbol $g4896$;
    public static SubLSymbol $g4897$;
    public static SubLSymbol $g4898$;
    public static SubLSymbol $g4899$;
    public static SubLSymbol $g4900$;
    public static SubLSymbol $g4901$;
    public static SubLSymbol $g4902$;
    public static SubLSymbol $g4903$;
    public static SubLSymbol $g4904$;
    public static SubLSymbol $g4905$;
    public static SubLSymbol $g4906$;
    public static SubLSymbol $g4907$;
    public static SubLSymbol $g4908$;
    public static SubLSymbol $g4909$;
    public static SubLSymbol $g4910$;
    public static SubLSymbol $g4911$;
    public static SubLSymbol $g4912$;
    public static SubLSymbol $g4913$;
    public static SubLSymbol $g4914$;
    public static SubLSymbol $g4915$;
    public static SubLSymbol $g4916$;
    public static SubLSymbol $g4917$;
    public static SubLSymbol $g4918$;
    public static SubLSymbol $g4919$;
    public static SubLSymbol $g4920$;
    public static SubLSymbol $g4921$;
    public static SubLSymbol $g4922$;
    public static SubLSymbol $g4923$;
    public static SubLSymbol $g4924$;
    public static SubLSymbol $g4925$;
    public static SubLSymbol $g4926$;
    public static SubLSymbol $g4927$;
    public static SubLSymbol $g4928$;
    public static SubLSymbol $g4929$;
    public static SubLSymbol $g4930$;
    public static SubLSymbol $g4931$;
    public static SubLSymbol $g4932$;
    public static SubLSymbol $g4933$;
    public static SubLSymbol $g4934$;
    public static SubLSymbol $g4935$;
    private static SubLSymbol $g4936$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLObject $ic18$;
    private static final SubLObject $ic19$;
    private static final SubLString $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLString $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLString $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLString $ic26$;
    private static final SubLList $ic27$;
    private static final SubLObject $ic28$;
    private static final SubLObject $ic29$;
    private static final SubLObject $ic30$;
    private static final SubLObject $ic31$;
    private static final SubLObject $ic32$;
    private static final SubLObject $ic33$;
    private static final SubLList $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLInteger $ic40$;
    private static final SubLString $ic41$;
    private static final SubLInteger $ic42$;
    private static final SubLString $ic43$;
    private static final SubLInteger $ic44$;
    private static final SubLString $ic45$;
    private static final SubLString $ic46$;
    private static final SubLString $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLString $ic50$;
    private static final SubLString $ic51$;
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    private static final SubLString $ic55$;
    private static final SubLString $ic56$;
    private static final SubLString $ic57$;
    private static final SubLString $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLString $ic62$;
    private static final SubLString $ic63$;
    private static final SubLString $ic64$;
    private static final SubLString $ic65$;
    private static final SubLString $ic66$;
    private static final SubLString $ic67$;
    private static final SubLString $ic68$;
    private static final SubLString $ic69$;
    private static final SubLString $ic70$;
    private static final SubLString $ic71$;
    private static final SubLString $ic72$;
    private static final SubLString $ic73$;
    private static final SubLString $ic74$;
    private static final SubLString $ic75$;
    private static final SubLString $ic76$;
    private static final SubLString $ic77$;
    private static final SubLString $ic78$;
    private static final SubLString $ic79$;
    private static final SubLString $ic80$;
    private static final SubLString $ic81$;
    private static final SubLString $ic82$;
    private static final SubLString $ic83$;
    private static final SubLString $ic84$;
    private static final SubLString $ic85$;
    private static final SubLString $ic86$;
    private static final SubLString $ic87$;
    private static final SubLString $ic88$;
    private static final SubLString $ic89$;
    private static final SubLString $ic90$;
    private static final SubLString $ic91$;
    private static final SubLString $ic92$;
    private static final SubLString $ic93$;
    private static final SubLString $ic94$;
    private static final SubLString $ic95$;
    private static final SubLString $ic96$;
    private static final SubLString $ic97$;
    private static final SubLString $ic98$;
    private static final SubLString $ic99$;
    private static final SubLString $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLObject $ic108$;
    private static final SubLObject $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLObject $ic111$;
    private static final SubLObject $ic112$;
    private static final SubLSymbol $ic113$;
    
    public static SubLObject f38678() {
        $g4837$.setGlobalValue(module0038.f2624(constants_high_oc.f10757($ic18$)));
        $g4838$.setGlobalValue(module0038.f2624(constants_high_oc.f10757($ic19$)));
        $g4839$.setGlobalValue((SubLObject)$ic20$);
        $g4840$.setGlobalValue(module0233.f15415((SubLObject)ConsesLow.list(module0233.f15418((SubLObject)$ic21$, (SubLObject)$ic22$))));
        $g4841$.setGlobalValue(module0233.f15415((SubLObject)ConsesLow.list(module0233.f15418((SubLObject)$ic23$, (SubLObject)$ic24$))));
        $g4842$.setGlobalValue(module0233.f15412((SubLObject)ConsesLow.list(module0233.f15415((SubLObject)ConsesLow.list(module0233.f15418((SubLObject)$ic21$, (SubLObject)$ic22$))))));
        $g4843$.setGlobalValue(module0233.f15412((SubLObject)ConsesLow.list(module0233.f15415((SubLObject)ConsesLow.list(module0233.f15418((SubLObject)$ic23$, (SubLObject)$ic24$))))));
        $g4844$.setGlobalValue(module0233.f15412((SubLObject)ConsesLow.list(module0233.f15415((SubLObject)ConsesLow.list(module0233.f15418((SubLObject)$ic25$, (SubLObject)$ic26$))))));
        $g4845$.setGlobalValue((SubLObject)$ic27$);
        $g4846$.setGlobalValue($ic28$);
        $g4847$.setGlobalValue($ic29$);
        $g4848$.setGlobalValue(module0038.f2624(constants_high_oc.f10757($ic30$)));
        $g4849$.setGlobalValue(module0038.f2624(constants_high_oc.f10757($ic31$)));
        $g4850$.setGlobalValue(module0038.f2624(constants_high_oc.f10757($ic32$)));
        $g4851$.setGlobalValue(module0038.f2624(constants_high_oc.f10757($ic33$)));
        $g4852$.setGlobalValue((SubLObject)$ic34$);
        $g4853$.setGlobalValue($ic28$);
        $g4854$.setGlobalValue(module0038.f2624(constants_high_oc.f10757($ic32$)));
        return (SubLObject)T;
    }
    
    public static SubLObject f38679(final SubLObject var1) {
        return (SubLObject)makeBoolean(var1.equalp($g4889$.getGlobalValue()) || var1.equalp($g4890$.getGlobalValue()));
    }
    
    public static SubLObject f38680(final SubLObject var1) {
        return (SubLObject)makeBoolean(var1.equalp($g4893$.getGlobalValue()) || var1.equalp($g4894$.getGlobalValue()) || var1.equalp($g4895$.getGlobalValue()));
    }
    
    public static SubLObject f38681(final SubLObject var2) {
        return (SubLObject)makeBoolean(var2.equalp($g4900$.getGlobalValue()) || var2.equalp($g4901$.getGlobalValue()));
    }
    
    public static SubLObject f38682(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var4) && NIL == var3) {
            Errors.error((SubLObject)$ic81$);
        }
        if (NIL != f38683(var3)) {
            return (SubLObject)T;
        }
        return module0067.f4886($g4935$.getDynamicValue(var4), var3, (SubLObject)T);
    }
    
    public static SubLObject f38683(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return module0067.f4884($g4935$.getDynamicValue(var4), var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f38684(SubLObject var5, final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = conses_high.second(conses_high.assoc(var6, $g4936$.getDynamicValue(var7), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        if (NIL != var8) {
            var5 = module0038.f2629(var8, module0038.f2735(var5));
        }
        if (var5.isString()) {
            return module0038.f2735(var5);
        }
        return var5;
    }
    
    public static SubLObject f38685(final SubLObject var8) {
        return conses_high.member(var8, $g4855$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f38686(final SubLObject var9) {
        return conses_high.member(var9, $g4856$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f38687(final SubLObject var2) {
        return conses_high.member(var2, $g4874$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f38688(final SubLObject var10) {
        return conses_high.member(var10, $g4875$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f38689(final SubLObject var2) {
        return conses_high.member(var2, $g4915$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f38690(final SubLObject var11) {
        return conses_high.member(var11, $g4916$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f38691(final SubLObject var1) {
        if (var1.eql((SubLObject)$ic101$) || var1.eql((SubLObject)$ic102$) || var1.eql((SubLObject)$ic103$) || var1.eql((SubLObject)$ic104$) || var1.eql((SubLObject)$ic105$) || var1.eql((SubLObject)$ic106$)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38692(final SubLObject var1) {
        return conses_high.member(var1, $g4911$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f38693(SubLObject var13, final SubLObject var14, final SubLObject var15) {
        if (NIL != var14) {
            var13 = module0038.f2633(var13, var14);
        }
        if (NIL != var15) {
            var13 = module0038.f2634(var13, var15);
        }
        return var13;
    }
    
    public static SubLObject f38694(final SubLObject var13) {
        return module0038.f2626(module0038.f2626(var13));
    }
    
    public static SubLObject f38695(final SubLObject var16) {
        assert NIL != Types.keywordp(var16) : var16;
        return module0594.f36340(var16, $ic108$);
    }
    
    public static SubLObject f38696(final SubLObject var16) {
        assert NIL != Types.keywordp(var16) : var16;
        return module0594.f36340(var16, $ic109$);
    }
    
    public static SubLObject f38697(final SubLObject var17) {
        assert NIL != constant_handles_oc.f8449(var17) : var17;
        return module0594.f36343(var17);
    }
    
    public static SubLObject f38698(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0173.f10955(var1) && NIL != module0259.f16891(var1, $ic111$));
    }
    
    public static SubLObject f38699(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0173.f10955(var1) && NIL != module0259.f16891(var1, $ic112$));
    }
    
    public static SubLObject f38700() {
        SubLObject var18 = module0035.remove_if_not(Symbols.symbol_function((SubLObject)$ic110$), module0259.f16850($ic108$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        var18 = Sequences.remove_if(Symbols.symbol_function((SubLObject)$ic113$), var18, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var18;
    }
    
    public static SubLObject f38701() {
        SubLObject var18 = module0035.remove_if_not(Symbols.symbol_function((SubLObject)$ic110$), module0259.f16850($ic109$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        var18 = Sequences.remove_if(Symbols.symbol_function((SubLObject)$ic113$), var18, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var18;
    }
    
    public static SubLObject f38702() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0631", "f38678", "S#42317", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0631", "f38679", "S#42318", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0631", "f38680", "S#42319", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0631", "f38681", "S#42320", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0631", "f38682", "S#42321", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0631", "f38683", "S#42322", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0631", "f38684", "S#42323", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0631", "f38685", "S#42324", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0631", "f38686", "S#42325", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0631", "f38687", "S#42326", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0631", "f38688", "S#42327", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0631", "f38689", "S#42328", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0631", "f38690", "S#42329", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0631", "f38691", "S#42330", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0631", "f38692", "S#42331", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0631", "f38693", "S#42332", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0631", "f38694", "S#42333", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0631", "f38695", "S#42334", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0631", "f38696", "S#42335", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0631", "f38697", "S#42336", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0631", "f38698", "S#42337", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0631", "f38699", "S#42338", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0631", "f38700", "S#42339", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0631", "f38701", "S#42340", 0, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38703() {
        $g4837$ = SubLFiles.deflexical("S#42341", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic0$)) ? $g4837$.getGlobalValue() : NIL));
        $g4838$ = SubLFiles.deflexical("S#42342", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic1$)) ? $g4838$.getGlobalValue() : NIL));
        $g4839$ = SubLFiles.deflexical("S#42343", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic2$)) ? $g4839$.getGlobalValue() : NIL));
        $g4840$ = SubLFiles.deflexical("S#42344", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic3$)) ? $g4840$.getGlobalValue() : NIL));
        $g4841$ = SubLFiles.deflexical("S#42345", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic4$)) ? $g4841$.getGlobalValue() : NIL));
        $g4842$ = SubLFiles.deflexical("S#42346", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic5$)) ? $g4842$.getGlobalValue() : NIL));
        $g4843$ = SubLFiles.deflexical("S#42347", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic6$)) ? $g4843$.getGlobalValue() : NIL));
        $g4844$ = SubLFiles.deflexical("S#42348", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic7$)) ? $g4844$.getGlobalValue() : NIL));
        $g4845$ = SubLFiles.deflexical("S#42349", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic8$)) ? $g4845$.getGlobalValue() : NIL));
        $g4846$ = SubLFiles.deflexical("S#42350", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic9$)) ? $g4846$.getGlobalValue() : NIL));
        $g4847$ = SubLFiles.deflexical("S#42351", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic10$)) ? $g4847$.getGlobalValue() : NIL));
        $g4848$ = SubLFiles.deflexical("S#42352", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic11$)) ? $g4848$.getGlobalValue() : NIL));
        $g4849$ = SubLFiles.deflexical("S#42353", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic12$)) ? $g4849$.getGlobalValue() : NIL));
        $g4850$ = SubLFiles.deflexical("S#42354", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic13$)) ? $g4850$.getGlobalValue() : NIL));
        $g4851$ = SubLFiles.deflexical("S#42355", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic14$)) ? $g4851$.getGlobalValue() : NIL));
        $g4852$ = SubLFiles.deflexical("S#42356", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic15$)) ? $g4852$.getGlobalValue() : NIL));
        $g4853$ = SubLFiles.deflexical("S#42357", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic16$)) ? $g4853$.getGlobalValue() : NIL));
        $g4854$ = SubLFiles.deflexical("S#42358", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic17$)) ? $g4854$.getGlobalValue() : NIL));
        $g4855$ = SubLFiles.defconstant("S#42359", (SubLObject)ConsesLow.list((SubLObject)$ic35$, (SubLObject)$ic36$));
        $g4856$ = SubLFiles.defconstant("S#42360", (SubLObject)ConsesLow.list((SubLObject)$ic37$, (SubLObject)$ic38$, (SubLObject)$ic39$));
        $g4857$ = SubLFiles.defconstant("S#42361", (SubLObject)$ic40$);
        $g4858$ = SubLFiles.defconstant("S#42362", (SubLObject)$ic41$);
        $g4859$ = SubLFiles.defconstant("S#42363", (SubLObject)$ic42$);
        $g4860$ = SubLFiles.defconstant("S#42364", (SubLObject)$ic42$);
        $g4861$ = SubLFiles.defconstant("S#42365", (SubLObject)TEN_INTEGER);
        $g4862$ = SubLFiles.defconstant("S#42366", (SubLObject)TWELVE_INTEGER);
        $g4863$ = SubLFiles.defconstant("S#42367", (SubLObject)$ic43$);
        $g4864$ = SubLFiles.defconstant("S#42368", (SubLObject)$ic44$);
        $g4865$ = SubLFiles.defconstant("S#42369", (SubLObject)$ic42$);
        $g4866$ = SubLFiles.defconstant("S#42370", (SubLObject)TWENTY_INTEGER);
        $g4867$ = SubLFiles.defconstant("S#42371", (SubLObject)$ic42$);
        $g4868$ = SubLFiles.defconstant("S#42372", (SubLObject)$ic45$);
        $g4869$ = SubLFiles.defconstant("S#42373", (SubLObject)$ic44$);
        $g4870$ = SubLFiles.defconstant("S#42374", (SubLObject)TWENTY_INTEGER);
        $g4871$ = SubLFiles.defconstant("S#42375", (SubLObject)NINETEEN_INTEGER);
        $g4872$ = SubLFiles.defconstant("S#42376", (SubLObject)TEN_INTEGER);
        $g4873$ = SubLFiles.defconstant("S#42377", (SubLObject)ONE_INTEGER);
        $g4874$ = SubLFiles.defconstant("S#42378", (SubLObject)ConsesLow.list((SubLObject)$ic46$));
        $g4875$ = SubLFiles.defconstant("S#42379", (SubLObject)ConsesLow.list((SubLObject)$ic47$, (SubLObject)$ic48$, (SubLObject)$ic49$, (SubLObject)$ic50$, (SubLObject)$ic51$, (SubLObject)$ic52$));
        $g4876$ = SubLFiles.defconstant("S#42380", (SubLObject)$ic47$);
        $g4877$ = SubLFiles.defconstant("S#42381", (SubLObject)$ic48$);
        $g4878$ = SubLFiles.defconstant("S#42382", (SubLObject)$ic49$);
        $g4879$ = SubLFiles.defconstant("S#42383", (SubLObject)$ic50$);
        $g4880$ = SubLFiles.defconstant("S#42384", (SubLObject)$ic51$);
        $g4881$ = SubLFiles.defconstant("S#42385", (SubLObject)$ic52$);
        $g4882$ = SubLFiles.defconstant("S#42386", (SubLObject)$ic46$);
        $g4883$ = SubLFiles.defconstant("S#42387", (SubLObject)$ic53$);
        $g4884$ = SubLFiles.defconstant("S#42388", (SubLObject)$ic44$);
        $g4885$ = SubLFiles.defconstant("S#42389", (SubLObject)$ic54$);
        $g4886$ = SubLFiles.defconstant("S#42390", (SubLObject)$ic55$);
        $g4887$ = SubLFiles.defconstant("S#42391", (SubLObject)$ic56$);
        $g4888$ = SubLFiles.defconstant("S#42392", (SubLObject)ONE_INTEGER);
        $g4889$ = SubLFiles.defconstant("S#42393", (SubLObject)$ic57$);
        $g4890$ = SubLFiles.defconstant("S#42394", (SubLObject)$ic58$);
        $g4891$ = SubLFiles.defconstant("S#42395", (SubLObject)$ic59$);
        $g4892$ = SubLFiles.defconstant("S#42396", (SubLObject)ONE_INTEGER);
        $g4893$ = SubLFiles.defconstant("S#42397", (SubLObject)$ic60$);
        $g4894$ = SubLFiles.defconstant("S#42398", (SubLObject)$ic61$);
        $g4895$ = SubLFiles.defconstant("S#42399", (SubLObject)$ic62$);
        $g4896$ = SubLFiles.defconstant("S#42400", (SubLObject)$ic63$);
        $g4897$ = SubLFiles.defconstant("S#42401", (SubLObject)$ic64$);
        $g4898$ = SubLFiles.defconstant("S#42402", (SubLObject)$ic65$);
        $g4899$ = SubLFiles.defconstant("S#42403", (SubLObject)ONE_INTEGER);
        $g4900$ = SubLFiles.defconstant("S#42404", (SubLObject)$ic57$);
        $g4901$ = SubLFiles.defconstant("S#42405", (SubLObject)$ic60$);
        $g4902$ = SubLFiles.defconstant("S#42406", (SubLObject)$ic66$);
        $g4903$ = SubLFiles.defconstant("S#42407", (SubLObject)$ic44$);
        $g4904$ = SubLFiles.defconstant("S#42408", (SubLObject)$ic44$);
        $g4905$ = SubLFiles.defconstant("S#42409", (SubLObject)$ic67$);
        $g4906$ = SubLFiles.defconstant("S#42410", (SubLObject)ONE_INTEGER);
        $g4907$ = SubLFiles.defconstant("S#42411", (SubLObject)$ic68$);
        $g4908$ = SubLFiles.defconstant("S#42412", (SubLObject)$ic69$);
        $g4909$ = SubLFiles.defconstant("S#42413", (SubLObject)$ic70$);
        $g4910$ = SubLFiles.defconstant("S#42414", (SubLObject)$ic71$);
        $g4911$ = SubLFiles.defconstant("S#42415", (SubLObject)ConsesLow.list((SubLObject)$ic68$, (SubLObject)$ic69$, (SubLObject)$ic70$, (SubLObject)$ic71$));
        $g4912$ = SubLFiles.defconstant("S#42416", (SubLObject)$ic72$);
        $g4913$ = SubLFiles.defconstant("S#42417", (SubLObject)ONE_INTEGER);
        $g4914$ = SubLFiles.defconstant("S#42418", (SubLObject)ONE_INTEGER);
        $g4915$ = SubLFiles.defconstant("S#42419", (SubLObject)ConsesLow.list((SubLObject)$ic73$, (SubLObject)$ic60$));
        $g4916$ = SubLFiles.defconstant("S#42420", (SubLObject)ConsesLow.list((SubLObject)$ic69$, (SubLObject)$ic70$));
        $g4917$ = SubLFiles.defconstant("S#42421", (SubLObject)$ic69$);
        $g4918$ = SubLFiles.defconstant("S#42422", (SubLObject)$ic70$);
        $g4919$ = SubLFiles.defconstant("S#42423", (SubLObject)$ic60$);
        $g4920$ = SubLFiles.defconstant("S#42424", (SubLObject)$ic73$);
        $g4921$ = SubLFiles.defconstant("S#42425", (SubLObject)$ic74$);
        $g4922$ = SubLFiles.defconstant("S#42426", (SubLObject)$ic44$);
        $g4923$ = SubLFiles.defconstant("S#42427", (SubLObject)$ic75$);
        $g4924$ = SubLFiles.defconstant("S#42428", (SubLObject)ONE_INTEGER);
        $g4925$ = SubLFiles.defconstant("S#42429", (SubLObject)ConsesLow.list((SubLObject)$ic57$, (SubLObject)$ic76$, (SubLObject)$ic77$));
        $g4926$ = SubLFiles.defconstant("S#42430", (SubLObject)$ic57$);
        $g4927$ = SubLFiles.defconstant("S#42431", (SubLObject)$ic76$);
        $g4928$ = SubLFiles.defconstant("S#42432", (SubLObject)$ic77$);
        $g4929$ = SubLFiles.defconstant("S#42433", (SubLObject)$ic78$);
        $g4930$ = SubLFiles.defconstant("S#42434", (SubLObject)$ic79$);
        $g4931$ = SubLFiles.defconstant("S#42435", (SubLObject)$ic80$);
        $g4932$ = SubLFiles.defparameter("S#42436", (SubLObject)NIL);
        $g4933$ = SubLFiles.defparameter("S#42437", (SubLObject)NIL);
        $g4934$ = SubLFiles.defparameter("S#42438", (SubLObject)NIL);
        $g4935$ = SubLFiles.defparameter("S#42439", (SubLObject)NIL);
        $g4936$ = SubLFiles.defparameter("S#42440", (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)$ic82$, $g4906$.getGlobalValue()), ConsesLow.list((SubLObject)$ic83$, $g4903$.getGlobalValue()), ConsesLow.list((SubLObject)$ic84$, $g4904$.getGlobalValue()), ConsesLow.list((SubLObject)$ic85$, $g4888$.getGlobalValue()), ConsesLow.list((SubLObject)$ic86$, $g4869$.getGlobalValue()), ConsesLow.list((SubLObject)$ic87$, $g4859$.getGlobalValue()), ConsesLow.list((SubLObject)$ic88$, $g4860$.getGlobalValue()), ConsesLow.list((SubLObject)$ic89$, $g4884$.getGlobalValue()), ConsesLow.list((SubLObject)$ic90$, $g4869$.getGlobalValue()), ConsesLow.list((SubLObject)$ic91$, $g4862$.getGlobalValue()), ConsesLow.list((SubLObject)$ic92$, $g4866$.getGlobalValue()), ConsesLow.list((SubLObject)$ic93$, $g4864$.getGlobalValue()), ConsesLow.list((SubLObject)$ic94$, $g4865$.getGlobalValue()), ConsesLow.list((SubLObject)$ic95$, $g4867$.getGlobalValue()), ConsesLow.list((SubLObject)$ic96$, $g4913$.getGlobalValue()), ConsesLow.list((SubLObject)$ic97$, $g4861$.getGlobalValue()), ConsesLow.list((SubLObject)$ic98$, $g4869$.getGlobalValue()), ConsesLow.list((SubLObject)$ic99$, $g4872$.getGlobalValue()), ConsesLow.list((SubLObject)$ic100$, $g4870$.getGlobalValue()) }));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38704() {
        module0003.f57((SubLObject)$ic0$);
        module0003.f57((SubLObject)$ic1$);
        module0003.f57((SubLObject)$ic2$);
        module0003.f57((SubLObject)$ic3$);
        module0003.f57((SubLObject)$ic4$);
        module0003.f57((SubLObject)$ic5$);
        module0003.f57((SubLObject)$ic6$);
        module0003.f57((SubLObject)$ic7$);
        module0003.f57((SubLObject)$ic8$);
        module0003.f57((SubLObject)$ic9$);
        module0003.f57((SubLObject)$ic10$);
        module0003.f57((SubLObject)$ic11$);
        module0003.f57((SubLObject)$ic12$);
        module0003.f57((SubLObject)$ic13$);
        module0003.f57((SubLObject)$ic14$);
        module0003.f57((SubLObject)$ic15$);
        module0003.f57((SubLObject)$ic16$);
        module0003.f57((SubLObject)$ic17$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f38702();
    }
    
    public void initializeVariables() {
        f38703();
    }
    
    public void runTopLevelForms() {
        f38704();
    }
    
    static {
        me = (SubLFile)new module0631();
        $g4837$ = null;
        $g4838$ = null;
        $g4839$ = null;
        $g4840$ = null;
        $g4841$ = null;
        $g4842$ = null;
        $g4843$ = null;
        $g4844$ = null;
        $g4845$ = null;
        $g4846$ = null;
        $g4847$ = null;
        $g4848$ = null;
        $g4849$ = null;
        $g4850$ = null;
        $g4851$ = null;
        $g4852$ = null;
        $g4853$ = null;
        $g4854$ = null;
        $g4855$ = null;
        $g4856$ = null;
        $g4857$ = null;
        $g4858$ = null;
        $g4859$ = null;
        $g4860$ = null;
        $g4861$ = null;
        $g4862$ = null;
        $g4863$ = null;
        $g4864$ = null;
        $g4865$ = null;
        $g4866$ = null;
        $g4867$ = null;
        $g4868$ = null;
        $g4869$ = null;
        $g4870$ = null;
        $g4871$ = null;
        $g4872$ = null;
        $g4873$ = null;
        $g4874$ = null;
        $g4875$ = null;
        $g4876$ = null;
        $g4877$ = null;
        $g4878$ = null;
        $g4879$ = null;
        $g4880$ = null;
        $g4881$ = null;
        $g4882$ = null;
        $g4883$ = null;
        $g4884$ = null;
        $g4885$ = null;
        $g4886$ = null;
        $g4887$ = null;
        $g4888$ = null;
        $g4889$ = null;
        $g4890$ = null;
        $g4891$ = null;
        $g4892$ = null;
        $g4893$ = null;
        $g4894$ = null;
        $g4895$ = null;
        $g4896$ = null;
        $g4897$ = null;
        $g4898$ = null;
        $g4899$ = null;
        $g4900$ = null;
        $g4901$ = null;
        $g4902$ = null;
        $g4903$ = null;
        $g4904$ = null;
        $g4905$ = null;
        $g4906$ = null;
        $g4907$ = null;
        $g4908$ = null;
        $g4909$ = null;
        $g4910$ = null;
        $g4911$ = null;
        $g4912$ = null;
        $g4913$ = null;
        $g4914$ = null;
        $g4915$ = null;
        $g4916$ = null;
        $g4917$ = null;
        $g4918$ = null;
        $g4919$ = null;
        $g4920$ = null;
        $g4921$ = null;
        $g4922$ = null;
        $g4923$ = null;
        $g4924$ = null;
        $g4925$ = null;
        $g4926$ = null;
        $g4927$ = null;
        $g4928$ = null;
        $g4929$ = null;
        $g4930$ = null;
        $g4931$ = null;
        $g4932$ = null;
        $g4933$ = null;
        $g4934$ = null;
        $g4935$ = null;
        $g4936$ = null;
        $ic0$ = makeSymbol("S#42341", "CYC");
        $ic1$ = makeSymbol("S#42342", "CYC");
        $ic2$ = makeSymbol("S#42343", "CYC");
        $ic3$ = makeSymbol("S#42344", "CYC");
        $ic4$ = makeSymbol("S#42345", "CYC");
        $ic5$ = makeSymbol("S#42346", "CYC");
        $ic6$ = makeSymbol("S#42347", "CYC");
        $ic7$ = makeSymbol("S#42348", "CYC");
        $ic8$ = makeSymbol("S#42349", "CYC");
        $ic9$ = makeSymbol("S#42350", "CYC");
        $ic10$ = makeSymbol("S#42351", "CYC");
        $ic11$ = makeSymbol("S#42352", "CYC");
        $ic12$ = makeSymbol("S#42353", "CYC");
        $ic13$ = makeSymbol("S#42354", "CYC");
        $ic14$ = makeSymbol("S#42355", "CYC");
        $ic15$ = makeSymbol("S#42356", "CYC");
        $ic16$ = makeSymbol("S#42357", "CYC");
        $ic17$ = makeSymbol("S#42358", "CYC");
        $ic18$ = constant_handles_oc.f8479((SubLObject)makeString("TestResultNotification-EmailBrief"));
        $ic19$ = constant_handles_oc.f8479((SubLObject)makeString("TKBTemplateTestForMissingMt"));
        $ic20$ = makeString("(#$TheSet (#$ELInferenceBindingFn ?SOMETHING \"A SOMETHING\"))");
        $ic21$ = makeSymbol("?SOMETHING");
        $ic22$ = makeString("A SOMETHING");
        $ic23$ = makeSymbol("?OTHERTHING");
        $ic24$ = makeString("ANOTHER THING");
        $ic25$ = makeSymbol("?ANOTHERTHING");
        $ic26$ = makeString("YET ANOTHER THING");
        $ic27$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genls")), constant_handles_oc.f8479((SubLObject)makeString("Collection")), constant_handles_oc.f8479((SubLObject)makeString("Thing")));
        $ic28$ = constant_handles_oc.f8479((SubLObject)makeString("BaseKB"));
        $ic29$ = constant_handles_oc.f8479((SubLObject)makeString("UniversalVocabularyMt"));
        $ic30$ = constant_handles_oc.f8479((SubLObject)makeString("TKBTemplateTestForMissingExplanation"));
        $ic31$ = constant_handles_oc.f8479((SubLObject)makeString("TKBTemplateTestForMissingExample"));
        $ic32$ = constant_handles_oc.f8479((SubLObject)makeString("TKBTemplateIntegrityTest"));
        $ic33$ = constant_handles_oc.f8479((SubLObject)makeString("TKB-RTVQueries"));
        $ic34$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genls")), constant_handles_oc.f8479((SubLObject)makeString("Collection")), (SubLObject)makeSymbol("?WHAT"));
        $ic35$ = makeKeyword("TEXT");
        $ic36$ = makeKeyword("HTML");
        $ic37$ = makeKeyword("BRIEF");
        $ic38$ = makeKeyword("VERBOSE");
        $ic39$ = makeKeyword("POST-BUILD");
        $ic40$ = makeInteger(60);
        $ic41$ = makeString("cyc_system_config");
        $ic42$ = makeInteger(50);
        $ic43$ = makeString("machine_config");
        $ic44$ = makeInteger(100);
        $ic45$ = makeString("test_execution");
        $ic46$ = makeString("KBCONTENT");
        $ic47$ = makeString("SUCCESS");
        $ic48$ = makeString("FAILURE");
        $ic49$ = makeString("DFAILURE");
        $ic50$ = makeString("ERROR");
        $ic51$ = makeString("SKIPPED");
        $ic52$ = makeString("PROBLEM");
        $ic53$ = makeString("test_collection_metric_result");
        $ic54$ = makeString("test_metric_result");
        $ic55$ = makeString("test_execution_member");
        $ic56$ = makeString("kct_execution");
        $ic57$ = makeString("C");
        $ic58$ = makeString("I");
        $ic59$ = makeString("kct_execution_member");
        $ic60$ = makeString("S");
        $ic61$ = makeString("H");
        $ic62$ = makeString("X");
        $ic63$ = makeString("kct_config");
        $ic64$ = makeString("KB Content Test System");
        $ic65$ = makeString("kct_collection_config");
        $ic66$ = makeString("test_cyclist_responsible_config");
        $ic67$ = makeString("kct_config_cycl_binding_set");
        $ic68$ = makeString("E");
        $ic69$ = makeString("W");
        $ic70$ = makeString("N");
        $ic71$ = makeString("U");
        $ic72$ = makeString("kct_config_answer_support");
        $ic73$ = makeString("M");
        $ic74$ = makeString("inference_param_config");
        $ic75$ = makeString("test_metric_config");
        $ic76$ = makeString("Q");
        $ic77$ = makeString("B");
        $ic78$ = makeString("test_dependency_config");
        $ic79$ = makeString("kct_config_genls");
        $ic80$ = makeString("kct_config_isas");
        $ic81$ = makeString("Test or test collection GUID must be supplied.");
        $ic82$ = makeString("binding_designation");
        $ic83$ = makeString("cyclist_id");
        $ic84$ = makeString("email_notify_style_id");
        $ic85$ = makeString("execution_type");
        $ic86$ = makeString("genls_id");
        $ic87$ = makeString("image_type");
        $ic88$ = makeString("image_version");
        $ic89$ = makeString("inference_metric_id");
        $ic90$ = makeString("isa_id");
        $ic91$ = makeString("kb_number");
        $ic92$ = makeString("machine_hardware_type");
        $ic93$ = makeString("machine_name");
        $ic94$ = makeString("machine_type");
        $ic95$ = makeString("os_type");
        $ic96$ = makeString("support-type");
        $ic97$ = makeString("system_version_num");
        $ic98$ = makeString("test_id");
        $ic99$ = makeString("test_status");
        $ic100$ = makeString("test_type");
        $ic101$ = makeKeyword("TRUE");
        $ic102$ = makeKeyword("FALSE");
        $ic103$ = makeKeyword("TRUE-DEF");
        $ic104$ = makeKeyword("TRUE-MON");
        $ic105$ = makeKeyword("FALSE-DEF");
        $ic106$ = makeKeyword("FALSE-MON");
        $ic107$ = makeSymbol("KEYWORDP");
        $ic108$ = constant_handles_oc.f8479((SubLObject)makeString("IndividualTestMetric"));
        $ic109$ = constant_handles_oc.f8479((SubLObject)makeString("CollectionTestMetric"));
        $ic110$ = makeSymbol("CONSTANT-P");
        $ic111$ = constant_handles_oc.f8479((SubLObject)makeString("TestMetric"));
        $ic112$ = constant_handles_oc.f8479((SubLObject)makeString("UnsupportedTestMetric"));
        $ic113$ = makeSymbol("S#42338", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 180 ms
	
	Decompiled with Procyon 0.5.32.
*/