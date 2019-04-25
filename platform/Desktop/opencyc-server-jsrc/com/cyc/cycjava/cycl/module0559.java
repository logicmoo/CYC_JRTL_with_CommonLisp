package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0559 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0559";
    public static final String myFingerPrint = "44ead35fe4b3849754d5cc38cc28b40f1115992c4776ca415f6263acd3a66909";
    private static SubLSymbol $g4031$;
    public static SubLSymbol $g4032$;
    private static SubLSymbol $g4033$;
    public static SubLSymbol $g4034$;
    public static SubLSymbol $g4035$;
    private static SubLSymbol $g4036$;
    private static SubLSymbol $g4037$;
    private static SubLSymbol $g4038$;
    private static SubLSymbol $g4039$;
    private static SubLSymbol $g4040$;
    private static SubLSymbol $g4041$;
    private static SubLSymbol $g4042$;
    private static SubLSymbol $g4043$;
    private static SubLSymbol $g4044$;
    private static SubLSymbol $g4045$;
    public static SubLSymbol $g4046$;
    public static SubLSymbol $g4047$;
    private static SubLSymbol $g4048$;
    private static SubLSymbol $g4049$;
    private static SubLSymbol $g4050$;
    private static SubLSymbol $g4051$;
    private static SubLSymbol $g4052$;
    private static SubLSymbol $g4053$;
    private static SubLSymbol $g4054$;
    private static SubLSymbol $g4055$;
    private static SubLSymbol $g4060$;
    public static SubLSymbol $g4061$;
    public static SubLSymbol $g4062$;
    private static SubLSymbol $g4063$;
    private static SubLSymbol $g4056$;
    private static SubLSymbol $g4064$;
    private static SubLSymbol $g4065$;
    private static SubLSymbol $g4057$;
    private static SubLSymbol $g4066$;
    private static SubLSymbol $g4067$;
    private static SubLSymbol $g4058$;
    private static SubLSymbol $g4068$;
    private static SubLSymbol $g4059$;
    private static SubLSymbol $g4069$;
    private static SubLSymbol $g4070$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLString $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLString $ic11$;
    private static final SubLInteger $ic12$;
    private static final SubLString $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLObject $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLObject $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLString $ic22$;
    private static final SubLInteger $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLString $ic40$;
    private static final SubLString $ic41$;
    private static final SubLString $ic42$;
    private static final SubLString $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLString $ic46$;
    private static final SubLString $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLString $ic50$;
    private static final SubLList $ic51$;
    private static final SubLString $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLString $ic54$;
    private static final SubLString $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLString $ic58$;
    private static final SubLString $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLString $ic63$;
    private static final SubLList $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLList $ic67$;
    private static final SubLFloat $ic68$;
    private static final SubLString $ic69$;
    private static final SubLSymbol $ic70$;
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
    private static final SubLString $ic83$;
    private static final SubLString $ic84$;
    private static final SubLString $ic85$;
    private static final SubLList $ic86$;
    private static final SubLString $ic87$;
    private static final SubLObject $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLString $ic90$;
    private static final SubLString $ic91$;
    private static final SubLString $ic92$;
    private static final SubLString $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLString $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLString $ic103$;
    private static final SubLString $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLString $ic106$;
    private static final SubLString $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLString $ic109$;
    private static final SubLString $ic110$;
    private static final SubLString $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLString $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLString $ic120$;
    private static final SubLString $ic121$;
    private static final SubLString $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLString $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLList $ic126$;
    private static final SubLList $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLList $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLString $ic140$;
    private static final SubLString $ic141$;
    private static final SubLString $ic142$;
    private static final SubLString $ic143$;
    private static final SubLString $ic144$;
    private static final SubLString $ic145$;
    private static final SubLString $ic146$;
    private static final SubLString $ic147$;
    private static final SubLString $ic148$;
    private static final SubLString $ic149$;
    private static final SubLList $ic150$;
    private static final SubLString $ic151$;
    
    public static SubLObject f34337() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0559.$g4031$.getDynamicValue(var1);
    }
    
    public static SubLObject f34338(final SubLObject var2) {
        f34339();
        SubLObject var3 = var2;
        SubLObject var4 = (SubLObject)module0559.NIL;
        var4 = var3.first();
        while (module0559.NIL != var3) {
            SubLObject var6;
            final SubLObject var5 = var6 = var4;
            SubLObject var7 = (SubLObject)module0559.NIL;
            SubLObject var8 = (SubLObject)module0559.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0559.$ic0$);
            var7 = var6.first();
            var6 = (var8 = var6.rest());
            assert module0559.NIL != Types.keywordp(var7) : var7;
            final SubLObject var9 = var7;
            if (var9.eql((SubLObject)module0559.$ic2$)) {
                f34340(f34341(var8));
            }
            else if (var9.eql((SubLObject)module0559.$ic3$)) {
                f34342(f34341(var8));
            }
            else if (var9.eql((SubLObject)module0559.$ic4$)) {
                f34343(f34341(var8));
            }
            else if (var9.eql((SubLObject)module0559.$ic5$)) {
                f34344(f34341(var8));
            }
            else if (var9.eql((SubLObject)module0559.$ic6$)) {
                SubLObject var12_13;
                final SubLObject var10_11 = var12_13 = var8;
                SubLObject var10 = (SubLObject)module0559.NIL;
                SubLObject var11 = (SubLObject)module0559.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var12_13, var10_11, (SubLObject)module0559.$ic7$);
                var10 = var12_13.first();
                var12_13 = (var11 = var12_13.rest());
                if (var10.isFunctionSpec()) {
                    Functions.apply(var10, var11);
                }
                else {
                    Errors.warn((SubLObject)module0559.$ic8$, var10);
                }
            }
            else if (!var9.eql((SubLObject)module0559.$ic9$)) {
                if (!var9.eql((SubLObject)module0559.$ic10$)) {
                    Errors.warn((SubLObject)module0559.$ic11$, var4);
                }
            }
            var3 = var3.rest();
            var4 = var3.first();
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34345(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        return module0035.sublisp_boolean(Hashtables.gethash_without_values(var16, module0559.$g4033$.getDynamicValue(var17), (SubLObject)module0559.UNPROVIDED));
    }
    
    public static SubLObject f34339() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        if (!module0559.$g4033$.getDynamicValue(var1).isHashtable()) {
            final SubLObject var2 = Numbers.integerDivide(Numbers.add(assertion_handles_oc.f11019(), module0173.f10962()), (SubLObject)module0559.$ic12$);
            module0559.$g4033$.setDynamicValue(Hashtables.make_hash_table(var2, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED), var1);
        }
        Hashtables.clrhash(module0559.$g4033$.getDynamicValue(var1));
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34341(final SubLObject var8) {
        if (var8.isAtom()) {
            return f34346(var8);
        }
        return f34346(var8.first());
    }
    
    public static SubLObject f34346(final SubLObject var8) {
        SubLObject var9 = (SubLObject)module0559.NIL;
        if (module0559.NIL != module0173.f10955(var8)) {
            if (module0559.NIL != module0173.f10969(var8)) {
                var9 = var8;
            }
        }
        else if (var8.isString()) {
            final SubLObject var10 = constants_high_oc.f10737(var8);
            if (module0559.NIL != constant_handles_oc.f8463(var10, (SubLObject)module0559.UNPROVIDED)) {
                var9 = var10;
            }
        }
        else if (module0559.NIL != constants_high_oc.f10734(var8)) {
            final SubLObject var10 = constants_high_oc.f10751(var8);
            if (module0559.NIL != constant_handles_oc.f8463(var10, (SubLObject)module0559.UNPROVIDED)) {
                var9 = var10;
            }
        }
        else if (var8.isFixnum()) {
            final SubLObject var10 = constants_high_oc.f10752(var8);
            if (module0559.NIL != constant_handles_oc.f8463(var10, (SubLObject)module0559.UNPROVIDED)) {
                var9 = var10;
            }
        }
        return var9;
    }
    
    public static SubLObject f34347(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        if (module0559.NIL == Hashtables.gethash_without_values(var16, module0559.$g4033$.getDynamicValue(var17), (SubLObject)module0559.UNPROVIDED)) {
            if (module0559.NIL != module0173.f10955(var16) || module0559.NIL != assertion_handles_oc.f11035(var16) || module0559.NIL != oc_deduction_handles.f11659(var16) || module0559.NIL != module0179.f11424(var16)) {
                Hashtables.sethash(var16, module0559.$g4033$.getDynamicValue(var17), var16);
            }
            else {
                Errors.warn((SubLObject)module0559.$ic13$);
            }
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34348(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        if (module0559.NIL != assertion_handles_oc.f11035(var20)) {
            Hashtables.sethash(var20, module0559.$g4033$.getDynamicValue(var21), var20);
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34349(final SubLObject var20) {
        if (module0559.NIL != assertion_handles_oc.f11035(var20)) {
            f34348(var20);
            if (module0559.NIL != module0211.f13700(var20)) {
                SubLObject var22;
                final SubLObject var21 = var22 = module0211.f13701(var20);
                SubLObject var23 = (SubLObject)module0559.NIL;
                var23 = var22.first();
                while (module0559.NIL != var22) {
                    f34348(var23);
                    var22 = var22.rest();
                    var23 = var22.first();
                }
            }
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34350(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        if (module0559.NIL != assertion_handles_oc.f11035(var20) && module0559.NIL != Functions.apply(module0559.$g4034$.getDynamicValue(var21), (SubLObject)ConsesLow.list(var20))) {
            Hashtables.sethash(var20, module0559.$g4033$.getDynamicValue(var21), var20);
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34351(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        if (module0559.NIL != assertion_handles_oc.f11035(var20)) {
            f34348(var20);
            SubLObject var22 = module0178.f11326(var20, (SubLObject)module0559.T, (SubLObject)module0559.T, (SubLObject)module0559.T, (SubLObject)module0559.UNPROVIDED);
            SubLObject var23 = (SubLObject)module0559.NIL;
            var23 = var22.first();
            while (module0559.NIL != var22) {
                if (module0559.NIL == module0559.$g4035$.getDynamicValue(var21) || module0559.NIL != Functions.funcall(module0559.$g4035$.getDynamicValue(var21), var23)) {
                    f34347(var23);
                }
                var22 = var22.rest();
                var23 = var22.first();
            }
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34343(final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        if (module0559.NIL != module0212.f13762(var18) && module0559.NIL == Hashtables.gethash_without_values(var18, module0559.$g4033$.getDynamicValue(var19), (SubLObject)module0559.UNPROVIDED)) {
            Hashtables.sethash(var18, module0559.$g4033$.getDynamicValue(var19), var18);
            if (module0559.NIL != module0173.f10955(var18)) {
                f34352(var18);
            }
            else {
                f34352(var18);
            }
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34344(final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        if (module0559.NIL != module0212.f13762(var18)) {
            final SubLObject var20 = module0147.$g2094$.currentBinding(var19);
            final SubLObject var21 = module0147.$g2095$.currentBinding(var19);
            try {
                module0147.$g2094$.bind((SubLObject)module0559.$ic14$, var19);
                module0147.$g2095$.bind(module0559.$ic15$, var19);
                final SubLObject var22 = (SubLObject)module0559.NIL;
                if (module0559.NIL != module0158.f10010(var18, (SubLObject)module0559.ONE_INTEGER, var22)) {
                    final SubLObject var23 = module0158.f10011(var18, (SubLObject)module0559.ONE_INTEGER, var22);
                    SubLObject var24 = (SubLObject)module0559.NIL;
                    final SubLObject var25 = (SubLObject)module0559.NIL;
                    while (module0559.NIL == var24) {
                        final SubLObject var26 = module0052.f3695(var23, var25);
                        final SubLObject var27 = (SubLObject)SubLObjectFactory.makeBoolean(!var25.eql(var26));
                        if (module0559.NIL != var27) {
                            SubLObject var28 = (SubLObject)module0559.NIL;
                            try {
                                var28 = module0158.f10316(var26, (SubLObject)module0559.$ic16$, (SubLObject)module0559.NIL, (SubLObject)module0559.NIL);
                                SubLObject var28_33 = (SubLObject)module0559.NIL;
                                final SubLObject var29_34 = (SubLObject)module0559.NIL;
                                while (module0559.NIL == var28_33) {
                                    final SubLObject var29 = module0052.f3695(var28, var29_34);
                                    final SubLObject var31_36 = (SubLObject)SubLObjectFactory.makeBoolean(!var29_34.eql(var29));
                                    if (module0559.NIL != var31_36) {
                                        final SubLObject var30 = module0178.f11332(var29);
                                        if (module0559.NIL != module0259.f16976(var30, module0559.$ic17$)) {
                                            f34343(var29);
                                        }
                                    }
                                    var28_33 = (SubLObject)SubLObjectFactory.makeBoolean(module0559.NIL == var31_36);
                                }
                            }
                            finally {
                                final SubLObject var24_38 = Threads.$is_thread_performing_cleanupP$.currentBinding(var19);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0559.T, var19);
                                    if (module0559.NIL != var28) {
                                        module0158.f10319(var28);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var24_38, var19);
                                }
                            }
                        }
                        var24 = (SubLObject)SubLObjectFactory.makeBoolean(module0559.NIL == var27);
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var21, var19);
                module0147.$g2094$.rebind(var20, var19);
            }
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34353(final SubLObject var18) {
        if (module0559.NIL != module0173.f10955(var18)) {
            f34343(var18);
            SubLObject var19 = module0230.f15279(var18);
            SubLObject var20 = (SubLObject)module0559.NIL;
            var20 = var19.first();
            while (module0559.NIL != var19) {
                f34343(var20);
                var19 = var19.rest();
                var20 = var19.first();
            }
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34354(final SubLObject var18, final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        if (module0559.NIL != module0212.f13762(var18) && module0559.NIL != module0269.f17707(var40)) {
            final SubLObject var42 = module0147.$g2094$.currentBinding(var41);
            final SubLObject var43 = module0147.$g2095$.currentBinding(var41);
            try {
                module0147.$g2094$.bind((SubLObject)module0559.$ic18$, var41);
                module0147.$g2095$.bind(var40, var41);
                module0219.f14491(Symbols.symbol_function((SubLObject)module0559.$ic19$), var18);
            }
            finally {
                module0147.$g2095$.rebind(var43, var41);
                module0147.$g2094$.rebind(var42, var41);
            }
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34355(final SubLObject var41) {
        if (module0559.NIL != assertion_handles_oc.f11035(var41)) {
            return f34348(var41);
        }
        return f34343(var41);
    }
    
    public static SubLObject f34356(final SubLObject var41) {
        if (module0559.NIL != assertion_handles_oc.f11035(var41)) {
            return f34349(var41);
        }
        return f34353(var41);
    }
    
    public static SubLObject f34357(final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        if (module0559.NIL != module0212.f13762(var18) && module0559.NIL == Hashtables.gethash_without_values(var18, module0559.$g4033$.getDynamicValue(var19), (SubLObject)module0559.UNPROVIDED)) {
            Hashtables.sethash(var18, module0559.$g4033$.getDynamicValue(var19), var18);
            if (module0559.NIL != module0173.f10955(var18)) {
                f34358(var18);
            }
            else {
                f34358(var18);
            }
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34340(final SubLObject var42) {
        if (module0559.NIL != module0173.f10955(var42)) {
            f34343(var42);
            SubLObject var43 = module0259.f16847(var42);
            SubLObject var44 = (SubLObject)module0559.NIL;
            var44 = var43.first();
            while (module0559.NIL != var43) {
                f34343(var44);
                var43 = var43.rest();
                var44 = var43.first();
            }
            var43 = module0256.f16557(var42, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
            SubLObject var45 = (SubLObject)module0559.NIL;
            var45 = var43.first();
            while (module0559.NIL != var43) {
                f34343(var45);
                var43 = var43.rest();
                var45 = var43.first();
            }
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34342(final SubLObject var45) {
        if (module0559.NIL != module0173.f10955(var45)) {
            f34343(var45);
            SubLObject var46 = module0259.f16995(var45);
            SubLObject var47 = (SubLObject)module0559.NIL;
            var47 = var46.first();
            while (module0559.NIL != var46) {
                f34343(var47);
                var46 = var46.rest();
                var47 = var46.first();
            }
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34359(final SubLObject var42) {
        if (module0559.NIL != module0173.f10955(var42)) {
            f34357(var42);
            SubLObject var43 = module0259.f16847(var42);
            SubLObject var44 = (SubLObject)module0559.NIL;
            var44 = var43.first();
            while (module0559.NIL != var43) {
                f34357(var44);
                var43 = var43.rest();
                var44 = var43.first();
            }
            var43 = module0256.f16557(var42, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
            SubLObject var45 = (SubLObject)module0559.NIL;
            var45 = var43.first();
            while (module0559.NIL != var43) {
                f34357(var45);
                var43 = var43.rest();
                var45 = var43.first();
            }
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34360(final SubLObject var18, final SubLObject var47, SubLObject var48, SubLObject var40, SubLObject var49) {
        if (var48 == module0559.UNPROVIDED) {
            var48 = (SubLObject)module0559.NIL;
        }
        if (var40 == module0559.UNPROVIDED) {
            var40 = (SubLObject)module0559.NIL;
        }
        if (var49 == module0559.UNPROVIDED) {
            var49 = (SubLObject)module0559.NIL;
        }
        final SubLThread var50 = SubLProcess.currentSubLThread();
        final SubLObject var51 = module0147.$g2094$.currentBinding(var50);
        final SubLObject var52 = module0147.$g2095$.currentBinding(var50);
        try {
            module0147.$g2094$.bind((SubLObject)module0559.$ic14$, var50);
            module0147.$g2095$.bind(module0559.$ic15$, var50);
            module0219.f14477(Symbols.symbol_function((SubLObject)module0559.$ic20$), var18, var47, var48, var49, var40);
        }
        finally {
            module0147.$g2095$.rebind(var52, var50);
            module0147.$g2094$.rebind(var51, var50);
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34361(final SubLObject var18, final SubLObject var50, SubLObject var40, SubLObject var51) {
        if (var40 == module0559.UNPROVIDED) {
            var40 = (SubLObject)module0559.NIL;
        }
        if (var51 == module0559.UNPROVIDED) {
            var51 = (SubLObject)module0559.NIL;
        }
        final SubLThread var52 = SubLProcess.currentSubLThread();
        final SubLObject var53 = module0147.$g2094$.currentBinding(var52);
        final SubLObject var54 = module0147.$g2095$.currentBinding(var52);
        try {
            module0147.$g2094$.bind((SubLObject)module0559.$ic14$, var52);
            module0147.$g2095$.bind(module0559.$ic15$, var52);
            module0219.f14481(Symbols.symbol_function((SubLObject)module0559.$ic20$), var18, var50, var51, var40);
        }
        finally {
            module0147.$g2095$.rebind(var54, var52);
            module0147.$g2094$.rebind(var53, var52);
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34362(final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        final SubLObject var20 = module0147.$g2094$.currentBinding(var19);
        final SubLObject var21 = module0147.$g2095$.currentBinding(var19);
        try {
            module0147.$g2094$.bind((SubLObject)module0559.$ic14$, var19);
            module0147.$g2095$.bind(module0559.$ic15$, var19);
            module0219.f14498(Symbols.symbol_function((SubLObject)module0559.$ic20$), var18, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var21, var19);
            module0147.$g2094$.rebind(var20, var19);
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34363(final SubLObject var18) {
        module0219.f14502(Symbols.symbol_function((SubLObject)module0559.$ic20$), var18, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34364(final SubLObject var52) {
        if (module0559.NIL != oc_deduction_handles.f11659(var52)) {
            final SubLObject var53 = module0188.f11788(var52);
            f34348(var53);
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34365() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0030.f1627(module0559.$g4033$.getDynamicValue(var1));
    }
    
    public static SubLObject f34366() {
        return module0035.remove_if_not((SubLObject)module0559.$ic21$, f34365(), (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
    }
    
    public static SubLObject f34352(final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        final SubLObject var20 = module0147.$g2094$.currentBinding(var19);
        final SubLObject var21 = module0147.$g2095$.currentBinding(var19);
        try {
            module0147.$g2094$.bind((SubLObject)module0559.$ic14$, var19);
            module0147.$g2095$.bind(module0559.$ic15$, var19);
            module0219.f14491((SubLObject)module0559.$ic20$, var18);
        }
        finally {
            module0147.$g2095$.rebind(var21, var19);
            module0147.$g2094$.rebind(var20, var19);
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34358(final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        final SubLObject var20 = module0147.$g2094$.currentBinding(var19);
        final SubLObject var21 = module0147.$g2095$.currentBinding(var19);
        try {
            module0147.$g2094$.bind((SubLObject)module0559.$ic14$, var19);
            module0147.$g2095$.bind(module0559.$ic15$, var19);
            module0219.f14492((SubLObject)module0559.$ic20$, var18, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var21, var19);
            module0147.$g2094$.rebind(var20, var19);
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34367(SubLObject var53) {
        if (var53 == module0559.UNPROVIDED) {
            var53 = (SubLObject)module0559.NIL;
        }
        if (module0559.NIL == var53) {
            var53 = Numbers.integerDivide(assertion_handles_oc.f11019(), (SubLObject)module0559.TEN_INTEGER);
        }
        final SubLObject var54 = Numbers.round(Numbers.divide(var53, module0213.f13872()), (SubLObject)module0559.UNPROVIDED);
        module0559.$g4036$.setDynamicValue(Hashtables.make_hash_table(var54, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED));
        final SubLObject var55 = Numbers.round(Numbers.divide(Numbers.divide(var53, module0213.f13872()), module0213.f13873()), (SubLObject)module0559.UNPROVIDED);
        module0559.$g4037$.setDynamicValue(Hashtables.make_hash_table(var55, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED));
        final SubLObject var56 = var53;
        module0559.$g4038$.setDynamicValue(Hashtables.make_hash_table(var56, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED));
        final SubLObject var57 = Numbers.round(Numbers.divide(var53, module0213.f13876()), (SubLObject)module0559.UNPROVIDED);
        module0559.$g4039$.setDynamicValue(Hashtables.make_hash_table(var57, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED));
        final SubLObject var58 = Numbers.round(Numbers.divide(var53, module0213.f13880()), (SubLObject)module0559.UNPROVIDED);
        module0559.$g4040$.setDynamicValue(Hashtables.make_hash_table(var58, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED));
        final SubLObject var59 = Numbers.round(Numbers.multiply(var53, module0213.f13877()), (SubLObject)module0559.UNPROVIDED);
        module0559.$g4041$.setDynamicValue(Hashtables.make_hash_table(var59, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED));
        module0559.$g4042$.setDynamicValue((SubLObject)module0559.ZERO_INTEGER);
        module0559.$g4043$.setDynamicValue((SubLObject)module0559.ZERO_INTEGER);
        module0559.$g4044$.setDynamicValue(module0067.f4880(Symbols.symbol_function((SubLObject)module0559.EQL), (SubLObject)module0559.UNPROVIDED));
        module0559.$g4045$.setDynamicValue((SubLObject)module0559.ZERO_INTEGER);
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34368(final SubLObject var2) {
        final SubLObject var3 = module0035.f2294(var2, (SubLObject)module0559.$ic9$, Symbols.symbol_function((SubLObject)module0559.EQL), (SubLObject)module0559.NIL);
        if (var3.isCons()) {
            return var3.first();
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34369(final SubLObject var2) {
        final SubLObject var3 = module0035.f2294(var2, (SubLObject)module0559.$ic10$, Symbols.symbol_function((SubLObject)module0559.EQL), (SubLObject)module0559.NIL);
        if (var3.isCons()) {
            return var3.first();
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34370(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        f34338(var2);
        final SubLObject var4 = f34368(var2);
        f34367(var4);
        final SubLObject var5 = module0559.$g4031$.currentBinding(var3);
        try {
            module0559.$g4031$.bind(f34369(var2), var3);
            final SubLObject var6 = module0559.$g4033$.getDynamicValue(var3);
            module0012.$g82$.setDynamicValue((SubLObject)module0559.$ic22$, var3);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var3);
            module0012.$g83$.setDynamicValue(Hashtables.hash_table_count(var6), var3);
            module0012.$g84$.setDynamicValue((SubLObject)module0559.ZERO_INTEGER, var3);
            final SubLObject var24_62 = module0012.$g75$.currentBinding(var3);
            final SubLObject var7 = module0012.$g76$.currentBinding(var3);
            final SubLObject var8 = module0012.$g77$.currentBinding(var3);
            final SubLObject var9 = module0012.$g78$.currentBinding(var3);
            try {
                module0012.$g75$.bind((SubLObject)module0559.ZERO_INTEGER, var3);
                module0012.$g76$.bind((SubLObject)module0559.NIL, var3);
                module0012.$g77$.bind((SubLObject)module0559.T, var3);
                module0012.$g78$.bind(Time.get_universal_time(), var3);
                module0012.f478(module0012.$g82$.getDynamicValue(var3));
                SubLObject var10 = (SubLObject)module0559.NIL;
                SubLObject var11 = (SubLObject)module0559.NIL;
                final Iterator var12 = Hashtables.getEntrySetIterator(var6);
                try {
                    while (Hashtables.iteratorHasNext(var12)) {
                        final Map.Entry var13 = Hashtables.iteratorNextEntry(var12);
                        var10 = Hashtables.getEntryKey(var13);
                        var11 = Hashtables.getEntryValue(var13);
                        module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var3), module0012.$g83$.getDynamicValue(var3));
                        module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var3), (SubLObject)module0559.ONE_INTEGER), var3);
                        f34371(var10);
                        if (module0559.NIL != constant_handles_oc.f8449(var10)) {
                            f34372(var10);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var12);
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var9, var3);
                module0012.$g77$.rebind(var8, var3);
                module0012.$g76$.rebind(var7, var3);
                module0012.$g75$.rebind(var24_62, var3);
            }
        }
        finally {
            module0559.$g4031$.rebind(var5, var3);
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34372(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        Hashtables.sethash(var19, module0559.$g4041$.getDynamicValue(var20), var19);
        f34373(var19);
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34373(final SubLObject var19) {
        SubLObject var21;
        final SubLObject var20 = var21 = module0617.f37896(var19);
        SubLObject var22 = (SubLObject)module0559.NIL;
        var22 = var21.first();
        while (module0559.NIL != var21) {
            f34371(var22);
            var21 = var21.rest();
            var22 = var21.first();
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34371(final SubLObject var16) {
        final SubLObject var17 = Structures.method_func(var16, module0559.$g4046$.getGlobalValue());
        if (module0559.NIL != var17) {
            return Functions.funcall(var17, var16);
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34374(final SubLObject var16) {
        f34371(var16.first());
        f34371(var16.rest());
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34375(final SubLObject var16) {
        return f34376(var16);
    }
    
    public static SubLObject f34376(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        if (module0559.NIL != constant_handles_oc.f8463(var19, (SubLObject)module0559.UNPROVIDED) && module0559.NIL == Hashtables.gethash_without_values(var19, module0559.$g4036$.getDynamicValue(var20), (SubLObject)module0559.UNPROVIDED)) {
            Hashtables.sethash(var19, module0559.$g4036$.getDynamicValue(var20), var19);
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34377(final SubLObject var16) {
        return f34378(var16);
    }
    
    public static SubLObject f34378(final SubLObject var70) {
        final SubLThread var71 = SubLProcess.currentSubLThread();
        if (module0559.NIL != module0167.f10824(var70, (SubLObject)module0559.UNPROVIDED) && module0559.NIL == Hashtables.gethash_without_values(var70, module0559.$g4037$.getDynamicValue(var71), (SubLObject)module0559.UNPROVIDED)) {
            Hashtables.sethash(var70, module0559.$g4037$.getDynamicValue(var71), var70);
            final SubLObject var72 = module0228.f15210(var70);
            if (var72.numG(module0559.$g4042$.getDynamicValue(var71))) {
                module0559.$g4042$.setDynamicValue(var72, var71);
            }
            final SubLObject var73 = module0228.f15206(var70);
            if (module0559.NIL != assertion_handles_oc.f11035(var73)) {
                f34371(var73);
            }
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34379(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        if (module0559.NIL != assertion_handles_oc.f11041(var16, (SubLObject)module0559.UNPROVIDED) && module0559.NIL == Hashtables.gethash_without_values(var16, module0559.$g4038$.getDynamicValue(var17), (SubLObject)module0559.UNPROVIDED) && module0559.NIL == Hashtables.gethash_without_values(var16, module0559.$g4039$.getDynamicValue(var17), (SubLObject)module0559.UNPROVIDED)) {
            final SubLObject var18 = module0213.f13939(var16);
            if (var18.numG(module0559.$g4043$.getDynamicValue(var17))) {
                module0559.$g4043$.setDynamicValue(var18, var17);
            }
            if (var18.numE((SubLObject)module0559.ONE_INTEGER)) {
                Hashtables.sethash(var16, module0559.$g4038$.getDynamicValue(var17), var16);
            }
            else {
                Hashtables.sethash(var16, module0559.$g4039$.getDynamicValue(var17), var16);
            }
            if (module0559.NIL == f34337()) {
                f34371(module0178.f11282(var16));
                f34371(module0178.f11287(var16));
            }
            f34380(var16);
            if (module0559.NIL == f34337()) {
                SubLObject var19 = module0178.f11299(var16);
                SubLObject var20 = (SubLObject)module0559.NIL;
                var20 = var19.first();
                while (module0559.NIL != var19) {
                    if (module0559.NIL != oc_deduction_handles.f11659(var20)) {
                        f34381(var20);
                    }
                    var19 = var19.rest();
                    var20 = var19.first();
                }
            }
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34382(final SubLObject var16) {
        return f34383(var16);
    }
    
    public static SubLObject f34383(final SubLObject var52) {
        return f34381(var52);
    }
    
    public static SubLObject f34384(final SubLObject var16) {
        return f34385(var16);
    }
    
    public static SubLObject f34385(final SubLObject var74) {
        final SubLThread var75 = SubLProcess.currentSubLThread();
        if (module0559.NIL != module0179.f11430(var74, (SubLObject)module0559.UNPROVIDED) && module0559.NIL == Hashtables.gethash_without_values(var74, module0559.$g4040$.getDynamicValue(var75), (SubLObject)module0559.UNPROVIDED)) {
            Hashtables.sethash(var74, module0559.$g4040$.getDynamicValue(var75), var74);
            f34386(var74);
            if (module0559.NIL == f34337()) {
                f34371(module0183.f11560(var74));
                f34371(module0183.f11561(var74));
                SubLObject var76 = module0183.f11558(var74);
                SubLObject var77 = (SubLObject)module0559.NIL;
                var77 = var76.first();
                while (module0559.NIL != var76) {
                    f34371(var77);
                    var76 = var76.rest();
                    var77 = var76.first();
                }
            }
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34380(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        if (module0559.NIL == Hashtables.gethash_without_values(var20, module0559.$g4041$.getDynamicValue(var21), (SubLObject)module0559.UNPROVIDED) && module0559.NIL != Sequences.find_if(Symbols.symbol_function((SubLObject)module0559.$ic30$), module0178.f11299(var20), (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED)) {
            Hashtables.sethash(var20, module0559.$g4041$.getDynamicValue(var21), var20);
            if (module0559.NIL == f34337()) {
                f34371(module0178.f11295(var20));
                f34371(module0178.f11297(var20));
            }
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34381(final SubLObject var52) {
        final SubLThread var53 = SubLProcess.currentSubLThread();
        if (module0559.NIL != oc_deduction_handles.f11665(var52, (SubLObject)module0559.UNPROVIDED) && module0559.NIL == Hashtables.gethash_without_values(var52, module0559.$g4041$.getDynamicValue(var53), (SubLObject)module0559.UNPROVIDED)) {
            Hashtables.sethash(var52, module0559.$g4041$.getDynamicValue(var53), var52);
            if (module0559.NIL == f34337()) {
                f34371(module0188.f11781(var52));
                SubLObject var54 = module0188.f11770(var52);
                SubLObject var55 = (SubLObject)module0559.NIL;
                var55 = var54.first();
                while (module0559.NIL != var54) {
                    f34371(var55);
                    var54 = var54.rest();
                    var55 = var54.first();
                }
            }
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34386(final SubLObject var74) {
        return module0035.sublisp_boolean(f34387(var74));
    }
    
    public static SubLObject f34387(final SubLObject var74) {
        final SubLThread var75 = SubLProcess.currentSubLThread();
        SubLObject var76 = module0067.f4884(module0559.$g4044$.getDynamicValue(var75), var74, (SubLObject)module0559.UNPROVIDED);
        if (module0559.NIL == var76) {
            var76 = (SubLObject)module0559.ONE_INTEGER;
            SubLObject var78;
            final SubLObject var77 = var78 = module0183.f11558(var74);
            SubLObject var79 = (SubLObject)module0559.NIL;
            var79 = var78.first();
            while (module0559.NIL != var78) {
                if (module0559.NIL != module0179.f11424(var79)) {
                    final SubLObject var80 = f34387(var79);
                    if (var76.numLE(var80)) {
                        var76 = Numbers.add((SubLObject)module0559.ONE_INTEGER, var80);
                    }
                }
                var78 = var78.rest();
                var79 = var78.first();
            }
            module0067.f4886(module0559.$g4044$.getDynamicValue(var75), var74, var76);
            if (var76.numG(module0559.$g4045$.getDynamicValue(var75))) {
                module0559.$g4045$.setDynamicValue(var76, var75);
            }
        }
        return var76;
    }
    
    public static SubLObject f34388() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        PrintLow.format((SubLObject)module0559.T, (SubLObject)module0559.$ic31$, Hashtables.hash_table_count(module0559.$g4036$.getDynamicValue(var1)));
        SubLObject var2 = module0559.$g4036$.getDynamicValue(var1);
        SubLObject var3 = (SubLObject)module0559.NIL;
        SubLObject var4 = (SubLObject)module0559.NIL;
        Iterator var5 = Hashtables.getEntrySetIterator(var2);
        try {
            while (Hashtables.iteratorHasNext(var5)) {
                final Map.Entry var6 = Hashtables.iteratorNextEntry(var5);
                var3 = Hashtables.getEntryKey(var6);
                var4 = Hashtables.getEntryValue(var6);
                PrintLow.format((SubLObject)module0559.T, (SubLObject)module0559.$ic32$, (SubLObject)((module0559.NIL != f34345(var3)) ? module0559.$ic33$ : module0559.$ic34$), var3);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var5);
        }
        PrintLow.format((SubLObject)module0559.T, (SubLObject)module0559.$ic35$, module0559.$g4042$.getDynamicValue(var1));
        if (module0559.$g4042$.getDynamicValue(var1).numG((SubLObject)module0559.ZERO_INTEGER)) {
            SubLObject var7;
            SubLObject var8;
            SubLObject var9;
            SubLObject var10;
            SubLObject var11;
            Iterator var12;
            Map.Entry var13;
            for (var7 = (SubLObject)module0559.NIL, var7 = (SubLObject)module0559.ZERO_INTEGER; var7.numL(module0559.$g4042$.getDynamicValue(var1)); var7 = Numbers.add(var7, (SubLObject)module0559.ONE_INTEGER)) {
                var8 = Numbers.add(var7, (SubLObject)module0559.ONE_INTEGER);
                PrintLow.format((SubLObject)module0559.T, (SubLObject)module0559.$ic36$, var8);
                var9 = module0559.$g4037$.getDynamicValue(var1);
                var10 = (SubLObject)module0559.NIL;
                var11 = (SubLObject)module0559.NIL;
                var12 = Hashtables.getEntrySetIterator(var9);
                try {
                    while (Hashtables.iteratorHasNext(var12)) {
                        var13 = Hashtables.iteratorNextEntry(var12);
                        var10 = Hashtables.getEntryKey(var13);
                        var11 = Hashtables.getEntryValue(var13);
                        if (module0228.f15210(var10).numE(var8)) {
                            PrintLow.format((SubLObject)module0559.T, (SubLObject)module0559.$ic32$, (SubLObject)((module0559.NIL != f34345(var10)) ? module0559.$ic33$ : module0559.$ic34$), var10);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var12);
                }
            }
        }
        PrintLow.format((SubLObject)module0559.T, (SubLObject)module0559.$ic37$, module0559.$g4043$.getDynamicValue(var1));
        if (module0559.$g4043$.getDynamicValue(var1).numG((SubLObject)module0559.ZERO_INTEGER)) {
            PrintLow.format((SubLObject)module0559.T, (SubLObject)module0559.$ic38$, Hashtables.hash_table_count(module0559.$g4038$.getDynamicValue(var1)));
            var2 = module0559.$g4038$.getDynamicValue(var1);
            var3 = (SubLObject)module0559.NIL;
            var4 = (SubLObject)module0559.NIL;
            var5 = Hashtables.getEntrySetIterator(var2);
            try {
                while (Hashtables.iteratorHasNext(var5)) {
                    final Map.Entry var6 = Hashtables.iteratorNextEntry(var5);
                    var3 = Hashtables.getEntryKey(var6);
                    var4 = Hashtables.getEntryValue(var6);
                    PrintLow.format((SubLObject)module0559.T, (SubLObject)module0559.$ic32$, (SubLObject)((module0559.NIL != f34345(var3)) ? module0559.$ic33$ : module0559.$ic34$), var3);
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(var5);
            }
            if (module0559.$g4043$.getDynamicValue(var1).numG((SubLObject)module0559.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0559.T, (SubLObject)module0559.$ic39$, Hashtables.hash_table_count(module0559.$g4039$.getDynamicValue(var1)));
                SubLObject var14;
                SubLObject var15;
                SubLObject var16;
                SubLObject var17;
                SubLObject var18;
                SubLObject var19;
                Iterator var20;
                Map.Entry var21;
                for (var14 = Numbers.subtract(module0559.$g4043$.getDynamicValue(var1), (SubLObject)module0559.ONE_INTEGER), var15 = (SubLObject)module0559.NIL, var15 = (SubLObject)module0559.ZERO_INTEGER; var15.numL(var14); var15 = Numbers.add(var15, (SubLObject)module0559.ONE_INTEGER)) {
                    var16 = Numbers.add(var15, (SubLObject)module0559.TWO_INTEGER);
                    PrintLow.format((SubLObject)module0559.T, (SubLObject)module0559.$ic40$, var16);
                    var17 = module0559.$g4039$.getDynamicValue(var1);
                    var18 = (SubLObject)module0559.NIL;
                    var19 = (SubLObject)module0559.NIL;
                    var20 = Hashtables.getEntrySetIterator(var17);
                    try {
                        while (Hashtables.iteratorHasNext(var20)) {
                            var21 = Hashtables.iteratorNextEntry(var20);
                            var18 = Hashtables.getEntryKey(var21);
                            var19 = Hashtables.getEntryValue(var21);
                            if (module0213.f13939(var18).numE(var16)) {
                                PrintLow.format((SubLObject)module0559.T, (SubLObject)module0559.$ic32$, (SubLObject)((module0559.NIL != f34345(var18)) ? module0559.$ic33$ : module0559.$ic34$), var18);
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(var20);
                    }
                }
            }
        }
        PrintLow.format((SubLObject)module0559.T, (SubLObject)module0559.$ic41$, Hashtables.hash_table_count(module0559.$g4041$.getDynamicValue(var1)));
        var2 = module0559.$g4041$.getDynamicValue(var1);
        var3 = (SubLObject)module0559.NIL;
        SubLObject var22 = (SubLObject)module0559.NIL;
        var5 = Hashtables.getEntrySetIterator(var2);
        try {
            while (Hashtables.iteratorHasNext(var5)) {
                final Map.Entry var6 = Hashtables.iteratorNextEntry(var5);
                var3 = Hashtables.getEntryKey(var6);
                var22 = Hashtables.getEntryValue(var6);
                streams_high.terpri((SubLObject)module0559.UNPROVIDED);
                if (module0559.NIL != oc_deduction_handles.f11659(var22)) {
                    PrintLow.format((SubLObject)module0559.T, (SubLObject)module0559.$ic42$, module0188.f11781(var22));
                }
                else if (module0559.NIL != assertion_handles_oc.f11035(var22)) {
                    PrintLow.format((SubLObject)module0559.T, (SubLObject)module0559.$ic43$, var22);
                }
                else {
                    PrintLow.format((SubLObject)module0559.T, (SubLObject)module0559.$ic44$, var22);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var5);
        }
        PrintLow.format((SubLObject)module0559.T, (SubLObject)module0559.$ic45$, module0559.$g4045$.getDynamicValue(var1));
        if (module0559.$g4045$.getDynamicValue(var1).numG((SubLObject)module0559.ZERO_INTEGER)) {
            PrintLow.format((SubLObject)module0559.T, (SubLObject)module0559.$ic46$, Hashtables.hash_table_count(module0559.$g4040$.getDynamicValue(var1)));
            SubLObject var7;
            SubLObject var9;
            SubLObject var10;
            SubLObject var11;
            Iterator var12;
            Map.Entry var13;
            SubLObject var23;
            for (var7 = (SubLObject)module0559.NIL, var7 = (SubLObject)module0559.ZERO_INTEGER; var7.numL(module0559.$g4045$.getDynamicValue(var1)); var7 = Numbers.add(var7, (SubLObject)module0559.ONE_INTEGER)) {
                var23 = Numbers.add((SubLObject)module0559.ONE_INTEGER, var7);
                PrintLow.format((SubLObject)module0559.T, (SubLObject)module0559.$ic47$, var23);
                var9 = module0559.$g4040$.getDynamicValue(var1);
                var10 = (SubLObject)module0559.NIL;
                var11 = (SubLObject)module0559.NIL;
                var12 = Hashtables.getEntrySetIterator(var9);
                try {
                    while (Hashtables.iteratorHasNext(var12)) {
                        var13 = Hashtables.iteratorNextEntry(var12);
                        var10 = Hashtables.getEntryKey(var13);
                        var11 = Hashtables.getEntryValue(var13);
                        if (f34387(var10).numE(var23)) {
                            PrintLow.format((SubLObject)module0559.T, (SubLObject)module0559.$ic32$, (SubLObject)((module0559.NIL != f34345(var10)) ? module0559.$ic33$ : module0559.$ic34$), var10);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var12);
                }
            }
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34389(final SubLObject var2) {
        if (module0559.NIL != var2) {
            f34338(var2);
            return f34390();
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34390() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = module0018.$g696$.currentBinding(var1);
        final SubLObject var3 = module0271.$g2562$.currentBinding(var1);
        final SubLObject var4 = module0144.$g1752$.currentBinding(var1);
        final SubLObject var5 = module0271.$g2560$.currentBinding(var1);
        final SubLObject var6 = module0271.$g2561$.currentBinding(var1);
        final SubLObject var7 = module0271.$g2563$.currentBinding(var1);
        final SubLObject var8 = module0146.$g2055$.currentBinding(var1);
        final SubLObject var9 = module0144.$g1771$.currentBinding(var1);
        final SubLObject var10 = module0144.$g1769$.currentBinding(var1);
        final SubLObject var11 = module0152.$g2107$.currentBinding(var1);
        final SubLObject var12 = module0110.$g1374$.currentBinding(var1);
        final SubLObject var13 = Errors.$continue_cerrorP$.currentBinding(var1);
        final SubLObject var14 = Errors.$ignore_warnsP$.currentBinding(var1);
        try {
            module0018.$g696$.bind((SubLObject)module0559.NIL, var1);
            module0271.$g2562$.bind((SubLObject)module0559.NIL, var1);
            module0144.$g1752$.bind((SubLObject)module0559.NIL, var1);
            module0271.$g2560$.bind((SubLObject)module0559.NIL, var1);
            module0271.$g2561$.bind((SubLObject)module0559.NIL, var1);
            module0271.$g2563$.bind((SubLObject)module0559.NIL, var1);
            module0146.$g2055$.bind((SubLObject)module0559.NIL, var1);
            module0144.$g1771$.bind((SubLObject)module0559.NIL, var1);
            module0144.$g1769$.bind((SubLObject)module0559.NIL, var1);
            module0152.$g2107$.bind((SubLObject)module0559.NIL, var1);
            module0110.$g1374$.bind((SubLObject)module0559.T, var1);
            Errors.$continue_cerrorP$.bind((SubLObject)module0559.T, var1);
            Errors.$ignore_warnsP$.bind((SubLObject)module0559.T, var1);
            SubLObject var15 = module0559.$g4033$.getDynamicValue(var1);
            module0012.$g82$.setDynamicValue((SubLObject)module0559.$ic48$, var1);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var1);
            module0012.$g83$.setDynamicValue(Hashtables.hash_table_count(var15), var1);
            module0012.$g84$.setDynamicValue((SubLObject)module0559.ZERO_INTEGER, var1);
            final SubLObject var24_94 = module0012.$g75$.currentBinding(var1);
            final SubLObject var25_95 = module0012.$g76$.currentBinding(var1);
            final SubLObject var63_96 = module0012.$g77$.currentBinding(var1);
            final SubLObject var64_97 = module0012.$g78$.currentBinding(var1);
            try {
                module0012.$g75$.bind((SubLObject)module0559.ZERO_INTEGER, var1);
                module0012.$g76$.bind((SubLObject)module0559.NIL, var1);
                module0012.$g77$.bind((SubLObject)module0559.T, var1);
                module0012.$g78$.bind(Time.get_universal_time(), var1);
                module0012.f478(module0012.$g82$.getDynamicValue(var1));
                SubLObject var16 = (SubLObject)module0559.NIL;
                SubLObject var17 = (SubLObject)module0559.NIL;
                final Iterator var18 = Hashtables.getEntrySetIterator(var15);
                try {
                    while (Hashtables.iteratorHasNext(var18)) {
                        final Map.Entry var19 = Hashtables.iteratorNextEntry(var18);
                        var16 = Hashtables.getEntryKey(var19);
                        var17 = Hashtables.getEntryValue(var19);
                        module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var1), module0012.$g83$.getDynamicValue(var1));
                        module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var1), (SubLObject)module0559.ONE_INTEGER), var1);
                        if (module0559.NIL != module0178.f11361(var17, (SubLObject)module0559.UNPROVIDED)) {
                            module0342.f23126(var17);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var18);
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var64_97, var1);
                module0012.$g77$.rebind(var63_96, var1);
                module0012.$g76$.rebind(var25_95, var1);
                module0012.$g75$.rebind(var24_94, var1);
            }
            var15 = module0559.$g4033$.getDynamicValue(var1);
            module0012.$g82$.setDynamicValue((SubLObject)module0559.$ic49$, var1);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var1);
            module0012.$g83$.setDynamicValue(Hashtables.hash_table_count(var15), var1);
            module0012.$g84$.setDynamicValue((SubLObject)module0559.ZERO_INTEGER, var1);
            final SubLObject var24_95 = module0012.$g75$.currentBinding(var1);
            final SubLObject var25_96 = module0012.$g76$.currentBinding(var1);
            final SubLObject var63_97 = module0012.$g77$.currentBinding(var1);
            final SubLObject var64_98 = module0012.$g78$.currentBinding(var1);
            try {
                module0012.$g75$.bind((SubLObject)module0559.ZERO_INTEGER, var1);
                module0012.$g76$.bind((SubLObject)module0559.NIL, var1);
                module0012.$g77$.bind((SubLObject)module0559.T, var1);
                module0012.$g78$.bind(Time.get_universal_time(), var1);
                module0012.f478(module0012.$g82$.getDynamicValue(var1));
                SubLObject var16 = (SubLObject)module0559.NIL;
                SubLObject var17 = (SubLObject)module0559.NIL;
                final Iterator var18 = Hashtables.getEntrySetIterator(var15);
                try {
                    while (Hashtables.iteratorHasNext(var18)) {
                        final Map.Entry var19 = Hashtables.iteratorNextEntry(var18);
                        var16 = Hashtables.getEntryKey(var19);
                        var17 = Hashtables.getEntryValue(var19);
                        module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var1), module0012.$g83$.getDynamicValue(var1));
                        module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var1), (SubLObject)module0559.ONE_INTEGER), var1);
                        if (module0559.NIL != module0167.f10824(var17, (SubLObject)module0559.UNPROVIDED)) {
                            module0540.f33510(var17);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var18);
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var64_98, var1);
                module0012.$g77$.rebind(var63_97, var1);
                module0012.$g76$.rebind(var25_96, var1);
                module0012.$g75$.rebind(var24_95, var1);
            }
            var15 = module0559.$g4033$.getDynamicValue(var1);
            module0012.$g82$.setDynamicValue((SubLObject)module0559.$ic50$, var1);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var1);
            module0012.$g83$.setDynamicValue(Hashtables.hash_table_count(var15), var1);
            module0012.$g84$.setDynamicValue((SubLObject)module0559.ZERO_INTEGER, var1);
            final SubLObject var24_96 = module0012.$g75$.currentBinding(var1);
            final SubLObject var25_97 = module0012.$g76$.currentBinding(var1);
            final SubLObject var63_98 = module0012.$g77$.currentBinding(var1);
            final SubLObject var64_99 = module0012.$g78$.currentBinding(var1);
            try {
                module0012.$g75$.bind((SubLObject)module0559.ZERO_INTEGER, var1);
                module0012.$g76$.bind((SubLObject)module0559.NIL, var1);
                module0012.$g77$.bind((SubLObject)module0559.T, var1);
                module0012.$g78$.bind(Time.get_universal_time(), var1);
                module0012.f478(module0012.$g82$.getDynamicValue(var1));
                SubLObject var16 = (SubLObject)module0559.NIL;
                SubLObject var17 = (SubLObject)module0559.NIL;
                final Iterator var18 = Hashtables.getEntrySetIterator(var15);
                try {
                    while (Hashtables.iteratorHasNext(var18)) {
                        final Map.Entry var19 = Hashtables.iteratorNextEntry(var18);
                        var16 = Hashtables.getEntryKey(var19);
                        var17 = Hashtables.getEntryValue(var19);
                        module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var1), module0012.$g83$.getDynamicValue(var1));
                        module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var1), (SubLObject)module0559.ONE_INTEGER), var1);
                        if (module0559.NIL != constant_handles_oc.f8463(var17, (SubLObject)module0559.UNPROVIDED)) {
                            module0540.f33510(var17);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var18);
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var64_99, var1);
                module0012.$g77$.rebind(var63_98, var1);
                module0012.$g76$.rebind(var25_97, var1);
                module0012.$g75$.rebind(var24_96, var1);
            }
        }
        finally {
            Errors.$ignore_warnsP$.rebind(var14, var1);
            Errors.$continue_cerrorP$.rebind(var13, var1);
            module0110.$g1374$.rebind(var12, var1);
            module0152.$g2107$.rebind(var11, var1);
            module0144.$g1769$.rebind(var10, var1);
            module0144.$g1771$.rebind(var9, var1);
            module0146.$g2055$.rebind(var8, var1);
            module0271.$g2563$.rebind(var7, var1);
            module0271.$g2561$.rebind(var6, var1);
            module0271.$g2560$.rebind(var5, var1);
            module0144.$g1752$.rebind(var4, var1);
            module0271.$g2562$.rebind(var3, var1);
            module0018.$g696$.rebind(var2, var1);
        }
        return (SubLObject)module0559.T;
    }
    
    public static SubLObject f34391(final SubLObject var106) {
        return module0075.f5175((SubLObject)module0559.$ic51$, var106, (SubLObject)module0559.$ic52$);
    }
    
    public static SubLObject f34392(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        assert module0559.NIL != assertion_handles_oc.f11035(var20) : var20;
        if (module0559.NIL != module0178.f11375(var20)) {
            final SubLObject var22 = module0538.f33478(var20, (SubLObject)module0559.UNPROVIDED);
            final SubLObject var23 = module0178.f11287(var20);
            final SubLObject var24 = module0178.f11293(var20);
            final SubLObject var25 = module0178.f11291(var20);
            PrintLow.format(module0559.$g4047$.getDynamicValue(var21), (SubLObject)module0559.$ic54$, new SubLObject[] { var22, var23, var24, var25 });
        }
        return (SubLObject)module0559.T;
    }
    
    public static SubLObject f34393(final SubLObject var18, SubLObject var110) {
        if (var110 == module0559.UNPROVIDED) {
            var110 = (SubLObject)module0559.NIL;
        }
        final SubLThread var111 = SubLProcess.currentSubLThread();
        assert module0559.NIL != module0173.f10955(var18) : var18;
        if (module0559.NIL != module0173.f10969(var18)) {
            if (module0559.NIL == module0167.f10813(var18)) {
                PrintLow.format(module0559.$g4047$.getDynamicValue(var111), (SubLObject)module0559.$ic55$, constants_high_oc.f10743(var18));
            }
            module0219.f14491(Symbols.symbol_function((SubLObject)module0559.$ic56$), var18);
            if (module0559.NIL != var110) {
                f34394(var18);
            }
        }
        return (SubLObject)module0559.T;
    }
    
    public static SubLObject f34395(final SubLObject var42, SubLObject var110) {
        if (var110 == module0559.UNPROVIDED) {
            var110 = (SubLObject)module0559.NIL;
        }
        assert module0559.NIL != module0173.f10955(var42) : var42;
        final SubLObject var111 = module0259.f16847(var42);
        final SubLObject var112 = module0256.f16557(var42, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        SubLObject var113 = var111;
        SubLObject var114 = (SubLObject)module0559.NIL;
        var114 = var113.first();
        while (module0559.NIL != var113) {
            f34393(var114, var110);
            var113 = var113.rest();
            var114 = var113.first();
        }
        var113 = var112;
        SubLObject var115 = (SubLObject)module0559.NIL;
        var115 = var113.first();
        while (module0559.NIL != var113) {
            if (!var115.equal(var42)) {
                f34393(var115, var110);
            }
            var113 = var113.rest();
            var115 = var113.first();
        }
        return f34393(var42, var110);
    }
    
    public static SubLObject f34396(final SubLObject var2, final SubLObject var106, SubLObject var110) {
        if (var110 == module0559.UNPROVIDED) {
            var110 = (SubLObject)module0559.NIL;
        }
        final SubLThread var111 = SubLProcess.currentSubLThread();
        final SubLObject var112 = f34391(var106);
        final SubLObject var113 = module0111.$g1406$.currentBinding(var111);
        final SubLObject var114 = module0018.$g689$.currentBinding(var111);
        try {
            module0111.$g1406$.bind((SubLObject)module0559.NIL, var111);
            module0018.$g689$.bind((SubLObject)module0559.NIL, var111);
            SubLObject var115 = (SubLObject)module0559.NIL;
            try {
                var115 = compatibility.open_text(var112, (SubLObject)module0559.$ic57$);
                if (!var115.isStream()) {
                    Errors.error((SubLObject)module0559.$ic58$, var112);
                }
                final SubLObject var24_115 = module0559.$g4047$.currentBinding(var111);
                try {
                    module0559.$g4047$.bind(var115, var111);
                    PrintLow.format(module0559.$g4047$.getDynamicValue(var111), (SubLObject)module0559.$ic59$, module0051.f3552((SubLObject)module0559.UNPROVIDED));
                    SubLObject var116 = var2;
                    SubLObject var117 = (SubLObject)module0559.NIL;
                    var117 = var116.first();
                    while (module0559.NIL != var116) {
                        SubLObject var119;
                        final SubLObject var118 = var119 = var117;
                        SubLObject var120 = (SubLObject)module0559.NIL;
                        SubLObject var121 = (SubLObject)module0559.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var119, var118, (SubLObject)module0559.$ic0$);
                        var120 = var119.first();
                        var119 = (var121 = var119.rest());
                        assert module0559.NIL != Types.keywordp(var120) : var120;
                        assert module0559.NIL != Types.stringp(var121) : var121;
                        final SubLObject var122 = module0538.f33336(var121);
                        if (module0559.NIL != constant_handles_oc.f8463(var122, (SubLObject)module0559.UNPROVIDED)) {
                            final SubLObject var123 = var120;
                            if (var123.eql((SubLObject)module0559.$ic2$)) {
                                f34395(var122, var110);
                            }
                            else {
                                f34393(var122, var110);
                            }
                        }
                        var116 = var116.rest();
                        var117 = var116.first();
                    }
                }
                finally {
                    module0559.$g4047$.rebind(var24_115, var111);
                }
            }
            finally {
                final SubLObject var24_116 = Threads.$is_thread_performing_cleanupP$.currentBinding(var111);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0559.T, var111);
                    if (var115.isStream()) {
                        streams_high.close(var115, (SubLObject)module0559.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var24_116, var111);
                }
            }
        }
        finally {
            module0018.$g689$.rebind(var114, var111);
            module0111.$g1406$.rebind(var113, var111);
        }
        return var112;
    }
    
    public static SubLObject f34394(final SubLObject var18) {
        assert module0559.NIL != module0173.f10955(var18) : var18;
        if (module0559.NIL != module0173.f10969(var18)) {
            module0538.f33375(var18);
            return (SubLObject)module0559.T;
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34397(final SubLObject var120, final SubLObject var2) {
        final SubLThread var121 = SubLProcess.currentSubLThread();
        assert module0559.NIL != Types.stringp(var120) : var120;
        SubLObject var122 = (SubLObject)module0559.NIL;
        SubLObject var123 = (SubLObject)module0559.NIL;
        try {
            final SubLObject var124 = stream_macros.$stream_requires_locking$.currentBinding(var121);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0559.NIL, var121);
                var123 = compatibility.open_binary(var120, (SubLObject)module0559.$ic61$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var124, var121);
            }
            if (!var123.isStream()) {
                Errors.error((SubLObject)module0559.$ic58$, var120);
            }
            final SubLObject var123_124 = var123;
            if (module0559.NIL != var2) {
                f34398(var123_124, var2);
            }
            var122 = var120;
        }
        finally {
            final SubLObject var125 = Threads.$is_thread_performing_cleanupP$.currentBinding(var121);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0559.T, var121);
                if (var123.isStream()) {
                    streams_high.close(var123, (SubLObject)module0559.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var125, var121);
            }
        }
        return var122;
    }
    
    public static SubLObject f34398(final SubLObject var123, final SubLObject var2) {
        assert module0559.NIL != module0021.f1018(var123) : var123;
        f34370(var2);
        f34399(var123);
        return var123;
    }
    
    public static SubLObject f34400(final SubLObject var123, final SubLObject var2) {
        assert module0559.NIL != module0021.f1018(var123) : var123;
        final SubLObject var124 = f34398(var123, var2);
        f34390();
        return var124;
    }
    
    public static SubLObject f34401() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return ConsesLow.append(oc_dumper.f37935(), module0559.$g4052$.getDynamicValue(var1));
    }
    
    public static SubLObject f34399(final SubLObject var123) {
        final SubLThread var124 = SubLProcess.currentSubLThread();
        f34402(var123);
        final SubLObject var125 = module0021.$g777$.currentBinding(var124);
        try {
            module0021.$g777$.bind((SubLObject)module0559.NIL, var124);
            module0021.f1149(f34401());
            f34403(var123);
            f34404(var123);
            f34405(var123);
            f34406(var123);
            f34407(var123);
        }
        finally {
            module0021.$g777$.rebind(var125, var124);
        }
        return (SubLObject)module0559.T;
    }
    
    public static SubLObject f34408(final SubLObject var123) {
        final SubLThread var124 = SubLProcess.currentSubLThread();
        module0021.f1038(module0559.$g4050$.getDynamicValue(var124), var123);
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34402(final SubLObject var123) {
        final SubLThread var124 = SubLProcess.currentSubLThread();
        SubLObject var126;
        final SubLObject var125 = var126 = module0011.f353();
        SubLObject var127 = (SubLObject)module0559.NIL;
        SubLObject var128 = (SubLObject)module0559.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var126, var125, (SubLObject)module0559.$ic67$);
        var127 = var126.first();
        var126 = var126.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var126, var125, (SubLObject)module0559.$ic67$);
        var128 = var126.first();
        final SubLObject var129;
        var126 = (var129 = var126.rest());
        module0021.f1038(module0107.f7573(), var123);
        module0021.f1038(module0559.$g4048$.getDynamicValue(var124), var123);
        module0021.f1038(var127, var123);
        module0021.f1038(var128, var123);
        module0021.f1038(module0051.f3557((SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED), var123);
        oc_dumper.f38026(f34401(), var123);
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34409() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return Numbers.numGE(Numbers.divide(Hashtables.hash_table_count(module0559.$g4036$.getDynamicValue(var1)), constant_handles_oc.f8433()), (SubLObject)module0559.$ic68$);
    }
    
    public static SubLObject f34403(final SubLObject var123) {
        final SubLThread var124 = SubLProcess.currentSubLThread();
        f34408(var123);
        final SubLObject var125 = Hashtables.hash_table_count(module0559.$g4036$.getDynamicValue(var124));
        module0021.f1038(var125, var123);
        if (module0559.NIL != f34409()) {
            final SubLObject var126 = constant_handles_oc.f8425();
            final SubLObject var127 = (SubLObject)module0559.$ic69$;
            final SubLObject var134_135 = module0065.f4733(var126);
            SubLObject var128 = (SubLObject)module0559.ZERO_INTEGER;
            assert module0559.NIL != Types.stringp(var127) : var127;
            final SubLObject var129 = module0012.$g75$.currentBinding(var124);
            final SubLObject var130 = module0012.$g76$.currentBinding(var124);
            final SubLObject var131 = module0012.$g77$.currentBinding(var124);
            final SubLObject var132 = module0012.$g78$.currentBinding(var124);
            try {
                module0012.$g75$.bind((SubLObject)module0559.ZERO_INTEGER, var124);
                module0012.$g76$.bind((SubLObject)module0559.NIL, var124);
                module0012.$g77$.bind((SubLObject)module0559.T, var124);
                module0012.$g78$.bind(Time.get_universal_time(), var124);
                module0012.f478(var127);
                final SubLObject var137_138 = var126;
                if (module0559.NIL == module0065.f4772(var137_138, (SubLObject)module0559.$ic70$)) {
                    final SubLObject var139_140 = var137_138;
                    if (module0559.NIL == module0065.f4775(var139_140, (SubLObject)module0559.$ic70$)) {
                        final SubLObject var133 = module0065.f4740(var139_140);
                        final SubLObject var134 = (SubLObject)module0559.NIL;
                        SubLObject var135;
                        SubLObject var136;
                        SubLObject var137;
                        SubLObject var138;
                        for (var135 = Sequences.length(var133), var136 = (SubLObject)module0559.NIL, var136 = (SubLObject)module0559.ZERO_INTEGER; var136.numL(var135); var136 = Numbers.add(var136, (SubLObject)module0559.ONE_INTEGER)) {
                            var137 = ((module0559.NIL != var134) ? Numbers.subtract(var135, var136, (SubLObject)module0559.ONE_INTEGER) : var136);
                            var138 = Vectors.aref(var133, var137);
                            if (module0559.NIL == module0065.f4749(var138) || module0559.NIL == module0065.f4773((SubLObject)module0559.$ic70$)) {
                                if (module0559.NIL != module0065.f4749(var138)) {
                                    var138 = (SubLObject)module0559.$ic70$;
                                }
                                module0012.note_percent_progress(var128, var134_135);
                                var128 = Numbers.add(var128, (SubLObject)module0559.ONE_INTEGER);
                                if (module0559.NIL != Hashtables.gethash_without_values(var138, module0559.$g4036$.getDynamicValue(var124), (SubLObject)module0559.UNPROVIDED)) {
                                    f34410(var138, var123);
                                }
                            }
                        }
                    }
                    final SubLObject var146_147 = var137_138;
                    if (module0559.NIL == module0065.f4777(var146_147) || module0559.NIL == module0065.f4773((SubLObject)module0559.$ic70$)) {
                        final SubLObject var139 = module0065.f4738(var146_147);
                        SubLObject var140 = module0065.f4739(var146_147);
                        final SubLObject var141 = module0065.f4734(var146_147);
                        final SubLObject var142 = (SubLObject)((module0559.NIL != module0065.f4773((SubLObject)module0559.$ic70$)) ? module0559.NIL : module0559.$ic70$);
                        while (var140.numL(var141)) {
                            final SubLObject var143 = Hashtables.gethash_without_values(var140, var139, var142);
                            if (module0559.NIL == module0065.f4773((SubLObject)module0559.$ic70$) || module0559.NIL == module0065.f4749(var143)) {
                                module0012.note_percent_progress(var128, var134_135);
                                var128 = Numbers.add(var128, (SubLObject)module0559.ONE_INTEGER);
                                if (module0559.NIL != Hashtables.gethash_without_values(var143, module0559.$g4036$.getDynamicValue(var124), (SubLObject)module0559.UNPROVIDED)) {
                                    f34410(var143, var123);
                                }
                            }
                            var140 = Numbers.add(var140, (SubLObject)module0559.ONE_INTEGER);
                        }
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var132, var124);
                module0012.$g77$.rebind(var131, var124);
                module0012.$g76$.rebind(var130, var124);
                module0012.$g75$.rebind(var129, var124);
            }
        }
        else {
            final SubLObject var144 = module0559.$g4036$.getDynamicValue(var124);
            module0012.$g82$.setDynamicValue((SubLObject)module0559.$ic71$, var124);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var124);
            module0012.$g83$.setDynamicValue(Hashtables.hash_table_count(var144), var124);
            module0012.$g84$.setDynamicValue((SubLObject)module0559.ZERO_INTEGER, var124);
            final SubLObject var145 = module0012.$g75$.currentBinding(var124);
            final SubLObject var146 = module0012.$g76$.currentBinding(var124);
            final SubLObject var147 = module0012.$g77$.currentBinding(var124);
            final SubLObject var148 = module0012.$g78$.currentBinding(var124);
            try {
                module0012.$g75$.bind((SubLObject)module0559.ZERO_INTEGER, var124);
                module0012.$g76$.bind((SubLObject)module0559.NIL, var124);
                module0012.$g77$.bind((SubLObject)module0559.T, var124);
                module0012.$g78$.bind(Time.get_universal_time(), var124);
                module0012.f478(module0012.$g82$.getDynamicValue(var124));
                SubLObject var149 = (SubLObject)module0559.NIL;
                SubLObject var150 = (SubLObject)module0559.NIL;
                final Iterator var151 = Hashtables.getEntrySetIterator(var144);
                try {
                    while (Hashtables.iteratorHasNext(var151)) {
                        final Map.Entry var152 = Hashtables.iteratorNextEntry(var151);
                        var149 = Hashtables.getEntryKey(var152);
                        var150 = Hashtables.getEntryValue(var152);
                        module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var124), module0012.$g83$.getDynamicValue(var124));
                        module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var124), (SubLObject)module0559.ONE_INTEGER), var124);
                        f34410(var149, var123);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var151);
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var148, var124);
                module0012.$g77$.rebind(var147, var124);
                module0012.$g76$.rebind(var146, var124);
                module0012.$g75$.rebind(var145, var124);
            }
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34410(final SubLObject var19, final SubLObject var123) {
        module0021.f1038(constants_high_oc.f10749(var19), var123);
        module0021.f1038(constants_high_oc.f10743(var19), var123);
        module0021.f1038(constants_high_oc.f10744(var19), var123);
        module0021.f1038(f34345(var19), var123);
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34404(final SubLObject var123) {
        final SubLThread var124 = SubLProcess.currentSubLThread();
        module0021.f1038(module0559.$g4042$.getDynamicValue(var124), var123);
        SubLObject var125;
        SubLObject var126;
        for (var125 = (SubLObject)module0559.NIL, var125 = (SubLObject)module0559.ZERO_INTEGER; var125.numL(module0559.$g4042$.getDynamicValue(var124)); var125 = Numbers.add(var125, (SubLObject)module0559.ONE_INTEGER)) {
            var126 = Numbers.add(var125, (SubLObject)module0559.ONE_INTEGER);
            f34411(var126, var123);
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34411(final SubLObject var81, final SubLObject var123) {
        final SubLThread var124 = SubLProcess.currentSubLThread();
        f34408(var123);
        final SubLObject var125 = f34412(var81);
        module0021.f1038(var125, var123);
        final SubLObject var126 = Sequences.cconcatenate((SubLObject)module0559.$ic72$, new SubLObject[] { module0006.f205(var81), module0559.$ic73$ });
        if (module0559.NIL != f34409()) {
            final SubLObject var127 = module0167.f10788();
            final SubLObject var128 = Sequences.cconcatenate((SubLObject)module0559.$ic74$, module0006.f203(var126));
            final SubLObject var134_152 = module0065.f4733(var127);
            SubLObject var129 = (SubLObject)module0559.ZERO_INTEGER;
            assert module0559.NIL != Types.stringp(var128) : var128;
            final SubLObject var130 = module0012.$g75$.currentBinding(var124);
            final SubLObject var131 = module0012.$g76$.currentBinding(var124);
            final SubLObject var132 = module0012.$g77$.currentBinding(var124);
            final SubLObject var133 = module0012.$g78$.currentBinding(var124);
            try {
                module0012.$g75$.bind((SubLObject)module0559.ZERO_INTEGER, var124);
                module0012.$g76$.bind((SubLObject)module0559.NIL, var124);
                module0012.$g77$.bind((SubLObject)module0559.T, var124);
                module0012.$g78$.bind(Time.get_universal_time(), var124);
                module0012.f478(var128);
                final SubLObject var137_153 = var127;
                if (module0559.NIL == module0065.f4772(var137_153, (SubLObject)module0559.$ic70$)) {
                    final SubLObject var139_154 = var137_153;
                    if (module0559.NIL == module0065.f4775(var139_154, (SubLObject)module0559.$ic70$)) {
                        final SubLObject var134 = module0065.f4740(var139_154);
                        final SubLObject var135 = (SubLObject)module0559.NIL;
                        SubLObject var136;
                        SubLObject var137;
                        SubLObject var138;
                        SubLObject var139;
                        for (var136 = Sequences.length(var134), var137 = (SubLObject)module0559.NIL, var137 = (SubLObject)module0559.ZERO_INTEGER; var137.numL(var136); var137 = Numbers.add(var137, (SubLObject)module0559.ONE_INTEGER)) {
                            var138 = ((module0559.NIL != var135) ? Numbers.subtract(var136, var137, (SubLObject)module0559.ONE_INTEGER) : var137);
                            var139 = Vectors.aref(var134, var138);
                            if (module0559.NIL == module0065.f4749(var139) || module0559.NIL == module0065.f4773((SubLObject)module0559.$ic70$)) {
                                if (module0559.NIL != module0065.f4749(var139)) {
                                    var139 = (SubLObject)module0559.$ic70$;
                                }
                                module0012.note_percent_progress(var129, var134_152);
                                var129 = Numbers.add(var129, (SubLObject)module0559.ONE_INTEGER);
                                if (module0559.NIL != Hashtables.gethash_without_values(var139, module0559.$g4037$.getDynamicValue(var124), (SubLObject)module0559.UNPROVIDED) && module0228.f15210(var139).numE(var81)) {
                                    f34413(var139, var123);
                                }
                            }
                        }
                    }
                    final SubLObject var146_155 = var137_153;
                    if (module0559.NIL == module0065.f4777(var146_155) || module0559.NIL == module0065.f4773((SubLObject)module0559.$ic70$)) {
                        final SubLObject var140 = module0065.f4738(var146_155);
                        SubLObject var141 = module0065.f4739(var146_155);
                        final SubLObject var142 = module0065.f4734(var146_155);
                        final SubLObject var143 = (SubLObject)((module0559.NIL != module0065.f4773((SubLObject)module0559.$ic70$)) ? module0559.NIL : module0559.$ic70$);
                        while (var141.numL(var142)) {
                            final SubLObject var144 = Hashtables.gethash_without_values(var141, var140, var143);
                            if (module0559.NIL == module0065.f4773((SubLObject)module0559.$ic70$) || module0559.NIL == module0065.f4749(var144)) {
                                module0012.note_percent_progress(var129, var134_152);
                                var129 = Numbers.add(var129, (SubLObject)module0559.ONE_INTEGER);
                                if (module0559.NIL != Hashtables.gethash_without_values(var144, module0559.$g4037$.getDynamicValue(var124), (SubLObject)module0559.UNPROVIDED) && module0228.f15210(var144).numE(var81)) {
                                    f34413(var144, var123);
                                }
                            }
                            var141 = Numbers.add(var141, (SubLObject)module0559.ONE_INTEGER);
                        }
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var133, var124);
                module0012.$g77$.rebind(var132, var124);
                module0012.$g76$.rebind(var131, var124);
                module0012.$g75$.rebind(var130, var124);
            }
        }
        else {
            final SubLObject var145 = module0559.$g4037$.getDynamicValue(var124);
            module0012.$g82$.setDynamicValue(var126, var124);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var124);
            module0012.$g83$.setDynamicValue(Hashtables.hash_table_count(var145), var124);
            module0012.$g84$.setDynamicValue((SubLObject)module0559.ZERO_INTEGER, var124);
            final SubLObject var146 = module0012.$g75$.currentBinding(var124);
            final SubLObject var147 = module0012.$g76$.currentBinding(var124);
            final SubLObject var148 = module0012.$g77$.currentBinding(var124);
            final SubLObject var149 = module0012.$g78$.currentBinding(var124);
            try {
                module0012.$g75$.bind((SubLObject)module0559.ZERO_INTEGER, var124);
                module0012.$g76$.bind((SubLObject)module0559.NIL, var124);
                module0012.$g77$.bind((SubLObject)module0559.T, var124);
                module0012.$g78$.bind(Time.get_universal_time(), var124);
                module0012.f478(module0012.$g82$.getDynamicValue(var124));
                SubLObject var150 = (SubLObject)module0559.NIL;
                SubLObject var151 = (SubLObject)module0559.NIL;
                final Iterator var152 = Hashtables.getEntrySetIterator(var145);
                try {
                    while (Hashtables.iteratorHasNext(var152)) {
                        final Map.Entry var153 = Hashtables.iteratorNextEntry(var152);
                        var150 = Hashtables.getEntryKey(var153);
                        var151 = Hashtables.getEntryValue(var153);
                        module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var124), module0012.$g83$.getDynamicValue(var124));
                        module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var124), (SubLObject)module0559.ONE_INTEGER), var124);
                        if (module0228.f15210(var150).numE(var81)) {
                            f34413(var150, var123);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var152);
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var149, var124);
                module0012.$g77$.rebind(var148, var124);
                module0012.$g76$.rebind(var147, var124);
                module0012.$g75$.rebind(var146, var124);
            }
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34412(final SubLObject var81) {
        final SubLThread var82 = SubLProcess.currentSubLThread();
        SubLObject var83 = (SubLObject)module0559.ZERO_INTEGER;
        final SubLObject var84 = module0559.$g4037$.getDynamicValue(var82);
        SubLObject var85 = (SubLObject)module0559.NIL;
        SubLObject var86 = (SubLObject)module0559.NIL;
        final Iterator var87 = Hashtables.getEntrySetIterator(var84);
        try {
            while (Hashtables.iteratorHasNext(var87)) {
                final Map.Entry var88 = Hashtables.iteratorNextEntry(var87);
                var85 = Hashtables.getEntryKey(var88);
                var86 = Hashtables.getEntryValue(var88);
                if (module0228.f15210(var86).numE(var81)) {
                    var83 = Numbers.add(var83, (SubLObject)module0559.ONE_INTEGER);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var87);
        }
        return var83;
    }
    
    public static SubLObject f34413(final SubLObject var70, final SubLObject var123) {
        module0021.f1038(module0167.f10803(var70), var123);
        module0021.f1038(module0172.f10915(var70), var123);
        module0021.f1038(f34345(var70), var123);
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34405(final SubLObject var123) {
        final SubLThread var124 = SubLProcess.currentSubLThread();
        module0021.f1038(module0559.$g4043$.getDynamicValue(var124), var123);
        SubLObject var125;
        SubLObject var126;
        for (var125 = (SubLObject)module0559.NIL, var125 = (SubLObject)module0559.ZERO_INTEGER; var125.numL(module0559.$g4043$.getDynamicValue(var124)); var125 = Numbers.add(var125, (SubLObject)module0559.ONE_INTEGER)) {
            var126 = Numbers.add(var125, (SubLObject)module0559.ONE_INTEGER);
            if (var126.numE((SubLObject)module0559.ONE_INTEGER)) {
                f34414(var123);
            }
            else {
                f34415(var126, var123);
            }
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34414(final SubLObject var123) {
        final SubLThread var124 = SubLProcess.currentSubLThread();
        f34408(var123);
        final SubLObject var125 = Hashtables.hash_table_count(module0559.$g4038$.getDynamicValue(var124));
        module0021.f1038(var125, var123);
        if (module0559.NIL != f34409()) {
            final SubLObject var126 = assertion_handles_oc.f11010();
            final SubLObject var127 = (SubLObject)module0559.$ic75$;
            final SubLObject var134_157 = module0065.f4733(var126);
            SubLObject var128 = (SubLObject)module0559.ZERO_INTEGER;
            assert module0559.NIL != Types.stringp(var127) : var127;
            final SubLObject var129 = module0012.$g75$.currentBinding(var124);
            final SubLObject var130 = module0012.$g76$.currentBinding(var124);
            final SubLObject var131 = module0012.$g77$.currentBinding(var124);
            final SubLObject var132 = module0012.$g78$.currentBinding(var124);
            try {
                module0012.$g75$.bind((SubLObject)module0559.ZERO_INTEGER, var124);
                module0012.$g76$.bind((SubLObject)module0559.NIL, var124);
                module0012.$g77$.bind((SubLObject)module0559.T, var124);
                module0012.$g78$.bind(Time.get_universal_time(), var124);
                module0012.f478(var127);
                final SubLObject var137_158 = var126;
                if (module0559.NIL == module0065.f4772(var137_158, (SubLObject)module0559.$ic70$)) {
                    final SubLObject var139_159 = var137_158;
                    if (module0559.NIL == module0065.f4775(var139_159, (SubLObject)module0559.$ic70$)) {
                        final SubLObject var133 = module0065.f4740(var139_159);
                        final SubLObject var134 = (SubLObject)module0559.NIL;
                        SubLObject var135;
                        SubLObject var136;
                        SubLObject var137;
                        SubLObject var138;
                        for (var135 = Sequences.length(var133), var136 = (SubLObject)module0559.NIL, var136 = (SubLObject)module0559.ZERO_INTEGER; var136.numL(var135); var136 = Numbers.add(var136, (SubLObject)module0559.ONE_INTEGER)) {
                            var137 = ((module0559.NIL != var134) ? Numbers.subtract(var135, var136, (SubLObject)module0559.ONE_INTEGER) : var136);
                            var138 = Vectors.aref(var133, var137);
                            if (module0559.NIL == module0065.f4749(var138) || module0559.NIL == module0065.f4773((SubLObject)module0559.$ic70$)) {
                                if (module0559.NIL != module0065.f4749(var138)) {
                                    var138 = (SubLObject)module0559.$ic70$;
                                }
                                module0012.note_percent_progress(var128, var134_157);
                                var128 = Numbers.add(var128, (SubLObject)module0559.ONE_INTEGER);
                                if (module0559.NIL != Hashtables.gethash_without_values(var138, module0559.$g4038$.getDynamicValue(var124), (SubLObject)module0559.UNPROVIDED)) {
                                    f34416(var138, var123);
                                }
                            }
                        }
                    }
                    final SubLObject var146_160 = var137_158;
                    if (module0559.NIL == module0065.f4777(var146_160) || module0559.NIL == module0065.f4773((SubLObject)module0559.$ic70$)) {
                        final SubLObject var139 = module0065.f4738(var146_160);
                        SubLObject var140 = module0065.f4739(var146_160);
                        final SubLObject var141 = module0065.f4734(var146_160);
                        final SubLObject var142 = (SubLObject)((module0559.NIL != module0065.f4773((SubLObject)module0559.$ic70$)) ? module0559.NIL : module0559.$ic70$);
                        while (var140.numL(var141)) {
                            final SubLObject var143 = Hashtables.gethash_without_values(var140, var139, var142);
                            if (module0559.NIL == module0065.f4773((SubLObject)module0559.$ic70$) || module0559.NIL == module0065.f4749(var143)) {
                                module0012.note_percent_progress(var128, var134_157);
                                var128 = Numbers.add(var128, (SubLObject)module0559.ONE_INTEGER);
                                if (module0559.NIL != Hashtables.gethash_without_values(var143, module0559.$g4038$.getDynamicValue(var124), (SubLObject)module0559.UNPROVIDED)) {
                                    f34416(var143, var123);
                                }
                            }
                            var140 = Numbers.add(var140, (SubLObject)module0559.ONE_INTEGER);
                        }
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var132, var124);
                module0012.$g77$.rebind(var131, var124);
                module0012.$g76$.rebind(var130, var124);
                module0012.$g75$.rebind(var129, var124);
            }
        }
        else {
            final SubLObject var144 = module0559.$g4038$.getDynamicValue(var124);
            module0012.$g82$.setDynamicValue((SubLObject)module0559.$ic76$, var124);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var124);
            module0012.$g83$.setDynamicValue(Hashtables.hash_table_count(var144), var124);
            module0012.$g84$.setDynamicValue((SubLObject)module0559.ZERO_INTEGER, var124);
            final SubLObject var145 = module0012.$g75$.currentBinding(var124);
            final SubLObject var146 = module0012.$g76$.currentBinding(var124);
            final SubLObject var147 = module0012.$g77$.currentBinding(var124);
            final SubLObject var148 = module0012.$g78$.currentBinding(var124);
            try {
                module0012.$g75$.bind((SubLObject)module0559.ZERO_INTEGER, var124);
                module0012.$g76$.bind((SubLObject)module0559.NIL, var124);
                module0012.$g77$.bind((SubLObject)module0559.T, var124);
                module0012.$g78$.bind(Time.get_universal_time(), var124);
                module0012.f478(module0012.$g82$.getDynamicValue(var124));
                SubLObject var149 = (SubLObject)module0559.NIL;
                SubLObject var150 = (SubLObject)module0559.NIL;
                final Iterator var151 = Hashtables.getEntrySetIterator(var144);
                try {
                    while (Hashtables.iteratorHasNext(var151)) {
                        final Map.Entry var152 = Hashtables.iteratorNextEntry(var151);
                        var149 = Hashtables.getEntryKey(var152);
                        var150 = Hashtables.getEntryValue(var152);
                        module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var124), module0012.$g83$.getDynamicValue(var124));
                        module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var124), (SubLObject)module0559.ONE_INTEGER), var124);
                        f34416(var149, var123);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var151);
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var148, var124);
                module0012.$g77$.rebind(var147, var124);
                module0012.$g76$.rebind(var146, var124);
                module0012.$g75$.rebind(var145, var124);
            }
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34415(final SubLObject var83, final SubLObject var123) {
        final SubLThread var124 = SubLProcess.currentSubLThread();
        f34408(var123);
        final SubLObject var125 = f34417(var83);
        module0021.f1038(var125, var123);
        final SubLObject var126 = Sequences.cconcatenate((SubLObject)module0559.$ic77$, new SubLObject[] { module0006.f205(var83), module0559.$ic78$ });
        final SubLObject var127 = module0559.$g4039$.getDynamicValue(var124);
        module0012.$g82$.setDynamicValue(var126, var124);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var124);
        module0012.$g83$.setDynamicValue(Hashtables.hash_table_count(var127), var124);
        module0012.$g84$.setDynamicValue((SubLObject)module0559.ZERO_INTEGER, var124);
        final SubLObject var128 = module0012.$g75$.currentBinding(var124);
        final SubLObject var129 = module0012.$g76$.currentBinding(var124);
        final SubLObject var130 = module0012.$g77$.currentBinding(var124);
        final SubLObject var131 = module0012.$g78$.currentBinding(var124);
        try {
            module0012.$g75$.bind((SubLObject)module0559.ZERO_INTEGER, var124);
            module0012.$g76$.bind((SubLObject)module0559.NIL, var124);
            module0012.$g77$.bind((SubLObject)module0559.T, var124);
            module0012.$g78$.bind(Time.get_universal_time(), var124);
            module0012.f478(module0012.$g82$.getDynamicValue(var124));
            SubLObject var132 = (SubLObject)module0559.NIL;
            SubLObject var133 = (SubLObject)module0559.NIL;
            final Iterator var134 = Hashtables.getEntrySetIterator(var127);
            try {
                while (Hashtables.iteratorHasNext(var134)) {
                    final Map.Entry var135 = Hashtables.iteratorNextEntry(var134);
                    var132 = Hashtables.getEntryKey(var135);
                    var133 = Hashtables.getEntryValue(var135);
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var124), module0012.$g83$.getDynamicValue(var124));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var124), (SubLObject)module0559.ONE_INTEGER), var124);
                    if (module0213.f13939(var133).numE(var83)) {
                        f34416(var133, var123);
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(var134);
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var131, var124);
            module0012.$g77$.rebind(var130, var124);
            module0012.$g76$.rebind(var129, var124);
            module0012.$g75$.rebind(var128, var124);
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34417(final SubLObject var83) {
        final SubLThread var84 = SubLProcess.currentSubLThread();
        SubLObject var85 = (SubLObject)module0559.ZERO_INTEGER;
        final SubLObject var86 = module0559.$g4039$.getDynamicValue(var84);
        SubLObject var87 = (SubLObject)module0559.NIL;
        SubLObject var88 = (SubLObject)module0559.NIL;
        final Iterator var89 = Hashtables.getEntrySetIterator(var86);
        try {
            while (Hashtables.iteratorHasNext(var89)) {
                final Map.Entry var90 = Hashtables.iteratorNextEntry(var89);
                var87 = Hashtables.getEntryKey(var90);
                var88 = Hashtables.getEntryValue(var90);
                if (module0213.f13939(var88).numE(var83)) {
                    var85 = Numbers.add(var85, (SubLObject)module0559.ONE_INTEGER);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var89);
        }
        return var85;
    }
    
    public static SubLObject f34416(final SubLObject var20, final SubLObject var123) {
        module0021.f1038(assertion_handles_oc.f11025(var20), var123);
        module0021.f1038(f34345(var20), var123);
        module0021.f1038(module0178.f11282(var20), var123);
        module0021.f1038(module0178.f11287(var20), var123);
        module0021.f1038(module0178.f11291(var20), var123);
        module0021.f1038(module0178.f11294(var20), var123);
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34406(final SubLObject var123) {
        final SubLThread var124 = SubLProcess.currentSubLThread();
        module0021.f1038(module0559.$g4045$.getDynamicValue(var124), var123);
        SubLObject var125;
        SubLObject var126;
        for (var125 = (SubLObject)module0559.NIL, var125 = (SubLObject)module0559.ZERO_INTEGER; var125.numL(module0559.$g4045$.getDynamicValue(var124)); var125 = Numbers.add(var125, (SubLObject)module0559.ONE_INTEGER)) {
            var126 = Numbers.add((SubLObject)module0559.ONE_INTEGER, var125);
            f34418(var126, var123);
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34418(final SubLObject var71, final SubLObject var123) {
        final SubLThread var124 = SubLProcess.currentSubLThread();
        f34408(var123);
        final SubLObject var125 = f34419(var71);
        module0021.f1038(var125, var123);
        final SubLObject var126 = Sequences.cconcatenate((SubLObject)module0559.$ic72$, new SubLObject[] { module0006.f205(var71), module0559.$ic79$ });
        if (module0559.NIL != f34409()) {
            final SubLObject var127 = module0179.f11398();
            final SubLObject var128 = Sequences.cconcatenate((SubLObject)module0559.$ic74$, module0006.f203(var126));
            final SubLObject var134_162 = module0065.f4733(var127);
            SubLObject var129 = (SubLObject)module0559.ZERO_INTEGER;
            assert module0559.NIL != Types.stringp(var128) : var128;
            final SubLObject var130 = module0012.$g75$.currentBinding(var124);
            final SubLObject var131 = module0012.$g76$.currentBinding(var124);
            final SubLObject var132 = module0012.$g77$.currentBinding(var124);
            final SubLObject var133 = module0012.$g78$.currentBinding(var124);
            try {
                module0012.$g75$.bind((SubLObject)module0559.ZERO_INTEGER, var124);
                module0012.$g76$.bind((SubLObject)module0559.NIL, var124);
                module0012.$g77$.bind((SubLObject)module0559.T, var124);
                module0012.$g78$.bind(Time.get_universal_time(), var124);
                module0012.f478(var128);
                final SubLObject var137_163 = var127;
                if (module0559.NIL == module0065.f4772(var137_163, (SubLObject)module0559.$ic70$)) {
                    final SubLObject var139_164 = var137_163;
                    if (module0559.NIL == module0065.f4775(var139_164, (SubLObject)module0559.$ic70$)) {
                        final SubLObject var134 = module0065.f4740(var139_164);
                        final SubLObject var135 = (SubLObject)module0559.NIL;
                        SubLObject var136;
                        SubLObject var137;
                        SubLObject var138;
                        SubLObject var139;
                        for (var136 = Sequences.length(var134), var137 = (SubLObject)module0559.NIL, var137 = (SubLObject)module0559.ZERO_INTEGER; var137.numL(var136); var137 = Numbers.add(var137, (SubLObject)module0559.ONE_INTEGER)) {
                            var138 = ((module0559.NIL != var135) ? Numbers.subtract(var136, var137, (SubLObject)module0559.ONE_INTEGER) : var137);
                            var139 = Vectors.aref(var134, var138);
                            if (module0559.NIL == module0065.f4749(var139) || module0559.NIL == module0065.f4773((SubLObject)module0559.$ic70$)) {
                                if (module0559.NIL != module0065.f4749(var139)) {
                                    var139 = (SubLObject)module0559.$ic70$;
                                }
                                module0012.note_percent_progress(var129, var134_162);
                                var129 = Numbers.add(var129, (SubLObject)module0559.ONE_INTEGER);
                                if (module0559.NIL != Hashtables.gethash_without_values(var139, module0559.$g4040$.getDynamicValue(var124), (SubLObject)module0559.UNPROVIDED) && f34387(var139).numE(var71)) {
                                    f34420(var139, var123);
                                }
                            }
                        }
                    }
                    final SubLObject var146_165 = var137_163;
                    if (module0559.NIL == module0065.f4777(var146_165) || module0559.NIL == module0065.f4773((SubLObject)module0559.$ic70$)) {
                        final SubLObject var140 = module0065.f4738(var146_165);
                        SubLObject var141 = module0065.f4739(var146_165);
                        final SubLObject var142 = module0065.f4734(var146_165);
                        final SubLObject var143 = (SubLObject)((module0559.NIL != module0065.f4773((SubLObject)module0559.$ic70$)) ? module0559.NIL : module0559.$ic70$);
                        while (var141.numL(var142)) {
                            final SubLObject var144 = Hashtables.gethash_without_values(var141, var140, var143);
                            if (module0559.NIL == module0065.f4773((SubLObject)module0559.$ic70$) || module0559.NIL == module0065.f4749(var144)) {
                                module0012.note_percent_progress(var129, var134_162);
                                var129 = Numbers.add(var129, (SubLObject)module0559.ONE_INTEGER);
                                if (module0559.NIL != Hashtables.gethash_without_values(var144, module0559.$g4040$.getDynamicValue(var124), (SubLObject)module0559.UNPROVIDED) && f34387(var144).numE(var71)) {
                                    f34420(var144, var123);
                                }
                            }
                            var141 = Numbers.add(var141, (SubLObject)module0559.ONE_INTEGER);
                        }
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var133, var124);
                module0012.$g77$.rebind(var132, var124);
                module0012.$g76$.rebind(var131, var124);
                module0012.$g75$.rebind(var130, var124);
            }
        }
        else {
            final SubLObject var145 = module0559.$g4040$.getDynamicValue(var124);
            module0012.$g82$.setDynamicValue(var126, var124);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var124);
            module0012.$g83$.setDynamicValue(Hashtables.hash_table_count(var145), var124);
            module0012.$g84$.setDynamicValue((SubLObject)module0559.ZERO_INTEGER, var124);
            final SubLObject var146 = module0012.$g75$.currentBinding(var124);
            final SubLObject var147 = module0012.$g76$.currentBinding(var124);
            final SubLObject var148 = module0012.$g77$.currentBinding(var124);
            final SubLObject var149 = module0012.$g78$.currentBinding(var124);
            try {
                module0012.$g75$.bind((SubLObject)module0559.ZERO_INTEGER, var124);
                module0012.$g76$.bind((SubLObject)module0559.NIL, var124);
                module0012.$g77$.bind((SubLObject)module0559.T, var124);
                module0012.$g78$.bind(Time.get_universal_time(), var124);
                module0012.f478(module0012.$g82$.getDynamicValue(var124));
                SubLObject var150 = (SubLObject)module0559.NIL;
                SubLObject var151 = (SubLObject)module0559.NIL;
                final Iterator var152 = Hashtables.getEntrySetIterator(var145);
                try {
                    while (Hashtables.iteratorHasNext(var152)) {
                        final Map.Entry var153 = Hashtables.iteratorNextEntry(var152);
                        var150 = Hashtables.getEntryKey(var153);
                        var151 = Hashtables.getEntryValue(var153);
                        module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var124), module0012.$g83$.getDynamicValue(var124));
                        module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var124), (SubLObject)module0559.ONE_INTEGER), var124);
                        if (f34387(var150).numE(var71)) {
                            f34420(var150, var123);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var152);
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var149, var124);
                module0012.$g77$.rebind(var148, var124);
                module0012.$g76$.rebind(var147, var124);
                module0012.$g75$.rebind(var146, var124);
            }
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34419(final SubLObject var71) {
        final SubLThread var72 = SubLProcess.currentSubLThread();
        SubLObject var73 = (SubLObject)module0559.ZERO_INTEGER;
        final SubLObject var74 = module0559.$g4040$.getDynamicValue(var72);
        SubLObject var75 = (SubLObject)module0559.NIL;
        SubLObject var76 = (SubLObject)module0559.NIL;
        final Iterator var77 = Hashtables.getEntrySetIterator(var74);
        try {
            while (Hashtables.iteratorHasNext(var77)) {
                final Map.Entry var78 = Hashtables.iteratorNextEntry(var77);
                var75 = Hashtables.getEntryKey(var78);
                var76 = Hashtables.getEntryValue(var78);
                if (f34387(var76).numE(var71)) {
                    var73 = Numbers.add(var73, (SubLObject)module0559.ONE_INTEGER);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var77);
        }
        return var73;
    }
    
    public static SubLObject f34420(final SubLObject var74, final SubLObject var123) {
        final SubLObject var124 = module0179.f11415(var74);
        final SubLObject var125 = f34345(var74);
        final SubLObject var126 = module0183.f11557(var74);
        final SubLObject var127 = module0183.f11558(var74);
        module0021.f1038(var124, var123);
        module0021.f1038(var125, var123);
        module0021.f1038(var126, var123);
        module0021.f1038(var127, var123);
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34407(final SubLObject var123) {
        final SubLThread var124 = SubLProcess.currentSubLThread();
        f34408(var123);
        final SubLObject var125 = Hashtables.hash_table_count(module0559.$g4041$.getDynamicValue(var124));
        module0021.f1038(var125, var123);
        if (module0559.NIL != f34409()) {
            SubLObject var126 = assertion_handles_oc.f11010();
            SubLObject var127 = (SubLObject)module0559.$ic80$;
            final SubLObject var134_169 = module0065.f4733(var126);
            SubLObject var128 = (SubLObject)module0559.ZERO_INTEGER;
            assert module0559.NIL != Types.stringp(var127) : var127;
            SubLObject var129 = module0012.$g75$.currentBinding(var124);
            SubLObject var130 = module0012.$g76$.currentBinding(var124);
            SubLObject var131 = module0012.$g77$.currentBinding(var124);
            SubLObject var132 = module0012.$g78$.currentBinding(var124);
            try {
                module0012.$g75$.bind((SubLObject)module0559.ZERO_INTEGER, var124);
                module0012.$g76$.bind((SubLObject)module0559.NIL, var124);
                module0012.$g77$.bind((SubLObject)module0559.T, var124);
                module0012.$g78$.bind(Time.get_universal_time(), var124);
                module0012.f478(var127);
                final SubLObject var137_170 = var126;
                if (module0559.NIL == module0065.f4772(var137_170, (SubLObject)module0559.$ic70$)) {
                    final SubLObject var139_171 = var137_170;
                    if (module0559.NIL == module0065.f4775(var139_171, (SubLObject)module0559.$ic70$)) {
                        final SubLObject var133 = module0065.f4740(var139_171);
                        final SubLObject var134 = (SubLObject)module0559.NIL;
                        SubLObject var135;
                        SubLObject var136;
                        SubLObject var137;
                        SubLObject var138;
                        for (var135 = Sequences.length(var133), var136 = (SubLObject)module0559.NIL, var136 = (SubLObject)module0559.ZERO_INTEGER; var136.numL(var135); var136 = Numbers.add(var136, (SubLObject)module0559.ONE_INTEGER)) {
                            var137 = ((module0559.NIL != var134) ? Numbers.subtract(var135, var136, (SubLObject)module0559.ONE_INTEGER) : var136);
                            var138 = Vectors.aref(var133, var137);
                            if (module0559.NIL == module0065.f4749(var138) || module0559.NIL == module0065.f4773((SubLObject)module0559.$ic70$)) {
                                if (module0559.NIL != module0065.f4749(var138)) {
                                    var138 = (SubLObject)module0559.$ic70$;
                                }
                                module0012.note_percent_progress(var128, var134_169);
                                var128 = Numbers.add(var128, (SubLObject)module0559.ONE_INTEGER);
                                if (module0559.NIL != Hashtables.gethash_without_values(var138, module0559.$g4041$.getDynamicValue(var124), (SubLObject)module0559.UNPROVIDED)) {
                                    f34421(var138, var123);
                                }
                            }
                        }
                    }
                    final SubLObject var146_172 = var137_170;
                    if (module0559.NIL == module0065.f4777(var146_172) || module0559.NIL == module0065.f4773((SubLObject)module0559.$ic70$)) {
                        final SubLObject var139 = module0065.f4738(var146_172);
                        SubLObject var140 = module0065.f4739(var146_172);
                        final SubLObject var141 = module0065.f4734(var146_172);
                        final SubLObject var142 = (SubLObject)((module0559.NIL != module0065.f4773((SubLObject)module0559.$ic70$)) ? module0559.NIL : module0559.$ic70$);
                        while (var140.numL(var141)) {
                            final SubLObject var143 = Hashtables.gethash_without_values(var140, var139, var142);
                            if (module0559.NIL == module0065.f4773((SubLObject)module0559.$ic70$) || module0559.NIL == module0065.f4749(var143)) {
                                module0012.note_percent_progress(var128, var134_169);
                                var128 = Numbers.add(var128, (SubLObject)module0559.ONE_INTEGER);
                                if (module0559.NIL != Hashtables.gethash_without_values(var143, module0559.$g4041$.getDynamicValue(var124), (SubLObject)module0559.UNPROVIDED)) {
                                    f34421(var143, var123);
                                }
                            }
                            var140 = Numbers.add(var140, (SubLObject)module0559.ONE_INTEGER);
                        }
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var132, var124);
                module0012.$g77$.rebind(var131, var124);
                module0012.$g76$.rebind(var130, var124);
                module0012.$g75$.rebind(var129, var124);
            }
            var126 = oc_deduction_handles.f11634();
            var127 = (SubLObject)module0559.$ic81$;
            final SubLObject var134_170 = module0065.f4733(var126);
            var128 = (SubLObject)module0559.ZERO_INTEGER;
            assert module0559.NIL != Types.stringp(var127) : var127;
            var129 = module0012.$g75$.currentBinding(var124);
            var130 = module0012.$g76$.currentBinding(var124);
            var131 = module0012.$g77$.currentBinding(var124);
            var132 = module0012.$g78$.currentBinding(var124);
            try {
                module0012.$g75$.bind((SubLObject)module0559.ZERO_INTEGER, var124);
                module0012.$g76$.bind((SubLObject)module0559.NIL, var124);
                module0012.$g77$.bind((SubLObject)module0559.T, var124);
                module0012.$g78$.bind(Time.get_universal_time(), var124);
                module0012.f478(var127);
                final SubLObject var137_171 = var126;
                if (module0559.NIL == module0065.f4772(var137_171, (SubLObject)module0559.$ic70$)) {
                    final SubLObject var139_172 = var137_171;
                    if (module0559.NIL == module0065.f4775(var139_172, (SubLObject)module0559.$ic70$)) {
                        final SubLObject var133 = module0065.f4740(var139_172);
                        final SubLObject var134 = (SubLObject)module0559.NIL;
                        SubLObject var135;
                        SubLObject var136;
                        SubLObject var137;
                        SubLObject var144;
                        for (var135 = Sequences.length(var133), var136 = (SubLObject)module0559.NIL, var136 = (SubLObject)module0559.ZERO_INTEGER; var136.numL(var135); var136 = Numbers.add(var136, (SubLObject)module0559.ONE_INTEGER)) {
                            var137 = ((module0559.NIL != var134) ? Numbers.subtract(var135, var136, (SubLObject)module0559.ONE_INTEGER) : var136);
                            var144 = Vectors.aref(var133, var137);
                            if (module0559.NIL == module0065.f4749(var144) || module0559.NIL == module0065.f4773((SubLObject)module0559.$ic70$)) {
                                if (module0559.NIL != module0065.f4749(var144)) {
                                    var144 = (SubLObject)module0559.$ic70$;
                                }
                                module0012.note_percent_progress(var128, var134_170);
                                var128 = Numbers.add(var128, (SubLObject)module0559.ONE_INTEGER);
                                if (module0559.NIL != Hashtables.gethash_without_values(var144, module0559.$g4041$.getDynamicValue(var124), (SubLObject)module0559.UNPROVIDED)) {
                                    f34421(var144, var123);
                                }
                            }
                        }
                    }
                    final SubLObject var146_173 = var137_171;
                    if (module0559.NIL == module0065.f4777(var146_173) || module0559.NIL == module0065.f4773((SubLObject)module0559.$ic70$)) {
                        final SubLObject var139 = module0065.f4738(var146_173);
                        SubLObject var140 = module0065.f4739(var146_173);
                        final SubLObject var141 = module0065.f4734(var146_173);
                        final SubLObject var142 = (SubLObject)((module0559.NIL != module0065.f4773((SubLObject)module0559.$ic70$)) ? module0559.NIL : module0559.$ic70$);
                        while (var140.numL(var141)) {
                            final SubLObject var145 = Hashtables.gethash_without_values(var140, var139, var142);
                            if (module0559.NIL == module0065.f4773((SubLObject)module0559.$ic70$) || module0559.NIL == module0065.f4749(var145)) {
                                module0012.note_percent_progress(var128, var134_170);
                                var128 = Numbers.add(var128, (SubLObject)module0559.ONE_INTEGER);
                                if (module0559.NIL != Hashtables.gethash_without_values(var145, module0559.$g4041$.getDynamicValue(var124), (SubLObject)module0559.UNPROVIDED)) {
                                    f34421(var145, var123);
                                }
                            }
                            var140 = Numbers.add(var140, (SubLObject)module0559.ONE_INTEGER);
                        }
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var132, var124);
                module0012.$g77$.rebind(var131, var124);
                module0012.$g76$.rebind(var130, var124);
                module0012.$g75$.rebind(var129, var124);
            }
            var126 = constant_handles_oc.f8425();
            var127 = (SubLObject)module0559.$ic82$;
            final SubLObject var134_171 = module0065.f4733(var126);
            var128 = (SubLObject)module0559.ZERO_INTEGER;
            assert module0559.NIL != Types.stringp(var127) : var127;
            var129 = module0012.$g75$.currentBinding(var124);
            var130 = module0012.$g76$.currentBinding(var124);
            var131 = module0012.$g77$.currentBinding(var124);
            var132 = module0012.$g78$.currentBinding(var124);
            try {
                module0012.$g75$.bind((SubLObject)module0559.ZERO_INTEGER, var124);
                module0012.$g76$.bind((SubLObject)module0559.NIL, var124);
                module0012.$g77$.bind((SubLObject)module0559.T, var124);
                module0012.$g78$.bind(Time.get_universal_time(), var124);
                module0012.f478(var127);
                final SubLObject var137_172 = var126;
                if (module0559.NIL == module0065.f4772(var137_172, (SubLObject)module0559.$ic70$)) {
                    final SubLObject var139_173 = var137_172;
                    if (module0559.NIL == module0065.f4775(var139_173, (SubLObject)module0559.$ic70$)) {
                        final SubLObject var133 = module0065.f4740(var139_173);
                        final SubLObject var134 = (SubLObject)module0559.NIL;
                        SubLObject var135;
                        SubLObject var136;
                        SubLObject var137;
                        SubLObject var146;
                        for (var135 = Sequences.length(var133), var136 = (SubLObject)module0559.NIL, var136 = (SubLObject)module0559.ZERO_INTEGER; var136.numL(var135); var136 = Numbers.add(var136, (SubLObject)module0559.ONE_INTEGER)) {
                            var137 = ((module0559.NIL != var134) ? Numbers.subtract(var135, var136, (SubLObject)module0559.ONE_INTEGER) : var136);
                            var146 = Vectors.aref(var133, var137);
                            if (module0559.NIL == module0065.f4749(var146) || module0559.NIL == module0065.f4773((SubLObject)module0559.$ic70$)) {
                                if (module0559.NIL != module0065.f4749(var146)) {
                                    var146 = (SubLObject)module0559.$ic70$;
                                }
                                module0012.note_percent_progress(var128, var134_171);
                                var128 = Numbers.add(var128, (SubLObject)module0559.ONE_INTEGER);
                                if (module0559.NIL != Hashtables.gethash_without_values(var146, module0559.$g4041$.getDynamicValue(var124), (SubLObject)module0559.UNPROVIDED)) {
                                    f34421(var146, var123);
                                }
                            }
                        }
                    }
                    final SubLObject var146_174 = var137_172;
                    if (module0559.NIL == module0065.f4777(var146_174) || module0559.NIL == module0065.f4773((SubLObject)module0559.$ic70$)) {
                        final SubLObject var139 = module0065.f4738(var146_174);
                        SubLObject var140 = module0065.f4739(var146_174);
                        final SubLObject var141 = module0065.f4734(var146_174);
                        final SubLObject var142 = (SubLObject)((module0559.NIL != module0065.f4773((SubLObject)module0559.$ic70$)) ? module0559.NIL : module0559.$ic70$);
                        while (var140.numL(var141)) {
                            final SubLObject var147 = Hashtables.gethash_without_values(var140, var139, var142);
                            if (module0559.NIL == module0065.f4773((SubLObject)module0559.$ic70$) || module0559.NIL == module0065.f4749(var147)) {
                                module0012.note_percent_progress(var128, var134_171);
                                var128 = Numbers.add(var128, (SubLObject)module0559.ONE_INTEGER);
                                if (module0559.NIL != Hashtables.gethash_without_values(var147, module0559.$g4041$.getDynamicValue(var124), (SubLObject)module0559.UNPROVIDED)) {
                                    f34421(var147, var123);
                                }
                            }
                            var140 = Numbers.add(var140, (SubLObject)module0559.ONE_INTEGER);
                        }
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var132, var124);
                module0012.$g77$.rebind(var131, var124);
                module0012.$g76$.rebind(var130, var124);
                module0012.$g75$.rebind(var129, var124);
            }
        }
        else {
            final SubLObject var148 = module0559.$g4041$.getDynamicValue(var124);
            module0012.$g82$.setDynamicValue((SubLObject)module0559.$ic83$, var124);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var124);
            module0012.$g83$.setDynamicValue(Hashtables.hash_table_count(var148), var124);
            module0012.$g84$.setDynamicValue((SubLObject)module0559.ZERO_INTEGER, var124);
            final SubLObject var149 = module0012.$g75$.currentBinding(var124);
            final SubLObject var150 = module0012.$g76$.currentBinding(var124);
            final SubLObject var151 = module0012.$g77$.currentBinding(var124);
            final SubLObject var152 = module0012.$g78$.currentBinding(var124);
            try {
                module0012.$g75$.bind((SubLObject)module0559.ZERO_INTEGER, var124);
                module0012.$g76$.bind((SubLObject)module0559.NIL, var124);
                module0012.$g77$.bind((SubLObject)module0559.T, var124);
                module0012.$g78$.bind(Time.get_universal_time(), var124);
                module0012.f478(module0012.$g82$.getDynamicValue(var124));
                SubLObject var153 = (SubLObject)module0559.NIL;
                SubLObject var154 = (SubLObject)module0559.NIL;
                final Iterator var155 = Hashtables.getEntrySetIterator(var148);
                try {
                    while (Hashtables.iteratorHasNext(var155)) {
                        final Map.Entry var156 = Hashtables.iteratorNextEntry(var155);
                        var153 = Hashtables.getEntryKey(var156);
                        var154 = Hashtables.getEntryValue(var156);
                        module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var124), module0012.$g83$.getDynamicValue(var124));
                        module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var124), (SubLObject)module0559.ONE_INTEGER), var124);
                        f34421(var153, var123);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var155);
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var152, var124);
                module0012.$g77$.rebind(var151, var124);
                module0012.$g76$.rebind(var150, var124);
                module0012.$g75$.rebind(var149, var124);
            }
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34421(final SubLObject var16, final SubLObject var123) {
        if (module0559.NIL != assertion_handles_oc.f11035(var16)) {
            f34422(var16, var123);
        }
        else if (module0559.NIL != oc_deduction_handles.f11659(var16)) {
            f34423(var16, var123);
        }
        else if (module0559.NIL != constant_handles_oc.f8449(var16)) {
            f34424(var16, var123);
        }
        else {
            Errors.error((SubLObject)module0559.$ic84$, var16);
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34423(final SubLObject var52, final SubLObject var123) {
        module0021.f1038(oc_deduction_handles.f11649(var52), var123);
        module0021.f1038(module0191.f11926(var52), var123);
        module0021.f1038(module0188.f11781(var52), var123);
        module0021.f1038(module0188.f11770(var52), var123);
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34422(final SubLObject var20, final SubLObject var123) {
        module0021.f1038((SubLObject)module0559.NIL, var123);
        module0021.f1038(var20, var123);
        final SubLObject var124 = module0178.f11299(var20);
        final SubLObject var125 = Sequences.count_if(Symbols.symbol_function((SubLObject)module0559.$ic30$), var124, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        module0021.f1038(var125, var123);
        SubLObject var126 = var124;
        SubLObject var127 = (SubLObject)module0559.NIL;
        var127 = var126.first();
        while (module0559.NIL != var126) {
            if (module0559.NIL != module0191.f11911(var127)) {
                f34425(var127, var20, var123);
            }
            var126 = var126.rest();
            var127 = var126.first();
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34425(final SubLObject var73, final SubLObject var20, final SubLObject var123) {
        if (module0559.NIL != module0191.f11932(var73)) {
            f34426(var73, var20, var123);
        }
        else {
            Errors.error((SubLObject)module0559.$ic85$, var73);
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34426(final SubLObject var73, final SubLObject var20, final SubLObject var123) {
        final SubLThread var124 = SubLProcess.currentSubLThread();
        module0021.f1038(module0559.$g4051$.getDynamicValue(var124), var123);
        module0021.f1038(module0191.f11926(var73), var123);
        module0021.f1038(oc_assertions_low.f11194(var20), var123);
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34424(final SubLObject var18, final SubLObject var123) {
        module0021.f1038((SubLObject)module0559.NIL, var123);
        module0021.f1038((SubLObject)module0559.NIL, var123);
        final SubLObject var124 = module0617.f37883(var18);
        final SubLObject var125 = Sequences.length(var124);
        module0021.f1038(var125, var123);
        SubLObject var126 = var124;
        SubLObject var127 = (SubLObject)module0559.NIL;
        var127 = var126.first();
        while (module0559.NIL != var126) {
            f34427(var127, var123);
            var126 = var126.rest();
            var127 = var126.first();
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34427(final SubLObject var185, final SubLObject var123) {
        SubLObject var186 = (SubLObject)module0559.NIL;
        SubLObject var187 = (SubLObject)module0559.NIL;
        SubLObject var188 = (SubLObject)module0559.NIL;
        SubLObject var189 = (SubLObject)module0559.NIL;
        SubLObject var190 = (SubLObject)module0559.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var185, var185, (SubLObject)module0559.$ic86$);
        var186 = var185.first();
        SubLObject var191 = var185.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var191, var185, (SubLObject)module0559.$ic86$);
        var187 = var191.first();
        var191 = var191.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var191, var185, (SubLObject)module0559.$ic86$);
        var188 = var191.first();
        var191 = var191.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var191, var185, (SubLObject)module0559.$ic86$);
        var189 = var191.first();
        var191 = var191.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var191, var185, (SubLObject)module0559.$ic86$);
        var190 = var191.first();
        var191 = var191.rest();
        if (module0559.NIL == var191) {
            module0021.f1038(var186, var123);
            module0021.f1038(var187, var123);
            module0021.f1038(var188, var123);
            module0021.f1038(var189, var123);
            module0021.f1038(var190, var123);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var185, (SubLObject)module0559.$ic86$);
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34428(final SubLObject var190, SubLObject var191) {
        if (var191 == module0559.UNPROVIDED) {
            var191 = module0559.$g4032$.getDynamicValue();
        }
        f34429(var190, var191);
        return f34430();
    }
    
    public static SubLObject f34431(final SubLObject var192) {
        SubLObject var193 = var192;
        SubLObject var194 = (SubLObject)module0559.NIL;
        var194 = var193.first();
        while (module0559.NIL != var193) {
            f34429(var194, (SubLObject)module0559.UNPROVIDED);
            var193 = var193.rest();
            var194 = var193.first();
        }
        return f34430();
    }
    
    public static SubLObject f34430() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = module0559.$g4053$.currentBinding(var1);
        try {
            module0559.$g4053$.bind(module0031.f1685(f34432(), (SubLObject)module0559.UNPROVIDED), var1);
            SubLObject var3 = (SubLObject)module0559.ZERO_INTEGER;
            SubLObject var4 = (SubLObject)module0559.ZERO_INTEGER;
            SubLObject var5 = (SubLObject)module0559.ZERO_INTEGER;
            PrintLow.format((SubLObject)module0559.T, (SubLObject)module0559.$ic87$);
            final SubLObject var24_196 = module0147.$g2094$.currentBinding(var1);
            final SubLObject var6 = module0147.$g2095$.currentBinding(var1);
            try {
                module0147.$g2094$.bind((SubLObject)module0559.$ic14$, var1);
                module0147.$g2095$.bind(module0559.$ic15$, var1);
                SubLObject var7 = f34433();
                SubLObject var8 = (SubLObject)module0559.NIL;
                var8 = var7.first();
                while (module0559.NIL != var7) {
                    if (!module0217.f14221(var8, (SubLObject)module0559.ONE_INTEGER, module0559.$ic88$, (SubLObject)module0559.UNPROVIDED).isPositive()) {
                        f34434(var8);
                    }
                    var7 = var7.rest();
                    var8 = var7.first();
                }
                if (module0559.$g4054$.getDynamicValue(var1).isNumber()) {
                    SubLObject var9;
                    SubLObject var10;
                    SubLObject var11;
                    SubLObject var12;
                    for (var9 = Numbers.add(module0559.$g4054$.getDynamicValue(var1), (SubLObject)module0559.ONE_INTEGER), var10 = (SubLObject)module0559.NIL, var10 = (SubLObject)module0559.ONE_INTEGER; !var10.numGE(var9); var10 = module0048.f_1X(var10)) {
                        var11 = f34435();
                        var12 = (SubLObject)module0559.NIL;
                        var12 = var11.first();
                        while (module0559.NIL != var11) {
                            if (var10.eql(module0228.f15210(var12)) && (!module0217.f14221(var12, (SubLObject)module0559.ONE_INTEGER, module0559.$ic88$, (SubLObject)module0559.UNPROVIDED).isPositive() || module0559.NIL != module0035.f2439((SubLObject)module0559.$ic89$, module0172.f10915(var12), (SubLObject)module0559.UNPROVIDED))) {
                                f34434(var12);
                            }
                            var11 = var11.rest();
                            var12 = var11.first();
                        }
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var6, var1);
                module0147.$g2094$.rebind(var24_196, var1);
            }
            SubLObject var7;
            SubLObject var13;
            SubLObject var14;
            SubLObject var15;
            for (var13 = Numbers.add(module0559.$g4055$.getDynamicValue(var1), (SubLObject)module0559.TWO_INTEGER), var14 = (SubLObject)module0559.NIL, var14 = (SubLObject)module0559.ONE_INTEGER; !var14.numGE(var13); var14 = module0048.f_1X(var14)) {
                var7 = f34436();
                var15 = (SubLObject)module0559.NIL;
                var15 = var7.first();
                while (module0559.NIL != var7) {
                    if (var14.eql(module0213.f13939(var15)) && (module0559.NIL != f34437(module0161.f10557(module0178.f11287(var15))) || module0559.NIL != module0035.f2439((SubLObject)module0559.$ic89$, module0178.f11282(var15), (SubLObject)module0559.UNPROVIDED))) {
                        f34434(var15);
                    }
                    var7 = var7.rest();
                    var15 = var7.first();
                }
            }
            SubLObject var16 = f34436();
            SubLObject var17 = (SubLObject)module0559.NIL;
            var17 = var16.first();
            while (module0559.NIL != var16) {
                if (module0559.NIL != f34437(var17)) {
                    var5 = Numbers.add(var5, (SubLObject)module0559.ONE_INTEGER);
                    module0342.f23126(var17);
                }
                var16 = var16.rest();
                var17 = var16.first();
            }
            if (module0559.$g4054$.getDynamicValue(var1).isNumber()) {
                SubLObject var18;
                SubLObject var19;
                for (var13 = (SubLObject)module0559.ZERO_INTEGER, var18 = (SubLObject)module0559.NIL, var18 = module0559.$g4054$.getDynamicValue(var1); !var18.numLE(var13); var18 = Numbers.add(var18, (SubLObject)module0559.MINUS_ONE_INTEGER)) {
                    var7 = f34435();
                    var19 = (SubLObject)module0559.NIL;
                    var19 = var7.first();
                    while (module0559.NIL != var7) {
                        if (var18.eql(module0228.f15210(var19)) && module0559.NIL != f34437(var19)) {
                            var4 = Numbers.add(var4, (SubLObject)module0559.ONE_INTEGER);
                            module0172.f10929(var19);
                        }
                        var7 = var7.rest();
                        var19 = var7.first();
                    }
                }
            }
            var16 = f34433();
            SubLObject var20 = (SubLObject)module0559.NIL;
            var20 = var16.first();
            while (module0559.NIL != var16) {
                if (module0559.NIL != f34437(var20)) {
                    var3 = Numbers.add(var3, (SubLObject)module0559.ONE_INTEGER);
                    constants_high_oc.f10741(var20);
                }
                var16 = var16.rest();
                var20 = var16.first();
            }
            PrintLow.format((SubLObject)module0559.T, (SubLObject)module0559.$ic90$);
            PrintLow.format((SubLObject)module0559.T, (SubLObject)module0559.$ic91$, var3);
            PrintLow.format((SubLObject)module0559.T, (SubLObject)module0559.$ic92$, var4);
            PrintLow.format((SubLObject)module0559.T, (SubLObject)module0559.$ic93$, var5);
        }
        finally {
            module0559.$g4053$.rebind(var2, var1);
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34432() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return Numbers.add(new SubLObject[] { module0559.$g4056$.getDynamicValue(var1).isHashtable() ? Hashtables.hash_table_count(module0559.$g4056$.getDynamicValue(var1)) : module0559.ZERO_INTEGER, module0559.$g4057$.getDynamicValue(var1).isHashtable() ? Hashtables.hash_table_count(module0559.$g4057$.getDynamicValue(var1)) : module0559.ZERO_INTEGER, module0559.$g4058$.getDynamicValue(var1).isHashtable() ? Hashtables.hash_table_count(module0559.$g4058$.getDynamicValue(var1)) : module0559.ZERO_INTEGER, module0559.$g4059$.getDynamicValue(var1).isHashtable() ? Hashtables.hash_table_count(module0559.$g4059$.getDynamicValue(var1)) : module0559.ZERO_INTEGER });
    }
    
    public static SubLObject f34437(final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        return module0031.f1688(var18, module0559.$g4053$.getDynamicValue(var19));
    }
    
    public static SubLObject f34434(final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        module0031.f1690(var18, module0559.$g4053$.getDynamicValue(var19));
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34429(final SubLObject var120, SubLObject var191) {
        if (var191 == module0559.UNPROVIDED) {
            var191 = module0559.$g4032$.getDynamicValue();
        }
        final SubLThread var192 = SubLProcess.currentSubLThread();
        assert module0559.NIL != Types.stringp(var120) : var120;
        SubLObject var193 = (SubLObject)module0559.NIL;
        if (module0559.NIL != Filesys.probe_file(var120)) {
            SubLObject var194 = (SubLObject)module0559.NIL;
            try {
                final SubLObject var195 = stream_macros.$stream_requires_locking$.currentBinding(var192);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0559.NIL, var192);
                    var194 = compatibility.open_binary(var120, (SubLObject)module0559.$ic94$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var195, var192);
                }
                if (!var194.isStream()) {
                    Errors.error((SubLObject)module0559.$ic58$, var120);
                }
                final SubLObject var123_201 = var194;
                if (module0559.ZERO_INTEGER.numE(streams_high.file_length(var123_201))) {
                    var193 = (SubLObject)module0559.T;
                }
                else {
                    var193 = f34438(var123_201, var191);
                }
            }
            finally {
                final SubLObject var196 = Threads.$is_thread_performing_cleanupP$.currentBinding(var192);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0559.T, var192);
                    if (var194.isStream()) {
                        streams_high.close(var194, (SubLObject)module0559.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var196, var192);
                }
            }
        }
        return var193;
    }
    
    public static SubLObject f34438(final SubLObject var123, SubLObject var191) {
        if (var191 == module0559.UNPROVIDED) {
            var191 = module0559.$g4032$.getDynamicValue();
        }
        final SubLThread var192 = SubLProcess.currentSubLThread();
        SubLObject var193 = (SubLObject)module0559.NIL;
        SubLObject var194 = module0139.f9019((SubLObject)module0559.SIX_INTEGER);
        final SubLObject var195 = module0139.$g1632$.currentBinding(var192);
        final SubLObject var196 = module0139.$g1630$.currentBinding(var192);
        final SubLObject var197 = module0139.$g1631$.currentBinding(var192);
        try {
            module0139.$g1632$.bind(var194, var192);
            module0139.$g1630$.bind((SubLObject)module0559.T, var192);
            module0139.$g1631$.bind(module0139.f9023(module0139.$g1632$.getDynamicValue(var192)), var192);
            final SubLObject var24_203 = module0018.$g574$.currentBinding(var192);
            final SubLObject var25_204 = module0131.$g1531$.currentBinding(var192);
            final SubLObject var63_205 = module0018.$g696$.currentBinding(var192);
            final SubLObject var198 = module0271.$g2562$.currentBinding(var192);
            final SubLObject var199 = module0144.$g1752$.currentBinding(var192);
            final SubLObject var200 = module0271.$g2560$.currentBinding(var192);
            final SubLObject var201 = module0271.$g2561$.currentBinding(var192);
            final SubLObject var202 = module0271.$g2563$.currentBinding(var192);
            final SubLObject var203 = module0146.$g2055$.currentBinding(var192);
            final SubLObject var204 = module0144.$g1771$.currentBinding(var192);
            final SubLObject var205 = module0144.$g1769$.currentBinding(var192);
            final SubLObject var206 = module0152.$g2107$.currentBinding(var192);
            final SubLObject var207 = module0110.$g1374$.currentBinding(var192);
            final SubLObject var208 = module0271.$g2564$.currentBinding(var192);
            final SubLObject var209 = module0206.$g2324$.currentBinding(var192);
            try {
                module0018.$g574$.bind((SubLObject)module0559.T, var192);
                module0131.$g1531$.bind((SubLObject)module0559.NIL, var192);
                module0018.$g696$.bind((SubLObject)module0559.NIL, var192);
                module0271.$g2562$.bind((SubLObject)module0559.NIL, var192);
                module0144.$g1752$.bind((SubLObject)module0559.NIL, var192);
                module0271.$g2560$.bind((SubLObject)module0559.NIL, var192);
                module0271.$g2561$.bind((SubLObject)module0559.NIL, var192);
                module0271.$g2563$.bind((SubLObject)module0559.NIL, var192);
                module0146.$g2055$.bind((SubLObject)module0559.NIL, var192);
                module0144.$g1771$.bind((SubLObject)module0559.NIL, var192);
                module0144.$g1769$.bind((SubLObject)module0559.NIL, var192);
                module0152.$g2107$.bind((SubLObject)module0559.NIL, var192);
                module0110.$g1374$.bind((SubLObject)module0559.T, var192);
                module0271.$g2564$.bind((SubLObject)module0559.NIL, var192);
                module0206.$g2324$.bind((SubLObject)module0559.NIL, var192);
                final SubLObject var210 = f34439(var123);
                final SubLObject var24_204 = module0021.$g777$.currentBinding(var192);
                try {
                    module0021.$g777$.bind((SubLObject)module0559.NIL, var192);
                    module0021.f1149(f34440(var123));
                    final SubLObject var24_205 = module0111.$g1394$.currentBinding(var192);
                    final SubLObject var25_205 = module0111.$g1396$.currentBinding(var192);
                    final SubLObject var63_206 = module0111.$g1398$.currentBinding(var192);
                    final SubLObject var64_213 = module0111.$g1402$.currentBinding(var192);
                    try {
                        module0111.$g1394$.bind((SubLObject)module0559.$ic95$, var192);
                        module0111.$g1396$.bind((SubLObject)module0559.$ic96$, var192);
                        module0111.$g1398$.bind((SubLObject)module0559.$ic97$, var192);
                        module0111.$g1402$.bind((SubLObject)module0559.$ic98$, var192);
                        f34441(var123);
                        f34442(var123);
                        f34443(var123);
                        if (module0559.NIL != f34444((SubLObject)module0559.$ic63$, var210)) {
                            f34445(var123);
                        }
                        f34446(var123);
                        if (module0559.NIL != var191) {
                            f34447();
                        }
                        var193 = (SubLObject)module0559.T;
                    }
                    finally {
                        module0111.$g1402$.rebind(var64_213, var192);
                        module0111.$g1398$.rebind(var63_206, var192);
                        module0111.$g1396$.rebind(var25_205, var192);
                        module0111.$g1394$.rebind(var24_205, var192);
                    }
                }
                finally {
                    module0021.$g777$.rebind(var24_204, var192);
                }
            }
            finally {
                module0206.$g2324$.rebind(var209, var192);
                module0271.$g2564$.rebind(var208, var192);
                module0110.$g1374$.rebind(var207, var192);
                module0152.$g2107$.rebind(var206, var192);
                module0144.$g1769$.rebind(var205, var192);
                module0144.$g1771$.rebind(var204, var192);
                module0146.$g2055$.rebind(var203, var192);
                module0271.$g2563$.rebind(var202, var192);
                module0271.$g2561$.rebind(var201, var192);
                module0271.$g2560$.rebind(var200, var192);
                module0144.$g1752$.rebind(var199, var192);
                module0271.$g2562$.rebind(var198, var192);
                module0018.$g696$.rebind(var63_205, var192);
                module0131.$g1531$.rebind(var25_204, var192);
                module0018.$g574$.rebind(var24_203, var192);
            }
            var194 = module0139.$g1632$.getDynamicValue(var192);
        }
        finally {
            module0139.$g1631$.rebind(var197, var192);
            module0139.$g1630$.rebind(var196, var192);
            module0139.$g1632$.rebind(var195, var192);
        }
        return var193;
    }
    
    public static SubLObject f34439(final SubLObject var123) {
        final SubLThread var124 = SubLProcess.currentSubLThread();
        final SubLObject var125 = module0021.f1060(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        final SubLObject var126 = module0021.f1060(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        final SubLObject var127 = module0021.f1060(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        final SubLObject var128 = module0021.f1060(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        final SubLObject var129 = module0021.f1060(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        assert module0559.NIL != Types.stringp(var125) : var125;
        assert module0559.NIL != Types.atom(var126) : var126;
        assert module0559.NIL != Types.integerp(var127) : var127;
        assert module0559.NIL != Types.integerp(var128) : var128;
        assert module0559.NIL != Types.integerp(var129) : var129;
        if (module0559.NIL == f34444(var126, module0559.$g4048$.getDynamicValue(var124))) {
            Errors.error((SubLObject)module0559.$ic101$, var126, module0559.$g4048$.getDynamicValue(var124));
        }
        return var126;
    }
    
    public static SubLObject f34444(final SubLObject var218, final SubLObject var219) {
        final SubLThread var220 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(var218.equal(var219) || module0559.NIL != conses_high.member((SubLObject)ConsesLow.list(var218, var219), module0559.$g4049$.getDynamicValue(var220), Symbols.symbol_function((SubLObject)module0559.EQUAL), (SubLObject)module0559.UNPROVIDED));
    }
    
    public static SubLObject f34448(final SubLObject var123, SubLObject var220, SubLObject var221) {
        if (var220 == module0559.UNPROVIDED) {
            var220 = (SubLObject)module0559.T;
        }
        if (var221 == module0559.UNPROVIDED) {
            var221 = (SubLObject)module0559.$ic102$;
        }
        final SubLThread var222 = SubLProcess.currentSubLThread();
        final SubLObject var223 = module0021.f1060(var123, var220, var221);
        if (var223.eql(var221)) {
            return var221;
        }
        if (module0559.NIL == Errors.$ignore_mustsP$.getDynamicValue(var222) && !var223.eql(module0559.$g4050$.getDynamicValue(var222))) {
            Errors.error((SubLObject)module0559.$ic103$);
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34440(final SubLObject var123) {
        final SubLThread var124 = SubLProcess.currentSubLThread();
        SubLObject var125 = (SubLObject)module0559.NIL;
        final SubLObject var126 = module0021.$g777$.currentBinding(var124);
        try {
            module0021.$g777$.bind((SubLObject)module0559.NIL, var124);
            module0021.f1149((SubLObject)module0559.NIL);
            var125 = module0021.f1060(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        }
        finally {
            module0021.$g777$.rebind(var126, var124);
        }
        return var125;
    }
    
    public static SubLObject f34447() {
        final SubLObject var224 = f34449();
        final SubLObject var225 = f34450();
        final SubLObject var226 = ConsesLow.nconc(var224, var225);
        module0248.f15954(var226);
        return Sequences.length(var226);
    }
    
    public static SubLObject f34441(final SubLObject var123) {
        final SubLThread var124 = SubLProcess.currentSubLThread();
        f34448(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        final SubLObject var125 = module0021.f1060(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        assert module0559.NIL != Types.integerp(var125) : var125;
        f34451(var125);
        module0012.$g82$.setDynamicValue((SubLObject)module0559.$ic104$, var124);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var124);
        module0012.$g83$.setDynamicValue(var125, var124);
        module0012.$g84$.setDynamicValue((SubLObject)module0559.ZERO_INTEGER, var124);
        final SubLObject var126 = module0012.$g75$.currentBinding(var124);
        final SubLObject var127 = module0012.$g76$.currentBinding(var124);
        final SubLObject var128 = module0012.$g77$.currentBinding(var124);
        final SubLObject var129 = module0012.$g78$.currentBinding(var124);
        try {
            module0012.$g75$.bind((SubLObject)module0559.ZERO_INTEGER, var124);
            module0012.$g76$.bind((SubLObject)module0559.NIL, var124);
            module0012.$g77$.bind((SubLObject)module0559.T, var124);
            module0012.$g78$.bind(Time.get_universal_time(), var124);
            module0012.f478(module0012.$g82$.getDynamicValue(var124));
            SubLObject var130;
            for (var130 = (SubLObject)module0559.NIL, var130 = (SubLObject)module0559.ZERO_INTEGER; var130.numL(module0012.$g83$.getDynamicValue(var124)); var130 = Numbers.add(var130, (SubLObject)module0559.ONE_INTEGER)) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var124), module0012.$g83$.getDynamicValue(var124));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var124), (SubLObject)module0559.ONE_INTEGER), var124);
                f34452(var123);
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var129, var124);
            module0012.$g77$.rebind(var128, var124);
            module0012.$g76$.rebind(var127, var124);
            module0012.$g75$.rebind(var126, var124);
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34452(final SubLObject var123) {
        final SubLObject var124 = module0021.f1060(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        final SubLObject var125 = module0021.f1060(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        final SubLObject var126 = module0021.f1060(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        final SubLObject var127 = module0021.f1060(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        assert module0559.NIL != Types.integerp(var124) : var124;
        assert module0559.NIL != Types.stringp(var125) : var125;
        assert module0559.NIL != Types.atom(var127) : var127;
        assert module0559.NIL != Guids.guid_p(var126) : var126;
        f34453(var124, var125, var126, var127);
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34442(final SubLObject var123) {
        final SubLThread var124 = SubLProcess.currentSubLThread();
        final SubLObject var125 = module0021.f1060(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        assert module0559.NIL != Types.integerp(var125) : var125;
        if (var125.numG(module0559.$g4054$.getDynamicValue(var124))) {
            module0559.$g4054$.setDynamicValue(var125, var124);
        }
        if (module0559.ZERO_INTEGER.numE(var125)) {
            f34454((SubLObject)module0559.$ic12$);
        }
        else {
            SubLObject var126;
            SubLObject var127;
            for (var126 = (SubLObject)module0559.NIL, var126 = (SubLObject)module0559.ZERO_INTEGER; var126.numL(var125); var126 = Numbers.add(var126, (SubLObject)module0559.ONE_INTEGER)) {
                var127 = Numbers.add(var126, (SubLObject)module0559.ONE_INTEGER);
                f34455(var127, var123);
            }
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34455(final SubLObject var81, final SubLObject var123) {
        final SubLThread var124 = SubLProcess.currentSubLThread();
        f34448(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        final SubLObject var125 = module0021.f1060(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        assert module0559.NIL != Types.integerp(var125) : var125;
        if (var81.numE((SubLObject)module0559.ONE_INTEGER)) {
            f34454(var125);
        }
        final SubLObject var126 = Sequences.cconcatenate((SubLObject)module0559.$ic106$, new SubLObject[] { module0006.f205(var81), module0559.$ic107$ });
        module0012.$g82$.setDynamicValue(var126, var124);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var124);
        module0012.$g83$.setDynamicValue(var125, var124);
        module0012.$g84$.setDynamicValue((SubLObject)module0559.ZERO_INTEGER, var124);
        final SubLObject var127 = module0012.$g75$.currentBinding(var124);
        final SubLObject var128 = module0012.$g76$.currentBinding(var124);
        final SubLObject var129 = module0012.$g77$.currentBinding(var124);
        final SubLObject var130 = module0012.$g78$.currentBinding(var124);
        try {
            module0012.$g75$.bind((SubLObject)module0559.ZERO_INTEGER, var124);
            module0012.$g76$.bind((SubLObject)module0559.NIL, var124);
            module0012.$g77$.bind((SubLObject)module0559.T, var124);
            module0012.$g78$.bind(Time.get_universal_time(), var124);
            module0012.f478(module0012.$g82$.getDynamicValue(var124));
            SubLObject var131;
            for (var131 = (SubLObject)module0559.NIL, var131 = (SubLObject)module0559.ZERO_INTEGER; var131.numL(module0012.$g83$.getDynamicValue(var124)); var131 = Numbers.add(var131, (SubLObject)module0559.ONE_INTEGER)) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var124), module0012.$g83$.getDynamicValue(var124));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var124), (SubLObject)module0559.ONE_INTEGER), var124);
                f34456(var123);
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var130, var124);
            module0012.$g77$.rebind(var129, var124);
            module0012.$g76$.rebind(var128, var124);
            module0012.$g75$.rebind(var127, var124);
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34456(final SubLObject var123) {
        final SubLObject var124 = module0021.f1060(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        final SubLObject var125 = module0021.f1060(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        final SubLObject var126 = module0021.f1060(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        assert module0559.NIL != Types.integerp(var124) : var124;
        assert module0559.NIL != module0202.f12659(var125) : var125;
        assert module0559.NIL != Types.atom(var126) : var126;
        f34457(var124, var125, var126);
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34443(final SubLObject var123) {
        final SubLThread var124 = SubLProcess.currentSubLThread();
        final SubLObject var125 = module0021.f1060(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        assert module0559.NIL != Types.integerp(var125) : var125;
        if (var125.numG(module0559.$g4055$.getDynamicValue(var124))) {
            module0559.$g4055$.setDynamicValue(var125, var124);
        }
        SubLObject var126;
        SubLObject var127;
        for (var126 = (SubLObject)module0559.NIL, var126 = (SubLObject)module0559.ZERO_INTEGER; var126.numL(var125); var126 = Numbers.add(var126, (SubLObject)module0559.ONE_INTEGER)) {
            var127 = Numbers.add(var126, (SubLObject)module0559.ONE_INTEGER);
            if (var127.numE((SubLObject)module0559.ONE_INTEGER)) {
                f34458(var127, var123);
            }
            else {
                f34459(var127, var123);
            }
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34458(final SubLObject var83, final SubLObject var123) {
        return f34460(var83, (SubLObject)module0559.$ic109$, var123);
    }
    
    public static SubLObject f34459(final SubLObject var83, final SubLObject var123) {
        final SubLObject var124 = Sequences.cconcatenate((SubLObject)module0559.$ic110$, new SubLObject[] { module0006.f205(var83), module0559.$ic111$ });
        return f34460(var83, var124, var123);
    }
    
    public static SubLObject f34460(final SubLObject var83, final SubLObject var151, final SubLObject var123) {
        final SubLThread var152 = SubLProcess.currentSubLThread();
        f34448(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        final SubLObject var153 = module0021.f1060(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        assert module0559.NIL != Types.integerp(var153) : var153;
        if (var83.numE((SubLObject)module0559.ONE_INTEGER)) {
            f34461(var153);
        }
        module0012.$g82$.setDynamicValue(var151, var152);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var152);
        module0012.$g83$.setDynamicValue(var153, var152);
        module0012.$g84$.setDynamicValue((SubLObject)module0559.ZERO_INTEGER, var152);
        final SubLObject var154 = module0012.$g75$.currentBinding(var152);
        final SubLObject var155 = module0012.$g76$.currentBinding(var152);
        final SubLObject var156 = module0012.$g77$.currentBinding(var152);
        final SubLObject var157 = module0012.$g78$.currentBinding(var152);
        try {
            module0012.$g75$.bind((SubLObject)module0559.ZERO_INTEGER, var152);
            module0012.$g76$.bind((SubLObject)module0559.NIL, var152);
            module0012.$g77$.bind((SubLObject)module0559.T, var152);
            module0012.$g78$.bind(Time.get_universal_time(), var152);
            module0012.f478(module0012.$g82$.getDynamicValue(var152));
            SubLObject var158;
            for (var158 = (SubLObject)module0559.NIL, var158 = (SubLObject)module0559.ZERO_INTEGER; var158.numL(module0012.$g83$.getDynamicValue(var152)); var158 = Numbers.add(var158, (SubLObject)module0559.ONE_INTEGER)) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var152), module0012.$g83$.getDynamicValue(var152));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var152), (SubLObject)module0559.ONE_INTEGER), var152);
                f34462(var123);
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var157, var152);
            module0012.$g77$.rebind(var156, var152);
            module0012.$g76$.rebind(var155, var152);
            module0012.$g75$.rebind(var154, var152);
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34462(final SubLObject var123) {
        final SubLObject var124 = module0021.f1060(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        final SubLObject var125 = module0021.f1060(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        final SubLObject var126 = module0021.f1060(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        final SubLObject var127 = module0021.f1060(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        final SubLObject var128 = module0021.f1060(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        final SubLObject var129 = module0021.f1060(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        assert module0559.NIL != Types.integerp(var124) : var124;
        assert module0559.NIL != module0232.f15320(var126) : var126;
        assert module0559.NIL != module0161.f10480(var127) : var127;
        assert module0559.NIL != module0130.f8503(var128) : var128;
        assert module0559.NIL != Types.listp(var129) : var129;
        f34463(var124, var126, var127, var125, var128, var129);
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34445(final SubLObject var123) {
        final SubLThread var124 = SubLProcess.currentSubLThread();
        final SubLObject var125 = module0021.f1060(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        assert module0559.NIL != Types.integerp(var125) : var125;
        if (var125.numG(module0559.$g4060$.getDynamicValue(var124))) {
            module0559.$g4060$.setDynamicValue(var125, var124);
        }
        if (module0559.ZERO_INTEGER.numE(var125)) {
            f34464((SubLObject)module0559.$ic12$);
        }
        else {
            SubLObject var126;
            SubLObject var127;
            for (var126 = (SubLObject)module0559.NIL, var126 = (SubLObject)module0559.ZERO_INTEGER; var126.numL(var125); var126 = Numbers.add(var126, (SubLObject)module0559.ONE_INTEGER)) {
                var127 = Numbers.add((SubLObject)module0559.ONE_INTEGER, var126);
                f34465(var127, var123);
            }
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34465(final SubLObject var71, final SubLObject var123) {
        final SubLThread var124 = SubLProcess.currentSubLThread();
        f34448(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        final SubLObject var125 = module0021.f1060(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        assert module0559.NIL != Types.integerp(var125) : var125;
        if (var71.numE((SubLObject)module0559.ONE_INTEGER)) {
            f34464(var125);
        }
        final SubLObject var126 = Sequences.cconcatenate((SubLObject)module0559.$ic106$, new SubLObject[] { module0006.f205(var71), module0559.$ic79$ });
        module0012.$g82$.setDynamicValue(var126, var124);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var124);
        module0012.$g83$.setDynamicValue(var125, var124);
        module0012.$g84$.setDynamicValue((SubLObject)module0559.ZERO_INTEGER, var124);
        final SubLObject var127 = module0012.$g75$.currentBinding(var124);
        final SubLObject var128 = module0012.$g76$.currentBinding(var124);
        final SubLObject var129 = module0012.$g77$.currentBinding(var124);
        final SubLObject var130 = module0012.$g78$.currentBinding(var124);
        try {
            module0012.$g75$.bind((SubLObject)module0559.ZERO_INTEGER, var124);
            module0012.$g76$.bind((SubLObject)module0559.NIL, var124);
            module0012.$g77$.bind((SubLObject)module0559.T, var124);
            module0012.$g78$.bind(Time.get_universal_time(), var124);
            module0012.f478(module0012.$g82$.getDynamicValue(var124));
            SubLObject var131;
            for (var131 = (SubLObject)module0559.NIL, var131 = (SubLObject)module0559.ZERO_INTEGER; var131.numL(module0012.$g83$.getDynamicValue(var124)); var131 = Numbers.add(var131, (SubLObject)module0559.ONE_INTEGER)) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var124), module0012.$g83$.getDynamicValue(var124));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var124), (SubLObject)module0559.ONE_INTEGER), var124);
                f34466(var123);
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var130, var124);
            module0012.$g77$.rebind(var129, var124);
            module0012.$g76$.rebind(var128, var124);
            module0012.$g75$.rebind(var127, var124);
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34466(final SubLObject var123) {
        final SubLObject var124 = module0021.f1060(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        final SubLObject var125 = module0021.f1060(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        final SubLObject var126 = module0021.f1060(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        final SubLObject var127 = module0021.f1060(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        assert module0559.NIL != Types.integerp(var124) : var124;
        assert module0559.NIL != module0191.f11952(var126) : var126;
        assert module0559.NIL != module0191.f11993(var127) : var127;
        f34467(var124, var126, var127, var125);
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34446(final SubLObject var123) {
        final SubLThread var124 = SubLProcess.currentSubLThread();
        f34448(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        final SubLObject var125 = module0021.f1060(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        assert module0559.NIL != Types.integerp(var125) : var125;
        module0012.$g82$.setDynamicValue((SubLObject)module0559.$ic118$, var124);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var124);
        module0012.$g83$.setDynamicValue(var125, var124);
        module0012.$g84$.setDynamicValue((SubLObject)module0559.ZERO_INTEGER, var124);
        final SubLObject var126 = module0012.$g75$.currentBinding(var124);
        final SubLObject var127 = module0012.$g76$.currentBinding(var124);
        final SubLObject var128 = module0012.$g77$.currentBinding(var124);
        final SubLObject var129 = module0012.$g78$.currentBinding(var124);
        try {
            module0012.$g75$.bind((SubLObject)module0559.ZERO_INTEGER, var124);
            module0012.$g76$.bind((SubLObject)module0559.NIL, var124);
            module0012.$g77$.bind((SubLObject)module0559.T, var124);
            module0012.$g78$.bind(Time.get_universal_time(), var124);
            module0012.f478(module0012.$g82$.getDynamicValue(var124));
            SubLObject var130;
            for (var130 = (SubLObject)module0559.NIL, var130 = (SubLObject)module0559.ZERO_INTEGER; var130.numL(module0012.$g83$.getDynamicValue(var124)); var130 = Numbers.add(var130, (SubLObject)module0559.ONE_INTEGER)) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var124), module0012.$g83$.getDynamicValue(var124));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var124), (SubLObject)module0559.ONE_INTEGER), var124);
                f34468(var123);
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var129, var124);
            module0012.$g77$.rebind(var128, var124);
            module0012.$g76$.rebind(var127, var124);
            module0012.$g75$.rebind(var126, var124);
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34468(final SubLObject var123) {
        final SubLObject var124 = module0021.f1060(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        if (module0559.NIL == var124) {
            f34469(var123);
        }
        else {
            f34470(var123, var124);
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34469(final SubLObject var123) {
        final SubLThread var124 = SubLProcess.currentSubLThread();
        final SubLObject var125 = module0021.f1060(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        if (module0559.NIL == var125) {
            f34471(var123);
        }
        else {
            final SubLObject var126 = module0021.f1060(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
            assert module0559.NIL != assertion_handles_oc.f11035(var125) : var125;
            assert module0559.NIL != Types.integerp(var126) : var126;
            SubLObject var127;
            SubLObject var128;
            for (var127 = (SubLObject)module0559.NIL, var127 = (SubLObject)module0559.ZERO_INTEGER; var127.numL(var126); var127 = Numbers.add(var127, (SubLObject)module0559.ONE_INTEGER)) {
                var128 = module0021.f1060(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
                assert module0559.NIL != Types.keywordp(var128) : var128;
                if (var128.eql(module0559.$g4051$.getDynamicValue(var124))) {
                    f34472(var125, var123);
                }
            }
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34472(final SubLObject var20, final SubLObject var123) {
        final SubLObject var124 = module0021.f1060(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        final SubLObject var125 = module0021.f1060(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        assert module0559.NIL != module0130.f8520(var124) : var124;
        assert module0559.NIL != Types.listp(var125) : var125;
        return f34473(var20, var124, var125);
    }
    
    public static SubLObject f34470(final SubLObject var123, SubLObject var166) {
        if (var166 == module0559.UNPROVIDED) {
            var166 = (SubLObject)module0559.NIL;
        }
        final SubLThread var167 = SubLProcess.currentSubLThread();
        final SubLObject var168 = module0021.f1060(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        final SubLObject var169 = module0021.f1060(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        SubLObject var170 = module0021.f1060(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        if (module0559.NIL == module0130.f8520(var168)) {
            if (module0559.NIL != module0559.$g4061$.getDynamicValue(var167)) {
                Errors.warn((SubLObject)module0559.$ic120$, new SubLObject[] { var166, var168, var169, var170 });
            }
            return (SubLObject)module0559.NIL;
        }
        if (module0559.NIL == assertion_handles_oc.f11041(var169, (SubLObject)module0559.UNPROVIDED)) {
            if (module0559.NIL != module0559.$g4061$.getDynamicValue(var167)) {
                Errors.warn((SubLObject)module0559.$ic121$, new SubLObject[] { var166, var169, var168, var170 });
            }
            return (SubLObject)module0559.NIL;
        }
        if (!var170.isCons()) {
            if (module0559.NIL != module0559.$g4061$.getDynamicValue(var167)) {
                Errors.warn((SubLObject)module0559.$ic122$, new SubLObject[] { var166, var170, var168, var169 });
            }
            return (SubLObject)module0559.NIL;
        }
        var170 = f34474(var170);
        return f34475(var169, var170, var168);
    }
    
    public static SubLObject f34471(final SubLObject var123) {
        SubLObject var124;
        SubLObject var125;
        for (var124 = module0021.f1060(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED), var125 = (SubLObject)module0559.NIL, var125 = (SubLObject)module0559.ZERO_INTEGER; var125.numL(var124); var125 = Numbers.add(var125, (SubLObject)module0559.ONE_INTEGER)) {
            f34476(var123);
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34476(final SubLObject var123) {
        final SubLObject var124 = module0021.f1060(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        final SubLObject var125 = module0021.f1060(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        final SubLObject var126 = module0021.f1060(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        final SubLObject var127 = module0021.f1060(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        final SubLObject var128 = module0021.f1060(var123, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
        assert module0559.NIL != module0232.f15320(var124) : var124;
        assert module0559.NIL != module0161.f10480(var125) : var125;
        assert module0559.NIL != module0130.f8507(var126) : var126;
        assert module0559.NIL != module0130.f8503(var127) : var127;
        assert module0559.NIL != Types.listp(var128) : var128;
        return f34477(var124, var125, var126, var127, var128);
    }
    
    public static SubLObject f34474(final SubLObject var239) {
        final SubLThread var240 = SubLProcess.currentSubLThread();
        if (module0559.NIL != module0559.$g4062$.getDynamicValue(var240)) {
            SubLObject var241 = var239;
            SubLObject var242 = (SubLObject)module0559.NIL;
            var242 = var241.first();
            while (module0559.NIL != var241) {
                if (module0559.NIL != module0191.f11952(var242)) {
                    final SubLObject var243 = module0191.f11966(var242);
                    final SubLObject var244 = module0035.f2294(module0559.$g4062$.getDynamicValue(var240), var243, Symbols.symbol_function((SubLObject)module0559.EQL), (SubLObject)module0559.UNPROVIDED);
                    if (module0559.NIL != var244) {
                        f34478(var242, var244);
                    }
                }
                var241 = var241.rest();
                var242 = var241.first();
            }
        }
        return var239;
    }
    
    public static SubLObject f34478(final SubLObject var168, final SubLObject var242) {
        assert module0559.NIL != module0191.f11952(var168) : var168;
        ConsesLow.rplaca(var168, var242);
        assert module0559.NIL != module0191.f11952(var168) : var168;
        return var168;
    }
    
    public static SubLObject f34451(final SubLObject var131) {
        final SubLThread var132 = SubLProcess.currentSubLThread();
        if (!module0559.$g4056$.getDynamicValue(var132).isHashtable()) {
            module0559.$g4056$.setDynamicValue(f34479(var131), var132);
        }
        if (module0559.NIL == module0559.$g4063$.getDynamicValue(var132)) {
            Hashtables.clrhash(module0559.$g4056$.getDynamicValue(var132));
        }
        if (!module0559.$g4064$.getDynamicValue(var132).isHashtable()) {
            module0559.$g4064$.setDynamicValue(f34480(var131), var132);
        }
        Hashtables.clrhash(module0559.$g4064$.getDynamicValue(var132));
        if (!module0559.$g4065$.getDynamicValue(var132).isHashtable()) {
            module0559.$g4065$.setDynamicValue(f34481(var131), var132);
        }
        Hashtables.clrhash(module0559.$g4065$.getDynamicValue(var132));
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34479(final SubLObject var131) {
        return Hashtables.make_hash_table(var131, Symbols.symbol_function((SubLObject)module0559.EQL), (SubLObject)module0559.UNPROVIDED);
    }
    
    public static SubLObject f34480(final SubLObject var131) {
        return Hashtables.make_hash_table(Numbers.integerDivide(var131, (SubLObject)module0559.TEN_INTEGER), Symbols.symbol_function((SubLObject)module0559.EQL), (SubLObject)module0559.UNPROVIDED);
    }
    
    public static SubLObject f34481(final SubLObject var131) {
        return Hashtables.make_hash_table(Numbers.integerDivide(var131, (SubLObject)module0559.TEN_INTEGER), (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
    }
    
    public static SubLObject f34449() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0030.f1627(module0559.$g4064$.getDynamicValue(var1));
    }
    
    public static SubLObject f34433() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        if (module0559.$g4064$.getDynamicValue(var1).isHashtable()) {
            return module0030.f1627(module0559.$g4065$.getDynamicValue(var1));
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34482(final SubLObject var166, final SubLObject var19, final SubLObject var167) {
        final SubLThread var168 = SubLProcess.currentSubLThread();
        if (module0559.NIL == module0559.$g4063$.getDynamicValue(var168) || module0559.NIL == Hashtables.gethash_without_values(var166, module0559.$g4056$.getDynamicValue(var168), (SubLObject)module0559.UNPROVIDED)) {
            Hashtables.sethash(var166, module0559.$g4056$.getDynamicValue(var168), var19);
        }
        if (module0559.NIL != var167) {
            Hashtables.sethash(var166, module0559.$g4064$.getDynamicValue(var168), var19);
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34483(final SubLObject var166, final SubLObject var19) {
        final SubLThread var167 = SubLProcess.currentSubLThread();
        Hashtables.sethash(var166, module0559.$g4065$.getDynamicValue(var167), var19);
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34484(final SubLObject var166) {
        final SubLThread var167 = SubLProcess.currentSubLThread();
        SubLObject var168 = Hashtables.gethash_without_values(var166, module0559.$g4056$.getDynamicValue(var167), (SubLObject)module0559.UNPROVIDED);
        if (module0559.NIL == var168) {
            var168 = f34485(var166);
        }
        return var168;
    }
    
    public static SubLObject f34485(final SubLObject var166) {
        final SubLThread var167 = SubLProcess.currentSubLThread();
        if (module0559.NIL != module0559.$g4061$.getDynamicValue(var167)) {
            Errors.warn((SubLObject)module0559.$ic124$, var166);
        }
        final SubLObject var168 = constant_handles_oc.f8482();
        f34482(var166, var168, (SubLObject)module0559.NIL);
        f34483(var166, var168);
        return var168;
    }
    
    public static SubLObject f34453(final SubLObject var166, final SubLObject var228, final SubLObject var244, final SubLObject var167) {
        SubLObject var245 = (SubLObject)module0559.NIL;
        if (module0559.NIL != var167) {
            final SubLObject var246 = constants_high_oc.f10751(var244);
            final SubLObject var247 = constants_high_oc.f10737(var228);
            if (module0559.NIL != constant_handles_oc.f8449(var246)) {
                if (module0559.NIL != constant_handles_oc.f8449(var247)) {
                    if (var246.eql(var247)) {
                        var245 = var246;
                    }
                    else {
                        var245 = f34486(var228, var244);
                    }
                }
                else {
                    var245 = f34487(var228, var244);
                }
            }
            else if (module0559.NIL != constant_handles_oc.f8449(var247)) {
                var245 = f34488(var228, var244);
            }
            else {
                var245 = f34489(var228, var244);
            }
        }
        else {
            final SubLObject var246 = constants_high_oc.f10751(var244);
            final SubLObject var247 = constants_high_oc.f10737(var228);
            if (module0559.NIL != constant_handles_oc.f8449(var246)) {
                if (module0559.NIL != constant_handles_oc.f8449(var247)) {
                    if (var246.eql(var247)) {
                        var245 = var246;
                    }
                    else {
                        var245 = f34490(var228, var244);
                    }
                }
                else {
                    var245 = f34491(var228, var244);
                }
            }
            else if (module0559.NIL != constant_handles_oc.f8449(var247)) {
                var245 = f34492(var228, var244);
                f34483(var166, var245);
            }
            else {
                var245 = f34493(var228, var244);
                f34483(var166, var245);
            }
        }
        assert module0559.NIL != constant_handles_oc.f8449(var245) : var245;
        f34482(var166, var245, var167);
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34489(final SubLObject var228, final SubLObject var244) {
        return constants_high_oc.f10736(var228, var244);
    }
    
    public static SubLObject f34494(final SubLObject var228, final SubLObject var244) {
        return constants_high_oc.f10736(var228, var244);
    }
    
    public static SubLObject f34495(final SubLObject var247, SubLObject var248) {
        if (var248 == module0559.UNPROVIDED) {
            var248 = (SubLObject)module0559.NIL;
        }
        final SubLThread var249 = SubLProcess.currentSubLThread();
        SubLObject var250 = (SubLObject)module0559.NIL;
        SubLObject var251 = (SubLObject)module0559.NIL;
        final Iterator var252 = Hashtables.getEntrySetIterator(var247);
        try {
            while (Hashtables.iteratorHasNext(var252)) {
                final Map.Entry var253 = Hashtables.iteratorNextEntry(var252);
                var250 = Hashtables.getEntryKey(var253);
                var251 = Hashtables.getEntryValue(var253);
                final SubLObject var254 = (SubLObject)(var248.isHashtable() ? Hashtables.gethash_without_values(var250, var248, (SubLObject)module0559.UNPROVIDED) : module0559.NIL);
                final SubLObject var255 = module0559.$g4063$.currentBinding(var249);
                try {
                    module0559.$g4063$.bind((SubLObject)module0559.NIL, var249);
                    f34482(var250, var251, var254);
                }
                finally {
                    module0559.$g4063$.rebind(var255, var249);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var252);
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34496(final SubLObject var250, final SubLObject var251) {
        SubLObject var253;
        final SubLObject var252 = var253 = var250.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var253, var252, (SubLObject)module0559.$ic126$);
        final SubLObject var254 = var253.rest();
        var253 = var253.first();
        SubLObject var255 = (SubLObject)module0559.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var253, var252, (SubLObject)module0559.$ic126$);
        var255 = var253.first();
        var253 = var253.rest();
        SubLObject var256 = (SubLObject)module0559.NIL;
        SubLObject var257 = var253;
        SubLObject var258 = (SubLObject)module0559.NIL;
        SubLObject var258_259 = (SubLObject)module0559.NIL;
        while (module0559.NIL != var257) {
            cdestructuring_bind.destructuring_bind_must_consp(var257, var252, (SubLObject)module0559.$ic126$);
            var258_259 = var257.first();
            var257 = var257.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var257, var252, (SubLObject)module0559.$ic126$);
            if (module0559.NIL == conses_high.member(var258_259, (SubLObject)module0559.$ic127$, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED)) {
                var258 = (SubLObject)module0559.T;
            }
            if (var258_259 == module0559.$ic128$) {
                var256 = var257.first();
            }
            var257 = var257.rest();
        }
        if (module0559.NIL != var258 && module0559.NIL == var256) {
            cdestructuring_bind.cdestructuring_bind_error(var252, (SubLObject)module0559.$ic126$);
        }
        final SubLObject var259 = cdestructuring_bind.property_list_member((SubLObject)module0559.$ic129$, var253);
        final SubLObject var260 = (SubLObject)((module0559.NIL != var259) ? conses_high.cadr(var259) : module0559.$ic12$);
        final SubLObject var261 = cdestructuring_bind.property_list_member((SubLObject)module0559.$ic130$, var253);
        final SubLObject var262 = (SubLObject)((module0559.NIL != var261) ? conses_high.cadr(var261) : module0559.NIL);
        final SubLObject var263;
        var253 = (var263 = var254);
        return (SubLObject)ConsesLow.listS((SubLObject)module0559.$ic131$, (SubLObject)ConsesLow.list((SubLObject)module0559.$ic132$, (SubLObject)ConsesLow.list((SubLObject)module0559.$ic133$, (SubLObject)ConsesLow.list((SubLObject)module0559.$ic134$, var260)), (SubLObject)ConsesLow.list((SubLObject)module0559.$ic135$, (SubLObject)ConsesLow.list((SubLObject)module0559.$ic136$, (SubLObject)ConsesLow.list((SubLObject)module0559.$ic137$, var262), (SubLObject)ConsesLow.list((SubLObject)module0559.$ic138$, var260)))), (SubLObject)ConsesLow.list((SubLObject)module0559.$ic139$, var255, var262), ConsesLow.append(var263, (SubLObject)module0559.NIL));
    }
    
    public static SubLObject f34497(final SubLObject var123, final SubLObject var264, SubLObject var191) {
        if (var191 == module0559.UNPROVIDED) {
            var191 = module0559.$g4032$.getDynamicValue();
        }
        final SubLThread var265 = SubLProcess.currentSubLThread();
        SubLObject var266 = (SubLObject)module0559.NIL;
        final SubLObject var267 = module0559.$g4063$.currentBinding(var265);
        final SubLObject var268 = module0559.$g4056$.currentBinding(var265);
        final SubLObject var269 = module0559.$g4064$.currentBinding(var265);
        try {
            module0559.$g4063$.bind((SubLObject)module0559.T, var265);
            module0559.$g4056$.bind(f34479((SubLObject)module0559.$ic12$), var265);
            module0559.$g4064$.bind((SubLObject)(module0559.NIL.isHashtable() ? f34480((SubLObject)module0559.$ic12$) : module0559.NIL), var265);
            f34495(var264, (SubLObject)module0559.NIL);
            var266 = f34438(var123, var191);
        }
        finally {
            module0559.$g4064$.rebind(var269, var265);
            module0559.$g4056$.rebind(var268, var265);
            module0559.$g4063$.rebind(var267, var265);
        }
        return var266;
    }
    
    public static SubLObject f34486(final SubLObject var228, final SubLObject var244) {
        final SubLThread var245 = SubLProcess.currentSubLThread();
        final SubLObject var246 = constants_high_oc.f10751(var244);
        final SubLObject var247 = constants_high_oc.f10743(var246);
        if (module0559.NIL != module0559.$g4061$.getDynamicValue(var245)) {
            Errors.warn((SubLObject)module0559.$ic140$, var228, var247);
        }
        return var246;
    }
    
    public static SubLObject f34487(final SubLObject var228, final SubLObject var244) {
        final SubLThread var245 = SubLProcess.currentSubLThread();
        final SubLObject var246 = constants_high_oc.f10751(var244);
        final SubLObject var247 = constants_high_oc.f10743(var246);
        if (module0559.NIL != module0559.$g4061$.getDynamicValue(var245)) {
            Errors.warn((SubLObject)module0559.$ic140$, var228, var247);
        }
        return var246;
    }
    
    public static SubLObject f34488(final SubLObject var228, final SubLObject var244) {
        final SubLThread var245 = SubLProcess.currentSubLThread();
        if (module0559.NIL != constants_high_oc.f10755(constants_high_oc.f10737(var228))) {
            if (module0559.NIL != module0559.$g4061$.getDynamicValue(var245)) {
                Errors.warn((SubLObject)module0559.$ic141$, var244, var228);
            }
            return f34494(var228, var244);
        }
        final SubLObject var246 = module0126.f8395(var228, (SubLObject)module0559.UNPROVIDED);
        if (module0559.NIL != module0559.$g4061$.getDynamicValue(var245)) {
            Errors.warn((SubLObject)module0559.$ic142$, var228, var246);
        }
        return f34489(var246, var244);
    }
    
    public static SubLObject f34490(final SubLObject var228, final SubLObject var244) {
        final SubLThread var245 = SubLProcess.currentSubLThread();
        final SubLObject var246 = constants_high_oc.f10751(var244);
        final SubLObject var247 = constants_high_oc.f10743(var246);
        if (module0559.NIL != module0559.$g4061$.getDynamicValue(var245)) {
            Errors.warn((SubLObject)module0559.$ic140$, var228, var247);
        }
        return var246;
    }
    
    public static SubLObject f34491(final SubLObject var228, final SubLObject var244) {
        final SubLThread var245 = SubLProcess.currentSubLThread();
        final SubLObject var246 = constants_high_oc.f10751(var244);
        final SubLObject var247 = constants_high_oc.f10743(var246);
        if (module0559.NIL != module0559.$g4061$.getDynamicValue(var245)) {
            Errors.warn((SubLObject)module0559.$ic140$, var228, var247);
        }
        return var246;
    }
    
    public static SubLObject f34492(final SubLObject var228, final SubLObject var244) {
        final SubLThread var245 = SubLProcess.currentSubLThread();
        if (module0559.NIL != constants_high_oc.f10755(constants_high_oc.f10737(var228))) {
            if (module0559.NIL != module0559.$g4061$.getDynamicValue(var245)) {
                Errors.warn((SubLObject)module0559.$ic141$, var244, var228);
            }
            return f34494(var228, var244);
        }
        final SubLObject var246 = module0126.f8395(var228, (SubLObject)module0559.UNPROVIDED);
        if (module0559.NIL != module0559.$g4061$.getDynamicValue(var245)) {
            Errors.warn((SubLObject)module0559.$ic142$, var228, var246);
        }
        return f34489(var246, var244);
    }
    
    public static SubLObject f34493(final SubLObject var228, final SubLObject var244) {
        final SubLThread var245 = SubLProcess.currentSubLThread();
        if (module0559.NIL != module0559.$g4061$.getDynamicValue(var245)) {
            Errors.warn((SubLObject)module0559.$ic143$, var228, var244);
        }
        return f34489(var228, var244);
    }
    
    public static SubLObject f34454(final SubLObject var131) {
        final SubLThread var132 = SubLProcess.currentSubLThread();
        if (!module0559.$g4057$.getDynamicValue(var132).isHashtable()) {
            module0559.$g4057$.setDynamicValue(Hashtables.make_hash_table(var131, Symbols.symbol_function((SubLObject)module0559.EQL), (SubLObject)module0559.UNPROVIDED), var132);
        }
        Hashtables.clrhash(module0559.$g4057$.getDynamicValue(var132));
        if (!module0559.$g4066$.getDynamicValue(var132).isHashtable()) {
            module0559.$g4066$.setDynamicValue(Hashtables.make_hash_table(Numbers.integerDivide(var131, (SubLObject)module0559.TEN_INTEGER), Symbols.symbol_function((SubLObject)module0559.EQL), (SubLObject)module0559.UNPROVIDED), var132);
        }
        Hashtables.clrhash(module0559.$g4066$.getDynamicValue(var132));
        if (!module0559.$g4067$.getDynamicValue(var132).isHashtable()) {
            module0559.$g4067$.setDynamicValue(Hashtables.make_hash_table(Numbers.integerDivide(var131, (SubLObject)module0559.TEN_INTEGER), (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED), var132);
        }
        Hashtables.clrhash(module0559.$g4067$.getDynamicValue(var132));
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34450() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0030.f1627(module0559.$g4066$.getDynamicValue(var1));
    }
    
    public static SubLObject f34435() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        if (module0559.$g4067$.getDynamicValue(var1).isHashtable()) {
            return module0030.f1627(module0559.$g4067$.getDynamicValue(var1));
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34498(final SubLObject var166, final SubLObject var70, final SubLObject var167) {
        final SubLThread var168 = SubLProcess.currentSubLThread();
        Hashtables.sethash(var166, module0559.$g4057$.getDynamicValue(var168), var70);
        if (module0559.NIL != var167) {
            Hashtables.sethash(var166, module0559.$g4066$.getDynamicValue(var168), var70);
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34499(final SubLObject var166, final SubLObject var70) {
        final SubLThread var167 = SubLProcess.currentSubLThread();
        Hashtables.sethash(var166, module0559.$g4067$.getDynamicValue(var167), var70);
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34500(final SubLObject var166) {
        final SubLThread var167 = SubLProcess.currentSubLThread();
        SubLObject var168 = Hashtables.gethash_without_values(var166, module0559.$g4057$.getDynamicValue(var167), (SubLObject)module0559.UNPROVIDED);
        if (module0559.NIL == var168) {
            var168 = f34501(var166);
        }
        return var168;
    }
    
    public static SubLObject f34457(final SubLObject var166, final SubLObject var267, final SubLObject var167) {
        final SubLThread var268 = SubLProcess.currentSubLThread();
        SubLObject var269 = module0172.f10921(var267);
        if (module0559.NIL == module0167.f10813(var269)) {
            if (module0559.NIL == var167 && module0559.NIL != module0559.$g4061$.getDynamicValue(var268)) {
                Errors.warn((SubLObject)module0559.$ic144$, var267);
            }
            var269 = f34502(var267);
            f34499(var166, var269);
        }
        f34498(var166, var269, var167);
        return var269;
    }
    
    public static SubLObject f34502(final SubLObject var267) {
        return module0168.f10836(var267);
    }
    
    public static SubLObject f34501(final SubLObject var166) {
        final SubLThread var167 = SubLProcess.currentSubLThread();
        if (module0559.NIL != module0559.$g4061$.getDynamicValue(var167)) {
            Errors.warn((SubLObject)module0559.$ic145$, var166);
        }
        final SubLObject var168 = module0167.f10829();
        f34498(var166, var168, (SubLObject)module0559.NIL);
        f34499(var166, var168);
        return var168;
    }
    
    public static SubLObject f34461(final SubLObject var131) {
        final SubLThread var132 = SubLProcess.currentSubLThread();
        if (!module0559.$g4058$.getDynamicValue(var132).isHashtable()) {
            module0559.$g4058$.setDynamicValue(Hashtables.make_hash_table(var131, Symbols.symbol_function((SubLObject)module0559.EQL), (SubLObject)module0559.UNPROVIDED), var132);
        }
        Hashtables.clrhash(module0559.$g4058$.getDynamicValue(var132));
        if (!module0559.$g4068$.getDynamicValue(var132).isHashtable()) {
            module0559.$g4068$.setDynamicValue(Hashtables.make_hash_table(Numbers.integerDivide(var131, (SubLObject)module0559.TEN_INTEGER), (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED), var132);
        }
        Hashtables.clrhash(module0559.$g4068$.getDynamicValue(var132));
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34503() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0030.f1627(module0559.$g4058$.getDynamicValue(var1));
    }
    
    public static SubLObject f34436() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        if (module0559.$g4068$.getDynamicValue(var1).isHashtable()) {
            return module0030.f1627(module0559.$g4068$.getDynamicValue(var1));
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34504(final SubLObject var166, final SubLObject var20, final SubLObject var167) {
        final SubLThread var168 = SubLProcess.currentSubLThread();
        Hashtables.sethash(var166, module0559.$g4058$.getDynamicValue(var168), var20);
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34505(final SubLObject var166, final SubLObject var20) {
        final SubLThread var167 = SubLProcess.currentSubLThread();
        Hashtables.sethash(var166, module0559.$g4068$.getDynamicValue(var167), var20);
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34506(final SubLObject var166) {
        final SubLThread var167 = SubLProcess.currentSubLThread();
        SubLObject var168 = Hashtables.gethash_without_values(var166, module0559.$g4058$.getDynamicValue(var167), (SubLObject)module0559.UNPROVIDED);
        if (module0559.NIL == var168) {
            var168 = f34507(var166);
        }
        return var168;
    }
    
    public static SubLObject f34463(final SubLObject var166, final SubLObject var188, final SubLObject var40, final SubLObject var167, final SubLObject var51, final SubLObject var234) {
        final SubLThread var235 = SubLProcess.currentSubLThread();
        SubLObject var236 = module0217.f14415(var188, var40);
        if (module0559.NIL == var236) {
            if (module0559.NIL == var167 && module0559.NIL != module0559.$g4061$.getDynamicValue(var235)) {
                Errors.warn((SubLObject)module0559.$ic146$, var188, var40);
            }
            var236 = f34508(var188, var40, var234, var51);
            f34505(var166, var236);
        }
        f34504(var166, var236, var167);
        return var236;
    }
    
    public static SubLObject f34508(final SubLObject var188, final SubLObject var40, final SubLObject var234, final SubLObject var51) {
        return module0178.f11364(var188, var40, var234, var51, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED, (SubLObject)module0559.UNPROVIDED);
    }
    
    public static SubLObject f34507(final SubLObject var166) {
        final SubLThread var167 = SubLProcess.currentSubLThread();
        if (module0559.NIL != module0559.$g4061$.getDynamicValue(var167)) {
            Errors.warn((SubLObject)module0559.$ic147$, var166);
        }
        final SubLObject var168 = assertion_handles_oc.f11051();
        f34504(var166, var168, (SubLObject)module0559.NIL);
        f34505(var166, var168);
        return var168;
    }
    
    public static SubLObject f34464(final SubLObject var131) {
        final SubLThread var132 = SubLProcess.currentSubLThread();
        if (!module0559.$g4059$.getDynamicValue(var132).isHashtable()) {
            module0559.$g4059$.setDynamicValue(Hashtables.make_hash_table(var131, Symbols.symbol_function((SubLObject)module0559.EQL), (SubLObject)module0559.UNPROVIDED), var132);
        }
        Hashtables.clrhash(module0559.$g4059$.getDynamicValue(var132));
        if (!module0559.$g4069$.getDynamicValue(var132).isHashtable()) {
            module0559.$g4069$.setDynamicValue(Hashtables.make_hash_table(Numbers.integerDivide(var131, (SubLObject)module0559.TEN_INTEGER), Symbols.symbol_function((SubLObject)module0559.EQL), (SubLObject)module0559.UNPROVIDED), var132);
        }
        if (!module0559.$g4070$.getDynamicValue(var132).isHashtable()) {
            module0559.$g4070$.setDynamicValue(Hashtables.make_hash_table(Numbers.integerDivide(var131, (SubLObject)module0559.TEN_INTEGER), Symbols.symbol_function((SubLObject)module0559.EQL), (SubLObject)module0559.UNPROVIDED), var132);
        }
        Hashtables.clrhash(module0559.$g4070$.getDynamicValue(var132));
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34509() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        if (module0559.$g4059$.getDynamicValue(var1).isHashtable()) {
            return module0030.f1627(module0559.$g4059$.getDynamicValue(var1));
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34510() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        if (module0559.$g4069$.getDynamicValue(var1).isHashtable()) {
            return module0030.f1627(module0559.$g4069$.getDynamicValue(var1));
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34511() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        if (module0559.$g4070$.getDynamicValue(var1).isHashtable()) {
            return module0030.f1627(module0559.$g4070$.getDynamicValue(var1));
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34512(final SubLObject var166, final SubLObject var74, final SubLObject var167) {
        final SubLThread var168 = SubLProcess.currentSubLThread();
        Hashtables.sethash(var166, module0559.$g4059$.getDynamicValue(var168), var74);
        if (module0559.NIL != var167) {
            Hashtables.sethash(var166, module0559.$g4069$.getDynamicValue(var168), var74);
        }
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34513(final SubLObject var166, final SubLObject var74) {
        final SubLThread var167 = SubLProcess.currentSubLThread();
        Hashtables.sethash(var166, module0559.$g4070$.getDynamicValue(var167), var74);
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34514(final SubLObject var166) {
        final SubLThread var167 = SubLProcess.currentSubLThread();
        SubLObject var168 = Hashtables.gethash_without_values(var166, module0559.$g4059$.getDynamicValue(var167), (SubLObject)module0559.UNPROVIDED);
        if (module0559.NIL == var168) {
            var168 = f34515(var166);
        }
        return var168;
    }
    
    public static SubLObject f34467(final SubLObject var166, final SubLObject var168, final SubLObject var76, final SubLObject var167) {
        final SubLThread var169 = SubLProcess.currentSubLThread();
        SubLObject var170 = module0183.f11552(var168);
        if (module0559.NIL == var170) {
            if (module0559.NIL == var167 && module0559.NIL != module0559.$g4061$.getDynamicValue(var169)) {
                Errors.warn((SubLObject)module0559.$ic148$, var168);
            }
            var170 = f34516(var168, var76);
            f34513(var166, var170);
        }
        f34512(var166, var170, var167);
        return var170;
    }
    
    public static SubLObject f34516(final SubLObject var168, final SubLObject var76) {
        return module0183.f11554(var168, var76);
    }
    
    public static SubLObject f34515(final SubLObject var166) {
        final SubLThread var167 = SubLProcess.currentSubLThread();
        if (module0559.NIL != module0559.$g4061$.getDynamicValue(var167)) {
            Errors.warn((SubLObject)module0559.$ic149$, var166);
        }
        final SubLObject var168 = module0179.f11441();
        f34512(var166, var168, (SubLObject)module0559.NIL);
        f34513(var166, var168);
        return var168;
    }
    
    public static SubLObject f34473(final SubLObject var20, final SubLObject var237, final SubLObject var238) {
        final SubLThread var239 = SubLProcess.currentSubLThread();
        SubLObject var240 = (SubLObject)module0559.NIL;
        final SubLObject var241 = module0131.$g1531$.currentBinding(var239);
        try {
            module0131.$g1531$.bind((SubLObject)module0559.NIL, var239);
            var240 = module0342.f23116(var20, var237);
        }
        finally {
            module0131.$g1531$.rebind(var241, var239);
        }
        if (module0559.NIL != var238 && module0559.NIL == oc_assertions_low.f11248(var20)) {
            final SubLObject var242 = (SubLObject)(var238.isCons() ? var238.first() : module0559.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(var238, var238, (SubLObject)module0559.$ic150$);
            SubLObject var243 = var238.rest();
            final SubLObject var244 = (SubLObject)(var243.isCons() ? var243.first() : module0559.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(var243, var238, (SubLObject)module0559.$ic150$);
            var243 = var243.rest();
            final SubLObject var245 = (SubLObject)(var243.isCons() ? var243.first() : module0559.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(var243, var238, (SubLObject)module0559.$ic150$);
            var243 = var243.rest();
            final SubLObject var246 = (SubLObject)(var243.isCons() ? var243.first() : module0559.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(var243, var238, (SubLObject)module0559.$ic150$);
            var243 = var243.rest();
            if (module0559.NIL == var243) {
                module0178.f11354(var20, var242, var244, var245, var246);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var238, (SubLObject)module0559.$ic150$);
            }
        }
        return var240;
    }
    
    public static SubLObject f34475(final SubLObject var20, final SubLObject var239, final SubLObject var237) {
        final SubLThread var240 = SubLProcess.currentSubLThread();
        SubLObject var241 = (SubLObject)module0559.NIL;
        final SubLObject var242 = module0131.$g1531$.currentBinding(var240);
        final SubLObject var243 = module0346.$g2964$.currentBinding(var240);
        try {
            module0131.$g1531$.bind((SubLObject)module0559.NIL, var240);
            module0346.$g2964$.bind((SubLObject)module0559.T, var240);
            var241 = module0342.f23138(var20, var239, module0130.f8524(var237));
        }
        finally {
            module0346.$g2964$.rebind(var243, var240);
            module0131.$g1531$.rebind(var242, var240);
        }
        return var241;
    }
    
    public static SubLObject f34477(final SubLObject var188, final SubLObject var40, final SubLObject var108, final SubLObject var51, final SubLObject var189) {
        final SubLObject var190 = module0195.f12224(var188, var40, var108, var51, var189);
        if (module0559.NIL == var190) {
            Errors.warn((SubLObject)module0559.$ic151$, new SubLObject[] { var188, var40, var108, var51, var189 });
        }
        return var190;
    }
    
    public static SubLObject f34517() {
        module0559.$g4056$.setDynamicValue((SubLObject)module0559.NIL);
        module0559.$g4064$.setDynamicValue((SubLObject)module0559.NIL);
        module0559.$g4065$.setDynamicValue((SubLObject)module0559.NIL);
        module0559.$g4057$.setDynamicValue((SubLObject)module0559.NIL);
        module0559.$g4066$.setDynamicValue((SubLObject)module0559.NIL);
        module0559.$g4067$.setDynamicValue((SubLObject)module0559.NIL);
        module0559.$g4058$.setDynamicValue((SubLObject)module0559.NIL);
        module0559.$g4068$.setDynamicValue((SubLObject)module0559.NIL);
        module0559.$g4059$.setDynamicValue((SubLObject)module0559.NIL);
        module0559.$g4069$.setDynamicValue((SubLObject)module0559.NIL);
        module0559.$g4070$.setDynamicValue((SubLObject)module0559.NIL);
        module0559.$g4054$.setDynamicValue((SubLObject)module0559.ZERO_INTEGER);
        module0559.$g4055$.setDynamicValue((SubLObject)module0559.ZERO_INTEGER);
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34518() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34337", "S#37601", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34338", "S#37602", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34345", "S#37603", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34339", "S#37604", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34341", "S#37605", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34346", "S#37606", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34347", "S#37607", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34348", "S#37608", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34349", "S#37609", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34350", "S#37610", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34351", "S#37611", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34343", "S#37612", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34344", "S#37613", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34353", "S#37614", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34354", "S#37615", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34355", "S#37616", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34356", "S#37617", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34357", "S#37618", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34340", "S#37619", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34342", "S#37620", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34359", "S#37621", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34360", "S#37622", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34361", "S#37623", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34362", "S#37624", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34363", "S#37625", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34364", "S#37626", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34365", "S#37627", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34366", "S#37628", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34352", "S#37629", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34358", "S#37630", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34367", "S#37631", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34368", "S#37632", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34369", "S#37633", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34370", "S#37634", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34372", "S#37635", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34373", "S#37636", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34371", "S#37637", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34374", "S#37638", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34375", "S#37639", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34376", "S#37640", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34377", "S#37641", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34378", "S#37642", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34379", "S#37643", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34382", "S#37644", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34383", "S#37645", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34384", "S#37646", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34385", "S#37647", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34380", "S#37648", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34381", "S#37649", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34386", "S#37650", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34387", "S#37651", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34388", "S#37652", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34389", "S#37653", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34390", "S#37654", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34391", "S#37655", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34392", "S#37656", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34393", "S#37657", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34395", "S#37658", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34396", "S#37659", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34394", "S#37660", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34397", "SAVE-PARTITION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34398", "S#37661", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34400", "S#37662", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34401", "S#37663", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34399", "S#37664", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34408", "S#37665", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34402", "S#37666", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34409", "S#37667", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34403", "S#37668", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34410", "S#37669", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34404", "S#37670", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34411", "S#37671", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34412", "S#37672", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34413", "S#37673", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34405", "S#37674", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34414", "S#37675", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34415", "S#37676", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34417", "S#37677", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34416", "S#37678", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34406", "S#37679", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34418", "S#37680", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34419", "S#37681", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34420", "S#37682", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34407", "S#37683", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34421", "S#37684", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34423", "S#37685", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34422", "S#37686", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34425", "S#37687", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34426", "S#37688", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34424", "S#37689", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34427", "S#37690", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34428", "S#37691", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34431", "S#37692", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34430", "S#37693", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34432", "S#37694", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34437", "S#37695", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34434", "S#37696", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34429", "LOAD-PARTITION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34438", "S#37697", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34439", "S#37698", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34444", "S#37699", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34448", "S#37700", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34440", "S#37701", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34447", "S#37702", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34441", "S#37703", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34452", "S#37704", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34442", "S#37705", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34455", "S#37706", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34456", "S#37707", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34443", "S#37708", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34458", "S#37709", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34459", "S#37710", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34460", "S#37711", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34462", "S#37712", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34445", "S#37713", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34465", "S#37714", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34466", "S#37715", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34446", "S#37716", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34468", "S#37717", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34469", "S#37718", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34472", "S#37719", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34470", "S#37720", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34471", "S#37721", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34476", "S#37722", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34474", "S#37723", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34478", "S#37724", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34451", "S#37725", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34479", "S#37726", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34480", "S#37727", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34481", "S#37728", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34449", "S#37729", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34433", "S#37730", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34482", "S#37731", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34483", "S#37732", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34484", "S#37733", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34485", "S#37734", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34453", "S#37735", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34489", "S#37736", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34494", "S#37737", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34495", "S#37738", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0559", "f34496", "S#37739");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34497", "S#37740", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34486", "S#37741", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34487", "S#37742", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34488", "S#37743", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34490", "S#37744", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34491", "S#37745", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34492", "S#37746", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34493", "S#37747", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34454", "S#37748", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34450", "S#37749", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34435", "S#37750", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34498", "S#37751", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34499", "S#37752", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34500", "S#37753", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34457", "S#37754", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34502", "S#37755", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34501", "S#37756", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34461", "S#37757", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34503", "S#37758", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34436", "S#37759", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34504", "S#37760", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34505", "S#37761", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34506", "S#37762", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34463", "S#37763", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34508", "S#37764", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34507", "S#37765", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34464", "S#37766", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34509", "S#37767", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34510", "S#37768", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34511", "S#37769", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34512", "S#37770", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34513", "S#37771", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34514", "S#37772", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34467", "S#37773", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34516", "S#37774", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34515", "S#37775", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34473", "S#37776", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34475", "S#37777", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34477", "S#37778", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0559", "f34517", "S#37779", 0, 0, false);
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34519() {
        module0559.$g4031$ = SubLFiles.defparameter("S#37780", (SubLObject)module0559.NIL);
        module0559.$g4032$ = SubLFiles.defparameter("S#37781", (SubLObject)module0559.NIL);
        module0559.$g4033$ = SubLFiles.defparameter("S#37782", (SubLObject)module0559.NIL);
        module0559.$g4034$ = SubLFiles.defparameter("S#37783", (SubLObject)module0559.NIL);
        module0559.$g4035$ = SubLFiles.defparameter("S#37784", (SubLObject)module0559.NIL);
        module0559.$g4036$ = SubLFiles.defparameter("S#37785", (SubLObject)module0559.NIL);
        module0559.$g4037$ = SubLFiles.defparameter("S#37786", (SubLObject)module0559.NIL);
        module0559.$g4038$ = SubLFiles.defparameter("S#37787", (SubLObject)module0559.NIL);
        module0559.$g4039$ = SubLFiles.defparameter("S#37788", (SubLObject)module0559.NIL);
        module0559.$g4040$ = SubLFiles.defparameter("S#37789", (SubLObject)module0559.NIL);
        module0559.$g4041$ = SubLFiles.defparameter("S#37790", (SubLObject)module0559.NIL);
        module0559.$g4042$ = SubLFiles.defparameter("S#37791", (SubLObject)module0559.NIL);
        module0559.$g4043$ = SubLFiles.defparameter("S#37792", (SubLObject)module0559.NIL);
        module0559.$g4044$ = SubLFiles.defparameter("S#37793", (SubLObject)module0559.NIL);
        module0559.$g4045$ = SubLFiles.defparameter("S#37794", (SubLObject)module0559.NIL);
        module0559.$g4046$ = SubLFiles.deflexical("S#37795", Vectors.make_vector((SubLObject)module0559.$ic23$, (SubLObject)module0559.NIL));
        module0559.$g4047$ = SubLFiles.defparameter("S#37796", (SubLObject)module0559.T);
        module0559.$g4048$ = SubLFiles.defparameter("S#37797", (SubLObject)module0559.$ic63$);
        module0559.$g4049$ = SubLFiles.defparameter("S#37798", (SubLObject)module0559.$ic64$);
        module0559.$g4050$ = SubLFiles.defparameter("S#37799", (SubLObject)module0559.$ic65$);
        module0559.$g4051$ = SubLFiles.defparameter("S#37800", (SubLObject)module0559.$ic66$);
        module0559.$g4052$ = SubLFiles.defparameter("S#37801", (SubLObject)ConsesLow.list(module0559.$g4050$.getDynamicValue(), module0559.$g4051$.getDynamicValue()));
        module0559.$g4053$ = SubLFiles.defparameter("S#37802", (SubLObject)module0559.NIL);
        module0559.$g4054$ = SubLFiles.defparameter("S#37803", (SubLObject)module0559.ZERO_INTEGER);
        module0559.$g4055$ = SubLFiles.defparameter("S#37804", (SubLObject)module0559.ZERO_INTEGER);
        module0559.$g4060$ = SubLFiles.defparameter("S#37805", (SubLObject)module0559.ZERO_INTEGER);
        module0559.$g4061$ = SubLFiles.defparameter("S#37806", (SubLObject)module0559.T);
        module0559.$g4062$ = SubLFiles.defparameter("S#37807", (SubLObject)module0559.NIL);
        module0559.$g4063$ = SubLFiles.defparameter("S#37808", (SubLObject)module0559.NIL);
        module0559.$g4056$ = SubLFiles.defparameter("S#37809", (SubLObject)module0559.NIL);
        module0559.$g4064$ = SubLFiles.defparameter("S#37810", (SubLObject)module0559.NIL);
        module0559.$g4065$ = SubLFiles.defparameter("S#37811", (SubLObject)module0559.NIL);
        module0559.$g4057$ = SubLFiles.defparameter("S#37812", (SubLObject)module0559.NIL);
        module0559.$g4066$ = SubLFiles.defparameter("S#37813", (SubLObject)module0559.NIL);
        module0559.$g4067$ = SubLFiles.defparameter("S#37814", (SubLObject)module0559.NIL);
        module0559.$g4058$ = SubLFiles.defparameter("S#37815", (SubLObject)module0559.NIL);
        module0559.$g4068$ = SubLFiles.defparameter("S#37816", (SubLObject)module0559.NIL);
        module0559.$g4059$ = SubLFiles.defparameter("S#37817", (SubLObject)module0559.NIL);
        module0559.$g4069$ = SubLFiles.defparameter("S#37818", (SubLObject)module0559.NIL);
        module0559.$g4070$ = SubLFiles.defparameter("S#37819", (SubLObject)module0559.NIL);
        return (SubLObject)module0559.NIL;
    }
    
    public static SubLObject f34520() {
        Structures.register_method(module0559.$g4046$.getGlobalValue(), Types.$dtp_cons$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0559.$ic24$));
        Structures.register_method(module0559.$g4046$.getGlobalValue(), constant_handles_oc.$g1501$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0559.$ic25$));
        Structures.register_method(module0559.$g4046$.getGlobalValue(), module0167.$g2182$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0559.$ic26$));
        Structures.register_method(module0559.$g4046$.getGlobalValue(), assertion_handles_oc.$g2194$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0559.$ic27$));
        Structures.register_method(module0559.$g4046$.getGlobalValue(), oc_deduction_handles.$g2229$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0559.$ic28$));
        Structures.register_method(module0559.$g4046$.getGlobalValue(), module0179.$g2214$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0559.$ic29$));
        return (SubLObject)module0559.NIL;
    }
    
    public void declareFunctions() {
        f34518();
    }
    
    public void initializeVariables() {
        f34519();
    }
    
    public void runTopLevelForms() {
        f34520();
    }
    
    static {
        me = (SubLFile)new module0559();
        module0559.$g4031$ = null;
        module0559.$g4032$ = null;
        module0559.$g4033$ = null;
        module0559.$g4034$ = null;
        module0559.$g4035$ = null;
        module0559.$g4036$ = null;
        module0559.$g4037$ = null;
        module0559.$g4038$ = null;
        module0559.$g4039$ = null;
        module0559.$g4040$ = null;
        module0559.$g4041$ = null;
        module0559.$g4042$ = null;
        module0559.$g4043$ = null;
        module0559.$g4044$ = null;
        module0559.$g4045$ = null;
        module0559.$g4046$ = null;
        module0559.$g4047$ = null;
        module0559.$g4048$ = null;
        module0559.$g4049$ = null;
        module0559.$g4050$ = null;
        module0559.$g4051$ = null;
        module0559.$g4052$ = null;
        module0559.$g4053$ = null;
        module0559.$g4054$ = null;
        module0559.$g4055$ = null;
        module0559.$g4060$ = null;
        module0559.$g4061$ = null;
        module0559.$g4062$ = null;
        module0559.$g4063$ = null;
        module0559.$g4056$ = null;
        module0559.$g4064$ = null;
        module0559.$g4065$ = null;
        module0559.$g4057$ = null;
        module0559.$g4066$ = null;
        module0559.$g4067$ = null;
        module0559.$g4058$ = null;
        module0559.$g4068$ = null;
        module0559.$g4059$ = null;
        module0559.$g4069$ = null;
        module0559.$g4070$ = null;
        $ic0$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("S#37820", "CYC"));
        $ic1$ = SubLObjectFactory.makeSymbol("KEYWORDP");
        $ic2$ = SubLObjectFactory.makeKeyword("ONTOLOGY");
        $ic3$ = SubLObjectFactory.makeKeyword("QUOTED-ONTOLOGY");
        $ic4$ = SubLObjectFactory.makeKeyword("TERM");
        $ic5$ = SubLObjectFactory.makeKeyword("DEFINITION");
        $ic6$ = SubLObjectFactory.makeKeyword("FUNCTION");
        $ic7$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("S#105", "CYC"));
        $ic8$ = SubLObjectFactory.makeString("Unknown scope partition function ~S");
        $ic9$ = SubLObjectFactory.makeKeyword("ESTIMATED-ASSERTION-COUNT");
        $ic10$ = SubLObjectFactory.makeKeyword("SCOPE-COMPLETELY-SPECIFIED?");
        $ic11$ = SubLObjectFactory.makeString("Unable to scope partition via ~S partition spec");
        $ic12$ = SubLObjectFactory.makeInteger(100);
        $ic13$ = SubLObjectFactory.makeString("Non-scope object ~A not allowed.");
        $ic14$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic15$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic16$ = SubLObjectFactory.makeKeyword("GAF");
        $ic17$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ResearchCycDefinitionalPredicate"));
        $ic18$ = SubLObjectFactory.makeSymbol("S#12276", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#37608", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#37612", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic22$ = SubLObjectFactory.makeString("marking partition content");
        $ic23$ = SubLObjectFactory.makeInteger(256);
        $ic24$ = SubLObjectFactory.makeSymbol("S#37638", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#37639", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#37641", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("S#37643", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#37644", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("S#37646", "CYC");
        $ic30$ = SubLObjectFactory.makeSymbol("BELIEF-P");
        $ic31$ = SubLObjectFactory.makeString("~%;;; ~S constants");
        $ic32$ = SubLObjectFactory.makeString("~%~A~S");
        $ic33$ = SubLObjectFactory.makeString("(*)");
        $ic34$ = SubLObjectFactory.makeString("   ");
        $ic35$ = SubLObjectFactory.makeString("~%;;; Max NART level : ~S");
        $ic36$ = SubLObjectFactory.makeString("~%;;; level ~S NARTs");
        $ic37$ = SubLObjectFactory.makeString("~%;;; Max term order: ~S");
        $ic38$ = SubLObjectFactory.makeString("~%;;; ~S assertions");
        $ic39$ = SubLObjectFactory.makeString("~%;;; ~S meta-assertions");
        $ic40$ = SubLObjectFactory.makeString("~%;;; order ~S meta-assertions");
        $ic41$ = SubLObjectFactory.makeString("~%;;; ~S arguments");
        $ic42$ = SubLObjectFactory.makeString("Deduction   : ~S");
        $ic43$ = SubLObjectFactory.makeString("Beliefs for : ~S");
        $ic44$ = SubLObjectFactory.makeString("Unknown (?) : ~S");
        $ic45$ = SubLObjectFactory.makeString("~%;;; Max KB HL support level : ~S");
        $ic46$ = SubLObjectFactory.makeString("~%;;; ~S KB HL supports");
        $ic47$ = SubLObjectFactory.makeString("~%;;; level ~S KB HL supports");
        $ic48$ = SubLObjectFactory.makeString("removing partition assertions");
        $ic49$ = SubLObjectFactory.makeString("removing partition NARTs");
        $ic50$ = SubLObjectFactory.makeString("removing partition constants");
        $ic51$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("units"), (SubLObject)SubLObjectFactory.makeString("archive"));
        $ic52$ = SubLObjectFactory.makeString("lisp");
        $ic53$ = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $ic54$ = SubLObjectFactory.makeString("~%~%(FI-ASSERT '~S ~S ~S ~S)");
        $ic55$ = SubLObjectFactory.makeString("~%~%(FI-CREATE ~a)");
        $ic56$ = SubLObjectFactory.makeSymbol("S#37656", "CYC");
        $ic57$ = SubLObjectFactory.makeKeyword("APPEND");
        $ic58$ = SubLObjectFactory.makeString("Unable to open ~S");
        $ic59$ = SubLObjectFactory.makeString("~%;;; Archive saved at ~s~%~%");
        $ic60$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic61$ = SubLObjectFactory.makeKeyword("OUTPUT");
        $ic62$ = SubLObjectFactory.makeSymbol("S#2039", "CYC");
        $ic63$ = SubLObjectFactory.makeString("2.2");
        $ic64$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("2.1"), (SubLObject)SubLObjectFactory.makeString("2.1.2")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("2.1"), (SubLObject)SubLObjectFactory.makeString("2.2")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("2.1.2"), (SubLObject)SubLObjectFactory.makeString("2.2")));
        $ic65$ = SubLObjectFactory.makeKeyword("SECTION");
        $ic66$ = SubLObjectFactory.makeKeyword("ASSERTED");
        $ic67$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#37821", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#37822", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#37823", "CYC"));
        $ic68$ = (SubLFloat)SubLObjectFactory.makeDouble(0.1);
        $ic69$ = SubLObjectFactory.makeString("(large) partition constant shells");
        $ic70$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic71$ = SubLObjectFactory.makeString("partition constant shells");
        $ic72$ = SubLObjectFactory.makeString("partition level ");
        $ic73$ = SubLObjectFactory.makeString(" NART shells");
        $ic74$ = SubLObjectFactory.makeString("(large) ");
        $ic75$ = SubLObjectFactory.makeString("(large) partition assertions");
        $ic76$ = SubLObjectFactory.makeString("partition assertions");
        $ic77$ = SubLObjectFactory.makeString("partition order ");
        $ic78$ = SubLObjectFactory.makeString(" meta assertions");
        $ic79$ = SubLObjectFactory.makeString(" KB HL supports");
        $ic80$ = SubLObjectFactory.makeString("(large) partition beliefs");
        $ic81$ = SubLObjectFactory.makeString("(large) partition deductions");
        $ic82$ = SubLObjectFactory.makeString("(large) partition bookkeeping info");
        $ic83$ = SubLObjectFactory.makeString("partition arguments");
        $ic84$ = SubLObjectFactory.makeString("Unknown argument object ~S");
        $ic85$ = SubLObjectFactory.makeString("Unable to dump belief ~S");
        $ic86$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13916", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13918", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5432", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#15041", "CYC"));
        $ic87$ = SubLObjectFactory.makeString("cleaning up after partition load...~%");
        $ic88$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic89$ = SubLObjectFactory.makeSymbol("S#37695", "CYC");
        $ic90$ = SubLObjectFactory.makeString("partition load KB cleanup removed:~%");
        $ic91$ = SubLObjectFactory.makeString(" ~A constants~%");
        $ic92$ = SubLObjectFactory.makeString(" ~A NARTs~%");
        $ic93$ = SubLObjectFactory.makeString(" ~A assertions~%");
        $ic94$ = SubLObjectFactory.makeKeyword("INPUT");
        $ic95$ = SubLObjectFactory.makeSymbol("S#37733", "CYC");
        $ic96$ = SubLObjectFactory.makeSymbol("S#37753", "CYC");
        $ic97$ = SubLObjectFactory.makeSymbol("S#37762", "CYC");
        $ic98$ = SubLObjectFactory.makeSymbol("S#37772", "CYC");
        $ic99$ = SubLObjectFactory.makeSymbol("ATOM");
        $ic100$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic101$ = SubLObjectFactory.makeString("partition format is ~A, not ~A, and these versions are incompatible");
        $ic102$ = SubLObjectFactory.makeKeyword("EOF");
        $ic103$ = SubLObjectFactory.makeString("malformed partition file");
        $ic104$ = SubLObjectFactory.makeString("loading partition constant shells");
        $ic105$ = SubLObjectFactory.makeSymbol("GUID-P");
        $ic106$ = SubLObjectFactory.makeString("loading partition level ");
        $ic107$ = SubLObjectFactory.makeString(" narts");
        $ic108$ = SubLObjectFactory.makeSymbol("S#12761", "CYC");
        $ic109$ = SubLObjectFactory.makeString("loading partition assertions");
        $ic110$ = SubLObjectFactory.makeString("loading partition order ");
        $ic111$ = SubLObjectFactory.makeString(" meta-assertions");
        $ic112$ = SubLObjectFactory.makeSymbol("CNF-P");
        $ic113$ = SubLObjectFactory.makeSymbol("S#12265", "CYC");
        $ic114$ = SubLObjectFactory.makeSymbol("DIRECTION-P");
        $ic115$ = SubLObjectFactory.makeSymbol("LISTP");
        $ic116$ = SubLObjectFactory.makeSymbol("HL-SUPPORT-P");
        $ic117$ = SubLObjectFactory.makeSymbol("S#14254", "CYC");
        $ic118$ = SubLObjectFactory.makeString("loading partition arguments");
        $ic119$ = SubLObjectFactory.makeSymbol("S#10615", "CYC");
        $ic120$ = SubLObjectFactory.makeString("Skipping deduction (id=~A) with bad tv=~A (assertion=~S supports=~S).");
        $ic121$ = SubLObjectFactory.makeString("Skipping deduction (id=~A) with bad assertion=~S (tv=~A supports=~S).");
        $ic122$ = SubLObjectFactory.makeString("Skipping deduction (id=~A) with bad supports=~S (tv=~A assertion=~S).");
        $ic123$ = SubLObjectFactory.makeSymbol("EL-STRENGTH-P");
        $ic124$ = SubLObjectFactory.makeString("Did not find constant ~D.");
        $ic125$ = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $ic126$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#37824", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#37825", "CYC"), (SubLObject)SubLObjectFactory.makeInteger(100)), (SubLObject)SubLObjectFactory.makeSymbol("S#37826", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic127$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPECTED-TOTAL"), (SubLObject)SubLObjectFactory.makeKeyword("SCOPED-MAP"));
        $ic128$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic129$ = SubLObjectFactory.makeKeyword("EXPECTED-TOTAL");
        $ic130$ = SubLObjectFactory.makeKeyword("SCOPED-MAP");
        $ic131$ = SubLObjectFactory.makeSymbol("CLET");
        $ic132$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#37808", "CYC"), (SubLObject)module0559.T);
        $ic133$ = SubLObjectFactory.makeSymbol("S#37809", "CYC");
        $ic134$ = SubLObjectFactory.makeSymbol("S#37726", "CYC");
        $ic135$ = SubLObjectFactory.makeSymbol("S#37810", "CYC");
        $ic136$ = SubLObjectFactory.makeSymbol("FWHEN");
        $ic137$ = SubLObjectFactory.makeSymbol("HASH-TABLE-P");
        $ic138$ = SubLObjectFactory.makeSymbol("S#37727", "CYC");
        $ic139$ = SubLObjectFactory.makeSymbol("S#37738", "CYC");
        $ic140$ = SubLObjectFactory.makeString("NAME change for ~S ; new name is ~S");
        $ic141$ = SubLObjectFactory.makeString("installing ID ~S for ~S");
        $ic142$ = SubLObjectFactory.makeString("NAME clash for ~S ; renaming to ~S");
        $ic143$ = SubLObjectFactory.makeString("Constant with NAME ~S and ID ~S missing");
        $ic144$ = SubLObjectFactory.makeString("Non-scope NART ~S not found.");
        $ic145$ = SubLObjectFactory.makeString("Did not find NART ~D.");
        $ic146$ = SubLObjectFactory.makeString("Non-scope assertion ~S (~S) not found.");
        $ic147$ = SubLObjectFactory.makeString("Did not find assertion ~D.");
        $ic148$ = SubLObjectFactory.makeString("Non-scope KB HL support ~S not found.");
        $ic149$ = SubLObjectFactory.makeString("Did not find KB HL support ~D");
        $ic150$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#13925", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("WHEN"), (SubLObject)SubLObjectFactory.makeSymbol("S#13926", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("SECOND"));
        $ic151$ = SubLObjectFactory.makeString("Could not assert ~a in ~a with strength ~s and direction ~s and variable-map ~s");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0559.class
	Total time: 1452 ms
	
	Decompiled with Procyon 0.5.32.
*/