package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0702 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0702";
    public static final String myFingerPrint = "e5cb04645e2689d3aa7447d823ce935aa3b9c6f9f8ba0baafc30e5708ce47298";
    private static SubLSymbol $g5510$;
    private static SubLSymbol $g5511$;
    private static SubLSymbol $g5512$;
    private static SubLSymbol $g5513$;
    public static SubLSymbol $g5514$;
    private static final SubLList $ic0$;
    private static final SubLString $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLString $ic4$;
    private static final SubLString $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
    private static final SubLList $ic14$;
    private static final SubLList $ic15$;
    private static final SubLList $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLString $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLString $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    
    
    public static SubLObject f42814(SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var1) : var1;
        if (NIL != var2 && !areAssertionsDisabledFor(me) && NIL == f42815(var2)) {
            throw new AssertionError(var2);
        }
        if (NIL != var3 && !areAssertionsDisabledFor(me) && NIL == Types.stringp(var3)) {
            throw new AssertionError(var3);
        }
        if (NIL == var2 && NIL == var3) {
            if (NIL != module0038.f2684(var1, (SubLObject)$ic4$) && NIL != module0038.f2673(var1, (SubLObject)$ic5$, (SubLObject)UNPROVIDED)) {
                var1 = Sequences.subseq(var1, (SubLObject)ONE_INTEGER, Numbers.subtract(Sequences.length(var1), (SubLObject)ONE_INTEGER));
            }
            var4.resetMultipleValues();
            final SubLObject var5 = f42816(var1);
            final SubLObject var6 = var4.secondMultipleValue();
            final SubLObject var7 = var4.thirdMultipleValue();
            var4.resetMultipleValues();
            if (NIL != var5) {
                var1 = f42817(var5);
                var2 = var6;
                var3 = var7;
            }
        }
        SubLObject var8 = (SubLObject)NIL;
        final SubLObject var9 = $g5511$.getGlobalValue();
        SubLObject var10 = (SubLObject)NIL;
        try {
            var10 = Locks.seize_lock(var9);
            var8 = f42818(var1, var2, var3);
        }
        finally {
            if (NIL != var10) {
                Locks.release_lock(var9);
            }
        }
        return var8;
    }
    
    public static SubLObject f42819() {
        final SubLObject var11 = $g5512$.getGlobalValue();
        if (NIL != var11) {
            module0034.f1818(var11);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42820(final SubLObject var1) {
        return module0034.f1829($g5512$.getGlobalValue(), (SubLObject)ConsesLow.list(var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f42821(final SubLObject var1) {
        return var1;
    }
    
    public static SubLObject f42817(final SubLObject var1) {
        SubLObject var2 = $g5512$.getGlobalValue();
        if (NIL == var2) {
            var2 = module0034.f1934((SubLObject)$ic6$, (SubLObject)$ic7$, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)ONE_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        SubLObject var3 = module0034.f1814(var2, var1, (SubLObject)$ic8$);
        if (var3 == $ic8$) {
            var3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f42821(var1)));
            module0034.f1816(var2, var1, var3, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var3);
    }
    
    public static SubLObject f42822() {
        final SubLObject var11 = $g5513$.getGlobalValue();
        if (NIL != var11) {
            module0034.f1818(var11);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42823(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        return module0034.f1829($g5513$.getGlobalValue(), (SubLObject)ConsesLow.list(var1, var2, var3), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f42824(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        return f42825(var1, var2, var3);
    }
    
    public static SubLObject f42818(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        SubLObject var4 = $g5513$.getGlobalValue();
        if (NIL == var4) {
            var4 = module0034.f1934((SubLObject)$ic9$, (SubLObject)$ic10$, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)THREE_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        final SubLObject var5 = module0034.f1781(var1, var2, var3);
        final SubLObject var6 = module0034.f1814(var4, var5, (SubLObject)UNPROVIDED);
        if (var6 != $ic8$) {
            SubLObject var7 = var6;
            SubLObject var8 = (SubLObject)NIL;
            var8 = var7.first();
            while (NIL != var7) {
                SubLObject var9 = var8.first();
                final SubLObject var10 = conses_high.second(var8);
                if (var1.equal(var9.first())) {
                    var9 = var9.rest();
                    if (var2.equal(var9.first())) {
                        var9 = var9.rest();
                        if (NIL != var9 && NIL == var9.rest() && var3.equal(var9.first())) {
                            return module0034.f1959(var10);
                        }
                    }
                }
                var7 = var7.rest();
                var8 = var7.first();
            }
        }
        final SubLObject var11 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f42824(var1, var2, var3)));
        module0034.f1836(var4, var5, var6, var11, (SubLObject)ConsesLow.list(var1, var2, var3));
        return module0034.f1959(var11);
    }
    
    public static SubLObject f42816(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        SubLObject var10 = (SubLObject)((NIL != module0589.f35907(var8, (SubLObject)UNPROVIDED)) ? var8 : NIL);
        SubLObject var11 = (SubLObject)NIL;
        var9.resetMultipleValues();
        final SubLObject var12 = f42826(var8);
        final SubLObject var13 = var9.secondMultipleValue();
        var9.resetMultipleValues();
        if (NIL != var12) {
            var10 = module0038.f2623(var8, (SubLObject)ZERO_INTEGER, var12);
            var11 = module0038.f2623(var8, module0048.f_1X(var12), (SubLObject)UNPROVIDED);
        }
        return Values.values(var10, var13, var11);
    }
    
    public static SubLObject f42827(final SubLObject var23, final SubLObject var24) {
        assert NIL != f42828(var23) : var23;
        assert NIL != Types.stringp(var24) : var24;
        if (NIL != module0038.f2684(f42829(var23), var24)) {
            return (SubLObject)T;
        }
        if (NIL != module0035.f2007(var24, f42829(var23)) && NIL != module0038.f2684(f42830(var23), var24)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42831(final SubLObject var25, final SubLObject var26) {
        assert NIL != f42828(var25) : var25;
        assert NIL != f42828(var26) : var26;
        return Equality.equal(f42830(var25), f42830(var26));
    }
    
    public static SubLObject f42832(final SubLObject var23, final SubLObject var8) {
        assert NIL != f42828(var23) : var23;
        assert NIL != Types.stringp(var8) : var8;
        return (SubLObject)makeBoolean(NIL != f42833(var23, var8) && NIL != f42834(var23, var8) && NIL != f42835(var23, var8) && NIL != f42836(var23, var8));
    }
    
    public static SubLObject f42837(final SubLObject var23) {
        final SubLObject var24 = f42830(var23);
        return (NIL != module0039.f3006(var24)) ? var24 : module0208.f13541(var24);
    }
    
    public static SubLObject f42838(final SubLObject var23, final SubLObject var3) {
        assert NIL != f42828(var23) : var23;
        return (SubLObject)makeBoolean(f42839(var23).eql((SubLObject)Characters.CHAR_hash) && f42840(var23).equal(var3) && NIL != module0035.f1995(f42829(var23), module0048.f_1_(Sequences.length(module0699.f42527())), (SubLObject)UNPROVIDED) && NIL != module0038.f2684(module0699.f42527(), f42829(var23)));
    }
    
    public static SubLObject f42826(final SubLObject var28) {
        SubLObject var29 = $g5510$.getGlobalValue();
        SubLObject var30 = (SubLObject)NIL;
        var30 = var29.first();
        while (NIL != var29) {
            final SubLObject var31 = module0035.f2029(var30, var28, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != var31) {
                return Values.values(var31, var30);
            }
            var29 = var29.rest();
            var30 = var29.first();
        }
        return Values.values((SubLObject)NIL, (SubLObject)NIL);
    }
    
    public static SubLObject f42841(final SubLObject var30, final SubLObject var31) {
        f42842(var30, var31, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42828(final SubLObject var30) {
        return (SubLObject)((var30.getClass() == $sX46858_native.class) ? T : NIL);
    }
    
    public static SubLObject f42843(final SubLObject var30) {
        assert NIL != f42828(var30) : var30;
        return var30.getField2();
    }
    
    public static SubLObject f42844(final SubLObject var30) {
        assert NIL != f42828(var30) : var30;
        return var30.getField3();
    }
    
    public static SubLObject f42845(final SubLObject var30) {
        assert NIL != f42828(var30) : var30;
        return var30.getField4();
    }
    
    public static SubLObject f42846(final SubLObject var30, final SubLObject var33) {
        assert NIL != f42828(var30) : var30;
        return var30.setField2(var33);
    }
    
    public static SubLObject f42847(final SubLObject var30, final SubLObject var33) {
        assert NIL != f42828(var30) : var30;
        return var30.setField3(var33);
    }
    
    public static SubLObject f42848(final SubLObject var30, final SubLObject var33) {
        assert NIL != f42828(var30) : var30;
        return var30.setField4(var33);
    }
    
    public static SubLObject f42849(SubLObject var34) {
        if (var34 == UNPROVIDED) {
            var34 = (SubLObject)NIL;
        }
        final SubLObject var35 = (SubLObject)new $sX46858_native();
        SubLObject var36;
        SubLObject var37;
        SubLObject var38;
        SubLObject var39;
        for (var36 = (SubLObject)NIL, var36 = var34; NIL != var36; var36 = conses_high.cddr(var36)) {
            var37 = var36.first();
            var38 = conses_high.cadr(var36);
            var39 = var37;
            if (var39.eql((SubLObject)$ic26$)) {
                f42846(var35, var38);
            }
            else if (var39.eql((SubLObject)$ic27$)) {
                f42847(var35, var38);
            }
            else if (var39.eql((SubLObject)$ic28$)) {
                f42848(var35, var38);
            }
            else {
                Errors.error((SubLObject)$ic29$, var37);
            }
        }
        return var35;
    }
    
    public static SubLObject f42850(final SubLObject var40, final SubLObject var41) {
        Functions.funcall(var41, var40, (SubLObject)$ic30$, (SubLObject)$ic31$, (SubLObject)THREE_INTEGER);
        Functions.funcall(var41, var40, (SubLObject)$ic32$, (SubLObject)$ic26$, f42843(var40));
        Functions.funcall(var41, var40, (SubLObject)$ic32$, (SubLObject)$ic27$, f42844(var40));
        Functions.funcall(var41, var40, (SubLObject)$ic32$, (SubLObject)$ic28$, f42845(var40));
        Functions.funcall(var41, var40, (SubLObject)$ic33$, (SubLObject)$ic31$, (SubLObject)THREE_INTEGER);
        return var40;
    }
    
    public static SubLObject f42851(final SubLObject var40, final SubLObject var41) {
        return f42850(var40, var41);
    }
    
    public static SubLObject f42842(final SubLObject var42, final SubLObject var31, final SubLObject var43) {
        PrintLow.format(var31, (SubLObject)$ic35$, f42843(var42));
        if (NIL != f42844(var42)) {
            print_high.princ(f42844(var42), var31);
            print_high.princ(f42845(var42), var31);
        }
        print_high.princ((SubLObject)$ic5$, var31);
        return var42;
    }
    
    public static SubLObject f42852(final SubLObject var44, final SubLObject var45) {
        final SubLThread var46 = SubLProcess.currentSubLThread();
        var46.resetMultipleValues();
        final SubLObject var47 = f42853(var44, var45);
        final SubLObject var48 = var46.secondMultipleValue();
        final SubLObject var49 = var46.thirdMultipleValue();
        var46.resetMultipleValues();
        return f42814(var47, var48, var49);
    }
    
    public static SubLObject f42853(final SubLObject var44, final SubLObject var45) {
        final SubLThread var46 = SubLProcess.currentSubLThread();
        var46.resetMultipleValues();
        SubLObject var47 = f42826(var45);
        SubLObject var48 = var46.secondMultipleValue();
        var46.resetMultipleValues();
        if (ZERO_INTEGER.eql(var47)) {
            return Values.values(var44, var48, module0038.f2623(var45, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED));
        }
        if (NIL != var47) {
            final SubLObject var49 = Sequences.cconcatenate(var44, module0038.f2623(var45, (SubLObject)ZERO_INTEGER, var47));
            final SubLObject var50 = module0038.f2623(var45, module0048.f_1X(var47), (SubLObject)UNPROVIDED);
            return Values.values(var49, var48, var50);
        }
        var46.resetMultipleValues();
        var47 = f42826(var44);
        var48 = var46.secondMultipleValue();
        var46.resetMultipleValues();
        if (var48.eql(module0038.f2637(var44))) {
            return Values.values(module0038.f2666(var44, (SubLObject)UNPROVIDED), var48, var45);
        }
        if (NIL != var47) {
            final SubLObject var49 = module0038.f2623(var44, (SubLObject)ZERO_INTEGER, var47);
            final SubLObject var50 = Sequences.cconcatenate(module0038.f2623(var44, module0048.f_1X(var47), (SubLObject)UNPROVIDED), var45);
            return Values.values(var49, var48, var50);
        }
        var46.resetMultipleValues();
        final SubLObject var51 = f42816(Sequences.cconcatenate(var44, var45));
        var48 = var46.secondMultipleValue();
        final SubLObject var52 = var46.thirdMultipleValue();
        var46.resetMultipleValues();
        return Values.values(var51, var48, var52);
    }
    
    public static SubLObject f42854(final SubLObject var1, final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        var47.resetMultipleValues();
        final SubLObject var48 = module0589.f35917(var1, var46);
        final SubLObject var49 = var47.secondMultipleValue();
        var47.resetMultipleValues();
        return f42852(var48, var49);
    }
    
    public static SubLObject f42825(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        assert NIL != module0589.f35907(var1, (SubLObject)UNPROVIDED) : var1;
        if (NIL != var3 && !areAssertionsDisabledFor(me) && NIL == Types.stringp(var3)) {
            throw new AssertionError(var3);
        }
        if (NIL != var2 && !areAssertionsDisabledFor(me) && NIL == f42815(var2)) {
            throw new AssertionError(var2);
        }
        final SubLObject var4 = f42849((SubLObject)UNPROVIDED);
        f42846(var4, var1);
        if (NIL != var2) {
            if (var2.isString() && NIL != module0035.f1995(var2, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) {
                f42847(var4, module0038.f2636(var2));
            }
            else {
                f42847(var4, var2);
            }
            f42848(var4, var3);
        }
        return var4;
    }
    
    public static SubLObject f42815(final SubLObject var42) {
        return (SubLObject)makeBoolean(var42.isChar() || var42.isString());
    }
    
    public static SubLObject f42834(final SubLObject var23, final SubLObject var8) {
        return (SubLObject)makeBoolean(NIL != module0038.f2678(var8, f42843(var23), (SubLObject)ZERO_INTEGER, (SubLObject)UNPROVIDED) && (NIL != f42844(var23) || f42843(var23).equal(var8)));
    }
    
    public static SubLObject f42835(final SubLObject var23, final SubLObject var8) {
        final SubLObject var24 = f42844(var23);
        if (NIL == var24) {
            return (SubLObject)T;
        }
        if (var24.isChar()) {
            return Equality.eql(var24, Strings.sublisp_char(var8, Sequences.length(f42843(var23))));
        }
        return module0038.f2678(var8, var24, Sequences.length(f42843(var23)), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f42836(final SubLObject var23, final SubLObject var8) {
        return module0038.f2673(var8, f42845(var23), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f42833(final SubLObject var23, final SubLObject var8) {
        final SubLObject var24 = (SubLObject)(f42844(var23).isChar() ? ONE_INTEGER : Sequences.length(f42844(var23)));
        return module0035.f1995(var8, Numbers.add(Sequences.length(f42843(var23)), var24, Sequences.length(f42845(var23))), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f42855(final SubLObject var8) {
        assert NIL != f42828(var8) : var8;
        final SubLObject var9 = f42843(var8);
        return (NIL != f42844(var8)) ? Sequences.cconcatenate(module0006.f203(var9), new SubLObject[] { module0006.f203(f42844(var8)), module0006.f203(f42845(var8)) }) : module0038.f2658(var9);
    }
    
    public static SubLObject f42830(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        final SubLObject var10 = module0034.$g879$.getDynamicValue(var9);
        SubLObject var11 = (SubLObject)NIL;
        if (NIL == var10) {
            return f42855(var8);
        }
        var11 = module0034.f1857(var10, (SubLObject)$ic37$, (SubLObject)UNPROVIDED);
        if (NIL == var11) {
            var11 = module0034.f1807(module0034.f1842(var10), (SubLObject)$ic37$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var10, (SubLObject)$ic37$, var11);
        }
        SubLObject var12 = module0034.f1814(var11, var8, (SubLObject)$ic8$);
        if (var12 == $ic8$) {
            var12 = Values.arg2(var9.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f42855(var8)));
            module0034.f1816(var11, var8, var12, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var12);
    }
    
    public static SubLObject f42829(final SubLObject var8) {
        assert NIL != f42828(var8) : var8;
        return f42843(var8);
    }
    
    public static SubLObject f42839(final SubLObject var8) {
        assert NIL != f42828(var8) : var8;
        return f42844(var8);
    }
    
    public static SubLObject f42856(final SubLObject var8) {
        return Sequences.cconcatenate(module0006.f203(f42829(var8)), module0006.f203(f42839(var8)));
    }
    
    public static SubLObject f42840(final SubLObject var8) {
        assert NIL != f42828(var8) : var8;
        return f42845(var8);
    }
    
    public static SubLObject f42857(final SubLObject var42) {
        return f42858(var42);
    }
    
    public static SubLObject f42858(final SubLObject var8) {
        return Numbers.logxor(new SubLObject[] { Sxhash.sxhash(f42843(var8)), Sxhash.sxhash(f42844(var8)), Sxhash.sxhash(f42845(var8)) });
    }
    
    public static SubLObject f42859() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0702", "f42814", "S#39907", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0702", "f42819", "S#46859", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0702", "f42820", "S#46860", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0702", "f42821", "S#46861", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0702", "f42817", "S#46862", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0702", "f42822", "S#46863", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0702", "f42823", "S#46864", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0702", "f42824", "S#46865", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0702", "f42818", "S#46866", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0702", "f42816", "S#46867", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0702", "f42827", "S#46868", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0702", "f42831", "S#46649", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0702", "f42832", "S#46518", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0702", "f42837", "S#46533", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0702", "f42838", "S#46869", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0702", "f42826", "S#46870", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0702", "f42841", "S#46871", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0702", "f42828", "S#46508", 1, 0, false);
        new $f42828$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0702", "f42843", "S#46872", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0702", "f42844", "S#46873", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0702", "f42845", "S#46874", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0702", "f42846", "S#46875", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0702", "f42847", "S#46876", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0702", "f42848", "S#46877", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0702", "f42849", "S#46878", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0702", "f42850", "S#46879", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0702", "f42851", "S#46880", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0702", "f42842", "S#46881", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0702", "f42852", "S#46882", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0702", "f42853", "S#46645", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0702", "f42854", "S#46883", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0702", "f42825", "S#46884", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0702", "f42815", "S#46885", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0702", "f42834", "S#46509", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0702", "f42835", "S#46886", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0702", "f42836", "S#46887", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0702", "f42833", "S#46888", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0702", "f42855", "S#46889", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0702", "f42830", "S#46511", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0702", "f42829", "S#46890", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0702", "f42839", "S#46891", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0702", "f42856", "S#46892", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0702", "f42840", "S#46535", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0702", "f42857", "S#46893", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0702", "f42858", "S#46894", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42860() {
        $g5510$ = SubLFiles.deflexical("S#46895", (SubLObject)$ic0$);
        $g5511$ = SubLFiles.deflexical("S#46896", Locks.make_lock((SubLObject)$ic1$));
        $g5512$ = SubLFiles.deflexical("S#46897", (SubLObject)NIL);
        $g5513$ = SubLFiles.deflexical("S#46898", (SubLObject)NIL);
        $g5514$ = SubLFiles.defconstant("S#46899", (SubLObject)$ic12$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42861() {
        module0034.f1909((SubLObject)$ic6$);
        module0034.f1909((SubLObject)$ic9$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g5514$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic18$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic19$);
        Structures.def_csetf((SubLObject)$ic20$, (SubLObject)$ic21$);
        Structures.def_csetf((SubLObject)$ic22$, (SubLObject)$ic23$);
        Structures.def_csetf((SubLObject)$ic24$, (SubLObject)$ic25$);
        Equality.identity((SubLObject)$ic12$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g5514$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic34$));
        module0012.f419((SubLObject)$ic17$);
        module0034.f1895((SubLObject)$ic37$);
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $g5514$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic38$));
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f42859();
    }
    
    public void initializeVariables() {
        f42860();
    }
    
    public void runTopLevelForms() {
        f42861();
    }
    
    static {
        me = (SubLFile)new module0702();
        $g5510$ = null;
        $g5511$ = null;
        $g5512$ = null;
        $g5513$ = null;
        $g5514$ = null;
        $ic0$ = ConsesLow.list((SubLObject)Characters.CHAR_hash, (SubLObject)Characters.CHAR_slash);
        $ic1$ = makeString("RDF URI Lock");
        $ic2$ = makeSymbol("STRINGP");
        $ic3$ = makeSymbol("S#46885", "CYC");
        $ic4$ = makeString("<");
        $ic5$ = makeString(">");
        $ic6$ = makeSymbol("S#46862", "CYC");
        $ic7$ = makeSymbol("S#46897", "CYC");
        $ic8$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic9$ = makeSymbol("S#46866", "CYC");
        $ic10$ = makeSymbol("S#46898", "CYC");
        $ic11$ = makeSymbol("S#46508", "CYC");
        $ic12$ = makeSymbol("S#46858", "CYC");
        $ic13$ = ConsesLow.list((SubLObject)makeSymbol("S#46900", "CYC"), (SubLObject)makeSymbol("S#46901", "CYC"), (SubLObject)makeSymbol("S#46857", "CYC"));
        $ic14$ = ConsesLow.list((SubLObject)makeKeyword("BASE-URI"), (SubLObject)makeKeyword("CONNECTOR"), (SubLObject)makeKeyword("LOCAL-PART"));
        $ic15$ = ConsesLow.list((SubLObject)makeSymbol("S#46872", "CYC"), (SubLObject)makeSymbol("S#46873", "CYC"), (SubLObject)makeSymbol("S#46874", "CYC"));
        $ic16$ = ConsesLow.list((SubLObject)makeSymbol("S#46875", "CYC"), (SubLObject)makeSymbol("S#46876", "CYC"), (SubLObject)makeSymbol("S#46877", "CYC"));
        $ic17$ = makeSymbol("S#46881", "CYC");
        $ic18$ = makeSymbol("S#46871", "CYC");
        $ic19$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#46508", "CYC"));
        $ic20$ = makeSymbol("S#46872", "CYC");
        $ic21$ = makeSymbol("S#46875", "CYC");
        $ic22$ = makeSymbol("S#46873", "CYC");
        $ic23$ = makeSymbol("S#46876", "CYC");
        $ic24$ = makeSymbol("S#46874", "CYC");
        $ic25$ = makeSymbol("S#46877", "CYC");
        $ic26$ = makeKeyword("BASE-URI");
        $ic27$ = makeKeyword("CONNECTOR");
        $ic28$ = makeKeyword("LOCAL-PART");
        $ic29$ = makeString("Invalid slot ~S for construction function");
        $ic30$ = makeKeyword("BEGIN");
        $ic31$ = makeSymbol("S#46878", "CYC");
        $ic32$ = makeKeyword("SLOT");
        $ic33$ = makeKeyword("END");
        $ic34$ = makeSymbol("S#46880", "CYC");
        $ic35$ = makeString("<RDF-URI ~A");
        $ic36$ = makeSymbol("S#39641", "CYC");
        $ic37$ = makeSymbol("S#46511", "CYC");
        $ic38$ = makeSymbol("S#46893", "CYC");
    }
    
    public static final class $sX46858_native extends SubLStructNative
    {
        public SubLObject $base_uri;
        public SubLObject $connector;
        public SubLObject $local_part;
        public static final SubLStructDeclNative structDecl;
        
        public $sX46858_native() {
            this.$base_uri = (SubLObject)CommonSymbols.NIL;
            this.$connector = (SubLObject)CommonSymbols.NIL;
            this.$local_part = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX46858_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$base_uri;
        }
        
        public SubLObject getField3() {
            return this.$connector;
        }
        
        public SubLObject getField4() {
            return this.$local_part;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$base_uri = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$connector = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$local_part = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX46858_native.class, $ic12$, $ic11$, $ic13$, $ic14$, new String[] { "$base_uri", "$connector", "$local_part" }, $ic15$, $ic16$, $ic17$);
        }
    }
    
    public static final class $f42828$UnaryFunction extends UnaryFunction
    {
        public $f42828$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#46508"));
        }
        
        public SubLObject processItem(final SubLObject var32) {
            return f42828(var32);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 184 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/