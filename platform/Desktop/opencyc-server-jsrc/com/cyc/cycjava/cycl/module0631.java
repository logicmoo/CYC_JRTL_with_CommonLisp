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
        module0631.$g4837$.setGlobalValue(module0038.f2624(module0166.f10757(module0631.$ic18$)));
        module0631.$g4838$.setGlobalValue(module0038.f2624(module0166.f10757(module0631.$ic19$)));
        module0631.$g4839$.setGlobalValue((SubLObject)module0631.$ic20$);
        module0631.$g4840$.setGlobalValue(module0233.f15415((SubLObject)ConsesLow.list(module0233.f15418((SubLObject)module0631.$ic21$, (SubLObject)module0631.$ic22$))));
        module0631.$g4841$.setGlobalValue(module0233.f15415((SubLObject)ConsesLow.list(module0233.f15418((SubLObject)module0631.$ic23$, (SubLObject)module0631.$ic24$))));
        module0631.$g4842$.setGlobalValue(module0233.f15412((SubLObject)ConsesLow.list(module0233.f15415((SubLObject)ConsesLow.list(module0233.f15418((SubLObject)module0631.$ic21$, (SubLObject)module0631.$ic22$))))));
        module0631.$g4843$.setGlobalValue(module0233.f15412((SubLObject)ConsesLow.list(module0233.f15415((SubLObject)ConsesLow.list(module0233.f15418((SubLObject)module0631.$ic23$, (SubLObject)module0631.$ic24$))))));
        module0631.$g4844$.setGlobalValue(module0233.f15412((SubLObject)ConsesLow.list(module0233.f15415((SubLObject)ConsesLow.list(module0233.f15418((SubLObject)module0631.$ic25$, (SubLObject)module0631.$ic26$))))));
        module0631.$g4845$.setGlobalValue((SubLObject)module0631.$ic27$);
        module0631.$g4846$.setGlobalValue(module0631.$ic28$);
        module0631.$g4847$.setGlobalValue(module0631.$ic29$);
        module0631.$g4848$.setGlobalValue(module0038.f2624(module0166.f10757(module0631.$ic30$)));
        module0631.$g4849$.setGlobalValue(module0038.f2624(module0166.f10757(module0631.$ic31$)));
        module0631.$g4850$.setGlobalValue(module0038.f2624(module0166.f10757(module0631.$ic32$)));
        module0631.$g4851$.setGlobalValue(module0038.f2624(module0166.f10757(module0631.$ic33$)));
        module0631.$g4852$.setGlobalValue((SubLObject)module0631.$ic34$);
        module0631.$g4853$.setGlobalValue(module0631.$ic28$);
        module0631.$g4854$.setGlobalValue(module0038.f2624(module0166.f10757(module0631.$ic32$)));
        return (SubLObject)module0631.T;
    }
    
    public static SubLObject f38679(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var1.equalp(module0631.$g4889$.getGlobalValue()) || var1.equalp(module0631.$g4890$.getGlobalValue()));
    }
    
    public static SubLObject f38680(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var1.equalp(module0631.$g4893$.getGlobalValue()) || var1.equalp(module0631.$g4894$.getGlobalValue()) || var1.equalp(module0631.$g4895$.getGlobalValue()));
    }
    
    public static SubLObject f38681(final SubLObject var2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var2.equalp(module0631.$g4900$.getGlobalValue()) || var2.equalp(module0631.$g4901$.getGlobalValue()));
    }
    
    public static SubLObject f38682(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (module0631.NIL == Errors.$ignore_mustsP$.getDynamicValue(var4) && module0631.NIL == var3) {
            Errors.error((SubLObject)module0631.$ic81$);
        }
        if (module0631.NIL != f38683(var3)) {
            return (SubLObject)module0631.T;
        }
        return module0067.f4886(module0631.$g4935$.getDynamicValue(var4), var3, (SubLObject)module0631.T);
    }
    
    public static SubLObject f38683(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return module0067.f4884(module0631.$g4935$.getDynamicValue(var4), var3, (SubLObject)module0631.UNPROVIDED);
    }
    
    public static SubLObject f38684(SubLObject var5, final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = conses_high.second(conses_high.assoc(var6, module0631.$g4936$.getDynamicValue(var7), Symbols.symbol_function((SubLObject)module0631.EQUAL), (SubLObject)module0631.UNPROVIDED));
        if (module0631.NIL != var8) {
            var5 = module0038.f2629(var8, module0038.f2735(var5));
        }
        if (var5.isString()) {
            return module0038.f2735(var5);
        }
        return var5;
    }
    
    public static SubLObject f38685(final SubLObject var8) {
        return conses_high.member(var8, module0631.$g4855$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0631.EQUAL), (SubLObject)module0631.UNPROVIDED);
    }
    
    public static SubLObject f38686(final SubLObject var9) {
        return conses_high.member(var9, module0631.$g4856$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0631.EQUAL), (SubLObject)module0631.UNPROVIDED);
    }
    
    public static SubLObject f38687(final SubLObject var2) {
        return conses_high.member(var2, module0631.$g4874$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0631.EQUAL), (SubLObject)module0631.UNPROVIDED);
    }
    
    public static SubLObject f38688(final SubLObject var10) {
        return conses_high.member(var10, module0631.$g4875$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0631.EQUAL), (SubLObject)module0631.UNPROVIDED);
    }
    
    public static SubLObject f38689(final SubLObject var2) {
        return conses_high.member(var2, module0631.$g4915$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0631.EQUAL), (SubLObject)module0631.UNPROVIDED);
    }
    
    public static SubLObject f38690(final SubLObject var11) {
        return conses_high.member(var11, module0631.$g4916$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0631.EQUAL), (SubLObject)module0631.UNPROVIDED);
    }
    
    public static SubLObject f38691(final SubLObject var1) {
        if (var1.eql((SubLObject)module0631.$ic101$) || var1.eql((SubLObject)module0631.$ic102$) || var1.eql((SubLObject)module0631.$ic103$) || var1.eql((SubLObject)module0631.$ic104$) || var1.eql((SubLObject)module0631.$ic105$) || var1.eql((SubLObject)module0631.$ic106$)) {
            return (SubLObject)module0631.T;
        }
        return (SubLObject)module0631.NIL;
    }
    
    public static SubLObject f38692(final SubLObject var1) {
        return conses_high.member(var1, module0631.$g4911$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0631.EQUAL), (SubLObject)module0631.UNPROVIDED);
    }
    
    public static SubLObject f38693(SubLObject var13, final SubLObject var14, final SubLObject var15) {
        if (module0631.NIL != var14) {
            var13 = module0038.f2633(var13, var14);
        }
        if (module0631.NIL != var15) {
            var13 = module0038.f2634(var13, var15);
        }
        return var13;
    }
    
    public static SubLObject f38694(final SubLObject var13) {
        return module0038.f2626(module0038.f2626(var13));
    }
    
    public static SubLObject f38695(final SubLObject var16) {
        assert module0631.NIL != Types.keywordp(var16) : var16;
        return module0594.f36340(var16, module0631.$ic108$);
    }
    
    public static SubLObject f38696(final SubLObject var16) {
        assert module0631.NIL != Types.keywordp(var16) : var16;
        return module0594.f36340(var16, module0631.$ic109$);
    }
    
    public static SubLObject f38697(final SubLObject var17) {
        assert module0631.NIL != module0128.f8449(var17) : var17;
        return module0594.f36343(var17);
    }
    
    public static SubLObject f38698(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0631.NIL != module0173.f10955(var1) && module0631.NIL != module0259.f16891(var1, module0631.$ic111$));
    }
    
    public static SubLObject f38699(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0631.NIL != module0173.f10955(var1) && module0631.NIL != module0259.f16891(var1, module0631.$ic112$));
    }
    
    public static SubLObject f38700() {
        SubLObject var18 = module0035.remove_if_not(Symbols.symbol_function((SubLObject)module0631.$ic110$), module0259.f16850(module0631.$ic108$), (SubLObject)module0631.UNPROVIDED, (SubLObject)module0631.UNPROVIDED, (SubLObject)module0631.UNPROVIDED, (SubLObject)module0631.UNPROVIDED);
        var18 = Sequences.remove_if(Symbols.symbol_function((SubLObject)module0631.$ic113$), var18, (SubLObject)module0631.UNPROVIDED, (SubLObject)module0631.UNPROVIDED, (SubLObject)module0631.UNPROVIDED, (SubLObject)module0631.UNPROVIDED);
        return var18;
    }
    
    public static SubLObject f38701() {
        SubLObject var18 = module0035.remove_if_not(Symbols.symbol_function((SubLObject)module0631.$ic110$), module0259.f16850(module0631.$ic109$), (SubLObject)module0631.UNPROVIDED, (SubLObject)module0631.UNPROVIDED, (SubLObject)module0631.UNPROVIDED, (SubLObject)module0631.UNPROVIDED);
        var18 = Sequences.remove_if(Symbols.symbol_function((SubLObject)module0631.$ic113$), var18, (SubLObject)module0631.UNPROVIDED, (SubLObject)module0631.UNPROVIDED, (SubLObject)module0631.UNPROVIDED, (SubLObject)module0631.UNPROVIDED);
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
        return (SubLObject)module0631.NIL;
    }
    
    public static SubLObject f38703() {
        module0631.$g4837$ = SubLFiles.deflexical("S#42341", (SubLObject)((module0631.NIL != Symbols.boundp((SubLObject)module0631.$ic0$)) ? module0631.$g4837$.getGlobalValue() : module0631.NIL));
        module0631.$g4838$ = SubLFiles.deflexical("S#42342", (SubLObject)((module0631.NIL != Symbols.boundp((SubLObject)module0631.$ic1$)) ? module0631.$g4838$.getGlobalValue() : module0631.NIL));
        module0631.$g4839$ = SubLFiles.deflexical("S#42343", (SubLObject)((module0631.NIL != Symbols.boundp((SubLObject)module0631.$ic2$)) ? module0631.$g4839$.getGlobalValue() : module0631.NIL));
        module0631.$g4840$ = SubLFiles.deflexical("S#42344", (SubLObject)((module0631.NIL != Symbols.boundp((SubLObject)module0631.$ic3$)) ? module0631.$g4840$.getGlobalValue() : module0631.NIL));
        module0631.$g4841$ = SubLFiles.deflexical("S#42345", (SubLObject)((module0631.NIL != Symbols.boundp((SubLObject)module0631.$ic4$)) ? module0631.$g4841$.getGlobalValue() : module0631.NIL));
        module0631.$g4842$ = SubLFiles.deflexical("S#42346", (SubLObject)((module0631.NIL != Symbols.boundp((SubLObject)module0631.$ic5$)) ? module0631.$g4842$.getGlobalValue() : module0631.NIL));
        module0631.$g4843$ = SubLFiles.deflexical("S#42347", (SubLObject)((module0631.NIL != Symbols.boundp((SubLObject)module0631.$ic6$)) ? module0631.$g4843$.getGlobalValue() : module0631.NIL));
        module0631.$g4844$ = SubLFiles.deflexical("S#42348", (SubLObject)((module0631.NIL != Symbols.boundp((SubLObject)module0631.$ic7$)) ? module0631.$g4844$.getGlobalValue() : module0631.NIL));
        module0631.$g4845$ = SubLFiles.deflexical("S#42349", (SubLObject)((module0631.NIL != Symbols.boundp((SubLObject)module0631.$ic8$)) ? module0631.$g4845$.getGlobalValue() : module0631.NIL));
        module0631.$g4846$ = SubLFiles.deflexical("S#42350", (SubLObject)((module0631.NIL != Symbols.boundp((SubLObject)module0631.$ic9$)) ? module0631.$g4846$.getGlobalValue() : module0631.NIL));
        module0631.$g4847$ = SubLFiles.deflexical("S#42351", (SubLObject)((module0631.NIL != Symbols.boundp((SubLObject)module0631.$ic10$)) ? module0631.$g4847$.getGlobalValue() : module0631.NIL));
        module0631.$g4848$ = SubLFiles.deflexical("S#42352", (SubLObject)((module0631.NIL != Symbols.boundp((SubLObject)module0631.$ic11$)) ? module0631.$g4848$.getGlobalValue() : module0631.NIL));
        module0631.$g4849$ = SubLFiles.deflexical("S#42353", (SubLObject)((module0631.NIL != Symbols.boundp((SubLObject)module0631.$ic12$)) ? module0631.$g4849$.getGlobalValue() : module0631.NIL));
        module0631.$g4850$ = SubLFiles.deflexical("S#42354", (SubLObject)((module0631.NIL != Symbols.boundp((SubLObject)module0631.$ic13$)) ? module0631.$g4850$.getGlobalValue() : module0631.NIL));
        module0631.$g4851$ = SubLFiles.deflexical("S#42355", (SubLObject)((module0631.NIL != Symbols.boundp((SubLObject)module0631.$ic14$)) ? module0631.$g4851$.getGlobalValue() : module0631.NIL));
        module0631.$g4852$ = SubLFiles.deflexical("S#42356", (SubLObject)((module0631.NIL != Symbols.boundp((SubLObject)module0631.$ic15$)) ? module0631.$g4852$.getGlobalValue() : module0631.NIL));
        module0631.$g4853$ = SubLFiles.deflexical("S#42357", (SubLObject)((module0631.NIL != Symbols.boundp((SubLObject)module0631.$ic16$)) ? module0631.$g4853$.getGlobalValue() : module0631.NIL));
        module0631.$g4854$ = SubLFiles.deflexical("S#42358", (SubLObject)((module0631.NIL != Symbols.boundp((SubLObject)module0631.$ic17$)) ? module0631.$g4854$.getGlobalValue() : module0631.NIL));
        module0631.$g4855$ = SubLFiles.defconstant("S#42359", (SubLObject)ConsesLow.list((SubLObject)module0631.$ic35$, (SubLObject)module0631.$ic36$));
        module0631.$g4856$ = SubLFiles.defconstant("S#42360", (SubLObject)ConsesLow.list((SubLObject)module0631.$ic37$, (SubLObject)module0631.$ic38$, (SubLObject)module0631.$ic39$));
        module0631.$g4857$ = SubLFiles.defconstant("S#42361", (SubLObject)module0631.$ic40$);
        module0631.$g4858$ = SubLFiles.defconstant("S#42362", (SubLObject)module0631.$ic41$);
        module0631.$g4859$ = SubLFiles.defconstant("S#42363", (SubLObject)module0631.$ic42$);
        module0631.$g4860$ = SubLFiles.defconstant("S#42364", (SubLObject)module0631.$ic42$);
        module0631.$g4861$ = SubLFiles.defconstant("S#42365", (SubLObject)module0631.TEN_INTEGER);
        module0631.$g4862$ = SubLFiles.defconstant("S#42366", (SubLObject)module0631.TWELVE_INTEGER);
        module0631.$g4863$ = SubLFiles.defconstant("S#42367", (SubLObject)module0631.$ic43$);
        module0631.$g4864$ = SubLFiles.defconstant("S#42368", (SubLObject)module0631.$ic44$);
        module0631.$g4865$ = SubLFiles.defconstant("S#42369", (SubLObject)module0631.$ic42$);
        module0631.$g4866$ = SubLFiles.defconstant("S#42370", (SubLObject)module0631.TWENTY_INTEGER);
        module0631.$g4867$ = SubLFiles.defconstant("S#42371", (SubLObject)module0631.$ic42$);
        module0631.$g4868$ = SubLFiles.defconstant("S#42372", (SubLObject)module0631.$ic45$);
        module0631.$g4869$ = SubLFiles.defconstant("S#42373", (SubLObject)module0631.$ic44$);
        module0631.$g4870$ = SubLFiles.defconstant("S#42374", (SubLObject)module0631.TWENTY_INTEGER);
        module0631.$g4871$ = SubLFiles.defconstant("S#42375", (SubLObject)module0631.NINETEEN_INTEGER);
        module0631.$g4872$ = SubLFiles.defconstant("S#42376", (SubLObject)module0631.TEN_INTEGER);
        module0631.$g4873$ = SubLFiles.defconstant("S#42377", (SubLObject)module0631.ONE_INTEGER);
        module0631.$g4874$ = SubLFiles.defconstant("S#42378", (SubLObject)ConsesLow.list((SubLObject)module0631.$ic46$));
        module0631.$g4875$ = SubLFiles.defconstant("S#42379", (SubLObject)ConsesLow.list((SubLObject)module0631.$ic47$, (SubLObject)module0631.$ic48$, (SubLObject)module0631.$ic49$, (SubLObject)module0631.$ic50$, (SubLObject)module0631.$ic51$, (SubLObject)module0631.$ic52$));
        module0631.$g4876$ = SubLFiles.defconstant("S#42380", (SubLObject)module0631.$ic47$);
        module0631.$g4877$ = SubLFiles.defconstant("S#42381", (SubLObject)module0631.$ic48$);
        module0631.$g4878$ = SubLFiles.defconstant("S#42382", (SubLObject)module0631.$ic49$);
        module0631.$g4879$ = SubLFiles.defconstant("S#42383", (SubLObject)module0631.$ic50$);
        module0631.$g4880$ = SubLFiles.defconstant("S#42384", (SubLObject)module0631.$ic51$);
        module0631.$g4881$ = SubLFiles.defconstant("S#42385", (SubLObject)module0631.$ic52$);
        module0631.$g4882$ = SubLFiles.defconstant("S#42386", (SubLObject)module0631.$ic46$);
        module0631.$g4883$ = SubLFiles.defconstant("S#42387", (SubLObject)module0631.$ic53$);
        module0631.$g4884$ = SubLFiles.defconstant("S#42388", (SubLObject)module0631.$ic44$);
        module0631.$g4885$ = SubLFiles.defconstant("S#42389", (SubLObject)module0631.$ic54$);
        module0631.$g4886$ = SubLFiles.defconstant("S#42390", (SubLObject)module0631.$ic55$);
        module0631.$g4887$ = SubLFiles.defconstant("S#42391", (SubLObject)module0631.$ic56$);
        module0631.$g4888$ = SubLFiles.defconstant("S#42392", (SubLObject)module0631.ONE_INTEGER);
        module0631.$g4889$ = SubLFiles.defconstant("S#42393", (SubLObject)module0631.$ic57$);
        module0631.$g4890$ = SubLFiles.defconstant("S#42394", (SubLObject)module0631.$ic58$);
        module0631.$g4891$ = SubLFiles.defconstant("S#42395", (SubLObject)module0631.$ic59$);
        module0631.$g4892$ = SubLFiles.defconstant("S#42396", (SubLObject)module0631.ONE_INTEGER);
        module0631.$g4893$ = SubLFiles.defconstant("S#42397", (SubLObject)module0631.$ic60$);
        module0631.$g4894$ = SubLFiles.defconstant("S#42398", (SubLObject)module0631.$ic61$);
        module0631.$g4895$ = SubLFiles.defconstant("S#42399", (SubLObject)module0631.$ic62$);
        module0631.$g4896$ = SubLFiles.defconstant("S#42400", (SubLObject)module0631.$ic63$);
        module0631.$g4897$ = SubLFiles.defconstant("S#42401", (SubLObject)module0631.$ic64$);
        module0631.$g4898$ = SubLFiles.defconstant("S#42402", (SubLObject)module0631.$ic65$);
        module0631.$g4899$ = SubLFiles.defconstant("S#42403", (SubLObject)module0631.ONE_INTEGER);
        module0631.$g4900$ = SubLFiles.defconstant("S#42404", (SubLObject)module0631.$ic57$);
        module0631.$g4901$ = SubLFiles.defconstant("S#42405", (SubLObject)module0631.$ic60$);
        module0631.$g4902$ = SubLFiles.defconstant("S#42406", (SubLObject)module0631.$ic66$);
        module0631.$g4903$ = SubLFiles.defconstant("S#42407", (SubLObject)module0631.$ic44$);
        module0631.$g4904$ = SubLFiles.defconstant("S#42408", (SubLObject)module0631.$ic44$);
        module0631.$g4905$ = SubLFiles.defconstant("S#42409", (SubLObject)module0631.$ic67$);
        module0631.$g4906$ = SubLFiles.defconstant("S#42410", (SubLObject)module0631.ONE_INTEGER);
        module0631.$g4907$ = SubLFiles.defconstant("S#42411", (SubLObject)module0631.$ic68$);
        module0631.$g4908$ = SubLFiles.defconstant("S#42412", (SubLObject)module0631.$ic69$);
        module0631.$g4909$ = SubLFiles.defconstant("S#42413", (SubLObject)module0631.$ic70$);
        module0631.$g4910$ = SubLFiles.defconstant("S#42414", (SubLObject)module0631.$ic71$);
        module0631.$g4911$ = SubLFiles.defconstant("S#42415", (SubLObject)ConsesLow.list((SubLObject)module0631.$ic68$, (SubLObject)module0631.$ic69$, (SubLObject)module0631.$ic70$, (SubLObject)module0631.$ic71$));
        module0631.$g4912$ = SubLFiles.defconstant("S#42416", (SubLObject)module0631.$ic72$);
        module0631.$g4913$ = SubLFiles.defconstant("S#42417", (SubLObject)module0631.ONE_INTEGER);
        module0631.$g4914$ = SubLFiles.defconstant("S#42418", (SubLObject)module0631.ONE_INTEGER);
        module0631.$g4915$ = SubLFiles.defconstant("S#42419", (SubLObject)ConsesLow.list((SubLObject)module0631.$ic73$, (SubLObject)module0631.$ic60$));
        module0631.$g4916$ = SubLFiles.defconstant("S#42420", (SubLObject)ConsesLow.list((SubLObject)module0631.$ic69$, (SubLObject)module0631.$ic70$));
        module0631.$g4917$ = SubLFiles.defconstant("S#42421", (SubLObject)module0631.$ic69$);
        module0631.$g4918$ = SubLFiles.defconstant("S#42422", (SubLObject)module0631.$ic70$);
        module0631.$g4919$ = SubLFiles.defconstant("S#42423", (SubLObject)module0631.$ic60$);
        module0631.$g4920$ = SubLFiles.defconstant("S#42424", (SubLObject)module0631.$ic73$);
        module0631.$g4921$ = SubLFiles.defconstant("S#42425", (SubLObject)module0631.$ic74$);
        module0631.$g4922$ = SubLFiles.defconstant("S#42426", (SubLObject)module0631.$ic44$);
        module0631.$g4923$ = SubLFiles.defconstant("S#42427", (SubLObject)module0631.$ic75$);
        module0631.$g4924$ = SubLFiles.defconstant("S#42428", (SubLObject)module0631.ONE_INTEGER);
        module0631.$g4925$ = SubLFiles.defconstant("S#42429", (SubLObject)ConsesLow.list((SubLObject)module0631.$ic57$, (SubLObject)module0631.$ic76$, (SubLObject)module0631.$ic77$));
        module0631.$g4926$ = SubLFiles.defconstant("S#42430", (SubLObject)module0631.$ic57$);
        module0631.$g4927$ = SubLFiles.defconstant("S#42431", (SubLObject)module0631.$ic76$);
        module0631.$g4928$ = SubLFiles.defconstant("S#42432", (SubLObject)module0631.$ic77$);
        module0631.$g4929$ = SubLFiles.defconstant("S#42433", (SubLObject)module0631.$ic78$);
        module0631.$g4930$ = SubLFiles.defconstant("S#42434", (SubLObject)module0631.$ic79$);
        module0631.$g4931$ = SubLFiles.defconstant("S#42435", (SubLObject)module0631.$ic80$);
        module0631.$g4932$ = SubLFiles.defparameter("S#42436", (SubLObject)module0631.NIL);
        module0631.$g4933$ = SubLFiles.defparameter("S#42437", (SubLObject)module0631.NIL);
        module0631.$g4934$ = SubLFiles.defparameter("S#42438", (SubLObject)module0631.NIL);
        module0631.$g4935$ = SubLFiles.defparameter("S#42439", (SubLObject)module0631.NIL);
        module0631.$g4936$ = SubLFiles.defparameter("S#42440", (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)module0631.$ic82$, module0631.$g4906$.getGlobalValue()), ConsesLow.list((SubLObject)module0631.$ic83$, module0631.$g4903$.getGlobalValue()), ConsesLow.list((SubLObject)module0631.$ic84$, module0631.$g4904$.getGlobalValue()), ConsesLow.list((SubLObject)module0631.$ic85$, module0631.$g4888$.getGlobalValue()), ConsesLow.list((SubLObject)module0631.$ic86$, module0631.$g4869$.getGlobalValue()), ConsesLow.list((SubLObject)module0631.$ic87$, module0631.$g4859$.getGlobalValue()), ConsesLow.list((SubLObject)module0631.$ic88$, module0631.$g4860$.getGlobalValue()), ConsesLow.list((SubLObject)module0631.$ic89$, module0631.$g4884$.getGlobalValue()), ConsesLow.list((SubLObject)module0631.$ic90$, module0631.$g4869$.getGlobalValue()), ConsesLow.list((SubLObject)module0631.$ic91$, module0631.$g4862$.getGlobalValue()), ConsesLow.list((SubLObject)module0631.$ic92$, module0631.$g4866$.getGlobalValue()), ConsesLow.list((SubLObject)module0631.$ic93$, module0631.$g4864$.getGlobalValue()), ConsesLow.list((SubLObject)module0631.$ic94$, module0631.$g4865$.getGlobalValue()), ConsesLow.list((SubLObject)module0631.$ic95$, module0631.$g4867$.getGlobalValue()), ConsesLow.list((SubLObject)module0631.$ic96$, module0631.$g4913$.getGlobalValue()), ConsesLow.list((SubLObject)module0631.$ic97$, module0631.$g4861$.getGlobalValue()), ConsesLow.list((SubLObject)module0631.$ic98$, module0631.$g4869$.getGlobalValue()), ConsesLow.list((SubLObject)module0631.$ic99$, module0631.$g4872$.getGlobalValue()), ConsesLow.list((SubLObject)module0631.$ic100$, module0631.$g4870$.getGlobalValue()) }));
        return (SubLObject)module0631.NIL;
    }
    
    public static SubLObject f38704() {
        module0003.f57((SubLObject)module0631.$ic0$);
        module0003.f57((SubLObject)module0631.$ic1$);
        module0003.f57((SubLObject)module0631.$ic2$);
        module0003.f57((SubLObject)module0631.$ic3$);
        module0003.f57((SubLObject)module0631.$ic4$);
        module0003.f57((SubLObject)module0631.$ic5$);
        module0003.f57((SubLObject)module0631.$ic6$);
        module0003.f57((SubLObject)module0631.$ic7$);
        module0003.f57((SubLObject)module0631.$ic8$);
        module0003.f57((SubLObject)module0631.$ic9$);
        module0003.f57((SubLObject)module0631.$ic10$);
        module0003.f57((SubLObject)module0631.$ic11$);
        module0003.f57((SubLObject)module0631.$ic12$);
        module0003.f57((SubLObject)module0631.$ic13$);
        module0003.f57((SubLObject)module0631.$ic14$);
        module0003.f57((SubLObject)module0631.$ic15$);
        module0003.f57((SubLObject)module0631.$ic16$);
        module0003.f57((SubLObject)module0631.$ic17$);
        return (SubLObject)module0631.NIL;
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
        module0631.$g4837$ = null;
        module0631.$g4838$ = null;
        module0631.$g4839$ = null;
        module0631.$g4840$ = null;
        module0631.$g4841$ = null;
        module0631.$g4842$ = null;
        module0631.$g4843$ = null;
        module0631.$g4844$ = null;
        module0631.$g4845$ = null;
        module0631.$g4846$ = null;
        module0631.$g4847$ = null;
        module0631.$g4848$ = null;
        module0631.$g4849$ = null;
        module0631.$g4850$ = null;
        module0631.$g4851$ = null;
        module0631.$g4852$ = null;
        module0631.$g4853$ = null;
        module0631.$g4854$ = null;
        module0631.$g4855$ = null;
        module0631.$g4856$ = null;
        module0631.$g4857$ = null;
        module0631.$g4858$ = null;
        module0631.$g4859$ = null;
        module0631.$g4860$ = null;
        module0631.$g4861$ = null;
        module0631.$g4862$ = null;
        module0631.$g4863$ = null;
        module0631.$g4864$ = null;
        module0631.$g4865$ = null;
        module0631.$g4866$ = null;
        module0631.$g4867$ = null;
        module0631.$g4868$ = null;
        module0631.$g4869$ = null;
        module0631.$g4870$ = null;
        module0631.$g4871$ = null;
        module0631.$g4872$ = null;
        module0631.$g4873$ = null;
        module0631.$g4874$ = null;
        module0631.$g4875$ = null;
        module0631.$g4876$ = null;
        module0631.$g4877$ = null;
        module0631.$g4878$ = null;
        module0631.$g4879$ = null;
        module0631.$g4880$ = null;
        module0631.$g4881$ = null;
        module0631.$g4882$ = null;
        module0631.$g4883$ = null;
        module0631.$g4884$ = null;
        module0631.$g4885$ = null;
        module0631.$g4886$ = null;
        module0631.$g4887$ = null;
        module0631.$g4888$ = null;
        module0631.$g4889$ = null;
        module0631.$g4890$ = null;
        module0631.$g4891$ = null;
        module0631.$g4892$ = null;
        module0631.$g4893$ = null;
        module0631.$g4894$ = null;
        module0631.$g4895$ = null;
        module0631.$g4896$ = null;
        module0631.$g4897$ = null;
        module0631.$g4898$ = null;
        module0631.$g4899$ = null;
        module0631.$g4900$ = null;
        module0631.$g4901$ = null;
        module0631.$g4902$ = null;
        module0631.$g4903$ = null;
        module0631.$g4904$ = null;
        module0631.$g4905$ = null;
        module0631.$g4906$ = null;
        module0631.$g4907$ = null;
        module0631.$g4908$ = null;
        module0631.$g4909$ = null;
        module0631.$g4910$ = null;
        module0631.$g4911$ = null;
        module0631.$g4912$ = null;
        module0631.$g4913$ = null;
        module0631.$g4914$ = null;
        module0631.$g4915$ = null;
        module0631.$g4916$ = null;
        module0631.$g4917$ = null;
        module0631.$g4918$ = null;
        module0631.$g4919$ = null;
        module0631.$g4920$ = null;
        module0631.$g4921$ = null;
        module0631.$g4922$ = null;
        module0631.$g4923$ = null;
        module0631.$g4924$ = null;
        module0631.$g4925$ = null;
        module0631.$g4926$ = null;
        module0631.$g4927$ = null;
        module0631.$g4928$ = null;
        module0631.$g4929$ = null;
        module0631.$g4930$ = null;
        module0631.$g4931$ = null;
        module0631.$g4932$ = null;
        module0631.$g4933$ = null;
        module0631.$g4934$ = null;
        module0631.$g4935$ = null;
        module0631.$g4936$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#42341", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#42342", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("S#42343", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("S#42344", "CYC");
        $ic4$ = SubLObjectFactory.makeSymbol("S#42345", "CYC");
        $ic5$ = SubLObjectFactory.makeSymbol("S#42346", "CYC");
        $ic6$ = SubLObjectFactory.makeSymbol("S#42347", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#42348", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("S#42349", "CYC");
        $ic9$ = SubLObjectFactory.makeSymbol("S#42350", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#42351", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#42352", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#42353", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#42354", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#42355", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#42356", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#42357", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#42358", "CYC");
        $ic18$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TestResultNotification-EmailBrief"));
        $ic19$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TKBTemplateTestForMissingMt"));
        $ic20$ = SubLObjectFactory.makeString("(#$TheSet (#$ELInferenceBindingFn ?SOMETHING \"A SOMETHING\"))");
        $ic21$ = SubLObjectFactory.makeSymbol("?SOMETHING");
        $ic22$ = SubLObjectFactory.makeString("A SOMETHING");
        $ic23$ = SubLObjectFactory.makeSymbol("?OTHERTHING");
        $ic24$ = SubLObjectFactory.makeString("ANOTHER THING");
        $ic25$ = SubLObjectFactory.makeSymbol("?ANOTHERTHING");
        $ic26$ = SubLObjectFactory.makeString("YET ANOTHER THING");
        $ic27$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Collection")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Thing")));
        $ic28$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $ic29$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $ic30$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TKBTemplateTestForMissingExplanation"));
        $ic31$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TKBTemplateTestForMissingExample"));
        $ic32$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TKBTemplateIntegrityTest"));
        $ic33$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TKB-RTVQueries"));
        $ic34$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Collection")), (SubLObject)SubLObjectFactory.makeSymbol("?WHAT"));
        $ic35$ = SubLObjectFactory.makeKeyword("TEXT");
        $ic36$ = SubLObjectFactory.makeKeyword("HTML");
        $ic37$ = SubLObjectFactory.makeKeyword("BRIEF");
        $ic38$ = SubLObjectFactory.makeKeyword("VERBOSE");
        $ic39$ = SubLObjectFactory.makeKeyword("POST-BUILD");
        $ic40$ = SubLObjectFactory.makeInteger(60);
        $ic41$ = SubLObjectFactory.makeString("cyc_system_config");
        $ic42$ = SubLObjectFactory.makeInteger(50);
        $ic43$ = SubLObjectFactory.makeString("machine_config");
        $ic44$ = SubLObjectFactory.makeInteger(100);
        $ic45$ = SubLObjectFactory.makeString("test_execution");
        $ic46$ = SubLObjectFactory.makeString("KBCONTENT");
        $ic47$ = SubLObjectFactory.makeString("SUCCESS");
        $ic48$ = SubLObjectFactory.makeString("FAILURE");
        $ic49$ = SubLObjectFactory.makeString("DFAILURE");
        $ic50$ = SubLObjectFactory.makeString("ERROR");
        $ic51$ = SubLObjectFactory.makeString("SKIPPED");
        $ic52$ = SubLObjectFactory.makeString("PROBLEM");
        $ic53$ = SubLObjectFactory.makeString("test_collection_metric_result");
        $ic54$ = SubLObjectFactory.makeString("test_metric_result");
        $ic55$ = SubLObjectFactory.makeString("test_execution_member");
        $ic56$ = SubLObjectFactory.makeString("kct_execution");
        $ic57$ = SubLObjectFactory.makeString("C");
        $ic58$ = SubLObjectFactory.makeString("I");
        $ic59$ = SubLObjectFactory.makeString("kct_execution_member");
        $ic60$ = SubLObjectFactory.makeString("S");
        $ic61$ = SubLObjectFactory.makeString("H");
        $ic62$ = SubLObjectFactory.makeString("X");
        $ic63$ = SubLObjectFactory.makeString("kct_config");
        $ic64$ = SubLObjectFactory.makeString("KB Content Test System");
        $ic65$ = SubLObjectFactory.makeString("kct_collection_config");
        $ic66$ = SubLObjectFactory.makeString("test_cyclist_responsible_config");
        $ic67$ = SubLObjectFactory.makeString("kct_config_cycl_binding_set");
        $ic68$ = SubLObjectFactory.makeString("E");
        $ic69$ = SubLObjectFactory.makeString("W");
        $ic70$ = SubLObjectFactory.makeString("N");
        $ic71$ = SubLObjectFactory.makeString("U");
        $ic72$ = SubLObjectFactory.makeString("kct_config_answer_support");
        $ic73$ = SubLObjectFactory.makeString("M");
        $ic74$ = SubLObjectFactory.makeString("inference_param_config");
        $ic75$ = SubLObjectFactory.makeString("test_metric_config");
        $ic76$ = SubLObjectFactory.makeString("Q");
        $ic77$ = SubLObjectFactory.makeString("B");
        $ic78$ = SubLObjectFactory.makeString("test_dependency_config");
        $ic79$ = SubLObjectFactory.makeString("kct_config_genls");
        $ic80$ = SubLObjectFactory.makeString("kct_config_isas");
        $ic81$ = SubLObjectFactory.makeString("Test or test collection GUID must be supplied.");
        $ic82$ = SubLObjectFactory.makeString("binding_designation");
        $ic83$ = SubLObjectFactory.makeString("cyclist_id");
        $ic84$ = SubLObjectFactory.makeString("email_notify_style_id");
        $ic85$ = SubLObjectFactory.makeString("execution_type");
        $ic86$ = SubLObjectFactory.makeString("genls_id");
        $ic87$ = SubLObjectFactory.makeString("image_type");
        $ic88$ = SubLObjectFactory.makeString("image_version");
        $ic89$ = SubLObjectFactory.makeString("inference_metric_id");
        $ic90$ = SubLObjectFactory.makeString("isa_id");
        $ic91$ = SubLObjectFactory.makeString("kb_number");
        $ic92$ = SubLObjectFactory.makeString("machine_hardware_type");
        $ic93$ = SubLObjectFactory.makeString("machine_name");
        $ic94$ = SubLObjectFactory.makeString("machine_type");
        $ic95$ = SubLObjectFactory.makeString("os_type");
        $ic96$ = SubLObjectFactory.makeString("support-type");
        $ic97$ = SubLObjectFactory.makeString("system_version_num");
        $ic98$ = SubLObjectFactory.makeString("test_id");
        $ic99$ = SubLObjectFactory.makeString("test_status");
        $ic100$ = SubLObjectFactory.makeString("test_type");
        $ic101$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic102$ = SubLObjectFactory.makeKeyword("FALSE");
        $ic103$ = SubLObjectFactory.makeKeyword("TRUE-DEF");
        $ic104$ = SubLObjectFactory.makeKeyword("TRUE-MON");
        $ic105$ = SubLObjectFactory.makeKeyword("FALSE-DEF");
        $ic106$ = SubLObjectFactory.makeKeyword("FALSE-MON");
        $ic107$ = SubLObjectFactory.makeSymbol("KEYWORDP");
        $ic108$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("IndividualTestMetric"));
        $ic109$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CollectionTestMetric"));
        $ic110$ = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $ic111$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TestMetric"));
        $ic112$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("UnsupportedTestMetric"));
        $ic113$ = SubLObjectFactory.makeSymbol("S#42338", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0631.class
	Total time: 180 ms
	
	Decompiled with Procyon 0.5.32.
*/