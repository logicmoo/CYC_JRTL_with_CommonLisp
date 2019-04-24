package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0022 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0022";
    public static final String myFingerPrint = "2ef90231e8255fc1440ea8938a4b15d68c5191eb9c055cbe4eac44a4c835cac2";
    private static SubLSymbol $g798$;
    private static SubLSymbol $g799$;
    private static SubLSymbol $g800$;
    private static SubLSymbol $g801$;
    private static SubLSymbol $g802$;
    private static SubLSymbol $g803$;
    public static SubLSymbol $g804$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLInteger $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLInteger $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLInteger $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLInteger $ic18$;
    private static final SubLInteger $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLInteger $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLInteger $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLList $ic27$;
    private static final SubLInteger $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLInteger $ic30$;
    private static final SubLSymbol $ic31$;
    
    public static SubLObject f1208(final SubLObject var1) {
        return Numbers.numLE(var1, module0022.$g802$.getGlobalValue());
    }
    
    public static SubLObject f1209(final SubLObject var1) {
        if (var1.isNegative()) {
            return f1209(Numbers.abs(var1));
        }
        if (module0022.NIL != f1208(var1)) {
            return var1;
        }
        return bytes.ldb(module0022.$g803$.getGlobalValue(), var1);
    }
    
    public static SubLObject f1210(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0022.$ic0$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)module0022.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0022.$ic0$);
        var7 = var5.first();
        var5 = var5.rest();
        if (module0022.NIL == var5) {
            final SubLObject var8;
            var5 = (var8 = var6);
            return (SubLObject)ConsesLow.listS((SubLObject)module0022.$ic1$, (SubLObject)module0022.$ic2$, (SubLObject)ConsesLow.listS((SubLObject)module0022.$ic3$, var7, (SubLObject)module0022.$ic4$), ConsesLow.append(var8, (SubLObject)module0022.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)module0022.$ic0$);
        return (SubLObject)module0022.NIL;
    }
    
    public static SubLObject f1211(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        SubLObject var6 = (SubLObject)module0022.NIL;
        SubLObject var7 = (SubLObject)module0022.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0022.$ic5$);
        var6 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0022.$ic5$);
        var7 = var5.first();
        var5 = var5.rest();
        if (module0022.NIL == var5) {
            return (SubLObject)ConsesLow.list((SubLObject)module0022.$ic6$, (SubLObject)module0022.$ic7$, (SubLObject)ConsesLow.list((SubLObject)module0022.$ic3$, var6, (SubLObject)ConsesLow.list((SubLObject)module0022.$ic8$, var6, (SubLObject)module0022.$ic9$, var7)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)module0022.$ic5$);
        return (SubLObject)module0022.NIL;
    }
    
    public static SubLObject f1212(final SubLObject var12, final SubLObject var13) {
        if (var13.numGE(module0022.$g801$.getGlobalValue())) {
            return var12;
        }
        final SubLObject var14 = Numbers.subtract(module0022.$g801$.getGlobalValue(), var13);
        final SubLObject var15 = Numbers.ash(var12, Numbers.minus(var14));
        final SubLObject var16 = Numbers.lognot(Numbers.ash((SubLObject)module0022.MINUS_ONE_INTEGER, var14));
        final SubLObject var17 = Numbers.logand(var12, var16);
        final SubLObject var18 = Numbers.ash(var17, var13);
        final SubLObject var19 = Numbers.logior(var15, var18);
        return var19;
    }
    
    public static SubLObject f1213(final SubLObject var20) {
        return module0012.f603(var20);
    }
    
    public static SubLObject f1214(final SubLObject var7, final SubLObject var20, final SubLObject var11) {
        return Numbers.logxor(f1212(var11, var20), var7);
    }
    
    public static SubLObject f1215(final SubLObject var21) {
        final SubLObject var22 = Structures.method_func(var21, module0022.$g804$.getGlobalValue());
        if (module0022.NIL != var22) {
            return Functions.funcall(var22, var21);
        }
        return (SubLObject)module0022.ZERO_INTEGER;
    }
    
    public static SubLObject f1216(final SubLObject var1) {
        return f1209(var1);
    }
    
    public static SubLObject f1217(final SubLObject var21) {
        return f1216(var21);
    }
    
    public static SubLObject f1218(final SubLObject var23) {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        SubLObject var25 = (SubLObject)module0022.NIL;
        final SubLObject var26 = module0022.$g798$.currentBinding(var24);
        try {
            module0022.$g798$.bind(Numbers.add(module0022.$g798$.getDynamicValue(var24), (SubLObject)module0022.ONE_INTEGER), var24);
            SubLObject var27 = (SubLObject)module0022.FOUR_INTEGER;
            var25 = (SubLObject)module0022.ZERO_INTEGER;
            var25 = (SubLObject)module0022.$ic14$;
            var24.resetMultipleValues();
            final SubLObject var28 = Numbers.integer_decode_float(var23);
            final SubLObject var29 = var24.secondMultipleValue();
            final SubLObject var30 = var24.thirdMultipleValue();
            var24.resetMultipleValues();
            var27 = f1213(var27);
            var25 = f1214(var25, var27, f1215(var28));
            var27 = f1213(var27);
            var25 = f1214(var25, var27, f1215(var29));
            var27 = f1213(var27);
            var25 = f1214(var25, var27, f1215(var30));
        }
        finally {
            module0022.$g798$.rebind(var26, var24);
        }
        return var25;
    }
    
    public static SubLObject f1219(final SubLObject var21) {
        return f1218(var21);
    }
    
    public static SubLObject f1220(final SubLObject var30) {
        return Numbers.logand(Characters.char_code(var30), (SubLObject)module0022.$ic16$);
    }
    
    public static SubLObject f1221(final SubLObject var21) {
        return f1220(var21);
    }
    
    public static SubLObject f1222(final SubLObject var31) {
        final SubLThread var32 = SubLProcess.currentSubLThread();
        SubLObject var33 = (SubLObject)module0022.NIL;
        final SubLObject var34 = module0022.$g798$.currentBinding(var32);
        try {
            module0022.$g798$.bind(Numbers.add(module0022.$g798$.getDynamicValue(var32), (SubLObject)module0022.ONE_INTEGER), var32);
            SubLObject var35 = (SubLObject)module0022.FOUR_INTEGER;
            var33 = (SubLObject)module0022.ZERO_INTEGER;
            var33 = (SubLObject)module0022.$ic18$;
            SubLObject var36;
            SubLObject var37;
            SubLObject var38;
            for (var36 = Sequences.length(var31), var37 = (SubLObject)module0022.NIL, var37 = (SubLObject)module0022.ZERO_INTEGER; var37.numL(var36); var37 = Numbers.add(var37, (SubLObject)module0022.ONE_INTEGER)) {
                var38 = f1220(Strings.sublisp_char(var31, var37));
                var35 = f1213(var35);
                var33 = f1214(var33, var35, var38);
            }
        }
        finally {
            module0022.$g798$.rebind(var34, var32);
        }
        return var33;
    }
    
    public static SubLObject f1223(final SubLObject var31) {
        final SubLThread var32 = SubLProcess.currentSubLThread();
        SubLObject var33 = (SubLObject)module0022.NIL;
        final SubLObject var34 = module0022.$g798$.currentBinding(var32);
        try {
            module0022.$g798$.bind(Numbers.add(module0022.$g798$.getDynamicValue(var32), (SubLObject)module0022.ONE_INTEGER), var32);
            SubLObject var35 = (SubLObject)module0022.FOUR_INTEGER;
            var33 = (SubLObject)module0022.ZERO_INTEGER;
            var33 = (SubLObject)module0022.$ic18$;
            final SubLObject var36 = Sequences.length(var31);
            final SubLObject var37 = f1209(var36);
            var35 = f1213(var35);
            var33 = f1214(var33, var35, var37);
            SubLObject var38 = (SubLObject)module0022.$ic19$;
            for (SubLObject var39 = (SubLObject)module0022.ONE_INTEGER, var40 = (SubLObject)module0022.ZERO_INTEGER; var40.numL(var36); var40 = Numbers.add(var40, var39)) {
                final SubLObject var41 = f1220(Strings.sublisp_char(var31, var40));
                var35 = f1213(var35);
                var33 = f1214(var33, var35, var41);
                if (var40.numG(var38)) {
                    var39 = Numbers.add(var39, var39);
                    if (var39.numG((SubLObject)module0022.$ic19$)) {
                        var40 = var36;
                    }
                    else {
                        var38 = var38;
                    }
                }
            }
        }
        finally {
            module0022.$g798$.rebind(var34, var32);
        }
        return var33;
    }
    
    public static SubLObject f1224(final SubLObject var21) {
        return f1222(var21);
    }
    
    public static SubLObject f1225(final SubLObject var39) {
        final SubLThread var40 = SubLProcess.currentSubLThread();
        SubLObject var41 = (SubLObject)module0022.NIL;
        final SubLObject var42 = module0022.$g798$.currentBinding(var40);
        try {
            module0022.$g798$.bind(Numbers.add(module0022.$g798$.getDynamicValue(var40), (SubLObject)module0022.ONE_INTEGER), var40);
            SubLObject var43 = (SubLObject)module0022.FOUR_INTEGER;
            var41 = (SubLObject)module0022.ZERO_INTEGER;
            var41 = (SubLObject)module0022.$ic21$;
            final SubLObject var44 = f1222(Packages.package_name(var39));
            var43 = f1213(var43);
            var41 = f1214(var41, var43, var44);
        }
        finally {
            module0022.$g798$.rebind(var42, var40);
        }
        return var41;
    }
    
    public static SubLObject f1226(final SubLObject var21) {
        return f1225(var21);
    }
    
    public static SubLObject f1227(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        SubLObject var42 = Symbols.get(var40, (SubLObject)module0022.$ic23$, (SubLObject)module0022.UNPROVIDED);
        if (module0022.NIL == var42) {
            final SubLObject var43 = module0022.$g798$.currentBinding(var41);
            try {
                module0022.$g798$.bind(Numbers.add(module0022.$g798$.getDynamicValue(var41), (SubLObject)module0022.ONE_INTEGER), var41);
                SubLObject var44 = (SubLObject)module0022.FOUR_INTEGER;
                var42 = (SubLObject)module0022.ZERO_INTEGER;
                var42 = (SubLObject)module0022.$ic24$;
                final SubLObject var45 = Symbols.symbol_package(var40);
                if (module0022.NIL != var45) {
                    final SubLObject var46 = f1225(var45);
                    var44 = f1213(var44);
                    var42 = f1214(var42, var44, var46);
                }
                final SubLObject var47 = f1222(Symbols.symbol_name(var40));
                var44 = f1213(var44);
                var42 = f1214(var42, var44, var47);
            }
            finally {
                module0022.$g798$.rebind(var43, var41);
            }
            Symbols.put(var40, (SubLObject)module0022.$ic23$, var42);
        }
        return var42;
    }
    
    public static SubLObject f1228() {
        SubLObject var32 = (SubLObject)module0022.ZERO_INTEGER;
        SubLObject var33 = Packages.list_all_packages();
        SubLObject var34 = (SubLObject)module0022.NIL;
        var34 = var33.first();
        while (module0022.NIL != var33) {
            final SubLObject var35 = var34;
            final SubLObject var36 = (SubLObject)module0022.NIL;
            SubLObject var37 = (SubLObject)module0022.NIL;
            final Iterator var43_44 = Packages.makeSymbolIterator(var35);
            while (Packages.symbolIteratorHasNext(var43_44)) {
                var37 = Packages.symbolIteratorNext(var43_44);
                if (module0022.NIL != Symbols.get(var37, (SubLObject)module0022.$ic23$, (SubLObject)module0022.UNPROVIDED)) {
                    var32 = Numbers.add(var32, (SubLObject)module0022.ONE_INTEGER);
                    Symbols.remprop(var37, (SubLObject)module0022.$ic23$);
                }
            }
            var33 = var33.rest();
            var34 = var33.first();
        }
        return var32;
    }
    
    public static SubLObject f1229() {
        SubLObject var32 = (SubLObject)module0022.ZERO_INTEGER;
        SubLObject var33 = Packages.list_all_packages();
        SubLObject var34 = (SubLObject)module0022.NIL;
        var34 = var33.first();
        while (module0022.NIL != var33) {
            final SubLObject var35 = var34;
            final SubLObject var36 = (SubLObject)module0022.NIL;
            SubLObject var37 = (SubLObject)module0022.NIL;
            final Iterator var43_45 = Packages.makeSymbolIterator(var35);
            while (Packages.symbolIteratorHasNext(var43_45)) {
                var37 = Packages.symbolIteratorNext(var43_45);
                if (module0022.NIL == Symbols.get(var37, (SubLObject)module0022.$ic23$, (SubLObject)module0022.UNPROVIDED)) {
                    var32 = Numbers.add(var32, (SubLObject)module0022.ONE_INTEGER);
                    f1215(var37);
                }
            }
            var33 = var33.rest();
            var34 = var33.first();
        }
        return var32;
    }
    
    public static SubLObject f1230(final SubLObject var21) {
        return f1227(var21);
    }
    
    public static SubLObject f1231(final SubLObject var46) {
        return f1215(Guids.guid_to_string(var46));
    }
    
    public static SubLObject f1232(final SubLObject var21) {
        return f1231(var21);
    }
    
    public static SubLObject f1233(final SubLObject var47) {
        final SubLThread var48 = SubLProcess.currentSubLThread();
        SubLObject var49 = (SubLObject)module0022.NIL;
        final SubLObject var50 = module0022.$g798$.currentBinding(var48);
        try {
            module0022.$g798$.bind(Numbers.add(module0022.$g798$.getDynamicValue(var48), (SubLObject)module0022.ONE_INTEGER), var48);
            SubLObject var51 = (SubLObject)module0022.FOUR_INTEGER;
            var49 = (SubLObject)module0022.ZERO_INTEGER;
            var49 = (SubLObject)module0022.$ic28$;
            if (!module0022.$g798$.getDynamicValue(var48).numG(module0022.$g799$.getGlobalValue())) {
                SubLObject var52;
                SubLObject var53;
                SubLObject var54;
                for (var52 = (SubLObject)module0022.NIL, var53 = (SubLObject)module0022.NIL, var52 = var47, var53 = (SubLObject)module0022.ZERO_INTEGER; !var53.numGE(module0022.$g800$.getGlobalValue()) && !var52.isAtom(); var52 = var52.rest(), var53 = Numbers.add(var53, (SubLObject)module0022.ONE_INTEGER)) {
                    var54 = f1215(var52.first());
                    var51 = f1213(var51);
                    var49 = f1214(var49, var51, var54);
                }
                if (!var53.numGE(module0022.$g800$.getGlobalValue()) && module0022.NIL != var52) {
                    var54 = f1215(var52);
                    var51 = f1213(var51);
                    var49 = f1214(var49, var51, var54);
                }
            }
        }
        finally {
            module0022.$g798$.rebind(var50, var48);
        }
        return var49;
    }
    
    public static SubLObject f1234(final SubLObject var21) {
        return f1233(var21);
    }
    
    public static SubLObject f1235(final SubLObject var49) {
        final SubLThread var50 = SubLProcess.currentSubLThread();
        SubLObject var51 = (SubLObject)module0022.NIL;
        final SubLObject var52 = module0022.$g798$.currentBinding(var50);
        try {
            module0022.$g798$.bind(Numbers.add(module0022.$g798$.getDynamicValue(var50), (SubLObject)module0022.ONE_INTEGER), var50);
            SubLObject var53 = (SubLObject)module0022.FOUR_INTEGER;
            var51 = (SubLObject)module0022.ZERO_INTEGER;
            var51 = (SubLObject)module0022.$ic30$;
            if (!module0022.$g798$.getDynamicValue(var50).numG(module0022.$g799$.getGlobalValue())) {
                SubLObject var54;
                SubLObject var55;
                SubLObject var56;
                for (var54 = Numbers.min(Sequences.length(var49), module0022.$g800$.getGlobalValue()), var55 = (SubLObject)module0022.NIL, var55 = (SubLObject)module0022.ZERO_INTEGER; var55.numL(var54); var55 = Numbers.add(var55, (SubLObject)module0022.ONE_INTEGER)) {
                    var56 = f1215(Vectors.aref(var49, var55));
                    var53 = f1213(var53);
                    var51 = f1214(var51, var53, var56);
                }
            }
        }
        finally {
            module0022.$g798$.rebind(var52, var50);
        }
        return var51;
    }
    
    public static SubLObject f1236(final SubLObject var21) {
        return f1235(var21);
    }
    
    public static SubLObject f1237() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0022", "f1208", "S#2274", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0022", "f1209", "S#2275", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0022", "f1210", "S#2276");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0022", "f1211", "S#2277");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0022", "f1212", "S#2278", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0022", "f1213", "S#2279", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0022", "f1214", "S#2280", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0022", "f1215", "S#2281", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0022", "f1216", "S#2282", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0022", "f1217", "S#2283", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0022", "f1218", "S#2284", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0022", "f1219", "S#2285", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0022", "f1220", "S#2286", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0022", "f1221", "S#2287", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0022", "f1222", "S#2288", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0022", "f1223", "S#2289", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0022", "f1224", "S#2290", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0022", "f1225", "S#2291", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0022", "f1226", "S#2292", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0022", "f1227", "S#2293", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0022", "f1228", "S#2294", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0022", "f1229", "S#2295", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0022", "f1230", "S#2296", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0022", "f1231", "S#2297", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0022", "f1232", "S#2298", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0022", "f1233", "S#2299", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0022", "f1234", "S#2300", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0022", "f1235", "S#2301", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0022", "f1236", "S#2302", 1, 0, false);
        return (SubLObject)module0022.NIL;
    }
    
    public static SubLObject f1238() {
        module0022.$g798$ = SubLFiles.defparameter("S#2303", (SubLObject)module0022.ZERO_INTEGER);
        module0022.$g799$ = SubLFiles.defconstant("S#2304", (SubLObject)module0022.EIGHT_INTEGER);
        module0022.$g800$ = SubLFiles.defconstant("S#2305", (SubLObject)module0022.EIGHT_INTEGER);
        module0022.$g801$ = SubLFiles.defconstant("S#2306", module0012.$g101$.getGlobalValue());
        module0022.$g802$ = SubLFiles.defconstant("S#2307", Numbers.subtract(Numbers.expt((SubLObject)module0022.TWO_INTEGER, module0022.$g801$.getGlobalValue()), (SubLObject)module0022.ONE_INTEGER));
        module0022.$g803$ = SubLFiles.defconstant("S#2308", bytes.sublisp_byte(module0022.$g801$.getGlobalValue(), (SubLObject)module0022.ZERO_INTEGER));
        module0022.$g804$ = SubLFiles.deflexical("S#2309", Vectors.make_vector((SubLObject)module0022.$ic11$, (SubLObject)module0022.NIL));
        return (SubLObject)module0022.NIL;
    }
    
    public static SubLObject f1239() {
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0022.$ic10$);
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0022.$ic12$);
        Structures.register_method(module0022.$g804$.getGlobalValue(), Types.$dtp_bignum$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0022.$ic13$));
        Structures.register_method(module0022.$g804$.getGlobalValue(), Types.$dtp_fixnum$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0022.$ic13$));
        Structures.register_method(module0022.$g804$.getGlobalValue(), Types.$dtp_float$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0022.$ic15$));
        Structures.register_method(module0022.$g804$.getGlobalValue(), Types.$dtp_character$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0022.$ic17$));
        Structures.register_method(module0022.$g804$.getGlobalValue(), Types.$dtp_string$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0022.$ic20$));
        Structures.register_method(module0022.$g804$.getGlobalValue(), Types.$dtp_package$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0022.$ic22$));
        Structures.register_method(module0022.$g804$.getGlobalValue(), Types.$dtp_symbol$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0022.$ic25$));
        Structures.register_method(module0022.$g804$.getGlobalValue(), Guids.$dtp_guid$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0022.$ic26$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0022.$ic27$);
        Structures.register_method(module0022.$g804$.getGlobalValue(), Types.$dtp_cons$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0022.$ic29$));
        Structures.register_method(module0022.$g804$.getGlobalValue(), Types.$dtp_vector$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0022.$ic31$));
        return (SubLObject)module0022.NIL;
    }
    
    public void declareFunctions() {
        f1237();
    }
    
    public void initializeVariables() {
        f1238();
    }
    
    public void runTopLevelForms() {
        f1239();
    }
    
    static {
        me = (SubLFile)new module0022();
        module0022.$g798$ = null;
        module0022.$g799$ = null;
        module0022.$g800$ = null;
        module0022.$g801$ = null;
        module0022.$g802$ = null;
        module0022.$g803$ = null;
        module0022.$g804$ = null;
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2310", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic1$ = SubLObjectFactory.makeSymbol("CLET");
        $ic2$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2303", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)SubLObjectFactory.makeSymbol("S#2303", "CYC"), (SubLObject)module0022.ONE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2311", "CYC"), (SubLObject)module0022.FOUR_INTEGER));
        $ic3$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic4$ = ConsesLow.list((SubLObject)module0022.ZERO_INTEGER);
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2310", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"));
        $ic6$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic7$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("S#2311", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2279", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2311", "CYC")));
        $ic8$ = SubLObjectFactory.makeSymbol("S#2280", "CYC");
        $ic9$ = SubLObjectFactory.makeSymbol("S#2311", "CYC");
        $ic10$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("S#2278", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2279", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2280", "CYC"));
        $ic11$ = SubLObjectFactory.makeInteger(256);
        $ic12$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("S#2282", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2284", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2286", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2288", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2291", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2293", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2297", "CYC"));
        $ic13$ = SubLObjectFactory.makeSymbol("S#2283", "CYC");
        $ic14$ = SubLObjectFactory.makeInteger(89);
        $ic15$ = SubLObjectFactory.makeSymbol("S#2285", "CYC");
        $ic16$ = SubLObjectFactory.makeInteger(223);
        $ic17$ = SubLObjectFactory.makeSymbol("S#2287", "CYC");
        $ic18$ = SubLObjectFactory.makeInteger(131);
        $ic19$ = SubLObjectFactory.makeInteger(32);
        $ic20$ = SubLObjectFactory.makeSymbol("S#2290", "CYC");
        $ic21$ = SubLObjectFactory.makeInteger(229);
        $ic22$ = SubLObjectFactory.makeSymbol("S#2292", "CYC");
        $ic23$ = SubLObjectFactory.makeKeyword("SXHASH-EXTERNAL");
        $ic24$ = SubLObjectFactory.makeInteger(263);
        $ic25$ = SubLObjectFactory.makeSymbol("S#2296", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#2298", "CYC");
        $ic27$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("S#2299", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2301", "CYC"));
        $ic28$ = SubLObjectFactory.makeInteger(167);
        $ic29$ = SubLObjectFactory.makeSymbol("S#2300", "CYC");
        $ic30$ = SubLObjectFactory.makeInteger(199);
        $ic31$ = SubLObjectFactory.makeSymbol("S#2302", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0022.class
	Total time: 104 ms
	
	Decompiled with Procyon 0.5.32.
*/