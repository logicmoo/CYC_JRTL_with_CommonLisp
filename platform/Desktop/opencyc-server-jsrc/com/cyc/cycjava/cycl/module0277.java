package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0277 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0277";
    public static final String myFingerPrint = "9f7631c3f5c86576d05e4d3476735d7fca51a53af0151dcbf3061ce5dc930bda";
    private static SubLSymbol $g2598$;
    private static SubLSymbol $g2599$;
    private static SubLSymbol $g2600$;
    private static SubLSymbol $g2601$;
    private static SubLSymbol $g2602$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLObject $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLObject $ic19$;
    private static final SubLObject $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLObject $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    
    public static SubLObject f18367(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        assert NIL != module0202.f12590(var1) : var1;
        var4.resetMultipleValues();
        SubLObject var5 = f18368(var1, var2);
        final SubLObject var6 = var4.secondMultipleValue();
        var4.resetMultipleValues();
        if (NIL == var6) {
            var5 = module0202.f12801(Symbols.symbol_function((SubLObject)$ic1$), var1, (SubLObject)UNPROVIDED);
        }
        return var5;
    }
    
    public static SubLObject f18369() {
        return (SubLObject)makeBoolean(NIL != $g2601$.getGlobalValue() && NIL != $g2599$.getGlobalValue() && NIL != $g2600$.getGlobalValue());
    }
    
    public static SubLObject f18370(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != constant_handles_oc.f8449(var7) && NIL == module0004.f104(var7, $g2598$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f18371(final SubLObject var8) {
        return module0193.f12075(module0303.f20124(var8));
    }
    
    public static SubLObject f18372(final SubLObject var9) {
        return module0303.f20123(module0193.f12073(var9));
    }
    
    public static SubLObject f18373(final SubLObject var10, SubLObject var11) {
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)NIL;
        }
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        var13 = var10;
        var14 = var13.first();
        var15 = var11;
        var16 = var15.first();
        while (NIL != var13) {
            SubLObject var17 = var16;
            SubLObject var18 = (SubLObject)NIL;
            var18 = var17.first();
            while (NIL != var17) {
                conses_high.nsubst(var18.first(), var18.rest(), var14, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var17 = var17.rest();
                var18 = var17.first();
            }
            var12 = (SubLObject)ConsesLow.cons(var14, var12);
            var13 = var13.rest();
            var14 = var13.first();
            var15 = var15.rest();
            var16 = var15.first();
        }
        return Sequences.nreverse(var12);
    }
    
    public static SubLObject f18374(final SubLObject var1) {
        final SubLObject var2 = module0035.f2399(var1, Symbols.symbol_function((SubLObject)$ic6$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var3 = module0035.f2399(var1, Symbols.symbol_function((SubLObject)$ic7$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)makeBoolean(NIL != conses_high.nintersection(var2, Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic8$), var3), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f18375(final SubLObject var21, final SubLObject var7, final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (NIL != f18374(var21)) {
            return (SubLObject)NIL;
        }
        SubLObject var24 = (SubLObject)NIL;
        final SubLObject var25 = f18376(var21);
        final SubLObject var26 = $g2602$.currentBinding(var23);
        try {
            $g2602$.bind(Numbers.add((SubLObject)ONE_INTEGER, var25), var23);
            final SubLObject var27 = module0036.f2532(module0036.f2532(module0036.f2531(var21, Symbols.symbol_function((SubLObject)$ic9$), Symbols.symbol_function((SubLObject)$ic10$), (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)$ic7$), Symbols.symbol_function((SubLObject)$ic8$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)$ic11$), Symbols.symbol_function((SubLObject)$ic12$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var28 = f18373(var7, var22);
            var24 = f18377(module0235.f15481(var27, var28, (SubLObject)T, (SubLObject)UNPROVIDED), var25);
        }
        finally {
            $g2602$.rebind(var26, var23);
        }
        return module0036.f2532(module0036.f2532(var24, Symbols.symbol_function((SubLObject)$ic7$), Symbols.symbol_function((SubLObject)$ic13$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)$ic14$), Symbols.symbol_function((SubLObject)$ic15$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f18378(final SubLObject var14) {
        final SubLObject var15 = module0232.f15306(var14);
        final SubLObject var16 = module0232.f15308(var14);
        final SubLObject var17 = var16.first();
        return (SubLObject)makeBoolean(NIL == var15 && NIL != module0035.f1997(var16) && NIL != module0202.f12598(var17) && NIL != module0213.f14081($ic16$, module0205.f13132(var17)));
    }
    
    public static SubLObject f18379(final SubLObject var31, final SubLObject var2) {
        final SubLThread var32 = SubLProcess.currentSubLThread();
        SubLObject var33 = (SubLObject)NIL;
        final SubLObject var34 = module0146.$g2016$.currentBinding(var32);
        final SubLObject var35 = module0146.$g2018$.currentBinding(var32);
        final SubLObject var36 = module0152.$g2121$.currentBinding(var32);
        final SubLObject var37 = module0146.$g2024$.currentBinding(var32);
        try {
            module0146.$g2016$.bind((SubLObject)NIL, var32);
            module0146.$g2018$.bind((SubLObject)NIL, var32);
            module0152.$g2121$.bind((SubLObject)T, var32);
            module0146.$g2024$.bind((SubLObject)NIL, var32);
            var33 = module0285.f18868(var31, var2);
        }
        finally {
            module0146.$g2024$.rebind(var37, var32);
            module0152.$g2121$.rebind(var36, var32);
            module0146.$g2018$.rebind(var35, var32);
            module0146.$g2016$.rebind(var34, var32);
        }
        return var33;
    }
    
    public static SubLObject f18380(final SubLObject var35) {
        final SubLThread var36 = SubLProcess.currentSubLThread();
        if (NIL != module0146.$g1983$.getDynamicValue(var36)) {
            if (NIL == f18369()) {
                f18381();
            }
            final SubLObject var37 = module0178.f11282(var35);
            final SubLObject var38 = module0178.f11287(var35);
            if (NIL != f18378(var37)) {
                var36.resetMultipleValues();
                final SubLObject var39 = module0202.f12796(module0232.f15308(var37).first());
                final SubLObject var40 = var36.secondMultipleValue();
                final SubLObject var41 = var36.thirdMultipleValue();
                var36.resetMultipleValues();
                final SubLObject var42 = f18379(var41, var38);
                if (NIL == module0206.f13427(var42) && var42.isList()) {
                    Hashtables.sethash(var40, $g2601$.getGlobalValue(), var42);
                    final SubLObject var43 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic17$), var42);
                    final SubLObject var44 = module0205.f13309(var43, (SubLObject)UNPROVIDED);
                    SubLObject var45 = (SubLObject)ZERO_INTEGER;
                    SubLObject var46 = var44;
                    SubLObject var47 = (SubLObject)NIL;
                    var47 = var46.first();
                    while (NIL != var46) {
                        if (NIL != f18370(var47)) {
                            var45 = Numbers.add(var45, (SubLObject)ONE_INTEGER);
                            SubLObject var48 = Hashtables.gethash(var47, $g2599$.getGlobalValue(), (SubLObject)UNPROVIDED);
                            final SubLObject var49 = var40;
                            if (NIL == conses_high.member(var49, var48, Symbols.symbol_function((SubLObject)$ic18$), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                var48 = (SubLObject)ConsesLow.cons(var49, var48);
                            }
                            Hashtables.sethash(var47, $g2599$.getGlobalValue(), var48);
                        }
                        var46 = var46.rest();
                        var47 = var46.first();
                    }
                    Hashtables.sethash(var40, $g2600$.getGlobalValue(), var45);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18382(final SubLObject var35) {
        final SubLThread var36 = SubLProcess.currentSubLThread();
        if (NIL != module0146.$g1983$.getDynamicValue(var36)) {
            if (NIL == f18369()) {
                f18381();
            }
            final SubLObject var37 = module0178.f11282(var35);
            final SubLObject var38 = module0178.f11287(var35);
            if (NIL != f18378(var37)) {
                var36.resetMultipleValues();
                final SubLObject var39 = module0202.f12796(module0232.f15308(var37).first());
                final SubLObject var40 = var36.secondMultipleValue();
                final SubLObject var41 = var36.thirdMultipleValue();
                var36.resetMultipleValues();
                final SubLObject var42 = module0146.$g2018$.currentBinding(var36);
                final SubLObject var43 = module0152.$g2121$.currentBinding(var36);
                final SubLObject var44 = module0146.$g2038$.currentBinding(var36);
                try {
                    module0146.$g2018$.bind((SubLObject)NIL, var36);
                    module0152.$g2121$.bind((SubLObject)T, var36);
                    module0146.$g2038$.bind((SubLObject)T, var36);
                    final SubLObject var45 = module0285.f18868(var41, var38);
                    if (NIL == module0213.f14081($ic19$, var45) && NIL == module0213.f14081($ic20$, var45) && var45.isList()) {
                        Hashtables.remhash(var40, $g2601$.getGlobalValue());
                        final SubLObject var46 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic17$), var45);
                        SubLObject var48;
                        final SubLObject var47 = var48 = module0205.f13309(var46, (SubLObject)UNPROVIDED);
                        SubLObject var49 = (SubLObject)NIL;
                        var49 = var48.first();
                        while (NIL != var48) {
                            if (NIL != f18370(var49)) {
                                final SubLObject var50 = Hashtables.gethash(var49, $g2599$.getGlobalValue(), (SubLObject)UNPROVIDED);
                                if (var50.equal((SubLObject)ConsesLow.list(var40))) {
                                    Hashtables.remhash(var49, $g2599$.getGlobalValue());
                                }
                                else {
                                    Hashtables.sethash(var49, $g2599$.getGlobalValue(), Sequences.delete(var40, var50, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                                }
                            }
                            var48 = var48.rest();
                            var49 = var48.first();
                        }
                        Hashtables.remhash(var40, $g2600$.getGlobalValue());
                    }
                }
                finally {
                    module0146.$g2038$.rebind(var44, var36);
                    module0152.$g2121$.rebind(var43, var36);
                    module0146.$g2018$.rebind(var42, var36);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18381() {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)ZERO_INTEGER;
        if (NIL != module0146.$g1983$.getDynamicValue(var4)) {
            final SubLObject var6 = module0147.$g2094$.currentBinding(var4);
            final SubLObject var7 = module0147.$g2095$.currentBinding(var4);
            try {
                module0147.$g2094$.bind((SubLObject)$ic21$, var4);
                module0147.$g2095$.bind($ic22$, var4);
                final SubLObject var8 = module0219.f14512($ic16$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL != var8) {
                    final SubLObject var9 = var5 = Sequences.length(var8);
                    $g2601$.setGlobalValue(Hashtables.make_hash_table(var9, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED));
                    $g2599$.setGlobalValue(Hashtables.make_hash_table(var9, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED));
                    $g2600$.setGlobalValue(Hashtables.make_hash_table(var9, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED));
                    module0035.f2076(Symbols.symbol_function((SubLObject)$ic23$), var8);
                }
            }
            finally {
                module0147.$g2095$.rebind(var7, var4);
                module0147.$g2094$.rebind(var6, var4);
            }
        }
        return var5;
    }
    
    public static SubLObject f18376(final SubLObject var1) {
        final SubLObject var2 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic24$), module0035.f2399(var1, Symbols.symbol_function((SubLObject)$ic11$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        return (SubLObject)((NIL != var2) ? Functions.apply(Symbols.symbol_function((SubLObject)$ic25$), var2) : ZERO_INTEGER);
    }
    
    public static SubLObject f18377(final SubLObject var51, final SubLObject var52) {
        if (var51.isList() && var51.first().isList()) {
            SubLObject var53 = (SubLObject)NIL;
            SubLObject var54 = var51.first();
            SubLObject var55 = (SubLObject)NIL;
            var55 = var54.first();
            while (NIL != var54) {
                if (var55.isList() && NIL != module0193.f12067(var55.first()) && module0193.f12073(var55.first()).numLE(var52)) {
                    var53 = (SubLObject)ConsesLow.cons(var55, var53);
                }
                var54 = var54.rest();
                var55 = var54.first();
            }
            return (SubLObject)ConsesLow.list(Sequences.nreverse(var53));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18383(final SubLObject var53) {
        final SubLThread var54 = SubLProcess.currentSubLThread();
        final SubLObject var55 = conses_high.copy_tree(var53);
        ConsesLow.rplaca(var55.rest(), module0303.f20123($g2602$.getDynamicValue(var54)));
        $g2602$.setDynamicValue(Numbers.add($g2602$.getDynamicValue(var54), (SubLObject)ONE_INTEGER), var54);
        return var55;
    }
    
    public static SubLObject f18384(final SubLObject var1) {
        final SubLObject var2 = module0205.f13309(var1, (SubLObject)UNPROVIDED);
        final SubLObject var3 = Hashtables.make_hash_table(Hashtables.hash_table_count($g2600$.getGlobalValue()), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = var2;
        SubLObject var6 = (SubLObject)NIL;
        var6 = var5.first();
        while (NIL != var5) {
            SubLObject var17_56 = Hashtables.gethash(var6, $g2599$.getGlobalValue(), (SubLObject)UNPROVIDED);
            SubLObject var7 = (SubLObject)NIL;
            var7 = var17_56.first();
            while (NIL != var17_56) {
                final SubLObject var8 = Hashtables.gethash(var7, var3, (SubLObject)UNPROVIDED);
                Hashtables.sethash(var7, var3, (SubLObject)(var8.isInteger() ? Numbers.add(var8, (SubLObject)ONE_INTEGER) : ONE_INTEGER));
                var17_56 = var17_56.rest();
                var7 = var17_56.first();
            }
            var5 = var5.rest();
            var6 = var5.first();
        }
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        final Iterator var11 = Hashtables.getEntrySetIterator(var3);
        try {
            while (Hashtables.iteratorHasNext(var11)) {
                final Map.Entry var12 = Hashtables.iteratorNextEntry(var11);
                var9 = Hashtables.getEntryKey(var12);
                var10 = Hashtables.getEntryValue(var12);
                if (var10.eql(Hashtables.gethash(var9, $g2600$.getGlobalValue(), (SubLObject)UNPROVIDED))) {
                    var4 = (SubLObject)ConsesLow.cons(var9, var4);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var11);
        }
        return var4;
    }
    
    public static SubLObject f18368(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)NIL;
        if (NIL != module0146.$g1983$.getDynamicValue(var3)) {
            if (NIL == f18369()) {
                f18381();
            }
            final SubLObject var5 = f18379(var1, var2);
            if (var5.isCons()) {
                final SubLObject var6 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic17$), var5);
                final SubLObject var7 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic26$), var5);
                final SubLObject var8 = f18384(var6);
                if (NIL != var8 && NIL == var4) {
                    SubLObject var9 = var8;
                    SubLObject var10 = (SubLObject)NIL;
                    var10 = var9.first();
                    while (NIL == var4 && NIL != var9) {
                        final SubLObject var11 = Hashtables.gethash(var10, $g2601$.getGlobalValue(), (SubLObject)UNPROVIDED);
                        if (NIL != var11 && var11.isList()) {
                            final SubLObject var12 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic17$), var11);
                            final SubLObject var13 = f18375(var12, var6, var7);
                            if (NIL != var13 && NIL != module0035.f2014(var13) && NIL != module0035.f2014(var13.first())) {
                                SubLObject var14 = (SubLObject)NIL;
                                SubLObject var15 = (SubLObject)NIL;
                                SubLObject var16 = var13.first();
                                SubLObject var17 = (SubLObject)NIL;
                                var17 = var16.first();
                                while (NIL != var16) {
                                    if (NIL != module0035.f1996(var17)) {
                                        ConsesLow.rplaca(var17, module0303.f20124(var17.first()));
                                        if (var17.first().isInteger()) {
                                            var14 = (SubLObject)ConsesLow.cons(var17, var14);
                                        }
                                        else {
                                            var15 = (SubLObject)T;
                                        }
                                    }
                                    else {
                                        var15 = (SubLObject)T;
                                    }
                                    var16 = var16.rest();
                                    var17 = var16.first();
                                }
                                if (NIL == var15) {
                                    final SubLObject var18 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic27$), Sort.sort(var14, Symbols.symbol_function((SubLObject)$ic28$), Symbols.symbol_function((SubLObject)$ic29$)));
                                    var4 = module0202.f12720(var10, var18, (SubLObject)UNPROVIDED);
                                }
                            }
                        }
                        var9 = var9.rest();
                        var10 = var9.first();
                    }
                }
            }
        }
        return Values.values((NIL != var4) ? var4 : var1, module0035.sublisp_boolean(var4));
    }
    
    public static SubLObject f18385() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0277", "f18367", "S#20974", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0277", "f18369", "S#20975", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0277", "f18370", "S#20976", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0277", "f18371", "S#20977", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0277", "f18372", "S#20978", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0277", "f18373", "S#20979", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0277", "f18374", "S#20980", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0277", "f18375", "S#20981", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0277", "f18378", "S#20982", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0277", "f18379", "S#20983", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0277", "f18380", "S#20984", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0277", "f18382", "S#20985", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0277", "f18381", "S#20986", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0277", "f18376", "S#20987", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0277", "f18377", "S#20988", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0277", "f18383", "S#20989", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0277", "f18384", "S#20990", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0277", "f18368", "EL-CONTRACTION", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18386() {
        $g2598$ = SubLFiles.deflexical("S#20991", (SubLObject)$ic2$);
        $g2599$ = SubLFiles.deflexical("S#20992", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic3$)) ? $g2599$.getGlobalValue() : NIL));
        $g2600$ = SubLFiles.deflexical("S#20993", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic4$)) ? $g2600$.getGlobalValue() : NIL));
        $g2601$ = SubLFiles.deflexical("S#20994", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic5$)) ? $g2601$.getGlobalValue() : NIL));
        $g2602$ = SubLFiles.defparameter("S#20995", (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f18387() {
        module0003.f57((SubLObject)$ic3$);
        module0003.f57((SubLObject)$ic4$);
        module0003.f57((SubLObject)$ic5$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f18385();
    }
    
    public void initializeVariables() {
        f18386();
    }
    
    public void runTopLevelForms() {
        f18387();
    }
    
    static {
        me = (SubLFile)new module0277();
        $g2598$ = null;
        $g2599$ = null;
        $g2600$ = null;
        $g2601$ = null;
        $g2602$ = null;
        $ic0$ = makeSymbol("S#12753", "CYC");
        $ic1$ = makeSymbol("EL-CONTRACTION");
        $ic2$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("termOfUnit")));
        $ic3$ = makeSymbol("S#20992", "CYC");
        $ic4$ = makeSymbol("S#20993", "CYC");
        $ic5$ = makeSymbol("S#20994", "CYC");
        $ic6$ = makeSymbol("EL-VAR?");
        $ic7$ = makeSymbol("VARIABLE-P");
        $ic8$ = makeSymbol("DEFAULT-EL-VAR-FOR-HL-VAR");
        $ic9$ = makeSymbol("S#15529", "CYC");
        $ic10$ = makeSymbol("S#20989", "CYC");
        $ic11$ = makeSymbol("S#15431", "CYC");
        $ic12$ = makeSymbol("S#20977", "CYC");
        $ic13$ = makeSymbol("S#20978", "CYC");
        $ic14$ = makeSymbol("DEFAULT-EL-VAR?");
        $ic15$ = makeSymbol("HL-VAR-FOR-DEFAULT-EL-VAR");
        $ic16$ = constant_handles_oc.f8479((SubLObject)makeString("expansion"));
        $ic17$ = makeSymbol("FIRST");
        $ic18$ = makeSymbol("S#2879", "CYC");
        $ic19$ = constant_handles_oc.f8479((SubLObject)makeString("True"));
        $ic20$ = constant_handles_oc.f8479((SubLObject)makeString("False"));
        $ic21$ = makeSymbol("S#12274", "CYC");
        $ic22$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic23$ = makeSymbol("S#20984", "CYC");
        $ic24$ = makeSymbol("S#20632", "CYC");
        $ic25$ = makeSymbol("MAX");
        $ic26$ = makeSymbol("SECOND");
        $ic27$ = makeSymbol("CDR");
        $ic28$ = makeSymbol("<");
        $ic29$ = makeSymbol("CAR");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 188 ms
	
	Decompiled with Procyon 0.5.32.
*/