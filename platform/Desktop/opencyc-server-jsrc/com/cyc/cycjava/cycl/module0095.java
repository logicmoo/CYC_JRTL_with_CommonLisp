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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0095 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0095";
    public static final String myFingerPrint = "86c83569f7342c9a9cebbe185a4b7a875fd7440b75206d3399ccc67ce63b3cd3";
    public static SubLSymbol $g1258$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLString $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLString $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLString $ic23$;
    private static final SubLString $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLInteger $ic27$;
    private static final SubLInteger $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLString $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLList $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLList $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLList $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLList $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLString $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLList $ic58$;
    private static final SubLString $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLInteger $ic61$;
    private static final SubLString $ic62$;
    private static final SubLString $ic63$;
    private static final SubLString $ic64$;
    private static final SubLList $ic65$;
    private static final SubLString $ic66$;
    private static final SubLString $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    
    
    public static SubLObject f6833(final SubLObject var1, final SubLObject var2) {
        f6834(var1, var2, (SubLObject)module0095.ZERO_INTEGER);
        return (SubLObject)module0095.NIL;
    }
    
    public static SubLObject f6835(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX8624_native.class) ? module0095.T : module0095.NIL);
    }
    
    public static SubLObject f6836(final SubLObject var1) {
        assert module0095.NIL != f6835(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f6837(final SubLObject var1) {
        assert module0095.NIL != f6835(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f6838(final SubLObject var1, final SubLObject var4) {
        assert module0095.NIL != f6835(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f6839(final SubLObject var1, final SubLObject var4) {
        assert module0095.NIL != f6835(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f6840(SubLObject var5) {
        if (var5 == module0095.UNPROVIDED) {
            var5 = (SubLObject)module0095.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX8624_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0095.NIL, var7 = var5; module0095.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0095.$ic13$)) {
                f6838(var6, var9);
            }
            else if (var10.eql((SubLObject)module0095.$ic14$)) {
                f6839(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0095.$ic15$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f6841(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0095.$ic16$, (SubLObject)module0095.$ic17$, (SubLObject)module0095.TWO_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0095.$ic18$, (SubLObject)module0095.$ic13$, f6836(var11));
        Functions.funcall(var12, var11, (SubLObject)module0095.$ic18$, (SubLObject)module0095.$ic14$, f6837(var11));
        Functions.funcall(var12, var11, (SubLObject)module0095.$ic19$, (SubLObject)module0095.$ic17$, (SubLObject)module0095.TWO_INTEGER);
        return var11;
    }
    
    public static SubLObject f6842(final SubLObject var11, final SubLObject var12) {
        return f6841(var11, var12);
    }
    
    public static SubLObject f6834(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (module0095.NIL != print_high.$print_readably$.getDynamicValue(var15)) {
            print_high.print_not_readable(var13, var2);
        }
        else {
            streams_high.write_string((SubLObject)module0095.$ic21$, var2, (SubLObject)module0095.UNPROVIDED, (SubLObject)module0095.UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var13), new SubLObject[] { module0095.$ic22$, var2 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            streams_high.write_string((SubLObject)module0095.$ic23$, var2, (SubLObject)module0095.UNPROVIDED, (SubLObject)module0095.UNPROVIDED);
            print_high.princ(f6836(var13), var2);
            streams_high.write_string((SubLObject)module0095.$ic24$, var2, (SubLObject)module0095.UNPROVIDED, (SubLObject)module0095.UNPROVIDED);
            print_high.princ(f6837(var13), var2);
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var2);
        }
        return var13;
    }
    
    public static SubLObject f6843(final SubLObject var20, final SubLObject var21) {
        final SubLObject var22 = f6840((SubLObject)module0095.UNPROVIDED);
        f6838(var22, var20);
        f6839(var22, var21);
        return var22;
    }
    
    public static SubLObject f6844(final SubLObject var13) {
        return f6835(var13);
    }
    
    public static SubLObject f6845(final SubLObject var23, final SubLObject var24, SubLObject var25, SubLObject var26, SubLObject var27, SubLObject var28) {
        if (var25 == module0095.UNPROVIDED) {
            var25 = (SubLObject)module0095.$ic26$;
        }
        if (var26 == module0095.UNPROVIDED) {
            var26 = (SubLObject)module0095.$ic27$;
        }
        if (var27 == module0095.UNPROVIDED) {
            var27 = (SubLObject)module0095.$ic28$;
        }
        if (var28 == module0095.UNPROVIDED) {
            var28 = (SubLObject)module0095.NIL;
        }
        final SubLThread var29 = SubLProcess.currentSubLThread();
        SubLObject var30 = (SubLObject)module0095.NIL;
        SubLObject var31 = (SubLObject)module0095.NIL;
        SubLObject var32 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(var29);
        SubLObject var33 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(var29);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind(var26, var29);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(var29), var29);
            var30 = compatibility.open_binary(var23, var25);
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(var33, var29);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(var32, var29);
        }
        if (module0095.NIL == Errors.$ignore_mustsP$.getDynamicValue(var29) && module0095.NIL == streams_high.open_stream_p(var30)) {
            Errors.error(Errors.error((SubLObject)module0095.$ic29$, var23));
        }
        var32 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(var29);
        var33 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(var29);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind(var27, var29);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(var29), var29);
            var31 = compatibility.open_binary(var24, var25);
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(var33, var29);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(var32, var29);
        }
        if (module0095.NIL == Errors.$ignore_mustsP$.getDynamicValue(var29) && module0095.NIL == streams_high.open_stream_p(var31)) {
            Errors.error(Errors.error((SubLObject)module0095.$ic30$, var24));
        }
        final SubLObject var34 = f6846(var30, var31);
        if (module0095.NIL != var28) {
            f6847(var34);
        }
        return var34;
    }
    
    public static SubLObject f6846(final SubLObject var20, final SubLObject var21) {
        return f6843(var20, var21);
    }
    
    public static SubLObject f6848(final SubLObject var22) {
        return Errors.error((SubLObject)module0095.$ic31$, var22);
    }
    
    public static SubLObject f6849(final SubLObject var22) {
        assert module0095.NIL != f6844(var22) : var22;
        final SubLObject var23 = f6836(var22);
        if (module0095.NIL != streams_high.open_stream_p(var23)) {
            streams_high.close(var23, (SubLObject)module0095.UNPROVIDED);
        }
        f6838(var22, (SubLObject)module0095.NIL);
        final SubLObject var24 = f6837(var22);
        if (module0095.NIL != streams_high.open_stream_p(var24)) {
            streams_high.close(var24, (SubLObject)module0095.UNPROVIDED);
        }
        f6839(var22, (SubLObject)module0095.NIL);
        return var22;
    }
    
    public static SubLObject f6850(final SubLObject var32, final SubLObject var26, final SubLObject var27) {
        f6838(var32, module0075.f5279(f6836(var32), var26));
        f6839(var32, module0075.f5279(f6837(var32), var27));
        return var32;
    }
    
    public static SubLObject f6847(final SubLObject var32) {
        f6838(var32, module0075.f5283(f6836(var32)));
        f6839(var32, module0075.f5283(f6837(var32)));
        return var32;
    }
    
    public static SubLObject f6851(final SubLObject var32) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0095.NIL != module0075.f5282(f6836(var32)) && module0095.NIL != module0075.f5282(f6837(var32)));
    }
    
    public static SubLObject f6852(final SubLObject var22) {
        assert module0095.NIL != f6844(var22) : var22;
        return f6836(var22);
    }
    
    public static SubLObject f6853(final SubLObject var22) {
        assert module0095.NIL != f6844(var22) : var22;
        return f6837(var22);
    }
    
    public static SubLObject f6854(final SubLObject var22) {
        assert module0095.NIL != f6844(var22) : var22;
        return f6855(streams_high.file_length(f6837(var22)));
    }
    
    public static SubLObject f6856(final SubLObject var24) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        if (module0095.NIL == Filesys.probe_file(var24)) {
            Errors.error((SubLObject)module0095.$ic30$, var24);
        }
        SubLObject var26 = (SubLObject)module0095.NIL;
        SubLObject var27 = (SubLObject)module0095.NIL;
        try {
            final SubLObject var28 = stream_macros.$stream_requires_locking$.currentBinding(var25);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0095.NIL, var25);
                var27 = compatibility.open_binary(var24, (SubLObject)module0095.$ic26$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var28, var25);
            }
            if (!var27.isStream()) {
                Errors.error((SubLObject)module0095.$ic33$, var24);
            }
            final SubLObject var29 = var27;
            final SubLObject var30 = streams_high.file_length(var29);
            var26 = f6855(var30);
        }
        finally {
            final SubLObject var31 = Threads.$is_thread_performing_cleanupP$.currentBinding(var25);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0095.T, var25);
                if (var27.isStream()) {
                    streams_high.close(var27, (SubLObject)module0095.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var31, var25);
            }
        }
        return var26;
    }
    
    public static SubLObject f6857(final SubLObject var22) {
        return f6855(streams_high.file_position(f6837(var22), (SubLObject)module0095.UNPROVIDED));
    }
    
    public static SubLObject f6855(final SubLObject var35) {
        return Numbers.integerDivide(var35, (SubLObject)module0095.FOUR_INTEGER);
    }
    
    public static SubLObject f6858(final SubLObject var22, SubLObject var36) {
        if (var36 == module0095.UNPROVIDED) {
            var36 = (SubLObject)module0095.NIL;
        }
        assert module0095.NIL != f6844(var22) : var22;
        final SubLObject var37 = f6836(var22);
        final SubLObject var38 = f6859(var22, var36);
        compatibility.set_file_position(var37, var38);
        return var37;
    }
    
    public static SubLObject f6859(final SubLObject var22, SubLObject var36) {
        if (var36 == module0095.UNPROVIDED) {
            var36 = (SubLObject)module0095.NIL;
        }
        if (module0095.NIL != var36 && !module0095.areAssertionsDisabledFor(me) && module0095.NIL == module0004.f106(var36)) {
            throw new AssertionError(var36);
        }
        final SubLObject var37 = f6837(var22);
        SubLObject var38 = (SubLObject)module0095.NIL;
        SubLObject var39 = (SubLObject)module0095.NIL;
        if (module0095.NIL != var36) {
            var39 = Numbers.multiply(var36, (SubLObject)module0095.FOUR_INTEGER);
            compatibility.set_file_position(var37, var39);
        }
        var38 = module0093.f6644(var37);
        return var38;
    }
    
    public static SubLObject f6860(final SubLObject var39, final SubLObject var40) {
        SubLObject var42;
        final SubLObject var41 = var42 = var39.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var42, var41, (SubLObject)module0095.$ic35$);
        final SubLObject var43 = var42.rest();
        var42 = var42.first();
        SubLObject var44 = (SubLObject)module0095.NIL;
        SubLObject var45 = (SubLObject)module0095.NIL;
        SubLObject var46 = (SubLObject)module0095.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var42, var41, (SubLObject)module0095.$ic35$);
        var44 = var42.first();
        var42 = var42.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var42, var41, (SubLObject)module0095.$ic35$);
        var45 = var42.first();
        var42 = var42.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var42, var41, (SubLObject)module0095.$ic35$);
        var46 = var42.first();
        var42 = var42.rest();
        if (module0095.NIL == var42) {
            final SubLObject var47;
            var42 = (var47 = var43);
            return (SubLObject)ConsesLow.list((SubLObject)module0095.$ic36$, (SubLObject)ConsesLow.list(var44), (SubLObject)ConsesLow.list((SubLObject)module0095.$ic37$, (SubLObject)ConsesLow.list((SubLObject)module0095.$ic38$, (SubLObject)ConsesLow.list((SubLObject)module0095.$ic39$, var44, (SubLObject)ConsesLow.listS((SubLObject)module0095.$ic40$, var45, var46, (SubLObject)module0095.$ic41$)), reader.bq_cons((SubLObject)module0095.$ic38$, ConsesLow.append(var47, (SubLObject)module0095.NIL))), (SubLObject)ConsesLow.list((SubLObject)module0095.$ic42$, (SubLObject)ConsesLow.list((SubLObject)module0095.$ic32$, var44), (SubLObject)ConsesLow.list((SubLObject)module0095.$ic43$, var44))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var41, (SubLObject)module0095.$ic35$);
        return (SubLObject)module0095.NIL;
    }
    
    public static SubLObject f6861(final SubLObject var22) {
        final SubLObject var23 = f6837(var22);
        final SubLObject var24 = f6836(var22);
        streams_high.force_output(var24);
        final SubLObject var25 = streams_high.file_position(var24, (SubLObject)module0095.UNPROVIDED);
        module0093.f6697(var23, var25);
        return var22;
    }
    
    public static SubLObject f6862(final SubLObject var22) {
        final SubLObject var23 = f6837(var22);
        final SubLObject var24 = f6836(var22);
        final SubLObject var25 = streams_high.file_position(var24, (SubLObject)module0095.UNPROVIDED);
        module0093.f6697(var23, var25);
        return var22;
    }
    
    public static SubLObject f6863(final SubLObject var39, final SubLObject var40) {
        SubLObject var42;
        final SubLObject var41 = var42 = var39.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var42, var41, (SubLObject)module0095.$ic35$);
        final SubLObject var43 = var42.rest();
        var42 = var42.first();
        SubLObject var44 = (SubLObject)module0095.NIL;
        SubLObject var45 = (SubLObject)module0095.NIL;
        SubLObject var46 = (SubLObject)module0095.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var42, var41, (SubLObject)module0095.$ic35$);
        var44 = var42.first();
        var42 = var42.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var42, var41, (SubLObject)module0095.$ic35$);
        var45 = var42.first();
        var42 = var42.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var42, var41, (SubLObject)module0095.$ic35$);
        var46 = var42.first();
        var42 = var42.rest();
        if (module0095.NIL == var42) {
            final SubLObject var47;
            var42 = (var47 = var43);
            return (SubLObject)ConsesLow.list((SubLObject)module0095.$ic36$, (SubLObject)ConsesLow.list(var44), (SubLObject)ConsesLow.list((SubLObject)module0095.$ic37$, (SubLObject)ConsesLow.list((SubLObject)module0095.$ic38$, (SubLObject)ConsesLow.list((SubLObject)module0095.$ic39$, var44, (SubLObject)ConsesLow.listS((SubLObject)module0095.$ic40$, var45, var46, (SubLObject)module0095.$ic44$)), reader.bq_cons((SubLObject)module0095.$ic38$, ConsesLow.append(var47, (SubLObject)module0095.NIL))), (SubLObject)ConsesLow.list((SubLObject)module0095.$ic42$, (SubLObject)ConsesLow.list((SubLObject)module0095.$ic32$, var44), (SubLObject)ConsesLow.list((SubLObject)module0095.$ic43$, var44))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var41, (SubLObject)module0095.$ic35$);
        return (SubLObject)module0095.NIL;
    }
    
    public static SubLObject f6864(final SubLObject var22) {
        return module0052.f3689(f6865(var22), (SubLObject)module0095.$ic45$, (SubLObject)module0095.$ic46$, (SubLObject)module0095.UNPROVIDED);
    }
    
    public static SubLObject f6865(final SubLObject var22) {
        final SubLObject var23 = f6854(var22);
        final SubLObject var24 = (SubLObject)module0095.ZERO_INTEGER;
        final SubLObject var25 = (SubLObject)ConsesLow.cons((SubLObject)module0095.MINUS_ONE_INTEGER, (SubLObject)module0095.MINUS_ONE_INTEGER);
        return (SubLObject)ConsesLow.list(var22, var24, var23, var25);
    }
    
    public static SubLObject f6866(final SubLObject var54) {
        SubLObject var55 = (SubLObject)module0095.NIL;
        SubLObject var52_57 = (SubLObject)module0095.NIL;
        SubLObject var56 = (SubLObject)module0095.NIL;
        SubLObject var57 = (SubLObject)module0095.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var54, var54, (SubLObject)module0095.$ic47$);
        var55 = var54.first();
        SubLObject var58 = var54.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var58, var54, (SubLObject)module0095.$ic47$);
        var52_57 = var58.first();
        var58 = var58.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var58, var54, (SubLObject)module0095.$ic47$);
        var56 = var58.first();
        var58 = var58.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var58, var54, (SubLObject)module0095.$ic47$);
        var57 = var58.first();
        var58 = var58.rest();
        if (module0095.NIL == var58) {
            return Numbers.numLE(var56, var52_57);
        }
        cdestructuring_bind.cdestructuring_bind_error(var54, (SubLObject)module0095.$ic47$);
        return (SubLObject)module0095.NIL;
    }
    
    public static SubLObject f6867(final SubLObject var54) {
        SubLObject var55 = (SubLObject)module0095.NIL;
        SubLObject var52_60 = (SubLObject)module0095.NIL;
        SubLObject var56 = (SubLObject)module0095.NIL;
        SubLObject var57 = (SubLObject)module0095.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var54, var54, (SubLObject)module0095.$ic47$);
        var55 = var54.first();
        SubLObject var58 = var54.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var58, var54, (SubLObject)module0095.$ic47$);
        var52_60 = var58.first();
        var58 = var58.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var58, var54, (SubLObject)module0095.$ic47$);
        var56 = var58.first();
        var58 = var58.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var58, var54, (SubLObject)module0095.$ic47$);
        var57 = var58.first();
        var58 = var58.rest();
        if (module0095.NIL == var58) {
            final SubLObject var59 = f6859(var55, var52_60);
            ConsesLow.rplaca(var57, var52_60);
            ConsesLow.rplacd(var57, var59);
            ConsesLow.set_nth((SubLObject)module0095.ONE_INTEGER, var54, Numbers.add(var52_60, (SubLObject)module0095.ONE_INTEGER));
            return Values.values(var57, var54);
        }
        cdestructuring_bind.cdestructuring_bind_error(var54, (SubLObject)module0095.$ic47$);
        return (SubLObject)module0095.NIL;
    }
    
    public static SubLObject f6868(final SubLObject var22, final SubLObject var37) {
        final SubLThread var38 = SubLProcess.currentSubLThread();
        assert module0095.NIL != f6844(var22) : var22;
        assert module0095.NIL != module0004.f106(var37) : var37;
        final SubLObject var39 = streams_high.file_length(f6852(var22));
        if (module0095.NIL == Errors.$ignore_mustsP$.getDynamicValue(var38) && !var37.numLE(var39)) {
            Errors.error((SubLObject)module0095.$ic48$, var37, var39, var22);
        }
        final SubLObject var40 = Numbers.multiply((SubLObject)module0095.TWO_INTEGER, Numbers.log(var37, (SubLObject)module0095.TWO_INTEGER));
        SubLObject var41 = (SubLObject)module0095.ZERO_INTEGER;
        SubLObject var42 = (SubLObject)module0095.ZERO_INTEGER;
        SubLObject var43 = f6854(var22);
        while (var42.numL(var43)) {
            if (module0095.NIL == Errors.$ignore_mustsP$.getDynamicValue(var38) && !var41.numL(var40)) {
                Errors.error((SubLObject)module0095.$ic49$, var41, var37, var39);
            }
            final SubLObject var44 = Numbers.integerDivide(Numbers.add(var43, var42), (SubLObject)module0095.TWO_INTEGER);
            final SubLObject var45 = f6859(var22, var44);
            if (var37.numE(var45)) {
                return Values.values(var44, var45, var44, var45);
            }
            if (var37.numL(var45)) {
                var43 = var44;
            }
            else if (var37.numG(var45)) {
                var42 = Numbers.add(var44, (SubLObject)module0095.ONE_INTEGER);
            }
            else {
                Errors.error((SubLObject)module0095.$ic50$, var37, var45);
            }
            var41 = Numbers.add(var41, (SubLObject)module0095.ONE_INTEGER);
        }
        if (var42.numG(var43)) {
            final SubLObject var46 = var42;
            var42 = var43;
            var43 = var46;
        }
        return Values.values(var42, f6859(var22, var42), var43, f6859(var22, var43));
    }
    
    public static SubLObject f6869(final SubLObject var68) {
        final SubLThread var69 = SubLProcess.currentSubLThread();
        SubLObject var70 = (SubLObject)module0095.NIL;
        final SubLObject var71 = module0075.f5182((SubLObject)module0095.$ic59$);
        try {
            final SubLObject var72 = module0075.f5182((SubLObject)module0095.$ic59$);
            try {
                SubLObject var73 = (SubLObject)module0095.NIL;
                try {
                    var73 = f6845(var71, var72, (SubLObject)module0095.$ic60$, (SubLObject)module0095.$ic61$, (SubLObject)module0095.$ic61$, (SubLObject)module0095.UNPROVIDED);
                    final SubLObject var74 = f6852(var73);
                    SubLObject var75;
                    SubLObject var76;
                    for (var75 = (SubLObject)module0095.NIL, var75 = (SubLObject)module0095.ZERO_INTEGER; var75.numL(var68); var75 = Numbers.add(var75, (SubLObject)module0095.ONE_INTEGER)) {
                        var76 = f6857(var73);
                        if (module0095.NIL == Errors.$ignore_mustsP$.getDynamicValue(var69) && !var75.numE(var76)) {
                            Errors.error(Errors.error((SubLObject)module0095.$ic62$, var75, var76));
                        }
                        f6862(var73);
                        module0021.f1038(Sequences.cconcatenate((SubLObject)module0095.$ic63$, module0006.f203(var75)), var74);
                    }
                }
                finally {
                    final SubLObject var77 = Threads.$is_thread_performing_cleanupP$.currentBinding(var69);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0095.T, var69);
                        if (module0095.NIL != f6844(var73)) {
                            f6849(var73);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var77, var69);
                    }
                }
                var70 = Sequences.nreverse(var70);
                var73 = (SubLObject)module0095.NIL;
                try {
                    var73 = f6845(var71, var72, (SubLObject)module0095.$ic26$, (SubLObject)module0095.UNPROVIDED, (SubLObject)module0095.UNPROVIDED, (SubLObject)module0095.UNPROVIDED);
                    final SubLObject var78 = f6864(var73);
                    SubLObject var79 = (SubLObject)module0095.NIL;
                    SubLObject var80 = (SubLObject)module0095.NIL;
                    SubLObject var81 = (SubLObject)module0095.NIL;
                    var79 = var70;
                    var80 = var79.first();
                    for (var81 = (SubLObject)module0095.ZERO_INTEGER; module0095.NIL != var79; var79 = var79.rest(), var80 = var79.first(), var81 = Numbers.add((SubLObject)module0095.ONE_INTEGER, var81)) {
                        var69.resetMultipleValues();
                        final SubLObject var82 = module0052.f3693(var78);
                        final SubLObject var83 = var69.secondMultipleValue();
                        var69.resetMultipleValues();
                        if (module0095.NIL == var83) {
                            Errors.error((SubLObject)module0095.$ic64$, var81);
                        }
                        SubLObject var85;
                        final SubLObject var84 = var85 = var82;
                        SubLObject var86 = (SubLObject)module0095.NIL;
                        SubLObject var87 = (SubLObject)module0095.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)module0095.$ic65$);
                        var86 = var85.first();
                        var85 = (var87 = var85.rest());
                        if (module0095.NIL == Errors.$ignore_mustsP$.getDynamicValue(var69) && !var86.numE(var81)) {
                            Errors.error((SubLObject)module0095.$ic66$, var81, var86);
                        }
                        if (module0095.NIL == Errors.$ignore_mustsP$.getDynamicValue(var69) && !var80.numE(var87)) {
                            Errors.error((SubLObject)module0095.$ic67$, var80, var87);
                        }
                    }
                }
                finally {
                    final SubLObject var88 = Threads.$is_thread_performing_cleanupP$.currentBinding(var69);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0095.T, var69);
                        if (module0095.NIL != f6844(var73)) {
                            f6849(var73);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var88, var69);
                    }
                }
            }
            finally {
                final SubLObject var89 = Threads.$is_thread_performing_cleanupP$.currentBinding(var69);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0095.T, var69);
                    SubLObject var90 = (SubLObject)module0095.NIL;
                    try {
                        var69.throwStack.push(module0095.$ic68$);
                        final SubLObject var29_82 = Errors.$error_handler$.currentBinding(var69);
                        try {
                            Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0095.$ic69$), var69);
                            try {
                                Filesys.delete_file(var72);
                            }
                            catch (Throwable var91) {
                                Errors.handleThrowable(var91, (SubLObject)module0095.NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(var29_82, var69);
                        }
                    }
                    catch (Throwable var92) {
                        var90 = Errors.handleThrowable(var92, (SubLObject)module0095.$ic68$);
                        var69.throwStack.pop();
                    }
                    finally {
                        var69.throwStack.pop();
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var89, var69);
                }
            }
        }
        finally {
            final SubLObject var93 = Threads.$is_thread_performing_cleanupP$.currentBinding(var69);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0095.T, var69);
                SubLObject var94 = (SubLObject)module0095.NIL;
                try {
                    var69.throwStack.push(module0095.$ic68$);
                    final SubLObject var29_83 = Errors.$error_handler$.currentBinding(var69);
                    try {
                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0095.$ic69$), var69);
                        try {
                            Filesys.delete_file(var71);
                        }
                        catch (Throwable var95) {
                            Errors.handleThrowable(var95, (SubLObject)module0095.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(var29_83, var69);
                    }
                }
                catch (Throwable var96) {
                    var94 = Errors.handleThrowable(var96, (SubLObject)module0095.$ic68$);
                    var69.throwStack.pop();
                }
                finally {
                    var69.throwStack.pop();
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var93, var69);
            }
        }
        return var68;
    }
    
    public static SubLObject f6870() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0095", "f6833", "S#8626", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0095", "f6835", "S#8625", 1, 0, false);
        new $f6835$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0095", "f6836", "S#8627", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0095", "f6837", "S#8628", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0095", "f6838", "S#8629", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0095", "f6839", "S#8630", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0095", "f6840", "S#8631", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0095", "f6841", "S#8632", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0095", "f6842", "S#8633", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0095", "f6834", "S#8634", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0095", "f6843", "S#8635", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0095", "f6844", "S#8636", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0095", "f6845", "S#8637", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0095", "f6846", "S#8638", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0095", "f6848", "S#8639", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0095", "f6849", "S#8640", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0095", "f6850", "S#8641", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0095", "f6847", "S#8642", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0095", "f6851", "S#8643", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0095", "f6852", "S#8644", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0095", "f6853", "S#8645", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0095", "f6854", "S#8646", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0095", "f6856", "S#8647", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0095", "f6857", "S#8648", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0095", "f6855", "S#8649", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0095", "f6858", "S#8650", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0095", "f6859", "S#8651", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0095", "f6860", "S#8652");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0095", "f6861", "S#8653", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0095", "f6862", "S#8654", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0095", "f6863", "S#8655");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0095", "f6864", "S#8656", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0095", "f6865", "S#8657", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0095", "f6866", "S#8658", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0095", "f6867", "S#8659", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0095", "f6868", "S#8660", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0095", "f6869", "S#8661", 1, 0, false);
        return (SubLObject)module0095.NIL;
    }
    
    public static SubLObject f6871() {
        module0095.$g1258$ = SubLFiles.defconstant("S#8662", (SubLObject)module0095.$ic0$);
        return (SubLObject)module0095.NIL;
    }
    
    public static SubLObject f6872() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0095.$g1258$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0095.$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0095.$ic8$);
        Structures.def_csetf((SubLObject)module0095.$ic9$, (SubLObject)module0095.$ic10$);
        Structures.def_csetf((SubLObject)module0095.$ic11$, (SubLObject)module0095.$ic12$);
        Equality.identity((SubLObject)module0095.$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0095.$g1258$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0095.$ic20$));
        module0027.f1449((SubLObject)module0095.$ic51$, (SubLObject)ConsesLow.list(new SubLObject[] { module0095.$ic52$, module0095.EQL, module0095.$ic53$, module0095.NIL, module0095.$ic54$, module0095.NIL, module0095.$ic55$, module0095.$ic56$, module0095.$ic57$, module0095.T }), (SubLObject)module0095.$ic58$);
        return (SubLObject)module0095.NIL;
    }
    
    public void declareFunctions() {
        f6870();
    }
    
    public void initializeVariables() {
        f6871();
    }
    
    public void runTopLevelForms() {
        f6872();
    }
    
    static {
        me = (SubLFile)new module0095();
        module0095.$g1258$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#8624", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#8625", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#8663", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#8664", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DATA-STREAM"), (SubLObject)SubLObjectFactory.makeKeyword("INDEX-STREAM"));
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#8627", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#8628", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#8629", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#8630", "CYC"));
        $ic6$ = SubLObjectFactory.makeSymbol("S#8634", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#8626", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#8625", "CYC"));
        $ic9$ = SubLObjectFactory.makeSymbol("S#8627", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#8629", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#8628", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#8630", "CYC");
        $ic13$ = SubLObjectFactory.makeKeyword("DATA-STREAM");
        $ic14$ = SubLObjectFactory.makeKeyword("INDEX-STREAM");
        $ic15$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic16$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic17$ = SubLObjectFactory.makeSymbol("S#8631", "CYC");
        $ic18$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic19$ = SubLObjectFactory.makeKeyword("END");
        $ic20$ = SubLObjectFactory.makeSymbol("S#8633", "CYC");
        $ic21$ = SubLObjectFactory.makeString("#<");
        $ic22$ = SubLObjectFactory.makeKeyword("STREAM");
        $ic23$ = SubLObjectFactory.makeString("Data: ");
        $ic24$ = SubLObjectFactory.makeString("Index: ");
        $ic25$ = SubLObjectFactory.makeKeyword("BASE");
        $ic26$ = SubLObjectFactory.makeKeyword("INPUT");
        $ic27$ = SubLObjectFactory.makeInteger(1024);
        $ic28$ = SubLObjectFactory.makeInteger(256);
        $ic29$ = SubLObjectFactory.makeString("Invalid data filename ~A.");
        $ic30$ = SubLObjectFactory.makeString("Invalid index filename ~A.");
        $ic31$ = SubLObjectFactory.makeString("Cannot clone ~A: This method is currently not implemented.");
        $ic32$ = SubLObjectFactory.makeSymbol("S#8636", "CYC");
        $ic33$ = SubLObjectFactory.makeString("Unable to open ~S");
        $ic34$ = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic35$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#8624", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#8665", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#8666", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic36$ = SubLObjectFactory.makeSymbol("CLET");
        $ic37$ = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $ic38$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic39$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic40$ = SubLObjectFactory.makeSymbol("S#8637", "CYC");
        $ic41$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OUTPUT"), (SubLObject)SubLObjectFactory.makeInteger(4000000), (SubLObject)SubLObjectFactory.makeInteger(4000000));
        $ic42$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic43$ = SubLObjectFactory.makeSymbol("S#8640", "CYC");
        $ic44$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT"));
        $ic45$ = SubLObjectFactory.makeSymbol("S#8658", "CYC");
        $ic46$ = SubLObjectFactory.makeSymbol("S#8659", "CYC");
        $ic47$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#8624", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5232", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1534", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#8667", "CYC"));
        $ic48$ = SubLObjectFactory.makeString("Data Address ~A is past the end of the data stream (~A) of ~A.");
        $ic49$ = SubLObjectFactory.makeString("After ~A iterations, we did not quiesce when searching for ~A in [0,~A)");
        $ic50$ = SubLObjectFactory.makeString("Whoa, ~A is neither <, > or = to ~A???");
        $ic51$ = SubLObjectFactory.makeSymbol("S#8661", "CYC");
        $ic52$ = SubLObjectFactory.makeKeyword("TEST");
        $ic53$ = SubLObjectFactory.makeKeyword("OWNER");
        $ic54$ = SubLObjectFactory.makeKeyword("CLASSES");
        $ic55$ = SubLObjectFactory.makeKeyword("KB");
        $ic56$ = SubLObjectFactory.makeKeyword("TINY");
        $ic57$ = SubLObjectFactory.makeKeyword("WORKING?");
        $ic58$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0095.TEN_INTEGER), (SubLObject)module0095.TEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(23)), (SubLObject)SubLObjectFactory.makeInteger(23)));
        $ic59$ = SubLObjectFactory.makeString("/tmp/");
        $ic60$ = SubLObjectFactory.makeKeyword("OUTPUT");
        $ic61$ = SubLObjectFactory.makeInteger(4000000);
        $ic62$ = SubLObjectFactory.makeString("The next index is supposed to be ~A, but it is ~A.");
        $ic63$ = SubLObjectFactory.makeString("Position ");
        $ic64$ = SubLObjectFactory.makeString("On step #~A, the iteration result was no longer valid.");
        $ic65$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#8668", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#8669", "CYC"));
        $ic66$ = SubLObjectFactory.makeString("The expected index ~A was =/= actual index ~A.");
        $ic67$ = SubLObjectFactory.makeString("The expected address ~A was =/= actual address ~A.");
        $ic68$ = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $ic69$ = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
    }
    
    public static final class $sX8624_native extends SubLStructNative
    {
        public SubLObject $data_stream;
        public SubLObject $index_stream;
        private static final SubLStructDeclNative structDecl;
        
        public $sX8624_native() {
            this.$data_stream = (SubLObject)CommonSymbols.NIL;
            this.$index_stream = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX8624_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$data_stream;
        }
        
        public SubLObject getField3() {
            return this.$index_stream;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$data_stream = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$index_stream = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX8624_native.class, module0095.$ic0$, module0095.$ic1$, module0095.$ic2$, module0095.$ic3$, new String[] { "$data_stream", "$index_stream" }, module0095.$ic4$, module0095.$ic5$, module0095.$ic6$);
        }
    }
    
    public static final class $f6835$UnaryFunction extends UnaryFunction
    {
        public $f6835$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#8625"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0095.f6835(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0095.class
	Total time: 331 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/