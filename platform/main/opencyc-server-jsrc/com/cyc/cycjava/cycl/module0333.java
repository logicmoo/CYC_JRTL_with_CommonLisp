package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0333 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0333";
    public static final String myFingerPrint = "e20cdf507c7e40a4518eb8d6c3de9d912b0ef4497b64d550ba20bbf3346ccdb8";
    private static SubLSymbol $g2849$;
    private static SubLSymbol $g2850$;
    private static SubLSymbol $g2851$;
    public static SubLSymbol $g2852$;
    public static SubLSymbol $g2853$;
    private static SubLSymbol $g2854$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLString $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLString $ic9$;
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
    private static final SubLObject $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLList $ic32$;
    private static final SubLList $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLList $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLObject $ic40$;
    private static final SubLObject $ic41$;
    private static final SubLObject $ic42$;
    private static final SubLObject $ic43$;
    private static final SubLObject $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLObject $ic46$;
    private static final SubLObject $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLObject $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLList $ic54$;
    private static final SubLList $ic55$;
    private static final SubLObject $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLList $ic58$;
    private static final SubLList $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLList $ic61$;
    private static final SubLObject $ic62$;
    private static final SubLObject $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLList $ic65$;
    private static final SubLList $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLList $ic69$;
    private static final SubLObject $ic70$;
    private static final SubLObject $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLString $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLList $ic78$;
    private static final SubLObject $ic79$;
    private static final SubLList $ic80$;
    private static final SubLList $ic81$;
    private static final SubLObject $ic82$;
    private static final SubLObject $ic83$;
    private static final SubLObject $ic84$;
    private static final SubLObject $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLList $ic90$;
    private static final SubLList $ic91$;
    private static final SubLList $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLObject $ic94$;
    private static final SubLObject $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLList $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLList $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLList $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLList $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLList $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLList $ic109$;
    private static final SubLList $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLList $ic112$;
    private static final SubLList $ic113$;
    private static final SubLObject $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLList $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLList $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLList $ic120$;
    private static final SubLObject $ic121$;
    private static final SubLObject $ic122$;
    private static final SubLList $ic123$;
    private static final SubLList $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLList $ic126$;
    private static final SubLList $ic127$;
    private static final SubLList $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLList $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLList $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLList $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLObject $ic142$;
    private static final SubLObject $ic143$;
    private static final SubLObject $ic144$;
    private static final SubLList $ic145$;
    private static final SubLList $ic146$;
    private static final SubLList $ic147$;
    private static final SubLList $ic148$;
    private static final SubLObject $ic149$;
    private static final SubLObject $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLList $ic152$;
    private static final SubLObject $ic153$;
    private static final SubLObject $ic154$;
    private static final SubLList $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLList $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLList $ic159$;
    private static final SubLList $ic160$;
    private static final SubLObject $ic161$;
    private static final SubLObject $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLList $ic164$;
    private static final SubLObject $ic165$;
    private static final SubLObject $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLList $ic168$;
    private static final SubLObject $ic169$;
    private static final SubLObject $ic170$;
    private static final SubLObject $ic171$;
    private static final SubLString $ic172$;
    private static final SubLString $ic173$;
    private static final SubLSymbol $ic174$;
    private static final SubLList $ic175$;
    private static final SubLSymbol $ic176$;
    private static final SubLList $ic177$;
    private static final SubLSymbol $ic178$;
    private static final SubLList $ic179$;
    private static final SubLSymbol $ic180$;
    private static final SubLList $ic181$;
    private static final SubLList $ic182$;
    private static final SubLSymbol $ic183$;
    private static final SubLList $ic184$;
    private static final SubLSymbol $ic185$;
    private static final SubLList $ic186$;
    private static final SubLSymbol $ic187$;
    private static final SubLList $ic188$;
    private static final SubLString $ic189$;
    private static final SubLString $ic190$;
    private static final SubLSymbol $ic191$;
    private static final SubLList $ic192$;
    private static final SubLSymbol $ic193$;
    private static final SubLSymbol $ic194$;
    private static final SubLSymbol $ic195$;
    private static final SubLList $ic196$;
    private static final SubLSymbol $ic197$;
    private static final SubLList $ic198$;
    private static final SubLSymbol $ic199$;
    private static final SubLList $ic200$;
    private static final SubLSymbol $ic201$;
    private static final SubLList $ic202$;
    
    public static SubLObject f22416(final SubLObject var1) {
        return module0004.f104(var1, $g2849$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f22417(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0173.f10955(var1) && NIL == f22416(var1));
    }
    
    public static SubLObject f22418(final SubLObject var3) {
        assert NIL != module0173.f10955(var3) : var3;
        if (NIL == conses_high.member(var3, $g2849$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            $g2849$.setGlobalValue((SubLObject)ConsesLow.cons(var3, $g2849$.getGlobalValue()));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22419(final SubLObject var3) {
        assert NIL != module0173.f10955(var3) : var3;
        $g2849$.setGlobalValue(Sequences.remove(var3, $g2849$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22420() {
        return $g2850$.getGlobalValue();
    }
    
    public static SubLObject f22421(final SubLObject var1) {
        return module0035.f2169(var1, $g2850$.getGlobalValue());
    }
    
    public static SubLObject f22422(final SubLObject var5, SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        assert NIL != Types.keywordp(var5) : var5;
        SubLObject var8 = $g2851$.getDynamicValue(var7);
        SubLObject var9 = (SubLObject)NIL;
        var9 = var8.first();
        while (NIL != var8) {
            Symbols.remprop(var5, var9);
            var8 = var8.rest();
            var9 = var8.first();
        }
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = (SubLObject)NIL;
        var10 = var6.first();
        var11 = conses_high.second(var6);
        while (NIL != var6) {
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var7) && NIL == conses_high.member(var10, $g2851$.getDynamicValue(var7), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                Errors.error((SubLObject)$ic9$, var10);
            }
            Symbols.put(var5, var10, var11);
            var6 = conses_high.cddr(var6);
            var10 = var6.first();
            var11 = conses_high.second(var6);
        }
        if (NIL == conses_high.member(var5, $g2850$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            $g2850$.setGlobalValue((SubLObject)ConsesLow.cons(var5, $g2850$.getGlobalValue()));
        }
        return var5;
    }
    
    public static SubLObject f22423(final SubLObject var11) {
        return Symbols.get(var11, (SubLObject)$ic10$, (SubLObject)NIL);
    }
    
    public static SubLObject f22424(final SubLObject var11) {
        return Symbols.get(var11, (SubLObject)$ic11$, (SubLObject)NIL);
    }
    
    public static SubLObject f22425(final SubLObject var11) {
        return Symbols.get(var11, (SubLObject)$ic12$, (SubLObject)NIL);
    }
    
    public static SubLObject f22426(final SubLObject var11) {
        return Symbols.get(var11, (SubLObject)$ic13$, (SubLObject)$ic14$);
    }
    
    public static SubLObject f22427(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        assert NIL != module0191.f11950(var12) : var12;
        if (NIL != module0191.f11957(var12)) {
            return (SubLObject)NIL;
        }
        final SubLObject var14 = module0191.f11965(var12);
        if (NIL == f22421(var14)) {
            return (SubLObject)NIL;
        }
        final SubLObject var15 = f22423(var14);
        if (NIL == var15) {
            return (SubLObject)T;
        }
        SubLObject var16 = (SubLObject)NIL;
        final SubLObject var17 = module0147.f9540(module0191.f11976(var12));
        final SubLObject var18 = module0147.$g2095$.currentBinding(var13);
        final SubLObject var19 = module0147.$g2094$.currentBinding(var13);
        final SubLObject var20 = module0147.$g2096$.currentBinding(var13);
        try {
            module0147.$g2095$.bind(module0147.f9545(var17), var13);
            module0147.$g2094$.bind(module0147.f9546(var17), var13);
            module0147.$g2096$.bind(module0147.f9549(var17), var13);
            var16 = Functions.funcall(var15, var12);
        }
        finally {
            module0147.$g2096$.rebind(var20, var13);
            module0147.$g2094$.rebind(var19, var13);
            module0147.$g2095$.rebind(var18, var13);
        }
        return module0035.sublisp_boolean(var16);
    }
    
    public static SubLObject f22428(final SubLObject var12) {
        assert NIL != module0191.f11950(var12) : var12;
        return module0191.f11977(var12);
    }
    
    public static SubLObject f22429(final SubLObject var12) {
        assert NIL != module0191.f11950(var12) : var12;
        final SubLObject var13 = f22428(var12);
        if (NIL != module0035.f1997(var13) && var12.equal(var13.first())) {
            return conses_high.copy_list(var13);
        }
        return f22430(var13);
    }
    
    public static SubLObject f22430(final SubLObject var20) {
        assert NIL != module0191.f11993(var20) : var20;
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22 = var20;
        SubLObject var23 = (SubLObject)NIL;
        var23 = var22.first();
        while (NIL != var22) {
            var21 = (SubLObject)ConsesLow.cons(f22429(var23), var21);
            var22 = var22.rest();
            var23 = var22.first();
        }
        var21 = Sequences.nreverse(var21);
        SubLObject var24 = Functions.apply(Symbols.symbol_function((SubLObject)$ic17$), var21);
        var24 = Sequences.delete_duplicates(var24, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var24;
    }
    
    public static SubLObject f22431(final SubLObject var20, SubLObject var24, SubLObject var25, SubLObject var26) {
        if (var24 == UNPROVIDED) {
            var24 = (SubLObject)NIL;
        }
        if (var25 == UNPROVIDED) {
            var25 = (SubLObject)$ic18$;
        }
        if (var26 == UNPROVIDED) {
            var26 = (SubLObject)$ic18$;
        }
        final SubLThread var27 = SubLProcess.currentSubLThread();
        assert NIL != module0191.f11993(var20) : var20;
        var27.resetMultipleValues();
        final SubLObject var28 = f22432(var20);
        final SubLObject var29 = var27.secondMultipleValue();
        final SubLObject var30 = var27.thirdMultipleValue();
        var27.resetMultipleValues();
        final SubLObject var31 = module0077.f5313(Symbols.symbol_function((SubLObject)EQL), (SubLObject)ZERO_INTEGER);
        final SubLObject var32 = module0077.f5313(Symbols.symbol_function((SubLObject)EQL), (SubLObject)ZERO_INTEGER);
        final SubLObject var33 = module0077.f5313(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)ZERO_INTEGER);
        SubLObject var37;
        SubLObject var38;
        SubLObject var39;
        for (SubLObject var34 = module0078.f5370(var28, Symbols.symbol_function((SubLObject)EQL)), var35 = module0078.f5370(var29, Symbols.symbol_function((SubLObject)EQL)), var36 = module0078.f5370(var30, Symbols.symbol_function((SubLObject)EQUAL)); NIL == module0077.f5316(var34) || NIL == module0077.f5316(var35) || NIL == module0077.f5316(var36); var34 = var37, var35 = var38, var36 = var39) {
            var37 = module0077.f5313(Symbols.symbol_function((SubLObject)EQL), (SubLObject)ZERO_INTEGER);
            var38 = module0077.f5313(Symbols.symbol_function((SubLObject)EQL), (SubLObject)ZERO_INTEGER);
            var39 = module0077.f5313(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)ZERO_INTEGER);
            SubLObject var40 = module0077.f5333(var34);
            SubLObject var41;
            SubLObject var42;
            SubLObject var43;
            SubLObject var44;
            SubLObject var45;
            for (var41 = module0032.f1741(var40), var42 = (SubLObject)NIL, var42 = module0032.f1742(var41, var40); NIL == module0032.f1744(var41, var42); var42 = module0032.f1743(var42)) {
                var43 = module0032.f1745(var41, var42);
                if (NIL != module0032.f1746(var42, var43) && NIL == module0077.f5320(var43, var31)) {
                    module0077.f5326(var43, var31);
                    var44 = module0178.f11287(var43);
                    var45 = module0471.f31580(var24, var44);
                    if (NIL != var45) {
                        module0077.f5326(var45, var39);
                    }
                }
            }
            var40 = module0077.f5333(var35);
            SubLObject var46;
            SubLObject var47;
            SubLObject var48;
            SubLObject var49;
            SubLObject var50;
            SubLObject var27_49;
            SubLObject var28_50;
            SubLObject var29_51;
            SubLObject var8_52;
            SubLObject var51;
            SubLObject var8_53;
            SubLObject var45_54;
            SubLObject var8_54;
            SubLObject var52;
            SubLObject var53;
            for (var41 = module0032.f1741(var40), var42 = (SubLObject)NIL, var42 = module0032.f1742(var41, var40); NIL == module0032.f1744(var41, var42); var42 = module0032.f1743(var42)) {
                var46 = module0032.f1745(var41, var42);
                if (NIL != module0032.f1746(var42, var46) && NIL == module0077.f5320(var46, var32)) {
                    module0077.f5326(var46, var32);
                    if (NIL == module0178.f11375(var46)) {
                        var47 = module0178.f11292(var46);
                        var48 = module0178.f11299(var46);
                        var49 = (SubLObject)NIL;
                        var49 = var48.first();
                        while (NIL != var48) {
                            if (NIL != deduction_handles_oc.f11659(var49) && var47.eql(module0188.f11789(var49)) && NIL != Functions.funcall(var25, var49)) {
                                var50 = module0188.f11770(var49);
                                var27.resetMultipleValues();
                                var27_49 = f22432(var50);
                                var28_50 = var27.secondMultipleValue();
                                var29_51 = var27.thirdMultipleValue();
                                var27.resetMultipleValues();
                                var8_52 = var27_49;
                                var51 = (SubLObject)NIL;
                                var51 = var8_52.first();
                                while (NIL != var8_52) {
                                    module0077.f5326(var51, var37);
                                    var8_52 = var8_52.rest();
                                    var51 = var8_52.first();
                                }
                                var8_53 = var28_50;
                                var45_54 = (SubLObject)NIL;
                                var45_54 = var8_53.first();
                                while (NIL != var8_53) {
                                    module0077.f5326(var45_54, var38);
                                    var8_53 = var8_53.rest();
                                    var45_54 = var8_53.first();
                                }
                                var8_54 = var29_51;
                                var52 = (SubLObject)NIL;
                                var52 = var8_54.first();
                                while (NIL != var8_54) {
                                    module0077.f5326(var52, var39);
                                    var8_54 = var8_54.rest();
                                    var52 = var8_54.first();
                                }
                            }
                            var48 = var48.rest();
                            var49 = var48.first();
                        }
                    }
                    var53 = module0178.f11287(var46);
                    var45 = module0471.f31580(var24, var53);
                    if (NIL != var45) {
                        module0077.f5326(var45, var39);
                    }
                }
            }
            var40 = module0077.f5333(var36);
            SubLObject var54;
            SubLObject var55;
            SubLObject var27_50;
            SubLObject var28_51;
            SubLObject var29_52;
            SubLObject var56;
            SubLObject var57;
            SubLObject var58;
            SubLObject var56_61;
            SubLObject var59;
            for (var41 = module0032.f1741(var40), var42 = (SubLObject)NIL, var42 = module0032.f1742(var41, var40); NIL == module0032.f1744(var41, var42); var42 = module0032.f1743(var42)) {
                var54 = module0032.f1745(var41, var42);
                if (NIL != module0032.f1746(var42, var54) && NIL == module0077.f5320(var54, var33)) {
                    module0077.f5326(var54, var33);
                    if (NIL != Functions.funcall(var26, var54)) {
                        var55 = f22429(var54);
                        var27.resetMultipleValues();
                        var27_50 = f22432(var55);
                        var28_51 = var27.secondMultipleValue();
                        var29_52 = var27.thirdMultipleValue();
                        var27.resetMultipleValues();
                        var56 = var27_50;
                        var57 = (SubLObject)NIL;
                        var57 = var56.first();
                        while (NIL != var56) {
                            module0077.f5326(var57, var37);
                            var56 = var56.rest();
                            var57 = var56.first();
                        }
                        var56 = var28_51;
                        var58 = (SubLObject)NIL;
                        var58 = var56.first();
                        while (NIL != var56) {
                            module0077.f5326(var58, var38);
                            var56 = var56.rest();
                            var58 = var56.first();
                        }
                        var56 = var29_52;
                        var56_61 = (SubLObject)NIL;
                        var56_61 = var56.first();
                        while (NIL != var56) {
                            module0077.f5326(var56_61, var39);
                            var56 = var56.rest();
                            var56_61 = var56.first();
                        }
                    }
                    var59 = module0191.f11972(var54);
                    var45 = module0471.f31580(var24, var59);
                    if (NIL != var45) {
                        module0077.f5326(var45, var39);
                    }
                }
            }
        }
        final SubLObject var60 = module0191.f11964(module0077.f5312(var31));
        final SubLObject var61 = module0191.f11964(module0077.f5312(var32));
        final SubLObject var62 = module0191.f11964(module0077.f5312(var33));
        final SubLObject var63 = ConsesLow.nconc(var60, var61);
        return Values.values(var63, var62);
    }
    
    public static SubLObject f22433(final SubLObject var67) {
        assert NIL != assertion_handles_oc.f11035(var67) : var67;
        final SubLObject var68 = (SubLObject)ConsesLow.list(var67);
        final SubLObject var69 = f22431(var68, (SubLObject)NIL, Symbols.symbol_function((SubLObject)$ic18$), Symbols.symbol_function((SubLObject)$ic18$));
        final SubLObject var70 = module0035.remove_if_not(Symbols.symbol_function((SubLObject)$ic20$), var69, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var71 = module0035.remove_if_not(Symbols.symbol_function((SubLObject)$ic21$), var70, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        var71 = Sequences.remove_if(Symbols.symbol_function((SubLObject)$ic22$), var71, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        var71 = Sort.sort(var71, Symbols.symbol_function((SubLObject)$ic23$), Symbols.symbol_function((SubLObject)$ic24$));
        var71 = module0211.f13744(var71);
        return var71;
    }
    
    public static SubLObject f22434(final SubLObject var56) {
        final SubLThread var57 = SubLProcess.currentSubLThread();
        assert NIL != module0191.f11952(var56) : var56;
        final SubLObject var58 = module0191.f11966(var56);
        SubLObject var59 = (SubLObject)NIL;
        if (NIL != f22421(var58)) {
            final SubLObject var60 = f22424(var58);
            if (NIL != var60) {
                final SubLObject var61 = module0191.f11972(var56);
                final SubLObject var62 = module0147.f9540(var61);
                final SubLObject var63 = module0147.$g2095$.currentBinding(var57);
                final SubLObject var64 = module0147.$g2094$.currentBinding(var57);
                final SubLObject var65 = module0147.$g2096$.currentBinding(var57);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var62), var57);
                    module0147.$g2094$.bind(module0147.f9546(var62), var57);
                    module0147.$g2096$.bind(module0147.f9549(var62), var57);
                    var59 = Functions.funcall(var60, var56);
                }
                finally {
                    module0147.$g2096$.rebind(var65, var57);
                    module0147.$g2094$.rebind(var64, var57);
                    module0147.$g2095$.rebind(var63, var57);
                }
            }
            if (NIL == module0191.f11995(var59)) {
                var59 = f22435(var56);
            }
        }
        if (NIL == module0035.f2370((SubLObject)$ic26$, var59, (SubLObject)UNPROVIDED)) {
            Errors.warn((SubLObject)$ic27$, var56, var59);
            return (SubLObject)NIL;
        }
        return var59;
    }
    
    public static SubLObject f22435(final SubLObject var12) {
        return (SubLObject)ConsesLow.list(var12);
    }
    
    public static SubLObject f22432(final SubLObject var20) {
        assert NIL != module0191.f11993(var20) : var20;
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22 = (SubLObject)NIL;
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var24 = var20;
        SubLObject var25 = (SubLObject)NIL;
        var25 = var24.first();
        while (NIL != var24) {
            if (NIL != module0179.f11424(var25)) {
                var25 = module0183.f11557(var25);
            }
            if (NIL != module0191.f11952(var25)) {
                final SubLObject var26 = var25;
                if (NIL == conses_high.member(var26, var23, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var23 = (SubLObject)ConsesLow.cons(var26, var23);
                }
            }
            else if (NIL != module0178.f11290(var25)) {
                final SubLObject var26 = var25;
                if (NIL == conses_high.member(var26, var21, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var21 = (SubLObject)ConsesLow.cons(var26, var21);
                }
            }
            else {
                final SubLObject var26 = var25;
                if (NIL == conses_high.member(var26, var22, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var22 = (SubLObject)ConsesLow.cons(var26, var22);
                }
            }
            var24 = var24.rest();
            var25 = var24.first();
        }
        var21 = Sort.sort(var21, Symbols.symbol_function((SubLObject)$ic23$), Symbols.symbol_function((SubLObject)$ic28$));
        var22 = Sort.sort(var22, Symbols.symbol_function((SubLObject)$ic23$), Symbols.symbol_function((SubLObject)$ic28$));
        var23 = module0213.f13926(var23, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return Values.values(var21, var22, var23);
    }
    
    public static SubLObject f22436(final SubLObject var12, final SubLObject var74) {
        final SubLThread var75 = SubLProcess.currentSubLThread();
        assert NIL != module0191.f11950(var12) : var12;
        final SubLObject var76 = module0191.f11965(var12);
        if (NIL == f22421(var76)) {
            return (SubLObject)NIL;
        }
        final SubLObject var77 = f22425(var76);
        if (NIL == var77) {
            return (SubLObject)T;
        }
        SubLObject var78 = (SubLObject)NIL;
        final SubLObject var79 = module0147.f9540(module0191.f11976(var12));
        final SubLObject var80 = module0147.$g2095$.currentBinding(var75);
        final SubLObject var81 = module0147.$g2094$.currentBinding(var75);
        final SubLObject var82 = module0147.$g2096$.currentBinding(var75);
        try {
            module0147.$g2095$.bind(module0147.f9545(var79), var75);
            module0147.$g2094$.bind(module0147.f9546(var79), var75);
            module0147.$g2096$.bind(module0147.f9549(var79), var75);
            var78 = Functions.funcall(var77, var12, var74);
        }
        finally {
            module0147.$g2096$.rebind(var82, var75);
            module0147.$g2094$.rebind(var81, var75);
            module0147.$g2095$.rebind(var80, var75);
        }
        return var78;
    }
    
    public static SubLObject f22437(final SubLObject var12, final SubLObject var74) {
        final SubLThread var75 = SubLProcess.currentSubLThread();
        SubLObject var76 = (SubLObject)NIL;
        final SubLObject var77 = module0152.$g2129$.currentBinding(var75);
        try {
            module0152.$g2129$.bind((SubLObject)NIL, var75);
            final SubLObject var17_76 = module0144.$g1796$.currentBinding(var75);
            final SubLObject var78 = module0144.$g1795$.currentBinding(var75);
            final SubLObject var79 = module0152.$g2116$.currentBinding(var75);
            final SubLObject var80 = module0152.$g2115$.currentBinding(var75);
            try {
                module0144.$g1796$.bind((SubLObject)T, var75);
                module0144.$g1795$.bind((SubLObject)T, var75);
                module0152.$g2116$.bind((SubLObject)T, var75);
                module0152.$g2115$.bind((SubLObject)T, var75);
                f22436(var12, var74);
            }
            finally {
                module0152.$g2115$.rebind(var80, var75);
                module0152.$g2116$.rebind(var79, var75);
                module0144.$g1795$.rebind(var78, var75);
                module0144.$g1796$.rebind(var17_76, var75);
            }
            var76 = module0152.$g2129$.getDynamicValue(var75);
        }
        finally {
            module0152.$g2129$.rebind(var77, var75);
        }
        return var76;
    }
    
    public static SubLObject f22438(final SubLObject var12) {
        final SubLObject var13 = module0191.f11965(var12);
        assert NIL != f22421(var13) : var13;
        final SubLObject var14 = f22426(var13);
        final SubLObject var15 = module0191.f11976(var12);
        if (NIL != var14 && var15.eql($ic29$)) {
            return Functions.funcall(var14, var12);
        }
        return (SubLObject)ConsesLow.list(var12);
    }
    
    public static SubLObject f22439(final SubLObject var79, SubLObject var73) {
        if (var73 == UNPROVIDED) {
            var73 = (SubLObject)NIL;
        }
        final SubLThread var80 = SubLProcess.currentSubLThread();
        SubLObject var81 = (SubLObject)NIL;
        final SubLObject var82 = var73;
        final SubLObject var83 = module0147.$g2094$.currentBinding(var80);
        final SubLObject var84 = module0147.$g2095$.currentBinding(var80);
        try {
            module0147.$g2094$.bind(module0147.f9531(var82), var80);
            module0147.$g2095$.bind(module0147.f9534(var82), var80);
            final SubLObject var85 = module0288.f19338(var79, (SubLObject)UNPROVIDED);
            if (NIL != var85) {
                var81 = var85;
            }
            else {
                var81 = module0191.f11990((SubLObject)$ic30$, var79, var73, (SubLObject)UNPROVIDED);
            }
        }
        finally {
            module0147.$g2095$.rebind(var84, var80);
            module0147.$g2094$.rebind(var83, var80);
        }
        return var81;
    }
    
    public static SubLObject f22440(final SubLObject var20) {
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22 = (SubLObject)NIL;
        SubLObject var23 = var20;
        SubLObject var24 = (SubLObject)NIL;
        var24 = var23.first();
        while (NIL != var23) {
            if (NIL != assertion_handles_oc.f11035(var24)) {
                var21 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0178.f11287(var24)), var21);
            }
            else {
                final SubLObject var25 = f22438(var24);
                var21 = (SubLObject)ConsesLow.cons(Mapping.mapcar((SubLObject)$ic31$, var25), var21);
            }
            var23 = var23.rest();
            var24 = var23.first();
        }
        SubLObject var27;
        final SubLObject var26 = var27 = module0035.f2489(var21, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var28 = (SubLObject)NIL;
        var28 = var27.first();
        while (NIL != var27) {
            final SubLObject var29 = module0349.f23437(var28, (SubLObject)UNPROVIDED);
            var22 = ConsesLow.append(var22, var29);
            var27 = var27.rest();
            var28 = var27.first();
        }
        if (NIL != module0035.f2002(var26, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) {
            var22 = module0262.f17367(module0035.f2269(var22, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
        }
        return var22;
    }
    
    public static SubLObject f22441(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        if (NIL == $g2852$.getDynamicValue(var13)) {
            return (SubLObject)T;
        }
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var17 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var14 = var12.first();
        SubLObject var18 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var18, var12, (SubLObject)$ic33$);
        var15 = var18.first();
        var18 = var18.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var18, var12, (SubLObject)$ic33$);
        var16 = var18.first();
        var18 = var18.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var18, var12, (SubLObject)$ic33$);
        var17 = var18.first();
        var18 = var18.rest();
        if (NIL == var18) {
            SubLObject var19 = (SubLObject)NIL;
            final SubLObject var20 = $g2852$.currentBinding(var13);
            try {
                $g2852$.bind((SubLObject)NIL, var13);
                var19 = module0434.f30597(var15, var16);
            }
            finally {
                $g2852$.rebind(var20, var13);
            }
            return module0035.sublisp_boolean(var19);
        }
        cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22442(final SubLObject var12) {
        return (SubLObject)makeBoolean(NIL == assertion_handles_oc.f11035(var12) && $ic34$ == module0191.f11965(var12));
    }
    
    public static SubLObject f22443(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL != var17) {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
            return (SubLObject)NIL;
        }
        final SubLObject var18 = module0617.f37894(module0202.f12826(var14));
        final SubLObject var19 = (SubLObject)((NIL != module0205.f13337(var14)) ? $ic37$ : $ic38$);
        if (var18 == $ic39$) {
            return (SubLObject)T;
        }
        return Equality.eq(var18, var19);
    }
    
    public static SubLObject f22444(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL != var17) {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
            return (SubLObject)NIL;
        }
        if (NIL != module0205.f13337(var14)) {
            final SubLObject var18 = module0202.f12826(var14);
            final SubLObject var19 = module0617.f37897(var18);
            SubLObject var20 = (SubLObject)NIL;
            SubLObject var21 = var19;
            SubLObject var22 = (SubLObject)NIL;
            var22 = var21.first();
            while (NIL != var21) {
                final SubLObject var23 = f22445(var22);
                if (NIL != var23) {
                    var20 = (SubLObject)ConsesLow.cons(var23, var20);
                }
                else {
                    SubLObject var24 = (SubLObject)NIL;
                    final SubLObject var25 = module0205.f13333(var22);
                    if (var25.eql($ic40$) || var25.eql($ic41$) || var25.eql($ic42$) || var25.eql($ic43$)) {
                        var24 = module0500.f32237(var22);
                    }
                    else if (var25.eql($ic44$)) {
                        var24 = module0191.f11990((SubLObject)$ic45$, var22, $ic46$, (SubLObject)UNPROVIDED);
                    }
                    else if (var25.eql($ic47$)) {
                        var24 = module0191.f11990((SubLObject)$ic34$, var22, $ic46$, (SubLObject)UNPROVIDED);
                    }
                    else {
                        var24 = module0191.f11990((SubLObject)$ic34$, var22, $ic46$, (SubLObject)UNPROVIDED);
                    }
                    var20 = (SubLObject)ConsesLow.cons(var24, var20);
                }
                var21 = var21.rest();
                var22 = var21.first();
            }
            return Sequences.nreverse(var20);
        }
        return (SubLObject)ConsesLow.list(var12);
    }
    
    public static SubLObject f22446() {
        final SubLObject var105 = $g2854$.getGlobalValue();
        if (NIL != var105) {
            module0034.f1818(var105);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22447(final SubLObject var98) {
        return module0034.f1829($g2854$.getGlobalValue(), (SubLObject)ConsesLow.list(var98), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f22448(final SubLObject var98) {
        return module0288.f19338(var98, $g2853$.getGlobalValue());
    }
    
    public static SubLObject f22445(final SubLObject var98) {
        SubLObject var99 = $g2854$.getGlobalValue();
        if (NIL == var99) {
            var99 = module0034.f1934((SubLObject)$ic50$, (SubLObject)$ic51$, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)ONE_INTEGER, (SubLObject)EIGHT_INTEGER);
        }
        SubLObject var100 = module0034.f1814(var99, var98, (SubLObject)$ic52$);
        if (var100 == $ic52$) {
            var100 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f22448(var98)));
            module0034.f1816(var99, var98, var100, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var100);
    }
    
    public static SubLObject f22449(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            return (SubLObject)ConsesLow.list(module0191.f11990(var13, var14, $ic46$, var16));
        }
        cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22450(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            if (NIL == module0205.f13337(var14)) {
                SubLObject var114_115;
                final SubLObject var112_113 = var114_115 = module0202.f12829(var14, (SubLObject)UNPROVIDED);
                SubLObject var18 = (SubLObject)NIL;
                SubLObject var19 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var114_115, var112_113, (SubLObject)$ic55$);
                var18 = var114_115.first();
                var114_115 = var114_115.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var114_115, var112_113, (SubLObject)$ic55$);
                var19 = var114_115.first();
                var114_115 = var114_115.rest();
                if (NIL == var114_115) {
                    if ($ic56$.eql(module0202.f12832(var14, (SubLObject)UNPROVIDED))) {
                        return module0305.f20349(var19, var18, var15);
                    }
                    return module0305.f20337(var19, var18, var15);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var112_113, (SubLObject)$ic55$);
                }
            }
            else {
                SubLObject var119_120;
                final SubLObject var117_118 = var119_120 = module0202.f12829(module0202.f12826(var14), (SubLObject)UNPROVIDED);
                SubLObject var18 = (SubLObject)NIL;
                SubLObject var19 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var119_120, var117_118, (SubLObject)$ic55$);
                var18 = var119_120.first();
                var119_120 = var119_120.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var119_120, var117_118, (SubLObject)$ic55$);
                var19 = var119_120.first();
                var119_120 = var119_120.rest();
                if (NIL == var119_120) {
                    if ($ic56$.eql(module0202.f12832(var14, (SubLObject)UNPROVIDED))) {
                        return module0305.f20349(var19, var18, var15);
                    }
                    return module0305.f20340(var19, var18, var15);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var117_118, (SubLObject)$ic55$);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22451(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            if (NIL == module0205.f13337(var14)) {
                SubLObject var125_126;
                final SubLObject var123_124 = var125_126 = module0202.f12829(var14, (SubLObject)UNPROVIDED);
                SubLObject var18 = (SubLObject)NIL;
                SubLObject var19 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var125_126, var123_124, (SubLObject)$ic55$);
                var18 = var125_126.first();
                var125_126 = var125_126.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var125_126, var123_124, (SubLObject)$ic55$);
                var19 = var125_126.first();
                var125_126 = var125_126.rest();
                if (NIL == var125_126) {
                    if ($ic56$.eql(module0202.f12832(var14, (SubLObject)UNPROVIDED))) {
                        return module0306.f20680(var18, var19, var15);
                    }
                    return module0305.f20456(var18, var19, var15);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var123_124, (SubLObject)$ic55$);
                }
            }
            else {
                SubLObject var129_130;
                final SubLObject var127_128 = var129_130 = module0202.f12829(module0202.f12826(var14), (SubLObject)UNPROVIDED);
                SubLObject var18 = (SubLObject)NIL;
                SubLObject var19 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var129_130, var127_128, (SubLObject)$ic55$);
                var18 = var129_130.first();
                var129_130 = var129_130.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var129_130, var127_128, (SubLObject)$ic55$);
                var19 = var129_130.first();
                var129_130 = var129_130.rest();
                if (NIL == var129_130) {
                    if ($ic56$.eql(module0202.f12832(var14, (SubLObject)UNPROVIDED))) {
                        return module0305.f20463(var18, var19, var15);
                    }
                    return module0305.f20462(var18, var19, var15);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var127_128, (SubLObject)$ic55$);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22452(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            SubLObject var18 = (SubLObject)NIL;
            SubLObject var19 = (SubLObject)NIL;
            if (NIL == module0205.f13337(var14)) {
                var18 = (SubLObject)ConsesLow.list(var15);
            }
            else {
                var18 = (SubLObject)ConsesLow.list(var15);
            }
            SubLObject var20 = var18;
            SubLObject var73_134 = (SubLObject)NIL;
            var73_134 = var20.first();
            while (NIL != var20) {
                var19 = (SubLObject)ConsesLow.cons(module0191.f11990(var13, var14, var73_134, var16), var19);
                var20 = var20.rest();
                var73_134 = var20.first();
            }
            return Sequences.nreverse(var19);
        }
        cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22453(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            if (NIL == module0205.f13337(var14)) {
                SubLObject var139_140;
                final SubLObject var137_138 = var139_140 = module0202.f12829(var14, (SubLObject)UNPROVIDED);
                SubLObject var18 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var139_140, var137_138, (SubLObject)$ic59$);
                var18 = var139_140.first();
                var139_140 = var139_140.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var139_140, var137_138, (SubLObject)$ic59$);
                final SubLObject var19 = var139_140.rest();
                var139_140 = var139_140.first();
                SubLObject var20 = (SubLObject)NIL;
                SubLObject var21 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var139_140, var137_138, (SubLObject)$ic59$);
                var20 = var139_140.first();
                var139_140 = (var21 = var139_140.rest());
                var139_140 = var19;
                if (NIL == var139_140) {
                    return module0004.f104(var18, var21, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
                }
                cdestructuring_bind.cdestructuring_bind_error(var137_138, (SubLObject)$ic59$);
            }
            else {
                SubLObject var147_148;
                final SubLObject var145_146 = var147_148 = module0202.f12829(module0202.f12826(var14), (SubLObject)UNPROVIDED);
                SubLObject var18 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var147_148, var145_146, (SubLObject)$ic59$);
                var18 = var147_148.first();
                var147_148 = var147_148.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var147_148, var145_146, (SubLObject)$ic59$);
                final SubLObject var22 = var147_148.rest();
                var147_148 = var147_148.first();
                SubLObject var20 = (SubLObject)NIL;
                SubLObject var21 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var147_148, var145_146, (SubLObject)$ic59$);
                var20 = var147_148.first();
                var147_148 = (var21 = var147_148.rest());
                var147_148 = var22;
                if (NIL == var147_148) {
                    return (SubLObject)makeBoolean(NIL == module0004.f104(var18, var21, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
                }
                cdestructuring_bind.cdestructuring_bind_error(var145_146, (SubLObject)$ic59$);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22454(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            return (SubLObject)ConsesLow.list(module0191.f11990(var13, var14, module0132.$g1563$.getGlobalValue(), var16));
        }
        cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22455(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            if (NIL == module0205.f13337(var14)) {
                final SubLObject var18 = module0202.f12834(var14, (SubLObject)UNPROVIDED);
                final SubLObject var19 = module0202.f12835(var14, (SubLObject)UNPROVIDED);
                if (var18.isCons() && $ic62$.eql(module0205.f13276(var18))) {
                    if (var19.isCons() && $ic62$.eql(module0205.f13276(var19))) {
                        return conses_high.subsetp(var18, var19, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
                    }
                    if (NIL != module0173.f10955(var19)) {
                        return f22441(var12);
                    }
                    if (var19.isCons() && $ic63$.eql(module0205.f13276(var19))) {
                        return f22441(var12);
                    }
                }
                else if (var18.isCons() && $ic63$.eql(module0205.f13276(var18))) {
                    if (NIL != module0173.f10955(var19)) {
                        return f22441(var12);
                    }
                    if (var19.isCons() && $ic63$.eql(module0205.f13276(var19))) {
                        return f22441(var12);
                    }
                }
            }
            else {
                final SubLObject var20 = module0202.f12826(var14);
                final SubLObject var21 = module0202.f12834(var20, (SubLObject)UNPROVIDED);
                final SubLObject var22 = module0202.f12835(var20, (SubLObject)UNPROVIDED);
                if (var21.isCons() && $ic62$.eql(module0205.f13276(var21))) {
                    if (var22.isCons() && $ic62$.eql(module0205.f13276(var22))) {
                        return (SubLObject)makeBoolean(NIL == conses_high.subsetp(var21, var22, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
                    }
                    if (NIL != module0173.f10955(var22)) {
                        return f22441(var12);
                    }
                    if (var22.isCons() && $ic63$.eql(module0205.f13276(var22))) {
                        return f22441(var12);
                    }
                }
                else if (var21.isCons() && $ic63$.eql(module0205.f13276(var21))) {
                    if (NIL != module0173.f10955(var22)) {
                        return f22441(var12);
                    }
                    if (var22.isCons() && $ic63$.eql(module0205.f13276(var22))) {
                        return f22441(var12);
                    }
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22456(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            SubLObject var18 = (SubLObject)NIL;
            SubLObject var19 = (SubLObject)NIL;
            if (NIL == module0205.f13337(var14)) {
                final SubLObject var20 = module0202.f12834(var14, (SubLObject)UNPROVIDED);
                final SubLObject var21 = module0202.f12835(var14, (SubLObject)UNPROVIDED);
                if (var20.isCons() && $ic62$.eql(module0205.f13276(var20))) {
                    if (var21.isCons() && $ic62$.eql(module0205.f13276(var21))) {
                        var18 = (SubLObject)ConsesLow.list(module0132.$g1564$.getGlobalValue());
                    }
                    else if (NIL != module0173.f10955(var21)) {
                        var18 = (SubLObject)ConsesLow.list(var15);
                    }
                    else if (var21.isCons() && $ic63$.eql(module0205.f13276(var21))) {
                        var18 = (SubLObject)ConsesLow.list(var15);
                    }
                }
                else if (var20.isCons() && $ic63$.eql(module0205.f13276(var20))) {
                    if (NIL != module0173.f10955(var21)) {
                        var18 = (SubLObject)ConsesLow.list(var15);
                    }
                    else if (var21.isCons() && $ic63$.eql(module0205.f13276(var21))) {
                        var18 = (SubLObject)ConsesLow.list(var15);
                    }
                }
            }
            else {
                final SubLObject var22 = module0202.f12826(var14);
                final SubLObject var23 = module0202.f12834(var22, (SubLObject)UNPROVIDED);
                final SubLObject var24 = module0202.f12835(var22, (SubLObject)UNPROVIDED);
                if (var23.isCons() && $ic62$.eql(module0205.f13276(var23))) {
                    if (var24.isCons() && $ic62$.eql(module0205.f13276(var24))) {
                        var18 = (SubLObject)ConsesLow.list(module0132.$g1564$.getGlobalValue());
                    }
                    else if (NIL != module0173.f10955(var24)) {
                        var18 = (SubLObject)ConsesLow.list(var15);
                    }
                    else if (var24.isCons() && $ic63$.eql(module0205.f13276(var24))) {
                        var18 = (SubLObject)ConsesLow.list(var15);
                    }
                }
                else if (var23.isCons() && $ic63$.eql(module0205.f13276(var23))) {
                    if (NIL != module0173.f10955(var24)) {
                        var18 = (SubLObject)ConsesLow.list(var15);
                    }
                    else if (var24.isCons() && $ic63$.eql(module0205.f13276(var24))) {
                        var18 = (SubLObject)ConsesLow.list(var15);
                    }
                }
            }
            SubLObject var25 = var18;
            SubLObject var73_159 = (SubLObject)NIL;
            var73_159 = var25.first();
            while (NIL != var25) {
                var19 = (SubLObject)ConsesLow.cons(module0191.f11990(var13, var14, var73_159, var16), var19);
                var25 = var25.rest();
                var73_159 = var25.first();
            }
            return Sequences.nreverse(var19);
        }
        cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22457(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            if (NIL == module0205.f13337(var14)) {
                SubLObject var164_165;
                final SubLObject var162_163 = var164_165 = module0202.f12829(var14, (SubLObject)UNPROVIDED);
                SubLObject var18 = (SubLObject)NIL;
                SubLObject var19 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var164_165, var162_163, (SubLObject)$ic66$);
                var18 = var164_165.first();
                var164_165 = var164_165.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var164_165, var162_163, (SubLObject)$ic66$);
                var19 = var164_165.first();
                var164_165 = var164_165.rest();
                if (NIL == var164_165) {
                    return module0258.f16777(var18, var19, var15);
                }
                cdestructuring_bind.cdestructuring_bind_error(var162_163, (SubLObject)$ic66$);
            }
            else {
                SubLObject var170_171;
                final SubLObject var168_169 = var170_171 = module0202.f12829(module0202.f12826(var14), (SubLObject)UNPROVIDED);
                SubLObject var18 = (SubLObject)NIL;
                SubLObject var19 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var170_171, var168_169, (SubLObject)$ic66$);
                var18 = var170_171.first();
                var170_171 = var170_171.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var170_171, var168_169, (SubLObject)$ic66$);
                var19 = var170_171.first();
                var170_171 = var170_171.rest();
                if (NIL == var170_171) {
                    return (SubLObject)NIL;
                }
                cdestructuring_bind.cdestructuring_bind_error(var168_169, (SubLObject)$ic66$);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22458(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            if (NIL == module0205.f13337(var14)) {
                SubLObject var176_177;
                final SubLObject var174_175 = var176_177 = module0202.f12829(var14, (SubLObject)UNPROVIDED);
                SubLObject var18 = (SubLObject)NIL;
                SubLObject var19 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var176_177, var174_175, (SubLObject)$ic66$);
                var18 = var176_177.first();
                var176_177 = var176_177.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var176_177, var174_175, (SubLObject)$ic66$);
                var19 = var176_177.first();
                var176_177 = var176_177.rest();
                if (NIL == var176_177) {
                    return module0258.f16806(var18, var19, var15, (SubLObject)$ic67$);
                }
                cdestructuring_bind.cdestructuring_bind_error(var174_175, (SubLObject)$ic66$);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22459(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            SubLObject var18 = (SubLObject)NIL;
            SubLObject var19 = (SubLObject)NIL;
            if (NIL == module0205.f13337(var14)) {
                var18 = (SubLObject)ConsesLow.list(var15);
            }
            else {
                var18 = (SubLObject)ConsesLow.list(var15);
            }
            SubLObject var20 = var18;
            SubLObject var73_180 = (SubLObject)NIL;
            var73_180 = var20.first();
            while (NIL != var20) {
                var19 = (SubLObject)ConsesLow.cons(module0191.f11990(var13, var14, var73_180, var16), var19);
                var20 = var20.rest();
                var73_180 = var20.first();
            }
            return Sequences.nreverse(var19);
        }
        cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22460(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var17 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var14 = var12.first();
        SubLObject var18 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var18, var12, (SubLObject)$ic33$);
        var15 = var18.first();
        var18 = var18.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var18, var12, (SubLObject)$ic33$);
        var16 = var18.first();
        var18 = var18.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var18, var12, (SubLObject)$ic33$);
        var17 = var18.first();
        var18 = var18.rest();
        if (NIL == var18) {
            final SubLObject var19 = module0202.f12832(var15, (SubLObject)UNPROVIDED);
            final SubLObject var20 = module0205.f13337(var15);
            if (NIL != var20) {
                var15 = module0202.f12826(var15);
            }
            final SubLObject var21 = module0202.f12834(var15, (SubLObject)UNPROVIDED);
            final SubLObject var22 = module0202.f12835(var15, (SubLObject)UNPROVIDED);
            SubLObject var23 = (SubLObject)NIL;
            final SubLObject var24 = module0018.$g624$.currentBinding(var13);
            try {
                module0018.$g624$.bind((SubLObject)makeBoolean(NIL != module0018.$g624$.getDynamicValue(var13) && !var19.eql($ic70$)), var13);
                if (NIL != var20) {
                    var23 = (SubLObject)makeBoolean(NIL == module0235.f15474(var21, var22, var16, (SubLObject)UNPROVIDED));
                }
                else {
                    var23 = module0235.f15474(var21, var22, var16, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                module0018.$g624$.rebind(var24, var13);
            }
            return module0035.sublisp_boolean(var23);
        }
        cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22461(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            SubLObject var18 = (SubLObject)NIL;
            SubLObject var19 = (SubLObject)NIL;
            if (NIL == module0205.f13337(var14)) {
                if (module0202.f12832(var14, (SubLObject)UNPROVIDED).eql($ic71$)) {
                    var18 = module0331.f22375(module0202.f12834(var14, (SubLObject)UNPROVIDED), module0202.f12835(var14, (SubLObject)UNPROVIDED));
                }
                else {
                    var18 = (SubLObject)ConsesLow.list(module0132.$g1562$.getGlobalValue());
                }
            }
            else {
                var18 = (SubLObject)ConsesLow.list(var15);
            }
            SubLObject var20 = var18;
            SubLObject var73_187 = (SubLObject)NIL;
            var73_187 = var20.first();
            while (NIL != var20) {
                var19 = (SubLObject)ConsesLow.cons(module0191.f11990(var13, var14, var73_187, var16), var19);
                var20 = var20.rest();
                var73_187 = var20.first();
            }
            return Sequences.nreverse(var19);
        }
        cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22462(final SubLObject var12, final SubLObject var74) {
        return f22463(var12, var74);
    }
    
    public static SubLObject f22463(final SubLObject var12, final SubLObject var74) {
        SubLObject var75 = (SubLObject)NIL;
        SubLObject var76 = (SubLObject)NIL;
        SubLObject var77 = (SubLObject)NIL;
        SubLObject var78 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var75 = var12.first();
        SubLObject var79 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var79, var12, (SubLObject)$ic33$);
        var76 = var79.first();
        var79 = var79.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var79, var12, (SubLObject)$ic33$);
        var77 = var79.first();
        var79 = var79.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var79, var12, (SubLObject)$ic33$);
        var78 = var79.first();
        var79 = var79.rest();
        if (NIL == var79) {
            if (var74.eql((SubLObject)$ic72$)) {
                return (SubLObject)T;
            }
            if (var74.eql((SubLObject)$ic73$)) {
                return f22464(var76, var77);
            }
            if (var74.eql((SubLObject)$ic74$)) {
                return module0478.f31676(var76, var77);
            }
            if (var74.eql((SubLObject)$ic75$)) {
                return module0478.f31676(var76, var77);
            }
            Errors.error((SubLObject)$ic76$, var74);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22464(final SubLObject var89, final SubLObject var73) {
        final SubLObject var90 = module0202.f12834(var89, (SubLObject)UNPROVIDED);
        final SubLObject var91 = module0202.f12835(var89, (SubLObject)UNPROVIDED);
        if (var90.equal(var91)) {
            return module0478.f31676(var89, var73);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22465(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            SubLObject var18 = (SubLObject)NIL;
            if (module0202.f12832(var14, (SubLObject)UNPROVIDED).eql($ic71$)) {
                var18 = module0331.f22373(module0202.f12834(var14, (SubLObject)UNPROVIDED), module0202.f12835(var14, (SubLObject)UNPROVIDED), var15, var16);
            }
            return var18;
        }
        cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22466(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var17 = (SubLObject)NIL;
        SubLObject var18 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var15 = var12.first();
        SubLObject var19 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var19, var12, (SubLObject)$ic33$);
        var16 = var19.first();
        var19 = var19.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var19, var12, (SubLObject)$ic33$);
        var17 = var19.first();
        var19 = var19.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var19, var12, (SubLObject)$ic33$);
        var18 = var19.first();
        var19 = var19.rest();
        if (NIL == var19) {
            final SubLObject var20 = module0202.f12832(var16, (SubLObject)UNPROVIDED);
            if (var20.eql($ic79$)) {
                final SubLObject var21 = module0202.f12834(var16, (SubLObject)UNPROVIDED);
                final SubLObject var22 = module0202.f12835(var16, (SubLObject)UNPROVIDED);
                final SubLObject var23 = module0147.f9540(var17);
                final SubLObject var24 = module0147.$g2095$.currentBinding(var13);
                final SubLObject var25 = module0147.$g2094$.currentBinding(var13);
                final SubLObject var26 = module0147.$g2096$.currentBinding(var13);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var23), var13);
                    module0147.$g2094$.bind(module0147.f9546(var23), var13);
                    module0147.$g2096$.bind(module0147.f9549(var23), var13);
                    var13.resetMultipleValues();
                    final SubLObject var27 = module0229.f15243(var22);
                    final SubLObject var28 = var13.secondMultipleValue();
                    var13.resetMultipleValues();
                    var14 = (SubLObject)makeBoolean(NIL != var28 && NIL != module0235.f15474(var27, var21, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                }
                finally {
                    module0147.$g2096$.rebind(var26, var13);
                    module0147.$g2094$.rebind(var25, var13);
                    module0147.$g2095$.rebind(var24, var13);
                }
            }
            else {
                final SubLObject var29 = module0205.f13337(var16);
                final SubLObject var30 = module0202.f12826(var16);
                final SubLObject var23 = module0147.f9540(var17);
                final SubLObject var24 = module0147.$g2095$.currentBinding(var13);
                final SubLObject var25 = module0147.$g2094$.currentBinding(var13);
                final SubLObject var26 = module0147.$g2096$.currentBinding(var13);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var23), var13);
                    module0147.$g2094$.bind(module0147.f9546(var23), var13);
                    module0147.$g2096$.bind(module0147.f9549(var23), var13);
                    var13.resetMultipleValues();
                    final SubLObject var27 = module0229.f15243(var30);
                    final SubLObject var28 = var13.secondMultipleValue();
                    var13.resetMultipleValues();
                    var14 = (SubLObject)makeBoolean(NIL != var28 && NIL != ((NIL != var29) ? makeBoolean(NIL == var27) : var27));
                }
                finally {
                    module0147.$g2096$.rebind(var26, var13);
                    module0147.$g2094$.rebind(var25, var13);
                    module0147.$g2095$.rebind(var24, var13);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        }
        return var14;
    }
    
    public static SubLObject f22467(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var17 = (SubLObject)NIL;
        SubLObject var18 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var15 = var12.first();
        SubLObject var19 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var19, var12, (SubLObject)$ic33$);
        var16 = var19.first();
        var19 = var19.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var19, var12, (SubLObject)$ic33$);
        var17 = var19.first();
        var19 = var19.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var19, var12, (SubLObject)$ic33$);
        var18 = var19.first();
        var19 = var19.rest();
        if (NIL == var19) {
            final SubLObject var20 = module0202.f12832(var16, (SubLObject)UNPROVIDED);
            if (var20.eql($ic79$)) {
                final SubLObject var21 = module0202.f12834(var16, (SubLObject)UNPROVIDED);
                final SubLObject var22 = module0202.f12835(var16, (SubLObject)UNPROVIDED);
                if (NIL == module0205.f13337(var16)) {
                    final SubLObject var23 = module0147.f9540(var17);
                    final SubLObject var24 = module0147.$g2095$.currentBinding(var13);
                    final SubLObject var25 = module0147.$g2094$.currentBinding(var13);
                    final SubLObject var26 = module0147.$g2096$.currentBinding(var13);
                    try {
                        module0147.$g2095$.bind(module0147.f9545(var23), var13);
                        module0147.$g2094$.bind(module0147.f9546(var23), var13);
                        module0147.$g2096$.bind(module0147.f9549(var23), var13);
                        var14 = module0229.f15242(var22);
                    }
                    finally {
                        module0147.$g2096$.rebind(var26, var13);
                        module0147.$g2094$.rebind(var25, var13);
                        module0147.$g2095$.rebind(var24, var13);
                    }
                }
                else {
                    final SubLObject var23 = module0147.f9540(var17);
                    final SubLObject var24 = module0147.$g2095$.currentBinding(var13);
                    final SubLObject var25 = module0147.$g2094$.currentBinding(var13);
                    final SubLObject var26 = module0147.$g2096$.currentBinding(var13);
                    try {
                        module0147.$g2095$.bind(module0147.f9545(var23), var13);
                        module0147.$g2094$.bind(module0147.f9546(var23), var13);
                        module0147.$g2096$.bind(module0147.f9549(var23), var13);
                        var13.resetMultipleValues();
                        final SubLObject var27 = module0229.f15243(var22);
                        final SubLObject var28 = var13.secondMultipleValue();
                        var13.resetMultipleValues();
                        if (NIL != var28 && NIL == module0235.f15474(var27, var21, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                            final SubLObject var29 = module0438.f30664(module0466.f31514(var27, var22), (SubLObject)UNPROVIDED);
                            final SubLObject var30 = module0470.f31572(var21, var27);
                            var14 = (SubLObject)ConsesLow.list(var29, var30);
                        }
                    }
                    finally {
                        module0147.$g2096$.rebind(var26, var13);
                        module0147.$g2094$.rebind(var25, var13);
                        module0147.$g2095$.rebind(var24, var13);
                    }
                }
            }
            else if (var20.eql($ic44$)) {
                final SubLObject var31 = module0202.f12829(var16, (SubLObject)UNPROVIDED);
                var14 = module0331.f22390(var31);
            }
            else {
                final SubLObject var32 = module0202.f12826(var16);
                if (NIL == module0205.f13337(var16)) {
                    final SubLObject var33 = module0147.f9540(var17);
                    final SubLObject var34 = module0147.$g2095$.currentBinding(var13);
                    final SubLObject var35 = module0147.$g2094$.currentBinding(var13);
                    final SubLObject var36 = module0147.$g2096$.currentBinding(var13);
                    try {
                        module0147.$g2095$.bind(module0147.f9545(var33), var13);
                        module0147.$g2094$.bind(module0147.f9546(var33), var13);
                        module0147.$g2096$.bind(module0147.f9549(var33), var13);
                        var14 = module0229.f15242(var32);
                    }
                    finally {
                        module0147.$g2096$.rebind(var36, var13);
                        module0147.$g2094$.rebind(var35, var13);
                        module0147.$g2095$.rebind(var34, var13);
                    }
                }
                else {
                    final SubLObject var33 = module0147.f9540(var17);
                    final SubLObject var34 = module0147.$g2095$.currentBinding(var13);
                    final SubLObject var35 = module0147.$g2094$.currentBinding(var13);
                    final SubLObject var36 = module0147.$g2096$.currentBinding(var13);
                    try {
                        module0147.$g2095$.bind(module0147.f9545(var33), var13);
                        module0147.$g2094$.bind(module0147.f9546(var33), var13);
                        module0147.$g2096$.bind(module0147.f9549(var33), var13);
                        var13.resetMultipleValues();
                        final SubLObject var37 = module0229.f15243(var32);
                        final SubLObject var38 = var13.secondMultipleValue();
                        var13.resetMultipleValues();
                        if (NIL != var38 && NIL == var37) {
                            final SubLObject var39 = module0483.f31858(var32);
                            var14 = (SubLObject)ConsesLow.list(var39);
                        }
                    }
                    finally {
                        module0147.$g2096$.rebind(var36, var13);
                        module0147.$g2094$.rebind(var35, var13);
                        module0147.$g2095$.rebind(var34, var13);
                    }
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        }
        return var14;
    }
    
    public static SubLObject f22468(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var17 = (SubLObject)NIL;
        SubLObject var18 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var15 = var12.first();
        SubLObject var19 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var19, var12, (SubLObject)$ic33$);
        var16 = var19.first();
        var19 = var19.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var19, var12, (SubLObject)$ic33$);
        var17 = var19.first();
        var19 = var19.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var19, var12, (SubLObject)$ic33$);
        var18 = var19.first();
        var19 = var19.rest();
        if (NIL == var19) {
            final SubLObject var20 = module0205.f13337(var16);
            final SubLObject var21 = module0202.f12826(var16);
            SubLObject var206_207;
            final SubLObject var204_205 = var206_207 = var21;
            SubLObject var22 = (SubLObject)NIL;
            SubLObject var23 = (SubLObject)NIL;
            SubLObject var24 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var206_207, var204_205, (SubLObject)$ic81$);
            var22 = var206_207.first();
            var206_207 = var206_207.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var206_207, var204_205, (SubLObject)$ic81$);
            var23 = var206_207.first();
            var206_207 = var206_207.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var206_207, var204_205, (SubLObject)$ic81$);
            var24 = var206_207.first();
            var206_207 = var206_207.rest();
            if (NIL == var206_207) {
                final SubLObject var25 = module0147.f9540(var17);
                final SubLObject var26 = module0147.$g2095$.currentBinding(var13);
                final SubLObject var27 = module0147.$g2094$.currentBinding(var13);
                final SubLObject var28 = module0147.$g2096$.currentBinding(var13);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var25), var13);
                    module0147.$g2094$.bind(module0147.f9546(var25), var13);
                    module0147.$g2096$.bind(module0147.f9549(var25), var13);
                    var14 = (SubLObject)makeBoolean(NIL != module0235.f15474(var23, var24, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && ((NIL == var20 && NIL != module0226.f14795(var22) && NIL != module0309.f21041(var21, (SubLObject)NIL, (SubLObject)UNPROVIDED)) || (NIL != var20 && NIL != module0226.f14796(var22) && NIL != f22469(var21, (SubLObject)NIL))));
                }
                finally {
                    module0147.$g2096$.rebind(var28, var13);
                    module0147.$g2094$.rebind(var27, var13);
                    module0147.$g2095$.rebind(var26, var13);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var204_205, (SubLObject)$ic81$);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        }
        return var14;
    }
    
    public static SubLObject f22470(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            final SubLObject var18 = module0205.f13337(var14);
            final SubLObject var19 = module0202.f12826(var14);
            SubLObject var213_214;
            final SubLObject var211_212 = var213_214 = var19;
            SubLObject var20 = (SubLObject)NIL;
            SubLObject var21 = (SubLObject)NIL;
            SubLObject var22 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var213_214, var211_212, (SubLObject)$ic81$);
            var20 = var213_214.first();
            var213_214 = var213_214.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var213_214, var211_212, (SubLObject)$ic81$);
            var21 = var213_214.first();
            var213_214 = var213_214.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var213_214, var211_212, (SubLObject)$ic81$);
            var22 = var213_214.first();
            var213_214 = var213_214.rest();
            if (NIL == var213_214) {
                final SubLObject var23 = (NIL != var18) ? $ic82$ : $ic83$;
                final SubLObject var24 = module0202.f12768($ic84$, var20, var23);
                final SubLObject var25 = module0202.f12769($ic85$, var21, (SubLObject)ONE_INTEGER, var20);
                final SubLObject var26 = module0202.f12769($ic85$, var22, (SubLObject)TWO_INTEGER, var20);
                final SubLObject var27 = (SubLObject)(var21.equal(var22) ? NIL : module0202.f12768($ic71$, var21, var22));
                final SubLObject var28 = module0191.f11990((SubLObject)$ic86$, var24, var15, (SubLObject)UNPROVIDED);
                final SubLObject var29 = module0191.f11990((SubLObject)$ic87$, var25, var15, (SubLObject)UNPROVIDED);
                final SubLObject var30 = module0191.f11990((SubLObject)$ic87$, var26, var15, (SubLObject)UNPROVIDED);
                final SubLObject var31 = (SubLObject)((NIL != var27) ? module0191.f11990((SubLObject)$ic77$, var27, var15, (SubLObject)UNPROVIDED) : NIL);
                return (SubLObject)ConsesLow.listS(var28, var29, var30, ConsesLow.append((SubLObject)((NIL != var31) ? ConsesLow.list(var31) : NIL), (SubLObject)NIL));
            }
            cdestructuring_bind.cdestructuring_bind_error(var211_212, (SubLObject)$ic81$);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22471(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            final SubLObject var18 = module0205.f13337(var14);
            final SubLObject var19 = module0202.f12826(var14);
            final SubLObject var20 = f22472(var19, var18);
            SubLObject var21 = (SubLObject)NIL;
            SubLObject var22 = var20;
            SubLObject var73_226 = (SubLObject)NIL;
            var73_226 = var22.first();
            while (NIL != var22) {
                var21 = (SubLObject)ConsesLow.cons(module0191.f11990(var13, var14, var73_226, var16), var21);
                var22 = var22.rest();
                var73_226 = var22.first();
            }
            return Sequences.nreverse(var21);
        }
        cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22469(final SubLObject var89, SubLObject var73) {
        if (var73 == UNPROVIDED) {
            var73 = (SubLObject)NIL;
        }
        final SubLThread var90 = SubLProcess.currentSubLThread();
        SubLObject var91 = (SubLObject)NIL;
        final SubLObject var92 = module0144.$g1771$.currentBinding(var90);
        try {
            module0144.$g1771$.bind((SubLObject)NIL, var90);
            var91 = module0478.f31676(var89, var73);
        }
        finally {
            module0144.$g1771$.rebind(var92, var90);
        }
        return var91;
    }
    
    public static SubLObject f22472(final SubLObject var89, SubLObject var183) {
        if (var183 == UNPROVIDED) {
            var183 = (SubLObject)NIL;
        }
        final SubLObject var184 = module0202.f12832(var89, (SubLObject)UNPROVIDED);
        final SubLObject var185 = module0202.f12834(var89, (SubLObject)UNPROVIDED);
        final SubLObject var186 = module0226.f14881(var184, (SubLObject)UNPROVIDED);
        final SubLObject var187 = module0202.f12835(var89, (SubLObject)UNPROVIDED);
        final SubLObject var188 = module0226.f14883(var184, (SubLObject)UNPROVIDED);
        final SubLObject var189 = (NIL != var183) ? module0259.f16932(var184, $ic82$, (SubLObject)UNPROVIDED) : module0259.f16932(var184, $ic83$, (SubLObject)UNPROVIDED);
        final SubLObject var190 = module0331.f22375(var185, var187);
        final SubLObject var191 = f22473(var185, var186, (SubLObject)UNPROVIDED);
        final SubLObject var192 = f22473(var187, var188, (SubLObject)UNPROVIDED);
        SubLObject var193 = (SubLObject)NIL;
        if (var191.equal(var192)) {
            SubLObject var194 = var189;
            SubLObject var195 = (SubLObject)NIL;
            var195 = var194.first();
            while (NIL != var194) {
                SubLObject var8_235 = var190;
                SubLObject var196 = (SubLObject)NIL;
                var196 = var8_235.first();
                while (NIL != var8_235) {
                    SubLObject var8_236 = var191;
                    SubLObject var197 = (SubLObject)NIL;
                    var197 = var8_236.first();
                    while (NIL != var8_236) {
                        var193 = ConsesLow.append(var193, module0349.f23437((SubLObject)ConsesLow.list(var195, var196, var197), (SubLObject)UNPROVIDED));
                        var8_236 = var8_236.rest();
                        var197 = var8_236.first();
                    }
                    var8_235 = var8_235.rest();
                    var196 = var8_235.first();
                }
                var194 = var194.rest();
                var195 = var194.first();
            }
        }
        else {
            SubLObject var194 = var189;
            SubLObject var195 = (SubLObject)NIL;
            var195 = var194.first();
            while (NIL != var194) {
                SubLObject var8_237 = var190;
                SubLObject var196 = (SubLObject)NIL;
                var196 = var8_237.first();
                while (NIL != var8_237) {
                    SubLObject var8_238 = var191;
                    SubLObject var197 = (SubLObject)NIL;
                    var197 = var8_238.first();
                    while (NIL != var8_238) {
                        SubLObject var8_239 = var192;
                        SubLObject var198 = (SubLObject)NIL;
                        var198 = var8_239.first();
                        while (NIL != var8_239) {
                            var193 = ConsesLow.append(var193, module0349.f23437((SubLObject)ConsesLow.list(var195, var196, var197, var198), (SubLObject)UNPROVIDED));
                            var8_239 = var8_239.rest();
                            var198 = var8_239.first();
                        }
                        var8_238 = var8_238.rest();
                        var197 = var8_238.first();
                    }
                    var8_237 = var8_237.rest();
                    var196 = var8_237.first();
                }
                var194 = var194.rest();
                var195 = var194.first();
            }
        }
        return module0035.f2269(var193, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f22474(final SubLObject var243, final SubLObject var244, SubLObject var90) {
        if (var90 == UNPROVIDED) {
            var90 = (SubLObject)NIL;
        }
        SubLObject var245 = (SubLObject)NIL;
        SubLObject var246 = (SubLObject)NIL;
        SubLObject var247 = var244;
        SubLObject var248 = (SubLObject)NIL;
        var248 = var247.first();
        while (NIL != var247) {
            final SubLObject var249 = module0259.f16932(var243, var248, var90);
            if (NIL == var249) {
                return (SubLObject)NIL;
            }
            var245 = (SubLObject)ConsesLow.cons(var249, var245);
            var247 = var247.rest();
            var248 = var247.first();
        }
        var247 = module0035.f2489(var245, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var250 = (SubLObject)NIL;
        var250 = var247.first();
        while (NIL != var247) {
            var246 = ConsesLow.append(var246, module0349.f23437(var250, (SubLObject)UNPROVIDED));
            var247 = var247.rest();
            var250 = var247.first();
        }
        return var246;
    }
    
    public static SubLObject f22473(final SubLObject var243, final SubLObject var244, SubLObject var90) {
        if (var90 == UNPROVIDED) {
            var90 = (SubLObject)NIL;
        }
        final SubLThread var245 = SubLProcess.currentSubLThread();
        final SubLObject var246 = module0034.$g879$.getDynamicValue(var245);
        SubLObject var247 = (SubLObject)NIL;
        if (NIL == var246) {
            return f22474(var243, var244, var90);
        }
        var247 = module0034.f1857(var246, (SubLObject)$ic88$, (SubLObject)UNPROVIDED);
        if (NIL == var247) {
            var247 = module0034.f1807(module0034.f1842(var246), (SubLObject)$ic88$, (SubLObject)THREE_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var246, (SubLObject)$ic88$, var247);
        }
        final SubLObject var248 = module0034.f1781(var243, var244, var90);
        final SubLObject var249 = module0034.f1814(var247, var248, (SubLObject)UNPROVIDED);
        if (var249 != $ic52$) {
            SubLObject var250 = var249;
            SubLObject var251 = (SubLObject)NIL;
            var251 = var250.first();
            while (NIL != var250) {
                SubLObject var252 = var251.first();
                final SubLObject var253 = conses_high.second(var251);
                if (var243.equal(var252.first())) {
                    var252 = var252.rest();
                    if (var244.equal(var252.first())) {
                        var252 = var252.rest();
                        if (NIL != var252 && NIL == var252.rest() && var90.equal(var252.first())) {
                            return module0034.f1959(var253);
                        }
                    }
                }
                var250 = var250.rest();
                var251 = var250.first();
            }
        }
        final SubLObject var254 = Values.arg2(var245.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f22474(var243, var244, var90)));
        module0034.f1836(var247, var248, var249, var254, (SubLObject)ConsesLow.list(var243, var244, var90));
        return module0034.f1959(var254);
    }
    
    public static SubLObject f22475(final SubLObject var12, final SubLObject var74) {
        SubLObject var75 = (SubLObject)NIL;
        SubLObject var76 = (SubLObject)NIL;
        SubLObject var77 = (SubLObject)NIL;
        SubLObject var78 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var75 = var12.first();
        SubLObject var79 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var79, var12, (SubLObject)$ic33$);
        var76 = var79.first();
        var79 = var79.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var79, var12, (SubLObject)$ic33$);
        var77 = var79.first();
        var79 = var79.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var79, var12, (SubLObject)$ic33$);
        var78 = var79.first();
        var79 = var79.rest();
        if (NIL != var79) {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
            return (SubLObject)NIL;
        }
        if (var74 != $ic72$ && NIL != module0349.f23398(module0202.f12832(var76, (SubLObject)UNPROVIDED))) {
            return f22469(var76, var77);
        }
        return f22463(var12, var74);
    }
    
    public static SubLObject f22476(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var17 = (SubLObject)NIL;
        SubLObject var18 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var15 = var12.first();
        SubLObject var19 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var19, var12, (SubLObject)$ic33$);
        var16 = var19.first();
        var19 = var19.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var19, var12, (SubLObject)$ic33$);
        var17 = var19.first();
        var19 = var19.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var19, var12, (SubLObject)$ic33$);
        var18 = var19.first();
        var19 = var19.rest();
        if (NIL == var19) {
            if (NIL == module0205.f13337(var16)) {
                final SubLObject var20 = module0202.f12826(var16);
                SubLObject var261_262;
                final SubLObject var259_260 = var261_262 = module0205.f13207(var20, (SubLObject)UNPROVIDED);
                SubLObject var21 = (SubLObject)NIL;
                SubLObject var22 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var261_262, var259_260, (SubLObject)$ic91$);
                var21 = var261_262.first();
                var261_262 = var261_262.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var261_262, var259_260, (SubLObject)$ic91$);
                var22 = var261_262.first();
                var261_262 = var261_262.rest();
                if (NIL == var261_262) {
                    final SubLObject var23 = module0147.f9540(var17);
                    final SubLObject var24 = module0147.$g2095$.currentBinding(var13);
                    final SubLObject var25 = module0147.$g2094$.currentBinding(var13);
                    final SubLObject var26 = module0147.$g2096$.currentBinding(var13);
                    try {
                        module0147.$g2095$.bind(module0147.f9545(var23), var13);
                        module0147.$g2094$.bind(module0147.f9546(var23), var13);
                        module0147.$g2096$.bind(module0147.f9549(var23), var13);
                        var14 = (SubLObject)makeBoolean(NIL != module0235.f15474(var21, var22, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL != module0035.f2013(module0442.f30743(var16, var17)));
                    }
                    finally {
                        module0147.$g2096$.rebind(var26, var13);
                        module0147.$g2094$.rebind(var25, var13);
                        module0147.$g2095$.rebind(var24, var13);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var259_260, (SubLObject)$ic91$);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        }
        return var14;
    }
    
    public static SubLObject f22477(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL != var17) {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
            return (SubLObject)NIL;
        }
        if (NIL == module0205.f13337(var14)) {
            return module0442.f30743(var14, var15);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22478(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            if (NIL == module0205.f13337(var14)) {
                final SubLObject var18 = module0202.f12826(var14);
                final SubLObject var19 = f22479(var18);
                SubLObject var20 = (SubLObject)NIL;
                SubLObject var21 = var19;
                SubLObject var73_267 = (SubLObject)NIL;
                var73_267 = var21.first();
                while (NIL != var21) {
                    var20 = (SubLObject)ConsesLow.cons(module0191.f11990(var13, var14, var73_267, var16), var20);
                    var21 = var21.rest();
                    var73_267 = var21.first();
                }
                return Sequences.nreverse(var20);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22479(final SubLObject var89) {
        final SubLThread var90 = SubLProcess.currentSubLThread();
        SubLObject var91 = (SubLObject)NIL;
        SubLObject var92 = (SubLObject)NIL;
        SubLObject var93 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var89, var89, (SubLObject)$ic92$);
        var91 = var89.first();
        SubLObject var94 = var89.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var94, var89, (SubLObject)$ic92$);
        var92 = var94.first();
        var94 = var94.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var94, var89, (SubLObject)$ic92$);
        var93 = var94.first();
        var94 = var94.rest();
        if (NIL == var94) {
            SubLObject var95 = (SubLObject)NIL;
            SubLObject var96 = (SubLObject)NIL;
            SubLObject var97 = (SubLObject)NIL;
            final SubLObject var98 = module0147.$g2094$.currentBinding(var90);
            final SubLObject var99 = module0147.$g2095$.currentBinding(var90);
            try {
                module0147.$g2094$.bind((SubLObject)$ic93$, var90);
                module0147.$g2095$.bind($ic94$, var90);
                final SubLObject var100 = $ic95$;
                if (NIL != module0158.f10010(var91, (SubLObject)ONE_INTEGER, var100)) {
                    final SubLObject var101 = module0158.f10011(var91, (SubLObject)ONE_INTEGER, var100);
                    SubLObject var102 = (SubLObject)NIL;
                    final SubLObject var103 = (SubLObject)NIL;
                    while (NIL == var102) {
                        final SubLObject var104 = module0052.f3695(var101, var103);
                        final SubLObject var105 = (SubLObject)makeBoolean(!var103.eql(var104));
                        if (NIL != var105) {
                            SubLObject var106 = (SubLObject)NIL;
                            try {
                                var106 = module0158.f10316(var104, (SubLObject)$ic96$, (SubLObject)NIL, (SubLObject)NIL);
                                SubLObject var273_278 = (SubLObject)NIL;
                                final SubLObject var274_279 = (SubLObject)NIL;
                                while (NIL == var273_278) {
                                    final SubLObject var107 = module0052.f3695(var106, var274_279);
                                    final SubLObject var276_280 = (SubLObject)makeBoolean(!var274_279.eql(var107));
                                    if (NIL != var276_280) {
                                        var97 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(module0178.f11287(var107), module0178.f11335(var107)), var97);
                                    }
                                    var273_278 = (SubLObject)makeBoolean(NIL == var276_280);
                                }
                            }
                            finally {
                                final SubLObject var17_281 = Threads.$is_thread_performing_cleanupP$.currentBinding(var90);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var90);
                                    if (NIL != var106) {
                                        module0158.f10319(var106);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var17_281, var90);
                                }
                            }
                        }
                        var102 = (SubLObject)makeBoolean(NIL == var105);
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var99, var90);
                module0147.$g2094$.rebind(var98, var90);
            }
            SubLObject var109;
            final SubLObject var108 = var109 = module0331.f22375(var92, var93);
            SubLObject var110 = (SubLObject)NIL;
            var110 = var109.first();
            while (NIL != var109) {
                SubLObject var8_282 = var97;
                SubLObject var111 = (SubLObject)NIL;
                var111 = var8_282.first();
                while (NIL != var8_282) {
                    SubLObject var286_287;
                    final SubLObject var284_285 = var286_287 = var111;
                    SubLObject var112 = (SubLObject)NIL;
                    SubLObject var113 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var286_287, var284_285, (SubLObject)$ic97$);
                    var112 = var286_287.first();
                    var286_287 = (var113 = var286_287.rest());
                    final SubLObject var114 = module0259.f16932(var92, var113, (SubLObject)UNPROVIDED);
                    final SubLObject var115 = var92.equal(var93) ? var114 : module0259.f16932(var93, var113, (SubLObject)UNPROVIDED);
                    SubLObject var8_283 = var114;
                    SubLObject var116 = (SubLObject)NIL;
                    var116 = var8_283.first();
                    while (NIL != var8_283) {
                        SubLObject var8_284 = var115;
                        SubLObject var117 = (SubLObject)NIL;
                        var117 = var8_284.first();
                        while (NIL != var8_284) {
                            SubLObject var118 = (SubLObject)ConsesLow.list(var112, var110, var116, var117);
                            var118 = Sequences.delete_duplicates(var118, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            final SubLObject var119;
                            var118 = (var119 = Sort.sort(var118, Symbols.symbol_function((SubLObject)$ic98$), (SubLObject)UNPROVIDED));
                            if (NIL == conses_high.member(var119, var95, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                var95 = (SubLObject)ConsesLow.cons(var119, var95);
                            }
                            var8_284 = var8_284.rest();
                            var117 = var8_284.first();
                        }
                        var8_283 = var8_283.rest();
                        var116 = var8_283.first();
                    }
                    var8_282 = var8_282.rest();
                    var111 = var8_282.first();
                }
                var109 = var109.rest();
                var110 = var109.first();
            }
            SubLObject var120 = var95;
            SubLObject var121 = (SubLObject)NIL;
            var121 = var120.first();
            while (NIL != var120) {
                final SubLObject var122 = module0262.f17370(var121, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var96 = ConsesLow.append(var122, var96);
                var120 = var120.rest();
                var121 = var120.first();
            }
            var96 = module0035.f2272(var96);
            SubLObject var123 = (SubLObject)NIL;
            var109 = var96;
            SubLObject var124 = (SubLObject)NIL;
            var124 = var109.first();
            while (NIL != var109) {
                if (NIL != module0309.f21041(var89, var124, (SubLObject)UNPROVIDED)) {
                    var123 = (SubLObject)ConsesLow.cons(var124, var123);
                }
                var109 = var109.rest();
                var124 = var109.first();
            }
            var96 = var123;
            return var96;
        }
        cdestructuring_bind.cdestructuring_bind_error(var89, (SubLObject)$ic92$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22480(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            if (NIL != module0205.f13337(var14)) {
                return (SubLObject)T;
            }
            SubLObject var303_304;
            final SubLObject var301_302 = var303_304 = module0202.f12826(var14);
            SubLObject var18 = (SubLObject)NIL;
            SubLObject var19 = (SubLObject)NIL;
            SubLObject var20 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var303_304, var301_302, (SubLObject)$ic92$);
            var18 = var303_304.first();
            var303_304 = var303_304.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var303_304, var301_302, (SubLObject)$ic92$);
            var19 = var303_304.first();
            var303_304 = var303_304.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var303_304, var301_302, (SubLObject)$ic92$);
            var20 = var303_304.first();
            var303_304 = var303_304.rest();
            if (NIL == var303_304) {
                return module0440.f30712(var18, var19, var20, var15, var16);
            }
            cdestructuring_bind.cdestructuring_bind_error(var301_302, (SubLObject)$ic92$);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22481(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            SubLObject var18 = (SubLObject)NIL;
            SubLObject var19 = (SubLObject)NIL;
            if (NIL == module0205.f13337(var14)) {
                SubLObject var309_310;
                final SubLObject var307_308 = var309_310 = module0202.f12826(var14);
                SubLObject var20 = (SubLObject)NIL;
                SubLObject var21 = (SubLObject)NIL;
                SubLObject var22 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var309_310, var307_308, (SubLObject)$ic92$);
                var20 = var309_310.first();
                var309_310 = var309_310.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var309_310, var307_308, (SubLObject)$ic92$);
                var21 = var309_310.first();
                var309_310 = var309_310.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var309_310, var307_308, (SubLObject)$ic92$);
                var22 = var309_310.first();
                var309_310 = var309_310.rest();
                if (NIL == var309_310) {
                    var18 = f22482(var20, var21, var22, var16);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var307_308, (SubLObject)$ic92$);
                }
            }
            else {
                var18 = (SubLObject)ConsesLow.list(var15);
            }
            SubLObject var23 = var18;
            SubLObject var73_311 = (SubLObject)NIL;
            var73_311 = var23.first();
            while (NIL != var23) {
                var19 = (SubLObject)ConsesLow.cons(module0191.f11990(var13, var14, var73_311, var16), var19);
                var23 = var23.rest();
                var73_311 = var23.first();
            }
            return Sequences.nreverse(var19);
        }
        cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22483(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            if (NIL != module0205.f13337(var14)) {
                return (SubLObject)NIL;
            }
            SubLObject var316_317;
            final SubLObject var314_315 = var316_317 = module0202.f12826(var14);
            SubLObject var18 = (SubLObject)NIL;
            SubLObject var19 = (SubLObject)NIL;
            SubLObject var20 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var316_317, var314_315, (SubLObject)$ic92$);
            var18 = var316_317.first();
            var316_317 = var316_317.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var316_317, var314_315, (SubLObject)$ic92$);
            var19 = var316_317.first();
            var316_317 = var316_317.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var316_317, var314_315, (SubLObject)$ic92$);
            var20 = var316_317.first();
            var316_317 = var316_317.rest();
            if (NIL == var316_317) {
                return module0440.f30713(var18, var19, var20, var15, var16);
            }
            cdestructuring_bind.cdestructuring_bind_error(var314_315, (SubLObject)$ic92$);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22484(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        SubLObject var14 = (SubLObject)NIL;
        final SubLObject var15 = module0145.$g1916$.currentBinding(var13);
        try {
            module0145.$g1916$.bind((SubLObject)T, var13);
            var14 = f22480(var12);
        }
        finally {
            module0145.$g1916$.rebind(var15, var13);
        }
        return var14;
    }
    
    public static SubLObject f22485(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        SubLObject var14 = (SubLObject)NIL;
        final SubLObject var15 = module0145.$g1916$.currentBinding(var13);
        try {
            module0145.$g1916$.bind((SubLObject)T, var13);
            var14 = f22483(var12);
        }
        finally {
            module0145.$g1916$.rebind(var15, var13);
        }
        return var14;
    }
    
    public static SubLObject f22482(final SubLObject var3, final SubLObject var2, final SubLObject var184, SubLObject var90) {
        if (var90 == UNPROVIDED) {
            var90 = (SubLObject)$ic105$;
        }
        final SubLThread var185 = SubLProcess.currentSubLThread();
        SubLObject var186 = (SubLObject)NIL;
        final SubLObject var187 = module0147.$g2094$.currentBinding(var185);
        final SubLObject var188 = module0147.$g2095$.currentBinding(var185);
        try {
            module0147.$g2094$.bind((SubLObject)$ic106$, var185);
            module0147.$g2095$.bind($ic29$, var185);
            var186 = module0266.f17545(var3, var2, var184, var90);
        }
        finally {
            module0147.$g2095$.rebind(var188, var185);
            module0147.$g2094$.rebind(var187, var185);
        }
        return var186;
    }
    
    public static SubLObject f22486(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic107$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic107$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic107$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic107$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            return module0499.f32206(var14, var15, (SubLObject)UNPROVIDED);
        }
        cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic107$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22487(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic107$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic107$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic107$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic107$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            return module0499.f32208(var14, var15);
        }
        cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic107$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22488(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var17 = (SubLObject)NIL;
        SubLObject var18 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic107$);
        var15 = var12.first();
        SubLObject var19 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var19, var12, (SubLObject)$ic107$);
        var16 = var19.first();
        var19 = var19.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var19, var12, (SubLObject)$ic107$);
        var17 = var19.first();
        var19 = var19.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var19, var12, (SubLObject)$ic107$);
        var18 = var19.first();
        var19 = var19.rest();
        if (NIL == var19) {
            SubLObject var20;
            var13 = (var20 = module0499.f32209(var16));
            SubLObject var73_324 = (SubLObject)NIL;
            var73_324 = var20.first();
            while (NIL != var20) {
                var14 = (SubLObject)ConsesLow.cons(module0191.f11990(var15, var16, var73_324, var18), var14);
                var20 = var20.rest();
                var73_324 = var20.first();
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic107$);
        }
        return var14;
    }
    
    public static SubLObject f22489(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic107$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic107$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic107$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic107$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            return module0501.f32330(var14, var15);
        }
        cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic107$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22490(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic107$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic107$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic107$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic107$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            return module0501.f32332(var14, (SubLObject)UNPROVIDED);
        }
        cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic107$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22491(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var17 = (SubLObject)NIL;
        SubLObject var18 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic110$);
        var15 = var12.first();
        SubLObject var19 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var19, var12, (SubLObject)$ic110$);
        var16 = var19.first();
        var19 = var19.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var19, var12, (SubLObject)$ic110$);
        var17 = var19.first();
        var19 = var19.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var19, var12, (SubLObject)$ic110$);
        var18 = var19.first();
        var19 = var19.rest();
        if (NIL == var19) {
            SubLObject var20;
            var13 = (var20 = module0501.f32334(var16, var17));
            SubLObject var21 = (SubLObject)NIL;
            var21 = var20.first();
            while (NIL != var20) {
                var14 = (SubLObject)ConsesLow.cons(module0191.f11990(var15, var16, var21, var18), var14);
                var20 = var20.rest();
                var21 = var20.first();
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic110$);
        }
        return var14;
    }
    
    public static SubLObject f22492(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var17 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic113$);
        var14 = var12.first();
        SubLObject var18 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var18, var12, (SubLObject)$ic113$);
        var15 = var18.first();
        var18 = var18.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var18, var12, (SubLObject)$ic113$);
        var16 = var18.first();
        var18 = var18.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var18, var12, (SubLObject)$ic113$);
        var17 = var18.first();
        var18 = var18.rest();
        if (NIL == var18) {
            final SubLObject var20;
            final SubLObject var19 = var20 = module0205.f13136(var15);
            if (var20.eql($ic114$) || var20.eql($ic47$)) {
                final SubLObject var21 = module0205.f13203(var15, (SubLObject)UNPROVIDED);
                var13 = (SubLObject)makeBoolean(NIL == module0434.f30597(var21, var16));
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic113$);
        }
        return var13;
    }
    
    public static SubLObject f22493(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL != var17) {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
            return (SubLObject)NIL;
        }
        if (NIL == module0205.f13337(var14)) {
            return module0477.f31668(module0202.f12834(var14, (SubLObject)UNPROVIDED), var15);
        }
        return module0477.f31671(module0202.f12834(var14, (SubLObject)UNPROVIDED), var15);
    }
    
    public static SubLObject f22494(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL != var17) {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
            return (SubLObject)NIL;
        }
        if (NIL != module0205.f13337(var14)) {
            return f22495(module0205.f13338(module0202.f12834(module0205.f13338(var14), (SubLObject)UNPROVIDED)), var15, (SubLObject)T);
        }
        return f22495(module0202.f12834(var14, (SubLObject)UNPROVIDED), var15, (SubLObject)T);
    }
    
    public static SubLObject f22496(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL != var17) {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
            return (SubLObject)NIL;
        }
        if (NIL == module0205.f13337(var14)) {
            return module0487.f31956(module0202.f12834(var14, (SubLObject)UNPROVIDED), module0202.f12835(var14, (SubLObject)UNPROVIDED), var15, (SubLObject)UNPROVIDED);
        }
        var14 = module0202.f12826(var14);
        return module0487.f31968(module0202.f12834(var14, (SubLObject)UNPROVIDED), module0202.f12835(var14, (SubLObject)UNPROVIDED), var15);
    }
    
    public static SubLObject f22497(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL != var17) {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
            return (SubLObject)NIL;
        }
        if (NIL == module0205.f13337(var14)) {
            return module0487.f31971(module0202.f12834(var14, (SubLObject)UNPROVIDED), module0202.f12835(var14, (SubLObject)UNPROVIDED), var15);
        }
        var14 = module0202.f12826(var14);
        return module0487.f31972(module0202.f12834(var14, (SubLObject)UNPROVIDED), module0202.f12835(var14, (SubLObject)UNPROVIDED), var15);
    }
    
    public static SubLObject f22498(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            SubLObject var18 = (SubLObject)NIL;
            SubLObject var19 = (SubLObject)NIL;
            if (NIL == module0205.f13337(var14)) {
                final SubLObject var20 = module0202.f12834(var14, (SubLObject)UNPROVIDED);
                final SubLObject var21 = module0202.f12835(var14, (SubLObject)UNPROVIDED);
                var18 = module0487.f31969(var20, var21);
            }
            else {
                var18 = (SubLObject)ConsesLow.list(var15);
            }
            SubLObject var22 = var18;
            SubLObject var73_347 = (SubLObject)NIL;
            var73_347 = var22.first();
            while (NIL != var22) {
                var19 = (SubLObject)ConsesLow.cons(module0191.f11990(var13, var14, var73_347, var16), var19);
                var22 = var22.rest();
                var73_347 = var22.first();
            }
            return Sequences.nreverse(var19);
        }
        cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22499(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            final SubLObject var19;
            final SubLObject var18 = var19 = module0202.f12833(var14, (SubLObject)UNPROVIDED);
            if (var19.eql($ic85$)) {
                return f22500(var12);
            }
            if (var19.eql($ic121$)) {
                return f22501(var12);
            }
            if (var19.eql($ic122$)) {
                return f22502(var12);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22503(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            final SubLObject var19;
            final SubLObject var18 = var19 = module0202.f12833(var14, (SubLObject)UNPROVIDED);
            if (var19.eql($ic85$)) {
                return f22504(var12);
            }
            if (var19.eql($ic121$)) {
                return f22505(var12);
            }
            if (var19.eql($ic122$)) {
                return f22506(var12);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22507(final SubLObject var12) {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22500(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            SubLObject var356_357;
            final SubLObject var354_355 = var356_357 = module0202.f12829(var14, (SubLObject)UNPROVIDED);
            SubLObject var18 = (SubLObject)NIL;
            SubLObject var19 = (SubLObject)NIL;
            SubLObject var20 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var356_357, var354_355, (SubLObject)$ic124$);
            var18 = var356_357.first();
            var356_357 = var356_357.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var356_357, var354_355, (SubLObject)$ic124$);
            var19 = var356_357.first();
            var356_357 = var356_357.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var356_357, var354_355, (SubLObject)$ic124$);
            var20 = var356_357.first();
            var356_357 = var356_357.rest();
            if (NIL == var356_357) {
                if (NIL != module0205.f13337(var14)) {
                    return (SubLObject)makeBoolean(NIL == module0304.f20285(var18, var19, var20, var15));
                }
                return module0304.f20285(var18, var19, var20, var15);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var354_355, (SubLObject)$ic124$);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22501(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL != var17) {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
            return (SubLObject)NIL;
        }
        final SubLObject var18 = module0202.f12834(var14, (SubLObject)UNPROVIDED);
        if (NIL != module0205.f13337(var14)) {
            return (SubLObject)makeBoolean(NIL == module0304.f20289(var18, var15));
        }
        return module0304.f20289(var18, var15);
    }
    
    public static SubLObject f22502(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL != var17) {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
            return (SubLObject)NIL;
        }
        final SubLObject var18 = module0202.f12834(var14, (SubLObject)UNPROVIDED);
        if (NIL != module0205.f13337(var14)) {
            return (SubLObject)makeBoolean(NIL == module0274.f18171(var18, var15));
        }
        return module0274.f18171(var18, var15);
    }
    
    public static SubLObject f22504(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            SubLObject var18 = (SubLObject)NIL;
            SubLObject var19 = (SubLObject)NIL;
            if (NIL == module0205.f13337(var14)) {
                SubLObject var369_370;
                final SubLObject var367_368 = var369_370 = module0202.f12829(var14, (SubLObject)UNPROVIDED);
                SubLObject var20 = (SubLObject)NIL;
                SubLObject var21 = (SubLObject)NIL;
                SubLObject var22 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var369_370, var367_368, (SubLObject)$ic124$);
                var20 = var369_370.first();
                var369_370 = var369_370.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var369_370, var367_368, (SubLObject)$ic124$);
                var21 = var369_370.first();
                var369_370 = var369_370.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var369_370, var367_368, (SubLObject)$ic124$);
                var22 = var369_370.first();
                var369_370 = var369_370.rest();
                if (NIL == var369_370) {
                    var18 = module0303.f20251(var20, var21, var22, (SubLObject)UNPROVIDED);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var367_368, (SubLObject)$ic124$);
                }
            }
            else {
                var18 = (SubLObject)ConsesLow.list(var15);
            }
            SubLObject var23 = var18;
            SubLObject var73_371 = (SubLObject)NIL;
            var73_371 = var23.first();
            while (NIL != var23) {
                var19 = (SubLObject)ConsesLow.cons(module0191.f11990(var13, var14, var73_371, var16), var19);
                var23 = var23.rest();
                var73_371 = var23.first();
            }
            return Sequences.nreverse(var19);
        }
        cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22505(final SubLObject var12) {
        return (SubLObject)ConsesLow.list(var12);
    }
    
    public static SubLObject f22506(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            SubLObject var18 = (SubLObject)NIL;
            SubLObject var19 = (SubLObject)NIL;
            if (NIL == module0205.f13337(var14)) {
                final SubLObject var20 = module0202.f12834(var14, (SubLObject)UNPROVIDED);
                var18 = module0303.f20235(var20, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else {
                var18 = (SubLObject)ConsesLow.list(var15);
            }
            SubLObject var21 = var18;
            SubLObject var73_374 = (SubLObject)NIL;
            var73_374 = var21.first();
            while (NIL != var21) {
                var19 = (SubLObject)ConsesLow.cons(module0191.f11990(var13, var14, var73_374, var16), var19);
                var21 = var21.rest();
                var73_374 = var21.first();
            }
            return Sequences.nreverse(var19);
        }
        cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22508(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL != var17) {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22509(final SubLObject var12) {
        if (NIL != assertion_handles_oc.f11035(var12)) {
            return (SubLObject)ConsesLow.list(var12);
        }
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic128$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic128$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic128$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic128$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            final SubLObject var18 = module0538.f33385(var14, var15);
            if (NIL != assertion_handles_oc.f11035(var18) && NIL != module0178.f11343(var18, module0130.f8524(var16)) && NIL != module0130.f8509(module0178.f11293(var18), module0130.f8523(var16))) {
                return (SubLObject)ConsesLow.list(var18);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic128$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22510(final SubLObject var12) {
        return module0035.sublisp_boolean(f22509(var12));
    }
    
    public static SubLObject f22511(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic128$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic128$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic128$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic128$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL != var17) {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic128$);
            return (SubLObject)NIL;
        }
        final SubLObject var18 = var15;
        if (var18.eql($ic29$)) {
            final SubLObject var19 = module0538.f33384(var14);
            SubLObject var20 = (SubLObject)NIL;
            SubLObject var21 = var19;
            SubLObject var22 = (SubLObject)NIL;
            var22 = var21.first();
            while (NIL != var21) {
                final SubLObject var23 = module0178.f11287(var22);
                if (NIL == conses_high.member(var23, var20, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var20 = (SubLObject)ConsesLow.cons(var23, var20);
                }
                var21 = var21.rest();
                var22 = var21.first();
            }
            return var20;
        }
        return (SubLObject)ConsesLow.list(var15);
    }
    
    public static SubLObject f22512(final SubLObject var383, final SubLObject var384) {
        SubLObject var386;
        final SubLObject var385 = var386 = var383.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var386, var385, (SubLObject)$ic131$);
        final SubLObject var387 = var386.rest();
        var386 = var386.first();
        SubLObject var388 = (SubLObject)NIL;
        SubLObject var389 = (SubLObject)NIL;
        SubLObject var390 = (SubLObject)NIL;
        SubLObject var391 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var386, var385, (SubLObject)$ic131$);
        var388 = var386.first();
        var386 = var386.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var386, var385, (SubLObject)$ic131$);
        var389 = var386.first();
        var386 = var386.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var386, var385, (SubLObject)$ic131$);
        var390 = var386.first();
        var386 = var386.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var386, var385, (SubLObject)$ic131$);
        var391 = var386.first();
        var386 = var386.rest();
        if (NIL == var386) {
            final SubLObject var392;
            var386 = (var392 = var387);
            return (SubLObject)ConsesLow.list((SubLObject)$ic132$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic133$, var390), (SubLObject)ConsesLow.listS((SubLObject)$ic134$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var388, (SubLObject)ConsesLow.listS((SubLObject)$ic135$, var390, (SubLObject)$ic136$)), (SubLObject)ConsesLow.list(var389, (SubLObject)ConsesLow.list((SubLObject)$ic137$, var391))), ConsesLow.append(var392, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic138$, var390), (SubLObject)ConsesLow.listS((SubLObject)$ic134$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var388, var390), (SubLObject)ConsesLow.list(var389, var391)), ConsesLow.append(var392, (SubLObject)NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var385, (SubLObject)$ic131$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22513(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var17 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var14 = var12.first();
        SubLObject var18 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var18, var12, (SubLObject)$ic33$);
        var15 = var18.first();
        var18 = var18.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var18, var12, (SubLObject)$ic33$);
        var16 = var18.first();
        var18 = var18.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var18, var12, (SubLObject)$ic33$);
        var17 = var18.first();
        var18 = var18.rest();
        if (NIL == var18) {
            if (NIL != module0202.f12592(var15)) {
                final SubLObject var19 = module0205.f13203(var15, (SubLObject)$ic139$);
                final SubLObject var20 = module0130.f8525(var17);
                SubLObject var397_398;
                final SubLObject var395_396 = var397_398 = var19;
                SubLObject var21 = (SubLObject)NIL;
                SubLObject var22 = (SubLObject)NIL;
                SubLObject var23 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var397_398, var395_396, (SubLObject)$ic92$);
                var21 = var397_398.first();
                var397_398 = var397_398.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var397_398, var395_396, (SubLObject)$ic92$);
                var22 = var397_398.first();
                var397_398 = var397_398.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var397_398, var395_396, (SubLObject)$ic92$);
                var23 = var397_398.first();
                var397_398 = var397_398.rest();
                if (NIL == var397_398) {
                    var13 = f22514(var14, var21, var22, var23, var16, var20);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var395_396, (SubLObject)$ic92$);
                }
            }
            else if (NIL != module0202.f12590(var15)) {
                final SubLObject var19 = var15;
                final SubLObject var20 = var17;
                SubLObject var401_402;
                final SubLObject var399_400 = var401_402 = var19;
                SubLObject var21 = (SubLObject)NIL;
                SubLObject var22 = (SubLObject)NIL;
                SubLObject var23 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var401_402, var399_400, (SubLObject)$ic92$);
                var21 = var401_402.first();
                var401_402 = var401_402.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var401_402, var399_400, (SubLObject)$ic92$);
                var22 = var401_402.first();
                var401_402 = var401_402.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var401_402, var399_400, (SubLObject)$ic92$);
                var23 = var401_402.first();
                var401_402 = var401_402.rest();
                if (NIL == var401_402) {
                    var13 = f22514(var14, var21, var22, var23, var16, var20);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var399_400, (SubLObject)$ic92$);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        }
        return var13;
    }
    
    public static SubLObject f22514(final SubLObject var13, final SubLObject var3, final SubLObject var2, final SubLObject var184, final SubLObject var73, final SubLObject var90) {
        SubLObject var185 = (SubLObject)NIL;
        if (NIL != module0035.f2169(var13, (SubLObject)$ic140$) && $ic38$ == module0130.f8524(var90)) {
            if (NIL == module0132.f8596(var73) && $ic105$ == var90 && NIL == var185) {
                var185 = f22515(var3, var2, var184, $ic49$, (SubLObject)$ic141$);
            }
            if ($ic105$ == var90 && NIL == var185) {
                var185 = f22515(var3, var2, var184, var73, (SubLObject)$ic141$);
            }
            if (NIL == module0132.f8596(var73) && NIL == var185) {
                var185 = f22515(var3, var2, var184, $ic49$, var90);
            }
        }
        if (NIL == var185) {
            var185 = f22515(var3, var2, var184, var73, var90);
        }
        return var185;
    }
    
    public static SubLObject f22515(final SubLObject var3, final SubLObject var2, final SubLObject var184, final SubLObject var73, final SubLObject var90) {
        final SubLThread var185 = SubLProcess.currentSubLThread();
        SubLObject var186 = (SubLObject)NIL;
        final SubLObject var187 = module0147.f9540(var73);
        final SubLObject var188 = module0147.$g2095$.currentBinding(var185);
        final SubLObject var189 = module0147.$g2094$.currentBinding(var185);
        final SubLObject var190 = module0147.$g2096$.currentBinding(var185);
        try {
            module0147.$g2095$.bind(module0147.f9545(var187), var185);
            module0147.$g2094$.bind(module0147.f9546(var187), var185);
            module0147.$g2096$.bind(module0147.f9549(var187), var185);
            var186 = module0252.f16351(module0137.f8955(var3), var2, var184, (SubLObject)NIL, module0138.f8989(var90), (SubLObject)$ic67$);
        }
        finally {
            module0147.$g2096$.rebind(var190, var185);
            module0147.$g2094$.rebind(var189, var185);
            module0147.$g2095$.rebind(var188, var185);
        }
        return var186;
    }
    
    public static SubLObject f22516(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            if (NIL != module0205.f13337(var14)) {
                SubLObject var407_408;
                final SubLObject var405_406 = var407_408 = module0202.f12829(module0202.f12826(var14), (SubLObject)UNPROVIDED);
                SubLObject var18 = (SubLObject)NIL;
                SubLObject var19 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var407_408, var405_406, (SubLObject)$ic55$);
                var18 = var407_408.first();
                var407_408 = var407_408.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var407_408, var405_406, (SubLObject)$ic55$);
                var19 = var407_408.first();
                var407_408 = var407_408.rest();
                if (NIL == var407_408) {
                    return (SubLObject)makeBoolean(((NIL == module0373.f26113() || NIL != module0361.f24167(module0373.f26113())) && NIL != module0226.f14858(var19, var15) && NIL == module0305.f20438(var18, var19, var15)) || NIL != module0259.f16867(var18, var19, var15, module0138.f8989(var16)));
                }
                cdestructuring_bind.cdestructuring_bind_error(var405_406, (SubLObject)$ic55$);
            }
            else {
                final SubLObject var20 = module0202.f12832(var14, (SubLObject)UNPROVIDED);
                if (var20.eql($ic142$)) {
                    return module0458.f31230(var12);
                }
                if (var20.eql($ic143$)) {
                    return module0458.f31280(var12);
                }
                SubLObject var411_412;
                final SubLObject var409_410 = var411_412 = module0202.f12829(var14, (SubLObject)UNPROVIDED);
                SubLObject var21 = (SubLObject)NIL;
                SubLObject var22 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var411_412, var409_410, (SubLObject)$ic55$);
                var21 = var411_412.first();
                var411_412 = var411_412.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var411_412, var409_410, (SubLObject)$ic55$);
                var22 = var411_412.first();
                var411_412 = var411_412.rest();
                if (NIL == var411_412) {
                    return module0259.f16854(var21, var22, var15, module0138.f8989(var16));
                }
                cdestructuring_bind.cdestructuring_bind_error(var409_410, (SubLObject)$ic55$);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22517(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL != var17) {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
            return (SubLObject)NIL;
        }
        final SubLObject var18 = module0202.f12832(var14, (SubLObject)UNPROVIDED);
        if (var18.eql($ic144$)) {
            final SubLObject var19 = module0202.f12834(var14, (SubLObject)UNPROVIDED);
            final SubLObject var20 = module0202.f12835(var14, (SubLObject)UNPROVIDED);
            final SubLObject var21 = module0202.f12768($ic84$, var19, var20);
            final SubLObject var22 = (NIL != module0205.f13337(var14)) ? module0205.f13338(var21) : var21;
            final SubLObject var23 = module0191.f11990(var13, var22, var15, var16);
            return f22513(var23);
        }
        if (var18.eql($ic142$)) {
            return module0458.f31231(var12);
        }
        if (var18.eql($ic143$)) {
            return module0458.f31281(var12);
        }
        if (NIL == module0205.f13337(var14)) {
            return f22513(var12);
        }
        final SubLObject var19 = module0202.f12834(var14, (SubLObject)UNPROVIDED);
        final SubLObject var20 = module0202.f12835(var14, (SubLObject)UNPROVIDED);
        if (NIL != module0226.f14858(var20, var15)) {
            return f22518(var19, var20, var15);
        }
        return f22513(var12);
    }
    
    public static SubLObject f22519(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            SubLObject var18 = (SubLObject)NIL;
            SubLObject var19 = (SubLObject)NIL;
            if (NIL == module0205.f13337(var14)) {
                final SubLObject var20 = module0202.f12832(var14, (SubLObject)UNPROVIDED);
                if (var20.eql($ic144$)) {
                    SubLObject var422_423;
                    final SubLObject var420_421 = var422_423 = module0202.f12829(var14, (SubLObject)UNPROVIDED);
                    SubLObject var21 = (SubLObject)NIL;
                    SubLObject var22 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var422_423, var420_421, (SubLObject)$ic91$);
                    var21 = var422_423.first();
                    var422_423 = var422_423.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var422_423, var420_421, (SubLObject)$ic91$);
                    var22 = var422_423.first();
                    var422_423 = var422_423.rest();
                    if (NIL == var422_423) {
                        var18 = f22520(var21, var22);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var420_421, (SubLObject)$ic91$);
                    }
                }
                else if (var20.eql($ic56$)) {
                    SubLObject var426_427;
                    final SubLObject var424_425 = var426_427 = module0202.f12829(var14, (SubLObject)UNPROVIDED);
                    SubLObject var21 = (SubLObject)NIL;
                    SubLObject var22 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var426_427, var424_425, (SubLObject)$ic91$);
                    var21 = var426_427.first();
                    var426_427 = var426_427.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var426_427, var424_425, (SubLObject)$ic91$);
                    var22 = var426_427.first();
                    var426_427 = var426_427.rest();
                    if (NIL == var426_427) {
                        var18 = f22521(var21, var22);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var424_425, (SubLObject)$ic91$);
                    }
                }
                else if (var20.eql($ic142$)) {
                    SubLObject var430_431;
                    final SubLObject var428_429 = var430_431 = module0202.f12829(var14, (SubLObject)UNPROVIDED);
                    SubLObject var21 = (SubLObject)NIL;
                    SubLObject var22 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var430_431, var428_429, (SubLObject)$ic91$);
                    var21 = var430_431.first();
                    var430_431 = var430_431.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var430_431, var428_429, (SubLObject)$ic91$);
                    var22 = var430_431.first();
                    var430_431 = var430_431.rest();
                    if (NIL == var430_431) {
                        var18 = f22520(var21, var22);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var428_429, (SubLObject)$ic91$);
                    }
                }
                else if (var20.eql($ic143$)) {
                    SubLObject var434_435;
                    final SubLObject var432_433 = var434_435 = module0202.f12829(var14, (SubLObject)UNPROVIDED);
                    SubLObject var21 = (SubLObject)NIL;
                    SubLObject var22 = (SubLObject)NIL;
                    SubLObject var23 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var434_435, var432_433, (SubLObject)$ic145$);
                    var21 = var434_435.first();
                    var434_435 = var434_435.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var434_435, var432_433, (SubLObject)$ic145$);
                    var22 = var434_435.first();
                    var434_435 = var434_435.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var434_435, var432_433, (SubLObject)$ic145$);
                    var23 = var434_435.first();
                    var434_435 = var434_435.rest();
                    if (NIL == var434_435) {
                        final SubLObject var24 = f22520(var21, var23);
                        final SubLObject var25 = f22520(var23, var22);
                        SubLObject var26 = var24;
                        SubLObject var27 = (SubLObject)NIL;
                        var27 = var26.first();
                        while (NIL != var26) {
                            SubLObject var8_440 = var25;
                            SubLObject var28 = (SubLObject)NIL;
                            var28 = var8_440.first();
                            while (NIL != var8_440) {
                                var18 = ConsesLow.append(var18, module0349.f23437((SubLObject)ConsesLow.list(var27, var28), (SubLObject)UNPROVIDED));
                                var8_440 = var8_440.rest();
                                var28 = var8_440.first();
                            }
                            var26 = var26.rest();
                            var27 = var26.first();
                        }
                        var18 = module0035.f2269(var18, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var432_433, (SubLObject)$ic145$);
                    }
                }
                else {
                    SubLObject var444_445;
                    final SubLObject var442_443 = var444_445 = module0202.f12829(var14, (SubLObject)UNPROVIDED);
                    SubLObject var21 = (SubLObject)NIL;
                    SubLObject var22 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var444_445, var442_443, (SubLObject)$ic91$);
                    var21 = var444_445.first();
                    var444_445 = var444_445.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var444_445, var442_443, (SubLObject)$ic91$);
                    var22 = var444_445.first();
                    var444_445 = var444_445.rest();
                    if (NIL == var444_445) {
                        var18 = f22520(var21, var22);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var442_443, (SubLObject)$ic91$);
                    }
                }
            }
            else {
                var18 = (SubLObject)ConsesLow.list(var15);
            }
            SubLObject var29 = var18;
            SubLObject var73_446 = (SubLObject)NIL;
            var73_446 = var29.first();
            while (NIL != var29) {
                var19 = (SubLObject)ConsesLow.cons(module0191.f11990(var13, var14, var73_446, var16), var19);
                var29 = var29.rest();
                var73_446 = var29.first();
            }
            return Sequences.nreverse(var19);
        }
        cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22518(final SubLObject var243, final SubLObject var116, final SubLObject var73) {
        final SubLThread var244 = SubLProcess.currentSubLThread();
        final SubLObject var245 = module0202.f12768($ic84$, var243, var116);
        SubLObject var246 = (SubLObject)NIL;
        SubLObject var247 = (SubLObject)NIL;
        final SubLObject var248 = module0147.f9540(var73);
        final SubLObject var249 = module0147.$g2095$.currentBinding(var244);
        final SubLObject var250 = module0147.$g2094$.currentBinding(var244);
        final SubLObject var251 = module0147.$g2096$.currentBinding(var244);
        try {
            module0147.$g2095$.bind(module0147.f9545(var248), var244);
            module0147.$g2094$.bind(module0147.f9546(var248), var244);
            module0147.$g2096$.bind(module0147.f9549(var248), var244);
            var246 = module0226.f14859(var116, (SubLObject)UNPROVIDED);
            var247 = module0483.f31858(var245);
        }
        finally {
            module0147.$g2096$.rebind(var251, var244);
            module0147.$g2094$.rebind(var250, var244);
            module0147.$g2095$.rebind(var249, var244);
        }
        return (SubLObject)ConsesLow.list(var246, var247);
    }
    
    public static SubLObject f22520(final SubLObject var243, final SubLObject var116) {
        final SubLObject var244 = module0259.f16933(var243, var116, (SubLObject)UNPROVIDED);
        final SubLObject var245 = module0132.f8604(var244);
        final SubLObject var246 = module0262.f17379(var245);
        final SubLObject var247 = module0132.f8603(var246);
        return var247;
    }
    
    public static SubLObject f22521(final SubLObject var243, final SubLObject var116) {
        final SubLObject var244 = module0259.f16934(var243, var116, (SubLObject)UNPROVIDED);
        final SubLObject var245 = module0132.f8604(var244);
        final SubLObject var246 = module0262.f17379(var245);
        final SubLObject var247 = module0132.f8603(var246);
        return var247;
    }
    
    public static SubLObject f22522(final SubLObject var28, final SubLObject var73) {
        SubLObject var74 = (SubLObject)NIL;
        SubLObject var75 = (SubLObject)NIL;
        SubLObject var76 = var28;
        SubLObject var77 = (SubLObject)NIL;
        var77 = var76.first();
        while (NIL != var76) {
            SubLObject var79;
            final SubLObject var78 = var79 = var77;
            SubLObject var80 = (SubLObject)NIL;
            SubLObject var81 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var79, var78, (SubLObject)$ic147$);
            var80 = var79.first();
            var79 = var79.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var79, var78, (SubLObject)$ic147$);
            var81 = var79.first();
            var79 = var79.rest();
            if (NIL == var79) {
                var75 = module0217.f14421(var80, var73);
                if (NIL == var75 && NIL != f22523(var80.first())) {
                    var75 = module0217.f14421((SubLObject)ConsesLow.list(var80.first(), conses_high.third(var80), conses_high.second(var80)), var73);
                }
                if (NIL != var75) {
                    var74 = (SubLObject)ConsesLow.cons(var75, var74);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var78, (SubLObject)$ic147$);
            }
            var76 = var76.rest();
            var77 = var76.first();
        }
        return Sequences.nreverse(var74);
    }
    
    public static SubLObject f22524(final SubLObject var28, final SubLObject var73) {
        SubLObject var74 = (SubLObject)NIL;
        SubLObject var75 = (SubLObject)NIL;
        SubLObject var76 = var28;
        SubLObject var77 = (SubLObject)NIL;
        var77 = var76.first();
        while (NIL != var76) {
            SubLObject var79;
            final SubLObject var78 = var79 = var77;
            SubLObject var80 = (SubLObject)NIL;
            SubLObject var81 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var79, var78, (SubLObject)$ic147$);
            var80 = var79.first();
            var79 = var79.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var79, var78, (SubLObject)$ic147$);
            var81 = var79.first();
            var79 = var79.rest();
            if (NIL == var79) {
                var75 = module0217.f14424(var80, var73);
                if (NIL == var75 && NIL != f22523(var80.first())) {
                    var75 = module0217.f14421((SubLObject)ConsesLow.list(var80.first(), conses_high.third(var80), conses_high.second(var80)), var73);
                }
                if (NIL != var75) {
                    var74 = (SubLObject)ConsesLow.cons(var75, var74);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var78, (SubLObject)$ic147$);
            }
            var76 = var76.rest();
            var77 = var76.first();
        }
        return Sequences.nreverse(var74);
    }
    
    public static SubLObject f22523(final SubLObject var208) {
        return Types.consp(conses_high.member(var208, (SubLObject)$ic148$, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f22525(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL != var17) {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
            return (SubLObject)NIL;
        }
        if (NIL != module0205.f13337(var14)) {
            var14 = module0202.f12826(var14);
            return module0454.f31144(module0202.f12834(var14, (SubLObject)UNPROVIDED), module0202.f12835(var14, (SubLObject)UNPROVIDED), var15, module0138.f8989(var16));
        }
        final SubLObject var18 = module0202.f12832(var14, (SubLObject)UNPROVIDED);
        if (var18.eql($ic149$)) {
            return module0458.f31240(var12);
        }
        if (var18.eql($ic150$)) {
            return module0458.f31286(var12);
        }
        return module0454.f31143(module0202.f12834(var14, (SubLObject)UNPROVIDED), module0202.f12835(var14, (SubLObject)UNPROVIDED), var15, module0138.f8989(var16));
    }
    
    public static SubLObject f22526(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL != var17) {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
            return (SubLObject)NIL;
        }
        final SubLObject var18 = module0202.f12832(var14, (SubLObject)UNPROVIDED);
        if (var18.eql($ic149$)) {
            return module0458.f31241(var12);
        }
        if (var18.eql($ic150$)) {
            return module0458.f31287(var12);
        }
        return f22513(var12);
    }
    
    public static SubLObject f22527(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            SubLObject var18 = (SubLObject)NIL;
            SubLObject var19 = (SubLObject)NIL;
            if (NIL == module0205.f13337(var14)) {
                var18 = f22528(module0202.f12834(var14, (SubLObject)UNPROVIDED), module0202.f12835(var14, (SubLObject)UNPROVIDED));
            }
            else {
                var18 = (SubLObject)ConsesLow.list(var15);
            }
            SubLObject var20 = var18;
            SubLObject var73_463 = (SubLObject)NIL;
            var73_463 = var20.first();
            while (NIL != var20) {
                var19 = (SubLObject)ConsesLow.cons(module0191.f11990(var13, var14, var73_463, var16), var19);
                var20 = var20.rest();
                var73_463 = var20.first();
            }
            return Sequences.nreverse(var19);
        }
        cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22528(final SubLObject var464, final SubLObject var465) {
        if (NIL != module0210.f13598(var464)) {
            return module0256.f16651(var464, var465, (SubLObject)UNPROVIDED);
        }
        final SubLObject var466 = module0253.f16440(module0137.f8955($ic153$), var464, var465, (SubLObject)UNPROVIDED);
        final SubLObject var467 = module0132.f8604(var466);
        final SubLObject var468 = module0253.f16445(var467);
        final SubLObject var469 = module0132.f8603(var468);
        return var469;
    }
    
    public static SubLObject f22529(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            if (module0202.f12832(var14, (SubLObject)UNPROVIDED).eql($ic154$)) {
                SubLObject var470_471;
                final SubLObject var468_469 = var470_471 = module0202.f12829(var14, (SubLObject)UNPROVIDED);
                SubLObject var18 = (SubLObject)NIL;
                SubLObject var19 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var470_471, var468_469, (SubLObject)$ic155$);
                var18 = var470_471.first();
                var470_471 = var470_471.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var470_471, var468_469, (SubLObject)$ic155$);
                var19 = var470_471.first();
                var470_471 = var470_471.rest();
                if (NIL == var470_471) {
                    return module0035.sublisp_boolean(module0257.f16694(var18, var19, var15, module0138.f8989(var16)));
                }
                cdestructuring_bind.cdestructuring_bind_error(var468_469, (SubLObject)$ic155$);
            }
            else if (NIL == module0205.f13337(var14)) {
                SubLObject var476_477;
                final SubLObject var474_475 = var476_477 = module0202.f12829(var14, (SubLObject)UNPROVIDED);
                SubLObject var20 = (SubLObject)NIL;
                SubLObject var21 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var476_477, var474_475, (SubLObject)$ic66$);
                var20 = var476_477.first();
                var476_477 = var476_477.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var476_477, var474_475, (SubLObject)$ic66$);
                var21 = var476_477.first();
                var476_477 = var476_477.rest();
                if (NIL == var476_477) {
                    return module0257.f16689(var20, var21, var15, module0138.f8989(var16));
                }
                cdestructuring_bind.cdestructuring_bind_error(var474_475, (SubLObject)$ic66$);
            }
            else {
                SubLObject var480_481;
                final SubLObject var478_479 = var480_481 = module0202.f12829(module0202.f12826(var14), (SubLObject)UNPROVIDED);
                SubLObject var20 = (SubLObject)NIL;
                SubLObject var21 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var480_481, var478_479, (SubLObject)$ic66$);
                var20 = var480_481.first();
                var480_481 = var480_481.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var480_481, var478_479, (SubLObject)$ic66$);
                var21 = var480_481.first();
                var480_481 = var480_481.rest();
                if (NIL == var480_481) {
                    return module0257.f16699(var20, var21, var15, module0138.f8989(var16));
                }
                cdestructuring_bind.cdestructuring_bind_error(var478_479, (SubLObject)$ic66$);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22530(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            if (!module0202.f12832(var14, (SubLObject)UNPROVIDED).eql($ic154$)) {
                return f22513(var12);
            }
            SubLObject var486_487;
            final SubLObject var484_485 = var486_487 = module0202.f12829(var14, (SubLObject)UNPROVIDED);
            SubLObject var18 = (SubLObject)NIL;
            SubLObject var19 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var486_487, var484_485, (SubLObject)$ic155$);
            var18 = var486_487.first();
            var486_487 = var486_487.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var486_487, var484_485, (SubLObject)$ic155$);
            var19 = var486_487.first();
            var486_487 = var486_487.rest();
            if (NIL == var486_487) {
                return module0257.f16694(var18, var19, var15, module0138.f8989(var16));
            }
            cdestructuring_bind.cdestructuring_bind_error(var484_485, (SubLObject)$ic155$);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22531(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            SubLObject var18 = (SubLObject)NIL;
            SubLObject var19 = (SubLObject)NIL;
            if (NIL == module0205.f13337(var14)) {
                var18 = (SubLObject)ConsesLow.list(var15);
            }
            else {
                var18 = (SubLObject)ConsesLow.list(var15);
            }
            SubLObject var20 = var18;
            SubLObject var73_490 = (SubLObject)NIL;
            var73_490 = var20.first();
            while (NIL != var20) {
                var19 = (SubLObject)ConsesLow.cons(module0191.f11990(var13, var14, var73_490, var16), var19);
                var20 = var20.rest();
                var73_490 = var20.first();
            }
            return Sequences.nreverse(var19);
        }
        cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22532(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL != var17) {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
            return (SubLObject)NIL;
        }
        if (NIL != module0205.f13337(var14)) {
            final SubLObject var18 = module0202.f12826(var14);
            return module0262.f17348(module0202.f12834(var18, (SubLObject)UNPROVIDED), module0202.f12835(var18, (SubLObject)UNPROVIDED), var15, module0138.f8989(var16));
        }
        return module0262.f17336(module0202.f12834(var14, (SubLObject)UNPROVIDED), module0202.f12835(var14, (SubLObject)UNPROVIDED), var15, module0138.f8989(var16));
    }
    
    public static SubLObject f22533(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var17 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var14 = var12.first();
        SubLObject var18 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var18, var12, (SubLObject)$ic33$);
        var15 = var18.first();
        var18 = var18.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var18, var12, (SubLObject)$ic33$);
        var16 = var18.first();
        var18 = var18.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var18, var12, (SubLObject)$ic33$);
        var17 = var18.first();
        var18 = var18.rest();
        if (NIL == var18) {
            if (NIL == module0205.f13337(var15)) {
                var13 = module0262.f17354(module0202.f12834(var15, (SubLObject)UNPROVIDED), module0202.f12835(var15, (SubLObject)UNPROVIDED), var16, (SubLObject)NIL, (SubLObject)$ic67$);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        }
        return var13;
    }
    
    public static SubLObject f22534(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            SubLObject var18 = (SubLObject)NIL;
            SubLObject var19 = (SubLObject)NIL;
            if (NIL == module0205.f13337(var14)) {
                var18 = module0262.f17384(module0202.f12834(var14, (SubLObject)UNPROVIDED), module0202.f12835(var14, (SubLObject)UNPROVIDED));
            }
            else {
                var18 = (SubLObject)ConsesLow.list(var15);
            }
            SubLObject var20 = var18;
            SubLObject var73_498 = (SubLObject)NIL;
            var73_498 = var20.first();
            while (NIL != var20) {
                var19 = (SubLObject)ConsesLow.cons(module0191.f11990(var13, var14, var73_498, var16), var19);
                var20 = var20.rest();
                var73_498 = var20.first();
            }
            return Sequences.nreverse(var19);
        }
        cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22535(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            if (NIL == module0205.f13337(var14)) {
                SubLObject var503_504;
                final SubLObject var501_502 = var503_504 = var14;
                SubLObject var18 = (SubLObject)NIL;
                SubLObject var19 = (SubLObject)NIL;
                SubLObject var20 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var503_504, var501_502, (SubLObject)$ic160$);
                var18 = var503_504.first();
                var503_504 = var503_504.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var503_504, var501_502, (SubLObject)$ic160$);
                var19 = var503_504.first();
                var503_504 = var503_504.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var503_504, var501_502, (SubLObject)$ic160$);
                var20 = var503_504.first();
                var503_504 = var503_504.rest();
                if (NIL == var503_504) {
                    final SubLObject var21 = var18;
                    if (var21.eql($ic161$)) {
                        return module0260.f17089(var19, var20, var15, module0138.f8989(var16));
                    }
                    if (var21.eql($ic162$)) {
                        return module0260.f17094(var19, var20, var15, module0138.f8989(var16));
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var501_502, (SubLObject)$ic160$);
                }
            }
            else {
                SubLObject var507_508;
                final SubLObject var505_506 = var507_508 = module0202.f12826(var14);
                SubLObject var18 = (SubLObject)NIL;
                SubLObject var19 = (SubLObject)NIL;
                SubLObject var20 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var507_508, var505_506, (SubLObject)$ic160$);
                var18 = var507_508.first();
                var507_508 = var507_508.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var507_508, var505_506, (SubLObject)$ic160$);
                var19 = var507_508.first();
                var507_508 = var507_508.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var507_508, var505_506, (SubLObject)$ic160$);
                var20 = var507_508.first();
                var507_508 = var507_508.rest();
                if (NIL == var507_508) {
                    final SubLObject var21 = var18;
                    if (var21.eql($ic161$)) {
                        return module0260.f17102(var19, var20, var15, module0138.f8989(var16));
                    }
                    if (var21.eql($ic162$)) {
                        return module0260.f17106(var19, var20, var15, module0138.f8989(var16));
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var505_506, (SubLObject)$ic160$);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22536(final SubLObject var12) {
        return f22513(var12);
    }
    
    public static SubLObject f22537(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            SubLObject var18 = (SubLObject)NIL;
            SubLObject var19 = (SubLObject)NIL;
            if (NIL == module0205.f13337(var14)) {
                SubLObject var513_514;
                final SubLObject var511_512 = var513_514 = var14;
                SubLObject var20 = (SubLObject)NIL;
                SubLObject var21 = (SubLObject)NIL;
                SubLObject var22 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var513_514, var511_512, (SubLObject)$ic160$);
                var20 = var513_514.first();
                var513_514 = var513_514.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var513_514, var511_512, (SubLObject)$ic160$);
                var21 = var513_514.first();
                var513_514 = var513_514.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var513_514, var511_512, (SubLObject)$ic160$);
                var22 = var513_514.first();
                var513_514 = var513_514.rest();
                if (NIL == var513_514) {
                    final SubLObject var23 = var20;
                    if (var23.eql($ic161$)) {
                        var18 = module0260.f17139(var21, var22);
                    }
                    else if (var23.eql($ic162$)) {
                        var18 = module0260.f17144(var21, var22, (SubLObject)UNPROVIDED);
                    }
                    else {
                        var18 = (SubLObject)ConsesLow.list(var15);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var511_512, (SubLObject)$ic160$);
                }
            }
            else {
                var18 = (SubLObject)ConsesLow.list(var15);
            }
            SubLObject var24 = var18;
            SubLObject var73_515 = (SubLObject)NIL;
            var73_515 = var24.first();
            while (NIL != var24) {
                var19 = (SubLObject)ConsesLow.cons(module0191.f11990(var13, var14, var73_515, var16), var19);
                var24 = var24.rest();
                var73_515 = var24.first();
            }
            return Sequences.nreverse(var19);
        }
        cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22538(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            if (NIL == module0205.f13337(var14)) {
                SubLObject var520_521;
                final SubLObject var518_519 = var520_521 = var14;
                SubLObject var18 = (SubLObject)NIL;
                SubLObject var19 = (SubLObject)NIL;
                SubLObject var20 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var520_521, var518_519, (SubLObject)$ic92$);
                var18 = var520_521.first();
                var520_521 = var520_521.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var520_521, var518_519, (SubLObject)$ic92$);
                var19 = var520_521.first();
                var520_521 = var520_521.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var520_521, var518_519, (SubLObject)$ic92$);
                var20 = var520_521.first();
                var520_521 = var520_521.rest();
                if (NIL == var520_521) {
                    final SubLObject var21 = var18;
                    if (var21.eql($ic165$)) {
                        return module0261.f17246(var19, var20, var15, module0138.f8989(var16));
                    }
                    if (var21.eql($ic166$)) {
                        return module0261.f17250(var19, var20, var15, module0138.f8989(var16));
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var518_519, (SubLObject)$ic92$);
                }
            }
            else {
                SubLObject var524_525;
                final SubLObject var522_523 = var524_525 = module0202.f12826(var14);
                SubLObject var18 = (SubLObject)NIL;
                SubLObject var19 = (SubLObject)NIL;
                SubLObject var20 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var524_525, var522_523, (SubLObject)$ic92$);
                var18 = var524_525.first();
                var524_525 = var524_525.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var524_525, var522_523, (SubLObject)$ic92$);
                var19 = var524_525.first();
                var524_525 = var524_525.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var524_525, var522_523, (SubLObject)$ic92$);
                var20 = var524_525.first();
                var524_525 = var524_525.rest();
                if (NIL == var524_525) {
                    final SubLObject var21 = var18;
                    if (var21.eql($ic165$)) {
                        return module0261.f17253(var19, var20, var15, module0138.f8989(var16));
                    }
                    if (var21.eql($ic166$)) {
                        return module0261.f17254(var19, var20, var15, module0138.f8989(var16));
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var522_523, (SubLObject)$ic92$);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22539(final SubLObject var12) {
        return f22513(var12);
    }
    
    public static SubLObject f22540(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            SubLObject var18 = (SubLObject)NIL;
            SubLObject var19 = (SubLObject)NIL;
            SubLObject var20;
            var18 = (var20 = (SubLObject)ConsesLow.list(var15));
            SubLObject var73_528 = (SubLObject)NIL;
            var73_528 = var20.first();
            while (NIL != var20) {
                var19 = (SubLObject)ConsesLow.cons(module0191.f11990(var13, var14, var73_528, var16), var19);
                var20 = var20.rest();
                var73_528 = var20.first();
            }
            return Sequences.nreverse(var19);
        }
        cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22541(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL != var17) {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
            return (SubLObject)NIL;
        }
        final SubLObject var18 = module0202.f12832(var14, (SubLObject)UNPROVIDED);
        if (var18.eql($ic169$)) {
            final SubLObject var19 = module0202.f12834(var14, (SubLObject)UNPROVIDED);
            final SubLObject var20 = module0202.f12835(var14, (SubLObject)UNPROVIDED);
            return module0267.f17565(var19, var20);
        }
        if (var18.eql($ic170$)) {
            final SubLObject var21 = module0202.f12834(var14, (SubLObject)UNPROVIDED);
            final SubLObject var22 = module0202.f12835(var14, (SubLObject)UNPROVIDED);
            return module0267.f17566(var21, var22);
        }
        if (var18.eql($ic171$)) {
            final SubLObject var21 = module0202.f12834(var14, (SubLObject)UNPROVIDED);
            final SubLObject var23 = module0202.f12835(var14, (SubLObject)UNPROVIDED);
            return module0614.f37674(var21, var23);
        }
        if (NIL != module0324.f21954(var18)) {
            return module0328.f22145(var12);
        }
        return Errors.cerror((SubLObject)$ic172$, (SubLObject)$ic173$, var18);
    }
    
    public static SubLObject f22542(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL != var17) {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
            return (SubLObject)NIL;
        }
        if (NIL != module0324.f21954(module0202.f12832(var14, (SubLObject)UNPROVIDED))) {
            return module0328.f22147(var12);
        }
        return var15;
    }
    
    public static SubLObject f22543(final SubLObject var12, final SubLObject var74) {
        SubLObject var75 = (SubLObject)NIL;
        SubLObject var76 = (SubLObject)NIL;
        SubLObject var77 = (SubLObject)NIL;
        SubLObject var78 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var75 = var12.first();
        SubLObject var79 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var79, var12, (SubLObject)$ic33$);
        var76 = var79.first();
        var79 = var79.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var79, var12, (SubLObject)$ic33$);
        var77 = var79.first();
        var79 = var79.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var79, var12, (SubLObject)$ic33$);
        var78 = var79.first();
        var79 = var79.rest();
        if (NIL == var79) {
            if (var74.eql((SubLObject)$ic72$)) {
                return (SubLObject)T;
            }
            if (var74.eql((SubLObject)$ic73$)) {
                return module0478.f31676(var76, var77);
            }
            if (var74.eql((SubLObject)$ic74$)) {
                return module0478.f31676(var76, var77);
            }
            if (var74.eql((SubLObject)$ic75$)) {
                return module0478.f31676(var76, var77);
            }
            Errors.error((SubLObject)$ic76$, var74);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22544(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL != var17) {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
            return (SubLObject)NIL;
        }
        final SubLObject var18 = module0202.f12832(var14, (SubLObject)UNPROVIDED);
        if (var18.eql($ic169$)) {
            final SubLObject var19 = module0202.f12834(var14, (SubLObject)UNPROVIDED);
            final SubLObject var20 = module0202.f12835(var14, (SubLObject)UNPROVIDED);
            return module0509.f32466(var19, var20);
        }
        if (var18.eql($ic170$)) {
            final SubLObject var21 = module0202.f12834(var14, (SubLObject)UNPROVIDED);
            final SubLObject var22 = module0202.f12835(var14, (SubLObject)UNPROVIDED);
            return module0509.f32476(var21, var22);
        }
        if (var18.eql($ic171$)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0324.f21954(var18)) {
            return module0328.f22146(var12);
        }
        return Errors.cerror((SubLObject)$ic172$, (SubLObject)$ic173$, var18);
    }
    
    public static SubLObject f22545(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic107$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic107$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic107$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic107$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            return module0480.f31817(var14, var15);
        }
        cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic107$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22546(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic107$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic107$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic107$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic107$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            return module0480.f31816(var14, var15);
        }
        cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic107$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22547(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic107$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic107$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic107$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic107$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL != var17) {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic107$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22548(final SubLObject var12) {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22549(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var17 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic107$);
        var14 = var12.first();
        SubLObject var18 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var18, var12, (SubLObject)$ic107$);
        var15 = var18.first();
        var18 = var18.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var18, var12, (SubLObject)$ic107$);
        var16 = var18.first();
        var18 = var18.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var18, var12, (SubLObject)$ic107$);
        var17 = var18.first();
        var18 = var18.rest();
        if (NIL == var18) {
            SubLObject var19 = (SubLObject)$ic182$;
            SubLObject var20 = (SubLObject)NIL;
            var13.resetMultipleValues();
            final SubLObject var21 = module0279.f18576(var15, var16);
            final SubLObject var22 = var13.secondMultipleValue();
            var13.resetMultipleValues();
            if (NIL != module0202.f12597(var21)) {
                var19 = conses_high.putf(var19, (SubLObject)$ic183$, (SubLObject)T);
            }
            var20 = module0409.f28506(var21, var22, var19);
            return module0035.sublisp_boolean(var20);
        }
        cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic107$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22550(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic107$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic107$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic107$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic107$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            return f22495(var14, var15, (SubLObject)T);
        }
        cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic107$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22495(final SubLObject var79, final SubLObject var73, final SubLObject var553) {
        final SubLThread var554 = SubLProcess.currentSubLThread();
        SubLObject var555 = (SubLObject)$ic184$;
        SubLObject var556 = (SubLObject)NIL;
        var554.resetMultipleValues();
        final SubLObject var557 = module0279.f18576(var79, var73);
        final SubLObject var558 = var554.secondMultipleValue();
        var554.resetMultipleValues();
        if (NIL != var553) {
            var555 = conses_high.putf(var555, (SubLObject)$ic185$, (SubLObject)ONE_INTEGER);
        }
        if (NIL != module0202.f12597(var557)) {
            var555 = conses_high.putf(var555, (SubLObject)$ic183$, (SubLObject)T);
        }
        var556 = module0409.f28506(var557, var558, var555);
        return (NIL != var553) ? var556.first() : var556;
    }
    
    public static SubLObject f22551(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic107$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic107$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic107$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic107$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            SubLObject var18 = f22495(var14, var15, (SubLObject)NIL);
            SubLObject var19 = (SubLObject)NIL;
            if (NIL != module0035.f1997(var18) && NIL != module0035.f1997(module0035.f2113(var18)) && var12.equal(module0035.f2113(module0035.f2113(var18)))) {
                var18 = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0191.f11990((SubLObject)$ic34$, var14, var15, var16)));
            }
            SubLObject var20 = var18;
            SubLObject var21 = (SubLObject)NIL;
            var21 = var20.first();
            while (NIL != var20) {
                SubLObject var8_559;
                final SubLObject var22 = var8_559 = module0528.f32971(var21);
                SubLObject var23 = (SubLObject)NIL;
                var23 = var8_559.first();
                while (NIL != var8_559) {
                    SubLObject var563_564;
                    final SubLObject var561_562 = var563_564 = var23;
                    SubLObject var24 = (SubLObject)NIL;
                    SubLObject var25 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var563_564, var561_562, (SubLObject)$ic186$);
                    var24 = var563_564.first();
                    var563_564 = var563_564.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var563_564, var561_562, (SubLObject)$ic186$);
                    var25 = var563_564.first();
                    var563_564 = var563_564.rest();
                    if (NIL == var563_564) {
                        SubLObject var8_560 = var24;
                        SubLObject var26 = (SubLObject)NIL;
                        var26 = var8_560.first();
                        while (NIL != var8_560) {
                            var19 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var13, var14, var26, var16), var19);
                            var8_560 = var8_560.rest();
                            var26 = var8_560.first();
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var561_562, (SubLObject)$ic186$);
                    }
                    var8_559 = var8_559.rest();
                    var23 = var8_559.first();
                }
                var20 = var20.rest();
                var21 = var20.first();
            }
            return var19;
        }
        cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic107$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22552(final SubLObject var12) {
        Errors.warn((SubLObject)$ic189$, var12);
        return (SubLObject)T;
    }
    
    public static SubLObject f22553(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var17 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var14 = var12.first();
        SubLObject var18 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var18, var12, (SubLObject)$ic33$);
        var15 = var18.first();
        var18 = var18.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var18, var12, (SubLObject)$ic33$);
        var16 = var18.first();
        var18 = var18.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var18, var12, (SubLObject)$ic33$);
        var17 = var18.first();
        var18 = var18.rest();
        if (NIL == var18) {
            var13 = (SubLObject)ConsesLow.list(module0191.f11990((SubLObject)$ic34$, var15, var16, var17));
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        }
        return var13;
    }
    
    public static SubLObject f22554(final SubLObject var12) {
        Errors.warn((SubLObject)$ic190$, var12);
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var13 = var12.first();
        SubLObject var17 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var14 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var12, (SubLObject)$ic33$);
        var16 = var17.first();
        var17 = var17.rest();
        if (NIL == var17) {
            return (SubLObject)ConsesLow.list(var15);
        }
        cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22555(final SubLObject var12) {
        final SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var17 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var14 = var12.first();
        SubLObject var18 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var18, var12, (SubLObject)$ic33$);
        var15 = var18.first();
        var18 = var18.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var18, var12, (SubLObject)$ic33$);
        var16 = var18.first();
        var18 = var18.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var18, var12, (SubLObject)$ic33$);
        var17 = var18.first();
        var18 = var18.rest();
        if (NIL != var18) {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        }
        return var13;
    }
    
    public static SubLObject f22556(final SubLObject var12) {
        final SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var17 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var12, (SubLObject)$ic33$);
        var14 = var12.first();
        SubLObject var18 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var18, var12, (SubLObject)$ic33$);
        var15 = var18.first();
        var18 = var18.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var18, var12, (SubLObject)$ic33$);
        var16 = var18.first();
        var18 = var18.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var18, var12, (SubLObject)$ic33$);
        var17 = var18.first();
        var18 = var18.rest();
        if (NIL != var18) {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic33$);
        }
        return var13;
    }
    
    public static SubLObject f22557() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22416", "S#16711", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22417", "NON-HL-PREDICATE-P", 1, 0, false);
        new $f22417$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22418", "S#24972", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22419", "S#24973", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22420", "S#24974", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22421", "HL-SUPPORT-MODULE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22422", "S#24975", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22423", "S#24976", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22424", "S#24977", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22425", "S#24978", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22426", "S#24979", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22427", "S#14358", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22428", "HL-JUSTIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22429", "HL-JUSTIFY-EXPANDED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22430", "S#24980", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22431", "S#24981", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22433", "S#24982", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22434", "S#14200", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22435", "S#24983", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22432", "S#24984", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22436", "S#24985", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22437", "S#24986", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22438", "S#24727", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22439", "S#24987", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22440", "S#20032", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22441", "S#24988", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22442", "S#24989", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22443", "S#24990", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22444", "S#24991", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22446", "S#24992", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22447", "S#24993", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22448", "S#24994", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22445", "S#24995", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22449", "S#24996", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22450", "S#24997", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22451", "S#24998", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22452", "S#24999", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22453", "S#25000", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22454", "S#25001", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22455", "S#25002", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22456", "S#25003", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22457", "S#25004", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22458", "S#25005", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22459", "S#25006", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22460", "S#25007", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22461", "S#25008", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22462", "S#25009", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22463", "S#25010", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22464", "S#25011", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22465", "S#25012", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22466", "S#25013", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22467", "S#24935", 1, 0, false);
        new $f22467$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22468", "S#25014", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22470", "S#25015", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22471", "S#25016", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22469", "S#25017", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22472", "S#20031", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22474", "S#25018", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22473", "S#25019", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22475", "S#25020", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22476", "S#25021", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22477", "S#25022", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22478", "S#25023", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22479", "S#25024", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22480", "S#25025", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22481", "S#25026", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22483", "S#25027", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22484", "S#25028", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22485", "S#25029", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22482", "S#25030", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22486", "S#25031", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22487", "S#25032", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22488", "S#25033", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22489", "S#25034", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22490", "S#25035", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22491", "S#25036", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22492", "S#25037", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22493", "S#25038", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22494", "S#25039", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22496", "S#25040", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22497", "S#25041", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22498", "S#25042", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22499", "S#25043", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22503", "S#25044", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22507", "S#25045", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22500", "S#25046", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22501", "S#25047", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22502", "S#25048", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22504", "S#25049", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22505", "S#25050", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22506", "S#25051", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22508", "S#25052", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22509", "S#25053", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22510", "S#25054", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22511", "S#25055", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0333", "f22512", "S#25056");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22513", "S#25057", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22514", "S#25058", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22515", "S#25059", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22516", "S#25060", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22517", "S#25061", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22519", "S#25062", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22518", "S#25063", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22520", "S#25064", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22521", "S#25065", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22522", "S#25066", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22524", "S#23549", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22523", "S#25067", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22525", "S#25068", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22526", "S#25069", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22527", "S#25070", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22528", "S#25071", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22529", "S#25072", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22530", "S#25073", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22531", "S#25074", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22532", "S#25075", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22533", "S#25076", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22534", "S#25077", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22535", "S#25078", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22536", "S#25079", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22537", "S#25080", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22538", "S#25081", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22539", "S#25082", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22540", "S#25083", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22541", "S#25084", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22542", "S#25085", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22543", "S#25086", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22544", "S#25087", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22545", "S#25088", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22546", "S#25089", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22547", "S#25090", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22548", "S#25091", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22549", "S#25092", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22550", "S#25093", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22495", "S#25094", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22551", "S#25095", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22552", "S#25096", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22553", "S#25097", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22554", "S#25098", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22555", "S#25099", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0333", "f22556", "S#25100", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22558() {
        $g2849$ = SubLFiles.deflexical("S#25101", (SubLObject)$ic0$);
        $g2850$ = SubLFiles.deflexical("S#25102", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic2$)) ? $g2850$.getGlobalValue() : NIL));
        $g2851$ = SubLFiles.defparameter("S#25103", (SubLObject)$ic3$);
        $g2852$ = SubLFiles.defparameter("S#25104", (SubLObject)NIL);
        $g2853$ = SubLFiles.deflexical("S#25105", (NIL != Symbols.boundp((SubLObject)$ic48$)) ? $g2853$.getGlobalValue() : $ic49$);
        $g2854$ = SubLFiles.deflexical("S#25106", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22559() {
        module0003.f57((SubLObject)$ic2$);
        module0012.f368((SubLObject)$ic4$, (SubLObject)$ic5$, (SubLObject)$ic6$, (SubLObject)NIL, (SubLObject)$ic7$);
        f22422((SubLObject)$ic30$, (SubLObject)$ic32$);
        f22422((SubLObject)$ic34$, (SubLObject)$ic35$);
        f22422((SubLObject)$ic36$, (SubLObject)$ic32$);
        module0003.f57((SubLObject)$ic48$);
        module0132.f8593((SubLObject)$ic48$, (SubLObject)NIL);
        module0034.f1909((SubLObject)$ic50$);
        f22422((SubLObject)$ic53$, (SubLObject)$ic54$);
        f22422((SubLObject)$ic57$, (SubLObject)$ic58$);
        f22422((SubLObject)$ic60$, (SubLObject)$ic61$);
        f22422((SubLObject)$ic64$, (SubLObject)$ic65$);
        f22422((SubLObject)$ic68$, (SubLObject)$ic69$);
        f22422((SubLObject)$ic77$, (SubLObject)$ic78$);
        f22422((SubLObject)$ic45$, (SubLObject)$ic80$);
        module0034.f1895((SubLObject)$ic88$);
        f22422((SubLObject)$ic89$, (SubLObject)$ic90$);
        f22422((SubLObject)$ic99$, (SubLObject)$ic100$);
        f22422((SubLObject)$ic101$, (SubLObject)$ic102$);
        f22422((SubLObject)$ic103$, (SubLObject)$ic104$);
        f22422((SubLObject)$ic108$, (SubLObject)$ic109$);
        f22422((SubLObject)$ic111$, (SubLObject)$ic112$);
        f22422((SubLObject)$ic115$, (SubLObject)$ic116$);
        f22422((SubLObject)$ic117$, (SubLObject)$ic118$);
        f22422((SubLObject)$ic119$, (SubLObject)$ic120$);
        f22422((SubLObject)$ic87$, (SubLObject)$ic123$);
        f22422((SubLObject)$ic125$, (SubLObject)$ic126$);
        f22422(module0191.$g2251$.getGlobalValue(), (SubLObject)$ic127$);
        f22422((SubLObject)$ic129$, (SubLObject)NIL);
        f22422((SubLObject)$ic130$, (SubLObject)NIL);
        f22422((SubLObject)$ic86$, (SubLObject)$ic146$);
        f22422((SubLObject)$ic151$, (SubLObject)$ic152$);
        f22422((SubLObject)$ic156$, (SubLObject)$ic157$);
        f22422((SubLObject)$ic158$, (SubLObject)$ic159$);
        f22422((SubLObject)$ic163$, (SubLObject)$ic164$);
        f22422((SubLObject)$ic167$, (SubLObject)$ic168$);
        f22422((SubLObject)$ic174$, (SubLObject)$ic175$);
        f22422((SubLObject)$ic176$, (SubLObject)$ic177$);
        f22422((SubLObject)$ic178$, (SubLObject)$ic179$);
        f22422((SubLObject)$ic180$, (SubLObject)$ic181$);
        f22422((SubLObject)$ic187$, (SubLObject)$ic188$);
        f22422((SubLObject)$ic191$, (SubLObject)$ic192$);
        module0012.f419((SubLObject)$ic193$);
        module0012.f419((SubLObject)$ic194$);
        f22422((SubLObject)$ic195$, (SubLObject)$ic196$);
        f22422((SubLObject)$ic197$, (SubLObject)$ic198$);
        f22422((SubLObject)$ic199$, (SubLObject)$ic200$);
        f22422((SubLObject)$ic201$, (SubLObject)$ic202$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f22557();
    }
    
    public void initializeVariables() {
        f22558();
    }
    
    public void runTopLevelForms() {
        f22559();
    }
    
    static {
        me = (SubLFile)new module0333();
        $g2849$ = null;
        $g2850$ = null;
        $g2851$ = null;
        $g2852$ = null;
        $g2853$ = null;
        $g2854$ = null;
        $ic0$ = ConsesLow.list(new SubLObject[] { constant_handles_oc.f8479((SubLObject)makeString("isa")), constant_handles_oc.f8479((SubLObject)makeString("quotedIsa")), constant_handles_oc.f8479((SubLObject)makeString("genls")), constant_handles_oc.f8479((SubLObject)makeString("termOfUnit")), constant_handles_oc.f8479((SubLObject)makeString("equals")), constant_handles_oc.f8479((SubLObject)makeString("equalSymbols")), constant_handles_oc.f8479((SubLObject)makeString("different")), constant_handles_oc.f8479((SubLObject)makeString("differentSymbols")), constant_handles_oc.f8479((SubLObject)makeString("evaluate")), constant_handles_oc.f8479((SubLObject)makeString("elementOf")), constant_handles_oc.f8479((SubLObject)makeString("subsetOf")), constant_handles_oc.f8479((SubLObject)makeString("disjointWith")), constant_handles_oc.f8479((SubLObject)makeString("genlMt")), constant_handles_oc.f8479((SubLObject)makeString("genlPreds")), constant_handles_oc.f8479((SubLObject)makeString("genlInverse")), constant_handles_oc.f8479((SubLObject)makeString("negationPreds")), constant_handles_oc.f8479((SubLObject)makeString("negationInverse")), constant_handles_oc.f8479((SubLObject)makeString("conceptuallyRelated")) });
        $ic1$ = makeSymbol("FORT-P");
        $ic2$ = makeSymbol("S#25102", "CYC");
        $ic3$ = ConsesLow.list((SubLObject)makeKeyword("VERIFY"), (SubLObject)makeKeyword("JUSTIFY"), (SubLObject)makeKeyword("VALIDATE"), (SubLObject)makeKeyword("FORWARD-MT-COMBOS"));
        $ic4$ = makeSymbol("HL-SUPPORT-MODULE-P");
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("OBJECT", "CYC"));
        $ic6$ = makeString("Return T iff OBJECT is an HL support module.");
        $ic7$ = ConsesLow.list((SubLObject)makeSymbol("BOOLEANP"));
        $ic8$ = makeSymbol("KEYWORDP");
        $ic9$ = makeString("~S was not a valid hl-support-module indicator");
        $ic10$ = makeKeyword("VERIFY");
        $ic11$ = makeKeyword("JUSTIFY");
        $ic12$ = makeKeyword("VALIDATE");
        $ic13$ = makeKeyword("FORWARD-MT-COMBOS");
        $ic14$ = makeSymbol("LIST");
        $ic15$ = makeSymbol("SUPPORT-P");
        $ic16$ = makeSymbol("S#14254", "CYC");
        $ic17$ = makeSymbol("APPEND");
        $ic18$ = makeSymbol("TRUE");
        $ic19$ = makeSymbol("ASSERTION-P");
        $ic20$ = makeSymbol("S#11995", "CYC");
        $ic21$ = makeSymbol("ASSERTED-ASSERTION?");
        $ic22$ = makeSymbol("S#12747", "CYC");
        $ic23$ = makeSymbol("<");
        $ic24$ = makeSymbol("S#14169", "CYC");
        $ic25$ = makeSymbol("HL-SUPPORT-P");
        $ic26$ = makeSymbol("VALID-SUPPORT?", "CYC");
        $ic27$ = makeString("Throwing out HL justification ~S~%  with invalid support ~S");
        $ic28$ = makeSymbol("ASSERTION-ID");
        $ic29$ = constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"));
        $ic30$ = makeKeyword("CODE");
        $ic31$ = makeSymbol("S#14353", "CYC");
        $ic32$ = ConsesLow.list((SubLObject)makeKeyword("VERIFY"), (SubLObject)makeSymbol("TRUE"));
        $ic33$ = ConsesLow.list((SubLObject)makeSymbol("S#14781", "CYC"), (SubLObject)makeSymbol("S#12398", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#10995", "CYC"));
        $ic34$ = makeKeyword("OPAQUE");
        $ic35$ = ConsesLow.list((SubLObject)makeKeyword("VERIFY"), (SubLObject)makeSymbol("S#24988", "CYC"));
        $ic36$ = makeKeyword("ABDUCTION");
        $ic37$ = makeKeyword("FALSE");
        $ic38$ = makeKeyword("TRUE");
        $ic39$ = makeKeyword("UNKNOWN");
        $ic40$ = constant_handles_oc.f8479((SubLObject)makeString("myCreator"));
        $ic41$ = constant_handles_oc.f8479((SubLObject)makeString("myCreationPurpose"));
        $ic42$ = constant_handles_oc.f8479((SubLObject)makeString("myCreationTime"));
        $ic43$ = constant_handles_oc.f8479((SubLObject)makeString("myCreationSecond"));
        $ic44$ = constant_handles_oc.f8479((SubLObject)makeString("different"));
        $ic45$ = makeKeyword("EVAL");
        $ic46$ = constant_handles_oc.f8479((SubLObject)makeString("BookkeepingMt"));
        $ic47$ = constant_handles_oc.f8479((SubLObject)makeString("unknownSentence"));
        $ic48$ = makeSymbol("S#25105", "CYC");
        $ic49$ = constant_handles_oc.f8479((SubLObject)makeString("BaseKB"));
        $ic50$ = makeSymbol("S#24995", "CYC");
        $ic51$ = makeSymbol("S#25106", "CYC");
        $ic52$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic53$ = makeKeyword("BOOKKEEPING");
        $ic54$ = ConsesLow.list((SubLObject)makeKeyword("VERIFY"), (SubLObject)makeSymbol("S#24990", "CYC"), (SubLObject)makeKeyword("JUSTIFY"), (SubLObject)makeSymbol("S#24991", "CYC"), (SubLObject)makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)makeSymbol("S#24996", "CYC"));
        $ic55$ = ConsesLow.list((SubLObject)makeSymbol("OBJECT", "CYC"), (SubLObject)makeSymbol("S#12458", "CYC"));
        $ic56$ = constant_handles_oc.f8479((SubLObject)makeString("quotedIsa"));
        $ic57$ = makeKeyword("DEFN");
        $ic58$ = ConsesLow.list((SubLObject)makeKeyword("VERIFY"), (SubLObject)makeSymbol("S#24997", "CYC"), (SubLObject)makeKeyword("JUSTIFY"), (SubLObject)makeSymbol("S#24998", "CYC"), (SubLObject)makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)makeSymbol("S#24999", "CYC"));
        $ic59$ = ConsesLow.list((SubLObject)makeSymbol("S#7306", "CYC"), (SubLObject)ConsesLow.cons((SubLObject)makeSymbol("S#25107", "CYC"), (SubLObject)makeSymbol("S#105", "CYC")));
        $ic60$ = makeKeyword("ELEMENTOF");
        $ic61$ = ConsesLow.list((SubLObject)makeKeyword("VERIFY"), (SubLObject)makeSymbol("S#25000", "CYC"), (SubLObject)makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)makeSymbol("S#25001", "CYC"));
        $ic62$ = constant_handles_oc.f8479((SubLObject)makeString("TheSet"));
        $ic63$ = constant_handles_oc.f8479((SubLObject)makeString("TheSetOf"));
        $ic64$ = makeKeyword("SUBSETOF");
        $ic65$ = ConsesLow.list((SubLObject)makeKeyword("VERIFY"), (SubLObject)makeSymbol("S#25002", "CYC"), (SubLObject)makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)makeSymbol("S#25003", "CYC"));
        $ic66$ = ConsesLow.list((SubLObject)makeSymbol("S#25108", "CYC"), (SubLObject)makeSymbol("S#25109", "CYC"));
        $ic67$ = makeKeyword("ASSERTION");
        $ic68$ = makeKeyword("SIBLING-DISJOINT");
        $ic69$ = ConsesLow.list((SubLObject)makeKeyword("VERIFY"), (SubLObject)makeSymbol("S#25004", "CYC"), (SubLObject)makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)makeSymbol("S#25006", "CYC"), (SubLObject)makeKeyword("JUSTIFY"), (SubLObject)makeSymbol("S#25005", "CYC"));
        $ic70$ = constant_handles_oc.f8479((SubLObject)makeString("equalSymbols"));
        $ic71$ = constant_handles_oc.f8479((SubLObject)makeString("equals"));
        $ic72$ = makeKeyword("NONE");
        $ic73$ = makeKeyword("MINIMAL");
        $ic74$ = makeKeyword("ARG-TYPE");
        $ic75$ = makeKeyword("ALL");
        $ic76$ = makeString("Unexpected intermediate step validation level ~s");
        $ic77$ = makeKeyword("EQUALITY");
        $ic78$ = ConsesLow.list((SubLObject)makeKeyword("VERIFY"), (SubLObject)makeSymbol("S#25007", "CYC"), (SubLObject)makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)makeSymbol("S#25008", "CYC"), (SubLObject)makeKeyword("VALIDATE"), (SubLObject)makeSymbol("S#25009", "CYC"), (SubLObject)makeKeyword("JUSTIFY"), (SubLObject)makeSymbol("S#25012", "CYC"));
        $ic79$ = constant_handles_oc.f8479((SubLObject)makeString("evaluate"));
        $ic80$ = ConsesLow.list((SubLObject)makeKeyword("VERIFY"), (SubLObject)makeSymbol("S#25013", "CYC"), (SubLObject)makeKeyword("JUSTIFY"), (SubLObject)makeSymbol("S#24935", "CYC"));
        $ic81$ = ConsesLow.list((SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#750", "CYC"), (SubLObject)makeSymbol("S#751", "CYC"));
        $ic82$ = constant_handles_oc.f8479((SubLObject)makeString("IrreflexiveBinaryPredicate"));
        $ic83$ = constant_handles_oc.f8479((SubLObject)makeString("ReflexiveBinaryPredicate"));
        $ic84$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic85$ = constant_handles_oc.f8479((SubLObject)makeString("admittedArgument"));
        $ic86$ = makeKeyword("ISA");
        $ic87$ = makeKeyword("ADMIT");
        $ic88$ = makeSymbol("S#25019", "CYC");
        $ic89$ = makeKeyword("REFLEXIVE");
        $ic90$ = ConsesLow.list((SubLObject)makeKeyword("VERIFY"), (SubLObject)makeSymbol("S#25014", "CYC"), (SubLObject)makeKeyword("JUSTIFY"), (SubLObject)makeSymbol("S#25015", "CYC"), (SubLObject)makeKeyword("VALIDATE"), (SubLObject)makeSymbol("S#25020", "CYC"), (SubLObject)makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)makeSymbol("S#25016", "CYC"));
        $ic91$ = ConsesLow.list((SubLObject)makeSymbol("S#750", "CYC"), (SubLObject)makeSymbol("S#751", "CYC"));
        $ic92$ = ConsesLow.list((SubLObject)makeSymbol("S#717", "CYC"), (SubLObject)makeSymbol("S#750", "CYC"), (SubLObject)makeSymbol("S#751", "CYC"));
        $ic93$ = makeSymbol("S#12274", "CYC");
        $ic94$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic95$ = constant_handles_oc.f8479((SubLObject)makeString("reflexiveOn"));
        $ic96$ = makeKeyword("GAF");
        $ic97$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#25110", "CYC"), (SubLObject)makeSymbol("S#12455", "CYC"));
        $ic98$ = makeSymbol("S#3846", "CYC");
        $ic99$ = makeKeyword("REFLEXIVE-ON");
        $ic100$ = ConsesLow.list((SubLObject)makeKeyword("VERIFY"), (SubLObject)makeSymbol("S#25021", "CYC"), (SubLObject)makeKeyword("JUSTIFY"), (SubLObject)makeSymbol("S#25022", "CYC"), (SubLObject)makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)makeSymbol("S#25023", "CYC"));
        $ic101$ = makeKeyword("TRANSITIVITY");
        $ic102$ = ConsesLow.list((SubLObject)makeKeyword("VERIFY"), (SubLObject)makeSymbol("S#25025", "CYC"), (SubLObject)makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)makeSymbol("S#25026", "CYC"), (SubLObject)makeKeyword("JUSTIFY"), (SubLObject)makeSymbol("S#25027", "CYC"));
        $ic103$ = makeKeyword("CONTEXTUAL-TRANSITIVITY");
        $ic104$ = ConsesLow.list((SubLObject)makeKeyword("VERIFY"), (SubLObject)makeSymbol("S#25028", "CYC"), (SubLObject)makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)makeSymbol("S#25026", "CYC"), (SubLObject)makeKeyword("JUSTIFY"), (SubLObject)makeSymbol("S#25029", "CYC"));
        $ic105$ = makeKeyword("TRUE-DEF");
        $ic106$ = makeSymbol("S#12275", "CYC");
        $ic107$ = ConsesLow.list((SubLObject)makeSymbol("S#14781", "CYC"), (SubLObject)makeSymbol("S#13100", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#10995", "CYC"));
        $ic108$ = makeKeyword("TVA");
        $ic109$ = ConsesLow.list((SubLObject)makeKeyword("VERIFY"), (SubLObject)makeSymbol("S#25031", "CYC"), (SubLObject)makeKeyword("JUSTIFY"), (SubLObject)makeSymbol("S#25032", "CYC"), (SubLObject)makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)makeSymbol("S#25033", "CYC"));
        $ic110$ = ConsesLow.list((SubLObject)makeSymbol("S#14781", "CYC"), (SubLObject)makeSymbol("S#13100", "CYC"), (SubLObject)makeSymbol("SUPPORT-MT"), (SubLObject)makeSymbol("S#10995", "CYC"));
        $ic111$ = makeKeyword("RTV");
        $ic112$ = ConsesLow.list((SubLObject)makeKeyword("VERIFY"), (SubLObject)makeSymbol("S#25034", "CYC"), (SubLObject)makeKeyword("JUSTIFY"), (SubLObject)makeSymbol("S#25035", "CYC"), (SubLObject)makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)makeSymbol("S#25036", "CYC"));
        $ic113$ = ConsesLow.list((SubLObject)makeSymbol("S#14781", "CYC"), (SubLObject)makeSymbol("S#6061", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#10995", "CYC"));
        $ic114$ = constant_handles_oc.f8479((SubLObject)makeString("not"));
        $ic115$ = makeKeyword("MINIMIZE");
        $ic116$ = ConsesLow.list((SubLObject)makeKeyword("VERIFY"), (SubLObject)makeSymbol("S#25037", "CYC"));
        $ic117$ = makeKeyword("CONSISTENT");
        $ic118$ = ConsesLow.list((SubLObject)makeKeyword("VERIFY"), (SubLObject)makeSymbol("S#25038", "CYC"), (SubLObject)makeKeyword("JUSTIFY"), (SubLObject)makeSymbol("S#25039", "CYC"));
        $ic119$ = makeKeyword("CONCEPTUALLY-RELATED");
        $ic120$ = ConsesLow.list((SubLObject)makeKeyword("VERIFY"), (SubLObject)makeSymbol("S#25040", "CYC"), (SubLObject)makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)makeSymbol("S#25042", "CYC"), (SubLObject)makeKeyword("JUSTIFY"), (SubLObject)makeSymbol("S#25041", "CYC"));
        $ic121$ = constant_handles_oc.f8479((SubLObject)makeString("admittedSentence"));
        $ic122$ = constant_handles_oc.f8479((SubLObject)makeString("admittedNAT"));
        $ic123$ = ConsesLow.list((SubLObject)makeKeyword("VERIFY"), (SubLObject)makeSymbol("S#25043", "CYC"), (SubLObject)makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)makeSymbol("S#25044", "CYC"), (SubLObject)makeKeyword("JUSTIFY"), (SubLObject)makeSymbol("S#25045", "CYC"));
        $ic124$ = ConsesLow.list((SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("S#15200", "CYC"), (SubLObject)makeSymbol("S#17572", "CYC"));
        $ic125$ = makeKeyword("REFORMULATE");
        $ic126$ = ConsesLow.list((SubLObject)makeKeyword("JUSTIFY"), (SubLObject)makeSymbol("S#25052", "CYC"));
        $ic127$ = ConsesLow.list((SubLObject)makeKeyword("VERIFY"), (SubLObject)makeSymbol("S#25054", "CYC"), (SubLObject)makeKeyword("JUSTIFY"), (SubLObject)makeSymbol("S#25053", "CYC"), (SubLObject)makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)makeSymbol("S#25055", "CYC"));
        $ic128$ = ConsesLow.list((SubLObject)makeSymbol("S#14781", "CYC"), (SubLObject)makeSymbol("S#25111", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#10995", "CYC"));
        $ic129$ = makeKeyword("EXTERNAL");
        $ic130$ = makeKeyword("EXTERNAL-EVAL");
        $ic131$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#25112", "CYC"), (SubLObject)makeSymbol("S#15354", "CYC"), (SubLObject)makeSymbol("S#12398", "CYC"), (SubLObject)makeSymbol("S#10995", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic132$ = makeSymbol("PCOND");
        $ic133$ = makeSymbol("S#13439", "CYC");
        $ic134$ = makeSymbol("CLET");
        $ic135$ = makeSymbol("S#13440", "CYC");
        $ic136$ = ConsesLow.list((SubLObject)makeKeyword("REGULARIZE"));
        $ic137$ = makeSymbol("S#10620", "CYC");
        $ic138$ = makeSymbol("S#12753", "CYC");
        $ic139$ = makeKeyword("REGULARIZE");
        $ic140$ = ConsesLow.list((SubLObject)makeKeyword("ISA"), (SubLObject)makeKeyword("GENLS"));
        $ic141$ = makeKeyword("TRUE-MON");
        $ic142$ = constant_handles_oc.f8479((SubLObject)makeString("nearestIsa"));
        $ic143$ = constant_handles_oc.f8479((SubLObject)makeString("nearestIsaOfType"));
        $ic144$ = constant_handles_oc.f8479((SubLObject)makeString("elementOf"));
        $ic145$ = ConsesLow.list((SubLObject)makeSymbol("S#750", "CYC"), (SubLObject)makeSymbol("S#751", "CYC"), (SubLObject)makeSymbol("S#6053", "CYC"));
        $ic146$ = ConsesLow.list((SubLObject)makeKeyword("VERIFY"), (SubLObject)makeSymbol("S#25060", "CYC"), (SubLObject)makeKeyword("JUSTIFY"), (SubLObject)makeSymbol("S#25061", "CYC"), (SubLObject)makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)makeSymbol("S#25062", "CYC"));
        $ic147$ = ConsesLow.list((SubLObject)makeSymbol("S#12459", "CYC"), (SubLObject)makeSymbol("S#10995", "CYC"));
        $ic148$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("disjointWith")));
        $ic149$ = constant_handles_oc.f8479((SubLObject)makeString("nearestGenls"));
        $ic150$ = constant_handles_oc.f8479((SubLObject)makeString("nearestGenlsOfType"));
        $ic151$ = makeKeyword("GENLS");
        $ic152$ = ConsesLow.list((SubLObject)makeKeyword("VERIFY"), (SubLObject)makeSymbol("S#25068", "CYC"), (SubLObject)makeKeyword("JUSTIFY"), (SubLObject)makeSymbol("S#25069", "CYC"), (SubLObject)makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)makeSymbol("S#25070", "CYC"));
        $ic153$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic154$ = constant_handles_oc.f8479((SubLObject)makeString("instancesOfDisjointCollections"));
        $ic155$ = ConsesLow.list((SubLObject)makeSymbol("S#25113", "CYC"), (SubLObject)makeSymbol("S#25114", "CYC"));
        $ic156$ = makeKeyword("DISJOINTWITH");
        $ic157$ = ConsesLow.list((SubLObject)makeKeyword("VERIFY"), (SubLObject)makeSymbol("S#25072", "CYC"), (SubLObject)makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)makeSymbol("S#25074", "CYC"), (SubLObject)makeKeyword("JUSTIFY"), (SubLObject)makeSymbol("S#25073", "CYC"));
        $ic158$ = makeKeyword("GENLMT");
        $ic159$ = ConsesLow.list((SubLObject)makeKeyword("VERIFY"), (SubLObject)makeSymbol("S#25075", "CYC"), (SubLObject)makeKeyword("JUSTIFY"), (SubLObject)makeSymbol("S#25076", "CYC"), (SubLObject)makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)makeSymbol("S#25077", "CYC"));
        $ic160$ = ConsesLow.list((SubLObject)makeSymbol("S#717", "CYC"), (SubLObject)makeSymbol("S#12109", "CYC"), (SubLObject)makeSymbol("S#12112", "CYC"));
        $ic161$ = constant_handles_oc.f8479((SubLObject)makeString("genlPreds"));
        $ic162$ = constant_handles_oc.f8479((SubLObject)makeString("genlInverse"));
        $ic163$ = makeKeyword("GENLPREDS");
        $ic164$ = ConsesLow.list((SubLObject)makeKeyword("VERIFY"), (SubLObject)makeSymbol("S#25078", "CYC"), (SubLObject)makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)makeSymbol("S#25080", "CYC"), (SubLObject)makeKeyword("JUSTIFY"), (SubLObject)makeSymbol("S#25079", "CYC"));
        $ic165$ = constant_handles_oc.f8479((SubLObject)makeString("negationPreds"));
        $ic166$ = constant_handles_oc.f8479((SubLObject)makeString("negationInverse"));
        $ic167$ = makeKeyword("NEGATIONPREDS");
        $ic168$ = ConsesLow.list((SubLObject)makeKeyword("VERIFY"), (SubLObject)makeSymbol("S#25081", "CYC"), (SubLObject)makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)makeSymbol("S#25083", "CYC"), (SubLObject)makeKeyword("JUSTIFY"), (SubLObject)makeSymbol("S#25082", "CYC"));
        $ic169$ = constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes-TypeType"));
        $ic170$ = constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes-InsType"));
        $ic171$ = constant_handles_oc.f8479((SubLObject)makeString("duration"));
        $ic172$ = makeString("Continue anyway.");
        $ic173$ = makeString("Unsupported predicate, ~a, for :TIME module");
        $ic174$ = makeKeyword("TIME");
        $ic175$ = ConsesLow.list((SubLObject)makeKeyword("VERIFY"), (SubLObject)makeSymbol("S#25084", "CYC"), (SubLObject)makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)makeSymbol("S#25085", "CYC"), (SubLObject)makeKeyword("VALIDATE"), (SubLObject)makeSymbol("S#25086", "CYC"), (SubLObject)makeKeyword("JUSTIFY"), (SubLObject)makeSymbol("S#25087", "CYC"));
        $ic176$ = makeKeyword("ASSERTED-ARG1-BINARY-PREDS");
        $ic177$ = ConsesLow.list((SubLObject)makeKeyword("VERIFY"), (SubLObject)makeSymbol("S#25088", "CYC"), (SubLObject)makeKeyword("JUSTIFY"), (SubLObject)makeSymbol("S#25089", "CYC"), (SubLObject)makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)NIL);
        $ic178$ = makeKeyword("FCP");
        $ic179$ = ConsesLow.list((SubLObject)makeKeyword("VERIFY"), (SubLObject)makeSymbol("S#25115", "CYC"), (SubLObject)makeKeyword("JUSTIFY"), (SubLObject)makeSymbol("S#25116", "CYC"), (SubLObject)makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)NIL);
        $ic180$ = makeKeyword("SHOP-EFFECT");
        $ic181$ = ConsesLow.list((SubLObject)makeKeyword("VERIFY"), (SubLObject)makeSymbol("S#25090", "CYC"), (SubLObject)makeKeyword("JUSTIFY"), (SubLObject)makeSymbol("S#25091", "CYC"), (SubLObject)makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)NIL);
        $ic182$ = ConsesLow.list((SubLObject)makeKeyword("MAX-NUMBER"), (SubLObject)ONE_INTEGER, (SubLObject)makeKeyword("ANSWER-LANGUAGE"), (SubLObject)makeKeyword("HL"), (SubLObject)makeKeyword("RETURN"), (SubLObject)makeKeyword("BINDINGS"), (SubLObject)makeKeyword("RESULT-UNIQUENESS"), (SubLObject)makeKeyword("BINDINGS"));
        $ic183$ = makeKeyword("CONDITIONAL-SENTENCE?");
        $ic184$ = ConsesLow.list((SubLObject)makeKeyword("ANSWER-LANGUAGE"), (SubLObject)makeKeyword("HL"), (SubLObject)makeKeyword("RETURN"), (SubLObject)makeKeyword("SUPPORTS"), (SubLObject)makeKeyword("RESULT-UNIQUENESS"), (SubLObject)makeKeyword("PROOF"));
        $ic185$ = makeKeyword("MAX-NUMBER");
        $ic186$ = ConsesLow.list((SubLObject)makeSymbol("S#25117", "CYC"), (SubLObject)makeSymbol("S#25118", "CYC"));
        $ic187$ = makeKeyword("QUERY");
        $ic188$ = ConsesLow.list((SubLObject)makeKeyword("VERIFY"), (SubLObject)makeSymbol("S#25092", "CYC"), (SubLObject)makeKeyword("JUSTIFY"), (SubLObject)makeSymbol("S#25093", "CYC"), (SubLObject)makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)makeSymbol("S#25095", "CYC"));
        $ic189$ = makeString("Halo feature not supported. Support unverifiable: ~a~%");
        $ic190$ = makeString("Halo feature not supported. Support-mts not computable: ~a~%");
        $ic191$ = makeKeyword("MATRIX-OF-REACTION-TYPE");
        $ic192$ = ConsesLow.list((SubLObject)makeKeyword("VERIFY"), (SubLObject)makeSymbol("S#25096", "CYC"), (SubLObject)makeKeyword("JUSTIFY"), (SubLObject)makeSymbol("S#25097", "CYC"), (SubLObject)makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)makeSymbol("S#25098", "CYC"));
        $ic193$ = makeSymbol("S#25099", "CYC");
        $ic194$ = makeSymbol("S#25100", "CYC");
        $ic195$ = makeKeyword("PARSE-TREE");
        $ic196$ = ConsesLow.list((SubLObject)makeKeyword("VERIFY"), (SubLObject)makeSymbol("S#25099", "CYC"), (SubLObject)makeKeyword("JUSTIFY"), (SubLObject)makeSymbol("S#25100", "CYC"));
        $ic197$ = makeKeyword("WORD-STRINGS");
        $ic198$ = ConsesLow.list((SubLObject)makeKeyword("VERIFY"), (SubLObject)makeSymbol("S#25119", "CYC"), (SubLObject)makeKeyword("JUSTIFY"), (SubLObject)makeSymbol("S#25120", "CYC"), (SubLObject)makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)makeSymbol("S#25121", "CYC"));
        $ic199$ = makeKeyword("TERM-PHRASES");
        $ic200$ = ConsesLow.list((SubLObject)makeKeyword("VERIFY"), (SubLObject)makeSymbol("S#25122", "CYC"), (SubLObject)makeKeyword("JUSTIFY"), (SubLObject)makeSymbol("S#25123", "CYC"), (SubLObject)makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)makeSymbol("S#25124", "CYC"));
        $ic201$ = makeKeyword("RKF-IRRELEVANT-FORT-CACHE");
        $ic202$ = ConsesLow.list((SubLObject)makeKeyword("VERIFY"), (SubLObject)makeSymbol("S#25125", "CYC"), (SubLObject)makeKeyword("JUSTIFY"), (SubLObject)makeSymbol("S#25126", "CYC"), (SubLObject)makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)makeSymbol("S#25127", "CYC"));
    }
    
    public static final class $f22417$UnaryFunction extends UnaryFunction
    {
        public $f22417$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("NON-HL-PREDICATE-P"));
        }
        
        public SubLObject processItem(final SubLObject var2) {
            return f22417(var2);
        }
    }
    
    public static final class $f22467$UnaryFunction extends UnaryFunction
    {
        public $f22467$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#24935"));
        }
        
        public SubLObject processItem(final SubLObject var2) {
            return f22467(var2);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 1477 ms
	
	Decompiled with Procyon 0.5.32.
*/