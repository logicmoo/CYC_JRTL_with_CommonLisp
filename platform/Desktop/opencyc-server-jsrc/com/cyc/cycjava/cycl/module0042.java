package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0042 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0042";
    public static final String myFingerPrint = "14bf9cb315d3916ff5dceb5432c10726a6d202645bc60cf01952124ad17b49c2";
    private static SubLSymbol $g963$;
    private static SubLSymbol $g964$;
    public static SubLSymbol $g965$;
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
    private static final SubLString $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLInteger $ic29$;
    private static final SubLString $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLString $ic33$;
    
    public static SubLObject f3095(final SubLObject var1, final SubLObject var2) {
        f3096(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3097(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX4472_native.class) ? T : NIL);
    }
    
    public static SubLObject f3098(final SubLObject var1) {
        assert NIL != f3097(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f3099(final SubLObject var1) {
        assert NIL != f3097(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f3100(final SubLObject var1, final SubLObject var4) {
        assert NIL != f3097(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f3101(final SubLObject var1, final SubLObject var4) {
        assert NIL != f3097(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f3102(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX4472_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic13$)) {
                f3100(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic14$)) {
                f3101(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic15$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f3103(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic16$, (SubLObject)$ic17$, (SubLObject)TWO_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic18$, (SubLObject)$ic13$, f3098(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic18$, (SubLObject)$ic14$, f3099(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic19$, (SubLObject)$ic17$, (SubLObject)TWO_INTEGER);
        return var11;
    }
    
    public static SubLObject f3104(final SubLObject var11, final SubLObject var12) {
        return f3103(var11, var12);
    }
    
    public static SubLObject f3105(final SubLObject var2) {
        final SubLObject var3 = f3102((SubLObject)UNPROVIDED);
        f3100(var3, var2);
        f3101(var3, (SubLObject)NIL);
        return var3;
    }
    
    public static SubLObject f3096(final SubLObject var14, final SubLObject var2, final SubLObject var15) {
        PrintLow.format(var2, (SubLObject)$ic21$, f3098(var14), f3099(var14));
        return var14;
    }
    
    public static SubLObject f3106(final SubLObject var16, final SubLObject var17) {
        final SubLObject var18 = compatibility.open_binary(var16, var17);
        if (NIL == var18) {
            return (SubLObject)NIL;
        }
        return f3105(var18);
    }
    
    public static SubLObject f3107(final SubLObject var2) {
        if (NIL == f3097(var2)) {
            return (SubLObject)NIL;
        }
        final SubLObject var3 = f3098(var2);
        if (NIL != var3) {
            streams_high.close(var3, (SubLObject)UNPROVIDED);
            f3100(var2, (SubLObject)NIL);
        }
        return (SubLObject)$ic22$;
    }
    
    public static SubLObject f3108(final SubLObject var19, SubLObject var20) {
        if (var20 == UNPROVIDED) {
            var20 = f3105(StreamsLow.$standard_output$.getDynamicValue());
        }
        if (NIL == f3097(var20)) {
            Errors.error((SubLObject)$ic23$, var20);
        }
        assert NIL != module0039.f2987(var19) : var19;
        final SubLObject var21 = module0039.f3025(var19);
        final SubLObject var22 = f3098(var20);
        SubLObject var23;
        SubLObject var24;
        for (var23 = Sequences.length(var21), var24 = (SubLObject)NIL, var24 = (SubLObject)ZERO_INTEGER; var24.numL(var23); var24 = Numbers.add(var24, (SubLObject)ONE_INTEGER)) {
            streams_high.write_byte(Vectors.aref(var21, var24), var22);
        }
        return var19;
    }
    
    public static SubLObject f3109(final SubLObject var24, SubLObject var20, SubLObject var25, SubLObject var26) {
        if (var20 == UNPROVIDED) {
            var20 = f3105(StreamsLow.$standard_output$.getDynamicValue());
        }
        if (var25 == UNPROVIDED) {
            var25 = (SubLObject)ZERO_INTEGER;
        }
        if (var26 == UNPROVIDED) {
            var26 = (SubLObject)NIL;
        }
        if (NIL == f3097(var20)) {
            Errors.error((SubLObject)$ic23$, var20);
        }
        assert NIL != module0039.f2992(var24) : var24;
        if (NIL == var26) {
            var26 = Numbers.subtract(Sequences.length(module0039.f2993(var24)), (SubLObject)ONE_INTEGER);
        }
        assert NIL != Types.integerp(var26) : var26;
        assert NIL != Types.integerp(var25) : var25;
        final SubLObject var27 = f3098(var20);
        final SubLObject var28 = module0039.f2993(var24);
        final SubLObject var29 = module0039.f3018(var28, var25, var26);
        SubLObject var30;
        SubLObject var31;
        for (var30 = Sequences.length(var29), var31 = (SubLObject)NIL, var31 = (SubLObject)ZERO_INTEGER; var31.numL(var30); var31 = Numbers.add(var31, (SubLObject)ONE_INTEGER)) {
            streams_high.write_byte(Vectors.aref(var29, var31), var27);
        }
        return var24;
    }
    
    public static SubLObject f3110(final SubLObject var24, SubLObject var20, SubLObject var25, SubLObject var26) {
        if (var20 == UNPROVIDED) {
            var20 = f3105(StreamsLow.$standard_output$.getDynamicValue());
        }
        if (var25 == UNPROVIDED) {
            var25 = (SubLObject)ZERO_INTEGER;
        }
        if (var26 == UNPROVIDED) {
            var26 = (SubLObject)NIL;
        }
        if (NIL == f3097(var20)) {
            Errors.error((SubLObject)$ic23$, var20);
        }
        f3109(var24, var20, var25, var26);
        streams_high.write_byte($g963$.getGlobalValue(), f3098(var20));
        return var24;
    }
    
    public static SubLObject f3111(SubLObject var20, SubLObject var29, SubLObject var30, SubLObject var31) {
        if (var20 == UNPROVIDED) {
            var20 = f3105(StreamsLow.$standard_input$.getDynamicValue());
        }
        if (var29 == UNPROVIDED) {
            var29 = (SubLObject)T;
        }
        if (var30 == UNPROVIDED) {
            var30 = (SubLObject)NIL;
        }
        if (var31 == UNPROVIDED) {
            var31 = (SubLObject)NIL;
        }
        final SubLObject var32 = f3112(var20, var29, var30, var31);
        if (NIL == var29 && var30.equal(var32)) {
            return var30;
        }
        return module0039.f2986(var32);
    }
    
    public static SubLObject f3112(SubLObject var20, SubLObject var29, SubLObject var30, SubLObject var31) {
        if (var20 == UNPROVIDED) {
            var20 = f3105(StreamsLow.$standard_input$.getDynamicValue());
        }
        if (var29 == UNPROVIDED) {
            var29 = (SubLObject)T;
        }
        if (var30 == UNPROVIDED) {
            var30 = (SubLObject)NIL;
        }
        if (var31 == UNPROVIDED) {
            var31 = (SubLObject)NIL;
        }
        if (NIL == f3097(var20)) {
            Errors.error((SubLObject)$ic23$, var20);
        }
        final SubLObject var32 = f3098(var20);
        final SubLObject var33 = f3099(var20);
        if (NIL != var33) {
            f3101(var20, (SubLObject)NIL);
            return var33;
        }
        final SubLObject var34 = streams_high.read_byte(var32, var29, var30);
        if (var30.equal(var34)) {
            return var34;
        }
        final SubLObject var35 = module0039.f3027(var34);
        if (var35.isNegative()) {
            Errors.error((SubLObject)$ic27$, var32, var34);
            return var30;
        }
        if (var35.eql((SubLObject)ONE_INTEGER)) {
            return var34;
        }
        final SubLObject var36 = Vectors.make_vector(var35, (SubLObject)UNPROVIDED);
        Vectors.set_aref(var36, (SubLObject)ZERO_INTEGER, var34);
        SubLObject var37;
        SubLObject var38;
        SubLObject var39;
        for (var37 = Numbers.subtract(var35, (SubLObject)ONE_INTEGER), var38 = (SubLObject)NIL, var38 = (SubLObject)ZERO_INTEGER; var38.numL(var37); var38 = Numbers.add(var38, (SubLObject)ONE_INTEGER)) {
            var39 = streams_high.read_byte(var32, var29, var30);
            if (var30.equal(var39) && NIL != var29) {
                Errors.error((SubLObject)$ic28$, var32, var34);
                return var30;
            }
            Vectors.set_aref(var36, Numbers.add(var38, (SubLObject)ONE_INTEGER), var39);
        }
        final SubLObject var40 = module0039.f3022(var36, (SubLObject)ZERO_INTEGER);
        if (var40.isNegative()) {
            Errors.error((SubLObject)$ic27$, var32, var34);
        }
        return var40;
    }
    
    public static SubLObject f3113(SubLObject var20, SubLObject var29, SubLObject var30, SubLObject var31) {
        if (var20 == UNPROVIDED) {
            var20 = f3105(StreamsLow.$standard_input$.getDynamicValue());
        }
        if (var29 == UNPROVIDED) {
            var29 = (SubLObject)T;
        }
        if (var30 == UNPROVIDED) {
            var30 = (SubLObject)NIL;
        }
        if (var31 == UNPROVIDED) {
            var31 = (SubLObject)NIL;
        }
        final SubLThread var32 = SubLProcess.currentSubLThread();
        if (NIL == f3097(var20)) {
            Errors.error((SubLObject)$ic23$, var20);
        }
        SubLObject var33 = Vectors.make_vector((SubLObject)$ic29$, (SubLObject)UNPROVIDED);
        SubLObject var34 = (SubLObject)ZERO_INTEGER;
        SubLObject var35;
        SubLObject var36;
        SubLObject var37;
        SubLObject var38;
        SubLObject var39;
        for (var35 = var30, var35 = f3112(var20, var29, var30, var31); !var35.equal(var30) && NIL != Numbers.numNE(var35, $g963$.getGlobalValue()) && NIL != Numbers.numNE(var35, $g964$.getGlobalValue()); var35 = f3112(var20, var29, var30, var31)) {
            if (var34.numGE(Sequences.length(var33))) {
                var36 = Numbers.add(Sequences.length(var33), (SubLObject)$ic29$);
                var37 = Vectors.make_vector(var36, (SubLObject)UNPROVIDED);
                for (var38 = Sequences.length(var33), var39 = (SubLObject)NIL, var39 = (SubLObject)ZERO_INTEGER; var39.numL(var38); var39 = Numbers.add(var39, (SubLObject)ONE_INTEGER)) {
                    Vectors.set_aref(var37, var39, Vectors.aref(var33, var39));
                }
                var33 = var37;
            }
            Vectors.set_aref(var33, var34, var35);
            var34 = Numbers.add(var34, (SubLObject)ONE_INTEGER);
        }
        if (var35.equal(var30)) {
            if (var34.isZero()) {
                if (NIL == var29) {
                    return var30;
                }
                Errors.error((SubLObject)$ic30$, var20);
            }
        }
        else if (var35.numE($g963$.getGlobalValue())) {
            SubLObject var40 = (SubLObject)NIL;
            try {
                var32.throwStack.push($ic31$);
                final SubLObject var41 = Errors.$error_handler$.currentBinding(var32);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic32$), var32);
                    try {
                        final SubLObject var42 = f3112(var20, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        if (!var42.numE($g964$.getGlobalValue())) {
                            f3101(var20, var42);
                        }
                    }
                    catch (Throwable var43) {
                        Errors.handleThrowable(var43, (SubLObject)NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var41, var32);
                }
            }
            catch (Throwable var44) {
                var40 = Errors.handleThrowable(var44, (SubLObject)$ic31$);
            }
            finally {
                var32.throwStack.pop();
            }
        }
        else if (var35.numE($g964$.getGlobalValue())) {
            SubLObject var45 = (SubLObject)NIL;
            try {
                var32.throwStack.push($ic31$);
                final SubLObject var41 = Errors.$error_handler$.currentBinding(var32);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic32$), var32);
                    try {
                        final SubLObject var42 = f3112(var20, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        if (!var42.numE($g963$.getGlobalValue())) {
                            f3101(var20, var42);
                        }
                    }
                    catch (Throwable var43) {
                        Errors.handleThrowable(var43, (SubLObject)NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var41, var32);
                }
            }
            catch (Throwable var44) {
                var45 = Errors.handleThrowable(var44, (SubLObject)$ic31$);
            }
            finally {
                var32.throwStack.pop();
            }
        }
        else {
            Errors.error((SubLObject)$ic33$, var20);
        }
        return module0039.f2998(Sequences.subseq(var33, (SubLObject)ZERO_INTEGER, var34));
    }
    
    public static SubLObject f3114() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0042", "f3095", "S#4474", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0042", "f3097", "S#4473", 1, 0, false);
        new $f3097$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0042", "f3098", "S#4475", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0042", "f3099", "S#4476", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0042", "f3100", "S#4477", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0042", "f3101", "S#4478", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0042", "f3102", "S#4479", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0042", "f3103", "S#4480", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0042", "f3104", "S#4481", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0042", "f3105", "S#4482", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0042", "f3096", "S#4483", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0042", "f3106", "S#4484", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0042", "f3107", "S#4485", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0042", "f3108", "S#4486", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0042", "f3109", "S#4487", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0042", "f3110", "S#4488", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0042", "f3111", "S#4489", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0042", "f3112", "S#4490", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0042", "f3113", "S#4491", 0, 4, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3115() {
        $g963$ = SubLFiles.defconstant("S#4492", (SubLObject)TEN_INTEGER);
        $g964$ = SubLFiles.defconstant("S#4493", (SubLObject)THIRTEEN_INTEGER);
        $g965$ = SubLFiles.defconstant("S#4494", (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3116() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g965$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic8$);
        Structures.def_csetf((SubLObject)$ic9$, (SubLObject)$ic10$);
        Structures.def_csetf((SubLObject)$ic11$, (SubLObject)$ic12$);
        Equality.identity((SubLObject)$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g965$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic20$));
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f3114();
    }
    
    public void initializeVariables() {
        f3115();
    }
    
    public void runTopLevelForms() {
        f3116();
    }
    
    static {
        me = (SubLFile)new module0042();
        $g963$ = null;
        $g964$ = null;
        $g965$ = null;
        $ic0$ = makeSymbol("S#4472", "CYC");
        $ic1$ = makeSymbol("S#4473", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)makeSymbol("STREAM"), (SubLObject)makeSymbol("S#4495", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)makeKeyword("STREAM"), (SubLObject)makeKeyword("CACHE"));
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("S#4475", "CYC"), (SubLObject)makeSymbol("S#4476", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#4477", "CYC"), (SubLObject)makeSymbol("S#4478", "CYC"));
        $ic6$ = makeSymbol("S#4483", "CYC");
        $ic7$ = makeSymbol("S#4474", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#4473", "CYC"));
        $ic9$ = makeSymbol("S#4475", "CYC");
        $ic10$ = makeSymbol("S#4477", "CYC");
        $ic11$ = makeSymbol("S#4476", "CYC");
        $ic12$ = makeSymbol("S#4478", "CYC");
        $ic13$ = makeKeyword("STREAM");
        $ic14$ = makeKeyword("CACHE");
        $ic15$ = makeString("Invalid slot ~S for construction function");
        $ic16$ = makeKeyword("BEGIN");
        $ic17$ = makeSymbol("S#4479", "CYC");
        $ic18$ = makeKeyword("SLOT");
        $ic19$ = makeKeyword("END");
        $ic20$ = makeSymbol("S#4481", "CYC");
        $ic21$ = makeString("#<utf8-stream ~s cache: ~s>");
        $ic22$ = makeKeyword("CLOSED");
        $ic23$ = makeString("Invalid utf8 stream: ~s~%");
        $ic24$ = makeSymbol("S#4382", "CYC");
        $ic25$ = makeSymbol("S#4340", "CYC");
        $ic26$ = makeSymbol("INTEGERP");
        $ic27$ = makeString("Invalid Unicode character in Stream ~s, its first byte was ~x~%");
        $ic28$ = makeString("Invalid Unicode character in Stream ~s, Stream EOF in the middle of unicode character, its first byte was ~x~%");
        $ic29$ = makeInteger(256);
        $ic30$ = makeString("EOF in Unicode stream: ~s~%");
        $ic31$ = makeKeyword("IGNORE-ERRORS-TARGET");
        $ic32$ = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic33$ = makeString("Internal Error in Unicode stream: ~s~%");
    }
    
    public static final class $sX4472_native extends SubLStructNative
    {
        public SubLObject $stream;
        public SubLObject $cache;
        private static final SubLStructDeclNative structDecl;
        
        public $sX4472_native() {
            this.$stream = (SubLObject)CommonSymbols.NIL;
            this.$cache = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX4472_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$stream;
        }
        
        public SubLObject getField3() {
            return this.$cache;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$stream = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$cache = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX4472_native.class, $ic0$, $ic1$, $ic2$, $ic3$, new String[] { "$stream", "$cache" }, $ic4$, $ic5$, $ic6$);
        }
    }
    
    public static final class $f3097$UnaryFunction extends UnaryFunction
    {
        public $f3097$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#4473"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f3097(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 145 ms
	
	Decompiled with Procyon 0.5.32.
*/