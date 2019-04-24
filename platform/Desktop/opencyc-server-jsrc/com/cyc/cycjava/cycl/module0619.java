package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0619 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0619";
    public static final String myFingerPrint = "5d08a104fcc800b16a4739656ca20567293cd30cdb770faa66d267a1fae54dd6";
    public static SubLSymbol $g4757$;
    public static SubLSymbol $g4758$;
    private static SubLSymbol $g4759$;
    private static SubLSymbol $g4760$;
    private static SubLSymbol $g4761$;
    private static SubLSymbol $g4762$;
    public static SubLSymbol $g4763$;
    public static SubLSymbol $g4764$;
    public static SubLSymbol $g4765$;
    public static SubLSymbol $g4766$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLString $ic2$;
    private static final SubLString $ic3$;
    private static final SubLString $ic4$;
    private static final SubLString $ic5$;
    private static final SubLString $ic6$;
    private static final SubLString $ic7$;
    private static final SubLString $ic8$;
    private static final SubLString $ic9$;
    private static final SubLString $ic10$;
    private static final SubLString $ic11$;
    private static final SubLString $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLString $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLString $ic18$;
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    private static final SubLString $ic21$;
    private static final SubLString $ic22$;
    private static final SubLString $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLString $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLString $ic30$;
    private static final SubLObject $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLString $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLString $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLString $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLString $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLString $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLString $ic66$;
    private static final SubLString $ic67$;
    private static final SubLString $ic68$;
    private static final SubLString $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLString $ic71$;
    private static final SubLString $ic72$;
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
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLList $ic85$;
    private static final SubLString $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLObject $ic93$;
    private static final SubLObject $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLInteger $ic96$;
    private static final SubLInteger $ic97$;
    private static final SubLObject $ic98$;
    private static final SubLInteger $ic99$;
    private static final SubLObject $ic100$;
    private static final SubLObject $ic101$;
    private static final SubLObject $ic102$;
    private static final SubLObject $ic103$;
    private static final SubLInteger $ic104$;
    private static final SubLInteger $ic105$;
    private static final SubLObject $ic106$;
    private static final SubLInteger $ic107$;
    private static final SubLInteger $ic108$;
    private static final SubLObject $ic109$;
    private static final SubLInteger $ic110$;
    private static final SubLInteger $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLString $ic114$;
    private static final SubLList $ic115$;
    private static final SubLList $ic116$;
    private static final SubLString $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLString $ic121$;
    private static final SubLString $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLString $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLString $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLString $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLString $ic134$;
    private static final SubLString $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLObject $ic137$;
    private static final SubLObject $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLObject $ic145$;
    private static final SubLString $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLString $ic148$;
    private static final SubLString $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLString $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLString $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLString $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLString $ic162$;
    private static final SubLString $ic163$;
    private static final SubLString $ic164$;
    private static final SubLList $ic165$;
    private static final SubLString $ic166$;
    private static final SubLString $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLString $ic170$;
    private static final SubLString $ic171$;
    private static final SubLString $ic172$;
    private static final SubLString $ic173$;
    private static final SubLFloat $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLString $ic176$;
    
    public static SubLObject f38178() {
        return (SubLObject)module0619.NIL;
    }
    
    public static SubLObject f38179() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        module0027.f1437(StreamsLow.$standard_output$.getDynamicValue(var1), (SubLObject)module0619.$ic0$, (SubLObject)module0619.NIL, (SubLObject)module0619.T, (SubLObject)module0619.UNPROVIDED);
        module0127.f8418();
        return (SubLObject)module0619.NIL;
    }
    
    public static SubLObject f38180(final SubLObject var2, final SubLObject var3) {
        module0618.f37949(var2);
        f38181(var3);
        return (SubLObject)module0619.NIL;
    }
    
    public static SubLObject f38182(final SubLObject var4, final SubLObject var3) {
        module0618.f37949(var4);
        f38179();
        f38181(var3);
        return (SubLObject)module0619.NIL;
    }
    
    public static SubLObject f38181(final SubLObject var3) {
        if (module0619.NIL != Filesys.probe_file(var3)) {
            Errors.cerror((SubLObject)module0619.$ic2$, (SubLObject)module0619.$ic3$, var3);
        }
        module0574.f35221(var3, (SubLObject)module0619.T);
        return (SubLObject)module0619.NIL;
    }
    
    public static SubLObject f38183(final SubLObject var5, SubLObject var6) {
        if (var6 == module0619.UNPROVIDED) {
            var6 = (SubLObject)module0619.$ic4$;
        }
        return Sequences.cconcatenate((SubLObject)module0619.$ic5$, new SubLObject[] { module0006.f203(var5), module0619.$ic6$, module0006.f203(module0011.f352()), module0619.$ic7$, module0006.f203(module0574.f35164()), module0619.$ic6$, module0006.f203(var6) });
    }
    
    public static SubLObject f38184(final SubLObject var7, final SubLObject var5, final SubLObject var8, SubLObject var6) {
        if (var6 == module0619.UNPROVIDED) {
            var6 = (SubLObject)module0619.$ic4$;
        }
        return Sequences.cconcatenate((SubLObject)module0619.$ic8$, new SubLObject[] { module0006.f203(var7), module0619.$ic9$, module0006.f203(var5), module0619.$ic10$, module0006.f203(f38183(var5, var6)), module0619.$ic9$, module0006.f203(var8), module0619.$ic9$ });
    }
    
    public static SubLObject f38185() {
        return Sequences.cconcatenate((SubLObject)module0619.$ic11$, new SubLObject[] { module0006.f203(module0574.f35164()), module0619.$ic12$ });
    }
    
    public static SubLObject f38186(final SubLObject var9) {
        assert module0619.NIL != Filesys.directory_p(var9) : var9;
        final SubLObject var10 = Sequences.cconcatenate(var9, f38185());
        PrintLow.format((SubLObject)module0619.T, (SubLObject)module0619.$ic14$, var10);
        if (module0619.NIL != f38181(var10)) {
            return var10;
        }
        return (SubLObject)module0619.NIL;
    }
    
    public static SubLObject f38187(final SubLObject var11) {
        module0618.f37949(var11);
        module0107.f7576((SubLObject)module0619.UNPROVIDED);
        return module0018.f971();
    }
    
    public static SubLObject f38188(final SubLObject var12) {
        module0574.f35238(var12);
        module0107.f7576((SubLObject)module0619.UNPROVIDED);
        return Values.values(module0018.f971(), module0574.f35163());
    }
    
    public static SubLObject f38189(final SubLObject var11) {
        module0741.f45910();
        module0213.f13896();
        Storage.room((SubLObject)module0619.UNPROVIDED);
        module0213.f13862((SubLObject)module0619.UNPROVIDED);
        return module0618.f37924(var11);
    }
    
    public static SubLObject f38190() {
        final SubLObject var13 = Sequences.cconcatenate((SubLObject)module0619.$ic18$, new SubLObject[] { module0574.f35166(Numbers.add((SubLObject)module0619.ONE_INTEGER, module0018.f971())), module0619.$ic9$ });
        if (module0619.NIL == Filesys.directory_p(var13)) {
            Errors.warn((SubLObject)module0619.$ic19$, var13);
            module0075.f5241(var13, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED);
        }
        return var13;
    }
    
    public static SubLObject f38191() {
        return Sequences.cconcatenate(module0006.f203(f38190()), new SubLObject[] { module0619.$ic20$, module0006.f203(Environment.get_process_id((SubLObject)module0619.UNPROVIDED)), module0619.$ic21$ });
    }
    
    public static SubLObject f38192(final SubLObject var14, SubLObject var15, SubLObject var16) {
        if (var15 == module0619.UNPROVIDED) {
            var15 = (SubLObject)module0619.NIL;
        }
        if (var16 == module0619.UNPROVIDED) {
            var16 = (SubLObject)module0619.T;
        }
        final SubLThread var17 = SubLProcess.currentSubLThread();
        if (module0619.NIL != var15 && !var15.eql(module0018.f971()) && module0619.ZERO_INTEGER.eql(module0574.f35148())) {
            Errors.error((SubLObject)module0619.$ic22$, var15, module0574.f35164());
        }
        module0678.f41457((SubLObject)module0619.$ic23$);
        module0213.f13862((SubLObject)module0619.UNPROVIDED);
        module0413.$g3371$.setDynamicValue((SubLObject)module0619.T, var17);
        module0018.f962((SubLObject)module0619.T);
        if (module0619.NIL != var16) {
            module0018.f964((SubLObject)module0619.T);
        }
        module0018.f960((SubLObject)module0619.NIL);
        f38193();
        Storage.room((SubLObject)module0619.T);
        module0213.f13862((SubLObject)module0619.UNPROVIDED);
        f38181(var14);
        final SubLObject var18 = f38191();
        if (module0619.NIL == Filesys.probe_file(var18)) {
            SubLObject var19 = (SubLObject)module0619.NIL;
            try {
                var19 = compatibility.open_text(var18, (SubLObject)module0619.$ic24$);
                if (!var19.isStream()) {
                    Errors.error((SubLObject)module0619.$ic25$, var18);
                }
                final SubLObject var19_20 = var19;
                final SubLObject var20 = module0015.$g131$.currentBinding(var17);
                try {
                    module0015.$g131$.bind(var19_20, var17);
                    module0683.f41907((SubLObject)module0619.TWENTY_INTEGER);
                }
                finally {
                    module0015.$g131$.rebind(var20, var17);
                }
            }
            finally {
                final SubLObject var21 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0619.T, var17);
                    if (var19.isStream()) {
                        streams_high.close(var19, (SubLObject)module0619.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var21, var17);
                }
            }
        }
        return (SubLObject)module0619.NIL;
    }
    
    public static SubLObject f38193() {
        f38194();
        Threads.process_wait(Sequences.cconcatenate((SubLObject)module0619.$ic26$, module0006.f203(Numbers.add((SubLObject)module0619.ONE_INTEGER, module0018.f971()))), (SubLObject)module0619.$ic27$);
        return (SubLObject)module0619.NIL;
    }
    
    public static SubLObject f38194() {
        if (module0619.NIL == module0593.f36267()) {
            Errors.error((SubLObject)module0619.$ic28$);
        }
        module0574.f35127((SubLObject)module0619.$ic29$);
        if (module0574.f35153((SubLObject)module0619.$ic30$).eql(module0619.$ic31$)) {
            module0574.f35153((SubLObject)module0619.$ic32$);
        }
        PrintLow.format((SubLObject)module0619.T, (SubLObject)module0619.$ic33$);
        streams_high.force_output((SubLObject)module0619.T);
        return (SubLObject)module0619.NIL;
    }
    
    public static SubLObject f38195(final SubLObject var22, final SubLObject var23) {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        module0678.f41457((SubLObject)module0619.$ic34$);
        final SubLObject var25 = Errors.$continue_cerrorP$.currentBinding(var24);
        final SubLObject var26 = module0018.$g693$.currentBinding(var24);
        try {
            Errors.$continue_cerrorP$.bind((SubLObject)module0619.T, var24);
            module0018.$g693$.bind((SubLObject)module0619.T, var24);
            module0574.f35219(var22, (SubLObject)module0619.NIL, (SubLObject)module0619.$ic35$, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED);
        }
        finally {
            module0018.$g693$.rebind(var26, var24);
            Errors.$continue_cerrorP$.rebind(var25, var24);
        }
        Storage.room((SubLObject)module0619.T);
        module0213.f13862((SubLObject)module0619.UNPROVIDED);
        f38181(var23);
        return (SubLObject)module0619.NIL;
    }
    
    public static SubLObject f38196(final SubLObject var9) {
        f38197();
        return f38186(var9);
    }
    
    public static SubLObject f38198(final SubLObject var25) {
        f38197();
        return f38181(var25);
    }
    
    public static SubLObject f38197() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        module0678.f41457((SubLObject)module0619.$ic36$);
        if (module0619.NIL == module0593.f36267()) {
            Errors.error((SubLObject)module0619.$ic28$);
        }
        module0213.f13862((SubLObject)module0619.UNPROVIDED);
        module0574.f35127((SubLObject)module0619.$ic29$);
        if (module0574.f35153((SubLObject)module0619.$ic30$).eql(module0619.$ic31$)) {
            module0574.f35153((SubLObject)module0619.$ic32$);
        }
        Threads.sleep((SubLObject)module0619.FIVE_INTEGER);
        final SubLObject var2 = module0574.f35148();
        final SubLObject var3 = module0012.$g75$.currentBinding(var1);
        final SubLObject var4 = module0012.$g76$.currentBinding(var1);
        final SubLObject var5 = module0012.$g77$.currentBinding(var1);
        final SubLObject var6 = module0012.$g78$.currentBinding(var1);
        try {
            module0012.$g75$.bind((SubLObject)module0619.ZERO_INTEGER, var1);
            module0012.$g76$.bind((SubLObject)module0619.NIL, var1);
            module0012.$g77$.bind((SubLObject)module0619.T, var1);
            module0012.$g78$.bind(Time.get_universal_time(), var1);
            module0012.f478(Sequences.cconcatenate((SubLObject)module0619.$ic37$, new SubLObject[] { module0006.f203(module0018.f971()), module0619.$ic38$, module0006.f203(module0574.f35148()), module0619.$ic39$, module0006.f203(module0018.f971()), module0619.$ic38$, module0006.f203(module0572.f35062((SubLObject)module0619.UNPROVIDED)) }));
            while (module0619.NIL == module0018.f976()) {
                module0012.note_percent_progress(Numbers.subtract(module0574.f35148(), var2), Numbers.subtract(module0572.f35062((SubLObject)module0619.UNPROVIDED), var2));
                Threads.sleep((SubLObject)module0619.FIVE_INTEGER);
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var6, var1);
            module0012.$g77$.rebind(var5, var1);
            module0012.$g76$.rebind(var4, var1);
            module0012.$g75$.rebind(var3, var1);
        }
        module0574.f35127((SubLObject)module0619.$ic40$);
        PrintLow.format((SubLObject)module0619.T, (SubLObject)module0619.$ic41$, module0574.f35164());
        Threads.sleep((SubLObject)module0619.FIVE_INTEGER);
        module0213.f13862((SubLObject)module0619.UNPROVIDED);
        return (SubLObject)module0619.NIL;
    }
    
    public static SubLObject f38199(final SubLObject var29, final SubLObject var30, final SubLObject var31, final SubLObject var32) {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        assert module0619.NIL != Types.keywordp(var29) : var29;
        assert module0619.NIL != Types.keywordp(var31) : var31;
        assert module0619.NIL != Types.keywordp(var30) : var30;
        assert module0619.NIL != Types.stringp(var32) : var32;
        if (module0619.NIL != f38200(var29, var30, var31, var32)) {
            return Errors.warn((SubLObject)module0619.$ic44$, var29);
        }
        if (module0619.NIL != f38201(var30, var31, var32)) {
            return Errors.error((SubLObject)module0619.$ic45$, f38201(var30, var31, var32));
        }
        if (module0619.NIL != conses_high.assoc(var29, module0619.$g4758$.getDynamicValue(var33), (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED)) {
            return Errors.error((SubLObject)module0619.$ic46$, var29);
        }
        module0619.$g4757$.setDynamicValue((SubLObject)ConsesLow.cons(var29, module0619.$g4757$.getDynamicValue(var33)), var33);
        module0619.$g4758$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var29, var31, var30, var32), module0619.$g4758$.getDynamicValue(var33)), var33);
        return module0619.$g4758$.getDynamicValue(var33);
    }
    
    public static SubLObject f38200(final SubLObject var29, final SubLObject var30, final SubLObject var31, final SubLObject var32) {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        return conses_high.member((SubLObject)ConsesLow.list(var29, var30, var31, var32), module0619.$g4758$.getDynamicValue(var33), Symbols.symbol_function((SubLObject)module0619.EQUAL), (SubLObject)module0619.UNPROVIDED);
    }
    
    public static SubLObject f38201(final SubLObject var30, final SubLObject var31, final SubLObject var32) {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        return Sequences.find((SubLObject)ConsesLow.list(var30, var31, var32), module0619.$g4758$.getDynamicValue(var33), Symbols.symbol_function((SubLObject)module0619.EQUAL), Symbols.symbol_function((SubLObject)module0619.$ic47$), (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED).first();
    }
    
    public static SubLObject f38202() {
        return module0619.$g4759$.getGlobalValue();
    }
    
    public static SubLObject f38203() {
        return module0619.$g4760$.getGlobalValue();
    }
    
    public static SubLObject f38204() {
        return module0619.$g4761$.getGlobalValue();
    }
    
    public static SubLObject f38205() {
        return module0619.$g4762$.getGlobalValue();
    }
    
    public static SubLObject f38206(final SubLObject var29) {
        assert module0619.NIL != Types.keywordp(var29) : var29;
        module0619.$g4759$.setGlobalValue(var29);
        return f38202();
    }
    
    public static SubLObject f38207(final SubLObject var31) {
        assert module0619.NIL != Types.keywordp(var31) : var31;
        module0619.$g4761$.setGlobalValue(var31);
        return f38204();
    }
    
    public static SubLObject f38208() {
        final SubLObject var29 = f38209();
        if (module0619.NIL != var29) {
            f38206(var29);
        }
        else {
            f38206((SubLObject)module0619.$ic58$);
        }
        return var29;
    }
    
    public static SubLObject f38209() {
        return f38201(f38203(), f38204(), f38205());
    }
    
    public static SubLObject f38210(final SubLObject var33, SubLObject var34) {
        if (var34 == module0619.UNPROVIDED) {
            var34 = (SubLObject)module0619.EQUAL;
        }
        final SubLThread var35 = SubLProcess.currentSubLThread();
        final SubLObject var36 = module0067.f4880(var34, (SubLObject)module0619.UNPROVIDED);
        SubLObject var37 = (SubLObject)module0619.NIL;
        try {
            final SubLObject var38 = stream_macros.$stream_requires_locking$.currentBinding(var35);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0619.NIL, var35);
                var37 = compatibility.open_text(var33, (SubLObject)module0619.$ic60$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var38, var35);
            }
            if (!var37.isStream()) {
                Errors.error((SubLObject)module0619.$ic25$, var33);
            }
            final SubLObject var39 = var37;
            if (var39.isStream()) {
                final SubLObject var39_40 = var39;
                SubLObject var40 = (SubLObject)module0619.NIL;
                SubLObject var41 = (SubLObject)module0619.NIL;
                var40 = (SubLObject)module0619.ZERO_INTEGER;
                for (var41 = module0075.f5202(var39_40); module0619.NIL != var41; var41 = module0075.f5202(var39_40)) {
                    final SubLObject var42 = Sequences.position_if((SubLObject)module0619.$ic61$, var41, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED);
                    final SubLObject var43 = module0038.f2623(var41, (SubLObject)module0619.ZERO_INTEGER, var42);
                    final SubLObject var44 = module0038.f2623(var41, Numbers.add((SubLObject)module0619.ONE_INTEGER, var42), (SubLObject)module0619.UNPROVIDED);
                    SubLObject var45 = module0079.f5414(var36, var43, (SubLObject)module0619.UNPROVIDED);
                    if (module0619.NIL == module0077.f5302(var45)) {
                        var45 = module0077.f5313(var34, (SubLObject)module0619.UNPROVIDED);
                        module0079.f5412(var36, var43, var45);
                    }
                    module0077.f5326(var44, var45);
                    var40 = module0048.f_1X(var40);
                }
            }
        }
        finally {
            final SubLObject var46 = Threads.$is_thread_performing_cleanupP$.currentBinding(var35);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0619.T, var35);
                if (var37.isStream()) {
                    streams_high.close(var37, (SubLObject)module0619.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var46, var35);
            }
        }
        return var36;
    }
    
    public static SubLObject f38211(final SubLObject var47, final SubLObject var48) {
        final SubLObject var49 = module0077.f5313(module0077.f5315(var47), (SubLObject)module0619.UNPROVIDED);
        final SubLObject var50 = module0077.f5333(var47);
        SubLObject var51;
        SubLObject var52;
        SubLObject var53;
        SubLObject var54;
        for (var51 = module0032.f1741(var50), var52 = (SubLObject)module0619.NIL, var52 = module0032.f1742(var51, var50); module0619.NIL == module0032.f1744(var51, var52); var52 = module0032.f1743(var52)) {
            var53 = module0032.f1745(var51, var52);
            if (module0619.NIL != module0032.f1746(var52, var53)) {
                var54 = module0079.f5414(var48, var53, (SubLObject)module0619.UNPROVIDED);
                if (module0619.NIL != module0077.f5302(var54)) {
                    module0078.f5377(var49, var54);
                }
            }
        }
        module0078.f5357(var49, var47);
        final SubLObject var55 = module0077.f5311(var49);
        module0078.f5377(var47, var49);
        return var55;
    }
    
    public static SubLObject f38212(final SubLObject var47, final SubLObject var48) {
        final SubLObject var49 = Numbers.add(module0077.f5311(var47), module0079.f5406(var48));
        SubLObject var50 = (SubLObject)module0619.ZERO_INTEGER;
        SubLObject var51 = (SubLObject)module0619.NIL;
        while (module0619.NIL == var51) {
            final SubLObject var52 = f38211(var47, var48);
            var51 = Numbers.zerop(var52);
            var50 = Numbers.add(var50, (SubLObject)module0619.ONE_INTEGER);
            if (var49.numL(var50)) {
                Errors.error((SubLObject)module0619.$ic64$, var49);
            }
        }
        return var47;
    }
    
    public static SubLObject f38213(final SubLObject var58, final SubLObject var59, final SubLObject var60, SubLObject var61) {
        if (var61 == module0619.UNPROVIDED) {
            var61 = (SubLObject)module0619.NIL;
        }
        final SubLThread var62 = SubLProcess.currentSubLThread();
        final SubLObject var63 = (SubLObject)ConsesLow.list((SubLObject)module0619.$ic66$, var58, (SubLObject)module0619.$ic67$, var59);
        try {
            final SubLObject var64 = module0601.$g4652$.currentBinding(var62);
            final SubLObject var65 = module0601.$g4654$.currentBinding(var62);
            try {
                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var62), module0601.$g4652$.getDynamicValue(var62)), var62);
                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var62), var62);
                module0601.f36758((SubLObject)module0619.$ic68$, var63, (SubLObject)module0619.NIL, (SubLObject)module0619.NIL);
                final SubLObject var66 = (SubLObject)ConsesLow.list((SubLObject)module0619.$ic69$, (SubLObject)module0619.$ic70$);
                final SubLObject var67 = var66.rest();
                SubLObject var68 = var60;
                SubLObject var69 = (SubLObject)module0619.NIL;
                var69 = var68.first();
                while (module0619.NIL != var68) {
                    ConsesLow.rplaca(var67, var69);
                    module0601.f36746();
                    final SubLObject var21_67 = module0601.$g4652$.currentBinding(var62);
                    final SubLObject var24_68 = module0601.$g4654$.currentBinding(var62);
                    try {
                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var62), module0601.$g4652$.getDynamicValue(var62)), var62);
                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var62), var62);
                        module0601.f36758((SubLObject)module0619.$ic71$, var66, (SubLObject)module0619.T, (SubLObject)module0619.NIL);
                    }
                    finally {
                        module0601.$g4654$.rebind(var24_68, var62);
                        module0601.$g4652$.rebind(var21_67, var62);
                    }
                    var68 = var68.rest();
                    var69 = var68.first();
                }
                var68 = var61;
                SubLObject var70 = (SubLObject)module0619.NIL;
                var70 = var68.first();
                while (module0619.NIL != var68) {
                    ConsesLow.rplaca(var67, var70);
                    module0601.f36746();
                    final SubLObject var21_68 = module0601.$g4652$.currentBinding(var62);
                    final SubLObject var24_69 = module0601.$g4654$.currentBinding(var62);
                    try {
                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var62), module0601.$g4652$.getDynamicValue(var62)), var62);
                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var62), var62);
                        module0601.f36758((SubLObject)module0619.$ic72$, var66, (SubLObject)module0619.T, (SubLObject)module0619.NIL);
                    }
                    finally {
                        module0601.$g4654$.rebind(var24_69, var62);
                        module0601.$g4652$.rebind(var21_68, var62);
                    }
                    var68 = var68.rest();
                    var70 = var68.first();
                }
            }
            finally {
                module0601.$g4654$.rebind(var65, var62);
                module0601.$g4652$.rebind(var64, var62);
            }
        }
        finally {
            final SubLObject var71 = Threads.$is_thread_performing_cleanupP$.currentBinding(var62);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0619.T, var62);
                module0601.f36746();
                module0601.f36760((SubLObject)module0619.$ic68$);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var71, var62);
            }
        }
        return var58;
    }
    
    public static SubLObject f38214(final SubLObject var72, SubLObject var73, SubLObject var34) {
        if (var73 == module0619.UNPROVIDED) {
            var73 = module0075.f5229((SubLObject)module0619.$ic74$);
        }
        if (var34 == module0619.UNPROVIDED) {
            var34 = (SubLObject)module0619.EQUAL;
        }
        return f38215(module0078.f5367(var72, var34, (SubLObject)module0619.UNPROVIDED), var73, var34);
    }
    
    public static SubLObject f38215(final SubLObject var47, SubLObject var73, SubLObject var34) {
        if (var73 == module0619.UNPROVIDED) {
            var73 = module0075.f5229((SubLObject)module0619.$ic74$);
        }
        if (var34 == module0619.UNPROVIDED) {
            var34 = (SubLObject)module0619.EQUAL;
        }
        final SubLObject var74 = module0077.f5313(var34, module0077.f5311(var47));
        final SubLObject var75 = module0077.f5333(var47);
        SubLObject var76;
        SubLObject var77;
        SubLObject var78;
        for (var76 = module0032.f1741(var75), var77 = (SubLObject)module0619.NIL, var77 = module0032.f1742(var76, var75); module0619.NIL == module0032.f1744(var76, var77); var77 = module0032.f1743(var77)) {
            var78 = module0032.f1745(var76, var77);
            if (module0619.NIL != module0032.f1746(var77, var78)) {
                module0077.f5326(module0075.f5230(var73, var78), var74);
            }
        }
        return var74;
    }
    
    public static SubLObject f38216(final SubLObject var47, SubLObject var73, SubLObject var34) {
        if (var73 == module0619.UNPROVIDED) {
            var73 = module0075.f5229((SubLObject)module0619.$ic74$);
        }
        if (var34 == module0619.UNPROVIDED) {
            var34 = (SubLObject)module0619.EQUAL;
        }
        final SubLObject var74 = module0077.f5313(var34, module0077.f5311(var47));
        final SubLObject var75 = module0077.f5333(var47);
        SubLObject var76;
        SubLObject var77;
        SubLObject var78;
        for (var76 = module0032.f1741(var75), var77 = (SubLObject)module0619.NIL, var77 = module0032.f1742(var76, var75); module0619.NIL == module0032.f1744(var76, var77); var77 = module0032.f1743(var77)) {
            var78 = module0032.f1745(var76, var77);
            if (module0619.NIL != module0032.f1746(var77, var78)) {
                module0077.f5326(module0075.f5231(var78, var73), var74);
            }
        }
        return var74;
    }
    
    public static SubLObject f38217(final SubLObject var47, SubLObject var75, SubLObject var76, SubLObject var34) {
        if (var34 == module0619.UNPROVIDED) {
            var34 = (SubLObject)module0619.EQUAL;
        }
        var75 = module0075.f5223(var75);
        var76 = module0075.f5223(var76);
        final SubLObject var77 = module0075.f5228(var76);
        SubLObject var78 = var76;
        final SubLObject var79 = module0077.f5313(var34, module0077.f5311(var47));
        SubLObject var80 = (SubLObject)module0619.NIL;
        SubLObject var81 = (SubLObject)module0619.NIL;
        if (module0619.NIL == var77) {
            var80 = module0075.f5221(var76);
            var81 = module0075.f5229(var80);
            var78 = module0075.f5230(var81, var76);
        }
        final SubLObject var82 = module0077.f5333(var47);
        SubLObject var83;
        SubLObject var84;
        SubLObject var85;
        SubLObject var86;
        SubLObject var87;
        SubLObject var88;
        for (var83 = module0032.f1741(var82), var84 = (SubLObject)module0619.NIL, var84 = module0032.f1742(var83, var82); module0619.NIL == module0032.f1744(var83, var84); var84 = module0032.f1743(var84)) {
            var85 = module0032.f1745(var83, var84);
            if (module0619.NIL != module0032.f1746(var84, var85)) {
                var86 = module0075.f5231(var85, var75);
                var87 = module0075.f5230(var78, var86);
                var88 = ((module0619.NIL != var77) ? var87 : module0075.f5231(var87, var81));
                module0077.f5326(var88, var79);
            }
        }
        return var79;
    }
    
    public static SubLObject f38218(final SubLObject var72, final SubLObject var75, final SubLObject var76, SubLObject var34) {
        if (var34 == module0619.UNPROVIDED) {
            var34 = (SubLObject)module0619.EQUAL;
        }
        final SubLThread var77 = SubLProcess.currentSubLThread();
        final SubLObject var78 = module0078.f5367(var72, var34, (SubLObject)module0619.UNPROVIDED);
        final SubLObject var79 = f38217(var78, var75, var76, var34);
        final SubLObject var80 = module0077.f5333(var79);
        SubLObject var81;
        SubLObject var82;
        SubLObject var83;
        for (var81 = module0032.f1741(var80), var82 = (SubLObject)module0619.NIL, var82 = module0032.f1742(var81, var80); module0619.NIL == module0032.f1744(var81, var82); var82 = module0032.f1743(var82)) {
            var83 = module0032.f1745(var81, var82);
            if (module0619.NIL != module0032.f1746(var82, var83) && module0619.NIL == Errors.$ignore_mustsP$.getDynamicValue(var77) && module0619.NIL == module0038.f2684(var83, var76)) {
                Errors.error((SubLObject)module0619.$ic86$, var75, var76, var83);
            }
        }
        return (SubLObject)module0619.$ic87$;
    }
    
    public static SubLObject f38219(final SubLObject var10) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        SubLObject var12 = (SubLObject)module0619.NIL;
        try {
            final SubLObject var13 = stream_macros.$stream_requires_locking$.currentBinding(var11);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0619.NIL, var11);
                var12 = compatibility.open_text(var10, (SubLObject)module0619.$ic24$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var13, var11);
            }
            if (!var12.isStream()) {
                Errors.error((SubLObject)module0619.$ic25$, var10);
            }
            final SubLObject var14 = var12;
            f38220(var14);
        }
        finally {
            final SubLObject var15 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0619.T, var11);
                if (var12.isStream()) {
                    streams_high.close(var12, (SubLObject)module0619.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var15, var11);
            }
        }
        return var10;
    }
    
    public static SubLObject f38220(SubLObject var19) {
        if (var19 == module0619.UNPROVIDED) {
            var19 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread var20 = SubLProcess.currentSubLThread();
        final SubLObject var21 = module0052.f3785(module0173.f10959(), (SubLObject)module0619.$ic88$, (SubLObject)module0619.UNPROVIDED);
        SubLObject var24;
        for (SubLObject var22 = (SubLObject)module0619.NIL; module0619.NIL == var22; var22 = (SubLObject)SubLObjectFactory.makeBoolean(module0619.NIL == var24)) {
            var20.resetMultipleValues();
            final SubLObject var23 = module0052.f3693(var21);
            var24 = var20.secondMultipleValue();
            var20.resetMultipleValues();
            if (module0619.NIL != var24) {
                streams_high.write_string(var23, var19, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED);
                streams_high.terpri(var19);
            }
        }
        return (SubLObject)module0619.NIL;
    }
    
    public static SubLObject f38221(final SubLObject var90) {
        return Values.values((SubLObject)module0619.NIL, (SubLObject)module0619.NIL);
    }
    
    public static SubLObject f38222(final SubLObject var91, final SubLObject var92, final SubLObject var93, SubLObject var94, SubLObject var95) {
        if (var94 == module0619.UNPROVIDED) {
            var94 = (SubLObject)module0619.ZERO_INTEGER;
        }
        if (var95 == module0619.UNPROVIDED) {
            var95 = (SubLObject)module0619.ZERO_INTEGER;
        }
        return (SubLObject)ConsesLow.list(var91, var92, var93, var94, var95);
    }
    
    public static SubLObject f38223(final SubLObject var96, final SubLObject var97, SubLObject var98) {
        if (var98 == module0619.UNPROVIDED) {
            var98 = (SubLObject)module0619.T;
        }
        final SubLObject var99 = module0069.f4939(var96);
        final SubLObject var100 = f38224(var99, (SubLObject)module0619.UNPROVIDED);
        module0243.f15700(var100, var97, var98);
        return var97;
    }
    
    public static SubLObject f38225(final SubLObject var97, SubLObject var98) {
        if (var98 == module0619.UNPROVIDED) {
            var98 = (SubLObject)module0619.T;
        }
        final SubLObject var99 = f38226((SubLObject)module0619.UNPROVIDED);
        module0243.f15700(var99, var97, var98);
        return var97;
    }
    
    public static SubLObject f38227(final SubLObject var97, SubLObject var98) {
        if (var98 == module0619.UNPROVIDED) {
            var98 = (SubLObject)module0619.T;
        }
        final SubLObject var99 = f38228((SubLObject)module0619.UNPROVIDED);
        module0243.f15700(var99, var97, var98);
        return var97;
    }
    
    public static SubLObject f38224(final SubLObject var99, SubLObject var101) {
        if (var101 == module0619.UNPROVIDED) {
            var101 = module0619.$g4763$.getDynamicValue();
        }
        final SubLThread var102 = SubLProcess.currentSubLThread();
        assert module0619.NIL != module0067.f4852(var99) : var99;
        final SubLObject var103 = Sequences.find((SubLObject)module0619.$ic89$, var101, (SubLObject)module0619.EQL, (SubLObject)module0619.$ic113$, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED);
        if (module0619.NIL == Errors.$ignore_mustsP$.getDynamicValue(var102) && !var103.isCons()) {
            Errors.error((SubLObject)module0619.$ic114$, var101);
        }
        SubLObject var104 = (SubLObject)module0619.NIL;
        SubLObject var105;
        for (var105 = module0066.f4838(module0067.f4891(var99)); module0619.NIL == module0066.f4841(var105); var105 = module0066.f4840(var105)) {
            var102.resetMultipleValues();
            final SubLObject var106 = module0066.f4839(var105);
            final SubLObject var107 = var102.secondMultipleValue();
            var102.resetMultipleValues();
            SubLObject var108 = Sequences.find(var106, var101, (SubLObject)module0619.EQL, (SubLObject)module0619.$ic113$, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED);
            if (module0619.NIL == var108) {
                var108 = var103;
            }
            SubLObject var110;
            final SubLObject var109 = var110 = var108;
            SubLObject var111 = (SubLObject)module0619.NIL;
            SubLObject var112 = (SubLObject)module0619.NIL;
            SubLObject var113 = (SubLObject)module0619.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var110, var109, (SubLObject)module0619.$ic115$);
            var111 = var110.first();
            var110 = var110.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var110, var109, (SubLObject)module0619.$ic115$);
            var112 = var110.first();
            var110 = var110.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var110, var109, (SubLObject)module0619.$ic115$);
            var113 = var110.first();
            var110 = var110.rest();
            final SubLObject var114 = (SubLObject)(var110.isCons() ? var110.first() : module0619.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(var110, var109, (SubLObject)module0619.$ic115$);
            var110 = var110.rest();
            final SubLObject var115 = (SubLObject)(var110.isCons() ? var110.first() : module0619.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(var110, var109, (SubLObject)module0619.$ic115$);
            var110 = var110.rest();
            if (module0619.NIL == var110) {
                final SubLObject var116 = module0243.f15720(var107, module0137.f8955(var106));
                final SubLObject var117 = module0243.f15699(var106, var112, var113, var116, var114, var115);
                var104 = (SubLObject)ConsesLow.cons(var117, var104);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var109, (SubLObject)module0619.$ic115$);
            }
        }
        module0066.f4842(var105);
        return var104;
    }
    
    public static SubLObject f38228(SubLObject var112) {
        if (var112 == module0619.UNPROVIDED) {
            var112 = (SubLObject)module0619.NIL;
        }
        return f38229(var112, (SubLObject)module0619.T);
    }
    
    public static SubLObject f38226(SubLObject var112) {
        if (var112 == module0619.UNPROVIDED) {
            var112 = (SubLObject)module0619.NIL;
        }
        return f38229(var112, (SubLObject)module0619.NIL);
    }
    
    public static SubLObject f38230() {
        SubLObject var112 = (SubLObject)module0619.NIL;
        SubLObject var113 = module0137.f8931();
        SubLObject var114 = (SubLObject)module0619.NIL;
        var114 = var113.first();
        while (module0619.NIL != var113) {
            SubLObject var116;
            final SubLObject var115 = var116 = var114;
            SubLObject var117 = (SubLObject)module0619.NIL;
            SubLObject var118 = (SubLObject)module0619.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var116, var115, (SubLObject)module0619.$ic116$);
            var117 = var116.first();
            var116 = (var118 = var116.rest());
            var112 = (SubLObject)ConsesLow.cons(module0137.f8917(var118), var112);
            var113 = var113.rest();
            var114 = var113.first();
        }
        return var112;
    }
    
    public static SubLObject f38229(SubLObject var112, final SubLObject var118) {
        if (module0619.NIL == var112) {
            var112 = f38230();
        }
        final SubLObject var119 = (SubLObject)((module0619.NIL != var118) ? module0619.$ic92$ : module0619.NIL);
        SubLObject var120 = (SubLObject)module0619.NIL;
        SubLObject var121 = var112;
        SubLObject var122 = (SubLObject)module0619.NIL;
        var122 = var121.first();
        while (module0619.NIL != var121) {
            final SubLObject var123 = module0243.f15699(var122, (SubLObject)module0619.$ic90$, (SubLObject)module0619.$ic91$, (SubLObject)module0619.NIL, (SubLObject)module0619.$ic92$, var119);
            var120 = (SubLObject)ConsesLow.cons(var123, var120);
            var121 = var121.rest();
            var122 = var121.first();
        }
        return Sequences.nreverse(var120);
    }
    
    public static SubLObject f38231(final SubLObject var10) {
        final SubLObject var11 = module0067.f4880((SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED);
        SubLObject var12 = (SubLObject)module0619.NIL;
        f38232();
        var12 = f38233(var11);
        f38234(var10, var11);
        f38235();
        return Values.values(var10, var12);
    }
    
    public static SubLObject f38233(final SubLObject var120) {
        final SubLThread var121 = SubLProcess.currentSubLThread();
        SubLObject var122 = (SubLObject)module0619.NIL;
        if (module0619.NIL != module0035.sublisp_boolean(module0619.$g4764$.getDynamicValue(var121))) {
            SubLObject var123 = (SubLObject)module0619.NIL;
            final SubLObject var124 = module0619.$g4764$.getDynamicValue(var121);
            module0012.$g82$.setDynamicValue((SubLObject)module0619.$ic117$, var121);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var121);
            module0012.$g83$.setDynamicValue(Sequences.length(var124), var121);
            module0012.$g84$.setDynamicValue((SubLObject)module0619.ZERO_INTEGER, var121);
            final SubLObject var125 = module0012.$g75$.currentBinding(var121);
            final SubLObject var126 = module0012.$g76$.currentBinding(var121);
            final SubLObject var127 = module0012.$g77$.currentBinding(var121);
            final SubLObject var128 = module0012.$g78$.currentBinding(var121);
            try {
                module0012.$g75$.bind((SubLObject)module0619.ZERO_INTEGER, var121);
                module0012.$g76$.bind((SubLObject)module0619.NIL, var121);
                module0012.$g77$.bind((SubLObject)module0619.T, var121);
                module0012.$g78$.bind(Time.get_universal_time(), var121);
                module0012.f478(module0012.$g82$.getDynamicValue(var121));
                SubLObject var129 = var124;
                SubLObject var130 = (SubLObject)module0619.NIL;
                var130 = var129.first();
                while (module0619.NIL != var129) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var121), module0012.$g83$.getDynamicValue(var121));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var121), (SubLObject)module0619.ONE_INTEGER), var121);
                    SubLObject var131 = (SubLObject)module0619.NIL;
                    try {
                        var121.throwStack.push(module0003.$g3$.getGlobalValue());
                        final SubLObject var21_127 = Errors.$error_handler$.currentBinding(var121);
                        try {
                            Errors.$error_handler$.bind((SubLObject)module0619.$ic118$, var121);
                            try {
                                f38236();
                                module0104.f7414(var130, (SubLObject)module0619.$ic119$, (SubLObject)module0619.NIL, (SubLObject)module0619.NIL, (SubLObject)module0619.$ic49$, StreamsLow.$null_output$.getDynamicValue(var121), module0029.$g835$.getDynamicValue(var121));
                                f38237(var120);
                            }
                            catch (Throwable var132) {
                                Errors.handleThrowable(var132, (SubLObject)module0619.NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(var21_127, var121);
                        }
                    }
                    catch (Throwable var133) {
                        var131 = Errors.handleThrowable(var133, module0003.$g3$.getGlobalValue());
                    }
                    finally {
                        var121.throwStack.pop();
                    }
                    if (var131.isString()) {
                        var123 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var130, var131), var123);
                    }
                    var129 = var129.rest();
                    var130 = var129.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var128, var121);
                module0012.$g77$.rebind(var127, var121);
                module0012.$g76$.rebind(var126, var121);
                module0012.$g75$.rebind(var125, var121);
            }
            if (module0619.NIL != module0035.sublisp_boolean(var123)) {
                var122 = conses_high.putf(var122, (SubLObject)module0619.$ic120$, var123);
            }
        }
        if (module0619.NIL != module0035.sublisp_boolean(module0619.$g4765$.getDynamicValue(var121))) {
            SubLObject var123 = (SubLObject)module0619.NIL;
            final SubLObject var124 = module0619.$g4765$.getDynamicValue(var121);
            module0012.$g82$.setDynamicValue((SubLObject)module0619.$ic121$, var121);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var121);
            module0012.$g83$.setDynamicValue(Sequences.length(var124), var121);
            module0012.$g84$.setDynamicValue((SubLObject)module0619.ZERO_INTEGER, var121);
            final SubLObject var125 = module0012.$g75$.currentBinding(var121);
            final SubLObject var126 = module0012.$g76$.currentBinding(var121);
            final SubLObject var127 = module0012.$g77$.currentBinding(var121);
            final SubLObject var128 = module0012.$g78$.currentBinding(var121);
            try {
                module0012.$g75$.bind((SubLObject)module0619.ZERO_INTEGER, var121);
                module0012.$g76$.bind((SubLObject)module0619.NIL, var121);
                module0012.$g77$.bind((SubLObject)module0619.T, var121);
                module0012.$g78$.bind(Time.get_universal_time(), var121);
                module0012.f478(module0012.$g82$.getDynamicValue(var121));
                SubLObject var129 = var124;
                SubLObject var134 = (SubLObject)module0619.NIL;
                var134 = var129.first();
                while (module0619.NIL != var129) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var121), module0012.$g83$.getDynamicValue(var121));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var121), (SubLObject)module0619.ONE_INTEGER), var121);
                    var123 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var134, (SubLObject)module0619.$ic122$), var123);
                    var129 = var129.rest();
                    var134 = var129.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var128, var121);
                module0012.$g77$.rebind(var127, var121);
                module0012.$g76$.rebind(var126, var121);
                module0012.$g75$.rebind(var125, var121);
            }
            if (module0619.NIL != module0035.sublisp_boolean(var123)) {
                var122 = conses_high.putf(var122, (SubLObject)module0619.$ic123$, var123);
            }
        }
        if (module0619.NIL != module0035.sublisp_boolean(module0619.$g4766$.getDynamicValue(var121))) {
            SubLObject var123 = (SubLObject)module0619.NIL;
            module0012.$g82$.setDynamicValue((SubLObject)module0619.$ic124$, var121);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var121);
            module0012.$g83$.setDynamicValue((SubLObject)module0619.ONE_INTEGER, var121);
            module0012.$g84$.setDynamicValue((SubLObject)module0619.ZERO_INTEGER, var121);
            final SubLObject var135 = module0012.$g75$.currentBinding(var121);
            final SubLObject var136 = module0012.$g76$.currentBinding(var121);
            final SubLObject var137 = module0012.$g77$.currentBinding(var121);
            final SubLObject var138 = module0012.$g78$.currentBinding(var121);
            try {
                module0012.$g75$.bind((SubLObject)module0619.ZERO_INTEGER, var121);
                module0012.$g76$.bind((SubLObject)module0619.NIL, var121);
                module0012.$g77$.bind((SubLObject)module0619.T, var121);
                module0012.$g78$.bind(Time.get_universal_time(), var121);
                module0012.f478(module0012.$g82$.getDynamicValue(var121));
                SubLObject var139;
                SubLObject var140;
                SubLObject var21_128;
                for (var139 = (SubLObject)module0619.NIL, var139 = (SubLObject)module0619.ZERO_INTEGER; var139.numL(module0012.$g83$.getDynamicValue(var121)); var139 = Numbers.add(var139, (SubLObject)module0619.ONE_INTEGER)) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var121), module0012.$g83$.getDynamicValue(var121));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var121), (SubLObject)module0619.ONE_INTEGER), var121);
                    var140 = (SubLObject)module0619.NIL;
                    try {
                        var121.throwStack.push(module0003.$g3$.getGlobalValue());
                        var21_128 = Errors.$error_handler$.currentBinding(var121);
                        try {
                            Errors.$error_handler$.bind((SubLObject)module0619.$ic118$, var121);
                            try {
                                f38236();
                                module0557.f34254((SubLObject)module0619.ZERO_INTEGER, (SubLObject)module0619.ONE_INTEGER, (SubLObject)module0619.SIX_INTEGER, StreamsLow.$null_output$.getDynamicValue(var121));
                                f38237(var120);
                            }
                            catch (Throwable var141) {
                                Errors.handleThrowable(var141, (SubLObject)module0619.NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(var21_128, var121);
                        }
                    }
                    catch (Throwable var142) {
                        var140 = Errors.handleThrowable(var142, module0003.$g3$.getGlobalValue());
                    }
                    finally {
                        var121.throwStack.pop();
                    }
                    if (var140.isString()) {
                        var123 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)module0619.$ic125$, var140), var123);
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var138, var121);
                module0012.$g77$.rebind(var137, var121);
                module0012.$g76$.rebind(var136, var121);
                module0012.$g75$.rebind(var135, var121);
            }
            if (module0619.NIL != module0035.sublisp_boolean(var123)) {
                var122 = conses_high.putf(var122, (SubLObject)module0619.$ic125$, var123);
            }
        }
        return var122;
    }
    
    public static SubLObject f38232() {
        return module0243.f15711();
    }
    
    public static SubLObject f38236() {
        return module0243.f15713();
    }
    
    public static SubLObject f38237(final SubLObject var120) {
        return module0243.f15714(var120);
    }
    
    public static SubLObject f38234(final SubLObject var10, final SubLObject var120) {
        final SubLThread var121 = SubLProcess.currentSubLThread();
        SubLObject var122 = (SubLObject)module0619.NIL;
        try {
            final SubLObject var123 = stream_macros.$stream_requires_locking$.currentBinding(var121);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0619.NIL, var121);
                var122 = compatibility.open_binary(var10, (SubLObject)module0619.$ic24$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var123, var121);
            }
            if (!var122.isStream()) {
                Errors.error((SubLObject)module0619.$ic25$, var10);
            }
            final SubLObject var124 = var122;
            module0243.f15716(var124, var120);
        }
        finally {
            final SubLObject var125 = Threads.$is_thread_performing_cleanupP$.currentBinding(var121);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0619.T, var121);
                if (var122.isStream()) {
                    streams_high.close(var122, (SubLObject)module0619.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var125, var121);
            }
        }
        return var10;
    }
    
    public static SubLObject f38235() {
        return module0243.f15717();
    }
    
    public static SubLObject f38238() {
        return Time.get_universal_time();
    }
    
    public static SubLObject f38239() {
        module0574.f35185((SubLObject)module0619.$ic128$);
        SubLObject var65 = module0061.f4460();
        SubLObject var66 = (SubLObject)module0619.NIL;
        var66 = var65.first();
        while (module0619.NIL != var65) {
            final SubLObject var67 = module0061.f4461(var66);
            if (module0619.$ic129$ != var67) {
                module0061.f4453(var67);
            }
            var65 = var65.rest();
            var66 = var65.first();
        }
        while (module0619.NIL != module0593.f36288()) {
            Threads.sleep((SubLObject)module0619.ONE_INTEGER);
        }
        return (SubLObject)module0619.$ic87$;
    }
    
    public static SubLObject f38240(final SubLObject var135) {
        final SubLThread var136 = SubLProcess.currentSubLThread();
        final SubLObject var137 = module0018.f971();
        SubLObject var138 = (SubLObject)module0619.NIL;
        try {
            var136.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var139 = Errors.$error_handler$.currentBinding(var136);
            try {
                Errors.$error_handler$.bind((SubLObject)module0619.$ic118$, var136);
                try {
                    module0018.f970(Numbers.subtract(var137, (SubLObject)module0619.ONE_INTEGER));
                    module0618.f37926(var135);
                }
                catch (Throwable var140) {
                    Errors.handleThrowable(var140, (SubLObject)module0619.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var139, var136);
            }
        }
        catch (Throwable var141) {
            var138 = Errors.handleThrowable(var141, module0003.$g3$.getGlobalValue());
        }
        finally {
            var136.throwStack.pop();
        }
        if (var138.isString()) {
            Errors.warn((SubLObject)module0619.$ic131$, var138);
            module0018.f970(var137);
            return Values.values((SubLObject)module0619.$ic132$, var138);
        }
        f38241(var135);
        return module0574.f35224((SubLObject)module0619.UNPROVIDED);
    }
    
    public static SubLObject f38242(final SubLObject var135) {
        return module0004.f78((SubLObject)module0619.$ic134$, (SubLObject)module0619.$ic130$, (SubLObject)ConsesLow.list(var135));
    }
    
    public static SubLObject f38241(final SubLObject var135) {
        final SubLThread var136 = SubLProcess.currentSubLThread();
        final SubLObject var137 = Sequences.cconcatenate(var135, (SubLObject)module0619.$ic135$);
        SubLObject var138 = (SubLObject)module0619.NIL;
        try {
            final SubLObject var139 = stream_macros.$stream_requires_locking$.currentBinding(var136);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0619.NIL, var136);
                var138 = compatibility.open_text(var137, (SubLObject)module0619.$ic24$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var139, var136);
            }
            if (!var138.isStream()) {
                Errors.error((SubLObject)module0619.$ic25$, var137);
            }
            final SubLObject var140 = var138;
            streams_high.write_string(module0051.f3552((SubLObject)module0619.UNPROVIDED), var140, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED);
        }
        finally {
            final SubLObject var141 = Threads.$is_thread_performing_cleanupP$.currentBinding(var136);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0619.T, var136);
                if (var138.isStream()) {
                    streams_high.close(var138, (SubLObject)module0619.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var141, var136);
            }
        }
        return var135;
    }
    
    public static SubLObject f38243(SubLObject var139, SubLObject var140) {
        if (var139 == module0619.UNPROVIDED) {
            var139 = (SubLObject)module0619.NIL;
        }
        if (var140 == module0619.UNPROVIDED) {
            var140 = (SubLObject)module0619.NIL;
        }
        final SubLThread var141 = SubLProcess.currentSubLThread();
        SubLObject var142 = (SubLObject)module0619.NIL;
        if (module0619.NIL == var140) {
            final SubLObject var143 = module0147.$g2094$.currentBinding(var141);
            final SubLObject var144 = module0147.$g2095$.currentBinding(var141);
            try {
                module0147.$g2094$.bind((SubLObject)module0619.$ic136$, var141);
                module0147.$g2095$.bind(module0619.$ic137$, var141);
                var142 = module0259.f16846(module0619.$ic138$, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var144, var141);
                module0147.$g2094$.rebind(var143, var141);
            }
        }
        else {
            final SubLObject var143 = module0147.$g2094$.currentBinding(var141);
            final SubLObject var144 = module0147.$g2095$.currentBinding(var141);
            try {
                module0147.$g2094$.bind((SubLObject)module0619.$ic139$, var141);
                module0147.$g2095$.bind(var140, var141);
                var142 = module0259.f16846(module0619.$ic138$, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var144, var141);
                module0147.$g2094$.rebind(var143, var141);
            }
        }
        SubLObject var145 = var139;
        SubLObject var146 = (SubLObject)module0619.NIL;
        var146 = var145.first();
        while (module0619.NIL != var145) {
            var142 = Sequences.delete(var146, var142, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED);
            var145 = var145.rest();
            var146 = var145.first();
        }
        var142 = module0035.remove_if_not(Symbols.symbol_function((SubLObject)module0619.$ic140$), var142, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED);
        if (module0619.NIL == var140) {
            final SubLObject var143 = module0147.$g2094$.currentBinding(var141);
            final SubLObject var144 = module0147.$g2095$.currentBinding(var141);
            try {
                module0147.$g2094$.bind((SubLObject)module0619.$ic136$, var141);
                module0147.$g2095$.bind(module0619.$ic137$, var141);
                var142 = Sequences.remove_if(Symbols.symbol_function((SubLObject)module0619.$ic141$), var142, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var144, var141);
                module0147.$g2094$.rebind(var143, var141);
            }
        }
        else {
            final SubLObject var143 = module0147.$g2094$.currentBinding(var141);
            final SubLObject var144 = module0147.$g2095$.currentBinding(var141);
            try {
                module0147.$g2094$.bind((SubLObject)module0619.$ic139$, var141);
                module0147.$g2095$.bind(var140, var141);
                var142 = Sequences.remove_if(Symbols.symbol_function((SubLObject)module0619.$ic141$), var142, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var144, var141);
                module0147.$g2094$.rebind(var143, var141);
            }
        }
        var142 = Sort.sort(var142, Symbols.symbol_function((SubLObject)module0619.$ic142$), (SubLObject)module0619.$ic143$);
        var142 = module0549.f33909(var142, (SubLObject)module0619.$ic144$);
        return var142;
    }
    
    public static SubLObject f38244(final SubLObject var143) {
        return module0259.f16854(var143, module0619.$ic145$, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED);
    }
    
    public static SubLObject f38245(final SubLObject var110, SubLObject var144, SubLObject var140) {
        if (var144 == module0619.UNPROVIDED) {
            var144 = (SubLObject)module0619.NIL;
        }
        if (var140 == module0619.UNPROVIDED) {
            var140 = (SubLObject)module0619.NIL;
        }
        final SubLThread var145 = SubLProcess.currentSubLThread();
        if (module0619.NIL == var144) {
            var144 = module0127.f8413();
        }
        final SubLObject var146 = module0077.f5313((SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED);
        final SubLObject var147 = Sequences.cconcatenate(var110, new SubLObject[] { var144, module0561.f34538() });
        SubLObject var148 = (SubLObject)module0619.NIL;
        SubLObject var149 = var147;
        SubLObject var150 = (SubLObject)module0619.NIL;
        var150 = var149.first();
        while (module0619.NIL != var149) {
            if (module0619.NIL != module0269.f17705(var150)) {
                if (module0619.NIL != var140) {
                    final SubLObject var151 = module0147.$g2094$.currentBinding(var145);
                    final SubLObject var152 = module0147.$g2095$.currentBinding(var145);
                    try {
                        module0147.$g2094$.bind((SubLObject)module0619.$ic139$, var145);
                        module0147.$g2095$.bind(var140, var145);
                        var148 = module0256.f16531(var150, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED);
                    }
                    finally {
                        module0147.$g2095$.rebind(var152, var145);
                        module0147.$g2094$.rebind(var151, var145);
                    }
                }
                else {
                    final SubLObject var151 = module0147.$g2094$.currentBinding(var145);
                    final SubLObject var152 = module0147.$g2095$.currentBinding(var145);
                    try {
                        module0147.$g2094$.bind((SubLObject)module0619.$ic136$, var145);
                        module0147.$g2095$.bind(module0619.$ic137$, var145);
                        var148 = module0256.f16531(var150, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED);
                    }
                    finally {
                        module0147.$g2095$.rebind(var152, var145);
                        module0147.$g2094$.rebind(var151, var145);
                    }
                }
            }
            else if (module0619.NIL != var140) {
                final SubLObject var151 = module0147.$g2094$.currentBinding(var145);
                final SubLObject var152 = module0147.$g2095$.currentBinding(var145);
                try {
                    module0147.$g2094$.bind((SubLObject)module0619.$ic139$, var145);
                    module0147.$g2095$.bind(var140, var145);
                    var148 = module0259.f16840(var150, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED);
                }
                finally {
                    module0147.$g2095$.rebind(var152, var145);
                    module0147.$g2094$.rebind(var151, var145);
                }
            }
            else {
                final SubLObject var151 = module0147.$g2094$.currentBinding(var145);
                final SubLObject var152 = module0147.$g2095$.currentBinding(var145);
                try {
                    module0147.$g2094$.bind((SubLObject)module0619.$ic136$, var145);
                    module0147.$g2095$.bind(module0619.$ic137$, var145);
                    var148 = module0259.f16840(var150, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED);
                }
                finally {
                    module0147.$g2095$.rebind(var152, var145);
                    module0147.$g2094$.rebind(var151, var145);
                }
            }
            module0078.f5374(var148, var146);
            var149 = var149.rest();
            var150 = var149.first();
        }
        return module0077.f5312(var146);
    }
    
    public static SubLObject f38246(final SubLObject var147, final SubLObject var148, SubLObject var149) {
        if (var149 == module0619.UNPROVIDED) {
            var149 = (SubLObject)module0619.NIL;
        }
        final SubLThread var150 = SubLProcess.currentSubLThread();
        final SubLObject var151 = module0173.f10962();
        final SubLObject var152 = Numbers.floor(Numbers.multiply(var148, var151), (SubLObject)module0619.UNPROVIDED);
        if (!var152.numL(var151)) {
            if (var151.numE(var152)) {
                Errors.warn((SubLObject)module0619.$ic146$);
                return Values.values(module0173.f10962(), (SubLObject)module0619.$ic147$);
            }
            Errors.error((SubLObject)module0619.$ic148$, var148, var152, var151);
        }
        module0012.$g82$.setDynamicValue((SubLObject)module0619.$ic149$, var150);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var150);
        module0012.$g83$.setDynamicValue(Sequences.length(var147), var150);
        module0012.$g84$.setDynamicValue((SubLObject)module0619.ZERO_INTEGER, var150);
        final SubLObject var153 = module0012.$g75$.currentBinding(var150);
        final SubLObject var154 = module0012.$g76$.currentBinding(var150);
        final SubLObject var155 = module0012.$g77$.currentBinding(var150);
        final SubLObject var156 = module0012.$g78$.currentBinding(var150);
        try {
            module0012.$g75$.bind((SubLObject)module0619.ZERO_INTEGER, var150);
            module0012.$g76$.bind((SubLObject)module0619.NIL, var150);
            module0012.$g77$.bind((SubLObject)module0619.T, var150);
            module0012.$g78$.bind(Time.get_universal_time(), var150);
            module0012.f478(module0012.$g82$.getDynamicValue(var150));
            SubLObject var157 = var147;
            SubLObject var158 = (SubLObject)module0619.NIL;
            var158 = var157.first();
            while (module0619.NIL != var157) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var150), module0012.$g83$.getDynamicValue(var150));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var150), (SubLObject)module0619.ONE_INTEGER), var150);
                SubLObject var159 = (SubLObject)module0619.NIL;
                try {
                    var150.throwStack.push(module0619.$ic150$);
                    final SubLObject var21_154 = Errors.$error_handler$.currentBinding(var150);
                    try {
                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0619.$ic151$), var150);
                        try {
                            if (module0619.NIL != var149) {
                                module0006.f218((SubLObject)module0619.T, (SubLObject)module0619.$ic152$, module0051.f3552((SubLObject)module0619.UNPROVIDED), var158, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED);
                            }
                            final SubLObject var21_155 = module0147.$g2094$.currentBinding(var150);
                            final SubLObject var24_156 = module0147.$g2095$.currentBinding(var150);
                            try {
                                module0147.$g2094$.bind((SubLObject)module0619.$ic136$, var150);
                                module0147.$g2095$.bind(module0619.$ic137$, var150);
                                final SubLObject var160 = var158;
                                final SubLObject var21_156 = module0137.$g1605$.currentBinding(var150);
                                final SubLObject var24_157 = module0139.$g1636$.currentBinding(var150);
                                try {
                                    module0137.$g1605$.bind(module0137.f8955(module0619.$ic106$), var150);
                                    module0139.$g1636$.bind(module0139.f9007(), var150);
                                    SubLObject var160_161 = var160;
                                    final SubLObject var161 = (SubLObject)module0619.$ic155$;
                                    final SubLObject var162 = module0056.f4145(var161);
                                    final SubLObject var21_157 = module0139.$g1635$.currentBinding(var150);
                                    try {
                                        module0139.$g1635$.bind(module0139.f9007(), var150);
                                        final SubLObject var163 = (SubLObject)module0619.NIL;
                                        final SubLObject var21_158 = module0141.$g1714$.currentBinding(var150);
                                        final SubLObject var24_158 = module0141.$g1715$.currentBinding(var150);
                                        try {
                                            module0141.$g1714$.bind((module0619.NIL != var163) ? var163 : module0141.f9283(), var150);
                                            module0141.$g1715$.bind((SubLObject)((module0619.NIL != var163) ? module0619.$ic156$ : module0141.$g1715$.getDynamicValue(var150)), var150);
                                            if (module0619.NIL != var163 && module0619.NIL != module0136.f8864() && module0619.NIL == module0141.f9279(var163)) {
                                                final SubLObject var164 = module0136.$g1591$.getDynamicValue(var150);
                                                if (var164.eql((SubLObject)module0619.$ic132$)) {
                                                    module0136.f8870((SubLObject)module0619.ONE_INTEGER, (SubLObject)module0619.$ic157$, var163, (SubLObject)module0619.$ic158$, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED);
                                                }
                                                else if (var164.eql((SubLObject)module0619.$ic159$)) {
                                                    module0136.f8871((SubLObject)module0619.ONE_INTEGER, (SubLObject)module0619.$ic160$, (SubLObject)module0619.$ic157$, var163, (SubLObject)module0619.$ic158$, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED);
                                                }
                                                else if (var164.eql((SubLObject)module0619.$ic161$)) {
                                                    Errors.warn((SubLObject)module0619.$ic157$, var163, (SubLObject)module0619.$ic158$);
                                                }
                                                else {
                                                    Errors.warn((SubLObject)module0619.$ic162$, module0136.$g1591$.getDynamicValue(var150));
                                                    Errors.cerror((SubLObject)module0619.$ic160$, (SubLObject)module0619.$ic157$, var163, (SubLObject)module0619.$ic158$);
                                                }
                                            }
                                            final SubLObject var21_159 = module0141.$g1670$.currentBinding(var150);
                                            final SubLObject var24_159 = module0141.$g1671$.currentBinding(var150);
                                            final SubLObject var27_171 = module0141.$g1672$.currentBinding(var150);
                                            final SubLObject var28_172 = module0141.$g1674$.currentBinding(var150);
                                            final SubLObject var165 = module0137.$g1605$.currentBinding(var150);
                                            try {
                                                module0141.$g1670$.bind(module0244.f15771(module0137.f8955(module0619.$ic106$)), var150);
                                                module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955(module0619.$ic106$))), var150);
                                                module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955(module0619.$ic106$))), var150);
                                                module0141.$g1674$.bind((SubLObject)module0619.NIL, var150);
                                                module0137.$g1605$.bind(module0244.f15771(module0137.f8955(module0619.$ic106$)), var150);
                                                if (module0619.NIL != module0136.f8865() || module0619.NIL != module0244.f15795(var160, module0137.f8955((SubLObject)module0619.UNPROVIDED))) {
                                                    final SubLObject var21_160 = module0141.$g1677$.currentBinding(var150);
                                                    final SubLObject var24_160 = module0138.$g1619$.currentBinding(var150);
                                                    final SubLObject var27_172 = module0141.$g1674$.currentBinding(var150);
                                                    try {
                                                        module0141.$g1677$.bind(module0141.f9210(), var150);
                                                        module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955(module0619.$ic106$))), var150);
                                                        module0141.$g1674$.bind((SubLObject)module0619.NIL, var150);
                                                        module0249.f16055(var160_161, (SubLObject)module0619.UNPROVIDED);
                                                        while (module0619.NIL != var160_161) {
                                                            final SubLObject var166 = var160_161;
                                                            SubLObject var168;
                                                            final SubLObject var167 = var168 = module0200.f12443(module0137.f8955(module0619.$ic106$));
                                                            SubLObject var169 = (SubLObject)module0619.NIL;
                                                            var169 = var168.first();
                                                            while (module0619.NIL != var168) {
                                                                final SubLObject var21_161 = module0137.$g1605$.currentBinding(var150);
                                                                final SubLObject var24_161 = module0141.$g1674$.currentBinding(var150);
                                                                try {
                                                                    module0137.$g1605$.bind(var169, var150);
                                                                    module0141.$g1674$.bind((SubLObject)((module0619.NIL != module0141.f9205((SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0619.NIL == module0141.$g1674$.getDynamicValue(var150)) : module0141.$g1674$.getDynamicValue(var150)), var150);
                                                                    final SubLObject var170 = module0228.f15229(var166);
                                                                    if (module0619.NIL != module0138.f8992(var170)) {
                                                                        final SubLObject var171 = module0242.f15664(var170, module0137.f8955((SubLObject)module0619.UNPROVIDED));
                                                                        if (module0619.NIL != var171) {
                                                                            final SubLObject var172 = module0245.f15834(var171, module0244.f15780(module0137.f8955(module0619.$ic106$)), module0137.f8955((SubLObject)module0619.UNPROVIDED));
                                                                            if (module0619.NIL != var172) {
                                                                                SubLObject var173;
                                                                                for (var173 = module0066.f4838(module0067.f4891(var172)); module0619.NIL == module0066.f4841(var173); var173 = module0066.f4840(var173)) {
                                                                                    var150.resetMultipleValues();
                                                                                    final SubLObject var174 = module0066.f4839(var173);
                                                                                    final SubLObject var175 = var150.secondMultipleValue();
                                                                                    var150.resetMultipleValues();
                                                                                    if (module0619.NIL != module0147.f9507(var174)) {
                                                                                        final SubLObject var21_162 = module0138.$g1623$.currentBinding(var150);
                                                                                        try {
                                                                                            module0138.$g1623$.bind(var174, var150);
                                                                                            SubLObject var103_188;
                                                                                            for (var103_188 = module0066.f4838(module0067.f4891(var175)); module0619.NIL == module0066.f4841(var103_188); var103_188 = module0066.f4840(var103_188)) {
                                                                                                var150.resetMultipleValues();
                                                                                                final SubLObject var176 = module0066.f4839(var103_188);
                                                                                                final SubLObject var177 = var150.secondMultipleValue();
                                                                                                var150.resetMultipleValues();
                                                                                                if (module0619.NIL != module0141.f9289(var176)) {
                                                                                                    final SubLObject var21_163 = module0138.$g1624$.currentBinding(var150);
                                                                                                    try {
                                                                                                        module0138.$g1624$.bind(var176, var150);
                                                                                                        final SubLObject var178 = var177;
                                                                                                        if (module0619.NIL != module0077.f5302(var178)) {
                                                                                                            final SubLObject var179 = module0077.f5333(var178);
                                                                                                            SubLObject var180;
                                                                                                            SubLObject var181;
                                                                                                            SubLObject var182;
                                                                                                            for (var180 = module0032.f1741(var179), var181 = (SubLObject)module0619.NIL, var181 = module0032.f1742(var180, var179); module0619.NIL == module0032.f1744(var180, var181); var181 = module0032.f1743(var181)) {
                                                                                                                var182 = module0032.f1745(var180, var181);
                                                                                                                if (module0619.NIL != module0032.f1746(var181, var182) && module0619.NIL == module0249.f16059(var182, module0139.$g1636$.getDynamicValue(var150))) {
                                                                                                                    module0249.f16055(var182, module0139.$g1636$.getDynamicValue(var150));
                                                                                                                    module0540.f33510(var182);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        else if (var178.isList()) {
                                                                                                            SubLObject var124_194 = var178;
                                                                                                            SubLObject var183 = (SubLObject)module0619.NIL;
                                                                                                            var183 = var124_194.first();
                                                                                                            while (module0619.NIL != var124_194) {
                                                                                                                if (module0619.NIL == module0249.f16059(var183, module0139.$g1636$.getDynamicValue(var150))) {
                                                                                                                    module0249.f16055(var183, module0139.$g1636$.getDynamicValue(var150));
                                                                                                                    module0540.f33510(var183);
                                                                                                                }
                                                                                                                var124_194 = var124_194.rest();
                                                                                                                var183 = var124_194.first();
                                                                                                            }
                                                                                                        }
                                                                                                        else {
                                                                                                            Errors.error((SubLObject)module0619.$ic163$, var178);
                                                                                                        }
                                                                                                    }
                                                                                                    finally {
                                                                                                        module0138.$g1624$.rebind(var21_163, var150);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            module0066.f4842(var103_188);
                                                                                        }
                                                                                        finally {
                                                                                            module0138.$g1623$.rebind(var21_162, var150);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                module0066.f4842(var173);
                                                                            }
                                                                        }
                                                                        else {
                                                                            module0136.f8870((SubLObject)module0619.FIVE_INTEGER, (SubLObject)module0619.$ic164$, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED);
                                                                        }
                                                                        if (module0619.NIL != module0200.f12419(var170, module0137.f8955((SubLObject)module0619.UNPROVIDED))) {
                                                                            SubLObject var124_195 = module0248.f15995(var170);
                                                                            SubLObject var184 = (SubLObject)module0619.NIL;
                                                                            var184 = var124_195.first();
                                                                            while (module0619.NIL != var124_195) {
                                                                                SubLObject var186;
                                                                                final SubLObject var185 = var186 = var184;
                                                                                SubLObject var187 = (SubLObject)module0619.NIL;
                                                                                SubLObject var188 = (SubLObject)module0619.NIL;
                                                                                SubLObject var189 = (SubLObject)module0619.NIL;
                                                                                cdestructuring_bind.destructuring_bind_must_consp(var186, var185, (SubLObject)module0619.$ic165$);
                                                                                var187 = var186.first();
                                                                                var186 = var186.rest();
                                                                                cdestructuring_bind.destructuring_bind_must_consp(var186, var185, (SubLObject)module0619.$ic165$);
                                                                                var188 = var186.first();
                                                                                var186 = var186.rest();
                                                                                cdestructuring_bind.destructuring_bind_must_consp(var186, var185, (SubLObject)module0619.$ic165$);
                                                                                var189 = var186.first();
                                                                                var186 = var186.rest();
                                                                                if (module0619.NIL == var186) {
                                                                                    if (module0619.NIL != module0147.f9507(var188)) {
                                                                                        final SubLObject var21_164 = module0138.$g1623$.currentBinding(var150);
                                                                                        try {
                                                                                            module0138.$g1623$.bind(var188, var150);
                                                                                            if (module0619.NIL != module0141.f9289(var189)) {
                                                                                                final SubLObject var21_165 = module0138.$g1624$.currentBinding(var150);
                                                                                                try {
                                                                                                    module0138.$g1624$.bind(var189, var150);
                                                                                                    final SubLObject var178;
                                                                                                    final SubLObject var190 = var178 = (SubLObject)ConsesLow.list(var187);
                                                                                                    if (module0619.NIL != module0077.f5302(var178)) {
                                                                                                        final SubLObject var179 = module0077.f5333(var178);
                                                                                                        SubLObject var180;
                                                                                                        SubLObject var181;
                                                                                                        SubLObject var182;
                                                                                                        for (var180 = module0032.f1741(var179), var181 = (SubLObject)module0619.NIL, var181 = module0032.f1742(var180, var179); module0619.NIL == module0032.f1744(var180, var181); var181 = module0032.f1743(var181)) {
                                                                                                            var182 = module0032.f1745(var180, var181);
                                                                                                            if (module0619.NIL != module0032.f1746(var181, var182) && module0619.NIL == module0249.f16059(var182, module0139.$g1636$.getDynamicValue(var150))) {
                                                                                                                module0249.f16055(var182, module0139.$g1636$.getDynamicValue(var150));
                                                                                                                module0540.f33510(var182);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    else if (var178.isList()) {
                                                                                                        SubLObject var124_196 = var178;
                                                                                                        SubLObject var183 = (SubLObject)module0619.NIL;
                                                                                                        var183 = var124_196.first();
                                                                                                        while (module0619.NIL != var124_196) {
                                                                                                            if (module0619.NIL == module0249.f16059(var183, module0139.$g1636$.getDynamicValue(var150))) {
                                                                                                                module0249.f16055(var183, module0139.$g1636$.getDynamicValue(var150));
                                                                                                                module0540.f33510(var183);
                                                                                                            }
                                                                                                            var124_196 = var124_196.rest();
                                                                                                            var183 = var124_196.first();
                                                                                                        }
                                                                                                    }
                                                                                                    else {
                                                                                                        Errors.error((SubLObject)module0619.$ic163$, var178);
                                                                                                    }
                                                                                                }
                                                                                                finally {
                                                                                                    module0138.$g1624$.rebind(var21_165, var150);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            module0138.$g1623$.rebind(var21_164, var150);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    cdestructuring_bind.cdestructuring_bind_error(var185, (SubLObject)module0619.$ic165$);
                                                                                }
                                                                                var124_195 = var124_195.rest();
                                                                                var184 = var124_195.first();
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (module0619.NIL != module0155.f9785(var170, (SubLObject)module0619.UNPROVIDED)) {
                                                                        SubLObject var65_206;
                                                                        final SubLObject var191 = var65_206 = ((module0619.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955(module0619.$ic106$)), module0141.$g1714$.getDynamicValue(var150), module0137.f8955((SubLObject)module0619.UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955(module0619.$ic106$)), module0141.$g1714$.getDynamicValue(var150), module0137.f8955((SubLObject)module0619.UNPROVIDED)));
                                                                        SubLObject var192 = (SubLObject)module0619.NIL;
                                                                        var192 = var65_206.first();
                                                                        while (module0619.NIL != var65_206) {
                                                                            final SubLObject var21_166 = module0138.$g1625$.currentBinding(var150);
                                                                            try {
                                                                                module0138.$g1625$.bind(var192, var150);
                                                                                final SubLObject var194;
                                                                                final SubLObject var193 = var194 = Functions.funcall(var192, var170);
                                                                                if (module0619.NIL != module0077.f5302(var194)) {
                                                                                    final SubLObject var195 = module0077.f5333(var194);
                                                                                    SubLObject var196;
                                                                                    SubLObject var197;
                                                                                    SubLObject var198;
                                                                                    for (var196 = module0032.f1741(var195), var197 = (SubLObject)module0619.NIL, var197 = module0032.f1742(var196, var195); module0619.NIL == module0032.f1744(var196, var197); var197 = module0032.f1743(var197)) {
                                                                                        var198 = module0032.f1745(var196, var197);
                                                                                        if (module0619.NIL != module0032.f1746(var197, var198) && module0619.NIL == module0249.f16059(var198, module0139.$g1636$.getDynamicValue(var150))) {
                                                                                            module0249.f16055(var198, module0139.$g1636$.getDynamicValue(var150));
                                                                                            module0540.f33510(var198);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var194.isList()) {
                                                                                    SubLObject var124_197 = var194;
                                                                                    SubLObject var199 = (SubLObject)module0619.NIL;
                                                                                    var199 = var124_197.first();
                                                                                    while (module0619.NIL != var124_197) {
                                                                                        if (module0619.NIL == module0249.f16059(var199, module0139.$g1636$.getDynamicValue(var150))) {
                                                                                            module0249.f16055(var199, module0139.$g1636$.getDynamicValue(var150));
                                                                                            module0540.f33510(var199);
                                                                                        }
                                                                                        var124_197 = var124_197.rest();
                                                                                        var199 = var124_197.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)module0619.$ic163$, var194);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1625$.rebind(var21_166, var150);
                                                                            }
                                                                            var65_206 = var65_206.rest();
                                                                            var192 = var65_206.first();
                                                                        }
                                                                    }
                                                                }
                                                                finally {
                                                                    module0141.$g1674$.rebind(var24_161, var150);
                                                                    module0137.$g1605$.rebind(var21_161, var150);
                                                                }
                                                                var168 = var168.rest();
                                                                var169 = var168.first();
                                                            }
                                                            SubLObject var201;
                                                            final SubLObject var200 = var201 = module0200.f12443(module0244.f15771(module0137.f8955(module0619.$ic106$)));
                                                            SubLObject var202 = (SubLObject)module0619.NIL;
                                                            var202 = var201.first();
                                                            while (module0619.NIL != var201) {
                                                                final SubLObject var21_167 = module0137.$g1605$.currentBinding(var150);
                                                                final SubLObject var24_162 = module0141.$g1674$.currentBinding(var150);
                                                                try {
                                                                    module0137.$g1605$.bind(var202, var150);
                                                                    module0141.$g1674$.bind((SubLObject)((module0619.NIL != module0141.f9205((SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0619.NIL == module0141.$g1674$.getDynamicValue(var150)) : module0141.$g1674$.getDynamicValue(var150)), var150);
                                                                    final SubLObject var203 = module0228.f15229(var160_161);
                                                                    if (module0619.NIL != module0138.f8992(var203)) {
                                                                        final SubLObject var204 = module0242.f15664(var203, module0137.f8955((SubLObject)module0619.UNPROVIDED));
                                                                        if (module0619.NIL != var204) {
                                                                            final SubLObject var205 = module0245.f15834(var204, module0138.f8979(), module0137.f8955((SubLObject)module0619.UNPROVIDED));
                                                                            if (module0619.NIL != var205) {
                                                                                SubLObject var206;
                                                                                for (var206 = module0066.f4838(module0067.f4891(var205)); module0619.NIL == module0066.f4841(var206); var206 = module0066.f4840(var206)) {
                                                                                    var150.resetMultipleValues();
                                                                                    final SubLObject var207 = module0066.f4839(var206);
                                                                                    final SubLObject var208 = var150.secondMultipleValue();
                                                                                    var150.resetMultipleValues();
                                                                                    if (module0619.NIL != module0147.f9507(var207)) {
                                                                                        final SubLObject var21_168 = module0138.$g1623$.currentBinding(var150);
                                                                                        try {
                                                                                            module0138.$g1623$.bind(var207, var150);
                                                                                            SubLObject var103_189;
                                                                                            for (var103_189 = module0066.f4838(module0067.f4891(var208)); module0619.NIL == module0066.f4841(var103_189); var103_189 = module0066.f4840(var103_189)) {
                                                                                                var150.resetMultipleValues();
                                                                                                final SubLObject var209 = module0066.f4839(var103_189);
                                                                                                final SubLObject var210 = var150.secondMultipleValue();
                                                                                                var150.resetMultipleValues();
                                                                                                if (module0619.NIL != module0141.f9289(var209)) {
                                                                                                    final SubLObject var21_169 = module0138.$g1624$.currentBinding(var150);
                                                                                                    try {
                                                                                                        module0138.$g1624$.bind(var209, var150);
                                                                                                        final SubLObject var211 = var210;
                                                                                                        if (module0619.NIL != module0077.f5302(var211)) {
                                                                                                            final SubLObject var212 = module0077.f5333(var211);
                                                                                                            SubLObject var213;
                                                                                                            SubLObject var214;
                                                                                                            SubLObject var215;
                                                                                                            for (var213 = module0032.f1741(var212), var214 = (SubLObject)module0619.NIL, var214 = module0032.f1742(var213, var212); module0619.NIL == module0032.f1744(var213, var214); var214 = module0032.f1743(var214)) {
                                                                                                                var215 = module0032.f1745(var213, var214);
                                                                                                                if (module0619.NIL != module0032.f1746(var214, var215) && module0619.NIL == module0249.f16059(var215, (SubLObject)module0619.UNPROVIDED)) {
                                                                                                                    module0249.f16055(var215, (SubLObject)module0619.UNPROVIDED);
                                                                                                                    module0056.f4149(var215, var162);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        else if (var211.isList()) {
                                                                                                            SubLObject var124_198 = var211;
                                                                                                            SubLObject var216 = (SubLObject)module0619.NIL;
                                                                                                            var216 = var124_198.first();
                                                                                                            while (module0619.NIL != var124_198) {
                                                                                                                if (module0619.NIL == module0249.f16059(var216, (SubLObject)module0619.UNPROVIDED)) {
                                                                                                                    module0249.f16055(var216, (SubLObject)module0619.UNPROVIDED);
                                                                                                                    module0056.f4149(var216, var162);
                                                                                                                }
                                                                                                                var124_198 = var124_198.rest();
                                                                                                                var216 = var124_198.first();
                                                                                                            }
                                                                                                        }
                                                                                                        else {
                                                                                                            Errors.error((SubLObject)module0619.$ic163$, var211);
                                                                                                        }
                                                                                                    }
                                                                                                    finally {
                                                                                                        module0138.$g1624$.rebind(var21_169, var150);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            module0066.f4842(var103_189);
                                                                                        }
                                                                                        finally {
                                                                                            module0138.$g1623$.rebind(var21_168, var150);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                module0066.f4842(var206);
                                                                            }
                                                                        }
                                                                        else {
                                                                            module0136.f8870((SubLObject)module0619.FIVE_INTEGER, (SubLObject)module0619.$ic164$, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED);
                                                                        }
                                                                    }
                                                                    else if (module0619.NIL != module0155.f9785(var203, (SubLObject)module0619.UNPROVIDED)) {
                                                                        SubLObject var65_207;
                                                                        final SubLObject var217 = var65_207 = ((module0619.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var150), module0137.f8955((SubLObject)module0619.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var150), module0137.f8955((SubLObject)module0619.UNPROVIDED)));
                                                                        SubLObject var218 = (SubLObject)module0619.NIL;
                                                                        var218 = var65_207.first();
                                                                        while (module0619.NIL != var65_207) {
                                                                            final SubLObject var21_170 = module0138.$g1625$.currentBinding(var150);
                                                                            try {
                                                                                module0138.$g1625$.bind(var218, var150);
                                                                                final SubLObject var220;
                                                                                final SubLObject var219 = var220 = Functions.funcall(var218, var203);
                                                                                if (module0619.NIL != module0077.f5302(var220)) {
                                                                                    final SubLObject var221 = module0077.f5333(var220);
                                                                                    SubLObject var222;
                                                                                    SubLObject var223;
                                                                                    SubLObject var224;
                                                                                    for (var222 = module0032.f1741(var221), var223 = (SubLObject)module0619.NIL, var223 = module0032.f1742(var222, var221); module0619.NIL == module0032.f1744(var222, var223); var223 = module0032.f1743(var223)) {
                                                                                        var224 = module0032.f1745(var222, var223);
                                                                                        if (module0619.NIL != module0032.f1746(var223, var224) && module0619.NIL == module0249.f16059(var224, (SubLObject)module0619.UNPROVIDED)) {
                                                                                            module0249.f16055(var224, (SubLObject)module0619.UNPROVIDED);
                                                                                            module0056.f4149(var224, var162);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var220.isList()) {
                                                                                    SubLObject var124_199 = var220;
                                                                                    SubLObject var225 = (SubLObject)module0619.NIL;
                                                                                    var225 = var124_199.first();
                                                                                    while (module0619.NIL != var124_199) {
                                                                                        if (module0619.NIL == module0249.f16059(var225, (SubLObject)module0619.UNPROVIDED)) {
                                                                                            module0249.f16055(var225, (SubLObject)module0619.UNPROVIDED);
                                                                                            module0056.f4149(var225, var162);
                                                                                        }
                                                                                        var124_199 = var124_199.rest();
                                                                                        var225 = var124_199.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)module0619.$ic163$, var220);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1625$.rebind(var21_170, var150);
                                                                            }
                                                                            var65_207 = var65_207.rest();
                                                                            var218 = var65_207.first();
                                                                        }
                                                                    }
                                                                }
                                                                finally {
                                                                    module0141.$g1674$.rebind(var24_162, var150);
                                                                    module0137.$g1605$.rebind(var21_167, var150);
                                                                }
                                                                var201 = var201.rest();
                                                                var202 = var201.first();
                                                            }
                                                            var160_161 = module0056.f4150(var162);
                                                        }
                                                    }
                                                    finally {
                                                        module0141.$g1674$.rebind(var27_172, var150);
                                                        module0138.$g1619$.rebind(var24_160, var150);
                                                        module0141.$g1677$.rebind(var21_160, var150);
                                                    }
                                                }
                                                else {
                                                    module0136.f8872((SubLObject)module0619.TWO_INTEGER, (SubLObject)module0619.$ic166$, var160, module0244.f15748(module0137.f8955((SubLObject)module0619.UNPROVIDED)), (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED);
                                                }
                                            }
                                            finally {
                                                module0137.$g1605$.rebind(var165, var150);
                                                module0141.$g1674$.rebind(var28_172, var150);
                                                module0141.$g1672$.rebind(var27_171, var150);
                                                module0141.$g1671$.rebind(var24_159, var150);
                                                module0141.$g1670$.rebind(var21_159, var150);
                                            }
                                        }
                                        finally {
                                            module0141.$g1715$.rebind(var24_158, var150);
                                            module0141.$g1714$.rebind(var21_158, var150);
                                        }
                                        module0139.f9011(module0139.$g1635$.getDynamicValue(var150));
                                    }
                                    finally {
                                        module0139.$g1635$.rebind(var21_157, var150);
                                    }
                                    module0139.f9011(module0139.$g1636$.getDynamicValue(var150));
                                }
                                finally {
                                    module0139.$g1636$.rebind(var24_157, var150);
                                    module0137.$g1605$.rebind(var21_156, var150);
                                }
                            }
                            finally {
                                module0147.$g2095$.rebind(var24_156, var150);
                                module0147.$g2094$.rebind(var21_155, var150);
                            }
                            module0540.f33510(var158);
                        }
                        catch (Throwable var226) {
                            Errors.handleThrowable(var226, (SubLObject)module0619.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(var21_154, var150);
                    }
                }
                catch (Throwable var227) {
                    var159 = Errors.handleThrowable(var227, (SubLObject)module0619.$ic150$);
                }
                finally {
                    var150.throwStack.pop();
                }
                if (module0619.NIL != var149) {
                    module0006.f218((SubLObject)module0619.T, (SubLObject)module0619.$ic167$, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED);
                }
                if (module0173.f10962().numLE(var152)) {
                    return Values.values(module0173.f10962(), (SubLObject)module0619.$ic147$);
                }
                var157 = var157.rest();
                var158 = var157.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var156, var150);
            module0012.$g77$.rebind(var155, var150);
            module0012.$g76$.rebind(var154, var150);
            module0012.$g75$.rebind(var153, var150);
        }
        return Values.values(module0173.f10962(), (SubLObject)module0619.$ic169$);
    }
    
    public static SubLObject f38247(final SubLObject var222) {
        final SubLThread var223 = SubLProcess.currentSubLThread();
        SubLObject var224 = (SubLObject)module0619.NIL;
        SubLObject var225 = (SubLObject)module0619.NIL;
        module0006.f218((SubLObject)module0619.T, (SubLObject)module0619.$ic170$, module0051.f3552((SubLObject)module0619.UNPROVIDED), module0173.f10962(), (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED);
        module0006.f218((SubLObject)module0619.T, (SubLObject)module0619.$ic171$, module0051.f3552((SubLObject)module0619.UNPROVIDED), (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED);
        var224 = f38245(var222, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED);
        module0006.f218((SubLObject)module0619.T, (SubLObject)module0619.$ic172$, module0051.f3552((SubLObject)module0619.UNPROVIDED), (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED);
        var225 = f38243(var224, (SubLObject)module0619.UNPROVIDED);
        module0006.f218((SubLObject)module0619.T, (SubLObject)module0619.$ic173$, module0051.f3552((SubLObject)module0619.UNPROVIDED), (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED);
        var223.resetMultipleValues();
        final SubLObject var226 = f38246(var225, (SubLObject)module0619.$ic174$, (SubLObject)module0619.$ic175$);
        final SubLObject var227 = var223.secondMultipleValue();
        var223.resetMultipleValues();
        module0006.f218((SubLObject)module0619.T, (SubLObject)module0619.$ic176$, module0051.f3552((SubLObject)module0619.UNPROVIDED), var226, var227, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED, (SubLObject)module0619.UNPROVIDED);
        return Values.values(var226, var227);
    }
    
    public static SubLObject f38248() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38178", "S#41781", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38179", "S#41782", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38180", "S#41783", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38182", "CYC-BUILD-WORLD-VERIFY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38181", "S#41784", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38183", "S#41785", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38184", "S#41786", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38185", "S#41787", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38186", "S#41788", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38187", "CYC-LOAD-KB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38188", "CYC-LOAD-INCREMENTAL-KB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38189", "CYC-DUMP-STANDARD-KB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38190", "S#41789", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38191", "S#41790", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38192", "S#41791", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38193", "S#41792", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38194", "S#41793", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38195", "S#41794", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38196", "S#41795", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38198", "S#41796", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38197", "S#41797", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38199", "S#41798", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38200", "S#41799", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38201", "S#41800", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38202", "S#41801", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38203", "S#41802", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38204", "S#41803", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38205", "S#41804", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38206", "S#41805", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38207", "S#41806", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38208", "S#9529", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38209", "S#41807", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38210", "LOAD-FILE-DEPENDENCY-INFORMATION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38211", "AUGMENT-FILE-SET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38212", "COMPLETELY-AUGMENT-FILE-SET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38213", "WRITE-ANT-FILESET-DECLARATION", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38214", "CONSTRUCT-ROOTED-FILE-SET-FROM-LIST", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38215", "ROOT-FILE-SET", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38216", "UNROOT-FILE-SET", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38217", "REROOT-FILE-SET", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38218", "S#41808", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38219", "S#41809", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38220", "S#41810", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38221", "S#41811", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38222", "S#41812", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38223", "S#41813", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38225", "S#41814", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38227", "S#41815", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38224", "S#41816", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38228", "S#18451", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38226", "S#18452", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38230", "S#41817", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38229", "S#41818", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38231", "S#41819", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38233", "S#41820", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38232", "S#41821", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38236", "S#41822", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38237", "S#41823", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38234", "S#41824", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38235", "S#41825", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38238", "GET-KB-MINI-DUMP-TIMESTAMP", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38239", "PREPARE-KB-MINI-DUMP", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38240", "PERFORM-KB-MINI-DUMP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38242", "LAUNCH-ASYNCHRONOUS-KB-MINI-DUMP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38241", "S#41826", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38243", "S#41827", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38244", "S#41828", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38245", "S#41829", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38246", "S#41830", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0619", "f38247", "S#41831", 1, 0, false);
        return (SubLObject)module0619.NIL;
    }
    
    public static SubLObject f38249() {
        module0619.$g4757$ = SubLFiles.defparameter("S#41832", (SubLObject)module0619.NIL);
        module0619.$g4758$ = SubLFiles.defparameter("S#41833", (SubLObject)module0619.NIL);
        module0619.$g4759$ = SubLFiles.deflexical("S#41834", (SubLObject)((module0619.NIL != Symbols.boundp((SubLObject)module0619.$ic56$)) ? module0619.$g4759$.getGlobalValue() : module0619.NIL));
        module0619.$g4760$ = SubLFiles.defconstant("S#41835", (SubLObject)module0619.$ic49$);
        module0619.$g4761$ = SubLFiles.deflexical("S#41836", (SubLObject)((module0619.NIL != Symbols.boundp((SubLObject)module0619.$ic57$)) ? module0619.$g4761$.getGlobalValue() : module0619.NIL));
        module0619.$g4762$ = SubLFiles.defconstant("S#41837", (SubLObject)module0619.$ic51$);
        module0619.$g4763$ = SubLFiles.defparameter("S#41838", (SubLObject)ConsesLow.list(new SubLObject[] { f38222((SubLObject)module0619.$ic89$, (SubLObject)module0619.$ic90$, (SubLObject)module0619.$ic91$, (SubLObject)module0619.$ic92$, (SubLObject)module0619.UNPROVIDED), f38222(module0619.$ic93$, (SubLObject)module0619.$ic90$, (SubLObject)module0619.$ic91$, (SubLObject)module0619.$ic92$, (SubLObject)module0619.$ic92$), f38222(module0619.$ic94$, (SubLObject)module0619.$ic95$, (SubLObject)module0619.$ic96$, (SubLObject)module0619.$ic96$, (SubLObject)module0619.$ic97$), f38222(module0619.$ic98$, (SubLObject)module0619.$ic95$, (SubLObject)module0619.$ic96$, (SubLObject)module0619.$ic99$, (SubLObject)module0619.ZERO_INTEGER), f38222(module0619.$ic100$, (SubLObject)module0619.$ic95$, (SubLObject)module0619.$ic96$, (SubLObject)module0619.$ic96$, (SubLObject)module0619.$ic97$), f38222(module0619.$ic101$, (SubLObject)module0619.$ic95$, (SubLObject)module0619.$ic96$, (SubLObject)module0619.$ic96$, (SubLObject)module0619.$ic97$), f38222(module0619.$ic102$, (SubLObject)module0619.$ic95$, (SubLObject)module0619.$ic96$, (SubLObject)module0619.$ic99$, (SubLObject)module0619.ZERO_INTEGER), f38222(module0619.$ic103$, (SubLObject)module0619.$ic95$, (SubLObject)module0619.$ic104$, (SubLObject)module0619.$ic104$, (SubLObject)module0619.$ic105$), f38222(module0619.$ic106$, (SubLObject)module0619.$ic95$, (SubLObject)module0619.$ic107$, (SubLObject)module0619.$ic108$, (SubLObject)module0619.$ic105$), f38222(module0619.$ic109$, (SubLObject)module0619.$ic95$, (SubLObject)module0619.$ic104$, (SubLObject)module0619.$ic110$, (SubLObject)module0619.$ic111$) }));
        module0619.$g4764$ = SubLFiles.defparameter("S#41839", (SubLObject)module0619.NIL);
        module0619.$g4765$ = SubLFiles.defparameter("S#41840", (SubLObject)module0619.NIL);
        module0619.$g4766$ = SubLFiles.defparameter("S#41841", (SubLObject)module0619.NIL);
        return (SubLObject)module0619.NIL;
    }
    
    public static SubLObject f38250() {
        module0002.f38((SubLObject)module0619.$ic1$);
        module0002.f38((SubLObject)module0619.$ic15$);
        module0002.f38((SubLObject)module0619.$ic16$);
        module0002.f38((SubLObject)module0619.$ic17$);
        f38199((SubLObject)module0619.$ic48$, (SubLObject)module0619.$ic49$, (SubLObject)module0619.$ic50$, (SubLObject)module0619.$ic51$);
        f38199((SubLObject)module0619.$ic52$, (SubLObject)module0619.$ic53$, (SubLObject)module0619.$ic54$, (SubLObject)module0619.$ic55$);
        module0003.f57((SubLObject)module0619.$ic56$);
        module0003.f57((SubLObject)module0619.$ic57$);
        module0002.f38((SubLObject)module0619.$ic59$);
        module0002.f38((SubLObject)module0619.$ic62$);
        module0002.f38((SubLObject)module0619.$ic63$);
        module0002.f38((SubLObject)module0619.$ic65$);
        module0002.f38((SubLObject)module0619.$ic73$);
        module0002.f38((SubLObject)module0619.$ic75$);
        module0002.f38((SubLObject)module0619.$ic76$);
        module0002.f38((SubLObject)module0619.$ic77$);
        module0027.f1449((SubLObject)module0619.$ic78$, (SubLObject)ConsesLow.list(new SubLObject[] { module0619.$ic79$, module0619.NIL, module0619.$ic80$, module0619.NIL, module0619.$ic81$, module0619.NIL, module0619.$ic82$, module0619.$ic83$, module0619.$ic84$, module0619.T }), (SubLObject)module0619.$ic85$);
        module0012.f419((SubLObject)module0619.$ic88$);
        module0002.f38((SubLObject)module0619.$ic126$);
        module0002.f38((SubLObject)module0619.$ic127$);
        module0002.f38((SubLObject)module0619.$ic130$);
        module0002.f38((SubLObject)module0619.$ic133$);
        return (SubLObject)module0619.NIL;
    }
    
    public void declareFunctions() {
        f38248();
    }
    
    public void initializeVariables() {
        f38249();
    }
    
    public void runTopLevelForms() {
        f38250();
    }
    
    static {
        me = (SubLFile)new module0619();
        module0619.$g4757$ = null;
        module0619.$g4758$ = null;
        module0619.$g4759$ = null;
        module0619.$g4760$ = null;
        module0619.$g4761$ = null;
        module0619.$g4762$ = null;
        module0619.$g4763$ = null;
        module0619.$g4764$ = null;
        module0619.$g4765$ = null;
        module0619.$g4766$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("TERSE");
        $ic1$ = SubLObjectFactory.makeSymbol("CYC-BUILD-WORLD-VERIFY");
        $ic2$ = SubLObjectFactory.makeString("Continue");
        $ic3$ = SubLObjectFactory.makeString("World file ~A already exists and may not be overwritable if in use.");
        $ic4$ = SubLObjectFactory.makeString("A");
        $ic5$ = SubLObjectFactory.makeString("cyc-");
        $ic6$ = SubLObjectFactory.makeString("-");
        $ic7$ = SubLObjectFactory.makeString("-kb-");
        $ic8$ = SubLObjectFactory.makeString("/cyc/");
        $ic9$ = SubLObjectFactory.makeString("/");
        $ic10$ = SubLObjectFactory.makeString("/install/");
        $ic11$ = SubLObjectFactory.makeString("kb-");
        $ic12$ = SubLObjectFactory.makeString(".load");
        $ic13$ = SubLObjectFactory.makeSymbol("DIRECTORY-P");
        $ic14$ = SubLObjectFactory.makeString("Writing cyc image to ~A~%");
        $ic15$ = SubLObjectFactory.makeSymbol("CYC-LOAD-KB");
        $ic16$ = SubLObjectFactory.makeSymbol("CYC-LOAD-INCREMENTAL-KB");
        $ic17$ = SubLObjectFactory.makeSymbol("CYC-DUMP-STANDARD-KB");
        $ic18$ = SubLObjectFactory.makeString("/home/builder/logs/");
        $ic19$ = SubLObjectFactory.makeString("No log directory ~A ... strange.~%");
        $ic20$ = SubLObjectFactory.makeString("forward-inference-metrics-");
        $ic21$ = SubLObjectFactory.makeString(".html");
        $ic22$ = SubLObjectFactory.makeString("The catchup image expected to be using world ~A but has ~A.");
        $ic23$ = SubLObjectFactory.makeString("Builder's catchup-to-rollover server - DO NOT USE");
        $ic24$ = SubLObjectFactory.makeKeyword("OUTPUT");
        $ic25$ = SubLObjectFactory.makeString("Unable to open ~S");
        $ic26$ = SubLObjectFactory.makeString("Getting caught up to KB rollover to ");
        $ic27$ = SubLObjectFactory.makeSymbol("S#38548", "CYC");
        $ic28$ = SubLObjectFactory.makeString("The agenda is not running.  Fix your init files, probably parameters.lisp.");
        $ic29$ = SubLObjectFactory.makeKeyword("RECEIVE-ONLY");
        $ic30$ = SubLObjectFactory.makeString("TheBuilder");
        $ic31$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Guest"));
        $ic32$ = SubLObjectFactory.makeString("CycAdministrator");
        $ic33$ = SubLObjectFactory.makeString("Getting caught up~%");
        $ic34$ = SubLObjectFactory.makeString("Builder's transcript-loading server - DO NOT USE");
        $ic35$ = SubLObjectFactory.makeKeyword("NONE");
        $ic36$ = SubLObjectFactory.makeString("Builder's catchup-to-current server - DO NOT USE");
        $ic37$ = SubLObjectFactory.makeString("Getting caught up from KB ");
        $ic38$ = SubLObjectFactory.makeString(".");
        $ic39$ = SubLObjectFactory.makeString(" to KB ");
        $ic40$ = SubLObjectFactory.makeKeyword("DEAF");
        $ic41$ = SubLObjectFactory.makeString("Caught up to KB ~A~%");
        $ic42$ = SubLObjectFactory.makeSymbol("KEYWORDP");
        $ic43$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic44$ = SubLObjectFactory.makeString("The cyc product, ~A, is already present with the declared definition.");
        $ic45$ = SubLObjectFactory.makeString("There already exists a different cyc product, ~A, with this definition.");
        $ic46$ = SubLObjectFactory.makeString("The cyc product ~A already exists with a different definition.");
        $ic47$ = SubLObjectFactory.makeSymbol("CDR");
        $ic48$ = SubLObjectFactory.makeKeyword("HEAD");
        $ic49$ = SubLObjectFactory.makeKeyword("STANDARD");
        $ic50$ = SubLObjectFactory.makeKeyword("FULL");
        $ic51$ = SubLObjectFactory.makeString("head");
        $ic52$ = SubLObjectFactory.makeKeyword("CAE-0.3");
        $ic53$ = SubLObjectFactory.makeKeyword("TKB");
        $ic54$ = SubLObjectFactory.makeKeyword("AKB");
        $ic55$ = SubLObjectFactory.makeString("cake-release-0p3-20051215");
        $ic56$ = SubLObjectFactory.makeSymbol("S#41834", "CYC");
        $ic57$ = SubLObjectFactory.makeSymbol("S#41836", "CYC");
        $ic58$ = SubLObjectFactory.makeKeyword("UNKNOWN-CYC-PRODUCT");
        $ic59$ = SubLObjectFactory.makeSymbol("LOAD-FILE-DEPENDENCY-INFORMATION");
        $ic60$ = SubLObjectFactory.makeKeyword("INPUT");
        $ic61$ = SubLObjectFactory.makeSymbol("S#41842", "CYC");
        $ic62$ = SubLObjectFactory.makeSymbol("AUGMENT-FILE-SET");
        $ic63$ = SubLObjectFactory.makeSymbol("COMPLETELY-AUGMENT-FILE-SET");
        $ic64$ = SubLObjectFactory.makeString("Augmenting the file set not terminating after ~A iterations.");
        $ic65$ = SubLObjectFactory.makeSymbol("WRITE-ANT-FILESET-DECLARATION");
        $ic66$ = SubLObjectFactory.makeString("id");
        $ic67$ = SubLObjectFactory.makeString("dir");
        $ic68$ = SubLObjectFactory.makeString("fileset");
        $ic69$ = SubLObjectFactory.makeString("name");
        $ic70$ = SubLObjectFactory.makeKeyword("VALUE");
        $ic71$ = SubLObjectFactory.makeString("include");
        $ic72$ = SubLObjectFactory.makeString("exclude");
        $ic73$ = SubLObjectFactory.makeSymbol("CONSTRUCT-ROOTED-FILE-SET-FROM-LIST");
        $ic74$ = SubLObjectFactory.makeKeyword("UNIX");
        $ic75$ = SubLObjectFactory.makeSymbol("ROOT-FILE-SET");
        $ic76$ = SubLObjectFactory.makeSymbol("UNROOT-FILE-SET");
        $ic77$ = SubLObjectFactory.makeSymbol("REROOT-FILE-SET");
        $ic78$ = SubLObjectFactory.makeSymbol("S#41808", "CYC");
        $ic79$ = SubLObjectFactory.makeKeyword("TEST");
        $ic80$ = SubLObjectFactory.makeKeyword("OWNER");
        $ic81$ = SubLObjectFactory.makeKeyword("CLASSES");
        $ic82$ = SubLObjectFactory.makeKeyword("KB");
        $ic83$ = SubLObjectFactory.makeKeyword("TINY");
        $ic84$ = SubLObjectFactory.makeKeyword("WORKING?");
        $ic85$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("/cycdoc/img/cb/red_diam.gif"), (SubLObject)SubLObjectFactory.makeString("/cycdoc/img/square-minus.gif")), (SubLObject)SubLObjectFactory.makeString("/cycdoc"), (SubLObject)SubLObjectFactory.makeString("doc")), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")));
        $ic86$ = SubLObjectFactory.makeString("Rerooting from ~A to ~A failed and produced ~A.");
        $ic87$ = SubLObjectFactory.makeKeyword("SUCCESS");
        $ic88$ = SubLObjectFactory.makeSymbol("S#41811", "CYC");
        $ic89$ = SubLObjectFactory.makeKeyword("DEFAULT");
        $ic90$ = SubLObjectFactory.makeKeyword("STICKY");
        $ic91$ = SubLObjectFactory.makeKeyword("UNDEFINED");
        $ic92$ = SubLObjectFactory.makeKeyword("ALL");
        $ic93$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $ic94$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $ic95$ = SubLObjectFactory.makeKeyword("SWAPOUT");
        $ic96$ = SubLObjectFactory.makeInteger(500);
        $ic97$ = SubLObjectFactory.makeInteger(200);
        $ic98$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("negationPreds"));
        $ic99$ = SubLObjectFactory.makeInteger(100);
        $ic100$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("disjointWith"));
        $ic101$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlInverse"));
        $ic102$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("negationInverse"));
        $ic103$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic104$ = SubLObjectFactory.makeInteger(5000);
        $ic105$ = SubLObjectFactory.makeInteger(2000);
        $ic106$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic107$ = SubLObjectFactory.makeInteger(10000);
        $ic108$ = SubLObjectFactory.makeInteger(8000);
        $ic109$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $ic110$ = SubLObjectFactory.makeInteger(4000);
        $ic111$ = SubLObjectFactory.makeInteger(1000);
        $ic112$ = SubLObjectFactory.makeSymbol("S#6424", "CYC");
        $ic113$ = SubLObjectFactory.makeSymbol("FIRST");
        $ic114$ = SubLObjectFactory.makeString("The templates list ~A does not contain a default rule.");
        $ic115$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#41843", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2959", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#41844", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#41845", "CYC"));
        $ic116$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeUninternedSymbol("US#3165895"), (SubLObject)SubLObjectFactory.makeSymbol("S#205", "CYC"));
        $ic117$ = SubLObjectFactory.makeString("Gathering SBHL cache tuning data via CYC tests ....");
        $ic118$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic119$ = SubLObjectFactory.makeKeyword("SILENT");
        $ic120$ = SubLObjectFactory.makeKeyword("CYC-TESTS");
        $ic121$ = SubLObjectFactory.makeString("Gathering SBHL cache tuning data via KB queries ....");
        $ic122$ = SubLObjectFactory.makeString("KBQ Support currently not implemented");
        $ic123$ = SubLObjectFactory.makeKeyword("KB-QUERIES");
        $ic124$ = SubLObjectFactory.makeString("Gathering SBHL cache tuning data via CycLOPs ....");
        $ic125$ = SubLObjectFactory.makeKeyword("CYCLOPS");
        $ic126$ = SubLObjectFactory.makeSymbol("GET-KB-MINI-DUMP-TIMESTAMP");
        $ic127$ = SubLObjectFactory.makeSymbol("PREPARE-KB-MINI-DUMP");
        $ic128$ = SubLObjectFactory.makeString("no");
        $ic129$ = SubLObjectFactory.makeKeyword("CYC-API");
        $ic130$ = SubLObjectFactory.makeSymbol("PERFORM-KB-MINI-DUMP");
        $ic131$ = SubLObjectFactory.makeString("Error while performing mini-dump~%~A~%");
        $ic132$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic133$ = SubLObjectFactory.makeSymbol("LAUNCH-ASYNCHRONOUS-KB-MINI-DUMP");
        $ic134$ = SubLObjectFactory.makeString("Mini KB Dumper");
        $ic135$ = SubLObjectFactory.makeString("mini-dump-finished.text");
        $ic136$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic137$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic138$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Collection"));
        $ic139$ = SubLObjectFactory.makeSymbol("S#12278", "CYC");
        $ic140$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic141$ = SubLObjectFactory.makeSymbol("S#41828", "CYC");
        $ic142$ = SubLObjectFactory.makeSymbol("<");
        $ic143$ = SubLObjectFactory.makeSymbol("S#17475", "CYC");
        $ic144$ = SubLObjectFactory.makeKeyword("ASCENDING");
        $ic145$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CollectionType"));
        $ic146$ = SubLObjectFactory.makeString("Nothing to clip.");
        $ic147$ = SubLObjectFactory.makeKeyword("PERCENTAGE");
        $ic148$ = SubLObjectFactory.makeString("Invalid percentage ~A: cannot clip from ~A to ~A.");
        $ic149$ = SubLObjectFactory.makeString("cdolist");
        $ic150$ = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $ic151$ = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic152$ = SubLObjectFactory.makeString("~&~A: Deleting ~A ... ");
        $ic153$ = SubLObjectFactory.makeKeyword("BREADTH");
        $ic154$ = SubLObjectFactory.makeKeyword("QUEUE");
        $ic155$ = SubLObjectFactory.makeKeyword("STACK");
        $ic156$ = SubLObjectFactory.makeSymbol("S#11450", "CYC");
        $ic157$ = SubLObjectFactory.makeString("~A is not a ~A");
        $ic158$ = SubLObjectFactory.makeSymbol("S#11592", "CYC");
        $ic159$ = SubLObjectFactory.makeKeyword("CERROR");
        $ic160$ = SubLObjectFactory.makeString("continue anyway");
        $ic161$ = SubLObjectFactory.makeKeyword("WARN");
        $ic162$ = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic163$ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $ic164$ = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic165$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("US#4D5E436"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#1526883"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#15AA083"));
        $ic166$ = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic167$ = SubLObjectFactory.makeString(" done.~%");
        $ic168$ = SubLObjectFactory.makeSymbol("S#5859", "CYC");
        $ic169$ = SubLObjectFactory.makeKeyword("EXHAUSTED");
        $ic170$ = SubLObjectFactory.makeString("~&~A: Current FORT Count : ~A~%");
        $ic171$ = SubLObjectFactory.makeString("~&~A: Gathering tabu-collections ....~%");
        $ic172$ = SubLObjectFactory.makeString("~&~A: Selecting clippable collections ....~%");
        $ic173$ = SubLObjectFactory.makeString("~&~A: Clipping collections ....~%");
        $ic174$ = (SubLFloat)SubLObjectFactory.makeDouble(0.1);
        $ic175$ = SubLObjectFactory.makeKeyword("LOG");
        $ic176$ = SubLObjectFactory.makeString("~&~A: Clipping stopped at ~A FORTs remaining with reason code ~A.~%");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0619.class
	Total time: 1833 ms
	
	Decompiled with Procyon 0.5.32.
*/