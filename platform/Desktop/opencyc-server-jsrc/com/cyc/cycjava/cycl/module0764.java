package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0764 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0764";
    public static final String myFingerPrint = "25be2ac30680a8a0639654dfb1a095946829a324996f329266e7655f78b5ab77";
    private static SubLSymbol $g6115$;
    private static SubLSymbol $g6116$;
    private static final SubLSymbol $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLInteger $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLString $ic7$;
    private static final SubLString $ic8$;
    private static final SubLString $ic9$;
    private static final SubLString $ic10$;
    private static final SubLString $ic11$;
    private static final SubLString $ic12$;
    private static final SubLString $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLObject $ic20$;
    private static final SubLList $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLInteger $ic24$;
    private static final SubLList $ic25$;
    private static final SubLObject $ic26$;
    private static final SubLList $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLObject $ic29$;
    private static final SubLList $ic30$;
    private static final SubLObject $ic31$;
    private static final SubLList $ic32$;
    private static final SubLObject $ic33$;
    private static final SubLObject $ic34$;
    private static final SubLList $ic35$;
    private static final SubLString $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLObject $ic38$;
    private static final SubLObject $ic39$;
    private static final SubLObject $ic40$;
    private static final SubLList $ic41$;
    private static final SubLObject $ic42$;
    private static final SubLObject $ic43$;
    private static final SubLObject $ic44$;
    private static final SubLList $ic45$;
    private static final SubLList $ic46$;
    private static final SubLList $ic47$;
    private static final SubLObject $ic48$;
    private static final SubLList $ic49$;
    private static final SubLString $ic50$;
    private static final SubLList $ic51$;
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLList $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLString $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLObject $ic63$;
    private static final SubLObject $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLObject $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLList $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLObject $ic74$;
    private static final SubLString $ic75$;
    private static final SubLObject $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLObject $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLObject $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLObject $ic83$;
    private static final SubLObject $ic84$;
    private static final SubLObject $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLList $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLString $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLObject $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLObject $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLString $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLString $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLString $ic107$;
    private static final SubLObject $ic108$;
    private static final SubLString $ic109$;
    private static final SubLString $ic110$;
    private static final SubLString $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLObject $ic113$;
    private static final SubLObject $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLList $ic116$;
    private static final SubLList $ic117$;
    private static final SubLString $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLList $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLString $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLString $ic126$;
    private static final SubLString $ic127$;
    private static final SubLInteger $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLString $ic130$;
    private static final SubLList $ic131$;
    private static final SubLObject $ic132$;
    private static final SubLInteger $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLInteger $ic135$;
    private static final SubLString $ic136$;
    private static final SubLString $ic137$;
    private static final SubLString $ic138$;
    private static final SubLObject $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLList $ic142$;
    private static final SubLObject $ic143$;
    private static final SubLList $ic144$;
    private static final SubLObject $ic145$;
    private static final SubLObject $ic146$;
    private static final SubLObject $ic147$;
    private static final SubLObject $ic148$;
    private static final SubLObject $ic149$;
    private static final SubLObject $ic150$;
    private static final SubLString $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLList $ic156$;
    private static final SubLObject $ic157$;
    private static final SubLObject $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLString $ic160$;
    private static final SubLString $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLObject $ic163$;
    private static final SubLObject $ic164$;
    private static final SubLObject $ic165$;
    private static final SubLList $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLString $ic168$;
    private static final SubLString $ic169$;
    private static final SubLList $ic170$;
    private static final SubLObject $ic171$;
    private static final SubLObject $ic172$;
    private static final SubLObject $ic173$;
    private static final SubLObject $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLObject $ic176$;
    private static final SubLObject $ic177$;
    private static final SubLString $ic178$;
    private static final SubLString $ic179$;
    private static final SubLString $ic180$;
    private static final SubLList $ic181$;
    private static final SubLString $ic182$;
    private static final SubLList $ic183$;
    
    public static SubLObject f48409(final SubLObject var1, SubLObject var2) {
        if (var2 == module0764.UNPROVIDED) {
            var2 = (SubLObject)module0764.$ic0$;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0764.NIL;
        SubLObject var5 = (SubLObject)module0764.NIL;
        if (module0764.NIL != module0212.f13762(var1)) {
            final SubLObject var6 = module0147.f9540(module0579.$g4260$.getDynamicValue(var3));
            final SubLObject var7 = module0147.$g2095$.currentBinding(var3);
            final SubLObject var8 = module0147.$g2094$.currentBinding(var3);
            final SubLObject var9 = module0147.$g2096$.currentBinding(var3);
            try {
                module0147.$g2095$.bind(module0147.f9545(var6), var3);
                module0147.$g2094$.bind(module0147.f9546(var6), var3);
                module0147.$g2096$.bind(module0147.f9549(var6), var3);
                final SubLObject var10 = module0219.f14510(var1, (SubLObject)module0764.ONE_INTEGER, module0764.$ic1$, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                final SubLObject var11 = module0220.f14562(var1, module0764.$ic1$, (SubLObject)module0764.ONE_INTEGER, (SubLObject)module0764.THREE_INTEGER, (SubLObject)module0764.UNPROVIDED);
                if (module0764.NIL != var10) {
                    final SubLObject var12 = var2;
                    if (var12.eql((SubLObject)module0764.$ic0$)) {
                        final SubLObject var13 = var10.first();
                        var5 = module0178.f11336(var13);
                        var4 = module0178.f11337(var13);
                    }
                    else {
                        final SubLObject var14 = module0035.f2226(module0751.f47037(var2), var11, Symbols.symbol_function((SubLObject)module0764.EQL), (SubLObject)module0764.UNPROVIDED);
                        if (module0764.NIL == var5) {
                            SubLObject var15 = var14;
                            SubLObject var16 = (SubLObject)module0764.NIL;
                            var16 = var15.first();
                            while (module0764.NIL == var5 && module0764.NIL != var15) {
                                if (module0764.NIL == var5) {
                                    SubLObject var15_17 = var10;
                                    SubLObject var17 = (SubLObject)module0764.NIL;
                                    var17 = var15_17.first();
                                    while (module0764.NIL == var5 && module0764.NIL != var15_17) {
                                        if (var16.eql(module0178.f11336(var17))) {
                                            var4 = module0178.f11337(var17);
                                            var5 = var16;
                                        }
                                        var15_17 = var15_17.rest();
                                        var17 = var15_17.first();
                                    }
                                }
                                var15 = var15.rest();
                                var16 = var15.first();
                            }
                        }
                    }
                }
            }
            finally {
                module0147.$g2096$.rebind(var9, var3);
                module0147.$g2094$.rebind(var8, var3);
                module0147.$g2095$.rebind(var7, var3);
            }
        }
        return (SubLObject)ConsesLow.list(var4, var5);
    }
    
    public static SubLObject f48410(final SubLObject var1, SubLObject var2) {
        if (var2 == module0764.UNPROVIDED) {
            var2 = (SubLObject)module0764.NIL;
        }
        return f48409(var1, (SubLObject)module0764.UNPROVIDED);
    }
    
    public static SubLObject f48411(final SubLObject var1, SubLObject var2) {
        if (var2 == module0764.UNPROVIDED) {
            var2 = (SubLObject)module0764.$ic0$;
        }
        final SubLObject var3 = f48412(var1, (SubLObject)module0764.UNPROVIDED);
        final SubLObject var4 = f48413(var3, var1, var2, (SubLObject)module0764.UNPROVIDED);
        if (module0764.NIL != module0749.f46482(var4)) {
            module0749.f46468(var4, var1);
        }
        return var4;
    }
    
    public static SubLObject f48414(final SubLObject var1, SubLObject var23) {
        if (var23 == module0764.UNPROVIDED) {
            var23 = module0579.$g4260$.getDynamicValue();
        }
        final SubLThread var24 = SubLProcess.currentSubLThread();
        SubLObject var25 = (SubLObject)module0764.NIL;
        final SubLObject var26 = module0147.f9540(var23);
        final SubLObject var27 = module0147.$g2095$.currentBinding(var24);
        final SubLObject var28 = module0147.$g2094$.currentBinding(var24);
        final SubLObject var29 = module0147.$g2096$.currentBinding(var24);
        try {
            module0147.$g2095$.bind(module0147.f9545(var26), var24);
            module0147.$g2094$.bind(module0147.f9546(var26), var24);
            module0147.$g2096$.bind(module0147.f9549(var26), var24);
            var25 = module0219.f14510(var1, (SubLObject)module0764.ONE_INTEGER, module0764.$ic3$, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
        }
        finally {
            module0147.$g2096$.rebind(var29, var24);
            module0147.$g2094$.rebind(var28, var24);
            module0147.$g2095$.rebind(var27, var24);
        }
        return var25;
    }
    
    public static SubLObject f48412(final SubLObject var1, SubLObject var23) {
        if (var23 == module0764.UNPROVIDED) {
            var23 = module0579.$g4260$.getDynamicValue();
        }
        final SubLThread var24 = SubLProcess.currentSubLThread();
        final SubLObject var25 = module0034.$g879$.getDynamicValue(var24);
        SubLObject var26 = (SubLObject)module0764.NIL;
        if (module0764.NIL == var25) {
            return f48414(var1, var23);
        }
        var26 = module0034.f1857(var25, (SubLObject)module0764.$ic2$, (SubLObject)module0764.UNPROVIDED);
        if (module0764.NIL == var26) {
            var26 = module0034.f1807(module0034.f1842(var25), (SubLObject)module0764.$ic2$, (SubLObject)module0764.TWO_INTEGER, (SubLObject)module0764.$ic4$, (SubLObject)module0764.EQUAL, (SubLObject)module0764.UNPROVIDED);
            module0034.f1860(var25, (SubLObject)module0764.$ic2$, var26);
        }
        final SubLObject var27 = module0034.f1782(var1, var23);
        final SubLObject var28 = module0034.f1814(var26, var27, (SubLObject)module0764.UNPROVIDED);
        if (var28 != module0764.$ic5$) {
            SubLObject var29 = var28;
            SubLObject var30 = (SubLObject)module0764.NIL;
            var30 = var29.first();
            while (module0764.NIL != var29) {
                SubLObject var31 = var30.first();
                final SubLObject var32 = conses_high.second(var30);
                if (var1.equal(var31.first())) {
                    var31 = var31.rest();
                    if (module0764.NIL != var31 && module0764.NIL == var31.rest() && var23.equal(var31.first())) {
                        return module0034.f1959(var32);
                    }
                }
                var29 = var29.rest();
                var30 = var29.first();
            }
        }
        final SubLObject var33 = Values.arg2(var24.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f48414(var1, var23)));
        module0034.f1836(var26, var27, var28, var33, (SubLObject)ConsesLow.list(var1, var23));
        return module0034.f1959(var33);
    }
    
    public static SubLObject f48415(final SubLObject var1, SubLObject var2) {
        if (var2 == module0764.UNPROVIDED) {
            var2 = (SubLObject)module0764.$ic0$;
        }
        return f48416(var1, var2, (SubLObject)module0764.T);
    }
    
    public static SubLObject f48416(final SubLObject var1, SubLObject var2, SubLObject var33) {
        if (var2 == module0764.UNPROVIDED) {
            var2 = (SubLObject)module0764.$ic0$;
        }
        if (var33 == module0764.UNPROVIDED) {
            var33 = (SubLObject)module0764.NIL;
        }
        final SubLThread var34 = SubLProcess.currentSubLThread();
        if (module0764.NIL == var2) {
            var2 = (SubLObject)module0764.$ic0$;
        }
        if (module0764.NIL == module0173.f10955(var1) || module0764.NIL != module0731.f44764(var1, (SubLObject)module0764.UNPROVIDED) || module0764.NIL != module0269.f17723(var1)) {
            return (SubLObject)module0764.NIL;
        }
        final SubLObject var35 = module0732.f45097(var1, module0579.$g4260$.getDynamicValue(var34), var33, var2);
        if (module0764.NIL == var35) {
            if (module0764.NIL != module0578.f35470((SubLObject)module0764.TWO_INTEGER)) {
                PrintLow.format((SubLObject)module0764.T, (SubLObject)module0764.$ic6$, var1);
            }
            return (SubLObject)module0764.NIL;
        }
        final SubLObject var36 = f48417(var35, var1, var2, (SubLObject)module0764.UNPROVIDED);
        if (module0764.NIL != module0749.f46482(var36)) {
            module0749.f46468(var36, var1);
        }
        return var36;
    }
    
    public static SubLObject f48417(final SubLObject var36, final SubLObject var1, SubLObject var2, SubLObject var37) {
        if (var2 == module0764.UNPROVIDED) {
            var2 = (SubLObject)module0764.$ic0$;
        }
        if (var37 == module0764.UNPROVIDED) {
            var37 = (SubLObject)module0764.T;
        }
        final SubLThread var38 = SubLProcess.currentSubLThread();
        SubLObject var39 = (SubLObject)module0764.NIL;
        SubLObject var40 = (SubLObject)module0764.NIL;
        SubLObject var41 = (SubLObject)module0764.NIL;
        if (module0764.NIL == var40) {
            SubLObject var42 = var36;
            SubLObject var43 = (SubLObject)module0764.NIL;
            var43 = var42.first();
            while (module0764.NIL == var40 && module0764.NIL != var42) {
                var38.resetMultipleValues();
                final SubLObject var44 = f48418(var43, var1, var2, var37, (SubLObject)module0764.NIL);
                final SubLObject var45 = var38.secondMultipleValue();
                var38.resetMultipleValues();
                if (module0764.NIL != var45) {
                    var40 = var44;
                }
                else if (module0764.NIL != var44) {
                    var39 = (SubLObject)ConsesLow.cons(var44, var39);
                    var41 = (SubLObject)ConsesLow.cons(var43, var41);
                }
                var42 = var42.rest();
                var43 = var42.first();
            }
        }
        if (module0764.NIL == var40) {
            SubLObject var42 = var36;
            SubLObject var43 = (SubLObject)module0764.NIL;
            var43 = var42.first();
            while (module0764.NIL == var40 && module0764.NIL != var42) {
                if (module0764.NIL == module0004.f104(var43, var41, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED)) {
                    var38.resetMultipleValues();
                    final SubLObject var44 = f48418(var43, var1, var2, var37, (SubLObject)module0764.T);
                    final SubLObject var45 = var38.secondMultipleValue();
                    var38.resetMultipleValues();
                    if (module0764.NIL != var45) {
                        var40 = var44;
                    }
                    else if (module0764.NIL != var44) {
                        var39 = (SubLObject)ConsesLow.cons(var44, var39);
                    }
                }
                var42 = var42.rest();
                var43 = var42.first();
            }
        }
        if (module0764.NIL == module0749.f46482(var40)) {
            var39 = Sequences.nreverse(var39);
            var39 = f48419(var39);
            if (module0764.NIL != module0578.f35470((SubLObject)module0764.TWO_INTEGER)) {
                PrintLow.format((SubLObject)module0764.T, (SubLObject)module0764.$ic7$, var39);
            }
            if (module0764.NIL != var39) {
                if (var2 == module0764.$ic0$) {
                    return var39.first();
                }
                if (var2.isList()) {
                    if (module0764.NIL == var40) {
                        SubLObject var42 = var2;
                        SubLObject var46 = (SubLObject)module0764.NIL;
                        var46 = var42.first();
                        while (module0764.NIL == var40 && module0764.NIL != var42) {
                            if (module0764.NIL == var40) {
                                SubLObject var15_44 = var39;
                                SubLObject var47 = (SubLObject)module0764.NIL;
                                var47 = var15_44.first();
                                while (module0764.NIL == var40 && module0764.NIL != var15_44) {
                                    if (module0764.NIL != f48420(var47, var46)) {
                                        var40 = var47;
                                    }
                                    var15_44 = var15_44.rest();
                                    var47 = var15_44.first();
                                }
                            }
                            var42 = var42.rest();
                            var46 = var42.first();
                        }
                    }
                }
                else {
                    final SubLObject var48 = Sequences.cconcatenate((SubLObject)module0764.$ic8$, new SubLObject[] { module0006.f205((SubLObject)module0764.ONE_INTEGER), module0764.$ic9$, module0006.f203((SubLObject)module0764.$ic10$) });
                    module0578.f35476(var48, (SubLObject)ConsesLow.list(var2));
                }
            }
        }
        return var40;
    }
    
    public static SubLObject f48418(final SubLObject var41, final SubLObject var1, final SubLObject var2, final SubLObject var37, final SubLObject var46) {
        final SubLObject var47 = f48421(var41, var2, var37, var46);
        return f48422(var47, var1, var2);
    }
    
    public static SubLObject f48423(final SubLObject var47, final SubLObject var1, final SubLObject var2, final SubLObject var37, final SubLObject var46) {
        final SubLThread var48 = SubLProcess.currentSubLThread();
        var48.resetMultipleValues();
        final SubLObject var49 = f48424(var47, var1, var2, var37, var46, (SubLObject)module0764.UNPROVIDED);
        SubLObject var50 = var48.secondMultipleValue();
        var48.resetMultipleValues();
        var48.resetMultipleValues();
        SubLObject var51 = f48422(var49, var1, var2);
        SubLObject var52 = var48.secondMultipleValue();
        var48.resetMultipleValues();
        while (module0764.NIL != var50 && module0764.NIL == var51) {
            var48.resetMultipleValues();
            final SubLObject var50_51 = f48422(var50.first(), var1, var2);
            final SubLObject var52_53 = var48.secondMultipleValue();
            var48.resetMultipleValues();
            var51 = var50_51;
            var52 = var52_53;
            var50 = var50.rest();
        }
        return Values.values(var51, var52, var50);
    }
    
    public static SubLObject f48422(SubLObject var35, final SubLObject var1, final SubLObject var2) {
        final SubLThread var36 = SubLProcess.currentSubLThread();
        SubLObject var37 = (SubLObject)module0764.NIL;
        if (module0764.NIL != var35) {
            if (module0764.NIL != module0579.f35492() && module0764.NIL != module0756.f47694(var1) && module0764.NIL != module0579.f35493(var1, module0749.f46455(var35))) {
                if (module0764.NIL != module0578.f35470((SubLObject)module0764.TWO_INTEGER) && module0764.NIL == module0578.f35477()) {
                    Errors.warn((SubLObject)module0764.$ic11$, module0749.f46455(var35), var1);
                }
                var35 = (SubLObject)module0764.NIL;
            }
            else if (module0764.NIL == module0579.$g4285$.getDynamicValue(var36)) {
                if (module0764.NIL != f48425(var35, (SubLObject)(var2.isList() ? ConsesLow.list(var2.first()) : var2))) {
                    var37 = (SubLObject)module0764.T;
                }
                else if (var2.isList() && module0764.NIL == f48425(var35, var2)) {
                    var35 = (SubLObject)module0764.NIL;
                }
            }
        }
        return Values.values(var35, var37);
    }
    
    public static SubLObject f48413(final SubLObject var10, final SubLObject var1, SubLObject var2, SubLObject var37) {
        if (var2 == module0764.UNPROVIDED) {
            var2 = (SubLObject)module0764.$ic0$;
        }
        if (var37 == module0764.UNPROVIDED) {
            var37 = (SubLObject)module0764.T;
        }
        final SubLThread var38 = SubLProcess.currentSubLThread();
        SubLObject var39 = (SubLObject)module0764.NIL;
        SubLObject var40 = (SubLObject)module0764.NIL;
        SubLObject var41 = (SubLObject)module0764.NIL;
        SubLObject var42 = (SubLObject)module0764.NIL;
        SubLObject var43 = (SubLObject)module0764.NIL;
        if (module0764.NIL == var42) {
            SubLObject var44 = var10;
            SubLObject var45 = (SubLObject)module0764.NIL;
            var45 = var44.first();
            while (module0764.NIL == var42 && module0764.NIL != var44) {
                var38.resetMultipleValues();
                final SubLObject var46 = f48423(var45, var1, var2, var37, (SubLObject)module0764.NIL);
                final SubLObject var47 = var38.secondMultipleValue();
                final SubLObject var48 = var38.thirdMultipleValue();
                var38.resetMultipleValues();
                if (module0764.NIL != var47 && module0764.NIL == var40) {
                    var40 = var46;
                    var42 = (SubLObject)SubLObjectFactory.makeBoolean(module0764.NIL == module0579.f35485());
                }
                else if (module0764.NIL != var46) {
                    var39 = (SubLObject)ConsesLow.cons(var46, var39);
                    var43 = (SubLObject)ConsesLow.cons(var45, var43);
                }
                SubLObject var49 = var48;
                SubLObject var50 = (SubLObject)module0764.NIL;
                var50 = var49.first();
                while (module0764.NIL != var49) {
                    var39 = (SubLObject)ConsesLow.cons(var50, var39);
                    var49 = var49.rest();
                    var50 = var49.first();
                }
                var44 = var44.rest();
                var45 = var44.first();
            }
        }
        if (module0764.NIL != module0579.$g4289$.getDynamicValue(var38) && module0764.NIL == var40) {
            SubLObject var44 = var10;
            SubLObject var45 = (SubLObject)module0764.NIL;
            var45 = var44.first();
            while (module0764.NIL == var40 && module0764.NIL != var44) {
                if (module0764.NIL == module0004.f104(var45, var43, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED)) {
                    var38.resetMultipleValues();
                    final SubLObject var46 = f48423(var45, var1, var2, var37, (SubLObject)module0764.T);
                    final SubLObject var47 = var38.secondMultipleValue();
                    final SubLObject var48 = var38.thirdMultipleValue();
                    var38.resetMultipleValues();
                    if (module0764.NIL != var47 && module0764.NIL == var40) {
                        var40 = var46;
                    }
                    else if (module0764.NIL != var46) {
                        var39 = (SubLObject)ConsesLow.cons(var46, var39);
                    }
                    SubLObject var49 = var48;
                    SubLObject var50 = (SubLObject)module0764.NIL;
                    var50 = var49.first();
                    while (module0764.NIL != var49) {
                        var39 = (SubLObject)ConsesLow.cons(var50, var39);
                        var49 = var49.rest();
                        var50 = var49.first();
                    }
                }
                var44 = var44.rest();
                var45 = var44.first();
            }
        }
        if (module0764.NIL == var42) {
            var39 = Sequences.nreverse(var39);
            var39 = f48419(var39);
            if (module0764.NIL != module0578.f35470((SubLObject)module0764.TWO_INTEGER)) {
                PrintLow.format((SubLObject)module0764.T, (SubLObject)module0764.$ic12$, var39);
            }
            if (module0764.NIL != var39) {
                if (var2 == module0764.$ic0$) {
                    if (module0764.NIL == var40) {
                        var40 = var39.first();
                        var39 = var39.rest();
                    }
                    var41 = var39;
                }
                else if (var2.isList()) {
                    SubLObject var51 = var2;
                    SubLObject var52 = (SubLObject)module0764.NIL;
                    var52 = var51.first();
                    while (module0764.NIL != var51) {
                        SubLObject var28_58 = var39;
                        SubLObject var53 = (SubLObject)module0764.NIL;
                        var53 = var28_58.first();
                        while (module0764.NIL != var28_58) {
                            if (module0764.NIL != f48420(var53, var52)) {
                                if (module0764.NIL != var40) {
                                    final SubLObject var54 = var53;
                                    if (module0764.NIL == conses_high.member(var54, var41, Symbols.symbol_function((SubLObject)module0764.EQUALP), Symbols.symbol_function((SubLObject)module0764.IDENTITY))) {
                                        var41 = (SubLObject)ConsesLow.cons(var54, var41);
                                    }
                                }
                                else {
                                    var40 = var53;
                                }
                            }
                            var28_58 = var28_58.rest();
                            var53 = var28_58.first();
                        }
                        var51 = var51.rest();
                        var52 = var51.first();
                    }
                    var41 = Sequences.nreverse(var41);
                }
                else {
                    final SubLObject var55 = Sequences.cconcatenate((SubLObject)module0764.$ic8$, new SubLObject[] { module0006.f205((SubLObject)module0764.ONE_INTEGER), module0764.$ic9$, module0006.f203((SubLObject)module0764.$ic10$) });
                    module0578.f35476(var55, (SubLObject)ConsesLow.list(var2));
                }
            }
        }
        return Values.values(var40, Sequences.remove(var40, Sequences.delete_duplicates(var41, Symbols.symbol_function((SubLObject)module0764.EQUALP), (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED), Symbols.symbol_function((SubLObject)module0764.EQUALP), (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED));
    }
    
    public static SubLObject f48425(final SubLObject var35, final SubLObject var2) {
        if (module0764.NIL == module0753.f47268(module0749.f46455(var35), module0749.f46466(var35)) && module0764.NIL != module0753.f47264(var35)) {
            return (SubLObject)module0764.NIL;
        }
        if (module0764.$ic0$ == var2) {
            return (SubLObject)module0764.T;
        }
        if (var2.isList()) {
            SubLObject var36 = (SubLObject)module0764.NIL;
            if (module0764.NIL == var36) {
                SubLObject var37;
                SubLObject var38;
                for (var37 = var2, var38 = (SubLObject)module0764.NIL, var38 = var37.first(); module0764.NIL == var36 && module0764.NIL != var37; var36 = f48420(var35, var38), var37 = var37.rest(), var38 = var37.first()) {}
            }
            return var36;
        }
        final SubLObject var39 = Sequences.cconcatenate((SubLObject)module0764.$ic8$, new SubLObject[] { module0006.f205((SubLObject)module0764.ONE_INTEGER), module0764.$ic9$, module0006.f203((SubLObject)module0764.$ic10$) });
        module0578.f35476(var39, (SubLObject)ConsesLow.list(var2));
        return (SubLObject)module0764.NIL;
    }
    
    public static SubLObject f48420(final SubLObject var35, final SubLObject var16) {
        final SubLThread var36 = SubLProcess.currentSubLThread();
        SubLObject var37 = (SubLObject)module0764.NIL;
        if (module0764.NIL != module0212.f13762(var16)) {
            if (module0764.NIL != module0578.f35470((SubLObject)module0764.THREE_INTEGER)) {
                PrintLow.format((SubLObject)module0764.T, (SubLObject)module0764.$ic13$, var35);
            }
            final SubLObject var38 = module0749.f46470(var35);
            if (module0764.NIL != module0173.f10955(var38) && (module0764.NIL != module0751.f46658(var38, var16, module0579.$g4260$.getDynamicValue(var36)) || (module0764.NIL != module0751.f47107(var38) && module0764.NIL != f48426(var35, var16)))) {
                var37 = (SubLObject)module0764.T;
            }
        }
        return var37;
    }
    
    public static SubLObject f48426(final SubLObject var35, final SubLObject var16) {
        final SubLObject var36 = module0749.f46470(var35);
        final SubLObject var37 = module0749.f46455(var35);
        final SubLObject var38 = module0749.f46466(var35);
        return f48427(var37, var38, var36, var16);
    }
    
    public static SubLObject f48427(final SubLObject var63, final SubLObject var64, final SubLObject var62, final SubLObject var16) {
        if (module0764.NIL != module0767.f48858(var62, var16)) {
            return (SubLObject)module0764.T;
        }
        if (module0764.NIL == module0751.f46658(var16, module0764.$ic14$, (SubLObject)module0764.UNPROVIDED)) {
            return (SubLObject)module0764.NIL;
        }
        return (SubLObject)module0764.T;
    }
    
    public static SubLObject f48419(final SubLObject var38) {
        return Sort.stable_sort(var38, (SubLObject)module0764.$ic15$, (SubLObject)module0764.$ic16$);
    }
    
    public static SubLObject f48428(final SubLObject var47, SubLObject var1, SubLObject var2, SubLObject var37, SubLObject var65) {
        if (var1 == module0764.UNPROVIDED) {
            var1 = module0756.f47746();
        }
        if (var2 == module0764.UNPROVIDED) {
            var2 = (SubLObject)module0764.$ic0$;
        }
        if (var37 == module0764.UNPROVIDED) {
            var37 = (SubLObject)module0764.T;
        }
        if (var65 == module0764.UNPROVIDED) {
            var65 = (SubLObject)module0764.$ic18$;
        }
        final SubLThread var66 = SubLProcess.currentSubLThread();
        if (var2 != module0764.$ic0$) {}
        final SubLObject var67 = module0178.f11333(var47);
        final SubLObject var68 = module0732.f44998(var67);
        final SubLObject var69 = (SubLObject)(var68.isInteger() ? module0178.f11331(var47, var68) : module0764.NIL);
        SubLObject var70 = (SubLObject)module0764.NIL;
        final SubLObject var71 = module0579.$g4259$.currentBinding(var66);
        try {
            module0579.$g4259$.bind(var65, var66);
            if (var2.isList()) {
                SubLObject var72 = var2;
                SubLObject var73 = (SubLObject)module0764.NIL;
                var73 = var72.first();
                while (module0764.NIL != var72) {
                    final SubLObject var74 = f48424(var47, var1, (SubLObject)ConsesLow.list(var73), var37, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                    if (module0764.NIL != module0749.f46482(var74)) {
                        final SubLObject var75 = module0756.f47721(var74, (SubLObject)module0764.T);
                        if (module0764.NIL == conses_high.member(var75, var70, Symbols.symbol_function((SubLObject)module0764.EQUAL), Symbols.symbol_function((SubLObject)module0764.IDENTITY))) {
                            var70 = (SubLObject)ConsesLow.cons(var75, var70);
                        }
                    }
                    var72 = var72.rest();
                    var73 = var72.first();
                }
            }
            else if (module0764.NIL != module0751.f47107(var67)) {
                final SubLObject var76 = f48424(var47, (SubLObject)module0764.$ic0$, var37, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                if (module0764.NIL != module0749.f46482(var76)) {
                    final SubLObject var77 = module0749.f46455(var76);
                    if (module0764.NIL == conses_high.member(var77, var70, Symbols.symbol_function((SubLObject)module0764.EQUAL), Symbols.symbol_function((SubLObject)module0764.IDENTITY))) {
                        var70 = (SubLObject)ConsesLow.cons(var77, var70);
                    }
                }
            }
            else if (module0764.NIL != module0731.f44656(var69, (SubLObject)module0764.UNPROVIDED)) {
                var66.resetMultipleValues();
                final SubLObject var78 = module0732.f45021(module0178.f11285(var47));
                final SubLObject var79 = var66.secondMultipleValue();
                final SubLObject var80 = var66.thirdMultipleValue();
                final SubLObject var67_71 = var66.fourthMultipleValue();
                var66.resetMultipleValues();
                if (module0764.NIL != var79) {
                    final SubLObject var81 = (var2 == module0764.$ic0$) ? module0732.f44924(var67_71, (SubLObject)module0764.UNPROVIDED) : module0751.f47099(var2, module0732.f44924(var67_71, (SubLObject)module0764.UNPROVIDED), (SubLObject)module0764.UNPROVIDED);
                    SubLObject var83;
                    final SubLObject var82 = var83 = module0730.f44561(var79, var81, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                    SubLObject var84 = (SubLObject)module0764.NIL;
                    var84 = var83.first();
                    while (module0764.NIL != var83) {
                        final SubLObject var86;
                        final SubLObject var85 = var86 = module0732.f45026(var78, var84, var80);
                        if (module0764.NIL == conses_high.member(var86, var70, Symbols.symbol_function((SubLObject)module0764.EQUAL), Symbols.symbol_function((SubLObject)module0764.IDENTITY))) {
                            var70 = (SubLObject)ConsesLow.cons(var86, var70);
                        }
                        var83 = var83.rest();
                        var84 = var83.first();
                    }
                }
                else {
                    SubLObject var87 = module0751.f47099(var2, module0732.f44924(var67_71, (SubLObject)module0764.UNPROVIDED), (SubLObject)module0764.UNPROVIDED);
                    SubLObject var88 = (SubLObject)module0764.NIL;
                    var88 = var87.first();
                    while (module0764.NIL != var87) {
                        final SubLObject var89 = f48424(var47, (SubLObject)ConsesLow.list(var88), var37, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                        if (module0764.NIL != module0749.f46482(var89)) {
                            final SubLObject var90 = module0749.f46455(var89);
                            if (module0764.NIL == conses_high.member(var90, var70, Symbols.symbol_function((SubLObject)module0764.EQUAL), Symbols.symbol_function((SubLObject)module0764.IDENTITY))) {
                                var70 = (SubLObject)ConsesLow.cons(var90, var70);
                            }
                        }
                        var87 = var87.rest();
                        var88 = var87.first();
                    }
                }
            }
            else {
                final SubLObject var76 = f48424(var47, var2, var37, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                if (module0764.NIL != module0749.f46482(var76)) {
                    final SubLObject var77 = module0749.f46455(var76);
                    if (module0764.NIL == conses_high.member(var77, var70, Symbols.symbol_function((SubLObject)module0764.EQUAL), Symbols.symbol_function((SubLObject)module0764.IDENTITY))) {
                        var70 = (SubLObject)ConsesLow.cons(var77, var70);
                    }
                }
            }
        }
        finally {
            module0579.$g4259$.rebind(var71, var66);
        }
        return var70;
    }
    
    public static SubLObject f48429(final SubLObject var47, SubLObject var1, SubLObject var2, SubLObject var37, SubLObject var65) {
        if (var1 == module0764.UNPROVIDED) {
            var1 = module0756.f47746();
        }
        if (var2 == module0764.UNPROVIDED) {
            var2 = (SubLObject)module0764.$ic0$;
        }
        if (var37 == module0764.UNPROVIDED) {
            var37 = (SubLObject)module0764.T;
        }
        if (var65 == module0764.UNPROVIDED) {
            var65 = (SubLObject)module0764.$ic18$;
        }
        final SubLThread var66 = SubLProcess.currentSubLThread();
        final SubLObject var67 = module0034.$g879$.getDynamicValue(var66);
        SubLObject var68 = (SubLObject)module0764.NIL;
        if (module0764.NIL == var67) {
            return f48428(var47, var1, var2, var37, var65);
        }
        var68 = module0034.f1857(var67, (SubLObject)module0764.$ic17$, (SubLObject)module0764.UNPROVIDED);
        if (module0764.NIL == var68) {
            var68 = module0034.f1807(module0034.f1842(var67), (SubLObject)module0764.$ic17$, (SubLObject)module0764.FIVE_INTEGER, (SubLObject)module0764.NIL, (SubLObject)module0764.EQUAL, (SubLObject)module0764.UNPROVIDED);
            module0034.f1860(var67, (SubLObject)module0764.$ic17$, var68);
        }
        final SubLObject var69 = module0034.f1779(var47, var1, var2, var37, var65);
        final SubLObject var70 = module0034.f1814(var68, var69, (SubLObject)module0764.UNPROVIDED);
        if (var70 != module0764.$ic5$) {
            SubLObject var71 = var70;
            SubLObject var72 = (SubLObject)module0764.NIL;
            var72 = var71.first();
            while (module0764.NIL != var71) {
                SubLObject var73 = var72.first();
                final SubLObject var74 = conses_high.second(var72);
                if (var47.equal(var73.first())) {
                    var73 = var73.rest();
                    if (var1.equal(var73.first())) {
                        var73 = var73.rest();
                        if (var2.equal(var73.first())) {
                            var73 = var73.rest();
                            if (var37.equal(var73.first())) {
                                var73 = var73.rest();
                                if (module0764.NIL != var73 && module0764.NIL == var73.rest() && var65.equal(var73.first())) {
                                    return module0034.f1959(var74);
                                }
                            }
                        }
                    }
                }
                var71 = var71.rest();
                var72 = var71.first();
            }
        }
        final SubLObject var75 = Values.arg2(var66.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f48428(var47, var1, var2, var37, var65)));
        module0034.f1836(var68, var69, var70, var75, (SubLObject)ConsesLow.list(var47, var1, var2, var37, var65));
        return module0034.f1959(var75);
    }
    
    public static SubLObject f48430(final SubLObject var47, SubLObject var1, SubLObject var2, SubLObject var37, SubLObject var76, SubLObject var65) {
        if (var1 == module0764.UNPROVIDED) {
            var1 = module0756.f47746();
        }
        if (var2 == module0764.UNPROVIDED) {
            var2 = (SubLObject)module0764.$ic0$;
        }
        if (var37 == module0764.UNPROVIDED) {
            var37 = (SubLObject)module0764.T;
        }
        if (var76 == module0764.UNPROVIDED) {
            var76 = module0579.$g4289$.getDynamicValue();
        }
        if (var65 == module0764.UNPROVIDED) {
            var65 = module0579.$g4259$.getDynamicValue();
        }
        final SubLThread var77 = SubLProcess.currentSubLThread();
        final SubLObject var78 = module0579.$g4259$.currentBinding(var77);
        try {
            module0579.$g4259$.bind(var65, var77);
            SubLObject var79 = (SubLObject)module0764.NIL;
            SubLObject var80 = (SubLObject)module0764.NIL;
            if (module0764.$ic20$.eql(module0178.f11333(var47))) {
                SubLObject var82;
                final SubLObject var81 = var82 = module0178.f11330(var47);
                SubLObject var83 = (SubLObject)module0764.NIL;
                SubLObject var84 = (SubLObject)module0764.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var82, var81, (SubLObject)module0764.$ic21$);
                var83 = var82.first();
                var82 = var82.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var82, var81, (SubLObject)module0764.$ic21$);
                var84 = var82.first();
                var82 = var82.rest();
                if (module0764.NIL == var82) {
                    var79 = module0767.f48840(var83, var84).first();
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var81, (SubLObject)module0764.$ic21$);
                }
            }
            else {
                final SubLObject var7_82 = module0580.$g4363$.currentBinding(var77);
                final SubLObject var85 = module0580.$g4366$.currentBinding(var77);
                final SubLObject var86 = module0580.$g4364$.currentBinding(var77);
                try {
                    module0580.$g4363$.bind(module0054.f3968(), var77);
                    module0580.$g4366$.bind(module0580.f35568(), var77);
                    module0580.$g4364$.bind((SubLObject)module0764.T, var77);
                    try {
                        final SubLObject var87 = f48431(var47, var2, var37, var76);
                        if (module0764.NIL != module0756.f47497(var87, (SubLObject)module0764.UNPROVIDED) && module0764.NIL == module0756.f47800(var87, (SubLObject)module0764.T)) {
                            final SubLObject var7_83 = module0579.$g4289$.currentBinding(var77);
                            try {
                                module0579.$g4289$.bind(var76, var77);
                                module0770.f49065(var87, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                            }
                            finally {
                                module0579.$g4289$.rebind(var7_83, var77);
                            }
                            if (module0764.NIL != module0756.f47479(var87)) {
                                module0756.f47465(var87, var1);
                                module0756.f47569(var87, var47);
                                module0758.f47890(var87);
                                module0756.f47709(var87, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                                var79 = module0756.f47467(var87).first();
                            }
                            SubLObject var88 = module0756.f47708(var87);
                            SubLObject var89 = (SubLObject)module0764.NIL;
                            var89 = var88.first();
                            while (module0764.NIL != var88) {
                                if (!var89.equal(var79)) {
                                    final SubLObject var90 = var89;
                                    if (module0764.NIL == conses_high.member(var90, var80, Symbols.symbol_function((SubLObject)module0764.EQUAL), Symbols.symbol_function((SubLObject)module0764.IDENTITY))) {
                                        var80 = (SubLObject)ConsesLow.cons(var90, var80);
                                    }
                                }
                                var88 = var88.rest();
                                var89 = var88.first();
                            }
                            var80 = Sequences.nreverse(var80);
                        }
                    }
                    finally {
                        final SubLObject var7_84 = Threads.$is_thread_performing_cleanupP$.currentBinding(var77);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0764.T, var77);
                            module0580.f35566();
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var7_84, var77);
                        }
                    }
                }
                finally {
                    module0580.$g4364$.rebind(var86, var77);
                    module0580.$g4366$.rebind(var85, var77);
                    module0580.$g4363$.rebind(var7_82, var77);
                }
            }
            return Values.values(var79, var80);
        }
        finally {
            module0579.$g4259$.rebind(var78, var77);
        }
    }
    
    public static SubLObject f48424(final SubLObject var47, SubLObject var1, SubLObject var2, SubLObject var37, SubLObject var76, SubLObject var65) {
        if (var1 == module0764.UNPROVIDED) {
            var1 = module0756.f47746();
        }
        if (var2 == module0764.UNPROVIDED) {
            var2 = (SubLObject)module0764.$ic0$;
        }
        if (var37 == module0764.UNPROVIDED) {
            var37 = (SubLObject)module0764.T;
        }
        if (var76 == module0764.UNPROVIDED) {
            var76 = module0579.$g4289$.getDynamicValue();
        }
        if (var65 == module0764.UNPROVIDED) {
            var65 = module0579.$g4259$.getDynamicValue();
        }
        final SubLThread var77 = SubLProcess.currentSubLThread();
        final SubLObject var78 = module0034.$g879$.getDynamicValue(var77);
        SubLObject var79 = (SubLObject)module0764.NIL;
        if (module0764.NIL == var78) {
            return f48430(var47, var1, var2, var37, var76, var65);
        }
        var79 = module0034.f1857(var78, (SubLObject)module0764.$ic19$, (SubLObject)module0764.UNPROVIDED);
        if (module0764.NIL == var79) {
            var79 = module0034.f1807(module0034.f1842(var78), (SubLObject)module0764.$ic19$, (SubLObject)module0764.SIX_INTEGER, (SubLObject)module0764.$ic4$, (SubLObject)module0764.EQUAL, (SubLObject)module0764.UNPROVIDED);
            module0034.f1860(var78, (SubLObject)module0764.$ic19$, var79);
        }
        final SubLObject var80 = module0034.f1778(var47, var1, var2, var37, var76, var65);
        final SubLObject var81 = module0034.f1814(var79, var80, (SubLObject)module0764.UNPROVIDED);
        if (var81 != module0764.$ic5$) {
            SubLObject var82 = var81;
            SubLObject var83 = (SubLObject)module0764.NIL;
            var83 = var82.first();
            while (module0764.NIL != var82) {
                SubLObject var84 = var83.first();
                final SubLObject var85 = conses_high.second(var83);
                if (var47.equal(var84.first())) {
                    var84 = var84.rest();
                    if (var1.equal(var84.first())) {
                        var84 = var84.rest();
                        if (var2.equal(var84.first())) {
                            var84 = var84.rest();
                            if (var37.equal(var84.first())) {
                                var84 = var84.rest();
                                if (var76.equal(var84.first())) {
                                    var84 = var84.rest();
                                    if (module0764.NIL != var84 && module0764.NIL == var84.rest() && var65.equal(var84.first())) {
                                        return module0034.f1959(var85);
                                    }
                                }
                            }
                        }
                    }
                }
                var82 = var82.rest();
                var83 = var82.first();
            }
        }
        final SubLObject var86 = Values.arg2(var77.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f48430(var47, var1, var2, var37, var76, var65)));
        module0034.f1836(var79, var80, var81, var86, (SubLObject)ConsesLow.list(var47, var1, var2, var37, var76, var65));
        return module0034.f1959(var86);
    }
    
    public static SubLObject f48431(final SubLObject var47, SubLObject var2, SubLObject var37, SubLObject var76) {
        if (var2 == module0764.UNPROVIDED) {
            var2 = (SubLObject)module0764.$ic0$;
        }
        if (var37 == module0764.UNPROVIDED) {
            var37 = (SubLObject)module0764.T;
        }
        if (var76 == module0764.UNPROVIDED) {
            var76 = (SubLObject)module0764.NIL;
        }
        final SubLObject var77 = module0178.f11303(var47);
        return f48432(var77, var2, var37, var76);
    }
    
    public static SubLObject f48421(final SubLObject var41, SubLObject var2, SubLObject var37, SubLObject var76) {
        if (var2 == module0764.UNPROVIDED) {
            var2 = (SubLObject)module0764.$ic0$;
        }
        if (var37 == module0764.UNPROVIDED) {
            var37 = (SubLObject)module0764.T;
        }
        if (var76 == module0764.UNPROVIDED) {
            var76 = (SubLObject)module0764.T;
        }
        final SubLObject var77 = f48433(var41, var2, var37, var76);
        return (SubLObject)((module0764.NIL != module0749.f46482(var77)) ? module0749.f46447(var77) : module0764.NIL);
    }
    
    public static SubLObject f48434(final SubLObject var41, final SubLObject var2, final SubLObject var37, final SubLObject var76) {
        final SubLThread var77 = SubLProcess.currentSubLThread();
        if (module0764.$ic20$.eql(module0205.f13333(var41))) {
            SubLObject var79;
            final SubLObject var78 = var79 = module0205.f13385(var41, (SubLObject)module0764.UNPROVIDED);
            SubLObject var80 = (SubLObject)module0764.NIL;
            SubLObject var81 = (SubLObject)module0764.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var79, var78, (SubLObject)module0764.$ic21$);
            var80 = var79.first();
            var79 = var79.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var79, var78, (SubLObject)module0764.$ic21$);
            var81 = var79.first();
            var79 = var79.rest();
            if (module0764.NIL == var79) {
                return module0767.f48840(var80, var81).first();
            }
            cdestructuring_bind.cdestructuring_bind_error(var78, (SubLObject)module0764.$ic21$);
        }
        else {
            final SubLObject var82 = f48432(var41, var2, var37, var76);
            if (module0764.NIL != module0756.f47497(var82, (SubLObject)module0764.UNPROVIDED) && module0764.NIL == module0756.f47800(var82, (SubLObject)module0764.T)) {
                final SubLObject var83 = module0579.$g4289$.currentBinding(var77);
                try {
                    module0579.$g4289$.bind(var76, var77);
                    module0758.f47878(var82, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                }
                finally {
                    module0579.$g4289$.rebind(var83, var77);
                }
                return (SubLObject)((module0764.NIL != module0756.f47479(var82) && module0764.NIL != module0035.f1997(module0756.f47467(var82))) ? module0756.f47467(var82).first() : module0764.NIL);
            }
        }
        return (SubLObject)module0764.NIL;
    }
    
    public static SubLObject f48433(final SubLObject var41, final SubLObject var2, final SubLObject var37, final SubLObject var76) {
        final SubLThread var77 = SubLProcess.currentSubLThread();
        final SubLObject var78 = module0034.$g879$.getDynamicValue(var77);
        SubLObject var79 = (SubLObject)module0764.NIL;
        if (module0764.NIL == var78) {
            return f48434(var41, var2, var37, var76);
        }
        var79 = module0034.f1857(var78, (SubLObject)module0764.$ic23$, (SubLObject)module0764.UNPROVIDED);
        if (module0764.NIL == var79) {
            var79 = module0034.f1807(module0034.f1842(var78), (SubLObject)module0764.$ic23$, (SubLObject)module0764.FOUR_INTEGER, (SubLObject)module0764.$ic24$, (SubLObject)module0764.EQUAL, (SubLObject)module0764.UNPROVIDED);
            module0034.f1860(var78, (SubLObject)module0764.$ic23$, var79);
        }
        final SubLObject var80 = module0034.f1780(var41, var2, var37, var76);
        final SubLObject var81 = module0034.f1814(var79, var80, (SubLObject)module0764.UNPROVIDED);
        if (var81 != module0764.$ic5$) {
            SubLObject var82 = var81;
            SubLObject var83 = (SubLObject)module0764.NIL;
            var83 = var82.first();
            while (module0764.NIL != var82) {
                SubLObject var84 = var83.first();
                final SubLObject var85 = conses_high.second(var83);
                if (var41.equal(var84.first())) {
                    var84 = var84.rest();
                    if (var2.equal(var84.first())) {
                        var84 = var84.rest();
                        if (var37.equal(var84.first())) {
                            var84 = var84.rest();
                            if (module0764.NIL != var84 && module0764.NIL == var84.rest() && var76.equal(var84.first())) {
                                return module0034.f1959(var85);
                            }
                        }
                    }
                }
                var82 = var82.rest();
                var83 = var82.first();
            }
        }
        final SubLObject var86 = Values.arg2(var77.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f48434(var41, var2, var37, var76)));
        module0034.f1836(var79, var80, var81, var86, (SubLObject)ConsesLow.list(var41, var2, var37, var76));
        return module0034.f1959(var86);
    }
    
    public static SubLObject f48432(final SubLObject var90, SubLObject var2, SubLObject var37, SubLObject var76) {
        if (var2 == module0764.UNPROVIDED) {
            var2 = (SubLObject)module0764.$ic0$;
        }
        if (var37 == module0764.UNPROVIDED) {
            var37 = (SubLObject)module0764.T;
        }
        if (var76 == module0764.UNPROVIDED) {
            var76 = (SubLObject)module0764.NIL;
        }
        final SubLThread var91 = SubLProcess.currentSubLThread();
        final SubLObject var92 = module0205.f13136(var90);
        SubLObject var93 = (SubLObject)module0764.NIL;
        if (module0764.$ic3$.eql(var92)) {
            SubLObject var95;
            final SubLObject var94 = var95 = module0205.f13207(var90, (SubLObject)module0764.UNPROVIDED);
            SubLObject var96 = (SubLObject)module0764.NIL;
            SubLObject var97 = (SubLObject)module0764.NIL;
            SubLObject var98 = (SubLObject)module0764.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var95, var94, (SubLObject)module0764.$ic25$);
            var96 = var95.first();
            var95 = var95.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var95, var94, (SubLObject)module0764.$ic25$);
            var97 = var95.first();
            var95 = var95.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var95, var94, (SubLObject)module0764.$ic25$);
            var98 = var95.first();
            var95 = var95.rest();
            if (module0764.NIL == var95) {
                var93 = module0763.f48248(module0202.f12768(module0764.$ic26$, var97, var98), (SubLObject)module0764.UNPROVIDED);
                module0756.f47468(var93, var96);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var94, (SubLObject)module0764.$ic25$);
            }
            if (var2.isList()) {
                module0756.f47784(var93, var2, (SubLObject)module0764.UNPROVIDED);
            }
        }
        else if (module0764.NIL != module0751.f47107(var92)) {
            SubLObject var100;
            final SubLObject var99 = var100 = module0205.f13385(var90, (SubLObject)module0764.UNPROVIDED);
            SubLObject var96 = (SubLObject)module0764.NIL;
            SubLObject var101 = (SubLObject)module0764.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var100, var99, (SubLObject)module0764.$ic27$);
            var96 = var100.first();
            var100 = var100.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var100, var99, (SubLObject)module0764.$ic27$);
            var101 = var100.first();
            var100 = var100.rest();
            if (module0764.NIL == var100) {
                if (module0764.NIL != module0751.f46997(var101, var96)) {
                    var93 = module0763.f48248(module0762.f48215(var101), (SubLObject)module0764.UNPROVIDED);
                    module0756.f47783(var93, var92, (SubLObject)module0764.UNPROVIDED);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var99, (SubLObject)module0764.$ic27$);
            }
        }
        else if ((module0764.NIL != module0732.f44992(var92) || module0764.NIL != module0732.f44995(var92)) && module0764.NIL == module0751.f47105(var92, (SubLObject)module0764.UNPROVIDED)) {
            var91.resetMultipleValues();
            final SubLObject var102 = module0732.f45021(var90);
            final SubLObject var103 = var91.secondMultipleValue();
            final SubLObject var104 = var91.thirdMultipleValue();
            final SubLObject var97 = var91.fourthMultipleValue();
            final SubLObject var105 = var91.fifthMultipleValue();
            var91.resetMultipleValues();
            if (module0764.NIL != module0762.f48200(var103) && module0764.NIL != module0212.f13762(var97) && (module0764.NIL == var37 || module0764.NIL == f48435(var103, var97, var105, (SubLObject)module0764.UNPROVIDED))) {
                final SubLObject var106 = module0579.$g4336$.currentBinding(var91);
                try {
                    module0579.$g4336$.bind((SubLObject)module0764.$ic28$, var91);
                    var93 = f48436(var102, var103, var104, var97, var2, var105, var76, var92);
                }
                finally {
                    module0579.$g4336$.rebind(var106, var91);
                }
            }
        }
        return var93;
    }
    
    public static SubLObject f48436(final SubLObject var68, final SubLObject var93, final SubLObject var70, final SubLObject var67, final SubLObject var2, final SubLObject var64, SubLObject var76, SubLObject var5) {
        if (var76 == module0764.UNPROVIDED) {
            var76 = (SubLObject)module0764.NIL;
        }
        if (var5 == module0764.UNPROVIDED) {
            var5 = (SubLObject)module0764.NIL;
        }
        final SubLObject var94 = module0763.f48248(f48437(var68, var93, var70, var5), (SubLObject)module0764.UNPROVIDED);
        module0756.f47469(var94, module0751.f46705());
        module0756.f47464(var94, module0751.f46691());
        module0756.f47468(var94, var64);
        return f48438(var94, var68, var93, var70, var67, var2, var76);
    }
    
    public static SubLObject f48438(SubLObject var83, final SubLObject var68, final SubLObject var93, final SubLObject var70, final SubLObject var67, SubLObject var2, SubLObject var76) {
        if (var76 == module0764.UNPROVIDED) {
            var76 = (SubLObject)module0764.NIL;
        }
        final SubLObject var94 = module0756.f47736(var83);
        if (module0764.NIL != module0756.f47497(var94, (SubLObject)module0764.UNPROVIDED)) {
            if (module0764.NIL != var68 && module0764.NIL != module0751.f46640(var67, module0764.$ic29$, (SubLObject)module0764.UNPROVIDED)) {
                var2 = (SubLObject)module0764.$ic30$;
                module0756.f47784(var94, var2, (SubLObject)module0764.UNPROVIDED);
            }
            else if (module0764.NIL != var68 && module0764.NIL != module0751.f46640(var67, module0764.$ic31$, (SubLObject)module0764.UNPROVIDED)) {
                var2 = (SubLObject)module0764.$ic32$;
                module0756.f47784(var94, var2, (SubLObject)module0764.UNPROVIDED);
            }
            else if (module0764.NIL == module0751.f46640(var67, module0764.$ic33$, (SubLObject)module0764.UNPROVIDED)) {
                final SubLObject var95 = (SubLObject)((module0764.NIL != var76) ? module0764.$ic0$ : ConsesLow.append(module0731.f44659(var67), f48439(var67)));
                SubLObject var96 = module0751.f47130(var2, var95, (SubLObject)module0764.UNPROVIDED);
                if (module0764.NIL != var70 && module0764.NIL != module0751.f46640(var67, module0764.$ic34$, (SubLObject)module0764.UNPROVIDED)) {
                    var96 = module0751.f47099(var96, (SubLObject)module0764.$ic35$, (SubLObject)module0764.UNPROVIDED);
                    if (module0764.NIL != module0578.f35470((SubLObject)module0764.ONE_INTEGER)) {
                        PrintLow.format((SubLObject)module0764.T, (SubLObject)module0764.$ic36$, var96);
                    }
                }
                module0756.f47784(var94, var96, (SubLObject)module0764.UNPROVIDED);
                module0758.f47943(var94, var67);
            }
            else if (!var2.isList()) {
                module0756.f47723(var94, f48440(var93, var67, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED));
                module0756.f47784(var94, module0731.f44867(var93), (SubLObject)module0764.UNPROVIDED);
            }
            else if (module0764.NIL != module0751.f47099(var2, module0731.f44867(var93), (SubLObject)module0764.UNPROVIDED)) {
                module0756.f47723(var94, f48440(var93, var67, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED));
                module0756.f47784(var94, module0751.f47099(var2, module0731.f44867(var93), (SubLObject)module0764.UNPROVIDED), (SubLObject)module0764.UNPROVIDED);
            }
            else {
                var83 = (SubLObject)module0764.NIL;
            }
        }
        return var83;
    }
    
    public static SubLObject f48439(final SubLObject var67) {
        SubLObject var68 = (SubLObject)module0764.NIL;
        final SubLObject var69 = (SubLObject)module0764.$ic37$;
        SubLObject var70 = module0732.f44924(var67, (SubLObject)module0764.UNPROVIDED);
        SubLObject var71 = (SubLObject)module0764.NIL;
        var71 = var70.first();
        while (module0764.NIL != var70) {
            final SubLObject var72 = var71;
            if (module0764.NIL == conses_high.member(var72, var68, Symbols.symbol_function((SubLObject)module0764.EQL), Symbols.symbol_function((SubLObject)module0764.IDENTITY))) {
                var68 = (SubLObject)ConsesLow.cons(var72, var68);
            }
            SubLObject var28_101 = module0732.f44941(var71);
            SubLObject var73 = (SubLObject)module0764.NIL;
            var73 = var28_101.first();
            while (module0764.NIL != var28_101) {
                final SubLObject var74 = var73;
                if (module0764.NIL == conses_high.member(var74, var68, Symbols.symbol_function((SubLObject)module0764.EQL), Symbols.symbol_function((SubLObject)module0764.IDENTITY))) {
                    var68 = (SubLObject)ConsesLow.cons(var74, var68);
                }
                var28_101 = var28_101.rest();
                var73 = var28_101.first();
            }
            var70 = var70.rest();
            var71 = var70.first();
        }
        return module0035.f2467(var68, var69, (SubLObject)module0764.UNPROVIDED);
    }
    
    public static SubLObject f48437(final SubLObject var68, final SubLObject var93, final SubLObject var70, final SubLObject var5) {
        SubLObject var94 = (SubLObject)module0764.NIL;
        SubLObject var95 = var68;
        SubLObject var96 = (SubLObject)module0764.NIL;
        var96 = var95.first();
        while (module0764.NIL != var95) {
            final SubLObject var97 = module0762.f48215(var96);
            var94 = (SubLObject)ConsesLow.cons(var97, var94);
            var95 = var95.rest();
            var96 = var95.first();
        }
        SubLObject var98 = module0202.f12643(module0764.$ic38$, var93);
        if (module0764.NIL != var68 || module0764.NIL != var70) {
            var98 = module0202.f12643(module0764.$ic39$, var98);
        }
        var94 = (SubLObject)ConsesLow.cons(var98, var94);
        var95 = var70;
        SubLObject var99 = (SubLObject)module0764.NIL;
        var99 = var95.first();
        while (module0764.NIL != var95) {
            final SubLObject var97 = module0762.f48215(var99);
            var94 = (SubLObject)ConsesLow.cons(var97, var94);
            var95 = var95.rest();
            var99 = var95.first();
        }
        if (module0764.NIL != module0035.f1997(var94)) {
            return module0035.f2113(var94);
        }
        if (var5.eql(module0764.$ic40$)) {
            SubLObject var100 = (SubLObject)module0764.NIL;
            SubLObject var101 = var94;
            SubLObject var97 = (SubLObject)module0764.NIL;
            var97 = var101.first();
            while (module0764.NIL != var101) {
                var100 = (SubLObject)ConsesLow.cons(var97, var100);
                var100 = (SubLObject)ConsesLow.cons((SubLObject)module0764.$ic41$, var100);
                var101 = var101.rest();
                var97 = var101.first();
            }
            var100 = var100.rest();
            return module0202.f12683(module0764.$ic42$, var100, (SubLObject)module0764.UNPROVIDED);
        }
        return module0202.f12683(module0764.$ic43$, Sequences.nreverse(var94), (SubLObject)module0764.UNPROVIDED);
    }
    
    public static SubLObject f48441(final SubLObject var1, SubLObject var2) {
        if (var2 == module0764.UNPROVIDED) {
            var2 = (SubLObject)module0764.$ic0$;
        }
        SubLObject var3 = (SubLObject)ConsesLow.list((SubLObject)module0764.NIL, (SubLObject)module0764.NIL);
        if (module0764.NIL != module0751.f46684(var1, module0764.$ic44$, (SubLObject)module0764.UNPROVIDED) && module0764.NIL != module0751.f47099(var2, (SubLObject)module0764.$ic45$, (SubLObject)module0764.UNPROVIDED)) {
            final SubLObject var4 = f48442(var1, (SubLObject)module0764.$ic46$);
            SubLObject var6;
            final SubLObject var5 = var6 = var4;
            SubLObject var7 = (SubLObject)module0764.NIL;
            SubLObject var8 = (SubLObject)module0764.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0764.$ic47$);
            var7 = var6.first();
            var6 = var6.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0764.$ic47$);
            var8 = var6.first();
            var6 = var6.rest();
            final SubLObject var9 = (SubLObject)(var6.isCons() ? var6.first() : module0764.ZERO_INTEGER);
            cdestructuring_bind.destructuring_bind_must_listp(var6, var5, (SubLObject)module0764.$ic47$);
            var6 = var6.rest();
            final SubLObject var10 = (SubLObject)(var6.isCons() ? var6.first() : module0764.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(var6, var5, (SubLObject)module0764.$ic47$);
            var6 = var6.rest();
            if (module0764.NIL == var6) {
                if (var7.isString()) {
                    final SubLObject var11 = f48443(module0764.$ic48$, var2, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                    if (module0764.NIL != module0035.f2013(var11)) {
                        SubLObject var119_120;
                        final SubLObject var117_118 = var119_120 = var11.first();
                        SubLObject var12 = (SubLObject)module0764.NIL;
                        SubLObject var13 = (SubLObject)module0764.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var119_120, var117_118, (SubLObject)module0764.$ic49$);
                        var12 = var119_120.first();
                        var119_120 = var119_120.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var119_120, var117_118, (SubLObject)module0764.$ic49$);
                        var13 = var119_120.first();
                        var119_120 = var119_120.rest();
                        final SubLObject var14 = (SubLObject)(var119_120.isCons() ? var119_120.first() : module0764.ZERO_INTEGER);
                        cdestructuring_bind.destructuring_bind_must_listp(var119_120, var117_118, (SubLObject)module0764.$ic49$);
                        var119_120 = var119_120.rest();
                        final SubLObject var15 = (SubLObject)(var119_120.isCons() ? var119_120.first() : module0764.NIL);
                        cdestructuring_bind.destructuring_bind_must_listp(var119_120, var117_118, (SubLObject)module0764.$ic49$);
                        var119_120 = var119_120.rest();
                        if (module0764.NIL == var119_120) {
                            if (var12.isString()) {
                                final SubLObject var16 = Sequences.cconcatenate(var7, new SubLObject[] { module0764.$ic50$, var12 });
                                var3 = (SubLObject)ConsesLow.list(var16, var13, Numbers.add(var9, var14), ConsesLow.append(var10, var15));
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var117_118, (SubLObject)module0764.$ic49$);
                        }
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0764.$ic47$);
            }
        }
        return var3;
    }
    
    public static SubLObject f48442(final SubLObject var1, SubLObject var2) {
        if (var2 == module0764.UNPROVIDED) {
            var2 = (SubLObject)module0764.$ic0$;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0764.NIL == var2 || module0764.NIL == module0212.f13762(var1)) {
            return (SubLObject)ConsesLow.list((SubLObject)module0764.NIL, (SubLObject)module0764.NIL);
        }
        SubLObject var4 = (SubLObject)ConsesLow.list((SubLObject)module0764.NIL, (SubLObject)module0764.NIL);
        SubLObject var5 = (SubLObject)module0764.NIL;
        SubLObject var6 = module0579.$g4261$.getDynamicValue(var3);
        final SubLObject var7 = module0147.f9540(module0579.$g4260$.getDynamicValue(var3));
        SubLObject var8 = module0147.$g2095$.currentBinding(var3);
        final SubLObject var9 = module0147.$g2094$.currentBinding(var3);
        final SubLObject var10 = module0147.$g2096$.currentBinding(var3);
        try {
            module0147.$g2095$.bind(module0147.f9545(var7), var3);
            module0147.$g2094$.bind(module0147.f9546(var7), var3);
            module0147.$g2096$.bind(module0147.f9549(var7), var3);
            final SubLObject var11 = f48443(var1, var2, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
            if (module0764.NIL != var11) {
                SubLObject var13;
                final SubLObject var12 = var13 = var11;
                SubLObject var14 = (SubLObject)module0764.NIL;
                SubLObject var15 = (SubLObject)module0764.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0764.$ic51$);
                var14 = var13.first();
                var13 = (var15 = var13.rest());
                if (module0764.NIL != module0578.f35470((SubLObject)module0764.THREE_INTEGER)) {
                    PrintLow.format((SubLObject)module0764.T, (SubLObject)module0764.$ic52$, var14);
                }
                if (module0764.NIL != module0751.f47131(conses_high.second(var14), var2)) {
                    var4 = var14;
                    var5 = var15;
                    var6 = (SubLObject)module0764.NIL;
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var10, var3);
            module0147.$g2094$.rebind(var9, var3);
            module0147.$g2095$.rebind(var8, var3);
        }
        if (module0764.NIL != var6) {
            final SubLObject var16 = module0767.f48873();
            if (module0764.NIL == module0161.f10514(var16, module0579.$g4260$.getDynamicValue(var3))) {
                var8 = module0579.$g4260$.currentBinding(var3);
                try {
                    module0579.$g4260$.bind(var16, var3);
                    if (module0764.NIL != module0578.f35470((SubLObject)module0764.ONE_INTEGER) && module0764.NIL == module0578.f35477()) {
                        Errors.warn((SubLObject)module0764.$ic53$, module0579.$g4260$.getDynamicValue(var3));
                    }
                    final SubLObject var17 = module0147.f9540(module0579.$g4260$.getDynamicValue(var3));
                    final SubLObject var7_133 = module0147.$g2095$.currentBinding(var3);
                    final SubLObject var18 = module0147.$g2094$.currentBinding(var3);
                    final SubLObject var19 = module0147.$g2096$.currentBinding(var3);
                    try {
                        module0147.$g2095$.bind(module0147.f9545(var17), var3);
                        module0147.$g2094$.bind(module0147.f9546(var17), var3);
                        module0147.$g2096$.bind(module0147.f9549(var17), var3);
                        final SubLObject var20 = f48443(var1, var2, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                        if (module0764.NIL != var20) {
                            SubLObject var22;
                            final SubLObject var21 = var22 = var20;
                            SubLObject var23 = (SubLObject)module0764.NIL;
                            SubLObject var24 = (SubLObject)module0764.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)module0764.$ic51$);
                            var23 = var22.first();
                            var22 = (var24 = var22.rest());
                            if (module0764.NIL != module0578.f35470((SubLObject)module0764.THREE_INTEGER)) {
                                PrintLow.format((SubLObject)module0764.T, (SubLObject)module0764.$ic52$, var23);
                            }
                            if (module0764.NIL != module0751.f47131(conses_high.second(var23), var2)) {
                                var4 = var23;
                                var5 = var24;
                                var6 = (SubLObject)module0764.NIL;
                            }
                        }
                    }
                    finally {
                        module0147.$g2096$.rebind(var19, var3);
                        module0147.$g2094$.rebind(var18, var3);
                        module0147.$g2095$.rebind(var7_133, var3);
                    }
                }
                finally {
                    module0579.$g4260$.rebind(var8, var3);
                }
            }
        }
        return Values.values(var4, var5);
    }
    
    public static SubLObject f48444(final SubLObject var1, SubLObject var2) {
        if (var2 == module0764.UNPROVIDED) {
            var2 = (SubLObject)module0764.NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = (SubLObject)module0764.$ic54$;
        final SubLObject var5 = module0751.f47032(var1);
        SubLObject var6 = (SubLObject)module0764.NIL;
        final SubLObject var7 = module0579.$g4236$.currentBinding(var3);
        try {
            module0579.$g4236$.bind((SubLObject)module0764.$ic55$, var3);
            if (module0764.NIL == var6) {
                SubLObject var8;
                SubLObject var9;
                for (var8 = var4, var9 = (SubLObject)module0764.NIL, var9 = var8.first(); module0764.NIL == var6 && module0764.NIL != var8; var6 = module0767.f48798(var9, var1, var5, (SubLObject)module0764.$ic0$, (SubLObject)module0764.$ic0$), var8 = var8.rest(), var9 = var8.first()) {}
            }
            if (module0764.NIL == var6) {
                SubLObject var8;
                SubLObject var9;
                for (var8 = var4, var9 = (SubLObject)module0764.NIL, var9 = var8.first(); module0764.NIL == var6 && module0764.NIL != var8; var6 = module0767.f48798(var9, var1, (SubLObject)module0764.$ic0$, (SubLObject)module0764.$ic0$, (SubLObject)module0764.$ic0$), var8 = var8.rest(), var9 = var8.first()) {}
            }
        }
        finally {
            module0579.$g4236$.rebind(var7, var3);
        }
        return var6;
    }
    
    public static SubLObject f48445(final SubLObject var1, SubLObject var2, SubLObject var139, SubLObject var37) {
        if (var2 == module0764.UNPROVIDED) {
            var2 = (SubLObject)module0764.$ic56$;
        }
        if (var139 == module0764.UNPROVIDED) {
            var139 = (SubLObject)module0764.NIL;
        }
        if (var37 == module0764.UNPROVIDED) {
            var37 = (SubLObject)module0764.T;
        }
        return f48443(var1, var2, var139, var37).first().first();
    }
    
    public static SubLObject f48443(final SubLObject var1, SubLObject var2, SubLObject var139, SubLObject var37) {
        if (var2 == module0764.UNPROVIDED) {
            var2 = (SubLObject)module0764.$ic0$;
        }
        if (var139 == module0764.UNPROVIDED) {
            var139 = (SubLObject)module0764.NIL;
        }
        if (var37 == module0764.UNPROVIDED) {
            var37 = (SubLObject)module0764.T;
        }
        final SubLThread var140 = SubLProcess.currentSubLThread();
        SubLObject var141 = (SubLObject)module0764.NIL;
        if (module0764.NIL != module0212.f13762(var1)) {
            if (var2.isList()) {
                var2 = module0035.remove_if_not((SubLObject)module0764.$ic57$, var2, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                if (module0764.NIL != var139) {
                    var2 = conses_high.set_difference(var2, var139, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                }
            }
            if (module0764.NIL != var2) {
                final SubLObject var142 = f48446(var1, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                SubLObject var143 = (SubLObject)module0764.NIL;
                SubLObject var144 = (SubLObject)module0764.NIL;
                var140.resetMultipleValues();
                final SubLObject var145 = f48413(var142, var1, var2, var37);
                final SubLObject var146 = var140.secondMultipleValue();
                var140.resetMultipleValues();
                if (module0764.NIL != module0749.f46482(var145)) {
                    var143 = module0749.f46455(var145);
                    var144 = module0749.f46470(var145);
                }
                if (module0764.NIL != var143) {
                    var141 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var143, var144, module0749.f46481(var145), module0749.f46483(var145)), var141);
                    SubLObject var147 = var146;
                    SubLObject var148 = (SubLObject)module0764.NIL;
                    var148 = var147.first();
                    while (module0764.NIL != var147) {
                        var141 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0749.f46455(var148), module0749.f46470(var148), module0749.f46481(var148), module0749.f46483(var148)), var141);
                        var147 = var147.rest();
                        var148 = var147.first();
                    }
                    var141 = Sequences.nreverse(var141);
                }
            }
        }
        return var141;
    }
    
    public static SubLObject f48446(final SubLObject var1, SubLObject var145, SubLObject var146) {
        if (var145 == module0764.UNPROVIDED) {
            var145 = f48447();
        }
        if (var146 == module0764.UNPROVIDED) {
            var146 = (SubLObject)module0764.T;
        }
        final SubLThread var147 = SubLProcess.currentSubLThread();
        SubLObject var148 = (SubLObject)module0764.NIL;
        SubLObject var149 = var145;
        SubLObject var150 = (SubLObject)module0764.NIL;
        var150 = var149.first();
        while (module0764.NIL != var149) {
            final SubLObject var151 = module0732.f44992(var150);
            if (module0764.NIL != var151 && module0764.NIL != module0222.f14640(var150, var1, var151, (SubLObject)module0764.T)) {
                final SubLObject var152 = (module0764.NIL != var146 && module0764.NIL != module0751.f47107(var150)) ? module0767.f48872(module0579.$g4260$.getDynamicValue(var147), (SubLObject)module0764.UNPROVIDED) : module0579.$g4260$.getDynamicValue(var147);
                final SubLObject var153 = module0147.f9540(var152);
                final SubLObject var154 = module0147.$g2095$.currentBinding(var147);
                final SubLObject var155 = module0147.$g2094$.currentBinding(var147);
                final SubLObject var156 = module0147.$g2096$.currentBinding(var147);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var153), var147);
                    module0147.$g2094$.bind(module0147.f9546(var153), var147);
                    module0147.$g2096$.bind(module0147.f9549(var153), var147);
                    final SubLObject var157 = var150;
                    if (module0764.NIL != module0158.f10010(var1, var151, var157)) {
                        final SubLObject var158 = module0158.f10011(var1, var151, var157);
                        SubLObject var159 = (SubLObject)module0764.NIL;
                        final SubLObject var160 = (SubLObject)module0764.NIL;
                        while (module0764.NIL == var159) {
                            final SubLObject var161 = module0052.f3695(var158, var160);
                            final SubLObject var162 = (SubLObject)SubLObjectFactory.makeBoolean(!var160.eql(var161));
                            if (module0764.NIL != var162) {
                                SubLObject var163 = (SubLObject)module0764.NIL;
                                try {
                                    var163 = module0158.f10316(var161, (SubLObject)module0764.$ic58$, (SubLObject)module0764.$ic59$, (SubLObject)module0764.NIL);
                                    SubLObject var153_158 = (SubLObject)module0764.NIL;
                                    final SubLObject var154_159 = (SubLObject)module0764.NIL;
                                    while (module0764.NIL == var153_158) {
                                        final SubLObject var164 = module0052.f3695(var163, var154_159);
                                        final SubLObject var156_160 = (SubLObject)SubLObjectFactory.makeBoolean(!var154_159.eql(var164));
                                        if (module0764.NIL != var156_160) {
                                            if (module0764.NIL != module0579.f35494(var164)) {
                                                if (module0764.NIL != module0578.f35470((SubLObject)module0764.ONE_INTEGER)) {
                                                    PrintLow.format((SubLObject)module0764.T, (SubLObject)module0764.$ic60$, var164);
                                                }
                                            }
                                            else {
                                                var148 = (SubLObject)ConsesLow.cons(var164, var148);
                                            }
                                        }
                                        var153_158 = (SubLObject)SubLObjectFactory.makeBoolean(module0764.NIL == var156_160);
                                    }
                                }
                                finally {
                                    final SubLObject var7_161 = Threads.$is_thread_performing_cleanupP$.currentBinding(var147);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0764.T, var147);
                                        if (module0764.NIL != var163) {
                                            module0158.f10319(var163);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var7_161, var147);
                                    }
                                }
                            }
                            var159 = (SubLObject)SubLObjectFactory.makeBoolean(module0764.NIL == var162);
                        }
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var156, var147);
                    module0147.$g2094$.rebind(var155, var147);
                    module0147.$g2095$.rebind(var154, var147);
                }
            }
            var149 = var149.rest();
            var150 = var149.first();
        }
        if (module0764.$ic61$ == module0579.$g4286$.getDynamicValue(var147)) {
            var148 = module0035.f2097(var148);
        }
        var148 = module0751.f47010(var148, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
        return var148;
    }
    
    public static SubLObject f48448() {
        final SubLObject var162 = module0764.$g6115$.getGlobalValue();
        if (module0764.NIL != var162) {
            module0034.f1818(var162);
        }
        return (SubLObject)module0764.NIL;
    }
    
    public static SubLObject f48449() {
        return module0034.f1829(module0764.$g6115$.getGlobalValue(), (SubLObject)ConsesLow.list(module0764.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
    }
    
    public static SubLObject f48450() {
        return Sequences.remove(module0764.$ic63$, (SubLObject)ConsesLow.cons(module0764.$ic64$, module0584.f35787()), (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
    }
    
    public static SubLObject f48447() {
        SubLObject var163 = module0764.$g6115$.getGlobalValue();
        if (module0764.NIL == var163) {
            var163 = module0034.f1934((SubLObject)module0764.$ic62$, (SubLObject)module0764.$ic65$, (SubLObject)module0764.NIL, (SubLObject)module0764.EQL, (SubLObject)module0764.ZERO_INTEGER, (SubLObject)module0764.ZERO_INTEGER);
        }
        SubLObject var164 = module0034.f1810(var163, (SubLObject)module0764.UNPROVIDED);
        if (var164 == module0764.$ic5$) {
            var164 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f48450()));
            module0034.f1812(var163, var164, (SubLObject)module0764.UNPROVIDED);
        }
        return module0034.f1959(var164);
    }
    
    public static SubLObject f48451() {
        final SubLObject var162 = module0764.$g6116$.getGlobalValue();
        if (module0764.NIL != var162) {
            module0034.f1818(var162);
        }
        return (SubLObject)module0764.NIL;
    }
    
    public static SubLObject f48452(SubLObject var23) {
        if (var23 == module0764.UNPROVIDED) {
            var23 = module0579.$g4260$.getDynamicValue();
        }
        return module0034.f1829(module0764.$g6116$.getGlobalValue(), (SubLObject)ConsesLow.list(var23), (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
    }
    
    public static SubLObject f48453(final SubLObject var23) {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        SubLObject var25 = (SubLObject)module0764.NIL;
        final SubLObject var26 = module0147.f9540(var23);
        final SubLObject var27 = module0147.$g2095$.currentBinding(var24);
        final SubLObject var28 = module0147.$g2094$.currentBinding(var24);
        final SubLObject var29 = module0147.$g2096$.currentBinding(var24);
        try {
            module0147.$g2095$.bind(module0147.f9545(var26), var24);
            module0147.$g2094$.bind(module0147.f9546(var26), var24);
            module0147.$g2096$.bind(module0147.f9549(var26), var24);
            var25 = module0259.f16848(module0764.$ic67$, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
        }
        finally {
            module0147.$g2096$.rebind(var29, var24);
            module0147.$g2094$.rebind(var28, var24);
            module0147.$g2095$.rebind(var27, var24);
        }
        return var25;
    }
    
    public static SubLObject f48454(SubLObject var23) {
        if (var23 == module0764.UNPROVIDED) {
            var23 = module0579.$g4260$.getDynamicValue();
        }
        SubLObject var24 = module0764.$g6116$.getGlobalValue();
        if (module0764.NIL == var24) {
            var24 = module0034.f1934((SubLObject)module0764.$ic66$, (SubLObject)module0764.$ic68$, (SubLObject)module0764.NIL, (SubLObject)module0764.EQUAL, (SubLObject)module0764.ONE_INTEGER, (SubLObject)module0764.ZERO_INTEGER);
        }
        SubLObject var25 = module0034.f1814(var24, var23, (SubLObject)module0764.$ic5$);
        if (var25 == module0764.$ic5$) {
            var25 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f48453(var23)));
            module0034.f1816(var24, var23, var25, (SubLObject)module0764.UNPROVIDED);
        }
        return module0034.f1959(var25);
    }
    
    public static SubLObject f48455(final SubLObject var165, final SubLObject var166) {
        SubLObject var167 = (SubLObject)module0764.NIL;
        SubLObject var168 = var165;
        SubLObject var169 = (SubLObject)module0764.NIL;
        var169 = var168.first();
        while (module0764.NIL != var168) {
            if (module0764.NIL != module0038.f2684(var169, var166)) {
                var167 = (SubLObject)ConsesLow.cons(module0038.f2735(Sequences.subseq(var169, Sequences.length(var166), (SubLObject)module0764.UNPROVIDED)), var167);
            }
            var168 = var168.rest();
            var169 = var168.first();
        }
        return var167;
    }
    
    public static SubLObject f48456(final SubLObject var1, SubLObject var2, SubLObject var167, SubLObject var168) {
        if (var2 == module0764.UNPROVIDED) {
            var2 = (SubLObject)module0764.$ic69$;
        }
        if (var167 == module0764.UNPROVIDED) {
            var167 = (SubLObject)module0764.NIL;
        }
        if (var168 == module0764.UNPROVIDED) {
            var168 = (SubLObject)module0764.NIL;
        }
        final SubLThread var169 = SubLProcess.currentSubLThread();
        final SubLObject var170 = module0579.$g4251$.currentBinding(var169);
        final SubLObject var171 = module0579.$g4253$.currentBinding(var169);
        final SubLObject var172 = module0579.$g4289$.currentBinding(var169);
        final SubLObject var173 = module0584.$g4396$.currentBinding(var169);
        final SubLObject var174 = module0579.$g4260$.currentBinding(var169);
        final SubLObject var175 = module0579.$g4262$.currentBinding(var169);
        final SubLObject var176 = module0579.$g4287$.currentBinding(var169);
        try {
            module0579.$g4251$.bind((SubLObject)module0764.$ic69$, var169);
            module0579.$g4253$.bind(var168, var169);
            module0579.$g4289$.bind((SubLObject)module0764.NIL, var169);
            module0584.$g4396$.bind(module0147.$g2095$.getDynamicValue(var169), var169);
            module0579.$g4260$.bind(module0147.$g2095$.getDynamicValue(var169), var169);
            module0579.$g4262$.bind(module0147.$g2095$.getDynamicValue(var169), var169);
            module0579.$g4287$.bind((SubLObject)module0764.ZERO_INTEGER, var169);
            return f48457(var1, var2, (SubLObject)module0764.$ic70$, (SubLObject)module0764.$ic18$, (SubLObject)module0764.NIL, var167, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
        }
        finally {
            module0579.$g4287$.rebind(var176, var169);
            module0579.$g4262$.rebind(var175, var169);
            module0579.$g4260$.rebind(var174, var169);
            module0584.$g4396$.rebind(var173, var169);
            module0579.$g4289$.rebind(var172, var169);
            module0579.$g4253$.rebind(var171, var169);
            module0579.$g4251$.rebind(var170, var169);
        }
    }
    
    public static SubLObject f48458(final SubLObject var1, final SubLObject var4, SubLObject var2, SubLObject var167) {
        if (var2 == module0764.UNPROVIDED) {
            var2 = (SubLObject)module0764.$ic69$;
        }
        if (var167 == module0764.UNPROVIDED) {
            var167 = (SubLObject)module0764.NIL;
        }
        final SubLThread var168 = SubLProcess.currentSubLThread();
        SubLObject var169 = (SubLObject)module0764.NIL;
        final SubLObject var170 = module0579.$g4297$.currentBinding(var168);
        try {
            module0579.$g4297$.bind((SubLObject)ConsesLow.list(var1, var4, (SubLObject)((var2 == module0764.$ic69$) ? module0764.$ic0$ : var2)), var168);
            try {
                var168.throwStack.push(module0764.$ic71$);
                f48456(var1, var2, var167, (SubLObject)module0764.UNPROVIDED);
            }
            catch (Throwable var171) {
                var169 = Errors.handleThrowable(var171, (SubLObject)module0764.$ic71$);
            }
            finally {
                var168.throwStack.pop();
            }
        }
        finally {
            module0579.$g4297$.rebind(var170, var168);
        }
        return var169;
    }
    
    public static SubLObject f48457(SubLObject var1, SubLObject var174, SubLObject var175, SubLObject var65, SubLObject var176, SubLObject var177, SubLObject var178, SubLObject var179) {
        if (var174 == module0764.UNPROVIDED) {
            var174 = (SubLObject)module0764.$ic69$;
        }
        if (var175 == module0764.UNPROVIDED) {
            var175 = (SubLObject)module0764.NIL;
        }
        if (var65 == module0764.UNPROVIDED) {
            var65 = (SubLObject)module0764.$ic18$;
        }
        if (var176 == module0764.UNPROVIDED) {
            var176 = (SubLObject)module0764.NIL;
        }
        if (var177 == module0764.UNPROVIDED) {
            var177 = (SubLObject)module0764.NIL;
        }
        if (var178 == module0764.UNPROVIDED) {
            var178 = (SubLObject)module0764.NIL;
        }
        if (var179 == module0764.UNPROVIDED) {
            var179 = module0048.f3326();
        }
        final SubLThread var180 = SubLProcess.currentSubLThread();
        if (var174 != module0764.$ic69$) {
            final SubLObject var181 = var174;
            assert module0764.NIL != module0035.f2015(var181) : var181;
            SubLObject var182 = var181;
            SubLObject var183 = (SubLObject)module0764.NIL;
            var183 = var182.first();
            while (module0764.NIL != var182) {
                assert module0764.NIL != module0173.f10955(var183) : var183;
                var182 = var182.rest();
                var183 = var182.first();
            }
        }
        var1 = module0172.f10922(var1);
        SubLObject var184 = (SubLObject)module0764.NIL;
        SubLObject var185 = (SubLObject)module0764.NIL;
        SubLObject var186 = (SubLObject)module0764.NIL;
        SubLObject var187 = (SubLObject)module0764.NIL;
        SubLObject var188 = Errors.$continue_cerrorP$.currentBinding(var180);
        final SubLObject var189 = module0578.$g4234$.currentBinding(var180);
        try {
            Errors.$continue_cerrorP$.bind((SubLObject)module0764.NIL, var180);
            module0578.$g4234$.bind((SubLObject)module0764.T, var180);
            if (module0764.NIL != module0578.f35473()) {
                if (module0764.NIL != module0751.f47109(var176)) {
                    var185 = (SubLObject)module0764.T;
                }
                else if (module0764.NIL != module0751.f46684(var176, module0764.$ic74$, (SubLObject)module0764.UNPROVIDED)) {
                    var186 = (SubLObject)module0764.T;
                }
                else if (module0764.NIL != var176) {
                    if (module0764.NIL != module0578.f35470((SubLObject)module0764.ZERO_INTEGER) && module0764.NIL == module0578.f35477()) {
                        Errors.warn((SubLObject)module0764.$ic75$, var176);
                    }
                    var176 = (SubLObject)module0764.NIL;
                }
                final SubLObject var190 = (SubLObject)(var174.isList() ? var174 : module0764.$ic0$);
                final SubLObject var7_185 = module0579.$g4260$.currentBinding(var180);
                try {
                    module0579.$g4260$.bind(module0751.f46998((SubLObject)ConsesLow.list(module0764.$ic76$, module0579.$g4260$.getDynamicValue(var180), module0584.$g4396$.getDynamicValue(var180))), var180);
                    if (module0764.NIL != module0212.f13762(var1)) {
                        final SubLObject var7_186 = module0584.$g4402$.currentBinding(var180);
                        try {
                            module0584.$g4402$.bind(Sequences.find((SubLObject)module0764.$ic77$, var175, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED), var180);
                            final SubLObject var191 = (SubLObject)ConsesLow.cons(module0764.$ic78$, Sequences.cconcatenate(module0767.f48869((SubLObject)module0764.UNPROVIDED), module0767.f48865((SubLObject)module0764.UNPROVIDED)));
                            SubLObject var192 = (var174 == module0764.$ic69$) ? Sequences.cconcatenate(f48447(), var191) : Sequences.cconcatenate(f48447(), module0035.remove_if_not((SubLObject)module0764.$ic79$, var190, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED));
                            if (module0764.NIL != Sequences.find((SubLObject)module0764.$ic80$, var175, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED)) {
                                final SubLObject var193 = module0260.f17034(module0764.$ic81$, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                                if (var193.isVector()) {
                                    final SubLObject var194 = var193;
                                    final SubLObject var195 = (SubLObject)module0764.NIL;
                                    SubLObject var196;
                                    SubLObject var197;
                                    SubLObject var198;
                                    SubLObject var199;
                                    for (var196 = Sequences.length(var194), var197 = (SubLObject)module0764.NIL, var197 = (SubLObject)module0764.ZERO_INTEGER; var197.numL(var196); var197 = Numbers.add(var197, (SubLObject)module0764.ONE_INTEGER)) {
                                        var198 = ((module0764.NIL != var195) ? Numbers.subtract(var196, var197, (SubLObject)module0764.ONE_INTEGER) : var197);
                                        var199 = Vectors.aref(var194, var198);
                                        var192 = (SubLObject)ConsesLow.cons(var199, var192);
                                    }
                                }
                                else {
                                    SubLObject var200 = var193;
                                    SubLObject var201 = (SubLObject)module0764.NIL;
                                    var201 = var200.first();
                                    while (module0764.NIL != var200) {
                                        var192 = (SubLObject)ConsesLow.cons(var201, var192);
                                        var200 = var200.rest();
                                        var201 = var200.first();
                                    }
                                }
                            }
                            else {
                                var192 = Sequences.delete(module0764.$ic81$, var192, (SubLObject)module0764.$ic82$, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                            }
                            if (module0764.NIL != Sequences.find((SubLObject)module0764.$ic77$, var175, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED)) {
                                var192 = (SubLObject)ConsesLow.cons(module0764.$ic83$, var192);
                            }
                            else {
                                var192 = Sequences.delete(module0764.$ic83$, var192, (SubLObject)module0764.$ic82$, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                            }
                            SubLObject var202 = f48446(var1, var192, (SubLObject)module0764.UNPROVIDED);
                            SubLObject var203 = (SubLObject)module0764.NIL;
                            var203 = var202.first();
                            while (module0764.NIL != var202) {
                                if ((module0764.NIL == var185 || module0764.NIL != module0751.f47106(module0178.f11303(var203), var176)) && (module0764.NIL == var186 || module0205.f13132(module0178.f11303(var203)).equalp(var176)) && (module0764.NIL != Sequences.find((SubLObject)module0764.$ic80$, var175, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED) || module0764.NIL == module0751.f46849(module0205.f13132(module0178.f11303(var203)), module0764.$ic81$, (SubLObject)module0764.UNPROVIDED)) && (module0764.NIL != Sequences.find((SubLObject)module0764.$ic77$, var175, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED) || module0764.NIL == module0751.f46849(module0205.f13132(module0178.f11303(var203)), module0764.$ic83$, (SubLObject)module0764.UNPROVIDED))) {
                                    SubLObject var28_196 = f48429(var203, var1, var190, (SubLObject)module0764.NIL, var65);
                                    SubLObject var204 = (SubLObject)module0764.NIL;
                                    var204 = var28_196.first();
                                    while (module0764.NIL != var28_196) {
                                        final SubLObject var205 = var204;
                                        if (module0764.NIL == conses_high.member(var205, var184, Symbols.symbol_function((SubLObject)module0764.EQUAL), Symbols.symbol_function((SubLObject)module0764.IDENTITY))) {
                                            var184 = (SubLObject)ConsesLow.cons(var205, var184);
                                        }
                                        var28_196 = var28_196.rest();
                                        var204 = var28_196.first();
                                    }
                                }
                                var202 = var202.rest();
                                var203 = var202.first();
                            }
                            if (module0764.NIL != module0768.f48993() && module0764.NIL != conses_high.member(module0764.$ic84$, var192, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED)) {
                                var202 = module0768.f48994(var1, (SubLObject)module0764.UNPROVIDED);
                                SubLObject var206 = (SubLObject)module0764.NIL;
                                var206 = var202.first();
                                while (module0764.NIL != var202) {
                                    if (var206.isString()) {
                                        final SubLObject var207 = var206;
                                        if (module0764.NIL == conses_high.member(var207, var184, Symbols.symbol_function((SubLObject)module0764.EQUAL), Symbols.symbol_function((SubLObject)module0764.IDENTITY))) {
                                            var184 = (SubLObject)ConsesLow.cons(var207, var184);
                                        }
                                    }
                                    var202 = var202.rest();
                                    var206 = var202.first();
                                }
                            }
                        }
                        finally {
                            module0584.$g4402$.rebind(var7_186, var180);
                        }
                    }
                    if (module0764.NIL == var177) {
                        final SubLObject var7_187 = module0579.$g4287$.currentBinding(var180);
                        final SubLObject var8_199 = module0579.$g4260$.currentBinding(var180);
                        final SubLObject var208 = module0579.$g4259$.currentBinding(var180);
                        try {
                            module0579.$g4287$.bind(module0580.f35610((SubLObject)module0764.TWO_INTEGER), var180);
                            module0579.$g4260$.bind(module0751.f46998((SubLObject)ConsesLow.list(module0764.$ic76$, module0579.$g4260$.getDynamicValue(var180), module0584.$g4396$.getDynamicValue(var180))), var180);
                            module0579.$g4259$.bind(var65, var180);
                            final SubLObject var2_200 = (SubLObject)(var174.isList() ? var174 : module0764.$ic0$);
                            var180.resetMultipleValues();
                            final SubLObject var209 = module0770.f49050(var1, var2_200, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                            final SubLObject var210 = var180.secondMultipleValue();
                            var180.resetMultipleValues();
                            if (var209.isString() && (module0764.NIL != Sequences.find((SubLObject)module0764.$ic80$, var175, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED) || module0764.NIL == module0751.f46849(var210, module0764.$ic81$, (SubLObject)module0764.UNPROVIDED)) && (module0764.NIL != Sequences.find((SubLObject)module0764.$ic77$, var175, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED) || module0764.NIL == module0751.f46849(var210, module0764.$ic83$, (SubLObject)module0764.UNPROVIDED))) {
                                var184 = (SubLObject)ConsesLow.cons(var209, Sequences.remove(var209, var184, Symbols.symbol_function((SubLObject)module0764.EQUAL), (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED));
                            }
                        }
                        finally {
                            module0579.$g4259$.rebind(var208, var180);
                            module0579.$g4260$.rebind(var8_199, var180);
                            module0579.$g4287$.rebind(var7_187, var180);
                        }
                    }
                    if (module0764.NIL == var177 && module0764.NIL != module0206.f13453(var1)) {
                        final SubLObject var211 = module0205.f13276(var1);
                        if (module0764.NIL != var211 && module0764.NIL != module0128.f8463(module0764.$ic85$, (SubLObject)module0764.UNPROVIDED)) {
                            SubLObject var212 = module0751.f46781((SubLObject)module0764.$ic86$, (SubLObject)ConsesLow.listS(module0764.$ic85$, var211, (SubLObject)module0764.$ic87$), (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                            SubLObject var213 = (SubLObject)module0764.NIL;
                            var213 = var212.first();
                            while (module0764.NIL != var212) {
                                final SubLObject var214 = module0205.f13362(var1, var213, (SubLObject)module0764.UNPROVIDED);
                                if (var214.isString()) {
                                    final SubLObject var215 = var214;
                                    if (module0764.NIL == conses_high.member(var215, var184, Symbols.symbol_function((SubLObject)module0764.EQUAL), Symbols.symbol_function((SubLObject)module0764.IDENTITY))) {
                                        var184 = (SubLObject)ConsesLow.cons(var215, var184);
                                    }
                                }
                                var212 = var212.rest();
                                var213 = var212.first();
                            }
                        }
                    }
                    if (module0764.NIL != var178) {
                        SubLObject var216 = (SubLObject)module0764.NIL;
                        SubLObject var212 = var178;
                        SubLObject var217 = (SubLObject)module0764.NIL;
                        var217 = var212.first();
                        while (module0764.NIL != var212) {
                            var216 = conses_high.nunion(var216, f48455(var184, var217), (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                            var212 = var212.rest();
                            var217 = var212.first();
                        }
                        var184 = conses_high.nunion(var184, var216, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                    }
                    if (module0764.NIL == var177 && module0764.NIL != module0206.f13486(var1)) {
                        final SubLObject var7_188 = module0579.$g4259$.currentBinding(var180);
                        try {
                            module0579.$g4259$.bind(var65, var180);
                            SubLObject var212 = f48459(module0205.f13144(var1), module0579.$g4260$.getDynamicValue(var180), var190, module0579.f35488(), var179);
                            SubLObject var218 = (SubLObject)module0764.NIL;
                            var218 = var212.first();
                            while (module0764.NIL != var212) {
                                final SubLObject var219 = var218;
                                if (module0764.NIL == conses_high.member(var219, var184, Symbols.symbol_function((SubLObject)module0764.EQUAL), Symbols.symbol_function((SubLObject)module0764.IDENTITY))) {
                                    var184 = (SubLObject)ConsesLow.cons(var219, var184);
                                }
                                var212 = var212.rest();
                                var218 = var212.first();
                            }
                        }
                        finally {
                            module0579.$g4259$.rebind(var7_188, var180);
                        }
                    }
                }
                finally {
                    module0579.$g4260$.rebind(var7_185, var180);
                }
            }
            else {
                try {
                    var180.throwStack.push(module0003.$g3$.getGlobalValue());
                    final SubLObject var7_189 = Errors.$error_handler$.currentBinding(var180);
                    try {
                        Errors.$error_handler$.bind((SubLObject)module0764.$ic88$, var180);
                        try {
                            if (module0764.NIL != module0751.f47109(var176)) {
                                var185 = (SubLObject)module0764.T;
                            }
                            else if (module0764.NIL != module0751.f46684(var176, module0764.$ic74$, (SubLObject)module0764.UNPROVIDED)) {
                                var186 = (SubLObject)module0764.T;
                            }
                            else if (module0764.NIL != var176) {
                                if (module0764.NIL != module0578.f35470((SubLObject)module0764.ZERO_INTEGER) && module0764.NIL == module0578.f35477()) {
                                    Errors.warn((SubLObject)module0764.$ic75$, var176);
                                }
                                var176 = (SubLObject)module0764.NIL;
                            }
                            final SubLObject var220 = (SubLObject)(var174.isList() ? var174 : module0764.$ic0$);
                            final SubLObject var7_190 = module0579.$g4260$.currentBinding(var180);
                            try {
                                module0579.$g4260$.bind(module0751.f46998((SubLObject)ConsesLow.list(module0764.$ic76$, module0579.$g4260$.getDynamicValue(var180), module0584.$g4396$.getDynamicValue(var180))), var180);
                                if (module0764.NIL != module0212.f13762(var1)) {
                                    final SubLObject var7_191 = module0584.$g4402$.currentBinding(var180);
                                    try {
                                        module0584.$g4402$.bind(Sequences.find((SubLObject)module0764.$ic77$, var175, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED), var180);
                                        final SubLObject var221 = (SubLObject)ConsesLow.cons(module0764.$ic78$, Sequences.cconcatenate(module0767.f48869((SubLObject)module0764.UNPROVIDED), module0767.f48865((SubLObject)module0764.UNPROVIDED)));
                                        SubLObject var222 = (var174 == module0764.$ic69$) ? Sequences.cconcatenate(f48447(), var221) : Sequences.cconcatenate(f48447(), module0035.remove_if_not((SubLObject)module0764.$ic79$, var220, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED));
                                        if (module0764.NIL != Sequences.find((SubLObject)module0764.$ic80$, var175, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED)) {
                                            final SubLObject var223 = module0260.f17034(module0764.$ic81$, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                                            if (var223.isVector()) {
                                                final SubLObject var224 = var223;
                                                final SubLObject var225 = (SubLObject)module0764.NIL;
                                                SubLObject var226;
                                                SubLObject var227;
                                                SubLObject var228;
                                                SubLObject var229;
                                                for (var226 = Sequences.length(var224), var227 = (SubLObject)module0764.NIL, var227 = (SubLObject)module0764.ZERO_INTEGER; var227.numL(var226); var227 = Numbers.add(var227, (SubLObject)module0764.ONE_INTEGER)) {
                                                    var228 = ((module0764.NIL != var225) ? Numbers.subtract(var226, var227, (SubLObject)module0764.ONE_INTEGER) : var227);
                                                    var229 = Vectors.aref(var224, var228);
                                                    var222 = (SubLObject)ConsesLow.cons(var229, var222);
                                                }
                                            }
                                            else {
                                                SubLObject var230 = var223;
                                                SubLObject var231 = (SubLObject)module0764.NIL;
                                                var231 = var230.first();
                                                while (module0764.NIL != var230) {
                                                    var222 = (SubLObject)ConsesLow.cons(var231, var222);
                                                    var230 = var230.rest();
                                                    var231 = var230.first();
                                                }
                                            }
                                        }
                                        else {
                                            var222 = Sequences.delete(module0764.$ic81$, var222, (SubLObject)module0764.$ic82$, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                                        }
                                        if (module0764.NIL != Sequences.find((SubLObject)module0764.$ic77$, var175, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED)) {
                                            var222 = (SubLObject)ConsesLow.cons(module0764.$ic83$, var222);
                                        }
                                        else {
                                            var222 = Sequences.delete(module0764.$ic83$, var222, (SubLObject)module0764.$ic82$, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                                        }
                                        SubLObject var200 = f48446(var1, var222, (SubLObject)module0764.UNPROVIDED);
                                        SubLObject var232 = (SubLObject)module0764.NIL;
                                        var232 = var200.first();
                                        while (module0764.NIL != var200) {
                                            if ((module0764.NIL == var185 || module0764.NIL != module0751.f47106(module0178.f11303(var232), var176)) && (module0764.NIL == var186 || module0205.f13132(module0178.f11303(var232)).equalp(var176)) && (module0764.NIL != Sequences.find((SubLObject)module0764.$ic80$, var175, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED) || module0764.NIL == module0751.f46849(module0205.f13132(module0178.f11303(var232)), module0764.$ic81$, (SubLObject)module0764.UNPROVIDED)) && (module0764.NIL != Sequences.find((SubLObject)module0764.$ic77$, var175, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED) || module0764.NIL == module0751.f46849(module0205.f13132(module0178.f11303(var232)), module0764.$ic83$, (SubLObject)module0764.UNPROVIDED))) {
                                                SubLObject var28_197 = f48429(var232, var1, var220, (SubLObject)module0764.NIL, var65);
                                                SubLObject var233 = (SubLObject)module0764.NIL;
                                                var233 = var28_197.first();
                                                while (module0764.NIL != var28_197) {
                                                    final SubLObject var234 = var233;
                                                    if (module0764.NIL == conses_high.member(var234, var184, Symbols.symbol_function((SubLObject)module0764.EQUAL), Symbols.symbol_function((SubLObject)module0764.IDENTITY))) {
                                                        var184 = (SubLObject)ConsesLow.cons(var234, var184);
                                                    }
                                                    var28_197 = var28_197.rest();
                                                    var233 = var28_197.first();
                                                }
                                            }
                                            var200 = var200.rest();
                                            var232 = var200.first();
                                        }
                                        if (module0764.NIL != module0768.f48993() && module0764.NIL != conses_high.member(module0764.$ic84$, var222, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED)) {
                                            var200 = module0768.f48994(var1, (SubLObject)module0764.UNPROVIDED);
                                            SubLObject var235 = (SubLObject)module0764.NIL;
                                            var235 = var200.first();
                                            while (module0764.NIL != var200) {
                                                if (var235.isString()) {
                                                    final SubLObject var236 = var235;
                                                    if (module0764.NIL == conses_high.member(var236, var184, Symbols.symbol_function((SubLObject)module0764.EQUAL), Symbols.symbol_function((SubLObject)module0764.IDENTITY))) {
                                                        var184 = (SubLObject)ConsesLow.cons(var236, var184);
                                                    }
                                                }
                                                var200 = var200.rest();
                                                var235 = var200.first();
                                            }
                                        }
                                    }
                                    finally {
                                        module0584.$g4402$.rebind(var7_191, var180);
                                    }
                                }
                                if (module0764.NIL == var177) {
                                    final SubLObject var7_192 = module0579.$g4287$.currentBinding(var180);
                                    final SubLObject var8_200 = module0579.$g4260$.currentBinding(var180);
                                    final SubLObject var237 = module0579.$g4259$.currentBinding(var180);
                                    try {
                                        module0579.$g4287$.bind(module0580.f35610((SubLObject)module0764.TWO_INTEGER), var180);
                                        module0579.$g4260$.bind(module0751.f46998((SubLObject)ConsesLow.list(module0764.$ic76$, module0579.$g4260$.getDynamicValue(var180), module0584.$g4396$.getDynamicValue(var180))), var180);
                                        module0579.$g4259$.bind(var65, var180);
                                        final SubLObject var2_201 = (SubLObject)(var174.isList() ? var174 : module0764.$ic0$);
                                        var180.resetMultipleValues();
                                        final SubLObject var238 = module0770.f49050(var1, var2_201, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                                        final SubLObject var239 = var180.secondMultipleValue();
                                        var180.resetMultipleValues();
                                        if (var238.isString() && (module0764.NIL != Sequences.find((SubLObject)module0764.$ic80$, var175, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED) || module0764.NIL == module0751.f46849(var239, module0764.$ic81$, (SubLObject)module0764.UNPROVIDED)) && (module0764.NIL != Sequences.find((SubLObject)module0764.$ic77$, var175, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED) || module0764.NIL == module0751.f46849(var239, module0764.$ic83$, (SubLObject)module0764.UNPROVIDED))) {
                                            var184 = (SubLObject)ConsesLow.cons(var238, Sequences.remove(var238, var184, Symbols.symbol_function((SubLObject)module0764.EQUAL), (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED));
                                        }
                                    }
                                    finally {
                                        module0579.$g4259$.rebind(var237, var180);
                                        module0579.$g4260$.rebind(var8_200, var180);
                                        module0579.$g4287$.rebind(var7_192, var180);
                                    }
                                }
                                if (module0764.NIL == var177 && module0764.NIL != module0206.f13453(var1)) {
                                    final SubLObject var240 = module0205.f13276(var1);
                                    if (module0764.NIL != var240 && module0764.NIL != module0128.f8463(module0764.$ic85$, (SubLObject)module0764.UNPROVIDED)) {
                                        SubLObject var241 = module0751.f46781((SubLObject)module0764.$ic86$, (SubLObject)ConsesLow.listS(module0764.$ic85$, var240, (SubLObject)module0764.$ic87$), (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                                        SubLObject var242 = (SubLObject)module0764.NIL;
                                        var242 = var241.first();
                                        while (module0764.NIL != var241) {
                                            final SubLObject var243 = module0205.f13362(var1, var242, (SubLObject)module0764.UNPROVIDED);
                                            if (var243.isString()) {
                                                final SubLObject var207 = var243;
                                                if (module0764.NIL == conses_high.member(var207, var184, Symbols.symbol_function((SubLObject)module0764.EQUAL), Symbols.symbol_function((SubLObject)module0764.IDENTITY))) {
                                                    var184 = (SubLObject)ConsesLow.cons(var207, var184);
                                                }
                                            }
                                            var241 = var241.rest();
                                            var242 = var241.first();
                                        }
                                    }
                                }
                                if (module0764.NIL != var178) {
                                    SubLObject var244 = (SubLObject)module0764.NIL;
                                    SubLObject var241 = var178;
                                    SubLObject var245 = (SubLObject)module0764.NIL;
                                    var245 = var241.first();
                                    while (module0764.NIL != var241) {
                                        var244 = conses_high.nunion(var244, f48455(var184, var245), (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                                        var241 = var241.rest();
                                        var245 = var241.first();
                                    }
                                    var184 = conses_high.nunion(var184, var244, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                                }
                                if (module0764.NIL == var177 && module0764.NIL != module0206.f13486(var1)) {
                                    final SubLObject var7_193 = module0579.$g4259$.currentBinding(var180);
                                    try {
                                        module0579.$g4259$.bind(var65, var180);
                                        SubLObject var241 = f48459(module0205.f13144(var1), module0579.$g4260$.getDynamicValue(var180), var220, module0579.f35488(), var179);
                                        SubLObject var246 = (SubLObject)module0764.NIL;
                                        var246 = var241.first();
                                        while (module0764.NIL != var241) {
                                            final SubLObject var215 = var246;
                                            if (module0764.NIL == conses_high.member(var215, var184, Symbols.symbol_function((SubLObject)module0764.EQUAL), Symbols.symbol_function((SubLObject)module0764.IDENTITY))) {
                                                var184 = (SubLObject)ConsesLow.cons(var215, var184);
                                            }
                                            var241 = var241.rest();
                                            var246 = var241.first();
                                        }
                                    }
                                    finally {
                                        module0579.$g4259$.rebind(var7_193, var180);
                                    }
                                }
                            }
                            finally {
                                module0579.$g4260$.rebind(var7_190, var180);
                            }
                        }
                        catch (Throwable var247) {
                            Errors.handleThrowable(var247, (SubLObject)module0764.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(var7_189, var180);
                    }
                }
                catch (Throwable var248) {
                    var187 = Errors.handleThrowable(var248, module0003.$g3$.getGlobalValue());
                }
                finally {
                    var180.throwStack.pop();
                }
                if (var187.isString() && module0764.NIL == module0578.f35477()) {
                    Errors.warn(Sequences.cconcatenate(module0752.f47234(var187), (SubLObject)module0764.$ic89$), module0579.f35508());
                }
            }
        }
        finally {
            module0578.$g4234$.rebind(var189, var180);
            Errors.$continue_cerrorP$.rebind(var188, var180);
        }
        var188 = module0579.$g4259$.currentBinding(var180);
        try {
            module0579.$g4259$.bind(var65, var180);
            final SubLObject var249 = Sequences.delete_duplicates(var184, Symbols.symbol_function((SubLObject)module0764.$ic90$), (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
            final SubLObject var250 = var179.isInteger() ? module0035.f2124(var179, var249) : var249;
            return Mapping.mapcar((SubLObject)module0764.$ic91$, var250);
        }
        finally {
            module0579.$g4259$.rebind(var188, var180);
        }
    }
    
    public static SubLObject f48459(final SubLObject var86, SubLObject var23, SubLObject var216, SubLObject var217, SubLObject var179) {
        if (var23 == module0764.UNPROVIDED) {
            var23 = module0579.$g4260$.getDynamicValue();
        }
        if (var216 == module0764.UNPROVIDED) {
            var216 = (SubLObject)module0764.$ic0$;
        }
        if (var217 == module0764.UNPROVIDED) {
            var217 = module0579.f35488();
        }
        if (var179 == module0764.UNPROVIDED) {
            var179 = module0048.f3326();
        }
        assert module0764.NIL != module0202.f12590(var86) : var86;
        assert module0764.NIL != module0269.f17732(var23, (SubLObject)module0764.UNPROVIDED) : var23;
        return f48460(var86, var23, var216, var217, var179);
    }
    
    public static SubLObject f48460(final SubLObject var86, final SubLObject var23, final SubLObject var216, final SubLObject var217, final SubLObject var179) {
        final SubLThread var218 = SubLProcess.currentSubLThread();
        final SubLObject var219 = module0579.$g4287$.currentBinding(var218);
        try {
            module0579.$g4287$.bind(module0580.f35610((SubLObject)module0764.TWO_INTEGER), var218);
            final SubLObject var220 = module0757.f47854(module0770.f49081(var86, var216, var23, var23, var217, (SubLObject)module0764.T, (SubLObject)module0764.$ic94$), var179);
            return var179.isInteger() ? module0035.f2124(var179, var220) : var220;
        }
        finally {
            module0579.$g4287$.rebind(var219, var218);
        }
    }
    
    public static SubLObject f48461(final SubLObject var1, SubLObject var219, SubLObject var220, SubLObject var221) {
        if (var219 == module0764.UNPROVIDED) {
            var219 = module0764.$ic95$;
        }
        if (var220 == module0764.UNPROVIDED) {
            var220 = module0584.$g4396$.getDynamicValue();
        }
        if (var221 == module0764.UNPROVIDED) {
            var221 = (SubLObject)module0764.NIL;
        }
        final SubLThread var222 = SubLProcess.currentSubLThread();
        if (module0764.NIL != module0603.f36877(var1)) {
            return (SubLObject)ConsesLow.list(module0205.f13203(var1, (SubLObject)module0764.UNPROVIDED));
        }
        SubLObject var223 = (SubLObject)module0764.NIL;
        SubLObject var224 = (SubLObject)module0764.NIL;
        SubLObject var225 = (SubLObject)module0764.NIL;
        if (module0764.NIL != module0584.f35800(var219)) {
            final SubLObject var226 = module0147.f9540(var220);
            final SubLObject var227 = module0147.$g2095$.currentBinding(var222);
            final SubLObject var228 = module0147.$g2094$.currentBinding(var222);
            final SubLObject var229 = module0147.$g2096$.currentBinding(var222);
            try {
                module0147.$g2095$.bind(module0147.f9545(var226), var222);
                module0147.$g2094$.bind(module0147.f9546(var226), var222);
                module0147.$g2096$.bind(module0147.f9549(var226), var222);
                if (module0764.NIL == var225) {
                    final SubLObject var230 = var219;
                    final SubLObject var231 = (SubLObject)module0764.$ic98$;
                    final SubLObject var232 = module0056.f4145(var231);
                    SubLObject var233 = (SubLObject)module0764.NIL;
                    final SubLObject var7_227 = module0139.$g1635$.currentBinding(var222);
                    try {
                        module0139.$g1635$.bind(module0139.f9007(), var222);
                        final SubLObject var6_228 = var220;
                        final SubLObject var7_228 = module0147.$g2095$.currentBinding(var222);
                        final SubLObject var8_230 = module0147.$g2094$.currentBinding(var222);
                        final SubLObject var9_231 = module0147.$g2096$.currentBinding(var222);
                        try {
                            module0147.$g2095$.bind(module0147.f9545(var6_228), var222);
                            module0147.$g2094$.bind(module0147.f9546(var6_228), var222);
                            module0147.$g2096$.bind(module0147.f9549(var6_228), var222);
                            final SubLObject var234 = module0764.$ic99$;
                            final SubLObject var7_229 = module0141.$g1714$.currentBinding(var222);
                            final SubLObject var8_231 = module0141.$g1715$.currentBinding(var222);
                            try {
                                module0141.$g1714$.bind((module0764.NIL != var234) ? var234 : module0141.f9283(), var222);
                                module0141.$g1715$.bind((SubLObject)((module0764.NIL != var234) ? module0764.$ic100$ : module0141.$g1715$.getDynamicValue(var222)), var222);
                                if (module0764.NIL != var234 && module0764.NIL != module0136.f8864() && module0764.NIL == module0141.f9279(var234)) {
                                    final SubLObject var235 = module0136.$g1591$.getDynamicValue(var222);
                                    if (var235.eql((SubLObject)module0764.$ic101$)) {
                                        module0136.f8870((SubLObject)module0764.ONE_INTEGER, (SubLObject)module0764.$ic102$, var234, (SubLObject)module0764.$ic103$, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                                    }
                                    else if (var235.eql((SubLObject)module0764.$ic104$)) {
                                        module0136.f8871((SubLObject)module0764.ONE_INTEGER, (SubLObject)module0764.$ic105$, (SubLObject)module0764.$ic102$, var234, (SubLObject)module0764.$ic103$, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                                    }
                                    else if (var235.eql((SubLObject)module0764.$ic106$)) {
                                        Errors.warn((SubLObject)module0764.$ic102$, var234, (SubLObject)module0764.$ic103$);
                                    }
                                    else {
                                        Errors.warn((SubLObject)module0764.$ic107$, module0136.$g1591$.getDynamicValue(var222));
                                        Errors.cerror((SubLObject)module0764.$ic105$, (SubLObject)module0764.$ic102$, var234, (SubLObject)module0764.$ic103$);
                                    }
                                }
                                final SubLObject var7_230 = module0141.$g1670$.currentBinding(var222);
                                final SubLObject var8_232 = module0141.$g1671$.currentBinding(var222);
                                final SubLObject var9_232 = module0141.$g1672$.currentBinding(var222);
                                final SubLObject var236 = module0141.$g1674$.currentBinding(var222);
                                final SubLObject var237 = module0137.$g1605$.currentBinding(var222);
                                try {
                                    module0141.$g1670$.bind(module0137.f8955(module0764.$ic108$), var222);
                                    module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0764.$ic108$)), var222);
                                    module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0764.$ic108$)), var222);
                                    module0141.$g1674$.bind((SubLObject)module0764.NIL, var222);
                                    module0137.$g1605$.bind(module0137.f8955(module0764.$ic108$), var222);
                                    if (module0764.NIL != module0136.f8865() || module0764.NIL != module0244.f15795(var219, module0137.f8955((SubLObject)module0764.UNPROVIDED))) {
                                        final SubLObject var7_231 = module0141.$g1677$.currentBinding(var222);
                                        final SubLObject var8_233 = module0138.$g1619$.currentBinding(var222);
                                        final SubLObject var9_233 = module0141.$g1674$.currentBinding(var222);
                                        try {
                                            module0141.$g1677$.bind(module0141.f9210(), var222);
                                            module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955(module0764.$ic108$)), var222);
                                            module0141.$g1674$.bind((SubLObject)module0764.NIL, var222);
                                            module0249.f16055(var230, (SubLObject)module0764.UNPROVIDED);
                                            for (var233 = (SubLObject)ConsesLow.list(var219, module0141.f9195()); module0764.NIL != var233 && module0764.NIL == var225; var233 = module0056.f4150(var232)) {
                                                final SubLObject var223_241 = var233.first();
                                                final SubLObject var238 = conses_high.second(var233);
                                                final SubLObject var239 = var223_241;
                                                final SubLObject var7_232 = module0141.$g1674$.currentBinding(var222);
                                                try {
                                                    module0141.$g1674$.bind(var238, var222);
                                                    if (module0764.NIL != module0250.f16115(module0141.f9190(), var223_241) && module0764.NIL == var225) {
                                                        SubLObject var240 = module0220.f14562(var1, var239, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                                                        SubLObject var241 = (SubLObject)module0764.NIL;
                                                        var241 = var240.first();
                                                        while (module0764.NIL == var225 && module0764.NIL != var240) {
                                                            var225 = var221;
                                                            final SubLObject var242 = Sequences.position(var241, var223, Symbols.symbol_function((SubLObject)module0764.EQUAL), (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                                                            if (module0764.NIL != var242) {
                                                                ConsesLow.set_nth(var242, var224, (SubLObject)ConsesLow.cons(var239, ConsesLow.nth(var242, var224)));
                                                            }
                                                            else {
                                                                var223 = (SubLObject)ConsesLow.cons(var241, var223);
                                                                var224 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var239), var224);
                                                            }
                                                            var240 = var240.rest();
                                                            var241 = var240.first();
                                                        }
                                                    }
                                                    final SubLObject var243 = module0200.f12443(module0137.f8955(module0764.$ic108$));
                                                    SubLObject var244;
                                                    SubLObject var245;
                                                    SubLObject var7_233;
                                                    SubLObject var8_234;
                                                    SubLObject var246;
                                                    SubLObject var247;
                                                    SubLObject var248;
                                                    SubLObject var249;
                                                    SubLObject var250;
                                                    SubLObject var251;
                                                    SubLObject var7_234;
                                                    SubLObject var254_258;
                                                    SubLObject var252;
                                                    SubLObject var253;
                                                    SubLObject var7_235;
                                                    SubLObject var254;
                                                    SubLObject var255;
                                                    SubLObject var256;
                                                    SubLObject var257;
                                                    SubLObject var258;
                                                    SubLObject var259;
                                                    SubLObject var260;
                                                    SubLObject var261;
                                                    SubLObject var247_268;
                                                    SubLObject var262;
                                                    SubLObject var7_236;
                                                    SubLObject var264;
                                                    SubLObject var263;
                                                    SubLObject var265;
                                                    SubLObject var266;
                                                    SubLObject var267;
                                                    SubLObject var268;
                                                    SubLObject var269;
                                                    SubLObject var270;
                                                    for (var244 = (SubLObject)module0764.NIL, var244 = var243; module0764.NIL == var225 && module0764.NIL != var244; var244 = var244.rest()) {
                                                        var245 = var244.first();
                                                        var7_233 = module0137.$g1605$.currentBinding(var222);
                                                        var8_234 = module0141.$g1674$.currentBinding(var222);
                                                        try {
                                                            module0137.$g1605$.bind(var245, var222);
                                                            module0141.$g1674$.bind((SubLObject)((module0764.NIL != module0141.f9205((SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0764.NIL == module0141.$g1674$.getDynamicValue(var222)) : module0141.$g1674$.getDynamicValue(var222)), var222);
                                                            var246 = module0228.f15229(var223_241);
                                                            if (module0764.NIL != module0138.f8992(var246)) {
                                                                var247 = module0242.f15664(var246, module0137.f8955((SubLObject)module0764.UNPROVIDED));
                                                                if (module0764.NIL != var247) {
                                                                    var248 = module0245.f15834(var247, module0138.f8979(), module0137.f8955((SubLObject)module0764.UNPROVIDED));
                                                                    if (module0764.NIL != var248) {
                                                                        for (var249 = module0066.f4838(module0067.f4891(var248)); module0764.NIL == var225 && module0764.NIL == module0066.f4841(var249); var249 = module0066.f4840(var249)) {
                                                                            var222.resetMultipleValues();
                                                                            var250 = module0066.f4839(var249);
                                                                            var251 = var222.secondMultipleValue();
                                                                            var222.resetMultipleValues();
                                                                            if (module0764.NIL != module0147.f9507(var250)) {
                                                                                var7_234 = module0138.$g1623$.currentBinding(var222);
                                                                                try {
                                                                                    module0138.$g1623$.bind(var250, var222);
                                                                                    for (var254_258 = module0066.f4838(module0067.f4891(var251)); module0764.NIL == var225 && module0764.NIL == module0066.f4841(var254_258); var254_258 = module0066.f4840(var254_258)) {
                                                                                        var222.resetMultipleValues();
                                                                                        var252 = module0066.f4839(var254_258);
                                                                                        var253 = var222.secondMultipleValue();
                                                                                        var222.resetMultipleValues();
                                                                                        if (module0764.NIL != module0141.f9289(var252)) {
                                                                                            var7_235 = module0138.$g1624$.currentBinding(var222);
                                                                                            try {
                                                                                                module0138.$g1624$.bind(var252, var222);
                                                                                                var254 = var253;
                                                                                                if (module0764.NIL != module0077.f5302(var254)) {
                                                                                                    var255 = module0077.f5333(var254);
                                                                                                    for (var256 = module0032.f1741(var255), var257 = (SubLObject)module0764.NIL, var257 = module0032.f1742(var256, var255); module0764.NIL == var225 && module0764.NIL == module0032.f1744(var256, var257); var257 = module0032.f1743(var257)) {
                                                                                                        var258 = module0032.f1745(var256, var257);
                                                                                                        if (module0764.NIL != module0032.f1746(var257, var258) && module0764.NIL == module0249.f16059(var258, (SubLObject)module0764.UNPROVIDED)) {
                                                                                                            module0249.f16055(var258, (SubLObject)module0764.UNPROVIDED);
                                                                                                            module0056.f4149((SubLObject)ConsesLow.list(var258, module0141.f9195()), var232);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                else if (var254.isList()) {
                                                                                                    if (module0764.NIL == var225) {
                                                                                                        var259 = var254;
                                                                                                        var260 = (SubLObject)module0764.NIL;
                                                                                                        var260 = var259.first();
                                                                                                        while (module0764.NIL == var225 && module0764.NIL != var259) {
                                                                                                            if (module0764.NIL == module0249.f16059(var260, (SubLObject)module0764.UNPROVIDED)) {
                                                                                                                module0249.f16055(var260, (SubLObject)module0764.UNPROVIDED);
                                                                                                                module0056.f4149((SubLObject)ConsesLow.list(var260, module0141.f9195()), var232);
                                                                                                            }
                                                                                                            var259 = var259.rest();
                                                                                                            var260 = var259.first();
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                else {
                                                                                                    Errors.error((SubLObject)module0764.$ic109$, var254);
                                                                                                }
                                                                                            }
                                                                                            finally {
                                                                                                module0138.$g1624$.rebind(var7_235, var222);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    module0066.f4842(var254_258);
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1623$.rebind(var7_234, var222);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var249);
                                                                    }
                                                                }
                                                                else {
                                                                    module0136.f8870((SubLObject)module0764.FIVE_INTEGER, (SubLObject)module0764.$ic110$, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                                                                }
                                                            }
                                                            else if (module0764.NIL != module0155.f9785(var246, (SubLObject)module0764.UNPROVIDED)) {
                                                                var261 = ((module0764.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var222), module0137.f8955((SubLObject)module0764.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var222), module0137.f8955((SubLObject)module0764.UNPROVIDED)));
                                                                for (var247_268 = (SubLObject)module0764.NIL, var247_268 = var261; module0764.NIL == var225 && module0764.NIL != var247_268; var247_268 = var247_268.rest()) {
                                                                    var262 = var247_268.first();
                                                                    var7_236 = module0138.$g1625$.currentBinding(var222);
                                                                    try {
                                                                        module0138.$g1625$.bind(var262, var222);
                                                                        var263 = (var264 = Functions.funcall(var262, var246));
                                                                        if (module0764.NIL != module0077.f5302(var264)) {
                                                                            var265 = module0077.f5333(var264);
                                                                            for (var266 = module0032.f1741(var265), var267 = (SubLObject)module0764.NIL, var267 = module0032.f1742(var266, var265); module0764.NIL == var225 && module0764.NIL == module0032.f1744(var266, var267); var267 = module0032.f1743(var267)) {
                                                                                var268 = module0032.f1745(var266, var267);
                                                                                if (module0764.NIL != module0032.f1746(var267, var268) && module0764.NIL == module0249.f16059(var268, (SubLObject)module0764.UNPROVIDED)) {
                                                                                    module0249.f16055(var268, (SubLObject)module0764.UNPROVIDED);
                                                                                    module0056.f4149((SubLObject)ConsesLow.list(var268, module0141.f9195()), var232);
                                                                                }
                                                                            }
                                                                        }
                                                                        else if (var264.isList()) {
                                                                            if (module0764.NIL == var225) {
                                                                                var269 = var264;
                                                                                var270 = (SubLObject)module0764.NIL;
                                                                                var270 = var269.first();
                                                                                while (module0764.NIL == var225 && module0764.NIL != var269) {
                                                                                    if (module0764.NIL == module0249.f16059(var270, (SubLObject)module0764.UNPROVIDED)) {
                                                                                        module0249.f16055(var270, (SubLObject)module0764.UNPROVIDED);
                                                                                        module0056.f4149((SubLObject)ConsesLow.list(var270, module0141.f9195()), var232);
                                                                                    }
                                                                                    var269 = var269.rest();
                                                                                    var270 = var269.first();
                                                                                }
                                                                            }
                                                                        }
                                                                        else {
                                                                            Errors.error((SubLObject)module0764.$ic109$, var264);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        module0138.$g1625$.rebind(var7_236, var222);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            module0141.$g1674$.rebind(var8_234, var222);
                                                            module0137.$g1605$.rebind(var7_233, var222);
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var7_232, var222);
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var9_233, var222);
                                            module0138.$g1619$.rebind(var8_233, var222);
                                            module0141.$g1677$.rebind(var7_231, var222);
                                        }
                                    }
                                    else {
                                        module0136.f8872((SubLObject)module0764.TWO_INTEGER, (SubLObject)module0764.$ic111$, var219, module0244.f15748(module0137.f8955((SubLObject)module0764.UNPROVIDED)), (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                                    }
                                }
                                finally {
                                    module0137.$g1605$.rebind(var237, var222);
                                    module0141.$g1674$.rebind(var236, var222);
                                    module0141.$g1672$.rebind(var9_232, var222);
                                    module0141.$g1671$.rebind(var8_232, var222);
                                    module0141.$g1670$.rebind(var7_230, var222);
                                }
                            }
                            finally {
                                module0141.$g1715$.rebind(var8_231, var222);
                                module0141.$g1714$.rebind(var7_229, var222);
                            }
                        }
                        finally {
                            module0147.$g2096$.rebind(var9_231, var222);
                            module0147.$g2094$.rebind(var8_230, var222);
                            module0147.$g2095$.rebind(var7_228, var222);
                        }
                        module0139.f9011(module0139.$g1635$.getDynamicValue(var222));
                    }
                    finally {
                        module0139.$g1635$.rebind(var7_227, var222);
                    }
                }
            }
            finally {
                module0147.$g2096$.rebind(var229, var222);
                module0147.$g2094$.rebind(var228, var222);
                module0147.$g2095$.rebind(var227, var222);
            }
        }
        return Values.values(var223, var224);
    }
    
    public static SubLObject f48462(final SubLObject var1, SubLObject var219, SubLObject var220) {
        if (var219 == module0764.UNPROVIDED) {
            var219 = module0764.$ic95$;
        }
        if (var220 == module0764.UNPROVIDED) {
            var220 = module0584.$g4396$.getDynamicValue();
        }
        return f48461(var1, var219, var220, (SubLObject)module0764.T).first();
    }
    
    public static SubLObject f48463(final SubLObject var5, final SubLObject var69, final SubLObject var67, final SubLObject var271) {
        final SubLThread var272 = SubLProcess.currentSubLThread();
        SubLObject var273 = (SubLObject)module0764.NIL;
        final SubLObject var274 = module0147.$g2094$.currentBinding(var272);
        final SubLObject var275 = module0147.$g2095$.currentBinding(var272);
        try {
            module0147.$g2094$.bind((SubLObject)module0764.$ic112$, var272);
            module0147.$g2095$.bind(module0764.$ic113$, var272);
            if (module0764.NIL != module0158.f10010(var69, (SubLObject)module0764.ONE_INTEGER, var5)) {
                final SubLObject var276 = module0158.f10011(var69, (SubLObject)module0764.ONE_INTEGER, var5);
                SubLObject var277 = (SubLObject)module0764.NIL;
                final SubLObject var278 = (SubLObject)module0764.NIL;
                while (module0764.NIL == var277) {
                    final SubLObject var279 = module0052.f3695(var276, var278);
                    final SubLObject var280 = (SubLObject)SubLObjectFactory.makeBoolean(!var278.eql(var279));
                    if (module0764.NIL != var280) {
                        SubLObject var281 = (SubLObject)module0764.NIL;
                        try {
                            var281 = module0158.f10316(var279, (SubLObject)module0764.$ic58$, (SubLObject)module0764.$ic59$, (SubLObject)module0764.NIL);
                            SubLObject var153_273 = (SubLObject)module0764.NIL;
                            final SubLObject var154_274 = (SubLObject)module0764.NIL;
                            while (module0764.NIL == var153_273) {
                                final SubLObject var282 = module0052.f3695(var281, var154_274);
                                final SubLObject var156_276 = (SubLObject)SubLObjectFactory.makeBoolean(!var154_274.eql(var282));
                                if (module0764.NIL != var156_276 && var67.equal(module0178.f11335(var282)) && var271.equal(module0178.f11336(var282))) {
                                    var273 = module0178.f11337(var282);
                                }
                                var153_273 = (SubLObject)SubLObjectFactory.makeBoolean(module0764.NIL == var156_276);
                            }
                        }
                        finally {
                            final SubLObject var7_277 = Threads.$is_thread_performing_cleanupP$.currentBinding(var272);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0764.T, var272);
                                if (module0764.NIL != var281) {
                                    module0158.f10319(var281);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var7_277, var272);
                            }
                        }
                    }
                    var277 = (SubLObject)SubLObjectFactory.makeBoolean(module0764.NIL == var280);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var275, var272);
            module0147.$g2094$.rebind(var274, var272);
        }
        return var273;
    }
    
    public static SubLObject f48435(final SubLObject var69, final SubLObject var67, final SubLObject var1, SubLObject var23) {
        if (var23 == module0764.UNPROVIDED) {
            var23 = module0764.$ic114$;
        }
        if (module0764.NIL != module0731.f44771(var69)) {
            return (SubLObject)module0764.T;
        }
        if (module0764.NIL != module0212.f13762(var69) && module0764.NIL != module0212.f13762(var1) && module0764.NIL != module0220.f14579(module0764.$ic64$, var69, var1, var23, (SubLObject)module0764.ONE_INTEGER, (SubLObject)module0764.FOUR_INTEGER, (SubLObject)module0764.UNPROVIDED)) {
            SubLObject var70 = (SubLObject)module0764.NIL;
            SubLObject var71 = (SubLObject)module0764.NIL;
            var70 = module0220.f14594(var69, module0764.$ic64$, var1, var23, (SubLObject)module0764.ONE_INTEGER, (SubLObject)module0764.FOUR_INTEGER, (SubLObject)module0764.THREE_INTEGER, (SubLObject)module0764.UNPROVIDED);
            if (module0764.NIL == var71) {
                SubLObject var72;
                SubLObject var73;
                for (var72 = var70, var73 = (SubLObject)module0764.NIL, var73 = var72.first(); module0764.NIL == var71 && module0764.NIL != var72; var71 = (SubLObject)SubLObjectFactory.makeBoolean(module0764.NIL != Sequences.find((SubLObject)ConsesLow.list((SubLObject)module0764.$ic115$, module0731.f44836(), var69, var67, var73), (SubLObject)module0764.$ic116$, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED) || module0764.NIL != Sequences.find((SubLObject)ConsesLow.list((SubLObject)module0764.$ic115$, module0731.f44837(), var69, var67, var73), (SubLObject)module0764.$ic117$, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED)), var72 = var72.rest(), var73 = var72.first()) {}
            }
            return var71;
        }
        return (SubLObject)module0764.NIL;
    }
    
    public static SubLObject f48464(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0228.f15229(var1);
        SubLObject var4 = (SubLObject)module0764.NIL;
        final SubLObject var5 = module0147.f9540(module0579.$g4260$.getDynamicValue(var2));
        final SubLObject var6 = module0147.$g2095$.currentBinding(var2);
        final SubLObject var7 = module0147.$g2094$.currentBinding(var2);
        final SubLObject var8 = module0147.$g2096$.currentBinding(var2);
        try {
            module0147.$g2095$.bind(module0147.f9545(var5), var2);
            module0147.$g2094$.bind(module0147.f9546(var5), var2);
            module0147.$g2096$.bind(module0147.f9549(var5), var2);
            SubLObject var10;
            final SubLObject var9 = var10 = module0219.f14510(var3, (SubLObject)module0764.ONE_INTEGER, module0764.$ic3$, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
            SubLObject var11 = (SubLObject)module0764.NIL;
            var11 = var10.first();
            while (module0764.NIL != var10) {
                var4 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0178.f11335(var11), module0178.f11336(var11)), var4);
                var10 = var10.rest();
                var11 = var10.first();
            }
        }
        finally {
            module0147.$g2096$.rebind(var8, var2);
            module0147.$g2094$.rebind(var7, var2);
            module0147.$g2095$.rebind(var6, var2);
        }
        return var4;
    }
    
    public static SubLObject f48440(final SubLObject var69, final SubLObject var67, SubLObject var2, SubLObject var23) {
        if (var2 == module0764.UNPROVIDED) {
            var2 = (SubLObject)module0764.$ic0$;
        }
        if (var23 == module0764.UNPROVIDED) {
            var23 = module0579.$g4260$.getDynamicValue();
        }
        final SubLThread var70 = SubLProcess.currentSubLThread();
        if (var67 != module0764.$ic0$) {}
        if (var2 != module0764.$ic0$) {}
        if (module0764.NIL == var2) {
            if (module0764.NIL != module0578.f35470((SubLObject)module0764.ONE_INTEGER) && module0764.NIL == module0578.f35477()) {
                Errors.warn((SubLObject)module0764.$ic118$);
            }
            var2 = (SubLObject)module0764.$ic0$;
        }
        SubLObject var71 = (SubLObject)module0764.NIL;
        SubLObject var72 = (SubLObject)module0764.NIL;
        SubLObject var73 = (SubLObject)module0764.NIL;
        SubLObject var74 = (SubLObject)module0764.NIL;
        final SubLObject var75 = module0584.$g4396$.currentBinding(var70);
        try {
            module0584.$g4396$.bind(var23, var70);
            SubLObject var76 = (SubLObject)((module0764.NIL != module0731.f44656(var67, (SubLObject)module0764.UNPROVIDED)) ? module0731.f44659(var67) : module0764.NIL);
            if (module0764.NIL == var76) {
                var76 = module0731.f44657();
            }
            if (var2.isList()) {
                var2 = module0035.remove_if_not((SubLObject)module0764.$ic57$, Sequences.remove_duplicates(var2, Symbols.symbol_function((SubLObject)module0764.EQUAL), (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED), (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                if (module0764.NIL == var2) {
                    var2 = var76;
                }
                final SubLObject var77 = (SubLObject)module0764.NIL;
                if (module0764.NIL == var74) {
                    SubLObject var78 = var2;
                    SubLObject var79 = (SubLObject)module0764.NIL;
                    var79 = var78.first();
                    while (module0764.NIL == var74 && module0764.NIL != var78) {
                        var70.resetMultipleValues();
                        final SubLObject var80 = f48465(var69, var79, var76, var23, var77, (SubLObject)module0764.UNPROVIDED);
                        final SubLObject var81 = var70.secondMultipleValue();
                        final SubLObject var82 = var70.thirdMultipleValue();
                        final SubLObject var83 = var70.fourthMultipleValue();
                        var70.resetMultipleValues();
                        if (module0764.NIL != var80) {
                            if (!var71.isString()) {
                                var71 = var80;
                                var72 = var81;
                                var73 = var83;
                                var74 = (SubLObject)SubLObjectFactory.makeBoolean(module0764.NIL == module0579.f35488());
                            }
                            else {
                                var73 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var80, var81), ConsesLow.append(var73, var83));
                            }
                        }
                        var78 = var78.rest();
                        var79 = var78.first();
                    }
                }
                if (!var71.isString()) {
                    var76 = ((module0764.NIL != module0731.f44656(var67, (SubLObject)module0764.UNPROVIDED)) ? module0731.f44659(var67) : module0731.f44657());
                    if (module0764.NIL == var71) {
                        SubLObject var84 = var2;
                        SubLObject var85 = (SubLObject)module0764.NIL;
                        var85 = var84.first();
                        while (module0764.NIL == var71 && module0764.NIL != var84) {
                            var70.resetMultipleValues();
                            final SubLObject var289_290 = f48465(var69, var85, var76, var23, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                            final SubLObject var291_292 = var70.secondMultipleValue();
                            var70.resetMultipleValues();
                            var71 = var289_290;
                            var72 = var291_292;
                            var84 = var84.rest();
                            var85 = var84.first();
                        }
                    }
                }
            }
            else if (module0764.NIL != module0731.f44656(var67, (SubLObject)module0764.UNPROVIDED)) {
                if (module0764.NIL == var74) {
                    SubLObject var84 = f48466(var69, var67);
                    SubLObject var86 = (SubLObject)module0764.NIL;
                    var86 = var84.first();
                    while (module0764.NIL == var74 && module0764.NIL != var84) {
                        final SubLObject var7_294 = module0585.$g4447$.currentBinding(var70);
                        try {
                            module0585.$g4447$.bind((SubLObject)module0764.$ic119$, var70);
                            final SubLObject var87 = (SubLObject)((module0764.NIL != module0732.f44924(var67, (SubLObject)module0764.UNPROVIDED)) ? f48467(var86, var69) : module0764.$ic120$);
                            SubLObject var88 = (SubLObject)module0764.NIL;
                            SubLObject var89 = (SubLObject)module0764.NIL;
                            SubLObject var90 = (SubLObject)module0764.NIL;
                            SubLObject var91 = var87;
                            SubLObject var92 = (SubLObject)module0764.NIL;
                            var92 = var91.first();
                            while (module0764.NIL != var91) {
                                if (module0764.NIL != module0751.f47099((SubLObject)ConsesLow.list(var92), var76, (SubLObject)module0764.UNPROVIDED)) {
                                    var88 = (SubLObject)ConsesLow.cons(var92, var88);
                                }
                                var91 = var91.rest();
                                var92 = var91.first();
                            }
                            var89 = module0035.f2378(module0035.f2462(var88, (SubLObject)module0764.$ic121$, (SubLObject)module0764.UNPROVIDED), (SubLObject)module0764.$ic122$, (SubLObject)module0764.UNPROVIDED);
                            if (module0764.NIL != var89) {
                                var90 = var86;
                            }
                            if (module0764.NIL != var90 && module0764.NIL == var71) {
                                var72 = var89;
                                var71 = var90;
                                var74 = (SubLObject)SubLObjectFactory.makeBoolean(module0764.NIL == module0579.f35488());
                            }
                            else if (module0764.NIL != var90) {
                                final SubLObject var93 = (SubLObject)ConsesLow.list(var90, var89);
                                if (module0764.NIL == conses_high.member(var93, var73, Symbols.symbol_function((SubLObject)module0764.EQUAL), Symbols.symbol_function((SubLObject)module0764.IDENTITY))) {
                                    var73 = (SubLObject)ConsesLow.cons(var93, var73);
                                }
                            }
                        }
                        finally {
                            module0585.$g4447$.rebind(var7_294, var70);
                        }
                        var84 = var84.rest();
                        var86 = var84.first();
                    }
                }
            }
            else {
                final SubLObject var94 = module0580.f35545();
                final SubLObject var7_295 = module0034.$g879$.currentBinding(var70);
                try {
                    module0034.$g879$.bind(var94, var70);
                    SubLObject var95 = (SubLObject)module0764.NIL;
                    if (module0764.NIL != var94 && module0764.NIL == module0034.f1842(var94)) {
                        var95 = module0034.f1869(var94);
                        final SubLObject var96 = Threads.current_process();
                        if (module0764.NIL == var95) {
                            module0034.f1873(var94, var96);
                        }
                        else if (!var95.eql(var96)) {
                            Errors.error((SubLObject)module0764.$ic123$);
                        }
                    }
                    try {
                        var70.resetMultipleValues();
                        final SubLObject var301_302 = module0730.f44563(var69, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                        final SubLObject var303_304 = var70.secondMultipleValue();
                        var70.resetMultipleValues();
                        var71 = var301_302;
                        var72 = var303_304;
                    }
                    finally {
                        final SubLObject var7_296 = Threads.$is_thread_performing_cleanupP$.currentBinding(var70);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0764.T, var70);
                            if (module0764.NIL != var94 && module0764.NIL == var95) {
                                module0034.f1873(var94, (SubLObject)module0764.NIL);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var7_296, var70);
                        }
                    }
                }
                finally {
                    module0034.$g879$.rebind(var7_295, var70);
                }
            }
        }
        finally {
            module0584.$g4396$.rebind(var75, var70);
        }
        return Values.values(var71, var72, var73);
    }
    
    public static SubLObject f48468(final SubLObject var306, final SubLObject var307) {
        final SubLThread var308 = SubLProcess.currentSubLThread();
        SubLObject var309 = (SubLObject)module0764.NIL;
        final SubLObject var310 = module0580.f35545();
        final SubLObject var311 = module0034.$g879$.currentBinding(var308);
        try {
            module0034.$g879$.bind(var310, var308);
            SubLObject var312 = (SubLObject)module0764.NIL;
            if (module0764.NIL != var310 && module0764.NIL == module0034.f1842(var310)) {
                var312 = module0034.f1869(var310);
                final SubLObject var313 = Threads.current_process();
                if (module0764.NIL == var312) {
                    module0034.f1873(var310, var313);
                }
                else if (!var312.eql(var313)) {
                    Errors.error((SubLObject)module0764.$ic123$);
                }
            }
            try {
                var309 = module0730.f44612(var306, var307, module0579.$g4260$.getDynamicValue(var308));
            }
            finally {
                final SubLObject var7_308 = Threads.$is_thread_performing_cleanupP$.currentBinding(var308);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0764.T, var308);
                    if (module0764.NIL != var310 && module0764.NIL == var312) {
                        module0034.f1873(var310, (SubLObject)module0764.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var7_308, var308);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var311, var308);
        }
        return var309;
    }
    
    public static SubLObject f48466(final SubLObject var69, final SubLObject var67) {
        final SubLThread var70 = SubLProcess.currentSubLThread();
        SubLObject var71 = (SubLObject)module0764.NIL;
        final SubLObject var72 = module0580.f35545();
        final SubLObject var73 = module0034.$g879$.currentBinding(var70);
        try {
            module0034.$g879$.bind(var72, var70);
            SubLObject var74 = (SubLObject)module0764.NIL;
            if (module0764.NIL != var72 && module0764.NIL == module0034.f1842(var72)) {
                var74 = module0034.f1869(var72);
                final SubLObject var75 = Threads.current_process();
                if (module0764.NIL == var74) {
                    module0034.f1873(var72, var75);
                }
                else if (!var74.eql(var75)) {
                    Errors.error((SubLObject)module0764.$ic123$);
                }
            }
            try {
                var71 = module0731.f44711(var69, var67, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
            }
            finally {
                final SubLObject var7_310 = Threads.$is_thread_performing_cleanupP$.currentBinding(var70);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0764.T, var70);
                    if (module0764.NIL != var72 && module0764.NIL == var74) {
                        module0034.f1873(var72, (SubLObject)module0764.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var7_310, var70);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var73, var70);
        }
        return var71;
    }
    
    public static SubLObject f48467(final SubLObject var293, final SubLObject var69) {
        final SubLThread var294 = SubLProcess.currentSubLThread();
        SubLObject var295 = (SubLObject)module0764.NIL;
        final SubLObject var296 = module0580.f35545();
        final SubLObject var297 = module0034.$g879$.currentBinding(var294);
        try {
            module0034.$g879$.bind(var296, var294);
            SubLObject var298 = (SubLObject)module0764.NIL;
            if (module0764.NIL != var296 && module0764.NIL == module0034.f1842(var296)) {
                var298 = module0034.f1869(var296);
                final SubLObject var299 = Threads.current_process();
                if (module0764.NIL == var298) {
                    module0034.f1873(var296, var299);
                }
                else if (!var298.eql(var299)) {
                    Errors.error((SubLObject)module0764.$ic123$);
                }
            }
            try {
                var295 = module0731.f44725(var293, var69, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
            }
            finally {
                final SubLObject var7_311 = Threads.$is_thread_performing_cleanupP$.currentBinding(var294);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0764.T, var294);
                    if (module0764.NIL != var296 && module0764.NIL == var298) {
                        module0034.f1873(var296, (SubLObject)module0764.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var7_311, var294);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var297, var294);
        }
        return var295;
    }
    
    public static SubLObject f48469(final SubLObject var69, final SubLObject var5, final SubLObject var283, SubLObject var23, SubLObject var284, SubLObject var312) {
        if (var23 == module0764.UNPROVIDED) {
            var23 = module0579.$g4260$.getDynamicValue();
        }
        if (var284 == module0764.UNPROVIDED) {
            var284 = module0579.$g4289$.getDynamicValue();
        }
        if (var312 == module0764.UNPROVIDED) {
            var312 = module0579.f35488();
        }
        final SubLThread var313 = SubLProcess.currentSubLThread();
        SubLObject var314 = (SubLObject)module0764.NIL;
        SubLObject var315 = (SubLObject)module0764.NIL;
        SubLObject var316 = (SubLObject)module0764.NIL;
        SubLObject var317 = (SubLObject)module0764.NIL;
        SubLObject var318 = (SubLObject)module0764.NIL;
        final SubLObject var319 = module0751.f47099((SubLObject)ConsesLow.list(var5), var283, (SubLObject)module0764.UNPROVIDED);
        if (module0764.NIL == var318) {
            SubLObject var320 = var319;
            SubLObject var321 = (SubLObject)module0764.NIL;
            var321 = var320.first();
            while (module0764.NIL == var318 && module0764.NIL != var320) {
                if (module0764.NIL != var312) {
                    var313.resetMultipleValues();
                    final SubLObject var322 = module0730.f44564(var69, var321, (SubLObject)module0764.UNPROVIDED);
                    final SubLObject var323 = var313.secondMultipleValue();
                    var313.resetMultipleValues();
                    SubLObject var324 = (SubLObject)module0764.NIL;
                    SubLObject var4_317 = (SubLObject)module0764.NIL;
                    SubLObject var318_319 = (SubLObject)module0764.NIL;
                    SubLObject var5_320 = (SubLObject)module0764.NIL;
                    var324 = var322;
                    var4_317 = var324.first();
                    var318_319 = var323;
                    var5_320 = var318_319.first();
                    while (module0764.NIL != var318_319 || module0764.NIL != var324) {
                        if (module0764.NIL != var5_320 && module0764.NIL == module0004.f104(var5_320, var283, (SubLObject)module0764.$ic125$, (SubLObject)module0764.UNPROVIDED)) {
                            if (module0764.NIL != module0578.f35470((SubLObject)module0764.ONE_INTEGER) && module0764.NIL == module0578.f35477()) {
                                Errors.warn((SubLObject)module0764.$ic126$, var5_320);
                            }
                        }
                        else if (var314.isString()) {
                            if (module0764.NIL != module0578.f35470((SubLObject)module0764.ONE_INTEGER)) {
                                PrintLow.format((SubLObject)module0764.T, (SubLObject)module0764.$ic127$, var4_317, var5_320);
                            }
                            var317 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var4_317, var5_320), var317);
                        }
                        else {
                            var314 = var4_317;
                            var315 = var5_320;
                        }
                        var324 = var324.rest();
                        var4_317 = var324.first();
                        var318_319 = var318_319.rest();
                        var5_320 = var318_319.first();
                    }
                }
                else {
                    final SubLObject var325 = module0580.f35545();
                    final SubLObject var326 = module0034.$g879$.currentBinding(var313);
                    try {
                        module0034.$g879$.bind(var325, var313);
                        SubLObject var327 = (SubLObject)module0764.NIL;
                        if (module0764.NIL != var325 && module0764.NIL == module0034.f1842(var325)) {
                            var327 = module0034.f1869(var325);
                            final SubLObject var328 = Threads.current_process();
                            if (module0764.NIL == var327) {
                                module0034.f1873(var325, var328);
                            }
                            else if (!var327.eql(var328)) {
                                Errors.error((SubLObject)module0764.$ic123$);
                            }
                        }
                        try {
                            var313.resetMultipleValues();
                            final SubLObject var321_322 = module0730.f44567(var69, var321, var23);
                            final SubLObject var323_324 = var313.secondMultipleValue();
                            var313.resetMultipleValues();
                            var314 = var321_322;
                            var315 = var323_324;
                        }
                        finally {
                            final SubLObject var7_325 = Threads.$is_thread_performing_cleanupP$.currentBinding(var313);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0764.T, var313);
                                if (module0764.NIL != var325 && module0764.NIL == var327) {
                                    module0034.f1873(var325, (SubLObject)module0764.NIL);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var7_325, var313);
                            }
                        }
                    }
                    finally {
                        module0034.$g879$.rebind(var326, var313);
                    }
                    if (module0764.NIL != var315 && module0764.NIL == conses_high.member(var315, var283, (SubLObject)module0764.$ic125$, (SubLObject)module0764.UNPROVIDED)) {
                        var314 = (SubLObject)module0764.NIL;
                        var315 = (SubLObject)module0764.NIL;
                    }
                    var318 = Types.stringp(var314);
                }
                var320 = var320.rest();
                var321 = var320.first();
            }
        }
        if (module0764.NIL == var314) {
            var313.resetMultipleValues();
            final SubLObject var326_327 = f48470(var69, var5, var283, var23, var284);
            final SubLObject var328_329 = var313.secondMultipleValue();
            var313.resetMultipleValues();
            var314 = var326_327;
            var315 = var328_329;
            if (var314.isString()) {
                var316 = (SubLObject)module0764.T;
            }
        }
        return Values.values(var314, var315, var316, var317);
    }
    
    public static SubLObject f48465(final SubLObject var69, final SubLObject var5, final SubLObject var283, SubLObject var23, SubLObject var284, SubLObject var312) {
        if (var23 == module0764.UNPROVIDED) {
            var23 = module0579.$g4260$.getDynamicValue();
        }
        if (var284 == module0764.UNPROVIDED) {
            var284 = module0579.$g4289$.getDynamicValue();
        }
        if (var312 == module0764.UNPROVIDED) {
            var312 = module0579.f35488();
        }
        final SubLThread var313 = SubLProcess.currentSubLThread();
        final SubLObject var314 = module0034.$g879$.getDynamicValue(var313);
        SubLObject var315 = (SubLObject)module0764.NIL;
        if (module0764.NIL == var314) {
            return f48469(var69, var5, var283, var23, var284, var312);
        }
        var315 = module0034.f1857(var314, (SubLObject)module0764.$ic124$, (SubLObject)module0764.UNPROVIDED);
        if (module0764.NIL == var315) {
            var315 = module0034.f1807(module0034.f1842(var314), (SubLObject)module0764.$ic124$, (SubLObject)module0764.SIX_INTEGER, (SubLObject)module0764.$ic128$, (SubLObject)module0764.EQUAL, (SubLObject)module0764.UNPROVIDED);
            module0034.f1860(var314, (SubLObject)module0764.$ic124$, var315);
        }
        final SubLObject var316 = module0034.f1778(var69, var5, var283, var23, var284, var312);
        final SubLObject var317 = module0034.f1814(var315, var316, (SubLObject)module0764.UNPROVIDED);
        if (var317 != module0764.$ic5$) {
            SubLObject var318 = var317;
            SubLObject var319 = (SubLObject)module0764.NIL;
            var319 = var318.first();
            while (module0764.NIL != var318) {
                SubLObject var320 = var319.first();
                final SubLObject var321 = conses_high.second(var319);
                if (var69.equal(var320.first())) {
                    var320 = var320.rest();
                    if (var5.equal(var320.first())) {
                        var320 = var320.rest();
                        if (var283.equal(var320.first())) {
                            var320 = var320.rest();
                            if (var23.equal(var320.first())) {
                                var320 = var320.rest();
                                if (var284.equal(var320.first())) {
                                    var320 = var320.rest();
                                    if (module0764.NIL != var320 && module0764.NIL == var320.rest() && var312.equal(var320.first())) {
                                        return module0034.f1959(var321);
                                    }
                                }
                            }
                        }
                    }
                }
                var318 = var318.rest();
                var319 = var318.first();
            }
        }
        final SubLObject var322 = Values.arg2(var313.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f48469(var69, var5, var283, var23, var284, var312)));
        module0034.f1836(var315, var316, var317, var322, (SubLObject)ConsesLow.list(var69, var5, var283, var23, var284, var312));
        return module0034.f1959(var322);
    }
    
    public static SubLObject f48471(final SubLObject var69, final SubLObject var330, final SubLObject var283, SubLObject var23, SubLObject var284) {
        if (var23 == module0764.UNPROVIDED) {
            var23 = module0579.$g4260$.getDynamicValue();
        }
        if (var284 == module0764.UNPROVIDED) {
            var284 = module0579.$g4289$.getDynamicValue();
        }
        final SubLThread var331 = SubLProcess.currentSubLThread();
        if (module0764.NIL != module0578.f35470((SubLObject)module0764.ONE_INTEGER)) {
            PrintLow.format((SubLObject)module0764.T, (SubLObject)module0764.$ic130$, var330, var69);
        }
        SubLObject var332 = (SubLObject)module0764.NIL;
        SubLObject var333 = (SubLObject)module0764.NIL;
        if (module0764.NIL == var332) {
            SubLObject var334 = f48472(var330, var23, var284);
            SubLObject var335 = (SubLObject)module0764.NIL;
            var335 = var334.first();
            while (module0764.NIL == var332 && module0764.NIL != var334) {
                SubLObject var337;
                final SubLObject var336 = var337 = var335;
                SubLObject var338 = (SubLObject)module0764.NIL;
                SubLObject var339 = (SubLObject)module0764.NIL;
                SubLObject var340 = (SubLObject)module0764.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var337, var336, (SubLObject)module0764.$ic131$);
                var338 = var337.first();
                var337 = var337.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var337, var336, (SubLObject)module0764.$ic131$);
                var339 = var337.first();
                var337 = var337.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var337, var336, (SubLObject)module0764.$ic131$);
                var340 = var337.first();
                var337 = var337.rest();
                if (module0764.NIL == var337) {
                    if (module0764.NIL == var332) {
                        SubLObject var15_337 = module0751.f47099((SubLObject)ConsesLow.list(var338), var283, (SubLObject)module0764.UNPROVIDED);
                        SubLObject var341 = (SubLObject)module0764.NIL;
                        var341 = var15_337.first();
                        while (module0764.NIL == var332 && module0764.NIL != var15_337) {
                            SubLObject var342 = (SubLObject)module0764.NIL;
                            SubLObject var343 = (SubLObject)module0764.NIL;
                            final SubLObject var344 = module0580.f35545();
                            final SubLObject var345 = module0034.$g879$.currentBinding(var331);
                            try {
                                module0034.$g879$.bind(var344, var331);
                                SubLObject var346 = (SubLObject)module0764.NIL;
                                if (module0764.NIL != var344 && module0764.NIL == module0034.f1842(var344)) {
                                    var346 = module0034.f1869(var344);
                                    final SubLObject var347 = Threads.current_process();
                                    if (module0764.NIL == var346) {
                                        module0034.f1873(var344, var347);
                                    }
                                    else if (!var346.eql(var347)) {
                                        Errors.error((SubLObject)module0764.$ic123$);
                                    }
                                }
                                try {
                                    var331.resetMultipleValues();
                                    final SubLObject var341_342 = module0730.f44567(var69, var341, var23);
                                    final SubLObject var343_344 = var331.secondMultipleValue();
                                    var331.resetMultipleValues();
                                    var342 = var341_342;
                                    var343 = var343_344;
                                }
                                finally {
                                    final SubLObject var7_345 = Threads.$is_thread_performing_cleanupP$.currentBinding(var331);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0764.T, var331);
                                        if (module0764.NIL != var344 && module0764.NIL == var346) {
                                            module0034.f1873(var344, (SubLObject)module0764.NIL);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var7_345, var331);
                                    }
                                }
                            }
                            finally {
                                module0034.$g879$.rebind(var345, var331);
                            }
                            if (module0764.NIL != var342) {
                                if (module0764.NIL != module0751.f46661((SubLObject)module0764.UNPROVIDED) && module0764.NIL != module0751.f46658(var339, module0764.$ic132$, (SubLObject)module0764.UNPROVIDED)) {
                                    var342 = module0038.f2812(var342);
                                }
                                var333 = var339;
                                var332 = ((module0764.NIL != module0751.f46661((SubLObject)module0764.UNPROVIDED)) ? module0728.f44459(var342, var340) : Sequences.cconcatenate(var342, var340));
                            }
                            var15_337 = var15_337.rest();
                            var341 = var15_337.first();
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var336, (SubLObject)module0764.$ic131$);
                }
                var334 = var334.rest();
                var335 = var334.first();
            }
        }
        return Values.values(var332, var333);
    }
    
    public static SubLObject f48470(final SubLObject var69, final SubLObject var330, final SubLObject var283, SubLObject var23, SubLObject var284) {
        if (var23 == module0764.UNPROVIDED) {
            var23 = module0579.$g4260$.getDynamicValue();
        }
        if (var284 == module0764.UNPROVIDED) {
            var284 = module0579.$g4289$.getDynamicValue();
        }
        final SubLThread var331 = SubLProcess.currentSubLThread();
        final SubLObject var332 = module0034.$g879$.getDynamicValue(var331);
        SubLObject var333 = (SubLObject)module0764.NIL;
        if (module0764.NIL == var332) {
            return f48471(var69, var330, var283, var23, var284);
        }
        var333 = module0034.f1857(var332, (SubLObject)module0764.$ic129$, (SubLObject)module0764.UNPROVIDED);
        if (module0764.NIL == var333) {
            var333 = module0034.f1807(module0034.f1842(var332), (SubLObject)module0764.$ic129$, (SubLObject)module0764.FIVE_INTEGER, (SubLObject)module0764.$ic133$, (SubLObject)module0764.EQUAL, (SubLObject)module0764.UNPROVIDED);
            module0034.f1860(var332, (SubLObject)module0764.$ic129$, var333);
        }
        final SubLObject var334 = module0034.f1779(var69, var330, var283, var23, var284);
        final SubLObject var335 = module0034.f1814(var333, var334, (SubLObject)module0764.UNPROVIDED);
        if (var335 != module0764.$ic5$) {
            SubLObject var336 = var335;
            SubLObject var337 = (SubLObject)module0764.NIL;
            var337 = var336.first();
            while (module0764.NIL != var336) {
                SubLObject var338 = var337.first();
                final SubLObject var339 = conses_high.second(var337);
                if (var69.equal(var338.first())) {
                    var338 = var338.rest();
                    if (var330.equal(var338.first())) {
                        var338 = var338.rest();
                        if (var283.equal(var338.first())) {
                            var338 = var338.rest();
                            if (var23.equal(var338.first())) {
                                var338 = var338.rest();
                                if (module0764.NIL != var338 && module0764.NIL == var338.rest() && var284.equal(var338.first())) {
                                    return module0034.f1959(var339);
                                }
                            }
                        }
                    }
                }
                var336 = var336.rest();
                var337 = var336.first();
            }
        }
        final SubLObject var340 = Values.arg2(var331.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f48471(var69, var330, var283, var23, var284)));
        module0034.f1836(var333, var334, var335, var340, (SubLObject)ConsesLow.list(var69, var330, var283, var23, var284));
        return module0034.f1959(var340);
    }
    
    public static SubLObject f48473(final SubLObject var5, SubLObject var23, SubLObject var284) {
        if (var23 == module0764.UNPROVIDED) {
            var23 = module0579.$g4260$.getDynamicValue();
        }
        if (var284 == module0764.UNPROVIDED) {
            var284 = module0579.$g4289$.getDynamicValue();
        }
        return f48474(var5, var23, var284);
    }
    
    public static SubLObject f48472(final SubLObject var5, SubLObject var23, SubLObject var284) {
        if (var23 == module0764.UNPROVIDED) {
            var23 = module0579.$g4260$.getDynamicValue();
        }
        if (var284 == module0764.UNPROVIDED) {
            var284 = module0579.$g4289$.getDynamicValue();
        }
        final SubLThread var285 = SubLProcess.currentSubLThread();
        final SubLObject var286 = module0034.$g879$.getDynamicValue(var285);
        SubLObject var287 = (SubLObject)module0764.NIL;
        if (module0764.NIL == var286) {
            return f48473(var5, var23, var284);
        }
        var287 = module0034.f1857(var286, (SubLObject)module0764.$ic134$, (SubLObject)module0764.UNPROVIDED);
        if (module0764.NIL == var287) {
            var287 = module0034.f1807(module0034.f1842(var286), (SubLObject)module0764.$ic134$, (SubLObject)module0764.THREE_INTEGER, (SubLObject)module0764.$ic135$, (SubLObject)module0764.EQL, (SubLObject)module0764.UNPROVIDED);
            module0034.f1860(var286, (SubLObject)module0764.$ic134$, var287);
        }
        final SubLObject var288 = module0034.f1781(var5, var23, var284);
        final SubLObject var289 = module0034.f1814(var287, var288, (SubLObject)module0764.UNPROVIDED);
        if (var289 != module0764.$ic5$) {
            SubLObject var290 = var289;
            SubLObject var291 = (SubLObject)module0764.NIL;
            var291 = var290.first();
            while (module0764.NIL != var290) {
                SubLObject var292 = var291.first();
                final SubLObject var293 = conses_high.second(var291);
                if (var5.eql(var292.first())) {
                    var292 = var292.rest();
                    if (var23.eql(var292.first())) {
                        var292 = var292.rest();
                        if (module0764.NIL != var292 && module0764.NIL == var292.rest() && var284.eql(var292.first())) {
                            return module0034.f1959(var293);
                        }
                    }
                }
                var290 = var290.rest();
                var291 = var290.first();
            }
        }
        final SubLObject var294 = Values.arg2(var285.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f48473(var5, var23, var284)));
        module0034.f1836(var287, var288, var289, var294, (SubLObject)ConsesLow.list(var5, var23, var284));
        return module0034.f1959(var294);
    }
    
    public static SubLObject f48474(final SubLObject var5, SubLObject var23, SubLObject var284) {
        if (var23 == module0764.UNPROVIDED) {
            var23 = module0579.$g4260$.getDynamicValue();
        }
        if (var284 == module0764.UNPROVIDED) {
            var284 = module0579.$g4289$.getDynamicValue();
        }
        final SubLThread var285 = SubLProcess.currentSubLThread();
        SubLObject var286 = (SubLObject)module0764.NIL;
        final SubLObject var287 = (module0764.NIL != module0166.f10737((SubLObject)module0764.$ic136$) && module0764.NIL != var284) ? module0166.f10737((SubLObject)module0764.$ic136$) : ((module0764.NIL != module0166.f10737((SubLObject)module0764.$ic137$) && module0764.NIL != var284) ? module0166.f10737((SubLObject)module0764.$ic137$) : ((module0764.NIL != module0166.f10737((SubLObject)module0764.$ic138$)) ? module0166.f10737((SubLObject)module0764.$ic138$) : module0764.$ic139$));
        final SubLObject var288 = module0147.f9540(var23);
        final SubLObject var289 = module0147.$g2095$.currentBinding(var285);
        final SubLObject var290 = module0147.$g2094$.currentBinding(var285);
        final SubLObject var291 = module0147.$g2096$.currentBinding(var285);
        try {
            module0147.$g2095$.bind(module0147.f9545(var288), var285);
            module0147.$g2094$.bind(module0147.f9546(var288), var285);
            module0147.$g2096$.bind(module0147.f9549(var288), var285);
            final SubLObject var292 = (SubLObject)module0764.$ic98$;
            final SubLObject var293 = module0056.f4145(var292);
            SubLObject var294 = (SubLObject)module0764.NIL;
            final SubLObject var7_348 = module0139.$g1635$.currentBinding(var285);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var285);
                final SubLObject var295 = (SubLObject)module0764.NIL;
                final SubLObject var7_349 = module0141.$g1714$.currentBinding(var285);
                final SubLObject var8_350 = module0141.$g1715$.currentBinding(var285);
                try {
                    module0141.$g1714$.bind((module0764.NIL != var295) ? var295 : module0141.f9283(), var285);
                    module0141.$g1715$.bind((SubLObject)((module0764.NIL != var295) ? module0764.$ic100$ : module0141.$g1715$.getDynamicValue(var285)), var285);
                    if (module0764.NIL != var295 && module0764.NIL != module0136.f8864() && module0764.NIL == module0141.f9279(var295)) {
                        final SubLObject var296 = module0136.$g1591$.getDynamicValue(var285);
                        if (var296.eql((SubLObject)module0764.$ic101$)) {
                            module0136.f8870((SubLObject)module0764.ONE_INTEGER, (SubLObject)module0764.$ic102$, var295, (SubLObject)module0764.$ic103$, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                        }
                        else if (var296.eql((SubLObject)module0764.$ic104$)) {
                            module0136.f8871((SubLObject)module0764.ONE_INTEGER, (SubLObject)module0764.$ic105$, (SubLObject)module0764.$ic102$, var295, (SubLObject)module0764.$ic103$, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                        }
                        else if (var296.eql((SubLObject)module0764.$ic106$)) {
                            Errors.warn((SubLObject)module0764.$ic102$, var295, (SubLObject)module0764.$ic103$);
                        }
                        else {
                            Errors.warn((SubLObject)module0764.$ic107$, module0136.$g1591$.getDynamicValue(var285));
                            Errors.cerror((SubLObject)module0764.$ic105$, (SubLObject)module0764.$ic102$, var295, (SubLObject)module0764.$ic103$);
                        }
                    }
                    final SubLObject var7_350 = module0141.$g1670$.currentBinding(var285);
                    final SubLObject var8_351 = module0141.$g1671$.currentBinding(var285);
                    final SubLObject var9_353 = module0141.$g1672$.currentBinding(var285);
                    final SubLObject var297 = module0141.$g1674$.currentBinding(var285);
                    final SubLObject var298 = module0137.$g1605$.currentBinding(var285);
                    try {
                        module0141.$g1670$.bind(module0137.f8955(module0764.$ic108$), var285);
                        module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0764.$ic108$)), var285);
                        module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0764.$ic108$)), var285);
                        module0141.$g1674$.bind((SubLObject)module0764.NIL, var285);
                        module0137.$g1605$.bind(module0137.f8955(module0764.$ic108$), var285);
                        if (module0764.NIL != module0136.f8865() || module0764.NIL != module0244.f15795(var5, module0137.f8955((SubLObject)module0764.UNPROVIDED))) {
                            final SubLObject var7_351 = module0141.$g1677$.currentBinding(var285);
                            final SubLObject var8_352 = module0138.$g1619$.currentBinding(var285);
                            final SubLObject var9_354 = module0141.$g1674$.currentBinding(var285);
                            try {
                                module0141.$g1677$.bind(module0141.f9210(), var285);
                                module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955(module0764.$ic108$)), var285);
                                module0141.$g1674$.bind((SubLObject)module0764.NIL, var285);
                                module0249.f16055(var5, (SubLObject)module0764.UNPROVIDED);
                                for (var294 = (SubLObject)ConsesLow.list(var5, module0141.f9195()); module0764.NIL != var294; var294 = module0056.f4150(var293)) {
                                    final SubLObject var223_357 = var294.first();
                                    final SubLObject var299 = conses_high.second(var294);
                                    final SubLObject var300 = var223_357;
                                    final SubLObject var7_352 = module0141.$g1674$.currentBinding(var285);
                                    try {
                                        module0141.$g1674$.bind(var299, var285);
                                        if (module0764.NIL != module0250.f16115(module0141.f9190(), var223_357)) {
                                            final SubLObject var223_358 = var287;
                                            final SubLObject var224_361 = (SubLObject)module0764.$ic98$;
                                            final SubLObject var225_362 = module0056.f4145(var224_361);
                                            SubLObject var226_363 = (SubLObject)module0764.NIL;
                                            final SubLObject var7_353 = module0139.$g1635$.currentBinding(var285);
                                            try {
                                                module0139.$g1635$.bind(module0139.f9007(), var285);
                                                final SubLObject var232_365 = (SubLObject)module0764.NIL;
                                                final SubLObject var7_354 = module0141.$g1714$.currentBinding(var285);
                                                final SubLObject var8_353 = module0141.$g1715$.currentBinding(var285);
                                                try {
                                                    module0141.$g1714$.bind((module0764.NIL != var232_365) ? var232_365 : module0141.f9283(), var285);
                                                    module0141.$g1715$.bind((SubLObject)((module0764.NIL != var232_365) ? module0764.$ic100$ : module0141.$g1715$.getDynamicValue(var285)), var285);
                                                    if (module0764.NIL != var232_365 && module0764.NIL != module0136.f8864() && module0764.NIL == module0141.f9279(var232_365)) {
                                                        final SubLObject var301 = module0136.$g1591$.getDynamicValue(var285);
                                                        if (var301.eql((SubLObject)module0764.$ic101$)) {
                                                            module0136.f8870((SubLObject)module0764.ONE_INTEGER, (SubLObject)module0764.$ic102$, var232_365, (SubLObject)module0764.$ic103$, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                                                        }
                                                        else if (var301.eql((SubLObject)module0764.$ic104$)) {
                                                            module0136.f8871((SubLObject)module0764.ONE_INTEGER, (SubLObject)module0764.$ic105$, (SubLObject)module0764.$ic102$, var232_365, (SubLObject)module0764.$ic103$, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                                                        }
                                                        else if (var301.eql((SubLObject)module0764.$ic106$)) {
                                                            Errors.warn((SubLObject)module0764.$ic102$, var232_365, (SubLObject)module0764.$ic103$);
                                                        }
                                                        else {
                                                            Errors.warn((SubLObject)module0764.$ic107$, module0136.$g1591$.getDynamicValue(var285));
                                                            Errors.cerror((SubLObject)module0764.$ic105$, (SubLObject)module0764.$ic102$, var232_365, (SubLObject)module0764.$ic103$);
                                                        }
                                                    }
                                                    final SubLObject var7_355 = module0141.$g1670$.currentBinding(var285);
                                                    final SubLObject var8_354 = module0141.$g1671$.currentBinding(var285);
                                                    final SubLObject var9_355 = module0141.$g1672$.currentBinding(var285);
                                                    final SubLObject var169_371 = module0141.$g1674$.currentBinding(var285);
                                                    final SubLObject var170_372 = module0137.$g1605$.currentBinding(var285);
                                                    try {
                                                        module0141.$g1670$.bind(module0137.f8955(module0764.$ic108$), var285);
                                                        module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0764.$ic108$)), var285);
                                                        module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0764.$ic108$)), var285);
                                                        module0141.$g1674$.bind((SubLObject)module0764.NIL, var285);
                                                        module0137.$g1605$.bind(module0137.f8955(module0764.$ic108$), var285);
                                                        if (module0764.NIL != module0136.f8865() || module0764.NIL != module0244.f15795(var287, module0137.f8955((SubLObject)module0764.UNPROVIDED))) {
                                                            final SubLObject var7_356 = module0141.$g1677$.currentBinding(var285);
                                                            final SubLObject var8_355 = module0138.$g1619$.currentBinding(var285);
                                                            final SubLObject var9_356 = module0141.$g1674$.currentBinding(var285);
                                                            try {
                                                                module0141.$g1677$.bind(module0141.f9210(), var285);
                                                                module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955(module0764.$ic108$)), var285);
                                                                module0141.$g1674$.bind((SubLObject)module0764.NIL, var285);
                                                                module0249.f16055(var223_358, (SubLObject)module0764.UNPROVIDED);
                                                                for (var226_363 = (SubLObject)ConsesLow.list(var287, module0141.f9195()); module0764.NIL != var226_363; var226_363 = module0056.f4150(var225_362)) {
                                                                    final SubLObject var223_359 = var226_363.first();
                                                                    final SubLObject var242_377 = conses_high.second(var226_363);
                                                                    final SubLObject var302 = var223_359;
                                                                    final SubLObject var7_357 = module0141.$g1674$.currentBinding(var285);
                                                                    try {
                                                                        module0141.$g1674$.bind(var242_377, var285);
                                                                        if (module0764.NIL != module0250.f16115(module0141.f9190(), var223_359)) {
                                                                            SubLObject var303 = module0220.f14562(var300, var302, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                                                                            SubLObject var304 = (SubLObject)module0764.NIL;
                                                                            var304 = var303.first();
                                                                            while (module0764.NIL != var303) {
                                                                                SubLObject var28_381 = f48475(var304, var300, var23);
                                                                                SubLObject var305 = (SubLObject)module0764.NIL;
                                                                                var305 = var28_381.first();
                                                                                while (module0764.NIL != var28_381) {
                                                                                    var286 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var304, var300, var305), var286);
                                                                                    var28_381 = var28_381.rest();
                                                                                    var305 = var28_381.first();
                                                                                }
                                                                                var303 = var303.rest();
                                                                                var304 = var303.first();
                                                                            }
                                                                        }
                                                                        SubLObject var307;
                                                                        final SubLObject var306 = var307 = module0200.f12443(module0137.f8955(module0764.$ic108$));
                                                                        SubLObject var308 = (SubLObject)module0764.NIL;
                                                                        var308 = var307.first();
                                                                        while (module0764.NIL != var307) {
                                                                            final SubLObject var7_358 = module0137.$g1605$.currentBinding(var285);
                                                                            final SubLObject var8_356 = module0141.$g1674$.currentBinding(var285);
                                                                            try {
                                                                                module0137.$g1605$.bind(var308, var285);
                                                                                module0141.$g1674$.bind((SubLObject)((module0764.NIL != module0141.f9205((SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0764.NIL == module0141.$g1674$.getDynamicValue(var285)) : module0141.$g1674$.getDynamicValue(var285)), var285);
                                                                                final SubLObject var309 = module0228.f15229(var223_359);
                                                                                if (module0764.NIL != module0138.f8992(var309)) {
                                                                                    final SubLObject var310 = module0242.f15664(var309, module0137.f8955((SubLObject)module0764.UNPROVIDED));
                                                                                    if (module0764.NIL != var310) {
                                                                                        final SubLObject var311 = module0245.f15834(var310, module0138.f8979(), module0137.f8955((SubLObject)module0764.UNPROVIDED));
                                                                                        if (module0764.NIL != var311) {
                                                                                            SubLObject var312;
                                                                                            for (var312 = module0066.f4838(module0067.f4891(var311)); module0764.NIL == module0066.f4841(var312); var312 = module0066.f4840(var312)) {
                                                                                                var285.resetMultipleValues();
                                                                                                final SubLObject var255_384 = module0066.f4839(var312);
                                                                                                final SubLObject var313 = var285.secondMultipleValue();
                                                                                                var285.resetMultipleValues();
                                                                                                if (module0764.NIL != module0147.f9507(var255_384)) {
                                                                                                    final SubLObject var7_359 = module0138.$g1623$.currentBinding(var285);
                                                                                                    try {
                                                                                                        module0138.$g1623$.bind(var255_384, var285);
                                                                                                        SubLObject var254_386;
                                                                                                        for (var254_386 = module0066.f4838(module0067.f4891(var313)); module0764.NIL == module0066.f4841(var254_386); var254_386 = module0066.f4840(var254_386)) {
                                                                                                            var285.resetMultipleValues();
                                                                                                            final SubLObject var314 = module0066.f4839(var254_386);
                                                                                                            final SubLObject var315 = var285.secondMultipleValue();
                                                                                                            var285.resetMultipleValues();
                                                                                                            if (module0764.NIL != module0141.f9289(var314)) {
                                                                                                                final SubLObject var7_360 = module0138.$g1624$.currentBinding(var285);
                                                                                                                try {
                                                                                                                    module0138.$g1624$.bind(var314, var285);
                                                                                                                    final SubLObject var316 = var315;
                                                                                                                    if (module0764.NIL != module0077.f5302(var316)) {
                                                                                                                        final SubLObject var317 = module0077.f5333(var316);
                                                                                                                        SubLObject var318;
                                                                                                                        SubLObject var319;
                                                                                                                        SubLObject var320;
                                                                                                                        for (var318 = module0032.f1741(var317), var319 = (SubLObject)module0764.NIL, var319 = module0032.f1742(var318, var317); module0764.NIL == module0032.f1744(var318, var319); var319 = module0032.f1743(var319)) {
                                                                                                                            var320 = module0032.f1745(var318, var319);
                                                                                                                            if (module0764.NIL != module0032.f1746(var319, var320) && module0764.NIL == module0249.f16059(var320, (SubLObject)module0764.UNPROVIDED)) {
                                                                                                                                module0249.f16055(var320, (SubLObject)module0764.UNPROVIDED);
                                                                                                                                module0056.f4149((SubLObject)ConsesLow.list(var320, module0141.f9195()), var225_362);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    else if (var316.isList()) {
                                                                                                                        SubLObject var321 = var316;
                                                                                                                        SubLObject var322 = (SubLObject)module0764.NIL;
                                                                                                                        var322 = var321.first();
                                                                                                                        while (module0764.NIL != var321) {
                                                                                                                            if (module0764.NIL == module0249.f16059(var322, (SubLObject)module0764.UNPROVIDED)) {
                                                                                                                                module0249.f16055(var322, (SubLObject)module0764.UNPROVIDED);
                                                                                                                                module0056.f4149((SubLObject)ConsesLow.list(var322, module0141.f9195()), var225_362);
                                                                                                                            }
                                                                                                                            var321 = var321.rest();
                                                                                                                            var322 = var321.first();
                                                                                                                        }
                                                                                                                    }
                                                                                                                    else {
                                                                                                                        Errors.error((SubLObject)module0764.$ic109$, var316);
                                                                                                                    }
                                                                                                                }
                                                                                                                finally {
                                                                                                                    module0138.$g1624$.rebind(var7_360, var285);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        module0066.f4842(var254_386);
                                                                                                    }
                                                                                                    finally {
                                                                                                        module0138.$g1623$.rebind(var7_359, var285);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            module0066.f4842(var312);
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        module0136.f8870((SubLObject)module0764.FIVE_INTEGER, (SubLObject)module0764.$ic110$, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                                                                                    }
                                                                                }
                                                                                else if (module0764.NIL != module0155.f9785(var309, (SubLObject)module0764.UNPROVIDED)) {
                                                                                    SubLObject var28_382;
                                                                                    final SubLObject var323 = var28_382 = ((module0764.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var285), module0137.f8955((SubLObject)module0764.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var285), module0137.f8955((SubLObject)module0764.UNPROVIDED)));
                                                                                    SubLObject var324 = (SubLObject)module0764.NIL;
                                                                                    var324 = var28_382.first();
                                                                                    while (module0764.NIL != var28_382) {
                                                                                        final SubLObject var7_361 = module0138.$g1625$.currentBinding(var285);
                                                                                        try {
                                                                                            module0138.$g1625$.bind(var324, var285);
                                                                                            final SubLObject var326;
                                                                                            final SubLObject var325 = var326 = Functions.funcall(var324, var309);
                                                                                            if (module0764.NIL != module0077.f5302(var326)) {
                                                                                                final SubLObject var327 = module0077.f5333(var326);
                                                                                                SubLObject var328;
                                                                                                SubLObject var329;
                                                                                                SubLObject var330;
                                                                                                for (var328 = module0032.f1741(var327), var329 = (SubLObject)module0764.NIL, var329 = module0032.f1742(var328, var327); module0764.NIL == module0032.f1744(var328, var329); var329 = module0032.f1743(var329)) {
                                                                                                    var330 = module0032.f1745(var328, var329);
                                                                                                    if (module0764.NIL != module0032.f1746(var329, var330) && module0764.NIL == module0249.f16059(var330, (SubLObject)module0764.UNPROVIDED)) {
                                                                                                        module0249.f16055(var330, (SubLObject)module0764.UNPROVIDED);
                                                                                                        module0056.f4149((SubLObject)ConsesLow.list(var330, module0141.f9195()), var225_362);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (var326.isList()) {
                                                                                                SubLObject var331 = var326;
                                                                                                SubLObject var332 = (SubLObject)module0764.NIL;
                                                                                                var332 = var331.first();
                                                                                                while (module0764.NIL != var331) {
                                                                                                    if (module0764.NIL == module0249.f16059(var332, (SubLObject)module0764.UNPROVIDED)) {
                                                                                                        module0249.f16055(var332, (SubLObject)module0764.UNPROVIDED);
                                                                                                        module0056.f4149((SubLObject)ConsesLow.list(var332, module0141.f9195()), var225_362);
                                                                                                    }
                                                                                                    var331 = var331.rest();
                                                                                                    var332 = var331.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)module0764.$ic109$, var326);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            module0138.$g1625$.rebind(var7_361, var285);
                                                                                        }
                                                                                        var28_382 = var28_382.rest();
                                                                                        var324 = var28_382.first();
                                                                                    }
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0141.$g1674$.rebind(var8_356, var285);
                                                                                module0137.$g1605$.rebind(var7_358, var285);
                                                                            }
                                                                            var307 = var307.rest();
                                                                            var308 = var307.first();
                                                                        }
                                                                    }
                                                                    finally {
                                                                        module0141.$g1674$.rebind(var7_357, var285);
                                                                    }
                                                                }
                                                            }
                                                            finally {
                                                                module0141.$g1674$.rebind(var9_356, var285);
                                                                module0138.$g1619$.rebind(var8_355, var285);
                                                                module0141.$g1677$.rebind(var7_356, var285);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8872((SubLObject)module0764.TWO_INTEGER, (SubLObject)module0764.$ic111$, var287, module0244.f15748(module0137.f8955((SubLObject)module0764.UNPROVIDED)), (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                                                        }
                                                    }
                                                    finally {
                                                        module0137.$g1605$.rebind(var170_372, var285);
                                                        module0141.$g1674$.rebind(var169_371, var285);
                                                        module0141.$g1672$.rebind(var9_355, var285);
                                                        module0141.$g1671$.rebind(var8_354, var285);
                                                        module0141.$g1670$.rebind(var7_355, var285);
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1715$.rebind(var8_353, var285);
                                                    module0141.$g1714$.rebind(var7_354, var285);
                                                }
                                                module0139.f9011(module0139.$g1635$.getDynamicValue(var285));
                                            }
                                            finally {
                                                module0139.$g1635$.rebind(var7_353, var285);
                                            }
                                        }
                                        SubLObject var334;
                                        final SubLObject var333 = var334 = module0200.f12443(module0137.f8955(module0764.$ic108$));
                                        SubLObject var335 = (SubLObject)module0764.NIL;
                                        var335 = var334.first();
                                        while (module0764.NIL != var334) {
                                            final SubLObject var7_362 = module0137.$g1605$.currentBinding(var285);
                                            final SubLObject var8_357 = module0141.$g1674$.currentBinding(var285);
                                            try {
                                                module0137.$g1605$.bind(var335, var285);
                                                module0141.$g1674$.bind((SubLObject)((module0764.NIL != module0141.f9205((SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0764.NIL == module0141.$g1674$.getDynamicValue(var285)) : module0141.$g1674$.getDynamicValue(var285)), var285);
                                                final SubLObject var336 = module0228.f15229(var223_357);
                                                if (module0764.NIL != module0138.f8992(var336)) {
                                                    final SubLObject var337 = module0242.f15664(var336, module0137.f8955((SubLObject)module0764.UNPROVIDED));
                                                    if (module0764.NIL != var337) {
                                                        final SubLObject var338 = module0245.f15834(var337, module0138.f8979(), module0137.f8955((SubLObject)module0764.UNPROVIDED));
                                                        if (module0764.NIL != var338) {
                                                            SubLObject var339;
                                                            for (var339 = module0066.f4838(module0067.f4891(var338)); module0764.NIL == module0066.f4841(var339); var339 = module0066.f4840(var339)) {
                                                                var285.resetMultipleValues();
                                                                final SubLObject var255_385 = module0066.f4839(var339);
                                                                final SubLObject var340 = var285.secondMultipleValue();
                                                                var285.resetMultipleValues();
                                                                if (module0764.NIL != module0147.f9507(var255_385)) {
                                                                    final SubLObject var7_363 = module0138.$g1623$.currentBinding(var285);
                                                                    try {
                                                                        module0138.$g1623$.bind(var255_385, var285);
                                                                        SubLObject var254_387;
                                                                        for (var254_387 = module0066.f4838(module0067.f4891(var340)); module0764.NIL == module0066.f4841(var254_387); var254_387 = module0066.f4840(var254_387)) {
                                                                            var285.resetMultipleValues();
                                                                            final SubLObject var341 = module0066.f4839(var254_387);
                                                                            final SubLObject var342 = var285.secondMultipleValue();
                                                                            var285.resetMultipleValues();
                                                                            if (module0764.NIL != module0141.f9289(var341)) {
                                                                                final SubLObject var7_364 = module0138.$g1624$.currentBinding(var285);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var341, var285);
                                                                                    final SubLObject var343 = var342;
                                                                                    if (module0764.NIL != module0077.f5302(var343)) {
                                                                                        final SubLObject var344 = module0077.f5333(var343);
                                                                                        SubLObject var345;
                                                                                        SubLObject var346;
                                                                                        SubLObject var347;
                                                                                        for (var345 = module0032.f1741(var344), var346 = (SubLObject)module0764.NIL, var346 = module0032.f1742(var345, var344); module0764.NIL == module0032.f1744(var345, var346); var346 = module0032.f1743(var346)) {
                                                                                            var347 = module0032.f1745(var345, var346);
                                                                                            if (module0764.NIL != module0032.f1746(var346, var347) && module0764.NIL == module0249.f16059(var347, (SubLObject)module0764.UNPROVIDED)) {
                                                                                                module0249.f16055(var347, (SubLObject)module0764.UNPROVIDED);
                                                                                                module0056.f4149((SubLObject)ConsesLow.list(var347, module0141.f9195()), var293);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var343.isList()) {
                                                                                        SubLObject var348 = var343;
                                                                                        SubLObject var349 = (SubLObject)module0764.NIL;
                                                                                        var349 = var348.first();
                                                                                        while (module0764.NIL != var348) {
                                                                                            if (module0764.NIL == module0249.f16059(var349, (SubLObject)module0764.UNPROVIDED)) {
                                                                                                module0249.f16055(var349, (SubLObject)module0764.UNPROVIDED);
                                                                                                module0056.f4149((SubLObject)ConsesLow.list(var349, module0141.f9195()), var293);
                                                                                            }
                                                                                            var348 = var348.rest();
                                                                                            var349 = var348.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0764.$ic109$, var343);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var7_364, var285);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var254_387);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var7_363, var285);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var339);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0764.FIVE_INTEGER, (SubLObject)module0764.$ic110$, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                                                    }
                                                }
                                                else if (module0764.NIL != module0155.f9785(var336, (SubLObject)module0764.UNPROVIDED)) {
                                                    SubLObject var28_383;
                                                    final SubLObject var350 = var28_383 = ((module0764.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var285), module0137.f8955((SubLObject)module0764.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var285), module0137.f8955((SubLObject)module0764.UNPROVIDED)));
                                                    SubLObject var351 = (SubLObject)module0764.NIL;
                                                    var351 = var28_383.first();
                                                    while (module0764.NIL != var28_383) {
                                                        final SubLObject var7_365 = module0138.$g1625$.currentBinding(var285);
                                                        try {
                                                            module0138.$g1625$.bind(var351, var285);
                                                            final SubLObject var353;
                                                            final SubLObject var352 = var353 = Functions.funcall(var351, var336);
                                                            if (module0764.NIL != module0077.f5302(var353)) {
                                                                final SubLObject var354 = module0077.f5333(var353);
                                                                SubLObject var355;
                                                                SubLObject var356;
                                                                SubLObject var357;
                                                                for (var355 = module0032.f1741(var354), var356 = (SubLObject)module0764.NIL, var356 = module0032.f1742(var355, var354); module0764.NIL == module0032.f1744(var355, var356); var356 = module0032.f1743(var356)) {
                                                                    var357 = module0032.f1745(var355, var356);
                                                                    if (module0764.NIL != module0032.f1746(var356, var357) && module0764.NIL == module0249.f16059(var357, (SubLObject)module0764.UNPROVIDED)) {
                                                                        module0249.f16055(var357, (SubLObject)module0764.UNPROVIDED);
                                                                        module0056.f4149((SubLObject)ConsesLow.list(var357, module0141.f9195()), var293);
                                                                    }
                                                                }
                                                            }
                                                            else if (var353.isList()) {
                                                                SubLObject var358 = var353;
                                                                SubLObject var359 = (SubLObject)module0764.NIL;
                                                                var359 = var358.first();
                                                                while (module0764.NIL != var358) {
                                                                    if (module0764.NIL == module0249.f16059(var359, (SubLObject)module0764.UNPROVIDED)) {
                                                                        module0249.f16055(var359, (SubLObject)module0764.UNPROVIDED);
                                                                        module0056.f4149((SubLObject)ConsesLow.list(var359, module0141.f9195()), var293);
                                                                    }
                                                                    var358 = var358.rest();
                                                                    var359 = var358.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0764.$ic109$, var353);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var7_365, var285);
                                                        }
                                                        var28_383 = var28_383.rest();
                                                        var351 = var28_383.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var8_357, var285);
                                                module0137.$g1605$.rebind(var7_362, var285);
                                            }
                                            var334 = var334.rest();
                                            var335 = var334.first();
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var7_352, var285);
                                    }
                                }
                            }
                            finally {
                                module0141.$g1674$.rebind(var9_354, var285);
                                module0138.$g1619$.rebind(var8_352, var285);
                                module0141.$g1677$.rebind(var7_351, var285);
                            }
                        }
                        else {
                            module0136.f8872((SubLObject)module0764.TWO_INTEGER, (SubLObject)module0764.$ic111$, var5, module0244.f15748(module0137.f8955((SubLObject)module0764.UNPROVIDED)), (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                        }
                    }
                    finally {
                        module0137.$g1605$.rebind(var298, var285);
                        module0141.$g1674$.rebind(var297, var285);
                        module0141.$g1672$.rebind(var9_353, var285);
                        module0141.$g1671$.rebind(var8_351, var285);
                        module0141.$g1670$.rebind(var7_350, var285);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_350, var285);
                    module0141.$g1714$.rebind(var7_349, var285);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var285));
            }
            finally {
                module0139.$g1635$.rebind(var7_348, var285);
            }
        }
        finally {
            module0147.$g2096$.rebind(var291, var285);
            module0147.$g2094$.rebind(var290, var285);
            module0147.$g2095$.rebind(var289, var285);
        }
        return Sort.sort(var286, (SubLObject)module0764.$ic140$, Symbols.symbol_function((SubLObject)module0764.$ic141$));
    }
    
    public static SubLObject f48475(final SubLObject var398, final SubLObject var399, SubLObject var23) {
        if (var23 == module0764.UNPROVIDED) {
            var23 = module0579.$g4260$.getDynamicValue();
        }
        final SubLThread var400 = SubLProcess.currentSubLThread();
        SubLObject var401 = (SubLObject)module0764.NIL;
        final SubLObject var402 = module0147.f9540(var23);
        final SubLObject var403 = module0147.$g2095$.currentBinding(var400);
        final SubLObject var404 = module0147.$g2094$.currentBinding(var400);
        final SubLObject var405 = module0147.$g2096$.currentBinding(var400);
        try {
            module0147.$g2095$.bind(module0147.f9545(var402), var400);
            module0147.$g2094$.bind(module0147.f9546(var402), var400);
            module0147.$g2096$.bind(module0147.f9549(var402), var400);
            SubLObject var406 = module0728.f44455(var399);
            SubLObject var407 = (SubLObject)module0764.NIL;
            var407 = var406.first();
            while (module0764.NIL != var406) {
                SubLObject var409;
                final SubLObject var408 = var409 = module0178.f11330(var407).rest();
                SubLObject var410 = (SubLObject)module0764.NIL;
                SubLObject var411 = (SubLObject)module0764.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var409, var408, (SubLObject)module0764.$ic142$);
                var410 = var409.first();
                var409 = var409.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var409, var408, (SubLObject)module0764.$ic142$);
                var411 = var409.first();
                var409 = var409.rest();
                if (module0764.NIL == var409) {
                    if (module0764.NIL != module0751.f46658(var398, var410, (SubLObject)module0764.UNPROVIDED)) {
                        var401 = (SubLObject)ConsesLow.cons(var411, var401);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var408, (SubLObject)module0764.$ic142$);
                }
                var406 = var406.rest();
                var407 = var406.first();
            }
        }
        finally {
            module0147.$g2096$.rebind(var405, var400);
            module0147.$g2094$.rebind(var404, var400);
            module0147.$g2095$.rebind(var403, var400);
        }
        if (module0764.NIL == var401) {
            var401 = (SubLObject)ConsesLow.cons(module0038.$g916$.getGlobalValue(), var401);
        }
        return var401;
    }
    
    public static SubLObject f48476(final SubLObject var5, SubLObject var23) {
        if (var23 == module0764.UNPROVIDED) {
            var23 = module0579.$g4260$.getDynamicValue();
        }
        final SubLThread var24 = SubLProcess.currentSubLThread();
        SubLObject var25 = (SubLObject)module0764.NIL;
        final SubLObject var26 = module0147.f9540(var23);
        final SubLObject var27 = module0147.$g2095$.currentBinding(var24);
        final SubLObject var28 = module0147.$g2094$.currentBinding(var24);
        final SubLObject var29 = module0147.$g2096$.currentBinding(var24);
        try {
            module0147.$g2095$.bind(module0147.f9545(var26), var24);
            module0147.$g2094$.bind(module0147.f9546(var26), var24);
            module0147.$g2096$.bind(module0147.f9549(var26), var24);
            final SubLObject var30 = (SubLObject)module0764.$ic98$;
            final SubLObject var31 = module0056.f4145(var30);
            SubLObject var32 = (SubLObject)module0764.NIL;
            final SubLObject var7_406 = module0139.$g1635$.currentBinding(var24);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var24);
                final SubLObject var33 = (SubLObject)module0764.NIL;
                final SubLObject var7_407 = module0141.$g1714$.currentBinding(var24);
                final SubLObject var8_408 = module0141.$g1715$.currentBinding(var24);
                try {
                    module0141.$g1714$.bind((module0764.NIL != var33) ? var33 : module0141.f9283(), var24);
                    module0141.$g1715$.bind((SubLObject)((module0764.NIL != var33) ? module0764.$ic100$ : module0141.$g1715$.getDynamicValue(var24)), var24);
                    if (module0764.NIL != var33 && module0764.NIL != module0136.f8864() && module0764.NIL == module0141.f9279(var33)) {
                        final SubLObject var34 = module0136.$g1591$.getDynamicValue(var24);
                        if (var34.eql((SubLObject)module0764.$ic101$)) {
                            module0136.f8870((SubLObject)module0764.ONE_INTEGER, (SubLObject)module0764.$ic102$, var33, (SubLObject)module0764.$ic103$, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                        }
                        else if (var34.eql((SubLObject)module0764.$ic104$)) {
                            module0136.f8871((SubLObject)module0764.ONE_INTEGER, (SubLObject)module0764.$ic105$, (SubLObject)module0764.$ic102$, var33, (SubLObject)module0764.$ic103$, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                        }
                        else if (var34.eql((SubLObject)module0764.$ic106$)) {
                            Errors.warn((SubLObject)module0764.$ic102$, var33, (SubLObject)module0764.$ic103$);
                        }
                        else {
                            Errors.warn((SubLObject)module0764.$ic107$, module0136.$g1591$.getDynamicValue(var24));
                            Errors.cerror((SubLObject)module0764.$ic105$, (SubLObject)module0764.$ic102$, var33, (SubLObject)module0764.$ic103$);
                        }
                    }
                    final SubLObject var7_408 = module0141.$g1670$.currentBinding(var24);
                    final SubLObject var8_409 = module0141.$g1671$.currentBinding(var24);
                    final SubLObject var9_411 = module0141.$g1672$.currentBinding(var24);
                    final SubLObject var35 = module0141.$g1674$.currentBinding(var24);
                    final SubLObject var36 = module0137.$g1605$.currentBinding(var24);
                    try {
                        module0141.$g1670$.bind(module0137.f8955(module0764.$ic108$), var24);
                        module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0764.$ic108$)), var24);
                        module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0764.$ic108$)), var24);
                        module0141.$g1674$.bind((SubLObject)module0764.NIL, var24);
                        module0137.$g1605$.bind(module0137.f8955(module0764.$ic108$), var24);
                        if (module0764.NIL != module0136.f8865() || module0764.NIL != module0244.f15795(var5, module0137.f8955((SubLObject)module0764.UNPROVIDED))) {
                            final SubLObject var7_409 = module0141.$g1677$.currentBinding(var24);
                            final SubLObject var8_410 = module0138.$g1619$.currentBinding(var24);
                            final SubLObject var9_412 = module0141.$g1674$.currentBinding(var24);
                            try {
                                module0141.$g1677$.bind(module0141.f9208(), var24);
                                module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), module0137.f8955(module0764.$ic108$)), var24);
                                module0141.$g1674$.bind((SubLObject)module0764.NIL, var24);
                                module0249.f16055(var5, (SubLObject)module0764.UNPROVIDED);
                                for (var32 = (SubLObject)ConsesLow.list(var5, module0141.f9195()); module0764.NIL != var32; var32 = module0056.f4150(var31)) {
                                    final SubLObject var223_415 = var32.first();
                                    final SubLObject var37 = conses_high.second(var32);
                                    final SubLObject var38 = var223_415;
                                    final SubLObject var7_410 = module0141.$g1674$.currentBinding(var24);
                                    try {
                                        module0141.$g1674$.bind(var37, var24);
                                        if (module0764.NIL != module0250.f16115(module0141.f9190(), var223_415)) {
                                            var25 = ConsesLow.nconc(var25, module0220.f14598(var38, module0764.$ic143$, (SubLObject)module0764.ONE_INTEGER, (SubLObject)module0764.$ic144$, (SubLObject)module0764.UNPROVIDED));
                                        }
                                        SubLObject var40;
                                        final SubLObject var39 = var40 = module0200.f12443(module0137.f8955(module0764.$ic108$));
                                        SubLObject var41 = (SubLObject)module0764.NIL;
                                        var41 = var40.first();
                                        while (module0764.NIL != var40) {
                                            final SubLObject var7_411 = module0137.$g1605$.currentBinding(var24);
                                            final SubLObject var8_411 = module0141.$g1674$.currentBinding(var24);
                                            try {
                                                module0137.$g1605$.bind(var41, var24);
                                                module0141.$g1674$.bind((SubLObject)((module0764.NIL != module0141.f9205((SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0764.NIL == module0141.$g1674$.getDynamicValue(var24)) : module0141.$g1674$.getDynamicValue(var24)), var24);
                                                final SubLObject var42 = module0228.f15229(var223_415);
                                                if (module0764.NIL != module0138.f8992(var42)) {
                                                    final SubLObject var43 = module0242.f15664(var42, module0137.f8955((SubLObject)module0764.UNPROVIDED));
                                                    if (module0764.NIL != var43) {
                                                        final SubLObject var44 = module0245.f15834(var43, module0138.f8979(), module0137.f8955((SubLObject)module0764.UNPROVIDED));
                                                        if (module0764.NIL != var44) {
                                                            SubLObject var45;
                                                            for (var45 = module0066.f4838(module0067.f4891(var44)); module0764.NIL == module0066.f4841(var45); var45 = module0066.f4840(var45)) {
                                                                var24.resetMultipleValues();
                                                                final SubLObject var255_420 = module0066.f4839(var45);
                                                                final SubLObject var46 = var24.secondMultipleValue();
                                                                var24.resetMultipleValues();
                                                                if (module0764.NIL != module0147.f9507(var255_420)) {
                                                                    final SubLObject var7_412 = module0138.$g1623$.currentBinding(var24);
                                                                    try {
                                                                        module0138.$g1623$.bind(var255_420, var24);
                                                                        SubLObject var254_422;
                                                                        for (var254_422 = module0066.f4838(module0067.f4891(var46)); module0764.NIL == module0066.f4841(var254_422); var254_422 = module0066.f4840(var254_422)) {
                                                                            var24.resetMultipleValues();
                                                                            final SubLObject var47 = module0066.f4839(var254_422);
                                                                            final SubLObject var48 = var24.secondMultipleValue();
                                                                            var24.resetMultipleValues();
                                                                            if (module0764.NIL != module0141.f9289(var47)) {
                                                                                final SubLObject var7_413 = module0138.$g1624$.currentBinding(var24);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var47, var24);
                                                                                    final SubLObject var49 = var48;
                                                                                    if (module0764.NIL != module0077.f5302(var49)) {
                                                                                        final SubLObject var50 = module0077.f5333(var49);
                                                                                        SubLObject var51;
                                                                                        SubLObject var52;
                                                                                        SubLObject var53;
                                                                                        for (var51 = module0032.f1741(var50), var52 = (SubLObject)module0764.NIL, var52 = module0032.f1742(var51, var50); module0764.NIL == module0032.f1744(var51, var52); var52 = module0032.f1743(var52)) {
                                                                                            var53 = module0032.f1745(var51, var52);
                                                                                            if (module0764.NIL != module0032.f1746(var52, var53) && module0764.NIL == module0249.f16059(var53, (SubLObject)module0764.UNPROVIDED)) {
                                                                                                module0249.f16055(var53, (SubLObject)module0764.UNPROVIDED);
                                                                                                module0056.f4149((SubLObject)ConsesLow.list(var53, module0141.f9195()), var31);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var49.isList()) {
                                                                                        SubLObject var54 = var49;
                                                                                        SubLObject var55 = (SubLObject)module0764.NIL;
                                                                                        var55 = var54.first();
                                                                                        while (module0764.NIL != var54) {
                                                                                            if (module0764.NIL == module0249.f16059(var55, (SubLObject)module0764.UNPROVIDED)) {
                                                                                                module0249.f16055(var55, (SubLObject)module0764.UNPROVIDED);
                                                                                                module0056.f4149((SubLObject)ConsesLow.list(var55, module0141.f9195()), var31);
                                                                                            }
                                                                                            var54 = var54.rest();
                                                                                            var55 = var54.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0764.$ic109$, var49);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var7_413, var24);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var254_422);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var7_412, var24);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var45);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0764.FIVE_INTEGER, (SubLObject)module0764.$ic110$, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                                                    }
                                                }
                                                else if (module0764.NIL != module0155.f9785(var42, (SubLObject)module0764.UNPROVIDED)) {
                                                    SubLObject var28_424;
                                                    final SubLObject var56 = var28_424 = ((module0764.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var24), module0137.f8955((SubLObject)module0764.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var24), module0137.f8955((SubLObject)module0764.UNPROVIDED)));
                                                    SubLObject var57 = (SubLObject)module0764.NIL;
                                                    var57 = var28_424.first();
                                                    while (module0764.NIL != var28_424) {
                                                        final SubLObject var7_414 = module0138.$g1625$.currentBinding(var24);
                                                        try {
                                                            module0138.$g1625$.bind(var57, var24);
                                                            final SubLObject var59;
                                                            final SubLObject var58 = var59 = Functions.funcall(var57, var42);
                                                            if (module0764.NIL != module0077.f5302(var59)) {
                                                                final SubLObject var60 = module0077.f5333(var59);
                                                                SubLObject var61;
                                                                SubLObject var62;
                                                                SubLObject var63;
                                                                for (var61 = module0032.f1741(var60), var62 = (SubLObject)module0764.NIL, var62 = module0032.f1742(var61, var60); module0764.NIL == module0032.f1744(var61, var62); var62 = module0032.f1743(var62)) {
                                                                    var63 = module0032.f1745(var61, var62);
                                                                    if (module0764.NIL != module0032.f1746(var62, var63) && module0764.NIL == module0249.f16059(var63, (SubLObject)module0764.UNPROVIDED)) {
                                                                        module0249.f16055(var63, (SubLObject)module0764.UNPROVIDED);
                                                                        module0056.f4149((SubLObject)ConsesLow.list(var63, module0141.f9195()), var31);
                                                                    }
                                                                }
                                                            }
                                                            else if (var59.isList()) {
                                                                SubLObject var64 = var59;
                                                                SubLObject var65 = (SubLObject)module0764.NIL;
                                                                var65 = var64.first();
                                                                while (module0764.NIL != var64) {
                                                                    if (module0764.NIL == module0249.f16059(var65, (SubLObject)module0764.UNPROVIDED)) {
                                                                        module0249.f16055(var65, (SubLObject)module0764.UNPROVIDED);
                                                                        module0056.f4149((SubLObject)ConsesLow.list(var65, module0141.f9195()), var31);
                                                                    }
                                                                    var64 = var64.rest();
                                                                    var65 = var64.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0764.$ic109$, var59);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var7_414, var24);
                                                        }
                                                        var28_424 = var28_424.rest();
                                                        var57 = var28_424.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var8_411, var24);
                                                module0137.$g1605$.rebind(var7_411, var24);
                                            }
                                            var40 = var40.rest();
                                            var41 = var40.first();
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var7_410, var24);
                                    }
                                }
                            }
                            finally {
                                module0141.$g1674$.rebind(var9_412, var24);
                                module0138.$g1619$.rebind(var8_410, var24);
                                module0141.$g1677$.rebind(var7_409, var24);
                            }
                        }
                        else {
                            module0136.f8872((SubLObject)module0764.TWO_INTEGER, (SubLObject)module0764.$ic111$, var5, module0244.f15748(module0137.f8955((SubLObject)module0764.UNPROVIDED)), (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
                        }
                    }
                    finally {
                        module0137.$g1605$.rebind(var36, var24);
                        module0141.$g1674$.rebind(var35, var24);
                        module0141.$g1672$.rebind(var9_411, var24);
                        module0141.$g1671$.rebind(var8_409, var24);
                        module0141.$g1670$.rebind(var7_408, var24);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var8_408, var24);
                    module0141.$g1714$.rebind(var7_407, var24);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var24));
            }
            finally {
                module0139.$g1635$.rebind(var7_406, var24);
            }
        }
        finally {
            module0147.$g2096$.rebind(var29, var24);
            module0147.$g2094$.rebind(var28, var24);
            module0147.$g2095$.rebind(var27, var24);
        }
        return var25;
    }
    
    public static SubLObject f48477(final SubLObject var426) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var426.isList() && module0764.NIL != module0035.f1995(var426, (SubLObject)module0764.THREE_INTEGER, (SubLObject)module0764.UNPROVIDED));
    }
    
    public static SubLObject f48478(final SubLObject var426) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0764.NIL == var426 || module0764.NIL != f48479(var426));
    }
    
    public static SubLObject f48479(final SubLObject var426) {
        return module0751.f46684(var426, module0764.$ic145$, (SubLObject)module0764.UNPROVIDED);
    }
    
    public static SubLObject f48480(final SubLObject var426) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0764.NIL == var426 || module0764.NIL != f48481(var426));
    }
    
    public static SubLObject f48481(final SubLObject var426) {
        return module0751.f46684(var426, module0764.$ic146$, (SubLObject)module0764.UNPROVIDED);
    }
    
    public static SubLObject f48482(final SubLObject var426) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0764.NIL == var426 || module0764.NIL != f48483(var426));
    }
    
    public static SubLObject f48483(final SubLObject var426) {
        return module0751.f46684(var426, module0764.$ic147$, (SubLObject)module0764.UNPROVIDED);
    }
    
    public static SubLObject f48484() {
        return f48485((SubLObject)module0764.NIL, (SubLObject)module0764.NIL, (SubLObject)module0764.NIL);
    }
    
    public static SubLObject f48485(final SubLObject var427, final SubLObject var428, final SubLObject var429) {
        return (SubLObject)ConsesLow.list(var427, var428, var429);
    }
    
    public static SubLObject f48486(final SubLObject var430) {
        return var430.first();
    }
    
    public static SubLObject f48487(final SubLObject var430) {
        return conses_high.second(var430);
    }
    
    public static SubLObject f48488(final SubLObject var430) {
        return conses_high.third(var430);
    }
    
    public static SubLObject f48489(final SubLObject var430, final SubLObject var427) {
        return ConsesLow.set_nth((SubLObject)module0764.ZERO_INTEGER, var430, var427);
    }
    
    public static SubLObject f48490(final SubLObject var430, final SubLObject var428) {
        return ConsesLow.set_nth((SubLObject)module0764.ONE_INTEGER, var430, var428);
    }
    
    public static SubLObject f48491(final SubLObject var430, final SubLObject var429) {
        return ConsesLow.set_nth((SubLObject)module0764.TWO_INTEGER, var430, var429);
    }
    
    public static SubLObject f48492(final SubLObject var431) {
        final SubLObject var432 = module0767.f48987(var431);
        final SubLObject var433 = module0767.f48971(var431);
        final SubLObject var434 = (module0764.NIL != module0751.f46661((SubLObject)module0764.UNPROVIDED) && (!var433.eql(module0764.$ic148$) || !var432.eql(module0764.$ic149$))) ? module0764.$ic150$ : module0767.f48968(var431);
        if (module0764.NIL == var432 || module0764.NIL == var433 || module0764.NIL == var434) {
            if (module0764.NIL != module0578.f35470((SubLObject)module0764.TWO_INTEGER) && module0764.NIL == module0578.f35477()) {
                Errors.warn((SubLObject)module0764.$ic151$, var431);
            }
            return (SubLObject)module0764.$ic152$;
        }
        return f48485(var432, var433, var434);
    }
    
    public static SubLObject f48493(final SubLObject var432, final SubLObject var433) {
        if (var432.eql(var433)) {
            return (SubLObject)module0764.T;
        }
        if (var432.eql(module0764.$ic150$)) {
            return (SubLObject)module0764.T;
        }
        if (var433.eql(module0764.$ic150$)) {
            return (SubLObject)module0764.T;
        }
        return (SubLObject)module0764.NIL;
    }
    
    public static SubLObject f48494(final SubLObject var83) {
        final SubLThread var84 = SubLProcess.currentSubLThread();
        final SubLObject var85 = f48495(module0756.f47635(var83));
        final SubLObject var86 = module0756.f47488(var83, (SubLObject)module0764.UNPROVIDED);
        if (module0764.NIL != module0579.$g4249$.getDynamicValue(var84) && module0764.NIL != module0751.f47099(var86, (SubLObject)module0764.$ic156$, (SubLObject)module0764.UNPROVIDED)) {
            var84.resetMultipleValues();
            final SubLObject var87 = f48496(module0756.f47487(var83, (SubLObject)module0764.UNPROVIDED), var85);
            final SubLObject var88 = var84.secondMultipleValue();
            var84.resetMultipleValues();
            if (var87.isString()) {
                module0756.f47783(var83, var88, (SubLObject)module0764.UNPROVIDED);
                module0756.f47503(var83, module0285.f18875(module0202.f12643(module0764.$ic157$, var85), (SubLObject)module0764.UNPROVIDED), (SubLObject)module0764.UNPROVIDED);
                module0756.f47723(var83, var87);
            }
            module0756.f47715(var83);
        }
        return module0756.f47467(var83);
    }
    
    public static SubLObject f48497(final SubLObject var202) {
        return f48496(var202, module0764.$ic158$);
    }
    
    public static SubLObject f48498(final SubLObject var83) {
        return Equality.eq(module0756.f47635(var83), (SubLObject)module0764.$ic159$);
    }
    
    public static SubLObject f48499(final SubLObject var431) {
        return module0755.f47398(var431, (SubLObject)module0764.UNPROVIDED);
    }
    
    public static SubLObject f48496(final SubLObject var431, final SubLObject var437) {
        final SubLThread var438 = SubLProcess.currentSubLThread();
        final SubLObject var439 = f48492(var431);
        SubLObject var440 = (SubLObject)module0764.NIL;
        SubLObject var441 = (SubLObject)module0764.NIL;
        if (module0764.NIL != f48477(var439)) {
            var438.resetMultipleValues();
            final SubLObject var438_439 = f48500(var439, var437);
            final SubLObject var440_441 = var438.secondMultipleValue();
            var438.resetMultipleValues();
            var440 = var438_439;
            var441 = var440_441;
        }
        if (module0764.NIL != var440 && module0764.NIL != module0578.f35470((SubLObject)module0764.ONE_INTEGER)) {
            PrintLow.format((SubLObject)module0764.T, (SubLObject)module0764.$ic160$, var440, var431);
        }
        return Values.values(var440, var441);
    }
    
    public static SubLObject f48500(final SubLObject var430, final SubLObject var437) {
        final SubLObject var438 = f48501(var430, var437);
        final SubLObject var439 = f48502(var438);
        final SubLObject var440 = (SubLObject)((module0764.NIL != var439) ? f48440(var439, var437, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED) : module0764.NIL);
        final SubLObject var441 = (SubLObject)((module0764.NIL != var440) ? f48503(var430) : module0764.NIL);
        if (module0764.NIL == var440) {
            final SubLObject var442 = f48504(var437, (SubLObject)module0764.UNPROVIDED);
            SubLObject var443 = (SubLObject)module0764.NIL;
            var443 = var442.first();
            if (module0764.NIL != var442) {
                return f48500(var430, var443);
            }
        }
        if (module0764.NIL == var440 && module0764.NIL != module0578.f35470((SubLObject)module0764.ONE_INTEGER) && module0764.NIL == module0578.f35477()) {
            Errors.warn((SubLObject)module0764.$ic161$, var438);
        }
        return Values.values(var440, var441);
    }
    
    public static SubLObject f48504(final SubLObject var437, SubLObject var23) {
        if (var23 == module0764.UNPROVIDED) {
            var23 = (SubLObject)module0764.NIL;
        }
        final SubLObject var438 = module0256.f16579((SubLObject)module0764.$ic162$, var437, var23, (SubLObject)module0764.UNPROVIDED);
        return Sequences.remove(var437, var438, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
    }
    
    public static SubLObject f48505(final SubLObject var445, SubLObject var23) {
        if (var23 == module0764.UNPROVIDED) {
            var23 = (SubLObject)module0764.NIL;
        }
        return module0256.f16596(var445, module0764.$ic163$, var23, (SubLObject)module0764.UNPROVIDED);
    }
    
    public static SubLObject f48503(final SubLObject var430) {
        final SubLObject var432;
        final SubLObject var431 = var432 = f48487(var430);
        if (var432.eql(module0764.$ic148$)) {
            return module0764.$ic164$;
        }
        return module0764.$ic165$;
    }
    
    public static SubLObject f48502(final SubLObject var442) {
        final SubLThread var443 = SubLProcess.currentSubLThread();
        SubLObject var444 = (SubLObject)module0764.NIL;
        final SubLObject var445 = (SubLObject)module0764.$ic166$;
        SubLObject var446 = (SubLObject)module0764.NIL;
        if (module0764.NIL != module0212.f13762(var442)) {
            final SubLObject var447 = module0147.f9540(module0579.$g4260$.getDynamicValue(var443));
            final SubLObject var448 = module0147.$g2095$.currentBinding(var443);
            final SubLObject var449 = module0147.$g2094$.currentBinding(var443);
            final SubLObject var450 = module0147.$g2096$.currentBinding(var443);
            try {
                module0147.$g2095$.bind(module0147.f9545(var447), var443);
                module0147.$g2094$.bind(module0147.f9546(var447), var443);
                module0147.$g2096$.bind(module0147.f9549(var447), var443);
                var444 = module0035.remove_if_not((SubLObject)module0764.$ic167$, conses_high.set_difference(module0220.f14562(var442, module0764.$ic64$, (SubLObject)module0764.FOUR_INTEGER, (SubLObject)module0764.ONE_INTEGER, (SubLObject)module0764.UNPROVIDED), var445, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED), (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED, (SubLObject)module0764.UNPROVIDED);
            }
            finally {
                module0147.$g2096$.rebind(var450, var443);
                module0147.$g2094$.rebind(var449, var443);
                module0147.$g2095$.rebind(var448, var443);
            }
        }
        final SubLObject var451 = Sequences.length(var444);
        if (var451.eql((SubLObject)module0764.ZERO_INTEGER)) {
            if (module0764.NIL != module0578.f35470((SubLObject)module0764.TWO_INTEGER) && module0764.NIL == module0578.f35477()) {
                Errors.warn((SubLObject)module0764.$ic168$, var442);
            }
        }
        else if (var451.eql((SubLObject)module0764.ONE_INTEGER)) {
            var446 = module0035.f2113(var444);
        }
        else {
            if (module0764.NIL != module0578.f35470((SubLObject)module0764.TWO_INTEGER) && module0764.NIL == module0578.f35477()) {
                Errors.warn((SubLObject)module0764.$ic169$, var444, var442, var444.first());
            }
            var446 = var444.first();
        }
        return var446;
    }
    
    public static SubLObject f48506(final SubLObject var430) {
        if (module0764.NIL == module0751.f46661((SubLObject)module0764.UNPROVIDED)) {
            return (SubLObject)module0764.NIL;
        }
        SubLObject var431 = (SubLObject)module0764.NIL;
        SubLObject var432 = (SubLObject)module0764.NIL;
        SubLObject var433 = (SubLObject)module0764.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var430, var430, (SubLObject)module0764.$ic170$);
        var431 = var430.first();
        SubLObject var434 = var430.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var434, var430, (SubLObject)module0764.$ic170$);
        var432 = var434.first();
        var434 = var434.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var434, var430, (SubLObject)module0764.$ic170$);
        var433 = var434.first();
        var434 = var434.rest();
        if (module0764.NIL == var434) {
            return (SubLObject)SubLObjectFactory.makeBoolean((var433.eql(module0764.$ic171$) && var432.eql(module0764.$ic148$) && var431.eql(module0764.$ic149$)) || var431.eql(module0764.$ic172$));
        }
        cdestructuring_bind.cdestructuring_bind_error(var430, (SubLObject)module0764.$ic170$);
        return (SubLObject)module0764.NIL;
    }
    
    public static SubLObject f48501(final SubLObject var430, final SubLObject var434) {
        if (module0764.NIL == f48477(var430) || module0764.NIL == var434) {
            return (SubLObject)module0764.NIL;
        }
        SubLObject var435 = (SubLObject)module0764.NIL;
        SubLObject var436 = (SubLObject)module0764.NIL;
        SubLObject var437 = (SubLObject)module0764.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var430, var430, (SubLObject)module0764.$ic170$);
        var435 = var430.first();
        SubLObject var438 = var430.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var438, var430, (SubLObject)module0764.$ic170$);
        var436 = var438.first();
        var438 = var438.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var438, var430, (SubLObject)module0764.$ic170$);
        var437 = var438.first();
        var438 = var438.rest();
        if (module0764.NIL == var438) {
            return module0228.f15229((SubLObject)ConsesLow.list(module0764.$ic173$, var435, var436, var437, var434));
        }
        cdestructuring_bind.cdestructuring_bind_error(var430, (SubLObject)module0764.$ic170$);
        return (SubLObject)module0764.NIL;
    }
    
    public static SubLObject f48495(final SubLObject var452) {
        if (var452.eql((SubLObject)module0764.$ic159$)) {
            return module0764.$ic174$;
        }
        if (var452.eql((SubLObject)module0764.$ic175$)) {
            return module0764.$ic176$;
        }
        return module0764.$ic177$;
    }
    
    public static SubLObject f48507(final SubLObject var83, SubLObject var453) {
        if (var453 == module0764.UNPROVIDED) {
            var453 = module0077.f5313(Symbols.symbol_function((SubLObject)module0764.EQUAL), (SubLObject)module0764.UNPROVIDED);
        }
        final SubLThread var454 = SubLProcess.currentSubLThread();
        SubLObject var455 = module0756.f47488(var83, (SubLObject)module0764.UNPROVIDED);
        final SubLObject var456 = module0756.f47606(var83, (SubLObject)module0764.UNPROVIDED);
        final SubLObject var457 = module0756.f47481(var83, (SubLObject)module0764.UNPROVIDED);
        final SubLObject var458 = module0758.f47990(var83);
        final SubLObject var459 = module0758.f47942(var83, (SubLObject)module0764.NIL);
        final SubLObject var460 = (SubLObject)((module0764.NIL != module0579.f35488()) ? module0756.f47484(var83, (SubLObject)module0764.NIL, (SubLObject)module0764.NIL) : module0764.NIL);
        final SubLObject var461 = (SubLObject)((module0764.NIL != var459) ? var459 : ((module0764.NIL != module0751.f47109(var457)) ? var457 : module0764.$ic0$));
        if (module0764.NIL != module0035.f2014(var455) && module0764.NIL != module0751.f46640(var457, module0764.$ic33$, (SubLObject)module0764.UNPROVIDED)) {
            var455 = f48508(var456, var455);
        }
        if (module0764.NIL != module0578.f35470((SubLObject)module0764.ONE_INTEGER)) {
            PrintLow.format((SubLObject)module0764.T, (SubLObject)module0764.$ic178$, var456, var455);
        }
        var454.resetMultipleValues();
        SubLObject var462 = f48440(var456, var461, var455, (SubLObject)module0764.UNPROVIDED);
        SubLObject var463 = var454.secondMultipleValue();
        final SubLObject var464 = var454.thirdMultipleValue();
        var454.resetMultipleValues();
        if (module0764.NIL == module0751.f47030(var463)) {
            var463 = module0751.$g5993$.getGlobalValue();
        }
        if (module0764.NIL != module0751.f47131(var463, var455)) {
            module0077.f5326((SubLObject)ConsesLow.list(var458, var462, var463), var453);
            f48509(var83, var462, var463);
        }
        else {
            var462 = (SubLObject)module0764.NIL;
            if (module0764.NIL != module0578.f35470((SubLObject)module0764.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0764.T, (SubLObject)module0764.$ic179$, var455, var456);
            }
        }
        if (module0764.NIL != module0579.f35488()) {
            f48510(var83, var464, var455, var460, var458, var453);
        }
        return module0756.f47467(var83);
    }
    
    public static SubLObject f48510(final SubLObject var83, final SubLObject var126, final SubLObject var216, final SubLObject var457, final SubLObject var455, final SubLObject var453) {
        final SubLThread var458 = SubLProcess.currentSubLThread();
        final SubLObject var459 = module0055.f4017();
        SubLObject var460 = (SubLObject)module0764.ZERO_INTEGER;
        module0055.f4021(var83, var459);
        while (module0764.NIL == module0055.f4019(var459)) {
            final SubLObject var461 = module0055.f4023(var459);
            SubLObject var462 = module0756.f47673(var461);
            SubLObject var463 = (SubLObject)module0764.NIL;
            var463 = var462.first();
            while (module0764.NIL != var462) {
                f48507(var463, var453);
                if (module0764.NIL == module0756.f47479(var463)) {
                    module0756.f47676(var461, var463);
                }
                var460 = Numbers.add(var460, (SubLObject)module0764.ONE_INTEGER);
                if (var460.numGE(module0756.$g6076$.getDynamicValue(var458))) {
                    final SubLObject var464 = Sequences.cconcatenate((SubLObject)module0764.$ic8$, new SubLObject[] { module0006.f205((SubLObject)module0764.ONE_INTEGER), module0764.$ic9$, module0006.f203((SubLObject)module0764.$ic180$) });
                    module0578.f35476(var464, (SubLObject)ConsesLow.list(var460, var83));
                }
                module0055.f4021(var463, var459);
                var462 = var462.rest();
                var463 = var462.first();
            }
        }
        SubLObject var465 = var126;
        SubLObject var466 = (SubLObject)module0764.NIL;
        var466 = var465.first();
        while (module0764.NIL != var465) {
            SubLObject var468;
            final SubLObject var467 = var468 = var466;
            SubLObject var469 = (SubLObject)module0764.NIL;
            SubLObject var470 = (SubLObject)module0764.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var468, var467, (SubLObject)module0764.$ic181$);
            var469 = var468.first();
            var468 = var468.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var468, var467, (SubLObject)module0764.$ic181$);
            var470 = var468.first();
            var468 = var468.rest();
            final SubLObject var471 = (SubLObject)(var468.isCons() ? var468.first() : module0764.ZERO_INTEGER);
            cdestructuring_bind.destructuring_bind_must_listp(var468, var467, (SubLObject)module0764.$ic181$);
            var468 = var468.rest();
            final SubLObject var472 = (SubLObject)(var468.isCons() ? var468.first() : module0764.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(var468, var467, (SubLObject)module0764.$ic181$);
            var468 = var468.rest();
            if (module0764.NIL == var468) {
                final SubLObject var473 = (SubLObject)ConsesLow.cons(var455, var466);
                if (module0764.NIL == module0077.f5320(var473, var453)) {
                    if (module0764.NIL != module0751.f47131(var470, var216)) {
                        module0077.f5326(var473, var453);
                        final SubLObject var474 = module0756.f47484(var457, (SubLObject)module0764.NIL, (SubLObject)module0764.NIL);
                        module0756.f47500(var474, var471, (SubLObject)module0764.UNPROVIDED);
                        module0756.f47509(var474, var472);
                        f48509(var474, var469, var470);
                        if (module0764.NIL != module0756.f47479(var474)) {
                            if (module0764.NIL != module0756.f47497(var455, (SubLObject)module0764.UNPROVIDED)) {
                                module0756.f47798(var474, var455);
                            }
                            module0756.f47675(var83, var474);
                        }
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var467, (SubLObject)module0764.$ic181$);
            }
            var465 = var465.rest();
            var466 = var465.first();
        }
        return var83;
    }
    
    public static SubLObject f48509(final SubLObject var83, final SubLObject var4, final SubLObject var5) {
        final SubLThread var84 = SubLProcess.currentSubLThread();
        if (module0764.NIL == f48511(var83, var4)) {
            module0756.f47723(var83, var4);
            if (module0764.NIL != module0578.f35470((SubLObject)module0764.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0764.T, (SubLObject)module0764.$ic182$, var4, var5);
            }
            module0756.f47783(var83, var5, (SubLObject)module0764.UNPROVIDED);
            final SubLObject var85 = module0756.f47487(var83, (SubLObject)module0764.UNPROVIDED);
            final SubLObject var86 = module0756.f47606(var83, (SubLObject)module0764.UNPROVIDED);
            if (module0764.NIL != module0762.f48200(var86)) {
                final SubLObject var87 = module0147.f9540(module0579.$g4260$.getDynamicValue(var84));
                final SubLObject var88 = module0147.$g2095$.currentBinding(var84);
                final SubLObject var89 = module0147.$g2094$.currentBinding(var84);
                final SubLObject var90 = module0147.$g2096$.currentBinding(var84);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var87), var84);
                    module0147.$g2094$.bind(module0147.f9546(var87), var84);
                    module0147.$g2096$.bind(module0147.f9549(var87), var84);
                    module0756.f47569(var83, module0735.f45229(module0202.f12768(var5, var86, var4)));
                }
                finally {
                    module0147.$g2096$.rebind(var90, var84);
                    module0147.$g2094$.rebind(var89, var84);
                    module0147.$g2095$.rebind(var88, var84);
                }
            }
            if (module0764.NIL != module0201.f12546(var85) && module0764.NIL == module0754.f47311(var85)) {
                final SubLObject var91 = var85;
                final SubLObject var92 = module0754.f47312(var91);
                final SubLObject var93 = module0754.f47333(var91);
                module0754.f47313(var85, var92, var93);
                module0756.f47464(var83, var93);
                module0756.f47465(var83, var92);
                module0756.f47468(var83, var92);
            }
            module0756.f47715(var83);
        }
        return var83;
    }
    
    public static SubLObject f48511(final SubLObject var83, final SubLObject var4) {
        SubLObject var84 = (SubLObject)module0764.NIL;
        if (module0764.NIL != module0579.f35492()) {
            final SubLObject var85 = module0756.f47487(var83, (SubLObject)module0764.UNPROVIDED);
            var84 = (SubLObject)SubLObjectFactory.makeBoolean(module0764.NIL != module0756.f47694(var85) && module0764.NIL != module0579.f35493(var85, var4));
        }
        return var84;
    }
    
    public static SubLObject f48508(final SubLObject var93, final SubLObject var2) {
        final SubLObject var94 = module0731.f44867(var93);
        if (module0764.NIL != module0751.f47099(var94, var2, (SubLObject)module0764.UNPROVIDED)) {
            return (SubLObject)module0764.$ic183$;
        }
        return (SubLObject)module0764.NIL;
    }
    
    public static SubLObject f48512() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48409", "S#52894", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48410", "S#52895", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48411", "S#52885", 1, 1, false);
        new $f48411$UnaryFunction();
        new $f48411$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48414", "S#52896", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48412", "S#52897", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48415", "S#52898", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48416", "S#52886", 1, 2, false);
        new $f48416$UnaryFunction();
        new $f48416$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48417", "S#52899", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48418", "S#52900", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48423", "S#52901", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48422", "S#52902", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48413", "S#52903", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48425", "S#52904", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48420", "S#52905", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48426", "S#52906", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48427", "S#52907", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48419", "S#52908", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48428", "S#52909", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48429", "S#52910", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48430", "S#52911", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48424", "S#52912", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48431", "S#52913", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48421", "S#52914", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48434", "S#52915", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48433", "S#52916", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48432", "S#52917", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48436", "S#52918", 6, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48438", "S#52919", 6, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48439", "S#52920", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48437", "S#52921", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48441", "S#52922", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48442", "S#52923", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48444", "S#52924", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48445", "S#52925", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48443", "S#52926", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48446", "S#51001", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48448", "S#52927", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48449", "S#52928", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48450", "S#52929", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48447", "S#52930", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48451", "S#52931", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48452", "S#52932", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48453", "S#52933", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48454", "S#50999", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48455", "S#52934", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48456", "S#35480", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48458", "S#49447", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48457", "S#38275", 1, 7, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48459", "S#52935", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48460", "S#52936", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48461", "S#39904", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48462", "S#52357", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48463", "S#52937", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48435", "S#52938", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48464", "S#52939", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48440", "S#50984", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48468", "S#51681", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48466", "S#52940", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48467", "S#52941", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48469", "S#52942", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48465", "S#52943", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48471", "S#52944", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48470", "S#52945", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48473", "S#52946", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48472", "S#52947", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48474", "S#52948", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48475", "S#52949", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48476", "S#52950", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48477", "S#51824", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48478", "S#51835", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48479", "S#51834", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48480", "S#51839", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48481", "S#51838", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48482", "S#51843", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48483", "S#51842", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48484", "S#51825", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48485", "S#51830", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48486", "S#51833", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48487", "S#51837", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48488", "S#51841", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48489", "S#51832", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48490", "S#51829", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48491", "S#51831", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48492", "S#52951", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48493", "S#51847", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48494", "S#52345", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48497", "S#52344", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48498", "S#52952", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48499", "S#52354", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48496", "S#52953", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48500", "S#52954", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48504", "S#52955", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48505", "S#52956", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48503", "S#52957", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48502", "S#52958", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48506", "S#52959", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48501", "S#52960", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48495", "S#52961", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48507", "S#52352", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48510", "S#52962", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48509", "S#52963", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48511", "S#52964", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0764", "f48508", "S#52965", 2, 0, false);
        return (SubLObject)module0764.NIL;
    }
    
    public static SubLObject f48513() {
        module0764.$g6115$ = SubLFiles.deflexical("S#52966", (SubLObject)module0764.NIL);
        module0764.$g6116$ = SubLFiles.deflexical("S#52967", (SubLObject)module0764.NIL);
        return (SubLObject)module0764.NIL;
    }
    
    public static SubLObject f48514() {
        module0034.f1895((SubLObject)module0764.$ic2$);
        module0034.f1895((SubLObject)module0764.$ic17$);
        module0034.f1895((SubLObject)module0764.$ic19$);
        module0034.f1895((SubLObject)module0764.$ic23$);
        module0034.f1909((SubLObject)module0764.$ic62$);
        module0034.f1909((SubLObject)module0764.$ic66$);
        module0034.f1895((SubLObject)module0764.$ic124$);
        module0034.f1895((SubLObject)module0764.$ic129$);
        module0034.f1895((SubLObject)module0764.$ic134$);
        module0762.f48147((SubLObject)module0764.$ic153$, (SubLObject)module0764.$ic154$, (SubLObject)module0764.$ic155$);
        return (SubLObject)module0764.NIL;
    }
    
    public void declareFunctions() {
        f48512();
    }
    
    public void initializeVariables() {
        f48513();
    }
    
    public void runTopLevelForms() {
        f48514();
    }
    
    static {
        me = (SubLFile)new module0764();
        module0764.$g6115$ = null;
        module0764.$g6116$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("ANY");
        $ic1$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genPhrase"));
        $ic2$ = SubLObjectFactory.makeSymbol("S#52897", "CYC");
        $ic3$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("preferredGenUnit"));
        $ic4$ = SubLObjectFactory.makeInteger(32);
        $ic5$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic6$ = SubLObjectFactory.makeString("~&PREFERRED-LEXIFICATION-METHOD found no preferred lexifications for~% ~S");
        $ic7$ = SubLObjectFactory.makeString("~&GENERATE-PHRASE-FROM-LEXIFICATION-SENTENCES found these results:~% ~S.~%");
        $ic8$ = SubLObjectFactory.makeString("(PPH error level ");
        $ic9$ = SubLObjectFactory.makeString(") ");
        $ic10$ = SubLObjectFactory.makeString("Bad NL-PREDS: ~S");
        $ic11$ = SubLObjectFactory.makeString("~S is a forbidden paraphrase for ~S");
        $ic12$ = SubLObjectFactory.makeString("~&GENERATE-PHRASE-FROM-ASSERTIONS found these results:~% ~S.~%");
        $ic13$ = SubLObjectFactory.makeString("~&Checking output-item: ~S.~%");
        $ic14$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("nounStrings"));
        $ic15$ = SubLObjectFactory.makeSymbol("S#51379", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#50691", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#52910", "CYC");
        $ic18$ = SubLObjectFactory.makeKeyword("TEXT");
        $ic19$ = SubLObjectFactory.makeSymbol("S#52912", "CYC");
        $ic20$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("chemicalFormulaString"));
        $ic21$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#52968", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#52969", "CYC"));
        $ic22$ = SubLObjectFactory.makeSymbol("S#5859", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("S#52916", "CYC");
        $ic24$ = SubLObjectFactory.makeInteger(256);
        $ic25$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#49536", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20618", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#49996", "CYC"));
        $ic26$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("BestNLWordFormOfLexemeFn-Constrained"));
        $ic27$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#49536", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"));
        $ic28$ = SubLObjectFactory.makeKeyword("UNSPECIFIED");
        $ic29$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Adjective"));
        $ic30$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("nonGradableAdjectiveForm")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("regularDegree")));
        $ic31$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Adverb"));
        $ic32$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("regularAdverb")));
        $ic33$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Determiner"));
        $ic34$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Verb"));
        $ic35$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("verbStrings")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("gerund")));
        $ic36$ = SubLObjectFactory.makeString("Filtered V-bar preds to ~S~%");
        $ic37$ = SubLObjectFactory.makeSymbol("SPEC-POS-PRED?");
        $ic38$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("BestNLWordFormOfLexemeFn"));
        $ic39$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("HeadWordOfPhraseFn"));
        $ic40$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("hyphenString"));
        $ic41$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("BestSymbolPhraseFn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Hyphen-TheSymbol")));
        $ic42$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ConcatenatePhrasesFn-NoSpaces"));
        $ic43$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ConcatenatePhrasesFn"));
        $ic44$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Collection"));
        $ic45$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("nounStrings")));
        $ic46$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("regularDegree")));
        $ic47$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#52970", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#52971", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#52972", "CYC"), (SubLObject)module0764.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("S#14271", "CYC"));
        $ic48$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Thing"));
        $ic49$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#52973", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#52974", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#52975", "CYC"), (SubLObject)module0764.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("S#52976", "CYC"));
        $ic50$ = SubLObjectFactory.makeString(" ");
        $ic51$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#52977", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#52978", "CYC"));
        $ic52$ = SubLObjectFactory.makeString("~&PASSED-PREDS-SUCCEED-METHOD: PPH-STRING-FOR-TERM returned ~S.~%");
        $ic53$ = SubLObjectFactory.makeString("Broadening *PPH-LANGUAGE-MT* to ~S");
        $ic54$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#52885", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#52895", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#52886", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#52923", "CYC"));
        $ic55$ = SubLObjectFactory.makeKeyword("NEVER");
        $ic56$ = SubLObjectFactory.makeKeyword("DEFAULT");
        $ic57$ = SubLObjectFactory.makeSymbol("S#39429", "CYC");
        $ic58$ = SubLObjectFactory.makeKeyword("GAF");
        $ic59$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic60$ = SubLObjectFactory.makeString("Skipping forbidden lexical assertion:~% ~S");
        $ic61$ = SubLObjectFactory.makeKeyword("RANDOM");
        $ic62$ = SubLObjectFactory.makeSymbol("S#52930", "CYC");
        $ic63$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("multiWordString-Speculative"));
        $ic64$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("denotation"));
        $ic65$ = SubLObjectFactory.makeSymbol("S#52966", "CYC");
        $ic66$ = SubLObjectFactory.makeSymbol("S#50999", "CYC");
        $ic67$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("DenotesArgInRelnPredicate"));
        $ic68$ = SubLObjectFactory.makeSymbol("S#52967", "CYC");
        $ic69$ = SubLObjectFactory.makeKeyword("ALL");
        $ic70$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ACRONYMS"), (SubLObject)SubLObjectFactory.makeKeyword("ABBREVS"));
        $ic71$ = SubLObjectFactory.makeKeyword("PPH-HL-SUPPORTS-FOUND");
        $ic72$ = SubLObjectFactory.makeSymbol("S#747", "CYC");
        $ic73$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic74$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CollectionLexificationPredicate-Required"));
        $ic75$ = SubLObjectFactory.makeString("ALL-PHRASES-FOR-TERM doesn't know what to do with filters like ~S. Ignoring it.");
        $ic76$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("MtUnionFn"));
        $ic77$ = SubLObjectFactory.makeKeyword("ABBREVS");
        $ic78$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("scientificName"));
        $ic79$ = SubLObjectFactory.makeSymbol("S#51473", "CYC");
        $ic80$ = SubLObjectFactory.makeKeyword("ACRONYMS");
        $ic81$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("acronymString"));
        $ic82$ = SubLObjectFactory.makeSymbol("S#51008", "CYC");
        $ic83$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("abbreviationString-PN"));
        $ic84$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("rdfs:label"));
        $ic85$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("resultNamedByArg"));
        $ic86$ = SubLObjectFactory.makeSymbol("?ARG");
        $ic87$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?ARG"), (SubLObject)SubLObjectFactory.makeSymbol("?PRED"));
        $ic88$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic89$ = SubLObjectFactory.makeString("~% Top-level CycL: ~S");
        $ic90$ = SubLObjectFactory.makeSymbol("S#39341", "CYC");
        $ic91$ = SubLObjectFactory.makeSymbol("S#39074", "CYC");
        $ic92$ = SubLObjectFactory.makeSymbol("S#12753", "CYC");
        $ic93$ = SubLObjectFactory.makeSymbol("S#18501", "CYC");
        $ic94$ = SubLObjectFactory.makeKeyword("NONE");
        $ic95$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("termStrings"));
        $ic96$ = SubLObjectFactory.makeKeyword("DEPTH");
        $ic97$ = SubLObjectFactory.makeKeyword("STACK");
        $ic98$ = SubLObjectFactory.makeKeyword("QUEUE");
        $ic99$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("True-JustificationTruth"));
        $ic100$ = SubLObjectFactory.makeSymbol("S#11450", "CYC");
        $ic101$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic102$ = SubLObjectFactory.makeString("~A is not a ~A");
        $ic103$ = SubLObjectFactory.makeSymbol("S#11592", "CYC");
        $ic104$ = SubLObjectFactory.makeKeyword("CERROR");
        $ic105$ = SubLObjectFactory.makeString("continue anyway");
        $ic106$ = SubLObjectFactory.makeKeyword("WARN");
        $ic107$ = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic108$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $ic109$ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $ic110$ = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic111$ = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic112$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic113$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic114$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("GeneralEnglishMt"));
        $ic115$ = SubLObjectFactory.makeSymbol("S#52937", "CYC");
        $ic116$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("VulgarSpeech")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("RudeSpeech")));
        $ic117$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("InformalSpeech")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("ArchaicSpeech")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("BabyTalk")));
        $ic118$ = SubLObjectFactory.makeString("Empty NL preds list");
        $ic119$ = SubLObjectFactory.makeKeyword("ON");
        $ic120$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("wordStrings")));
        $ic121$ = SubLObjectFactory.makeSymbol("S#51009", "CYC");
        $ic122$ = SubLObjectFactory.makeSymbol("S#51681", "CYC");
        $ic123$ = SubLObjectFactory.makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic124$ = SubLObjectFactory.makeSymbol("S#52943", "CYC");
        $ic125$ = SubLObjectFactory.makeSymbol("S#51494", "CYC");
        $ic126$ = SubLObjectFactory.makeString("Bad pred: ~S");
        $ic127$ = SubLObjectFactory.makeString("~&Found alternative: ~S ~S~%");
        $ic128$ = SubLObjectFactory.makeInteger(1000);
        $ic129$ = SubLObjectFactory.makeSymbol("S#52945", "CYC");
        $ic130$ = SubLObjectFactory.makeString("Coercing ~S form of ~S~%");
        $ic131$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#52979", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#52980", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39569", "CYC"));
        $ic132$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("properNounStrings"));
        $ic133$ = SubLObjectFactory.makeInteger(500);
        $ic134$ = SubLObjectFactory.makeSymbol("S#52947", "CYC");
        $ic135$ = SubLObjectFactory.makeInteger(64);
        $ic136$ = SubLObjectFactory.makeString("paraphraseCoercionSometimesAllowedFrom");
        $ic137$ = SubLObjectFactory.makeString("paraphraseCoercionAllowedFrom");
        $ic138$ = SubLObjectFactory.makeString("paraphraseCoercionAlwaysAllowedFrom");
        $ic139$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("paraphraseCoercionAllowedFrom"));
        $ic140$ = SubLObjectFactory.makeSymbol("S#3338", "CYC");
        $ic141$ = SubLObjectFactory.makeSymbol("THIRD");
        $ic142$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#52981", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39569", "CYC"));
        $ic143$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("regularSuffix"));
        $ic144$ = ConsesLow.list((SubLObject)module0764.TWO_INTEGER, (SubLObject)module0764.THREE_INTEGER);
        $ic145$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("NLPersonAttribute"));
        $ic146$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("NLNumberAttribute"));
        $ic147$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("NLGenderAttribute"));
        $ic148$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Singular-NLAttr"));
        $ic149$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ThirdPerson-NLAttr"));
        $ic150$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Ungendered-NLAttr"));
        $ic151$ = SubLObjectFactory.makeString("Couldn't generate pronoun agr for ~S");
        $ic152$ = SubLObjectFactory.makeKeyword("UNDETERMINED");
        $ic153$ = SubLObjectFactory.makeSymbol("S#52345", "CYC");
        $ic154$ = SubLObjectFactory.makeKeyword("DISCOURSE-PARTICIPANT");
        $ic155$ = SubLObjectFactory.makeKeyword("BEST");
        $ic156$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("pronounStrings")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("nounStrings")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("properNameStrings")));
        $ic157$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("PhraseFn"));
        $ic158$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ReflexivePronoun"));
        $ic159$ = SubLObjectFactory.makeKeyword("NOMINATIVE");
        $ic160$ = SubLObjectFactory.makeString("Generated ~S for ~S");
        $ic161$ = SubLObjectFactory.makeString("Unable to find a pronoun for ~S.~%");
        $ic162$ = SubLObjectFactory.makeSymbol("S#52956", "CYC");
        $ic163$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Pronoun"));
        $ic164$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("singular-Generic"));
        $ic165$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("plural-Generic"));
        $ic166$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("That-TheWord")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("This-TheWord")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Those-TheWord")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("These-TheWord")));
        $ic167$ = SubLObjectFactory.makeSymbol("S#48609", "CYC");
        $ic168$ = SubLObjectFactory.makeString("Couldn't find a word unit for:~% ~S");
        $ic169$ = SubLObjectFactory.makeString("Found ~S for:~% ~S~% Using ~S");
        $ic170$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39302", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("S#39303", "CYC"));
        $ic171$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Neuter-NLAttr"));
        $ic172$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SecondPerson-NLAttr"));
        $ic173$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("PronounFn"));
        $ic174$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SubjectPronoun"));
        $ic175$ = SubLObjectFactory.makeKeyword("GENITIVE");
        $ic176$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("PossessivePronoun-Pre"));
        $ic177$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ObjectPronoun"));
        $ic178$ = SubLObjectFactory.makeString("~&Looking up value for ~S with agr-preds ~S.");
        $ic179$ = SubLObjectFactory.makeString("~&Unable to find string matching ~S for ~S");
        $ic180$ = SubLObjectFactory.makeString("Done ~S alternatives of ~S");
        $ic181$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#52982", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#52983", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#52972", "CYC"), (SubLObject)module0764.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("S#14271", "CYC"));
        $ic182$ = SubLObjectFactory.makeString("~&Found answer pair (~S ~S).");
        $ic183$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("determinerStrings")));
    }
    
    public static final class $f48411$UnaryFunction extends UnaryFunction
    {
        public $f48411$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#52885"));
        }
        
        public SubLObject processItem(final SubLObject var21) {
            return module0764.f48411(var21, (SubLObject)$f48411$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f48411$BinaryFunction extends BinaryFunction
    {
        public $f48411$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#52885"));
        }
        
        public SubLObject processItem(final SubLObject var21, final SubLObject var22) {
            return module0764.f48411(var21, var22);
        }
    }
    
    public static final class $f48416$UnaryFunction extends UnaryFunction
    {
        public $f48416$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#52886"));
        }
        
        public SubLObject processItem(final SubLObject var21) {
            return module0764.f48416(var21, (SubLObject)$f48416$UnaryFunction.UNPROVIDED, (SubLObject)$f48416$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f48416$BinaryFunction extends BinaryFunction
    {
        public $f48416$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#52886"));
        }
        
        public SubLObject processItem(final SubLObject var21, final SubLObject var22) {
            return module0764.f48416(var21, var22, (SubLObject)$f48416$BinaryFunction.UNPROVIDED);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0764.class
	Total time: 3697 ms
	
	Decompiled with Procyon 0.5.32.
*/