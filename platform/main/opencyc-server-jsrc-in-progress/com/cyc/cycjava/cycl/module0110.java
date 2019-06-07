package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0110 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0110";
    public static final String myFingerPrint = "235bddbf83b22b4c19ee0595a6996d2ffff3e51cf5c19191d3aae33da2d5574c";
    private static SubLSymbol $g1371$;
    public static SubLSymbol $g1372$;
    public static SubLSymbol $g1373$;
    public static SubLSymbol $g1374$;
    public static SubLSymbol $g1375$;
    public static SubLSymbol $g1376$;
    public static SubLSymbol $g1377$;
    public static SubLSymbol $g1378$;
    public static SubLSymbol $g1379$;
    public static SubLSymbol $g1380$;
    public static SubLSymbol $g1381$;
    public static SubLSymbol $g1382$;
    public static SubLSymbol $g1383$;
    public static SubLSymbol $g1384$;
    public static SubLSymbol $g41$;
    public static SubLSymbol $g1385$;
    public static SubLSymbol $g1386$;
    public static SubLSymbol $g1387$;
    public static SubLSymbol $g1388$;
    public static SubLSymbol $g1389$;
    public static SubLSymbol $g1362$;
    public static SubLSymbol $g120$;
    public static SubLSymbol $g124$;
    public static SubLSymbol $g113$;
    public static SubLSymbol $g118$;
    public static SubLSymbol $g536$;
    public static SubLSymbol $g127$;
    public static SubLSymbol $g570$;
    public static SubLSymbol $g1390$;
    public static SubLSymbol $g1391$;
    private static SubLSymbol $g1392$;
    public static SubLSymbol $g36$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLString $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLString $ic13$;
    private static final SubLString $ic14$;
    private static final SubLString $ic15$;
    private static final SubLString $ic16$;
    private static final SubLObject $ic17$;
    private static final SubLList $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLList $ic20$;
    private static final SubLString $ic21$;
    private static final SubLString $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLString $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLString $ic29$;
    private static final SubLList $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLList $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLString $ic42$;
    private static final SubLList $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLList $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLList $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLString $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLString $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLString $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLString $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLString $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLString $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLInteger $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLString $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLString $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLString $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLString $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLString $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLString $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLString $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLString $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLString $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLString $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLList $ic86$;
    private static final SubLString $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLInteger $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLString $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLString $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLString $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLString $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLString $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLString $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLString $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLString $ic105$;
    private static final SubLString $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLString $ic108$;
    private static final SubLString $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLString $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLString $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLString $ic115$;
    private static final SubLString $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLString $ic118$;
    private static final SubLString $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLString $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLString $ic123$;
    private static final SubLString $ic124$;
    private static final SubLList $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLList $ic128$;
    private static final SubLString $ic129$;
    
    public static SubLObject f7667() {
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic1$), $g1371$.getGlobalValue());
    }
    
    public static SubLObject f7668(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4) {
        if (NIL == module0109.f7662(var3)) {
            Errors.warn((SubLObject)$ic2$, (SubLObject)$ic3$, var1, var3);
        }
        f7669(var1);
        $g1371$.setGlobalValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var1, var2, var3, var4), $g1371$.getGlobalValue()));
        return var1;
    }
    
    public static SubLObject f7669(final SubLObject var1) {
        assert NIL != Types.symbolp(var1) : var1;
        $g1371$.setGlobalValue(Sequences.delete(var1, $g1371$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQ), Symbols.symbol_function((SubLObject)$ic5$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7670() {
        return Sequences.reverse($g1371$.getGlobalValue());
    }
    
    public static SubLObject f7671(final SubLObject var5, final SubLObject var6) {
        SubLObject var8;
        final SubLObject var7 = var8 = var5.rest();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)$ic6$);
        var9 = var8.first();
        var8 = var8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)$ic6$);
        var10 = var8.first();
        var8 = var8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)$ic6$);
        var11 = var8.first();
        var8 = var8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)$ic6$);
        var12 = var8.first();
        var8 = var8.rest();
        if (NIL == var8) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic7$, (SubLObject)ConsesLow.list((SubLObject)$ic8$, (SubLObject)ConsesLow.list((SubLObject)$ic9$, var9), (SubLObject)ConsesLow.list((SubLObject)$ic9$, var10), (SubLObject)ConsesLow.list((SubLObject)$ic9$, var11), (SubLObject)ConsesLow.list((SubLObject)$ic9$, var12)), (SubLObject)ConsesLow.list((SubLObject)$ic10$, var9, (SubLObject)$ic11$, var12));
        }
        cdestructuring_bind.cdestructuring_bind_error(var7, (SubLObject)$ic6$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7672(final SubLObject var9) {
        return Equality.eq(var9, (SubLObject)$ic11$);
    }
    
    public static SubLObject f7673() {
        SubLObject var10 = $g1371$.getGlobalValue();
        SubLObject var11 = (SubLObject)NIL;
        var11 = var10.first();
        while (NIL != var10) {
            SubLObject var13;
            final SubLObject var12 = var13 = var11;
            SubLObject var14 = (SubLObject)NIL;
            SubLObject var15 = (SubLObject)NIL;
            SubLObject var16 = (SubLObject)NIL;
            SubLObject var17 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic12$);
            var14 = var13.first();
            var13 = var13.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic12$);
            var15 = var13.first();
            var13 = var13.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic12$);
            var16 = var13.first();
            var13 = var13.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic12$);
            var17 = var13.first();
            var13 = var13.rest();
            if (NIL == var13) {
                if (NIL == Symbols.boundp(var14)) {
                    Errors.warn((SubLObject)$ic13$, var14);
                }
                else if (NIL != f7672(Symbols.symbol_value(var14))) {
                    Errors.warn((SubLObject)$ic14$, var14);
                }
                else if (NIL == module0109.f7662(var16)) {
                    Errors.warn((SubLObject)$ic15$, var14, var16);
                }
                else {
                    final SubLObject var18 = Symbols.symbol_value(var14);
                    if (NIL == module0109.f7663(var18, var16)) {
                        Errors.warn((SubLObject)$ic16$, var14, var18, var16);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic12$);
            }
            var10 = var10.rest();
            var11 = var10.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7674(final SubLObject var15) {
        SubLObject var16 = Numbers.add(Sequences.length(var15), (SubLObject)ONE_INTEGER);
        SubLObject var17;
        SubLObject var18;
        for (var17 = Sequences.length(var15), var18 = (SubLObject)NIL, var18 = (SubLObject)ZERO_INTEGER; var18.numL(var17); var18 = Numbers.add(var18, (SubLObject)ONE_INTEGER)) {
            if (NIL == Characters.alphanumericp(Strings.sublisp_char(var15, var18))) {
                var16 = Numbers.add(var16, (SubLObject)ONE_INTEGER);
            }
        }
        final SubLObject var19 = Strings.make_string(var16, (SubLObject)UNPROVIDED);
        SubLObject var20 = (SubLObject)ONE_INTEGER;
        Strings.set_char(var19, (SubLObject)ZERO_INTEGER, (SubLObject)Characters.CHAR_E);
        SubLObject var21;
        SubLObject var22;
        SubLObject var23;
        SubLObject var24;
        SubLObject var25;
        for (var21 = Sequences.length(var15), var22 = (SubLObject)NIL, var22 = (SubLObject)ZERO_INTEGER; var22.numL(var21); var22 = Numbers.add(var22, (SubLObject)ONE_INTEGER)) {
            var23 = Strings.sublisp_char(var15, var22);
            if (NIL != Characters.alphanumericp(var23)) {
                Strings.set_char(var19, var20, var23);
                var20 = Numbers.add(var20, (SubLObject)ONE_INTEGER);
            }
            else {
                var24 = Characters.char_code(var23);
                var25 = $ic17$;
                Strings.set_char(var19, var20, Vectors.aref(var25, Numbers.integerDivide(var24, (SubLObject)SIXTEEN_INTEGER)));
                var20 = Numbers.add(var20, (SubLObject)ONE_INTEGER);
                Strings.set_char(var19, var20, Vectors.aref(var25, Numbers.mod(var24, (SubLObject)SIXTEEN_INTEGER)));
                var20 = Numbers.add(var20, (SubLObject)ONE_INTEGER);
            }
        }
        return var19;
    }
    
    public static SubLObject f7675(final SubLObject var4, final SubLObject var24, SubLObject var25) {
        if (var25 == UNPROVIDED) {
            var25 = Symbols.symbol_function((SubLObject)EQUAL);
        }
        final SubLObject var26 = module0038.f2862(var4);
        return f7676(var26, var24, var25);
    }
    
    public static SubLObject f7676(final SubLObject var26, final SubLObject var24, SubLObject var25) {
        if (var25 == UNPROVIDED) {
            var25 = Symbols.symbol_function((SubLObject)EQUAL);
        }
        SubLObject var27 = (SubLObject)NIL;
        SubLObject var28 = var26;
        SubLObject var29 = (SubLObject)NIL;
        var29 = var28.first();
        while (NIL != var28) {
            SubLObject var10_29 = var24;
            SubLObject var30 = (SubLObject)NIL;
            var30 = var10_29.first();
            while (NIL != var10_29) {
                SubLObject var32;
                final SubLObject var31 = var32 = var30;
                SubLObject var33 = (SubLObject)NIL;
                SubLObject var34 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)$ic18$);
                var33 = var32.first();
                var32 = (var34 = var32.rest());
                if (NIL != Sequences.search(var34, var29, var25, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var29 = module0038.f2659(var33, var34, var29, var25);
                }
                var10_29 = var10_29.rest();
                var30 = var10_29.first();
            }
            var27 = (SubLObject)ConsesLow.cons(var29, var27);
            var28 = var28.rest();
            var29 = var28.first();
        }
        return Sequences.nreverse(var27);
    }
    
    public static SubLObject f7677(final SubLObject var35, SubLObject var36) {
        if (var36 == UNPROVIDED) {
            var36 = (SubLObject)NIL;
        }
        if (var35.eql((SubLObject)$ic19$)) {
            if (NIL == var36) {
                var36 = module0075.f5175((SubLObject)$ic20$, (SubLObject)$ic21$, (SubLObject)$ic22$);
            }
            SubLObject var37 = (SubLObject)NIL;
            try {
                var37 = compatibility.open_text(var36, (SubLObject)$ic23$);
                if (!var37.isStream()) {
                    Errors.error((SubLObject)$ic24$, var36);
                }
                final SubLObject var38 = var37;
                PrintLow.format(var38, (SubLObject)$ic25$);
                PrintLow.format(var38, (SubLObject)$ic26$);
                PrintLow.format(var38, (SubLObject)$ic27$);
                PrintLow.format(var38, (SubLObject)$ic28$, module0051.f3552((SubLObject)UNPROVIDED), module0011.f351());
                PrintLow.format(var38, (SubLObject)$ic29$);
                final SubLObject var39 = (SubLObject)$ic30$;
                SubLObject var40 = f7670();
                SubLObject var41 = (SubLObject)NIL;
                var41 = var40.first();
                while (NIL != var40) {
                    SubLObject var43;
                    final SubLObject var42 = var43 = var41;
                    SubLObject var44 = (SubLObject)NIL;
                    SubLObject var45 = (SubLObject)NIL;
                    SubLObject var46 = (SubLObject)NIL;
                    SubLObject var47 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var43, var42, (SubLObject)$ic12$);
                    var44 = var43.first();
                    var43 = var43.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var43, var42, (SubLObject)$ic12$);
                    var45 = var43.first();
                    var43 = var43.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var43, var42, (SubLObject)$ic12$);
                    var46 = var43.first();
                    var43 = var43.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var43, var42, (SubLObject)$ic12$);
                    var47 = var43.first();
                    var43 = var43.rest();
                    if (NIL == var43) {
                        final SubLObject var48 = module0109.f7661(var46, (SubLObject)UNPROVIDED);
                        final SubLObject var49 = f7676((SubLObject)ConsesLow.list(var48), var39, (SubLObject)UNPROVIDED).first();
                        PrintLow.format(var38, (SubLObject)$ic31$, var49);
                        SubLObject var10_44 = f7675(var47, var39, (SubLObject)UNPROVIDED);
                        SubLObject var50 = (SubLObject)NIL;
                        var50 = var10_44.first();
                        while (NIL != var10_44) {
                            PrintLow.format(var38, (SubLObject)$ic32$, var50);
                            var10_44 = var10_44.rest();
                            var50 = var10_44.first();
                        }
                        PrintLow.format(var38, (SubLObject)$ic33$, var44, var45);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var42, (SubLObject)$ic12$);
                    }
                    var40 = var40.rest();
                    var41 = var40.first();
                }
                PrintLow.format(var38, (SubLObject)$ic34$);
            }
            finally {
                final SubLObject var51 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                    if (var37.isStream()) {
                        streams_high.close(var37, (SubLObject)UNPROVIDED);
                    }
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var51);
                }
            }
        }
        else if (var35.eql((SubLObject)$ic35$)) {
            if (NIL == var36) {
                var36 = module0075.f5175((SubLObject)$ic36$, (SubLObject)$ic21$, (SubLObject)UNPROVIDED);
            }
            SubLObject var52 = (SubLObject)NIL;
            try {
                var52 = compatibility.open_text(var36, (SubLObject)$ic23$);
                if (!var52.isStream()) {
                    Errors.error((SubLObject)$ic24$, var36);
                }
                final SubLObject var38 = var52;
                SubLObject var53 = Sequences.reverse($g1371$.getGlobalValue());
                SubLObject var54 = (SubLObject)NIL;
                var54 = var53.first();
                while (NIL != var53) {
                    SubLObject var56;
                    final SubLObject var55 = var56 = var54;
                    SubLObject var57 = (SubLObject)NIL;
                    SubLObject var58 = (SubLObject)NIL;
                    SubLObject var59 = (SubLObject)NIL;
                    SubLObject var60 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var56, var55, (SubLObject)$ic12$);
                    var57 = var56.first();
                    var56 = var56.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var56, var55, (SubLObject)$ic12$);
                    var58 = var56.first();
                    var56 = var56.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var56, var55, (SubLObject)$ic12$);
                    var59 = var56.first();
                    var56 = var56.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var56, var55, (SubLObject)$ic12$);
                    var60 = var56.first();
                    var56 = var56.rest();
                    if (NIL == var56) {
                        final SubLObject var61 = Strings.string(var57);
                        PrintLow.format(var38, (SubLObject)$ic37$, f7674(var61), var61);
                        if (var58.isString()) {
                            final SubLObject var62 = module0038.f2862(var58);
                            SubLObject var10_45 = conses_high.butlast(var62, (SubLObject)UNPROVIDED);
                            SubLObject var63 = (SubLObject)NIL;
                            var63 = var10_45.first();
                            while (NIL != var10_45) {
                                PrintLow.format(var38, (SubLObject)$ic38$, var63);
                                var10_45 = var10_45.rest();
                                var63 = var10_45.first();
                            }
                            PrintLow.format(var38, (SubLObject)$ic39$, conses_high.last(var62, (SubLObject)UNPROVIDED).first());
                        }
                        else if (var58.isSymbol()) {
                            PrintLow.format(var38, (SubLObject)$ic39$, Symbols.symbol_name(var58));
                        }
                        else {
                            PrintLow.format(var38, (SubLObject)$ic39$, var58);
                        }
                        final SubLObject var62 = module0038.f2862(var60);
                        SubLObject var10_46 = conses_high.butlast(var62, (SubLObject)UNPROVIDED);
                        SubLObject var63 = (SubLObject)NIL;
                        var63 = var10_46.first();
                        while (NIL != var10_46) {
                            PrintLow.format(var38, (SubLObject)$ic38$, var63);
                            var10_46 = var10_46.rest();
                            var63 = var10_46.first();
                        }
                        PrintLow.format(var38, (SubLObject)$ic39$, conses_high.last(var62, (SubLObject)UNPROVIDED).first());
                        PrintLow.format(var38, (SubLObject)$ic39$, Sequences.substitute((SubLObject)Characters.CHAR_underbar, (SubLObject)Characters.CHAR_hyphen, Strings.string_downcase(Strings.string(var59), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                        streams_high.terpri(var38);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var55, (SubLObject)$ic12$);
                    }
                    var53 = var53.rest();
                    var54 = var53.first();
                }
            }
            finally {
                final SubLObject var64 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                    if (var52.isStream()) {
                        streams_high.close(var52, (SubLObject)UNPROVIDED);
                    }
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var64);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7678() {
        final SubLObject var52 = module0075.f5175((SubLObject)$ic20$, (SubLObject)$ic21$, (SubLObject)$ic22$);
        if (NIL != Filesys.probe_file(var52)) {
            SubLObject var53 = (SubLObject)NIL;
            try {
                var53 = compatibility.open_text(var52, (SubLObject)$ic40$);
                if (!var53.isStream()) {
                    Errors.error((SubLObject)$ic24$, var52);
                }
                final SubLObject var54_55 = var53;
                SubLObject var54 = (SubLObject)NIL;
                while (NIL == var54) {
                    final SubLObject var55 = f7679(var54_55);
                    if ($ic41$ == var55) {
                        var54 = (SubLObject)T;
                    }
                    else {
                        f7680(var55);
                    }
                }
            }
            finally {
                final SubLObject var56 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                    if (var53.isStream()) {
                        streams_high.close(var53, (SubLObject)UNPROVIDED);
                    }
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var56);
                }
            }
        }
        else {
            Errors.warn((SubLObject)$ic42$, var52);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7679(final SubLObject var54) {
        final SubLThread var55 = SubLProcess.currentSubLThread();
        SubLObject var56 = (SubLObject)NIL;
        final SubLObject var57 = reader.$read_eval$.currentBinding(var55);
        try {
            reader.$read_eval$.bind((SubLObject)NIL, var55);
            var56 = reader.read(var54, (SubLObject)NIL, (SubLObject)$ic41$, (SubLObject)UNPROVIDED);
        }
        finally {
            reader.$read_eval$.rebind(var57, var55);
        }
        return var56;
    }
    
    public static SubLObject f7680(final SubLObject var57) {
        SubLObject var58 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var57, var57, (SubLObject)$ic43$);
        var58 = var57.first();
        final SubLObject var60;
        final SubLObject var59 = var60 = var57.rest();
        final SubLObject var61 = var58;
        if (var61.eql((SubLObject)$ic44$)) {
            Eval.eval((SubLObject)$ic45$);
        }
        else if (var61.eql((SubLObject)$ic46$)) {
            SubLObject var66_67;
            final SubLObject var64_65 = var66_67 = var60;
            SubLObject var62 = (SubLObject)NIL;
            SubLObject var63 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var66_67, var64_65, (SubLObject)$ic47$);
            var62 = var66_67.first();
            var66_67 = var66_67.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var66_67, var64_65, (SubLObject)$ic47$);
            var63 = var66_67.first();
            var66_67 = var66_67.rest();
            if (NIL == var66_67) {
                if (NIL != conses_high.member(var62, $g1371$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic1$))) {
                    Symbols.set(var62, f7681(var63));
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var64_65, (SubLObject)$ic47$);
            }
        }
        else if (var61.eql((SubLObject)$ic48$)) {
            f7673();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7681(final SubLObject var9) {
        if (var9.isAtom()) {
            return var9;
        }
        SubLObject var10 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var9, (SubLObject)$ic43$);
        var10 = var9.first();
        final SubLObject var12;
        final SubLObject var11 = var12 = var9.rest();
        if ($ic9$ == var10) {
            return var12.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7682() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0110", "f7667", "S#9655", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0110", "f7668", "S#9656", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0110", "f7669", "S#9657", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0110", "f7670", "S#9658", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0110", "f7671", "S#9659");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0110", "f7672", "S#9660", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0110", "f7673", "S#9661", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0110", "f7674", "S#9662", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0110", "f7675", "S#9663", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0110", "f7676", "S#9664", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0110", "f7677", "S#9665", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0110", "f7678", "LOAD-SYSTEM-PARAMETERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0110", "f7679", "S#9666", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0110", "f7680", "S#9667", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0110", "f7681", "S#9668", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7683() {
        $g1371$ = SubLFiles.deflexical("S#9669", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic0$)) ? $g1371$.getGlobalValue() : NIL));
        $g1372$ = SubLFiles.defvar("*AUTO-CONTINUE-TRANSCRIPT-PROBLEMS*", (SubLObject)$ic11$);
        $g1373$ = SubLFiles.defvar("*CONTINUE-AGENDA-ON-ERROR*", (SubLObject)$ic11$);
        $g1374$ = SubLFiles.defvar("*SUSPEND-SBHL-TYPE-CHECKING?*", (SubLObject)$ic11$);
        $g1375$ = SubLFiles.defvar("*REALLY-COUNT-TRANSCRIPT-OPS*", (SubLObject)$ic11$);
        $g1376$ = SubLFiles.defvar("*DONT-RECORD-OPERATIONS-LOCALLY*", (SubLObject)$ic11$);
        $g1377$ = SubLFiles.defvar("*START-AGENDA-AT-STARTUP?*", (SubLObject)$ic11$);
        $g1378$ = SubLFiles.defvar("*BASE-TCP-PORT*", (SubLObject)$ic11$);
        $g1379$ = SubLFiles.defvar("*HTML-PORT-OFFSET*", (SubLObject)$ic11$);
        $g1380$ = SubLFiles.defvar("*FI-PORT-OFFSET*", (SubLObject)$ic11$);
        $g1381$ = SubLFiles.defvar("*HTTP-PORT-OFFSET*", (SubLObject)$ic11$);
        $g1382$ = SubLFiles.defvar("*SERVLET-PORT-OFFSET*", (SubLObject)$ic11$);
        $g1383$ = SubLFiles.defvar("*CFASL-PORT-OFFSET*", (SubLObject)$ic11$);
        $g1384$ = SubLFiles.defvar("S#9670", (SubLObject)$ic11$);
        $g41$ = SubLFiles.defvar("*PERMIT-API-HOST-ACCESS*", (SubLObject)$ic11$);
        $g1385$ = SubLFiles.defvar("*USE-TRANSCRIPT-SERVER*", (SubLObject)$ic11$);
        $g1386$ = SubLFiles.defvar("*MASTER-TRANSCRIPT-LOCK-HOST*", (SubLObject)$ic11$);
        $g1387$ = SubLFiles.defvar("*MASTER-TRANSCRIPT-SERVER-PORT*", (SubLObject)$ic11$);
        $g1388$ = SubLFiles.defvar("*CB-EDITING-ENABLED?*", (SubLObject)$ic11$);
        $g1389$ = SubLFiles.defvar("*ALLOW-GUEST-TO-EDIT?*", (SubLObject)$ic11$);
        $g1362$ = SubLFiles.defvar("*DEFAULT-CYCLIST-NAME*", (SubLObject)$ic11$);
        $g120$ = SubLFiles.defvar("*HTTP-HTDOCS-DIRECTORY*", (SubLObject)$ic11$);
        $g124$ = SubLFiles.defvar("*HTML-IMAGE-DIRECTORY*", (SubLObject)$ic11$);
        $g113$ = SubLFiles.defvar("*HTML-JAVASCRIPT-DIRECTORY*", (SubLObject)$ic11$);
        $g118$ = SubLFiles.defvar("*HTML-CSS-DIRECTORY*", (SubLObject)$ic11$);
        $g536$ = SubLFiles.defvar("*PERMIT-UTF-8-CHARACTER-DISPLAY*", (SubLObject)$ic11$);
        $g127$ = SubLFiles.defvar("*CYC-DOCUMENTATION-URL*", (SubLObject)$ic11$);
        $g570$ = SubLFiles.defvar("*CYC-CGI-PROGRAM*", (SubLObject)$ic11$);
        $g1390$ = SubLFiles.defvar("*CONSTANT-NAME-GREP-ENABLED*", (SubLObject)$ic11$);
        $g1391$ = SubLFiles.defvar("*CYC-GREP-CGI-PROGRAM*", (SubLObject)$ic11$);
        $g1392$ = SubLFiles.deflexical("S#9671", (SubLObject)$ic125$);
        $g36$ = SubLFiles.defvar("*CYC-EXECUTION-CONTEXT*", (SubLObject)$ic11$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7684() {
        module0003.f57((SubLObject)$ic0$);
        f7668((SubLObject)$ic49$, (SubLObject)T, (SubLObject)$ic50$, (SubLObject)$ic51$);
        f7668((SubLObject)$ic52$, (SubLObject)T, (SubLObject)$ic50$, (SubLObject)$ic53$);
        f7668((SubLObject)$ic54$, (SubLObject)NIL, (SubLObject)$ic50$, (SubLObject)$ic55$);
        f7668((SubLObject)$ic56$, (SubLObject)NIL, (SubLObject)$ic50$, (SubLObject)$ic57$);
        f7668((SubLObject)$ic58$, (SubLObject)NIL, (SubLObject)$ic50$, (SubLObject)$ic59$);
        f7668((SubLObject)$ic60$, (SubLObject)T, (SubLObject)$ic50$, (SubLObject)$ic61$);
        f7668((SubLObject)$ic62$, (SubLObject)$ic63$, (SubLObject)$ic64$, (SubLObject)$ic65$);
        f7668((SubLObject)$ic66$, (SubLObject)ZERO_INTEGER, (SubLObject)$ic67$, (SubLObject)$ic68$);
        f7668((SubLObject)$ic69$, (SubLObject)ONE_INTEGER, (SubLObject)$ic67$, (SubLObject)$ic70$);
        f7668((SubLObject)$ic71$, (SubLObject)TWO_INTEGER, (SubLObject)$ic67$, (SubLObject)$ic72$);
        f7668((SubLObject)$ic73$, (SubLObject)THREE_INTEGER, (SubLObject)$ic67$, (SubLObject)$ic74$);
        f7668((SubLObject)$ic75$, (SubLObject)FOURTEEN_INTEGER, (SubLObject)$ic67$, (SubLObject)$ic76$);
        f7668((SubLObject)$ic77$, (SubLObject)FIFTEEN_INTEGER, (SubLObject)$ic67$, (SubLObject)$ic78$);
        f7668((SubLObject)$ic79$, (SubLObject)NIL, (SubLObject)$ic50$, (SubLObject)$ic80$);
        f7668((SubLObject)$ic81$, (SubLObject)T, (SubLObject)$ic50$, (SubLObject)$ic82$);
        f7668((SubLObject)$ic83$, (SubLObject)NIL, (SubLObject)$ic50$, (SubLObject)$ic84$);
        f7668((SubLObject)$ic85$, (SubLObject)NIL, (SubLObject)$ic86$, (SubLObject)$ic87$);
        f7668((SubLObject)$ic88$, (SubLObject)$ic89$, (SubLObject)$ic90$, (SubLObject)$ic91$);
        f7668((SubLObject)$ic92$, (SubLObject)T, (SubLObject)$ic50$, (SubLObject)$ic93$);
        f7668((SubLObject)$ic94$, (SubLObject)NIL, (SubLObject)$ic50$, (SubLObject)$ic95$);
        f7668((SubLObject)$ic96$, (SubLObject)$ic97$, (SubLObject)$ic98$, (SubLObject)$ic99$);
        f7668((SubLObject)$ic100$, (SubLObject)$ic101$, (SubLObject)$ic102$, (SubLObject)$ic103$);
        f7668((SubLObject)$ic104$, (SubLObject)$ic105$, (SubLObject)$ic98$, (SubLObject)$ic106$);
        f7668((SubLObject)$ic107$, (SubLObject)$ic108$, (SubLObject)$ic98$, (SubLObject)$ic109$);
        f7668((SubLObject)$ic110$, (SubLObject)$ic111$, (SubLObject)$ic98$, (SubLObject)$ic109$);
        f7668((SubLObject)$ic112$, (SubLObject)T, (SubLObject)$ic50$, (SubLObject)$ic113$);
        f7668((SubLObject)$ic114$, (SubLObject)$ic115$, (SubLObject)$ic98$, (SubLObject)$ic116$);
        f7668((SubLObject)$ic117$, (SubLObject)$ic118$, (SubLObject)$ic98$, (SubLObject)$ic119$);
        f7668((SubLObject)$ic120$, (SubLObject)NIL, (SubLObject)$ic50$, (SubLObject)$ic121$);
        f7668((SubLObject)$ic122$, (SubLObject)$ic123$, (SubLObject)$ic98$, (SubLObject)$ic124$);
        f7668((SubLObject)$ic126$, (SubLObject)$ic127$, (SubLObject)$ic128$, (SubLObject)$ic129$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f7682();
    }
    
    public void initializeVariables() {
        f7683();
    }
    
    public void runTopLevelForms() {
        f7684();
    }
    
    static {
        me = (SubLFile)new module0110();
        $g1371$ = null;
        $g1372$ = null;
        $g1373$ = null;
        $g1374$ = null;
        $g1375$ = null;
        $g1376$ = null;
        $g1377$ = null;
        $g1378$ = null;
        $g1379$ = null;
        $g1380$ = null;
        $g1381$ = null;
        $g1382$ = null;
        $g1383$ = null;
        $g1384$ = null;
        $g41$ = null;
        $g1385$ = null;
        $g1386$ = null;
        $g1387$ = null;
        $g1388$ = null;
        $g1389$ = null;
        $g1362$ = null;
        $g120$ = null;
        $g124$ = null;
        $g113$ = null;
        $g118$ = null;
        $g536$ = null;
        $g127$ = null;
        $g570$ = null;
        $g1390$ = null;
        $g1391$ = null;
        $g1392$ = null;
        $g36$ = null;
        $ic0$ = makeSymbol("S#9669", "CYC");
        $ic1$ = makeSymbol("FIRST");
        $ic2$ = makeString("~S ~S has an unknown type ~S.");
        $ic3$ = makeSymbol("S#9659", "CYC");
        $ic4$ = makeSymbol("SYMBOLP");
        $ic5$ = makeSymbol("CAR");
        $ic6$ = ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("S#9672", "CYC"), (SubLObject)makeSymbol("TYPE"), (SubLObject)makeSymbol("S#669", "CYC"));
        $ic7$ = makeSymbol("PROGN");
        $ic8$ = makeSymbol("S#9656", "CYC");
        $ic9$ = makeSymbol("QUOTE");
        $ic10$ = makeSymbol("DEFVAR");
        $ic11$ = makeKeyword("UNSET");
        $ic12$ = ConsesLow.list((SubLObject)makeSymbol("SYMBOL"), (SubLObject)makeSymbol("S#9672", "CYC"), (SubLObject)makeSymbol("TYPE"), (SubLObject)makeSymbol("S#669", "CYC"));
        $ic13$ = makeString("The system parameter ~S is not bound.");
        $ic14$ = makeString("The system parameter ~S was not initialized.");
        $ic15$ = makeString("The system parameter ~A has a bogus type definition of ~A.");
        $ic16$ = makeString("The system paramater ~S has the value ~S, but it is supposed to be ~S.");
        $ic17$ = Vectors.vector(new SubLObject[] { Characters.CHAR_0, Characters.CHAR_1, Characters.CHAR_2, Characters.CHAR_3, Characters.CHAR_4, Characters.CHAR_5, Characters.CHAR_6, Characters.CHAR_7, Characters.CHAR_8, Characters.CHAR_9, Characters.CHAR_A, Characters.CHAR_B, Characters.CHAR_C, Characters.CHAR_D, Characters.CHAR_E, Characters.CHAR_F });
        $ic18$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#9673", "CYC"), (SubLObject)makeSymbol("S#9674", "CYC"));
        $ic19$ = makeKeyword("LISP");
        $ic20$ = ConsesLow.list((SubLObject)makeString("init"));
        $ic21$ = makeString("parameters");
        $ic22$ = makeString("lisp");
        $ic23$ = makeKeyword("OUTPUT");
        $ic24$ = makeString("Unable to open ~S");
        $ic25$ = makeString(";;; -*- Mode: LISP; Syntax: ANSI-Common-Lisp; Base: 10; Package: CYC;  -*-~%~%");
        $ic26$ = makeString(";;; Cyc system parameters~%");
        $ic27$ = makeString(";;;~%");
        $ic28$ = makeString(";;; Generated ~A from CycL ~A~%~%");
        $ic29$ = makeString("(in-package :CYC)~%~%");
        $ic30$ = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)makeString("T"), (SubLObject)makeString("::TRUE::")), (SubLObject)ConsesLow.cons((SubLObject)makeString("NIL"), (SubLObject)makeString("::FALSE::")));
        $ic31$ = makeString(";;; Possible Values: ~A~%");
        $ic32$ = makeString(";;; ~A~%");
        $ic33$ = makeString("(csetq ~A ~S)~%~%");
        $ic34$ = makeString("(check-system-parameters)~%");
        $ic35$ = makeKeyword("CONFIG");
        $ic36$ = ConsesLow.list((SubLObject)makeString("data"));
        $ic37$ = makeString("~A~%~A~%");
        $ic38$ = makeString("~A\\~%");
        $ic39$ = makeString("~A~%");
        $ic40$ = makeKeyword("INPUT");
        $ic41$ = makeKeyword("EOF");
        $ic42$ = makeString("System parameters file (~A) not loaded.");
        $ic43$ = ConsesLow.list((SubLObject)makeSymbol("S#166", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#105", "CYC"));
        $ic44$ = makeSymbol("IN-PACKAGE");
        $ic45$ = ConsesLow.list((SubLObject)makeSymbol("IN-PACKAGE"), (SubLObject)makeString("CYC"));
        $ic46$ = makeSymbol("CSETQ");
        $ic47$ = ConsesLow.list((SubLObject)makeSymbol("SYMBOL"), (SubLObject)makeSymbol("S#132", "CYC"));
        $ic48$ = makeSymbol("S#9661", "CYC");
        $ic49$ = makeSymbol("*AUTO-CONTINUE-TRANSCRIPT-PROBLEMS*");
        $ic50$ = makeSymbol("BOOLEAN");
        $ic51$ = makeString("If ::FALSE::, transcript problems will cause error breaks that \nmake the system stop. If ::TRUE::, such problems will not cause the\nthe system to stop.");
        $ic52$ = makeSymbol("*CONTINUE-AGENDA-ON-ERROR*");
        $ic53$ = makeString("If ::FALSE::, agenda errors will cause the agenda process to halt.  \nIf ::TRUE::, the agenda continue automatically.");
        $ic54$ = makeSymbol("*SUSPEND-SBHL-TYPE-CHECKING?*");
        $ic55$ = makeString("Type checking occurs in SBHL modules iff this is ::FALSE::, which\nis slower but correcter.");
        $ic56$ = makeSymbol("*REALLY-COUNT-TRANSCRIPT-OPS*");
        $ic57$ = makeString("If ::FALSE::, the System Info page (accessible to administrators \nonly)  will estimate, rather than actually count, the number of \noperations in the transcript.  If ::TRUE::, it will actually \ncount them, which takes longer but is accurate.");
        $ic58$ = makeSymbol("*DONT-RECORD-OPERATIONS-LOCALLY*");
        $ic59$ = makeString("If ::FALSE::, a local transcript will always be written when \noperations are done, even if those operations are also being written to \nthe master transcript.  If ::TRUE::, then the image does not write to a \nlocal transcript file, and will write to the master transcript when\nit is set to transmit operations.  This allows an image that is \nstandalone, and transmitting and receiving opertions, to keep only a \nsingle copy of its operations.");
        $ic60$ = makeSymbol("*START-AGENDA-AT-STARTUP?*");
        $ic61$ = makeString("If ::FALSE::, the Cyc agenda is not started at startup, but can \nbe enabled later by the user.  If ::TRUE::, the agenda is enabled at \nstartup.");
        $ic62$ = makeSymbol("*BASE-TCP-PORT*");
        $ic63$ = makeInteger(3600);
        $ic64$ = makeSymbol("S#58", "CYC");
        $ic65$ = makeString("The base port number for all the TCP services for the Cyc image.");
        $ic66$ = makeSymbol("*HTML-PORT-OFFSET*");
        $ic67$ = makeSymbol("S#9653", "CYC");
        $ic68$ = makeString("This parameter specifies the offset of the HTML port offset\nfrom the base port number.\nNotice that the sum of this parameter and the base port number must\nstill be a number in the valid port number range.");
        $ic69$ = makeSymbol("*FI-PORT-OFFSET*");
        $ic70$ = makeString("This parameter specifies the offset of the ASCII based Cyc API\n (application program interface) service from the base port number.\nNotice that the sum of this parameter and the base port number must\nstill be a number in the valid port number range.");
        $ic71$ = makeSymbol("*HTTP-PORT-OFFSET*");
        $ic72$ = makeString("This parameter specifies the offset of the Cyc-internal HTTP port \nfrom the base port number.\nNotice that the sum of this parameter and the base port number must\nstill be a number in the valid port number range.");
        $ic73$ = makeSymbol("*SERVLET-PORT-OFFSET*");
        $ic74$ = makeString("This parameter specifies the offset of the Cyc-internal servlet-container port \nfrom the base port number.\nNotice that the sum of this parameter and the base port number must\nstill be a number in the valid port number range.");
        $ic75$ = makeSymbol("*CFASL-PORT-OFFSET*");
        $ic76$ = makeString("This parameter specifies the offset of the Cyc CFASL-server,\n a binary form of the FI (API) service, from the base port number.\nNotice that the sum of this parameter and the base port number must\nstill be a number in the valid port number range.");
        $ic77$ = makeSymbol("S#9670", "CYC");
        $ic78$ = makeString("This parameter specifies the offset of the Cyc SPARQL-server \nservice from the base port number.\nNotice that the sum of this parameter and the base port number must\nstill be a number in the valid port number range.");
        $ic79$ = makeSymbol("*TCP-LOCALHOST-ONLY?*");
        $ic80$ = makeString("IF ::FALSE::, then remote TCP clients can connect to Cyc, otherwise \nno remote connections are allowed. The most secure configuration \nleaves this parameter ::TRUE::, and uses a separate Web server to \nredirect HTTP requests to Cyc--which requires the HTML port to be\nconfigured and the HTTP port to be disabled.");
        $ic81$ = makeSymbol("*PERMIT-API-HOST-ACCESS*");
        $ic82$ = makeString("IF ::TRUE::, then API functions can access host services \nincluding the file system and outbound tcp connections. The most \nsecure configuration leaves this parameter ::FALSE::.");
        $ic83$ = makeSymbol("*USE-TRANSCRIPT-SERVER*");
        $ic84$ = makeString("IF ::TRUE::, then writing to the master transcript will be \ncontrolled by the Cyc Transcript Server, which will \nneed to be installed at your site. Set this to ::TRUE:: if \nyou are running multiple instances of Cyc.  If ::FALSE::, \nthen Cyc will read and write to the master transcript \nwithout regard to other processes doing the same.");
        $ic85$ = makeSymbol("*MASTER-TRANSCRIPT-LOCK-HOST*");
        $ic86$ = ConsesLow.list((SubLObject)makeSymbol("OR"), (SubLObject)makeSymbol("STRING"), (SubLObject)makeSymbol("S#4764", "CYC"));
        $ic87$ = makeString("This parameter is only used if *USE-TRANSCRIPT-SERVER* is ::TRUE::.  \nIf so, then this parameter should be set to the name of the host \nthat runs the transcript server; the port is specified with\n*MASTER-TRANSCRIPT-SERVER-PORT*.");
        $ic88$ = makeSymbol("*MASTER-TRANSCRIPT-SERVER-PORT*");
        $ic89$ = makeInteger(3608);
        $ic90$ = makeSymbol("INTEGER");
        $ic91$ = makeString("This parameter is only used if *USE-TRANSCRIPT-SERVER* is ::TRUE::.  \nIf so, then this parameter should be set to the port number \nof the host (specified with *MASTER-TRANSCRIPT-LOCK-HOST*)\nread service.");
        $ic92$ = makeSymbol("*CB-EDITING-ENABLED?*");
        $ic93$ = makeString("If ::FALSE::, tools for modifying the knowledge base are not accessible.");
        $ic94$ = makeSymbol("*ALLOW-GUEST-TO-EDIT?*");
        $ic95$ = makeString("If ::FALSE::, require authentication before allowing modifications\nto the knowledge base.  If ::TRUE::, any user is allowed to modify \nthe knowledge base.");
        $ic96$ = makeSymbol("*DEFAULT-CYCLIST-NAME*");
        $ic97$ = makeString("Guest");
        $ic98$ = makeSymbol("STRING");
        $ic99$ = makeString("Specifies the name of the default Cyclist constant under which\nusers browse the system before they log in.");
        $ic100$ = makeSymbol("*HTTP-HTDOCS-DIRECTORY*");
        $ic101$ = makeString("httpd/htdocs");
        $ic102$ = makeSymbol("S#9652", "CYC");
        $ic103$ = makeString("The directory under which documents served by the HTTP server are stored.");
        $ic104$ = makeSymbol("*HTML-IMAGE-DIRECTORY*");
        $ic105$ = makeString("/cycdoc/img/");
        $ic106$ = makeString("The directory, relative to *HTTP-HTDOCS-DIRECTORY*, under which \nCyc images (.gif or otherwise) are stored");
        $ic107$ = makeSymbol("*HTML-JAVASCRIPT-DIRECTORY*");
        $ic108$ = makeString("/cycdoc/js/");
        $ic109$ = makeString("The directory, relative to *HTTP-HTDOCS-DIRECTORY*, under which \nJavascript files used by the browser are stored");
        $ic110$ = makeSymbol("*HTML-CSS-DIRECTORY*");
        $ic111$ = makeString("/cycdoc/css/");
        $ic112$ = makeSymbol("*PERMIT-UTF-8-CHARACTER-DISPLAY*");
        $ic113$ = makeString("If ::TRUE::, the html tools will correctly display UTF-8 text\nderived from Cyc strings.");
        $ic114$ = makeSymbol("*CYC-DOCUMENTATION-URL*");
        $ic115$ = makeString("/cycdoc/");
        $ic116$ = makeString("The directory, relative to *HTTP-HTDOCS-DIRECTORY*, for the \nCyc system documentation directory.");
        $ic117$ = makeSymbol("*CYC-CGI-PROGRAM*");
        $ic118$ = makeString("cg");
        $ic119$ = makeString("The name of the CGI program that acts as the intermediary \nbetween your WWW server and a Cyc server  Normally, the\nprogram will be called ``cg''.  However, if your WWW server requires that\nCGI program names have a certain form, such as ``cg.exe'', then change\nthis parameter to conform. This is relevant only if the HTML service\nis enabled.");
        $ic120$ = makeSymbol("*CONSTANT-NAME-GREP-ENABLED*");
        $ic121$ = makeString("If ::TRUE::, the HTML browser allows users to  search for\nconstants via regular expressions via an external program, rather\nthan the internal search facility. Use of this facility requires the\nconstant-name-grep CGI program and the data file constant-shell.text to\nbe installed on your WWW server, and that the HTML service be enabled.");
        $ic122$ = makeSymbol("*CYC-GREP-CGI-PROGRAM*");
        $ic123$ = makeString("constant-name-grep");
        $ic124$ = makeString("The name of the CGI program that is used for performing \nregular expression searches over constant names.  Normally, the\nprogram will be called ``constant-name-grep''.  However, if your WWW server\nrequires that CGI program names have a certain form, such as \n``constant-name-grep.exe'', then change this parameter to conform.\nThis is relevant only if the HTML service is enabled.");
        $ic125$ = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)makeKeyword("CYCORP"), (SubLObject)makeString("Assume a Cycorp execution context.")), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("UNKNOWN"), (SubLObject)makeString("Assume an unknown execution context.")));
        $ic126$ = makeSymbol("*CYC-EXECUTION-CONTEXT*");
        $ic127$ = makeKeyword("UNKNOWN");
        $ic128$ = ConsesLow.list((SubLObject)makeSymbol("MEMBER"), (SubLObject)makeSymbol("S#9671", "CYC"));
        $ic129$ = makeString("If the execution context is set to :CYCORP, then the CYC image \ncan assume that it is running in Cycorp's development environment \nand make strong assumptions about setup and infrastructure.");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 234 ms
	
	Decompiled with Procyon 0.5.32.
*/