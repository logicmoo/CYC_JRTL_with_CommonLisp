package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0466 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0466";
    public static final String myFingerPrint = "3713321f5a1b310c8e6987d283ecbdb3b2c09028df3bb4977d6cec4138de466a";
    private static SubLSymbol $g3674$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    
    public static SubLObject f31514(final SubLObject var1, final SubLObject var2) {
        return module0202.f12768(module0466.$ic0$, var1, var2);
    }
    
    public static SubLObject f31515(final SubLObject var3, SubLObject var4) {
        if (var4 == module0466.UNPROVIDED) {
            var4 = (SubLObject)module0466.NIL;
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = module0205.f13387(var3, (SubLObject)module0466.UNPROVIDED);
        final SubLObject var7 = module0205.f13388(var3, (SubLObject)module0466.UNPROVIDED);
        var5.resetMultipleValues();
        final SubLObject var8 = module0229.f15243(var7);
        final SubLObject var9 = var5.secondMultipleValue();
        final SubLObject var10 = var5.thirdMultipleValue();
        var5.resetMultipleValues();
        if (module0466.NIL != var9) {
            var5.resetMultipleValues();
            final SubLObject var11 = module0235.f15474(var6, var8, (SubLObject)module0466.T, (SubLObject)module0466.T);
            final SubLObject var12 = var5.secondMultipleValue();
            var5.resetMultipleValues();
            if (module0466.NIL != var11) {
                final SubLObject var13 = module0233.f15362(var11, var6);
                final SubLObject var14 = f31514(var13, var7);
                final SubLObject var15 = module0438.f30664(var14, var10);
                module0347.f23330(var15, var11, var12);
            }
        }
        return (SubLObject)module0466.NIL;
    }
    
    public static SubLObject f31516(final SubLObject var3, SubLObject var4) {
        if (var4 == module0466.UNPROVIDED) {
            var4 = (SubLObject)module0466.NIL;
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = module0205.f13387(var3, (SubLObject)module0466.UNPROVIDED);
        final SubLObject var7 = module0205.f13388(var3, (SubLObject)module0466.UNPROVIDED);
        var5.resetMultipleValues();
        final SubLObject var8 = module0229.f15243(var7);
        final SubLObject var9 = var5.secondMultipleValue();
        final SubLObject var10 = var5.thirdMultipleValue();
        var5.resetMultipleValues();
        if (module0466.NIL != var9) {
            var5.resetMultipleValues();
            final SubLObject var11 = module0235.f15474(var6, var8, (SubLObject)module0466.UNPROVIDED, (SubLObject)module0466.UNPROVIDED);
            final SubLObject var12 = var5.secondMultipleValue();
            var5.resetMultipleValues();
            if (module0466.NIL == var11) {
                final SubLObject var13 = module0205.f13338(var3);
                final SubLObject var14 = module0438.f30664(var13, var10);
                module0347.f23330(var14, (SubLObject)module0466.UNPROVIDED, (SubLObject)module0466.UNPROVIDED);
            }
        }
        return (SubLObject)module0466.NIL;
    }
    
    public static SubLObject f31517(final SubLObject var15) {
        if (module0466.NIL != module0035.f2370((SubLObject)module0466.$ic9$, module0232.f15308(var15), (SubLObject)module0466.$ic10$) && module0466.NIL != f31518(var15, (SubLObject)module0466.UNPROVIDED, (SubLObject)module0466.UNPROVIDED)) {
            return (SubLObject)ConsesLow.list(module0204.f13100(var15));
        }
        return (SubLObject)module0466.NIL;
    }
    
    public static SubLObject f31518(final SubLObject var15, SubLObject var16, SubLObject var17) {
        if (var16 == module0466.UNPROVIDED) {
            var16 = (SubLObject)module0466.NIL;
        }
        if (var17 == module0466.UNPROVIDED) {
            var17 = (SubLObject)module0466.NIL;
        }
        SubLObject var18 = (SubLObject)module0466.NIL;
        SubLObject var19 = (SubLObject)module0466.NIL;
        if (Sequences.length(var17).numE(module0204.f13075(var15))) {
            return (SubLObject)module0466.T;
        }
        SubLObject var20 = (SubLObject)module0466.ZERO_INTEGER;
        SubLObject var21;
        SubLObject var22;
        SubLObject var23;
        SubLObject var24;
        SubLObject var25;
        SubLObject var26;
        SubLObject var27;
        for (var21 = (SubLObject)module0466.NIL, var21 = module0232.f15306(var15); module0466.NIL == var18 && module0466.NIL != var21; var21 = var21.rest()) {
            var22 = var21.first();
            var23 = (SubLObject)module0466.$ic2$;
            var24 = (SubLObject)ConsesLow.cons(var23, var20);
            if (module0466.NIL == module0004.f104(var24, var17, Symbols.symbol_function((SubLObject)module0466.EQUAL), (SubLObject)module0466.UNPROVIDED)) {
                var25 = f31519(var22, var23, var16);
                if (module0466.NIL != var25) {
                    var26 = (SubLObject)((module0466.NIL != module0206.f13500(var25)) ? ConsesLow.cons(var25, var16) : var16);
                    var27 = (SubLObject)ConsesLow.cons(var24, var17);
                    var19 = f31518(var15, var26, var27);
                    if (module0466.NIL != var19) {
                        var18 = (SubLObject)module0466.T;
                    }
                }
            }
            var20 = Numbers.add(var20, (SubLObject)module0466.ONE_INTEGER);
        }
        var20 = (SubLObject)module0466.ZERO_INTEGER;
        for (var21 = (SubLObject)module0466.NIL, var21 = module0232.f15308(var15); module0466.NIL == var18 && module0466.NIL != var21; var21 = var21.rest()) {
            var22 = var21.first();
            var23 = (SubLObject)module0466.$ic1$;
            var24 = (SubLObject)ConsesLow.cons(var23, var20);
            if (module0466.NIL == module0004.f104(var24, var17, Symbols.symbol_function((SubLObject)module0466.EQUAL), (SubLObject)module0466.UNPROVIDED)) {
                var25 = f31519(var22, var23, var16);
                if (module0466.NIL != var25) {
                    var26 = (SubLObject)((module0466.NIL != module0206.f13500(var25)) ? ConsesLow.cons(var25, var16) : var16);
                    var27 = (SubLObject)ConsesLow.cons(var24, var17);
                    var19 = f31518(var15, var26, var27);
                    if (module0466.NIL != var19) {
                        var18 = (SubLObject)module0466.T;
                    }
                }
            }
            var20 = Numbers.add(var20, (SubLObject)module0466.ONE_INTEGER);
        }
        return var19;
    }
    
    public static SubLObject f31519(final SubLObject var27, final SubLObject var4, final SubLObject var16) {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        SubLObject var29 = (SubLObject)module0466.NIL;
        SubLObject var30 = (SubLObject)module0466.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var27, var27, (SubLObject)module0466.$ic12$);
        var29 = var27.first();
        SubLObject var31 = var27.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var31, var27, (SubLObject)module0466.$ic12$);
        var30 = var31.first();
        var31 = var31.rest();
        if (module0466.NIL == var31) {
            final SubLObject var32 = module0147.f9540(var29);
            final SubLObject var33 = module0147.$g2095$.currentBinding(var28);
            final SubLObject var34 = module0147.$g2094$.currentBinding(var28);
            final SubLObject var35 = module0147.$g2096$.currentBinding(var28);
            try {
                module0147.$g2095$.bind(module0147.f9545(var32), var28);
                module0147.$g2094$.bind(module0147.f9546(var32), var28);
                module0147.$g2096$.bind(module0147.f9549(var32), var28);
                if (var4 == module0466.$ic1$ && module0466.NIL != module0202.f12877(var30, (SubLObject)module0466.UNPROVIDED)) {
                    if (module0466.NIL != module0202.f12879(var30)) {
                        return module0205.f13387(var30, (SubLObject)module0466.UNPROVIDED);
                    }
                }
                else {
                    if (module0466.NIL == module0202.f12590(var30) || module0466.NIL == module0229.f15237(module0205.f13136(var30))) {
                        return (SubLObject)module0466.NIL;
                    }
                    final SubLObject var36 = Sequences.remove_duplicates(module0035.f2259((SubLObject)module0466.$ic14$, var30, (SubLObject)module0466.UNPROVIDED), (SubLObject)module0466.UNPROVIDED, (SubLObject)module0466.UNPROVIDED, (SubLObject)module0466.UNPROVIDED, (SubLObject)module0466.UNPROVIDED);
                    if (module0466.NIL != conses_high.subsetp(var36, var16, (SubLObject)module0466.UNPROVIDED, (SubLObject)module0466.UNPROVIDED)) {
                        return (SubLObject)module0466.T;
                    }
                }
            }
            finally {
                module0147.$g2096$.rebind(var35, var28);
                module0147.$g2094$.rebind(var34, var28);
                module0147.$g2095$.rebind(var33, var28);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var27, (SubLObject)module0466.$ic12$);
        }
        return (SubLObject)module0466.NIL;
    }
    
    public static SubLObject f31520(final SubLObject var36) {
        return (SubLObject)SubLObjectFactory.makeBoolean((module0466.NIL != module0202.f12590(var36) && module0466.NIL != module0229.f15237(module0205.f13136(var36))) || module0466.NIL != module0202.f12877(var36, (SubLObject)module0466.UNPROVIDED));
    }
    
    public static SubLObject f31521(final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        var16.resetMultipleValues();
        final SubLObject var17 = f31522(var15, (SubLObject)module0466.UNPROVIDED, (SubLObject)module0466.UNPROVIDED, (SubLObject)module0466.UNPROVIDED);
        final SubLObject var18 = var16.secondMultipleValue();
        var16.resetMultipleValues();
        if (module0466.NIL != var18 && module0466.NIL == module0233.f15405(var17, var17)) {
            module0376.f26641(var17, var18);
        }
        return (SubLObject)module0466.NIL;
    }
    
    public static SubLObject f31522(final SubLObject var15, SubLObject var10, SubLObject var37, SubLObject var17) {
        if (var10 == module0466.UNPROVIDED) {
            var10 = (SubLObject)module0466.NIL;
        }
        if (var37 == module0466.UNPROVIDED) {
            var37 = (SubLObject)module0466.NIL;
        }
        if (var17 == module0466.UNPROVIDED) {
            var17 = (SubLObject)module0466.NIL;
        }
        final SubLThread var38 = SubLProcess.currentSubLThread();
        if (Sequences.length(var17).numE(module0204.f13075(var15))) {
            return Values.values(var10, var37);
        }
        SubLObject var39 = (SubLObject)module0466.ZERO_INTEGER;
        SubLObject var40 = module0232.f15306(var15);
        SubLObject var41 = (SubLObject)module0466.NIL;
        var41 = var40.first();
        while (module0466.NIL != var40) {
            final SubLObject var42 = (SubLObject)module0466.$ic2$;
            final SubLObject var43 = (SubLObject)ConsesLow.cons(var42, var39);
            if (module0466.NIL == module0004.f104(var43, var17, Symbols.symbol_function((SubLObject)module0466.EQUAL), (SubLObject)module0466.UNPROVIDED)) {
                var38.resetMultipleValues();
                final SubLObject var44 = f31523(var41, var42, var10);
                final SubLObject var45 = var38.secondMultipleValue();
                var38.resetMultipleValues();
                final SubLObject var46 = var45;
                if (module0466.NIL == conses_high.member(var46, var37, Symbols.symbol_function((SubLObject)module0466.EQL), Symbols.symbol_function((SubLObject)module0466.IDENTITY))) {
                    var37 = (SubLObject)ConsesLow.cons(var46, var37);
                }
                if (module0466.NIL != var45) {
                    final SubLObject var47 = (SubLObject)ConsesLow.cons(var43, var17);
                    return f31522(var15, var44, var37, var47);
                }
            }
            var39 = Numbers.add(var39, (SubLObject)module0466.ONE_INTEGER);
            var40 = var40.rest();
            var41 = var40.first();
        }
        var39 = (SubLObject)module0466.ZERO_INTEGER;
        var40 = module0232.f15308(var15);
        var41 = (SubLObject)module0466.NIL;
        var41 = var40.first();
        while (module0466.NIL != var40) {
            final SubLObject var42 = (SubLObject)module0466.$ic1$;
            final SubLObject var43 = (SubLObject)ConsesLow.cons(var42, var39);
            if (module0466.NIL == module0004.f104(var43, var17, Symbols.symbol_function((SubLObject)module0466.EQUAL), (SubLObject)module0466.UNPROVIDED)) {
                var38.resetMultipleValues();
                final SubLObject var44 = f31523(var41, var42, var10);
                final SubLObject var45 = var38.secondMultipleValue();
                var38.resetMultipleValues();
                final SubLObject var46 = var45;
                if (module0466.NIL == conses_high.member(var46, var37, Symbols.symbol_function((SubLObject)module0466.EQL), Symbols.symbol_function((SubLObject)module0466.IDENTITY))) {
                    var37 = (SubLObject)ConsesLow.cons(var46, var37);
                }
                if (module0466.NIL != var45) {
                    final SubLObject var47 = (SubLObject)ConsesLow.cons(var43, var17);
                    return f31522(var15, var44, var37, var47);
                }
            }
            var39 = Numbers.add(var39, (SubLObject)module0466.ONE_INTEGER);
            var40 = var40.rest();
            var41 = var40.first();
        }
        return Values.values((SubLObject)module0466.NIL, (SubLObject)module0466.NIL);
    }
    
    public static SubLObject f31523(final SubLObject var27, final SubLObject var4, SubLObject var10) {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        SubLObject var29 = (SubLObject)module0466.NIL;
        SubLObject var30 = (SubLObject)module0466.NIL;
        SubLObject var31 = (SubLObject)module0466.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var27, var27, (SubLObject)module0466.$ic12$);
        var30 = var27.first();
        SubLObject var32 = var27.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var32, var27, (SubLObject)module0466.$ic12$);
        var31 = var32.first();
        var32 = var32.rest();
        if (module0466.NIL == var32) {
            final SubLObject var33 = module0147.f9540(var30);
            final SubLObject var34 = module0147.$g2095$.currentBinding(var28);
            final SubLObject var35 = module0147.$g2094$.currentBinding(var28);
            final SubLObject var36 = module0147.$g2096$.currentBinding(var28);
            try {
                module0147.$g2095$.bind(module0147.f9545(var33), var28);
                module0147.$g2094$.bind(module0147.f9546(var33), var28);
                module0147.$g2096$.bind(module0147.f9549(var33), var28);
                if (module0466.NIL != module0202.f12877(var31, (SubLObject)module0466.UNPROVIDED)) {
                    final SubLObject var37 = module0205.f13387(var31, (SubLObject)module0466.UNPROVIDED);
                    final SubLObject var38 = module0233.f15362(var10, module0205.f13388(var31, (SubLObject)module0466.UNPROVIDED));
                    var28.resetMultipleValues();
                    final SubLObject var39 = module0229.f15243(var38);
                    final SubLObject var40 = var28.secondMultipleValue();
                    final SubLObject var41 = var28.thirdMultipleValue();
                    var28.resetMultipleValues();
                    if (module0466.NIL != var40) {
                        var28.resetMultipleValues();
                        SubLObject var42 = module0235.f15474(var37, var39, (SubLObject)module0466.T, (SubLObject)module0466.T);
                        final SubLObject var43 = var28.secondMultipleValue();
                        var28.resetMultipleValues();
                        if (module0466.NIL != var42) {
                            if (module0466.NIL != module0233.f15393(var42)) {
                                var42 = (SubLObject)module0466.NIL;
                            }
                            final SubLObject var44 = module0233.f15362(var42, var37);
                            final SubLObject var45 = f31514(var44, var38);
                            SubLObject var46 = (SubLObject)module0466.NIL;
                            var46 = module0438.f30664(var45, var41);
                            var10 = Sequences.remove_duplicates(ConsesLow.append(var10, var42), Symbols.symbol_function((SubLObject)module0466.EQUAL), (SubLObject)module0466.UNPROVIDED, (SubLObject)module0466.UNPROVIDED, (SubLObject)module0466.UNPROVIDED);
                            var29 = (SubLObject)((module0466.NIL != var43) ? ConsesLow.list(var46, var43) : ConsesLow.list(var46));
                            return Values.values(var10, var29);
                        }
                    }
                }
                else {
                    if (module0466.NIL == module0202.f12590(var31) || module0466.NIL == module0229.f15237(module0205.f13136(var31))) {
                        return Values.values(var10, (SubLObject)module0466.NIL);
                    }
                    var31 = module0233.f15362(var10, var31);
                    var28.resetMultipleValues();
                    final SubLObject var47 = module0229.f15243(var31);
                    final SubLObject var48 = var28.secondMultipleValue();
                    final SubLObject var49 = var28.thirdMultipleValue();
                    var28.resetMultipleValues();
                    if (module0466.NIL != var48 && module0466.NIL != ((var4 == module0466.$ic1$) ? var47 : SubLObjectFactory.makeBoolean(module0466.NIL == var47))) {
                        final SubLObject var50 = module0351.f23577(var31);
                        SubLObject var51 = (SubLObject)module0466.NIL;
                        var51 = ((var4 == module0466.$ic1$) ? module0438.f30664(var50, var49) : module0438.f30664(module0205.f13338(var50), var49));
                        return Values.values(var10, (SubLObject)ConsesLow.list(var51));
                    }
                    return Values.values((SubLObject)module0466.NIL, (SubLObject)module0466.NIL);
                }
            }
            finally {
                module0147.$g2096$.rebind(var36, var28);
                module0147.$g2094$.rebind(var35, var28);
                module0147.$g2095$.rebind(var34, var28);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var27, (SubLObject)module0466.$ic12$);
        }
        return (SubLObject)module0466.NIL;
    }
    
    public static SubLObject f31524() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0466", "f31514", "S#17984", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0466", "f31515", "S#29818", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0466", "f31516", "S#34843", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0466", "f31517", "S#34844", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0466", "f31518", "S#34845", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0466", "f31519", "S#34846", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0466", "f31520", "S#34847", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0466", "f31521", "S#34848", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0466", "f31522", "S#34849", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0466", "f31523", "S#34850", 3, 0, false);
        return (SubLObject)module0466.NIL;
    }
    
    public static SubLObject f31525() {
        module0466.$g3674$ = SubLFiles.defparameter("S#34851", (SubLObject)module0466.ONE_INTEGER);
        return (SubLObject)module0466.NIL;
    }
    
    public static SubLObject f31526() {
        module0340.f22938(module0466.$ic0$);
        module0358.f23771((SubLObject)module0466.$ic1$, module0466.$ic0$, (SubLObject)module0466.TWO_INTEGER);
        module0358.f23773((SubLObject)module0466.$ic2$, module0466.$ic0$);
        module0340.f22941((SubLObject)module0466.$ic3$, (SubLObject)module0466.$ic4$);
        module0340.f22941((SubLObject)module0466.$ic5$, (SubLObject)module0466.$ic6$);
        module0340.f22962((SubLObject)module0466.$ic7$, (SubLObject)module0466.$ic8$);
        module0012.f419((SubLObject)module0466.$ic11$);
        module0012.f419((SubLObject)module0466.$ic15$);
        return (SubLObject)module0466.NIL;
    }
    
    public void declareFunctions() {
        f31524();
    }
    
    public void initializeVariables() {
        f31525();
    }
    
    public void runTopLevelForms() {
        f31526();
    }
    
    static {
        me = (SubLFile)new module0466();
        module0466.$g3674$ = null;
        $ic0$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("evaluate"));
        $ic1$ = SubLObjectFactory.makeKeyword("POS");
        $ic2$ = SubLObjectFactory.makeKeyword("NEG");
        $ic3$ = SubLObjectFactory.makeKeyword("REMOVAL-EVALUATE-BIND");
        $ic4$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("evaluate")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("evaluate")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#17997", "CYC")))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#34851", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#29818", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$evaluate <whatever> (<evaluatable function . <fully bound>))\n using the #$evaluationDefn for the function"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$evaluate ?SUM (#$PlusFn 1 2))\n (#$evaluate 3 (#$PlusFn 1 2))") });
        $ic5$ = SubLObjectFactory.makeKeyword("REMOVAL-EVALUATE-NEG-CHECK");
        $ic6$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("evaluate")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("evaluate")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#17997", "CYC")))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#34851", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34843", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$evaluate <fully bound> (<evaluatable function . <fully bound>)))\nusing the #$evaluationDefn for the function"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$evaluate 4 (#$PlusFn 1 2)))") });
        $ic7$ = SubLObjectFactory.makeKeyword("REMOVAL-EVALUATE-BIND-CONJUNCTION");
        $ic8$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("APPLICABILITY"), SubLObjectFactory.makeSymbol("S#34844", "CYC"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#34851", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34848", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("Solves a connected conjunction of literals where at least one literal is an #$evaluate and the rest are evaluatable."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$and \n     (#$greaterThanOrEqualTo ?VAR0 (#$MonthsDuration 6)) \n     (#$evaluate ?VAR0 \n       (#$TimeElapsedFn \n         (#$SecondFn 0 (#$MinuteFn 59 (#$HourFn 23 (#$DayFn 25 (#$MonthFn #$February (#$YearFn 2010))))))\n         (#$SecondFn 0 (#$MinuteFn 51 (#$HourFn 8 (#$DayFn 22 (#$MonthFn #$April (#$YearFn 2010)))))))))") });
        $ic9$ = SubLObjectFactory.makeSymbol("S#34847", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#16021", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#34844", "CYC");
        $ic12$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"));
        $ic13$ = SubLObjectFactory.makeSymbol("S#5859", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#15433", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#34848", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0466.class
	Total time: 168 ms
	
	Decompiled with Procyon 0.5.32.
*/