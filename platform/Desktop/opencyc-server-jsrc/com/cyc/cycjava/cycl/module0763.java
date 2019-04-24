package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0763 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0763";
    public static final String myFingerPrint = "fdfe1f430a175c2b3c0151fa95d6961acb1c4d97877bd9e1adc5135423cf1cf5";
    private static SubLSymbol $g6107$;
    private static SubLSymbol $g6108$;
    private static SubLSymbol $g6109$;
    private static SubLSymbol $g6110$;
    private static SubLSymbol $g6111$;
    private static SubLSymbol $g6112$;
    private static SubLSymbol $g6113$;
    private static SubLSymbol $g6114$;
    private static final SubLString $ic0$;
    private static final SubLString $ic1$;
    private static final SubLString $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLObject $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLString $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLString $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLString $ic21$;
    private static final SubLString $ic22$;
    private static final SubLString $ic23$;
    private static final SubLList $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLObject $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLString $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLString $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLString $ic39$;
    private static final SubLList $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLList $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLObject $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLInteger $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLString $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLList $ic51$;
    private static final SubLObject $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLString $ic56$;
    private static final SubLString $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLString $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLObject $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLList $ic65$;
    private static final SubLObject $ic66$;
    private static final SubLString $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLString $ic69$;
    private static final SubLObject $ic70$;
    private static final SubLObject $ic71$;
    private static final SubLString $ic72$;
    private static final SubLString $ic73$;
    private static final SubLObject $ic74$;
    private static final SubLObject $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLObject $ic77$;
    private static final SubLString $ic78$;
    private static final SubLString $ic79$;
    private static final SubLObject $ic80$;
    private static final SubLObject $ic81$;
    private static final SubLList $ic82$;
    private static final SubLObject $ic83$;
    private static final SubLString $ic84$;
    private static final SubLString $ic85$;
    private static final SubLString $ic86$;
    private static final SubLObject $ic87$;
    private static final SubLObject $ic88$;
    private static final SubLObject $ic89$;
    private static final SubLObject $ic90$;
    private static final SubLString $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLString $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLInteger $ic95$;
    private static final SubLObject $ic96$;
    private static final SubLList $ic97$;
    private static final SubLString $ic98$;
    private static final SubLString $ic99$;
    private static final SubLObject $ic100$;
    private static final SubLList $ic101$;
    private static final SubLObject $ic102$;
    private static final SubLObject $ic103$;
    private static final SubLObject $ic104$;
    private static final SubLObject $ic105$;
    private static final SubLObject $ic106$;
    private static final SubLObject $ic107$;
    private static final SubLObject $ic108$;
    private static final SubLObject $ic109$;
    private static final SubLObject $ic110$;
    private static final SubLObject $ic111$;
    private static final SubLObject $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLObject $ic115$;
    private static final SubLObject $ic116$;
    private static final SubLObject $ic117$;
    private static final SubLObject $ic118$;
    private static final SubLObject $ic119$;
    private static final SubLObject $ic120$;
    private static final SubLObject $ic121$;
    private static final SubLObject $ic122$;
    private static final SubLObject $ic123$;
    private static final SubLObject $ic124$;
    private static final SubLObject $ic125$;
    private static final SubLObject $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLString $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLString $ic131$;
    private static final SubLString $ic132$;
    private static final SubLString $ic133$;
    private static final SubLString $ic134$;
    private static final SubLString $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLString $ic138$;
    private static final SubLString $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLString $ic141$;
    private static final SubLString $ic142$;
    private static final SubLObject $ic143$;
    private static final SubLList $ic144$;
    private static final SubLObject $ic145$;
    private static final SubLList $ic146$;
    private static final SubLList $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLString $ic152$;
    private static final SubLString $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLObject $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLObject $ic157$;
    private static final SubLObject $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLList $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLList $ic165$;
    private static final SubLString $ic166$;
    private static final SubLObject $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLObject $ic169$;
    private static final SubLSymbol $ic170$;
    private static final SubLObject $ic171$;
    private static final SubLObject $ic172$;
    private static final SubLObject $ic173$;
    private static final SubLObject $ic174$;
    private static final SubLObject $ic175$;
    private static final SubLObject $ic176$;
    private static final SubLSymbol $ic177$;
    private static final SubLObject $ic178$;
    private static final SubLObject $ic179$;
    private static final SubLObject $ic180$;
    private static final SubLObject $ic181$;
    private static final SubLObject $ic182$;
    private static final SubLSymbol $ic183$;
    private static final SubLSymbol $ic184$;
    private static final SubLSymbol $ic185$;
    private static final SubLList $ic186$;
    private static final SubLString $ic187$;
    private static final SubLSymbol $ic188$;
    private static final SubLSymbol $ic189$;
    private static final SubLSymbol $ic190$;
    private static final SubLSymbol $ic191$;
    private static final SubLSymbol $ic192$;
    private static final SubLSymbol $ic193$;
    private static final SubLSymbol $ic194$;
    private static final SubLString $ic195$;
    private static final SubLString $ic196$;
    private static final SubLString $ic197$;
    private static final SubLSymbol $ic198$;
    private static final SubLString $ic199$;
    private static final SubLObject $ic200$;
    private static final SubLSymbol $ic201$;
    private static final SubLObject $ic202$;
    private static final SubLString $ic203$;
    private static final SubLSymbol $ic204$;
    private static final SubLString $ic205$;
    private static final SubLString $ic206$;
    private static final SubLSymbol $ic207$;
    private static final SubLString $ic208$;
    private static final SubLString $ic209$;
    private static final SubLString $ic210$;
    private static final SubLString $ic211$;
    private static final SubLSymbol $ic212$;
    private static final SubLString $ic213$;
    private static final SubLSymbol $ic214$;
    private static final SubLSymbol $ic215$;
    private static final SubLString $ic216$;
    private static final SubLSymbol $ic217$;
    private static final SubLList $ic218$;
    private static final SubLList $ic219$;
    private static final SubLSymbol $ic220$;
    private static final SubLList $ic221$;
    private static final SubLString $ic222$;
    private static final SubLString $ic223$;
    private static final SubLSymbol $ic224$;
    private static final SubLInteger $ic225$;
    private static final SubLSymbol $ic226$;
    private static final SubLObject $ic227$;
    private static final SubLString $ic228$;
    private static final SubLObject $ic229$;
    private static final SubLString $ic230$;
    private static final SubLString $ic231$;
    private static final SubLString $ic232$;
    private static final SubLSymbol $ic233$;
    private static final SubLInteger $ic234$;
    private static final SubLString $ic235$;
    private static final SubLString $ic236$;
    private static final SubLList $ic237$;
    private static final SubLSymbol $ic238$;
    private static final SubLString $ic239$;
    private static final SubLString $ic240$;
    private static final SubLString $ic241$;
    private static final SubLList $ic242$;
    private static final SubLList $ic243$;
    private static final SubLString $ic244$;
    private static final SubLObject $ic245$;
    private static final SubLList $ic246$;
    private static final SubLSymbol $ic247$;
    private static final SubLSymbol $ic248$;
    private static final SubLSymbol $ic249$;
    private static final SubLSymbol $ic250$;
    private static final SubLSymbol $ic251$;
    private static final SubLSymbol $ic252$;
    private static final SubLSymbol $ic253$;
    private static final SubLSymbol $ic254$;
    private static final SubLList $ic255$;
    private static final SubLSymbol $ic256$;
    private static final SubLSymbol $ic257$;
    private static final SubLSymbol $ic258$;
    private static final SubLSymbol $ic259$;
    private static final SubLSymbol $ic260$;
    private static final SubLSymbol $ic261$;
    private static final SubLString $ic262$;
    private static final SubLObject $ic263$;
    private static final SubLList $ic264$;
    private static final SubLString $ic265$;
    private static final SubLSymbol $ic266$;
    private static final SubLSymbol $ic267$;
    private static final SubLString $ic268$;
    private static final SubLString $ic269$;
    private static final SubLList $ic270$;
    private static final SubLString $ic271$;
    private static final SubLString $ic272$;
    private static final SubLString $ic273$;
    private static final SubLString $ic274$;
    private static final SubLObject $ic275$;
    private static final SubLSymbol $ic276$;
    private static final SubLString $ic277$;
    private static final SubLSymbol $ic278$;
    private static final SubLSymbol $ic279$;
    private static final SubLSymbol $ic280$;
    private static final SubLObject $ic281$;
    private static final SubLSymbol $ic282$;
    private static final SubLSymbol $ic283$;
    private static final SubLSymbol $ic284$;
    private static final SubLSymbol $ic285$;
    private static final SubLString $ic286$;
    
    public static SubLObject f48234() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        if (module0763.NIL != module0763.$g6107$.getDynamicValue(var1)) {
            final SubLObject var2 = Sequences.cconcatenate((SubLObject)module0763.$ic0$, new SubLObject[] { module0006.f205((SubLObject)module0763.ONE_INTEGER), module0763.$ic1$, module0006.f203((SubLObject)module0763.$ic2$) });
            module0578.f35476(var2, (SubLObject)ConsesLow.list(module0763.EMPTY_SUBL_OBJECT_ARRAY));
        }
        final SubLObject var3 = module0763.$g6107$.currentBinding(var1);
        try {
            module0763.$g6107$.bind((SubLObject)module0763.T, var1);
            final SubLObject var4 = (SubLObject)SubLObjectFactory.makeBoolean(module0763.NIL != module0593.f36267() && module0763.NIL == module0593.f36273());
            if (module0763.NIL != var4) {
                module0593.f36279((SubLObject)module0763.TWO_INTEGER);
            }
            try {
                final SubLObject var5 = module0579.$g4316$.getGlobalValue();
                SubLObject var6 = (SubLObject)module0763.NIL;
                try {
                    var6 = Locks.seize_lock(var5);
                    module0749.f46338();
                    module0762.f48216();
                    final SubLObject var3_7 = module0580.$g4361$.currentBinding(var1);
                    try {
                        module0580.$g4361$.bind((SubLObject)module0763.NIL, var1);
                        var1.resetMultipleValues();
                        final SubLObject var3_8 = module0580.$g4362$.currentBinding(var1);
                        try {
                            module0580.$g4362$.bind(module0580.f35560(), var1);
                            final SubLObject var7 = var1.secondMultipleValue();
                            var1.resetMultipleValues();
                            try {
                                var1.resetMultipleValues();
                                final SubLObject var3_9 = module0580.$g4358$.currentBinding(var1);
                                try {
                                    module0580.$g4358$.bind(module0580.f35544(), var1);
                                    final SubLObject var8 = var1.secondMultipleValue();
                                    var1.resetMultipleValues();
                                    final SubLObject var3_10 = module0580.$g4359$.currentBinding(var1);
                                    try {
                                        module0580.$g4359$.bind(module0580.f35545(), var1);
                                        final SubLObject var9 = module0580.$g4358$.getDynamicValue(var1);
                                        final SubLObject var3_11 = module0034.$g879$.currentBinding(var1);
                                        try {
                                            module0034.$g879$.bind(var9, var1);
                                            SubLObject var10 = (SubLObject)module0763.NIL;
                                            if (module0763.NIL != var9 && module0763.NIL == module0034.f1842(var9)) {
                                                var10 = module0034.f1869(var9);
                                                final SubLObject var11 = Threads.current_process();
                                                if (module0763.NIL == var10) {
                                                    module0034.f1873(var9, var11);
                                                }
                                                else if (!var10.eql(var11)) {
                                                    Errors.error((SubLObject)module0763.$ic3$);
                                                }
                                            }
                                            try {
                                                f48235();
                                            }
                                            finally {
                                                final SubLObject var3_12 = Threads.$is_thread_performing_cleanupP$.currentBinding(var1);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0763.T, var1);
                                                    if (module0763.NIL != var9 && module0763.NIL == var10) {
                                                        module0034.f1873(var9, (SubLObject)module0763.NIL);
                                                    }
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var3_12, var1);
                                                }
                                            }
                                        }
                                        finally {
                                            module0034.$g879$.rebind(var3_11, var1);
                                        }
                                    }
                                    finally {
                                        module0580.$g4359$.rebind(var3_10, var1);
                                    }
                                    if (var8 == module0763.$ic4$ && module0763.NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var1))) {
                                        module0034.f1891(module0580.$g4358$.getDynamicValue(var1));
                                    }
                                }
                                finally {
                                    module0580.$g4358$.rebind(var3_9, var1);
                                }
                            }
                            finally {
                                final SubLObject var3_13 = Threads.$is_thread_performing_cleanupP$.currentBinding(var1);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0763.T, var1);
                                    if (module0763.NIL == var7) {
                                        module0580.f35554(module0580.$g4362$.getDynamicValue(var1));
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var3_13, var1);
                                }
                            }
                        }
                        finally {
                            module0580.$g4362$.rebind(var3_8, var1);
                        }
                    }
                    finally {
                        module0580.$g4361$.rebind(var3_7, var1);
                    }
                }
                finally {
                    if (module0763.NIL != var6) {
                        Locks.release_lock(var5);
                    }
                }
            }
            finally {
                final SubLObject var3_14 = Threads.$is_thread_performing_cleanupP$.currentBinding(var1);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0763.T, var1);
                    if (module0763.NIL != var4) {
                        module0593.f36268((SubLObject)module0763.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var3_14, var1);
                }
            }
        }
        finally {
            module0763.$g6107$.rebind(var3, var1);
        }
        module0770.f49102((SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
        module0749.f46337();
        return (SubLObject)module0763.$ic5$;
    }
    
    public static SubLObject f48236() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = (SubLObject)module0763.ZERO_INTEGER;
        final SubLObject var3 = module0749.f46341();
        if (module0763.NIL == module0004.f105(var3)) {
            Errors.warn((SubLObject)module0763.$ic6$, var3);
            return (SubLObject)module0763.NIL;
        }
        final SubLObject var4 = module0147.$g2094$.currentBinding(var1);
        final SubLObject var5 = module0147.$g2095$.currentBinding(var1);
        try {
            module0147.$g2094$.bind((SubLObject)module0763.$ic7$, var1);
            module0147.$g2095$.bind(module0763.$ic8$, var1);
            final SubLObject var6 = module0763.$ic9$;
            final SubLObject var3_24 = module0137.$g1605$.currentBinding(var1);
            final SubLObject var22_25 = module0139.$g1636$.currentBinding(var1);
            try {
                module0137.$g1605$.bind(module0137.f8955(module0763.$ic10$), var1);
                module0139.$g1636$.bind(module0139.f9007(), var1);
                SubLObject var26_27 = var6;
                final SubLObject var7 = (SubLObject)module0763.$ic13$;
                final SubLObject var8 = module0056.f4145(var7);
                final SubLObject var3_25 = module0139.$g1635$.currentBinding(var1);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var1);
                    final SubLObject var9 = (SubLObject)module0763.NIL;
                    final SubLObject var3_26 = module0141.$g1714$.currentBinding(var1);
                    final SubLObject var22_26 = module0141.$g1715$.currentBinding(var1);
                    try {
                        module0141.$g1714$.bind((module0763.NIL != var9) ? var9 : module0141.f9283(), var1);
                        module0141.$g1715$.bind((SubLObject)((module0763.NIL != var9) ? module0763.$ic14$ : module0141.$g1715$.getDynamicValue(var1)), var1);
                        if (module0763.NIL != var9 && module0763.NIL != module0136.f8864() && module0763.NIL == module0141.f9279(var9)) {
                            final SubLObject var10 = module0136.$g1591$.getDynamicValue(var1);
                            if (var10.eql((SubLObject)module0763.$ic15$)) {
                                module0136.f8870((SubLObject)module0763.ONE_INTEGER, (SubLObject)module0763.$ic16$, var9, (SubLObject)module0763.$ic17$, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
                            }
                            else if (var10.eql((SubLObject)module0763.$ic18$)) {
                                module0136.f8871((SubLObject)module0763.ONE_INTEGER, (SubLObject)module0763.$ic19$, (SubLObject)module0763.$ic16$, var9, (SubLObject)module0763.$ic17$, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
                            }
                            else if (var10.eql((SubLObject)module0763.$ic20$)) {
                                Errors.warn((SubLObject)module0763.$ic16$, var9, (SubLObject)module0763.$ic17$);
                            }
                            else {
                                Errors.warn((SubLObject)module0763.$ic21$, module0136.$g1591$.getDynamicValue(var1));
                                Errors.cerror((SubLObject)module0763.$ic19$, (SubLObject)module0763.$ic16$, var9, (SubLObject)module0763.$ic17$);
                            }
                        }
                        final SubLObject var3_27 = module0141.$g1670$.currentBinding(var1);
                        final SubLObject var22_27 = module0141.$g1671$.currentBinding(var1);
                        final SubLObject var11 = module0141.$g1672$.currentBinding(var1);
                        final SubLObject var12 = module0141.$g1674$.currentBinding(var1);
                        final SubLObject var13 = module0137.$g1605$.currentBinding(var1);
                        try {
                            module0141.$g1670$.bind(module0244.f15771(module0137.f8955(module0763.$ic10$)), var1);
                            module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955(module0763.$ic10$))), var1);
                            module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955(module0763.$ic10$))), var1);
                            module0141.$g1674$.bind((SubLObject)module0763.NIL, var1);
                            module0137.$g1605$.bind(module0244.f15771(module0137.f8955(module0763.$ic10$)), var1);
                            if (module0763.NIL != module0136.f8865() || module0763.NIL != module0244.f15795(var6, module0137.f8955((SubLObject)module0763.UNPROVIDED))) {
                                final SubLObject var3_28 = module0141.$g1677$.currentBinding(var1);
                                final SubLObject var22_28 = module0138.$g1619$.currentBinding(var1);
                                final SubLObject var37_42 = module0141.$g1674$.currentBinding(var1);
                                try {
                                    module0141.$g1677$.bind(module0141.f9210(), var1);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955(module0763.$ic10$))), var1);
                                    module0141.$g1674$.bind((SubLObject)module0763.NIL, var1);
                                    module0249.f16055(var26_27, (SubLObject)module0763.UNPROVIDED);
                                    while (module0763.NIL != var26_27) {
                                        final SubLObject var14 = var26_27;
                                        SubLObject var16;
                                        final SubLObject var15 = var16 = module0200.f12443(module0137.f8955(module0763.$ic10$));
                                        SubLObject var17 = (SubLObject)module0763.NIL;
                                        var17 = var16.first();
                                        while (module0763.NIL != var16) {
                                            final SubLObject var3_29 = module0137.$g1605$.currentBinding(var1);
                                            final SubLObject var22_29 = module0141.$g1674$.currentBinding(var1);
                                            try {
                                                module0137.$g1605$.bind(var17, var1);
                                                module0141.$g1674$.bind((SubLObject)((module0763.NIL != module0141.f9205((SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0763.NIL == module0141.$g1674$.getDynamicValue(var1)) : module0141.$g1674$.getDynamicValue(var1)), var1);
                                                final SubLObject var18 = module0228.f15229(var14);
                                                if (module0763.NIL != module0138.f8992(var18)) {
                                                    final SubLObject var19 = module0242.f15664(var18, module0137.f8955((SubLObject)module0763.UNPROVIDED));
                                                    if (module0763.NIL != var19) {
                                                        final SubLObject var20 = module0245.f15834(var19, module0244.f15780(module0137.f8955(module0763.$ic10$)), module0137.f8955((SubLObject)module0763.UNPROVIDED));
                                                        if (module0763.NIL != var20) {
                                                            SubLObject var21;
                                                            for (var21 = module0066.f4838(module0067.f4891(var20)); module0763.NIL == module0066.f4841(var21); var21 = module0066.f4840(var21)) {
                                                                var1.resetMultipleValues();
                                                                final SubLObject var22 = module0066.f4839(var21);
                                                                final SubLObject var23 = var1.secondMultipleValue();
                                                                var1.resetMultipleValues();
                                                                if (module0763.NIL != module0147.f9507(var22)) {
                                                                    final SubLObject var3_30 = module0138.$g1623$.currentBinding(var1);
                                                                    try {
                                                                        module0138.$g1623$.bind(var22, var1);
                                                                        SubLObject var52_56;
                                                                        for (var52_56 = module0066.f4838(module0067.f4891(var23)); module0763.NIL == module0066.f4841(var52_56); var52_56 = module0066.f4840(var52_56)) {
                                                                            var1.resetMultipleValues();
                                                                            final SubLObject var24 = module0066.f4839(var52_56);
                                                                            final SubLObject var25 = var1.secondMultipleValue();
                                                                            var1.resetMultipleValues();
                                                                            if (module0763.NIL != module0141.f9289(var24)) {
                                                                                final SubLObject var3_31 = module0138.$g1624$.currentBinding(var1);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var24, var1);
                                                                                    final SubLObject var26 = var25;
                                                                                    if (module0763.NIL != module0077.f5302(var26)) {
                                                                                        final SubLObject var27 = module0077.f5333(var26);
                                                                                        SubLObject var28;
                                                                                        SubLObject var29;
                                                                                        SubLObject var30;
                                                                                        for (var28 = module0032.f1741(var27), var29 = (SubLObject)module0763.NIL, var29 = module0032.f1742(var28, var27); module0763.NIL == module0032.f1744(var28, var29); var29 = module0032.f1743(var29)) {
                                                                                            var30 = module0032.f1745(var28, var29);
                                                                                            if (module0763.NIL != module0032.f1746(var29, var30) && module0763.NIL == module0249.f16059(var30, module0139.$g1636$.getDynamicValue(var1))) {
                                                                                                module0249.f16055(var30, module0139.$g1636$.getDynamicValue(var1));
                                                                                                if (module0763.NIL != module0173.f10955(var30)) {
                                                                                                    var2 = Numbers.add(var2, module0217.f14247(var30, (SubLObject)module0763.UNPROVIDED));
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var26.isList()) {
                                                                                        SubLObject var31 = var26;
                                                                                        SubLObject var32 = (SubLObject)module0763.NIL;
                                                                                        var32 = var31.first();
                                                                                        while (module0763.NIL != var31) {
                                                                                            if (module0763.NIL == module0249.f16059(var32, module0139.$g1636$.getDynamicValue(var1))) {
                                                                                                module0249.f16055(var32, module0139.$g1636$.getDynamicValue(var1));
                                                                                                if (module0763.NIL != module0173.f10955(var32)) {
                                                                                                    var2 = Numbers.add(var2, module0217.f14247(var32, (SubLObject)module0763.UNPROVIDED));
                                                                                                }
                                                                                            }
                                                                                            var31 = var31.rest();
                                                                                            var32 = var31.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0763.$ic22$, var26);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var3_31, var1);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var52_56);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var3_30, var1);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var21);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0763.FIVE_INTEGER, (SubLObject)module0763.$ic23$, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
                                                    }
                                                    if (module0763.NIL != module0200.f12419(var18, module0137.f8955((SubLObject)module0763.UNPROVIDED))) {
                                                        SubLObject var33 = module0248.f15995(var18);
                                                        SubLObject var34 = (SubLObject)module0763.NIL;
                                                        var34 = var33.first();
                                                        while (module0763.NIL != var33) {
                                                            SubLObject var36;
                                                            final SubLObject var35 = var36 = var34;
                                                            SubLObject var37 = (SubLObject)module0763.NIL;
                                                            SubLObject var38 = (SubLObject)module0763.NIL;
                                                            SubLObject var39 = (SubLObject)module0763.NIL;
                                                            cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)module0763.$ic24$);
                                                            var37 = var36.first();
                                                            var36 = var36.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)module0763.$ic24$);
                                                            var38 = var36.first();
                                                            var36 = var36.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)module0763.$ic24$);
                                                            var39 = var36.first();
                                                            var36 = var36.rest();
                                                            if (module0763.NIL == var36) {
                                                                if (module0763.NIL != module0147.f9507(var38)) {
                                                                    final SubLObject var3_32 = module0138.$g1623$.currentBinding(var1);
                                                                    try {
                                                                        module0138.$g1623$.bind(var38, var1);
                                                                        if (module0763.NIL != module0141.f9289(var39)) {
                                                                            final SubLObject var3_33 = module0138.$g1624$.currentBinding(var1);
                                                                            try {
                                                                                module0138.$g1624$.bind(var39, var1);
                                                                                final SubLObject var26;
                                                                                final SubLObject var40 = var26 = (SubLObject)ConsesLow.list(var37);
                                                                                if (module0763.NIL != module0077.f5302(var26)) {
                                                                                    final SubLObject var27 = module0077.f5333(var26);
                                                                                    SubLObject var28;
                                                                                    SubLObject var29;
                                                                                    SubLObject var30;
                                                                                    for (var28 = module0032.f1741(var27), var29 = (SubLObject)module0763.NIL, var29 = module0032.f1742(var28, var27); module0763.NIL == module0032.f1744(var28, var29); var29 = module0032.f1743(var29)) {
                                                                                        var30 = module0032.f1745(var28, var29);
                                                                                        if (module0763.NIL != module0032.f1746(var29, var30) && module0763.NIL == module0249.f16059(var30, module0139.$g1636$.getDynamicValue(var1))) {
                                                                                            module0249.f16055(var30, module0139.$g1636$.getDynamicValue(var1));
                                                                                            if (module0763.NIL != module0173.f10955(var30)) {
                                                                                                var2 = Numbers.add(var2, module0217.f14247(var30, (SubLObject)module0763.UNPROVIDED));
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var26.isList()) {
                                                                                    SubLObject var65_74 = var26;
                                                                                    SubLObject var32 = (SubLObject)module0763.NIL;
                                                                                    var32 = var65_74.first();
                                                                                    while (module0763.NIL != var65_74) {
                                                                                        if (module0763.NIL == module0249.f16059(var32, module0139.$g1636$.getDynamicValue(var1))) {
                                                                                            module0249.f16055(var32, module0139.$g1636$.getDynamicValue(var1));
                                                                                            if (module0763.NIL != module0173.f10955(var32)) {
                                                                                                var2 = Numbers.add(var2, module0217.f14247(var32, (SubLObject)module0763.UNPROVIDED));
                                                                                            }
                                                                                        }
                                                                                        var65_74 = var65_74.rest();
                                                                                        var32 = var65_74.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)module0763.$ic22$, var26);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var3_33, var1);
                                                                            }
                                                                        }
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var3_32, var1);
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                cdestructuring_bind.cdestructuring_bind_error(var35, (SubLObject)module0763.$ic24$);
                                                            }
                                                            var33 = var33.rest();
                                                            var34 = var33.first();
                                                        }
                                                    }
                                                }
                                                else if (module0763.NIL != module0155.f9785(var18, (SubLObject)module0763.UNPROVIDED)) {
                                                    SubLObject var45_76;
                                                    final SubLObject var41 = var45_76 = ((module0763.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955(module0763.$ic10$)), module0141.$g1714$.getDynamicValue(var1), module0137.f8955((SubLObject)module0763.UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955(module0763.$ic10$)), module0141.$g1714$.getDynamicValue(var1), module0137.f8955((SubLObject)module0763.UNPROVIDED)));
                                                    SubLObject var42 = (SubLObject)module0763.NIL;
                                                    var42 = var45_76.first();
                                                    while (module0763.NIL != var45_76) {
                                                        final SubLObject var3_34 = module0138.$g1625$.currentBinding(var1);
                                                        try {
                                                            module0138.$g1625$.bind(var42, var1);
                                                            final SubLObject var44;
                                                            final SubLObject var43 = var44 = Functions.funcall(var42, var18);
                                                            if (module0763.NIL != module0077.f5302(var44)) {
                                                                final SubLObject var45 = module0077.f5333(var44);
                                                                SubLObject var46;
                                                                SubLObject var47;
                                                                SubLObject var48;
                                                                for (var46 = module0032.f1741(var45), var47 = (SubLObject)module0763.NIL, var47 = module0032.f1742(var46, var45); module0763.NIL == module0032.f1744(var46, var47); var47 = module0032.f1743(var47)) {
                                                                    var48 = module0032.f1745(var46, var47);
                                                                    if (module0763.NIL != module0032.f1746(var47, var48) && module0763.NIL == module0249.f16059(var48, module0139.$g1636$.getDynamicValue(var1))) {
                                                                        module0249.f16055(var48, module0139.$g1636$.getDynamicValue(var1));
                                                                        if (module0763.NIL != module0173.f10955(var48)) {
                                                                            var2 = Numbers.add(var2, module0217.f14247(var48, (SubLObject)module0763.UNPROVIDED));
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            else if (var44.isList()) {
                                                                SubLObject var49 = var44;
                                                                SubLObject var50 = (SubLObject)module0763.NIL;
                                                                var50 = var49.first();
                                                                while (module0763.NIL != var49) {
                                                                    if (module0763.NIL == module0249.f16059(var50, module0139.$g1636$.getDynamicValue(var1))) {
                                                                        module0249.f16055(var50, module0139.$g1636$.getDynamicValue(var1));
                                                                        if (module0763.NIL != module0173.f10955(var50)) {
                                                                            var2 = Numbers.add(var2, module0217.f14247(var50, (SubLObject)module0763.UNPROVIDED));
                                                                        }
                                                                    }
                                                                    var49 = var49.rest();
                                                                    var50 = var49.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0763.$ic22$, var44);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var3_34, var1);
                                                        }
                                                        var45_76 = var45_76.rest();
                                                        var42 = var45_76.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var22_29, var1);
                                                module0137.$g1605$.rebind(var3_29, var1);
                                            }
                                            var16 = var16.rest();
                                            var17 = var16.first();
                                        }
                                        SubLObject var52;
                                        final SubLObject var51 = var52 = module0200.f12443(module0244.f15771(module0137.f8955(module0763.$ic10$)));
                                        SubLObject var53 = (SubLObject)module0763.NIL;
                                        var53 = var52.first();
                                        while (module0763.NIL != var52) {
                                            final SubLObject var3_35 = module0137.$g1605$.currentBinding(var1);
                                            final SubLObject var22_30 = module0141.$g1674$.currentBinding(var1);
                                            try {
                                                module0137.$g1605$.bind(var53, var1);
                                                module0141.$g1674$.bind((SubLObject)((module0763.NIL != module0141.f9205((SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0763.NIL == module0141.$g1674$.getDynamicValue(var1)) : module0141.$g1674$.getDynamicValue(var1)), var1);
                                                final SubLObject var54 = module0228.f15229(var26_27);
                                                if (module0763.NIL != module0138.f8992(var54)) {
                                                    final SubLObject var55 = module0242.f15664(var54, module0137.f8955((SubLObject)module0763.UNPROVIDED));
                                                    if (module0763.NIL != var55) {
                                                        final SubLObject var56 = module0245.f15834(var55, module0138.f8979(), module0137.f8955((SubLObject)module0763.UNPROVIDED));
                                                        if (module0763.NIL != var56) {
                                                            SubLObject var57;
                                                            for (var57 = module0066.f4838(module0067.f4891(var56)); module0763.NIL == module0066.f4841(var57); var57 = module0066.f4840(var57)) {
                                                                var1.resetMultipleValues();
                                                                final SubLObject var58 = module0066.f4839(var57);
                                                                final SubLObject var59 = var1.secondMultipleValue();
                                                                var1.resetMultipleValues();
                                                                if (module0763.NIL != module0147.f9507(var58)) {
                                                                    final SubLObject var3_36 = module0138.$g1623$.currentBinding(var1);
                                                                    try {
                                                                        module0138.$g1623$.bind(var58, var1);
                                                                        SubLObject var52_57;
                                                                        for (var52_57 = module0066.f4838(module0067.f4891(var59)); module0763.NIL == module0066.f4841(var52_57); var52_57 = module0066.f4840(var52_57)) {
                                                                            var1.resetMultipleValues();
                                                                            final SubLObject var60 = module0066.f4839(var52_57);
                                                                            final SubLObject var61 = var1.secondMultipleValue();
                                                                            var1.resetMultipleValues();
                                                                            if (module0763.NIL != module0141.f9289(var60)) {
                                                                                final SubLObject var3_37 = module0138.$g1624$.currentBinding(var1);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var60, var1);
                                                                                    final SubLObject var62 = var61;
                                                                                    if (module0763.NIL != module0077.f5302(var62)) {
                                                                                        final SubLObject var63 = module0077.f5333(var62);
                                                                                        SubLObject var64;
                                                                                        SubLObject var65;
                                                                                        SubLObject var66;
                                                                                        for (var64 = module0032.f1741(var63), var65 = (SubLObject)module0763.NIL, var65 = module0032.f1742(var64, var63); module0763.NIL == module0032.f1744(var64, var65); var65 = module0032.f1743(var65)) {
                                                                                            var66 = module0032.f1745(var64, var65);
                                                                                            if (module0763.NIL != module0032.f1746(var65, var66) && module0763.NIL == module0249.f16059(var66, (SubLObject)module0763.UNPROVIDED)) {
                                                                                                module0249.f16055(var66, (SubLObject)module0763.UNPROVIDED);
                                                                                                module0056.f4149(var66, var8);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var62.isList()) {
                                                                                        SubLObject var67 = var62;
                                                                                        SubLObject var68 = (SubLObject)module0763.NIL;
                                                                                        var68 = var67.first();
                                                                                        while (module0763.NIL != var67) {
                                                                                            if (module0763.NIL == module0249.f16059(var68, (SubLObject)module0763.UNPROVIDED)) {
                                                                                                module0249.f16055(var68, (SubLObject)module0763.UNPROVIDED);
                                                                                                module0056.f4149(var68, var8);
                                                                                            }
                                                                                            var67 = var67.rest();
                                                                                            var68 = var67.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0763.$ic22$, var62);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var3_37, var1);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var52_57);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var3_36, var1);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var57);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0763.FIVE_INTEGER, (SubLObject)module0763.$ic23$, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
                                                    }
                                                }
                                                else if (module0763.NIL != module0155.f9785(var54, (SubLObject)module0763.UNPROVIDED)) {
                                                    SubLObject var45_77;
                                                    final SubLObject var69 = var45_77 = ((module0763.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var1), module0137.f8955((SubLObject)module0763.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var1), module0137.f8955((SubLObject)module0763.UNPROVIDED)));
                                                    SubLObject var70 = (SubLObject)module0763.NIL;
                                                    var70 = var45_77.first();
                                                    while (module0763.NIL != var45_77) {
                                                        final SubLObject var3_38 = module0138.$g1625$.currentBinding(var1);
                                                        try {
                                                            module0138.$g1625$.bind(var70, var1);
                                                            final SubLObject var72;
                                                            final SubLObject var71 = var72 = Functions.funcall(var70, var54);
                                                            if (module0763.NIL != module0077.f5302(var72)) {
                                                                final SubLObject var73 = module0077.f5333(var72);
                                                                SubLObject var74;
                                                                SubLObject var75;
                                                                SubLObject var76;
                                                                for (var74 = module0032.f1741(var73), var75 = (SubLObject)module0763.NIL, var75 = module0032.f1742(var74, var73); module0763.NIL == module0032.f1744(var74, var75); var75 = module0032.f1743(var75)) {
                                                                    var76 = module0032.f1745(var74, var75);
                                                                    if (module0763.NIL != module0032.f1746(var75, var76) && module0763.NIL == module0249.f16059(var76, (SubLObject)module0763.UNPROVIDED)) {
                                                                        module0249.f16055(var76, (SubLObject)module0763.UNPROVIDED);
                                                                        module0056.f4149(var76, var8);
                                                                    }
                                                                }
                                                            }
                                                            else if (var72.isList()) {
                                                                SubLObject var77 = var72;
                                                                SubLObject var78 = (SubLObject)module0763.NIL;
                                                                var78 = var77.first();
                                                                while (module0763.NIL != var77) {
                                                                    if (module0763.NIL == module0249.f16059(var78, (SubLObject)module0763.UNPROVIDED)) {
                                                                        module0249.f16055(var78, (SubLObject)module0763.UNPROVIDED);
                                                                        module0056.f4149(var78, var8);
                                                                    }
                                                                    var77 = var77.rest();
                                                                    var78 = var77.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0763.$ic22$, var72);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var3_38, var1);
                                                        }
                                                        var45_77 = var45_77.rest();
                                                        var70 = var45_77.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var22_30, var1);
                                                module0137.$g1605$.rebind(var3_35, var1);
                                            }
                                            var52 = var52.rest();
                                            var53 = var52.first();
                                        }
                                        var26_27 = module0056.f4150(var8);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var37_42, var1);
                                    module0138.$g1619$.rebind(var22_28, var1);
                                    module0141.$g1677$.rebind(var3_28, var1);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)module0763.TWO_INTEGER, (SubLObject)module0763.$ic25$, var6, module0244.f15748(module0137.f8955((SubLObject)module0763.UNPROVIDED)), (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var13, var1);
                            module0141.$g1674$.rebind(var12, var1);
                            module0141.$g1672$.rebind(var11, var1);
                            module0141.$g1671$.rebind(var22_27, var1);
                            module0141.$g1670$.rebind(var3_27, var1);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var22_26, var1);
                        module0141.$g1714$.rebind(var3_26, var1);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var1));
                }
                finally {
                    module0139.$g1635$.rebind(var3_25, var1);
                }
                module0139.f9011(module0139.$g1636$.getDynamicValue(var1));
            }
            finally {
                module0139.$g1636$.rebind(var22_25, var1);
                module0137.$g1605$.rebind(var3_24, var1);
            }
        }
        finally {
            module0147.$g2095$.rebind(var5, var1);
            module0147.$g2094$.rebind(var4, var1);
        }
        final SubLObject var79 = Numbers.divide(var2, var3);
        if (var79.numL((SubLObject)module0763.ONE_INTEGER)) {
            Errors.warn((SubLObject)module0763.$ic26$, var3, var2);
            return (SubLObject)module0763.NIL;
        }
        if (var79.numG((SubLObject)module0763.TEN_INTEGER)) {
            Errors.warn((SubLObject)module0763.$ic27$, var3, var2);
            return (SubLObject)module0763.NIL;
        }
        return (SubLObject)module0763.T;
    }
    
    public static SubLObject f48235() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = module0147.$g2094$.currentBinding(var1);
        final SubLObject var3 = module0147.$g2095$.currentBinding(var1);
        try {
            module0147.$g2094$.bind((SubLObject)module0763.$ic7$, var1);
            module0147.$g2095$.bind(module0763.$ic8$, var1);
            final SubLObject var4 = module0763.$ic9$;
            final SubLObject var3_90 = module0137.$g1605$.currentBinding(var1);
            final SubLObject var22_91 = module0139.$g1636$.currentBinding(var1);
            try {
                module0137.$g1605$.bind(module0137.f8955(module0763.$ic10$), var1);
                module0139.$g1636$.bind(module0139.f9007(), var1);
                SubLObject var26_92 = var4;
                final SubLObject var5 = (SubLObject)module0763.$ic13$;
                final SubLObject var6 = module0056.f4145(var5);
                final SubLObject var3_91 = module0139.$g1635$.currentBinding(var1);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var1);
                    final SubLObject var7 = (SubLObject)module0763.NIL;
                    final SubLObject var3_92 = module0141.$g1714$.currentBinding(var1);
                    final SubLObject var22_92 = module0141.$g1715$.currentBinding(var1);
                    try {
                        module0141.$g1714$.bind((module0763.NIL != var7) ? var7 : module0141.f9283(), var1);
                        module0141.$g1715$.bind((SubLObject)((module0763.NIL != var7) ? module0763.$ic14$ : module0141.$g1715$.getDynamicValue(var1)), var1);
                        if (module0763.NIL != var7 && module0763.NIL != module0136.f8864() && module0763.NIL == module0141.f9279(var7)) {
                            final SubLObject var8 = module0136.$g1591$.getDynamicValue(var1);
                            if (var8.eql((SubLObject)module0763.$ic15$)) {
                                module0136.f8870((SubLObject)module0763.ONE_INTEGER, (SubLObject)module0763.$ic16$, var7, (SubLObject)module0763.$ic17$, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
                            }
                            else if (var8.eql((SubLObject)module0763.$ic18$)) {
                                module0136.f8871((SubLObject)module0763.ONE_INTEGER, (SubLObject)module0763.$ic19$, (SubLObject)module0763.$ic16$, var7, (SubLObject)module0763.$ic17$, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
                            }
                            else if (var8.eql((SubLObject)module0763.$ic20$)) {
                                Errors.warn((SubLObject)module0763.$ic16$, var7, (SubLObject)module0763.$ic17$);
                            }
                            else {
                                Errors.warn((SubLObject)module0763.$ic21$, module0136.$g1591$.getDynamicValue(var1));
                                Errors.cerror((SubLObject)module0763.$ic19$, (SubLObject)module0763.$ic16$, var7, (SubLObject)module0763.$ic17$);
                            }
                        }
                        final SubLObject var3_93 = module0141.$g1670$.currentBinding(var1);
                        final SubLObject var22_93 = module0141.$g1671$.currentBinding(var1);
                        final SubLObject var9 = module0141.$g1672$.currentBinding(var1);
                        final SubLObject var10 = module0141.$g1674$.currentBinding(var1);
                        final SubLObject var11 = module0137.$g1605$.currentBinding(var1);
                        try {
                            module0141.$g1670$.bind(module0244.f15771(module0137.f8955(module0763.$ic10$)), var1);
                            module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955(module0763.$ic10$))), var1);
                            module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955(module0763.$ic10$))), var1);
                            module0141.$g1674$.bind((SubLObject)module0763.NIL, var1);
                            module0137.$g1605$.bind(module0244.f15771(module0137.f8955(module0763.$ic10$)), var1);
                            if (module0763.NIL != module0136.f8865() || module0763.NIL != module0244.f15795(var4, module0137.f8955((SubLObject)module0763.UNPROVIDED))) {
                                final SubLObject var3_94 = module0141.$g1677$.currentBinding(var1);
                                final SubLObject var22_94 = module0138.$g1619$.currentBinding(var1);
                                final SubLObject var37_100 = module0141.$g1674$.currentBinding(var1);
                                try {
                                    module0141.$g1677$.bind(module0141.f9210(), var1);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955(module0763.$ic10$))), var1);
                                    module0141.$g1674$.bind((SubLObject)module0763.NIL, var1);
                                    module0249.f16055(var26_92, (SubLObject)module0763.UNPROVIDED);
                                    while (module0763.NIL != var26_92) {
                                        final SubLObject var12 = var26_92;
                                        SubLObject var14;
                                        final SubLObject var13 = var14 = module0200.f12443(module0137.f8955(module0763.$ic10$));
                                        SubLObject var15 = (SubLObject)module0763.NIL;
                                        var15 = var14.first();
                                        while (module0763.NIL != var14) {
                                            final SubLObject var3_95 = module0137.$g1605$.currentBinding(var1);
                                            final SubLObject var22_95 = module0141.$g1674$.currentBinding(var1);
                                            try {
                                                module0137.$g1605$.bind(var15, var1);
                                                module0141.$g1674$.bind((SubLObject)((module0763.NIL != module0141.f9205((SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0763.NIL == module0141.$g1674$.getDynamicValue(var1)) : module0141.$g1674$.getDynamicValue(var1)), var1);
                                                final SubLObject var16 = module0228.f15229(var12);
                                                if (module0763.NIL != module0138.f8992(var16)) {
                                                    final SubLObject var17 = module0242.f15664(var16, module0137.f8955((SubLObject)module0763.UNPROVIDED));
                                                    if (module0763.NIL != var17) {
                                                        final SubLObject var18 = module0245.f15834(var17, module0244.f15780(module0137.f8955(module0763.$ic10$)), module0137.f8955((SubLObject)module0763.UNPROVIDED));
                                                        if (module0763.NIL != var18) {
                                                            SubLObject var19;
                                                            for (var19 = module0066.f4838(module0067.f4891(var18)); module0763.NIL == module0066.f4841(var19); var19 = module0066.f4840(var19)) {
                                                                var1.resetMultipleValues();
                                                                final SubLObject var20 = module0066.f4839(var19);
                                                                final SubLObject var21 = var1.secondMultipleValue();
                                                                var1.resetMultipleValues();
                                                                if (module0763.NIL != module0147.f9507(var20)) {
                                                                    final SubLObject var3_96 = module0138.$g1623$.currentBinding(var1);
                                                                    try {
                                                                        module0138.$g1623$.bind(var20, var1);
                                                                        SubLObject var52_104;
                                                                        for (var52_104 = module0066.f4838(module0067.f4891(var21)); module0763.NIL == module0066.f4841(var52_104); var52_104 = module0066.f4840(var52_104)) {
                                                                            var1.resetMultipleValues();
                                                                            final SubLObject var22 = module0066.f4839(var52_104);
                                                                            final SubLObject var23 = var1.secondMultipleValue();
                                                                            var1.resetMultipleValues();
                                                                            if (module0763.NIL != module0141.f9289(var22)) {
                                                                                final SubLObject var3_97 = module0138.$g1624$.currentBinding(var1);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var22, var1);
                                                                                    final SubLObject var24 = var23;
                                                                                    if (module0763.NIL != module0077.f5302(var24)) {
                                                                                        final SubLObject var25 = module0077.f5333(var24);
                                                                                        SubLObject var26;
                                                                                        SubLObject var27;
                                                                                        SubLObject var28;
                                                                                        for (var26 = module0032.f1741(var25), var27 = (SubLObject)module0763.NIL, var27 = module0032.f1742(var26, var25); module0763.NIL == module0032.f1744(var26, var27); var27 = module0032.f1743(var27)) {
                                                                                            var28 = module0032.f1745(var26, var27);
                                                                                            if (module0763.NIL != module0032.f1746(var27, var28) && module0763.NIL == module0249.f16059(var28, module0139.$g1636$.getDynamicValue(var1))) {
                                                                                                module0249.f16055(var28, module0139.$g1636$.getDynamicValue(var1));
                                                                                                if (module0763.NIL != module0173.f10955(var28) && module0763.NIL != module0004.f104(module0763.$ic28$, module0226.f14881(var28, (SubLObject)module0763.UNPROVIDED), (SubLObject)module0763.$ic29$, (SubLObject)module0763.UNPROVIDED)) {
                                                                                                    f48237(var28);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var24.isList()) {
                                                                                        SubLObject var29 = var24;
                                                                                        SubLObject var30 = (SubLObject)module0763.NIL;
                                                                                        var30 = var29.first();
                                                                                        while (module0763.NIL != var29) {
                                                                                            if (module0763.NIL == module0249.f16059(var30, module0139.$g1636$.getDynamicValue(var1))) {
                                                                                                module0249.f16055(var30, module0139.$g1636$.getDynamicValue(var1));
                                                                                                if (module0763.NIL != module0173.f10955(var30) && module0763.NIL != module0004.f104(module0763.$ic28$, module0226.f14881(var30, (SubLObject)module0763.UNPROVIDED), (SubLObject)module0763.$ic29$, (SubLObject)module0763.UNPROVIDED)) {
                                                                                                    f48237(var30);
                                                                                                }
                                                                                            }
                                                                                            var29 = var29.rest();
                                                                                            var30 = var29.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0763.$ic22$, var24);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var3_97, var1);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var52_104);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var3_96, var1);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var19);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0763.FIVE_INTEGER, (SubLObject)module0763.$ic23$, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
                                                    }
                                                    if (module0763.NIL != module0200.f12419(var16, module0137.f8955((SubLObject)module0763.UNPROVIDED))) {
                                                        SubLObject var31 = module0248.f15995(var16);
                                                        SubLObject var32 = (SubLObject)module0763.NIL;
                                                        var32 = var31.first();
                                                        while (module0763.NIL != var31) {
                                                            SubLObject var34;
                                                            final SubLObject var33 = var34 = var32;
                                                            SubLObject var35 = (SubLObject)module0763.NIL;
                                                            SubLObject var36 = (SubLObject)module0763.NIL;
                                                            SubLObject var37 = (SubLObject)module0763.NIL;
                                                            cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0763.$ic24$);
                                                            var35 = var34.first();
                                                            var34 = var34.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0763.$ic24$);
                                                            var36 = var34.first();
                                                            var34 = var34.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0763.$ic24$);
                                                            var37 = var34.first();
                                                            var34 = var34.rest();
                                                            if (module0763.NIL == var34) {
                                                                if (module0763.NIL != module0147.f9507(var36)) {
                                                                    final SubLObject var3_98 = module0138.$g1623$.currentBinding(var1);
                                                                    try {
                                                                        module0138.$g1623$.bind(var36, var1);
                                                                        if (module0763.NIL != module0141.f9289(var37)) {
                                                                            final SubLObject var3_99 = module0138.$g1624$.currentBinding(var1);
                                                                            try {
                                                                                module0138.$g1624$.bind(var37, var1);
                                                                                final SubLObject var24;
                                                                                final SubLObject var38 = var24 = (SubLObject)ConsesLow.list(var35);
                                                                                if (module0763.NIL != module0077.f5302(var24)) {
                                                                                    final SubLObject var25 = module0077.f5333(var24);
                                                                                    SubLObject var26;
                                                                                    SubLObject var27;
                                                                                    SubLObject var28;
                                                                                    for (var26 = module0032.f1741(var25), var27 = (SubLObject)module0763.NIL, var27 = module0032.f1742(var26, var25); module0763.NIL == module0032.f1744(var26, var27); var27 = module0032.f1743(var27)) {
                                                                                        var28 = module0032.f1745(var26, var27);
                                                                                        if (module0763.NIL != module0032.f1746(var27, var28) && module0763.NIL == module0249.f16059(var28, module0139.$g1636$.getDynamicValue(var1))) {
                                                                                            module0249.f16055(var28, module0139.$g1636$.getDynamicValue(var1));
                                                                                            if (module0763.NIL != module0173.f10955(var28) && module0763.NIL != module0004.f104(module0763.$ic28$, module0226.f14881(var28, (SubLObject)module0763.UNPROVIDED), (SubLObject)module0763.$ic29$, (SubLObject)module0763.UNPROVIDED)) {
                                                                                                f48237(var28);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var24.isList()) {
                                                                                    SubLObject var65_110 = var24;
                                                                                    SubLObject var30 = (SubLObject)module0763.NIL;
                                                                                    var30 = var65_110.first();
                                                                                    while (module0763.NIL != var65_110) {
                                                                                        if (module0763.NIL == module0249.f16059(var30, module0139.$g1636$.getDynamicValue(var1))) {
                                                                                            module0249.f16055(var30, module0139.$g1636$.getDynamicValue(var1));
                                                                                            if (module0763.NIL != module0173.f10955(var30) && module0763.NIL != module0004.f104(module0763.$ic28$, module0226.f14881(var30, (SubLObject)module0763.UNPROVIDED), (SubLObject)module0763.$ic29$, (SubLObject)module0763.UNPROVIDED)) {
                                                                                                f48237(var30);
                                                                                            }
                                                                                        }
                                                                                        var65_110 = var65_110.rest();
                                                                                        var30 = var65_110.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)module0763.$ic22$, var24);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var3_99, var1);
                                                                            }
                                                                        }
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var3_98, var1);
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                cdestructuring_bind.cdestructuring_bind_error(var33, (SubLObject)module0763.$ic24$);
                                                            }
                                                            var31 = var31.rest();
                                                            var32 = var31.first();
                                                        }
                                                    }
                                                }
                                                else if (module0763.NIL != module0155.f9785(var16, (SubLObject)module0763.UNPROVIDED)) {
                                                    SubLObject var45_111;
                                                    final SubLObject var39 = var45_111 = ((module0763.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955(module0763.$ic10$)), module0141.$g1714$.getDynamicValue(var1), module0137.f8955((SubLObject)module0763.UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955(module0763.$ic10$)), module0141.$g1714$.getDynamicValue(var1), module0137.f8955((SubLObject)module0763.UNPROVIDED)));
                                                    SubLObject var40 = (SubLObject)module0763.NIL;
                                                    var40 = var45_111.first();
                                                    while (module0763.NIL != var45_111) {
                                                        final SubLObject var3_100 = module0138.$g1625$.currentBinding(var1);
                                                        try {
                                                            module0138.$g1625$.bind(var40, var1);
                                                            final SubLObject var42;
                                                            final SubLObject var41 = var42 = Functions.funcall(var40, var16);
                                                            if (module0763.NIL != module0077.f5302(var42)) {
                                                                final SubLObject var43 = module0077.f5333(var42);
                                                                SubLObject var44;
                                                                SubLObject var45;
                                                                SubLObject var46;
                                                                for (var44 = module0032.f1741(var43), var45 = (SubLObject)module0763.NIL, var45 = module0032.f1742(var44, var43); module0763.NIL == module0032.f1744(var44, var45); var45 = module0032.f1743(var45)) {
                                                                    var46 = module0032.f1745(var44, var45);
                                                                    if (module0763.NIL != module0032.f1746(var45, var46) && module0763.NIL == module0249.f16059(var46, module0139.$g1636$.getDynamicValue(var1))) {
                                                                        module0249.f16055(var46, module0139.$g1636$.getDynamicValue(var1));
                                                                        if (module0763.NIL != module0173.f10955(var46) && module0763.NIL != module0004.f104(module0763.$ic28$, module0226.f14881(var46, (SubLObject)module0763.UNPROVIDED), (SubLObject)module0763.$ic29$, (SubLObject)module0763.UNPROVIDED)) {
                                                                            f48237(var46);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            else if (var42.isList()) {
                                                                SubLObject var47 = var42;
                                                                SubLObject var48 = (SubLObject)module0763.NIL;
                                                                var48 = var47.first();
                                                                while (module0763.NIL != var47) {
                                                                    if (module0763.NIL == module0249.f16059(var48, module0139.$g1636$.getDynamicValue(var1))) {
                                                                        module0249.f16055(var48, module0139.$g1636$.getDynamicValue(var1));
                                                                        if (module0763.NIL != module0173.f10955(var48) && module0763.NIL != module0004.f104(module0763.$ic28$, module0226.f14881(var48, (SubLObject)module0763.UNPROVIDED), (SubLObject)module0763.$ic29$, (SubLObject)module0763.UNPROVIDED)) {
                                                                            f48237(var48);
                                                                        }
                                                                    }
                                                                    var47 = var47.rest();
                                                                    var48 = var47.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0763.$ic22$, var42);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var3_100, var1);
                                                        }
                                                        var45_111 = var45_111.rest();
                                                        var40 = var45_111.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var22_95, var1);
                                                module0137.$g1605$.rebind(var3_95, var1);
                                            }
                                            var14 = var14.rest();
                                            var15 = var14.first();
                                        }
                                        SubLObject var50;
                                        final SubLObject var49 = var50 = module0200.f12443(module0244.f15771(module0137.f8955(module0763.$ic10$)));
                                        SubLObject var51 = (SubLObject)module0763.NIL;
                                        var51 = var50.first();
                                        while (module0763.NIL != var50) {
                                            final SubLObject var3_101 = module0137.$g1605$.currentBinding(var1);
                                            final SubLObject var22_96 = module0141.$g1674$.currentBinding(var1);
                                            try {
                                                module0137.$g1605$.bind(var51, var1);
                                                module0141.$g1674$.bind((SubLObject)((module0763.NIL != module0141.f9205((SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0763.NIL == module0141.$g1674$.getDynamicValue(var1)) : module0141.$g1674$.getDynamicValue(var1)), var1);
                                                final SubLObject var52 = module0228.f15229(var26_92);
                                                if (module0763.NIL != module0138.f8992(var52)) {
                                                    final SubLObject var53 = module0242.f15664(var52, module0137.f8955((SubLObject)module0763.UNPROVIDED));
                                                    if (module0763.NIL != var53) {
                                                        final SubLObject var54 = module0245.f15834(var53, module0138.f8979(), module0137.f8955((SubLObject)module0763.UNPROVIDED));
                                                        if (module0763.NIL != var54) {
                                                            SubLObject var55;
                                                            for (var55 = module0066.f4838(module0067.f4891(var54)); module0763.NIL == module0066.f4841(var55); var55 = module0066.f4840(var55)) {
                                                                var1.resetMultipleValues();
                                                                final SubLObject var56 = module0066.f4839(var55);
                                                                final SubLObject var57 = var1.secondMultipleValue();
                                                                var1.resetMultipleValues();
                                                                if (module0763.NIL != module0147.f9507(var56)) {
                                                                    final SubLObject var3_102 = module0138.$g1623$.currentBinding(var1);
                                                                    try {
                                                                        module0138.$g1623$.bind(var56, var1);
                                                                        SubLObject var52_105;
                                                                        for (var52_105 = module0066.f4838(module0067.f4891(var57)); module0763.NIL == module0066.f4841(var52_105); var52_105 = module0066.f4840(var52_105)) {
                                                                            var1.resetMultipleValues();
                                                                            final SubLObject var58 = module0066.f4839(var52_105);
                                                                            final SubLObject var59 = var1.secondMultipleValue();
                                                                            var1.resetMultipleValues();
                                                                            if (module0763.NIL != module0141.f9289(var58)) {
                                                                                final SubLObject var3_103 = module0138.$g1624$.currentBinding(var1);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var58, var1);
                                                                                    final SubLObject var60 = var59;
                                                                                    if (module0763.NIL != module0077.f5302(var60)) {
                                                                                        final SubLObject var61 = module0077.f5333(var60);
                                                                                        SubLObject var62;
                                                                                        SubLObject var63;
                                                                                        SubLObject var64;
                                                                                        for (var62 = module0032.f1741(var61), var63 = (SubLObject)module0763.NIL, var63 = module0032.f1742(var62, var61); module0763.NIL == module0032.f1744(var62, var63); var63 = module0032.f1743(var63)) {
                                                                                            var64 = module0032.f1745(var62, var63);
                                                                                            if (module0763.NIL != module0032.f1746(var63, var64) && module0763.NIL == module0249.f16059(var64, (SubLObject)module0763.UNPROVIDED)) {
                                                                                                module0249.f16055(var64, (SubLObject)module0763.UNPROVIDED);
                                                                                                module0056.f4149(var64, var6);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var60.isList()) {
                                                                                        SubLObject var65 = var60;
                                                                                        SubLObject var66 = (SubLObject)module0763.NIL;
                                                                                        var66 = var65.first();
                                                                                        while (module0763.NIL != var65) {
                                                                                            if (module0763.NIL == module0249.f16059(var66, (SubLObject)module0763.UNPROVIDED)) {
                                                                                                module0249.f16055(var66, (SubLObject)module0763.UNPROVIDED);
                                                                                                module0056.f4149(var66, var6);
                                                                                            }
                                                                                            var65 = var65.rest();
                                                                                            var66 = var65.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0763.$ic22$, var60);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var3_103, var1);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var52_105);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var3_102, var1);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var55);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0763.FIVE_INTEGER, (SubLObject)module0763.$ic23$, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
                                                    }
                                                }
                                                else if (module0763.NIL != module0155.f9785(var52, (SubLObject)module0763.UNPROVIDED)) {
                                                    SubLObject var45_112;
                                                    final SubLObject var67 = var45_112 = ((module0763.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var1), module0137.f8955((SubLObject)module0763.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var1), module0137.f8955((SubLObject)module0763.UNPROVIDED)));
                                                    SubLObject var68 = (SubLObject)module0763.NIL;
                                                    var68 = var45_112.first();
                                                    while (module0763.NIL != var45_112) {
                                                        final SubLObject var3_104 = module0138.$g1625$.currentBinding(var1);
                                                        try {
                                                            module0138.$g1625$.bind(var68, var1);
                                                            final SubLObject var70;
                                                            final SubLObject var69 = var70 = Functions.funcall(var68, var52);
                                                            if (module0763.NIL != module0077.f5302(var70)) {
                                                                final SubLObject var71 = module0077.f5333(var70);
                                                                SubLObject var72;
                                                                SubLObject var73;
                                                                SubLObject var74;
                                                                for (var72 = module0032.f1741(var71), var73 = (SubLObject)module0763.NIL, var73 = module0032.f1742(var72, var71); module0763.NIL == module0032.f1744(var72, var73); var73 = module0032.f1743(var73)) {
                                                                    var74 = module0032.f1745(var72, var73);
                                                                    if (module0763.NIL != module0032.f1746(var73, var74) && module0763.NIL == module0249.f16059(var74, (SubLObject)module0763.UNPROVIDED)) {
                                                                        module0249.f16055(var74, (SubLObject)module0763.UNPROVIDED);
                                                                        module0056.f4149(var74, var6);
                                                                    }
                                                                }
                                                            }
                                                            else if (var70.isList()) {
                                                                SubLObject var75 = var70;
                                                                SubLObject var76 = (SubLObject)module0763.NIL;
                                                                var76 = var75.first();
                                                                while (module0763.NIL != var75) {
                                                                    if (module0763.NIL == module0249.f16059(var76, (SubLObject)module0763.UNPROVIDED)) {
                                                                        module0249.f16055(var76, (SubLObject)module0763.UNPROVIDED);
                                                                        module0056.f4149(var76, var6);
                                                                    }
                                                                    var75 = var75.rest();
                                                                    var76 = var75.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0763.$ic22$, var70);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var3_104, var1);
                                                        }
                                                        var45_112 = var45_112.rest();
                                                        var68 = var45_112.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var22_96, var1);
                                                module0137.$g1605$.rebind(var3_101, var1);
                                            }
                                            var50 = var50.rest();
                                            var51 = var50.first();
                                        }
                                        var26_92 = module0056.f4150(var6);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var37_100, var1);
                                    module0138.$g1619$.rebind(var22_94, var1);
                                    module0141.$g1677$.rebind(var3_94, var1);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)module0763.TWO_INTEGER, (SubLObject)module0763.$ic25$, var4, module0244.f15748(module0137.f8955((SubLObject)module0763.UNPROVIDED)), (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var11, var1);
                            module0141.$g1674$.rebind(var10, var1);
                            module0141.$g1672$.rebind(var9, var1);
                            module0141.$g1671$.rebind(var22_93, var1);
                            module0141.$g1670$.rebind(var3_93, var1);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var22_92, var1);
                        module0141.$g1714$.rebind(var3_92, var1);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var1));
                }
                finally {
                    module0139.$g1635$.rebind(var3_91, var1);
                }
                module0139.f9011(module0139.$g1636$.getDynamicValue(var1));
            }
            finally {
                module0139.$g1636$.rebind(var22_91, var1);
                module0137.$g1605$.rebind(var3_90, var1);
            }
        }
        finally {
            module0147.$g2095$.rebind(var3, var1);
            module0147.$g2094$.rebind(var2, var1);
        }
        module0749.f46507((SubLObject)module0763.UNPROVIDED);
        return (SubLObject)module0763.$ic30$;
    }
    
    public static SubLObject f48237(final SubLObject var64) {
        final SubLThread var65 = SubLProcess.currentSubLThread();
        final SubLObject var66 = PrintLow.format((SubLObject)module0763.NIL, (SubLObject)module0763.$ic31$, var64);
        final SubLObject var67 = module0217.f14247(var64, (SubLObject)module0763.UNPROVIDED);
        SubLObject var68 = (SubLObject)module0763.ZERO_INTEGER;
        final SubLObject var69 = module0012.$g75$.currentBinding(var65);
        final SubLObject var70 = module0012.$g76$.currentBinding(var65);
        final SubLObject var71 = module0012.$g77$.currentBinding(var65);
        final SubLObject var72 = module0012.$g78$.currentBinding(var65);
        try {
            module0012.$g75$.bind((SubLObject)module0763.ZERO_INTEGER, var65);
            module0012.$g76$.bind((SubLObject)module0763.NIL, var65);
            module0012.$g77$.bind((SubLObject)module0763.T, var65);
            module0012.$g78$.bind(Time.get_universal_time(), var65);
            module0012.f478(var66);
            if (module0763.NIL != module0158.f10038(var64)) {
                final SubLObject var73 = (SubLObject)module0763.NIL;
                final SubLObject var3_125 = module0012.$g73$.currentBinding(var65);
                final SubLObject var22_126 = module0012.$g65$.currentBinding(var65);
                final SubLObject var37_127 = module0012.$g67$.currentBinding(var65);
                final SubLObject var38_128 = module0012.$g68$.currentBinding(var65);
                final SubLObject var74 = module0012.$g66$.currentBinding(var65);
                final SubLObject var75 = module0012.$g69$.currentBinding(var65);
                final SubLObject var76 = module0012.$g70$.currentBinding(var65);
                final SubLObject var77 = module0012.$silent_progressP$.currentBinding(var65);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var65);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var65), var65);
                    module0012.$g67$.bind((SubLObject)module0763.ONE_INTEGER, var65);
                    module0012.$g68$.bind((SubLObject)module0763.ZERO_INTEGER, var65);
                    module0012.$g66$.bind((SubLObject)module0763.ZERO_INTEGER, var65);
                    module0012.$g69$.bind((SubLObject)module0763.ZERO_INTEGER, var65);
                    module0012.$g70$.bind((SubLObject)module0763.T, var65);
                    module0012.$silent_progressP$.bind((SubLObject)((module0763.NIL != var73) ? module0012.$silent_progressP$.getDynamicValue(var65) : module0763.T), var65);
                    module0012.f474(var73);
                    final SubLObject var78 = module0158.f10039(var64);
                    SubLObject var79 = (SubLObject)module0763.NIL;
                    final SubLObject var80 = (SubLObject)module0763.NIL;
                    while (module0763.NIL == var79) {
                        final SubLObject var81 = module0052.f3695(var78, var80);
                        final SubLObject var82 = (SubLObject)SubLObjectFactory.makeBoolean(!var80.eql(var81));
                        if (module0763.NIL != var82) {
                            module0012.f476();
                            SubLObject var83 = (SubLObject)module0763.NIL;
                            try {
                                var83 = module0158.f10316(var81, (SubLObject)module0763.$ic32$, (SubLObject)module0763.NIL, (SubLObject)module0763.NIL);
                                SubLObject var133_138 = (SubLObject)module0763.NIL;
                                final SubLObject var134_139 = (SubLObject)module0763.NIL;
                                while (module0763.NIL == var133_138) {
                                    final SubLObject var84 = module0052.f3695(var83, var134_139);
                                    final SubLObject var136_141 = (SubLObject)SubLObjectFactory.makeBoolean(!var134_139.eql(var84));
                                    if (module0763.NIL != var136_141) {
                                        final SubLObject var85 = (SubLObject)module0763.$ic33$;
                                        f48238(var84, var85);
                                        var68 = Numbers.add(var68, (SubLObject)module0763.ONE_INTEGER);
                                        module0012.note_percent_progress(var68, var67);
                                    }
                                    var133_138 = (SubLObject)SubLObjectFactory.makeBoolean(module0763.NIL == var136_141);
                                }
                            }
                            finally {
                                final SubLObject var3_126 = Threads.$is_thread_performing_cleanupP$.currentBinding(var65);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0763.T, var65);
                                    if (module0763.NIL != var83) {
                                        module0158.f10319(var83);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var3_126, var65);
                                }
                            }
                        }
                        var79 = (SubLObject)SubLObjectFactory.makeBoolean(module0763.NIL == var82);
                    }
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var77, var65);
                    module0012.$g70$.rebind(var76, var65);
                    module0012.$g69$.rebind(var75, var65);
                    module0012.$g66$.rebind(var74, var65);
                    module0012.$g68$.rebind(var38_128, var65);
                    module0012.$g67$.rebind(var37_127, var65);
                    module0012.$g65$.rebind(var22_126, var65);
                    module0012.$g73$.rebind(var3_125, var65);
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var72, var65);
            module0012.$g77$.rebind(var71, var65);
            module0012.$g76$.rebind(var70, var65);
            module0012.$g75$.rebind(var69, var65);
        }
        return (SubLObject)module0763.$ic5$;
    }
    
    public static SubLObject f48239(final SubLObject var144, final SubLObject var145, SubLObject var146, SubLObject var142, SubLObject var147) {
        if (var146 == module0763.UNPROVIDED) {
            var146 = (SubLObject)module0763.T;
        }
        if (var142 == module0763.UNPROVIDED) {
            var142 = (SubLObject)module0763.$ic34$;
        }
        if (var147 == module0763.UNPROVIDED) {
            var147 = (SubLObject)module0763.T;
        }
        if (module0763.NIL != module0035.f1997(module0178.f11299(var145))) {
            if (module0763.NIL != module0271.f17899(var145)) {
                module0271.f17920(var145);
            }
            if (module0763.NIL == module0271.f17899(var145)) {
                final SubLObject var148 = module0178.f11334(var145);
                module0732.f45092(var148, (SubLObject)module0763.T, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
                module0732.f45092(var148, (SubLObject)module0763.NIL, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
                if (module0763.NIL != var146) {
                    module0762.f48216();
                }
                if (module0763.NIL != var147) {
                    module0770.f49102((SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
                }
                f48238(var145, var142);
            }
        }
        return (SubLObject)module0763.NIL;
    }
    
    public static SubLObject f48238(final SubLObject var145, final SubLObject var142) {
        final SubLThread var146 = SubLProcess.currentSubLThread();
        if (module0178.f11292(var145) != module0763.$ic36$) {
            return (SubLObject)module0763.NIL;
        }
        final SubLObject var147 = module0580.$g4363$.currentBinding(var146);
        final SubLObject var148 = module0580.$g4366$.currentBinding(var146);
        final SubLObject var149 = module0580.$g4365$.currentBinding(var146);
        try {
            module0580.$g4363$.bind(module0054.f3968(), var146);
            module0580.$g4366$.bind((SubLObject)module0763.ZERO_INTEGER, var146);
            module0580.$g4365$.bind((SubLObject)module0763.T, var146);
            final SubLObject var150 = f48240(var145, var142);
            SubLObject var151 = (SubLObject)module0763.NIL;
            final SubLObject var3_151 = Errors.$continue_cerrorP$.currentBinding(var146);
            final SubLObject var22_152 = module0578.$g4234$.currentBinding(var146);
            try {
                Errors.$continue_cerrorP$.bind((SubLObject)module0763.NIL, var146);
                module0578.$g4234$.bind((SubLObject)module0763.T, var146);
                if (module0763.NIL != module0578.f35473()) {
                    if (module0763.NIL != var150) {
                        final SubLObject var152 = module0178.f11334(var145);
                        final SubLObject var153 = f48241(var152, (SubLObject)module0763.NIL);
                        final SubLObject var154 = f48242(var150, var153);
                        if (module0763.NIL != var154) {
                            module0749.f46344(var152, var154);
                        }
                    }
                    else {
                        final SubLObject var155 = Sequences.cconcatenate((SubLObject)module0763.$ic0$, new SubLObject[] { module0006.f205((SubLObject)module0763.TWO_INTEGER), module0763.$ic1$, module0006.f203((SubLObject)module0763.$ic37$) });
                        module0578.f35476(var155, (SubLObject)ConsesLow.list(var145));
                    }
                }
                else {
                    try {
                        var146.throwStack.push(module0003.$g3$.getGlobalValue());
                        final SubLObject var3_152 = Errors.$error_handler$.currentBinding(var146);
                        try {
                            Errors.$error_handler$.bind((SubLObject)module0763.$ic38$, var146);
                            try {
                                if (module0763.NIL != var150) {
                                    final SubLObject var156 = module0178.f11334(var145);
                                    final SubLObject var157 = f48241(var156, (SubLObject)module0763.NIL);
                                    final SubLObject var158 = f48242(var150, var157);
                                    if (module0763.NIL != var158) {
                                        module0749.f46344(var156, var158);
                                    }
                                }
                                else {
                                    final SubLObject var159 = Sequences.cconcatenate((SubLObject)module0763.$ic0$, new SubLObject[] { module0006.f205((SubLObject)module0763.TWO_INTEGER), module0763.$ic1$, module0006.f203((SubLObject)module0763.$ic37$) });
                                    module0578.f35476(var159, (SubLObject)ConsesLow.list(var145));
                                }
                            }
                            catch (Throwable var160) {
                                Errors.handleThrowable(var160, (SubLObject)module0763.NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(var3_152, var146);
                        }
                    }
                    catch (Throwable var161) {
                        var151 = Errors.handleThrowable(var161, module0003.$g3$.getGlobalValue());
                    }
                    finally {
                        var146.throwStack.pop();
                    }
                    if (var151.isString() && module0763.NIL == module0578.f35477()) {
                        Errors.warn(Sequences.cconcatenate(module0752.f47234(var151), (SubLObject)module0763.$ic39$), module0579.f35508());
                    }
                }
            }
            finally {
                module0578.$g4234$.rebind(var22_152, var146);
                Errors.$continue_cerrorP$.rebind(var3_151, var146);
            }
        }
        finally {
            module0580.$g4365$.rebind(var149, var146);
            module0580.$g4366$.rebind(var148, var146);
            module0580.$g4363$.rebind(var147, var146);
        }
        return (SubLObject)module0763.NIL;
    }
    
    public static SubLObject f48241(final SubLObject var148, SubLObject var158) {
        if (var158 == module0763.UNPROVIDED) {
            var158 = (SubLObject)module0763.T;
        }
        SubLObject var159 = module0749.f46343(var148, var158);
        if (module0763.NIL != module0337.f22630(var148, (SubLObject)module0763.$ic40$)) {
            var159 = f48242(f48243(var148), var159);
        }
        return var159;
    }
    
    public static SubLObject f48244() {
        final SubLObject var160 = module0763.$g6108$.getGlobalValue();
        if (module0763.NIL != var160) {
            module0034.f1818(var160);
        }
        return (SubLObject)module0763.NIL;
    }
    
    public static SubLObject f48245(final SubLObject var148) {
        return module0034.f1829(module0763.$g6108$.getGlobalValue(), (SubLObject)ConsesLow.list(var148), (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
    }
    
    public static SubLObject f48246(final SubLObject var148) {
        final SubLThread var149 = SubLProcess.currentSubLThread();
        SubLObject var150 = (SubLObject)module0763.NIL;
        var149.resetMultipleValues();
        final SubLObject var151 = module0337.f22630(var148, (SubLObject)module0763.$ic42$);
        final SubLObject var152 = var149.secondMultipleValue();
        var149.resetMultipleValues();
        if (module0763.NIL != var151) {
            final SubLObject var153 = module0035.f2294(var152, (SubLObject)module0763.$ic43$, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
            final SubLObject var154 = module0035.f2294(var152, (SubLObject)module0763.$ic44$, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
            SubLObject var155 = module0202.f12702(var153);
            SubLObject var156 = (SubLObject)module0763.NIL;
            SubLObject var157 = (SubLObject)module0763.NIL;
            SubLObject var158 = (SubLObject)module0763.NIL;
            var156 = var154;
            var157 = var156.first();
            for (var158 = (SubLObject)module0763.ZERO_INTEGER; module0763.NIL != var156; var156 = var156.rest(), var157 = var156.first(), var158 = Numbers.add((SubLObject)module0763.ONE_INTEGER, var158)) {
                final SubLObject var159 = module0303.f20123(module0048.f_1X(var158));
                var155 = module0205.f13253(var159, var157, var155, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
            }
            final SubLObject var160 = (SubLObject)ConsesLow.list(module0763.$ic45$, var155);
            final SubLObject var161 = module0579.$g4336$.currentBinding(var149);
            try {
                module0579.$g4336$.bind(var148, var149);
                final SubLObject var162 = f48247(Sequences.length(var154));
                SubLObject var163 = (SubLObject)module0763.NIL;
                final SubLObject var3_174 = module0580.$g4363$.currentBinding(var149);
                final SubLObject var164 = module0580.$g4366$.currentBinding(var149);
                final SubLObject var165 = module0580.$g4365$.currentBinding(var149);
                try {
                    module0580.$g4363$.bind(module0054.f3968(), var149);
                    module0580.$g4366$.bind((SubLObject)module0763.ZERO_INTEGER, var149);
                    module0580.$g4365$.bind((SubLObject)module0763.T, var149);
                    var163 = f48248(var160, module0751.f46691());
                }
                finally {
                    module0580.$g4365$.rebind(var165, var149);
                    module0580.$g4366$.rebind(var164, var149);
                    module0580.$g4363$.rebind(var3_174, var149);
                }
                if (module0763.NIL != var162) {
                    module0756.f47569(var163, var162);
                }
                var150 = module0749.f46362(var163, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
            }
            finally {
                module0579.$g4336$.rebind(var161, var149);
            }
        }
        return var150;
    }
    
    public static SubLObject f48243(final SubLObject var148) {
        SubLObject var149 = module0763.$g6108$.getGlobalValue();
        if (module0763.NIL == var149) {
            var149 = module0034.f1934((SubLObject)module0763.$ic41$, (SubLObject)module0763.$ic46$, (SubLObject)module0763.$ic47$, (SubLObject)module0763.EQUAL, (SubLObject)module0763.ONE_INTEGER, (SubLObject)module0763.ZERO_INTEGER);
        }
        SubLObject var150 = module0034.f1814(var149, var148, (SubLObject)module0763.$ic48$);
        if (var150 == module0763.$ic48$) {
            var150 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f48246(var148)));
            module0034.f1816(var149, var148, var150, (SubLObject)module0763.UNPROVIDED);
        }
        return module0034.f1959(var150);
    }
    
    public static SubLObject f48247(final SubLObject var177) {
        final SubLObject var178 = module0166.f10737((SubLObject)module0763.$ic49$);
        SubLObject var179 = (SubLObject)module0763.NIL;
        if (module0763.NIL != module0128.f8463(var178, (SubLObject)module0763.UNPROVIDED)) {
            var179 = module0751.f46628((SubLObject)module0763.$ic50$, (SubLObject)ConsesLow.listS(var178, var177, (SubLObject)module0763.$ic51$), module0763.$ic52$, (SubLObject)module0763.UNPROVIDED).first();
        }
        return var179;
    }
    
    public static SubLObject f48240(final SubLObject var145, SubLObject var142) {
        if (var142 == module0763.UNPROVIDED) {
            var142 = (SubLObject)module0763.$ic34$;
        }
        assert module0763.NIL != module0174.f11035(var145) : var145;
        final SubLObject var146 = f48249(var145, var142);
        if (module0763.NIL != var146) {
            final SubLObject var147 = f48250(var145);
            final SubLObject var148 = module0749.f46362(var146, var147, var145);
            return var148;
        }
        return (SubLObject)module0763.NIL;
    }
    
    public static SubLObject f48251(final SubLObject var148, SubLObject var180) {
        if (var180 == module0763.UNPROVIDED) {
            var180 = (SubLObject)module0763.NIL;
        }
        final SubLThread var181 = SubLProcess.currentSubLThread();
        final SubLObject var182 = module0579.$g4316$.getGlobalValue();
        SubLObject var183 = (SubLObject)module0763.NIL;
        try {
            var183 = Locks.seize_lock(var182);
            module0749.f46345(var148);
            final SubLObject var184 = module0147.$g2094$.currentBinding(var181);
            final SubLObject var185 = module0147.$g2095$.currentBinding(var181);
            try {
                module0147.$g2094$.bind((SubLObject)module0763.$ic7$, var181);
                module0147.$g2095$.bind(module0763.$ic8$, var181);
                final SubLObject var186 = module0763.$ic9$;
                final SubLObject var3_183 = module0137.$g1605$.currentBinding(var181);
                final SubLObject var22_184 = module0139.$g1636$.currentBinding(var181);
                try {
                    module0137.$g1605$.bind(module0137.f8955(module0763.$ic10$), var181);
                    module0139.$g1636$.bind(module0139.f9007(), var181);
                    SubLObject var26_185 = var186;
                    final SubLObject var187 = (SubLObject)module0763.$ic13$;
                    final SubLObject var188 = module0056.f4145(var187);
                    final SubLObject var3_184 = module0139.$g1635$.currentBinding(var181);
                    try {
                        module0139.$g1635$.bind(module0139.f9007(), var181);
                        final SubLObject var189 = (SubLObject)module0763.NIL;
                        final SubLObject var3_185 = module0141.$g1714$.currentBinding(var181);
                        final SubLObject var22_185 = module0141.$g1715$.currentBinding(var181);
                        try {
                            module0141.$g1714$.bind((module0763.NIL != var189) ? var189 : module0141.f9283(), var181);
                            module0141.$g1715$.bind((SubLObject)((module0763.NIL != var189) ? module0763.$ic14$ : module0141.$g1715$.getDynamicValue(var181)), var181);
                            if (module0763.NIL != var189 && module0763.NIL != module0136.f8864() && module0763.NIL == module0141.f9279(var189)) {
                                final SubLObject var190 = module0136.$g1591$.getDynamicValue(var181);
                                if (var190.eql((SubLObject)module0763.$ic15$)) {
                                    module0136.f8870((SubLObject)module0763.ONE_INTEGER, (SubLObject)module0763.$ic16$, var189, (SubLObject)module0763.$ic17$, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
                                }
                                else if (var190.eql((SubLObject)module0763.$ic18$)) {
                                    module0136.f8871((SubLObject)module0763.ONE_INTEGER, (SubLObject)module0763.$ic19$, (SubLObject)module0763.$ic16$, var189, (SubLObject)module0763.$ic17$, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
                                }
                                else if (var190.eql((SubLObject)module0763.$ic20$)) {
                                    Errors.warn((SubLObject)module0763.$ic16$, var189, (SubLObject)module0763.$ic17$);
                                }
                                else {
                                    Errors.warn((SubLObject)module0763.$ic21$, module0136.$g1591$.getDynamicValue(var181));
                                    Errors.cerror((SubLObject)module0763.$ic19$, (SubLObject)module0763.$ic16$, var189, (SubLObject)module0763.$ic17$);
                                }
                            }
                            final SubLObject var3_186 = module0141.$g1670$.currentBinding(var181);
                            final SubLObject var22_186 = module0141.$g1671$.currentBinding(var181);
                            final SubLObject var191 = module0141.$g1672$.currentBinding(var181);
                            final SubLObject var192 = module0141.$g1674$.currentBinding(var181);
                            final SubLObject var193 = module0137.$g1605$.currentBinding(var181);
                            try {
                                module0141.$g1670$.bind(module0244.f15771(module0137.f8955(module0763.$ic10$)), var181);
                                module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955(module0763.$ic10$))), var181);
                                module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955(module0763.$ic10$))), var181);
                                module0141.$g1674$.bind((SubLObject)module0763.NIL, var181);
                                module0137.$g1605$.bind(module0244.f15771(module0137.f8955(module0763.$ic10$)), var181);
                                if (module0763.NIL != module0136.f8865() || module0763.NIL != module0244.f15795(var186, module0137.f8955((SubLObject)module0763.UNPROVIDED))) {
                                    final SubLObject var3_187 = module0141.$g1677$.currentBinding(var181);
                                    final SubLObject var22_187 = module0138.$g1619$.currentBinding(var181);
                                    final SubLObject var37_193 = module0141.$g1674$.currentBinding(var181);
                                    try {
                                        module0141.$g1677$.bind(module0141.f9210(), var181);
                                        module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955(module0763.$ic10$))), var181);
                                        module0141.$g1674$.bind((SubLObject)module0763.NIL, var181);
                                        module0249.f16055(var26_185, (SubLObject)module0763.UNPROVIDED);
                                        while (module0763.NIL != var26_185) {
                                            final SubLObject var194 = var26_185;
                                            SubLObject var196;
                                            final SubLObject var195 = var196 = module0200.f12443(module0137.f8955(module0763.$ic10$));
                                            SubLObject var197 = (SubLObject)module0763.NIL;
                                            var197 = var196.first();
                                            while (module0763.NIL != var196) {
                                                final SubLObject var3_188 = module0137.$g1605$.currentBinding(var181);
                                                final SubLObject var22_188 = module0141.$g1674$.currentBinding(var181);
                                                try {
                                                    module0137.$g1605$.bind(var197, var181);
                                                    module0141.$g1674$.bind((SubLObject)((module0763.NIL != module0141.f9205((SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0763.NIL == module0141.$g1674$.getDynamicValue(var181)) : module0141.$g1674$.getDynamicValue(var181)), var181);
                                                    final SubLObject var198 = module0228.f15229(var194);
                                                    if (module0763.NIL != module0138.f8992(var198)) {
                                                        final SubLObject var199 = module0242.f15664(var198, module0137.f8955((SubLObject)module0763.UNPROVIDED));
                                                        if (module0763.NIL != var199) {
                                                            final SubLObject var200 = module0245.f15834(var199, module0244.f15780(module0137.f8955(module0763.$ic10$)), module0137.f8955((SubLObject)module0763.UNPROVIDED));
                                                            if (module0763.NIL != var200) {
                                                                SubLObject var201;
                                                                for (var201 = module0066.f4838(module0067.f4891(var200)); module0763.NIL == module0066.f4841(var201); var201 = module0066.f4840(var201)) {
                                                                    var181.resetMultipleValues();
                                                                    final SubLObject var202 = module0066.f4839(var201);
                                                                    final SubLObject var203 = var181.secondMultipleValue();
                                                                    var181.resetMultipleValues();
                                                                    if (module0763.NIL != module0147.f9507(var202)) {
                                                                        final SubLObject var3_189 = module0138.$g1623$.currentBinding(var181);
                                                                        try {
                                                                            module0138.$g1623$.bind(var202, var181);
                                                                            SubLObject var52_197;
                                                                            for (var52_197 = module0066.f4838(module0067.f4891(var203)); module0763.NIL == module0066.f4841(var52_197); var52_197 = module0066.f4840(var52_197)) {
                                                                                var181.resetMultipleValues();
                                                                                final SubLObject var204 = module0066.f4839(var52_197);
                                                                                final SubLObject var205 = var181.secondMultipleValue();
                                                                                var181.resetMultipleValues();
                                                                                if (module0763.NIL != module0141.f9289(var204)) {
                                                                                    final SubLObject var3_190 = module0138.$g1624$.currentBinding(var181);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var204, var181);
                                                                                        final SubLObject var206 = var205;
                                                                                        if (module0763.NIL != module0077.f5302(var206)) {
                                                                                            final SubLObject var207 = module0077.f5333(var206);
                                                                                            SubLObject var208;
                                                                                            SubLObject var209;
                                                                                            SubLObject var210;
                                                                                            for (var208 = module0032.f1741(var207), var209 = (SubLObject)module0763.NIL, var209 = module0032.f1742(var208, var207); module0763.NIL == module0032.f1744(var208, var209); var209 = module0032.f1743(var209)) {
                                                                                                var210 = module0032.f1745(var208, var209);
                                                                                                if (module0763.NIL != module0032.f1746(var209, var210) && module0763.NIL == module0249.f16059(var210, module0139.$g1636$.getDynamicValue(var181))) {
                                                                                                    module0249.f16055(var210, module0139.$g1636$.getDynamicValue(var181));
                                                                                                    if (module0763.NIL != module0173.f10955(var210)) {
                                                                                                        f48252(var148, var210, var180);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var206.isList()) {
                                                                                            SubLObject var211 = var206;
                                                                                            SubLObject var212 = (SubLObject)module0763.NIL;
                                                                                            var212 = var211.first();
                                                                                            while (module0763.NIL != var211) {
                                                                                                if (module0763.NIL == module0249.f16059(var212, module0139.$g1636$.getDynamicValue(var181))) {
                                                                                                    module0249.f16055(var212, module0139.$g1636$.getDynamicValue(var181));
                                                                                                    if (module0763.NIL != module0173.f10955(var212)) {
                                                                                                        f48252(var148, var212, var180);
                                                                                                    }
                                                                                                }
                                                                                                var211 = var211.rest();
                                                                                                var212 = var211.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)module0763.$ic22$, var206);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var3_190, var181);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var52_197);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var3_189, var181);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var201);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)module0763.FIVE_INTEGER, (SubLObject)module0763.$ic23$, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
                                                        }
                                                        if (module0763.NIL != module0200.f12419(var198, module0137.f8955((SubLObject)module0763.UNPROVIDED))) {
                                                            SubLObject var213 = module0248.f15995(var198);
                                                            SubLObject var214 = (SubLObject)module0763.NIL;
                                                            var214 = var213.first();
                                                            while (module0763.NIL != var213) {
                                                                SubLObject var216;
                                                                final SubLObject var215 = var216 = var214;
                                                                SubLObject var217 = (SubLObject)module0763.NIL;
                                                                SubLObject var218 = (SubLObject)module0763.NIL;
                                                                SubLObject var219 = (SubLObject)module0763.NIL;
                                                                cdestructuring_bind.destructuring_bind_must_consp(var216, var215, (SubLObject)module0763.$ic24$);
                                                                var217 = var216.first();
                                                                var216 = var216.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(var216, var215, (SubLObject)module0763.$ic24$);
                                                                var218 = var216.first();
                                                                var216 = var216.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(var216, var215, (SubLObject)module0763.$ic24$);
                                                                var219 = var216.first();
                                                                var216 = var216.rest();
                                                                if (module0763.NIL == var216) {
                                                                    if (module0763.NIL != module0147.f9507(var218)) {
                                                                        final SubLObject var3_191 = module0138.$g1623$.currentBinding(var181);
                                                                        try {
                                                                            module0138.$g1623$.bind(var218, var181);
                                                                            if (module0763.NIL != module0141.f9289(var219)) {
                                                                                final SubLObject var3_192 = module0138.$g1624$.currentBinding(var181);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var219, var181);
                                                                                    final SubLObject var206;
                                                                                    final SubLObject var220 = var206 = (SubLObject)ConsesLow.list(var217);
                                                                                    if (module0763.NIL != module0077.f5302(var206)) {
                                                                                        final SubLObject var207 = module0077.f5333(var206);
                                                                                        SubLObject var208;
                                                                                        SubLObject var209;
                                                                                        SubLObject var210;
                                                                                        for (var208 = module0032.f1741(var207), var209 = (SubLObject)module0763.NIL, var209 = module0032.f1742(var208, var207); module0763.NIL == module0032.f1744(var208, var209); var209 = module0032.f1743(var209)) {
                                                                                            var210 = module0032.f1745(var208, var209);
                                                                                            if (module0763.NIL != module0032.f1746(var209, var210) && module0763.NIL == module0249.f16059(var210, module0139.$g1636$.getDynamicValue(var181))) {
                                                                                                module0249.f16055(var210, module0139.$g1636$.getDynamicValue(var181));
                                                                                                if (module0763.NIL != module0173.f10955(var210)) {
                                                                                                    f48252(var148, var210, var180);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var206.isList()) {
                                                                                        SubLObject var65_203 = var206;
                                                                                        SubLObject var212 = (SubLObject)module0763.NIL;
                                                                                        var212 = var65_203.first();
                                                                                        while (module0763.NIL != var65_203) {
                                                                                            if (module0763.NIL == module0249.f16059(var212, module0139.$g1636$.getDynamicValue(var181))) {
                                                                                                module0249.f16055(var212, module0139.$g1636$.getDynamicValue(var181));
                                                                                                if (module0763.NIL != module0173.f10955(var212)) {
                                                                                                    f48252(var148, var212, var180);
                                                                                                }
                                                                                            }
                                                                                            var65_203 = var65_203.rest();
                                                                                            var212 = var65_203.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0763.$ic22$, var206);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var3_192, var181);
                                                                                }
                                                                            }
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var3_191, var181);
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    cdestructuring_bind.cdestructuring_bind_error(var215, (SubLObject)module0763.$ic24$);
                                                                }
                                                                var213 = var213.rest();
                                                                var214 = var213.first();
                                                            }
                                                        }
                                                    }
                                                    else if (module0763.NIL != module0155.f9785(var198, (SubLObject)module0763.UNPROVIDED)) {
                                                        SubLObject var45_204;
                                                        final SubLObject var221 = var45_204 = ((module0763.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955(module0763.$ic10$)), module0141.$g1714$.getDynamicValue(var181), module0137.f8955((SubLObject)module0763.UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955(module0763.$ic10$)), module0141.$g1714$.getDynamicValue(var181), module0137.f8955((SubLObject)module0763.UNPROVIDED)));
                                                        SubLObject var222 = (SubLObject)module0763.NIL;
                                                        var222 = var45_204.first();
                                                        while (module0763.NIL != var45_204) {
                                                            final SubLObject var3_193 = module0138.$g1625$.currentBinding(var181);
                                                            try {
                                                                module0138.$g1625$.bind(var222, var181);
                                                                final SubLObject var224;
                                                                final SubLObject var223 = var224 = Functions.funcall(var222, var198);
                                                                if (module0763.NIL != module0077.f5302(var224)) {
                                                                    final SubLObject var225 = module0077.f5333(var224);
                                                                    SubLObject var226;
                                                                    SubLObject var227;
                                                                    SubLObject var228;
                                                                    for (var226 = module0032.f1741(var225), var227 = (SubLObject)module0763.NIL, var227 = module0032.f1742(var226, var225); module0763.NIL == module0032.f1744(var226, var227); var227 = module0032.f1743(var227)) {
                                                                        var228 = module0032.f1745(var226, var227);
                                                                        if (module0763.NIL != module0032.f1746(var227, var228) && module0763.NIL == module0249.f16059(var228, module0139.$g1636$.getDynamicValue(var181))) {
                                                                            module0249.f16055(var228, module0139.$g1636$.getDynamicValue(var181));
                                                                            if (module0763.NIL != module0173.f10955(var228)) {
                                                                                f48252(var148, var228, var180);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                else if (var224.isList()) {
                                                                    SubLObject var229 = var224;
                                                                    SubLObject var230 = (SubLObject)module0763.NIL;
                                                                    var230 = var229.first();
                                                                    while (module0763.NIL != var229) {
                                                                        if (module0763.NIL == module0249.f16059(var230, module0139.$g1636$.getDynamicValue(var181))) {
                                                                            module0249.f16055(var230, module0139.$g1636$.getDynamicValue(var181));
                                                                            if (module0763.NIL != module0173.f10955(var230)) {
                                                                                f48252(var148, var230, var180);
                                                                            }
                                                                        }
                                                                        var229 = var229.rest();
                                                                        var230 = var229.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)module0763.$ic22$, var224);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var3_193, var181);
                                                            }
                                                            var45_204 = var45_204.rest();
                                                            var222 = var45_204.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var22_188, var181);
                                                    module0137.$g1605$.rebind(var3_188, var181);
                                                }
                                                var196 = var196.rest();
                                                var197 = var196.first();
                                            }
                                            SubLObject var232;
                                            final SubLObject var231 = var232 = module0200.f12443(module0244.f15771(module0137.f8955(module0763.$ic10$)));
                                            SubLObject var233 = (SubLObject)module0763.NIL;
                                            var233 = var232.first();
                                            while (module0763.NIL != var232) {
                                                final SubLObject var3_194 = module0137.$g1605$.currentBinding(var181);
                                                final SubLObject var22_189 = module0141.$g1674$.currentBinding(var181);
                                                try {
                                                    module0137.$g1605$.bind(var233, var181);
                                                    module0141.$g1674$.bind((SubLObject)((module0763.NIL != module0141.f9205((SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0763.NIL == module0141.$g1674$.getDynamicValue(var181)) : module0141.$g1674$.getDynamicValue(var181)), var181);
                                                    final SubLObject var234 = module0228.f15229(var26_185);
                                                    if (module0763.NIL != module0138.f8992(var234)) {
                                                        final SubLObject var235 = module0242.f15664(var234, module0137.f8955((SubLObject)module0763.UNPROVIDED));
                                                        if (module0763.NIL != var235) {
                                                            final SubLObject var236 = module0245.f15834(var235, module0138.f8979(), module0137.f8955((SubLObject)module0763.UNPROVIDED));
                                                            if (module0763.NIL != var236) {
                                                                SubLObject var237;
                                                                for (var237 = module0066.f4838(module0067.f4891(var236)); module0763.NIL == module0066.f4841(var237); var237 = module0066.f4840(var237)) {
                                                                    var181.resetMultipleValues();
                                                                    final SubLObject var238 = module0066.f4839(var237);
                                                                    final SubLObject var239 = var181.secondMultipleValue();
                                                                    var181.resetMultipleValues();
                                                                    if (module0763.NIL != module0147.f9507(var238)) {
                                                                        final SubLObject var3_195 = module0138.$g1623$.currentBinding(var181);
                                                                        try {
                                                                            module0138.$g1623$.bind(var238, var181);
                                                                            SubLObject var52_198;
                                                                            for (var52_198 = module0066.f4838(module0067.f4891(var239)); module0763.NIL == module0066.f4841(var52_198); var52_198 = module0066.f4840(var52_198)) {
                                                                                var181.resetMultipleValues();
                                                                                final SubLObject var240 = module0066.f4839(var52_198);
                                                                                final SubLObject var241 = var181.secondMultipleValue();
                                                                                var181.resetMultipleValues();
                                                                                if (module0763.NIL != module0141.f9289(var240)) {
                                                                                    final SubLObject var3_196 = module0138.$g1624$.currentBinding(var181);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var240, var181);
                                                                                        final SubLObject var242 = var241;
                                                                                        if (module0763.NIL != module0077.f5302(var242)) {
                                                                                            final SubLObject var243 = module0077.f5333(var242);
                                                                                            SubLObject var244;
                                                                                            SubLObject var245;
                                                                                            SubLObject var246;
                                                                                            for (var244 = module0032.f1741(var243), var245 = (SubLObject)module0763.NIL, var245 = module0032.f1742(var244, var243); module0763.NIL == module0032.f1744(var244, var245); var245 = module0032.f1743(var245)) {
                                                                                                var246 = module0032.f1745(var244, var245);
                                                                                                if (module0763.NIL != module0032.f1746(var245, var246) && module0763.NIL == module0249.f16059(var246, (SubLObject)module0763.UNPROVIDED)) {
                                                                                                    module0249.f16055(var246, (SubLObject)module0763.UNPROVIDED);
                                                                                                    module0056.f4149(var246, var188);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var242.isList()) {
                                                                                            SubLObject var247 = var242;
                                                                                            SubLObject var248 = (SubLObject)module0763.NIL;
                                                                                            var248 = var247.first();
                                                                                            while (module0763.NIL != var247) {
                                                                                                if (module0763.NIL == module0249.f16059(var248, (SubLObject)module0763.UNPROVIDED)) {
                                                                                                    module0249.f16055(var248, (SubLObject)module0763.UNPROVIDED);
                                                                                                    module0056.f4149(var248, var188);
                                                                                                }
                                                                                                var247 = var247.rest();
                                                                                                var248 = var247.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)module0763.$ic22$, var242);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var3_196, var181);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var52_198);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var3_195, var181);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var237);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)module0763.FIVE_INTEGER, (SubLObject)module0763.$ic23$, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (module0763.NIL != module0155.f9785(var234, (SubLObject)module0763.UNPROVIDED)) {
                                                        SubLObject var45_205;
                                                        final SubLObject var249 = var45_205 = ((module0763.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var181), module0137.f8955((SubLObject)module0763.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var181), module0137.f8955((SubLObject)module0763.UNPROVIDED)));
                                                        SubLObject var250 = (SubLObject)module0763.NIL;
                                                        var250 = var45_205.first();
                                                        while (module0763.NIL != var45_205) {
                                                            final SubLObject var3_197 = module0138.$g1625$.currentBinding(var181);
                                                            try {
                                                                module0138.$g1625$.bind(var250, var181);
                                                                final SubLObject var252;
                                                                final SubLObject var251 = var252 = Functions.funcall(var250, var234);
                                                                if (module0763.NIL != module0077.f5302(var252)) {
                                                                    final SubLObject var253 = module0077.f5333(var252);
                                                                    SubLObject var254;
                                                                    SubLObject var255;
                                                                    SubLObject var256;
                                                                    for (var254 = module0032.f1741(var253), var255 = (SubLObject)module0763.NIL, var255 = module0032.f1742(var254, var253); module0763.NIL == module0032.f1744(var254, var255); var255 = module0032.f1743(var255)) {
                                                                        var256 = module0032.f1745(var254, var255);
                                                                        if (module0763.NIL != module0032.f1746(var255, var256) && module0763.NIL == module0249.f16059(var256, (SubLObject)module0763.UNPROVIDED)) {
                                                                            module0249.f16055(var256, (SubLObject)module0763.UNPROVIDED);
                                                                            module0056.f4149(var256, var188);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var252.isList()) {
                                                                    SubLObject var257 = var252;
                                                                    SubLObject var258 = (SubLObject)module0763.NIL;
                                                                    var258 = var257.first();
                                                                    while (module0763.NIL != var257) {
                                                                        if (module0763.NIL == module0249.f16059(var258, (SubLObject)module0763.UNPROVIDED)) {
                                                                            module0249.f16055(var258, (SubLObject)module0763.UNPROVIDED);
                                                                            module0056.f4149(var258, var188);
                                                                        }
                                                                        var257 = var257.rest();
                                                                        var258 = var257.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)module0763.$ic22$, var252);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var3_197, var181);
                                                            }
                                                            var45_205 = var45_205.rest();
                                                            var250 = var45_205.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var22_189, var181);
                                                    module0137.$g1605$.rebind(var3_194, var181);
                                                }
                                                var232 = var232.rest();
                                                var233 = var232.first();
                                            }
                                            var26_185 = module0056.f4150(var188);
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var37_193, var181);
                                        module0138.$g1619$.rebind(var22_187, var181);
                                        module0141.$g1677$.rebind(var3_187, var181);
                                    }
                                }
                                else {
                                    module0136.f8872((SubLObject)module0763.TWO_INTEGER, (SubLObject)module0763.$ic25$, var186, module0244.f15748(module0137.f8955((SubLObject)module0763.UNPROVIDED)), (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
                                }
                            }
                            finally {
                                module0137.$g1605$.rebind(var193, var181);
                                module0141.$g1674$.rebind(var192, var181);
                                module0141.$g1672$.rebind(var191, var181);
                                module0141.$g1671$.rebind(var22_186, var181);
                                module0141.$g1670$.rebind(var3_186, var181);
                            }
                        }
                        finally {
                            module0141.$g1715$.rebind(var22_185, var181);
                            module0141.$g1714$.rebind(var3_185, var181);
                        }
                        module0139.f9011(module0139.$g1635$.getDynamicValue(var181));
                    }
                    finally {
                        module0139.$g1635$.rebind(var3_184, var181);
                    }
                    module0139.f9011(module0139.$g1636$.getDynamicValue(var181));
                }
                finally {
                    module0139.$g1636$.rebind(var22_184, var181);
                    module0137.$g1605$.rebind(var3_183, var181);
                }
            }
            finally {
                module0147.$g2095$.rebind(var185, var181);
                module0147.$g2094$.rebind(var184, var181);
            }
        }
        finally {
            if (module0763.NIL != var183) {
                Locks.release_lock(var182);
            }
        }
        return (SubLObject)module0763.$ic54$;
    }
    
    public static SubLObject f48253(final SubLObject var213) {
        final SubLThread var214 = SubLProcess.currentSubLThread();
        SubLObject var215 = (SubLObject)module0763.NIL;
        final SubLObject var216 = module0147.$g2094$.currentBinding(var214);
        final SubLObject var217 = module0147.$g2095$.currentBinding(var214);
        try {
            module0147.$g2094$.bind((SubLObject)module0763.$ic7$, var214);
            module0147.$g2095$.bind(module0763.$ic8$, var214);
            if (module0763.NIL != module0158.f10274(var213, (SubLObject)module0763.$ic32$)) {
                final SubLObject var218 = module0158.f10275(var213);
                SubLObject var219 = (SubLObject)module0763.NIL;
                try {
                    var219 = module0158.f10316(var218, (SubLObject)module0763.$ic32$, (SubLObject)module0763.NIL, (SubLObject)module0763.NIL);
                    SubLObject var220 = (SubLObject)module0763.NIL;
                    final SubLObject var221 = (SubLObject)module0763.NIL;
                    while (module0763.NIL == var220) {
                        final SubLObject var222 = module0052.f3695(var219, var221);
                        final SubLObject var223 = (SubLObject)SubLObjectFactory.makeBoolean(!var221.eql(var222));
                        if (module0763.NIL != var223 && module0763.NIL != module0158.f10280(var222)) {
                            final SubLObject var224 = module0178.f11334(var222);
                            if (module0763.NIL != module0226.f14792(var224)) {
                                f48251(var224, (SubLObject)module0763.UNPROVIDED);
                                var215 = (SubLObject)ConsesLow.cons(var224, var215);
                            }
                        }
                        var220 = (SubLObject)SubLObjectFactory.makeBoolean(module0763.NIL == var223);
                    }
                }
                finally {
                    final SubLObject var3_216 = Threads.$is_thread_performing_cleanupP$.currentBinding(var214);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0763.T, var214);
                        if (module0763.NIL != var219) {
                            module0158.f10319(var219);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var3_216, var214);
                    }
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var217, var214);
            module0147.$g2094$.rebind(var216, var214);
        }
        return var215;
    }
    
    public static SubLObject f48252(final SubLObject var148, final SubLObject var64, final SubLObject var180) {
        if (module0763.NIL != module0158.f10010(var148, (SubLObject)module0763.ONE_INTEGER, var64)) {
            final SubLObject var181 = module0158.f10011(var148, (SubLObject)module0763.ONE_INTEGER, var64);
            SubLObject var182 = (SubLObject)module0763.NIL;
            final SubLObject var183 = (SubLObject)module0763.NIL;
            while (module0763.NIL == var182) {
                final SubLObject var184 = module0052.f3695(var181, var183);
                final SubLObject var185 = (SubLObject)SubLObjectFactory.makeBoolean(!var183.eql(var184));
                if (module0763.NIL != var185) {
                    SubLObject var186 = (SubLObject)module0763.NIL;
                    try {
                        var186 = module0158.f10316(var184, (SubLObject)module0763.$ic32$, (SubLObject)module0763.NIL, (SubLObject)module0763.NIL);
                        SubLObject var133_219 = (SubLObject)module0763.NIL;
                        final SubLObject var134_220 = (SubLObject)module0763.NIL;
                        while (module0763.NIL == var133_219) {
                            final SubLObject var187 = module0052.f3695(var186, var134_220);
                            final SubLObject var136_221 = (SubLObject)SubLObjectFactory.makeBoolean(!var134_220.eql(var187));
                            if (module0763.NIL != var136_221 && module0763.NIL == module0004.f104(var187, var180, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED)) {
                                f48238(var187, (SubLObject)module0763.$ic33$);
                            }
                            var133_219 = (SubLObject)SubLObjectFactory.makeBoolean(module0763.NIL == var136_221);
                        }
                    }
                    finally {
                        final SubLObject var188 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0763.T);
                            if (module0763.NIL != var186) {
                                module0158.f10319(var186);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var188);
                        }
                    }
                }
                var182 = (SubLObject)SubLObjectFactory.makeBoolean(module0763.NIL == var185);
            }
        }
        return var148;
    }
    
    public static SubLObject f48254(final SubLObject var144, final SubLObject var145, SubLObject var146) {
        if (var146 == module0763.UNPROVIDED) {
            var146 = (SubLObject)module0763.T;
        }
        if (module0763.NIL == module0226.f15088(var145, (SubLObject)module0763.$ic36$) && module0763.NIL != module0749.f46339()) {
            if (module0763.NIL != var146) {
                module0762.f48216();
            }
            module0770.f49102((SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
            final SubLObject var147 = module0178.f11334(var145);
            module0732.f45092(var147, (SubLObject)module0763.T, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
            module0732.f45092(var147, (SubLObject)module0763.NIL, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
            f48251(var147, (SubLObject)ConsesLow.list(var145));
        }
        return (SubLObject)module0763.NIL;
    }
    
    public static SubLObject f48249(final SubLObject var140, SubLObject var142) {
        if (var142 == module0763.UNPROVIDED) {
            var142 = (SubLObject)module0763.$ic34$;
        }
        final SubLThread var143 = SubLProcess.currentSubLThread();
        SubLObject var144 = (SubLObject)module0763.NIL;
        SubLObject var145 = (SubLObject)module0763.NIL;
        final SubLObject var146 = Errors.$continue_cerrorP$.currentBinding(var143);
        final SubLObject var147 = module0578.$g4234$.currentBinding(var143);
        try {
            Errors.$continue_cerrorP$.bind((SubLObject)module0763.NIL, var143);
            module0578.$g4234$.bind((SubLObject)module0763.T, var143);
            if (module0763.NIL != module0578.f35473()) {
                if (module0763.NIL == module0178.f11284(var140)) {
                    final SubLObject var148 = Sequences.cconcatenate((SubLObject)module0763.$ic0$, new SubLObject[] { module0006.f205((SubLObject)module0763.ONE_INTEGER), module0763.$ic1$, module0006.f203((SubLObject)module0763.$ic56$) });
                    module0578.f35476(var148, (SubLObject)ConsesLow.list(var140));
                }
                else if (module0763.NIL != f48255(var140, var142)) {
                    final SubLObject var148 = Sequences.cconcatenate((SubLObject)module0763.$ic0$, new SubLObject[] { module0006.f205((SubLObject)module0763.ONE_INTEGER), module0763.$ic1$, module0006.f203((SubLObject)module0763.$ic57$) });
                    module0578.f35476(var148, (SubLObject)ConsesLow.list(var140));
                }
                else {
                    final SubLObject var149 = f48256(var140);
                    final SubLObject var150 = module0751.f46691();
                    final SubLObject var3_223 = module0579.$g4336$.currentBinding(var143);
                    try {
                        module0579.$g4336$.bind(module0178.f11334(var140), var143);
                        if (module0763.NIL != var149) {
                            final SubLObject var151 = module0147.f9540(module0579.$g4260$.getDynamicValue(var143));
                            final SubLObject var3_224 = module0147.$g2095$.currentBinding(var143);
                            final SubLObject var22_226 = module0147.$g2094$.currentBinding(var143);
                            final SubLObject var152 = module0147.$g2096$.currentBinding(var143);
                            try {
                                module0147.$g2095$.bind(module0147.f9545(var151), var143);
                                module0147.$g2094$.bind(module0147.f9546(var151), var143);
                                module0147.$g2096$.bind(module0147.f9549(var151), var143);
                                var144 = f48248(var149, var150);
                                if (module0763.NIL != module0756.f47497(var144, (SubLObject)module0763.UNPROVIDED)) {
                                    module0756.f47569(var144, var140);
                                    if (module0763.NIL != module0756.f47476(module0756.f47487(var144, (SubLObject)module0763.UNPROVIDED))) {
                                        module0756.f47465(var144, f48257(var140));
                                    }
                                }
                            }
                            finally {
                                module0147.$g2096$.rebind(var152, var143);
                                module0147.$g2094$.rebind(var22_226, var143);
                                module0147.$g2095$.rebind(var3_224, var143);
                            }
                        }
                    }
                    finally {
                        module0579.$g4336$.rebind(var3_223, var143);
                    }
                }
            }
            else {
                try {
                    var143.throwStack.push(module0003.$g3$.getGlobalValue());
                    final SubLObject var3_225 = Errors.$error_handler$.currentBinding(var143);
                    try {
                        Errors.$error_handler$.bind((SubLObject)module0763.$ic38$, var143);
                        try {
                            if (module0763.NIL == module0178.f11284(var140)) {
                                final SubLObject var153 = Sequences.cconcatenate((SubLObject)module0763.$ic0$, new SubLObject[] { module0006.f205((SubLObject)module0763.ONE_INTEGER), module0763.$ic1$, module0006.f203((SubLObject)module0763.$ic56$) });
                                module0578.f35476(var153, (SubLObject)ConsesLow.list(var140));
                            }
                            else if (module0763.NIL != f48255(var140, var142)) {
                                final SubLObject var153 = Sequences.cconcatenate((SubLObject)module0763.$ic0$, new SubLObject[] { module0006.f205((SubLObject)module0763.ONE_INTEGER), module0763.$ic1$, module0006.f203((SubLObject)module0763.$ic57$) });
                                module0578.f35476(var153, (SubLObject)ConsesLow.list(var140));
                            }
                            else {
                                final SubLObject var154 = f48256(var140);
                                final SubLObject var155 = module0751.f46691();
                                final SubLObject var3_226 = module0579.$g4336$.currentBinding(var143);
                                try {
                                    module0579.$g4336$.bind(module0178.f11334(var140), var143);
                                    if (module0763.NIL != var154) {
                                        final SubLObject var156 = module0147.f9540(module0579.$g4260$.getDynamicValue(var143));
                                        final SubLObject var3_227 = module0147.$g2095$.currentBinding(var143);
                                        final SubLObject var22_227 = module0147.$g2094$.currentBinding(var143);
                                        final SubLObject var157 = module0147.$g2096$.currentBinding(var143);
                                        try {
                                            module0147.$g2095$.bind(module0147.f9545(var156), var143);
                                            module0147.$g2094$.bind(module0147.f9546(var156), var143);
                                            module0147.$g2096$.bind(module0147.f9549(var156), var143);
                                            var144 = f48248(var154, var155);
                                            if (module0763.NIL != module0756.f47497(var144, (SubLObject)module0763.UNPROVIDED)) {
                                                module0756.f47569(var144, var140);
                                                if (module0763.NIL != module0756.f47476(module0756.f47487(var144, (SubLObject)module0763.UNPROVIDED))) {
                                                    module0756.f47465(var144, f48257(var140));
                                                }
                                            }
                                        }
                                        finally {
                                            module0147.$g2096$.rebind(var157, var143);
                                            module0147.$g2094$.rebind(var22_227, var143);
                                            module0147.$g2095$.rebind(var3_227, var143);
                                        }
                                    }
                                }
                                finally {
                                    module0579.$g4336$.rebind(var3_226, var143);
                                }
                            }
                        }
                        catch (Throwable var158) {
                            Errors.handleThrowable(var158, (SubLObject)module0763.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(var3_225, var143);
                    }
                }
                catch (Throwable var159) {
                    var145 = Errors.handleThrowable(var159, module0003.$g3$.getGlobalValue());
                }
                finally {
                    var143.throwStack.pop();
                }
                if (var145.isString() && module0763.NIL == module0578.f35477()) {
                    Errors.warn(Sequences.cconcatenate(module0752.f47234(var145), (SubLObject)module0763.$ic39$), module0579.f35508());
                }
            }
        }
        finally {
            module0578.$g4234$.rebind(var147, var143);
            Errors.$continue_cerrorP$.rebind(var146, var143);
        }
        return var144;
    }
    
    public static SubLObject f48257(final SubLObject var140) {
        if (module0763.NIL != module0178.f11284(var140)) {
            final SubLObject var141 = module0178.f11334(var140);
            final SubLObject var142 = module0751.f47156(var141, (SubLObject)module0763.UNPROVIDED);
            return var142;
        }
        return (SubLObject)module0763.NIL;
    }
    
    public static SubLObject f48258(final SubLObject var232, SubLObject var233, SubLObject var142, SubLObject var179) {
        if (var233 == module0763.UNPROVIDED) {
            var233 = (SubLObject)module0763.NIL;
        }
        if (var142 == module0763.UNPROVIDED) {
            var142 = (SubLObject)module0763.$ic34$;
        }
        if (var179 == module0763.UNPROVIDED) {
            var179 = (SubLObject)module0763.NIL;
        }
        final SubLThread var234 = SubLProcess.currentSubLThread();
        SubLObject var235 = (SubLObject)module0763.NIL;
        if (module0763.NIL != module0202.f12590(var232)) {
            final SubLObject var236 = module0580.$g4361$.currentBinding(var234);
            try {
                module0580.$g4361$.bind((SubLObject)module0763.NIL, var234);
                var234.resetMultipleValues();
                final SubLObject var3_234 = module0580.$g4362$.currentBinding(var234);
                try {
                    module0580.$g4362$.bind(module0580.f35560(), var234);
                    final SubLObject var237 = var234.secondMultipleValue();
                    var234.resetMultipleValues();
                    try {
                        var234.resetMultipleValues();
                        final SubLObject var3_235 = module0580.$g4358$.currentBinding(var234);
                        try {
                            module0580.$g4358$.bind(module0580.f35544(), var234);
                            final SubLObject var238 = var234.secondMultipleValue();
                            var234.resetMultipleValues();
                            final SubLObject var3_236 = module0580.$g4359$.currentBinding(var234);
                            try {
                                module0580.$g4359$.bind(module0580.f35545(), var234);
                                final SubLObject var239 = module0580.$g4358$.getDynamicValue(var234);
                                final SubLObject var3_237 = module0034.$g879$.currentBinding(var234);
                                try {
                                    module0034.$g879$.bind(var239, var234);
                                    SubLObject var240 = (SubLObject)module0763.NIL;
                                    if (module0763.NIL != var239 && module0763.NIL == module0034.f1842(var239)) {
                                        var240 = module0034.f1869(var239);
                                        final SubLObject var241 = Threads.current_process();
                                        if (module0763.NIL == var240) {
                                            module0034.f1873(var239, var241);
                                        }
                                        else if (!var240.eql(var241)) {
                                            Errors.error((SubLObject)module0763.$ic3$);
                                        }
                                    }
                                    try {
                                        final SubLObject var242 = f48259(var232);
                                        var235 = ((var142 == module0763.$ic58$) ? f48260(var242, var233, var179) : f48261(var242, var233));
                                    }
                                    finally {
                                        final SubLObject var3_238 = Threads.$is_thread_performing_cleanupP$.currentBinding(var234);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0763.T, var234);
                                            if (module0763.NIL != var239 && module0763.NIL == var240) {
                                                module0034.f1873(var239, (SubLObject)module0763.NIL);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var3_238, var234);
                                        }
                                    }
                                }
                                finally {
                                    module0034.$g879$.rebind(var3_237, var234);
                                }
                            }
                            finally {
                                module0580.$g4359$.rebind(var3_236, var234);
                            }
                            if (var238 == module0763.$ic4$ && module0763.NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var234))) {
                                module0034.f1891(module0580.$g4358$.getDynamicValue(var234));
                            }
                        }
                        finally {
                            module0580.$g4358$.rebind(var3_235, var234);
                        }
                    }
                    finally {
                        final SubLObject var3_239 = Threads.$is_thread_performing_cleanupP$.currentBinding(var234);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0763.T, var234);
                            if (module0763.NIL == var237) {
                                module0580.f35554(module0580.$g4362$.getDynamicValue(var234));
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var3_239, var234);
                        }
                    }
                }
                finally {
                    module0580.$g4362$.rebind(var3_234, var234);
                }
            }
            finally {
                module0580.$g4361$.rebind(var236, var234);
            }
        }
        return var235;
    }
    
    public static SubLObject f48260(final SubLObject var232, SubLObject var233, SubLObject var179) {
        if (var233 == module0763.UNPROVIDED) {
            var233 = (SubLObject)module0763.NIL;
        }
        if (var179 == module0763.UNPROVIDED) {
            var179 = (SubLObject)module0763.NIL;
        }
        assert module0763.NIL != module0202.f12590(var232) : var232;
        final SubLObject var234 = f48262(var232, module0751.f47155(var233), var179);
        if (module0763.NIL == module0077.f5318(var234)) {
            final SubLObject var235 = Sequences.cconcatenate((SubLObject)module0763.$ic0$, new SubLObject[] { module0006.f205((SubLObject)module0763.ONE_INTEGER), module0763.$ic1$, module0006.f203((SubLObject)module0763.$ic60$) });
            module0578.f35476(var235, (SubLObject)ConsesLow.list(var233, var232, module0077.f5312(var234)));
        }
        if (module0763.NIL != f48263(var232, module0751.f47155(var233))) {
            return (SubLObject)module0763.NIL;
        }
        return module0035.sublisp_boolean(f48264(var232, (SubLObject)module0763.UNPROVIDED));
    }
    
    public static SubLObject f48262(final SubLObject var242, final SubLObject var177, SubLObject var243) {
        if (var243 == module0763.UNPROVIDED) {
            var243 = (SubLObject)module0763.NIL;
        }
        final SubLObject var244 = module0077.f5313((SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
        if (module0763.NIL != var177) {
            SubLObject var245 = (SubLObject)module0763.NIL;
            final SubLObject var246 = module0205.f13183(var242, (SubLObject)module0763.$ic61$, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
            final SubLObject var247 = module0035.f2399(var246, (SubLObject)module0763.$ic62$, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
            if (module0763.NIL == var245) {
                SubLObject var248;
                SubLObject var249;
                SubLObject var250;
                for (var248 = module0048.f_1X(var177), var249 = (SubLObject)module0763.NIL, var249 = (SubLObject)module0763.ONE_INTEGER; module0763.NIL == var245 && !var249.numGE(var248); var249 = module0048.f_1X(var249)) {
                    var250 = module0303.f20123(var249);
                    if (module0763.NIL != Sequences.find(var250, var247, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED)) {
                        var245 = (SubLObject)module0763.T;
                    }
                    else if (module0763.NIL == module0205.f13221(var250, var242, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED)) {
                        if (module0763.NIL == var243 || module0763.NIL == module0205.f13221(var250, var243, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED)) {
                            module0077.f5326(var250, var244);
                        }
                    }
                }
            }
        }
        return var244;
    }
    
    public static SubLObject f48265(final SubLObject var249) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0763.NIL != module0202.f12659(var249) && module0205.f13276(var249).eql(module0763.$ic63$));
    }
    
    public static SubLObject f48261(final SubLObject var232, SubLObject var233) {
        if (var233 == module0763.UNPROVIDED) {
            var233 = (SubLObject)module0763.NIL;
        }
        assert module0763.NIL != module0202.f12590(var232) : var232;
        return (SubLObject)SubLObjectFactory.makeBoolean(module0763.NIL == f48263(var232, module0751.f47155(var233)));
    }
    
    public static SubLObject f48266(final SubLObject var249) {
        final SubLThread var250 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0763.NIL != module0201.f12546(var249) && module0763.NIL == module0004.f104(var249, module0763.$g6109$.getDynamicValue(var250), (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED));
    }
    
    public static SubLObject f48267(final SubLObject var242) {
        if (module0763.NIL != module0337.f22630(var242, (SubLObject)module0763.$ic65$)) {
            return module0202.f12911(module0205.f13203(var242, (SubLObject)module0763.UNPROVIDED), (SubLObject)module0763.NIL, (SubLObject)module0763.$ic64$, (SubLObject)module0763.UNPROVIDED);
        }
        return (SubLObject)module0763.NIL;
    }
    
    public static SubLObject f48263(final SubLObject var232, final SubLObject var250) {
        final SubLThread var251 = SubLProcess.currentSubLThread();
        final SubLObject var252 = module0205.f13132(var232);
        SubLObject var253 = (SubLObject)SubLObjectFactory.makeBoolean(module0763.NIL == module0762.f48211(var252, (SubLObject)module0763.UNPROVIDED) && !var252.eql(module0763.$ic66$));
        if (module0763.NIL != var253) {
            if (module0763.NIL != module0578.f35470((SubLObject)module0763.ONE_INTEGER) && module0763.NIL == module0578.f35477()) {
                Errors.warn((SubLObject)module0763.$ic67$, var252);
            }
        }
        else {
            final SubLObject var254 = module0763.$g6109$.currentBinding(var251);
            try {
                module0763.$g6109$.bind(ConsesLow.append(f48267(var232), module0763.$g6109$.getDynamicValue(var251)), var251);
                SubLObject var255 = (SubLObject)module0763.ZERO_INTEGER;
                final SubLObject var256 = module0205.f13207(var232, (SubLObject)module0763.$ic68$);
                SubLObject var257;
                SubLObject var258;
                for (var257 = (SubLObject)module0763.NIL, var257 = var256; module0763.NIL == var253 && module0763.NIL != var257; var257 = var257.rest()) {
                    var258 = var257.first();
                    var255 = Numbers.add(var255, (SubLObject)module0763.ONE_INTEGER);
                    if (module0763.NIL != f48268(var258, var255, var252, var250)) {
                        if (module0763.NIL != module0578.f35470((SubLObject)module0763.ONE_INTEGER) && module0763.NIL == module0578.f35477()) {
                            Errors.warn((SubLObject)module0763.$ic69$, var258);
                        }
                        var253 = (SubLObject)module0763.T;
                    }
                }
            }
            finally {
                module0763.$g6109$.rebind(var254, var251);
            }
        }
        return var253;
    }
    
    public static SubLObject f48268(SubLObject var256, final SubLObject var253, final SubLObject var251, final SubLObject var250) {
        final SubLThread var257 = SubLProcess.currentSubLThread();
        if (module0763.NIL != module0290.f19518(var256)) {
            var256 = module0201.f12550(module0205.f13204(var256, (SubLObject)module0763.UNPROVIDED));
        }
        SubLObject var258 = (SubLObject)module0763.NIL;
        if (var253.numE((SubLObject)module0763.ONE_INTEGER) && (var251.equalp(module0763.$ic70$) || var251.equalp(module0763.$ic71$))) {
            if (module0763.NIL != module0552.f34036(var256)) {
                final SubLObject var259 = module0202.f12691(var256, (SubLObject)module0763.$ic64$);
                if (var251.eql(module0763.$ic70$) && module0763.NIL == var259) {
                    final SubLObject var260 = Sequences.cconcatenate((SubLObject)module0763.$ic0$, new SubLObject[] { module0006.f205((SubLObject)module0763.ONE_INTEGER), module0763.$ic1$, module0006.f203((SubLObject)module0763.$ic72$) });
                    module0578.f35476(var260, (SubLObject)ConsesLow.list(var251, var256));
                    var258 = (SubLObject)module0763.T;
                }
            }
            else {
                final SubLObject var261 = Sequences.cconcatenate((SubLObject)module0763.$ic0$, new SubLObject[] { module0006.f205((SubLObject)module0763.ONE_INTEGER), module0763.$ic1$, module0006.f203((SubLObject)module0763.$ic73$) });
                module0578.f35476(var261, (SubLObject)ConsesLow.list(var251, var253, var256));
                var258 = (SubLObject)module0763.T;
            }
        }
        else if (!var253.numE((SubLObject)module0763.ONE_INTEGER) || !var251.equalp(module0763.$ic63$)) {
            if (!var253.numE((SubLObject)module0763.ONE_INTEGER) || !var251.equalp(module0763.$ic74$) || module0763.NIL == module0202.f12590(var256)) {
                if (module0763.NIL != module0202.f12590(var256) && module0763.NIL != module0004.f104(module0763.$ic75$, module0226.f14882(var251, var253, (SubLObject)module0763.UNPROVIDED), (SubLObject)module0763.$ic76$, (SubLObject)module0763.UNPROVIDED)) {
                    if (!var251.equalp(module0763.$ic45$)) {
                        var258 = f48263(var256, var250);
                    }
                }
                else if (module0763.NIL == module0201.f12546(var256) && module0763.NIL == module0751.f46819(var256) && module0763.NIL == module0756.f47603(module0228.f15229(var256)) && module0763.NIL != module0004.f104(module0763.$ic77$, module0226.f14882(var251, var253, (SubLObject)module0763.UNPROVIDED), (SubLObject)module0763.$ic76$, (SubLObject)module0763.UNPROVIDED)) {
                    final SubLObject var261 = Sequences.cconcatenate((SubLObject)module0763.$ic0$, new SubLObject[] { module0006.f205((SubLObject)module0763.ONE_INTEGER), module0763.$ic1$, module0006.f203((SubLObject)module0763.$ic78$) });
                    module0578.f35476(var261, (SubLObject)ConsesLow.list(var256));
                    var258 = (SubLObject)module0763.T;
                }
                else if (module0763.NIL != module0304.f20296(var256)) {
                    if (module0763.NIL != var250 && var250.numG((SubLObject)module0763.ZERO_INTEGER) && module0303.f20124(var256).numG(var250)) {
                        final SubLObject var261 = Sequences.cconcatenate((SubLObject)module0763.$ic0$, new SubLObject[] { module0006.f205((SubLObject)module0763.ONE_INTEGER), module0763.$ic1$, module0006.f203((SubLObject)module0763.$ic79$) });
                        module0578.f35476(var261, (SubLObject)ConsesLow.list(module0303.f20124(var256), var250));
                        var258 = (SubLObject)module0763.T;
                    }
                }
                else if (module0763.NIL != module0128.f8449(var256)) {
                    SubLObject var263;
                    final SubLObject var262 = var263 = module0219.f14510(var251, (SubLObject)module0763.ONE_INTEGER, module0763.$ic80$, module0763.$ic81$, (SubLObject)module0763.UNPROVIDED);
                    SubLObject var264 = (SubLObject)module0763.NIL;
                    var264 = var263.first();
                    while (module0763.NIL != var263) {
                        SubLObject var266;
                        final SubLObject var265 = var266 = module0178.f11303(var264);
                        SubLObject var267 = (SubLObject)module0763.NIL;
                        SubLObject var268 = (SubLObject)module0763.NIL;
                        SubLObject var269 = (SubLObject)module0763.NIL;
                        SubLObject var270 = (SubLObject)module0763.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var266, var265, (SubLObject)module0763.$ic82$);
                        var267 = var266.first();
                        var266 = var266.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var266, var265, (SubLObject)module0763.$ic82$);
                        var268 = var266.first();
                        var266 = var266.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var266, var265, (SubLObject)module0763.$ic82$);
                        var269 = var266.first();
                        var266 = var266.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var266, var265, (SubLObject)module0763.$ic82$);
                        var270 = var266.first();
                        var266 = var266.rest();
                        if (module0763.NIL == var266) {
                            final SubLObject var271 = module0147.f9540(module0579.$g4260$.getDynamicValue(var257));
                            final SubLObject var272 = module0147.$g2095$.currentBinding(var257);
                            final SubLObject var273 = module0147.$g2094$.currentBinding(var257);
                            final SubLObject var274 = module0147.$g2096$.currentBinding(var257);
                            try {
                                module0147.$g2095$.bind(module0147.f9545(var271), var257);
                                module0147.$g2094$.bind(module0147.f9546(var271), var257);
                                module0147.$g2096$.bind(module0147.f9549(var271), var257);
                                if ((var269.numE((SubLObject)module0763.ZERO_INTEGER) || var269.numE(var253)) && !var270.equalp(module0763.$ic83$) && module0763.NIL == module0259.f16854(var256, var270, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED)) {
                                    final SubLObject var275 = Sequences.cconcatenate((SubLObject)module0763.$ic0$, new SubLObject[] { module0006.f205((SubLObject)module0763.ONE_INTEGER), module0763.$ic1$, module0006.f203((SubLObject)module0763.$ic84$) });
                                    module0578.f35476(var275, (SubLObject)ConsesLow.list(var256, var270, module0579.$g4260$.getDynamicValue(var257)));
                                    var258 = (SubLObject)module0763.T;
                                }
                            }
                            finally {
                                module0147.$g2096$.rebind(var274, var257);
                                module0147.$g2094$.rebind(var273, var257);
                                module0147.$g2095$.rebind(var272, var257);
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var265, (SubLObject)module0763.$ic82$);
                        }
                        var263 = var263.rest();
                        var264 = var263.first();
                    }
                }
            }
        }
        return var258;
    }
    
    public static SubLObject f48255(final SubLObject var140, SubLObject var142) {
        if (var142 == module0763.UNPROVIDED) {
            var142 = (SubLObject)module0763.$ic34$;
        }
        return f48269(module0178.f11285(var140), var142);
    }
    
    public static SubLObject f48269(final SubLObject var242, SubLObject var142) {
        if (var142 == module0763.UNPROVIDED) {
            var142 = (SubLObject)module0763.$ic34$;
        }
        if (var142 == module0763.$ic33$) {
            return (SubLObject)module0763.NIL;
        }
        if (module0763.NIL != f48270(var242)) {
            Errors.warn((SubLObject)module0763.$ic85$, var242);
            return (SubLObject)module0763.T;
        }
        if (module0763.NIL != f48271(var242)) {
            Errors.warn((SubLObject)module0763.$ic86$, f48271(var242), var242);
            return (SubLObject)module0763.T;
        }
        if (module0205.f13132(var242).equalp(module0763.$ic87$)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0763.NIL == f48258(module0205.f13134(var242, (SubLObject)module0763.TWO_INTEGER, (SubLObject)module0763.UNPROVIDED), module0205.f13134(var242, (SubLObject)module0763.ONE_INTEGER, (SubLObject)module0763.UNPROVIDED), var142, (SubLObject)module0763.UNPROVIDED));
        }
        if (module0205.f13132(var242).equalp(module0763.$ic88$)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0763.NIL == f48258(module0205.f13134(var242, (SubLObject)module0763.TWO_INTEGER, (SubLObject)module0763.UNPROVIDED), (SubLObject)module0763.NIL, var142, (SubLObject)module0763.UNPROVIDED));
        }
        if (module0205.f13132(var242).equalp(module0763.$ic89$)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0763.NIL == f48258(module0205.f13134(var242, (SubLObject)module0763.THREE_INTEGER, (SubLObject)module0763.UNPROVIDED), module0205.f13134(var242, (SubLObject)module0763.ONE_INTEGER, (SubLObject)module0763.UNPROVIDED), var142, module0205.f13134(var242, (SubLObject)module0763.TWO_INTEGER, (SubLObject)module0763.UNPROVIDED)));
        }
        if (module0205.f13132(var242).equalp(module0763.$ic90$)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0763.NIL == f48258(module0205.f13134(var242, (SubLObject)module0763.TWO_INTEGER, (SubLObject)module0763.UNPROVIDED), module0205.f13134(var242, (SubLObject)module0763.ONE_INTEGER, (SubLObject)module0763.UNPROVIDED), var142, (SubLObject)module0763.UNPROVIDED));
        }
        final SubLObject var243 = Sequences.cconcatenate((SubLObject)module0763.$ic0$, new SubLObject[] { module0006.f205((SubLObject)module0763.ONE_INTEGER), module0763.$ic1$, module0006.f203((SubLObject)module0763.$ic91$) });
        module0578.f35476(var243, (SubLObject)ConsesLow.list(module0205.f13132(var242)));
        return (SubLObject)module0763.T;
    }
    
    public static SubLObject f48270(final SubLObject var242) {
        final SubLThread var243 = SubLProcess.currentSubLThread();
        final SubLObject var244 = module0205.f13136(var242);
        final SubLObject var245 = f48272(var242);
        SubLObject var246 = (SubLObject)module0763.NIL;
        if (!module0205.f13132(var245).eql(module0763.$ic45$) || !module0205.f13132(module0205.f13203(var245, (SubLObject)module0763.UNPROVIDED)).eql(var244)) {
            return (SubLObject)module0763.NIL;
        }
        final SubLObject var247 = module0147.$g2094$.currentBinding(var243);
        final SubLObject var248 = module0147.$g2095$.currentBinding(var243);
        try {
            module0147.$g2094$.bind((SubLObject)module0763.$ic7$, var243);
            module0147.$g2095$.bind(module0763.$ic8$, var243);
            if (module0763.NIL == var246) {
                SubLObject var249;
                SubLObject var250;
                for (var249 = module0048.f_1X(module0751.f47155(var244)), var250 = (SubLObject)module0763.NIL, var250 = (SubLObject)module0763.ONE_INTEGER; module0763.NIL == var246 && !var250.numGE(var249); var250 = module0048.f_1X(var250)) {
                    if (!module0205.f13134(module0205.f13203(var245, (SubLObject)module0763.UNPROVIDED), var250, (SubLObject)module0763.UNPROVIDED).eql(module0303.f20123(var250))) {
                        var246 = (SubLObject)module0763.T;
                    }
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var248, var243);
            module0147.$g2094$.rebind(var247, var243);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0763.NIL == var246);
    }
    
    public static SubLObject f48271(final SubLObject var242) {
        final SubLThread var243 = SubLProcess.currentSubLThread();
        SubLObject var244 = (SubLObject)module0763.NIL;
        SubLObject var245 = (SubLObject)module0763.NIL;
        final SubLObject var246 = module0147.$g2094$.currentBinding(var243);
        final SubLObject var247 = module0147.$g2095$.currentBinding(var243);
        try {
            module0147.$g2094$.bind((SubLObject)module0763.$ic7$, var243);
            module0147.$g2095$.bind(module0763.$ic8$, var243);
            var245 = module0225.f14773(module0205.f13203(var242, (SubLObject)module0763.UNPROVIDED));
        }
        finally {
            module0147.$g2095$.rebind(var247, var243);
            module0147.$g2094$.rebind(var246, var243);
        }
        if (var245.isInteger() && module0763.NIL == var244) {
            SubLObject var248 = module0205.f13183(var242, (SubLObject)module0763.$ic62$, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
            SubLObject var249 = (SubLObject)module0763.NIL;
            var249 = var248.first();
            while (module0763.NIL == var244 && module0763.NIL != var248) {
                if (module0303.f20124(var249).numG(var245)) {
                    var244 = var249;
                }
                var248 = var248.rest();
                var249 = var248.first();
            }
        }
        return var244;
    }
    
    public static SubLObject f48256(final SubLObject var140) {
        return f48272(module0178.f11285(var140));
    }
    
    public static SubLObject f48272(final SubLObject var242) {
        final SubLObject var243 = f48273(module0205.f13136(var242));
        return (SubLObject)((module0763.NIL != var243) ? module0205.f13134(var242, var243, (SubLObject)module0763.UNPROVIDED) : module0763.NIL);
    }
    
    public static SubLObject f48274() {
        final SubLObject var160 = module0763.$g6110$.getGlobalValue();
        if (module0763.NIL != var160) {
            module0034.f1818(var160);
        }
        return (SubLObject)module0763.NIL;
    }
    
    public static SubLObject f48275(final SubLObject var64) {
        return module0034.f1829(module0763.$g6110$.getGlobalValue(), (SubLObject)ConsesLow.list(var64), (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
    }
    
    public static SubLObject f48276(final SubLObject var64) {
        final SubLThread var65 = SubLProcess.currentSubLThread();
        SubLObject var66 = (SubLObject)module0763.NIL;
        final SubLObject var67 = module0147.$g2094$.currentBinding(var65);
        final SubLObject var68 = module0147.$g2095$.currentBinding(var65);
        try {
            module0147.$g2094$.bind((SubLObject)module0763.$ic7$, var65);
            module0147.$g2095$.bind(module0763.$ic8$, var65);
            final SubLObject var69 = module0751.f47155(var64);
            if (var69.isInteger()) {
                if (module0763.NIL == var66) {
                    SubLObject var70;
                    SubLObject var71;
                    SubLObject var72;
                    SubLObject var73;
                    for (var70 = module0048.f_1X(var69), var71 = (SubLObject)module0763.NIL, var71 = (SubLObject)module0763.ONE_INTEGER; module0763.NIL == var66 && !var71.numGE(var70); var71 = module0048.f_1X(var71)) {
                        if (module0763.NIL == var66) {
                            var72 = module0226.f14882(var64, var71, (SubLObject)module0763.UNPROVIDED);
                            var73 = (SubLObject)module0763.NIL;
                            var73 = var72.first();
                            while (module0763.NIL == var66 && module0763.NIL != var72) {
                                if (module0763.NIL != f48277(var73)) {
                                    var66 = var71;
                                }
                                var72 = var72.rest();
                                var73 = var72.first();
                            }
                        }
                    }
                }
            }
            else {
                final SubLObject var74 = Sequences.cconcatenate((SubLObject)module0763.$ic0$, new SubLObject[] { module0006.f205((SubLObject)module0763.ONE_INTEGER), module0763.$ic1$, module0006.f203((SubLObject)module0763.$ic93$) });
                module0578.f35476(var74, (SubLObject)ConsesLow.list(var64));
            }
        }
        finally {
            module0147.$g2095$.rebind(var68, var65);
            module0147.$g2094$.rebind(var67, var65);
        }
        return var66;
    }
    
    public static SubLObject f48273(final SubLObject var64) {
        SubLObject var65 = module0763.$g6110$.getGlobalValue();
        if (module0763.NIL == var65) {
            var65 = module0034.f1934((SubLObject)module0763.$ic92$, (SubLObject)module0763.$ic94$, (SubLObject)module0763.$ic95$, (SubLObject)module0763.EQL, (SubLObject)module0763.ONE_INTEGER, (SubLObject)module0763.SIXTEEN_INTEGER);
        }
        SubLObject var66 = module0034.f1814(var65, var64, (SubLObject)module0763.$ic48$);
        if (var66 == module0763.$ic48$) {
            var66 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f48276(var64)));
            module0034.f1816(var65, var64, var66, (SubLObject)module0763.UNPROVIDED);
        }
        return module0034.f1959(var66);
    }
    
    public static SubLObject f48277(final SubLObject var272) {
        final SubLThread var273 = SubLProcess.currentSubLThread();
        return module0751.f46669(var272, module0763.$ic75$, module0579.$g4260$.getDynamicValue(var273));
    }
    
    public static SubLObject f48278(final SubLObject var273) {
        if (!module0205.f13132(var273).equal(module0763.$ic96$)) {
            return var273;
        }
        SubLObject var274 = (SubLObject)module0763.NIL;
        SubLObject var275 = (SubLObject)module0763.NIL;
        SubLObject var276 = (SubLObject)module0763.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var273, var273, (SubLObject)module0763.$ic97$);
        var274 = var273.first();
        SubLObject var277 = var273.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var277, var273, (SubLObject)module0763.$ic97$);
        var275 = var277.first();
        var277 = var277.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var277, var273, (SubLObject)module0763.$ic97$);
        var276 = var277.first();
        var277 = var277.rest();
        if (module0763.NIL == var277) {
            return f48278(var276);
        }
        cdestructuring_bind.cdestructuring_bind_error(var273, (SubLObject)module0763.$ic97$);
        return (SubLObject)module0763.NIL;
    }
    
    public static SubLObject f48264(final SubLObject var171, SubLObject var222) {
        if (var222 == module0763.UNPROVIDED) {
            var222 = module0751.f46691();
        }
        final SubLThread var223 = SubLProcess.currentSubLThread();
        if (module0763.NIL != module0304.f20296(var171)) {
            return module0756.f47484(module0756.f47463(var171, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED), (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
        }
        final SubLObject var224 = module0172.f10922(var171);
        SubLObject var225 = (SubLObject)module0763.NIL;
        final SubLObject var226 = module0580.f35545();
        final SubLObject var227 = module0034.$g879$.currentBinding(var223);
        try {
            module0034.$g879$.bind(var226, var223);
            SubLObject var228 = (SubLObject)module0763.NIL;
            if (module0763.NIL != var226 && module0763.NIL == module0034.f1842(var226)) {
                var228 = module0034.f1869(var226);
                final SubLObject var229 = Threads.current_process();
                if (module0763.NIL == var228) {
                    module0034.f1873(var226, var229);
                }
                else if (!var228.eql(var229)) {
                    Errors.error((SubLObject)module0763.$ic3$);
                }
            }
            try {
                if (module0763.NIL != module0202.f12590(var224) && module0763.NIL == module0274.f18124(var224)) {
                    final SubLObject var230 = Sequences.cconcatenate((SubLObject)module0763.$ic0$, new SubLObject[] { module0006.f205((SubLObject)module0763.ONE_INTEGER), module0763.$ic1$, module0006.f203((SubLObject)module0763.$ic98$) });
                    module0578.f35476(var230, (SubLObject)ConsesLow.list(var224));
                }
            }
            finally {
                final SubLObject var3_278 = Threads.$is_thread_performing_cleanupP$.currentBinding(var223);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0763.T, var223);
                    if (module0763.NIL != var226 && module0763.NIL == var228) {
                        module0034.f1873(var226, (SubLObject)module0763.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var3_278, var223);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var227, var223);
        }
        final SubLObject var231 = f48278(var224);
        final SubLObject var232 = f48279(var231);
        var223.resetMultipleValues();
        final SubLObject var233 = f48280(var231, var222);
        final SubLObject var234 = var223.secondMultipleValue();
        var223.resetMultipleValues();
        if (module0763.NIL == module0762.f48210(var233)) {
            if (module0763.NIL != module0578.f35470((SubLObject)module0763.ONE_INTEGER) && module0763.NIL == module0578.f35477()) {
                Errors.warn((SubLObject)module0763.$ic99$, var171, var233);
            }
            return (SubLObject)module0763.NIL;
        }
        final SubLObject var235 = module0205.f13364(var233);
        if (var235.eql(module0763.$ic100$)) {
            final SubLObject var236 = module0756.f47531(var233, (SubLObject)module0763.UNPROVIDED);
            final SubLObject var237 = module0751.f46982((SubLObject)module0763.$ic101$, var234);
            module0756.f47469(var236, var237);
            var225 = var236;
        }
        else if (var235.eql(module0763.$ic102$)) {
            final SubLObject var236 = module0756.f47537(var233);
            final SubLObject var237 = module0751.f46982((SubLObject)module0763.$ic101$, var234);
            module0756.f47469(var236, var237);
            var225 = var236;
        }
        else if (var235.eql(module0763.$ic103$)) {
            final SubLObject var236 = module0756.f47529(var233);
            final SubLObject var237 = module0751.f46982((SubLObject)module0763.$ic101$, var234);
            module0756.f47469(var236, var237);
            var225 = var236;
        }
        else if (var235.eql(module0763.$ic104$)) {
            final SubLObject var236 = module0756.f47539(var233);
            final SubLObject var237 = module0751.f46982((SubLObject)module0763.$ic101$, var234);
            module0756.f47469(var236, var237);
            var225 = var236;
        }
        else if (var235.eql(module0763.$ic71$)) {
            final SubLObject var236 = module0756.f47556(var233);
            final SubLObject var237 = module0751.f46982((SubLObject)module0763.$ic101$, var234);
            module0756.f47469(var236, var237);
            var225 = var236;
        }
        else if (var235.eql(module0763.$ic105$)) {
            var225 = f48281(var233, var234);
        }
        else if (var235.eql(module0763.$ic106$)) {
            var225 = module0756.f47553(var233, var234);
        }
        else if (var235.eql(module0763.$ic107$)) {
            final SubLObject var238 = module0205.f13277(var233, (SubLObject)module0763.UNPROVIDED);
            final SubLObject var239 = module0209.f13550(var238);
            final SubLObject var240 = module0751.f46819(var238);
            final SubLObject var241 = (SubLObject)((module0763.NIL != var239) ? module0581.f35652(var238) : module0763.NIL);
            final SubLObject var242 = (module0763.NIL != var240) ? var238 : module0756.f47746();
            final SubLObject var243 = module0751.f46982((SubLObject)module0763.$ic101$, var234);
            final SubLObject var244 = module0749.f46494(var241, var242, (SubLObject)module0763.UNPROVIDED);
            module0756.f47469(var244, var243);
            if (module0763.NIL == var240) {
                module0758.f47951(var244);
            }
            if (module0763.NIL != module0038.f2653(var241)) {
                module0756.f47608(var244);
            }
            var225 = var244;
        }
        else if (var235.eql(module0763.$ic108$)) {
            var225 = module0756.f47545(var233);
        }
        else if (var235.eql(module0763.$ic109$)) {
            var225 = module0756.f47541(var233);
        }
        else if (var235.eql(module0763.$ic110$)) {
            var225 = module0756.f47570(var233);
        }
        else if (var235.eql(module0763.$ic111$)) {
            var225 = module0756.f47571(var233, var234);
        }
        else if (var235.eql(module0763.$ic74$)) {
            var225 = f48282(var233, var234);
        }
        else if (var235.eql(module0763.$ic112$)) {
            var225 = f48283(var233, var234);
        }
        else if (var235.eql(module0763.$ic45$)) {
            final SubLObject var245 = module0205.f13277(var233, (SubLObject)module0763.UNPROVIDED);
            final SubLObject var246 = module0751.f46693(var234, (SubLObject)module0763.$ic113$);
            final SubLObject var247 = module0756.f47484(module0756.f47463(var245, var246, (SubLObject)module0763.UNPROVIDED), (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
            if (module0763.NIL == module0205.f13145((SubLObject)module0763.$ic114$, var245, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED)) {
                module0758.f47951(var247);
            }
            var225 = var247;
        }
        else if (var235.eql(module0763.$ic115$)) {
            final SubLObject var248 = module0205.f13277(var233, (SubLObject)module0763.UNPROVIDED);
            final SubLObject var249 = module0756.f47484(module0756.f47463(var248, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED), (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
            final SubLObject var250 = module0751.f46982((SubLObject)module0763.$ic101$, var234);
            final SubLObject var251 = module0751.f46693(var234, (SubLObject)module0763.$ic113$);
            module0756.f47469(var249, var250);
            module0756.f47464(var249, var251);
            if (module0763.NIL != module0756.f47479(var249)) {
                module0770.f49103(var249);
            }
            else {
                module0756.f47738(var249, module0763.$ic116$, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
            }
            if (module0763.NIL == module0751.f46819(var248)) {
                module0758.f47951(var249);
            }
            var225 = var249;
        }
        else if (var235.eql(module0763.$ic117$)) {
            var225 = f48284(var233);
        }
        else if (var235.eql(module0763.$ic118$)) {
            final SubLObject var236 = module0749.f46494((SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
            final SubLObject var237 = module0751.f46982((SubLObject)module0763.$ic101$, var234);
            module0756.f47469(var236, var237);
            module0756.f47625(var236, module0228.f15229(module0205.f13277(var233, (SubLObject)module0763.UNPROVIDED)));
            module0758.f47951(var236);
            var225 = var236;
        }
        else if (var235.eql(module0763.$ic70$)) {
            var225 = module0756.f47574(var233, var222);
        }
        else if (var235.eql(module0763.$ic119$) || var235.eql(module0763.$ic120$) || var235.eql(module0763.$ic121$)) {
            var225 = module0756.f47578(var233);
        }
        else if (var235.eql(module0763.$ic122$)) {
            var225 = module0756.f47581(var233);
        }
        else if (var235.eql(module0763.$ic123$)) {
            var225 = module0756.f47573(var233);
        }
        else if (var235.eql(module0763.$ic63$)) {
            var225 = module0756.f47598(var233);
        }
        else if (var235.eql(module0763.$ic124$)) {
            var225 = f48285(var233, var234);
        }
        else if (var235.eql(module0763.$ic125$)) {
            final SubLObject var236 = f48264(module0205.f13277(var233, (SubLObject)module0763.UNPROVIDED), (SubLObject)module0763.UNPROVIDED);
            final SubLObject var237 = module0751.f46982((SubLObject)module0763.$ic101$, var234);
            module0756.f47469(var236, var237);
            var225 = var236;
        }
        else if (var235.eql(module0763.$ic126$)) {
            final SubLObject var236 = f48264(module0205.f13277(var233, (SubLObject)module0763.UNPROVIDED), (SubLObject)module0763.UNPROVIDED);
            final SubLObject var237 = module0751.f46982((SubLObject)module0763.$ic101$, var234);
            final SubLObject var252 = module0751.f46991((SubLObject)module0763.$ic127$, (SubLObject)module0763.$ic128$);
            module0756.f47534(var236, var252, (SubLObject)module0763.UNPROVIDED);
            module0756.f47469(var236, var237);
            var225 = var236;
        }
        else if (module0763.NIL != module0578.f35470((SubLObject)module0763.ONE_INTEGER) && module0763.NIL == module0578.f35477()) {
            Errors.warn((SubLObject)module0763.$ic129$, var233);
        }
        if (module0763.NIL != module0756.f47497(var225, (SubLObject)module0763.UNPROVIDED)) {
            SubLObject var253;
            SubLObject var254;
            SubLObject var255;
            for (var253 = (SubLObject)module0763.NIL, var253 = var232; module0763.NIL != var253; var253 = conses_high.cddr(var253)) {
                var254 = var253.first();
                var255 = conses_high.cadr(var253);
                module0749.f46424(var225, var254, var255);
            }
        }
        if (module0763.NIL != module0756.f47497(var225, (SubLObject)module0763.UNPROVIDED)) {
            module0756.f47637(var225);
        }
        return Values.values(var225, (SubLObject)((module0763.NIL != module0756.f47497(var225, (SubLObject)module0763.UNPROVIDED)) ? module0749.f46416(var225) : module0763.NIL));
    }
    
    public static SubLObject f48281(final SubLObject var171, SubLObject var222) {
        if (var222 == module0763.UNPROVIDED) {
            var222 = (SubLObject)module0763.NIL;
        }
        final SubLObject var223 = module0749.f46494((SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
        SubLObject var224 = (SubLObject)module0763.NIL;
        SubLObject var225 = (SubLObject)module0763.NIL;
        SubLObject var226 = (SubLObject)module0763.NIL;
        SubLObject var227 = (SubLObject)module0763.NIL;
        SubLObject var228 = (SubLObject)module0763.NIL;
        var226 = module0205.f13304(var171, (SubLObject)module0763.UNPROVIDED);
        var227 = var226.first();
        for (var228 = (SubLObject)module0763.ZERO_INTEGER; module0763.NIL != var226; var226 = var226.rest(), var227 = var226.first(), var228 = Numbers.add((SubLObject)module0763.ONE_INTEGER, var228)) {
            if (module0763.NIL != f48286(var227)) {
                var227 = f48287(var227);
                var224 = var228;
            }
            final SubLObject var229 = module0751.f46693(var222, module0303.f20123(module0048.f_1X(var228)));
            final SubLObject var230 = f48264(var227, var229);
            final SubLObject var231 = module0048.f_1X(var228);
            final SubLObject var232 = (SubLObject)ConsesLow.list(var231);
            final SubLObject var233 = module0751.f46982(var232, var222);
            module0756.f47469(var230, var233);
            var225 = (SubLObject)ConsesLow.cons(var230, var225);
        }
        module0756.f47507(var223, Sequences.nreverse(var225), var224);
        f48288(var223);
        return var223;
    }
    
    public static SubLObject f48288(final SubLObject var178) {
        final SubLObject var179 = module0756.f47588(var178);
        SubLObject var180 = (SubLObject)module0763.ZERO_INTEGER;
        if (module0743.f45996(var178).isVector()) {
            final SubLObject var181 = module0743.f45996(var178);
            final SubLObject var182 = (SubLObject)module0763.NIL;
            SubLObject var183;
            SubLObject var184;
            SubLObject var185;
            SubLObject var186;
            SubLObject var187;
            SubLObject var188;
            for (var183 = Sequences.length(var181), var184 = (SubLObject)module0763.NIL, var184 = (SubLObject)module0763.ZERO_INTEGER; var184.numL(var183); var184 = Numbers.add(var184, (SubLObject)module0763.ONE_INTEGER)) {
                var185 = ((module0763.NIL != var182) ? Numbers.subtract(var183, var184, (SubLObject)module0763.ONE_INTEGER) : var184);
                var186 = Vectors.aref(var181, var185);
                var187 = module0756.f47801(var186, (SubLObject)module0763.$ic130$);
                if (module0763.NIL != module0751.f47165(var187) && module0763.NIL == module0756.f47519(var178) && module0763.NIL != module0751.f47087(module0751.f47173(var187)) && module0763.NIL != f48289(module0751.f47173(var187), var179)) {
                    var188 = Sequences.cconcatenate((SubLObject)module0763.$ic0$, new SubLObject[] { module0006.f205((SubLObject)module0763.ONE_INTEGER), module0763.$ic1$, module0006.f203((SubLObject)module0763.$ic131$) });
                    module0578.f35476(var188, (SubLObject)ConsesLow.list(var187, var179));
                }
                if (module0763.NIL != module0756.f47478(var186)) {
                    f48288(var186);
                }
                var180 = Numbers.add(var180, (SubLObject)module0763.ONE_INTEGER);
            }
        }
        return (SubLObject)module0763.NIL;
    }
    
    public static SubLObject f48289(final SubLObject var310, final SubLObject var302) {
        return Numbers.numGE(module0751.f47088(var310), var302);
    }
    
    public static SubLObject f48290(final SubLObject var178) {
        SubLObject var179 = (SubLObject)module0763.ZERO_INTEGER;
        if (module0743.f45996(var178).isVector()) {
            final SubLObject var180 = module0743.f45996(var178);
            final SubLObject var181 = (SubLObject)module0763.NIL;
            SubLObject var182;
            SubLObject var183;
            SubLObject var184;
            SubLObject var185;
            SubLObject var186;
            SubLObject var187;
            SubLObject var188;
            SubLObject var189;
            for (var182 = Sequences.length(var180), var183 = (SubLObject)module0763.NIL, var183 = (SubLObject)module0763.ZERO_INTEGER; var183.numL(var182); var183 = Numbers.add(var183, (SubLObject)module0763.ONE_INTEGER)) {
                var184 = ((module0763.NIL != var181) ? Numbers.subtract(var182, var183, (SubLObject)module0763.ONE_INTEGER) : var183);
                var185 = Vectors.aref(var180, var184);
                var186 = module0756.f47482(var185);
                if (module0763.NIL != module0749.f46374(var186)) {
                    var187 = module0749.f46376(var186);
                    var188 = module0756.f47678(var185);
                    if (module0763.NIL != module0756.f47497(var188, (SubLObject)module0763.UNPROVIDED) && module0763.NIL != module0751.f47165(var187)) {
                        var189 = module0751.f47173(var187);
                        if (module0763.NIL != module0751.f47087(var189)) {
                            f48291(var185, var178, var189, var188, var187);
                        }
                    }
                }
                if (module0763.NIL != module0756.f47478(var185)) {
                    f48290(var185);
                }
                var179 = Numbers.add(var179, (SubLObject)module0763.ONE_INTEGER);
            }
        }
        return (SubLObject)module0763.NIL;
    }
    
    public static SubLObject f48291(final SubLObject var308, final SubLObject var178, final SubLObject var314, SubLObject var313, final SubLObject var312) {
        if (module0763.$ic130$ == module0751.f47170(var312)) {
            var313 = module0756.f47681(var308);
        }
        final SubLObject var315 = module0751.f47089(var314);
        final SubLObject var316 = module0756.f47590(var313, module0751.f47088(var314));
        if (var316.eql(var308)) {
            final SubLObject var317 = Sequences.cconcatenate((SubLObject)module0763.$ic0$, new SubLObject[] { module0006.f205((SubLObject)module0763.ONE_INTEGER), module0763.$ic1$, module0006.f203((SubLObject)module0763.$ic132$) });
            module0578.f35476(var317, (SubLObject)ConsesLow.list(var308));
        }
        else if (module0763.NIL == module0756.f47497(var316, (SubLObject)module0763.UNPROVIDED)) {
            final SubLObject var317 = Sequences.cconcatenate((SubLObject)module0763.$ic0$, new SubLObject[] { module0006.f205((SubLObject)module0763.TWO_INTEGER), module0763.$ic1$, module0006.f203((SubLObject)module0763.$ic133$) });
            module0578.f35476(var317, (SubLObject)ConsesLow.list(var314, var178));
        }
        else if (module0763.NIL != module0756.f47780(var316, module0751.f47170(var312))) {
            final SubLObject var317 = Sequences.cconcatenate((SubLObject)module0763.$ic0$, new SubLObject[] { module0006.f205((SubLObject)module0763.ONE_INTEGER), module0763.$ic1$, module0006.f203((SubLObject)module0763.$ic134$) });
            module0578.f35476(var317, (SubLObject)ConsesLow.list(module0756.f47482(var308), var316));
        }
        else {
            if (module0763.NIL != module0578.f35470((SubLObject)module0763.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0763.T, (SubLObject)module0763.$ic135$, var314, var316);
            }
            module0756.f47798(var308, var316);
            module0756.f47787(var308, var315, (SubLObject)module0763.UNPROVIDED);
        }
        return var308;
    }
    
    public static SubLObject f48286(SubLObject var297) {
        if (module0763.NIL == module0210.f13576(var297, (SubLObject)module0763.UNPROVIDED)) {
            return (SubLObject)module0763.NIL;
        }
        var297 = f48280(var297, (SubLObject)module0763.UNPROVIDED);
        final SubLObject var298 = module0205.f13276(var297);
        if (var298.eql(module0763.$ic125$)) {
            return (SubLObject)module0763.T;
        }
        if (var298.eql(module0763.$ic74$) || var298.eql(module0763.$ic112$)) {
            return f48286(module0205.f13368(var297, (SubLObject)module0763.UNPROVIDED));
        }
        if (var298.eql(module0763.$ic70$)) {
            return Types.sublisp_null(module0035.find_if_not((SubLObject)module0763.$ic136$, module0205.f13304(var297, (SubLObject)module0763.UNPROVIDED).rest(), (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED));
        }
        if (var298.eql(module0763.$ic119$) || var298.eql(module0763.$ic121$)) {
            return Types.sublisp_null(module0035.find_if_not((SubLObject)module0763.$ic136$, module0205.f13304(var297, (SubLObject)module0763.UNPROVIDED), (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED));
        }
        return (SubLObject)module0763.NIL;
    }
    
    public static SubLObject f48287(SubLObject var297) {
        var297 = f48280(var297, (SubLObject)module0763.UNPROVIDED);
        final SubLObject var299;
        final SubLObject var298 = var299 = module0205.f13364(var297);
        if (var299.eql(module0763.$ic125$)) {
            return f48287(module0205.f13277(var297, (SubLObject)module0763.UNPROVIDED));
        }
        if (var299.eql(module0763.$ic74$)) {
            return (SubLObject)ConsesLow.list(var298, module0205.f13277(var297, (SubLObject)module0763.UNPROVIDED), f48287(module0205.f13368(var297, (SubLObject)module0763.UNPROVIDED)));
        }
        return var297;
    }
    
    public static SubLObject f48282(final SubLObject var171, SubLObject var222) {
        if (var222 == module0763.UNPROVIDED) {
            var222 = (SubLObject)module0763.NIL;
        }
        final SubLObject var223 = module0205.f13277(var171, (SubLObject)module0763.UNPROVIDED);
        final SubLObject var224 = module0751.f46693(var222, (SubLObject)module0763.$ic137$);
        SubLObject var225 = f48264(module0205.f13368(var171, (SubLObject)module0763.UNPROVIDED), var224);
        if (module0763.NIL != module0756.f47538(var225)) {
            return var225;
        }
        if (module0763.NIL != module0751.f47109(var223) || module0763.NIL != module0751.f46877(var223)) {
            module0756.f47738(var225, var223, (SubLObject)module0763.T, (SubLObject)module0763.NIL);
            if (module0763.NIL == module0751.f47114(module0756.f47481(var225, (SubLObject)module0763.UNPROVIDED), var223, (SubLObject)module0763.UNPROVIDED)) {
                if (module0763.NIL != module0578.f35470((SubLObject)module0763.ONE_INTEGER) && module0763.NIL == module0578.f35477()) {
                    Errors.warn((SubLObject)module0763.$ic138$, var223, var225);
                }
                var225 = (SubLObject)module0763.NIL;
            }
        }
        else if (module0763.NIL != module0751.f47030(var223) || module0763.NIL != module0751.f47107(var223)) {
            module0756.f47786(var225, var223);
        }
        else if (module0763.NIL != module0210.f13576(var223, (SubLObject)module0763.UNPROVIDED) && module0205.f13364(var223).eql(module0166.f10737((SubLObject)module0763.$ic139$))) {
            final SubLObject var226 = module0751.f47095(module0048.f_1_(module0205.f13277(var223, (SubLObject)module0763.UNPROVIDED)), (SubLObject)module0763.UNPROVIDED);
            final SubLObject var227 = module0751.f46991((SubLObject)module0763.$ic140$, var226);
            module0756.f47534(var225, var227, (SubLObject)module0763.UNPROVIDED);
        }
        else {
            if (module0763.NIL == var223) {
                if (module0763.NIL != module0578.f35470((SubLObject)module0763.ONE_INTEGER) && module0763.NIL == module0578.f35477()) {
                    Errors.warn((SubLObject)module0763.$ic141$, var171);
                }
                return var225;
            }
            final SubLObject var228 = Sequences.cconcatenate((SubLObject)module0763.$ic0$, new SubLObject[] { module0006.f205((SubLObject)module0763.ONE_INTEGER), module0763.$ic1$, module0006.f203((SubLObject)module0763.$ic142$) });
            module0578.f35476(var228, (SubLObject)ConsesLow.list(var223));
        }
        return var225;
    }
    
    public static SubLObject f48283(final SubLObject var171, SubLObject var222) {
        if (var222 == module0763.UNPROVIDED) {
            var222 = (SubLObject)module0763.NIL;
        }
        final SubLObject var223 = module0205.f13277(var171, (SubLObject)module0763.UNPROVIDED);
        final SubLObject var224 = module0751.f46693(var222, (SubLObject)module0763.$ic137$);
        final SubLObject var225 = f48264(module0205.f13368(var171, (SubLObject)module0763.UNPROVIDED), var224);
        module0756.f47465(var225, var223);
        module0756.f47468(var225, var223);
        return var225;
    }
    
    public static SubLObject f48284(final SubLObject var171) {
        final SubLObject var172 = module0749.f46494((SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
        module0756.f47625(var172, module0205.f13277(var171, (SubLObject)module0763.UNPROVIDED));
        module0756.f47503(var172, module0763.$ic143$, (SubLObject)module0763.UNPROVIDED);
        module0758.f47951(var172);
        final SubLObject var173 = f48280(module0205.f13368(var171, (SubLObject)module0763.UNPROVIDED), (SubLObject)module0763.UNPROVIDED);
        final SubLObject var174 = f48292(var173);
        final SubLObject var175 = (module0763.NIL != var174) ? module0751.f47095(module0048.f_1_(module0205.f13368(var173, (SubLObject)module0763.UNPROVIDED)), (SubLObject)module0763.UNPROVIDED) : f48264(var173, (SubLObject)module0763.UNPROVIDED);
        final SubLObject var176 = module0751.f46991((SubLObject)module0763.$ic130$, var175);
        module0756.f47534(var172, var176, (SubLObject)module0763.UNPROVIDED);
        return var172;
    }
    
    public static SubLObject f48292(final SubLObject var171) {
        final SubLObject var172 = f48280(var171, (SubLObject)module0763.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0205.f13364(var172).eql(module0763.$ic66$) && module0205.f13277(var172, (SubLObject)module0763.UNPROVIDED).eql(module0763.$ic75$));
    }
    
    public static SubLObject f48285(final SubLObject var171, SubLObject var222) {
        if (var222 == module0763.UNPROVIDED) {
            var222 = (SubLObject)module0763.NIL;
        }
        final SubLObject var223 = f48264(module0202.f12768(module0763.$ic74$, module0285.f18875((SubLObject)module0763.$ic144$, (SubLObject)module0763.UNPROVIDED), module0205.f13277(var171, (SubLObject)module0763.UNPROVIDED)), (SubLObject)module0763.UNPROVIDED);
        final SubLObject var224 = module0751.f46693(var222, (SubLObject)module0763.$ic137$);
        final SubLObject var225 = f48248(module0205.f13368(var171, (SubLObject)module0763.UNPROVIDED), var224);
        return f48293(var223, var225, var222);
    }
    
    public static SubLObject f48293(final SubLObject var324, final SubLObject var326, SubLObject var222) {
        if (var222 == module0763.UNPROVIDED) {
            var222 = (SubLObject)module0763.NIL;
        }
        final SubLObject var327 = module0749.f46494((SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
        module0756.f47464(var327, var222);
        module0756.f47532(var327);
        module0756.f47533(var327, (SubLObject)module0763.ONE_INTEGER);
        module0756.f47774(var324);
        module0756.f47774(var326);
        module0756.f47738(var324, module0763.$ic145$, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
        module0756.f47738(var326, module0172.f10921((SubLObject)module0763.$ic146$), (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
        if (module0763.NIL != module0756.f47479(var324)) {
            final SubLObject var328 = f48294(module0756.f47480(var324, (SubLObject)module0763.UNPROVIDED));
            final SubLObject var329 = (SubLObject)((module0763.NIL != var328) ? var328 : module0763.$ic147$);
            module0756.f47797(var326, var329, (SubLObject)module0763.T);
            module0756.f47534(var324, module0751.f46991((SubLObject)module0763.$ic148$, module0751.f47095((SubLObject)module0763.ONE_INTEGER, (SubLObject)module0763.UNPROVIDED)), (SubLObject)module0763.UNPROVIDED);
        }
        else if (module0763.NIL == module0751.f47169(module0749.f46375(module0756.f47482(var324)))) {
            module0756.f47534(var326, module0751.f46991((SubLObject)module0763.$ic148$, module0751.f47095((SubLObject)module0763.ZERO_INTEGER, (SubLObject)module0763.UNPROVIDED)), (SubLObject)module0763.UNPROVIDED);
        }
        else {
            module0756.f47534(var324, module0751.f46991((SubLObject)module0763.$ic148$, module0751.f47095((SubLObject)module0763.ONE_INTEGER, (SubLObject)module0763.UNPROVIDED)), (SubLObject)module0763.UNPROVIDED);
            if (module0763.NIL == module0206.f13497(module0756.f47487(var326, (SubLObject)module0763.UNPROVIDED)) && !module0756.f47487(var326, (SubLObject)module0763.UNPROVIDED).isKeyword()) {
                final SubLObject var330 = f48295(var324);
                module0756.f47784(var326, module0751.f47099(var330, module0756.f47488(var326, (SubLObject)module0763.UNPROVIDED), (SubLObject)module0763.UNPROVIDED), (SubLObject)module0763.UNPROVIDED);
            }
        }
        module0756.f47507(var327, (SubLObject)ConsesLow.list(var324, var326), (SubLObject)module0763.UNPROVIDED);
        return var327;
    }
    
    public static SubLObject f48294(final SubLObject var287) {
        final SubLThread var288 = SubLProcess.currentSubLThread();
        SubLObject var289 = (SubLObject)module0763.NIL;
        final SubLObject var290 = module0580.f35545();
        final SubLObject var291 = module0034.$g879$.currentBinding(var288);
        try {
            module0034.$g879$.bind(var290, var288);
            SubLObject var292 = (SubLObject)module0763.NIL;
            if (module0763.NIL != var290 && module0763.NIL == module0034.f1842(var290)) {
                var292 = module0034.f1869(var290);
                final SubLObject var293 = Threads.current_process();
                if (module0763.NIL == var292) {
                    module0034.f1873(var290, var293);
                }
                else if (!var292.eql(var293)) {
                    Errors.error((SubLObject)module0763.$ic3$);
                }
            }
            try {
                var289 = module0731.f44868(var287);
            }
            finally {
                final SubLObject var3_331 = Threads.$is_thread_performing_cleanupP$.currentBinding(var288);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0763.T, var288);
                    if (module0763.NIL != var290 && module0763.NIL == var292) {
                        module0034.f1873(var290, (SubLObject)module0763.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var3_331, var288);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var291, var288);
        }
        return var289;
    }
    
    public static SubLObject f48295(final SubLObject var332) {
        final SubLObject var333 = module0756.f47482(var332);
        final SubLObject var334 = module0749.f46375(var333);
        SubLObject var335 = (SubLObject)module0763.$ic149$;
        if (module0763.NIL == module0751.f47169(var334)) {
            final SubLObject var336 = module0751.f47170(var334);
            if (var336.eql((SubLObject)module0763.$ic150$)) {
                var335 = module0751.f47173(var334);
            }
            else if (var336.eql((SubLObject)module0763.$ic151$)) {
                var335 = (SubLObject)ConsesLow.list(module0751.f47173(var334));
            }
            return var335;
        }
        final SubLObject var337 = module0756.f47606(var332, (SubLObject)module0763.UNPROVIDED);
        final SubLObject var338 = (SubLObject)((module0763.NIL != var337) ? module0731.f44867(var337) : module0763.NIL);
        if (module0763.NIL != var337) {
            return (SubLObject)((module0763.NIL != var338) ? var338 : module0763.$ic147$);
        }
        final SubLObject var339 = module0756.f47487(var332, (SubLObject)module0763.UNPROVIDED);
        if (module0763.NIL != module0756.f47694(var339) && module0763.NIL == module0751.f46819(var339)) {
            final SubLObject var340 = f48296(var339);
            if (module0763.NIL != module0578.f35470((SubLObject)module0763.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0763.T, (SubLObject)module0763.$ic152$, var339, var340);
            }
            return var340;
        }
        if (module0763.NIL != module0578.f35470((SubLObject)module0763.ONE_INTEGER) && module0763.NIL == module0578.f35477()) {
            Errors.warn((SubLObject)module0763.$ic153$, var335, var332);
        }
        return var335;
    }
    
    public static SubLObject f48297(final SubLObject var288) {
        final SubLThread var289 = SubLProcess.currentSubLThread();
        if (var288.isNumber()) {
            return (SubLObject)ConsesLow.list(module0751.f46682(var288));
        }
        SubLObject var290 = (SubLObject)module0763.NIL;
        final SubLObject var291 = module0147.f9540(module0579.$g4260$.getDynamicValue(var289));
        final SubLObject var292 = module0147.$g2095$.currentBinding(var289);
        final SubLObject var293 = module0147.$g2094$.currentBinding(var289);
        final SubLObject var294 = module0147.$g2096$.currentBinding(var289);
        try {
            module0147.$g2095$.bind(module0147.f9545(var291), var289);
            module0147.$g2094$.bind(module0147.f9546(var291), var289);
            module0147.$g2096$.bind(module0147.f9549(var291), var289);
            SubLObject var295 = module0219.f14510(var288, (SubLObject)module0763.FOUR_INTEGER, module0763.$ic155$, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
            SubLObject var296 = (SubLObject)module0763.NIL;
            var296 = var295.first();
            while (module0763.NIL != var295) {
                if (module0763.NIL != module0751.f46640(module0178.f11335(var296), module0763.$ic145$, (SubLObject)module0763.UNPROVIDED)) {
                    SubLObject var45_338 = module0731.f44867(module0178.f11334(var296));
                    SubLObject var297 = (SubLObject)module0763.NIL;
                    var297 = var45_338.first();
                    while (module0763.NIL != var45_338) {
                        final SubLObject var298 = var297;
                        if (module0763.NIL == conses_high.member(var298, var290, Symbols.symbol_function((SubLObject)module0763.EQL), Symbols.symbol_function((SubLObject)module0763.IDENTITY))) {
                            var290 = (SubLObject)ConsesLow.cons(var298, var290);
                        }
                        var45_338 = var45_338.rest();
                        var297 = var45_338.first();
                    }
                }
                var295 = var295.rest();
                var296 = var295.first();
            }
        }
        finally {
            module0147.$g2096$.rebind(var294, var289);
            module0147.$g2094$.rebind(var293, var289);
            module0147.$g2095$.rebind(var292, var289);
        }
        return f48298(var290, (SubLObject)module0763.UNPROVIDED);
    }
    
    public static SubLObject f48296(final SubLObject var288) {
        final SubLThread var289 = SubLProcess.currentSubLThread();
        final SubLObject var290 = module0034.$g879$.getDynamicValue(var289);
        SubLObject var291 = (SubLObject)module0763.NIL;
        if (module0763.NIL == var290) {
            return f48297(var288);
        }
        var291 = module0034.f1857(var290, (SubLObject)module0763.$ic154$, (SubLObject)module0763.UNPROVIDED);
        if (module0763.NIL == var291) {
            var291 = module0034.f1807(module0034.f1842(var290), (SubLObject)module0763.$ic154$, (SubLObject)module0763.ONE_INTEGER, (SubLObject)module0763.NIL, (SubLObject)module0763.EQUAL, (SubLObject)module0763.UNPROVIDED);
            module0034.f1860(var290, (SubLObject)module0763.$ic154$, var291);
        }
        SubLObject var292 = module0034.f1814(var291, var288, (SubLObject)module0763.$ic48$);
        if (var292 == module0763.$ic48$) {
            var292 = Values.arg2(var289.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f48297(var288)));
            module0034.f1816(var291, var288, var292, (SubLObject)module0763.UNPROVIDED);
        }
        return module0034.f1959(var292);
    }
    
    public static SubLObject f48298(final SubLObject var336, SubLObject var343) {
        if (var343 == module0763.UNPROVIDED) {
            var343 = Symbols.symbol_function((SubLObject)module0763.IDENTITY);
        }
        if (!var336.isList()) {
            return (SubLObject)module0763.NIL;
        }
        SubLObject var344 = (SubLObject)module0763.NIL;
        SubLObject var345 = var336;
        SubLObject var346 = (SubLObject)module0763.NIL;
        var346 = var345.first();
        while (module0763.NIL != var345) {
            final SubLObject var347 = Sequences.remove(var346, var336, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
            if (module0763.NIL == module0004.f104(Functions.funcall(var343, var346), var347, (SubLObject)module0763.$ic156$, var343)) {
                var344 = (SubLObject)ConsesLow.cons(var346, var344);
            }
            var345 = var345.rest();
            var346 = var345.first();
        }
        return var344;
    }
    
    public static SubLObject f48250(final SubLObject var140) {
        SubLObject var141 = (SubLObject)module0763.NIL;
        final SubLObject var142 = module0178.f11333(var140);
        if (var142.eql(module0763.$ic157$)) {
            final SubLObject var143 = module0178.f11335(var140);
            final SubLObject var144 = module0303.f20123(var143);
            final SubLObject var145 = module0178.f11336(var140);
            var141 = (SubLObject)ConsesLow.list(module0763.$ic158$, var144, var145);
        }
        else if (var142.eql(module0763.$ic89$)) {
            var141 = module0178.f11335(var140);
        }
        return var141;
    }
    
    public static SubLObject f48242(final SubLObject var161, final SubLObject var349) {
        final SubLThread var350 = SubLProcess.currentSubLThread();
        SubLObject var351 = (SubLObject)module0763.NIL;
        var350.resetMultipleValues();
        final SubLObject var352 = f48299(var161, var349);
        final SubLObject var353 = var350.secondMultipleValue();
        var350.resetMultipleValues();
        SubLObject var354;
        for (var354 = (SubLObject)module0763.NIL, var354 = (SubLObject)module0763.ZERO_INTEGER; var354.numL(var352); var354 = Numbers.add(var354, (SubLObject)module0763.ONE_INTEGER)) {
            var351 = (SubLObject)ConsesLow.cons(ConsesLow.nth(var354, var349), var351);
        }
        if (module0763.NIL != var353) {
            final SubLObject var355 = module0077.f5313((SubLObject)module0763.EQUAL, (SubLObject)module0763.UNPROVIDED);
            module0077.f5326(var161, var355);
            var351 = (SubLObject)ConsesLow.cons(var355, var351);
        }
        else {
            module0077.f5326(var161, ConsesLow.nth(var352, var349));
        }
        SubLObject var356 = Sequences.subseq(var349, var352, (SubLObject)module0763.UNPROVIDED);
        SubLObject var357 = (SubLObject)module0763.NIL;
        var357 = var356.first();
        while (module0763.NIL != var356) {
            var351 = (SubLObject)ConsesLow.cons(var357, var351);
            var356 = var356.rest();
            var357 = var356.first();
        }
        return Sequences.nreverse(var351);
    }
    
    public static SubLObject f48300(final SubLObject var354, final SubLObject var349) {
        SubLObject var355 = var349;
        SubLObject var356 = (SubLObject)module0763.NIL;
        var356 = var355.first();
        while (module0763.NIL != var355) {
            SubLObject var357 = (SubLObject)module0763.NIL;
            final SubLObject var358 = module0077.f5333(var356);
            SubLObject var359;
            SubLObject var360;
            SubLObject var361;
            for (var359 = module0032.f1741(var358), var360 = (SubLObject)module0763.NIL, var360 = module0032.f1742(var359, var358); module0763.NIL == module0032.f1744(var359, var360); var360 = module0032.f1743(var360)) {
                var361 = module0032.f1745(var359, var360);
                if (module0763.NIL != module0032.f1746(var360, var361) && var354.eql(module0749.f46366(var361))) {
                    var357 = (SubLObject)ConsesLow.cons(var361, var357);
                }
            }
            SubLObject var45_356 = var357;
            SubLObject var362 = (SubLObject)module0763.NIL;
            var362 = var45_356.first();
            while (module0763.NIL != var45_356) {
                module0077.f5327(var362, var356);
                var45_356 = var45_356.rest();
                var362 = var45_356.first();
            }
            var355 = var355.rest();
            var356 = var355.first();
        }
        return var349;
    }
    
    public static SubLObject f48299(final SubLObject var161, final SubLObject var349) {
        SubLObject var350 = Types.sublisp_null(var349);
        SubLObject var351 = (SubLObject)((module0763.NIL != var350) ? module0763.ZERO_INTEGER : module0763.NIL);
        SubLObject var352 = (SubLObject)module0763.NIL;
        SubLObject var353 = (SubLObject)module0763.NIL;
        SubLObject var354 = (SubLObject)module0763.NIL;
        var352 = var349;
        var353 = var352.first();
        for (var354 = (SubLObject)module0763.ZERO_INTEGER; module0763.NIL == var351 && module0763.NIL != var352; var352 = var352.rest(), var353 = var352.first(), var354 = Numbers.add((SubLObject)module0763.ONE_INTEGER, var354)) {
            if (module0763.NIL == f48301(var161, var353)) {
                if (module0763.NIL != f48302(var161, var353)) {
                    var351 = var354;
                    var350 = (SubLObject)module0763.T;
                }
                else if (module0763.NIL == f48303(var161, var353)) {
                    if (module0763.NIL != f48304(var161, var353)) {
                        var351 = var354;
                        var350 = (SubLObject)module0763.T;
                    }
                    else {
                        var351 = var354;
                    }
                }
            }
        }
        if (!var351.isInteger()) {
            var351 = Sequences.length(var349);
            var350 = (SubLObject)module0763.T;
        }
        return Values.values(var351, var350);
    }
    
    public static SubLObject f48302(final SubLObject var161, final SubLObject var353) {
        SubLObject var354 = (SubLObject)module0763.NIL;
        SubLObject var355 = (SubLObject)module0763.NIL;
        final SubLObject var356 = module0077.f5333(var353);
        SubLObject var357;
        SubLObject var358;
        SubLObject var359;
        for (var357 = module0032.f1741(var356), var358 = (SubLObject)module0763.NIL, var358 = module0032.f1742(var357, var356); module0763.NIL == var354 && module0763.NIL == module0032.f1744(var357, var358); var358 = module0032.f1743(var358)) {
            var359 = module0032.f1745(var357, var358);
            if (module0763.NIL != module0032.f1746(var358, var359)) {
                var355 = f48305(var161, var359);
                var354 = (SubLObject)module0763.T;
            }
        }
        return var355;
    }
    
    public static SubLObject f48301(final SubLObject var161, final SubLObject var353) {
        SubLObject var354 = (SubLObject)module0763.NIL;
        SubLObject var355 = (SubLObject)module0763.NIL;
        final SubLObject var356 = module0077.f5333(var353);
        SubLObject var357;
        SubLObject var358;
        SubLObject var359;
        for (var357 = module0032.f1741(var356), var358 = (SubLObject)module0763.NIL, var358 = module0032.f1742(var357, var356); module0763.NIL == var354 && module0763.NIL == module0032.f1744(var357, var358); var358 = module0032.f1743(var358)) {
            var359 = module0032.f1745(var357, var358);
            if (module0763.NIL != module0032.f1746(var358, var359)) {
                var355 = f48305(var359, var161);
                var354 = (SubLObject)module0763.T;
            }
        }
        return var355;
    }
    
    public static SubLObject f48305(final SubLObject var360, final SubLObject var361) {
        final SubLObject var362 = module0749.f46365(var360);
        final SubLObject var363 = module0749.f46365(var361);
        return f48306(var362, var363);
    }
    
    public static SubLObject f48304(final SubLObject var161, final SubLObject var353) {
        SubLObject var354 = (SubLObject)module0763.NIL;
        SubLObject var355 = (SubLObject)module0763.NIL;
        final SubLObject var356 = module0077.f5333(var353);
        SubLObject var357;
        SubLObject var358;
        SubLObject var359;
        for (var357 = module0032.f1741(var356), var358 = (SubLObject)module0763.NIL, var358 = module0032.f1742(var357, var356); module0763.NIL == var354 && module0763.NIL == module0032.f1744(var357, var358); var358 = module0032.f1743(var358)) {
            var359 = module0032.f1745(var357, var358);
            if (module0763.NIL != module0032.f1746(var358, var359)) {
                var355 = f48307(var161, var359);
                var354 = (SubLObject)module0763.T;
            }
        }
        return var355;
    }
    
    public static SubLObject f48303(final SubLObject var161, final SubLObject var353) {
        SubLObject var354 = (SubLObject)module0763.NIL;
        SubLObject var355 = (SubLObject)module0763.NIL;
        final SubLObject var356 = module0077.f5333(var353);
        SubLObject var357;
        SubLObject var358;
        SubLObject var359;
        for (var357 = module0032.f1741(var356), var358 = (SubLObject)module0763.NIL, var358 = module0032.f1742(var357, var356); module0763.NIL == var354 && module0763.NIL == module0032.f1744(var357, var358); var358 = module0032.f1743(var358)) {
            var359 = module0032.f1745(var357, var358);
            if (module0763.NIL != module0032.f1746(var358, var359)) {
                var355 = f48307(var359, var161);
                var354 = (SubLObject)module0763.T;
            }
        }
        return var355;
    }
    
    public static SubLObject f48307(final SubLObject var360, final SubLObject var361) {
        final SubLObject var362 = module0749.f46366(var360);
        final SubLObject var363 = module0749.f46366(var361);
        return module0751.f47014(var362, var363, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
    }
    
    public static SubLObject f48306(final SubLObject var362, final SubLObject var363) {
        if (module0763.NIL != var362 && module0763.NIL == var363) {
            return (SubLObject)module0763.T;
        }
        if (module0763.NIL == var362) {
            return (SubLObject)module0763.NIL;
        }
        if (f48308(var362).numL(f48308(var363))) {
            return (SubLObject)module0763.T;
        }
        if (f48308(var363).numL(f48308(var362))) {
            return (SubLObject)module0763.NIL;
        }
        return f48309(f48310(var362), f48310(var363));
    }
    
    public static SubLObject f48311() {
        final SubLObject var160 = module0763.$g6111$.getGlobalValue();
        if (module0763.NIL != var160) {
            module0034.f1818(var160);
        }
        return (SubLObject)module0763.NIL;
    }
    
    public static SubLObject f48312(final SubLObject var366) {
        return module0034.f1829(module0763.$g6111$.getGlobalValue(), (SubLObject)ConsesLow.list(var366), (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
    }
    
    public static SubLObject f48313(final SubLObject var366) {
        return f48314(var366);
    }
    
    public static SubLObject f48310(final SubLObject var366) {
        SubLObject var367 = module0763.$g6111$.getGlobalValue();
        if (module0763.NIL == var367) {
            var367 = module0034.f1934((SubLObject)module0763.$ic159$, (SubLObject)module0763.$ic160$, (SubLObject)module0763.$ic47$, (SubLObject)module0763.EQUAL, (SubLObject)module0763.ONE_INTEGER, (SubLObject)module0763.ZERO_INTEGER);
        }
        SubLObject var368 = module0034.f1814(var367, var366, (SubLObject)module0763.$ic48$);
        if (var368 == module0763.$ic48$) {
            var368 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f48313(var366)));
            module0034.f1816(var367, var366, var368, (SubLObject)module0763.UNPROVIDED);
        }
        return module0034.f1959(var368);
    }
    
    public static SubLObject f48315(final SubLObject var366) {
        return f48314(var366);
    }
    
    public static SubLObject f48316(final SubLObject var366) {
        final SubLThread var367 = SubLProcess.currentSubLThread();
        final SubLObject var368 = module0034.$g879$.getDynamicValue(var367);
        SubLObject var369 = (SubLObject)module0763.NIL;
        if (module0763.NIL == var368) {
            return f48315(var366);
        }
        var369 = module0034.f1857(var368, (SubLObject)module0763.$ic161$, (SubLObject)module0763.UNPROVIDED);
        if (module0763.NIL == var369) {
            var369 = module0034.f1807(module0034.f1842(var368), (SubLObject)module0763.$ic161$, (SubLObject)module0763.ONE_INTEGER, (SubLObject)module0763.$ic47$, (SubLObject)module0763.EQUAL, (SubLObject)module0763.UNPROVIDED);
            module0034.f1860(var368, (SubLObject)module0763.$ic161$, var369);
        }
        SubLObject var370 = module0034.f1814(var369, var366, (SubLObject)module0763.$ic48$);
        if (var370 == module0763.$ic48$) {
            var370 = Values.arg2(var367.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f48315(var366)));
            module0034.f1816(var369, var366, var370, (SubLObject)module0763.UNPROVIDED);
        }
        return module0034.f1959(var370);
    }
    
    public static SubLObject f48314(final SubLObject var366) {
        SubLObject var367 = (SubLObject)module0763.NIL;
        if (module0763.NIL != module0202.f12595(var366)) {
            SubLObject var368 = (SubLObject)module0763.NIL;
            SubLObject var369 = (SubLObject)module0763.NIL;
            SubLObject var371;
            final SubLObject var370 = var371 = module0205.f13207(var366, (SubLObject)module0763.$ic68$);
            SubLObject var372 = (SubLObject)module0763.NIL;
            var372 = var371.first();
            while (module0763.NIL != var371) {
                SubLObject var45_371 = f48316(var372);
                SubLObject var373 = (SubLObject)module0763.NIL;
                var373 = var45_371.first();
                while (module0763.NIL != var45_371) {
                    SubLObject var45_372 = module0232.f15306(var373);
                    SubLObject var374 = (SubLObject)module0763.NIL;
                    var374 = var45_372.first();
                    while (module0763.NIL != var45_372) {
                        var368 = (SubLObject)ConsesLow.cons(var374, var368);
                        var45_372 = var45_372.rest();
                        var374 = var45_372.first();
                    }
                    SubLObject var45_373 = module0232.f15308(var373);
                    SubLObject var375 = (SubLObject)module0763.NIL;
                    var375 = var45_373.first();
                    while (module0763.NIL != var45_373) {
                        var369 = (SubLObject)ConsesLow.cons(var375, var369);
                        var45_373 = var45_373.rest();
                        var375 = var45_373.first();
                    }
                    var45_371 = var45_371.rest();
                    var373 = var45_371.first();
                }
                var371 = var371.rest();
                var372 = var371.first();
            }
            var367 = (SubLObject)ConsesLow.cons(module0232.f15305(var368, var369), var367);
        }
        else if (module0763.NIL != module0202.f12594(var366)) {
            SubLObject var377;
            final SubLObject var376 = var377 = module0205.f13207(var366, (SubLObject)module0763.$ic68$);
            SubLObject var378 = (SubLObject)module0763.NIL;
            var378 = var377.first();
            while (module0763.NIL != var377) {
                SubLObject var379 = (SubLObject)module0763.NIL;
                SubLObject var380 = (SubLObject)module0763.NIL;
                SubLObject var45_374 = f48316(var378);
                SubLObject var381 = (SubLObject)module0763.NIL;
                var381 = var45_374.first();
                while (module0763.NIL != var45_374) {
                    SubLObject var45_375 = module0232.f15306(var381);
                    SubLObject var374 = (SubLObject)module0763.NIL;
                    var374 = var45_375.first();
                    while (module0763.NIL != var45_375) {
                        var379 = (SubLObject)ConsesLow.cons(var374, var379);
                        var45_375 = var45_375.rest();
                        var374 = var45_375.first();
                    }
                    SubLObject var45_376 = module0232.f15308(var381);
                    SubLObject var375 = (SubLObject)module0763.NIL;
                    var375 = var45_376.first();
                    while (module0763.NIL != var45_376) {
                        var380 = (SubLObject)ConsesLow.cons(var375, var380);
                        var45_376 = var45_376.rest();
                        var375 = var45_376.first();
                    }
                    var45_374 = var45_374.rest();
                    var381 = var45_374.first();
                }
                var367 = (SubLObject)ConsesLow.cons(module0232.f15305(var379, var380), var367);
                var377 = var377.rest();
                var378 = var377.first();
            }
        }
        else if (module0763.NIL != module0202.f12592(var366)) {
            final SubLObject var382 = module0205.f13203(var366, (SubLObject)module0763.UNPROVIDED);
            final SubLObject var383 = f48316(var382);
            SubLObject var384 = (SubLObject)module0763.NIL;
            SubLObject var385 = (SubLObject)module0763.NIL;
            SubLObject var386 = var383;
            SubLObject var387 = (SubLObject)module0763.NIL;
            var387 = var386.first();
            while (module0763.NIL != var386) {
                SubLObject var389;
                final SubLObject var388 = var389 = var387;
                SubLObject var390 = (SubLObject)module0763.NIL;
                SubLObject var391 = (SubLObject)module0763.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var389, var388, (SubLObject)module0763.$ic162$);
                var390 = var389.first();
                var389 = var389.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var389, var388, (SubLObject)module0763.$ic162$);
                var391 = var389.first();
                var389 = var389.rest();
                if (module0763.NIL == var389) {
                    var385 = ConsesLow.append(var385, var390);
                    var384 = ConsesLow.append(var384, var391);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var388, (SubLObject)module0763.$ic162$);
                }
                var386 = var386.rest();
                var387 = var386.first();
            }
            var367 = (SubLObject)ConsesLow.cons(module0232.f15305(var384, var385), var367);
        }
        else {
            final SubLObject var368 = (SubLObject)module0763.NIL;
            final SubLObject var369 = (SubLObject)ConsesLow.list(var366);
            var367 = (SubLObject)ConsesLow.cons(module0232.f15305(var368, var369), var367);
        }
        return var367;
    }
    
    public static SubLObject f48308(final SubLObject var179) {
        final SubLObject var180 = module0205.f13183(var179, (SubLObject)module0763.$ic163$, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
        final SubLObject var181 = Mapping.mapcar((SubLObject)module0763.$ic164$, var180);
        final SubLObject var182 = Sequences.remove((SubLObject)module0763.ZERO_INTEGER, var181, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
        return (SubLObject)((module0763.NIL == var182) ? module0763.ZERO_INTEGER : module0048.f3382(var182, (SubLObject)module0763.UNPROVIDED));
    }
    
    public static SubLObject f48309(final SubLObject var392, final SubLObject var393) {
        return Numbers.numG(f48317(var392), f48317(var393));
    }
    
    public static SubLObject f48317(final SubLObject var394) {
        SubLObject var395 = (SubLObject)module0763.ZERO_INTEGER;
        SubLObject var396 = var394;
        SubLObject var397 = (SubLObject)module0763.NIL;
        var397 = var396.first();
        while (module0763.NIL != var396) {
            SubLObject var399;
            final SubLObject var398 = var399 = var397;
            SubLObject var400 = (SubLObject)module0763.NIL;
            SubLObject var401 = (SubLObject)module0763.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var399, var398, (SubLObject)module0763.$ic165$);
            var400 = var399.first();
            var399 = var399.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var399, var398, (SubLObject)module0763.$ic165$);
            var401 = var399.first();
            var399 = var399.rest();
            if (module0763.NIL == var399) {
                var395 = Numbers.add(var395, Sequences.length(var400));
                var395 = Numbers.add(var395, Sequences.length(var401));
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var398, (SubLObject)module0763.$ic165$);
            }
            var396 = var396.rest();
            var397 = var396.first();
        }
        return var395;
    }
    
    public static SubLObject f48318(final SubLObject var400, final SubLObject var173) {
        return f48319((SubLObject)ConsesLow.list(module0763.$ic87$, var400, f48320(f48321(var173))));
    }
    
    public static SubLObject f48321(final SubLObject var173) {
        if (module0763.NIL != module0756.f47519(var173)) {
            return f48322(var173);
        }
        if (module0763.NIL != module0756.f47741(var173)) {
            return f48323(var173);
        }
        if (module0763.NIL != module0756.f47540(var173)) {
            return f48324(var173);
        }
        if (module0763.NIL != module0756.f47478(var173)) {
            return f48325(var173);
        }
        if (module0763.NIL != module0756.f47651(var173)) {
            return f48326(var173);
        }
        if (module0763.NIL != module0756.f47520(var173)) {
            return f48327(var173);
        }
        if (module0763.NIL != module0756.f47610(var173)) {
            return f48328(var173);
        }
        if (module0763.NIL != module0756.f47816(var173)) {
            return f48329(var173);
        }
        final SubLObject var174 = Sequences.cconcatenate((SubLObject)module0763.$ic0$, new SubLObject[] { module0006.f205((SubLObject)module0763.ONE_INTEGER), module0763.$ic1$, module0006.f203((SubLObject)module0763.$ic166$) });
        module0578.f35476(var174, (SubLObject)ConsesLow.list(var173));
        return (SubLObject)module0763.NIL;
    }
    
    public static SubLObject f48322(final SubLObject var178) {
        return (SubLObject)ConsesLow.list(module0763.$ic70$, module0756.f47575(var178), f48321(module0756.f47590(var178, (SubLObject)module0763.ZERO_INTEGER)), f48321(module0756.f47590(var178, (SubLObject)module0763.ONE_INTEGER)));
    }
    
    public static SubLObject f48324(final SubLObject var178) {
        return (SubLObject)ConsesLow.list(module0763.$ic109$, f48321(module0756.f47590(var178, (SubLObject)module0763.ZERO_INTEGER)));
    }
    
    public static SubLObject f48323(final SubLObject var178) {
        final SubLObject var179 = module0756.f47590(var178, (SubLObject)module0763.ZERO_INTEGER);
        final SubLObject var180 = module0756.f47480(var179, (SubLObject)module0763.UNPROVIDED);
        final SubLObject var181 = (SubLObject)(var180.isString() ? ((module0763.NIL != module0731.f44746(var180, module0763.$ic167$, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED)) ? module0763.$ic168$ : ((module0763.NIL != module0731.f44746(var180, module0763.$ic169$, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED)) ? module0763.$ic170$ : module0763.NIL)) : module0763.NIL);
        final SubLObject var182 = module0756.f47590(var178, (SubLObject)module0763.ONE_INTEGER);
        final SubLObject var183 = (SubLObject)((module0763.NIL != var181) ? module0763.NIL : ((module0763.NIL != module0756.f47520(var179)) ? ConsesLow.list(module0763.$ic45$, module0756.f47487(var179, (SubLObject)module0763.UNPROVIDED)) : ConsesLow.list(module0763.$ic107$, var180)));
        final SubLObject var184 = module0756.f47487(var182, (SubLObject)module0763.UNPROVIDED);
        final SubLObject var185 = (module0763.NIL != var184) ? var184 : module0756.f47487(var178, (SubLObject)module0763.UNPROVIDED);
        final SubLObject var186 = module0756.f47779(var182);
        final SubLObject var187 = module0756.f47779(var178);
        final SubLObject var188 = module0756.f47779(var179);
        final SubLObject var189 = module0751.f47099(module0751.f47099(var186, var188, (SubLObject)module0763.UNPROVIDED), var187, (SubLObject)module0763.UNPROVIDED);
        final SubLObject var190 = f48330((SubLObject)((module0763.NIL != module0035.f1997(var189)) ? var189.first() : module0763.NIL));
        final SubLObject var191 = (SubLObject)((module0763.NIL != var190) ? ConsesLow.list(module0763.$ic74$, var190, (SubLObject)ConsesLow.list(module0763.$ic45$, var185)) : ConsesLow.list(module0763.$ic45$, var185));
        final SubLObject var192 = var181;
        if (var192.eql((SubLObject)module0763.$ic168$)) {
            return (SubLObject)ConsesLow.list(module0763.$ic171$, var191);
        }
        if (var192.eql((SubLObject)module0763.$ic170$)) {
            return (SubLObject)ConsesLow.list(module0763.$ic172$, var191);
        }
        return (SubLObject)ConsesLow.list(module0763.$ic124$, var183, var191);
    }
    
    public static SubLObject f48330(final SubLObject var64) {
        final SubLThread var65 = SubLProcess.currentSubLThread();
        if (module0763.NIL == module0751.f46849(var64, module0763.$ic173$, module0579.$g4260$.getDynamicValue(var65))) {
            return (SubLObject)module0763.NIL;
        }
        if (module0763.NIL != module0751.f46849(var64, module0763.$ic174$, module0579.$g4260$.getDynamicValue(var65))) {
            return module0763.$ic175$;
        }
        return module0763.$ic176$;
    }
    
    public static SubLObject f48325(final SubLObject var178) {
        final SubLObject var179 = module0756.f47550(var178);
        final SubLObject var180 = (module0763.NIL != var179) ? module0756.f47515(module0756.f47590(var178, (SubLObject)module0763.ZERO_INTEGER)) : module0756.f47515(var178);
        final SubLObject var181 = (module0763.NIL != var179) ? module0763.$ic106$ : module0763.$ic105$;
        return module0202.f12720(var181, Mapping.mapcar((SubLObject)module0763.$ic177$, var180), (SubLObject)module0763.UNPROVIDED);
    }
    
    public static SubLObject f48326(final SubLObject var178) {
        final SubLObject var179 = module0756.f47606(var178, (SubLObject)module0763.UNPROVIDED);
        final SubLObject var180 = module0756.f47691(var178);
        final SubLObject var181 = module0756.f47781(var178, (SubLObject)module0763.$ic130$);
        final SubLObject var182 = module0756.f47633(var178);
        SubLObject var183 = (SubLObject)module0763.NIL;
        if (module0763.NIL != module0756.f47497(var181, (SubLObject)module0763.UNPROVIDED) && module0763.NIL != module0756.f47497(var182, (SubLObject)module0763.UNPROVIDED)) {
            final SubLObject var184 = Sequences.position(var181, module0756.f47515(var182), (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
            if (module0763.ZERO_INTEGER.eql(var184)) {
                var183 = (SubLObject)ConsesLow.list(module0763.$ic178$, var179);
            }
            else if (var184.isInteger()) {
                final SubLObject var185 = module0048.f_1X(var184);
                var183 = (SubLObject)ConsesLow.list(module0763.$ic125$, (SubLObject)ConsesLow.list(module0763.$ic117$, var179, (SubLObject)ConsesLow.list(module0763.$ic179$, var185)));
            }
        }
        if (module0763.NIL == var183) {
            var183 = (SubLObject)ConsesLow.list(module0763.$ic180$, module0763.$ic143$, var179);
        }
        if (module0763.NIL == module0035.sublisp_boolean(var181) && module0763.NIL == module0751.f46658(module0763.$ic181$, var180, (SubLObject)module0763.UNPROVIDED) && module0763.NIL != var180) {
            var183 = (SubLObject)ConsesLow.list(module0763.$ic74$, var180, var183);
        }
        return var183;
    }
    
    public static SubLObject f48327(final SubLObject var178) {
        if (module0763.NIL != module0756.f47691(var178)) {
            return (SubLObject)ConsesLow.list(module0763.$ic182$, module0756.f47691(var178), module0756.f47487(var178, (SubLObject)module0763.UNPROVIDED));
        }
        if (module0763.NIL != module0212.f13762(module0756.f47481(var178, (SubLObject)module0763.T))) {
            return (SubLObject)ConsesLow.list(module0763.$ic182$, module0756.f47481(var178, (SubLObject)module0763.T), module0756.f47487(var178, (SubLObject)module0763.UNPROVIDED));
        }
        return (SubLObject)ConsesLow.list(module0763.$ic45$, module0756.f47487(var178, (SubLObject)module0763.UNPROVIDED));
    }
    
    public static SubLObject f48328(final SubLObject var178) {
        return module0762.f48215(module0756.f47480(var178, (SubLObject)module0763.UNPROVIDED));
    }
    
    public static SubLObject f48329(final SubLObject var178) {
        SubLObject var179 = (SubLObject)ConsesLow.list(module0763.$ic118$, module0756.f47606(var178, (SubLObject)module0763.UNPROVIDED));
        final SubLObject var180 = module0756.f47488(var178, (SubLObject)module0763.UNPROVIDED);
        SubLObject var181 = (SubLObject)module0763.NIL;
        if (module0763.NIL != module0035.f1997(var180)) {
            var181 = var180.first();
        }
        else if (module0763.NIL != module0212.f13762(module0756.f47481(var178, (SubLObject)module0763.T))) {
            var181 = module0756.f47481(var178, (SubLObject)module0763.T);
        }
        if (module0763.NIL != var181) {
            var179 = (SubLObject)ConsesLow.list(module0763.$ic74$, var181, var179);
        }
        return var179;
    }
    
    public static SubLObject f48331(final SubLObject var242, SubLObject var421, SubLObject var222, SubLObject var422) {
        if (var421 == module0763.UNPROVIDED) {
            var421 = (SubLObject)module0763.NIL;
        }
        if (var222 == module0763.UNPROVIDED) {
            var222 = (SubLObject)module0763.NIL;
        }
        if (var422 == module0763.UNPROVIDED) {
            var422 = (SubLObject)module0763.$ic149$;
        }
        final SubLObject var423 = f48332(var242, var421, var422);
        return f48333(var423, var242, var222, var422);
    }
    
    public static SubLObject f48334(final SubLObject var164, final SubLObject var242, final SubLObject var222, final SubLObject var422) {
        return f48333(var164, var242, var222, var422);
    }
    
    public static SubLObject f48333(final SubLObject var164, final SubLObject var242, final SubLObject var222, final SubLObject var422) {
        final SubLThread var423 = SubLProcess.currentSubLThread();
        final SubLObject var424 = (SubLObject)((module0763.NIL != module0756.f47497(var164, (SubLObject)module0763.UNPROVIDED)) ? module0756.f47487(var164, (SubLObject)module0763.UNPROVIDED) : module0763.NIL);
        final SubLObject var425 = module0205.f13132(var242);
        if (module0763.NIL != f48335(var164)) {
            final SubLObject var426 = module0579.$g4336$.currentBinding(var423);
            try {
                module0579.$g4336$.bind((SubLObject)((module0763.NIL != module0580.f35536(var425)) ? var425 : module0763.$ic185$), var423);
                final SubLObject var427 = f48336(var242, var424, var222);
                if (module0763.NIL != module0756.f47497(var427, (SubLObject)module0763.UNPROVIDED)) {
                    module0756.f47484(var427, var164, (SubLObject)module0763.UNPROVIDED);
                }
            }
            finally {
                module0579.$g4336$.rebind(var426, var423);
            }
        }
        if (module0763.NIL != module0756.f47497(var164, (SubLObject)module0763.UNPROVIDED)) {
            if (!var425.equal(module0756.f47771()) && module0763.NIL == module0751.f46982((SubLObject)module0763.$ic186$, var222)) {
                module0758.f47953(var164, var425, module0579.$g4336$.getDynamicValue(var423), var222);
            }
            module0754.f47322(var424);
            final SubLObject var428 = (SubLObject)module0763.NIL;
            f48337(var164, var242, var222, var428);
            module0756.f47797(var164, var422, (SubLObject)module0763.UNPROVIDED);
            if (module0763.NIL != module0578.f35470((SubLObject)module0763.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0763.T, (SubLObject)module0763.$ic187$, new SubLObject[] { var242, var164, module0756.f47510(var164), var164 });
            }
        }
        return var164;
    }
    
    public static SubLObject f48336(final SubLObject var242, final SubLObject var423, final SubLObject var222) {
        final SubLObject var424 = module0205.f13207(var423, (SubLObject)module0763.UNPROVIDED);
        final SubLObject var425 = module0205.f13132(var423);
        final SubLObject var426 = module0751.f46672(var425, var242);
        final SubLObject var427 = module0202.f12683(var426, var424, (SubLObject)module0763.UNPROVIDED);
        final SubLObject var428 = module0751.f46672(var427, var242);
        final SubLObject var429 = f48332(var428, (SubLObject)module0763.NIL, (SubLObject)module0763.UNPROVIDED);
        if (module0763.NIL != module0756.f47497(var429, (SubLObject)module0763.UNPROVIDED)) {
            final SubLObject var430 = module0751.f46693(var222, var423);
            f48337(var429, var423, var430, (SubLObject)module0763.T);
            return var429;
        }
        return (SubLObject)module0763.NIL;
    }
    
    public static SubLObject f48335(final SubLObject var178) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0763.NIL != module0756.f47497(var178, (SubLObject)module0763.UNPROVIDED) && module0763.NIL == module0756.f47478(var178) && module0763.NIL != f48338(module0756.f47487(var178, (SubLObject)module0763.UNPROVIDED)));
    }
    
    public static SubLObject f48338(final SubLObject var288) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0763.NIL != module0202.f12590(var288) && module0763.NIL != module0304.f20296(module0205.f13132(var288)));
    }
    
    public static SubLObject f48339(SubLObject var148, final SubLObject var222, SubLObject var433) {
        if (var433 == module0763.UNPROVIDED) {
            var433 = (SubLObject)module0763.NIL;
        }
        var148 = module0228.f15229(var148);
        var433 = (SubLObject)ConsesLow.cons(var148, var433);
        final SubLObject var434 = f48241(var148, (SubLObject)module0763.UNPROVIDED);
        return f48340(var434, var433, var222);
    }
    
    public static SubLObject f48340(final SubLObject var349, final SubLObject var433, final SubLObject var222) {
        SubLObject var434 = (SubLObject)module0763.NIL;
        SubLObject var435 = var349;
        SubLObject var436 = (SubLObject)module0763.NIL;
        var436 = var435.first();
        while (module0763.NIL != var435) {
            SubLObject var45_436 = f48341(var436, var433, var222);
            SubLObject var437 = (SubLObject)module0763.NIL;
            var437 = var45_436.first();
            while (module0763.NIL != var45_436) {
                var434 = (SubLObject)ConsesLow.cons(var437, var434);
                var45_436 = var45_436.rest();
                var437 = var45_436.first();
            }
            var435 = var435.rest();
            var436 = var435.first();
        }
        return Sequences.nreverse(var434);
    }
    
    public static SubLObject f48341(final SubLObject var353, final SubLObject var433, final SubLObject var222) {
        SubLObject var434 = (SubLObject)module0763.NIL;
        final SubLObject var435 = module0077.f5333(var353);
        SubLObject var436;
        SubLObject var437;
        SubLObject var438;
        SubLObject var439;
        SubLObject var440;
        for (var436 = module0032.f1741(var435), var437 = (SubLObject)module0763.NIL, var437 = module0032.f1742(var436, var435); module0763.NIL == module0032.f1744(var436, var437); var437 = module0032.f1743(var437)) {
            var438 = module0032.f1745(var436, var437);
            if (module0763.NIL != module0032.f1746(var437, var438)) {
                var439 = f48342(var438, var433, var222);
                var440 = (SubLObject)module0763.NIL;
                var440 = var439.first();
                while (module0763.NIL != var439) {
                    var434 = f48242(var440, var434);
                    var439 = var439.rest();
                    var440 = var439.first();
                }
            }
        }
        return var434;
    }
    
    public static SubLObject f48342(final SubLObject var161, final SubLObject var433, final SubLObject var222) {
        final SubLObject var434 = module0749.f46348(var161);
        SubLObject var435 = (SubLObject)module0763.NIL;
        SubLObject var436 = (SubLObject)module0763.NIL;
        if (module0763.NIL != module0756.f47497(var434, (SubLObject)module0763.UNPROVIDED)) {
            final SubLObject var437 = module0756.f47487(var434, (SubLObject)module0763.UNPROVIDED);
            final SubLObject var438 = module0749.f46365(var161);
            if (module0763.NIL == module0756.f47478(var434) && module0763.NIL != module0202.f12590(var437) && module0763.NIL == module0754.f47324(var437, (SubLObject)module0763.UNPROVIDED)) {
                final SubLObject var439 = module0035.f2114(var433);
                final SubLObject var440 = module0205.f13132(var437);
                if (module0763.NIL == module0004.f104(var440, var433, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED) && module0763.NIL == module0269.f17721(var440)) {
                    SubLObject var441 = f48339(var440, var222, var433);
                    SubLObject var442 = (SubLObject)module0763.NIL;
                    var442 = var441.first();
                    while (module0763.NIL != var441) {
                        final SubLObject var443 = module0077.f5333(var442);
                        SubLObject var444;
                        SubLObject var445;
                        SubLObject var446;
                        SubLObject var447;
                        SubLObject var448;
                        SubLObject var449;
                        for (var444 = module0032.f1741(var443), var445 = (SubLObject)module0763.NIL, var445 = module0032.f1742(var444, var443); module0763.NIL == module0032.f1744(var444, var445); var445 = module0032.f1743(var445)) {
                            var446 = module0032.f1745(var444, var445);
                            if (module0763.NIL != module0032.f1746(var445, var446)) {
                                var447 = f48343(var446, var437);
                                var448 = module0749.f46348(var447);
                                var449 = module0205.f13132(module0756.f47487(var448, (SubLObject)module0763.UNPROVIDED));
                                if (module0763.NIL != conses_high.member(var449, var433, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED)) {
                                    var435 = (SubLObject)module0763.T;
                                }
                                else {
                                    module0758.f47953(var448, var440, var439, var222);
                                    if (module0763.NIL != var438) {
                                        f48344(var447, var438);
                                    }
                                    var436 = (SubLObject)ConsesLow.cons(var447, var436);
                                }
                            }
                        }
                        var441 = var441.rest();
                        var442 = var441.first();
                    }
                }
            }
        }
        if (module0763.NIL != module0035.f2012(var436) && module0763.NIL == var435) {
            var436 = (SubLObject)ConsesLow.list(var161);
        }
        return var436;
    }
    
    public static SubLObject f48344(final SubLObject var161, SubLObject var179) {
        if (module0763.NIL != module0232.f15323(var179)) {
            var179 = module0232.f15333(var179);
        }
        final SubLObject var180 = module0749.f46363(var161);
        if (module0763.NIL == module0202.f12590(var180)) {
            module0749.f46364(var161, var179);
        }
        else if (module0763.NIL != module0202.f12590(var179)) {
            module0749.f46364(var161, module0276.f18287(var180, var179));
        }
        return module0749.f46365(var161);
    }
    
    public static SubLObject f48343(final SubLObject var161, final SubLObject var242) {
        final SubLObject var243 = module0756.f47484(module0749.f46348(var161), (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
        final SubLObject var244 = module0756.f47487(var243, (SubLObject)module0763.UNPROVIDED);
        final SubLObject var245 = module0749.f46365(var161);
        final SubLObject var246 = module0749.f46366(var161);
        module0756.f47465(var243, var242);
        module0756.f47745(var243, var244);
        final SubLObject var247 = module0751.f46672(var245, var242);
        return module0749.f46362(var243, var247, var246);
    }
    
    public static SubLObject f48345(final SubLObject var242, final SubLObject var148, final SubLObject var222, SubLObject var450, SubLObject var451, SubLObject var422) {
        if (var450 == module0763.UNPROVIDED) {
            var450 = (SubLObject)module0763.NIL;
        }
        if (var451 == module0763.UNPROVIDED) {
            var451 = (SubLObject)module0763.NIL;
        }
        if (var422 == module0763.UNPROVIDED) {
            var422 = (SubLObject)module0763.$ic149$;
        }
        final SubLThread var452 = SubLProcess.currentSubLThread();
        SubLObject var453 = (SubLObject)module0763.NIL;
        final SubLObject var454 = module0579.$g4333$.currentBinding(var452);
        try {
            module0579.$g4333$.bind(var242, var452);
            final SubLObject var455 = f48339(var148, var222, (SubLObject)module0763.UNPROVIDED);
            SubLObject var456 = (SubLObject)module0763.NIL;
            SubLObject var457 = var455;
            SubLObject var458 = (SubLObject)module0763.NIL;
            var458 = var457.first();
            while (module0763.NIL != var457) {
                SubLObject var45_454;
                final SubLObject var459 = var45_454 = f48346(module0077.f5312(var458));
                SubLObject var460 = (SubLObject)module0763.NIL;
                var460 = var45_454.first();
                while (module0763.NIL != var45_454) {
                    if (module0763.NIL != f48347(var460, var242)) {
                        var456 = (SubLObject)ConsesLow.cons(var460, var456);
                    }
                    else {
                        final SubLObject var461 = f48348(var460, var242, var450, var451, var422);
                        if (module0763.NIL != module0756.f47497(var461, (SubLObject)module0763.UNPROVIDED)) {
                            var453 = (SubLObject)ConsesLow.cons(var461, var453);
                        }
                        else if (module0763.NIL != module0578.f35470((SubLObject)module0763.ONE_INTEGER) && module0763.NIL == module0578.f35477()) {
                            Errors.warn(var461);
                        }
                    }
                    var45_454 = var45_454.rest();
                    var460 = var45_454.first();
                }
                var457 = var457.rest();
                var458 = var457.first();
            }
            var457 = Sequences.nreverse(var456);
            SubLObject var462 = (SubLObject)module0763.NIL;
            var462 = var457.first();
            while (module0763.NIL != var457) {
                final SubLObject var463 = f48348(var462, var242, var450, var451, var422);
                if (module0763.NIL != module0756.f47497(var463, (SubLObject)module0763.UNPROVIDED)) {
                    var453 = (SubLObject)ConsesLow.cons(var463, var453);
                }
                else if (module0763.NIL != module0578.f35470((SubLObject)module0763.ONE_INTEGER) && module0763.NIL == module0578.f35477()) {
                    Errors.warn(var463);
                }
                var457 = var457.rest();
                var462 = var457.first();
            }
        }
        finally {
            module0579.$g4333$.rebind(var454, var452);
        }
        return Sort.stable_sort(Sequences.nreverse(Sequences.remove((SubLObject)module0763.NIL, var453, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED)), Symbols.symbol_function((SubLObject)module0763.$ic188$), (SubLObject)module0763.$ic189$);
    }
    
    public static SubLObject f48346(final SubLObject var453) {
        final SubLThread var454 = SubLProcess.currentSubLThread();
        final SubLObject var455 = (module0763.$ic190$ == module0579.$g4286$.getDynamicValue(var454)) ? module0035.f2097(var453) : var453;
        SubLObject var456 = Sort.stable_sort(var455, (module0763.NIL != module0751.f46606((SubLObject)module0763.ZERO_INTEGER)) ? Symbols.symbol_function((SubLObject)module0763.$ic191$) : Symbols.symbol_function((SubLObject)module0763.$ic188$), (SubLObject)module0763.$ic192$);
        final SubLObject var457 = module0147.f9540(module0579.$g4260$.getDynamicValue(var454));
        final SubLObject var458 = module0147.$g2095$.currentBinding(var454);
        final SubLObject var459 = module0147.$g2094$.currentBinding(var454);
        final SubLObject var460 = module0147.$g2096$.currentBinding(var454);
        try {
            module0147.$g2095$.bind(module0147.f9545(var457), var454);
            module0147.$g2094$.bind(module0147.f9546(var457), var454);
            module0147.$g2096$.bind(module0147.f9549(var457), var454);
            var456 = module0751.f47010(var456, (SubLObject)module0763.$ic193$, (SubLObject)module0763.UNPROVIDED);
        }
        finally {
            module0147.$g2096$.rebind(var460, var454);
            module0147.$g2094$.rebind(var459, var454);
            module0147.$g2095$.rebind(var458, var454);
        }
        return var456;
    }
    
    public static SubLObject f48349(final SubLObject var458) {
        final SubLThread var459 = SubLProcess.currentSubLThread();
        if (module0763.NIL != module0749.f46551(var458)) {
            return (SubLObject)module0763.$ic30$;
        }
        SubLObject var460 = (SubLObject)module0763.NIL;
        SubLObject var461 = (SubLObject)module0763.NIL;
        while (module0763.NIL == var460) {
            var459.resetMultipleValues();
            final SubLObject var462 = f48350(var458);
            final SubLObject var463 = var459.secondMultipleValue();
            var459.resetMultipleValues();
            if (module0763.NIL == var462) {
                var460 = (SubLObject)module0763.$ic30$;
            }
            else if (module0763.$ic194$ == var462) {
                var460 = (SubLObject)module0763.$ic194$;
            }
            else if (module0763.NIL != module0749.f46351(var462)) {
                var460 = f48348(var462, module0749.f46523(var458), var463, module0749.f46525(var458), module0749.f46527(var458));
                var461 = var463;
                if (module0763.NIL != module0756.f47497(var460, (SubLObject)module0763.UNPROVIDED) || module0763.NIL == module0578.f35470((SubLObject)module0763.ONE_INTEGER)) {
                    continue;
                }
                PrintLow.format((SubLObject)module0763.T, (SubLObject)module0763.$ic195$, var462, var460);
            }
            else {
                final SubLObject var464 = Sequences.cconcatenate((SubLObject)module0763.$ic0$, new SubLObject[] { module0006.f205((SubLObject)module0763.ONE_INTEGER), module0763.$ic1$, module0006.f203((SubLObject)module0763.$ic196$) });
                module0578.f35476(var464, (SubLObject)ConsesLow.list(var462));
            }
        }
        return Values.values(var460, var461);
    }
    
    public static SubLObject f48350(final SubLObject var458) {
        final SubLThread var459 = SubLProcess.currentSubLThread();
        var459.resetMultipleValues();
        SubLObject var460 = f48351(var458);
        SubLObject var461 = var459.secondMultipleValue();
        var459.resetMultipleValues();
        while (module0763.NIL != module0749.f46351(var460) && module0763.NIL != module0579.f35494(module0749.f46366(var460))) {
            if (module0763.NIL != module0578.f35470((SubLObject)module0763.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0763.T, (SubLObject)module0763.$ic197$, var460);
            }
            var459.resetMultipleValues();
            final SubLObject var460_461 = f48351(var458);
            final SubLObject var462_463 = var459.secondMultipleValue();
            var459.resetMultipleValues();
            var460 = var460_461;
            var461 = var462_463;
        }
        if (module0763.NIL == module0749.f46351(var460)) {
            module0749.f46540(var458, (SubLObject)module0763.T);
        }
        return Values.values(var460, var461);
    }
    
    public static SubLObject f48351(final SubLObject var458) {
        SubLObject var459 = module0055.f4023(f48352(var458));
        SubLObject var460 = (SubLObject)module0763.NIL;
        if (var459.isList() && module0763.$ic198$ == var459.first()) {
            var459 = conses_high.second(var459);
            var460 = (SubLObject)module0763.T;
        }
        return Values.values(var459, var460);
    }
    
    public static SubLObject f48353(final SubLObject var458) {
        final SubLThread var459 = SubLProcess.currentSubLThread();
        final SubLObject var460 = module0749.f46526(var458);
        final SubLObject var461 = module0749.f46523(var458);
        final SubLObject var462 = module0749.f46524(var458);
        final SubLObject var463 = module0228.f15229(module0205.f13136(var461));
        final SubLObject var464 = module0749.f46531(var458);
        module0055.f4018(var464);
        if (module0763.NIL != module0578.f35470((SubLObject)module0763.ONE_INTEGER)) {
            PrintLow.format((SubLObject)module0763.T, (SubLObject)module0763.$ic199$);
        }
        if (module0763.NIL != var460) {
            module0055.f4021(var460, var464);
        }
        else {
            module0055.f4021(var463, var464);
            final SubLObject var465 = module0749.f46529(var458);
            SubLObject var466 = (SubLObject)SubLObjectFactory.makeBoolean(module0763.NIL == module0048.f3293(var465));
            if (module0763.NIL == var466) {
                if (module0763.NIL != module0269.f17715(var463)) {
                    SubLObject var467 = Sequences.remove(var463, module0751.f46623(var463, var462), Symbols.symbol_function((SubLObject)module0763.EQUAL), (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
                    SubLObject var468 = (SubLObject)module0763.NIL;
                    var468 = var467.first();
                    while (module0763.NIL != var467) {
                        module0055.f4021(var468, var464);
                        var467 = var467.rest();
                        var468 = var467.first();
                    }
                    if (module0763.NIL == var466) {
                        final SubLObject var469 = module0137.f8955(module0763.$ic200$);
                        final SubLObject var470 = var463;
                        final SubLObject var471 = (SubLObject)((module0763.$ic11$ == module0763.$ic201$) ? module0763.$ic13$ : module0763.$ic12$);
                        final SubLObject var472 = module0056.f4145(var471);
                        SubLObject var473 = (SubLObject)module0763.NIL;
                        final SubLObject var474 = module0139.$g1635$.currentBinding(var459);
                        try {
                            module0139.$g1635$.bind(module0139.f9007(), var459);
                            final SubLObject var475 = var462;
                            final SubLObject var3_476 = module0147.$g2095$.currentBinding(var459);
                            final SubLObject var476 = module0147.$g2094$.currentBinding(var459);
                            final SubLObject var477 = module0147.$g2096$.currentBinding(var459);
                            try {
                                module0147.$g2095$.bind(module0147.f9545(var475), var459);
                                module0147.$g2094$.bind(module0147.f9546(var475), var459);
                                module0147.$g2096$.bind(module0147.f9549(var475), var459);
                                final SubLObject var478 = module0763.$ic202$;
                                final SubLObject var3_477 = module0141.$g1714$.currentBinding(var459);
                                final SubLObject var22_478 = module0141.$g1715$.currentBinding(var459);
                                try {
                                    module0141.$g1714$.bind((module0763.NIL != var478) ? var478 : module0141.f9283(), var459);
                                    module0141.$g1715$.bind((SubLObject)((module0763.NIL != var478) ? module0763.$ic14$ : module0141.$g1715$.getDynamicValue(var459)), var459);
                                    if (module0763.NIL != var478 && module0763.NIL != module0136.f8864() && module0763.NIL == module0141.f9279(var478)) {
                                        final SubLObject var479 = module0136.$g1591$.getDynamicValue(var459);
                                        if (var479.eql((SubLObject)module0763.$ic15$)) {
                                            module0136.f8870((SubLObject)module0763.ONE_INTEGER, (SubLObject)module0763.$ic16$, var478, (SubLObject)module0763.$ic17$, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
                                        }
                                        else if (var479.eql((SubLObject)module0763.$ic18$)) {
                                            module0136.f8871((SubLObject)module0763.ONE_INTEGER, (SubLObject)module0763.$ic19$, (SubLObject)module0763.$ic16$, var478, (SubLObject)module0763.$ic17$, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
                                        }
                                        else if (var479.eql((SubLObject)module0763.$ic20$)) {
                                            Errors.warn((SubLObject)module0763.$ic16$, var478, (SubLObject)module0763.$ic17$);
                                        }
                                        else {
                                            Errors.warn((SubLObject)module0763.$ic21$, module0136.$g1591$.getDynamicValue(var459));
                                            Errors.cerror((SubLObject)module0763.$ic19$, (SubLObject)module0763.$ic16$, var478, (SubLObject)module0763.$ic17$);
                                        }
                                    }
                                    final SubLObject var3_478 = module0141.$g1670$.currentBinding(var459);
                                    final SubLObject var22_479 = module0141.$g1671$.currentBinding(var459);
                                    final SubLObject var37_481 = module0141.$g1672$.currentBinding(var459);
                                    final SubLObject var480 = module0141.$g1674$.currentBinding(var459);
                                    final SubLObject var481 = module0137.$g1605$.currentBinding(var459);
                                    try {
                                        module0141.$g1670$.bind(var469, var459);
                                        module0141.$g1671$.bind(module0244.f15739(var469), var459);
                                        module0141.$g1672$.bind(module0244.f15746(var469), var459);
                                        module0141.$g1674$.bind((SubLObject)module0763.NIL, var459);
                                        module0137.$g1605$.bind(var469, var459);
                                        if (module0763.NIL != module0136.f8865() || module0763.NIL != module0244.f15795(var463, module0137.f8955((SubLObject)module0763.UNPROVIDED))) {
                                            final SubLObject var3_479 = module0141.$g1677$.currentBinding(var459);
                                            final SubLObject var22_480 = module0138.$g1619$.currentBinding(var459);
                                            final SubLObject var37_482 = module0141.$g1674$.currentBinding(var459);
                                            try {
                                                module0141.$g1677$.bind(module0141.f9208(), var459);
                                                module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), var469), var459);
                                                module0141.$g1674$.bind((SubLObject)module0763.NIL, var459);
                                                module0249.f16055(var470, (SubLObject)module0763.UNPROVIDED);
                                                for (var473 = (SubLObject)ConsesLow.list(var463, module0141.f9195()); module0763.NIL != var473 && module0763.NIL == var466; var473 = module0056.f4150(var472)) {
                                                    final SubLObject var472_485 = var473.first();
                                                    final SubLObject var482 = conses_high.second(var473);
                                                    SubLObject var483 = var472_485;
                                                    final SubLObject var3_480 = module0141.$g1674$.currentBinding(var459);
                                                    try {
                                                        module0141.$g1674$.bind(var482, var459);
                                                        final SubLObject var484 = var482;
                                                        if (module0763.NIL == module0055.f4028(var483, var464, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED)) {
                                                            if (module0763.NIL != var484) {
                                                                if (module0763.NIL != module0578.f35470((SubLObject)module0763.ONE_INTEGER)) {
                                                                    PrintLow.format((SubLObject)module0763.T, (SubLObject)module0763.$ic203$, var483);
                                                                }
                                                                var483 = (SubLObject)ConsesLow.list((SubLObject)module0763.$ic198$, var483);
                                                            }
                                                            module0055.f4021(var483, var464);
                                                            if (module0055.f4016(var464).numGE(var465)) {
                                                                var466 = (SubLObject)module0763.T;
                                                            }
                                                        }
                                                        final SubLObject var485 = module0200.f12443(var469);
                                                        SubLObject var486;
                                                        SubLObject var487;
                                                        SubLObject var3_481;
                                                        SubLObject var22_481;
                                                        SubLObject var488;
                                                        SubLObject var489;
                                                        SubLObject var490;
                                                        SubLObject var491;
                                                        SubLObject var53_490;
                                                        SubLObject var492;
                                                        SubLObject var3_482;
                                                        SubLObject var52_492;
                                                        SubLObject var493;
                                                        SubLObject var494;
                                                        SubLObject var3_483;
                                                        SubLObject var495;
                                                        SubLObject var496;
                                                        SubLObject var497;
                                                        SubLObject var498;
                                                        SubLObject var499;
                                                        SubLObject var500;
                                                        SubLObject var501;
                                                        SubLObject var502;
                                                        SubLObject var255_495;
                                                        SubLObject var503;
                                                        SubLObject var3_484;
                                                        SubLObject var505;
                                                        SubLObject var504;
                                                        SubLObject var506;
                                                        SubLObject var507;
                                                        SubLObject var508;
                                                        SubLObject var509;
                                                        SubLObject var510;
                                                        SubLObject var511;
                                                        for (var486 = (SubLObject)module0763.NIL, var486 = var485; module0763.NIL == var466 && module0763.NIL != var486; var486 = var486.rest()) {
                                                            var487 = var486.first();
                                                            var3_481 = module0137.$g1605$.currentBinding(var459);
                                                            var22_481 = module0141.$g1674$.currentBinding(var459);
                                                            try {
                                                                module0137.$g1605$.bind(var487, var459);
                                                                module0141.$g1674$.bind((SubLObject)((module0763.NIL != module0141.f9205((SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0763.NIL == module0141.$g1674$.getDynamicValue(var459)) : module0141.$g1674$.getDynamicValue(var459)), var459);
                                                                var488 = module0228.f15229(var472_485);
                                                                if (module0763.NIL != module0138.f8992(var488)) {
                                                                    var489 = module0242.f15664(var488, module0137.f8955((SubLObject)module0763.UNPROVIDED));
                                                                    if (module0763.NIL != var489) {
                                                                        var490 = module0245.f15834(var489, module0138.f8979(), module0137.f8955((SubLObject)module0763.UNPROVIDED));
                                                                        if (module0763.NIL != var490) {
                                                                            for (var491 = module0066.f4838(module0067.f4891(var490)); module0763.NIL == var466 && module0763.NIL == module0066.f4841(var491); var491 = module0066.f4840(var491)) {
                                                                                var459.resetMultipleValues();
                                                                                var53_490 = module0066.f4839(var491);
                                                                                var492 = var459.secondMultipleValue();
                                                                                var459.resetMultipleValues();
                                                                                if (module0763.NIL != module0147.f9507(var53_490)) {
                                                                                    var3_482 = module0138.$g1623$.currentBinding(var459);
                                                                                    try {
                                                                                        module0138.$g1623$.bind(var53_490, var459);
                                                                                        for (var52_492 = module0066.f4838(module0067.f4891(var492)); module0763.NIL == var466 && module0763.NIL == module0066.f4841(var52_492); var52_492 = module0066.f4840(var52_492)) {
                                                                                            var459.resetMultipleValues();
                                                                                            var493 = module0066.f4839(var52_492);
                                                                                            var494 = var459.secondMultipleValue();
                                                                                            var459.resetMultipleValues();
                                                                                            if (module0763.NIL != module0141.f9289(var493)) {
                                                                                                var3_483 = module0138.$g1624$.currentBinding(var459);
                                                                                                try {
                                                                                                    module0138.$g1624$.bind(var493, var459);
                                                                                                    var495 = var494;
                                                                                                    if (module0763.NIL != module0077.f5302(var495)) {
                                                                                                        var496 = module0077.f5333(var495);
                                                                                                        for (var497 = module0032.f1741(var496), var498 = (SubLObject)module0763.NIL, var498 = module0032.f1742(var497, var496); module0763.NIL == var466 && module0763.NIL == module0032.f1744(var497, var498); var498 = module0032.f1743(var498)) {
                                                                                                            var499 = module0032.f1745(var497, var498);
                                                                                                            if (module0763.NIL != module0032.f1746(var498, var499) && module0763.NIL == module0249.f16059(var499, (SubLObject)module0763.UNPROVIDED)) {
                                                                                                                module0249.f16055(var499, (SubLObject)module0763.UNPROVIDED);
                                                                                                                module0056.f4149((SubLObject)ConsesLow.list(var499, module0141.f9195()), var472);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    else if (var495.isList()) {
                                                                                                        if (module0763.NIL == var466) {
                                                                                                            var500 = var495;
                                                                                                            var501 = (SubLObject)module0763.NIL;
                                                                                                            var501 = var500.first();
                                                                                                            while (module0763.NIL == var466 && module0763.NIL != var500) {
                                                                                                                if (module0763.NIL == module0249.f16059(var501, (SubLObject)module0763.UNPROVIDED)) {
                                                                                                                    module0249.f16055(var501, (SubLObject)module0763.UNPROVIDED);
                                                                                                                    module0056.f4149((SubLObject)ConsesLow.list(var501, module0141.f9195()), var472);
                                                                                                                }
                                                                                                                var500 = var500.rest();
                                                                                                                var501 = var500.first();
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    else {
                                                                                                        Errors.error((SubLObject)module0763.$ic22$, var495);
                                                                                                    }
                                                                                                }
                                                                                                finally {
                                                                                                    module0138.$g1624$.rebind(var3_483, var459);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        module0066.f4842(var52_492);
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1623$.rebind(var3_482, var459);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var491);
                                                                        }
                                                                    }
                                                                    else {
                                                                        module0136.f8870((SubLObject)module0763.FIVE_INTEGER, (SubLObject)module0763.$ic23$, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
                                                                    }
                                                                }
                                                                else if (module0763.NIL != module0155.f9785(var488, (SubLObject)module0763.UNPROVIDED)) {
                                                                    var502 = ((module0763.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var459), module0137.f8955((SubLObject)module0763.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var459), module0137.f8955((SubLObject)module0763.UNPROVIDED)));
                                                                    for (var255_495 = (SubLObject)module0763.NIL, var255_495 = var502; module0763.NIL == var466 && module0763.NIL != var255_495; var255_495 = var255_495.rest()) {
                                                                        var503 = var255_495.first();
                                                                        var3_484 = module0138.$g1625$.currentBinding(var459);
                                                                        try {
                                                                            module0138.$g1625$.bind(var503, var459);
                                                                            var504 = (var505 = Functions.funcall(var503, var488));
                                                                            if (module0763.NIL != module0077.f5302(var505)) {
                                                                                var506 = module0077.f5333(var505);
                                                                                for (var507 = module0032.f1741(var506), var508 = (SubLObject)module0763.NIL, var508 = module0032.f1742(var507, var506); module0763.NIL == var466 && module0763.NIL == module0032.f1744(var507, var508); var508 = module0032.f1743(var508)) {
                                                                                    var509 = module0032.f1745(var507, var508);
                                                                                    if (module0763.NIL != module0032.f1746(var508, var509) && module0763.NIL == module0249.f16059(var509, (SubLObject)module0763.UNPROVIDED)) {
                                                                                        module0249.f16055(var509, (SubLObject)module0763.UNPROVIDED);
                                                                                        module0056.f4149((SubLObject)ConsesLow.list(var509, module0141.f9195()), var472);
                                                                                    }
                                                                                }
                                                                            }
                                                                            else if (var505.isList()) {
                                                                                if (module0763.NIL == var466) {
                                                                                    var510 = var505;
                                                                                    var511 = (SubLObject)module0763.NIL;
                                                                                    var511 = var510.first();
                                                                                    while (module0763.NIL == var466 && module0763.NIL != var510) {
                                                                                        if (module0763.NIL == module0249.f16059(var511, (SubLObject)module0763.UNPROVIDED)) {
                                                                                            module0249.f16055(var511, (SubLObject)module0763.UNPROVIDED);
                                                                                            module0056.f4149((SubLObject)ConsesLow.list(var511, module0141.f9195()), var472);
                                                                                        }
                                                                                        var510 = var510.rest();
                                                                                        var511 = var510.first();
                                                                                    }
                                                                                }
                                                                            }
                                                                            else {
                                                                                Errors.error((SubLObject)module0763.$ic22$, var505);
                                                                            }
                                                                        }
                                                                        finally {
                                                                            module0138.$g1625$.rebind(var3_484, var459);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            finally {
                                                                module0141.$g1674$.rebind(var22_481, var459);
                                                                module0137.$g1605$.rebind(var3_481, var459);
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        module0141.$g1674$.rebind(var3_480, var459);
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var37_482, var459);
                                                module0138.$g1619$.rebind(var22_480, var459);
                                                module0141.$g1677$.rebind(var3_479, var459);
                                            }
                                        }
                                        else {
                                            module0136.f8872((SubLObject)module0763.TWO_INTEGER, (SubLObject)module0763.$ic25$, var463, module0244.f15748(module0137.f8955((SubLObject)module0763.UNPROVIDED)), (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
                                        }
                                    }
                                    finally {
                                        module0137.$g1605$.rebind(var481, var459);
                                        module0141.$g1674$.rebind(var480, var459);
                                        module0141.$g1672$.rebind(var37_481, var459);
                                        module0141.$g1671$.rebind(var22_479, var459);
                                        module0141.$g1670$.rebind(var3_478, var459);
                                    }
                                }
                                finally {
                                    module0141.$g1715$.rebind(var22_478, var459);
                                    module0141.$g1714$.rebind(var3_477, var459);
                                }
                            }
                            finally {
                                module0147.$g2096$.rebind(var477, var459);
                                module0147.$g2094$.rebind(var476, var459);
                                module0147.$g2095$.rebind(var3_476, var459);
                            }
                            module0139.f9011(module0139.$g1635$.getDynamicValue(var459));
                        }
                        finally {
                            module0139.$g1635$.rebind(var474, var459);
                        }
                    }
                }
                else {
                    final SubLObject var512 = Sort.sort(module0751.f47077(var463), (SubLObject)module0763.$ic204$, (SubLObject)module0763.UNPROVIDED);
                    if (module0763.NIL == var466) {
                        SubLObject var513 = var512;
                        SubLObject var514 = (SubLObject)module0763.NIL;
                        var514 = var513.first();
                        while (module0763.NIL == var466 && module0763.NIL != var513) {
                            if (module0763.NIL == module0055.f4028(var514, var464, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED)) {
                                module0055.f4021(var514, var464);
                                if (module0055.f4016(var464).numGE(var465)) {
                                    var466 = (SubLObject)module0763.T;
                                }
                            }
                            var513 = var513.rest();
                            var514 = var513.first();
                        }
                    }
                }
            }
        }
        if (module0763.NIL != module0578.f35470((SubLObject)module0763.ONE_INTEGER)) {
            PrintLow.format((SubLObject)module0763.T, (SubLObject)module0763.$ic205$, module0055.f4020(var464));
        }
        module0055.f4018(module0749.f46532(var458));
        f48354(var458);
        module0055.f4018(module0749.f46533(var458));
        f48355(var458);
        return var458;
    }
    
    public static SubLObject f48355(final SubLObject var458) {
        final SubLObject var459 = f48356(var458);
        SubLObject var460 = module0055.f4023(var459);
        final SubLObject var461 = module0749.f46523(var458);
        final SubLObject var462 = f48357(var460);
        final SubLObject var463 = (SubLObject)((module0763.NIL != var462) ? module0763.NIL : f48358());
        final SubLObject var464 = module0749.f46533(var458);
        SubLObject var465 = (SubLObject)module0763.NIL;
        if (var460.isList() && module0763.$ic198$ == var460.first()) {
            var465 = (SubLObject)module0763.T;
            var460 = conses_high.second(var460);
        }
        if (module0763.NIL != var462 && module0763.NIL != module0578.f35470((SubLObject)module0763.ONE_INTEGER)) {
            PrintLow.format((SubLObject)module0763.T, (SubLObject)module0763.$ic206$);
        }
        if (module0763.NIL != module0077.f5302(var460)) {
            final SubLObject var466 = f48346(module0035.remove_if_not((SubLObject)module0763.$ic207$, module0077.f5312(var460), (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED));
            if (module0763.NIL != module0578.f35470((SubLObject)module0763.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0763.T, (SubLObject)module0763.$ic208$, var466);
            }
            SubLObject var467 = var466;
            SubLObject var468 = (SubLObject)module0763.NIL;
            var468 = var467.first();
            while (module0763.NIL != var467) {
                if (module0763.NIL == var462 && (module0763.NIL != f48347(var468, var461) || module0763.NIL == module0765.f48722(module0749.f46348(var468), module0749.f46525(var458)))) {
                    module0077.f5326(var468, var463);
                }
                else {
                    module0055.f4021((SubLObject)((module0763.NIL != var465) ? ConsesLow.list((SubLObject)module0763.$ic198$, var468) : var468), var464);
                }
                var467 = var467.rest();
                var468 = var467.first();
            }
            if (module0763.NIL == var462 && module0763.NIL == f48359(var463)) {
                if (module0763.NIL != module0578.f35470((SubLObject)module0763.ONE_INTEGER)) {
                    PrintLow.format((SubLObject)module0763.T, (SubLObject)module0763.$ic209$, module0077.f5312(var463));
                }
                module0055.f4021(var463, var459);
            }
            if (module0763.NIL != module0055.f4019(var464)) {
                if (module0763.NIL != module0578.f35470((SubLObject)module0763.ONE_INTEGER)) {
                    PrintLow.format((SubLObject)module0763.T, (SubLObject)module0763.$ic210$, module0077.f5312(var460));
                }
                f48355(var458);
            }
        }
        else if (module0763.$ic194$ == var460) {
            if (module0763.NIL != module0578.f35470((SubLObject)module0763.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0763.T, (SubLObject)module0763.$ic211$, var461);
            }
            module0055.f4021((SubLObject)module0763.$ic194$, var464);
        }
        return var464;
    }
    
    public static SubLObject f48358() {
        return module0078.f5369((SubLObject)module0763.$ic212$, (SubLObject)module0763.UNPROVIDED);
    }
    
    public static SubLObject f48357(final SubLObject var249) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0763.NIL != module0077.f5302(var249) && module0763.NIL != module0077.f5320((SubLObject)module0763.$ic212$, var249));
    }
    
    public static SubLObject f48359(final SubLObject var501) {
        return Numbers.numLE(module0077.f5311(var501), (SubLObject)module0763.ONE_INTEGER);
    }
    
    public static SubLObject f48354(final SubLObject var458) {
        final SubLThread var459 = SubLProcess.currentSubLThread();
        SubLObject var460 = module0055.f4023(f48360(var458));
        final SubLObject var461 = module0749.f46532(var458);
        SubLObject var462 = (SubLObject)module0763.NIL;
        if (module0763.NIL != var460) {
            if (module0763.NIL != module0578.f35470((SubLObject)module0763.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0763.T, (SubLObject)module0763.$ic213$, var460);
            }
            if (var460.isList() && module0763.$ic198$ == var460.first()) {
                var462 = (SubLObject)module0763.T;
                var460 = conses_high.second(var460);
            }
            final SubLObject var463 = module0749.f46523(var458);
            final SubLObject var464 = module0579.$g4333$.currentBinding(var459);
            try {
                module0579.$g4333$.bind(var463, var459);
                SubLObject var465 = (SubLObject)module0763.NIL;
                SubLObject var466 = (SubLObject)module0763.NIL;
                try {
                    var459.throwStack.push(module0763.$ic214$);
                    final SubLObject var3_507 = Errors.$error_handler$.currentBinding(var459);
                    try {
                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0763.$ic215$), var459);
                        try {
                            var465 = module0749.f46534(var458);
                        }
                        catch (Throwable var467) {
                            Errors.handleThrowable(var467, (SubLObject)module0763.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(var3_507, var459);
                    }
                }
                catch (Throwable var468) {
                    var466 = Errors.handleThrowable(var468, (SubLObject)module0763.$ic214$);
                }
                finally {
                    var459.throwStack.pop();
                }
                SubLObject var469 = f48339(var460, var465, (SubLObject)module0763.UNPROVIDED);
                SubLObject var470 = (SubLObject)module0763.NIL;
                var470 = var469.first();
                while (module0763.NIL != var469) {
                    module0055.f4021((SubLObject)((module0763.NIL != var462) ? ConsesLow.list((SubLObject)module0763.$ic198$, var470) : var470), var461);
                    var469 = var469.rest();
                    var470 = var469.first();
                }
                if (module0763.NIL != f48361(var460, var463, module0749.f46527(var458))) {
                    if (module0763.NIL != module0578.f35470((SubLObject)module0763.ONE_INTEGER)) {
                        PrintLow.format((SubLObject)module0763.T, (SubLObject)module0763.$ic216$, var460);
                    }
                    module0055.f4021((SubLObject)module0763.$ic194$, var461);
                }
            }
            finally {
                module0579.$g4333$.rebind(var464, var459);
            }
        }
        return var458;
    }
    
    public static SubLObject f48352(final SubLObject var458) {
        final SubLObject var459 = module0749.f46533(var458);
        if (module0763.NIL != module0055.f4019(var459)) {
            f48355(var458);
            return module0749.f46533(var458);
        }
        return var459;
    }
    
    public static SubLObject f48356(final SubLObject var458) {
        final SubLObject var459 = module0749.f46532(var458);
        if (module0763.NIL != module0055.f4019(var459)) {
            f48354(var458);
            return module0749.f46532(var458);
        }
        return var459;
    }
    
    public static SubLObject f48360(final SubLObject var458) {
        return module0749.f46531(var458);
    }
    
    public static SubLObject f48362(final SubLObject var242, SubLObject var421, SubLObject var509, SubLObject var422) {
        if (var421 == module0763.UNPROVIDED) {
            var421 = (SubLObject)module0763.NIL;
        }
        if (var509 == module0763.UNPROVIDED) {
            var509 = (SubLObject)module0763.NIL;
        }
        if (var422 == module0763.UNPROVIDED) {
            var422 = (SubLObject)module0763.$ic149$;
        }
        final SubLThread var510 = SubLProcess.currentSubLThread();
        SubLObject var511 = (SubLObject)module0763.NIL;
        SubLObject var512 = (SubLObject)module0763.NIL;
        SubLObject var513 = (SubLObject)module0763.NIL;
        final SubLObject var514 = module0749.f46552(var242, var421, (SubLObject)module0763.NIL, var422, (SubLObject)module0763.NIL, (SubLObject)module0763.UNPROVIDED);
        while (module0763.NIL == var513 && module0763.NIL == module0749.f46551(var514)) {
            var510.resetMultipleValues();
            final SubLObject var515 = f48349(var514);
            final SubLObject var516 = var510.secondMultipleValue();
            var510.resetMultipleValues();
            if (module0763.NIL != module0756.f47497(var515, (SubLObject)module0763.UNPROVIDED)) {
                if (var515 == module0763.$ic194$) {
                    var512 = (SubLObject)module0763.$ic194$;
                    var513 = (SubLObject)module0763.T;
                }
                else if (module0763.NIL != var509) {
                    var512 = (SubLObject)ConsesLow.list(var515);
                    var513 = (SubLObject)module0763.T;
                }
                else {
                    var511 = (SubLObject)ConsesLow.cons(var515, var511);
                }
            }
        }
        module0749.f46553(var514);
        if (module0763.NIL != var513) {
            return var512;
        }
        return Sequences.nreverse(var511);
    }
    
    public static SubLObject f48332(final SubLObject var242, SubLObject var421, SubLObject var422) {
        if (var421 == module0763.UNPROVIDED) {
            var421 = (SubLObject)module0763.NIL;
        }
        if (var422 == module0763.UNPROVIDED) {
            var422 = (SubLObject)module0763.$ic149$;
        }
        final SubLObject var424;
        final SubLObject var423 = var424 = f48362(var242, var421, (SubLObject)module0763.T, var422);
        if (var424.eql((SubLObject)module0763.$ic194$) || var424.eql((SubLObject)module0763.NIL)) {
            return var423;
        }
        if (var424.eql((SubLObject)module0763.$ic217$) || var424.eql((SubLObject)module0763.$ic218$) || var424.eql((SubLObject)module0763.$ic219$)) {
            return f48362(var242, var421, (SubLObject)module0763.NIL, (SubLObject)module0763.UNPROVIDED);
        }
        return var423.first();
    }
    
    public static SubLObject f48363(final SubLObject var242, final SubLObject var148, final SubLObject var222, SubLObject var450, SubLObject var451) {
        if (var450 == module0763.UNPROVIDED) {
            var450 = (SubLObject)module0763.NIL;
        }
        if (var451 == module0763.UNPROVIDED) {
            var451 = (SubLObject)module0763.NIL;
        }
        SubLObject var452 = f48345(var242, var148, var222, var450, var451, (SubLObject)module0763.UNPROVIDED);
        if (module0763.NIL == var452 && module0763.NIL != f48361(var148, var242, (SubLObject)module0763.UNPROVIDED)) {
            var452 = (SubLObject)module0763.$ic194$;
        }
        return var452.isList() ? var452.first() : var452;
    }
    
    public static SubLObject f48361(final SubLObject var148, SubLObject var242, SubLObject var422) {
        if (var242 == module0763.UNPROVIDED) {
            var242 = (SubLObject)module0763.NIL;
        }
        if (var422 == module0763.UNPROVIDED) {
            var422 = (SubLObject)module0763.$ic149$;
        }
        final SubLThread var423 = SubLProcess.currentSubLThread();
        SubLObject var424 = (SubLObject)module0763.NIL;
        if (module0763.NIL != module0212.f13762(var148)) {
            final SubLObject var425 = module0147.f9540(module0579.$g4260$.getDynamicValue(var423));
            final SubLObject var426 = module0147.$g2095$.currentBinding(var423);
            final SubLObject var427 = module0147.$g2094$.currentBinding(var423);
            final SubLObject var428 = module0147.$g2096$.currentBinding(var423);
            try {
                module0147.$g2095$.bind(module0147.f9545(var425), var423);
                module0147.$g2094$.bind(module0147.f9546(var425), var423);
                module0147.$g2096$.bind(module0147.f9549(var425), var423);
                if (module0763.NIL == var424) {
                    SubLObject var429 = (SubLObject)module0763.$ic221$;
                    SubLObject var430 = (SubLObject)module0763.NIL;
                    var430 = var429.first();
                    while (module0763.NIL == var424 && module0763.NIL != var429) {
                        final SubLObject var3_514 = module0148.$g2099$.currentBinding(var423);
                        try {
                            module0148.$g2099$.bind((SubLObject)module0763.$ic220$, var423);
                            final SubLObject var431 = var430;
                            if (module0763.NIL != module0158.f10010(var148, (SubLObject)module0763.NIL, var431)) {
                                final SubLObject var432 = module0158.f10011(var148, (SubLObject)module0763.NIL, var431);
                                SubLObject var433 = var424;
                                final SubLObject var434 = (SubLObject)module0763.NIL;
                                while (module0763.NIL == var433) {
                                    final SubLObject var435 = module0052.f3695(var432, var434);
                                    final SubLObject var436 = (SubLObject)SubLObjectFactory.makeBoolean(!var434.eql(var435));
                                    if (module0763.NIL != var436) {
                                        SubLObject var437 = (SubLObject)module0763.NIL;
                                        try {
                                            var437 = module0158.f10316(var435, (SubLObject)module0763.$ic32$, (SubLObject)module0763.$ic36$, (SubLObject)module0763.NIL);
                                            SubLObject var133_515 = var424;
                                            final SubLObject var134_516 = (SubLObject)module0763.NIL;
                                            while (module0763.NIL == var133_515) {
                                                final SubLObject var438 = module0052.f3695(var437, var134_516);
                                                final SubLObject var136_518 = (SubLObject)SubLObjectFactory.makeBoolean(!var134_516.eql(var438));
                                                if (module0763.NIL != var136_518) {
                                                    var424 = (SubLObject)SubLObjectFactory.makeBoolean(module0763.NIL == var242 || module0763.NIL != module0765.f48549(var438, var242, var422));
                                                }
                                                var133_515 = (SubLObject)SubLObjectFactory.makeBoolean(module0763.NIL == var136_518 || module0763.NIL != var424);
                                            }
                                        }
                                        finally {
                                            final SubLObject var3_515 = Threads.$is_thread_performing_cleanupP$.currentBinding(var423);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0763.T, var423);
                                                if (module0763.NIL != var437) {
                                                    module0158.f10319(var437);
                                                }
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var3_515, var423);
                                            }
                                        }
                                    }
                                    var433 = (SubLObject)SubLObjectFactory.makeBoolean(module0763.NIL == var436 || module0763.NIL != var424);
                                }
                            }
                        }
                        finally {
                            module0148.$g2099$.rebind(var3_514, var423);
                        }
                        var429 = var429.rest();
                        var430 = var429.first();
                    }
                }
            }
            finally {
                module0147.$g2096$.rebind(var428, var423);
                module0147.$g2094$.rebind(var427, var423);
                module0147.$g2095$.rebind(var426, var423);
            }
        }
        return var424;
    }
    
    public static SubLObject f48337(final SubLObject var178, final SubLObject var242, SubLObject var222, SubLObject var426) {
        if (var222 == module0763.UNPROVIDED) {
            var222 = (SubLObject)module0763.NIL;
        }
        if (var426 == module0763.UNPROVIDED) {
            var426 = (SubLObject)module0763.NIL;
        }
        final SubLThread var427 = SubLProcess.currentSubLThread();
        if (module0763.NIL == module0756.f47497(var178, (SubLObject)module0763.UNPROVIDED)) {
            return var178;
        }
        if (module0763.NIL != module0756.f47478(var178)) {
            module0756.f47464(var178, var222);
            if (module0763.NIL == var426) {
                module0756.f47465(var178, var242);
                module0756.f47567(var178);
            }
            final SubLObject var428 = module0579.$g4331$.currentBinding(var427);
            final SubLObject var429 = module0579.$g4333$.currentBinding(var427);
            try {
                module0579.$g4331$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0763.NIL == var426), var427);
                module0579.$g4333$.bind(var242, var427);
                module0758.f47898(var178, var242, var222);
            }
            finally {
                module0579.$g4333$.rebind(var429, var427);
                module0579.$g4331$.rebind(var428, var427);
            }
            module0756.f47724(var178);
        }
        else {
            final SubLObject var430 = module0756.f47487(var178, (SubLObject)module0763.UNPROVIDED);
            if (module0763.NIL == module0762.f48210(var430)) {
                module0751.f46603(var430);
            }
            module0756.f47465(var178, var242);
            module0756.f47464(var178, var222);
            module0756.f47567(var178);
            module0756.f47745(var178, var430);
            if (module0763.NIL != var426) {
                f48364(var178, var242);
            }
        }
        return module0756.f47511(var178);
    }
    
    public static SubLObject f48365(final SubLObject var242, final SubLObject var521) {
        final SubLObject var522 = module0228.f15229(module0205.f13136(var242));
        if (module0763.NIL != var521 && !var521.eql(var522) && module0763.NIL != module0578.f35470((SubLObject)module0763.ONE_INTEGER)) {
            PrintLow.format((SubLObject)module0763.T, (SubLObject)module0763.$ic222$, var522, var521);
        }
        return (SubLObject)module0763.NIL;
    }
    
    public static SubLObject f48364(final SubLObject var178, final SubLObject var242) {
        if (var242.equal(module0756.f47487(var178, (SubLObject)module0763.UNPROVIDED))) {
            final SubLObject var243 = Sequences.cconcatenate((SubLObject)module0763.$ic0$, new SubLObject[] { module0006.f205((SubLObject)module0763.ONE_INTEGER), module0763.$ic1$, module0006.f203((SubLObject)module0763.$ic223$) });
            module0578.f35476(var243, (SubLObject)ConsesLow.list(var242, module0756.f47510(var178)));
        }
        return (SubLObject)module0763.NIL;
    }
    
    public static SubLObject f48366(final SubLObject var242) {
        final SubLThread var243 = SubLProcess.currentSubLThread();
        SubLObject var244 = f48367(module0205.f13136(var242), module0579.$g4260$.getDynamicValue(var243));
        SubLObject var245 = (SubLObject)module0763.NIL;
        var245 = var244.first();
        while (module0763.NIL != var244) {
            if (module0763.NIL != module0751.f47151(var245, module0205.f13207(var242, (SubLObject)module0763.UNPROVIDED)) && module0763.NIL != f48368(var245)) {
                return (SubLObject)module0763.T;
            }
            var244 = var244.rest();
            var245 = var244.first();
        }
        return (SubLObject)module0763.NIL;
    }
    
    public static SubLObject f48369(final SubLObject var148, final SubLObject var465) {
        final SubLThread var466 = SubLProcess.currentSubLThread();
        SubLObject var467 = (SubLObject)module0763.NIL;
        final SubLObject var468 = module0147.f9540(var465);
        final SubLObject var469 = module0147.$g2095$.currentBinding(var466);
        final SubLObject var470 = module0147.$g2094$.currentBinding(var466);
        final SubLObject var471 = module0147.$g2096$.currentBinding(var466);
        try {
            module0147.$g2095$.bind(module0147.f9545(var468), var466);
            module0147.$g2094$.bind(module0147.f9546(var468), var466);
            module0147.$g2096$.bind(module0147.f9549(var468), var466);
            var467 = module0219.f14510(var148, (SubLObject)module0763.ONE_INTEGER, module0763.$ic157$, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
        }
        finally {
            module0147.$g2096$.rebind(var471, var466);
            module0147.$g2094$.rebind(var470, var466);
            module0147.$g2095$.rebind(var469, var466);
        }
        return var467;
    }
    
    public static SubLObject f48367(final SubLObject var148, final SubLObject var465) {
        final SubLThread var466 = SubLProcess.currentSubLThread();
        final SubLObject var467 = module0034.$g879$.getDynamicValue(var466);
        SubLObject var468 = (SubLObject)module0763.NIL;
        if (module0763.NIL == var467) {
            return f48369(var148, var465);
        }
        var468 = module0034.f1857(var467, (SubLObject)module0763.$ic224$, (SubLObject)module0763.UNPROVIDED);
        if (module0763.NIL == var468) {
            var468 = module0034.f1807(module0034.f1842(var467), (SubLObject)module0763.$ic224$, (SubLObject)module0763.TWO_INTEGER, (SubLObject)module0763.$ic225$, (SubLObject)module0763.EQL, (SubLObject)module0763.UNPROVIDED);
            module0034.f1860(var467, (SubLObject)module0763.$ic224$, var468);
        }
        final SubLObject var469 = module0034.f1782(var148, var465);
        final SubLObject var470 = module0034.f1814(var468, var469, (SubLObject)module0763.UNPROVIDED);
        if (var470 != module0763.$ic48$) {
            SubLObject var471 = var470;
            SubLObject var472 = (SubLObject)module0763.NIL;
            var472 = var471.first();
            while (module0763.NIL != var471) {
                SubLObject var473 = var472.first();
                final SubLObject var474 = conses_high.second(var472);
                if (var148.eql(var473.first())) {
                    var473 = var473.rest();
                    if (module0763.NIL != var473 && module0763.NIL == var473.rest() && var465.eql(var473.first())) {
                        return module0034.f1959(var474);
                    }
                }
                var471 = var471.rest();
                var472 = var471.first();
            }
        }
        final SubLObject var475 = Values.arg2(var466.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f48369(var148, var465)));
        module0034.f1836(var468, var469, var470, var475, (SubLObject)ConsesLow.list(var148, var465));
        return module0034.f1959(var475);
    }
    
    public static SubLObject f48368(final SubLObject var140) {
        final SubLObject var141 = module0751.f46599();
        SubLObject var142 = (SubLObject)module0763.NIL;
        if (module0763.NIL != var141) {
            SubLObject var143 = Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)module0763.ONE_INTEGER), module0765.f48550(var140));
            final SubLObject var144 = module0178.f11334(var140);
            final SubLObject var145 = module0751.f47155(var144);
            var143 = module0765.f48551(var143, var145);
            SubLObject var146;
            for (var146 = (SubLObject)module0763.NIL, var146 = (SubLObject)module0763.ONE_INTEGER; !var146.numG(var145) && module0763.NIL == var142; var146 = module0048.f_1X(var146)) {}
            if (module0763.NIL == module0004.f104(var146, var143, Symbols.symbol_function((SubLObject)module0763.EQL), Symbols.symbol_function((SubLObject)module0763.$ic226$))) {
                var142 = (SubLObject)module0763.T;
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0763.NIL == var142);
    }
    
    public static SubLObject f48370(final SubLObject var534) {
        final SubLThread var535 = SubLProcess.currentSubLThread();
        SubLObject var536 = (SubLObject)module0763.NIL;
        final SubLObject var537 = module0147.f9540(module0579.$g4260$.getDynamicValue(var535));
        final SubLObject var538 = module0147.$g2095$.currentBinding(var535);
        final SubLObject var539 = module0147.$g2094$.currentBinding(var535);
        final SubLObject var540 = module0147.$g2096$.currentBinding(var535);
        try {
            module0147.$g2095$.bind(module0147.f9545(var537), var535);
            module0147.$g2094$.bind(module0147.f9546(var537), var535);
            module0147.$g2096$.bind(module0147.f9549(var537), var535);
            var536 = module0220.f14544(var534, module0763.$ic227$, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
        }
        finally {
            module0147.$g2096$.rebind(var540, var535);
            module0147.$g2094$.rebind(var539, var535);
            module0147.$g2095$.rebind(var538, var535);
        }
        return var536;
    }
    
    public static SubLObject f48348(final SubLObject var164, final SubLObject var242, final SubLObject var450, final SubLObject var535, final SubLObject var422) {
        if (module0763.NIL == f48371(var164, var242, var450, var422)) {
            return (SubLObject)module0763.$ic228$;
        }
        final SubLObject var536 = f48372(var164, var450);
        if (module0763.NIL != module0765.f48722(var536, var535)) {
            return var536;
        }
        if (module0763.NIL == var535 || module0763.NIL == module0259.f16891(module0205.f13132(var242), module0763.$ic229$)) {
            module0756.f47630(var536, (SubLObject)module0763.TWO_INTEGER, (SubLObject)module0763.UNPROVIDED);
            if (module0763.NIL != module0578.f35470((SubLObject)module0763.ONE_INTEGER) && module0763.NIL == module0578.f35477()) {
                Errors.warn((SubLObject)module0763.$ic232$, var535);
            }
            return var536;
        }
        if (module0763.NIL != module0578.f35470((SubLObject)module0763.TWO_INTEGER)) {
            PrintLow.format((SubLObject)module0763.T, (SubLObject)module0763.$ic230$, module0205.f13132(var242));
        }
        final SubLObject var537 = f48372(var164, (SubLObject)SubLObjectFactory.makeBoolean(module0763.NIL == var450));
        if (module0763.NIL != module0765.f48722(var537, var535)) {
            if (module0763.NIL != module0578.f35470((SubLObject)module0763.TWO_INTEGER)) {
                PrintLow.format((SubLObject)module0763.T, (SubLObject)module0763.$ic231$, module0205.f13132(module0756.f47487(var536, (SubLObject)module0763.UNPROVIDED)));
            }
            return var537;
        }
        return (SubLObject)module0763.NIL;
    }
    
    public static SubLObject f48373() {
        final SubLObject var160 = module0763.$g6112$.getGlobalValue();
        if (module0763.NIL != var160) {
            module0034.f1818(var160);
        }
        return (SubLObject)module0763.NIL;
    }
    
    public static SubLObject f48374(final SubLObject var164) {
        return module0034.f1829(module0763.$g6112$.getGlobalValue(), (SubLObject)ConsesLow.list(var164), (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
    }
    
    public static SubLObject f48375(final SubLObject var164) {
        return module0756.f47517(module0749.f46348(var164));
    }
    
    public static SubLObject f48376(final SubLObject var164) {
        SubLObject var165 = module0763.$g6112$.getGlobalValue();
        if (module0763.NIL == var165) {
            var165 = module0034.f1934((SubLObject)module0763.$ic192$, (SubLObject)module0763.$ic233$, (SubLObject)module0763.$ic234$, (SubLObject)module0763.EQL, (SubLObject)module0763.ONE_INTEGER, (SubLObject)module0763.ZERO_INTEGER);
        }
        SubLObject var166 = module0034.f1814(var165, var164, (SubLObject)module0763.$ic48$);
        if (var166 == module0763.$ic48$) {
            var166 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f48375(var164)));
            module0034.f1816(var165, var164, var166, (SubLObject)module0763.UNPROVIDED);
        }
        return module0034.f1959(var166);
    }
    
    public static SubLObject f48377(final SubLObject var164) {
        return module0035.sublisp_boolean(module0749.f46365(var164));
    }
    
    public static SubLObject f48372(final SubLObject var164, final SubLObject var450) {
        final SubLObject var451 = module0749.f46348(var164);
        SubLObject var452 = (SubLObject)module0763.NIL;
        if (module0763.NIL != module0756.f47497(var451, (SubLObject)module0763.UNPROVIDED)) {
            var452 = module0756.f47484(var451, (SubLObject)module0763.NIL, (SubLObject)module0763.T);
            if (module0763.NIL != var450) {
                module0758.f48034(var452);
            }
            module0756.f47799(var451, (SubLObject)module0763.UNPROVIDED);
        }
        return var452;
    }
    
    public static SubLObject f48371(final SubLObject var164, final SubLObject var242, final SubLObject var450, SubLObject var422) {
        if (var422 == module0763.UNPROVIDED) {
            var422 = (SubLObject)module0763.$ic149$;
        }
        final SubLThread var451 = SubLProcess.currentSubLThread();
        final SubLObject var452 = module0749.f46348(var164);
        if (module0763.NIL == module0751.f47007(module0579.$g4260$.getDynamicValue(var451), module0749.f46367(var164))) {
            if (module0763.NIL != module0578.f35470((SubLObject)module0763.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0763.T, (SubLObject)module0763.$ic235$, module0749.f46367(var164), module0579.$g4260$.getDynamicValue(var451));
            }
            return (SubLObject)module0763.NIL;
        }
        if (module0763.NIL == f48378(var452, var422)) {
            if (module0763.NIL != module0578.f35470((SubLObject)module0763.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0763.T, (SubLObject)module0763.$ic236$, module0756.f47815(var452), var422);
            }
            return (SubLObject)module0763.NIL;
        }
        if (module0763.NIL == f48377(var164)) {
            return (SubLObject)module0763.T;
        }
        return f48379(var164, var242, var450);
    }
    
    public static SubLObject f48378(final SubLObject var178, final SubLObject var422) {
        if (module0763.$ic149$.eql(var422)) {
            return (SubLObject)module0763.T;
        }
        if (module0763.NIL != module0758.f47984(var178) || module0763.NIL != module0758.f47983(var178)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0763.NIL != module0751.f47099(module0756.f47815(var178), (SubLObject)module0763.$ic237$, (SubLObject)module0763.UNPROVIDED));
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0763.NIL != module0751.f47099(module0756.f47815(var178), var422, (SubLObject)module0763.UNPROVIDED));
    }
    
    public static SubLObject f48379(final SubLObject var164, final SubLObject var242, final SubLObject var450) {
        final SubLThread var451 = SubLProcess.currentSubLThread();
        final SubLObject var452 = module0749.f46365(var164);
        SubLObject var453 = module0751.f46672(var452, var242);
        if (module0763.NIL != var450) {
            var453 = module0751.f47150(var453);
        }
        final SubLObject var454 = (SubLObject)((module0763.NIL != module0232.f15323(var453)) ? module0751.f46841(var453) : ((module0763.NIL != module0751.f46848(var453, module0579.$g4262$.getDynamicValue(var451), (SubLObject)module0763.UNPROVIDED)) ? module0763.$ic36$ : module0763.$ic238$));
        return Equality.eq(var454, (SubLObject)module0763.$ic36$);
    }
    
    public static SubLObject f48347(final SubLObject var164, final SubLObject var242) {
        if (module0763.NIL != module0751.f46599() && module0763.NIL != module0578.f35470((SubLObject)module0763.ONE_INTEGER)) {
            PrintLow.format((SubLObject)module0763.T, (SubLObject)module0763.$ic239$, module0756.f47510(module0749.f46348(var164)), module0751.f46599());
        }
        if (module0763.NIL != f48366(var242) && module0763.NIL == f48377(var164)) {
            if (module0763.NIL != module0578.f35470((SubLObject)module0763.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0763.T, (SubLObject)module0763.$ic240$);
            }
            return (SubLObject)module0763.T;
        }
        if (module0763.NIL == var242 || (module0763.NIL == module0751.f46599() && module0763.NIL == module0579.f35498())) {
            return (SubLObject)module0763.NIL;
        }
        final SubLObject var243 = module0749.f46348(var164);
        if (module0763.NIL != module0751.f46606((SubLObject)module0763.ZERO_INTEGER) || module0763.NIL != module0579.f35498()) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0763.NIL == f48380(var243, var242));
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0763.NIL == f48381(var243, var242));
    }
    
    public static SubLObject f48380(final SubLObject var178, final SubLObject var242) {
        return f48382(var178, var242, (SubLObject)module0763.T);
    }
    
    public static SubLObject f48381(final SubLObject var178, final SubLObject var242) {
        return f48382(var178, var242, (SubLObject)module0763.NIL);
    }
    
    public static SubLObject f48382(final SubLObject var178, final SubLObject var242, final SubLObject var542) {
        SubLObject var543 = (SubLObject)module0763.NIL;
        SubLObject var544 = (SubLObject)module0763.NIL;
        var543 = (SubLObject)module0763.ONE_INTEGER;
        var544 = module0303.f20123(var543);
        while (!var543.numG(module0202.f12725(var242, (SubLObject)module0763.UNPROVIDED))) {
            final SubLObject var545 = (SubLObject)SubLObjectFactory.makeBoolean(module0763.NIL == var542 && module0763.NIL == module0751.f46606(var543));
            final SubLObject var546 = (SubLObject)SubLObjectFactory.makeBoolean(module0763.NIL != var545 || module0763.NIL != f48383(var178, var544));
            if (module0763.NIL == var546) {
                if (module0763.NIL != module0578.f35470((SubLObject)module0763.ONE_INTEGER)) {
                    PrintLow.format((SubLObject)module0763.T, (SubLObject)module0763.$ic241$, var544);
                }
                return (SubLObject)module0763.NIL;
            }
            var543 = module0048.f_1X(var543);
            var544 = module0303.f20123(var543);
        }
        return (SubLObject)module0763.T;
    }
    
    public static SubLObject f48383(final SubLObject var178, final SubLObject var268) {
        SubLObject var269 = (SubLObject)module0763.NIL;
        if (module0763.NIL != module0756.f47552(var178)) {
            var269 = module0756.f47597(var178, var268);
        }
        else if (module0763.NIL != module0756.f47478(var178)) {
            SubLObject var270 = (SubLObject)module0763.ZERO_INTEGER;
            if (module0743.f45996(var178).isVector()) {
                final SubLObject var271 = module0743.f45996(var178);
                final SubLObject var272 = (SubLObject)module0763.NIL;
                SubLObject var273;
                SubLObject var274;
                SubLObject var275;
                SubLObject var276;
                for (var273 = Sequences.length(var271), var274 = (SubLObject)module0763.NIL, var274 = (SubLObject)module0763.ZERO_INTEGER; var274.numL(var273); var274 = Numbers.add(var274, (SubLObject)module0763.ONE_INTEGER)) {
                    var275 = ((module0763.NIL != var272) ? Numbers.subtract(var273, var274, (SubLObject)module0763.ONE_INTEGER) : var274);
                    var276 = Vectors.aref(var271, var275);
                    if (module0763.NIL == var269) {
                        if (module0763.NIL == module0756.f47829(var276, var178)) {
                            var269 = f48383(var276, var268);
                        }
                    }
                    var270 = Numbers.add(var270, (SubLObject)module0763.ONE_INTEGER);
                }
            }
        }
        else if (module0763.NIL != module0205.f13220(var268, module0756.f47487(var178, (SubLObject)module0763.UNPROVIDED), (SubLObject)module0763.NIL, Symbols.symbol_function((SubLObject)module0763.EQUAL), (SubLObject)module0763.UNPROVIDED)) {
            var269 = (SubLObject)module0763.T;
        }
        else if (module0763.NIL != module0751.f46788(var268) && module0763.NIL != f48384(var178, module0751.f46825(var268))) {
            var269 = (SubLObject)module0763.T;
        }
        return var269;
    }
    
    public static SubLObject f48384(final SubLObject var178, final SubLObject var283) {
        SubLObject var285;
        final SubLObject var284 = var285 = module0756.f47467(var178);
        SubLObject var286 = (SubLObject)module0763.NIL;
        var286 = var285.first();
        while (module0763.NIL != var285) {
            if (var283.equal(module0749.f46462(var286))) {
                return (SubLObject)module0763.T;
            }
            var285 = var285.rest();
            var286 = var285.first();
        }
        return (SubLObject)module0763.NIL;
    }
    
    public static SubLObject f48385(final SubLObject var242) {
        final SubLObject var243 = module0205.f13132(var242);
        SubLObject var244 = (SubLObject)module0763.NIL;
        if (module0763.NIL == var244) {
            SubLObject var245 = f48241(var243, (SubLObject)module0763.UNPROVIDED);
            SubLObject var246 = (SubLObject)module0763.NIL;
            var246 = var245.first();
            while (module0763.NIL == var244 && module0763.NIL != var245) {
                final SubLObject var247 = module0077.f5333(var246);
                SubLObject var248;
                SubLObject var249;
                SubLObject var250;
                for (var248 = module0032.f1741(var247), var249 = (SubLObject)module0763.NIL, var249 = module0032.f1742(var248, var247); module0763.NIL == var244 && module0763.NIL == module0032.f1744(var248, var249); var249 = module0032.f1743(var249)) {
                    var250 = module0032.f1745(var248, var249);
                    if (module0763.NIL != module0032.f1746(var249, var250)) {
                        var244 = (SubLObject)SubLObjectFactory.makeBoolean(module0763.NIL != f48377(var250) && module0763.NIL != f48371(var250, var242, (SubLObject)module0763.NIL, (SubLObject)module0763.UNPROVIDED));
                    }
                }
                var245 = var245.rest();
                var246 = var245.first();
            }
        }
        return var244;
    }
    
    public static SubLObject f48386(final SubLObject var547) {
        final SubLThread var548 = SubLProcess.currentSubLThread();
        return module0293.f19713(var547, module0579.$g4260$.getDynamicValue(var548), (SubLObject)module0763.$ic242$);
    }
    
    public static SubLObject f48319(final SubLObject var547) {
        final SubLThread var548 = SubLProcess.currentSubLThread();
        var548.resetMultipleValues();
        final SubLObject var549 = f48386(var547);
        final SubLObject var550 = var548.secondMultipleValue();
        var548.resetMultipleValues();
        return (module0763.NIL == var550 || module0763.NIL != f48269(var549, (SubLObject)module0763.UNPROVIDED)) ? Values.values(var547, (SubLObject)module0763.NIL) : Values.values(var549, var550);
    }
    
    public static SubLObject f48320(final SubLObject var171) {
        SubLObject var172 = var171;
        SubLObject var173 = (SubLObject)module0763.NIL;
        SubLObject var174 = (SubLObject)module0763.NIL;
        try {
            for (var174 = module0361.f24136((SubLObject)module0763.$ic243$); module0763.NIL == Sequences.find(var172, var173, Symbols.symbol_function((SubLObject)module0763.EQUAL), (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED); var173 = (SubLObject)ConsesLow.cons(var172, var173), var172 = f48387(var172, var174)) {}
        }
        finally {
            final SubLObject var175 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0763.T);
                module0361.f24005(var174);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var175);
            }
        }
        return var172;
    }
    
    public static SubLObject f48387(final SubLObject var171, SubLObject var552) {
        if (var552 == module0763.UNPROVIDED) {
            var552 = (SubLObject)module0763.NIL;
        }
        final SubLThread var553 = SubLProcess.currentSubLThread();
        final SubLObject var554 = f48388(var171, module0579.$g4260$.getDynamicValue(var553), var552).first();
        if (module0763.NIL != var554) {
            Errors.warn((SubLObject)module0763.$ic244$, var171, var554);
        }
        return (module0763.NIL != var554) ? var554 : var171;
    }
    
    public static SubLObject f48388(final SubLObject var171, SubLObject var465, SubLObject var552) {
        if (var465 == module0763.UNPROVIDED) {
            var465 = module0579.$g4260$.getDynamicValue();
        }
        if (var552 == module0763.UNPROVIDED) {
            var552 = (SubLObject)module0763.NIL;
        }
        return module0751.f46868((SubLObject)ConsesLow.listS(module0763.$ic245$, var171, (SubLObject)module0763.$ic246$), var465, f48389(var552));
    }
    
    public static SubLObject f48389(final SubLObject var552) {
        SubLObject var553 = conses_high.copy_list(module0763.$g6113$.getGlobalValue());
        if (module0763.NIL != module0361.f24109(var552)) {
            var553 = conses_high.putf(var553, (SubLObject)module0763.$ic259$, var552);
        }
        else {
            var553 = conses_high.putf(var553, (SubLObject)module0763.$ic260$, (SubLObject)module0763.$ic261$);
        }
        return var553;
    }
    
    public static SubLObject f48248(final SubLObject var171, SubLObject var222) {
        if (var222 == module0763.UNPROVIDED) {
            var222 = module0751.f46691();
        }
        if (module0763.NIL != module0578.f35470((SubLObject)module0763.TWO_INTEGER)) {
            PrintLow.format((SubLObject)module0763.T, (SubLObject)module0763.$ic262$, var171);
        }
        final SubLObject var223 = f48264(var171, var222);
        if (module0763.NIL != module0756.f47497(var223, (SubLObject)module0763.UNPROVIDED)) {
            f48290(var223);
        }
        return var223;
    }
    
    public static SubLObject f48279(final SubLObject var171) {
        final SubLObject var172 = module0205.f13276(var171);
        if (var172.eql(module0763.$ic263$)) {
            return (SubLObject)module0763.$ic264$;
        }
        return (SubLObject)module0763.NIL;
    }
    
    public static SubLObject f48259(final SubLObject var288) {
        final SubLObject var289 = f48390(var288);
        if (!var288.equal(var289) && module0763.NIL != module0578.f35470((SubLObject)module0763.ONE_INTEGER)) {
            PrintLow.format((SubLObject)module0763.T, (SubLObject)module0763.$ic265$, var289);
        }
        return var289;
    }
    
    public static SubLObject f48390(SubLObject var288) {
        if (var288.isAtom()) {
            return var288;
        }
        var288 = f48280(var288, (SubLObject)module0763.UNPROVIDED);
        if (module0763.NIL != module0202.f12590(var288)) {
            return module0202.f12801((SubLObject)module0763.$ic266$, var288, (SubLObject)module0763.UNPROVIDED);
        }
        return var288;
    }
    
    public static SubLObject f48280(SubLObject var288, SubLObject var222) {
        if (var222 == module0763.UNPROVIDED) {
            var222 = module0751.f46691();
        }
        final SubLThread var289 = SubLProcess.currentSubLThread();
        SubLObject var290 = (SubLObject)module0763.NIL;
        while (module0763.NIL == var290 && module0763.NIL != module0762.f48212(var288, module0579.$g4260$.getDynamicValue(var289))) {
            final SubLObject var291 = module0751.f46810(var288, module0579.$g4260$.getDynamicValue(var289));
            if (module0763.NIL != module0205.f13145((SubLObject)module0763.$ic267$, var291, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED)) {
                final SubLObject var292 = Sequences.cconcatenate((SubLObject)module0763.$ic0$, new SubLObject[] { module0006.f205((SubLObject)module0763.ONE_INTEGER), module0763.$ic1$, module0006.f203((SubLObject)module0763.$ic268$) });
                module0578.f35476(var292, (SubLObject)ConsesLow.list(module0751.f46678(), var288, var291));
            }
            else if (module0763.NIL != module0751.f46788(var291)) {
                final SubLObject var293 = module0579.$g4342$.currentBinding(var289);
                try {
                    module0579.$g4342$.bind((SubLObject)module0763.T, var289);
                    SubLObject var294 = (SubLObject)module0763.NIL;
                    try {
                        var289.throwStack.push(module0003.$g3$.getGlobalValue());
                        final SubLObject var3_556 = Errors.$error_handler$.currentBinding(var289);
                        try {
                            Errors.$error_handler$.bind((SubLObject)module0763.$ic38$, var289);
                            try {
                                var288 = module0751.f46672(var291, var288);
                            }
                            catch (Throwable var295) {
                                Errors.handleThrowable(var295, (SubLObject)module0763.NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(var3_556, var289);
                        }
                    }
                    catch (Throwable var296) {
                        var294 = Errors.handleThrowable(var296, module0003.$g3$.getGlobalValue());
                    }
                    finally {
                        var289.throwStack.pop();
                    }
                    if (var294.isString()) {
                        var290 = (SubLObject)module0763.T;
                        final SubLObject var297 = Sequences.cconcatenate((SubLObject)module0763.$ic0$, new SubLObject[] { module0006.f205((SubLObject)module0763.ONE_INTEGER), module0763.$ic1$, module0006.f203(var294) });
                        module0578.f35476(var297, (SubLObject)ConsesLow.list(module0763.EMPTY_SUBL_OBJECT_ARRAY));
                    }
                    else {
                        var222 = module0751.f46693(var222, var291);
                    }
                }
                finally {
                    module0579.$g4342$.rebind(var293, var289);
                }
            }
            else {
                var290 = (SubLObject)module0763.T;
            }
        }
        return Values.values(var288, var222);
    }
    
    public static SubLObject f48391(SubLObject var557, SubLObject var558, SubLObject var559) {
        if (var557 == module0763.UNPROVIDED) {
            var557 = (SubLObject)module0763.NIL;
        }
        if (var558 == module0763.UNPROVIDED) {
            var558 = (SubLObject)module0763.T;
        }
        if (var559 == module0763.UNPROVIDED) {
            var559 = (SubLObject)module0763.T;
        }
        final SubLThread var560 = SubLProcess.currentSubLThread();
        SubLObject var561 = (SubLObject)module0763.ZERO_INTEGER;
        final SubLObject var562 = module0749.f46341();
        SubLObject var563 = (SubLObject)module0763.ZERO_INTEGER;
        final SubLObject var564 = module0012.$g75$.currentBinding(var560);
        final SubLObject var565 = module0012.$g76$.currentBinding(var560);
        final SubLObject var566 = module0012.$g77$.currentBinding(var560);
        final SubLObject var567 = module0012.$g78$.currentBinding(var560);
        try {
            module0012.$g75$.bind((SubLObject)module0763.ZERO_INTEGER, var560);
            module0012.$g76$.bind((SubLObject)module0763.NIL, var560);
            module0012.$g77$.bind((SubLObject)module0763.T, var560);
            module0012.$g78$.bind(Time.get_universal_time(), var560);
            module0012.f478(PrintLow.format((SubLObject)module0763.NIL, (SubLObject)module0763.$ic269$));
            final SubLObject var568 = module0749.f46342();
            SubLObject var571;
            for (SubLObject var569 = (SubLObject)module0763.NIL; module0763.NIL == var569; var569 = (SubLObject)SubLObjectFactory.makeBoolean(module0763.NIL == var571)) {
                var560.resetMultipleValues();
                final SubLObject var570 = module0052.f3693(var568);
                var571 = var560.secondMultipleValue();
                var560.resetMultipleValues();
                if (module0763.NIL != var571) {
                    var561 = Numbers.add(var561, f48392(var570, var557, var558, var559));
                    var563 = Numbers.add(var563, (SubLObject)module0763.ONE_INTEGER);
                    module0012.note_percent_progress(var563, var562);
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var567, var560);
            module0012.$g77$.rebind(var566, var560);
            module0012.$g76$.rebind(var565, var560);
            module0012.$g75$.rebind(var564, var560);
        }
        return var561;
    }
    
    public static SubLObject f48392(final SubLObject var564, final SubLObject var557, final SubLObject var558, final SubLObject var559) {
        final SubLThread var565 = SubLProcess.currentSubLThread();
        SubLObject var566 = (SubLObject)module0763.NIL;
        SubLObject var567 = (SubLObject)module0763.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var564, var564, (SubLObject)module0763.$ic270$);
        var566 = var564.first();
        SubLObject var568 = var564.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var568, var564, (SubLObject)module0763.$ic270$);
        var567 = var568.first();
        var568 = var568.rest();
        if (module0763.NIL == var568) {
            if (module0763.NIL != var557) {
                Errors.warn((SubLObject)module0763.$ic271$, var566);
            }
            SubLObject var569 = var567;
            SubLObject var570 = (SubLObject)module0763.NIL;
            var570 = var569.first();
            while (module0763.NIL != var569) {
                final SubLObject var571 = module0077.f5329(var570);
                SubLObject var574;
                for (SubLObject var572 = (SubLObject)module0763.NIL; module0763.NIL == var572; var572 = (SubLObject)SubLObjectFactory.makeBoolean(module0763.NIL == var574)) {
                    var565.resetMultipleValues();
                    final SubLObject var573 = module0052.f3693(var571);
                    var574 = var565.secondMultipleValue();
                    var565.resetMultipleValues();
                    if (module0763.NIL != var574) {
                        final SubLObject var575 = module0749.f46366(var573);
                        final SubLObject var576 = module0178.f11303(var575);
                        final SubLObject var577 = module0178.f11287(var575);
                        final SubLObject var578 = (SubLObject)((module0763.NIL != var558) ? module0274.f18195(var576, var577, (SubLObject)module0763.UNPROVIDED) : module0763.NIL);
                        SubLObject var579 = (SubLObject)module0763.ZERO_INTEGER;
                        if (module0763.NIL != var578) {
                            Errors.warn((SubLObject)module0763.$ic272$, var576, var578);
                            var579 = Numbers.add(var579, (SubLObject)module0763.ONE_INTEGER);
                        }
                        else if (module0763.NIL != var559 && module0763.NIL != f48269(var576, (SubLObject)module0763.$ic58$)) {
                            var579 = Numbers.add(var579, (SubLObject)module0763.ONE_INTEGER);
                        }
                        return var579;
                    }
                }
                var569 = var569.rest();
                var570 = var569.first();
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var564, (SubLObject)module0763.$ic270$);
        }
        return (SubLObject)module0763.NIL;
    }
    
    public static SubLObject f48393(final SubLObject var576, SubLObject var577, SubLObject var578) {
        if (var577 == module0763.UNPROVIDED) {
            var577 = (SubLObject)module0763.NIL;
        }
        if (var578 == module0763.UNPROVIDED) {
            var578 = (SubLObject)module0763.NIL;
        }
        final SubLThread var579 = SubLProcess.currentSubLThread();
        final SubLObject var580 = module0219.f14525(module0763.$ic107$);
        final SubLObject var581 = Sequences.length(var580);
        SubLObject var582 = (SubLObject)module0763.ZERO_INTEGER;
        final SubLObject var583 = module0077.f5313((SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
        final SubLObject var584 = module0012.$g75$.currentBinding(var579);
        final SubLObject var585 = module0012.$g76$.currentBinding(var579);
        final SubLObject var586 = module0012.$g77$.currentBinding(var579);
        final SubLObject var587 = module0012.$g78$.currentBinding(var579);
        try {
            module0012.$g75$.bind((SubLObject)module0763.ZERO_INTEGER, var579);
            module0012.$g76$.bind((SubLObject)module0763.NIL, var579);
            module0012.$g77$.bind((SubLObject)module0763.T, var579);
            module0012.$g78$.bind(Time.get_universal_time(), var579);
            module0012.f478(PrintLow.format((SubLObject)module0763.NIL, (SubLObject)module0763.$ic273$));
            SubLObject var588 = var580;
            SubLObject var589 = (SubLObject)module0763.NIL;
            var589 = var588.first();
            while (module0763.NIL != var588) {
                final SubLObject var590 = module0178.f11303(var589);
                if (module0763.NIL != module0751.f46684(module0205.f13132(var590), module0763.$ic9$, (SubLObject)module0763.UNPROVIDED) && module0763.NIL != f48394(module0205.f13204(var590, (SubLObject)module0763.UNPROVIDED), var576, var578)) {
                    module0077.f5326((module0763.NIL != var577) ? var590 : module0205.f13203(var590, (SubLObject)module0763.UNPROVIDED), var583);
                }
                var582 = Numbers.add(var582, (SubLObject)module0763.ONE_INTEGER);
                module0012.note_percent_progress(var582, var581);
                var588 = var588.rest();
                var589 = var588.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var587, var579);
            module0012.$g77$.rebind(var586, var579);
            module0012.$g76$.rebind(var585, var579);
            module0012.$g75$.rebind(var584, var579);
        }
        return module0077.f5312(var583);
    }
    
    public static SubLObject f48394(final SubLObject var583, final SubLObject var576, final SubLObject var578) {
        if (module0205.f13132(var583).equal(module0763.$ic107$) && module0763.NIL == module0201.f12546(module0205.f13203(var583, (SubLObject)module0763.UNPROVIDED)) && module0763.NIL != ((module0763.NIL != var578) ? module0038.f2668(var576, module0205.f13203(var583, (SubLObject)module0763.UNPROVIDED), (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED) : module0038.f2759(var576, module0205.f13203(var583, (SubLObject)module0763.UNPROVIDED), (SubLObject)module0763.$ic274$, (SubLObject)module0763.UNPROVIDED))) {
            return (SubLObject)module0763.T;
        }
        if (module0763.NIL != module0751.f46684(module0205.f13132(var583), module0763.$ic275$, (SubLObject)module0763.UNPROVIDED)) {
            return (SubLObject)module0763.NIL;
        }
        SubLObject var584 = var583;
        SubLObject var585 = (SubLObject)module0763.NIL;
        var585 = var584.first();
        while (module0763.NIL != var584) {
            if (var585.isList() && module0763.NIL != f48394(var585, var576, var578)) {
                return (SubLObject)module0763.T;
            }
            var584 = var584.rest();
            var585 = var584.first();
        }
        return (SubLObject)module0763.NIL;
    }
    
    public static SubLObject f48395(final SubLObject var585, SubLObject var577) {
        if (var577 == module0763.UNPROVIDED) {
            var577 = (SubLObject)module0763.NIL;
        }
        final SubLThread var586 = SubLProcess.currentSubLThread();
        assert module0763.NIL != module0128.f8449(var585) : var585;
        final SubLObject var587 = module0217.f14247(module0763.$ic89$, (SubLObject)module0763.UNPROVIDED);
        SubLObject var588 = (SubLObject)module0763.ZERO_INTEGER;
        SubLObject var589 = (SubLObject)module0763.NIL;
        final SubLObject var590 = module0012.$g75$.currentBinding(var586);
        final SubLObject var591 = module0012.$g76$.currentBinding(var586);
        final SubLObject var592 = module0012.$g77$.currentBinding(var586);
        final SubLObject var593 = module0012.$g78$.currentBinding(var586);
        try {
            module0012.$g75$.bind((SubLObject)module0763.ZERO_INTEGER, var586);
            module0012.$g76$.bind((SubLObject)module0763.NIL, var586);
            module0012.$g77$.bind((SubLObject)module0763.T, var586);
            module0012.$g78$.bind(Time.get_universal_time(), var586);
            module0012.f478(PrintLow.format((SubLObject)module0763.NIL, (SubLObject)module0763.$ic277$));
            final SubLObject var3_586 = module0147.$g2094$.currentBinding(var586);
            final SubLObject var22_587 = module0147.$g2095$.currentBinding(var586);
            try {
                module0147.$g2094$.bind((SubLObject)module0763.$ic7$, var586);
                module0147.$g2095$.bind(module0763.$ic8$, var586);
                final SubLObject var594 = module0763.$ic89$;
                if (module0763.NIL != module0158.f10038(var594)) {
                    final SubLObject var595 = (SubLObject)module0763.NIL;
                    final SubLObject var3_587 = module0012.$g73$.currentBinding(var586);
                    final SubLObject var22_588 = module0012.$g65$.currentBinding(var586);
                    final SubLObject var37_590 = module0012.$g67$.currentBinding(var586);
                    final SubLObject var38_591 = module0012.$g68$.currentBinding(var586);
                    final SubLObject var596 = module0012.$g66$.currentBinding(var586);
                    final SubLObject var597 = module0012.$g69$.currentBinding(var586);
                    final SubLObject var598 = module0012.$g70$.currentBinding(var586);
                    final SubLObject var599 = module0012.$silent_progressP$.currentBinding(var586);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var586);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var586), var586);
                        module0012.$g67$.bind((SubLObject)module0763.ONE_INTEGER, var586);
                        module0012.$g68$.bind((SubLObject)module0763.ZERO_INTEGER, var586);
                        module0012.$g66$.bind((SubLObject)module0763.ZERO_INTEGER, var586);
                        module0012.$g69$.bind((SubLObject)module0763.ZERO_INTEGER, var586);
                        module0012.$g70$.bind((SubLObject)module0763.T, var586);
                        module0012.$silent_progressP$.bind((SubLObject)((module0763.NIL != var595) ? module0012.$silent_progressP$.getDynamicValue(var586) : module0763.T), var586);
                        module0012.f474(var595);
                        final SubLObject var600 = module0158.f10039(var594);
                        SubLObject var601 = (SubLObject)module0763.NIL;
                        final SubLObject var602 = (SubLObject)module0763.NIL;
                        while (module0763.NIL == var601) {
                            final SubLObject var603 = module0052.f3695(var600, var602);
                            final SubLObject var604 = (SubLObject)SubLObjectFactory.makeBoolean(!var602.eql(var603));
                            if (module0763.NIL != var604) {
                                module0012.f476();
                                SubLObject var605 = (SubLObject)module0763.NIL;
                                try {
                                    var605 = module0158.f10316(var603, (SubLObject)module0763.$ic32$, (SubLObject)module0763.NIL, (SubLObject)module0763.NIL);
                                    SubLObject var133_592 = (SubLObject)module0763.NIL;
                                    final SubLObject var134_593 = (SubLObject)module0763.NIL;
                                    while (module0763.NIL == var133_592) {
                                        final SubLObject var606 = module0052.f3695(var605, var134_593);
                                        final SubLObject var136_594 = (SubLObject)SubLObjectFactory.makeBoolean(!var134_593.eql(var606));
                                        if (module0763.NIL != var136_594) {
                                            final SubLObject var607 = module0178.f11303(var606);
                                            final SubLObject var608 = module0205.f13204(var607, (SubLObject)module0763.UNPROVIDED);
                                            if (module0763.NIL != module0205.f13221(var585, var608, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED)) {
                                                var589 = (SubLObject)ConsesLow.cons((module0763.NIL != var577) ? var607 : var608, var589);
                                            }
                                            var588 = Numbers.add(var588, (SubLObject)module0763.ONE_INTEGER);
                                            module0012.note_percent_progress(var588, var587);
                                        }
                                        var133_592 = (SubLObject)SubLObjectFactory.makeBoolean(module0763.NIL == var136_594);
                                    }
                                }
                                finally {
                                    final SubLObject var3_588 = Threads.$is_thread_performing_cleanupP$.currentBinding(var586);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0763.T, var586);
                                        if (module0763.NIL != var605) {
                                            module0158.f10319(var605);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var3_588, var586);
                                    }
                                }
                            }
                            var601 = (SubLObject)SubLObjectFactory.makeBoolean(module0763.NIL == var604);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var599, var586);
                        module0012.$g70$.rebind(var598, var586);
                        module0012.$g69$.rebind(var597, var586);
                        module0012.$g66$.rebind(var596, var586);
                        module0012.$g68$.rebind(var38_591, var586);
                        module0012.$g67$.rebind(var37_590, var586);
                        module0012.$g65$.rebind(var22_588, var586);
                        module0012.$g73$.rebind(var3_587, var586);
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var22_587, var586);
                module0147.$g2094$.rebind(var3_586, var586);
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var593, var586);
            module0012.$g77$.rebind(var592, var586);
            module0012.$g76$.rebind(var591, var586);
            module0012.$g75$.rebind(var590, var586);
        }
        return var589;
    }
    
    public static SubLObject f48396(final SubLObject var597) {
        assert module0763.NIL != f48397(var597) : var597;
        final SubLObject var598 = f48398(var597);
        SubLObject var599 = (SubLObject)ConsesLow.list(var597);
        SubLObject var600 = (SubLObject)module0763.NIL;
        SubLObject var601 = (SubLObject)module0763.NIL;
        SubLObject var602 = (SubLObject)module0763.NIL;
        SubLObject var603 = var598;
        SubLObject var604 = (SubLObject)module0763.NIL;
        var604 = var603.first();
        while (module0763.NIL != var603) {
            var601 = var604.first();
            var602 = var604.rest();
            SubLObject var45_603 = var599;
            SubLObject var605 = (SubLObject)module0763.NIL;
            var605 = var45_603.first();
            while (module0763.NIL != var45_603) {
                SubLObject var606;
                for (var606 = (SubLObject)module0763.NIL, var606 = (SubLObject)module0763.ZERO_INTEGER; var606.numL(var602); var606 = Numbers.add(var606, (SubLObject)module0763.ONE_INTEGER)) {
                    var600 = (SubLObject)ConsesLow.cons(f48399(var605, var601, var606), var600);
                }
                var45_603 = var45_603.rest();
                var605 = var45_603.first();
            }
            var599 = var600;
            var600 = (SubLObject)module0763.NIL;
            var603 = var603.rest();
            var604 = var603.first();
        }
        return module0276.f18287(Mapping.mapcar((SubLObject)module0763.$ic280$, var599), (SubLObject)module0763.UNPROVIDED);
    }
    
    public static SubLObject f48397(final SubLObject var249) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0763.NIL != module0202.f12590(var249) && module0205.f13136(var249).eql(module0763.$ic281$) && module0763.NIL != module0202.f12598(var249));
    }
    
    public static SubLObject f48400(final SubLObject var249, final SubLObject var606) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var249.isList() && var249.first().eql(var606));
    }
    
    public static SubLObject f48401(final SubLObject var607) {
        return var607.first();
    }
    
    public static SubLObject f48402(final SubLObject var608) {
        return conses_high.second(var608);
    }
    
    public static SubLObject f48403(final SubLObject var608, final SubLObject var268) {
        return ConsesLow.nth(Numbers.add(var268, (SubLObject)module0763.TWO_INTEGER), var608);
    }
    
    public static SubLObject f48404(final SubLObject var249) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0763.NIL != f48400(var249, (SubLObject)module0763.$ic282$) && module0763.NIL != module0004.f106(conses_high.second(var249)));
    }
    
    public static SubLObject f48405(final SubLObject var465) {
        return (SubLObject)ConsesLow.cons(module0763.$ic88$, var465.rest());
    }
    
    public static SubLObject f48399(final SubLObject var597, final SubLObject var601, final SubLObject var605) {
        final SubLThread var606 = SubLProcess.currentSubLThread();
        assert module0763.NIL != module0004.f106(var601) : var601;
        assert module0763.NIL != module0004.f106(var605) : var605;
        SubLObject var607 = (SubLObject)module0763.NIL;
        SubLObject var608 = var597;
        SubLObject var609 = (SubLObject)module0763.NIL;
        SubLObject var610 = (SubLObject)module0763.NIL;
        SubLObject var611 = module0035.f2399(var597, (SubLObject)module0763.$ic284$, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
        SubLObject var612 = (SubLObject)module0763.NIL;
        var612 = var611.first();
        while (module0763.NIL != var611) {
            if (f48402(var612).eql(var601)) {
                var607 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var612, f48403(var612, var605)), var607);
            }
            var611 = var611.rest();
            var612 = var611.first();
        }
        var611 = var607;
        SubLObject var613 = (SubLObject)module0763.NIL;
        var613 = var611.first();
        while (module0763.NIL != var611) {
            var609 = var613.first();
            var610 = var613.rest();
            if (var610.eql(module0763.$g6114$.getDynamicValue(var606))) {
                var608 = module0035.f2423(var609, conses_high.copy_tree(var608), (SubLObject)module0763.EQUAL, (SubLObject)module0763.UNPROVIDED);
            }
            else if (var610.first().eql((SubLObject)module0763.$ic285$)) {
                var608 = module0035.f2459(var608, var609, var610.rest());
            }
            else {
                var608 = module0035.f2457(var608, var609, var610);
            }
            var611 = var611.rest();
            var613 = var611.first();
        }
        return var608;
    }
    
    public static SubLObject f48398(final SubLObject var597) {
        SubLObject var598 = (SubLObject)module0763.NIL;
        SubLObject var599 = (SubLObject)module0763.NIL;
        SubLObject var600 = (SubLObject)module0763.NIL;
        SubLObject var601 = (SubLObject)module0763.NIL;
        SubLObject var602 = module0035.f2399(var597, (SubLObject)module0763.$ic284$, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED, (SubLObject)module0763.UNPROVIDED);
        SubLObject var603 = (SubLObject)module0763.NIL;
        var603 = var602.first();
        while (module0763.NIL != var602) {
            var599 = conses_high.second(var603);
            var600 = Numbers.subtract(Sequences.length(var603), (SubLObject)module0763.TWO_INTEGER);
            var601 = conses_high.assoc(var599, var598, (SubLObject)module0763.EQL, (SubLObject)module0763.UNPROVIDED);
            if (module0763.NIL != var601) {
                if (!var601.rest().numE(var600)) {
                    Errors.error((SubLObject)module0763.$ic286$, var599, var597);
                }
            }
            else {
                var598 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(conses_high.second(var603), Numbers.subtract(Sequences.length(var603), (SubLObject)module0763.TWO_INTEGER)), var598);
            }
            var602 = var602.rest();
            var603 = var602.first();
        }
        return var598;
    }
    
    public static SubLObject f48406() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48234", "S#41511", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48236", "S#52715", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48235", "S#52716", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48237", "S#52717", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48239", "ADD-GEN-TEMPLATE", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48238", "S#52718", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48241", "S#50671", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48244", "S#52719", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48245", "S#52720", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48246", "S#52721", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48243", "S#52722", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48247", "S#52723", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48240", "S#52724", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48251", "S#52725", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48253", "S#25958", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48252", "S#52726", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48254", "REMOVE-GEN-TEMPLATE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48249", "S#52727", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48257", "S#52728", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48258", "GEN-TEMPLATE-RECIPE-P", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48260", "S#52729", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48262", "S#52730", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48265", "S#52731", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48261", "S#52732", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48266", "S#52733", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48267", "S#52734", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48263", "S#52735", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48268", "S#52736", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48255", "S#52737", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48269", "S#52738", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48270", "S#52739", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48271", "S#52740", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48256", "S#52741", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48272", "S#52742", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48274", "S#52743", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48275", "S#52744", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48276", "S#52745", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48273", "S#52746", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48277", "S#50240", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48278", "S#52747", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48264", "S#51931", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48281", "S#51932", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48288", "S#52748", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48289", "S#52749", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48290", "S#52750", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48291", "S#52751", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48286", "S#52752", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48287", "S#52753", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48282", "S#52754", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48283", "S#52755", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48284", "S#52756", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48292", "S#52757", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48285", "S#52758", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48293", "S#52759", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48294", "S#52760", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48295", "S#52761", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48297", "S#52762", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48296", "S#52763", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48298", "S#52764", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48250", "S#52765", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48242", "S#52766", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48300", "S#52767", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48299", "S#52768", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48302", "S#52769", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48301", "S#52770", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48305", "S#52771", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48304", "S#52772", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48303", "S#52773", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48307", "S#52774", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48306", "S#52775", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48311", "S#52776", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48312", "S#52777", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48313", "S#52778", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48310", "S#52779", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48315", "S#52780", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48316", "S#50975", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48314", "S#52781", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48308", "S#52782", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48309", "S#52783", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48317", "S#52784", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48318", "S#52785", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48321", "S#52786", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48322", "S#52787", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48324", "S#52788", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48323", "S#52789", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48330", "S#52790", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48325", "S#52791", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48326", "S#52792", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48327", "S#52793", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48328", "S#52794", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48329", "S#52795", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48331", "S#52796", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48334", "S#39316", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48333", "S#52797", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48336", "S#52798", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48335", "S#52799", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48338", "S#52800", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48339", "S#52801", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48340", "S#52802", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48341", "S#52803", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48342", "S#52804", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48344", "S#52805", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48343", "S#52806", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48345", "S#52807", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48346", "S#52808", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48349", "S#39312", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48350", "S#52809", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48351", "S#52810", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48353", "S#50704", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48355", "S#52811", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48358", "S#52812", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48357", "S#52813", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48359", "S#52814", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48354", "S#52815", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48352", "S#52816", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48356", "S#52817", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48360", "S#52818", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48362", "S#52819", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48332", "S#52820", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48363", "S#52821", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48361", "S#52822", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48337", "S#52823", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48365", "S#52824", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48364", "S#52825", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48366", "S#51015", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48369", "S#52826", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48367", "S#52827", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48368", "S#52828", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48370", "S#52829", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48348", "S#52830", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48373", "S#50670", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48374", "S#52831", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48375", "S#52832", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48376", "S#52713", 1, 0, false);
        new $f48376$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48377", "S#52833", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48372", "S#52834", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48371", "S#52835", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48378", "S#52836", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48379", "S#52837", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48347", "S#52838", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48380", "S#52839", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48381", "S#52840", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48382", "S#52841", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48383", "S#52842", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48384", "S#52843", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48385", "S#51014", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48386", "S#52844", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48319", "S#52845", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48320", "S#52846", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48387", "S#52847", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48388", "S#52848", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48389", "S#52849", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48248", "S#51927", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48279", "S#52850", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48259", "S#52350", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48390", "S#52714", 1, 0, false);
        new $f48390$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48280", "S#52851", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48391", "S#52852", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48392", "S#52853", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48393", "S#52854", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48394", "S#52855", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48395", "S#52856", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48396", "S#52857", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48397", "S#52858", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48400", "S#52859", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48401", "S#52860", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48402", "S#52861", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48403", "S#52862", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48404", "S#52863", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48405", "S#52864", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48399", "S#52865", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0763", "f48398", "S#52866", 1, 0, false);
        return (SubLObject)module0763.NIL;
    }
    
    public static SubLObject f48407() {
        module0763.$g6107$ = SubLFiles.defparameter("S#52867", (SubLObject)module0763.NIL);
        module0763.$g6108$ = SubLFiles.deflexical("S#52868", (SubLObject)module0763.NIL);
        module0763.$g6109$ = SubLFiles.defparameter("S#52869", (SubLObject)module0763.NIL);
        module0763.$g6110$ = SubLFiles.deflexical("S#52870", (SubLObject)module0763.NIL);
        module0763.$g6111$ = SubLFiles.deflexical("S#52871", (SubLObject)module0763.NIL);
        module0763.$g6112$ = SubLFiles.deflexical("S#52872", (SubLObject)module0763.NIL);
        module0763.$g6113$ = SubLFiles.deflexical("S#52873", (SubLObject)ConsesLow.list(new SubLObject[] { module0763.$ic247$, module0763.TWO_INTEGER, module0763.$ic248$, module0763.ONE_INTEGER, module0763.$ic249$, module0763.TEN_INTEGER, module0763.$ic250$, module0763.NIL, module0763.$ic251$, module0763.$ic252$, module0763.$ic253$, module0763.NIL, module0763.$ic254$, module0763.$ic255$, module0763.$ic256$, module0763.T, module0763.$ic257$, module0763.$ic258$ }));
        module0763.$g6114$ = SubLFiles.defparameter("S#52874", (SubLObject)module0763.$ic278$);
        return (SubLObject)module0763.NIL;
    }
    
    public static SubLObject f48408() {
        module0012.f416((SubLObject)module0763.$ic35$);
        module0034.f1909((SubLObject)module0763.$ic41$);
        module0012.f416((SubLObject)module0763.$ic55$);
        module0012.f419((SubLObject)module0763.$ic64$);
        module0034.f1909((SubLObject)module0763.$ic92$);
        module0034.f1895((SubLObject)module0763.$ic154$);
        module0034.f1909((SubLObject)module0763.$ic159$);
        module0034.f1895((SubLObject)module0763.$ic161$);
        module0002.f50((SubLObject)module0763.$ic183$, (SubLObject)module0763.$ic184$);
        module0034.f1895((SubLObject)module0763.$ic224$);
        module0034.f1909((SubLObject)module0763.$ic192$);
        return (SubLObject)module0763.NIL;
    }
    
    public void declareFunctions() {
        f48406();
    }
    
    public void initializeVariables() {
        f48407();
    }
    
    public void runTopLevelForms() {
        f48408();
    }
    
    static {
        me = (SubLFile)new module0763();
        module0763.$g6107$ = null;
        module0763.$g6108$ = null;
        module0763.$g6109$ = null;
        module0763.$g6110$ = null;
        module0763.$g6111$ = null;
        module0763.$g6112$ = null;
        module0763.$g6113$ = null;
        module0763.$g6114$ = null;
        $ic0$ = SubLObjectFactory.makeString("(PPH error level ");
        $ic1$ = SubLObjectFactory.makeString(") ");
        $ic2$ = SubLObjectFactory.makeString("Recursive call to INITIALIZE-GEN-TEMPLATE-STORE.");
        $ic3$ = SubLObjectFactory.makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic4$ = SubLObjectFactory.makeKeyword("NEW");
        $ic5$ = SubLObjectFactory.makeKeyword("INITIALIZED");
        $ic6$ = SubLObjectFactory.makeString("gen-template-store length of ~S is not good.");
        $ic7$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic8$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic9$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("NLTemplateGenerationPredicate"));
        $ic10$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic11$ = SubLObjectFactory.makeKeyword("BREADTH");
        $ic12$ = SubLObjectFactory.makeKeyword("QUEUE");
        $ic13$ = SubLObjectFactory.makeKeyword("STACK");
        $ic14$ = SubLObjectFactory.makeSymbol("S#11450", "CYC");
        $ic15$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic16$ = SubLObjectFactory.makeString("~A is not a ~A");
        $ic17$ = SubLObjectFactory.makeSymbol("S#11592", "CYC");
        $ic18$ = SubLObjectFactory.makeKeyword("CERROR");
        $ic19$ = SubLObjectFactory.makeString("continue anyway");
        $ic20$ = SubLObjectFactory.makeKeyword("WARN");
        $ic21$ = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic22$ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $ic23$ = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic24$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("US#4D5E436"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#1526883"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#15AA083"));
        $ic25$ = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic26$ = SubLObjectFactory.makeString("gen-template-store length ~S is implausibly large, compared to only ~S relevant assertions in the KB.");
        $ic27$ = SubLObjectFactory.makeString("gen-template-store length ~S is unsettlingly small, compared to only ~S relevant assertions in the KB.");
        $ic28$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Relation"));
        $ic29$ = SubLObjectFactory.makeSymbol("SPEC?");
        $ic30$ = SubLObjectFactory.makeKeyword("DONE");
        $ic31$ = SubLObjectFactory.makeString("Initializing ~S...");
        $ic32$ = SubLObjectFactory.makeKeyword("GAF");
        $ic33$ = SubLObjectFactory.makeKeyword("OFF");
        $ic34$ = SubLObjectFactory.makeKeyword("FAST");
        $ic35$ = SubLObjectFactory.makeSymbol("ADD-GEN-TEMPLATE");
        $ic36$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic37$ = SubLObjectFactory.makeString("Unable to add assertion to gen-template store:~% ~S~%");
        $ic38$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic39$ = SubLObjectFactory.makeString("~% Top-level CycL: ~S");
        $ic40$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Kappa")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $ic41$ = SubLObjectFactory.makeSymbol("S#52722", "CYC");
        $ic42$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Kappa")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#4", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#33867", "CYC")));
        $ic43$ = SubLObjectFactory.makeSymbol("S#33867", "CYC");
        $ic44$ = SubLObjectFactory.makeSymbol("S#4", "CYC");
        $ic45$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TermParaphraseFn"));
        $ic46$ = SubLObjectFactory.makeSymbol("S#52868", "CYC");
        $ic47$ = SubLObjectFactory.makeInteger(1024);
        $ic48$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic49$ = SubLObjectFactory.makeString("kappaGenTemplateRuleForArity");
        $ic50$ = SubLObjectFactory.makeSymbol("?RULE");
        $ic51$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?RULE"));
        $ic52$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $ic53$ = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $ic54$ = SubLObjectFactory.makeKeyword("REINITIALIZED");
        $ic55$ = SubLObjectFactory.makeSymbol("REMOVE-GEN-TEMPLATE");
        $ic56$ = SubLObjectFactory.makeString("PPH-PHRASE-FROM-ASSERTION passed a non-GAF: ~S");
        $ic57$ = SubLObjectFactory.makeString("PPH-PHRASE-FROM-ASSERTION passed a bad template:~% ~S");
        $ic58$ = SubLObjectFactory.makeKeyword("SLOW");
        $ic59$ = SubLObjectFactory.makeSymbol("S#12753", "CYC");
        $ic60$ = SubLObjectFactory.makeString("~%*** expanded template for ~S...~%~S~%... is missing generic args ~S");
        $ic61$ = SubLObjectFactory.makeSymbol("S#52731", "CYC");
        $ic62$ = SubLObjectFactory.makeSymbol("S#15431", "CYC");
        $ic63$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("RepeatForSubsequentArgsFn"));
        $ic64$ = SubLObjectFactory.makeSymbol("S#52733", "CYC");
        $ic65$ = (SubLList)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("BestBindingsPhraseFn")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $ic66$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheNthFn"));
        $ic67$ = SubLObjectFactory.makeString("~S can't begin a #$GenTemplateRecipe clause");
        $ic68$ = SubLObjectFactory.makeKeyword("IGNORE");
        $ic69$ = SubLObjectFactory.makeString("Wf problem with ~S");
        $ic70$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ConditionalPhraseFn"));
        $ic71$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("BestBindingsPhraseFn"));
        $ic72$ = SubLObjectFactory.makeString("~S expects a closed formula for its arg1, not ~S");
        $ic73$ = SubLObjectFactory.makeString("~S expects a cycl-sentence-askable? as in arg-pos ~S, not ~S");
        $ic74$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("PhraseFormFn"));
        $ic75$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SententialConstituent"));
        $ic76$ = SubLObjectFactory.makeSymbol("S#51007", "CYC");
        $ic77$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("LexicalWord"));
        $ic78$ = SubLObjectFactory.makeString("~S is required to be a #$LexicalWord");
        $ic79$ = SubLObjectFactory.makeString("~S exceeds the maxArity (~S) allowed by the predicate");
        $ic80$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("argIsa"));
        $ic81$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("GeneralLexiconMt"));
        $ic82$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9932", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9936", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#52875", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#52876", "CYC"));
        $ic83$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Thing"));
        $ic84$ = SubLObjectFactory.makeString("~S isn't a ~S w.r.t. ~S");
        $ic85$ = SubLObjectFactory.makeString("~&Self-referential #$genTemplate formula:~% ~S.~%");
        $ic86$ = SubLObjectFactory.makeString("~&Bad generic arg keyword (~S) in~% ~S~%");
        $ic87$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genTemplate"));
        $ic88$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genTemplate-QuerySentence"));
        $ic89$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genTemplate-Constrained"));
        $ic90$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("detailedIsaParaphrase"));
        $ic91$ = SubLObjectFactory.makeString("-non-wf? needs instructions for invoking gen-template-recipe-p on ~S");
        $ic92$ = SubLObjectFactory.makeSymbol("S#52746", "CYC");
        $ic93$ = SubLObjectFactory.makeString("~S has no known arity.~%");
        $ic94$ = SubLObjectFactory.makeSymbol("S#52870", "CYC");
        $ic95$ = SubLObjectFactory.makeInteger(128);
        $ic96$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("GenTemplateRecipeOmitsArgFn"));
        $ic97$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#52877", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#52878", "CYC"));
        $ic98$ = SubLObjectFactory.makeString("~S is not a well-formed genTemplate recipe.");
        $ic99$ = SubLObjectFactory.makeString("PPH-PHRASE-FROM-GENTEMPLATE-PHRASE passed a non-PPH-PHRASE-NAUT: ~S.~% Expansion: ~S");
        $ic100$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TypeClarifyingPhraseFn"));
        $ic101$ = ConsesLow.list((SubLObject)module0763.ONE_INTEGER);
        $ic102$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("BestSymbolPhraseFn"));
        $ic103$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("PercentParaphraseFn"));
        $ic104$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("BestCycLPhraseFn"));
        $ic105$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ConcatenatePhrasesFn"));
        $ic106$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ConcatenatePhrasesFn-NoSpaces"));
        $ic107$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("BestNLPhraseOfStringFn"));
        $ic108$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("StringMentionFn"));
        $ic109$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("QuotedParaphraseFn"));
        $ic110$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TerseParaphraseFn"));
        $ic111$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("PreciseParaphraseFn"));
        $ic112$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("PhraseCycLFn"));
        $ic113$ = SubLObjectFactory.makeKeyword("ARG1");
        $ic114$ = SubLObjectFactory.makeSymbol("S#50969", "CYC");
        $ic115$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TermParaphraseFn-Possessive"));
        $ic116$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("PossessivePhrase"));
        $ic117$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("BestVerbFormForSubjectFn"));
        $ic118$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("BestNLWordFormOfLexemeFn"));
        $ic119$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("NLConjunctionFn"));
        $ic120$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("NLConjunctionFn-But"));
        $ic121$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("NLDisjunctionFn"));
        $ic122$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("BestNumberedListParaphraseFn-Constrained"));
        $ic123$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("BestChemicalFormulaFn"));
        $ic124$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("BestDetNbarFn"));
        $ic125$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("HeadWordOfPhraseFn"));
        $ic126$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("WithTenseToDaughterFn"));
        $ic127$ = SubLObjectFactory.makeKeyword("TENSE");
        $ic128$ = SubLObjectFactory.makeKeyword("MOTHER");
        $ic129$ = SubLObjectFactory.makeString("Don't know how to make a PPH-PHRASE from ~S.");
        $ic130$ = SubLObjectFactory.makeKeyword("SUBJECT-VERB");
        $ic131$ = SubLObjectFactory.makeString("Bad Nth phrase: ~S. Dtr count is ~S");
        $ic132$ = SubLObjectFactory.makeString("Phrase specified to agree with itself!~% ~S");
        $ic133$ = SubLObjectFactory.makeString("Can't dereference ~S in~% ~S");
        $ic134$ = SubLObjectFactory.makeString("Potentially recursive agr: ~S~% ~S");
        $ic135$ = SubLObjectFactory.makeString("Dereferenced ~S to ~S");
        $ic136$ = SubLObjectFactory.makeSymbol("S#52752", "CYC");
        $ic137$ = SubLObjectFactory.makeKeyword("ARG2");
        $ic138$ = SubLObjectFactory.makeString("Incompatible constraint ~S on ~S");
        $ic139$ = SubLObjectFactory.makeString("NthPhraseAgrFn");
        $ic140$ = SubLObjectFactory.makeKeyword("PEER");
        $ic141$ = SubLObjectFactory.makeString("~&Warning: null constraint on ~S.~%");
        $ic142$ = SubLObjectFactory.makeString("Don't know what to do with ~S constraint.");
        $ic143$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Verb"));
        $ic144$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("PhraseFn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Determiner")));
        $ic145$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Determiner"));
        $ic146$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("PhraseFn-Bar1")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Noun")));
        $ic147$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("nounStrings")));
        $ic148$ = SubLObjectFactory.makeKeyword("DET-NBAR");
        $ic149$ = SubLObjectFactory.makeKeyword("ANY");
        $ic150$ = SubLObjectFactory.makeKeyword("NL-PREDS");
        $ic151$ = SubLObjectFactory.makeKeyword("POS-PRED");
        $ic152$ = SubLObjectFactory.makeString("~&Agr preds for the determiner ~S are ~S.~%");
        $ic153$ = SubLObjectFactory.makeString("Using default agr preds ~S for ~S");
        $ic154$ = SubLObjectFactory.makeSymbol("S#52763", "CYC");
        $ic155$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("denotation"));
        $ic156$ = SubLObjectFactory.makeSymbol("S#51494", "CYC");
        $ic157$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genFormat-ArgFixed"));
        $ic158$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("equals"));
        $ic159$ = SubLObjectFactory.makeSymbol("S#52779", "CYC");
        $ic160$ = SubLObjectFactory.makeSymbol("S#52871", "CYC");
        $ic161$ = SubLObjectFactory.makeSymbol("S#50975", "CYC");
        $ic162$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#52879", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#52880", "CYC"));
        $ic163$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic164$ = SubLObjectFactory.makeSymbol("S#17474", "CYC");
        $ic165$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#52881", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#52882", "CYC"));
        $ic166$ = SubLObjectFactory.makeString("Don't know how to convert ~S to #$genTemplate.");
        $ic167$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Determiner-Indefinite"));
        $ic168$ = SubLObjectFactory.makeKeyword("INDEFINITE");
        $ic169$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Determiner-Definite"));
        $ic170$ = SubLObjectFactory.makeKeyword("DEFINITE");
        $ic171$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("BestDetNbarFn-Indefinite"));
        $ic172$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("BestDetNbarFn-Definite"));
        $ic173$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("nounStrings"));
        $ic174$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("plural-Generic"));
        $ic175$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("nonSingular-Generic"));
        $ic176$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic"));
        $ic177$ = SubLObjectFactory.makeSymbol("S#52786", "CYC");
        $ic178$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("BestHeadVerbForInitialSubjectFn"));
        $ic179$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("NthPhraseFn"));
        $ic180$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("BestNLWordFormOfLexemeFn-Constrained"));
        $ic181$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("verbStrings"));
        $ic182$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TermParaphraseFn-Constrained"));
        $ic183$ = SubLObjectFactory.makeSymbol("S#39316", "CYC");
        $ic184$ = SubLObjectFactory.makeSymbol("S#39205", "CYC");
        $ic185$ = SubLObjectFactory.makeKeyword("UNSPECIFIED");
        $ic186$ = ConsesLow.list((SubLObject)module0763.ZERO_INTEGER);
        $ic187$ = SubLObjectFactory.makeString("~&Found PPH-PHRASE for ~S:~% ~S~% Justification:~% ~S~% Copied from~% ~S~%");
        $ic188$ = SubLObjectFactory.makeSymbol("<");
        $ic189$ = SubLObjectFactory.makeSymbol("S#52055", "CYC");
        $ic190$ = SubLObjectFactory.makeKeyword("RANDOM");
        $ic191$ = SubLObjectFactory.makeSymbol(">");
        $ic192$ = SubLObjectFactory.makeSymbol("S#52713", "CYC");
        $ic193$ = SubLObjectFactory.makeSymbol("S#50676", "CYC");
        $ic194$ = SubLObjectFactory.makeKeyword("GEN-FORMAT");
        $ic195$ = SubLObjectFactory.makeString("Couldn't use gen-template:~% ~S~% Explanation ~S");
        $ic196$ = SubLObjectFactory.makeString("Expected gen-template, got ~S~%");
        $ic197$ = SubLObjectFactory.makeString("Skipping forbidden lexical assertion:~% ~S");
        $ic198$ = SubLObjectFactory.makeKeyword("INVERSE");
        $ic199$ = SubLObjectFactory.makeString("~&Reinitializing relns-to-use.~%");
        $ic200$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $ic201$ = SubLObjectFactory.makeKeyword("DEPTH");
        $ic202$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("True-JustificationTruth"));
        $ic203$ = SubLObjectFactory.makeString("Inverting templates for ~S");
        $ic204$ = SubLObjectFactory.makeSymbol("S#51442", "CYC");
        $ic205$ = SubLObjectFactory.makeString("Relns to use: ~S~%");
        $ic206$ = SubLObjectFactory.makeString("~&Using inferior templates.~%");
        $ic207$ = SubLObjectFactory.makeSymbol("S#50673", "CYC");
        $ic208$ = SubLObjectFactory.makeString("~&Head of queue:~% ~S~%");
        $ic209$ = SubLObjectFactory.makeString("Sending inferior templates to end of queue:~% ~S");
        $ic210$ = SubLObjectFactory.makeString("Couldn't use any gen-templates from ~S");
        $ic211$ = SubLObjectFactory.makeString("~&Reverting to #$genFormat for ~S~%");
        $ic212$ = SubLObjectFactory.makeKeyword("INFERIOR");
        $ic213$ = SubLObjectFactory.makeString("~&Populating gen-template sets with ~S~%");
        $ic214$ = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $ic215$ = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic216$ = SubLObjectFactory.makeString("Adding :GEN-FORMAT at end of queue for ~S~%");
        $ic217$ = SubLObjectFactory.makeSymbol("CAND");
        $ic218$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("S#3267", "CYC"));
        $ic219$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("S#39308", "CYC")));
        $ic220$ = SubLObjectFactory.makeSymbol("S#12343", "CYC");
        $ic221$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("genFormat")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("genFormat-Precise")));
        $ic222$ = SubLObjectFactory.makeString("~&Couldn't find paraphrase template for ~S. Using one for ~S instead.~%");
        $ic223$ = SubLObjectFactory.makeString("Infinite recursion for ~S using:~% ~S.~%");
        $ic224$ = SubLObjectFactory.makeSymbol("S#52827", "CYC");
        $ic225$ = SubLObjectFactory.makeInteger(250);
        $ic226$ = SubLObjectFactory.makeSymbol("CAR");
        $ic227$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genFormat-Precise"));
        $ic228$ = SubLObjectFactory.makeString("Template doesn't apply to input formula.");
        $ic229$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SymmetricBinaryPredicate"));
        $ic230$ = SubLObjectFactory.makeString("~&~S is a symmetric binary predicate, so looking for a reversed template~%");
        $ic231$ = SubLObjectFactory.makeString("~&Switching arg1 and arg2 in phrase.~%");
        $ic232$ = SubLObjectFactory.makeString("Template has wrong scope for ~S");
        $ic233$ = SubLObjectFactory.makeSymbol("S#52872", "CYC");
        $ic234$ = SubLObjectFactory.makeInteger(10000);
        $ic235$ = SubLObjectFactory.makeString("Gen-template mt ~S not visible from ~S");
        $ic236$ = SubLObjectFactory.makeString("Gen-template preds ~S not compatible with ~S");
        $ic237$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("nounStrings")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("determinerStrings")));
        $ic238$ = SubLObjectFactory.makeKeyword("UNKNOWN");
        $ic239$ = SubLObjectFactory.makeString("~&Checking precision of ~S vs. ~S.~%");
        $ic240$ = SubLObjectFactory.makeString("Not using #$genTemplate because of existing #$genFormat-ArgFixed.");
        $ic241$ = SubLObjectFactory.makeString("~&Template judged imprecise because it did not reference ~S.~%");
        $ic242$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MODES"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("ReformulatorMode-Tersify"))));
        $ic243$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("NONE"));
        $ic244$ = SubLObjectFactory.makeString("Deepened~% ~S~% to ~S");
        $ic245$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("deeperGenTemplateRecipe"));
        $ic246$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?DEEPER"));
        $ic247$ = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $ic248$ = SubLObjectFactory.makeKeyword("MAX-NUMBER");
        $ic249$ = SubLObjectFactory.makeKeyword("MAX-TIME");
        $ic250$ = SubLObjectFactory.makeKeyword("CACHE-INFERENCE-RESULTS?");
        $ic251$ = SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE");
        $ic252$ = SubLObjectFactory.makeKeyword("HL");
        $ic253$ = SubLObjectFactory.makeKeyword("CONTINUABLE?");
        $ic254$ = SubLObjectFactory.makeKeyword("RETURN");
        $ic255$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)SubLObjectFactory.makeSymbol("?DEEPER"));
        $ic256$ = SubLObjectFactory.makeKeyword("ALLOW-INDETERMINATE-RESULTS?");
        $ic257$ = SubLObjectFactory.makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY");
        $ic258$ = SubLObjectFactory.makeKeyword("COMPUTE-INTERSECTION");
        $ic259$ = SubLObjectFactory.makeKeyword("PROBLEM-STORE");
        $ic260$ = SubLObjectFactory.makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL");
        $ic261$ = SubLObjectFactory.makeKeyword("NONE");
        $ic262$ = SubLObjectFactory.makeString("~&Phrasifying ~S.~%");
        $ic263$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TermParaphraseFn-TemporalLocation"));
        $ic264$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPORAL-LOCATION"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE"));
        $ic265$ = SubLObjectFactory.makeString("~&Expanded form is ~S.~%");
        $ic266$ = SubLObjectFactory.makeSymbol("S#52714", "CYC");
        $ic267$ = SubLObjectFactory.makeSymbol("S#50970", "CYC");
        $ic268$ = SubLObjectFactory.makeString("Expansions that refer to ~S tend to cause infinite recursion.~%Can't expand ~S~%Expansion template: ~S~%");
        $ic269$ = SubLObjectFactory.makeString("Checking *gen-template-store*...");
        $ic270$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#52883", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#52884", "CYC"));
        $ic271$ = SubLObjectFactory.makeString("checking ~S");
        $ic272$ = SubLObjectFactory.makeString("non-wff template ~S~%~S");
        $ic273$ = SubLObjectFactory.makeString("Checking the misc. extent of #$BestNLStringOfFn...");
        $ic274$ = SubLObjectFactory.makeString(".,;?");
        $ic275$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Function"));
        $ic276$ = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $ic277$ = SubLObjectFactory.makeString("Searching #$genTemplate-Constrained...");
        $ic278$ = SubLObjectFactory.makeKeyword("NULL");
        $ic279$ = SubLObjectFactory.makeSymbol("S#52858", "CYC");
        $ic280$ = SubLObjectFactory.makeSymbol("S#52864", "CYC");
        $ic281$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("metaGenTemplate-QuerySentence"));
        $ic282$ = SubLObjectFactory.makeKeyword("OR");
        $ic283$ = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic284$ = SubLObjectFactory.makeSymbol("S#52863", "CYC");
        $ic285$ = SubLObjectFactory.makeKeyword("AND");
        $ic286$ = SubLObjectFactory.makeString("dependent disjunction ~a has varying arities in ~a");
    }
    
    public static final class $f48376$UnaryFunction extends UnaryFunction
    {
        public $f48376$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#52713"));
        }
        
        public SubLObject processItem(final SubLObject var537) {
            return module0763.f48376(var537);
        }
    }
    
    public static final class $f48390$UnaryFunction extends UnaryFunction
    {
        public $f48390$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#52714"));
        }
        
        public SubLObject processItem(final SubLObject var537) {
            return module0763.f48390(var537);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0763.class
	Total time: 4416 ms
	
	Decompiled with Procyon 0.5.32.
*/