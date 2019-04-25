package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0006 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0006";
    public static final String myFingerPrint = "3430c26f2e1621fd1cd84a0ba5a8d8c2b25ca528b4d0a0602c74d99bb9ef3f77";
    public static SubLSymbol $g11$;
    public static SubLSymbol $g12$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLString $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLString $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLString $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLList $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLList $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    
    public static SubLObject f197(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        if (NIL != f198(var5)) {
            return f199(var5, var6);
        }
        return (SubLObject)ConsesLow.listS((SubLObject)$ic1$, (SubLObject)NIL, var5, ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f200(final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        assert NIL != Types.integerp(var7) : var7;
        if (var7.isBignum() || !TEN_INTEGER.eql(print_high.$print_base$.getDynamicValue(var8))) {
            return print_high.princ_to_string(var7);
        }
        final SubLObject var9 = Numbers.add((SubLObject)(var7.isNegative() ? ONE_INTEGER : ZERO_INTEGER), f201(var7));
        SubLObject var10 = Strings.make_string(var9, (SubLObject)UNPROVIDED);
        SubLObject var11 = Numbers.abs(var7);
        final SubLObject var12 = (SubLObject)$ic3$;
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)ZERO_INTEGER;
        while (!var11.numL((SubLObject)TEN_INTEGER)) {
            var13 = Numbers.mod(var11, (SubLObject)TEN_INTEGER);
            var11 = Numbers.integerDivide(var11, (SubLObject)TEN_INTEGER);
            Strings.set_char(var10, var14, Strings.sublisp_char(var12, var13));
            var14 = Numbers.add(var14, (SubLObject)ONE_INTEGER);
        }
        Strings.set_char(var10, var14, Strings.sublisp_char(var12, var11));
        var14 = Numbers.add(var14, (SubLObject)ONE_INTEGER);
        if (var7.isNegative()) {
            Strings.set_char(var10, var14, (SubLObject)Characters.CHAR_hyphen);
        }
        var10 = Sequences.nreverse(var10);
        return var10;
    }
    
    public static SubLObject f202(final SubLObject var15) {
        if (var15.isSymbol()) {
            return Sequences.copy_seq(Symbols.symbol_name(var15));
        }
        if (var15.isString()) {
            return Sequences.copy_seq(var15);
        }
        if (var15.isInteger()) {
            return f200(var15);
        }
        return print_high.princ_to_string(var15);
    }
    
    public static SubLObject f203(final SubLObject var15) {
        if (var15.isSymbol()) {
            return Symbols.symbol_name(var15);
        }
        if (var15.isString()) {
            return var15;
        }
        if (var15.isInteger()) {
            return f200(var15);
        }
        return print_high.princ_to_string(var15);
    }
    
    public static SubLObject f204(final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        if (var15.isSymbol() && Packages.$package$.getDynamicValue(var16).eql(Symbols.symbol_package(var15)) && var15.eql(Packages.find_symbol(Symbols.symbol_name(var15), Packages.$package$.getDynamicValue(var16)))) {
            return f202(var15);
        }
        if (var15.isNumber()) {
            return f202(var15);
        }
        return print_high.prin1_to_string(var15);
    }
    
    public static SubLObject f205(final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        if (var15.isSymbol() && Packages.$package$.getDynamicValue(var16).eql(Symbols.symbol_package(var15)) && var15.eql(Packages.find_symbol(Symbols.symbol_name(var15), Packages.$package$.getDynamicValue(var16)))) {
            return f203(var15);
        }
        if (var15.isNumber()) {
            return f203(var15);
        }
        return print_high.prin1_to_string(var15);
    }
    
    public static SubLObject f206(final SubLObject var15) {
        assert NIL != Types.numberp(var15) : var15;
        return f202(var15);
    }
    
    public static SubLObject f207(final SubLObject var15) {
        assert NIL != Types.numberp(var15) : var15;
        return f203(var15);
    }
    
    public static SubLObject f208() {
        return Sequences.copy_seq($g11$.getGlobalValue());
    }
    
    public static SubLObject f209() {
        return Sequences.copy_seq($g12$.getGlobalValue());
    }
    
    public static SubLObject f199(final SubLObject var5, final SubLObject var6) {
        return f210(f211(f212(var5), var6));
    }
    
    public static SubLObject f198(final SubLObject var5) {
        if (!var5.isString()) {
            return (SubLObject)NIL;
        }
        final SubLObject var6 = Sequences.length(var5);
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var8 = (SubLObject)NIL, var7 = (SubLObject)ZERO_INTEGER, var8 = Sequences.position((SubLObject)Characters.CHAR_tilde, var5, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY), var7, (SubLObject)NIL); NIL != var8; var8 = Sequences.position((SubLObject)Characters.CHAR_tilde, var5, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY), var7, (SubLObject)NIL)) {
            var9 = Numbers.add((SubLObject)ONE_INTEGER, var8);
            if (!var9.numL(var6)) {
                return (SubLObject)NIL;
            }
            var10 = Strings.sublisp_char(var5, var9);
            if (NIL == Sequences.find(var10, (SubLObject)$ic16$, Symbols.symbol_function((SubLObject)$ic17$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                return (SubLObject)NIL;
            }
            var7 = Numbers.add(var8, (SubLObject)TWO_INTEGER);
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f210(final SubLObject var21) {
        if (NIL == var21.rest()) {
            final SubLObject var22 = var21.first();
            if (var22.isAtom()) {
                if (var22 == $ic18$) {
                    return (SubLObject)$ic19$;
                }
                if (var22 == $ic20$) {
                    return (SubLObject)$ic21$;
                }
                if (var22.isString()) {
                    return (SubLObject)ConsesLow.list((SubLObject)$ic22$, var22);
                }
            }
            else {
                SubLObject var24;
                final SubLObject var23 = var24 = var22;
                SubLObject var25 = (SubLObject)NIL;
                SubLObject var26 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)$ic23$);
                var25 = var24.first();
                var24 = var24.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)$ic23$);
                var26 = var24.first();
                var24 = var24.rest();
                if (NIL == var24) {
                    if (var25 == $ic6$) {
                        return (SubLObject)ConsesLow.list((SubLObject)$ic4$, var26);
                    }
                    if (var25 == $ic8$) {
                        return (SubLObject)ConsesLow.list((SubLObject)$ic7$, var26);
                    }
                    if (var25 == $ic11$) {
                        return (SubLObject)ConsesLow.list((SubLObject)$ic9$, var26);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var23, (SubLObject)$ic23$);
                }
            }
        }
        return reader.bq_cons((SubLObject)$ic24$, ConsesLow.append(var21, (SubLObject)NIL));
    }
    
    public static SubLObject f211(final SubLObject var27, final SubLObject var6) {
        if (NIL == var27) {
            return (SubLObject)NIL;
        }
        SubLObject var28 = (SubLObject)NIL;
        SubLObject var29 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var27, var27, (SubLObject)$ic25$);
        var28 = var27.first();
        final SubLObject var30 = var29 = var27.rest();
        final SubLObject var31 = var6.first();
        final SubLObject var32 = var6.rest();
        if ($ic26$.equalp(var28)) {
            return (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic6$, var31), f211(var29, var32));
        }
        if ($ic27$.equalp(var28)) {
            return (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic8$, var31), f211(var29, var32));
        }
        if ($ic28$.equalp(var28)) {
            return (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic11$, var31), f211(var29, var32));
        }
        if ($ic29$.equalp(var28)) {
            return (SubLObject)ConsesLow.cons((SubLObject)$ic18$, f211(var29, var6));
        }
        if ($ic30$.equalp(var28)) {
            return (SubLObject)ConsesLow.cons((SubLObject)$ic20$, f211(var29, var6));
        }
        return (SubLObject)ConsesLow.cons(var28, f211(var29, var6));
    }
    
    public static SubLObject f212(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var5) : var5;
        if (var5.equal((SubLObject)$ic32$)) {
            return (SubLObject)NIL;
        }
        var6.resetMultipleValues();
        final SubLObject var7 = f213(var5);
        final SubLObject var8 = var6.secondMultipleValue();
        var6.resetMultipleValues();
        return (SubLObject)ConsesLow.cons(var7, f212(var8));
    }
    
    public static SubLObject f213(final SubLObject var5) {
        final SubLObject var6 = Sequences.position((SubLObject)Characters.CHAR_tilde, var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL == var6) {
            return Values.values(var5, (SubLObject)$ic32$);
        }
        if (ZERO_INTEGER.numE(var6)) {
            return Values.values(Sequences.subseq(var5, (SubLObject)ZERO_INTEGER, (SubLObject)TWO_INTEGER), Sequences.subseq(var5, (SubLObject)TWO_INTEGER, (SubLObject)NIL));
        }
        return Values.values(Sequences.subseq(var5, (SubLObject)ZERO_INTEGER, var6), Sequences.subseq(var5, var6, (SubLObject)NIL));
    }
    
    public static SubLObject f201(final SubLObject var7) {
        assert NIL != Types.integerp(var7) : var7;
        SubLObject var8 = Numbers.abs(var7);
        SubLObject var9 = (SubLObject)ONE_INTEGER;
        while (!var8.numL((SubLObject)TEN_INTEGER)) {
            var9 = Numbers.add(var9, (SubLObject)ONE_INTEGER);
            var8 = Numbers.integerDivide(var8, (SubLObject)TEN_INTEGER);
        }
        return var9;
    }
    
    public static SubLObject f214(final SubLObject var34, SubLObject var35) {
        if (var35 == UNPROVIDED) {
            var35 = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject var36 = var34;
        SubLObject var37 = (SubLObject)NIL;
        var37 = var36.first();
        while (NIL != var36) {
            PrintLow.format(var35, (SubLObject)$ic33$, var37);
            var36 = var36.rest();
            var37 = var36.first();
        }
        streams_high.force_output(var35);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f215(final SubLObject var34, SubLObject var35) {
        if (var35 == UNPROVIDED) {
            var35 = StreamsLow.$standard_output$.getDynamicValue();
        }
        return f216(var34, Symbols.symbol_function((SubLObject)IDENTITY), var35);
    }
    
    public static SubLObject f217(final SubLObject var34, SubLObject var35) {
        if (var35 == UNPROVIDED) {
            var35 = StreamsLow.$standard_output$.getDynamicValue();
        }
        return f215(var34, var35);
    }
    
    public static SubLObject f216(final SubLObject var34, final SubLObject var38, SubLObject var35) {
        if (var35 == UNPROVIDED) {
            var35 = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject var39 = var34;
        SubLObject var40 = (SubLObject)NIL;
        var40 = var39.first();
        while (NIL != var39) {
            print_high.print(Functions.funcall(var38, var40), var35);
            var39 = var39.rest();
            var40 = var39.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f218(final SubLObject var35, final SubLObject var39, SubLObject var40, SubLObject var41, SubLObject var42, SubLObject var43, SubLObject var44, SubLObject var45, SubLObject var46, SubLObject var47) {
        if (var40 == UNPROVIDED) {
            var40 = (SubLObject)NIL;
        }
        if (var41 == UNPROVIDED) {
            var41 = (SubLObject)NIL;
        }
        if (var42 == UNPROVIDED) {
            var42 = (SubLObject)NIL;
        }
        if (var43 == UNPROVIDED) {
            var43 = (SubLObject)NIL;
        }
        if (var44 == UNPROVIDED) {
            var44 = (SubLObject)NIL;
        }
        if (var45 == UNPROVIDED) {
            var45 = (SubLObject)NIL;
        }
        if (var46 == UNPROVIDED) {
            var46 = (SubLObject)NIL;
        }
        if (var47 == UNPROVIDED) {
            var47 = (SubLObject)NIL;
        }
        final SubLObject var48 = PrintLow.format(var35, var39, new SubLObject[] { var40, var41, var42, var43, var44, var45, var46, var47 });
        streams_high.force_output(var35);
        return var48;
    }
    
    public static SubLObject f219() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0006", "f197", "S#176");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0006", "f200", "S#177", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0006", "f202", "S#178", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0006", "f203", "S#179", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0006", "f204", "S#180", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0006", "f205", "S#181", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0006", "f206", "S#182", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0006", "f207", "S#183", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0006", "f208", "S#184", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0006", "f209", "S#185", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0006", "f199", "S#186", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0006", "f198", "S#187", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0006", "f210", "S#188", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0006", "f211", "S#189", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0006", "f212", "S#190", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0006", "f213", "S#191", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0006", "f201", "S#192", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0006", "f214", "S#193", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0006", "f215", "S#194", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0006", "f217", "S#195", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0006", "f216", "S#196", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0006", "f218", "S#197", 2, 8, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f220() {
        $g11$ = SubLFiles.defconstant("S#198", (SubLObject)$ic12$);
        $g12$ = SubLFiles.defconstant("S#199", (SubLObject)$ic14$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f221() {
        module0002.f50((SubLObject)$ic4$, (SubLObject)$ic5$);
        module0002.f50((SubLObject)$ic6$, (SubLObject)$ic5$);
        module0002.f50((SubLObject)$ic7$, (SubLObject)$ic5$);
        module0002.f50((SubLObject)$ic8$, (SubLObject)$ic5$);
        module0002.f50((SubLObject)$ic9$, (SubLObject)$ic5$);
        module0002.f50((SubLObject)$ic11$, (SubLObject)$ic5$);
        module0002.f50((SubLObject)$ic13$, (SubLObject)$ic5$);
        module0002.f50((SubLObject)$ic15$, (SubLObject)$ic5$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f219();
    }
    
    public void initializeVariables() {
        f220();
    }
    
    public void runTopLevelForms() {
        f221();
    }
    
    static {
        me = (SubLFile)new module0006();
        $g11$ = null;
        $g12$ = null;
        $ic0$ = ConsesLow.list((SubLObject)makeSymbol("S#200", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#201", "CYC"));
        $ic1$ = makeSymbol("FORMAT");
        $ic2$ = makeSymbol("INTEGERP");
        $ic3$ = makeString("0123456789");
        $ic4$ = makeSymbol("S#178", "CYC");
        $ic5$ = makeSymbol("S#176", "CYC");
        $ic6$ = makeSymbol("S#179", "CYC");
        $ic7$ = makeSymbol("S#180", "CYC");
        $ic8$ = makeSymbol("S#181", "CYC");
        $ic9$ = makeSymbol("S#182", "CYC");
        $ic10$ = makeSymbol("NUMBERP");
        $ic11$ = makeSymbol("S#183", "CYC");
        $ic12$ = makeString("\n");
        $ic13$ = makeSymbol("S#184", "CYC");
        $ic14$ = makeString("~");
        $ic15$ = makeSymbol("S#185", "CYC");
        $ic16$ = makeString("ASD%~");
        $ic17$ = makeSymbol("CHAR-EQUAL");
        $ic18$ = makeSymbol("S#198", "CYC");
        $ic19$ = ConsesLow.list((SubLObject)makeSymbol("S#184", "CYC"));
        $ic20$ = makeSymbol("S#199", "CYC");
        $ic21$ = ConsesLow.list((SubLObject)makeSymbol("S#185", "CYC"));
        $ic22$ = makeSymbol("COPY-SEQ");
        $ic23$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("S#202", "CYC"));
        $ic24$ = makeSymbol("CCONCATENATE");
        $ic25$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#203", "CYC"), (SubLObject)makeSymbol("S#204", "CYC"));
        $ic26$ = makeString("~A");
        $ic27$ = makeString("~S");
        $ic28$ = makeString("~D");
        $ic29$ = makeString("~%");
        $ic30$ = makeString("~~");
        $ic31$ = makeSymbol("STRINGP");
        $ic32$ = makeString("");
        $ic33$ = makeString("~%~A");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 88 ms
	
	Decompiled with Procyon 0.5.32.
*/