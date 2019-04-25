package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0655 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0655";
    public static final String myFingerPrint = "277682b8824a0278ff4c2f7fb95e5f6c32f41501e44029ee8e032b956a073499";
    public static SubLSymbol $g5076$;
    public static SubLSymbol $g5077$;
    public static SubLSymbol $g5078$;
    public static SubLSymbol $g5079$;
    public static SubLSymbol $g5080$;
    public static SubLSymbol $g5081$;
    public static SubLSymbol $g5082$;
    public static SubLSymbol $g5083$;
    public static SubLSymbol $g5084$;
    public static SubLSymbol $g5085$;
    public static SubLSymbol $g5086$;
    public static SubLSymbol $g5087$;
    public static SubLSymbol $g5088$;
    public static SubLSymbol $g5089$;
    public static SubLSymbol $g5090$;
    public static SubLSymbol $g5091$;
    public static SubLSymbol $g5092$;
    public static SubLSymbol $g5093$;
    public static SubLSymbol $g5094$;
    public static SubLSymbol $g5095$;
    public static SubLSymbol $g5096$;
    public static SubLSymbol $g5097$;
    public static SubLSymbol $g5098$;
    public static SubLSymbol $g5099$;
    public static SubLSymbol $g5100$;
    public static SubLSymbol $g5101$;
    public static SubLSymbol $g5102$;
    public static SubLSymbol $g5103$;
    public static SubLSymbol $g5104$;
    public static SubLSymbol $g5105$;
    public static SubLSymbol $g5106$;
    public static SubLSymbol $g5107$;
    public static SubLSymbol $g5108$;
    public static SubLSymbol $g5109$;
    public static SubLSymbol $g5110$;
    public static SubLSymbol $g5111$;
    public static SubLSymbol $g5112$;
    public static SubLSymbol $g5113$;
    public static SubLSymbol $g5114$;
    public static SubLSymbol $g5115$;
    public static SubLSymbol $g5116$;
    public static SubLSymbol $g5117$;
    public static SubLSymbol $g5118$;
    public static SubLSymbol $g5119$;
    public static SubLSymbol $g5120$;
    public static SubLSymbol $g5121$;
    public static SubLSymbol $g5122$;
    public static SubLSymbol $g5123$;
    public static SubLSymbol $g5124$;
    public static SubLSymbol $g5125$;
    public static SubLSymbol $g5126$;
    public static SubLSymbol $g5127$;
    public static SubLSymbol $g5128$;
    public static SubLSymbol $g5129$;
    public static SubLSymbol $g5130$;
    public static SubLSymbol $g5131$;
    public static SubLSymbol $g5132$;
    public static SubLSymbol $g5133$;
    public static SubLSymbol $g5134$;
    public static SubLSymbol $g5135$;
    public static SubLSymbol $g5136$;
    public static SubLSymbol $g5137$;
    public static SubLSymbol $g5138$;
    public static SubLSymbol $g5139$;
    public static SubLSymbol $g5140$;
    public static SubLSymbol $g5141$;
    public static SubLSymbol $g5142$;
    public static SubLSymbol $g5143$;
    public static SubLSymbol $g5144$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLInteger $ic5$;
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
    private static final SubLList $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLList $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLObject $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLObject $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLInteger $ic57$;
    private static final SubLInteger $ic58$;
    private static final SubLList $ic59$;
    private static final SubLInteger $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLInteger $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLList $ic67$;
    private static final SubLList $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLList $ic74$;
    private static final SubLList $ic75$;
    private static final SubLList $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLString $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLString $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLList $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLString $ic86$;
    private static final SubLList $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLList $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLList $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLList $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLList $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLList $ic110$;
    private static final SubLString $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLList $ic115$;
    private static final SubLList $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLString $ic119$;
    private static final SubLList $ic120$;
    private static final SubLString $ic121$;
    private static final SubLList $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLList $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLList $ic131$;
    private static final SubLString $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLList $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLList $ic142$;
    private static final SubLList $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLList $ic146$;
    private static final SubLList $ic147$;
    private static final SubLList $ic148$;
    private static final SubLList $ic149$;
    private static final SubLList $ic150$;
    private static final SubLList $ic151$;
    private static final SubLList $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLList $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLList $ic165$;
    private static final SubLList $ic166$;
    private static final SubLList $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLList $ic170$;
    private static final SubLSymbol $ic171$;
    private static final SubLList $ic172$;
    private static final SubLList $ic173$;
    private static final SubLList $ic174$;
    private static final SubLList $ic175$;
    private static final SubLSymbol $ic176$;
    private static final SubLSymbol $ic177$;
    private static final SubLList $ic178$;
    private static final SubLList $ic179$;
    private static final SubLSymbol $ic180$;
    private static final SubLSymbol $ic181$;
    private static final SubLSymbol $ic182$;
    private static final SubLList $ic183$;
    
    public static SubLObject f39750() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0110.$g1388$.getDynamicValue(var1);
    }
    
    public static SubLObject f39751() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g5121$.getDynamicValue(var1);
    }
    
    public static SubLObject f39752(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        $g5121$.setDynamicValue(var2, var3);
        return $g5121$.getDynamicValue(var3);
    }
    
    public static SubLObject f39753() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g5122$.getDynamicValue(var1);
    }
    
    public static SubLObject f39754(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        $g5122$.setDynamicValue(var2, var3);
        return $g5122$.getDynamicValue(var3);
    }
    
    public static SubLObject f39755() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g5123$.getDynamicValue(var1);
    }
    
    public static SubLObject f39756(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        $g5123$.setDynamicValue(var2, var3);
        return $g5123$.getDynamicValue(var3);
    }
    
    public static SubLObject f39757(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = $g5144$.getDynamicValue(var4);
        if (NIL == var5) {
            return Values.values((SubLObject)NIL, (SubLObject)NIL);
        }
        return module0071.f5063(var5, var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f39758(final SubLObject var5) {
        return f39757(module0038.f2642(var5));
    }
    
    public static SubLObject f39759(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        SubLObject var8 = $g5144$.getDynamicValue(var7);
        if (NIL == var8) {
            var8 = module0071.f5058(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            $g5144$.setDynamicValue(var8, var7);
        }
        return module0071.f5065(var8, var6);
    }
    
    public static SubLObject f39760(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = $g5144$.getDynamicValue(var7);
        if (NIL == var8) {
            return (SubLObject)NIL;
        }
        return module0071.f5067(var8, var6);
    }
    
    public static SubLObject f39761(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = $g5144$.getDynamicValue(var4);
        if (NIL == var5) {
            return (SubLObject)NIL;
        }
        return module0071.f5069(var5, var3);
    }
    
    public static SubLObject f39762() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = $g5144$.getDynamicValue(var1);
        if (NIL == var2) {
            return (SubLObject)NIL;
        }
        return module0071.f5060(var2);
    }
    
    public static SubLObject f39763(final SubLObject var7, final SubLObject var8) {
        SubLObject var10;
        final SubLObject var9 = var10 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)$ic67$);
        final SubLObject var11 = var10.rest();
        var10 = var10.first();
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)$ic67$);
        var12 = var10.first();
        var10 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)$ic67$);
        var13 = var10.first();
        var10 = var10.rest();
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = var10;
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var15_16 = (SubLObject)NIL;
        while (NIL != var15) {
            cdestructuring_bind.destructuring_bind_must_consp(var15, var9, (SubLObject)$ic67$);
            var15_16 = var15.first();
            var15 = var15.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var15, var9, (SubLObject)$ic67$);
            if (NIL == conses_high.member(var15_16, (SubLObject)$ic68$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var16 = (SubLObject)T;
            }
            if (var15_16 == $ic69$) {
                var14 = var15.first();
            }
            var15 = var15.rest();
        }
        if (NIL != var16 && NIL == var14) {
            cdestructuring_bind.cdestructuring_bind_error(var9, (SubLObject)$ic67$);
        }
        final SubLObject var17 = cdestructuring_bind.property_list_member((SubLObject)$ic70$, var10);
        final SubLObject var18 = (SubLObject)((NIL != var17) ? conses_high.cadr(var17) : NIL);
        final SubLObject var19;
        var10 = (var19 = var11);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic71$, (SubLObject)ConsesLow.list(var12, var13, (SubLObject)$ic66$, (SubLObject)$ic70$, var18), ConsesLow.append(var19, (SubLObject)NIL));
    }
    
    public static SubLObject f39764(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        assert NIL != Types.function_spec_p(var20) : var20;
        SubLObject var22 = (SubLObject)NIL;
        SubLObject var23;
        for (var23 = module0066.f4838(module0067.f4891(module0071.f5073($g5144$.getDynamicValue(var21)))); NIL == module0066.f4841(var23); var23 = module0066.f4840(var23)) {
            var21.resetMultipleValues();
            final SubLObject var24 = module0066.f4839(var23);
            final SubLObject var25 = var21.secondMultipleValue();
            var21.resetMultipleValues();
            if (NIL != Functions.funcall(var20, var25)) {
                var22 = (SubLObject)ConsesLow.cons(var25, var22);
            }
        }
        module0066.f4842(var23);
        return var22;
    }
    
    public static SubLObject f39765(final SubLObject var7, final SubLObject var8) {
        final SubLObject var9 = var7.rest();
        final SubLObject var11;
        final SubLObject var10 = var11 = var9;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic73$, (SubLObject)$ic74$, (SubLObject)$ic75$, (SubLObject)$ic76$, ConsesLow.append(var11, (SubLObject)NIL));
    }
    
    public static SubLObject f39766() {
        final SubLObject var25 = module0014.f697((SubLObject)$ic77$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic81$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var25) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var25);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39767(final SubLObject var7, final SubLObject var8) {
        final SubLObject var9 = var7.rest();
        final SubLObject var11;
        final SubLObject var10 = var11 = var9;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic82$, (SubLObject)$ic83$, ConsesLow.append(var11, (SubLObject)NIL));
    }
    
    public static SubLObject f39768() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        module0642.f39020(module0110.$g570$.getDynamicValue(var1));
        module0642.f39020((SubLObject)$ic86$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39769(final SubLObject var7, final SubLObject var8) {
        SubLObject var10;
        final SubLObject var9 = var10 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)$ic87$);
        final SubLObject var11 = var10.rest();
        var10 = var10.first();
        final SubLObject var12 = (SubLObject)(var10.isCons() ? var10.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var10, var9, (SubLObject)$ic87$);
        var10 = var10.rest();
        final SubLObject var13 = (SubLObject)(var10.isCons() ? var10.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var10, var9, (SubLObject)$ic87$);
        var10 = var10.rest();
        final SubLObject var14 = var10.isCons() ? var10.first() : module0015.$g290$.getGlobalValue();
        cdestructuring_bind.destructuring_bind_must_listp(var10, var9, (SubLObject)$ic87$);
        var10 = var10.rest();
        if (NIL == var10) {
            final SubLObject var15;
            var10 = (var15 = var11);
            final SubLObject var16 = (SubLObject)$ic88$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic89$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var16, (SubLObject)ConsesLow.list((SubLObject)$ic90$, var12))), (SubLObject)ConsesLow.listS((SubLObject)$ic91$, (SubLObject)ConsesLow.list((SubLObject)$ic92$, var14, var16, (SubLObject)NIL, var13), ConsesLow.append(var15, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var9, (SubLObject)$ic87$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39770(final SubLObject var7, final SubLObject var8) {
        SubLObject var10;
        final SubLObject var9 = var10 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)$ic93$);
        final SubLObject var11 = var10.rest();
        var10 = var10.first();
        SubLObject var12 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)$ic93$);
        var12 = var10.first();
        var10 = var10.rest();
        final SubLObject var13 = (SubLObject)(var10.isCons() ? var10.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var10, var9, (SubLObject)$ic93$);
        var10 = var10.rest();
        final SubLObject var14 = (SubLObject)(var10.isCons() ? var10.first() : T);
        cdestructuring_bind.destructuring_bind_must_listp(var10, var9, (SubLObject)$ic93$);
        var10 = var10.rest();
        final SubLObject var15 = (SubLObject)(var10.isCons() ? var10.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var10, var9, (SubLObject)$ic93$);
        var10 = var10.rest();
        final SubLObject var16 = var10.isCons() ? var10.first() : module0015.$g290$.getGlobalValue();
        cdestructuring_bind.destructuring_bind_must_listp(var10, var9, (SubLObject)$ic93$);
        var10 = var10.rest();
        if (NIL == var10) {
            final SubLObject var17;
            var10 = (var17 = var11);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic94$, (SubLObject)ConsesLow.list(var13, var15, var16), (SubLObject)ConsesLow.list((SubLObject)$ic95$, var12, var14), ConsesLow.append(var17, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var9, (SubLObject)$ic93$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39771(final SubLObject var7, final SubLObject var8) {
        SubLObject var10;
        final SubLObject var9 = var10 = var7.rest();
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)$ic96$);
        var11 = var10.first();
        var10 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)$ic96$);
        var12 = var10.first();
        var10 = var10.rest();
        final SubLObject var13 = (SubLObject)(var10.isCons() ? var10.first() : $ic56$);
        cdestructuring_bind.destructuring_bind_must_listp(var10, var9, (SubLObject)$ic96$);
        var10 = var10.rest();
        final SubLObject var14 = (SubLObject)(var10.isCons() ? var10.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var10, var9, (SubLObject)$ic96$);
        var10 = var10.rest();
        final SubLObject var15 = (SubLObject)(var10.isCons() ? var10.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var10, var9, (SubLObject)$ic96$);
        var10 = var10.rest();
        final SubLObject var16 = (SubLObject)(var10.isCons() ? var10.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var10, var9, (SubLObject)$ic96$);
        var10 = var10.rest();
        if (NIL == var10) {
            final SubLObject var17 = (SubLObject)$ic97$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic89$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var17, (SubLObject)ConsesLow.list((SubLObject)$ic90$, var13))), (SubLObject)ConsesLow.list((SubLObject)$ic98$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic99$, var17, $ic100$, var14, $ic101$, ConsesLow.list((SubLObject)$ic85$, var11), $ic102$, var15, $ic103$, var16 }), var12));
        }
        cdestructuring_bind.cdestructuring_bind_error(var9, (SubLObject)$ic96$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39772(final SubLObject var7, final SubLObject var8) {
        SubLObject var10;
        final SubLObject var9 = var10 = var7.rest();
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)$ic104$);
        var11 = var10.first();
        var10 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)$ic104$);
        var12 = var10.first();
        var10 = var10.rest();
        final SubLObject var13 = (SubLObject)(var10.isCons() ? var10.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var10, var9, (SubLObject)$ic104$);
        var10 = var10.rest();
        if (NIL == var10) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic105$, var11, var12, (SubLObject)$ic106$, var13);
        }
        cdestructuring_bind.cdestructuring_bind_error(var9, (SubLObject)$ic104$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39773(final SubLObject var7, final SubLObject var8) {
        SubLObject var10;
        final SubLObject var9 = var10 = var7.rest();
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)$ic107$);
        var11 = var10.first();
        var10 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)$ic107$);
        var12 = var10.first();
        var10 = var10.rest();
        final SubLObject var13 = (SubLObject)(var10.isCons() ? var10.first() : $ic56$);
        cdestructuring_bind.destructuring_bind_must_listp(var10, var9, (SubLObject)$ic107$);
        var10 = var10.rest();
        final SubLObject var14 = (SubLObject)(var10.isCons() ? var10.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var10, var9, (SubLObject)$ic107$);
        var10 = var10.rest();
        final SubLObject var15 = (SubLObject)(var10.isCons() ? var10.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var10, var9, (SubLObject)$ic107$);
        var10 = var10.rest();
        if (NIL == var10) {
            final SubLObject var16 = (SubLObject)$ic108$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic89$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var16, (SubLObject)ConsesLow.list((SubLObject)$ic90$, var13))), (SubLObject)ConsesLow.list((SubLObject)$ic98$, (SubLObject)ConsesLow.list((SubLObject)$ic99$, var16, (SubLObject)$ic100$, var14, (SubLObject)$ic101$, var11, (SubLObject)$ic109$, var15), var12));
        }
        cdestructuring_bind.cdestructuring_bind_error(var9, (SubLObject)$ic107$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39774(final SubLObject var7, final SubLObject var8) {
        SubLObject var10;
        final SubLObject var9 = var10 = var7.rest();
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)$ic110$);
        var11 = var10.first();
        var10 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)$ic110$);
        var12 = var10.first();
        var10 = var10.rest();
        final SubLObject var13 = (SubLObject)(var10.isCons() ? var10.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var10, var9, (SubLObject)$ic110$);
        var10 = var10.rest();
        final SubLObject var14 = (SubLObject)(var10.isCons() ? var10.first() : $ic111$);
        cdestructuring_bind.destructuring_bind_must_listp(var10, var9, (SubLObject)$ic110$);
        var10 = var10.rest();
        if (NIL == var10) {
            final SubLObject var15 = (SubLObject)$ic112$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic89$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var15, (SubLObject)ConsesLow.list((SubLObject)$ic113$, var13, (SubLObject)ConsesLow.list((SubLObject)$ic90$, var13)))), (SubLObject)ConsesLow.list((SubLObject)$ic98$, (SubLObject)ConsesLow.list((SubLObject)$ic99$, var15, (SubLObject)$ic101$, (SubLObject)ConsesLow.list((SubLObject)$ic85$, var11), (SubLObject)$ic114$, (SubLObject)ConsesLow.listS((SubLObject)$ic82$, new SubLObject[] { $ic115$, ConsesLow.list((SubLObject)$ic85$, var11), $ic116$, ConsesLow.listS((SubLObject)$ic117$, var13, (SubLObject)ConsesLow.list((SubLObject)$ic118$, (SubLObject)$ic119$, var13), (SubLObject)$ic120$), ConsesLow.list((SubLObject)$ic118$, (SubLObject)$ic121$, var14), $ic122$ })), var12));
        }
        cdestructuring_bind.cdestructuring_bind_error(var9, (SubLObject)$ic110$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39775(final SubLObject var7, final SubLObject var8) {
        SubLObject var10;
        final SubLObject var9 = var10 = var7.rest();
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)$ic110$);
        var11 = var10.first();
        var10 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)$ic110$);
        var12 = var10.first();
        var10 = var10.rest();
        final SubLObject var13 = (SubLObject)(var10.isCons() ? var10.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var10, var9, (SubLObject)$ic110$);
        var10 = var10.rest();
        final SubLObject var14 = (SubLObject)(var10.isCons() ? var10.first() : $ic111$);
        cdestructuring_bind.destructuring_bind_must_listp(var10, var9, (SubLObject)$ic110$);
        var10 = var10.rest();
        if (NIL == var10) {
            final SubLObject var15 = (SubLObject)$ic123$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic89$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var15, (SubLObject)ConsesLow.list((SubLObject)$ic113$, var13, (SubLObject)ConsesLow.list((SubLObject)$ic90$, var13)))), (SubLObject)ConsesLow.list((SubLObject)$ic98$, (SubLObject)ConsesLow.list((SubLObject)$ic99$, var15, (SubLObject)$ic101$, var11, (SubLObject)$ic114$, (SubLObject)ConsesLow.listS((SubLObject)$ic82$, new SubLObject[] { $ic115$, var11, $ic116$, ConsesLow.listS((SubLObject)$ic117$, var13, (SubLObject)ConsesLow.list((SubLObject)$ic118$, (SubLObject)$ic119$, var13), (SubLObject)$ic120$), ConsesLow.list((SubLObject)$ic118$, (SubLObject)$ic121$, var14), $ic122$ })), var12));
        }
        cdestructuring_bind.cdestructuring_bind_error(var9, (SubLObject)$ic110$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39776(final SubLObject var7, final SubLObject var8) {
        SubLObject var10;
        final SubLObject var9 = var10 = var7.rest();
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)$ic124$);
        var11 = var10.first();
        var10 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)$ic124$);
        var12 = var10.first();
        var10 = var10.rest();
        final SubLObject var13 = (SubLObject)(var10.isCons() ? var10.first() : $ic56$);
        cdestructuring_bind.destructuring_bind_must_listp(var10, var9, (SubLObject)$ic124$);
        var10 = var10.rest();
        final SubLObject var14 = (SubLObject)(var10.isCons() ? var10.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var10, var9, (SubLObject)$ic124$);
        var10 = var10.rest();
        final SubLObject var15 = (SubLObject)(var10.isCons() ? var10.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var10, var9, (SubLObject)$ic124$);
        var10 = var10.rest();
        final SubLObject var16 = (SubLObject)(var10.isCons() ? var10.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var10, var9, (SubLObject)$ic124$);
        var10 = var10.rest();
        final SubLObject var17 = (SubLObject)(var10.isCons() ? var10.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var10, var9, (SubLObject)$ic124$);
        var10 = var10.rest();
        if (NIL == var10) {
            final SubLObject var18 = (SubLObject)$ic125$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic89$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var18, (SubLObject)ConsesLow.list((SubLObject)$ic90$, var13))), (SubLObject)ConsesLow.list((SubLObject)$ic126$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic99$, var18, $ic101$, ConsesLow.list((SubLObject)$ic85$, var11), $ic127$, var14, $ic128$, var15, $ic129$, var16, $ic130$, var17 }), var12));
        }
        cdestructuring_bind.cdestructuring_bind_error(var9, (SubLObject)$ic124$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39777(final SubLObject var7, final SubLObject var8) {
        SubLObject var10;
        final SubLObject var9 = var10 = var7.rest();
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)$ic131$);
        var11 = var10.first();
        var10 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)$ic131$);
        var12 = var10.first();
        final SubLObject var13;
        var10 = (var13 = var10.rest());
        final SubLObject var14 = Symbols.symbol_name(var11);
        final SubLObject var15 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic132$, var14);
        final SubLObject var16 = Packages.intern(var15, (SubLObject)UNPROVIDED);
        final SubLObject var17 = module0035.f2248(var12);
        return (SubLObject)ConsesLow.list((SubLObject)$ic82$, (SubLObject)ConsesLow.listS((SubLObject)$ic133$, var16, var12, ConsesLow.append(var13, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic134$, var11, (SubLObject)ConsesLow.list((SubLObject)$ic135$, var16), (SubLObject)ConsesLow.list((SubLObject)$ic135$, var17)));
    }
    
    public static SubLObject f39778(final SubLObject var7, final SubLObject var8) {
        SubLObject var10;
        final SubLObject var9 = var10 = var7.rest();
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)$ic136$);
        var11 = var10.first();
        var10 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)$ic136$);
        var12 = var10.first();
        var10 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)$ic136$);
        var13 = var10.first();
        var10 = var10.rest();
        final SubLObject var14 = (SubLObject)(var10.isCons() ? var10.first() : $ic56$);
        cdestructuring_bind.destructuring_bind_must_listp(var10, var9, (SubLObject)$ic136$);
        var10 = var10.rest();
        final SubLObject var15 = (SubLObject)(var10.isCons() ? var10.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var10, var9, (SubLObject)$ic136$);
        var10 = var10.rest();
        if (NIL == var10) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic105$, var12, (SubLObject)ConsesLow.list((SubLObject)$ic82$, (SubLObject)ConsesLow.list((SubLObject)$ic137$, (SubLObject)$ic138$, (SubLObject)ConsesLow.listS((SubLObject)$ic139$, (SubLObject)ConsesLow.list((SubLObject)$ic140$, var11), (SubLObject)ConsesLow.list((SubLObject)$ic141$, var11), (SubLObject)$ic142$)), var13), var14, var15);
        }
        cdestructuring_bind.cdestructuring_bind_error(var9, (SubLObject)$ic136$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39779(final SubLObject var7, final SubLObject var8) {
        SubLObject var10;
        final SubLObject var9 = var10 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)$ic143$);
        final SubLObject var11 = var10.rest();
        var10 = var10.first();
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)$ic143$);
        var12 = var10.first();
        var10 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)$ic143$);
        var13 = var10.first();
        var10 = var10.rest();
        final SubLObject var14 = (SubLObject)(var10.isCons() ? var10.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var10, var9, (SubLObject)$ic143$);
        var10 = var10.rest();
        if (NIL == var10) {
            final SubLObject var15;
            var10 = (var15 = var11);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic89$, reader.bq_cons((SubLObject)ConsesLow.list(var12, (SubLObject)ConsesLow.list((SubLObject)$ic144$, (SubLObject)ConsesLow.list((SubLObject)$ic145$, var13), (SubLObject)ConsesLow.listS((SubLObject)$ic144$, var14, (SubLObject)$ic146$), (SubLObject)ConsesLow.listS((SubLObject)$ic144$, var14, (SubLObject)$ic147$))), (SubLObject)$ic148$), ConsesLow.append(var15, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var9, (SubLObject)$ic143$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39780(final SubLObject var7, final SubLObject var8) {
        SubLObject var10;
        final SubLObject var9 = var10 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)$ic149$);
        final SubLObject var11 = var10.rest();
        var10 = var10.first();
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)$ic149$);
        var12 = var10.first();
        var10 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)$ic149$);
        var13 = var10.first();
        var10 = var10.rest();
        if (NIL == var10) {
            final SubLObject var14;
            var10 = (var14 = var11);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic89$, reader.bq_cons((SubLObject)ConsesLow.list(var12, (SubLObject)ConsesLow.listS((SubLObject)$ic144$, (SubLObject)ConsesLow.list((SubLObject)$ic145$, var13), (SubLObject)$ic150$)), (SubLObject)$ic148$), ConsesLow.append(var14, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var9, (SubLObject)$ic149$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39781(final SubLObject var7, final SubLObject var8) {
        SubLObject var10;
        final SubLObject var9 = var10 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)$ic151$);
        final SubLObject var11 = var10.rest();
        var10 = var10.first();
        SubLObject var12 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)$ic151$);
        var12 = var10.first();
        var10 = var10.rest();
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = var10;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var89_90 = (SubLObject)NIL;
        while (NIL != var14) {
            cdestructuring_bind.destructuring_bind_must_consp(var14, var9, (SubLObject)$ic151$);
            var89_90 = var14.first();
            var14 = var14.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var14, var9, (SubLObject)$ic151$);
            if (NIL == conses_high.member(var89_90, (SubLObject)$ic152$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var15 = (SubLObject)T;
            }
            if (var89_90 == $ic69$) {
                var13 = var14.first();
            }
            var14 = var14.rest();
        }
        if (NIL != var15 && NIL == var13) {
            cdestructuring_bind.cdestructuring_bind_error(var9, (SubLObject)$ic151$);
        }
        final SubLObject var16 = cdestructuring_bind.property_list_member((SubLObject)$ic153$, var10);
        final SubLObject var17 = (SubLObject)((NIL != var16) ? conses_high.cadr(var16) : NIL);
        final SubLObject var18 = cdestructuring_bind.property_list_member((SubLObject)$ic154$, var10);
        final SubLObject var19 = (SubLObject)((NIL != var18) ? conses_high.cadr(var18) : NIL);
        final SubLObject var20 = cdestructuring_bind.property_list_member((SubLObject)$ic155$, var10);
        final SubLObject var21 = (SubLObject)((NIL != var20) ? conses_high.cadr(var20) : NIL);
        final SubLObject var22 = cdestructuring_bind.property_list_member((SubLObject)$ic156$, var10);
        final SubLObject var23 = (SubLObject)((NIL != var22) ? conses_high.cadr(var22) : $ic157$);
        final SubLObject var24 = cdestructuring_bind.property_list_member((SubLObject)$ic158$, var10);
        final SubLObject var25 = (SubLObject)((NIL != var24) ? conses_high.cadr(var24) : T);
        final SubLObject var26;
        var10 = (var26 = var11);
        final SubLObject var27 = (SubLObject)$ic159$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic89$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var27, var12)), (SubLObject)ConsesLow.list((SubLObject)$ic160$, (SubLObject)ConsesLow.list((SubLObject)$ic161$, (SubLObject)ConsesLow.list((SubLObject)$ic80$, (SubLObject)$ic162$, (SubLObject)ConsesLow.list((SubLObject)$ic139$, var27, (SubLObject)ConsesLow.list((SubLObject)$ic163$, (SubLObject)ConsesLow.list((SubLObject)$ic164$, var27))), (SubLObject)ConsesLow.listS((SubLObject)$ic139$, var17, (SubLObject)$ic165$), (SubLObject)ConsesLow.listS((SubLObject)$ic139$, var21, (SubLObject)$ic166$), (SubLObject)ConsesLow.listS((SubLObject)$ic139$, var19, (SubLObject)$ic167$)), (SubLObject)ConsesLow.listS((SubLObject)$ic168$, (SubLObject)ConsesLow.list((SubLObject)$ic169$, var23, (SubLObject)$ic102$, module0015.$g529$.getGlobalValue(), (SubLObject)$ic158$, var25), (SubLObject)$ic170$, (SubLObject)ConsesLow.list((SubLObject)$ic139$, var27, (SubLObject)ConsesLow.list((SubLObject)$ic171$, (SubLObject)$ic172$, (SubLObject)ConsesLow.list((SubLObject)$ic164$, var27))), ConsesLow.append(var26, (SubLObject)NIL)))));
    }
    
    public static SubLObject f39782(final SubLObject var7, final SubLObject var8) {
        SubLObject var10;
        final SubLObject var9 = var10 = var7.rest();
        SubLObject var11 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)$ic173$);
        var11 = var10.first();
        final SubLObject var12;
        var10 = (var12 = var10.rest());
        return reader.bq_cons((SubLObject)$ic82$, ConsesLow.append(var12, (SubLObject)NIL));
    }
    
    public static SubLObject f39783(final SubLObject var7, final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        SubLObject var11;
        final SubLObject var10 = var11 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var11, var10, (SubLObject)$ic174$);
        final SubLObject var12 = var11.rest();
        var11 = var11.first();
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var11, var10, (SubLObject)$ic174$);
        var13 = var11.first();
        var11 = var11.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var11, var10, (SubLObject)$ic174$);
        var14 = var11.first();
        var11 = var11.rest();
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = var11;
        SubLObject var17 = (SubLObject)NIL;
        SubLObject var111_112 = (SubLObject)NIL;
        while (NIL != var16) {
            cdestructuring_bind.destructuring_bind_must_consp(var16, var10, (SubLObject)$ic174$);
            var111_112 = var16.first();
            var16 = var16.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var16, var10, (SubLObject)$ic174$);
            if (NIL == conses_high.member(var111_112, (SubLObject)$ic175$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var17 = (SubLObject)T;
            }
            if (var111_112 == $ic69$) {
                var15 = var16.first();
            }
            var16 = var16.rest();
        }
        if (NIL != var17 && NIL == var15) {
            cdestructuring_bind.cdestructuring_bind_error(var10, (SubLObject)$ic174$);
        }
        final SubLObject var18 = cdestructuring_bind.property_list_member((SubLObject)$ic153$, var11);
        final SubLObject var19 = (SubLObject)((NIL != var18) ? conses_high.cadr(var18) : NIL);
        final SubLObject var20 = cdestructuring_bind.property_list_member((SubLObject)$ic176$, var11);
        final SubLObject var21 = (SubLObject)((NIL != var20) ? conses_high.cadr(var20) : NIL);
        final SubLObject var22 = cdestructuring_bind.property_list_member((SubLObject)$ic156$, var11);
        final SubLObject var23 = (SubLObject)((NIL != var22) ? conses_high.cadr(var22) : $ic157$);
        final SubLObject var24;
        var11 = (var24 = var12);
        if (NIL != $g5124$.getDynamicValue(var9)) {
            return (SubLObject)ConsesLow.listS((SubLObject)$ic89$, (SubLObject)NIL, ConsesLow.append(var24, (SubLObject)NIL));
        }
        final SubLObject var25 = (SubLObject)$ic177$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic89$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var25, var14)), (SubLObject)ConsesLow.list((SubLObject)$ic160$, (SubLObject)ConsesLow.list((SubLObject)$ic161$, (SubLObject)ConsesLow.list((SubLObject)$ic80$, (SubLObject)ConsesLow.list((SubLObject)$ic139$, var25, (SubLObject)ConsesLow.list((SubLObject)$ic163$, (SubLObject)ConsesLow.list((SubLObject)$ic164$, var25))), (SubLObject)$ic162$, (SubLObject)ConsesLow.listS((SubLObject)$ic139$, var19, (SubLObject)$ic165$), (SubLObject)ConsesLow.listS((SubLObject)$ic139$, var21, (SubLObject)$ic178$)), (SubLObject)ConsesLow.list((SubLObject)$ic168$, (SubLObject)ConsesLow.list((SubLObject)$ic169$, var23, (SubLObject)$ic102$, module0015.$g529$.getGlobalValue()), (SubLObject)$ic179$, (SubLObject)ConsesLow.listS((SubLObject)$ic180$, var13, ConsesLow.append(var24, (SubLObject)NIL))))));
    }
    
    public static SubLObject f39784(final SubLObject var7, final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        final SubLObject var10 = var7.rest();
        final SubLObject var12;
        final SubLObject var11 = var12 = var10;
        if (NIL != Sequences.find((SubLObject)$ic181$, reader.$features$.getDynamicValue(var9), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic182$, (SubLObject)ConsesLow.listS((SubLObject)$ic89$, (SubLObject)$ic183$, ConsesLow.append(var12, (SubLObject)NIL)));
        }
        return reader.bq_cons((SubLObject)$ic82$, ConsesLow.append(var12, (SubLObject)NIL));
    }
    
    public static SubLObject f39785() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0655", "f39750", "S#43647", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0655", "f39751", "S#43648", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0655", "f39752", "S#43649", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0655", "f39753", "S#43650", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0655", "f39754", "S#43651", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0655", "f39755", "S#43652", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0655", "f39756", "S#43653", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0655", "f39757", "S#43654", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0655", "f39758", "S#43655", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0655", "f39759", "S#43656", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0655", "f39760", "S#43657", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0655", "f39761", "S#43658", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0655", "f39762", "S#43659", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0655", "f39763", "S#43660");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0655", "f39764", "S#43661", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0655", "f39765", "S#43662");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0655", "f39766", "S#43663", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0655", "f39767", "S#43664");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0655", "f39768", "S#43665", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0655", "f39769", "S#43666");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0655", "f39770", "S#43667");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0655", "f39771", "S#43668");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0655", "f39772", "S#43669");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0655", "f39773", "S#43670");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0655", "f39774", "S#43671");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0655", "f39775", "S#43672");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0655", "f39776", "S#43673");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0655", "f39777", "S#43674");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0655", "f39778", "S#43675");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0655", "f39779", "S#43676");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0655", "f39780", "S#43677");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0655", "f39781", "S#43678");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0655", "f39782", "S#43679");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0655", "f39783", "S#43680");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0655", "f39784", "S#43681");
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39786() {
        $g5076$ = SubLFiles.defparameter("S#43682", (SubLObject)$ic0$);
        $g5077$ = SubLFiles.defparameter("S#43683", (SubLObject)T);
        $g5078$ = SubLFiles.defparameter("S#43684", (SubLObject)T);
        $g5079$ = SubLFiles.defparameter("S#43685", (SubLObject)$ic3$);
        $g5080$ = SubLFiles.defparameter("S#43686", (SubLObject)$ic5$);
        $g5081$ = SubLFiles.defparameter("S#43687", (SubLObject)$ic7$);
        $g5082$ = SubLFiles.defparameter("S#43688", (SubLObject)NIL);
        $g5083$ = SubLFiles.defparameter("*CB-CONSTANT-HISTORY*", (SubLObject)NIL);
        $g5084$ = SubLFiles.defparameter("S#43689", (SubLObject)NIL);
        $g5085$ = SubLFiles.defparameter("*CB-NAT-HISTORY*", (SubLObject)NIL);
        $g5086$ = SubLFiles.defparameter("S#43690", (SubLObject)NIL);
        $g5087$ = SubLFiles.defparameter("*CB-ASSERTION-HISTORY*", (SubLObject)NIL);
        $g5088$ = SubLFiles.defparameter("S#43691", (SubLObject)NIL);
        $g5089$ = SubLFiles.defparameter("*CB-SENTENCE-HISTORY*", (SubLObject)NIL);
        $g5090$ = SubLFiles.defparameter("S#43692", (SubLObject)NIL);
        $g5091$ = SubLFiles.defparameter("S#43693", (SubLObject)NIL);
        $g5092$ = SubLFiles.deflexical("S#43694", (SubLObject)TEN_INTEGER);
        $g5093$ = SubLFiles.defparameter("S#43695", $g5092$.getGlobalValue());
        $g5094$ = SubLFiles.defparameter("S#43696", (SubLObject)NIL);
        $g5095$ = SubLFiles.defparameter("S#43697", (SubLObject)T);
        $g5096$ = SubLFiles.defparameter("S#43698", (SubLObject)NIL);
        $g5097$ = SubLFiles.defparameter("S#43699", (SubLObject)T);
        $g5098$ = SubLFiles.defparameter("S#43700", (SubLObject)NIL);
        $g5099$ = SubLFiles.defparameter("S#43701", (SubLObject)NIL);
        $g5100$ = SubLFiles.defparameter("S#43702", (SubLObject)NIL);
        $g5101$ = SubLFiles.defparameter("S#43703", (SubLObject)NIL);
        $g5102$ = SubLFiles.defparameter("S#43704", (SubLObject)NIL);
        $g5103$ = SubLFiles.defparameter("S#43705", (SubLObject)T);
        $g5104$ = SubLFiles.defparameter("S#43706", (SubLObject)NIL);
        $g5105$ = SubLFiles.defparameter("S#43707", (SubLObject)T);
        $g5106$ = SubLFiles.defparameter("S#43708", (SubLObject)$ic32$);
        $g5107$ = SubLFiles.defparameter("S#43709", (SubLObject)NIL);
        $g5108$ = SubLFiles.defparameter("S#43710", module0073.f5143((SubLObject)($ic35$.isSymbol() ? Symbols.symbol_value((SubLObject)$ic35$) : $ic35$), (SubLObject)$ic36$, (SubLObject)($ic37$.isSymbol() ? Symbols.symbol_value((SubLObject)$ic37$) : $ic37$), (SubLObject)$ic38$, (SubLObject)UNPROVIDED));
        $g5109$ = SubLFiles.defparameter("S#43711", (SubLObject)NIL);
        $g5110$ = SubLFiles.defparameter("S#43712", (SubLObject)NIL);
        $g5111$ = SubLFiles.defparameter("S#1600", (SubLObject)T);
        $g5112$ = SubLFiles.defparameter("S#43713", (SubLObject)NIL);
        $g5113$ = SubLFiles.defparameter("S#43714", (SubLObject)NIL);
        $g5114$ = SubLFiles.defparameter("S#43715", $ic44$);
        $g5115$ = SubLFiles.defparameter("S#43716", (SubLObject)T);
        $g5116$ = SubLFiles.defparameter("S#43717", (SubLObject)NIL);
        $g5117$ = SubLFiles.defparameter("S#43718", (SubLObject)T);
        $g5118$ = SubLFiles.deflexical("S#43719", $ic49$);
        $g5119$ = SubLFiles.defparameter("S#43720", (SubLObject)$ic50$);
        $g5120$ = SubLFiles.defparameter("S#43721", (SubLObject)NIL);
        $g5121$ = SubLFiles.defparameter("S#43722", (SubLObject)T);
        $g5122$ = SubLFiles.defparameter("S#43723", (SubLObject)NIL);
        $g5123$ = SubLFiles.defparameter("S#43724", (SubLObject)NIL);
        $g5124$ = SubLFiles.defparameter("S#43725", (SubLObject)NIL);
        $g5125$ = SubLFiles.defparameter("S#43726", (SubLObject)NIL);
        $g5126$ = SubLFiles.defparameter("S#43727", (SubLObject)T);
        $g5127$ = SubLFiles.defparameter("S#43728", (SubLObject)T);
        $g5128$ = SubLFiles.defparameter("S#43729", (SubLObject)NIL);
        $g5129$ = SubLFiles.defparameter("S#43730", (SubLObject)NIL);
        $g5130$ = SubLFiles.defparameter("S#43731", (SubLObject)NIL);
        $g5131$ = SubLFiles.defparameter("S#43732", module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g5132$ = SubLFiles.defparameter("S#43733", (SubLObject)$ic56$);
        $g5133$ = SubLFiles.defparameter("S#43734", (SubLObject)$ic56$);
        $g5134$ = SubLFiles.defparameter("S#43735", (SubLObject)NIL);
        $g5135$ = SubLFiles.defparameter("S#43736", (SubLObject)$ic57$);
        $g5136$ = SubLFiles.defparameter("S#43737", (SubLObject)$ic58$);
        $g5137$ = SubLFiles.defparameter("S#43738", (SubLObject)$ic59$);
        $g5138$ = SubLFiles.defparameter("S#43739", (SubLObject)$ic60$);
        $g5139$ = SubLFiles.defparameter("S#43740", (SubLObject)$ic62$);
        $g5140$ = SubLFiles.defparameter("S#43741", (SubLObject)T);
        $g5141$ = SubLFiles.defparameter("S#43742", (SubLObject)T);
        $g5142$ = SubLFiles.defparameter("S#43743", (SubLObject)NIL);
        $g5143$ = SubLFiles.defparameter("S#43744", (SubLObject)NIL);
        $g5144$ = SubLFiles.defparameter("S#43745", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39787() {
        module0012.f441((SubLObject)$ic1$);
        module0012.f441((SubLObject)$ic2$);
        module0012.f441((SubLObject)$ic4$);
        module0012.f444((SubLObject)$ic4$);
        module0012.f441((SubLObject)$ic6$);
        module0012.f444((SubLObject)$ic6$);
        module0012.f441((SubLObject)$ic8$);
        module0012.f444((SubLObject)$ic8$);
        module0012.f441((SubLObject)$ic9$);
        module0012.f444((SubLObject)$ic9$);
        module0012.f441((SubLObject)$ic10$);
        module0012.f444((SubLObject)$ic10$);
        module0012.f441((SubLObject)$ic11$);
        module0012.f444((SubLObject)$ic11$);
        module0012.f441((SubLObject)$ic12$);
        module0012.f444((SubLObject)$ic12$);
        module0012.f441((SubLObject)$ic13$);
        module0012.f444((SubLObject)$ic13$);
        module0012.f441((SubLObject)$ic14$);
        module0012.f441((SubLObject)$ic15$);
        module0012.f444((SubLObject)$ic15$);
        module0012.f441((SubLObject)$ic16$);
        module0012.f441((SubLObject)$ic17$);
        module0012.f444((SubLObject)$ic17$);
        module0012.f441((SubLObject)$ic18$);
        module0012.f444((SubLObject)$ic18$);
        module0012.f441((SubLObject)$ic19$);
        module0012.f444((SubLObject)$ic19$);
        module0012.f441((SubLObject)$ic20$);
        module0012.f444((SubLObject)$ic20$);
        module0012.f441((SubLObject)$ic21$);
        module0012.f444((SubLObject)$ic21$);
        module0012.f441((SubLObject)$ic22$);
        module0012.f444((SubLObject)$ic22$);
        module0012.f441((SubLObject)$ic23$);
        module0012.f444((SubLObject)$ic23$);
        module0012.f441((SubLObject)$ic24$);
        module0012.f444((SubLObject)$ic24$);
        module0012.f441((SubLObject)$ic25$);
        module0012.f444((SubLObject)$ic25$);
        module0012.f441((SubLObject)$ic26$);
        module0012.f444((SubLObject)$ic26$);
        module0012.f441((SubLObject)$ic27$);
        module0012.f444((SubLObject)$ic27$);
        module0012.f441((SubLObject)$ic28$);
        module0012.f444((SubLObject)$ic28$);
        module0012.f441((SubLObject)$ic29$);
        module0012.f444((SubLObject)$ic29$);
        module0012.f441((SubLObject)$ic30$);
        module0012.f444((SubLObject)$ic30$);
        module0012.f441((SubLObject)$ic31$);
        module0012.f444((SubLObject)$ic31$);
        module0012.f441((SubLObject)$ic33$);
        module0012.f444((SubLObject)$ic33$);
        module0012.f441((SubLObject)$ic34$);
        module0012.f441((SubLObject)$ic36$);
        module0012.f444((SubLObject)$ic36$);
        module0012.f441((SubLObject)$ic39$);
        module0012.f444((SubLObject)$ic39$);
        module0012.f441((SubLObject)$ic40$);
        module0012.f444((SubLObject)$ic40$);
        module0012.f441((SubLObject)$ic41$);
        module0012.f444((SubLObject)$ic41$);
        module0012.f441((SubLObject)$ic42$);
        module0012.f444((SubLObject)$ic42$);
        module0012.f441((SubLObject)$ic43$);
        module0012.f444((SubLObject)$ic43$);
        module0012.f441((SubLObject)$ic45$);
        module0012.f444((SubLObject)$ic45$);
        module0132.f8593((SubLObject)$ic45$, (SubLObject)UNPROVIDED);
        module0012.f441((SubLObject)$ic46$);
        module0012.f441((SubLObject)$ic47$);
        module0012.f444((SubLObject)$ic47$);
        module0012.f441((SubLObject)$ic48$);
        module0012.f441((SubLObject)$ic51$);
        module0012.f441((SubLObject)$ic52$);
        module0012.f441((SubLObject)$ic53$);
        module0012.f441((SubLObject)$ic54$);
        module0012.f441((SubLObject)$ic55$);
        module0012.f441((SubLObject)$ic61$);
        module0012.f441((SubLObject)$ic63$);
        module0012.f441((SubLObject)$ic64$);
        module0012.f441((SubLObject)$ic65$);
        module0012.f441((SubLObject)$ic66$);
        Hashtables.sethash((SubLObject)$ic77$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic78$, (SubLObject)NIL));
        module0002.f50((SubLObject)$ic79$, (SubLObject)$ic80$);
        module0002.f50((SubLObject)$ic84$, (SubLObject)$ic85$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f39785();
    }
    
    public void initializeVariables() {
        f39786();
    }
    
    public void runTopLevelForms() {
        f39787();
    }
    
    static {
        me = (SubLFile)new module0655();
        $g5076$ = null;
        $g5077$ = null;
        $g5078$ = null;
        $g5079$ = null;
        $g5080$ = null;
        $g5081$ = null;
        $g5082$ = null;
        $g5083$ = null;
        $g5084$ = null;
        $g5085$ = null;
        $g5086$ = null;
        $g5087$ = null;
        $g5088$ = null;
        $g5089$ = null;
        $g5090$ = null;
        $g5091$ = null;
        $g5092$ = null;
        $g5093$ = null;
        $g5094$ = null;
        $g5095$ = null;
        $g5096$ = null;
        $g5097$ = null;
        $g5098$ = null;
        $g5099$ = null;
        $g5100$ = null;
        $g5101$ = null;
        $g5102$ = null;
        $g5103$ = null;
        $g5104$ = null;
        $g5105$ = null;
        $g5106$ = null;
        $g5107$ = null;
        $g5108$ = null;
        $g5109$ = null;
        $g5110$ = null;
        $g5111$ = null;
        $g5112$ = null;
        $g5113$ = null;
        $g5114$ = null;
        $g5115$ = null;
        $g5116$ = null;
        $g5117$ = null;
        $g5118$ = null;
        $g5119$ = null;
        $g5120$ = null;
        $g5121$ = null;
        $g5122$ = null;
        $g5123$ = null;
        $g5124$ = null;
        $g5125$ = null;
        $g5126$ = null;
        $g5127$ = null;
        $g5128$ = null;
        $g5129$ = null;
        $g5130$ = null;
        $g5131$ = null;
        $g5132$ = null;
        $g5133$ = null;
        $g5134$ = null;
        $g5135$ = null;
        $g5136$ = null;
        $g5137$ = null;
        $g5138$ = null;
        $g5139$ = null;
        $g5140$ = null;
        $g5141$ = null;
        $g5142$ = null;
        $g5143$ = null;
        $g5144$ = null;
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("read"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#38412", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeString("write"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#38407", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeString("local"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#38407", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeString("master"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#38414", "CYC"))));
        $ic1$ = makeSymbol("S#43683", "CYC");
        $ic2$ = makeSymbol("S#43684", "CYC");
        $ic3$ = makeKeyword("MAXIMAL");
        $ic4$ = makeSymbol("S#43685", "CYC");
        $ic5$ = makeInteger(30);
        $ic6$ = makeSymbol("S#43686", "CYC");
        $ic7$ = makeKeyword("HL-FORMULAS");
        $ic8$ = makeSymbol("S#43687", "CYC");
        $ic9$ = makeSymbol("S#43688", "CYC");
        $ic10$ = makeSymbol("*CB-CONSTANT-HISTORY*");
        $ic11$ = makeSymbol("S#43689", "CYC");
        $ic12$ = makeSymbol("*CB-NAT-HISTORY*");
        $ic13$ = makeSymbol("S#43690", "CYC");
        $ic14$ = makeSymbol("*CB-ASSERTION-HISTORY*");
        $ic15$ = makeSymbol("S#43691", "CYC");
        $ic16$ = makeSymbol("*CB-SENTENCE-HISTORY*");
        $ic17$ = makeSymbol("S#43692", "CYC");
        $ic18$ = makeSymbol("S#43693", "CYC");
        $ic19$ = makeSymbol("S#43695", "CYC");
        $ic20$ = makeSymbol("S#43696", "CYC");
        $ic21$ = makeSymbol("S#43697", "CYC");
        $ic22$ = makeSymbol("S#43698", "CYC");
        $ic23$ = makeSymbol("S#43699", "CYC");
        $ic24$ = makeSymbol("S#43700", "CYC");
        $ic25$ = makeSymbol("S#43701", "CYC");
        $ic26$ = makeSymbol("S#43702", "CYC");
        $ic27$ = makeSymbol("S#43703", "CYC");
        $ic28$ = makeSymbol("S#43704", "CYC");
        $ic29$ = makeSymbol("S#43705", "CYC");
        $ic30$ = makeSymbol("S#43706", "CYC");
        $ic31$ = makeSymbol("S#43707", "CYC");
        $ic32$ = makeKeyword("LOCAL");
        $ic33$ = makeSymbol("S#43708", "CYC");
        $ic34$ = makeSymbol("S#43709", "CYC");
        $ic35$ = ConsesLow.list((SubLObject)makeString("system.common.browser.tools.cb-user-toolbar-links"));
        $ic36$ = makeSymbol("S#43710", "CYC");
        $ic37$ = ConsesLow.list((SubLObject)makeKeyword("HISTORY"), (SubLObject)makeKeyword("CREATE"), (SubLObject)makeKeyword("ASSERT"), (SubLObject)makeKeyword("COMPOSE"), (SubLObject)makeKeyword("QUERY"), (SubLObject)makeKeyword("DOC"), (SubLObject)makeKeyword("NAVIGATOR"), (SubLObject)makeKeyword("OPTIONS"));
        $ic38$ = makeKeyword("PARAMETER");
        $ic39$ = makeSymbol("S#43711", "CYC");
        $ic40$ = makeSymbol("S#43712", "CYC");
        $ic41$ = makeSymbol("S#1600", "CYC");
        $ic42$ = makeSymbol("S#43713", "CYC");
        $ic43$ = makeSymbol("S#43714", "CYC");
        $ic44$ = constant_handles_oc.f8479((SubLObject)makeString("BaseKB"));
        $ic45$ = makeSymbol("S#43715", "CYC");
        $ic46$ = makeSymbol("S#43716", "CYC");
        $ic47$ = makeSymbol("S#43717", "CYC");
        $ic48$ = makeSymbol("S#43718", "CYC");
        $ic49$ = constant_handles_oc.f8479((SubLObject)makeString("TheAssertionSentence"));
        $ic50$ = makeSymbol("NONE");
        $ic51$ = makeSymbol("S#43720", "CYC");
        $ic52$ = makeSymbol("S#43721", "CYC");
        $ic53$ = makeSymbol("S#43722", "CYC");
        $ic54$ = makeSymbol("S#43723", "CYC");
        $ic55$ = makeSymbol("S#43724", "CYC");
        $ic56$ = makeKeyword("MAIN");
        $ic57$ = makeInteger(40);
        $ic58$ = makeInteger(50);
        $ic59$ = ConsesLow.list((SubLObject)makeKeyword("DERIVED"), (SubLObject)makeKeyword("CODE"));
        $ic60$ = makeInteger(19990921);
        $ic61$ = makeSymbol("S#43739", "CYC");
        $ic62$ = makeInteger(29991231);
        $ic63$ = makeSymbol("S#43740", "CYC");
        $ic64$ = makeSymbol("S#43741", "CYC");
        $ic65$ = makeSymbol("S#43742", "CYC");
        $ic66$ = makeSymbol("S#43745", "CYC");
        $ic67$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#1519", "CYC"), (SubLObject)makeSymbol("OBJECT", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic68$ = ConsesLow.list((SubLObject)makeKeyword("DONE"));
        $ic69$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic70$ = makeKeyword("DONE");
        $ic71$ = makeSymbol("S#6648", "CYC");
        $ic72$ = makeSymbol("FUNCTION-SPEC-P");
        $ic73$ = makeSymbol("S#928", "CYC");
        $ic74$ = ConsesLow.list((SubLObject)makeSymbol("S#43663", "CYC"));
        $ic75$ = ConsesLow.list((SubLObject)makeSymbol("S#42781", "CYC"), (SubLObject)makeSymbol("S#43744", "CYC"), (SubLObject)makeSymbol("S#43743", "CYC"));
        $ic76$ = ConsesLow.list((SubLObject)makeSymbol("S#840", "CYC"), (SubLObject)makeKeyword("CB-CYC"));
        $ic77$ = makeKeyword("MINI-LOGO");
        $ic78$ = makeString("mini-logo.gif");
        $ic79$ = makeSymbol("S#43663", "CYC");
        $ic80$ = makeSymbol("S#43662", "CYC");
        $ic81$ = makeString("SHORTCUT ICON");
        $ic82$ = makeSymbol("PROGN");
        $ic83$ = ConsesLow.list((SubLObject)makeSymbol("S#43665", "CYC"));
        $ic84$ = makeSymbol("S#43665", "CYC");
        $ic85$ = makeSymbol("S#43664", "CYC");
        $ic86$ = makeString("?");
        $ic87$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#1553", "CYC"), (SubLObject)makeSymbol("S#1512", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("METHOD"), (SubLObject)makeSymbol("S#1248", "CYC"))), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic88$ = makeUninternedSymbol("US#49250BD");
        $ic89$ = makeSymbol("CLET");
        $ic90$ = makeSymbol("S#42901", "CYC");
        $ic91$ = makeSymbol("S#1011", "CYC");
        $ic92$ = makeSymbol("*CYC-CGI-PROGRAM*");
        $ic93$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#1630", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#1553", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#132", "CYC"), (SubLObject)T), (SubLObject)makeSymbol("S#1512", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("METHOD"), (SubLObject)makeSymbol("S#1248", "CYC"))), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic94$ = makeSymbol("S#43666", "CYC");
        $ic95$ = makeSymbol("S#912", "CYC");
        $ic96$ = ConsesLow.list((SubLObject)makeSymbol("S#1628", "CYC"), (SubLObject)makeSymbol("S#1629", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#1553", "CYC"), (SubLObject)makeKeyword("MAIN")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#1523", "CYC"), (SubLObject)NIL), (SubLObject)makeSymbol("CLASS"), (SubLObject)makeSymbol("S#1610", "CYC"));
        $ic97$ = makeUninternedSymbol("US#49250BD");
        $ic98$ = makeSymbol("S#1039", "CYC");
        $ic99$ = makeKeyword("TARGET");
        $ic100$ = makeKeyword("TITLE");
        $ic101$ = makeKeyword("HREF");
        $ic102$ = makeKeyword("CLASS");
        $ic103$ = makeKeyword("ATTRS");
        $ic104$ = ConsesLow.list((SubLObject)makeSymbol("S#1628", "CYC"), (SubLObject)makeSymbol("S#1629", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#1523", "CYC"), (SubLObject)NIL));
        $ic105$ = makeSymbol("S#43668", "CYC");
        $ic106$ = makeKeyword("TOP");
        $ic107$ = ConsesLow.list((SubLObject)makeSymbol("S#39754", "CYC"), (SubLObject)makeSymbol("S#1629", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#1553", "CYC"), (SubLObject)makeKeyword("MAIN")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#1523", "CYC"), (SubLObject)NIL), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#1519", "CYC"), (SubLObject)NIL));
        $ic108$ = makeUninternedSymbol("US#49250BD");
        $ic109$ = makeKeyword("ID");
        $ic110$ = ConsesLow.list((SubLObject)makeSymbol("S#1628", "CYC"), (SubLObject)makeSymbol("S#1629", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#1553", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#6511", "CYC"), (SubLObject)makeString("")));
        $ic111$ = makeString("");
        $ic112$ = makeUninternedSymbol("US#49250BD");
        $ic113$ = makeSymbol("FWHEN");
        $ic114$ = makeKeyword("ONCLICK");
        $ic115$ = ConsesLow.list((SubLObject)makeSymbol("S#919", "CYC"), (SubLObject)makeString("window.open('"));
        $ic116$ = ConsesLow.list((SubLObject)makeSymbol("S#919", "CYC"), (SubLObject)makeString("',"));
        $ic117$ = makeSymbol("PIF");
        $ic118$ = makeSymbol("S#919", "CYC");
        $ic119$ = makeString("'~A'");
        $ic120$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#919", "CYC"), (SubLObject)makeString("null")));
        $ic121$ = makeString(",'~A'); ");
        $ic122$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#919", "CYC"), (SubLObject)makeString("return false;")));
        $ic123$ = makeUninternedSymbol("US#49250BD");
        $ic124$ = ConsesLow.list((SubLObject)makeSymbol("S#1628", "CYC"), (SubLObject)makeSymbol("S#1629", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#1553", "CYC"), (SubLObject)makeKeyword("MAIN")), (SubLObject)makeSymbol("S#42996", "CYC"), (SubLObject)makeSymbol("S#1633", "CYC"), (SubLObject)makeSymbol("S#896", "CYC"), (SubLObject)makeSymbol("S#42997", "CYC"));
        $ic125$ = makeUninternedSymbol("US#49250BD");
        $ic126$ = makeSymbol("S#42942", "CYC");
        $ic127$ = makeKeyword("HOVEROVER-HTML");
        $ic128$ = makeKeyword("CAPTION");
        $ic129$ = makeKeyword("WIDTH");
        $ic130$ = makeKeyword("STICKY");
        $ic131$ = ConsesLow.list((SubLObject)makeSymbol("S#25412", "CYC"), (SubLObject)makeSymbol("S#30", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic132$ = makeString("CB-LINK-~A");
        $ic133$ = makeSymbol("DEFINE");
        $ic134$ = makeSymbol("S#43746", "CYC");
        $ic135$ = makeSymbol("QUOTE");
        $ic136$ = ConsesLow.list((SubLObject)makeSymbol("S#43747", "CYC"), (SubLObject)makeSymbol("S#1628", "CYC"), (SubLObject)makeSymbol("S#1629", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#1553", "CYC"), (SubLObject)makeKeyword("MAIN")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#1523", "CYC"), (SubLObject)NIL));
        $ic137$ = makeSymbol("PWHEN-FEATURE");
        $ic138$ = makeKeyword("CYC-OPENCYC");
        $ic139$ = makeSymbol("PWHEN");
        $ic140$ = makeSymbol("S#862", "CYC");
        $ic141$ = makeSymbol("S#866", "CYC");
        $ic142$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#42785", "CYC")));
        $ic143$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#43748", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#43749", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic144$ = makeSymbol("FIF");
        $ic145$ = makeSymbol("S#43750", "CYC");
        $ic146$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("S#43751", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("S#43752", "CYC")));
        $ic147$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("S#43753", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("S#43754", "CYC")));
        $ic148$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#43730", "CYC"), (SubLObject)NIL), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#43731", "CYC"), (SubLObject)NIL));
        $ic149$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#43748", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic150$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("S#43755", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("S#43756", "CYC")));
        $ic151$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#1523", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#1532", "CYC"), (SubLObject)makeSymbol("S#43757", "CYC"), (SubLObject)makeSymbol("S#43758", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#1518", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#1090", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#1505", "CYC"), (SubLObject)T)), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic152$ = ConsesLow.list((SubLObject)makeKeyword("COMPLETION?"), (SubLObject)makeKeyword("SIMPLE-APPLET-INPUT?"), (SubLObject)makeKeyword("PASSWORD?"), (SubLObject)makeKeyword("COLOR"), (SubLObject)makeKeyword("SHOW-COPYRIGHT"));
        $ic153$ = makeKeyword("COMPLETION?");
        $ic154$ = makeKeyword("SIMPLE-APPLET-INPUT?");
        $ic155$ = makeKeyword("PASSWORD?");
        $ic156$ = makeKeyword("COLOR");
        $ic157$ = makeSymbol("S#1090", "CYC");
        $ic158$ = makeKeyword("SHOW-COPYRIGHT");
        $ic159$ = makeUninternedSymbol("US#3E5C08A");
        $ic160$ = makeSymbol("S#1002", "CYC");
        $ic161$ = makeSymbol("S#930", "CYC");
        $ic162$ = ConsesLow.list((SubLObject)makeSymbol("S#1710", "CYC"));
        $ic163$ = makeSymbol("S#942", "CYC");
        $ic164$ = makeSymbol("S#1531", "CYC");
        $ic165$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#1533", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#1651", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#1652", "CYC")));
        $ic166$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#825", "CYC"), (SubLObject)makeKeyword("SHA1")));
        $ic167$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#42954", "CYC")));
        $ic168$ = makeSymbol("S#925", "CYC");
        $ic169$ = makeKeyword("BACKGROUND-COLOR");
        $ic170$ = ConsesLow.list((SubLObject)makeSymbol("S#931", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("ID"), (SubLObject)makeString("reloadFrameButton")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#1012", "CYC"), (SubLObject)makeString("button"), (SubLObject)makeKeyword("NAME"), (SubLObject)makeString("reload"), (SubLObject)makeKeyword("VALUE"), (SubLObject)makeString("Refresh Frames")));
        $ic171$ = makeSymbol("S#947", "CYC");
        $ic172$ = ConsesLow.list((SubLObject)TWO_INTEGER);
        $ic173$ = ConsesLow.list((SubLObject)makeSymbol("S#134", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic174$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#134", "CYC"), (SubLObject)makeSymbol("S#1523", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#1532", "CYC"), (SubLObject)makeSymbol("S#43759", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#1518", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#1090", "CYC")))), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic175$ = ConsesLow.list((SubLObject)makeKeyword("COMPLETION?"), (SubLObject)makeKeyword("DHTML?"), (SubLObject)makeKeyword("COLOR"));
        $ic176$ = makeKeyword("DHTML?");
        $ic177$ = makeUninternedSymbol("US#3E5C08A");
        $ic178$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#1661", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#1664", "CYC")));
        $ic179$ = ConsesLow.list((SubLObject)makeSymbol("S#931", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("ID"), (SubLObject)makeString("reloadFrameButton")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#1012", "CYC"), (SubLObject)makeString("button"), (SubLObject)makeKeyword("NAME"), (SubLObject)makeString("reload"), (SubLObject)makeKeyword("VALUE"), (SubLObject)makeString("Refresh"), (SubLObject)makeKeyword("ONCLICK"), (SubLObject)makeString("reloadCurrentFrame('reloadFrameButton');")));
        $ic180$ = makeSymbol("S#43679", "CYC");
        $ic181$ = makeKeyword("CYC-PPH");
        $ic182$ = makeSymbol("WITH-PPH-MEMOIZATION");
        $ic183$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("*PPH-LANGUAGE-MT*"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#43760", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("*PARAPHRASE-MODE*"), (SubLObject)makeKeyword("HTML")));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 380 ms
	
	Decompiled with Procyon 0.5.32.
*/