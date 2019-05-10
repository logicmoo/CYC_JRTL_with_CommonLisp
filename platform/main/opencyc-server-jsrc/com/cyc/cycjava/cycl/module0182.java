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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
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

public final class module0182 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0182";
    public static final String myFingerPrint = "adccd858ffa165c16fb04aa240f6b921ab96808199e33f93200051d8d9647c46";
    public static SubLSymbol $g2220$;
    private static SubLSymbol $g2222$;
    public static SubLSymbol $g2213$;
    public static SubLSymbol $g2223$;
    private static SubLSymbol $g2224$;
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
    private static final SubLString $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLString $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLString $ic25$;
    private static final SubLList $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
    private static final SubLString $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    
    public static SubLObject f11492(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11493(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX14190_native.class) ? T : NIL);
    }
    
    public static SubLObject f11494(final SubLObject var1) {
        assert NIL != f11493(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f11495(final SubLObject var1) {
        assert NIL != f11493(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f11496(final SubLObject var1, final SubLObject var4) {
        assert NIL != f11493(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f11497(final SubLObject var1, final SubLObject var4) {
        assert NIL != f11493(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f11498(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX14190_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic13$)) {
                f11496(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic14$)) {
                f11497(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic15$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f11499(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic16$, (SubLObject)$ic17$, (SubLObject)TWO_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic18$, (SubLObject)$ic13$, f11494(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic18$, (SubLObject)$ic14$, f11495(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic19$, (SubLObject)$ic17$, (SubLObject)TWO_INTEGER);
        return var11;
    }
    
    public static SubLObject f11500(final SubLObject var11, final SubLObject var12) {
        return f11499(var11, var12);
    }
    
    public static SubLObject f11501() {
        SubLObject var13 = (SubLObject)NIL;
        var13 = f11498((SubLObject)UNPROVIDED);
        return var13;
    }
    
    public static SubLObject f11502(final SubLObject var13) {
        f11496(var13, (SubLObject)NIL);
        f11497(var13, (SubLObject)NIL);
        return var13;
    }
    
    public static SubLObject f11503(final SubLObject var13) {
        return f11494(var13);
    }
    
    public static SubLObject f11504(final SubLObject var13) {
        return f11495(var13);
    }
    
    public static SubLObject f11505(final SubLObject var13, final SubLObject var14) {
        f11496(var13, var14);
        return var13;
    }
    
    public static SubLObject f11506(final SubLObject var13, final SubLObject var15) {
        f11497(var13, var15);
        return var13;
    }
    
    public static SubLObject f11507(final SubLObject var16, final SubLObject var2) {
        final SubLObject var17 = f11508(var16);
        module0021.f1038(f11503(var17), var2);
        module0021.f1038(f11504(var17), var2);
        return var16;
    }
    
    public static SubLObject f11509(final SubLObject var16, final SubLObject var2) {
        final SubLObject var17 = module0179.f11415(var16);
        final SubLObject var18 = module0021.f1060(var2, (SubLObject)NIL, (SubLObject)UNPROVIDED);
        final SubLObject var19 = module0021.f1060(var2, (SubLObject)NIL, (SubLObject)UNPROVIDED);
        final SubLObject var20 = f11501();
        f11505(var20, var18);
        f11506(var20, var19);
        module0181.f11474(var17, var20);
        return var17;
    }
    
    public static SubLObject f11510(final SubLObject var20, final SubLObject var21) {
        SubLObject var22 = module0183.f11552(var20);
        if (NIL != var22) {
            return module0179.f11415(var22);
        }
        final SubLObject var23 = module0179.f11419();
        var22 = module0179.f11439(var23);
        f11511(var22, var23, var20, var21);
        return var23;
    }
    
    public static SubLObject f11511(final SubLObject var16, final SubLObject var22, final SubLObject var20, final SubLObject var21) {
        final SubLObject var23 = f11501();
        f11512(var20, var16);
        module0181.f11474(var22, var23);
        final SubLObject var24 = module0191.f11986(var21, (SubLObject)T);
        final SubLObject var25 = module0188.f11774(var20, var24);
        f11505(var23, var25);
        f11513(var16, var20);
        f11514(var20);
        return var16;
    }
    
    public static SubLObject f11515(final SubLObject var22) {
        final SubLObject var23 = module0179.f11443(var22);
        return (NIL != var23) ? var23 : module0179.f11439(var22);
    }
    
    public static SubLObject f11508(final SubLObject var16) {
        return module0181.f11472(module0179.f11435(var16));
    }
    
    public static SubLObject f11516(final SubLObject var16) {
        final SubLObject var17 = f11508(var16);
        final SubLObject var18 = f11503(var17);
        SubLObject var19 = (SubLObject)NIL;
        if (NIL != deduction_handles_oc.f11659(var18)) {
            var19 = module0188.f11781(var18);
        }
        else if (NIL != module0191.f11952(var18)) {
            var19 = var18;
        }
        return var19;
    }
    
    public static SubLObject f11517(final SubLObject var16, final SubLObject var14) {
        final SubLObject var17 = f11508(var16);
        final SubLObject var18 = f11504(var17);
        final SubLObject var19 = module0032.f1736(var14, var18, Symbols.symbol_function((SubLObject)EQ));
        f11506(var17, var19);
        module0181.f11476(module0179.f11415(var16));
        return var16;
    }
    
    public static SubLObject f11518(final SubLObject var16, final SubLObject var14) {
        final SubLObject var17 = f11508(var16);
        final SubLObject var18 = f11504(var17);
        final SubLObject var19 = module0032.f1737(var14, var18, Symbols.symbol_function((SubLObject)EQ));
        f11506(var17, var19);
        module0181.f11476(module0179.f11415(var16));
        return var16;
    }
    
    public static SubLObject f11519(final SubLObject var16) {
        final SubLObject var17 = f11508(var16);
        f11506(var17, module0032.f1726((SubLObject)ZERO_INTEGER, Symbols.symbol_function((SubLObject)EQ)));
        module0181.f11476(module0179.f11415(var16));
        return var16;
    }
    
    public static SubLObject f11520(final SubLObject var16) {
        final SubLObject var17 = f11516(var16);
        final SubLObject var18 = f11508(var16);
        f11505(var18, var17);
        module0181.f11476(module0179.f11415(var16));
        return var16;
    }
    
    public static SubLObject f11521(final SubLObject var16, final SubLObject var26) {
        final SubLObject var27 = f11508(var16);
        final SubLObject var28 = f11503(var27);
        if (NIL != deduction_handles_oc.f11671(var28, (SubLObject)UNPROVIDED)) {
            module0188.f11775(var28);
        }
        f11505(var27, var26);
        module0181.f11476(module0179.f11415(var16));
        return var16;
    }
    
    public static SubLObject f11522(final SubLObject var16, final SubLObject var28) {
        final SubLObject var29 = f11516(var16);
        final SubLObject var30 = module0188.f11774(var29, var28);
        f11521(var16, var30);
        return var16;
    }
    
    public static SubLObject f11523(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        final SubLObject var18 = f11516(var16);
        final SubLObject var19 = module0179.f11436(var18);
        if (NIL != var19) {
            return f11522(var16, var19);
        }
        if (NIL != module0342.$g2221$.getDynamicValue(var17)) {
            Errors.error((SubLObject)$ic21$, var16, var18);
        }
        else {
            Errors.warn((SubLObject)$ic21$, var16, var18);
        }
        return (SubLObject)$ic22$;
    }
    
    public static SubLObject f11524(final SubLObject var16) {
        final SubLObject var17 = f11508(var16);
        final SubLObject var18 = f11503(var17);
        if (NIL != deduction_handles_oc.f11671(var18, (SubLObject)UNPROVIDED)) {
            module0188.f11775(var18);
        }
        module0179.f11434(var16);
        f11502(var17);
        return var16;
    }
    
    public static SubLObject f11525(final SubLObject var30, SubLObject var31) {
        if (var31 == UNPROVIDED) {
            var31 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL != f11493(var30) && NIL != f11526(var30, var31));
    }
    
    public static SubLObject f11526(final SubLObject var13, SubLObject var31) {
        if (var31 == UNPROVIDED) {
            var31 = (SubLObject)NIL;
        }
        final SubLObject var32 = f11503(var13);
        final SubLObject var33 = f11504(var13);
        SubLObject var34 = (SubLObject)NIL;
        if (NIL != deduction_handles_oc.f11671(var32, var31)) {
            SubLObject var35 = (SubLObject)NIL;
            final SubLObject var36 = var33;
            SubLObject var37;
            SubLObject var38;
            SubLObject var39;
            for (var37 = module0032.f1741(var36), var38 = (SubLObject)NIL, var38 = module0032.f1742(var37, var36); NIL == var35 && NIL == module0032.f1744(var37, var38); var38 = module0032.f1743(var38)) {
                var39 = module0032.f1745(var37, var38);
                if (NIL != module0032.f1746(var38, var39) && NIL == deduction_handles_oc.f11671(var39, var31)) {
                    var35 = (SubLObject)T;
                }
            }
            var34 = (SubLObject)makeBoolean(NIL == var35);
        }
        return var34;
    }
    
    public static SubLObject f11512(final SubLObject var20, final SubLObject var16) {
        if (NIL == module0067.f4852($g2222$.getGlobalValue())) {
            $g2222$.setGlobalValue(module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        }
        module0067.f4886($g2222$.getGlobalValue(), var20, var16);
        return var20;
    }
    
    public static SubLObject f11514(final SubLObject var20) {
        if (NIL != module0067.f4852($g2222$.getGlobalValue())) {
            module0067.f4887($g2222$.getGlobalValue(), var20);
        }
        return var20;
    }
    
    public static SubLObject f11527(final SubLObject var20) {
        SubLObject var21 = (SubLObject)NIL;
        if (NIL != module0067.f4852($g2222$.getGlobalValue())) {
            var21 = module0067.f4885($g2222$.getGlobalValue(), var20, (SubLObject)UNPROVIDED);
        }
        return var21;
    }
    
    public static SubLObject f11528(final SubLObject var16) {
        f11529(var16, (SubLObject)UNPROVIDED);
        final SubLObject var17 = module0179.f11415(var16);
        f11524(var16);
        module0179.f11418(var17);
        module0181.f11475(var17);
        return var16;
    }
    
    public static SubLObject f11530(final SubLObject var38) {
        return module0035.f2171(var38, $g2224$.getGlobalValue());
    }
    
    public static SubLObject f11531(final SubLObject var38) {
        return (SubLObject)makeBoolean(NIL != module0212.f13762(var38) && NIL == f11530(var38));
    }
    
    public static SubLObject f11532(final SubLObject var39) {
        final SubLObject var40 = module0205.f13183(var39, (SubLObject)$ic27$, (SubLObject)NIL, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (NIL != module0035.find_if_not((SubLObject)$ic28$, var40, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? Sequences.remove_if((SubLObject)$ic28$, var40, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : var40;
    }
    
    public static SubLObject f11533(final SubLObject var20) {
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22 = (SubLObject)NIL;
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var24 = (SubLObject)NIL;
        SubLObject var25 = (SubLObject)NIL;
        SubLObject var26 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var20, var20, (SubLObject)$ic29$);
        var23 = var20.first();
        SubLObject var27 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var27, var20, (SubLObject)$ic29$);
        var24 = var27.first();
        var27 = var27.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var27, var20, (SubLObject)$ic29$);
        var25 = var27.first();
        var27 = var27.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var27, var20, (SubLObject)$ic29$);
        var26 = var27.first();
        var27 = var27.rest();
        if (NIL == var27) {
            final SubLObject var28 = $g2223$.getGlobalValue();
            SubLObject var29 = (SubLObject)NIL;
            try {
                var29 = Locks.seize_lock(var28);
                final SubLObject var30 = module0067.f4885($g2213$.getGlobalValue(), var23, (SubLObject)UNPROVIDED);
                if (NIL != module0067.f4852(var30)) {
                    final SubLObject var31 = module0067.f4885(var30, var25, (SubLObject)UNPROVIDED);
                    if (NIL != module0067.f4852(var31)) {
                        final SubLObject var32 = module0067.f4885(var31, var26, (SubLObject)UNPROVIDED);
                        if (NIL != module0067.f4852(var32)) {
                            final SubLObject var33 = f11532(var24);
                            SubLObject var34 = (SubLObject)NIL;
                            if (NIL == var34) {
                                SubLObject var35 = var33;
                                SubLObject var36 = (SubLObject)NIL;
                                var36 = var35.first();
                                while (NIL == var34 && NIL != var35) {
                                    final SubLObject var37 = module0067.f4885(var32, var36, (SubLObject)UNPROVIDED);
                                    if (NIL != module0032.f1729(var37)) {
                                        var21 = (SubLObject)NIL;
                                        var34 = (SubLObject)T;
                                    }
                                    else if (NIL != module0032.f1730(var37)) {
                                        var21 = (SubLObject)ConsesLow.list(var37);
                                        var34 = (SubLObject)T;
                                    }
                                    else {
                                        var21 = (SubLObject)ConsesLow.cons(var37, var21);
                                    }
                                    var35 = var35.rest();
                                    var36 = var35.first();
                                }
                            }
                        }
                    }
                }
            }
            finally {
                if (NIL != var29) {
                    Locks.release_lock(var28);
                }
            }
            if (NIL != var21) {
                final SubLObject var38 = (NIL != module0035.f1997(var21)) ? var21.first() : module0078.f5352(var21, Symbols.symbol_function((SubLObject)EQ));
                if (NIL == module0032.f1729(var38)) {
                    final SubLObject var39 = var38;
                    SubLObject var40;
                    SubLObject var41;
                    SubLObject var42;
                    SubLObject var43;
                    for (var40 = module0032.f1741(var39), var41 = (SubLObject)NIL, var41 = module0032.f1742(var40, var39); NIL == var22 && NIL == module0032.f1744(var40, var41); var41 = module0032.f1743(var41)) {
                        var42 = module0032.f1745(var40, var41);
                        if (NIL != module0032.f1746(var41, var42)) {
                            var43 = module0183.f11560(var42);
                            if (var43.equal(var24)) {
                                var22 = var42;
                            }
                        }
                    }
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)$ic29$);
        }
        return var22;
    }
    
    public static SubLObject f11534(final SubLObject var38) {
        final SubLObject var39 = f11535(var38);
        final SubLObject var40 = f11536(var38);
        return module0032.f1753(module0078.f5350((SubLObject)ConsesLow.list(var39, var40), Symbols.symbol_function((SubLObject)EQ)));
    }
    
    public static SubLObject f11535(final SubLObject var38) {
        return (NIL != f11531(var38)) ? f11537(var38) : f11538(var38);
    }
    
    public static SubLObject f11537(final SubLObject var38) {
        final SubLThread var39 = SubLProcess.currentSubLThread();
        SubLObject var40 = (SubLObject)NIL;
        final SubLObject var41 = $g2223$.getGlobalValue();
        SubLObject var42 = (SubLObject)NIL;
        try {
            var42 = Locks.seize_lock(var41);
            SubLObject var43;
            for (var43 = module0066.f4838(module0067.f4891($g2213$.getGlobalValue())); NIL == module0066.f4841(var43); var43 = module0066.f4840(var43)) {
                var39.resetMultipleValues();
                final SubLObject var44 = module0066.f4839(var43);
                final SubLObject var45 = var39.secondMultipleValue();
                var39.resetMultipleValues();
                SubLObject var63_65;
                for (var63_65 = module0066.f4838(module0067.f4891(var45)); NIL == module0066.f4841(var63_65); var63_65 = module0066.f4840(var63_65)) {
                    var39.resetMultipleValues();
                    final SubLObject var64_66 = module0066.f4839(var63_65);
                    final SubLObject var46 = var39.secondMultipleValue();
                    var39.resetMultipleValues();
                    SubLObject var63_66;
                    for (var63_66 = module0066.f4838(module0067.f4891(var46)); NIL == module0066.f4841(var63_66); var63_66 = module0066.f4840(var63_66)) {
                        var39.resetMultipleValues();
                        final SubLObject var64_67 = module0066.f4839(var63_66);
                        final SubLObject var47 = var39.secondMultipleValue();
                        var39.resetMultipleValues();
                        final SubLObject var48 = module0067.f4885(var47, var38, (SubLObject)UNPROVIDED);
                        if (NIL != module0032.f1724(var48) && NIL == module0032.f1729(var48)) {
                            var40 = (SubLObject)ConsesLow.cons(var48, var40);
                        }
                    }
                    module0066.f4842(var63_66);
                }
                module0066.f4842(var63_65);
            }
            module0066.f4842(var43);
        }
        finally {
            if (NIL != var42) {
                Locks.release_lock(var41);
            }
        }
        return module0078.f5350(var40, Symbols.symbol_function((SubLObject)EQ));
    }
    
    public static SubLObject f11538(final SubLObject var38) {
        final SubLThread var39 = SubLProcess.currentSubLThread();
        final SubLObject var40 = module0032.f1726((SubLObject)ZERO_INTEGER, Symbols.symbol_function((SubLObject)EQ));
        final SubLObject var41 = module0179.f11398();
        final SubLObject var42 = (SubLObject)$ic30$;
        final SubLObject var43 = module0065.f4733(var41);
        SubLObject var44 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var42) : var42;
        final SubLObject var45 = module0012.$g75$.currentBinding(var39);
        final SubLObject var46 = module0012.$g76$.currentBinding(var39);
        final SubLObject var47 = module0012.$g77$.currentBinding(var39);
        final SubLObject var48 = module0012.$g78$.currentBinding(var39);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var39);
            module0012.$g76$.bind((SubLObject)NIL, var39);
            module0012.$g77$.bind((SubLObject)T, var39);
            module0012.$g78$.bind(Time.get_universal_time(), var39);
            module0012.f478(var42);
            final SubLObject var78_79 = var41;
            if (NIL == module0065.f4772(var78_79, (SubLObject)$ic32$)) {
                final SubLObject var80_81 = var78_79;
                if (NIL == module0065.f4775(var80_81, (SubLObject)$ic32$)) {
                    final SubLObject var49 = module0065.f4740(var80_81);
                    final SubLObject var50 = (SubLObject)NIL;
                    SubLObject var51;
                    SubLObject var52;
                    SubLObject var53;
                    SubLObject var54;
                    SubLObject var55;
                    for (var51 = Sequences.length(var49), var52 = (SubLObject)NIL, var52 = (SubLObject)ZERO_INTEGER; var52.numL(var51); var52 = Numbers.add(var52, (SubLObject)ONE_INTEGER)) {
                        var53 = ((NIL != var50) ? Numbers.subtract(var51, var52, (SubLObject)ONE_INTEGER) : var52);
                        var54 = Vectors.aref(var49, var53);
                        if (NIL == module0065.f4749(var54) || NIL == module0065.f4773((SubLObject)$ic32$)) {
                            if (NIL != module0065.f4749(var54)) {
                                var54 = (SubLObject)$ic32$;
                            }
                            module0012.note_percent_progress(var44, var43);
                            var44 = Numbers.add(var44, (SubLObject)ONE_INTEGER);
                            var55 = module0183.f11560(var54);
                            if (NIL != module0035.f2436(var38, var55)) {
                                module0032.f1736(var54, var40, Symbols.symbol_function((SubLObject)EQ));
                            }
                        }
                    }
                }
                final SubLObject var87_88 = var78_79;
                if (NIL == module0065.f4777(var87_88) || NIL == module0065.f4773((SubLObject)$ic32$)) {
                    final SubLObject var56 = module0065.f4738(var87_88);
                    SubLObject var57 = module0065.f4739(var87_88);
                    final SubLObject var58 = module0065.f4734(var87_88);
                    final SubLObject var59 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic32$)) ? NIL : $ic32$);
                    while (var57.numL(var58)) {
                        final SubLObject var60 = Hashtables.gethash_without_values(var57, var56, var59);
                        if (NIL == module0065.f4773((SubLObject)$ic32$) || NIL == module0065.f4749(var60)) {
                            module0012.note_percent_progress(var44, var43);
                            var44 = Numbers.add(var44, (SubLObject)ONE_INTEGER);
                            final SubLObject var61 = module0183.f11560(var60);
                            if (NIL != module0035.f2436(var38, var61)) {
                                module0032.f1736(var60, var40, Symbols.symbol_function((SubLObject)EQ));
                            }
                        }
                        var57 = Numbers.add(var57, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var48, var39);
            module0012.$g77$.rebind(var47, var39);
            module0012.$g76$.rebind(var46, var39);
            module0012.$g75$.rebind(var45, var39);
        }
        return var40;
    }
    
    public static SubLObject f11536(final SubLObject var38) {
        final SubLThread var39 = SubLProcess.currentSubLThread();
        SubLObject var40 = (SubLObject)NIL;
        final SubLObject var41 = $g2223$.getGlobalValue();
        SubLObject var42 = (SubLObject)NIL;
        try {
            var42 = Locks.seize_lock(var41);
            SubLObject var43;
            for (var43 = module0066.f4838(module0067.f4891($g2213$.getGlobalValue())); NIL == module0066.f4841(var43); var43 = module0066.f4840(var43)) {
                var39.resetMultipleValues();
                final SubLObject var44 = module0066.f4839(var43);
                final SubLObject var45 = var39.secondMultipleValue();
                var39.resetMultipleValues();
                SubLObject var63_94;
                for (var63_94 = module0066.f4838(module0067.f4891(var45)); NIL == module0066.f4841(var63_94); var63_94 = module0066.f4840(var63_94)) {
                    var39.resetMultipleValues();
                    final SubLObject var46 = module0066.f4839(var63_94);
                    final SubLObject var47 = var39.secondMultipleValue();
                    var39.resetMultipleValues();
                    if (NIL != module0035.f2436(var38, var46)) {
                        SubLObject var63_95;
                        for (var63_95 = module0066.f4838(module0067.f4891(var47)); NIL == module0066.f4841(var63_95); var63_95 = module0066.f4840(var63_95)) {
                            var39.resetMultipleValues();
                            final SubLObject var64_96 = module0066.f4839(var63_95);
                            final SubLObject var48 = var39.secondMultipleValue();
                            var39.resetMultipleValues();
                            SubLObject var63_96;
                            for (var63_96 = module0066.f4838(module0067.f4891(var48)); NIL == module0066.f4841(var63_96); var63_96 = module0066.f4840(var63_96)) {
                                var39.resetMultipleValues();
                                final SubLObject var64_97 = module0066.f4839(var63_96);
                                final SubLObject var49 = var39.secondMultipleValue();
                                var39.resetMultipleValues();
                                var40 = (SubLObject)ConsesLow.cons(var49, var40);
                            }
                            module0066.f4842(var63_96);
                        }
                        module0066.f4842(var63_95);
                    }
                }
                module0066.f4842(var63_94);
            }
            module0066.f4842(var43);
        }
        finally {
            if (NIL != var42) {
                Locks.release_lock(var41);
            }
        }
        return module0078.f5350(var40, Symbols.symbol_function((SubLObject)EQ));
    }
    
    public static SubLObject f11513(final SubLObject var16, final SubLObject var20) {
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22 = (SubLObject)NIL;
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var24 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var20, var20, (SubLObject)$ic29$);
        var21 = var20.first();
        SubLObject var25 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var25, var20, (SubLObject)$ic29$);
        var22 = var25.first();
        var25 = var25.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var25, var20, (SubLObject)$ic29$);
        var23 = var25.first();
        var25 = var25.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var25, var20, (SubLObject)$ic29$);
        var24 = var25.first();
        var25 = var25.rest();
        if (NIL == var25) {
            final SubLObject var26 = $g2223$.getGlobalValue();
            SubLObject var27 = (SubLObject)NIL;
            try {
                var27 = Locks.seize_lock(var26);
                SubLObject var28 = module0067.f4885($g2213$.getGlobalValue(), var21, (SubLObject)UNPROVIDED);
                if (NIL == module0067.f4852(var28)) {
                    var28 = module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
                    module0067.f4886($g2213$.getGlobalValue(), var21, var28);
                }
                SubLObject var29 = module0067.f4885(var28, var23, (SubLObject)UNPROVIDED);
                if (NIL == module0067.f4852(var29)) {
                    var29 = module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
                    module0067.f4886(var28, var23, var29);
                }
                SubLObject var30 = module0067.f4885(var29, var24, (SubLObject)UNPROVIDED);
                if (NIL == module0067.f4852(var30)) {
                    var30 = module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
                    module0067.f4886(var29, var24, var30);
                }
                SubLObject var32;
                final SubLObject var31 = var32 = f11532(var22);
                SubLObject var33 = (SubLObject)NIL;
                var33 = var32.first();
                while (NIL != var32) {
                    final SubLObject var34 = module0067.f4885(var30, var33, (SubLObject)UNPROVIDED);
                    final SubLObject var35 = module0032.f1736(var16, var34, Symbols.symbol_function((SubLObject)EQ));
                    module0067.f4886(var30, var33, var35);
                    var32 = var32.rest();
                    var33 = var32.first();
                }
            }
            finally {
                if (NIL != var27) {
                    Locks.release_lock(var26);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)$ic29$);
        }
        return var16;
    }
    
    public static SubLObject f11529(final SubLObject var16, SubLObject var31) {
        if (var31 == UNPROVIDED) {
            var31 = (SubLObject)NIL;
        }
        if (NIL != var31) {
            f11539(var16);
        }
        else {
            final SubLObject var32 = f11516(var16);
            if (NIL != module0191.f11952(var32)) {
                f11540(var16, var32);
            }
            else {
                f11539(var16);
            }
        }
        return var16;
    }
    
    public static SubLObject f11540(final SubLObject var16, final SubLObject var20) {
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22 = (SubLObject)NIL;
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var24 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var20, var20, (SubLObject)$ic29$);
        var21 = var20.first();
        SubLObject var25 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var25, var20, (SubLObject)$ic29$);
        var22 = var25.first();
        var25 = var25.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var25, var20, (SubLObject)$ic29$);
        var23 = var25.first();
        var25 = var25.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var25, var20, (SubLObject)$ic29$);
        var24 = var25.first();
        var25 = var25.rest();
        if (NIL == var25) {
            final SubLObject var26 = $g2223$.getGlobalValue();
            SubLObject var27 = (SubLObject)NIL;
            try {
                var27 = Locks.seize_lock(var26);
                final SubLObject var28 = module0067.f4885($g2213$.getGlobalValue(), var21, (SubLObject)UNPROVIDED);
                if (NIL != module0067.f4852(var28)) {
                    final SubLObject var29 = module0067.f4885(var28, var23, (SubLObject)UNPROVIDED);
                    if (NIL != module0067.f4852(var29)) {
                        final SubLObject var30 = module0067.f4885(var29, var24, (SubLObject)UNPROVIDED);
                        if (NIL != module0067.f4852(var30)) {
                            SubLObject var32;
                            final SubLObject var31 = var32 = f11532(var22);
                            SubLObject var33 = (SubLObject)NIL;
                            var33 = var32.first();
                            while (NIL != var32) {
                                final SubLObject var34 = module0067.f4885(var30, var33, (SubLObject)UNPROVIDED);
                                final SubLObject var35 = module0032.f1737(var16, var34, Symbols.symbol_function((SubLObject)EQ));
                                if (NIL != module0032.f1729(var35)) {
                                    module0067.f4887(var30, var33);
                                }
                                else {
                                    module0067.f4886(var30, var33, var35);
                                }
                                var32 = var32.rest();
                                var33 = var32.first();
                            }
                            if (NIL != module0067.f4882(var30)) {
                                module0067.f4887(var29, var24);
                            }
                        }
                        if (NIL != module0067.f4882(var29)) {
                            module0067.f4887(var28, var23);
                        }
                    }
                    if (NIL != module0067.f4882(var28)) {
                        module0067.f4887($g2213$.getGlobalValue(), var21);
                    }
                }
            }
            finally {
                if (NIL != var27) {
                    Locks.release_lock(var26);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)$ic29$);
        }
        return var16;
    }
    
    public static SubLObject f11539(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        final SubLObject var18 = $g2223$.getGlobalValue();
        SubLObject var19 = (SubLObject)NIL;
        try {
            var19 = Locks.seize_lock(var18);
            SubLObject var20;
            for (var20 = module0066.f4838(module0067.f4891($g2213$.getGlobalValue())); NIL == module0066.f4841(var20); var20 = module0066.f4840(var20)) {
                var17.resetMultipleValues();
                final SubLObject var21 = module0066.f4839(var20);
                final SubLObject var22 = var17.secondMultipleValue();
                var17.resetMultipleValues();
                SubLObject var63_112;
                for (var63_112 = module0066.f4838(module0067.f4891(var22)); NIL == module0066.f4841(var63_112); var63_112 = module0066.f4840(var63_112)) {
                    var17.resetMultipleValues();
                    final SubLObject var23 = module0066.f4839(var63_112);
                    final SubLObject var24 = var17.secondMultipleValue();
                    var17.resetMultipleValues();
                    SubLObject var63_113;
                    for (var63_113 = module0066.f4838(module0067.f4891(var24)); NIL == module0066.f4841(var63_113); var63_113 = module0066.f4840(var63_113)) {
                        var17.resetMultipleValues();
                        final SubLObject var25 = module0066.f4839(var63_113);
                        final SubLObject var26 = var17.secondMultipleValue();
                        var17.resetMultipleValues();
                        SubLObject var63_114;
                        for (var63_114 = module0066.f4838(module0067.f4891(var26)); NIL == module0066.f4841(var63_114); var63_114 = module0066.f4840(var63_114)) {
                            var17.resetMultipleValues();
                            final SubLObject var27 = module0066.f4839(var63_114);
                            final SubLObject var28 = var17.secondMultipleValue();
                            var17.resetMultipleValues();
                            final SubLObject var29 = module0032.f1737(var16, var28, Symbols.symbol_function((SubLObject)EQ));
                            if (NIL != module0032.f1729(var29)) {
                                module0067.f4887(var26, var27);
                            }
                            else {
                                module0067.f4886(var26, var27, var29);
                            }
                        }
                        module0066.f4842(var63_114);
                        if (NIL != module0067.f4882(var26)) {
                            module0067.f4887(var24, var25);
                        }
                    }
                    module0066.f4842(var63_113);
                    if (NIL != module0067.f4882(var24)) {
                        module0067.f4887(var22, var23);
                    }
                }
                module0066.f4842(var63_112);
                if (NIL != module0067.f4882(var22)) {
                    module0067.f4887($g2213$.getGlobalValue(), var21);
                }
            }
            module0066.f4842(var20);
        }
        finally {
            if (NIL != var19) {
                Locks.release_lock(var18);
            }
        }
        return var16;
    }
    
    public static SubLObject f11541() {
        module0067.f4881($g2213$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11542() {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        f11541();
        final SubLObject var30 = module0179.f11398();
        final SubLObject var31 = (SubLObject)$ic33$;
        final SubLObject var32 = module0065.f4733(var30);
        SubLObject var33 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var31) : var31;
        final SubLObject var34 = module0012.$g75$.currentBinding(var29);
        final SubLObject var35 = module0012.$g76$.currentBinding(var29);
        final SubLObject var36 = module0012.$g77$.currentBinding(var29);
        final SubLObject var37 = module0012.$g78$.currentBinding(var29);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var29);
            module0012.$g76$.bind((SubLObject)NIL, var29);
            module0012.$g77$.bind((SubLObject)T, var29);
            module0012.$g78$.bind(Time.get_universal_time(), var29);
            module0012.f478(var31);
            final SubLObject var78_116 = var30;
            if (NIL == module0065.f4772(var78_116, (SubLObject)$ic32$)) {
                final SubLObject var80_117 = var78_116;
                if (NIL == module0065.f4775(var80_117, (SubLObject)$ic32$)) {
                    final SubLObject var38 = module0065.f4740(var80_117);
                    final SubLObject var39 = (SubLObject)NIL;
                    SubLObject var40;
                    SubLObject var41;
                    SubLObject var42;
                    SubLObject var43;
                    SubLObject var44;
                    for (var40 = Sequences.length(var38), var41 = (SubLObject)NIL, var41 = (SubLObject)ZERO_INTEGER; var41.numL(var40); var41 = Numbers.add(var41, (SubLObject)ONE_INTEGER)) {
                        var42 = ((NIL != var39) ? Numbers.subtract(var40, var41, (SubLObject)ONE_INTEGER) : var41);
                        var43 = Vectors.aref(var38, var42);
                        if (NIL == module0065.f4749(var43) || NIL == module0065.f4773((SubLObject)$ic32$)) {
                            if (NIL != module0065.f4749(var43)) {
                                var43 = (SubLObject)$ic32$;
                            }
                            module0012.note_percent_progress(var33, var32);
                            var33 = Numbers.add(var33, (SubLObject)ONE_INTEGER);
                            var44 = f11516(var43);
                            f11513(var43, var44);
                        }
                    }
                }
                final SubLObject var87_118 = var78_116;
                if (NIL == module0065.f4777(var87_118) || NIL == module0065.f4773((SubLObject)$ic32$)) {
                    final SubLObject var45 = module0065.f4738(var87_118);
                    SubLObject var46 = module0065.f4739(var87_118);
                    final SubLObject var47 = module0065.f4734(var87_118);
                    final SubLObject var48 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic32$)) ? NIL : $ic32$);
                    while (var46.numL(var47)) {
                        final SubLObject var49 = Hashtables.gethash_without_values(var46, var45, var48);
                        if (NIL == module0065.f4773((SubLObject)$ic32$) || NIL == module0065.f4749(var49)) {
                            module0012.note_percent_progress(var33, var32);
                            var33 = Numbers.add(var33, (SubLObject)ONE_INTEGER);
                            final SubLObject var50 = f11516(var49);
                            f11513(var49, var50);
                        }
                        var46 = Numbers.add(var46, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var37, var29);
            module0012.$g77$.rebind(var36, var29);
            module0012.$g76$.rebind(var35, var29);
            module0012.$g75$.rebind(var34, var29);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11543() {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        SubLObject var31 = (SubLObject)ZERO_INTEGER;
        final SubLObject var32 = module0179.f11398();
        final SubLObject var33 = (SubLObject)$ic34$;
        final SubLObject var34 = module0065.f4733(var32);
        SubLObject var35 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var33) : var33;
        final SubLObject var36 = module0012.$g75$.currentBinding(var29);
        final SubLObject var37 = module0012.$g76$.currentBinding(var29);
        final SubLObject var38 = module0012.$g77$.currentBinding(var29);
        final SubLObject var39 = module0012.$g78$.currentBinding(var29);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var29);
            module0012.$g76$.bind((SubLObject)NIL, var29);
            module0012.$g77$.bind((SubLObject)T, var29);
            module0012.$g78$.bind(Time.get_universal_time(), var29);
            module0012.f478(var33);
            final SubLObject var78_121 = var32;
            if (NIL == module0065.f4772(var78_121, (SubLObject)$ic32$)) {
                final SubLObject var80_122 = var78_121;
                if (NIL == module0065.f4775(var80_122, (SubLObject)$ic32$)) {
                    final SubLObject var40 = module0065.f4740(var80_122);
                    final SubLObject var41 = (SubLObject)NIL;
                    SubLObject var42;
                    SubLObject var43;
                    SubLObject var44;
                    SubLObject var45;
                    SubLObject var46;
                    SubLObject var47;
                    for (var42 = Sequences.length(var40), var43 = (SubLObject)NIL, var43 = (SubLObject)ZERO_INTEGER; var43.numL(var42); var43 = Numbers.add(var43, (SubLObject)ONE_INTEGER)) {
                        var44 = ((NIL != var41) ? Numbers.subtract(var42, var43, (SubLObject)ONE_INTEGER) : var43);
                        var45 = Vectors.aref(var40, var44);
                        if (NIL == module0065.f4749(var45) || NIL == module0065.f4773((SubLObject)$ic32$)) {
                            if (NIL != module0065.f4749(var45)) {
                                var45 = (SubLObject)$ic32$;
                            }
                            module0012.note_percent_progress(var35, var34);
                            var35 = Numbers.add(var35, (SubLObject)ONE_INTEGER);
                            var46 = f11516(var45);
                            var47 = module0067.f4885(var30, var46, (SubLObject)UNPROVIDED);
                            if (NIL != var47) {
                                f11544(var47, var45);
                                var31 = Numbers.add(var31, (SubLObject)ONE_INTEGER);
                            }
                            else {
                                module0067.f4886(var30, var46, var45);
                            }
                        }
                    }
                }
                final SubLObject var87_124 = var78_121;
                if (NIL == module0065.f4777(var87_124) || NIL == module0065.f4773((SubLObject)$ic32$)) {
                    final SubLObject var48 = module0065.f4738(var87_124);
                    SubLObject var49 = module0065.f4739(var87_124);
                    final SubLObject var50 = module0065.f4734(var87_124);
                    final SubLObject var51 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic32$)) ? NIL : $ic32$);
                    while (var49.numL(var50)) {
                        final SubLObject var52 = Hashtables.gethash_without_values(var49, var48, var51);
                        if (NIL == module0065.f4773((SubLObject)$ic32$) || NIL == module0065.f4749(var52)) {
                            module0012.note_percent_progress(var35, var34);
                            var35 = Numbers.add(var35, (SubLObject)ONE_INTEGER);
                            final SubLObject var53 = f11516(var52);
                            final SubLObject var54 = module0067.f4885(var30, var53, (SubLObject)UNPROVIDED);
                            if (NIL != var54) {
                                f11544(var54, var52);
                                var31 = Numbers.add(var31, (SubLObject)ONE_INTEGER);
                            }
                            else {
                                module0067.f4886(var30, var53, var52);
                            }
                        }
                        var49 = Numbers.add(var49, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var39, var29);
            module0012.$g77$.rebind(var38, var29);
            module0012.$g76$.rebind(var37, var29);
            module0012.$g75$.rebind(var36, var29);
        }
        return var31;
    }
    
    public static SubLObject f11544(final SubLObject var123, final SubLObject var125) {
        SubLObject var127;
        final SubLObject var126 = var127 = module0179.f11401(var125);
        SubLObject var128 = (SubLObject)NIL;
        var128 = var127.first();
        while (NIL != var127) {
            f11518(var125, var128);
            final SubLObject var129 = module0188.f11770(var128);
            final SubLObject var130 = Sequences.nsubstitute(var123, var125, var129, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0187.f11757(var128, var130);
            f11517(var123, var128);
            var127 = var127.rest();
            var128 = var127.first();
        }
        f11528(var125);
        return var123;
    }
    
    public static SubLObject f11545() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11492", "S#14311", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11493", "S#14302", 1, 0, false);
        new $f11493$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11494", "S#14312", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11495", "S#14313", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11496", "S#14314", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11497", "S#14315", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11498", "S#14316", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11499", "S#14317", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11500", "S#14318", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11501", "S#14319", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11502", "S#14203", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11503", "S#14191", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11504", "S#14192", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11505", "S#14320", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11506", "S#14321", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11507", "S#14322", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11509", "S#14323", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11510", "S#14258", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11511", "S#14257", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11515", "S#14256", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11508", "S#14190", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11516", "S#14198", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11517", "S#14266", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11518", "S#14324", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11519", "S#14267", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11520", "S#14325", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11521", "S#14265", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11522", "S#14326", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11523", "S#14264", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11524", "S#14327", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11525", "S#14201", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11526", "S#14328", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11512", "S#14329", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11514", "S#14330", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11527", "S#14261", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11528", "S#14260", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11530", "S#14308", 1, 0, false);
        new $f11530$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11531", "S#14331", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11532", "S#14332", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11533", "S#14262", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11534", "S#14263", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11535", "S#14333", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11537", "S#14334", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11538", "S#14335", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11536", "S#14336", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11513", "S#14337", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11529", "S#14338", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11540", "S#14339", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11539", "S#14340", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11541", "S#14202", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11542", "S#14341", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11543", "S#14342", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0182", "f11544", "S#14343", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11546() {
        $g2220$ = SubLFiles.defconstant("S#14344", (SubLObject)$ic0$);
        $g2222$ = SubLFiles.deflexical("S#14345", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic23$)) ? $g2222$.getGlobalValue() : NIL));
        $g2213$ = SubLFiles.deflexical("S#14346", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic24$)) ? $g2213$.getGlobalValue() : NIL));
        $g2223$ = SubLFiles.deflexical("S#14347", Locks.make_lock((SubLObject)$ic25$));
        $g2224$ = SubLFiles.deflexical("S#14348", (SubLObject)$ic26$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11547() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g2220$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic8$);
        Structures.def_csetf((SubLObject)$ic9$, (SubLObject)$ic10$);
        Structures.def_csetf((SubLObject)$ic11$, (SubLObject)$ic12$);
        Equality.identity((SubLObject)$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g2220$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic20$));
        module0003.f57((SubLObject)$ic23$);
        module0003.f57((SubLObject)$ic24$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f11545();
    }
    
    public void initializeVariables() {
        f11546();
    }
    
    public void runTopLevelForms() {
        f11547();
    }
    
    static {
        me = (SubLFile)new module0182();
        $g2220$ = null;
        $g2222$ = null;
        $g2213$ = null;
        $g2223$ = null;
        $g2224$ = null;
        $ic0$ = makeSymbol("S#14190", "CYC");
        $ic1$ = makeSymbol("S#14302", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)makeSymbol("S#9952", "CYC"), (SubLObject)makeSymbol("S#14274", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)makeKeyword("ARGUMENT"), (SubLObject)makeKeyword("DEPENDENTS"));
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("S#14312", "CYC"), (SubLObject)makeSymbol("S#14313", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#14314", "CYC"), (SubLObject)makeSymbol("S#14315", "CYC"));
        $ic6$ = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic7$ = makeSymbol("S#14311", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#14302", "CYC"));
        $ic9$ = makeSymbol("S#14312", "CYC");
        $ic10$ = makeSymbol("S#14314", "CYC");
        $ic11$ = makeSymbol("S#14313", "CYC");
        $ic12$ = makeSymbol("S#14315", "CYC");
        $ic13$ = makeKeyword("ARGUMENT");
        $ic14$ = makeKeyword("DEPENDENTS");
        $ic15$ = makeString("Invalid slot ~S for construction function");
        $ic16$ = makeKeyword("BEGIN");
        $ic17$ = makeSymbol("S#14316", "CYC");
        $ic18$ = makeKeyword("SLOT");
        $ic19$ = makeKeyword("END");
        $ic20$ = makeSymbol("S#14318", "CYC");
        $ic21$ = makeString("NIL justification for verified KB HL support ~a ~a");
        $ic22$ = makeKeyword("UNJUSTIFIABLE");
        $ic23$ = makeSymbol("S#14345", "CYC");
        $ic24$ = makeSymbol("S#14346", "CYC");
        $ic25$ = makeString("KB HL support indexing lock");
        $ic26$ = ConsesLow.list(new SubLObject[] { constant_handles_oc.f8479((SubLObject)makeString("isa")), constant_handles_oc.f8479((SubLObject)makeString("DefaultSemanticsForStringFn")), constant_handles_oc.f8479((SubLObject)makeString("evaluate")), constant_handles_oc.f8479((SubLObject)makeString("genlInverse")), constant_handles_oc.f8479((SubLObject)makeString("genlPreds")), constant_handles_oc.f8479((SubLObject)makeString("genls")), constant_handles_oc.f8479((SubLObject)makeString("ist")), constant_handles_oc.f8479((SubLObject)makeString("ist-Asserted")), constant_handles_oc.f8479((SubLObject)makeString("SubLStringConcatenationFn")), constant_handles_oc.f8479((SubLObject)makeString("TheList")), constant_handles_oc.f8479((SubLObject)makeString("TheSet")) });
        $ic27$ = makeSymbol("INDEXED-TERM-P");
        $ic28$ = makeSymbol("S#14308", "CYC");
        $ic29$ = ConsesLow.list((SubLObject)makeSymbol("S#205", "CYC"), (SubLObject)makeSymbol("S#14349", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#10995", "CYC"));
        $ic30$ = makeString("mapping Cyc KB HL supports");
        $ic31$ = makeSymbol("STRINGP");
        $ic32$ = makeKeyword("SKIP");
        $ic33$ = makeString("reindexing KB HL supports");
        $ic34$ = makeString("Eliminating duplicate KB HL supports");
    }
    
    public static final class $sX14190_native extends SubLStructNative
    {
        public SubLObject $argument;
        public SubLObject $dependents;
        private static final SubLStructDeclNative structDecl;
        
        public $sX14190_native() {
            this.$argument = (SubLObject)CommonSymbols.NIL;
            this.$dependents = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX14190_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$argument;
        }
        
        public SubLObject getField3() {
            return this.$dependents;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$argument = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$dependents = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX14190_native.class, $ic0$, $ic1$, $ic2$, $ic3$, new String[] { "$argument", "$dependents" }, $ic4$, $ic5$, $ic6$);
        }
    }
    
    public static final class $f11493$UnaryFunction extends UnaryFunction
    {
        public $f11493$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#14302"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f11493(var3);
        }
    }
    
    public static final class $f11530$UnaryFunction extends UnaryFunction
    {
        public $f11530$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#14308"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f11530(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 352 ms
	
	Decompiled with Procyon 0.5.32.
*/