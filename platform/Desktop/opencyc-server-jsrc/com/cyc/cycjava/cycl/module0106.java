package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0106 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0106";
    public static final String myFingerPrint = "ce0849fd3eccc3f6809999090d58edbe6963fa55b758e73fa2a5a9511dd36a07";
    public static SubLSymbol $g1354$;
    public static SubLSymbol $g1355$;
    public static SubLSymbol $g1356$;
    public static SubLSymbol $g1357$;
    public static SubLSymbol $g1358$;
    private static final SubLList $ic0$;
    private static final SubLList $ic1$;
    private static final SubLString $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLString $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLString $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLString $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLString $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLString $ic14$;
    private static final SubLString $ic15$;
    private static final SubLString $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLList $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLString $ic24$;
    private static final SubLString $ic25$;
    private static final SubLList $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLList $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLString $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLList $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLList $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    
    public static SubLObject f7545(final SubLObject var1) {
        return module0004.f104(var1, (SubLObject)module0106.$ic0$, (SubLObject)module0106.UNPROVIDED, (SubLObject)module0106.UNPROVIDED);
    }
    
    public static SubLObject f7546(final SubLObject var1) {
        return module0035.f2171(var1, (SubLObject)module0106.$ic1$);
    }
    
    public static SubLObject f7547(final SubLObject var2) {
        if (module0106.$ic2$.equal(var2)) {
            return (SubLObject)module0106.$ic3$;
        }
        if (module0106.$ic4$.equal(var2)) {
            return (SubLObject)module0106.$ic5$;
        }
        if (module0106.$ic6$.equal(var2)) {
            return (SubLObject)module0106.$ic7$;
        }
        if (module0106.$ic8$.equal(var2)) {
            return (SubLObject)module0106.$ic9$;
        }
        if (module0106.$ic10$.equal(var2)) {
            return (SubLObject)module0106.$ic11$;
        }
        if (module0106.$ic12$.equal(var2)) {
            return (SubLObject)module0106.$ic13$;
        }
        return Errors.error((SubLObject)module0106.$ic14$, var2);
    }
    
    public static SubLObject f7548(final SubLObject var3, final SubLObject var4, final SubLObject var5) {
        if (var3.eql((SubLObject)module0106.$ic3$)) {
            return Numbers.numG(var4, var5);
        }
        if (var3.eql((SubLObject)module0106.$ic5$)) {
            return Numbers.numGE(var4, var5);
        }
        if (var3.eql((SubLObject)module0106.$ic7$)) {
            return Numbers.numL(var4, var5);
        }
        if (var3.eql((SubLObject)module0106.$ic9$)) {
            return Numbers.numLE(var4, var5);
        }
        if (var3.eql((SubLObject)module0106.$ic11$)) {
            return Equality.equal(var4, var5);
        }
        if (var3.eql((SubLObject)module0106.$ic13$)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0106.NIL == f7548((SubLObject)module0106.$ic11$, var4, var5));
        }
        return Errors.error((SubLObject)module0106.$ic15$, var3);
    }
    
    public static SubLObject f7549(final SubLObject var7) {
        if (var7.eql((SubLObject)module0106.$ic3$)) {
            return (SubLObject)module0106.$ic9$;
        }
        if (var7.eql((SubLObject)module0106.$ic5$)) {
            return (SubLObject)module0106.$ic7$;
        }
        if (var7.eql((SubLObject)module0106.$ic9$)) {
            return (SubLObject)module0106.$ic3$;
        }
        if (var7.eql((SubLObject)module0106.$ic7$)) {
            return (SubLObject)module0106.$ic5$;
        }
        if (var7.eql((SubLObject)module0106.$ic11$)) {
            return (SubLObject)module0106.$ic13$;
        }
        if (var7.eql((SubLObject)module0106.$ic13$)) {
            return (SubLObject)module0106.$ic11$;
        }
        return Errors.error((SubLObject)module0106.$ic16$, var7);
    }
    
    public static SubLObject f7550(final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (module0106.NIL != module0035.sublisp_boolean(module0106.$g1354$.getDynamicValue(var9))) {
            return Symbols.make_keyword(Strings.string_upcase(var8, (SubLObject)module0106.UNPROVIDED, (SubLObject)module0106.UNPROVIDED));
        }
        return var8;
    }
    
    public static SubLObject f7551(final SubLObject var8, final SubLObject var2, final SubLObject var10, final SubLObject var11, final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        assert module0106.NIL != Types.stringp(var8) : var8;
        assert module0106.NIL != f7546(var2) : var2;
        assert module0106.NIL != Types.stringp(var10) : var10;
        assert module0106.NIL != f7552(var11) : var11;
        assert module0106.NIL != f7552(var12) : var12;
        final SubLObject var14 = f7550(var8);
        final SubLObject var15 = f7547(var2);
        SubLObject var16 = f7553(var10);
        if (module0106.NIL == var16) {
            var16 = f7550(var10);
        }
        if (module0106.NIL != module0106.$g1356$.getDynamicValue(var13)) {
            return (SubLObject)ConsesLow.list(var14, var15, var16, var11, var12);
        }
        return (SubLObject)ConsesLow.list(var15, var14, var16, var11, var12);
    }
    
    public static SubLObject f7553(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = module0038.f2641(var14);
        if (module0106.NIL != module0106.$g1357$.getDynamicValue(var15) && var16.isDouble()) {
            var15.resetMultipleValues();
            final SubLObject var17 = Numbers.truncate(var16, (SubLObject)module0106.UNPROVIDED);
            final SubLObject var18 = var15.secondMultipleValue();
            var15.resetMultipleValues();
            return var17;
        }
        return var16;
    }
    
    public static SubLObject f7554(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var1.isCons() && module0106.NIL != module0035.f1995(var1, (SubLObject)module0106.FIVE_INTEGER, (SubLObject)module0106.UNPROVIDED));
    }
    
    public static SubLObject f7555(final SubLObject var18, SubLObject var19) {
        if (var19 == module0106.UNPROVIDED) {
            var19 = (SubLObject)module0106.NIL;
        }
        final SubLThread var20 = SubLProcess.currentSubLThread();
        if (module0106.NIL != module0035.sublisp_boolean(module0106.$g1354$.getDynamicValue(var20))) {
            final SubLObject var21 = reader.read_from_string_ignoring_errors(var18, (SubLObject)module0106.UNPROVIDED, (SubLObject)module0106.UNPROVIDED, (SubLObject)module0106.UNPROVIDED, (SubLObject)module0106.UNPROVIDED);
            return (SubLObject)ConsesLow.list(var21);
        }
        if (module0106.NIL == module0035.sublisp_boolean(module0106.$g1355$.getDynamicValue(var20))) {
            return (SubLObject)ConsesLow.list(var18);
        }
        final SubLObject var22 = module0038.f2738(var19, (SubLObject)module0106.$ic20$, (SubLObject)module0106.NIL, (SubLObject)module0106.NIL, (SubLObject)module0106.T, (SubLObject)module0106.UNPROVIDED, (SubLObject)module0106.UNPROVIDED);
        final SubLObject var23 = Mapping.mapcar((SubLObject)module0106.$ic21$, var22);
        return (SubLObject)ConsesLow.cons(var18, var23);
    }
    
    public static SubLObject f7556(final SubLObject var1) {
        if (module0106.NIL != module0035.f1997(var1)) {
            return (SubLObject)module0106.T;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(var1.isCons() && var1.first().isString() && module0106.NIL != module0035.f2192((SubLObject)module0106.$ic22$, var1.rest()));
    }
    
    public static SubLObject f7557(final SubLObject var23) {
        assert module0106.NIL != f7556(var23) : var23;
        return var23.first();
    }
    
    public static SubLObject f7552(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0106.NIL != f7554(var1) || module0106.NIL != f7556(var1));
    }
    
    public static SubLObject f7558(final SubLObject var24) {
        assert module0106.NIL != f7552(var24) : var24;
        return var24;
    }
    
    public static SubLObject f7559(final SubLObject var1) {
        return f7552(var1);
    }
    
    public static SubLObject f7560(final SubLObject var25) {
        return var25;
    }
    
    public static SubLObject f7561(final SubLObject var26) {
        SubLObject var27 = (SubLObject)module0106.NIL;
        SubLObject var28 = (SubLObject)module0106.NIL;
        try {
            var28 = streams_high.make_private_string_input_stream(var26, (SubLObject)module0106.ZERO_INTEGER, (SubLObject)module0106.NIL);
            final SubLObject var29 = f7562(var28, (SubLObject)module0106.NIL);
            var27 = f7558(var29);
        }
        finally {
            final SubLObject var30 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0106.T);
                streams_high.close(var28, (SubLObject)module0106.UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var30);
            }
        }
        return var27;
    }
    
    public static SubLObject f7562(final SubLObject var27, final SubLObject var29) {
        final SubLObject var30 = module0038.f2835(var27, (SubLObject)module0106.UNPROVIDED, (SubLObject)module0106.UNPROVIDED, (SubLObject)module0106.UNPROVIDED);
        SubLObject var31 = module0038.f2738(var30, (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_colon, module0038.f2818()), (SubLObject)module0106.NIL, (SubLObject)module0106.NIL, (SubLObject)module0106.T, (SubLObject)module0106.UNPROVIDED, (SubLObject)module0106.UNPROVIDED);
        SubLObject var32 = (SubLObject)module0106.ZERO_INTEGER;
        while (module0106.NIL != Strings.string_equal(var31.first(), (SubLObject)module0106.$ic24$, (SubLObject)module0106.UNPROVIDED, (SubLObject)module0106.UNPROVIDED, (SubLObject)module0106.UNPROVIDED, (SubLObject)module0106.UNPROVIDED)) {
            var32 = Numbers.add(var32, (SubLObject)module0106.ONE_INTEGER);
            var31 = var31.rest();
        }
        SubLObject var33 = var31.first();
        SubLObject var34;
        for (var34 = conses_high.second(var31), var31 = var31.rest().rest(); module0106.NIL == f7546(var34); var34 = var31.first(), var31 = var31.rest()) {
            var33 = Sequences.cconcatenate(var33, new SubLObject[] { module0106.$ic25$, var34 });
        }
        SubLObject var36;
        final SubLObject var35 = var36 = var31;
        SubLObject var37 = (SubLObject)module0106.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)module0106.$ic26$);
        var37 = var36.first();
        var36 = var36.rest();
        final SubLObject var38 = (SubLObject)(var36.isCons() ? var36.first() : module0106.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var36, var35, (SubLObject)module0106.$ic26$);
        var36 = var36.rest();
        final SubLObject var39 = (SubLObject)(var36.isCons() ? var36.first() : module0106.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var36, var35, (SubLObject)module0106.$ic26$);
        var36 = var36.rest();
        if (module0106.NIL != var36) {
            cdestructuring_bind.cdestructuring_bind_error(var35, (SubLObject)module0106.$ic26$);
            return (SubLObject)module0106.NIL;
        }
        if (!var32.eql(var29)) {
            final SubLObject var40 = (module0106.NIL != var38) ? f7555(var38, var39) : f7562(var27, (SubLObject)module0106.NIL);
            final SubLObject var41 = f7562(var27, var32);
            return f7551(var33, var34, var37, var40, var41);
        }
        if (module0106.NIL != var38) {
            return f7555(var38, var39);
        }
        return f7562(var27, (SubLObject)module0106.NIL);
    }
    
    public static SubLObject f7563(final SubLObject var25, final SubLObject var36) {
        assert module0106.NIL != f7559(var25) : var25;
        return f7564(f7560(var25), var36);
    }
    
    public static SubLObject f7564(final SubLObject var37, final SubLObject var36) {
        final SubLThread var38 = SubLProcess.currentSubLThread();
        if (module0106.NIL != f7556(var37)) {
            return f7557(var37);
        }
        SubLObject var39 = (SubLObject)module0106.NIL;
        SubLObject var40 = (SubLObject)module0106.NIL;
        SubLObject var41 = (SubLObject)module0106.NIL;
        SubLObject var42 = (SubLObject)module0106.NIL;
        SubLObject var43 = (SubLObject)module0106.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var37, var37, (SubLObject)module0106.$ic28$);
        var39 = var37.first();
        SubLObject var44 = var37.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var44, var37, (SubLObject)module0106.$ic28$);
        var40 = var44.first();
        var44 = var44.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var44, var37, (SubLObject)module0106.$ic28$);
        var41 = var44.first();
        var44 = var44.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var44, var37, (SubLObject)module0106.$ic28$);
        var42 = var44.first();
        var44 = var44.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var44, var37, (SubLObject)module0106.$ic28$);
        var43 = var44.first();
        var44 = var44.rest();
        if (module0106.NIL != var44) {
            cdestructuring_bind.cdestructuring_bind_error(var37, (SubLObject)module0106.$ic28$);
            return (SubLObject)module0106.NIL;
        }
        final SubLObject var45 = f7565(var36, var39, (SubLObject)module0106.$ic29$, (SubLObject)module0106.UNPROVIDED);
        if (module0106.NIL == Errors.$ignore_mustsP$.getDynamicValue(var38) && module0106.$ic29$ == var45) {
            Errors.error((SubLObject)module0106.$ic30$, var39, var36);
        }
        if (module0106.NIL != f7548(var40, var45, var41)) {
            return f7564(var42, var36);
        }
        return f7564(var43, var36);
    }
    
    public static SubLObject f7565(final SubLObject var40, final SubLObject var41, SubLObject var42, SubLObject var43) {
        if (var42 == module0106.UNPROVIDED) {
            var42 = (SubLObject)module0106.NIL;
        }
        if (var43 == module0106.UNPROVIDED) {
            var43 = module0106.$g1358$.getDynamicValue();
        }
        return Functions.funcall(var43, var40, var41, var42);
    }
    
    public static SubLObject f7566(final SubLObject var25) {
        final SubLObject var26 = module0077.f5313(Symbols.symbol_function((SubLObject)module0106.EQ), (SubLObject)module0106.UNPROVIDED);
        return module0077.f5312(f7567(f7560(var25), var26));
    }
    
    public static SubLObject f7567(final SubLObject var37, final SubLObject var45) {
        if (module0106.NIL != f7556(var37)) {
            return var45;
        }
        SubLObject var46 = (SubLObject)module0106.NIL;
        SubLObject var47 = (SubLObject)module0106.NIL;
        SubLObject var48 = (SubLObject)module0106.NIL;
        SubLObject var49 = (SubLObject)module0106.NIL;
        SubLObject var50 = (SubLObject)module0106.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var37, var37, (SubLObject)module0106.$ic28$);
        var46 = var37.first();
        SubLObject var51 = var37.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var51, var37, (SubLObject)module0106.$ic28$);
        var47 = var51.first();
        var51 = var51.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var51, var37, (SubLObject)module0106.$ic28$);
        var48 = var51.first();
        var51 = var51.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var51, var37, (SubLObject)module0106.$ic28$);
        var49 = var51.first();
        var51 = var51.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var51, var37, (SubLObject)module0106.$ic28$);
        var50 = var51.first();
        var51 = var51.rest();
        if (module0106.NIL == var51) {
            module0077.f5326(var46, var45);
            f7567(var49, var45);
            return f7567(var50, var45);
        }
        cdestructuring_bind.cdestructuring_bind_error(var37, (SubLObject)module0106.$ic28$);
        return (SubLObject)module0106.NIL;
    }
    
    public static SubLObject f7568(final SubLObject var48, final SubLObject var49) {
        assert module0106.NIL != module0086.f5908(var49) : var49;
        module0086.f5926(var49);
        final SubLObject var50 = module0054.f3968();
        module0054.f3973((SubLObject)ConsesLow.list((SubLObject)module0106.$ic33$, (SubLObject)module0106.NIL, var48), var50);
        while (module0106.NIL == module0054.f3970(var50)) {
            final SubLObject var51 = module0054.f3974(var50);
            SubLObject var53;
            final SubLObject var52 = var53 = var51;
            SubLObject var54 = (SubLObject)module0106.NIL;
            SubLObject var55 = (SubLObject)module0106.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var53, var52, (SubLObject)module0106.$ic34$);
            var54 = var53.first();
            var53 = var53.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var53, var52, (SubLObject)module0106.$ic34$);
            var55 = var53.first();
            var53 = var53.rest();
            final SubLObject var56 = (SubLObject)(var53.isCons() ? var53.first() : module0106.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(var53, var52, (SubLObject)module0106.$ic34$);
            var53 = var53.rest();
            if (module0106.NIL == var53) {
                final SubLObject var57 = var54;
                if (var57.eql((SubLObject)module0106.$ic33$)) {
                    module0086.f5929(var49, var55);
                    module0054.f3973((SubLObject)ConsesLow.list((SubLObject)module0106.$ic35$, var55), var50);
                    if (module0106.NIL != f7554(var56)) {
                        SubLObject var58_59;
                        final SubLObject var56_57 = var58_59 = var56;
                        SubLObject var58 = (SubLObject)module0106.NIL;
                        SubLObject var59 = (SubLObject)module0106.NIL;
                        SubLObject var60 = (SubLObject)module0106.NIL;
                        SubLObject var61 = (SubLObject)module0106.NIL;
                        SubLObject var62 = (SubLObject)module0106.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var58_59, var56_57, (SubLObject)module0106.$ic36$);
                        var58 = var58_59.first();
                        var58_59 = var58_59.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var58_59, var56_57, (SubLObject)module0106.$ic36$);
                        var59 = var58_59.first();
                        var58_59 = var58_59.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var58_59, var56_57, (SubLObject)module0106.$ic36$);
                        var60 = var58_59.first();
                        var58_59 = var58_59.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var58_59, var56_57, (SubLObject)module0106.$ic36$);
                        var61 = var58_59.first();
                        var58_59 = var58_59.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var58_59, var56_57, (SubLObject)module0106.$ic36$);
                        var62 = var58_59.first();
                        var58_59 = var58_59.rest();
                        if (module0106.NIL == var58_59) {
                            final SubLObject var63 = (SubLObject)ConsesLow.list(var58, var59, var60);
                            final SubLObject var64 = (SubLObject)ConsesLow.cons(var63, var55);
                            final SubLObject var65 = f7569(var63);
                            final SubLObject var66 = (SubLObject)ConsesLow.cons(var65, var55);
                            module0054.f3973((SubLObject)ConsesLow.list((SubLObject)module0106.$ic33$, var64, var61), var50);
                            module0054.f3973((SubLObject)ConsesLow.list((SubLObject)module0106.$ic33$, var66, var62), var50);
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var56_57, (SubLObject)module0106.$ic36$);
                        }
                    }
                    else if (module0106.NIL != f7556(var56)) {
                        module0086.f5928(var49, var56);
                    }
                    else {
                        Errors.error((SubLObject)module0106.$ic37$, var56);
                    }
                }
                else if (var57.eql((SubLObject)module0106.$ic35$)) {
                    module0086.f5930(var49, var55);
                }
                else {
                    Errors.error((SubLObject)module0106.$ic38$, var51);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var52, (SubLObject)module0106.$ic34$);
            }
        }
        module0086.f5927(var49);
        return var49;
    }
    
    public static SubLObject f7569(final SubLObject var65) {
        SubLObject var66 = (SubLObject)module0106.NIL;
        SubLObject var67 = var65;
        SubLObject var68 = (SubLObject)module0106.NIL;
        var68 = var67.first();
        while (module0106.NIL != var67) {
            if (module0106.NIL != f7545(var68)) {
                final SubLObject var69 = f7549(var68);
                var66 = (SubLObject)ConsesLow.cons(var69, var66);
            }
            else {
                var66 = (SubLObject)ConsesLow.cons(var68, var66);
            }
            var67 = var67.rest();
            var68 = var67.first();
        }
        return Sequences.nreverse(var66);
    }
    
    public static SubLObject f7570() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0106", "f7545", "S#9486", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0106", "f7546", "S#9487", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0106", "f7547", "S#9488", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0106", "f7548", "S#9489", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0106", "f7549", "S#9490", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0106", "f7550", "S#9491", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0106", "f7551", "S#9492", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0106", "f7553", "S#9493", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0106", "f7554", "S#9494", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0106", "f7555", "S#9495", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0106", "f7556", "S#9496", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0106", "f7557", "S#9497", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0106", "f7552", "S#9498", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0106", "f7558", "S#9499", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0106", "f7559", "S#9500", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0106", "f7560", "S#9501", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0106", "f7561", "S#9502", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0106", "f7562", "S#9503", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0106", "f7563", "S#9504", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0106", "f7564", "S#9505", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0106", "f7565", "S#9506", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0106", "f7566", "S#9507", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0106", "f7567", "S#9508", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0106", "f7568", "S#9509", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0106", "f7569", "S#9510", 1, 0, false);
        return (SubLObject)module0106.NIL;
    }
    
    public static SubLObject f7571() {
        module0106.$g1354$ = SubLFiles.defparameter("S#9511", (SubLObject)module0106.T);
        module0106.$g1355$ = SubLFiles.defparameter("S#9512", (SubLObject)module0106.NIL);
        module0106.$g1356$ = SubLFiles.defparameter("S#9513", (SubLObject)module0106.T);
        module0106.$g1357$ = SubLFiles.defparameter("S#9514", (SubLObject)module0106.NIL);
        module0106.$g1358$ = SubLFiles.defparameter("S#9515", (SubLObject)module0106.$ic31$);
        return (SubLObject)module0106.NIL;
    }
    
    public static SubLObject f7572() {
        return (SubLObject)module0106.NIL;
    }
    
    public void declareFunctions() {
        f7570();
    }
    
    public void initializeVariables() {
        f7571();
    }
    
    public void runTopLevelForms() {
        f7572();
    }
    
    static {
        me = (SubLFile)new module0106();
        module0106.$g1354$ = null;
        module0106.$g1355$ = null;
        module0106.$g1356$ = null;
        module0106.$g1357$ = null;
        module0106.$g1358$ = null;
        $ic0$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GT"), (SubLObject)SubLObjectFactory.makeKeyword("LT"), (SubLObject)SubLObjectFactory.makeKeyword("GE"), (SubLObject)SubLObjectFactory.makeKeyword("LE"), (SubLObject)SubLObjectFactory.makeKeyword("EQ"), (SubLObject)SubLObjectFactory.makeKeyword("NE"));
        $ic1$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(">"), (SubLObject)SubLObjectFactory.makeString(">="), (SubLObject)SubLObjectFactory.makeString("<"), (SubLObject)SubLObjectFactory.makeString("<="), (SubLObject)SubLObjectFactory.makeString("="), (SubLObject)SubLObjectFactory.makeString("!="));
        $ic2$ = SubLObjectFactory.makeString(">");
        $ic3$ = SubLObjectFactory.makeKeyword("GT");
        $ic4$ = SubLObjectFactory.makeString(">=");
        $ic5$ = SubLObjectFactory.makeKeyword("GE");
        $ic6$ = SubLObjectFactory.makeString("<");
        $ic7$ = SubLObjectFactory.makeKeyword("LT");
        $ic8$ = SubLObjectFactory.makeString("<=");
        $ic9$ = SubLObjectFactory.makeKeyword("LE");
        $ic10$ = SubLObjectFactory.makeString("=");
        $ic11$ = SubLObjectFactory.makeKeyword("EQ");
        $ic12$ = SubLObjectFactory.makeString("!=");
        $ic13$ = SubLObjectFactory.makeKeyword("NE");
        $ic14$ = SubLObjectFactory.makeString("Unexpected decision tree comparator-string ~s");
        $ic15$ = SubLObjectFactory.makeString("Unexpected decision tree comparator ~s");
        $ic16$ = SubLObjectFactory.makeString("Dont know how to negate decision tree operator ~A.");
        $ic17$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic18$ = SubLObjectFactory.makeSymbol("S#9487", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#9498", "CYC");
        $ic20$ = ConsesLow.list((SubLObject)Characters.CHAR_lparen, (SubLObject)Characters.CHAR_rparen, (SubLObject)Characters.CHAR_slash);
        $ic21$ = SubLObjectFactory.makeSymbol("READ-FROM-STRING-IGNORING-ERRORS");
        $ic22$ = SubLObjectFactory.makeSymbol("NUMBERP");
        $ic23$ = SubLObjectFactory.makeSymbol("S#9496", "CYC");
        $ic24$ = SubLObjectFactory.makeString("|");
        $ic25$ = SubLObjectFactory.makeString(" ");
        $ic26$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9516", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#9517", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9518", "CYC"));
        $ic27$ = SubLObjectFactory.makeSymbol("S#9500", "CYC");
        $ic28$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9519", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9520", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9521", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9522", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9523", "CYC"));
        $ic29$ = SubLObjectFactory.makeKeyword("UNPROVIDED");
        $ic30$ = SubLObjectFactory.makeString("A value for ~s must be provided in ~s");
        $ic31$ = SubLObjectFactory.makeSymbol("GETF");
        $ic32$ = SubLObjectFactory.makeSymbol("S#7547", "CYC");
        $ic33$ = SubLObjectFactory.makeKeyword("VISIT");
        $ic34$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5671", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2815", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#9182", "CYC"));
        $ic35$ = SubLObjectFactory.makeKeyword("FINISH");
        $ic36$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9524", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9525", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9526", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9527", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9528", "CYC"));
        $ic37$ = SubLObjectFactory.makeString("Cannot determine the node-type for ~A.");
        $ic38$ = SubLObjectFactory.makeString("Invalid state transition ~A in visiting of DECISION-TREE");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0106.class
	Total time: 141 ms
	
	Decompiled with Procyon 0.5.32.
*/