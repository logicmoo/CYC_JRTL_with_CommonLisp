package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0795 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0795";
    public static final String myFingerPrint = "23d9d65387a8bc7b35f48e55cebb3daa4fb4f20b115ed6abd19165de34310e7f";
    private static SubLSymbol $g6360$;
    private static SubLSymbol $g6361$;
    private static SubLSymbol $g6362$;
    private static SubLSymbol $g6363$;
    private static SubLSymbol $g6364$;
    private static SubLSymbol $g6365$;
    private static SubLSymbol $g6366$;
    public static SubLSymbol $g6367$;
    private static SubLSymbol $g6368$;
    private static final SubLList $ic0$;
    private static final SubLList $ic1$;
    private static final SubLObject $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLString $ic7$;
    private static final SubLString $ic8$;
    private static final SubLString $ic9$;
    private static final SubLString $ic10$;
    private static final SubLList $ic11$;
    private static final SubLString $ic12$;
    private static final SubLString $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLString $ic16$;
    private static final SubLString $ic17$;
    private static final SubLString $ic18$;
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    private static final SubLString $ic21$;
    private static final SubLString $ic22$;
    private static final SubLString $ic23$;
    private static final SubLString $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLString $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLString $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLList $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLString $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLList $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLInteger $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLString $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLList $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLString $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLList $ic58$;
    private static final SubLList $ic59$;
    private static final SubLList $ic60$;
    private static final SubLList $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLList $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLString $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLString $ic89$;
    private static final SubLString $ic90$;
    private static final SubLString $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLList $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLList $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLList $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLString $ic103$;
    private static final SubLList $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLString $ic107$;
    private static final SubLFloat $ic108$;
    private static final SubLString $ic109$;
    private static final SubLString $ic110$;
    private static final SubLString $ic111$;
    private static final SubLString $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLInteger $ic114$;
    private static final SubLFloat $ic115$;
    private static final SubLInteger $ic116$;
    private static final SubLString $ic117$;
    private static final SubLList $ic118$;
    private static final SubLString $ic119$;
    private static final SubLString $ic120$;
    private static final SubLString $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLObject $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLString $ic129$;
    private static final SubLString $ic130$;
    private static final SubLList $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLSymbol $ic134$;
    
    
    public static SubLObject f50839(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0795.NIL != f50840(var1) || module0795.NIL != f50841(var1));
    }
    
    public static SubLObject f50840(final SubLObject var1) {
        return Equality.equal(var1, (SubLObject)module0795.$ic0$);
    }
    
    public static SubLObject f50841(final SubLObject var1) {
        return module0062.f4492(var1, (SubLObject)module0795.$ic1$);
    }
    
    public static SubLObject f50842(final SubLObject var2, final SubLObject var3, SubLObject var4) {
        if (var4 == module0795.UNPROVIDED) {
            var4 = module0795.$ic2$;
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        assert module0795.NIL != module0004.f105(var2) : var2;
        assert module0795.NIL != Types.stringp(var3) : var3;
        SubLObject var6 = (SubLObject)module0795.NIL;
        try {
            SubLObject var7 = stream_macros.$stream_requires_locking$.currentBinding(var5);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0795.NIL, var5);
                var6 = compatibility.open_text(var3, (SubLObject)module0795.$ic5$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var7, var5);
            }
            if (!var6.isStream()) {
                Errors.error((SubLObject)module0795.$ic6$, var3);
            }
            var7 = module0587.$g4457$.currentBinding(var5);
            try {
                module0587.$g4457$.bind(var6, var5);
                module0601.f36751((SubLObject)module0795.UNPROVIDED, (SubLObject)module0795.UNPROVIDED, (SubLObject)module0795.UNPROVIDED);
                final SubLObject var9;
                final SubLObject var8 = var9 = module0034.f1854((SubLObject)module0795.UNPROVIDED, (SubLObject)module0795.UNPROVIDED, (SubLObject)module0795.UNPROVIDED, (SubLObject)module0795.UNPROVIDED);
                final SubLObject var7_10 = module0034.$g879$.currentBinding(var5);
                try {
                    module0034.$g879$.bind(var9, var5);
                    SubLObject var10 = (SubLObject)module0795.NIL;
                    if (module0795.NIL != var9 && module0795.NIL == module0034.f1842(var9)) {
                        var10 = module0034.f1869(var9);
                        final SubLObject var11 = Threads.current_process();
                        if (module0795.NIL == var10) {
                            module0034.f1873(var9, var11);
                        }
                        else if (!var10.eql(var11)) {
                            Errors.error((SubLObject)module0795.$ic7$);
                        }
                    }
                    try {
                        final SubLObject var7_11 = module0012.$g75$.currentBinding(var5);
                        final SubLObject var12 = module0012.$g76$.currentBinding(var5);
                        final SubLObject var13 = module0012.$g77$.currentBinding(var5);
                        final SubLObject var14 = module0012.$g78$.currentBinding(var5);
                        try {
                            module0012.$g75$.bind((SubLObject)module0795.ZERO_INTEGER, var5);
                            module0012.$g76$.bind((SubLObject)module0795.NIL, var5);
                            module0012.$g77$.bind((SubLObject)module0795.T, var5);
                            module0012.$g78$.bind(Time.get_universal_time(), var5);
                            module0012.f478(Sequences.cconcatenate((SubLObject)module0795.$ic8$, new SubLObject[] { module0006.f207(var2), module0795.$ic9$ }));
                            try {
                                final SubLObject var7_12 = module0601.$g4652$.currentBinding(var5);
                                final SubLObject var14_18 = module0601.$g4654$.currentBinding(var5);
                                try {
                                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var5), module0601.$g4652$.getDynamicValue(var5)), var5);
                                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var5), var5);
                                    module0601.f36758((SubLObject)module0795.$ic10$, (SubLObject)module0795.NIL, (SubLObject)module0795.NIL, (SubLObject)module0795.NIL);
                                    module0601.f36746();
                                    SubLObject var15;
                                    for (var15 = (SubLObject)module0795.NIL, var15 = (SubLObject)module0795.ZERO_INTEGER; var15.numL(var2); var15 = Numbers.add(var15, (SubLObject)module0795.ONE_INTEGER)) {
                                        f50843(f50844(var4, (SubLObject)module0795.$ic11$));
                                        module0601.f36746();
                                        streams_high.force_output(module0587.$g4457$.getDynamicValue(var5));
                                        module0012.note_percent_progress(var15, var2);
                                    }
                                }
                                finally {
                                    module0601.$g4654$.rebind(var14_18, var5);
                                    module0601.$g4652$.rebind(var7_12, var5);
                                }
                            }
                            finally {
                                final SubLObject var7_13 = Threads.$is_thread_performing_cleanupP$.currentBinding(var5);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0795.T, var5);
                                    module0601.f36746();
                                    module0601.f36760((SubLObject)module0795.$ic10$);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var7_13, var5);
                                }
                            }
                            module0012.f479();
                        }
                        finally {
                            module0012.$g78$.rebind(var14, var5);
                            module0012.$g77$.rebind(var13, var5);
                            module0012.$g76$.rebind(var12, var5);
                            module0012.$g75$.rebind(var7_11, var5);
                        }
                    }
                    finally {
                        final SubLObject var7_14 = Threads.$is_thread_performing_cleanupP$.currentBinding(var5);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0795.T, var5);
                            if (module0795.NIL != var9 && module0795.NIL == var10) {
                                module0034.f1873(var9, (SubLObject)module0795.NIL);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var7_14, var5);
                        }
                    }
                }
                finally {
                    module0034.$g879$.rebind(var7_10, var5);
                }
            }
            finally {
                module0587.$g4457$.rebind(var7, var5);
            }
        }
        finally {
            final SubLObject var16 = Threads.$is_thread_performing_cleanupP$.currentBinding(var5);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0795.T, var5);
                if (var6.isStream()) {
                    streams_high.close(var6, (SubLObject)module0795.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var16, var5);
            }
        }
        return var2;
    }
    
    public static SubLObject f50845(final SubLObject var22, final SubLObject var3, SubLObject var23) {
        if (var23 == module0795.UNPROVIDED) {
            var23 = (SubLObject)module0795.NIL;
        }
        final SubLThread var24 = SubLProcess.currentSubLThread();
        if (module0795.NIL != var22 && !module0795.areAssertionsDisabledFor(me) && module0795.NIL == module0004.f105(var22)) {
            throw new AssertionError(var22);
        }
        assert module0795.NIL != Types.stringp(var3) : var3;
        SubLObject var25 = (SubLObject)module0795.NIL;
        try {
            SubLObject var26 = stream_macros.$stream_requires_locking$.currentBinding(var24);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0795.NIL, var24);
                var25 = compatibility.open_text(var3, (SubLObject)module0795.$ic5$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var26, var24);
            }
            if (!var25.isStream()) {
                Errors.error((SubLObject)module0795.$ic6$, var3);
            }
            var26 = module0587.$g4457$.currentBinding(var24);
            try {
                module0587.$g4457$.bind(var25, var24);
                module0601.f36751((SubLObject)module0795.UNPROVIDED, (SubLObject)module0795.UNPROVIDED, (SubLObject)module0795.UNPROVIDED);
                SubLObject var27 = (SubLObject)module0795.ZERO_INTEGER;
                SubLObject var28 = (SubLObject)module0795.NIL;
                SubLObject var29 = Types.sublisp_null(var23);
                final SubLObject var31;
                final SubLObject var30 = var31 = module0034.f1854((SubLObject)module0795.UNPROVIDED, (SubLObject)module0795.UNPROVIDED, (SubLObject)module0795.UNPROVIDED, (SubLObject)module0795.UNPROVIDED);
                final SubLObject var7_28 = module0034.$g879$.currentBinding(var24);
                try {
                    module0034.$g879$.bind(var31, var24);
                    SubLObject var32 = (SubLObject)module0795.NIL;
                    Label_0325: {
                        if (module0795.NIL == var31 || module0795.NIL != module0034.f1842(var31)) {
                            break Label_0325;
                        }
                        var32 = module0034.f1869(var31);
                        final SubLObject var33 = Threads.current_process();
                        if (module0795.NIL == var32) {
                            module0034.f1873(var31, var33);
                            break Label_0325;
                        }
                        if (var32.eql(var33)) {
                            break Label_0325;
                        }
                        Errors.error((SubLObject)module0795.$ic7$);
                        try {
                            try {
                                final SubLObject var7_29 = module0601.$g4652$.currentBinding(var24);
                                final SubLObject var34 = module0601.$g4654$.currentBinding(var24);
                                try {
                                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var24), module0601.$g4652$.getDynamicValue(var24)), var24);
                                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var24), var24);
                                    module0601.f36758((SubLObject)module0795.$ic12$, (SubLObject)module0795.NIL, (SubLObject)module0795.NIL, (SubLObject)module0795.NIL);
                                    module0601.f36746();
                                    final SubLObject var35 = Sequences.cconcatenate((SubLObject)module0795.$ic13$, module0006.f205(var3));
                                    final SubLObject var36 = module0173.f10962();
                                    SubLObject var37 = (SubLObject)module0795.ZERO_INTEGER;
                                    final SubLObject var7_30 = module0012.$g75$.currentBinding(var24);
                                    final SubLObject var14_34 = module0012.$g76$.currentBinding(var24);
                                    final SubLObject var38 = module0012.$g77$.currentBinding(var24);
                                    final SubLObject var39 = module0012.$g78$.currentBinding(var24);
                                    try {
                                        module0012.$g75$.bind((SubLObject)module0795.ZERO_INTEGER, var24);
                                        module0012.$g76$.bind((SubLObject)module0795.NIL, var24);
                                        module0012.$g77$.bind((SubLObject)module0795.T, var24);
                                        module0012.$g78$.bind(Time.get_universal_time(), var24);
                                        module0012.f478(var35);
                                        SubLObject var40;
                                        SubLObject var42;
                                        SubLObject var41;
                                        SubLObject var38_39;
                                        SubLObject var43;
                                        SubLObject var44;
                                        SubLObject var45;
                                        SubLObject var47;
                                        SubLObject var46;
                                        SubLObject var48;
                                        SubLObject var49;
                                        SubLObject var50;
                                        SubLObject var51;
                                        SubLObject var52;
                                        SubLObject var53;
                                        SubLObject var54;
                                        SubLObject var52_53;
                                        SubLObject var55;
                                        SubLObject var56;
                                        SubLObject var57;
                                        SubLObject var58;
                                        SubLObject var59;
                                        SubLObject var60;
                                        for (var40 = (SubLObject)module0795.NIL, var40 = module0173.f10961(); module0795.NIL == var28 && module0795.NIL != var40; var40 = var40.rest()) {
                                            var41 = (var42 = var40.first());
                                            if (module0795.NIL == module0065.f4772(var42, (SubLObject)module0795.$ic14$)) {
                                                var38_39 = var42;
                                                if (module0795.NIL == module0065.f4775(var38_39, (SubLObject)module0795.$ic14$)) {
                                                    var43 = module0065.f4740(var38_39);
                                                    var44 = (SubLObject)module0795.NIL;
                                                    var45 = Sequences.length(var43);
                                                    var46 = (var47 = (SubLObject)((module0795.NIL != var44) ? ConsesLow.list(Numbers.subtract(var45, (SubLObject)module0795.ONE_INTEGER), (SubLObject)module0795.MINUS_ONE_INTEGER, (SubLObject)module0795.MINUS_ONE_INTEGER) : ConsesLow.list((SubLObject)module0795.ZERO_INTEGER, var45, (SubLObject)module0795.ONE_INTEGER)));
                                                    var48 = (SubLObject)module0795.NIL;
                                                    var49 = (SubLObject)module0795.NIL;
                                                    var50 = (SubLObject)module0795.NIL;
                                                    cdestructuring_bind.destructuring_bind_must_consp(var47, var46, (SubLObject)module0795.$ic15$);
                                                    var48 = var47.first();
                                                    var47 = var47.rest();
                                                    cdestructuring_bind.destructuring_bind_must_consp(var47, var46, (SubLObject)module0795.$ic15$);
                                                    var49 = var47.first();
                                                    var47 = var47.rest();
                                                    cdestructuring_bind.destructuring_bind_must_consp(var47, var46, (SubLObject)module0795.$ic15$);
                                                    var50 = var47.first();
                                                    var47 = var47.rest();
                                                    if (module0795.NIL == var47) {
                                                        if (module0795.NIL == var28) {
                                                            for (var51 = var49, var52 = (SubLObject)module0795.NIL, var52 = var48; module0795.NIL == var28 && module0795.NIL == module0005.f124(var52, var50, var51); var52 = Numbers.add(var52, var50)) {
                                                                var53 = Vectors.aref(var43, var52);
                                                                if (module0795.NIL == module0065.f4749(var53) || module0795.NIL == module0065.f4773((SubLObject)module0795.$ic14$)) {
                                                                    if (module0795.NIL != module0065.f4749(var53)) {
                                                                        var53 = (SubLObject)module0795.$ic14$;
                                                                    }
                                                                    var37 = Numbers.add(var37, (SubLObject)module0795.ONE_INTEGER);
                                                                    module0012.note_percent_progress(var37, var36);
                                                                    if (module0795.NIL != var29 && module0795.NIL != f50846(var53) && module0795.NIL == module0269.f17716(var53)) {
                                                                        var54 = f50847(var53);
                                                                        if (module0795.NIL != module0035.f2013(var54)) {
                                                                            f50848(var53, var54);
                                                                            module0601.f36746();
                                                                            var27 = Numbers.add(var27, (SubLObject)module0795.ONE_INTEGER);
                                                                            if (module0795.NIL != var22) {
                                                                                var28 = Numbers.numGE(var27, var22);
                                                                            }
                                                                        }
                                                                    }
                                                                    if (var53.eql(var23)) {
                                                                        var29 = (SubLObject)module0795.T;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    else {
                                                        cdestructuring_bind.cdestructuring_bind_error(var46, (SubLObject)module0795.$ic15$);
                                                    }
                                                }
                                                var52_53 = var42;
                                                if (module0795.NIL == module0065.f4777(var52_53) || module0795.NIL == module0065.f4773((SubLObject)module0795.$ic14$)) {
                                                    var55 = module0065.f4738(var52_53);
                                                    var56 = module0065.f4739(var52_53);
                                                    var57 = module0065.f4734(var52_53);
                                                    var58 = (SubLObject)((module0795.NIL != module0065.f4773((SubLObject)module0795.$ic14$)) ? module0795.NIL : module0795.$ic14$);
                                                    while (var56.numL(var57) && module0795.NIL == var28) {
                                                        var59 = Hashtables.gethash_without_values(var56, var55, var58);
                                                        if (module0795.NIL == module0065.f4773((SubLObject)module0795.$ic14$) || module0795.NIL == module0065.f4749(var59)) {
                                                            var37 = Numbers.add(var37, (SubLObject)module0795.ONE_INTEGER);
                                                            module0012.note_percent_progress(var37, var36);
                                                            if (module0795.NIL != var29 && module0795.NIL != f50846(var59) && module0795.NIL == module0269.f17716(var59)) {
                                                                var60 = f50847(var59);
                                                                if (module0795.NIL != module0035.f2013(var60)) {
                                                                    f50848(var59, var60);
                                                                    module0601.f36746();
                                                                    var27 = Numbers.add(var27, (SubLObject)module0795.ONE_INTEGER);
                                                                    if (module0795.NIL != var22) {
                                                                        var28 = Numbers.numGE(var27, var22);
                                                                    }
                                                                }
                                                            }
                                                            if (var59.eql(var23)) {
                                                                var29 = (SubLObject)module0795.T;
                                                            }
                                                        }
                                                        var56 = Numbers.add(var56, (SubLObject)module0795.ONE_INTEGER);
                                                    }
                                                }
                                            }
                                        }
                                        module0012.f479();
                                    }
                                    finally {
                                        module0012.$g78$.rebind(var39, var24);
                                        module0012.$g77$.rebind(var38, var24);
                                        module0012.$g76$.rebind(var14_34, var24);
                                        module0012.$g75$.rebind(var7_30, var24);
                                    }
                                }
                                finally {
                                    module0601.$g4654$.rebind(var34, var24);
                                    module0601.$g4652$.rebind(var7_29, var24);
                                }
                            }
                            finally {
                                final SubLObject var7_31 = Threads.$is_thread_performing_cleanupP$.currentBinding(var24);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0795.T, var24);
                                    module0601.f36746();
                                    module0601.f36760((SubLObject)module0795.$ic12$);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var7_31, var24);
                                }
                            }
                        }
                        finally {
                            final SubLObject var7_32 = Threads.$is_thread_performing_cleanupP$.currentBinding(var24);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0795.T, var24);
                                if (module0795.NIL != var31 && module0795.NIL == var32) {
                                    module0034.f1873(var31, (SubLObject)module0795.NIL);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var7_32, var24);
                            }
                        }
                    }
                }
                finally {
                    module0034.$g879$.rebind(var7_28, var24);
                }
            }
            finally {
                module0587.$g4457$.rebind(var26, var24);
            }
        }
        finally {
            final SubLObject var61 = Threads.$is_thread_performing_cleanupP$.currentBinding(var24);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0795.T, var24);
                if (var25.isStream()) {
                    streams_high.close(var25, (SubLObject)module0795.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var61, var24);
            }
        }
        return (SubLObject)module0795.NIL;
    }
    
    public static SubLObject f50849(final SubLObject var59, final SubLObject var60, SubLObject var61) {
        if (var61 == module0795.UNPROVIDED) {
            var61 = module0057.f4173((SubLObject)module0795.UNPROVIDED, (SubLObject)module0795.UNPROVIDED, (SubLObject)module0795.UNPROVIDED);
        }
        final SubLThread var62 = SubLProcess.currentSubLThread();
        final SubLObject var63 = module0590.f35985(var59, (SubLObject)module0795.NIL, (SubLObject)module0795.NIL, (SubLObject)module0795.NIL);
        SubLObject var64 = (SubLObject)module0795.ZERO_INTEGER;
        final SubLObject var65 = (SubLObject)module0795.TEN_INTEGER;
        SubLObject var66 = (SubLObject)module0795.NIL;
        SubLObject var67 = (SubLObject)module0795.NIL;
        try {
            final SubLObject var68 = stream_macros.$stream_requires_locking$.currentBinding(var62);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0795.NIL, var62);
                var67 = compatibility.open_text(var60, (SubLObject)module0795.$ic5$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var68, var62);
            }
            if (!var67.isStream()) {
                Errors.error((SubLObject)module0795.$ic6$, var60);
            }
            final SubLObject var69 = var67;
            f50850(var69);
            final SubLObject var70 = module0012.$g75$.currentBinding(var62);
            final SubLObject var71 = module0012.$g76$.currentBinding(var62);
            final SubLObject var72 = module0012.$g77$.currentBinding(var62);
            final SubLObject var73 = module0012.$g78$.currentBinding(var62);
            try {
                module0012.$g75$.bind((SubLObject)module0795.ZERO_INTEGER, var62);
                module0012.$g76$.bind((SubLObject)module0795.NIL, var62);
                module0012.$g77$.bind((SubLObject)module0795.T, var62);
                module0012.$g78$.bind(Time.get_universal_time(), var62);
                module0012.f478((SubLObject)module0795.$ic16$);
                module0590.f36024(var63);
                module0052.f3693(var63);
                module0590.f36024(var63);
                while (module0795.NIL != module0590.f36071(module0052.f3796(var63), (SubLObject)module0795.$ic17$)) {
                    module0052.f3693(var63);
                    module0590.f36024(var63);
                }
                while (module0795.NIL == module0590.f36071(module0052.f3796(var63), (SubLObject)module0795.$ic12$)) {
                    final SubLObject var74 = module0590.f36087(var63, (SubLObject)module0795.UNPROVIDED);
                    final SubLObject var75 = module0590.f36096(var74, (SubLObject)module0795.$ic18$);
                    final SubLObject var76 = module0213.f13917(var75);
                    final SubLObject var77 = module0590.f36092(var74);
                    if (module0795.NIL == Errors.$ignore_mustsP$.getDynamicValue(var62) && !var77.equal((SubLObject)module0795.$ic19$)) {
                        Errors.error((SubLObject)module0795.$ic20$, var77);
                    }
                    final SubLObject var78 = module0590.f36096(var74, (SubLObject)module0795.$ic21$);
                    final SubLObject var79 = module0213.f13917(var78);
                    if (module0795.NIL != module0174.f11041(var79, (SubLObject)module0795.UNPROVIDED)) {
                        final SubLObject var80 = module0590.f36093(var74, (SubLObject)module0795.$ic22$);
                        final SubLObject var81 = module0590.f36096(var80, (SubLObject)module0795.$ic23$);
                        if (var81.isString()) {
                            final SubLObject var82 = f50851(var61, var76);
                            if (module0795.NIL != var66) {
                                if (Numbers.mod(var64, var65).isZero()) {
                                    PrintLow.format(var69, (SubLObject)module0795.$ic24$);
                                    f50850(var69);
                                }
                                else {
                                    PrintLow.format(var69, (SubLObject)module0795.$ic25$);
                                }
                            }
                            f50852(var82, var76, var79, var81, var69);
                            var66 = (SubLObject)module0795.T;
                            var64 = Numbers.add(var64, (SubLObject)module0795.ONE_INTEGER);
                        }
                    }
                    module0590.f36024(var63);
                    while (module0795.NIL != module0590.f36071(module0052.f3796(var63), (SubLObject)module0795.$ic17$)) {
                        module0052.f3693(var63);
                        module0590.f36024(var63);
                    }
                    var62.resetMultipleValues();
                    final SubLObject var83 = module0590.f36026(var63);
                    final SubLObject var84 = var62.secondMultipleValue();
                    var62.resetMultipleValues();
                    module0012.note_percent_progress(var83, var84);
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var73, var62);
                module0012.$g77$.rebind(var72, var62);
                module0012.$g76$.rebind(var71, var62);
                module0012.$g75$.rebind(var70, var62);
            }
            PrintLow.format(var69, (SubLObject)module0795.$ic24$);
        }
        finally {
            final SubLObject var85 = Threads.$is_thread_performing_cleanupP$.currentBinding(var62);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0795.T, var62);
                if (var67.isStream()) {
                    streams_high.close(var67, (SubLObject)module0795.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var85, var62);
            }
        }
        return Values.values(var60, var61);
    }
    
    public static SubLObject f50851(final SubLObject var61, final SubLObject var70) {
        return module0057.f4175(var61);
    }
    
    public static SubLObject f50850(final SubLObject var67) {
        print_high.princ((SubLObject)module0795.$ic26$, var67);
        streams_high.terpri(var67);
        return (SubLObject)module0795.NIL;
    }
    
    public static SubLObject f50852(final SubLObject var76, final SubLObject var70, final SubLObject var73, final SubLObject var75, final SubLObject var67) {
        assert module0795.NIL != Types.stringp(var75) : var75;
        PrintLow.format(var67, (SubLObject)module0795.$ic27$, new SubLObject[] { var76, module0213.f13918(var70), var70, module0213.f13918(var73), module0289.f19396(var73), module0289.f19401(var73), (module0795.NIL != Sequences.find((SubLObject)Characters.CHAR_quote, var75, (SubLObject)module0795.UNPROVIDED, (SubLObject)module0795.UNPROVIDED, (SubLObject)module0795.UNPROVIDED, (SubLObject)module0795.UNPROVIDED)) ? module0038.f2669(var75, (SubLObject)module0795.$ic28$, (SubLObject)module0795.$ic29$) : var75 });
        return (SubLObject)module0795.NIL;
    }
    
    public static SubLObject f50848(final SubLObject var79, SubLObject var51) {
        if (var51 == module0795.UNPROVIDED) {
            var51 = f50847(var79);
        }
        final SubLThread var80 = SubLProcess.currentSubLThread();
        assert module0795.NIL != module0173.f10955(var79) : var79;
        try {
            final SubLObject var81 = module0601.$g4652$.currentBinding(var80);
            final SubLObject var82 = module0601.$g4654$.currentBinding(var80);
            try {
                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var80), module0601.$g4652$.getDynamicValue(var80)), var80);
                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var80), var80);
                module0601.f36758((SubLObject)module0795.$ic17$, (SubLObject)ConsesLow.list((SubLObject)module0795.$ic31$, module0213.f13918(var79)), (SubLObject)module0795.NIL, (SubLObject)module0795.NIL);
                module0601.f36746();
                SubLObject var83 = var51;
                SubLObject var84 = (SubLObject)module0795.NIL;
                var84 = var83.first();
                while (module0795.NIL != var83) {
                    f50843(var84);
                    module0601.f36746();
                    streams_high.force_output(module0587.$g4457$.getDynamicValue(var80));
                    var83 = var83.rest();
                    var84 = var83.first();
                }
            }
            finally {
                module0601.$g4654$.rebind(var82, var80);
                module0601.$g4652$.rebind(var81, var80);
            }
        }
        finally {
            final SubLObject var85 = Threads.$is_thread_performing_cleanupP$.currentBinding(var80);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0795.T, var80);
                module0601.f36746();
                module0601.f36760((SubLObject)module0795.$ic17$);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var85, var80);
            }
        }
        return var79;
    }
    
    public static SubLObject f50843(final SubLObject var82) {
        final SubLThread var83 = SubLProcess.currentSubLThread();
        assert module0795.NIL != f50853(var82) : var82;
        final SubLObject var84 = (SubLObject)ConsesLow.list((SubLObject)module0795.$ic18$, module0213.f13918(var82.first()), (SubLObject)module0795.$ic21$, module0213.f13918(conses_high.second(var82)));
        try {
            final SubLObject var85 = module0601.$g4652$.currentBinding(var83);
            final SubLObject var86 = module0601.$g4654$.currentBinding(var83);
            try {
                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var83), module0601.$g4652$.getDynamicValue(var83)), var83);
                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var83), var83);
                module0601.f36758((SubLObject)module0795.$ic19$, var84, (SubLObject)module0795.NIL, (SubLObject)module0795.NIL);
                module0601.f36746();
                module0769.f49009(conses_high.third(var82));
            }
            finally {
                module0601.$g4654$.rebind(var86, var83);
                module0601.$g4652$.rebind(var85, var83);
            }
        }
        finally {
            final SubLObject var87 = Threads.$is_thread_performing_cleanupP$.currentBinding(var83);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0795.T, var83);
                module0601.f36746();
                module0601.f36760((SubLObject)module0795.$ic19$);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var87, var83);
            }
        }
        return (SubLObject)module0795.NIL;
    }
    
    public static SubLObject f50853(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0795.NIL != f50841(var1) && module0795.NIL != module0173.f10969(var1.first()) && module0795.NIL != module0174.f11041(conses_high.second(var1), (SubLObject)module0795.UNPROVIDED));
    }
    
    public static SubLObject f50844(final SubLObject var4, SubLObject var84) {
        if (var84 == module0795.UNPROVIDED) {
            var84 = (SubLObject)module0795.NIL;
        }
        assert module0795.NIL != module0173.f10955(var4) : var4;
        final SubLObject var85 = f50854(var4);
        if (module0795.NIL != conses_high.getf(var84, (SubLObject)module0795.$ic33$, (SubLObject)module0795.NIL)) {
            return f50855(var85, var84);
        }
        return f50856(var85, var84);
    }
    
    public static SubLObject f50857(final SubLObject var73, final SubLObject var86) {
        if (module0795.NIL == module0173.f10955(var86)) {
            return (SubLObject)module0795.NIL;
        }
        final SubLObject var87 = f50858(var86);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0795.NIL != var87 && module0795.NIL != module0077.f5320(var73, f50859(var87)));
    }
    
    public static SubLObject f50860(final SubLObject var4) {
        assert module0795.NIL != module0173.f10955(var4) : var4;
        final SubLObject var5 = f50858(var4);
        return (SubLObject)((module0795.NIL != var5) ? module0055.f4016(f50861(var5)) : module0795.ZERO_INTEGER);
    }
    
    public static SubLObject f50862(final SubLObject var4) {
        assert module0795.NIL != module0173.f10955(var4) : var4;
        final SubLObject var5 = f50858(var4);
        return (SubLObject)((module0795.NIL != var5) ? Numbers.subtract(module0077.f5311(f50859(var5)), f50860(var4)) : module0795.ZERO_INTEGER);
    }
    
    public static SubLObject f50863() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        if (module0795.NIL == module0103.f7367(module0795.$g6362$.getGlobalValue())) {
            f50864(module0795.$g6360$.getDynamicValue(var5), module0795.$g6361$.getDynamicValue(var5), (SubLObject)module0795.$ic42$);
        }
        return module0795.$g6362$.getGlobalValue();
    }
    
    public static SubLObject f50864(final SubLObject var87, final SubLObject var88, final SubLObject var89) {
        module0795.$g6362$.setGlobalValue(module0103.f7380(var87, var88, var89));
        return module0103.f7367(module0795.$g6362$.getGlobalValue());
    }
    
    public static SubLObject f50865() {
        module0795.$g6362$.setGlobalValue((SubLObject)module0795.NIL);
        return (SubLObject)module0795.T;
    }
    
    public static SubLObject f50866() {
        for (SubLObject var90 = module0795.$g6363$.getGlobalValue(), var91 = module0055.f4019(var90); module0795.NIL == var91; var91 = module0055.f4019(var90)) {
            final SubLObject var92 = module0055.f4023(var90);
            module0103.f7397(var92);
        }
        return (SubLObject)module0795.T;
    }
    
    public static SubLObject f50867() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)module0795.NIL;
        SubLObject var7 = (SubLObject)module0795.NIL;
        SubLObject var8 = (SubLObject)module0795.NIL;
        try {
            var5.throwStack.push(module0795.$ic45$);
            final SubLObject var9 = Errors.$error_handler$.currentBinding(var5);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0795.$ic46$), var5);
                try {
                    final SubLObject var10 = f50868();
                    SubLObject var11 = (SubLObject)module0795.NIL;
                    try {
                        if (module0795.NIL != f50869(var10)) {
                            final SubLObject var12 = module0103.f7391(var10);
                            final SubLObject var13 = module0103.f7378(var12);
                            var6 = module0103.f7377(var12);
                            var7 = Numbers.subtract(var13, module0110.$g1383$.getDynamicValue(var5));
                            f50870(var10);
                        }
                        var11 = (SubLObject)module0795.T;
                    }
                    finally {
                        final SubLObject var7_98 = Threads.$is_thread_performing_cleanupP$.currentBinding(var5);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0795.T, var5);
                            if (module0795.NIL == var11) {
                                module0103.f7397(var10);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var7_98, var5);
                        }
                    }
                }
                catch (Throwable var14) {
                    Errors.handleThrowable(var14, (SubLObject)module0795.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var9, var5);
            }
        }
        catch (Throwable var15) {
            var8 = Errors.handleThrowable(var15, (SubLObject)module0795.$ic45$);
        }
        finally {
            var5.throwStack.pop();
        }
        return Values.values(var6, var7);
    }
    
    public static SubLObject f50871(final SubLObject var4, final SubLObject var84) {
        SubLObject var85;
        for (var85 = (SubLObject)module0795.$ic47$; module0795.NIL != var85 && module0795.NIL == f50853(var85); var85 = f50872(var4, var84)) {}
        return var85;
    }
    
    public static SubLObject f50872(final SubLObject var4, final SubLObject var84) {
        final SubLThread var85 = SubLProcess.currentSubLThread();
        final SubLObject var86 = (SubLObject)ConsesLow.list((SubLObject)module0795.$ic48$, (SubLObject)ConsesLow.list((SubLObject)module0795.$ic49$, var4), (SubLObject)ConsesLow.list((SubLObject)module0795.$ic49$, var84));
        final SubLObject var87 = (SubLObject)ConsesLow.list((SubLObject)module0795.$ic50$, (SubLObject)module0795.$ic51$, (SubLObject)ConsesLow.list((SubLObject)module0795.$ic52$, var86));
        SubLObject var88 = (SubLObject)module0795.NIL;
        SubLObject var89 = (SubLObject)module0795.NIL;
        SubLObject var90 = (SubLObject)module0795.NIL;
        try {
            var85.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var91 = Errors.$error_handler$.currentBinding(var85);
            try {
                Errors.$error_handler$.bind((SubLObject)module0795.$ic53$, var85);
                try {
                    var89 = f50868();
                    SubLObject var92 = (SubLObject)module0795.NIL;
                    try {
                        var88 = module0103.f7398(var89, var87);
                        f50870(var89);
                        var92 = (SubLObject)module0795.T;
                    }
                    finally {
                        final SubLObject var7_105 = Threads.$is_thread_performing_cleanupP$.currentBinding(var85);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0795.T, var85);
                            if (module0795.NIL == var92) {
                                module0103.f7397(var89);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var7_105, var85);
                        }
                    }
                }
                catch (Throwable var93) {
                    Errors.handleThrowable(var93, (SubLObject)module0795.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var91, var85);
            }
        }
        catch (Throwable var94) {
            var90 = Errors.handleThrowable(var94, module0003.$g3$.getGlobalValue());
        }
        finally {
            var85.throwStack.pop();
        }
        if (module0795.NIL != var90) {
            Errors.warn(var90);
        }
        return (SubLObject)((module0795.NIL != var88) ? module0004.values_list(var88) : module0795.NIL);
    }
    
    public static SubLObject f50873() {
        final SubLObject var106 = f50863();
        final SubLObject var107 = module0103.f7393(var106);
        if (module0795.NIL != module0103.f7383(var107)) {
            module0103.f7394(var107);
            return var107;
        }
        return Errors.error((SubLObject)module0795.$ic54$, var106);
    }
    
    public static SubLObject f50870(final SubLObject var92) {
        final SubLObject var93 = module0795.$g6364$.getGlobalValue();
        SubLObject var94 = (SubLObject)module0795.NIL;
        try {
            var94 = Locks.seize_lock(var93);
            if (module0055.f4016(module0795.$g6363$.getGlobalValue()).numGE(module0795.$g6365$.getGlobalValue())) {
                module0103.f7397(var92);
            }
            else {
                module0055.f4021(var92, module0795.$g6363$.getGlobalValue());
            }
        }
        finally {
            if (module0795.NIL != var94) {
                Locks.release_lock(var93);
            }
        }
        return (SubLObject)module0795.T;
    }
    
    public static SubLObject f50869(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0795.NIL != module0103.f7383(var1) && module0795.NIL != streams_high.open_stream_p(module0103.f7392(var1)));
    }
    
    public static SubLObject f50868() {
        SubLObject var92 = (SubLObject)module0795.NIL;
        final SubLObject var93 = module0795.$g6364$.getGlobalValue();
        SubLObject var94 = (SubLObject)module0795.NIL;
        try {
            var94 = Locks.seize_lock(var93);
            for (SubLObject var95 = module0795.$g6363$.getGlobalValue(), var96 = (SubLObject)SubLObjectFactory.makeBoolean(module0795.NIL != var92 || module0795.NIL != module0055.f4019(var95)); module0795.NIL == var96; var96 = (SubLObject)SubLObjectFactory.makeBoolean(module0795.NIL != var92 || module0795.NIL != module0055.f4019(var95))) {
                final SubLObject var97 = module0055.f4023(var95);
                if (module0795.NIL != f50869(var97)) {
                    var92 = var97;
                }
            }
            if (module0795.NIL == var92) {
                var92 = f50873();
            }
        }
        finally {
            if (module0795.NIL != var94) {
                Locks.release_lock(var93);
            }
        }
        return var92;
    }
    
    public static SubLObject f50874(final SubLObject var85, final SubLObject var4) {
        return module0067.f4886(module0795.$g6366$.getGlobalValue(), var4, var85);
    }
    
    public static SubLObject f50858(final SubLObject var4) {
        return module0067.f4884(module0795.$g6366$.getGlobalValue(), var4, (SubLObject)module0795.NIL);
    }
    
    public static SubLObject f50875(final SubLObject var112, final SubLObject var113) {
        f50876(var112, var113, (SubLObject)module0795.ZERO_INTEGER);
        return (SubLObject)module0795.NIL;
    }
    
    public static SubLObject f50877(final SubLObject var112) {
        return (SubLObject)((var112.getClass() == $sX55445_native.class) ? module0795.T : module0795.NIL);
    }
    
    public static SubLObject f50878(final SubLObject var112) {
        assert module0795.NIL != f50877(var112) : var112;
        return var112.getField2();
    }
    
    public static SubLObject f50879(final SubLObject var112) {
        assert module0795.NIL != f50877(var112) : var112;
        return var112.getField3();
    }
    
    public static SubLObject f50880(final SubLObject var112) {
        assert module0795.NIL != f50877(var112) : var112;
        return var112.getField4();
    }
    
    public static SubLObject f50881(final SubLObject var112) {
        assert module0795.NIL != f50877(var112) : var112;
        return var112.getField5();
    }
    
    public static SubLObject f50882(final SubLObject var112) {
        assert module0795.NIL != f50877(var112) : var112;
        return var112.getField6();
    }
    
    public static SubLObject f50883(final SubLObject var112) {
        assert module0795.NIL != f50877(var112) : var112;
        return var112.getField7();
    }
    
    public static SubLObject f50884(final SubLObject var112, final SubLObject var115) {
        assert module0795.NIL != f50877(var112) : var112;
        return var112.setField2(var115);
    }
    
    public static SubLObject f50885(final SubLObject var112, final SubLObject var115) {
        assert module0795.NIL != f50877(var112) : var112;
        return var112.setField3(var115);
    }
    
    public static SubLObject f50886(final SubLObject var112, final SubLObject var115) {
        assert module0795.NIL != f50877(var112) : var112;
        return var112.setField4(var115);
    }
    
    public static SubLObject f50887(final SubLObject var112, final SubLObject var115) {
        assert module0795.NIL != f50877(var112) : var112;
        return var112.setField5(var115);
    }
    
    public static SubLObject f50888(final SubLObject var112, final SubLObject var115) {
        assert module0795.NIL != f50877(var112) : var112;
        return var112.setField6(var115);
    }
    
    public static SubLObject f50889(final SubLObject var112, final SubLObject var115) {
        assert module0795.NIL != f50877(var112) : var112;
        return var112.setField7(var115);
    }
    
    public static SubLObject f50890(SubLObject var116) {
        if (var116 == module0795.UNPROVIDED) {
            var116 = (SubLObject)module0795.NIL;
        }
        final SubLObject var117 = (SubLObject)new $sX55445_native();
        SubLObject var118;
        SubLObject var119;
        SubLObject var120;
        SubLObject var121;
        for (var118 = (SubLObject)module0795.NIL, var118 = var116; module0795.NIL != var118; var118 = conses_high.cddr(var118)) {
            var119 = var118.first();
            var120 = conses_high.cadr(var118);
            var121 = var119;
            if (var121.eql((SubLObject)module0795.$ic77$)) {
                f50884(var117, var120);
            }
            else if (var121.eql((SubLObject)module0795.$ic78$)) {
                f50885(var117, var120);
            }
            else if (var121.eql((SubLObject)module0795.$ic79$)) {
                f50886(var117, var120);
            }
            else if (var121.eql((SubLObject)module0795.$ic80$)) {
                f50887(var117, var120);
            }
            else if (var121.eql((SubLObject)module0795.$ic81$)) {
                f50888(var117, var120);
            }
            else if (var121.eql((SubLObject)module0795.$ic82$)) {
                f50889(var117, var120);
            }
            else {
                Errors.error((SubLObject)module0795.$ic83$, var119);
            }
        }
        return var117;
    }
    
    public static SubLObject f50891(final SubLObject var122, final SubLObject var123) {
        Functions.funcall(var123, var122, (SubLObject)module0795.$ic84$, (SubLObject)module0795.$ic85$, (SubLObject)module0795.SIX_INTEGER);
        Functions.funcall(var123, var122, (SubLObject)module0795.$ic86$, (SubLObject)module0795.$ic77$, f50878(var122));
        Functions.funcall(var123, var122, (SubLObject)module0795.$ic86$, (SubLObject)module0795.$ic78$, f50879(var122));
        Functions.funcall(var123, var122, (SubLObject)module0795.$ic86$, (SubLObject)module0795.$ic79$, f50880(var122));
        Functions.funcall(var123, var122, (SubLObject)module0795.$ic86$, (SubLObject)module0795.$ic80$, f50881(var122));
        Functions.funcall(var123, var122, (SubLObject)module0795.$ic86$, (SubLObject)module0795.$ic81$, f50882(var122));
        Functions.funcall(var123, var122, (SubLObject)module0795.$ic86$, (SubLObject)module0795.$ic82$, f50883(var122));
        Functions.funcall(var123, var122, (SubLObject)module0795.$ic87$, (SubLObject)module0795.$ic85$, (SubLObject)module0795.SIX_INTEGER);
        return var122;
    }
    
    public static SubLObject f50892(final SubLObject var122, final SubLObject var123) {
        return f50891(var122, var123);
    }
    
    public static SubLObject f50893(final SubLObject var85) {
        return f50878(var85);
    }
    
    public static SubLObject f50859(final SubLObject var85) {
        return f50879(var85);
    }
    
    public static SubLObject f50894(final SubLObject var85) {
        return f50880(var85);
    }
    
    public static SubLObject f50895(final SubLObject var85, final SubLObject var124) {
        f50886(var85, var124);
        return var124;
    }
    
    public static SubLObject f50861(final SubLObject var85) {
        return f50881(var85);
    }
    
    public static SubLObject f50896(final SubLObject var85) {
        return f50882(var85);
    }
    
    public static SubLObject f50897(final SubLObject var85, final SubLObject var81) {
        f50888(var85, var81);
        return var81;
    }
    
    public static SubLObject f50898(final SubLObject var85) {
        return f50883(var85);
    }
    
    public static SubLObject f50899(final SubLObject var85, final SubLObject var51) {
        f50889(var85, var51);
        return var51;
    }
    
    public static SubLObject f50876(final SubLObject var85, SubLObject var113, SubLObject var125) {
        if (var113 == module0795.UNPROVIDED) {
            var113 = (SubLObject)module0795.NIL;
        }
        if (var125 == module0795.UNPROVIDED) {
            var125 = (SubLObject)module0795.NIL;
        }
        PrintLow.format(var113, (SubLObject)module0795.$ic89$, new SubLObject[] { f50878(var85), module0077.f5311(f50879(var85)), (module0795.NIL != module0055.f4006(f50881(var85))) ? Sequences.cconcatenate(module0006.f205(module0055.f4016(f50881(var85))), (SubLObject)module0795.$ic90$) : module0795.$ic91$ });
        return var85;
    }
    
    public static SubLObject f50854(final SubLObject var4) {
        assert module0795.NIL != module0173.f10955(var4) : var4;
        final SubLObject var5 = f50858(var4);
        return (module0795.NIL != var5) ? var5 : f50900(var4);
    }
    
    public static SubLObject f50901() {
        return (SubLObject)module0795.$ic0$;
    }
    
    public static SubLObject f50900(final SubLObject var4) {
        final SubLObject var5 = f50902();
        f50884(var5, var4);
        f50874(var5, var4);
        f50903(var5, (SubLObject)module0795.UNPROVIDED);
        return var5;
    }
    
    public static SubLObject f50902() {
        final SubLObject var85 = f50890((SubLObject)ConsesLow.list(new SubLObject[] { module0795.$ic77$, module0795.NIL, module0795.$ic78$, module0077.f5313((SubLObject)module0795.UNPROVIDED, (SubLObject)module0795.UNPROVIDED), module0795.$ic80$, module0055.f4017(), module0795.$ic81$, f50901(), module0795.$ic82$, module0067.f4880(Symbols.symbol_function((SubLObject)module0795.EQL), (SubLObject)module0795.UNPROVIDED) }));
        return var85;
    }
    
    public static SubLObject f50904(final SubLObject var85) {
        f50895(var85, (SubLObject)module0795.$ic92$);
        return var85;
    }
    
    public static SubLObject f50905(final SubLObject var85) {
        return Equality.eq((SubLObject)module0795.$ic92$, f50894(var85));
    }
    
    public static SubLObject f50906(final SubLObject var127) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0795.NIL == var127.rest() || module0795.$ic92$.eql(var127.rest()));
    }
    
    public static SubLObject f50907(final SubLObject var127) {
        return ConsesLow.rplacd(var127, (SubLObject)module0795.$ic92$);
    }
    
    public static SubLObject f50908(final SubLObject var85, final SubLObject var128) {
        final SubLThread var129 = SubLProcess.currentSubLThread();
        SubLObject var130;
        SubLObject var131;
        for (var130 = (SubLObject)SubLObjectFactory.makeBoolean(module0795.NIL == f50909(var85, var128)), var131 = module0066.f4838(module0067.f4891(f50898(var85))); module0795.NIL == var130 && module0795.NIL == module0066.f4841(var131); var131 = module0066.f4840(var131)) {
            var129.resetMultipleValues();
            final SubLObject var132 = module0066.f4839(var131);
            final SubLObject var133 = var129.secondMultipleValue();
            var129.resetMultipleValues();
            if (!var133.isCons() || (module0795.NIL == f50906(var133) && module0795.NIL == var133.first())) {
                var130 = (SubLObject)module0795.T;
            }
        }
        module0066.f4842(var131);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0795.NIL == var130);
    }
    
    public static SubLObject f50909(final SubLObject var85, final SubLObject var128) {
        return Numbers.numGE(module0055.f4016(f50861(var85)), var128);
    }
    
    public static SubLObject f50910(final SubLObject var85, final SubLObject var70) {
        final SubLObject var86 = f50898(var85);
        if (module0795.NIL == module0067.f4884(var86, var70, (SubLObject)module0795.NIL)) {
            f50911(var85, var70);
            module0067.f4886(var86, var70, (SubLObject)module0795.$ic93$);
        }
        return var85;
    }
    
    public static SubLObject f50912(final SubLObject var133, final SubLObject var134) {
        SubLObject var136;
        final SubLObject var135 = var136 = var133.rest();
        SubLObject var137 = (SubLObject)module0795.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var136, var135, (SubLObject)module0795.$ic94$);
        var137 = var136.first();
        final SubLObject var138;
        var136 = (var138 = var136.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0795.$ic95$, (SubLObject)module0795.$ic96$, (SubLObject)ConsesLow.list((SubLObject)module0795.$ic97$, (SubLObject)module0795.$ic98$, (SubLObject)ConsesLow.list((SubLObject)module0795.$ic99$, (SubLObject)module0795.T, (SubLObject)ConsesLow.listS((SubLObject)module0795.$ic100$, var137, ConsesLow.append(var138, (SubLObject)module0795.NIL)))), (SubLObject)module0795.$ic101$);
    }
    
    public static SubLObject f50911(final SubLObject var85, final SubLObject var70) {
        final SubLThread var86 = SubLProcess.currentSubLThread();
        assert module0795.NIL != module0173.f10955(var70) : var70;
        final SubLObject var87 = f50898(var85);
        if (module0795.NIL != module0795.$g6368$.getDynamicValue(var86)) {
            Functions.apply((SubLObject)module0795.$ic102$, (SubLObject)ConsesLow.cons((SubLObject)module0795.T, (SubLObject)ConsesLow.list((SubLObject)module0795.$ic103$, f50893(var85), var70)));
            streams_high.force_output((SubLObject)module0795.T);
        }
        module0067.f4886(var87, var70, (SubLObject)module0795.$ic93$);
        return var85;
    }
    
    public static SubLObject f50847(final SubLObject var70) {
        assert module0795.NIL != module0173.f10955(var70) : var70;
        final SubLObject var71 = f50902();
        SubLObject var72 = (SubLObject)module0795.NIL;
        SubLObject var73 = (SubLObject)module0795.NIL;
        while (module0795.NIL == var73) {
            final SubLObject var74 = f50855(var71, (SubLObject)ConsesLow.listS((SubLObject)module0795.$ic33$, var70, (SubLObject)module0795.$ic104$));
            if (module0795.NIL != f50840(var74)) {
                var73 = (SubLObject)module0795.T;
            }
            else {
                var72 = (SubLObject)ConsesLow.cons(var74, var72);
            }
        }
        Threads.kill_process(f50894(var71));
        return var72;
    }
    
    public static SubLObject f50855(final SubLObject var85, final SubLObject var84) {
        final SubLThread var86 = SubLProcess.currentSubLThread();
        final SubLObject var87 = cdestructuring_bind.property_list_member((SubLObject)module0795.$ic33$, var84);
        final SubLObject var88 = (SubLObject)((module0795.NIL != var87) ? conses_high.cadr(var87) : module0795.NIL);
        final SubLObject var89 = cdestructuring_bind.property_list_member((SubLObject)module0795.$ic105$, var84);
        final SubLObject var90 = (SubLObject)((module0795.NIL != var89) ? conses_high.cadr(var89) : module0795.T);
        final SubLObject var91 = cdestructuring_bind.property_list_member((SubLObject)module0795.$ic106$, var84);
        final SubLObject var92 = (SubLObject)((module0795.NIL != var91) ? conses_high.cadr(var91) : module0795.NIL);
        f50911(var85, var88);
        final SubLObject var93 = f50898(var85);
        SubLObject var94 = module0067.f4884(var93, var88, (SubLObject)module0795.NIL);
        SubLObject var95 = (SubLObject)module0795.NIL;
        if (!var94.isCons() && module0795.NIL == var90) {
            final SubLObject var96 = f50903(var85, (SubLObject)module0795.T);
            SubLObject var97 = (SubLObject)module0795.NIL;
            if (module0795.NIL != module0795.$g6368$.getDynamicValue(var86)) {
                Functions.apply((SubLObject)module0795.$ic102$, (SubLObject)ConsesLow.cons((SubLObject)module0795.T, (SubLObject)ConsesLow.list((SubLObject)module0795.$ic107$, var88)));
                streams_high.force_output((SubLObject)module0795.T);
            }
            while (module0795.NIL == var97) {
                var94 = module0067.f4884(var93, var88, (SubLObject)module0795.NIL);
                Threads.sleep((SubLObject)module0795.$ic108$);
                var97 = (SubLObject)SubLObjectFactory.makeBoolean(var94.isCons() || module0795.NIL == Threads.valid_process_p(var96));
            }
        }
        if (var94.isCons()) {
            var95 = var94.first();
            final SubLObject var98 = Types.sublisp_null(var94.rest());
            final SubLObject var99 = (SubLObject)SubLObjectFactory.makeBoolean(module0795.NIL != var98 || module0795.NIL != f50906(var94));
            if (module0795.NIL != var98) {
                f50907(var94);
            }
            if (module0795.NIL == var95) {
                if ((module0795.NIL != var98 || module0795.NIL == var99) && module0795.NIL != module0795.$g6368$.getDynamicValue(var86)) {
                    Functions.apply((SubLObject)module0795.$ic102$, (SubLObject)ConsesLow.cons((SubLObject)module0795.T, (SubLObject)ConsesLow.list((SubLObject)module0795.$ic109$, (SubLObject)((module0795.NIL != var99) ? module0795.$ic110$ : module0795.$ic111$), var88)));
                    streams_high.force_output((SubLObject)module0795.T);
                }
                if (module0795.NIL == var90 && module0795.NIL == var99) {
                    final SubLObject var100 = f50903(var85, (SubLObject)module0795.UNPROVIDED);
                    SubLObject var101 = (SubLObject)module0795.NIL;
                    if (module0795.NIL != module0795.$g6368$.getDynamicValue(var86)) {
                        Functions.apply((SubLObject)module0795.$ic102$, (SubLObject)ConsesLow.cons((SubLObject)module0795.T, (SubLObject)ConsesLow.list((SubLObject)module0795.$ic107$, var88)));
                        streams_high.force_output((SubLObject)module0795.T);
                    }
                    while (module0795.NIL == var101) {
                        Threads.sleep((SubLObject)module0795.$ic108$);
                        var95 = var94.first();
                        var101 = (SubLObject)SubLObjectFactory.makeBoolean(module0795.NIL != var95 || module0795.NIL == var94.rest() || module0795.NIL == Threads.valid_process_p(var100));
                    }
                }
            }
            ConsesLow.rplaca(var94, (SubLObject)module0795.NIL);
        }
        else if (module0795.NIL == module0067.f4884(var93, var88, (SubLObject)module0795.NIL)) {
            f50911(var85, var88);
        }
        return (module0795.NIL != var95) ? var95 : ((module0795.NIL != var92) ? f50901() : f50856(var85, var84));
    }
    
    public static SubLObject f50856(SubLObject var85, final SubLObject var84) {
        final SubLObject var86 = f50861(var85);
        SubLObject var87 = f50901();
        if (module0795.NIL != module0055.f4019(var86) && module0795.NIL != f50905(var85)) {
            module0077.f5328(f50859(var85));
            var85 = f50900(f50893(var85));
        }
        for (SubLObject var88 = f50903(var85, (SubLObject)module0795.UNPROVIDED), var89 = conses_high.getf(var84, (SubLObject)module0795.$ic105$, (SubLObject)module0795.T), var90 = (SubLObject)module0795.NIL; module0795.NIL == var90; var90 = (SubLObject)SubLObjectFactory.makeBoolean(module0795.NIL != var89 || module0795.NIL != var87.first() || module0795.NIL == Threads.valid_process_p(var88))) {
            var87 = module0055.f4023(var86);
        }
        return var87;
    }
    
    public static SubLObject f50903(final SubLObject var85, SubLObject var153) {
        if (var153 == module0795.UNPROVIDED) {
            var153 = (SubLObject)module0795.NIL;
        }
        SubLObject var154 = f50894(var85);
        if (module0795.NIL == Threads.valid_process_p(var154)) {
            var154 = module0059.f4332((SubLObject)module0795.$ic112$, (SubLObject)module0795.$ic113$, (SubLObject)ConsesLow.list(var85, (SubLObject)((module0795.NIL != var153) ? module0795.ZERO_INTEGER : module0795.$ic114$)));
            SubLObject var155 = (SubLObject)module0795.NIL;
            SubLObject var156 = (SubLObject)module0795.ONE_INTEGER;
            final SubLObject var157 = (SubLObject)module0795.$ic115$;
            final SubLObject var158 = (SubLObject)module0795.NIL;
            while (module0795.NIL == var155) {
                var155 = Threads.valid_process_p(var154);
                if (module0795.NIL == var155) {
                    Threads.sleep(Numbers.divide(var156, (SubLObject)module0795.$ic116$));
                    if (var156.numGE(var158)) {
                        continue;
                    }
                    final SubLObject var159 = Numbers.multiply(var156, var157);
                    var156 = Numbers.min(var159, var158);
                }
            }
            f50895(var85, var154);
        }
        return var154;
    }
    
    public static SubLObject f50913(final SubLObject var85, SubLObject var128, SubLObject var158) {
        if (var128 == module0795.UNPROVIDED) {
            var128 = (SubLObject)module0795.$ic114$;
        }
        if (var158 == module0795.UNPROVIDED) {
            var158 = (SubLObject)module0795.TEN_INTEGER;
        }
        while (module0795.NIL == f50905(var85)) {
            if (module0795.NIL != f50908(var85, var128)) {
                Threads.sleep(var158);
            }
            else {
                f50914(var85, var128);
            }
        }
        return var85;
    }
    
    public static SubLObject f50914(final SubLObject var85, final SubLObject var128) {
        final SubLThread var129 = SubLProcess.currentSubLThread();
        if (module0795.NIL != module0795.$g6368$.getDynamicValue(var129)) {
            Functions.apply((SubLObject)module0795.$ic102$, (SubLObject)ConsesLow.cons((SubLObject)module0795.T, (SubLObject)ConsesLow.list((SubLObject)module0795.$ic117$, var85)));
            streams_high.force_output((SubLObject)module0795.T);
        }
        SubLObject var130 = (SubLObject)module0795.NIL;
        SubLObject var131;
        for (var131 = module0066.f4838(module0067.f4891(f50898(var85))); module0795.NIL == module0066.f4841(var131); var131 = module0066.f4840(var131)) {
            var129.resetMultipleValues();
            final SubLObject var132 = module0066.f4839(var131);
            final SubLObject var133 = var129.secondMultipleValue();
            var129.resetMultipleValues();
            if (module0795.$ic93$.eql(var133)) {
                var130 = module0035.f2063(var130, var132, f50915(f50916(var132), var132, var85), (SubLObject)module0795.UNPROVIDED);
            }
            else if (module0795.NIL == var133.first() && module0795.NIL == f50906(var133)) {
                var130 = module0035.f2063(var130, var132, f50915(var133, var132, var85), (SubLObject)module0795.UNPROVIDED);
            }
        }
        module0066.f4842(var131);
        SubLObject var134 = var130;
        SubLObject var135 = (SubLObject)module0795.NIL;
        var135 = var134.first();
        while (module0795.NIL != var134) {
            SubLObject var137;
            final SubLObject var136 = var137 = var135;
            SubLObject var138 = (SubLObject)module0795.NIL;
            SubLObject var139 = (SubLObject)module0795.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var137, var136, (SubLObject)module0795.$ic118$);
            var138 = var137.first();
            var137 = (var139 = var137.rest());
            module0067.f4886(f50898(var85), var138, var139);
            var134 = var134.rest();
            var135 = var134.first();
        }
        if (module0795.NIL != module0035.f2012(var130)) {
            f50917(var85, var128);
        }
        if (module0795.NIL != module0795.$g6368$.getDynamicValue(var129)) {
            Functions.apply((SubLObject)module0795.$ic102$, (SubLObject)ConsesLow.cons((SubLObject)module0795.T, (SubLObject)ConsesLow.list((SubLObject)module0795.$ic119$, var85)));
            streams_high.force_output((SubLObject)module0795.T);
        }
        return var85;
    }
    
    public static SubLObject f50915(final SubLObject var127, final SubLObject var70, final SubLObject var85) {
        final SubLThread var128 = SubLProcess.currentSubLThread();
        if (module0795.NIL == Errors.$ignore_mustsP$.getDynamicValue(var128) && (!var127.isCons() || module0795.NIL != var127.first())) {
            Errors.error((SubLObject)module0795.$ic120$, var127);
        }
        while (module0795.NIL == var127.first() && module0795.NIL != var127.rest()) {
            var128.resetMultipleValues();
            final SubLObject var129 = module0035.f2103(var127.rest());
            final SubLObject var130 = var128.secondMultipleValue();
            var128.resetMultipleValues();
            ConsesLow.rplacd(var127, var129);
            final SubLObject var131 = module0077.f5326(var130, f50859(var85));
            if (module0795.NIL != var131 && module0795.NIL != f50918(var130) && module0795.NIL != module0794.f50813(var130, (SubLObject)module0795.UNPROVIDED) && module0795.NIL == f50919(var130)) {
                final SubLObject var132 = f50920(var130);
                if (module0795.NIL == var132) {
                    continue;
                }
                if (module0795.NIL != module0795.$g6368$.getDynamicValue(var128)) {
                    Functions.apply((SubLObject)module0795.$ic102$, (SubLObject)ConsesLow.cons((SubLObject)module0795.T, (SubLObject)ConsesLow.list((SubLObject)module0795.$ic121$, var70, module0751.f46910(var132))));
                    streams_high.force_output((SubLObject)module0795.T);
                }
                ConsesLow.rplaca(var127, (SubLObject)ConsesLow.list(var70, var130, var132));
            }
        }
        return var127;
    }
    
    public static SubLObject f50918(final SubLObject var166) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0795.NIL == module0035.find_if_not((SubLObject)module0795.$ic122$, module0205.f13183(var166, (SubLObject)module0795.$ic30$, (SubLObject)module0795.T, (SubLObject)module0795.UNPROVIDED, (SubLObject)module0795.UNPROVIDED, (SubLObject)module0795.UNPROVIDED), (SubLObject)module0795.UNPROVIDED, (SubLObject)module0795.UNPROVIDED, (SubLObject)module0795.UNPROVIDED));
    }
    
    public static SubLObject f50921(final SubLObject var50) {
        final SubLThread var51 = SubLProcess.currentSubLThread();
        SubLObject var52 = (SubLObject)module0795.NIL;
        SubLObject var53 = (SubLObject)module0795.NIL;
        try {
            var51.throwStack.push(module0795.$ic45$);
            final SubLObject var54 = Errors.$error_handler$.currentBinding(var51);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0795.$ic46$), var51);
                try {
                    var52 = module0712.f43689(var50);
                }
                catch (Throwable var55) {
                    Errors.handleThrowable(var55, (SubLObject)module0795.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var54, var51);
            }
        }
        catch (Throwable var56) {
            var53 = Errors.handleThrowable(var56, (SubLObject)module0795.$ic45$);
        }
        finally {
            var51.throwStack.pop();
        }
        return var52;
    }
    
    public static SubLObject f50846(final SubLObject var50) {
        final SubLThread var51 = SubLProcess.currentSubLThread();
        final SubLObject var52 = module0034.$g879$.getDynamicValue(var51);
        SubLObject var53 = (SubLObject)module0795.NIL;
        if (module0795.NIL == var52) {
            return f50921(var50);
        }
        var53 = module0034.f1857(var52, (SubLObject)module0795.$ic122$, (SubLObject)module0795.UNPROVIDED);
        if (module0795.NIL == var53) {
            var53 = module0034.f1807(module0034.f1842(var52), (SubLObject)module0795.$ic122$, (SubLObject)module0795.ONE_INTEGER, (SubLObject)module0795.NIL, (SubLObject)module0795.EQL, (SubLObject)module0795.UNPROVIDED);
            module0034.f1860(var52, (SubLObject)module0795.$ic122$, var53);
        }
        SubLObject var54 = module0034.f1814(var53, var50, (SubLObject)module0795.$ic123$);
        if (var54 == module0795.$ic123$) {
            var54 = Values.arg2(var51.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f50921(var50)));
            module0034.f1816(var53, var50, var54, (SubLObject)module0795.UNPROVIDED);
        }
        return module0034.f1959(var54);
    }
    
    public static SubLObject f50922(final SubLObject var172) {
        if (module0795.NIL != module0173.f10955(var172)) {
            return module0259.f16976(var172, module0795.$ic125$);
        }
        if (module0795.NIL != module0202.f12590(var172)) {
            SubLObject var173 = (SubLObject)module0795.NIL;
            final SubLObject var174 = module0205.f13207(var172, (SubLObject)module0795.$ic126$);
            SubLObject var175;
            SubLObject var176;
            for (var175 = (SubLObject)module0795.NIL, var175 = var174; module0795.NIL == var173 && module0795.NIL != var175; var175 = var175.rest()) {
                var176 = var175.first();
                if (module0795.NIL != f50919(var176)) {
                    var173 = (SubLObject)module0795.T;
                }
            }
            return var173;
        }
        return (SubLObject)module0795.NIL;
    }
    
    public static SubLObject f50919(final SubLObject var172) {
        final SubLThread var173 = SubLProcess.currentSubLThread();
        final SubLObject var174 = module0034.$g879$.getDynamicValue(var173);
        SubLObject var175 = (SubLObject)module0795.NIL;
        if (module0795.NIL == var174) {
            return f50922(var172);
        }
        var175 = module0034.f1857(var174, (SubLObject)module0795.$ic124$, (SubLObject)module0795.UNPROVIDED);
        if (module0795.NIL == var175) {
            var175 = module0034.f1807(module0034.f1842(var174), (SubLObject)module0795.$ic124$, (SubLObject)module0795.ONE_INTEGER, (SubLObject)module0795.NIL, (SubLObject)module0795.EQL, (SubLObject)module0795.UNPROVIDED);
            module0034.f1860(var174, (SubLObject)module0795.$ic124$, var175);
        }
        SubLObject var176 = module0034.f1814(var175, var172, (SubLObject)module0795.$ic123$);
        if (var176 == module0795.$ic123$) {
            var176 = Values.arg2(var173.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f50922(var172)));
            module0034.f1816(var175, var172, var176, (SubLObject)module0795.UNPROVIDED);
        }
        return module0034.f1959(var176);
    }
    
    public static SubLObject f50916(final SubLObject var70) {
        return (SubLObject)ConsesLow.cons((SubLObject)module0795.NIL, f50923(var70));
    }
    
    public static SubLObject f50923(final SubLObject var70) {
        final SubLThread var71 = SubLProcess.currentSubLThread();
        SubLObject var72 = (SubLObject)module0795.NIL;
        final SubLObject var73 = module0147.f9540(module0794.f50824());
        final SubLObject var74 = module0147.$g2095$.currentBinding(var71);
        final SubLObject var75 = module0147.$g2094$.currentBinding(var71);
        final SubLObject var76 = module0147.$g2096$.currentBinding(var71);
        try {
            module0147.$g2095$.bind(module0147.f9545(var73), var71);
            module0147.$g2094$.bind(module0147.f9546(var73), var71);
            module0147.$g2096$.bind(module0147.f9549(var73), var71);
            final SubLObject var77 = module0077.f5313(Symbols.symbol_function((SubLObject)module0795.EQL), (SubLObject)module0795.UNPROVIDED);
            final SubLObject var78 = (SubLObject)module0795.NIL;
            if (module0795.NIL != module0158.f10010(var70, (SubLObject)module0795.NIL, var78)) {
                final SubLObject var79 = module0158.f10011(var70, (SubLObject)module0795.NIL, var78);
                SubLObject var80 = (SubLObject)module0795.NIL;
                final SubLObject var81 = (SubLObject)module0795.NIL;
                while (module0795.NIL == var80) {
                    final SubLObject var82 = module0052.f3695(var79, var81);
                    final SubLObject var83 = (SubLObject)SubLObjectFactory.makeBoolean(!var81.eql(var82));
                    if (module0795.NIL != var83) {
                        SubLObject var84 = (SubLObject)module0795.NIL;
                        try {
                            var84 = module0158.f10316(var82, (SubLObject)module0795.$ic127$, (SubLObject)module0795.$ic128$, (SubLObject)module0795.NIL);
                            SubLObject var181_186 = (SubLObject)module0795.NIL;
                            final SubLObject var182_187 = (SubLObject)module0795.NIL;
                            while (module0795.NIL == var181_186) {
                                final SubLObject var85 = module0052.f3695(var84, var182_187);
                                final SubLObject var184_189 = (SubLObject)SubLObjectFactory.makeBoolean(!var182_187.eql(var85));
                                if (module0795.NIL != var184_189) {
                                    final SubLObject var86 = module0178.f11333(var85);
                                    if (module0795.NIL == module0077.f5320(var86, var77)) {
                                        if (module0795.NIL == f50924(var85, var70, var86)) {
                                            module0077.f5326(var86, var77);
                                        }
                                        else {
                                            var72 = (SubLObject)ConsesLow.cons(var85, var72);
                                        }
                                    }
                                }
                                var181_186 = (SubLObject)SubLObjectFactory.makeBoolean(module0795.NIL == var184_189);
                            }
                        }
                        finally {
                            final SubLObject var7_191 = Threads.$is_thread_performing_cleanupP$.currentBinding(var71);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0795.T, var71);
                                if (module0795.NIL != var84) {
                                    module0158.f10319(var84);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var7_191, var71);
                            }
                        }
                    }
                    var80 = (SubLObject)SubLObjectFactory.makeBoolean(module0795.NIL == var83);
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var76, var71);
            module0147.$g2094$.rebind(var75, var71);
            module0147.$g2095$.rebind(var74, var71);
        }
        if (module0795.NIL != module0795.$g6368$.getDynamicValue(var71)) {
            Functions.apply((SubLObject)module0795.$ic102$, (SubLObject)ConsesLow.cons((SubLObject)module0795.T, (SubLObject)ConsesLow.list((SubLObject)module0795.$ic129$, Sequences.length(var72), var70)));
            streams_high.force_output((SubLObject)module0795.T);
        }
        return var72;
    }
    
    public static SubLObject f50924(final SubLObject var188, final SubLObject var70, SubLObject var190) {
        if (var190 == module0795.UNPROVIDED) {
            var190 = module0178.f11333(var188);
        }
        SubLObject var191 = (SubLObject)module0795.NIL;
        SubLObject var192 = (SubLObject)module0795.NIL;
        SubLObject var193 = (SubLObject)module0795.ZERO_INTEGER;
        SubLObject var195;
        final SubLObject var194 = var195 = module0205.f13207(var188, (SubLObject)module0795.$ic126$);
        SubLObject var196 = (SubLObject)module0795.NIL;
        var196 = var195.first();
        while (module0795.NIL != var195) {
            var193 = Numbers.add(var193, (SubLObject)module0795.ONE_INTEGER);
            final SubLObject var197 = module0217.f14221(var196, var193, var190, (SubLObject)module0795.UNPROVIDED);
            if (var196.eql(var70) && (module0795.NIL == var192 || var197.numL(var192))) {
                var192 = var197;
            }
            else if (module0795.NIL == var191 || var197.numL(var191)) {
                var191 = var197;
            }
            var195 = var195.rest();
            var196 = var195.first();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0795.NIL != var192 && (module0795.NIL == var191 || var192.numLE(var191)));
    }
    
    public static SubLObject f50917(final SubLObject var85, final SubLObject var128) {
        while (module0795.NIL == f50905(var85) && module0795.NIL == f50909(var85, var128)) {
            f50925(var85);
        }
        return var85;
    }
    
    public static SubLObject f50925(final SubLObject var85) {
        final SubLThread var86 = SubLProcess.currentSubLThread();
        final SubLObject var87 = f50893(var85);
        final SubLObject var88 = f50896(var85);
        SubLObject var89 = (SubLObject)module0795.NIL;
        SubLObject var90 = f50926(var88);
        SubLObject var91 = (SubLObject)module0795.NIL;
        SubLObject var92 = (SubLObject)module0795.NIL;
        if (module0795.NIL == var90) {
            var86.resetMultipleValues();
            final SubLObject var201_202 = module0794.f50825(var87);
            final SubLObject var203_204 = var86.secondMultipleValue();
            var86.resetMultipleValues();
            var90 = var201_202;
            var91 = var203_204;
        }
        else if (module0795.NIL == var91) {
            var91 = module0794.f50827(var90, var87);
            if (module0795.NIL == var91) {
                var86.resetMultipleValues();
                final SubLObject var205_206 = module0794.f50825(var87);
                final SubLObject var207_208 = var86.secondMultipleValue();
                var86.resetMultipleValues();
                var90 = var205_206;
                var91 = var207_208;
            }
        }
        SubLObject var93 = (SubLObject)module0795.NIL;
        while (module0795.NIL == var92) {
            if (module0795.NIL != var93) {
                var91 = module0794.f50827(var90, var87);
                if (module0795.NIL == var91) {
                    var86.resetMultipleValues();
                    final SubLObject var210_211 = module0794.f50825(var87);
                    final SubLObject var212_213 = var86.secondMultipleValue();
                    var86.resetMultipleValues();
                    var90 = var210_211;
                    var91 = var212_213;
                }
            }
            if (module0795.NIL != var91) {
                var92 = f50920(var91);
                var93 = (SubLObject)module0795.T;
                module0077.f5326(var91, f50859(var85));
            }
        }
        if (module0795.NIL == var91 || module0795.NIL == var92) {
            f50904(var85);
        }
        else {
            var89 = (SubLObject)ConsesLow.list(var90, var91, var92);
        }
        if (module0795.NIL != var89) {
            module0055.f4021(var89, f50861(var85));
            f50897(var85, var89);
        }
        return var89;
    }
    
    public static SubLObject f50920(final SubLObject var73) {
        final SubLThread var74 = SubLProcess.currentSubLThread();
        SubLObject var75 = (SubLObject)module0795.NIL;
        SubLObject var76 = (SubLObject)module0795.NIL;
        final SubLObject var77 = module0579.$g4287$.currentBinding(var74);
        final SubLObject var78 = Errors.$continue_cerrorP$.currentBinding(var74);
        final SubLObject var79 = module0578.$g4234$.currentBinding(var74);
        try {
            module0579.$g4287$.bind((SubLObject)module0795.ONE_INTEGER, var74);
            Errors.$continue_cerrorP$.bind((SubLObject)module0795.NIL, var74);
            module0578.$g4234$.bind((SubLObject)module0795.T, var74);
            if (module0795.NIL != module0578.f35473()) {
                var75 = module0770.f49058(var73, (SubLObject)module0795.UNPROVIDED, (SubLObject)module0795.UNPROVIDED, (SubLObject)module0795.UNPROVIDED, (SubLObject)module0795.UNPROVIDED, (SubLObject)module0795.UNPROVIDED);
            }
            else {
                try {
                    var74.throwStack.push(module0003.$g3$.getGlobalValue());
                    final SubLObject var7_214 = Errors.$error_handler$.currentBinding(var74);
                    try {
                        Errors.$error_handler$.bind((SubLObject)module0795.$ic53$, var74);
                        try {
                            var75 = module0770.f49058(var73, (SubLObject)module0795.UNPROVIDED, (SubLObject)module0795.UNPROVIDED, (SubLObject)module0795.UNPROVIDED, (SubLObject)module0795.UNPROVIDED, (SubLObject)module0795.UNPROVIDED);
                        }
                        catch (Throwable var80) {
                            Errors.handleThrowable(var80, (SubLObject)module0795.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(var7_214, var74);
                    }
                }
                catch (Throwable var81) {
                    var76 = Errors.handleThrowable(var81, module0003.$g3$.getGlobalValue());
                }
                finally {
                    var74.throwStack.pop();
                }
                if (var76.isString() && module0795.NIL == module0578.f35477()) {
                    Errors.warn(Sequences.cconcatenate(module0752.f47234(var76), (SubLObject)module0795.$ic130$), module0579.f35508());
                }
            }
        }
        finally {
            module0578.$g4234$.rebind(var79, var74);
            Errors.$continue_cerrorP$.rebind(var78, var74);
            module0579.$g4287$.rebind(var77, var74);
        }
        return (SubLObject)((module0795.NIL == var75 || module0795.NIL != f50927(module0751.f46910(var75))) ? module0795.NIL : var75);
    }
    
    public static SubLObject f50927(final SubLObject var215) {
        if (module0795.NIL == module0038.f2653(var215)) {
            return (SubLObject)module0795.T;
        }
        if (module0795.NIL != module0038.f2668(module0129.f8495(), var215, (SubLObject)module0795.UNPROVIDED, (SubLObject)module0795.UNPROVIDED, (SubLObject)module0795.UNPROVIDED)) {
            return (SubLObject)module0795.T;
        }
        return (SubLObject)module0795.NIL;
    }
    
    public static SubLObject f50926(final SubLObject var196) {
        SubLObject var197 = (SubLObject)module0795.NIL;
        final SubLObject var198 = f50928();
        SubLObject var199 = (SubLObject)module0795.NIL;
        SubLObject var200 = (SubLObject)module0795.NIL;
        SubLObject var201 = (SubLObject)module0795.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var196, var196, (SubLObject)module0795.$ic131$);
        var199 = var196.first();
        SubLObject var202 = var196.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var202, var196, (SubLObject)module0795.$ic131$);
        var200 = var202.first();
        var202 = var202.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var202, var196, (SubLObject)module0795.$ic131$);
        var201 = var202.first();
        var202 = var202.rest();
        if (module0795.NIL == var202) {
            final SubLObject var203 = var198;
            if (var203.eql((SubLObject)module0795.$ic132$)) {
                if (module0795.NIL != var200) {
                    final SubLObject var204 = module0205.f13207(module0289.f19396(var200), (SubLObject)module0795.$ic126$);
                    SubLObject var205;
                    SubLObject var206;
                    for (var205 = (SubLObject)module0795.NIL, var205 = var204; module0795.NIL == var197 && module0795.NIL != var205; var205 = var205.rest()) {
                        var206 = var205.first();
                        if (!var206.eql(var199) && module0795.NIL != module0794.f50803(var206, (SubLObject)module0795.UNPROVIDED)) {
                            var197 = var206;
                        }
                    }
                }
                if (module0795.NIL == var197) {
                    var197 = var199;
                }
            }
            else if (var203.eql((SubLObject)module0795.$ic133$)) {
                var197 = var199;
            }
            else {
                var197 = (SubLObject)module0795.NIL;
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var196, (SubLObject)module0795.$ic131$);
        }
        return var197;
    }
    
    public static SubLObject f50928() {
        final SubLObject var221;
        final SubLObject var220 = var221 = random.random((SubLObject)module0795.SIXTEEN_INTEGER);
        if (var221.eql((SubLObject)module0795.ZERO_INTEGER)) {
            return (SubLObject)module0795.$ic134$;
        }
        if (var221.eql((SubLObject)module0795.ONE_INTEGER) || var221.eql((SubLObject)module0795.TWO_INTEGER)) {
            return (SubLObject)module0795.$ic133$;
        }
        return (SubLObject)module0795.$ic132$;
    }
    
    public static SubLObject f50929() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50839", "S#55447", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50840", "S#55448", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50841", "S#55449", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50842", "S#55450", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50845", "S#55451", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50849", "S#55452", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50851", "S#55453", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50850", "S#55454", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50852", "S#55455", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50848", "S#55456", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50843", "S#55457", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50853", "S#55458", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50844", "S#55459", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50857", "S#55460", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50860", "S#55461", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50862", "S#55462", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50863", "S#55463", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50864", "S#55464", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50865", "S#55465", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50866", "S#55466", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50867", "S#55467", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50871", "S#55468", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50872", "S#55469", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50873", "S#55470", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50870", "S#55471", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50869", "S#55472", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50868", "S#55473", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50874", "S#55474", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50858", "S#55475", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50875", "S#55476", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50877", "S#55446", 1, 0, false);
        new $f50877$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50878", "S#55477", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50879", "S#55478", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50880", "S#55479", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50881", "S#55480", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50882", "S#55481", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50883", "S#55482", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50884", "S#55483", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50885", "S#55484", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50886", "S#55485", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50887", "S#55486", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50888", "S#55487", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50889", "S#55488", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50890", "S#55489", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50891", "S#55490", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50892", "S#55491", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50893", "S#55492", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50859", "S#55493", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50894", "S#55494", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50895", "S#55495", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50861", "S#55496", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50896", "S#55497", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50897", "S#55498", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50898", "S#55499", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50899", "S#55500", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50876", "S#55501", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50854", "S#55502", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50901", "S#55503", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50900", "S#55504", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50902", "S#55505", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50904", "S#55506", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50905", "S#55507", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50906", "S#55508", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50907", "S#55509", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50908", "S#55510", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50909", "S#55511", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50910", "S#55512", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0795", "f50912", "S#55513");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50911", "S#55514", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50847", "S#55515", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50855", "S#55516", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50856", "S#55517", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50903", "S#55518", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50913", "S#55519", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50914", "S#55520", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50915", "S#55521", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50918", "S#55522", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50921", "S#55523", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50846", "S#55524", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50922", "S#55525", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50919", "S#55526", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50916", "S#55527", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50923", "S#55528", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50924", "S#55529", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50917", "S#55530", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50925", "S#55531", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50920", "S#55532", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50927", "S#55533", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50926", "S#55534", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0795", "f50928", "S#55535", 0, 0, false);
        return (SubLObject)module0795.NIL;
    }
    
    public static SubLObject f50930() {
        module0795.$g6360$ = SubLFiles.defparameter("S#55536", module0073.f5143((SubLObject)(module0795.$ic34$.isSymbol() ? Symbols.symbol_value((SubLObject)module0795.$ic34$) : module0795.$ic34$), (SubLObject)module0795.$ic35$, (SubLObject)(module0795.$ic36$.isSymbol() ? Symbols.symbol_value((SubLObject)module0795.$ic36$) : module0795.$ic36$), (SubLObject)module0795.$ic37$, (SubLObject)module0795.UNPROVIDED));
        module0795.$g6361$ = SubLFiles.defparameter("S#55537", module0073.f5143((SubLObject)(module0795.$ic38$.isSymbol() ? Symbols.symbol_value((SubLObject)module0795.$ic38$) : module0795.$ic38$), (SubLObject)module0795.$ic39$, (SubLObject)(module0795.$ic40$.isSymbol() ? Symbols.symbol_value((SubLObject)module0795.$ic40$) : module0795.$ic40$), (SubLObject)module0795.$ic37$, (SubLObject)module0795.UNPROVIDED));
        module0795.$g6362$ = SubLFiles.deflexical("S#55538", (SubLObject)((module0795.NIL != Symbols.boundp((SubLObject)module0795.$ic41$)) ? module0795.$g6362$.getGlobalValue() : module0795.NIL));
        module0795.$g6363$ = SubLFiles.deflexical("S#55539", (module0795.NIL != Symbols.boundp((SubLObject)module0795.$ic43$)) ? module0795.$g6363$.getGlobalValue() : module0055.f4017());
        module0795.$g6364$ = SubLFiles.deflexical("S#55540", Locks.make_lock((SubLObject)module0795.$ic44$));
        module0795.$g6365$ = SubLFiles.deflexical("S#55541", (SubLObject)module0795.NINE_INTEGER);
        module0795.$g6366$ = SubLFiles.deflexical("S#55542", (module0795.NIL != Symbols.boundp((SubLObject)module0795.$ic55$)) ? module0795.$g6366$.getGlobalValue() : module0067.f4880((SubLObject)module0795.UNPROVIDED, (SubLObject)module0795.UNPROVIDED));
        module0795.$g6367$ = SubLFiles.defconstant("S#55543", (SubLObject)module0795.$ic56$);
        module0795.$g6368$ = SubLFiles.defparameter("S#55544", (SubLObject)module0795.NIL);
        return (SubLObject)module0795.NIL;
    }
    
    public static SubLObject f50931() {
        module0003.f57((SubLObject)module0795.$ic41$);
        module0003.f57((SubLObject)module0795.$ic43$);
        module0003.f57((SubLObject)module0795.$ic55$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0795.$g6367$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0795.$ic63$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0795.$ic64$);
        Structures.def_csetf((SubLObject)module0795.$ic65$, (SubLObject)module0795.$ic66$);
        Structures.def_csetf((SubLObject)module0795.$ic67$, (SubLObject)module0795.$ic68$);
        Structures.def_csetf((SubLObject)module0795.$ic69$, (SubLObject)module0795.$ic70$);
        Structures.def_csetf((SubLObject)module0795.$ic71$, (SubLObject)module0795.$ic72$);
        Structures.def_csetf((SubLObject)module0795.$ic73$, (SubLObject)module0795.$ic74$);
        Structures.def_csetf((SubLObject)module0795.$ic75$, (SubLObject)module0795.$ic76$);
        Equality.identity((SubLObject)module0795.$ic56$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0795.$g6367$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0795.$ic88$));
        module0012.f419((SubLObject)module0795.$ic62$);
        module0034.f1895((SubLObject)module0795.$ic122$);
        module0034.f1895((SubLObject)module0795.$ic124$);
        return (SubLObject)module0795.NIL;
    }
    
    public void declareFunctions() {
        f50929();
    }
    
    public void initializeVariables() {
        f50930();
    }
    
    public void runTopLevelForms() {
        f50931();
    }
    
    static {
        me = (SubLFile)new module0795();
        module0795.$g6360$ = null;
        module0795.$g6361$ = null;
        module0795.$g6362$ = null;
        module0795.$g6363$ = null;
        module0795.$g6364$ = null;
        module0795.$g6365$ = null;
        module0795.$g6366$ = null;
        module0795.$g6367$ = null;
        module0795.$g6368$ = null;
        $ic0$ = ConsesLow.list((SubLObject)module0795.NIL, (SubLObject)module0795.NIL, (SubLObject)module0795.NIL);
        $ic1$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#50666", "CYC")));
        $ic2$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Guest"));
        $ic3$ = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $ic4$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic5$ = SubLObjectFactory.makeKeyword("OUTPUT");
        $ic6$ = SubLObjectFactory.makeString("Unable to open ~S");
        $ic7$ = SubLObjectFactory.makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic8$ = SubLObjectFactory.makeString("Generating ");
        $ic9$ = SubLObjectFactory.makeString(" random thoughts...");
        $ic10$ = SubLObjectFactory.makeString("random-thoughts");
        $ic11$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOW"), (SubLObject)module0795.NIL);
        $ic12$ = SubLObjectFactory.makeString("thoughts");
        $ic13$ = SubLObjectFactory.makeString("Exporting random thoughts to ");
        $ic14$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic15$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("US#352B2C1"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#13A2892"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#1160044"));
        $ic16$ = SubLObjectFactory.makeString("Parsing XML stream...");
        $ic17$ = SubLObjectFactory.makeString("thoughts-about");
        $ic18$ = SubLObjectFactory.makeString("topic-id");
        $ic19$ = SubLObjectFactory.makeString("thought");
        $ic20$ = SubLObjectFactory.makeString("Expected 'thought', got ~S");
        $ic21$ = SubLObjectFactory.makeString("assertion-id");
        $ic22$ = SubLObjectFactory.makeString("paraphrase");
        $ic23$ = SubLObjectFactory.makeString("string");
        $ic24$ = SubLObjectFactory.makeString(";~%~%");
        $ic25$ = SubLObjectFactory.makeString(",~%");
        $ic26$ = SubLObjectFactory.makeString("INSERT INTO THOUGHTS(INTERNAL_ID, TERM_EID, TERM_CYCL, ASRTN_EID, ASRTN_CYCL_SENTENCE, ASRTN_MT, ASRTN_PARAPHRASE) VALUES");
        $ic27$ = SubLObjectFactory.makeString(" (~D, '~A', '~A', '~A', '~A', '~A', '~A')");
        $ic28$ = SubLObjectFactory.makeString("'");
        $ic29$ = SubLObjectFactory.makeString("''");
        $ic30$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic31$ = SubLObjectFactory.makeString("term");
        $ic32$ = SubLObjectFactory.makeSymbol("S#55458", "CYC");
        $ic33$ = SubLObjectFactory.makeKeyword("TOPIC");
        $ic34$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("external.random-thought-server.host"));
        $ic35$ = SubLObjectFactory.makeSymbol("S#55536", "CYC");
        $ic36$ = SubLObjectFactory.makeString("random-thoughts.cyc.com");
        $ic37$ = SubLObjectFactory.makeKeyword("PARAMETER");
        $ic38$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("external.random-thought-server.port"));
        $ic39$ = SubLObjectFactory.makeSymbol("S#55537", "CYC");
        $ic40$ = SubLObjectFactory.makeInteger(3634);
        $ic41$ = SubLObjectFactory.makeSymbol("S#55538", "CYC");
        $ic42$ = SubLObjectFactory.makeKeyword("CFASL");
        $ic43$ = SubLObjectFactory.makeSymbol("S#55539", "CYC");
        $ic44$ = SubLObjectFactory.makeString("Remote Random Thought Connection Pool Lock");
        $ic45$ = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $ic46$ = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic47$ = SubLObjectFactory.makeKeyword("NOT-TRIED");
        $ic48$ = SubLObjectFactory.makeSymbol("S#55459", "CYC");
        $ic49$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic50$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic51$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("S#10050", "CYC"), (SubLObject)module0795.T);
        $ic52$ = SubLObjectFactory.makeSymbol("MULTIPLE-VALUE-LIST");
        $ic53$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic54$ = SubLObjectFactory.makeString("Could not open a connection to ~s");
        $ic55$ = SubLObjectFactory.makeSymbol("S#55542", "CYC");
        $ic56$ = SubLObjectFactory.makeSymbol("S#55445", "CYC");
        $ic57$ = SubLObjectFactory.makeSymbol("S#55446", "CYC");
        $ic58$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9126", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#55545", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#55546", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5243", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#55547", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#55548", "CYC"));
        $ic59$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("USER"), (SubLObject)SubLObjectFactory.makeKeyword("DONE-ASSERTIONS"), (SubLObject)SubLObjectFactory.makeKeyword("GENERATOR-THREAD"), (SubLObject)SubLObjectFactory.makeKeyword("QUEUE"), (SubLObject)SubLObjectFactory.makeKeyword("MOST-RECENTLY-ADDED-THOUGHT"), (SubLObject)SubLObjectFactory.makeKeyword("TOPICAL-THOUGHTS"));
        $ic60$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#55477", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#55478", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#55479", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#55480", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#55481", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#55482", "CYC"));
        $ic61$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#55483", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#55484", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#55485", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#55486", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#55487", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#55488", "CYC"));
        $ic62$ = SubLObjectFactory.makeSymbol("S#55501", "CYC");
        $ic63$ = SubLObjectFactory.makeSymbol("S#55476", "CYC");
        $ic64$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#55446", "CYC"));
        $ic65$ = SubLObjectFactory.makeSymbol("S#55477", "CYC");
        $ic66$ = SubLObjectFactory.makeSymbol("S#55483", "CYC");
        $ic67$ = SubLObjectFactory.makeSymbol("S#55478", "CYC");
        $ic68$ = SubLObjectFactory.makeSymbol("S#55484", "CYC");
        $ic69$ = SubLObjectFactory.makeSymbol("S#55479", "CYC");
        $ic70$ = SubLObjectFactory.makeSymbol("S#55485", "CYC");
        $ic71$ = SubLObjectFactory.makeSymbol("S#55480", "CYC");
        $ic72$ = SubLObjectFactory.makeSymbol("S#55486", "CYC");
        $ic73$ = SubLObjectFactory.makeSymbol("S#55481", "CYC");
        $ic74$ = SubLObjectFactory.makeSymbol("S#55487", "CYC");
        $ic75$ = SubLObjectFactory.makeSymbol("S#55482", "CYC");
        $ic76$ = SubLObjectFactory.makeSymbol("S#55488", "CYC");
        $ic77$ = SubLObjectFactory.makeKeyword("USER");
        $ic78$ = SubLObjectFactory.makeKeyword("DONE-ASSERTIONS");
        $ic79$ = SubLObjectFactory.makeKeyword("GENERATOR-THREAD");
        $ic80$ = SubLObjectFactory.makeKeyword("QUEUE");
        $ic81$ = SubLObjectFactory.makeKeyword("MOST-RECENTLY-ADDED-THOUGHT");
        $ic82$ = SubLObjectFactory.makeKeyword("TOPICAL-THOUGHTS");
        $ic83$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic84$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic85$ = SubLObjectFactory.makeSymbol("S#55489", "CYC");
        $ic86$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic87$ = SubLObjectFactory.makeKeyword("END");
        $ic88$ = SubLObjectFactory.makeSymbol("S#55491", "CYC");
        $ic89$ = SubLObjectFactory.makeString("#<RTG for ~S (~S done ~A)>");
        $ic90$ = SubLObjectFactory.makeString(" queued");
        $ic91$ = SubLObjectFactory.makeString("exhausted");
        $ic92$ = SubLObjectFactory.makeKeyword("EXHAUSTED");
        $ic93$ = SubLObjectFactory.makeKeyword("NEW-TOPIC");
        $ic94$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#38925", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#105", "CYC"));
        $ic95$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic96$ = SubLObjectFactory.makeSymbol("S#55544", "CYC");
        $ic97$ = SubLObjectFactory.makeSymbol("APPLY");
        $ic98$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FORMAT"));
        $ic99$ = SubLObjectFactory.makeSymbol("CONS");
        $ic100$ = SubLObjectFactory.makeSymbol("LIST");
        $ic101$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORCE-OUTPUT"), (SubLObject)module0795.T));
        $ic102$ = SubLObjectFactory.makeSymbol("FORMAT");
        $ic103$ = SubLObjectFactory.makeString("~&Registering interest of ~S in ~S~%");
        $ic104$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOW"), (SubLObject)module0795.NIL, (SubLObject)SubLObjectFactory.makeKeyword("REQUIRE-TOPICAL?"), (SubLObject)module0795.T);
        $ic105$ = SubLObjectFactory.makeKeyword("NOW");
        $ic106$ = SubLObjectFactory.makeKeyword("REQUIRE-TOPICAL?");
        $ic107$ = SubLObjectFactory.makeString("~&Waiting for new thoughts about ~S~%");
        $ic108$ = (SubLFloat)SubLObjectFactory.makeDouble(0.5);
        $ic109$ = SubLObjectFactory.makeString("~&~A out of thoughts about ~S~%");
        $ic110$ = SubLObjectFactory.makeString("Totally");
        $ic111$ = SubLObjectFactory.makeString("Temporarily");
        $ic112$ = SubLObjectFactory.makeString("Random Thought Generator");
        $ic113$ = SubLObjectFactory.makeSymbol("S#55519", "CYC");
        $ic114$ = SubLObjectFactory.makeInteger(25);
        $ic115$ = (SubLFloat)SubLObjectFactory.makeDouble(1.5);
        $ic116$ = SubLObjectFactory.makeInteger(1000);
        $ic117$ = SubLObjectFactory.makeString("~&Filling ~S~%");
        $ic118$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#43314", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#55549", "CYC"));
        $ic119$ = SubLObjectFactory.makeString("~&~S is now full~%");
        $ic120$ = SubLObjectFactory.makeString("~S is not in an updatable state");
        $ic121$ = SubLObjectFactory.makeString("~&New thought concerning ~S:~% ~S~%");
        $ic122$ = SubLObjectFactory.makeSymbol("S#55524", "CYC");
        $ic123$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic124$ = SubLObjectFactory.makeSymbol("S#55526", "CYC");
        $ic125$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("PotentiallyPornRelated"));
        $ic126$ = SubLObjectFactory.makeKeyword("IGNORE");
        $ic127$ = SubLObjectFactory.makeKeyword("GAF");
        $ic128$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic129$ = SubLObjectFactory.makeString("~&Found ~S GAF assertions about ~S~%");
        $ic130$ = SubLObjectFactory.makeString("~% Top-level CycL: ~S");
        $ic131$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#55550", "CYC"));
        $ic132$ = SubLObjectFactory.makeKeyword("NEW-ARG-FROM-ASSERTION");
        $ic133$ = SubLObjectFactory.makeKeyword("REUSE-MOST-RECENTLY-ADDED-TOPIC");
        $ic134$ = SubLObjectFactory.makeKeyword("RANDOM");
    }
    
    public static final class $sX55445_native extends SubLStructNative
    {
        public SubLObject $user;
        public SubLObject $done_assertions;
        public SubLObject $generator_thread;
        public SubLObject $queue;
        public SubLObject $most_recently_added_thought;
        public SubLObject $topical_thoughts;
        private static final SubLStructDeclNative structDecl;
        
        public $sX55445_native() {
            this.$user = (SubLObject)CommonSymbols.NIL;
            this.$done_assertions = (SubLObject)CommonSymbols.NIL;
            this.$generator_thread = (SubLObject)CommonSymbols.NIL;
            this.$queue = (SubLObject)CommonSymbols.NIL;
            this.$most_recently_added_thought = (SubLObject)CommonSymbols.NIL;
            this.$topical_thoughts = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX55445_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$user;
        }
        
        public SubLObject getField3() {
            return this.$done_assertions;
        }
        
        public SubLObject getField4() {
            return this.$generator_thread;
        }
        
        public SubLObject getField5() {
            return this.$queue;
        }
        
        public SubLObject getField6() {
            return this.$most_recently_added_thought;
        }
        
        public SubLObject getField7() {
            return this.$topical_thoughts;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$user = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$done_assertions = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$generator_thread = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$queue = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$most_recently_added_thought = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$topical_thoughts = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX55445_native.class, module0795.$ic56$, module0795.$ic57$, module0795.$ic58$, module0795.$ic59$, new String[] { "$user", "$done_assertions", "$generator_thread", "$queue", "$most_recently_added_thought", "$topical_thoughts" }, module0795.$ic60$, module0795.$ic61$, module0795.$ic62$);
        }
    }
    
    public static final class $f50877$UnaryFunction extends UnaryFunction
    {
        public $f50877$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#55446"));
        }
        
        public SubLObject processItem(final SubLObject var114) {
            return module0795.f50877(var114);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0795.class
	Total time: 964 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/