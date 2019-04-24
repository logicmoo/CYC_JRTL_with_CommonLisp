package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0068 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0068";
    public static final String myFingerPrint = "3d54b6ea90ca9e6159c98e940f382774f658e839e6c38cde88039632a7e38712";
    private static SubLSymbol $g1090$;
    private static SubLSymbol $g1091$;
    private static SubLSymbol $g1092$;
    private static SubLSymbol $g1093$;
    private static SubLSymbol $g1094$;
    private static SubLSymbol $g1095$;
    public static SubLSymbol $g1096$;
    public static SubLSymbol $g1097$;
    public static SubLSymbol $g1098$;
    private static SubLSymbol $g1099$;
    private static SubLSymbol $g1100$;
    private static final SubLInteger $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLInteger $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLInteger $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLInteger $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLString $ic10$;
    private static final SubLString $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLList $ic20$;
    private static final SubLList $ic21$;
    private static final SubLList $ic22$;
    private static final SubLList $ic23$;
    private static final SubLList $ic24$;
    private static final SubLList $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLList $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLList $ic37$;
    private static final SubLList $ic38$;
    private static final SubLString $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    
    public static SubLObject f4908() {
        return module0067.f4880(Symbols.symbol_function((SubLObject)module0068.EQ), (SubLObject)module0068.UNPROVIDED);
    }
    
    public static SubLObject f4909(final SubLObject var1) {
        final SubLObject var2 = f4908();
        return module0084.f5762(module0068.$g1094$.getGlobalValue(), var1, var2);
    }
    
    public static SubLObject f4910(final SubLObject var1) {
        return module0084.f5761(module0068.$g1094$.getGlobalValue(), var1);
    }
    
    public static SubLObject f4911(final SubLObject var1) {
        return module0067.f4885(module0068.$g1094$.getGlobalValue(), var1, (SubLObject)module0068.UNPROVIDED).first();
    }
    
    public static SubLObject f4912(final SubLObject var1, final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = f4911(var1);
        return module0067.f4886(var5, var3, var4);
    }
    
    public static SubLObject f4913(final SubLObject var1, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = f4911(var1);
        final SubLObject var6 = module0067.f4885(var5, var3, module0068.$g1095$.getGlobalValue());
        if (module0068.NIL == Errors.$ignore_mustsP$.getDynamicValue(var4) && var6.eql(module0068.$g1095$.getGlobalValue())) {
            Errors.error((SubLObject)module0068.$ic11$, var3, var5);
        }
        return var6;
    }
    
    public static SubLObject f4914(final SubLObject var1) {
        f4909(var1);
        return module0021.f1060(var1, (SubLObject)module0068.UNPROVIDED, (SubLObject)module0068.UNPROVIDED);
    }
    
    public static SubLObject f4915(final SubLObject var1) {
        final SubLObject var2 = module0021.f1090(var1);
        final SubLObject var3 = module0021.f1090(var1);
        f4912(var1, var2, var3);
        return module0021.f1060(var1, (SubLObject)module0068.UNPROVIDED, (SubLObject)module0068.UNPROVIDED);
    }
    
    public static SubLObject f4916(final SubLObject var1) {
        final SubLObject var2 = module0021.f1090(var1);
        final SubLObject var3 = f4913(var1, var2);
        return var3;
    }
    
    public static SubLObject f4917(final SubLObject var1) {
        f4910(var1);
        return module0021.f1060(var1, (SubLObject)module0068.UNPROVIDED, (SubLObject)module0068.UNPROVIDED);
    }
    
    public static SubLObject f4918(final SubLObject var7, final SubLObject var8) {
        SubLObject var10;
        final SubLObject var9 = var10 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)module0068.$ic12$);
        final SubLObject var11 = var10.rest();
        var10 = var10.first();
        SubLObject var12 = (SubLObject)module0068.NIL;
        SubLObject var13 = (SubLObject)module0068.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)module0068.$ic12$);
        var12 = var10.first();
        var10 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)module0068.$ic12$);
        var13 = var10.first();
        var10 = var10.rest();
        if (module0068.NIL == var10) {
            final SubLObject var14;
            var10 = (var14 = var11);
            return (SubLObject)ConsesLow.listS((SubLObject)module0068.$ic13$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0068.$ic14$, var13), (SubLObject)module0068.$ic15$, (SubLObject)ConsesLow.list((SubLObject)module0068.$ic16$, (SubLObject)ConsesLow.list((SubLObject)module0068.$ic17$, var12))), (SubLObject)ConsesLow.list((SubLObject)module0068.$ic18$, var12), ConsesLow.append(var14, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0068.$ic19$, var12))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var9, (SubLObject)module0068.$ic12$);
        return (SubLObject)module0068.NIL;
    }
    
    public static SubLObject f4919(final SubLObject var7, final SubLObject var8) {
        SubLObject var10;
        final SubLObject var9 = var10 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)module0068.$ic20$);
        final SubLObject var11 = var10.rest();
        var10 = var10.first();
        SubLObject var12 = (SubLObject)module0068.NIL;
        SubLObject var13 = (SubLObject)module0068.NIL;
        SubLObject var14 = (SubLObject)module0068.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)module0068.$ic20$);
        var12 = var10.first();
        var10 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)module0068.$ic20$);
        var13 = var10.first();
        var10 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)module0068.$ic20$);
        var14 = var10.first();
        var10 = var10.rest();
        if (module0068.NIL == var10) {
            final SubLObject var15;
            var10 = (var15 = var11);
            return (SubLObject)ConsesLow.list((SubLObject)module0068.$ic13$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0068.$ic14$, var14), (SubLObject)module0068.$ic15$, (SubLObject)ConsesLow.list((SubLObject)module0068.$ic16$, (SubLObject)ConsesLow.list((SubLObject)module0068.$ic17$, var13))), (SubLObject)module0068.$ic21$, (SubLObject)ConsesLow.listS((SubLObject)module0068.$ic13$, (SubLObject)ConsesLow.list((SubLObject)module0068.$ic22$, reader.bq_cons(var12, (SubLObject)module0068.$ic23$)), ConsesLow.append(var15, (SubLObject)module0068.$ic24$)), (SubLObject)ConsesLow.listS((SubLObject)module0068.$ic13$, reader.bq_cons((SubLObject)ConsesLow.list(var12, var13), (SubLObject)module0068.$ic25$), (SubLObject)ConsesLow.list((SubLObject)module0068.$ic26$, var12), ConsesLow.append(var15, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0068.$ic27$, var12)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var9, (SubLObject)module0068.$ic20$);
        return (SubLObject)module0068.NIL;
    }
    
    public static SubLObject f4920(final SubLObject var1) {
        return module0067.f4880(Symbols.symbol_function((SubLObject)module0068.EQUAL), (SubLObject)module0068.UNPROVIDED);
    }
    
    public static SubLObject f4921(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        f4922(module0068.$g1096$.getDynamicValue(var2));
        final SubLObject var3 = conses_high.getf(module0068.$g1096$.getDynamicValue(var2), (SubLObject)module0068.$ic29$, (SubLObject)module0068.UNPROVIDED);
        if (module0068.NIL != var3) {
            SubLObject var4 = (SubLObject)module0068.NIL;
            final SubLObject var5 = module0068.$g1099$.currentBinding(var2);
            try {
                module0068.$g1099$.bind((SubLObject)module0068.T, var2);
                final SubLObject var6 = (SubLObject)ConsesLow.list((SubLObject)module0068.$ic30$, (SubLObject)module0068.T, (SubLObject)module0068.$ic31$, (SubLObject)ConsesLow.list(var3), (SubLObject)module0068.$ic32$, conses_high.getf(module0068.$g1096$.getDynamicValue(var2), (SubLObject)module0068.$ic32$, (SubLObject)module0068.UNPROVIDED), (SubLObject)module0068.$ic33$, conses_high.getf(module0068.$g1096$.getDynamicValue(var2), (SubLObject)module0068.$ic33$, (SubLObject)module0068.UNPROVIDED));
                final SubLObject var21_22 = module0068.$g1096$.currentBinding(var2);
                final SubLObject var7 = module0068.$g1098$.currentBinding(var2);
                final SubLObject var8 = module0068.$g1097$.currentBinding(var2);
                try {
                    module0068.$g1096$.bind(var6, var2);
                    module0068.$g1098$.bind(module0057.f4173((SubLObject)module0068.UNPROVIDED, (SubLObject)module0068.UNPROVIDED, (SubLObject)module0068.UNPROVIDED), var2);
                    module0068.$g1097$.bind(f4920(StreamsLow.$null_output$.getDynamicValue(var2)), var2);
                    f4921(StreamsLow.$null_output$.getDynamicValue(var2));
                    module0021.f1038(var3, StreamsLow.$null_output$.getDynamicValue(var2));
                    var4 = f4923(module0068.$g1097$.getDynamicValue(var2));
                    f4924(StreamsLow.$null_output$.getDynamicValue(var2));
                }
                finally {
                    module0068.$g1097$.rebind(var8, var2);
                    module0068.$g1098$.rebind(var7, var2);
                    module0068.$g1096$.rebind(var21_22, var2);
                }
            }
            finally {
                module0068.$g1099$.rebind(var5, var2);
            }
            module0068.$g1097$.setDynamicValue(var4, var2);
        }
        return f4925(var1);
    }
    
    public static SubLObject f4926(final SubLObject var4) {
        return module0035.f2169(var4, module0068.$g1100$.getGlobalValue());
    }
    
    public static SubLObject f4922(final SubLObject var12) {
        assert module0068.NIL != module0035.f2327(var12) : var12;
        assert module0068.NIL != module0035.f2327(var12) : var12;
        SubLObject var13;
        SubLObject var14;
        SubLObject var15;
        for (var13 = (SubLObject)module0068.NIL, var13 = var12; module0068.NIL != var13; var13 = conses_high.cddr(var13)) {
            var14 = var13.first();
            var15 = conses_high.cadr(var13);
            assert module0068.NIL != f4926(var14) : var14;
        }
        return var12;
    }
    
    public static SubLObject f4924(final SubLObject var1) {
        return f4927(var1);
    }
    
    public static SubLObject f4928(final SubLObject var7, final SubLObject var8) {
        final SubLObject var9 = var7.rest();
        final SubLObject var11;
        final SubLObject var10 = var11 = var9;
        return (SubLObject)ConsesLow.listS((SubLObject)module0068.$ic13$, (SubLObject)module0068.$ic37$, ConsesLow.append(var11, (SubLObject)module0068.NIL));
    }
    
    public static SubLObject f4929(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        if (module0068.NIL == module0068.$g1097$.getDynamicValue(var5)) {
            return (SubLObject)module0068.NIL;
        }
        if (module0068.NIL != f4930(var4)) {
            return (SubLObject)module0068.NIL;
        }
        if (module0068.NIL != conses_high.getf(module0068.$g1096$.getDynamicValue(var5), (SubLObject)module0068.$ic29$, (SubLObject)module0068.UNPROVIDED)) {
            return module0035.sublisp_boolean(module0067.f4884(module0068.$g1097$.getDynamicValue(var5), var4, (SubLObject)module0068.UNPROVIDED));
        }
        if (module0068.NIL != module0035.f2169(var4, conses_high.getf(module0068.$g1096$.getDynamicValue(var5), (SubLObject)module0068.$ic31$, (SubLObject)module0068.UNPROVIDED))) {
            return (SubLObject)module0068.NIL;
        }
        if (module0068.NIL != conses_high.getf(module0068.$g1096$.getDynamicValue(var5), (SubLObject)module0068.$ic30$, (SubLObject)module0068.UNPROVIDED)) {
            return (SubLObject)module0068.T;
        }
        return (SubLObject)module0068.NIL;
    }
    
    public static SubLObject f4930(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0068.NIL == var4 || var4.isFixnum() || module0068.NIL != module0021.f1140(var4) || module0068.NIL != module0206.f13500(var4) || (module0068.NIL == module0021.f1102() && module0068.NIL == conses_high.getf(module0068.$g1096$.getDynamicValue(var5), (SubLObject)module0068.$ic33$, (SubLObject)module0068.UNPROVIDED) && (module0068.NIL != module0128.f8449(var4) || module0068.NIL != module0167.f10813(var4) || module0068.NIL != module0174.f11035(var4))));
    }
    
    public static SubLObject f4923(final SubLObject var31) {
        final SubLThread var32 = SubLProcess.currentSubLThread();
        final SubLObject var33 = module0067.f4880(Symbols.symbol_function((SubLObject)module0068.EQUAL), (SubLObject)module0068.UNPROVIDED);
        SubLObject var35;
        for (SubLObject var34 = (SubLObject)module0068.NIL; module0068.NIL == var34; var34 = (SubLObject)SubLObjectFactory.makeBoolean(module0068.NIL == var35)) {
            var35 = (SubLObject)module0068.NIL;
            SubLObject var36 = module0084.f5780(var31);
            SubLObject var37 = (SubLObject)module0068.NIL;
            var37 = var36.first();
            while (module0068.NIL != var36) {
                SubLObject var39;
                final SubLObject var38 = var39 = var37;
                SubLObject var40 = (SubLObject)module0068.NIL;
                SubLObject var41 = (SubLObject)module0068.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var39, var38, (SubLObject)module0068.$ic38$);
                var40 = var39.first();
                var39 = (var41 = var39.rest());
                if (module0068.ONE_INTEGER.numE(var41) && var40.isCons()) {
                    var35 = (SubLObject)module0068.T;
                    module0067.f4887(var31, var40);
                    SubLObject var40_41;
                    SubLObject var42;
                    for (var40_41 = (SubLObject)module0068.NIL, var40_41 = var40; var40_41.isCons(); var40_41 = var40_41.rest()) {
                        var42 = var40_41.first();
                        if (module0068.NIL == f4930(var42)) {
                            module0084.f5775(var31, var42, (SubLObject)module0068.UNPROVIDED);
                        }
                    }
                }
                var36 = var36.rest();
                var37 = var36.first();
            }
        }
        if (module0068.NIL != conses_high.getf(module0068.$g1096$.getDynamicValue(var32), (SubLObject)module0068.$ic32$, (SubLObject)module0068.UNPROVIDED)) {
            PrintLow.format((SubLObject)module0068.T, (SubLObject)module0068.$ic39$);
            module0006.f215(Sequences.delete((SubLObject)module0068.ONE_INTEGER, module0084.f5795(var31, Symbols.symbol_function((SubLObject)module0068.$ic40$)), Symbols.symbol_function((SubLObject)module0068.EQ), Symbols.symbol_function((SubLObject)module0068.$ic41$), (SubLObject)module0068.UNPROVIDED, (SubLObject)module0068.UNPROVIDED, (SubLObject)module0068.UNPROVIDED), (SubLObject)module0068.UNPROVIDED);
        }
        SubLObject var43;
        for (var43 = module0066.f4838(module0067.f4891(var31)); module0068.NIL == module0066.f4841(var43); var43 = module0066.f4840(var43)) {
            var32.resetMultipleValues();
            final SubLObject var44 = module0066.f4839(var43);
            final SubLObject var45 = var32.secondMultipleValue();
            var32.resetMultipleValues();
            if (var45.numGE((SubLObject)module0068.TWO_INTEGER)) {
                module0067.f4886(var33, var44, (SubLObject)module0068.$ic42$);
            }
        }
        module0066.f4842(var43);
        return var33;
    }
    
    public static SubLObject f4925(final SubLObject var1) {
        return module0021.f1086(module0068.$g1090$.getGlobalValue(), var1);
    }
    
    public static SubLObject f4931(final SubLObject var4, final SubLObject var1) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        if (module0068.NIL != module0068.$g1099$.getDynamicValue(var5)) {
            return module0084.f5775(module0068.$g1097$.getDynamicValue(var5), var4, (SubLObject)module0068.UNPROVIDED);
        }
        SubLObject var6 = module0067.f4884(module0068.$g1097$.getDynamicValue(var5), var4, (SubLObject)module0068.UNPROVIDED);
        if (module0068.NIL == var6 || module0068.$ic42$ == var6) {
            var6 = f4932(var4, var1);
        }
        return f4933(var6, var1);
    }
    
    public static SubLObject f4932(final SubLObject var4, final SubLObject var1) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = module0057.f4175(module0068.$g1098$.getDynamicValue(var5));
        module0067.f4886(module0068.$g1097$.getDynamicValue(var5), var4, var6);
        module0021.f1086(module0068.$g1091$.getGlobalValue(), var1);
        final SubLObject var7 = module0068.$g1097$.currentBinding(var5);
        try {
            module0068.$g1097$.bind((SubLObject)module0068.NIL, var5);
            module0021.f1038(var6, var1);
            module0021.f1038(var4, var1);
        }
        finally {
            module0068.$g1097$.rebind(var7, var5);
        }
        return var6;
    }
    
    public static SubLObject f4933(final SubLObject var3, final SubLObject var1) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        module0021.f1086(module0068.$g1092$.getGlobalValue(), var1);
        final SubLObject var5 = module0068.$g1097$.currentBinding(var4);
        try {
            module0068.$g1097$.bind((SubLObject)module0068.NIL, var4);
            module0021.f1038(var3, var1);
        }
        finally {
            module0068.$g1097$.rebind(var5, var4);
        }
        return var3;
    }
    
    public static SubLObject f4927(final SubLObject var1) {
        return module0021.f1086(module0068.$g1093$.getGlobalValue(), var1);
    }
    
    public static SubLObject f4934() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0068", "f4908", "S#6476", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0068", "f4909", "S#6477", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0068", "f4910", "S#6478", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0068", "f4911", "S#6479", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0068", "f4912", "S#6480", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0068", "f4913", "S#6481", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0068", "f4914", "S#6482", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0068", "f4915", "S#6483", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0068", "f4916", "S#6484", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0068", "f4917", "S#6485", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0068", "f4918", "S#6486");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0068", "f4919", "S#6487");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0068", "f4920", "S#6488", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0068", "f4921", "S#6489", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0068", "f4926", "S#6490", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0068", "f4922", "S#6491", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0068", "f4924", "S#6492", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0068", "f4928", "S#6493");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0068", "f4929", "S#2012", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0068", "f4930", "S#6494", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0068", "f4923", "S#6495", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0068", "f4925", "S#6496", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0068", "f4931", "S#2013", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0068", "f4932", "S#6497", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0068", "f4933", "S#6498", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0068", "f4927", "S#6499", 1, 0, false);
        return (SubLObject)module0068.NIL;
    }
    
    public static SubLObject f4935() {
        module0068.$g1090$ = SubLFiles.defconstant("S#6500", (SubLObject)module0068.$ic0$);
        module0068.$g1091$ = SubLFiles.defconstant("S#6501", (SubLObject)module0068.$ic2$);
        module0068.$g1092$ = SubLFiles.defconstant("S#6502", (SubLObject)module0068.$ic4$);
        module0068.$g1093$ = SubLFiles.defconstant("S#6503", (SubLObject)module0068.$ic6$);
        module0068.$g1094$ = SubLFiles.deflexical("S#6504", (module0068.NIL != Symbols.boundp((SubLObject)module0068.$ic8$)) ? module0068.$g1094$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)module0068.EQ), (SubLObject)module0068.UNPROVIDED));
        module0068.$g1095$ = SubLFiles.deflexical("S#6505", (module0068.NIL != Symbols.boundp((SubLObject)module0068.$ic9$)) ? module0068.$g1095$.getGlobalValue() : Symbols.make_symbol((SubLObject)module0068.$ic10$));
        module0068.$g1096$ = SubLFiles.defparameter("S#6506", (SubLObject)module0068.NIL);
        module0068.$g1097$ = SubLFiles.defparameter("S#6507", (SubLObject)module0068.NIL);
        module0068.$g1098$ = SubLFiles.defparameter("S#6508", (SubLObject)module0068.NIL);
        module0068.$g1099$ = SubLFiles.defparameter("S#6509", (SubLObject)module0068.NIL);
        module0068.$g1100$ = SubLFiles.deflexical("S#6510", (SubLObject)module0068.$ic34$);
        return (SubLObject)module0068.NIL;
    }
    
    public static SubLObject f4936() {
        module0021.f1098(module0068.$g1090$.getGlobalValue(), (SubLObject)module0068.$ic1$);
        module0021.f1098(module0068.$g1091$.getGlobalValue(), (SubLObject)module0068.$ic3$);
        module0021.f1098(module0068.$g1092$.getGlobalValue(), (SubLObject)module0068.$ic5$);
        module0021.f1098(module0068.$g1093$.getGlobalValue(), (SubLObject)module0068.$ic7$);
        module0003.f57((SubLObject)module0068.$ic8$);
        module0003.f57((SubLObject)module0068.$ic9$);
        module0012.f419((SubLObject)module0068.$ic1$);
        module0012.f419((SubLObject)module0068.$ic3$);
        module0012.f419((SubLObject)module0068.$ic5$);
        module0012.f419((SubLObject)module0068.$ic7$);
        module0002.f50((SubLObject)module0068.$ic17$, (SubLObject)module0068.$ic28$);
        module0002.f50((SubLObject)module0068.$ic18$, (SubLObject)module0068.$ic28$);
        module0002.f50((SubLObject)module0068.$ic19$, (SubLObject)module0068.$ic28$);
        return (SubLObject)module0068.NIL;
    }
    
    public void declareFunctions() {
        f4934();
    }
    
    public void initializeVariables() {
        f4935();
    }
    
    public void runTopLevelForms() {
        f4936();
    }
    
    static {
        me = (SubLFile)new module0068();
        module0068.$g1090$ = null;
        module0068.$g1091$ = null;
        module0068.$g1092$ = null;
        module0068.$g1093$ = null;
        module0068.$g1094$ = null;
        module0068.$g1095$ = null;
        module0068.$g1096$ = null;
        module0068.$g1097$ = null;
        module0068.$g1098$ = null;
        module0068.$g1099$ = null;
        module0068.$g1100$ = null;
        $ic0$ = SubLObjectFactory.makeInteger(54);
        $ic1$ = SubLObjectFactory.makeSymbol("S#6482", "CYC");
        $ic2$ = SubLObjectFactory.makeInteger(55);
        $ic3$ = SubLObjectFactory.makeSymbol("S#6483", "CYC");
        $ic4$ = SubLObjectFactory.makeInteger(56);
        $ic5$ = SubLObjectFactory.makeSymbol("S#6484", "CYC");
        $ic6$ = SubLObjectFactory.makeInteger(57);
        $ic7$ = SubLObjectFactory.makeSymbol("S#6485", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("S#6504", "CYC");
        $ic9$ = SubLObjectFactory.makeSymbol("S#6505", "CYC");
        $ic10$ = SubLObjectFactory.makeString("NOT-FOUND");
        $ic11$ = SubLObjectFactory.makeString("Couldn't decompress ~s using table ~s");
        $ic12$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("S#6511", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic13$ = SubLObjectFactory.makeSymbol("CLET");
        $ic14$ = SubLObjectFactory.makeSymbol("S#6506", "CYC");
        $ic15$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6508", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#911", "CYC")));
        $ic16$ = SubLObjectFactory.makeSymbol("S#6507", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#6488", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#6489", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#6492", "CYC");
        $ic20$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6512", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6513", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6511", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic21$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6491", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6506", "CYC"));
        $ic22$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6509", "CYC"), (SubLObject)module0068.T);
        $ic23$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*NULL-OUTPUT*"));
        $ic24$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("S#6507", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6495", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6507", "CYC"))));
        $ic25$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6506", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUTF"), (SubLObject)SubLObjectFactory.makeSymbol("S#6506", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("ANALYZE"), (SubLObject)SubLObjectFactory.makeKeyword("OBJECT"))));
        $ic26$ = SubLObjectFactory.makeSymbol("S#6496", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("S#6499", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#6486", "CYC");
        $ic29$ = SubLObjectFactory.makeKeyword("ANALYZE");
        $ic30$ = SubLObjectFactory.makeKeyword("ALL?");
        $ic31$ = SubLObjectFactory.makeKeyword("NOT");
        $ic32$ = SubLObjectFactory.makeKeyword("VERBOSE?");
        $ic33$ = SubLObjectFactory.makeKeyword("EXTERNALIZED?");
        $ic34$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALL?"), (SubLObject)SubLObjectFactory.makeKeyword("ANALYZE"), (SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("VERBOSE?"), (SubLObject)SubLObjectFactory.makeKeyword("EXTERNALIZED?"));
        $ic35$ = SubLObjectFactory.makeSymbol("S#748", "CYC");
        $ic36$ = SubLObjectFactory.makeSymbol("S#6490", "CYC");
        $ic37$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6507", "CYC"), (SubLObject)module0068.NIL));
        $ic38$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#154", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("COUNT"));
        $ic39$ = SubLObjectFactory.makeString("~&CFASL compression dictionary:~%");
        $ic40$ = SubLObjectFactory.makeSymbol(">");
        $ic41$ = SubLObjectFactory.makeSymbol("CDR");
        $ic42$ = SubLObjectFactory.makeKeyword("PRECOMPUTED");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0068.class
	Total time: 154 ms
	
	Decompiled with Procyon 0.5.32.
*/