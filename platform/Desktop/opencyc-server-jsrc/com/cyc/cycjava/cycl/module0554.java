package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UserIO;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0554 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0554";
    public static final String myFingerPrint = "e363bee0b28ccbfb4f40e8807b9d6489ffc85a537fe3ef59fcae16d83086f9b8";
    private static SubLSymbol $g4007$;
    public static SubLSymbol $g4008$;
    private static SubLSymbol $g4009$;
    private static SubLSymbol $g4010$;
    private static SubLSymbol $g4011$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLString $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLString $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLString $ic13$;
    private static final SubLString $ic14$;
    private static final SubLString $ic15$;
    private static final SubLList $ic16$;
    private static final SubLList $ic17$;
    private static final SubLList $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLObject $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLList $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLString $ic40$;
    private static final SubLString $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLList $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLList $ic47$;
    private static final SubLList $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLList $ic50$;
    private static final SubLList $ic51$;
    private static final SubLList $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLString $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLList $ic56$;
    private static final SubLList $ic57$;
    private static final SubLList $ic58$;
    private static final SubLList $ic59$;
    private static final SubLList $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLList $ic62$;
    private static final SubLList $ic63$;
    private static final SubLList $ic64$;
    private static final SubLList $ic65$;
    private static final SubLString $ic66$;
    private static final SubLList $ic67$;
    private static final SubLList $ic68$;
    private static final SubLList $ic69$;
    private static final SubLString $ic70$;
    private static final SubLString $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLString $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLList $ic75$;
    private static final SubLList $ic76$;
    private static final SubLList $ic77$;
    private static final SubLList $ic78$;
    private static final SubLList $ic79$;
    private static final SubLList $ic80$;
    private static final SubLList $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLList $ic83$;
    private static final SubLString $ic84$;
    private static final SubLString $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLList $ic87$;
    private static final SubLString $ic88$;
    private static final SubLString $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLList $ic91$;
    private static final SubLString $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLList $ic94$;
    private static final SubLString $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLList $ic97$;
    private static final SubLList $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLObject $ic100$;
    private static final SubLString $ic101$;
    private static final SubLString $ic102$;
    private static final SubLString $ic103$;
    private static final SubLString $ic104$;
    private static final SubLString $ic105$;
    private static final SubLString $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLObject $ic117$;
    private static final SubLObject $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLList $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLString $ic124$;
    private static final SubLString $ic125$;
    private static final SubLList $ic126$;
    private static final SubLList $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLString $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLList $ic132$;
    private static final SubLString $ic133$;
    private static final SubLString $ic134$;
    private static final SubLString $ic135$;
    private static final SubLString $ic136$;
    private static final SubLString $ic137$;
    private static final SubLString $ic138$;
    private static final SubLString $ic139$;
    private static final SubLString $ic140$;
    private static final SubLString $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLString $ic144$;
    private static final SubLString $ic145$;
    private static final SubLString $ic146$;
    private static final SubLString $ic147$;
    private static final SubLString $ic148$;
    private static final SubLString $ic149$;
    private static final SubLList $ic150$;
    private static final SubLList $ic151$;
    private static final SubLList $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLString $ic154$;
    private static final SubLString $ic155$;
    private static final SubLString $ic156$;
    private static final SubLString $ic157$;
    private static final SubLString $ic158$;
    private static final SubLString $ic159$;
    private static final SubLString $ic160$;
    private static final SubLString $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLList $ic164$;
    private static final SubLString $ic165$;
    private static final SubLList $ic166$;
    
    public static SubLObject f34191(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0554.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0554.$ic0$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0554.$ic1$, (SubLObject)ConsesLow.list((SubLObject)module0554.$ic2$, var5), (SubLObject)ConsesLow.listS((SubLObject)module0554.$ic3$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0554.$ic4$, var5)), ConsesLow.append(var6, (SubLObject)module0554.NIL)), (SubLObject)ConsesLow.listS((SubLObject)module0554.$ic5$, (SubLObject)ConsesLow.list((SubLObject)module0554.$ic6$, (SubLObject)module0554.$ic7$, var5), ConsesLow.append(var6, (SubLObject)module0554.NIL)));
    }
    
    public static SubLObject f34192(final SubLObject var7, SubLObject var5) {
        if (var5 == module0554.UNPROVIDED) {
            var5 = (SubLObject)module0554.NIL;
        }
        final SubLThread var8 = SubLProcess.currentSubLThread();
        SubLObject var9 = (SubLObject)module0554.NIL;
        SubLObject var10 = (SubLObject)module0554.NIL;
        SubLObject var11 = (SubLObject)module0554.ONE_INTEGER;
        SubLObject var12 = (SubLObject)module0554.ZERO_INTEGER;
        SubLObject var13 = (SubLObject)module0554.NIL;
        SubLObject var14 = (SubLObject)module0554.NIL;
        SubLObject var15 = (SubLObject)module0554.NIL;
        SubLObject var16 = (SubLObject)module0554.$ic8$;
        SubLObject var17 = (SubLObject)module0554.T;
        SubLObject var18 = (SubLObject)module0554.NIL;
        SubLObject var19 = (SubLObject)module0554.NIL;
        SubLObject var20 = (SubLObject)module0554.NIL;
        SubLObject var21 = (SubLObject)module0554.ZERO_INTEGER;
        SubLObject var22 = (SubLObject)module0554.NIL;
        SubLObject var23 = (SubLObject)module0554.NIL;
        SubLObject var24 = (SubLObject)module0554.NIL;
        SubLObject var25 = (SubLObject)module0554.NIL;
        if (!var5.isString()) {
            var5 = (SubLObject)module0554.NIL;
        }
        if (module0554.NIL == var25) {
            SubLObject var26 = var7;
            SubLObject var27 = (SubLObject)module0554.NIL;
            var27 = var26.first();
            while (module0554.NIL == var25 && module0554.NIL != var26) {
                if (Sequences.length(var10).numG(module0554.$g4007$.getDynamicValue(var8))) {
                    var10 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(var5, var11, var12, (SubLObject)module0554.$ic9$), var10);
                    var25 = (SubLObject)module0554.T;
                }
                final SubLObject var28 = Sequences.length(var27);
                var12 = Numbers.add(var12, (SubLObject)module0554.ONE_INTEGER);
                if (var28.numE((SubLObject)module0554.ZERO_INTEGER) && var11.numE(var12)) {
                    var11 = Numbers.add(var11, (SubLObject)module0554.ONE_INTEGER);
                }
                if (module0554.NIL != var13) {
                    if (module0554.NIL != var19) {
                        var13 = (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_newline, var13);
                    }
                    else {
                        var13 = (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_space, var13);
                    }
                }
                var20 = (SubLObject)module0554.NIL;
                var17 = (SubLObject)module0554.T;
                SubLObject var29;
                SubLObject var30;
                SubLObject var31;
                SubLObject var32;
                SubLObject var33;
                SubLObject var34;
                SubLObject var35;
                SubLObject var36;
                SubLObject var37;
                for (var29 = (SubLObject)module0554.NIL, var29 = (SubLObject)module0554.ZERO_INTEGER; !var29.numE(var28); var29 = Numbers.add(var29, (SubLObject)module0554.ONE_INTEGER)) {
                    var30 = Strings.sublisp_char(var27, var29);
                    if (module0554.NIL == var17 || module0554.NIL == module0038.f2760(var30)) {
                        var17 = (SubLObject)module0554.NIL;
                        if (!var30.equal((SubLObject)Characters.CHAR_return)) {
                            if (!module0554.T.equal(var20)) {
                                if (module0554.T.equal(var18)) {
                                    var13 = (SubLObject)ConsesLow.cons(var30, var13);
                                    var18 = (SubLObject)module0554.NIL;
                                }
                                else if (var30.eql((SubLObject)Characters.CHAR_backslash)) {
                                    var13 = (SubLObject)ConsesLow.cons(var30, var13);
                                    var18 = (SubLObject)module0554.T;
                                }
                                else if (module0554.T.equal(var19)) {
                                    var13 = (SubLObject)ConsesLow.cons(var30, var13);
                                    if (var30.eql((SubLObject)Characters.CHAR_quotation)) {
                                        var19 = (SubLObject)module0554.NIL;
                                    }
                                }
                                else if (var30.eql((SubLObject)Characters.CHAR_quotation)) {
                                    var13 = (SubLObject)ConsesLow.cons(var30, var13);
                                    var19 = (SubLObject)module0554.T;
                                }
                                else if (var30.eql((SubLObject)Characters.CHAR_semicolon)) {
                                    var20 = (SubLObject)module0554.T;
                                }
                                else if (var30.eql((SubLObject)Characters.CHAR_lparen)) {
                                    var13 = (SubLObject)ConsesLow.cons(var30, var13);
                                    if (module0554.NIL == var22) {
                                        var22 = var12;
                                    }
                                    var21 = Numbers.add(var21, (SubLObject)module0554.ONE_INTEGER);
                                }
                                else if (var30.eql((SubLObject)Characters.CHAR_rparen)) {
                                    var13 = (SubLObject)ConsesLow.cons(var30, var13);
                                    var21 = Numbers.subtract(var21, (SubLObject)module0554.ONE_INTEGER);
                                    if (var21.numE((SubLObject)module0554.ZERO_INTEGER)) {
                                        var22 = (SubLObject)module0554.NIL;
                                    }
                                    if (var21.numL((SubLObject)module0554.ZERO_INTEGER)) {
                                        var10 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var5, var11, var12, PrintLow.format((SubLObject)module0554.NIL, (SubLObject)module0554.$ic10$, var12)), var10);
                                    }
                                }
                                else if (!var21.numE((SubLObject)module0554.ZERO_INTEGER)) {
                                    var13 = (SubLObject)ConsesLow.cons(var30, var13);
                                }
                                else if (var30.eql((SubLObject)Characters.CHAR_colon)) {
                                    if (var16 == module0554.$ic11$) {
                                        var13 = (SubLObject)ConsesLow.cons(var30, var13);
                                    }
                                    else {
                                        if (module0554.NIL == var13) {
                                            var10 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(var5, var11, var12, (SubLObject)module0554.$ic12$), var10);
                                        }
                                        else {
                                            var31 = module0038.f2856(Sequences.nreverse(var13));
                                            var13 = (SubLObject)module0554.NIL;
                                            var8.resetMultipleValues();
                                            var32 = module0038.f2872(var31, (SubLObject)module0554.UNPROVIDED);
                                            var33 = var8.secondMultipleValue();
                                            var8.resetMultipleValues();
                                            if (module0554.NIL != var33) {
                                                var34 = var33;
                                                var35 = (SubLObject)module0554.NIL;
                                                var35 = var34.first();
                                                while (module0554.NIL != var34) {
                                                    var10 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var5, var11, var12, var35, var31), var10);
                                                    var34 = var34.rest();
                                                    var35 = var34.first();
                                                }
                                                var23 = (SubLObject)module0554.T;
                                            }
                                            else {
                                                var16 = (SubLObject)module0554.$ic11$;
                                                var14 = var32;
                                            }
                                        }
                                        var17 = (SubLObject)module0554.T;
                                        var13 = (SubLObject)module0554.NIL;
                                    }
                                }
                                else if (var30.eql((SubLObject)Characters.CHAR_period)) {
                                    if (var16 == module0554.$ic8$) {
                                        if (module0554.NIL == var13) {
                                            var10 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(var5, var11, var12, (SubLObject)module0554.$ic12$), var10);
                                        }
                                        else {
                                            var31 = module0038.f2856(Sequences.nreverse(var13));
                                            var13 = (SubLObject)module0554.NIL;
                                            var8.resetMultipleValues();
                                            var32 = module0038.f2872(var31, (SubLObject)module0554.UNPROVIDED);
                                            var33 = var8.secondMultipleValue();
                                            var8.resetMultipleValues();
                                            if (module0554.NIL != var33) {
                                                var34 = var33;
                                                var35 = (SubLObject)module0554.NIL;
                                                var35 = var34.first();
                                                while (module0554.NIL != var34) {
                                                    var10 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var5, var11, var12, var35, var31), var10);
                                                    var34 = var34.rest();
                                                    var35 = var34.first();
                                                }
                                                var23 = (SubLObject)module0554.T;
                                            }
                                            else {
                                                var14 = var32;
                                            }
                                        }
                                    }
                                    else if (module0554.NIL == var13) {
                                        var10 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var5, var11, var12, PrintLow.format((SubLObject)module0554.NIL, (SubLObject)module0554.$ic13$, var14)), var10);
                                    }
                                    else {
                                        var36 = module0038.f2856(Sequences.nreverse(var13));
                                        var13 = (SubLObject)module0554.NIL;
                                        var8.resetMultipleValues();
                                        var37 = module0038.f2872(var36, (SubLObject)module0554.UNPROVIDED);
                                        var33 = var8.secondMultipleValue();
                                        var8.resetMultipleValues();
                                        if (module0554.NIL != var33) {
                                            var34 = var33;
                                            var35 = (SubLObject)module0554.NIL;
                                            var35 = var34.first();
                                            while (module0554.NIL != var34) {
                                                var10 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var5, var11, var12, var35, var36), var10);
                                                var34 = var34.rest();
                                                var35 = var34.first();
                                            }
                                            var24 = (SubLObject)module0554.T;
                                        }
                                        else {
                                            var15 = var37;
                                        }
                                    }
                                    if (module0554.NIL == var23 && module0554.NIL == var24) {
                                        var9 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var5, var11, var12, var14, var15), var9);
                                    }
                                    var14 = (SubLObject)module0554.NIL;
                                    var15 = (SubLObject)module0554.NIL;
                                    var24 = (SubLObject)module0554.NIL;
                                    var23 = (SubLObject)module0554.NIL;
                                    var13 = (SubLObject)module0554.NIL;
                                    var17 = (SubLObject)module0554.T;
                                    var16 = (SubLObject)module0554.$ic8$;
                                    var11 = Numbers.add((SubLObject)module0554.ONE_INTEGER, var12);
                                }
                                else {
                                    var13 = (SubLObject)ConsesLow.cons(var30, var13);
                                }
                            }
                        }
                    }
                }
                var26 = var26.rest();
                var27 = var26.first();
            }
        }
        if (module0554.NIL != var13) {
            if (var21.numG((SubLObject)module0554.ZERO_INTEGER)) {
                var10 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var5, var11, var12, PrintLow.format((SubLObject)module0554.NIL, (SubLObject)module0554.$ic14$, var22)), var10);
            }
            else {
                var10 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var5, var11, var12, PrintLow.format((SubLObject)module0554.NIL, (SubLObject)module0554.$ic15$, module0038.f2856(Sequences.nreverse(var13)))), var10);
            }
        }
        return Values.values(Sequences.nreverse(var9), Sequences.nreverse(var10));
    }
    
    public static SubLObject f34193(final SubLObject var38, final SubLObject var39) {
        SubLObject var40 = var38;
        SubLObject var41 = (SubLObject)module0554.NIL;
        var41 = var40.first();
        while (module0554.NIL != var40) {
            if (!var41.isString()) {
                return (SubLObject)module0554.NIL;
            }
            var40 = var40.rest();
            var41 = var40.first();
        }
        SubLObject var42 = Strings.string_downcase(module0038.f2761(var38, (SubLObject)module0554.UNPROVIDED), (SubLObject)module0554.UNPROVIDED, (SubLObject)module0554.UNPROVIDED);
        if (module0554.NIL != Characters.charE((SubLObject)Characters.CHAR_colon, Strings.sublisp_char(var42, (SubLObject)module0554.ZERO_INTEGER))) {
            var42 = module0038.f2623(var42, (SubLObject)module0554.ONE_INTEGER, Sequences.length(var42));
        }
        final SubLObject var43 = conses_high.assoc(var42, var39, Symbols.symbol_function((SubLObject)module0554.EQUAL), (SubLObject)module0554.UNPROVIDED);
        if (module0554.NIL != var43) {
            return var43.rest();
        }
        return (SubLObject)module0554.NIL;
    }
    
    public static SubLObject f34194(final SubLObject var43, SubLObject var44) {
        if (var44 == module0554.UNPROVIDED) {
            var44 = (SubLObject)module0554.NIL;
        }
        final SubLThread var45 = SubLProcess.currentSubLThread();
        SubLObject var46 = (SubLObject)module0554.T;
        SubLObject var47 = var43;
        SubLObject var48 = (SubLObject)module0554.NIL;
        var48 = var47.first();
        while (module0554.NIL != var47) {
            if (!var48.isString()) {
                var46 = (SubLObject)module0554.NIL;
            }
            var47 = var47.rest();
            var48 = var47.first();
        }
        if (module0554.NIL != var46) {
            final SubLObject var49 = module0038.f2761(var43, (SubLObject)module0554.UNPROVIDED);
            final SubLObject var50 = conses_high.assoc(Strings.string_downcase(var49, (SubLObject)module0554.UNPROVIDED, (SubLObject)module0554.UNPROVIDED), module0554.$g4009$.getDynamicValue(var45), Symbols.symbol_function((SubLObject)module0554.EQUAL), (SubLObject)module0554.UNPROVIDED).rest();
            final SubLObject var51 = module0553.f34180(var49);
            if (module0554.NIL != var50) {
                return var50;
            }
            if (module0554.NIL != module0269.f17715(var51)) {
                return var51;
            }
            if (module0554.NIL != conses_high.member(var49, var44, Symbols.symbol_function((SubLObject)module0554.EQUAL), (SubLObject)module0554.UNPROVIDED)) {
                return f34195(var49);
            }
        }
        else if (module0554.ONE_INTEGER.equal(Sequences.length(var43))) {
            final SubLObject var52 = module0172.f10921(f34196(var43.first(), (SubLObject)module0554.UNPROVIDED, (SubLObject)module0554.UNPROVIDED));
            if (module0554.NIL != module0269.f17715(var52)) {
                return var52;
            }
        }
        return (SubLObject)module0554.NIL;
    }
    
    public static SubLObject f34197(final SubLObject var50, final SubLObject var51, final SubLObject var44) {
        final SubLObject var52 = (module0554.NIL != var50) ? var50 : var51;
        if (module0554.NIL == var52) {
            return (SubLObject)module0554.NIL;
        }
        if (module0554.NIL != Eval.constantp(var52, (SubLObject)module0554.UNPROVIDED)) {
            return var52;
        }
        if (module0554.NIL != module0161.f10481(var52)) {
            return var52;
        }
        if (var52.isString() && module0554.NIL != conses_high.member(var52, var44, Symbols.symbol_function((SubLObject)module0554.EQUAL), (SubLObject)module0554.UNPROVIDED)) {
            return f34195(var52);
        }
        if (!var52.isList()) {
            return (SubLObject)module0554.NIL;
        }
        final SubLObject var53 = module0172.f10921(var52);
        if (module0554.NIL != module0161.f10481(var53)) {
            return var53;
        }
        if (module0554.NIL != f34198(var52)) {
            return var52;
        }
        return var52;
    }
    
    public static SubLObject f34199(final SubLObject var54, final SubLObject var55) {
        if (module0554.$ic19$ == var54) {
            return var54;
        }
        if (module0554.$ic20$ == var54) {
            return var54;
        }
        if (module0554.NIL != module0173.f10955(var55) && module0554.NIL != module0259.f16891(var55, module0554.$ic21$)) {
            return (SubLObject)module0554.$ic19$;
        }
        return (SubLObject)module0554.$ic20$;
    }
    
    public static SubLObject f34200(final SubLObject var56, final SubLObject var57) {
        if (module0554.$ic22$ == var56) {
            return var56;
        }
        if (module0554.$ic23$ == var56) {
            return var56;
        }
        if (module0554.$ic24$ == var56) {
            return var56;
        }
        return (SubLObject)module0554.NIL;
    }
    
    public static SubLObject f34196(final SubLObject var58, SubLObject var44, SubLObject var59) {
        if (var44 == module0554.UNPROVIDED) {
            var44 = (SubLObject)module0554.NIL;
        }
        if (var59 == module0554.UNPROVIDED) {
            var59 = (SubLObject)module0554.NIL;
        }
        final SubLThread var60 = SubLProcess.currentSubLThread();
        SubLObject var61 = (SubLObject)module0554.NIL;
        SubLObject var62 = (SubLObject)module0554.NIL;
        if (module0554.NIL == var58) {
            var62 = (SubLObject)ConsesLow.cons((SubLObject)module0554.$ic25$, var62);
            var61 = var58;
        }
        else if (module0554.NIL != module0173.f10955(var58)) {
            var61 = var58;
        }
        else if (var58.isNumber()) {
            var61 = var58;
        }
        else if (var58.isKeyword()) {
            var61 = var58;
        }
        else if (var58.isSymbol()) {
            var61 = var58;
        }
        else if (var58.isList()) {
            if (module0554.NIL != f34198(var58)) {
                return var58;
            }
            SubLObject var63 = var58;
            SubLObject var64 = (SubLObject)module0554.NIL;
            var64 = var63.first();
            while (module0554.NIL != var63) {
                var60.resetMultipleValues();
                final SubLObject var65 = f34196(var64, var44, var59);
                final SubLObject var66 = var60.secondMultipleValue();
                var60.resetMultipleValues();
                var62 = ConsesLow.append(var66, var62);
                var61 = (SubLObject)ConsesLow.cons(var65, var61);
                var63 = var63.rest();
                var64 = var63.first();
            }
            var61 = Sequences.nreverse(var61);
        }
        else if (var58.isString()) {
            final SubLObject var67 = module0038.f2697(var58);
            final SubLObject var68 = module0038.f2636(var58);
            if (module0554.NIL != conses_high.member(var58, var59, Symbols.symbol_function((SubLObject)module0554.EQUAL), (SubLObject)module0554.UNPROVIDED)) {
                var62 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)module0554.NIL, (SubLObject)module0554.$ic26$, var58), var62);
            }
            else if (module0554.NIL != Characters.charE((SubLObject)Characters.CHAR_colon, var68)) {
                if (module0554.ONE_INTEGER.numL(Sequences.length(var58))) {
                    var61 = module0038.f2965(Strings.string_upcase(module0038.f2623(var58, (SubLObject)module0554.ONE_INTEGER, Sequences.length(var58)), (SubLObject)module0554.UNPROVIDED, (SubLObject)module0554.UNPROVIDED));
                }
                else {
                    var62 = (SubLObject)ConsesLow.cons((SubLObject)module0554.$ic27$, var62);
                }
            }
            else if (module0554.NIL != Characters.charE((SubLObject)Characters.CHAR_question, var68)) {
                if (module0554.ONE_INTEGER.numL(Sequences.length(var58))) {
                    var61 = module0201.f12550(var58);
                }
                else {
                    var62 = (SubLObject)ConsesLow.cons((SubLObject)module0554.$ic28$, var62);
                }
            }
            else if (module0554.NIL != Characters.charE((SubLObject)Characters.CHAR_quotation, var68)) {
                if (Sequences.length(var58).numG((SubLObject)module0554.ONE_INTEGER) && Characters.CHAR_quotation.eql(module0038.f2637(var58))) {
                    var61 = module0038.f2848((SubLObject)module0554.$ic29$, var58, (SubLObject)module0554.ONE_INTEGER);
                    if (module0554.NIL != module0039.f3008(var61)) {
                        var61 = module0208.f13541(var61);
                    }
                }
                else {
                    var62 = (SubLObject)ConsesLow.cons((SubLObject)module0554.$ic30$, var62);
                }
            }
            else if (module0554.NIL != Characters.charE((SubLObject)Characters.CHAR_quote, var68)) {
                if (module0554.ONE_INTEGER.numL(Sequences.length(var58))) {
                    var61 = Packages.intern(Strings.string_upcase(module0038.f2623(var58, (SubLObject)module0554.ONE_INTEGER, Sequences.length(var58)), (SubLObject)module0554.UNPROVIDED, (SubLObject)module0554.UNPROVIDED), (SubLObject)module0554.UNPROVIDED);
                }
                else {
                    var62 = (SubLObject)ConsesLow.cons((SubLObject)module0554.$ic31$, var62);
                }
            }
            else if (module0554.NIL != Characters.charE((SubLObject)Characters.CHAR_period, var68)) {
                if (module0554.ONE_INTEGER.numL(Sequences.length(var58))) {
                    var61 = Packages.intern(var58, (SubLObject)module0554.UNPROVIDED);
                }
                else {
                    var61 = (SubLObject)module0554.$ic32$;
                }
            }
            else if (module0554.NIL != conses_high.member(var58, var44, Symbols.symbol_function((SubLObject)module0554.EQUAL), (SubLObject)module0554.UNPROVIDED)) {
                var61 = f34195(var58);
            }
            else if (module0554.NIL != module0048.f3407(var58)) {
                final SubLObject var69 = reader.read_from_string_ignoring_errors(var58, (SubLObject)module0554.UNPROVIDED, (SubLObject)module0554.UNPROVIDED, (SubLObject)module0554.UNPROVIDED, (SubLObject)module0554.UNPROVIDED);
                if (module0554.NIL != var69) {
                    var61 = var69;
                }
                else {
                    var61 = var58;
                    var62 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)module0554.NIL, (SubLObject)module0554.$ic33$, var58), var62);
                }
            }
            else if (Strings.string_downcase(var58, (SubLObject)module0554.UNPROVIDED, (SubLObject)module0554.UNPROVIDED).equal((SubLObject)module0554.$ic34$)) {
                var61 = (SubLObject)module0554.NIL;
            }
            else if (Strings.string_downcase(var58, (SubLObject)module0554.UNPROVIDED, (SubLObject)module0554.UNPROVIDED).equal((SubLObject)module0554.$ic35$)) {
                var61 = (SubLObject)module0554.T;
            }
            else if (module0554.NIL != module0126.f8389(var67)) {
                final SubLObject var70 = f34201(var67);
                if (module0554.NIL != module0128.f8463(var70, (SubLObject)module0554.UNPROVIDED)) {
                    var61 = var70;
                }
                else if (module0554.NIL != conses_high.member(var67, var44, Symbols.symbol_function((SubLObject)module0554.EQUAL), (SubLObject)module0554.UNPROVIDED)) {
                    var61 = f34195(var67);
                }
                else {
                    var62 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)module0554.NIL, (SubLObject)module0554.$ic36$, var58), var62);
                }
            }
            else {
                var62 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)module0554.NIL, (SubLObject)module0554.$ic37$, var58), var62);
                var61 = var58;
            }
        }
        else {
            var62 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)module0554.NIL, (SubLObject)module0554.$ic38$, var58), var62);
            var61 = var58;
        }
        return Values.values(var61, Sequences.nreverse(var62));
    }
    
    public static SubLObject f34201(final SubLObject var64) {
        return module0166.f10737(module0038.f2697(var64));
    }
    
    public static SubLObject f34202(final SubLObject var68, final SubLObject var69, SubLObject var70, SubLObject var71, SubLObject var44, SubLObject var59, SubLObject var72) {
        if (var70 == module0554.UNPROVIDED) {
            var70 = (SubLObject)module0554.NIL;
        }
        if (var71 == module0554.UNPROVIDED) {
            var71 = (SubLObject)module0554.NIL;
        }
        if (var44 == module0554.UNPROVIDED) {
            var44 = (SubLObject)module0554.NIL;
        }
        if (var59 == module0554.UNPROVIDED) {
            var59 = (SubLObject)module0554.NIL;
        }
        if (var72 == module0554.UNPROVIDED) {
            var72 = (SubLObject)module0554.$ic39$;
        }
        final SubLThread var73 = SubLProcess.currentSubLThread();
        SubLObject var74 = (SubLObject)module0554.NIL;
        SubLObject var75 = (SubLObject)module0554.NIL;
        var73.resetMultipleValues();
        SubLObject var76 = f34196(var68, var44, var59);
        final SubLObject var77 = var73.secondMultipleValue();
        var73.resetMultipleValues();
        if (module0554.NIL != var77) {
            SubLObject var78 = var77;
            SubLObject var79 = (SubLObject)module0554.NIL;
            var79 = var78.first();
            while (module0554.NIL != var78) {
                var75 = (SubLObject)ConsesLow.cons(var79, var75);
                var78 = var78.rest();
                var79 = var78.first();
            }
        }
        if (module0554.NIL == var69) {
            var75 = (SubLObject)ConsesLow.cons((SubLObject)module0554.$ic40$, var75);
        }
        final SubLObject var80 = var76.first();
        final SubLObject var81 = f34199(var70, var80);
        final SubLObject var82 = f34200(var71, var76);
        var73.resetMultipleValues();
        final SubLObject var83 = module0035.f2024(var76, (SubLObject)module0554.UNPROVIDED);
        final SubLObject var84 = var73.secondMultipleValue();
        var73.resetMultipleValues();
        if (module0554.NIL != var84) {
            var76 = var83;
        }
        else {
            var75 = (SubLObject)ConsesLow.cons((SubLObject)module0554.$ic41$, var75);
        }
        if (var72 == module0554.$ic42$) {
            var74 = (SubLObject)ConsesLow.list((SubLObject)module0554.$ic43$, var76, var69);
        }
        else {
            var74 = (SubLObject)ConsesLow.list((SubLObject)module0554.$ic44$, var76, var69, var81, var82);
        }
        return Values.values(var74, var75);
    }
    
    public static SubLObject f34203(final SubLObject var9, SubLObject var44, SubLObject var59) {
        if (var44 == module0554.UNPROVIDED) {
            var44 = (SubLObject)module0554.NIL;
        }
        if (var59 == module0554.UNPROVIDED) {
            var59 = (SubLObject)module0554.NIL;
        }
        final SubLThread var60 = SubLProcess.currentSubLThread();
        SubLObject var61 = (SubLObject)module0554.NIL;
        SubLObject var62 = (SubLObject)module0554.NIL;
        SubLObject var63 = (SubLObject)module0554.$ic39$;
        SubLObject var64 = (SubLObject)module0554.NIL;
        SubLObject var65 = (SubLObject)module0554.NIL;
        SubLObject var66 = (SubLObject)module0554.NIL;
        SubLObject var67 = (SubLObject)module0554.NIL;
        SubLObject var68 = (SubLObject)module0554.NIL;
        SubLObject var69 = (SubLObject)module0554.NIL;
        if (module0554.NIL == var69) {
            SubLObject var70 = var9;
            SubLObject var71 = (SubLObject)module0554.NIL;
            var71 = var70.first();
            while (module0554.NIL == var69 && module0554.NIL != var70) {
                final SubLObject var72 = var71.first();
                final SubLObject var73 = conses_high.second(var71);
                final SubLObject var74 = conses_high.third(var71);
                final SubLObject var75 = conses_high.fourth(var71);
                final SubLObject var76 = conses_high.fifth(var71);
                final SubLObject var77 = f34194(var75, var44);
                if (Sequences.length(var68).numG(module0554.$g4007$.getDynamicValue(var60))) {
                    var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(var72, var73, var74, (SubLObject)module0554.$ic9$), var68);
                    var69 = (SubLObject)module0554.T;
                }
                if (module0554.NIL == var77) {
                    var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(var72, var73, var74, (SubLObject)module0554.$ic45$), var68);
                }
                else if (var77.isKeyword()) {
                    final SubLObject var78 = var77;
                    if (var78.eql((SubLObject)module0554.$ic46$)) {
                        final SubLObject var79 = f34197(var66, var62, var44);
                        SubLObject var80 = var76;
                        SubLObject var81 = (SubLObject)module0554.NIL;
                        var81 = var80.first();
                        while (module0554.NIL != var80) {
                            if (module0554.NIL == var81) {
                                var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(var72, var73, var74, (SubLObject)module0554.$ic47$), var68);
                            }
                            else if (var81.isAtom()) {
                                var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(var72, var73, var74, (SubLObject)module0554.$ic48$), var68);
                            }
                            else {
                                var60.resetMultipleValues();
                                final SubLObject var82 = f34202(var81, var79, var64, var65, var44, var59, var63);
                                final SubLObject var83 = var60.secondMultipleValue();
                                var60.resetMultipleValues();
                                var64 = (SubLObject)module0554.NIL;
                                var65 = (SubLObject)module0554.NIL;
                                if (module0554.NIL != var83) {
                                    SubLObject var34_90 = var83;
                                    SubLObject var84 = (SubLObject)module0554.NIL;
                                    var84 = var34_90.first();
                                    while (module0554.NIL != var34_90) {
                                        var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var72, var73, var74, var84), var68);
                                        var34_90 = var34_90.rest();
                                        var84 = var34_90.first();
                                    }
                                }
                                else {
                                    var67 = (SubLObject)ConsesLow.cons(var82, var67);
                                }
                            }
                            var80 = var80.rest();
                            var81 = var80.first();
                        }
                    }
                    else if (var78.eql((SubLObject)module0554.$ic49$)) {
                        var66 = (SubLObject)module0554.NIL;
                        if (!var76.isList()) {
                            var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(var72, var73, var74, (SubLObject)module0554.$ic50$), var68);
                        }
                        else if (Sequences.length(var76).numG((SubLObject)module0554.ONE_INTEGER)) {
                            var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(var72, var73, var74, (SubLObject)module0554.$ic51$), var68);
                        }
                        else {
                            SubLObject var85 = var76.first();
                            if (module0554.NIL == var85) {
                                var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(var72, var73, var74, (SubLObject)module0554.$ic50$), var68);
                            }
                            else if (var85.isList()) {
                                var60.resetMultipleValues();
                                final SubLObject var86 = f34196(var85, var44, (SubLObject)module0554.UNPROVIDED);
                                final SubLObject var87 = var60.secondMultipleValue();
                                var60.resetMultipleValues();
                                if (module0554.NIL != var87) {
                                    SubLObject var88 = var87;
                                    SubLObject var89 = (SubLObject)module0554.NIL;
                                    var89 = var88.first();
                                    while (module0554.NIL != var88) {
                                        var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var72, var73, var74, var89), var68);
                                        var88 = var88.rest();
                                        var89 = var88.first();
                                    }
                                }
                                else {
                                    final SubLObject var90 = module0172.f10921(var86);
                                    if (module0554.NIL != module0167.f10813(var90)) {
                                        var61 = var85;
                                    }
                                    else {
                                        var61 = var85;
                                        var44 = (SubLObject)ConsesLow.cons(var85, var44);
                                    }
                                }
                            }
                            else if (var85.isString()) {
                                var85 = module0038.f2697(var85);
                                if (module0554.NIL == module0126.f8389(var85)) {
                                    var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(var72, var73, var74, (SubLObject)module0554.$ic52$), var68);
                                }
                                else {
                                    final SubLObject var91 = f34201(var85);
                                    if (module0554.NIL != conses_high.member(var85, var44, Symbols.symbol_function((SubLObject)module0554.EQUAL), (SubLObject)module0554.UNPROVIDED)) {
                                        var61 = f34195(var85);
                                    }
                                    else if (module0554.NIL != module0128.f8463(var91, (SubLObject)module0554.UNPROVIDED) && module0554.NIL == module0004.f104(module0166.f10743(var91), var59, Symbols.symbol_function((SubLObject)module0554.EQUAL), (SubLObject)module0554.UNPROVIDED)) {
                                        var61 = var91;
                                    }
                                    else {
                                        var67 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0554.$ic53$, var85), var67);
                                        var61 = f34195(var85);
                                        var44 = (SubLObject)ConsesLow.cons(var85, var44);
                                        var59 = Sequences.remove(var85, var59, Symbols.symbol_function((SubLObject)module0554.EQUAL), (SubLObject)module0554.UNPROVIDED, (SubLObject)module0554.UNPROVIDED, (SubLObject)module0554.UNPROVIDED, (SubLObject)module0554.UNPROVIDED);
                                    }
                                }
                            }
                            else {
                                var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var72, var73, var74, PrintLow.format((SubLObject)module0554.NIL, (SubLObject)module0554.$ic54$, var85)), var68);
                            }
                        }
                    }
                    else if (var78.eql((SubLObject)module0554.$ic55$)) {
                        if (!var76.isList()) {
                            var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(var72, var73, var74, (SubLObject)module0554.$ic56$), var68);
                        }
                        else if (Sequences.length(var76).numG((SubLObject)module0554.ONE_INTEGER)) {
                            var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(var72, var73, var74, (SubLObject)module0554.$ic57$), var68);
                        }
                        else {
                            final SubLObject var85 = var76.first();
                            SubLObject var91 = (SubLObject)module0554.NIL;
                            if (module0554.NIL == var85) {
                                var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(var72, var73, var74, (SubLObject)module0554.$ic56$), var68);
                            }
                            else if (var85.isList()) {
                                var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(var72, var73, var74, (SubLObject)module0554.$ic58$), var68);
                            }
                            else if (!var85.isString()) {
                                var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(var72, var73, var74, (SubLObject)module0554.$ic59$), var68);
                            }
                            else if (module0554.NIL != conses_high.member(var85, var59, Symbols.symbol_function((SubLObject)module0554.EQUAL), (SubLObject)module0554.UNPROVIDED)) {
                                var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(var72, var73, var74, (SubLObject)module0554.$ic60$), var68);
                            }
                            else {
                                var91 = f34201(var85);
                                if (module0554.NIL != conses_high.member(var85, var44, Symbols.symbol_function((SubLObject)module0554.EQUAL), (SubLObject)module0554.UNPROVIDED)) {
                                    var67 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0554.$ic55$, f34195(var85)), var67);
                                    var59 = (SubLObject)ConsesLow.cons(var44, var59);
                                    var44 = Sequences.remove(var85, var44, Symbols.symbol_function((SubLObject)module0554.EQUAL), (SubLObject)module0554.UNPROVIDED, (SubLObject)module0554.UNPROVIDED, (SubLObject)module0554.UNPROVIDED, (SubLObject)module0554.UNPROVIDED);
                                }
                                else if (module0554.NIL != module0128.f8449(var91)) {
                                    var67 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0554.$ic55$, var91), var67);
                                    var59 = (SubLObject)ConsesLow.cons(module0166.f10743(var91), var59);
                                    var44 = Sequences.remove(module0166.f10743(var91), var44, Symbols.symbol_function((SubLObject)module0554.EQUAL), (SubLObject)module0554.UNPROVIDED, (SubLObject)module0554.UNPROVIDED, (SubLObject)module0554.UNPROVIDED, (SubLObject)module0554.UNPROVIDED);
                                }
                            }
                        }
                    }
                    else if (var78.eql((SubLObject)module0554.$ic61$)) {
                        if (!var76.isList()) {
                            var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(var72, var73, var74, (SubLObject)module0554.$ic62$), var68);
                        }
                        else {
                            final SubLObject var92 = var76.first();
                            SubLObject var93 = (SubLObject)module0554.NIL;
                            final SubLObject var94 = conses_high.second(var76);
                            SubLObject var95 = (SubLObject)module0554.NIL;
                            SubLObject var96 = (SubLObject)module0554.NIL;
                            SubLObject var97 = (SubLObject)module0554.ZERO_INTEGER;
                            if (module0554.NIL == var92) {
                                var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(var72, var73, var74, (SubLObject)module0554.$ic63$), var68);
                            }
                            else if (var92.isList()) {
                                var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(var72, var73, var74, (SubLObject)module0554.$ic64$), var68);
                            }
                            else if (!var92.isString()) {
                                var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(var72, var73, var74, (SubLObject)module0554.$ic65$), var68);
                            }
                            else if (module0554.NIL != conses_high.member(var92, var59, Symbols.symbol_function((SubLObject)module0554.EQUAL), (SubLObject)module0554.UNPROVIDED)) {
                                var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var72, var73, var74, PrintLow.format((SubLObject)module0554.NIL, (SubLObject)module0554.$ic66$, var92)), var68);
                            }
                            else {
                                var93 = f34201(var92);
                                var97 = Numbers.add(var97, (SubLObject)module0554.ONE_INTEGER);
                            }
                            if (!var94.isString()) {
                                var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(var72, var73, var74, (SubLObject)module0554.$ic67$), var68);
                            }
                            else if (module0554.NIL == Characters.charE((SubLObject)Characters.CHAR_quotation, Strings.sublisp_char(var94, (SubLObject)module0554.ZERO_INTEGER))) {
                                var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(var72, var73, var74, (SubLObject)module0554.$ic68$), var68);
                            }
                            else {
                                var95 = module0038.f2697(module0038.f2848((SubLObject)module0554.$ic29$, var94, (SubLObject)module0554.ONE_INTEGER));
                                var96 = f34201(var95);
                                if (module0554.NIL == module0126.f8389(var95)) {
                                    var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(var72, var73, var74, (SubLObject)module0554.$ic69$), var68);
                                }
                                else if (module0554.NIL != conses_high.member(var95, var44, Symbols.symbol_function((SubLObject)module0554.EQUAL), (SubLObject)module0554.UNPROVIDED)) {
                                    var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var72, var73, var74, PrintLow.format((SubLObject)module0554.NIL, (SubLObject)module0554.$ic70$, var95)), var68);
                                }
                                else if (module0554.NIL != module0128.f8463(var96, (SubLObject)module0554.UNPROVIDED) && module0554.NIL == module0004.f104(module0166.f10743(var96), var59, Symbols.symbol_function((SubLObject)module0554.EQUAL), (SubLObject)module0554.UNPROVIDED)) {
                                    var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var72, var73, var74, PrintLow.format((SubLObject)module0554.NIL, (SubLObject)module0554.$ic71$, var95)), var68);
                                }
                                else {
                                    var97 = Numbers.add(var97, (SubLObject)module0554.ONE_INTEGER);
                                }
                            }
                            if (var97.eql((SubLObject)module0554.TWO_INTEGER)) {
                                if (module0554.NIL != module0128.f8449(var93)) {
                                    var67 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0554.$ic61$, var93, var95), var67);
                                    var44 = (SubLObject)ConsesLow.cons(var95, var44);
                                    var44 = Sequences.remove(module0166.f10743(var93), var44, Symbols.symbol_function((SubLObject)module0554.EQUAL), (SubLObject)module0554.UNPROVIDED, (SubLObject)module0554.UNPROVIDED, (SubLObject)module0554.UNPROVIDED, (SubLObject)module0554.UNPROVIDED);
                                    var59 = (SubLObject)ConsesLow.cons(module0166.f10743(var93), var59);
                                    var59 = Sequences.remove(var95, var59, Symbols.symbol_function((SubLObject)module0554.EQUAL), (SubLObject)module0554.UNPROVIDED, (SubLObject)module0554.UNPROVIDED, (SubLObject)module0554.UNPROVIDED, (SubLObject)module0554.UNPROVIDED);
                                    if (var93.eql(var61)) {
                                        var61 = f34195(var95);
                                    }
                                }
                                else if (module0554.NIL != conses_high.member(var92, var44, Symbols.symbol_function((SubLObject)module0554.EQUAL), (SubLObject)module0554.UNPROVIDED)) {
                                    var67 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0554.$ic61$, (SubLObject)ConsesLow.list((SubLObject)module0554.$ic72$, var92), var95), var67);
                                    var44 = Sequences.remove(var92, var44, Symbols.symbol_function((SubLObject)module0554.EQUAL), (SubLObject)module0554.UNPROVIDED, (SubLObject)module0554.UNPROVIDED, (SubLObject)module0554.UNPROVIDED, (SubLObject)module0554.UNPROVIDED);
                                    var44 = (SubLObject)ConsesLow.cons(var95, var44);
                                    var59 = (SubLObject)ConsesLow.cons(var92, var59);
                                    var59 = Sequences.remove(var95, var59, Symbols.symbol_function((SubLObject)module0554.EQUAL), (SubLObject)module0554.UNPROVIDED, (SubLObject)module0554.UNPROVIDED, (SubLObject)module0554.UNPROVIDED, (SubLObject)module0554.UNPROVIDED);
                                    if (module0554.NIL != module0035.f2428(var92, var61, Symbols.symbol_function((SubLObject)module0554.EQUAL), (SubLObject)module0554.UNPROVIDED)) {
                                        var61 = f34195(var95);
                                    }
                                }
                                else {
                                    var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var72, var73, var74, PrintLow.format((SubLObject)module0554.NIL, (SubLObject)module0554.$ic73$, var92)), var68);
                                }
                            }
                        }
                    }
                    else if (var78.eql((SubLObject)module0554.$ic74$)) {
                        if (!var76.isList()) {
                            var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(var72, var73, var74, (SubLObject)module0554.$ic75$), var68);
                        }
                        else {
                            final SubLObject var98 = var76.first();
                            SubLObject var99 = (SubLObject)module0554.NIL;
                            SubLObject var100 = (SubLObject)module0554.NIL;
                            final SubLObject var101 = conses_high.second(var76);
                            SubLObject var102 = (SubLObject)module0554.NIL;
                            SubLObject var103 = (SubLObject)module0554.NIL;
                            SubLObject var104 = (SubLObject)module0554.NIL;
                            SubLObject var105 = (SubLObject)module0554.ZERO_INTEGER;
                            if (module0554.NIL == var98) {
                                var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(var72, var73, var74, (SubLObject)module0554.$ic76$), var68);
                            }
                            else if (module0554.NIL != conses_high.member(var98, var59, Symbols.symbol_function((SubLObject)module0554.EQUAL), (SubLObject)module0554.UNPROVIDED)) {
                                var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(var72, var73, var74, (SubLObject)module0554.$ic77$), var68);
                            }
                            else {
                                var60.resetMultipleValues();
                                final SubLObject var106_107 = f34196(var98, var44, var59);
                                final SubLObject var108_109 = var60.secondMultipleValue();
                                var60.resetMultipleValues();
                                var99 = var106_107;
                                var104 = var108_109;
                                var100 = module0553.f34180(var99);
                                if (module0554.NIL != var104) {
                                    SubLObject var106 = var104;
                                    SubLObject var107 = (SubLObject)module0554.NIL;
                                    var107 = var106.first();
                                    while (module0554.NIL != var106) {
                                        var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var72, var73, var74, var107), var68);
                                        var106 = var106.rest();
                                        var107 = var106.first();
                                    }
                                }
                                else if (module0554.NIL == module0173.f10955(var100) && module0554.NIL == conses_high.member(var98, var44, Symbols.symbol_function((SubLObject)module0554.EQUAL), (SubLObject)module0554.UNPROVIDED)) {
                                    var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(var72, var73, var74, (SubLObject)module0554.$ic78$), var68);
                                }
                                else {
                                    var105 = Numbers.add(var105, (SubLObject)module0554.ONE_INTEGER);
                                }
                            }
                            if (module0554.NIL == var101) {
                                var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(var72, var73, var74, (SubLObject)module0554.$ic79$), var68);
                            }
                            else if (module0554.NIL != conses_high.member(var101, var59, Symbols.symbol_function((SubLObject)module0554.EQUAL), (SubLObject)module0554.UNPROVIDED)) {
                                var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(var72, var73, var74, (SubLObject)module0554.$ic80$), var68);
                            }
                            else {
                                var60.resetMultipleValues();
                                final SubLObject var110_111 = f34196(var101, var44, var59);
                                final SubLObject var112_113 = var60.secondMultipleValue();
                                var60.resetMultipleValues();
                                var102 = var110_111;
                                var104 = var112_113;
                                var103 = module0553.f34180(var102);
                                if (module0554.NIL != var104) {
                                    SubLObject var106 = var104;
                                    SubLObject var107 = (SubLObject)module0554.NIL;
                                    var107 = var106.first();
                                    while (module0554.NIL != var106) {
                                        var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var72, var73, var74, var107), var68);
                                        var106 = var106.rest();
                                        var107 = var106.first();
                                    }
                                }
                                else if (module0554.NIL == module0173.f10955(var103) && module0554.NIL == conses_high.member(var101, var44, Symbols.symbol_function((SubLObject)module0554.EQUAL), (SubLObject)module0554.UNPROVIDED)) {
                                    var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(var72, var73, var74, (SubLObject)module0554.$ic81$), var68);
                                }
                                else {
                                    var105 = Numbers.add(var105, (SubLObject)module0554.ONE_INTEGER);
                                }
                            }
                            if (var105.eql((SubLObject)module0554.TWO_INTEGER)) {
                                var44 = Sequences.remove(var98, var44, Symbols.symbol_function((SubLObject)module0554.EQUAL), (SubLObject)module0554.UNPROVIDED, (SubLObject)module0554.UNPROVIDED, (SubLObject)module0554.UNPROVIDED, (SubLObject)module0554.UNPROVIDED);
                                var59 = (SubLObject)ConsesLow.cons(var98, var59);
                                if (module0554.NIL != module0173.f10955(var100)) {
                                    if (module0554.NIL != module0173.f10955(var103)) {
                                        var67 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0554.$ic74$, var100, var103), var67);
                                    }
                                    else {
                                        var67 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0554.$ic74$, var100, f34195(var101)), var67);
                                    }
                                }
                                else if (module0554.NIL != module0173.f10955(var103)) {
                                    var67 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0554.$ic74$, f34195(var98), var103), var67);
                                }
                                else {
                                    var67 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0554.$ic74$, f34195(var98), f34195(var101)), var67);
                                }
                            }
                        }
                    }
                    else if (var78.eql((SubLObject)module0554.$ic39$)) {
                        var63 = (SubLObject)module0554.$ic39$;
                    }
                    else if (var78.eql((SubLObject)module0554.$ic42$)) {
                        var63 = (SubLObject)module0554.$ic42$;
                    }
                    else if (var78.eql((SubLObject)module0554.$ic82$)) {
                        if (!var76.isList()) {
                            var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(var72, var73, var74, (SubLObject)module0554.$ic83$), var68);
                        }
                        else {
                            final SubLObject var108 = var76.first();
                            if (module0554.NIL == var108) {
                                var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(var72, var73, var74, (SubLObject)module0554.$ic83$), var68);
                            }
                            else if (var108.isList()) {
                                var60.resetMultipleValues();
                                SubLObject var109 = f34196(var108, var44, var59);
                                final SubLObject var87 = var60.secondMultipleValue();
                                var60.resetMultipleValues();
                                if (module0554.NIL != var87) {
                                    SubLObject var88 = var87;
                                    SubLObject var89 = (SubLObject)module0554.NIL;
                                    var89 = var88.first();
                                    while (module0554.NIL != var88) {
                                        var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var72, var73, var74, var89), var68);
                                        var88 = var88.rest();
                                        var89 = var88.first();
                                    }
                                }
                                else {
                                    final SubLObject var110 = module0172.f10921(var109);
                                    if (module0554.NIL != module0167.f10813(var110)) {
                                        var109 = var110;
                                    }
                                    var66 = var109;
                                }
                            }
                            else if (module0554.NIL != module0128.f8449(var108)) {
                                var66 = var108;
                            }
                            else if (var108.isString()) {
                                final SubLObject var111 = f34201(var108);
                                if (module0554.NIL != module0128.f8463(var111, (SubLObject)module0554.UNPROVIDED)) {
                                    var66 = var111;
                                }
                                else if (module0554.NIL != module0004.f104(var108, var44, Symbols.symbol_function((SubLObject)module0554.EQUAL), (SubLObject)module0554.UNPROVIDED)) {
                                    var66 = f34195(var108);
                                }
                                else {
                                    var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var72, var73, var74, PrintLow.format((SubLObject)module0554.NIL, (SubLObject)module0554.$ic85$, var108)), var68);
                                }
                            }
                            else {
                                var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var72, var73, var74, PrintLow.format((SubLObject)module0554.NIL, (SubLObject)module0554.$ic85$, var108)), var68);
                            }
                        }
                    }
                    else if (var78.eql((SubLObject)module0554.$ic86$)) {
                        if (!var76.isList()) {
                            var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(var72, var73, var74, (SubLObject)module0554.$ic87$), var68);
                        }
                        else {
                            final SubLObject var108 = var76.first();
                            if (module0554.NIL == var108) {
                                var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(var72, var73, var74, (SubLObject)module0554.$ic87$), var68);
                            }
                            else if (var108.isList()) {
                                var60.resetMultipleValues();
                                SubLObject var109 = f34196(var108, var44, var59);
                                final SubLObject var87 = var60.secondMultipleValue();
                                var60.resetMultipleValues();
                                if (module0554.NIL != var87) {
                                    SubLObject var88 = var87;
                                    SubLObject var89 = (SubLObject)module0554.NIL;
                                    var89 = var88.first();
                                    while (module0554.NIL != var88) {
                                        var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var72, var73, var74, var89), var68);
                                        var88 = var88.rest();
                                        var89 = var88.first();
                                    }
                                }
                                else {
                                    final SubLObject var110 = module0172.f10921(var109);
                                    if (module0554.NIL != module0167.f10813(var110)) {
                                        var109 = var110;
                                    }
                                    var66 = (SubLObject)module0554.NIL;
                                    var62 = var109;
                                }
                            }
                            else if (module0554.NIL != module0128.f8449(var108)) {
                                var66 = (SubLObject)module0554.NIL;
                                var62 = var108;
                            }
                            else if (var108.isString()) {
                                final SubLObject var111 = f34201(var108);
                                if (module0554.NIL != module0128.f8463(var111, (SubLObject)module0554.UNPROVIDED)) {
                                    var66 = (SubLObject)module0554.NIL;
                                    var62 = var111;
                                }
                                else if (module0554.NIL != module0004.f104(var108, var44, Symbols.symbol_function((SubLObject)module0554.EQUAL), (SubLObject)module0554.UNPROVIDED)) {
                                    var66 = (SubLObject)module0554.NIL;
                                    var62 = f34195(var108);
                                }
                                else {
                                    var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var72, var73, var74, PrintLow.format((SubLObject)module0554.NIL, (SubLObject)module0554.$ic89$, var108)), var68);
                                }
                            }
                            else {
                                var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var72, var73, var74, PrintLow.format((SubLObject)module0554.NIL, (SubLObject)module0554.$ic89$, var108)), var68);
                            }
                        }
                    }
                    else if (var78.eql((SubLObject)module0554.$ic90$)) {
                        if (!var76.isList()) {
                            var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(var72, var73, var74, (SubLObject)module0554.$ic91$), var68);
                        }
                        else {
                            final SubLObject var112 = f34193(var76, module0554.$g4011$.getDynamicValue(var60));
                            if (module0554.NIL == var112) {
                                var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(var72, var73, var74, (SubLObject)module0554.$ic91$), var68);
                            }
                            else if (var112.isKeyword()) {
                                var64 = var112;
                            }
                            else {
                                var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var72, var73, var74, PrintLow.format((SubLObject)module0554.NIL, (SubLObject)module0554.$ic92$, var76)), var68);
                            }
                        }
                    }
                    else if (var78.eql((SubLObject)module0554.$ic93$)) {
                        if (!var76.isList()) {
                            var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(var72, var73, var74, (SubLObject)module0554.$ic94$), var68);
                        }
                        else {
                            final SubLObject var113 = f34193(var76, module0554.$g4010$.getDynamicValue(var60));
                            if (module0554.NIL == var113) {
                                var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(var72, var73, var74, (SubLObject)module0554.$ic94$), var68);
                            }
                            else if (var113.isKeyword()) {
                                var65 = var113;
                            }
                            else {
                                var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var72, var73, var74, PrintLow.format((SubLObject)module0554.NIL, (SubLObject)module0554.$ic95$, var76)), var68);
                            }
                        }
                    }
                }
                else if (var77.isString() && module0554.NIL == module0004.f104(var77, var44, Symbols.symbol_function((SubLObject)module0554.$ic96$), (SubLObject)module0554.UNPROVIDED)) {
                    var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(var72, var73, var74, (SubLObject)module0554.$ic97$), var68);
                }
                else if (var77.isList() && module0554.NIL == f34198(var77)) {
                    var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(var72, var73, var74, (SubLObject)module0554.$ic98$), var68);
                }
                else {
                    SubLObject var114 = (SubLObject)((module0554.NIL != module0269.f17706(var77)) ? module0225.f14739(var77) : module0554.NIL);
                    final SubLObject var79 = f34197(var66, var62, var44);
                    final SubLObject var115 = module0147.$g2094$.currentBinding(var60);
                    final SubLObject var116 = module0147.$g2095$.currentBinding(var60);
                    try {
                        module0147.$g2094$.bind((SubLObject)module0554.$ic99$, var60);
                        module0147.$g2095$.bind(module0554.$ic100$, var60);
                        var114 = (SubLObject)((module0554.NIL != module0269.f17706(var77)) ? module0225.f14739(var77) : module0554.NIL);
                    }
                    finally {
                        module0147.$g2095$.rebind(var116, var60);
                        module0147.$g2094$.rebind(var115, var60);
                    }
                    if (module0554.NIL == var61) {
                        var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var72, var73, var74, PrintLow.format((SubLObject)module0554.NIL, (SubLObject)module0554.$ic101$, var77)), var68);
                    }
                    else if (module0554.ONE_INTEGER.eql(var114)) {
                        if (module0554.NIL == var76) {
                            var60.resetMultipleValues();
                            final SubLObject var117 = f34202((SubLObject)ConsesLow.list(var77, var61), var79, var64, var65, var44, var59, var63);
                            final SubLObject var87 = var60.secondMultipleValue();
                            var60.resetMultipleValues();
                            var64 = (SubLObject)module0554.NIL;
                            var65 = (SubLObject)module0554.NIL;
                            if (module0554.NIL != var87) {
                                SubLObject var88 = var87;
                                SubLObject var89 = (SubLObject)module0554.NIL;
                                var89 = var88.first();
                                while (module0554.NIL != var88) {
                                    var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var72, var73, var74, var89), var68);
                                    var88 = var88.rest();
                                    var89 = var88.first();
                                }
                            }
                            else {
                                var67 = (SubLObject)ConsesLow.cons(var117, var67);
                            }
                        }
                        else {
                            var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var72, var73, var74, PrintLow.format((SubLObject)module0554.NIL, (SubLObject)module0554.$ic102$, var77)), var68);
                        }
                    }
                    else if (module0554.TWO_INTEGER.eql(var114)) {
                        SubLObject var80 = var76;
                        SubLObject var118 = (SubLObject)module0554.NIL;
                        var118 = var80.first();
                        while (module0554.NIL != var80) {
                            if (module0554.NIL == var118) {
                                var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var72, var73, var74, PrintLow.format((SubLObject)module0554.NIL, (SubLObject)module0554.$ic103$, var77)), var68);
                            }
                            else {
                                var60.resetMultipleValues();
                                final SubLObject var82 = f34202((SubLObject)ConsesLow.list(var77, var61, var118), var79, var64, var65, var44, var59, var63);
                                final SubLObject var83 = var60.secondMultipleValue();
                                var60.resetMultipleValues();
                                var64 = (SubLObject)module0554.NIL;
                                var65 = (SubLObject)module0554.NIL;
                                if (module0554.NIL != var83) {
                                    SubLObject var34_91 = var83;
                                    SubLObject var84 = (SubLObject)module0554.NIL;
                                    var84 = var34_91.first();
                                    while (module0554.NIL != var34_91) {
                                        var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var72, var73, var74, var84), var68);
                                        var34_91 = var34_91.rest();
                                        var84 = var34_91.first();
                                    }
                                }
                                else {
                                    var67 = (SubLObject)ConsesLow.cons(var82, var67);
                                }
                            }
                            var80 = var80.rest();
                            var118 = var80.first();
                        }
                    }
                    else if (var114.isInteger() && var114.numGE((SubLObject)module0554.THREE_INTEGER)) {
                        SubLObject var80 = var76;
                        SubLObject var119 = (SubLObject)module0554.NIL;
                        var119 = var80.first();
                        while (module0554.NIL != var80) {
                            if (module0554.NIL == var119) {
                                var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var72, var73, var74, PrintLow.format((SubLObject)module0554.NIL, (SubLObject)module0554.$ic104$, var114, var77)), var68);
                            }
                            else if (var119.isAtom()) {
                                var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var72, var73, var74, PrintLow.format((SubLObject)module0554.NIL, (SubLObject)module0554.$ic105$, var114, var77)), var68);
                            }
                            else {
                                var60.resetMultipleValues();
                                final SubLObject var82 = f34202((SubLObject)ConsesLow.listS(var77, var61, ConsesLow.append(var119, (SubLObject)module0554.NIL)), var79, var64, var65, var44, var59, var63);
                                final SubLObject var83 = var60.secondMultipleValue();
                                var60.resetMultipleValues();
                                var64 = (SubLObject)module0554.NIL;
                                var65 = (SubLObject)module0554.NIL;
                                if (module0554.NIL != var83) {
                                    SubLObject var34_92 = var83;
                                    SubLObject var84 = (SubLObject)module0554.NIL;
                                    var84 = var34_92.first();
                                    while (module0554.NIL != var34_92) {
                                        var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var72, var73, var74, var84), var68);
                                        var34_92 = var34_92.rest();
                                        var84 = var34_92.first();
                                    }
                                }
                                else {
                                    var67 = (SubLObject)ConsesLow.cons(var82, var67);
                                }
                            }
                            var80 = var80.rest();
                            var119 = var80.first();
                        }
                    }
                    else if (module0554.NIL == var76) {
                        var60.resetMultipleValues();
                        final SubLObject var117 = f34202((SubLObject)ConsesLow.list(var77, var61), var79, var64, var65, var44, var59, var63);
                        final SubLObject var87 = var60.secondMultipleValue();
                        var60.resetMultipleValues();
                        var64 = (SubLObject)module0554.NIL;
                        var65 = (SubLObject)module0554.NIL;
                        if (module0554.NIL != var87) {
                            SubLObject var88 = var87;
                            SubLObject var89 = (SubLObject)module0554.NIL;
                            var89 = var88.first();
                            while (module0554.NIL != var88) {
                                var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var72, var73, var74, var89), var68);
                                var88 = var88.rest();
                                var89 = var88.first();
                            }
                        }
                        else {
                            var67 = (SubLObject)ConsesLow.cons(var117, var67);
                        }
                    }
                    else {
                        SubLObject var80 = var76;
                        SubLObject var120 = (SubLObject)module0554.NIL;
                        var120 = var80.first();
                        while (module0554.NIL != var80) {
                            if (module0554.NIL == var120) {
                                var60.resetMultipleValues();
                                final SubLObject var82 = f34202((SubLObject)ConsesLow.list(var77, var61), var79, var64, var65, var44, var59, var63);
                                final SubLObject var83 = var60.secondMultipleValue();
                                var60.resetMultipleValues();
                                var64 = (SubLObject)module0554.NIL;
                                var65 = (SubLObject)module0554.NIL;
                                if (module0554.NIL != var83) {
                                    SubLObject var34_93 = var83;
                                    SubLObject var84 = (SubLObject)module0554.NIL;
                                    var84 = var34_93.first();
                                    while (module0554.NIL != var34_93) {
                                        var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var72, var73, var74, var84), var68);
                                        var34_93 = var34_93.rest();
                                        var84 = var34_93.first();
                                    }
                                }
                                else {
                                    var67 = (SubLObject)ConsesLow.cons(var82, var67);
                                }
                            }
                            else if (var120.isAtom()) {
                                var60.resetMultipleValues();
                                final SubLObject var82 = f34202((SubLObject)ConsesLow.list(var77, var61, var120), var79, var64, var65, var44, var59, var63);
                                final SubLObject var83 = var60.secondMultipleValue();
                                var60.resetMultipleValues();
                                var64 = (SubLObject)module0554.NIL;
                                var65 = (SubLObject)module0554.NIL;
                                if (module0554.NIL != var83) {
                                    SubLObject var34_94 = var83;
                                    SubLObject var84 = (SubLObject)module0554.NIL;
                                    var84 = var34_94.first();
                                    while (module0554.NIL != var34_94) {
                                        var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var72, var73, var74, var84), var68);
                                        var34_94 = var34_94.rest();
                                        var84 = var34_94.first();
                                    }
                                }
                                else {
                                    var67 = (SubLObject)ConsesLow.cons(var82, var67);
                                }
                            }
                            else if (module0554.NIL != ConsesLow.list(var120)) {
                                var60.resetMultipleValues();
                                final SubLObject var82 = f34202((SubLObject)ConsesLow.listS(var77, var61, ConsesLow.append(var120, (SubLObject)module0554.NIL)), var79, var64, var65, var44, var59, var63);
                                final SubLObject var83 = var60.secondMultipleValue();
                                var60.resetMultipleValues();
                                var64 = (SubLObject)module0554.NIL;
                                var65 = (SubLObject)module0554.NIL;
                                if (module0554.NIL != var83) {
                                    SubLObject var34_95 = var83;
                                    SubLObject var84 = (SubLObject)module0554.NIL;
                                    var84 = var34_95.first();
                                    while (module0554.NIL != var34_95) {
                                        var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var72, var73, var74, var84), var68);
                                        var34_95 = var34_95.rest();
                                        var84 = var34_95.first();
                                    }
                                }
                                else {
                                    var67 = (SubLObject)ConsesLow.cons(var82, var67);
                                }
                            }
                            else {
                                var68 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var72, var73, var74, PrintLow.format((SubLObject)module0554.NIL, (SubLObject)module0554.$ic106$, var77)), var68);
                            }
                            var80 = var80.rest();
                            var120 = var80.first();
                        }
                    }
                }
                var70 = var70.rest();
                var71 = var70.first();
            }
        }
        return Values.values(Sequences.nreverse(var67), Sequences.nreverse(var68), var44, var59);
    }
    
    public static SubLObject f34204(final SubLObject var130, SubLObject var131) {
        if (var131 == module0554.UNPROVIDED) {
            var131 = (SubLObject)module0554.$ic107$;
        }
        final SubLThread var132 = SubLProcess.currentSubLThread();
        final SubLObject var133 = var130.first();
        final SubLObject var134 = var130.rest();
        final SubLObject var135 = var133;
        if (var135.eql((SubLObject)module0554.$ic53$)) {
            final SubLObject var136 = var134.first();
            final SubLObject var89_135 = var131;
            if (var89_135.eql((SubLObject)module0554.$ic107$)) {
                module0575.f35284((SubLObject)ConsesLow.list((SubLObject)module0554.$ic108$, var136), (SubLObject)module0554.UNPROVIDED);
                module0575.f35284((SubLObject)ConsesLow.list((SubLObject)module0554.$ic109$, (SubLObject)ConsesLow.list((SubLObject)module0554.$ic110$, module0574.f35152()), (SubLObject)ConsesLow.list((SubLObject)module0554.$ic110$, module0538.f33467()), (SubLObject)ConsesLow.list((SubLObject)module0554.$ic110$, module0538.f33465()), (SubLObject)ConsesLow.list((SubLObject)module0554.$ic110$, module0538.f33468())), (SubLObject)module0554.UNPROVIDED);
                return (SubLObject)module0554.NIL;
            }
            if (var89_135.eql((SubLObject)module0554.$ic111$)) {
                return module0543.f33623(var136, (SubLObject)module0554.UNPROVIDED);
            }
        }
        else if (var135.eql((SubLObject)module0554.$ic44$)) {
            SubLObject var137 = var134.first();
            SubLObject var138 = conses_high.second(var134);
            final SubLObject var139 = conses_high.third(var134);
            final SubLObject var140 = conses_high.fourth(var134);
            if (module0554.NIL != module0035.f2428((SubLObject)module0554.$ic72$, var137, (SubLObject)module0554.UNPROVIDED, (SubLObject)module0554.UNPROVIDED)) {
                var137 = (SubLObject)ConsesLow.list((SubLObject)module0554.$ic112$, (SubLObject)ConsesLow.list((SubLObject)module0554.$ic110$, var137));
            }
            else {
                var137 = (SubLObject)ConsesLow.list((SubLObject)module0554.$ic110$, var137);
            }
            if (module0554.NIL != module0035.f2428((SubLObject)module0554.$ic72$, var138, (SubLObject)module0554.UNPROVIDED, (SubLObject)module0554.UNPROVIDED)) {
                var138 = (SubLObject)ConsesLow.list((SubLObject)module0554.$ic112$, (SubLObject)ConsesLow.list((SubLObject)module0554.$ic110$, var138));
            }
            else {
                var138 = (SubLObject)ConsesLow.list((SubLObject)module0554.$ic110$, var138);
            }
            final SubLObject var89_136 = var131;
            if (var89_136.eql((SubLObject)module0554.$ic107$)) {
                module0575.f35284((SubLObject)ConsesLow.list((SubLObject)module0554.$ic113$, var137, var138, var139, var140), (SubLObject)module0554.UNPROVIDED);
                module0575.f35284((SubLObject)ConsesLow.list((SubLObject)module0554.$ic114$, (SubLObject)ConsesLow.list((SubLObject)module0554.$ic110$, module0574.f35152()), (SubLObject)ConsesLow.list((SubLObject)module0554.$ic110$, module0538.f33467()), (SubLObject)ConsesLow.list((SubLObject)module0554.$ic110$, module0538.f33465()), (SubLObject)ConsesLow.list((SubLObject)module0554.$ic110$, module0538.f33468())), (SubLObject)module0554.UNPROVIDED);
                return (SubLObject)module0554.NIL;
            }
            if (var89_136.eql((SubLObject)module0554.$ic111$)) {
                var137 = Eval.eval(var137);
                var138 = Eval.eval(var138);
                return module0543.f33631(var137, var138, var139, var140);
            }
        }
        else if (var135.eql((SubLObject)module0554.$ic43$)) {
            SubLObject var137 = var134.first();
            SubLObject var138 = conses_high.second(var134);
            if (module0554.NIL != module0035.f2428((SubLObject)module0554.$ic72$, var137, (SubLObject)module0554.UNPROVIDED, (SubLObject)module0554.UNPROVIDED)) {
                var137 = (SubLObject)ConsesLow.list((SubLObject)module0554.$ic112$, (SubLObject)ConsesLow.list((SubLObject)module0554.$ic110$, var137));
            }
            else {
                var137 = (SubLObject)ConsesLow.list((SubLObject)module0554.$ic110$, var137);
            }
            if (module0554.NIL != module0035.f2428((SubLObject)module0554.$ic72$, var138, (SubLObject)module0554.UNPROVIDED, (SubLObject)module0554.UNPROVIDED)) {
                var138 = (SubLObject)ConsesLow.list((SubLObject)module0554.$ic112$, (SubLObject)ConsesLow.list((SubLObject)module0554.$ic110$, var138));
            }
            else {
                var138 = (SubLObject)ConsesLow.list((SubLObject)module0554.$ic110$, var138);
            }
            final SubLObject var89_137 = var131;
            if (var89_137.eql((SubLObject)module0554.$ic107$)) {
                module0575.f35284((SubLObject)ConsesLow.list((SubLObject)module0554.$ic115$, var137, var138), (SubLObject)module0554.UNPROVIDED);
                return (SubLObject)module0554.NIL;
            }
            if (var89_137.eql((SubLObject)module0554.$ic111$)) {
                var137 = Eval.eval(var137);
                var138 = Eval.eval(var138);
                return module0543.f33658(var137, var138);
            }
        }
        else if (var135.eql((SubLObject)module0554.$ic61$)) {
            SubLObject var141 = var134.first();
            final SubLObject var142 = conses_high.second(var134);
            SubLObject var143 = (SubLObject)module0554.NIL;
            SubLObject var144 = (SubLObject)module0554.NIL;
            if (module0554.NIL != module0035.f2428((SubLObject)module0554.$ic72$, var141, (SubLObject)module0554.UNPROVIDED, (SubLObject)module0554.UNPROVIDED)) {
                var143 = (SubLObject)ConsesLow.list((SubLObject)module0554.$ic112$, (SubLObject)ConsesLow.list((SubLObject)module0554.$ic110$, var141));
                var141 = (SubLObject)module0554.NIL;
            }
            else {
                var144 = module0166.f10743(var141);
                var143 = (SubLObject)ConsesLow.list((SubLObject)module0554.$ic110$, var141);
            }
            final SubLObject var89_138 = var131;
            if (var89_138.eql((SubLObject)module0554.$ic107$)) {
                module0575.f35284((SubLObject)ConsesLow.list((SubLObject)module0554.$ic116$, var143, var142), (SubLObject)module0554.UNPROVIDED);
                if (module0554.NIL != var141 && module0554.NIL != module0543.$g3954$.getDynamicValue(var132) && var144.isString()) {
                    if (module0554.NIL != module0220.f14545(var141, module0554.$ic117$, module0554.$ic118$, (SubLObject)module0554.UNPROVIDED, (SubLObject)module0554.UNPROVIDED)) {
                        final SubLObject var145 = module0147.$g2094$.currentBinding(var132);
                        final SubLObject var146 = module0147.$g2095$.currentBinding(var132);
                        try {
                            module0147.$g2094$.bind((SubLObject)module0554.$ic119$, var132);
                            module0147.$g2095$.bind(module0554.$ic118$, var132);
                            final SubLObject var147 = module0554.$ic117$;
                            if (module0554.NIL != module0158.f10010(var141, (SubLObject)module0554.ONE_INTEGER, var147)) {
                                final SubLObject var148 = module0158.f10011(var141, (SubLObject)module0554.ONE_INTEGER, var147);
                                SubLObject var149 = (SubLObject)module0554.NIL;
                                final SubLObject var150 = (SubLObject)module0554.NIL;
                                while (module0554.NIL == var149) {
                                    final SubLObject var151 = module0052.f3695(var148, var150);
                                    final SubLObject var152 = (SubLObject)SubLObjectFactory.makeBoolean(!var150.eql(var151));
                                    if (module0554.NIL != var152) {
                                        SubLObject var153 = (SubLObject)module0554.NIL;
                                        try {
                                            var153 = module0158.f10316(var151, (SubLObject)module0554.$ic120$, (SubLObject)module0554.NIL, (SubLObject)module0554.NIL);
                                            SubLObject var144_149 = (SubLObject)module0554.NIL;
                                            final SubLObject var145_150 = (SubLObject)module0554.NIL;
                                            while (module0554.NIL == var144_149) {
                                                final SubLObject var154 = module0052.f3695(var153, var145_150);
                                                final SubLObject var147_152 = (SubLObject)SubLObjectFactory.makeBoolean(!var145_150.eql(var154));
                                                if (module0554.NIL != var147_152) {
                                                    final SubLObject var155 = module0543.f33643(var154);
                                                    final SubLObject var156 = module0178.f11287(var154);
                                                    if (module0554.NIL != var155 && module0554.NIL != var156) {
                                                        module0575.f35284((SubLObject)ConsesLow.list((SubLObject)module0554.$ic115$, (SubLObject)ConsesLow.list((SubLObject)module0554.$ic110$, var155), (SubLObject)ConsesLow.list((SubLObject)module0554.$ic110$, var156)), (SubLObject)module0554.UNPROVIDED);
                                                    }
                                                }
                                                var144_149 = (SubLObject)SubLObjectFactory.makeBoolean(module0554.NIL == var147_152);
                                            }
                                        }
                                        finally {
                                            final SubLObject var120_155 = Threads.$is_thread_performing_cleanupP$.currentBinding(var132);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0554.T, var132);
                                                if (module0554.NIL != var153) {
                                                    module0158.f10319(var153);
                                                }
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var120_155, var132);
                                            }
                                        }
                                    }
                                    var149 = (SubLObject)SubLObjectFactory.makeBoolean(module0554.NIL == var152);
                                }
                            }
                        }
                        finally {
                            module0147.$g2095$.rebind(var146, var132);
                            module0147.$g2094$.rebind(var145, var132);
                        }
                    }
                    module0575.f35284((SubLObject)ConsesLow.listS((SubLObject)module0554.$ic113$, (SubLObject)ConsesLow.list((SubLObject)module0554.$ic110$, (SubLObject)ConsesLow.list(module0554.$ic117$, var141, var144)), (SubLObject)module0554.$ic121$), (SubLObject)module0554.UNPROVIDED);
                    module0575.f35284((SubLObject)ConsesLow.list((SubLObject)module0554.$ic114$, (SubLObject)ConsesLow.list((SubLObject)module0554.$ic110$, module0574.f35152()), (SubLObject)ConsesLow.list((SubLObject)module0554.$ic110$, module0538.f33467()), (SubLObject)ConsesLow.list((SubLObject)module0554.$ic110$, module0538.f33465()), (SubLObject)ConsesLow.list((SubLObject)module0554.$ic110$, module0538.f33468())), (SubLObject)module0554.UNPROVIDED);
                }
                return (SubLObject)module0554.NIL;
            }
            if (var89_138.eql((SubLObject)module0554.$ic111$)) {
                var141 = Eval.eval(var143);
                return module0543.f33640(var141, var142);
            }
        }
        else if (var135.eql((SubLObject)module0554.$ic55$)) {
            SubLObject var141 = var134.first();
            if (module0554.NIL != module0035.f2428((SubLObject)module0554.$ic72$, var141, (SubLObject)module0554.UNPROVIDED, (SubLObject)module0554.UNPROVIDED)) {
                var141 = (SubLObject)ConsesLow.list((SubLObject)module0554.$ic112$, (SubLObject)ConsesLow.list((SubLObject)module0554.$ic110$, var141));
            }
            else {
                var141 = (SubLObject)ConsesLow.list((SubLObject)module0554.$ic110$, var141);
            }
            final SubLObject var89_139 = var131;
            if (var89_139.eql((SubLObject)module0554.$ic107$)) {
                module0575.f35284((SubLObject)ConsesLow.list((SubLObject)module0554.$ic122$, var141), (SubLObject)module0554.UNPROVIDED);
                return (SubLObject)module0554.NIL;
            }
            if (var89_139.eql((SubLObject)module0554.$ic111$)) {
                return module0543.f33626(var141);
            }
        }
        else {
            if (!var135.eql((SubLObject)module0554.$ic74$)) {
                return (SubLObject)module0554.NIL;
            }
            SubLObject var157 = var134.first();
            SubLObject var158 = conses_high.second(var134);
            if (module0554.NIL != module0035.f2428((SubLObject)module0554.$ic72$, var157, (SubLObject)module0554.UNPROVIDED, (SubLObject)module0554.UNPROVIDED)) {
                var157 = (SubLObject)ConsesLow.list((SubLObject)module0554.$ic112$, (SubLObject)ConsesLow.list((SubLObject)module0554.$ic110$, var157));
            }
            else {
                var157 = (SubLObject)ConsesLow.list((SubLObject)module0554.$ic110$, var157);
            }
            if (module0554.NIL != module0035.f2428((SubLObject)module0554.$ic72$, var158, (SubLObject)module0554.UNPROVIDED, (SubLObject)module0554.UNPROVIDED)) {
                var158 = (SubLObject)ConsesLow.list((SubLObject)module0554.$ic112$, (SubLObject)ConsesLow.list((SubLObject)module0554.$ic110$, var158));
            }
            else {
                var158 = (SubLObject)ConsesLow.list((SubLObject)module0554.$ic110$, var158);
            }
            final SubLObject var89_140 = var131;
            if (var89_140.eql((SubLObject)module0554.$ic107$)) {
                module0575.f35284((SubLObject)ConsesLow.list((SubLObject)module0554.$ic123$, var157, var158), (SubLObject)module0554.UNPROVIDED);
                return (SubLObject)module0554.NIL;
            }
            if (var89_140.eql((SubLObject)module0554.$ic111$)) {
                var157 = Eval.eval(var157);
                var158 = Eval.eval(var158);
                return module0543.f33629(var157, var158);
            }
        }
        return (SubLObject)module0554.NIL;
    }
    
    public static SubLObject f34198(final SubLObject var158) {
        if (var158.isCons() && module0554.$ic72$.equal(var158.first()) && module0554.TWO_INTEGER.eql(Sequences.length(var158))) {
            return (SubLObject)module0554.T;
        }
        return (SubLObject)module0554.NIL;
    }
    
    public static SubLObject f34195(final SubLObject var159) {
        return (SubLObject)ConsesLow.list((SubLObject)module0554.$ic72$, var159);
    }
    
    public static SubLObject f34205(final SubLObject var160) {
        if (var160.isAtom()) {
            return var160;
        }
        if (!var160.first().eql((SubLObject)module0554.$ic72$)) {
            return (SubLObject)ConsesLow.cons(f34205(var160.first()), f34205(var160.rest()));
        }
        final SubLObject var161 = conses_high.second(var160);
        if (module0554.NIL != module0128.f8449(var161)) {
            return var161;
        }
        if (var161.isString()) {
            final SubLObject var162 = f34201(var161);
            if (module0554.NIL != var162) {
                return var162;
            }
            Errors.error((SubLObject)module0554.$ic124$, var161);
        }
        else {
            Errors.error((SubLObject)module0554.$ic125$);
        }
        return (SubLObject)module0554.NIL;
    }
    
    public static SubLObject f34206(final SubLObject var7, SubLObject var5, SubLObject var44, SubLObject var59) {
        if (var5 == module0554.UNPROVIDED) {
            var5 = (SubLObject)module0554.NIL;
        }
        if (var44 == module0554.UNPROVIDED) {
            var44 = (SubLObject)module0554.NIL;
        }
        if (var59 == module0554.UNPROVIDED) {
            var59 = (SubLObject)module0554.NIL;
        }
        final SubLThread var60 = SubLProcess.currentSubLThread();
        var60.resetMultipleValues();
        final SubLObject var61 = f34192(var7, var5);
        final SubLObject var62 = var60.secondMultipleValue();
        var60.resetMultipleValues();
        if (module0554.NIL != var62) {
            return Values.values((SubLObject)module0554.NIL, var62);
        }
        var60.resetMultipleValues();
        final SubLObject var63 = f34203(var61, var44, var59);
        final SubLObject var10_163 = var60.secondMultipleValue();
        final SubLObject var44_164 = var60.thirdMultipleValue();
        final SubLObject var59_165 = var60.fourthMultipleValue();
        var60.resetMultipleValues();
        return Values.values(var63, var10_163, var44_164, var59_165);
    }
    
    public static SubLObject f34207(final SubLObject var166) {
        final SubLThread var167 = SubLProcess.currentSubLThread();
        SubLObject var168 = (SubLObject)module0554.NIL;
        SubLObject var169 = (SubLObject)module0554.NIL;
        if (!var166.isString()) {
            return Values.values((SubLObject)module0554.NIL, (SubLObject)ConsesLow.list(reader.bq_cons(var166, (SubLObject)module0554.$ic126$)));
        }
        if (module0554.NIL != module0038.f2716(var166)) {
            return Values.values((SubLObject)module0554.NIL, (SubLObject)ConsesLow.list(reader.bq_cons(var166, (SubLObject)module0554.$ic127$)));
        }
        if (module0554.NIL == Filesys.probe_file(var166)) {
            return Values.values((SubLObject)module0554.NIL, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var166, (SubLObject)module0554.ZERO_INTEGER, (SubLObject)module0554.ZERO_INTEGER, module0075.f5219(var166))));
        }
        SubLObject var170 = (SubLObject)module0554.NIL;
        try {
            var170 = compatibility.open_text(var166, (SubLObject)module0554.$ic128$);
            if (!var170.isStream()) {
                Errors.error((SubLObject)module0554.$ic129$, var166);
            }
            final SubLObject var171 = var170;
            var167.resetMultipleValues();
            final SubLObject var170_171 = f34208(var171, var166);
            final SubLObject var172_173 = var167.secondMultipleValue();
            var167.resetMultipleValues();
            var168 = var170_171;
            var169 = var172_173;
        }
        finally {
            final SubLObject var172 = Threads.$is_thread_performing_cleanupP$.currentBinding(var167);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0554.T, var167);
                if (var170.isStream()) {
                    streams_high.close(var170, (SubLObject)module0554.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var172, var167);
            }
        }
        return Values.values(var168, var169);
    }
    
    public static SubLObject f34209(final SubLObject var174, final SubLObject var175) {
        final SubLThread var176 = SubLProcess.currentSubLThread();
        SubLObject var177 = (SubLObject)module0554.NIL;
        SubLObject var178 = (SubLObject)module0554.NIL;
        SubLObject var179 = (SubLObject)module0554.NIL;
        try {
            var179 = streams_high.make_private_string_input_stream(var174, (SubLObject)module0554.ZERO_INTEGER, (SubLObject)module0554.NIL);
            var176.resetMultipleValues();
            final SubLObject var177_178 = f34208(var179, var175);
            final SubLObject var179_180 = var176.secondMultipleValue();
            var176.resetMultipleValues();
            var177 = var177_178;
            var178 = var179_180;
        }
        finally {
            final SubLObject var180 = Threads.$is_thread_performing_cleanupP$.currentBinding(var176);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0554.T, var176);
                streams_high.close(var179, (SubLObject)module0554.UNPROVIDED);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var180, var176);
            }
        }
        return Values.values(var177, var178);
    }
    
    public static SubLObject f34208(final SubLObject var176, final SubLObject var181) {
        final SubLThread var182 = SubLProcess.currentSubLThread();
        SubLObject var183 = (SubLObject)module0554.NIL;
        SubLObject var184 = (SubLObject)module0554.NIL;
        try {
            var182.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var185 = Errors.$error_handler$.currentBinding(var182);
            try {
                Errors.$error_handler$.bind((SubLObject)module0554.$ic130$, var182);
                try {
                    SubLObject var186;
                    for (var186 = (SubLObject)module0554.NIL, var186 = streams_high.read_line(var176, (SubLObject)module0554.NIL, (SubLObject)module0554.UNPROVIDED, (SubLObject)module0554.UNPROVIDED); var186 != module0554.$ic131$ && module0554.NIL != var186; var186 = streams_high.read_line(var176, (SubLObject)module0554.NIL, (SubLObject)module0554.UNPROVIDED, (SubLObject)module0554.UNPROVIDED)) {
                        var183 = (SubLObject)ConsesLow.cons(var186, var183);
                    }
                }
                catch (Throwable var187) {
                    Errors.handleThrowable(var187, (SubLObject)module0554.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var185, var182);
            }
        }
        catch (Throwable var188) {
            var184 = Errors.handleThrowable(var188, module0003.$g3$.getGlobalValue());
        }
        finally {
            var182.throwStack.pop();
        }
        if (module0554.NIL != var184) {
            return Values.values((SubLObject)module0554.NIL, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var181, (SubLObject)module0554.ZERO_INTEGER, (SubLObject)module0554.ZERO_INTEGER, var184)));
        }
        return Values.values(Sequences.nreverse(var183), (SubLObject)module0554.NIL);
    }
    
    public static SubLObject f34210(final SubLObject var85) {
        SubLObject var86 = (SubLObject)module0554.NIL;
        SubLObject var87 = (SubLObject)module0554.NIL;
        SubLObject var88 = (SubLObject)module0554.NIL;
        SubLObject var89 = (SubLObject)module0554.NIL;
        SubLObject var90 = (SubLObject)module0554.NIL;
        SubLObject var91 = var85;
        SubLObject var92 = (SubLObject)module0554.NIL;
        var92 = var91.first();
        while (module0554.NIL != var91) {
            final SubLObject var93 = var92.first();
            SubLObject var94 = conses_high.second(var92);
            SubLObject var95 = conses_high.third(var92);
            if (module0554.NIL != f34198(var94)) {
                var94 = conses_high.second(var94);
            }
            if (module0554.NIL != f34198(var95)) {
                var95 = conses_high.second(var95);
            }
            final SubLObject var96 = var93;
            if (var96.eql((SubLObject)module0554.$ic53$)) {
                var87 = (SubLObject)module0554.T;
                var86 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0554.$ic53$, (SubLObject)module0554.NIL, var94), var86);
            }
            else if (var96.eql((SubLObject)module0554.$ic55$)) {
                var88 = (SubLObject)module0554.T;
                var86 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS((SubLObject)module0554.$ic55$, var94, (SubLObject)module0554.$ic132$), var86);
            }
            else if (var96.eql((SubLObject)module0554.$ic61$)) {
                var89 = (SubLObject)module0554.T;
                var86 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0554.$ic61$, var94, var95), var86);
            }
            else if (var96.eql((SubLObject)module0554.$ic74$)) {
                var90 = (SubLObject)module0554.T;
                var86 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0554.$ic74$, var94, var95), var86);
            }
            var91 = var91.rest();
            var92 = var91.first();
        }
        var86 = Sequences.nreverse(var86);
        return Values.values(var86, var87, var88, var89, var90);
    }
    
    public static SubLObject f34211(final SubLObject var167) {
        SubLObject var168 = (SubLObject)module0554.$ic133$;
        final SubLObject var169 = var167.first();
        final SubLObject var170 = conses_high.second(var167);
        final SubLObject var171 = conses_high.third(var167);
        final SubLObject var172 = conses_high.fourth(var167);
        if (module0554.NIL != var169) {
            var168 = Sequences.cconcatenate(var168, PrintLow.format((SubLObject)module0554.NIL, (SubLObject)module0554.$ic134$, var169));
        }
        if (module0554.NIL != var170) {
            if (module0554.NIL != var171) {
                var168 = Sequences.cconcatenate(var168, PrintLow.format((SubLObject)module0554.NIL, (SubLObject)module0554.$ic135$, var170, var171));
            }
            else {
                var168 = Sequences.cconcatenate(var168, PrintLow.format((SubLObject)module0554.NIL, (SubLObject)module0554.$ic136$, var170));
            }
        }
        else if (module0554.NIL != var171) {
            var168 = Sequences.cconcatenate(var168, PrintLow.format((SubLObject)module0554.NIL, (SubLObject)module0554.$ic137$, var171));
        }
        else {
            var168 = Sequences.cconcatenate(var168, PrintLow.format((SubLObject)module0554.NIL, (SubLObject)module0554.$ic138$));
        }
        var168 = Sequences.cconcatenate(var168, PrintLow.format((SubLObject)module0554.NIL, (SubLObject)module0554.$ic139$, var172));
        return var168;
    }
    
    public static SubLObject f34212(final SubLObject var176, final SubLObject var195) {
        PrintLow.format(var176, (SubLObject)module0554.$ic140$);
        module0194.f12114(var195, var176, (SubLObject)module0554.UNPROVIDED);
        PrintLow.format(var176, (SubLObject)module0554.$ic141$);
        return var195;
    }
    
    public static SubLObject f34213(final SubLObject var196, final SubLObject var5, SubLObject var131, SubLObject var197, SubLObject var198) {
        if (var131 == module0554.UNPROVIDED) {
            var131 = (SubLObject)module0554.$ic107$;
        }
        if (var197 == module0554.UNPROVIDED) {
            var197 = (SubLObject)module0554.NIL;
        }
        if (var198 == module0554.UNPROVIDED) {
            var198 = (SubLObject)module0554.$ic142$;
        }
        final SubLThread var199 = SubLProcess.currentSubLThread();
        assert module0554.NIL != Types.stringp(var5) : var5;
        final SubLObject var200 = var196.isString() ? module0166.f10737(var196) : var196;
        final SubLObject var201 = module0147.$g2094$.currentBinding(var199);
        final SubLObject var202 = module0147.$g2095$.currentBinding(var199);
        try {
            module0147.$g2094$.bind((SubLObject)module0554.$ic99$, var199);
            module0147.$g2095$.bind(module0554.$ic100$, var199);
            if (module0554.NIL == module0226.f14809(var200)) {
                PrintLow.format((SubLObject)module0554.T, (SubLObject)module0554.$ic144$, var196);
            }
        }
        finally {
            module0147.$g2095$.rebind(var202, var199);
            module0147.$g2094$.rebind(var201, var199);
        }
        final SubLObject var203 = module0574.f35152();
        try {
            module0574.f35153(var200);
            var199.resetMultipleValues();
            final SubLObject var204 = f34207(var5);
            final SubLObject var205 = var199.secondMultipleValue();
            var199.resetMultipleValues();
            if (module0554.NIL != var205) {
                SubLObject var206 = var205;
                SubLObject var207 = (SubLObject)module0554.NIL;
                var207 = var206.first();
                while (module0554.NIL != var206) {
                    PrintLow.format((SubLObject)module0554.T, (SubLObject)module0554.$ic145$, f34211(var207));
                    var206 = var206.rest();
                    var207 = var206.first();
                }
            }
            else {
                var199.resetMultipleValues();
                final SubLObject var208 = f34206(var204, var5, (SubLObject)module0554.UNPROVIDED, (SubLObject)module0554.UNPROVIDED);
                final SubLObject var10_201 = var199.secondMultipleValue();
                var199.resetMultipleValues();
                if (module0554.NIL != var10_201) {
                    SubLObject var209 = var10_201;
                    SubLObject var210 = (SubLObject)module0554.NIL;
                    var210 = var209.first();
                    while (module0554.NIL != var209) {
                        PrintLow.format((SubLObject)module0554.T, (SubLObject)module0554.$ic145$, f34211(var210));
                        var209 = var209.rest();
                        var210 = var209.first();
                    }
                }
                else {
                    var199.resetMultipleValues();
                    final SubLObject var211 = f34210(var208);
                    final SubLObject var212 = var199.secondMultipleValue();
                    final SubLObject var213 = var199.thirdMultipleValue();
                    final SubLObject var214 = var199.fourthMultipleValue();
                    final SubLObject var215 = var199.fifthMultipleValue();
                    var199.resetMultipleValues();
                    SubLObject var216 = (SubLObject)module0554.NIL;
                    SubLObject var217 = (SubLObject)module0554.NIL;
                    if (module0554.NIL != var215) {
                        var216 = (SubLObject)ConsesLow.cons((SubLObject)module0554.$ic146$, var216);
                    }
                    if (module0554.NIL != var214) {
                        var216 = (SubLObject)ConsesLow.cons((SubLObject)module0554.$ic147$, var216);
                    }
                    if (module0554.NIL != var213) {
                        var216 = (SubLObject)ConsesLow.cons((SubLObject)module0554.$ic148$, var216);
                    }
                    if (module0554.NIL != var212) {
                        var216 = (SubLObject)ConsesLow.cons((SubLObject)module0554.$ic149$, var216);
                    }
                    final SubLObject var218 = Sequences.length(var216);
                    if (var218.eql((SubLObject)module0554.TWO_INTEGER)) {
                        var217 = (SubLObject)module0554.$ic150$;
                    }
                    else if (var218.eql((SubLObject)module0554.THREE_INTEGER)) {
                        var217 = (SubLObject)module0554.$ic151$;
                    }
                    else if (var218.eql((SubLObject)module0554.FOUR_INTEGER)) {
                        var217 = (SubLObject)module0554.$ic152$;
                    }
                    if (var198 != module0554.$ic153$) {
                        if (module0554.NIL != var216) {
                            PrintLow.format((SubLObject)module0554.T, (SubLObject)module0554.$ic154$);
                            SubLObject var219 = (SubLObject)module0554.NIL;
                            SubLObject var40_204 = (SubLObject)module0554.NIL;
                            SubLObject var220 = (SubLObject)module0554.NIL;
                            SubLObject var206_207 = (SubLObject)module0554.NIL;
                            var219 = var216;
                            var40_204 = var219.first();
                            var220 = var217;
                            var206_207 = var220.first();
                            while (module0554.NIL != var220 || module0554.NIL != var219) {
                                if (module0554.NIL != var40_204) {
                                    PrintLow.format((SubLObject)module0554.T, var40_204);
                                }
                                if (module0554.NIL != var206_207) {
                                    PrintLow.format((SubLObject)module0554.T, var206_207);
                                }
                                var219 = var219.rest();
                                var40_204 = var219.first();
                                var220 = var220.rest();
                                var206_207 = var220.first();
                            }
                            PrintLow.format((SubLObject)module0554.T, (SubLObject)module0554.$ic155$);
                        }
                        PrintLow.format((SubLObject)module0554.T, (SubLObject)module0554.$ic156$);
                        SubLObject var221 = var211;
                        SubLObject var222 = (SubLObject)module0554.NIL;
                        var222 = var221.first();
                        while (module0554.NIL != var221) {
                            final SubLObject var223 = var222.first();
                            final SubLObject var224 = conses_high.second(var222);
                            final SubLObject var225 = conses_high.third(var222);
                            final SubLObject var226 = var223;
                            if (var226.eql((SubLObject)module0554.$ic53$)) {
                                PrintLow.format((SubLObject)module0554.T, (SubLObject)module0554.$ic157$, var225);
                            }
                            else if (var226.eql((SubLObject)module0554.$ic55$)) {
                                PrintLow.format((SubLObject)module0554.T, (SubLObject)module0554.$ic158$, var224);
                            }
                            else if (var226.eql((SubLObject)module0554.$ic61$)) {
                                PrintLow.format((SubLObject)module0554.T, (SubLObject)module0554.$ic159$, var224, var225);
                            }
                            var221 = var221.rest();
                            var222 = var221.first();
                        }
                    }
                    if (var198 != module0554.$ic153$) {
                        SubLObject var209 = var208;
                        SubLObject var227 = (SubLObject)module0554.NIL;
                        var227 = var209.first();
                        while (module0554.NIL != var209) {
                            print_high.print(var227, (SubLObject)module0554.UNPROVIDED);
                            var209 = var209.rest();
                            var227 = var209.first();
                        }
                    }
                    final SubLObject var228 = Sequences.length(var208);
                    SubLObject var229 = (SubLObject)module0554.ZERO_INTEGER;
                    if (module0554.NIL != var197 || module0554.NIL != UserIO.user_confirm(PrintLow.format((SubLObject)module0554.NIL, (SubLObject)module0554.$ic160$, var228))) {
                        final SubLObject var230 = module0012.$silent_progressP$.currentBinding(var199);
                        final SubLObject var231 = module0012.$g75$.currentBinding(var199);
                        final SubLObject var232 = module0012.$g76$.currentBinding(var199);
                        final SubLObject var233 = module0012.$g77$.currentBinding(var199);
                        final SubLObject var234 = module0012.$g78$.currentBinding(var199);
                        try {
                            module0012.$silent_progressP$.bind(Equality.eq(var198, (SubLObject)module0554.$ic153$), var199);
                            module0012.$g75$.bind((SubLObject)module0554.ZERO_INTEGER, var199);
                            module0012.$g76$.bind((SubLObject)module0554.NIL, var199);
                            module0012.$g77$.bind((SubLObject)module0554.T, var199);
                            module0012.$g78$.bind(Time.get_universal_time(), var199);
                            module0012.f478(PrintLow.format((SubLObject)module0554.NIL, (SubLObject)module0554.$ic161$, var228));
                            SubLObject var221 = var208;
                            SubLObject var235 = (SubLObject)module0554.NIL;
                            var235 = var221.first();
                            while (module0554.NIL != var221) {
                                var229 = Numbers.add(var229, (SubLObject)module0554.ONE_INTEGER);
                                module0012.note_percent_progress(var229, var228);
                                if (module0554.NIL != module0554.$g4008$.getDynamicValue(var199)) {
                                    SubLObject var236 = (SubLObject)module0554.NIL;
                                    try {
                                        final SubLObject var120_217 = stream_macros.$stream_requires_locking$.currentBinding(var199);
                                        try {
                                            stream_macros.$stream_requires_locking$.bind((SubLObject)module0554.NIL, var199);
                                            var236 = compatibility.open_text(module0554.$g4008$.getDynamicValue(var199), (SubLObject)module0554.$ic162$);
                                        }
                                        finally {
                                            stream_macros.$stream_requires_locking$.rebind(var120_217, var199);
                                        }
                                        if (!var236.isStream()) {
                                            Errors.error((SubLObject)module0554.$ic129$, module0554.$g4008$.getDynamicValue(var199));
                                        }
                                        final SubLObject var237 = var236;
                                        var199.resetMultipleValues();
                                        final SubLObject var238 = f34204(var235, var131);
                                        final SubLObject var239 = var199.secondMultipleValue();
                                        var199.resetMultipleValues();
                                        if (module0554.NIL != var239) {
                                            PrintLow.format(var237, (SubLObject)module0554.$ic139$, var239);
                                        }
                                    }
                                    finally {
                                        final SubLObject var120_218 = Threads.$is_thread_performing_cleanupP$.currentBinding(var199);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0554.T, var199);
                                            if (var236.isStream()) {
                                                streams_high.close(var236, (SubLObject)module0554.UNPROVIDED);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var120_218, var199);
                                        }
                                    }
                                }
                                else {
                                    f34204(var235, var131);
                                }
                                var221 = var221.rest();
                                var235 = var221.first();
                            }
                            module0012.f479();
                        }
                        finally {
                            module0012.$g78$.rebind(var234, var199);
                            module0012.$g77$.rebind(var233, var199);
                            module0012.$g76$.rebind(var232, var199);
                            module0012.$g75$.rebind(var231, var199);
                            module0012.$silent_progressP$.rebind(var230, var199);
                        }
                    }
                }
            }
        }
        finally {
            final SubLObject var240 = Threads.$is_thread_performing_cleanupP$.currentBinding(var199);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0554.T, var199);
                module0574.f35153(var203);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var240, var199);
            }
        }
        return (SubLObject)module0554.NIL;
    }
    
    public static SubLObject f34214() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0554", "f34191", "S#37436");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0554", "f34192", "S#37437", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0554", "f34193", "S#37438", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0554", "f34194", "S#37439", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0554", "f34197", "S#37440", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0554", "f34199", "S#37441", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0554", "f34200", "S#37442", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0554", "f34196", "S#37443", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0554", "f34201", "S#37444", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0554", "f34202", "S#37445", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0554", "f34203", "S#37446", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0554", "f34204", "S#37447", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0554", "f34198", "S#37448", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0554", "f34195", "S#37449", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0554", "f34205", "RESOLVE-NEW-CONSTANTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0554", "f34206", "S#37450", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0554", "f34207", "S#37451", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0554", "f34209", "S#37452", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0554", "f34208", "S#37453", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0554", "f34210", "S#37454", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0554", "f34211", "S#37455", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0554", "f34212", "S#37456", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0554", "f34213", "LOAD-KE-TEXT-FILE", 2, 3, false);
        return (SubLObject)module0554.NIL;
    }
    
    public static SubLObject f34215() {
        module0554.$g4007$ = SubLFiles.defparameter("S#37457", (SubLObject)module0554.TEN_INTEGER);
        module0554.$g4008$ = SubLFiles.defparameter("S#37458", (SubLObject)module0554.NIL);
        module0554.$g4009$ = SubLFiles.defparameter("S#37459", (SubLObject)module0554.$ic16$);
        module0554.$g4010$ = SubLFiles.defparameter("S#37460", (SubLObject)module0554.$ic17$);
        module0554.$g4011$ = SubLFiles.defparameter("S#37461", (SubLObject)module0554.$ic18$);
        return (SubLObject)module0554.NIL;
    }
    
    public static SubLObject f34216() {
        module0012.f368((SubLObject)module0554.$ic163$, (SubLObject)module0554.$ic164$, (SubLObject)module0554.$ic165$, (SubLObject)module0554.$ic166$, (SubLObject)module0554.NIL);
        return (SubLObject)module0554.NIL;
    }
    
    public void declareFunctions() {
        f34214();
    }
    
    public void initializeVariables() {
        f34215();
    }
    
    public void runTopLevelForms() {
        f34216();
    }
    
    static {
        me = (SubLFile)new module0554();
        module0554.$g4007$ = null;
        module0554.$g4008$ = null;
        module0554.$g4009$ = null;
        module0554.$g4010$ = null;
        module0554.$g4011$ = null;
        $ic0$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#885", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic1$ = SubLObjectFactory.makeSymbol("PIF");
        $ic2$ = SubLObjectFactory.makeSymbol("S#6802", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("CLET");
        $ic4$ = SubLObjectFactory.makeSymbol("S#37458", "CYC");
        $ic5$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic6$ = SubLObjectFactory.makeSymbol("WARN");
        $ic7$ = SubLObjectFactory.makeString("Unable to log failures to ~S because file is not writeable.  Continuing without logging.");
        $ic8$ = SubLObjectFactory.makeKeyword("END-OF-DIRECTIVE");
        $ic9$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Aborting: Too many errors found"));
        $ic10$ = SubLObjectFactory.makeString("Too many close parenthesis on line ~A");
        $ic11$ = SubLObjectFactory.makeKeyword("END-OF-DATA");
        $ic12$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Missing directive"));
        $ic13$ = SubLObjectFactory.makeString("Missing data for directive ~A");
        $ic14$ = SubLObjectFactory.makeString("Unclosed open parenthesis on line ~A");
        $ic15$ = SubLObjectFactory.makeString("Unfinished expression at end of file");
        $ic16$ = ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("constant"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("unit"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("formula"), (SubLObject)SubLObjectFactory.makeKeyword("FORMULA")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("f"), (SubLObject)SubLObjectFactory.makeKeyword("FORMULA")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("el"), (SubLObject)SubLObjectFactory.makeKeyword("FORMULA")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("enter"), (SubLObject)SubLObjectFactory.makeKeyword("ENTER")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("delete"), (SubLObject)SubLObjectFactory.makeKeyword("DELETE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("in mt"), (SubLObject)SubLObjectFactory.makeKeyword("IN-MT")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("default mt"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT-MT")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("direction"), (SubLObject)SubLObjectFactory.makeKeyword("DIRECTION")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("d"), (SubLObject)SubLObjectFactory.makeKeyword("DIRECTION")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("al"), (SubLObject)SubLObjectFactory.makeKeyword("DIRECTION")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("access level"), (SubLObject)SubLObjectFactory.makeKeyword("DIRECTION")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("strength"), (SubLObject)SubLObjectFactory.makeKeyword("STRENGTH")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("truth value"), (SubLObject)SubLObjectFactory.makeKeyword("STRENGTH")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("tv"), (SubLObject)SubLObjectFactory.makeKeyword("STRENGTH")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("kill"), (SubLObject)SubLObjectFactory.makeKeyword("KILL")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rename"), (SubLObject)SubLObjectFactory.makeKeyword("RENAME")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("merge"), (SubLObject)SubLObjectFactory.makeKeyword("MERGE")) });
        $ic17$ = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("forward"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("0"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("backward"), (SubLObject)SubLObjectFactory.makeKeyword("BACKWARD")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("4"), (SubLObject)SubLObjectFactory.makeKeyword("BACKWARD")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("code"), (SubLObject)SubLObjectFactory.makeKeyword("CODE")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("unknown"), (SubLObject)SubLObjectFactory.makeKeyword("UNKNOWN")));
        $ic18$ = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("default"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("monotonic"), (SubLObject)SubLObjectFactory.makeKeyword("MONOTONIC")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("unknown"), (SubLObject)SubLObjectFactory.makeKeyword("UNKNOWN")));
        $ic19$ = SubLObjectFactory.makeKeyword("MONOTONIC");
        $ic20$ = SubLObjectFactory.makeKeyword("DEFAULT");
        $ic21$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("DefaultMonotonicPredicate"));
        $ic22$ = SubLObjectFactory.makeKeyword("FORWARD");
        $ic23$ = SubLObjectFactory.makeKeyword("BACKWARD");
        $ic24$ = SubLObjectFactory.makeKeyword("CODE");
        $ic25$ = SubLObjectFactory.makeString("Something is nil");
        $ic26$ = SubLObjectFactory.makeString("Bad reference to a killed or renamed constant (~A)");
        $ic27$ = SubLObjectFactory.makeString("A single colon is an invalid keyword name");
        $ic28$ = SubLObjectFactory.makeString("A single question mark is an invalid variable name");
        $ic29$ = ConsesLow.list((SubLObject)Characters.CHAR_quotation);
        $ic30$ = SubLObjectFactory.makeString("Malformed string");
        $ic31$ = SubLObjectFactory.makeString("Gratutuious single quote");
        $ic32$ = SubLObjectFactory.makeKeyword("DOT-FOR-DOTTED-LIST");
        $ic33$ = SubLObjectFactory.makeString("Bad number (~A)");
        $ic34$ = SubLObjectFactory.makeString("nil");
        $ic35$ = SubLObjectFactory.makeString("t");
        $ic36$ = SubLObjectFactory.makeString("Constant not found (~A)");
        $ic37$ = SubLObjectFactory.makeString("Couldn't figure out string (~A) (did you forget a period?)");
        $ic38$ = SubLObjectFactory.makeString("Couldn't figure out (~A)");
        $ic39$ = SubLObjectFactory.makeKeyword("ENTER");
        $ic40$ = SubLObjectFactory.makeString("Microtheory not specified");
        $ic41$ = SubLObjectFactory.makeString("Invalid dotted list");
        $ic42$ = SubLObjectFactory.makeKeyword("DELETE");
        $ic43$ = SubLObjectFactory.makeKeyword("UNASSERT");
        $ic44$ = SubLObjectFactory.makeKeyword("ASSERT");
        $ic45$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Unknown directive"));
        $ic46$ = SubLObjectFactory.makeKeyword("FORMULA");
        $ic47$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Formula: No formula specified"));
        $ic48$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Formula: Formula specified must be a list"));
        $ic49$ = SubLObjectFactory.makeKeyword("CONSTANT");
        $ic50$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Constant: No constant specified"));
        $ic51$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Constant: Only one constant may be specified"));
        $ic52$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Constant: Invalid constant name"));
        $ic53$ = SubLObjectFactory.makeKeyword("CREATE");
        $ic54$ = SubLObjectFactory.makeString("Constant: Unrecognized constant (~A)");
        $ic55$ = SubLObjectFactory.makeKeyword("KILL");
        $ic56$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Kill: No constant specified"));
        $ic57$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Kill: Only one constant may be specified"));
        $ic58$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Kill: Can't kill a NART."));
        $ic59$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Kill: Constant name must be a string."));
        $ic60$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Kill: Constant already killed."));
        $ic61$ = SubLObjectFactory.makeKeyword("RENAME");
        $ic62$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Rename: Nothing to rename"));
        $ic63$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Rename: Old constant name not specified"));
        $ic64$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Rename: Can't rename NATs"));
        $ic65$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Rename: Old constant name must be a string"));
        $ic66$ = SubLObjectFactory.makeString("Rename: Can't rename a constant recently killed or renamed (~A)");
        $ic67$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Rename: New constant name must be a string"));
        $ic68$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Rename: New constant name must be a string inside double quotes."));
        $ic69$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Rename: New constant name is not a valid name for a constant."));
        $ic70$ = SubLObjectFactory.makeString("Rename: Can't rename to constant recently created (~A)");
        $ic71$ = SubLObjectFactory.makeString("Rename: Can't rename to existing constant in KB (~A)");
        $ic72$ = SubLObjectFactory.makeKeyword("NEW-CONSTANT");
        $ic73$ = SubLObjectFactory.makeString("Rename: Unrecognized constant (~A)");
        $ic74$ = SubLObjectFactory.makeKeyword("MERGE");
        $ic75$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Merge: Nothing to merge"));
        $ic76$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Merge: No kill term given"));
        $ic77$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Merge: Can't merge from killed term"));
        $ic78$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Merge: Kill term must be a FORT"));
        $ic79$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Merge: No keep term given"));
        $ic80$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Merge: Can't merge onto killed term"));
        $ic81$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Merge: Keep term must be a FORT"));
        $ic82$ = SubLObjectFactory.makeKeyword("IN-MT");
        $ic83$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("In Mt: No mt specified"));
        $ic84$ = SubLObjectFactory.makeString("In Mt: NAT mt must be a hlmt-p (~A)");
        $ic85$ = SubLObjectFactory.makeString("In Mt: Unrecognized mt (~A)");
        $ic86$ = SubLObjectFactory.makeKeyword("DEFAULT-MT");
        $ic87$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Default-Mt: No mt specified"));
        $ic88$ = SubLObjectFactory.makeString("Default Mt: NAT mt must be a hlmt-p (~A)");
        $ic89$ = SubLObjectFactory.makeString("Default Mt: Unrecognized mt (~A)");
        $ic90$ = SubLObjectFactory.makeKeyword("STRENGTH");
        $ic91$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Strength: No strength specified"));
        $ic92$ = SubLObjectFactory.makeString("Strength: Unrecognized strength (~A)");
        $ic93$ = SubLObjectFactory.makeKeyword("DIRECTION");
        $ic94$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Direction: No direction specified"));
        $ic95$ = SubLObjectFactory.makeString("Direction: Unrecognized direction (~A)");
        $ic96$ = SubLObjectFactory.makeSymbol("STRING=");
        $ic97$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Unrecognized predicate"));
        $ic98$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("NAT predicates unsupported"));
        $ic99$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic100$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic101$ = SubLObjectFactory.makeString("Constant must be specified");
        $ic102$ = SubLObjectFactory.makeString("Unexpected argument to unary predicate (~A)");
        $ic103$ = SubLObjectFactory.makeString("No argument found for binary predicate (~A)");
        $ic104$ = SubLObjectFactory.makeString("No argument found for arity ~A predicate (~A)");
        $ic105$ = SubLObjectFactory.makeString("List argument expected for arity ~A predicate (~A)");
        $ic106$ = SubLObjectFactory.makeString("Unexpected argument for predicate (~A)");
        $ic107$ = SubLObjectFactory.makeKeyword("AGENDA");
        $ic108$ = SubLObjectFactory.makeSymbol("FI-CREATE");
        $ic109$ = SubLObjectFactory.makeSymbol("FI-TIMESTAMP-CONSTANT");
        $ic110$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic111$ = SubLObjectFactory.makeKeyword("NOW");
        $ic112$ = SubLObjectFactory.makeSymbol("RESOLVE-NEW-CONSTANTS");
        $ic113$ = SubLObjectFactory.makeSymbol("FI-ASSERT");
        $ic114$ = SubLObjectFactory.makeSymbol("FI-TIMESTAMP-ASSERTION");
        $ic115$ = SubLObjectFactory.makeSymbol("FI-UNASSERT");
        $ic116$ = SubLObjectFactory.makeSymbol("FI-RENAME");
        $ic117$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("oldConstantName"));
        $ic118$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("BookkeepingMt"));
        $ic119$ = SubLObjectFactory.makeSymbol("S#12276", "CYC");
        $ic120$ = SubLObjectFactory.makeKeyword("GAF");
        $ic121$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("BookkeepingMt"))));
        $ic122$ = SubLObjectFactory.makeSymbol("FI-KILL");
        $ic123$ = SubLObjectFactory.makeSymbol("FI-MERGE");
        $ic124$ = SubLObjectFactory.makeString("Constant does not exist (~A)");
        $ic125$ = SubLObjectFactory.makeString(":new-constant must be followed by a string or constant");
        $ic126$ = ConsesLow.list((SubLObject)module0554.ZERO_INTEGER, (SubLObject)module0554.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("Filename is not a string"));
        $ic127$ = ConsesLow.list((SubLObject)module0554.ZERO_INTEGER, (SubLObject)module0554.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("Filename is null string"));
        $ic128$ = SubLObjectFactory.makeKeyword("INPUT");
        $ic129$ = SubLObjectFactory.makeString("Unable to open ~S");
        $ic130$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic131$ = SubLObjectFactory.makeKeyword("EOF");
        $ic132$ = ConsesLow.list((SubLObject)module0554.NIL);
        $ic133$ = SubLObjectFactory.makeString("");
        $ic134$ = SubLObjectFactory.makeString("~A: ");
        $ic135$ = SubLObjectFactory.makeString("~A-~A: ");
        $ic136$ = SubLObjectFactory.makeString("~A-: ");
        $ic137$ = SubLObjectFactory.makeString("-~A: ");
        $ic138$ = SubLObjectFactory.makeString("?: ");
        $ic139$ = SubLObjectFactory.makeString("~A");
        $ic140$ = SubLObjectFactory.makeString("el:");
        $ic141$ = SubLObjectFactory.makeString(" .~%");
        $ic142$ = SubLObjectFactory.makeKeyword("NORMAL");
        $ic143$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic144$ = SubLObjectFactory.makeString("~%Sorry, ~s is not known to be a Cyclist.");
        $ic145$ = SubLObjectFactory.makeString("~A~%");
        $ic146$ = SubLObjectFactory.makeString("merged");
        $ic147$ = SubLObjectFactory.makeString("renamed");
        $ic148$ = SubLObjectFactory.makeString("killed");
        $ic149$ = SubLObjectFactory.makeString("created");
        $ic150$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(" or "));
        $ic151$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(", "), (SubLObject)SubLObjectFactory.makeString(", or "));
        $ic152$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(", "), (SubLObject)SubLObjectFactory.makeString(", "), (SubLObject)SubLObjectFactory.makeString(" or "));
        $ic153$ = SubLObjectFactory.makeKeyword("QUIET");
        $ic154$ = SubLObjectFactory.makeString("The following constants will be ");
        $ic155$ = SubLObjectFactory.makeString(":");
        $ic156$ = SubLObjectFactory.makeString("~%");
        $ic157$ = SubLObjectFactory.makeString("  Create: ~A~%");
        $ic158$ = SubLObjectFactory.makeString("  Kill: ~A~%");
        $ic159$ = SubLObjectFactory.makeString("  Rename: ~A to ~A~%");
        $ic160$ = SubLObjectFactory.makeString("Would you like to evaluate the ~A forms above? ");
        $ic161$ = SubLObjectFactory.makeString("Evaluating ~A forms...~%");
        $ic162$ = SubLObjectFactory.makeKeyword("APPEND");
        $ic163$ = SubLObjectFactory.makeSymbol("LOAD-KE-TEXT-FILE");
        $ic164$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#710", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#885", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD"), (SubLObject)SubLObjectFactory.makeKeyword("AGENDA")), (SubLObject)SubLObjectFactory.makeSymbol("S#37462", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2816", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("NORMAL")));
        $ic165$ = SubLObjectFactory.makeString("Call the ke text engine on a file from the lisp interactor.\n@param CYCLIST (string or constant) \n@param FILENAME string\n@param METHOD keyword ;; can be :agenda or :now.\n@param NO-USER-INTERACTION? boolean ;; if non nil, then the confirming question is not asked.\n@param VERBOSITY keyword-p; either :normal or :quiet.  If :quiet, will only show errors.\n");
        $ic166$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#885", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0554.class
	Total time: 1319 ms
	
	Decompiled with Procyon 0.5.32.
*/