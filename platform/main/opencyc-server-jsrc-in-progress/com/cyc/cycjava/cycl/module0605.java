package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0605 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0605";
    public static final String myFingerPrint = "a45ea8585ac4898849f9a818387519f4c7aa47935f032157e989c1f268b86e04";
    private static SubLSymbol $g4675$;
    private static SubLSymbol $g4676$;
    public static SubLSymbol $g4677$;
    public static SubLSymbol $g4678$;
    private static SubLSymbol $g4679$;
    private static SubLSymbol $g4680$;
    private static SubLSymbol $g4681$;
    private static SubLSymbol $g4682$;
    private static SubLSymbol $g4683$;
    private static SubLSymbol $g4684$;
    public static SubLSymbol $g4685$;
    private static SubLSymbol $g4686$;
    private static SubLSymbol $g4687$;
    private static SubLSymbol $g4688$;
    private static SubLSymbol $g4689$;
    private static SubLSymbol $g4690$;
    public static SubLSymbol $g4691$;
    public static SubLSymbol $g4692$;
    public static SubLSymbol $g4693$;
    public static SubLSymbol $g4694$;
    private static SubLSymbol $g4695$;
    private static SubLSymbol $g4696$;
    public static SubLSymbol $g4697$;
    private static SubLSymbol $g4698$;
    private static SubLSymbol $g4699$;
    private static SubLSymbol $g4700$;
    private static final SubLString $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLList $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLList $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLList $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
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
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLObject $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLList $ic67$;
    private static final SubLList $ic68$;
    private static final SubLList $ic69$;
    private static final SubLList $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLList $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLString $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLString $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLString $ic88$;
    private static final SubLString $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLString $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLString $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLString $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLString $ic103$;
    private static final SubLString $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLString $ic115$;
    private static final SubLInteger $ic116$;
    private static final SubLString $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLList $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLString $ic123$;
    private static final SubLString $ic124$;
    private static final SubLString $ic125$;
    private static final SubLString $ic126$;
    private static final SubLString $ic127$;
    private static final SubLString $ic128$;
    private static final SubLString $ic129$;
    private static final SubLString $ic130$;
    private static final SubLString $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLString $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLString $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLString $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLString $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLList $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLList $ic157$;
    private static final SubLList $ic158$;
    private static final SubLList $ic159$;
    private static final SubLList $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLList $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLSymbol $ic165$;
    private static final SubLSymbol $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLString $ic169$;
    private static final SubLSymbol $ic170$;
    private static final SubLSymbol $ic171$;
    private static final SubLSymbol $ic172$;
    private static final SubLSymbol $ic173$;
    private static final SubLSymbol $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLString $ic176$;
    private static final SubLSymbol $ic177$;
    private static final SubLSymbol $ic178$;
    private static final SubLString $ic179$;
    private static final SubLString $ic180$;
    private static final SubLSymbol $ic181$;
    private static final SubLSymbol $ic182$;
    private static final SubLString $ic183$;
    private static final SubLString $ic184$;
    private static final SubLString $ic185$;
    private static final SubLString $ic186$;
    private static final SubLSymbol $ic187$;
    private static final SubLSymbol $ic188$;
    private static final SubLSymbol $ic189$;
    
    public static SubLObject f36966(final SubLObject var1, final SubLObject var2) {
        return module0067.f4886($g4675$.getGlobalValue(), var1, var2);
    }
    
    public static SubLObject f36967(final SubLObject var1, final SubLObject var3) {
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = var3;
        SubLObject var7 = (SubLObject)NIL;
        var7 = var6.first();
        while (NIL != var6) {
            if (NIL != module0196.f12240(var7)) {
                final SubLObject var8 = var7;
                if (NIL == conses_high.member(var8, var4, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var4 = (SubLObject)ConsesLow.cons(var8, var4);
                }
            }
            else if (NIL != module0196.f12241(var7)) {
                var5 = (SubLObject)ConsesLow.cons(var7, var5);
            }
            else {
                Errors.error((SubLObject)$ic0$, var7, var1);
            }
            var6 = var6.rest();
            var7 = var6.first();
        }
        if (NIL != var5) {
            var6 = module0196.f12239(var5);
            SubLObject var9 = (SubLObject)NIL;
            var9 = var6.first();
            while (NIL != var6) {
                final SubLObject var8 = var9;
                if (NIL == conses_high.member(var8, var4, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var4 = (SubLObject)ConsesLow.cons(var8, var4);
                }
                var6 = var6.rest();
                var9 = var6.first();
            }
        }
        return module0067.f4886($g4676$.getGlobalValue(), var1, var4);
    }
    
    public static SubLObject f36968(final SubLObject var1) {
        return module0067.f4884($g4676$.getGlobalValue(), var1, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f36969(final SubLObject var10, final SubLObject var11) {
        SubLObject var13;
        final SubLObject var12 = var13 = var10.rest();
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var17 = (SubLObject)NIL;
        SubLObject var18 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic1$);
        var14 = var13.first();
        var13 = var13.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic1$);
        var15 = var13.first();
        var13 = var13.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic1$);
        var16 = var13.first();
        var13 = var13.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic1$);
        var17 = var13.first();
        var13 = var13.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic1$);
        var18 = var13.first();
        final SubLObject var19;
        var13 = (var19 = var13.rest());
        if (var17.first() != $ic2$) {
            Errors.error((SubLObject)$ic3$);
        }
        return (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.listS((SubLObject)$ic5$, var16, var17, var18, ConsesLow.append(var19, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, var14, (SubLObject)ConsesLow.list((SubLObject)$ic7$, var16)), (SubLObject)ConsesLow.list((SubLObject)$ic8$, var14, (SubLObject)ConsesLow.list((SubLObject)$ic7$, var15)));
    }
    
    public static SubLObject f36970(final SubLObject var1) {
        return module0067.f4884($g4675$.getGlobalValue(), var1, Symbols.symbol_function((SubLObject)IDENTITY));
    }
    
    public static SubLObject f36971(final SubLObject var10, final SubLObject var11) {
        SubLObject var13;
        final SubLObject var12 = var13 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic9$);
        final SubLObject var14 = var13.rest();
        var13 = var13.first();
        SubLObject var15 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic9$);
        var15 = var13.first();
        var13 = var13.rest();
        if (NIL == var13) {
            final SubLObject var16;
            var13 = (var16 = var14);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic10$, (SubLObject)$ic11$, ConsesLow.append(var16, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)$ic12$, var15, (SubLObject)$ic13$))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic9$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36972(final SubLObject var9, final SubLObject var23) {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        SubLObject var25 = (SubLObject)NIL;
        SubLObject var26 = (SubLObject)NIL;
        final SubLObject var27 = $g4677$.currentBinding(var24);
        try {
            $g4677$.bind((SubLObject)NIL, var24);
            var26 = f36973(var9, var23);
            var25 = $g4677$.getDynamicValue(var24);
        }
        finally {
            $g4677$.rebind(var27, var24);
        }
        return Values.values(var26, var25);
    }
    
    public static SubLObject f36973(final SubLObject var9, final SubLObject var23) {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        final SubLObject var26;
        final SubLObject var25 = var26 = var23.first();
        if (var26.eql((SubLObject)$ic14$)) {
            SubLObject var27 = (SubLObject)NIL;
            final SubLObject var28 = var23.rest();
            SubLObject var29 = (SubLObject)NIL;
            if (NIL == var27) {
                SubLObject var30 = var28;
                SubLObject var31 = (SubLObject)NIL;
                var31 = var30.first();
                while (NIL == var27 && NIL != var30) {
                    final SubLObject var32 = f36973(var9, var31);
                    if (NIL != module0035.sublisp_boolean(var32)) {
                        if (NIL != f36974(var32)) {
                            var29 = (SubLObject)ConsesLow.cons(var32, var29);
                        }
                        else if (NIL != module0035.f2192((SubLObject)$ic15$, var32)) {
                            SubLObject var33 = var32;
                            SubLObject var34 = (SubLObject)NIL;
                            var34 = var33.first();
                            while (NIL != var33) {
                                var29 = (SubLObject)ConsesLow.cons(var34, var29);
                                var33 = var33.rest();
                                var34 = var33.first();
                            }
                        }
                        else {
                            var29 = (SubLObject)ConsesLow.cons(var32, var29);
                        }
                    }
                    else {
                        var27 = (SubLObject)T;
                    }
                    var30 = var30.rest();
                    var31 = var30.first();
                }
            }
            return (SubLObject)((NIL == var27) ? Sequences.nreverse(var29) : NIL);
        }
        if (var26.eql((SubLObject)$ic16$)) {
            SubLObject var35 = (SubLObject)NIL;
            final SubLObject var28 = var23.rest();
            SubLObject var29 = (SubLObject)NIL;
            if (NIL == var35) {
                SubLObject var30 = var28;
                SubLObject var31 = (SubLObject)NIL;
                var31 = var30.first();
                while (NIL == var35 && NIL != var30) {
                    final SubLObject var32 = f36973(var9, var31);
                    if (NIL != module0035.sublisp_boolean(var32)) {
                        if (NIL != f36974(var32)) {
                            var29 = (SubLObject)ConsesLow.cons(var32, var29);
                        }
                        else if (NIL != module0035.f2192((SubLObject)$ic15$, var32)) {
                            SubLObject var33 = var32;
                            SubLObject var34 = (SubLObject)NIL;
                            var34 = var33.first();
                            while (NIL != var33) {
                                var29 = (SubLObject)ConsesLow.cons(var34, var29);
                                var33 = var33.rest();
                                var34 = var33.first();
                            }
                        }
                        else {
                            var29 = (SubLObject)ConsesLow.cons(var32, var29);
                        }
                        var35 = (SubLObject)T;
                    }
                    var30 = var30.rest();
                    var31 = var30.first();
                }
            }
            return (SubLObject)((NIL != var35) ? Sequences.nreverse(var29) : NIL);
        }
        if (var26.eql((SubLObject)$ic17$)) {
            SubLObject var36 = (SubLObject)NIL;
            SubLObject var37 = (SubLObject)NIL;
            final SubLObject var38 = $g4677$.currentBinding(var24);
            try {
                $g4677$.bind((SubLObject)NIL, var24);
                var36 = f36973(var9, conses_high.second(var23));
                var37 = $g4677$.getDynamicValue(var24);
            }
            finally {
                $g4677$.rebind(var38, var24);
            }
            if (NIL == var36) {
                $g4677$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)$ic17$, var37), $g4677$.getDynamicValue(var24)), var24);
            }
            return (SubLObject)makeBoolean(NIL == var36);
        }
        final SubLObject var39 = f36970(var25);
        return Functions.apply(var39, (SubLObject)ConsesLow.cons(var9, var23.rest().rest()));
    }
    
    public static SubLObject f36974(final SubLObject var37) {
        return (SubLObject)makeBoolean(NIL != module0035.f2327(var37) && var37.first().isSymbol());
    }
    
    public static SubLObject f36975(final SubLObject var23) {
        final SubLObject var25;
        final SubLObject var24 = var25 = var23.first();
        if (var25.eql((SubLObject)$ic14$) || var25.eql((SubLObject)$ic16$)) {
            final SubLObject var26 = var23.rest();
            SubLObject var27 = (SubLObject)NIL;
            SubLObject var28 = var26;
            SubLObject var29 = (SubLObject)NIL;
            var29 = var28.first();
            while (NIL != var28) {
                SubLObject var6_40;
                final SubLObject var30 = var6_40 = f36975(var29);
                SubLObject var31 = (SubLObject)NIL;
                var31 = var6_40.first();
                while (NIL != var6_40) {
                    final SubLObject var32 = var31;
                    if (NIL == conses_high.member(var32, var27, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var27 = (SubLObject)ConsesLow.cons(var32, var27);
                    }
                    var6_40 = var6_40.rest();
                    var31 = var6_40.first();
                }
                var28 = var28.rest();
                var29 = var28.first();
            }
            return var27;
        }
        if (var25.eql((SubLObject)$ic17$)) {
            return f36975(conses_high.second(var23));
        }
        return (SubLObject)ConsesLow.list(var24);
    }
    
    public static SubLObject f36976(final SubLObject var23) {
        final SubLObject var24 = f36975(var23);
        SubLObject var25 = (SubLObject)NIL;
        SubLObject var26 = var24;
        SubLObject var27 = (SubLObject)NIL;
        var27 = var26.first();
        while (NIL != var26) {
            SubLObject var6_43;
            final SubLObject var28 = var6_43 = f36968(var27);
            SubLObject var29 = (SubLObject)NIL;
            var29 = var6_43.first();
            while (NIL != var6_43) {
                final SubLObject var30 = var29;
                if (NIL == conses_high.member(var30, var25, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var25 = (SubLObject)ConsesLow.cons(var30, var25);
                }
                var6_43 = var6_43.rest();
                var29 = var6_43.first();
            }
            var26 = var26.rest();
            var27 = var26.first();
        }
        return var25;
    }
    
    public static SubLObject f36977(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        $g4677$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)$ic18$, $g4677$.getDynamicValue(var10)), var10);
        return ConsesLow.append((SubLObject)ConsesLow.list((SubLObject)$ic19$, module0116.f8053(var9)), module0116.f8056(var9));
    }
    
    public static SubLObject f36978(final SubLObject var9, final SubLObject var44, final SubLObject var45) {
        final SubLThread var46 = SubLProcess.currentSubLThread();
        final SubLObject var47 = f36979(var9, var44, var45);
        if (NIL != var47) {
            $g4677$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)$ic22$, $g4677$.getDynamicValue(var46)), var46);
            return var47;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36980(final SubLObject var9, final SubLObject var47, final SubLObject var45, final SubLObject var48) {
        final SubLThread var49 = SubLProcess.currentSubLThread();
        final SubLObject var50 = f36981(var9, var47, var45, var48);
        if (NIL != var50) {
            $g4677$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)$ic26$, $g4677$.getDynamicValue(var49)), var49);
            return var50;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36982(final SubLObject var9, final SubLObject var44, final SubLObject var45) {
        final SubLThread var46 = SubLProcess.currentSubLThread();
        $g4677$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)$ic29$, $g4677$.getDynamicValue(var46)), var46);
        return module0116.f8056(var9);
    }
    
    public static SubLObject f36983(final SubLObject var9, final SubLObject var49, final SubLObject var45) {
        final SubLThread var50 = SubLProcess.currentSubLThread();
        final SubLObject var51 = f36984(var9, var49, var45);
        if (NIL != var51) {
            $g4677$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)$ic31$, $g4677$.getDynamicValue(var50)), var50);
            return var51;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36979(final SubLObject var9, SubLObject var44, SubLObject var45) {
        if (var45 == UNPROVIDED) {
            var45 = (SubLObject)$ic33$;
        }
        if (NIL == module0173.f10955(var44)) {
            var44 = module0172.f10921(var44);
            if (NIL == module0173.f10955(var44)) {
                return (SubLObject)NIL;
            }
        }
        final SubLObject var46 = module0116.f8053(var9);
        if (var46.eql((SubLObject)$ic34$)) {
            if (($ic33$ == var45 || $ic35$ == var45) && NIL != constant_handles_oc.f8449(var44) && constants_high_oc.f10757(var44).equalp(module0196.f12244(module0197.f12259(var9)))) {
                return (SubLObject)ConsesLow.list((SubLObject)$ic36$, (SubLObject)$ic37$, (SubLObject)$ic38$, (SubLObject)$ic39$, (SubLObject)$ic40$, var44, (SubLObject)$ic41$, var44);
            }
        }
        else if (var46.eql((SubLObject)$ic42$)) {
            if ($ic33$ == var45 || $ic43$ == var45) {
                final SubLObject var47 = module0196.f12244(module0197.f12268(var9));
                final SubLObject var48 = module0196.f12244(module0197.f12267(var9));
                if (NIL != module0205.f13220(var44, var47, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || var44.eql(var48)) {
                    return (SubLObject)ConsesLow.list(new SubLObject[] { $ic36$, $ic37$, $ic38$, $ic44$, $ic40$, var44, $ic45$, module0232.f15328(var47, (SubLObject)UNPROVIDED), $ic46$, var48 });
                }
            }
        }
        else if (var46.eql((SubLObject)$ic47$)) {
            if ($ic33$ == var45 || $ic48$ == var45) {
                final SubLObject var49 = module0571.f34996(module0197.f12272(var9));
                final SubLObject var48 = module0196.f12244(module0197.f12271(var9));
                if (NIL != module0205.f13220(var44, var49, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || var44.eql(var48)) {
                    return (SubLObject)ConsesLow.list(new SubLObject[] { $ic36$, $ic37$, $ic38$, $ic39$, $ic40$, var44, $ic45$, module0197.f12272(var9), $ic46$, var48 });
                }
            }
        }
        else if (var46.eql((SubLObject)$ic49$) && ($ic33$ == var45 || $ic35$ == var45) && NIL != module0167.f10813(var44) && module0172.f10915(var44).equalp(module0196.f12244(module0197.f12263(var9)))) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic36$, (SubLObject)$ic37$, (SubLObject)$ic38$, (SubLObject)$ic39$, (SubLObject)$ic40$, var44, (SubLObject)$ic41$, var44);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36981(final SubLObject var9, SubLObject var47, SubLObject var45, SubLObject var53) {
        if (var45 == UNPROVIDED) {
            var45 = (SubLObject)$ic33$;
        }
        if (var53 == UNPROVIDED) {
            var53 = (SubLObject)$ic50$;
        }
        if (NIL == module0173.f10955(var47)) {
            var47 = module0172.f10921(var47);
            if (NIL == module0173.f10955(var47)) {
                return (SubLObject)NIL;
            }
        }
        final SubLObject var54 = module0116.f8053(var9);
        if (var54.eql((SubLObject)$ic42$)) {
            if (var45 == $ic51$) {
                return (SubLObject)NIL;
            }
            final SubLObject var55 = module0196.f12244(module0197.f12268(var9));
            final SubLObject var56 = module0196.f12244(module0197.f12267(var9));
            final SubLObject var57 = module0232.f15308(var55);
            if (NIL != module0035.f1997(var57)) {
                final SubLObject var58 = var57.first();
                if (NIL != f36985(var58, var47, var56, var53)) {
                    final SubLObject var59 = module0205.f13203(var58, (SubLObject)UNPROVIDED);
                    return (SubLObject)ConsesLow.list((SubLObject)$ic36$, (SubLObject)$ic52$, (SubLObject)$ic38$, (SubLObject)$ic44$, (SubLObject)$ic53$, var47, (SubLObject)$ic54$, var59);
                }
            }
        }
        else if (var54.eql((SubLObject)$ic47$)) {
            if (var45 == $ic55$) {
                return (SubLObject)NIL;
            }
            if (NIL != module0197.f12270(var9)) {
                final SubLObject var60 = module0571.f34996(module0197.f12272(var9));
                final SubLObject var56 = module0196.f12244(module0197.f12271(var9));
                if (TWO_INTEGER.numE(module0202.f12725(var60, (SubLObject)UNPROVIDED)) && NIL != f36985(var60, var47, var56, var53)) {
                    final SubLObject var61 = module0205.f13203(var60, (SubLObject)UNPROVIDED);
                    return (SubLObject)ConsesLow.list((SubLObject)$ic36$, (SubLObject)$ic52$, (SubLObject)$ic38$, (SubLObject)$ic39$, (SubLObject)$ic53$, var47, (SubLObject)$ic41$, var61);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36985(final SubLObject var38, final SubLObject var47, final SubLObject var51, final SubLObject var53) {
        if (NIL != module0260.f17091(module0205.f13132(var38), $ic56$, var51, (SubLObject)UNPROVIDED)) {
            final SubLObject var54 = module0205.f13204(var38, (SubLObject)UNPROVIDED);
            if (var47.eql(var54)) {
                return (SubLObject)T;
            }
            if ($ic57$ != var53) {
                return module0256.f16596(module0205.f13204(var38, (SubLObject)UNPROVIDED), var47, var51, (SubLObject)UNPROVIDED);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36984(final SubLObject var9, final SubLObject var58, SubLObject var45) {
        if (var45 == UNPROVIDED) {
            var45 = (SubLObject)$ic58$;
        }
        final SubLObject var59 = module0162.f10630(var58);
        SubLObject var60 = (SubLObject)NIL;
        SubLObject var61 = (SubLObject)NIL;
        SubLObject var62 = (SubLObject)NIL;
        final SubLObject var63 = module0116.f8053(var9);
        if (var63.eql((SubLObject)$ic42$)) {
            var60 = module0162.f10630(module0196.f12244(module0197.f12267(var9)));
            var62 = module0232.f15328(module0196.f12244(module0197.f12268(var9)), (SubLObject)UNPROVIDED);
            var61 = (SubLObject)$ic59$;
        }
        else if (var63.eql((SubLObject)$ic47$)) {
            var60 = module0162.f10630(module0196.f12244(module0197.f12271(var9)));
            var62 = module0197.f12272(var9);
            var61 = (SubLObject)$ic60$;
        }
        else {
            var60 = (SubLObject)NIL;
        }
        if (NIL != module0161.f10499(var60)) {
            SubLObject var64 = (SubLObject)NIL;
            final SubLObject var65 = var45;
            if (var65.eql((SubLObject)$ic58$)) {
                var64 = module0161.f10514(var59, var60);
            }
            else if (var65.eql((SubLObject)$ic61$)) {
                var64 = module0262.f17336(var59, var60, var59, (SubLObject)UNPROVIDED);
            }
            else if (var65.eql((SubLObject)$ic62$)) {
                var64 = module0262.f17336(var60, var59, var60, (SubLObject)UNPROVIDED);
            }
            if (NIL != var64) {
                return (SubLObject)ConsesLow.list((SubLObject)$ic36$, (SubLObject)$ic63$, (SubLObject)$ic38$, var61, (SubLObject)$ic64$, var60, (SubLObject)$ic45$, var62);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36986(final SubLObject var63, final SubLObject var64) {
        f36987(var63, var64, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36988(final SubLObject var63) {
        return (SubLObject)((var63.getClass() == $sX40768_native.class) ? T : NIL);
    }
    
    public static SubLObject f36989(final SubLObject var63) {
        assert NIL != f36988(var63) : var63;
        return var63.getField2();
    }
    
    public static SubLObject f36990(final SubLObject var63) {
        assert NIL != f36988(var63) : var63;
        return var63.getField3();
    }
    
    public static SubLObject f36991(final SubLObject var63, final SubLObject var66) {
        assert NIL != f36988(var63) : var63;
        return var63.setField2(var66);
    }
    
    public static SubLObject f36992(final SubLObject var63, final SubLObject var66) {
        assert NIL != f36988(var63) : var63;
        return var63.setField3(var66);
    }
    
    public static SubLObject f36993(SubLObject var67) {
        if (var67 == UNPROVIDED) {
            var67 = (SubLObject)NIL;
        }
        final SubLObject var68 = (SubLObject)new $sX40768_native();
        SubLObject var69;
        SubLObject var70;
        SubLObject var71;
        SubLObject var72;
        for (var69 = (SubLObject)NIL, var69 = var67; NIL != var69; var69 = conses_high.cddr(var69)) {
            var70 = var69.first();
            var71 = conses_high.cadr(var69);
            var72 = var70;
            if (var72.eql((SubLObject)$ic78$)) {
                f36991(var68, var71);
            }
            else if (var72.eql((SubLObject)$ic79$)) {
                f36992(var68, var71);
            }
            else {
                Errors.error((SubLObject)$ic80$, var70);
            }
        }
        return var68;
    }
    
    public static SubLObject f36994(final SubLObject var72, final SubLObject var73) {
        Functions.funcall(var73, var72, (SubLObject)$ic81$, (SubLObject)$ic82$, (SubLObject)TWO_INTEGER);
        Functions.funcall(var73, var72, (SubLObject)$ic83$, (SubLObject)$ic78$, f36989(var72));
        Functions.funcall(var73, var72, (SubLObject)$ic83$, (SubLObject)$ic79$, f36990(var72));
        Functions.funcall(var73, var72, (SubLObject)$ic84$, (SubLObject)$ic82$, (SubLObject)TWO_INTEGER);
        return var72;
    }
    
    public static SubLObject f36995(final SubLObject var72, final SubLObject var73) {
        return f36994(var72, var73);
    }
    
    public static SubLObject f36987(final SubLObject var74, final SubLObject var64, final SubLObject var75) {
        final SubLThread var76 = SubLProcess.currentSubLThread();
        if (NIL != print_high.$print_readably$.getDynamicValue(var76)) {
            print_high.print_not_readable(var74, var64);
        }
        else {
            streams_high.write_string((SubLObject)$ic86$, var64, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var74), new SubLObject[] { $ic87$, var64 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var64);
            streams_high.write_string((SubLObject)$ic88$, var64, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.prin1(f36989(var74), var64);
            streams_high.write_string((SubLObject)$ic89$, var64, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.prin1(f36990(var74), var64);
            streams_high.write_char((SubLObject)Characters.CHAR_space, var64);
            PrintLow.write(Equality.pointer(var74), new SubLObject[] { $ic87$, var64, $ic90$, SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var64);
        }
        return var74;
    }
    
    public static SubLObject f36996(final SubLObject var80, final SubLObject var81) {
        final SubLObject var82 = f36993((SubLObject)UNPROVIDED);
        f36991(var82, var80);
        f36992(var82, var81);
        return var82;
    }
    
    public static SubLObject f36997(final SubLObject var83) {
        return (SubLObject)makeBoolean(NIL != f36988(var83) && f36989(var83).isPositive());
    }
    
    public static SubLObject f36998(final SubLObject var82) {
        f36992(var82, (SubLObject)NIL);
        f36991(var82, (SubLObject)MINUS_ONE_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36999(SubLObject var64) {
        if (var64 == UNPROVIDED) {
            var64 = (SubLObject)T;
        }
        streams_high.terpri(var64);
        print_high.princ((SubLObject)$ic95$, var64);
        streams_high.terpri(var64);
        final SubLObject var65 = $g4680$.getGlobalValue();
        SubLObject var66 = (SubLObject)NIL;
        try {
            var66 = Locks.seize_lock(var65);
            module0084.f5789($g4679$.getGlobalValue(), var64);
        }
        finally {
            if (NIL != var66) {
                Locks.release_lock(var65);
            }
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f37000() {
        $g4679$.setGlobalValue(module0067.f4880(Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)UNPROVIDED));
        return (SubLObject)T;
    }
    
    public static SubLObject f37001(final SubLObject var80) {
        SubLObject var81 = (SubLObject)NIL;
        final SubLObject var82 = $g4680$.getGlobalValue();
        SubLObject var83 = (SubLObject)NIL;
        try {
            var83 = Locks.seize_lock(var82);
            var81 = module0067.f4884($g4679$.getGlobalValue(), var80, (SubLObject)UNPROVIDED);
        }
        finally {
            if (NIL != var83) {
                Locks.release_lock(var82);
            }
        }
        return var81;
    }
    
    public static SubLObject f37002(final SubLObject var80) {
        return (SubLObject)makeBoolean(var80.isFixnum() && var80.isPositive() && NIL != f36988(f37001(var80)));
    }
    
    public static SubLObject f37003(final SubLObject var81) {
        SubLObject var82 = (SubLObject)NIL;
        final SubLObject var83 = $g4680$.getGlobalValue();
        SubLObject var84 = (SubLObject)NIL;
        try {
            var84 = Locks.seize_lock(var83);
            var82 = module0067.f4884($g4679$.getGlobalValue(), var81, (SubLObject)MINUS_ONE_INTEGER);
        }
        finally {
            if (NIL != var84) {
                Locks.release_lock(var83);
            }
        }
        return var82;
    }
    
    public static SubLObject f37004(final SubLObject var81) {
        SubLObject var82 = (SubLObject)NIL;
        final SubLObject var83 = $g4680$.getGlobalValue();
        SubLObject var84 = (SubLObject)NIL;
        try {
            var84 = Locks.seize_lock(var83);
            var82 = f37003(var81);
            if (var82.isNegative()) {
                var82 = module0057.f4175($g4681$.getGlobalValue());
                module0067.f4886($g4679$.getGlobalValue(), var81, var82);
                module0067.f4886($g4679$.getGlobalValue(), var82, f36996(var82, var81));
            }
        }
        finally {
            if (NIL != var84) {
                Locks.release_lock(var83);
            }
        }
        return var82;
    }
    
    public static SubLObject f37005(final SubLObject var92) {
        final SubLObject var93 = $g4680$.getGlobalValue();
        SubLObject var94 = (SubLObject)NIL;
        try {
            var94 = Locks.seize_lock(var93);
            final SubLObject var95 = module0067.f4884($g4679$.getGlobalValue(), var92, (SubLObject)UNPROVIDED);
            module0067.f4887($g4679$.getGlobalValue(), f36990(var95));
            module0067.f4887($g4679$.getGlobalValue(), var92);
            f36998(var95);
        }
        finally {
            if (NIL != var94) {
                Locks.release_lock(var93);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37006() {
        SubLObject var95 = (SubLObject)NIL;
        final SubLObject var96 = $g4680$.getGlobalValue();
        SubLObject var97 = (SubLObject)NIL;
        try {
            var97 = Locks.seize_lock(var96);
            var95 = module0035.remove_if_not(Symbols.symbol_function((SubLObject)$ic98$), module0067.f4902($g4679$.getGlobalValue()), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            if (NIL != var97) {
                Locks.release_lock(var96);
            }
        }
        return var95;
    }
    
    public static SubLObject f37007(SubLObject var64) {
        if (var64 == UNPROVIDED) {
            var64 = (SubLObject)T;
        }
        streams_high.terpri(var64);
        print_high.princ((SubLObject)$ic103$, var64);
        streams_high.terpri(var64);
        final SubLObject var65 = $g4683$.getGlobalValue();
        SubLObject var66 = (SubLObject)NIL;
        try {
            var66 = Locks.seize_lock(var65);
            module0084.f5789($g4682$.getGlobalValue(), (SubLObject)UNPROVIDED);
        }
        finally {
            if (NIL != var66) {
                Locks.release_lock(var65);
            }
        }
        print_high.princ((SubLObject)$ic104$, var64);
        streams_high.terpri(var64);
        final SubLObject var67 = $g4683$.getGlobalValue();
        SubLObject var68 = (SubLObject)NIL;
        try {
            var68 = Locks.seize_lock(var67);
            module0084.f5789($g4684$.getGlobalValue(), (SubLObject)UNPROVIDED);
        }
        finally {
            if (NIL != var68) {
                Locks.release_lock(var67);
            }
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f37008(final SubLObject var1) {
        assert NIL != f36988(var1) : var1;
        final SubLObject var2 = f36990(var1);
        final SubLObject var3 = f36976(var2);
        SubLObject var4 = (SubLObject)NIL;
        final SubLObject var5 = $g4683$.getGlobalValue();
        SubLObject var6 = (SubLObject)NIL;
        try {
            var6 = Locks.seize_lock(var5);
            module0067.f4886($g4682$.getGlobalValue(), f36989(var1), var3);
            SubLObject var7 = var3;
            SubLObject var8 = (SubLObject)NIL;
            var8 = var7.first();
            while (NIL != var7) {
                if ($ic105$ == module0067.f4884($g4682$.getGlobalValue(), var8, (SubLObject)$ic105$)) {
                    var4 = (SubLObject)ConsesLow.cons(var8, var4);
                }
                module0084.f5762($g4682$.getGlobalValue(), var8, var1);
                var7 = var7.rest();
                var8 = var7.first();
            }
            var7 = var4;
            SubLObject var9 = (SubLObject)NIL;
            var9 = var7.first();
            while (NIL != var7) {
                final SubLObject var10 = module0117.f8104(var9, (SubLObject)$ic106$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0197.f12336(var10);
                module0067.f4886($g4684$.getGlobalValue(), var9, var10);
                var7 = var7.rest();
                var9 = var7.first();
            }
        }
        finally {
            if (NIL != var6) {
                Locks.release_lock(var5);
            }
        }
        if (NIL != var4) {
            module0197.f12334();
        }
        return var4;
    }
    
    public static SubLObject f37009(final SubLObject var1) {
        assert NIL != f36988(var1) : var1;
        SubLObject var2 = (SubLObject)NIL;
        final SubLObject var3 = $g4683$.getGlobalValue();
        SubLObject var4 = (SubLObject)NIL;
        try {
            var4 = Locks.seize_lock(var3);
            final SubLObject var5 = module0067.f4884($g4682$.getGlobalValue(), f36989(var1), (SubLObject)UNPROVIDED);
            module0067.f4887($g4682$.getGlobalValue(), f36989(var1));
            SubLObject var6 = var5;
            SubLObject var7 = (SubLObject)NIL;
            var7 = var6.first();
            while (NIL != var6) {
                module0084.f5772($g4682$.getGlobalValue(), var7, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL == module0067.f4884($g4682$.getGlobalValue(), var7, (SubLObject)UNPROVIDED)) {
                    var2 = (SubLObject)ConsesLow.cons(var7, var2);
                }
                var6 = var6.rest();
                var7 = var6.first();
            }
            var6 = var2;
            SubLObject var8 = (SubLObject)NIL;
            var8 = var6.first();
            while (NIL != var6) {
                final SubLObject var9 = module0067.f4884($g4684$.getGlobalValue(), var8, (SubLObject)$ic105$);
                module0067.f4887($g4684$.getGlobalValue(), var8);
                if ($ic105$ != var9) {
                    module0197.f12337(var9);
                }
                var6 = var6.rest();
                var8 = var6.first();
            }
        }
        finally {
            if (NIL != var4) {
                Locks.release_lock(var3);
            }
        }
        return var2;
    }
    
    public static SubLObject f37010(final SubLObject var112) {
        SubLObject var113 = (SubLObject)NIL;
        final SubLObject var114 = $g4683$.getGlobalValue();
        SubLObject var115 = (SubLObject)NIL;
        try {
            var115 = Locks.seize_lock(var114);
            var113 = module0067.f4884($g4682$.getGlobalValue(), var112, (SubLObject)UNPROVIDED);
        }
        finally {
            if (NIL != var115) {
                Locks.release_lock(var114);
            }
        }
        return var113;
    }
    
    public static SubLObject f37011(final SubLObject var107, final SubLObject var1, final SubLObject var9, final SubLObject var26, final SubLObject var115) {
        final SubLObject var116 = (SubLObject)ConsesLow.list(new SubLObject[] { $ic107$, var107, $ic108$, ConsesLow.list(var1), $ic109$, module0116.f8054(var9), $ic110$, var26, $ic111$, module0116.f8053(var9), $ic112$, var115 });
        final SubLObject var117 = module0116.f8064((SubLObject)$ic113$, var116, module0116.f8055(var9));
        return module0117.f8161(var117, f37012());
    }
    
    public static SubLObject f37013(final SubLObject var118) {
        assert NIL != module0116.f8052(var118) : var118;
        if (module0116.f8053(var118) != $ic113$ && NIL == module0118.f8204(var118)) {
            Errors.error((SubLObject)$ic115$, var118, module0116.f8053(var118), (SubLObject)$ic113$);
        }
        return conses_high.getf(module0116.f8056(var118), (SubLObject)$ic111$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37014(final SubLObject var118) {
        assert NIL != module0116.f8052(var118) : var118;
        if (module0116.f8053(var118) != $ic113$ && NIL == module0118.f8204(var118)) {
            Errors.error((SubLObject)$ic115$, var118, module0116.f8053(var118), (SubLObject)$ic113$);
        }
        return conses_high.getf(module0116.f8056(var118), (SubLObject)$ic112$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37015(final SubLObject var118) {
        assert NIL != module0116.f8052(var118) : var118;
        if (module0116.f8053(var118) != $ic113$ && NIL == module0118.f8204(var118)) {
            Errors.error((SubLObject)$ic115$, var118, module0116.f8053(var118), (SubLObject)$ic113$);
        }
        return conses_high.getf(module0116.f8056(var118), (SubLObject)$ic110$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37016(final SubLObject var118) {
        assert NIL != module0116.f8052(var118) : var118;
        if (module0116.f8053(var118) != $ic113$ && NIL == module0118.f8204(var118)) {
            Errors.error((SubLObject)$ic115$, var118, module0116.f8053(var118), (SubLObject)$ic113$);
        }
        return conses_high.getf(module0116.f8056(var118), (SubLObject)$ic109$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37017(final SubLObject var118) {
        assert NIL != module0116.f8052(var118) : var118;
        if (module0116.f8053(var118) != $ic113$ && NIL == module0118.f8204(var118)) {
            Errors.error((SubLObject)$ic115$, var118, module0116.f8053(var118), (SubLObject)$ic113$);
        }
        return conses_high.getf(module0116.f8056(var118), (SubLObject)$ic108$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37018(final SubLObject var118) {
        assert NIL != module0116.f8052(var118) : var118;
        if (module0116.f8053(var118) != $ic113$ && NIL == module0118.f8204(var118)) {
            Errors.error((SubLObject)$ic115$, var118, module0116.f8053(var118), (SubLObject)$ic113$);
        }
        return conses_high.getf(module0116.f8056(var118), (SubLObject)$ic107$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37019(final SubLObject var9, final SubLObject var119) {
        final SubLThread var120 = SubLProcess.currentSubLThread();
        if (NIL == module0118.f8204(var9)) {
            SubLObject var121 = f37010(module0116.f8053(var9));
            SubLObject var122 = (SubLObject)NIL;
            var122 = var121.first();
            while (NIL != var121) {
                var120.resetMultipleValues();
                final SubLObject var123 = f36972(var9, f36990(var122));
                final SubLObject var124 = var120.secondMultipleValue();
                var120.resetMultipleValues();
                if (NIL != var123) {
                    final SubLObject var125 = f36989(var122);
                    SubLObject var6_121;
                    final SubLObject var126 = var6_121 = f37020(var125);
                    SubLObject var127 = (SubLObject)NIL;
                    var127 = var6_121.first();
                    while (NIL != var6_121) {
                        f37011(var127, var122, var9, var123, var124);
                        var6_121 = var6_121.rest();
                        var127 = var6_121.first();
                    }
                }
                var121 = var121.rest();
                var122 = var121.first();
            }
        }
        return var9;
    }
    
    public static SubLObject f37021(final SubLObject var107, final SubLObject var116, final SubLObject var122) {
        final SubLObject var123 = Structures.method_func(var107, $g4685$.getGlobalValue());
        if (NIL != var123) {
            return Functions.funcall(var123, var107, var116, var122);
        }
        return Errors.error((SubLObject)$ic117$, (SubLObject)Types.type_of(var107));
    }
    
    public static SubLObject f37012() {
        return module0197.f12332();
    }
    
    public static SubLObject f37022(final SubLObject var124) {
        final SubLObject var125 = module0038.f2752(Strings.string_downcase(Symbols.symbol_name(var124), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)$ic121$);
        if (NIL != module0035.f1997(var125)) {
            return var125.first();
        }
        SubLObject var126 = (SubLObject)NIL;
        SubLObject var127 = (SubLObject)NIL;
        SubLObject var128 = (SubLObject)NIL;
        var126 = var125;
        var127 = var126.first();
        for (var128 = (SubLObject)ZERO_INTEGER; NIL != var126; var126 = var126.rest(), var127 = var126.first(), var128 = Numbers.add((SubLObject)ONE_INTEGER, var128)) {
            if (!var128.isZero()) {
                Strings.set_char(var127, (SubLObject)ZERO_INTEGER, Characters.char_upcase(Strings.sublisp_char(var127, (SubLObject)ZERO_INTEGER)));
            }
        }
        return Functions.apply(Symbols.symbol_function((SubLObject)$ic122$), var125);
    }
    
    public static SubLObject f37023(final SubLObject var22, final SubLObject var9, final SubLObject var64, SubLObject var129) {
        if (var129 == UNPROVIDED) {
            var129 = (SubLObject)T;
        }
        final SubLThread var130 = SubLProcess.currentSubLThread();
        final SubLObject var131 = module0587.$g4457$.currentBinding(var130);
        try {
            module0587.$g4457$.bind(var64, var130);
            final SubLObject var132 = f37015(var9);
            module0601.f36796(var64);
            module0601.f36797((SubLObject)$ic123$, (SubLObject)$ic124$, var64);
            try {
                final SubLObject var27_130 = module0601.$g4652$.currentBinding(var130);
                final SubLObject var133 = module0601.$g4654$.currentBinding(var130);
                try {
                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var130), module0601.$g4652$.getDynamicValue(var130)), var130);
                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var130), var130);
                    module0601.f36758((SubLObject)$ic123$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                    try {
                        final SubLObject var27_131 = module0601.$g4652$.currentBinding(var130);
                        final SubLObject var131_133 = module0601.$g4654$.currentBinding(var130);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var130), module0601.$g4652$.getDynamicValue(var130)), var130);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var130), var130);
                            module0601.f36758((SubLObject)$ic125$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                            try {
                                final SubLObject var27_132 = module0601.$g4652$.currentBinding(var130);
                                final SubLObject var131_134 = module0601.$g4654$.currentBinding(var130);
                                try {
                                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var130), module0601.$g4652$.getDynamicValue(var130)), var130);
                                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var130), var130);
                                    module0601.f36758((SubLObject)$ic126$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                    try {
                                        final SubLObject var27_133 = module0601.$g4652$.currentBinding(var130);
                                        final SubLObject var131_135 = module0601.$g4654$.currentBinding(var130);
                                        try {
                                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var130), module0601.$g4652$.getDynamicValue(var130)), var130);
                                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var130), var130);
                                            module0601.f36758((SubLObject)$ic127$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                            SubLObject var134 = var22;
                                            SubLObject var135 = (SubLObject)NIL;
                                            var135 = var134.first();
                                            while (NIL != var134) {
                                                try {
                                                    final SubLObject var27_134 = module0601.$g4652$.currentBinding(var130);
                                                    final SubLObject var131_136 = module0601.$g4654$.currentBinding(var130);
                                                    try {
                                                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var130), module0601.$g4652$.getDynamicValue(var130)), var130);
                                                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var130), var130);
                                                        module0601.f36758((SubLObject)$ic128$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                                        print_high.princ(f36989(var135), var64);
                                                    }
                                                    finally {
                                                        module0601.$g4654$.rebind(var131_136, var130);
                                                        module0601.$g4652$.rebind(var27_134, var130);
                                                    }
                                                }
                                                finally {
                                                    final SubLObject var27_135 = Threads.$is_thread_performing_cleanupP$.currentBinding(var130);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var130);
                                                        module0601.f36746();
                                                        module0601.f36760((SubLObject)$ic128$);
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(var27_135, var130);
                                                    }
                                                }
                                                var134 = var134.rest();
                                                var135 = var134.first();
                                            }
                                        }
                                        finally {
                                            module0601.$g4654$.rebind(var131_135, var130);
                                            module0601.$g4652$.rebind(var27_133, var130);
                                        }
                                    }
                                    finally {
                                        final SubLObject var27_136 = Threads.$is_thread_performing_cleanupP$.currentBinding(var130);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var130);
                                            module0601.f36746();
                                            module0601.f36760((SubLObject)$ic127$);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var27_136, var130);
                                        }
                                    }
                                    final SubLObject var136 = (SubLObject)ConsesLow.list((SubLObject)$ic129$, module0116.f8054(var9));
                                    if (var132.first().isSymbol()) {
                                        f37024(var136, var132);
                                    }
                                    else {
                                        try {
                                            final SubLObject var27_137 = module0601.$g4652$.currentBinding(var130);
                                            final SubLObject var131_137 = module0601.$g4654$.currentBinding(var130);
                                            try {
                                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var130), module0601.$g4652$.getDynamicValue(var130)), var130);
                                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var130), var130);
                                                module0601.f36758((SubLObject)$ic130$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                                SubLObject var137 = var132;
                                                SubLObject var138 = (SubLObject)NIL;
                                                var138 = var137.first();
                                                while (NIL != var137) {
                                                    f37024(var136, var138);
                                                    var137 = var137.rest();
                                                    var138 = var137.first();
                                                }
                                            }
                                            finally {
                                                module0601.$g4654$.rebind(var131_137, var130);
                                                module0601.$g4652$.rebind(var27_137, var130);
                                            }
                                        }
                                        finally {
                                            final SubLObject var27_138 = Threads.$is_thread_performing_cleanupP$.currentBinding(var130);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var130);
                                                module0601.f36746();
                                                module0601.f36760((SubLObject)$ic130$);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var27_138, var130);
                                            }
                                        }
                                    }
                                }
                                finally {
                                    module0601.$g4654$.rebind(var131_134, var130);
                                    module0601.$g4652$.rebind(var27_132, var130);
                                }
                            }
                            finally {
                                final SubLObject var27_139 = Threads.$is_thread_performing_cleanupP$.currentBinding(var130);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var130);
                                    module0601.f36746();
                                    module0601.f36760((SubLObject)$ic126$);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var27_139, var130);
                                }
                            }
                        }
                        finally {
                            module0601.$g4654$.rebind(var131_133, var130);
                            module0601.$g4652$.rebind(var27_131, var130);
                        }
                    }
                    finally {
                        final SubLObject var27_140 = Threads.$is_thread_performing_cleanupP$.currentBinding(var130);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var130);
                            module0601.f36746();
                            module0601.f36760((SubLObject)$ic125$);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var27_140, var130);
                        }
                    }
                }
                finally {
                    module0601.$g4654$.rebind(var133, var130);
                    module0601.$g4652$.rebind(var27_130, var130);
                }
            }
            finally {
                final SubLObject var27_141 = Threads.$is_thread_performing_cleanupP$.currentBinding(var130);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var130);
                    module0601.f36746();
                    module0601.f36760((SubLObject)$ic123$);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var27_141, var130);
                }
            }
        }
        finally {
            module0587.$g4457$.rebind(var131, var130);
        }
        return var9;
    }
    
    public static SubLObject f37024(final SubLObject var142, final SubLObject var46) {
        final SubLThread var143 = SubLProcess.currentSubLThread();
        try {
            final SubLObject var144 = module0601.$g4652$.currentBinding(var143);
            final SubLObject var145 = module0601.$g4654$.currentBinding(var143);
            try {
                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var143), module0601.$g4652$.getDynamicValue(var143)), var143);
                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var143), var143);
                module0601.f36758((SubLObject)$ic131$, var142, (SubLObject)NIL, (SubLObject)NIL);
                SubLObject var146;
                SubLObject var147;
                SubLObject var148;
                SubLObject var149;
                SubLObject var27_153;
                SubLObject var131_154;
                SubLObject var150;
                SubLObject var27_154;
                SubLObject var131_155;
                SubLObject var27_155;
                for (var146 = (SubLObject)NIL, var146 = var46; NIL != var146; var146 = conses_high.cddr(var146)) {
                    var147 = var146.first();
                    var148 = conses_high.cadr(var146);
                    var149 = f37022(var147);
                    try {
                        var27_153 = module0601.$g4652$.currentBinding(var143);
                        var131_154 = module0601.$g4654$.currentBinding(var143);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var143), module0601.$g4652$.getDynamicValue(var143)), var143);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var143), var143);
                            module0601.f36758(var149, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                            if (var148.isKeyword()) {
                                var150 = f37022(var148);
                                var27_154 = module0601.$g4652$.currentBinding(var143);
                                var131_155 = module0601.$g4654$.currentBinding(var143);
                                try {
                                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var143), module0601.$g4652$.getDynamicValue(var143)), var143);
                                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var143), var143);
                                    module0601.f36758(var150, (SubLObject)NIL, (SubLObject)T, (SubLObject)NIL);
                                }
                                finally {
                                    module0601.$g4654$.rebind(var131_155, var143);
                                    module0601.$g4652$.rebind(var27_154, var143);
                                }
                            }
                            else {
                                f37025(var148);
                            }
                        }
                        finally {
                            module0601.$g4654$.rebind(var131_154, var143);
                            module0601.$g4652$.rebind(var27_153, var143);
                        }
                    }
                    finally {
                        var27_155 = Threads.$is_thread_performing_cleanupP$.currentBinding(var143);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var143);
                            module0601.f36746();
                            module0601.f36760(var149);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var27_155, var143);
                        }
                    }
                }
            }
            finally {
                module0601.$g4654$.rebind(var145, var143);
                module0601.$g4652$.rebind(var144, var143);
            }
        }
        finally {
            final SubLObject var151 = Threads.$is_thread_performing_cleanupP$.currentBinding(var143);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var143);
                module0601.f36746();
                module0601.f36760((SubLObject)$ic131$);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var151, var143);
            }
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f37025(final SubLObject var151) {
        if (NIL != module0035.f2428((SubLObject)$ic132$, var151, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            module0797.f50975(var151);
        }
        else {
            module0797.f50965(var151);
        }
        return var151;
    }
    
    public static SubLObject f37026(final SubLObject var9, final SubLObject var119) {
        final SubLThread var120 = SubLProcess.currentSubLThread();
        if (NIL == module0118.f8204(var9)) {
            final SubLObject var121 = f37018(var9);
            final SubLObject var122 = f37017(var9);
            SubLObject var123 = (SubLObject)NIL;
            SubLObject var124 = (SubLObject)NIL;
            SubLObject var125 = (SubLObject)NIL;
            try {
                var125 = streams_high.make_private_string_output_stream();
                f37023(var122, var9, var125, (SubLObject)UNPROVIDED);
                var124 = streams_high.get_output_stream_string(var125);
            }
            finally {
                final SubLObject var126 = Threads.$is_thread_performing_cleanupP$.currentBinding(var120);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var120);
                    streams_high.close(var125, (SubLObject)UNPROVIDED);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var126, var120);
                }
            }
            try {
                var120.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var127 = Errors.$error_handler$.currentBinding(var120);
                try {
                    Errors.$error_handler$.bind((SubLObject)$ic133$, var120);
                    try {
                        f37021(var121, var124, $g4687$.getGlobalValue());
                    }
                    catch (Throwable var128) {
                        Errors.handleThrowable(var128, (SubLObject)NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var127, var120);
                }
            }
            catch (Throwable var129) {
                var123 = Errors.handleThrowable(var129, module0003.$g3$.getGlobalValue());
            }
            finally {
                var120.throwStack.pop();
            }
            if (NIL != var123) {
                Errors.warn((SubLObject)$ic134$, new SubLObject[] { var9, var121, var123, var121 });
                f37027(f37028(var121));
            }
        }
        return var9;
    }
    
    public static SubLObject f37029(SubLObject var64) {
        if (var64 == UNPROVIDED) {
            var64 = (SubLObject)T;
        }
        streams_high.terpri(var64);
        print_high.princ((SubLObject)$ic139$, (SubLObject)UNPROVIDED);
        streams_high.terpri(var64);
        final SubLObject var65 = $g4689$.getGlobalValue();
        SubLObject var66 = (SubLObject)NIL;
        try {
            var66 = Locks.seize_lock(var65);
            module0084.f5789($g4688$.getGlobalValue(), var64);
        }
        finally {
            if (NIL != var66) {
                Locks.release_lock(var65);
            }
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f37030() {
        $g4688$.setGlobalValue(module0067.f4880(Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)UNPROVIDED));
        return (SubLObject)T;
    }
    
    public static SubLObject f37031(final SubLObject var107) {
        final SubLObject var108 = Structures.method_func(var107, $g4691$.getGlobalValue());
        if (NIL != var108) {
            return Functions.funcall(var108, var107);
        }
        return var107;
    }
    
    public static SubLObject f37032(final SubLObject var107) {
        final SubLObject var108 = Structures.method_func(var107, $g4692$.getGlobalValue());
        if (NIL != var108) {
            return Functions.funcall(var108, var107);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37033(final SubLObject var107) {
        final SubLObject var108 = Structures.method_func(var107, $g4693$.getGlobalValue());
        if (NIL != var108) {
            return Functions.funcall(var108, var107);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37034(final SubLObject var107) {
        final SubLObject var108 = Structures.method_func(var107, $g4694$.getGlobalValue());
        if (NIL != var108) {
            return Functions.funcall(var108, var107);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37035(final SubLObject var74) {
        return (SubLObject)makeBoolean(NIL != f37032(var74) && NIL != f37033(var74));
    }
    
    public static SubLObject f37036(final SubLObject var80) {
        return (SubLObject)makeBoolean(var80.isFixnum() && var80.isPositive() && NIL != f37032(f37037(var80)));
    }
    
    public static SubLObject f37038(final SubLObject var107) {
        SubLObject var108 = (SubLObject)NIL;
        final SubLObject var109 = $g4689$.getGlobalValue();
        SubLObject var110 = (SubLObject)NIL;
        try {
            var110 = Locks.seize_lock(var109);
            final SubLObject var111 = f37031(var107);
            var108 = module0067.f4884($g4688$.getGlobalValue(), var111, (SubLObject)MINUS_ONE_INTEGER);
            if (!var108.isNegative()) {
                f37027(var108);
            }
            var108 = module0057.f4175($g4690$.getGlobalValue());
            module0067.f4886($g4688$.getGlobalValue(), var111, var108);
            module0067.f4886($g4688$.getGlobalValue(), var108, var107);
        }
        finally {
            if (NIL != var110) {
                Locks.release_lock(var109);
            }
        }
        return var108;
    }
    
    public static SubLObject f37027(final SubLObject var172) {
        final SubLObject var173 = $g4689$.getGlobalValue();
        SubLObject var174 = (SubLObject)NIL;
        try {
            var174 = Locks.seize_lock(var173);
            SubLObject var175 = module0067.f4884($g4688$.getGlobalValue(), var172, (SubLObject)UNPROVIDED);
            if (NIL != f37032(var175)) {
                f37039(var175);
                final SubLObject var176 = f37031(var175);
                module0067.f4887($g4688$.getGlobalValue(), var172);
                module0067.f4887($g4688$.getGlobalValue(), var176);
                var175 = f37034(var175);
            }
        }
        finally {
            if (NIL != var174) {
                Locks.release_lock(var173);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37040() {
        SubLObject var120 = (SubLObject)NIL;
        final SubLObject var121 = $g4689$.getGlobalValue();
        SubLObject var122 = (SubLObject)NIL;
        try {
            var122 = Locks.seize_lock(var121);
            var120 = module0035.remove_if_not(Symbols.symbol_function((SubLObject)$ic98$), module0067.f4902($g4688$.getGlobalValue()), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            if (NIL != var122) {
                Locks.release_lock(var121);
            }
        }
        return var120;
    }
    
    public static SubLObject f37037(final SubLObject var80) {
        SubLObject var81 = (SubLObject)NIL;
        final SubLObject var82 = $g4689$.getGlobalValue();
        SubLObject var83 = (SubLObject)NIL;
        try {
            var83 = Locks.seize_lock(var82);
            var81 = module0067.f4884($g4688$.getGlobalValue(), var80, (SubLObject)UNPROVIDED);
        }
        finally {
            if (NIL != var83) {
                Locks.release_lock(var82);
            }
        }
        return var81;
    }
    
    public static SubLObject f37028(final SubLObject var107) {
        SubLObject var108 = (SubLObject)NIL;
        final SubLObject var109 = $g4689$.getGlobalValue();
        SubLObject var110 = (SubLObject)NIL;
        try {
            var110 = Locks.seize_lock(var109);
            var108 = module0067.f4884($g4688$.getGlobalValue(), f37031(var107), (SubLObject)UNPROVIDED);
        }
        finally {
            if (NIL != var110) {
                Locks.release_lock(var109);
            }
        }
        return var108;
    }
    
    public static SubLObject f37041(final SubLObject var107, final SubLObject var116, final SubLObject var122) {
        return f37042(var107, var116, var122);
    }
    
    public static SubLObject f37043(final SubLObject var107) {
        return f37044(var107);
    }
    
    public static SubLObject f37045(final SubLObject var107) {
        return (SubLObject)T;
    }
    
    public static SubLObject f37046(final SubLObject var107) {
        return f37047(var107);
    }
    
    public static SubLObject f37048(final SubLObject var107) {
        return f37049(var107);
    }
    
    public static SubLObject f37044(final SubLObject var107) {
        return (SubLObject)ConsesLow.cons(module0117.f8078(var107), module0117.f8079(var107));
    }
    
    public static SubLObject f37047(final SubLObject var107) {
        return (SubLObject)makeBoolean(module0117.f8078(var107).isString() && module0117.f8079(var107).isFixnum());
    }
    
    public static SubLObject f37049(final SubLObject var107) {
        module0117.f8081(var107, (SubLObject)NIL);
        module0117.f8082(var107, (SubLObject)NIL);
        return var107;
    }
    
    public static SubLObject f37042(final SubLObject var182, final SubLObject var116, final SubLObject var122) {
        final SubLObject var183 = module0117.f8078(var182);
        final SubLObject var184 = module0117.f8079(var182);
        SubLObject var185 = (SubLObject)NIL;
        try {
            var185 = module0004.f82(var183, var184, var122, (SubLObject)$ic146$);
            if (NIL != module0003.f70(var185, var183, var184)) {
                if (NIL != $g4695$.getGlobalValue()) {
                    Errors.warn((SubLObject)$ic147$, new SubLObject[] { Threads.current_process(), var183, var184, var116 });
                }
                streams_high.write_string(var116, var185, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                streams_high.force_output(var185);
            }
        }
        finally {
            final SubLObject var186 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                if (NIL != var185) {
                    streams_high.close(var185, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var186);
            }
        }
        return var182;
    }
    
    public static SubLObject f37050(final SubLObject var183, final SubLObject var184, SubLObject var185) {
        if (var185 == UNPROVIDED) {
            var185 = (SubLObject)NIL;
        }
        assert NIL != Types.stringp(var183) : var183;
        assert NIL != Numbers.plusp(var184) : var184;
        return f37038(module0117.f8087(var183, var184, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f37051() {
        $g4696$.setGlobalValue(module0119.f8219());
        return (SubLObject)$ic152$;
    }
    
    public static SubLObject f37052() {
        return $g4696$.getGlobalValue();
    }
    
    public static SubLObject f37053(final SubLObject var10, final SubLObject var11) {
        final SubLObject var12 = var10.rest();
        final SubLObject var14;
        final SubLObject var13 = var14 = var12;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic153$, (SubLObject)$ic154$, ConsesLow.append(var14, (SubLObject)NIL));
    }
    
    public static SubLObject f37054(final SubLObject var63, final SubLObject var64) {
        f37055(var63, var64, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37056(final SubLObject var63) {
        return (SubLObject)((var63.getClass() == $sX40772_native.class) ? T : NIL);
    }
    
    public static SubLObject f37057(final SubLObject var63) {
        assert NIL != f37056(var63) : var63;
        return var63.getField2();
    }
    
    public static SubLObject f37058(final SubLObject var63, final SubLObject var66) {
        assert NIL != f37056(var63) : var63;
        return var63.setField2(var66);
    }
    
    public static SubLObject f37059(SubLObject var67) {
        if (var67 == UNPROVIDED) {
            var67 = (SubLObject)NIL;
        }
        final SubLObject var68 = (SubLObject)new $sX40772_native();
        SubLObject var69;
        SubLObject var70;
        SubLObject var71;
        SubLObject var72;
        for (var69 = (SubLObject)NIL, var69 = var67; NIL != var69; var69 = conses_high.cddr(var69)) {
            var70 = var69.first();
            var71 = conses_high.cadr(var69);
            var72 = var70;
            if (var72.eql((SubLObject)$ic166$)) {
                f37058(var68, var71);
            }
            else {
                Errors.error((SubLObject)$ic80$, var70);
            }
        }
        return var68;
    }
    
    public static SubLObject f37060(final SubLObject var72, final SubLObject var73) {
        Functions.funcall(var73, var72, (SubLObject)$ic81$, (SubLObject)$ic167$, (SubLObject)ONE_INTEGER);
        Functions.funcall(var73, var72, (SubLObject)$ic83$, (SubLObject)$ic166$, f37057(var72));
        Functions.funcall(var73, var72, (SubLObject)$ic84$, (SubLObject)$ic167$, (SubLObject)ONE_INTEGER);
        return var72;
    }
    
    public static SubLObject f37061(final SubLObject var72, final SubLObject var73) {
        return f37060(var72, var73);
    }
    
    public static SubLObject f37055(final SubLObject var74, final SubLObject var64, final SubLObject var75) {
        final SubLThread var76 = SubLProcess.currentSubLThread();
        if (NIL != print_high.$print_readably$.getDynamicValue(var76)) {
            print_high.print_not_readable(var74, var64);
        }
        else {
            streams_high.write_string((SubLObject)$ic86$, var64, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var74), new SubLObject[] { $ic87$, var64 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var64);
            streams_high.write_string((SubLObject)$ic169$, var64, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.prin1(f37057(var74), var64);
            streams_high.write_char((SubLObject)Characters.CHAR_space, var64);
            PrintLow.write(Equality.pointer(var74), new SubLObject[] { $ic87$, var64, $ic90$, SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var64);
        }
        return var74;
    }
    
    public static SubLObject f37062(SubLObject var195) {
        if (var195 == UNPROVIDED) {
            var195 = (SubLObject)NIL;
        }
        final SubLThread var196 = SubLProcess.currentSubLThread();
        final SubLObject var197 = f37059((SubLObject)UNPROVIDED);
        final SubLObject var198 = Guids.guid_to_string(Guids.new_guid());
        f37058(var197, var198);
        if (NIL != module0119.f8211(var195)) {
            final SubLObject var199 = module0119.$g1471$.currentBinding(var196);
            try {
                module0119.$g1471$.bind((SubLObject)$ic170$, var196);
                module0119.f8233(var198, var195);
            }
            finally {
                module0119.$g1471$.rebind(var199, var196);
            }
        }
        return var197;
    }
    
    public static SubLObject f37063(final SubLObject var107, final SubLObject var116, final SubLObject var122) {
        return f37064(var107, var116, var122);
    }
    
    public static SubLObject f37065(final SubLObject var107) {
        return f37066(var107);
    }
    
    public static SubLObject f37067(final SubLObject var107) {
        return (SubLObject)T;
    }
    
    public static SubLObject f37068(final SubLObject var107) {
        return f37069(var107);
    }
    
    public static SubLObject f37070(final SubLObject var107) {
        return f37071(var107);
    }
    
    public static SubLObject f37066(final SubLObject var107) {
        return f37057(var107);
    }
    
    public static SubLObject f37069(final SubLObject var107) {
        return Guids.guid_string_p(f37057(var107));
    }
    
    public static SubLObject f37071(final SubLObject var107) {
        f37058(var107, (SubLObject)NIL);
        return var107;
    }
    
    public static SubLObject f37064(final SubLObject var107, final SubLObject var116, final SubLObject var122) {
        final SubLThread var123 = SubLProcess.currentSubLThread();
        final SubLObject var124 = f37057(var107);
        SubLObject var125 = (SubLObject)NIL;
        final SubLObject var126 = module0119.$g1470$.currentBinding(var123);
        final SubLObject var127 = module0119.$g1471$.currentBinding(var123);
        try {
            module0119.$g1470$.bind($g4696$.getGlobalValue(), var123);
            module0119.$g1471$.bind((SubLObject)$ic170$, var123);
            if (NIL != module0119.f8231(var124)) {
                module0119.f8232(var124, var116, (SubLObject)UNPROVIDED);
            }
            else {
                var125 = (SubLObject)T;
            }
        }
        finally {
            module0119.$g1471$.rebind(var127, var123);
            module0119.$g1470$.rebind(var126, var123);
        }
        if (NIL != var125) {
            Errors.error((SubLObject)$ic176$, var107);
        }
        return var107;
    }
    
    public static SubLObject f37072() {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        SubLObject var25 = (SubLObject)NIL;
        final SubLObject var26 = module0119.$g1471$.currentBinding(var24);
        try {
            module0119.$g1471$.bind((SubLObject)$ic170$, var24);
            var25 = f37062(f37052());
        }
        finally {
            module0119.$g1471$.rebind(var26, var24);
        }
        return f37038(var25);
    }
    
    public static SubLObject f37073(final SubLObject var172, SubLObject var199) {
        if (var199 == UNPROVIDED) {
            var199 = (SubLObject)T;
        }
        final SubLThread var200 = SubLProcess.currentSubLThread();
        final SubLObject var201 = f37037(var172);
        if (NIL == f37035(var201)) {
            Errors.error((SubLObject)$ic179$);
        }
        if (NIL == f37056(var201)) {
            Errors.error((SubLObject)$ic180$);
        }
        final SubLObject var202 = f37057(var201);
        SubLObject var203 = (SubLObject)ZERO_INTEGER;
        try {
            while (true) {
                final SubLObject var204 = module0119.$g1470$.currentBinding(var200);
                final SubLObject var205 = module0119.$g1471$.currentBinding(var200);
                try {
                    module0119.$g1470$.bind($g4696$.getGlobalValue(), var200);
                    module0119.$g1471$.bind((SubLObject)$ic170$, var200);
                    final SubLObject var206 = module0119.f8235(var202);
                    module0623.f38420((SubLObject)ConsesLow.list(var206));
                    var203 = Numbers.add(var203, (SubLObject)ONE_INTEGER);
                }
                finally {
                    module0119.$g1471$.rebind(var205, var200);
                    module0119.$g1470$.rebind(var204, var200);
                }
            }
        }
        finally {
            final SubLObject var207 = Threads.$is_thread_performing_cleanupP$.currentBinding(var200);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var200);
                if (NIL != var199) {
                    final SubLObject var27_201 = module0119.$g1470$.currentBinding(var200);
                    final SubLObject var208 = module0119.$g1471$.currentBinding(var200);
                    try {
                        module0119.$g1470$.bind($g4696$.getGlobalValue(), var200);
                        module0119.$g1471$.bind((SubLObject)$ic170$, var200);
                        module0119.f8234(var202, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0119.$g1471$.rebind(var208, var200);
                        module0119.$g1470$.rebind(var27_201, var200);
                    }
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var207, var200);
            }
        }
    }
    
    public static SubLObject f37074(SubLObject var64) {
        if (var64 == UNPROVIDED) {
            var64 = (SubLObject)T;
        }
        print_high.princ((SubLObject)$ic184$, var64);
        f37007(var64);
        f36999(var64);
        f37029(var64);
        streams_high.terpri(var64);
        print_high.princ((SubLObject)$ic185$, var64);
        streams_high.terpri(var64);
        module0084.f5789($g4698$.getGlobalValue(), var64);
        streams_high.terpri(var64);
        print_high.princ((SubLObject)$ic186$, var64);
        streams_high.terpri(var64);
        module0084.f5789($g4699$.getGlobalValue(), (SubLObject)UNPROVIDED);
        return (SubLObject)T;
    }
    
    public static SubLObject f37075() {
        f37000();
        f37030();
        $g4698$.setGlobalValue(module0067.f4880(Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)UNPROVIDED));
        $g4699$.setGlobalValue(module0067.f4880(Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)UNPROVIDED));
        return (SubLObject)T;
    }
    
    public static SubLObject f37076(final SubLObject var172, final SubLObject var92) {
        final SubLObject var173 = f37001(var92);
        final SubLObject var174 = f37037(var172);
        if (NIL == f36997(var173) || NIL == f37035(var174)) {
            return (SubLObject)NIL;
        }
        final SubLObject var175 = $g4700$.getGlobalValue();
        SubLObject var176 = (SubLObject)NIL;
        try {
            var176 = Locks.seize_lock(var175);
            final SubLObject var177 = Equality.eq((SubLObject)$ic105$, module0067.f4884($g4698$.getGlobalValue(), var173, (SubLObject)$ic105$));
            module0084.f5775($g4698$.getGlobalValue(), var173, (SubLObject)UNPROVIDED);
            module0084.f5762($g4699$.getGlobalValue(), var173, var174);
            module0084.f5762($g4699$.getGlobalValue(), var174, var173);
            if (NIL != var177) {
                f37008(var173);
            }
        }
        finally {
            if (NIL != var176) {
                Locks.release_lock(var175);
            }
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f37077() {
        SubLObject var22 = (SubLObject)NIL;
        final SubLObject var23 = $g4700$.getGlobalValue();
        SubLObject var24 = (SubLObject)NIL;
        try {
            var24 = Locks.seize_lock(var23);
            var22 = module0067.f4902($g4698$.getGlobalValue());
        }
        finally {
            if (NIL != var24) {
                Locks.release_lock(var23);
            }
        }
        return var22;
    }
    
    public static SubLObject f37020(final SubLObject var92) {
        final SubLObject var93 = f37001(var92);
        SubLObject var94 = (SubLObject)NIL;
        if (NIL == f36997(var93)) {
            return (SubLObject)NIL;
        }
        final SubLObject var95 = $g4700$.getGlobalValue();
        SubLObject var96 = (SubLObject)NIL;
        try {
            var96 = Locks.seize_lock(var95);
            var94 = module0067.f4884($g4699$.getGlobalValue(), var93, (SubLObject)UNPROVIDED);
        }
        finally {
            if (NIL != var96) {
                Locks.release_lock(var95);
            }
        }
        return var94;
    }
    
    public static SubLObject f37078(final SubLObject var172) {
        final SubLObject var173 = f37037(var172);
        SubLObject var174 = (SubLObject)NIL;
        if (NIL == f37035(var173)) {
            return (SubLObject)NIL;
        }
        final SubLObject var175 = $g4700$.getGlobalValue();
        SubLObject var176 = (SubLObject)NIL;
        try {
            var176 = Locks.seize_lock(var175);
            var174 = module0067.f4884($g4699$.getGlobalValue(), var173, (SubLObject)UNPROVIDED);
        }
        finally {
            if (NIL != var176) {
                Locks.release_lock(var175);
            }
        }
        return var174;
    }
    
    public static SubLObject f37079(final SubLObject var172, final SubLObject var92) {
        final SubLObject var173 = f37001(var92);
        final SubLObject var174 = f37037(var172);
        if (NIL == f36997(var173) || NIL == f37035(var174)) {
            return (SubLObject)NIL;
        }
        return f37080(var174, var173);
    }
    
    public static SubLObject f37080(final SubLObject var107, final SubLObject var1) {
        final SubLObject var108 = $g4700$.getGlobalValue();
        SubLObject var109 = (SubLObject)NIL;
        try {
            var109 = Locks.seize_lock(var108);
            module0084.f5777($g4698$.getGlobalValue(), var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0084.f5772($g4699$.getGlobalValue(), var1, var107, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0084.f5772($g4699$.getGlobalValue(), var107, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if ($ic189$ == module0067.f4884($g4698$.getGlobalValue(), var1, (SubLObject)$ic189$)) {
                f37009(var1);
            }
        }
        finally {
            if (NIL != var109) {
                Locks.release_lock(var108);
            }
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f37081(final SubLObject var172) {
        final SubLObject var173 = f37037(var172);
        if (NIL == f37035(var173)) {
            return (SubLObject)NIL;
        }
        return f37039(var173);
    }
    
    public static SubLObject f37039(final SubLObject var107) {
        final SubLObject var108 = $g4700$.getGlobalValue();
        SubLObject var109 = (SubLObject)NIL;
        try {
            var109 = Locks.seize_lock(var108);
            SubLObject var111;
            final SubLObject var110 = var111 = module0067.f4884($g4699$.getGlobalValue(), var107, (SubLObject)UNPROVIDED);
            SubLObject var112 = (SubLObject)NIL;
            var112 = var111.first();
            while (NIL != var111) {
                f37080(var107, var112);
                var111 = var111.rest();
                var112 = var111.first();
            }
        }
        finally {
            if (NIL != var109) {
                Locks.release_lock(var108);
            }
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f37082() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f36966", "S#40774", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f36967", "S#40775", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f36968", "S#40776", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0605", "f36969", "S#40777");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f36970", "S#40778", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0605", "f36971", "S#40779");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f36972", "S#40780", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f36973", "S#40781", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f36974", "S#40782", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f36975", "S#40783", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f36976", "S#40784", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f36977", "S#40785", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f36978", "S#40786", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f36980", "S#40787", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f36982", "S#40788", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f36983", "S#40789", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f36979", "S#40790", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f36981", "S#40791", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f36985", "S#40792", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f36984", "S#40793", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f36986", "S#40794", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f36988", "S#40769", 1, 0, false);
        new $f36988$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f36989", "S#40795", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f36990", "S#40796", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f36991", "S#40797", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f36992", "S#40798", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f36993", "S#40799", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f36994", "S#40800", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f36995", "S#40801", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f36987", "S#40802", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f36996", "S#40803", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f36997", "S#40804", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f36998", "S#40805", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f36999", "S#40806", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37000", "S#40807", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37001", "S#40808", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37002", "S#40809", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37003", "S#40810", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37004", "CREATE-KB-MODIFICATION-EVENT-FILTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37005", "DELETE-KB-MODIFICATION-EVENT-FILTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37006", "S#40811", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37007", "S#40812", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37008", "S#40813", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37009", "S#40814", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37010", "S#40815", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37011", "S#40816", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37013", "S#40817", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37014", "S#40818", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37015", "S#40819", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37016", "S#40820", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37017", "S#40821", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37018", "S#40822", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37019", "S#40823", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37021", "S#40824", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37012", "S#40825", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37022", "S#40826", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37023", "S#40827", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37024", "S#40828", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37025", "S#40829", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37026", "S#40830", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37029", "S#40831", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37030", "S#40832", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37031", "S#40833", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37032", "S#40834", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37033", "S#40835", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37034", "S#40836", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37035", "S#40837", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37036", "S#40838", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37038", "S#40839", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37027", "DELETE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37040", "S#40840", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37037", "S#40841", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37028", "S#40842", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37041", "S#40843", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37043", "S#40844", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37045", "S#40845", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37046", "S#40846", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37048", "S#40847", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37044", "S#40848", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37047", "S#40849", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37049", "S#40850", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37042", "S#40851", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37050", "CREATE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37051", "S#9538", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37052", "S#40852", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0605", "f37053", "S#40853");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37054", "S#40854", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37056", "S#40773", 1, 0, false);
        new $f37056$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37057", "S#40855", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37058", "S#40856", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37059", "S#40857", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37060", "S#40858", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37061", "S#40859", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37055", "S#40860", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37062", "S#40861", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37063", "S#40862", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37065", "S#40863", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37067", "S#40864", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37068", "S#40865", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37070", "S#40866", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37066", "S#40867", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37069", "S#40868", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37071", "S#40869", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37064", "S#40870", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37072", "CREATE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-MESSAGE-MAILBOX-LISTENER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37073", "ALL-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-MESSAGES-FROM-MAILBOX", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37074", "S#40871", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37075", "S#9537", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37076", "ADD-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37077", "S#40872", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37020", "S#40873", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37078", "S#40874", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37079", "REMOVE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37080", "S#40875", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37081", "S#40876", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0605", "f37039", "S#40877", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37083() {
        $g4675$ = SubLFiles.deflexical("S#40878", module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g4676$ = SubLFiles.deflexical("S#40879", module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g4677$ = SubLFiles.defparameter("S#40880", (SubLObject)NIL);
        $g4678$ = SubLFiles.defconstant("S#40881", (SubLObject)$ic65$);
        $g4679$ = SubLFiles.deflexical("S#40882", (NIL != Symbols.boundp((SubLObject)$ic91$)) ? $g4679$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)UNPROVIDED));
        $g4680$ = SubLFiles.deflexical("S#40883", (NIL != Symbols.boundp((SubLObject)$ic92$)) ? $g4680$.getGlobalValue() : Locks.make_lock((SubLObject)$ic93$));
        $g4681$ = SubLFiles.deflexical("S#40884", (NIL != Symbols.boundp((SubLObject)$ic94$)) ? $g4681$.getGlobalValue() : module0057.f4173((SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g4682$ = SubLFiles.deflexical("S#40885", (NIL != Symbols.boundp((SubLObject)$ic99$)) ? $g4682$.getGlobalValue() : module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g4683$ = SubLFiles.deflexical("S#40886", (NIL != Symbols.boundp((SubLObject)$ic100$)) ? $g4683$.getGlobalValue() : Locks.make_lock((SubLObject)$ic101$));
        $g4684$ = SubLFiles.deflexical("S#40887", (NIL != Symbols.boundp((SubLObject)$ic102$)) ? $g4684$.getGlobalValue() : module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g4685$ = SubLFiles.deflexical("S#40888", Vectors.make_vector((SubLObject)$ic116$, (SubLObject)NIL));
        $g4686$ = SubLFiles.deflexical("S#40889", (NIL != Symbols.boundp((SubLObject)$ic119$)) ? $g4686$.getGlobalValue() : module0117.f8104((SubLObject)$ic113$, (SubLObject)$ic120$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g4687$ = SubLFiles.deflexical("S#40890", (SubLObject)TWENTY_INTEGER);
        $g4688$ = SubLFiles.deflexical("S#40891", (NIL != Symbols.boundp((SubLObject)$ic135$)) ? $g4688$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)UNPROVIDED));
        $g4689$ = SubLFiles.deflexical("S#40892", (NIL != Symbols.boundp((SubLObject)$ic136$)) ? $g4689$.getGlobalValue() : Locks.make_lock((SubLObject)$ic137$));
        $g4690$ = SubLFiles.deflexical("S#40893", (NIL != Symbols.boundp((SubLObject)$ic138$)) ? $g4690$.getGlobalValue() : module0057.f4173((SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g4691$ = SubLFiles.deflexical("S#40894", Vectors.make_vector((SubLObject)$ic116$, (SubLObject)NIL));
        $g4692$ = SubLFiles.deflexical("S#40895", Vectors.make_vector((SubLObject)$ic116$, (SubLObject)NIL));
        $g4693$ = SubLFiles.deflexical("S#40896", Vectors.make_vector((SubLObject)$ic116$, (SubLObject)NIL));
        $g4694$ = SubLFiles.deflexical("S#40897", Vectors.make_vector((SubLObject)$ic116$, (SubLObject)NIL));
        $g4695$ = SubLFiles.deflexical("S#40898", (SubLObject)NIL);
        $g4696$ = SubLFiles.deflexical("S#40899", (NIL != Symbols.boundp((SubLObject)$ic151$)) ? $g4696$.getGlobalValue() : module0119.f8219());
        $g4697$ = SubLFiles.defconstant("S#40900", (SubLObject)$ic155$);
        $g4698$ = SubLFiles.deflexical("S#40901", (NIL != Symbols.boundp((SubLObject)$ic181$)) ? $g4698$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)UNPROVIDED));
        $g4699$ = SubLFiles.deflexical("S#40902", (NIL != Symbols.boundp((SubLObject)$ic182$)) ? $g4699$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)UNPROVIDED));
        $g4700$ = SubLFiles.deflexical("S#40903", Locks.make_lock((SubLObject)$ic183$));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37084() {
        f36966((SubLObject)$ic18$, (SubLObject)$ic20$);
        f36967((SubLObject)$ic18$, (SubLObject)$ic21$);
        f36966((SubLObject)$ic23$, (SubLObject)$ic24$);
        f36967((SubLObject)$ic23$, (SubLObject)$ic25$);
        f36966((SubLObject)$ic26$, (SubLObject)$ic27$);
        f36967((SubLObject)$ic26$, (SubLObject)$ic28$);
        f36966((SubLObject)$ic29$, (SubLObject)$ic30$);
        f36967((SubLObject)$ic29$, (SubLObject)$ic25$);
        f36966((SubLObject)$ic31$, (SubLObject)$ic32$);
        f36967((SubLObject)$ic31$, (SubLObject)$ic28$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g4678$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic72$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic73$);
        Structures.def_csetf((SubLObject)$ic74$, (SubLObject)$ic75$);
        Structures.def_csetf((SubLObject)$ic76$, (SubLObject)$ic77$);
        Equality.identity((SubLObject)$ic65$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g4678$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic85$));
        module0003.f57((SubLObject)$ic91$);
        module0003.f57((SubLObject)$ic92$);
        module0003.f57((SubLObject)$ic94$);
        module0002.f38((SubLObject)$ic96$);
        module0002.f38((SubLObject)$ic97$);
        module0003.f57((SubLObject)$ic99$);
        module0003.f57((SubLObject)$ic100$);
        module0003.f57((SubLObject)$ic102$);
        module0116.f8043((SubLObject)$ic113$, (SubLObject)$ic118$, (SubLObject)NIL);
        module0003.f57((SubLObject)$ic119$);
        module0197.f12336($g4686$.getGlobalValue());
        module0003.f57((SubLObject)$ic135$);
        module0003.f57((SubLObject)$ic136$);
        module0003.f57((SubLObject)$ic138$);
        module0002.f38((SubLObject)$ic140$);
        Structures.register_method($g4685$.getGlobalValue(), module0117.$g1459$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic141$));
        Structures.register_method($g4691$.getGlobalValue(), module0117.$g1459$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic142$));
        Structures.register_method($g4692$.getGlobalValue(), module0117.$g1459$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic143$));
        Structures.register_method($g4693$.getGlobalValue(), module0117.$g1459$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic144$));
        Structures.register_method($g4694$.getGlobalValue(), module0117.$g1459$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic145$));
        module0002.f38((SubLObject)$ic148$);
        module0003.f57((SubLObject)$ic151$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g4697$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic162$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic163$);
        Structures.def_csetf((SubLObject)$ic164$, (SubLObject)$ic165$);
        Equality.identity((SubLObject)$ic155$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g4697$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic168$));
        Structures.register_method($g4685$.getGlobalValue(), $g4697$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic171$));
        Structures.register_method($g4691$.getGlobalValue(), $g4697$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic172$));
        Structures.register_method($g4692$.getGlobalValue(), $g4697$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic173$));
        Structures.register_method($g4693$.getGlobalValue(), $g4697$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic174$));
        Structures.register_method($g4694$.getGlobalValue(), $g4697$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic175$));
        module0002.f38((SubLObject)$ic177$);
        module0002.f38((SubLObject)$ic178$);
        module0003.f57((SubLObject)$ic181$);
        module0003.f57((SubLObject)$ic182$);
        module0002.f38((SubLObject)$ic187$);
        module0002.f38((SubLObject)$ic188$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f37082();
    }
    
    public void initializeVariables() {
        f37083();
    }
    
    public void runTopLevelForms() {
        f37084();
    }
    
    static {
        me = (SubLFile)new module0605();
        $g4675$ = null;
        $g4676$ = null;
        $g4677$ = null;
        $g4678$ = null;
        $g4679$ = null;
        $g4680$ = null;
        $g4681$ = null;
        $g4682$ = null;
        $g4683$ = null;
        $g4684$ = null;
        $g4685$ = null;
        $g4686$ = null;
        $g4687$ = null;
        $g4688$ = null;
        $g4689$ = null;
        $g4690$ = null;
        $g4691$ = null;
        $g4692$ = null;
        $g4693$ = null;
        $g4694$ = null;
        $g4695$ = null;
        $g4696$ = null;
        $g4697$ = null;
        $g4698$ = null;
        $g4699$ = null;
        $g4700$ = null;
        $ic0$ = makeString("Invalid event denotation ~A for filter ~A.");
        $ic1$ = ConsesLow.list((SubLObject)makeSymbol("S#40904", "CYC"), (SubLObject)makeSymbol("S#28807", "CYC"), (SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("S#30", "CYC"), (SubLObject)makeSymbol("S#10298", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic2$ = makeSymbol("S#10058", "CYC");
        $ic3$ = makeString("Arglist must start with event parameter.");
        $ic4$ = makeSymbol("PROGN");
        $ic5$ = makeSymbol("DEFINE-PRIVATE");
        $ic6$ = makeSymbol("S#40774", "CYC");
        $ic7$ = makeSymbol("QUOTE");
        $ic8$ = makeSymbol("S#40775", "CYC");
        $ic9$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39562", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic10$ = makeSymbol("CLET");
        $ic11$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#40880", "CYC"), (SubLObject)NIL));
        $ic12$ = makeSymbol("CSETQ");
        $ic13$ = ConsesLow.list((SubLObject)makeSymbol("S#40880", "CYC"));
        $ic14$ = makeKeyword("AND");
        $ic15$ = makeSymbol("S#40782", "CYC");
        $ic16$ = makeKeyword("OR");
        $ic17$ = makeKeyword("NOT");
        $ic18$ = makeKeyword("DEFAULT-KB-MODIFICATION-EVENT-FILTER");
        $ic19$ = makeKeyword("EVENT-CLASS");
        $ic20$ = makeSymbol("S#40785", "CYC");
        $ic21$ = ConsesLow.list((SubLObject)makeKeyword("ALL"));
        $ic22$ = makeKeyword("FORT-FILTER");
        $ic23$ = makeKeyword("CYCL-FORT-FILTER");
        $ic24$ = makeSymbol("S#40786", "CYC");
        $ic25$ = ConsesLow.list((SubLObject)makeKeyword("KB-MODIFY-REMOVE-CONSTANT"), (SubLObject)makeKeyword("KB-MODIFY-REMOVE-NART"), (SubLObject)makeKeyword("KB-MODIFY-CREATE-ASSERTION"), (SubLObject)makeKeyword("KB-MODIFY-REMOVE-ASSERTION"));
        $ic26$ = makeKeyword("COLLECTION-FILTER");
        $ic27$ = makeSymbol("S#40787", "CYC");
        $ic28$ = ConsesLow.list((SubLObject)makeKeyword("KB-MODIFY-CREATE-ASSERTION"), (SubLObject)makeKeyword("KB-MODIFY-REMOVE-ASSERTION"));
        $ic29$ = makeKeyword("LEXICON-FORT-FILTER");
        $ic30$ = makeSymbol("S#40788", "CYC");
        $ic31$ = makeKeyword("MT-FILTER");
        $ic32$ = makeSymbol("S#40789", "CYC");
        $ic33$ = makeKeyword("ANY-CHANGE");
        $ic34$ = makeKeyword("KB-MODIFY-REMOVE-CONSTANT");
        $ic35$ = makeKeyword("FORT-REMOVED");
        $ic36$ = makeKeyword("EVENT-TYPE");
        $ic37$ = makeKeyword("CYCL-FORT-EVENT");
        $ic38$ = makeKeyword("EVENT-REASON");
        $ic39$ = makeKeyword("ITEM-REMOVED");
        $ic40$ = makeKeyword("FORT-MODIFIED");
        $ic41$ = makeKeyword("REMOVED-VALUE");
        $ic42$ = makeKeyword("KB-MODIFY-CREATE-ASSERTION");
        $ic43$ = makeKeyword("FORT-ASSERTION-ADDED");
        $ic44$ = makeKeyword("ITEM-ADDED");
        $ic45$ = makeKeyword("ASSERTION-SENTENCE");
        $ic46$ = makeKeyword("ASSERTION-MT");
        $ic47$ = makeKeyword("KB-MODIFY-REMOVE-ASSERTION");
        $ic48$ = makeKeyword("FORT-ASSERTION-REMOVED");
        $ic49$ = makeKeyword("KB-MODIFY-REMOVE-NART");
        $ic50$ = makeKeyword("ALL-INSTANTIATIONS");
        $ic51$ = makeKeyword("INSTANCE-REMOVED");
        $ic52$ = makeKeyword("CYCL-COLLECTION-EVENT");
        $ic53$ = makeKeyword("COLLECTION-MODIFIED");
        $ic54$ = makeKeyword("ADDED-VALUE");
        $ic55$ = makeKeyword("INSTANCE-ADDED");
        $ic56$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic57$ = makeKeyword("IMMEDIATE-INSTANTIATIONS");
        $ic58$ = makeKeyword("LOCAL-CHANGE");
        $ic59$ = makeKeyword("ASSERTION-ADDED");
        $ic60$ = makeKeyword("ASSERTION-REMOVED");
        $ic61$ = makeKeyword("UPWARD-CLOSURE");
        $ic62$ = makeKeyword("DOWNWARD-CLOSURE");
        $ic63$ = makeKeyword("CYCL-MICROTHEORY-EVENT");
        $ic64$ = makeKeyword("MICROTHEORY-MODIFIED");
        $ic65$ = makeSymbol("S#40768", "CYC");
        $ic66$ = makeSymbol("S#40769", "CYC");
        $ic67$ = ConsesLow.list((SubLObject)makeSymbol("S#1519", "CYC"), (SubLObject)makeSymbol("S#32", "CYC"));
        $ic68$ = ConsesLow.list((SubLObject)makeKeyword("ID"), (SubLObject)makeKeyword("PATTERN"));
        $ic69$ = ConsesLow.list((SubLObject)makeSymbol("S#40795", "CYC"), (SubLObject)makeSymbol("S#40796", "CYC"));
        $ic70$ = ConsesLow.list((SubLObject)makeSymbol("S#40797", "CYC"), (SubLObject)makeSymbol("S#40798", "CYC"));
        $ic71$ = makeSymbol("S#40802", "CYC");
        $ic72$ = makeSymbol("S#40794", "CYC");
        $ic73$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#40769", "CYC"));
        $ic74$ = makeSymbol("S#40795", "CYC");
        $ic75$ = makeSymbol("S#40797", "CYC");
        $ic76$ = makeSymbol("S#40796", "CYC");
        $ic77$ = makeSymbol("S#40798", "CYC");
        $ic78$ = makeKeyword("ID");
        $ic79$ = makeKeyword("PATTERN");
        $ic80$ = makeString("Invalid slot ~S for construction function");
        $ic81$ = makeKeyword("BEGIN");
        $ic82$ = makeSymbol("S#40799", "CYC");
        $ic83$ = makeKeyword("SLOT");
        $ic84$ = makeKeyword("END");
        $ic85$ = makeSymbol("S#40801", "CYC");
        $ic86$ = makeString("#<");
        $ic87$ = makeKeyword("STREAM");
        $ic88$ = makeString(" id: ");
        $ic89$ = makeString(" pattern: ");
        $ic90$ = makeKeyword("BASE");
        $ic91$ = makeSymbol("S#40882", "CYC");
        $ic92$ = makeSymbol("S#40883", "CYC");
        $ic93$ = makeString("Event Filter Registration");
        $ic94$ = makeSymbol("S#40884", "CYC");
        $ic95$ = makeString("Current KB Modification Event Filter Registration");
        $ic96$ = makeSymbol("CREATE-KB-MODIFICATION-EVENT-FILTER");
        $ic97$ = makeSymbol("DELETE-KB-MODIFICATION-EVENT-FILTER");
        $ic98$ = makeSymbol("FIXNUMP");
        $ic99$ = makeSymbol("S#40885", "CYC");
        $ic100$ = makeSymbol("S#40886", "CYC");
        $ic101$ = makeString("KB Modification Event to Filter Mapping");
        $ic102$ = makeSymbol("S#40887", "CYC");
        $ic103$ = makeString("Current KB Modification Event To Filter Mapping");
        $ic104$ = makeString("Current KB Modification Event Internal Listener Table");
        $ic105$ = makeKeyword("NOT-FOUND");
        $ic106$ = makeSymbol("S#40823", "CYC");
        $ic107$ = makeKeyword("LISTENER");
        $ic108$ = makeKeyword("FILTERS");
        $ic109$ = makeKeyword("FIRED");
        $ic110$ = makeKeyword("DETAILS");
        $ic111$ = makeKeyword("TRIGGER");
        $ic112$ = makeKeyword("SUPPORTS");
        $ic113$ = makeKeyword("KB-MODIFICATION-FILTER-FIRED");
        $ic114$ = makeSymbol("S#10059", "CYC");
        $ic115$ = makeString("Event ~S is of type ~S, not ~S.");
        $ic116$ = makeInteger(256);
        $ic117$ = makeString("Not implemented for type ~A");
        $ic118$ = makeKeyword("KB-STORE-EVENT");
        $ic119$ = makeSymbol("S#40889", "CYC");
        $ic120$ = makeSymbol("S#40830", "CYC");
        $ic121$ = ConsesLow.list((SubLObject)Characters.CHAR_hyphen);
        $ic122$ = makeSymbol("CCONCATENATE");
        $ic123$ = makeString("eventNotifications");
        $ic124$ = makeString("http://www.opencyc.org/xml/eventNotifications.dtd");
        $ic125$ = makeString("eventNotification");
        $ic126$ = makeString("kbModificationFilteredEvent");
        $ic127$ = makeString("filterList");
        $ic128$ = makeString("filterId");
        $ic129$ = makeString("timestamp");
        $ic130$ = makeString("kbEvents");
        $ic131$ = makeString("kbEvent");
        $ic132$ = makeKeyword("HP");
        $ic133$ = makeSymbol("S#38", "CYC");
        $ic134$ = makeString("KB Modification Filter Fired: could not report event ~S to listener ~A -> error ~A.~%Deregistering listener ~A");
        $ic135$ = makeSymbol("S#40891", "CYC");
        $ic136$ = makeSymbol("S#40892", "CYC");
        $ic137$ = makeString("Event Filter Listener Registration");
        $ic138$ = makeSymbol("S#40893", "CYC");
        $ic139$ = makeString("Current External KB Modification Event Filter Listener Registration");
        $ic140$ = makeSymbol("DELETE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER");
        $ic141$ = makeSymbol("S#40843", "CYC");
        $ic142$ = makeSymbol("S#40844", "CYC");
        $ic143$ = makeSymbol("S#40845", "CYC");
        $ic144$ = makeSymbol("S#40846", "CYC");
        $ic145$ = makeSymbol("S#40847", "CYC");
        $ic146$ = makeKeyword("PRIVATE");
        $ic147$ = makeString("~A: About to send to ~A:~A:~%~A~%");
        $ic148$ = makeSymbol("CREATE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER");
        $ic149$ = makeSymbol("STRINGP");
        $ic150$ = makeSymbol("PLUSP");
        $ic151$ = makeSymbol("S#40899", "CYC");
        $ic152$ = makeKeyword("CLEARED");
        $ic153$ = makeSymbol("S#10315", "CYC");
        $ic154$ = ConsesLow.list((SubLObject)makeSymbol("S#40899", "CYC"));
        $ic155$ = makeSymbol("S#40772", "CYC");
        $ic156$ = makeSymbol("S#40773", "CYC");
        $ic157$ = ConsesLow.list((SubLObject)makeSymbol("S#1612", "CYC"));
        $ic158$ = ConsesLow.list((SubLObject)makeKeyword("ADDRESS"));
        $ic159$ = ConsesLow.list((SubLObject)makeSymbol("S#40855", "CYC"));
        $ic160$ = ConsesLow.list((SubLObject)makeSymbol("S#40856", "CYC"));
        $ic161$ = makeSymbol("S#40860", "CYC");
        $ic162$ = makeSymbol("S#40854", "CYC");
        $ic163$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#40773", "CYC"));
        $ic164$ = makeSymbol("S#40855", "CYC");
        $ic165$ = makeSymbol("S#40856", "CYC");
        $ic166$ = makeKeyword("ADDRESS");
        $ic167$ = makeSymbol("S#40857", "CYC");
        $ic168$ = makeSymbol("S#40859", "CYC");
        $ic169$ = makeString(" address: ");
        $ic170$ = makeKeyword("BLOCKING");
        $ic171$ = makeSymbol("S#40862", "CYC");
        $ic172$ = makeSymbol("S#40863", "CYC");
        $ic173$ = makeSymbol("S#40864", "CYC");
        $ic174$ = makeSymbol("S#40865", "CYC");
        $ic175$ = makeSymbol("S#40866", "CYC");
        $ic176$ = makeString("The listener ~S is no longer valid.");
        $ic177$ = makeSymbol("CREATE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-MESSAGE-MAILBOX-LISTENER");
        $ic178$ = makeSymbol("ALL-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-MESSAGES-FROM-MAILBOX");
        $ic179$ = makeString("Not a valid external event filter listener ID.");
        $ic180$ = makeString("Wrong API for type -- only suitable for message mailbox listeners.");
        $ic181$ = makeSymbol("S#40901", "CYC");
        $ic182$ = makeSymbol("S#40902", "CYC");
        $ic183$ = makeString("External KB Modification Event Listeners");
        $ic184$ = makeString("Current External KB Modification Event Filters & Listeners");
        $ic185$ = makeString(" Active Filters: ");
        $ic186$ = makeString(" Listeners for Filters Map: ");
        $ic187$ = makeSymbol("ADD-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER");
        $ic188$ = makeSymbol("REMOVE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER");
        $ic189$ = makeKeyword("EMPTY");
    }
    
    public static final class $sX40768_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $pattern;
        public static final SubLStructDeclNative structDecl;
        
        public $sX40768_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$pattern = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX40768_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$id;
        }
        
        public SubLObject getField3() {
            return this.$pattern;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$pattern = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX40768_native.class, $ic65$, $ic66$, $ic67$, $ic68$, new String[] { "$id", "$pattern" }, $ic69$, $ic70$, $ic71$);
        }
    }
    
    public static final class $f36988$UnaryFunction extends UnaryFunction
    {
        public $f36988$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#40769"));
        }
        
        public SubLObject processItem(final SubLObject var65) {
            return f36988(var65);
        }
    }
    
    public static final class $sX40772_native extends SubLStructNative
    {
        public SubLObject $address;
        public static final SubLStructDeclNative structDecl;
        
        public $sX40772_native() {
            this.$address = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX40772_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$address;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$address = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX40772_native.class, $ic155$, $ic156$, $ic157$, $ic158$, new String[] { "$address" }, $ic159$, $ic160$, $ic161$);
        }
    }
    
    public static final class $f37056$UnaryFunction extends UnaryFunction
    {
        public $f37056$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#40773"));
        }
        
        public SubLObject processItem(final SubLObject var65) {
            return f37056(var65);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 823 ms
	
	Decompiled with Procyon 0.5.32.
*/