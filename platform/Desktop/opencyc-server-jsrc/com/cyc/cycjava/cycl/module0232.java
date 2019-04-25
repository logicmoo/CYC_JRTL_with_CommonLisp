package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0232 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0232";
    public static final String myFingerPrint = "45d513669d965ead625fbf216539edd81b96aa50b1c9e135770179ab4d7aeedc";
    private static SubLSymbol $g2426$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLString $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLString $ic7$;
    private static final SubLList $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
    private static final SubLString $ic12$;
    private static final SubLList $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLString $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLString $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLString $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLList $ic25$;
    private static final SubLString $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLString $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLString $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLList $ic33$;
    private static final SubLString $ic34$;
    private static final SubLList $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLString $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLString $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLList $ic41$;
    private static final SubLString $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLObject $ic45$;
    private static final SubLObject $ic46$;
    private static final SubLObject $ic47$;
    private static final SubLObject $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLList $ic51$;
    private static final SubLString $ic52$;
    private static final SubLList $ic53$;
    private static final SubLList $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLList $ic56$;
    private static final SubLString $ic57$;
    private static final SubLList $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLList $ic61$;
    private static final SubLString $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLList $ic64$;
    private static final SubLString $ic65$;
    private static final SubLList $ic66$;
    
    public static SubLObject f15304(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var1.isList() && module0232.TWO_INTEGER.numE(Sequences.length(var1)) && var1.first().isList() && conses_high.second(var1).isList());
    }
    
    public static SubLObject f15305(final SubLObject var2, final SubLObject var3) {
        assert module0232.NIL != Types.listp(var2) : var2;
        assert module0232.NIL != Types.listp(var3) : var3;
        return (SubLObject)ConsesLow.list(var2, var3);
    }
    
    public static SubLObject f15306(final SubLObject var4) {
        assert module0232.NIL != f15304(var4) : var4;
        return var4.first();
    }
    
    public static SubLObject f15307(final SubLObject var4, final SubLObject var2) {
        ConsesLow.rplaca(var4, var2);
        return var4;
    }
    
    public static SubLObject f15308(final SubLObject var4) {
        assert module0232.NIL != f15304(var4) : var4;
        return conses_high.second(var4);
    }
    
    public static SubLObject f15309(final SubLObject var4, final SubLObject var3) {
        ConsesLow.rplaca(var4.rest(), var3);
        return var4;
    }
    
    public static SubLObject f15310(final SubLObject var4, final SubLObject var5) {
        assert module0232.NIL != f15304(var4) : var4;
        assert module0232.NIL != module0130.f8516(var5) : var5;
        if (var5.eql((SubLObject)module0232.$ic18$)) {
            return f15306(var4);
        }
        if (var5.eql((SubLObject)module0232.$ic19$)) {
            return f15308(var4);
        }
        return (SubLObject)module0232.NIL;
    }
    
    public static SubLObject f15311(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0232.NIL != f15304(var4) && module0232.NIL != module0193.f12105(var4));
    }
    
    public static SubLObject f15312(final SubLObject var4) {
        if (module0232.NIL != f15304(var4)) {
            final SubLObject var5 = f15306(var4);
            final SubLObject var6 = f15308(var4);
            return (SubLObject)SubLObjectFactory.makeBoolean((module0232.NIL == var5 && module0232.NIL != module0035.f1997(var6)) || (module0232.NIL == var6 && module0232.NIL != module0035.f1997(var5)));
        }
        return (SubLObject)module0232.NIL;
    }
    
    public static SubLObject f15313(final SubLObject var4) {
        if (module0232.NIL != f15304(var4)) {
            SubLObject var5 = (SubLObject)module0232.ZERO_INTEGER;
            SubLObject var6 = f15306(var4);
            SubLObject var7 = (SubLObject)module0232.NIL;
            var7 = var6.first();
            while (module0232.NIL != var6) {
                final SubLObject var8 = (SubLObject)module0232.$ic18$;
                if (module0232.NIL != module0202.f12883(var7, (SubLObject)module0232.UNPROVIDED)) {
                    return (SubLObject)module0232.T;
                }
                var5 = Numbers.add(var5, (SubLObject)module0232.ONE_INTEGER);
                var6 = var6.rest();
                var7 = var6.first();
            }
            var5 = (SubLObject)module0232.ZERO_INTEGER;
            var6 = f15308(var4);
            var7 = (SubLObject)module0232.NIL;
            var7 = var6.first();
            while (module0232.NIL != var6) {
                final SubLObject var8 = (SubLObject)module0232.$ic19$;
                if (module0232.NIL != module0202.f12883(var7, (SubLObject)module0232.UNPROVIDED)) {
                    return (SubLObject)module0232.T;
                }
                var5 = Numbers.add(var5, (SubLObject)module0232.ONE_INTEGER);
                var6 = var6.rest();
                var7 = var6.first();
            }
        }
        return (SubLObject)module0232.NIL;
    }
    
    public static SubLObject f15314(final SubLObject var10, final SubLObject var11) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0232.NIL != f15304(var10) && var10.equal(var11));
    }
    
    public static SubLObject f15315() {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        return module0232.$g2426$.getDynamicValue(var12);
    }
    
    public static SubLObject f15316(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        assert module0232.NIL != f15304(var4) : var4;
        return f15314(var4, module0232.$g2426$.getDynamicValue(var5));
    }
    
    public static SubLObject f15317(final SubLObject var4, final SubLObject var5, final SubLObject var13) {
        assert module0232.NIL != f15304(var4) : var4;
        assert module0232.NIL != module0130.f8516(var5) : var5;
        assert module0232.NIL != Types.integerp(var13) : var13;
        return ConsesLow.nth(var13, (var5 == module0232.$ic19$) ? f15308(var4) : f15306(var4));
    }
    
    public static SubLObject f15318(final SubLObject var4, final SubLObject var5, final SubLObject var13) {
        assert module0232.NIL != f15304(var4) : var4;
        assert module0232.NIL != module0130.f8516(var5) : var5;
        assert module0232.NIL != Types.integerp(var13) : var13;
        SubLObject var14 = conses_high.copy_tree(f15306(var4));
        SubLObject var15 = conses_high.copy_tree(f15308(var4));
        if (var5 == module0232.$ic19$) {
            var15 = module0035.f2045(var13, var15);
        }
        else {
            var14 = module0035.f2045(var13, var14);
        }
        return f15305(var14, var15);
    }
    
    public static SubLObject f15319(final SubLObject var2, final SubLObject var3) {
        return f15305(var2, var3);
    }
    
    public static SubLObject f15320(final SubLObject var1) {
        return f15304(var1);
    }
    
    public static SubLObject f15321(final SubLObject var1) {
        return f15304(var1);
    }
    
    public static SubLObject f15322(final SubLObject var14) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0232.NIL != module0204.f13044(var14) && module0232.NIL != f15311(var14));
    }
    
    public static SubLObject f15323(final SubLObject var1) {
        return f15324(var1);
    }
    
    public static SubLObject f15324(final SubLObject var1) {
        if (module0232.NIL != module0035.f2015(var1)) {
            SubLObject var2 = var1;
            SubLObject var3 = (SubLObject)module0232.NIL;
            var3 = var2.first();
            while (module0232.NIL != var2) {
                if (module0232.NIL == f15320(var3)) {
                    return (SubLObject)module0232.NIL;
                }
                var2 = var2.rest();
                var3 = var2.first();
            }
            return (SubLObject)module0232.T;
        }
        return (SubLObject)module0232.NIL;
    }
    
    public static SubLObject f15325(final SubLObject var1) {
        if (module0232.NIL != module0035.f2015(var1)) {
            SubLObject var2 = var1;
            SubLObject var3 = (SubLObject)module0232.NIL;
            var3 = var2.first();
            while (module0232.NIL != var2) {
                if (module0232.NIL == f15321(var3)) {
                    return (SubLObject)module0232.NIL;
                }
                var2 = var2.rest();
                var3 = var2.first();
            }
            return (SubLObject)module0232.T;
        }
        return (SubLObject)module0232.NIL;
    }
    
    public static SubLObject f15326(final SubLObject var2, final SubLObject var3) {
        return f15305(var2, var3);
    }
    
    public static SubLObject f15327(final SubLObject var15, final SubLObject var16) {
        return f15314(var15, var16);
    }
    
    public static SubLObject f15328(SubLObject var14, SubLObject var17) {
        if (var17 == module0232.UNPROVIDED) {
            var17 = (SubLObject)module0232.$ic43$;
        }
        assert module0232.NIL != f15320(var14) : var14;
        assert module0232.NIL != module0130.f8511(var17) : var17;
        var14 = module0279.f18587(var14, (SubLObject)module0232.UNPROVIDED);
        SubLObject var18 = f15308(var14);
        SubLObject var19 = f15306(var14);
        if (module0232.NIL != var19.rest()) {
            var19 = (SubLObject)ConsesLow.cons(module0232.$ic45$, var19);
        }
        else {
            var19 = var19.first();
        }
        if (module0232.NIL != var18.rest()) {
            var18 = (SubLObject)ConsesLow.cons(module0232.$ic46$, var18);
        }
        else {
            var18 = var18.first();
        }
        if (module0232.NIL != var18 && module0232.NIL != var19) {
            return (SubLObject)ConsesLow.list(module0232.$ic47$, var19, var18);
        }
        if (module0232.NIL != var19) {
            return (SubLObject)ConsesLow.list(module0232.$ic48$, var19);
        }
        if (module0232.NIL == var18) {
            return (SubLObject)module0232.NIL;
        }
        if (module0232.NIL != f15308(var14).rest() || module0232.NIL == module0193.f12105(var18) || var17 != module0232.$ic49$) {
            return var18;
        }
        return (SubLObject)ConsesLow.list(module0232.$ic48$, var18);
    }
    
    public static SubLObject f15329(final SubLObject var18) {
        assert module0232.NIL != Types.listp(var18) : var18;
        assert module0232.NIL != Types.listp(var18) : var18;
        if (Sequences.length(var18).numE((SubLObject)module0232.ONE_INTEGER)) {
            return f15328(var18.first(), (SubLObject)module0232.UNPROVIDED);
        }
        return reader.bq_cons(module0232.$ic45$, ConsesLow.append(Mapping.mapcar(Symbols.symbol_function((SubLObject)module0232.$ic50$), var18), (SubLObject)module0232.NIL));
    }
    
    public static SubLObject f15330(final SubLObject var2, final SubLObject var3) {
        return f15305(var2, var3);
    }
    
    public static SubLObject f15331(final SubLObject var19, final SubLObject var5, final SubLObject var13) {
        return f15317(var19, var5, var13);
    }
    
    public static SubLObject f15332(final SubLObject var19) {
        final SubLObject var20 = f15308(var19);
        final SubLObject var21 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0232.$ic59$), f15306(var19));
        if (module0232.NIL == var21) {
            if (module0232.NIL != var20.rest()) {
                return reader.bq_cons(module0232.$ic45$, ConsesLow.append(var20, (SubLObject)module0232.NIL));
            }
            return var20.first();
        }
        else {
            if (module0232.NIL != var20) {
                return reader.bq_cons(module0232.$ic45$, ConsesLow.append(ConsesLow.append(var21, var20), (SubLObject)module0232.NIL));
            }
            if (module0232.NIL != var21.rest()) {
                return reader.bq_cons(module0232.$ic45$, ConsesLow.append(var21, (SubLObject)module0232.NIL));
            }
            return var21.first();
        }
    }
    
    public static SubLObject f15333(final SubLObject var20) {
        assert module0232.NIL != Types.listp(var20) : var20;
        assert module0232.NIL != Types.listp(var20) : var20;
        if (Sequences.length(var20).numE((SubLObject)module0232.ONE_INTEGER)) {
            return f15332(var20.first());
        }
        return reader.bq_cons(module0232.$ic46$, ConsesLow.append(Mapping.mapcar(Symbols.symbol_function((SubLObject)module0232.$ic60$), var20), (SubLObject)module0232.NIL));
    }
    
    public static SubLObject f15334() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0232", "f15304", "CLAUSE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0232", "f15305", "MAKE-CLAUSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0232", "f15306", "NEG-LITS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0232", "f15307", "S#18058", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0232", "f15308", "POS-LITS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0232", "f15309", "S#18059", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0232", "f15310", "S#12758", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0232", "f15311", "GROUND-CLAUSE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0232", "f15312", "ATOMIC-CLAUSE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0232", "f15313", "S#14096", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0232", "f15314", "CLAUSE-EQUAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0232", "f15315", "EMPTY-CLAUSE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0232", "f15316", "EMPTY-CLAUSE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0232", "f15317", "CLAUSE-LITERAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0232", "f15318", "CLAUSE-WITHOUT-LITERAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0232", "f15319", "S#18060", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0232", "f15320", "CNF-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0232", "f15321", "S#18061", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0232", "f15322", "GAF-CNF?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0232", "f15323", "S#18062", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0232", "f15324", "S#18063", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0232", "f15325", "S#18064", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0232", "f15326", "S#15929", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0232", "f15327", "S#18065", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0232", "f15328", "CNF-FORMULA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0232", "f15329", "CNF-FORMULA-FROM-CLAUSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0232", "f15330", "S#15930", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0232", "f15331", "S#18066", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0232", "f15332", "DNF-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0232", "f15333", "DNF-FORMULA-FROM-CLAUSES", 1, 0, false);
        return (SubLObject)module0232.NIL;
    }
    
    public static SubLObject f15335() {
        module0232.$g2426$ = SubLFiles.defparameter("S#18067", f15305((SubLObject)module0232.NIL, (SubLObject)module0232.NIL));
        return (SubLObject)module0232.NIL;
    }
    
    public static SubLObject f15336() {
        module0012.f368((SubLObject)module0232.$ic0$, (SubLObject)module0232.$ic1$, (SubLObject)module0232.$ic2$, (SubLObject)module0232.NIL, (SubLObject)module0232.$ic3$);
        module0012.f368((SubLObject)module0232.$ic5$, (SubLObject)module0232.$ic6$, (SubLObject)module0232.$ic7$, (SubLObject)module0232.$ic8$, (SubLObject)module0232.$ic9$);
        module0012.f368((SubLObject)module0232.$ic10$, (SubLObject)module0232.$ic11$, (SubLObject)module0232.$ic12$, (SubLObject)module0232.$ic13$, (SubLObject)module0232.$ic14$);
        module0012.f368((SubLObject)module0232.$ic15$, (SubLObject)module0232.$ic11$, (SubLObject)module0232.$ic16$, (SubLObject)module0232.$ic13$, (SubLObject)module0232.$ic14$);
        module0012.f368((SubLObject)module0232.$ic20$, (SubLObject)module0232.$ic11$, (SubLObject)module0232.$ic21$, (SubLObject)module0232.NIL, (SubLObject)module0232.$ic3$);
        module0012.f368((SubLObject)module0232.$ic22$, (SubLObject)module0232.$ic11$, (SubLObject)module0232.$ic23$, (SubLObject)module0232.NIL, (SubLObject)module0232.$ic3$);
        module0012.f368((SubLObject)module0232.$ic24$, (SubLObject)module0232.$ic25$, (SubLObject)module0232.$ic26$, (SubLObject)module0232.NIL, (SubLObject)module0232.$ic3$);
        module0012.f368((SubLObject)module0232.$ic27$, (SubLObject)module0232.NIL, (SubLObject)module0232.$ic28$, (SubLObject)module0232.NIL, (SubLObject)module0232.$ic9$);
        module0012.f368((SubLObject)module0232.$ic29$, (SubLObject)module0232.$ic11$, (SubLObject)module0232.$ic30$, (SubLObject)module0232.$ic13$, (SubLObject)module0232.$ic3$);
        module0012.f368((SubLObject)module0232.$ic32$, (SubLObject)module0232.$ic33$, (SubLObject)module0232.$ic34$, (SubLObject)module0232.$ic35$, (SubLObject)module0232.NIL);
        module0012.f368((SubLObject)module0232.$ic36$, (SubLObject)module0232.$ic33$, (SubLObject)module0232.$ic37$, (SubLObject)module0232.$ic35$, (SubLObject)module0232.$ic9$);
        module0012.f368((SubLObject)module0232.$ic38$, (SubLObject)module0232.$ic1$, (SubLObject)module0232.$ic39$, (SubLObject)module0232.NIL, (SubLObject)module0232.$ic3$);
        module0012.f368((SubLObject)module0232.$ic40$, (SubLObject)module0232.$ic41$, (SubLObject)module0232.$ic42$, (SubLObject)module0232.NIL, (SubLObject)module0232.$ic3$);
        module0012.f368((SubLObject)module0232.$ic50$, (SubLObject)module0232.$ic51$, (SubLObject)module0232.$ic52$, (SubLObject)module0232.$ic53$, (SubLObject)module0232.$ic54$);
        module0012.f368((SubLObject)module0232.$ic55$, (SubLObject)module0232.$ic56$, (SubLObject)module0232.$ic57$, (SubLObject)module0232.$ic58$, (SubLObject)module0232.$ic54$);
        module0012.f368((SubLObject)module0232.$ic60$, (SubLObject)module0232.$ic61$, (SubLObject)module0232.$ic62$, (SubLObject)module0232.NIL, (SubLObject)module0232.$ic54$);
        module0012.f368((SubLObject)module0232.$ic63$, (SubLObject)module0232.$ic64$, (SubLObject)module0232.$ic65$, (SubLObject)module0232.$ic66$, (SubLObject)module0232.$ic54$);
        return (SubLObject)module0232.NIL;
    }
    
    public void declareFunctions() {
        f15334();
    }
    
    public void initializeVariables() {
        f15335();
    }
    
    public void runTopLevelForms() {
        f15336();
    }
    
    static {
        me = (SubLFile)new module0232();
        module0232.$g2426$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("CLAUSE-P");
        $ic1$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT", "CYC"));
        $ic2$ = SubLObjectFactory.makeString("Returns T iff OBJECT is either a CNF or DNF clause.");
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $ic4$ = SubLObjectFactory.makeSymbol("LISTP");
        $ic5$ = SubLObjectFactory.makeSymbol("MAKE-CLAUSE");
        $ic6$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEG-LITS"), (SubLObject)SubLObjectFactory.makeSymbol("POS-LITS"));
        $ic7$ = SubLObjectFactory.makeString("Construct a clause from NEG-LITS and POS-LITS, each of which are lists of literals.");
        $ic8$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEG-LITS"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POS-LITS"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")));
        $ic9$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLAUSE-P"));
        $ic10$ = SubLObjectFactory.makeSymbol("NEG-LITS");
        $ic11$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15215", "CYC"));
        $ic12$ = SubLObjectFactory.makeString("Return the neg-lits of CLAUSE.");
        $ic13$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15215", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("CLAUSE-P")));
        $ic14$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"));
        $ic15$ = SubLObjectFactory.makeSymbol("POS-LITS");
        $ic16$ = SubLObjectFactory.makeString("Return the pos-lits of CLAUSE.");
        $ic17$ = SubLObjectFactory.makeSymbol("SENSE-P");
        $ic18$ = SubLObjectFactory.makeKeyword("NEG");
        $ic19$ = SubLObjectFactory.makeKeyword("POS");
        $ic20$ = SubLObjectFactory.makeSymbol("GROUND-CLAUSE-P");
        $ic21$ = SubLObjectFactory.makeString("Return T iff CLAUSE is a ground clause.");
        $ic22$ = SubLObjectFactory.makeSymbol("ATOMIC-CLAUSE-P");
        $ic23$ = SubLObjectFactory.makeString("Return T iff CLAUSE is an atomic clause.");
        $ic24$ = SubLObjectFactory.makeSymbol("CLAUSE-EQUAL");
        $ic25$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#18068", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#18069", "CYC"));
        $ic26$ = SubLObjectFactory.makeString("Return T iff CLAUSE1 and CLAUSE2 are both equivalent clauses.");
        $ic27$ = SubLObjectFactory.makeSymbol("EMPTY-CLAUSE");
        $ic28$ = SubLObjectFactory.makeString("Return the empty clause.");
        $ic29$ = SubLObjectFactory.makeSymbol("EMPTY-CLAUSE?");
        $ic30$ = SubLObjectFactory.makeString("Return T iff CLAUSE is empty.");
        $ic31$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic32$ = SubLObjectFactory.makeSymbol("CLAUSE-LITERAL");
        $ic33$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15215", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12397", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1993", "CYC"));
        $ic34$ = SubLObjectFactory.makeString("Return literal in CLAUSE specified by SENSE and NUM.\n  SENSE must be either :pos or :neg.");
        $ic35$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15215", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("CLAUSE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12397", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1993", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")));
        $ic36$ = SubLObjectFactory.makeSymbol("CLAUSE-WITHOUT-LITERAL");
        $ic37$ = SubLObjectFactory.makeString("Return a new clause which is CLAUSE without the literal specified by SENSE and NUM.\n  SENSE must be either :pos or :neg.");
        $ic38$ = SubLObjectFactory.makeSymbol("CNF-P");
        $ic39$ = SubLObjectFactory.makeString("Returns T iff OBJECT is a canonicalized CycL formula in conjunctive normal form.");
        $ic40$ = SubLObjectFactory.makeSymbol("GAF-CNF?");
        $ic41$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13916", "CYC"));
        $ic42$ = SubLObjectFactory.makeString("Return T iff CNF is a cnf representation of a gaf formula.");
        $ic43$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic44$ = SubLObjectFactory.makeSymbol("TRUTH-P");
        $ic45$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("and"));
        $ic46$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("or"));
        $ic47$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("implies"));
        $ic48$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("not"));
        $ic49$ = SubLObjectFactory.makeKeyword("FALSE");
        $ic50$ = SubLObjectFactory.makeSymbol("CNF-FORMULA");
        $ic51$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13916", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12576", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")));
        $ic52$ = SubLObjectFactory.makeString("Return a readable formula of CNF\n   TRUTH only gets looked at for ground, single pos lit cnfs\n   in which case TRUTH gives the truth of the gaf.");
        $ic53$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13916", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("CNF-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12576", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH-P")));
        $ic54$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12753", "CYC"));
        $ic55$ = SubLObjectFactory.makeSymbol("CNF-FORMULA-FROM-CLAUSES");
        $ic56$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#18070", "CYC"));
        $ic57$ = SubLObjectFactory.makeString("Return a readable formula from a list of CNF-CLAUSES.");
        $ic58$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#18070", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")));
        $ic59$ = SubLObjectFactory.makeSymbol("NEGATE");
        $ic60$ = SubLObjectFactory.makeSymbol("DNF-FORMULA");
        $ic61$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#18071", "CYC"));
        $ic62$ = SubLObjectFactory.makeString("Return a readable formula of DNF.");
        $ic63$ = SubLObjectFactory.makeSymbol("DNF-FORMULA-FROM-CLAUSES");
        $ic64$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#18072", "CYC"));
        $ic65$ = SubLObjectFactory.makeString("Return a readable formula from a list of DNF-CLAUSES.");
        $ic66$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#18072", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0232.class
	Total time: 137 ms
	
	Decompiled with Procyon 0.5.32.
*/