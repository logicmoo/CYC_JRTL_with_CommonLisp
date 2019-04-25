package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0561 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0561";
    public static final String myFingerPrint = "d2dccca0a851e8f582989f1924ca192b071a9d11d04af4d9514d8153921c9649";
    private static SubLSymbol $g4073$;
    private static SubLSymbol $g4074$;
    private static SubLSymbol $g4075$;
    private static SubLSymbol $g4076$;
    private static SubLSymbol $g4077$;
    private static SubLSymbol $g4078$;
    private static SubLSymbol $g4079$;
    private static SubLSymbol $g4080$;
    private static SubLSymbol $g4081$;
    private static SubLSymbol $g4082$;
    private static SubLSymbol $g4083$;
    private static SubLSymbol $g4084$;
    private static SubLSymbol $g4085$;
    private static SubLSymbol $g4086$;
    private static SubLSymbol $g4087$;
    private static SubLSymbol $g4088$;
    private static SubLSymbol $g4089$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLString $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLString $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLString $ic21$;
    private static final SubLList $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLList $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLObject $ic26$;
    private static final SubLObject $ic27$;
    private static final SubLObject $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLInteger $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLObject $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLString $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLString $ic46$;
    private static final SubLString $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLString $ic50$;
    private static final SubLString $ic51$;
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    private static final SubLString $ic55$;
    private static final SubLString $ic56$;
    private static final SubLString $ic57$;
    private static final SubLString $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLString $ic62$;
    private static final SubLString $ic63$;
    private static final SubLString $ic64$;
    private static final SubLString $ic65$;
    private static final SubLString $ic66$;
    private static final SubLString $ic67$;
    private static final SubLString $ic68$;
    private static final SubLString $ic69$;
    private static final SubLString $ic70$;
    private static final SubLString $ic71$;
    private static final SubLString $ic72$;
    private static final SubLString $ic73$;
    private static final SubLString $ic74$;
    private static final SubLString $ic75$;
    private static final SubLString $ic76$;
    private static final SubLString $ic77$;
    private static final SubLString $ic78$;
    private static final SubLString $ic79$;
    private static final SubLString $ic80$;
    private static final SubLString $ic81$;
    private static final SubLString $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLString $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLString $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLString $ic91$;
    private static final SubLString $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLString $ic94$;
    private static final SubLString $ic95$;
    private static final SubLString $ic96$;
    private static final SubLString $ic97$;
    private static final SubLString $ic98$;
    private static final SubLList $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLList $ic101$;
    private static final SubLList $ic102$;
    private static final SubLObject $ic103$;
    private static final SubLString $ic104$;
    private static final SubLString $ic105$;
    private static final SubLString $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLString $ic110$;
    private static final SubLString $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLString $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLObject $ic115$;
    private static final SubLString $ic116$;
    private static final SubLString $ic117$;
    private static final SubLString $ic118$;
    private static final SubLString $ic119$;
    private static final SubLString $ic120$;
    private static final SubLList $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLObject $ic125$;
    private static final SubLString $ic126$;
    private static final SubLObject $ic127$;
    private static final SubLObject $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLObject $ic130$;
    private static final SubLObject $ic131$;
    private static final SubLObject $ic132$;
    
    public static SubLObject f34529(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != constant_handles_oc.f8449(var1) && (NIL != module0259.f16891(var1, $g4073$.getGlobalValue()) || NIL != module0259.f16976(var1, $g4073$.getGlobalValue())));
    }
    
    public static SubLObject f34530(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != constant_handles_oc.f8449(var1) && NIL == f34529(var1));
    }
    
    public static SubLObject f34531(final SubLObject var2) {
        return (SubLObject)makeBoolean(NIL == f34532(var2));
    }
    
    public static SubLObject f34532(final SubLObject var2) {
        return module0035.f2439(Symbols.symbol_function((SubLObject)$ic1$), var2, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f34533() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)NIL;
        final SubLObject var5 = module0147.$g2094$.currentBinding(var3);
        final SubLObject var6 = module0147.$g2095$.currentBinding(var3);
        try {
            module0147.$g2094$.bind((SubLObject)$ic2$, var3);
            module0147.$g2095$.bind($ic3$, var3);
            var4 = module0259.f16848($g4073$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var4 = ConsesLow.append(var4, module0259.f16985($g4073$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        finally {
            module0147.$g2095$.rebind(var6, var3);
            module0147.$g2094$.rebind(var5, var3);
        }
        var4 = module0035.delete_if_not(Symbols.symbol_function((SubLObject)$ic4$), var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        var4 = module0213.f13926(var4, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var4;
    }
    
    public static SubLObject f34534() {
        if ($ic6$ == $g4074$.getGlobalValue()) {
            final SubLObject var7 = f34533();
            $g4074$.setGlobalValue(var7);
        }
        return $g4074$.getGlobalValue();
    }
    
    public static SubLObject f34535() {
        SubLObject var8 = (SubLObject)NIL;
        var8 = module0213.f13926(var8, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var8;
    }
    
    public static SubLObject f34536() {
        if ($ic6$ == $g4075$.getGlobalValue()) {
            final SubLObject var8 = f34535();
            $g4075$.setGlobalValue(var8);
        }
        return $g4075$.getGlobalValue();
    }
    
    public static SubLObject f34537() {
        final SubLObject var7 = f34534();
        final SubLObject var8 = f34536();
        return Sequences.cconcatenate(var7, var8);
    }
    
    public static SubLObject f34538() {
        if ($ic6$ == $g4076$.getGlobalValue()) {
            final SubLObject var9 = f34537();
            $g4076$.setGlobalValue(var9);
        }
        return $g4076$.getGlobalValue();
    }
    
    public static SubLObject f34539() {
        final SubLObject var9 = f34538();
        $g4077$.setGlobalValue(module0076.f5288(var9, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        return module0031.f1670($g4077$.getGlobalValue());
    }
    
    public static SubLObject f34540(final SubLObject var10) {
        return (SubLObject)makeBoolean(NIL != constant_handles_oc.f8449(var10) && NIL != module0031.f1688(var10, $g4077$.getGlobalValue()));
    }
    
    public static SubLObject f34541(final SubLObject var10) {
        return (SubLObject)makeBoolean(NIL != constant_handles_oc.f8449(var10) && NIL == module0031.f1688(var10, $g4077$.getGlobalValue()));
    }
    
    public static SubLObject f34542() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = f34538();
        final SubLObject var5 = Numbers.integerDivide(Sequences.length(var4), (SubLObject)TEN_INTEGER);
        SubLObject var6 = (SubLObject)NIL;
        final SubLObject var7 = module0077.f5313(Symbols.symbol_function((SubLObject)EQL), var5);
        final SubLObject var8 = var4;
        module0012.$g82$.setDynamicValue((SubLObject)$ic10$, var3);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var3);
        module0012.$g83$.setDynamicValue(Sequences.length(var8), var3);
        module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var3);
        final SubLObject var9 = module0012.$g75$.currentBinding(var3);
        final SubLObject var10 = module0012.$g76$.currentBinding(var3);
        final SubLObject var11 = module0012.$g77$.currentBinding(var3);
        final SubLObject var12 = module0012.$g78$.currentBinding(var3);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var3);
            module0012.$g76$.bind((SubLObject)NIL, var3);
            module0012.$g77$.bind((SubLObject)T, var3);
            module0012.$g78$.bind(Time.get_universal_time(), var3);
            module0012.f478(module0012.$g82$.getDynamicValue(var3));
            SubLObject var13 = var8;
            SubLObject var14 = (SubLObject)NIL;
            var14 = var13.first();
            while (NIL != var13) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var3), module0012.$g83$.getDynamicValue(var3));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var3), (SubLObject)ONE_INTEGER), var3);
                if (NIL != module0269.f17725(var14)) {
                    SubLObject var16;
                    final SubLObject var15 = var16 = module0230.f15279(var14);
                    SubLObject var17 = (SubLObject)NIL;
                    var17 = var16.first();
                    while (NIL != var16) {
                        if (NIL == module0077.f5320(var17, var7) && NIL != f34543(var17)) {
                            module0077.f5326(var17, var7);
                        }
                        var16 = var16.rest();
                        var17 = var16.first();
                    }
                }
                var13 = var13.rest();
                var14 = var13.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var12, var3);
            module0012.$g77$.rebind(var11, var3);
            module0012.$g76$.rebind(var10, var3);
            module0012.$g75$.rebind(var9, var3);
        }
        var6 = module0213.f13926(module0077.f5312(var7), (SubLObject)NIL, (SubLObject)NIL, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var6;
    }
    
    public static SubLObject f34543(final SubLObject var21) {
        return f34544(module0172.f10920(var21));
    }
    
    public static SubLObject f34544(final SubLObject var22) {
        return (SubLObject)makeBoolean(var22.isCons() && NIL == module0035.f2439(Symbols.symbol_function((SubLObject)$ic11$), var22, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f34545() {
        if ($ic6$ == $g4078$.getGlobalValue()) {
            final SubLObject var12 = f34542();
            $g4078$.setGlobalValue(var12);
        }
        return $g4078$.getGlobalValue();
    }
    
    public static SubLObject f34546() {
        final SubLObject var9 = f34538();
        final SubLObject var10 = f34545();
        return Sequences.cconcatenate(var9, var10);
    }
    
    public static SubLObject f34547() {
        if ($ic6$ == $g4079$.getGlobalValue()) {
            final SubLObject var24 = f34546();
            $g4079$.setGlobalValue(var24);
        }
        return $g4079$.getGlobalValue();
    }
    
    public static SubLObject f34548() {
        final SubLObject var24 = f34547();
        $g4080$.setGlobalValue(module0076.f5288(var24, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        return module0031.f1670($g4080$.getGlobalValue());
    }
    
    public static SubLObject f34549(final SubLObject var25) {
        return module0031.f1688(var25, $g4080$.getGlobalValue());
    }
    
    public static SubLObject f34550(final SubLObject var25) {
        return (SubLObject)makeBoolean(NIL != module0173.f10955(var25) && NIL == f34549(var25));
    }
    
    public static SubLObject f34551(final SubLObject var26) {
        if (NIL == module0035.f2439(Symbols.symbol_function((SubLObject)$ic15$), var26, (SubLObject)UNPROVIDED) && NIL == module0035.f2439(Symbols.symbol_function((SubLObject)$ic16$), var26, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34552(final SubLObject var27) {
        if (NIL != assertion_handles_oc.f11035(var27)) {
            final SubLObject var28 = module0178.f11287(var27);
            final SubLObject var29 = module0178.f11282(var27);
            if (NIL == f34550(module0161.f10557(var28)) && NIL == module0035.f2439(Symbols.symbol_function((SubLObject)$ic15$), var29, (SubLObject)UNPROVIDED) && NIL == module0035.f2439(Symbols.symbol_function((SubLObject)$ic16$), var29, (SubLObject)UNPROVIDED)) {
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34553(final SubLObject var10) {
        return (SubLObject)makeBoolean(NIL != assertion_handles_oc.f11035(var10) && NIL == f34552(var10));
    }
    
    public static SubLObject f34554() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0077.f5313(Symbols.symbol_function((SubLObject)EQL), Sequences.length(f34547()));
        final SubLObject var5 = module0147.$g2094$.currentBinding(var3);
        final SubLObject var6 = module0147.$g2095$.currentBinding(var3);
        try {
            module0147.$g2094$.bind((SubLObject)$ic2$, var3);
            module0147.$g2095$.bind($ic3$, var3);
            final SubLObject var7 = f34547();
            module0012.$g82$.setDynamicValue((SubLObject)$ic17$, var3);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var3);
            module0012.$g83$.setDynamicValue(Sequences.length(var7), var3);
            module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var3);
            final SubLObject var5_31 = module0012.$g75$.currentBinding(var3);
            final SubLObject var6_32 = module0012.$g76$.currentBinding(var3);
            final SubLObject var8 = module0012.$g77$.currentBinding(var3);
            final SubLObject var9 = module0012.$g78$.currentBinding(var3);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var3);
                module0012.$g76$.bind((SubLObject)NIL, var3);
                module0012.$g77$.bind((SubLObject)T, var3);
                module0012.$g78$.bind(Time.get_universal_time(), var3);
                module0012.f478(module0012.$g82$.getDynamicValue(var3));
                SubLObject var10 = var7;
                SubLObject var11 = (SubLObject)NIL;
                var11 = var10.first();
                while (NIL != var10) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var3), module0012.$g83$.getDynamicValue(var3));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var3), (SubLObject)ONE_INTEGER), var3);
                    if (NIL != module0158.f10282(var11, (SubLObject)$ic18$)) {
                        final SubLObject var12 = module0158.f10283(var11, (SubLObject)$ic18$);
                        SubLObject var13 = (SubLObject)NIL;
                        final SubLObject var14 = (SubLObject)NIL;
                        while (NIL == var13) {
                            final SubLObject var15 = module0052.f3695(var12, var14);
                            final SubLObject var16 = (SubLObject)makeBoolean(!var14.eql(var15));
                            if (NIL != var16) {
                                SubLObject var17 = (SubLObject)NIL;
                                try {
                                    var17 = module0158.f10316(var15, (SubLObject)$ic18$, (SubLObject)$ic19$, (SubLObject)NIL);
                                    SubLObject var34_39 = (SubLObject)NIL;
                                    final SubLObject var35_40 = (SubLObject)NIL;
                                    while (NIL == var34_39) {
                                        final SubLObject var18 = module0052.f3695(var17, var35_40);
                                        final SubLObject var37_42 = (SubLObject)makeBoolean(!var35_40.eql(var18));
                                        if (NIL != var37_42 && NIL != module0158.f10284(var18, var15) && NIL == module0077.f5320(var18, var4) && NIL != f34552(var18)) {
                                            module0077.f5326(var18, var4);
                                        }
                                        var34_39 = (SubLObject)makeBoolean(NIL == var37_42);
                                    }
                                }
                                finally {
                                    final SubLObject var5_32 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                                        if (NIL != var17) {
                                            module0158.f10319(var17);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var5_32, var3);
                                    }
                                }
                            }
                            var13 = (SubLObject)makeBoolean(NIL == var16);
                        }
                    }
                    var10 = var10.rest();
                    var11 = var10.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var9, var3);
                module0012.$g77$.rebind(var8, var3);
                module0012.$g76$.rebind(var6_32, var3);
                module0012.$g75$.rebind(var5_31, var3);
            }
        }
        finally {
            module0147.$g2095$.rebind(var6, var3);
            module0147.$g2094$.rebind(var5, var3);
        }
        return module0077.f5312(var4);
    }
    
    public static SubLObject f34555() {
        if ($ic6$ == $g4081$.getGlobalValue()) {
            final SubLObject var44 = f34554();
            $g4081$.setGlobalValue(var44);
        }
        return $g4081$.getGlobalValue();
    }
    
    public static SubLObject f34556() {
        f34557();
        f34539();
        f34548();
        f34555();
        return Sequences.length(f34547());
    }
    
    public static SubLObject f34557() {
        $g4074$.setGlobalValue((SubLObject)$ic6$);
        $g4075$.setGlobalValue((SubLObject)$ic6$);
        $g4076$.setGlobalValue((SubLObject)$ic6$);
        $g4077$.setGlobalValue((SubLObject)NIL);
        $g4078$.setGlobalValue((SubLObject)$ic6$);
        $g4079$.setGlobalValue((SubLObject)$ic6$);
        $g4080$.setGlobalValue((SubLObject)NIL);
        $g4081$.setGlobalValue((SubLObject)$ic6$);
        f34558();
        f34559();
        f34560();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34561(SubLObject var45) {
        if (var45 == UNPROVIDED) {
            var45 = (SubLObject)NIL;
        }
        f34562();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34562() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        f34556();
        final SubLObject var4 = f34547();
        module0012.$g82$.setDynamicValue((SubLObject)$ic21$, var3);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var3);
        module0012.$g83$.setDynamicValue(Sequences.length(var4), var3);
        module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var3);
        final SubLObject var5 = module0012.$g75$.currentBinding(var3);
        final SubLObject var6 = module0012.$g76$.currentBinding(var3);
        final SubLObject var7 = module0012.$g77$.currentBinding(var3);
        final SubLObject var8 = module0012.$g78$.currentBinding(var3);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var3);
            module0012.$g76$.bind((SubLObject)NIL, var3);
            module0012.$g77$.bind((SubLObject)T, var3);
            module0012.$g78$.bind(Time.get_universal_time(), var3);
            module0012.f478(module0012.$g82$.getDynamicValue(var3));
            SubLObject var9 = var4;
            SubLObject var10 = (SubLObject)NIL;
            var10 = var9.first();
            while (NIL != var9) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var3), module0012.$g83$.getDynamicValue(var3));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var3), (SubLObject)ONE_INTEGER), var3);
                f34563(var10);
                f34564(var10);
                var9 = var9.rest();
                var10 = var9.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var8, var3);
            module0012.$g77$.rebind(var7, var3);
            module0012.$g76$.rebind(var6, var3);
            module0012.$g75$.rebind(var5, var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34560() {
        final SubLObject var46 = $g4084$.getGlobalValue();
        if (NIL != var46) {
            module0034.f1818(var46);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34565(final SubLObject var25) {
        return module0034.f1829($g4084$.getGlobalValue(), (SubLObject)ConsesLow.list(var25), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f34566(final SubLObject var25) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        SubLObject var27 = (SubLObject)NIL;
        SubLObject var28 = $g4082$.getDynamicValue(var26);
        SubLObject var29 = (SubLObject)NIL;
        var29 = var28.first();
        while (NIL != var28) {
            SubLObject var31;
            final SubLObject var30 = var31 = var29;
            SubLObject var32 = (SubLObject)NIL;
            SubLObject var33 = (SubLObject)NIL;
            SubLObject var34 = (SubLObject)NIL;
            SubLObject var35 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var31, var30, (SubLObject)$ic24$);
            var32 = var31.first();
            var31 = var31.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var31, var30, (SubLObject)$ic24$);
            var33 = var31.first();
            var31 = var31.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var31, var30, (SubLObject)$ic24$);
            var34 = var31.first();
            var31 = var31.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var31, var30, (SubLObject)$ic24$);
            var35 = var31.first();
            var31 = var31.rest();
            if (NIL == var31) {
                if (module0217.f14221(var25, (SubLObject)ONE_INTEGER, var32, (SubLObject)UNPROVIDED).numG((SubLObject)ZERO_INTEGER)) {
                    SubLObject var36 = module0220.f14565(var25, var32, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)$ic19$);
                    SubLObject var37 = module0220.f14565(var25, var32, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)$ic25$);
                    if (NIL != var33 && NIL != var34) {
                        var36 = f34567(var25, var36, var33, var34, var35);
                        if (var32.eql($ic26$)) {
                            var36 = Sequences.delete($ic27$, var36, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        if (var32.eql($ic28$)) {
                            var36 = Sequences.delete($ic27$, var36, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                    }
                    var37 = module0035.delete_if_not(Symbols.symbol_function((SubLObject)$ic29$), var37, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    var27 = (SubLObject)ConsesLow.cons(reader.bq_cons(var32, ConsesLow.append((SubLObject)((NIL != var36) ? ConsesLow.list(reader.bq_cons((SubLObject)$ic19$, ConsesLow.append(var36, (SubLObject)NIL))) : NIL), (SubLObject)((NIL != var37) ? ConsesLow.list(reader.bq_cons((SubLObject)$ic25$, ConsesLow.append(var37, (SubLObject)NIL))) : NIL), (SubLObject)NIL)), var27);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var30, (SubLObject)$ic24$);
            }
            var28 = var28.rest();
            var29 = var28.first();
        }
        var28 = $g4083$.getDynamicValue(var26);
        var29 = (SubLObject)NIL;
        var29 = var28.first();
        while (NIL != var28) {
            SubLObject var39;
            final SubLObject var38 = var39 = var29;
            SubLObject var32 = (SubLObject)NIL;
            SubLObject var33 = (SubLObject)NIL;
            SubLObject var34 = (SubLObject)NIL;
            SubLObject var35 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var39, var38, (SubLObject)$ic24$);
            var32 = var39.first();
            var39 = var39.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var39, var38, (SubLObject)$ic24$);
            var33 = var39.first();
            var39 = var39.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var39, var38, (SubLObject)$ic24$);
            var34 = var39.first();
            var39 = var39.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var39, var38, (SubLObject)$ic24$);
            var35 = var39.first();
            var39 = var39.rest();
            if (NIL == var39) {
                if (module0217.f14221(var25, (SubLObject)TWO_INTEGER, var32, (SubLObject)UNPROVIDED).numG((SubLObject)ZERO_INTEGER)) {
                    SubLObject var36 = module0220.f14565(var25, var32, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)$ic19$);
                    SubLObject var37 = module0220.f14565(var25, var32, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)$ic25$);
                    if (NIL != var33 && NIL != var34) {
                        var36 = f34567(var25, var36, var33, var34, var35);
                    }
                    var37 = module0035.delete_if_not(Symbols.symbol_function((SubLObject)$ic29$), var37, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    var27 = (SubLObject)ConsesLow.cons(reader.bq_cons(var32, ConsesLow.append((SubLObject)((NIL != var36) ? ConsesLow.list(reader.bq_cons((SubLObject)$ic19$, ConsesLow.append(var36, (SubLObject)NIL))) : NIL), (SubLObject)((NIL != var37) ? ConsesLow.list(reader.bq_cons((SubLObject)$ic25$, ConsesLow.append(var37, (SubLObject)NIL))) : NIL), (SubLObject)NIL)), var27);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var38, (SubLObject)$ic24$);
            }
            var28 = var28.rest();
            var29 = var28.first();
        }
        return Sequences.nreverse(var27);
    }
    
    public static SubLObject f34564(final SubLObject var25) {
        SubLObject var26 = $g4084$.getGlobalValue();
        if (NIL == var26) {
            var26 = module0034.f1934((SubLObject)$ic23$, (SubLObject)$ic30$, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)ONE_INTEGER, (SubLObject)$ic31$);
        }
        SubLObject var27 = module0034.f1814(var26, var25, (SubLObject)$ic32$);
        if (var27 == $ic32$) {
            var27 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f34566(var25)));
            module0034.f1816(var26, var25, var27, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var27);
    }
    
    public static SubLObject f34567(final SubLObject var25, final SubLObject var61, final SubLObject var52, final SubLObject var53, final SubLObject var54) {
        final SubLThread var62 = SubLProcess.currentSubLThread();
        if (NIL != module0035.f2370(Symbols.symbol_function((SubLObject)$ic29$), var61, (SubLObject)UNPROVIDED)) {
            return var61;
        }
        SubLObject var63 = (SubLObject)NIL;
        final SubLObject var64 = module0147.$g2094$.currentBinding(var62);
        final SubLObject var65 = module0147.$g2095$.currentBinding(var62);
        try {
            module0147.$g2094$.bind((SubLObject)$ic2$, var62);
            module0147.$g2095$.bind($ic3$, var62);
            SubLObject var66 = var61;
            SubLObject var67 = (SubLObject)NIL;
            var67 = var66.first();
            while (NIL != var66) {
                var63 = conses_high.nunion(var63, Functions.funcall(var52, var67), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var66 = var66.rest();
                var67 = var66.first();
            }
            var63 = module0035.delete_if_not(Symbols.symbol_function((SubLObject)$ic29$), var63, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var68 = (SubLObject)NIL;
            if (NIL != var54) {
                var63 = Sequences.delete(var25, var63, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var68 = f34568(var25, var63, var53);
                if (NIL != var68) {
                    Errors.warn((SubLObject)$ic33$, var53, var25, var68);
                    var63 = conses_high.nset_difference(var63, var68, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
            }
            var63 = module0035.f2462(var63, var53, (SubLObject)UNPROVIDED);
            if (NIL != var68) {
                var63 = conses_high.nunion(var68, var63, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                Errors.warn((SubLObject)$ic34$, var61, var63);
            }
        }
        finally {
            module0147.$g2095$.rebind(var65, var62);
            module0147.$g2094$.rebind(var64, var62);
        }
        return var63;
    }
    
    public static SubLObject f34568(final SubLObject var25, final SubLObject var62, final SubLObject var53) {
        assert NIL != module0173.f10955(var25) : var25;
        SubLObject var63 = (SubLObject)NIL;
        SubLObject var64 = var62;
        SubLObject var65 = (SubLObject)NIL;
        var65 = var64.first();
        while (NIL != var64) {
            if (NIL != Functions.funcall(var53, var65, var25)) {
                var63 = (SubLObject)ConsesLow.cons(var65, var63);
            }
            var64 = var64.rest();
            var65 = var64.first();
        }
        return var63;
    }
    
    public static SubLObject f34559() {
        final SubLObject var46 = $g4085$.getGlobalValue();
        if (NIL != var46) {
            module0034.f1818(var46);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34569(final SubLObject var25) {
        return module0034.f1829($g4085$.getGlobalValue(), (SubLObject)ConsesLow.list(var25), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f34570(final SubLObject var25) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        SubLObject var27 = (SubLObject)NIL;
        SubLObject var28 = $g4082$.getDynamicValue(var26);
        SubLObject var29 = (SubLObject)NIL;
        var29 = var28.first();
        while (NIL != var28) {
            SubLObject var31;
            final SubLObject var30 = var31 = var29;
            SubLObject var32 = (SubLObject)NIL;
            SubLObject var33 = (SubLObject)NIL;
            SubLObject var34 = (SubLObject)NIL;
            SubLObject var35 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var31, var30, (SubLObject)$ic24$);
            var32 = var31.first();
            var31 = var31.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var31, var30, (SubLObject)$ic24$);
            var33 = var31.first();
            var31 = var31.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var31, var30, (SubLObject)$ic24$);
            var34 = var31.first();
            var31 = var31.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var31, var30, (SubLObject)$ic24$);
            var35 = var31.first();
            var31 = var31.rest();
            if (NIL == var31) {
                if (module0217.f14221(var25, (SubLObject)ONE_INTEGER, var32, (SubLObject)UNPROVIDED).numG((SubLObject)ZERO_INTEGER)) {
                    final SubLObject var36 = module0220.f14560(var25, var32, $ic37$, (SubLObject)ONE_INTEGER, (SubLObject)$ic19$);
                    final SubLObject var37 = module0220.f14560(var25, var32, $ic37$, (SubLObject)ONE_INTEGER, (SubLObject)$ic25$);
                    SubLObject var38 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic38$), var36);
                    SubLObject var39 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic38$), var37);
                    SubLObject var40 = (SubLObject)NIL;
                    SubLObject var41 = (SubLObject)NIL;
                    if (NIL != var33 && NIL != var34) {
                        var38 = f34571(var25, var38, var33, var34, var35);
                        if (var32.eql($ic26$)) {
                            var38 = Sequences.delete($ic27$, var38, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        if (var32.eql($ic28$)) {
                            var38 = Sequences.delete($ic27$, var38, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                    }
                    var39 = module0035.delete_if_not(Symbols.symbol_function((SubLObject)$ic29$), var39, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    SubLObject var19_72 = var36;
                    SubLObject var42 = (SubLObject)NIL;
                    var42 = var19_72.first();
                    while (NIL != var19_72) {
                        final SubLObject var43 = module0178.f11335(var42);
                        if (NIL != module0004.f104(var43, var38, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                            var40 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var43, module0178.f11287(var42)), var40);
                        }
                        var19_72 = var19_72.rest();
                        var42 = var19_72.first();
                    }
                    SubLObject var19_73 = var37;
                    SubLObject var44 = (SubLObject)NIL;
                    var44 = var19_73.first();
                    while (NIL != var19_73) {
                        final SubLObject var43 = module0178.f11335(var44);
                        if (NIL != module0004.f104(var43, var39, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                            var41 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var43, module0178.f11287(var44)), var41);
                        }
                        var19_73 = var19_73.rest();
                        var44 = var19_73.first();
                    }
                    var27 = (SubLObject)ConsesLow.cons(reader.bq_cons(var32, ConsesLow.append((SubLObject)((NIL != var40) ? ConsesLow.list(reader.bq_cons((SubLObject)$ic19$, ConsesLow.append(var40, (SubLObject)NIL))) : NIL), (SubLObject)((NIL != var41) ? ConsesLow.list(reader.bq_cons((SubLObject)$ic25$, ConsesLow.append(var41, (SubLObject)NIL))) : NIL), (SubLObject)NIL)), var27);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var30, (SubLObject)$ic24$);
            }
            var28 = var28.rest();
            var29 = var28.first();
        }
        var28 = $g4083$.getDynamicValue(var26);
        var29 = (SubLObject)NIL;
        var29 = var28.first();
        while (NIL != var28) {
            SubLObject var46;
            final SubLObject var45 = var46 = var29;
            SubLObject var32 = (SubLObject)NIL;
            SubLObject var33 = (SubLObject)NIL;
            SubLObject var34 = (SubLObject)NIL;
            SubLObject var35 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var46, var45, (SubLObject)$ic24$);
            var32 = var46.first();
            var46 = var46.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var46, var45, (SubLObject)$ic24$);
            var33 = var46.first();
            var46 = var46.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var46, var45, (SubLObject)$ic24$);
            var34 = var46.first();
            var46 = var46.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var46, var45, (SubLObject)$ic24$);
            var35 = var46.first();
            var46 = var46.rest();
            if (NIL == var46) {
                if (module0217.f14221(var25, (SubLObject)TWO_INTEGER, var32, (SubLObject)UNPROVIDED).numG((SubLObject)ZERO_INTEGER)) {
                    final SubLObject var36 = module0220.f14560(var25, var32, $ic37$, (SubLObject)TWO_INTEGER, (SubLObject)$ic19$);
                    final SubLObject var37 = module0220.f14560(var25, var32, $ic37$, (SubLObject)TWO_INTEGER, (SubLObject)$ic25$);
                    SubLObject var38 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic39$), var36);
                    SubLObject var39 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic39$), var37);
                    SubLObject var40 = (SubLObject)NIL;
                    SubLObject var41 = (SubLObject)NIL;
                    if (NIL != var33 && NIL != var34) {
                        var38 = f34571(var25, var38, var33, var34, var35);
                    }
                    var39 = module0035.delete_if_not(Symbols.symbol_function((SubLObject)$ic29$), var39, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    SubLObject var19_74 = var36;
                    SubLObject var42 = (SubLObject)NIL;
                    var42 = var19_74.first();
                    while (NIL != var19_74) {
                        final SubLObject var43 = module0178.f11334(var42);
                        if (NIL != module0004.f104(var43, var38, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                            var40 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var43, module0178.f11287(var42)), var40);
                        }
                        var19_74 = var19_74.rest();
                        var42 = var19_74.first();
                    }
                    SubLObject var19_75 = var37;
                    SubLObject var44 = (SubLObject)NIL;
                    var44 = var19_75.first();
                    while (NIL != var19_75) {
                        final SubLObject var43 = module0178.f11334(var44);
                        if (NIL != module0004.f104(var43, var39, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                            var41 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var43, module0178.f11287(var44)), var41);
                        }
                        var19_75 = var19_75.rest();
                        var44 = var19_75.first();
                    }
                    var27 = (SubLObject)ConsesLow.cons(reader.bq_cons(var32, ConsesLow.append((SubLObject)((NIL != var40) ? ConsesLow.list(reader.bq_cons((SubLObject)$ic19$, ConsesLow.append(var40, (SubLObject)NIL))) : NIL), (SubLObject)((NIL != var41) ? ConsesLow.list(reader.bq_cons((SubLObject)$ic25$, ConsesLow.append(var41, (SubLObject)NIL))) : NIL), (SubLObject)NIL)), var27);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var45, (SubLObject)$ic24$);
            }
            var28 = var28.rest();
            var29 = var28.first();
        }
        return Sequences.nreverse(var27);
    }
    
    public static SubLObject f34563(final SubLObject var25) {
        SubLObject var26 = $g4085$.getGlobalValue();
        if (NIL == var26) {
            var26 = module0034.f1934((SubLObject)$ic36$, (SubLObject)$ic40$, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)ONE_INTEGER, (SubLObject)$ic31$);
        }
        SubLObject var27 = module0034.f1814(var26, var25, (SubLObject)$ic32$);
        if (var27 == $ic32$) {
            var27 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f34570(var25)));
            module0034.f1816(var26, var25, var27, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var27);
    }
    
    public static SubLObject f34571(final SubLObject var25, final SubLObject var61, final SubLObject var52, final SubLObject var53, final SubLObject var54) {
        final SubLThread var62 = SubLProcess.currentSubLThread();
        if (NIL != module0035.f2370(Symbols.symbol_function((SubLObject)$ic29$), var61, (SubLObject)UNPROVIDED)) {
            return var61;
        }
        SubLObject var63 = (SubLObject)NIL;
        final SubLObject var64 = module0147.$g2094$.currentBinding(var62);
        final SubLObject var65 = module0147.$g2095$.currentBinding(var62);
        try {
            module0147.$g2094$.bind((SubLObject)$ic41$, var62);
            module0147.$g2095$.bind($ic37$, var62);
            SubLObject var66 = var61;
            SubLObject var67 = (SubLObject)NIL;
            var67 = var66.first();
            while (NIL != var66) {
                var63 = conses_high.nunion(var63, Functions.funcall(var52, var67), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var66 = var66.rest();
                var67 = var66.first();
            }
            var63 = module0035.delete_if_not(Symbols.symbol_function((SubLObject)$ic29$), var63, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var68 = (SubLObject)NIL;
            if (NIL != var54) {
                var63 = Sequences.delete(var25, var63, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var68 = f34568(var25, var63, var53);
                if (NIL != var68) {
                    Errors.warn((SubLObject)$ic33$, var53, var25, var68);
                    var63 = conses_high.nset_difference(var63, var68, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
            }
            var63 = module0035.f2462(var63, var53, (SubLObject)UNPROVIDED);
            if (NIL != var68) {
                var63 = conses_high.nunion(var68, var63, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                Errors.warn((SubLObject)$ic34$, var61, var63);
            }
        }
        finally {
            module0147.$g2095$.rebind(var65, var62);
            module0147.$g2094$.rebind(var64, var62);
        }
        return var63;
    }
    
    public static SubLObject f34572(final SubLObject var80) {
        return module0545.f33748(var80, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f34573(final SubLObject var81) {
        f34574(var81, (SubLObject)T);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34574(final SubLObject var81, SubLObject var82) {
        if (var82 == UNPROVIDED) {
            var82 = (SubLObject)NIL;
        }
        final SubLThread var83 = SubLProcess.currentSubLThread();
        if (NIL != var82) {
            f34562();
        }
        SubLObject var84 = (SubLObject)NIL;
        try {
            var84 = compatibility.open_text(var81, (SubLObject)$ic42$);
            if (!var84.isStream()) {
                Errors.error((SubLObject)$ic43$, var81);
            }
            final SubLObject var85 = var84;
            PrintLow.format(var85, (SubLObject)$ic44$);
            PrintLow.format(var85, (SubLObject)$ic45$);
            PrintLow.format(var85, (SubLObject)$ic46$, module0107.f7573());
            PrintLow.format(var85, (SubLObject)$ic45$);
            PrintLow.format(var85, (SubLObject)$ic46$, var81);
            PrintLow.format(var85, (SubLObject)$ic46$, module0051.f3552((SubLObject)UNPROVIDED));
            PrintLow.format(var85, (SubLObject)$ic45$);
            PrintLow.format(var85, (SubLObject)$ic47$, new SubLObject[] { module0011.f351(), module0018.f971(), module0574.f35163() });
            PrintLow.format(var85, (SubLObject)$ic45$);
            PrintLow.format(var85, (SubLObject)$ic48$);
            PrintLow.format(var85, (SubLObject)$ic49$);
            PrintLow.format(var85, (SubLObject)$ic50$);
            PrintLow.format(var85, (SubLObject)$ic51$);
            PrintLow.format(var85, (SubLObject)$ic52$, Sequences.length(f34547()));
            PrintLow.format(var85, (SubLObject)$ic53$);
            SubLObject var86 = f34538();
            module0012.$g82$.setDynamicValue((SubLObject)$ic54$, var83);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var83);
            module0012.$g83$.setDynamicValue(Sequences.length(var86), var83);
            module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var83);
            SubLObject var87 = module0012.$g75$.currentBinding(var83);
            SubLObject var88 = module0012.$g76$.currentBinding(var83);
            SubLObject var89 = module0012.$g77$.currentBinding(var83);
            SubLObject var90 = module0012.$g78$.currentBinding(var83);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var83);
                module0012.$g76$.bind((SubLObject)NIL, var83);
                module0012.$g77$.bind((SubLObject)T, var83);
                module0012.$g78$.bind(Time.get_universal_time(), var83);
                module0012.f478(module0012.$g82$.getDynamicValue(var83));
                SubLObject var91 = var86;
                SubLObject var92 = (SubLObject)NIL;
                var92 = var91.first();
                while (NIL != var91) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var83), module0012.$g83$.getDynamicValue(var83));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var83), (SubLObject)ONE_INTEGER), var83);
                    f34575(var92, var85);
                    var91 = var91.rest();
                    var92 = var91.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var90, var83);
                module0012.$g77$.rebind(var89, var83);
                module0012.$g76$.rebind(var88, var83);
                module0012.$g75$.rebind(var87, var83);
            }
            PrintLow.format(var85, (SubLObject)$ic55$);
            PrintLow.format(var85, (SubLObject)$ic56$);
            var86 = f34545();
            module0012.$g82$.setDynamicValue((SubLObject)$ic57$, var83);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var83);
            module0012.$g83$.setDynamicValue(Sequences.length(var86), var83);
            module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var83);
            var87 = module0012.$g75$.currentBinding(var83);
            var88 = module0012.$g76$.currentBinding(var83);
            var89 = module0012.$g77$.currentBinding(var83);
            var90 = module0012.$g78$.currentBinding(var83);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var83);
                module0012.$g76$.bind((SubLObject)NIL, var83);
                module0012.$g77$.bind((SubLObject)T, var83);
                module0012.$g78$.bind(Time.get_universal_time(), var83);
                module0012.f478(module0012.$g82$.getDynamicValue(var83));
                SubLObject var91 = var86;
                SubLObject var92 = (SubLObject)NIL;
                var92 = var91.first();
                while (NIL != var91) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var83), module0012.$g83$.getDynamicValue(var83));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var83), (SubLObject)ONE_INTEGER), var83);
                    f34576(var92, var85);
                    var91 = var91.rest();
                    var92 = var91.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var90, var83);
                module0012.$g77$.rebind(var89, var83);
                module0012.$g76$.rebind(var88, var83);
                module0012.$g75$.rebind(var87, var83);
            }
            PrintLow.format(var85, (SubLObject)$ic58$);
            var86 = f34547();
            module0012.$g82$.setDynamicValue((SubLObject)$ic59$, var83);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var83);
            module0012.$g83$.setDynamicValue(Sequences.length(var86), var83);
            module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var83);
            var87 = module0012.$g75$.currentBinding(var83);
            var88 = module0012.$g76$.currentBinding(var83);
            var89 = module0012.$g77$.currentBinding(var83);
            var90 = module0012.$g78$.currentBinding(var83);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var83);
                module0012.$g76$.bind((SubLObject)NIL, var83);
                module0012.$g77$.bind((SubLObject)T, var83);
                module0012.$g78$.bind(Time.get_universal_time(), var83);
                module0012.f478(module0012.$g82$.getDynamicValue(var83));
                SubLObject var91 = var86;
                SubLObject var92 = (SubLObject)NIL;
                var92 = var91.first();
                while (NIL != var91) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var83), module0012.$g83$.getDynamicValue(var83));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var83), (SubLObject)ONE_INTEGER), var83);
                    f34577(var92, var85);
                    var91 = var91.rest();
                    var92 = var91.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var90, var83);
                module0012.$g77$.rebind(var89, var83);
                module0012.$g76$.rebind(var88, var83);
                module0012.$g75$.rebind(var87, var83);
            }
            PrintLow.format(var85, (SubLObject)$ic60$);
            var86 = f34547();
            module0012.$g82$.setDynamicValue((SubLObject)$ic61$, var83);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var83);
            module0012.$g83$.setDynamicValue(Sequences.length(var86), var83);
            module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var83);
            var87 = module0012.$g75$.currentBinding(var83);
            var88 = module0012.$g76$.currentBinding(var83);
            var89 = module0012.$g77$.currentBinding(var83);
            var90 = module0012.$g78$.currentBinding(var83);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var83);
                module0012.$g76$.bind((SubLObject)NIL, var83);
                module0012.$g77$.bind((SubLObject)T, var83);
                module0012.$g78$.bind(Time.get_universal_time(), var83);
                module0012.f478(module0012.$g82$.getDynamicValue(var83));
                SubLObject var91 = var86;
                SubLObject var92 = (SubLObject)NIL;
                var92 = var91.first();
                while (NIL != var91) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var83), module0012.$g83$.getDynamicValue(var83));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var83), (SubLObject)ONE_INTEGER), var83);
                    f34578(var92, var85);
                    var91 = var91.rest();
                    var92 = var91.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var90, var83);
                module0012.$g77$.rebind(var89, var83);
                module0012.$g76$.rebind(var88, var83);
                module0012.$g75$.rebind(var87, var83);
            }
            PrintLow.format(var85, (SubLObject)$ic62$);
            var86 = f34547();
            module0012.$g82$.setDynamicValue((SubLObject)$ic63$, var83);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var83);
            module0012.$g83$.setDynamicValue(Sequences.length(var86), var83);
            module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var83);
            var87 = module0012.$g75$.currentBinding(var83);
            var88 = module0012.$g76$.currentBinding(var83);
            var89 = module0012.$g77$.currentBinding(var83);
            var90 = module0012.$g78$.currentBinding(var83);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var83);
                module0012.$g76$.bind((SubLObject)NIL, var83);
                module0012.$g77$.bind((SubLObject)T, var83);
                module0012.$g78$.bind(Time.get_universal_time(), var83);
                module0012.f478(module0012.$g82$.getDynamicValue(var83));
                SubLObject var91 = var86;
                SubLObject var92 = (SubLObject)NIL;
                var92 = var91.first();
                while (NIL != var91) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var83), module0012.$g83$.getDynamicValue(var83));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var83), (SubLObject)ONE_INTEGER), var83);
                    f34579(var92, var85);
                    var91 = var91.rest();
                    var92 = var91.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var90, var83);
                module0012.$g77$.rebind(var89, var83);
                module0012.$g76$.rebind(var88, var83);
                module0012.$g75$.rebind(var87, var83);
            }
            PrintLow.format(var85, (SubLObject)$ic64$);
            PrintLow.format(var85, (SubLObject)$ic65$);
            var86 = f34547();
            module0012.$g82$.setDynamicValue((SubLObject)$ic66$, var83);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var83);
            module0012.$g83$.setDynamicValue(Sequences.length(var86), var83);
            module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var83);
            var87 = module0012.$g75$.currentBinding(var83);
            var88 = module0012.$g76$.currentBinding(var83);
            var89 = module0012.$g77$.currentBinding(var83);
            var90 = module0012.$g78$.currentBinding(var83);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var83);
                module0012.$g76$.bind((SubLObject)NIL, var83);
                module0012.$g77$.bind((SubLObject)T, var83);
                module0012.$g78$.bind(Time.get_universal_time(), var83);
                module0012.f478(module0012.$g82$.getDynamicValue(var83));
                SubLObject var91 = var86;
                SubLObject var92 = (SubLObject)NIL;
                var92 = var91.first();
                while (NIL != var91) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var83), module0012.$g83$.getDynamicValue(var83));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var83), (SubLObject)ONE_INTEGER), var83);
                    f34580(var92, var85);
                    var91 = var91.rest();
                    var92 = var91.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var90, var83);
                module0012.$g77$.rebind(var89, var83);
                module0012.$g76$.rebind(var88, var83);
                module0012.$g75$.rebind(var87, var83);
            }
            PrintLow.format(var85, (SubLObject)$ic67$);
            PrintLow.format(var85, (SubLObject)$ic68$);
            PrintLow.format(var85, (SubLObject)$ic69$);
            var86 = f34547();
            module0012.$g82$.setDynamicValue((SubLObject)$ic70$, var83);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var83);
            module0012.$g83$.setDynamicValue(Sequences.length(var86), var83);
            module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var83);
            var87 = module0012.$g75$.currentBinding(var83);
            var88 = module0012.$g76$.currentBinding(var83);
            var89 = module0012.$g77$.currentBinding(var83);
            var90 = module0012.$g78$.currentBinding(var83);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var83);
                module0012.$g76$.bind((SubLObject)NIL, var83);
                module0012.$g77$.bind((SubLObject)T, var83);
                module0012.$g78$.bind(Time.get_universal_time(), var83);
                module0012.f478(module0012.$g82$.getDynamicValue(var83));
                SubLObject var91 = var86;
                SubLObject var92 = (SubLObject)NIL;
                var92 = var91.first();
                while (NIL != var91) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var83), module0012.$g83$.getDynamicValue(var83));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var83), (SubLObject)ONE_INTEGER), var83);
                    f34581(var92, var85);
                    var91 = var91.rest();
                    var92 = var91.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var90, var83);
                module0012.$g77$.rebind(var89, var83);
                module0012.$g76$.rebind(var88, var83);
                module0012.$g75$.rebind(var87, var83);
            }
            PrintLow.format(var85, (SubLObject)$ic71$);
            PrintLow.format(var85, (SubLObject)$ic72$);
            var86 = f34555();
            module0012.$g82$.setDynamicValue((SubLObject)$ic73$, var83);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var83);
            module0012.$g83$.setDynamicValue(Sequences.length(var86), var83);
            module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var83);
            var87 = module0012.$g75$.currentBinding(var83);
            var88 = module0012.$g76$.currentBinding(var83);
            var89 = module0012.$g77$.currentBinding(var83);
            var90 = module0012.$g78$.currentBinding(var83);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var83);
                module0012.$g76$.bind((SubLObject)NIL, var83);
                module0012.$g77$.bind((SubLObject)T, var83);
                module0012.$g78$.bind(Time.get_universal_time(), var83);
                module0012.f478(module0012.$g82$.getDynamicValue(var83));
                SubLObject var91 = var86;
                SubLObject var93 = (SubLObject)NIL;
                var93 = var91.first();
                while (NIL != var91) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var83), module0012.$g83$.getDynamicValue(var83));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var83), (SubLObject)ONE_INTEGER), var83);
                    if (NIL != module0211.f13700(var93)) {
                        f34582(var93, var85);
                    }
                    var91 = var91.rest();
                    var93 = var91.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var90, var83);
                module0012.$g77$.rebind(var89, var83);
                module0012.$g76$.rebind(var88, var83);
                module0012.$g75$.rebind(var87, var83);
            }
            var86 = f34555();
            module0012.$g82$.setDynamicValue((SubLObject)$ic74$, var83);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var83);
            module0012.$g83$.setDynamicValue(Sequences.length(var86), var83);
            module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var83);
            var87 = module0012.$g75$.currentBinding(var83);
            var88 = module0012.$g76$.currentBinding(var83);
            var89 = module0012.$g77$.currentBinding(var83);
            var90 = module0012.$g78$.currentBinding(var83);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var83);
                module0012.$g76$.bind((SubLObject)NIL, var83);
                module0012.$g77$.bind((SubLObject)T, var83);
                module0012.$g78$.bind(Time.get_universal_time(), var83);
                module0012.f478(module0012.$g82$.getDynamicValue(var83));
                SubLObject var91 = var86;
                SubLObject var93 = (SubLObject)NIL;
                var93 = var91.first();
                while (NIL != var91) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var83), module0012.$g83$.getDynamicValue(var83));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var83), (SubLObject)ONE_INTEGER), var83);
                    if (NIL == module0211.f13700(var93)) {
                        f34582(var93, var85);
                    }
                    var91 = var91.rest();
                    var93 = var91.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var90, var83);
                module0012.$g77$.rebind(var89, var83);
                module0012.$g76$.rebind(var88, var83);
                module0012.$g75$.rebind(var87, var83);
            }
            PrintLow.format(var85, (SubLObject)$ic75$);
            var86 = f34555();
            module0012.$g82$.setDynamicValue((SubLObject)$ic76$, var83);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var83);
            module0012.$g83$.setDynamicValue(Sequences.length(var86), var83);
            module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var83);
            var87 = module0012.$g75$.currentBinding(var83);
            var88 = module0012.$g76$.currentBinding(var83);
            var89 = module0012.$g77$.currentBinding(var83);
            var90 = module0012.$g78$.currentBinding(var83);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var83);
                module0012.$g76$.bind((SubLObject)NIL, var83);
                module0012.$g77$.bind((SubLObject)T, var83);
                module0012.$g78$.bind(Time.get_universal_time(), var83);
                module0012.f478(module0012.$g82$.getDynamicValue(var83));
                SubLObject var91 = var86;
                SubLObject var93 = (SubLObject)NIL;
                var93 = var91.first();
                while (NIL != var91) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var83), module0012.$g83$.getDynamicValue(var83));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var83), (SubLObject)ONE_INTEGER), var83);
                    if (NIL != module0211.f13700(var93)) {
                        f34583(var93, var85);
                    }
                    var91 = var91.rest();
                    var93 = var91.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var90, var83);
                module0012.$g77$.rebind(var89, var83);
                module0012.$g76$.rebind(var88, var83);
                module0012.$g75$.rebind(var87, var83);
            }
            var86 = f34555();
            module0012.$g82$.setDynamicValue((SubLObject)$ic77$, var83);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var83);
            module0012.$g83$.setDynamicValue(Sequences.length(var86), var83);
            module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var83);
            var87 = module0012.$g75$.currentBinding(var83);
            var88 = module0012.$g76$.currentBinding(var83);
            var89 = module0012.$g77$.currentBinding(var83);
            var90 = module0012.$g78$.currentBinding(var83);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var83);
                module0012.$g76$.bind((SubLObject)NIL, var83);
                module0012.$g77$.bind((SubLObject)T, var83);
                module0012.$g78$.bind(Time.get_universal_time(), var83);
                module0012.f478(module0012.$g82$.getDynamicValue(var83));
                SubLObject var91 = var86;
                SubLObject var93 = (SubLObject)NIL;
                var93 = var91.first();
                while (NIL != var91) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var83), module0012.$g83$.getDynamicValue(var83));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var83), (SubLObject)ONE_INTEGER), var83);
                    if (NIL == module0211.f13700(var93)) {
                        f34583(var93, var85);
                    }
                    var91 = var91.rest();
                    var93 = var91.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var90, var83);
                module0012.$g77$.rebind(var89, var83);
                module0012.$g76$.rebind(var88, var83);
                module0012.$g75$.rebind(var87, var83);
            }
            PrintLow.format(var85, (SubLObject)$ic78$);
            var86 = f34555();
            module0012.$g82$.setDynamicValue((SubLObject)$ic79$, var83);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var83);
            module0012.$g83$.setDynamicValue(Sequences.length(var86), var83);
            module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var83);
            var87 = module0012.$g75$.currentBinding(var83);
            var88 = module0012.$g76$.currentBinding(var83);
            var89 = module0012.$g77$.currentBinding(var83);
            var90 = module0012.$g78$.currentBinding(var83);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var83);
                module0012.$g76$.bind((SubLObject)NIL, var83);
                module0012.$g77$.bind((SubLObject)T, var83);
                module0012.$g78$.bind(Time.get_universal_time(), var83);
                module0012.f478(module0012.$g82$.getDynamicValue(var83));
                SubLObject var91 = var86;
                SubLObject var93 = (SubLObject)NIL;
                var93 = var91.first();
                while (NIL != var91) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var83), module0012.$g83$.getDynamicValue(var83));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var83), (SubLObject)ONE_INTEGER), var83);
                    if (NIL != module0211.f13700(var93)) {
                        f34584(var93, var85);
                    }
                    var91 = var91.rest();
                    var93 = var91.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var90, var83);
                module0012.$g77$.rebind(var89, var83);
                module0012.$g76$.rebind(var88, var83);
                module0012.$g75$.rebind(var87, var83);
            }
            PrintLow.format(var85, (SubLObject)$ic80$);
            f34585(var85);
            PrintLow.format(var85, (SubLObject)$ic81$);
            PrintLow.format(var85, (SubLObject)$ic82$);
        }
        finally {
            final SubLObject var94 = Threads.$is_thread_performing_cleanupP$.currentBinding(var83);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var83);
                if (var84.isStream()) {
                    streams_high.close(var84, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var94, var83);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34586(final SubLObject var85) {
        final SubLThread var86 = SubLProcess.currentSubLThread();
        f34587();
        SubLObject var87 = (SubLObject)NIL;
        final SubLObject var88 = module0343.$g2954$.currentBinding(var86);
        try {
            module0343.$g2954$.bind((SubLObject)T, var86);
            var87 = module0285.f18994(var85);
        }
        finally {
            module0343.$g2954$.rebind(var88, var86);
        }
        return var87;
    }
    
    public static SubLObject f34588(final SubLObject var26, final SubLObject var28, SubLObject var86, SubLObject var87) {
        if (var86 == UNPROVIDED) {
            var86 = (SubLObject)$ic83$;
        }
        if (var87 == UNPROVIDED) {
            var87 = (SubLObject)$ic84$;
        }
        return f34589(var26, var28, var86, var87);
    }
    
    public static SubLObject f34587() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL == module0018.$g574$.getDynamicValue(var3)) {
            Errors.error((SubLObject)$ic85$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34589(final SubLObject var88, final SubLObject var28, SubLObject var86, SubLObject var87) {
        if (var86 == UNPROVIDED) {
            var86 = (SubLObject)$ic83$;
        }
        if (var87 == UNPROVIDED) {
            var87 = (SubLObject)$ic84$;
        }
        f34587();
        final SubLObject var89 = module0202.f12826(var88);
        final SubLObject var90 = (NIL != module0205.f13337(var88)) ? module0232.f15326((SubLObject)ConsesLow.list(var89), (SubLObject)NIL) : module0232.f15326((SubLObject)NIL, (SubLObject)ConsesLow.list(var89));
        return f34590(var90, var28, var86, var87, (SubLObject)NIL);
    }
    
    public static SubLObject f34591(SubLObject var29, final SubLObject var28, SubLObject var86, SubLObject var87) {
        if (var86 == UNPROVIDED) {
            var86 = (SubLObject)$ic83$;
        }
        if (var87 == UNPROVIDED) {
            var87 = (SubLObject)$ic86$;
        }
        f34587();
        var29 = conses_high.copy_tree(var29);
        SubLObject var88 = (SubLObject)NIL;
        final SubLObject var89 = module0035.f2399(var29, (SubLObject)$ic87$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var90 = (SubLObject)NIL;
        SubLObject var91 = (SubLObject)NIL;
        SubLObject var92 = (SubLObject)NIL;
        var90 = var89;
        var91 = var90.first();
        for (var92 = (SubLObject)ZERO_INTEGER; NIL != var90; var90 = var90.rest(), var91 = var90.first(), var92 = Numbers.add((SubLObject)ONE_INTEGER, var92)) {
            final SubLObject var93 = module0193.f12079(var92);
            var88 = (SubLObject)ConsesLow.cons(module0233.f15340(var91, var93), var88);
        }
        var88 = Sequences.nreverse(var88);
        var29 = conses_high.sublis(var88, var29, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return f34590(var29, var28, var86, var87, var88);
    }
    
    public static SubLObject f34590(final SubLObject var29, final SubLObject var28, final SubLObject var86, final SubLObject var87, SubLObject var90) {
        if (var90 == UNPROVIDED) {
            var90 = (SubLObject)NIL;
        }
        return module0195.f12224(var29, var28, var86, var87, var90);
    }
    
    public static SubLObject f34592(final SubLObject var96) {
        $g4086$.setGlobalValue(Time.get_universal_time());
        PrintLow.format((SubLObject)T, (SubLObject)$ic88$, module0051.f3552($g4086$.getGlobalValue()));
        module0213.f13889(var96);
        module0549.f33890(var96);
        module0248.f15987();
        module0213.f13887();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34593() {
        Errors.$continue_cerrorP$.setDynamicValue((SubLObject)T);
        module0271.f17871();
        module0146.$g2057$.setDynamicValue((SubLObject)NIL);
        module0018.$g574$.setDynamicValue((SubLObject)T);
        module0136.$g1596$.setDynamicValue((SubLObject)T);
        module0137.f8930();
        module0222.f14648();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34594() {
        module0343.f23197();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34595() {
        module0136.$g1596$.setDynamicValue((SubLObject)NIL);
        module0268.f17651();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34596() {
        module0018.$g574$.setDynamicValue((SubLObject)NIL);
        module0107.f7576((SubLObject)UNPROVIDED);
        dumper_oc.f37979();
        module0268.f17651();
        module0222.f14642();
        module0225.f14786();
        module0549.f33889();
        module0223.f14690();
        module0152.$g2105$.setDynamicValue((SubLObject)$ic89$);
        module0528.f32921();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34597() {
        module0271.f17872();
        module0152.$g2105$.setDynamicValue((SubLObject)$ic90$);
        module0146.$g2057$.setDynamicValue((SubLObject)T);
        dumper_oc.f37978();
        dumper_oc.f37951();
        module0213.f13887();
        dumper_oc.f37984();
        module0018.f969((SubLObject)ONE_INTEGER);
        if (NIL != $g4086$.getGlobalValue()) {
            final SubLObject var97 = Time.get_universal_time();
            final SubLObject var98 = Numbers.subtract(var97, $g4086$.getGlobalValue());
            PrintLow.format((SubLObject)T, (SubLObject)$ic91$, module0051.f3664(var98), module0051.f3552(var97));
        }
        module0213.f13862((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34575(final SubLObject var1, final SubLObject var99) {
        assert NIL != constant_handles_oc.f8449(var1) : var1;
        final SubLObject var100 = constants_high_oc.f10743(var1);
        final SubLObject var101 = constants_high_oc.f10757(var1);
        PrintLow.format(var99, (SubLObject)$ic92$, var100, var101);
        return var1;
    }
    
    public static SubLObject f34576(final SubLObject var21, final SubLObject var99) {
        assert NIL != module0167.f10813(var21) : var21;
        streams_high.terpri(var99);
        f34598(var21, var99, (SubLObject)ZERO_INTEGER);
        return var21;
    }
    
    public static SubLObject f34598(final SubLObject var10, final SubLObject var99, final SubLObject var102) {
        if (NIL != module0167.f10813(var10)) {
            final SubLObject var103 = module0172.f10915(var10);
            if (!var102.numE((SubLObject)ZERO_INTEGER)) {
                print_high.princ((SubLObject)$ic94$, var99);
            }
            print_high.princ((SubLObject)$ic95$, var99);
            SubLObject var104 = var103;
            SubLObject var105 = (SubLObject)NIL;
            var105 = var104.first();
            while (NIL != var104) {
                if (!var105.eql(var103.first())) {
                    print_high.princ((SubLObject)$ic96$, var99);
                }
                f34598(var105, var99, Numbers.add(var102, (SubLObject)ONE_INTEGER));
                var104 = var104.rest();
                var105 = var104.first();
            }
            print_high.princ((SubLObject)$ic97$, var99);
        }
        else {
            print_high.prin1(var10, var99);
        }
        return var10;
    }
    
    public static SubLObject f34578(final SubLObject var25, SubLObject var99) {
        if (var99 == UNPROVIDED) {
            var99 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread var100 = SubLProcess.currentSubLThread();
        PrintLow.format(var99, (SubLObject)$ic98$, module0173.f10958(var25));
        SubLObject var102;
        final SubLObject var101 = var102 = f34563(var25);
        SubLObject var103 = (SubLObject)NIL;
        var103 = var102.first();
        while (NIL != var102) {
            SubLObject var105;
            final SubLObject var104 = var105 = var103;
            SubLObject var106 = (SubLObject)NIL;
            SubLObject var107 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var105, var104, (SubLObject)$ic99$);
            var106 = var105.first();
            var105 = (var107 = var105.rest());
            final SubLObject var108 = conses_high.member(var106, $g4083$.getDynamicValue(var100), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic100$));
            SubLObject var19_110 = var107;
            SubLObject var109 = (SubLObject)NIL;
            var109 = var19_110.first();
            while (NIL != var19_110) {
                SubLObject var114_115;
                final SubLObject var112_113 = var114_115 = var109;
                SubLObject var110 = (SubLObject)NIL;
                SubLObject var111 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var114_115, var112_113, (SubLObject)$ic101$);
                var110 = var114_115.first();
                var114_115 = var114_115.rest();
                SubLObject var19_111;
                var111 = (var19_111 = var114_115);
                SubLObject var112 = (SubLObject)NIL;
                var112 = var19_111.first();
                while (NIL != var19_111) {
                    SubLObject var122_123;
                    final SubLObject var120_121 = var122_123 = var112;
                    SubLObject var113 = (SubLObject)NIL;
                    SubLObject var114 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var122_123, var120_121, (SubLObject)$ic102$);
                    var113 = var122_123.first();
                    var122_123 = var122_123.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var122_123, var120_121, (SubLObject)$ic102$);
                    var114 = var122_123.first();
                    var122_123 = var122_123.rest();
                    if (NIL == var122_123) {
                        SubLObject var115 = (SubLObject)NIL;
                        if (NIL != var108) {
                            var115 = (SubLObject)ConsesLow.list(var106, var113, var25);
                        }
                        else {
                            var115 = (SubLObject)ConsesLow.list(var106, var25, var113);
                        }
                        if (var110 != $ic19$) {
                            var115 = module0205.f13338(var115);
                        }
                        f34599(var115, var114, var99, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var120_121, (SubLObject)$ic102$);
                    }
                    var19_111 = var19_111.rest();
                    var112 = var19_111.first();
                }
                var19_110 = var19_110.rest();
                var109 = var19_110.first();
            }
            var102 = var102.rest();
            var103 = var102.first();
        }
        return var25;
    }
    
    public static SubLObject f34580(final SubLObject var25, SubLObject var99) {
        if (var99 == UNPROVIDED) {
            var99 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread var100 = SubLProcess.currentSubLThread();
        PrintLow.format(var99, (SubLObject)$ic98$, module0173.f10958(var25));
        SubLObject var102;
        final SubLObject var101 = var102 = f34564(var25);
        SubLObject var103 = (SubLObject)NIL;
        var103 = var102.first();
        while (NIL != var102) {
            SubLObject var105;
            final SubLObject var104 = var105 = var103;
            SubLObject var106 = (SubLObject)NIL;
            SubLObject var107 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var105, var104, (SubLObject)$ic99$);
            var106 = var105.first();
            var105 = (var107 = var105.rest());
            final SubLObject var108 = conses_high.member(var106, $g4083$.getDynamicValue(var100), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic100$));
            SubLObject var19_126 = var107;
            SubLObject var109 = (SubLObject)NIL;
            var109 = var19_126.first();
            while (NIL != var19_126) {
                SubLObject var129_130;
                final SubLObject var127_128 = var129_130 = var109;
                SubLObject var110 = (SubLObject)NIL;
                SubLObject var111 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var129_130, var127_128, (SubLObject)$ic101$);
                var110 = var129_130.first();
                var129_130 = var129_130.rest();
                SubLObject var19_127;
                var111 = (var19_127 = var129_130);
                SubLObject var112 = (SubLObject)NIL;
                var112 = var19_127.first();
                while (NIL != var19_127) {
                    SubLObject var113 = (SubLObject)NIL;
                    if (NIL != var108) {
                        var113 = (SubLObject)ConsesLow.list(var106, var112, var25);
                    }
                    else {
                        var113 = (SubLObject)ConsesLow.list(var106, var25, var112);
                    }
                    if (var110 != $ic19$) {
                        var113 = module0205.f13338(var113);
                    }
                    f34599(var113, $ic103$, var99, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    var19_127 = var19_127.rest();
                    var112 = var19_127.first();
                }
                var19_126 = var19_126.rest();
                var109 = var19_126.first();
            }
            var102 = var102.rest();
            var103 = var102.first();
        }
        return var25;
    }
    
    public static SubLObject f34599(final SubLObject var2, final SubLObject var28, final SubLObject var99, SubLObject var86, SubLObject var87) {
        if (var86 == UNPROVIDED) {
            var86 = (SubLObject)$ic83$;
        }
        if (var87 == UNPROVIDED) {
            var87 = (SubLObject)$ic84$;
        }
        PrintLow.format(var99, (SubLObject)$ic104$);
        f34600(var2, var99);
        print_high.princ((SubLObject)$ic105$, var99);
        f34601(var28, var99, (SubLObject)UNPROVIDED);
        if (var86 != $ic83$ || var87 != $ic84$) {
            print_high.princ((SubLObject)$ic96$, var99);
            print_high.prin1(var86, var99);
        }
        if (var87 != $ic84$) {
            print_high.princ((SubLObject)$ic96$, var99);
            print_high.prin1(var87, var99);
        }
        print_high.princ((SubLObject)$ic106$, var99);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34600(final SubLObject var2, final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        final SubLObject var101 = module0194.$g2267$.currentBinding(var100);
        final SubLObject var102 = module0194.$g2268$.currentBinding(var100);
        final SubLObject var103 = module0194.$g2269$.currentBinding(var100);
        try {
            module0194.$g2267$.bind(Symbols.symbol_function((SubLObject)$ic107$), var100);
            module0194.$g2268$.bind(Symbols.symbol_function((SubLObject)$ic108$), var100);
            module0194.$g2269$.bind(Symbols.symbol_function((SubLObject)$ic109$), var100);
            module0194.f12114(var2, var99, (SubLObject)NIL);
        }
        finally {
            module0194.$g2269$.rebind(var103, var100);
            module0194.$g2268$.rebind(var102, var100);
            module0194.$g2267$.rebind(var101, var100);
        }
        return var2;
    }
    
    public static SubLObject f34602(final SubLObject var1, final SubLObject var99, SubLObject var102) {
        if (var102 == UNPROVIDED) {
            var102 = (SubLObject)NIL;
        }
        assert NIL != constant_handles_oc.f8449(var1) : var1;
        PrintLow.format(var99, (SubLObject)$ic110$, var1);
        return var1;
    }
    
    public static SubLObject f34603(final SubLObject var21, final SubLObject var99, SubLObject var102) {
        if (var102 == UNPROVIDED) {
            var102 = (SubLObject)NIL;
        }
        assert NIL != module0167.f10813(var21) : var21;
        PrintLow.format(var99, (SubLObject)$ic111$, module0172.f10920(var21));
        return var21;
    }
    
    public static SubLObject f34604(final SubLObject var25, final SubLObject var99, SubLObject var102) {
        if (var102 == UNPROVIDED) {
            var102 = (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var25) : var25;
        if (NIL != module0167.f10813(var25)) {
            return f34603(var25, var99, var102);
        }
        return f34602(var25, var99, var102);
    }
    
    public static SubLObject f34605(final SubLObject var27, final SubLObject var99, SubLObject var102) {
        if (var102 == UNPROVIDED) {
            var102 = (SubLObject)NIL;
        }
        assert NIL != assertion_handles_oc.f11035(var27) : var27;
        PrintLow.format(var99, (SubLObject)$ic113$, module0205.f13144(module0178.f11305(var27)));
        return var27;
    }
    
    public static SubLObject f34601(final SubLObject var132, final SubLObject var99, SubLObject var102) {
        if (var102 == UNPROVIDED) {
            var102 = (SubLObject)NIL;
        }
        assert NIL != module0161.f10481(var132) : var132;
        return f34600(var132, var99);
    }
    
    public static SubLObject f34606(final SubLObject var27, final SubLObject var99) {
        final SubLObject var100 = module0538.f33367(var27, (SubLObject)UNPROVIDED);
        final SubLObject var101 = module0178.f11287(var27);
        final SubLObject var102 = module0178.f11293(var27);
        final SubLObject var103 = module0178.f11291(var27);
        f34599(var100, var101, var99, var102, var103);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34607(final SubLObject var89, final SubLObject var99) {
        return f34599(var89, $ic115$, var99, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f34608(final SubLObject var27, final SubLObject var99) {
        final SubLObject var100 = f34609(var27);
        final SubLObject var101 = module0178.f11287(var27);
        final SubLObject var102 = module0178.f11293(var27);
        final SubLObject var103 = module0178.f11291(var27);
        streams_high.terpri(var99);
        if (NIL != module0178.f11375(var27)) {
            final SubLObject var104 = module0178.f11295(var27);
            if (NIL != var104) {
                PrintLow.format(var99, (SubLObject)$ic116$, var104);
            }
        }
        PrintLow.format(var99, (SubLObject)$ic117$);
        module0194.f12114(var100, var99, (SubLObject)TWO_INTEGER);
        PrintLow.format(var99, (SubLObject)$ic118$, new SubLObject[] { var101, var102, var103 });
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34582(final SubLObject var27, final SubLObject var99) {
        final SubLObject var100 = f34609(var27);
        final SubLObject var101 = module0178.f11287(var27);
        final SubLObject var102 = module0178.f11293(var27);
        SubLObject var103 = module0178.f11291(var27);
        if (var103 == $ic84$) {
            var103 = (SubLObject)$ic86$;
        }
        streams_high.terpri(var99);
        if (NIL != module0178.f11375(var27)) {
            final SubLObject var104 = module0178.f11295(var27);
            if (NIL != var104) {
                PrintLow.format(var99, (SubLObject)$ic116$, var104);
            }
        }
        PrintLow.format(var99, (SubLObject)$ic117$);
        module0194.f12114(var100, var99, (SubLObject)TWO_INTEGER);
        PrintLow.format(var99, (SubLObject)$ic118$, new SubLObject[] { var101, var102, var103 });
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34583(final SubLObject var27, final SubLObject var99) {
        final SubLObject var100 = f34609(var27);
        final SubLObject var101 = module0178.f11287(var27);
        final SubLObject var102 = module0178.f11291(var27);
        if (var102 == $ic84$) {
            streams_high.terpri(var99);
            if (NIL != module0178.f11375(var27)) {
                final SubLObject var103 = module0178.f11295(var27);
                if (NIL != var103) {
                    PrintLow.format(var99, (SubLObject)$ic116$, var103);
                }
            }
            PrintLow.format(var99, (SubLObject)$ic119$);
            module0194.f12114(var100, var99, (SubLObject)TWO_INTEGER);
            PrintLow.format(var99, (SubLObject)$ic120$, var101, var102);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34584(final SubLObject var41, final SubLObject var99) {
        SubLObject var100 = module0211.f13701(var41);
        SubLObject var101 = (SubLObject)NIL;
        var101 = var100.first();
        while (NIL != var100) {
            if (NIL != module0178.f11284(var101) && NIL != f34552(var101)) {
                f34608(var101, var99);
            }
            var100 = var100.rest();
            var101 = var100.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34610(final SubLObject var25, SubLObject var99) {
        if (var99 == UNPROVIDED) {
            var99 = StreamsLow.$standard_output$.getDynamicValue();
        }
        f34577(var25, var99);
        f34579(var25, var99);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34577(final SubLObject var25, SubLObject var99) {
        if (var99 == UNPROVIDED) {
            var99 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread var100 = SubLProcess.currentSubLThread();
        final SubLObject var101 = module0147.$g2094$.currentBinding(var100);
        final SubLObject var102 = module0147.$g2095$.currentBinding(var100);
        try {
            module0147.$g2094$.bind((SubLObject)$ic2$, var100);
            module0147.$g2095$.bind($ic3$, var100);
            SubLObject var103 = module0343.$g2951$.getGlobalValue();
            SubLObject var104 = (SubLObject)NIL;
            var104 = var103.first();
            while (NIL != var103) {
                f34611(var25, var104, var99);
                var103 = var103.rest();
                var104 = var103.first();
            }
            var103 = module0344.$g2955$.getGlobalValue();
            var104 = (SubLObject)NIL;
            var104 = var103.first();
            while (NIL != var103) {
                f34611(var25, var104, var99);
                var103 = var103.rest();
                var104 = var103.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var102, var100);
            module0147.$g2094$.rebind(var101, var100);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34579(final SubLObject var25, SubLObject var99) {
        if (var99 == UNPROVIDED) {
            var99 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread var100 = SubLProcess.currentSubLThread();
        final SubLObject var101 = module0147.$g2094$.currentBinding(var100);
        final SubLObject var102 = module0147.$g2095$.currentBinding(var100);
        try {
            module0147.$g2094$.bind((SubLObject)$ic2$, var100);
            module0147.$g2095$.bind($ic3$, var100);
            SubLObject var103 = $g4087$.getGlobalValue();
            SubLObject var104 = (SubLObject)NIL;
            var104 = var103.first();
            while (NIL != var103) {
                f34611(var25, var104, var99);
                var103 = var103.rest();
                var104 = var103.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var102, var100);
            module0147.$g2094$.rebind(var101, var100);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34611(final SubLObject var25, final SubLObject var51, final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        if (NIL != module0158.f10010(var25, (SubLObject)ONE_INTEGER, var51)) {
            final SubLObject var101 = module0158.f10011(var25, (SubLObject)ONE_INTEGER, var51);
            SubLObject var102 = (SubLObject)NIL;
            final SubLObject var103 = (SubLObject)NIL;
            while (NIL == var102) {
                final SubLObject var104 = module0052.f3695(var101, var103);
                final SubLObject var105 = (SubLObject)makeBoolean(!var103.eql(var104));
                if (NIL != var105) {
                    SubLObject var106 = (SubLObject)NIL;
                    try {
                        var106 = module0158.f10316(var104, (SubLObject)$ic122$, (SubLObject)$ic19$, (SubLObject)NIL);
                        SubLObject var34_137 = (SubLObject)NIL;
                        final SubLObject var35_138 = (SubLObject)NIL;
                        while (NIL == var34_137) {
                            final SubLObject var107 = module0052.f3695(var106, var35_138);
                            final SubLObject var37_139 = (SubLObject)makeBoolean(!var35_138.eql(var107));
                            if (NIL != var37_139) {
                                SubLObject var108 = (SubLObject)NIL;
                                try {
                                    var100.throwStack.push($ic123$);
                                    final SubLObject var109 = Errors.$error_handler$.currentBinding(var100);
                                    try {
                                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic124$), var100);
                                        try {
                                            if (NIL != f34552(var107) && NIL == module0178.f11324(var107)) {
                                                f34606(var107, var99);
                                            }
                                        }
                                        catch (Throwable var110) {
                                            Errors.handleThrowable(var110, (SubLObject)NIL);
                                        }
                                    }
                                    finally {
                                        Errors.$error_handler$.rebind(var109, var100);
                                    }
                                }
                                catch (Throwable var111) {
                                    var108 = Errors.handleThrowable(var111, (SubLObject)$ic123$);
                                }
                                finally {
                                    var100.throwStack.pop();
                                }
                            }
                            var34_137 = (SubLObject)makeBoolean(NIL == var37_139);
                        }
                    }
                    finally {
                        final SubLObject var112 = Threads.$is_thread_performing_cleanupP$.currentBinding(var100);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var100);
                            if (NIL != var106) {
                                module0158.f10319(var106);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var112, var100);
                        }
                    }
                }
                var102 = (SubLObject)makeBoolean(NIL == var105);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34581(final SubLObject var25, SubLObject var99) {
        if (var99 == UNPROVIDED) {
            var99 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread var100 = SubLProcess.currentSubLThread();
        final SubLObject var101 = module0217.f14228(var25, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
        final SubLObject var102 = module0147.$g2094$.currentBinding(var100);
        final SubLObject var103 = module0147.$g2095$.currentBinding(var100);
        try {
            module0147.$g2094$.bind((SubLObject)$ic2$, var100);
            module0147.$g2095$.bind($ic3$, var100);
            SubLObject var104 = var101;
            SubLObject var105 = (SubLObject)NIL;
            var105 = var104.first();
            while (NIL != var104) {
                if (NIL != f34612(var105)) {
                    final SubLObject var106 = var105;
                    if (NIL != module0158.f10010(var25, (SubLObject)ONE_INTEGER, var106)) {
                        final SubLObject var107 = module0158.f10011(var25, (SubLObject)ONE_INTEGER, var106);
                        SubLObject var108 = (SubLObject)NIL;
                        final SubLObject var109 = (SubLObject)NIL;
                        while (NIL == var108) {
                            final SubLObject var110 = module0052.f3695(var107, var109);
                            final SubLObject var111 = (SubLObject)makeBoolean(!var109.eql(var110));
                            if (NIL != var111) {
                                SubLObject var112 = (SubLObject)NIL;
                                try {
                                    var112 = module0158.f10316(var110, (SubLObject)$ic122$, (SubLObject)$ic19$, (SubLObject)NIL);
                                    SubLObject var34_144 = (SubLObject)NIL;
                                    final SubLObject var35_145 = (SubLObject)NIL;
                                    while (NIL == var34_144) {
                                        final SubLObject var113 = module0052.f3695(var112, var35_145);
                                        final SubLObject var37_146 = (SubLObject)makeBoolean(!var35_145.eql(var113));
                                        if (NIL != var37_146) {
                                            SubLObject var114 = (SubLObject)NIL;
                                            try {
                                                var100.throwStack.push($ic123$);
                                                final SubLObject var5_148 = Errors.$error_handler$.currentBinding(var100);
                                                try {
                                                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic124$), var100);
                                                    try {
                                                        if (NIL != f34552(var113) && NIL == module0178.f11324(var113)) {
                                                            if (NIL != f34613(var113)) {
                                                                f34614(var113);
                                                            }
                                                            else {
                                                                f34606(var113, var99);
                                                            }
                                                        }
                                                    }
                                                    catch (Throwable var115) {
                                                        Errors.handleThrowable(var115, (SubLObject)NIL);
                                                    }
                                                }
                                                finally {
                                                    Errors.$error_handler$.rebind(var5_148, var100);
                                                }
                                            }
                                            catch (Throwable var116) {
                                                var114 = Errors.handleThrowable(var116, (SubLObject)$ic123$);
                                            }
                                            finally {
                                                var100.throwStack.pop();
                                            }
                                        }
                                        var34_144 = (SubLObject)makeBoolean(NIL == var37_146);
                                    }
                                }
                                finally {
                                    final SubLObject var5_149 = Threads.$is_thread_performing_cleanupP$.currentBinding(var100);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var100);
                                        if (NIL != var112) {
                                            module0158.f10319(var112);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var5_149, var100);
                                    }
                                }
                            }
                            var108 = (SubLObject)makeBoolean(NIL == var111);
                        }
                    }
                }
                var104 = var104.rest();
                var105 = var104.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var103, var100);
            module0147.$g2094$.rebind(var102, var100);
        }
        SubLObject var117 = module0617.f37882(var25);
        SubLObject var118 = (SubLObject)NIL;
        var118 = var117.first();
        while (NIL != var117) {
            if (NIL != f34551(var118)) {
                f34607(var118, var99);
            }
            var117 = var117.rest();
            var118 = var117.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34613(final SubLObject var27) {
        return f34615(var27);
    }
    
    public static SubLObject f34615(final SubLObject var150) {
        return (SubLObject)makeBoolean(NIL != assertion_handles_oc.f11035(var150) && NIL != module0035.f1995(module0178.f11285(var150), (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED) && module0178.f11332(var150).eql($ic125$));
    }
    
    public static SubLObject f34558() {
        $g4088$.setDynamicValue((SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34614(final SubLObject var27) {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        $g4088$.setDynamicValue((SubLObject)ConsesLow.cons(var27, $g4088$.getDynamicValue(var28)), var28);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34585(SubLObject var99) {
        if (var99 == UNPROVIDED) {
            var99 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread var100 = SubLProcess.currentSubLThread();
        final SubLObject var101 = Sequences.reverse($g4088$.getDynamicValue(var100));
        module0012.$g82$.setDynamicValue((SubLObject)$ic126$, var100);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var100);
        module0012.$g83$.setDynamicValue(Sequences.length(var101), var100);
        module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var100);
        final SubLObject var102 = module0012.$g75$.currentBinding(var100);
        final SubLObject var103 = module0012.$g76$.currentBinding(var100);
        final SubLObject var104 = module0012.$g77$.currentBinding(var100);
        final SubLObject var105 = module0012.$g78$.currentBinding(var100);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var100);
            module0012.$g76$.bind((SubLObject)NIL, var100);
            module0012.$g77$.bind((SubLObject)T, var100);
            module0012.$g78$.bind(Time.get_universal_time(), var100);
            module0012.f478(module0012.$g82$.getDynamicValue(var100));
            SubLObject var106 = var101;
            SubLObject var107 = (SubLObject)NIL;
            var107 = var106.first();
            while (NIL != var106) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var100), module0012.$g83$.getDynamicValue(var100));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var100), (SubLObject)ONE_INTEGER), var100);
                f34608(var107, var99);
                var106 = var106.rest();
                var107 = var106.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var105, var100);
            module0012.$g77$.rebind(var104, var100);
            module0012.$g76$.rebind(var103, var100);
            module0012.$g75$.rebind(var102, var100);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34612(final SubLObject var152) {
        final SubLThread var153 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != f34549(var152) && NIL == module0004.f104(var152, $g4089$.getDynamicValue(var153), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL != module0269.f17706(var152));
    }
    
    public static SubLObject f34609(final SubLObject var27) {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        SubLObject var29 = (SubLObject)NIL;
        SubLObject var30 = (SubLObject)NIL;
        try {
            var28.throwStack.push($ic123$);
            final SubLObject var31 = Errors.$error_handler$.currentBinding(var28);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic124$), var28);
                try {
                    if (NIL == module0285.f19085(var27)) {
                        var29 = module0289.f19396(var27);
                    }
                }
                catch (Throwable var32) {
                    Errors.handleThrowable(var32, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var31, var28);
            }
        }
        catch (Throwable var33) {
            var30 = Errors.handleThrowable(var33, (SubLObject)$ic123$);
        }
        finally {
            var28.throwStack.pop();
        }
        if (NIL == var29) {
            var29 = module0538.f33478(var27, (SubLObject)UNPROVIDED);
        }
        return var29;
    }
    
    public static SubLObject f34616(final SubLObject var1) {
        assert NIL != constant_handles_oc.f8449(var1) : var1;
        if (NIL == $g4077$.getGlobalValue()) {
            f34539();
        }
        SubLObject var2 = (SubLObject)NIL;
        SubLObject var4;
        SubLObject var3 = var4 = module0256.f16529(module0035.delete_if_not((SubLObject)$ic129$, module0259.f16842(var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var5 = (SubLObject)NIL;
        var5 = var4.first();
        while (NIL != var4) {
            var2 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list($ic26$, var1, var5), var2);
            var4 = var4.rest();
            var5 = var4.first();
        }
        var3 = (var4 = module0256.f16529(module0035.delete_if_not((SubLObject)$ic129$, module0259.f16991(var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        var5 = (SubLObject)NIL;
        var5 = var4.first();
        while (NIL != var4) {
            if (!var5.eql($ic27$)) {
                var2 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list($ic28$, var1, var5), var2);
            }
            var4 = var4.rest();
            var5 = var4.first();
        }
        if (NIL != module0269.f17731(var1)) {
            final SubLObject var6 = var4 = module0262.f17364(module0035.delete_if_not((SubLObject)$ic129$, module0262.f17311(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
            SubLObject var7 = (SubLObject)NIL;
            var7 = var4.first();
            while (NIL != var4) {
                var2 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list($ic130$, var1, var7), var2);
                var4 = var4.rest();
                var7 = var4.first();
            }
        }
        if (NIL != module0269.f17705(var1)) {
            final SubLObject var8 = var4 = module0256.f16529(module0035.delete_if_not((SubLObject)$ic129$, module0256.f16546(var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var9 = (SubLObject)NIL;
            var9 = var4.first();
            while (NIL != var4) {
                var2 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list($ic131$, var1, var9), var2);
                var4 = var4.rest();
                var9 = var4.first();
            }
        }
        if (NIL != module0226.f14792(var1)) {
            final SubLObject var10 = module0225.f14773(var1);
            if (NIL != var10) {
                SubLObject var11;
                SubLObject var12;
                SubLObject var13;
                SubLObject var14;
                SubLObject var15;
                SubLObject var16;
                SubLObject var17;
                SubLObject var18;
                for (var11 = module0048.f_1X(var10), var12 = (SubLObject)NIL, var12 = (SubLObject)ONE_INTEGER; !var12.numGE(var11); var12 = module0048.f_1X(var12)) {
                    var13 = module0226.f14903(var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    var14 = module0226.f14882(var1, var12, (SubLObject)UNPROVIDED);
                    if (NIL != var14) {
                        var14 = (var15 = module0256.f16529(module0035.delete_if_not((SubLObject)$ic129$, module0256.f16550(var14, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                        var16 = (SubLObject)NIL;
                        var16 = var15.first();
                        while (NIL != var15) {
                            var2 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var13, var1, var16), var2);
                            var15 = var15.rest();
                            var16 = var15.first();
                        }
                    }
                    var13 = module0226.f14909(var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    var17 = module0226.f14895(var1, var12, (SubLObject)UNPROVIDED);
                    if (NIL != var17) {
                        var17 = (var15 = module0256.f16529(module0035.delete_if_not((SubLObject)$ic129$, module0256.f16550(var17, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                        var18 = (SubLObject)NIL;
                        var18 = var15.first();
                        while (NIL != var15) {
                            var2 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var13, var1, var18), var2);
                            var15 = var15.rest();
                            var18 = var15.first();
                        }
                    }
                }
            }
        }
        if (NIL != module0269.f17708(var1)) {
            SubLObject var19 = module0226.f14990(var1, (SubLObject)UNPROVIDED);
            if (NIL != var19) {
                var19 = (var4 = module0256.f16529(module0035.delete_if_not((SubLObject)$ic129$, module0256.f16550(var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                SubLObject var20 = (SubLObject)NIL;
                var20 = var4.first();
                while (NIL != var4) {
                    var2 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list($ic132$, var1, var20), var2);
                    var4 = var4.rest();
                    var20 = var4.first();
                }
            }
        }
        return Sequences.nreverse(var2);
    }
    
    public static SubLObject f34617() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34529", "S#37839", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34530", "S#37840", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34531", "S#37841", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34532", "S#37842", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34533", "S#37843", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34534", "S#37844", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34535", "S#37845", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34536", "S#37846", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34537", "S#37847", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34538", "S#37848", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34539", "S#37849", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34540", "S#37850", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34541", "S#37851", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34542", "S#37852", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34543", "S#37853", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34544", "S#37854", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34545", "S#37855", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34546", "S#37856", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34547", "S#37857", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34548", "S#37858", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34549", "S#37859", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34550", "S#37860", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34551", "S#37861", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34552", "S#37862", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34553", "S#37863", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34554", "S#37864", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34555", "S#37865", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34556", "S#37866", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34557", "S#37867", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34561", "S#37868", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34562", "S#37869", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34560", "S#37870", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34565", "S#37871", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34566", "S#37872", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34564", "S#37873", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34567", "S#37874", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34568", "S#37875", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34559", "S#37876", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34569", "S#37877", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34570", "S#37878", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34563", "S#37879", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34571", "S#37880", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34572", "S#37881", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34573", "S#37882", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34574", "S#37883", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34586", "S#37884", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34588", "S#37885", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34587", "S#21477", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34589", "LOW-ASSERT-LITERAL", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34591", "S#37886", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34590", "S#37887", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34592", "CORE-KB-INITIALIZATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34593", "CORE-KB-START-BOOTSTRAPPING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34594", "CORE-KB-START-DEFINITIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34595", "CORE-KB-FINISH-DEFINITIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34596", "CORE-KB-FINISH-BOOTSTRAPPING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34597", "CORE-KB-FINALIZATION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34575", "S#37888", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34576", "S#37889", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34598", "S#37890", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34578", "S#37891", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34580", "S#37892", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34599", "S#37893", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34600", "S#37894", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34602", "S#37895", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34603", "S#37896", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34604", "S#37897", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34605", "S#37898", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34601", "S#37899", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34606", "S#37900", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34607", "S#37901", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34608", "S#37902", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34582", "S#37903", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34583", "S#37904", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34584", "S#37905", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34610", "S#37906", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34577", "S#37907", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34579", "S#37908", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34611", "S#37909", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34581", "S#37910", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34613", "S#37911", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34615", "S#37912", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34558", "S#37913", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34614", "S#37914", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34585", "S#37915", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34612", "S#37916", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34609", "S#37917", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0561", "f34616", "S#37918", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34618() {
        $g4073$ = SubLFiles.deflexical("S#37919", $ic0$);
        $g4074$ = SubLFiles.deflexical("S#37920", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic5$)) ? $g4074$.getGlobalValue() : $ic6$));
        $g4075$ = SubLFiles.deflexical("S#37921", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic7$)) ? $g4075$.getGlobalValue() : NIL));
        $g4076$ = SubLFiles.deflexical("S#37922", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic8$)) ? $g4076$.getGlobalValue() : $ic6$));
        $g4077$ = SubLFiles.deflexical("S#37923", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic9$)) ? $g4077$.getGlobalValue() : NIL));
        $g4078$ = SubLFiles.deflexical("S#37924", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic12$)) ? $g4078$.getGlobalValue() : $ic6$));
        $g4079$ = SubLFiles.deflexical("S#37925", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic13$)) ? $g4079$.getGlobalValue() : $ic6$));
        $g4080$ = SubLFiles.deflexical("S#37926", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic14$)) ? $g4080$.getGlobalValue() : NIL));
        $g4081$ = SubLFiles.deflexical("S#37927", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic20$)) ? $g4081$.getGlobalValue() : $ic6$));
        $g4082$ = SubLFiles.defparameter("S#37928", (SubLObject)$ic22$);
        $g4083$ = SubLFiles.defparameter("S#37929", (SubLObject)NIL);
        $g4084$ = SubLFiles.deflexical("S#37930", (SubLObject)NIL);
        $g4085$ = SubLFiles.deflexical("S#37931", (SubLObject)NIL);
        $g4086$ = SubLFiles.deflexical("S#37932", (SubLObject)NIL);
        $g4087$ = SubLFiles.deflexical("S#37933", (SubLObject)$ic121$);
        $g4088$ = SubLFiles.defvar("S#37934", (SubLObject)NIL);
        $g4089$ = SubLFiles.defparameter("S#37935", ConsesLow.nconc(new SubLObject[] { Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic100$), $g4082$.getDynamicValue()), Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic100$), $g4083$.getDynamicValue()), conses_high.copy_list(module0343.$g2951$.getGlobalValue()), conses_high.copy_list(module0344.$g2955$.getGlobalValue()), ConsesLow.list($ic127$, $ic128$) }));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34619() {
        module0003.f57((SubLObject)$ic5$);
        module0003.f57((SubLObject)$ic7$);
        module0003.f57((SubLObject)$ic8$);
        module0003.f57((SubLObject)$ic9$);
        module0003.f57((SubLObject)$ic12$);
        module0003.f57((SubLObject)$ic13$);
        module0003.f57((SubLObject)$ic14$);
        module0003.f57((SubLObject)$ic20$);
        module0034.f1909((SubLObject)$ic23$);
        module0034.f1909((SubLObject)$ic36$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f34617();
    }
    
    public void initializeVariables() {
        f34618();
    }
    
    public void runTopLevelForms() {
        f34619();
    }
    
    static {
        me = (SubLFile)new module0561();
        $g4073$ = null;
        $g4074$ = null;
        $g4075$ = null;
        $g4076$ = null;
        $g4077$ = null;
        $g4078$ = null;
        $g4079$ = null;
        $g4080$ = null;
        $g4081$ = null;
        $g4082$ = null;
        $g4083$ = null;
        $g4084$ = null;
        $g4085$ = null;
        $g4086$ = null;
        $g4087$ = null;
        $g4088$ = null;
        $g4089$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("CoreUnionConstant"));
        $ic1$ = makeSymbol("S#37840", "CYC");
        $ic2$ = makeSymbol("S#12274", "CYC");
        $ic3$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic4$ = makeSymbol("CONSTANT-P");
        $ic5$ = makeSymbol("S#37920", "CYC");
        $ic6$ = makeKeyword("UNINITIALIZED");
        $ic7$ = makeSymbol("S#37921", "CYC");
        $ic8$ = makeSymbol("S#37922", "CYC");
        $ic9$ = makeSymbol("S#37923", "CYC");
        $ic10$ = makeString("Computing core NARTs");
        $ic11$ = makeSymbol("S#37851", "CYC");
        $ic12$ = makeSymbol("S#37924", "CYC");
        $ic13$ = makeSymbol("S#37925", "CYC");
        $ic14$ = makeSymbol("S#37926", "CYC");
        $ic15$ = makeSymbol("S#37860", "CYC");
        $ic16$ = makeSymbol("S#37863", "CYC");
        $ic17$ = makeString("determining core rules");
        $ic18$ = makeKeyword("RULE");
        $ic19$ = makeKeyword("TRUE");
        $ic20$ = makeSymbol("S#37927", "CYC");
        $ic21$ = makeString("Computing definitional info");
        $ic22$ = ConsesLow.list(new SubLObject[] { ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("quotedIsa")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genls")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)T), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("arg1Isa")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("arg1Genl")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("arg2Isa")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("arg2Genl")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("arg3Isa")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("arg3Genl")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("arg4Isa")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("arg4Genl")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("arg5Isa")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("arg5Genl")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("argsIsa")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("arg1QuotedIsa")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("arg2QuotedIsa")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("arg3QuotedIsa")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("arg4QuotedIsa")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("arg5QuotedIsa")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("argsQuotedIsa")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("resultIsa")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("resultGenl")), (SubLObject)makeSymbol("ALL-GENLS"), (SubLObject)makeSymbol("GENL?"), (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genlPreds")), (SubLObject)makeSymbol("S#19647", "CYC"), (SubLObject)makeSymbol("S#15517", "CYC"), (SubLObject)T), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genlInverse")), (SubLObject)makeSymbol("S#19647", "CYC"), (SubLObject)makeSymbol("S#15517", "CYC"), (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genlMt")), (SubLObject)makeSymbol("S#19859", "CYC"), (SubLObject)makeSymbol("GENL-MT?"), (SubLObject)T), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("arity")), (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("arityMin")), (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("arityMax")), (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("defnIff")), (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("defnNecessary")), (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("defnSufficient")), (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("quotedDefnIff")), (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("quotedDefnNecessary")), (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("quotedDefnSufficient")), (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL) });
        $ic23$ = makeSymbol("S#37873", "CYC");
        $ic24$ = ConsesLow.list((SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#37936", "CYC"), (SubLObject)makeSymbol("S#37937", "CYC"), (SubLObject)makeSymbol("S#37938", "CYC"));
        $ic25$ = makeKeyword("FALSE");
        $ic26$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic27$ = constant_handles_oc.f8479((SubLObject)makeString("CycLConstant"));
        $ic28$ = constant_handles_oc.f8479((SubLObject)makeString("quotedIsa"));
        $ic29$ = makeSymbol("S#37859", "CYC");
        $ic30$ = makeSymbol("S#37930", "CYC");
        $ic31$ = makeInteger(300);
        $ic32$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic33$ = makeString("~%Cycle: ~S ~S ~S");
        $ic34$ = makeString("~%Given: ~S~%Minimal: ~S");
        $ic35$ = makeSymbol("FORT-P");
        $ic36$ = makeSymbol("S#37879", "CYC");
        $ic37$ = constant_handles_oc.f8479((SubLObject)makeString("CoreCycLMt"));
        $ic38$ = makeSymbol("GAF-ARG2");
        $ic39$ = makeSymbol("GAF-ARG1");
        $ic40$ = makeSymbol("S#37931", "CYC");
        $ic41$ = makeSymbol("S#12278", "CYC");
        $ic42$ = makeKeyword("OUTPUT");
        $ic43$ = makeString("Unable to open ~S");
        $ic44$ = makeString(";; -*- Mode: LISP; Package: CYC; Syntax: ANSI-Common-Lisp -*-");
        $ic45$ = makeString("~%;;");
        $ic46$ = makeString("~%;; ~A");
        $ic47$ = makeString("~%;; Core KB for CycL version ~A from KB ~S.~S");
        $ic48$ = makeString("~%;; This file is automatically generated!  See CYC:CYCL;CORE.LISP for details.");
        $ic49$ = makeString("~%;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        $ic50$ = makeString("~%~%(in-package \"CYC\")");
        $ic51$ = makeString("~%~%;; initialization");
        $ic52$ = makeString("~%(core-kb-initialization ~S)");
        $ic53$ = makeString("~%~%;; constants");
        $ic54$ = makeString("constant creates");
        $ic55$ = makeString("~%~%(core-kb-start-bootstrapping)");
        $ic56$ = makeString("~%~%;; NARTs");
        $ic57$ = makeString("NART creates");
        $ic58$ = makeString("~%~%;; after adding early extent gafs");
        $ic59$ = makeString("after adding early extent asserts");
        $ic60$ = makeString("~%~%;; Core mt definitional assertions");
        $ic61$ = makeString("Core mt definitional asserts");
        $ic62$ = makeString("~%~%;; decontextualization early extent gafs");
        $ic63$ = makeString("decontextualization early extent asserts");
        $ic64$ = makeString("~%~%(core-kb-start-definitions)");
        $ic65$ = makeString("~%~%;; definitional assertions");
        $ic66$ = makeString("definitional asserts");
        $ic67$ = makeString("~%~%;; post-definitional initializations");
        $ic68$ = makeString("~%(core-kb-finish-definitions)");
        $ic69$ = makeString("~%~%;; additional gaf assertions");
        $ic70$ = makeString("additional gaf asserts");
        $ic71$ = makeString("~%~%(core-kb-finish-bootstrapping)");
        $ic72$ = makeString("~%~%;; rules (asserting forward rules as backward)");
        $ic73$ = makeString("core rules with meta-assertions (asserting forward rules as backward)");
        $ic74$ = makeString("core rules without meta-assertions (asserting forward rules as backward)");
        $ic75$ = makeString("~%~%;; forward rules (reasserting as forward)");
        $ic76$ = makeString("core rules with meta-assertions");
        $ic77$ = makeString("core rules without meta-assertions");
        $ic78$ = makeString("~%~%;; meta-assertion gafs");
        $ic79$ = makeString("meta-assertion gafs");
        $ic80$ = makeString("~%~%;; late assertions");
        $ic81$ = makeString("~%~%;; finalization");
        $ic82$ = makeString("~%(core-kb-finalization)");
        $ic83$ = makeKeyword("DEFAULT");
        $ic84$ = makeKeyword("FORWARD");
        $ic85$ = makeString("Illegal operation -- not bootstrapping KB");
        $ic86$ = makeKeyword("BACKWARD");
        $ic87$ = makeSymbol("EL-VAR?");
        $ic88$ = makeString("~&~%;;; Constructing core KB at ~A~%");
        $ic89$ = makeKeyword("STRICT");
        $ic90$ = makeKeyword("ASSERTIVE");
        $ic91$ = makeString("~&~%;;; Construction of core KB completed (~A) at ~A~%");
        $ic92$ = makeString("~%(find-or-create-constant ~S ~S)");
        $ic93$ = makeSymbol("NART-P");
        $ic94$ = makeString(",");
        $ic95$ = makeString("(low-create-nart `(");
        $ic96$ = makeString(" ");
        $ic97$ = makeString("))");
        $ic98$ = makeString("~%~%;; ~S");
        $ic99$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#37939", "CYC"));
        $ic100$ = makeSymbol("FIRST");
        $ic101$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#12576", "CYC"), (SubLObject)makeSymbol("VALUES"));
        $ic102$ = ConsesLow.list((SubLObject)makeSymbol("S#132", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"));
        $ic103$ = constant_handles_oc.f8479((SubLObject)makeString("UniversalVocabularyMt"));
        $ic104$ = makeString("~%(low-assert-literal `");
        $ic105$ = makeString(" `");
        $ic106$ = makeString(")");
        $ic107$ = makeSymbol("S#37895", "CYC");
        $ic108$ = makeSymbol("S#37896", "CYC");
        $ic109$ = makeSymbol("S#37898", "CYC");
        $ic110$ = makeString("~S");
        $ic111$ = makeString(",(find-nart '~S)");
        $ic112$ = makeSymbol("ASSERTION-P");
        $ic113$ = makeString("~s");
        $ic114$ = makeSymbol("S#12263", "CYC");
        $ic115$ = constant_handles_oc.f8479((SubLObject)makeString("BookkeepingMt"));
        $ic116$ = makeString(";; asserted by ~S~%");
        $ic117$ = makeString("(fi-assert-int '");
        $ic118$ = makeString("~%~S ~S ~S)~%");
        $ic119$ = makeString("(tms-change-direction (find-assertion-cycl '");
        $ic120$ = makeString("~%~S) ~S)~%");
        $ic121$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("decontextualizedPredicate")), constant_handles_oc.f8479((SubLObject)makeString("predicateConventionMt")), constant_handles_oc.f8479((SubLObject)makeString("decontextualizedCollection")), constant_handles_oc.f8479((SubLObject)makeString("collectionConventionMt")));
        $ic122$ = makeKeyword("GAF");
        $ic123$ = makeKeyword("IGNORE-ERRORS-TARGET");
        $ic124$ = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic125$ = constant_handles_oc.f8479((SubLObject)makeString("notAssertibleMt"));
        $ic126$ = makeString("late assertions");
        $ic127$ = constant_handles_oc.f8479((SubLObject)makeString("termOfUnit"));
        $ic128$ = constant_handles_oc.f8479((SubLObject)makeString("cyclistNotes"));
        $ic129$ = makeSymbol("S#37850", "CYC");
        $ic130$ = constant_handles_oc.f8479((SubLObject)makeString("genlMt"));
        $ic131$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic132$ = constant_handles_oc.f8479((SubLObject)makeString("resultIsa"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 1064 ms
	
	Decompiled with Procyon 0.5.32.
*/