package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0086 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0086";
    public static final String myFingerPrint = "daa21d8cd23bf8098ebf592338c37940844ef721fbdf7f0bed361f074e99e2de";
    public static SubLSymbol $g1175$;
    public static SubLSymbol $g1176$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
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
    private static final SubLString $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLString $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLString $ic40$;
    private static final SubLString $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLString $ic50$;
    private static final SubLString $ic51$;
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    
    public static SubLObject f5906(final SubLObject var1, final SubLObject var2) {
        f5907(var1, var2, (SubLObject)module0086.ZERO_INTEGER);
        return (SubLObject)module0086.NIL;
    }
    
    public static SubLObject f5908(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX7546_native.class) ? module0086.T : module0086.NIL);
    }
    
    public static SubLObject f5909(final SubLObject var1) {
        assert module0086.NIL != f5908(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f5910(final SubLObject var1) {
        assert module0086.NIL != f5908(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f5911(final SubLObject var1) {
        assert module0086.NIL != f5908(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f5912(final SubLObject var1) {
        assert module0086.NIL != f5908(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f5913(final SubLObject var1) {
        assert module0086.NIL != f5908(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f5914(final SubLObject var1) {
        assert module0086.NIL != f5908(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f5915(final SubLObject var1, final SubLObject var4) {
        assert module0086.NIL != f5908(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f5916(final SubLObject var1, final SubLObject var4) {
        assert module0086.NIL != f5908(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f5917(final SubLObject var1, final SubLObject var4) {
        assert module0086.NIL != f5908(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f5918(final SubLObject var1, final SubLObject var4) {
        assert module0086.NIL != f5908(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f5919(final SubLObject var1, final SubLObject var4) {
        assert module0086.NIL != f5908(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f5920(final SubLObject var1, final SubLObject var4) {
        assert module0086.NIL != f5908(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f5921(SubLObject var5) {
        if (var5 == module0086.UNPROVIDED) {
            var5 = (SubLObject)module0086.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX7546_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0086.NIL, var7 = var5; module0086.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0086.$ic22$)) {
                f5915(var6, var9);
            }
            else if (var10.eql((SubLObject)module0086.$ic23$)) {
                f5916(var6, var9);
            }
            else if (var10.eql((SubLObject)module0086.$ic24$)) {
                f5917(var6, var9);
            }
            else if (var10.eql((SubLObject)module0086.$ic25$)) {
                f5918(var6, var9);
            }
            else if (var10.eql((SubLObject)module0086.$ic26$)) {
                f5919(var6, var9);
            }
            else if (var10.eql((SubLObject)module0086.$ic27$)) {
                f5920(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0086.$ic28$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f5922(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0086.$ic29$, (SubLObject)module0086.$ic30$, (SubLObject)module0086.SIX_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0086.$ic31$, (SubLObject)module0086.$ic22$, f5909(var11));
        Functions.funcall(var12, var11, (SubLObject)module0086.$ic31$, (SubLObject)module0086.$ic23$, f5910(var11));
        Functions.funcall(var12, var11, (SubLObject)module0086.$ic31$, (SubLObject)module0086.$ic24$, f5911(var11));
        Functions.funcall(var12, var11, (SubLObject)module0086.$ic31$, (SubLObject)module0086.$ic25$, f5912(var11));
        Functions.funcall(var12, var11, (SubLObject)module0086.$ic31$, (SubLObject)module0086.$ic26$, f5913(var11));
        Functions.funcall(var12, var11, (SubLObject)module0086.$ic31$, (SubLObject)module0086.$ic27$, f5914(var11));
        Functions.funcall(var12, var11, (SubLObject)module0086.$ic32$, (SubLObject)module0086.$ic30$, (SubLObject)module0086.SIX_INTEGER);
        return var11;
    }
    
    public static SubLObject f5923(final SubLObject var11, final SubLObject var12) {
        return f5922(var11, var12);
    }
    
    public static SubLObject f5907(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (module0086.NIL != print_high.$print_readably$.getDynamicValue(var15)) {
            print_high.print_not_readable(var13, var2);
        }
        else {
            streams_high.write_string((SubLObject)module0086.$ic34$, var2, (SubLObject)module0086.UNPROVIDED, (SubLObject)module0086.UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var13), new SubLObject[] { module0086.$ic35$, var2 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            streams_high.write_string((SubLObject)module0086.$ic36$, var2, (SubLObject)module0086.UNPROVIDED, (SubLObject)module0086.UNPROVIDED);
            print_high.princ(f5912(var13), var2);
            streams_high.write_string((SubLObject)module0086.$ic37$, var2, (SubLObject)module0086.UNPROVIDED, (SubLObject)module0086.UNPROVIDED);
            print_high.princ(f5909(var13), var2);
            streams_high.write_string((SubLObject)module0086.$ic38$, var2, (SubLObject)module0086.UNPROVIDED, (SubLObject)module0086.UNPROVIDED);
            print_high.princ(f5911(var13), var2);
            streams_high.write_string((SubLObject)module0086.$ic39$, var2, (SubLObject)module0086.UNPROVIDED, (SubLObject)module0086.UNPROVIDED);
            print_high.princ(f5910(var13), var2);
            streams_high.write_string((SubLObject)module0086.$ic40$, var2, (SubLObject)module0086.UNPROVIDED, (SubLObject)module0086.UNPROVIDED);
            print_high.princ(f5910(var13), var2);
            streams_high.write_string((SubLObject)module0086.$ic41$, var2, (SubLObject)module0086.UNPROVIDED, (SubLObject)module0086.UNPROVIDED);
            print_high.princ(f5914(var13), var2);
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            PrintLow.write(Equality.pointer(var13), new SubLObject[] { module0086.$ic35$, var2, module0086.$ic42$, module0086.SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var2);
        }
        return var13;
    }
    
    public static SubLObject f5924(final SubLObject var20, final SubLObject var21, final SubLObject var22, final SubLObject var23, final SubLObject var24, SubLObject var25) {
        if (var25 == module0086.UNPROVIDED) {
            var25 = (SubLObject)module0086.NIL;
        }
        final SubLObject var26 = f5921((SubLObject)module0086.UNPROVIDED);
        f5918(var26, var20);
        f5915(var26, var21);
        f5917(var26, var22);
        f5916(var26, var23);
        f5919(var26, var24);
        f5920(var26, var25);
        return var26;
    }
    
    public static SubLObject f5925(final SubLObject var21, final SubLObject var22, final SubLObject var23, SubLObject var25) {
        if (var25 == module0086.UNPROVIDED) {
            var25 = (SubLObject)module0086.NIL;
        }
        return f5924(module0086.$g1175$.getGlobalValue(), var21, var22, var23, module0086.$g1175$.getGlobalValue(), var25);
    }
    
    public static SubLObject f5926(final SubLObject var27) {
        return Functions.funcall(f5912(var27), var27);
    }
    
    public static SubLObject f5927(final SubLObject var27) {
        return Functions.funcall(f5913(var27), var27);
    }
    
    public static SubLObject f5928(final SubLObject var27, final SubLObject var28) {
        return Functions.funcall(f5911(var27), var27, var28);
    }
    
    public static SubLObject f5929(final SubLObject var27, final SubLObject var29) {
        return Functions.funcall(f5909(var27), var27, var29);
    }
    
    public static SubLObject f5930(final SubLObject var27, final SubLObject var29) {
        return Functions.funcall(f5910(var27), var27, var29);
    }
    
    public static SubLObject f5931(final SubLObject var27, final SubLObject var30) {
        final SubLObject var31 = f5932(var27);
        f5920(var27, var30);
        return var31;
    }
    
    public static SubLObject f5932(final SubLObject var27) {
        return f5914(var27);
    }
    
    public static SubLObject f5933() {
        return f5924((SubLObject)module0086.$ic43$, (SubLObject)module0086.$ic44$, (SubLObject)module0086.$ic45$, (SubLObject)module0086.$ic46$, (SubLObject)module0086.$ic47$, (SubLObject)module0086.UNPROVIDED);
    }
    
    public static SubLObject f5934(final SubLObject var32) {
        return PrintLow.format((SubLObject)module0086.T, (SubLObject)module0086.$ic48$, var32);
    }
    
    public static SubLObject f5935(final SubLObject var32) {
        return PrintLow.format((SubLObject)module0086.T, (SubLObject)module0086.$ic49$, var32);
    }
    
    public static SubLObject f5936(final SubLObject var32, final SubLObject var29) {
        return PrintLow.format((SubLObject)module0086.T, (SubLObject)module0086.$ic50$, var29);
    }
    
    public static SubLObject f5937(final SubLObject var32, final SubLObject var29) {
        return PrintLow.format((SubLObject)module0086.T, (SubLObject)module0086.$ic51$, var29);
    }
    
    public static SubLObject f5938(final SubLObject var32, final SubLObject var28) {
        return PrintLow.format((SubLObject)module0086.T, (SubLObject)module0086.$ic52$, var28, var32);
    }
    
    public static SubLObject f5939() {
        return f5925(module0086.$g1175$.getGlobalValue(), module0086.$g1175$.getGlobalValue(), module0086.$g1175$.getGlobalValue(), (SubLObject)module0086.UNPROVIDED);
    }
    
    public static SubLObject f5940(final SubLObject var33, SubLObject var25) {
        if (var25 == module0086.UNPROVIDED) {
            var25 = (SubLObject)module0086.NIL;
        }
        return f5925(module0086.$g1175$.getGlobalValue(), var33, module0086.$g1175$.getGlobalValue(), var25);
    }
    
    public static SubLObject f5941(final SubLObject var32, final SubLObject var28) {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        final SubLObject var34 = conses_high.second(var28);
        final SubLObject var35 = f5932(var32);
        final SubLObject var36 = (module0086.NIL == var35) ? StreamsLow.$standard_output$.getDynamicValue(var33) : var35;
        print_high.prin1(var34, var36);
        streams_high.terpri(var36);
        return var28;
    }
    
    public static SubLObject f5942(final SubLObject var32, final SubLObject var28) {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        final SubLObject var34 = conses_high.second(var28);
        final SubLObject var35 = f5932(var32);
        if (module0086.NIL == Errors.$ignore_mustsP$.getDynamicValue(var33) && module0086.NIL == module0077.f5302(var35)) {
            Errors.error((SubLObject)module0086.$ic53$);
        }
        module0077.f5327(var34, var35);
        return var28;
    }
    
    public static SubLObject f5943(final SubLObject var32, final SubLObject var28) {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        final SubLObject var34 = conses_high.second(var28);
        final SubLObject var35 = f5932(var32);
        if (module0086.NIL == Errors.$ignore_mustsP$.getDynamicValue(var33) && module0086.NIL == module0077.f5302(var35)) {
            Errors.error((SubLObject)module0086.$ic54$);
        }
        module0077.f5326(var34, var35);
        return var28;
    }
    
    public static SubLObject f5944() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0086", "f5906", "S#7548", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0086", "f5908", "S#7547", 1, 0, false);
        new $f5908$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0086", "f5909", "S#7549", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0086", "f5910", "S#7550", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0086", "f5911", "S#7551", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0086", "f5912", "S#7552", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0086", "f5913", "S#7553", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0086", "f5914", "S#7554", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0086", "f5915", "S#7555", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0086", "f5916", "S#7556", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0086", "f5917", "S#7557", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0086", "f5918", "S#7558", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0086", "f5919", "S#7559", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0086", "f5920", "S#7560", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0086", "f5921", "S#7561", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0086", "f5922", "S#7562", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0086", "f5923", "S#7563", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0086", "f5907", "S#7564", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0086", "f5924", "S#7565", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0086", "f5925", "S#7566", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0086", "f5926", "S#7567", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0086", "f5927", "S#7568", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0086", "f5928", "S#7569", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0086", "f5929", "S#7570", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0086", "f5930", "S#7571", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0086", "f5931", "S#7572", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0086", "f5932", "S#7573", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0086", "f5933", "S#7574", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0086", "f5934", "S#7575", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0086", "f5935", "S#7576", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0086", "f5936", "S#7577", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0086", "f5937", "S#7578", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0086", "f5938", "S#7579", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0086", "f5939", "S#7580", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0086", "f5940", "S#7581", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0086", "f5941", "S#7582", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0086", "f5942", "S#7583", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0086", "f5943", "S#7584", 2, 0, false);
        return (SubLObject)module0086.NIL;
    }
    
    public static SubLObject f5945() {
        module0086.$g1175$ = SubLFiles.deflexical("S#7585", Symbols.symbol_function((SubLObject)module0086.$ic0$));
        module0086.$g1176$ = SubLFiles.defconstant("S#7586", (SubLObject)module0086.$ic1$);
        return (SubLObject)module0086.NIL;
    }
    
    public static SubLObject f5946() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0086.$g1176$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0086.$ic8$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0086.$ic9$);
        Structures.def_csetf((SubLObject)module0086.$ic10$, (SubLObject)module0086.$ic11$);
        Structures.def_csetf((SubLObject)module0086.$ic12$, (SubLObject)module0086.$ic13$);
        Structures.def_csetf((SubLObject)module0086.$ic14$, (SubLObject)module0086.$ic15$);
        Structures.def_csetf((SubLObject)module0086.$ic16$, (SubLObject)module0086.$ic17$);
        Structures.def_csetf((SubLObject)module0086.$ic18$, (SubLObject)module0086.$ic19$);
        Structures.def_csetf((SubLObject)module0086.$ic20$, (SubLObject)module0086.$ic21$);
        Equality.identity((SubLObject)module0086.$ic1$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0086.$g1176$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0086.$ic33$));
        return (SubLObject)module0086.NIL;
    }
    
    public void declareFunctions() {
        f5944();
    }
    
    public void initializeVariables() {
        f5945();
    }
    
    public void runTopLevelForms() {
        f5946();
    }
    
    static {
        me = (SubLFile)new module0086();
        module0086.$g1175$ = null;
        module0086.$g1176$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("FALSE");
        $ic1$ = SubLObjectFactory.makeSymbol("S#7546", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("S#7547", "CYC");
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#7587", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#7588", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#7589", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#7590", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#7591", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5251", "CYC"));
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BEGIN-PATH-FN"), (SubLObject)SubLObjectFactory.makeKeyword("END-PATH-FN"), (SubLObject)SubLObjectFactory.makeKeyword("ACCEPT-NODE-FN"), (SubLObject)SubLObjectFactory.makeKeyword("BEGIN-VISIT-FN"), (SubLObject)SubLObjectFactory.makeKeyword("END-VISIT-FN"), (SubLObject)SubLObjectFactory.makeKeyword("PARAM"));
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#7549", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#7550", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#7551", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#7552", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#7553", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#7554", "CYC"));
        $ic6$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#7555", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#7556", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#7557", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#7558", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#7559", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#7560", "CYC"));
        $ic7$ = SubLObjectFactory.makeSymbol("S#7564", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("S#7548", "CYC");
        $ic9$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#7547", "CYC"));
        $ic10$ = SubLObjectFactory.makeSymbol("S#7549", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#7555", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#7550", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#7556", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#7551", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#7557", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#7552", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#7558", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#7553", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#7559", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#7554", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#7560", "CYC");
        $ic22$ = SubLObjectFactory.makeKeyword("BEGIN-PATH-FN");
        $ic23$ = SubLObjectFactory.makeKeyword("END-PATH-FN");
        $ic24$ = SubLObjectFactory.makeKeyword("ACCEPT-NODE-FN");
        $ic25$ = SubLObjectFactory.makeKeyword("BEGIN-VISIT-FN");
        $ic26$ = SubLObjectFactory.makeKeyword("END-VISIT-FN");
        $ic27$ = SubLObjectFactory.makeKeyword("PARAM");
        $ic28$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic29$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic30$ = SubLObjectFactory.makeSymbol("S#7561", "CYC");
        $ic31$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic32$ = SubLObjectFactory.makeKeyword("END");
        $ic33$ = SubLObjectFactory.makeSymbol("S#7563", "CYC");
        $ic34$ = SubLObjectFactory.makeString("#<");
        $ic35$ = SubLObjectFactory.makeKeyword("STREAM");
        $ic36$ = SubLObjectFactory.makeString(" (Visit: ");
        $ic37$ = SubLObjectFactory.makeString(" (Path: ");
        $ic38$ = SubLObjectFactory.makeString(" Node: ");
        $ic39$ = SubLObjectFactory.makeString(" ");
        $ic40$ = SubLObjectFactory.makeString(") ");
        $ic41$ = SubLObjectFactory.makeString(") Param: ");
        $ic42$ = SubLObjectFactory.makeKeyword("BASE");
        $ic43$ = SubLObjectFactory.makeSymbol("S#7575", "CYC");
        $ic44$ = SubLObjectFactory.makeSymbol("S#7577", "CYC");
        $ic45$ = SubLObjectFactory.makeSymbol("S#7579", "CYC");
        $ic46$ = SubLObjectFactory.makeSymbol("S#7578", "CYC");
        $ic47$ = SubLObjectFactory.makeSymbol("S#7576", "CYC");
        $ic48$ = SubLObjectFactory.makeString("~&Begin visit of ~A.~%");
        $ic49$ = SubLObjectFactory.makeString("~&End visit of ~A.~%");
        $ic50$ = SubLObjectFactory.makeString("~&Begin path ~A~%");
        $ic51$ = SubLObjectFactory.makeString("~&End path ~A~%");
        $ic52$ = SubLObjectFactory.makeString("~&Node ~A~%");
        $ic53$ = SubLObjectFactory.makeString("CHECKING-OFF-VISITED-NODES-FN expects a SET-P of expected paths as visitor parameter.");
        $ic54$ = SubLObjectFactory.makeString("GATHER-VISITED-NODE-PATHS-FN expects a SET-P of expected paths as visitor paramter.");
    }
    
    public static final class $sX7546_native extends SubLStructNative
    {
        public SubLObject $begin_path_fn;
        public SubLObject $end_path_fn;
        public SubLObject $accept_node_fn;
        public SubLObject $begin_visit_fn;
        public SubLObject $end_visit_fn;
        public SubLObject $param;
        private static final SubLStructDeclNative structDecl;
        
        public $sX7546_native() {
            this.$begin_path_fn = (SubLObject)CommonSymbols.NIL;
            this.$end_path_fn = (SubLObject)CommonSymbols.NIL;
            this.$accept_node_fn = (SubLObject)CommonSymbols.NIL;
            this.$begin_visit_fn = (SubLObject)CommonSymbols.NIL;
            this.$end_visit_fn = (SubLObject)CommonSymbols.NIL;
            this.$param = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX7546_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$begin_path_fn;
        }
        
        public SubLObject getField3() {
            return this.$end_path_fn;
        }
        
        public SubLObject getField4() {
            return this.$accept_node_fn;
        }
        
        public SubLObject getField5() {
            return this.$begin_visit_fn;
        }
        
        public SubLObject getField6() {
            return this.$end_visit_fn;
        }
        
        public SubLObject getField7() {
            return this.$param;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$begin_path_fn = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$end_path_fn = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$accept_node_fn = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$begin_visit_fn = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$end_visit_fn = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$param = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX7546_native.class, module0086.$ic1$, module0086.$ic2$, module0086.$ic3$, module0086.$ic4$, new String[] { "$begin_path_fn", "$end_path_fn", "$accept_node_fn", "$begin_visit_fn", "$end_visit_fn", "$param" }, module0086.$ic5$, module0086.$ic6$, module0086.$ic7$);
        }
    }
    
    public static final class $f5908$UnaryFunction extends UnaryFunction
    {
        public $f5908$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#7547"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0086.f5908(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0086.class
	Total time: 107 ms
	
	Decompiled with Procyon 0.5.32.
*/