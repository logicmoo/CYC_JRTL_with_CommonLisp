package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0037 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0037";
    public static final String myFingerPrint = "52c830f1b1b848183c2255fc324cdccc9eca5c9cd6309ddbb3a547366cf4b308";
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLInteger $ic8$;
    private static final SubLString $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLList $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLList $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLList $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLList $ic26$;
    
    public static SubLObject f2558(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)ZERO_INTEGER;
        }
        assert NIL != Types.vectorp(var1) : var1;
        assert NIL != Types.integerp(var2) : var2;
        final SubLObject var3 = Numbers.subtract(Sequences.length(var1), var2);
        final SubLObject var4 = (SubLObject)ConsesLow.make_list(var3, (SubLObject)UNPROVIDED);
        SubLObject var5 = var2;
        SubLObject var6;
        for (var6 = (SubLObject)NIL, var6 = var4; NIL != var6; var6 = var6.rest()) {
            ConsesLow.rplaca(var6, Vectors.aref(var1, var5));
            var5 = Numbers.add(var5, (SubLObject)ONE_INTEGER);
        }
        return var4;
    }
    
    public static SubLObject f2559(final SubLObject var1) {
        assert NIL != Types.vectorp(var1) : var1;
        return Sequences.copy_seq(var1);
    }
    
    public static SubLObject f2560(final SubLObject var1) {
        return Vectors.aref(var1, (SubLObject)ZERO_INTEGER);
    }
    
    public static SubLObject f2561(final SubLObject var1) {
        return Vectors.aref(var1, Numbers.subtract(Sequences.length(var1), (SubLObject)ONE_INTEGER));
    }
    
    public static SubLObject f2562(final SubLObject var3) {
        final SubLObject var4 = Vectors.make_vector(var3, (SubLObject)UNPROVIDED);
        SubLObject var5;
        for (var5 = (SubLObject)NIL, var5 = (SubLObject)ZERO_INTEGER; var5.numL(var3); var5 = Numbers.add(var5, (SubLObject)ONE_INTEGER)) {
            Vectors.set_aref(var4, var5, var5);
        }
        return var4;
    }
    
    public static SubLObject f2563(final SubLObject var1, final SubLObject var9, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        final SubLObject var11 = Sequences.length(var1);
        final SubLObject var12 = Vectors.make_vector(Numbers.add(var11, var9), var10);
        Sequences.replace(var12, var1, (SubLObject)ZERO_INTEGER, var11, (SubLObject)ZERO_INTEGER, var11);
        return var12;
    }
    
    public static SubLObject f2564(final SubLObject var1, final SubLObject var13, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        final SubLObject var14 = Sequences.length(var1);
        final SubLObject var15 = Vectors.make_vector(var13, var10);
        Sequences.replace(var15, var1, (SubLObject)ZERO_INTEGER, var14, (SubLObject)ZERO_INTEGER, var14);
        return var15;
    }
    
    public static SubLObject f2565(final SubLObject var1, SubLObject var10, SubLObject var14) {
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)TWO_INTEGER;
        }
        assert NIL != Types.vectorp(var1) : var1;
        final SubLObject var15 = Sequences.length(var1);
        final SubLObject var16 = Vectors.make_vector(Numbers.multiply(var15, var14), var10);
        Sequences.replace(var16, var1, (SubLObject)ZERO_INTEGER, var15, (SubLObject)ZERO_INTEGER, var15);
        return var16;
    }
    
    public static SubLObject f2566(final SubLObject var1, SubLObject var15) {
        if (var15 == UNPROVIDED) {
            var15 = (SubLObject)NIL;
        }
        return Sequences.fill(var1, var15, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f2567(final SubLObject var1, SubLObject var16) {
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        SubLObject var17;
        SubLObject var18;
        for (var17 = Sequences.length(var1), var18 = (SubLObject)NIL, var18 = (SubLObject)ZERO_INTEGER; var18.numL(var17); var18 = Numbers.add(var18, (SubLObject)ONE_INTEGER)) {
            Vectors.set_aref(var1, var18, var16);
        }
        return var1;
    }
    
    public static SubLObject f2568(final SubLObject var1, final SubLObject var18) {
        SubLObject var19 = var18;
        SubLObject var20 = (SubLObject)NIL;
        SubLObject var21;
        SubLObject var22;
        for (var21 = Sequences.length(var1), var22 = (SubLObject)NIL, var22 = (SubLObject)ZERO_INTEGER; var22.numL(var21); var22 = Numbers.add(var22, (SubLObject)ONE_INTEGER)) {
            var20 = Vectors.aref(var1, var22);
            Vectors.set_aref(var1, var22, var19);
            var19 = var20;
        }
        return var1;
    }
    
    public static SubLObject f2569(final SubLObject var22, final SubLObject var23, SubLObject var1, SubLObject var24, SubLObject var25) {
        if (var24 == UNPROVIDED) {
            var24 = Symbols.symbol_function((SubLObject)EQL);
        }
        if (var25 == UNPROVIDED) {
            var25 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        assert NIL != Types.vectorp(var22) : var22;
        assert NIL != Types.vectorp(var23) : var23;
        assert NIL != Types.vectorp(var1) : var1;
        for (SubLObject var26 = Sequences.search(var23, var1, var24, var25, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED); NIL != var26; var26 = Sequences.search(var1, var23, var24, var25, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            var1 = f2570(var22, var26, Sequences.length(var23), var1);
        }
        return var1;
    }
    
    public static SubLObject f2570(final SubLObject var22, final SubLObject var26, final SubLObject var11, final SubLObject var1) {
        if (NIL != module0035.f1995(var22, var11, (SubLObject)UNPROVIDED)) {
            Sequences.replace(var1, var22, var26, Numbers.add(var26, var11), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return var1;
        }
        final SubLObject var27 = Vectors.make_vector(Numbers.add(Sequences.length(var1), Numbers.subtract(Sequences.length(var22), var11)), (SubLObject)UNPROVIDED);
        Sequences.replace(var27, var1, (SubLObject)ZERO_INTEGER, var26, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        Sequences.replace(var27, var22, var26, Numbers.add(var26, Sequences.length(var22)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        Sequences.replace(var27, var1, Numbers.add(var26, Sequences.length(var22)), (SubLObject)NIL, Numbers.add(var26, var11), (SubLObject)UNPROVIDED);
        return var27;
    }
    
    public static SubLObject f2571(final SubLObject var1, SubLObject var27) {
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)T;
        }
        final SubLThread var28 = SubLProcess.currentSubLThread();
        final SubLObject var29 = print_high.$print_readably$.currentBinding(var28);
        try {
            print_high.$print_readably$.bind((SubLObject)T, var28);
            print_high.prin1(var1, var27);
        }
        finally {
            print_high.$print_readably$.rebind(var29, var28);
        }
        return var1;
    }
    
    public static SubLObject f2572(final SubLObject var1, SubLObject var30, SubLObject var27) {
        if (var30 == UNPROVIDED) {
            var30 = (SubLObject)Characters.CHAR_comma;
        }
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)T;
        }
        final SubLObject var31 = (SubLObject)NIL;
        SubLObject var32;
        SubLObject var33;
        SubLObject var34;
        SubLObject var35;
        for (var32 = Sequences.length(var1), var33 = (SubLObject)NIL, var33 = (SubLObject)ZERO_INTEGER; var33.numL(var32); var33 = Numbers.add(var33, (SubLObject)ONE_INTEGER)) {
            var34 = ((NIL != var31) ? Numbers.subtract(var32, var33, (SubLObject)ONE_INTEGER) : var33);
            var35 = Vectors.aref(var1, var34);
            if (!var34.numE((SubLObject)ZERO_INTEGER)) {
                print_high.princ(var30, var27);
            }
            print_high.prin1(var35, var27);
        }
        return var1;
    }
    
    public static SubLObject f2573(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        final SubLObject var3 = (SubLObject)NIL;
        SubLObject var4;
        SubLObject var5;
        SubLObject var6;
        SubLObject var7;
        for (var4 = Sequences.length(var1), var5 = (SubLObject)NIL, var5 = (SubLObject)ZERO_INTEGER; var5.numL(var4); var5 = Numbers.add(var5, (SubLObject)ONE_INTEGER)) {
            var6 = ((NIL != var3) ? Numbers.subtract(var4, var5, (SubLObject)ONE_INTEGER) : var5);
            var7 = Vectors.aref(var1, var6);
            if (NIL == var2 || var7.numG(var2)) {
                var2 = var7;
            }
        }
        return var2;
    }
    
    public static SubLObject f2574(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        final SubLObject var3 = (SubLObject)NIL;
        SubLObject var4;
        SubLObject var5;
        SubLObject var6;
        SubLObject var7;
        for (var4 = Sequences.length(var1), var5 = (SubLObject)NIL, var5 = (SubLObject)ZERO_INTEGER; var5.numL(var4); var5 = Numbers.add(var5, (SubLObject)ONE_INTEGER)) {
            var6 = ((NIL != var3) ? Numbers.subtract(var4, var5, (SubLObject)ONE_INTEGER) : var5);
            var7 = Vectors.aref(var1, var6);
            if (NIL == var2 || var7.numL(var2)) {
                var2 = var7;
            }
        }
        return var2;
    }
    
    public static SubLObject f2575(final SubLObject var1, final SubLObject var25) {
        SubLObject var26 = (SubLObject)NIL;
        final SubLObject var27 = (SubLObject)NIL;
        SubLObject var28;
        SubLObject var29;
        SubLObject var30;
        SubLObject var31;
        for (var28 = Sequences.length(var1), var29 = (SubLObject)NIL, var29 = (SubLObject)ZERO_INTEGER; var29.numL(var28); var29 = Numbers.add(var29, (SubLObject)ONE_INTEGER)) {
            var30 = ((NIL != var27) ? Numbers.subtract(var28, var29, (SubLObject)ONE_INTEGER) : var29);
            var31 = Vectors.aref(var1, var30);
            if (NIL == var26 || NIL != Functions.funcall(var25, var31, var26)) {
                var26 = var31;
            }
        }
        return var26;
    }
    
    public static SubLObject f2576(final SubLObject var40, final SubLObject var41) {
        final SubLObject var42 = Vectors.make_vector(var40, (SubLObject)UNPROVIDED);
        SubLObject var43;
        for (var43 = (SubLObject)NIL, var43 = (SubLObject)ZERO_INTEGER; var43.numL(var40); var43 = Numbers.add(var43, (SubLObject)ONE_INTEGER)) {
            Vectors.set_aref(var42, var43, Vectors.make_vector(var41, (SubLObject)UNPROVIDED));
        }
        return var42;
    }
    
    public static SubLObject f2577(final SubLObject var42, final SubLObject var43, final SubLObject var44) {
        return Vectors.aref(Vectors.aref(var42, var43), var44);
    }
    
    public static SubLObject f2578(final SubLObject var42, final SubLObject var43, final SubLObject var44, final SubLObject var35) {
        return Vectors.set_aref(Vectors.aref(var42, var43), var44, var35);
    }
    
    public static SubLObject f2579(final SubLObject var45) {
        SubLObject var46 = (SubLObject)NIL;
        final SubLObject var47 = (SubLObject)NIL;
        SubLObject var48;
        SubLObject var49;
        SubLObject var50;
        SubLObject var52;
        SubLObject var51;
        SubLObject var31_49;
        SubLObject var32_50;
        SubLObject var33_51;
        SubLObject var34_52;
        SubLObject var37_53;
        SubLObject var53;
        SubLObject var54;
        SubLObject var55;
        for (var48 = Sequences.length(var45), var49 = (SubLObject)NIL, var49 = (SubLObject)ZERO_INTEGER; var49.numL(var48); var49 = Numbers.add(var49, (SubLObject)ONE_INTEGER)) {
            var50 = ((NIL != var47) ? Numbers.subtract(var48, var49, (SubLObject)ONE_INTEGER) : var49);
            var51 = (var52 = Vectors.aref(var45, var50));
            if (var52.isVector()) {
                var31_49 = var52;
                var32_50 = (SubLObject)NIL;
                for (var33_51 = Sequences.length(var31_49), var34_52 = (SubLObject)NIL, var34_52 = (SubLObject)ZERO_INTEGER; var34_52.numL(var33_51); var34_52 = Numbers.add(var34_52, (SubLObject)ONE_INTEGER)) {
                    var37_53 = ((NIL != var32_50) ? Numbers.subtract(var33_51, var34_52, (SubLObject)ONE_INTEGER) : var34_52);
                    var53 = Vectors.aref(var31_49, var37_53);
                    var46 = (SubLObject)ConsesLow.cons(var53, var46);
                }
            }
            else {
                var54 = var52;
                var55 = (SubLObject)NIL;
                var55 = var54.first();
                while (NIL != var54) {
                    var46 = (SubLObject)ConsesLow.cons(var55, var46);
                    var54 = var54.rest();
                    var55 = var54.first();
                }
            }
        }
        return var46;
    }
    
    public static SubLObject f2580(final SubLObject var56) {
        SubLObject var57 = (SubLObject)NIL;
        final SubLObject var58 = (SubLObject)NIL;
        SubLObject var59;
        SubLObject var60;
        SubLObject var61;
        SubLObject var31_57;
        SubLObject var62;
        SubLObject var32_58;
        SubLObject var33_59;
        SubLObject var34_60;
        SubLObject var37_61;
        SubLObject var64;
        SubLObject var63;
        SubLObject var31_58;
        SubLObject var32_59;
        SubLObject var33_60;
        SubLObject var34_61;
        SubLObject var37_62;
        SubLObject var65;
        SubLObject var66;
        SubLObject var67;
        for (var59 = Sequences.length(var56), var60 = (SubLObject)NIL, var60 = (SubLObject)ZERO_INTEGER; var60.numL(var59); var60 = Numbers.add(var60, (SubLObject)ONE_INTEGER)) {
            var61 = ((NIL != var58) ? Numbers.subtract(var59, var60, (SubLObject)ONE_INTEGER) : var60);
            var62 = (var31_57 = Vectors.aref(var56, var61));
            var32_58 = (SubLObject)NIL;
            for (var33_59 = Sequences.length(var31_57), var34_60 = (SubLObject)NIL, var34_60 = (SubLObject)ZERO_INTEGER; var34_60.numL(var33_59); var34_60 = Numbers.add(var34_60, (SubLObject)ONE_INTEGER)) {
                var37_61 = ((NIL != var32_58) ? Numbers.subtract(var33_59, var34_60, (SubLObject)ONE_INTEGER) : var34_60);
                var63 = (var64 = Vectors.aref(var31_57, var37_61));
                if (var64.isVector()) {
                    var31_58 = var64;
                    var32_59 = (SubLObject)NIL;
                    for (var33_60 = Sequences.length(var31_58), var34_61 = (SubLObject)NIL, var34_61 = (SubLObject)ZERO_INTEGER; var34_61.numL(var33_60); var34_61 = Numbers.add(var34_61, (SubLObject)ONE_INTEGER)) {
                        var37_62 = ((NIL != var32_59) ? Numbers.subtract(var33_60, var34_61, (SubLObject)ONE_INTEGER) : var34_61);
                        var65 = Vectors.aref(var31_58, var37_62);
                        var57 = (SubLObject)ConsesLow.cons(var65, var57);
                    }
                }
                else {
                    var66 = var64;
                    var67 = (SubLObject)NIL;
                    var67 = var66.first();
                    while (NIL != var66) {
                        var57 = (SubLObject)ConsesLow.cons(var67, var57);
                        var66 = var66.rest();
                        var67 = var66.first();
                    }
                }
            }
        }
        return var57;
    }
    
    public static SubLObject f2581(final SubLObject var68) {
        if (var68.isVector()) {
            final SubLObject var69 = (SubLObject)NIL;
            SubLObject var70;
            SubLObject var71;
            SubLObject var72;
            SubLObject var73;
            for (var70 = Sequences.length(var68), var71 = (SubLObject)NIL, var71 = (SubLObject)ZERO_INTEGER; var71.numL(var70); var71 = Numbers.add(var71, (SubLObject)ONE_INTEGER)) {
                var72 = ((NIL != var69) ? Numbers.subtract(var70, var71, (SubLObject)ONE_INTEGER) : var71);
                var73 = Vectors.aref(var68, var72);
                if (NIL == module0048.f3285(var73)) {
                    return (SubLObject)NIL;
                }
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f2582(final SubLObject var69) {
        final SubLThread var70 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var69) : var69;
        SubLObject var71 = (SubLObject)NIL;
        SubLObject var72 = (SubLObject)NIL;
        try {
            final SubLObject var73 = stream_macros.$stream_requires_locking$.currentBinding(var70);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var70);
                var72 = compatibility.open_binary(var69, (SubLObject)$ic5$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var73, var70);
            }
            if (!var72.isStream()) {
                Errors.error((SubLObject)$ic6$, var69);
            }
            final SubLObject var27_72 = var72;
            final SubLObject var74 = streams_high.file_length(var27_72);
            var71 = Vectors.make_vector(var74, (SubLObject)UNPROVIDED);
            SubLObject var75;
            for (var75 = (SubLObject)NIL, var75 = (SubLObject)ZERO_INTEGER; var75.numL(var74); var75 = Numbers.add(var75, (SubLObject)ONE_INTEGER)) {
                Vectors.set_aref(var71, var75, streams_high.read_byte(var27_72, (SubLObject)T, (SubLObject)UNPROVIDED));
            }
        }
        finally {
            final SubLObject var76 = Threads.$is_thread_performing_cleanupP$.currentBinding(var70);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var70);
                if (var72.isStream()) {
                    streams_high.close(var72, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var76, var70);
            }
        }
        return var71;
    }
    
    public static SubLObject f2583(final SubLObject var70) {
        final SubLThread var71 = SubLProcess.currentSubLThread();
        assert NIL != f2581(var70) : var70;
        SubLObject var72 = (SubLObject)NIL;
        SubLObject var73 = (SubLObject)NIL;
        try {
            var73 = streams_high.make_private_string_output_stream();
            final SubLObject var74 = (SubLObject)NIL;
            SubLObject var75;
            SubLObject var76;
            SubLObject var77;
            SubLObject var78;
            SubLObject var79;
            SubLObject var80;
            for (var75 = Sequences.length(var70), var76 = (SubLObject)NIL, var76 = (SubLObject)ZERO_INTEGER; var76.numL(var75); var76 = Numbers.add(var76, (SubLObject)ONE_INTEGER)) {
                var77 = ((NIL != var74) ? Numbers.subtract(var75, var76, (SubLObject)ONE_INTEGER) : var76);
                var78 = Vectors.aref(var70, var77);
                var71.resetMultipleValues();
                var79 = f2584(var78);
                var80 = var71.secondMultipleValue();
                var71.resetMultipleValues();
                streams_high.write_char(var79, var73);
                streams_high.write_char(var80, var73);
            }
            var72 = streams_high.get_output_stream_string(var73);
        }
        finally {
            final SubLObject var81 = Threads.$is_thread_performing_cleanupP$.currentBinding(var71);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var71);
                streams_high.close(var73, (SubLObject)UNPROVIDED);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var81, var71);
            }
        }
        return var72;
    }
    
    public static SubLObject f2585(final SubLObject var70) {
        final SubLThread var71 = SubLProcess.currentSubLThread();
        final SubLObject var72 = Sequences.length(var70);
        final SubLObject var73 = Numbers.add((SubLObject)ONE_INTEGER, module0048.f3274(var72), Numbers.floor(module0048.f_1_(var72), (SubLObject)FOUR_INTEGER));
        final SubLObject var74 = Strings.make_string(var73, (SubLObject)UNPROVIDED);
        SubLObject var75 = (SubLObject)ZERO_INTEGER;
        final SubLObject var76 = (SubLObject)NIL;
        SubLObject var77;
        SubLObject var78;
        SubLObject var79;
        SubLObject var80;
        SubLObject var81;
        SubLObject var82;
        for (var77 = Sequences.length(var70), var78 = (SubLObject)NIL, var78 = (SubLObject)ZERO_INTEGER; var78.numL(var77); var78 = Numbers.add(var78, (SubLObject)ONE_INTEGER)) {
            var79 = ((NIL != var76) ? Numbers.subtract(var77, var78, (SubLObject)ONE_INTEGER) : var78);
            var80 = Vectors.aref(var70, var79);
            if (Numbers.mod(var79, (SubLObject)$ic8$).isZero()) {
                Vectors.set_aref(var74, var75, (SubLObject)Characters.CHAR_newline);
                var75 = Numbers.add(var75, (SubLObject)ONE_INTEGER);
            }
            else if (Numbers.mod(var79, (SubLObject)FOUR_INTEGER).isZero()) {
                Vectors.set_aref(var74, var75, (SubLObject)Characters.CHAR_space);
                var75 = Numbers.add(var75, (SubLObject)ONE_INTEGER);
            }
            var71.resetMultipleValues();
            var81 = f2584(var80);
            var82 = var71.secondMultipleValue();
            var71.resetMultipleValues();
            Vectors.set_aref(var74, var75, var81);
            var75 = Numbers.add(var75, (SubLObject)ONE_INTEGER);
            Vectors.set_aref(var74, var75, var82);
            var75 = Numbers.add(var75, (SubLObject)ONE_INTEGER);
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var71) && !var75.numE(var73)) {
            Errors.error((SubLObject)$ic9$, var75, var73);
        }
        return var74;
    }
    
    public static SubLObject f2586(final SubLObject var70) {
        assert NIL != f2581(var70) : var70;
        final SubLObject var71 = Sequences.length(var70);
        final SubLObject var72 = Strings.make_string(var71, (SubLObject)UNPROVIDED);
        final SubLObject var73 = (SubLObject)NIL;
        SubLObject var33_82;
        SubLObject var74;
        SubLObject var75;
        SubLObject var76;
        for (var33_82 = Sequences.length(var70), var74 = (SubLObject)NIL, var74 = (SubLObject)ZERO_INTEGER; var74.numL(var33_82); var74 = Numbers.add(var74, (SubLObject)ONE_INTEGER)) {
            var75 = ((NIL != var73) ? Numbers.subtract(var33_82, var74, (SubLObject)ONE_INTEGER) : var74);
            var76 = Vectors.aref(var70, var75);
            Strings.set_char(var72, var75, Characters.code_char(var76));
        }
        return var72;
    }
    
    public static SubLObject f2587(final SubLObject var73) {
        assert NIL != module0038.f2794(var73) : var73;
        final SubLObject var74 = Sequences.length(var73);
        assert NIL != Numbers.evenp(var74) : var74;
        final SubLObject var75 = Numbers.integerDivide(var74, (SubLObject)TWO_INTEGER);
        final SubLObject var76 = Vectors.make_vector(var75, (SubLObject)UNPROVIDED);
        SubLObject var77;
        SubLObject var78;
        SubLObject var79;
        SubLObject var80;
        SubLObject var81;
        for (var77 = (SubLObject)NIL, var77 = (SubLObject)ZERO_INTEGER; var77.numL(var75); var77 = Numbers.add(var77, (SubLObject)ONE_INTEGER)) {
            var78 = Numbers.multiply((SubLObject)TWO_INTEGER, var77);
            var79 = Strings.sublisp_char(var73, var78);
            var80 = Strings.sublisp_char(var73, Numbers.add((SubLObject)ONE_INTEGER, var78));
            var81 = f2588(var79, var80);
            Vectors.set_aref(var76, var77, var81);
        }
        return var76;
    }
    
    public static SubLObject f2584(final SubLObject var74) {
        final SubLObject var75 = Numbers.integerDivide(var74, (SubLObject)SIXTEEN_INTEGER);
        final SubLObject var76 = Numbers.mod(var74, (SubLObject)SIXTEEN_INTEGER);
        return Values.values(module0038.f2792(var75), module0038.f2792(var76));
    }
    
    public static SubLObject f2588(final SubLObject var75, final SubLObject var76) {
        final SubLObject var77 = module0038.f2793(var75);
        final SubLObject var78 = module0038.f2793(var76);
        return Numbers.add(Numbers.multiply((SubLObject)SIXTEEN_INTEGER, var77), var78);
    }
    
    public static SubLObject f2589(final SubLObject var70) {
        assert NIL != f2581(var70) : var70;
        SubLObject var71 = (SubLObject)ZERO_INTEGER;
        SubLObject var72 = (SubLObject)NIL;
        SubLObject var73 = (SubLObject)NIL;
        SubLObject var74 = (SubLObject)NIL;
        SubLObject var75 = (SubLObject)NIL;
        try {
            var75 = streams_high.make_private_string_output_stream();
            final SubLObject var76 = (SubLObject)NIL;
            SubLObject var77;
            SubLObject var78;
            SubLObject var79;
            SubLObject var80;
            SubLObject var81;
            SubLObject var82;
            for (var77 = Sequences.length(var70), var78 = (SubLObject)NIL, var78 = (SubLObject)ZERO_INTEGER; var78.numL(var77); var78 = Numbers.add(var78, (SubLObject)ONE_INTEGER)) {
                var79 = ((NIL != var76) ? Numbers.subtract(var77, var78, (SubLObject)ONE_INTEGER) : var78);
                var80 = Vectors.aref(var70, var79);
                var81 = var71;
                if (var81.eql((SubLObject)ZERO_INTEGER)) {
                    var73 = var80;
                }
                else if (var81.eql((SubLObject)ONE_INTEGER)) {
                    var74 = var80;
                }
                else if (var81.eql((SubLObject)TWO_INTEGER)) {
                    var82 = var80;
                    f2590(var73, var74, var82, var75);
                    var71 = (SubLObject)MINUS_ONE_INTEGER;
                }
                var71 = Numbers.add(var71, (SubLObject)ONE_INTEGER);
            }
            final SubLObject var83 = var71;
            if (!var83.eql((SubLObject)ZERO_INTEGER)) {
                if (var83.eql((SubLObject)ONE_INTEGER)) {
                    var74 = (SubLObject)NIL;
                    final SubLObject var84 = (SubLObject)NIL;
                    f2590(var73, var74, var84, var75);
                }
                else if (var83.eql((SubLObject)TWO_INTEGER)) {
                    final SubLObject var84 = (SubLObject)NIL;
                    f2590(var73, var74, var84, var75);
                }
            }
            var72 = streams_high.get_output_stream_string(var75);
        }
        finally {
            final SubLObject var85 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                streams_high.close(var75, (SubLObject)UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var85);
            }
        }
        return var72;
    }
    
    public static SubLObject f2590(final SubLObject var88, final SubLObject var89, final SubLObject var91, final SubLObject var27) {
        final SubLThread var92 = SubLProcess.currentSubLThread();
        var92.resetMultipleValues();
        final SubLObject var93 = f2591(var88, var89, var91);
        final SubLObject var94 = var92.secondMultipleValue();
        final SubLObject var95 = var92.thirdMultipleValue();
        final SubLObject var96 = var92.fourthMultipleValue();
        var92.resetMultipleValues();
        streams_high.write_char(var93, var27);
        streams_high.write_char(var94, var27);
        if (NIL != var95) {
            streams_high.write_char(var95, var27);
        }
        if (NIL != var96) {
            streams_high.write_char(var96, var27);
        }
        return var27;
    }
    
    public static SubLObject f2591(final SubLObject var88, SubLObject var89, SubLObject var91) {
        SubLObject var92 = (SubLObject)ZERO_INTEGER;
        if (NIL == var91) {
            var91 = (SubLObject)ZERO_INTEGER;
            var92 = Numbers.add(var92, (SubLObject)ONE_INTEGER);
        }
        if (NIL == var89) {
            var89 = (SubLObject)ZERO_INTEGER;
            var92 = Numbers.add(var92, (SubLObject)ONE_INTEGER);
        }
        final SubLObject var93 = bytes.ldb(bytes.sublisp_byte((SubLObject)SIX_INTEGER, (SubLObject)TWO_INTEGER), var88);
        final SubLObject var94 = bytes.ldb(bytes.sublisp_byte((SubLObject)TWO_INTEGER, (SubLObject)ZERO_INTEGER), var88);
        final SubLObject var95 = bytes.ldb(bytes.sublisp_byte((SubLObject)FOUR_INTEGER, (SubLObject)FOUR_INTEGER), var89);
        final SubLObject var96 = bytes.ldb(bytes.sublisp_byte((SubLObject)FOUR_INTEGER, (SubLObject)ZERO_INTEGER), var89);
        final SubLObject var97 = bytes.ldb(bytes.sublisp_byte((SubLObject)TWO_INTEGER, (SubLObject)SIX_INTEGER), var91);
        final SubLObject var98 = bytes.ldb(bytes.sublisp_byte((SubLObject)SIX_INTEGER, (SubLObject)ZERO_INTEGER), var91);
        final SubLObject var99 = Numbers.add(Numbers.ash(var94, (SubLObject)FOUR_INTEGER), var95);
        final SubLObject var100 = Numbers.add(Numbers.ash(var96, (SubLObject)TWO_INTEGER), var97);
        final SubLObject var101 = module0038.f2799(var93);
        final SubLObject var102 = module0038.f2799(var99);
        SubLObject var103 = module0038.f2799(var100);
        SubLObject var104 = module0038.f2799(var98);
        if (var92.numG((SubLObject)ZERO_INTEGER)) {
            var104 = (SubLObject)NIL;
            if (var92.numG((SubLObject)ONE_INTEGER)) {
                var103 = (SubLObject)NIL;
            }
        }
        return Values.values(var101, var102, var103, var104);
    }
    
    public static SubLObject f2592(final SubLObject var92, final SubLObject var75, SubLObject var76, SubLObject var93) {
        SubLObject var94 = (SubLObject)ZERO_INTEGER;
        if (NIL == var93 || NIL != Characters.charE((SubLObject)Characters.CHAR_equal, var93)) {
            var93 = (SubLObject)Characters.CHAR_A;
            var94 = Numbers.add(var94, (SubLObject)ONE_INTEGER);
        }
        if (NIL == var76 || NIL != Characters.charE((SubLObject)Characters.CHAR_equal, var76)) {
            var76 = (SubLObject)Characters.CHAR_A;
            var94 = Numbers.add(var94, (SubLObject)ONE_INTEGER);
        }
        final SubLObject var95 = module0038.f2800(var92);
        final SubLObject var96 = module0038.f2800(var75);
        final SubLObject var97 = module0038.f2800(var76);
        final SubLObject var98 = module0038.f2800(var93);
        final SubLObject var99 = bytes.ldb(bytes.sublisp_byte((SubLObject)TWO_INTEGER, (SubLObject)FOUR_INTEGER), var96);
        final SubLObject var100 = bytes.ldb(bytes.sublisp_byte((SubLObject)FOUR_INTEGER, (SubLObject)ZERO_INTEGER), var96);
        final SubLObject var101 = bytes.ldb(bytes.sublisp_byte((SubLObject)FOUR_INTEGER, (SubLObject)TWO_INTEGER), var97);
        final SubLObject var102 = bytes.ldb(bytes.sublisp_byte((SubLObject)TWO_INTEGER, (SubLObject)ZERO_INTEGER), var97);
        final SubLObject var103 = Numbers.add(Numbers.ash(var95, (SubLObject)TWO_INTEGER), var99);
        SubLObject var104 = Numbers.add(Numbers.ash(var100, (SubLObject)FOUR_INTEGER), var101);
        SubLObject var105 = Numbers.add(Numbers.ash(var102, (SubLObject)SIX_INTEGER), var98);
        if (var94.numG((SubLObject)ZERO_INTEGER)) {
            var105 = (SubLObject)NIL;
            if (var94.numG((SubLObject)ONE_INTEGER)) {
                var104 = (SubLObject)NIL;
            }
        }
        return Values.values(var103, var104, var105);
    }
    
    public static SubLObject f2593(final SubLObject var103) {
        final SubLThread var104 = SubLProcess.currentSubLThread();
        assert NIL != module0038.f2801(var103) : var103;
        final SubLObject var105 = Sequences.length(var103);
        final SubLObject var106 = f2594(var103);
        final SubLObject var107 = f2595(var103);
        final SubLObject var108 = Vectors.make_vector(var107, (SubLObject)UNPROVIDED);
        SubLObject var109 = (SubLObject)ZERO_INTEGER;
        SubLObject var110 = (SubLObject)ZERO_INTEGER;
        SubLObject var111 = (SubLObject)NIL;
        SubLObject var112 = (SubLObject)NIL;
        SubLObject var113 = (SubLObject)NIL;
        SubLObject var114 = (SubLObject)NIL;
        SubLObject var115;
        SubLObject var116;
        SubLObject var117;
        SubLObject var118;
        for (var115 = (SubLObject)NIL, var115 = (SubLObject)ZERO_INTEGER; var115.numL(var106); var115 = Numbers.add(var115, (SubLObject)ONE_INTEGER)) {
            var111 = Strings.sublisp_char(var103, var109);
            var109 = Numbers.add(var109, (SubLObject)ONE_INTEGER);
            var112 = Strings.sublisp_char(var103, var109);
            var109 = Numbers.add(var109, (SubLObject)ONE_INTEGER);
            var113 = (SubLObject)(var109.numL(var105) ? Strings.sublisp_char(var103, var109) : NIL);
            var109 = Numbers.add(var109, (SubLObject)ONE_INTEGER);
            var114 = (SubLObject)(var109.numL(var105) ? Strings.sublisp_char(var103, var109) : NIL);
            var109 = Numbers.add(var109, (SubLObject)ONE_INTEGER);
            var104.resetMultipleValues();
            var116 = f2592(var111, var112, var113, var114);
            var117 = var104.secondMultipleValue();
            var118 = var104.thirdMultipleValue();
            var104.resetMultipleValues();
            Vectors.set_aref(var108, var110, var116);
            var110 = Numbers.add(var110, (SubLObject)ONE_INTEGER);
            if (NIL != var117) {
                Vectors.set_aref(var108, var110, var117);
                var110 = Numbers.add(var110, (SubLObject)ONE_INTEGER);
            }
            if (NIL != var118) {
                Vectors.set_aref(var108, var110, var118);
                var110 = Numbers.add(var110, (SubLObject)ONE_INTEGER);
            }
        }
        return var108;
    }
    
    public static SubLObject f2594(final SubLObject var103) {
        assert NIL != Types.stringp(var103) : var103;
        final SubLObject var104 = Sequences.length(var103);
        return Numbers.ceiling(var104, (SubLObject)FOUR_INTEGER);
    }
    
    public static SubLObject f2595(final SubLObject var103) {
        final SubLThread var104 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var103) : var103;
        final SubLObject var105 = Sequences.length(var103);
        if (var105.isZero()) {
            return (SubLObject)ZERO_INTEGER;
        }
        var104.resetMultipleValues();
        final SubLObject var106 = f2594(var103);
        final SubLObject var107 = var104.secondMultipleValue();
        var104.resetMultipleValues();
        SubLObject var108 = Numbers.multiply((SubLObject)THREE_INTEGER, module0048.f_1_(var106));
        if (!var107.isZero()) {
            var108 = Numbers.add(var108, Numbers.add(var107, (SubLObject)THREE_INTEGER));
        }
        else if (NIL == Characters.charE((SubLObject)Characters.CHAR_equal, Strings.sublisp_char(var103, Numbers.subtract(var105, (SubLObject)ONE_INTEGER)))) {
            var108 = Numbers.add(var108, (SubLObject)THREE_INTEGER);
        }
        else if (NIL == Characters.charE((SubLObject)Characters.CHAR_equal, Strings.sublisp_char(var103, Numbers.subtract(var105, (SubLObject)TWO_INTEGER)))) {
            var108 = Numbers.add(var108, (SubLObject)TWO_INTEGER);
        }
        else {
            var108 = Numbers.add(var108, (SubLObject)ONE_INTEGER);
        }
        return var108;
    }
    
    public static SubLObject f2596(final SubLObject var18, final SubLObject var1, final SubLObject var108, final SubLObject var109, final SubLObject var110, SubLObject var24, SubLObject var25, SubLObject var111) {
        if (var24 == UNPROVIDED) {
            var24 = Symbols.symbol_function((SubLObject)EQL);
        }
        if (var25 == UNPROVIDED) {
            var25 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        if (var111 == UNPROVIDED) {
            var111 = (SubLObject)NIL;
        }
        final SubLThread var112 = SubLProcess.currentSubLThread();
        var112.resetMultipleValues();
        SubLObject var113 = f2597(var18, var1, var108, var109, var110, var24, var25, var111);
        SubLObject var114 = var112.secondMultipleValue();
        var112.resetMultipleValues();
        if (var113.numE(var114)) {
            final SubLObject var115 = Functions.funcall(var25, Vectors.aref(var1, var113));
            for (SubLObject var116 = (SubLObject)makeBoolean(!var113.isPositive()); NIL == var116; var116 = (SubLObject)makeBoolean(NIL != var116 || !var113.isPositive())) {
                final SubLObject var117 = Numbers.subtract(var113, (SubLObject)ONE_INTEGER);
                final SubLObject var118 = Functions.funcall(var25, Vectors.aref(var1, var117));
                if (NIL != Functions.funcall(var24, var115, var118)) {
                    var113 = var117;
                }
                else {
                    var116 = (SubLObject)T;
                }
            }
            for (SubLObject var119 = Numbers.subtract(var109, (SubLObject)ONE_INTEGER), var116 = (SubLObject)makeBoolean(!var114.numL(var119)); NIL == var116; var116 = (SubLObject)makeBoolean(NIL != var116 || !var114.numL(var119))) {
                final SubLObject var120 = Numbers.add(var114, (SubLObject)ONE_INTEGER);
                final SubLObject var121 = Functions.funcall(var25, Vectors.aref(var1, var120));
                if (NIL != Functions.funcall(var24, var115, var121)) {
                    var114 = var120;
                }
                else {
                    var116 = (SubLObject)T;
                }
            }
            return Values.values(var113, var114, (SubLObject)T);
        }
        if (var113.numE(var109)) {
            return Values.values(var113, var114, (SubLObject)NIL);
        }
        final SubLObject var122 = Functions.funcall(var25, Vectors.aref(var1, var113));
        if (NIL != Functions.funcall(var110, var18, var122)) {
            return Values.values(Numbers.subtract(var113, (SubLObject)ONE_INTEGER), Numbers.subtract(var114, (SubLObject)ONE_INTEGER), (SubLObject)NIL);
        }
        return Values.values(var113, var114, (SubLObject)NIL);
    }
    
    public static SubLObject f2598(final SubLObject var18, final SubLObject var1, final SubLObject var108, final SubLObject var109, final SubLObject var110, final SubLObject var25) {
        return Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f2596(var18, var1, var108, var109, var110, (SubLObject)EQL, var25, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f2599(final SubLObject var18, final SubLObject var1, final SubLObject var108, final SubLObject var109, final SubLObject var110) {
        return Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f2596(var18, var1, var108, var109, var110, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f2597(final SubLObject var18, final SubLObject var1, final SubLObject var108, final SubLObject var109, final SubLObject var110, SubLObject var24, SubLObject var25, SubLObject var111) {
        if (var24 == UNPROVIDED) {
            var24 = Symbols.symbol_function((SubLObject)EQL);
        }
        if (var25 == UNPROVIDED) {
            var25 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        if (var111 == UNPROVIDED) {
            var111 = (SubLObject)NIL;
        }
        return f2600(var18, var1, var108, var109, var110, var24, var25, var111);
    }
    
    public static SubLObject f2601(final SubLObject var18, final SubLObject var1, final SubLObject var110, SubLObject var24, SubLObject var25, SubLObject var111) {
        if (var24 == UNPROVIDED) {
            var24 = Symbols.symbol_function((SubLObject)EQL);
        }
        if (var25 == UNPROVIDED) {
            var25 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        if (var111 == UNPROVIDED) {
            var111 = (SubLObject)NIL;
        }
        return f2600(var18, var1, (SubLObject)ZERO_INTEGER, Sequences.length(var1), var110, var24, var25, var111);
    }
    
    public static SubLObject f2602(final SubLObject var18, final SubLObject var1, final SubLObject var110, SubLObject var24, SubLObject var25, SubLObject var111) {
        if (var24 == UNPROVIDED) {
            var24 = Symbols.symbol_function((SubLObject)EQL);
        }
        if (var25 == UNPROVIDED) {
            var25 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        if (var111 == UNPROVIDED) {
            var111 = (SubLObject)NIL;
        }
        final SubLThread var112 = SubLProcess.currentSubLThread();
        var112.resetMultipleValues();
        final SubLObject var113 = f2600(var18, var1, (SubLObject)ZERO_INTEGER, Sequences.length(var1), var110, var24, var25, var111);
        final SubLObject var114 = var112.secondMultipleValue();
        var112.resetMultipleValues();
        if (var113.numE(var114)) {
            return var113;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f2600(final SubLObject var18, final SubLObject var1, SubLObject var108, SubLObject var109, final SubLObject var110, final SubLObject var24, final SubLObject var25, final SubLObject var111) {
        final SubLThread var112 = SubLProcess.currentSubLThread();
        while (!var108.numE(var109)) {
            if (!var108.numL(var109)) {
                return Values.values(var109, var108);
            }
            final SubLObject var113 = Numbers.integerDivide(Numbers.add(var108, var109), (SubLObject)TWO_INTEGER);
            final SubLObject var114 = Vectors.aref(var1, var113);
            if (NIL == var111 || NIL == Functions.funcall(var111, var114)) {
                final SubLObject var115 = Functions.funcall(var25, var114);
                if (NIL != Functions.funcall(var24, var18, var115)) {
                    return Values.values(var113, var113);
                }
                if (NIL != Functions.funcall(var110, var18, var115)) {
                    var109 = var113;
                }
                else {
                    var108 = Numbers.add(var113, (SubLObject)ONE_INTEGER);
                }
            }
            else {
                var112.resetMultipleValues();
                final SubLObject var116 = f2600(var18, var1, var108, var113, var110, var24, var25, var111);
                final SubLObject var117 = var112.secondMultipleValue();
                var112.resetMultipleValues();
                if (var116.numE(var117)) {
                    return Values.values(var116, var117);
                }
                return f2600(var18, var1, Numbers.add(var113, (SubLObject)ONE_INTEGER), var109, var110, var24, var25, var111);
            }
        }
        return Values.values(var108, Numbers.add(var109, (SubLObject)ONE_INTEGER));
    }
    
    public static SubLObject f2603() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0037", "f2558", "S#2026", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0037", "f2559", "S#3897", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0037", "f2560", "S#3898", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0037", "f2561", "S#3899", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0037", "f2562", "S#3293", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0037", "f2563", "S#3900", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0037", "f2564", "S#3901", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0037", "f2565", "S#3902", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0037", "f2566", "S#3903", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0037", "f2567", "S#3904", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0037", "f2568", "S#3905", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0037", "f2569", "S#3906", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0037", "f2570", "S#3907", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0037", "f2571", "S#3908", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0037", "f2572", "S#3909", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0037", "f2573", "S#3910", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0037", "f2574", "S#3911", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0037", "f2575", "S#3912", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0037", "f2576", "S#3913", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0037", "f2577", "S#3914", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0037", "f2578", "S#3915", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0037", "f2579", "S#3916", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0037", "f2580", "S#3917", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0037", "f2581", "S#2001", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0037", "f2582", "S#915", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0037", "f2583", "S#2008", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0037", "f2585", "S#3918", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0037", "f2586", "S#3919", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0037", "f2587", "S#2005", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0037", "f2584", "S#2004", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0037", "f2588", "S#2009", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0037", "f2589", "S#916", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0037", "f2590", "S#3920", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0037", "f2591", "S#3921", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0037", "f2592", "S#3922", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0037", "f2593", "S#3923", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0037", "f2594", "S#3924", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0037", "f2595", "S#3925", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0037", "f2596", "S#3926", 5, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0037", "f2598", "S#3927", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0037", "f2599", "S#3928", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0037", "f2597", "S#3929", 5, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0037", "f2601", "S#3930", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0037", "f2602", "S#3931", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0037", "f2600", "S#3932", 8, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f2604() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f2605() {
        module0002.f35((SubLObject)$ic2$, (SubLObject)$ic3$);
        module0027.f1449((SubLObject)$ic13$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic14$, NIL, $ic15$, NIL, $ic16$, NIL, $ic17$, $ic18$, $ic19$, T }), (SubLObject)$ic20$);
        module0027.f1449((SubLObject)$ic21$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic14$, NIL, $ic15$, NIL, $ic16$, NIL, $ic17$, $ic18$, $ic19$, T }), (SubLObject)$ic22$);
        module0027.f1449((SubLObject)$ic23$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic14$, NIL, $ic15$, NIL, $ic16$, NIL, $ic17$, $ic18$, $ic19$, T }), (SubLObject)$ic24$);
        module0027.f1449((SubLObject)$ic25$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic14$, NIL, $ic15$, NIL, $ic16$, NIL, $ic17$, $ic18$, $ic19$, T }), (SubLObject)$ic26$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f2603();
    }
    
    public void initializeVariables() {
        f2604();
    }
    
    public void runTopLevelForms() {
        f2605();
    }
    
    static {
        me = (SubLFile)new module0037();
        $ic0$ = makeSymbol("VECTORP");
        $ic1$ = makeSymbol("INTEGERP");
        $ic2$ = makeSymbol("S#3904", "CYC");
        $ic3$ = ConsesLow.list((SubLObject)makeSymbol("S#3903", "CYC"));
        $ic4$ = makeSymbol("STRINGP");
        $ic5$ = makeKeyword("INPUT");
        $ic6$ = makeString("Unable to open ~S");
        $ic7$ = makeSymbol("S#2001", "CYC");
        $ic8$ = makeInteger(32);
        $ic9$ = makeString("Did not fill up all the expected characters of the hex string: ~s != ~s~%");
        $ic10$ = makeSymbol("S#3891", "CYC");
        $ic11$ = makeSymbol("EVENP");
        $ic12$ = makeSymbol("S#3896", "CYC");
        $ic13$ = makeSymbol("S#3924", "CYC");
        $ic14$ = makeKeyword("TEST");
        $ic15$ = makeKeyword("OWNER");
        $ic16$ = makeKeyword("CLASSES");
        $ic17$ = makeKeyword("KB");
        $ic18$ = makeKeyword("TINY");
        $ic19$ = makeKeyword("WORKING?");
        $ic20$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("")), (SubLObject)ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("AA")), (SubLObject)ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("AAA")), (SubLObject)ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("AA==")), (SubLObject)ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("AAA=")), (SubLObject)ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("AAAA")), (SubLObject)ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("AAAAAA")), (SubLObject)TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("AAAAAA==")), (SubLObject)TWO_INTEGER));
        $ic21$ = makeSymbol("S#3925", "CYC");
        $ic22$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("")), (SubLObject)ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("AA")), (SubLObject)ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("AA==")), (SubLObject)ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("AAA")), (SubLObject)TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("AAA=")), (SubLObject)TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("AAAA")), (SubLObject)THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("AAAAAA")), (SubLObject)FOUR_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("AAAAAA==")), (SubLObject)FOUR_INTEGER));
        $ic23$ = makeSymbol("S#3928", "CYC");
        $ic24$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ZERO_INTEGER, Vectors.vector(new SubLObject[] { ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, THREE_INTEGER, THREE_INTEGER, FOUR_INTEGER }), (SubLObject)ZERO_INTEGER, (SubLObject)SIX_INTEGER, (SubLObject)makeSymbol("<")), (SubLObject)ConsesLow.list((SubLObject)MINUS_ONE_INTEGER, (SubLObject)ZERO_INTEGER, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ONE_INTEGER, Vectors.vector(new SubLObject[] { ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, THREE_INTEGER, THREE_INTEGER, FOUR_INTEGER }), (SubLObject)ZERO_INTEGER, (SubLObject)SIX_INTEGER, (SubLObject)makeSymbol("<")), (SubLObject)ConsesLow.list((SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER, (SubLObject)T)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeDouble(1.2), Vectors.vector(new SubLObject[] { ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, THREE_INTEGER, THREE_INTEGER, FOUR_INTEGER }), (SubLObject)ZERO_INTEGER, (SubLObject)SIX_INTEGER, (SubLObject)makeSymbol("<")), (SubLObject)ConsesLow.list((SubLObject)ZERO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)TWO_INTEGER, Vectors.vector(new SubLObject[] { ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, THREE_INTEGER, THREE_INTEGER, FOUR_INTEGER }), (SubLObject)ZERO_INTEGER, (SubLObject)SIX_INTEGER, (SubLObject)makeSymbol("<")), (SubLObject)ConsesLow.list((SubLObject)ONE_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)T)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)THREE_INTEGER, Vectors.vector(new SubLObject[] { ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, THREE_INTEGER, THREE_INTEGER, FOUR_INTEGER }), (SubLObject)ZERO_INTEGER, (SubLObject)SIX_INTEGER, (SubLObject)makeSymbol("<")), (SubLObject)ConsesLow.list((SubLObject)TWO_INTEGER, (SubLObject)FOUR_INTEGER, (SubLObject)T)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)FOUR_INTEGER, Vectors.vector(new SubLObject[] { ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, THREE_INTEGER, THREE_INTEGER, FOUR_INTEGER }), (SubLObject)ZERO_INTEGER, (SubLObject)SIX_INTEGER, (SubLObject)makeSymbol("<")), (SubLObject)ConsesLow.list((SubLObject)FIVE_INTEGER, (SubLObject)FIVE_INTEGER, (SubLObject)T)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)FIVE_INTEGER, Vectors.vector(new SubLObject[] { ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, THREE_INTEGER, THREE_INTEGER, FOUR_INTEGER }), (SubLObject)ZERO_INTEGER, (SubLObject)SIX_INTEGER, (SubLObject)makeSymbol("<")), (SubLObject)ConsesLow.list((SubLObject)SIX_INTEGER, (SubLObject)SEVEN_INTEGER, (SubLObject)NIL)));
        $ic25$ = makeSymbol("S#3927", "CYC");
        $ic26$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ZERO_INTEGER, Vectors.vector(new SubLObject[] { ConsesLow.list((SubLObject)ONE_INTEGER), ConsesLow.list((SubLObject)TWO_INTEGER), ConsesLow.list((SubLObject)THREE_INTEGER), ConsesLow.list((SubLObject)THREE_INTEGER), ConsesLow.list((SubLObject)THREE_INTEGER), ConsesLow.list((SubLObject)FOUR_INTEGER) }), (SubLObject)ZERO_INTEGER, (SubLObject)SIX_INTEGER, (SubLObject)makeSymbol("<"), (SubLObject)makeSymbol("FIRST")), (SubLObject)ConsesLow.list((SubLObject)MINUS_ONE_INTEGER, (SubLObject)ZERO_INTEGER, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ONE_INTEGER, Vectors.vector(new SubLObject[] { ConsesLow.list((SubLObject)ONE_INTEGER), ConsesLow.list((SubLObject)TWO_INTEGER), ConsesLow.list((SubLObject)THREE_INTEGER), ConsesLow.list((SubLObject)THREE_INTEGER), ConsesLow.list((SubLObject)THREE_INTEGER), ConsesLow.list((SubLObject)FOUR_INTEGER) }), (SubLObject)ZERO_INTEGER, (SubLObject)SIX_INTEGER, (SubLObject)makeSymbol("<"), (SubLObject)makeSymbol("FIRST")), (SubLObject)ConsesLow.list((SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER, (SubLObject)T)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)TWO_INTEGER, Vectors.vector(new SubLObject[] { ConsesLow.list((SubLObject)ONE_INTEGER), ConsesLow.list((SubLObject)TWO_INTEGER), ConsesLow.list((SubLObject)THREE_INTEGER), ConsesLow.list((SubLObject)THREE_INTEGER), ConsesLow.list((SubLObject)THREE_INTEGER), ConsesLow.list((SubLObject)FOUR_INTEGER) }), (SubLObject)ZERO_INTEGER, (SubLObject)SIX_INTEGER, (SubLObject)makeSymbol("<"), (SubLObject)makeSymbol("FIRST")), (SubLObject)ConsesLow.list((SubLObject)ONE_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)T)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeDouble(2.6), Vectors.vector(new SubLObject[] { ConsesLow.list((SubLObject)ONE_INTEGER), ConsesLow.list((SubLObject)TWO_INTEGER), ConsesLow.list((SubLObject)THREE_INTEGER), ConsesLow.list((SubLObject)THREE_INTEGER), ConsesLow.list((SubLObject)THREE_INTEGER), ConsesLow.list((SubLObject)FOUR_INTEGER) }), (SubLObject)ZERO_INTEGER, (SubLObject)SIX_INTEGER, (SubLObject)makeSymbol("<"), (SubLObject)makeSymbol("FIRST")), (SubLObject)ConsesLow.list((SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)THREE_INTEGER, Vectors.vector(new SubLObject[] { ConsesLow.list((SubLObject)ONE_INTEGER), ConsesLow.list((SubLObject)TWO_INTEGER), ConsesLow.list((SubLObject)THREE_INTEGER), ConsesLow.list((SubLObject)THREE_INTEGER), ConsesLow.list((SubLObject)THREE_INTEGER), ConsesLow.list((SubLObject)FOUR_INTEGER) }), (SubLObject)ZERO_INTEGER, (SubLObject)SIX_INTEGER, (SubLObject)makeSymbol("<"), (SubLObject)makeSymbol("FIRST")), (SubLObject)ConsesLow.list((SubLObject)TWO_INTEGER, (SubLObject)FOUR_INTEGER, (SubLObject)T)));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 298 ms
	
	Decompiled with Procyon 0.5.32.
*/