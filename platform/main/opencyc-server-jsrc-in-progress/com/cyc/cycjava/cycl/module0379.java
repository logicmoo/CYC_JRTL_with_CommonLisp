package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
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

public final class module0379 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0379";
    public static final String myFingerPrint = "77825cd813ac9a5fbe5754c2aa97ab1e580af75b2b79bd1d4f86ce2e27450bd0";
    public static SubLSymbol $g3207$;
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
    private static final SubLString $ic18$;
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
    private static final SubLString $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLString $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLList $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    
    
    public static SubLObject f26907(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26908(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX30079_native.class) ? T : NIL);
    }
    
    public static SubLObject f26909(final SubLObject var1) {
        assert NIL != f26908(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f26910(final SubLObject var1) {
        assert NIL != f26908(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f26911(final SubLObject var1) {
        assert NIL != f26908(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f26912(final SubLObject var1, final SubLObject var4) {
        assert NIL != f26908(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f26913(final SubLObject var1, final SubLObject var4) {
        assert NIL != f26908(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f26914(final SubLObject var1, final SubLObject var4) {
        assert NIL != f26908(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f26915(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX30079_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic15$)) {
                f26912(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic16$)) {
                f26913(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic17$)) {
                f26914(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic18$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f26916(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic19$, (SubLObject)$ic20$, (SubLObject)THREE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic21$, (SubLObject)$ic15$, f26909(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic21$, (SubLObject)$ic16$, f26910(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic21$, (SubLObject)$ic17$, f26911(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic22$, (SubLObject)$ic20$, (SubLObject)THREE_INTEGER);
        return var11;
    }
    
    public static SubLObject f26917(final SubLObject var11, final SubLObject var12) {
        return f26916(var11, var12);
    }
    
    public static SubLObject f26918(final SubLObject var13, final SubLObject var14, final SubLObject var15, final SubLObject var16) {
        assert NIL != module0363.f24478(var13) : var13;
        if (NIL != var14 && !areAssertionsDisabledFor(me) && NIL == module0364.f24774(var14)) {
            throw new AssertionError(var14);
        }
        assert NIL != module0340.f22789(var15) : var15;
        final SubLObject var17 = f26919(var13, var15, var16);
        if (NIL != var14) {
            module0364.f24783(var14, var17);
        }
        module0364.f24775(var17);
        module0373.f26334(var17);
        return var17;
    }
    
    public static SubLObject f26919(final SubLObject var18, final SubLObject var15, final SubLObject var16) {
        final SubLObject var19 = module0364.f24729((SubLObject)$ic27$, var18);
        f26920(var19);
        f26921(var19, var15);
        f26922(var19, (SubLObject)$ic28$);
        f26923(var19, var16);
        return var19;
    }
    
    public static SubLObject f26920(final SubLObject var17) {
        final SubLObject var18 = f26915((SubLObject)UNPROVIDED);
        module0364.f24744(var17, var18);
        return var17;
    }
    
    public static SubLObject f26924(final SubLObject var17) {
        final SubLObject var18 = module0364.f24742(var17);
        f26912(var18, (SubLObject)$ic29$);
        f26913(var18, (SubLObject)$ic29$);
        f26914(var18, (SubLObject)$ic29$);
        return var17;
    }
    
    public static SubLObject f26925(final SubLObject var17) {
        assert NIL != f26926(var17) : var17;
        final SubLObject var18 = module0364.f24742(var17);
        return f26909(var18);
    }
    
    public static SubLObject f26927(final SubLObject var17) {
        assert NIL != f26926(var17) : var17;
        final SubLObject var18 = module0364.f24742(var17);
        SubLObject var19 = f26910(var18);
        if (var19 == $ic28$) {
            var19 = f26928(var17);
            f26913(var18, var19);
        }
        return var19;
    }
    
    public static SubLObject f26929(final SubLObject var17) {
        assert NIL != f26926(var17) : var17;
        final SubLObject var18 = module0364.f24742(var17);
        return f26911(var18);
    }
    
    public static SubLObject f26921(final SubLObject var17, final SubLObject var15) {
        assert NIL != f26926(var17) : var17;
        assert NIL != module0340.f22789(var15) : var15;
        final SubLObject var18 = module0364.f24742(var17);
        f26912(var18, var15);
        return var17;
    }
    
    public static SubLObject f26922(final SubLObject var17, final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        assert NIL != f26926(var17) : var17;
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var21) && NIL == module0233.f15350(var20) && var20 != $ic28$) {
            Errors.error((SubLObject)$ic31$, var20);
        }
        final SubLObject var22 = module0364.f24742(var17);
        f26913(var22, var20);
        return var17;
    }
    
    public static SubLObject f26923(final SubLObject var17, final SubLObject var16) {
        assert NIL != f26926(var17) : var17;
        assert NIL != module0191.f11993(var16) : var16;
        final SubLObject var18 = module0364.f24742(var17);
        f26914(var18, var16);
        return var17;
    }
    
    public static SubLObject f26930(final SubLObject var17) {
        final SubLObject var18 = module0364.f24725(var17);
        final SubLObject var19 = f26925(var17);
        SubLObject var20 = module0363.f24517(var18);
        SubLObject var21 = (SubLObject)NIL;
        var21 = var20.first();
        while (NIL != var20) {
            if (NIL != module0363.f24524(var21, (SubLObject)$ic27$) && var19.eql(module0365.f24865(var21))) {
                return var21;
            }
            var20 = var20.rest();
            var21 = var20.first();
        }
        if (NIL == module0363.f24685(var18)) {
            return Errors.error((SubLObject)$ic33$, var17);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26931(final SubLObject var17) {
        return module0364.f24753(var17);
    }
    
    public static SubLObject f26932(final SubLObject var17) {
        final SubLObject var18 = f26931(var17);
        if (NIL != var18) {
            return module0364.f24737(var18);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26933(final SubLObject var17) {
        final SubLObject var18 = module0364.f24725(var17);
        return module0363.f24565(var18);
    }
    
    public static SubLObject f26926(final SubLObject var24) {
        return (SubLObject)makeBoolean(NIL != module0364.f24699(var24) && $ic27$ == module0364.f24721(var24));
    }
    
    public static SubLObject f26934(final SubLObject var25) {
        return (SubLObject)makeBoolean(NIL != module0365.f24819(var25) && $ic27$ == module0365.f24866(var25));
    }
    
    public static SubLObject f26935(final SubLObject var25) {
        return module0340.f22988(module0365.f24865(var25));
    }
    
    public static SubLObject f26936(final SubLObject var24) {
        return (SubLObject)makeBoolean(NIL != module0366.f24916(var24) && NIL != f26926(module0366.f24937(var24)));
    }
    
    public static SubLObject f26937(final SubLObject var18, final SubLObject var26, final SubLObject var27, SubLObject var28) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        final SubLThread var29 = SubLProcess.currentSubLThread();
        SubLObject var30 = (SubLObject)NIL;
        SubLObject var31 = (SubLObject)NIL;
        SubLObject var32;
        SubLObject var33;
        SubLObject var34;
        SubLObject var35;
        SubLObject var34_35;
        SubLObject var36_37;
        SubLObject var38_39;
        SubLObject var36;
        SubLObject var37;
        SubLObject var38;
        SubLObject var39;
        SubLObject var40;
        for (var32 = (SubLObject)NIL, var33 = (SubLObject)NIL, var33 = module0340.f22985(); NIL == var32 && NIL != var33; var33 = var33.rest()) {
            var34 = var33.first();
            if (NIL != module0340.f22910(var34, var28) && (NIL == var31 || NIL == conses_high.member(var34, var31, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) && NIL != module0340.f22850(var34, var27) && NIL != module0376.f26671(var34, var26)) {
                var35 = module0340.f22882(var34);
                if (NIL == var35 || (var35.isFunctionSpec() && NIL != Functions.funcall(var35, var26))) {
                    if (NIL != var35) {
                        var29.resetMultipleValues();
                        var34_35 = module0376.f26627(var34, var30, var31);
                        var36_37 = var29.secondMultipleValue();
                        var38_39 = var29.thirdMultipleValue();
                        var29.resetMultipleValues();
                        var32 = var34_35;
                        var30 = var36_37;
                        var31 = var38_39;
                    }
                    var36 = module0340.f22857(var34);
                    if (NIL == var36 || (var36.isFunctionSpec() && NIL != Functions.funcall(var36, var26))) {
                        var37 = module0340.f22865(var34, var26);
                        if (NIL != var37) {
                            var38 = module0360.f23935(var37);
                            var39 = module0340.f22906(var34, var26, (SubLObject)$ic34$);
                            var40 = (SubLObject)ConsesLow.list(var34, var38, var39);
                            var30 = (SubLObject)ConsesLow.cons(var40, var30);
                            f26938(var18, var34, var38, var39);
                        }
                    }
                }
            }
        }
        return var30;
    }
    
    public static SubLObject f26939(final SubLObject var25) {
        return (SubLObject)makeBoolean(NIL != f26934(var25) && NIL != module0373.f26144(var25));
    }
    
    public static SubLObject f26940(final SubLObject var13, final SubLObject var14, final SubLObject var25, final SubLObject var16) {
        final SubLObject var26 = module0365.f24865(var25);
        final SubLObject var27 = f26918(var13, var14, var26, var16);
        module0367.f25238(module0364.f24736(var14));
        return var27;
    }
    
    public static SubLObject f26938(final SubLObject var18, final SubLObject var45, final SubLObject var42, final SubLObject var43) {
        final SubLObject var46 = module0365.f24854(var18, var45, (SubLObject)UNPROVIDED);
        module0365.f24874(var46, var42, (SubLObject)UNPROVIDED);
        module0365.f24872(var46, var43);
        final SubLObject var47 = module0363.f24507(var18);
        final SubLObject var48 = module0361.f24123(var47);
        if (NIL == module0065.f4772(var48, (SubLObject)$ic35$)) {
            final SubLObject var49_50 = var48;
            if (NIL == module0065.f4775(var49_50, (SubLObject)$ic35$)) {
                final SubLObject var49 = module0065.f4740(var49_50);
                final SubLObject var50 = (SubLObject)NIL;
                SubLObject var51;
                SubLObject var52;
                SubLObject var53;
                SubLObject var54;
                SubLObject var55;
                SubLObject var56;
                SubLObject var57;
                SubLObject var58;
                SubLObject var59;
                for (var51 = Sequences.length(var49), var52 = (SubLObject)NIL, var52 = (SubLObject)ZERO_INTEGER; var52.numL(var51); var52 = Numbers.add(var52, (SubLObject)ONE_INTEGER)) {
                    var53 = ((NIL != var50) ? Numbers.subtract(var51, var52, (SubLObject)ONE_INTEGER) : var52);
                    var54 = Vectors.aref(var49, var53);
                    if (NIL == module0065.f4749(var54) || NIL == module0065.f4773((SubLObject)$ic35$)) {
                        if (NIL != module0065.f4749(var54)) {
                            var54 = (SubLObject)$ic35$;
                        }
                        if (NIL != module0363.f24547(var18, var54)) {
                            var55 = var54;
                            var56 = module0077.f5333(inference_datastructures_inference_oc.f25473(var55));
                            for (var57 = module0032.f1741(var56), var58 = (SubLObject)NIL, var58 = module0032.f1742(var57, var56); NIL == module0032.f1744(var57, var58); var58 = module0032.f1743(var58)) {
                                var59 = module0032.f1745(var57, var58);
                                if (NIL != module0032.f1746(var58, var59)) {
                                    module0387.f27563(var59, var46);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject var62_63 = var48;
            if (NIL == module0065.f4777(var62_63)) {
                final SubLObject var60 = module0065.f4738(var62_63);
                SubLObject var61 = (SubLObject)NIL;
                SubLObject var62 = (SubLObject)NIL;
                final Iterator var63 = Hashtables.getEntrySetIterator(var60);
                try {
                    while (Hashtables.iteratorHasNext(var63)) {
                        final Map.Entry var64 = Hashtables.iteratorNextEntry(var63);
                        var61 = Hashtables.getEntryKey(var64);
                        var62 = Hashtables.getEntryValue(var64);
                        if (NIL != module0363.f24547(var18, var62)) {
                            final SubLObject var65 = var62;
                            final SubLObject var66 = module0077.f5333(inference_datastructures_inference_oc.f25473(var65));
                            SubLObject var67;
                            SubLObject var68;
                            SubLObject var69;
                            for (var67 = module0032.f1741(var66), var68 = (SubLObject)NIL, var68 = module0032.f1742(var67, var66); NIL == module0032.f1744(var67, var68); var68 = module0032.f1743(var68)) {
                                var69 = module0032.f1745(var67, var68);
                                if (NIL != module0032.f1746(var68, var69)) {
                                    module0387.f27563(var69, var46);
                                }
                            }
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var63);
                }
            }
        }
        return var46;
    }
    
    public static SubLObject f26941(final SubLObject var25, final SubLObject var61) {
        return var25;
    }
    
    public static SubLObject f26942() {
        return module0363.f24565(module0373.f26109());
    }
    
    public static SubLObject f26943(final SubLObject var25, final SubLObject var67, final SubLObject var26) {
        final SubLThread var68 = SubLProcess.currentSubLThread();
        final SubLObject var69 = module0147.f9540(var67);
        final SubLObject var70 = module0147.$g2095$.currentBinding(var68);
        final SubLObject var71 = module0147.$g2094$.currentBinding(var68);
        final SubLObject var72 = module0147.$g2096$.currentBinding(var68);
        final SubLObject var73 = module0018.$g646$.currentBinding(var68);
        try {
            module0147.$g2095$.bind(module0147.f9545(var69), var68);
            module0147.$g2094$.bind(module0147.f9546(var69), var68);
            module0147.$g2096$.bind(module0147.f9549(var69), var68);
            module0018.$g646$.bind(module0361.f24166(module0365.f24879(var25)), var68);
            final SubLObject var74 = module0365.f24865(var25);
            final SubLObject var75 = module0340.f22875(var74);
            if (NIL != var75) {
                module0337.f22649(var75, var26, (SubLObject)UNPROVIDED);
            }
            else {
                final SubLObject var76 = module0340.f22873(var74);
                if (var76.isFunctionSpec()) {
                    Functions.funcall(var76, var26);
                }
            }
        }
        finally {
            module0018.$g646$.rebind(var73, var68);
            module0147.$g2096$.rebind(var72, var68);
            module0147.$g2094$.rebind(var71, var68);
            module0147.$g2095$.rebind(var70, var68);
        }
        return var25;
    }
    
    public static SubLObject f26944(final SubLObject var75, final SubLObject var16) {
        assert NIL != module0362.f24446(var75) : var75;
        assert NIL != module0191.f11993(var16) : var16;
        final SubLObject var76 = module0373.f26105();
        final SubLObject var77 = f26935(var76);
        final SubLObject var78 = module0365.f24850(var76);
        final SubLObject var79 = module0363.f24507(var78);
        final SubLObject var80 = module0373.f26435(var79, var75, (SubLObject)UNPROVIDED);
        final SubLObject var81 = (SubLObject)((NIL != var77) ? ConsesLow.cons(var77, var16) : var16);
        return f26940(var78, var80, var76, var81);
    }
    
    public static SubLObject f26928(final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        final SubLObject var19 = f26935(f26930(var17));
        final SubLObject var20 = module0363.f24564(module0364.f24725(var17));
        final SubLObject var21 = (NIL != module0178.f11290(var19)) ? module0178.f11282(var19) : module0285.f18868(module0191.f11967(var19), (SubLObject)UNPROVIDED);
        final SubLObject var22 = (NIL != module0178.f11290(var19)) ? module0377.f26834(var19) : f26945(module0191.f11967(var19));
        final SubLObject var23 = module0232.f15308(var21);
        final SubLObject var24 = module0232.f15306(var21);
        final SubLObject var25 = var23.first();
        SubLObject var26 = (SubLObject)NIL;
        var18.resetMultipleValues();
        final SubLObject var27 = module0234.f15444(var20, var25, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var28 = var18.secondMultipleValue();
        var18.resetMultipleValues();
        var26 = module0377.f26817(var27);
        return var26;
    }
    
    public static SubLObject f26945(final SubLObject var86) {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26946(final SubLObject var75, final SubLObject var16) {
        final SubLThread var76 = SubLProcess.currentSubLThread();
        assert NIL != module0362.f24446(var75) : var75;
        assert NIL != module0191.f11993(var16) : var16;
        final SubLObject var77 = module0373.f26105();
        final SubLObject var78 = module0365.f24850(var77);
        final SubLObject var79 = module0363.f24509(var78);
        final SubLObject var80 = module0362.f24465(var79);
        final SubLObject var81 = module0362.f24465(var75);
        var76.resetMultipleValues();
        final SubLObject var82 = module0234.f15444(var81, var80, (SubLObject)T, (SubLObject)UNPROVIDED);
        final SubLObject var83 = var76.secondMultipleValue();
        var76.resetMultipleValues();
        final SubLObject var84 = module0363.f24507(var78);
        final SubLObject var85 = module0373.f26435(var84, var75, (SubLObject)UNPROVIDED);
        final SubLObject var86 = module0375.f26580(var78, var85, var82, (SubLObject)T, (SubLObject)UNPROVIDED);
        if (NIL != var86) {
            module0375.f26574(var86, var77);
        }
        return var85;
    }
    
    public static SubLObject f26947(final SubLObject var91, final SubLObject var92) {
        if (NIL != module0375.f26576(var91)) {
            final SubLObject var93 = module0364.f24725(var91);
            final SubLObject var94 = module0375.f26577(var91);
            final SubLObject var95 = module0364.f24736(var94);
            final SubLObject var96 = module0363.f24564(var95);
            SubLObject var97 = module0375.f26573(var91);
            SubLObject var98 = (SubLObject)NIL;
            var98 = var97.first();
            while (NIL != var97) {
                final SubLObject var99 = module0365.f24865(var98);
                final SubLObject var100 = module0340.f22989(var99);
                SubLObject var22_99;
                final SubLObject var101 = var22_99 = Functions.funcall(var100, var96);
                SubLObject var102 = (SubLObject)NIL;
                var102 = var22_99.first();
                while (NIL != var22_99) {
                    SubLObject var104;
                    final SubLObject var103 = var104 = var102;
                    SubLObject var105 = (SubLObject)NIL;
                    SubLObject var106 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var104, var103, (SubLObject)$ic37$);
                    var105 = var104.first();
                    var104 = var104.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var104, var103, (SubLObject)$ic37$);
                    var106 = var104.first();
                    var104 = var104.rest();
                    if (NIL == var104) {
                        f26948(var105, var99, var98, var93, var94, var106);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var103, (SubLObject)$ic37$);
                    }
                    var22_99 = var22_99.rest();
                    var102 = var22_99.first();
                }
                var97 = var97.rest();
                var98 = var97.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26948(final SubLObject var103, final SubLObject var104, final SubLObject var105, final SubLObject var93, final SubLObject var94, final SubLObject var16) {
        final SubLObject var106 = module0363.f24564(var93);
        final SubLObject var107 = module0364.f24736(var94);
        final SubLObject var108 = module0363.f24565(var107);
        final SubLObject var109 = module0363.f24568(var107);
        final SubLObject var110 = module0362.f24462(var103, var109, var108);
        final SubLObject var111 = module0363.f24507(var107);
        final SubLObject var112 = module0373.f26435(var111, var110, (SubLObject)UNPROVIDED);
        final SubLObject var113 = module0364.f24736(var112);
        if (NIL == f26949(var113, var104)) {
            final SubLObject var114 = module0364.f24737(var112);
            final SubLObject var115 = module0364.f24737(var94);
            final SubLObject var116 = module0233.f15388(var114, var115);
            final SubLObject var117 = module0364.f24804(var113, var116);
            final SubLObject var118 = module0235.f15480(var106, var103);
            final SubLObject var119 = module0340.f22988(var104);
            final SubLObject var120 = (SubLObject)((NIL != var119) ? ConsesLow.cons(var119, var16) : var16);
            module0375.f26580(var93, var117, var118, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            f26940(var113, var94, var105, var120);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26949(final SubLObject var18, final SubLObject var45) {
        final SubLObject var46 = module0363.f24527(var18);
        SubLObject var47;
        SubLObject var48;
        SubLObject var49;
        SubLObject var50;
        SubLObject var51;
        for (var47 = module0032.f1741(var46), var48 = (SubLObject)NIL, var48 = module0032.f1742(var47, var46); NIL == module0032.f1744(var47, var48); var48 = module0032.f1743(var48)) {
            var49 = module0032.f1745(var47, var48);
            if (NIL != module0032.f1746(var48, var49) && NIL != module0364.f24748(var49, (SubLObject)$ic27$)) {
                var50 = f26930(var49);
                var51 = module0365.f24865(var50);
                if (var51.eql(var45)) {
                    return (SubLObject)T;
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26950(final SubLObject var17, final SubLObject var115, final SubLObject var116) {
        assert NIL != f26926(var17) : var17;
        if (NIL != var115 && !areAssertionsDisabledFor(me) && NIL == module0366.f24916(var115)) {
            throw new AssertionError(var115);
        }
        final SubLObject var117 = (SubLObject)((NIL != var115) ? ConsesLow.list(var115) : NIL);
        final SubLObject var118 = (SubLObject)((NIL != var115) ? module0366.f24934(var115) : NIL);
        final SubLObject var119 = module0233.f15384(var116, var118);
        final SubLObject var120 = module0377.f26828(var119);
        final SubLObject var121 = module0373.f26258(var120);
        return module0373.f26221(var17, var121, var117);
    }
    
    public static SubLObject f26951(final SubLObject var122, final SubLObject var116, final SubLObject var17) {
        final SubLThread var123 = SubLProcess.currentSubLThread();
        assert NIL != module0364.f24750(var17) : var17;
        var123.resetMultipleValues();
        final SubLObject var124 = f26950(var17, var122, var116);
        final SubLObject var125 = var123.secondMultipleValue();
        var123.resetMultipleValues();
        if (NIL != var125) {
            module0373.f26265(var124);
        }
        else {
            module0373.f26245(var122);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26952() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0379", "f26907", "S#30081", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0379", "f26908", "S#30080", 1, 0, false);
        new $f26908$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0379", "f26909", "S#30082", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0379", "f26910", "S#30083", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0379", "f26911", "S#30084", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0379", "f26912", "S#30085", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0379", "f26913", "S#30086", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0379", "f26914", "S#30087", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0379", "f26915", "S#30088", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0379", "f26916", "S#30089", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0379", "f26917", "S#30090", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0379", "f26918", "S#30091", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0379", "f26919", "S#30092", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0379", "f26920", "S#30093", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0379", "f26924", "S#30094", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0379", "f26925", "S#29243", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0379", "f26927", "S#30095", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0379", "f26929", "S#29240", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0379", "f26921", "S#30096", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0379", "f26922", "S#30097", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0379", "f26923", "S#30098", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0379", "f26930", "REWRITE-LINK-TACTIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0379", "f26931", "S#30099", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0379", "f26932", "S#30100", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0379", "f26933", "S#30101", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0379", "f26926", "S#29237", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0379", "f26934", "S#27342", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0379", "f26935", "S#30102", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0379", "f26936", "S#28928", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0379", "f26937", "S#29189", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0379", "f26939", "S#29214", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0379", "f26940", "S#30103", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0379", "f26938", "S#30104", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0379", "f26941", "S#29207", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0379", "f26942", "CURRENT-REWRITE-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0379", "f26943", "S#29218", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0379", "f26944", "REWRITE-ADD-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0379", "f26928", "S#30105", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0379", "f26945", "S#30106", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0379", "f26946", "RESTRICTION-REWRITE-ADD-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0379", "f26947", "S#29759", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0379", "f26948", "S#30107", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0379", "f26949", "S#30108", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0379", "f26950", "S#30109", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0379", "f26951", "S#29261", 3, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26953() {
        $g3207$ = SubLFiles.defconstant("S#30110", (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26954() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g3207$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic8$);
        Structures.def_csetf((SubLObject)$ic9$, (SubLObject)$ic10$);
        Structures.def_csetf((SubLObject)$ic11$, (SubLObject)$ic12$);
        Structures.def_csetf((SubLObject)$ic13$, (SubLObject)$ic14$);
        Equality.identity((SubLObject)$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g3207$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic23$));
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f26952();
    }
    
    public void initializeVariables() {
        f26953();
    }
    
    public void runTopLevelForms() {
        f26954();
    }
    
    static {
        me = (SubLFile)new module0379();
        $g3207$ = null;
        $ic0$ = makeSymbol("S#30079", "CYC");
        $ic1$ = makeSymbol("S#30080", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)makeSymbol("S#14781", "CYC"), (SubLObject)makeSymbol("S#713", "CYC"), (SubLObject)makeSymbol("S#14510", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)makeKeyword("HL-MODULE"), (SubLObject)makeKeyword("BINDINGS"), (SubLObject)makeKeyword("SUPPORTS"));
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("S#30082", "CYC"), (SubLObject)makeSymbol("S#30083", "CYC"), (SubLObject)makeSymbol("S#30084", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#30085", "CYC"), (SubLObject)makeSymbol("S#30086", "CYC"), (SubLObject)makeSymbol("S#30087", "CYC"));
        $ic6$ = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic7$ = makeSymbol("S#30081", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#30080", "CYC"));
        $ic9$ = makeSymbol("S#30082", "CYC");
        $ic10$ = makeSymbol("S#30085", "CYC");
        $ic11$ = makeSymbol("S#30083", "CYC");
        $ic12$ = makeSymbol("S#30086", "CYC");
        $ic13$ = makeSymbol("S#30084", "CYC");
        $ic14$ = makeSymbol("S#30087", "CYC");
        $ic15$ = makeKeyword("HL-MODULE");
        $ic16$ = makeKeyword("BINDINGS");
        $ic17$ = makeKeyword("SUPPORTS");
        $ic18$ = makeString("Invalid slot ~S for construction function");
        $ic19$ = makeKeyword("BEGIN");
        $ic20$ = makeSymbol("S#30088", "CYC");
        $ic21$ = makeKeyword("SLOT");
        $ic22$ = makeKeyword("END");
        $ic23$ = makeSymbol("S#30090", "CYC");
        $ic24$ = makeSymbol("S#26082", "CYC");
        $ic25$ = makeSymbol("S#27608", "CYC");
        $ic26$ = makeSymbol("S#14902", "CYC");
        $ic27$ = makeKeyword("REWRITE");
        $ic28$ = makeKeyword("UNDETERMINED");
        $ic29$ = makeKeyword("FREE");
        $ic30$ = makeSymbol("S#29237", "CYC");
        $ic31$ = makeString("Bindings ~a are not valid rewrite-link bindings.");
        $ic32$ = makeSymbol("S#14254", "CYC");
        $ic33$ = makeString("No tactic found for ~S");
        $ic34$ = makeKeyword("COMPLETE");
        $ic35$ = makeKeyword("SKIP");
        $ic36$ = makeSymbol("S#27306", "CYC");
        $ic37$ = ConsesLow.list((SubLObject)makeSymbol("S#13100", "CYC"), (SubLObject)makeSymbol("S#14510", "CYC"));
        $ic38$ = makeSymbol("S#26816", "CYC");
        $ic39$ = makeSymbol("S#26793", "CYC");
    }
    
    public static final class $sX30079_native extends SubLStructNative
    {
        public SubLObject $hl_module;
        public SubLObject $bindings;
        public SubLObject $supports;
        public static final SubLStructDeclNative structDecl;
        
        public $sX30079_native() {
            this.$hl_module = (SubLObject)CommonSymbols.NIL;
            this.$bindings = (SubLObject)CommonSymbols.NIL;
            this.$supports = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX30079_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$hl_module;
        }
        
        public SubLObject getField3() {
            return this.$bindings;
        }
        
        public SubLObject getField4() {
            return this.$supports;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$hl_module = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$bindings = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$supports = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX30079_native.class, $ic0$, $ic1$, $ic2$, $ic3$, new String[] { "$hl_module", "$bindings", "$supports" }, $ic4$, $ic5$, $ic6$);
        }
    }
    
    public static final class $f26908$UnaryFunction extends UnaryFunction
    {
        public $f26908$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#30080"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f26908(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 260 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/