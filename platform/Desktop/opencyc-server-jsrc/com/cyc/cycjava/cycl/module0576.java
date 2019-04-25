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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0576 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0576";
    public static final String myFingerPrint = "dd5356a0ed437d6abb178de9da8071b2d38625c576c60b83444be2875200cb17";
    public static SubLSymbol $g4213$;
    public static SubLSymbol $g4214$;
    public static SubLSymbol $g4215$;
    public static SubLSymbol $g4216$;
    private static SubLSymbol $g4217$;
    public static SubLSymbol $g4218$;
    public static SubLSymbol $g4219$;
    public static SubLSymbol $g4220$;
    public static SubLSymbol $g4221$;
    public static SubLSymbol $g4222$;
    private static SubLSymbol $g4223$;
    private static final SubLInteger $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLString $ic13$;
    private static final SubLString $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLString $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLList $ic20$;
    private static final SubLList $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLString $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLString $ic39$;
    private static final SubLString $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLString $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLString $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLList $ic53$;
    private static final SubLString $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLString $ic56$;
    private static final SubLString $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLString $ic66$;
    private static final SubLList $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLList $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLList $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLString $ic80$;
    private static final SubLString $ic81$;
    private static final SubLString $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLString $ic93$;
    private static final SubLString $ic94$;
    private static final SubLString $ic95$;
    private static final SubLString $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLList $ic99$;
    private static final SubLList $ic100$;
    private static final SubLList $ic101$;
    private static final SubLList $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLList $ic105$;
    private static final SubLSymbol $ic106$;
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
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLString $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLString $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLString $ic129$;
    private static final SubLString $ic130$;
    private static final SubLString $ic131$;
    private static final SubLString $ic132$;
    private static final SubLString $ic133$;
    private static final SubLString $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLString $ic136$;
    private static final SubLString $ic137$;
    private static final SubLString $ic138$;
    private static final SubLString $ic139$;
    private static final SubLString $ic140$;
    private static final SubLString $ic141$;
    private static final SubLList $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLString $ic145$;
    private static final SubLString $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLString $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLObject $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLString $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLSymbol $ic165$;
    private static final SubLList $ic166$;
    private static final SubLString $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLList $ic170$;
    private static final SubLList $ic171$;
    private static final SubLList $ic172$;
    private static final SubLList $ic173$;
    private static final SubLSymbol $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLList $ic176$;
    private static final SubLSymbol $ic177$;
    private static final SubLSymbol $ic178$;
    private static final SubLSymbol $ic179$;
    private static final SubLSymbol $ic180$;
    private static final SubLSymbol $ic181$;
    private static final SubLSymbol $ic182$;
    private static final SubLSymbol $ic183$;
    private static final SubLSymbol $ic184$;
    private static final SubLSymbol $ic185$;
    private static final SubLSymbol $ic186$;
    private static final SubLSymbol $ic187$;
    private static final SubLSymbol $ic188$;
    private static final SubLSymbol $ic189$;
    private static final SubLSymbol $ic190$;
    private static final SubLSymbol $ic191$;
    private static final SubLSymbol $ic192$;
    private static final SubLSymbol $ic193$;
    private static final SubLSymbol $ic194$;
    private static final SubLSymbol $ic195$;
    private static final SubLSymbol $ic196$;
    private static final SubLSymbol $ic197$;
    private static final SubLSymbol $ic198$;
    private static final SubLSymbol $ic199$;
    private static final SubLSymbol $ic200$;
    private static final SubLSymbol $ic201$;
    private static final SubLList $ic202$;
    private static final SubLSymbol $ic203$;
    private static final SubLList $ic204$;
    private static final SubLSymbol $ic205$;
    private static final SubLList $ic206$;
    private static final SubLSymbol $ic207$;
    private static final SubLList $ic208$;
    private static final SubLSymbol $ic209$;
    private static final SubLList $ic210$;
    private static final SubLSymbol $ic211$;
    private static final SubLSymbol $ic212$;
    private static final SubLSymbol $ic213$;
    private static final SubLSymbol $ic214$;
    private static final SubLSymbol $ic215$;
    private static final SubLString $ic216$;
    private static final SubLString $ic217$;
    private static final SubLString $ic218$;
    private static final SubLString $ic219$;
    private static final SubLString $ic220$;
    private static final SubLString $ic221$;
    private static final SubLString $ic222$;
    private static final SubLList $ic223$;
    private static final SubLString $ic224$;
    private static final SubLString $ic225$;
    private static final SubLSymbol $ic226$;
    private static final SubLSymbol $ic227$;
    private static final SubLSymbol $ic228$;
    private static final SubLSymbol $ic229$;
    private static final SubLSymbol $ic230$;
    private static final SubLString $ic231$;
    private static final SubLString $ic232$;
    private static final SubLString $ic233$;
    private static final SubLString $ic234$;
    private static final SubLString $ic235$;
    
    public static SubLObject f35301(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0576.$ic1$, (SubLObject)module0576.$ic2$, ConsesLow.append(var5, (SubLObject)module0576.NIL));
    }
    
    public static SubLObject f35302(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0576.$ic3$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0576.NIL;
        SubLObject var7 = (SubLObject)module0576.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0576.$ic3$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0576.$ic3$);
        var7 = var4.first();
        var4 = var4.rest();
        if (module0576.NIL == var4) {
            final SubLObject var8;
            var4 = (var8 = var5);
            final SubLObject var9 = (SubLObject)module0576.$ic4$;
            return (SubLObject)ConsesLow.list((SubLObject)module0576.$ic5$, (SubLObject)ConsesLow.list(reader.bq_cons(var9, (SubLObject)module0576.$ic6$)), (SubLObject)ConsesLow.list((SubLObject)module0576.$ic7$, var7, reader.bq_cons((SubLObject)module0576.$ic8$, ConsesLow.append(var8, (SubLObject)module0576.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0576.$ic9$, var9), (SubLObject)ConsesLow.list((SubLObject)module0576.$ic10$, var9, var6)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0576.$ic3$);
        return (SubLObject)module0576.NIL;
    }
    
    public static SubLObject f35303(final SubLObject var12) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0576.NIL != constant_handles_oc.f8449(var12) && module0576.NIL == module0533.f33218(var12) && module0576.NIL == module0269.f17801(var12));
    }
    
    public static SubLObject f35304(final SubLObject var13) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0576.NIL != assertion_handles_oc.f11035(var13) && module0576.NIL != module0178.f11375(var13) && module0576.NIL == module0228.f15208(var13) && module0576.NIL == module0035.f2439((SubLObject)module0576.$ic11$, module0178.f11289(var13), (SubLObject)module0576.UNPROVIDED));
    }
    
    public static SubLObject f35305(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = Sequences.cconcatenate((SubLObject)module0576.$ic13$, new SubLObject[] { module0006.f203(var14), module0576.$ic14$ });
        final SubLObject var17 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(var15);
        final SubLObject var18 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(var15);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind(module0576.$g4214$.getDynamicValue(var15), var15);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(var15), var15);
            SubLObject var19 = (SubLObject)module0576.NIL;
            try {
                final SubLObject var16_19 = stream_macros.$stream_requires_locking$.currentBinding(var15);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0576.NIL, var15);
                    var19 = compatibility.open_binary(var14, (SubLObject)module0576.$ic15$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var16_19, var15);
                }
                if (!var19.isStream()) {
                    Errors.error((SubLObject)module0576.$ic16$, var14);
                }
                final SubLObject var20 = var19;
                module0021.f1038(module0107.f7573(), var20);
                module0021.f1038(constant_handles_oc.f8433(), var20);
                final SubLObject var21 = constant_handles_oc.f8425();
                final SubLObject var22 = var16;
                final SubLObject var23 = module0065.f4733(var21);
                SubLObject var24 = (SubLObject)module0576.ZERO_INTEGER;
                assert module0576.NIL != Types.stringp(var22) : var22;
                final SubLObject var16_20 = module0012.$g75$.currentBinding(var15);
                final SubLObject var17_26 = module0012.$g76$.currentBinding(var15);
                final SubLObject var25 = module0012.$g77$.currentBinding(var15);
                final SubLObject var26 = module0012.$g78$.currentBinding(var15);
                try {
                    module0012.$g75$.bind((SubLObject)module0576.ZERO_INTEGER, var15);
                    module0012.$g76$.bind((SubLObject)module0576.NIL, var15);
                    module0012.$g77$.bind((SubLObject)module0576.T, var15);
                    module0012.$g78$.bind(Time.get_universal_time(), var15);
                    module0012.f478(var22);
                    final SubLObject var29_30 = var21;
                    if (module0576.NIL == module0065.f4772(var29_30, (SubLObject)module0576.$ic18$)) {
                        final SubLObject var31_32 = var29_30;
                        if (module0576.NIL == module0065.f4775(var31_32, (SubLObject)module0576.$ic18$)) {
                            final SubLObject var27 = module0065.f4740(var31_32);
                            final SubLObject var28 = (SubLObject)module0576.NIL;
                            SubLObject var29;
                            SubLObject var30;
                            SubLObject var31;
                            SubLObject var32;
                            for (var29 = Sequences.length(var27), var30 = (SubLObject)module0576.NIL, var30 = (SubLObject)module0576.ZERO_INTEGER; var30.numL(var29); var30 = Numbers.add(var30, (SubLObject)module0576.ONE_INTEGER)) {
                                var31 = ((module0576.NIL != var28) ? Numbers.subtract(var29, var30, (SubLObject)module0576.ONE_INTEGER) : var30);
                                var32 = Vectors.aref(var27, var31);
                                if (module0576.NIL == module0065.f4749(var32) || module0576.NIL == module0065.f4773((SubLObject)module0576.$ic18$)) {
                                    if (module0576.NIL != module0065.f4749(var32)) {
                                        var32 = (SubLObject)module0576.$ic18$;
                                    }
                                    module0012.note_percent_progress(var24, var23);
                                    var24 = Numbers.add(var24, (SubLObject)module0576.ONE_INTEGER);
                                    if (module0576.NIL != f35303(var32)) {
                                        module0021.f1038(constant_handles_oc.f8440(var32), var20);
                                        module0021.f1038(constants_high_oc.f10743(var32), var20);
                                        module0021.f1038(constants_high_oc.f10744(var32), var20);
                                    }
                                }
                            }
                        }
                        final SubLObject var39_40 = var29_30;
                        if (module0576.NIL == module0065.f4777(var39_40) || module0576.NIL == module0065.f4773((SubLObject)module0576.$ic18$)) {
                            final SubLObject var33 = module0065.f4738(var39_40);
                            SubLObject var34 = module0065.f4739(var39_40);
                            final SubLObject var35 = module0065.f4734(var39_40);
                            final SubLObject var36 = (SubLObject)((module0576.NIL != module0065.f4773((SubLObject)module0576.$ic18$)) ? module0576.NIL : module0576.$ic18$);
                            while (var34.numL(var35)) {
                                final SubLObject var37 = Hashtables.gethash_without_values(var34, var33, var36);
                                if (module0576.NIL == module0065.f4773((SubLObject)module0576.$ic18$) || module0576.NIL == module0065.f4749(var37)) {
                                    module0012.note_percent_progress(var24, var23);
                                    var24 = Numbers.add(var24, (SubLObject)module0576.ONE_INTEGER);
                                    if (module0576.NIL != f35303(var37)) {
                                        module0021.f1038(constant_handles_oc.f8440(var37), var20);
                                        module0021.f1038(constants_high_oc.f10743(var37), var20);
                                        module0021.f1038(constants_high_oc.f10744(var37), var20);
                                    }
                                }
                                var34 = Numbers.add(var34, (SubLObject)module0576.ONE_INTEGER);
                            }
                        }
                    }
                    module0012.f479();
                }
                finally {
                    module0012.$g78$.rebind(var26, var15);
                    module0012.$g77$.rebind(var25, var15);
                    module0012.$g76$.rebind(var17_26, var15);
                    module0012.$g75$.rebind(var16_20, var15);
                }
                module0021.f1038((SubLObject)module0576.NIL, var20);
                module0021.f1038((SubLObject)module0576.NIL, var20);
                module0021.f1038((SubLObject)module0576.NIL, var20);
            }
            finally {
                final SubLObject var16_21 = Threads.$is_thread_performing_cleanupP$.currentBinding(var15);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0576.T, var15);
                    if (var19.isStream()) {
                        streams_high.close(var19, (SubLObject)module0576.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var16_21, var15);
                }
            }
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(var18, var15);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(var17, var15);
        }
        return var14;
    }
    
    public static SubLObject f35306(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0576.$ic20$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0576.NIL;
        SubLObject var7 = (SubLObject)module0576.NIL;
        SubLObject var8 = (SubLObject)module0576.NIL;
        SubLObject var9 = (SubLObject)module0576.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0576.$ic20$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0576.$ic20$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0576.$ic20$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0576.$ic20$);
        var9 = var4.first();
        var4 = var4.rest();
        SubLObject var10 = (SubLObject)module0576.NIL;
        SubLObject var11 = var4;
        SubLObject var12 = (SubLObject)module0576.NIL;
        SubLObject var54_55 = (SubLObject)module0576.NIL;
        while (module0576.NIL != var11) {
            cdestructuring_bind.destructuring_bind_must_consp(var11, var3, (SubLObject)module0576.$ic20$);
            var54_55 = var11.first();
            var11 = var11.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var11, var3, (SubLObject)module0576.$ic20$);
            if (module0576.NIL == conses_high.member(var54_55, (SubLObject)module0576.$ic21$, (SubLObject)module0576.UNPROVIDED, (SubLObject)module0576.UNPROVIDED)) {
                var12 = (SubLObject)module0576.T;
            }
            if (var54_55 == module0576.$ic22$) {
                var10 = var11.first();
            }
            var11 = var11.rest();
        }
        if (module0576.NIL != var12 && module0576.NIL == var10) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0576.$ic20$);
        }
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)module0576.$ic23$, var4);
        final SubLObject var14 = (SubLObject)((module0576.NIL != var13) ? conses_high.cadr(var13) : module0576.NIL);
        final SubLObject var15;
        var4 = (var15 = var5);
        final SubLObject var16 = (SubLObject)module0576.$ic24$;
        final SubLObject var17 = (SubLObject)module0576.$ic25$;
        final SubLObject var18 = (SubLObject)module0576.$ic26$;
        return (SubLObject)ConsesLow.list((SubLObject)module0576.$ic27$, (SubLObject)ConsesLow.list((SubLObject)module0576.$ic28$, (SubLObject)ConsesLow.listS(var16, var9, (SubLObject)module0576.$ic29$), (SubLObject)ConsesLow.list((SubLObject)module0576.$ic30$, var16), (SubLObject)ConsesLow.list((SubLObject)module0576.$ic5$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var17, (SubLObject)ConsesLow.list((SubLObject)module0576.$ic30$, var16)), (SubLObject)ConsesLow.list(var18, (SubLObject)ConsesLow.list((SubLObject)module0576.$ic31$, (SubLObject)ConsesLow.list((SubLObject)module0576.$ic32$, var14), (SubLObject)ConsesLow.list((SubLObject)module0576.$ic33$, (SubLObject)module0576.$ic34$, var9), var14))), (SubLObject)ConsesLow.list((SubLObject)module0576.$ic35$, (SubLObject)ConsesLow.list(var17, var18), (SubLObject)ConsesLow.list((SubLObject)module0576.$ic36$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)module0576.$ic30$, var16), (SubLObject)ConsesLow.list((SubLObject)module0576.$ic30$, var16)), (SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.list((SubLObject)module0576.$ic30$, var16), (SubLObject)ConsesLow.list((SubLObject)module0576.$ic30$, var16)), (SubLObject)ConsesLow.list(var8, (SubLObject)ConsesLow.list((SubLObject)module0576.$ic30$, var16), (SubLObject)ConsesLow.list((SubLObject)module0576.$ic30$, var16))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0576.$ic32$, var8)), (SubLObject)ConsesLow.list((SubLObject)module0576.$ic37$, (SubLObject)ConsesLow.list((SubLObject)module0576.$ic38$, var6), (SubLObject)module0576.$ic39$, var6, var16), (SubLObject)ConsesLow.list((SubLObject)module0576.$ic37$, (SubLObject)ConsesLow.list((SubLObject)module0576.$ic17$, var7), (SubLObject)module0576.$ic40$, var7, var16), (SubLObject)ConsesLow.list((SubLObject)module0576.$ic37$, (SubLObject)ConsesLow.list((SubLObject)module0576.$ic41$, var8), (SubLObject)module0576.$ic42$, var8, var16), (SubLObject)ConsesLow.list((SubLObject)module0576.$ic10$, var6, var17), reader.bq_cons((SubLObject)module0576.$ic8$, ConsesLow.append(var15, (SubLObject)module0576.NIL)))))));
    }
    
    public static SubLObject f35307(final SubLObject var60) {
        final SubLThread var61 = SubLProcess.currentSubLThread();
        final SubLObject var62 = Sequences.cconcatenate((SubLObject)module0576.$ic44$, new SubLObject[] { module0006.f203(var60), module0576.$ic14$ });
        final SubLObject var63 = f35308(var60);
        final SubLObject var64 = f35309(var60);
        final SubLObject var65 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(var61);
        final SubLObject var66 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(var61);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind(module0576.$g4214$.getDynamicValue(var61), var61);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(var61), var61);
            SubLObject var67 = (SubLObject)module0576.NIL;
            try {
                final SubLObject var16_64 = stream_macros.$stream_requires_locking$.currentBinding(var61);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0576.NIL, var61);
                    var67 = compatibility.open_binary(var63, (SubLObject)module0576.$ic15$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var16_64, var61);
                }
                if (!var67.isStream()) {
                    Errors.error((SubLObject)module0576.$ic16$, var63);
                }
                final SubLObject var68 = var67;
                SubLObject var66_67 = (SubLObject)module0576.NIL;
                try {
                    final SubLObject var16_65 = stream_macros.$stream_requires_locking$.currentBinding(var61);
                    try {
                        stream_macros.$stream_requires_locking$.bind((SubLObject)module0576.NIL, var61);
                        var66_67 = compatibility.open_binary(var64, (SubLObject)module0576.$ic15$);
                    }
                    finally {
                        stream_macros.$stream_requires_locking$.rebind(var16_65, var61);
                    }
                    if (!var66_67.isStream()) {
                        Errors.error((SubLObject)module0576.$ic16$, var64);
                    }
                    final SubLObject var69 = var66_67;
                    final SubLObject var70 = module0095.f6846(var69, var68);
                    module0021.f1038(module0107.f7573(), var69);
                    module0021.f1038(assertion_handles_oc.f11019(), var69);
                    module0021.f1038((SubLObject)module0576.T, var69);
                    final SubLObject var71 = assertion_handles_oc.f11010();
                    final SubLObject var72 = var62;
                    final SubLObject var73 = module0065.f4733(var71);
                    SubLObject var74 = (SubLObject)module0576.ZERO_INTEGER;
                    assert module0576.NIL != Types.stringp(var72) : var72;
                    final SubLObject var16_66 = module0012.$g75$.currentBinding(var61);
                    final SubLObject var17_72 = module0012.$g76$.currentBinding(var61);
                    final SubLObject var75 = module0012.$g77$.currentBinding(var61);
                    final SubLObject var76 = module0012.$g78$.currentBinding(var61);
                    try {
                        module0012.$g75$.bind((SubLObject)module0576.ZERO_INTEGER, var61);
                        module0012.$g76$.bind((SubLObject)module0576.NIL, var61);
                        module0012.$g77$.bind((SubLObject)module0576.T, var61);
                        module0012.$g78$.bind(Time.get_universal_time(), var61);
                        module0012.f478(var72);
                        final SubLObject var29_73 = var71;
                        if (module0576.NIL == module0065.f4772(var29_73, (SubLObject)module0576.$ic18$)) {
                            final SubLObject var31_74 = var29_73;
                            if (module0576.NIL == module0065.f4775(var31_74, (SubLObject)module0576.$ic18$)) {
                                final SubLObject var77 = module0065.f4740(var31_74);
                                final SubLObject var78 = (SubLObject)module0576.NIL;
                                SubLObject var79;
                                SubLObject var80;
                                SubLObject var81;
                                SubLObject var82;
                                for (var79 = Sequences.length(var77), var80 = (SubLObject)module0576.NIL, var80 = (SubLObject)module0576.ZERO_INTEGER; var80.numL(var79); var80 = Numbers.add(var80, (SubLObject)module0576.ONE_INTEGER)) {
                                    var81 = ((module0576.NIL != var78) ? Numbers.subtract(var79, var80, (SubLObject)module0576.ONE_INTEGER) : var80);
                                    var82 = Vectors.aref(var77, var81);
                                    if (module0576.NIL == module0065.f4749(var82) || module0576.NIL == module0065.f4773((SubLObject)module0576.$ic18$)) {
                                        if (module0576.NIL != module0065.f4749(var82)) {
                                            var82 = (SubLObject)module0576.$ic18$;
                                        }
                                        module0012.note_percent_progress(var74, var73);
                                        var74 = Numbers.add(var74, (SubLObject)module0576.ONE_INTEGER);
                                        if (module0576.NIL != f35304(var82)) {
                                            module0095.f6862(var70);
                                            module0021.f1038(assertion_handles_oc.f11025(var82), var69);
                                            module0021.f1038(f35310(var82), var69);
                                        }
                                    }
                                }
                            }
                            final SubLObject var39_76 = var29_73;
                            if (module0576.NIL == module0065.f4777(var39_76) || module0576.NIL == module0065.f4773((SubLObject)module0576.$ic18$)) {
                                final SubLObject var83 = module0065.f4738(var39_76);
                                SubLObject var84 = module0065.f4739(var39_76);
                                final SubLObject var85 = module0065.f4734(var39_76);
                                final SubLObject var86 = (SubLObject)((module0576.NIL != module0065.f4773((SubLObject)module0576.$ic18$)) ? module0576.NIL : module0576.$ic18$);
                                while (var84.numL(var85)) {
                                    final SubLObject var87 = Hashtables.gethash_without_values(var84, var83, var86);
                                    if (module0576.NIL == module0065.f4773((SubLObject)module0576.$ic18$) || module0576.NIL == module0065.f4749(var87)) {
                                        module0012.note_percent_progress(var74, var73);
                                        var74 = Numbers.add(var74, (SubLObject)module0576.ONE_INTEGER);
                                        if (module0576.NIL != f35304(var87)) {
                                            module0095.f6862(var70);
                                            module0021.f1038(assertion_handles_oc.f11025(var87), var69);
                                            module0021.f1038(f35310(var87), var69);
                                        }
                                    }
                                    var84 = Numbers.add(var84, (SubLObject)module0576.ONE_INTEGER);
                                }
                            }
                        }
                        module0012.f479();
                    }
                    finally {
                        module0012.$g78$.rebind(var76, var61);
                        module0012.$g77$.rebind(var75, var61);
                        module0012.$g76$.rebind(var17_72, var61);
                        module0012.$g75$.rebind(var16_66, var61);
                    }
                }
                finally {
                    final SubLObject var16_67 = Threads.$is_thread_performing_cleanupP$.currentBinding(var61);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0576.T, var61);
                        if (var66_67.isStream()) {
                            streams_high.close(var66_67, (SubLObject)module0576.UNPROVIDED);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var16_67, var61);
                    }
                }
            }
            finally {
                final SubLObject var16_68 = Threads.$is_thread_performing_cleanupP$.currentBinding(var61);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0576.T, var61);
                    if (var67.isStream()) {
                        streams_high.close(var67, (SubLObject)module0576.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var16_68, var61);
                }
            }
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(var66, var61);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(var65, var61);
        }
        return Values.values(var63, var64);
    }
    
    public static SubLObject f35308(final SubLObject var60) {
        return Sequences.cconcatenate(module0006.f203(var60), (SubLObject)module0576.$ic45$);
    }
    
    public static SubLObject f35309(final SubLObject var60) {
        return Sequences.cconcatenate(var60, (SubLObject)module0576.$ic46$);
    }
    
    public static SubLObject f35310(final SubLObject var13) {
        final SubLObject var14 = module0290.f19497(var13);
        final SubLObject var15 = module0290.f19505(var14);
        final SubLObject var16 = module0036.f2532(var15, (SubLObject)module0576.$ic41$, (SubLObject)module0576.$ic48$, (SubLObject)module0576.UNPROVIDED, (SubLObject)module0576.UNPROVIDED, (SubLObject)module0576.UNPROVIDED);
        return var16;
    }
    
    public static SubLObject f35311(final SubLObject var82) {
        return module0036.f2531(var82, (SubLObject)module0576.$ic50$, (SubLObject)module0576.$ic51$, (SubLObject)module0576.UNPROVIDED);
    }
    
    public static SubLObject f35312(final SubLObject var50) {
        return (SubLObject)ConsesLow.list((SubLObject)module0576.$ic52$, Guids.guid_to_string(var50));
    }
    
    public static SubLObject f35313(final SubLObject var83) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0576.NIL != module0035.f2014(var83) && module0576.NIL != module0035.f1995(var83, (SubLObject)module0576.TWO_INTEGER, (SubLObject)module0576.UNPROVIDED) && module0576.$ic52$ == var83.first() && module0576.NIL != Guids.guid_string_p(conses_high.second(var83)));
    }
    
    public static SubLObject f35314(final SubLObject var84) {
        final SubLThread var85 = SubLProcess.currentSubLThread();
        SubLObject var86 = (SubLObject)module0576.NIL;
        SubLObject var87 = (SubLObject)module0576.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var84, (SubLObject)module0576.$ic53$);
        var86 = var84.first();
        SubLObject var88 = var84.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var88, var84, (SubLObject)module0576.$ic53$);
        var87 = var88.first();
        var88 = var88.rest();
        if (module0576.NIL == var88) {
            if (module0576.NIL == Errors.$ignore_mustsP$.getDynamicValue(var85) && module0576.$ic52$ != var86) {
                Errors.error((SubLObject)module0576.$ic54$, var84);
            }
            return Guids.string_to_guid(var87);
        }
        cdestructuring_bind.cdestructuring_bind_error(var84, (SubLObject)module0576.$ic53$);
        return (SubLObject)module0576.NIL;
    }
    
    public static SubLObject f35315(SubLObject var10) {
        if (var10 == module0576.UNPROVIDED) {
            var10 = (SubLObject)module0576.NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        SubLObject var12 = (SubLObject)module0576.ZERO_INTEGER;
        SubLObject var13 = (SubLObject)module0576.NIL;
        if (!var10.isString()) {
            var10 = (SubLObject)module0576.$ic56$;
        }
        final SubLObject var14 = assertion_handles_oc.f11010();
        final SubLObject var15 = var10;
        final SubLObject var16 = module0065.f4733(var14);
        SubLObject var17 = (SubLObject)module0576.ZERO_INTEGER;
        assert module0576.NIL != Types.stringp(var15) : var15;
        final SubLObject var18 = module0012.$g75$.currentBinding(var11);
        final SubLObject var19 = module0012.$g76$.currentBinding(var11);
        final SubLObject var20 = module0012.$g77$.currentBinding(var11);
        final SubLObject var21 = module0012.$g78$.currentBinding(var11);
        try {
            module0012.$g75$.bind((SubLObject)module0576.ZERO_INTEGER, var11);
            module0012.$g76$.bind((SubLObject)module0576.NIL, var11);
            module0012.$g77$.bind((SubLObject)module0576.T, var11);
            module0012.$g78$.bind(Time.get_universal_time(), var11);
            module0012.f478(var15);
            final SubLObject var29_90 = var14;
            if (module0576.NIL == module0065.f4772(var29_90, (SubLObject)module0576.$ic18$)) {
                final SubLObject var31_91 = var29_90;
                if (module0576.NIL == module0065.f4775(var31_91, (SubLObject)module0576.$ic18$)) {
                    final SubLObject var22 = module0065.f4740(var31_91);
                    final SubLObject var23 = (SubLObject)module0576.NIL;
                    SubLObject var24;
                    SubLObject var25;
                    SubLObject var26;
                    SubLObject var27;
                    for (var24 = Sequences.length(var22), var25 = (SubLObject)module0576.NIL, var25 = (SubLObject)module0576.ZERO_INTEGER; var25.numL(var24); var25 = Numbers.add(var25, (SubLObject)module0576.ONE_INTEGER)) {
                        var26 = ((module0576.NIL != var23) ? Numbers.subtract(var24, var25, (SubLObject)module0576.ONE_INTEGER) : var25);
                        var27 = Vectors.aref(var22, var26);
                        if (module0576.NIL == module0065.f4749(var27) || module0576.NIL == module0065.f4773((SubLObject)module0576.$ic18$)) {
                            if (module0576.NIL != module0065.f4749(var27)) {
                                var27 = (SubLObject)module0576.$ic18$;
                            }
                            module0012.note_percent_progress(var17, var16);
                            var17 = Numbers.add(var17, (SubLObject)module0576.ONE_INTEGER);
                            if (module0576.NIL != f35304(var27)) {
                                var13 = (SubLObject)ConsesLow.cons(assertion_handles_oc.f11025(var27), var13);
                                var12 = Numbers.add(var12, (SubLObject)module0576.ONE_INTEGER);
                            }
                        }
                    }
                }
                final SubLObject var39_92 = var29_90;
                if (module0576.NIL == module0065.f4777(var39_92) || module0576.NIL == module0065.f4773((SubLObject)module0576.$ic18$)) {
                    final SubLObject var28 = module0065.f4738(var39_92);
                    SubLObject var29 = module0065.f4739(var39_92);
                    final SubLObject var30 = module0065.f4734(var39_92);
                    final SubLObject var31 = (SubLObject)((module0576.NIL != module0065.f4773((SubLObject)module0576.$ic18$)) ? module0576.NIL : module0576.$ic18$);
                    while (var29.numL(var30)) {
                        final SubLObject var32 = Hashtables.gethash_without_values(var29, var28, var31);
                        if (module0576.NIL == module0065.f4773((SubLObject)module0576.$ic18$) || module0576.NIL == module0065.f4749(var32)) {
                            module0012.note_percent_progress(var17, var16);
                            var17 = Numbers.add(var17, (SubLObject)module0576.ONE_INTEGER);
                            if (module0576.NIL != f35304(var32)) {
                                var13 = (SubLObject)ConsesLow.cons(assertion_handles_oc.f11025(var32), var13);
                                var12 = Numbers.add(var12, (SubLObject)module0576.ONE_INTEGER);
                            }
                        }
                        var29 = Numbers.add(var29, (SubLObject)module0576.ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var21, var11);
            module0012.$g77$.rebind(var20, var11);
            module0012.$g76$.rebind(var19, var11);
            module0012.$g75$.rebind(var18, var11);
        }
        final SubLObject var33 = Vectors.make_vector(var12, (SubLObject)module0576.UNPROVIDED);
        SubLObject var34 = var12;
        while (module0576.NIL != module0035.sublisp_boolean(var13)) {
            var34 = Numbers.subtract(var34, (SubLObject)module0576.ONE_INTEGER);
            if (module0576.NIL == Errors.$ignore_mustsP$.getDynamicValue(var11) && module0576.NIL == module0004.f106(var34)) {
                Errors.error((SubLObject)module0576.$ic57$);
            }
            Vectors.set_aref(var33, var34, var13.first());
            var13 = var13.rest();
        }
        return var33;
    }
    
    public static SubLObject f35316(final SubLObject var95, final SubLObject var96, final SubLObject var97) {
        f35317(var96, var97, var95);
        return var97;
    }
    
    public static SubLObject f35318(final SubLObject var97) {
        final SubLThread var98 = SubLProcess.currentSubLThread();
        final SubLObject var99 = Numbers.add((SubLObject)module0576.ONE_INTEGER, module0164.f10677());
        SubLObject var100 = constant_handles_oc.f8425();
        SubLObject var101 = (SubLObject)module0576.$ic60$;
        SubLObject var102 = module0065.f4733(var100);
        SubLObject var103 = (SubLObject)module0576.ZERO_INTEGER;
        assert module0576.NIL != Types.stringp(var101) : var101;
        SubLObject var104 = module0012.$g75$.currentBinding(var98);
        SubLObject var105 = module0012.$g76$.currentBinding(var98);
        SubLObject var106 = module0012.$g77$.currentBinding(var98);
        SubLObject var107 = module0012.$g78$.currentBinding(var98);
        try {
            module0012.$g75$.bind((SubLObject)module0576.ZERO_INTEGER, var98);
            module0012.$g76$.bind((SubLObject)module0576.NIL, var98);
            module0012.$g77$.bind((SubLObject)module0576.T, var98);
            module0012.$g78$.bind(Time.get_universal_time(), var98);
            module0012.f478(var101);
            final SubLObject var29_99 = var100;
            if (module0576.NIL == module0065.f4772(var29_99, (SubLObject)module0576.$ic18$)) {
                final SubLObject var31_100 = var29_99;
                if (module0576.NIL == module0065.f4775(var31_100, (SubLObject)module0576.$ic18$)) {
                    final SubLObject var108 = module0065.f4740(var31_100);
                    final SubLObject var109 = (SubLObject)module0576.NIL;
                    SubLObject var110;
                    SubLObject var111;
                    SubLObject var112;
                    SubLObject var113;
                    for (var110 = Sequences.length(var108), var111 = (SubLObject)module0576.NIL, var111 = (SubLObject)module0576.ZERO_INTEGER; var111.numL(var110); var111 = Numbers.add(var111, (SubLObject)module0576.ONE_INTEGER)) {
                        var112 = ((module0576.NIL != var109) ? Numbers.subtract(var110, var111, (SubLObject)module0576.ONE_INTEGER) : var111);
                        var113 = Vectors.aref(var108, var112);
                        if (module0576.NIL == module0065.f4749(var113) || module0576.NIL == module0065.f4773((SubLObject)module0576.$ic18$)) {
                            if (module0576.NIL != module0065.f4749(var113)) {
                                var113 = (SubLObject)module0576.$ic18$;
                            }
                            module0012.note_percent_progress(var103, var102);
                            var103 = Numbers.add(var103, (SubLObject)module0576.ONE_INTEGER);
                            if (!var112.numL(var99) && module0576.NIL != f35303(var113)) {
                                f35319(var97, var113);
                            }
                        }
                    }
                }
                final SubLObject var39_103 = var29_99;
                if (module0576.NIL == module0065.f4777(var39_103) || module0576.NIL == module0065.f4773((SubLObject)module0576.$ic18$)) {
                    final SubLObject var114 = module0065.f4738(var39_103);
                    SubLObject var115 = module0065.f4739(var39_103);
                    final SubLObject var116 = module0065.f4734(var39_103);
                    final SubLObject var117 = (SubLObject)((module0576.NIL != module0065.f4773((SubLObject)module0576.$ic18$)) ? module0576.NIL : module0576.$ic18$);
                    while (var115.numL(var116)) {
                        final SubLObject var118 = Hashtables.gethash_without_values(var115, var114, var117);
                        if (module0576.NIL == module0065.f4773((SubLObject)module0576.$ic18$) || module0576.NIL == module0065.f4749(var118)) {
                            module0012.note_percent_progress(var103, var102);
                            var103 = Numbers.add(var103, (SubLObject)module0576.ONE_INTEGER);
                            if (!var115.numL(var99) && module0576.NIL != f35303(var118)) {
                                f35319(var97, var118);
                            }
                        }
                        var115 = Numbers.add(var115, (SubLObject)module0576.ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var107, var98);
            module0012.$g77$.rebind(var106, var98);
            module0012.$g76$.rebind(var105, var98);
            module0012.$g75$.rebind(var104, var98);
        }
        final SubLObject var119 = Numbers.add((SubLObject)module0576.ONE_INTEGER, assertion_handles_oc.f11032());
        var100 = assertion_handles_oc.f11010();
        var101 = (SubLObject)module0576.$ic61$;
        var102 = module0065.f4733(var100);
        var103 = (SubLObject)module0576.ZERO_INTEGER;
        assert module0576.NIL != Types.stringp(var101) : var101;
        var104 = module0012.$g75$.currentBinding(var98);
        var105 = module0012.$g76$.currentBinding(var98);
        var106 = module0012.$g77$.currentBinding(var98);
        var107 = module0012.$g78$.currentBinding(var98);
        try {
            module0012.$g75$.bind((SubLObject)module0576.ZERO_INTEGER, var98);
            module0012.$g76$.bind((SubLObject)module0576.NIL, var98);
            module0012.$g77$.bind((SubLObject)module0576.T, var98);
            module0012.$g78$.bind(Time.get_universal_time(), var98);
            module0012.f478(var101);
            final SubLObject var29_100 = var100;
            if (module0576.NIL == module0065.f4772(var29_100, (SubLObject)module0576.$ic18$)) {
                final SubLObject var31_101 = var29_100;
                if (module0576.NIL == module0065.f4775(var31_101, (SubLObject)module0576.$ic18$)) {
                    final SubLObject var108 = module0065.f4740(var31_101);
                    final SubLObject var109 = (SubLObject)module0576.NIL;
                    SubLObject var110;
                    SubLObject var111;
                    SubLObject var112;
                    SubLObject var120;
                    for (var110 = Sequences.length(var108), var111 = (SubLObject)module0576.NIL, var111 = (SubLObject)module0576.ZERO_INTEGER; var111.numL(var110); var111 = Numbers.add(var111, (SubLObject)module0576.ONE_INTEGER)) {
                        var112 = ((module0576.NIL != var109) ? Numbers.subtract(var110, var111, (SubLObject)module0576.ONE_INTEGER) : var111);
                        var120 = Vectors.aref(var108, var112);
                        if (module0576.NIL == module0065.f4749(var120) || module0576.NIL == module0065.f4773((SubLObject)module0576.$ic18$)) {
                            if (module0576.NIL != module0065.f4749(var120)) {
                                var120 = (SubLObject)module0576.$ic18$;
                            }
                            module0012.note_percent_progress(var103, var102);
                            var103 = Numbers.add(var103, (SubLObject)module0576.ONE_INTEGER);
                            if (!var112.numL(var119) && module0576.NIL != f35304(var120)) {
                                f35320(var97, var120);
                            }
                        }
                    }
                }
                final SubLObject var39_104 = var29_100;
                if (module0576.NIL == module0065.f4777(var39_104) || module0576.NIL == module0065.f4773((SubLObject)module0576.$ic18$)) {
                    final SubLObject var114 = module0065.f4738(var39_104);
                    SubLObject var115 = module0065.f4739(var39_104);
                    final SubLObject var116 = module0065.f4734(var39_104);
                    final SubLObject var117 = (SubLObject)((module0576.NIL != module0065.f4773((SubLObject)module0576.$ic18$)) ? module0576.NIL : module0576.$ic18$);
                    while (var115.numL(var116)) {
                        final SubLObject var121 = Hashtables.gethash_without_values(var115, var114, var117);
                        if (module0576.NIL == module0065.f4773((SubLObject)module0576.$ic18$) || module0576.NIL == module0065.f4749(var121)) {
                            module0012.note_percent_progress(var103, var102);
                            var103 = Numbers.add(var103, (SubLObject)module0576.ONE_INTEGER);
                            if (!var115.numL(var119) && module0576.NIL != f35304(var121)) {
                                f35320(var97, var121);
                            }
                        }
                        var115 = Numbers.add(var115, (SubLObject)module0576.ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var107, var98);
            module0012.$g77$.rebind(var106, var98);
            module0012.$g76$.rebind(var105, var98);
            module0012.$g75$.rebind(var104, var98);
        }
        return var97;
    }
    
    public static SubLObject f35321(final SubLObject var109, final SubLObject var97) {
        final SubLThread var110 = SubLProcess.currentSubLThread();
        assert module0576.NIL != f35322(var97) : var97;
        final SubLObject var111 = constant_handles_oc.f8423();
        final SubLObject var112 = module0052.f3781(var111, (SubLObject)module0576.$ic63$, (SubLObject)module0576.UNPROVIDED);
        SubLObject var113 = module0052.f3694(var112, (SubLObject)module0576.$ic64$);
        final SubLObject var114 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(var110);
        final SubLObject var115 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(var110);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind(module0576.$g4214$.getDynamicValue(var110), var110);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(var110), var110);
            SubLObject var116 = (SubLObject)module0576.NIL;
            try {
                final SubLObject var16_113 = stream_macros.$stream_requires_locking$.currentBinding(var110);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0576.NIL, var110);
                    var116 = compatibility.open_binary(var109, (SubLObject)module0576.$ic65$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var16_113, var110);
                }
                if (!var116.isStream()) {
                    Errors.error((SubLObject)module0576.$ic16$, var109);
                }
                final SubLObject var114_115 = var116;
                module0021.f1060(var114_115, (SubLObject)module0576.UNPROVIDED, (SubLObject)module0576.UNPROVIDED);
                final SubLObject var117 = module0021.f1060(var114_115, (SubLObject)module0576.UNPROVIDED, (SubLObject)module0576.UNPROVIDED);
                final SubLObject var118 = Sequences.cconcatenate((SubLObject)module0576.$ic66$, new SubLObject[] { module0006.f203(var109), module0576.$ic14$ });
                SubLObject var119 = (SubLObject)module0576.ZERO_INTEGER;
                final SubLObject var16_114 = module0012.$g75$.currentBinding(var110);
                final SubLObject var17_120 = module0012.$g76$.currentBinding(var110);
                final SubLObject var120 = module0012.$g77$.currentBinding(var110);
                final SubLObject var121 = module0012.$g78$.currentBinding(var110);
                try {
                    module0012.$g75$.bind((SubLObject)module0576.ZERO_INTEGER, var110);
                    module0012.$g76$.bind((SubLObject)module0576.NIL, var110);
                    module0012.$g77$.bind((SubLObject)module0576.T, var110);
                    module0012.$g78$.bind(Time.get_universal_time(), var110);
                    module0012.f478(var118);
                    SubLObject var122 = (SubLObject)module0576.NIL;
                    SubLObject var123 = (SubLObject)module0576.NIL;
                    SubLObject var124 = (SubLObject)module0576.NIL;
                    var122 = module0021.f1060(var114_115, (SubLObject)module0576.UNPROVIDED, (SubLObject)module0576.UNPROVIDED);
                    var123 = module0021.f1060(var114_115, (SubLObject)module0576.UNPROVIDED, (SubLObject)module0576.UNPROVIDED);
                    for (var124 = module0021.f1060(var114_115, (SubLObject)module0576.UNPROVIDED, (SubLObject)module0576.UNPROVIDED); module0576.NIL != var124; var124 = module0021.f1060(var114_115, (SubLObject)module0576.UNPROVIDED, (SubLObject)module0576.UNPROVIDED)) {
                        if (module0576.NIL == Errors.$ignore_mustsP$.getDynamicValue(var110) && module0576.NIL == module0004.f106(var122)) {
                            Errors.error((SubLObject)module0576.$ic39$, var122, var114_115);
                        }
                        if (module0576.NIL == Errors.$ignore_mustsP$.getDynamicValue(var110) && !var123.isString()) {
                            Errors.error((SubLObject)module0576.$ic40$, var123, var114_115);
                        }
                        if (module0576.NIL == Errors.$ignore_mustsP$.getDynamicValue(var110) && module0576.NIL == Guids.guid_p(var124)) {
                            Errors.error((SubLObject)module0576.$ic42$, var124, var114_115);
                        }
                        module0012.note_percent_progress(var122, var117);
                        if (module0576.NIL != constant_handles_oc.f8449(var113) && module0576.NIL != Guids.guidE(var124, constants_high_oc.f10744(var113))) {
                            var113 = module0052.f3694(var112, (SubLObject)module0576.$ic64$);
                        }
                        else {
                            f35323(var97, var123, var124);
                        }
                        var122 = module0021.f1060(var114_115, (SubLObject)module0576.UNPROVIDED, (SubLObject)module0576.UNPROVIDED);
                        var123 = module0021.f1060(var114_115, (SubLObject)module0576.UNPROVIDED, (SubLObject)module0576.UNPROVIDED);
                    }
                    var119 = Numbers.add(var119, (SubLObject)module0576.ONE_INTEGER);
                    module0012.note_percent_progress(var119, var117);
                    module0012.f479();
                }
                finally {
                    module0012.$g78$.rebind(var121, var110);
                    module0012.$g77$.rebind(var120, var110);
                    module0012.$g76$.rebind(var17_120, var110);
                    module0012.$g75$.rebind(var16_114, var110);
                }
            }
            finally {
                final SubLObject var16_115 = Threads.$is_thread_performing_cleanupP$.currentBinding(var110);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0576.T, var110);
                    if (var116.isStream()) {
                        streams_high.close(var116, (SubLObject)module0576.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var16_115, var110);
                }
            }
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(var115, var110);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(var114, var110);
        }
        while (module0576.NIL != constant_handles_oc.f8449(var113)) {
            f35319(var97, var113);
            var113 = module0052.f3694(var112, (SubLObject)module0576.$ic64$);
        }
        return var109;
    }
    
    public static SubLObject f35324(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0576.NIL;
        SubLObject var6 = (SubLObject)module0576.NIL;
        SubLObject var7 = (SubLObject)module0576.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0576.$ic67$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0576.$ic67$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0576.$ic67$);
        var7 = var4.first();
        var4 = var4.rest();
        if (module0576.NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)module0576.$ic68$, var6, (SubLObject)ConsesLow.listS((SubLObject)module0576.$ic69$, var5, (SubLObject)module0576.$ic70$), var7, (SubLObject)ConsesLow.list((SubLObject)module0576.$ic71$, (SubLObject)ConsesLow.list((SubLObject)module0576.$ic72$, var6), (SubLObject)ConsesLow.list((SubLObject)module0576.$ic73$, (SubLObject)ConsesLow.list((SubLObject)module0576.$ic74$, var6))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0576.$ic67$);
        return (SubLObject)module0576.NIL;
    }
    
    public static SubLObject f35325(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0576.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0576.$ic75$);
        var5 = var4.first();
        var4 = var4.rest();
        if (module0576.NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)module0576.$ic8$, (SubLObject)ConsesLow.list((SubLObject)module0576.$ic76$, var5), (SubLObject)ConsesLow.list((SubLObject)module0576.$ic77$, (SubLObject)ConsesLow.list((SubLObject)module0576.$ic78$, (SubLObject)ConsesLow.list((SubLObject)module0576.$ic79$, var5)), (SubLObject)ConsesLow.list((SubLObject)module0576.$ic76$, var5), (SubLObject)ConsesLow.list((SubLObject)module0576.$ic37$, (SubLObject)ConsesLow.list((SubLObject)module0576.$ic38$, var5), (SubLObject)module0576.$ic80$, var5)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0576.$ic75$);
        return (SubLObject)module0576.NIL;
    }
    
    public static SubLObject f35326(final SubLObject var131) {
        final SubLThread var132 = SubLProcess.currentSubLThread();
        final SubLObject var133 = f35309(var131);
        final SubLObject var134 = f35308(var131);
        final SubLObject var135 = module0067.f4880((SubLObject)module0576.UNPROVIDED, (SubLObject)module0576.UNPROVIDED);
        SubLObject var136 = (SubLObject)module0576.NIL;
        SubLObject var137 = (SubLObject)module0576.NIL;
        SubLObject var138 = (SubLObject)module0576.NIL;
        SubLObject var139 = (SubLObject)module0576.NIL;
        try {
            var139 = module0095.f6845(var133, var134, (SubLObject)module0576.$ic65$, (SubLObject)module0576.UNPROVIDED, (SubLObject)module0576.UNPROVIDED, (SubLObject)module0576.UNPROVIDED);
            var132.resetMultipleValues();
            final SubLObject var140 = f35327(var139);
            final SubLObject var141 = var132.secondMultipleValue();
            var132.resetMultipleValues();
            var138 = var141;
            final SubLObject var142 = module0067.f4880((SubLObject)module0576.EQUAL, (SubLObject)module0576.UNPROVIDED);
            final SubLObject var143 = module0095.f6852(var139);
            SubLObject var144 = Numbers.min(var138, assertion_handles_oc.f11019());
            SubLObject var145 = var140;
            for (SubLObject var146 = (SubLObject)module0576.NIL; module0576.NIL == var146; var146 = module0004.f106(var137)) {
                if (module0576.NIL == Errors.$ignore_mustsP$.getDynamicValue(var132) && !var145.isPositive()) {
                    Errors.error((SubLObject)module0576.$ic81$);
                }
                if (module0576.NIL == Errors.$ignore_mustsP$.getDynamicValue(var132) && !var144.isPositive()) {
                    Errors.error((SubLObject)module0576.$ic82$);
                }
                var145 = Numbers.subtract(var145, (SubLObject)module0576.ONE_INTEGER);
                module0095.f6858(var139, var145);
                final SubLObject var147 = module0021.f1060(var143, (SubLObject)module0576.UNPROVIDED, (SubLObject)module0576.UNPROVIDED);
                final SubLObject var148 = module0021.f1060(var143, (SubLObject)module0576.UNPROVIDED, (SubLObject)module0576.UNPROVIDED);
                module0079.f5412(var135, var147, var145);
                module0079.f5412(var142, var148, var147);
                var144 = Numbers.subtract(var144, (SubLObject)module0576.ONE_INTEGER);
                while (module0576.NIL == f35304(assertion_handles_oc.f11053(var144))) {
                    var144 = Numbers.subtract(var144, (SubLObject)module0576.ONE_INTEGER);
                    if (module0576.NIL == Errors.$ignore_mustsP$.getDynamicValue(var132) && module0576.NIL == module0004.f106(var144)) {
                        Errors.error((SubLObject)module0576.$ic80$, var144);
                    }
                }
                var136 = assertion_handles_oc.f11053(var144);
                final SubLObject var149 = f35310(var136);
                var137 = module0079.f5414(var142, var149, (SubLObject)module0576.$ic83$);
            }
        }
        finally {
            final SubLObject var150 = Threads.$is_thread_performing_cleanupP$.currentBinding(var132);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0576.T, var132);
                if (module0576.NIL != module0095.f6844(var139)) {
                    module0095.f6849(var139);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var150, var132);
            }
        }
        final SubLObject var151 = module0079.f5414(var135, var137, (SubLObject)module0576.UNPROVIDED);
        return (SubLObject)ConsesLow.list(new SubLObject[] { module0576.$ic84$, var136, module0576.$ic85$, var137, module0576.$ic86$, var151, module0576.$ic87$, var138, module0576.$ic88$, module0576.T });
    }
    
    public static SubLObject f35328(final SubLObject var131, final SubLObject var97) {
        assert module0576.NIL != f35322(var97) : var97;
        return f35317(var131, var97, (SubLObject)module0576.UNPROVIDED);
    }
    
    public static SubLObject f35317(final SubLObject var131, final SubLObject var97, SubLObject var143) {
        if (var143 == module0576.UNPROVIDED) {
            var143 = (SubLObject)module0576.NIL;
        }
        final SubLObject var145;
        final SubLObject var144 = var145 = module0576.$g4215$.getGlobalValue();
        if (var145.eql((SubLObject)module0576.$ic90$)) {
            return f35329(var131, var97, var143);
        }
        if (var145.eql((SubLObject)module0576.$ic91$)) {
            return f35330(var131, var97, var143);
        }
        if (var145.eql((SubLObject)module0576.$ic92$)) {
            return f35331(var131, var97, var143);
        }
        if (var145.eql((SubLObject)module0576.$ic89$)) {
            return f35332(var131, var97, var143);
        }
        return Errors.error((SubLObject)module0576.$ic93$, var144);
    }
    
    public static SubLObject f35331(final SubLObject var131, final SubLObject var97, SubLObject var143) {
        if (var143 == module0576.UNPROVIDED) {
            var143 = (SubLObject)module0576.NIL;
        }
        final SubLObject var144 = f35333(var131, var97, (SubLObject)module0576.UNPROVIDED);
        if (var143.isString()) {
            f35321(var143, var97);
        }
        f35334(var97, var144);
        return (SubLObject)module0576.T;
    }
    
    public static SubLObject f35332(final SubLObject var131, final SubLObject var97, SubLObject var143) {
        if (var143 == module0576.UNPROVIDED) {
            var143 = (SubLObject)module0576.NIL;
        }
        final SubLObject var144 = f35315((SubLObject)module0576.UNPROVIDED);
        final SubLObject var145 = f35333(var131, var97, var144);
        if (var143.isString()) {
            f35321(var143, var97);
        }
        f35334(var97, var145);
        return (SubLObject)module0576.T;
    }
    
    public static SubLObject f35330(final SubLObject var131, final SubLObject var97, SubLObject var143) {
        if (var143 == module0576.UNPROVIDED) {
            var143 = (SubLObject)module0576.NIL;
        }
        final SubLObject var144 = f35335(var131, var97);
        if (var143.isString()) {
            f35321(var143, var97);
        }
        f35334(var97, var144);
        return (SubLObject)module0576.T;
    }
    
    public static SubLObject f35329(final SubLObject var131, final SubLObject var97, SubLObject var143) {
        if (var143 == module0576.UNPROVIDED) {
            var143 = (SubLObject)module0576.NIL;
        }
        final SubLObject var144 = f35326(var131);
        final SubLObject var145 = conses_high.getf(var144, (SubLObject)module0576.$ic84$, (SubLObject)module0576.UNPROVIDED);
        final SubLObject var146 = conses_high.getf(var144, (SubLObject)module0576.$ic88$, (SubLObject)module0576.UNPROVIDED);
        f35336(var131, var97, var144);
        if (var143.isString()) {
            f35321(var143, var97);
        }
        f35334(var97, var145);
        return var146;
    }
    
    public static SubLObject f35334(final SubLObject var97, final SubLObject var146) {
        final SubLThread var147 = SubLProcess.currentSubLThread();
        SubLObject var149;
        final SubLObject var148 = var149 = Numbers.add(assertion_handles_oc.f11025(var146), (SubLObject)module0576.ONE_INTEGER);
        final SubLObject var150 = assertion_handles_oc.f11019();
        final SubLObject var151 = Numbers.subtract(var150, var149);
        final SubLObject var152 = Sequences.cconcatenate((SubLObject)module0576.$ic94$, new SubLObject[] { module0006.f203(var151), module0576.$ic95$ });
        final SubLObject var153 = module0012.$g75$.currentBinding(var147);
        final SubLObject var154 = module0012.$g76$.currentBinding(var147);
        final SubLObject var155 = module0012.$g77$.currentBinding(var147);
        final SubLObject var156 = module0012.$g78$.currentBinding(var147);
        try {
            module0012.$g75$.bind((SubLObject)module0576.ZERO_INTEGER, var147);
            module0012.$g76$.bind((SubLObject)module0576.NIL, var147);
            module0012.$g77$.bind((SubLObject)module0576.T, var147);
            module0012.$g78$.bind(Time.get_universal_time(), var147);
            module0012.f478(var152);
            while (var149.numL(var150)) {
                module0012.note_percent_progress(Numbers.subtract(var149, var148), var150);
                final SubLObject var157 = assertion_handles_oc.f11053(var149);
                if (module0576.NIL == Errors.$ignore_mustsP$.getDynamicValue(var147) && module0576.NIL == assertion_handles_oc.f11035(var157)) {
                    Errors.error((SubLObject)module0576.$ic96$);
                }
                if (module0576.NIL != f35304(var157)) {
                    f35320(var97, var157);
                }
                var149 = Numbers.add(var149, (SubLObject)module0576.ONE_INTEGER);
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var156, var147);
            module0012.$g77$.rebind(var155, var147);
            module0012.$g76$.rebind(var154, var147);
            module0012.$g75$.rebind(var153, var147);
        }
        return var97;
    }
    
    public static SubLObject f35336(final SubLObject var131, final SubLObject var97, final SubLObject var148) {
        final SubLObject var149 = conses_high.getf(var148, (SubLObject)module0576.$ic84$, (SubLObject)module0576.UNPROVIDED);
        final SubLObject var150 = conses_high.getf(var148, (SubLObject)module0576.$ic85$, (SubLObject)module0576.UNPROVIDED);
        final SubLObject var151 = conses_high.getf(var148, (SubLObject)module0576.$ic86$, (SubLObject)module0576.UNPROVIDED);
        final SubLObject var152 = conses_high.getf(var148, (SubLObject)module0576.$ic87$, (SubLObject)module0576.UNPROVIDED);
        return f35337(var131, var97, var149, var150, var151, var152);
    }
    
    public static SubLObject f35338(final SubLObject var157, final SubLObject var57) {
        f35339(var157, var57, (SubLObject)module0576.ZERO_INTEGER);
        return (SubLObject)module0576.NIL;
    }
    
    public static SubLObject f35340(final SubLObject var157) {
        return (SubLObject)((var157.getClass() == $sX38712_native.class) ? module0576.T : module0576.NIL);
    }
    
    public static SubLObject f35341(final SubLObject var157) {
        assert module0576.NIL != f35340(var157) : var157;
        return var157.getField2();
    }
    
    public static SubLObject f35342(final SubLObject var157) {
        assert module0576.NIL != f35340(var157) : var157;
        return var157.getField3();
    }
    
    public static SubLObject f35343(final SubLObject var157) {
        assert module0576.NIL != f35340(var157) : var157;
        return var157.getField4();
    }
    
    public static SubLObject f35344(final SubLObject var157) {
        assert module0576.NIL != f35340(var157) : var157;
        return var157.getField5();
    }
    
    public static SubLObject f35345(final SubLObject var157) {
        assert module0576.NIL != f35340(var157) : var157;
        return var157.getField6();
    }
    
    public static SubLObject f35346(final SubLObject var157, final SubLObject var159) {
        assert module0576.NIL != f35340(var157) : var157;
        return var157.setField2(var159);
    }
    
    public static SubLObject f35347(final SubLObject var157, final SubLObject var159) {
        assert module0576.NIL != f35340(var157) : var157;
        return var157.setField3(var159);
    }
    
    public static SubLObject f35348(final SubLObject var157, final SubLObject var159) {
        assert module0576.NIL != f35340(var157) : var157;
        return var157.setField4(var159);
    }
    
    public static SubLObject f35349(final SubLObject var157, final SubLObject var159) {
        assert module0576.NIL != f35340(var157) : var157;
        return var157.setField5(var159);
    }
    
    public static SubLObject f35350(final SubLObject var157, final SubLObject var159) {
        assert module0576.NIL != f35340(var157) : var157;
        return var157.setField6(var159);
    }
    
    public static SubLObject f35351(SubLObject var160) {
        if (var160 == module0576.UNPROVIDED) {
            var160 = (SubLObject)module0576.NIL;
        }
        final SubLObject var161 = (SubLObject)new $sX38712_native();
        SubLObject var162;
        SubLObject var163;
        SubLObject var164;
        SubLObject var165;
        for (var162 = (SubLObject)module0576.NIL, var162 = var160; module0576.NIL != var162; var162 = conses_high.cddr(var162)) {
            var163 = var162.first();
            var164 = conses_high.cadr(var162);
            var165 = var163;
            if (var165.eql((SubLObject)module0576.$ic116$)) {
                f35346(var161, var164);
            }
            else if (var165.eql((SubLObject)module0576.$ic117$)) {
                f35347(var161, var164);
            }
            else if (var165.eql((SubLObject)module0576.$ic118$)) {
                f35348(var161, var164);
            }
            else if (var165.eql((SubLObject)module0576.$ic119$)) {
                f35349(var161, var164);
            }
            else if (var165.eql((SubLObject)module0576.$ic120$)) {
                f35350(var161, var164);
            }
            else {
                Errors.error((SubLObject)module0576.$ic121$, var163);
            }
        }
        return var161;
    }
    
    public static SubLObject f35352(final SubLObject var165, final SubLObject var166) {
        Functions.funcall(var166, var165, (SubLObject)module0576.$ic122$, (SubLObject)module0576.$ic123$, (SubLObject)module0576.FIVE_INTEGER);
        Functions.funcall(var166, var165, (SubLObject)module0576.$ic124$, (SubLObject)module0576.$ic116$, f35341(var165));
        Functions.funcall(var166, var165, (SubLObject)module0576.$ic124$, (SubLObject)module0576.$ic117$, f35342(var165));
        Functions.funcall(var166, var165, (SubLObject)module0576.$ic124$, (SubLObject)module0576.$ic118$, f35343(var165));
        Functions.funcall(var166, var165, (SubLObject)module0576.$ic124$, (SubLObject)module0576.$ic119$, f35344(var165));
        Functions.funcall(var166, var165, (SubLObject)module0576.$ic124$, (SubLObject)module0576.$ic120$, f35345(var165));
        Functions.funcall(var166, var165, (SubLObject)module0576.$ic125$, (SubLObject)module0576.$ic123$, (SubLObject)module0576.FIVE_INTEGER);
        return var165;
    }
    
    public static SubLObject f35353(final SubLObject var165, final SubLObject var166) {
        return f35352(var165, var166);
    }
    
    public static SubLObject f35339(final SubLObject var83, final SubLObject var57, final SubLObject var167) {
        final SubLThread var168 = SubLProcess.currentSubLThread();
        if (module0576.NIL != print_high.$print_readably$.getDynamicValue(var168)) {
            print_high.print_not_readable(var83, var57);
        }
        else {
            streams_high.write_string((SubLObject)module0576.$ic127$, var57, (SubLObject)module0576.UNPROVIDED, (SubLObject)module0576.UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var83), new SubLObject[] { module0576.$ic128$, var57 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var57);
            streams_high.write_string((SubLObject)module0576.$ic129$, var57, (SubLObject)module0576.UNPROVIDED, (SubLObject)module0576.UNPROVIDED);
            print_high.princ(f35341(var83), var57);
            streams_high.write_string((SubLObject)module0576.$ic130$, var57, (SubLObject)module0576.UNPROVIDED, (SubLObject)module0576.UNPROVIDED);
            print_high.princ(f35343(var83), var57);
            final SubLObject var169 = f35344(var83);
            if (module0576.NIL == var169) {
                print_high.princ(var169, var57);
            }
            else if (module0576.NIL != assertion_handles_oc.f11035(var169)) {
                streams_high.write_string((SubLObject)module0576.$ic131$, var57, (SubLObject)module0576.UNPROVIDED, (SubLObject)module0576.UNPROVIDED);
                print_high.princ(assertion_handles_oc.f11025(var169), var57);
            }
            else if (module0576.NIL != module0004.f106(var169)) {
                streams_high.write_string((SubLObject)module0576.$ic132$, var57, (SubLObject)module0576.UNPROVIDED, (SubLObject)module0576.UNPROVIDED);
                print_high.princ(var169, var57);
            }
            else {
                streams_high.write_string((SubLObject)module0576.$ic133$, var57, (SubLObject)module0576.UNPROVIDED, (SubLObject)module0576.UNPROVIDED);
                print_high.princ(var169, var57);
            }
            streams_high.write_string((SubLObject)module0576.$ic134$, var57, (SubLObject)module0576.UNPROVIDED, (SubLObject)module0576.UNPROVIDED);
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var57);
        }
        return var83;
    }
    
    public static SubLObject f35335(final SubLObject var131, final SubLObject var97) {
        final SubLObject var132 = f35309(var131);
        final SubLObject var133 = f35308(var131);
        SubLObject var134 = (SubLObject)module0576.NIL;
        SubLObject var135 = (SubLObject)module0576.NIL;
        try {
            var135 = module0095.f6845(var132, var133, (SubLObject)module0576.$ic65$, (SubLObject)module0576.UNPROVIDED, (SubLObject)module0576.UNPROVIDED, (SubLObject)module0576.UNPROVIDED);
            var134 = f35354(var135, var97);
        }
        finally {
            final SubLObject var136 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0576.T);
                if (module0576.NIL != module0095.f6844(var135)) {
                    module0095.f6849(var135);
                }
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var136);
            }
        }
        return var134;
    }
    
    public static SubLObject f35354(final SubLObject var70, final SubLObject var97) {
        final SubLThread var98 = SubLProcess.currentSubLThread();
        SubLObject var99 = (SubLObject)module0576.NIL;
        var98.resetMultipleValues();
        final SubLObject var100 = f35327(var70);
        final SubLObject var101 = var98.secondMultipleValue();
        final SubLObject var102 = var98.thirdMultipleValue();
        var98.resetMultipleValues();
        final SubLObject var103 = Numbers.subtract(var101, var102);
        final SubLObject var104 = Sequences.cconcatenate((SubLObject)module0576.$ic94$, new SubLObject[] { module0006.f203(var103), module0576.$ic136$ });
        SubLObject var105 = (SubLObject)module0576.ZERO_INTEGER;
        SubLObject var106 = (SubLObject)module0576.ZERO_INTEGER;
        SubLObject var107 = (SubLObject)module0576.ZERO_INTEGER;
        final SubLObject var108 = f35355(var102);
        var106 = Numbers.subtract(var102, var108);
        final SubLObject var109 = module0012.$g75$.currentBinding(var98);
        final SubLObject var110 = module0012.$g76$.currentBinding(var98);
        final SubLObject var111 = module0012.$g77$.currentBinding(var98);
        final SubLObject var112 = module0012.$g78$.currentBinding(var98);
        try {
            module0012.$g75$.bind((SubLObject)module0576.ZERO_INTEGER, var98);
            module0012.$g76$.bind((SubLObject)module0576.NIL, var98);
            module0012.$g77$.bind((SubLObject)module0576.T, var98);
            module0012.$g78$.bind(Time.get_universal_time(), var98);
            module0012.f478(var104);
            while (var105.numL(var100)) {
                module0012.note_percent_progress(var105, var100);
                SubLObject var113 = Numbers.integerDivide(Numbers.add(var105, var100), (SubLObject)module0576.TWO_INTEGER);
                final SubLObject var114 = f35351((SubLObject)module0576.UNPROVIDED);
                final SubLObject var115 = f35351((SubLObject)module0576.UNPROVIDED);
                f35356(var70, var114, var113);
                final SubLObject var116 = Numbers.subtract(f35341(var114), var106);
                f35357(var115, var116);
                if (module0576.NIL != f35358(var114, var115)) {
                    var99 = f35344(var115);
                    if (var113.numE(var105)) {
                        var105 = var100;
                    }
                    else {
                        var105 = var113;
                    }
                }
                else {
                    SubLObject var117 = var113;
                    while (var105.numLE(var117)) {
                        var113 = Numbers.integerDivide(Numbers.add(var105, var117), (SubLObject)module0576.TWO_INTEGER);
                        f35356(var70, var114, var113);
                        final SubLObject var118 = Numbers.subtract(f35341(var114), var106);
                        f35357(var115, var118);
                        if (module0576.NIL != f35358(var114, var115)) {
                            var105 = Numbers.add(var113, (SubLObject)module0576.ONE_INTEGER);
                            var99 = f35344(var115);
                        }
                        else {
                            var117 = Numbers.subtract(var113, (SubLObject)module0576.ONE_INTEGER);
                        }
                    }
                    f35356(var70, var114, var117);
                    final SubLObject var119 = Numbers.subtract(f35341(var114), var106);
                    final SubLObject var120 = f35359(var119);
                    if (var120.isNegative()) {
                        Errors.error((SubLObject)module0576.$ic137$);
                    }
                    else {
                        f35357(var115, var120);
                        f35356(var70, var114, var105);
                        var106 = Numbers.subtract(f35341(var114), var120);
                        while (var105.numL(var100) && module0576.NIL == f35358(var114, var115)) {
                            var107 = Numbers.add(var107, (SubLObject)module0576.ONE_INTEGER);
                            f35360(var97, f35342(var114));
                            var105 = Numbers.add(var105, (SubLObject)module0576.ONE_INTEGER);
                            f35356(var70, var114, var105);
                            var106 = Numbers.subtract(f35341(var114), var120);
                            if (module0576.NIL == Errors.$ignore_mustsP$.getDynamicValue(var98) && var106.numL(var107)) {
                                Errors.error((SubLObject)module0576.$ic138$, var106, var107);
                            }
                        }
                        if (module0576.NIL == Errors.$ignore_mustsP$.getDynamicValue(var98) && var106.numLE(var107)) {
                            Errors.error((SubLObject)module0576.$ic138$, var106, var107);
                        }
                        if (!var105.numL(var100)) {
                            continue;
                        }
                        var99 = f35344(var115);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var112, var98);
            module0012.$g77$.rebind(var111, var98);
            module0012.$g76$.rebind(var110, var98);
            module0012.$g75$.rebind(var109, var98);
        }
        return var99;
    }
    
    public static SubLObject f35355(final SubLObject var186) {
        final SubLThread var187 = SubLProcess.currentSubLThread();
        SubLObject var188 = (SubLObject)module0576.MINUS_ONE_INTEGER;
        SubLObject var189 = (SubLObject)module0576.NIL;
        final SubLObject var190 = module0012.$g75$.currentBinding(var187);
        final SubLObject var191 = module0012.$g76$.currentBinding(var187);
        final SubLObject var192 = module0012.$g77$.currentBinding(var187);
        final SubLObject var193 = module0012.$g78$.currentBinding(var187);
        try {
            module0012.$g75$.bind((SubLObject)module0576.ZERO_INTEGER, var187);
            module0012.$g76$.bind((SubLObject)module0576.NIL, var187);
            module0012.$g77$.bind((SubLObject)module0576.T, var187);
            module0012.$g78$.bind(Time.get_universal_time(), var187);
            module0012.f478((SubLObject)module0576.$ic139$);
            while (module0576.NIL == var189) {
                var188 = Numbers.add(var188, (SubLObject)module0576.ONE_INTEGER);
                module0012.note_percent_progress(var188, var186);
                final SubLObject var194 = assertion_handles_oc.f11053(var188);
                var189 = (SubLObject)SubLObjectFactory.makeBoolean(module0576.NIL != f35304(var194) || var188.numG(var186));
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var193, var187);
            module0012.$g77$.rebind(var192, var187);
            module0012.$g76$.rebind(var191, var187);
            module0012.$g75$.rebind(var190, var187);
        }
        return var188;
    }
    
    public static SubLObject f35327(final SubLObject var70) {
        SubLObject var71 = (SubLObject)module0576.NIL;
        SubLObject var72 = (SubLObject)module0576.NIL;
        SubLObject var73 = (SubLObject)module0576.NIL;
        final SubLObject var74 = module0095.f6852(var70);
        compatibility.set_file_position(var74, (SubLObject)module0576.ZERO_INTEGER);
        module0021.f1060(var74, (SubLObject)module0576.UNPROVIDED, (SubLObject)module0576.UNPROVIDED);
        var71 = module0021.f1060(var74, (SubLObject)module0576.UNPROVIDED, (SubLObject)module0576.UNPROVIDED);
        module0021.f1060(var74, (SubLObject)module0576.UNPROVIDED, (SubLObject)module0576.UNPROVIDED);
        var72 = module0095.f6854(var70);
        final SubLObject var75 = f35351((SubLObject)module0576.UNPROVIDED);
        f35356(var70, var75, (SubLObject)module0576.ZERO_INTEGER);
        var73 = f35341(var75);
        return Values.values(var72, var71, var73);
    }
    
    public static SubLObject f35337(final SubLObject var131, final SubLObject var97, final SubLObject var155, final SubLObject var140, final SubLObject var138, final SubLObject var156) {
        final SubLThread var157 = SubLProcess.currentSubLThread();
        final SubLObject var158 = f35309(var131);
        final SubLObject var159 = f35308(var131);
        SubLObject var160 = (SubLObject)module0576.NIL;
        try {
            var160 = module0095.f6845(var158, var159, (SubLObject)module0576.$ic65$, (SubLObject)module0576.UNPROVIDED, (SubLObject)module0576.UNPROVIDED, (SubLObject)module0576.UNPROVIDED);
            f35361(var160, var97, var138);
            SubLObject var162;
            SubLObject var161 = var162 = var138;
            final SubLObject var163 = Numbers.subtract(var140, assertion_handles_oc.f11025(var155));
            final SubLObject var164 = Sequences.cconcatenate((SubLObject)module0576.$ic94$, new SubLObject[] { module0006.f203(var163), module0576.$ic140$ });
            SubLObject var165 = var163;
            final SubLObject var166 = module0012.$g75$.currentBinding(var157);
            final SubLObject var167 = module0012.$g76$.currentBinding(var157);
            final SubLObject var168 = module0012.$g77$.currentBinding(var157);
            final SubLObject var169 = module0012.$g78$.currentBinding(var157);
            try {
                module0012.$g75$.bind((SubLObject)module0576.ZERO_INTEGER, var157);
                module0012.$g76$.bind((SubLObject)module0576.NIL, var157);
                module0012.$g77$.bind((SubLObject)module0576.T, var157);
                module0012.$g78$.bind(Time.get_universal_time(), var157);
                module0012.f478(var164);
                while (module0576.ZERO_INTEGER.numL(var165)) {
                    module0012.note_percent_progress(Numbers.subtract(var163, var165), var163);
                    final SubLObject var170 = Numbers.max((SubLObject)module0576.ONE_INTEGER, Numbers.integerDivide(var161, var165));
                    final SubLObject var171 = Numbers.max((SubLObject)module0576.ZERO_INTEGER, Numbers.subtract(var161, var170));
                    final SubLObject var172 = f35351((SubLObject)module0576.UNPROVIDED);
                    final SubLObject var173 = f35351((SubLObject)module0576.UNPROVIDED);
                    f35356(var160, var172, var171);
                    final SubLObject var174 = Numbers.subtract(f35341(var172), var165);
                    f35357(var173, var174);
                    if (module0576.NIL != f35358(var172, var173)) {
                        var162 = var161;
                        var161 = var171;
                        if (!var162.numE(var161)) {
                            continue;
                        }
                        var165 = (SubLObject)module0576.ZERO_INTEGER;
                    }
                    else {
                        SubLObject var175 = var171;
                        while (var175.numLE(var161)) {
                            final SubLObject var176 = Numbers.integerDivide(Numbers.add(var175, var161), (SubLObject)module0576.TWO_INTEGER);
                            f35356(var160, var172, var176);
                            final SubLObject var177 = Numbers.subtract(f35341(var172), var165);
                            f35357(var173, var177);
                            if (module0576.NIL != f35358(var172, var173)) {
                                var161 = Numbers.subtract(var176, (SubLObject)module0576.ONE_INTEGER);
                            }
                            else {
                                var175 = Numbers.add(var176, (SubLObject)module0576.ONE_INTEGER);
                            }
                        }
                        f35356(var160, var172, var175);
                        final SubLObject var178 = Numbers.subtract(f35341(var172), var165);
                        final SubLObject var179 = f35362(var178);
                        if (var179.isNegative()) {
                            while (module0576.NIL != module0004.f106(var161)) {
                                f35356(var160, var172, var161);
                                f35360(var97, f35342(var172));
                                var161 = Numbers.subtract(var161, (SubLObject)module0576.ONE_INTEGER);
                            }
                            var165 = (SubLObject)module0576.ZERO_INTEGER;
                        }
                        else {
                            f35357(var173, var179);
                            f35356(var160, var172, var161);
                            var165 = Numbers.subtract(f35341(var172), var179);
                            while (module0576.NIL == f35358(var172, var173)) {
                                f35360(var97, f35342(var172));
                                var161 = Numbers.subtract(var161, (SubLObject)module0576.ONE_INTEGER);
                                f35356(var160, var172, var161);
                                var165 = Numbers.subtract(f35341(var172), var179);
                                if (module0576.NIL == module0004.f106(var165)) {
                                    final SubLObject var180 = f35351((SubLObject)module0576.UNPROVIDED);
                                    f35356(var160, var180, var175);
                                    Errors.error((SubLObject)module0576.$ic141$, var180, var172, var173);
                                }
                            }
                        }
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var169, var157);
                module0012.$g77$.rebind(var168, var157);
                module0012.$g76$.rebind(var167, var157);
                module0012.$g75$.rebind(var166, var157);
            }
        }
        finally {
            final SubLObject var181 = Threads.$is_thread_performing_cleanupP$.currentBinding(var157);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0576.T, var157);
                if (module0576.NIL != module0095.f6844(var160)) {
                    module0095.f6849(var160);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var181, var157);
            }
        }
        return var131;
    }
    
    public static SubLObject f35358(final SubLObject var195, final SubLObject var196) {
        return (SubLObject)SubLObjectFactory.makeBoolean(f35343(var195).eql(f35343(var196)) && f35345(var195).equal(f35345(var196)));
    }
    
    public static SubLObject f35362(final SubLObject var184) {
        SubLObject var185;
        for (var185 = Numbers.subtract(var184, (SubLObject)module0576.ONE_INTEGER); module0576.NIL != module0004.f106(var185); var185 = Numbers.subtract(var185, (SubLObject)module0576.ONE_INTEGER)) {
            final SubLObject var186 = assertion_handles_oc.f11053(var185);
            if (module0576.NIL != f35304(var186)) {
                return var185;
            }
        }
        return var185;
    }
    
    public static SubLObject f35359(final SubLObject var184) {
        for (SubLObject var185 = Numbers.add(var184, (SubLObject)module0576.ONE_INTEGER), var186 = assertion_handles_oc.f11032(); var185.numL(var186); var185 = Numbers.add(var185, (SubLObject)module0576.ONE_INTEGER)) {
            final SubLObject var187 = assertion_handles_oc.f11053(var185);
            if (module0576.NIL != f35304(var187)) {
                return var185;
            }
        }
        return (SubLObject)module0576.MINUS_ONE_INTEGER;
    }
    
    public static SubLObject f35356(final SubLObject var70, final SubLObject var180, final SubLObject var94) {
        final SubLObject var181 = module0095.f6852(var70);
        module0095.f6858(var70, var94);
        f35349(var180, var94);
        f35346(var180, module0021.f1060(var181, (SubLObject)module0576.UNPROVIDED, (SubLObject)module0576.UNPROVIDED));
        final SubLObject var182 = module0021.f1060(var181, (SubLObject)module0576.UNPROVIDED, (SubLObject)module0576.UNPROVIDED);
        final SubLObject var183 = f35363(var182);
        f35347(var180, var182);
        f35350(var180, var183);
        f35348(var180, Sxhash.sxhash(var183));
        return var180;
    }
    
    public static SubLObject f35357(final SubLObject var181, final SubLObject var200) {
        f35364(var181);
        f35346(var181, var200);
        if (module0576.NIL != module0004.f106(var200)) {
            final SubLObject var201 = assertion_handles_oc.f11053(var200);
            final SubLObject var202 = f35310(var201);
            final SubLObject var203 = f35363(var202);
            f35349(var181, var201);
            f35347(var181, var202);
            f35350(var181, var203);
            f35348(var181, Sxhash.sxhash(var203));
        }
        return var181;
    }
    
    public static SubLObject f35364(final SubLObject var201) {
        f35346(var201, (SubLObject)module0576.NIL);
        f35349(var201, (SubLObject)module0576.NIL);
        f35348(var201, (SubLObject)module0576.NIL);
        f35347(var201, (SubLObject)module0576.NIL);
        f35350(var201, (SubLObject)module0576.NIL);
        return var201;
    }
    
    public static SubLObject f35363(final SubLObject var127) {
        SubLObject var128 = conses_high.copy_tree(var127);
        SubLObject var129 = module0205.f13183(var128, (SubLObject)module0576.$ic143$, (SubLObject)module0576.UNPROVIDED, (SubLObject)module0576.UNPROVIDED, (SubLObject)module0576.UNPROVIDED, (SubLObject)module0576.UNPROVIDED);
        SubLObject var130 = (SubLObject)module0576.NIL;
        var130 = var129.first();
        while (module0576.NIL != var129) {
            SubLObject var132;
            final SubLObject var131 = var132 = var130;
            SubLObject var133 = (SubLObject)module0576.NIL;
            SubLObject var134 = (SubLObject)module0576.NIL;
            SubLObject var135 = (SubLObject)module0576.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var132, var131, (SubLObject)module0576.$ic142$);
            var133 = var132.first();
            var132 = var132.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var132, var131, (SubLObject)module0576.$ic142$);
            var134 = var132.first();
            var132 = var132.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var132, var131, (SubLObject)module0576.$ic142$);
            var135 = var132.first();
            var132 = var132.rest();
            if (module0576.NIL == var132) {
                SubLObject var211_212;
                final SubLObject var209_210 = var211_212 = var135;
                SubLObject var136 = (SubLObject)module0576.NIL;
                SubLObject var137 = (SubLObject)module0576.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var211_212, var209_210, (SubLObject)module0576.$ic53$);
                var136 = var211_212.first();
                var211_212 = var211_212.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var211_212, var209_210, (SubLObject)module0576.$ic53$);
                var137 = var211_212.first();
                var211_212 = var211_212.rest();
                if (module0576.NIL == var211_212) {
                    final SubLObject var138 = var137;
                    var128 = module0205.f13251(var138, var130, var128, (SubLObject)module0576.EQUAL, (SubLObject)module0576.UNPROVIDED);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var209_210, (SubLObject)module0576.$ic53$);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var131, (SubLObject)module0576.$ic142$);
            }
            var129 = var129.rest();
            var130 = var129.first();
        }
        return var128;
    }
    
    public static SubLObject f35365(final SubLObject var83) {
        if (!var83.isCons() || module0576.$ic144$ != ConsesLow.nth((SubLObject)module0576.ZERO_INTEGER, var83) || !ConsesLow.nth((SubLObject)module0576.ONE_INTEGER, var83).isString() || module0576.NIL == module0035.f1995(var83, (SubLObject)module0576.THREE_INTEGER, (SubLObject)module0576.UNPROVIDED)) {
            return (SubLObject)module0576.NIL;
        }
        final SubLObject var84 = ConsesLow.nth((SubLObject)module0576.TWO_INTEGER, var83);
        return (SubLObject)SubLObjectFactory.makeBoolean(var84.isCons() && module0576.$ic52$ == ConsesLow.nth((SubLObject)module0576.ZERO_INTEGER, var84) && ConsesLow.nth((SubLObject)module0576.ONE_INTEGER, var84).isString() && module0576.NIL != module0035.f1995(var84, (SubLObject)module0576.TWO_INTEGER, (SubLObject)module0576.UNPROVIDED));
    }
    
    public static SubLObject f35361(final SubLObject var70, final SubLObject var97, final SubLObject var138) {
        SubLObject var139 = Numbers.subtract(module0095.f6854(var70), (SubLObject)module0576.ONE_INTEGER);
        final SubLObject var140 = module0095.f6852(var70);
        while (var138.numL(var139)) {
            module0095.f6858(var70, var139);
            final SubLObject var141 = module0021.f1060(var140, (SubLObject)module0576.UNPROVIDED, (SubLObject)module0576.UNPROVIDED);
            final SubLObject var142 = module0021.f1060(var140, (SubLObject)module0576.UNPROVIDED, (SubLObject)module0576.UNPROVIDED);
            f35360(var97, var142);
            var139 = Numbers.subtract(var139, (SubLObject)module0576.ONE_INTEGER);
        }
        return var97;
    }
    
    public static SubLObject f35333(final SubLObject var131, final SubLObject var97, SubLObject var147) {
        if (var147 == module0576.UNPROVIDED) {
            var147 = (SubLObject)module0576.NIL;
        }
        final SubLThread var148 = SubLProcess.currentSubLThread();
        if (module0576.NIL == Errors.$ignore_mustsP$.getDynamicValue(var148) && !var147.isVector()) {
            Errors.error((SubLObject)module0576.$ic145$);
        }
        final SubLObject var149 = f35309(var131);
        final SubLObject var150 = f35308(var131);
        SubLObject var151 = (SubLObject)module0576.MINUS_ONE_INTEGER;
        SubLObject var152 = (SubLObject)module0576.NIL;
        try {
            var152 = module0095.f6845(var149, var150, (SubLObject)module0576.$ic65$, (SubLObject)module0576.UNPROVIDED, (SubLObject)module0576.UNPROVIDED, (SubLObject)module0576.UNPROVIDED);
            final SubLObject var153 = module0095.f6854(var152);
            SubLObject var154 = (SubLObject)module0576.MINUS_ONE_INTEGER;
            SubLObject var155 = (SubLObject)module0576.ZERO_INTEGER;
            final SubLObject var156 = Sequences.cconcatenate((SubLObject)module0576.$ic94$, new SubLObject[] { module0006.f203(var153), module0576.$ic146$ });
            final SubLObject var157 = f35351((SubLObject)module0576.UNPROVIDED);
            final SubLObject var158 = f35351((SubLObject)module0576.UNPROVIDED);
            final SubLObject var159 = Numbers.subtract(var153, (SubLObject)module0576.ONE_INTEGER);
            final SubLObject var160 = var147.isVector() ? Sequences.length(var147) : Numbers.subtract(assertion_handles_oc.f11019(), (SubLObject)module0576.ONE_INTEGER);
            SubLObject var161 = (SubLObject)module0576.NIL;
            final SubLObject var162 = module0012.$g75$.currentBinding(var148);
            final SubLObject var163 = module0012.$g76$.currentBinding(var148);
            final SubLObject var164 = module0012.$g77$.currentBinding(var148);
            final SubLObject var165 = module0012.$g78$.currentBinding(var148);
            try {
                module0012.$g75$.bind((SubLObject)module0576.ZERO_INTEGER, var148);
                module0012.$g76$.bind((SubLObject)module0576.NIL, var148);
                module0012.$g77$.bind((SubLObject)module0576.T, var148);
                module0012.$g78$.bind(Time.get_universal_time(), var148);
                module0012.f478(var156);
                while (module0576.NIL == var161) {
                    SubLObject var166 = (SubLObject)module0576.ONE_INTEGER;
                    SubLObject var167 = Numbers.add(var154, var166);
                    SubLObject var168 = (SubLObject)module0576.NIL;
                    module0012.note_percent_progress(var167, var159);
                    f35366(var157, var152, var167, var159);
                    if (var147.isVector()) {
                        f35367(var158, var167, var155, var147);
                    }
                    else {
                        f35368(var158, var157, var155, var160);
                    }
                    final SubLObject var169;
                    var168 = (var169 = f35369(var157, var158));
                    if (var169.eql((SubLObject)module0576.$ic147$)) {
                        var161 = (SubLObject)module0576.T;
                    }
                    else if (var169.eql((SubLObject)module0576.$ic148$)) {
                        var161 = (SubLObject)module0576.T;
                    }
                    else if (var169.eql((SubLObject)module0576.$ic149$)) {
                        f35361(var152, var97, var153);
                        var161 = (SubLObject)module0576.T;
                    }
                    else if (var169.eql((SubLObject)module0576.$ic150$)) {
                        f35360(var97, f35342(var157));
                        var155 = Numbers.add(var155, (SubLObject)module0576.ONE_INTEGER);
                        var154 = var167;
                    }
                    else if (var169.eql((SubLObject)module0576.$ic151$)) {
                        while (var168 == module0576.$ic151$) {
                            var154 = var167;
                            var151 = f35341(var158);
                            module0012.note_percent_progress(var154, var159);
                            var167 = Numbers.add(var154, var166);
                            var166 = Numbers.add(var166, var166);
                            f35366(var157, var152, var167, var159);
                            if (var147.isVector()) {
                                f35367(var158, var167, var155, var147);
                            }
                            else {
                                f35368(var158, var157, var155, var160);
                            }
                            var168 = f35369(var157, var158);
                        }
                    }
                    else {
                        Errors.error((SubLObject)module0576.$ic152$, var168);
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var165, var148);
                module0012.$g77$.rebind(var164, var148);
                module0012.$g76$.rebind(var163, var148);
                module0012.$g75$.rebind(var162, var148);
            }
        }
        finally {
            final SubLObject var170 = Threads.$is_thread_performing_cleanupP$.currentBinding(var148);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0576.T, var148);
                if (module0576.NIL != module0095.f6844(var152)) {
                    module0095.f6849(var152);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var170, var148);
            }
        }
        return assertion_handles_oc.f11053(var151);
    }
    
    public static SubLObject f35366(final SubLObject var219, final SubLObject var70, final SubLObject var138, final SubLObject var221) {
        if (var221.numL(var138)) {
            f35364(var219);
        }
        else {
            f35356(var70, var219, var138);
        }
        return var219;
    }
    
    public static SubLObject f35367(final SubLObject var220, final SubLObject var138, final SubLObject var218, final SubLObject var147) {
        final SubLObject var221 = Numbers.subtract(var138, var218);
        f35364(var220);
        if (module0576.NIL != module0004.f106(var221) && var221.numL(Sequences.length(var147))) {
            final SubLObject var222 = Vectors.aref(var147, var221);
            f35357(var220, var222);
        }
        return var220;
    }
    
    public static SubLObject f35368(final SubLObject var220, final SubLObject var219, final SubLObject var218, final SubLObject var222) {
        final SubLObject var223 = f35341(var219);
        if (module0576.NIL != module0004.f106(var223)) {
            final SubLObject var224 = Numbers.subtract(var223, var218);
            f35370(var220, var224, var222);
        }
        else {
            f35364(var220);
        }
        return var220;
    }
    
    public static SubLObject f35370(final SubLObject var220, final SubLObject var130, final SubLObject var222) {
        if (var222.numL(var130)) {
            f35364(var220);
        }
        else {
            final SubLObject var223 = f35362(Numbers.add((SubLObject)module0576.ONE_INTEGER, var130));
            f35357(var220, var223);
        }
        return var220;
    }
    
    public static SubLObject f35369(final SubLObject var219, final SubLObject var220) {
        if (module0576.NIL == f35343(var219)) {
            if (module0576.NIL == f35343(var220)) {
                return (SubLObject)module0576.$ic147$;
            }
            return (SubLObject)module0576.$ic148$;
        }
        else {
            if (module0576.NIL == f35343(var220)) {
                return (SubLObject)module0576.$ic149$;
            }
            if (module0576.NIL != f35358(var219, var220)) {
                return (SubLObject)module0576.$ic151$;
            }
            return (SubLObject)module0576.$ic150$;
        }
    }
    
    public static SubLObject f35371(final SubLObject var225, final SubLObject var226) {
        if (module0576.NIL != module0004.f106(var226) && var226.numL(Sequences.length(var225))) {
            return Vectors.aref(var225, var226);
        }
        return (SubLObject)module0576.$ic161$;
    }
    
    public static SubLObject f35372(final SubLObject var219, final SubLObject var220) {
        if (module0576.$ic161$ == var219) {
            if (module0576.$ic161$ == var220) {
                return (SubLObject)module0576.$ic147$;
            }
            return (SubLObject)module0576.$ic148$;
        }
        else {
            if (module0576.$ic161$ == var220) {
                return (SubLObject)module0576.$ic149$;
            }
            if (var219.equal(var220)) {
                return (SubLObject)module0576.$ic151$;
            }
            return (SubLObject)module0576.$ic150$;
        }
    }
    
    public static SubLObject f35373(final SubLObject var227, final SubLObject var228) {
        final SubLThread var229 = SubLProcess.currentSubLThread();
        SubLObject var230 = (SubLObject)module0576.NIL;
        SubLObject var231 = (SubLObject)module0576.MINUS_ONE_INTEGER;
        SubLObject var232 = (SubLObject)module0576.ZERO_INTEGER;
        final SubLObject var233 = Numbers.multiply(Sequences.length(var227), Sequences.length(var228));
        SubLObject var234 = (SubLObject)module0576.ZERO_INTEGER;
        SubLObject var235 = (SubLObject)module0576.NIL;
        while (module0576.NIL == var235) {
            var234 = Numbers.add(var234, (SubLObject)module0576.ONE_INTEGER);
            if (module0576.NIL == Errors.$ignore_mustsP$.getDynamicValue(var229) && !var234.numL(var233)) {
                Errors.error((SubLObject)module0576.$ic162$);
            }
            SubLObject var236 = (SubLObject)module0576.ONE_INTEGER;
            SubLObject var237 = Numbers.add(var231, var236);
            SubLObject var238 = Numbers.subtract(var237, var232);
            SubLObject var239 = f35371(var227, var237);
            SubLObject var240 = f35371(var228, var238);
            final SubLObject var242;
            SubLObject var241 = var242 = f35372(var239, var240);
            if (var242.eql((SubLObject)module0576.$ic147$)) {
                var235 = (SubLObject)module0576.T;
            }
            else if (var242.eql((SubLObject)module0576.$ic148$)) {
                for (SubLObject var243 = Sequences.subseq(var228, var238, (SubLObject)module0576.UNPROVIDED), var244 = (SubLObject)(var243.isList() ? module0576.NIL : Sequences.length(var243)), var245 = (SubLObject)module0576.ZERO_INTEGER, var246 = module0005.f149(var245, var244, var243); module0576.NIL == var246; var246 = module0005.f149(var245, var244, var243)) {
                    final SubLObject var247 = module0005.f150(var245, var243);
                    var230 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0576.$ic163$, var247), var230);
                    var243 = module0005.f151(var243);
                    var245 = Numbers.add(var245, (SubLObject)module0576.ONE_INTEGER);
                }
                var235 = (SubLObject)module0576.T;
            }
            else if (var242.eql((SubLObject)module0576.$ic149$)) {
                for (SubLObject var243 = Sequences.subseq(var227, var237, (SubLObject)module0576.UNPROVIDED), var244 = (SubLObject)(var243.isList() ? module0576.NIL : Sequences.length(var243)), var245 = (SubLObject)module0576.ZERO_INTEGER, var246 = module0005.f149(var245, var244, var243); module0576.NIL == var246; var246 = module0005.f149(var245, var244, var243)) {
                    final SubLObject var247 = module0005.f150(var245, var243);
                    var230 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0576.$ic164$, var247), var230);
                    var243 = module0005.f151(var243);
                    var245 = Numbers.add(var245, (SubLObject)module0576.ONE_INTEGER);
                }
                var235 = (SubLObject)module0576.T;
            }
            else if (var242.eql((SubLObject)module0576.$ic150$)) {
                var230 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0576.$ic164$, var239), var230);
                var232 = Numbers.add(var232, (SubLObject)module0576.ONE_INTEGER);
                var231 = var237;
            }
            else if (var242.eql((SubLObject)module0576.$ic151$)) {
                while (var241 == module0576.$ic151$) {
                    var231 = var237;
                    var237 = Numbers.add(var231, var236);
                    var236 = Numbers.add(var236, var236);
                    var238 = Numbers.subtract(var237, var232);
                    var239 = f35371(var227, var237);
                    var240 = f35371(var228, var238);
                    var241 = f35372(var239, var240);
                    var234 = Numbers.add(var234, (SubLObject)module0576.ONE_INTEGER);
                    if (module0576.NIL == Errors.$ignore_mustsP$.getDynamicValue(var229) && !var234.numL(var233)) {
                        Errors.error((SubLObject)module0576.$ic162$);
                    }
                }
            }
            else {
                Errors.error((SubLObject)module0576.$ic152$, var241);
            }
        }
        return Sequences.nreverse(var230);
    }
    
    public static SubLObject f35374(final SubLObject var235, final SubLObject var153, final SubLObject var236) {
        final SubLObject var237 = module0077.f5313((SubLObject)module0576.EQ, var236);
        SubLObject var238 = (SubLObject)module0576.NIL;
        SubLObject var239 = (SubLObject)module0576.NIL;
        SubLObject var240 = (SubLObject)module0576.NIL;
        var239 = Vectors.make_vector(var235, (SubLObject)module0576.UNPROVIDED);
        SubLObject var241;
        for (var241 = (SubLObject)module0576.NIL, var241 = (SubLObject)module0576.ZERO_INTEGER; var241.numL(var235); var241 = Numbers.add(var241, (SubLObject)module0576.ONE_INTEGER)) {
            Vectors.set_aref(var239, var241, var241);
        }
        while (module0077.f5311(var237).numL(var236)) {
            module0077.f5326(random.random(var235), var237);
        }
        final SubLObject var242 = Numbers.add(var235, var153, Numbers.minus(var236));
        var240 = Vectors.make_vector(var242, (SubLObject)module0576.UNPROVIDED);
        SubLObject var243 = (SubLObject)module0576.ZERO_INTEGER;
        SubLObject var244;
        for (var244 = (SubLObject)module0576.NIL, var244 = (SubLObject)module0576.ZERO_INTEGER; var244.numL(var235); var244 = Numbers.add(var244, (SubLObject)module0576.ONE_INTEGER)) {
            if (module0576.NIL != module0077.f5320(var244, var237)) {
                var238 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0576.$ic164$, var244), var238);
            }
            else {
                Vectors.set_aref(var240, var243, var244);
                var243 = Numbers.add(var243, (SubLObject)module0576.ONE_INTEGER);
            }
        }
        SubLObject var245;
        for (var244 = (SubLObject)module0576.NIL, var244 = (SubLObject)module0576.ZERO_INTEGER; var244.numL(var153); var244 = Numbers.add(var244, (SubLObject)module0576.ONE_INTEGER)) {
            var245 = Numbers.add(var235, var244);
            var238 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0576.$ic163$, var245), var238);
            Vectors.set_aref(var240, var243, var245);
            var243 = Numbers.add(var243, (SubLObject)module0576.ONE_INTEGER);
        }
        return Values.values(var239, var240, Sequences.nreverse(var238));
    }
    
    public static SubLObject f35375(final SubLObject var241, final SubLObject var235, final SubLObject var242, final SubLObject var243) {
        final SubLThread var244 = SubLProcess.currentSubLThread();
        SubLObject var245;
        SubLObject var246;
        SubLObject var247;
        SubLObject var248;
        SubLObject var249;
        SubLObject var250;
        SubLObject var251;
        for (var245 = (SubLObject)module0576.NIL, var245 = (SubLObject)module0576.ZERO_INTEGER; var245.numL(var241); var245 = Numbers.add(var245, (SubLObject)module0576.ONE_INTEGER)) {
            var246 = random.random(var242);
            var247 = random.random(var243);
            var244.resetMultipleValues();
            var248 = f35374(var235, var246, var247);
            var249 = var244.secondMultipleValue();
            var250 = var244.thirdMultipleValue();
            var244.resetMultipleValues();
            var251 = f35373(var248, var249);
            if (module0576.NIL == Errors.$ignore_mustsP$.getDynamicValue(var244) && !var250.equal(var251)) {
                Errors.error((SubLObject)module0576.$ic167$, var250, var251);
            }
        }
        return (SubLObject)module0576.$ic168$;
    }
    
    public static SubLObject f35376(final SubLObject var157, final SubLObject var57) {
        compatibility.default_struct_print_function(var157, var57, (SubLObject)module0576.ZERO_INTEGER);
        return (SubLObject)module0576.NIL;
    }
    
    public static SubLObject f35322(final SubLObject var157) {
        return (SubLObject)((var157.getClass() == $sX38714_native.class) ? module0576.T : module0576.NIL);
    }
    
    public static SubLObject f35377(final SubLObject var157) {
        assert module0576.NIL != f35322(var157) : var157;
        return var157.getField2();
    }
    
    public static SubLObject f35378(final SubLObject var157) {
        assert module0576.NIL != f35322(var157) : var157;
        return var157.getField3();
    }
    
    public static SubLObject f35379(final SubLObject var157) {
        assert module0576.NIL != f35322(var157) : var157;
        return var157.getField4();
    }
    
    public static SubLObject f35380(final SubLObject var157) {
        assert module0576.NIL != f35322(var157) : var157;
        return var157.getField5();
    }
    
    public static SubLObject f35381(final SubLObject var157) {
        assert module0576.NIL != f35322(var157) : var157;
        return var157.getField6();
    }
    
    public static SubLObject f35382(final SubLObject var157) {
        assert module0576.NIL != f35322(var157) : var157;
        return var157.getField7();
    }
    
    public static SubLObject f35383(final SubLObject var157, final SubLObject var159) {
        assert module0576.NIL != f35322(var157) : var157;
        return var157.setField2(var159);
    }
    
    public static SubLObject f35384(final SubLObject var157, final SubLObject var159) {
        assert module0576.NIL != f35322(var157) : var157;
        return var157.setField3(var159);
    }
    
    public static SubLObject f35385(final SubLObject var157, final SubLObject var159) {
        assert module0576.NIL != f35322(var157) : var157;
        return var157.setField4(var159);
    }
    
    public static SubLObject f35386(final SubLObject var157, final SubLObject var159) {
        assert module0576.NIL != f35322(var157) : var157;
        return var157.setField5(var159);
    }
    
    public static SubLObject f35387(final SubLObject var157, final SubLObject var159) {
        assert module0576.NIL != f35322(var157) : var157;
        return var157.setField6(var159);
    }
    
    public static SubLObject f35388(final SubLObject var157, final SubLObject var159) {
        assert module0576.NIL != f35322(var157) : var157;
        return var157.setField7(var159);
    }
    
    public static SubLObject f35389(SubLObject var160) {
        if (var160 == module0576.UNPROVIDED) {
            var160 = (SubLObject)module0576.NIL;
        }
        final SubLObject var161 = (SubLObject)new $sX38714_native();
        SubLObject var162;
        SubLObject var163;
        SubLObject var164;
        SubLObject var165;
        for (var162 = (SubLObject)module0576.NIL, var162 = var160; module0576.NIL != var162; var162 = conses_high.cddr(var162)) {
            var163 = var162.first();
            var164 = conses_high.cadr(var162);
            var165 = var163;
            if (var165.eql((SubLObject)module0576.$ic189$)) {
                f35383(var161, var164);
            }
            else if (var165.eql((SubLObject)module0576.$ic190$)) {
                f35384(var161, var164);
            }
            else if (var165.eql((SubLObject)module0576.$ic191$)) {
                f35385(var161, var164);
            }
            else if (var165.eql((SubLObject)module0576.$ic192$)) {
                f35386(var161, var164);
            }
            else if (var165.eql((SubLObject)module0576.$ic193$)) {
                f35387(var161, var164);
            }
            else if (var165.eql((SubLObject)module0576.$ic194$)) {
                f35388(var161, var164);
            }
            else {
                Errors.error((SubLObject)module0576.$ic121$, var163);
            }
        }
        return var161;
    }
    
    public static SubLObject f35390(final SubLObject var165, final SubLObject var166) {
        Functions.funcall(var166, var165, (SubLObject)module0576.$ic122$, (SubLObject)module0576.$ic195$, (SubLObject)module0576.SIX_INTEGER);
        Functions.funcall(var166, var165, (SubLObject)module0576.$ic124$, (SubLObject)module0576.$ic189$, f35377(var165));
        Functions.funcall(var166, var165, (SubLObject)module0576.$ic124$, (SubLObject)module0576.$ic190$, f35378(var165));
        Functions.funcall(var166, var165, (SubLObject)module0576.$ic124$, (SubLObject)module0576.$ic191$, f35379(var165));
        Functions.funcall(var166, var165, (SubLObject)module0576.$ic124$, (SubLObject)module0576.$ic192$, f35380(var165));
        Functions.funcall(var166, var165, (SubLObject)module0576.$ic124$, (SubLObject)module0576.$ic193$, f35381(var165));
        Functions.funcall(var166, var165, (SubLObject)module0576.$ic124$, (SubLObject)module0576.$ic194$, f35382(var165));
        Functions.funcall(var166, var165, (SubLObject)module0576.$ic125$, (SubLObject)module0576.$ic195$, (SubLObject)module0576.SIX_INTEGER);
        return var165;
    }
    
    public static SubLObject f35391(final SubLObject var165, final SubLObject var166) {
        return f35390(var165, var166);
    }
    
    public static SubLObject f35392(final SubLObject var250, final SubLObject var251, final SubLObject var252, final SubLObject var253, final SubLObject var254, final SubLObject var255) {
        final SubLObject var256 = f35389((SubLObject)module0576.UNPROVIDED);
        f35383(var256, var250);
        f35384(var256, var251);
        f35385(var256, var252);
        f35386(var256, var253);
        f35387(var256, var254);
        f35388(var256, var255);
        return var256;
    }
    
    public static SubLObject f35323(final SubLObject var256, final SubLObject var49, final SubLObject var50) {
        final SubLObject var257 = f35378(var256);
        Functions.funcall(var257, var256, var49, var50);
        return var256;
    }
    
    public static SubLObject f35360(final SubLObject var256, final SubLObject var127) {
        final SubLObject var257 = f35379(var256);
        Functions.funcall(var257, var256, var127);
        return var256;
    }
    
    public static SubLObject f35319(final SubLObject var256, final SubLObject var259) {
        final SubLObject var260 = f35380(var256);
        Functions.funcall(var260, var256, var259);
        return var256;
    }
    
    public static SubLObject f35320(final SubLObject var256, final SubLObject var13) {
        final SubLObject var257 = f35381(var256);
        Functions.funcall(var257, var256, var13);
        return var256;
    }
    
    public static SubLObject f35393(final SubLObject var256, final SubLObject var13, SubLObject var262, SubLObject var263) {
        if (var262 == module0576.UNPROVIDED) {
            var262 = (SubLObject)module0576.NIL;
        }
        if (var263 == module0576.UNPROVIDED) {
            var263 = (SubLObject)module0576.NIL;
        }
        final SubLObject var264 = f35382(var256);
        Functions.funcall(var264, var256, var13, var262, var263);
        return var256;
    }
    
    public static SubLObject f35394(final SubLObject var256) {
        return f35377(var256);
    }
    
    public static SubLObject f35395(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0576.$ic202$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0576.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0576.$ic202$);
        var6 = var4.first();
        var4 = var4.rest();
        if (module0576.NIL == var4) {
            final SubLObject var7;
            var4 = (var7 = var5);
            return (SubLObject)ConsesLow.listS((SubLObject)module0576.$ic5$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0576.$ic203$, var6)), ConsesLow.append(var7, (SubLObject)module0576.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0576.$ic202$);
        return (SubLObject)module0576.NIL;
    }
    
    public static SubLObject f35396(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0576.$ic204$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0576.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0576.$ic204$);
        var6 = var4.first();
        var4 = var4.rest();
        if (module0576.NIL == var4) {
            final SubLObject var7;
            var4 = (var7 = var5);
            return (SubLObject)ConsesLow.listS((SubLObject)module0576.$ic5$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0576.$ic205$, var6)), ConsesLow.append(var7, (SubLObject)module0576.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0576.$ic204$);
        return (SubLObject)module0576.NIL;
    }
    
    public static SubLObject f35397(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0576.$ic206$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0576.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0576.$ic206$);
        var6 = var4.first();
        var4 = var4.rest();
        if (module0576.NIL == var4) {
            final SubLObject var7;
            var4 = (var7 = var5);
            return (SubLObject)ConsesLow.listS((SubLObject)module0576.$ic5$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0576.$ic207$, var6)), ConsesLow.append(var7, (SubLObject)module0576.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0576.$ic206$);
        return (SubLObject)module0576.NIL;
    }
    
    public static SubLObject f35398(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0576.$ic208$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0576.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0576.$ic208$);
        var6 = var4.first();
        var4 = var4.rest();
        if (module0576.NIL == var4) {
            final SubLObject var7;
            var4 = (var7 = var5);
            return (SubLObject)ConsesLow.listS((SubLObject)module0576.$ic5$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0576.$ic209$, var6)), ConsesLow.append(var7, (SubLObject)module0576.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0576.$ic208$);
        return (SubLObject)module0576.NIL;
    }
    
    public static SubLObject f35399(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0576.$ic5$, (SubLObject)module0576.$ic210$, ConsesLow.append(var5, (SubLObject)module0576.NIL));
    }
    
    public static SubLObject f35400(final SubLObject var57) {
        return f35392(var57, (SubLObject)module0576.$ic211$, (SubLObject)module0576.$ic212$, (SubLObject)module0576.$ic213$, (SubLObject)module0576.$ic214$, (SubLObject)module0576.$ic215$);
    }
    
    public static SubLObject f35401(final SubLObject var256, final SubLObject var49, final SubLObject var50) {
        final SubLThread var257 = SubLProcess.currentSubLThread();
        final SubLObject var258 = f35394(var256);
        f35402(var258);
        final SubLObject var259 = print_high.$print_level$.currentBinding(var257);
        final SubLObject var260 = print_high.$print_length$.currentBinding(var257);
        try {
            print_high.$print_level$.bind((SubLObject)module0576.NIL, var257);
            print_high.$print_length$.bind((SubLObject)module0576.NIL, var257);
            PrintLow.format(var258, (SubLObject)module0576.$ic216$, var49, var50);
        }
        finally {
            print_high.$print_length$.rebind(var260, var257);
            print_high.$print_level$.rebind(var259, var257);
        }
        f35403(var258);
        return var256;
    }
    
    public static SubLObject f35404(final SubLObject var256, final SubLObject var281) {
        final SubLThread var282 = SubLProcess.currentSubLThread();
        final SubLObject var283 = f35394(var256);
        final SubLObject var284 = f35311(var281);
        final SubLObject var285 = module0205.f13203(var284, (SubLObject)module0576.UNPROVIDED);
        f35402(var283);
        final SubLObject var286 = print_high.$print_level$.currentBinding(var282);
        final SubLObject var287 = print_high.$print_length$.currentBinding(var282);
        try {
            print_high.$print_level$.bind((SubLObject)module0576.NIL, var282);
            print_high.$print_length$.bind((SubLObject)module0576.NIL, var282);
            PrintLow.format(var283, (SubLObject)module0576.$ic217$, var284, var285);
        }
        finally {
            print_high.$print_length$.rebind(var287, var282);
            print_high.$print_level$.rebind(var286, var282);
        }
        f35403(var283);
        return var256;
    }
    
    public static SubLObject f35405(final SubLObject var256, final SubLObject var259) {
        final SubLThread var260 = SubLProcess.currentSubLThread();
        final SubLObject var261 = f35394(var256);
        final SubLObject var262 = constants_high_oc.f10743(var259);
        final SubLObject var263 = constants_high_oc.f10757(var259);
        final SubLObject var264 = print_high.$print_pretty$.currentBinding(var260);
        final SubLObject var265 = print_high.$print_length$.currentBinding(var260);
        final SubLObject var266 = print_high.$print_level$.currentBinding(var260);
        try {
            print_high.$print_pretty$.bind((SubLObject)module0576.NIL, var260);
            print_high.$print_length$.bind((SubLObject)module0576.NIL, var260);
            print_high.$print_level$.bind((SubLObject)module0576.NIL, var260);
            f35402(var261);
            PrintLow.format(var261, (SubLObject)module0576.$ic218$, var262, var263);
            f35403(var261);
        }
        finally {
            print_high.$print_level$.rebind(var266, var260);
            print_high.$print_length$.rebind(var265, var260);
            print_high.$print_pretty$.rebind(var264, var260);
        }
        f35406(var256, var259);
        return var256;
    }
    
    public static SubLObject f35407(final SubLObject var256, final SubLObject var13) {
        final SubLThread var257 = SubLProcess.currentSubLThread();
        final SubLObject var258 = f35394(var256);
        final SubLObject var259 = module0289.f19402(var13);
        final SubLObject var260 = (module0576.NIL != module0576.$g4221$.getDynamicValue(var257)) ? module0576.$g4221$.getDynamicValue(var257) : module0205.f13203(var259, (SubLObject)module0576.UNPROVIDED);
        final SubLObject var261 = module0205.f13204(var259, (SubLObject)module0576.UNPROVIDED);
        final SubLObject var262 = (module0576.NIL != module0576.$g4222$.getDynamicValue(var257)) ? module0576.$g4222$.getDynamicValue(var257) : module0178.f11291(var13);
        final SubLObject var263 = module0178.f11293(var13);
        final SubLObject var264 = print_high.$print_pretty$.currentBinding(var257);
        final SubLObject var265 = print_high.$print_length$.currentBinding(var257);
        final SubLObject var266 = print_high.$print_level$.currentBinding(var257);
        try {
            print_high.$print_pretty$.bind((SubLObject)module0576.NIL, var257);
            print_high.$print_length$.bind((SubLObject)module0576.NIL, var257);
            print_high.$print_level$.bind((SubLObject)module0576.NIL, var257);
            f35402(var258);
            PrintLow.format(var258, (SubLObject)module0576.$ic219$, new SubLObject[] { module0571.f34986(var261), module0571.f34986(var260), var263, var262 });
            f35403(var258);
        }
        finally {
            print_high.$print_level$.rebind(var266, var257);
            print_high.$print_length$.rebind(var265, var257);
            print_high.$print_pretty$.rebind(var264, var257);
        }
        f35408(var256, var13);
        return var256;
    }
    
    public static SubLObject f35409(final SubLObject var256, final SubLObject var13, SubLObject var285, SubLObject var286) {
        if (var285 == module0576.UNPROVIDED) {
            var285 = (SubLObject)module0576.NIL;
        }
        if (var286 == module0576.UNPROVIDED) {
            var286 = (SubLObject)module0576.NIL;
        }
        final SubLThread var287 = SubLProcess.currentSubLThread();
        final SubLObject var288 = f35394(var256);
        final SubLObject var289 = module0290.f19497(var13);
        final SubLObject var290 = (module0576.NIL != module0576.$g4221$.getDynamicValue(var287)) ? module0576.$g4221$.getDynamicValue(var287) : module0205.f13203(var289, (SubLObject)module0576.UNPROVIDED);
        final SubLObject var291 = (module0576.NIL != module0576.$g4222$.getDynamicValue(var287)) ? module0576.$g4222$.getDynamicValue(var287) : ((module0576.NIL != var286) ? var286 : module0178.f11291(var13));
        final SubLObject var292 = (module0576.NIL != var285) ? var285 : module0178.f11293(var13);
        final SubLObject var293 = print_high.$print_pretty$.currentBinding(var287);
        final SubLObject var294 = print_high.$print_length$.currentBinding(var287);
        final SubLObject var295 = print_high.$print_level$.currentBinding(var287);
        try {
            print_high.$print_pretty$.bind((SubLObject)module0576.NIL, var287);
            print_high.$print_length$.bind((SubLObject)module0576.NIL, var287);
            print_high.$print_level$.bind((SubLObject)module0576.NIL, var287);
            f35402(var288);
            PrintLow.format(var288, (SubLObject)module0576.$ic220$, new SubLObject[] { module0571.f34986(var289), module0571.f34986(var290), var292, var291 });
            f35403(var288);
        }
        finally {
            print_high.$print_level$.rebind(var295, var287);
            print_high.$print_length$.rebind(var294, var287);
            print_high.$print_pretty$.rebind(var293, var287);
        }
        f35408(var256, var13);
        return var256;
    }
    
    public static SubLObject f35406(final SubLObject var256, final SubLObject var259) {
        final SubLThread var260 = SubLProcess.currentSubLThread();
        final SubLObject var261 = f35394(var256);
        final SubLObject var262 = f35410((module0576.NIL != module0576.$g4219$.getDynamicValue(var260)) ? module0576.$g4219$.getDynamicValue(var260) : module0617.f37871(var259, (SubLObject)module0576.UNPROVIDED));
        final SubLObject var263 = module0617.f37872(var259, (SubLObject)module0576.UNPROVIDED);
        final SubLObject var264 = f35410((module0576.NIL != module0576.$g4220$.getDynamicValue(var260)) ? module0576.$g4220$.getDynamicValue(var260) : module0617.f37874(var259, (SubLObject)module0576.UNPROVIDED));
        final SubLObject var265 = module0617.f37875(var259, (SubLObject)module0576.UNPROVIDED);
        final SubLObject var266 = print_high.$print_pretty$.currentBinding(var260);
        final SubLObject var267 = print_high.$print_length$.currentBinding(var260);
        final SubLObject var268 = print_high.$print_level$.currentBinding(var260);
        try {
            print_high.$print_pretty$.bind((SubLObject)module0576.NIL, var260);
            print_high.$print_length$.bind((SubLObject)module0576.NIL, var260);
            print_high.$print_level$.bind((SubLObject)module0576.NIL, var260);
            f35402(var261);
            PrintLow.format(var261, (SubLObject)module0576.$ic221$, new SubLObject[] { module0571.f34986(var262), module0571.f34986(var263), module0571.f34986(var264), module0571.f34986(var265) });
        }
        finally {
            print_high.$print_level$.rebind(var268, var260);
            print_high.$print_length$.rebind(var267, var260);
            print_high.$print_pretty$.rebind(var266, var260);
        }
        f35403(var261);
        return var256;
    }
    
    public static SubLObject f35408(final SubLObject var256, final SubLObject var13) {
        final SubLThread var257 = SubLProcess.currentSubLThread();
        final SubLObject var258 = f35394(var256);
        final SubLObject var259 = f35410((module0576.NIL != module0576.$g4219$.getDynamicValue(var257)) ? module0576.$g4219$.getDynamicValue(var257) : module0178.f11295(var13));
        final SubLObject var260 = module0178.f11296(var13);
        final SubLObject var261 = f35410((module0576.NIL != module0576.$g4220$.getDynamicValue(var257)) ? module0576.$g4220$.getDynamicValue(var257) : module0178.f11297(var13));
        final SubLObject var262 = module0178.f11298(var13);
        final SubLObject var263 = print_high.$print_pretty$.currentBinding(var257);
        final SubLObject var264 = print_high.$print_length$.currentBinding(var257);
        final SubLObject var265 = print_high.$print_level$.currentBinding(var257);
        try {
            print_high.$print_pretty$.bind((SubLObject)module0576.NIL, var257);
            print_high.$print_length$.bind((SubLObject)module0576.NIL, var257);
            print_high.$print_level$.bind((SubLObject)module0576.NIL, var257);
            f35402(var258);
            PrintLow.format(var258, (SubLObject)module0576.$ic222$, new SubLObject[] { module0571.f34986(var259), module0571.f34986(var260), module0571.f34986(var261), module0571.f34986(var262) });
            f35403(var258);
        }
        finally {
            print_high.$print_level$.rebind(var265, var257);
            print_high.$print_length$.rebind(var264, var257);
            print_high.$print_pretty$.rebind(var263, var257);
        }
        return var256;
    }
    
    public static SubLObject f35410(final SubLObject var83) {
        return (SubLObject)((module0576.NIL != module0173.f10969(var83)) ? var83 : module0576.NIL);
    }
    
    public static SubLObject f35402(final SubLObject var57) {
        streams_high.fresh_line(var57);
        streams_high.write_string((SubLObject)module0576.$ic224$, var57, (SubLObject)module0576.UNPROVIDED, (SubLObject)module0576.UNPROVIDED);
        print_high.prin1(module0576.$g4223$.getGlobalValue(), var57);
        streams_high.write_string((SubLObject)module0576.$ic134$, var57, (SubLObject)module0576.UNPROVIDED, (SubLObject)module0576.UNPROVIDED);
        print_high.prin1(module0018.f967(), var57);
        streams_high.write_string((SubLObject)module0576.$ic134$, var57, (SubLObject)module0576.UNPROVIDED, (SubLObject)module0576.UNPROVIDED);
        print_high.prin1(module0051.f3557((SubLObject)module0576.UNPROVIDED, (SubLObject)module0576.UNPROVIDED), var57);
        streams_high.write_string((SubLObject)module0576.$ic134$, var57, (SubLObject)module0576.UNPROVIDED, (SubLObject)module0576.UNPROVIDED);
        return var57;
    }
    
    public static SubLObject f35403(final SubLObject var57) {
        streams_high.write_string((SubLObject)module0576.$ic225$, var57, (SubLObject)module0576.UNPROVIDED, (SubLObject)module0576.UNPROVIDED);
        streams_high.terpri(var57);
        return var57;
    }
    
    public static SubLObject f35411(SubLObject var57) {
        if (var57 == module0576.UNPROVIDED) {
            var57 = StreamsLow.$standard_output$.getDynamicValue();
        }
        return f35392(var57, (SubLObject)module0576.$ic226$, (SubLObject)module0576.$ic227$, (SubLObject)module0576.$ic228$, (SubLObject)module0576.$ic229$, (SubLObject)module0576.$ic230$);
    }
    
    public static SubLObject f35412(final SubLObject var256, final SubLObject var49, final SubLObject var50) {
        final SubLObject var257 = f35394(var256);
        PrintLow.format(var257, (SubLObject)module0576.$ic231$, var49, var50);
        return var256;
    }
    
    public static SubLObject f35413(final SubLObject var256, final SubLObject var127) {
        final SubLObject var257 = f35394(var256);
        PrintLow.format(var257, (SubLObject)module0576.$ic232$, var127);
        return var256;
    }
    
    public static SubLObject f35414(final SubLObject var256, final SubLObject var259) {
        final SubLObject var260 = f35394(var256);
        final SubLObject var261 = constants_high_oc.f10743(var259);
        final SubLObject var262 = constants_high_oc.f10757(var259);
        PrintLow.format(var260, (SubLObject)module0576.$ic233$, var261, var262);
        return var256;
    }
    
    public static SubLObject f35415(final SubLObject var256, final SubLObject var13) {
        final SubLObject var257 = f35394(var256);
        final SubLObject var258 = module0289.f19402(var13);
        PrintLow.format(var257, (SubLObject)module0576.$ic234$, var258);
        return var256;
    }
    
    public static SubLObject f35416(final SubLObject var256, final SubLObject var13, SubLObject var262, SubLObject var263) {
        if (var262 == module0576.UNPROVIDED) {
            var262 = (SubLObject)module0576.NIL;
        }
        if (var263 == module0576.UNPROVIDED) {
            var263 = (SubLObject)module0576.NIL;
        }
        final SubLObject var264 = f35394(var256);
        final SubLObject var265 = module0289.f19402(var13);
        PrintLow.format(var264, (SubLObject)module0576.$ic235$, new SubLObject[] { var265, var262, var263 });
        return var256;
    }
    
    public static SubLObject f35417() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0576", "f35301", "S#38716");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0576", "f35302", "S#38717");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35303", "S#38718", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35304", "S#38719", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35305", "PICKLE-CONSTANTS", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0576", "f35306", "DO-PICKLED-CONSTANTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35307", "PICKLE-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35308", "S#38720", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35309", "S#38721", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35310", "ASSERTION-TO-PICKLING-FORMAT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35311", "UNPICKLE-ASSERTION-PICKLING-FORMAT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35312", "S#38722", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35313", "S#38723", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35314", "S#38724", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35315", "NEW-RELEVANT-ASSERTIONS-ID-SPACE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35316", "COMPARE-PICKLED-KB-TO-CURRENT-KB", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35318", "ENUMERATE-ADDITIONS-TO-CURRENT-KB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35321", "S#38725", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0576", "f35324", "S#38726");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0576", "f35325", "S#38727");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35326", "S#38728", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35328", "S#38729", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35317", "S#38730", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35331", "S#38731", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35332", "S#38732", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35330", "S#38733", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35329", "S#38734", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35334", "S#38735", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35336", "S#38736", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35338", "S#38737", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35340", "S#38713", 1, 0, false);
        new $f35340$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35341", "S#38738", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35342", "S#38739", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35343", "S#38740", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35344", "S#38741", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35345", "S#38742", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35346", "S#38743", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35347", "S#38744", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35348", "S#38745", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35349", "S#38746", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35350", "S#38747", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35351", "S#38748", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35352", "S#38749", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35353", "S#38750", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35339", "S#38751", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35335", "S#38752", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35354", "S#38753", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35355", "S#38754", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35327", "S#38755", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35337", "S#38756", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35358", "S#38757", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35362", "S#38758", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35359", "S#38759", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35356", "S#38760", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35357", "S#38761", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35364", "S#38762", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35363", "S#38763", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35365", "S#38764", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35361", "S#38765", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35333", "S#38766", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35366", "S#38767", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35367", "S#38768", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35368", "S#38769", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35370", "S#38770", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35369", "S#38771", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35371", "S#38772", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35372", "S#38773", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35373", "S#38774", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35374", "S#38775", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35375", "S#38776", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35376", "S#38777", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35322", "S#38715", 1, 0, false);
        new $f35322$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35377", "S#38778", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35378", "S#38779", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35379", "S#38780", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35380", "S#38781", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35381", "S#38782", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35382", "S#38783", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35383", "S#38784", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35384", "S#38785", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35385", "S#38786", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35386", "S#38787", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35387", "S#38788", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35388", "S#38789", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35389", "S#38790", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35390", "S#38791", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35391", "S#38792", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35392", "S#38793", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35323", "NOTE-EL-PARTITION-BRANCH-CONSTANT-DELETE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35360", "NOTE-EL-PARTITION-BRANCH-ASSERTION-DELETE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35319", "NOTE-EL-PARTITION-TIP-CONSTANT-CREATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35320", "NOTE-EL-PARTITION-TIP-ASSERTION-CREATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35393", "NOTE-EL-PARTITION-TIP-ASSERTION-REASSERT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35394", "S#38794", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0576", "f35395", "S#38795");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0576", "f35396", "S#38796");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0576", "f35397", "S#38797");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0576", "f35398", "S#38798");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0576", "f35399", "S#38799");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35400", "S#38800", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35401", "S#38801", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35404", "S#38802", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35405", "S#38803", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35407", "S#38804", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35409", "S#38805", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35406", "S#38806", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35408", "S#38807", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35410", "S#38808", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35402", "S#38809", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35403", "S#38810", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35411", "S#38811", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35412", "S#38812", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35413", "S#38813", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35414", "S#38814", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35415", "S#38815", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0576", "f35416", "S#38816", 2, 2, false);
        return (SubLObject)module0576.NIL;
    }
    
    public static SubLObject f35418() {
        module0576.$g4213$ = SubLFiles.deflexical("S#38817", Numbers.multiply((SubLObject)module0576.FOUR_INTEGER, (SubLObject)module0576.$ic0$, (SubLObject)module0576.$ic0$));
        module0576.$g4214$ = SubLFiles.defparameter("S#38818", module0576.$g4213$.getGlobalValue());
        module0576.$g4215$ = SubLFiles.deflexical("S#38819", (SubLObject)module0576.$ic89$);
        module0576.$g4216$ = SubLFiles.defconstant("S#38820", (SubLObject)module0576.$ic97$);
        module0576.$g4217$ = SubLFiles.deflexical("S#38821", (SubLObject)module0576.NIL);
        module0576.$g4218$ = SubLFiles.defconstant("S#38822", (SubLObject)module0576.$ic169$);
        module0576.$g4219$ = SubLFiles.defparameter("S#38823", (SubLObject)module0576.NIL);
        module0576.$g4220$ = SubLFiles.defparameter("S#38824", (SubLObject)module0576.NIL);
        module0576.$g4221$ = SubLFiles.defparameter("S#38825", (SubLObject)module0576.NIL);
        module0576.$g4222$ = SubLFiles.defparameter("S#38826", (SubLObject)module0576.NIL);
        module0576.$g4223$ = SubLFiles.deflexical("S#38827", (SubLObject)module0576.$ic223$);
        return (SubLObject)module0576.NIL;
    }
    
    public static SubLObject f35419() {
        module0002.f38((SubLObject)module0576.$ic12$);
        module0002.f38((SubLObject)module0576.$ic19$);
        module0002.f38((SubLObject)module0576.$ic43$);
        module0002.f38((SubLObject)module0576.$ic47$);
        module0002.f38((SubLObject)module0576.$ic49$);
        module0002.f38((SubLObject)module0576.$ic55$);
        module0002.f38((SubLObject)module0576.$ic58$);
        module0002.f38((SubLObject)module0576.$ic59$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0576.$g4216$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0576.$ic104$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0576.$ic105$);
        Structures.def_csetf((SubLObject)module0576.$ic106$, (SubLObject)module0576.$ic107$);
        Structures.def_csetf((SubLObject)module0576.$ic108$, (SubLObject)module0576.$ic109$);
        Structures.def_csetf((SubLObject)module0576.$ic110$, (SubLObject)module0576.$ic111$);
        Structures.def_csetf((SubLObject)module0576.$ic112$, (SubLObject)module0576.$ic113$);
        Structures.def_csetf((SubLObject)module0576.$ic114$, (SubLObject)module0576.$ic115$);
        Equality.identity((SubLObject)module0576.$ic97$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0576.$g4216$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0576.$ic126$));
        module0027.f1449((SubLObject)module0576.$ic153$, (SubLObject)ConsesLow.list(new SubLObject[] { module0576.$ic154$, module0576.EQUAL, module0576.$ic155$, module0576.NIL, module0576.$ic156$, module0576.NIL, module0576.$ic157$, module0576.$ic158$, module0576.$ic159$, module0576.T }), module0576.$ic160$);
        module0027.f1449((SubLObject)module0576.$ic165$, (SubLObject)ConsesLow.list(new SubLObject[] { module0576.$ic154$, module0576.EQUAL, module0576.$ic155$, module0576.NIL, module0576.$ic156$, module0576.NIL, module0576.$ic157$, module0576.$ic158$, module0576.$ic159$, module0576.T }), (SubLObject)module0576.$ic166$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0576.$g4218$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0576.$ic175$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0576.$ic176$);
        Structures.def_csetf((SubLObject)module0576.$ic177$, (SubLObject)module0576.$ic178$);
        Structures.def_csetf((SubLObject)module0576.$ic179$, (SubLObject)module0576.$ic180$);
        Structures.def_csetf((SubLObject)module0576.$ic181$, (SubLObject)module0576.$ic182$);
        Structures.def_csetf((SubLObject)module0576.$ic183$, (SubLObject)module0576.$ic184$);
        Structures.def_csetf((SubLObject)module0576.$ic185$, (SubLObject)module0576.$ic186$);
        Structures.def_csetf((SubLObject)module0576.$ic187$, (SubLObject)module0576.$ic188$);
        Equality.identity((SubLObject)module0576.$ic169$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0576.$g4218$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0576.$ic196$));
        module0002.f38((SubLObject)module0576.$ic197$);
        module0002.f38((SubLObject)module0576.$ic198$);
        module0002.f38((SubLObject)module0576.$ic199$);
        module0002.f38((SubLObject)module0576.$ic200$);
        module0002.f38((SubLObject)module0576.$ic201$);
        return (SubLObject)module0576.NIL;
    }
    
    private static SubLObject _constant_160_initializer() {
        return (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(new SubLObject[] { SubLObjectFactory.makeSymbol("S#173", "CYC"), SubLObjectFactory.makeSymbol("S#174", "CYC"), SubLObjectFactory.makeSymbol("S#9181", "CYC"), SubLObjectFactory.makeSymbol("S#9178", "CYC"), SubLObjectFactory.makeSymbol("S#9177", "CYC") }), Vectors.vector(new SubLObject[] { SubLObjectFactory.makeSymbol("S#173", "CYC"), SubLObjectFactory.makeSymbol("S#174", "CYC"), SubLObjectFactory.makeSymbol("S#9181", "CYC"), SubLObjectFactory.makeSymbol("S#9178", "CYC"), SubLObjectFactory.makeSymbol("S#9177", "CYC") })), (SubLObject)module0576.NIL), ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(new SubLObject[] { SubLObjectFactory.makeSymbol("S#173", "CYC"), SubLObjectFactory.makeSymbol("S#174", "CYC"), SubLObjectFactory.makeSymbol("S#9181", "CYC"), SubLObjectFactory.makeSymbol("S#9178", "CYC") }), Vectors.vector(new SubLObject[] { SubLObjectFactory.makeSymbol("S#173", "CYC"), SubLObjectFactory.makeSymbol("S#9178", "CYC") })), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DELETE"), (SubLObject)SubLObjectFactory.makeSymbol("S#174", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DELETE"), (SubLObject)SubLObjectFactory.makeSymbol("S#9181", "CYC")))), ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(new SubLObject[] { SubLObjectFactory.makeSymbol("S#173", "CYC"), SubLObjectFactory.makeSymbol("S#174", "CYC"), SubLObjectFactory.makeSymbol("S#9181", "CYC"), SubLObjectFactory.makeSymbol("S#9178", "CYC"), SubLObjectFactory.makeSymbol("S#9177", "CYC") }), Vectors.vector(new SubLObject[] { SubLObjectFactory.makeSymbol("S#174", "CYC"), SubLObjectFactory.makeSymbol("S#9181", "CYC"), SubLObjectFactory.makeSymbol("S#9178", "CYC") })), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DELETE"), (SubLObject)SubLObjectFactory.makeSymbol("S#173", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DELETE"), (SubLObject)SubLObjectFactory.makeSymbol("S#9177", "CYC")))), ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(new SubLObject[] { SubLObjectFactory.makeSymbol("S#173", "CYC"), SubLObjectFactory.makeSymbol("S#174", "CYC"), SubLObjectFactory.makeSymbol("S#9181", "CYC"), SubLObjectFactory.makeSymbol("S#9178", "CYC"), SubLObjectFactory.makeSymbol("S#9177", "CYC") }), Vectors.vector(new SubLObject[] { SubLObjectFactory.makeSymbol("S#174", "CYC"), SubLObjectFactory.makeSymbol("S#9181", "CYC"), SubLObjectFactory.makeSymbol("S#9177", "CYC"), SubLObjectFactory.makeSymbol("S#9179", "CYC"), SubLObjectFactory.makeSymbol("S#9180", "CYC") })), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DELETE"), (SubLObject)SubLObjectFactory.makeSymbol("S#173", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DELETE"), (SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CREATE"), (SubLObject)SubLObjectFactory.makeSymbol("S#9179", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CREATE"), (SubLObject)SubLObjectFactory.makeSymbol("S#9180", "CYC")))), ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(new SubLObject[] { SubLObjectFactory.makeSymbol("S#173", "CYC"), SubLObjectFactory.makeSymbol("S#174", "CYC"), SubLObjectFactory.makeSymbol("S#9181", "CYC"), SubLObjectFactory.makeSymbol("S#9178", "CYC"), SubLObjectFactory.makeSymbol("S#9177", "CYC") }), Vectors.vector(new SubLObject[] { SubLObjectFactory.makeSymbol("S#9179", "CYC"), SubLObjectFactory.makeSymbol("S#9180", "CYC"), SubLObjectFactory.makeSymbol("S#38842", "CYC"), SubLObjectFactory.makeSymbol("S#38843", "CYC"), SubLObjectFactory.makeSymbol("S#38844", "CYC") })), (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DELETE"), (SubLObject)SubLObjectFactory.makeSymbol("S#173", "CYC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DELETE"), (SubLObject)SubLObjectFactory.makeSymbol("S#174", "CYC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DELETE"), (SubLObject)SubLObjectFactory.makeSymbol("S#9181", "CYC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DELETE"), (SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DELETE"), (SubLObject)SubLObjectFactory.makeSymbol("S#9177", "CYC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CREATE"), (SubLObject)SubLObjectFactory.makeSymbol("S#9179", "CYC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CREATE"), (SubLObject)SubLObjectFactory.makeSymbol("S#9180", "CYC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CREATE"), (SubLObject)SubLObjectFactory.makeSymbol("S#38842", "CYC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CREATE"), (SubLObject)SubLObjectFactory.makeSymbol("S#38843", "CYC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CREATE"), (SubLObject)SubLObjectFactory.makeSymbol("S#38844", "CYC")) })), ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(new SubLObject[] { SubLObjectFactory.makeSymbol("S#173", "CYC"), SubLObjectFactory.makeSymbol("S#174", "CYC"), SubLObjectFactory.makeSymbol("S#9181", "CYC"), SubLObjectFactory.makeSymbol("S#9178", "CYC"), SubLObjectFactory.makeSymbol("S#9177", "CYC"), SubLObjectFactory.makeSymbol("S#9179", "CYC"), SubLObjectFactory.makeSymbol("S#9180", "CYC"), SubLObjectFactory.makeSymbol("S#38842", "CYC"), SubLObjectFactory.makeSymbol("S#38843", "CYC"), SubLObjectFactory.makeSymbol("S#38844", "CYC"), SubLObjectFactory.makeSymbol("S#38845", "CYC"), SubLObjectFactory.makeSymbol("S#38846", "CYC"), SubLObjectFactory.makeSymbol("S#13112", "CYC"), SubLObjectFactory.makeSymbol("S#770", "CYC") }), Vectors.vector(new SubLObject[] { SubLObjectFactory.makeSymbol("S#173", "CYC"), SubLObjectFactory.makeSymbol("S#174", "CYC"), SubLObjectFactory.makeSymbol("S#9181", "CYC"), SubLObjectFactory.makeSymbol("S#38842", "CYC"), SubLObjectFactory.makeSymbol("S#38843", "CYC"), SubLObjectFactory.makeSymbol("S#38844", "CYC"), SubLObjectFactory.makeSymbol("S#38845", "CYC"), SubLObjectFactory.makeSymbol("S#38846", "CYC"), SubLObjectFactory.makeSymbol("S#13112", "CYC"), SubLObjectFactory.makeSymbol("S#770", "CYC") })), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DELETE"), (SubLObject)SubLObjectFactory.makeSymbol("S#9178", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DELETE"), (SubLObject)SubLObjectFactory.makeSymbol("S#9177", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DELETE"), (SubLObject)SubLObjectFactory.makeSymbol("S#9179", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DELETE"), (SubLObject)SubLObjectFactory.makeSymbol("S#9180", "CYC")))), ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(new SubLObject[] { module0576.ZERO_INTEGER, module0576.ONE_INTEGER, module0576.TWO_INTEGER, module0576.THREE_INTEGER, module0576.FOUR_INTEGER, module0576.FIVE_INTEGER, module0576.SIX_INTEGER, module0576.SEVEN_INTEGER, module0576.EIGHT_INTEGER, module0576.NINE_INTEGER, module0576.TEN_INTEGER, module0576.ELEVEN_INTEGER, module0576.TWELVE_INTEGER, module0576.THIRTEEN_INTEGER, module0576.FOURTEEN_INTEGER, module0576.FIFTEEN_INTEGER, module0576.SIXTEEN_INTEGER, module0576.SEVENTEEN_INTEGER, module0576.EIGHTEEN_INTEGER, module0576.NINETEEN_INTEGER, module0576.TWENTY_INTEGER, SubLObjectFactory.makeInteger(21), SubLObjectFactory.makeInteger(22), SubLObjectFactory.makeInteger(23), SubLObjectFactory.makeInteger(24), SubLObjectFactory.makeInteger(25), SubLObjectFactory.makeInteger(26), SubLObjectFactory.makeInteger(27), SubLObjectFactory.makeInteger(28), SubLObjectFactory.makeInteger(29) }), Vectors.vector(new SubLObject[] { module0576.ZERO_INTEGER, module0576.ONE_INTEGER, module0576.TWO_INTEGER, module0576.THREE_INTEGER, module0576.FIVE_INTEGER, module0576.SIX_INTEGER, module0576.SEVEN_INTEGER, module0576.EIGHT_INTEGER, module0576.TEN_INTEGER, module0576.ELEVEN_INTEGER, module0576.TWELVE_INTEGER, module0576.THIRTEEN_INTEGER, module0576.FOURTEEN_INTEGER, module0576.FIFTEEN_INTEGER, module0576.SEVENTEEN_INTEGER, module0576.EIGHTEEN_INTEGER, module0576.NINETEEN_INTEGER, module0576.TWENTY_INTEGER, SubLObjectFactory.makeInteger(21), SubLObjectFactory.makeInteger(22), SubLObjectFactory.makeInteger(23), SubLObjectFactory.makeInteger(24), SubLObjectFactory.makeInteger(26), SubLObjectFactory.makeInteger(27), SubLObjectFactory.makeInteger(28), SubLObjectFactory.makeInteger(29), SubLObjectFactory.makeInteger(30), SubLObjectFactory.makeInteger(31), SubLObjectFactory.makeInteger(32) })), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DELETE"), (SubLObject)module0576.FOUR_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DELETE"), (SubLObject)module0576.NINE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DELETE"), (SubLObject)module0576.SIXTEEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DELETE"), (SubLObject)SubLObjectFactory.makeInteger(25)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CREATE"), (SubLObject)SubLObjectFactory.makeInteger(30)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CREATE"), (SubLObject)SubLObjectFactory.makeInteger(31)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CREATE"), (SubLObject)SubLObjectFactory.makeInteger(32)))), ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(new SubLObject[] { module0576.ZERO_INTEGER, module0576.ONE_INTEGER, module0576.TWO_INTEGER, module0576.THREE_INTEGER, module0576.FOUR_INTEGER, module0576.FIVE_INTEGER, module0576.SIX_INTEGER, module0576.SEVEN_INTEGER, module0576.EIGHT_INTEGER, module0576.NINE_INTEGER, module0576.TEN_INTEGER, module0576.ELEVEN_INTEGER, module0576.TWELVE_INTEGER, module0576.THIRTEEN_INTEGER, module0576.FOURTEEN_INTEGER, module0576.FIFTEEN_INTEGER, module0576.SIXTEEN_INTEGER, module0576.SEVENTEEN_INTEGER, module0576.EIGHTEEN_INTEGER, module0576.NINETEEN_INTEGER, module0576.TWENTY_INTEGER, SubLObjectFactory.makeInteger(21), SubLObjectFactory.makeInteger(22), SubLObjectFactory.makeInteger(23), SubLObjectFactory.makeInteger(24), SubLObjectFactory.makeInteger(25), SubLObjectFactory.makeInteger(26), SubLObjectFactory.makeInteger(27), SubLObjectFactory.makeInteger(28), SubLObjectFactory.makeInteger(29) }), Vectors.vector(new SubLObject[] { module0576.ZERO_INTEGER, module0576.ONE_INTEGER, module0576.TWO_INTEGER, module0576.THREE_INTEGER, module0576.FOUR_INTEGER, module0576.FIVE_INTEGER, module0576.SIX_INTEGER, module0576.SEVEN_INTEGER, module0576.EIGHT_INTEGER, module0576.NINE_INTEGER, module0576.TEN_INTEGER, module0576.ELEVEN_INTEGER, module0576.TWELVE_INTEGER, module0576.THIRTEEN_INTEGER, module0576.FOURTEEN_INTEGER, module0576.FIFTEEN_INTEGER, module0576.SIXTEEN_INTEGER, module0576.SEVENTEEN_INTEGER, module0576.EIGHTEEN_INTEGER, module0576.NINETEEN_INTEGER, module0576.TWENTY_INTEGER, SubLObjectFactory.makeInteger(21), SubLObjectFactory.makeInteger(22), SubLObjectFactory.makeInteger(23), SubLObjectFactory.makeInteger(24), SubLObjectFactory.makeInteger(25), SubLObjectFactory.makeInteger(26), SubLObjectFactory.makeInteger(27), SubLObjectFactory.makeInteger(28) })), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DELETE"), (SubLObject)SubLObjectFactory.makeInteger(29)))), ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(new SubLObject[] { module0576.ZERO_INTEGER, module0576.ONE_INTEGER, module0576.TWO_INTEGER, module0576.THREE_INTEGER, module0576.FOUR_INTEGER, module0576.FIVE_INTEGER, module0576.SIX_INTEGER, module0576.SEVEN_INTEGER, module0576.EIGHT_INTEGER, module0576.NINE_INTEGER, module0576.TEN_INTEGER, module0576.ELEVEN_INTEGER, module0576.TWELVE_INTEGER, module0576.THIRTEEN_INTEGER, module0576.FOURTEEN_INTEGER, module0576.FIFTEEN_INTEGER, module0576.SIXTEEN_INTEGER, module0576.SEVENTEEN_INTEGER, module0576.EIGHTEEN_INTEGER, module0576.NINETEEN_INTEGER, module0576.TWENTY_INTEGER, SubLObjectFactory.makeInteger(21), SubLObjectFactory.makeInteger(22), SubLObjectFactory.makeInteger(23), SubLObjectFactory.makeInteger(24), SubLObjectFactory.makeInteger(25), SubLObjectFactory.makeInteger(26), SubLObjectFactory.makeInteger(27), SubLObjectFactory.makeInteger(28), SubLObjectFactory.makeInteger(29), SubLObjectFactory.makeInteger(30), SubLObjectFactory.makeInteger(31), SubLObjectFactory.makeInteger(32), SubLObjectFactory.makeInteger(33), SubLObjectFactory.makeInteger(34), SubLObjectFactory.makeInteger(35), SubLObjectFactory.makeInteger(36), SubLObjectFactory.makeInteger(37), SubLObjectFactory.makeInteger(38), SubLObjectFactory.makeInteger(39) }), Vectors.vector(new SubLObject[] { module0576.ZERO_INTEGER, module0576.ONE_INTEGER, module0576.TWO_INTEGER, module0576.THREE_INTEGER, module0576.FOUR_INTEGER, module0576.FIVE_INTEGER, module0576.SIX_INTEGER, module0576.SEVEN_INTEGER, module0576.EIGHT_INTEGER, module0576.NINE_INTEGER, module0576.TEN_INTEGER, module0576.ELEVEN_INTEGER, module0576.TWELVE_INTEGER, module0576.THIRTEEN_INTEGER, module0576.FOURTEEN_INTEGER, module0576.FIFTEEN_INTEGER, module0576.SIXTEEN_INTEGER, module0576.SEVENTEEN_INTEGER, module0576.EIGHTEEN_INTEGER, module0576.NINETEEN_INTEGER, module0576.TWENTY_INTEGER, SubLObjectFactory.makeInteger(21), SubLObjectFactory.makeInteger(22), SubLObjectFactory.makeInteger(23), SubLObjectFactory.makeInteger(24), SubLObjectFactory.makeInteger(25), SubLObjectFactory.makeInteger(26), SubLObjectFactory.makeInteger(27), SubLObjectFactory.makeInteger(28), SubLObjectFactory.makeInteger(29), SubLObjectFactory.makeInteger(30), SubLObjectFactory.makeInteger(31), SubLObjectFactory.makeInteger(32), SubLObjectFactory.makeInteger(33), SubLObjectFactory.makeInteger(34), SubLObjectFactory.makeInteger(35), SubLObjectFactory.makeInteger(36), SubLObjectFactory.makeInteger(37), SubLObjectFactory.makeInteger(38), SubLObjectFactory.makeInteger(40) })), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DELETE"), (SubLObject)SubLObjectFactory.makeInteger(39)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CREATE"), (SubLObject)SubLObjectFactory.makeInteger(40)))) });
    }
    
    public void declareFunctions() {
        f35417();
    }
    
    public void initializeVariables() {
        f35418();
    }
    
    public void runTopLevelForms() {
        f35419();
    }
    
    static {
        me = (SubLFile)new module0576();
        module0576.$g4213$ = null;
        module0576.$g4214$ = null;
        module0576.$g4215$ = null;
        module0576.$g4216$ = null;
        module0576.$g4217$ = null;
        module0576.$g4218$ = null;
        module0576.$g4219$ = null;
        module0576.$g4220$ = null;
        module0576.$g4221$ = null;
        module0576.$g4222$ = null;
        module0576.$g4223$ = null;
        $ic0$ = SubLObjectFactory.makeInteger(1024);
        $ic1$ = SubLObjectFactory.makeSymbol("S#6776", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#38818", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#702", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#295", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic4$ = SubLObjectFactory.makeUninternedSymbol("US#55618C5");
        $ic5$ = SubLObjectFactory.makeSymbol("CLET");
        $ic6$ = ConsesLow.list((SubLObject)module0576.ZERO_INTEGER);
        $ic7$ = SubLObjectFactory.makeSymbol("NOTING-PERCENT-PROGRESS");
        $ic8$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic9$ = SubLObjectFactory.makeSymbol("CINC");
        $ic10$ = SubLObjectFactory.makeSymbol("NOTE-PERCENT-PROGRESS");
        $ic11$ = SubLObjectFactory.makeSymbol("S#19639", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("PICKLE-CONSTANTS");
        $ic13$ = SubLObjectFactory.makeString("Pickling constants to ");
        $ic14$ = SubLObjectFactory.makeString(" ....");
        $ic15$ = SubLObjectFactory.makeKeyword("OUTPUT");
        $ic16$ = SubLObjectFactory.makeString("Unable to open ~S");
        $ic17$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic18$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic19$ = SubLObjectFactory.makeSymbol("DO-PICKLED-CONSTANTS");
        $ic20$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10593", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("GUID"), (SubLObject)SubLObjectFactory.makeSymbol("S#885", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#295", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic21$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MESSAGE"));
        $ic22$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic23$ = SubLObjectFactory.makeKeyword("MESSAGE");
        $ic24$ = SubLObjectFactory.makeUninternedSymbol("US#541F852");
        $ic25$ = SubLObjectFactory.makeUninternedSymbol("US#33E32D8");
        $ic26$ = SubLObjectFactory.makeUninternedSymbol("US#74E6892");
        $ic27$ = SubLObjectFactory.makeSymbol("S#38716", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("WITH-PRIVATE-BINARY-FILE");
        $ic29$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT"));
        $ic30$ = SubLObjectFactory.makeSymbol("S#2100", "CYC");
        $ic31$ = SubLObjectFactory.makeSymbol("FIF");
        $ic32$ = SubLObjectFactory.makeSymbol("NULL");
        $ic33$ = SubLObjectFactory.makeSymbol("S#176", "CYC");
        $ic34$ = SubLObjectFactory.makeString("Reading pickled constants from ~A ....");
        $ic35$ = SubLObjectFactory.makeSymbol("S#38717", "CYC");
        $ic36$ = SubLObjectFactory.makeSymbol("CDO");
        $ic37$ = SubLObjectFactory.makeSymbol("MUST");
        $ic38$ = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic39$ = SubLObjectFactory.makeString("Read invalid SUID ~A from ~A.");
        $ic40$ = SubLObjectFactory.makeString("Read invalid NAME ~A from ~A.");
        $ic41$ = SubLObjectFactory.makeSymbol("GUID-P");
        $ic42$ = SubLObjectFactory.makeString("Read invalid GUID ~A from ~A.");
        $ic43$ = SubLObjectFactory.makeSymbol("PICKLE-ASSERTIONS");
        $ic44$ = SubLObjectFactory.makeString("Pickling assertions to file-vector with prefix ");
        $ic45$ = SubLObjectFactory.makeString("-index.cfasl");
        $ic46$ = SubLObjectFactory.makeString(".cfasl");
        $ic47$ = SubLObjectFactory.makeSymbol("ASSERTION-TO-PICKLING-FORMAT");
        $ic48$ = SubLObjectFactory.makeSymbol("S#38722", "CYC");
        $ic49$ = SubLObjectFactory.makeSymbol("UNPICKLE-ASSERTION-PICKLING-FORMAT");
        $ic50$ = SubLObjectFactory.makeSymbol("S#38723", "CYC");
        $ic51$ = SubLObjectFactory.makeSymbol("S#38724", "CYC");
        $ic52$ = SubLObjectFactory.makeKeyword("GUID");
        $ic53$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#38828", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#35388", "CYC"));
        $ic54$ = SubLObjectFactory.makeString("Cannot restore ~A ... not a pickled GUID.");
        $ic55$ = SubLObjectFactory.makeSymbol("NEW-RELEVANT-ASSERTIONS-ID-SPACE");
        $ic56$ = SubLObjectFactory.makeString("Computing EL Partition relevant assertion ID space ....");
        $ic57$ = SubLObjectFactory.makeString("Whoa, we underflowed the ID space counter.");
        $ic58$ = SubLObjectFactory.makeSymbol("COMPARE-PICKLED-KB-TO-CURRENT-KB");
        $ic59$ = SubLObjectFactory.makeSymbol("ENUMERATE-ADDITIONS-TO-CURRENT-KB");
        $ic60$ = SubLObjectFactory.makeString("Enumerating new constants ....");
        $ic61$ = SubLObjectFactory.makeString("Enumerating new assertions ....");
        $ic62$ = SubLObjectFactory.makeSymbol("S#38715", "CYC");
        $ic63$ = SubLObjectFactory.makeSymbol("S#38718", "CYC");
        $ic64$ = SubLObjectFactory.makeKeyword("DONE");
        $ic65$ = SubLObjectFactory.makeKeyword("INPUT");
        $ic66$ = SubLObjectFactory.makeString("Reading pickled constants from ");
        $ic67$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#38829", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#38830", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#38831", "CYC"));
        $ic68$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic69$ = SubLObjectFactory.makeSymbol("S#5123", "CYC");
        $ic70$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic71$ = SubLObjectFactory.makeSymbol("FWHEN");
        $ic72$ = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $ic73$ = SubLObjectFactory.makeSymbol("S#22122", "CYC");
        $ic74$ = SubLObjectFactory.makeSymbol("S#22114", "CYC");
        $ic75$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#38832", "CYC"));
        $ic76$ = SubLObjectFactory.makeSymbol("CDEC");
        $ic77$ = SubLObjectFactory.makeSymbol("UNTIL");
        $ic78$ = SubLObjectFactory.makeSymbol("S#38719", "CYC");
        $ic79$ = SubLObjectFactory.makeSymbol("FIND-ASSERTION-BY-ID");
        $ic80$ = SubLObjectFactory.makeString("Implementation error: Tip index ~A underflowed.");
        $ic81$ = SubLObjectFactory.makeString("Implementation error: branch index underflowed.");
        $ic82$ = SubLObjectFactory.makeString("Implementation error: tip index underflowed.");
        $ic83$ = SubLObjectFactory.makeKeyword("NOT-FOUND");
        $ic84$ = SubLObjectFactory.makeKeyword("SHARED-ASSERTION");
        $ic85$ = SubLObjectFactory.makeKeyword("BRANCH-AS-ID");
        $ic86$ = SubLObjectFactory.makeKeyword("BRANCH-INDEX");
        $ic87$ = SubLObjectFactory.makeKeyword("BRANCH-COUNT");
        $ic88$ = SubLObjectFactory.makeKeyword("JUST-ASSERTED-P");
        $ic89$ = SubLObjectFactory.makeKeyword("SCAN-FORWARD-STEADY");
        $ic90$ = SubLObjectFactory.makeKeyword("CLASSIC-BACKWARD");
        $ic91$ = SubLObjectFactory.makeKeyword("NOVEL-FORWARD");
        $ic92$ = SubLObjectFactory.makeKeyword("SCAN-FORWARD-FAST");
        $ic93$ = SubLObjectFactory.makeString("Pickled KB Comparison Strategy ~S not yet implemented.");
        $ic94$ = SubLObjectFactory.makeString("Analyzing ");
        $ic95$ = SubLObjectFactory.makeString(" new assertions ....");
        $ic96$ = SubLObjectFactory.makeString("This algorithm is not designed to deal with gaps in assertion ID space. Dump KB first.");
        $ic97$ = SubLObjectFactory.makeSymbol("S#38712", "CYC");
        $ic98$ = SubLObjectFactory.makeSymbol("S#38713", "CYC");
        $ic99$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1519", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#38831", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2310", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#38833", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#38834", "CYC"));
        $ic100$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"), (SubLObject)SubLObjectFactory.makeKeyword("TL-IST-FORMULA"), (SubLObject)SubLObjectFactory.makeKeyword("HASH"), (SubLObject)SubLObjectFactory.makeKeyword("EXTRA"), (SubLObject)SubLObjectFactory.makeKeyword("WEAK-IST-FORMULA"));
        $ic101$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#38738", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#38739", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#38740", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#38741", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#38742", "CYC"));
        $ic102$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#38743", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#38744", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#38745", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#38746", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#38747", "CYC"));
        $ic103$ = SubLObjectFactory.makeSymbol("S#38751", "CYC");
        $ic104$ = SubLObjectFactory.makeSymbol("S#38737", "CYC");
        $ic105$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#38713", "CYC"));
        $ic106$ = SubLObjectFactory.makeSymbol("S#38738", "CYC");
        $ic107$ = SubLObjectFactory.makeSymbol("S#38743", "CYC");
        $ic108$ = SubLObjectFactory.makeSymbol("S#38739", "CYC");
        $ic109$ = SubLObjectFactory.makeSymbol("S#38744", "CYC");
        $ic110$ = SubLObjectFactory.makeSymbol("S#38740", "CYC");
        $ic111$ = SubLObjectFactory.makeSymbol("S#38745", "CYC");
        $ic112$ = SubLObjectFactory.makeSymbol("S#38741", "CYC");
        $ic113$ = SubLObjectFactory.makeSymbol("S#38746", "CYC");
        $ic114$ = SubLObjectFactory.makeSymbol("S#38742", "CYC");
        $ic115$ = SubLObjectFactory.makeSymbol("S#38747", "CYC");
        $ic116$ = SubLObjectFactory.makeKeyword("ID");
        $ic117$ = SubLObjectFactory.makeKeyword("TL-IST-FORMULA");
        $ic118$ = SubLObjectFactory.makeKeyword("HASH");
        $ic119$ = SubLObjectFactory.makeKeyword("EXTRA");
        $ic120$ = SubLObjectFactory.makeKeyword("WEAK-IST-FORMULA");
        $ic121$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic122$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic123$ = SubLObjectFactory.makeSymbol("S#38748", "CYC");
        $ic124$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic125$ = SubLObjectFactory.makeKeyword("END");
        $ic126$ = SubLObjectFactory.makeSymbol("S#38750", "CYC");
        $ic127$ = SubLObjectFactory.makeString("#<");
        $ic128$ = SubLObjectFactory.makeKeyword("STREAM");
        $ic129$ = SubLObjectFactory.makeString(" id# ");
        $ic130$ = SubLObjectFactory.makeString(" hc: ");
        $ic131$ = SubLObjectFactory.makeString(" AS-ID: ");
        $ic132$ = SubLObjectFactory.makeString(" FVecInx: ");
        $ic133$ = SubLObjectFactory.makeString(" xtr: ");
        $ic134$ = SubLObjectFactory.makeString(" ");
        $ic135$ = SubLObjectFactory.makeKeyword("BASE");
        $ic136$ = SubLObjectFactory.makeString(" assertions ....");
        $ic137$ = SubLObjectFactory.makeString("Not yet implemented.");
        $ic138$ = SubLObjectFactory.makeString("Mhm, only ~A gaps across all assertion types, but ~A deletions???");
        $ic139$ = SubLObjectFactory.makeString("Finding start of relevant assertions in TIP KB ....");
        $ic140$ = SubLObjectFactory.makeString(" assertion gaps ....");
        $ic141$ = SubLObjectFactory.makeString("Error realigning BRANCH (~A, now at ~A) and TIP (~A)");
        $ic142$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#38835", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("GUID"));
        $ic143$ = SubLObjectFactory.makeSymbol("S#38764", "CYC");
        $ic144$ = SubLObjectFactory.makeKeyword("HP");
        $ic145$ = SubLObjectFactory.makeString("Sorry, FAST is currently not implemented.");
        $ic146$ = SubLObjectFactory.makeString(" branch assertions ....");
        $ic147$ = SubLObjectFactory.makeKeyword("BOTH-INVALID");
        $ic148$ = SubLObjectFactory.makeKeyword("INVALID-BRANCH");
        $ic149$ = SubLObjectFactory.makeKeyword("INVALID-TIP");
        $ic150$ = SubLObjectFactory.makeKeyword("DIFFERENT");
        $ic151$ = SubLObjectFactory.makeKeyword("EQUAL");
        $ic152$ = SubLObjectFactory.makeString("Unknown state ~A -- do not know what to do.~%");
        $ic153$ = SubLObjectFactory.makeSymbol("S#38774", "CYC");
        $ic154$ = SubLObjectFactory.makeKeyword("TEST");
        $ic155$ = SubLObjectFactory.makeKeyword("OWNER");
        $ic156$ = SubLObjectFactory.makeKeyword("CLASSES");
        $ic157$ = SubLObjectFactory.makeKeyword("KB");
        $ic158$ = SubLObjectFactory.makeKeyword("TINY");
        $ic159$ = SubLObjectFactory.makeKeyword("WORKING?");
        $ic160$ = _constant_160_initializer();
        $ic161$ = SubLObjectFactory.makeKeyword("INVALID");
        $ic162$ = SubLObjectFactory.makeString("Someone is whaffling ....");
        $ic163$ = SubLObjectFactory.makeKeyword("CREATE");
        $ic164$ = SubLObjectFactory.makeKeyword("DELETE");
        $ic165$ = SubLObjectFactory.makeSymbol("S#38776", "CYC");
        $ic166$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(50), (SubLObject)SubLObjectFactory.makeInteger(100), (SubLObject)module0576.TWENTY_INTEGER, (SubLObject)module0576.TWENTY_INTEGER), (SubLObject)SubLObjectFactory.makeKeyword("OK")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0576.TEN_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(1000), (SubLObject)SubLObjectFactory.makeInteger(50), (SubLObject)SubLObjectFactory.makeInteger(50)), (SubLObject)SubLObjectFactory.makeKeyword("OK")));
        $ic167$ = SubLObjectFactory.makeString("Expected ~A, got ~A instead.");
        $ic168$ = SubLObjectFactory.makeKeyword("OK");
        $ic169$ = SubLObjectFactory.makeSymbol("S#38714", "CYC");
        $ic170$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3266", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#38836", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#38837", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#38838", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#38839", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#38840", "CYC"));
        $ic171$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STATE"), (SubLObject)SubLObjectFactory.makeKeyword("BRANCH-CDEL-FN"), (SubLObject)SubLObjectFactory.makeKeyword("BRANCH-ASDEL-FN"), (SubLObject)SubLObjectFactory.makeKeyword("TIP-CCREATE-FN"), (SubLObject)SubLObjectFactory.makeKeyword("TIP-ASCREATE-FN"), (SubLObject)SubLObjectFactory.makeKeyword("TIP-ASREASSERT-FN"));
        $ic172$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#38778", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#38779", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#38780", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#38781", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#38782", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#38783", "CYC"));
        $ic173$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#38784", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#38785", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#38786", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#38787", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#38788", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#38789", "CYC"));
        $ic174$ = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic175$ = SubLObjectFactory.makeSymbol("S#38777", "CYC");
        $ic176$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#38715", "CYC"));
        $ic177$ = SubLObjectFactory.makeSymbol("S#38778", "CYC");
        $ic178$ = SubLObjectFactory.makeSymbol("S#38784", "CYC");
        $ic179$ = SubLObjectFactory.makeSymbol("S#38779", "CYC");
        $ic180$ = SubLObjectFactory.makeSymbol("S#38785", "CYC");
        $ic181$ = SubLObjectFactory.makeSymbol("S#38780", "CYC");
        $ic182$ = SubLObjectFactory.makeSymbol("S#38786", "CYC");
        $ic183$ = SubLObjectFactory.makeSymbol("S#38781", "CYC");
        $ic184$ = SubLObjectFactory.makeSymbol("S#38787", "CYC");
        $ic185$ = SubLObjectFactory.makeSymbol("S#38782", "CYC");
        $ic186$ = SubLObjectFactory.makeSymbol("S#38788", "CYC");
        $ic187$ = SubLObjectFactory.makeSymbol("S#38783", "CYC");
        $ic188$ = SubLObjectFactory.makeSymbol("S#38789", "CYC");
        $ic189$ = SubLObjectFactory.makeKeyword("STATE");
        $ic190$ = SubLObjectFactory.makeKeyword("BRANCH-CDEL-FN");
        $ic191$ = SubLObjectFactory.makeKeyword("BRANCH-ASDEL-FN");
        $ic192$ = SubLObjectFactory.makeKeyword("TIP-CCREATE-FN");
        $ic193$ = SubLObjectFactory.makeKeyword("TIP-ASCREATE-FN");
        $ic194$ = SubLObjectFactory.makeKeyword("TIP-ASREASSERT-FN");
        $ic195$ = SubLObjectFactory.makeSymbol("S#38790", "CYC");
        $ic196$ = SubLObjectFactory.makeSymbol("S#38792", "CYC");
        $ic197$ = SubLObjectFactory.makeSymbol("NOTE-EL-PARTITION-BRANCH-CONSTANT-DELETE");
        $ic198$ = SubLObjectFactory.makeSymbol("NOTE-EL-PARTITION-BRANCH-ASSERTION-DELETE");
        $ic199$ = SubLObjectFactory.makeSymbol("NOTE-EL-PARTITION-TIP-CONSTANT-CREATE");
        $ic200$ = SubLObjectFactory.makeSymbol("NOTE-EL-PARTITION-TIP-ASSERTION-CREATE");
        $ic201$ = SubLObjectFactory.makeSymbol("NOTE-EL-PARTITION-TIP-ASSERTION-REASSERT");
        $ic202$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CREATOR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic203$ = SubLObjectFactory.makeSymbol("S#38823", "CYC");
        $ic204$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#38841", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic205$ = SubLObjectFactory.makeSymbol("S#38824", "CYC");
        $ic206$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic207$ = SubLObjectFactory.makeSymbol("S#38825", "CYC");
        $ic208$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5432", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic209$ = SubLObjectFactory.makeSymbol("S#38826", "CYC");
        $ic210$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#38824", "CYC"), (SubLObject)SubLObjectFactory.makeInteger(212)));
        $ic211$ = SubLObjectFactory.makeSymbol("S#38801", "CYC");
        $ic212$ = SubLObjectFactory.makeSymbol("S#38802", "CYC");
        $ic213$ = SubLObjectFactory.makeSymbol("S#38803", "CYC");
        $ic214$ = SubLObjectFactory.makeSymbol("S#38804", "CYC");
        $ic215$ = SubLObjectFactory.makeSymbol("S#38805", "CYC");
        $ic216$ = SubLObjectFactory.makeString("(FI-KILL '(:HP ~S ~S))");
        $ic217$ = SubLObjectFactory.makeString("(FI-UNASSERT '~S '~S)");
        $ic218$ = SubLObjectFactory.makeString("(FI-CREATE '~S ~S)");
        $ic219$ = SubLObjectFactory.makeString("(FI-ASSERT '~S '~S '~S '~S)");
        $ic220$ = SubLObjectFactory.makeString("(FI-REASSERT '~S '~S '~S '~S)");
        $ic221$ = SubLObjectFactory.makeString("(FI-TIMESTAMP-CONSTANT '~S '~S '~S '~S)");
        $ic222$ = SubLObjectFactory.makeString("(FI-TIMESTAMP-ASSERTION '~S '~S '~S '~S)");
        $ic223$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HP"), (SubLObject)SubLObjectFactory.makeString("Guest"), (SubLObject)SubLObjectFactory.makeGuid("bd5ad700-9c29-11b1-9dad-c379636f7270"));
        $ic224$ = SubLObjectFactory.makeString("(");
        $ic225$ = SubLObjectFactory.makeString(")");
        $ic226$ = SubLObjectFactory.makeSymbol("S#38812", "CYC");
        $ic227$ = SubLObjectFactory.makeSymbol("S#38813", "CYC");
        $ic228$ = SubLObjectFactory.makeSymbol("S#38814", "CYC");
        $ic229$ = SubLObjectFactory.makeSymbol("S#38815", "CYC");
        $ic230$ = SubLObjectFactory.makeSymbol("S#38816", "CYC");
        $ic231$ = SubLObjectFactory.makeString("~&:kill ~A ~A~%");
        $ic232$ = SubLObjectFactory.makeString("~&:unassert ~A~%");
        $ic233$ = SubLObjectFactory.makeString("~&:create ~A ~A~%");
        $ic234$ = SubLObjectFactory.makeString("~&:assert ~A~%");
        $ic235$ = SubLObjectFactory.makeString("~&:reassert ~A ~A ~A~%");
    }
    
    public static final class $sX38712_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $tl_ist_formula;
        public SubLObject $hash;
        public SubLObject $extra;
        public SubLObject $weak_ist_formula;
        private static final SubLStructDeclNative structDecl;
        
        public $sX38712_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$tl_ist_formula = (SubLObject)CommonSymbols.NIL;
            this.$hash = (SubLObject)CommonSymbols.NIL;
            this.$extra = (SubLObject)CommonSymbols.NIL;
            this.$weak_ist_formula = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX38712_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$id;
        }
        
        public SubLObject getField3() {
            return this.$tl_ist_formula;
        }
        
        public SubLObject getField4() {
            return this.$hash;
        }
        
        public SubLObject getField5() {
            return this.$extra;
        }
        
        public SubLObject getField6() {
            return this.$weak_ist_formula;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$tl_ist_formula = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$hash = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$extra = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$weak_ist_formula = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX38712_native.class, module0576.$ic97$, module0576.$ic98$, module0576.$ic99$, module0576.$ic100$, new String[] { "$id", "$tl_ist_formula", "$hash", "$extra", "$weak_ist_formula" }, module0576.$ic101$, module0576.$ic102$, module0576.$ic103$);
        }
    }
    
    public static final class $f35340$UnaryFunction extends UnaryFunction
    {
        public $f35340$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#38713"));
        }
        
        public SubLObject processItem(final SubLObject var158) {
            return module0576.f35340(var158);
        }
    }
    
    public static final class $sX38714_native extends SubLStructNative
    {
        public SubLObject $state;
        public SubLObject $branch_cdel_fn;
        public SubLObject $branch_asdel_fn;
        public SubLObject $tip_ccreate_fn;
        public SubLObject $tip_ascreate_fn;
        public SubLObject $tip_asreassert_fn;
        private static final SubLStructDeclNative structDecl;
        
        public $sX38714_native() {
            this.$state = (SubLObject)CommonSymbols.NIL;
            this.$branch_cdel_fn = (SubLObject)CommonSymbols.NIL;
            this.$branch_asdel_fn = (SubLObject)CommonSymbols.NIL;
            this.$tip_ccreate_fn = (SubLObject)CommonSymbols.NIL;
            this.$tip_ascreate_fn = (SubLObject)CommonSymbols.NIL;
            this.$tip_asreassert_fn = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX38714_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$state;
        }
        
        public SubLObject getField3() {
            return this.$branch_cdel_fn;
        }
        
        public SubLObject getField4() {
            return this.$branch_asdel_fn;
        }
        
        public SubLObject getField5() {
            return this.$tip_ccreate_fn;
        }
        
        public SubLObject getField6() {
            return this.$tip_ascreate_fn;
        }
        
        public SubLObject getField7() {
            return this.$tip_asreassert_fn;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$state = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$branch_cdel_fn = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$branch_asdel_fn = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$tip_ccreate_fn = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$tip_ascreate_fn = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$tip_asreassert_fn = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX38714_native.class, module0576.$ic169$, module0576.$ic62$, module0576.$ic170$, module0576.$ic171$, new String[] { "$state", "$branch_cdel_fn", "$branch_asdel_fn", "$tip_ccreate_fn", "$tip_ascreate_fn", "$tip_asreassert_fn" }, module0576.$ic172$, module0576.$ic173$, module0576.$ic174$);
        }
    }
    
    public static final class $f35322$UnaryFunction extends UnaryFunction
    {
        public $f35322$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#38715"));
        }
        
        public SubLObject processItem(final SubLObject var158) {
            return module0576.f35322(var158);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0576.class
	Total time: 1091 ms
	
	Decompiled with Procyon 0.5.32.
*/