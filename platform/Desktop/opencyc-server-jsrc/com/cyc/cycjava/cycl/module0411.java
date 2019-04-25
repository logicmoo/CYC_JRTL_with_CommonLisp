package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0411 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0411";
    public static final String myFingerPrint = "8b7e3b04c61ffea9d3f6a7ec5cc33d88b279949d53a6d3bbc1661cac513160fe";
    private static SubLSymbol $g3319$;
    private static SubLSymbol $g3320$;
    private static SubLSymbol $g3321$;
    private static SubLSymbol $g3322$;
    private static SubLSymbol $g3323$;
    private static SubLSymbol $g3324$;
    private static SubLSymbol $g3325$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLList $ic7$;
    private static final SubLString $ic8$;
    private static final SubLSymbol $ic9$;
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
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLString $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLObject $ic60$;
    private static final SubLString $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLObject $ic64$;
    private static final SubLObject $ic65$;
    private static final SubLString $ic66$;
    private static final SubLString $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLList $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLString $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLString $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLList $ic90$;
    private static final SubLString $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLString $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLString $ic99$;
    private static final SubLString $ic100$;
    private static final SubLString $ic101$;
    private static final SubLString $ic102$;
    private static final SubLString $ic103$;
    private static final SubLList $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLList $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLString $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLFloat $ic127$;
    private static final SubLList $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLObject $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLObject $ic135$;
    private static final SubLObject $ic136$;
    private static final SubLObject $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLObject $ic139$;
    private static final SubLString $ic140$;
    private static final SubLObject $ic141$;
    private static final SubLList $ic142$;
    private static final SubLObject $ic143$;
    private static final SubLObject $ic144$;
    private static final SubLObject $ic145$;
    private static final SubLObject $ic146$;
    private static final SubLObject $ic147$;
    private static final SubLObject $ic148$;
    private static final SubLObject $ic149$;
    private static final SubLObject $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLObject $ic152$;
    private static final SubLObject $ic153$;
    private static final SubLObject $ic154$;
    private static final SubLObject $ic155$;
    private static final SubLObject $ic156$;
    private static final SubLObject $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLObject $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLList $ic162$;
    private static final SubLList $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLSymbol $ic165$;
    private static final SubLSymbol $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLSymbol $ic170$;
    private static final SubLString $ic171$;
    private static final SubLSymbol $ic172$;
    private static final SubLSymbol $ic173$;
    private static final SubLString $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLString $ic176$;
    private static final SubLObject $ic177$;
    private static final SubLObject $ic178$;
    private static final SubLString $ic179$;
    private static final SubLString $ic180$;
    private static final SubLString $ic181$;
    private static final SubLSymbol $ic182$;
    private static final SubLObject $ic183$;
    private static final SubLObject $ic184$;
    private static final SubLSymbol $ic185$;
    private static final SubLObject $ic186$;
    private static final SubLSymbol $ic187$;
    private static final SubLList $ic188$;
    private static final SubLSymbol $ic189$;
    private static final SubLList $ic190$;
    private static final SubLList $ic191$;
    private static final SubLSymbol $ic192$;
    private static final SubLSymbol $ic193$;
    private static final SubLSymbol $ic194$;
    private static final SubLSymbol $ic195$;
    private static final SubLSymbol $ic196$;
    private static final SubLSymbol $ic197$;
    private static final SubLSymbol $ic198$;
    private static final SubLSymbol $ic199$;
    private static final SubLSymbol $ic200$;
    private static final SubLList $ic201$;
    private static final SubLSymbol $ic202$;
    private static final SubLSymbol $ic203$;
    private static final SubLSymbol $ic204$;
    private static final SubLSymbol $ic205$;
    private static final SubLSymbol $ic206$;
    private static final SubLSymbol $ic207$;
    private static final SubLSymbol $ic208$;
    private static final SubLSymbol $ic209$;
    private static final SubLList $ic210$;
    private static final SubLSymbol $ic211$;
    private static final SubLSymbol $ic212$;
    private static final SubLString $ic213$;
    private static final SubLSymbol $ic214$;
    private static final SubLSymbol $ic215$;
    private static final SubLSymbol $ic216$;
    private static final SubLString $ic217$;
    private static final SubLSymbol $ic218$;
    private static final SubLSymbol $ic219$;
    private static final SubLSymbol $ic220$;
    private static final SubLList $ic221$;
    private static final SubLString $ic222$;
    private static final SubLSymbol $ic223$;
    private static final SubLSymbol $ic224$;
    private static final SubLSymbol $ic225$;
    private static final SubLSymbol $ic226$;
    
    
    public static SubLObject f28565() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return Numbers.add(module0110.$g1378$.getDynamicValue(var1), module0110.$g1384$.getDynamicValue(var1));
    }
    
    public static SubLObject f28566(final SubLObject var2) {
        Functions.funcall((SubLObject)module0411.$ic0$, var2);
        return (SubLObject)module0411.NIL;
    }
    
    public static SubLObject f28567(final SubLObject var3) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0411.$ic4$ == var3 || module0411.NIL != module0211.f13633(var3));
    }
    
    public static SubLObject f28568(final SubLObject var3) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0411.$ic5$ == var3 || module0411.NIL != module0211.f13633(var3));
    }
    
    public static SubLObject f28569(final SubLObject var3) {
        return module0035.f2169(var3, (SubLObject)module0411.$ic6$);
    }
    
    public static SubLObject f28570(final SubLObject var3) {
        return module0035.f2169(var3, (SubLObject)module0411.$ic7$);
    }
    
    public static SubLObject f28571(final SubLObject var4, final SubLObject var5, SubLObject var6) {
        if (var6 == module0411.UNPROVIDED) {
            var6 = (SubLObject)module0411.NIL;
        }
        if (module0411.NIL != module0360.f23781(var5)) {
            return oc_inference_datastructures_inference.f25591(var4, var5, var6);
        }
        Errors.error((SubLObject)module0411.$ic8$, var5);
        return var6;
    }
    
    public static SubLObject f28572(final SubLObject var4, final SubLObject var5, SubLObject var6) {
        if (var6 == module0411.UNPROVIDED) {
            var6 = (SubLObject)module0411.NIL;
        }
        if (module0411.NIL != module0360.f23831(var5)) {
            if (var5.eql((SubLObject)module0411.$ic9$)) {
                return oc_inference_datastructures_inference.f25519(var4);
            }
            if (var5.eql((SubLObject)module0411.$ic10$)) {
                return oc_inference_datastructures_inference.f25521(var4);
            }
            if (var5.eql((SubLObject)module0411.$ic11$)) {
                return oc_inference_datastructures_inference.f25518(var4);
            }
            if (var5.eql((SubLObject)module0411.$ic12$)) {
                return oc_inference_datastructures_inference.f25517(var4);
            }
            Errors.warn((SubLObject)module0411.$ic8$, var5);
            return var6;
        }
        else if (module0411.NIL != module0360.f23801(var5)) {
            if (var5.eql((SubLObject)module0411.$ic13$)) {
                return oc_inference_datastructures_inference.f25500(var4);
            }
            if (var5.eql((SubLObject)module0411.$ic14$)) {
                return oc_inference_datastructures_inference.f25502(var4);
            }
            if (var5.eql((SubLObject)module0411.$ic15$)) {
                return oc_inference_datastructures_inference.f25515(var4);
            }
            if (var5.eql((SubLObject)module0411.$ic16$)) {
                return oc_inference_datastructures_inference.f25501(var4);
            }
            if (var5.eql((SubLObject)module0411.$ic17$)) {
                return oc_inference_datastructures_inference.f25432(var4);
            }
            if (var5.eql((SubLObject)module0411.$ic18$)) {
                return oc_inference_datastructures_inference.f25614(var4);
            }
            if (var5.eql((SubLObject)module0411.$ic19$)) {
                return oc_inference_datastructures_inference.f25520(var4);
            }
            if (var5.eql((SubLObject)module0411.$ic20$)) {
                return oc_inference_datastructures_inference.f25522(var4);
            }
            if (var5.eql((SubLObject)module0411.$ic21$)) {
                return oc_inference_datastructures_inference.f25523(var4);
            }
            if (var5.eql((SubLObject)module0411.$ic22$)) {
                return oc_inference_datastructures_inference.f25524(var4);
            }
            if (var5.eql((SubLObject)module0411.$ic23$)) {
                return oc_inference_datastructures_inference.f25526(var4);
            }
            if (var5.eql((SubLObject)module0411.$ic24$)) {
                return oc_inference_datastructures_inference.f25525(var4);
            }
            if (var5.eql((SubLObject)module0411.$ic25$)) {
                return oc_inference_datastructures_inference.f25516(var4);
            }
            Errors.warn((SubLObject)module0411.$ic8$, var5);
            return var6;
        }
        else if (module0411.NIL != module0360.f23789(var5)) {
            if (var5.eql((SubLObject)module0411.$ic26$)) {
                return oc_inference_datastructures_inference.f25512(var4);
            }
            if (var5.eql((SubLObject)module0411.$ic27$)) {
                return oc_inference_datastructures_inference.f25507(var4);
            }
            if (var5.eql((SubLObject)module0411.$ic28$)) {
                return oc_inference_datastructures_inference.f25505(var4);
            }
            if (var5.eql((SubLObject)module0411.$ic29$)) {
                return oc_inference_datastructures_inference.f25508(var4);
            }
            if (var5.eql((SubLObject)module0411.$ic30$)) {
                return oc_inference_datastructures_inference.f25506(var4);
            }
            if (var5.eql((SubLObject)module0411.$ic31$)) {
                return oc_inference_datastructures_inference.f25511(var4);
            }
            if (var5.eql((SubLObject)module0411.$ic32$)) {
                return oc_inference_datastructures_inference.f25509(var4);
            }
            if (var5.eql((SubLObject)module0411.$ic33$)) {
                return oc_inference_datastructures_inference.f25503(var4);
            }
            if (var5.eql((SubLObject)module0411.$ic34$)) {
                return oc_inference_datastructures_inference.f25535(var4);
            }
            if (var5.eql((SubLObject)module0411.$ic35$)) {
                return oc_inference_datastructures_inference.f25510(var4);
            }
            if (var5.eql((SubLObject)module0411.$ic36$)) {
                return oc_inference_datastructures_inference.f25421(var4);
            }
            if (var5.eql((SubLObject)module0411.$ic37$)) {
                return oc_inference_datastructures_inference.f25504(var4);
            }
            if (var5.eql((SubLObject)module0411.$ic38$)) {
                return oc_inference_datastructures_inference.f25513(var4);
            }
            if (var5.eql((SubLObject)module0411.$ic38$)) {
                return oc_inference_datastructures_inference.f25513(var4);
            }
            Errors.warn((SubLObject)module0411.$ic8$, var5);
            return var6;
        }
        else if (module0411.NIL != module0360.f23846(var5)) {
            final SubLObject var7 = oc_inference_datastructures_inference.f25606(var4);
            if (var5.eql((SubLObject)module0411.$ic39$)) {
                return module0367.f25061(var7);
            }
            if (var5.eql((SubLObject)module0411.$ic40$)) {
                return module0367.f25063(var7);
            }
            if (var5.eql((SubLObject)module0411.$ic41$)) {
                return module0367.f25062(var7);
            }
            Errors.warn((SubLObject)module0411.$ic8$, var5);
            return var6;
        }
        else {
            if (module0411.NIL != module0360.f23855(var5)) {
                final SubLObject var8 = oc_inference_datastructures_inference.f25421(var4);
                return f28573(var8, var5, var6);
            }
            Errors.error((SubLObject)module0411.$ic8$, var5);
            return var6;
        }
    }
    
    public static SubLObject f28573(final SubLObject var9, final SubLObject var5, SubLObject var6) {
        if (var6 == module0411.UNPROVIDED) {
            var6 = (SubLObject)module0411.NIL;
        }
        if (var5.eql((SubLObject)module0411.$ic42$)) {
            return module0361.f24171(var9);
        }
        if (var5.eql((SubLObject)module0411.$ic43$)) {
            return module0361.f24165(var9);
        }
        if (var5.eql((SubLObject)module0411.$ic44$)) {
            return module0361.f24167(var9);
        }
        if (var5.eql((SubLObject)module0411.$ic45$)) {
            return module0361.f24173(var9);
        }
        if (var5.eql((SubLObject)module0411.$ic46$)) {
            return module0361.f24168(var9);
        }
        if (var5.eql((SubLObject)module0411.$ic47$)) {
            return module0361.f24159(var9);
        }
        if (var5.eql((SubLObject)module0411.$ic48$)) {
            return module0361.f24158(var9);
        }
        if (var5.eql((SubLObject)module0411.$ic49$)) {
            return module0361.f24169(var9);
        }
        if (var5.eql((SubLObject)module0411.$ic50$)) {
            return module0361.f24160(var9);
        }
        if (var5.eql((SubLObject)module0411.$ic51$)) {
            return module0361.f24161(var9);
        }
        if (var5.eql((SubLObject)module0411.$ic52$)) {
            return module0361.f24166(var9);
        }
        if (var5.eql((SubLObject)module0411.$ic53$)) {
            return module0361.f24172(var9);
        }
        if (var5.eql((SubLObject)module0411.$ic54$)) {
            return module0361.f24420(var9);
        }
        if (var5.eql((SubLObject)module0411.$ic55$)) {
            return module0361.f24163(var9);
        }
        if (var5.eql((SubLObject)module0411.$ic56$)) {
            return module0361.f24170(var9);
        }
        if (var5.eql((SubLObject)module0411.$ic57$)) {
            return module0361.f24164(var9);
        }
        Errors.warn((SubLObject)module0411.$ic58$, var5);
        return var6;
    }
    
    public static SubLObject f28574(final SubLObject var10) {
        SubLObject var11 = (SubLObject)module0411.NIL;
        if (module0411.NIL != module0363.f24562(var10)) {
            final SubLObject var12 = module0363.f24564(var10);
            final SubLObject var13 = module0363.f24565(var10);
            if (module0411.NIL != module0349.f23463(var12, var13)) {
                var11 = (SubLObject)module0411.T;
            }
        }
        return var11;
    }
    
    public static SubLObject f28575(final SubLObject var14, SubLObject var15) {
        if (var15 == module0411.UNPROVIDED) {
            var15 = (SubLObject)module0411.$ic59$;
        }
        final SubLObject var16 = module0373.f26113();
        if (module0411.NIL != var16) {
            final SubLObject var17 = module0361.f24197(var16);
            if (module0411.NIL != var17) {
                final SubLObject var18 = oc_inference_datastructures_inference.f25588(var17);
                if (module0411.NIL != var18) {
                    final SubLObject var19 = module0193.f12093(var14);
                    final SubLObject var20 = module0362.f24462(var19, var15, var18);
                    return module0361.f24239(var16, var20);
                }
            }
        }
        return (SubLObject)module0411.NIL;
    }
    
    public static SubLObject f28576(final SubLObject var4) {
        final SubLObject var5 = oc_inference_datastructures_inference.f25485(var4);
        if (module0411.NIL != module0202.f12590(var5) && module0411.NIL != module0205.f13332(var5, module0411.$ic60$)) {
            final SubLObject var7;
            final SubLObject var6 = var7 = oc_inference_datastructures_inference.f25653(var4);
            if (var7.eql((SubLObject)module0411.ZERO_INTEGER) || var7.eql((SubLObject)module0411.ONE_INTEGER)) {
                return (SubLObject)module0411.NIL;
            }
            if (var7.eql((SubLObject)module0411.TWO_INTEGER)) {
                return (SubLObject)module0411.T;
            }
            Errors.error((SubLObject)module0411.$ic61$, var4);
        }
        return (SubLObject)module0411.NIL;
    }
    
    public static SubLObject f28577(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)module0411.NIL;
        SubLObject var7 = (SubLObject)module0411.NIL;
        final SubLObject var8 = oc_inference_datastructures_inference.f25492(var4);
        if (module0411.NIL == module0065.f4772(var8, (SubLObject)module0411.$ic62$)) {
            final SubLObject var22_23 = var8;
            if (module0411.NIL == module0065.f4775(var22_23, (SubLObject)module0411.$ic62$)) {
                final SubLObject var9 = module0065.f4740(var22_23);
                final SubLObject var10 = (SubLObject)module0411.NIL;
                SubLObject var11;
                SubLObject var12;
                SubLObject var13;
                SubLObject var14;
                SubLObject var15;
                SubLObject var16;
                SubLObject var18;
                SubLObject var17;
                for (var11 = Sequences.length(var9), var12 = (SubLObject)module0411.NIL, var12 = (SubLObject)module0411.ZERO_INTEGER; var12.numL(var11); var12 = Numbers.add(var12, (SubLObject)module0411.ONE_INTEGER)) {
                    var13 = ((module0411.NIL != var10) ? Numbers.subtract(var11, var12, (SubLObject)module0411.ONE_INTEGER) : var12);
                    var14 = Vectors.aref(var9, var13);
                    if (module0411.NIL == module0065.f4749(var14) || module0411.NIL == module0065.f4773((SubLObject)module0411.$ic62$)) {
                        if (module0411.NIL != module0065.f4749(var14)) {
                            var14 = (SubLObject)module0411.$ic62$;
                        }
                        var15 = oc_inference_datastructures_inference.f25687(var14);
                        assert module0411.NIL != module0035.f1997(var15) : var15;
                        var16 = var15.first();
                        var17 = (var18 = module0233.f15370(var16));
                        if (var18.eql(module0411.$ic64$)) {
                            var6 = var14;
                        }
                        else if (var18.eql(module0411.$ic65$)) {
                            var7 = var14;
                        }
                        else {
                            Errors.error((SubLObject)module0411.$ic61$, var4);
                        }
                    }
                }
            }
            final SubLObject var33_34 = var8;
            if (module0411.NIL == module0065.f4777(var33_34)) {
                final SubLObject var19 = module0065.f4738(var33_34);
                SubLObject var20 = (SubLObject)module0411.NIL;
                SubLObject var21 = (SubLObject)module0411.NIL;
                final Iterator var22 = Hashtables.getEntrySetIterator(var19);
                try {
                    while (Hashtables.iteratorHasNext(var22)) {
                        final Map.Entry var23 = Hashtables.iteratorNextEntry(var22);
                        var20 = Hashtables.getEntryKey(var23);
                        var21 = Hashtables.getEntryValue(var23);
                        final SubLObject var24 = oc_inference_datastructures_inference.f25687(var21);
                        assert module0411.NIL != module0035.f1997(var24) : var24;
                        final SubLObject var25 = var24.first();
                        final SubLObject var27;
                        final SubLObject var26 = var27 = module0233.f15370(var25);
                        if (var27.eql(module0411.$ic64$)) {
                            var6 = var21;
                        }
                        else if (var27.eql(module0411.$ic65$)) {
                            var7 = var21;
                        }
                        else {
                            Errors.error((SubLObject)module0411.$ic61$, var4);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var22);
                }
            }
        }
        if (module0411.NIL == Errors.$ignore_mustsP$.getDynamicValue(var5) && module0411.NIL == var6) {
            Errors.error((SubLObject)module0411.$ic66$, var4);
        }
        if (module0411.NIL == Errors.$ignore_mustsP$.getDynamicValue(var5) && module0411.NIL == var7) {
            Errors.error((SubLObject)module0411.$ic67$, var4);
        }
        return Values.values(var6, var7);
    }
    
    public static SubLObject f28578(final SubLObject var4) {
        return f28579(var4);
    }
    
    public static SubLObject f28579(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        var5.resetMultipleValues();
        final SubLObject var6 = f28577(var4);
        final SubLObject var7 = var5.secondMultipleValue();
        var5.resetMultipleValues();
        final SubLObject var8 = oc_inference_datastructures_inference.f25744(var6);
        final SubLObject var9 = oc_inference_datastructures_inference.f25744(var7);
        final SubLObject var10 = Mapping.mapcar((SubLObject)module0411.$ic68$, var8);
        final SubLObject var11 = Mapping.mapcar((SubLObject)module0411.$ic69$, var9);
        final SubLObject var12 = ConsesLow.append(var10, var11);
        final SubLObject var13 = module0346.f23320(var12);
        return var13;
    }
    
    public static SubLObject f28580(final SubLObject var4, final SubLObject var44) {
        final SubLObject var45 = oc_inference_datastructures_inference.f25492(var4);
        if (module0411.NIL == module0065.f4772(var45, (SubLObject)module0411.$ic62$)) {
            final SubLObject var22_45 = var45;
            if (module0411.NIL == module0065.f4775(var22_45, (SubLObject)module0411.$ic62$)) {
                final SubLObject var46 = module0065.f4740(var22_45);
                final SubLObject var47 = (SubLObject)module0411.NIL;
                SubLObject var48;
                SubLObject var49;
                SubLObject var50;
                SubLObject var51;
                SubLObject var52;
                SubLObject var53;
                SubLObject var47_49;
                SubLObject var54;
                SubLObject var47_50;
                SubLObject var55;
                SubLObject var56;
                for (var48 = Sequences.length(var46), var49 = (SubLObject)module0411.NIL, var49 = (SubLObject)module0411.ZERO_INTEGER; var49.numL(var48); var49 = Numbers.add(var49, (SubLObject)module0411.ONE_INTEGER)) {
                    var50 = ((module0411.NIL != var47) ? Numbers.subtract(var48, var49, (SubLObject)module0411.ONE_INTEGER) : var49);
                    var51 = Vectors.aref(var46, var50);
                    if (module0411.NIL == module0065.f4749(var51) || module0411.NIL == module0065.f4773((SubLObject)module0411.$ic62$)) {
                        if (module0411.NIL != module0065.f4749(var51)) {
                            var51 = (SubLObject)module0411.$ic62$;
                        }
                        var52 = oc_inference_datastructures_inference.f25744(var51);
                        var53 = (SubLObject)module0411.NIL;
                        var53 = var52.first();
                        while (module0411.NIL != var52) {
                            var47_49 = oc_inference_datastructures_inference.f25785(var53);
                            var54 = (SubLObject)module0411.NIL;
                            var54 = var47_49.first();
                            while (module0411.NIL != var47_49) {
                                var47_50 = module0366.f24977(var54);
                                var55 = (SubLObject)module0411.NIL;
                                var55 = var47_50.first();
                                while (module0411.NIL != var47_50) {
                                    if (module0411.NIL != module0376.f26656(var55)) {
                                        var56 = module0373.f26181(var55);
                                        if (var44.eql(var56)) {
                                            return (SubLObject)module0411.T;
                                        }
                                    }
                                    var47_50 = var47_50.rest();
                                    var55 = var47_50.first();
                                }
                                var47_49 = var47_49.rest();
                                var54 = var47_49.first();
                            }
                            var52 = var52.rest();
                            var53 = var52.first();
                        }
                    }
                }
            }
            final SubLObject var33_54 = var45;
            if (module0411.NIL == module0065.f4777(var33_54)) {
                final SubLObject var57 = module0065.f4738(var33_54);
                SubLObject var58 = (SubLObject)module0411.NIL;
                SubLObject var59 = (SubLObject)module0411.NIL;
                final Iterator var60 = Hashtables.getEntrySetIterator(var57);
                try {
                    while (Hashtables.iteratorHasNext(var60)) {
                        final Map.Entry var61 = Hashtables.iteratorNextEntry(var60);
                        var58 = Hashtables.getEntryKey(var61);
                        var59 = Hashtables.getEntryValue(var61);
                        SubLObject var62 = oc_inference_datastructures_inference.f25744(var59);
                        SubLObject var63 = (SubLObject)module0411.NIL;
                        var63 = var62.first();
                        while (module0411.NIL != var62) {
                            SubLObject var47_51 = oc_inference_datastructures_inference.f25785(var63);
                            SubLObject var64 = (SubLObject)module0411.NIL;
                            var64 = var47_51.first();
                            while (module0411.NIL != var47_51) {
                                SubLObject var47_52 = module0366.f24977(var64);
                                SubLObject var65 = (SubLObject)module0411.NIL;
                                var65 = var47_52.first();
                                while (module0411.NIL != var47_52) {
                                    if (module0411.NIL != module0376.f26656(var65)) {
                                        final SubLObject var66 = module0373.f26181(var65);
                                        if (var44.eql(var66)) {
                                            return (SubLObject)module0411.T;
                                        }
                                    }
                                    var47_52 = var47_52.rest();
                                    var65 = var47_52.first();
                                }
                                var47_51 = var47_51.rest();
                                var64 = var47_51.first();
                            }
                            var62 = var62.rest();
                            var63 = var62.first();
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var60);
                }
            }
        }
        return (SubLObject)module0411.NIL;
    }
    
    public static SubLObject f28581(final SubLObject var4, final SubLObject var44) {
        final SubLObject var45 = oc_inference_datastructures_inference.f25492(var4);
        if (module0411.NIL == module0065.f4772(var45, (SubLObject)module0411.$ic62$)) {
            final SubLObject var22_57 = var45;
            if (module0411.NIL == module0065.f4775(var22_57, (SubLObject)module0411.$ic62$)) {
                final SubLObject var46 = module0065.f4740(var22_57);
                final SubLObject var47 = (SubLObject)module0411.NIL;
                SubLObject var48;
                SubLObject var49;
                SubLObject var50;
                SubLObject var51;
                SubLObject var52;
                SubLObject var53;
                SubLObject var47_58;
                SubLObject var54;
                SubLObject var47_59;
                SubLObject var55;
                SubLObject var56;
                for (var48 = Sequences.length(var46), var49 = (SubLObject)module0411.NIL, var49 = (SubLObject)module0411.ZERO_INTEGER; var49.numL(var48); var49 = Numbers.add(var49, (SubLObject)module0411.ONE_INTEGER)) {
                    var50 = ((module0411.NIL != var47) ? Numbers.subtract(var48, var49, (SubLObject)module0411.ONE_INTEGER) : var49);
                    var51 = Vectors.aref(var46, var50);
                    if (module0411.NIL == module0065.f4749(var51) || module0411.NIL == module0065.f4773((SubLObject)module0411.$ic62$)) {
                        if (module0411.NIL != module0065.f4749(var51)) {
                            var51 = (SubLObject)module0411.$ic62$;
                        }
                        var52 = oc_inference_datastructures_inference.f25744(var51);
                        var53 = (SubLObject)module0411.NIL;
                        var53 = var52.first();
                        while (module0411.NIL != var52) {
                            var47_58 = oc_inference_datastructures_inference.f25785(var53);
                            var54 = (SubLObject)module0411.NIL;
                            var54 = var47_58.first();
                            while (module0411.NIL != var47_58) {
                                var47_59 = module0366.f24977(var54);
                                var55 = (SubLObject)module0411.NIL;
                                var55 = var47_59.first();
                                while (module0411.NIL != var47_59) {
                                    if (module0411.NIL != module0377.f26776(var55)) {
                                        var56 = module0373.f26181(var55);
                                        if (var44.eql(var56)) {
                                            return (SubLObject)module0411.T;
                                        }
                                    }
                                    var47_59 = var47_59.rest();
                                    var55 = var47_59.first();
                                }
                                var47_58 = var47_58.rest();
                                var54 = var47_58.first();
                            }
                            var52 = var52.rest();
                            var53 = var52.first();
                        }
                    }
                }
            }
            final SubLObject var33_60 = var45;
            if (module0411.NIL == module0065.f4777(var33_60)) {
                final SubLObject var57 = module0065.f4738(var33_60);
                SubLObject var58 = (SubLObject)module0411.NIL;
                SubLObject var59 = (SubLObject)module0411.NIL;
                final Iterator var60 = Hashtables.getEntrySetIterator(var57);
                try {
                    while (Hashtables.iteratorHasNext(var60)) {
                        final Map.Entry var61 = Hashtables.iteratorNextEntry(var60);
                        var58 = Hashtables.getEntryKey(var61);
                        var59 = Hashtables.getEntryValue(var61);
                        SubLObject var62 = oc_inference_datastructures_inference.f25744(var59);
                        SubLObject var63 = (SubLObject)module0411.NIL;
                        var63 = var62.first();
                        while (module0411.NIL != var62) {
                            SubLObject var47_60 = oc_inference_datastructures_inference.f25785(var63);
                            SubLObject var64 = (SubLObject)module0411.NIL;
                            var64 = var47_60.first();
                            while (module0411.NIL != var47_60) {
                                SubLObject var47_61 = module0366.f24977(var64);
                                SubLObject var65 = (SubLObject)module0411.NIL;
                                var65 = var47_61.first();
                                while (module0411.NIL != var47_61) {
                                    if (module0411.NIL != module0377.f26776(var65)) {
                                        final SubLObject var66 = module0373.f26181(var65);
                                        if (var44.eql(var66)) {
                                            return (SubLObject)module0411.T;
                                        }
                                    }
                                    var47_61 = var47_61.rest();
                                    var65 = var47_61.first();
                                }
                                var47_60 = var47_60.rest();
                                var64 = var47_60.first();
                            }
                            var62 = var62.rest();
                            var63 = var62.first();
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var60);
                }
            }
        }
        return (SubLObject)module0411.NIL;
    }
    
    public static SubLObject f28582(final SubLObject var4) {
        SubLObject var5 = (SubLObject)module0411.NIL;
        final SubLObject var6 = oc_inference_datastructures_inference.f25492(var4);
        if (module0411.NIL == module0065.f4772(var6, (SubLObject)module0411.$ic62$)) {
            final SubLObject var22_64 = var6;
            if (module0411.NIL == module0065.f4775(var22_64, (SubLObject)module0411.$ic62$)) {
                final SubLObject var7 = module0065.f4740(var22_64);
                final SubLObject var8 = (SubLObject)module0411.NIL;
                SubLObject var9;
                SubLObject var10;
                SubLObject var11;
                SubLObject var12;
                SubLObject var13;
                SubLObject var14;
                SubLObject var47_65;
                SubLObject var15;
                SubLObject var47_66;
                SubLObject var16;
                SubLObject var17;
                for (var9 = Sequences.length(var7), var10 = (SubLObject)module0411.NIL, var10 = (SubLObject)module0411.ZERO_INTEGER; var10.numL(var9); var10 = Numbers.add(var10, (SubLObject)module0411.ONE_INTEGER)) {
                    var11 = ((module0411.NIL != var8) ? Numbers.subtract(var9, var10, (SubLObject)module0411.ONE_INTEGER) : var10);
                    var12 = Vectors.aref(var7, var11);
                    if (module0411.NIL == module0065.f4749(var12) || module0411.NIL == module0065.f4773((SubLObject)module0411.$ic62$)) {
                        if (module0411.NIL != module0065.f4749(var12)) {
                            var12 = (SubLObject)module0411.$ic62$;
                        }
                        var13 = oc_inference_datastructures_inference.f25744(var12);
                        var14 = (SubLObject)module0411.NIL;
                        var14 = var13.first();
                        while (module0411.NIL != var13) {
                            var47_65 = oc_inference_datastructures_inference.f25785(var14);
                            var15 = (SubLObject)module0411.NIL;
                            var15 = var47_65.first();
                            while (module0411.NIL != var47_65) {
                                var47_66 = module0366.f24977(var15);
                                var16 = (SubLObject)module0411.NIL;
                                var16 = var47_66.first();
                                while (module0411.NIL != var47_66) {
                                    if (module0411.NIL != module0376.f26656(var16)) {
                                        var17 = module0373.f26181(var16);
                                        var5 = (SubLObject)ConsesLow.cons(var17, var5);
                                    }
                                    var47_66 = var47_66.rest();
                                    var16 = var47_66.first();
                                }
                                var47_65 = var47_65.rest();
                                var15 = var47_65.first();
                            }
                            var13 = var13.rest();
                            var14 = var13.first();
                        }
                    }
                }
            }
            final SubLObject var33_67 = var6;
            if (module0411.NIL == module0065.f4777(var33_67)) {
                final SubLObject var18 = module0065.f4738(var33_67);
                SubLObject var19 = (SubLObject)module0411.NIL;
                SubLObject var20 = (SubLObject)module0411.NIL;
                final Iterator var21 = Hashtables.getEntrySetIterator(var18);
                try {
                    while (Hashtables.iteratorHasNext(var21)) {
                        final Map.Entry var22 = Hashtables.iteratorNextEntry(var21);
                        var19 = Hashtables.getEntryKey(var22);
                        var20 = Hashtables.getEntryValue(var22);
                        SubLObject var23 = oc_inference_datastructures_inference.f25744(var20);
                        SubLObject var24 = (SubLObject)module0411.NIL;
                        var24 = var23.first();
                        while (module0411.NIL != var23) {
                            SubLObject var47_67 = oc_inference_datastructures_inference.f25785(var24);
                            SubLObject var25 = (SubLObject)module0411.NIL;
                            var25 = var47_67.first();
                            while (module0411.NIL != var47_67) {
                                SubLObject var47_68 = module0366.f24977(var25);
                                SubLObject var26 = (SubLObject)module0411.NIL;
                                var26 = var47_68.first();
                                while (module0411.NIL != var47_68) {
                                    if (module0411.NIL != module0376.f26656(var26)) {
                                        final SubLObject var27 = module0373.f26181(var26);
                                        var5 = (SubLObject)ConsesLow.cons(var27, var5);
                                    }
                                    var47_68 = var47_68.rest();
                                    var26 = var47_68.first();
                                }
                                var47_67 = var47_67.rest();
                                var25 = var47_67.first();
                            }
                            var23 = var23.rest();
                            var24 = var23.first();
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var21);
                }
            }
        }
        return module0035.f2269(var5, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED);
    }
    
    public static SubLObject f28583(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = module0067.f4880(Symbols.symbol_function((SubLObject)module0411.EQUAL), (SubLObject)module0411.UNPROVIDED);
        final SubLObject var7 = oc_inference_datastructures_inference.f25492(var4);
        if (module0411.NIL == module0065.f4772(var7, (SubLObject)module0411.$ic62$)) {
            final SubLObject var22_71 = var7;
            if (module0411.NIL == module0065.f4775(var22_71, (SubLObject)module0411.$ic62$)) {
                final SubLObject var8 = module0065.f4740(var22_71);
                final SubLObject var9 = (SubLObject)module0411.NIL;
                SubLObject var10;
                SubLObject var11;
                SubLObject var12;
                SubLObject var13;
                SubLObject var14;
                SubLObject var15;
                SubLObject var16;
                for (var10 = Sequences.length(var8), var11 = (SubLObject)module0411.NIL, var11 = (SubLObject)module0411.ZERO_INTEGER; var11.numL(var10); var11 = Numbers.add(var11, (SubLObject)module0411.ONE_INTEGER)) {
                    var12 = ((module0411.NIL != var9) ? Numbers.subtract(var10, var11, (SubLObject)module0411.ONE_INTEGER) : var11);
                    var13 = Vectors.aref(var8, var12);
                    if (module0411.NIL == module0065.f4749(var13) || module0411.NIL == module0065.f4773((SubLObject)module0411.$ic62$)) {
                        if (module0411.NIL != module0065.f4749(var13)) {
                            var13 = (SubLObject)module0411.$ic62$;
                        }
                        var14 = oc_inference_datastructures_inference.f25744(var13);
                        var15 = (SubLObject)module0411.NIL;
                        var15 = var14.first();
                        while (module0411.NIL != var14) {
                            var16 = oc_inference_datastructures_inference.f25793(var15);
                            module0084.f5762(var6, var16, var13);
                            var14 = var14.rest();
                            var15 = var14.first();
                        }
                    }
                }
            }
            final SubLObject var74_75 = var7;
            if (module0411.NIL == module0065.f4777(var74_75) || module0411.NIL == module0065.f4773((SubLObject)module0411.$ic62$)) {
                final SubLObject var17 = module0065.f4738(var74_75);
                SubLObject var18 = module0065.f4739(var74_75);
                final SubLObject var19 = module0065.f4734(var74_75);
                final SubLObject var20 = (SubLObject)((module0411.NIL != module0065.f4773((SubLObject)module0411.$ic62$)) ? module0411.NIL : module0411.$ic62$);
                while (var18.numL(var19)) {
                    final SubLObject var21 = Hashtables.gethash_without_values(var18, var17, var20);
                    if (module0411.NIL == module0065.f4773((SubLObject)module0411.$ic62$) || module0411.NIL == module0065.f4749(var21)) {
                        SubLObject var22 = oc_inference_datastructures_inference.f25744(var21);
                        SubLObject var23 = (SubLObject)module0411.NIL;
                        var23 = var22.first();
                        while (module0411.NIL != var22) {
                            final SubLObject var24 = oc_inference_datastructures_inference.f25793(var23);
                            module0084.f5762(var6, var24, var21);
                            var22 = var22.rest();
                            var23 = var22.first();
                        }
                    }
                    var18 = Numbers.add(var18, (SubLObject)module0411.ONE_INTEGER);
                }
            }
        }
        SubLObject var25 = (SubLObject)module0411.NIL;
        SubLObject var26;
        for (var26 = module0066.f4838(module0067.f4891(var6)); module0411.NIL == module0066.f4841(var26); var26 = module0066.f4840(var26)) {
            var5.resetMultipleValues();
            final SubLObject var27 = module0066.f4839(var26);
            SubLObject var28 = var5.secondMultipleValue();
            var5.resetMultipleValues();
            var28 = Sequences.nreverse(var28);
            var25 = (SubLObject)ConsesLow.cons(var28, var25);
        }
        module0066.f4842(var26);
        var25 = Sort.sort(var25, (SubLObject)module0411.$ic70$, Symbols.symbol_function((SubLObject)module0411.$ic71$));
        return var25;
    }
    
    public static SubLObject f28584(final SubLObject var83, final SubLObject var84, SubLObject var85, SubLObject var13, SubLObject var86) {
        if (var85 == module0411.UNPROVIDED) {
            var85 = (SubLObject)module0411.$ic5$;
        }
        if (var13 == module0411.UNPROVIDED) {
            var13 = module0147.$g2095$.getDynamicValue();
        }
        if (var86 == module0411.UNPROVIDED) {
            var86 = (SubLObject)module0411.$ic72$;
        }
        final SubLThread var87 = SubLProcess.currentSubLThread();
        final SubLObject var88 = f28585(var83, var84, var13);
        final SubLObject var89 = (SubLObject)SubLObjectFactory.makeBoolean(module0411.NIL == module0361.f24109(var86));
        SubLObject var90 = (SubLObject)module0411.NIL;
        if (module0411.NIL != var89) {
            var86 = module0361.f24136((SubLObject)module0411.UNPROVIDED);
        }
        try {
            if (module0411.NIL != module0202.f12597(var88) && module0411.NIL == f28586(var88, var13, (SubLObject)ConsesLow.list((SubLObject)module0411.$ic36$, var86))) {
                SubLObject var92;
                final SubLObject var91 = var92 = module0205.f13207(var88, (SubLObject)module0411.UNPROVIDED);
                SubLObject var93 = (SubLObject)module0411.NIL;
                SubLObject var94 = (SubLObject)module0411.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var92, var91, (SubLObject)module0411.$ic73$);
                var93 = var92.first();
                var92 = var92.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var92, var91, (SubLObject)module0411.$ic73$);
                var94 = var92.first();
                var92 = var92.rest();
                if (module0411.NIL == var92) {
                    if (module0411.NIL != module0205.f13145((SubLObject)module0411.$ic74$, var94, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED) || module0411.NIL == module0409.f28506(var94, var13, (SubLObject)ConsesLow.list((SubLObject)module0411.$ic36$, var86))) {
                        final SubLObject var95 = (SubLObject)ConsesLow.list((SubLObject)module0411.$ic36$, var86, (SubLObject)module0411.$ic37$, (SubLObject)module0411.$ic75$);
                        final SubLObject var96 = module0409.f28515(var93, var13, var95);
                        final SubLObject var97 = (SubLObject)ConsesLow.list(new SubLObject[] { module0411.$ic13$, module0411.$ic76$, module0411.$ic16$, module0411.NIL, module0411.$ic18$, module0411.T, module0411.$ic10$, module0411.ONE_INTEGER, module0411.$ic12$, f28587() });
                        if (module0411.NIL != oc_inference_datastructures_inference.f25431(var96)) {
                            var87.resetMultipleValues();
                            final SubLObject var98 = module0409.f28521(var96, var97);
                            final SubLObject var99 = var87.secondMultipleValue();
                            var87.resetMultipleValues();
                            if (module0411.NIL == module0360.f23871(var99) && module0411.NIL != f28588(var98, var99)) {
                                final SubLObject var100 = oc_inference_datastructures_inference.f25596(var96);
                                final SubLObject var101 = oc_inference_datastructures_inference.f25606(var96);
                                final SubLObject var102 = f28589(var100, var101);
                                final SubLObject var103 = f28590(var96, var102, var94, var13);
                                oc_inference_datastructures_inference.f25471(var96);
                                var90 = module0370.f25902(f28591(var103, var85), var13);
                            }
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var91, (SubLObject)module0411.$ic73$);
                }
            }
        }
        finally {
            final SubLObject var104 = Threads.$is_thread_performing_cleanupP$.currentBinding(var87);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0411.T, var87);
                if (module0411.NIL != var89) {
                    module0361.f24005(var86);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var104, var87);
            }
        }
        return var90;
    }
    
    public static SubLObject f28587() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0411.$g3319$.getDynamicValue(var1);
    }
    
    public static SubLObject f28585(final SubLObject var83, final SubLObject var84, final SubLObject var13) {
        SubLObject var85 = conses_high.copy_tree(module0178.f11282(var83));
        final SubLObject var86 = module0178.f11348(var83);
        SubLObject var87 = (SubLObject)module0411.NIL;
        if (module0411.NIL != var84) {
            var85 = module0233.f15379(var84, var85);
        }
        var87 = module0289.f19418(var85, var13, var86);
        return var87;
    }
    
    public static SubLObject f28586(final SubLObject var103, final SubLObject var13, final SubLObject var104) {
        final SubLThread var105 = SubLProcess.currentSubLThread();
        SubLObject var107;
        final SubLObject var106 = var107 = module0205.f13207(var103, (SubLObject)module0411.UNPROVIDED);
        SubLObject var108 = (SubLObject)module0411.NIL;
        SubLObject var109 = (SubLObject)module0411.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var107, var106, (SubLObject)module0411.$ic73$);
        var108 = var107.first();
        var107 = var107.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var107, var106, (SubLObject)module0411.$ic73$);
        var109 = var107.first();
        var107 = var107.rest();
        if (module0411.NIL == var107) {
            SubLObject var110 = f28592(var109, var13, var104);
            var105.resetMultipleValues();
            final SubLObject var111 = module0282.f18746(var103, var13);
            final SubLObject var112 = var105.secondMultipleValue();
            var105.resetMultipleValues();
            if (module0411.NIL == var110) {
                SubLObject var113 = var111;
                SubLObject var114 = (SubLObject)module0411.NIL;
                var114 = var113.first();
                while (module0411.NIL == var110 && module0411.NIL != var113) {
                    SubLObject var115 = (SubLObject)module0411.NIL;
                    SubLObject var116 = (SubLObject)module0411.ZERO_INTEGER;
                    SubLObject var117 = module0232.f15306(var114);
                    SubLObject var118 = (SubLObject)module0411.NIL;
                    var118 = var117.first();
                    while (module0411.NIL != var117) {
                        final SubLObject var119 = (SubLObject)module0411.$ic77$;
                        if (module0411.NIL == var110) {
                            if (module0411.NIL != module0210.f13624(var118, (SubLObject)module0411.$ic74$)) {
                                var115 = (SubLObject)ConsesLow.cons(var118, var115);
                            }
                            else {
                                var110 = f28592(module0202.f12771(var118), var112, var104);
                            }
                        }
                        var116 = Numbers.add(var116, (SubLObject)module0411.ONE_INTEGER);
                        var117 = var117.rest();
                        var118 = var117.first();
                    }
                    var116 = (SubLObject)module0411.ZERO_INTEGER;
                    var117 = module0232.f15308(var114);
                    var118 = (SubLObject)module0411.NIL;
                    var118 = var117.first();
                    while (module0411.NIL != var117) {
                        final SubLObject var119 = (SubLObject)module0411.$ic59$;
                        if (module0411.NIL == var110) {
                            if (module0411.NIL != module0210.f13624(var118, (SubLObject)module0411.$ic74$)) {
                                var115 = (SubLObject)ConsesLow.cons(var118, var115);
                            }
                            else {
                                var110 = f28592(module0202.f12771(var118), var112, var104);
                            }
                        }
                        var116 = Numbers.add(var116, (SubLObject)module0411.ONE_INTEGER);
                        var117 = var117.rest();
                        var118 = var117.first();
                    }
                    var113 = var113.rest();
                    var114 = var113.first();
                }
            }
            return var110;
        }
        cdestructuring_bind.cdestructuring_bind_error(var106, (SubLObject)module0411.$ic73$);
        return (SubLObject)module0411.NIL;
    }
    
    public static SubLObject f28592(final SubLObject var115, final SubLObject var13, final SubLObject var104) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0411.NIL != module0202.f12691(var115, (SubLObject)module0411.$ic74$) && module0411.NIL != module0409.f28506(var115, var13, var104));
    }
    
    public static SubLObject f28588(final SubLObject var30, final SubLObject var96) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0411.NIL == var30 && module0411.NIL == module0360.f23871(var96));
    }
    
    public static SubLObject f28591(final SubLObject var116, final SubLObject var85) {
        if (!var85.isInteger()) {
            return var116;
        }
        SubLObject var117 = (SubLObject)module0411.NIL;
        SubLObject var118 = var116;
        SubLObject var119 = (SubLObject)module0411.NIL;
        var119 = var118.first();
        while (module0411.NIL != var118) {
            if (module0411.NIL != module0035.f1994(module0035.f2399(var119, (SubLObject)module0411.$ic74$, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED), var85, (SubLObject)module0411.UNPROVIDED)) {
                var117 = (SubLObject)ConsesLow.cons(var119, var117);
            }
            var118 = var118.rest();
            var119 = var118.first();
        }
        return var117;
    }
    
    public static SubLObject f28589(final SubLObject var97, final SubLObject var8) {
        final SubLThread var98 = SubLProcess.currentSubLThread();
        SubLObject var99 = (SubLObject)module0411.NIL;
        final SubLObject var100 = module0364.f24736(var97);
        final SubLObject var102;
        final SubLObject var101 = var102 = module0034.f1854((SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED);
        final SubLObject var103 = module0034.$g879$.currentBinding(var98);
        try {
            module0034.$g879$.bind(var102, var98);
            SubLObject var104 = (SubLObject)module0411.NIL;
            if (module0411.NIL != var102 && module0411.NIL == module0034.f1842(var102)) {
                var104 = module0034.f1869(var102);
                final SubLObject var105 = Threads.current_process();
                if (module0411.NIL == var104) {
                    module0034.f1873(var102, var105);
                }
                else if (!var104.eql(var105)) {
                    Errors.error((SubLObject)module0411.$ic78$);
                }
            }
            try {
                final SubLObject var106 = module0363.f24527(var100);
                SubLObject var107;
                SubLObject var124_125;
                SubLObject var108;
                SubLObject var109;
                SubLObject var110;
                SubLObject var111;
                SubLObject var112;
                SubLObject var47_130;
                SubLObject var113;
                for (var107 = module0032.f1741(var106), var124_125 = (SubLObject)module0411.NIL, var124_125 = module0032.f1742(var107, var106); module0411.NIL == module0032.f1744(var107, var124_125); var124_125 = module0032.f1743(var124_125)) {
                    var108 = module0032.f1745(var107, var124_125);
                    if (module0411.NIL != module0032.f1746(var124_125, var108) && module0411.NIL != module0364.f24748(var108, (SubLObject)module0411.$ic79$) && module0411.NIL != f28593(var108, var8)) {
                        var109 = var108;
                        var110 = module0364.f24735(var109);
                        var111 = (SubLObject)module0411.NIL;
                        var111 = var110.first();
                        while (module0411.NIL != var110) {
                            if (module0411.NIL != module0339.f22743((SubLObject)module0411.NIL, var109, var111)) {
                                var112 = module0364.f24736(var111);
                                if (module0411.NIL == f28594(var112, var8)) {
                                    var47_130 = f28589(var111, var8);
                                    var113 = (SubLObject)module0411.NIL;
                                    var113 = var47_130.first();
                                    while (module0411.NIL != var47_130) {
                                        var99 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var97, var113), var99);
                                        var47_130 = var47_130.rest();
                                        var113 = var47_130.first();
                                    }
                                }
                            }
                            var110 = var110.rest();
                            var111 = var110.first();
                        }
                    }
                }
            }
            finally {
                final SubLObject var100_132 = Threads.$is_thread_performing_cleanupP$.currentBinding(var98);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0411.T, var98);
                    if (module0411.NIL != var102 && module0411.NIL == var104) {
                        module0034.f1873(var102, (SubLObject)module0411.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var100_132, var98);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var103, var98);
        }
        if (module0411.NIL == var99) {
            var99 = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var97));
        }
        return var99;
    }
    
    public static SubLObject f28595(final SubLObject var10, final SubLObject var8) {
        if (module0411.NIL != module0373.f26203(var10, var8)) {
            return (SubLObject)module0411.T;
        }
        if (module0411.NIL == module0373.f26327(var10, var8) && module0411.NIL != module0373.f26331(var10, var8)) {
            final SubLObject var11 = module0363.f24509(var10);
            final SubLObject var12 = module0363.f24507(var10);
            final SubLObject var13 = (SubLObject)ConsesLow.list((SubLObject)module0411.$ic36$, var12);
            final SubLObject var14 = module0370.f25911(var11);
            final SubLObject var15 = module0409.f28506(var14, (SubLObject)module0411.NIL, var13);
            return module0035.sublisp_boolean(var15);
        }
        return (SubLObject)module0411.NIL;
    }
    
    public static SubLObject f28594(final SubLObject var10, final SubLObject var8) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var12 = module0034.$g879$.getDynamicValue(var11);
        SubLObject var13 = (SubLObject)module0411.NIL;
        if (module0411.NIL == var12) {
            return f28595(var10, var8);
        }
        var13 = module0034.f1857(var12, (SubLObject)module0411.$ic80$, (SubLObject)module0411.UNPROVIDED);
        if (module0411.NIL == var13) {
            var13 = module0034.f1807(module0034.f1842(var12), (SubLObject)module0411.$ic80$, (SubLObject)module0411.TWO_INTEGER, (SubLObject)module0411.NIL, (SubLObject)module0411.EQ, (SubLObject)module0411.UNPROVIDED);
            module0034.f1860(var12, (SubLObject)module0411.$ic80$, var13);
        }
        final SubLObject var14 = module0034.f1782(var10, var8);
        final SubLObject var15 = module0034.f1814(var13, var14, (SubLObject)module0411.UNPROVIDED);
        if (var15 != module0411.$ic81$) {
            SubLObject var16 = var15;
            SubLObject var17 = (SubLObject)module0411.NIL;
            var17 = var16.first();
            while (module0411.NIL != var16) {
                SubLObject var18 = var17.first();
                final SubLObject var19 = conses_high.second(var17);
                if (var10.eql(var18.first())) {
                    var18 = var18.rest();
                    if (module0411.NIL != var18 && module0411.NIL == var18.rest() && var8.eql(var18.first())) {
                        return module0034.f1959(var19);
                    }
                }
                var16 = var16.rest();
                var17 = var16.first();
            }
        }
        final SubLObject var20 = Values.arg2(var11.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f28595(var10, var8)));
        module0034.f1836(var13, var14, var15, var20, (SubLObject)ConsesLow.list(var10, var8));
        return module0034.f1959(var20);
    }
    
    public static SubLObject f28593(final SubLObject var126, final SubLObject var8) {
        SubLObject var127 = (SubLObject)module0411.NIL;
        SubLObject var128 = (SubLObject)module0411.NIL;
        SubLObject var129 = module0364.f24735(var126);
        SubLObject var130 = (SubLObject)module0411.NIL;
        var130 = var129.first();
        while (module0411.NIL != var129) {
            if (module0411.NIL != module0339.f22743((SubLObject)module0411.NIL, var126, var130)) {
                final SubLObject var131 = module0364.f24736(var130);
                final SubLObject var132 = module0364.f24737(var130);
                if (module0411.NIL != f28594(var131, var8)) {
                    var127 = (SubLObject)module0411.T;
                }
                else {
                    var128 = (SubLObject)module0411.T;
                }
            }
            var129 = var129.rest();
            var130 = var129.first();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0411.NIL != var127 && module0411.NIL != var128);
    }
    
    public static SubLObject f28590(final SubLObject var4, final SubLObject var149, final SubLObject var93, final SubLObject var13) {
        final SubLThread var150 = SubLProcess.currentSubLThread();
        SubLObject var151 = (SubLObject)module0411.NIL;
        SubLObject var152 = (SubLObject)module0411.NIL;
        var150.resetMultipleValues();
        SubLObject var153 = module0282.f18746(var93, var13);
        final SubLObject var154 = var150.secondMultipleValue();
        var150.resetMultipleValues();
        var153 = module0370.f25905(var153, var154, (SubLObject)module0411.UNPROVIDED);
        SubLObject var155 = (SubLObject)module0411.NIL;
        SubLObject var156 = (SubLObject)module0411.NIL;
        SubLObject var157 = var149;
        SubLObject var158 = (SubLObject)module0411.NIL;
        var158 = var157.first();
        while (module0411.NIL != var157) {
            final SubLObject var159 = Sequences.nreverse(var158);
            final SubLObject var160 = var159.first();
            final SubLObject var161 = module0364.f24736(var160);
            SubLObject var162 = module0363.f24509(var161);
            SubLObject var47_159 = var159;
            SubLObject var163 = (SubLObject)module0411.NIL;
            var163 = var47_159.first();
            while (module0411.NIL != var47_159) {
                final SubLObject var164 = module0364.f24737(var163);
                var162 = module0233.f15376(var164, var162);
                var47_159 = var47_159.rest();
                var163 = var47_159.first();
            }
            SubLObject var47_160 = var162;
            SubLObject var165 = (SubLObject)module0411.NIL;
            var165 = var47_160.first();
            while (module0411.NIL != var47_160) {
                var155 = ConsesLow.append(var155, module0232.f15306(var165));
                var156 = ConsesLow.append(var156, module0232.f15308(var165));
                var47_160 = var47_160.rest();
                var165 = var47_160.first();
            }
            var157 = var157.rest();
            var158 = var157.first();
        }
        final SubLObject var166 = module0232.f15305(var155, var156);
        final SubLObject var167 = oc_inference_datastructures_inference.f25486(var4);
        SubLObject var168;
        var151 = (var168 = (SubLObject)ConsesLow.cons(module0233.f15376(var167, var166), var151));
        SubLObject var169 = (SubLObject)module0411.NIL;
        var169 = var168.first();
        while (module0411.NIL != var168) {
            final SubLObject var170 = module0232.f15306(var169);
            final SubLObject var171 = module0232.f15308(var169);
            SubLObject var47_161 = var153;
            SubLObject var172 = (SubLObject)module0411.NIL;
            var172 = var47_161.first();
            while (module0411.NIL != var47_161) {
                final SubLObject var173 = module0232.f15306(var172);
                final SubLObject var174 = module0232.f15308(var172);
                var152 = (SubLObject)ConsesLow.cons(module0232.f15305(ConsesLow.append(var171, var173), ConsesLow.append(var170, var174)), var152);
                var47_161 = var47_161.rest();
                var172 = var47_161.first();
            }
            var168 = var168.rest();
            var169 = var168.first();
        }
        return var152;
    }
    
    public static SubLObject f28596(final SubLObject var4, final SubLObject var171) {
        final SubLThread var172 = SubLProcess.currentSubLThread();
        assert module0411.NIL != oc_inference_datastructures_inference.f25275(var4) : var4;
        assert module0411.NIL != module0059.f4212(var171) : var171;
        if (module0411.NIL == Errors.$ignore_mustsP$.getDynamicValue(var172) && !oc_inference_datastructures_inference.f25497(var4).eql(module0059.f4254(var171))) {
            Errors.error((SubLObject)module0411.$ic84$, var4, var171);
        }
        try {
            module0408.f28440(var4);
        }
        finally {
            final SubLObject var173 = Threads.$is_thread_performing_cleanupP$.currentBinding(var172);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0411.T, var172);
                module0059.f4268(var171);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var173, var172);
            }
        }
        return var4;
    }
    
    public static SubLObject f28597(final SubLObject var10, SubLObject var172, SubLObject var173) {
        if (var172 == module0411.UNPROVIDED) {
            var172 = (SubLObject)module0411.NIL;
        }
        if (var173 == module0411.UNPROVIDED) {
            var173 = (SubLObject)module0411.NIL;
        }
        assert module0411.NIL != module0363.f24478(var10) : var10;
        return f28598(module0363.f24509(var10), var172, var173);
    }
    
    public static SubLObject f28598(final SubLObject var16, SubLObject var172, SubLObject var173) {
        if (var172 == module0411.UNPROVIDED) {
            var172 = (SubLObject)module0411.NIL;
        }
        if (var173 == module0411.UNPROVIDED) {
            var173 = (SubLObject)module0411.NIL;
        }
        final SubLThread var174 = SubLProcess.currentSubLThread();
        assert module0411.NIL != module0362.f24458(var16) : var16;
        final SubLObject var175 = var172;
        assert module0411.NIL != module0035.f2015(var175) : var175;
        SubLObject var176 = var175;
        SubLObject var177 = (SubLObject)module0411.NIL;
        var177 = var176.first();
        while (module0411.NIL != var176) {
            assert module0411.NIL != module0201.f12580(var177) : var177;
            var176 = var176.rest();
            var177 = var176.first();
        }
        assert module0411.NIL != module0360.f23792(var173) : var173;
        var174.resetMultipleValues();
        final SubLObject var178 = module0370.f25900(var16);
        final SubLObject var179 = var174.secondMultipleValue();
        var174.resetMultipleValues();
        assert module0411.NIL != module0035.f1997(var178) : var178;
        final SubLObject var180 = var178.first();
        return module0409.f28518(var180, var179, var172, var173);
    }
    
    public static SubLObject f28599(final SubLObject var12, final SubLObject var13, final SubLObject var83, final SubLObject var9, final SubLObject var173) {
        final SubLThread var174 = SubLProcess.currentSubLThread();
        SubLObject var175 = (SubLObject)module0411.NIL;
        final SubLObject var176 = module0508.f32437(var12, var13, var83, var9, (SubLObject)module0411.$ic90$);
        final SubLObject var177 = module0508.f32439(var12);
        var175 = oc_inference_datastructures_inference.f25597(var176);
        module0409.f28521(var176, var177);
        oc_inference_datastructures_inference.f25471(var176);
        final SubLObject var178 = module0377.f26761(var175, var83);
        if (module0411.NIL == Errors.$ignore_mustsP$.getDynamicValue(var174) && module0411.NIL == var178) {
            Errors.error((SubLObject)module0411.$ic91$, var83, var9);
        }
        final SubLObject var179 = f28597(var178, (SubLObject)module0411.NIL, var173);
        return var179;
    }
    
    public static SubLObject f28600(final SubLObject var4, final SubLObject var182, SubLObject var183, SubLObject var184, SubLObject var185, SubLObject var186) {
        if (var183 == module0411.UNPROVIDED) {
            var183 = (SubLObject)module0411.$ic92$;
        }
        if (var184 == module0411.UNPROVIDED) {
            var184 = (SubLObject)module0411.$ic93$;
        }
        if (var185 == module0411.UNPROVIDED) {
            var185 = (SubLObject)module0411.NIL;
        }
        if (var186 == module0411.UNPROVIDED) {
            var186 = (SubLObject)module0411.T;
        }
        final SubLThread var187 = SubLProcess.currentSubLThread();
        assert module0411.NIL != oc_inference_datastructures_inference.f25275(var4) : var4;
        assert module0411.NIL != Types.stringp(var182) : var182;
        SubLObject var188 = (SubLObject)module0411.NIL;
        SubLObject var189 = (SubLObject)module0411.NIL;
        try {
            final SubLObject var190 = stream_macros.$stream_requires_locking$.currentBinding(var187);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0411.NIL, var187);
                var189 = compatibility.open_text(var182, var184);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var190, var187);
            }
            if (!var189.isStream()) {
                Errors.error((SubLObject)module0411.$ic95$, var182);
            }
            final SubLObject var189_190 = var189;
            f28601(var4, var189_190, var183, var185, var186);
            var188 = (SubLObject)module0411.T;
        }
        finally {
            final SubLObject var191 = Threads.$is_thread_performing_cleanupP$.currentBinding(var187);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0411.T, var187);
                if (var189.isStream()) {
                    streams_high.close(var189, (SubLObject)module0411.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var191, var187);
            }
        }
        return var188;
    }
    
    public static SubLObject f28601(final SubLObject var4, SubLObject var189, SubLObject var183, SubLObject var185, SubLObject var186) {
        if (var189 == module0411.UNPROVIDED) {
            var189 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var183 == module0411.UNPROVIDED) {
            var183 = (SubLObject)module0411.$ic92$;
        }
        if (var185 == module0411.UNPROVIDED) {
            var185 = (SubLObject)module0411.NIL;
        }
        if (var186 == module0411.UNPROVIDED) {
            var186 = (SubLObject)module0411.T;
        }
        assert module0411.NIL != oc_inference_datastructures_inference.f25275(var4) : var4;
        assert module0411.NIL != streams_high.output_stream_p(var189) : var189;
        final SubLObject var190 = var183;
        if (var190.eql((SubLObject)module0411.$ic92$)) {
            return f28602(var4, var189, var186);
        }
        if (var190.eql((SubLObject)module0411.$ic97$)) {
            return f28603(var4, var189, var185, var186);
        }
        if (var190.eql((SubLObject)module0411.$ic98$)) {
            Errors.error((SubLObject)module0411.$ic99$);
            return (SubLObject)module0411.NIL;
        }
        return Errors.error((SubLObject)module0411.$ic100$);
    }
    
    public static SubLObject f28602(final SubLObject var4, final SubLObject var189, final SubLObject var186) {
        SubLObject var191;
        final SubLObject var190 = var191 = oc_inference_datastructures_inference.f25590(var4);
        SubLObject var192 = (SubLObject)module0411.NIL;
        var192 = var191.first();
        while (module0411.NIL != var191) {
            PrintLow.format(var189, (SubLObject)module0411.$ic101$, var192, (SubLObject)Characters.CHAR_tab);
            var191 = var191.rest();
            var192 = var191.first();
        }
        PrintLow.format(var189, (SubLObject)module0411.$ic102$);
        final SubLObject var193 = oc_inference_datastructures_inference.f25492(var4);
        if (module0411.NIL == module0065.f4772(var193, (SubLObject)module0411.$ic62$)) {
            final SubLObject var22_193 = var193;
            if (module0411.NIL == module0065.f4775(var22_193, (SubLObject)module0411.$ic62$)) {
                final SubLObject var194 = module0065.f4740(var22_193);
                final SubLObject var195 = (SubLObject)module0411.NIL;
                SubLObject var196;
                SubLObject var197;
                SubLObject var198;
                SubLObject var199;
                SubLObject var200;
                SubLObject var201;
                SubLObject var202;
                SubLObject var203;
                for (var196 = Sequences.length(var194), var197 = (SubLObject)module0411.NIL, var197 = (SubLObject)module0411.ZERO_INTEGER; var197.numL(var196); var197 = Numbers.add(var197, (SubLObject)module0411.ONE_INTEGER)) {
                    var198 = ((module0411.NIL != var195) ? Numbers.subtract(var196, var197, (SubLObject)module0411.ONE_INTEGER) : var197);
                    var199 = Vectors.aref(var194, var198);
                    if (module0411.NIL == module0065.f4749(var199) || module0411.NIL == module0065.f4773((SubLObject)module0411.$ic62$)) {
                        if (module0411.NIL != module0065.f4749(var199)) {
                            var199 = (SubLObject)module0411.$ic62$;
                        }
                        var200 = module0409.f28535(var199);
                        var201 = var190;
                        var202 = (SubLObject)module0411.NIL;
                        var202 = var201.first();
                        while (module0411.NIL != var201) {
                            var203 = module0006.f204(module0233.f15369(var202, var200));
                            if (module0411.NIL == var186) {
                                var203 = module0038.f2667(var203, (SubLObject)module0411.$ic103$);
                            }
                            PrintLow.format(var189, (SubLObject)module0411.$ic101$, var203, (SubLObject)Characters.CHAR_tab);
                            var201 = var201.rest();
                            var202 = var201.first();
                        }
                        PrintLow.format(var189, (SubLObject)module0411.$ic102$);
                    }
                }
            }
            final SubLObject var33_194 = var193;
            if (module0411.NIL == module0065.f4777(var33_194)) {
                final SubLObject var204 = module0065.f4738(var33_194);
                SubLObject var205 = (SubLObject)module0411.NIL;
                SubLObject var206 = (SubLObject)module0411.NIL;
                final Iterator var207 = Hashtables.getEntrySetIterator(var204);
                try {
                    while (Hashtables.iteratorHasNext(var207)) {
                        final Map.Entry var208 = Hashtables.iteratorNextEntry(var207);
                        var205 = Hashtables.getEntryKey(var208);
                        var206 = Hashtables.getEntryValue(var208);
                        final SubLObject var209 = module0409.f28535(var206);
                        SubLObject var210 = var190;
                        SubLObject var211 = (SubLObject)module0411.NIL;
                        var211 = var210.first();
                        while (module0411.NIL != var210) {
                            SubLObject var212 = module0006.f204(module0233.f15369(var211, var209));
                            if (module0411.NIL == var186) {
                                var212 = module0038.f2667(var212, (SubLObject)module0411.$ic103$);
                            }
                            PrintLow.format(var189, (SubLObject)module0411.$ic101$, var212, (SubLObject)Characters.CHAR_tab);
                            var210 = var210.rest();
                            var211 = var210.first();
                        }
                        PrintLow.format(var189, (SubLObject)module0411.$ic102$);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var207);
                }
            }
        }
        return var4;
    }
    
    public static SubLObject f28603(final SubLObject var4, final SubLObject var189, final SubLObject var185, final SubLObject var186) {
        final SubLObject var190 = oc_inference_datastructures_inference.f25590(var4);
        final SubLObject var191 = (module0411.NIL != var185) ? var185 : module0601.f36809(var190);
        SubLObject var192 = (SubLObject)module0411.NIL;
        final SubLObject var193 = oc_inference_datastructures_inference.f25492(var4);
        if (module0411.NIL == module0065.f4772(var193, (SubLObject)module0411.$ic62$)) {
            final SubLObject var22_196 = var193;
            if (module0411.NIL == module0065.f4775(var22_196, (SubLObject)module0411.$ic62$)) {
                final SubLObject var194 = module0065.f4740(var22_196);
                final SubLObject var195 = (SubLObject)module0411.NIL;
                SubLObject var196;
                SubLObject var197;
                SubLObject var198;
                SubLObject var199;
                SubLObject var200;
                for (var196 = Sequences.length(var194), var197 = (SubLObject)module0411.NIL, var197 = (SubLObject)module0411.ZERO_INTEGER; var197.numL(var196); var197 = Numbers.add(var197, (SubLObject)module0411.ONE_INTEGER)) {
                    var198 = ((module0411.NIL != var195) ? Numbers.subtract(var196, var197, (SubLObject)module0411.ONE_INTEGER) : var197);
                    var199 = Vectors.aref(var194, var198);
                    if (module0411.NIL == module0065.f4749(var199) || module0411.NIL == module0065.f4773((SubLObject)module0411.$ic62$)) {
                        if (module0411.NIL != module0065.f4749(var199)) {
                            var199 = (SubLObject)module0411.$ic62$;
                        }
                        var200 = module0409.f28535(var199);
                        if (module0411.NIL == conses_high.member(var200, var192, Symbols.symbol_function((SubLObject)module0411.EQL), Symbols.symbol_function((SubLObject)module0411.IDENTITY))) {
                            var192 = (SubLObject)ConsesLow.cons(var200, var192);
                        }
                    }
                }
            }
            final SubLObject var33_198 = var193;
            if (module0411.NIL == module0065.f4777(var33_198)) {
                final SubLObject var201 = module0065.f4738(var33_198);
                SubLObject var202 = (SubLObject)module0411.NIL;
                SubLObject var203 = (SubLObject)module0411.NIL;
                final Iterator var204 = Hashtables.getEntrySetIterator(var201);
                try {
                    while (Hashtables.iteratorHasNext(var204)) {
                        final Map.Entry var205 = Hashtables.iteratorNextEntry(var204);
                        var202 = Hashtables.getEntryKey(var205);
                        var203 = Hashtables.getEntryValue(var205);
                        final SubLObject var206 = module0409.f28535(var203);
                        if (module0411.NIL == conses_high.member(var206, var192, Symbols.symbol_function((SubLObject)module0411.EQL), Symbols.symbol_function((SubLObject)module0411.IDENTITY))) {
                            var192 = (SubLObject)ConsesLow.cons(var206, var192);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var204);
                }
            }
        }
        return module0601.f36810(var192, var191, (SubLObject)module0411.TWO_INTEGER, var189, var186);
    }
    
    public static SubLObject f28604(final SubLObject var3) {
        return module0035.f2169(var3, module0411.$g3320$.getGlobalValue());
    }
    
    public static SubLObject f28605(final SubLObject var199, SubLObject var13, SubLObject var200) {
        if (var13 == module0411.UNPROVIDED) {
            var13 = (SubLObject)module0411.NIL;
        }
        if (var200 == module0411.UNPROVIDED) {
            var200 = (SubLObject)module0411.NIL;
        }
        final SubLObject var201 = f28606(var199, var13, var200);
        if (var201 == module0411.$ic105$) {
            return (SubLObject)module0411.$ic106$;
        }
        return var201;
    }
    
    public static SubLObject f28606(final SubLObject var199, final SubLObject var13, SubLObject var200) {
        final SubLThread var201 = SubLProcess.currentSubLThread();
        var200 = conses_high.copy_list(var200);
        var200 = conses_high.putf(var200, (SubLObject)module0411.$ic10$, (SubLObject)module0411.ONE_INTEGER);
        var200 = conses_high.remf(var200, (SubLObject)module0411.$ic17$);
        var200 = conses_high.remf(var200, (SubLObject)module0411.$ic107$);
        var201.resetMultipleValues();
        final SubLObject var202 = module0410.f28544(var199, var13, var200);
        final SubLObject var203 = var201.secondMultipleValue();
        var201.resetMultipleValues();
        if (module0411.NIL != var202) {
            return (SubLObject)module0411.$ic108$;
        }
        if (module0411.$ic109$ == var203) {
            return (SubLObject)module0411.$ic110$;
        }
        if (module0411.$ic105$ == var203) {
            return (SubLObject)module0411.$ic105$;
        }
        return (SubLObject)module0411.$ic106$;
    }
    
    public static SubLObject f28607(final SubLObject var199, SubLObject var13, SubLObject var200) {
        if (var13 == module0411.UNPROVIDED) {
            var13 = (SubLObject)module0411.NIL;
        }
        if (var200 == module0411.UNPROVIDED) {
            var200 = (SubLObject)module0411.NIL;
        }
        final SubLThread var201 = SubLProcess.currentSubLThread();
        SubLObject var202 = (SubLObject)module0411.NIL;
        var201.resetMultipleValues();
        final SubLObject var203 = module0282.f18747(var199, var13);
        final SubLObject var204 = var201.secondMultipleValue();
        var201.resetMultipleValues();
        var202 = f28608(var203, var204, var200);
        var202 = f28609(var202, var203, var204);
        return var202;
    }
    
    public static SubLObject f28608(final SubLObject var204, final SubLObject var205, final SubLObject var200) {
        SubLObject var206 = (SubLObject)module0411.NIL;
        SubLObject var207 = var204;
        SubLObject var208 = (SubLObject)module0411.NIL;
        var208 = var207.first();
        while (module0411.NIL != var207) {
            SubLObject var209 = (SubLObject)module0411.ZERO_INTEGER;
            SubLObject var47_207 = module0232.f15306(var208);
            SubLObject var210 = (SubLObject)module0411.NIL;
            var210 = var47_207.first();
            while (module0411.NIL != var47_207) {
                final SubLObject var211 = (SubLObject)module0411.$ic77$;
                final SubLObject var212 = module0202.f12840(var210, var211);
                final SubLObject var213 = f28605(var212, var205, var200);
                var206 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var212, var213), var206);
                var209 = Numbers.add(var209, (SubLObject)module0411.ONE_INTEGER);
                var47_207 = var47_207.rest();
                var210 = var47_207.first();
            }
            var209 = (SubLObject)module0411.ZERO_INTEGER;
            SubLObject var47_208 = module0232.f15308(var208);
            var210 = (SubLObject)module0411.NIL;
            var210 = var47_208.first();
            while (module0411.NIL != var47_208) {
                final SubLObject var211 = (SubLObject)module0411.$ic59$;
                final SubLObject var212 = module0202.f12840(var210, var211);
                final SubLObject var213 = f28605(var212, var205, var200);
                var206 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var212, var213), var206);
                var209 = Numbers.add(var209, (SubLObject)module0411.ONE_INTEGER);
                var47_208 = var47_208.rest();
                var210 = var47_208.first();
            }
            var207 = var207.rest();
            var208 = var207.first();
        }
        return Sequences.nreverse(var206);
    }
    
    public static SubLObject f28609(final SubLObject var203, final SubLObject var204, final SubLObject var205) {
        SubLObject var206 = (SubLObject)module0411.NIL;
        SubLObject var207 = var203;
        SubLObject var208 = (SubLObject)module0411.NIL;
        var208 = var207.first();
        while (module0411.NIL != var207) {
            SubLObject var210;
            final SubLObject var209 = var210 = var208;
            SubLObject var211 = (SubLObject)module0411.NIL;
            SubLObject var212 = (SubLObject)module0411.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var210, var209, (SubLObject)module0411.$ic112$);
            var211 = var210.first();
            var210 = var210.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var210, var209, (SubLObject)module0411.$ic112$);
            var212 = var210.first();
            var210 = var210.rest();
            if (module0411.NIL == var210) {
                if (var212 == module0411.$ic110$) {
                    SubLObject var213 = (SubLObject)module0411.NIL;
                    final SubLObject var214 = module0035.f2399(var211, (SubLObject)module0411.$ic74$, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED);
                    final SubLObject var215 = module0202.f12826(var211);
                    final SubLObject var216 = module0202.f12828(var211);
                    final SubLObject var217 = f28610(var204, var203, var215, var216);
                    SubLObject var47_218 = var214;
                    SubLObject var218 = (SubLObject)module0411.NIL;
                    var218 = var47_218.first();
                    while (module0411.NIL != var47_218) {
                        if (module0411.NIL != module0035.f2428(var218, var217, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED)) {
                            var213 = (SubLObject)ConsesLow.cons(var218, var213);
                        }
                        var47_218 = var47_218.rest();
                        var218 = var47_218.first();
                    }
                    if (module0411.NIL != var213) {
                        final SubLObject var220;
                        final SubLObject var219 = var220 = module0358.f23669(var215, var216, var213, var205);
                        if (!var220.eql((SubLObject)module0411.$ic113$)) {
                            if (var220.eql((SubLObject)module0411.$ic114$)) {
                                var208 = (SubLObject)ConsesLow.list(var211, (SubLObject)module0411.$ic106$);
                            }
                            else if (var220.eql((SubLObject)module0411.$ic115$) || var220.eql((SubLObject)module0411.$ic116$) || var220.eql((SubLObject)module0411.$ic117$)) {
                                var208 = (SubLObject)ConsesLow.list(var211, (SubLObject)module0411.$ic108$);
                            }
                            else {
                                Errors.error((SubLObject)module0411.$ic118$, var219);
                            }
                        }
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var209, (SubLObject)module0411.$ic112$);
            }
            var206 = (SubLObject)ConsesLow.cons(var208, var206);
            var207 = var207.rest();
            var208 = var207.first();
        }
        return Sequences.nreverse(var206);
    }
    
    public static SubLObject f28610(final SubLObject var204, final SubLObject var203, final SubLObject var12, final SubLObject var15) {
        SubLObject var205 = (SubLObject)module0411.NIL;
        SubLObject var206 = var204;
        SubLObject var207 = (SubLObject)module0411.NIL;
        var207 = var206.first();
        while (module0411.NIL != var206) {
            SubLObject var208 = (SubLObject)module0411.ZERO_INTEGER;
            SubLObject var47_221 = module0232.f15306(var207);
            SubLObject var209 = (SubLObject)module0411.NIL;
            var209 = var47_221.first();
            while (module0411.NIL != var47_221) {
                final SubLObject var210 = (SubLObject)module0411.$ic77$;
                if (!var12.equal(var209) || !var15.equal(var210)) {
                    final SubLObject var211 = module0202.f12840(var209, var210);
                    final SubLObject var212 = module0035.f2293(var203, var211, Symbols.symbol_function((SubLObject)module0411.EQUAL), (SubLObject)module0411.UNPROVIDED);
                    final SubLObject var213 = var212.first();
                    if (module0411.$ic108$ == var213) {
                        var205 = (SubLObject)ConsesLow.cons(var211, var205);
                    }
                }
                var208 = Numbers.add(var208, (SubLObject)module0411.ONE_INTEGER);
                var47_221 = var47_221.rest();
                var209 = var47_221.first();
            }
            var208 = (SubLObject)module0411.ZERO_INTEGER;
            SubLObject var47_222 = module0232.f15308(var207);
            var209 = (SubLObject)module0411.NIL;
            var209 = var47_222.first();
            while (module0411.NIL != var47_222) {
                final SubLObject var210 = (SubLObject)module0411.$ic59$;
                if (!var12.equal(var209) || !var15.equal(var210)) {
                    final SubLObject var211 = module0202.f12840(var209, var210);
                    final SubLObject var212 = module0035.f2293(var203, var211, Symbols.symbol_function((SubLObject)module0411.EQUAL), (SubLObject)module0411.UNPROVIDED);
                    final SubLObject var213 = var212.first();
                    if (module0411.$ic108$ == var213) {
                        var205 = (SubLObject)ConsesLow.cons(var211, var205);
                    }
                }
                var208 = Numbers.add(var208, (SubLObject)module0411.ONE_INTEGER);
                var47_222 = var47_222.rest();
                var209 = var47_222.first();
            }
            var206 = var206.rest();
            var207 = var206.first();
        }
        return Sequences.nreverse(var205);
    }
    
    public static SubLObject f28611(final SubLObject var228, final SubLObject var229, final SubLObject var199, SubLObject var13, SubLObject var200) {
        if (var13 == module0411.UNPROVIDED) {
            var13 = (SubLObject)module0411.NIL;
        }
        if (var200 == module0411.UNPROVIDED) {
            var200 = (SubLObject)module0411.NIL;
        }
        SubLObject var230 = (SubLObject)module0411.NIL;
        SubLObject var231 = var228;
        SubLObject var232 = (SubLObject)module0411.NIL;
        var232 = var231.first();
        while (module0411.NIL != var231) {
            final SubLObject var233 = module0205.f13250(var232, var229, var199, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED);
            final SubLObject var234 = f28605(var233, var13, var200);
            var230 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var232, var234), var230);
            var231 = var231.rest();
            var232 = var231.first();
        }
        return Sequences.nreverse(var230);
    }
    
    public static SubLObject f28612(final SubLObject var228, final SubLObject var232, final SubLObject var199, SubLObject var13, SubLObject var200) {
        if (var13 == module0411.UNPROVIDED) {
            var13 = (SubLObject)module0411.NIL;
        }
        if (var200 == module0411.UNPROVIDED) {
            var200 = (SubLObject)module0411.NIL;
        }
        final SubLObject var233 = module0205.f13394(var199, var232, (SubLObject)module0411.UNPROVIDED);
        return f28611(var228, var233, var199, var13, var200);
    }
    
    public static SubLObject f28613(final SubLObject var199, final SubLObject var13, final SubLObject var200) {
        final SubLObject var201 = module0202.f12986(var199);
        if (module0411.NIL != module0202.f12595(var201)) {
            f28614(module0205.f13207(var201, (SubLObject)module0411.UNPROVIDED), f28615(Symbols.symbol_function((SubLObject)module0411.$ic121$), (SubLObject)module0411.UNPROVIDED), var13, var200, (SubLObject)module0411.T);
        }
        else {
            f28614(Mapping.mapcan((SubLObject)module0411.$ic122$, module0282.f18747(var201, var13), module0411.EMPTY_SUBL_OBJECT_ARRAY), f28615(Symbols.symbol_function((SubLObject)module0411.$ic121$), (SubLObject)module0411.UNPROVIDED), var13, var200, (SubLObject)module0411.NIL);
        }
        return (SubLObject)module0411.NIL;
    }
    
    public static SubLObject f28614(final SubLObject var234, final SubLObject var235, SubLObject var13, SubLObject var200, SubLObject var236) {
        if (var13 == module0411.UNPROVIDED) {
            var13 = (SubLObject)module0411.NIL;
        }
        if (var200 == module0411.UNPROVIDED) {
            var200 = (SubLObject)module0411.NIL;
        }
        if (var236 == module0411.UNPROVIDED) {
            var236 = (SubLObject)module0411.NIL;
        }
        final SubLThread var237 = SubLProcess.currentSubLThread();
        assert module0411.NIL != Types.listp(var234) : var234;
        assert module0411.NIL != f28616(var235) : var235;
        assert module0411.NIL != Types.booleanp(var236) : var236;
        var200 = conses_high.copy_list(var200);
        SubLObject var238 = Sequences.length(var234);
        SubLObject var239 = module0078.f5368(var234, Symbols.symbol_function((SubLObject)module0411.EQUAL), (SubLObject)module0411.UNPROVIDED);
        SubLObject var240 = module0032.f1726((SubLObject)module0411.ZERO_INTEGER, Symbols.symbol_function((SubLObject)module0411.EQUAL));
        final SubLObject var241 = conses_high.getf(var200, (SubLObject)module0411.$ic12$, (SubLObject)module0411.NIL);
        SubLObject var242 = (SubLObject)module0411.$ic127$;
        SubLObject var243 = (SubLObject)module0411.NIL;
        final SubLObject var244 = (SubLObject)module0411.NIL;
        SubLObject var245 = (SubLObject)module0411.NIL;
        final SubLObject var246 = Time.get_internal_real_time();
        final SubLObject var247 = module0003.f61();
        try {
            var237.throwStack.push(var247);
            final SubLObject var248 = module0003.$g4$.currentBinding(var237);
            try {
                module0003.$g4$.bind((SubLObject)module0411.T, var237);
                SubLObject var249 = (SubLObject)module0411.NIL;
                try {
                    final SubLObject var100_247 = module0003.$g5$.currentBinding(var237);
                    try {
                        module0003.$g5$.bind(Numbers.add((SubLObject)module0411.ONE_INTEGER, module0003.$g5$.getDynamicValue(var237)), var237);
                        var249 = module0003.f62(var241, var247);
                        while (module0411.NIL == module0032.f1729(var239)) {
                            var200 = conses_high.putf(var200, (SubLObject)module0411.$ic12$, var242);
                            final SubLObject var250 = var239;
                            SubLObject var251;
                            SubLObject var252;
                            SubLObject var253;
                            SubLObject var254;
                            SubLObject var255;
                            SubLObject var256;
                            for (var251 = module0032.f1741(var250), var252 = (SubLObject)module0411.NIL, var252 = module0032.f1742(var251, var250); module0411.NIL == module0032.f1744(var251, var252); var252 = module0032.f1743(var252)) {
                                var253 = module0032.f1745(var251, var252);
                                if (module0411.NIL != module0032.f1746(var252, var253)) {
                                    var254 = f28606(var253, var13, var200);
                                    if (var254 == module0411.$ic106$) {
                                        var240 = module0032.f1736(var253, var240, Symbols.symbol_function((SubLObject)module0411.EQUAL));
                                    }
                                    else {
                                        var255 = (SubLObject)((var254 == module0411.$ic105$) ? module0411.$ic106$ : var254);
                                        var256 = (SubLObject)ConsesLow.list(var253, var255);
                                        var245 = (SubLObject)ConsesLow.cons(var256, var245);
                                        f28617(var235, var256);
                                        var238 = Numbers.subtract(var238, (SubLObject)module0411.ONE_INTEGER);
                                    }
                                }
                            }
                            var242 = Numbers.multiply((SubLObject)module0411.TEN_INTEGER, var242);
                            var239 = var240;
                            var240 = module0032.f1726((SubLObject)module0411.ZERO_INTEGER, Symbols.symbol_function((SubLObject)module0411.EQUAL));
                        }
                        if (module0411.NIL != var236) {
                            var237.resetMultipleValues();
                            final SubLObject var257 = module0282.f18747(module0276.f18287(var234, (SubLObject)module0411.UNPROVIDED), var13);
                            final SubLObject var258 = var237.secondMultipleValue();
                            var237.resetMultipleValues();
                            SubLObject var260;
                            final SubLObject var259 = var260 = f28609(var245, var257, var258);
                            SubLObject var261 = (SubLObject)module0411.NIL;
                            var261 = var260.first();
                            while (module0411.NIL != var260) {
                                SubLObject var263;
                                final SubLObject var262 = var263 = var261;
                                SubLObject var264 = (SubLObject)module0411.NIL;
                                SubLObject var265 = (SubLObject)module0411.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var263, var262, (SubLObject)module0411.$ic128$);
                                var264 = var263.first();
                                var263 = var263.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(var263, var262, (SubLObject)module0411.$ic128$);
                                var265 = var263.first();
                                var263 = var263.rest();
                                if (module0411.NIL == var263) {
                                    final SubLObject var266 = module0035.f2293(var245, var264, Symbols.symbol_function((SubLObject)module0411.EQUAL), (SubLObject)module0411.NIL).first();
                                    if (module0411.NIL != var266 && !var266.eql(var265)) {
                                        f28617(var235, var261);
                                    }
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(var262, (SubLObject)module0411.$ic128$);
                                }
                                var260 = var260.rest();
                                var261 = var260.first();
                            }
                        }
                    }
                    finally {
                        module0003.$g5$.rebind(var100_247, var237);
                    }
                }
                finally {
                    final SubLObject var100_248 = Threads.$is_thread_performing_cleanupP$.currentBinding(var237);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0411.T, var237);
                        module0003.f64(var249);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var100_248, var237);
                    }
                }
            }
            finally {
                module0003.$g4$.rebind(var248, var237);
            }
        }
        catch (Throwable var267) {
            var243 = Errors.handleThrowable(var267, var247);
        }
        finally {
            var237.throwStack.pop();
        }
        return Values.values(var244, var243, module0032.f1728(var239));
    }
    
    public static SubLObject f28618(final SubLObject var208, final SubLObject var201) {
        if (module0411.NIL != module0623.f38353(module0623.f38378(Threads.current_process()))) {
            module0623.f38420((SubLObject)ConsesLow.list(var208, var201));
        }
        return print_high.print((SubLObject)ConsesLow.list(var208, var201), (SubLObject)module0411.UNPROVIDED);
    }
    
    public static SubLObject f28616(final SubLObject var3) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var3.isCons() && module0411.NIL != module0035.f1995(var3, (SubLObject)module0411.TWO_INTEGER, (SubLObject)module0411.UNPROVIDED) && var3.first().isFunctionSpec() && conses_high.second(var3).isList());
    }
    
    public static SubLObject f28615(final SubLObject var257, SubLObject var258) {
        if (var258 == module0411.UNPROVIDED) {
            var258 = (SubLObject)module0411.NIL;
        }
        assert module0411.NIL != Types.function_spec_p(var257) : var257;
        assert module0411.NIL != Types.listp(var258) : var258;
        return (SubLObject)ConsesLow.list(var257, var258);
    }
    
    public static SubLObject f28617(final SubLObject var235, SubLObject var259) {
        if (var259 == module0411.UNPROVIDED) {
            var259 = (SubLObject)module0411.NIL;
        }
        assert module0411.NIL != f28616(var235) : var235;
        final SubLObject var260 = f28619(var235);
        final SubLObject var261 = f28620(var235);
        return Functions.apply(var260, ConsesLow.append(var259, var261));
    }
    
    public static SubLObject f28619(final SubLObject var235) {
        return var235.first();
    }
    
    public static SubLObject f28620(final SubLObject var235) {
        return conses_high.second(var235);
    }
    
    public static SubLObject f28621(final SubLObject var261) {
        SubLObject var262 = (SubLObject)module0411.ZERO_INTEGER;
        SubLObject var263 = oc_inference_datastructures_inference.f25744(var261);
        SubLObject var264 = (SubLObject)module0411.NIL;
        var264 = var263.first();
        while (module0411.NIL != var263) {
            final SubLObject var265 = f28622(oc_inference_datastructures_inference.f25775(var264));
            var262 = Numbers.max(var262, var265);
            var263 = var263.rest();
            var264 = var263.first();
        }
        return var262;
    }
    
    public static SubLObject f28622(final SubLObject var265) {
        final SubLThread var266 = SubLProcess.currentSubLThread();
        SubLObject var267 = (SubLObject)module0411.ONE_INTEGER;
        SubLObject var268 = (SubLObject)module0411.NIL;
        final SubLObject var269 = module0077.f5313(Symbols.symbol_function((SubLObject)module0411.EQUAL), (SubLObject)module0411.UNPROVIDED);
        SubLObject var270 = module0333.f22430(var265);
        SubLObject var271 = (SubLObject)module0411.NIL;
        var271 = var270.first();
        while (module0411.NIL != var270) {
            final SubLObject var272 = module0191.f11976(var271);
            if (module0411.NIL != module0161.f10481(var272) && (module0411.NIL == module0191.f11952(var271) || module0411.NIL != module0411.$g3321$.getDynamicValue(var266)) && (module0411.NIL == assertion_handles_oc.f11035(var271) || module0411.NIL != module0178.f11375(var271) || module0411.NIL != module0411.$g3322$.getDynamicValue(var266)) && module0411.NIL != module0259.f16854(module0161.f10557(var272), module0411.$ic131$, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED)) {
                module0077.f5326(var271, var269);
            }
            var270 = var270.rest();
            var271 = var270.first();
        }
        if (module0411.NIL == module0077.f5316(var269)) {
            final SubLObject var273 = module0077.f5311(var269);
            var267 = Numbers.add(var267, var273);
            var268 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0411.$ic132$, var273), var268);
        }
        return Values.values(var267, Sequences.nreverse(var268));
    }
    
    public static SubLObject f28623(final SubLObject var4) {
        assert module0411.NIL != oc_inference_datastructures_inference.f25275(var4) : var4;
        SubLObject var5 = module0032.f1726((SubLObject)module0411.ZERO_INTEGER, Symbols.symbol_function((SubLObject)module0411.EQUAL));
        final SubLObject var6 = oc_inference_datastructures_inference.f25492(var4);
        if (module0411.NIL == module0065.f4772(var6, (SubLObject)module0411.$ic62$)) {
            final SubLObject var22_272 = var6;
            if (module0411.NIL == module0065.f4775(var22_272, (SubLObject)module0411.$ic62$)) {
                final SubLObject var7 = module0065.f4740(var22_272);
                final SubLObject var8 = (SubLObject)module0411.NIL;
                SubLObject var9;
                SubLObject var10;
                SubLObject var11;
                SubLObject var12;
                SubLObject var14;
                SubLObject var13;
                SubLObject var15;
                SubLObject var16;
                SubLObject var17;
                for (var9 = Sequences.length(var7), var10 = (SubLObject)module0411.NIL, var10 = (SubLObject)module0411.ZERO_INTEGER; var10.numL(var9); var10 = Numbers.add(var10, (SubLObject)module0411.ONE_INTEGER)) {
                    var11 = ((module0411.NIL != var8) ? Numbers.subtract(var9, var10, (SubLObject)module0411.ONE_INTEGER) : var10);
                    var12 = Vectors.aref(var7, var11);
                    if (module0411.NIL == module0065.f4749(var12) || module0411.NIL == module0065.f4773((SubLObject)module0411.$ic62$)) {
                        if (module0411.NIL != module0065.f4749(var12)) {
                            var12 = (SubLObject)module0411.$ic62$;
                        }
                        var13 = (var14 = f28624(var12));
                        for (var15 = module0032.f1741(var14), var16 = (SubLObject)module0411.NIL, var16 = module0032.f1742(var15, var14); module0411.NIL == module0032.f1744(var15, var16); var16 = module0032.f1743(var16)) {
                            var17 = module0032.f1745(var15, var16);
                            if (module0411.NIL != module0032.f1746(var16, var17)) {
                                var5 = module0032.f1736(var17, var5, Symbols.symbol_function((SubLObject)module0411.EQUAL));
                            }
                        }
                    }
                }
            }
            final SubLObject var74_274 = var6;
            if (module0411.NIL == module0065.f4777(var74_274) || module0411.NIL == module0065.f4773((SubLObject)module0411.$ic62$)) {
                final SubLObject var18 = module0065.f4738(var74_274);
                SubLObject var19 = module0065.f4739(var74_274);
                final SubLObject var20 = module0065.f4734(var74_274);
                final SubLObject var21 = (SubLObject)((module0411.NIL != module0065.f4773((SubLObject)module0411.$ic62$)) ? module0411.NIL : module0411.$ic62$);
                while (var19.numL(var20)) {
                    final SubLObject var22 = Hashtables.gethash_without_values(var19, var18, var21);
                    if (module0411.NIL == module0065.f4773((SubLObject)module0411.$ic62$) || module0411.NIL == module0065.f4749(var22)) {
                        final SubLObject var24;
                        final SubLObject var23 = var24 = f28624(var22);
                        SubLObject var25;
                        SubLObject var26;
                        SubLObject var27;
                        for (var25 = module0032.f1741(var24), var26 = (SubLObject)module0411.NIL, var26 = module0032.f1742(var25, var24); module0411.NIL == module0032.f1744(var25, var26); var26 = module0032.f1743(var26)) {
                            var27 = module0032.f1745(var25, var26);
                            if (module0411.NIL != module0032.f1746(var26, var27)) {
                                var5 = module0032.f1736(var27, var5, Symbols.symbol_function((SubLObject)module0411.EQUAL));
                            }
                        }
                    }
                    var19 = Numbers.add(var19, (SubLObject)module0411.ONE_INTEGER);
                }
            }
        }
        return module0191.f11964(module0032.f1753(var5));
    }
    
    public static SubLObject f28625(final SubLObject var29) {
        assert module0411.NIL != oc_inference_datastructures_inference.f25684(var29) : var29;
        final SubLObject var30 = f28624(var29);
        return module0191.f11964(module0032.f1753(var30));
    }
    
    public static SubLObject f28624(final SubLObject var29) {
        SubLObject var30 = module0032.f1726((SubLObject)module0411.ZERO_INTEGER, Symbols.symbol_function((SubLObject)module0411.EQUAL));
        SubLObject var31 = oc_inference_datastructures_inference.f25744(var29);
        SubLObject var32 = (SubLObject)module0411.NIL;
        var32 = var31.first();
        while (module0411.NIL != var31) {
            final SubLObject var34;
            final SubLObject var33 = var34 = f28626(var32);
            SubLObject var35;
            SubLObject var36;
            SubLObject var37;
            for (var35 = module0032.f1741(var34), var36 = (SubLObject)module0411.NIL, var36 = module0032.f1742(var35, var34); module0411.NIL == module0032.f1744(var35, var36); var36 = module0032.f1743(var36)) {
                var37 = module0032.f1745(var35, var36);
                if (module0411.NIL != module0032.f1746(var36, var37)) {
                    var30 = module0032.f1736(var37, var30, Symbols.symbol_function((SubLObject)module0411.EQUAL));
                }
            }
            var31 = var31.rest();
            var32 = var31.first();
        }
        return var30;
    }
    
    public static SubLObject f28626(final SubLObject var275) {
        final SubLObject var276 = oc_inference_datastructures_inference.f25775(var275);
        final SubLObject var277 = module0333.f22430(var276);
        return var277;
    }
    
    public static SubLObject f28627(SubLObject var86) {
        if (var86 == module0411.UNPROVIDED) {
            var86 = module0361.f24000();
        }
        assert module0411.NIL != module0361.f24009(var86) : var86;
        final SubLObject var87 = f28628();
        return (SubLObject)((module0411.NIL != var87) ? module0285.f18875(module0202.f12768(module0411.$ic135$, var87, module0361.f23996(var86)), (SubLObject)module0411.UNPROVIDED) : module0411.NIL);
    }
    
    public static SubLObject f28629(SubLObject var4) {
        if (var4 == module0411.UNPROVIDED) {
            var4 = f28630();
        }
        assert module0411.NIL != oc_inference_datastructures_inference.f25275(var4) : var4;
        final SubLObject var5 = f28627(oc_inference_datastructures_inference.f25421(var4));
        return (SubLObject)((module0411.NIL != var5) ? module0285.f18875(module0202.f12768(module0411.$ic136$, oc_inference_datastructures_inference.f25422(var4), var5), (SubLObject)module0411.UNPROVIDED) : module0411.NIL);
    }
    
    public static SubLObject f28631(SubLObject var279) {
        if (var279 == module0411.UNPROVIDED) {
            var279 = (SubLObject)module0411.NIL;
        }
        final SubLObject var280 = Environment.get_machine_name((SubLObject)module0411.UNPROVIDED);
        final SubLObject var281 = module0731.f44782(var280, module0411.$ic137$, (SubLObject)module0411.NIL, (SubLObject)module0411.$ic138$, (SubLObject)module0411.NIL, (SubLObject)module0411.NIL, module0411.$ic139$, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED).first();
        if (module0411.NIL != var279 && module0411.NIL == module0206.f13444(var281)) {
            Errors.warn((SubLObject)module0411.$ic140$, var280);
        }
        return var281;
    }
    
    public static SubLObject f28632(final SubLObject var13, SubLObject var281) {
        if (var281 == module0411.UNPROVIDED) {
            var281 = module0574.f35152();
        }
        final SubLThread var282 = SubLProcess.currentSubLThread();
        SubLObject var283 = f28631((SubLObject)module0411.NIL);
        if (module0411.NIL == module0206.f13444(var283)) {
            final SubLObject var284 = module0111.$g1405$.currentBinding(var282);
            try {
                module0111.$g1405$.bind((SubLObject)module0411.NIL, var282);
                module0574.f35153(var281);
                final SubLObject var285 = Environment.get_machine_name((SubLObject)module0411.UNPROVIDED);
                final SubLObject var286 = module0038.f2867(var285, (SubLObject)module0411.T);
                var283 = module0543.f33623(var286, (SubLObject)module0411.UNPROVIDED);
                module0543.f33631((SubLObject)ConsesLow.listS(module0411.$ic141$, var283, (SubLObject)module0411.$ic142$), var13, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED);
                module0543.f33631((SubLObject)ConsesLow.list(module0411.$ic143$, var283, var285), var13, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED);
            }
            finally {
                module0111.$g1405$.rebind(var284, var282);
            }
        }
        return var283;
    }
    
    public static SubLObject f28628() {
        final SubLObject var284 = f28631((SubLObject)module0411.UNPROVIDED);
        return (SubLObject)((module0411.NIL != var284) ? module0285.f18875(module0202.f12768(module0411.$ic144$, var284, module0018.f967()), (SubLObject)module0411.UNPROVIDED) : module0411.NIL);
    }
    
    public static SubLObject f28633(SubLObject var86, SubLObject var285, SubLObject var281) {
        if (var86 == module0411.UNPROVIDED) {
            var86 = module0361.f24000();
        }
        if (var285 == module0411.UNPROVIDED) {
            var285 = module0411.$ic145$;
        }
        if (var281 == module0411.UNPROVIDED) {
            var281 = module0574.f35152();
        }
        final SubLThread var286 = SubLProcess.currentSubLThread();
        assert module0411.NIL != module0361.f24009(var86) : var86;
        final SubLObject var287 = module0111.$g1405$.currentBinding(var286);
        try {
            module0111.$g1405$.bind((SubLObject)module0411.NIL, var286);
            module0574.f35153(var281);
            final SubLObject var288 = f28627(var86);
            final SubLObject var289 = module0162.f10628((SubLObject)ConsesLow.list(module0411.$ic146$, var285, (SubLObject)ConsesLow.list(module0411.$ic147$, module0612.f37527())));
            if (module0411.NIL != module0206.f13444(var288)) {
                module0543.f33628((SubLObject)ConsesLow.list(module0411.$ic148$, var288, module0361.f24208(var86)), var289, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED);
                module0543.f33628((SubLObject)ConsesLow.list(module0411.$ic149$, var288, module0361.f24228(var86)), var289, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED);
                module0543.f33628((SubLObject)ConsesLow.list(module0411.$ic150$, var288, module0361.f24233(var86)), var289, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED);
            }
        }
        finally {
            module0111.$g1405$.rebind(var287, var286);
        }
        return (SubLObject)module0411.NIL;
    }
    
    public static SubLObject f28634(SubLObject var4, SubLObject var285, SubLObject var281) {
        if (var4 == module0411.UNPROVIDED) {
            var4 = f28630();
        }
        if (var285 == module0411.UNPROVIDED) {
            var285 = module0411.$ic145$;
        }
        if (var281 == module0411.UNPROVIDED) {
            var281 = module0574.f35152();
        }
        final SubLThread var286 = SubLProcess.currentSubLThread();
        assert module0411.NIL != oc_inference_datastructures_inference.f25275(var4) : var4;
        final SubLObject var287 = module0111.$g1405$.currentBinding(var286);
        try {
            module0111.$g1405$.bind((SubLObject)module0411.NIL, var286);
            module0574.f35153(var281);
            final SubLObject var288 = f28629(var4);
            final SubLObject var289 = module0162.f10628((SubLObject)ConsesLow.list(module0411.$ic146$, var285, (SubLObject)ConsesLow.list(module0411.$ic147$, module0612.f37527())));
            assert module0411.NIL != module0206.f13444(var288) : var288;
            final SubLObject var290 = module0612.f37426(oc_inference_datastructures_inference.f25527(var4));
            module0543.f33631((SubLObject)ConsesLow.list(module0411.$ic152$, var288, var290), module0411.$ic145$, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED);
            if (module0411.NIL != oc_inference_datastructures_inference.f25615(var4)) {
                final SubLObject var291 = (SubLObject)ConsesLow.list(module0411.$ic153$, oc_inference_datastructures_inference.f25622(var4));
                final SubLObject var292 = (SubLObject)ConsesLow.list(module0411.$ic153$, oc_inference_datastructures_inference.f25626(var4));
                module0543.f33631((SubLObject)ConsesLow.list(module0411.$ic154$, var288, var291), module0411.$ic145$, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED);
                module0543.f33631((SubLObject)ConsesLow.list(module0411.$ic155$, var288, var292), var289, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED);
            }
            f28635(var4, var288, var289);
        }
        finally {
            module0111.$g1405$.rebind(var287, var286);
        }
        return (SubLObject)module0411.NIL;
    }
    
    public static SubLObject f28635(final SubLObject var4, final SubLObject var287, final SubLObject var13) {
        final SubLObject var288 = oc_inference_datastructures_inference.f25653(var4);
        if (module0411.ZERO_INTEGER.eql(var288) || var288.numG((SubLObject)module0411.TEN_INTEGER)) {
            module0543.f33631((SubLObject)ConsesLow.list(module0411.$ic156$, var287, var288), var13, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED);
        }
        else {
            SubLObject var289 = (SubLObject)module0411.NIL;
            final SubLObject var290 = oc_inference_datastructures_inference.f25492(var4);
            if (module0411.NIL == module0065.f4772(var290, (SubLObject)module0411.$ic62$)) {
                final SubLObject var22_292 = var290;
                if (module0411.NIL == module0065.f4775(var22_292, (SubLObject)module0411.$ic62$)) {
                    final SubLObject var291 = module0065.f4740(var22_292);
                    final SubLObject var292 = (SubLObject)module0411.NIL;
                    SubLObject var293;
                    SubLObject var294;
                    SubLObject var295;
                    SubLObject var296;
                    for (var293 = Sequences.length(var291), var294 = (SubLObject)module0411.NIL, var294 = (SubLObject)module0411.ZERO_INTEGER; var294.numL(var293); var294 = Numbers.add(var294, (SubLObject)module0411.ONE_INTEGER)) {
                        var295 = ((module0411.NIL != var292) ? Numbers.subtract(var293, var294, (SubLObject)module0411.ONE_INTEGER) : var294);
                        var296 = Vectors.aref(var291, var295);
                        if (module0411.NIL == module0065.f4749(var296) || module0411.NIL == module0065.f4773((SubLObject)module0411.$ic62$)) {
                            if (module0411.NIL != module0065.f4749(var296)) {
                                var296 = (SubLObject)module0411.$ic62$;
                            }
                            var289 = (SubLObject)ConsesLow.cons(oc_inference_datastructures_inference.f25687(var296), var289);
                        }
                    }
                }
                final SubLObject var33_293 = var290;
                if (module0411.NIL == module0065.f4777(var33_293)) {
                    final SubLObject var297 = module0065.f4738(var33_293);
                    SubLObject var298 = (SubLObject)module0411.NIL;
                    SubLObject var299 = (SubLObject)module0411.NIL;
                    final Iterator var300 = Hashtables.getEntrySetIterator(var297);
                    try {
                        while (Hashtables.iteratorHasNext(var300)) {
                            final Map.Entry var301 = Hashtables.iteratorNextEntry(var300);
                            var298 = Hashtables.getEntryKey(var301);
                            var299 = Hashtables.getEntryValue(var301);
                            var289 = (SubLObject)ConsesLow.cons(oc_inference_datastructures_inference.f25687(var299), var289);
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(var300);
                    }
                }
            }
            module0543.f33631((SubLObject)ConsesLow.list(module0411.$ic157$, var287, module0233.f15411(var289)), var13, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED);
        }
        return var287;
    }
    
    public static SubLObject f28630() {
        final SubLObject var294 = module0361.f24000();
        if (module0411.NIL != var294) {
            return module0361.f24198(var294);
        }
        return (SubLObject)module0411.NIL;
    }
    
    public static SubLObject f28636(final SubLObject var208, final SubLObject var15, SubLObject var13, SubLObject var200) {
        if (var13 == module0411.UNPROVIDED) {
            var13 = (SubLObject)module0411.NIL;
        }
        if (var200 == module0411.UNPROVIDED) {
            var200 = (SubLObject)module0411.NIL;
        }
        final SubLThread var209 = SubLProcess.currentSubLThread();
        assert module0411.NIL != module0202.f12925(var208) : var208;
        final SubLObject var210 = conses_high.getf(var200, (SubLObject)module0411.$ic31$, (SubLObject)module0411.$ic4$);
        SubLObject var211 = (SubLObject)module0411.NIL;
        final SubLObject var212 = module0147.f9540(var13);
        final SubLObject var213 = module0147.$g2095$.currentBinding(var209);
        final SubLObject var214 = module0147.$g2094$.currentBinding(var209);
        final SubLObject var215 = module0147.$g2096$.currentBinding(var209);
        try {
            module0147.$g2095$.bind(module0147.f9545(var212), var209);
            module0147.$g2094$.bind(module0147.f9546(var212), var209);
            module0147.$g2096$.bind(module0147.f9549(var212), var209);
            var211 = module0205.f13264(module0278.f18414(var208, var13, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED));
        }
        finally {
            module0147.$g2096$.rebind(var215, var209);
            module0147.$g2094$.rebind(var214, var209);
            module0147.$g2095$.rebind(var213, var209);
        }
        return f28637(var211, var15, var13, var210, (SubLObject)module0411.UNPROVIDED);
    }
    
    public static SubLObject f28637(final SubLObject var296, final SubLObject var15, final SubLObject var13, final SubLObject var295, SubLObject var300) {
        if (var300 == module0411.UNPROVIDED) {
            var300 = module0077.f5313(Symbols.symbol_function((SubLObject)module0411.EQUAL), (SubLObject)module0411.UNPROVIDED);
        }
        final SubLThread var301 = SubLProcess.currentSubLThread();
        SubLObject var302 = (SubLObject)module0411.ZERO_INTEGER;
        if (module0411.NIL == module0077.f5320(var296, var300)) {
            module0077.f5326(var296, var300);
            SubLObject var303 = (SubLObject)module0411.NIL;
            final SubLObject var304 = module0202.f12833(var296, (SubLObject)module0411.UNPROVIDED);
            var302 = f28638(var296, var15, var13, var295);
            if (module0411.NIL != module0212.f13762(var304)) {
                final SubLObject var305 = module0147.f9540(var13);
                final SubLObject var306 = module0147.$g2095$.currentBinding(var301);
                final SubLObject var307 = module0147.$g2094$.currentBinding(var301);
                final SubLObject var308 = module0147.$g2096$.currentBinding(var301);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var305), var301);
                    module0147.$g2094$.bind(module0147.f9546(var305), var301);
                    module0147.$g2096$.bind(module0147.f9549(var305), var301);
                    final SubLObject var309 = module0411.$ic160$;
                    if (module0411.NIL != module0158.f10010(var304, (SubLObject)module0411.TWO_INTEGER, var309)) {
                        final SubLObject var310 = module0158.f10011(var304, (SubLObject)module0411.TWO_INTEGER, var309);
                        SubLObject var311 = (SubLObject)module0411.NIL;
                        final SubLObject var312 = (SubLObject)module0411.NIL;
                        while (module0411.NIL == var311) {
                            final SubLObject var313 = module0052.f3695(var310, var312);
                            final SubLObject var314 = (SubLObject)SubLObjectFactory.makeBoolean(!var312.eql(var313));
                            if (module0411.NIL != var314) {
                                SubLObject var315 = (SubLObject)module0411.NIL;
                                try {
                                    var315 = module0158.f10316(var313, (SubLObject)module0411.$ic161$, (SubLObject)module0411.NIL, (SubLObject)module0411.NIL);
                                    SubLObject var306_311 = (SubLObject)module0411.NIL;
                                    final SubLObject var307_312 = (SubLObject)module0411.NIL;
                                    while (module0411.NIL == var306_311) {
                                        final SubLObject var316 = module0052.f3695(var315, var307_312);
                                        final SubLObject var309_314 = (SubLObject)SubLObjectFactory.makeBoolean(!var307_312.eql(var316));
                                        if (module0411.NIL != var309_314) {
                                            final SubLObject var317 = module0178.f11334(var316);
                                            final SubLObject var318 = module0178.f11336(var316);
                                            final SubLObject var319 = (SubLObject)ConsesLow.make_list(module0225.f14762(var317), (SubLObject)module0411.NIL);
                                            SubLObject var320 = module0202.f12720(var317, var319, (SubLObject)module0411.UNPROVIDED);
                                            SubLObject var321 = module0202.f12792(var318);
                                            SubLObject var322 = (SubLObject)module0411.NIL;
                                            var322 = var321.first();
                                            while (module0411.NIL != var321) {
                                                SubLObject var324;
                                                final SubLObject var323 = var324 = module0202.f12751(var322);
                                                SubLObject var325 = (SubLObject)module0411.NIL;
                                                SubLObject var326 = (SubLObject)module0411.NIL;
                                                cdestructuring_bind.destructuring_bind_must_consp(var324, var323, (SubLObject)module0411.$ic162$);
                                                var325 = var324.first();
                                                var324 = var324.rest();
                                                cdestructuring_bind.destructuring_bind_must_consp(var324, var323, (SubLObject)module0411.$ic162$);
                                                var326 = var324.first();
                                                var324 = var324.rest();
                                                if (module0411.NIL == var324) {
                                                    var320 = module0202.f12818(var325, module0202.f12831(var296, var326, (SubLObject)module0411.UNPROVIDED), var320);
                                                }
                                                else {
                                                    cdestructuring_bind.cdestructuring_bind_error(var323, (SubLObject)module0411.$ic162$);
                                                }
                                                var321 = var321.rest();
                                                var322 = var321.first();
                                            }
                                            if (module0411.NIL == module0205.f13220((SubLObject)module0411.NIL, var320, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED)) {
                                                final SubLObject var327 = var320;
                                                if (module0411.NIL == conses_high.member(var327, var303, Symbols.symbol_function((SubLObject)module0411.EQUAL), Symbols.symbol_function((SubLObject)module0411.IDENTITY))) {
                                                    var303 = (SubLObject)ConsesLow.cons(var327, var303);
                                                }
                                            }
                                        }
                                        var306_311 = (SubLObject)SubLObjectFactory.makeBoolean(module0411.NIL == var309_314);
                                    }
                                }
                                finally {
                                    final SubLObject var100_324 = Threads.$is_thread_performing_cleanupP$.currentBinding(var301);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0411.T, var301);
                                        if (module0411.NIL != var315) {
                                            module0158.f10319(var315);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var100_324, var301);
                                    }
                                }
                            }
                            var311 = (SubLObject)SubLObjectFactory.makeBoolean(module0411.NIL == var314);
                        }
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var308, var301);
                    module0147.$g2094$.rebind(var307, var301);
                    module0147.$g2095$.rebind(var306, var301);
                }
            }
            var301.resetMultipleValues();
            final SubLObject var328 = module0337.f22630(var296, (SubLObject)module0411.$ic163$);
            final SubLObject var329 = var301.secondMultipleValue();
            var301.resetMultipleValues();
            if (module0411.NIL != var328) {
                final SubLObject var330 = module0035.f2294(var329, (SubLObject)module0411.$ic164$, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED);
                final SubLObject var331 = module0035.f2294(var329, (SubLObject)module0411.$ic165$, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED);
                final SubLObject var332 = module0147.f9540(var13);
                final SubLObject var333 = module0147.$g2095$.currentBinding(var301);
                final SubLObject var334 = module0147.$g2094$.currentBinding(var301);
                final SubLObject var335 = module0147.$g2096$.currentBinding(var301);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var332), var301);
                    module0147.$g2094$.bind(module0147.f9546(var332), var301);
                    module0147.$g2096$.bind(module0147.f9549(var332), var301);
                    SubLObject var336 = var330;
                    final SubLObject var337 = (SubLObject)module0411.$ic168$;
                    final SubLObject var338 = module0056.f4145(var337);
                    final SubLObject var100_325 = module0139.$g1635$.currentBinding(var301);
                    try {
                        module0139.$g1635$.bind(module0139.f9007(), var301);
                        final SubLObject var339 = (SubLObject)module0411.NIL;
                        final SubLObject var100_326 = module0141.$g1714$.currentBinding(var301);
                        final SubLObject var298_335 = module0141.$g1715$.currentBinding(var301);
                        try {
                            module0141.$g1714$.bind((module0411.NIL != var339) ? var339 : module0141.f9283(), var301);
                            module0141.$g1715$.bind((SubLObject)((module0411.NIL != var339) ? module0411.$ic169$ : module0141.$g1715$.getDynamicValue(var301)), var301);
                            if (module0411.NIL != var339 && module0411.NIL != module0136.f8864() && module0411.NIL == module0141.f9279(var339)) {
                                final SubLObject var340 = module0136.$g1591$.getDynamicValue(var301);
                                if (var340.eql((SubLObject)module0411.$ic170$)) {
                                    module0136.f8870((SubLObject)module0411.ONE_INTEGER, (SubLObject)module0411.$ic171$, var339, (SubLObject)module0411.$ic172$, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED);
                                }
                                else if (var340.eql((SubLObject)module0411.$ic173$)) {
                                    module0136.f8871((SubLObject)module0411.ONE_INTEGER, (SubLObject)module0411.$ic174$, (SubLObject)module0411.$ic171$, var339, (SubLObject)module0411.$ic172$, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED);
                                }
                                else if (var340.eql((SubLObject)module0411.$ic175$)) {
                                    Errors.warn((SubLObject)module0411.$ic171$, var339, (SubLObject)module0411.$ic172$);
                                }
                                else {
                                    Errors.warn((SubLObject)module0411.$ic176$, module0136.$g1591$.getDynamicValue(var301));
                                    Errors.cerror((SubLObject)module0411.$ic174$, (SubLObject)module0411.$ic171$, var339, (SubLObject)module0411.$ic172$);
                                }
                            }
                            final SubLObject var100_327 = module0141.$g1670$.currentBinding(var301);
                            final SubLObject var298_336 = module0141.$g1671$.currentBinding(var301);
                            final SubLObject var299_338 = module0141.$g1672$.currentBinding(var301);
                            final SubLObject var341 = module0141.$g1674$.currentBinding(var301);
                            final SubLObject var342 = module0137.$g1605$.currentBinding(var301);
                            try {
                                module0141.$g1670$.bind(module0137.f8955(module0411.$ic177$), var301);
                                module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0411.$ic177$)), var301);
                                module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0411.$ic177$)), var301);
                                module0141.$g1674$.bind((SubLObject)module0411.NIL, var301);
                                module0137.$g1605$.bind(module0137.f8955(module0411.$ic177$), var301);
                                if (module0411.NIL != module0136.f8865() || module0411.NIL != module0244.f15795(var330, module0137.f8955((SubLObject)module0411.UNPROVIDED))) {
                                    final SubLObject var100_328 = module0141.$g1677$.currentBinding(var301);
                                    final SubLObject var298_337 = module0138.$g1619$.currentBinding(var301);
                                    final SubLObject var299_339 = module0141.$g1674$.currentBinding(var301);
                                    try {
                                        module0141.$g1677$.bind(module0141.f9210(), var301);
                                        module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955(module0411.$ic177$)), var301);
                                        module0141.$g1674$.bind((SubLObject)module0411.NIL, var301);
                                        module0249.f16055(var336, (SubLObject)module0411.UNPROVIDED);
                                        while (module0411.NIL != var336) {
                                            final SubLObject var343 = var336;
                                            if (module0411.NIL != f28639(var343)) {
                                                final SubLObject var344 = module0202.f12768(module0411.$ic178$, var331, var343);
                                                if (module0411.NIL == conses_high.member(var344, var303, Symbols.symbol_function((SubLObject)module0411.EQUAL), Symbols.symbol_function((SubLObject)module0411.IDENTITY))) {
                                                    var303 = (SubLObject)ConsesLow.cons(var344, var303);
                                                }
                                            }
                                            SubLObject var346;
                                            final SubLObject var345 = var346 = module0200.f12443(module0137.f8955(module0411.$ic177$));
                                            SubLObject var347 = (SubLObject)module0411.NIL;
                                            var347 = var346.first();
                                            while (module0411.NIL != var346) {
                                                final SubLObject var100_329 = module0137.$g1605$.currentBinding(var301);
                                                final SubLObject var298_338 = module0141.$g1674$.currentBinding(var301);
                                                try {
                                                    module0137.$g1605$.bind(var347, var301);
                                                    module0141.$g1674$.bind((SubLObject)((module0411.NIL != module0141.f9205((SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0411.NIL == module0141.$g1674$.getDynamicValue(var301)) : module0141.$g1674$.getDynamicValue(var301)), var301);
                                                    final SubLObject var348 = module0228.f15229(var336);
                                                    if (module0411.NIL != module0138.f8992(var348)) {
                                                        final SubLObject var349 = module0242.f15664(var348, module0137.f8955((SubLObject)module0411.UNPROVIDED));
                                                        if (module0411.NIL != var349) {
                                                            final SubLObject var350 = module0245.f15834(var349, module0138.f8979(), module0137.f8955((SubLObject)module0411.UNPROVIDED));
                                                            if (module0411.NIL != var350) {
                                                                SubLObject var351;
                                                                for (var351 = module0066.f4838(module0067.f4891(var350)); module0411.NIL == module0066.f4841(var351); var351 = module0066.f4840(var351)) {
                                                                    var301.resetMultipleValues();
                                                                    final SubLObject var352_353 = module0066.f4839(var351);
                                                                    final SubLObject var352 = var301.secondMultipleValue();
                                                                    var301.resetMultipleValues();
                                                                    if (module0411.NIL != module0147.f9507(var352_353)) {
                                                                        final SubLObject var100_330 = module0138.$g1623$.currentBinding(var301);
                                                                        try {
                                                                            module0138.$g1623$.bind(var352_353, var301);
                                                                            SubLObject var80_356;
                                                                            for (var80_356 = module0066.f4838(module0067.f4891(var352)); module0411.NIL == module0066.f4841(var80_356); var80_356 = module0066.f4840(var80_356)) {
                                                                                var301.resetMultipleValues();
                                                                                final SubLObject var353 = module0066.f4839(var80_356);
                                                                                final SubLObject var354 = var301.secondMultipleValue();
                                                                                var301.resetMultipleValues();
                                                                                if (module0411.NIL != module0141.f9289(var353)) {
                                                                                    final SubLObject var100_331 = module0138.$g1624$.currentBinding(var301);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var353, var301);
                                                                                        final SubLObject var355 = var354;
                                                                                        if (module0411.NIL != module0077.f5302(var355)) {
                                                                                            final SubLObject var356 = module0077.f5333(var355);
                                                                                            SubLObject var357;
                                                                                            SubLObject var358;
                                                                                            SubLObject var359;
                                                                                            for (var357 = module0032.f1741(var356), var358 = (SubLObject)module0411.NIL, var358 = module0032.f1742(var357, var356); module0411.NIL == module0032.f1744(var357, var358); var358 = module0032.f1743(var358)) {
                                                                                                var359 = module0032.f1745(var357, var358);
                                                                                                if (module0411.NIL != module0032.f1746(var358, var359) && module0411.NIL == module0249.f16059(var359, (SubLObject)module0411.UNPROVIDED)) {
                                                                                                    module0249.f16055(var359, (SubLObject)module0411.UNPROVIDED);
                                                                                                    module0056.f4149(var359, var338);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var355.isList()) {
                                                                                            SubLObject var360 = var355;
                                                                                            SubLObject var361 = (SubLObject)module0411.NIL;
                                                                                            var361 = var360.first();
                                                                                            while (module0411.NIL != var360) {
                                                                                                if (module0411.NIL == module0249.f16059(var361, (SubLObject)module0411.UNPROVIDED)) {
                                                                                                    module0249.f16055(var361, (SubLObject)module0411.UNPROVIDED);
                                                                                                    module0056.f4149(var361, var338);
                                                                                                }
                                                                                                var360 = var360.rest();
                                                                                                var361 = var360.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)module0411.$ic179$, var355);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var100_331, var301);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var80_356);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var100_330, var301);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var351);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)module0411.FIVE_INTEGER, (SubLObject)module0411.$ic180$, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (module0411.NIL != module0155.f9785(var348, (SubLObject)module0411.UNPROVIDED)) {
                                                        SubLObject var47_363;
                                                        final SubLObject var362 = var47_363 = ((module0411.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var301), module0137.f8955((SubLObject)module0411.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var301), module0137.f8955((SubLObject)module0411.UNPROVIDED)));
                                                        SubLObject var363 = (SubLObject)module0411.NIL;
                                                        var363 = var47_363.first();
                                                        while (module0411.NIL != var47_363) {
                                                            final SubLObject var100_332 = module0138.$g1625$.currentBinding(var301);
                                                            try {
                                                                module0138.$g1625$.bind(var363, var301);
                                                                final SubLObject var365;
                                                                final SubLObject var364 = var365 = Functions.funcall(var363, var348);
                                                                if (module0411.NIL != module0077.f5302(var365)) {
                                                                    final SubLObject var366 = module0077.f5333(var365);
                                                                    SubLObject var367;
                                                                    SubLObject var368;
                                                                    SubLObject var369;
                                                                    for (var367 = module0032.f1741(var366), var368 = (SubLObject)module0411.NIL, var368 = module0032.f1742(var367, var366); module0411.NIL == module0032.f1744(var367, var368); var368 = module0032.f1743(var368)) {
                                                                        var369 = module0032.f1745(var367, var368);
                                                                        if (module0411.NIL != module0032.f1746(var368, var369) && module0411.NIL == module0249.f16059(var369, (SubLObject)module0411.UNPROVIDED)) {
                                                                            module0249.f16055(var369, (SubLObject)module0411.UNPROVIDED);
                                                                            module0056.f4149(var369, var338);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var365.isList()) {
                                                                    SubLObject var370 = var365;
                                                                    SubLObject var371 = (SubLObject)module0411.NIL;
                                                                    var371 = var370.first();
                                                                    while (module0411.NIL != var370) {
                                                                        if (module0411.NIL == module0249.f16059(var371, (SubLObject)module0411.UNPROVIDED)) {
                                                                            module0249.f16055(var371, (SubLObject)module0411.UNPROVIDED);
                                                                            module0056.f4149(var371, var338);
                                                                        }
                                                                        var370 = var370.rest();
                                                                        var371 = var370.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)module0411.$ic179$, var365);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var100_332, var301);
                                                            }
                                                            var47_363 = var47_363.rest();
                                                            var363 = var47_363.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var298_338, var301);
                                                    module0137.$g1605$.rebind(var100_329, var301);
                                                }
                                                var346 = var346.rest();
                                                var347 = var346.first();
                                            }
                                            var336 = module0056.f4150(var338);
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var299_339, var301);
                                        module0138.$g1619$.rebind(var298_337, var301);
                                        module0141.$g1677$.rebind(var100_328, var301);
                                    }
                                }
                                else {
                                    module0136.f8872((SubLObject)module0411.TWO_INTEGER, (SubLObject)module0411.$ic181$, var330, module0244.f15748(module0137.f8955((SubLObject)module0411.UNPROVIDED)), (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED);
                                }
                            }
                            finally {
                                module0137.$g1605$.rebind(var342, var301);
                                module0141.$g1674$.rebind(var341, var301);
                                module0141.$g1672$.rebind(var299_338, var301);
                                module0141.$g1671$.rebind(var298_336, var301);
                                module0141.$g1670$.rebind(var100_327, var301);
                            }
                        }
                        finally {
                            module0141.$g1715$.rebind(var298_335, var301);
                            module0141.$g1714$.rebind(var100_326, var301);
                        }
                        module0139.f9011(module0139.$g1635$.getDynamicValue(var301));
                    }
                    finally {
                        module0139.$g1635$.rebind(var100_325, var301);
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var335, var301);
                    module0147.$g2094$.rebind(var334, var301);
                    module0147.$g2095$.rebind(var333, var301);
                }
            }
            SubLObject var372 = var303;
            SubLObject var373 = (SubLObject)module0411.NIL;
            var373 = var372.first();
            while (module0411.NIL != var372) {
                var302 = Numbers.add(var302, f28637(var373, var15, var13, var295, var300));
                var372 = var372.rest();
                var373 = var372.first();
            }
        }
        return var302;
    }
    
    public static SubLObject f28639(final SubLObject var344) {
        final SubLThread var345 = SubLProcess.currentSubLThread();
        SubLObject var346 = (SubLObject)module0411.NIL;
        final SubLObject var347 = module0147.$g2094$.currentBinding(var345);
        final SubLObject var348 = module0147.$g2095$.currentBinding(var345);
        try {
            module0147.$g2094$.bind((SubLObject)module0411.$ic182$, var345);
            module0147.$g2095$.bind(module0411.$ic183$, var345);
            SubLObject var349 = (SubLObject)module0411.NIL;
            final SubLObject var350 = module0411.$ic184$;
            if (module0411.NIL != module0158.f10010(var344, (SubLObject)module0411.FIVE_INTEGER, var350)) {
                final SubLObject var351 = module0158.f10011(var344, (SubLObject)module0411.FIVE_INTEGER, var350);
                SubLObject var352 = var346;
                final SubLObject var353 = (SubLObject)module0411.NIL;
                while (module0411.NIL == var352) {
                    final SubLObject var354 = module0052.f3695(var351, var353);
                    final SubLObject var355 = (SubLObject)SubLObjectFactory.makeBoolean(!var353.eql(var354));
                    if (module0411.NIL != var355) {
                        SubLObject var356 = (SubLObject)module0411.NIL;
                        try {
                            var356 = module0158.f10316(var354, (SubLObject)module0411.$ic161$, (SubLObject)module0411.$ic185$, (SubLObject)module0411.NIL);
                            SubLObject var306_369 = var346;
                            final SubLObject var307_370 = (SubLObject)module0411.NIL;
                            while (module0411.NIL == var306_369) {
                                final SubLObject var357 = module0052.f3695(var356, var307_370);
                                final SubLObject var309_372 = (SubLObject)SubLObjectFactory.makeBoolean(!var307_370.eql(var357));
                                if (module0411.NIL != var309_372) {
                                    var349 = module0178.f11331(var357, (SubLObject)module0411.ONE_INTEGER);
                                    SubLObject var358 = (SubLObject)module0411.NIL;
                                    final SubLObject var304_373 = module0411.$ic186$;
                                    if (module0411.NIL != module0158.f10010(var349, (SubLObject)module0411.ONE_INTEGER, var304_373)) {
                                        final SubLObject var305_374 = module0158.f10011(var349, (SubLObject)module0411.ONE_INTEGER, var304_373);
                                        SubLObject var306_370 = var346;
                                        final SubLObject var307_371 = (SubLObject)module0411.NIL;
                                        while (module0411.NIL == var306_370) {
                                            final SubLObject var308_377 = module0052.f3695(var305_374, var307_371);
                                            final SubLObject var309_373 = (SubLObject)SubLObjectFactory.makeBoolean(!var307_371.eql(var308_377));
                                            if (module0411.NIL != var309_373) {
                                                SubLObject var310_379 = (SubLObject)module0411.NIL;
                                                try {
                                                    var310_379 = module0158.f10316(var308_377, (SubLObject)module0411.$ic161$, (SubLObject)module0411.$ic185$, (SubLObject)module0411.NIL);
                                                    SubLObject var306_371 = var346;
                                                    final SubLObject var307_372 = (SubLObject)module0411.NIL;
                                                    while (module0411.NIL == var306_371) {
                                                        final SubLObject var371_382 = module0052.f3695(var310_379, var307_372);
                                                        final SubLObject var309_374 = (SubLObject)SubLObjectFactory.makeBoolean(!var307_372.eql(var371_382));
                                                        if (module0411.NIL != var309_374) {
                                                            var358 = module0178.f11331(var371_382, (SubLObject)module0411.TWO_INTEGER);
                                                            if (module0411.NIL != module0202.f12589(var358, module0411.$ic178$)) {
                                                                var346 = (SubLObject)module0411.T;
                                                            }
                                                        }
                                                        var306_371 = (SubLObject)SubLObjectFactory.makeBoolean(module0411.NIL == var309_374 || module0411.NIL != var346);
                                                    }
                                                }
                                                finally {
                                                    final SubLObject var100_384 = Threads.$is_thread_performing_cleanupP$.currentBinding(var345);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0411.T, var345);
                                                        if (module0411.NIL != var310_379) {
                                                            module0158.f10319(var310_379);
                                                        }
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(var100_384, var345);
                                                    }
                                                }
                                            }
                                            var306_370 = (SubLObject)SubLObjectFactory.makeBoolean(module0411.NIL == var309_373 || module0411.NIL != var346);
                                        }
                                    }
                                }
                                var306_369 = (SubLObject)SubLObjectFactory.makeBoolean(module0411.NIL == var309_372 || module0411.NIL != var346);
                            }
                        }
                        finally {
                            final SubLObject var100_385 = Threads.$is_thread_performing_cleanupP$.currentBinding(var345);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0411.T, var345);
                                if (module0411.NIL != var356) {
                                    module0158.f10319(var356);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var100_385, var345);
                            }
                        }
                    }
                    var352 = (SubLObject)SubLObjectFactory.makeBoolean(module0411.NIL == var355 || module0411.NIL != var346);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var348, var345);
            module0147.$g2094$.rebind(var347, var345);
        }
        return var346;
    }
    
    public static SubLObject f28638(final SubLObject var208, final SubLObject var15, SubLObject var13, SubLObject var295) {
        if (var13 == module0411.UNPROVIDED) {
            var13 = (SubLObject)module0411.NIL;
        }
        if (var295 == module0411.UNPROVIDED) {
            var295 = (SubLObject)module0411.$ic4$;
        }
        return f28640(f28641(var208, var15, var13, var295));
    }
    
    public static SubLObject f28642(final SubLObject var208, final SubLObject var15, SubLObject var13, SubLObject var295) {
        if (var13 == module0411.UNPROVIDED) {
            var13 = (SubLObject)module0411.NIL;
        }
        if (var295 == module0411.UNPROVIDED) {
            var295 = (SubLObject)module0411.$ic4$;
        }
        return module0035.sublisp_boolean(f28641(var208, var15, var13, var295));
    }
    
    public static SubLObject f28643(final SubLObject var208, final SubLObject var15, SubLObject var13) {
        if (var13 == module0411.UNPROVIDED) {
            var13 = (SubLObject)module0411.NIL;
        }
        final SubLThread var209 = SubLProcess.currentSubLThread();
        SubLObject var210 = (SubLObject)module0411.$ic187$;
        final SubLObject var211 = module0339.$g2901$.currentBinding(var209);
        final SubLObject var212 = module0339.$g2902$.currentBinding(var209);
        try {
            module0339.$g2901$.bind((SubLObject)ConsesLow.cons((SubLObject)module0411.NIL, module0339.$g2901$.getDynamicValue(var209)), var209);
            module0339.$g2902$.bind((SubLObject)module0411.NIL, var209);
            SubLObject var214;
            final SubLObject var213 = var214 = f28641(var208, var15, var13, (SubLObject)module0411.UNPROVIDED);
            SubLObject var215 = (SubLObject)module0411.NIL;
            var215 = var214.first();
            while (module0411.NIL != var214) {
                SubLObject var217;
                final SubLObject var216 = var217 = var215;
                SubLObject var218 = (SubLObject)module0411.NIL;
                SubLObject var219 = (SubLObject)module0411.NIL;
                SubLObject var220 = (SubLObject)module0411.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var217, var216, (SubLObject)module0411.$ic188$);
                var218 = var217.first();
                var217 = var217.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var217, var216, (SubLObject)module0411.$ic188$);
                var219 = var217.first();
                var217 = var217.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var217, var216, (SubLObject)module0411.$ic188$);
                var220 = var217.first();
                var217 = var217.rest();
                if (module0411.NIL == var217) {
                    var210 = module0360.f23932(var210, var220);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var216, (SubLObject)module0411.$ic188$);
                }
                var214 = var214.rest();
                var215 = var214.first();
            }
            if (module0411.$ic189$ != var210) {
                final SubLObject var221 = var13;
                final SubLObject var100_393 = module0147.$g2095$.currentBinding(var209);
                final SubLObject var298_394 = module0147.$g2094$.currentBinding(var209);
                final SubLObject var222 = module0147.$g2096$.currentBinding(var209);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var221), var209);
                    module0147.$g2094$.bind(module0147.f9546(var221), var209);
                    module0147.$g2096$.bind(module0147.f9549(var221), var209);
                    if (module0411.NIL != module0483.f31843(var208)) {
                        var210 = (SubLObject)module0411.$ic189$;
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var222, var209);
                    module0147.$g2094$.rebind(var298_394, var209);
                    module0147.$g2095$.rebind(var100_393, var209);
                }
            }
        }
        finally {
            module0339.$g2902$.rebind(var212, var209);
            module0339.$g2901$.rebind(var211, var209);
        }
        return var210;
    }
    
    public static SubLObject f28641(final SubLObject var208, final SubLObject var15, final SubLObject var13, SubLObject var295) {
        if (var295 == module0411.UNPROVIDED) {
            var295 = (SubLObject)module0411.$ic4$;
        }
        final SubLThread var296 = SubLProcess.currentSubLThread();
        SubLObject var297 = (SubLObject)module0411.NIL;
        final SubLObject var298 = module0147.$g2094$.currentBinding(var296);
        final SubLObject var299 = module0147.$g2095$.currentBinding(var296);
        try {
            module0147.$g2094$.bind(module0147.f9531(var13), var296);
            module0147.$g2095$.bind(module0147.f9534(var13), var296);
            var297 = f28644(var208, var15, var295);
        }
        finally {
            module0147.$g2095$.rebind(var299, var296);
            module0147.$g2094$.rebind(var298, var296);
        }
        return var297;
    }
    
    public static SubLObject f28640(final SubLObject var387) {
        SubLObject var388 = (SubLObject)module0411.ZERO_INTEGER;
        SubLObject var389 = var387;
        SubLObject var390 = (SubLObject)module0411.NIL;
        var390 = var389.first();
        while (module0411.NIL != var389) {
            SubLObject var392;
            final SubLObject var391 = var392 = var390;
            SubLObject var393 = (SubLObject)module0411.NIL;
            SubLObject var394 = (SubLObject)module0411.NIL;
            SubLObject var395 = (SubLObject)module0411.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var392, var391, (SubLObject)module0411.$ic188$);
            var393 = var392.first();
            var392 = var392.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var392, var391, (SubLObject)module0411.$ic188$);
            var394 = var392.first();
            var392 = var392.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var392, var391, (SubLObject)module0411.$ic188$);
            var395 = var392.first();
            var392 = var392.rest();
            if (module0411.NIL == var392) {
                var388 = module0360.f23944(var388, var394);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var391, (SubLObject)module0411.$ic188$);
            }
            var389 = var389.rest();
            var390 = var389.first();
        }
        return module0360.f23937(var388);
    }
    
    public static SubLObject f28645(final SubLObject var399, final SubLObject var400) {
        SubLObject var402;
        final SubLObject var401 = var402 = var399.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var402, var401, (SubLObject)module0411.$ic190$);
        final SubLObject var403 = var402.rest();
        var402 = var402.first();
        SubLObject var404 = (SubLObject)module0411.NIL;
        SubLObject var405 = (SubLObject)module0411.NIL;
        SubLObject var406 = (SubLObject)module0411.NIL;
        SubLObject var407 = (SubLObject)module0411.NIL;
        SubLObject var408 = (SubLObject)module0411.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var402, var401, (SubLObject)module0411.$ic190$);
        var404 = var402.first();
        var402 = var402.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var402, var401, (SubLObject)module0411.$ic190$);
        var405 = var402.first();
        var402 = var402.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var402, var401, (SubLObject)module0411.$ic190$);
        var406 = var402.first();
        var402 = var402.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var402, var401, (SubLObject)module0411.$ic190$);
        var407 = var402.first();
        var402 = var402.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var402, var401, (SubLObject)module0411.$ic190$);
        var408 = var402.first();
        var402 = var402.rest();
        SubLObject var409 = (SubLObject)module0411.NIL;
        SubLObject var410 = var402;
        SubLObject var411 = (SubLObject)module0411.NIL;
        SubLObject var411_412 = (SubLObject)module0411.NIL;
        while (module0411.NIL != var410) {
            cdestructuring_bind.destructuring_bind_must_consp(var410, var401, (SubLObject)module0411.$ic190$);
            var411_412 = var410.first();
            var410 = var410.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var410, var401, (SubLObject)module0411.$ic190$);
            if (module0411.NIL == conses_high.member(var411_412, (SubLObject)module0411.$ic191$, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED)) {
                var411 = (SubLObject)module0411.T;
            }
            if (var411_412 == module0411.$ic192$) {
                var409 = var410.first();
            }
            var410 = var410.rest();
        }
        if (module0411.NIL != var411 && module0411.NIL == var409) {
            cdestructuring_bind.cdestructuring_bind_error(var401, (SubLObject)module0411.$ic190$);
        }
        final SubLObject var412 = cdestructuring_bind.property_list_member((SubLObject)module0411.$ic193$, var402);
        final SubLObject var413 = (SubLObject)((module0411.NIL != var412) ? conses_high.cadr(var412) : module0411.NIL);
        final SubLObject var414;
        var402 = (var414 = var403);
        final SubLObject var415 = (SubLObject)module0411.$ic194$;
        final SubLObject var416 = (SubLObject)module0411.$ic195$;
        return (SubLObject)ConsesLow.list((SubLObject)module0411.$ic196$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var415, var408)), (SubLObject)ConsesLow.list((SubLObject)module0411.$ic197$, (SubLObject)ConsesLow.list(var404, var405, var406, var415, (SubLObject)module0411.$ic198$, var416, (SubLObject)module0411.$ic193$, var413), (SubLObject)ConsesLow.listS((SubLObject)module0411.$ic196$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var407, (SubLObject)ConsesLow.list((SubLObject)module0411.$ic199$, var415, var406, var416))), ConsesLow.append(var414, (SubLObject)module0411.NIL))));
    }
    
    public static SubLObject f28646(final SubLObject var206, SubLObject var295) {
        if (var295 == module0411.UNPROVIDED) {
            var295 = (SubLObject)module0411.$ic4$;
        }
        assert module0411.NIL != module0362.f24438(var206) : var206;
        SubLObject var296 = module0107.f7627();
        SubLObject var297 = module0107.f7627();
        SubLObject var298 = module0358.$g3007$.getGlobalValue();
        SubLObject var299 = module0048.f3326();
        final SubLObject var300 = f28647(var206, (SubLObject)module0411.UNPROVIDED);
        SubLObject var301 = (SubLObject)module0411.$ic77$;
        SubLObject var302 = (SubLObject)module0411.ZERO_INTEGER;
        SubLObject var303 = module0232.f15306(var206);
        SubLObject var304 = (SubLObject)module0411.NIL;
        var304 = var303.first();
        while (module0411.NIL != var303) {
            SubLObject var306;
            final SubLObject var305 = var306 = var304;
            SubLObject var307 = (SubLObject)module0411.NIL;
            SubLObject var308 = (SubLObject)module0411.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var306, var305, (SubLObject)module0411.$ic201$);
            var307 = var306.first();
            var306 = var306.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var306, var305, (SubLObject)module0411.$ic201$);
            var308 = var306.first();
            var306 = var306.rest();
            if (module0411.NIL == var306) {
                final SubLObject var309 = module0232.f15318(var206, var301, var302);
                if (module0411.NIL == f28648(var308, var307, var301)) {
                    final SubLObject var310 = module0362.f24434(var307, var308);
                    final SubLObject var311 = f28649(var310, var309);
                    final SubLObject var312 = f28650(var308, var301, var311, var307, var295);
                    final SubLObject var313 = f28651(var308, var301, var307, var295);
                    if (module0411.NIL == f28652(var313, var312, var300) && module0411.NIL != f28653(var313, var312, (SubLObject)module0411.ONE_INTEGER, var299, var298, (SubLObject)module0411.ONE_INTEGER)) {
                        var296 = var310;
                        var297 = var301;
                        var298 = var312;
                        var299 = var313;
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var305, (SubLObject)module0411.$ic201$);
            }
            var302 = Numbers.add(var302, (SubLObject)module0411.ONE_INTEGER);
            var303 = var303.rest();
            var304 = var303.first();
        }
        var301 = (SubLObject)module0411.$ic59$;
        var302 = (SubLObject)module0411.ZERO_INTEGER;
        var303 = module0232.f15308(var206);
        var304 = (SubLObject)module0411.NIL;
        var304 = var303.first();
        while (module0411.NIL != var303) {
            SubLObject var315;
            final SubLObject var314 = var315 = var304;
            SubLObject var307 = (SubLObject)module0411.NIL;
            SubLObject var308 = (SubLObject)module0411.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var315, var314, (SubLObject)module0411.$ic201$);
            var307 = var315.first();
            var315 = var315.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var315, var314, (SubLObject)module0411.$ic201$);
            var308 = var315.first();
            var315 = var315.rest();
            if (module0411.NIL == var315) {
                final SubLObject var309 = module0232.f15318(var206, var301, var302);
                if (module0411.NIL == f28648(var308, var307, var301)) {
                    final SubLObject var310 = module0362.f24434(var307, var308);
                    final SubLObject var311 = f28649(var310, var309);
                    final SubLObject var312 = f28650(var308, var301, var311, var307, var295);
                    final SubLObject var313 = f28651(var308, var301, var307, var295);
                    if (module0411.NIL == f28652(var313, var312, var300) && module0411.NIL != f28653(var313, var312, (SubLObject)module0411.ONE_INTEGER, var299, var298, (SubLObject)module0411.ONE_INTEGER)) {
                        var296 = var310;
                        var297 = var301;
                        var298 = var312;
                        var299 = var313;
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var314, (SubLObject)module0411.$ic201$);
            }
            var302 = Numbers.add(var302, (SubLObject)module0411.ONE_INTEGER);
            var303 = var303.rest();
            var304 = var303.first();
        }
        return Values.values(var296, var297, var298, var299);
    }
    
    public static SubLObject f28647(final SubLObject var206, SubLObject var295) {
        if (var295 == module0411.UNPROVIDED) {
            var295 = (SubLObject)module0411.$ic4$;
        }
        SubLObject var296 = module0358.$g3007$.getGlobalValue();
        SubLObject var297 = (SubLObject)module0411.NIL;
        SubLObject var298 = (SubLObject)module0411.$ic77$;
        SubLObject var299 = (SubLObject)module0411.ZERO_INTEGER;
        SubLObject var300;
        SubLObject var301;
        SubLObject var303;
        SubLObject var302;
        SubLObject var304;
        SubLObject var305;
        SubLObject var306;
        SubLObject var307;
        SubLObject var308;
        SubLObject var309;
        for (var300 = (SubLObject)module0411.NIL, var300 = module0232.f15306(var206); module0411.NIL == var297 && module0411.NIL != var300; var300 = var300.rest()) {
            var301 = var300.first();
            var302 = (var303 = var301);
            var304 = (SubLObject)module0411.NIL;
            var305 = (SubLObject)module0411.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var303, var302, (SubLObject)module0411.$ic201$);
            var304 = var303.first();
            var303 = var303.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var303, var302, (SubLObject)module0411.$ic201$);
            var305 = var303.first();
            var303 = var303.rest();
            if (module0411.NIL == var303) {
                var306 = module0232.f15318(var206, var298, var299);
                if (module0411.$ic113$ != var296 && module0411.NIL == f28648(var305, var304, var298)) {
                    var307 = module0362.f24434(var304, var305);
                    var308 = f28649(var307, var306);
                    var309 = f28650(var305, var298, var308, var304, var295);
                    if (module0411.NIL != module0358.f23676(var309, var296)) {
                        var296 = var309;
                        var297 = Equality.eq((SubLObject)module0411.$ic113$, var296);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var302, (SubLObject)module0411.$ic201$);
            }
            var299 = Numbers.add(var299, (SubLObject)module0411.ONE_INTEGER);
        }
        var298 = (SubLObject)module0411.$ic59$;
        var299 = (SubLObject)module0411.ZERO_INTEGER;
        SubLObject var311;
        SubLObject var310;
        for (var300 = (SubLObject)module0411.NIL, var300 = module0232.f15308(var206); module0411.NIL == var297 && module0411.NIL != var300; var300 = var300.rest()) {
            var301 = var300.first();
            var310 = (var311 = var301);
            var304 = (SubLObject)module0411.NIL;
            var305 = (SubLObject)module0411.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var311, var310, (SubLObject)module0411.$ic201$);
            var304 = var311.first();
            var311 = var311.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var311, var310, (SubLObject)module0411.$ic201$);
            var305 = var311.first();
            var311 = var311.rest();
            if (module0411.NIL == var311) {
                var306 = module0232.f15318(var206, var298, var299);
                if (module0411.$ic113$ != var296 && module0411.NIL == f28648(var305, var304, var298)) {
                    var307 = module0362.f24434(var304, var305);
                    var308 = f28649(var307, var306);
                    var309 = f28650(var305, var298, var308, var304, var295);
                    if (module0411.NIL != module0358.f23676(var309, var296)) {
                        var296 = var309;
                        var297 = Equality.eq((SubLObject)module0411.$ic113$, var296);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var310, (SubLObject)module0411.$ic201$);
            }
            var299 = Numbers.add(var299, (SubLObject)module0411.ONE_INTEGER);
        }
        return var296;
    }
    
    public static SubLObject f28648(final SubLObject var430, final SubLObject var429, final SubLObject var424) {
        return (SubLObject)module0411.NIL;
    }
    
    public static SubLObject f28649(final SubLObject var444, final SubLObject var445) {
        final SubLObject var446 = module0035.f2399(var444, Symbols.symbol_function((SubLObject)module0411.$ic202$), (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED);
        final SubLObject var447 = module0035.f2399(var445, Symbols.symbol_function((SubLObject)module0411.$ic202$), (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED);
        final SubLObject var448 = conses_high.intersection(var446, var447, Symbols.symbol_function((SubLObject)module0411.EQL), (SubLObject)module0411.UNPROVIDED);
        return module0193.f12092(var448);
    }
    
    public static SubLObject f28654(final SubLObject var12, final SubLObject var15, SubLObject var295) {
        if (var295 == module0411.UNPROVIDED) {
            var295 = (SubLObject)module0411.$ic4$;
        }
        return module0376.f26666(var12, var15, var295);
    }
    
    public static SubLObject f28644(final SubLObject var12, final SubLObject var15, SubLObject var295) {
        if (var295 == module0411.UNPROVIDED) {
            var295 = (SubLObject)module0411.$ic4$;
        }
        final SubLThread var296 = SubLProcess.currentSubLThread();
        final SubLObject var297 = module0034.$g879$.getDynamicValue(var296);
        SubLObject var298 = (SubLObject)module0411.NIL;
        if (module0411.NIL == var297) {
            return f28654(var12, var15, var295);
        }
        var298 = module0034.f1857(var297, (SubLObject)module0411.$ic203$, (SubLObject)module0411.UNPROVIDED);
        if (module0411.NIL == var298) {
            var298 = module0034.f1807(module0034.f1842(var297), (SubLObject)module0411.$ic203$, (SubLObject)module0411.THREE_INTEGER, (SubLObject)module0411.NIL, (SubLObject)module0411.EQUAL, (SubLObject)module0411.UNPROVIDED);
            module0034.f1860(var297, (SubLObject)module0411.$ic203$, var298);
        }
        final SubLObject var299 = module0034.f1781(var12, var15, var295);
        final SubLObject var300 = module0034.f1814(var298, var299, (SubLObject)module0411.UNPROVIDED);
        if (var300 != module0411.$ic81$) {
            SubLObject var301 = var300;
            SubLObject var302 = (SubLObject)module0411.NIL;
            var302 = var301.first();
            while (module0411.NIL != var301) {
                SubLObject var303 = var302.first();
                final SubLObject var304 = conses_high.second(var302);
                if (var12.equal(var303.first())) {
                    var303 = var303.rest();
                    if (var15.equal(var303.first())) {
                        var303 = var303.rest();
                        if (module0411.NIL != var303 && module0411.NIL == var303.rest() && var295.equal(var303.first())) {
                            return module0034.f1959(var304);
                        }
                    }
                }
                var301 = var301.rest();
                var302 = var301.first();
            }
        }
        final SubLObject var305 = Values.arg2(var296.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f28654(var12, var15, var295)));
        module0034.f1836(var298, var299, var300, var305, (SubLObject)ConsesLow.list(var12, var15, var295));
        return module0034.f1959(var305);
    }
    
    public static SubLObject f28650(final SubLObject var12, final SubLObject var15, final SubLObject var215, SubLObject var13, SubLObject var295) {
        if (var13 == module0411.UNPROVIDED) {
            var13 = (SubLObject)module0411.NIL;
        }
        if (var295 == module0411.UNPROVIDED) {
            var295 = (SubLObject)module0411.$ic4$;
        }
        final SubLThread var296 = SubLProcess.currentSubLThread();
        SubLObject var297 = (SubLObject)module0411.NIL;
        final SubLObject var298 = var13;
        final SubLObject var299 = module0147.$g2095$.currentBinding(var296);
        final SubLObject var300 = module0147.$g2094$.currentBinding(var296);
        final SubLObject var301 = module0147.$g2096$.currentBinding(var296);
        try {
            module0147.$g2095$.bind(module0147.f9545(var298), var296);
            module0147.$g2094$.bind(module0147.f9546(var298), var296);
            module0147.$g2096$.bind(module0147.f9549(var298), var296);
            if (module0411.NIL != module0193.f12105(var12) && module0411.NIL != module0193.f12105(var13)) {
                var297 = (SubLObject)module0411.$ic113$;
            }
            else if (module0411.NIL == var215) {
                var297 = (SubLObject)module0411.$ic113$;
            }
            else if (module0411.$ic189$ == f28643(var12, var15, var13)) {
                var297 = (SubLObject)module0411.$ic113$;
            }
            else {
                var297 = module0358.f23660(var12, var15, var215, (SubLObject)module0411.$ic204$);
                if (module0411.NIL != module0358.f23663(var297, (SubLObject)module0411.$ic116$) && module0411.NIL == f28644(var12, var15, var295)) {
                    var297 = (SubLObject)module0411.$ic116$;
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var301, var296);
            module0147.$g2094$.rebind(var300, var296);
            module0147.$g2095$.rebind(var299, var296);
        }
        return var297;
    }
    
    public static SubLObject f28651(final SubLObject var208, final SubLObject var15, SubLObject var13, SubLObject var295) {
        if (var13 == module0411.UNPROVIDED) {
            var13 = (SubLObject)module0411.NIL;
        }
        if (var295 == module0411.UNPROVIDED) {
            var295 = (SubLObject)module0411.$ic4$;
        }
        return module0360.f23935(f28638(var208, var15, var13, var295));
    }
    
    public static SubLObject f28652(final SubLObject var391, final SubLObject var220, final SubLObject var449) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0411.NIL != module0360.f23939((SubLObject)module0411.ZERO_INTEGER, var391) && module0411.NIL != module0388.f27595(var220) && module0411.NIL != module0358.f23663(var220, var449));
    }
    
    public static SubLObject f28653(final SubLObject var434, final SubLObject var433, final SubLObject var450, final SubLObject var421, final SubLObject var420, final SubLObject var451) {
        return module0388.f27592(var434, var433, (SubLObject)module0411.$ic205$, var450, var421, var420, (SubLObject)module0411.$ic205$, var451);
    }
    
    public static SubLObject f28655() {
        final SubLObject var4 = module0339.f22757();
        if (module0411.NIL != var4) {
            return module0360.f23987(var4);
        }
        return module0410.f28552();
    }
    
    public static SubLObject f28656(final SubLObject var4, final SubLObject var452, SubLObject var453, SubLObject var148, SubLObject var454) {
        if (var453 == module0411.UNPROVIDED) {
            var453 = (SubLObject)module0411.NIL;
        }
        if (var148 == module0411.UNPROVIDED) {
            var148 = (SubLObject)module0411.NIL;
        }
        if (var454 == module0411.UNPROVIDED) {
            var454 = (SubLObject)module0411.NIL;
        }
        assert module0411.NIL != oc_inference_datastructures_inference.f25275(var4) : var4;
        assert module0411.NIL != module0366.f24916(var452) : var452;
        if (module0411.NIL != var453 && !module0411.areAssertionsDisabledFor(me) && module0411.NIL == Types.hash_table_p(var453)) {
            throw new AssertionError(var453);
        }
        if (!var453.isHashtable()) {
            var453 = Hashtables.make_hash_table(module0361.f24233(oc_inference_datastructures_inference.f25421(var4)), (SubLObject)module0411.EQUAL, (SubLObject)module0411.UNPROVIDED);
        }
        final SubLObject var455 = module0366.f24938(var452);
        final SubLObject var456 = module0366.f24956(var452);
        final SubLObject var457 = module0363.f24509(var456);
        if (var456.eql(oc_inference_datastructures_inference.f25597(var4)) && module0411.NIL == var148) {
            var148 = oc_inference_datastructures_inference.f25486(var4);
        }
        if (module0411.NIL != module0363.f24562(var456) && module0411.NIL == var455 && ((module0411.NIL != module0340.f22789(module0366.f24989(var452)) && module0340.f22791(module0366.f24989(var452)) == module0411.$ic208$) || module0366.f24989(var452) == module0411.$ic209$)) {
            SubLObject var458 = var457;
            SubLObject var459 = (SubLObject)module0411.NIL;
            var459 = var458.first();
            while (module0411.NIL != var458) {
                SubLObject var460 = (SubLObject)module0411.$ic77$;
                SubLObject var461 = (SubLObject)module0411.ZERO_INTEGER;
                SubLObject var47_459 = module0232.f15306(var459);
                SubLObject var462 = (SubLObject)module0411.NIL;
                var462 = var47_459.first();
                while (module0411.NIL != var47_459) {
                    SubLObject var464;
                    final SubLObject var463 = var464 = var462;
                    SubLObject var465 = (SubLObject)module0411.NIL;
                    SubLObject var466 = (SubLObject)module0411.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var464, var463, (SubLObject)module0411.$ic210$);
                    var465 = var464.first();
                    var464 = var464.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var464, var463, (SubLObject)module0411.$ic210$);
                    var466 = var464.first();
                    var464 = var464.rest();
                    if (module0411.NIL == var464) {
                        final SubLObject var467;
                        var466 = (var467 = module0233.f15376(var148, var466));
                        if (module0411.NIL == conses_high.member(var467, var454, (SubLObject)module0411.EQUAL, Symbols.symbol_function((SubLObject)module0411.IDENTITY))) {
                            var454 = (SubLObject)ConsesLow.cons(var467, var454);
                        }
                        SubLObject var47_460 = var454;
                        SubLObject var468 = (SubLObject)module0411.NIL;
                        var468 = var47_460.first();
                        while (module0411.NIL != var47_460) {
                            SubLObject var47_461 = module0366.f24966(var452);
                            SubLObject var469 = (SubLObject)module0411.NIL;
                            var469 = var47_461.first();
                            while (module0411.NIL != var47_461) {
                                module0030.f1600(var468, var469, var453, (SubLObject)module0411.EQUAL);
                                SubLObject var47_462 = module0333.f22429(var469);
                                SubLObject var470 = (SubLObject)module0411.NIL;
                                var470 = var47_462.first();
                                while (module0411.NIL != var47_462) {
                                    module0030.f1600(var468, var470, var453, (SubLObject)module0411.EQUAL);
                                    var47_462 = var47_462.rest();
                                    var470 = var47_462.first();
                                }
                                var47_461 = var47_461.rest();
                                var469 = var47_461.first();
                            }
                            var47_460 = var47_460.rest();
                            var468 = var47_460.first();
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var463, (SubLObject)module0411.$ic210$);
                    }
                    var461 = Numbers.add(var461, (SubLObject)module0411.ONE_INTEGER);
                    var47_459 = var47_459.rest();
                    var462 = var47_459.first();
                }
                var460 = (SubLObject)module0411.$ic59$;
                var461 = (SubLObject)module0411.ZERO_INTEGER;
                SubLObject var47_463 = module0232.f15308(var459);
                var462 = (SubLObject)module0411.NIL;
                var462 = var47_463.first();
                while (module0411.NIL != var47_463) {
                    SubLObject var472;
                    final SubLObject var471 = var472 = var462;
                    SubLObject var465 = (SubLObject)module0411.NIL;
                    SubLObject var466 = (SubLObject)module0411.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var472, var471, (SubLObject)module0411.$ic210$);
                    var465 = var472.first();
                    var472 = var472.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var472, var471, (SubLObject)module0411.$ic210$);
                    var466 = var472.first();
                    var472 = var472.rest();
                    if (module0411.NIL == var472) {
                        final SubLObject var467;
                        var466 = (var467 = module0233.f15376(var148, var466));
                        if (module0411.NIL == conses_high.member(var467, var454, (SubLObject)module0411.EQUAL, Symbols.symbol_function((SubLObject)module0411.IDENTITY))) {
                            var454 = (SubLObject)ConsesLow.cons(var467, var454);
                        }
                        SubLObject var47_464 = var454;
                        SubLObject var468 = (SubLObject)module0411.NIL;
                        var468 = var47_464.first();
                        while (module0411.NIL != var47_464) {
                            SubLObject var47_465 = module0366.f24966(var452);
                            SubLObject var469 = (SubLObject)module0411.NIL;
                            var469 = var47_465.first();
                            while (module0411.NIL != var47_465) {
                                module0030.f1600(var468, var469, var453, (SubLObject)module0411.EQUAL);
                                SubLObject var47_466 = module0333.f22429(var469);
                                SubLObject var470 = (SubLObject)module0411.NIL;
                                var470 = var47_466.first();
                                while (module0411.NIL != var47_466) {
                                    module0030.f1600(var468, var470, var453, (SubLObject)module0411.EQUAL);
                                    var47_466 = var47_466.rest();
                                    var470 = var47_466.first();
                                }
                                var47_465 = var47_465.rest();
                                var469 = var47_465.first();
                            }
                            var47_464 = var47_464.rest();
                            var468 = var47_464.first();
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var471, (SubLObject)module0411.$ic210$);
                    }
                    var461 = Numbers.add(var461, (SubLObject)module0411.ONE_INTEGER);
                    var47_463 = var47_463.rest();
                    var462 = var47_463.first();
                }
                var458 = var458.rest();
                var459 = var458.first();
            }
        }
        else {
            SubLObject var473 = var148;
            if (module0411.NIL != module0340.f22789(module0366.f24989(var452)) && module0340.f22791(module0366.f24989(var452)) == module0411.$ic211$) {
                var473 = module0233.f15362(module0377.f26747(module0366.f24937(var452)), var148);
                var473 = module0233.f15376(module0364.f24737(module0377.f26757(module0366.f24937(var452))), var473);
            }
            SubLObject var474 = var457;
            SubLObject var475 = (SubLObject)module0411.NIL;
            var475 = var474.first();
            while (module0411.NIL != var474) {
                SubLObject var476 = (SubLObject)module0411.$ic77$;
                SubLObject var477 = (SubLObject)module0411.ZERO_INTEGER;
                SubLObject var47_467 = module0232.f15306(var475);
                SubLObject var478 = (SubLObject)module0411.NIL;
                var478 = var47_467.first();
                while (module0411.NIL != var47_467) {
                    SubLObject var480;
                    final SubLObject var479 = var480 = var478;
                    SubLObject var481 = (SubLObject)module0411.NIL;
                    SubLObject var482 = (SubLObject)module0411.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var480, var479, (SubLObject)module0411.$ic210$);
                    var481 = var480.first();
                    var480 = var480.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var480, var479, (SubLObject)module0411.$ic210$);
                    var482 = var480.first();
                    var480 = var480.rest();
                    if (module0411.NIL == var480) {
                        final SubLObject var483;
                        var482 = (var483 = module0233.f15376(var148, var482));
                        if (module0411.NIL == conses_high.member(var483, var454, (SubLObject)module0411.EQUAL, Symbols.symbol_function((SubLObject)module0411.IDENTITY))) {
                            var454 = (SubLObject)ConsesLow.cons(var483, var454);
                        }
                        SubLObject var47_468 = module0366.f24938(var452);
                        SubLObject var484 = (SubLObject)module0411.NIL;
                        var484 = var47_468.first();
                        while (module0411.NIL != var47_468) {
                            var453 = f28656(var4, var484, var453, var473, var454);
                            var47_468 = var47_468.rest();
                            var484 = var47_468.first();
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var479, (SubLObject)module0411.$ic210$);
                    }
                    var477 = Numbers.add(var477, (SubLObject)module0411.ONE_INTEGER);
                    var47_467 = var47_467.rest();
                    var478 = var47_467.first();
                }
                var476 = (SubLObject)module0411.$ic59$;
                var477 = (SubLObject)module0411.ZERO_INTEGER;
                SubLObject var47_469 = module0232.f15308(var475);
                var478 = (SubLObject)module0411.NIL;
                var478 = var47_469.first();
                while (module0411.NIL != var47_469) {
                    SubLObject var486;
                    final SubLObject var485 = var486 = var478;
                    SubLObject var481 = (SubLObject)module0411.NIL;
                    SubLObject var482 = (SubLObject)module0411.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var486, var485, (SubLObject)module0411.$ic210$);
                    var481 = var486.first();
                    var486 = var486.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var486, var485, (SubLObject)module0411.$ic210$);
                    var482 = var486.first();
                    var486 = var486.rest();
                    if (module0411.NIL == var486) {
                        final SubLObject var483;
                        var482 = (var483 = module0233.f15376(var148, var482));
                        if (module0411.NIL == conses_high.member(var483, var454, (SubLObject)module0411.EQUAL, Symbols.symbol_function((SubLObject)module0411.IDENTITY))) {
                            var454 = (SubLObject)ConsesLow.cons(var483, var454);
                        }
                        SubLObject var47_470 = module0366.f24938(var452);
                        SubLObject var484 = (SubLObject)module0411.NIL;
                        var484 = var47_470.first();
                        while (module0411.NIL != var47_470) {
                            var453 = f28656(var4, var484, var453, var473, var454);
                            var47_470 = var47_470.rest();
                            var484 = var47_470.first();
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var485, (SubLObject)module0411.$ic210$);
                    }
                    var477 = Numbers.add(var477, (SubLObject)module0411.ONE_INTEGER);
                    var47_469 = var47_469.rest();
                    var478 = var47_469.first();
                }
                var474 = var474.rest();
                var475 = var474.first();
            }
        }
        return var453;
    }
    
    public static SubLObject f28657(final SubLObject var86) {
        final SubLObject var87 = module0077.f5313(Symbols.symbol_function((SubLObject)module0411.EQL), (SubLObject)module0411.UNPROVIDED);
        final SubLObject var88 = module0361.f24128(var86);
        if (module0411.NIL == module0065.f4772(var88, (SubLObject)module0411.$ic62$)) {
            final SubLObject var22_482 = var88;
            if (module0411.NIL == module0065.f4775(var22_482, (SubLObject)module0411.$ic62$)) {
                final SubLObject var89 = module0065.f4740(var22_482);
                final SubLObject var90 = (SubLObject)module0411.NIL;
                SubLObject var91;
                SubLObject var92;
                SubLObject var93;
                SubLObject var94;
                for (var91 = Sequences.length(var89), var92 = (SubLObject)module0411.NIL, var92 = (SubLObject)module0411.ZERO_INTEGER; var92.numL(var91); var92 = Numbers.add(var92, (SubLObject)module0411.ONE_INTEGER)) {
                    var93 = ((module0411.NIL != var90) ? Numbers.subtract(var91, var92, (SubLObject)module0411.ONE_INTEGER) : var92);
                    var94 = Vectors.aref(var89, var93);
                    if (module0411.NIL == module0065.f4749(var94) || module0411.NIL == module0065.f4773((SubLObject)module0411.$ic62$)) {
                        if (module0411.NIL != module0065.f4749(var94)) {
                            var94 = (SubLObject)module0411.$ic62$;
                        }
                        module0078.f5374(module0035.f2399(module0363.f24509(var94), Symbols.symbol_function((SubLObject)module0411.$ic212$), (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED), var87);
                    }
                }
            }
            final SubLObject var33_484 = var88;
            if (module0411.NIL == module0065.f4777(var33_484)) {
                final SubLObject var95 = module0065.f4738(var33_484);
                SubLObject var96 = (SubLObject)module0411.NIL;
                SubLObject var97 = (SubLObject)module0411.NIL;
                final Iterator var98 = Hashtables.getEntrySetIterator(var95);
                try {
                    while (Hashtables.iteratorHasNext(var98)) {
                        final Map.Entry var99 = Hashtables.iteratorNextEntry(var98);
                        var96 = Hashtables.getEntryKey(var99);
                        var97 = Hashtables.getEntryValue(var99);
                        module0078.f5374(module0035.f2399(module0363.f24509(var97), Symbols.symbol_function((SubLObject)module0411.$ic212$), (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED), var87);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var98);
                }
            }
        }
        return module0077.f5312(var87);
    }
    
    public static SubLObject f28658(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (module0411.NIL != module0173.f10955(var3) && module0411.NIL == module0077.f5320(var3, module0411.$g3323$.getDynamicValue(var4)) && module0411.NIL == module0569.f34917(var3)) {
            module0077.f5326(var3, module0411.$g3323$.getDynamicValue(var4));
            if (module0411.NIL != module0411.$g3324$.getDynamicValue(var4)) {
                module0006.f218(module0411.$g3324$.getDynamicValue(var4), (SubLObject)module0411.$ic213$, var3, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED);
            }
            return var3;
        }
        return (SubLObject)module0411.NIL;
    }
    
    public static SubLObject f28659(final SubLObject var276, SubLObject var485, SubLObject var486) {
        if (var485 == module0411.UNPROVIDED) {
            var485 = (SubLObject)module0411.NIL;
        }
        if (var486 == module0411.UNPROVIDED) {
            var486 = (SubLObject)module0411.NIL;
        }
        final SubLThread var487 = SubLProcess.currentSubLThread();
        if (module0411.NIL == var485) {
            var485 = module0077.f5313(Symbols.symbol_function((SubLObject)module0411.EQL), (SubLObject)module0411.UNPROVIDED);
        }
        final SubLObject var488 = module0411.$g3323$.currentBinding(var487);
        final SubLObject var489 = module0411.$g3324$.currentBinding(var487);
        try {
            module0411.$g3323$.bind(var485, var487);
            module0411.$g3324$.bind(var486, var487);
            module0205.f13228(Symbols.symbol_function((SubLObject)module0411.$ic214$), var276, (SubLObject)module0411.T, (SubLObject)module0411.UNPROVIDED);
        }
        finally {
            module0411.$g3324$.rebind(var489, var487);
            module0411.$g3323$.rebind(var488, var487);
        }
        return var485;
    }
    
    public static SubLObject f28660(final SubLObject var4, SubLObject var485) {
        if (var485 == module0411.UNPROVIDED) {
            var485 = (SubLObject)module0411.NIL;
        }
        final SubLThread var486 = SubLProcess.currentSubLThread();
        if (module0411.NIL == var485) {
            var485 = module0077.f5313(Symbols.symbol_function((SubLObject)module0411.EQL), (SubLObject)module0411.UNPROVIDED);
        }
        final SubLObject var487 = module0411.$g3323$.currentBinding(var486);
        try {
            module0411.$g3323$.bind(var485, var486);
            final SubLObject var488 = oc_inference_datastructures_inference.f25485(var4);
            final SubLObject var489 = oc_inference_datastructures_inference.f25487(var4);
            final SubLObject var490 = oc_inference_datastructures_inference.f25484(var4);
            final SubLObject var491 = oc_inference_datastructures_inference.f25811(var4);
            var486.resetMultipleValues();
            final SubLObject var492 = module0333.f22431(var491, var490, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED);
            final SubLObject var493 = var486.secondMultipleValue();
            var486.resetMultipleValues();
            module0205.f13228(Symbols.symbol_function((SubLObject)module0411.$ic214$), var488, (SubLObject)module0411.T, (SubLObject)module0411.UNPROVIDED);
            module0205.f13228(Symbols.symbol_function((SubLObject)module0411.$ic214$), var489, (SubLObject)module0411.T, (SubLObject)module0411.UNPROVIDED);
            module0205.f13228(Symbols.symbol_function((SubLObject)module0411.$ic214$), var490, (SubLObject)module0411.T, (SubLObject)module0411.UNPROVIDED);
            final SubLObject var494 = oc_inference_datastructures_inference.f25492(var4);
            if (module0411.NIL == module0065.f4772(var494, (SubLObject)module0411.$ic62$)) {
                final SubLObject var22_491 = var494;
                if (module0411.NIL == module0065.f4775(var22_491, (SubLObject)module0411.$ic62$)) {
                    final SubLObject var495 = module0065.f4740(var22_491);
                    final SubLObject var496 = (SubLObject)module0411.NIL;
                    SubLObject var497;
                    SubLObject var498;
                    SubLObject var499;
                    SubLObject var500;
                    SubLObject var501;
                    SubLObject var502;
                    SubLObject var503;
                    SubLObject var504;
                    SubLObject var47_492;
                    SubLObject var505;
                    for (var497 = Sequences.length(var495), var498 = (SubLObject)module0411.NIL, var498 = (SubLObject)module0411.ZERO_INTEGER; var498.numL(var497); var498 = Numbers.add(var498, (SubLObject)module0411.ONE_INTEGER)) {
                        var499 = ((module0411.NIL != var496) ? Numbers.subtract(var497, var498, (SubLObject)module0411.ONE_INTEGER) : var498);
                        var500 = Vectors.aref(var495, var499);
                        if (module0411.NIL == module0065.f4749(var500) || module0411.NIL == module0065.f4773((SubLObject)module0411.$ic62$)) {
                            if (module0411.NIL != module0065.f4749(var500)) {
                                var500 = (SubLObject)module0411.$ic62$;
                            }
                            var501 = oc_inference_datastructures_inference.f25687(var500);
                            module0205.f13228(Symbols.symbol_function((SubLObject)module0411.$ic214$), var501, (SubLObject)module0411.T, (SubLObject)module0411.UNPROVIDED);
                            var502 = oc_inference_datastructures_inference.f25744(var500);
                            var503 = (SubLObject)module0411.NIL;
                            var503 = var502.first();
                            while (module0411.NIL != var502) {
                                var504 = oc_inference_datastructures_inference.f25775(var503);
                                module0205.f13228(Symbols.symbol_function((SubLObject)module0411.$ic214$), var504, (SubLObject)module0411.T, (SubLObject)module0411.UNPROVIDED);
                                var47_492 = oc_inference_datastructures_inference.f25785(var503);
                                var505 = (SubLObject)module0411.NIL;
                                var505 = var47_492.first();
                                while (module0411.NIL != var47_492) {
                                    var47_492 = var47_492.rest();
                                    var505 = var47_492.first();
                                }
                                var502 = var502.rest();
                                var503 = var502.first();
                            }
                        }
                    }
                }
                final SubLObject var33_493 = var494;
                if (module0411.NIL == module0065.f4777(var33_493)) {
                    final SubLObject var506 = module0065.f4738(var33_493);
                    SubLObject var507 = (SubLObject)module0411.NIL;
                    SubLObject var508 = (SubLObject)module0411.NIL;
                    final Iterator var509 = Hashtables.getEntrySetIterator(var506);
                    try {
                        while (Hashtables.iteratorHasNext(var509)) {
                            final Map.Entry var510 = Hashtables.iteratorNextEntry(var509);
                            var507 = Hashtables.getEntryKey(var510);
                            var508 = Hashtables.getEntryValue(var510);
                            final SubLObject var511 = oc_inference_datastructures_inference.f25687(var508);
                            module0205.f13228(Symbols.symbol_function((SubLObject)module0411.$ic214$), var511, (SubLObject)module0411.T, (SubLObject)module0411.UNPROVIDED);
                            SubLObject var512 = oc_inference_datastructures_inference.f25744(var508);
                            SubLObject var513 = (SubLObject)module0411.NIL;
                            var513 = var512.first();
                            while (module0411.NIL != var512) {
                                final SubLObject var514 = oc_inference_datastructures_inference.f25775(var513);
                                module0205.f13228(Symbols.symbol_function((SubLObject)module0411.$ic214$), var514, (SubLObject)module0411.T, (SubLObject)module0411.UNPROVIDED);
                                SubLObject var47_493 = oc_inference_datastructures_inference.f25785(var513);
                                SubLObject var515 = (SubLObject)module0411.NIL;
                                var515 = var47_493.first();
                                while (module0411.NIL != var47_493) {
                                    var47_493 = var47_493.rest();
                                    var515 = var47_493.first();
                                }
                                var512 = var512.rest();
                                var513 = var512.first();
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(var509);
                    }
                }
            }
            SubLObject var516 = var492;
            SubLObject var517 = (SubLObject)module0411.NIL;
            var517 = var516.first();
            while (module0411.NIL != var516) {
                module0205.f13228(Symbols.symbol_function((SubLObject)module0411.$ic214$), module0178.f11289(var517), (SubLObject)module0411.T, (SubLObject)module0411.UNPROVIDED);
                module0205.f13228(Symbols.symbol_function((SubLObject)module0411.$ic214$), module0178.f11287(var517), (SubLObject)module0411.T, (SubLObject)module0411.UNPROVIDED);
                var516 = var516.rest();
                var517 = var516.first();
            }
            var516 = var493;
            SubLObject var518 = (SubLObject)module0411.NIL;
            var518 = var516.first();
            while (module0411.NIL != var516) {
                module0205.f13228(Symbols.symbol_function((SubLObject)module0411.$ic214$), var518, (SubLObject)module0411.T, (SubLObject)module0411.UNPROVIDED);
                var516 = var516.rest();
                var518 = var516.first();
            }
        }
        finally {
            module0411.$g3323$.rebind(var487, var486);
        }
        return var485;
    }
    
    public static SubLObject f28661(final SubLObject var497, SubLObject var498, SubLObject var499, SubLObject var486) {
        if (var498 == module0411.UNPROVIDED) {
            var498 = (SubLObject)module0411.NIL;
        }
        if (var499 == module0411.UNPROVIDED) {
            var499 = (SubLObject)module0411.NIL;
        }
        if (var486 == module0411.UNPROVIDED) {
            var486 = (SubLObject)module0411.NIL;
        }
        final SubLThread var500 = SubLProcess.currentSubLThread();
        final SubLObject var501 = module0077.f5313(Symbols.symbol_function((SubLObject)module0411.EQL), (SubLObject)module0411.UNPROVIDED);
        final SubLObject var502 = module0077.f5313(Symbols.symbol_function((SubLObject)module0411.EQ), (SubLObject)module0411.UNPROVIDED);
        module0411.$g3325$.setDynamicValue(var501, var500);
        final SubLObject var503 = module0411.$g3324$.currentBinding(var500);
        try {
            module0411.$g3324$.bind(var486, var500);
            module0424.f29769(var497, (SubLObject)module0411.$ic215$, (SubLObject)ConsesLow.list((SubLObject)module0411.$ic216$, (SubLObject)module0411.$ic217$, (SubLObject)module0411.$ic218$, var498, (SubLObject)module0411.$ic219$, var499, (SubLObject)module0411.$ic220$, (SubLObject)ConsesLow.list(var501, var502)));
        }
        finally {
            module0411.$g3324$.rebind(var503, var500);
        }
        return Values.values(var501, var502);
    }
    
    public static SubLObject f28662(final SubLObject var502, final SubLObject var503, final SubLObject var504) {
        final SubLThread var505 = SubLProcess.currentSubLThread();
        SubLObject var506 = (SubLObject)module0411.NIL;
        SubLObject var507 = (SubLObject)module0411.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var504, var504, (SubLObject)module0411.$ic221$);
        var506 = var504.first();
        SubLObject var508 = var504.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var508, var504, (SubLObject)module0411.$ic221$);
        var507 = var508.first();
        var508 = var508.rest();
        if (module0411.NIL == var508) {
            final SubLObject var509 = module0077.f5311(var506);
            SubLObject var510 = var503;
            SubLObject var511 = (SubLObject)module0411.NIL;
            var511 = var510.first();
            while (module0411.NIL != var510) {
                final SubLObject var512 = module0205.f13144(var502);
                module0006.f218(module0411.$g3324$.getDynamicValue(var505), (SubLObject)module0411.$ic222$, module0051.f3556((SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED), var512, oc_inference_datastructures_inference.f25531(var511), (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED, (SubLObject)module0411.UNPROVIDED);
                f28660(var511, var506);
                f28663(var511, var507);
                var510 = var510.rest();
                var511 = var510.first();
            }
            final SubLObject var513 = module0077.f5311(var506);
            return Numbers.subtract(var513, var509);
        }
        cdestructuring_bind.cdestructuring_bind_error(var504, (SubLObject)module0411.$ic221$);
        return (SubLObject)module0411.NIL;
    }
    
    public static SubLObject f28663(final SubLObject var4, SubLObject var485) {
        if (var485 == module0411.UNPROVIDED) {
            var485 = (SubLObject)module0411.NIL;
        }
        final SubLObject var486 = oc_inference_datastructures_inference.f25807(var4);
        if (module0411.NIL != var485) {
            module0078.f5374(var486, var485);
        }
        return module0078.f5367(var486, Symbols.symbol_function((SubLObject)module0411.EQ), (SubLObject)module0411.UNPROVIDED);
    }
    
    public static SubLObject f28664(final SubLObject var9, SubLObject var511, SubLObject var512) {
        if (var511 == module0411.UNPROVIDED) {
            var511 = (SubLObject)module0411.ZERO_INTEGER;
        }
        if (var512 == module0411.UNPROVIDED) {
            var512 = (SubLObject)module0411.NIL;
        }
        assert module0411.NIL != module0361.f24009(var9) : var9;
        assert module0411.NIL != module0004.f106(var511) : var511;
        if (module0411.NIL != var512 && !module0411.areAssertionsDisabledFor(me) && module0411.NIL == module0004.f106(var512)) {
            throw new AssertionError(var512);
        }
        final SubLObject var513 = (module0411.NIL != var512) ? var512 : module0361.f24209(var9);
        SubLObject var514 = (SubLObject)module0411.NIL;
        if (var511.numL(var513)) {
            SubLObject var515;
            SubLObject var516;
            SubLObject var517;
            SubLObject var518;
            SubLObject var519;
            for (var515 = var513, var516 = (SubLObject)module0411.NIL, var516 = var511; !var516.numGE(var515); var516 = module0048.f_1X(var516)) {
                var517 = module0361.f24210(var9, var516);
                if (module0411.NIL != var517) {
                    var518 = module0364.f24725(var517);
                    var519 = module0364.f24747(var517);
                    var514 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(var516, (SubLObject)((module0411.NIL != var518) ? module0363.f24508(var518) : module0411.$ic225$), Mapping.mapcar(Symbols.symbol_function((SubLObject)module0411.$ic226$), var519)), var514);
                }
            }
        }
        return Values.values(Sequences.nreverse(var514), var513);
    }
    
    public static SubLObject f28665() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28565", "S#31697", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28566", "S#31698", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28567", "S#28206", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28568", "S#28207", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28569", "S#31699", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28570", "S#31700", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28571", "S#31701", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28572", "S#26088", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28573", "S#31702", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28574", "S#31703", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28575", "FIND-PREVIOUS-INFERENCE-PROBLEM-BY-EL-ASENT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28576", "S#31704", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28577", "S#31705", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28578", "S#31706", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28579", "S#31707", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28580", "S#31708", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28581", "S#31709", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28582", "S#31710", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28583", "S#31711", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28584", "S#31712", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28587", "S#31713", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28585", "S#31714", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28586", "S#31715", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28592", "S#31716", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28588", "S#31717", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28591", "S#31718", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28589", "S#31719", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28595", "S#31720", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28594", "S#31721", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28593", "S#31722", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28590", "S#31723", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28596", "S#31724", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28597", "S#31725", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28598", "S#31726", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28599", "S#31727", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28600", "S#31728", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28601", "S#31729", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28602", "S#31730", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28603", "S#31731", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28604", "S#31732", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28605", "S#31733", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28606", "S#31734", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28607", "QUERY-LITERAL-ANSWERABILITY-STATUS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28608", "S#31735", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28609", "S#31736", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28610", "S#31737", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28611", "S#31738", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28612", "QUERY-TERM-ARG-POSITION-ANSWERABILITY-STATUS", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28613", "QUERY-LITERAL-ANSWERABILITY-STATUS-ASYNCH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28614", "QUERY-LITERAL-SET-ANSWERABILITY-STATUS-VIA-CALLBACK", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28618", "S#31739", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28616", "S#31740", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28615", "S#31741", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28617", "S#31742", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28619", "S#31743", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28620", "S#31744", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28621", "INFERENCE-ANSWER-ARGUMENT-STRENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28622", "S#31745", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28623", "S#31746", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28625", "S#31747", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28624", "S#31748", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28626", "S#31749", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28627", "S#31750", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28629", "S#31751", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28631", "S#31752", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28632", "S#31753", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28628", "S#31754", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28633", "S#31755", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28634", "S#31756", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28635", "S#31757", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28630", "S#31758", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28636", "QUERY-LITERAL-REMOVAL-COST", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28637", "S#31759", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28639", "S#31760", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28638", "S#26333", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28642", "S#31761", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28643", "S#31762", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28641", "S#31763", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28640", "S#31764", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0411", "f28645", "S#31765");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28646", "S#31766", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28647", "S#31767", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28648", "S#31768", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28649", "S#31769", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28654", "S#31770", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28644", "S#31771", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28650", "S#31772", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28651", "S#31773", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28652", "S#31774", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28653", "S#31775", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28655", "S#31776", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28656", "S#31777", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28657", "S#31778", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28658", "S#31779", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28659", "S#31780", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28660", "S#31781", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28661", "S#31782", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28662", "S#31783", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28663", "S#31784", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0411", "f28664", "PROBLEM-STORE-LINK-ID-MAP", 1, 2, false);
        return (SubLObject)module0411.NIL;
    }
    
    public static SubLObject f28666() {
        module0411.$g3319$ = SubLFiles.defparameter("S#31785", (SubLObject)module0411.TEN_INTEGER);
        module0411.$g3320$ = SubLFiles.deflexical("S#31786", (SubLObject)module0411.$ic104$);
        module0411.$g3321$ = SubLFiles.defparameter("S#31787", (SubLObject)module0411.NIL);
        module0411.$g3322$ = SubLFiles.defparameter("S#31788", (SubLObject)module0411.NIL);
        module0411.$g3323$ = SubLFiles.defparameter("S#31789", (SubLObject)module0411.NIL);
        module0411.$g3324$ = SubLFiles.defparameter("S#31790", (SubLObject)module0411.NIL);
        module0411.$g3325$ = SubLFiles.defparameter("S#31791", (SubLObject)module0411.NIL);
        return (SubLObject)module0411.NIL;
    }
    
    public static SubLObject f28667() {
        module0012.f419((SubLObject)module0411.$ic1$);
        module0061.f4481((SubLObject)module0411.$ic2$, (SubLObject)module0411.$ic3$, (SubLObject)module0411.UNPROVIDED);
        module0034.f1895((SubLObject)module0411.$ic80$);
        module0002.f38((SubLObject)module0411.$ic111$);
        module0002.f38((SubLObject)module0411.$ic119$);
        module0002.f38((SubLObject)module0411.$ic120$);
        module0002.f38((SubLObject)module0411.$ic123$);
        module0002.f38((SubLObject)module0411.$ic130$);
        module0002.f38((SubLObject)module0411.$ic158$);
        module0034.f1895((SubLObject)module0411.$ic203$);
        module0012.f419((SubLObject)module0411.$ic214$);
        module0012.f419((SubLObject)module0411.$ic215$);
        module0002.f38((SubLObject)module0411.$ic223$);
        return (SubLObject)module0411.NIL;
    }
    
    public void declareFunctions() {
        f28665();
    }
    
    public void initializeVariables() {
        f28666();
    }
    
    public void runTopLevelForms() {
        f28667();
    }
    
    static {
        me = (SubLFile)new module0411();
        module0411.$g3319$ = null;
        module0411.$g3320$ = null;
        module0411.$g3321$ = null;
        module0411.$g3322$ = null;
        module0411.$g3323$ = null;
        module0411.$g3324$ = null;
        module0411.$g3325$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#31792", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#31698", "CYC");
        $ic2$ = SubLObjectFactory.makeKeyword("SPARQL");
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXTERNAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#31698", "CYC"));
        $ic4$ = SubLObjectFactory.makeKeyword("ALL");
        $ic5$ = SubLObjectFactory.makeKeyword("NONE");
        $ic6$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OPEN"), (SubLObject)SubLObjectFactory.makeKeyword("CLOSED"));
        $ic7$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANSWERABLE"), (SubLObject)SubLObjectFactory.makeKeyword("UNANSWERABLE"));
        $ic8$ = SubLObjectFactory.makeString("Unhandled inference property ~S");
        $ic9$ = SubLObjectFactory.makeKeyword("INFERENCE-MODE");
        $ic10$ = SubLObjectFactory.makeKeyword("MAX-NUMBER");
        $ic11$ = SubLObjectFactory.makeKeyword("MAX-STEP");
        $ic12$ = SubLObjectFactory.makeKeyword("MAX-TIME");
        $ic13$ = SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE");
        $ic14$ = SubLObjectFactory.makeKeyword("BLOCK?");
        $ic15$ = SubLObjectFactory.makeKeyword("BROWSABLE?");
        $ic16$ = SubLObjectFactory.makeKeyword("CACHE-INFERENCE-RESULTS?");
        $ic17$ = SubLObjectFactory.makeKeyword("CONTINUABLE?");
        $ic18$ = SubLObjectFactory.makeKeyword("FORGET-EXTRA-RESULTS?");
        $ic19$ = SubLObjectFactory.makeKeyword("FORWARD-MAX-TIME");
        $ic20$ = SubLObjectFactory.makeKeyword("MAX-PROOF-DEPTH");
        $ic21$ = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $ic22$ = SubLObjectFactory.makeKeyword("MIN-RULE-UTILITY");
        $ic23$ = SubLObjectFactory.makeKeyword("METRICS");
        $ic24$ = SubLObjectFactory.makeKeyword("PROBABLY-APPROXIMATELY-DONE");
        $ic25$ = SubLObjectFactory.makeKeyword("RETURN");
        $ic26$ = SubLObjectFactory.makeKeyword("ALLOW-ABNORMALITY-CHECKING?");
        $ic27$ = SubLObjectFactory.makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?");
        $ic28$ = SubLObjectFactory.makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?");
        $ic29$ = SubLObjectFactory.makeKeyword("ALLOW-INDETERMINATE-RESULTS?");
        $ic30$ = SubLObjectFactory.makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?");
        $ic31$ = SubLObjectFactory.makeKeyword("ALLOWED-MODULES");
        $ic32$ = SubLObjectFactory.makeKeyword("ALLOWED-RULES");
        $ic33$ = SubLObjectFactory.makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY");
        $ic34$ = SubLObjectFactory.makeKeyword("EVENTS");
        $ic35$ = SubLObjectFactory.makeKeyword("FORBIDDEN-RULES");
        $ic36$ = SubLObjectFactory.makeKeyword("PROBLEM-STORE");
        $ic37$ = SubLObjectFactory.makeKeyword("RESULT-UNIQUENESS");
        $ic38$ = SubLObjectFactory.makeKeyword("TRANSITIVE-CLOSURE-MODE");
        $ic39$ = SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT");
        $ic40$ = SubLObjectFactory.makeKeyword("PROOF-SPEC");
        $ic41$ = SubLObjectFactory.makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT");
        $ic42$ = SubLObjectFactory.makeKeyword("ABDUCTION-ALLOWED?");
        $ic43$ = SubLObjectFactory.makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?");
        $ic44$ = SubLObjectFactory.makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?");
        $ic45$ = SubLObjectFactory.makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?");
        $ic46$ = SubLObjectFactory.makeKeyword("DIRECTION");
        $ic47$ = SubLObjectFactory.makeKeyword("EQUALITY-REASONING-DOMAIN");
        $ic48$ = SubLObjectFactory.makeKeyword("EQUALITY-REASONING-METHOD");
        $ic49$ = SubLObjectFactory.makeKeyword("EVALUATE-SUBL-ALLOWED?");
        $ic50$ = SubLObjectFactory.makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL");
        $ic51$ = SubLObjectFactory.makeKeyword("MAX-PROBLEM-COUNT");
        $ic52$ = SubLObjectFactory.makeKeyword("NEGATION-BY-FAILURE?");
        $ic53$ = SubLObjectFactory.makeKeyword("NEW-TERMS-ALLOWED?");
        $ic54$ = SubLObjectFactory.makeKeyword("PROBLEM-STORE-NAME");
        $ic55$ = SubLObjectFactory.makeKeyword("REMOVAL-ALLOWED?");
        $ic56$ = SubLObjectFactory.makeKeyword("REWRITE-ALLOWED?");
        $ic57$ = SubLObjectFactory.makeKeyword("TRANSFORMATION-ALLOWED?");
        $ic58$ = SubLObjectFactory.makeString("Unhandled problem store property ~S");
        $ic59$ = SubLObjectFactory.makeKeyword("POS");
        $ic60$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("sentenceTruth"));
        $ic61$ = SubLObjectFactory.makeString("Got more than 2 answers for ~a where #$True and #$False were expected to be the only possible answers");
        $ic62$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic63$ = SubLObjectFactory.makeSymbol("SINGLETON?");
        $ic64$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("True"));
        $ic65$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("False"));
        $ic66$ = SubLObjectFactory.makeString("No true answer for ~a");
        $ic67$ = SubLObjectFactory.makeString("No false answer for ~a");
        $ic68$ = SubLObjectFactory.makeSymbol("S#28709", "CYC");
        $ic69$ = SubLObjectFactory.makeSymbol("S#28710", "CYC");
        $ic70$ = SubLObjectFactory.makeSymbol("S#28668", "CYC");
        $ic71$ = SubLObjectFactory.makeSymbol("FIRST");
        $ic72$ = SubLObjectFactory.makeKeyword("UNSPECIFIED");
        $ic73$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#31793", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#31794", "CYC"));
        $ic74$ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $ic75$ = SubLObjectFactory.makeKeyword("BINDINGS");
        $ic76$ = SubLObjectFactory.makeKeyword("HL");
        $ic77$ = SubLObjectFactory.makeKeyword("NEG");
        $ic78$ = SubLObjectFactory.makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic79$ = SubLObjectFactory.makeKeyword("SPLIT");
        $ic80$ = SubLObjectFactory.makeSymbol("S#31721", "CYC");
        $ic81$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic82$ = SubLObjectFactory.makeSymbol("INFERENCE-P");
        $ic83$ = SubLObjectFactory.makeSymbol("S#5674", "CYC");
        $ic84$ = SubLObjectFactory.makeString("Inference ~A is not controlled by the thread of thinking task ~A.");
        $ic85$ = SubLObjectFactory.makeSymbol("S#26082", "CYC");
        $ic86$ = SubLObjectFactory.makeSymbol("S#27317", "CYC");
        $ic87$ = SubLObjectFactory.makeSymbol("S#747", "CYC");
        $ic88$ = SubLObjectFactory.makeSymbol("S#12629", "CYC");
        $ic89$ = SubLObjectFactory.makeSymbol("S#26489", "CYC");
        $ic90$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MODULE-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("REMOVAL")));
        $ic91$ = SubLObjectFactory.makeString("new-continuable-antecedent-inference could not find the transformed problem for ~s in ~s");
        $ic92$ = SubLObjectFactory.makeKeyword("TAB-DELIMITED");
        $ic93$ = SubLObjectFactory.makeKeyword("OUTPUT");
        $ic94$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic95$ = SubLObjectFactory.makeString("Unable to open ~S");
        $ic96$ = SubLObjectFactory.makeSymbol("OUTPUT-STREAM-P");
        $ic97$ = SubLObjectFactory.makeKeyword("XML");
        $ic98$ = SubLObjectFactory.makeKeyword("ALCHEMY");
        $ic99$ = SubLObjectFactory.makeString("Output format :ALCHEMY is not supported.");
        $ic100$ = SubLObjectFactory.makeString("Output format ~S is not supported.");
        $ic101$ = SubLObjectFactory.makeString("~A~C");
        $ic102$ = SubLObjectFactory.makeString("~%");
        $ic103$ = SubLObjectFactory.makeString("#$");
        $ic104$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANSWERABLE"), (SubLObject)SubLObjectFactory.makeKeyword("UNANSWERABLE"), (SubLObject)SubLObjectFactory.makeKeyword("UNKNOWN"));
        $ic105$ = SubLObjectFactory.makeKeyword("NON-TRIVIAL");
        $ic106$ = SubLObjectFactory.makeKeyword("UNKNOWN");
        $ic107$ = SubLObjectFactory.makeKeyword("MAINTAIN-TERM-WORKING-SET?");
        $ic108$ = SubLObjectFactory.makeKeyword("ANSWERABLE");
        $ic109$ = SubLObjectFactory.makeKeyword("EXHAUST-TOTAL");
        $ic110$ = SubLObjectFactory.makeKeyword("UNANSWERABLE");
        $ic111$ = SubLObjectFactory.makeSymbol("QUERY-LITERAL-ANSWERABILITY-STATUS");
        $ic112$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12398", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#31795", "CYC"));
        $ic113$ = SubLObjectFactory.makeKeyword("PREFERRED");
        $ic114$ = SubLObjectFactory.makeKeyword("DISPREFERRED");
        $ic115$ = SubLObjectFactory.makeKeyword("GROSSLY-DISPREFERRED");
        $ic116$ = SubLObjectFactory.makeKeyword("DISALLOWED");
        $ic117$ = SubLObjectFactory.makeKeyword("DOOMED");
        $ic118$ = SubLObjectFactory.makeString("unexpected preference level ~s");
        $ic119$ = SubLObjectFactory.makeSymbol("QUERY-TERM-ARG-POSITION-ANSWERABILITY-STATUS");
        $ic120$ = SubLObjectFactory.makeSymbol("QUERY-LITERAL-ANSWERABILITY-STATUS-ASYNCH");
        $ic121$ = SubLObjectFactory.makeSymbol("S#31739", "CYC");
        $ic122$ = SubLObjectFactory.makeSymbol("S#15970", "CYC");
        $ic123$ = SubLObjectFactory.makeSymbol("QUERY-LITERAL-SET-ANSWERABILITY-STATUS-VIA-CALLBACK");
        $ic124$ = SubLObjectFactory.makeSymbol("LISTP");
        $ic125$ = SubLObjectFactory.makeSymbol("S#31740", "CYC");
        $ic126$ = SubLObjectFactory.makeSymbol("BOOLEANP");
        $ic127$ = (SubLFloat)SubLObjectFactory.makeDouble(0.01);
        $ic128$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#25173", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#31796", "CYC"));
        $ic129$ = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $ic130$ = SubLObjectFactory.makeSymbol("INFERENCE-ANSWER-ARGUMENT-STRENGTH");
        $ic131$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("HypotheticalContext"));
        $ic132$ = SubLObjectFactory.makeKeyword("HYPOTHETICAL-MT-SUPPORT-COUNT");
        $ic133$ = SubLObjectFactory.makeSymbol("INFERENCE-ANSWER-P");
        $ic134$ = SubLObjectFactory.makeSymbol("S#26782", "CYC");
        $ic135$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("AbsoluteCycProblemStoreFn"));
        $ic136$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CycInferenceFn"));
        $ic137$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Computer"));
        $ic138$ = SubLObjectFactory.makeKeyword("DENOT");
        $ic139$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $ic140$ = SubLObjectFactory.makeString("Couldn't find a term representing this machine based on its name ~S.");
        $ic141$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic142$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Computer")));
        $ic143$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nameString"));
        $ic144$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CycImageFn"));
        $ic145$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $ic146$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("MtSpace"));
        $ic147$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("MtTimeDimFn"));
        $ic148$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("cycProblemStoreLinkCount"));
        $ic149$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("cycProblemStoreProblemCount"));
        $ic150$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("cycProblemStoreProofCount"));
        $ic151$ = SubLObjectFactory.makeSymbol("CYCL-DENOTATIONAL-TERM-P");
        $ic152$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("inferenceStartTime"));
        $ic153$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SecondsDuration"));
        $ic154$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("inferenceTimeToFirstAnswer"));
        $ic155$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("inferenceTimeToLastAnswer"));
        $ic156$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("inferenceAnswerCount"));
        $ic157$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("inferenceBindings"));
        $ic158$ = SubLObjectFactory.makeSymbol("QUERY-LITERAL-REMOVAL-COST");
        $ic159$ = SubLObjectFactory.makeSymbol("S#15821", "CYC");
        $ic160$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("bridgingPredicateForPredicate"));
        $ic161$ = SubLObjectFactory.makeKeyword("GAF");
        $ic162$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#31797", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#15200", "CYC"));
        $ic163$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#750", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#12455", "CYC")));
        $ic164$ = SubLObjectFactory.makeSymbol("S#12455", "CYC");
        $ic165$ = SubLObjectFactory.makeSymbol("S#750", "CYC");
        $ic166$ = SubLObjectFactory.makeKeyword("BREADTH");
        $ic167$ = SubLObjectFactory.makeKeyword("QUEUE");
        $ic168$ = SubLObjectFactory.makeKeyword("STACK");
        $ic169$ = SubLObjectFactory.makeSymbol("S#11450", "CYC");
        $ic170$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic171$ = SubLObjectFactory.makeString("~A is not a ~A");
        $ic172$ = SubLObjectFactory.makeSymbol("S#11592", "CYC");
        $ic173$ = SubLObjectFactory.makeKeyword("CERROR");
        $ic174$ = SubLObjectFactory.makeString("continue anyway");
        $ic175$ = SubLObjectFactory.makeKeyword("WARN");
        $ic176$ = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic177$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic178$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("rdf-type"));
        $ic179$ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $ic180$ = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic181$ = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic182$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic183$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic184$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("logicalResultSetCardinalityWRTValue"));
        $ic185$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic186$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("meaningSentenceOfSchema"));
        $ic187$ = SubLObjectFactory.makeKeyword("IMPOSSIBLE");
        $ic188$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14781", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#26071", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25691", "CYC"));
        $ic189$ = SubLObjectFactory.makeKeyword("COMPLETE");
        $ic190$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#31798", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#31799", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#31800", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#31801", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#15215", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic191$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic192$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic193$ = SubLObjectFactory.makeKeyword("DONE");
        $ic194$ = SubLObjectFactory.makeUninternedSymbol("US#2823B18");
        $ic195$ = SubLObjectFactory.makeUninternedSymbol("US#3F92607");
        $ic196$ = SubLObjectFactory.makeSymbol("CLET");
        $ic197$ = SubLObjectFactory.makeSymbol("S#27299", "CYC");
        $ic198$ = SubLObjectFactory.makeKeyword("INDEX");
        $ic199$ = SubLObjectFactory.makeSymbol("CLAUSE-WITHOUT-LITERAL");
        $ic200$ = SubLObjectFactory.makeSymbol("S#27298", "CYC");
        $ic201$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#31802", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#31803", "CYC"));
        $ic202$ = SubLObjectFactory.makeSymbol("VARIABLE-P");
        $ic203$ = SubLObjectFactory.makeSymbol("S#31771", "CYC");
        $ic204$ = SubLObjectFactory.makeKeyword("TACTICAL");
        $ic205$ = SubLObjectFactory.makeKeyword("JOIN-ORDERED");
        $ic206$ = SubLObjectFactory.makeSymbol("S#26816", "CYC");
        $ic207$ = SubLObjectFactory.makeSymbol("HASH-TABLE-P");
        $ic208$ = SubLObjectFactory.makeKeyword("REMOVAL");
        $ic209$ = SubLObjectFactory.makeKeyword("RESTRICTION");
        $ic210$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"));
        $ic211$ = SubLObjectFactory.makeKeyword("TRANSFORMATION");
        $ic212$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic213$ = SubLObjectFactory.makeString("~%added ~S");
        $ic214$ = SubLObjectFactory.makeSymbol("S#31779", "CYC");
        $ic215$ = SubLObjectFactory.makeSymbol("S#31783", "CYC");
        $ic216$ = SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE");
        $ic217$ = SubLObjectFactory.makeString("Gathering vocab from KBQ inferences");
        $ic218$ = SubLObjectFactory.makeKeyword("OUTLIER-TIMEOUT");
        $ic219$ = SubLObjectFactory.makeKeyword("OVERRIDING-QUERY-PROPERTIES");
        $ic220$ = SubLObjectFactory.makeKeyword("ADDITIONAL-ARGS");
        $ic221$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#31804", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#31805", "CYC"));
        $ic222$ = SubLObjectFactory.makeString("~&~a: ~a ~a~%");
        $ic223$ = SubLObjectFactory.makeSymbol("PROBLEM-STORE-LINK-ID-MAP");
        $ic224$ = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic225$ = SubLObjectFactory.makeKeyword("ROOT");
        $ic226$ = SubLObjectFactory.makeSymbol("S#26813", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0411.class
	Total time: 1888 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/