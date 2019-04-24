package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)module0110.$ic1$), module0110.$g1371$.getGlobalValue());
    }
    
    public static SubLObject f7668(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4) {
        if (module0110.NIL == module0109.f7662(var3)) {
            Errors.warn((SubLObject)module0110.$ic2$, (SubLObject)module0110.$ic3$, var1, var3);
        }
        f7669(var1);
        module0110.$g1371$.setGlobalValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var1, var2, var3, var4), module0110.$g1371$.getGlobalValue()));
        return var1;
    }
    
    public static SubLObject f7669(final SubLObject var1) {
        assert module0110.NIL != Types.symbolp(var1) : var1;
        module0110.$g1371$.setGlobalValue(Sequences.delete(var1, module0110.$g1371$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0110.EQ), Symbols.symbol_function((SubLObject)module0110.$ic5$), (SubLObject)module0110.UNPROVIDED, (SubLObject)module0110.UNPROVIDED, (SubLObject)module0110.UNPROVIDED));
        return (SubLObject)module0110.NIL;
    }
    
    public static SubLObject f7670() {
        return Sequences.reverse(module0110.$g1371$.getGlobalValue());
    }
    
    public static SubLObject f7671(final SubLObject var5, final SubLObject var6) {
        SubLObject var8;
        final SubLObject var7 = var8 = var5.rest();
        SubLObject var9 = (SubLObject)module0110.NIL;
        SubLObject var10 = (SubLObject)module0110.NIL;
        SubLObject var11 = (SubLObject)module0110.NIL;
        SubLObject var12 = (SubLObject)module0110.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)module0110.$ic6$);
        var9 = var8.first();
        var8 = var8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)module0110.$ic6$);
        var10 = var8.first();
        var8 = var8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)module0110.$ic6$);
        var11 = var8.first();
        var8 = var8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)module0110.$ic6$);
        var12 = var8.first();
        var8 = var8.rest();
        if (module0110.NIL == var8) {
            return (SubLObject)ConsesLow.list((SubLObject)module0110.$ic7$, (SubLObject)ConsesLow.list((SubLObject)module0110.$ic8$, (SubLObject)ConsesLow.list((SubLObject)module0110.$ic9$, var9), (SubLObject)ConsesLow.list((SubLObject)module0110.$ic9$, var10), (SubLObject)ConsesLow.list((SubLObject)module0110.$ic9$, var11), (SubLObject)ConsesLow.list((SubLObject)module0110.$ic9$, var12)), (SubLObject)ConsesLow.list((SubLObject)module0110.$ic10$, var9, (SubLObject)module0110.$ic11$, var12));
        }
        cdestructuring_bind.cdestructuring_bind_error(var7, (SubLObject)module0110.$ic6$);
        return (SubLObject)module0110.NIL;
    }
    
    public static SubLObject f7672(final SubLObject var9) {
        return Equality.eq(var9, (SubLObject)module0110.$ic11$);
    }
    
    public static SubLObject f7673() {
        SubLObject var10 = module0110.$g1371$.getGlobalValue();
        SubLObject var11 = (SubLObject)module0110.NIL;
        var11 = var10.first();
        while (module0110.NIL != var10) {
            SubLObject var13;
            final SubLObject var12 = var13 = var11;
            SubLObject var14 = (SubLObject)module0110.NIL;
            SubLObject var15 = (SubLObject)module0110.NIL;
            SubLObject var16 = (SubLObject)module0110.NIL;
            SubLObject var17 = (SubLObject)module0110.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0110.$ic12$);
            var14 = var13.first();
            var13 = var13.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0110.$ic12$);
            var15 = var13.first();
            var13 = var13.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0110.$ic12$);
            var16 = var13.first();
            var13 = var13.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0110.$ic12$);
            var17 = var13.first();
            var13 = var13.rest();
            if (module0110.NIL == var13) {
                if (module0110.NIL == Symbols.boundp(var14)) {
                    Errors.warn((SubLObject)module0110.$ic13$, var14);
                }
                else if (module0110.NIL != f7672(Symbols.symbol_value(var14))) {
                    Errors.warn((SubLObject)module0110.$ic14$, var14);
                }
                else if (module0110.NIL == module0109.f7662(var16)) {
                    Errors.warn((SubLObject)module0110.$ic15$, var14, var16);
                }
                else {
                    final SubLObject var18 = Symbols.symbol_value(var14);
                    if (module0110.NIL == module0109.f7663(var18, var16)) {
                        Errors.warn((SubLObject)module0110.$ic16$, var14, var18, var16);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)module0110.$ic12$);
            }
            var10 = var10.rest();
            var11 = var10.first();
        }
        return (SubLObject)module0110.NIL;
    }
    
    public static SubLObject f7674(final SubLObject var15) {
        SubLObject var16 = Numbers.add(Sequences.length(var15), (SubLObject)module0110.ONE_INTEGER);
        SubLObject var17;
        SubLObject var18;
        for (var17 = Sequences.length(var15), var18 = (SubLObject)module0110.NIL, var18 = (SubLObject)module0110.ZERO_INTEGER; var18.numL(var17); var18 = Numbers.add(var18, (SubLObject)module0110.ONE_INTEGER)) {
            if (module0110.NIL == Characters.alphanumericp(Strings.sublisp_char(var15, var18))) {
                var16 = Numbers.add(var16, (SubLObject)module0110.ONE_INTEGER);
            }
        }
        final SubLObject var19 = Strings.make_string(var16, (SubLObject)module0110.UNPROVIDED);
        SubLObject var20 = (SubLObject)module0110.ONE_INTEGER;
        Strings.set_char(var19, (SubLObject)module0110.ZERO_INTEGER, (SubLObject)Characters.CHAR_E);
        SubLObject var21;
        SubLObject var22;
        SubLObject var23;
        SubLObject var24;
        SubLObject var25;
        for (var21 = Sequences.length(var15), var22 = (SubLObject)module0110.NIL, var22 = (SubLObject)module0110.ZERO_INTEGER; var22.numL(var21); var22 = Numbers.add(var22, (SubLObject)module0110.ONE_INTEGER)) {
            var23 = Strings.sublisp_char(var15, var22);
            if (module0110.NIL != Characters.alphanumericp(var23)) {
                Strings.set_char(var19, var20, var23);
                var20 = Numbers.add(var20, (SubLObject)module0110.ONE_INTEGER);
            }
            else {
                var24 = Characters.char_code(var23);
                var25 = module0110.$ic17$;
                Strings.set_char(var19, var20, Vectors.aref(var25, Numbers.integerDivide(var24, (SubLObject)module0110.SIXTEEN_INTEGER)));
                var20 = Numbers.add(var20, (SubLObject)module0110.ONE_INTEGER);
                Strings.set_char(var19, var20, Vectors.aref(var25, Numbers.mod(var24, (SubLObject)module0110.SIXTEEN_INTEGER)));
                var20 = Numbers.add(var20, (SubLObject)module0110.ONE_INTEGER);
            }
        }
        return var19;
    }
    
    public static SubLObject f7675(final SubLObject var4, final SubLObject var24, SubLObject var25) {
        if (var25 == module0110.UNPROVIDED) {
            var25 = Symbols.symbol_function((SubLObject)module0110.EQUAL);
        }
        final SubLObject var26 = module0038.f2862(var4);
        return f7676(var26, var24, var25);
    }
    
    public static SubLObject f7676(final SubLObject var26, final SubLObject var24, SubLObject var25) {
        if (var25 == module0110.UNPROVIDED) {
            var25 = Symbols.symbol_function((SubLObject)module0110.EQUAL);
        }
        SubLObject var27 = (SubLObject)module0110.NIL;
        SubLObject var28 = var26;
        SubLObject var29 = (SubLObject)module0110.NIL;
        var29 = var28.first();
        while (module0110.NIL != var28) {
            SubLObject var10_29 = var24;
            SubLObject var30 = (SubLObject)module0110.NIL;
            var30 = var10_29.first();
            while (module0110.NIL != var10_29) {
                SubLObject var32;
                final SubLObject var31 = var32 = var30;
                SubLObject var33 = (SubLObject)module0110.NIL;
                SubLObject var34 = (SubLObject)module0110.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)module0110.$ic18$);
                var33 = var32.first();
                var32 = (var34 = var32.rest());
                if (module0110.NIL != Sequences.search(var34, var29, var25, (SubLObject)module0110.UNPROVIDED, (SubLObject)module0110.UNPROVIDED, (SubLObject)module0110.UNPROVIDED, (SubLObject)module0110.UNPROVIDED, (SubLObject)module0110.UNPROVIDED)) {
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
        if (var36 == module0110.UNPROVIDED) {
            var36 = (SubLObject)module0110.NIL;
        }
        if (var35.eql((SubLObject)module0110.$ic19$)) {
            if (module0110.NIL == var36) {
                var36 = module0075.f5175((SubLObject)module0110.$ic20$, (SubLObject)module0110.$ic21$, (SubLObject)module0110.$ic22$);
            }
            SubLObject var37 = (SubLObject)module0110.NIL;
            try {
                var37 = compatibility.open_text(var36, (SubLObject)module0110.$ic23$);
                if (!var37.isStream()) {
                    Errors.error((SubLObject)module0110.$ic24$, var36);
                }
                final SubLObject var38 = var37;
                PrintLow.format(var38, (SubLObject)module0110.$ic25$);
                PrintLow.format(var38, (SubLObject)module0110.$ic26$);
                PrintLow.format(var38, (SubLObject)module0110.$ic27$);
                PrintLow.format(var38, (SubLObject)module0110.$ic28$, module0051.f3552((SubLObject)module0110.UNPROVIDED), module0011.f351());
                PrintLow.format(var38, (SubLObject)module0110.$ic29$);
                final SubLObject var39 = (SubLObject)module0110.$ic30$;
                SubLObject var40 = f7670();
                SubLObject var41 = (SubLObject)module0110.NIL;
                var41 = var40.first();
                while (module0110.NIL != var40) {
                    SubLObject var43;
                    final SubLObject var42 = var43 = var41;
                    SubLObject var44 = (SubLObject)module0110.NIL;
                    SubLObject var45 = (SubLObject)module0110.NIL;
                    SubLObject var46 = (SubLObject)module0110.NIL;
                    SubLObject var47 = (SubLObject)module0110.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var43, var42, (SubLObject)module0110.$ic12$);
                    var44 = var43.first();
                    var43 = var43.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var43, var42, (SubLObject)module0110.$ic12$);
                    var45 = var43.first();
                    var43 = var43.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var43, var42, (SubLObject)module0110.$ic12$);
                    var46 = var43.first();
                    var43 = var43.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var43, var42, (SubLObject)module0110.$ic12$);
                    var47 = var43.first();
                    var43 = var43.rest();
                    if (module0110.NIL == var43) {
                        final SubLObject var48 = module0109.f7661(var46, (SubLObject)module0110.UNPROVIDED);
                        final SubLObject var49 = f7676((SubLObject)ConsesLow.list(var48), var39, (SubLObject)module0110.UNPROVIDED).first();
                        PrintLow.format(var38, (SubLObject)module0110.$ic31$, var49);
                        SubLObject var10_44 = f7675(var47, var39, (SubLObject)module0110.UNPROVIDED);
                        SubLObject var50 = (SubLObject)module0110.NIL;
                        var50 = var10_44.first();
                        while (module0110.NIL != var10_44) {
                            PrintLow.format(var38, (SubLObject)module0110.$ic32$, var50);
                            var10_44 = var10_44.rest();
                            var50 = var10_44.first();
                        }
                        PrintLow.format(var38, (SubLObject)module0110.$ic33$, var44, var45);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var42, (SubLObject)module0110.$ic12$);
                    }
                    var40 = var40.rest();
                    var41 = var40.first();
                }
                PrintLow.format(var38, (SubLObject)module0110.$ic34$);
            }
            finally {
                final SubLObject var51 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0110.T);
                    if (var37.isStream()) {
                        streams_high.close(var37, (SubLObject)module0110.UNPROVIDED);
                    }
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var51);
                }
            }
        }
        else if (var35.eql((SubLObject)module0110.$ic35$)) {
            if (module0110.NIL == var36) {
                var36 = module0075.f5175((SubLObject)module0110.$ic36$, (SubLObject)module0110.$ic21$, (SubLObject)module0110.UNPROVIDED);
            }
            SubLObject var52 = (SubLObject)module0110.NIL;
            try {
                var52 = compatibility.open_text(var36, (SubLObject)module0110.$ic23$);
                if (!var52.isStream()) {
                    Errors.error((SubLObject)module0110.$ic24$, var36);
                }
                final SubLObject var38 = var52;
                SubLObject var53 = Sequences.reverse(module0110.$g1371$.getGlobalValue());
                SubLObject var54 = (SubLObject)module0110.NIL;
                var54 = var53.first();
                while (module0110.NIL != var53) {
                    SubLObject var56;
                    final SubLObject var55 = var56 = var54;
                    SubLObject var57 = (SubLObject)module0110.NIL;
                    SubLObject var58 = (SubLObject)module0110.NIL;
                    SubLObject var59 = (SubLObject)module0110.NIL;
                    SubLObject var60 = (SubLObject)module0110.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var56, var55, (SubLObject)module0110.$ic12$);
                    var57 = var56.first();
                    var56 = var56.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var56, var55, (SubLObject)module0110.$ic12$);
                    var58 = var56.first();
                    var56 = var56.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var56, var55, (SubLObject)module0110.$ic12$);
                    var59 = var56.first();
                    var56 = var56.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var56, var55, (SubLObject)module0110.$ic12$);
                    var60 = var56.first();
                    var56 = var56.rest();
                    if (module0110.NIL == var56) {
                        final SubLObject var61 = Strings.string(var57);
                        PrintLow.format(var38, (SubLObject)module0110.$ic37$, f7674(var61), var61);
                        if (var58.isString()) {
                            final SubLObject var62 = module0038.f2862(var58);
                            SubLObject var10_45 = conses_high.butlast(var62, (SubLObject)module0110.UNPROVIDED);
                            SubLObject var63 = (SubLObject)module0110.NIL;
                            var63 = var10_45.first();
                            while (module0110.NIL != var10_45) {
                                PrintLow.format(var38, (SubLObject)module0110.$ic38$, var63);
                                var10_45 = var10_45.rest();
                                var63 = var10_45.first();
                            }
                            PrintLow.format(var38, (SubLObject)module0110.$ic39$, conses_high.last(var62, (SubLObject)module0110.UNPROVIDED).first());
                        }
                        else if (var58.isSymbol()) {
                            PrintLow.format(var38, (SubLObject)module0110.$ic39$, Symbols.symbol_name(var58));
                        }
                        else {
                            PrintLow.format(var38, (SubLObject)module0110.$ic39$, var58);
                        }
                        final SubLObject var62 = module0038.f2862(var60);
                        SubLObject var10_46 = conses_high.butlast(var62, (SubLObject)module0110.UNPROVIDED);
                        SubLObject var63 = (SubLObject)module0110.NIL;
                        var63 = var10_46.first();
                        while (module0110.NIL != var10_46) {
                            PrintLow.format(var38, (SubLObject)module0110.$ic38$, var63);
                            var10_46 = var10_46.rest();
                            var63 = var10_46.first();
                        }
                        PrintLow.format(var38, (SubLObject)module0110.$ic39$, conses_high.last(var62, (SubLObject)module0110.UNPROVIDED).first());
                        PrintLow.format(var38, (SubLObject)module0110.$ic39$, Sequences.substitute((SubLObject)Characters.CHAR_underbar, (SubLObject)Characters.CHAR_hyphen, Strings.string_downcase(Strings.string(var59), (SubLObject)module0110.UNPROVIDED, (SubLObject)module0110.UNPROVIDED), (SubLObject)module0110.UNPROVIDED, (SubLObject)module0110.UNPROVIDED, (SubLObject)module0110.UNPROVIDED, (SubLObject)module0110.UNPROVIDED, (SubLObject)module0110.UNPROVIDED));
                        streams_high.terpri(var38);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var55, (SubLObject)module0110.$ic12$);
                    }
                    var53 = var53.rest();
                    var54 = var53.first();
                }
            }
            finally {
                final SubLObject var64 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0110.T);
                    if (var52.isStream()) {
                        streams_high.close(var52, (SubLObject)module0110.UNPROVIDED);
                    }
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var64);
                }
            }
        }
        return (SubLObject)module0110.NIL;
    }
    
    public static SubLObject f7678() {
        final SubLObject var52 = module0075.f5175((SubLObject)module0110.$ic20$, (SubLObject)module0110.$ic21$, (SubLObject)module0110.$ic22$);
        if (module0110.NIL != Filesys.probe_file(var52)) {
            SubLObject var53 = (SubLObject)module0110.NIL;
            try {
                var53 = compatibility.open_text(var52, (SubLObject)module0110.$ic40$);
                if (!var53.isStream()) {
                    Errors.error((SubLObject)module0110.$ic24$, var52);
                }
                final SubLObject var54_55 = var53;
                SubLObject var54 = (SubLObject)module0110.NIL;
                while (module0110.NIL == var54) {
                    final SubLObject var55 = f7679(var54_55);
                    if (module0110.$ic41$ == var55) {
                        var54 = (SubLObject)module0110.T;
                    }
                    else {
                        f7680(var55);
                    }
                }
            }
            finally {
                final SubLObject var56 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0110.T);
                    if (var53.isStream()) {
                        streams_high.close(var53, (SubLObject)module0110.UNPROVIDED);
                    }
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var56);
                }
            }
        }
        else {
            Errors.warn((SubLObject)module0110.$ic42$, var52);
        }
        return (SubLObject)module0110.NIL;
    }
    
    public static SubLObject f7679(final SubLObject var54) {
        final SubLThread var55 = SubLProcess.currentSubLThread();
        SubLObject var56 = (SubLObject)module0110.NIL;
        final SubLObject var57 = reader.$read_eval$.currentBinding(var55);
        try {
            reader.$read_eval$.bind((SubLObject)module0110.NIL, var55);
            var56 = reader.read(var54, (SubLObject)module0110.NIL, (SubLObject)module0110.$ic41$, (SubLObject)module0110.UNPROVIDED);
        }
        finally {
            reader.$read_eval$.rebind(var57, var55);
        }
        return var56;
    }
    
    public static SubLObject f7680(final SubLObject var57) {
        SubLObject var58 = (SubLObject)module0110.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var57, var57, (SubLObject)module0110.$ic43$);
        var58 = var57.first();
        final SubLObject var60;
        final SubLObject var59 = var60 = var57.rest();
        final SubLObject var61 = var58;
        if (var61.eql((SubLObject)module0110.$ic44$)) {
            Eval.eval((SubLObject)module0110.$ic45$);
        }
        else if (var61.eql((SubLObject)module0110.$ic46$)) {
            SubLObject var66_67;
            final SubLObject var64_65 = var66_67 = var60;
            SubLObject var62 = (SubLObject)module0110.NIL;
            SubLObject var63 = (SubLObject)module0110.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var66_67, var64_65, (SubLObject)module0110.$ic47$);
            var62 = var66_67.first();
            var66_67 = var66_67.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var66_67, var64_65, (SubLObject)module0110.$ic47$);
            var63 = var66_67.first();
            var66_67 = var66_67.rest();
            if (module0110.NIL == var66_67) {
                if (module0110.NIL != conses_high.member(var62, module0110.$g1371$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0110.EQL), Symbols.symbol_function((SubLObject)module0110.$ic1$))) {
                    Symbols.set(var62, f7681(var63));
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var64_65, (SubLObject)module0110.$ic47$);
            }
        }
        else if (var61.eql((SubLObject)module0110.$ic48$)) {
            f7673();
        }
        return (SubLObject)module0110.NIL;
    }
    
    public static SubLObject f7681(final SubLObject var9) {
        if (var9.isAtom()) {
            return var9;
        }
        SubLObject var10 = (SubLObject)module0110.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var9, (SubLObject)module0110.$ic43$);
        var10 = var9.first();
        final SubLObject var12;
        final SubLObject var11 = var12 = var9.rest();
        if (module0110.$ic9$ == var10) {
            return var12.first();
        }
        return (SubLObject)module0110.NIL;
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
        return (SubLObject)module0110.NIL;
    }
    
    public static SubLObject f7683() {
        module0110.$g1371$ = SubLFiles.deflexical("S#9669", (SubLObject)((module0110.NIL != Symbols.boundp((SubLObject)module0110.$ic0$)) ? module0110.$g1371$.getGlobalValue() : module0110.NIL));
        module0110.$g1372$ = SubLFiles.defvar("*AUTO-CONTINUE-TRANSCRIPT-PROBLEMS*", (SubLObject)module0110.$ic11$);
        module0110.$g1373$ = SubLFiles.defvar("*CONTINUE-AGENDA-ON-ERROR*", (SubLObject)module0110.$ic11$);
        module0110.$g1374$ = SubLFiles.defvar("*SUSPEND-SBHL-TYPE-CHECKING?*", (SubLObject)module0110.$ic11$);
        module0110.$g1375$ = SubLFiles.defvar("*REALLY-COUNT-TRANSCRIPT-OPS*", (SubLObject)module0110.$ic11$);
        module0110.$g1376$ = SubLFiles.defvar("*DONT-RECORD-OPERATIONS-LOCALLY*", (SubLObject)module0110.$ic11$);
        module0110.$g1377$ = SubLFiles.defvar("*START-AGENDA-AT-STARTUP?*", (SubLObject)module0110.$ic11$);
        module0110.$g1378$ = SubLFiles.defvar("*BASE-TCP-PORT*", (SubLObject)module0110.$ic11$);
        module0110.$g1379$ = SubLFiles.defvar("*HTML-PORT-OFFSET*", (SubLObject)module0110.$ic11$);
        module0110.$g1380$ = SubLFiles.defvar("*FI-PORT-OFFSET*", (SubLObject)module0110.$ic11$);
        module0110.$g1381$ = SubLFiles.defvar("*HTTP-PORT-OFFSET*", (SubLObject)module0110.$ic11$);
        module0110.$g1382$ = SubLFiles.defvar("*SERVLET-PORT-OFFSET*", (SubLObject)module0110.$ic11$);
        module0110.$g1383$ = SubLFiles.defvar("*CFASL-PORT-OFFSET*", (SubLObject)module0110.$ic11$);
        module0110.$g1384$ = SubLFiles.defvar("S#9670", (SubLObject)module0110.$ic11$);
        module0110.$g41$ = SubLFiles.defvar("*PERMIT-API-HOST-ACCESS*", (SubLObject)module0110.$ic11$);
        module0110.$g1385$ = SubLFiles.defvar("*USE-TRANSCRIPT-SERVER*", (SubLObject)module0110.$ic11$);
        module0110.$g1386$ = SubLFiles.defvar("*MASTER-TRANSCRIPT-LOCK-HOST*", (SubLObject)module0110.$ic11$);
        module0110.$g1387$ = SubLFiles.defvar("*MASTER-TRANSCRIPT-SERVER-PORT*", (SubLObject)module0110.$ic11$);
        module0110.$g1388$ = SubLFiles.defvar("*CB-EDITING-ENABLED?*", (SubLObject)module0110.$ic11$);
        module0110.$g1389$ = SubLFiles.defvar("*ALLOW-GUEST-TO-EDIT?*", (SubLObject)module0110.$ic11$);
        module0110.$g1362$ = SubLFiles.defvar("*DEFAULT-CYCLIST-NAME*", (SubLObject)module0110.$ic11$);
        module0110.$g120$ = SubLFiles.defvar("*HTTP-HTDOCS-DIRECTORY*", (SubLObject)module0110.$ic11$);
        module0110.$g124$ = SubLFiles.defvar("*HTML-IMAGE-DIRECTORY*", (SubLObject)module0110.$ic11$);
        module0110.$g113$ = SubLFiles.defvar("*HTML-JAVASCRIPT-DIRECTORY*", (SubLObject)module0110.$ic11$);
        module0110.$g118$ = SubLFiles.defvar("*HTML-CSS-DIRECTORY*", (SubLObject)module0110.$ic11$);
        module0110.$g536$ = SubLFiles.defvar("*PERMIT-UTF-8-CHARACTER-DISPLAY*", (SubLObject)module0110.$ic11$);
        module0110.$g127$ = SubLFiles.defvar("*CYC-DOCUMENTATION-URL*", (SubLObject)module0110.$ic11$);
        module0110.$g570$ = SubLFiles.defvar("*CYC-CGI-PROGRAM*", (SubLObject)module0110.$ic11$);
        module0110.$g1390$ = SubLFiles.defvar("*CONSTANT-NAME-GREP-ENABLED*", (SubLObject)module0110.$ic11$);
        module0110.$g1391$ = SubLFiles.defvar("*CYC-GREP-CGI-PROGRAM*", (SubLObject)module0110.$ic11$);
        module0110.$g1392$ = SubLFiles.deflexical("S#9671", (SubLObject)module0110.$ic125$);
        module0110.$g36$ = SubLFiles.defvar("*CYC-EXECUTION-CONTEXT*", (SubLObject)module0110.$ic11$);
        return (SubLObject)module0110.NIL;
    }
    
    public static SubLObject f7684() {
        module0003.f57((SubLObject)module0110.$ic0$);
        f7668((SubLObject)module0110.$ic49$, (SubLObject)module0110.T, (SubLObject)module0110.$ic50$, (SubLObject)module0110.$ic51$);
        f7668((SubLObject)module0110.$ic52$, (SubLObject)module0110.T, (SubLObject)module0110.$ic50$, (SubLObject)module0110.$ic53$);
        f7668((SubLObject)module0110.$ic54$, (SubLObject)module0110.NIL, (SubLObject)module0110.$ic50$, (SubLObject)module0110.$ic55$);
        f7668((SubLObject)module0110.$ic56$, (SubLObject)module0110.NIL, (SubLObject)module0110.$ic50$, (SubLObject)module0110.$ic57$);
        f7668((SubLObject)module0110.$ic58$, (SubLObject)module0110.NIL, (SubLObject)module0110.$ic50$, (SubLObject)module0110.$ic59$);
        f7668((SubLObject)module0110.$ic60$, (SubLObject)module0110.T, (SubLObject)module0110.$ic50$, (SubLObject)module0110.$ic61$);
        f7668((SubLObject)module0110.$ic62$, (SubLObject)module0110.$ic63$, (SubLObject)module0110.$ic64$, (SubLObject)module0110.$ic65$);
        f7668((SubLObject)module0110.$ic66$, (SubLObject)module0110.ZERO_INTEGER, (SubLObject)module0110.$ic67$, (SubLObject)module0110.$ic68$);
        f7668((SubLObject)module0110.$ic69$, (SubLObject)module0110.ONE_INTEGER, (SubLObject)module0110.$ic67$, (SubLObject)module0110.$ic70$);
        f7668((SubLObject)module0110.$ic71$, (SubLObject)module0110.TWO_INTEGER, (SubLObject)module0110.$ic67$, (SubLObject)module0110.$ic72$);
        f7668((SubLObject)module0110.$ic73$, (SubLObject)module0110.THREE_INTEGER, (SubLObject)module0110.$ic67$, (SubLObject)module0110.$ic74$);
        f7668((SubLObject)module0110.$ic75$, (SubLObject)module0110.FOURTEEN_INTEGER, (SubLObject)module0110.$ic67$, (SubLObject)module0110.$ic76$);
        f7668((SubLObject)module0110.$ic77$, (SubLObject)module0110.FIFTEEN_INTEGER, (SubLObject)module0110.$ic67$, (SubLObject)module0110.$ic78$);
        f7668((SubLObject)module0110.$ic79$, (SubLObject)module0110.NIL, (SubLObject)module0110.$ic50$, (SubLObject)module0110.$ic80$);
        f7668((SubLObject)module0110.$ic81$, (SubLObject)module0110.T, (SubLObject)module0110.$ic50$, (SubLObject)module0110.$ic82$);
        f7668((SubLObject)module0110.$ic83$, (SubLObject)module0110.NIL, (SubLObject)module0110.$ic50$, (SubLObject)module0110.$ic84$);
        f7668((SubLObject)module0110.$ic85$, (SubLObject)module0110.NIL, (SubLObject)module0110.$ic86$, (SubLObject)module0110.$ic87$);
        f7668((SubLObject)module0110.$ic88$, (SubLObject)module0110.$ic89$, (SubLObject)module0110.$ic90$, (SubLObject)module0110.$ic91$);
        f7668((SubLObject)module0110.$ic92$, (SubLObject)module0110.T, (SubLObject)module0110.$ic50$, (SubLObject)module0110.$ic93$);
        f7668((SubLObject)module0110.$ic94$, (SubLObject)module0110.NIL, (SubLObject)module0110.$ic50$, (SubLObject)module0110.$ic95$);
        f7668((SubLObject)module0110.$ic96$, (SubLObject)module0110.$ic97$, (SubLObject)module0110.$ic98$, (SubLObject)module0110.$ic99$);
        f7668((SubLObject)module0110.$ic100$, (SubLObject)module0110.$ic101$, (SubLObject)module0110.$ic102$, (SubLObject)module0110.$ic103$);
        f7668((SubLObject)module0110.$ic104$, (SubLObject)module0110.$ic105$, (SubLObject)module0110.$ic98$, (SubLObject)module0110.$ic106$);
        f7668((SubLObject)module0110.$ic107$, (SubLObject)module0110.$ic108$, (SubLObject)module0110.$ic98$, (SubLObject)module0110.$ic109$);
        f7668((SubLObject)module0110.$ic110$, (SubLObject)module0110.$ic111$, (SubLObject)module0110.$ic98$, (SubLObject)module0110.$ic109$);
        f7668((SubLObject)module0110.$ic112$, (SubLObject)module0110.T, (SubLObject)module0110.$ic50$, (SubLObject)module0110.$ic113$);
        f7668((SubLObject)module0110.$ic114$, (SubLObject)module0110.$ic115$, (SubLObject)module0110.$ic98$, (SubLObject)module0110.$ic116$);
        f7668((SubLObject)module0110.$ic117$, (SubLObject)module0110.$ic118$, (SubLObject)module0110.$ic98$, (SubLObject)module0110.$ic119$);
        f7668((SubLObject)module0110.$ic120$, (SubLObject)module0110.NIL, (SubLObject)module0110.$ic50$, (SubLObject)module0110.$ic121$);
        f7668((SubLObject)module0110.$ic122$, (SubLObject)module0110.$ic123$, (SubLObject)module0110.$ic98$, (SubLObject)module0110.$ic124$);
        f7668((SubLObject)module0110.$ic126$, (SubLObject)module0110.$ic127$, (SubLObject)module0110.$ic128$, (SubLObject)module0110.$ic129$);
        return (SubLObject)module0110.NIL;
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
        module0110.$g1371$ = null;
        module0110.$g1372$ = null;
        module0110.$g1373$ = null;
        module0110.$g1374$ = null;
        module0110.$g1375$ = null;
        module0110.$g1376$ = null;
        module0110.$g1377$ = null;
        module0110.$g1378$ = null;
        module0110.$g1379$ = null;
        module0110.$g1380$ = null;
        module0110.$g1381$ = null;
        module0110.$g1382$ = null;
        module0110.$g1383$ = null;
        module0110.$g1384$ = null;
        module0110.$g41$ = null;
        module0110.$g1385$ = null;
        module0110.$g1386$ = null;
        module0110.$g1387$ = null;
        module0110.$g1388$ = null;
        module0110.$g1389$ = null;
        module0110.$g1362$ = null;
        module0110.$g120$ = null;
        module0110.$g124$ = null;
        module0110.$g113$ = null;
        module0110.$g118$ = null;
        module0110.$g536$ = null;
        module0110.$g127$ = null;
        module0110.$g570$ = null;
        module0110.$g1390$ = null;
        module0110.$g1391$ = null;
        module0110.$g1392$ = null;
        module0110.$g36$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#9669", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("FIRST");
        $ic2$ = SubLObjectFactory.makeString("~S ~S has an unknown type ~S.");
        $ic3$ = SubLObjectFactory.makeSymbol("S#9659", "CYC");
        $ic4$ = SubLObjectFactory.makeSymbol("SYMBOLP");
        $ic5$ = SubLObjectFactory.makeSymbol("CAR");
        $ic6$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9672", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("S#669", "CYC"));
        $ic7$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic8$ = SubLObjectFactory.makeSymbol("S#9656", "CYC");
        $ic9$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic10$ = SubLObjectFactory.makeSymbol("DEFVAR");
        $ic11$ = SubLObjectFactory.makeKeyword("UNSET");
        $ic12$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOL"), (SubLObject)SubLObjectFactory.makeSymbol("S#9672", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("S#669", "CYC"));
        $ic13$ = SubLObjectFactory.makeString("The system parameter ~S is not bound.");
        $ic14$ = SubLObjectFactory.makeString("The system parameter ~S was not initialized.");
        $ic15$ = SubLObjectFactory.makeString("The system parameter ~A has a bogus type definition of ~A.");
        $ic16$ = SubLObjectFactory.makeString("The system paramater ~S has the value ~S, but it is supposed to be ~S.");
        $ic17$ = Vectors.vector(new SubLObject[] { Characters.CHAR_0, Characters.CHAR_1, Characters.CHAR_2, Characters.CHAR_3, Characters.CHAR_4, Characters.CHAR_5, Characters.CHAR_6, Characters.CHAR_7, Characters.CHAR_8, Characters.CHAR_9, Characters.CHAR_A, Characters.CHAR_B, Characters.CHAR_C, Characters.CHAR_D, Characters.CHAR_E, Characters.CHAR_F });
        $ic18$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#9673", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9674", "CYC"));
        $ic19$ = SubLObjectFactory.makeKeyword("LISP");
        $ic20$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("init"));
        $ic21$ = SubLObjectFactory.makeString("parameters");
        $ic22$ = SubLObjectFactory.makeString("lisp");
        $ic23$ = SubLObjectFactory.makeKeyword("OUTPUT");
        $ic24$ = SubLObjectFactory.makeString("Unable to open ~S");
        $ic25$ = SubLObjectFactory.makeString(";;; -*- Mode: LISP; Syntax: ANSI-Common-Lisp; Base: 10; Package: CYC;  -*-~%~%");
        $ic26$ = SubLObjectFactory.makeString(";;; Cyc system parameters~%");
        $ic27$ = SubLObjectFactory.makeString(";;;~%");
        $ic28$ = SubLObjectFactory.makeString(";;; Generated ~A from CycL ~A~%~%");
        $ic29$ = SubLObjectFactory.makeString("(in-package :CYC)~%~%");
        $ic30$ = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("T"), (SubLObject)SubLObjectFactory.makeString("::TRUE::")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("NIL"), (SubLObject)SubLObjectFactory.makeString("::FALSE::")));
        $ic31$ = SubLObjectFactory.makeString(";;; Possible Values: ~A~%");
        $ic32$ = SubLObjectFactory.makeString(";;; ~A~%");
        $ic33$ = SubLObjectFactory.makeString("(csetq ~A ~S)~%~%");
        $ic34$ = SubLObjectFactory.makeString("(check-system-parameters)~%");
        $ic35$ = SubLObjectFactory.makeKeyword("CONFIG");
        $ic36$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("data"));
        $ic37$ = SubLObjectFactory.makeString("~A~%~A~%");
        $ic38$ = SubLObjectFactory.makeString("~A\\~%");
        $ic39$ = SubLObjectFactory.makeString("~A~%");
        $ic40$ = SubLObjectFactory.makeKeyword("INPUT");
        $ic41$ = SubLObjectFactory.makeKeyword("EOF");
        $ic42$ = SubLObjectFactory.makeString("System parameters file (~A) not loaded.");
        $ic43$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#166", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#105", "CYC"));
        $ic44$ = SubLObjectFactory.makeSymbol("IN-PACKAGE");
        $ic45$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IN-PACKAGE"), (SubLObject)SubLObjectFactory.makeString("CYC"));
        $ic46$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic47$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOL"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"));
        $ic48$ = SubLObjectFactory.makeSymbol("S#9661", "CYC");
        $ic49$ = SubLObjectFactory.makeSymbol("*AUTO-CONTINUE-TRANSCRIPT-PROBLEMS*");
        $ic50$ = SubLObjectFactory.makeSymbol("BOOLEAN");
        $ic51$ = SubLObjectFactory.makeString("If ::FALSE::, transcript problems will cause error breaks that \nmake the system stop. If ::TRUE::, such problems will not cause the\nthe system to stop.");
        $ic52$ = SubLObjectFactory.makeSymbol("*CONTINUE-AGENDA-ON-ERROR*");
        $ic53$ = SubLObjectFactory.makeString("If ::FALSE::, agenda errors will cause the agenda process to halt.  \nIf ::TRUE::, the agenda continue automatically.");
        $ic54$ = SubLObjectFactory.makeSymbol("*SUSPEND-SBHL-TYPE-CHECKING?*");
        $ic55$ = SubLObjectFactory.makeString("Type checking occurs in SBHL modules iff this is ::FALSE::, which\nis slower but correcter.");
        $ic56$ = SubLObjectFactory.makeSymbol("*REALLY-COUNT-TRANSCRIPT-OPS*");
        $ic57$ = SubLObjectFactory.makeString("If ::FALSE::, the System Info page (accessible to administrators \nonly)  will estimate, rather than actually count, the number of \noperations in the transcript.  If ::TRUE::, it will actually \ncount them, which takes longer but is accurate.");
        $ic58$ = SubLObjectFactory.makeSymbol("*DONT-RECORD-OPERATIONS-LOCALLY*");
        $ic59$ = SubLObjectFactory.makeString("If ::FALSE::, a local transcript will always be written when \noperations are done, even if those operations are also being written to \nthe master transcript.  If ::TRUE::, then the image does not write to a \nlocal transcript file, and will write to the master transcript when\nit is set to transmit operations.  This allows an image that is \nstandalone, and transmitting and receiving opertions, to keep only a \nsingle copy of its operations.");
        $ic60$ = SubLObjectFactory.makeSymbol("*START-AGENDA-AT-STARTUP?*");
        $ic61$ = SubLObjectFactory.makeString("If ::FALSE::, the Cyc agenda is not started at startup, but can \nbe enabled later by the user.  If ::TRUE::, the agenda is enabled at \nstartup.");
        $ic62$ = SubLObjectFactory.makeSymbol("*BASE-TCP-PORT*");
        $ic63$ = SubLObjectFactory.makeInteger(3600);
        $ic64$ = SubLObjectFactory.makeSymbol("S#58", "CYC");
        $ic65$ = SubLObjectFactory.makeString("The base port number for all the TCP services for the Cyc image.");
        $ic66$ = SubLObjectFactory.makeSymbol("*HTML-PORT-OFFSET*");
        $ic67$ = SubLObjectFactory.makeSymbol("S#9653", "CYC");
        $ic68$ = SubLObjectFactory.makeString("This parameter specifies the offset of the HTML port offset\nfrom the base port number.\nNotice that the sum of this parameter and the base port number must\nstill be a number in the valid port number range.");
        $ic69$ = SubLObjectFactory.makeSymbol("*FI-PORT-OFFSET*");
        $ic70$ = SubLObjectFactory.makeString("This parameter specifies the offset of the ASCII based Cyc API\n (application program interface) service from the base port number.\nNotice that the sum of this parameter and the base port number must\nstill be a number in the valid port number range.");
        $ic71$ = SubLObjectFactory.makeSymbol("*HTTP-PORT-OFFSET*");
        $ic72$ = SubLObjectFactory.makeString("This parameter specifies the offset of the Cyc-internal HTTP port \nfrom the base port number.\nNotice that the sum of this parameter and the base port number must\nstill be a number in the valid port number range.");
        $ic73$ = SubLObjectFactory.makeSymbol("*SERVLET-PORT-OFFSET*");
        $ic74$ = SubLObjectFactory.makeString("This parameter specifies the offset of the Cyc-internal servlet-container port \nfrom the base port number.\nNotice that the sum of this parameter and the base port number must\nstill be a number in the valid port number range.");
        $ic75$ = SubLObjectFactory.makeSymbol("*CFASL-PORT-OFFSET*");
        $ic76$ = SubLObjectFactory.makeString("This parameter specifies the offset of the Cyc CFASL-server,\n a binary form of the FI (API) service, from the base port number.\nNotice that the sum of this parameter and the base port number must\nstill be a number in the valid port number range.");
        $ic77$ = SubLObjectFactory.makeSymbol("S#9670", "CYC");
        $ic78$ = SubLObjectFactory.makeString("This parameter specifies the offset of the Cyc SPARQL-server \nservice from the base port number.\nNotice that the sum of this parameter and the base port number must\nstill be a number in the valid port number range.");
        $ic79$ = SubLObjectFactory.makeSymbol("*TCP-LOCALHOST-ONLY?*");
        $ic80$ = SubLObjectFactory.makeString("IF ::FALSE::, then remote TCP clients can connect to Cyc, otherwise \nno remote connections are allowed. The most secure configuration \nleaves this parameter ::TRUE::, and uses a separate Web server to \nredirect HTTP requests to Cyc--which requires the HTML port to be\nconfigured and the HTTP port to be disabled.");
        $ic81$ = SubLObjectFactory.makeSymbol("*PERMIT-API-HOST-ACCESS*");
        $ic82$ = SubLObjectFactory.makeString("IF ::TRUE::, then API functions can access host services \nincluding the file system and outbound tcp connections. The most \nsecure configuration leaves this parameter ::FALSE::.");
        $ic83$ = SubLObjectFactory.makeSymbol("*USE-TRANSCRIPT-SERVER*");
        $ic84$ = SubLObjectFactory.makeString("IF ::TRUE::, then writing to the master transcript will be \ncontrolled by the Cyc Transcript Server, which will \nneed to be installed at your site. Set this to ::TRUE:: if \nyou are running multiple instances of Cyc.  If ::FALSE::, \nthen Cyc will read and write to the master transcript \nwithout regard to other processes doing the same.");
        $ic85$ = SubLObjectFactory.makeSymbol("*MASTER-TRANSCRIPT-LOCK-HOST*");
        $ic86$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OR"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("S#4764", "CYC"));
        $ic87$ = SubLObjectFactory.makeString("This parameter is only used if *USE-TRANSCRIPT-SERVER* is ::TRUE::.  \nIf so, then this parameter should be set to the name of the host \nthat runs the transcript server; the port is specified with\n*MASTER-TRANSCRIPT-SERVER-PORT*.");
        $ic88$ = SubLObjectFactory.makeSymbol("*MASTER-TRANSCRIPT-SERVER-PORT*");
        $ic89$ = SubLObjectFactory.makeInteger(3608);
        $ic90$ = SubLObjectFactory.makeSymbol("INTEGER");
        $ic91$ = SubLObjectFactory.makeString("This parameter is only used if *USE-TRANSCRIPT-SERVER* is ::TRUE::.  \nIf so, then this parameter should be set to the port number \nof the host (specified with *MASTER-TRANSCRIPT-LOCK-HOST*)\nread service.");
        $ic92$ = SubLObjectFactory.makeSymbol("*CB-EDITING-ENABLED?*");
        $ic93$ = SubLObjectFactory.makeString("If ::FALSE::, tools for modifying the knowledge base are not accessible.");
        $ic94$ = SubLObjectFactory.makeSymbol("*ALLOW-GUEST-TO-EDIT?*");
        $ic95$ = SubLObjectFactory.makeString("If ::FALSE::, require authentication before allowing modifications\nto the knowledge base.  If ::TRUE::, any user is allowed to modify \nthe knowledge base.");
        $ic96$ = SubLObjectFactory.makeSymbol("*DEFAULT-CYCLIST-NAME*");
        $ic97$ = SubLObjectFactory.makeString("Guest");
        $ic98$ = SubLObjectFactory.makeSymbol("STRING");
        $ic99$ = SubLObjectFactory.makeString("Specifies the name of the default Cyclist constant under which\nusers browse the system before they log in.");
        $ic100$ = SubLObjectFactory.makeSymbol("*HTTP-HTDOCS-DIRECTORY*");
        $ic101$ = SubLObjectFactory.makeString("httpd/htdocs");
        $ic102$ = SubLObjectFactory.makeSymbol("S#9652", "CYC");
        $ic103$ = SubLObjectFactory.makeString("The directory under which documents served by the HTTP server are stored.");
        $ic104$ = SubLObjectFactory.makeSymbol("*HTML-IMAGE-DIRECTORY*");
        $ic105$ = SubLObjectFactory.makeString("/cycdoc/img/");
        $ic106$ = SubLObjectFactory.makeString("The directory, relative to *HTTP-HTDOCS-DIRECTORY*, under which \nCyc images (.gif or otherwise) are stored");
        $ic107$ = SubLObjectFactory.makeSymbol("*HTML-JAVASCRIPT-DIRECTORY*");
        $ic108$ = SubLObjectFactory.makeString("/cycdoc/js/");
        $ic109$ = SubLObjectFactory.makeString("The directory, relative to *HTTP-HTDOCS-DIRECTORY*, under which \nJavascript files used by the browser are stored");
        $ic110$ = SubLObjectFactory.makeSymbol("*HTML-CSS-DIRECTORY*");
        $ic111$ = SubLObjectFactory.makeString("/cycdoc/css/");
        $ic112$ = SubLObjectFactory.makeSymbol("*PERMIT-UTF-8-CHARACTER-DISPLAY*");
        $ic113$ = SubLObjectFactory.makeString("If ::TRUE::, the html tools will correctly display UTF-8 text\nderived from Cyc strings.");
        $ic114$ = SubLObjectFactory.makeSymbol("*CYC-DOCUMENTATION-URL*");
        $ic115$ = SubLObjectFactory.makeString("/cycdoc/");
        $ic116$ = SubLObjectFactory.makeString("The directory, relative to *HTTP-HTDOCS-DIRECTORY*, for the \nCyc system documentation directory.");
        $ic117$ = SubLObjectFactory.makeSymbol("*CYC-CGI-PROGRAM*");
        $ic118$ = SubLObjectFactory.makeString("cg");
        $ic119$ = SubLObjectFactory.makeString("The name of the CGI program that acts as the intermediary \nbetween your WWW server and a Cyc server  Normally, the\nprogram will be called ``cg''.  However, if your WWW server requires that\nCGI program names have a certain form, such as ``cg.exe'', then change\nthis parameter to conform. This is relevant only if the HTML service\nis enabled.");
        $ic120$ = SubLObjectFactory.makeSymbol("*CONSTANT-NAME-GREP-ENABLED*");
        $ic121$ = SubLObjectFactory.makeString("If ::TRUE::, the HTML browser allows users to  search for\nconstants via regular expressions via an external program, rather\nthan the internal search facility. Use of this facility requires the\nconstant-name-grep CGI program and the data file constant-shell.text to\nbe installed on your WWW server, and that the HTML service be enabled.");
        $ic122$ = SubLObjectFactory.makeSymbol("*CYC-GREP-CGI-PROGRAM*");
        $ic123$ = SubLObjectFactory.makeString("constant-name-grep");
        $ic124$ = SubLObjectFactory.makeString("The name of the CGI program that is used for performing \nregular expression searches over constant names.  Normally, the\nprogram will be called ``constant-name-grep''.  However, if your WWW server\nrequires that CGI program names have a certain form, such as \n``constant-name-grep.exe'', then change this parameter to conform.\nThis is relevant only if the HTML service is enabled.");
        $ic125$ = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("CYCORP"), (SubLObject)SubLObjectFactory.makeString("Assume a Cycorp execution context.")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("UNKNOWN"), (SubLObject)SubLObjectFactory.makeString("Assume an unknown execution context.")));
        $ic126$ = SubLObjectFactory.makeSymbol("*CYC-EXECUTION-CONTEXT*");
        $ic127$ = SubLObjectFactory.makeKeyword("UNKNOWN");
        $ic128$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeSymbol("S#9671", "CYC"));
        $ic129$ = SubLObjectFactory.makeString("If the execution context is set to :CYCORP, then the CYC image \ncan assume that it is running in Cycorp's development environment \nand make strong assumptions about setup and infrastructure.");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0110.class
	Total time: 234 ms
	
	Decompiled with Procyon 0.5.32.
*/