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
        if (var2 == module0702.UNPROVIDED) {
            var2 = (SubLObject)module0702.NIL;
        }
        if (var3 == module0702.UNPROVIDED) {
            var3 = (SubLObject)module0702.NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        assert module0702.NIL != Types.stringp(var1) : var1;
        if (module0702.NIL != var2 && !module0702.areAssertionsDisabledFor(me) && module0702.NIL == f42815(var2)) {
            throw new AssertionError(var2);
        }
        if (module0702.NIL != var3 && !module0702.areAssertionsDisabledFor(me) && module0702.NIL == Types.stringp(var3)) {
            throw new AssertionError(var3);
        }
        if (module0702.NIL == var2 && module0702.NIL == var3) {
            if (module0702.NIL != module0038.f2684(var1, (SubLObject)module0702.$ic4$) && module0702.NIL != module0038.f2673(var1, (SubLObject)module0702.$ic5$, (SubLObject)module0702.UNPROVIDED)) {
                var1 = Sequences.subseq(var1, (SubLObject)module0702.ONE_INTEGER, Numbers.subtract(Sequences.length(var1), (SubLObject)module0702.ONE_INTEGER));
            }
            var4.resetMultipleValues();
            final SubLObject var5 = f42816(var1);
            final SubLObject var6 = var4.secondMultipleValue();
            final SubLObject var7 = var4.thirdMultipleValue();
            var4.resetMultipleValues();
            if (module0702.NIL != var5) {
                var1 = f42817(var5);
                var2 = var6;
                var3 = var7;
            }
        }
        SubLObject var8 = (SubLObject)module0702.NIL;
        final SubLObject var9 = module0702.$g5511$.getGlobalValue();
        SubLObject var10 = (SubLObject)module0702.NIL;
        try {
            var10 = Locks.seize_lock(var9);
            var8 = f42818(var1, var2, var3);
        }
        finally {
            if (module0702.NIL != var10) {
                Locks.release_lock(var9);
            }
        }
        return var8;
    }
    
    public static SubLObject f42819() {
        final SubLObject var11 = module0702.$g5512$.getGlobalValue();
        if (module0702.NIL != var11) {
            module0034.f1818(var11);
        }
        return (SubLObject)module0702.NIL;
    }
    
    public static SubLObject f42820(final SubLObject var1) {
        return module0034.f1829(module0702.$g5512$.getGlobalValue(), (SubLObject)ConsesLow.list(var1), (SubLObject)module0702.UNPROVIDED, (SubLObject)module0702.UNPROVIDED);
    }
    
    public static SubLObject f42821(final SubLObject var1) {
        return var1;
    }
    
    public static SubLObject f42817(final SubLObject var1) {
        SubLObject var2 = module0702.$g5512$.getGlobalValue();
        if (module0702.NIL == var2) {
            var2 = module0034.f1934((SubLObject)module0702.$ic6$, (SubLObject)module0702.$ic7$, (SubLObject)module0702.NIL, (SubLObject)module0702.EQUAL, (SubLObject)module0702.ONE_INTEGER, (SubLObject)module0702.ZERO_INTEGER);
        }
        SubLObject var3 = module0034.f1814(var2, var1, (SubLObject)module0702.$ic8$);
        if (var3 == module0702.$ic8$) {
            var3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f42821(var1)));
            module0034.f1816(var2, var1, var3, (SubLObject)module0702.UNPROVIDED);
        }
        return module0034.f1959(var3);
    }
    
    public static SubLObject f42822() {
        final SubLObject var11 = module0702.$g5513$.getGlobalValue();
        if (module0702.NIL != var11) {
            module0034.f1818(var11);
        }
        return (SubLObject)module0702.NIL;
    }
    
    public static SubLObject f42823(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        return module0034.f1829(module0702.$g5513$.getGlobalValue(), (SubLObject)ConsesLow.list(var1, var2, var3), (SubLObject)module0702.UNPROVIDED, (SubLObject)module0702.UNPROVIDED);
    }
    
    public static SubLObject f42824(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        return f42825(var1, var2, var3);
    }
    
    public static SubLObject f42818(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        SubLObject var4 = module0702.$g5513$.getGlobalValue();
        if (module0702.NIL == var4) {
            var4 = module0034.f1934((SubLObject)module0702.$ic9$, (SubLObject)module0702.$ic10$, (SubLObject)module0702.NIL, (SubLObject)module0702.EQUAL, (SubLObject)module0702.THREE_INTEGER, (SubLObject)module0702.ZERO_INTEGER);
        }
        final SubLObject var5 = module0034.f1781(var1, var2, var3);
        final SubLObject var6 = module0034.f1814(var4, var5, (SubLObject)module0702.UNPROVIDED);
        if (var6 != module0702.$ic8$) {
            SubLObject var7 = var6;
            SubLObject var8 = (SubLObject)module0702.NIL;
            var8 = var7.first();
            while (module0702.NIL != var7) {
                SubLObject var9 = var8.first();
                final SubLObject var10 = conses_high.second(var8);
                if (var1.equal(var9.first())) {
                    var9 = var9.rest();
                    if (var2.equal(var9.first())) {
                        var9 = var9.rest();
                        if (module0702.NIL != var9 && module0702.NIL == var9.rest() && var3.equal(var9.first())) {
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
        SubLObject var10 = (SubLObject)((module0702.NIL != module0589.f35907(var8, (SubLObject)module0702.UNPROVIDED)) ? var8 : module0702.NIL);
        SubLObject var11 = (SubLObject)module0702.NIL;
        var9.resetMultipleValues();
        final SubLObject var12 = f42826(var8);
        final SubLObject var13 = var9.secondMultipleValue();
        var9.resetMultipleValues();
        if (module0702.NIL != var12) {
            var10 = module0038.f2623(var8, (SubLObject)module0702.ZERO_INTEGER, var12);
            var11 = module0038.f2623(var8, module0048.f_1X(var12), (SubLObject)module0702.UNPROVIDED);
        }
        return Values.values(var10, var13, var11);
    }
    
    public static SubLObject f42827(final SubLObject var23, final SubLObject var24) {
        assert module0702.NIL != f42828(var23) : var23;
        assert module0702.NIL != Types.stringp(var24) : var24;
        if (module0702.NIL != module0038.f2684(f42829(var23), var24)) {
            return (SubLObject)module0702.T;
        }
        if (module0702.NIL != module0035.f2007(var24, f42829(var23)) && module0702.NIL != module0038.f2684(f42830(var23), var24)) {
            return (SubLObject)module0702.T;
        }
        return (SubLObject)module0702.NIL;
    }
    
    public static SubLObject f42831(final SubLObject var25, final SubLObject var26) {
        assert module0702.NIL != f42828(var25) : var25;
        assert module0702.NIL != f42828(var26) : var26;
        return Equality.equal(f42830(var25), f42830(var26));
    }
    
    public static SubLObject f42832(final SubLObject var23, final SubLObject var8) {
        assert module0702.NIL != f42828(var23) : var23;
        assert module0702.NIL != Types.stringp(var8) : var8;
        return (SubLObject)SubLObjectFactory.makeBoolean(module0702.NIL != f42833(var23, var8) && module0702.NIL != f42834(var23, var8) && module0702.NIL != f42835(var23, var8) && module0702.NIL != f42836(var23, var8));
    }
    
    public static SubLObject f42837(final SubLObject var23) {
        final SubLObject var24 = f42830(var23);
        return (module0702.NIL != module0039.f3006(var24)) ? var24 : module0208.f13541(var24);
    }
    
    public static SubLObject f42838(final SubLObject var23, final SubLObject var3) {
        assert module0702.NIL != f42828(var23) : var23;
        return (SubLObject)SubLObjectFactory.makeBoolean(f42839(var23).eql((SubLObject)Characters.CHAR_hash) && f42840(var23).equal(var3) && module0702.NIL != module0035.f1995(f42829(var23), module0048.f_1_(Sequences.length(module0699.f42527())), (SubLObject)module0702.UNPROVIDED) && module0702.NIL != module0038.f2684(module0699.f42527(), f42829(var23)));
    }
    
    public static SubLObject f42826(final SubLObject var28) {
        SubLObject var29 = module0702.$g5510$.getGlobalValue();
        SubLObject var30 = (SubLObject)module0702.NIL;
        var30 = var29.first();
        while (module0702.NIL != var29) {
            final SubLObject var31 = module0035.f2029(var30, var28, (SubLObject)module0702.UNPROVIDED, (SubLObject)module0702.UNPROVIDED, (SubLObject)module0702.UNPROVIDED, (SubLObject)module0702.UNPROVIDED);
            if (module0702.NIL != var31) {
                return Values.values(var31, var30);
            }
            var29 = var29.rest();
            var30 = var29.first();
        }
        return Values.values((SubLObject)module0702.NIL, (SubLObject)module0702.NIL);
    }
    
    public static SubLObject f42841(final SubLObject var30, final SubLObject var31) {
        f42842(var30, var31, (SubLObject)module0702.ZERO_INTEGER);
        return (SubLObject)module0702.NIL;
    }
    
    public static SubLObject f42828(final SubLObject var30) {
        return (SubLObject)((var30.getClass() == $sX46858_native.class) ? module0702.T : module0702.NIL);
    }
    
    public static SubLObject f42843(final SubLObject var30) {
        assert module0702.NIL != f42828(var30) : var30;
        return var30.getField2();
    }
    
    public static SubLObject f42844(final SubLObject var30) {
        assert module0702.NIL != f42828(var30) : var30;
        return var30.getField3();
    }
    
    public static SubLObject f42845(final SubLObject var30) {
        assert module0702.NIL != f42828(var30) : var30;
        return var30.getField4();
    }
    
    public static SubLObject f42846(final SubLObject var30, final SubLObject var33) {
        assert module0702.NIL != f42828(var30) : var30;
        return var30.setField2(var33);
    }
    
    public static SubLObject f42847(final SubLObject var30, final SubLObject var33) {
        assert module0702.NIL != f42828(var30) : var30;
        return var30.setField3(var33);
    }
    
    public static SubLObject f42848(final SubLObject var30, final SubLObject var33) {
        assert module0702.NIL != f42828(var30) : var30;
        return var30.setField4(var33);
    }
    
    public static SubLObject f42849(SubLObject var34) {
        if (var34 == module0702.UNPROVIDED) {
            var34 = (SubLObject)module0702.NIL;
        }
        final SubLObject var35 = (SubLObject)new $sX46858_native();
        SubLObject var36;
        SubLObject var37;
        SubLObject var38;
        SubLObject var39;
        for (var36 = (SubLObject)module0702.NIL, var36 = var34; module0702.NIL != var36; var36 = conses_high.cddr(var36)) {
            var37 = var36.first();
            var38 = conses_high.cadr(var36);
            var39 = var37;
            if (var39.eql((SubLObject)module0702.$ic26$)) {
                f42846(var35, var38);
            }
            else if (var39.eql((SubLObject)module0702.$ic27$)) {
                f42847(var35, var38);
            }
            else if (var39.eql((SubLObject)module0702.$ic28$)) {
                f42848(var35, var38);
            }
            else {
                Errors.error((SubLObject)module0702.$ic29$, var37);
            }
        }
        return var35;
    }
    
    public static SubLObject f42850(final SubLObject var40, final SubLObject var41) {
        Functions.funcall(var41, var40, (SubLObject)module0702.$ic30$, (SubLObject)module0702.$ic31$, (SubLObject)module0702.THREE_INTEGER);
        Functions.funcall(var41, var40, (SubLObject)module0702.$ic32$, (SubLObject)module0702.$ic26$, f42843(var40));
        Functions.funcall(var41, var40, (SubLObject)module0702.$ic32$, (SubLObject)module0702.$ic27$, f42844(var40));
        Functions.funcall(var41, var40, (SubLObject)module0702.$ic32$, (SubLObject)module0702.$ic28$, f42845(var40));
        Functions.funcall(var41, var40, (SubLObject)module0702.$ic33$, (SubLObject)module0702.$ic31$, (SubLObject)module0702.THREE_INTEGER);
        return var40;
    }
    
    public static SubLObject f42851(final SubLObject var40, final SubLObject var41) {
        return f42850(var40, var41);
    }
    
    public static SubLObject f42842(final SubLObject var42, final SubLObject var31, final SubLObject var43) {
        PrintLow.format(var31, (SubLObject)module0702.$ic35$, f42843(var42));
        if (module0702.NIL != f42844(var42)) {
            print_high.princ(f42844(var42), var31);
            print_high.princ(f42845(var42), var31);
        }
        print_high.princ((SubLObject)module0702.$ic5$, var31);
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
        if (module0702.ZERO_INTEGER.eql(var47)) {
            return Values.values(var44, var48, module0038.f2623(var45, (SubLObject)module0702.ONE_INTEGER, (SubLObject)module0702.UNPROVIDED));
        }
        if (module0702.NIL != var47) {
            final SubLObject var49 = Sequences.cconcatenate(var44, module0038.f2623(var45, (SubLObject)module0702.ZERO_INTEGER, var47));
            final SubLObject var50 = module0038.f2623(var45, module0048.f_1X(var47), (SubLObject)module0702.UNPROVIDED);
            return Values.values(var49, var48, var50);
        }
        var46.resetMultipleValues();
        var47 = f42826(var44);
        var48 = var46.secondMultipleValue();
        var46.resetMultipleValues();
        if (var48.eql(module0038.f2637(var44))) {
            return Values.values(module0038.f2666(var44, (SubLObject)module0702.UNPROVIDED), var48, var45);
        }
        if (module0702.NIL != var47) {
            final SubLObject var49 = module0038.f2623(var44, (SubLObject)module0702.ZERO_INTEGER, var47);
            final SubLObject var50 = Sequences.cconcatenate(module0038.f2623(var44, module0048.f_1X(var47), (SubLObject)module0702.UNPROVIDED), var45);
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
        assert module0702.NIL != module0589.f35907(var1, (SubLObject)module0702.UNPROVIDED) : var1;
        if (module0702.NIL != var3 && !module0702.areAssertionsDisabledFor(me) && module0702.NIL == Types.stringp(var3)) {
            throw new AssertionError(var3);
        }
        if (module0702.NIL != var2 && !module0702.areAssertionsDisabledFor(me) && module0702.NIL == f42815(var2)) {
            throw new AssertionError(var2);
        }
        final SubLObject var4 = f42849((SubLObject)module0702.UNPROVIDED);
        f42846(var4, var1);
        if (module0702.NIL != var2) {
            if (var2.isString() && module0702.NIL != module0035.f1995(var2, (SubLObject)module0702.ONE_INTEGER, (SubLObject)module0702.UNPROVIDED)) {
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
        return (SubLObject)SubLObjectFactory.makeBoolean(var42.isChar() || var42.isString());
    }
    
    public static SubLObject f42834(final SubLObject var23, final SubLObject var8) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0702.NIL != module0038.f2678(var8, f42843(var23), (SubLObject)module0702.ZERO_INTEGER, (SubLObject)module0702.UNPROVIDED) && (module0702.NIL != f42844(var23) || f42843(var23).equal(var8)));
    }
    
    public static SubLObject f42835(final SubLObject var23, final SubLObject var8) {
        final SubLObject var24 = f42844(var23);
        if (module0702.NIL == var24) {
            return (SubLObject)module0702.T;
        }
        if (var24.isChar()) {
            return Equality.eql(var24, Strings.sublisp_char(var8, Sequences.length(f42843(var23))));
        }
        return module0038.f2678(var8, var24, Sequences.length(f42843(var23)), (SubLObject)module0702.UNPROVIDED);
    }
    
    public static SubLObject f42836(final SubLObject var23, final SubLObject var8) {
        return module0038.f2673(var8, f42845(var23), (SubLObject)module0702.UNPROVIDED);
    }
    
    public static SubLObject f42833(final SubLObject var23, final SubLObject var8) {
        final SubLObject var24 = (SubLObject)(f42844(var23).isChar() ? module0702.ONE_INTEGER : Sequences.length(f42844(var23)));
        return module0035.f1995(var8, Numbers.add(Sequences.length(f42843(var23)), var24, Sequences.length(f42845(var23))), (SubLObject)module0702.UNPROVIDED);
    }
    
    public static SubLObject f42855(final SubLObject var8) {
        assert module0702.NIL != f42828(var8) : var8;
        final SubLObject var9 = f42843(var8);
        return (module0702.NIL != f42844(var8)) ? Sequences.cconcatenate(module0006.f203(var9), new SubLObject[] { module0006.f203(f42844(var8)), module0006.f203(f42845(var8)) }) : module0038.f2658(var9);
    }
    
    public static SubLObject f42830(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        final SubLObject var10 = module0034.$g879$.getDynamicValue(var9);
        SubLObject var11 = (SubLObject)module0702.NIL;
        if (module0702.NIL == var10) {
            return f42855(var8);
        }
        var11 = module0034.f1857(var10, (SubLObject)module0702.$ic37$, (SubLObject)module0702.UNPROVIDED);
        if (module0702.NIL == var11) {
            var11 = module0034.f1807(module0034.f1842(var10), (SubLObject)module0702.$ic37$, (SubLObject)module0702.ONE_INTEGER, (SubLObject)module0702.NIL, (SubLObject)module0702.EQUAL, (SubLObject)module0702.UNPROVIDED);
            module0034.f1860(var10, (SubLObject)module0702.$ic37$, var11);
        }
        SubLObject var12 = module0034.f1814(var11, var8, (SubLObject)module0702.$ic8$);
        if (var12 == module0702.$ic8$) {
            var12 = Values.arg2(var9.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f42855(var8)));
            module0034.f1816(var11, var8, var12, (SubLObject)module0702.UNPROVIDED);
        }
        return module0034.f1959(var12);
    }
    
    public static SubLObject f42829(final SubLObject var8) {
        assert module0702.NIL != f42828(var8) : var8;
        return f42843(var8);
    }
    
    public static SubLObject f42839(final SubLObject var8) {
        assert module0702.NIL != f42828(var8) : var8;
        return f42844(var8);
    }
    
    public static SubLObject f42856(final SubLObject var8) {
        return Sequences.cconcatenate(module0006.f203(f42829(var8)), module0006.f203(f42839(var8)));
    }
    
    public static SubLObject f42840(final SubLObject var8) {
        assert module0702.NIL != f42828(var8) : var8;
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
        return (SubLObject)module0702.NIL;
    }
    
    public static SubLObject f42860() {
        module0702.$g5510$ = SubLFiles.deflexical("S#46895", (SubLObject)module0702.$ic0$);
        module0702.$g5511$ = SubLFiles.deflexical("S#46896", Locks.make_lock((SubLObject)module0702.$ic1$));
        module0702.$g5512$ = SubLFiles.deflexical("S#46897", (SubLObject)module0702.NIL);
        module0702.$g5513$ = SubLFiles.deflexical("S#46898", (SubLObject)module0702.NIL);
        module0702.$g5514$ = SubLFiles.defconstant("S#46899", (SubLObject)module0702.$ic12$);
        return (SubLObject)module0702.NIL;
    }
    
    public static SubLObject f42861() {
        module0034.f1909((SubLObject)module0702.$ic6$);
        module0034.f1909((SubLObject)module0702.$ic9$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0702.$g5514$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0702.$ic18$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0702.$ic19$);
        Structures.def_csetf((SubLObject)module0702.$ic20$, (SubLObject)module0702.$ic21$);
        Structures.def_csetf((SubLObject)module0702.$ic22$, (SubLObject)module0702.$ic23$);
        Structures.def_csetf((SubLObject)module0702.$ic24$, (SubLObject)module0702.$ic25$);
        Equality.identity((SubLObject)module0702.$ic12$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0702.$g5514$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0702.$ic34$));
        module0012.f419((SubLObject)module0702.$ic17$);
        module0034.f1895((SubLObject)module0702.$ic37$);
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), module0702.$g5514$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0702.$ic38$));
        return (SubLObject)module0702.NIL;
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
        module0702.$g5510$ = null;
        module0702.$g5511$ = null;
        module0702.$g5512$ = null;
        module0702.$g5513$ = null;
        module0702.$g5514$ = null;
        $ic0$ = ConsesLow.list((SubLObject)Characters.CHAR_hash, (SubLObject)Characters.CHAR_slash);
        $ic1$ = SubLObjectFactory.makeString("RDF URI Lock");
        $ic2$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic3$ = SubLObjectFactory.makeSymbol("S#46885", "CYC");
        $ic4$ = SubLObjectFactory.makeString("<");
        $ic5$ = SubLObjectFactory.makeString(">");
        $ic6$ = SubLObjectFactory.makeSymbol("S#46862", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#46897", "CYC");
        $ic8$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic9$ = SubLObjectFactory.makeSymbol("S#46866", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#46898", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#46508", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#46858", "CYC");
        $ic13$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#46900", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#46901", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#46857", "CYC"));
        $ic14$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BASE-URI"), (SubLObject)SubLObjectFactory.makeKeyword("CONNECTOR"), (SubLObject)SubLObjectFactory.makeKeyword("LOCAL-PART"));
        $ic15$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#46872", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#46873", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#46874", "CYC"));
        $ic16$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#46875", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#46876", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#46877", "CYC"));
        $ic17$ = SubLObjectFactory.makeSymbol("S#46881", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#46871", "CYC");
        $ic19$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#46508", "CYC"));
        $ic20$ = SubLObjectFactory.makeSymbol("S#46872", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#46875", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#46873", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("S#46876", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#46874", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#46877", "CYC");
        $ic26$ = SubLObjectFactory.makeKeyword("BASE-URI");
        $ic27$ = SubLObjectFactory.makeKeyword("CONNECTOR");
        $ic28$ = SubLObjectFactory.makeKeyword("LOCAL-PART");
        $ic29$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic30$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic31$ = SubLObjectFactory.makeSymbol("S#46878", "CYC");
        $ic32$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic33$ = SubLObjectFactory.makeKeyword("END");
        $ic34$ = SubLObjectFactory.makeSymbol("S#46880", "CYC");
        $ic35$ = SubLObjectFactory.makeString("<RDF-URI ~A");
        $ic36$ = SubLObjectFactory.makeSymbol("S#39641", "CYC");
        $ic37$ = SubLObjectFactory.makeSymbol("S#46511", "CYC");
        $ic38$ = SubLObjectFactory.makeSymbol("S#46893", "CYC");
    }
    
    public static final class $sX46858_native extends SubLStructNative
    {
        public SubLObject $base_uri;
        public SubLObject $connector;
        public SubLObject $local_part;
        private static final SubLStructDeclNative structDecl;
        
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
            structDecl = Structures.makeStructDeclNative((Class)$sX46858_native.class, module0702.$ic12$, module0702.$ic11$, module0702.$ic13$, module0702.$ic14$, new String[] { "$base_uri", "$connector", "$local_part" }, module0702.$ic15$, module0702.$ic16$, module0702.$ic17$);
        }
    }
    
    public static final class $f42828$UnaryFunction extends UnaryFunction
    {
        public $f42828$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#46508"));
        }
        
        public SubLObject processItem(final SubLObject var32) {
            return module0702.f42828(var32);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0702.class
	Total time: 184 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/