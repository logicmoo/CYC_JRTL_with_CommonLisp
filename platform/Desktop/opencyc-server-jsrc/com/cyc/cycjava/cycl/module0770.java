package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0770 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0770";
    public static final String myFingerPrint = "9eecdb581fe89998f9bf75348029353dd94a51aa6134801234fe9fc12ada07a9";
    private static SubLSymbol $g6151$;
    private static SubLSymbol $g6152$;
    private static SubLSymbol $g6153$;
    private static SubLSymbol $g6154$;
    private static SubLSymbol $g6155$;
    public static SubLSymbol $g6156$;
    public static SubLSymbol $g6157$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLString $ic11$;
    private static final SubLList $ic12$;
    private static final SubLList $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLString $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLString $ic18$;
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLString $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLInteger $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLList $ic32$;
    private static final SubLString $ic33$;
    private static final SubLList $ic34$;
    private static final SubLList $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLString $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLObject $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLList $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLList $ic50$;
    private static final SubLList $ic51$;
    private static final SubLList $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLList $ic56$;
    private static final SubLString $ic57$;
    private static final SubLList $ic58$;
    private static final SubLList $ic59$;
    private static final SubLString $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLString $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLString $ic65$;
    private static final SubLString $ic66$;
    private static final SubLString $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLString $ic69$;
    private static final SubLString $ic70$;
    private static final SubLString $ic71$;
    private static final SubLString $ic72$;
    private static final SubLString $ic73$;
    private static final SubLList $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLString $ic81$;
    private static final SubLString $ic82$;
    private static final SubLString $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLList $ic88$;
    private static final SubLString $ic89$;
    private static final SubLList $ic90$;
    private static final SubLList $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLString $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLString $ic96$;
    private static final SubLString $ic97$;
    private static final SubLList $ic98$;
    private static final SubLList $ic99$;
    private static final SubLString $ic100$;
    private static final SubLString $ic101$;
    private static final SubLList $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLString $ic104$;
    private static final SubLString $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLString $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLString $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLInteger $ic113$;
    private static final SubLObject $ic114$;
    private static final SubLString $ic115$;
    private static final SubLString $ic116$;
    private static final SubLObject $ic117$;
    private static final SubLString $ic118$;
    private static final SubLString $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLString $ic121$;
    private static final SubLString $ic122$;
    private static final SubLString $ic123$;
    private static final SubLString $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLString $ic126$;
    private static final SubLString $ic127$;
    private static final SubLString $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLList $ic135$;
    private static final SubLString $ic136$;
    private static final SubLString $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLString $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLString $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLString $ic146$;
    private static final SubLString $ic147$;
    private static final SubLString $ic148$;
    private static final SubLString $ic149$;
    private static final SubLString $ic150$;
    private static final SubLString $ic151$;
    private static final SubLString $ic152$;
    private static final SubLString $ic153$;
    private static final SubLString $ic154$;
    private static final SubLString $ic155$;
    private static final SubLString $ic156$;
    private static final SubLString $ic157$;
    private static final SubLString $ic158$;
    private static final SubLString $ic159$;
    private static final SubLString $ic160$;
    private static final SubLString $ic161$;
    private static final SubLString $ic162$;
    private static final SubLString $ic163$;
    private static final SubLString $ic164$;
    private static final SubLString $ic165$;
    private static final SubLString $ic166$;
    private static final SubLString $ic167$;
    private static final SubLString $ic168$;
    private static final SubLObject $ic169$;
    private static final SubLObject $ic170$;
    private static final SubLObject $ic171$;
    private static final SubLString $ic172$;
    private static final SubLSymbol $ic173$;
    private static final SubLSymbol $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLList $ic176$;
    private static final SubLSymbol $ic177$;
    private static final SubLSymbol $ic178$;
    private static final SubLSymbol $ic179$;
    private static final SubLList $ic180$;
    private static final SubLSymbol $ic181$;
    private static final SubLList $ic182$;
    
    
    public static SubLObject f49049(final SubLObject var1, SubLObject var2, SubLObject var3, SubLObject var4, SubLObject var5, SubLObject var6, SubLObject var7, SubLObject var8) {
        if (var2 == module0770.UNPROVIDED) {
            var2 = (SubLObject)module0770.$ic0$;
        }
        if (var3 == module0770.UNPROVIDED) {
            var3 = (SubLObject)module0770.NIL;
        }
        if (var4 == module0770.UNPROVIDED) {
            var4 = module0579.$g4260$.getDynamicValue();
        }
        if (var5 == module0770.UNPROVIDED) {
            var5 = module0579.$g4262$.getDynamicValue();
        }
        if (var6 == module0770.UNPROVIDED) {
            var6 = (SubLObject)module0770.$ic1$;
        }
        if (var7 == module0770.UNPROVIDED) {
            var7 = (SubLObject)module0770.NIL;
        }
        if (var8 == module0770.UNPROVIDED) {
            var8 = (SubLObject)module0770.NIL;
        }
        final SubLThread var9 = SubLProcess.currentSubLThread();
        assert module0770.NIL != module0206.f13464(var1) : var1;
        assert module0770.NIL != module0751.f46980(var2) : var2;
        assert module0770.NIL != module0751.f47219(var3) : var3;
        assert module0770.NIL != module0161.f10499(var4) : var4;
        assert module0770.NIL != module0161.f10499(var5) : var5;
        assert module0770.NIL != Types.keywordp(var6) : var6;
        assert module0770.NIL != Types.booleanp(var7) : var7;
        assert module0770.NIL != module0751.f47221(var8) : var8;
        enforceType(var1, module0770.$ic2$);
        enforceType(var2, module0770.$ic3$);
        var9.resetMultipleValues();
        final SubLObject var10 = f49050(var1, var2, var3, var4, var5, var6, var7, var8);
        final SubLObject var11 = var9.secondMultipleValue();
        final SubLObject var12 = var9.thirdMultipleValue();
        final SubLObject var13 = var9.fourthMultipleValue();
        var9.resetMultipleValues();
        return Values.values(var10, var11, var12, var13);
    }
    
    public static SubLObject f49050(final SubLObject var1, SubLObject var2, SubLObject var3, SubLObject var4, SubLObject var5, SubLObject var6, SubLObject var7, SubLObject var8) {
        if (var2 == module0770.UNPROVIDED) {
            var2 = (SubLObject)module0770.$ic0$;
        }
        if (var3 == module0770.UNPROVIDED) {
            var3 = (SubLObject)module0770.NIL;
        }
        if (var4 == module0770.UNPROVIDED) {
            var4 = module0579.$g4260$.getDynamicValue();
        }
        if (var5 == module0770.UNPROVIDED) {
            var5 = module0579.$g4262$.getDynamicValue();
        }
        if (var6 == module0770.UNPROVIDED) {
            var6 = module0579.$g4259$.getDynamicValue();
        }
        if (var7 == module0770.UNPROVIDED) {
            var7 = (SubLObject)module0770.NIL;
        }
        if (var8 == module0770.UNPROVIDED) {
            var8 = (SubLObject)module0770.NIL;
        }
        final SubLThread var9 = SubLProcess.currentSubLThread();
        return f49051(var1, var2, var3, var4, var5, var6, var7, var8, module0579.$g4287$.getDynamicValue(var9));
    }
    
    public static SubLObject f49052(SubLObject var1, SubLObject var2, final SubLObject var3, final SubLObject var4, final SubLObject var5, final SubLObject var6, final SubLObject var7, final SubLObject var8, final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        SubLObject var16 = (SubLObject)module0770.NIL;
        final SubLObject var17 = module0202.f12702(var1);
        SubLObject var18 = (SubLObject)module0770.NIL;
        SubLObject var19 = (SubLObject)module0770.NIL;
        SubLObject var20 = (SubLObject)module0770.NIL;
        SubLObject var21 = (SubLObject)module0770.NIL;
        SubLObject var22 = (SubLObject)module0770.NIL;
        final SubLObject var23 = Errors.$continue_cerrorP$.currentBinding(var15);
        final SubLObject var24 = module0578.$g4234$.currentBinding(var15);
        try {
            Errors.$continue_cerrorP$.bind((SubLObject)module0770.NIL, var15);
            module0578.$g4234$.bind((SubLObject)module0770.T, var15);
            if (module0770.NIL != module0578.f35473()) {
                final SubLObject var18_20 = module0580.$g4361$.currentBinding(var15);
                try {
                    module0580.$g4361$.bind((SubLObject)module0770.NIL, var15);
                    var15.resetMultipleValues();
                    final SubLObject var18_21 = module0580.$g4362$.currentBinding(var15);
                    try {
                        module0580.$g4362$.bind(module0580.f35560(), var15);
                        final SubLObject var25 = var15.secondMultipleValue();
                        var15.resetMultipleValues();
                        try {
                            var15.resetMultipleValues();
                            final SubLObject var18_22 = module0580.$g4358$.currentBinding(var15);
                            try {
                                module0580.$g4358$.bind(module0580.f35544(), var15);
                                final SubLObject var26 = var15.secondMultipleValue();
                                var15.resetMultipleValues();
                                final SubLObject var18_23 = module0580.$g4359$.currentBinding(var15);
                                try {
                                    module0580.$g4359$.bind(module0580.f35545(), var15);
                                    final SubLObject var27 = module0580.$g4358$.getDynamicValue(var15);
                                    final SubLObject var18_24 = module0034.$g879$.currentBinding(var15);
                                    try {
                                        module0034.$g879$.bind(var27, var15);
                                        SubLObject var28 = (SubLObject)module0770.NIL;
                                        if (module0770.NIL != var27 && module0770.NIL == module0034.f1842(var27)) {
                                            var28 = module0034.f1869(var27);
                                            final SubLObject var29 = Threads.current_process();
                                            if (module0770.NIL == var28) {
                                                module0034.f1873(var27, var29);
                                            }
                                            else if (!var28.eql(var29)) {
                                                Errors.error((SubLObject)module0770.$ic15$);
                                            }
                                        }
                                        try {
                                            final SubLObject var18_25 = module0579.$g4287$.currentBinding(var15);
                                            final SubLObject var19_31 = module0579.$g4320$.currentBinding(var15);
                                            try {
                                                module0579.$g4287$.bind(var14, var15);
                                                module0579.$g4320$.bind((SubLObject)ConsesLow.cons(module0751.f46611(var1), module0579.$g4320$.getDynamicValue(var15)), var15);
                                                if (module0770.$ic0$ == var2) {
                                                    var2 = module0751.f47142(var1, (SubLObject)module0770.$ic16$, var4, var5);
                                                }
                                                final SubLObject var30 = module0580.f35627();
                                                final SubLObject var18_26 = module0580.$g4375$.currentBinding(var15);
                                                final SubLObject var19_32 = module0580.$g4377$.currentBinding(var15);
                                                try {
                                                    module0580.$g4375$.bind((module0770.NIL != var30) ? module0077.f5313(Symbols.symbol_function((SubLObject)module0770.EQUAL), module0580.f35624()) : module0580.$g4375$.getDynamicValue(var15), var15);
                                                    module0580.$g4377$.bind((SubLObject)module0770.T, var15);
                                                    for (SubLObject var31 = (SubLObject)module0770.NIL, var32 = (SubLObject)module0770.NIL; module0770.NIL != var31 || module0770.NIL == var32; var32 = (SubLObject)module0770.T) {
                                                        if (module0770.NIL != var31) {
                                                            module0580.f35629(var31);
                                                            var31 = (SubLObject)module0770.NIL;
                                                        }
                                                        try {
                                                            var15.throwStack.push(module0770.$ic17$);
                                                            final SubLObject var18_27 = module0580.$g4363$.currentBinding(var15);
                                                            final SubLObject var19_33 = module0580.$g4366$.currentBinding(var15);
                                                            final SubLObject var33 = module0580.$g4364$.currentBinding(var15);
                                                            try {
                                                                module0580.$g4363$.bind(module0054.f3968(), var15);
                                                                module0580.$g4366$.bind(module0580.f35568(), var15);
                                                                module0580.$g4364$.bind((SubLObject)module0770.T, var15);
                                                                try {
                                                                    final SubLObject var34 = module0139.$g1630$.getDynamicValue(var15);
                                                                    final SubLObject var18_28 = module0139.$g1631$.currentBinding(var15);
                                                                    final SubLObject var19_34 = module0139.$g1632$.currentBinding(var15);
                                                                    final SubLObject var39_43 = module0139.$g1630$.currentBinding(var15);
                                                                    try {
                                                                        module0139.$g1631$.bind(module0139.f9015(var34, module0770.$g6151$.getGlobalValue()), var15);
                                                                        module0139.$g1632$.bind(module0139.f9016(var34), var15);
                                                                        module0139.$g1630$.bind((SubLObject)module0770.T, var15);
                                                                        if (module0770.NIL != var3) {
                                                                            final SubLObject var35 = Sequences.cconcatenate((SubLObject)module0770.$ic18$, new SubLObject[] { module0006.f205((SubLObject)module0770.ONE_INTEGER), module0770.$ic19$, module0006.f203((SubLObject)module0770.$ic20$) });
                                                                            module0578.f35476(var35, (SubLObject)ConsesLow.list(var3));
                                                                        }
                                                                        var1 = module0751.f46816(var1);
                                                                        var1 = module0751.f46740(var1);
                                                                        final SubLObject var18_29 = module0579.$g4260$.currentBinding(var15);
                                                                        final SubLObject var19_35 = module0579.$g4262$.currentBinding(var15);
                                                                        try {
                                                                            module0579.$g4260$.bind(var4, var15);
                                                                            module0579.$g4262$.bind(var5, var15);
                                                                            final SubLObject var36 = module0756.f47463(var1, module0751.f47200(), (SubLObject)module0770.T);
                                                                            if (module0770.NIL != module0756.f47497(var36, (SubLObject)module0770.UNPROVIDED)) {
                                                                                final SubLObject var18_30 = module0579.$g4259$.currentBinding(var15);
                                                                                final SubLObject var19_36 = module0579.$g4322$.currentBinding(var15);
                                                                                try {
                                                                                    module0579.$g4259$.bind(var6, var15);
                                                                                    module0579.$g4322$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0770.NIL != module0579.$g4322$.getDynamicValue(var15) && module0770.NIL == f49053(var1)), var15);
                                                                                    final SubLObject var37 = module0751.f47099(var2, module0756.f47488(var36, (SubLObject)module0770.UNPROVIDED), (SubLObject)module0770.UNPROVIDED);
                                                                                    module0756.f47784(var36, var37, (SubLObject)module0770.UNPROVIDED);
                                                                                    module0756.f47527(var36, var8);
                                                                                    var15.resetMultipleValues();
                                                                                    final SubLObject var51_52 = f49054(var36, var7);
                                                                                    final SubLObject var53_54 = var15.secondMultipleValue();
                                                                                    final SubLObject var55_56 = var15.thirdMultipleValue();
                                                                                    final SubLObject var57_58 = var15.fourthMultipleValue();
                                                                                    var15.resetMultipleValues();
                                                                                    var18 = var51_52;
                                                                                    var19 = var53_54;
                                                                                    var20 = var55_56;
                                                                                    var21 = var57_58;
                                                                                    var22 = module0756.f47627(var36);
                                                                                }
                                                                                finally {
                                                                                    module0579.$g4322$.rebind(var19_36, var15);
                                                                                    module0579.$g4259$.rebind(var18_30, var15);
                                                                                }
                                                                            }
                                                                        }
                                                                        finally {
                                                                            module0579.$g4262$.rebind(var19_35, var15);
                                                                            module0579.$g4260$.rebind(var18_29, var15);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        module0139.$g1630$.rebind(var39_43, var15);
                                                                        module0139.$g1632$.rebind(var19_34, var15);
                                                                        module0139.$g1631$.rebind(var18_28, var15);
                                                                    }
                                                                }
                                                                finally {
                                                                    final SubLObject var18_31 = Threads.$is_thread_performing_cleanupP$.currentBinding(var15);
                                                                    try {
                                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var15);
                                                                        module0580.f35566();
                                                                    }
                                                                    finally {
                                                                        Threads.$is_thread_performing_cleanupP$.rebind(var18_31, var15);
                                                                    }
                                                                }
                                                            }
                                                            finally {
                                                                module0580.$g4364$.rebind(var33, var15);
                                                                module0580.$g4366$.rebind(var19_33, var15);
                                                                module0580.$g4363$.rebind(var18_27, var15);
                                                            }
                                                        }
                                                        catch (Throwable var38) {
                                                            var31 = Errors.handleThrowable(var38, (SubLObject)module0770.$ic17$);
                                                        }
                                                        finally {
                                                            var15.throwStack.pop();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0580.$g4377$.rebind(var19_32, var15);
                                                    module0580.$g4375$.rebind(var18_26, var15);
                                                }
                                            }
                                            finally {
                                                module0579.$g4320$.rebind(var19_31, var15);
                                                module0579.$g4287$.rebind(var18_25, var15);
                                            }
                                        }
                                        finally {
                                            final SubLObject var18_32 = Threads.$is_thread_performing_cleanupP$.currentBinding(var15);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var15);
                                                if (module0770.NIL != var27 && module0770.NIL == var28) {
                                                    module0034.f1873(var27, (SubLObject)module0770.NIL);
                                                }
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var18_32, var15);
                                            }
                                        }
                                    }
                                    finally {
                                        module0034.$g879$.rebind(var18_24, var15);
                                    }
                                }
                                finally {
                                    module0580.$g4359$.rebind(var18_23, var15);
                                }
                                if (var26 == module0770.$ic21$ && module0770.NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var15))) {
                                    module0034.f1891(module0580.$g4358$.getDynamicValue(var15));
                                }
                            }
                            finally {
                                module0580.$g4358$.rebind(var18_22, var15);
                            }
                        }
                        finally {
                            final SubLObject var18_33 = Threads.$is_thread_performing_cleanupP$.currentBinding(var15);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var15);
                                if (module0770.NIL == var25) {
                                    module0580.f35554(module0580.$g4362$.getDynamicValue(var15));
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var18_33, var15);
                            }
                        }
                    }
                    finally {
                        module0580.$g4362$.rebind(var18_21, var15);
                    }
                }
                finally {
                    module0580.$g4361$.rebind(var18_20, var15);
                }
            }
            else {
                try {
                    var15.throwStack.push(module0003.$g3$.getGlobalValue());
                    final SubLObject var18_34 = Errors.$error_handler$.currentBinding(var15);
                    try {
                        Errors.$error_handler$.bind((SubLObject)module0770.$ic22$, var15);
                        try {
                            final SubLObject var18_35 = module0580.$g4361$.currentBinding(var15);
                            try {
                                module0580.$g4361$.bind((SubLObject)module0770.NIL, var15);
                                var15.resetMultipleValues();
                                final SubLObject var18_36 = module0580.$g4362$.currentBinding(var15);
                                try {
                                    module0580.$g4362$.bind(module0580.f35560(), var15);
                                    final SubLObject var39 = var15.secondMultipleValue();
                                    var15.resetMultipleValues();
                                    try {
                                        var15.resetMultipleValues();
                                        final SubLObject var18_37 = module0580.$g4358$.currentBinding(var15);
                                        try {
                                            module0580.$g4358$.bind(module0580.f35544(), var15);
                                            final SubLObject var40 = var15.secondMultipleValue();
                                            var15.resetMultipleValues();
                                            final SubLObject var18_38 = module0580.$g4359$.currentBinding(var15);
                                            try {
                                                module0580.$g4359$.bind(module0580.f35545(), var15);
                                                final SubLObject var41 = module0580.$g4358$.getDynamicValue(var15);
                                                final SubLObject var18_39 = module0034.$g879$.currentBinding(var15);
                                                try {
                                                    module0034.$g879$.bind(var41, var15);
                                                    SubLObject var42 = (SubLObject)module0770.NIL;
                                                    if (module0770.NIL != var41 && module0770.NIL == module0034.f1842(var41)) {
                                                        var42 = module0034.f1869(var41);
                                                        final SubLObject var43 = Threads.current_process();
                                                        if (module0770.NIL == var42) {
                                                            module0034.f1873(var41, var43);
                                                        }
                                                        else if (!var42.eql(var43)) {
                                                            Errors.error((SubLObject)module0770.$ic15$);
                                                        }
                                                    }
                                                    try {
                                                        final SubLObject var18_40 = module0579.$g4287$.currentBinding(var15);
                                                        final SubLObject var19_37 = module0579.$g4320$.currentBinding(var15);
                                                        try {
                                                            module0579.$g4287$.bind(var14, var15);
                                                            module0579.$g4320$.bind((SubLObject)ConsesLow.cons(module0751.f46611(var1), module0579.$g4320$.getDynamicValue(var15)), var15);
                                                            if (module0770.$ic0$ == var2) {
                                                                var2 = module0751.f47142(var1, (SubLObject)module0770.$ic16$, var4, var5);
                                                            }
                                                            final SubLObject var44 = module0580.f35627();
                                                            final SubLObject var18_41 = module0580.$g4375$.currentBinding(var15);
                                                            final SubLObject var19_38 = module0580.$g4377$.currentBinding(var15);
                                                            try {
                                                                module0580.$g4375$.bind((module0770.NIL != var44) ? module0077.f5313(Symbols.symbol_function((SubLObject)module0770.EQUAL), module0580.f35624()) : module0580.$g4375$.getDynamicValue(var15), var15);
                                                                module0580.$g4377$.bind((SubLObject)module0770.T, var15);
                                                                for (SubLObject var45 = (SubLObject)module0770.NIL, var46 = (SubLObject)module0770.NIL; module0770.NIL != var45 || module0770.NIL == var46; var46 = (SubLObject)module0770.T) {
                                                                    if (module0770.NIL != var45) {
                                                                        module0580.f35629(var45);
                                                                        var45 = (SubLObject)module0770.NIL;
                                                                    }
                                                                    try {
                                                                        var15.throwStack.push(module0770.$ic17$);
                                                                        final SubLObject var18_42 = module0580.$g4363$.currentBinding(var15);
                                                                        final SubLObject var19_39 = module0580.$g4366$.currentBinding(var15);
                                                                        final SubLObject var47 = module0580.$g4364$.currentBinding(var15);
                                                                        try {
                                                                            module0580.$g4363$.bind(module0054.f3968(), var15);
                                                                            module0580.$g4366$.bind(module0580.f35568(), var15);
                                                                            module0580.$g4364$.bind((SubLObject)module0770.T, var15);
                                                                            try {
                                                                                final SubLObject var48 = module0139.$g1630$.getDynamicValue(var15);
                                                                                final SubLObject var18_43 = module0139.$g1631$.currentBinding(var15);
                                                                                final SubLObject var19_40 = module0139.$g1632$.currentBinding(var15);
                                                                                final SubLObject var39_44 = module0139.$g1630$.currentBinding(var15);
                                                                                try {
                                                                                    module0139.$g1631$.bind(module0139.f9015(var48, module0770.$g6151$.getGlobalValue()), var15);
                                                                                    module0139.$g1632$.bind(module0139.f9016(var48), var15);
                                                                                    module0139.$g1630$.bind((SubLObject)module0770.T, var15);
                                                                                    if (module0770.NIL != var3) {
                                                                                        final SubLObject var49 = Sequences.cconcatenate((SubLObject)module0770.$ic18$, new SubLObject[] { module0006.f205((SubLObject)module0770.ONE_INTEGER), module0770.$ic19$, module0006.f203((SubLObject)module0770.$ic20$) });
                                                                                        module0578.f35476(var49, (SubLObject)ConsesLow.list(var3));
                                                                                    }
                                                                                    var1 = module0751.f46816(var1);
                                                                                    var1 = module0751.f46740(var1);
                                                                                    final SubLObject var18_44 = module0579.$g4260$.currentBinding(var15);
                                                                                    final SubLObject var19_41 = module0579.$g4262$.currentBinding(var15);
                                                                                    try {
                                                                                        module0579.$g4260$.bind(var4, var15);
                                                                                        module0579.$g4262$.bind(var5, var15);
                                                                                        final SubLObject var50 = module0756.f47463(var1, module0751.f47200(), (SubLObject)module0770.T);
                                                                                        if (module0770.NIL != module0756.f47497(var50, (SubLObject)module0770.UNPROVIDED)) {
                                                                                            final SubLObject var18_45 = module0579.$g4259$.currentBinding(var15);
                                                                                            final SubLObject var19_42 = module0579.$g4322$.currentBinding(var15);
                                                                                            try {
                                                                                                module0579.$g4259$.bind(var6, var15);
                                                                                                module0579.$g4322$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0770.NIL != module0579.$g4322$.getDynamicValue(var15) && module0770.NIL == f49053(var1)), var15);
                                                                                                final SubLObject var51 = module0751.f47099(var2, module0756.f47488(var50, (SubLObject)module0770.UNPROVIDED), (SubLObject)module0770.UNPROVIDED);
                                                                                                module0756.f47784(var50, var51, (SubLObject)module0770.UNPROVIDED);
                                                                                                module0756.f47527(var50, var8);
                                                                                                var15.resetMultipleValues();
                                                                                                final SubLObject var82_83 = f49054(var50, var7);
                                                                                                final SubLObject var84_85 = var15.secondMultipleValue();
                                                                                                final SubLObject var86_87 = var15.thirdMultipleValue();
                                                                                                final SubLObject var88_89 = var15.fourthMultipleValue();
                                                                                                var15.resetMultipleValues();
                                                                                                var18 = var82_83;
                                                                                                var19 = var84_85;
                                                                                                var20 = var86_87;
                                                                                                var21 = var88_89;
                                                                                                var22 = module0756.f47627(var50);
                                                                                            }
                                                                                            finally {
                                                                                                module0579.$g4322$.rebind(var19_42, var15);
                                                                                                module0579.$g4259$.rebind(var18_45, var15);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0579.$g4262$.rebind(var19_41, var15);
                                                                                        module0579.$g4260$.rebind(var18_44, var15);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0139.$g1630$.rebind(var39_44, var15);
                                                                                    module0139.$g1632$.rebind(var19_40, var15);
                                                                                    module0139.$g1631$.rebind(var18_43, var15);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                final SubLObject var18_46 = Threads.$is_thread_performing_cleanupP$.currentBinding(var15);
                                                                                try {
                                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var15);
                                                                                    module0580.f35566();
                                                                                }
                                                                                finally {
                                                                                    Threads.$is_thread_performing_cleanupP$.rebind(var18_46, var15);
                                                                                }
                                                                            }
                                                                        }
                                                                        finally {
                                                                            module0580.$g4364$.rebind(var47, var15);
                                                                            module0580.$g4366$.rebind(var19_39, var15);
                                                                            module0580.$g4363$.rebind(var18_42, var15);
                                                                        }
                                                                    }
                                                                    catch (Throwable var52) {
                                                                        var45 = Errors.handleThrowable(var52, (SubLObject)module0770.$ic17$);
                                                                    }
                                                                    finally {
                                                                        var15.throwStack.pop();
                                                                    }
                                                                }
                                                            }
                                                            finally {
                                                                module0580.$g4377$.rebind(var19_38, var15);
                                                                module0580.$g4375$.rebind(var18_41, var15);
                                                            }
                                                        }
                                                        finally {
                                                            module0579.$g4320$.rebind(var19_37, var15);
                                                            module0579.$g4287$.rebind(var18_40, var15);
                                                        }
                                                    }
                                                    finally {
                                                        final SubLObject var18_47 = Threads.$is_thread_performing_cleanupP$.currentBinding(var15);
                                                        try {
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var15);
                                                            if (module0770.NIL != var41 && module0770.NIL == var42) {
                                                                module0034.f1873(var41, (SubLObject)module0770.NIL);
                                                            }
                                                        }
                                                        finally {
                                                            Threads.$is_thread_performing_cleanupP$.rebind(var18_47, var15);
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0034.$g879$.rebind(var18_39, var15);
                                                }
                                            }
                                            finally {
                                                module0580.$g4359$.rebind(var18_38, var15);
                                            }
                                            if (var40 == module0770.$ic21$ && module0770.NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var15))) {
                                                module0034.f1891(module0580.$g4358$.getDynamicValue(var15));
                                            }
                                        }
                                        finally {
                                            module0580.$g4358$.rebind(var18_37, var15);
                                        }
                                    }
                                    finally {
                                        final SubLObject var18_48 = Threads.$is_thread_performing_cleanupP$.currentBinding(var15);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var15);
                                            if (module0770.NIL == var39) {
                                                module0580.f35554(module0580.$g4362$.getDynamicValue(var15));
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var18_48, var15);
                                        }
                                    }
                                }
                                finally {
                                    module0580.$g4362$.rebind(var18_36, var15);
                                }
                            }
                            finally {
                                module0580.$g4361$.rebind(var18_35, var15);
                            }
                        }
                        catch (Throwable var53) {
                            Errors.handleThrowable(var53, (SubLObject)module0770.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(var18_34, var15);
                    }
                }
                catch (Throwable var54) {
                    var16 = Errors.handleThrowable(var54, module0003.$g3$.getGlobalValue());
                }
                finally {
                    var15.throwStack.pop();
                }
                if (var16.isString() && module0770.NIL == module0578.f35477()) {
                    Errors.warn(Sequences.cconcatenate(module0752.f47234(var16), (SubLObject)module0770.$ic23$), module0579.f35508());
                }
            }
        }
        finally {
            module0578.$g4234$.rebind(var24, var15);
            Errors.$continue_cerrorP$.rebind(var23, var15);
        }
        if (module0770.NIL != var16) {
            var18 = module0038.f2890(var1);
        }
        SubLObject var55 = (SubLObject)module0770.NIL;
        var15.resetMultipleValues();
        final SubLObject var95_96 = f49055(var21, var17);
        final SubLObject var97_98 = var15.secondMultipleValue();
        var15.resetMultipleValues();
        var21 = var95_96;
        var55 = var97_98;
        if (module0770.NIL != var55) {
            var18 = module0756.f47713(var21, Equality.eq(var6, (SubLObject)module0770.$ic24$));
        }
        var18 = module0581.f35681(var18, var6);
        return Values.values(var18, var19, var20, var21, var22);
    }
    
    public static SubLObject f49051(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4, final SubLObject var5, final SubLObject var6, final SubLObject var7, final SubLObject var8, final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = module0034.$g879$.getDynamicValue(var15);
        SubLObject var17 = (SubLObject)module0770.NIL;
        if (module0770.NIL == var16) {
            return f49052(var1, var2, var3, var4, var5, var6, var7, var8, var14);
        }
        var17 = module0034.f1857(var16, (SubLObject)module0770.$ic14$, (SubLObject)module0770.UNPROVIDED);
        if (module0770.NIL == var17) {
            var17 = module0034.f1807(module0034.f1842(var16), (SubLObject)module0770.$ic14$, (SubLObject)module0770.NINE_INTEGER, (SubLObject)module0770.$ic25$, (SubLObject)module0770.EQUAL, (SubLObject)module0770.UNPROVIDED);
            module0034.f1860(var16, (SubLObject)module0770.$ic14$, var17);
        }
        final SubLObject var18 = module0034.f1775(var1, var2, var3, var4, var5, var6, var7, var8, var14);
        final SubLObject var19 = module0034.f1814(var17, var18, (SubLObject)module0770.UNPROVIDED);
        if (var19 != module0770.$ic26$) {
            SubLObject var20 = var19;
            SubLObject var21 = (SubLObject)module0770.NIL;
            var21 = var20.first();
            while (module0770.NIL != var20) {
                SubLObject var22 = var21.first();
                final SubLObject var23 = conses_high.second(var21);
                if (var1.equal(var22.first())) {
                    var22 = var22.rest();
                    if (var2.equal(var22.first())) {
                        var22 = var22.rest();
                        if (var3.equal(var22.first())) {
                            var22 = var22.rest();
                            if (var4.equal(var22.first())) {
                                var22 = var22.rest();
                                if (var5.equal(var22.first())) {
                                    var22 = var22.rest();
                                    if (var6.equal(var22.first())) {
                                        var22 = var22.rest();
                                        if (var7.equal(var22.first())) {
                                            var22 = var22.rest();
                                            if (var8.equal(var22.first())) {
                                                var22 = var22.rest();
                                                if (module0770.NIL != var22 && module0770.NIL == var22.rest() && var14.equal(var22.first())) {
                                                    return module0034.f1959(var23);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var20 = var20.rest();
                var21 = var20.first();
            }
        }
        final SubLObject var24 = Values.arg2(var15.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f49052(var1, var2, var3, var4, var5, var6, var7, var8, var14)));
        module0034.f1836(var17, var18, var19, var24, (SubLObject)ConsesLow.list(new SubLObject[] { var1, var2, var3, var4, var5, var6, var7, var8, var14 }));
        return module0034.f1959(var24);
    }
    
    public static SubLObject f49056(final SubLObject var108, SubLObject var4, SubLObject var5) {
        if (var4 == module0770.UNPROVIDED) {
            var4 = module0579.$g4260$.getDynamicValue();
        }
        if (var5 == module0770.UNPROVIDED) {
            var5 = module0579.$g4262$.getDynamicValue();
        }
        assert module0770.NIL != module0762.f48210(var108) : var108;
        return f49049(var108, (SubLObject)module0770.$ic28$, (SubLObject)module0770.NIL, var4, var5, (SubLObject)module0770.$ic1$, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED);
    }
    
    public static SubLObject f49057(final SubLObject var108, SubLObject var4, SubLObject var5) {
        if (var4 == module0770.UNPROVIDED) {
            var4 = module0579.$g4260$.getDynamicValue();
        }
        if (var5 == module0770.UNPROVIDED) {
            var5 = module0579.$g4262$.getDynamicValue();
        }
        final SubLThread var109 = SubLProcess.currentSubLThread();
        SubLObject var110 = (SubLObject)module0770.NIL;
        SubLObject var111 = (SubLObject)module0770.NIL;
        final SubLObject var112 = module0578.$g4233$.currentBinding(var109);
        try {
            module0578.$g4233$.bind((SubLObject)module0770.T, var109);
            try {
                var109.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var18_110 = Errors.$error_handler$.currentBinding(var109);
                try {
                    Errors.$error_handler$.bind((SubLObject)module0770.$ic22$, var109);
                    try {
                        final SubLObject var18_111 = module0579.$g4287$.currentBinding(var109);
                        try {
                            module0579.$g4287$.bind((SubLObject)module0770.TWO_INTEGER, var109);
                            var111 = f49056(var108, var4, var5);
                        }
                        finally {
                            module0579.$g4287$.rebind(var18_111, var109);
                        }
                    }
                    catch (Throwable var113) {
                        Errors.handleThrowable(var113, (SubLObject)module0770.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var18_110, var109);
                }
            }
            catch (Throwable var114) {
                var110 = Errors.handleThrowable(var114, module0003.$g3$.getGlobalValue());
            }
            finally {
                var109.throwStack.pop();
            }
        }
        finally {
            module0578.$g4233$.rebind(var112, var109);
        }
        return Values.values(var111, var110);
    }
    
    public static SubLObject f49058(final SubLObject var1, SubLObject var2, SubLObject var112, SubLObject var4, SubLObject var5, SubLObject var6) {
        if (var2 == module0770.UNPROVIDED) {
            var2 = (SubLObject)module0770.$ic0$;
        }
        if (var112 == module0770.UNPROVIDED) {
            var112 = (SubLObject)module0770.$ic0$;
        }
        if (var4 == module0770.UNPROVIDED) {
            var4 = module0579.$g4260$.getDynamicValue();
        }
        if (var5 == module0770.UNPROVIDED) {
            var5 = module0579.$g4262$.getDynamicValue();
        }
        if (var6 == module0770.UNPROVIDED) {
            var6 = (SubLObject)module0770.$ic24$;
        }
        assert module0770.NIL != module0751.f46980(var2) : var2;
        assert module0770.NIL != f49059(var4) : var4;
        assert module0770.NIL != module0161.f10479(var5) : var5;
        return f49060(var1, var2, var112, var4, var5, var6);
    }
    
    public static SubLObject f49061(final SubLObject var1, SubLObject var113) {
        if (var113 == module0770.UNPROVIDED) {
            var113 = (SubLObject)module0770.$ic36$;
        }
        final SubLThread var114 = SubLProcess.currentSubLThread();
        enforceType(var1, module0770.$ic2$);
        SubLObject var115 = (SubLObject)module0770.NIL;
        SubLObject var116 = (SubLObject)module0770.NIL;
        if (module0770.NIL != module0173.f10955(var1)) {
            var114.resetMultipleValues();
            final SubLObject var117 = module0751.f46992(var1, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED);
            final SubLObject var118 = var114.secondMultipleValue();
            final SubLObject var119 = var114.thirdMultipleValue();
            var114.resetMultipleValues();
            if (var117.isString() && module0770.NIL == module0579.f35496(var119, (SubLObject)module0770.UNPROVIDED) && (module0770.NIL == module0751.f47107(var118) || module0770.NIL != module0751.f47007(module0745.f46233((SubLObject)module0770.UNPROVIDED), module0579.$g4260$.getDynamicValue(var114)))) {
                var115 = var117;
            }
        }
        if (!var115.isString()) {
            if (module0770.NIL != Symbols.fboundp(var113)) {
                final SubLObject var120 = module0579.$g4259$.currentBinding(var114);
                final SubLObject var121 = module0579.$g4287$.currentBinding(var114);
                try {
                    module0579.$g4259$.bind((SubLObject)module0770.$ic1$, var114);
                    module0579.$g4287$.bind(module0048.f3326(), var114);
                    var115 = Functions.funcall(var113, var1);
                }
                finally {
                    module0579.$g4287$.rebind(var121, var114);
                    module0579.$g4259$.rebind(var120, var114);
                }
            }
            else {
                Errors.error((SubLObject)module0770.$ic37$, var113);
            }
        }
        if (var115.isString()) {
            var116 = module0749.f46446(var115, (SubLObject)module0770.NIL, var1, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED);
        }
        else {
            Errors.error((SubLObject)module0770.$ic38$, var1, var113);
        }
        final SubLObject var120 = module0579.$g4259$.currentBinding(var114);
        try {
            module0579.$g4259$.bind((SubLObject)module0770.$ic24$, var114);
            module0756.f47719(var116, var1);
        }
        finally {
            module0579.$g4259$.rebind(var120, var114);
        }
        return (SubLObject)ConsesLow.list(module0751.f46953((SubLObject)ConsesLow.list(var116)), var1);
    }
    
    public static SubLObject f49062(final SubLObject var117, SubLObject var113) {
        if (var113 == module0770.UNPROVIDED) {
            var113 = (SubLObject)module0770.$ic39$;
        }
        final SubLThread var118 = SubLProcess.currentSubLThread();
        final SubLObject var119 = (SubLObject)module0770.NIL;
        final SubLObject var120 = module0077.f5313(Symbols.symbol_function((SubLObject)module0770.EQUALP), (SubLObject)module0770.UNPROVIDED);
        SubLObject var121 = (SubLObject)module0770.NIL;
        SubLObject var122 = (SubLObject)module0770.NIL;
        final SubLObject var123 = module0579.$g4237$.currentBinding(var118);
        try {
            module0579.$g4237$.bind((module0770.NIL != module0579.$g4237$.getDynamicValue(var118)) ? module0579.$g4237$.getDynamicValue(var118) : module0067.f4880(Symbols.symbol_function((SubLObject)module0770.EQUALP), (SubLObject)module0770.UNPROVIDED), var118);
            SubLObject var124 = (SubLObject)module0770.NIL;
            SubLObject var125 = (SubLObject)module0770.NIL;
            SubLObject var126 = (SubLObject)module0770.NIL;
            var124 = var117;
            var125 = var124.first();
            for (var126 = (SubLObject)module0770.ZERO_INTEGER; module0770.NIL == var119 && module0770.NIL != var124; var124 = var124.rest(), var125 = var124.first(), var126 = Numbers.add((SubLObject)module0770.ONE_INTEGER, var126)) {
                final SubLObject var127 = f49061(var125, var113).first();
                final SubLObject var128 = module0751.f46910(var127);
                if (module0770.NIL != module0077.f5320(var128, var120)) {
                    if (module0770.NIL != module0578.f35470((SubLObject)module0770.ONE_INTEGER)) {
                        PrintLow.format((SubLObject)module0770.T, (SubLObject)module0770.$ic40$, var127);
                    }
                    module0753.f47260(var128, var125);
                    SubLObject var125_126 = (SubLObject)module0770.NIL;
                    SubLObject var124_127 = (SubLObject)module0770.NIL;
                    SubLObject var129 = (SubLObject)module0770.NIL;
                    var125_126 = var121;
                    var124_127 = var125_126.first();
                    for (var129 = (SubLObject)module0770.ZERO_INTEGER; module0770.NIL != var125_126; var125_126 = var125_126.rest(), var124_127 = var125_126.first(), var129 = Numbers.add((SubLObject)module0770.ONE_INTEGER, var129)) {
                        if (module0751.f46910(var124_127).equalp(var128)) {
                            final SubLObject var130 = module0048.f_1_(Numbers.subtract(var126, var129));
                            final SubLObject var131 = ConsesLow.nth(var130, var117);
                            module0753.f47260(var128, var131);
                        }
                    }
                }
                else {
                    module0077.f5326(var128, var120);
                }
                var121 = (SubLObject)ConsesLow.cons(var127, var121);
            }
            if (module0770.NIL == var119) {
                SubLObject var132 = var121;
                SubLObject var133 = (SubLObject)module0770.NIL;
                var133 = var132.first();
                while (module0770.NIL != var132) {
                    if (module0770.NIL == module0753.f47261(module0751.f46910(var133))) {
                        var122 = (SubLObject)ConsesLow.cons(var133, var122);
                    }
                    else {
                        var122 = (SubLObject)ConsesLow.cons(module0753.f47280(var133, (SubLObject)module0770.$ic16$, (SubLObject)module0770.$ic0$, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED), var122);
                    }
                    var132 = var132.rest();
                    var133 = var132.first();
                }
            }
        }
        finally {
            module0579.$g4237$.rebind(var123, var118);
        }
        return var122;
    }
    
    public static SubLObject f49060(final SubLObject var1, SubLObject var2, SubLObject var112, SubLObject var4, SubLObject var5, SubLObject var6) {
        if (var2 == module0770.UNPROVIDED) {
            var2 = (SubLObject)module0770.$ic0$;
        }
        if (var112 == module0770.UNPROVIDED) {
            var112 = (SubLObject)module0770.$ic0$;
        }
        if (var4 == module0770.UNPROVIDED) {
            var4 = module0579.$g4260$.getDynamicValue();
        }
        if (var5 == module0770.UNPROVIDED) {
            var5 = module0579.$g4262$.getDynamicValue();
        }
        if (var6 == module0770.UNPROVIDED) {
            var6 = (SubLObject)module0770.$ic24$;
        }
        final SubLThread var113 = SubLProcess.currentSubLThread();
        if (module0770.$ic0$ == var2) {
            var2 = module0751.f47142(module0172.f10922(var1), var112, var4, var5);
        }
        SubLObject var114 = (SubLObject)module0770.NIL;
        SubLObject var115 = (SubLObject)module0770.NIL;
        SubLObject var116 = (SubLObject)module0770.NIL;
        SubLObject var117 = (SubLObject)module0770.NIL;
        final SubLObject var118 = Errors.$continue_cerrorP$.currentBinding(var113);
        final SubLObject var119 = module0578.$g4234$.currentBinding(var113);
        try {
            Errors.$continue_cerrorP$.bind((SubLObject)module0770.NIL, var113);
            module0578.$g4234$.bind((SubLObject)module0770.T, var113);
            if (module0770.NIL != module0578.f35473()) {
                var113.resetMultipleValues();
                final SubLObject var120 = f49063(module0172.f10922(var1), var2, var4, var5, var6, var112);
                final SubLObject var121 = var113.secondMultipleValue();
                final SubLObject var122 = var113.thirdMultipleValue();
                var113.resetMultipleValues();
                var117 = var122;
                var116 = module0035.sublisp_boolean(Sequences.find_if((SubLObject)module0770.$ic41$, var117, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED));
                final SubLObject var18_135 = module0579.$g4305$.currentBinding(var113);
                try {
                    module0579.$g4305$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0770.NIL != module0579.f35497() && module0770.NIL == var116), var113);
                    var114 = (SubLObject)((module0770.NIL != var120) ? module0751.f46953(var120) : module0770.NIL);
                }
                finally {
                    module0579.$g4305$.rebind(var18_135, var113);
                }
            }
            else {
                try {
                    var113.throwStack.push(module0003.$g3$.getGlobalValue());
                    final SubLObject var18_136 = Errors.$error_handler$.currentBinding(var113);
                    try {
                        Errors.$error_handler$.bind((SubLObject)module0770.$ic22$, var113);
                        try {
                            var113.resetMultipleValues();
                            final SubLObject var123 = f49063(module0172.f10922(var1), var2, var4, var5, var6, var112);
                            final SubLObject var124 = var113.secondMultipleValue();
                            final SubLObject var125 = var113.thirdMultipleValue();
                            var113.resetMultipleValues();
                            var117 = var125;
                            var116 = module0035.sublisp_boolean(Sequences.find_if((SubLObject)module0770.$ic41$, var117, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED));
                            final SubLObject var18_137 = module0579.$g4305$.currentBinding(var113);
                            try {
                                module0579.$g4305$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0770.NIL != module0579.f35497() && module0770.NIL == var116), var113);
                                var114 = (SubLObject)((module0770.NIL != var123) ? module0751.f46953(var123) : module0770.NIL);
                            }
                            finally {
                                module0579.$g4305$.rebind(var18_137, var113);
                            }
                        }
                        catch (Throwable var126) {
                            Errors.handleThrowable(var126, (SubLObject)module0770.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(var18_136, var113);
                    }
                }
                catch (Throwable var127) {
                    var115 = Errors.handleThrowable(var127, module0003.$g3$.getGlobalValue());
                }
                finally {
                    var113.throwStack.pop();
                }
                if (var115.isString() && module0770.NIL == module0578.f35477()) {
                    Errors.warn(Sequences.cconcatenate(module0752.f47234(var115), (SubLObject)module0770.$ic23$), module0579.f35508());
                }
            }
        }
        finally {
            module0578.$g4234$.rebind(var119, var113);
            Errors.$continue_cerrorP$.rebind(var118, var113);
        }
        if (module0770.NIL != var115) {
            Errors.error(var115);
        }
        return Values.values(var114, var116, var117);
    }
    
    public static SubLObject f49064(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0770.NIL != module0174.f11035(var1) && module0770.NIL != module0178.f11284(var1) && module0178.f11333(var1).eql(module0770.$ic42$));
    }
    
    public static SubLObject f49054(final SubLObject var47, final SubLObject var7) {
        module0751.f46741(var47);
        final SubLObject var48 = module0580.f35634(var47);
        try {
            f49065(var47, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED);
        }
        finally {
            final SubLObject var49 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0770.T);
                module0580.f35635(var47, var48, (SubLObject)module0770.UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var49);
            }
        }
        if (module0770.NIL != var7) {
            module0579.$g4317$.setDynamicValue(var47);
        }
        SubLObject var50 = (SubLObject)module0770.NIL;
        SubLObject var51 = (SubLObject)module0770.NIL;
        SubLObject var52 = (SubLObject)module0770.NIL;
        SubLObject var53 = (SubLObject)module0770.NIL;
        if (module0770.NIL != module0756.f47479(var47)) {
            var50 = module0756.f47480(var47, (SubLObject)module0770.UNPROVIDED);
            var51 = module0756.f47691(var47);
            var52 = module0756.f47690(var47);
            var53 = module0756.f47467(var47);
        }
        return Values.values(var50, var51, var52, var53);
    }
    
    public static SubLObject f49066(final SubLObject var1, SubLObject var112, SubLObject var2, SubLObject var4, SubLObject var5, SubLObject var6) {
        if (var112 == module0770.UNPROVIDED) {
            var112 = (SubLObject)module0770.$ic0$;
        }
        if (var2 == module0770.UNPROVIDED) {
            var2 = (SubLObject)module0770.$ic0$;
        }
        if (var4 == module0770.UNPROVIDED) {
            var4 = module0579.$g4260$.getDynamicValue();
        }
        if (var5 == module0770.UNPROVIDED) {
            var5 = module0579.$g4262$.getDynamicValue();
        }
        if (var6 == module0770.UNPROVIDED) {
            var6 = (SubLObject)module0770.$ic1$;
        }
        final SubLThread var113 = SubLProcess.currentSubLThread();
        if (module0770.$ic0$ == var112) {
            var112 = module0751.f47036(var1);
        }
        if (module0770.$ic0$ == var2) {
            var2 = module0751.f47142(var1, var112, var4, var5);
        }
        SubLObject var114 = (SubLObject)module0770.NIL;
        SubLObject var115 = (SubLObject)module0770.NIL;
        SubLObject var116 = (SubLObject)module0770.NIL;
        SubLObject var117 = (SubLObject)module0770.NIL;
        final SubLObject var118 = module0579.$g4236$.currentBinding(var113);
        try {
            module0579.$g4236$.bind((SubLObject)module0770.$ic43$, var113);
            var113.resetMultipleValues();
            final SubLObject var140_141 = f49067(var1, var112, var2, var4, var5, var6, (SubLObject)module0770.UNPROVIDED);
            final SubLObject var142_143 = var113.secondMultipleValue();
            final SubLObject var144_145 = var113.thirdMultipleValue();
            final SubLObject var146_147 = var113.fourthMultipleValue();
            var113.resetMultipleValues();
            var114 = var140_141;
            var115 = var142_143;
            var116 = var144_145;
            var117 = var146_147;
        }
        finally {
            module0579.$g4236$.rebind(var118, var113);
        }
        return Values.values(var114, var115, var116, var117);
    }
    
    public static SubLObject f49068(final SubLObject var117, SubLObject var112, SubLObject var2, SubLObject var4, SubLObject var5, SubLObject var6, SubLObject var148) {
        if (var112 == module0770.UNPROVIDED) {
            var112 = (SubLObject)module0770.$ic0$;
        }
        if (var2 == module0770.UNPROVIDED) {
            var2 = (SubLObject)module0770.$ic0$;
        }
        if (var4 == module0770.UNPROVIDED) {
            var4 = module0579.$g4260$.getDynamicValue();
        }
        if (var5 == module0770.UNPROVIDED) {
            var5 = module0579.$g4262$.getDynamicValue();
        }
        if (var6 == module0770.UNPROVIDED) {
            var6 = (SubLObject)module0770.$ic1$;
        }
        if (var148 == module0770.UNPROVIDED) {
            var148 = (SubLObject)module0770.NIL;
        }
        final SubLThread var149 = SubLProcess.currentSubLThread();
        assert module0770.NIL != module0038.f2614(var148) : var148;
        if (module0770.$ic0$ == var112) {
            var112 = module0751.f47036(var117.first());
        }
        if (module0770.$ic0$ == var2) {
            var2 = module0751.f47142(var117.first(), var112, var4, var5);
        }
        SubLObject var150 = (SubLObject)module0770.NIL;
        final SubLObject var151 = module0580.$g4361$.currentBinding(var149);
        try {
            module0580.$g4361$.bind((SubLObject)module0770.NIL, var149);
            var149.resetMultipleValues();
            final SubLObject var18_150 = module0580.$g4362$.currentBinding(var149);
            try {
                module0580.$g4362$.bind(module0580.f35560(), var149);
                final SubLObject var152 = var149.secondMultipleValue();
                var149.resetMultipleValues();
                try {
                    var149.resetMultipleValues();
                    final SubLObject var18_151 = module0580.$g4358$.currentBinding(var149);
                    try {
                        module0580.$g4358$.bind(module0580.f35544(), var149);
                        final SubLObject var153 = var149.secondMultipleValue();
                        var149.resetMultipleValues();
                        final SubLObject var18_152 = module0580.$g4359$.currentBinding(var149);
                        try {
                            module0580.$g4359$.bind(module0580.f35545(), var149);
                            final SubLObject var154 = module0580.$g4358$.getDynamicValue(var149);
                            final SubLObject var18_153 = module0034.$g879$.currentBinding(var149);
                            try {
                                module0034.$g879$.bind(var154, var149);
                                SubLObject var155 = (SubLObject)module0770.NIL;
                                if (module0770.NIL != var154 && module0770.NIL == module0034.f1842(var154)) {
                                    var155 = module0034.f1869(var154);
                                    final SubLObject var156 = Threads.current_process();
                                    if (module0770.NIL == var155) {
                                        module0034.f1873(var154, var156);
                                    }
                                    else if (!var155.eql(var156)) {
                                        Errors.error((SubLObject)module0770.$ic15$);
                                    }
                                }
                                try {
                                    var150 = f49069(var117, var112, var2, var4, var5, var6, (SubLObject)module0770.$ic45$, var148);
                                }
                                finally {
                                    final SubLObject var18_154 = Threads.$is_thread_performing_cleanupP$.currentBinding(var149);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var149);
                                        if (module0770.NIL != var154 && module0770.NIL == var155) {
                                            module0034.f1873(var154, (SubLObject)module0770.NIL);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var18_154, var149);
                                    }
                                }
                            }
                            finally {
                                module0034.$g879$.rebind(var18_153, var149);
                            }
                        }
                        finally {
                            module0580.$g4359$.rebind(var18_152, var149);
                        }
                        if (var153 == module0770.$ic21$ && module0770.NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var149))) {
                            module0034.f1891(module0580.$g4358$.getDynamicValue(var149));
                        }
                    }
                    finally {
                        module0580.$g4358$.rebind(var18_151, var149);
                    }
                }
                finally {
                    final SubLObject var18_155 = Threads.$is_thread_performing_cleanupP$.currentBinding(var149);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var149);
                        if (module0770.NIL == var152) {
                            module0580.f35554(module0580.$g4362$.getDynamicValue(var149));
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var18_155, var149);
                    }
                }
            }
            finally {
                module0580.$g4362$.rebind(var18_150, var149);
            }
        }
        finally {
            module0580.$g4361$.rebind(var151, var149);
        }
        return var150;
    }
    
    public static SubLObject f49070(final SubLObject var156) {
        return module0004.f104(var156, (SubLObject)module0770.$ic46$, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED);
    }
    
    public static SubLObject f49071(final SubLObject var117, SubLObject var112, SubLObject var2, SubLObject var4, SubLObject var5, SubLObject var148, SubLObject var157) {
        if (var112 == module0770.UNPROVIDED) {
            var112 = (SubLObject)module0770.$ic0$;
        }
        if (var2 == module0770.UNPROVIDED) {
            var2 = (SubLObject)module0770.$ic0$;
        }
        if (var4 == module0770.UNPROVIDED) {
            var4 = module0579.$g4260$.getDynamicValue();
        }
        if (var5 == module0770.UNPROVIDED) {
            var5 = module0579.$g4262$.getDynamicValue();
        }
        if (var148 == module0770.UNPROVIDED) {
            var148 = (SubLObject)module0770.NIL;
        }
        if (var157 == module0770.UNPROVIDED) {
            var157 = (SubLObject)module0770.$ic47$;
        }
        final SubLThread var158 = SubLProcess.currentSubLThread();
        assert module0770.NIL != Types.listp(var117) : var117;
        assert module0770.NIL != Types.keywordp(var112) : var112;
        assert module0770.NIL != module0751.f46980(var2) : var2;
        assert module0770.NIL != module0161.f10499(var4) : var4;
        assert module0770.NIL != module0161.f10499(var5) : var5;
        assert module0770.NIL != module0038.f2614(var148) : var148;
        assert module0770.NIL != f49070(var157) : var157;
        SubLObject var159 = (SubLObject)module0770.NIL;
        final SubLObject var160 = module0580.$g4361$.currentBinding(var158);
        try {
            module0580.$g4361$.bind((SubLObject)module0770.NIL, var158);
            var158.resetMultipleValues();
            final SubLObject var18_158 = module0580.$g4362$.currentBinding(var158);
            try {
                module0580.$g4362$.bind(module0580.f35560(), var158);
                final SubLObject var161 = var158.secondMultipleValue();
                var158.resetMultipleValues();
                try {
                    var158.resetMultipleValues();
                    final SubLObject var18_159 = module0580.$g4358$.currentBinding(var158);
                    try {
                        module0580.$g4358$.bind(module0580.f35544(), var158);
                        final SubLObject var162 = var158.secondMultipleValue();
                        var158.resetMultipleValues();
                        final SubLObject var18_160 = module0580.$g4359$.currentBinding(var158);
                        try {
                            module0580.$g4359$.bind(module0580.f35545(), var158);
                            final SubLObject var163 = module0580.$g4358$.getDynamicValue(var158);
                            final SubLObject var18_161 = module0034.$g879$.currentBinding(var158);
                            try {
                                module0034.$g879$.bind(var163, var158);
                                SubLObject var164 = (SubLObject)module0770.NIL;
                                if (module0770.NIL != var163 && module0770.NIL == module0034.f1842(var163)) {
                                    var164 = module0034.f1869(var163);
                                    final SubLObject var165 = Threads.current_process();
                                    if (module0770.NIL == var164) {
                                        module0034.f1873(var163, var165);
                                    }
                                    else if (!var164.eql(var165)) {
                                        Errors.error((SubLObject)module0770.$ic15$);
                                    }
                                }
                                try {
                                    if (module0770.NIL != module0004.f104(var112, (SubLObject)module0770.$ic50$, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED) && module0770.NIL != module0004.f104(var157, (SubLObject)module0770.$ic51$, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED) && module0770.NIL != module0004.f104(var2, (SubLObject)module0770.$ic52$, Symbols.symbol_function((SubLObject)module0770.EQUAL), (SubLObject)module0770.UNPROVIDED)) {
                                        final SubLObject var166 = f49062(var117, (SubLObject)module0770.UNPROVIDED);
                                        if (var157 == module0770.$ic47$ || module0770.NIL == module0035.f2194(var166, (SubLObject)module0770.EQUAL, (SubLObject)module0770.$ic53$)) {
                                            var159 = var166;
                                        }
                                    }
                                }
                                finally {
                                    final SubLObject var18_162 = Threads.$is_thread_performing_cleanupP$.currentBinding(var158);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var158);
                                        if (module0770.NIL == var159) {
                                            if (module0770.$ic0$ == var2) {
                                                var2 = module0751.f47142(var117.first(), var112, var4, var5);
                                            }
                                            var2 = module0751.f47139(var2);
                                            var159 = f49069(var117, var112, var2, var4, var5, (SubLObject)module0770.$ic24$, (SubLObject)module0770.$ic54$, var148);
                                        }
                                        if (module0770.NIL != var163 && module0770.NIL == var164) {
                                            module0034.f1873(var163, (SubLObject)module0770.NIL);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var18_162, var158);
                                    }
                                }
                            }
                            finally {
                                module0034.$g879$.rebind(var18_161, var158);
                            }
                        }
                        finally {
                            module0580.$g4359$.rebind(var18_160, var158);
                        }
                        if (var162 == module0770.$ic21$ && module0770.NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var158))) {
                            module0034.f1891(module0580.$g4358$.getDynamicValue(var158));
                        }
                    }
                    finally {
                        module0580.$g4358$.rebind(var18_159, var158);
                    }
                }
                finally {
                    final SubLObject var18_163 = Threads.$is_thread_performing_cleanupP$.currentBinding(var158);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var158);
                        if (module0770.NIL == var161) {
                            module0580.f35554(module0580.$g4362$.getDynamicValue(var158));
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var18_163, var158);
                    }
                }
            }
            finally {
                module0580.$g4362$.rebind(var18_158, var158);
            }
        }
        finally {
            module0580.$g4361$.rebind(var160, var158);
        }
        return var159;
    }
    
    public static SubLObject f49072(final SubLObject var120, final SubLObject var117, SubLObject var164) {
        if (var164 == module0770.UNPROVIDED) {
            var164 = (SubLObject)module0770.T;
        }
        final SubLThread var165 = SubLProcess.currentSubLThread();
        assert module0770.NIL != Types.listp(var120) : var120;
        assert module0770.NIL != Types.listp(var117) : var117;
        if (module0770.NIL == Errors.$ignore_mustsP$.getDynamicValue(var165) && module0770.NIL == module0035.f2004(var120, var117)) {
            Errors.error((SubLObject)module0770.$ic60$, Sequences.length(var120), Sequences.length(var117));
        }
        final SubLObject var166 = module0751.f46970(var120, var117);
        final SubLObject var167 = module0751.f46956(var166);
        final SubLObject var168 = module0751.f46973(var167, var164);
        return module0751.f46972(var168);
    }
    
    public static SubLObject f49069(final SubLObject var117, SubLObject var112, SubLObject var2, SubLObject var4, SubLObject var5, SubLObject var6, SubLObject var168, SubLObject var148) {
        if (var112 == module0770.UNPROVIDED) {
            var112 = (SubLObject)module0770.$ic0$;
        }
        if (var2 == module0770.UNPROVIDED) {
            var2 = (SubLObject)module0770.$ic0$;
        }
        if (var4 == module0770.UNPROVIDED) {
            var4 = module0579.$g4260$.getDynamicValue();
        }
        if (var5 == module0770.UNPROVIDED) {
            var5 = module0579.$g4262$.getDynamicValue();
        }
        if (var6 == module0770.UNPROVIDED) {
            var6 = (SubLObject)module0770.$ic1$;
        }
        if (var168 == module0770.UNPROVIDED) {
            var168 = (SubLObject)module0770.$ic45$;
        }
        if (var148 == module0770.UNPROVIDED) {
            var148 = (SubLObject)module0770.NIL;
        }
        final SubLThread var169 = SubLProcess.currentSubLThread();
        assert module0770.NIL != module0761.f48130(var112) : var112;
        SubLObject var170 = (SubLObject)module0770.NIL;
        SubLObject var171 = (SubLObject)module0770.NIL;
        SubLObject var172 = (SubLObject)module0770.NIL;
        final SubLObject var173 = f49073(var117, var148);
        final SubLObject var174 = module0612.f37519(var5);
        final SubLObject var175 = module0612.f37519(var4);
        final SubLObject var176 = module0580.$g4363$.currentBinding(var169);
        final SubLObject var177 = module0580.$g4366$.currentBinding(var169);
        final SubLObject var178 = module0580.$g4364$.currentBinding(var169);
        try {
            module0580.$g4363$.bind(module0054.f3968(), var169);
            module0580.$g4366$.bind(module0580.f35568(), var169);
            module0580.$g4364$.bind((SubLObject)module0770.T, var169);
            try {
                final SubLObject var179 = module0580.f35595();
                final SubLObject var180 = (SubLObject)(var179.isNumber() ? Numbers.multiply(var179, Sequences.length(var117)) : module0770.NIL);
                assert module0770.NIL != module0580.f35523(var173) : var173;
                final SubLObject var18_176 = module0579.$g4264$.currentBinding(var169);
                final SubLObject var19_177 = module0580.$g4371$.currentBinding(var169);
                final SubLObject var39_178 = module0580.$g4369$.currentBinding(var169);
                final SubLObject var181 = module0580.$g4370$.currentBinding(var169);
                try {
                    module0579.$g4264$.bind(var173, var169);
                    module0580.$g4371$.bind((SubLObject)module0770.ZERO_INTEGER, var169);
                    module0580.$g4369$.bind(module0580.f35598(var180), var169);
                    module0580.$g4370$.bind(module0580.$g4370$.getDynamicValue(var169), var169);
                    module0580.$g4370$.setDynamicValue(module0580.f35596(), var169);
                    if (module0770.NIL == module0580.$g4370$.getDynamicValue(var169)) {
                        final SubLObject var182 = module0580.f35627();
                        final SubLObject var18_177 = module0580.$g4375$.currentBinding(var169);
                        final SubLObject var19_178 = module0580.$g4377$.currentBinding(var169);
                        try {
                            module0580.$g4375$.bind((module0770.NIL != var182) ? module0077.f5313(Symbols.symbol_function((SubLObject)module0770.EQUAL), module0580.f35624()) : module0580.$g4375$.getDynamicValue(var169), var169);
                            module0580.$g4377$.bind((SubLObject)module0770.T, var169);
                            for (SubLObject var183 = (SubLObject)module0770.NIL, var184 = (SubLObject)module0770.NIL; module0770.NIL != var183 || module0770.NIL == var184; var184 = (SubLObject)module0770.T) {
                                if (module0770.NIL != var183) {
                                    module0580.f35629(var183);
                                    var183 = (SubLObject)module0770.NIL;
                                }
                                try {
                                    var169.throwStack.push(module0770.$ic17$);
                                    final SubLObject var18_178 = module0580.$g4361$.currentBinding(var169);
                                    try {
                                        module0580.$g4361$.bind((SubLObject)module0770.NIL, var169);
                                        var169.resetMultipleValues();
                                        final SubLObject var18_179 = module0580.$g4362$.currentBinding(var169);
                                        try {
                                            module0580.$g4362$.bind(module0580.f35560(), var169);
                                            final SubLObject var185 = var169.secondMultipleValue();
                                            var169.resetMultipleValues();
                                            try {
                                                var169.resetMultipleValues();
                                                final SubLObject var18_180 = module0580.$g4358$.currentBinding(var169);
                                                try {
                                                    module0580.$g4358$.bind(module0580.f35544(), var169);
                                                    final SubLObject var186 = var169.secondMultipleValue();
                                                    var169.resetMultipleValues();
                                                    final SubLObject var18_181 = module0580.$g4359$.currentBinding(var169);
                                                    try {
                                                        module0580.$g4359$.bind(module0580.f35545(), var169);
                                                        final SubLObject var187 = module0580.$g4358$.getDynamicValue(var169);
                                                        final SubLObject var18_182 = module0034.$g879$.currentBinding(var169);
                                                        try {
                                                            module0034.$g879$.bind(var187, var169);
                                                            SubLObject var188 = (SubLObject)module0770.NIL;
                                                            if (module0770.NIL != var187 && module0770.NIL == module0034.f1842(var187)) {
                                                                var188 = module0034.f1869(var187);
                                                                final SubLObject var189 = Threads.current_process();
                                                                if (module0770.NIL == var188) {
                                                                    module0034.f1873(var187, var189);
                                                                }
                                                                else if (!var188.eql(var189)) {
                                                                    Errors.error((SubLObject)module0770.$ic15$);
                                                                }
                                                            }
                                                            try {
                                                                SubLObject var187_188 = (SubLObject)module0770.NIL;
                                                                SubLObject var190 = (SubLObject)module0770.NIL;
                                                                final SubLObject var18_183 = module0579.$g4237$.currentBinding(var169);
                                                                try {
                                                                    module0579.$g4237$.bind((module0770.NIL != module0579.$g4237$.getDynamicValue(var169)) ? module0579.$g4237$.getDynamicValue(var169) : module0067.f4880(Symbols.symbol_function((SubLObject)module0770.EQUALP), (SubLObject)module0770.UNPROVIDED), var169);
                                                                    module0753.f47251((SubLObject)module0770.ONE_INTEGER, (SubLObject)module0770.$ic63$, module0751.f46599(), (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED);
                                                                    SubLObject var191 = (SubLObject)module0770.NIL;
                                                                    SubLObject var192 = (SubLObject)module0770.NIL;
                                                                    SubLObject var193 = (SubLObject)module0770.NIL;
                                                                    var191 = var117;
                                                                    var192 = var191.first();
                                                                    for (var193 = (SubLObject)module0770.ZERO_INTEGER; module0770.NIL == var190 && module0770.NIL != var191; var191 = var191.rest(), var192 = var191.first(), var193 = Numbers.add((SubLObject)module0770.ONE_INTEGER, var193)) {
                                                                        final SubLObject var194 = f49074(var192, var2, var175, var174, var6, var112);
                                                                        module0753.f47252(var193, var194);
                                                                        if (module0770.NIL != module0756.f47600(var194)) {
                                                                            var187_188 = (SubLObject)ConsesLow.cons(var194, var187_188);
                                                                        }
                                                                        else {
                                                                            var190 = (SubLObject)module0770.T;
                                                                        }
                                                                    }
                                                                    if (module0770.NIL != var190) {
                                                                        var170 = (SubLObject)module0770.$ic64$;
                                                                    }
                                                                    else {
                                                                        var187_188 = Sequences.nreverse(var187_188);
                                                                        SubLObject var196;
                                                                        final SubLObject var195 = var196 = module0753.f47258(var187_188);
                                                                        SubLObject var197 = (SubLObject)module0770.NIL;
                                                                        var197 = var196.first();
                                                                        while (module0770.NIL != var196) {
                                                                            module0753.f47251((SubLObject)module0770.TWO_INTEGER, (SubLObject)module0770.$ic65$, var197, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED);
                                                                            final SubLObject var198 = module0753.f47256(var197, var117);
                                                                            SubLObject var103_196 = var197;
                                                                            SubLObject var199 = (SubLObject)module0770.NIL;
                                                                            var199 = var103_196.first();
                                                                            while (module0770.NIL != var103_196) {
                                                                                final SubLObject var200 = ConsesLow.nth(var199, var117);
                                                                                module0753.f47251((SubLObject)module0770.ONE_INTEGER, (SubLObject)module0770.$ic66$, var200, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED);
                                                                                final SubLObject var201 = module0751.f46608(var200, var198);
                                                                                final SubLObject var202 = module0753.f47253(var199, var187_188);
                                                                                SubLObject var203 = (SubLObject)module0770.NIL;
                                                                                if (!var201.equal(module0751.f46599())) {
                                                                                    module0753.f47251((SubLObject)module0770.TWO_INTEGER, (SubLObject)module0770.$ic67$, var201, var200, (SubLObject)module0770.UNPROVIDED);
                                                                                    assert module0770.NIL != module0751.f46598(var201) : var201;
                                                                                    final SubLObject var18_184 = module0579.$g4254$.currentBinding(var169);
                                                                                    final SubLObject var19_179 = module0579.$g4287$.currentBinding(var169);
                                                                                    try {
                                                                                        module0579.$g4254$.bind(var201, var169);
                                                                                        module0579.$g4287$.bind(var202, var169);
                                                                                        var203 = f49074(var200, var2, var175, var174, var6, var112);
                                                                                    }
                                                                                    finally {
                                                                                        module0579.$g4287$.rebind(var19_179, var169);
                                                                                        module0579.$g4254$.rebind(var18_184, var169);
                                                                                    }
                                                                                    module0753.f47251((SubLObject)module0770.TWO_INTEGER, (SubLObject)module0770.$ic69$, var201, var200, var203);
                                                                                }
                                                                                if (var201.isList() && (module0770.NIL == var203 || module0770.NIL != module0753.f47255(var203, ConsesLow.nth(var199, var187_188)))) {
                                                                                    module0753.f47251((SubLObject)module0770.TWO_INTEGER, (SubLObject)module0770.$ic70$, var200, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED);
                                                                                    assert module0770.NIL != module0751.f46598((SubLObject)module0770.T) : module0770.T;
                                                                                    final SubLObject var18_185 = module0579.$g4254$.currentBinding(var169);
                                                                                    final SubLObject var19_180 = module0579.$g4237$.currentBinding(var169);
                                                                                    final SubLObject var39_179 = module0579.$g4287$.currentBinding(var169);
                                                                                    try {
                                                                                        module0579.$g4254$.bind((SubLObject)module0770.T, var169);
                                                                                        module0579.$g4237$.bind((module0770.NIL != module0579.$g4237$.getDynamicValue(var169)) ? module0579.$g4237$.getDynamicValue(var169) : module0067.f4880(Symbols.symbol_function((SubLObject)module0770.EQUALP), (SubLObject)module0770.UNPROVIDED), var169);
                                                                                        module0579.$g4287$.bind(var202, var169);
                                                                                        var203 = f49074(var200, var2, var175, var174, var6, var112);
                                                                                    }
                                                                                    finally {
                                                                                        module0579.$g4287$.rebind(var39_179, var169);
                                                                                        module0579.$g4237$.rebind(var19_180, var169);
                                                                                        module0579.$g4254$.rebind(var18_185, var169);
                                                                                    }
                                                                                    module0753.f47251((SubLObject)module0770.TWO_INTEGER, (SubLObject)module0770.$ic71$, var200, var203, (SubLObject)module0770.UNPROVIDED);
                                                                                }
                                                                                if (module0770.NIL != module0753.f47254(var203, ConsesLow.nth(var199, var187_188), var200)) {
                                                                                    module0753.f47251((SubLObject)module0770.ONE_INTEGER, (SubLObject)module0770.$ic72$, var200, ConsesLow.nth(var199, var187_188), var203);
                                                                                    ConsesLow.set_nth(var199, var187_188, var203);
                                                                                    module0753.f47252(var199, var203);
                                                                                }
                                                                                var103_196 = var103_196.rest();
                                                                                var199 = var103_196.first();
                                                                            }
                                                                            var196 = var196.rest();
                                                                            var197 = var196.first();
                                                                        }
                                                                        SubLObject var204 = var117;
                                                                        var192 = (SubLObject)module0770.NIL;
                                                                        var192 = var204.first();
                                                                        while (module0770.NIL != var204) {
                                                                            module0755.f47385(var192);
                                                                            var204 = var204.rest();
                                                                            var192 = var204.first();
                                                                        }
                                                                        var170 = ConsesLow.append(var170, var187_188);
                                                                    }
                                                                }
                                                                finally {
                                                                    module0579.$g4237$.rebind(var18_183, var169);
                                                                }
                                                            }
                                                            finally {
                                                                final SubLObject var18_186 = Threads.$is_thread_performing_cleanupP$.currentBinding(var169);
                                                                try {
                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var169);
                                                                    if (module0770.NIL != var187 && module0770.NIL == var188) {
                                                                        module0034.f1873(var187, (SubLObject)module0770.NIL);
                                                                    }
                                                                }
                                                                finally {
                                                                    Threads.$is_thread_performing_cleanupP$.rebind(var18_186, var169);
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            module0034.$g879$.rebind(var18_182, var169);
                                                        }
                                                    }
                                                    finally {
                                                        module0580.$g4359$.rebind(var18_181, var169);
                                                    }
                                                    if (var186 == module0770.$ic21$ && module0770.NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var169))) {
                                                        module0034.f1891(module0580.$g4358$.getDynamicValue(var169));
                                                    }
                                                }
                                                finally {
                                                    module0580.$g4358$.rebind(var18_180, var169);
                                                }
                                            }
                                            finally {
                                                final SubLObject var18_187 = Threads.$is_thread_performing_cleanupP$.currentBinding(var169);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var169);
                                                    if (module0770.NIL == var185) {
                                                        module0580.f35554(module0580.$g4362$.getDynamicValue(var169));
                                                    }
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var18_187, var169);
                                                }
                                            }
                                        }
                                        finally {
                                            module0580.$g4362$.rebind(var18_179, var169);
                                        }
                                    }
                                    finally {
                                        module0580.$g4361$.rebind(var18_178, var169);
                                    }
                                }
                                catch (Throwable var205) {
                                    var183 = Errors.handleThrowable(var205, (SubLObject)module0770.$ic17$);
                                }
                                finally {
                                    var169.throwStack.pop();
                                }
                            }
                        }
                        finally {
                            module0580.$g4377$.rebind(var19_178, var169);
                            module0580.$g4375$.rebind(var18_177, var169);
                        }
                    }
                    var171 = module0580.f35596();
                }
                finally {
                    module0580.$g4370$.rebind(var181, var169);
                    module0580.$g4369$.rebind(var39_178, var169);
                    module0580.$g4371$.rebind(var19_177, var169);
                    module0579.$g4264$.rebind(var18_176, var169);
                }
                if (module0770.NIL != var171 && module0770.NIL != module0578.f35470((SubLObject)module0770.ONE_INTEGER) && module0770.NIL == module0578.f35477()) {
                    Errors.warn((SubLObject)module0770.$ic73$, var117);
                }
                if (var170.isList()) {
                    SubLObject var206 = (SubLObject)module0770.NIL;
                    SubLObject var13_208 = (SubLObject)module0770.NIL;
                    SubLObject var207 = (SubLObject)module0770.NIL;
                    SubLObject var210_211 = (SubLObject)module0770.NIL;
                    var206 = var170;
                    var13_208 = var206.first();
                    var207 = var117;
                    var210_211 = var207.first();
                    while (module0770.NIL != var207 || module0770.NIL != var206) {
                        final SubLObject var208 = var168;
                        if (var208.eql((SubLObject)module0770.$ic45$)) {
                            final SubLObject var209 = module0756.f47713(var13_208, (SubLObject)module0770.UNPROVIDED);
                            var172 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var210_211, var209), var172);
                        }
                        else if (var208.eql((SubLObject)module0770.$ic54$)) {
                            var172 = (SubLObject)ConsesLow.cons(module0751.f46953(var13_208), var172);
                        }
                        var206 = var206.rest();
                        var13_208 = var206.first();
                        var207 = var207.rest();
                        var210_211 = var207.first();
                    }
                }
            }
            finally {
                final SubLObject var18_188 = Threads.$is_thread_performing_cleanupP$.currentBinding(var169);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var169);
                    module0580.f35566();
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var18_188, var169);
                }
            }
        }
        finally {
            module0580.$g4364$.rebind(var178, var169);
            module0580.$g4366$.rebind(var177, var169);
            module0580.$g4363$.rebind(var176, var169);
        }
        return Sequences.nreverse(var172);
    }
    
    public static SubLObject f49073(final SubLObject var117, final SubLObject var148) {
        SubLObject var149 = (SubLObject)module0770.NIL;
        if (module0770.NIL != var148) {
            SubLObject var150 = var117;
            SubLObject var151 = (SubLObject)module0770.NIL;
            var151 = var150.first();
            while (module0770.NIL != var150) {
                var149 = module0035.f2063(var149, var151, var148, (SubLObject)module0770.UNPROVIDED);
                var150 = var150.rest();
                var151 = var150.first();
            }
        }
        return var149;
    }
    
    public static SubLObject f49075(final SubLObject var117, SubLObject var2, SubLObject var4, SubLObject var5, SubLObject var6, SubLObject var148) {
        if (var2 == module0770.UNPROVIDED) {
            var2 = (SubLObject)module0770.$ic74$;
        }
        if (var4 == module0770.UNPROVIDED) {
            var4 = module0579.$g4260$.getDynamicValue();
        }
        if (var5 == module0770.UNPROVIDED) {
            var5 = module0579.$g4262$.getDynamicValue();
        }
        if (var6 == module0770.UNPROVIDED) {
            var6 = (SubLObject)module0770.$ic1$;
        }
        if (var148 == module0770.UNPROVIDED) {
            var148 = (SubLObject)module0770.NIL;
        }
        final SubLThread var149 = SubLProcess.currentSubLThread();
        assert module0770.NIL != module0038.f2614(var148) : var148;
        SubLObject var150 = (SubLObject)module0770.NIL;
        final SubLObject var151 = module0753.f47279(var117, var5);
        final SubLObject var152 = module0580.$g4361$.currentBinding(var149);
        try {
            module0580.$g4361$.bind((SubLObject)module0770.NIL, var149);
            var149.resetMultipleValues();
            final SubLObject var18_215 = module0580.$g4362$.currentBinding(var149);
            try {
                module0580.$g4362$.bind(module0580.f35560(), var149);
                final SubLObject var153 = var149.secondMultipleValue();
                var149.resetMultipleValues();
                try {
                    var149.resetMultipleValues();
                    final SubLObject var18_216 = module0580.$g4358$.currentBinding(var149);
                    try {
                        module0580.$g4358$.bind(module0580.f35544(), var149);
                        final SubLObject var154 = var149.secondMultipleValue();
                        var149.resetMultipleValues();
                        final SubLObject var18_217 = module0580.$g4359$.currentBinding(var149);
                        try {
                            module0580.$g4359$.bind(module0580.f35545(), var149);
                            final SubLObject var155 = module0580.$g4358$.getDynamicValue(var149);
                            final SubLObject var18_218 = module0034.$g879$.currentBinding(var149);
                            try {
                                module0034.$g879$.bind(var155, var149);
                                SubLObject var156 = (SubLObject)module0770.NIL;
                                if (module0770.NIL != var155 && module0770.NIL == module0034.f1842(var155)) {
                                    var156 = module0034.f1869(var155);
                                    final SubLObject var157 = Threads.current_process();
                                    if (module0770.NIL == var156) {
                                        module0034.f1873(var155, var157);
                                    }
                                    else if (!var156.eql(var157)) {
                                        Errors.error((SubLObject)module0770.$ic15$);
                                    }
                                }
                                try {
                                    final SubLObject var18_219 = module0580.$g4363$.currentBinding(var149);
                                    final SubLObject var158 = module0580.$g4366$.currentBinding(var149);
                                    final SubLObject var159 = module0580.$g4364$.currentBinding(var149);
                                    try {
                                        module0580.$g4363$.bind(module0054.f3968(), var149);
                                        module0580.$g4366$.bind(module0580.f35568(), var149);
                                        module0580.$g4364$.bind((SubLObject)module0770.T, var149);
                                        try {
                                            final SubLObject var18_220 = module0579.$g4236$.currentBinding(var149);
                                            try {
                                                module0579.$g4236$.bind((SubLObject)module0770.$ic75$, var149);
                                                final SubLObject var160 = f49068(var117, (SubLObject)module0770.$ic16$, var2, var4, var5, var6, var148);
                                                final SubLObject var161 = f49068(var151, (SubLObject)module0770.$ic16$, (SubLObject)module0770.$ic74$, var4, var5, var6, var148);
                                                SubLObject var162 = (SubLObject)module0770.NIL;
                                                SubLObject var224_225 = (SubLObject)module0770.NIL;
                                                SubLObject var163 = (SubLObject)module0770.NIL;
                                                SubLObject var227_228 = (SubLObject)module0770.NIL;
                                                var162 = var160;
                                                var224_225 = var162.first();
                                                var163 = var161;
                                                var227_228 = var163.first();
                                                while (module0770.NIL != var163 || module0770.NIL != var162) {
                                                    var150 = (SubLObject)ConsesLow.cons(ConsesLow.append((SubLObject)ConsesLow.list(var224_225.first(), var224_225.rest()), var227_228), var150);
                                                    var162 = var162.rest();
                                                    var224_225 = var162.first();
                                                    var163 = var163.rest();
                                                    var227_228 = var163.first();
                                                }
                                            }
                                            finally {
                                                module0579.$g4236$.rebind(var18_220, var149);
                                            }
                                        }
                                        finally {
                                            final SubLObject var18_221 = Threads.$is_thread_performing_cleanupP$.currentBinding(var149);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var149);
                                                module0580.f35566();
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var18_221, var149);
                                            }
                                        }
                                    }
                                    finally {
                                        module0580.$g4364$.rebind(var159, var149);
                                        module0580.$g4366$.rebind(var158, var149);
                                        module0580.$g4363$.rebind(var18_219, var149);
                                    }
                                }
                                finally {
                                    final SubLObject var18_222 = Threads.$is_thread_performing_cleanupP$.currentBinding(var149);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var149);
                                        if (module0770.NIL != var155 && module0770.NIL == var156) {
                                            module0034.f1873(var155, (SubLObject)module0770.NIL);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var18_222, var149);
                                    }
                                }
                            }
                            finally {
                                module0034.$g879$.rebind(var18_218, var149);
                            }
                        }
                        finally {
                            module0580.$g4359$.rebind(var18_217, var149);
                        }
                        if (var154 == module0770.$ic21$ && module0770.NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var149))) {
                            module0034.f1891(module0580.$g4358$.getDynamicValue(var149));
                        }
                    }
                    finally {
                        module0580.$g4358$.rebind(var18_216, var149);
                    }
                }
                finally {
                    final SubLObject var18_223 = Threads.$is_thread_performing_cleanupP$.currentBinding(var149);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var149);
                        if (module0770.NIL == var153) {
                            module0580.f35554(module0580.$g4362$.getDynamicValue(var149));
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var18_223, var149);
                    }
                }
            }
            finally {
                module0580.$g4362$.rebind(var18_215, var149);
            }
        }
        finally {
            module0580.$g4361$.rebind(var152, var149);
        }
        return Sequences.nreverse(var150);
    }
    
    public static SubLObject f49076(final SubLObject var232, SubLObject var4) {
        if (var4 == module0770.UNPROVIDED) {
            var4 = module0579.$g4260$.getDynamicValue();
        }
        final SubLThread var233 = SubLProcess.currentSubLThread();
        assert module0770.NIL != module0174.f11035(var232) : var232;
        SubLObject var234 = (SubLObject)module0770.NIL;
        final SubLObject var235 = module0579.$g4298$.currentBinding(var233);
        final SubLObject var236 = module0579.$g4238$.currentBinding(var233);
        try {
            module0579.$g4298$.bind((SubLObject)module0770.$ic16$, var233);
            module0579.$g4238$.bind((SubLObject)module0770.T, var233);
            var234 = f49063(var232, (SubLObject)module0770.$ic0$, var4, module0178.f11287(var232), (SubLObject)module0770.$ic24$, (SubLObject)module0770.$ic16$);
        }
        finally {
            module0579.$g4238$.rebind(var236, var233);
            module0579.$g4298$.rebind(var235, var233);
        }
        return module0767.f48942(var234);
    }
    
    public static SubLObject f49063(final SubLObject var1, SubLObject var2, SubLObject var4, SubLObject var5, SubLObject var6, SubLObject var112) {
        if (var2 == module0770.UNPROVIDED) {
            var2 = (SubLObject)module0770.$ic0$;
        }
        if (var4 == module0770.UNPROVIDED) {
            var4 = module0579.$g4260$.getDynamicValue();
        }
        if (var5 == module0770.UNPROVIDED) {
            var5 = module0579.$g4262$.getDynamicValue();
        }
        if (var6 == module0770.UNPROVIDED) {
            var6 = (SubLObject)module0770.$ic1$;
        }
        if (var112 == module0770.UNPROVIDED) {
            var112 = (SubLObject)module0770.$ic0$;
        }
        final SubLThread var113 = SubLProcess.currentSubLThread();
        assert module0770.NIL != module0761.f48130(var112) : var112;
        if (module0770.$ic0$ == var2) {
            var2 = module0751.f47142(module0172.f10922(var1), var112, var4, var5);
        }
        if (module0770.$ic0$ == var4) {
            var4 = module0579.$g4260$.getDynamicValue(var113);
        }
        if (var4.isString()) {
            var4 = module0751.f47147(var4);
        }
        var4 = module0751.f46998(var4);
        var5 = module0751.f46998(var5);
        var2 = module0751.f47139(var2);
        return f49077(var1, var2, var4, var5, var6, var112, (SubLObject)module0770.T);
    }
    
    public static SubLObject f49074(final SubLObject var1, SubLObject var2, SubLObject var4, SubLObject var5, SubLObject var6, SubLObject var112) {
        if (var2 == module0770.UNPROVIDED) {
            var2 = (SubLObject)module0770.$ic0$;
        }
        if (var4 == module0770.UNPROVIDED) {
            var4 = module0579.$g4260$.getDynamicValue();
        }
        if (var5 == module0770.UNPROVIDED) {
            var5 = module0579.$g4262$.getDynamicValue();
        }
        if (var6 == module0770.UNPROVIDED) {
            var6 = (SubLObject)module0770.$ic1$;
        }
        if (var112 == module0770.UNPROVIDED) {
            var112 = (SubLObject)module0770.$ic0$;
        }
        return f49077(var1, var2, var4, var5, var6, var112, (SubLObject)module0770.NIL);
    }
    
    public static SubLObject f49077(final SubLObject var1, final SubLObject var2, final SubLObject var4, final SubLObject var5, final SubLObject var6, final SubLObject var112, final SubLObject var233) {
        final SubLThread var234 = SubLProcess.currentSubLThread();
        SubLObject var235 = (SubLObject)module0770.NIL;
        SubLObject var236 = (SubLObject)module0770.NIL;
        SubLObject var237 = (SubLObject)module0770.NIL;
        SubLObject var238 = (SubLObject)module0770.NIL;
        if (module0770.NIL != var233) {
            var234.resetMultipleValues();
            final SubLObject var234_235 = f49067(var1, var112, var2, var4, var5, var6, (SubLObject)module0770.UNPROVIDED);
            final SubLObject var236_237 = var234.secondMultipleValue();
            final SubLObject var238_239 = var234.thirdMultipleValue();
            final SubLObject var240_241 = var234.fourthMultipleValue();
            var234.resetMultipleValues();
            var235 = var234_235;
            var236 = var236_237;
            var237 = var238_239;
            var238 = var240_241;
        }
        else {
            var234.resetMultipleValues();
            final SubLObject var242_243 = f49078(var1, var112, var2, var4, var5, var6, (SubLObject)module0770.UNPROVIDED);
            final SubLObject var244_245 = var234.secondMultipleValue();
            final SubLObject var246_247 = var234.thirdMultipleValue();
            final SubLObject var248_249 = var234.fourthMultipleValue();
            var234.resetMultipleValues();
            var235 = var242_243;
            var236 = var244_245;
            var237 = var246_247;
            var238 = var248_249;
        }
        final SubLObject var239 = module0579.$g4305$.currentBinding(var234);
        try {
            module0579.$g4305$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0770.NIL != module0579.f35497() && module0770.NIL == Sequences.find_if((SubLObject)module0770.$ic41$, var237, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED)), var234);
            var238 = f49055(conses_high.copy_list(var238), var1);
        }
        finally {
            module0579.$g4305$.rebind(var239, var234);
        }
        return Values.values(var238, var236, var237);
    }
    
    public static SubLObject f49079(final SubLObject var250, SubLObject var2, SubLObject var4, SubLObject var5, SubLObject var251, SubLObject var252, SubLObject var112) {
        if (var2 == module0770.UNPROVIDED) {
            var2 = (SubLObject)module0770.$ic28$;
        }
        if (var4 == module0770.UNPROVIDED) {
            var4 = module0579.$g4260$.getDynamicValue();
        }
        if (var5 == module0770.UNPROVIDED) {
            var5 = module0579.$g4262$.getDynamicValue();
        }
        if (var251 == module0770.UNPROVIDED) {
            var251 = module0579.f35488();
        }
        if (var252 == module0770.UNPROVIDED) {
            var252 = module0579.f35489();
        }
        if (var112 == module0770.UNPROVIDED) {
            var112 = (SubLObject)module0770.$ic0$;
        }
        final SubLThread var253 = SubLProcess.currentSubLThread();
        SubLObject var254 = (SubLObject)module0770.NIL;
        SubLObject var255 = (SubLObject)module0770.NIL;
        final SubLObject var256 = module0580.$g4361$.currentBinding(var253);
        try {
            module0580.$g4361$.bind((SubLObject)module0770.NIL, var253);
            var253.resetMultipleValues();
            final SubLObject var18_253 = module0580.$g4362$.currentBinding(var253);
            try {
                module0580.$g4362$.bind(module0580.f35560(), var253);
                final SubLObject var257 = var253.secondMultipleValue();
                var253.resetMultipleValues();
                try {
                    var253.resetMultipleValues();
                    final SubLObject var18_254 = module0580.$g4358$.currentBinding(var253);
                    try {
                        module0580.$g4358$.bind(module0580.f35544(), var253);
                        final SubLObject var258 = var253.secondMultipleValue();
                        var253.resetMultipleValues();
                        final SubLObject var18_255 = module0580.$g4359$.currentBinding(var253);
                        try {
                            module0580.$g4359$.bind(module0580.f35545(), var253);
                            final SubLObject var259 = module0580.$g4358$.getDynamicValue(var253);
                            final SubLObject var18_256 = module0034.$g879$.currentBinding(var253);
                            try {
                                module0034.$g879$.bind(var259, var253);
                                SubLObject var260 = (SubLObject)module0770.NIL;
                                if (module0770.NIL != var259 && module0770.NIL == module0034.f1842(var259)) {
                                    var260 = module0034.f1869(var259);
                                    final SubLObject var261 = Threads.current_process();
                                    if (module0770.NIL == var260) {
                                        module0034.f1873(var259, var261);
                                    }
                                    else if (!var260.eql(var261)) {
                                        Errors.error((SubLObject)module0770.$ic15$);
                                    }
                                }
                                try {
                                    final SubLObject var18_257 = Errors.$continue_cerrorP$.currentBinding(var253);
                                    final SubLObject var262 = module0578.$g4234$.currentBinding(var253);
                                    try {
                                        Errors.$continue_cerrorP$.bind((SubLObject)module0770.NIL, var253);
                                        module0578.$g4234$.bind((SubLObject)module0770.T, var253);
                                        if (module0770.NIL != module0578.f35473()) {
                                            final SubLObject var18_258 = module0580.$g4363$.currentBinding(var253);
                                            final SubLObject var19_259 = module0580.$g4366$.currentBinding(var253);
                                            final SubLObject var263 = module0580.$g4364$.currentBinding(var253);
                                            try {
                                                module0580.$g4363$.bind(module0054.f3968(), var253);
                                                module0580.$g4366$.bind(module0580.f35568(), var253);
                                                module0580.$g4364$.bind((SubLObject)module0770.T, var253);
                                                try {
                                                    var253.resetMultipleValues();
                                                    final SubLObject var264 = f49080(var250, var2, var4, var5, var251, var252, var112);
                                                    final SubLObject var265 = var253.secondMultipleValue();
                                                    var253.resetMultipleValues();
                                                    if (module0770.NIL != var265) {
                                                        SubLObject var266 = module0756.f47705(var264);
                                                        SubLObject var267 = (SubLObject)module0770.NIL;
                                                        var267 = var266.first();
                                                        while (module0770.NIL != var266) {
                                                            if (module0770.NIL != module0759.f48038(var264) && module0770.NIL == module0758.f47965(var267, var112)) {
                                                                var267 = module0758.f47886(var267, var112);
                                                            }
                                                            final SubLObject var268 = var267;
                                                            if (module0770.NIL == conses_high.member(var268, var255, Symbols.symbol_function((SubLObject)module0770.EQUALP), Symbols.symbol_function((SubLObject)module0770.IDENTITY))) {
                                                                var255 = (SubLObject)ConsesLow.cons(var268, var255);
                                                            }
                                                            var266 = var266.rest();
                                                            var267 = var266.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    final SubLObject var18_259 = Threads.$is_thread_performing_cleanupP$.currentBinding(var253);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var253);
                                                        module0580.f35566();
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(var18_259, var253);
                                                    }
                                                }
                                            }
                                            finally {
                                                module0580.$g4364$.rebind(var263, var253);
                                                module0580.$g4366$.rebind(var19_259, var253);
                                                module0580.$g4363$.rebind(var18_258, var253);
                                            }
                                        }
                                        else {
                                            try {
                                                var253.throwStack.push(module0003.$g3$.getGlobalValue());
                                                final SubLObject var18_260 = Errors.$error_handler$.currentBinding(var253);
                                                try {
                                                    Errors.$error_handler$.bind((SubLObject)module0770.$ic22$, var253);
                                                    try {
                                                        final SubLObject var18_261 = module0580.$g4363$.currentBinding(var253);
                                                        final SubLObject var19_260 = module0580.$g4366$.currentBinding(var253);
                                                        final SubLObject var269 = module0580.$g4364$.currentBinding(var253);
                                                        try {
                                                            module0580.$g4363$.bind(module0054.f3968(), var253);
                                                            module0580.$g4366$.bind(module0580.f35568(), var253);
                                                            module0580.$g4364$.bind((SubLObject)module0770.T, var253);
                                                            try {
                                                                var253.resetMultipleValues();
                                                                final SubLObject var270 = f49080(var250, var2, var4, var5, var251, var252, var112);
                                                                final SubLObject var271 = var253.secondMultipleValue();
                                                                var253.resetMultipleValues();
                                                                if (module0770.NIL != var271) {
                                                                    SubLObject var272 = module0756.f47705(var270);
                                                                    SubLObject var273 = (SubLObject)module0770.NIL;
                                                                    var273 = var272.first();
                                                                    while (module0770.NIL != var272) {
                                                                        if (module0770.NIL != module0759.f48038(var270) && module0770.NIL == module0758.f47965(var273, var112)) {
                                                                            var273 = module0758.f47886(var273, var112);
                                                                        }
                                                                        final SubLObject var274 = var273;
                                                                        if (module0770.NIL == conses_high.member(var274, var255, Symbols.symbol_function((SubLObject)module0770.EQUALP), Symbols.symbol_function((SubLObject)module0770.IDENTITY))) {
                                                                            var255 = (SubLObject)ConsesLow.cons(var274, var255);
                                                                        }
                                                                        var272 = var272.rest();
                                                                        var273 = var272.first();
                                                                    }
                                                                }
                                                            }
                                                            finally {
                                                                final SubLObject var18_262 = Threads.$is_thread_performing_cleanupP$.currentBinding(var253);
                                                                try {
                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var253);
                                                                    module0580.f35566();
                                                                }
                                                                finally {
                                                                    Threads.$is_thread_performing_cleanupP$.rebind(var18_262, var253);
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            module0580.$g4364$.rebind(var269, var253);
                                                            module0580.$g4366$.rebind(var19_260, var253);
                                                            module0580.$g4363$.rebind(var18_261, var253);
                                                        }
                                                    }
                                                    catch (Throwable var275) {
                                                        Errors.handleThrowable(var275, (SubLObject)module0770.NIL);
                                                    }
                                                }
                                                finally {
                                                    Errors.$error_handler$.rebind(var18_260, var253);
                                                }
                                            }
                                            catch (Throwable var276) {
                                                var254 = Errors.handleThrowable(var276, module0003.$g3$.getGlobalValue());
                                            }
                                            finally {
                                                var253.throwStack.pop();
                                            }
                                            if (var254.isString() && module0770.NIL == module0578.f35477()) {
                                                Errors.warn(Sequences.cconcatenate(module0752.f47234(var254), (SubLObject)module0770.$ic23$), module0579.f35508());
                                            }
                                        }
                                    }
                                    finally {
                                        module0578.$g4234$.rebind(var262, var253);
                                        Errors.$continue_cerrorP$.rebind(var18_257, var253);
                                    }
                                }
                                finally {
                                    final SubLObject var18_263 = Threads.$is_thread_performing_cleanupP$.currentBinding(var253);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var253);
                                        if (module0770.NIL != var259 && module0770.NIL == var260) {
                                            module0034.f1873(var259, (SubLObject)module0770.NIL);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var18_263, var253);
                                    }
                                }
                            }
                            finally {
                                module0034.$g879$.rebind(var18_256, var253);
                            }
                        }
                        finally {
                            module0580.$g4359$.rebind(var18_255, var253);
                        }
                        if (var258 == module0770.$ic21$ && module0770.NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var253))) {
                            module0034.f1891(module0580.$g4358$.getDynamicValue(var253));
                        }
                    }
                    finally {
                        module0580.$g4358$.rebind(var18_254, var253);
                    }
                }
                finally {
                    final SubLObject var18_264 = Threads.$is_thread_performing_cleanupP$.currentBinding(var253);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var253);
                        if (module0770.NIL == var257) {
                            module0580.f35554(module0580.$g4362$.getDynamicValue(var253));
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var18_264, var253);
                    }
                }
            }
            finally {
                module0580.$g4362$.rebind(var18_253, var253);
            }
        }
        finally {
            module0580.$g4361$.rebind(var256, var253);
        }
        return Sequences.nreverse(var255);
    }
    
    public static SubLObject f49081(final SubLObject var250, SubLObject var2, SubLObject var4, SubLObject var5, SubLObject var251, SubLObject var252, SubLObject var112) {
        if (var2 == module0770.UNPROVIDED) {
            var2 = (SubLObject)module0770.$ic28$;
        }
        if (var4 == module0770.UNPROVIDED) {
            var4 = module0579.$g4260$.getDynamicValue();
        }
        if (var5 == module0770.UNPROVIDED) {
            var5 = module0579.$g4262$.getDynamicValue();
        }
        if (var251 == module0770.UNPROVIDED) {
            var251 = module0579.f35488();
        }
        if (var252 == module0770.UNPROVIDED) {
            var252 = module0579.f35489();
        }
        if (var112 == module0770.UNPROVIDED) {
            var112 = (SubLObject)module0770.$ic0$;
        }
        final SubLThread var253 = SubLProcess.currentSubLThread();
        SubLObject var254 = (SubLObject)module0770.NIL;
        final SubLObject var255 = module0580.$g4361$.currentBinding(var253);
        try {
            module0580.$g4361$.bind((SubLObject)module0770.NIL, var253);
            var253.resetMultipleValues();
            final SubLObject var18_270 = module0580.$g4362$.currentBinding(var253);
            try {
                module0580.$g4362$.bind(module0580.f35560(), var253);
                final SubLObject var256 = var253.secondMultipleValue();
                var253.resetMultipleValues();
                try {
                    var253.resetMultipleValues();
                    final SubLObject var18_271 = module0580.$g4358$.currentBinding(var253);
                    try {
                        module0580.$g4358$.bind(module0580.f35544(), var253);
                        final SubLObject var257 = var253.secondMultipleValue();
                        var253.resetMultipleValues();
                        final SubLObject var18_272 = module0580.$g4359$.currentBinding(var253);
                        try {
                            module0580.$g4359$.bind(module0580.f35545(), var253);
                            final SubLObject var258 = module0580.$g4358$.getDynamicValue(var253);
                            final SubLObject var18_273 = module0034.$g879$.currentBinding(var253);
                            try {
                                module0034.$g879$.bind(var258, var253);
                                SubLObject var259 = (SubLObject)module0770.NIL;
                                if (module0770.NIL != var258 && module0770.NIL == module0034.f1842(var258)) {
                                    var259 = module0034.f1869(var258);
                                    final SubLObject var260 = Threads.current_process();
                                    if (module0770.NIL == var259) {
                                        module0034.f1873(var258, var260);
                                    }
                                    else if (!var259.eql(var260)) {
                                        Errors.error((SubLObject)module0770.$ic15$);
                                    }
                                }
                                try {
                                    final SubLObject var18_274 = Errors.$continue_cerrorP$.currentBinding(var253);
                                    final SubLObject var261 = module0578.$g4234$.currentBinding(var253);
                                    try {
                                        Errors.$continue_cerrorP$.bind((SubLObject)module0770.NIL, var253);
                                        module0578.$g4234$.bind((SubLObject)module0770.T, var253);
                                        if (module0770.NIL != module0578.f35473()) {
                                            final SubLObject var18_275 = module0580.$g4363$.currentBinding(var253);
                                            final SubLObject var19_276 = module0580.$g4366$.currentBinding(var253);
                                            final SubLObject var262 = module0580.$g4364$.currentBinding(var253);
                                            try {
                                                module0580.$g4363$.bind(module0054.f3968(), var253);
                                                module0580.$g4366$.bind(module0580.f35568(), var253);
                                                module0580.$g4364$.bind((SubLObject)module0770.T, var253);
                                                try {
                                                    var253.resetMultipleValues();
                                                    final SubLObject var263 = f49080(var250, var2, var4, var5, var251, var252, var112);
                                                    final SubLObject var264 = var253.secondMultipleValue();
                                                    var253.resetMultipleValues();
                                                    SubLObject var265 = module0757.f47861(var263, (SubLObject)module0770.UNPROVIDED);
                                                    if (module0770.NIL != var264 && module0770.NIL != module0759.f48038(var263) && module0770.NIL == module0757.f47863(var265, var112)) {
                                                        var265 = module0757.f47866(var265, var112);
                                                    }
                                                    return var265;
                                                }
                                                finally {
                                                    final SubLObject var18_276 = Threads.$is_thread_performing_cleanupP$.currentBinding(var253);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var253);
                                                        module0580.f35566();
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(var18_276, var253);
                                                    }
                                                }
                                            }
                                            finally {
                                                module0580.$g4364$.rebind(var262, var253);
                                                module0580.$g4366$.rebind(var19_276, var253);
                                                module0580.$g4363$.rebind(var18_275, var253);
                                            }
                                        }
                                        try {
                                            var253.throwStack.push(module0003.$g3$.getGlobalValue());
                                            final SubLObject var18_277 = Errors.$error_handler$.currentBinding(var253);
                                            try {
                                                Errors.$error_handler$.bind((SubLObject)module0770.$ic22$, var253);
                                                try {
                                                    final SubLObject var18_278 = module0580.$g4363$.currentBinding(var253);
                                                    final SubLObject var19_277 = module0580.$g4366$.currentBinding(var253);
                                                    final SubLObject var266 = module0580.$g4364$.currentBinding(var253);
                                                    try {
                                                        module0580.$g4363$.bind(module0054.f3968(), var253);
                                                        module0580.$g4366$.bind(module0580.f35568(), var253);
                                                        module0580.$g4364$.bind((SubLObject)module0770.T, var253);
                                                        try {
                                                            var253.resetMultipleValues();
                                                            final SubLObject var267 = f49080(var250, var2, var4, var5, var251, var252, var112);
                                                            final SubLObject var268 = var253.secondMultipleValue();
                                                            var253.resetMultipleValues();
                                                            SubLObject var269 = module0757.f47861(var267, (SubLObject)module0770.UNPROVIDED);
                                                            if (module0770.NIL != var268 && module0770.NIL != module0759.f48038(var267) && module0770.NIL == module0757.f47863(var269, var112)) {
                                                                var269 = module0757.f47866(var269, var112);
                                                            }
                                                            return var269;
                                                        }
                                                        finally {
                                                            final SubLObject var18_279 = Threads.$is_thread_performing_cleanupP$.currentBinding(var253);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var253);
                                                                module0580.f35566();
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(var18_279, var253);
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        module0580.$g4364$.rebind(var266, var253);
                                                        module0580.$g4366$.rebind(var19_277, var253);
                                                        module0580.$g4363$.rebind(var18_278, var253);
                                                    }
                                                }
                                                catch (Throwable var270) {
                                                    Errors.handleThrowable(var270, (SubLObject)module0770.NIL);
                                                }
                                            }
                                            finally {
                                                Errors.$error_handler$.rebind(var18_277, var253);
                                            }
                                        }
                                        catch (Throwable var271) {
                                            var254 = Errors.handleThrowable(var271, module0003.$g3$.getGlobalValue());
                                        }
                                        finally {
                                            var253.throwStack.pop();
                                        }
                                        if (var254.isString() && module0770.NIL == module0578.f35477()) {
                                            Errors.warn(Sequences.cconcatenate(module0752.f47234(var254), (SubLObject)module0770.$ic23$), module0579.f35508());
                                        }
                                    }
                                    finally {
                                        module0578.$g4234$.rebind(var261, var253);
                                        Errors.$continue_cerrorP$.rebind(var18_274, var253);
                                    }
                                }
                                finally {
                                    final SubLObject var18_280 = Threads.$is_thread_performing_cleanupP$.currentBinding(var253);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var253);
                                        if (module0770.NIL != var258 && module0770.NIL == var259) {
                                            module0034.f1873(var258, (SubLObject)module0770.NIL);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var18_280, var253);
                                    }
                                }
                            }
                            finally {
                                module0034.$g879$.rebind(var18_273, var253);
                            }
                        }
                        finally {
                            module0580.$g4359$.rebind(var18_272, var253);
                        }
                        if (var257 == module0770.$ic21$ && module0770.NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var253))) {
                            module0034.f1891(module0580.$g4358$.getDynamicValue(var253));
                        }
                    }
                    finally {
                        module0580.$g4358$.rebind(var18_271, var253);
                    }
                }
                finally {
                    final SubLObject var18_281 = Threads.$is_thread_performing_cleanupP$.currentBinding(var253);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var253);
                        if (module0770.NIL == var256) {
                            module0580.f35554(module0580.$g4362$.getDynamicValue(var253));
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var18_281, var253);
                    }
                }
            }
            finally {
                module0580.$g4362$.rebind(var18_270, var253);
            }
        }
        finally {
            module0580.$g4361$.rebind(var255, var253);
        }
        return (SubLObject)module0770.NIL;
    }
    
    public static SubLObject f49080(final SubLObject var250, SubLObject var2, final SubLObject var4, final SubLObject var5, final SubLObject var251, final SubLObject var252, SubLObject var112) {
        final SubLThread var253 = SubLProcess.currentSubLThread();
        if (module0770.$ic0$ == var2) {
            var2 = module0751.f47142(var250, (SubLObject)module0770.$ic16$, var4, var5);
        }
        if (module0770.$ic0$ == var112) {
            var112 = module0751.f47036(var250);
        }
        final SubLObject var254 = module0579.$g4251$.currentBinding(var253);
        final SubLObject var255 = module0579.$g4260$.currentBinding(var253);
        final SubLObject var256 = module0579.$g4280$.currentBinding(var253);
        final SubLObject var257 = module0579.$g4262$.currentBinding(var253);
        try {
            module0579.$g4251$.bind((SubLObject)((module0770.NIL != var251) ? module0770.$ic78$ : ((module0770.NIL != var252) ? module0770.$ic79$ : module0770.$ic80$)), var253);
            module0579.$g4260$.bind(var4, var253);
            module0579.$g4280$.bind((SubLObject)module0770.ZERO_INTEGER, var253);
            module0579.$g4262$.bind(var5, var253);
            final SubLObject var258 = var112.eql((SubLObject)module0770.$ic16$) ? module0756.f47463(var250, module0751.f47198(), (SubLObject)module0770.UNPROVIDED) : module0759.f48039(var250, var112, var2);
            SubLObject var259 = (SubLObject)module0770.NIL;
            if (module0770.NIL != module0759.f48038(var258)) {
                module0759.f48066(var258, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED);
                var259 = module0759.f48060(var258);
            }
            else {
                module0756.f47784(var258, var2, (SubLObject)module0770.UNPROVIDED);
                f49065(var258, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED);
                var259 = module0756.f47479(var258);
            }
            return Values.values(var258, var259);
        }
        finally {
            module0579.$g4262$.rebind(var257, var253);
            module0579.$g4280$.rebind(var256, var253);
            module0579.$g4260$.rebind(var255, var253);
            module0579.$g4251$.rebind(var254, var253);
        }
    }
    
    public static SubLObject f49055(SubLObject var13, SubLObject var285) {
        SubLObject var286 = (SubLObject)module0770.NIL;
        var285 = module0205.f13144(var285);
        if (module0770.NIL != module0202.f12590(var285)) {
            SubLObject var287 = var13;
            SubLObject var288 = (SubLObject)module0770.NIL;
            var288 = var287.first();
            while (module0770.NIL != var287) {
                final SubLObject var289 = f49082(var288, var285);
                if (module0770.NIL != var289) {
                    var286 = (SubLObject)module0770.T;
                }
                var287 = var287.rest();
                var288 = var287.first();
            }
        }
        if (module0770.NIL != var286) {
            var13 = module0756.f47761(var13);
        }
        return Values.values(var13, var286);
    }
    
    public static SubLObject f49082(final SubLObject var114, final SubLObject var285) {
        final SubLThread var286 = SubLProcess.currentSubLThread();
        final SubLObject var287 = module0749.f46462(var114);
        final SubLObject var288 = module0749.f46466(var114);
        SubLObject var289 = (SubLObject)module0770.NIL;
        if (module0770.NIL != module0751.f46829(var287)) {
            if (module0770.NIL == module0128.f8449(var288) || !module0166.f10743(var288).equal(module0749.f46455(var114))) {
                f49083(var114);
                if (module0770.NIL == module0756.f47476(var288) && module0770.NIL == module0756.f47747(var288)) {
                    if (module0770.NIL != module0578.f35470((SubLObject)module0770.ONE_INTEGER) && module0770.NIL == module0578.f35477()) {
                        Errors.warn((SubLObject)module0770.$ic81$, var114, module0756.f47748());
                    }
                    module0749.f46468(var114, module0756.f47748());
                }
                var289 = (SubLObject)module0770.T;
            }
        }
        else {
            var286.resetMultipleValues();
            final SubLObject var290 = module0751.f46621(var285, var287);
            final SubLObject var291 = var286.secondMultipleValue();
            var286.resetMultipleValues();
            if (module0770.NIL != var291) {
                if (module0770.NIL != module0578.f35470((SubLObject)module0770.ONE_INTEGER) && module0770.NIL == module0578.f35477()) {
                    Errors.warn((SubLObject)module0770.$ic82$, var287, var288);
                }
                module0749.f46464(var114, module0751.f46705());
                var289 = (SubLObject)module0770.T;
            }
            else if (!module0228.f15230(var288).equal(module0228.f15230(var290))) {
                if (module0770.NIL != module0578.f35470((SubLObject)module0770.ONE_INTEGER) && module0770.NIL == module0578.f35477()) {
                    Errors.warn((SubLObject)module0770.$ic83$, var114, var290);
                }
                final SubLObject var292 = (SubLObject)module0770.T;
                if (module0770.NIL != var292) {
                    module0749.f46464(var114, module0751.f46705());
                    f49083(var114);
                    module0749.f46468(var114, module0756.f47746());
                }
                else {
                    module0749.f46468(var114, var290);
                }
                var289 = (SubLObject)module0770.T;
            }
        }
        return var289;
    }
    
    public static SubLObject f49083(final SubLObject var114) {
        final SubLObject var115 = module0749.f46474(var114);
        final SubLObject var116 = f49084(var115);
        final SubLObject var117 = module0749.f46476(var114);
        final SubLObject var118 = f49084(var117);
        module0749.f46479(var114, var116, var118);
        return var114;
    }
    
    public static SubLObject f49084(final SubLObject var296) {
        final SubLObject var297 = module0751.f46648(var296, (SubLObject)module0770.T);
        return (SubLObject)((module0770.NIL != module0038.f2653(var297)) ? var297 : module0770.NIL);
    }
    
    public static SubLObject f49085(final SubLObject var287, final SubLObject var13, SubLObject var298) {
        if (var298 == module0770.UNPROVIDED) {
            var298 = (SubLObject)module0770.T;
        }
        SubLObject var299 = (SubLObject)module0770.NIL;
        SubLObject var300 = var13;
        SubLObject var301 = (SubLObject)module0770.NIL;
        var301 = var300.first();
        while (module0770.NIL != var300) {
            if (module0770.NIL != module0751.f47194(module0749.f46462(var301), var287, (SubLObject)module0770.UNPROVIDED)) {
                var299 = (SubLObject)ConsesLow.cons(var301, var299);
            }
            var300 = var300.rest();
            var301 = var300.first();
        }
        return module0756.f47713(Sequences.nreverse(var299), var298);
    }
    
    public static SubLObject f49086(final SubLObject var13, final SubLObject var300, final SubLObject var301) {
        assert module0770.NIL != module0756.f47600(var13) : var13;
        SubLObject var302 = (SubLObject)module0770.ZERO_INTEGER;
        SubLObject var303 = (SubLObject)module0770.ZERO_INTEGER;
        final SubLObject var304 = module0756.f47713(var13, (SubLObject)module0770.T);
        final SubLObject var305 = module0751.f46648(var304, (SubLObject)module0770.NIL);
        final SubLObject var306 = module0749.f46562(var13);
        while (module0770.NIL == module0749.f46563(var306)) {
            final SubLObject var307 = module0749.f46564(var306);
            final SubLObject var308 = module0756.f47721(var307, (SubLObject)module0770.NIL);
            var302 = module0580.f35585(var308, var305, var303);
            if (var302.numG(var303)) {
                final SubLObject var309 = module0580.f35583(var302, var303);
                final SubLObject var310 = module0751.f46705();
                final SubLObject var311 = (SubLObject)module0770.NIL;
                final SubLObject var312 = (SubLObject)module0770.NIL;
                final SubLObject var313 = module0756.f47748();
                final SubLObject var314 = module0772.f49212(var309);
                final SubLObject var302_313 = var303;
                if (module0770.NIL != module0751.f47194(var310, var300, (SubLObject)module0770.UNPROVIDED)) {
                    return (SubLObject)module0770.T;
                }
                if (module0770.NIL != module0751.f47194(var310, var301, (SubLObject)module0770.UNPROVIDED)) {
                    return (SubLObject)module0770.NIL;
                }
            }
            var303 = module0580.f35582(var302, var308);
            final SubLObject var309 = module0756.f47721(var307, (SubLObject)module0770.NIL);
            final SubLObject var310 = module0749.f46462(var307);
            final SubLObject var311 = module0749.f46474(var307);
            final SubLObject var312 = module0749.f46476(var307);
            final SubLObject var313 = module0749.f46466(var307);
            final SubLObject var314 = var307;
            if (module0770.NIL != module0751.f47194(var310, var300, (SubLObject)module0770.UNPROVIDED)) {
                return (SubLObject)module0770.T;
            }
            if (module0770.NIL != module0751.f47194(var310, var301, (SubLObject)module0770.UNPROVIDED)) {
                return (SubLObject)module0770.NIL;
            }
        }
        return (SubLObject)module0770.NIL;
    }
    
    public static SubLObject f49087(final SubLObject var287, final SubLObject var13) {
        SubLObject var288 = (SubLObject)module0770.NIL;
        if (module0770.NIL == var288) {
            SubLObject var289 = var13;
            SubLObject var290 = (SubLObject)module0770.NIL;
            var290 = var289.first();
            while (module0770.NIL == var288 && module0770.NIL != var289) {
                if (var287.equal(module0749.f46462(var290))) {
                    var288 = module0749.f46470(var290);
                }
                var289 = var289.rest();
                var290 = var289.first();
            }
        }
        return module0751.f47031(var288, (SubLObject)module0770.UNPROVIDED);
    }
    
    public static SubLObject f49067(final SubLObject var1, SubLObject var112, SubLObject var2, SubLObject var4, SubLObject var5, SubLObject var6, SubLObject var8) {
        if (var112 == module0770.UNPROVIDED) {
            var112 = (SubLObject)module0770.$ic0$;
        }
        if (var2 == module0770.UNPROVIDED) {
            var2 = (SubLObject)module0770.$ic0$;
        }
        if (var4 == module0770.UNPROVIDED) {
            var4 = (SubLObject)module0770.$ic0$;
        }
        if (var5 == module0770.UNPROVIDED) {
            var5 = (SubLObject)module0770.$ic0$;
        }
        if (var6 == module0770.UNPROVIDED) {
            var6 = (SubLObject)module0770.$ic1$;
        }
        if (var8 == module0770.UNPROVIDED) {
            var8 = (SubLObject)module0770.NIL;
        }
        assert module0770.NIL != module0206.f13464(var1) : var1;
        assert module0770.NIL != module0761.f48130(var112) : var112;
        assert module0770.NIL != module0751.f46980(var2) : var2;
        assert module0770.NIL != f49059(var4) : var4;
        assert module0770.NIL != module0751.f47217(var5) : var5;
        assert module0770.NIL != Types.keywordp(var6) : var6;
        if (module0770.NIL != var8 && !module0770.areAssertionsDisabledFor(me) && module0770.NIL == module0004.f106(var8)) {
            throw new AssertionError(var8);
        }
        enforceType(var1, module0770.$ic2$);
        enforceType(var112, module0770.$ic61$);
        enforceType(var2, module0770.$ic3$);
        enforceType(var4, module0770.$ic29$);
        return f49078(var1, var112, var2, var4, var5, var6, var8);
    }
    
    public static SubLObject f49059(final SubLObject var156) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0770.NIL != module0751.f47217(var156) || (var156.isString() && module0770.NIL != module0751.f47148(var156)));
    }
    
    public static SubLObject f49088(final SubLObject var1, final SubLObject var112, final SubLObject var2, final SubLObject var4, final SubLObject var5, final SubLObject var6, final SubLObject var8, final SubLObject var109, final SubLObject var17, SubLObject var315) {
        if (var315 == module0770.UNPROVIDED) {
            var315 = module0770.$g6152$.getGlobalValue();
        }
        if (var17.isNumber() && module0770.NIL != module0579.f35496(var17, module0579.$g4288$.getGlobalValue())) {
            f49089(var1, var112, var2, var4, var5, var6, var8, var109, var17, var315);
        }
        return var17;
    }
    
    public static SubLObject f49089(final SubLObject var1, final SubLObject var112, final SubLObject var2, final SubLObject var4, final SubLObject var5, final SubLObject var6, final SubLObject var8, final SubLObject var109, final SubLObject var17, SubLObject var315) {
        if (var315 == module0770.UNPROVIDED) {
            var315 = module0770.$g6152$.getGlobalValue();
        }
        return module0067.f4886(var315, (SubLObject)ConsesLow.list(var1, var112, var2, var4, var5, var6, var8, var109), var17);
    }
    
    public static SubLObject f49090() {
        f49091();
        module0084.f5795(module0770.$g6152$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0770.$ic93$));
        return (SubLObject)module0770.NIL;
    }
    
    public static SubLObject f49092() {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        f49091();
        final SubLObject var10 = module0075.f5184((SubLObject)module0770.$ic94$);
        SubLObject var11 = (SubLObject)module0770.NIL;
        try {
            final SubLObject var12 = stream_macros.$stream_requires_locking$.currentBinding(var9);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0770.NIL, var9);
                var11 = compatibility.open_text(var10, (SubLObject)module0770.$ic95$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var12, var9);
            }
            if (!var11.isStream()) {
                Errors.error((SubLObject)module0770.$ic96$, var10);
            }
            final SubLObject var318_319 = var11;
            PrintLow.format(var318_319, (SubLObject)module0770.$ic97$, new SubLObject[] { Characters.CHAR_tab, Characters.CHAR_tab, Characters.CHAR_tab, Characters.CHAR_tab, Characters.CHAR_tab, Characters.CHAR_tab, Characters.CHAR_tab, Characters.CHAR_tab });
            SubLObject var13 = module0084.f5795(module0770.$g6152$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0770.$ic93$));
            SubLObject var14 = (SubLObject)module0770.NIL;
            var14 = var13.first();
            while (module0770.NIL != var13) {
                SubLObject var16;
                final SubLObject var15 = var16 = var14;
                SubLObject var17 = (SubLObject)module0770.NIL;
                SubLObject var18 = (SubLObject)module0770.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var16, var15, (SubLObject)module0770.$ic98$);
                var17 = var16.first();
                var16 = (var18 = var16.rest());
                SubLObject var326_327;
                final SubLObject var324_325 = var326_327 = var17;
                SubLObject var19 = (SubLObject)module0770.NIL;
                SubLObject var20 = (SubLObject)module0770.NIL;
                SubLObject var21 = (SubLObject)module0770.NIL;
                SubLObject var22 = (SubLObject)module0770.NIL;
                SubLObject var23 = (SubLObject)module0770.NIL;
                SubLObject var24 = (SubLObject)module0770.NIL;
                SubLObject var25 = (SubLObject)module0770.NIL;
                SubLObject var26 = (SubLObject)module0770.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var326_327, var324_325, (SubLObject)module0770.$ic99$);
                var19 = var326_327.first();
                var326_327 = var326_327.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var326_327, var324_325, (SubLObject)module0770.$ic99$);
                var20 = var326_327.first();
                var326_327 = var326_327.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var326_327, var324_325, (SubLObject)module0770.$ic99$);
                var21 = var326_327.first();
                var326_327 = var326_327.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var326_327, var324_325, (SubLObject)module0770.$ic99$);
                var22 = var326_327.first();
                var326_327 = var326_327.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var326_327, var324_325, (SubLObject)module0770.$ic99$);
                var23 = var326_327.first();
                var326_327 = var326_327.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var326_327, var324_325, (SubLObject)module0770.$ic99$);
                var24 = var326_327.first();
                var326_327 = var326_327.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var326_327, var324_325, (SubLObject)module0770.$ic99$);
                var25 = var326_327.first();
                var326_327 = var326_327.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var326_327, var324_325, (SubLObject)module0770.$ic99$);
                var26 = var326_327.first();
                var326_327 = var326_327.rest();
                if (module0770.NIL == var326_327) {
                    final SubLObject var27 = Sequences.cconcatenate(module0006.f205(var19), new SubLObject[] { module0006.f203((SubLObject)Characters.CHAR_tab), module0006.f205(var20), module0006.f203((SubLObject)Characters.CHAR_tab), module0006.f205(var26), module0006.f203((SubLObject)Characters.CHAR_tab), module0006.f207(var18), module0006.f203((SubLObject)Characters.CHAR_tab), module0006.f205(var21), module0006.f203((SubLObject)Characters.CHAR_tab), module0006.f205(var22), module0006.f203((SubLObject)Characters.CHAR_tab), module0006.f205(var23), module0006.f203((SubLObject)Characters.CHAR_tab), module0006.f205(var24), module0006.f203((SubLObject)Characters.CHAR_tab), module0006.f205(var25) });
                    PrintLow.format(var318_319, (SubLObject)module0770.$ic100$, Sequences.remove((SubLObject)Characters.CHAR_newline, Sequences.remove((SubLObject)Characters.CHAR_return, var27, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED), (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED));
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var324_325, (SubLObject)module0770.$ic99$);
                }
                var13 = var13.rest();
                var14 = var13.first();
            }
        }
        finally {
            final SubLObject var28 = Threads.$is_thread_performing_cleanupP$.currentBinding(var9);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var9);
                if (var11.isStream()) {
                    streams_high.close(var11, (SubLObject)module0770.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var28, var9);
            }
        }
        return var10;
    }
    
    public static SubLObject f49091() {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        final SubLObject var10 = module0067.f4880(Symbols.symbol_function((SubLObject)module0770.EQUAL), (SubLObject)module0770.UNPROVIDED);
        final SubLObject var11 = module0067.f4861(module0770.$g6152$.getGlobalValue());
        SubLObject var12 = (SubLObject)module0770.ZERO_INTEGER;
        final SubLObject var13 = module0012.$g75$.currentBinding(var9);
        final SubLObject var14 = module0012.$g76$.currentBinding(var9);
        final SubLObject var15 = module0012.$g77$.currentBinding(var9);
        final SubLObject var16 = module0012.$g78$.currentBinding(var9);
        try {
            module0012.$g75$.bind((SubLObject)module0770.ZERO_INTEGER, var9);
            module0012.$g76$.bind((SubLObject)module0770.NIL, var9);
            module0012.$g77$.bind((SubLObject)module0770.T, var9);
            module0012.$g78$.bind(Time.get_universal_time(), var9);
            module0012.f478((SubLObject)module0770.$ic101$);
            SubLObject var17;
            for (var17 = module0066.f4838(module0067.f4891(module0084.f5760(module0770.$g6152$.getGlobalValue()))); module0770.NIL == module0066.f4841(var17); var17 = module0066.f4840(var17)) {
                var9.resetMultipleValues();
                final SubLObject var18 = module0066.f4839(var17);
                final SubLObject var19 = var9.secondMultipleValue();
                var9.resetMultipleValues();
                SubLObject var21;
                final SubLObject var20 = var21 = var18;
                SubLObject var22 = (SubLObject)module0770.NIL;
                SubLObject var23 = (SubLObject)module0770.NIL;
                SubLObject var24 = (SubLObject)module0770.NIL;
                SubLObject var25 = (SubLObject)module0770.NIL;
                SubLObject var26 = (SubLObject)module0770.NIL;
                SubLObject var27 = (SubLObject)module0770.NIL;
                SubLObject var28 = (SubLObject)module0770.NIL;
                SubLObject var29 = (SubLObject)module0770.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0770.$ic102$);
                var22 = var21.first();
                var21 = var21.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0770.$ic102$);
                var23 = var21.first();
                var21 = var21.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0770.$ic102$);
                var24 = var21.first();
                var21 = var21.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0770.$ic102$);
                var25 = var21.first();
                var21 = var21.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0770.$ic102$);
                var26 = var21.first();
                var21 = var21.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0770.$ic102$);
                var27 = var21.first();
                var21 = var21.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0770.$ic102$);
                var28 = var21.first();
                var21 = var21.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0770.$ic102$);
                var29 = var21.first();
                var21 = var21.rest();
                if (module0770.NIL == var21) {
                    if (module0770.NIL == module0205.f13145((SubLObject)module0770.$ic103$, var22, (SubLObject)module0770.T, (SubLObject)module0770.UNPROVIDED) && module0770.NIL == module0205.f13145((SubLObject)module0770.$ic103$, var25, (SubLObject)module0770.T, (SubLObject)module0770.UNPROVIDED) && module0770.NIL == module0205.f13145((SubLObject)module0770.$ic103$, var26, (SubLObject)module0770.T, (SubLObject)module0770.UNPROVIDED) && module0770.NIL == module0178.f11359(var22, (SubLObject)module0770.UNPROVIDED)) {
                        var9.resetMultipleValues();
                        final SubLObject var30 = f49078(var22, var23, var24, var25, var26, var27, var28);
                        final SubLObject var31 = var9.secondMultipleValue();
                        final SubLObject var32 = var9.thirdMultipleValue();
                        final SubLObject var33 = var9.fourthMultipleValue();
                        final SubLObject var34 = var9.fifthMultipleValue();
                        var9.resetMultipleValues();
                        f49088(var22, var23, var24, var25, var26, var27, var28, var30, var34, var10);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)module0770.$ic102$);
                }
                var12 = Numbers.add(var12, (SubLObject)module0770.ONE_INTEGER);
                module0012.note_percent_progress(var12, var11);
            }
            module0066.f4842(var17);
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var16, var9);
            module0012.$g77$.rebind(var15, var9);
            module0012.$g76$.rebind(var14, var9);
            module0012.$g75$.rebind(var13, var9);
        }
        module0770.$g6152$.setGlobalValue(var10);
        return module0770.$g6152$.getGlobalValue();
    }
    
    public static SubLObject f49078(final SubLObject var1, SubLObject var112, SubLObject var2, SubLObject var4, SubLObject var5, SubLObject var6, SubLObject var8) {
        if (var112 == module0770.UNPROVIDED) {
            var112 = (SubLObject)module0770.$ic0$;
        }
        if (var2 == module0770.UNPROVIDED) {
            var2 = (SubLObject)module0770.$ic0$;
        }
        if (var4 == module0770.UNPROVIDED) {
            var4 = (SubLObject)module0770.$ic0$;
        }
        if (var5 == module0770.UNPROVIDED) {
            var5 = (SubLObject)module0770.$ic0$;
        }
        if (var6 == module0770.UNPROVIDED) {
            var6 = (SubLObject)module0770.$ic1$;
        }
        if (var8 == module0770.UNPROVIDED) {
            var8 = (SubLObject)module0770.NIL;
        }
        final SubLThread var113 = SubLProcess.currentSubLThread();
        if (module0770.$ic0$ == var4) {
            var4 = module0579.$g4260$.getDynamicValue(var113);
        }
        if (var4.isString()) {
            var4 = module0751.f47147(var4);
        }
        if (module0770.$ic0$ == var5) {
            var5 = module0579.$g4262$.getDynamicValue(var113);
        }
        if (module0770.$ic0$ == var112) {
            var112 = module0751.f47036(var1);
        }
        if (module0770.$ic0$ == var2) {
            var2 = module0751.f47142(var1, var112, var4, var5);
        }
        SubLObject var114 = (SubLObject)module0770.NIL;
        SubLObject var115 = (SubLObject)module0770.NIL;
        SubLObject var116 = (SubLObject)module0770.NIL;
        SubLObject var117 = (SubLObject)module0770.NIL;
        SubLObject var118 = (SubLObject)module0770.NIL;
        SubLObject var119 = (SubLObject)module0770.NIL;
        final SubLObject var120 = Errors.$continue_cerrorP$.currentBinding(var113);
        final SubLObject var121 = module0578.$g4234$.currentBinding(var113);
        try {
            Errors.$continue_cerrorP$.bind((SubLObject)module0770.NIL, var113);
            module0578.$g4234$.bind((SubLObject)module0770.T, var113);
            if (module0770.NIL != module0578.f35473()) {
                final SubLObject var18_336 = module0580.$g4361$.currentBinding(var113);
                try {
                    module0580.$g4361$.bind((SubLObject)module0770.NIL, var113);
                    var113.resetMultipleValues();
                    final SubLObject var18_337 = module0580.$g4362$.currentBinding(var113);
                    try {
                        module0580.$g4362$.bind(module0580.f35560(), var113);
                        final SubLObject var122 = var113.secondMultipleValue();
                        var113.resetMultipleValues();
                        try {
                            var113.resetMultipleValues();
                            final SubLObject var18_338 = module0580.$g4358$.currentBinding(var113);
                            try {
                                module0580.$g4358$.bind(module0580.f35544(), var113);
                                final SubLObject var123 = var113.secondMultipleValue();
                                var113.resetMultipleValues();
                                final SubLObject var18_339 = module0580.$g4359$.currentBinding(var113);
                                try {
                                    module0580.$g4359$.bind(module0580.f35545(), var113);
                                    final SubLObject var124 = module0580.$g4358$.getDynamicValue(var113);
                                    final SubLObject var18_340 = module0034.$g879$.currentBinding(var113);
                                    try {
                                        module0034.$g879$.bind(var124, var113);
                                        SubLObject var125 = (SubLObject)module0770.NIL;
                                        if (module0770.NIL != var124 && module0770.NIL == module0034.f1842(var124)) {
                                            var125 = module0034.f1869(var124);
                                            final SubLObject var126 = Threads.current_process();
                                            if (module0770.NIL == var125) {
                                                module0034.f1873(var124, var126);
                                            }
                                            else if (!var125.eql(var126)) {
                                                Errors.error((SubLObject)module0770.$ic15$);
                                            }
                                        }
                                        try {
                                            final SubLObject var18_341 = module0579.$g4322$.currentBinding(var113);
                                            try {
                                                module0579.$g4322$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0770.NIL != module0579.$g4322$.getDynamicValue(var113) && module0770.NIL == f49053(var1)), var113);
                                                SubLObject var127 = (SubLObject)module0770.NIL;
                                                final SubLObject var128 = Time.get_internal_real_time();
                                                if (module0770.$ic28$ == var2) {
                                                    var113.resetMultipleValues();
                                                    final SubLObject var344_345 = f49093(var1, var112, (SubLObject)module0770.$ic28$, var4, var5, var6, var8);
                                                    final SubLObject var346_347 = var113.secondMultipleValue();
                                                    final SubLObject var348_349 = var113.thirdMultipleValue();
                                                    final SubLObject var350_351 = var113.fourthMultipleValue();
                                                    final SubLObject var352_353 = var113.fifthMultipleValue();
                                                    var113.resetMultipleValues();
                                                    var115 = var344_345;
                                                    var116 = var346_347;
                                                    var117 = var348_349;
                                                    var118 = var350_351;
                                                    var119 = var352_353;
                                                }
                                                else {
                                                    final SubLObject var18_342 = module0579.$g4287$.currentBinding(var113);
                                                    try {
                                                        module0579.$g4287$.bind(module0580.f35610((SubLObject)module0770.TWO_INTEGER), var113);
                                                        var113.resetMultipleValues();
                                                        final SubLObject var355_356 = f49093(var1, var112, var2, var4, var5, var6, var8);
                                                        final SubLObject var357_358 = var113.secondMultipleValue();
                                                        final SubLObject var359_360 = var113.thirdMultipleValue();
                                                        final SubLObject var361_362 = var113.fourthMultipleValue();
                                                        final SubLObject var363_364 = var113.fifthMultipleValue();
                                                        var113.resetMultipleValues();
                                                        var115 = var355_356;
                                                        var116 = var357_358;
                                                        var117 = var359_360;
                                                        var118 = var361_362;
                                                        var119 = var363_364;
                                                    }
                                                    finally {
                                                        module0579.$g4287$.rebind(var18_342, var113);
                                                    }
                                                    if (module0770.NIL == var115 && module0770.NIL == module0048.f3335(module0579.$g4287$.getDynamicValue(var113), module0579.$g4288$.getGlobalValue())) {
                                                        var113.resetMultipleValues();
                                                        final SubLObject var365_366 = f49093(var1, var112, var2, var4, var5, var6, var8);
                                                        final SubLObject var367_368 = var113.secondMultipleValue();
                                                        final SubLObject var369_370 = var113.thirdMultipleValue();
                                                        final SubLObject var371_372 = var113.fourthMultipleValue();
                                                        final SubLObject var373_374 = var113.fifthMultipleValue();
                                                        var113.resetMultipleValues();
                                                        var115 = var365_366;
                                                        var116 = var367_368;
                                                        var117 = var369_370;
                                                        var118 = var371_372;
                                                        var119 = var373_374;
                                                    }
                                                }
                                                var127 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var128), time_high.$internal_time_units_per_second$.getGlobalValue());
                                                if (var127.numG((SubLObject)module0770.ONE_INTEGER) && module0770.NIL != module0578.f35470((SubLObject)module0770.ONE_INTEGER) && module0770.NIL == module0578.f35477()) {
                                                    Errors.warn((SubLObject)module0770.$ic104$, var127, var1);
                                                }
                                            }
                                            finally {
                                                module0579.$g4322$.rebind(var18_341, var113);
                                            }
                                        }
                                        finally {
                                            final SubLObject var18_343 = Threads.$is_thread_performing_cleanupP$.currentBinding(var113);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var113);
                                                if (module0770.NIL != var124 && module0770.NIL == var125) {
                                                    module0034.f1873(var124, (SubLObject)module0770.NIL);
                                                }
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var18_343, var113);
                                            }
                                        }
                                    }
                                    finally {
                                        module0034.$g879$.rebind(var18_340, var113);
                                    }
                                }
                                finally {
                                    module0580.$g4359$.rebind(var18_339, var113);
                                }
                                if (var123 == module0770.$ic21$ && module0770.NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var113))) {
                                    module0034.f1891(module0580.$g4358$.getDynamicValue(var113));
                                }
                            }
                            finally {
                                module0580.$g4358$.rebind(var18_338, var113);
                            }
                        }
                        finally {
                            final SubLObject var18_344 = Threads.$is_thread_performing_cleanupP$.currentBinding(var113);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var113);
                                if (module0770.NIL == var122) {
                                    module0580.f35554(module0580.$g4362$.getDynamicValue(var113));
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var18_344, var113);
                            }
                        }
                    }
                    finally {
                        module0580.$g4362$.rebind(var18_337, var113);
                    }
                }
                finally {
                    module0580.$g4361$.rebind(var18_336, var113);
                }
            }
            else {
                try {
                    var113.throwStack.push(module0003.$g3$.getGlobalValue());
                    final SubLObject var18_345 = Errors.$error_handler$.currentBinding(var113);
                    try {
                        Errors.$error_handler$.bind((SubLObject)module0770.$ic22$, var113);
                        try {
                            final SubLObject var18_346 = module0580.$g4361$.currentBinding(var113);
                            try {
                                module0580.$g4361$.bind((SubLObject)module0770.NIL, var113);
                                var113.resetMultipleValues();
                                final SubLObject var18_347 = module0580.$g4362$.currentBinding(var113);
                                try {
                                    module0580.$g4362$.bind(module0580.f35560(), var113);
                                    final SubLObject var129 = var113.secondMultipleValue();
                                    var113.resetMultipleValues();
                                    try {
                                        var113.resetMultipleValues();
                                        final SubLObject var18_348 = module0580.$g4358$.currentBinding(var113);
                                        try {
                                            module0580.$g4358$.bind(module0580.f35544(), var113);
                                            final SubLObject var130 = var113.secondMultipleValue();
                                            var113.resetMultipleValues();
                                            final SubLObject var18_349 = module0580.$g4359$.currentBinding(var113);
                                            try {
                                                module0580.$g4359$.bind(module0580.f35545(), var113);
                                                final SubLObject var131 = module0580.$g4358$.getDynamicValue(var113);
                                                final SubLObject var18_350 = module0034.$g879$.currentBinding(var113);
                                                try {
                                                    module0034.$g879$.bind(var131, var113);
                                                    SubLObject var132 = (SubLObject)module0770.NIL;
                                                    if (module0770.NIL != var131 && module0770.NIL == module0034.f1842(var131)) {
                                                        var132 = module0034.f1869(var131);
                                                        final SubLObject var133 = Threads.current_process();
                                                        if (module0770.NIL == var132) {
                                                            module0034.f1873(var131, var133);
                                                        }
                                                        else if (!var132.eql(var133)) {
                                                            Errors.error((SubLObject)module0770.$ic15$);
                                                        }
                                                    }
                                                    try {
                                                        final SubLObject var18_351 = module0579.$g4322$.currentBinding(var113);
                                                        try {
                                                            module0579.$g4322$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0770.NIL != module0579.$g4322$.getDynamicValue(var113) && module0770.NIL == f49053(var1)), var113);
                                                            SubLObject var134 = (SubLObject)module0770.NIL;
                                                            final SubLObject var135 = Time.get_internal_real_time();
                                                            if (module0770.$ic28$ == var2) {
                                                                var113.resetMultipleValues();
                                                                final SubLObject var384_385 = f49093(var1, var112, (SubLObject)module0770.$ic28$, var4, var5, var6, var8);
                                                                final SubLObject var386_387 = var113.secondMultipleValue();
                                                                final SubLObject var388_389 = var113.thirdMultipleValue();
                                                                final SubLObject var390_391 = var113.fourthMultipleValue();
                                                                final SubLObject var392_393 = var113.fifthMultipleValue();
                                                                var113.resetMultipleValues();
                                                                var115 = var384_385;
                                                                var116 = var386_387;
                                                                var117 = var388_389;
                                                                var118 = var390_391;
                                                                var119 = var392_393;
                                                            }
                                                            else {
                                                                final SubLObject var18_352 = module0579.$g4287$.currentBinding(var113);
                                                                try {
                                                                    module0579.$g4287$.bind(module0580.f35610((SubLObject)module0770.TWO_INTEGER), var113);
                                                                    var113.resetMultipleValues();
                                                                    final SubLObject var395_396 = f49093(var1, var112, var2, var4, var5, var6, var8);
                                                                    final SubLObject var397_398 = var113.secondMultipleValue();
                                                                    final SubLObject var399_400 = var113.thirdMultipleValue();
                                                                    final SubLObject var401_402 = var113.fourthMultipleValue();
                                                                    final SubLObject var403_404 = var113.fifthMultipleValue();
                                                                    var113.resetMultipleValues();
                                                                    var115 = var395_396;
                                                                    var116 = var397_398;
                                                                    var117 = var399_400;
                                                                    var118 = var401_402;
                                                                    var119 = var403_404;
                                                                }
                                                                finally {
                                                                    module0579.$g4287$.rebind(var18_352, var113);
                                                                }
                                                                if (module0770.NIL == var115 && module0770.NIL == module0048.f3335(module0579.$g4287$.getDynamicValue(var113), module0579.$g4288$.getGlobalValue())) {
                                                                    var113.resetMultipleValues();
                                                                    final SubLObject var405_406 = f49093(var1, var112, var2, var4, var5, var6, var8);
                                                                    final SubLObject var407_408 = var113.secondMultipleValue();
                                                                    final SubLObject var409_410 = var113.thirdMultipleValue();
                                                                    final SubLObject var411_412 = var113.fourthMultipleValue();
                                                                    final SubLObject var413_414 = var113.fifthMultipleValue();
                                                                    var113.resetMultipleValues();
                                                                    var115 = var405_406;
                                                                    var116 = var407_408;
                                                                    var117 = var409_410;
                                                                    var118 = var411_412;
                                                                    var119 = var413_414;
                                                                }
                                                            }
                                                            var134 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var135), time_high.$internal_time_units_per_second$.getGlobalValue());
                                                            if (var134.numG((SubLObject)module0770.ONE_INTEGER) && module0770.NIL != module0578.f35470((SubLObject)module0770.ONE_INTEGER) && module0770.NIL == module0578.f35477()) {
                                                                Errors.warn((SubLObject)module0770.$ic104$, var134, var1);
                                                            }
                                                        }
                                                        finally {
                                                            module0579.$g4322$.rebind(var18_351, var113);
                                                        }
                                                    }
                                                    finally {
                                                        final SubLObject var18_353 = Threads.$is_thread_performing_cleanupP$.currentBinding(var113);
                                                        try {
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var113);
                                                            if (module0770.NIL != var131 && module0770.NIL == var132) {
                                                                module0034.f1873(var131, (SubLObject)module0770.NIL);
                                                            }
                                                        }
                                                        finally {
                                                            Threads.$is_thread_performing_cleanupP$.rebind(var18_353, var113);
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0034.$g879$.rebind(var18_350, var113);
                                                }
                                            }
                                            finally {
                                                module0580.$g4359$.rebind(var18_349, var113);
                                            }
                                            if (var130 == module0770.$ic21$ && module0770.NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var113))) {
                                                module0034.f1891(module0580.$g4358$.getDynamicValue(var113));
                                            }
                                        }
                                        finally {
                                            module0580.$g4358$.rebind(var18_348, var113);
                                        }
                                    }
                                    finally {
                                        final SubLObject var18_354 = Threads.$is_thread_performing_cleanupP$.currentBinding(var113);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var113);
                                            if (module0770.NIL == var129) {
                                                module0580.f35554(module0580.$g4362$.getDynamicValue(var113));
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var18_354, var113);
                                        }
                                    }
                                }
                                finally {
                                    module0580.$g4362$.rebind(var18_347, var113);
                                }
                            }
                            finally {
                                module0580.$g4361$.rebind(var18_346, var113);
                            }
                        }
                        catch (Throwable var136) {
                            Errors.handleThrowable(var136, (SubLObject)module0770.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(var18_345, var113);
                    }
                }
                catch (Throwable var137) {
                    var114 = Errors.handleThrowable(var137, module0003.$g3$.getGlobalValue());
                }
                finally {
                    var113.throwStack.pop();
                }
                if (var114.isString() && module0770.NIL == module0578.f35477()) {
                    Errors.warn(Sequences.cconcatenate(module0752.f47234(var114), (SubLObject)module0770.$ic23$), module0579.f35508());
                }
            }
        }
        finally {
            module0578.$g4234$.rebind(var121, var113);
            Errors.$continue_cerrorP$.rebind(var120, var113);
        }
        f49088(var1, var112, var2, var4, var5, var6, var8, var115, var119, (SubLObject)module0770.UNPROVIDED);
        return Values.values(var115, var116, var117, var118, var119);
    }
    
    public static SubLObject f49053(final SubLObject var1) {
        if (module0579.f35487().isPositive()) {
            return (SubLObject)module0770.NIL;
        }
        if (module0770.NIL != module0174.f11035(var1)) {
            return (SubLObject)module0770.NIL;
        }
        if (module0770.NIL != module0167.f10813(var1)) {
            return (SubLObject)module0770.NIL;
        }
        if (module0770.NIL != module0202.f12590(var1)) {
            return (SubLObject)module0770.NIL;
        }
        if (module0770.NIL != module0578.f35470((SubLObject)module0770.ONE_INTEGER)) {
            PrintLow.format((SubLObject)module0770.T, (SubLObject)module0770.$ic105$, var1);
        }
        return (SubLObject)module0770.T;
    }
    
    public static SubLObject f49093(final SubLObject var417, final SubLObject var112, final SubLObject var2, final SubLObject var4, final SubLObject var5, final SubLObject var6, SubLObject var8) {
        if (var8 == module0770.UNPROVIDED) {
            var8 = (SubLObject)module0770.NIL;
        }
        final SubLThread var418 = SubLProcess.currentSubLThread();
        SubLObject var419 = (SubLObject)module0770.NIL;
        SubLObject var420 = (SubLObject)module0770.NIL;
        SubLObject var421 = (SubLObject)module0770.NIL;
        SubLObject var422 = (SubLObject)module0770.NIL;
        SubLObject var423 = (SubLObject)module0770.NIL;
        final SubLObject var424 = module0580.$g4363$.currentBinding(var418);
        final SubLObject var425 = module0580.$g4366$.currentBinding(var418);
        final SubLObject var426 = module0580.$g4364$.currentBinding(var418);
        try {
            module0580.$g4363$.bind(module0054.f3968(), var418);
            module0580.$g4366$.bind(module0580.f35568(), var418);
            module0580.$g4364$.bind((SubLObject)module0770.T, var418);
            try {
                final SubLObject var427 = module0751.f46740(var417);
                final SubLObject var428 = (var112 == module0770.$ic16$) ? module0749.f46494((SubLObject)module0770.NIL, var427, (SubLObject)module0770.UNPROVIDED) : module0759.f48043(module0759.f48039(var427, var112, var2), (SubLObject)module0770.UNPROVIDED);
                if (var112 == module0770.$ic16$) {
                    module0756.f47784(var428, var2, (SubLObject)module0770.UNPROVIDED);
                    f49065(var428, var4, var5, var6);
                }
                else {
                    module0756.f47527(var428, var8);
                    module0759.f48066(var428, var4, var5, var6);
                }
                if (module0770.NIL != module0756.f47479(var428)) {
                    var419 = module0581.f35681(module0756.f47480(var428, (SubLObject)module0770.UNPROVIDED), var6);
                    var420 = module0756.f47691(var428);
                    var421 = module0756.f47510(var428);
                    var422 = module0756.f47467(var428);
                    var423 = module0756.f47627(var428);
                }
            }
            finally {
                final SubLObject var18_420 = Threads.$is_thread_performing_cleanupP$.currentBinding(var418);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var418);
                    module0580.f35566();
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var18_420, var418);
                }
            }
        }
        finally {
            module0580.$g4364$.rebind(var426, var418);
            module0580.$g4366$.rebind(var425, var418);
            module0580.$g4363$.rebind(var424, var418);
        }
        return Values.values(var419, var420, var421, var422, var423);
    }
    
    public static SubLObject f49094(final SubLObject var417, final SubLObject var8, SubLObject var112, SubLObject var2, SubLObject var4, SubLObject var5, SubLObject var6) {
        if (var112 == module0770.UNPROVIDED) {
            var112 = (SubLObject)module0770.$ic0$;
        }
        if (var2 == module0770.UNPROVIDED) {
            var2 = (SubLObject)module0770.$ic0$;
        }
        if (var4 == module0770.UNPROVIDED) {
            var4 = (SubLObject)module0770.$ic0$;
        }
        if (var5 == module0770.UNPROVIDED) {
            var5 = (SubLObject)module0770.$ic0$;
        }
        if (var6 == module0770.UNPROVIDED) {
            var6 = (SubLObject)module0770.$ic1$;
        }
        return f49067(var417, var112, var2, var4, var5, var6, var8);
    }
    
    public static SubLObject f49095(final SubLObject var1, SubLObject var2, SubLObject var4, SubLObject var5, SubLObject var6, SubLObject var8) {
        if (var2 == module0770.UNPROVIDED) {
            var2 = (SubLObject)module0770.$ic0$;
        }
        if (var4 == module0770.UNPROVIDED) {
            var4 = module0579.$g4260$.getDynamicValue();
        }
        if (var5 == module0770.UNPROVIDED) {
            var5 = module0579.$g4262$.getDynamicValue();
        }
        if (var6 == module0770.UNPROVIDED) {
            var6 = (SubLObject)module0770.$ic1$;
        }
        if (var8 == module0770.UNPROVIDED) {
            var8 = (SubLObject)module0770.NIL;
        }
        final SubLThread var9 = SubLProcess.currentSubLThread();
        assert module0770.NIL != module0751.f46980(var2) : var2;
        var9.resetMultipleValues();
        final SubLObject var10 = f49050(var1, var2, (SubLObject)module0770.NIL, var4, var5, var6, (SubLObject)module0770.T, var8);
        final SubLObject var11 = var9.secondMultipleValue();
        final SubLObject var12 = var9.thirdMultipleValue();
        final SubLObject var13 = var9.fourthMultipleValue();
        final SubLObject var14 = var9.fifthMultipleValue();
        var9.resetMultipleValues();
        final SubLObject var15 = conses_high.copy_list(var13);
        if (module0770.NIL != var10) {
            module0758.f47886(var15, (SubLObject)module0770.$ic106$);
        }
        final SubLObject var16 = module0581.f35681(module0756.f47713(var15, (SubLObject)module0770.T), var6);
        return Values.values(var16, var11, var12, var15, var14);
    }
    
    public static SubLObject f49096(final SubLObject var1, SubLObject var2) {
        if (var2 == module0770.UNPROVIDED) {
            var2 = (SubLObject)module0770.NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        var3.resetMultipleValues();
        final SubLObject var4 = f49050(var1, var2, (SubLObject)module0770.NIL, module0579.$g4260$.getDynamicValue(var3), module0579.$g4262$.getDynamicValue(var3), module0579.$g4259$.getDynamicValue(var3), (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED);
        final SubLObject var5 = var3.secondMultipleValue();
        var3.resetMultipleValues();
        return module0728.f44499(var4, var5);
    }
    
    public static SubLObject f49097(final SubLObject var210, SubLObject var2, SubLObject var423) {
        if (var2 == module0770.UNPROVIDED) {
            var2 = (SubLObject)module0770.$ic0$;
        }
        if (var423 == module0770.UNPROVIDED) {
            var423 = module0751.f47200();
        }
        final SubLThread var424 = SubLProcess.currentSubLThread();
        SubLObject var425 = (SubLObject)module0770.NIL;
        SubLObject var426 = (SubLObject)module0770.NIL;
        SubLObject var427 = (SubLObject)module0770.NIL;
        SubLObject var428 = (SubLObject)module0770.NIL;
        if (module0770.$ic0$ == var2) {
            var2 = module0751.f47142(var210, (SubLObject)module0770.$ic16$, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED);
        }
        final SubLObject var429 = module0580.$g4363$.currentBinding(var424);
        final SubLObject var430 = module0580.$g4366$.currentBinding(var424);
        final SubLObject var431 = module0580.$g4364$.currentBinding(var424);
        try {
            module0580.$g4363$.bind(module0054.f3968(), var424);
            module0580.$g4366$.bind(module0580.f35568(), var424);
            module0580.$g4364$.bind((SubLObject)module0770.T, var424);
            try {
                final SubLObject var432 = module0756.f47484(module0756.f47463(var210, var423, (SubLObject)module0770.UNPROVIDED), (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED);
                if (module0770.NIL != module0578.f35470((SubLObject)module0770.ONE_INTEGER)) {
                    PrintLow.format((SubLObject)module0770.T, (SubLObject)module0770.$ic107$, module0756.f47487(var432, (SubLObject)module0770.UNPROVIDED));
                }
                module0756.f47784(var432, var2, (SubLObject)module0770.UNPROVIDED);
                final SubLObject var433 = module0580.f35634(var432);
                try {
                    f49065(var432, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED);
                }
                finally {
                    final SubLObject var18_424 = Threads.$is_thread_performing_cleanupP$.currentBinding(var424);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var424);
                        module0580.f35635(var432, var433, (SubLObject)module0770.UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var18_424, var424);
                    }
                }
                if (module0770.NIL != module0756.f47479(var432)) {
                    var425 = module0756.f47480(var432, (SubLObject)module0770.UNPROVIDED);
                    var426 = module0756.f47691(var432);
                    var427 = module0756.f47510(var432);
                    var428 = module0756.f47467(var432);
                }
            }
            finally {
                final SubLObject var18_425 = Threads.$is_thread_performing_cleanupP$.currentBinding(var424);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var424);
                    module0580.f35566();
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var18_425, var424);
                }
            }
        }
        finally {
            module0580.$g4364$.rebind(var431, var424);
            module0580.$g4366$.rebind(var430, var424);
            module0580.$g4363$.rebind(var429, var424);
        }
        return Values.values(var425, var426, var427, var428);
    }
    
    public static SubLObject f49098() {
        module0770.$g6153$.setGlobalValue((SubLObject)module0770.$ic109$);
        return module0770.$g6153$.getGlobalValue();
    }
    
    public static SubLObject f49099() {
        return module0035.sublisp_boolean(module0770.$g6153$.getGlobalValue());
    }
    
    public static SubLObject f49100() {
        if (module0770.NIL != f49099()) {
            return (SubLObject)module0770.$ic109$;
        }
        return f49101();
    }
    
    public static SubLObject f49101() {
        if (module0770.NIL != module0018.f971()) {
            module0579.f35514();
            module0763.f48234();
            f49102((SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED);
            module0770.$g6153$.setGlobalValue((SubLObject)module0770.T);
            return (SubLObject)module0770.$ic109$;
        }
        final SubLObject var44 = Sequences.cconcatenate((SubLObject)module0770.$ic18$, new SubLObject[] { module0006.f205((SubLObject)module0770.ONE_INTEGER), module0770.$ic19$, module0006.f203((SubLObject)module0770.$ic110$) });
        module0578.f35476(var44, (SubLObject)ConsesLow.list(module0770.EMPTY_SUBL_OBJECT_ARRAY));
        return (SubLObject)module0770.$ic111$;
    }
    
    public static SubLObject f49102(SubLObject var426, SubLObject var232) {
        if (var426 == module0770.UNPROVIDED) {
            var426 = (SubLObject)module0770.NIL;
        }
        if (var232 == module0770.UNPROVIDED) {
            var232 = (SubLObject)module0770.NIL;
        }
        final SubLThread var427 = SubLProcess.currentSubLThread();
        if (module0770.NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var427))) {
            module0034.f1891(module0580.$g4358$.getDynamicValue(var427));
        }
        module0767.f48890();
        module0765.f48717();
        module0731.f44773();
        module0764.f48451();
        module0751.f47004();
        module0751.f47011();
        module0751.f47104();
        module0767.f48880();
        return (SubLObject)module0770.NIL;
    }
    
    public static SubLObject f49065(final SubLObject var47, SubLObject var4, SubLObject var5, SubLObject var6) {
        if (var4 == module0770.UNPROVIDED) {
            var4 = ((module0770.NIL != module0579.$g4260$.getDynamicValue()) ? module0579.$g4260$.getDynamicValue() : module0770.$ic114$);
        }
        if (var5 == module0770.UNPROVIDED) {
            var5 = ((module0770.NIL != module0579.$g4262$.getDynamicValue()) ? module0579.$g4262$.getDynamicValue() : module0770.$ic114$);
        }
        if (var6 == module0770.UNPROVIDED) {
            var6 = (SubLObject)((module0770.NIL != module0579.$g4259$.getDynamicValue()) ? module0579.$g4259$.getDynamicValue() : module0770.$ic1$);
        }
        final SubLThread var48 = SubLProcess.currentSubLThread();
        final SubLObject var49 = module0018.$g696$.currentBinding(var48);
        final SubLObject var50 = module0271.$g2562$.currentBinding(var48);
        final SubLObject var51 = module0144.$g1752$.currentBinding(var48);
        final SubLObject var52 = module0271.$g2560$.currentBinding(var48);
        final SubLObject var53 = module0271.$g2561$.currentBinding(var48);
        final SubLObject var54 = module0271.$g2563$.currentBinding(var48);
        final SubLObject var55 = module0146.$g2055$.currentBinding(var48);
        final SubLObject var56 = module0144.$g1771$.currentBinding(var48);
        final SubLObject var57 = module0144.$g1769$.currentBinding(var48);
        final SubLObject var58 = module0152.$g2107$.currentBinding(var48);
        final SubLObject var59 = module0110.$g1374$.currentBinding(var48);
        final SubLObject var60 = module0271.$g2564$.currentBinding(var48);
        final SubLObject var61 = module0579.$g4334$.currentBinding(var48);
        final SubLObject var62 = module0579.$g4270$.currentBinding(var48);
        try {
            module0018.$g696$.bind((SubLObject)module0770.NIL, var48);
            module0271.$g2562$.bind((SubLObject)module0770.NIL, var48);
            module0144.$g1752$.bind((SubLObject)module0770.NIL, var48);
            module0271.$g2560$.bind((SubLObject)module0770.NIL, var48);
            module0271.$g2561$.bind((SubLObject)module0770.NIL, var48);
            module0271.$g2563$.bind((SubLObject)module0770.NIL, var48);
            module0146.$g2055$.bind((SubLObject)module0770.NIL, var48);
            module0144.$g1771$.bind((SubLObject)module0770.NIL, var48);
            module0144.$g1769$.bind((SubLObject)module0770.NIL, var48);
            module0152.$g2107$.bind((SubLObject)module0770.NIL, var48);
            module0110.$g1374$.bind((SubLObject)module0770.T, var48);
            module0271.$g2564$.bind((SubLObject)module0770.T, var48);
            module0579.$g4334$.bind(module0048.f_1X(module0579.f35487()), var48);
            module0579.$g4270$.bind(module0579.$g4270$.getDynamicValue(var48), var48);
            final SubLObject var63 = module0756.f47487(var47, (SubLObject)module0770.UNPROVIDED);
            final SubLObject var64 = module0580.f35520(var63);
            SubLObject var65 = (SubLObject)module0770.NIL;
            final SubLObject var18_438 = Errors.$continue_cerrorP$.currentBinding(var48);
            final SubLObject var19_439 = module0578.$g4234$.currentBinding(var48);
            try {
                Errors.$continue_cerrorP$.bind((SubLObject)module0770.NIL, var48);
                module0578.$g4234$.bind((SubLObject)module0770.T, var48);
                if (module0770.NIL != module0578.f35473()) {
                    module0751.f46742(var47, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED);
                    final SubLObject var18_439 = module0579.$g4323$.currentBinding(var48);
                    try {
                        module0579.$g4323$.bind((module0770.NIL != module0067.f4852(module0579.$g4323$.getDynamicValue(var48))) ? module0579.$g4323$.getDynamicValue(var48) : module0067.f4880((SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED), var48);
                        final SubLObject var66 = module0754.f47307();
                        final SubLObject var18_440 = module0754.$g6064$.currentBinding(var48);
                        final SubLObject var19_440 = module0579.$g4324$.currentBinding(var48);
                        final SubLObject var39_444 = module0579.$g4325$.currentBinding(var48);
                        try {
                            module0754.$g6064$.bind(module0754.$g6064$.getDynamicValue(var48), var48);
                            module0579.$g4324$.bind((module0770.NIL != module0067.f4852(module0579.$g4324$.getDynamicValue(var48))) ? module0579.$g4324$.getDynamicValue(var48) : module0067.f4880(Symbols.symbol_function((SubLObject)module0770.EQL), (SubLObject)module0770.SIXTEEN_INTEGER), var48);
                            module0579.$g4325$.bind(module0048.f_1X(module0579.$g4325$.getDynamicValue(var48)), var48);
                            if (module0770.NIL != module0578.f35470((SubLObject)module0770.TWO_INTEGER)) {
                                PrintLow.format((SubLObject)module0770.T, (SubLObject)module0770.$ic115$, module0579.$g4325$.getDynamicValue(var48), module0067.f4903(module0579.$g4323$.getDynamicValue(var48)));
                            }
                            try {
                                if (module0770.NIL != var64) {
                                    if (module0770.NIL != module0578.f35470((SubLObject)module0770.ONE_INTEGER)) {
                                        PrintLow.format((SubLObject)module0770.T, (SubLObject)module0770.$ic116$, var64, var63);
                                    }
                                    module0756.f47723(var47, var64);
                                    if (module0756.f47481(var47, (SubLObject)module0770.UNPROVIDED).eql(module0770.$ic117$)) {
                                        f49103(var47);
                                    }
                                }
                                else if (module0579.f35487().numG(module0770.$g6154$.getGlobalValue())) {
                                    final SubLObject var67 = Sequences.cconcatenate((SubLObject)module0770.$ic18$, new SubLObject[] { module0006.f205((SubLObject)module0770.ONE_INTEGER), module0770.$ic19$, module0006.f203((SubLObject)module0770.$ic118$) });
                                    module0578.f35476(var67, (SubLObject)ConsesLow.list(module0579.f35508()));
                                }
                                else {
                                    module0756.f47803(var47);
                                    if (module0770.NIL == module0756.f47800(var47, (SubLObject)module0770.T)) {
                                        if (module0770.NIL != module0756.f47520(var47) && module0770.NIL != module0578.f35470((SubLObject)module0770.ONE_INTEGER)) {
                                            PrintLow.format((SubLObject)module0770.T, (SubLObject)module0770.$ic119$, var63, module0756.f47482(var47));
                                        }
                                        final SubLObject var18_441 = module0751.$g5999$.currentBinding(var48);
                                        try {
                                            module0751.$g5999$.bind(module0751.f46595(), var48);
                                            module0751.f46591((SubLObject)module0770.$ic120$);
                                            try {
                                                module0751.f46880(var47);
                                            }
                                            finally {
                                                final SubLObject var18_442 = Threads.$is_thread_performing_cleanupP$.currentBinding(var48);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var48);
                                                    final SubLObject var18_443 = module0579.$g4260$.currentBinding(var48);
                                                    final SubLObject var19_441 = module0579.$g4262$.currentBinding(var48);
                                                    final SubLObject var39_445 = module0584.$g4396$.currentBinding(var48);
                                                    final SubLObject var179_450 = module0579.$g4259$.currentBinding(var48);
                                                    final SubLObject var427_451 = module0579.$g4293$.currentBinding(var48);
                                                    try {
                                                        module0579.$g4260$.bind(var4, var48);
                                                        module0579.$g4262$.bind(var5, var48);
                                                        module0584.$g4396$.bind(module0579.$g4260$.getDynamicValue(var48), var48);
                                                        module0579.$g4259$.bind(var6, var48);
                                                        module0579.$g4293$.bind((module0770.NIL != module0077.f5302(module0579.$g4293$.getDynamicValue(var48))) ? module0579.$g4293$.getDynamicValue(var48) : module0751.f46876(var63), var48);
                                                        if (module0770.NIL != module0580.f35574()) {
                                                            module0755.f47388();
                                                            final SubLObject var18_444 = module0580.$g4361$.currentBinding(var48);
                                                            try {
                                                                module0580.$g4361$.bind((SubLObject)module0770.NIL, var48);
                                                                var48.resetMultipleValues();
                                                                final SubLObject var18_445 = module0580.$g4362$.currentBinding(var48);
                                                                try {
                                                                    module0580.$g4362$.bind(module0580.f35560(), var48);
                                                                    final SubLObject var68 = var48.secondMultipleValue();
                                                                    var48.resetMultipleValues();
                                                                    try {
                                                                        var48.resetMultipleValues();
                                                                        final SubLObject var18_446 = module0580.$g4358$.currentBinding(var48);
                                                                        try {
                                                                            module0580.$g4358$.bind(module0580.f35544(), var48);
                                                                            final SubLObject var69 = var48.secondMultipleValue();
                                                                            var48.resetMultipleValues();
                                                                            final SubLObject var18_447 = module0580.$g4359$.currentBinding(var48);
                                                                            try {
                                                                                module0580.$g4359$.bind(module0580.f35545(), var48);
                                                                                final SubLObject var70 = module0580.$g4358$.getDynamicValue(var48);
                                                                                final SubLObject var18_448 = module0034.$g879$.currentBinding(var48);
                                                                                try {
                                                                                    module0034.$g879$.bind(var70, var48);
                                                                                    SubLObject var71 = (SubLObject)module0770.NIL;
                                                                                    if (module0770.NIL != var70 && module0770.NIL == module0034.f1842(var70)) {
                                                                                        var71 = module0034.f1869(var70);
                                                                                        final SubLObject var72 = Threads.current_process();
                                                                                        if (module0770.NIL == var71) {
                                                                                            module0034.f1873(var70, var72);
                                                                                        }
                                                                                        else if (!var71.eql(var72)) {
                                                                                            Errors.error((SubLObject)module0770.$ic15$);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        f49104(var47);
                                                                                    }
                                                                                    finally {
                                                                                        final SubLObject var18_449 = Threads.$is_thread_performing_cleanupP$.currentBinding(var48);
                                                                                        try {
                                                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var48);
                                                                                            if (module0770.NIL != var70 && module0770.NIL == var71) {
                                                                                                module0034.f1873(var70, (SubLObject)module0770.NIL);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            Threads.$is_thread_performing_cleanupP$.rebind(var18_449, var48);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0034.$g879$.rebind(var18_448, var48);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0580.$g4359$.rebind(var18_447, var48);
                                                                            }
                                                                            if (var69 == module0770.$ic21$ && module0770.NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var48))) {
                                                                                module0034.f1891(module0580.$g4358$.getDynamicValue(var48));
                                                                            }
                                                                        }
                                                                        finally {
                                                                            module0580.$g4358$.rebind(var18_446, var48);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        final SubLObject var18_450 = Threads.$is_thread_performing_cleanupP$.currentBinding(var48);
                                                                        try {
                                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var48);
                                                                            if (module0770.NIL == var68) {
                                                                                module0580.f35554(module0580.$g4362$.getDynamicValue(var48));
                                                                            }
                                                                        }
                                                                        finally {
                                                                            Threads.$is_thread_performing_cleanupP$.rebind(var18_450, var48);
                                                                        }
                                                                    }
                                                                }
                                                                finally {
                                                                    module0580.$g4362$.rebind(var18_445, var48);
                                                                }
                                                            }
                                                            finally {
                                                                module0580.$g4361$.rebind(var18_444, var48);
                                                            }
                                                        }
                                                        else {
                                                            final SubLObject var18_451 = module0579.$g4321$.currentBinding(var48);
                                                            try {
                                                                module0579.$g4321$.bind(module0755.f47380(), var48);
                                                                module0580.f35572();
                                                                try {
                                                                    module0755.f47388();
                                                                    final SubLObject var18_452 = module0580.$g4361$.currentBinding(var48);
                                                                    try {
                                                                        module0580.$g4361$.bind((SubLObject)module0770.NIL, var48);
                                                                        var48.resetMultipleValues();
                                                                        final SubLObject var18_453 = module0580.$g4362$.currentBinding(var48);
                                                                        try {
                                                                            module0580.$g4362$.bind(module0580.f35560(), var48);
                                                                            final SubLObject var73 = var48.secondMultipleValue();
                                                                            var48.resetMultipleValues();
                                                                            try {
                                                                                var48.resetMultipleValues();
                                                                                final SubLObject var18_454 = module0580.$g4358$.currentBinding(var48);
                                                                                try {
                                                                                    module0580.$g4358$.bind(module0580.f35544(), var48);
                                                                                    final SubLObject var74 = var48.secondMultipleValue();
                                                                                    var48.resetMultipleValues();
                                                                                    final SubLObject var18_455 = module0580.$g4359$.currentBinding(var48);
                                                                                    try {
                                                                                        module0580.$g4359$.bind(module0580.f35545(), var48);
                                                                                        final SubLObject var75 = module0580.$g4358$.getDynamicValue(var48);
                                                                                        final SubLObject var18_456 = module0034.$g879$.currentBinding(var48);
                                                                                        try {
                                                                                            module0034.$g879$.bind(var75, var48);
                                                                                            SubLObject var76 = (SubLObject)module0770.NIL;
                                                                                            if (module0770.NIL != var75 && module0770.NIL == module0034.f1842(var75)) {
                                                                                                var76 = module0034.f1869(var75);
                                                                                                final SubLObject var77 = Threads.current_process();
                                                                                                if (module0770.NIL == var76) {
                                                                                                    module0034.f1873(var75, var77);
                                                                                                }
                                                                                                else if (!var76.eql(var77)) {
                                                                                                    Errors.error((SubLObject)module0770.$ic15$);
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                f49104(var47);
                                                                                            }
                                                                                            finally {
                                                                                                final SubLObject var18_457 = Threads.$is_thread_performing_cleanupP$.currentBinding(var48);
                                                                                                try {
                                                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var48);
                                                                                                    if (module0770.NIL != var75 && module0770.NIL == var76) {
                                                                                                        module0034.f1873(var75, (SubLObject)module0770.NIL);
                                                                                                    }
                                                                                                }
                                                                                                finally {
                                                                                                    Threads.$is_thread_performing_cleanupP$.rebind(var18_457, var48);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            module0034.$g879$.rebind(var18_456, var48);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0580.$g4359$.rebind(var18_455, var48);
                                                                                    }
                                                                                    if (var74 == module0770.$ic21$ && module0770.NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var48))) {
                                                                                        module0034.f1891(module0580.$g4358$.getDynamicValue(var48));
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0580.$g4358$.rebind(var18_454, var48);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                final SubLObject var18_458 = Threads.$is_thread_performing_cleanupP$.currentBinding(var48);
                                                                                try {
                                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var48);
                                                                                    if (module0770.NIL == var73) {
                                                                                        module0580.f35554(module0580.$g4362$.getDynamicValue(var48));
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    Threads.$is_thread_performing_cleanupP$.rebind(var18_458, var48);
                                                                                }
                                                                            }
                                                                        }
                                                                        finally {
                                                                            module0580.$g4362$.rebind(var18_453, var48);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        module0580.$g4361$.rebind(var18_452, var48);
                                                                    }
                                                                }
                                                                finally {
                                                                    final SubLObject var18_459 = Threads.$is_thread_performing_cleanupP$.currentBinding(var48);
                                                                    try {
                                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var48);
                                                                        module0580.f35573();
                                                                        module0580.f35575();
                                                                    }
                                                                    finally {
                                                                        Threads.$is_thread_performing_cleanupP$.rebind(var18_459, var48);
                                                                    }
                                                                }
                                                            }
                                                            finally {
                                                                module0579.$g4321$.rebind(var18_451, var48);
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        module0579.$g4293$.rebind(var427_451, var48);
                                                        module0579.$g4259$.rebind(var179_450, var48);
                                                        module0584.$g4396$.rebind(var39_445, var48);
                                                        module0579.$g4262$.rebind(var19_441, var48);
                                                        module0579.$g4260$.rebind(var18_443, var48);
                                                    }
                                                    module0751.f46592();
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var18_442, var48);
                                                }
                                            }
                                        }
                                        finally {
                                            module0751.$g5999$.rebind(var18_441, var48);
                                        }
                                        if (module0770.NIL != module0578.f35470((SubLObject)module0770.ONE_INTEGER)) {
                                            PrintLow.format((SubLObject)module0770.T, (SubLObject)module0770.$ic121$, module0756.f47467(var47));
                                        }
                                    }
                                }
                            }
                            finally {
                                final SubLObject var18_460 = Threads.$is_thread_performing_cleanupP$.currentBinding(var48);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var48);
                                    final SubLObject var78 = conses_high.set_difference(module0754.f47307(), var66, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED);
                                    if (module0770.NIL != module0578.f35470((SubLObject)module0770.TWO_INTEGER)) {
                                        PrintLow.format((SubLObject)module0770.T, (SubLObject)module0770.$ic122$, module0579.$g4325$.getDynamicValue(var48), module0754.f47307());
                                    }
                                    module0580.f35619(var78);
                                    if (module0770.NIL != module0578.f35470((SubLObject)module0770.TWO_INTEGER)) {
                                        PrintLow.format((SubLObject)module0770.T, (SubLObject)module0770.$ic123$, module0754.f47307());
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var18_460, var48);
                                }
                            }
                        }
                        finally {
                            module0579.$g4325$.rebind(var39_444, var48);
                            module0579.$g4324$.rebind(var19_440, var48);
                            module0754.$g6064$.rebind(var18_440, var48);
                        }
                    }
                    finally {
                        module0579.$g4323$.rebind(var18_439, var48);
                    }
                }
                else {
                    try {
                        var48.throwStack.push(module0003.$g3$.getGlobalValue());
                        final SubLObject var18_461 = Errors.$error_handler$.currentBinding(var48);
                        try {
                            Errors.$error_handler$.bind((SubLObject)module0770.$ic22$, var48);
                            try {
                                module0751.f46742(var47, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED);
                                final SubLObject var18_462 = module0579.$g4323$.currentBinding(var48);
                                try {
                                    module0579.$g4323$.bind((module0770.NIL != module0067.f4852(module0579.$g4323$.getDynamicValue(var48))) ? module0579.$g4323$.getDynamicValue(var48) : module0067.f4880((SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED), var48);
                                    final SubLObject var79 = module0754.f47307();
                                    final SubLObject var18_463 = module0754.$g6064$.currentBinding(var48);
                                    final SubLObject var19_442 = module0579.$g4324$.currentBinding(var48);
                                    final SubLObject var39_446 = module0579.$g4325$.currentBinding(var48);
                                    try {
                                        module0754.$g6064$.bind(module0754.$g6064$.getDynamicValue(var48), var48);
                                        module0579.$g4324$.bind((module0770.NIL != module0067.f4852(module0579.$g4324$.getDynamicValue(var48))) ? module0579.$g4324$.getDynamicValue(var48) : module0067.f4880(Symbols.symbol_function((SubLObject)module0770.EQL), (SubLObject)module0770.SIXTEEN_INTEGER), var48);
                                        module0579.$g4325$.bind(module0048.f_1X(module0579.$g4325$.getDynamicValue(var48)), var48);
                                        if (module0770.NIL != module0578.f35470((SubLObject)module0770.TWO_INTEGER)) {
                                            PrintLow.format((SubLObject)module0770.T, (SubLObject)module0770.$ic115$, module0579.$g4325$.getDynamicValue(var48), module0067.f4903(module0579.$g4323$.getDynamicValue(var48)));
                                        }
                                        try {
                                            if (module0770.NIL != var64) {
                                                if (module0770.NIL != module0578.f35470((SubLObject)module0770.ONE_INTEGER)) {
                                                    PrintLow.format((SubLObject)module0770.T, (SubLObject)module0770.$ic116$, var64, var63);
                                                }
                                                module0756.f47723(var47, var64);
                                                if (module0756.f47481(var47, (SubLObject)module0770.UNPROVIDED).eql(module0770.$ic117$)) {
                                                    f49103(var47);
                                                }
                                            }
                                            else if (module0579.f35487().numG(module0770.$g6154$.getGlobalValue())) {
                                                final SubLObject var80 = Sequences.cconcatenate((SubLObject)module0770.$ic18$, new SubLObject[] { module0006.f205((SubLObject)module0770.ONE_INTEGER), module0770.$ic19$, module0006.f203((SubLObject)module0770.$ic118$) });
                                                module0578.f35476(var80, (SubLObject)ConsesLow.list(module0579.f35508()));
                                            }
                                            else {
                                                module0756.f47803(var47);
                                                if (module0770.NIL == module0756.f47800(var47, (SubLObject)module0770.T)) {
                                                    if (module0770.NIL != module0756.f47520(var47) && module0770.NIL != module0578.f35470((SubLObject)module0770.ONE_INTEGER)) {
                                                        PrintLow.format((SubLObject)module0770.T, (SubLObject)module0770.$ic119$, var63, module0756.f47482(var47));
                                                    }
                                                    final SubLObject var18_464 = module0751.$g5999$.currentBinding(var48);
                                                    try {
                                                        module0751.$g5999$.bind(module0751.f46595(), var48);
                                                        module0751.f46591((SubLObject)module0770.$ic120$);
                                                        try {
                                                            module0751.f46880(var47);
                                                        }
                                                        finally {
                                                            final SubLObject var18_465 = Threads.$is_thread_performing_cleanupP$.currentBinding(var48);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var48);
                                                                final SubLObject var18_466 = module0579.$g4260$.currentBinding(var48);
                                                                final SubLObject var19_443 = module0579.$g4262$.currentBinding(var48);
                                                                final SubLObject var39_447 = module0584.$g4396$.currentBinding(var48);
                                                                final SubLObject var179_451 = module0579.$g4259$.currentBinding(var48);
                                                                final SubLObject var427_452 = module0579.$g4293$.currentBinding(var48);
                                                                try {
                                                                    module0579.$g4260$.bind(var4, var48);
                                                                    module0579.$g4262$.bind(var5, var48);
                                                                    module0584.$g4396$.bind(module0579.$g4260$.getDynamicValue(var48), var48);
                                                                    module0579.$g4259$.bind(var6, var48);
                                                                    module0579.$g4293$.bind((module0770.NIL != module0077.f5302(module0579.$g4293$.getDynamicValue(var48))) ? module0579.$g4293$.getDynamicValue(var48) : module0751.f46876(var63), var48);
                                                                    if (module0770.NIL != module0580.f35574()) {
                                                                        module0755.f47388();
                                                                        final SubLObject var18_467 = module0580.$g4361$.currentBinding(var48);
                                                                        try {
                                                                            module0580.$g4361$.bind((SubLObject)module0770.NIL, var48);
                                                                            var48.resetMultipleValues();
                                                                            final SubLObject var18_468 = module0580.$g4362$.currentBinding(var48);
                                                                            try {
                                                                                module0580.$g4362$.bind(module0580.f35560(), var48);
                                                                                final SubLObject var81 = var48.secondMultipleValue();
                                                                                var48.resetMultipleValues();
                                                                                try {
                                                                                    var48.resetMultipleValues();
                                                                                    final SubLObject var18_469 = module0580.$g4358$.currentBinding(var48);
                                                                                    try {
                                                                                        module0580.$g4358$.bind(module0580.f35544(), var48);
                                                                                        final SubLObject var82 = var48.secondMultipleValue();
                                                                                        var48.resetMultipleValues();
                                                                                        final SubLObject var18_470 = module0580.$g4359$.currentBinding(var48);
                                                                                        try {
                                                                                            module0580.$g4359$.bind(module0580.f35545(), var48);
                                                                                            final SubLObject var83 = module0580.$g4358$.getDynamicValue(var48);
                                                                                            final SubLObject var18_471 = module0034.$g879$.currentBinding(var48);
                                                                                            try {
                                                                                                module0034.$g879$.bind(var83, var48);
                                                                                                SubLObject var84 = (SubLObject)module0770.NIL;
                                                                                                if (module0770.NIL != var83 && module0770.NIL == module0034.f1842(var83)) {
                                                                                                    var84 = module0034.f1869(var83);
                                                                                                    final SubLObject var85 = Threads.current_process();
                                                                                                    if (module0770.NIL == var84) {
                                                                                                        module0034.f1873(var83, var85);
                                                                                                    }
                                                                                                    else if (!var84.eql(var85)) {
                                                                                                        Errors.error((SubLObject)module0770.$ic15$);
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    f49104(var47);
                                                                                                }
                                                                                                finally {
                                                                                                    final SubLObject var18_472 = Threads.$is_thread_performing_cleanupP$.currentBinding(var48);
                                                                                                    try {
                                                                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var48);
                                                                                                        if (module0770.NIL != var83 && module0770.NIL == var84) {
                                                                                                            module0034.f1873(var83, (SubLObject)module0770.NIL);
                                                                                                        }
                                                                                                    }
                                                                                                    finally {
                                                                                                        Threads.$is_thread_performing_cleanupP$.rebind(var18_472, var48);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            finally {
                                                                                                module0034.$g879$.rebind(var18_471, var48);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            module0580.$g4359$.rebind(var18_470, var48);
                                                                                        }
                                                                                        if (var82 == module0770.$ic21$ && module0770.NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var48))) {
                                                                                            module0034.f1891(module0580.$g4358$.getDynamicValue(var48));
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0580.$g4358$.rebind(var18_469, var48);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    final SubLObject var18_473 = Threads.$is_thread_performing_cleanupP$.currentBinding(var48);
                                                                                    try {
                                                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var48);
                                                                                        if (module0770.NIL == var81) {
                                                                                            module0580.f35554(module0580.$g4362$.getDynamicValue(var48));
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        Threads.$is_thread_performing_cleanupP$.rebind(var18_473, var48);
                                                                                    }
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0580.$g4362$.rebind(var18_468, var48);
                                                                            }
                                                                        }
                                                                        finally {
                                                                            module0580.$g4361$.rebind(var18_467, var48);
                                                                        }
                                                                    }
                                                                    else {
                                                                        final SubLObject var18_474 = module0579.$g4321$.currentBinding(var48);
                                                                        try {
                                                                            module0579.$g4321$.bind(module0755.f47380(), var48);
                                                                            module0580.f35572();
                                                                            try {
                                                                                module0755.f47388();
                                                                                final SubLObject var18_475 = module0580.$g4361$.currentBinding(var48);
                                                                                try {
                                                                                    module0580.$g4361$.bind((SubLObject)module0770.NIL, var48);
                                                                                    var48.resetMultipleValues();
                                                                                    final SubLObject var18_476 = module0580.$g4362$.currentBinding(var48);
                                                                                    try {
                                                                                        module0580.$g4362$.bind(module0580.f35560(), var48);
                                                                                        final SubLObject var86 = var48.secondMultipleValue();
                                                                                        var48.resetMultipleValues();
                                                                                        try {
                                                                                            var48.resetMultipleValues();
                                                                                            final SubLObject var18_477 = module0580.$g4358$.currentBinding(var48);
                                                                                            try {
                                                                                                module0580.$g4358$.bind(module0580.f35544(), var48);
                                                                                                final SubLObject var87 = var48.secondMultipleValue();
                                                                                                var48.resetMultipleValues();
                                                                                                final SubLObject var18_478 = module0580.$g4359$.currentBinding(var48);
                                                                                                try {
                                                                                                    module0580.$g4359$.bind(module0580.f35545(), var48);
                                                                                                    final SubLObject var88 = module0580.$g4358$.getDynamicValue(var48);
                                                                                                    final SubLObject var18_479 = module0034.$g879$.currentBinding(var48);
                                                                                                    try {
                                                                                                        module0034.$g879$.bind(var88, var48);
                                                                                                        SubLObject var89 = (SubLObject)module0770.NIL;
                                                                                                        if (module0770.NIL != var88 && module0770.NIL == module0034.f1842(var88)) {
                                                                                                            var89 = module0034.f1869(var88);
                                                                                                            final SubLObject var90 = Threads.current_process();
                                                                                                            if (module0770.NIL == var89) {
                                                                                                                module0034.f1873(var88, var90);
                                                                                                            }
                                                                                                            else if (!var89.eql(var90)) {
                                                                                                                Errors.error((SubLObject)module0770.$ic15$);
                                                                                                            }
                                                                                                        }
                                                                                                        try {
                                                                                                            f49104(var47);
                                                                                                        }
                                                                                                        finally {
                                                                                                            final SubLObject var18_480 = Threads.$is_thread_performing_cleanupP$.currentBinding(var48);
                                                                                                            try {
                                                                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var48);
                                                                                                                if (module0770.NIL != var88 && module0770.NIL == var89) {
                                                                                                                    module0034.f1873(var88, (SubLObject)module0770.NIL);
                                                                                                                }
                                                                                                            }
                                                                                                            finally {
                                                                                                                Threads.$is_thread_performing_cleanupP$.rebind(var18_480, var48);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    finally {
                                                                                                        module0034.$g879$.rebind(var18_479, var48);
                                                                                                    }
                                                                                                }
                                                                                                finally {
                                                                                                    module0580.$g4359$.rebind(var18_478, var48);
                                                                                                }
                                                                                                if (var87 == module0770.$ic21$ && module0770.NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var48))) {
                                                                                                    module0034.f1891(module0580.$g4358$.getDynamicValue(var48));
                                                                                                }
                                                                                            }
                                                                                            finally {
                                                                                                module0580.$g4358$.rebind(var18_477, var48);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            final SubLObject var18_481 = Threads.$is_thread_performing_cleanupP$.currentBinding(var48);
                                                                                            try {
                                                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var48);
                                                                                                if (module0770.NIL == var86) {
                                                                                                    module0580.f35554(module0580.$g4362$.getDynamicValue(var48));
                                                                                                }
                                                                                            }
                                                                                            finally {
                                                                                                Threads.$is_thread_performing_cleanupP$.rebind(var18_481, var48);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0580.$g4362$.rebind(var18_476, var48);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0580.$g4361$.rebind(var18_475, var48);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                final SubLObject var18_482 = Threads.$is_thread_performing_cleanupP$.currentBinding(var48);
                                                                                try {
                                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var48);
                                                                                    module0580.f35573();
                                                                                    module0580.f35575();
                                                                                }
                                                                                finally {
                                                                                    Threads.$is_thread_performing_cleanupP$.rebind(var18_482, var48);
                                                                                }
                                                                            }
                                                                        }
                                                                        finally {
                                                                            module0579.$g4321$.rebind(var18_474, var48);
                                                                        }
                                                                    }
                                                                }
                                                                finally {
                                                                    module0579.$g4293$.rebind(var427_452, var48);
                                                                    module0579.$g4259$.rebind(var179_451, var48);
                                                                    module0584.$g4396$.rebind(var39_447, var48);
                                                                    module0579.$g4262$.rebind(var19_443, var48);
                                                                    module0579.$g4260$.rebind(var18_466, var48);
                                                                }
                                                                module0751.f46592();
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(var18_465, var48);
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        module0751.$g5999$.rebind(var18_464, var48);
                                                    }
                                                    if (module0770.NIL != module0578.f35470((SubLObject)module0770.ONE_INTEGER)) {
                                                        PrintLow.format((SubLObject)module0770.T, (SubLObject)module0770.$ic121$, module0756.f47467(var47));
                                                    }
                                                }
                                            }
                                        }
                                        finally {
                                            final SubLObject var18_483 = Threads.$is_thread_performing_cleanupP$.currentBinding(var48);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var48);
                                                final SubLObject var91 = conses_high.set_difference(module0754.f47307(), var79, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED);
                                                if (module0770.NIL != module0578.f35470((SubLObject)module0770.TWO_INTEGER)) {
                                                    PrintLow.format((SubLObject)module0770.T, (SubLObject)module0770.$ic122$, module0579.$g4325$.getDynamicValue(var48), module0754.f47307());
                                                }
                                                module0580.f35619(var91);
                                                if (module0770.NIL != module0578.f35470((SubLObject)module0770.TWO_INTEGER)) {
                                                    PrintLow.format((SubLObject)module0770.T, (SubLObject)module0770.$ic123$, module0754.f47307());
                                                }
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var18_483, var48);
                                            }
                                        }
                                    }
                                    finally {
                                        module0579.$g4325$.rebind(var39_446, var48);
                                        module0579.$g4324$.rebind(var19_442, var48);
                                        module0754.$g6064$.rebind(var18_463, var48);
                                    }
                                }
                                finally {
                                    module0579.$g4323$.rebind(var18_462, var48);
                                }
                            }
                            catch (Throwable var92) {
                                Errors.handleThrowable(var92, (SubLObject)module0770.NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(var18_461, var48);
                        }
                    }
                    catch (Throwable var93) {
                        var65 = Errors.handleThrowable(var93, module0003.$g3$.getGlobalValue());
                    }
                    finally {
                        var48.throwStack.pop();
                    }
                    if (var65.isString() && module0770.NIL == module0578.f35477()) {
                        Errors.warn(Sequences.cconcatenate(module0752.f47234(var65), (SubLObject)module0770.$ic23$), module0579.f35508());
                    }
                }
            }
            finally {
                module0578.$g4234$.rebind(var19_439, var48);
                Errors.$continue_cerrorP$.rebind(var18_438, var48);
            }
            if (module0770.NIL != var65) {
                f49105(var47);
            }
        }
        finally {
            module0579.$g4270$.rebind(var62, var48);
            module0579.$g4334$.rebind(var61, var48);
            module0271.$g2564$.rebind(var60, var48);
            module0110.$g1374$.rebind(var59, var48);
            module0152.$g2107$.rebind(var58, var48);
            module0144.$g1769$.rebind(var57, var48);
            module0144.$g1771$.rebind(var56, var48);
            module0146.$g2055$.rebind(var55, var48);
            module0271.$g2563$.rebind(var54, var48);
            module0271.$g2561$.rebind(var53, var48);
            module0271.$g2560$.rebind(var52, var48);
            module0144.$g1752$.rebind(var51, var48);
            module0271.$g2562$.rebind(var50, var48);
            module0018.$g696$.rebind(var49, var48);
        }
        return module0756.f47467(var47);
    }
    
    public static SubLObject f49104(final SubLObject var47) {
        final SubLThread var48 = SubLProcess.currentSubLThread();
        final SubLObject var49 = module0756.f47487(var47, (SubLObject)module0770.UNPROVIDED);
        final SubLObject var50 = module0579.$g4320$.currentBinding(var48);
        try {
            module0579.$g4320$.bind((SubLObject)ConsesLow.cons(var49, module0579.$g4320$.getDynamicValue(var48)), var48);
            final SubLObject var51 = module0756.f47479(var47);
            if (module0770.NIL == var51) {
                if (module0770.NIL != module0035.f2198(module0579.$g4320$.getDynamicValue(var48), Symbols.symbol_function((SubLObject)module0770.EQUAL), (SubLObject)module0770.THREE_INTEGER, (SubLObject)module0770.UNPROVIDED)) {
                    final SubLObject var52 = Sequences.cconcatenate((SubLObject)module0770.$ic18$, new SubLObject[] { module0006.f205((SubLObject)module0770.ONE_INTEGER), module0770.$ic19$, module0006.f203((SubLObject)module0770.$ic124$) });
                    module0578.f35476(var52, (SubLObject)ConsesLow.list(module0579.$g4320$.getDynamicValue(var48)));
                }
                else if (module0770.NIL != module0756.f47478(var47) || module0770.NIL != module0756.f47538(var47)) {
                    module0765.f48610(var47);
                }
                else if (module0756.f47481(var47, (SubLObject)module0770.UNPROVIDED).eql(module0770.$ic117$)) {
                    f49106(var47);
                }
                else if (module0770.NIL != f49107(var47)) {
                    f49108(var47);
                }
                else if (module0770.NIL == module0756.f47520(var47)) {
                    module0758.f47878(var47, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED);
                }
                else if (module0770.NIL != module0765.f48630(var49)) {
                    final SubLObject var18_499 = module0579.$g4314$.currentBinding(var48);
                    try {
                        module0579.$g4314$.bind((SubLObject)ConsesLow.cons((SubLObject)module0770.$ic125$, module0579.$g4314$.getDynamicValue(var48)), var48);
                        if (module0770.NIL != module0578.f35470((SubLObject)module0770.ONE_INTEGER)) {
                            PrintLow.format((SubLObject)module0770.T, (SubLObject)module0770.$ic126$, (SubLObject)module0770.$ic125$);
                        }
                        f49109(var47);
                        if (module0770.NIL != module0578.f35470((SubLObject)module0770.ONE_INTEGER)) {
                            PrintLow.format((SubLObject)module0770.T, (SubLObject)module0770.$ic127$, (SubLObject)module0770.$ic125$);
                        }
                    }
                    finally {
                        module0579.$g4314$.rebind(var18_499, var48);
                    }
                }
                else {
                    f49109(var47);
                }
            }
        }
        finally {
            module0579.$g4320$.rebind(var50, var48);
        }
        if (module0770.NIL == module0756.f47479(var47)) {
            f49105(var47);
        }
        return module0756.f47467(var47);
    }
    
    public static SubLObject f49110() {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0770.NIL != module0580.$g4375$.getDynamicValue(var9) && module0770.NIL != f49111(module0770.$g6155$.getDynamicValue(var9)));
    }
    
    public static SubLObject f49111(final SubLObject var500) {
        final SubLThread var501 = SubLProcess.currentSubLThread();
        return f49112(var500, module0580.$g4375$.getDynamicValue(var501));
    }
    
    public static SubLObject f49112(final SubLObject var500, final SubLObject var501) {
        final SubLObject var502 = module0077.f5320(var500, var501);
        if (module0770.NIL != var502 && module0770.NIL != module0578.f35470((SubLObject)module0770.ONE_INTEGER)) {
            PrintLow.format((SubLObject)module0770.T, (SubLObject)module0770.$ic128$, var500);
        }
        return var502;
    }
    
    public static SubLObject f49113(final SubLObject var503, SubLObject var504) {
        if (var504 == module0770.UNPROVIDED) {
            var504 = (SubLObject)module0770.ONE_INTEGER;
        }
        return f49114(var503, var504);
    }
    
    public static SubLObject f49114(final SubLObject var503, final SubLObject var504) {
        final SubLThread var505 = SubLProcess.currentSubLThread();
        if (module0770.NIL == conses_high.getf(var503, (SubLObject)module0770.$ic129$, (SubLObject)module0770.UNPROVIDED)) {
            return Values.values(var503, (SubLObject)module0770.ZERO_INTEGER);
        }
        if (!var504.isPositive()) {
            return Values.values(conses_high.remf(var503, (SubLObject)module0770.$ic129$), (SubLObject)module0770.ZERO_INTEGER);
        }
        final SubLObject var506 = conses_high.getf(var503, (SubLObject)module0770.$ic129$, (SubLObject)module0770.NIL);
        if (module0770.NIL == var506) {
            return (SubLObject)module0770.NIL;
        }
        var505.resetMultipleValues();
        final SubLObject var507 = f49114(var506, var504);
        final SubLObject var508 = var505.secondMultipleValue();
        var505.resetMultipleValues();
        if (var504.numG(var508)) {
            return Values.values(conses_high.putf(var503, (SubLObject)module0770.$ic129$, var507), module0048.f_1X(var508));
        }
        return Values.values(conses_high.putf(var503, (SubLObject)module0770.$ic129$, conses_high.getf(var507, (SubLObject)module0770.$ic129$, (SubLObject)module0770.UNPROVIDED)), var508);
    }
    
    public static SubLObject f49109(final SubLObject var47) {
        final SubLObject var48 = module0756.f47487(var47, (SubLObject)module0770.UNPROVIDED);
        final SubLObject var49 = module0762.f48141(var48);
        return f49115(var47, var49);
    }
    
    public static SubLObject f49115(final SubLObject var47, final SubLObject var508) {
        final SubLThread var509 = SubLProcess.currentSubLThread();
        final SubLObject var510 = module0756.f47487(var47, (SubLObject)module0770.UNPROVIDED);
        SubLObject var511 = (SubLObject)module0770.NIL;
        final SubLObject var512 = (SubLObject)((module0770.NIL != module0580.f35625() && module0770.NIL == module0579.f35485()) ? module0770.$ic130$ : module0756.f47483(var47));
        final SubLObject var513 = Numbers.subtract(module0756.f47627(var47), module0756.f47499(var47));
        final SubLObject var514 = var508.first();
        final SubLObject var515 = conses_high.second(var514);
        SubLObject var516 = (SubLObject)module0770.NIL;
        if (!module0770.ZERO_INTEGER.eql(var515)) {
            module0756.f47663(var47, (SubLObject)module0770.$ic131$, (SubLObject)module0770.$ic132$, (SubLObject)ConsesLow.list((SubLObject)module0770.$ic133$, var510, (SubLObject)module0770.$ic134$, var514));
        }
        SubLObject var517;
        SubLObject var518;
        SubLObject var520;
        SubLObject var519;
        SubLObject var521;
        SubLObject var522;
        SubLObject var523;
        SubLObject var524;
        SubLObject var525;
        SubLObject var526;
        SubLObject var527;
        SubLObject var528;
        SubLObject var529;
        SubLObject var18_523;
        SubLObject var530;
        SubLObject var531;
        SubLObject var18_524;
        for (var517 = (SubLObject)module0770.NIL, var517 = var508; module0770.NIL != var517 && (module0770.NIL == var511 || module0770.NIL != module0579.f35485()); var517 = var517.rest()) {
            var518 = var517.first();
            var519 = (var520 = var518);
            var521 = (SubLObject)module0770.NIL;
            var522 = (SubLObject)module0770.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var520, var519, (SubLObject)module0770.$ic135$);
            var521 = var520.first();
            var520 = var520.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var520, var519, (SubLObject)module0770.$ic135$);
            var522 = var520.first();
            var520 = var520.rest();
            if (module0770.NIL == var520) {
                if (!var521.isSymbol() || module0770.NIL == Symbols.fboundp(var521)) {
                    if (module0770.NIL != module0578.f35470((SubLObject)module0770.ONE_INTEGER) && module0770.NIL == module0578.f35477()) {
                        Errors.warn((SubLObject)module0770.$ic136$, var521);
                    }
                }
                else if (module0770.NIL != module0579.f35496(Numbers.add(var513, var522), (SubLObject)module0770.UNPROVIDED)) {
                    if (module0770.NIL != module0578.f35470((SubLObject)module0770.ONE_INTEGER) && module0770.NIL == module0578.f35477()) {
                        Errors.warn((SubLObject)module0770.$ic137$, new SubLObject[] { Numbers.add(var513, var522), module0579.$g4287$.getDynamicValue(var509), var522, var518, var513 });
                    }
                }
                else {
                    var523 = (SubLObject)module0770.NIL;
                    var524 = (SubLObject)module0770.NIL;
                    var525 = module0770.$g6155$.getDynamicValue(var509);
                    var526 = module0770.$g6155$.currentBinding(var509);
                    try {
                        module0770.$g6155$.bind((SubLObject)ConsesLow.list(new SubLObject[] { module0770.$ic138$, var521, module0770.$ic133$, var510, module0770.$ic139$, module0756.f47488(var47, (SubLObject)module0770.UNPROVIDED), module0770.$ic140$, module0756.f47481(var47, (SubLObject)module0770.UNPROVIDED), module0770.$ic141$, module0579.$g4287$.getDynamicValue(var509) }), var509);
                        if (module0770.NIL != var525) {
                            module0770.$g6155$.setDynamicValue(f49113(conses_high.putf(module0770.$g6155$.getDynamicValue(var509), (SubLObject)module0770.$ic129$, var525), (SubLObject)module0770.UNPROVIDED), var509);
                        }
                        if (module0770.NIL == f49110()) {
                            if (module0770.NIL != module0578.f35470((SubLObject)module0770.ONE_INTEGER)) {
                                PrintLow.format((SubLObject)module0770.T, (SubLObject)module0770.$ic142$, var518, var517);
                            }
                            var527 = ((module0770.NIL != module0756.f47479(var47)) ? module0756.f47484(var512, (SubLObject)module0770.NIL, (SubLObject)module0770.NIL) : var47);
                            var528 = (SubLObject)module0770.NIL;
                            var529 = Time.get_internal_real_time();
                            var18_523 = module0580.$g4371$.currentBinding(var509);
                            var530 = module0580.$g4369$.currentBinding(var509);
                            var531 = module0580.$g4370$.currentBinding(var509);
                            try {
                                module0580.$g4371$.bind((SubLObject)module0770.ZERO_INTEGER, var509);
                                module0580.$g4369$.bind(module0580.f35598((SubLObject)module0770.NIL), var509);
                                module0580.$g4370$.bind(module0580.$g4370$.getDynamicValue(var509), var509);
                                module0580.$g4370$.setDynamicValue(module0580.f35596(), var509);
                                if (module0770.NIL == module0580.$g4370$.getDynamicValue(var509)) {
                                    try {
                                        var509.throwStack.push(module0770.$ic17$);
                                        var18_524 = module0770.$g6157$.currentBinding(var509);
                                        try {
                                            module0770.$g6157$.bind((SubLObject)ConsesLow.cons(var521, module0770.$g6157$.getDynamicValue(var509)), var509);
                                            f49116(var527, var521, var522, var512);
                                        }
                                        finally {
                                            module0770.$g6157$.rebind(var18_524, var509);
                                        }
                                    }
                                    catch (Throwable var532) {
                                        var524 = Errors.handleThrowable(var532, (SubLObject)module0770.$ic17$);
                                    }
                                    finally {
                                        var509.throwStack.pop();
                                    }
                                }
                                var523 = module0580.f35596();
                            }
                            finally {
                                module0580.$g4370$.rebind(var531, var509);
                                module0580.$g4369$.rebind(var530, var509);
                                module0580.$g4371$.rebind(var18_523, var509);
                            }
                            var528 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var529), time_high.$internal_time_units_per_second$.getGlobalValue());
                            if (module0770.NIL != module0107.f7629(module0770.$g6156$.getDynamicValue(var509)) && module0770.NIL == module0004.f104(var521, module0770.$g6157$.getDynamicValue(var509), (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED)) {
                                module0084.f5775(module0770.$g6156$.getDynamicValue(var509), var521, var528);
                            }
                            if (var527.eql(var47) && module0770.NIL != module0756.f47479(var527)) {
                                var511 = var521;
                            }
                            else if (module0770.NIL != module0756.f47479(var527)) {
                                module0756.f47675(var47, var527);
                            }
                            else if (module0770.NIL != module0579.f35513() && var522.isZero()) {
                                var516 = (SubLObject)ConsesLow.cons(var521, var516);
                            }
                            if (module0770.NIL != var523) {
                                module0756.f47663(var47, (SubLObject)module0770.$ic131$, (SubLObject)module0770.$ic143$, (SubLObject)module0770.UNPROVIDED);
                                if (module0770.NIL != module0578.f35470((SubLObject)module0770.ONE_INTEGER) && module0770.NIL == module0578.f35477()) {
                                    Errors.warn((SubLObject)module0770.$ic144$, var527);
                                }
                                f49117();
                            }
                            if (module0770.NIL != var524 && module0770.NIL != var517) {
                                module0580.f35628(var524);
                            }
                        }
                    }
                    finally {
                        module0770.$g6155$.rebind(var526, var509);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var519, (SubLObject)module0770.$ic135$);
            }
        }
        if (module0770.$ic145$ == module0579.$g4337$.getDynamicValue(var509) && (module0770.NIL == module0756.f47479(var47) || module0756.f47499(var47).isPositive()) && module0770.NIL != var516) {
            f49118(var47, var516, var511);
        }
        module0756.f47657(var47, (SubLObject)module0770.UNPROVIDED);
        return Values.values(module0756.f47467(var47), var511);
    }
    
    public static SubLObject f49117() {
        final SubLObject var44 = Sequences.cconcatenate((SubLObject)module0770.$ic18$, new SubLObject[] { module0006.f205((SubLObject)module0770.ONE_INTEGER), module0770.$ic19$, module0006.f203((SubLObject)module0770.$ic146$) });
        module0578.f35476(var44, (SubLObject)ConsesLow.list(module0770.EMPTY_SUBL_OBJECT_ARRAY));
        return (SubLObject)module0770.NIL;
    }
    
    public static SubLObject f49118(final SubLObject var47, final SubLObject var514, final SubLObject var509) {
        final SubLObject var515 = module0756.f47487(var47, (SubLObject)module0770.UNPROVIDED);
        if ((module0770.NIL == module0756.f47479(var47) || module0756.f47499(var47).isPositive()) && module0770.NIL != var514) {
            Errors.warn((SubLObject)module0770.$ic147$, var515, module0756.f47488(var47, (SubLObject)module0770.UNPROVIDED));
            SubLObject var516 = var514;
            SubLObject var517 = (SubLObject)module0770.NIL;
            var517 = var516.first();
            while (module0770.NIL != var516) {
                final SubLObject var518 = module0756.f47662(var47, var517);
                PrintLow.format((SubLObject)module0770.T, (SubLObject)module0770.$ic148$, var517, var518);
                var516 = var516.rest();
                var517 = var516.first();
            }
            if (module0770.NIL != module0756.f47479(var47)) {
                PrintLow.format((SubLObject)module0770.T, (SubLObject)module0770.$ic149$, new SubLObject[] { var509, module0756.f47499(var47), module0756.f47480(var47, (SubLObject)module0770.UNPROVIDED) });
            }
            f49119((SubLObject)module0770.UNPROVIDED);
        }
        return var47;
    }
    
    public static SubLObject f49119(SubLObject var318) {
        if (var318 == module0770.UNPROVIDED) {
            var318 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread var319 = SubLProcess.currentSubLThread();
        PrintLow.format(var318, (SubLObject)module0770.$ic150$, new SubLObject[] { module0579.f35508(), module0579.$g4260$.getDynamicValue(var319), module0579.$g4262$.getDynamicValue(var319), module0579.$g4259$.getDynamicValue(var319) });
        if (module0770.NIL != module0579.$g4254$.getDynamicValue(var319)) {
            PrintLow.format(var318, (SubLObject)module0770.$ic151$, module0579.$g4254$.getDynamicValue(var319));
        }
        return (SubLObject)module0770.NIL;
    }
    
    public static SubLObject f49116(final SubLObject var47, final SubLObject var518, final SubLObject var519, final SubLObject var510) {
        final SubLThread var520 = SubLProcess.currentSubLThread();
        SubLObject var521 = (SubLObject)module0770.NIL;
        if (module0770.NIL != module0578.f35470((SubLObject)module0770.ONE_INTEGER)) {
            PrintLow.format((SubLObject)module0770.T, (SubLObject)module0770.$ic152$, module0770.$g6155$.getDynamicValue(var520));
        }
        final SubLObject var522 = module0084.f5760(module0579.$g4323$.getDynamicValue(var520));
        final SubLObject var523 = module0579.$g4324$.currentBinding(var520);
        final SubLObject var524 = module0580.$g4373$.currentBinding(var520);
        try {
            module0579.$g4324$.bind((module0770.NIL != module0067.f4852(module0579.$g4324$.getDynamicValue(var520))) ? module0579.$g4324$.getDynamicValue(var520) : module0067.f4880(Symbols.symbol_function((SubLObject)module0770.EQL), (SubLObject)module0770.SIXTEEN_INTEGER), var520);
            module0580.$g4373$.bind(module0048.f_1X(module0580.$g4373$.getDynamicValue(var520)), var520);
            if (module0770.NIL != module0578.f35470((SubLObject)module0770.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0770.T, (SubLObject)module0770.$ic153$, module0580.$g4373$.getDynamicValue(var520), module0067.f4903(module0579.$g4323$.getDynamicValue(var520)));
            }
            try {
                final SubLObject var18_528 = module0579.$g4323$.currentBinding(var520);
                try {
                    module0579.$g4323$.bind(var522, var520);
                    final SubLObject var18_529 = Errors.$continue_cerrorP$.currentBinding(var520);
                    final SubLObject var19_530 = module0578.$g4234$.currentBinding(var520);
                    try {
                        Errors.$continue_cerrorP$.bind((SubLObject)module0770.NIL, var520);
                        module0578.$g4234$.bind((SubLObject)module0770.T, var520);
                        if (module0770.NIL != module0578.f35473()) {
                            if (var519.isPositive()) {
                                if (module0770.NIL != module0578.f35470((SubLObject)module0770.ONE_INTEGER) && module0770.NIL == module0578.f35477()) {
                                    Errors.warn((SubLObject)module0770.$ic154$, var519, var518, var47);
                                }
                                module0756.f47500(var47, Numbers.add(module0756.f47627((module0770.NIL != module0756.f47497(var510, (SubLObject)module0770.UNPROVIDED)) ? var510 : var47), var519), var518);
                            }
                            final SubLObject var525 = module0580.$g4363$.getDynamicValue(var520);
                            final SubLObject var18_530 = module0580.$g4366$.currentBinding(var520);
                            final SubLObject var19_531 = module0580.$g4363$.currentBinding(var520);
                            try {
                                module0580.$g4366$.bind(module0580.f35568(), var520);
                                module0580.$g4363$.bind(module0054.f3968(), var520);
                                SubLObject var526 = (SubLObject)module0770.NIL;
                                try {
                                    if (module0770.NIL != module0578.f35470((SubLObject)module0770.THREE_INTEGER)) {
                                        PrintLow.format((SubLObject)module0770.T, (SubLObject)module0770.$ic155$, var518, var47);
                                    }
                                    module0767.f48780(var518, var47);
                                    if (module0770.NIL != module0578.f35470((SubLObject)module0770.THREE_INTEGER)) {
                                        PrintLow.format((SubLObject)module0770.T, (SubLObject)module0770.$ic156$, var518, var47);
                                    }
                                    if (module0770.NIL == module0756.f47479(var47) || var521.isString() || module0770.NIL != module0579.f35496(module0756.f47627(var47), (SubLObject)module0770.UNPROVIDED)) {
                                        var526 = (SubLObject)module0770.T;
                                        if (module0770.NIL != module0578.f35470((SubLObject)module0770.ONE_INTEGER)) {
                                            PrintLow.format((SubLObject)module0770.T, (SubLObject)module0770.$ic157$, var518);
                                        }
                                        if (module0770.NIL != module0580.f35625()) {
                                            module0580.f35628(module0770.$g6155$.getDynamicValue(var520));
                                        }
                                        else {
                                            module0756.f47485(var47, var510);
                                        }
                                    }
                                }
                                finally {
                                    final SubLObject var18_531 = Threads.$is_thread_performing_cleanupP$.currentBinding(var520);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var520);
                                        if (module0770.NIL != var526) {
                                            module0580.f35566();
                                        }
                                        else {
                                            SubLObject var527 = module0054.f3978(module0580.$g4363$.getDynamicValue(var520));
                                            SubLObject var536_537 = (SubLObject)module0770.NIL;
                                            var536_537 = var527.first();
                                            while (module0770.NIL != var527) {
                                                module0054.f3973(var536_537, var525);
                                                var527 = var527.rest();
                                                var536_537 = var527.first();
                                            }
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var18_531, var520);
                                    }
                                }
                            }
                            finally {
                                module0580.$g4363$.rebind(var19_531, var520);
                                module0580.$g4366$.rebind(var18_530, var520);
                            }
                        }
                        else {
                            try {
                                var520.throwStack.push(module0003.$g3$.getGlobalValue());
                                final SubLObject var18_532 = Errors.$error_handler$.currentBinding(var520);
                                try {
                                    Errors.$error_handler$.bind((SubLObject)module0770.$ic22$, var520);
                                    try {
                                        if (var519.isPositive()) {
                                            if (module0770.NIL != module0578.f35470((SubLObject)module0770.ONE_INTEGER) && module0770.NIL == module0578.f35477()) {
                                                Errors.warn((SubLObject)module0770.$ic154$, var519, var518, var47);
                                            }
                                            module0756.f47500(var47, Numbers.add(module0756.f47627((module0770.NIL != module0756.f47497(var510, (SubLObject)module0770.UNPROVIDED)) ? var510 : var47), var519), var518);
                                        }
                                        final SubLObject var528 = module0580.$g4363$.getDynamicValue(var520);
                                        final SubLObject var18_533 = module0580.$g4366$.currentBinding(var520);
                                        final SubLObject var19_532 = module0580.$g4363$.currentBinding(var520);
                                        try {
                                            module0580.$g4366$.bind(module0580.f35568(), var520);
                                            module0580.$g4363$.bind(module0054.f3968(), var520);
                                            SubLObject var529 = (SubLObject)module0770.NIL;
                                            try {
                                                if (module0770.NIL != module0578.f35470((SubLObject)module0770.THREE_INTEGER)) {
                                                    PrintLow.format((SubLObject)module0770.T, (SubLObject)module0770.$ic155$, var518, var47);
                                                }
                                                module0767.f48780(var518, var47);
                                                if (module0770.NIL != module0578.f35470((SubLObject)module0770.THREE_INTEGER)) {
                                                    PrintLow.format((SubLObject)module0770.T, (SubLObject)module0770.$ic156$, var518, var47);
                                                }
                                                if (module0770.NIL == module0756.f47479(var47) || var521.isString() || module0770.NIL != module0579.f35496(module0756.f47627(var47), (SubLObject)module0770.UNPROVIDED)) {
                                                    var529 = (SubLObject)module0770.T;
                                                    if (module0770.NIL != module0578.f35470((SubLObject)module0770.ONE_INTEGER)) {
                                                        PrintLow.format((SubLObject)module0770.T, (SubLObject)module0770.$ic157$, var518);
                                                    }
                                                    if (module0770.NIL != module0580.f35625()) {
                                                        module0580.f35628(module0770.$g6155$.getDynamicValue(var520));
                                                    }
                                                    else {
                                                        module0756.f47485(var47, var510);
                                                    }
                                                }
                                            }
                                            finally {
                                                final SubLObject var18_534 = Threads.$is_thread_performing_cleanupP$.currentBinding(var520);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var520);
                                                    if (module0770.NIL != var529) {
                                                        module0580.f35566();
                                                    }
                                                    else {
                                                        SubLObject var530 = module0054.f3978(module0580.$g4363$.getDynamicValue(var520));
                                                        SubLObject var536_538 = (SubLObject)module0770.NIL;
                                                        var536_538 = var530.first();
                                                        while (module0770.NIL != var530) {
                                                            module0054.f3973(var536_538, var528);
                                                            var530 = var530.rest();
                                                            var536_538 = var530.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var18_534, var520);
                                                }
                                            }
                                        }
                                        finally {
                                            module0580.$g4363$.rebind(var19_532, var520);
                                            module0580.$g4366$.rebind(var18_533, var520);
                                        }
                                    }
                                    catch (Throwable var531) {
                                        Errors.handleThrowable(var531, (SubLObject)module0770.NIL);
                                    }
                                }
                                finally {
                                    Errors.$error_handler$.rebind(var18_532, var520);
                                }
                            }
                            catch (Throwable var532) {
                                var521 = Errors.handleThrowable(var532, module0003.$g3$.getGlobalValue());
                            }
                            finally {
                                var520.throwStack.pop();
                            }
                            if (var521.isString() && module0770.NIL == module0578.f35477()) {
                                Errors.warn(Sequences.cconcatenate(module0752.f47234(var521), (SubLObject)module0770.$ic23$), module0579.f35508());
                            }
                        }
                    }
                    finally {
                        module0578.$g4234$.rebind(var19_530, var520);
                        Errors.$continue_cerrorP$.rebind(var18_529, var520);
                    }
                    final SubLObject var533 = module0756.f47627(var47);
                    if (module0770.NIL == var521) {
                        if (module0770.NIL != module0579.f35496(var533, (SubLObject)module0770.UNPROVIDED)) {
                            if (module0770.NIL != module0578.f35470((SubLObject)module0770.ONE_INTEGER) && module0770.NIL == module0578.f35477()) {
                                Errors.warn((SubLObject)module0770.$ic158$, var533, module0579.$g4287$.getDynamicValue(var520), var47);
                            }
                        }
                        else if (module0770.NIL != module0756.f47479(var47)) {
                            if (module0770.NIL != module0004.f105(var533) && module0770.NIL != module0578.f35470((SubLObject)module0770.ONE_INTEGER)) {
                                PrintLow.format((SubLObject)module0770.T, (SubLObject)module0770.$ic159$, new SubLObject[] { module0756.f47487(var47, (SubLObject)module0770.UNPROVIDED), module0756.f47467(var47), var533 });
                            }
                            module0756.f47569(var47, module0756.f47688(var518, (SubLObject)module0770.UNPROVIDED));
                            if (module0770.NIL != module0578.f35470((SubLObject)module0770.ONE_INTEGER)) {
                                PrintLow.format((SubLObject)module0770.T, (SubLObject)module0770.$ic160$, new SubLObject[] { var518, module0756.f47487(var47, (SubLObject)module0770.UNPROVIDED), module0756.f47467(var47), module0756.f47691(var47) });
                            }
                        }
                        else if (module0770.NIL != module0578.f35470((SubLObject)module0770.THREE_INTEGER)) {
                            PrintLow.format((SubLObject)module0770.T, (SubLObject)module0770.$ic161$, new SubLObject[] { var518, module0756.f47487(var47, (SubLObject)module0770.UNPROVIDED), module0756.f47467(var47) });
                        }
                    }
                }
                finally {
                    module0579.$g4323$.rebind(var18_528, var520);
                }
            }
            finally {
                final SubLObject var18_535 = Threads.$is_thread_performing_cleanupP$.currentBinding(var520);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0770.T, var520);
                    if (module0770.NIL != module0578.f35470((SubLObject)module0770.ONE_INTEGER)) {
                        PrintLow.format((SubLObject)module0770.T, (SubLObject)module0770.$ic162$, module0580.$g4373$.getDynamicValue(var520));
                    }
                    if (module0770.NIL != module0756.f47479(var47)) {
                        if (module0770.NIL != module0578.f35470((SubLObject)module0770.ONE_INTEGER)) {
                            PrintLow.format((SubLObject)module0770.T, (SubLObject)module0770.$ic163$, module0756.f47467(var47));
                        }
                        if (module0770.NIL != module0578.f35470((SubLObject)module0770.ONE_INTEGER)) {
                            PrintLow.format((SubLObject)module0770.T, (SubLObject)module0770.$ic164$, module0579.$g4323$.getDynamicValue(var520), module0067.f4903(var522));
                        }
                        module0580.f35617(var522);
                    }
                    else if (module0770.NIL != module0578.f35470((SubLObject)module0770.ONE_INTEGER)) {
                        PrintLow.format((SubLObject)module0770.T, (SubLObject)module0770.$ic165$, module0067.f4903(module0579.$g4323$.getDynamicValue(var520)));
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var18_535, var520);
                }
            }
        }
        finally {
            module0580.$g4373$.rebind(var524, var520);
            module0579.$g4324$.rebind(var523, var520);
        }
        return module0756.f47467(var47);
    }
    
    public static SubLObject f49105(final SubLObject var47) {
        final SubLThread var48 = SubLProcess.currentSubLThread();
        if (module0579.$g4287$.getDynamicValue(var48).isInteger()) {
            if (module0770.NIL != module0578.f35470((SubLObject)module0770.ONE_INTEGER) && module0770.NIL == module0578.f35477()) {
                Errors.warn((SubLObject)module0770.$ic166$, module0579.$g4287$.getDynamicValue(var48));
            }
        }
        else if (module0770.NIL == module0756.f47520(var47)) {
            if (module0770.NIL != module0578.f35470((SubLObject)module0770.ONE_INTEGER) && module0770.NIL == module0578.f35477()) {
                Errors.warn((SubLObject)module0770.$ic167$);
            }
        }
        else {
            module0756.f47723(var47, module0038.f2890(module0756.f47487(var47, (SubLObject)module0770.UNPROVIDED)));
        }
        return module0756.f47467(var47);
    }
    
    public static SubLObject f49106(final SubLObject var47) {
        if (module0770.NIL != module0756.f47479(var47)) {
            return var47;
        }
        module0756.f47532(var47);
        f49065(var47, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED);
        if (module0770.NIL != module0756.f47479(var47)) {
            f49103(var47);
        }
        return var47;
    }
    
    public static SubLObject f49103(final SubLObject var47) {
        module0756.f47503(var47, module0770.$ic117$, (SubLObject)module0770.UNPROVIDED);
        final SubLObject var48 = module0756.f47467(var47);
        SubLObject var49 = module0749.f46447(module0035.f2114(var48));
        final SubLObject var50 = module0756.f47487(var47, (SubLObject)module0770.UNPROVIDED);
        SubLObject var51 = (SubLObject)module0770.NIL;
        if (module0770.NIL != module0035.f1997(var48)) {
            final SubLObject var52 = module0758.f47995(var47);
            final SubLObject var53 = module0756.f47759(var52);
            var51 = module0004.f104(var50, var53, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED);
        }
        if (module0770.NIL != module0749.f46448(var49)) {
            final SubLObject var54 = module0772.f49212((SubLObject)module0770.$ic168$);
            final SubLObject var55 = module0749.f46459(var49);
            module0749.f46460(var49, ConsesLow.append(var55, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var54))));
        }
        else if (module0770.NIL != var51) {
            final SubLObject var56 = module0767.f48987(var50);
            final SubLObject var57 = module0767.f48971(var50);
            final SubLObject var58 = module0767.f48968(var50);
            final SubLObject var59 = module0764.f48501(module0764.f48485(var56, var57, var58), module0770.$ic169$);
            final SubLObject var60 = f49050(var59, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED);
            if (module0770.NIL != module0581.f35648(var60)) {
                module0749.f46457(var49, var60);
                module0749.f46472(var49, module0770.$ic170$);
            }
        }
        else {
            var49 = module0765.f48572(var49);
        }
        module0756.f47501(var47, module0035.f2152(var48, var49), (SubLObject)module0770.UNPROVIDED);
        SubLObject var61 = module0756.f47672(var47);
        SubLObject var62 = (SubLObject)module0770.NIL;
        var62 = var61.first();
        while (module0770.NIL != var61) {
            f49103(var62);
            var61 = var61.rest();
            var62 = var61.first();
        }
        return module0756.f47467(var47);
    }
    
    public static SubLObject f49107(final SubLObject var47) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0770.NIL != module0756.f47735(var47) && !module0756.f47487(var47, (SubLObject)module0770.UNPROVIDED).isNumber());
    }
    
    public static SubLObject f49108(final SubLObject var47) {
        if (module0770.NIL != module0756.f47479(var47)) {
            return var47;
        }
        module0756.f47503(var47, module0751.f47125(), (SubLObject)module0770.UNPROVIDED);
        f49065(var47, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED, (SubLObject)module0770.UNPROVIDED);
        if (module0770.NIL != module0756.f47479(var47)) {
            f49120(var47);
        }
        return var47;
    }
    
    public static SubLObject f49120(final SubLObject var47) {
        module0756.f47503(var47, module0770.$ic171$, (SubLObject)module0770.UNPROVIDED);
        final SubLObject var48 = module0756.f47467(var47);
        final SubLObject var49 = module0749.f46447(module0035.f2114(var48));
        if (module0770.NIL != module0749.f46448(var49)) {
            final SubLObject var50 = module0772.f49212((SubLObject)module0770.$ic172$);
            final SubLObject var51 = module0749.f46459(var49);
            module0749.f46460(var49, ConsesLow.append(var51, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var50))));
        }
        else {
            final SubLObject var52 = module0765.f48539(module0749.f46455(var49));
            module0749.f46457(var49, var52);
        }
        module0756.f47501(var47, module0035.f2152(var48, var49), (SubLObject)module0770.UNPROVIDED);
        return module0756.f47467(var47);
    }
    
    public static SubLObject f49121() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49049", "GENERATE-PHRASE", 1, 7, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49050", "S#50517", 1, 7, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49052", "S#53523", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49051", "S#53524", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49056", "S#53525", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49057", "S#39914", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49058", "GENERATE-PHRASE-FOR-JAVA", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49061", "S#37156", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49062", "S#53526", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49060", "S#50986", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49064", "S#52542", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49054", "S#53527", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49066", "S#53528", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49068", "GENERATE-DISAMBIGUATION-PHRASES", 1, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49070", "S#53529", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49071", "GENERATE-DISAMBIGUATION-PHRASES-FOR-JAVA", 1, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49072", "S#53530", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49069", "S#53531", 1, 7, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49073", "S#53532", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49075", "GENERATE-DISAMBIGUATION-PHRASES-AND-TYPES", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49076", "S#53533", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49063", "S#50648", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49074", "S#53274", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49077", "S#53534", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49079", "S#50646", 1, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49081", "S#52893", 1, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49080", "S#53535", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49055", "S#53273", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49082", "S#53536", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49083", "S#53537", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49084", "S#53538", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49085", "S#53539", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49086", "S#53540", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49087", "S#53541", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49067", "GENERATE-TEXT-W/SENTENTIAL-FORCE", 1, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49059", "S#53542", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49088", "S#53543", 9, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49089", "S#53544", 9, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49090", "S#53545", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49092", "S#53546", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49091", "S#53547", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49078", "S#51696", 1, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49053", "S#53548", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49093", "S#53549", 6, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49094", "S#53550", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49095", "GENERATE-TEXT", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49096", "S#53551", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49097", "S#51695", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49098", "S#41513", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49099", "S#50699", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49100", "S#41495", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49101", "S#50700", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49102", "CLEAR-PARAPHRASE-CACHES", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49065", "S#39107", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49104", "S#53552", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49110", "S#53553", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49111", "S#53554", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49112", "S#53555", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49113", "S#53556", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49114", "S#53557", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49109", "S#53558", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49115", "S#53559", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49117", "S#53270", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49118", "S#53560", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49119", "S#53561", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49116", "S#53562", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49105", "S#53563", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49106", "S#53564", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49103", "S#52346", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49107", "S#53565", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49108", "S#53566", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0770", "f49120", "S#53567", 1, 0, false);
        return (SubLObject)module0770.NIL;
    }
    
    public static SubLObject f49122() {
        module0770.$g6151$ = SubLFiles.defconstant("S#53568", (SubLObject)module0770.SIX_INTEGER);
        module0770.$g6152$ = SubLFiles.deflexical("S#53569", (module0770.NIL != Symbols.boundp((SubLObject)module0770.$ic92$)) ? module0770.$g6152$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)module0770.EQUAL), (SubLObject)module0770.UNPROVIDED));
        module0770.$g6153$ = SubLFiles.deflexical("S#53570", (SubLObject)((module0770.NIL != Symbols.boundp((SubLObject)module0770.$ic108$)) ? module0770.$g6153$.getGlobalValue() : module0770.NIL));
        module0770.$g6154$ = SubLFiles.deflexical("S#53571", (SubLObject)((module0770.NIL != Symbols.boundp((SubLObject)module0770.$ic112$)) ? module0770.$g6154$.getGlobalValue() : module0770.$ic113$));
        module0770.$g6155$ = SubLFiles.defparameter("S#53572", (SubLObject)module0770.NIL);
        module0770.$g6156$ = SubLFiles.defparameter("S#53573", module0107.f7627());
        module0770.$g6157$ = SubLFiles.defparameter("S#53574", (SubLObject)module0770.NIL);
        return (SubLObject)module0770.NIL;
    }
    
    public static SubLObject f49123() {
        module0012.f368((SubLObject)module0770.$ic9$, (SubLObject)module0770.$ic10$, (SubLObject)module0770.$ic11$, (SubLObject)module0770.$ic12$, (SubLObject)module0770.$ic13$);
        module0034.f1895((SubLObject)module0770.$ic14$);
        module0012.f368((SubLObject)module0770.$ic31$, (SubLObject)module0770.$ic32$, (SubLObject)module0770.$ic33$, (SubLObject)module0770.$ic34$, (SubLObject)module0770.$ic35$);
        module0012.f368((SubLObject)module0770.$ic55$, (SubLObject)module0770.$ic56$, (SubLObject)module0770.$ic57$, (SubLObject)module0770.$ic58$, (SubLObject)module0770.$ic59$);
        module0012.f368((SubLObject)module0770.$ic87$, (SubLObject)module0770.$ic88$, (SubLObject)module0770.$ic89$, (SubLObject)module0770.$ic90$, (SubLObject)module0770.$ic91$);
        module0003.f57((SubLObject)module0770.$ic92$);
        module0003.f57((SubLObject)module0770.$ic108$);
        module0003.f57((SubLObject)module0770.$ic112$);
        module0027.f1449((SubLObject)module0770.$ic87$, (SubLObject)ConsesLow.list(new SubLObject[] { module0770.$ic173$, module0770.EQUAL, module0770.$ic174$, module0770.NIL, module0770.$ic175$, module0770.$ic176$, module0770.$ic177$, module0770.$ic178$, module0770.$ic179$, module0770.T }), (SubLObject)module0770.$ic180$);
        module0027.f1449((SubLObject)module0770.$ic181$, (SubLObject)ConsesLow.list(new SubLObject[] { module0770.$ic173$, module0770.EQUAL, module0770.$ic174$, module0770.NIL, module0770.$ic175$, module0770.$ic176$, module0770.$ic177$, module0770.$ic178$, module0770.$ic179$, module0770.T }), (SubLObject)module0770.$ic182$);
        return (SubLObject)module0770.NIL;
    }
    
    public void declareFunctions() {
        f49121();
    }
    
    public void initializeVariables() {
        f49122();
    }
    
    public void runTopLevelForms() {
        f49123();
    }
    
    static {
        me = (SubLFile)new module0770();
        module0770.$g6151$ = null;
        module0770.$g6152$ = null;
        module0770.$g6153$ = null;
        module0770.$g6154$ = null;
        module0770.$g6155$ = null;
        module0770.$g6156$ = null;
        module0770.$g6157$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("DEFAULT");
        $ic1$ = SubLObjectFactory.makeKeyword("TEXT");
        $ic2$ = SubLObjectFactory.makeSymbol("S#16321", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("S#39395", "CYC");
        $ic4$ = SubLObjectFactory.makeSymbol("S#42152", "CYC");
        $ic5$ = SubLObjectFactory.makeSymbol("S#13265", "CYC");
        $ic6$ = SubLObjectFactory.makeSymbol("KEYWORDP");
        $ic7$ = SubLObjectFactory.makeSymbol("BOOLEANP");
        $ic8$ = SubLObjectFactory.makeSymbol("S#51577", "CYC");
        $ic9$ = SubLObjectFactory.makeSymbol("GENERATE-PHRASE");
        $ic10$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#154", "CYC"), SubLObjectFactory.makeSymbol("&OPTIONAL"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39308", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#53575", "CYC"), (SubLObject)module0770.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#51665", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-LANGUAGE-MT*")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15402", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-DOMAIN-MT*")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#4785", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("TEXT")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1738", "CYC"), (SubLObject)module0770.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39315", "CYC"), (SubLObject)module0770.NIL) });
        $ic11$ = SubLObjectFactory.makeString("@param OBJECT; the CycL object for which you want to generate English.\n@param NL-PREDS; a list of instances of #$SpeechPartPredicate.\n@param DETERMINER; a determiner keyword in *DETERMINER-KEYS*.\n@param LANGUAGE-MT; the microtheory from which to look for linguistic information.\n@param DOMAIN-MT; the microtheory from which to look for domain information.\n@return 0 STRINGP or NIL; a string representing our best attempt to paraphrase OBJECT\n into English with the given parameters.\n@return 1; pos-pred or NIL\n@return 2; LISTP of justifications\n@return 3; PPH-OUTPUT-LIST-P.");
        $ic12$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#154", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#16321", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39308", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39395", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#53575", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#42152", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#51665", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13265", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15402", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13265", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#4785", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1738", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39315", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#51577", "CYC")));
        $ic13$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#51575", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#53576", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP"), (SubLObject)SubLObjectFactory.makeSymbol("S#53577", "CYC"));
        $ic14$ = SubLObjectFactory.makeSymbol("S#53524", "CYC");
        $ic15$ = SubLObjectFactory.makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic16$ = SubLObjectFactory.makeKeyword("NONE");
        $ic17$ = SubLObjectFactory.makeKeyword("PPH-METHOD-FAILURE");
        $ic18$ = SubLObjectFactory.makeString("(PPH error level ");
        $ic19$ = SubLObjectFactory.makeString(") ");
        $ic20$ = SubLObjectFactory.makeString("Don't know what to do with determiner ~S passed to GENERATE-PHRASE.");
        $ic21$ = SubLObjectFactory.makeKeyword("NEW");
        $ic22$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic23$ = SubLObjectFactory.makeString("~% Top-level CycL: ~S");
        $ic24$ = SubLObjectFactory.makeKeyword("HTML");
        $ic25$ = SubLObjectFactory.makeInteger(256);
        $ic26$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic27$ = SubLObjectFactory.makeSymbol("S#39913", "CYC");
        $ic28$ = SubLObjectFactory.makeKeyword("ANY");
        $ic29$ = SubLObjectFactory.makeSymbol("S#53542", "CYC");
        $ic30$ = SubLObjectFactory.makeSymbol("S#12264", "CYC");
        $ic31$ = SubLObjectFactory.makeSymbol("GENERATE-PHRASE-FOR-JAVA");
        $ic32$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#154", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39308", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#51679", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#51665", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-LANGUAGE-MT*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15402", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-DOMAIN-MT*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#4785", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("HTML")));
        $ic33$ = SubLObjectFactory.makeString("Return paraphrase info in a java-friendly format, one big list with no structures.\n@param OBJECT; the CycL object for which you want to generate English.\n@param NL-PREDS; VALID-EXTERNAL-PPH-NL-PREDS?.\n@param FORCE; PPH-FORCE-P.\n@param LANGUAGE-MT; the microtheory from which to look for linguistic information.\n@param DOMAIN-MT; the microtheory from which to look for domain information.\n@return 0 NIL or PPH-JAVALIST-P;\n@return 1 BOOLEANP; Use arg-positions strictly?\n@return 2 LISTP; of PPH supports.");
        $ic34$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39308", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39395", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#51665", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#53542", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15402", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12264", "CYC")));
        $ic35$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#664", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#50666", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("S#12627", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP"));
        $ic36$ = SubLObjectFactory.makeSymbol("PRINC-TO-STRING");
        $ic37$ = SubLObjectFactory.makeString("Fallback method ~S is not a known function.");
        $ic38$ = SubLObjectFactory.makeString("Couldn't generate a string for ~S (fallback method was ~S)");
        $ic39$ = SubLObjectFactory.makeSymbol("S#50517", "CYC");
        $ic40$ = SubLObjectFactory.makeString("Duplicate javalist:~% ~S");
        $ic41$ = SubLObjectFactory.makeSymbol("S#52542", "CYC");
        $ic42$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genTemplate-QuerySentence"));
        $ic43$ = SubLObjectFactory.makeKeyword("TOP-LEVEL");
        $ic44$ = SubLObjectFactory.makeSymbol("S#3298", "CYC");
        $ic45$ = SubLObjectFactory.makeKeyword("A-LIST");
        $ic46$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REQUIRED"), (SubLObject)SubLObjectFactory.makeKeyword("PREFERRED"), (SubLObject)SubLObjectFactory.makeKeyword("DISALLOWED"));
        $ic47$ = SubLObjectFactory.makeKeyword("REQUIRED");
        $ic48$ = SubLObjectFactory.makeSymbol("LISTP");
        $ic49$ = SubLObjectFactory.makeSymbol("S#53529", "CYC");
        $ic50$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DEFAULT"), (SubLObject)SubLObjectFactory.makeKeyword("NONE"));
        $ic51$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PREFERRED"), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED"));
        $ic52$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANY"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic"))));
        $ic53$ = SubLObjectFactory.makeSymbol("S#50651", "CYC");
        $ic54$ = SubLObjectFactory.makeKeyword("JAVALISTS");
        $ic55$ = SubLObjectFactory.makeSymbol("GENERATE-DISAMBIGUATION-PHRASES-FOR-JAVA");
        $ic56$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#51730", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#51679", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39308", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#51665", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-LANGUAGE-MT*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15402", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-DOMAIN-MT*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#53578", "CYC"), (SubLObject)module0770.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#53579", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED")));
        $ic57$ = SubLObjectFactory.makeString("@param FORCE; pph-force-p\n@param FORBIDDEN-STRINGS; listp of strings to *not* use as a paraphrase for any member of OBJECTS.\n@param USE-CACHED-GENERATIONS; :required, :preferred, or :disallowed.  Required means that it will only\n  use cached generations.  :disallowed means that it will never use them (and will always generate fresh from\n  the KB, and :preferred means that it will use the cached generations unless they turn out ambiguous, at\n  which point fresh generations from the KB will be used.\n@return LISTP of PPH-JAVALIST-P objects, one for each item on OBJECTS.\nAn effort is made to have the paraphrase for each item be sufficiently distinct\nto distinguish it from the other items.\n@sideeffects: Calls *PARTIAL-RESULTS-NOTIFICATION-FN* with a dictionary of new INDEX -> JAVALIST mappings.");
        $ic58$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#51730", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#51679", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39308", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39395", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#51665", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13265", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15402", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13265", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#53578", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3298", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#53579", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#53529", "CYC")));
        $ic59$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"));
        $ic60$ = SubLObjectFactory.makeString("ALPHABETIZE-PPH-JAVALISTS passed ~S javalists, ~S objects.");
        $ic61$ = SubLObjectFactory.makeSymbol("S#39396", "CYC");
        $ic62$ = SubLObjectFactory.makeSymbol("S#39113", "CYC");
        $ic63$ = SubLObjectFactory.makeString("~&Trying default precision: ~S.~%");
        $ic64$ = SubLObjectFactory.makeKeyword("FAILURE");
        $ic65$ = SubLObjectFactory.makeString("~&Working on dupe list: ~S~%");
        $ic66$ = SubLObjectFactory.makeString("~&Trying to reparaphrase ~S.~%");
        $ic67$ = SubLObjectFactory.makeString("~&Trying targeted precision ~S for ~S");
        $ic68$ = SubLObjectFactory.makeSymbol("PPH-PRECISION-P");
        $ic69$ = SubLObjectFactory.makeString("~&New paraphrase with precision ~S for ~S:~% ~S");
        $ic70$ = SubLObjectFactory.makeString("~&Trying full precision for ~S");
        $ic71$ = SubLObjectFactory.makeString("~&New paraphrase with full precision for ~S:~% ~S");
        $ic72$ = SubLObjectFactory.makeString("~&Changing output-list for ~S from~% ~S to~% ~S.~%");
        $ic73$ = SubLObjectFactory.makeString("Timed out generating disambiguation phrases for~% ~S~%");
        $ic74$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic")));
        $ic75$ = SubLObjectFactory.makeKeyword("NEVER");
        $ic76$ = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $ic77$ = SubLObjectFactory.makeSymbol("S#5859", "CYC");
        $ic78$ = SubLObjectFactory.makeKeyword("ALL");
        $ic79$ = SubLObjectFactory.makeKeyword("LEXICAL-ONLY");
        $ic80$ = SubLObjectFactory.makeKeyword("TOP-LEVEL-ONLY");
        $ic81$ = SubLObjectFactory.makeString("Setting cycl for ~S to ~S since it lacks a valid arg-position.");
        $ic82$ = SubLObjectFactory.makeString("Couldn't dereference arg-position ~S of ~S");
        $ic83$ = SubLObjectFactory.makeString("CycL on ~S doesn't match CycL ~S");
        $ic84$ = SubLObjectFactory.makeSymbol("S#39267", "CYC");
        $ic85$ = SubLObjectFactory.makeSymbol("S#51574", "CYC");
        $ic86$ = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic87$ = SubLObjectFactory.makeSymbol("GENERATE-TEXT-W/SENTENTIAL-FORCE");
        $ic88$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#154", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#51679", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39308", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#51665", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15402", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#4785", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("TEXT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39315", "CYC"), (SubLObject)module0770.NIL));
        $ic89$ = SubLObjectFactory.makeString("generates text for a given object.  This is intended to be the\n  main gateway into the generation code for formulas.\n  @param OBJECT CYCL-EXPRESSION-P; the object for which text should be generated.\n  @param FORCE pph-force-p; the sentential force of the text to be generated.\n@return 0 STRINGP or NIL; the string corresponding to object.\n@return 1 pred\n@return 2 justification\n@return 3 pph-output-list-p\n@return 4 non-negative-integer-p -- number of demerits associated with this paraphrase");
        $ic90$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#154", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#16321", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#51679", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39396", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39308", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39395", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#51665", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#53542", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15402", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#51574", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#4785", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39315", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#664", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P"))));
        $ic91$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#51575", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#51576", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP"), (SubLObject)SubLObjectFactory.makeSymbol("S#53577", "CYC"));
        $ic92$ = SubLObjectFactory.makeSymbol("S#53569", "CYC");
        $ic93$ = SubLObjectFactory.makeSymbol(">");
        $ic94$ = SubLObjectFactory.makeString("/tmp/");
        $ic95$ = SubLObjectFactory.makeKeyword("OUTPUT");
        $ic96$ = SubLObjectFactory.makeString("Unable to open ~S");
        $ic97$ = SubLObjectFactory.makeString("~&Term~AForce~AParaphrase~ADemerits~ANL Preds~ALanguage Mt~ADomain Mt~AMode~AFocus Arg~%");
        $ic98$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#52972", "CYC"));
        $ic99$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#51679", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39308", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#51665", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#15402", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#4785", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39315", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"));
        $ic100$ = SubLObjectFactory.makeString("~&~A~%");
        $ic101$ = SubLObjectFactory.makeString("Rechecking generate-text bad results...");
        $ic102$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#154", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#51679", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39308", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#51665", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#15402", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#4785", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39315", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"));
        $ic103$ = SubLObjectFactory.makeSymbol("S#13755", "CYC");
        $ic104$ = SubLObjectFactory.makeString("Took ~S seconds to paraphrase~% ~S~%");
        $ic105$ = SubLObjectFactory.makeString("~&Suspending discourse referent tracking for ~S~%");
        $ic106$ = SubLObjectFactory.makeKeyword("DECLARATIVE");
        $ic107$ = SubLObjectFactory.makeString("~&Making new phrase with cycl ~S~%");
        $ic108$ = SubLObjectFactory.makeSymbol("S#53570", "CYC");
        $ic109$ = SubLObjectFactory.makeKeyword("INITIALIZED");
        $ic110$ = SubLObjectFactory.makeString("No KB loaded. Couldn't initialize paraphrase code.");
        $ic111$ = SubLObjectFactory.makeKeyword("NO-KB-LOADED");
        $ic112$ = SubLObjectFactory.makeSymbol("S#53571", "CYC");
        $ic113$ = SubLObjectFactory.makeInteger(100);
        $ic114$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EnglishParaphraseMt"));
        $ic115$ = SubLObjectFactory.makeString("~&Entering PPH-POSSIBLY-BINDING-VARIABLES(~S), *pph-var-types* are~% ~S~%");
        $ic116$ = SubLObjectFactory.makeString("~&Using mapped string ~S for ~S.~%");
        $ic117$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("PossessivePhrase"));
        $ic118$ = SubLObjectFactory.makeString("Recursion limit exceeded on ~S.");
        $ic119$ = SubLObjectFactory.makeString("~&Paraphrasing ~S with agr: ~S...~%");
        $ic120$ = SubLObjectFactory.makeKeyword("GENERATE");
        $ic121$ = SubLObjectFactory.makeString("~&PPH-PHRASE-GENERATE Output list is ~S.~%");
        $ic122$ = SubLObjectFactory.makeString("~&Leaving PPH-POSSIBLY-BINDING-VARIABLES(~S), vars in local *pph-var-types* were ~s ");
        $ic123$ = SubLObjectFactory.makeString("~&... and *pph-var-types* are now ~S~%");
        $ic124$ = SubLObjectFactory.makeString("Repeating sequence in paraphrase args: ~s");
        $ic125$ = SubLObjectFactory.makeKeyword("NO");
        $ic126$ = SubLObjectFactory.makeString("Inside operator scope ~S");
        $ic127$ = SubLObjectFactory.makeString("Leaving operator scope ~S");
        $ic128$ = SubLObjectFactory.makeString("Skipping ~S.~%");
        $ic129$ = SubLObjectFactory.makeKeyword("CONTEXT");
        $ic130$ = SubLObjectFactory.makeKeyword("DONT-NEED-BACKUP-PHRASE");
        $ic131$ = SubLObjectFactory.makeSymbol("S#53558", "CYC");
        $ic132$ = SubLObjectFactory.makeKeyword("NO-ZERO-DEMERIT-METHODS");
        $ic133$ = SubLObjectFactory.makeKeyword("CYCL");
        $ic134$ = SubLObjectFactory.makeKeyword("BEST-METHOD");
        $ic135$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39317", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#53580", "CYC"));
        $ic136$ = SubLObjectFactory.makeString("~S is not an FBOUNDP symbol.");
        $ic137$ = SubLObjectFactory.makeString("~&~S demerits exceeds cutoff of ~S~% ~S from ~S,~% ~S from dtrs.~%");
        $ic138$ = SubLObjectFactory.makeKeyword("METHOD");
        $ic139$ = SubLObjectFactory.makeKeyword("AGR-PREDS");
        $ic140$ = SubLObjectFactory.makeKeyword("CATEGORY");
        $ic141$ = SubLObjectFactory.makeKeyword("DEMERIT-CUTOFF");
        $ic142$ = SubLObjectFactory.makeString("~&Trying ~S~% Remaining: ~S");
        $ic143$ = SubLObjectFactory.makeKeyword("TOO-MUCH-TIME");
        $ic144$ = SubLObjectFactory.makeString("Exceeded timeout on~% ~S");
        $ic145$ = SubLObjectFactory.makeKeyword("VERBOSE");
        $ic146$ = SubLObjectFactory.makeString("Aborting PPH call...");
        $ic147$ = SubLObjectFactory.makeString("Zero-demerit methods failed:~% Input: ~S~% Agr-preds: ~S~% Failed methods:");
        $ic148$ = SubLObjectFactory.makeString("~%  ~S~%  Reported Problems: ~S~%");
        $ic149$ = SubLObjectFactory.makeString("~& Successful method: ~S (demerits ~S)~% Paraphrase: ~S~%");
        $ic150$ = SubLObjectFactory.makeString("~&Context:~% Top-level CycL: ~S~% Language mt: ~S~% Domain mt: ~S~% Mode: ~S~%");
        $ic151$ = SubLObjectFactory.makeString(" Precision: ~S~%");
        $ic152$ = SubLObjectFactory.makeString("~&Trying ~S...~%");
        $ic153$ = SubLObjectFactory.makeString("~&Entering PPH-SETTING-VAR-TYPES-IF-SUCCESSFUL(~S), *pph-var-types* are~% ~s~%");
        $ic154$ = SubLObjectFactory.makeString("~&Adding ~S demerits for ~S~% ~S");
        $ic155$ = SubLObjectFactory.makeString("~%PPH phrase immediately before calling ~S:~% ~S");
        $ic156$ = SubLObjectFactory.makeString("~%PPH phrase immediately after calling ~S:~% ~S");
        $ic157$ = SubLObjectFactory.makeString("~S failed.");
        $ic158$ = SubLObjectFactory.makeString("~&~S demerits exceeds cutoff of ~S~% ~S");
        $ic159$ = SubLObjectFactory.makeString("~&~S -> ~S demerits: ~S.~%");
        $ic160$ = SubLObjectFactory.makeString("~%(~S ~S):~% ~S (~S).");
        $ic161$ = SubLObjectFactory.makeString("~%(~S ~S):~% ~S");
        $ic162$ = SubLObjectFactory.makeString("~&Leaving PPH-SETTING-VAR-TYPES-IF-SUCCESSFUL(~S). ");
        $ic163$ = SubLObjectFactory.makeString("~& Output list: ~S~%");
        $ic164$ = SubLObjectFactory.makeString("~& Setting ~S to~% ~S");
        $ic165$ = SubLObjectFactory.makeString("~% Leaving *PPH-VAR-TYPES* ~S");
        $ic166$ = SubLObjectFactory.makeString("Can't use foolproof generation with demerit cutoff: ~S.~%");
        $ic167$ = SubLObjectFactory.makeString("Can't use foolproof generation on unknown CycL.~%");
        $ic168$ = SubLObjectFactory.makeString("'s");
        $ic169$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("PossessivePronoun-Post"));
        $ic170$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("pronounStrings"));
        $ic171$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("OrdinalPhrase"));
        $ic172$ = SubLObjectFactory.makeString("th");
        $ic173$ = SubLObjectFactory.makeKeyword("TEST");
        $ic174$ = SubLObjectFactory.makeKeyword("OWNER");
        $ic175$ = SubLObjectFactory.makeKeyword("CLASSES");
        $ic176$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#53482", "CYC"));
        $ic177$ = SubLObjectFactory.makeKeyword("KB");
        $ic178$ = SubLObjectFactory.makeKeyword("FULL");
        $ic179$ = SubLObjectFactory.makeKeyword("WORKING?");
        $ic180$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("elementTypesInFormula-List")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Salt-NaCl")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Sodium")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Chlorine")))), (SubLObject)SubLObjectFactory.makeKeyword("DECLARATIVE")), (SubLObject)SubLObjectFactory.makeString("Sodium and chlorine are the complete list of elements in the chemical formula of sodium chloride.")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("elementTypesInFormula-List")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Salt-NaCl")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Sodium")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Chlorine")))), (SubLObject)SubLObjectFactory.makeKeyword("INTERROGATIVE")), (SubLObject)SubLObjectFactory.makeString("Are sodium and chlorine the complete list of elements in the chemical formula of sodium chloride?")));
        $ic181$ = SubLObjectFactory.makeSymbol("S#53531", "CYC");
        $ic182$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Plotting"))), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("gerund-Plural")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("wordStrings")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("properNameStrings"))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("MtSpace")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("MtUnionFn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("CyclishParaphraseMt")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("MedicalLexicalMt")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("TechnicalEnglishLexicalMt"))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("MtTimeDimFn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Now")))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("MtSpace")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("CyclishParaphraseMt")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("MtTimeDimFn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Now")))), (SubLObject)SubLObjectFactory.makeKeyword("TEXT"), (SubLObject)SubLObjectFactory.makeKeyword("JAVALISTS"), (SubLObject)module0770.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("plottings"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("plottings"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Plotting")), (SubLObject)module0770.NIL, (SubLObject)module0770.NIL, (SubLObject)module0770.NIL, (SubLObject)module0770.ZERO_INTEGER))))));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0770.class
	Total time: 8647 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/