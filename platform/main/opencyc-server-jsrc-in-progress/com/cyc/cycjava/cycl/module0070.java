package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0070 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0070";
    public static final String myFingerPrint = "632cbf9f999b989008992d9b5d114ddb86ffde9ebe74a664e4abfd7417f92e57";
    private static SubLSymbol $g1102$;
    private static SubLSymbol $g1103$;
    public static SubLSymbol $g1104$;
    private static final SubLInteger $ic0$;
    private static final SubLInteger $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLList $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
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
    private static final SubLString $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLList $ic36$;
    private static final SubLList $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLList $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLList $ic53$;
    private static final SubLString $ic54$;
    
    public static SubLObject f4962(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f4963(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX6535_native.class) ? T : NIL);
    }
    
    public static SubLObject f4964(final SubLObject var1) {
        assert NIL != f4963(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f4965(final SubLObject var1) {
        assert NIL != f4963(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f4966(final SubLObject var1) {
        assert NIL != f4963(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f4967(final SubLObject var1) {
        assert NIL != f4963(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f4968(final SubLObject var1, final SubLObject var4) {
        assert NIL != f4963(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f4969(final SubLObject var1, final SubLObject var4) {
        assert NIL != f4963(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f4970(final SubLObject var1, final SubLObject var4) {
        assert NIL != f4963(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f4971(final SubLObject var1, final SubLObject var4) {
        assert NIL != f4963(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f4972(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX6535_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic19$)) {
                f4968(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic20$)) {
                f4969(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic21$)) {
                f4970(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic22$)) {
                f4971(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic23$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f4973(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic25$, (SubLObject)FOUR_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic26$, (SubLObject)$ic19$, f4964(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic26$, (SubLObject)$ic20$, f4965(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic26$, (SubLObject)$ic21$, f4966(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic26$, (SubLObject)$ic22$, f4967(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic27$, (SubLObject)$ic25$, (SubLObject)FOUR_INTEGER);
        return var11;
    }
    
    public static SubLObject f4974(final SubLObject var11, final SubLObject var12) {
        return f4973(var11, var12);
    }
    
    public static SubLObject f4975(final SubLObject var13) {
        final SubLObject var14 = f4965(var13);
        if (var14.isList()) {
            return (SubLObject)$ic29$;
        }
        if (var14.isHashtable()) {
            return (SubLObject)$ic30$;
        }
        return (SubLObject)$ic31$;
    }
    
    public static SubLObject f4976(final SubLObject var13) {
        return Errors.error((SubLObject)$ic32$, f4975(var13));
    }
    
    public static SubLObject f4977(final SubLObject var13, final SubLObject var15, final SubLObject var16) {
        final SubLObject var17 = f4967(var13);
        final SubLObject var18 = f4965(var13);
        final SubLObject var19 = conses_high.assoc(var15, var18, var17, (SubLObject)UNPROVIDED);
        return (NIL != var19) ? Values.values(var19.rest(), (SubLObject)T) : Values.values(var16, (SubLObject)NIL);
    }
    
    public static SubLObject f4978(final SubLObject var13, final SubLObject var15, final SubLObject var20) {
        final SubLObject var21 = f4967(var13);
        final SubLObject var22 = f4965(var13);
        final SubLObject var23 = conses_high.assoc(var15, var22, var21, (SubLObject)UNPROVIDED);
        final SubLObject var24 = conses_high.rassoc(var20, var22, var21, (SubLObject)UNPROVIDED);
        if (NIL != var23 && NIL != var24) {
            if (NIL == Functions.funcall(var21, var15, var24.first()) || NIL == Functions.funcall(var21, var23.rest(), var20)) {
                ConsesLow.rplacd(var23, var20);
                f4969(var13, module0035.f2073(var24, var22, (SubLObject)UNPROVIDED));
            }
        }
        else if (NIL != var23) {
            ConsesLow.rplacd(var23, var20);
        }
        else if (NIL != var24) {
            ConsesLow.rplaca(var24, var15);
        }
        else {
            f4969(var13, conses_high.acons(var15, var20, var22));
            f4968(var13, Numbers.add(f4964(var13), (SubLObject)ONE_INTEGER));
            if (f4964(var13).numG($g1102$.getGlobalValue())) {
                f4979(var13);
            }
        }
        return Values.values(var15, var20);
    }
    
    public static SubLObject f4980(final SubLObject var13, final SubLObject var15) {
        final SubLObject var16 = f4967(var13);
        final SubLObject var17 = f4965(var13);
        final SubLObject var18 = conses_high.assoc(var15, var17, var16, (SubLObject)UNPROVIDED);
        SubLObject var19 = (SubLObject)NIL;
        if (NIL != var18) {
            f4969(var13, module0035.f2073(var18, var17, (SubLObject)UNPROVIDED));
            var19 = var18.rest();
            f4968(var13, Numbers.subtract(f4964(var13), (SubLObject)ONE_INTEGER));
        }
        return Values.values(var15, var19);
    }
    
    public static SubLObject f4981(final SubLObject var13, final SubLObject var20, final SubLObject var16) {
        final SubLObject var21 = f4967(var13);
        final SubLObject var22 = f4965(var13);
        final SubLObject var23 = conses_high.rassoc(var20, var22, var21, (SubLObject)UNPROVIDED);
        return (NIL != var23) ? Values.values(var23.first(), (SubLObject)T) : Values.values(var16, (SubLObject)NIL);
    }
    
    public static SubLObject f4982(final SubLObject var13, final SubLObject var20, final SubLObject var15) {
        return f4978(var13, var15, var20);
    }
    
    public static SubLObject f4983(final SubLObject var13, final SubLObject var20) {
        final SubLObject var21 = f4967(var13);
        final SubLObject var22 = f4965(var13);
        final SubLObject var23 = conses_high.rassoc(var20, var22, var21, (SubLObject)UNPROVIDED);
        SubLObject var24 = (SubLObject)NIL;
        if (NIL != var23) {
            f4969(var13, module0035.f2073(var23, var22, (SubLObject)UNPROVIDED));
            var24 = var23.first();
            f4968(var13, Numbers.subtract(f4964(var13), (SubLObject)ONE_INTEGER));
        }
        return Values.values(var24, var20);
    }
    
    public static SubLObject f4979(final SubLObject var13) {
        final SubLObject var14 = f4967(var13);
        final SubLObject var15 = f4965(var13);
        final SubLObject var16 = module0035.f2323(var15, var14);
        final SubLObject var17 = module0035.f2324(var15, var14);
        f4969(var13, var16);
        f4970(var13, var17);
        return var13;
    }
    
    public static SubLObject f4984(final SubLObject var13, final SubLObject var15, final SubLObject var16) {
        return Hashtables.gethash(var15, f4965(var13), var16);
    }
    
    public static SubLObject f4985(final SubLObject var13, final SubLObject var15, final SubLObject var20) {
        final SubLObject var21 = f4965(var13);
        final SubLObject var22 = f4966(var13);
        Hashtables.sethash(var15, var21, var20);
        Hashtables.sethash(var20, var22, var15);
        f4968(var13, Hashtables.hash_table_count(var21));
        return Values.values(var15, var20);
    }
    
    public static SubLObject f4986(final SubLObject var13, final SubLObject var15) {
        final SubLObject var16 = f4965(var13);
        final SubLObject var17 = Hashtables.gethash(var15, var16, (SubLObject)UNPROVIDED);
        return (NIL != var17) ? f4987(var13, var15, var17) : Values.values(var15, var17);
    }
    
    public static SubLObject f4988(final SubLObject var13, final SubLObject var20, final SubLObject var16) {
        return Hashtables.gethash(var20, f4966(var13), var16);
    }
    
    public static SubLObject f4989(final SubLObject var13, final SubLObject var20, final SubLObject var15) {
        return f4985(var13, var15, var20);
    }
    
    public static SubLObject f4990(final SubLObject var13, final SubLObject var20) {
        final SubLObject var21 = f4966(var13);
        final SubLObject var22 = Hashtables.gethash(var20, var21, (SubLObject)UNPROVIDED);
        return (NIL != var22) ? f4987(var13, var22, var20) : Values.values(var22, var20);
    }
    
    public static SubLObject f4987(final SubLObject var13, final SubLObject var15, final SubLObject var20) {
        final SubLObject var21 = f4965(var13);
        final SubLObject var22 = f4966(var13);
        final SubLObject var23 = Hashtables.remhash(var15, var21);
        final SubLObject var24 = Hashtables.remhash(var20, var22);
        if (NIL != var23 && NIL != var24) {
            f4968(var13, Hashtables.hash_table_count(var21));
            if (f4964(var13).numL($g1103$.getGlobalValue())) {
                f4991(var13);
            }
        }
        else if (NIL != var23 || NIL != var24) {
            Errors.error((SubLObject)$ic33$);
        }
        return Values.values(var15, var20);
    }
    
    public static SubLObject f4991(final SubLObject var13) {
        final SubLObject var14 = f4965(var13);
        final SubLObject var15 = module0030.f1630(var14);
        f4969(var13, var15);
        f4970(var13, (SubLObject)NIL);
        return var13;
    }
    
    public static SubLObject f4992(SubLObject var17, SubLObject var30) {
        if (var17 == UNPROVIDED) {
            var17 = Symbols.symbol_function((SubLObject)EQL);
        }
        if (var30 == UNPROVIDED) {
            var30 = (SubLObject)ZERO_INTEGER;
        }
        assert NIL != module0030.f1591(var17) : var17;
        assert NIL != Types.integerp(var30) : var30;
        if (var17.isSymbol()) {
            var17 = Symbols.symbol_function(var17);
        }
        final SubLObject var31 = f4972((SubLObject)UNPROVIDED);
        f4993(var31);
        f4971(var31, var17);
        if (var30.numG($g1102$.getGlobalValue())) {
            f4969(var31, Hashtables.make_hash_table(var30, var17, (SubLObject)UNPROVIDED));
            f4970(var31, Hashtables.make_hash_table(var30, var17, (SubLObject)UNPROVIDED));
        }
        return var31;
    }
    
    public static SubLObject f4993(final SubLObject var13) {
        assert NIL != f4963(var13) : var13;
        f4968(var13, (SubLObject)ZERO_INTEGER);
        f4969(var13, (SubLObject)NIL);
        f4970(var13, (SubLObject)NIL);
        return var13;
    }
    
    public static SubLObject f4994(final SubLObject var13) {
        assert NIL != f4963(var13) : var13;
        return Numbers.zerop(f4964(var13));
    }
    
    public static SubLObject f4995(final SubLObject var31) {
        return (SubLObject)makeBoolean(NIL != f4963(var31) && NIL == f4994(var31));
    }
    
    public static SubLObject f4996(final SubLObject var13, final SubLObject var15, SubLObject var16) {
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        assert NIL != f4963(var13) : var13;
        final SubLObject var17 = f4975(var13);
        if (var17.eql((SubLObject)$ic29$)) {
            return f4977(var13, var15, var16);
        }
        if (var17.eql((SubLObject)$ic30$)) {
            return f4984(var13, var15, var16);
        }
        return f4976(var13);
    }
    
    public static SubLObject f4997(final SubLObject var13, final SubLObject var20, SubLObject var16) {
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        assert NIL != f4963(var13) : var13;
        final SubLObject var21 = f4975(var13);
        if (var21.eql((SubLObject)$ic29$)) {
            return f4981(var13, var20, var16);
        }
        if (var21.eql((SubLObject)$ic30$)) {
            return f4988(var13, var20, var16);
        }
        return f4976(var13);
    }
    
    public static SubLObject f4998(final SubLObject var13, final SubLObject var15, final SubLObject var20) {
        assert NIL != f4963(var13) : var13;
        final SubLObject var21 = f4975(var13);
        if (var21.eql((SubLObject)$ic29$)) {
            return f4978(var13, var15, var20);
        }
        if (var21.eql((SubLObject)$ic30$)) {
            return f4985(var13, var15, var20);
        }
        return f4976(var13);
    }
    
    public static SubLObject f4999(final SubLObject var13, final SubLObject var20, final SubLObject var15) {
        assert NIL != f4963(var13) : var13;
        final SubLObject var21 = f4975(var13);
        if (var21.eql((SubLObject)$ic29$)) {
            return f4982(var13, var20, var15);
        }
        if (var21.eql((SubLObject)$ic30$)) {
            return f4989(var13, var20, var15);
        }
        return f4976(var13);
    }
    
    public static SubLObject f5000(final SubLObject var13, final SubLObject var15) {
        assert NIL != f4963(var13) : var13;
        final SubLObject var16 = f4975(var13);
        if (var16.eql((SubLObject)$ic29$)) {
            return f4980(var13, var15);
        }
        if (var16.eql((SubLObject)$ic30$)) {
            return f4986(var13, var15);
        }
        return f4976(var13);
    }
    
    public static SubLObject f5001(final SubLObject var13, final SubLObject var20) {
        assert NIL != f4963(var13) : var13;
        final SubLObject var21 = f4975(var13);
        if (var21.eql((SubLObject)$ic29$)) {
            return f4983(var13, var20);
        }
        if (var21.eql((SubLObject)$ic30$)) {
            return f4990(var13, var20);
        }
        return f4976(var13);
    }
    
    public static SubLObject f5002(final SubLObject var13) {
        assert NIL != f4963(var13) : var13;
        final SubLObject var14 = f4965(var13);
        final SubLObject var15 = f4975(var13);
        if (var15.eql((SubLObject)$ic29$)) {
            return module0052.f3723(var14);
        }
        if (var15.eql((SubLObject)$ic30$)) {
            return module0052.f3732(var14);
        }
        return f4976(var13);
    }
    
    public static SubLObject f5003(final SubLObject var32, final SubLObject var33) {
        SubLObject var35;
        final SubLObject var34 = var35 = var32.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)$ic36$);
        final SubLObject var36 = var35.rest();
        var35 = var35.first();
        SubLObject var37 = (SubLObject)NIL;
        SubLObject var38 = (SubLObject)NIL;
        SubLObject var39 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)$ic36$);
        var37 = var35.first();
        var35 = var35.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)$ic36$);
        var38 = var35.first();
        var35 = var35.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)$ic36$);
        var39 = var35.first();
        var35 = var35.rest();
        SubLObject var40 = (SubLObject)NIL;
        SubLObject var41 = var35;
        SubLObject var42 = (SubLObject)NIL;
        SubLObject var40_41 = (SubLObject)NIL;
        while (NIL != var41) {
            cdestructuring_bind.destructuring_bind_must_consp(var41, var34, (SubLObject)$ic36$);
            var40_41 = var41.first();
            var41 = var41.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var41, var34, (SubLObject)$ic36$);
            if (NIL == conses_high.member(var40_41, (SubLObject)$ic37$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var42 = (SubLObject)T;
            }
            if (var40_41 == $ic38$) {
                var40 = var41.first();
            }
            var41 = var41.rest();
        }
        if (NIL != var42 && NIL == var40) {
            cdestructuring_bind.cdestructuring_bind_error(var34, (SubLObject)$ic36$);
        }
        final SubLObject var43 = cdestructuring_bind.property_list_member((SubLObject)$ic39$, var35);
        final SubLObject var44 = (SubLObject)((NIL != var43) ? conses_high.cadr(var43) : NIL);
        final SubLObject var45;
        var35 = (var45 = var36);
        final SubLObject var46 = (SubLObject)$ic40$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic41$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var46, var39)), (SubLObject)ConsesLow.list((SubLObject)$ic42$, (SubLObject)ConsesLow.list((SubLObject)$ic43$, var46), (SubLObject)ConsesLow.list((SubLObject)$ic29$, (SubLObject)ConsesLow.listS((SubLObject)$ic44$, (SubLObject)ConsesLow.list(var37, var38, (SubLObject)ConsesLow.list((SubLObject)$ic45$, var46), (SubLObject)$ic39$, var44), ConsesLow.append(var45, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)$ic30$, (SubLObject)ConsesLow.listS((SubLObject)$ic46$, (SubLObject)ConsesLow.list(var37, var38, (SubLObject)ConsesLow.list((SubLObject)$ic45$, var46), (SubLObject)$ic39$, var44), ConsesLow.append(var45, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)$ic47$, (SubLObject)ConsesLow.list((SubLObject)$ic48$, var46))));
    }
    
    public static SubLObject f5004(final SubLObject var32, final SubLObject var33) {
        SubLObject var35;
        final SubLObject var34 = var35 = var32.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)$ic49$);
        final SubLObject var36 = var35.rest();
        var35 = var35.first();
        SubLObject var37 = (SubLObject)NIL;
        SubLObject var38 = (SubLObject)NIL;
        SubLObject var39 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)$ic49$);
        var37 = var35.first();
        var35 = var35.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)$ic49$);
        var38 = var35.first();
        var35 = var35.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)$ic49$);
        var39 = var35.first();
        var35 = var35.rest();
        SubLObject var40 = (SubLObject)NIL;
        SubLObject var41 = var35;
        SubLObject var42 = (SubLObject)NIL;
        SubLObject var52_53 = (SubLObject)NIL;
        while (NIL != var41) {
            cdestructuring_bind.destructuring_bind_must_consp(var41, var34, (SubLObject)$ic49$);
            var52_53 = var41.first();
            var41 = var41.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var41, var34, (SubLObject)$ic49$);
            if (NIL == conses_high.member(var52_53, (SubLObject)$ic37$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var42 = (SubLObject)T;
            }
            if (var52_53 == $ic38$) {
                var40 = var41.first();
            }
            var41 = var41.rest();
        }
        if (NIL != var42 && NIL == var40) {
            cdestructuring_bind.cdestructuring_bind_error(var34, (SubLObject)$ic49$);
        }
        final SubLObject var43 = cdestructuring_bind.property_list_member((SubLObject)$ic39$, var35);
        final SubLObject var44 = (SubLObject)((NIL != var43) ? conses_high.cadr(var43) : NIL);
        final SubLObject var45;
        var35 = (var45 = var36);
        final SubLObject var46 = (SubLObject)$ic50$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic41$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var46, var39)), (SubLObject)ConsesLow.list((SubLObject)$ic42$, (SubLObject)ConsesLow.list((SubLObject)$ic43$, var46), (SubLObject)ConsesLow.list((SubLObject)$ic29$, (SubLObject)ConsesLow.listS((SubLObject)$ic44$, (SubLObject)ConsesLow.list(var38, var37, (SubLObject)ConsesLow.list((SubLObject)$ic45$, var46), (SubLObject)$ic39$, var44), ConsesLow.append(var45, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)$ic30$, (SubLObject)ConsesLow.listS((SubLObject)$ic46$, (SubLObject)ConsesLow.list(var37, var38, (SubLObject)ConsesLow.list((SubLObject)$ic51$, var46), (SubLObject)$ic39$, var44), ConsesLow.append(var45, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)$ic47$, (SubLObject)ConsesLow.list((SubLObject)$ic48$, var46))));
    }
    
    public static SubLObject f5005(final SubLObject var13) {
        assert NIL != f4963(var13) : var13;
        return f4975(var13);
    }
    
    public static SubLObject f5006(final SubLObject var13) {
        return f4965(var13);
    }
    
    public static SubLObject f5007(final SubLObject var13) {
        return f4966(var13);
    }
    
    public static SubLObject f5008(final SubLObject var13) {
        assert NIL != f4963(var13) : var13;
        final SubLObject var14 = f4975(var13);
        if (var14.eql((SubLObject)$ic29$)) {
            return module0035.f2062(f4965(var13));
        }
        if (var14.eql((SubLObject)$ic30$)) {
            return module0030.f1625(f4965(var13));
        }
        return f4976(var13);
    }
    
    public static SubLObject f5009(final SubLObject var13) {
        assert NIL != f4963(var13) : var13;
        final SubLObject var14 = f4975(var13);
        if (var14.eql((SubLObject)$ic29$)) {
            return module0035.f2319(f4965(var13));
        }
        if (var14.eql((SubLObject)$ic30$)) {
            return module0030.f1625(f4966(var13));
        }
        return f4976(var13);
    }
    
    public static SubLObject f5010(final SubLObject var13) {
        assert NIL != f4963(var13) : var13;
        final SubLObject var14 = f4975(var13);
        if (var14.eql((SubLObject)$ic29$)) {
            return Values.values(conses_high.copy_tree(f4965(var13)), f4967(var13));
        }
        if (var14.eql((SubLObject)$ic30$)) {
            return module0030.f1630(f4965(var13));
        }
        return f4976(var13);
    }
    
    public static SubLObject f5011(final SubLObject var13) {
        assert NIL != f4963(var13) : var13;
        final SubLObject var14 = f4975(var13);
        if (var14.eql((SubLObject)$ic29$)) {
            final SubLObject var15 = f4965(var13);
            final SubLObject var16 = f4967(var13);
            return Values.values(module0035.f2323(var15, var16), module0035.f2324(var15, var16));
        }
        if (var14.eql((SubLObject)$ic30$)) {
            return Values.values(f4965(var13), f4966(var13));
        }
        return f4976(var13);
    }
    
    public static SubLObject f5012(final SubLObject var13, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)T;
        }
        final SubLObject var14 = f5005(var13);
        if (var14.eql((SubLObject)$ic29$)) {
            SubLObject var15 = f5006(var13);
            SubLObject var16 = (SubLObject)NIL;
            var16 = var15.first();
            while (NIL != var15) {
                SubLObject var18;
                final SubLObject var17 = var18 = var16;
                SubLObject var19 = (SubLObject)NIL;
                SubLObject var20 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var18, var17, (SubLObject)$ic53$);
                var19 = var18.first();
                var18 = (var20 = var18.rest());
                PrintLow.format(var2, (SubLObject)$ic54$, var19, var20);
                var15 = var15.rest();
                var16 = var15.first();
            }
        }
        else if (var14.eql((SubLObject)$ic30$)) {
            final SubLObject var21 = f5006(var13);
            SubLObject var22 = (SubLObject)NIL;
            SubLObject var23 = (SubLObject)NIL;
            final Iterator var24 = Hashtables.getEntrySetIterator(var21);
            try {
                while (Hashtables.iteratorHasNext(var24)) {
                    final Map.Entry var25 = Hashtables.iteratorNextEntry(var24);
                    var22 = Hashtables.getEntryKey(var25);
                    var23 = Hashtables.getEntryValue(var25);
                    PrintLow.format(var2, (SubLObject)$ic54$, var22, var23);
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(var24);
            }
        }
        else {
            f4976(var13);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5013() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f4962", "S#6537", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f4963", "S#6536", 1, 0, false);
        new $f4963$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f4964", "S#6538", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f4965", "S#6539", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f4966", "S#6540", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f4967", "S#6541", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f4968", "S#6542", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f4969", "S#6543", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f4970", "S#6544", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f4971", "S#6545", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f4972", "S#6546", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f4973", "S#6547", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f4974", "S#6548", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f4975", "S#6549", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f4976", "S#6550", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f4977", "S#6551", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f4978", "S#6552", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f4980", "S#6553", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f4981", "S#6554", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f4982", "S#6555", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f4983", "S#6556", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f4979", "S#6557", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f4984", "S#6558", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f4985", "S#6559", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f4986", "S#6560", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f4988", "S#6561", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f4989", "S#6562", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f4990", "S#6563", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f4987", "S#6564", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f4991", "S#6565", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f4992", "S#6566", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f4993", "S#6567", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f4994", "S#6568", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f4995", "S#6569", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f4996", "S#6570", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f4997", "S#6571", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f4998", "S#6572", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f4999", "S#6573", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f5000", "S#6574", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f5001", "S#6575", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f5002", "S#6576", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0070", "f5003", "S#6577");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0070", "f5004", "S#6578");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f5005", "S#6579", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f5006", "S#6580", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f5007", "S#6581", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f5008", "S#6582", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f5009", "S#6583", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f5010", "S#6584", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f5011", "S#6585", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0070", "f5012", "S#6586", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5014() {
        $g1102$ = SubLFiles.deflexical("S#6587", (SubLObject)$ic0$);
        $g1103$ = SubLFiles.deflexical("S#6588", (SubLObject)$ic1$);
        $g1104$ = SubLFiles.defconstant("S#6589", (SubLObject)$ic2$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5015() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1104$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic9$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic10$);
        Structures.def_csetf((SubLObject)$ic11$, (SubLObject)$ic12$);
        Structures.def_csetf((SubLObject)$ic13$, (SubLObject)$ic14$);
        Structures.def_csetf((SubLObject)$ic15$, (SubLObject)$ic16$);
        Structures.def_csetf((SubLObject)$ic17$, (SubLObject)$ic18$);
        Equality.identity((SubLObject)$ic2$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1104$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic28$));
        module0002.f50((SubLObject)$ic43$, (SubLObject)$ic52$);
        module0002.f50((SubLObject)$ic45$, (SubLObject)$ic52$);
        module0002.f50((SubLObject)$ic51$, (SubLObject)$ic52$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f5013();
    }
    
    public void initializeVariables() {
        f5014();
    }
    
    public void runTopLevelForms() {
        f5015();
    }
    
    static {
        me = (SubLFile)new module0070();
        $g1102$ = null;
        $g1103$ = null;
        $g1104$ = null;
        $ic0$ = makeInteger(40);
        $ic1$ = makeInteger(30);
        $ic2$ = makeSymbol("S#6535", "CYC");
        $ic3$ = makeSymbol("S#6536", "CYC");
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("S#1534", "CYC"), (SubLObject)makeSymbol("S#6472", "CYC"), (SubLObject)makeSymbol("S#6590", "CYC"), (SubLObject)makeSymbol("S#122", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)makeKeyword("SIZE"), (SubLObject)makeKeyword("DATABASE"), (SubLObject)makeKeyword("INVERSE-DATABASE"), (SubLObject)makeKeyword("TEST"));
        $ic6$ = ConsesLow.list((SubLObject)makeSymbol("S#6538", "CYC"), (SubLObject)makeSymbol("S#6539", "CYC"), (SubLObject)makeSymbol("S#6540", "CYC"), (SubLObject)makeSymbol("S#6541", "CYC"));
        $ic7$ = ConsesLow.list((SubLObject)makeSymbol("S#6542", "CYC"), (SubLObject)makeSymbol("S#6543", "CYC"), (SubLObject)makeSymbol("S#6544", "CYC"), (SubLObject)makeSymbol("S#6545", "CYC"));
        $ic8$ = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic9$ = makeSymbol("S#6537", "CYC");
        $ic10$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#6536", "CYC"));
        $ic11$ = makeSymbol("S#6538", "CYC");
        $ic12$ = makeSymbol("S#6542", "CYC");
        $ic13$ = makeSymbol("S#6539", "CYC");
        $ic14$ = makeSymbol("S#6543", "CYC");
        $ic15$ = makeSymbol("S#6540", "CYC");
        $ic16$ = makeSymbol("S#6544", "CYC");
        $ic17$ = makeSymbol("S#6541", "CYC");
        $ic18$ = makeSymbol("S#6545", "CYC");
        $ic19$ = makeKeyword("SIZE");
        $ic20$ = makeKeyword("DATABASE");
        $ic21$ = makeKeyword("INVERSE-DATABASE");
        $ic22$ = makeKeyword("TEST");
        $ic23$ = makeString("Invalid slot ~S for construction function");
        $ic24$ = makeKeyword("BEGIN");
        $ic25$ = makeSymbol("S#6546", "CYC");
        $ic26$ = makeKeyword("SLOT");
        $ic27$ = makeKeyword("END");
        $ic28$ = makeSymbol("S#6548", "CYC");
        $ic29$ = makeKeyword("ALIST");
        $ic30$ = makeKeyword("HASHTABLE");
        $ic31$ = makeKeyword("UNKNOWN");
        $ic32$ = makeString("Corrupted bijection; unsupported style ~S.~%");
        $ic33$ = makeString("Malformed bijection.");
        $ic34$ = makeSymbol("S#2831", "CYC");
        $ic35$ = makeSymbol("INTEGERP");
        $ic36$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"), (SubLObject)makeSymbol("S#6535", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic37$ = ConsesLow.list((SubLObject)makeKeyword("DONE"));
        $ic38$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic39$ = makeKeyword("DONE");
        $ic40$ = makeUninternedSymbol("US#5BF0730");
        $ic41$ = makeSymbol("CLET");
        $ic42$ = makeSymbol("PCASE");
        $ic43$ = makeSymbol("S#6579", "CYC");
        $ic44$ = makeSymbol("DO-ALIST");
        $ic45$ = makeSymbol("S#6580", "CYC");
        $ic46$ = makeSymbol("DO-HASH-TABLE");
        $ic47$ = makeSymbol("OTHERWISE");
        $ic48$ = makeSymbol("S#6550", "CYC");
        $ic49$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#132", "CYC"), (SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#6535", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic50$ = makeUninternedSymbol("US#5BF0730");
        $ic51$ = makeSymbol("S#6581", "CYC");
        $ic52$ = makeSymbol("S#6577", "CYC");
        $ic53$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"));
        $ic54$ = makeString("~S <-> ~S~%");
    }
    
    public static final class $sX6535_native extends SubLStructNative
    {
        public SubLObject $size;
        public SubLObject $database;
        public SubLObject $inverse_database;
        public SubLObject $test;
        public static final SubLStructDeclNative structDecl;
        
        public $sX6535_native() {
            this.$size = (SubLObject)CommonSymbols.NIL;
            this.$database = (SubLObject)CommonSymbols.NIL;
            this.$inverse_database = (SubLObject)CommonSymbols.NIL;
            this.$test = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$size;
        }
        
        public SubLObject getField3() {
            return this.$database;
        }
        
        public SubLObject getField4() {
            return this.$inverse_database;
        }
        
        public SubLObject getField5() {
            return this.$test;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$size = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$database = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$inverse_database = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$test = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX6535_native.class, $ic2$, $ic3$, $ic4$, $ic5$, new String[] { "$size", "$database", "$inverse_database", "$test" }, $ic6$, $ic7$, $ic8$);
        }
    }
    
    public static final class $f4963$UnaryFunction extends UnaryFunction
    {
        public $f4963$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#6536"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f4963(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 182 ms
	
	Decompiled with Procyon 0.5.32.
*/