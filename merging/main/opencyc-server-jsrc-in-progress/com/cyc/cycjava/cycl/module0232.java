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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        return (SubLObject)makeBoolean(var1.isList() && TWO_INTEGER.numE(Sequences.length(var1)) && var1.first().isList() && conses_high.second(var1).isList());
    }
    
    public static SubLObject f15305(final SubLObject var2, final SubLObject var3) {
        assert NIL != Types.listp(var2) : var2;
        assert NIL != Types.listp(var3) : var3;
        return (SubLObject)ConsesLow.list(var2, var3);
    }
    
    public static SubLObject f15306(final SubLObject var4) {
        assert NIL != f15304(var4) : var4;
        return var4.first();
    }
    
    public static SubLObject f15307(final SubLObject var4, final SubLObject var2) {
        ConsesLow.rplaca(var4, var2);
        return var4;
    }
    
    public static SubLObject f15308(final SubLObject var4) {
        assert NIL != f15304(var4) : var4;
        return conses_high.second(var4);
    }
    
    public static SubLObject f15309(final SubLObject var4, final SubLObject var3) {
        ConsesLow.rplaca(var4.rest(), var3);
        return var4;
    }
    
    public static SubLObject f15310(final SubLObject var4, final SubLObject var5) {
        assert NIL != f15304(var4) : var4;
        assert NIL != module0130.f8516(var5) : var5;
        if (var5.eql((SubLObject)$ic18$)) {
            return f15306(var4);
        }
        if (var5.eql((SubLObject)$ic19$)) {
            return f15308(var4);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15311(final SubLObject var4) {
        return (SubLObject)makeBoolean(NIL != f15304(var4) && NIL != module0193.f12105(var4));
    }
    
    public static SubLObject f15312(final SubLObject var4) {
        if (NIL != f15304(var4)) {
            final SubLObject var5 = f15306(var4);
            final SubLObject var6 = f15308(var4);
            return (SubLObject)makeBoolean((NIL == var5 && NIL != module0035.f1997(var6)) || (NIL == var6 && NIL != module0035.f1997(var5)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15313(final SubLObject var4) {
        if (NIL != f15304(var4)) {
            SubLObject var5 = (SubLObject)ZERO_INTEGER;
            SubLObject var6 = f15306(var4);
            SubLObject var7 = (SubLObject)NIL;
            var7 = var6.first();
            while (NIL != var6) {
                final SubLObject var8 = (SubLObject)$ic18$;
                if (NIL != module0202.f12883(var7, (SubLObject)UNPROVIDED)) {
                    return (SubLObject)T;
                }
                var5 = Numbers.add(var5, (SubLObject)ONE_INTEGER);
                var6 = var6.rest();
                var7 = var6.first();
            }
            var5 = (SubLObject)ZERO_INTEGER;
            var6 = f15308(var4);
            var7 = (SubLObject)NIL;
            var7 = var6.first();
            while (NIL != var6) {
                final SubLObject var8 = (SubLObject)$ic19$;
                if (NIL != module0202.f12883(var7, (SubLObject)UNPROVIDED)) {
                    return (SubLObject)T;
                }
                var5 = Numbers.add(var5, (SubLObject)ONE_INTEGER);
                var6 = var6.rest();
                var7 = var6.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15314(final SubLObject var10, final SubLObject var11) {
        return (SubLObject)makeBoolean(NIL != f15304(var10) && var10.equal(var11));
    }
    
    public static SubLObject f15315() {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        return $g2426$.getDynamicValue(var12);
    }
    
    public static SubLObject f15316(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        assert NIL != f15304(var4) : var4;
        return f15314(var4, $g2426$.getDynamicValue(var5));
    }
    
    public static SubLObject f15317(final SubLObject var4, final SubLObject var5, final SubLObject var13) {
        assert NIL != f15304(var4) : var4;
        assert NIL != module0130.f8516(var5) : var5;
        assert NIL != Types.integerp(var13) : var13;
        return ConsesLow.nth(var13, (var5 == $ic19$) ? f15308(var4) : f15306(var4));
    }
    
    public static SubLObject f15318(final SubLObject var4, final SubLObject var5, final SubLObject var13) {
        assert NIL != f15304(var4) : var4;
        assert NIL != module0130.f8516(var5) : var5;
        assert NIL != Types.integerp(var13) : var13;
        SubLObject var14 = conses_high.copy_tree(f15306(var4));
        SubLObject var15 = conses_high.copy_tree(f15308(var4));
        if (var5 == $ic19$) {
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
        return (SubLObject)makeBoolean(NIL != module0204.f13044(var14) && NIL != f15311(var14));
    }
    
    public static SubLObject f15323(final SubLObject var1) {
        return f15324(var1);
    }
    
    public static SubLObject f15324(final SubLObject var1) {
        if (NIL != module0035.f2015(var1)) {
            SubLObject var2 = var1;
            SubLObject var3 = (SubLObject)NIL;
            var3 = var2.first();
            while (NIL != var2) {
                if (NIL == f15320(var3)) {
                    return (SubLObject)NIL;
                }
                var2 = var2.rest();
                var3 = var2.first();
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15325(final SubLObject var1) {
        if (NIL != module0035.f2015(var1)) {
            SubLObject var2 = var1;
            SubLObject var3 = (SubLObject)NIL;
            var3 = var2.first();
            while (NIL != var2) {
                if (NIL == f15321(var3)) {
                    return (SubLObject)NIL;
                }
                var2 = var2.rest();
                var3 = var2.first();
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15326(final SubLObject var2, final SubLObject var3) {
        return f15305(var2, var3);
    }
    
    public static SubLObject f15327(final SubLObject var15, final SubLObject var16) {
        return f15314(var15, var16);
    }
    
    public static SubLObject f15328(SubLObject var14, SubLObject var17) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)$ic43$;
        }
        assert NIL != f15320(var14) : var14;
        assert NIL != module0130.f8511(var17) : var17;
        var14 = module0279.f18587(var14, (SubLObject)UNPROVIDED);
        SubLObject var18 = f15308(var14);
        SubLObject var19 = f15306(var14);
        if (NIL != var19.rest()) {
            var19 = (SubLObject)ConsesLow.cons($ic45$, var19);
        }
        else {
            var19 = var19.first();
        }
        if (NIL != var18.rest()) {
            var18 = (SubLObject)ConsesLow.cons($ic46$, var18);
        }
        else {
            var18 = var18.first();
        }
        if (NIL != var18 && NIL != var19) {
            return (SubLObject)ConsesLow.list($ic47$, var19, var18);
        }
        if (NIL != var19) {
            return (SubLObject)ConsesLow.list($ic48$, var19);
        }
        if (NIL == var18) {
            return (SubLObject)NIL;
        }
        if (NIL != f15308(var14).rest() || NIL == module0193.f12105(var18) || var17 != $ic49$) {
            return var18;
        }
        return (SubLObject)ConsesLow.list($ic48$, var18);
    }
    
    public static SubLObject f15329(final SubLObject var18) {
        assert NIL != Types.listp(var18) : var18;
        assert NIL != Types.listp(var18) : var18;
        if (Sequences.length(var18).numE((SubLObject)ONE_INTEGER)) {
            return f15328(var18.first(), (SubLObject)UNPROVIDED);
        }
        return reader.bq_cons($ic45$, ConsesLow.append(Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic50$), var18), (SubLObject)NIL));
    }
    
    public static SubLObject f15330(final SubLObject var2, final SubLObject var3) {
        return f15305(var2, var3);
    }
    
    public static SubLObject f15331(final SubLObject var19, final SubLObject var5, final SubLObject var13) {
        return f15317(var19, var5, var13);
    }
    
    public static SubLObject f15332(final SubLObject var19) {
        final SubLObject var20 = f15308(var19);
        final SubLObject var21 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic59$), f15306(var19));
        if (NIL == var21) {
            if (NIL != var20.rest()) {
                return reader.bq_cons($ic45$, ConsesLow.append(var20, (SubLObject)NIL));
            }
            return var20.first();
        }
        else {
            if (NIL != var20) {
                return reader.bq_cons($ic45$, ConsesLow.append(ConsesLow.append(var21, var20), (SubLObject)NIL));
            }
            if (NIL != var21.rest()) {
                return reader.bq_cons($ic45$, ConsesLow.append(var21, (SubLObject)NIL));
            }
            return var21.first();
        }
    }
    
    public static SubLObject f15333(final SubLObject var20) {
        assert NIL != Types.listp(var20) : var20;
        assert NIL != Types.listp(var20) : var20;
        if (Sequences.length(var20).numE((SubLObject)ONE_INTEGER)) {
            return f15332(var20.first());
        }
        return reader.bq_cons($ic46$, ConsesLow.append(Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic60$), var20), (SubLObject)NIL));
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15335() {
        $g2426$ = SubLFiles.defparameter("S#18067", f15305((SubLObject)NIL, (SubLObject)NIL));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15336() {
        module0012.f368((SubLObject)$ic0$, (SubLObject)$ic1$, (SubLObject)$ic2$, (SubLObject)NIL, (SubLObject)$ic3$);
        module0012.f368((SubLObject)$ic5$, (SubLObject)$ic6$, (SubLObject)$ic7$, (SubLObject)$ic8$, (SubLObject)$ic9$);
        module0012.f368((SubLObject)$ic10$, (SubLObject)$ic11$, (SubLObject)$ic12$, (SubLObject)$ic13$, (SubLObject)$ic14$);
        module0012.f368((SubLObject)$ic15$, (SubLObject)$ic11$, (SubLObject)$ic16$, (SubLObject)$ic13$, (SubLObject)$ic14$);
        module0012.f368((SubLObject)$ic20$, (SubLObject)$ic11$, (SubLObject)$ic21$, (SubLObject)NIL, (SubLObject)$ic3$);
        module0012.f368((SubLObject)$ic22$, (SubLObject)$ic11$, (SubLObject)$ic23$, (SubLObject)NIL, (SubLObject)$ic3$);
        module0012.f368((SubLObject)$ic24$, (SubLObject)$ic25$, (SubLObject)$ic26$, (SubLObject)NIL, (SubLObject)$ic3$);
        module0012.f368((SubLObject)$ic27$, (SubLObject)NIL, (SubLObject)$ic28$, (SubLObject)NIL, (SubLObject)$ic9$);
        module0012.f368((SubLObject)$ic29$, (SubLObject)$ic11$, (SubLObject)$ic30$, (SubLObject)$ic13$, (SubLObject)$ic3$);
        module0012.f368((SubLObject)$ic32$, (SubLObject)$ic33$, (SubLObject)$ic34$, (SubLObject)$ic35$, (SubLObject)NIL);
        module0012.f368((SubLObject)$ic36$, (SubLObject)$ic33$, (SubLObject)$ic37$, (SubLObject)$ic35$, (SubLObject)$ic9$);
        module0012.f368((SubLObject)$ic38$, (SubLObject)$ic1$, (SubLObject)$ic39$, (SubLObject)NIL, (SubLObject)$ic3$);
        module0012.f368((SubLObject)$ic40$, (SubLObject)$ic41$, (SubLObject)$ic42$, (SubLObject)NIL, (SubLObject)$ic3$);
        module0012.f368((SubLObject)$ic50$, (SubLObject)$ic51$, (SubLObject)$ic52$, (SubLObject)$ic53$, (SubLObject)$ic54$);
        module0012.f368((SubLObject)$ic55$, (SubLObject)$ic56$, (SubLObject)$ic57$, (SubLObject)$ic58$, (SubLObject)$ic54$);
        module0012.f368((SubLObject)$ic60$, (SubLObject)$ic61$, (SubLObject)$ic62$, (SubLObject)NIL, (SubLObject)$ic54$);
        module0012.f368((SubLObject)$ic63$, (SubLObject)$ic64$, (SubLObject)$ic65$, (SubLObject)$ic66$, (SubLObject)$ic54$);
        return (SubLObject)NIL;
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
        $g2426$ = null;
        $ic0$ = makeSymbol("CLAUSE-P");
        $ic1$ = ConsesLow.list((SubLObject)makeSymbol("OBJECT", "CYC"));
        $ic2$ = makeString("Returns T iff OBJECT is either a CNF or DNF clause.");
        $ic3$ = ConsesLow.list((SubLObject)makeSymbol("BOOLEANP"));
        $ic4$ = makeSymbol("LISTP");
        $ic5$ = makeSymbol("MAKE-CLAUSE");
        $ic6$ = ConsesLow.list((SubLObject)makeSymbol("NEG-LITS"), (SubLObject)makeSymbol("POS-LITS"));
        $ic7$ = makeString("Construct a clause from NEG-LITS and POS-LITS, each of which are lists of literals.");
        $ic8$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("NEG-LITS"), (SubLObject)makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("POS-LITS"), (SubLObject)makeSymbol("LISTP")));
        $ic9$ = ConsesLow.list((SubLObject)makeSymbol("CLAUSE-P"));
        $ic10$ = makeSymbol("NEG-LITS");
        $ic11$ = ConsesLow.list((SubLObject)makeSymbol("S#15215", "CYC"));
        $ic12$ = makeString("Return the neg-lits of CLAUSE.");
        $ic13$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#15215", "CYC"), (SubLObject)makeSymbol("CLAUSE-P")));
        $ic14$ = ConsesLow.list((SubLObject)makeSymbol("LISTP"));
        $ic15$ = makeSymbol("POS-LITS");
        $ic16$ = makeString("Return the pos-lits of CLAUSE.");
        $ic17$ = makeSymbol("SENSE-P");
        $ic18$ = makeKeyword("NEG");
        $ic19$ = makeKeyword("POS");
        $ic20$ = makeSymbol("GROUND-CLAUSE-P");
        $ic21$ = makeString("Return T iff CLAUSE is a ground clause.");
        $ic22$ = makeSymbol("ATOMIC-CLAUSE-P");
        $ic23$ = makeString("Return T iff CLAUSE is an atomic clause.");
        $ic24$ = makeSymbol("CLAUSE-EQUAL");
        $ic25$ = ConsesLow.list((SubLObject)makeSymbol("S#18068", "CYC"), (SubLObject)makeSymbol("S#18069", "CYC"));
        $ic26$ = makeString("Return T iff CLAUSE1 and CLAUSE2 are both equivalent clauses.");
        $ic27$ = makeSymbol("EMPTY-CLAUSE");
        $ic28$ = makeString("Return the empty clause.");
        $ic29$ = makeSymbol("EMPTY-CLAUSE?");
        $ic30$ = makeString("Return T iff CLAUSE is empty.");
        $ic31$ = makeSymbol("INTEGERP");
        $ic32$ = makeSymbol("CLAUSE-LITERAL");
        $ic33$ = ConsesLow.list((SubLObject)makeSymbol("S#15215", "CYC"), (SubLObject)makeSymbol("S#12397", "CYC"), (SubLObject)makeSymbol("S#1993", "CYC"));
        $ic34$ = makeString("Return literal in CLAUSE specified by SENSE and NUM.\n  SENSE must be either :pos or :neg.");
        $ic35$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#15215", "CYC"), (SubLObject)makeSymbol("CLAUSE-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12397", "CYC"), (SubLObject)makeSymbol("SENSE-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#1993", "CYC"), (SubLObject)makeSymbol("INTEGERP")));
        $ic36$ = makeSymbol("CLAUSE-WITHOUT-LITERAL");
        $ic37$ = makeString("Return a new clause which is CLAUSE without the literal specified by SENSE and NUM.\n  SENSE must be either :pos or :neg.");
        $ic38$ = makeSymbol("CNF-P");
        $ic39$ = makeString("Returns T iff OBJECT is a canonicalized CycL formula in conjunctive normal form.");
        $ic40$ = makeSymbol("GAF-CNF?");
        $ic41$ = ConsesLow.list((SubLObject)makeSymbol("S#13916", "CYC"));
        $ic42$ = makeString("Return T iff CNF is a cnf representation of a gaf formula.");
        $ic43$ = makeKeyword("TRUE");
        $ic44$ = makeSymbol("TRUTH-P");
        $ic45$ = constant_handles_oc.f8479((SubLObject)makeString("and"));
        $ic46$ = constant_handles_oc.f8479((SubLObject)makeString("or"));
        $ic47$ = constant_handles_oc.f8479((SubLObject)makeString("implies"));
        $ic48$ = constant_handles_oc.f8479((SubLObject)makeString("not"));
        $ic49$ = makeKeyword("FALSE");
        $ic50$ = makeSymbol("CNF-FORMULA");
        $ic51$ = ConsesLow.list((SubLObject)makeSymbol("S#13916", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12576", "CYC"), (SubLObject)makeKeyword("TRUE")));
        $ic52$ = makeString("Return a readable formula of CNF\n   TRUTH only gets looked at for ground, single pos lit cnfs\n   in which case TRUTH gives the truth of the gaf.");
        $ic53$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#13916", "CYC"), (SubLObject)makeSymbol("CNF-P")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12576", "CYC"), (SubLObject)makeSymbol("TRUTH-P")));
        $ic54$ = ConsesLow.list((SubLObject)makeSymbol("S#12753", "CYC"));
        $ic55$ = makeSymbol("CNF-FORMULA-FROM-CLAUSES");
        $ic56$ = ConsesLow.list((SubLObject)makeSymbol("S#18070", "CYC"));
        $ic57$ = makeString("Return a readable formula from a list of CNF-CLAUSES.");
        $ic58$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#18070", "CYC"), (SubLObject)makeSymbol("LISTP")));
        $ic59$ = makeSymbol("NEGATE");
        $ic60$ = makeSymbol("DNF-FORMULA");
        $ic61$ = ConsesLow.list((SubLObject)makeSymbol("S#18071", "CYC"));
        $ic62$ = makeString("Return a readable formula of DNF.");
        $ic63$ = makeSymbol("DNF-FORMULA-FROM-CLAUSES");
        $ic64$ = ConsesLow.list((SubLObject)makeSymbol("S#18072", "CYC"));
        $ic65$ = makeString("Return a readable formula from a list of DNF-CLAUSES.");
        $ic66$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#18072", "CYC"), (SubLObject)makeSymbol("LISTP")));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 137 ms
	
	Decompiled with Procyon 0.5.32.
*/