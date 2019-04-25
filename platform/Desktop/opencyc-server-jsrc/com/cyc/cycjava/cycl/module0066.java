package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.hashtables_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0066 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0066";
    public static final String myFingerPrint = "38441dd2e1027d58d355cf0da983ad84affb3056840f31dc55b0a2c3eb3ac19f";
    private static SubLSymbol $g1083$;
    private static SubLSymbol $g1084$;
    private static final SubLInteger $ic0$;
    private static final SubLInteger $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLList $ic7$;
    private static final SubLList $ic8$;
    private static final SubLList $ic9$;
    private static final SubLList $ic10$;
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
    
    public static SubLObject f4812(final SubLObject var1) {
        if (NIL != module0035.f2292(var1)) {
            return (SubLObject)$ic3$;
        }
        if (var1.isHashtable()) {
            return (SubLObject)$ic4$;
        }
        return (SubLObject)$ic5$;
    }
    
    public static SubLObject f4813(final SubLObject var1) {
        return Errors.error((SubLObject)$ic6$, f4812(var1));
    }
    
    public static SubLObject f4814(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4) {
        return module0035.f2293(var1, var2, var3, var4);
    }
    
    public static SubLObject f4815(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4) {
        return module0035.f2294(var1, var2, var3, var4);
    }
    
    public static SubLObject f4816(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4) {
        return module0035.f2295(var1, var2, var3, var4);
    }
    
    public static SubLObject f4817(SubLObject var1, final SubLObject var2, final SubLObject var5, final SubLObject var3) {
        final SubLObject var6 = conses_high.assoc(var2, var1, var3, (SubLObject)UNPROVIDED);
        if (NIL != var6) {
            ConsesLow.rplacd(var6, var5);
        }
        else {
            var1 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var2, var5), var1);
            if (Sequences.length(var1).numG($g1083$.getGlobalValue())) {
                var1 = module0035.f2323(var1, var3);
            }
        }
        return var1;
    }
    
    public static SubLObject f4818(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        return module0035.f2310(var1, var2, var3);
    }
    
    public static SubLObject f4819(final SubLObject var1, final SubLObject var2, final SubLObject var4) {
        return Hashtables.gethash(var2, var1, var4);
    }
    
    public static SubLObject f4820(final SubLObject var1, final SubLObject var2, final SubLObject var4) {
        return Hashtables.gethash_without_values(var2, var1, var4);
    }
    
    public static SubLObject f4821(final SubLObject var1, final SubLObject var2, final SubLObject var5) {
        Hashtables.sethash(var2, var1, var5);
        return var1;
    }
    
    public static SubLObject f4822(SubLObject var1, final SubLObject var2) {
        Hashtables.remhash(var2, var1);
        if (Hashtables.hash_table_count(var1).numL($g1084$.getGlobalValue())) {
            var1 = module0030.f1630(var1);
        }
        return var1;
    }
    
    public static SubLObject f4823(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != module0035.f2292(var7) || var7.isHashtable());
    }
    
    public static SubLObject f4824(SubLObject var8, SubLObject var3) {
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)ZERO_INTEGER;
        }
        if (var3 == UNPROVIDED) {
            var3 = Symbols.symbol_function((SubLObject)EQL);
        }
        if (var8.numG($g1083$.getGlobalValue())) {
            return Hashtables.make_hash_table(var8, var3, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4825(final SubLObject var1) {
        final SubLObject var2 = f4812(var1);
        if (var2.eql((SubLObject)$ic3$)) {
            return conses_high.copy_alist(var1);
        }
        if (var2.eql((SubLObject)$ic4$)) {
            return module0030.f1611(var1, (SubLObject)UNPROVIDED);
        }
        return f4813(var1);
    }
    
    public static SubLObject f4826(final SubLObject var1) {
        final SubLObject var2 = f4812(var1);
        if (var2.eql((SubLObject)$ic3$)) {
            return Sequences.length(var1);
        }
        if (var2.eql((SubLObject)$ic4$)) {
            return Hashtables.hash_table_count(var1);
        }
        return f4813(var1);
    }
    
    public static SubLObject f4827(final SubLObject var1) {
        final SubLObject var2 = f4812(var1);
        if (var2.eql((SubLObject)$ic3$)) {
            return Types.sublisp_null(var1);
        }
        if (var2.eql((SubLObject)$ic4$)) {
            return Numbers.zerop(Hashtables.hash_table_count(var1));
        }
        return f4813(var1);
    }
    
    public static SubLObject f4828(final SubLObject var7) {
        return (SubLObject)makeBoolean(NIL != f4823(var7) && NIL == f4827(var7));
    }
    
    public static SubLObject f4829(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)ONE_INTEGER), f4830(var1, var2, var3, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f4830(final SubLObject var1, final SubLObject var2, final SubLObject var3, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        final SubLObject var5 = f4812(var1);
        if (var5.eql((SubLObject)$ic3$)) {
            return f4814(var1, var2, var3, var4);
        }
        if (var5.eql((SubLObject)$ic4$)) {
            return f4819(var1, var2, var4);
        }
        return f4813(var1);
    }
    
    public static SubLObject f4831(final SubLObject var1, final SubLObject var2, final SubLObject var3, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        final SubLObject var5 = f4812(var1);
        if (var5.eql((SubLObject)$ic3$)) {
            return f4815(var1, var2, var3, var4);
        }
        if (var5.eql((SubLObject)$ic4$)) {
            return f4820(var1, var2, var4);
        }
        return f4813(var1);
    }
    
    public static SubLObject f4832(final SubLObject var1, final SubLObject var2, final SubLObject var3, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        final SubLObject var5 = f4812(var1);
        if (var5.eql((SubLObject)$ic3$)) {
            return f4816(var1, var2, var3, var4);
        }
        if (var5.eql((SubLObject)$ic4$)) {
            return f4820(var1, var2, var4);
        }
        return f4813(var1);
    }
    
    public static SubLObject f4833(final SubLObject var1, final SubLObject var2, final SubLObject var5, final SubLObject var3) {
        final SubLObject var6 = f4812(var1);
        if (var6.eql((SubLObject)$ic3$)) {
            return f4817(var1, var2, var5, var3);
        }
        if (var6.eql((SubLObject)$ic4$)) {
            return f4821(var1, var2, var5);
        }
        return f4813(var1);
    }
    
    public static SubLObject f4834(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        final SubLObject var4 = f4812(var1);
        if (var4.eql((SubLObject)$ic3$)) {
            return f4818(var1, var2, var3);
        }
        if (var4.eql((SubLObject)$ic4$)) {
            return f4822(var1, var2);
        }
        return f4813(var1);
    }
    
    public static SubLObject f4835(final SubLObject var1) {
        final SubLObject var2 = f4812(var1);
        if (var2.eql((SubLObject)$ic4$)) {
            Hashtables.clrhash(var1);
        }
        return f4824((SubLObject)ZERO_INTEGER, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f4836(final SubLObject var1) {
        final SubLObject var2 = f4812(var1);
        if (var2.eql((SubLObject)$ic3$)) {
            return module0052.f3723(var1);
        }
        if (var2.eql((SubLObject)$ic4$)) {
            return module0052.f3732(var1);
        }
        return f4813(var1);
    }
    
    public static SubLObject f4837(final SubLObject var10, final SubLObject var11) {
        SubLObject var13;
        final SubLObject var12 = var13 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic9$);
        final SubLObject var14 = var13.rest();
        var13 = var13.first();
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var17 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic9$);
        var15 = var13.first();
        var13 = var13.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic9$);
        var16 = var13.first();
        var13 = var13.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic9$);
        var17 = var13.first();
        var13 = var13.rest();
        SubLObject var18 = (SubLObject)NIL;
        SubLObject var19 = var13;
        SubLObject var20 = (SubLObject)NIL;
        SubLObject var18_19 = (SubLObject)NIL;
        while (NIL != var19) {
            cdestructuring_bind.destructuring_bind_must_consp(var19, var12, (SubLObject)$ic9$);
            var18_19 = var19.first();
            var19 = var19.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var19, var12, (SubLObject)$ic9$);
            if (NIL == conses_high.member(var18_19, (SubLObject)$ic10$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var20 = (SubLObject)T;
            }
            if (var18_19 == $ic11$) {
                var18 = var19.first();
            }
            var19 = var19.rest();
        }
        if (NIL != var20 && NIL == var18) {
            cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic9$);
        }
        final SubLObject var21 = cdestructuring_bind.property_list_member((SubLObject)$ic12$, var13);
        final SubLObject var22 = (SubLObject)((NIL != var21) ? conses_high.cadr(var21) : NIL);
        final SubLObject var23;
        var13 = (var23 = var14);
        final SubLObject var24 = (SubLObject)$ic13$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic14$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var24, (SubLObject)ConsesLow.list((SubLObject)$ic15$, var17))), (SubLObject)ConsesLow.list((SubLObject)$ic16$, (SubLObject)ConsesLow.list((SubLObject)$ic17$, var22, (SubLObject)ConsesLow.list((SubLObject)$ic18$, var24)), (SubLObject)ConsesLow.listS((SubLObject)$ic19$, (SubLObject)ConsesLow.list(var15, var16), (SubLObject)ConsesLow.list((SubLObject)$ic20$, var24), ConsesLow.append(var23, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic21$, var24, (SubLObject)ConsesLow.list((SubLObject)$ic22$, var24)))))), (SubLObject)ConsesLow.list((SubLObject)$ic23$, var24));
    }
    
    public static SubLObject f4838(final SubLObject var1) {
        final SubLObject var2 = f4812(var1);
        if (var2.eql((SubLObject)$ic3$)) {
            return var1;
        }
        if (var2.eql((SubLObject)$ic4$)) {
            return hashtables_high.make_hash_table_iterator(var1);
        }
        return f4813(var1);
    }
    
    public static SubLObject f4839(final SubLObject var24) {
        if (var24.isList()) {
            final SubLObject var25 = var24.first();
            final SubLObject var26 = var25.first();
            final SubLObject var27 = var25.rest();
            return Values.values(var26, var27);
        }
        final SubLObject var28 = hashtables_high.hash_table_iterator_key(var24);
        final SubLObject var29 = hashtables_high.hash_table_iterator_value(var24);
        return Values.values(var28, var29);
    }
    
    public static SubLObject f4840(final SubLObject var24) {
        if (var24.isList()) {
            return var24.rest();
        }
        return hashtables_high.hash_table_iterator_next(var24);
    }
    
    public static SubLObject f4841(final SubLObject var24) {
        if (var24.isList()) {
            return Types.sublisp_null(var24);
        }
        return hashtables_high.hash_table_iterator_done_p(var24);
    }
    
    public static SubLObject f4842(final SubLObject var24) {
        if (NIL != hashtables_high.hash_table_iterator_p(var24)) {
            hashtables_high.destroy_hash_table_iterator(var24);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4843(final SubLObject var1, final SubLObject var26, SubLObject var27) {
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)NIL;
        }
        final SubLThread var28 = SubLProcess.currentSubLThread();
        SubLObject var29;
        for (var29 = f4838(var1); NIL == f4841(var29); var29 = f4840(var29)) {
            var28.resetMultipleValues();
            final SubLObject var30 = f4839(var29);
            final SubLObject var31 = var28.secondMultipleValue();
            var28.resetMultipleValues();
            Functions.apply(var26, var30, new SubLObject[] { var31, var27 });
        }
        f4842(var29);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4844(final SubLObject var1) {
        final SubLObject var2 = f4812(var1);
        if (var2.eql((SubLObject)$ic3$)) {
            return module0035.f2062(var1);
        }
        if (var2.eql((SubLObject)$ic4$)) {
            return module0030.f1625(var1);
        }
        return f4813(var1);
    }
    
    public static SubLObject f4845(final SubLObject var1) {
        final SubLObject var2 = f4812(var1);
        if (var2.eql((SubLObject)$ic3$)) {
            return module0035.f2319(var1);
        }
        if (var2.eql((SubLObject)$ic4$)) {
            return module0030.f1627(var1);
        }
        return f4813(var1);
    }
    
    public static SubLObject f4846(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3;
        SubLObject var4;
        SubLObject var5;
        for (var3 = (SubLObject)NIL, var4 = f4838(var1); NIL == var3 && NIL == f4841(var4); var3 = var5, var4 = f4840(var4)) {
            var2.resetMultipleValues();
            var5 = f4839(var4);
            final SubLObject var6 = var2.secondMultipleValue();
            var2.resetMultipleValues();
        }
        f4842(var4);
        return var3;
    }
    
    public static SubLObject f4847() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0066", "f4812", "S#6385", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0066", "f4813", "S#6386", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0066", "f4814", "S#6387", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0066", "f4815", "S#6388", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0066", "f4816", "S#6389", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0066", "f4817", "S#6390", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0066", "f4818", "S#6391", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0066", "f4819", "S#6392", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0066", "f4820", "S#6393", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0066", "f4821", "S#6394", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0066", "f4822", "S#6395", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0066", "f4823", "S#6396", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0066", "f4824", "S#6397", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0066", "f4825", "S#6398", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0066", "f4826", "S#6399", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0066", "f4827", "S#6400", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0066", "f4828", "S#6401", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0066", "f4829", "S#6402", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0066", "f4830", "S#6403", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0066", "f4831", "S#6404", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0066", "f4832", "S#6405", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0066", "f4833", "S#6406", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0066", "f4834", "S#6407", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0066", "f4835", "S#6408", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0066", "f4836", "S#6409", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0066", "f4837", "S#6410");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0066", "f4838", "S#6411", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0066", "f4839", "S#6412", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0066", "f4840", "S#6413", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0066", "f4841", "S#6414", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0066", "f4842", "S#6415", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0066", "f4843", "S#6416", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0066", "f4844", "S#6417", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0066", "f4845", "S#6418", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0066", "f4846", "S#6419", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4848() {
        $g1083$ = SubLFiles.deflexical("S#6420", (SubLObject)$ic0$);
        $g1084$ = SubLFiles.deflexical("S#6421", (SubLObject)$ic1$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4849() {
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic2$);
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic7$);
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic8$);
        module0002.f50((SubLObject)$ic15$, (SubLObject)$ic24$);
        module0002.f50((SubLObject)$ic20$, (SubLObject)$ic25$);
        module0002.f50((SubLObject)$ic22$, (SubLObject)$ic25$);
        module0002.f50((SubLObject)$ic18$, (SubLObject)$ic25$);
        module0002.f50((SubLObject)$ic23$, (SubLObject)$ic25$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f4847();
    }
    
    public void initializeVariables() {
        f4848();
    }
    
    public void runTopLevelForms() {
        f4849();
    }
    
    static {
        me = (SubLFile)new module0066();
        $g1083$ = null;
        $g1084$ = null;
        $ic0$ = makeInteger(40);
        $ic1$ = makeInteger(30);
        $ic2$ = ConsesLow.list((SubLObject)makeSymbol("INLINE"), (SubLObject)makeSymbol("S#6385", "CYC"), (SubLObject)makeSymbol("S#6386", "CYC"));
        $ic3$ = makeKeyword("ALIST");
        $ic4$ = makeKeyword("HASHTABLE");
        $ic5$ = makeKeyword("UNKNOWN");
        $ic6$ = makeString("Corrupted dictionary-contents; unsupported style ~S.~%");
        $ic7$ = ConsesLow.list((SubLObject)makeSymbol("INLINE"), (SubLObject)makeSymbol("S#6387", "CYC"), (SubLObject)makeSymbol("S#6388", "CYC"), (SubLObject)makeSymbol("S#6390", "CYC"), (SubLObject)makeSymbol("S#6391", "CYC"));
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("INLINE"), (SubLObject)makeSymbol("S#6392", "CYC"), (SubLObject)makeSymbol("S#6393", "CYC"), (SubLObject)makeSymbol("S#6394", "CYC"), (SubLObject)makeSymbol("S#6395", "CYC"));
        $ic9$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"), (SubLObject)makeSymbol("S#6422", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic10$ = ConsesLow.list((SubLObject)makeKeyword("DONE"));
        $ic11$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic12$ = makeKeyword("DONE");
        $ic13$ = makeUninternedSymbol("US#6C9EB35");
        $ic14$ = makeSymbol("CLET");
        $ic15$ = makeSymbol("S#6411", "CYC");
        $ic16$ = makeSymbol("UNTIL");
        $ic17$ = makeSymbol("COR");
        $ic18$ = makeSymbol("S#6414", "CYC");
        $ic19$ = makeSymbol("CMULTIPLE-VALUE-BIND");
        $ic20$ = makeSymbol("S#6412", "CYC");
        $ic21$ = makeSymbol("CSETQ");
        $ic22$ = makeSymbol("S#6413", "CYC");
        $ic23$ = makeSymbol("S#6415", "CYC");
        $ic24$ = makeSymbol("S#6410", "CYC");
        $ic25$ = makeSymbol("DO-DICTIONARY");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 107 ms
	
	Decompiled with Procyon 0.5.32.
*/