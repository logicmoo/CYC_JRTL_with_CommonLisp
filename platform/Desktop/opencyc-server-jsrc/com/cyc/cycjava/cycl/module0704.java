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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0704 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0704";
    public static final String myFingerPrint = "5420572ab8db7c3b146ca00d69506e1662dfa91d1bf2fa5259cabbe1eb53704f";
    public static SubLSymbol $g5516$;
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
    private static final SubLString $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLString $ic40$;
    private static final SubLString $ic41$;
    private static final SubLString $ic42$;
    private static final SubLString $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLString $ic46$;
    private static final SubLString $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLSymbol $ic50$;
    
    
    public static SubLObject f42880(final SubLObject var1, final SubLObject var2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(f42881(var1).equal(f42881(var2)) && f42882(var1).equal(f42882(var2)) && f42883(var1).equal(f42883(var2)));
    }
    
    public static SubLObject f42884(final SubLObject var1, final SubLObject var2) {
        return Strings.stringL(f42881(var1), f42881(var2), (SubLObject)module0704.UNPROVIDED, (SubLObject)module0704.UNPROVIDED, (SubLObject)module0704.UNPROVIDED, (SubLObject)module0704.UNPROVIDED);
    }
    
    public static SubLObject f42885(final SubLObject var3) {
        final SubLObject var4 = f42881(var3);
        return (module0704.NIL != module0039.f3006(var4)) ? var4 : module0208.f13541(var4);
    }
    
    public static SubLObject f42886(final SubLObject var5, final SubLObject var6) {
        f42887(var5, var6, (SubLObject)module0704.ZERO_INTEGER);
        return (SubLObject)module0704.NIL;
    }
    
    public static SubLObject f42888(final SubLObject var5) {
        return (SubLObject)((var5.getClass() == $sX46916_native.class) ? module0704.T : module0704.NIL);
    }
    
    public static SubLObject f42889(final SubLObject var5) {
        assert module0704.NIL != f42888(var5) : var5;
        return var5.getField2();
    }
    
    public static SubLObject f42890(final SubLObject var5) {
        assert module0704.NIL != f42888(var5) : var5;
        return var5.getField3();
    }
    
    public static SubLObject f42891(final SubLObject var5) {
        assert module0704.NIL != f42888(var5) : var5;
        return var5.getField4();
    }
    
    public static SubLObject f42892(final SubLObject var5, final SubLObject var8) {
        assert module0704.NIL != f42888(var5) : var5;
        return var5.setField2(var8);
    }
    
    public static SubLObject f42893(final SubLObject var5, final SubLObject var8) {
        assert module0704.NIL != f42888(var5) : var5;
        return var5.setField3(var8);
    }
    
    public static SubLObject f42894(final SubLObject var5, final SubLObject var8) {
        assert module0704.NIL != f42888(var5) : var5;
        return var5.setField4(var8);
    }
    
    public static SubLObject f42895(SubLObject var9) {
        if (var9 == module0704.UNPROVIDED) {
            var9 = (SubLObject)module0704.NIL;
        }
        final SubLObject var10 = (SubLObject)new $sX46916_native();
        SubLObject var11;
        SubLObject var12;
        SubLObject var13;
        SubLObject var14;
        for (var11 = (SubLObject)module0704.NIL, var11 = var9; module0704.NIL != var11; var11 = conses_high.cddr(var11)) {
            var12 = var11.first();
            var13 = conses_high.cadr(var11);
            var14 = var12;
            if (var14.eql((SubLObject)module0704.$ic15$)) {
                f42892(var10, var13);
            }
            else if (var14.eql((SubLObject)module0704.$ic16$)) {
                f42893(var10, var13);
            }
            else if (var14.eql((SubLObject)module0704.$ic17$)) {
                f42894(var10, var13);
            }
            else {
                Errors.error((SubLObject)module0704.$ic18$, var12);
            }
        }
        return var10;
    }
    
    public static SubLObject f42896(final SubLObject var15, final SubLObject var16) {
        Functions.funcall(var16, var15, (SubLObject)module0704.$ic19$, (SubLObject)module0704.$ic20$, (SubLObject)module0704.THREE_INTEGER);
        Functions.funcall(var16, var15, (SubLObject)module0704.$ic21$, (SubLObject)module0704.$ic15$, f42889(var15));
        Functions.funcall(var16, var15, (SubLObject)module0704.$ic21$, (SubLObject)module0704.$ic16$, f42890(var15));
        Functions.funcall(var16, var15, (SubLObject)module0704.$ic21$, (SubLObject)module0704.$ic17$, f42891(var15));
        Functions.funcall(var16, var15, (SubLObject)module0704.$ic22$, (SubLObject)module0704.$ic20$, (SubLObject)module0704.THREE_INTEGER);
        return var15;
    }
    
    public static SubLObject f42897(final SubLObject var15, final SubLObject var16) {
        return f42896(var15, var16);
    }
    
    public static SubLObject f42887(final SubLObject var17, final SubLObject var6, final SubLObject var18) {
        PrintLow.format(var6, (SubLObject)module0704.$ic24$, f42881(var17));
        if (module0704.NIL != f42882(var17)) {
            PrintLow.format(var6, (SubLObject)module0704.$ic25$, f42882(var17));
        }
        if (module0704.NIL != f42883(var17)) {
            PrintLow.format(var6, (SubLObject)module0704.$ic25$, f42883(var17));
        }
        print_high.princ((SubLObject)module0704.$ic26$, var6);
        return var17;
    }
    
    public static SubLObject f42898(final SubLObject var19, final SubLObject var20, final SubLObject var21) {
        assert module0704.NIL != Types.stringp(var19) : var19;
        if (module0704.NIL != var20 && !module0704.areAssertionsDisabledFor(me) && module0704.NIL == Types.stringp(var20)) {
            throw new AssertionError(var20);
        }
        if (module0704.NIL != var21 && !module0704.areAssertionsDisabledFor(me) && module0704.NIL == f42899(var21)) {
            throw new AssertionError(var21);
        }
        final SubLObject var22 = f42895((SubLObject)module0704.UNPROVIDED);
        f42892(var22, var19);
        if (module0704.NIL != module0038.f2611(var20)) {
            f42893(var22, Strings.string_downcase(var20, (SubLObject)module0704.UNPROVIDED, (SubLObject)module0704.UNPROVIDED));
        }
        if (module0704.NIL != var21) {
            f42894(var22, (module0704.NIL != module0702.f42828(var21)) ? var21 : f42900(var21));
        }
        return var22;
    }
    
    public static SubLObject f42901(final SubLObject var19, SubLObject var23) {
        if (var23 == module0704.UNPROVIDED) {
            var23 = (SubLObject)module0704.$ic29$;
        }
        return f42898(var19, var23, module0699.f42541((SubLObject)module0704.$ic30$));
    }
    
    public static SubLObject f42902(final SubLObject var24) {
        assert module0704.NIL != Types.stringp(var24) : var24;
        final SubLObject var25 = Sequences.search((SubLObject)module0704.$ic26$, var24, Symbols.symbol_function((SubLObject)module0704.EQL), Symbols.symbol_function((SubLObject)module0704.IDENTITY), (SubLObject)module0704.ZERO_INTEGER, (SubLObject)module0704.NIL, (SubLObject)module0704.ZERO_INTEGER, (SubLObject)module0704.UNPROVIDED);
        final SubLObject var26 = module0048.f_1X(var25);
        final SubLObject var27 = Sequences.search((SubLObject)module0704.$ic31$, var24, Symbols.symbol_function((SubLObject)module0704.EQL), Symbols.symbol_function((SubLObject)module0704.IDENTITY), (SubLObject)module0704.ZERO_INTEGER, (SubLObject)module0704.NIL, var26, (SubLObject)module0704.UNPROVIDED);
        final SubLObject var28 = module0038.f2623(var24, var26, var27);
        final SubLObject var29 = module0038.f2623(var24, (SubLObject)module0704.ZERO_INTEGER, var26);
        final SubLObject var30 = module0590.f36089(var29, module0709.f43161((SubLObject)module0704.$ic32$), (SubLObject)module0704.UNPROVIDED);
        final SubLObject var31 = module0590.f36089(var29, (SubLObject)module0704.$ic33$, (SubLObject)module0704.UNPROVIDED);
        final SubLObject var32 = f42895((SubLObject)module0704.UNPROVIDED);
        f42892(var32, var28);
        if (module0704.NIL != module0038.f2611(var30)) {
            f42893(var32, var30);
        }
        if (module0704.NIL != var31) {
            f42894(var32, (module0704.NIL != module0702.f42828(var31)) ? var31 : f42900(var31));
        }
        return var32;
    }
    
    public static SubLObject f42899(final SubLObject var17) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0704.NIL != f42903(var17) || module0704.NIL != module0589.f35907(var17, (SubLObject)module0704.UNPROVIDED));
    }
    
    public static SubLObject f42903(final SubLObject var17) {
        return module0702.f42828(var17);
    }
    
    public static SubLObject f42904(final SubLObject var22) {
        final SubLObject var23 = f42883(var22);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0704.NIL != module0702.f42828(var23) && module0702.f42830(var23).equal(module0699.f42541((SubLObject)module0704.$ic30$)));
    }
    
    public static SubLObject f42905(final SubLObject var22) {
        final SubLObject var23 = f42883(var22);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0704.NIL != module0702.f42828(var23) && (module0702.f42830(var23).equal(module0699.f42541((SubLObject)module0704.$ic34$)) || module0702.f42830(var23).equal(module0699.f42541((SubLObject)module0704.$ic35$)) || module0702.f42830(var23).equal(module0699.f42541((SubLObject)module0704.$ic36$)) || module0702.f42830(var23).equal(module0699.f42541((SubLObject)module0704.$ic37$)) || module0702.f42830(var23).equal(module0699.f42541((SubLObject)module0704.$ic38$)) || module0702.f42830(var23).equal(module0699.f42541((SubLObject)module0704.$ic39$)) || module0702.f42830(var23).equal(module0699.f42541((SubLObject)module0704.$ic40$)) || module0702.f42830(var23).equal(module0699.f42541((SubLObject)module0704.$ic41$)) || module0702.f42830(var23).equal(module0699.f42541((SubLObject)module0704.$ic42$)) || module0702.f42830(var23).equal(module0699.f42541((SubLObject)module0704.$ic43$)) || module0702.f42830(var23).equal(module0699.f42541((SubLObject)module0704.$ic44$)) || module0702.f42830(var23).equal(module0699.f42541((SubLObject)module0704.$ic45$))));
    }
    
    public static SubLObject f42906(final SubLObject var22) {
        final SubLObject var23 = f42883(var22);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0704.NIL != module0702.f42828(var23) && (module0702.f42830(var23).equal(module0699.f42541((SubLObject)module0704.$ic46$)) || module0702.f42830(var23).equal(module0699.f42541((SubLObject)module0704.$ic47$)) || module0702.f42830(var23).equal(module0699.f42541((SubLObject)module0704.$ic48$))));
    }
    
    public static SubLObject f42907(final SubLObject var22) {
        final SubLObject var23 = f42883(var22);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0704.NIL != module0702.f42828(var23) && module0702.f42830(var23).equal(module0699.f42541((SubLObject)module0704.$ic49$)));
    }
    
    public static SubLObject f42900(final SubLObject var30) {
        assert module0704.NIL != Types.stringp(var30) : var30;
        return module0702.f42814(var30, (SubLObject)module0704.UNPROVIDED, (SubLObject)module0704.UNPROVIDED);
    }
    
    public static SubLObject f42881(final SubLObject var22) {
        assert module0704.NIL != f42888(var22) : var22;
        return f42889(var22);
    }
    
    public static SubLObject f42882(final SubLObject var22) {
        assert module0704.NIL != f42888(var22) : var22;
        return f42890(var22);
    }
    
    public static SubLObject f42883(final SubLObject var22) {
        assert module0704.NIL != f42888(var22) : var22;
        return f42891(var22);
    }
    
    public static SubLObject f42908(final SubLObject var17) {
        return f42909(var17);
    }
    
    public static SubLObject f42909(final SubLObject var22) {
        return Sxhash.sxhash(f42889(var22));
    }
    
    public static SubLObject f42910() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0704", "f42880", "S#46650", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0704", "f42884", "S#46918", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0704", "f42885", "S#46653", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0704", "f42886", "S#46919", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0704", "f42888", "S#46510", 1, 0, false);
        new $f42888$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0704", "f42889", "S#46920", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0704", "f42890", "S#46921", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0704", "f42891", "S#46922", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0704", "f42892", "S#46923", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0704", "f42893", "S#46924", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0704", "f42894", "S#46925", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0704", "f42895", "S#46926", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0704", "f42896", "S#46927", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0704", "f42897", "S#46928", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0704", "f42887", "S#46929", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0704", "f42898", "S#46646", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0704", "f42901", "S#46930", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0704", "f42902", "S#46931", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0704", "f42899", "S#46641", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0704", "f42903", "S#46932", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0704", "f42904", "S#46514", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0704", "f42905", "S#46515", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0704", "f42906", "S#46516", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0704", "f42907", "S#46517", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0704", "f42900", "S#46933", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0704", "f42881", "S#46513", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0704", "f42882", "S#46647", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0704", "f42883", "S#46512", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0704", "f42908", "S#46934", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0704", "f42909", "S#46935", 1, 0, false);
        return (SubLObject)module0704.NIL;
    }
    
    public static SubLObject f42911() {
        module0704.$g5516$ = SubLFiles.defconstant("S#46936", (SubLObject)module0704.$ic0$);
        return (SubLObject)module0704.NIL;
    }
    
    public static SubLObject f42912() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0704.$g5516$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0704.$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0704.$ic8$);
        Structures.def_csetf((SubLObject)module0704.$ic9$, (SubLObject)module0704.$ic10$);
        Structures.def_csetf((SubLObject)module0704.$ic11$, (SubLObject)module0704.$ic12$);
        Structures.def_csetf((SubLObject)module0704.$ic13$, (SubLObject)module0704.$ic14$);
        Equality.identity((SubLObject)module0704.$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0704.$g5516$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0704.$ic23$));
        module0012.f419((SubLObject)module0704.$ic6$);
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), module0704.$g5516$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0704.$ic50$));
        return (SubLObject)module0704.NIL;
    }
    
    public void declareFunctions() {
        f42910();
    }
    
    public void initializeVariables() {
        f42911();
    }
    
    public void runTopLevelForms() {
        f42912();
    }
    
    static {
        me = (SubLFile)new module0704();
        module0704.$g5516$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#46916", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#46510", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#46937", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#46938", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#46939", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("UTF8-LEXICAL-FORM"), (SubLObject)SubLObjectFactory.makeKeyword("LANGUAGE-TAG"), (SubLObject)SubLObjectFactory.makeKeyword("DATATYPE"));
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#46920", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#46921", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#46922", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#46923", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#46924", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#46925", "CYC"));
        $ic6$ = SubLObjectFactory.makeSymbol("S#46929", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#46919", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#46510", "CYC"));
        $ic9$ = SubLObjectFactory.makeSymbol("S#46920", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#46923", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#46921", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#46924", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#46922", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#46925", "CYC");
        $ic15$ = SubLObjectFactory.makeKeyword("UTF8-LEXICAL-FORM");
        $ic16$ = SubLObjectFactory.makeKeyword("LANGUAGE-TAG");
        $ic17$ = SubLObjectFactory.makeKeyword("DATATYPE");
        $ic18$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic19$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic20$ = SubLObjectFactory.makeSymbol("S#46926", "CYC");
        $ic21$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic22$ = SubLObjectFactory.makeKeyword("END");
        $ic23$ = SubLObjectFactory.makeSymbol("S#46928", "CYC");
        $ic24$ = SubLObjectFactory.makeString("<RDF-LITERAL ~S");
        $ic25$ = SubLObjectFactory.makeString(" ~S");
        $ic26$ = SubLObjectFactory.makeString(">");
        $ic27$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic28$ = SubLObjectFactory.makeSymbol("S#46641", "CYC");
        $ic29$ = SubLObjectFactory.makeString("en");
        $ic30$ = SubLObjectFactory.makeString("string");
        $ic31$ = SubLObjectFactory.makeString("</literal>");
        $ic32$ = SubLObjectFactory.makeString("lang");
        $ic33$ = SubLObjectFactory.makeString("datatype");
        $ic34$ = SubLObjectFactory.makeString("integer");
        $ic35$ = SubLObjectFactory.makeString("nonPositiveInteger");
        $ic36$ = SubLObjectFactory.makeString("negativeInteger");
        $ic37$ = SubLObjectFactory.makeString("long");
        $ic38$ = SubLObjectFactory.makeString("int");
        $ic39$ = SubLObjectFactory.makeString("short");
        $ic40$ = SubLObjectFactory.makeString("byte");
        $ic41$ = SubLObjectFactory.makeString("nonNegativeInteger");
        $ic42$ = SubLObjectFactory.makeString("unsignedLong");
        $ic43$ = SubLObjectFactory.makeString("unsignedShort");
        $ic44$ = SubLObjectFactory.makeString("unsignedByte");
        $ic45$ = SubLObjectFactory.makeString("positiveInteger");
        $ic46$ = SubLObjectFactory.makeString("double");
        $ic47$ = SubLObjectFactory.makeString("float");
        $ic48$ = SubLObjectFactory.makeString("decimal");
        $ic49$ = SubLObjectFactory.makeString("anyURI");
        $ic50$ = SubLObjectFactory.makeSymbol("S#46934", "CYC");
    }
    
    public static final class $sX46916_native extends SubLStructNative
    {
        public SubLObject $utf8_lexical_form;
        public SubLObject $language_tag;
        public SubLObject $datatype;
        private static final SubLStructDeclNative structDecl;
        
        public $sX46916_native() {
            this.$utf8_lexical_form = (SubLObject)CommonSymbols.NIL;
            this.$language_tag = (SubLObject)CommonSymbols.NIL;
            this.$datatype = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX46916_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$utf8_lexical_form;
        }
        
        public SubLObject getField3() {
            return this.$language_tag;
        }
        
        public SubLObject getField4() {
            return this.$datatype;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$utf8_lexical_form = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$language_tag = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$datatype = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX46916_native.class, module0704.$ic0$, module0704.$ic1$, module0704.$ic2$, module0704.$ic3$, new String[] { "$utf8_lexical_form", "$language_tag", "$datatype" }, module0704.$ic4$, module0704.$ic5$, module0704.$ic6$);
        }
    }
    
    public static final class $f42888$UnaryFunction extends UnaryFunction
    {
        public $f42888$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#46510"));
        }
        
        public SubLObject processItem(final SubLObject var7) {
            return module0704.f42888(var7);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0704.class
	Total time: 139 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/