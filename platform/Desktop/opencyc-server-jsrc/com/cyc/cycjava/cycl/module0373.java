package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0373 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0373";
    public static final String myFingerPrint = "de6b8be71844f59bb2c352899de10aaa92ad6eb97370fd145342147fbfc4897b";
    public static SubLSymbol $g3168$;
    public static SubLSymbol $g3169$;
    public static SubLSymbol $g3170$;
    public static SubLSymbol $g3171$;
    public static SubLSymbol $g3172$;
    private static SubLSymbol $g3173$;
    private static SubLSymbol $g3174$;
    private static SubLSymbol $g3175$;
    public static SubLSymbol $g3176$;
    public static SubLSymbol $g3177$;
    private static SubLSymbol $g3178$;
    public static SubLSymbol $g3179$;
    private static SubLSymbol $g3180$;
    public static SubLSymbol $g3181$;
    private static SubLSymbol $g3182$;
    public static SubLSymbol $g3183$;
    private static SubLSymbol $g3184$;
    private static SubLSymbol $g3185$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLList $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLList $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLString $ic23$;
    private static final SubLString $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLList $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLList $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLString $ic41$;
    private static final SubLString $ic42$;
    private static final SubLString $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLString $ic46$;
    private static final SubLString $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLString $ic54$;
    private static final SubLString $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLString $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
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
    private static final SubLString $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLString $ic89$;
    private static final SubLList $ic90$;
    private static final SubLString $ic91$;
    private static final SubLString $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLInteger $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLList $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLString $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLList $ic106$;
    private static final SubLString $ic107$;
    private static final SubLString $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLInteger $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLString $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLString $ic121$;
    private static final SubLString $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLString $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLString $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLString $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLString $ic143$;
    private static final SubLString $ic144$;
    private static final SubLString $ic145$;
    private static final SubLString $ic146$;
    private static final SubLString $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLString $ic149$;
    private static final SubLString $ic150$;
    private static final SubLString $ic151$;
    private static final SubLString $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLString $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLList $ic165$;
    private static final SubLSymbol $ic166$;
    private static final SubLList $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLSymbol $ic170$;
    private static final SubLSymbol $ic171$;
    private static final SubLSymbol $ic172$;
    private static final SubLSymbol $ic173$;
    private static final SubLSymbol $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLSymbol $ic176$;
    private static final SubLSymbol $ic177$;
    private static final SubLSymbol $ic178$;
    private static final SubLString $ic179$;
    private static final SubLList $ic180$;
    private static final SubLString $ic181$;
    private static final SubLSymbol $ic182$;
    private static final SubLSymbol $ic183$;
    private static final SubLSymbol $ic184$;
    private static final SubLString $ic185$;
    private static final SubLSymbol $ic186$;
    private static final SubLSymbol $ic187$;
    private static final SubLSymbol $ic188$;
    private static final SubLString $ic189$;
    private static final SubLString $ic190$;
    private static final SubLList $ic191$;
    private static final SubLList $ic192$;
    private static final SubLSymbol $ic193$;
    private static final SubLSymbol $ic194$;
    private static final SubLSymbol $ic195$;
    private static final SubLSymbol $ic196$;
    private static final SubLSymbol $ic197$;
    private static final SubLSymbol $ic198$;
    private static final SubLSymbol $ic199$;
    private static final SubLList $ic200$;
    private static final SubLSymbol $ic201$;
    private static final SubLSymbol $ic202$;
    private static final SubLSymbol $ic203$;
    private static final SubLSymbol $ic204$;
    private static final SubLString $ic205$;
    private static final SubLString $ic206$;
    private static final SubLString $ic207$;
    private static final SubLList $ic208$;
    private static final SubLSymbol $ic209$;
    
    public static SubLObject f26105() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g3168$.getDynamicValue(var1).first();
    }
    
    public static SubLObject f26106() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0035.f2110((SubLObject)$ic0$, $g3168$.getDynamicValue(var1), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f26107(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic1$);
        var6 = var5.first();
        final SubLObject var7;
        var5 = (var7 = var5.rest());
        final SubLObject var8 = (SubLObject)$ic2$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.listS((SubLObject)$ic5$, var6, (SubLObject)$ic6$)), var8), (SubLObject)ConsesLow.list((SubLObject)$ic7$, (SubLObject)ConsesLow.listS((SubLObject)$ic8$, (SubLObject)ConsesLow.list((SubLObject)$ic9$, (SubLObject)$ic10$, (SubLObject)ConsesLow.listS((SubLObject)$ic11$, var8, (SubLObject)$ic12$)), ConsesLow.append(var7, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic9$, (SubLObject)$ic10$, (SubLObject)ConsesLow.list((SubLObject)$ic13$, (SubLObject)ConsesLow.list((SubLObject)$ic14$, (SubLObject)$ic15$, var8)))));
    }
    
    public static SubLObject f26108() {
        final SubLObject var6 = f26105();
        if (NIL != var6) {
            return module0365.f24865(var6);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26109() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = f26105();
        if (NIL != var2) {
            return module0365.f24850(var2);
        }
        return $g3169$.getDynamicValue(var1);
    }
    
    public static SubLObject f26110(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic16$);
        var6 = var5.first();
        final SubLObject var7;
        var5 = (var7 = var5.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic3$, reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)$ic17$, var6), (SubLObject)$ic18$), ConsesLow.append(var7, (SubLObject)NIL));
    }
    
    public static SubLObject f26111() {
        final SubLObject var12 = f26109();
        if (NIL != module0363.f24478(var12)) {
            return module0363.f24509(var12);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26112(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic19$);
        var6 = var5.first();
        final SubLObject var7;
        var5 = (var7 = var5.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic20$, (SubLObject)ConsesLow.list((SubLObject)$ic21$, var6))), ConsesLow.append(var7, (SubLObject)NIL));
    }
    
    public static SubLObject f26113() {
        final SubLObject var11 = f26109();
        if (NIL != var11) {
            return module0363.f24507(var11);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26114() {
        final SubLObject var16 = f26113();
        return (SubLObject)((NIL != var16) ? module0361.f24147(var16) : NIL);
    }
    
    public static SubLObject f26115(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        assert NIL != module0363.f24478(var11) : var11;
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var12) && NIL == module0363.f24685(var11)) {
            Errors.error((SubLObject)$ic23$, var11);
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var12) && NIL != module0363.f24517(var11)) {
            Errors.error((SubLObject)$ic24$, var11);
        }
        final SubLObject var13 = $g3169$.currentBinding(var12);
        final SubLObject var14 = $g3168$.currentBinding(var12);
        try {
            $g3169$.bind(var11, var12);
            $g3168$.bind((SubLObject)NIL, var12);
            if (NIL != module0363.f24571(var11)) {
                final SubLObject var15 = module0363.f24580(var11);
                f26116(var11, var15);
            }
            else {
                final SubLObject var16 = module0363.f24509(var11);
                f26117(var11, var16);
            }
            f26118(var11);
            f26119(var11);
            f26120(var11, (SubLObject)NIL, (SubLObject)$ic25$, (SubLObject)T);
            final SubLObject var17 = module0363.f24507(var11);
            final SubLObject var18 = module0361.f24123(var17);
            if (NIL == module0065.f4772(var18, (SubLObject)$ic26$)) {
                final SubLObject var24_25 = var18;
                if (NIL == module0065.f4775(var24_25, (SubLObject)$ic26$)) {
                    final SubLObject var19 = module0065.f4740(var24_25);
                    final SubLObject var20 = (SubLObject)NIL;
                    SubLObject var21;
                    SubLObject var22;
                    SubLObject var23;
                    SubLObject var24;
                    SubLObject var25;
                    SubLObject var26;
                    SubLObject var27;
                    SubLObject var28;
                    SubLObject var29;
                    for (var21 = Sequences.length(var19), var22 = (SubLObject)NIL, var22 = (SubLObject)ZERO_INTEGER; var22.numL(var21); var22 = Numbers.add(var22, (SubLObject)ONE_INTEGER)) {
                        var23 = ((NIL != var20) ? Numbers.subtract(var21, var22, (SubLObject)ONE_INTEGER) : var22);
                        var24 = Vectors.aref(var19, var23);
                        if (NIL == module0065.f4749(var24) || NIL == module0065.f4773((SubLObject)$ic26$)) {
                            if (NIL != module0065.f4749(var24)) {
                                var24 = (SubLObject)$ic26$;
                            }
                            if (NIL != module0363.f24547(var11, var24)) {
                                var25 = var24;
                                var26 = module0077.f5333(inference_datastructures_inference_oc.f25473(var25));
                                for (var27 = module0032.f1741(var26), var28 = (SubLObject)NIL, var28 = module0032.f1742(var27, var26); NIL == module0032.f1744(var27, var28); var28 = module0032.f1743(var28)) {
                                    var29 = module0032.f1745(var27, var28);
                                    if (NIL != module0032.f1746(var28, var29)) {
                                        f26120(var11, (SubLObject)NIL, var29, (SubLObject)T);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject var37_38 = var18;
                if (NIL == module0065.f4777(var37_38)) {
                    final SubLObject var30 = module0065.f4738(var37_38);
                    SubLObject var31 = (SubLObject)NIL;
                    SubLObject var32 = (SubLObject)NIL;
                    final Iterator var33 = Hashtables.getEntrySetIterator(var30);
                    try {
                        while (Hashtables.iteratorHasNext(var33)) {
                            final Map.Entry var34 = Hashtables.iteratorNextEntry(var33);
                            var31 = Hashtables.getEntryKey(var34);
                            var32 = Hashtables.getEntryValue(var34);
                            if (NIL != module0363.f24547(var11, var32)) {
                                final SubLObject var35 = var32;
                                final SubLObject var36 = module0077.f5333(inference_datastructures_inference_oc.f25473(var35));
                                SubLObject var37;
                                SubLObject var38;
                                SubLObject var39;
                                for (var37 = module0032.f1741(var36), var38 = (SubLObject)NIL, var38 = module0032.f1742(var37, var36); NIL == module0032.f1744(var37, var38); var38 = module0032.f1743(var38)) {
                                    var39 = module0032.f1745(var37, var38);
                                    if (NIL != module0032.f1746(var38, var39)) {
                                        f26120(var11, (SubLObject)NIL, var39, (SubLObject)T);
                                    }
                                }
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(var33);
                    }
                }
            }
        }
        finally {
            $g3168$.rebind(var14, var12);
            $g3169$.rebind(var13, var12);
        }
        return var11;
    }
    
    public static SubLObject f26116(final SubLObject var11, final SubLObject var42) {
        if (NIL != module0204.f13045(var42)) {
            return f26121(var11, module0204.f13052(var42), (SubLObject)$ic27$);
        }
        if (NIL != module0204.f13049(var42)) {
            return f26121(var11, module0204.f13052(var42), (SubLObject)$ic28$);
        }
        return f26122(var11, var42);
    }
    
    public static SubLObject f26117(final SubLObject var11, final SubLObject var20) {
        return module0383.f27244(var11, var20);
    }
    
    public static SubLObject f26122(final SubLObject var11, final SubLObject var42) {
        module0376.f26624(var11, var42);
        if (NIL != module0380.f26987(var42)) {
            return f26123(var11, var42);
        }
        if (NIL != module0380.f26994()) {
            return module0380.f27000(var11, var42);
        }
        return module0380.f26976(var11, var42);
    }
    
    public static SubLObject f26123(final SubLObject var11, final SubLObject var42) {
        if (NIL == f26124(var11)) {
            module0381.f27074(var11, var42);
            module0382.f27213(var11, var42);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26124(final SubLObject var11) {
        SubLObject var12 = module0363.f24517(var11);
        SubLObject var13 = (SubLObject)NIL;
        var13 = var12.first();
        while (NIL != var12) {
            if (NIL != module0363.f24524(var13, (SubLObject)$ic29$) && NIL != module0363.f24519(var13, (SubLObject)$ic30$)) {
                return (SubLObject)T;
            }
            var12 = var12.rest();
            var13 = var12.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26121(final SubLObject var11, final SubLObject var44, final SubLObject var45) {
        final SubLThread var46 = SubLProcess.currentSubLThread();
        SubLObject var47 = (SubLObject)NIL;
        SubLObject var48 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var44, var44, (SubLObject)$ic31$);
        var47 = var44.first();
        SubLObject var49 = var44.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var49, var44, (SubLObject)$ic31$);
        var48 = var49.first();
        var49 = var49.rest();
        if (NIL == var49) {
            if (NIL != module0161.f10481(var47)) {
                final SubLObject var50 = module0147.f9540(var47);
                final SubLObject var51 = module0147.$g2095$.currentBinding(var46);
                final SubLObject var52 = module0147.$g2094$.currentBinding(var46);
                final SubLObject var53 = module0147.$g2096$.currentBinding(var46);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var50), var46);
                    module0147.$g2094$.bind(module0147.f9546(var50), var46);
                    module0147.$g2096$.bind(module0147.f9549(var50), var46);
                    module0376.f26660(var11, var48, var45);
                    if (NIL != module0361.f24170(module0363.f24507(var11))) {
                        module0379.f26937(var11, var48, var45, (SubLObject)UNPROVIDED);
                    }
                    if (NIL != module0361.f24164(module0363.f24507(var11))) {
                        module0377.f26767(var11, var48, var45, var47);
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var53, var46);
                    module0147.$g2094$.rebind(var52, var46);
                    module0147.$g2095$.rebind(var51, var46);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var44, (SubLObject)$ic31$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26125(final SubLObject var11, final SubLObject var36) {
        assert NIL != module0367.f24997(var36) : var36;
        if (NIL != module0367.f25149(var11, var36)) {
            f26126(var36, var11);
        }
        return var11;
    }
    
    public static SubLObject f26126(final SubLObject var36, final SubLObject var11) {
        return f26127(var11, var36, (SubLObject)$ic33$);
    }
    
    public static SubLObject f26127(final SubLObject var11, final SubLObject var36, SubLObject var52) {
        if (var52 == UNPROVIDED) {
            var52 = (SubLObject)NIL;
        }
        SubLObject var53 = module0363.f24517(var11);
        SubLObject var54 = (SubLObject)NIL;
        var54 = var53.first();
        while (NIL != var53) {
            if (NIL != module0363.f24518(var54, var52)) {
                f26128(var54, var36);
            }
            var53 = var53.rest();
            var54 = var53.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26128(final SubLObject var6, final SubLObject var36) {
        if (NIL == f26129(var36, var6)) {
            module0387.f27563(var36, var6);
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26129(final SubLObject var36, final SubLObject var6) {
        return (SubLObject)makeBoolean(NIL == module0384.f27368(var36, var6) || NIL == module0384.f27301(var36, var6));
    }
    
    public static SubLObject f26130(final SubLObject var36, final SubLObject var6) {
        if (NIL != module0380.f26969(var6)) {
            final SubLObject var37 = module0380.f26974(var6);
            return module0380.f26977(var6, var37, var36);
        }
        if (NIL != module0380.f26995(var6)) {
            return module0380.f27003(var6, var36);
        }
        if (NIL != module0383.f27235(var6)) {
            final SubLObject var38 = module0383.f27237(var6);
            return module0383.f27245(var6, var38, var36);
        }
        if (NIL != module0381.f27067(var6)) {
            return module0381.f27089(var6, var36);
        }
        if (NIL != module0382.f27206(var6)) {
            return module0382.f27215(var6, var36);
        }
        if (NIL != module0377.f26771(var6)) {
            return module0377.f26802(var6, var36);
        }
        if (NIL != module0377.f26766(var6)) {
            return module0377.f26770(var6, var36);
        }
        if (NIL != module0376.f26619(var6)) {
            return module0376.f26655(var6, var36);
        }
        if (NIL != module0376.f26621(var6)) {
            return module0376.f26654(var6, var36);
        }
        if (NIL != module0379.f26934(var6)) {
            return module0379.f26941(var6, var36);
        }
        if (NIL != module0376.f26620(var6)) {
            return module0376.f26632(var6, var36);
        }
        Errors.error((SubLObject)$ic34$, var6);
        return var6;
    }
    
    public static SubLObject f26131(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var7) && var6.eql(f26105())) {
            Errors.error((SubLObject)$ic35$, var6);
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var7) && NIL == module0365.f24882(var6)) {
            Errors.error((SubLObject)$ic36$, var6);
        }
        final SubLObject var8 = $g3168$.currentBinding(var7);
        try {
            $g3168$.bind((SubLObject)ConsesLow.cons(var6, $g3168$.getDynamicValue(var7)), var7);
            SubLObject var9 = (SubLObject)NIL;
            try {
                if (NIL != module0413.f28839((SubLObject)UNPROVIDED)) {
                    var9 = inference_datastructures_inference_oc.f25702(module0339.f22757(), (SubLObject)NIL);
                }
                module0365.f24903(var6);
                if (NIL != f26132(var6)) {
                    f26133(var6);
                }
                else if (NIL != f26134(var6)) {
                    f26135(var6);
                }
                else if (NIL != f26136(var6)) {
                    f26137(var6);
                }
                else {
                    Errors.error((SubLObject)$ic37$, var6);
                }
                f26138(var6);
            }
            finally {
                final SubLObject var17_56 = Threads.$is_thread_performing_cleanupP$.currentBinding(var7);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var7);
                    if (NIL != module0413.f28839((SubLObject)UNPROVIDED)) {
                        module0413.f28838(Numbers.subtract(inference_datastructures_inference_oc.f25702(module0339.f22757(), (SubLObject)NIL), var9));
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var17_56, var7);
                }
            }
        }
        finally {
            $g3168$.rebind(var8, var7);
        }
        return var6;
    }
    
    public static SubLObject f26139(final SubLObject var6) {
        if (NIL != module0365.f24882(var6)) {
            f26131(var6);
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26138(final SubLObject var6) {
        if (NIL != module0365.f24883(var6)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0365.f24885(var6)) {
            return (SubLObject)NIL;
        }
        f26140(var6);
        return (SubLObject)T;
    }
    
    public static SubLObject f26141(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic38$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic38$);
        var7 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic38$);
        var8 = var5.first();
        var5 = var5.rest();
        if (NIL == var5) {
            final SubLObject var9;
            var5 = (var9 = var6);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic39$, var7), (SubLObject)ConsesLow.list((SubLObject)$ic40$, var8)), ConsesLow.append(var9, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic38$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26142() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g3170$.getDynamicValue(var1);
    }
    
    public static SubLObject f26143() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g3171$.getDynamicValue(var1);
    }
    
    public static SubLObject f26132(final SubLObject var6) {
        return (SubLObject)makeBoolean(NIL != module0376.f26684(var6) || NIL != module0376.f26685(var6) || NIL != module0377.f26799(var6) || NIL != module0379.f26939(var6));
    }
    
    public static SubLObject f26133(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = module0365.f24850(var6);
        final SubLObject var9 = module0363.f24509(var8);
        var7.resetMultipleValues();
        final SubLObject var10 = module0362.f24467(var9);
        final SubLObject var11 = var7.secondMultipleValue();
        final SubLObject var12 = var7.thirdMultipleValue();
        var7.resetMultipleValues();
        final SubLObject var13 = $g3170$.currentBinding(var7);
        final SubLObject var14 = $g3171$.currentBinding(var7);
        try {
            $g3170$.bind(var11, var7);
            $g3171$.bind(var10, var7);
            if (NIL != module0376.f26684(var6)) {
                module0376.f26687(var6, var10, var11, var12);
            }
            else if (NIL != module0376.f26685(var6)) {
                module0376.f26704(var6, var10, var11, var12);
            }
            else if (NIL != module0377.f26799(var6)) {
                module0377.f26804(var6, var10, var11, var12);
            }
            else if (NIL != module0379.f26939(var6)) {
                module0379.f26943(var6, var10, var11);
            }
            else {
                Errors.error((SubLObject)$ic41$, var6);
            }
        }
        finally {
            $g3171$.rebind(var14, var7);
            $g3170$.rebind(var13, var7);
        }
        return var6;
    }
    
    public static SubLObject f26144(final SubLObject var6) {
        return (SubLObject)makeBoolean(NIL == f26145(var6) && NIL == f26136(var6));
    }
    
    public static SubLObject f26137(final SubLObject var6) {
        if (NIL != module0383.f27235(var6)) {
            return module0383.f27249(var6);
        }
        Errors.error((SubLObject)$ic42$, module0365.f24865(var6));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26135(final SubLObject var6) {
        if (NIL != f26146(var6)) {
            return f26147(var6);
        }
        if (NIL != f26148(var6)) {
            return f26149(var6);
        }
        if (NIL != module0376.f26620(var6)) {
            return module0376.f26633(var6);
        }
        Errors.error((SubLObject)$ic43$, module0365.f24865(var6));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26147(final SubLObject var6) {
        if (NIL != module0380.f26969(var6)) {
            return module0380.f26980(var6);
        }
        if (NIL != module0381.f27067(var6)) {
            return module0381.f27093(var6);
        }
        if (NIL != module0382.f27206(var6)) {
            return module0382.f27218(var6);
        }
        Errors.error((SubLObject)$ic44$, module0365.f24865(var6));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26149(final SubLObject var6) {
        if (NIL != module0380.f26995(var6)) {
            return module0365.f24897(var6);
        }
        Errors.error((SubLObject)$ic45$, module0365.f24865(var6));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26150(final SubLObject var60) {
        return (SubLObject)makeBoolean(NIL != module0381.f27029(var60) || NIL != module0382.f27173(var60));
    }
    
    public static SubLObject f26151(final SubLObject var60) {
        return (SubLObject)makeBoolean(NIL != module0381.f27067(var60) || NIL != module0382.f27206(var60));
    }
    
    public static SubLObject f26152(final SubLObject var61) {
        if (NIL != module0381.f27029(var61)) {
            return module0381.f27034(var61);
        }
        if (NIL != module0382.f27173(var61)) {
            return module0382.f27194(var61);
        }
        return Errors.error((SubLObject)$ic46$, var61);
    }
    
    public static SubLObject f26153(final SubLObject var6) {
        if (NIL != module0381.f27067(var6)) {
            return module0381.f27055(var6);
        }
        if (NIL != module0382.f27206(var6)) {
            return module0382.f27195(var6);
        }
        return Errors.error((SubLObject)$ic47$, var6);
    }
    
    public static SubLObject f26154(final SubLObject var60) {
        return (SubLObject)makeBoolean(NIL != module0380.f26955(var60) || NIL != f26150(var60));
    }
    
    public static SubLObject f26155(final SubLObject var60) {
        return (SubLObject)makeBoolean(NIL != module0380.f26969(var60) || NIL != f26151(var60));
    }
    
    public static SubLObject f26145(final SubLObject var60) {
        return (SubLObject)makeBoolean(NIL != f26155(var60) || NIL != module0376.f26620(var60));
    }
    
    public static SubLObject f26156(final SubLObject var60) {
        return module0380.f26995(var60);
    }
    
    public static SubLObject f26134(final SubLObject var60) {
        return (SubLObject)makeBoolean(NIL != f26145(var60) || NIL != f26156(var60));
    }
    
    public static SubLObject f26157(final SubLObject var60) {
        return (SubLObject)makeBoolean(NIL != f26155(var60) || NIL != f26156(var60));
    }
    
    public static SubLObject f26158(final SubLObject var62) {
        if (NIL != module0381.f27067(var62)) {
            return module0204.f13075(module0381.f27065(var62));
        }
        return (SubLObject)ONE_INTEGER;
    }
    
    public static SubLObject f26159(final SubLObject var60) {
        return (SubLObject)makeBoolean(NIL != module0383.f27227(var60) || NIL != module0383.f27253(var60));
    }
    
    public static SubLObject f26160(final SubLObject var60) {
        return (SubLObject)makeBoolean(NIL != module0383.f27235(var60) || NIL != module0383.f27254(var60));
    }
    
    public static SubLObject f26136(final SubLObject var60) {
        return f26160(var60);
    }
    
    public static SubLObject f26161(final SubLObject var61) {
        if (NIL != module0383.f27227(var61)) {
            return module0383.f27233(var61);
        }
        return Errors.error((SubLObject)$ic48$, var61);
    }
    
    public static SubLObject f26162(final SubLObject var60) {
        return (SubLObject)makeBoolean(NIL != f26154(var60) || NIL != f26159(var60));
    }
    
    public static SubLObject f26163(final SubLObject var60) {
        return (SubLObject)makeBoolean(NIL != f26155(var60) || NIL != f26160(var60));
    }
    
    public static SubLObject f26164(final SubLObject var61) {
        return (SubLObject)makeBoolean(NIL != f26150(var61) || NIL != module0383.f27227(var61));
    }
    
    public static SubLObject f26165(final SubLObject var6) {
        return (SubLObject)makeBoolean(NIL != f26163(var6) && NIL == module0382.f27206(var6));
    }
    
    public static SubLObject f26166(final SubLObject var61) {
        if (NIL != module0381.f27029(var61)) {
            return module0381.f27034(var61);
        }
        if (NIL != module0382.f27173(var61)) {
            return module0382.f27194(var61);
        }
        if (NIL != module0383.f27227(var61)) {
            return module0383.f27233(var61);
        }
        return Errors.error((SubLObject)$ic49$, var61);
    }
    
    public static SubLObject f26167(final SubLObject var63) {
        final SubLObject var64 = module0365.f24851(var63);
        if (var64.eql((SubLObject)$ic50$)) {
            return module0380.f26972(var63);
        }
        if (var64.eql((SubLObject)$ic51$)) {
            return module0381.f27055(var63);
        }
        if (var64.eql((SubLObject)$ic52$)) {
            return module0383.f27238(var63);
        }
        if (var64.eql((SubLObject)$ic53$)) {
            return module0382.f27195(var63);
        }
        return Errors.error((SubLObject)$ic54$, module0365.f24865(var63));
    }
    
    public static SubLObject f26168(final SubLObject var63) {
        final SubLObject var64 = module0365.f24851(var63);
        if (var64.eql((SubLObject)$ic50$)) {
            return module0380.f26982(var63);
        }
        if (var64.eql((SubLObject)$ic51$)) {
            return module0381.f27095(var63);
        }
        if (var64.eql((SubLObject)$ic52$)) {
            return module0383.f27248(var63);
        }
        if (var64.eql((SubLObject)$ic53$)) {
            return Errors.error((SubLObject)$ic55$, var63);
        }
        return Errors.error((SubLObject)$ic54$, module0365.f24865(var63));
    }
    
    public static SubLObject f26169(final SubLObject var60) {
        return (SubLObject)makeBoolean(NIL != module0366.f24916(var60) && NIL != f26162(module0366.f24937(var60)));
    }
    
    public static SubLObject f26170(final SubLObject var60) {
        return (SubLObject)makeBoolean(NIL != f26162(var60) || NIL != module0375.f26571(var60) || NIL != module0374.f26529(var60));
    }
    
    public static SubLObject f26146(final SubLObject var6) {
        return f26163(var6);
    }
    
    public static SubLObject f26148(final SubLObject var6) {
        return f26156(var6);
    }
    
    public static SubLObject f26171(final SubLObject var6) {
        return (SubLObject)makeBoolean(NIL != f26146(var6) || NIL != f26148(var6));
    }
    
    public static SubLObject f26172(final SubLObject var65) {
        return f26168(var65);
    }
    
    public static SubLObject f26173(final SubLObject var60) {
        return (SubLObject)makeBoolean(NIL != module0366.f24916(var60) && NIL != f26170(module0366.f24937(var60)));
    }
    
    public static SubLObject f26174(final SubLObject var66) {
        assert NIL != f26173(var66) : var66;
        return module0364.f24721(module0366.f24937(var66));
    }
    
    public static SubLObject f26175(final SubLObject var60) {
        return (SubLObject)makeBoolean(NIL != module0376.f26613(var60) || NIL != module0377.f26746(var60) || NIL != module0378.f26860(var60) || NIL != module0379.f26926(var60));
    }
    
    public static SubLObject f26176(final SubLObject var60) {
        return (SubLObject)makeBoolean(NIL != module0376.f26618(var60) || NIL != module0377.f26771(var60) || NIL != module0379.f26934(var60));
    }
    
    public static SubLObject f26177(final SubLObject var67) {
        return (SubLObject)makeBoolean(NIL != module0366.f24916(var67) && NIL != f26175(module0366.f24937(var67)));
    }
    
    public static SubLObject f26178(final SubLObject var68) {
        if (NIL != module0376.f26613(var68)) {
            return module0376.f26615(var68);
        }
        if (NIL != module0377.f26746(var68)) {
            return module0377.f26748(var68);
        }
        if (NIL != module0378.f26860(var68)) {
            return module0377.f26748(module0378.f26873(var68));
        }
        if (NIL != module0379.f26926(var68)) {
            return module0379.f26929(var68);
        }
        Errors.error((SubLObject)$ic57$, var68);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26179(final SubLObject var68) {
        if (NIL != module0376.f26613(var68)) {
            return module0376.f26616(var68);
        }
        if (NIL != module0377.f26746(var68)) {
            return module0377.f26752(var68);
        }
        if (NIL != module0378.f26860(var68)) {
            return module0377.f26752(module0378.f26873(var68));
        }
        if (NIL != module0379.f26926(var68)) {
            return module0379.f26930(var68);
        }
        Errors.error((SubLObject)$ic57$, var68);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26180(final SubLObject var68) {
        if (NIL != module0376.f26613(var68)) {
            return module0376.f26612(var68);
        }
        if (NIL != module0377.f26746(var68)) {
            return module0377.f26745(var68);
        }
        if (NIL != module0378.f26860(var68)) {
            return module0377.f26745(module0378.f26873(var68));
        }
        if (NIL != module0379.f26926(var68)) {
            return module0379.f26925(var68);
        }
        Errors.error((SubLObject)$ic57$, var68);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26181(final SubLObject var67) {
        final SubLObject var68 = module0366.f24937(var67);
        final SubLObject var69 = f26180(var68);
        return var69;
    }
    
    public static SubLObject f26182(final SubLObject var70) {
        assert NIL != f26176(var70) : var70;
        if (NIL != module0365.f24886(var70)) {
            return (SubLObject)ZERO_INTEGER;
        }
        if (NIL != module0376.f26619(var70)) {
            return f26183(var70);
        }
        if (NIL != module0376.f26620(var70)) {
            return f26184(var70);
        }
        if (NIL != module0377.f26771(var70)) {
            return f26185(var70);
        }
        if (NIL != module0379.f26934(var70)) {
            return f26186(var70);
        }
        if (NIL != module0376.f26621(var70)) {
            return f26187(var70);
        }
        return Errors.error((SubLObject)$ic59$, var70);
    }
    
    public static SubLObject f26183(final SubLObject var71) {
        final SubLObject var72 = module0365.f24850(var71);
        if (NIL != module0363.f24562(var72)) {
            return f26188(var71);
        }
        return Errors.error((SubLObject)$ic60$, var71);
    }
    
    public static SubLObject f26188(final SubLObject var71) {
        final SubLObject var72 = module0365.f24850(var71);
        final SubLObject var73 = module0365.f24879(var71);
        final SubLObject var74 = module0365.f24865(var71);
        SubLObject var75 = (SubLObject)ZERO_INTEGER;
        if (NIL != module0363.f24553(var72)) {
            final SubLObject var76 = module0363.f24527(var72);
            SubLObject var77;
            SubLObject var78;
            SubLObject var79;
            SubLObject var80;
            for (var77 = module0032.f1741(var76), var78 = (SubLObject)NIL, var78 = module0032.f1742(var77, var76); NIL == module0032.f1744(var77, var78); var78 = module0032.f1743(var78)) {
                var79 = module0032.f1745(var77, var78);
                if (NIL != module0032.f1746(var78, var79) && NIL != module0364.f24748(var79, (SubLObject)$ic61$)) {
                    var80 = module0376.f26612(var79);
                    if (var80.eql(var74)) {
                        var75 = Numbers.add(var75, (SubLObject)ONE_INTEGER);
                    }
                }
            }
        }
        else if (NIL != module0361.f24165(var73)) {
            final SubLObject var76 = module0363.f24527(var72);
            SubLObject var77;
            SubLObject var78;
            SubLObject var81;
            SubLObject var82;
            SubLObject var33_76;
            SubLObject var34_77;
            SubLObject var35_78;
            SubLObject var83;
            SubLObject var84;
            for (var77 = module0032.f1741(var76), var78 = (SubLObject)NIL, var78 = module0032.f1742(var77, var76); NIL == module0032.f1744(var77, var78); var78 = module0032.f1743(var78)) {
                var81 = module0032.f1745(var77, var78);
                if (NIL != module0032.f1746(var78, var81) && NIL != module0364.f24748(var81, (SubLObject)$ic62$)) {
                    var82 = module0364.f24757(var81);
                    var33_76 = module0363.f24527(var82);
                    for (var34_77 = module0032.f1741(var33_76), var35_78 = (SubLObject)NIL, var35_78 = module0032.f1742(var34_77, var33_76); NIL == module0032.f1744(var34_77, var35_78); var35_78 = module0032.f1743(var35_78)) {
                        var83 = module0032.f1745(var34_77, var35_78);
                        if (NIL != module0032.f1746(var35_78, var83) && NIL != module0364.f24748(var83, (SubLObject)$ic61$)) {
                            var84 = module0376.f26612(var83);
                            if (var84.eql(var74)) {
                                var75 = Numbers.add(var75, (SubLObject)ONE_INTEGER);
                            }
                        }
                    }
                }
            }
        }
        else {
            final SubLObject var76 = module0363.f24527(var72);
            SubLObject var77;
            SubLObject var78;
            SubLObject var79;
            SubLObject var80;
            for (var77 = module0032.f1741(var76), var78 = (SubLObject)NIL, var78 = module0032.f1742(var77, var76); NIL == module0032.f1744(var77, var78); var78 = module0032.f1743(var78)) {
                var79 = module0032.f1745(var77, var78);
                if (NIL != module0032.f1746(var78, var79) && NIL != module0364.f24748(var79, (SubLObject)$ic61$)) {
                    var80 = module0376.f26612(var79);
                    if (var80.eql(var74)) {
                        var75 = Numbers.add(var75, (SubLObject)ONE_INTEGER);
                    }
                }
            }
        }
        return module0360.f23935(var75);
    }
    
    public static SubLObject f26184(final SubLObject var79) {
        assert NIL != module0376.f26620(var79) : var79;
        final SubLObject var80 = module0365.f24850(var79);
        final SubLObject var81 = module0365.f24865(var79);
        SubLObject var82 = (SubLObject)ZERO_INTEGER;
        if (NIL != module0363.f24553(var80)) {
            final SubLObject var83 = module0363.f24527(var80);
            SubLObject var84;
            SubLObject var85;
            SubLObject var86;
            for (var84 = module0032.f1741(var83), var85 = (SubLObject)NIL, var85 = module0032.f1742(var84, var83); NIL == module0032.f1744(var84, var85); var85 = module0032.f1743(var85)) {
                var86 = module0032.f1745(var84, var85);
                if (NIL != module0032.f1746(var85, var86) && NIL != module0364.f24748(var86, (SubLObject)$ic29$) && var81.eql(module0376.f26612(var86))) {
                    var82 = Numbers.add(var82, (SubLObject)ONE_INTEGER);
                }
            }
        }
        else {
            final SubLObject var83 = module0363.f24527(var80);
            SubLObject var84;
            SubLObject var85;
            SubLObject var87;
            SubLObject var88;
            SubLObject var33_82;
            SubLObject var34_83;
            SubLObject var35_84;
            SubLObject var89;
            for (var84 = module0032.f1741(var83), var85 = (SubLObject)NIL, var85 = module0032.f1742(var84, var83); NIL == module0032.f1744(var84, var85); var85 = module0032.f1743(var85)) {
                var87 = module0032.f1745(var84, var85);
                if (NIL != module0032.f1746(var85, var87) && NIL != module0364.f24748(var87, (SubLObject)$ic62$)) {
                    var88 = module0364.f24757(var87);
                    var33_82 = module0363.f24527(var88);
                    for (var34_83 = module0032.f1741(var33_82), var35_84 = (SubLObject)NIL, var35_84 = module0032.f1742(var34_83, var33_82); NIL == module0032.f1744(var34_83, var35_84); var35_84 = module0032.f1743(var35_84)) {
                        var89 = module0032.f1745(var34_83, var35_84);
                        if (NIL != module0032.f1746(var35_84, var89) && NIL != module0364.f24748(var89, (SubLObject)$ic29$) && var81.eql(module0376.f26612(var89))) {
                            var82 = Numbers.add(var82, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
        }
        return module0360.f23935(var82);
    }
    
    public static SubLObject f26185(final SubLObject var85) {
        assert NIL != module0377.f26771(var85) : var85;
        final SubLObject var86 = module0365.f24850(var85);
        final SubLObject var87 = module0365.f24865(var85);
        final SubLObject var88 = module0377.f26753(var85);
        SubLObject var89 = (SubLObject)ZERO_INTEGER;
        final SubLObject var90 = module0363.f24527(var86);
        SubLObject var91;
        SubLObject var92;
        SubLObject var93;
        for (var91 = module0032.f1741(var90), var92 = (SubLObject)NIL, var92 = module0032.f1742(var91, var90); NIL == module0032.f1744(var91, var92); var92 = module0032.f1743(var92)) {
            var93 = module0032.f1745(var91, var92);
            if (NIL != module0032.f1746(var92, var93) && NIL != module0364.f24748(var93, (SubLObject)$ic65$) && var87.eql(module0377.f26745(var93)) && var88.eql(module0377.f26749(var93))) {
                var89 = Numbers.add(var89, (SubLObject)ONE_INTEGER);
            }
        }
        return module0360.f23935(var89);
    }
    
    public static SubLObject f26186(final SubLObject var88) {
        assert NIL != module0379.f26934(var88) : var88;
        final SubLObject var89 = module0365.f24850(var88);
        SubLObject var90 = (SubLObject)ZERO_INTEGER;
        final SubLObject var91 = module0363.f24527(var89);
        SubLObject var92;
        SubLObject var93;
        SubLObject var94;
        SubLObject var95;
        for (var92 = module0032.f1741(var91), var93 = (SubLObject)NIL, var93 = module0032.f1742(var92, var91); NIL == module0032.f1744(var92, var93); var93 = module0032.f1743(var93)) {
            var94 = module0032.f1745(var92, var93);
            if (NIL != module0032.f1746(var93, var94) && NIL != module0364.f24748(var94, (SubLObject)$ic67$)) {
                var95 = module0379.f26930(var94);
                if (var95.eql(var88)) {
                    var90 = Numbers.add(var90, (SubLObject)ONE_INTEGER);
                }
            }
        }
        return module0360.f23935(var90);
    }
    
    public static SubLObject f26187(final SubLObject var91) {
        assert NIL != module0376.f26621(var91) : var91;
        final SubLObject var92 = module0365.f24850(var91);
        return module0363.f24639(var92);
    }
    
    public static SubLObject f26189(final SubLObject var11, final SubLObject var92) {
        assert NIL != f26190(var92) : var92;
        f26191(var11, var92);
        final SubLObject var93 = module0360.f23935(module0363.f24644(var11));
        final SubLObject var94 = f26192(var11, var92);
        final SubLObject var95 = module0360.f23944(var93, var94);
        return var95;
    }
    
    public static SubLObject f26192(final SubLObject var11, final SubLObject var92) {
        final SubLObject var93 = f26193(var11, var92);
        final SubLObject var94 = f26194(var11, var92);
        final SubLObject var95 = f26195(var11, var93, var92);
        final SubLObject var96 = f26196(var11, var94, var92);
        if ($ic30$ != var93 && $ic70$ != var94) {
            return module0360.f23944(var95, var96);
        }
        if ($ic30$ != var93 && $ic70$ == var94) {
            return var96;
        }
        if ($ic30$ == var93 && $ic70$ != var94) {
            return var95;
        }
        if ($ic30$ != var93 || $ic70$ != var94) {
            return (SubLObject)NIL;
        }
        if (NIL != module0360.f23940(var95, var96)) {
            return var95;
        }
        return var96;
    }
    
    public static SubLObject f26195(final SubLObject var11, final SubLObject var100, final SubLObject var92) {
        SubLObject var101 = (SubLObject)ZERO_INTEGER;
        SubLObject var102 = module0363.f24517(var11);
        SubLObject var103 = (SubLObject)NIL;
        var103 = var102.first();
        while (NIL != var102) {
            if (NIL != module0363.f24524(var103, (SubLObject)$ic71$) && NIL != module0363.f24518(var103, (SubLObject)$ic72$) && NIL != module0363.f24519(var103, var100) && (NIL == module0367.f24997(var92) || NIL == module0384.f27279(var92, var103))) {
                var101 = module0360.f23944(var101, module0365.f24852(var103));
            }
            var102 = var102.rest();
            var103 = var102.first();
        }
        return var101;
    }
    
    public static SubLObject f26196(final SubLObject var11, final SubLObject var102, final SubLObject var92) {
        if (var102.eql((SubLObject)$ic70$)) {
            return f26197(var11, var92);
        }
        if (var102.eql((SubLObject)$ic73$)) {
            return f26198(var11, var92);
        }
        if (var102.eql((SubLObject)$ic74$)) {
            return f26199(var11, var92);
        }
        if (var102.eql((SubLObject)$ic75$) || var102.eql((SubLObject)$ic76$)) {
            return (SubLObject)ZERO_INTEGER;
        }
        Errors.error((SubLObject)$ic77$, var102);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26197(final SubLObject var11, final SubLObject var92) {
        if (NIL != f26200(var11, var92)) {
            return (SubLObject)ZERO_INTEGER;
        }
        SubLObject var93 = (SubLObject)ZERO_INTEGER;
        SubLObject var94 = module0387.f27491(var11, var92, (SubLObject)$ic72$, (SubLObject)$ic30$, (SubLObject)NIL, (SubLObject)$ic78$);
        if (NIL != var94) {
            var93 = module0360.f23944(var93, module0367.f25203(var94, var92));
        }
        var94 = module0387.f27491(var11, var92, (SubLObject)$ic72$, (SubLObject)$ic30$, (SubLObject)NIL, (SubLObject)$ic50$);
        if (NIL != var94) {
            var93 = module0360.f23944(var93, module0367.f25203(var94, var92));
        }
        SubLObject var95 = module0363.f24517(var11);
        SubLObject var96 = (SubLObject)NIL;
        var96 = var95.first();
        while (NIL != var95) {
            if (NIL != module0363.f24524(var96, (SubLObject)$ic79$) && NIL != module0363.f24518(var96, (SubLObject)$ic72$) && NIL != module0363.f24520(var96, (SubLObject)$ic70$) && NIL == f26145(var96)) {
                var93 = module0360.f23944(var93, module0367.f25203(var96, var92));
            }
            var95 = var95.rest();
            var96 = var95.first();
        }
        return var93;
    }
    
    public static SubLObject f26198(final SubLObject var11, final SubLObject var92) {
        return f26201(var11, var92, (SubLObject)$ic73$);
    }
    
    public static SubLObject f26199(final SubLObject var11, final SubLObject var92) {
        return f26201(var11, var92, (SubLObject)$ic74$);
    }
    
    public static SubLObject f26201(final SubLObject var11, final SubLObject var92, final SubLObject var102) {
        if (NIL != f26200(var11, var92)) {
            return (SubLObject)ZERO_INTEGER;
        }
        SubLObject var103 = (SubLObject)ZERO_INTEGER;
        SubLObject var104 = module0363.f24517(var11);
        SubLObject var105 = (SubLObject)NIL;
        var105 = var104.first();
        while (NIL != var104) {
            if (NIL != module0363.f24524(var105, (SubLObject)$ic79$) && NIL != module0363.f24518(var105, (SubLObject)$ic72$) && NIL != module0363.f24520(var105, var102)) {
                var103 = module0360.f23944(var103, module0367.f25203(var105, var92));
            }
            var104 = var104.rest();
            var105 = var104.first();
        }
        return var103;
    }
    
    public static SubLObject f26200(final SubLObject var11, final SubLObject var92) {
        final SubLThread var93 = SubLProcess.currentSubLThread();
        SubLObject var94 = module0363.f24517(var11);
        SubLObject var95 = (SubLObject)NIL;
        var95 = var94.first();
        while (NIL != var94) {
            if (NIL != module0363.f24524(var95, (SubLObject)$ic80$) && NIL != module0363.f24518(var95, (SubLObject)$ic33$)) {
                if (NIL != module0382.f27206(var95)) {
                    var93.resetMultipleValues();
                    final SubLObject var96 = module0382.f27211(var95);
                    final SubLObject var97 = var93.secondMultipleValue();
                    var93.resetMultipleValues();
                    if (NIL != f26202(var96, var92) || NIL != f26202(var97, var92)) {
                        return (SubLObject)T;
                    }
                }
                else {
                    final SubLObject var98 = f26168(var95);
                    if (NIL != f26202(var98, var92)) {
                        return (SubLObject)T;
                    }
                }
            }
            var94 = var94.rest();
            var95 = var94.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26202(final SubLObject var11, final SubLObject var92) {
        return (SubLObject)makeBoolean(NIL == f26203(var11, var92) && NIL != module0384.f27303(var11, var92, (SubLObject)$ic71$));
    }
    
    public static SubLObject f26194(final SubLObject var11, final SubLObject var92) {
        return f26204(var11, (SubLObject)$ic79$, var92);
    }
    
    public static SubLObject f26205(final SubLObject var108, final SubLObject var92) {
        final SubLObject var109 = f26166(var108);
        return f26206(var109, var92);
    }
    
    public static SubLObject f26206(final SubLObject var63, final SubLObject var92) {
        final SubLThread var93 = SubLProcess.currentSubLThread();
        if (NIL != module0382.f27206(var63)) {
            var93.resetMultipleValues();
            final SubLObject var94 = module0382.f27211(var63);
            final SubLObject var95 = var93.secondMultipleValue();
            var93.resetMultipleValues();
            final SubLObject var96 = f26193(var94, var92);
            final SubLObject var97 = f26193(var95, var92);
            return module0360.f23930(var96, var97);
        }
        return f26193(f26168(var63), var92);
    }
    
    public static SubLObject f26193(final SubLObject var11, final SubLObject var92) {
        assert NIL != f26190(var92) : var92;
        f26191(var11, var92);
        SubLObject var93 = (SubLObject)$ic81$;
        SubLObject var94;
        SubLObject var95;
        SubLObject var96;
        SubLObject var97;
        for (var94 = (SubLObject)NIL, var95 = (SubLObject)NIL, var95 = module0363.f24517(var11); NIL == var94 && NIL != var95; var95 = var95.rest()) {
            var96 = var95.first();
            if (NIL != module0363.f24524(var96, (SubLObject)$ic71$) && (NIL == module0367.f24997(var92) || NIL == module0384.f27279(var92, var96))) {
                var97 = module0367.f25197(var96, var92);
                if (NIL != module0360.f23928(var97, var93)) {
                    var93 = var97;
                    if (var93 == $ic30$) {
                        var94 = (SubLObject)T;
                    }
                }
            }
        }
        if ($ic30$ != var93 && NIL != var92 && NIL != module0384.f27297(var11, var92)) {
            var93 = (SubLObject)$ic30$;
        }
        return var93;
    }
    
    public static SubLObject f26204(final SubLObject var11, final SubLObject var117, final SubLObject var92) {
        assert NIL != f26190(var92) : var92;
        f26191(var11, var92);
        SubLObject var118 = (SubLObject)$ic75$;
        SubLObject var119;
        SubLObject var120;
        SubLObject var121;
        SubLObject var122;
        for (var119 = (SubLObject)NIL, var120 = (SubLObject)NIL, var120 = module0363.f24517(var11); NIL == var119 && NIL != var120; var120 = var120.rest()) {
            var121 = var120.first();
            if (NIL != module0363.f24524(var121, var117) && (NIL == module0367.f24997(var92) || NIL == module0384.f27279(var92, var121))) {
                var122 = module0367.f25198(var121, var92);
                if (NIL != module0358.f23676(var122, var118)) {
                    var118 = var122;
                    if (var118 == $ic70$) {
                        var119 = (SubLObject)T;
                    }
                }
            }
        }
        return var118;
    }
    
    public static SubLObject f26207(final SubLObject var6) {
        if (NIL == module0361.f24164(module0365.f24879(var6))) {
            final SubLObject var7 = module0365.f24850(var6);
            f26208(var7, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)$ic78$, var6, (SubLObject)NIL);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26209(final SubLObject var6) {
        if (NIL == module0361.f24164(module0365.f24879(var6))) {
            f26210(var6);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26210(final SubLObject var6) {
        final SubLObject var7 = module0365.f24850(var6);
        f26208(var7, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)$ic82$, var6, (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26211(final SubLObject var61) {
        return (SubLObject)makeBoolean(NIL == module0374.f26529(var61));
    }
    
    public static SubLObject f26212(final SubLObject var49, final SubLObject var48, final SubLObject var121) {
        return f26213(var49, var48, var121);
    }
    
    public static SubLObject f26214(final SubLObject var49, final SubLObject var48, final SubLObject var121) {
        final SubLThread var122 = SubLProcess.currentSubLThread();
        final SubLObject var123 = module0034.$g879$.getDynamicValue(var122);
        SubLObject var124 = (SubLObject)NIL;
        if (NIL == var123) {
            return f26212(var49, var48, var121);
        }
        var124 = module0034.f1857(var123, (SubLObject)$ic83$, (SubLObject)UNPROVIDED);
        if (NIL == var124) {
            var124 = module0034.f1807(module0034.f1842(var123), (SubLObject)$ic83$, (SubLObject)THREE_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var123, (SubLObject)$ic83$, var124);
        }
        final SubLObject var125 = module0034.f1781(var49, var48, var121);
        final SubLObject var126 = module0034.f1814(var124, var125, (SubLObject)UNPROVIDED);
        if (var126 != $ic84$) {
            SubLObject var127 = var126;
            SubLObject var128 = (SubLObject)NIL;
            var128 = var127.first();
            while (NIL != var127) {
                SubLObject var129 = var128.first();
                final SubLObject var130 = conses_high.second(var128);
                if (var49.equal(var129.first())) {
                    var129 = var129.rest();
                    if (var48.equal(var129.first())) {
                        var129 = var129.rest();
                        if (NIL != var129 && NIL == var129.rest() && var121.equal(var129.first())) {
                            return module0034.f1959(var130);
                        }
                    }
                }
                var127 = var127.rest();
                var128 = var127.first();
            }
        }
        final SubLObject var131 = Values.arg2(var122.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f26212(var49, var48, var121)));
        module0034.f1836(var124, var125, var126, var131, (SubLObject)ConsesLow.list(var49, var48, var121));
        return module0034.f1959(var131);
    }
    
    public static SubLObject f26213(final SubLObject var49, final SubLObject var48, final SubLObject var121) {
        final SubLThread var122 = SubLProcess.currentSubLThread();
        SubLObject var123 = (SubLObject)NIL;
        final SubLObject var124 = module0147.$g2095$.currentBinding(var122);
        final SubLObject var125 = module0147.$g2094$.currentBinding(var122);
        final SubLObject var126 = module0147.$g2096$.currentBinding(var122);
        try {
            module0147.$g2095$.bind(module0147.f9545(var48), var122);
            module0147.$g2094$.bind(module0147.f9546(var48), var122);
            module0147.$g2096$.bind(module0147.f9549(var48), var122);
            if (var121.eql((SubLObject)$ic85$)) {
                var123 = (SubLObject)T;
            }
            else if (var121.eql((SubLObject)$ic86$)) {
                var123 = (SubLObject)T;
            }
            else if (var121.eql((SubLObject)$ic87$)) {
                var123 = module0309.f21041(var49, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (var121.eql((SubLObject)$ic88$)) {
                var123 = module0478.f31676(var49, (SubLObject)UNPROVIDED);
            }
            else {
                Errors.error((SubLObject)$ic89$, var121);
            }
        }
        finally {
            module0147.$g2096$.rebind(var126, var122);
            module0147.$g2094$.rebind(var125, var122);
            module0147.$g2095$.rebind(var124, var122);
        }
        return var123;
    }
    
    public static SubLObject f26215(final SubLObject var67) {
        final SubLObject var68 = module0366.f24937(var67);
        final SubLObject var69 = module0366.f24934(var67);
        return f26216(var68, var69);
    }
    
    public static SubLObject f26216(final SubLObject var61, final SubLObject var131) {
        final SubLThread var132 = SubLProcess.currentSubLThread();
        final SubLObject var133 = module0364.f24722(var61);
        final SubLObject var134 = module0361.f24160(var133);
        if ($ic85$ == var134) {
            return (SubLObject)T;
        }
        if (NIL != f26217(var61)) {
            return (SubLObject)T;
        }
        if (NIL != f26175(var61) && NIL == f26218(var61, var134)) {
            return (SubLObject)NIL;
        }
        if ($ic86$ == var134) {
            return (SubLObject)T;
        }
        if (NIL != f26219(var61)) {
            return (SubLObject)T;
        }
        final SubLObject var135 = module0364.f24725(var61);
        final SubLObject var136 = module0363.f24509(var135);
        final SubLObject var137 = module0233.f15362(var131, var136);
        if (NIL != module0378.f26860(var61)) {
            SubLObject var138;
            SubLObject var139;
            SubLObject var140;
            SubLObject var141;
            SubLObject var142;
            SubLObject var143;
            SubLObject var144;
            SubLObject var146;
            SubLObject var145;
            SubLObject var147;
            SubLObject var148;
            SubLObject var150;
            SubLObject var149;
            for (var138 = (SubLObject)NIL, var139 = (SubLObject)NIL, var139 = var137; NIL == var138 && NIL != var139; var139 = var139.rest()) {
                var140 = var139.first();
                var141 = (SubLObject)$ic28$;
                var142 = (SubLObject)ZERO_INTEGER;
                var143 = module0232.f15306(var140);
                var144 = (SubLObject)NIL;
                var144 = var143.first();
                while (NIL != var143) {
                    var145 = (var146 = var144);
                    var147 = (SubLObject)NIL;
                    var148 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var146, var145, (SubLObject)$ic90$);
                    var147 = var146.first();
                    var146 = var146.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var146, var145, (SubLObject)$ic90$);
                    var148 = var146.first();
                    var146 = var146.rest();
                    if (NIL == var146) {
                        var138 = (SubLObject)makeBoolean(NIL == f26220(var147, var148, var141, var134));
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var145, (SubLObject)$ic90$);
                    }
                    var142 = Numbers.add(var142, (SubLObject)ONE_INTEGER);
                    var143 = var143.rest();
                    var144 = var143.first();
                }
                var141 = (SubLObject)$ic27$;
                var142 = (SubLObject)ZERO_INTEGER;
                var143 = module0232.f15308(var140);
                var144 = (SubLObject)NIL;
                var144 = var143.first();
                while (NIL != var143) {
                    var149 = (var150 = var144);
                    var147 = (SubLObject)NIL;
                    var148 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var150, var149, (SubLObject)$ic90$);
                    var147 = var150.first();
                    var150 = var150.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var150, var149, (SubLObject)$ic90$);
                    var148 = var150.first();
                    var150 = var150.rest();
                    if (NIL == var150) {
                        var138 = (SubLObject)makeBoolean(NIL == f26220(var147, var148, var141, var134));
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var149, (SubLObject)$ic90$);
                    }
                    var142 = Numbers.add(var142, (SubLObject)ONE_INTEGER);
                    var143 = var143.rest();
                    var144 = var143.first();
                }
            }
            return (SubLObject)makeBoolean(NIL == var138);
        }
        var132.resetMultipleValues();
        final SubLObject var151 = module0362.f24467(var137);
        final SubLObject var152 = var132.secondMultipleValue();
        final SubLObject var153 = var132.thirdMultipleValue();
        var132.resetMultipleValues();
        return f26220(var151, var152, var153, var134);
    }
    
    public static SubLObject f26220(final SubLObject var48, final SubLObject var49, final SubLObject var45, final SubLObject var121) {
        return f26214(var49, var48, var121);
    }
    
    public static SubLObject f26217(final SubLObject var61) {
        if (NIL != f26154(var61)) {
            return (SubLObject)T;
        }
        if (NIL != module0375.f26571(var61)) {
            return (SubLObject)T;
        }
        if (NIL != module0374.f26529(var61)) {
            Errors.error((SubLObject)$ic91$, var61);
        }
        else {
            if (NIL != f26159(var61)) {
                return (SubLObject)T;
            }
            if (NIL != f26175(var61)) {
                return (SubLObject)NIL;
            }
            Errors.error((SubLObject)$ic92$, var61);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26218(final SubLObject var61, final SubLObject var121) {
        SubLObject var123;
        final SubLObject var122 = var123 = f26178(var61);
        SubLObject var124 = (SubLObject)NIL;
        var124 = var123.first();
        while (NIL != var123) {
            if (NIL == module0333.f22436(var124, var121)) {
                return (SubLObject)NIL;
            }
            var123 = var123.rest();
            var124 = var123.first();
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f26219(final SubLObject var61) {
        if (NIL != module0376.f26613(var61)) {
            final SubLObject var62 = module0364.f24725(var61);
            final SubLObject var63 = module0363.f24509(var62);
            if (NIL != module0204.f13060(var63)) {
                final SubLObject var64 = module0376.f26615(var61);
                if (NIL == module0035.f1997(var64)) {
                    return (SubLObject)NIL;
                }
            }
            return (SubLObject)T;
        }
        if (NIL != module0379.f26926(var61)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0377.f26746(var61)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0378.f26860(var61)) {
            return (SubLObject)NIL;
        }
        Errors.error((SubLObject)$ic92$, var61);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26221(final SubLObject var61, final SubLObject var131, final SubLObject var148) {
        final SubLThread var149 = SubLProcess.currentSubLThread();
        SubLObject var150 = (SubLObject)NIL;
        var150 = f26222(var61, var131, var148);
        if (NIL != var150) {
            return Values.values(var150, (SubLObject)NIL);
        }
        final SubLObject var151 = module0366.f24947(var61, var131, var148);
        f26223(var151);
        final SubLObject var152 = (SubLObject)makeBoolean(NIL == $g3172$.getDynamicValue(var149) || NIL != f26215(var151));
        if (NIL == var152) {
            f26224(var151);
        }
        else {
            final SubLObject var153 = f26225(var151);
            if (NIL != var153) {
                f26226(var151);
            }
            else {
                final SubLObject var154 = module0364.f24725(var61);
                if (NIL != module0536.f33283(var61, var154, var148)) {
                    f26227(var151);
                }
                else if (NIL != module0525.f32686(var151) && NIL != module0452.f31044(var151)) {
                    f26228(var151);
                }
                else {
                    f26229(var154);
                    f26230(var151);
                }
            }
        }
        return Values.values(var151, var152);
    }
    
    public static SubLObject f26223(final SubLObject var67) {
        assert NIL != module0366.f24916(var67) : var67;
        final SubLObject var68 = module0366.f24936(var67);
        SubLObject var69 = (SubLObject)ZERO_INTEGER;
        if (NIL != module0361.f24151(var68) && NIL != module0366.f24974(var67)) {
            SubLObject var70 = module0366.f24938(var67);
            SubLObject var71 = (SubLObject)NIL;
            var71 = var70.first();
            while (NIL != var70) {
                SubLObject var43_155 = f26231(var71);
                SubLObject var72 = (SubLObject)NIL;
                var72 = var43_155.first();
                while (NIL != var43_155) {
                    var69 = Numbers.add(var69, (SubLObject)ONE_INTEGER);
                    module0361.f24383(var67, var72);
                    var43_155 = var43_155.rest();
                    var72 = var43_155.first();
                }
                var70 = var70.rest();
                var71 = var70.first();
            }
            if (NIL != module0377.f26783(var67)) {
                SubLObject var74;
                final SubLObject var73 = var74 = f26232(var67);
                SubLObject var75 = (SubLObject)NIL;
                var75 = var74.first();
                while (NIL != var74) {
                    var69 = Numbers.add(var69, (SubLObject)ONE_INTEGER);
                    module0361.f24383(var67, var75);
                    var74 = var74.rest();
                    var75 = var74.first();
                }
            }
        }
        return var69;
    }
    
    public static SubLObject f26225(final SubLObject var67) {
        SubLObject var68 = module0366.f24938(var67);
        SubLObject var69 = (SubLObject)NIL;
        var69 = var68.first();
        while (NIL != var68) {
            if (NIL != f26233(var69, var67, (SubLObject)ZERO_INTEGER)) {
                return (SubLObject)T;
            }
            var68 = var68.rest();
            var69 = var68.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26233(final SubLObject var67, final SubLObject var158, final SubLObject var159) {
        if (var159.numG($g3173$.getGlobalValue())) {
            return (SubLObject)NIL;
        }
        if (NIL != f26234(var67, var158)) {
            return (SubLObject)T;
        }
        SubLObject var160 = module0366.f24938(var67);
        SubLObject var161 = (SubLObject)NIL;
        var161 = var160.first();
        while (NIL != var160) {
            if (NIL != f26233(var161, var158, module0048.f_1X(var159))) {
                return (SubLObject)T;
            }
            var160 = var160.rest();
            var161 = var160.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26234(final SubLObject var160, final SubLObject var161) {
        return (SubLObject)makeBoolean(module0366.f24956(var160).eql(module0366.f24956(var161)) && NIL != f26235(module0366.f24934(var160), module0366.f24934(var161)));
    }
    
    public static SubLObject f26236(final SubLObject var160, final SubLObject var161) {
        return module0366.f24990(var160, var161);
    }
    
    public static SubLObject f26226(final SubLObject var67) {
        f26237(var67, (SubLObject)$ic95$);
        return var67;
    }
    
    public static SubLObject f26224(final SubLObject var67) {
        f26237(var67, (SubLObject)$ic96$);
        f26238(var67);
        return var67;
    }
    
    public static SubLObject f26227(final SubLObject var67) {
        f26237(var67, (SubLObject)$ic97$);
        return var67;
    }
    
    public static SubLObject f26228(final SubLObject var67) {
        f26237(var67, (SubLObject)$ic98$);
        return var67;
    }
    
    public static SubLObject f26237(final SubLObject var67, final SubLObject var162) {
        if (NIL == module0366.f24957(var67)) {
            module0366.f24987(var67, var162);
            f26239(var67);
        }
        f26240(module0366.f24956(var67));
        return var67;
    }
    
    public static SubLObject f26239(final SubLObject var67) {
        SubLObject var68 = module0366.f24961(var67);
        SubLObject var69 = (SubLObject)NIL;
        var69 = var68.first();
        while (NIL != var68) {
            if (NIL != module0363.f24538(var69, (SubLObject)$ic99$)) {
                f26237(var69, (SubLObject)$ic100$);
            }
            var68 = var68.rest();
            var69 = var68.first();
        }
        return var67;
    }
    
    public static SubLObject f26238(final SubLObject var165) {
        final SubLThread var166 = SubLProcess.currentSubLThread();
        final SubLObject var167 = module0366.f24936(var165);
        final SubLObject var168 = f26241(var165);
        final SubLObject var169 = f26242(var167, var168);
        if (NIL != var169) {
            final SubLObject var170 = module0364.f24736(var169);
            if (NIL != module0363.f24680(var170)) {
                final SubLObject var171 = (SubLObject)$ic99$;
                SubLObject var172;
                for (var172 = module0066.f4838(module0363.f24537(var170)); NIL == module0066.f4841(var172); var172 = module0066.f4840(var172)) {
                    var166.resetMultipleValues();
                    final SubLObject var173 = module0066.f4839(var172);
                    final SubLObject var174 = var166.secondMultipleValue();
                    var166.resetMultipleValues();
                    SubLObject var175 = var174;
                    SubLObject var176 = (SubLObject)NIL;
                    var176 = var175.first();
                    while (NIL != var175) {
                        if (NIL != module0363.f24538(var176, var171)) {
                            f26237(var176, (SubLObject)$ic96$);
                        }
                        var175 = var175.rest();
                        var176 = var175.first();
                    }
                }
                module0066.f4842(var172);
            }
            if (NIL == module0363.f24681(var170)) {
                f26243(var170);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26243(final SubLObject var11) {
        return f26244(var11, (SubLObject)NIL, (SubLObject)$ic25$);
    }
    
    public static SubLObject f26245(final SubLObject var67) {
        assert NIL != module0366.f24916(var67) : var67;
        final SubLObject var68 = module0366.f24936(var67);
        if (NIL != module0361.f24236(var68)) {
            f26246(var67);
        }
        return var67;
    }
    
    public static SubLObject f26246(final SubLObject var67) {
        final SubLThread var68 = SubLProcess.currentSubLThread();
        if (NIL != module0366.f24932(var67) && NIL == module0366.f24958(var67) && NIL != f26247(var67)) {
            module0366.f24962(var67);
            SubLObject var69 = module0366.f24938(var67);
            SubLObject var70 = (SubLObject)NIL;
            var70 = var69.first();
            while (NIL != var69) {
                f26246(var70);
                var69 = var69.rest();
                var70 = var69.first();
            }
            if (NIL != $g3174$.getDynamicValue(var68)) {
                final SubLObject var71 = module0366.f24937(var67);
                if (NIL != module0378.f26860(var71)) {
                    final SubLObject var72 = module0378.f26873(var71);
                    SubLObject var73 = module0364.f24768(var72);
                    SubLObject var67_173 = (SubLObject)NIL;
                    var67_173 = var73.first();
                    while (NIL != var73) {
                        if (NIL != module0363.f24538(var67_173, (SubLObject)NIL)) {
                            f26246(var67_173);
                        }
                        var73 = var73.rest();
                        var67_173 = var73.first();
                    }
                }
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26230(final SubLObject var150) {
        final SubLObject var151 = module0366.f24936(var150);
        if (NIL != module0361.f24236(var151)) {
            SubLObject var152 = module0366.f24938(var150);
            SubLObject var153 = (SubLObject)NIL;
            var153 = var152.first();
            while (NIL != var152) {
                if (NIL != module0366.f24958(var153)) {
                    module0366.f24963(var153);
                    f26230(var153);
                }
                var152 = var152.rest();
                var153 = var152.first();
            }
        }
        return var150;
    }
    
    public static SubLObject f26247(final SubLObject var67) {
        SubLObject var68 = (SubLObject)NIL;
        if (NIL == var68) {
            SubLObject var69 = module0366.f24961(var67);
            SubLObject var70 = (SubLObject)NIL;
            var70 = var69.first();
            while (NIL == var68 && NIL != var69) {
                if (NIL != module0363.f24538(var70, (SubLObject)NIL) && NIL == module0366.f24958(var70)) {
                    var68 = var70;
                }
                var69 = var69.rest();
                var70 = var69.first();
            }
        }
        return (SubLObject)makeBoolean(NIL == var68);
    }
    
    public static SubLObject f26222(final SubLObject var61, final SubLObject var131, final SubLObject var148) {
        final SubLThread var149 = SubLProcess.currentSubLThread();
        if (NIL != $g3175$.getDynamicValue(var149)) {
            final SubLObject var150 = module0339.f22757();
            if (NIL != inference_datastructures_inference_oc.f25514(var150) && NIL != inference_datastructures_inference_oc.f25599(var150) && (NIL == module0377.f26780(var61) || NIL != module0377.f26782(var61))) {
                final SubLObject var151 = module0364.f24725(var61);
                SubLObject var153;
                final SubLObject var152 = var153 = module0363.f24648(var151, var131);
                SubLObject var154 = (SubLObject)NIL;
                var154 = var153.first();
                while (NIL != var153) {
                    if (NIL == module0366.f24957(var154)) {
                        return var154;
                    }
                    var153 = var153.rest();
                    var154 = var153.first();
                }
            }
        }
        if (NIL != module0377.f26746(var61)) {
            return (SubLObject)NIL;
        }
        if (NIL != inference_datastructures_inference_oc.f25598(module0339.f22757())) {
            return (SubLObject)NIL;
        }
        final SubLObject var155 = module0364.f24725(var61);
        final SubLObject var156 = module0363.f24648(var155, var131);
        if (NIL != var156) {
            final SubLObject var157 = module0366.f24969(var61, var148);
            SubLObject var153 = var156;
            SubLObject var158 = (SubLObject)NIL;
            var158 = var153.first();
            while (NIL != var153) {
                if (NIL != f26248(var158, var61, var131, var148) || NIL != f26249(var158, var61, var131, var148) || NIL != module0366.f24991(var158, var155, var131, var157)) {
                    return var158;
                }
                var153 = var153.rest();
                var158 = var153.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26248(final SubLObject var67, final SubLObject var61, final SubLObject var131, final SubLObject var148) {
        return (SubLObject)makeBoolean(NIL != f26250(var67, var61, var131, var148) || NIL != f26251(var67, var61, var131, var148));
    }
    
    public static SubLObject f26250(final SubLObject var67, final SubLObject var61, final SubLObject var131, final SubLObject var148) {
        return (SubLObject)makeBoolean(NIL != module0381.f27099(var67) && NIL != f26150(var61) && NIL != module0035.f2201(module0366.f24938(var67), var148, Symbols.symbol_function((SubLObject)EQ)));
    }
    
    public static SubLObject f26251(final SubLObject var67, final SubLObject var61, final SubLObject var131, final SubLObject var148) {
        return (SubLObject)makeBoolean(NIL != module0380.f26985(var67) && NIL != module0380.f26955(var61) && NIL != module0035.f2201(module0366.f24938(var67), var148, Symbols.symbol_function((SubLObject)EQ)));
    }
    
    public static SubLObject f26249(final SubLObject var67, final SubLObject var61, final SubLObject var131, final SubLObject var148) {
        return (SubLObject)makeBoolean(NIL != module0378.f26897(var67) && NIL != f26154(var61) && NIL != f26252(var67, var61, var131, var148));
    }
    
    public static SubLObject f26252(final SubLObject var179, final SubLObject var180, final SubLObject var181, final SubLObject var182) {
        SubLObject var183 = (SubLObject)NIL;
        if (NIL != f26235(module0366.f24934(var179), var181) && NIL == var183) {
            SubLObject var184 = var182;
            SubLObject var185 = (SubLObject)NIL;
            var185 = var184.first();
            while (NIL == var183 && NIL != var184) {
                if (NIL != module0377.f26776(var185) && NIL == var183) {
                    SubLObject var163_185 = var182;
                    SubLObject var186 = (SubLObject)NIL;
                    var186 = var163_185.first();
                    while (NIL == var183 && NIL != var163_185) {
                        if (NIL != module0375.f26583(var186)) {
                            final SubLObject var187 = module0377.f26779(var185);
                            final SubLObject var188 = module0378.f26893(var179);
                            if (NIL != module0381.f27099(var188)) {
                                SubLObject var190;
                                final SubLObject var189 = var190 = module0366.f24938(var188);
                                SubLObject var191 = (SubLObject)NIL;
                                SubLObject var192 = (SubLObject)NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var190, var189, (SubLObject)$ic101$);
                                var191 = var190.first();
                                var190 = var190.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(var190, var189, (SubLObject)$ic101$);
                                var192 = var190.first();
                                var190 = var190.rest();
                                if (NIL == var190) {
                                    if ((var191.eql(var187) && var192.eql(var186)) || (var192.eql(var187) && var191.eql(var186))) {
                                        var183 = var179;
                                    }
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(var189, (SubLObject)$ic101$);
                                }
                            }
                        }
                        var163_185 = var163_185.rest();
                        var186 = var163_185.first();
                    }
                }
                var184 = var184.rest();
                var185 = var184.first();
            }
        }
        return var183;
    }
    
    public static SubLObject f26253(final SubLObject var193) {
        assert NIL != module0364.f24784(var193) : var193;
        if (NIL != module0376.f26613(var193)) {
            return module0376.f26703(var193);
        }
        return module0377.f26825(var193, (SubLObject)NIL, (SubLObject)NIL);
    }
    
    public static SubLObject f26241(final SubLObject var67) {
        final SubLObject var68 = module0366.f24964(var67);
        final SubLObject var69 = module0366.f24934(var67);
        final SubLObject var70 = module0233.f15362(var69, var68);
        return var70;
    }
    
    public static SubLObject f26254(final SubLObject var67) {
        return module0370.f25911(f26241(var67));
    }
    
    public static SubLObject f26255(final SubLObject var195, final SubLObject var196, final SubLObject var197) {
        final SubLThread var198 = SubLProcess.currentSubLThread();
        if (NIL == var196) {
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var198) && NIL != var197) {
                Errors.error((SubLObject)$ic103$);
            }
            return var195;
        }
        final SubLObject var199 = module0233.f15382(var197, var196);
        final SubLObject var200 = module0233.f15375(var199, var195);
        SubLObject var201 = ConsesLow.nconc(var199, var200);
        var201 = f26256(var201);
        return var201;
    }
    
    public static SubLObject f26257(final SubLObject var131) {
        final SubLObject var132 = Sort.sort(var131, (SubLObject)$ic104$, (SubLObject)$ic105$);
        return module0035.f2288(var132, Symbols.symbol_function((SubLObject)EQUAL));
    }
    
    public static SubLObject f26256(final SubLObject var131) {
        if (NIL != module0035.f1997(var131)) {
            return var131;
        }
        return f26257(var131);
    }
    
    public static SubLObject f26258(final SubLObject var131) {
        if (NIL != f26259(var131)) {
            return var131;
        }
        return f26256(conses_high.copy_list(var131));
    }
    
    public static SubLObject f26259(final SubLObject var131) {
        return f26260(var131, (SubLObject)MINUS_ONE_INTEGER);
    }
    
    public static SubLObject f26260(final SubLObject var131, final SubLObject var202) {
        if (NIL == var131) {
            return (SubLObject)T;
        }
        final SubLObject var203 = module0193.f12073(module0233.f15355(var131.first()));
        if (var203.numLE(var202)) {
            return (SubLObject)NIL;
        }
        return f26260(var131.rest(), var203);
    }
    
    public static SubLObject f26235(final SubLObject var204, final SubLObject var205) {
        return Equality.equal(var204, var205);
    }
    
    public static SubLObject f26261(final SubLObject var206) {
        final SubLThread var207 = SubLProcess.currentSubLThread();
        SubLObject var208 = (SubLObject)NIL;
        final SubLObject var209 = module0035.f2196(var206, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic105$));
        SubLObject var211;
        final SubLObject var210 = var211 = module0035.f2269(Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic105$), var209), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var212 = (SubLObject)NIL;
        var212 = var211.first();
        while (NIL != var211) {
            var207.resetMultipleValues();
            final SubLObject var213 = f26262(var206, var212);
            final SubLObject var214 = var207.secondMultipleValue();
            var207.resetMultipleValues();
            var207.resetMultipleValues();
            final SubLObject var215 = module0234.f15444(var213, var214, (SubLObject)T, (SubLObject)UNPROVIDED);
            final SubLObject var216 = var207.secondMultipleValue();
            var207.resetMultipleValues();
            if (NIL == module0233.f15393(var215)) {
                var208 = ConsesLow.append(var215, var208);
            }
            var211 = var211.rest();
            var212 = var211.first();
        }
        return var208;
    }
    
    public static SubLObject f26262(final SubLObject var206, final SubLObject var210) {
        SubLObject var211 = (SubLObject)NIL;
        SubLObject var212 = (SubLObject)NIL;
        SubLObject var213 = (SubLObject)NIL;
        SubLObject var214 = (SubLObject)NIL;
        SubLObject var215 = var206;
        SubLObject var216 = (SubLObject)NIL;
        var216 = var215.first();
        while (NIL != var215) {
            SubLObject var218;
            final SubLObject var217 = var218 = var216;
            SubLObject var219 = (SubLObject)NIL;
            SubLObject var220 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var218, var217, (SubLObject)$ic106$);
            var219 = var218.first();
            var218 = (var220 = var218.rest());
            if (var210.eql(var219)) {
                if (NIL == var213 && NIL == var214) {
                    var211 = var220;
                    var213 = (SubLObject)T;
                }
                else if (NIL == var214) {
                    var212 = var220;
                    var214 = (SubLObject)T;
                }
                else {
                    Errors.error((SubLObject)$ic107$, var210, var206);
                }
            }
            var215 = var215.rest();
            var216 = var215.first();
        }
        if (NIL != var213 && NIL != var214) {
            return Values.values(var211, var212);
        }
        Errors.error((SubLObject)$ic108$, var206, var210);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26263(final SubLObject var206) {
        assert NIL != module0233.f15349(var206) : var206;
        SubLObject var207 = var206;
        SubLObject var208 = (SubLObject)NIL;
        var208 = var207.first();
        while (NIL != var207) {
            if (NIL == f26264(var208)) {
                return (SubLObject)NIL;
            }
            var207 = var207.rest();
            var208 = var207.first();
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f26264(final SubLObject var217) {
        final SubLObject var218 = module0233.f15370(var217);
        return module0193.f12105(var218);
    }
    
    public static SubLObject f26265(final SubLObject var67) {
        final SubLThread var68 = SubLProcess.currentSubLThread();
        if ($g3176$.getDynamicValue(var68).numG($g3177$.getGlobalValue())) {
            f26237(var67, (SubLObject)$ic111$);
        }
        else {
            final SubLObject var69 = $g3176$.currentBinding(var68);
            try {
                $g3176$.bind(module0048.f_1X($g3176$.getDynamicValue(var68)), var68);
                final SubLObject var70 = module0366.f24956(var67);
                f26266(var67, var70);
            }
            finally {
                $g3176$.rebind(var69, var68);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26266(final SubLObject var67, final SubLObject var11) {
        final SubLObject var68 = module0363.f24530(var11);
        SubLObject var69;
        SubLObject var70;
        SubLObject var71;
        for (var69 = module0032.f1741(var68), var70 = (SubLObject)NIL, var70 = module0032.f1742(var69, var68); NIL == module0032.f1744(var69, var70); var70 = module0032.f1743(var70)) {
            var71 = module0032.f1745(var69, var70);
            if (NIL != module0032.f1746(var70, var71)) {
                f26267(var67, var71);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26267(final SubLObject var67, final SubLObject var223) {
        if (NIL != module0366.f24983(var67)) {
            final SubLObject var224 = module0364.f24721(var223);
            if (var224.eql((SubLObject)$ic112$)) {
                final SubLObject var225 = module0364.f24724(var223);
                f26268(var67, var225);
            }
            else {
                final SubLObject var226 = module0366.f24956(var67);
                SubLObject var227 = module0364.f24735(var223);
                SubLObject var228 = (SubLObject)NIL;
                var228 = var227.first();
                while (NIL != var227) {
                    if (NIL != module0339.f22743((SubLObject)NIL, var223, var228) && var226.eql(module0364.f24736(var228))) {
                        f26269(var67, var223, var228);
                    }
                    var227 = var227.rest();
                    var228 = var227.first();
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26269(final SubLObject var67, final SubLObject var223, final SubLObject var166) {
        if (NIL != f26270(var223, var166)) {
            final SubLObject var224 = module0364.f24737(var166);
            f26271(var67, var224, var223);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26271(final SubLObject var67, final SubLObject var197, final SubLObject var223) {
        assert NIL != module0366.f24916(var67) : var67;
        assert NIL != module0233.f15353(var197) : var197;
        final SubLObject var224 = module0364.f24721(var223);
        if (var224.eql((SubLObject)$ic65$)) {
            module0377.f26843(var67, var197, var223);
        }
        else if (var224.eql((SubLObject)$ic67$)) {
            module0379.f26951(var67, var197, var223);
        }
        else if (var224.eql((SubLObject)$ic51$)) {
            module0381.f27112(var67, var197, var223);
        }
        else if (var224.eql((SubLObject)$ic53$)) {
            module0382.f27221(var67, var197, var223);
        }
        else if (var224.eql((SubLObject)$ic50$)) {
            module0380.f26986(var67, var197, var223);
        }
        else if (var224.eql((SubLObject)$ic62$)) {
            module0375.f26581(var67, var197, var223);
        }
        else if (var224.eql((SubLObject)$ic114$)) {
            module0378.f26899(var67, var197, var223);
        }
        else if (var224.eql((SubLObject)$ic52$)) {
            module0383.f27252(var67, var197, var223);
        }
        else if (var224.eql((SubLObject)$ic115$)) {
            Errors.error((SubLObject)$ic116$);
        }
        else if (var224.eql((SubLObject)$ic112$)) {
            final SubLObject var225 = module0364.f24724(var223);
            f26268(var67, var225);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26272(final SubLObject var67, final SubLObject var175) {
        if (NIL != inference_datastructures_inference_oc.f25512(var175)) {
            f26273(var67);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26274(final SubLObject var67) {
        return (SubLObject)T;
    }
    
    public static SubLObject f26275() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g3178$.getDynamicValue(var1);
    }
    
    public static SubLObject f26273(final SubLObject var67) {
        final SubLThread var68 = SubLProcess.currentSubLThread();
        if (NIL == module0366.f24983(var67)) {
            return (SubLObject)NIL;
        }
        final SubLObject var69 = $g3178$.currentBinding(var68);
        try {
            $g3178$.bind((SubLObject)T, var68);
            SubLObject var70 = module0366.f24938(var67);
            SubLObject var71 = (SubLObject)NIL;
            var71 = var70.first();
            while (NIL != var70) {
                f26273(var71);
                var70 = var70.rest();
                var71 = var70.first();
            }
            if ((NIL != module0377.f26776(var67) && NIL != module0377.f26846(var67)) || (NIL != module0378.f26897(var67) && NIL != module0378.f26900(var67))) {
                f26276(var67);
            }
            if (NIL != ((NIL != module0532.f33186()) ? module0377.f26847(var67) : NIL)) {
                f26237(var67, (SubLObject)$ic117$);
            }
        }
        finally {
            $g3178$.rebind(var69, var68);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26276(final SubLObject var67) {
        return f26237(var67, (SubLObject)$ic118$);
    }
    
    public static SubLObject f26277(final SubLObject var175, final SubLObject var67) {
        final SubLObject var176 = inference_datastructures_inference_oc.f25474(var175);
        if (NIL != module0374.f26539(var176)) {
            return f26231(var67);
        }
        return f26278(var175, var67);
    }
    
    public static SubLObject f26279(final SubLObject var175, final SubLObject var67) {
        final SubLObject var176 = inference_datastructures_inference_oc.f25474(var175);
        SubLObject var177 = (SubLObject)NIL;
        SubLObject var178 = f26231(var67);
        SubLObject var179 = (SubLObject)NIL;
        var179 = var178.first();
        while (NIL != var178) {
            final SubLObject var180 = var179;
            if (NIL == conses_high.member(var180, var177, Symbols.symbol_function((SubLObject)EQ), Symbols.symbol_function((SubLObject)IDENTITY))) {
                var177 = (SubLObject)ConsesLow.cons(var180, var177);
            }
            var178 = var178.rest();
            var179 = var178.first();
        }
        if (NIL == module0374.f26539(var176)) {
            final SubLObject var181 = f26280(var175, var67);
            SubLObject var183;
            final SubLObject var182 = var183 = f26281(var67, var181);
            SubLObject var184 = (SubLObject)NIL;
            var184 = var183.first();
            while (NIL != var183) {
                final SubLObject var185 = var184;
                if (NIL == conses_high.member(var185, var177, Symbols.symbol_function((SubLObject)EQ), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var177 = (SubLObject)ConsesLow.cons(var185, var177);
                }
                var183 = var183.rest();
                var184 = var183.first();
            }
        }
        return Sequences.nreverse(var177);
    }
    
    public static SubLObject f26278(final SubLObject var175, final SubLObject var67) {
        final SubLThread var176 = SubLProcess.currentSubLThread();
        final SubLObject var177 = module0034.$g879$.getDynamicValue(var176);
        SubLObject var178 = (SubLObject)NIL;
        if (NIL == var177) {
            return f26279(var175, var67);
        }
        var178 = module0034.f1857(var177, (SubLObject)$ic119$, (SubLObject)UNPROVIDED);
        if (NIL == var178) {
            var178 = module0034.f1807(module0034.f1842(var177), (SubLObject)$ic119$, (SubLObject)TWO_INTEGER, (SubLObject)NIL, (SubLObject)EQ, (SubLObject)UNPROVIDED);
            module0034.f1860(var177, (SubLObject)$ic119$, var178);
        }
        final SubLObject var179 = module0034.f1782(var175, var67);
        final SubLObject var180 = module0034.f1814(var178, var179, (SubLObject)UNPROVIDED);
        if (var180 != $ic84$) {
            SubLObject var181 = var180;
            SubLObject var182 = (SubLObject)NIL;
            var182 = var181.first();
            while (NIL != var181) {
                SubLObject var183 = var182.first();
                final SubLObject var184 = conses_high.second(var182);
                if (var175.eql(var183.first())) {
                    var183 = var183.rest();
                    if (NIL != var183 && NIL == var183.rest() && var67.eql(var183.first())) {
                        return module0034.f1959(var184);
                    }
                }
                var181 = var181.rest();
                var182 = var181.first();
            }
        }
        final SubLObject var185 = Values.arg2(var176.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f26279(var175, var67)));
        module0034.f1836(var178, var179, var180, var185, (SubLObject)ConsesLow.list(var175, var67));
        return module0034.f1959(var185);
    }
    
    public static SubLObject f26231(final SubLObject var67) {
        SubLObject var68 = (SubLObject)NIL;
        if (NIL != module0366.f24974(var67)) {
            final SubLObject var69 = module0366.f24936(var67);
            if (NIL != module0361.f24151(var69)) {
                var68 = module0361.f24327(var69, var67);
            }
        }
        return var68;
    }
    
    public static SubLObject f26232(final SubLObject var67) {
        assert NIL != module0377.f26783(var67) : var67;
        SubLObject var68 = (SubLObject)NIL;
        final SubLObject var69 = module0377.f26785(var67);
        if (NIL == module0377.f26760(var69)) {
            final SubLObject var70 = f26282(var67);
            var68 = f26281(var67, var70);
        }
        return var68;
    }
    
    public static SubLObject f26280(final SubLObject var175, final SubLObject var67) {
        final SubLObject var176 = inference_datastructures_inference_oc.f25489(var175);
        final SubLObject var177 = inference_datastructures_inference_oc.f25474(var175);
        final SubLObject var178 = module0364.f24755(var177);
        final SubLObject var179 = module0233.f15382(var178, module0366.f24934(var67));
        final SubLObject var180 = module0233.f15362(var179, var176);
        return var180;
    }
    
    public static SubLObject f26282(final SubLObject var67) {
        if (NIL != module0377.f26776(var67)) {
            return f26283(var67);
        }
        if (NIL != module0378.f26897(var67)) {
            return f26284(var67);
        }
        return Errors.error((SubLObject)$ic121$, var67);
    }
    
    public static SubLObject f26283(final SubLObject var67) {
        final SubLObject var68 = module0366.f24937(var67);
        final SubLObject var69 = module0377.f26779(var67);
        final SubLObject var70 = (SubLObject)((NIL != var69) ? module0366.f24934(var69) : NIL);
        final SubLObject var71 = module0377.f26751(var68);
        final SubLObject var72 = module0233.f15362(var70, var71);
        return var72;
    }
    
    public static SubLObject f26284(final SubLObject var67) {
        final SubLObject var68 = module0378.f26894(var67);
        final SubLObject var69 = module0378.f26893(var67);
        final SubLObject var70 = (SubLObject)((NIL != var69) ? module0366.f24934(var69) : NIL);
        final SubLObject var71 = module0377.f26751(var68);
        final SubLObject var72 = module0233.f15362(var70, var71);
        return var72;
    }
    
    public static SubLObject f26281(final SubLObject var67, final SubLObject var233) {
        SubLObject var234 = (SubLObject)NIL;
        SubLObject var235 = module0366.f24938(var67);
        SubLObject var236 = (SubLObject)NIL;
        var236 = var235.first();
        while (NIL != var235) {
            var234 = f26285(var236, var233, var234);
            var235 = var235.rest();
            var236 = var235.first();
        }
        return Sequences.nreverse(var234);
    }
    
    public static SubLObject f26285(final SubLObject var67, final SubLObject var233, SubLObject var157) {
        if (NIL == module0035.f2169(var67, var157)) {
            SubLObject var234 = module0366.f24938(var67);
            SubLObject var235 = (SubLObject)NIL;
            var235 = var234.first();
            while (NIL != var234) {
                var157 = f26285(var235, var233, var157);
                var234 = var234.rest();
                var235 = var234.first();
            }
            if (NIL != f26286(var67, var233)) {
                var157 = (SubLObject)ConsesLow.cons(var67, var157);
            }
        }
        return var157;
    }
    
    public static SubLObject f26286(final SubLObject var67, final SubLObject var233) {
        SubLObject var235;
        final SubLObject var234 = var235 = f26241(var67);
        SubLObject var236 = (SubLObject)NIL;
        var236 = var235.first();
        while (NIL != var235) {
            SubLObject var237 = (SubLObject)ZERO_INTEGER;
            SubLObject var43_236 = module0232.f15306(var236);
            SubLObject var238 = (SubLObject)NIL;
            var238 = var43_236.first();
            while (NIL != var43_236) {
                final SubLObject var239 = (SubLObject)$ic28$;
                if (NIL == f26287(var238, var239, var233)) {
                    return (SubLObject)NIL;
                }
                var237 = Numbers.add(var237, (SubLObject)ONE_INTEGER);
                var43_236 = var43_236.rest();
                var238 = var43_236.first();
            }
            var237 = (SubLObject)ZERO_INTEGER;
            SubLObject var43_237 = module0232.f15308(var236);
            var238 = (SubLObject)NIL;
            var238 = var43_237.first();
            while (NIL != var43_237) {
                final SubLObject var239 = (SubLObject)$ic27$;
                if (NIL == f26287(var238, var239, var233)) {
                    return (SubLObject)NIL;
                }
                var237 = Numbers.add(var237, (SubLObject)ONE_INTEGER);
                var43_237 = var43_237.rest();
                var238 = var43_237.first();
            }
            var235 = var235.rest();
            var236 = var235.first();
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f26287(final SubLObject var238, final SubLObject var45, final SubLObject var233) {
        SubLObject var239 = var233;
        SubLObject var240 = (SubLObject)NIL;
        var240 = var239.first();
        while (NIL != var239) {
            if ($ic27$ == var45) {
                SubLObject var43_240 = module0232.f15308(var240);
                SubLObject var241 = (SubLObject)NIL;
                var241 = var43_240.first();
                while (NIL != var43_240) {
                    if (var238.equal(var241)) {
                        return (SubLObject)T;
                    }
                    var43_240 = var43_240.rest();
                    var241 = var43_240.first();
                }
            }
            else if ($ic28$ == var45) {
                SubLObject var43_241 = module0232.f15306(var240);
                SubLObject var241 = (SubLObject)NIL;
                var241 = var43_241.first();
                while (NIL != var43_241) {
                    if (var238.equal(var241)) {
                        return (SubLObject)T;
                    }
                    var43_241 = var43_241.rest();
                    var241 = var43_241.first();
                }
            }
            else {
                Errors.error((SubLObject)$ic122$, var45);
            }
            var239 = var239.rest();
            var240 = var239.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26288(final SubLObject var238, final SubLObject var45, final SubLObject var242) {
        SubLObject var243 = var242;
        SubLObject var244 = (SubLObject)NIL;
        var244 = var243.first();
        while (NIL != var243) {
            if ($ic27$ == var45) {
                SubLObject var43_243 = module0232.f15308(var244);
                SubLObject var245 = (SubLObject)NIL;
                var245 = var43_243.first();
                while (NIL != var43_243) {
                    if (var238.equal(var245)) {
                        return (SubLObject)T;
                    }
                    var43_243 = var43_243.rest();
                    var245 = var43_243.first();
                }
            }
            else if ($ic28$ == var45) {
                SubLObject var43_244 = module0232.f15306(var244);
                SubLObject var245 = (SubLObject)NIL;
                var245 = var43_244.first();
                while (NIL != var43_244) {
                    if (var238.equal(var245)) {
                        return (SubLObject)T;
                    }
                    var43_244 = var43_244.rest();
                    var245 = var43_244.first();
                }
            }
            else {
                Errors.error((SubLObject)$ic122$, var45);
            }
            var243 = var243.rest();
            var244 = var243.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26140(final SubLObject var6) {
        if (NIL != module0365.f24845(var6)) {
            final SubLObject var7 = module0365.f24850(var6);
            module0365.f24893(var6);
            module0367.f25238(module0365.f24850(var6));
            if (NIL != module0381.f27067(var6)) {
                final SubLObject var8 = module0381.f27095(var6);
                if (NIL != module0363.f24689(var8) && NIL != module0384.f27303(var8, (SubLObject)$ic25$, (SubLObject)UNPROVIDED)) {
                    f26210(var6);
                }
            }
            if (NIL != module0363.f24617(var7)) {
                if (NIL == module0363.f24681(var7) && NIL == module0363.f24688(var7)) {
                    f26289(var7, (SubLObject)$ic25$);
                }
                f26290(var7, (SubLObject)NIL, (SubLObject)$ic25$, (SubLObject)T);
                if (NIL != module0384.f27303(var7, (SubLObject)$ic25$, (SubLObject)UNPROVIDED)) {
                    f26120(var7, (SubLObject)NIL, (SubLObject)$ic25$, (SubLObject)T);
                }
            }
            final SubLObject var9 = var7;
            final SubLObject var10 = module0363.f24507(var9);
            final SubLObject var11 = module0361.f24123(var10);
            if (NIL == module0065.f4772(var11, (SubLObject)$ic26$)) {
                final SubLObject var24_245 = var11;
                if (NIL == module0065.f4775(var24_245, (SubLObject)$ic26$)) {
                    final SubLObject var12 = module0065.f4740(var24_245);
                    final SubLObject var13 = (SubLObject)NIL;
                    SubLObject var14;
                    SubLObject var15;
                    SubLObject var16;
                    SubLObject var17;
                    SubLObject var18;
                    SubLObject var19;
                    SubLObject var20;
                    SubLObject var21;
                    SubLObject var22;
                    for (var14 = Sequences.length(var12), var15 = (SubLObject)NIL, var15 = (SubLObject)ZERO_INTEGER; var15.numL(var14); var15 = Numbers.add(var15, (SubLObject)ONE_INTEGER)) {
                        var16 = ((NIL != var13) ? Numbers.subtract(var14, var15, (SubLObject)ONE_INTEGER) : var15);
                        var17 = Vectors.aref(var12, var16);
                        if (NIL == module0065.f4749(var17) || NIL == module0065.f4773((SubLObject)$ic26$)) {
                            if (NIL != module0065.f4749(var17)) {
                                var17 = (SubLObject)$ic26$;
                            }
                            if (NIL != module0363.f24547(var9, var17)) {
                                var18 = var17;
                                var19 = module0077.f5333(inference_datastructures_inference_oc.f25473(var18));
                                for (var20 = module0032.f1741(var19), var21 = (SubLObject)NIL, var21 = module0032.f1742(var20, var19); NIL == module0032.f1744(var20, var21); var21 = module0032.f1743(var21)) {
                                    var22 = module0032.f1745(var20, var21);
                                    if (NIL != module0032.f1746(var21, var22)) {
                                        module0387.f27470(var22, var6);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject var37_246 = var11;
                if (NIL == module0065.f4777(var37_246)) {
                    final SubLObject var23 = module0065.f4738(var37_246);
                    SubLObject var24 = (SubLObject)NIL;
                    SubLObject var25 = (SubLObject)NIL;
                    final Iterator var26 = Hashtables.getEntrySetIterator(var23);
                    try {
                        while (Hashtables.iteratorHasNext(var26)) {
                            final Map.Entry var27 = Hashtables.iteratorNextEntry(var26);
                            var24 = Hashtables.getEntryKey(var27);
                            var25 = Hashtables.getEntryValue(var27);
                            if (NIL != module0363.f24547(var9, var25)) {
                                final SubLObject var28 = var25;
                                final SubLObject var29 = module0077.f5333(inference_datastructures_inference_oc.f25473(var28));
                                SubLObject var30;
                                SubLObject var31;
                                SubLObject var32;
                                for (var30 = module0032.f1741(var29), var31 = (SubLObject)NIL, var31 = module0032.f1742(var30, var29); NIL == module0032.f1744(var30, var31); var31 = module0032.f1743(var31)) {
                                    var32 = module0032.f1745(var30, var31);
                                    if (NIL != module0032.f1746(var31, var32)) {
                                        module0387.f27470(var32, var6);
                                    }
                                }
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(var26);
                    }
                }
            }
        }
        return var6;
    }
    
    public static SubLObject f26291(final SubLObject var36, final SubLObject var6) {
        if (NIL != module0365.f24885(var6)) {
            f26292(var36, var6);
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26292(final SubLObject var36, final SubLObject var6) {
        final SubLObject var37 = module0365.f24850(var6);
        if (NIL != module0387.f27564(var36, var37)) {
            f26293(var37, var36);
            f26290(var37, (SubLObject)NIL, var36, (SubLObject)T);
            if (NIL != module0384.f27303(var37, var36, (SubLObject)UNPROVIDED)) {
                f26120(var37, (SubLObject)NIL, var36, (SubLObject)T);
            }
        }
        return var6;
    }
    
    public static SubLObject f26294(final SubLObject var11) {
        f26295(var11, (SubLObject)$ic123$, (SubLObject)NIL, (SubLObject)$ic25$);
        return var11;
    }
    
    public static SubLObject f26296(final SubLObject var36, final SubLObject var11) {
        return f26297(var36, var11);
    }
    
    public static SubLObject f26297(final SubLObject var36, final SubLObject var11) {
        final SubLObject var37 = module0387.f27471(var36, var11);
        if (NIL != var37) {
            module0367.f25098(var36, var11);
            final SubLObject var38 = module0367.f25037(var36);
            inference_datastructures_inference_oc.f25678(var38, var11);
            final SubLObject var39 = module0363.f24527(var11);
            SubLObject var40;
            SubLObject var41;
            SubLObject var42;
            for (var40 = module0032.f1741(var39), var41 = (SubLObject)NIL, var41 = module0032.f1742(var40, var39); NIL == module0032.f1744(var40, var41); var41 = module0032.f1743(var41)) {
                var42 = module0032.f1745(var40, var41);
                if (NIL != module0032.f1746(var41, var42)) {
                    f26298(var42, var38);
                    f26299(var42, var38);
                    module0386.f27424(var42, var38);
                    f26300(var42);
                }
            }
        }
        return var37;
    }
    
    public static SubLObject f26191(final SubLObject var11, final SubLObject var92) {
        if (NIL == module0363.f24681(var11)) {
            if (NIL != module0363.f24685(var11)) {
                f26115(var11);
            }
            if (NIL != module0367.f24997(var92)) {
                f26125(var11, var92);
                f26301(var11, var92);
                f26302(var11, var92);
                f26303(var11, var92);
                return module0367.f25144(var11, var92);
            }
        }
        return var11;
    }
    
    public static SubLObject f26118(final SubLObject var11) {
        final SubLObject var12 = module0363.f24506(var11);
        final SubLObject var13 = f26304(var12);
        f26295(var11, var13, (SubLObject)NIL, (SubLObject)$ic25$);
        final SubLObject var14 = module0363.f24507(var11);
        final SubLObject var15 = module0361.f24123(var14);
        if (NIL == module0065.f4772(var15, (SubLObject)$ic26$)) {
            final SubLObject var24_251 = var15;
            if (NIL == module0065.f4775(var24_251, (SubLObject)$ic26$)) {
                final SubLObject var16 = module0065.f4740(var24_251);
                final SubLObject var17 = (SubLObject)NIL;
                SubLObject var18;
                SubLObject var19;
                SubLObject var20;
                SubLObject var21;
                SubLObject var22;
                SubLObject var23;
                SubLObject var24;
                SubLObject var25;
                SubLObject var26;
                for (var18 = Sequences.length(var16), var19 = (SubLObject)NIL, var19 = (SubLObject)ZERO_INTEGER; var19.numL(var18); var19 = Numbers.add(var19, (SubLObject)ONE_INTEGER)) {
                    var20 = ((NIL != var17) ? Numbers.subtract(var18, var19, (SubLObject)ONE_INTEGER) : var19);
                    var21 = Vectors.aref(var16, var20);
                    if (NIL == module0065.f4749(var21) || NIL == module0065.f4773((SubLObject)$ic26$)) {
                        if (NIL != module0065.f4749(var21)) {
                            var21 = (SubLObject)$ic26$;
                        }
                        if (NIL != module0363.f24547(var11, var21)) {
                            var22 = var21;
                            var23 = module0077.f5333(inference_datastructures_inference_oc.f25473(var22));
                            for (var24 = module0032.f1741(var23), var25 = (SubLObject)NIL, var25 = module0032.f1742(var24, var23); NIL == module0032.f1744(var24, var25); var25 = module0032.f1743(var25)) {
                                var26 = module0032.f1745(var24, var25);
                                if (NIL != module0032.f1746(var25, var26)) {
                                    f26301(var11, var26);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject var37_252 = var15;
            if (NIL == module0065.f4777(var37_252)) {
                final SubLObject var27 = module0065.f4738(var37_252);
                SubLObject var28 = (SubLObject)NIL;
                SubLObject var29 = (SubLObject)NIL;
                final Iterator var30 = Hashtables.getEntrySetIterator(var27);
                try {
                    while (Hashtables.iteratorHasNext(var30)) {
                        final Map.Entry var31 = Hashtables.iteratorNextEntry(var30);
                        var28 = Hashtables.getEntryKey(var31);
                        var29 = Hashtables.getEntryValue(var31);
                        if (NIL != module0363.f24547(var11, var29)) {
                            final SubLObject var32 = var29;
                            final SubLObject var33 = module0077.f5333(inference_datastructures_inference_oc.f25473(var32));
                            SubLObject var34;
                            SubLObject var35;
                            SubLObject var36;
                            for (var34 = module0032.f1741(var33), var35 = (SubLObject)NIL, var35 = module0032.f1742(var34, var33); NIL == module0032.f1744(var34, var35); var35 = module0032.f1743(var35)) {
                                var36 = module0032.f1745(var34, var35);
                                if (NIL != module0032.f1746(var35, var36)) {
                                    f26301(var11, var36);
                                }
                            }
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var30);
                }
            }
        }
        if (NIL == module0363.f24617(var11)) {
            if (NIL == module0363.f24681(var11)) {
                f26305(var11);
            }
        }
        return var11;
    }
    
    public static SubLObject f26301(final SubLObject var11, final SubLObject var36) {
        if (NIL == module0363.f24685(var11) && NIL != module0367.f25149(var11, var36)) {
            final SubLObject var37 = module0367.f25142(var11, var36);
            final SubLObject var38 = f26304(var37);
            f26295(var11, var38, (SubLObject)NIL, var36);
        }
        return var11;
    }
    
    public static SubLObject f26305(final SubLObject var11) {
        final SubLObject var12 = module0363.f24506(var11);
        final SubLObject var13 = f26306(var12);
        f26295(var11, var13, (SubLObject)NIL, (SubLObject)$ic25$);
        final SubLObject var14 = module0363.f24507(var11);
        final SubLObject var15 = module0361.f24123(var14);
        if (NIL == module0065.f4772(var15, (SubLObject)$ic26$)) {
            final SubLObject var24_255 = var15;
            if (NIL == module0065.f4775(var24_255, (SubLObject)$ic26$)) {
                final SubLObject var16 = module0065.f4740(var24_255);
                final SubLObject var17 = (SubLObject)NIL;
                SubLObject var18;
                SubLObject var19;
                SubLObject var20;
                SubLObject var21;
                SubLObject var22;
                SubLObject var23;
                SubLObject var24;
                SubLObject var25;
                SubLObject var26;
                for (var18 = Sequences.length(var16), var19 = (SubLObject)NIL, var19 = (SubLObject)ZERO_INTEGER; var19.numL(var18); var19 = Numbers.add(var19, (SubLObject)ONE_INTEGER)) {
                    var20 = ((NIL != var17) ? Numbers.subtract(var18, var19, (SubLObject)ONE_INTEGER) : var19);
                    var21 = Vectors.aref(var16, var20);
                    if (NIL == module0065.f4749(var21) || NIL == module0065.f4773((SubLObject)$ic26$)) {
                        if (NIL != module0065.f4749(var21)) {
                            var21 = (SubLObject)$ic26$;
                        }
                        if (NIL != module0363.f24547(var11, var21)) {
                            var22 = var21;
                            var23 = module0077.f5333(inference_datastructures_inference_oc.f25473(var22));
                            for (var24 = module0032.f1741(var23), var25 = (SubLObject)NIL, var25 = module0032.f1742(var24, var23); NIL == module0032.f1744(var24, var25); var25 = module0032.f1743(var25)) {
                                var26 = module0032.f1745(var24, var25);
                                if (NIL != module0032.f1746(var25, var26)) {
                                    f26302(var11, var26);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject var37_256 = var15;
            if (NIL == module0065.f4777(var37_256)) {
                final SubLObject var27 = module0065.f4738(var37_256);
                SubLObject var28 = (SubLObject)NIL;
                SubLObject var29 = (SubLObject)NIL;
                final Iterator var30 = Hashtables.getEntrySetIterator(var27);
                try {
                    while (Hashtables.iteratorHasNext(var30)) {
                        final Map.Entry var31 = Hashtables.iteratorNextEntry(var30);
                        var28 = Hashtables.getEntryKey(var31);
                        var29 = Hashtables.getEntryValue(var31);
                        if (NIL != module0363.f24547(var11, var29)) {
                            final SubLObject var32 = var29;
                            final SubLObject var33 = module0077.f5333(inference_datastructures_inference_oc.f25473(var32));
                            SubLObject var34;
                            SubLObject var35;
                            SubLObject var36;
                            for (var34 = module0032.f1741(var33), var35 = (SubLObject)NIL, var35 = module0032.f1742(var34, var33); NIL == module0032.f1744(var34, var35); var35 = module0032.f1743(var35)) {
                                var36 = module0032.f1745(var34, var35);
                                if (NIL != module0032.f1746(var35, var36)) {
                                    f26302(var11, var36);
                                }
                            }
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var30);
                }
            }
        }
        return var11;
    }
    
    public static SubLObject f26302(final SubLObject var11, final SubLObject var36) {
        if (NIL != module0367.f25150(var11, var36)) {
            if (NIL == module0387.f27564(var36, var11) && NIL == module0367.f25154(var11, var36)) {
                f26307(var11, var36);
            }
            else {
                f26289(var11, var36);
            }
        }
        return var11;
    }
    
    public static SubLObject f26308(final SubLObject var11, final SubLObject var36) {
        final SubLObject var37 = module0367.f25142(var11, var36);
        final SubLObject var38 = f26309(var37);
        f26295(var11, var38, (SubLObject)NIL, var36);
        return var11;
    }
    
    public static SubLObject f26307(final SubLObject var11, final SubLObject var36) {
        final SubLObject var37 = module0367.f25142(var11, var36);
        final SubLObject var38 = f26306(var37);
        f26295(var11, var38, (SubLObject)NIL, var36);
        return var11;
    }
    
    public static SubLObject f26293(final SubLObject var11, final SubLObject var92) {
        assert NIL != f26190(var92) : var92;
        if (NIL != f26310(var11, var92)) {
            return f26289(var11, var92);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26289(final SubLObject var11, final SubLObject var92) {
        final SubLThread var93 = SubLProcess.currentSubLThread();
        if (NIL == module0367.f24997(var92) && NIL == Errors.$ignore_mustsP$.getDynamicValue(var93) && NIL == module0363.f24617(var11)) {
            Errors.error((SubLObject)$ic124$, var11);
        }
        final SubLObject var94 = f26311(var11, var92);
        final SubLObject var95 = f26312(var94);
        f26295(var11, var95, (SubLObject)NIL, var92);
        f26120(var11, (SubLObject)NIL, var92, (SubLObject)T);
        if (NIL != module0367.f24997(var92)) {
            inference_datastructures_inference_oc.f25819(module0367.f25037(var92), var11);
        }
        else {
            final SubLObject var96 = module0363.f24507(var11);
            final SubLObject var97 = module0361.f24123(var96);
            if (NIL == module0065.f4772(var97, (SubLObject)$ic26$)) {
                final SubLObject var24_257 = var97;
                if (NIL == module0065.f4775(var24_257, (SubLObject)$ic26$)) {
                    final SubLObject var98 = module0065.f4740(var24_257);
                    final SubLObject var99 = (SubLObject)NIL;
                    SubLObject var100;
                    SubLObject var101;
                    SubLObject var102;
                    SubLObject var103;
                    SubLObject var104;
                    SubLObject var105;
                    SubLObject var106;
                    SubLObject var107;
                    SubLObject var108;
                    for (var100 = Sequences.length(var98), var101 = (SubLObject)NIL, var101 = (SubLObject)ZERO_INTEGER; var101.numL(var100); var101 = Numbers.add(var101, (SubLObject)ONE_INTEGER)) {
                        var102 = ((NIL != var99) ? Numbers.subtract(var100, var101, (SubLObject)ONE_INTEGER) : var101);
                        var103 = Vectors.aref(var98, var102);
                        if (NIL == module0065.f4749(var103) || NIL == module0065.f4773((SubLObject)$ic26$)) {
                            if (NIL != module0065.f4749(var103)) {
                                var103 = (SubLObject)$ic26$;
                            }
                            if (NIL != module0363.f24547(var11, var103)) {
                                var104 = var103;
                                var105 = module0077.f5333(inference_datastructures_inference_oc.f25473(var104));
                                for (var106 = module0032.f1741(var105), var107 = (SubLObject)NIL, var107 = module0032.f1742(var106, var105); NIL == module0032.f1744(var106, var107); var107 = module0032.f1743(var107)) {
                                    var108 = module0032.f1745(var106, var107);
                                    if (NIL != module0032.f1746(var107, var108)) {
                                        f26293(var11, var108);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject var37_258 = var97;
                if (NIL == module0065.f4777(var37_258)) {
                    final SubLObject var109 = module0065.f4738(var37_258);
                    SubLObject var110 = (SubLObject)NIL;
                    SubLObject var111 = (SubLObject)NIL;
                    final Iterator var112 = Hashtables.getEntrySetIterator(var109);
                    try {
                        while (Hashtables.iteratorHasNext(var112)) {
                            final Map.Entry var113 = Hashtables.iteratorNextEntry(var112);
                            var110 = Hashtables.getEntryKey(var113);
                            var111 = Hashtables.getEntryValue(var113);
                            if (NIL != module0363.f24547(var11, var111)) {
                                final SubLObject var114 = var111;
                                final SubLObject var115 = module0077.f5333(inference_datastructures_inference_oc.f25473(var114));
                                SubLObject var116;
                                SubLObject var117;
                                SubLObject var118;
                                for (var116 = module0032.f1741(var115), var117 = (SubLObject)NIL, var117 = module0032.f1742(var116, var115); NIL == module0032.f1744(var116, var117); var117 = module0032.f1743(var117)) {
                                    var118 = module0032.f1745(var116, var117);
                                    if (NIL != module0032.f1746(var117, var118)) {
                                        f26293(var11, var118);
                                    }
                                }
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(var112);
                    }
                }
            }
        }
        return var95;
    }
    
    public static SubLObject f26313(final SubLObject var11, final SubLObject var92) {
        assert NIL != f26190(var92) : var92;
        if (NIL != f26314(var11, var92)) {
            return f26315(var11, var92);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26315(final SubLObject var11, final SubLObject var92) {
        final SubLObject var93 = f26311(var11, var92);
        final SubLObject var94 = f26316(var93);
        f26295(var11, var94, (SubLObject)NIL, var92);
        f26317(var11, var92);
        return var94;
    }
    
    public static SubLObject f26317(final SubLObject var11, final SubLObject var92) {
        f26120(var11, (SubLObject)NIL, var92, (SubLObject)T);
        f26318(var11, var92);
        if (NIL != module0367.f24997(var92)) {
            f26319(var92, var11);
        }
        else {
            SubLObject var93 = module0363.f24530(var11);
            SubLObject var94;
            SubLObject var95;
            SubLObject var96;
            SubLObject var97;
            SubLObject var33_260;
            SubLObject var34_261;
            SubLObject var35_262;
            SubLObject var98;
            for (var94 = module0032.f1741(var93), var95 = (SubLObject)NIL, var95 = module0032.f1742(var94, var93); NIL == module0032.f1744(var94, var95); var95 = module0032.f1743(var95)) {
                var96 = module0032.f1745(var94, var95);
                if (NIL != module0032.f1746(var95, var96) && NIL != module0364.f24748(var96, (SubLObject)$ic62$)) {
                    var97 = module0364.f24725(var96);
                    var33_260 = module0363.f24530(var97);
                    for (var34_261 = module0032.f1741(var33_260), var35_262 = (SubLObject)NIL, var35_262 = module0032.f1742(var34_261, var33_260); NIL == module0032.f1744(var34_261, var35_262); var35_262 = module0032.f1743(var35_262)) {
                        var98 = module0032.f1745(var34_261, var35_262);
                        if (NIL != module0032.f1746(var35_262, var98) && NIL != module0364.f24748(var98, (SubLObject)$ic51$)) {
                            module0381.f27122(var98, var96);
                        }
                    }
                }
            }
            if (NIL != module0384.f27303(var11, var92, (SubLObject)UNPROVIDED)) {
                var93 = module0363.f24530(var11);
                SubLObject var99;
                SubLObject var100;
                for (var94 = module0032.f1741(var93), var95 = (SubLObject)NIL, var95 = module0032.f1742(var94, var93); NIL == module0032.f1744(var94, var95); var95 = module0032.f1743(var95)) {
                    var99 = module0032.f1745(var94, var95);
                    if (NIL != module0032.f1746(var95, var99) && NIL != module0364.f24748(var99, (SubLObject)$ic51$) && NIL != module0364.f24759(var99)) {
                        var100 = module0381.f27034(var99);
                        if (NIL != var100) {
                            f26210(var100);
                        }
                    }
                }
            }
            final SubLObject var101 = module0363.f24507(var11);
            final SubLObject var102 = module0361.f24123(var101);
            if (NIL == module0065.f4772(var102, (SubLObject)$ic26$)) {
                final SubLObject var24_265 = var102;
                if (NIL == module0065.f4775(var24_265, (SubLObject)$ic26$)) {
                    final SubLObject var103 = module0065.f4740(var24_265);
                    final SubLObject var104 = (SubLObject)NIL;
                    SubLObject var105;
                    SubLObject var106;
                    SubLObject var107;
                    SubLObject var108;
                    SubLObject var109;
                    SubLObject var110;
                    SubLObject var111;
                    SubLObject var112;
                    SubLObject var113;
                    for (var105 = Sequences.length(var103), var106 = (SubLObject)NIL, var106 = (SubLObject)ZERO_INTEGER; var106.numL(var105); var106 = Numbers.add(var106, (SubLObject)ONE_INTEGER)) {
                        var107 = ((NIL != var104) ? Numbers.subtract(var105, var106, (SubLObject)ONE_INTEGER) : var106);
                        var108 = Vectors.aref(var103, var107);
                        if (NIL == module0065.f4749(var108) || NIL == module0065.f4773((SubLObject)$ic26$)) {
                            if (NIL != module0065.f4749(var108)) {
                                var108 = (SubLObject)$ic26$;
                            }
                            if (NIL != module0363.f24547(var11, var108)) {
                                var109 = var108;
                                var110 = module0077.f5333(inference_datastructures_inference_oc.f25473(var109));
                                for (var111 = module0032.f1741(var110), var112 = (SubLObject)NIL, var112 = module0032.f1742(var111, var110); NIL == module0032.f1744(var111, var112); var112 = module0032.f1743(var112)) {
                                    var113 = module0032.f1745(var111, var112);
                                    if (NIL != module0032.f1746(var112, var113)) {
                                        if (NIL != f26320(var11, var113)) {
                                            f26317(var11, var113);
                                        }
                                        else {
                                            f26313(var11, var113);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject var37_266 = var102;
                if (NIL == module0065.f4777(var37_266)) {
                    final SubLObject var114 = module0065.f4738(var37_266);
                    SubLObject var115 = (SubLObject)NIL;
                    SubLObject var116 = (SubLObject)NIL;
                    final Iterator var117 = Hashtables.getEntrySetIterator(var114);
                    try {
                        while (Hashtables.iteratorHasNext(var117)) {
                            final Map.Entry var118 = Hashtables.iteratorNextEntry(var117);
                            var115 = Hashtables.getEntryKey(var118);
                            var116 = Hashtables.getEntryValue(var118);
                            if (NIL != module0363.f24547(var11, var116)) {
                                final SubLObject var119 = var116;
                                final SubLObject var120 = module0077.f5333(inference_datastructures_inference_oc.f25473(var119));
                                SubLObject var121;
                                SubLObject var122;
                                SubLObject var123;
                                for (var121 = module0032.f1741(var120), var122 = (SubLObject)NIL, var122 = module0032.f1742(var121, var120); NIL == module0032.f1744(var121, var122); var122 = module0032.f1743(var122)) {
                                    var123 = module0032.f1745(var121, var122);
                                    if (NIL != module0032.f1746(var122, var123)) {
                                        if (NIL != f26320(var11, var123)) {
                                            f26317(var11, var123);
                                        }
                                        else {
                                            f26313(var11, var123);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(var117);
                    }
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26318(final SubLObject var11, final SubLObject var92) {
        final SubLObject var93 = module0363.f24530(var11);
        SubLObject var94;
        SubLObject var95;
        SubLObject var96;
        SubLObject var97;
        SubLObject var98;
        SubLObject var99;
        SubLObject var100;
        SubLObject var33_268;
        SubLObject var34_269;
        SubLObject var35_270;
        SubLObject var101;
        SubLObject var102;
        for (var94 = module0032.f1741(var93), var95 = (SubLObject)NIL, var95 = module0032.f1742(var94, var93); NIL == module0032.f1744(var94, var95); var95 = module0032.f1743(var95)) {
            var96 = module0032.f1745(var94, var95);
            if (NIL != module0032.f1746(var95, var96)) {
                var97 = var96;
                var98 = module0364.f24735(var97);
                var99 = (SubLObject)NIL;
                var99 = var98.first();
                while (NIL != var98) {
                    if (NIL != module0339.f22743((SubLObject)NIL, var97, var99) && var11.eql(module0364.f24736(var99))) {
                        var100 = module0364.f24725(var96);
                        if (NIL != var100 && (NIL == module0367.f24997(var92) || NIL != module0363.f24586(var100, var92))) {
                            f26290(var100, (SubLObject)NIL, var92, (SubLObject)T);
                            if (NIL != module0375.f26571(var96)) {
                                var33_268 = module0363.f24530(var100);
                                for (var34_269 = module0032.f1741(var33_268), var35_270 = (SubLObject)NIL, var35_270 = module0032.f1742(var34_269, var33_268); NIL == module0032.f1744(var34_269, var35_270); var35_270 = module0032.f1743(var35_270)) {
                                    var101 = module0032.f1745(var34_269, var35_270);
                                    if (NIL != module0032.f1746(var35_270, var101) && NIL != module0364.f24748(var101, (SubLObject)$ic51$) && NIL != module0364.f24759(var101)) {
                                        var102 = module0364.f24725(var101);
                                        f26290(var102, (SubLObject)NIL, var92, (SubLObject)T);
                                    }
                                }
                            }
                        }
                    }
                    var98 = var98.rest();
                    var99 = var98.first();
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26319(final SubLObject var92, final SubLObject var11) {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26321(final SubLObject var61) {
        final SubLObject var63;
        final SubLObject var62 = var63 = module0364.f24725(var61);
        final SubLObject var64 = module0363.f24507(var63);
        final SubLObject var65 = module0361.f24123(var64);
        if (NIL == module0065.f4772(var65, (SubLObject)$ic26$)) {
            final SubLObject var24_272 = var65;
            if (NIL == module0065.f4775(var24_272, (SubLObject)$ic26$)) {
                final SubLObject var66 = module0065.f4740(var24_272);
                final SubLObject var67 = (SubLObject)NIL;
                SubLObject var68;
                SubLObject var69;
                SubLObject var70;
                SubLObject var71;
                SubLObject var72;
                SubLObject var73;
                SubLObject var74;
                SubLObject var75;
                SubLObject var76;
                for (var68 = Sequences.length(var66), var69 = (SubLObject)NIL, var69 = (SubLObject)ZERO_INTEGER; var69.numL(var68); var69 = Numbers.add(var69, (SubLObject)ONE_INTEGER)) {
                    var70 = ((NIL != var67) ? Numbers.subtract(var68, var69, (SubLObject)ONE_INTEGER) : var69);
                    var71 = Vectors.aref(var66, var70);
                    if (NIL == module0065.f4749(var71) || NIL == module0065.f4773((SubLObject)$ic26$)) {
                        if (NIL != module0065.f4749(var71)) {
                            var71 = (SubLObject)$ic26$;
                        }
                        if (NIL != module0363.f24547(var63, var71)) {
                            var72 = var71;
                            var73 = module0077.f5333(inference_datastructures_inference_oc.f25473(var72));
                            for (var74 = module0032.f1741(var73), var75 = (SubLObject)NIL, var75 = module0032.f1742(var74, var73); NIL == module0032.f1744(var74, var75); var75 = module0032.f1743(var75)) {
                                var76 = module0032.f1745(var74, var75);
                                if (NIL != module0032.f1746(var75, var76)) {
                                    module0387.f27472(var76, var61);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject var37_273 = var65;
            if (NIL == module0065.f4777(var37_273)) {
                final SubLObject var77 = module0065.f4738(var37_273);
                SubLObject var78 = (SubLObject)NIL;
                SubLObject var79 = (SubLObject)NIL;
                final Iterator var80 = Hashtables.getEntrySetIterator(var77);
                try {
                    while (Hashtables.iteratorHasNext(var80)) {
                        final Map.Entry var81 = Hashtables.iteratorNextEntry(var80);
                        var78 = Hashtables.getEntryKey(var81);
                        var79 = Hashtables.getEntryValue(var81);
                        if (NIL != module0363.f24547(var63, var79)) {
                            final SubLObject var82 = var79;
                            final SubLObject var83 = module0077.f5333(inference_datastructures_inference_oc.f25473(var82));
                            SubLObject var84;
                            SubLObject var85;
                            SubLObject var86;
                            for (var84 = module0032.f1741(var83), var85 = (SubLObject)NIL, var85 = module0032.f1742(var84, var83); NIL == module0032.f1744(var84, var85); var85 = module0032.f1743(var85)) {
                                var86 = module0032.f1745(var84, var85);
                                if (NIL != module0032.f1746(var85, var86)) {
                                    module0387.f27472(var86, var61);
                                }
                            }
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var80);
                }
            }
        }
        return var61;
    }
    
    public static SubLObject f26322(final SubLObject var61) {
        final SubLThread var62 = SubLProcess.currentSubLThread();
        var62.resetMultipleValues();
        final SubLObject var63 = f26253(var61);
        final SubLObject var64 = var62.secondMultipleValue();
        var62.resetMultipleValues();
        if (NIL != var64) {
            f26265(var63);
        }
        return var61;
    }
    
    public static SubLObject f26190(final SubLObject var60) {
        return (SubLObject)makeBoolean(NIL != module0367.f24997(var60) || $ic25$ == var60);
    }
    
    public static SubLObject f26323(final SubLObject var60) {
        if ($ic25$ == var60) {
            return (SubLObject)MINUS_ONE_INTEGER;
        }
        return module0367.f25036(var60);
    }
    
    public static SubLObject f26324(final SubLObject var15, final SubLObject var276) {
        if (MINUS_ONE_INTEGER.eql(var276)) {
            return (SubLObject)$ic25$;
        }
        return module0361.f24203(var15, var276);
    }
    
    public static SubLObject f26325(final SubLObject var277, final SubLObject var276) {
        if (MINUS_ONE_INTEGER.eql(var276)) {
            return (SubLObject)$ic25$;
        }
        return module0361.f24204(var277, var276);
    }
    
    public static SubLObject f26326(final SubLObject var92) {
        return (SubLObject)makeBoolean($ic25$ == var92 || NIL != inference_datastructures_inference_oc.f25514(module0367.f25037(var92)));
    }
    
    public static SubLObject f26327(final SubLObject var11, final SubLObject var92) {
        if (NIL != module0367.f24997(var92)) {
            return module0367.f25154(var11, var92);
        }
        return module0363.f24681(var11);
    }
    
    public static SubLObject f26328(final SubLObject var11, final SubLObject var92) {
        if (NIL != module0367.f24997(var92)) {
            return module0367.f25155(var11, var92);
        }
        return module0363.f24682(var11);
    }
    
    public static SubLObject f26203(final SubLObject var11, final SubLObject var92) {
        return f26329(var11);
    }
    
    public static SubLObject f26330(final SubLObject var11, final SubLObject var92) {
        if (NIL != module0367.f24997(var92)) {
            return module0367.f25150(var11, var92);
        }
        return module0363.f24686(var11);
    }
    
    public static SubLObject f26310(final SubLObject var11, final SubLObject var92) {
        if (NIL != module0367.f24997(var92)) {
            return module0367.f25151(var11, var92);
        }
        return module0363.f24687(var11);
    }
    
    public static SubLObject f26314(final SubLObject var11, final SubLObject var92) {
        if (NIL != module0367.f24997(var92)) {
            return module0367.f25152(var11, var92);
        }
        return module0363.f24688(var11);
    }
    
    public static SubLObject f26320(final SubLObject var11, final SubLObject var92) {
        if (NIL != module0367.f24997(var92)) {
            return module0367.f25153(var11, var92);
        }
        return module0363.f24689(var11);
    }
    
    public static SubLObject f26331(final SubLObject var11, final SubLObject var92) {
        if (NIL != module0367.f24997(var92)) {
            return module0367.f25157(var11, var92);
        }
        return module0363.f24691(var11);
    }
    
    public static SubLObject f26332(final SubLObject var11, final SubLObject var92) {
        if (NIL != module0367.f24997(var92)) {
            return module0367.f25158(var11, var92);
        }
        return module0363.f24692(var11);
    }
    
    public static SubLObject f26333(final SubLObject var11, final SubLObject var92) {
        return f26320(var11, module0387.f27480(var92));
    }
    
    public static SubLObject f26334(final SubLObject var61) {
        final SubLThread var62 = SubLProcess.currentSubLThread();
        if (NIL == $g3179$.getDynamicValue(var62)) {
            f26335(var61);
            f26336(var61);
            module0386.f27423(var61);
            f26337(var61);
            f26338(var61);
            f26321(var61);
            f26339(var61);
            f26300(var61);
            return var61;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26339(final SubLObject var61) {
        if (NIL != module0364.f24784(var61)) {
            f26322(var61);
        }
        else {
            SubLObject var62 = module0364.f24735(var61);
            SubLObject var63 = (SubLObject)NIL;
            var63 = var62.first();
            while (NIL != var62) {
                if (NIL != module0339.f22743((SubLObject)NIL, var61, var63) && NIL != f26270(var61, var63)) {
                    SubLObject var43_278 = Sequences.nreverse(module0363.f24642(module0364.f24736(var63), (SubLObject)$ic99$));
                    SubLObject var64 = (SubLObject)NIL;
                    var64 = var43_278.first();
                    while (NIL != var43_278) {
                        f26271(var64, module0364.f24737(var63), var61);
                        var43_278 = var43_278.rest();
                        var64 = var43_278.first();
                    }
                }
                var62 = var62.rest();
                var63 = var62.first();
            }
        }
        return var61;
    }
    
    public static SubLObject f26340(final SubLObject var61, final SubLObject var279) {
        f26337(var61);
        f26338(var61);
        f26339(var61);
        f26300(var61);
        return var61;
    }
    
    public static SubLObject f26341(final SubLObject var61) {
        return f26342(var61, (SubLObject)ZERO_INTEGER);
    }
    
    public static SubLObject f26342(final SubLObject var61, final SubLObject var280) {
        module0364.f24776(var61, var280);
        final SubLObject var281 = module0364.f24758(var61, var280);
        f26340(var61, var281);
        return var61;
    }
    
    public static SubLObject f26343(final SubLObject var61, final SubLObject var225) {
        module0364.f24777(var61, var225);
        f26340(var61, var225);
        return var61;
    }
    
    public static SubLObject f26344(final SubLObject var61) {
        module0364.f24775(var61);
        SubLObject var62 = module0364.f24735(var61);
        SubLObject var63 = (SubLObject)NIL;
        var63 = var62.first();
        while (NIL != var62) {
            if (NIL != module0339.f22743((SubLObject)NIL, var61, var63)) {
                f26340(var61, var63);
            }
            var62 = var62.rest();
            var63 = var62.first();
        }
        return var61;
    }
    
    public static SubLObject f26345(final SubLObject var61) {
        final SubLThread var62 = SubLProcess.currentSubLThread();
        final SubLObject var63 = module0364.f24724(var61);
        f26346(var61);
        SubLObject var64 = module0364.f24735(var61);
        SubLObject var65 = (SubLObject)NIL;
        var65 = var64.first();
        while (NIL != var64) {
            if (NIL != module0339.f22743((SubLObject)NIL, var61, var65)) {
                final SubLObject var66 = module0364.f24736(var65);
                final SubLObject var67 = module0364.f24737(var65);
                module0363.f24672(var66, var63, (SubLObject)ZERO_INTEGER);
                if (NIL == module0363.$g3133$.getDynamicValue(var62)) {
                    module0363.f24673(var66, var63, (SubLObject)ZERO_INTEGER);
                }
                module0363.f24675(var66, var63);
                final SubLObject var68 = (SubLObject)$ic99$;
                SubLObject var69;
                for (var69 = module0066.f4838(module0363.f24537(var66)); NIL == module0066.f4841(var69); var69 = module0066.f4840(var69)) {
                    var62.resetMultipleValues();
                    final SubLObject var70 = module0066.f4839(var69);
                    final SubLObject var71 = var62.secondMultipleValue();
                    var62.resetMultipleValues();
                    SubLObject var43_282 = var71;
                    SubLObject var72 = (SubLObject)NIL;
                    var72 = var43_282.first();
                    while (NIL != var43_282) {
                        if (NIL != module0363.f24538(var72, var68)) {
                            f26268(var72, var63);
                        }
                        var43_282 = var43_282.rest();
                        var72 = var43_282.first();
                    }
                }
                module0066.f4842(var69);
                SubLObject var43_283 = module0408.f28424(var63);
                SubLObject var73 = (SubLObject)NIL;
                var73 = var43_283.first();
                while (NIL != var43_283) {
                    f26347(var73, var66);
                    var43_283 = var43_283.rest();
                    var73 = var43_283.first();
                }
                f26348(var63, var66);
            }
            var64 = var64.rest();
            var65 = var64.first();
        }
        module0374.f26537(var61);
        return var61;
    }
    
    public static SubLObject f26349(final SubLObject var61) {
        if (NIL == module0374.f26534(var61)) {
            f26345(var61);
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26268(final SubLObject var67, final SubLObject var175) {
        final SubLThread var176 = SubLProcess.currentSubLThread();
        if (NIL != $g3172$.getDynamicValue(var176) || NIL != f26350(var67)) {
            module0408.f28475(var175, var67);
            f26351(inference_datastructures_inference_oc.f25474(var175));
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26351(final SubLObject var226) {
        final SubLObject var227 = module0374.f26533(var226);
        final SubLObject var228 = f26352(var227, var226);
        if (NIL != var228) {
            f26353(var226);
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26352(final SubLObject var175, final SubLObject var226) {
        final SubLObject var227 = module0364.f24754(var226);
        final SubLObject var228 = module0364.f24736(var227);
        final SubLObject var229 = module0077.f5333(inference_datastructures_inference_oc.f25473(var175));
        SubLObject var230;
        SubLObject var231;
        SubLObject var232;
        for (var230 = module0032.f1741(var229), var231 = (SubLObject)NIL, var231 = module0032.f1742(var230, var229); NIL == module0032.f1744(var230, var231); var231 = module0032.f1743(var231)) {
            var232 = module0032.f1745(var230, var231);
            if (NIL != module0032.f1746(var231, var232) && NIL == module0384.f27292(var232, var228)) {
                return (SubLObject)NIL;
            }
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f26353(final SubLObject var226) {
        module0364.f24782(var226);
        inference_datastructures_inference_oc.f25478(module0374.f26533(var226));
        return var226;
    }
    
    public static SubLObject f26350(final SubLObject var67) {
        if ($ic85$ == module0361.f24160(module0366.f24936(var67))) {
            return (SubLObject)T;
        }
        return f26354(var67);
    }
    
    public static SubLObject f26354(final SubLObject var67) {
        final SubLObject var68 = f26215(var67);
        if (NIL == var68) {
            f26224(var67);
            return (SubLObject)NIL;
        }
        SubLObject var69 = module0366.f24938(var67);
        SubLObject var70 = (SubLObject)NIL;
        var70 = var69.first();
        while (NIL != var69) {
            if (NIL == f26354(var70)) {
                return (SubLObject)NIL;
            }
            var69 = var69.rest();
            var70 = var69.first();
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f26355(final SubLObject var287, final SubLObject var288) {
        if (NIL == module0004.f106(var287)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0004.f106(var288)) {
            return Numbers.numL(var287, var288);
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f26356(final SubLObject var287, final SubLObject var288) {
        if (NIL == module0004.f106(var287)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0004.f106(var288)) {
            return Numbers.numLE(var287, var288);
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f26335(final SubLObject var61) {
        final SubLObject var62 = module0361.f24123(module0364.f24722(var61));
        if (NIL == module0065.f4772(var62, (SubLObject)$ic26$)) {
            final SubLObject var24_289 = var62;
            if (NIL == module0065.f4775(var24_289, (SubLObject)$ic26$)) {
                final SubLObject var63 = module0065.f4740(var24_289);
                final SubLObject var64 = (SubLObject)NIL;
                SubLObject var65;
                SubLObject var66;
                SubLObject var67;
                SubLObject var68;
                for (var65 = Sequences.length(var63), var66 = (SubLObject)NIL, var66 = (SubLObject)ZERO_INTEGER; var66.numL(var65); var66 = Numbers.add(var66, (SubLObject)ONE_INTEGER)) {
                    var67 = ((NIL != var64) ? Numbers.subtract(var65, var66, (SubLObject)ONE_INTEGER) : var66);
                    var68 = Vectors.aref(var63, var67);
                    if (NIL == module0065.f4749(var68) || NIL == module0065.f4773((SubLObject)$ic26$)) {
                        if (NIL != module0065.f4749(var68)) {
                            var68 = (SubLObject)$ic26$;
                        }
                        f26298(var61, var68);
                    }
                }
            }
            final SubLObject var37_290 = var62;
            if (NIL == module0065.f4777(var37_290)) {
                final SubLObject var69 = module0065.f4738(var37_290);
                SubLObject var70 = (SubLObject)NIL;
                SubLObject var71 = (SubLObject)NIL;
                final Iterator var72 = Hashtables.getEntrySetIterator(var69);
                try {
                    while (Hashtables.iteratorHasNext(var72)) {
                        final Map.Entry var73 = Hashtables.iteratorNextEntry(var72);
                        var70 = Hashtables.getEntryKey(var73);
                        var71 = Hashtables.getEntryValue(var73);
                        f26298(var61, var71);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var72);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26298(final SubLObject var61, final SubLObject var175) {
        final SubLObject var176 = module0364.f24725(var61);
        final SubLObject var177 = module0363.f24655(var176, var175);
        if (NIL != module0004.f106(var177)) {
            SubLObject var178 = module0364.f24751(var61);
            if (ONE_INTEGER.numE(var178) && NIL != module0381.f27029(var61)) {
                var178 = (SubLObject)TWO_INTEGER;
            }
            if (var178.isPositive()) {
                final SubLObject var179 = (SubLObject)((NIL != f26175(var61)) ? ONE_INTEGER : ZERO_INTEGER);
                final SubLObject var180 = module0048.f_1_(var178);
                final SubLObject var181 = Numbers.add(var179, var180);
                final SubLObject var182 = Numbers.add(var177, var181);
                SubLObject var183 = module0364.f24735(var61);
                SubLObject var184 = (SubLObject)NIL;
                var184 = var183.first();
                while (NIL != var183) {
                    if (NIL != module0339.f22743((SubLObject)NIL, var61, var184)) {
                        final SubLObject var185 = module0364.f24736(var184);
                        final SubLObject var186 = module0364.f24737(var184);
                        final SubLObject var187 = module0363.f24655(var185, var175);
                        if (NIL != f26357(var182, var187)) {
                            module0363.f24672(var185, var175, var182);
                            final SubLObject var188 = var185;
                            final SubLObject var189 = module0363.f24507(var188);
                            final SubLObject var190 = module0361.f24123(var189);
                            if (NIL == module0065.f4772(var190, (SubLObject)$ic26$)) {
                                final SubLObject var24_298 = var190;
                                if (NIL == module0065.f4775(var24_298, (SubLObject)$ic26$)) {
                                    final SubLObject var191 = module0065.f4740(var24_298);
                                    final SubLObject var192 = (SubLObject)NIL;
                                    SubLObject var193;
                                    SubLObject var194;
                                    SubLObject var195;
                                    SubLObject var31_299;
                                    SubLObject var196;
                                    SubLObject var197;
                                    SubLObject var198;
                                    SubLObject var199;
                                    SubLObject var200;
                                    for (var193 = Sequences.length(var191), var194 = (SubLObject)NIL, var194 = (SubLObject)ZERO_INTEGER; var194.numL(var193); var194 = Numbers.add(var194, (SubLObject)ONE_INTEGER)) {
                                        var195 = ((NIL != var192) ? Numbers.subtract(var193, var194, (SubLObject)ONE_INTEGER) : var194);
                                        var31_299 = Vectors.aref(var191, var195);
                                        if (NIL == module0065.f4749(var31_299) || NIL == module0065.f4773((SubLObject)$ic26$)) {
                                            if (NIL != module0065.f4749(var31_299)) {
                                                var31_299 = (SubLObject)$ic26$;
                                            }
                                            if (NIL != module0363.f24547(var188, var31_299)) {
                                                var196 = var31_299;
                                                var197 = module0077.f5333(inference_datastructures_inference_oc.f25473(var196));
                                                for (var198 = module0032.f1741(var197), var199 = (SubLObject)NIL, var199 = module0032.f1742(var198, var197); NIL == module0032.f1744(var198, var199); var199 = module0032.f1743(var199)) {
                                                    var200 = module0032.f1745(var198, var199);
                                                    if (NIL != module0032.f1746(var199, var200)) {
                                                        module0367.f25107(var185, var200);
                                                        module0367.f25179(var185, var200);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                final SubLObject var37_300 = var190;
                                if (NIL == module0065.f4777(var37_300)) {
                                    final SubLObject var201 = module0065.f4738(var37_300);
                                    SubLObject var202 = (SubLObject)NIL;
                                    SubLObject var31_300 = (SubLObject)NIL;
                                    final Iterator var203 = Hashtables.getEntrySetIterator(var201);
                                    try {
                                        while (Hashtables.iteratorHasNext(var203)) {
                                            final Map.Entry var204 = Hashtables.iteratorNextEntry(var203);
                                            var202 = Hashtables.getEntryKey(var204);
                                            var31_300 = Hashtables.getEntryValue(var204);
                                            if (NIL != module0363.f24547(var188, var31_300)) {
                                                final SubLObject var205 = var31_300;
                                                final SubLObject var206 = module0077.f5333(inference_datastructures_inference_oc.f25473(var205));
                                                SubLObject var207;
                                                SubLObject var208;
                                                SubLObject var209;
                                                for (var207 = module0032.f1741(var206), var208 = (SubLObject)NIL, var208 = module0032.f1742(var207, var206); NIL == module0032.f1744(var207, var208); var208 = module0032.f1743(var208)) {
                                                    var209 = module0032.f1745(var207, var208);
                                                    if (NIL != module0032.f1746(var208, var209)) {
                                                        module0367.f25107(var185, var209);
                                                        module0367.f25179(var185, var209);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    finally {
                                        Hashtables.releaseEntrySetIterator(var203);
                                    }
                                }
                            }
                            final SubLObject var210 = module0363.f24527(var185);
                            SubLObject var211;
                            SubLObject var212;
                            SubLObject var213;
                            for (var211 = module0032.f1741(var210), var212 = (SubLObject)NIL, var212 = module0032.f1742(var211, var210); NIL == module0032.f1744(var211, var212); var212 = module0032.f1743(var212)) {
                                var213 = module0032.f1745(var211, var212);
                                if (NIL != module0032.f1746(var212, var213)) {
                                    f26298(var213, var175);
                                }
                            }
                        }
                    }
                    var183 = var183.rest();
                    var184 = var183.first();
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26357(final SubLObject var287, final SubLObject var288) {
        return f26355(var287, var288);
    }
    
    public static SubLObject f26358(final SubLObject var175, final SubLObject var11) {
        final SubLObject var176 = inference_datastructures_inference_oc.f25522(var175);
        if (NIL != var176) {
            final SubLObject var177 = module0363.f24655(var11, var175);
            if (var177.isNumber() && NIL == f26357(var177, var176)) {
                return (SubLObject)NIL;
            }
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f26336(final SubLObject var61) {
        final SubLThread var62 = SubLProcess.currentSubLThread();
        if (NIL != module0363.$g3133$.getDynamicValue(var62)) {
            return (SubLObject)NIL;
        }
        final SubLObject var63 = module0361.f24123(module0364.f24722(var61));
        if (NIL == module0065.f4772(var63, (SubLObject)$ic26$)) {
            final SubLObject var24_304 = var63;
            if (NIL == module0065.f4775(var24_304, (SubLObject)$ic26$)) {
                final SubLObject var64 = module0065.f4740(var24_304);
                final SubLObject var65 = (SubLObject)NIL;
                SubLObject var66;
                SubLObject var67;
                SubLObject var68;
                SubLObject var69;
                for (var66 = Sequences.length(var64), var67 = (SubLObject)NIL, var67 = (SubLObject)ZERO_INTEGER; var67.numL(var66); var67 = Numbers.add(var67, (SubLObject)ONE_INTEGER)) {
                    var68 = ((NIL != var65) ? Numbers.subtract(var66, var67, (SubLObject)ONE_INTEGER) : var67);
                    var69 = Vectors.aref(var64, var68);
                    if (NIL == module0065.f4749(var69) || NIL == module0065.f4773((SubLObject)$ic26$)) {
                        if (NIL != module0065.f4749(var69)) {
                            var69 = (SubLObject)$ic26$;
                        }
                        f26299(var61, var69);
                    }
                }
            }
            final SubLObject var37_305 = var63;
            if (NIL == module0065.f4777(var37_305)) {
                final SubLObject var70 = module0065.f4738(var37_305);
                SubLObject var71 = (SubLObject)NIL;
                SubLObject var72 = (SubLObject)NIL;
                final Iterator var73 = Hashtables.getEntrySetIterator(var70);
                try {
                    while (Hashtables.iteratorHasNext(var73)) {
                        final Map.Entry var74 = Hashtables.iteratorNextEntry(var73);
                        var71 = Hashtables.getEntryKey(var74);
                        var72 = Hashtables.getEntryValue(var74);
                        f26299(var61, var72);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var73);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26299(final SubLObject var61, final SubLObject var175) {
        final SubLThread var176 = SubLProcess.currentSubLThread();
        if (NIL != module0363.$g3133$.getDynamicValue(var176)) {
            return (SubLObject)NIL;
        }
        final SubLObject var177 = module0364.f24725(var61);
        final SubLObject var178 = module0363.f24657(var177, var175);
        if (NIL != module0004.f106(var178) && NIL != module0364.f24749(var61)) {
            final SubLObject var179 = f26359(var61, var175);
            if (NIL != module0004.f106(var179)) {
                final SubLObject var180 = Numbers.add(var178, var179);
                SubLObject var181 = module0364.f24735(var61);
                SubLObject var182 = (SubLObject)NIL;
                var182 = var181.first();
                while (NIL != var181) {
                    if (NIL != module0339.f22743((SubLObject)NIL, var61, var182)) {
                        final SubLObject var183 = module0364.f24736(var182);
                        final SubLObject var184 = module0364.f24737(var182);
                        final SubLObject var185 = module0363.f24657(var183, var175);
                        if (NIL != f26360(var180, var185)) {
                            module0363.f24673(var183, var175, var180);
                            final SubLObject var186 = module0363.f24527(var183);
                            SubLObject var187;
                            SubLObject var188;
                            SubLObject var189;
                            for (var187 = module0032.f1741(var186), var188 = (SubLObject)NIL, var188 = module0032.f1742(var187, var186); NIL == module0032.f1744(var187, var188); var188 = module0032.f1743(var188)) {
                                var189 = module0032.f1745(var187, var188);
                                if (NIL != module0032.f1746(var188, var189)) {
                                    f26299(var189, var175);
                                }
                            }
                            if (NIL != module0377.f26746(var61)) {
                                final SubLObject var259_307 = module0364.f24725(var61);
                                final SubLObject var190 = module0363.f24530(var259_307);
                                SubLObject var191;
                                SubLObject var192;
                                SubLObject var193;
                                SubLObject var309_310;
                                SubLObject var194;
                                SubLObject var33_312;
                                SubLObject var34_313;
                                SubLObject var35_314;
                                SubLObject var195;
                                for (var191 = module0032.f1741(var190), var192 = (SubLObject)NIL, var192 = module0032.f1742(var191, var190); NIL == module0032.f1744(var191, var192); var192 = module0032.f1743(var192)) {
                                    var193 = module0032.f1745(var191, var192);
                                    if (NIL != module0032.f1746(var192, var193) && NIL != module0364.f24748(var193, (SubLObject)$ic51$)) {
                                        var309_310 = var193;
                                        var194 = module0364.f24725(var309_310);
                                        var33_312 = module0363.f24527(var194);
                                        for (var34_313 = module0032.f1741(var33_312), var35_314 = (SubLObject)NIL, var35_314 = module0032.f1742(var34_313, var33_312); NIL == module0032.f1744(var34_313, var35_314); var35_314 = module0032.f1743(var35_314)) {
                                            var195 = module0032.f1745(var34_313, var35_314);
                                            if (NIL != module0032.f1746(var35_314, var195) && NIL != module0364.f24748(var195, (SubLObject)$ic114$) && NIL != module0378.f26866(var195, var309_310) && NIL != module0378.f26868(var195, var61)) {
                                                f26299(var195, var175);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    var181 = var181.rest();
                    var182 = var181.first();
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26361(final SubLObject var11, final SubLObject var175) {
        final SubLObject var176 = inference_datastructures_inference_oc.f25606(var175);
        if (NIL != module0390.f27709(var176)) {
            final SubLObject var177 = module0390.f27716(var176);
            module0367.f25107(var11, var177);
            module0367.f25179(var11, var177);
            SubLObject var178 = module0363.f24517(var11);
            SubLObject var179 = (SubLObject)NIL;
            var179 = var178.first();
            while (NIL != var178) {
                if (NIL != module0363.f24524(var179, (SubLObject)$ic65$)) {
                    module0367.f25230(var179, var177);
                    module0367.f25233(var179, var177);
                }
                var178 = var178.rest();
                var179 = var178.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26360(final SubLObject var287, final SubLObject var288) {
        return f26355(var287, var288);
    }
    
    public static SubLObject f26362(final SubLObject var287, final SubLObject var288) {
        return f26356(var287, var288);
    }
    
    public static SubLObject f26363(final SubLObject var175, final SubLObject var11) {
        final SubLObject var176 = inference_datastructures_inference_oc.f25523(var175);
        if (NIL != var176) {
            final SubLObject var177 = module0363.f24657(var11, var175);
            if (var177.isNumber() && NIL == f26360(var177, var176)) {
                return (SubLObject)NIL;
            }
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f26364(final SubLObject var175, final SubLObject var11) {
        return f26363(var175, var11);
    }
    
    public static SubLObject f26365(final SubLObject var175, final SubLObject var63) {
        final SubLObject var176 = module0365.f24850(var63);
        if (NIL == f26364(var175, var176)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0382.f27206(var63)) {
            return (SubLObject)NIL;
        }
        final SubLObject var177 = inference_datastructures_inference_oc.f25523(var175);
        if (NIL == var177) {
            return (SubLObject)T;
        }
        if (var177.isZero()) {
            return (SubLObject)NIL;
        }
        final SubLObject var178 = module0386.f27419(var63, var175);
        if (!var178.isNumber()) {
            return (SubLObject)T;
        }
        return f26360(var178, var177);
    }
    
    public static SubLObject f26359(final SubLObject var61, final SubLObject var175) {
        final SubLThread var176 = SubLProcess.currentSubLThread();
        if (NIL != module0377.f26746(var61)) {
            return (SubLObject)ONE_INTEGER;
        }
        if (NIL == module0378.f26860(var61)) {
            return (SubLObject)ZERO_INTEGER;
        }
        if ($ic125$ == module0363.$g3132$.getDynamicValue(var176)) {
            return (SubLObject)ONE_INTEGER;
        }
        final SubLObject var177 = module0363.f24657(module0364.f24725(var61), var175);
        final SubLObject var178 = module0378.f26873(var61);
        final SubLObject var179 = module0363.f24657(module0364.f24725(var178), var175);
        if (NIL == module0004.f106(var179)) {
            return (SubLObject)$ic126$;
        }
        if (var179.numL(var177)) {
            return (SubLObject)ZERO_INTEGER;
        }
        return Numbers.subtract(module0048.f_1X(var179), var177);
    }
    
    public static SubLObject f26366(final SubLObject var11, final SubLObject var175) {
        final SubLThread var176 = SubLProcess.currentSubLThread();
        SubLObject var177 = (SubLObject)NIL;
        final SubLObject var178 = module0363.$g3132$.currentBinding(var176);
        try {
            module0363.$g3132$.bind((SubLObject)$ic125$, var176);
            var177 = module0004.f105(module0363.f24657(var11, var175));
        }
        finally {
            module0363.$g3132$.rebind(var178, var176);
        }
        return var177;
    }
    
    public static SubLObject f26337(final SubLObject var61) {
        final SubLObject var63;
        final SubLObject var62 = var63 = module0364.f24725(var61);
        final SubLObject var64 = module0363.f24507(var63);
        final SubLObject var65 = module0361.f24123(var64);
        if (NIL == module0065.f4772(var65, (SubLObject)$ic26$)) {
            final SubLObject var24_321 = var65;
            if (NIL == module0065.f4775(var24_321, (SubLObject)$ic26$)) {
                final SubLObject var66 = module0065.f4740(var24_321);
                final SubLObject var67 = (SubLObject)NIL;
                SubLObject var68;
                SubLObject var69;
                SubLObject var70;
                SubLObject var71;
                SubLObject var72;
                SubLObject var73;
                SubLObject var74;
                SubLObject var75;
                SubLObject var76;
                SubLObject var77;
                SubLObject var78;
                SubLObject var79;
                for (var68 = Sequences.length(var66), var69 = (SubLObject)NIL, var69 = (SubLObject)ZERO_INTEGER; var69.numL(var68); var69 = Numbers.add(var69, (SubLObject)ONE_INTEGER)) {
                    var70 = ((NIL != var67) ? Numbers.subtract(var68, var69, (SubLObject)ONE_INTEGER) : var69);
                    var71 = Vectors.aref(var66, var70);
                    if (NIL == module0065.f4749(var71) || NIL == module0065.f4773((SubLObject)$ic26$)) {
                        if (NIL != module0065.f4749(var71)) {
                            var71 = (SubLObject)$ic26$;
                        }
                        if (NIL != module0363.f24547(var63, var71)) {
                            var72 = var71;
                            var73 = module0077.f5333(inference_datastructures_inference_oc.f25473(var72));
                            for (var74 = module0032.f1741(var73), var75 = (SubLObject)NIL, var75 = module0032.f1742(var74, var73); NIL == module0032.f1744(var74, var75); var75 = module0032.f1743(var75)) {
                                var76 = module0032.f1745(var74, var75);
                                if (NIL != module0032.f1746(var75, var76)) {
                                    var77 = module0364.f24735(var61);
                                    var78 = (SubLObject)NIL;
                                    var78 = var77.first();
                                    while (NIL != var77) {
                                        if (NIL != module0339.f22743((SubLObject)NIL, var61, var78) && NIL != f26367(var61, var78)) {
                                            var79 = module0364.f24736(var78);
                                            f26347(var76, var79);
                                        }
                                        var77 = var77.rest();
                                        var78 = var77.first();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject var37_322 = var65;
            if (NIL == module0065.f4777(var37_322)) {
                final SubLObject var80 = module0065.f4738(var37_322);
                SubLObject var81 = (SubLObject)NIL;
                SubLObject var82 = (SubLObject)NIL;
                final Iterator var83 = Hashtables.getEntrySetIterator(var80);
                try {
                    while (Hashtables.iteratorHasNext(var83)) {
                        final Map.Entry var84 = Hashtables.iteratorNextEntry(var83);
                        var81 = Hashtables.getEntryKey(var84);
                        var82 = Hashtables.getEntryValue(var84);
                        if (NIL != module0363.f24547(var63, var82)) {
                            final SubLObject var85 = var82;
                            final SubLObject var86 = module0077.f5333(inference_datastructures_inference_oc.f25473(var85));
                            SubLObject var87;
                            SubLObject var88;
                            SubLObject var89;
                            SubLObject var90;
                            SubLObject var91;
                            SubLObject var92;
                            for (var87 = module0032.f1741(var86), var88 = (SubLObject)NIL, var88 = module0032.f1742(var87, var86); NIL == module0032.f1744(var87, var88); var88 = module0032.f1743(var88)) {
                                var89 = module0032.f1745(var87, var88);
                                if (NIL != module0032.f1746(var88, var89)) {
                                    var90 = module0364.f24735(var61);
                                    var91 = (SubLObject)NIL;
                                    var91 = var90.first();
                                    while (NIL != var90) {
                                        if (NIL != module0339.f22743((SubLObject)NIL, var61, var91) && NIL != f26367(var61, var91)) {
                                            var92 = module0364.f24736(var91);
                                            f26347(var89, var92);
                                        }
                                        var90 = var90.rest();
                                        var91 = var90.first();
                                    }
                                }
                            }
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var83);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26347(final SubLObject var36, final SubLObject var11) {
        if (NIL == module0367.f25082(var11, var36) && NIL != f26297(var36, var11)) {
            final SubLObject var37 = module0363.f24527(var11);
            SubLObject var38;
            SubLObject var39;
            SubLObject var40;
            for (var38 = module0032.f1741(var37), var39 = (SubLObject)NIL, var39 = module0032.f1742(var38, var37); NIL == module0032.f1744(var38, var39); var39 = module0032.f1743(var39)) {
                var40 = module0032.f1745(var38, var39);
                if (NIL != module0032.f1746(var39, var40)) {
                    f26337(var40);
                }
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26367(final SubLObject var61, final SubLObject var225) {
        return module0364.f24762(var61, var225);
    }
    
    public static SubLObject f26338(final SubLObject var61) {
        final SubLObject var62 = module0364.f24725(var61);
        SubLObject var63 = module0364.f24735(var61);
        SubLObject var64 = (SubLObject)NIL;
        var64 = var63.first();
        while (NIL != var63) {
            if (NIL != module0339.f22743((SubLObject)NIL, var61, var64) && NIL != f26368(var61, var64)) {
                final SubLObject var65 = module0364.f24736(var64);
                f26369(var62, var65);
            }
            var63 = var63.rest();
            var64 = var63.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26369(final SubLObject var11, final SubLObject var53) {
        final SubLObject var54 = module0363.f24507(var11);
        final SubLObject var55 = module0361.f24123(var54);
        if (NIL == module0065.f4772(var55, (SubLObject)$ic26$)) {
            final SubLObject var24_323 = var55;
            if (NIL == module0065.f4775(var24_323, (SubLObject)$ic26$)) {
                final SubLObject var56 = module0065.f4740(var24_323);
                final SubLObject var57 = (SubLObject)NIL;
                SubLObject var58;
                SubLObject var59;
                SubLObject var60;
                SubLObject var61;
                for (var58 = Sequences.length(var56), var59 = (SubLObject)NIL, var59 = (SubLObject)ZERO_INTEGER; var59.numL(var58); var59 = Numbers.add(var59, (SubLObject)ONE_INTEGER)) {
                    var60 = ((NIL != var57) ? Numbers.subtract(var58, var59, (SubLObject)ONE_INTEGER) : var59);
                    var61 = Vectors.aref(var56, var60);
                    if (NIL == module0065.f4749(var61) || NIL == module0065.f4773((SubLObject)$ic26$)) {
                        if (NIL != module0065.f4749(var61)) {
                            var61 = (SubLObject)$ic26$;
                        }
                        if (NIL != module0363.f24547(var11, var61)) {
                            f26348(var61, var53);
                        }
                    }
                }
            }
            final SubLObject var37_324 = var55;
            if (NIL == module0065.f4777(var37_324)) {
                final SubLObject var62 = module0065.f4738(var37_324);
                SubLObject var63 = (SubLObject)NIL;
                SubLObject var64 = (SubLObject)NIL;
                final Iterator var65 = Hashtables.getEntrySetIterator(var62);
                try {
                    while (Hashtables.iteratorHasNext(var65)) {
                        final Map.Entry var66 = Hashtables.iteratorNextEntry(var65);
                        var63 = Hashtables.getEntryKey(var66);
                        var64 = Hashtables.getEntryValue(var66);
                        if (NIL != module0363.f24547(var11, var64)) {
                            f26348(var64, var53);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var65);
                }
            }
        }
        return var11;
    }
    
    public static SubLObject f26348(final SubLObject var175, final SubLObject var11) {
        if (NIL == module0363.f24547(var11, var175)) {
            inference_datastructures_inference_oc.f25678(var175, var11);
            final SubLObject var176 = module0363.f24527(var11);
            SubLObject var177;
            SubLObject var178;
            SubLObject var179;
            for (var177 = module0032.f1741(var176), var178 = (SubLObject)NIL, var178 = module0032.f1742(var177, var176); NIL == module0032.f1744(var177, var178); var178 = module0032.f1743(var178)) {
                var179 = module0032.f1745(var177, var178);
                if (NIL != module0032.f1746(var178, var179)) {
                    if (NIL != module0379.f26926(var179)) {
                        module0367.f25238(module0364.f24757(var179));
                    }
                    f26338(var179);
                }
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26368(final SubLObject var61, final SubLObject var225) {
        return (SubLObject)T;
    }
    
    public static SubLObject f26270(final SubLObject var61, final SubLObject var225) {
        final SubLThread var226 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != module0364.f24762(var61, var225) || (NIL != module0381.f27029(var61) && NIL != module0381.f27046(var61) && NIL != module0364.f24786(var225, module0381.f27047(var61))) || (NIL != $g3180$.getDynamicValue(var226) && NIL != module0380.f26955(var61)));
    }
    
    public static SubLObject f26370(final SubLObject var166, final SubLObject var223) {
        if (NIL != f26368(var223, var166)) {
            final SubLObject var225;
            final SubLObject var224 = var225 = module0364.f24736(var166);
            final SubLObject var226 = module0363.f24507(var225);
            final SubLObject var227 = module0361.f24123(var226);
            if (NIL == module0065.f4772(var227, (SubLObject)$ic26$)) {
                final SubLObject var24_325 = var227;
                if (NIL == module0065.f4775(var24_325, (SubLObject)$ic26$)) {
                    final SubLObject var228 = module0065.f4740(var24_325);
                    final SubLObject var229 = (SubLObject)NIL;
                    SubLObject var230;
                    SubLObject var231;
                    SubLObject var232;
                    SubLObject var233;
                    for (var230 = Sequences.length(var228), var231 = (SubLObject)NIL, var231 = (SubLObject)ZERO_INTEGER; var231.numL(var230); var231 = Numbers.add(var231, (SubLObject)ONE_INTEGER)) {
                        var232 = ((NIL != var229) ? Numbers.subtract(var230, var231, (SubLObject)ONE_INTEGER) : var231);
                        var233 = Vectors.aref(var228, var232);
                        if (NIL == module0065.f4749(var233) || NIL == module0065.f4773((SubLObject)$ic26$)) {
                            if (NIL != module0065.f4749(var233)) {
                                var233 = (SubLObject)$ic26$;
                            }
                            if (NIL != module0363.f24547(var225, var233)) {
                                f26371(var224, var233);
                            }
                        }
                    }
                }
                final SubLObject var37_326 = var227;
                if (NIL == module0065.f4777(var37_326)) {
                    final SubLObject var234 = module0065.f4738(var37_326);
                    SubLObject var235 = (SubLObject)NIL;
                    SubLObject var236 = (SubLObject)NIL;
                    final Iterator var237 = Hashtables.getEntrySetIterator(var234);
                    try {
                        while (Hashtables.iteratorHasNext(var237)) {
                            final Map.Entry var238 = Hashtables.iteratorNextEntry(var237);
                            var235 = Hashtables.getEntryKey(var238);
                            var236 = Hashtables.getEntryValue(var238);
                            if (NIL != module0363.f24547(var225, var236)) {
                                f26371(var224, var236);
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(var237);
                    }
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26371(final SubLObject var11, final SubLObject var175) {
        if (NIL != f26372(var11, var175)) {
            f26373(var175, var11);
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26372(final SubLObject var11, final SubLObject var175) {
        if (NIL != module0364.f24760(inference_datastructures_inference_oc.f25474(var175))) {
            return (SubLObject)T;
        }
        final SubLObject var176 = module0363.f24530(var11);
        SubLObject var177;
        SubLObject var178;
        SubLObject var179;
        SubLObject var180;
        SubLObject var181;
        SubLObject var182;
        SubLObject var183;
        for (var177 = module0032.f1741(var176), var178 = (SubLObject)NIL, var178 = module0032.f1742(var177, var176); NIL == module0032.f1744(var177, var178); var178 = module0032.f1743(var178)) {
            var179 = module0032.f1745(var177, var178);
            if (NIL != module0032.f1746(var178, var179)) {
                var180 = var179;
                var181 = module0364.f24735(var180);
                var182 = (SubLObject)NIL;
                var182 = var181.first();
                while (NIL != var181) {
                    if (NIL != module0339.f22743((SubLObject)NIL, var180, var182) && var11.eql(module0364.f24736(var182)) && NIL != f26368(var179, var182)) {
                        if (NIL != module0374.f26529(var179)) {
                            if (var175.eql(module0364.f24724(var179))) {
                                return (SubLObject)NIL;
                            }
                        }
                        else {
                            var183 = module0364.f24725(var179);
                            if (NIL != module0363.f24547(var183, var175)) {
                                return (SubLObject)NIL;
                            }
                        }
                    }
                    var181 = var181.rest();
                    var182 = var181.first();
                }
            }
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f26373(final SubLObject var175, final SubLObject var11) {
        if (NIL != module0363.f24547(var11, var175)) {
            f26374(var175, var11);
            final SubLObject var176 = module0363.f24527(var11);
            SubLObject var177;
            SubLObject var178;
            SubLObject var179;
            for (var177 = module0032.f1741(var176), var178 = (SubLObject)NIL, var178 = module0032.f1742(var177, var176); NIL == module0032.f1744(var177, var178); var178 = module0032.f1743(var178)) {
                var179 = module0032.f1745(var177, var178);
                if (NIL != module0032.f1746(var178, var179)) {
                    f26375(var175, var179);
                }
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26374(final SubLObject var175, final SubLObject var11) {
        inference_datastructures_inference_oc.f25679(var175, var11);
        final SubLObject var176 = module0077.f5333(inference_datastructures_inference_oc.f25473(var175));
        SubLObject var177;
        SubLObject var178;
        SubLObject var179;
        for (var177 = module0032.f1741(var176), var178 = (SubLObject)NIL, var178 = module0032.f1742(var177, var176); NIL == module0032.f1744(var177, var178); var178 = module0032.f1743(var178)) {
            var179 = module0032.f1745(var177, var178);
            if (NIL != module0032.f1746(var178, var179)) {
                module0367.f25179(var11, var179);
                module0367.f25107(var11, var179);
                if (NIL != module0367.f25084(var11, var179)) {
                    module0367.f25052(var179, var11);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26375(final SubLObject var175, final SubLObject var61) {
        SubLObject var176 = module0364.f24735(var61);
        SubLObject var177 = (SubLObject)NIL;
        var177 = var176.first();
        while (NIL != var176) {
            if (NIL != module0339.f22743((SubLObject)NIL, var61, var177) && NIL != f26368(var61, var177)) {
                f26371(module0364.f24736(var177), var175);
            }
            var176 = var176.rest();
            var177 = var176.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26311(final SubLObject var11, final SubLObject var92) {
        assert NIL != f26190(var92) : var92;
        return (NIL != module0367.f24997(var92)) ? module0367.f25142(var11, var92) : module0363.f24506(var11);
    }
    
    public static SubLObject f26376(final SubLObject var11, final SubLObject var92, final SubLObject var52) {
        assert NIL != f26190(var92) : var92;
        if (NIL != module0367.f24997(var92)) {
            module0367.f25148(var11, var92, var52);
        }
        else {
            module0363.f24512(var11, var52);
        }
        return var11;
    }
    
    public static SubLObject f26295(final SubLObject var11, final SubLObject var250, final SubLObject var327, final SubLObject var92) {
        final SubLObject var328 = f26311(var11, var92);
        if (var328.eql(var250)) {
            Errors.error((SubLObject)$ic127$, var11, var328, var250);
        }
        else {
            f26377(var11, var328, var250, var327, var92);
        }
        if (NIL != module0387.f27483(var92)) {
            module0367.f25100(var92, (SubLObject)$ic128$, var11, var328, var250, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0367.f24997(var92)) {
            module0367.f25107(var11, var92);
            module0367.f25239(var11, var92);
            module0367.f25179(var11, var92);
            module0367.f25241(var11, var92);
        }
        else {
            module0367.f25234(var11);
            module0367.f25238(var11);
            module0367.f25235(var11);
            module0367.f25240(var11);
        }
        if (NIL != var11 && NIL != module0363.f24612(var11) && NIL != f26310(var11, var92)) {
            Errors.error((SubLObject)$ic129$, var11, var92);
        }
        return var11;
    }
    
    public static SubLObject f26377(final SubLObject var11, final SubLObject var249, final SubLObject var250, final SubLObject var327, final SubLObject var92) {
        if (var249.eql((SubLObject)$ic130$)) {
            if (var250.eql((SubLObject)$ic123$)) {
                return f26376(var11, var92, var250);
            }
        }
        else if (var249.eql((SubLObject)$ic123$)) {
            if (var250.eql((SubLObject)$ic131$)) {
                return f26376(var11, var92, var250);
            }
            if (var250.eql((SubLObject)$ic132$)) {
                return f26376(var11, var92, var250);
            }
            if (var250.eql((SubLObject)$ic133$)) {
                return f26376(var11, var92, var250);
            }
        }
        else if (var249.eql((SubLObject)$ic131$)) {
            if (var250.eql((SubLObject)$ic134$)) {
                return f26376(var11, var92, var250);
            }
            if (var250.eql((SubLObject)$ic123$)) {
                f26376(var11, var92, var250);
                if ($ic25$ == var92) {
                    module0413.f28763();
                }
                f26120(var11, var327, var92, (SubLObject)T);
                return var11;
            }
        }
        else if (var249.eql((SubLObject)$ic132$)) {
            if (var250.eql((SubLObject)$ic135$)) {
                return f26376(var11, var92, var250);
            }
            if (var250.eql((SubLObject)$ic131$)) {
                return f26378(var11, var92, var249, var250, (SubLObject)NIL);
            }
        }
        else if (var249.eql((SubLObject)$ic133$)) {
            if (var250.eql((SubLObject)$ic134$)) {
                f26376(var11, var92, var250);
                if ($ic25$ == var92) {
                    module0413.f28762();
                }
                return var11;
            }
            if (var250.eql((SubLObject)$ic135$)) {
                f26376(var11, var92, var250);
                if ($ic25$ == var92) {
                    module0413.f28765();
                }
                f26379(var11, var327, var92);
                return var11;
            }
            if (var250.eql((SubLObject)$ic72$)) {
                return f26376(var11, var92, var250);
            }
            if (var250.eql((SubLObject)$ic136$)) {
                return f26376(var11, var92, var250);
            }
            if (var250.eql((SubLObject)$ic123$)) {
                return f26378(var11, var92, var249, var250, (SubLObject)T);
            }
        }
        else if (var249.eql((SubLObject)$ic134$)) {
            if (var250.eql((SubLObject)$ic137$)) {
                return f26376(var11, var92, var250);
            }
            if (var250.eql((SubLObject)$ic133$)) {
                f26376(var11, var92, var250);
                if ($ic25$ == var92) {
                    module0413.f28763();
                }
                f26120(var11, var327, var92, (SubLObject)T);
                return var11;
            }
            if (var250.eql((SubLObject)$ic138$)) {
                return f26376(var11, var92, var250);
            }
            if (var250.eql((SubLObject)$ic131$)) {
                return f26378(var11, var92, var249, var250, (SubLObject)T);
            }
        }
        else if (var249.eql((SubLObject)$ic135$)) {
            if (var250.eql((SubLObject)$ic134$)) {
                return f26378(var11, var92, var249, var250, (SubLObject)NIL);
            }
            if (var250.eql((SubLObject)$ic139$)) {
                return f26376(var11, var92, var250);
            }
        }
        else if (var249.eql((SubLObject)$ic72$)) {
            if (var250.eql((SubLObject)$ic137$)) {
                return f26376(var11, var92, var250);
            }
            if (var250.eql((SubLObject)$ic136$)) {
                return f26376(var11, var92, var250);
            }
            if (var250.eql((SubLObject)$ic123$)) {
                return f26378(var11, var92, var249, var250, (SubLObject)T);
            }
        }
        else if (var249.eql((SubLObject)$ic137$)) {
            if (var250.eql((SubLObject)$ic138$)) {
                return f26376(var11, var92, var250);
            }
            if (var250.eql((SubLObject)$ic72$)) {
                f26376(var11, var92, var250);
                if ($ic25$ == var92) {
                    module0413.f28763();
                }
                f26120(var11, var327, var92, (SubLObject)T);
                return var11;
            }
            if (var250.eql((SubLObject)$ic131$)) {
                return f26378(var11, var92, var249, var250, (SubLObject)T);
            }
        }
        else if (var249.eql((SubLObject)$ic136$)) {
            if (var250.eql((SubLObject)$ic138$)) {
                return f26376(var11, var92, var250);
            }
            if (var250.eql((SubLObject)$ic139$)) {
                return f26376(var11, var92, var250);
            }
            if (var250.eql((SubLObject)$ic140$)) {
                return f26376(var11, var92, var250);
            }
            if (var250.eql((SubLObject)$ic123$)) {
                return f26378(var11, var92, var249, var250, (SubLObject)T);
            }
        }
        else if (var249.eql((SubLObject)$ic138$)) {
            if (var250.eql((SubLObject)$ic136$)) {
                f26376(var11, var92, var250);
                if ($ic25$ == var92) {
                    module0413.f28763();
                }
                f26120(var11, var327, var92, (SubLObject)T);
                return var11;
            }
            if (var250.eql((SubLObject)$ic141$)) {
                return f26376(var11, var92, var250);
            }
            if (var250.eql((SubLObject)$ic131$)) {
                return f26378(var11, var92, var249, var250, (SubLObject)T);
            }
        }
        else if (var249.eql((SubLObject)$ic139$)) {
            if (var250.eql((SubLObject)$ic142$)) {
                return f26376(var11, var92, var250);
            }
            if (var250.eql((SubLObject)$ic138$)) {
                return f26378(var11, var92, var249, var250, (SubLObject)NIL);
            }
            if (var250.eql((SubLObject)$ic123$)) {
                return f26378(var11, var92, var249, var250, (SubLObject)T);
            }
        }
        else if (var249.eql((SubLObject)$ic140$)) {
            if (var250.eql((SubLObject)$ic141$)) {
                if ($ic25$ == var92) {
                    module0413.f28762();
                }
                return f26376(var11, var92, var250);
            }
            if (var250.eql((SubLObject)$ic142$)) {
                f26376(var11, var92, var250);
                if ($ic25$ == var92) {
                    module0413.f28765();
                }
                f26379(var11, var327, var92);
                return var11;
            }
            if (var250.eql((SubLObject)$ic123$)) {
                return f26378(var11, var92, var249, var250, (SubLObject)T);
            }
        }
        else if (var249.eql((SubLObject)$ic141$)) {
            if (var250.eql((SubLObject)$ic140$)) {
                f26376(var11, var92, var250);
                if ($ic25$ == var92) {
                    module0413.f28763();
                }
                f26120(var11, var327, var92, (SubLObject)T);
                return var11;
            }
            if (var250.eql((SubLObject)$ic131$)) {
                return f26378(var11, var92, var249, var250, (SubLObject)T);
            }
        }
        else if (var249.eql((SubLObject)$ic142$)) {
            if (var250.eql((SubLObject)$ic141$)) {
                return f26378(var11, var92, var249, var250, (SubLObject)NIL);
            }
            if (var250.eql((SubLObject)$ic123$)) {
                return f26378(var11, var92, var249, var250, (SubLObject)T);
            }
        }
        return f26380(var11, var249, var250);
    }
    
    public static SubLObject f26378(final SubLObject var11, final SubLObject var92, final SubLObject var249, final SubLObject var250, final SubLObject var343) {
        final SubLThread var344 = SubLProcess.currentSubLThread();
        if (NIL != module0367.f24997(var92) && (NIL == var343 || NIL != $g3181$.getDynamicValue(var344))) {
            f26376(var11, var92, var250);
        }
        else {
            f26380(var11, var249, var250);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26380(final SubLObject var11, final SubLObject var249, final SubLObject var250) {
        Errors.error((SubLObject)$ic143$, var11, var249, var250);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26229(final SubLObject var11) {
        if (NIL == module0363.f24680(var11) && NIL != f26329(var11)) {
            final SubLObject var12 = module0363.f24507(var11);
            final SubLObject var13 = module0361.f24123(var12);
            if (NIL == module0065.f4772(var13, (SubLObject)$ic26$)) {
                final SubLObject var24_344 = var13;
                if (NIL == module0065.f4775(var24_344, (SubLObject)$ic26$)) {
                    final SubLObject var14 = module0065.f4740(var24_344);
                    final SubLObject var15 = (SubLObject)NIL;
                    SubLObject var16;
                    SubLObject var17;
                    SubLObject var18;
                    SubLObject var19;
                    for (var16 = Sequences.length(var14), var17 = (SubLObject)NIL, var17 = (SubLObject)ZERO_INTEGER; var17.numL(var16); var17 = Numbers.add(var17, (SubLObject)ONE_INTEGER)) {
                        var18 = ((NIL != var15) ? Numbers.subtract(var16, var17, (SubLObject)ONE_INTEGER) : var17);
                        var19 = Vectors.aref(var14, var18);
                        if (NIL == module0065.f4749(var19) || NIL == module0065.f4773((SubLObject)$ic26$)) {
                            if (NIL != module0065.f4749(var19)) {
                                var19 = (SubLObject)$ic26$;
                            }
                            if (NIL != module0363.f24547(var11, var19)) {
                                f26371(var11, var19);
                            }
                        }
                    }
                }
                final SubLObject var37_345 = var13;
                if (NIL == module0065.f4777(var37_345)) {
                    final SubLObject var20 = module0065.f4738(var37_345);
                    SubLObject var21 = (SubLObject)NIL;
                    SubLObject var22 = (SubLObject)NIL;
                    final Iterator var23 = Hashtables.getEntrySetIterator(var20);
                    try {
                        while (Hashtables.iteratorHasNext(var23)) {
                            final Map.Entry var24 = Hashtables.iteratorNextEntry(var23);
                            var21 = Hashtables.getEntryKey(var24);
                            var22 = Hashtables.getEntryValue(var24);
                            if (NIL != module0363.f24547(var11, var22)) {
                                f26371(var11, var22);
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(var23);
                    }
                }
            }
        }
        return var11;
    }
    
    public static SubLObject f26329(final SubLObject var11) {
        return (SubLObject)makeBoolean(NIL != module0363.f24504(var11) && NIL != module0363.f24646(var11));
    }
    
    public static SubLObject f26381(final SubLObject var52) {
        if (var52.eql((SubLObject)$ic131$) || var52.eql((SubLObject)$ic134$) || var52.eql((SubLObject)$ic137$) || var52.eql((SubLObject)$ic138$) || var52.eql((SubLObject)$ic141$)) {
            return var52;
        }
        if (var52.eql((SubLObject)$ic123$)) {
            return (SubLObject)$ic131$;
        }
        if (var52.eql((SubLObject)$ic133$)) {
            return (SubLObject)$ic134$;
        }
        if (var52.eql((SubLObject)$ic72$)) {
            return (SubLObject)$ic137$;
        }
        if (var52.eql((SubLObject)$ic136$)) {
            return (SubLObject)$ic138$;
        }
        if (var52.eql((SubLObject)$ic140$)) {
            return (SubLObject)$ic141$;
        }
        if (var52.eql((SubLObject)$ic132$)) {
            return (SubLObject)$ic131$;
        }
        if (var52.eql((SubLObject)$ic135$)) {
            return (SubLObject)$ic134$;
        }
        if (var52.eql((SubLObject)$ic139$)) {
            return (SubLObject)$ic138$;
        }
        if (var52.eql((SubLObject)$ic142$)) {
            return (SubLObject)$ic141$;
        }
        if (var52.eql((SubLObject)$ic130$)) {
            Errors.error((SubLObject)$ic144$);
        }
        else {
            Errors.error((SubLObject)$ic145$, var52);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26309(final SubLObject var52) {
        if (var52.eql((SubLObject)$ic134$) || var52.eql((SubLObject)$ic137$) || var52.eql((SubLObject)$ic138$) || var52.eql((SubLObject)$ic141$)) {
            return (SubLObject)$ic131$;
        }
        if (var52.eql((SubLObject)$ic133$) || var52.eql((SubLObject)$ic72$) || var52.eql((SubLObject)$ic136$) || var52.eql((SubLObject)$ic139$) || var52.eql((SubLObject)$ic140$) || var52.eql((SubLObject)$ic142$)) {
            return (SubLObject)$ic123$;
        }
        Errors.error((SubLObject)$ic146$, var52);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26304(final SubLObject var52) {
        if (var52.eql((SubLObject)$ic133$) || var52.eql((SubLObject)$ic134$) || var52.eql((SubLObject)$ic135$)) {
            return var52;
        }
        if (var52.eql((SubLObject)$ic123$)) {
            return (SubLObject)$ic133$;
        }
        if (var52.eql((SubLObject)$ic131$)) {
            return (SubLObject)$ic134$;
        }
        if (var52.eql((SubLObject)$ic132$)) {
            return (SubLObject)$ic135$;
        }
        Errors.error((SubLObject)$ic147$, var52);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26306(final SubLObject var52) {
        if (var52.eql((SubLObject)$ic72$) || var52.eql((SubLObject)$ic137$) || var52.eql((SubLObject)$ic148$)) {
            return var52;
        }
        if (var52.eql((SubLObject)$ic133$)) {
            return (SubLObject)$ic72$;
        }
        if (var52.eql((SubLObject)$ic134$)) {
            return (SubLObject)$ic137$;
        }
        Errors.error((SubLObject)$ic149$, var52);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26312(final SubLObject var52) {
        if (var52.eql((SubLObject)$ic136$) || var52.eql((SubLObject)$ic138$) || var52.eql((SubLObject)$ic139$)) {
            return var52;
        }
        if (var52.eql((SubLObject)$ic133$)) {
            return (SubLObject)$ic136$;
        }
        if (var52.eql((SubLObject)$ic134$)) {
            return (SubLObject)$ic138$;
        }
        if (var52.eql((SubLObject)$ic135$)) {
            return (SubLObject)$ic139$;
        }
        if (var52.eql((SubLObject)$ic72$)) {
            return (SubLObject)$ic136$;
        }
        if (var52.eql((SubLObject)$ic137$)) {
            return (SubLObject)$ic138$;
        }
        Errors.error((SubLObject)$ic150$, var52);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26316(final SubLObject var52) {
        if (var52.eql((SubLObject)$ic140$) || var52.eql((SubLObject)$ic141$) || var52.eql((SubLObject)$ic142$)) {
            return var52;
        }
        if (var52.eql((SubLObject)$ic136$)) {
            return (SubLObject)$ic140$;
        }
        if (var52.eql((SubLObject)$ic138$)) {
            return (SubLObject)$ic141$;
        }
        if (var52.eql((SubLObject)$ic139$)) {
            return (SubLObject)$ic142$;
        }
        Errors.error((SubLObject)$ic151$, var52);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26240(final SubLObject var11) {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26290(final SubLObject var11, final SubLObject var327, final SubLObject var92, final SubLObject var346) {
        assert NIL != f26190(var92) : var92;
        if (NIL != f26382(var11, var327, var92, var346)) {
            f26313(var11, var92);
        }
        return var11;
    }
    
    public static SubLObject f26382(final SubLObject var11, final SubLObject var327, final SubLObject var92, final SubLObject var346) {
        if (NIL != f26314(var11, var92)) {
            SubLObject var347 = (SubLObject)NIL;
            final SubLObject var348 = module0363.f24527(var11);
            SubLObject var349;
            SubLObject var350;
            SubLObject var351;
            for (var349 = module0032.f1741(var348), var350 = (SubLObject)NIL, var350 = module0032.f1742(var349, var348); NIL == var347 && NIL == module0032.f1744(var349, var350); var350 = module0032.f1743(var350)) {
                var351 = module0032.f1745(var349, var350);
                if (NIL != module0032.f1746(var350, var351) && NIL != f26383(var351, var92)) {
                    var347 = (SubLObject)makeBoolean(NIL == f26384(var351, var92, var346));
                }
            }
            return (SubLObject)makeBoolean(NIL == var347);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26383(final SubLObject var61, final SubLObject var92) {
        if (NIL != module0364.f24759(var61)) {
            return (SubLObject)T;
        }
        if (NIL != f26164(var61)) {
            final SubLObject var93 = f26166(var61);
            return (SubLObject)makeBoolean(NIL != module0365.f24882(var93) && (NIL == module0367.f24997(var92) || NIL == module0384.f27287(var92, var93, (SubLObject)UNPROVIDED)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26384(final SubLObject var61, final SubLObject var92, final SubLObject var346) {
        if (NIL != module0375.f26587(var61)) {
            return f26320(module0364.f24757(var61), var92);
        }
        if (NIL != module0375.f26571(var61)) {
            return (SubLObject)T;
        }
        if (NIL != module0376.f26613(var61)) {
            return (SubLObject)T;
        }
        if (NIL != module0377.f26780(var61)) {
            if (NIL == var346) {
                return (SubLObject)T;
            }
            return f26320(module0364.f24757(var61), var92);
        }
        else {
            if (NIL != module0379.f26926(var61)) {
                return f26320(module0364.f24757(var61), var92);
            }
            if (NIL != module0380.f26955(var61)) {
                return f26385(var61, var92);
            }
            if (NIL != module0381.f27029(var61)) {
                return module0381.f27150(var61, var92);
            }
            if (NIL != module0382.f27173(var61)) {
                return f26386(var61, var92);
            }
            if (NIL != module0383.f27227(var61)) {
                return f26387(var61, var92);
            }
            return Errors.error((SubLObject)$ic152$, var61);
        }
    }
    
    public static SubLObject f26385(final SubLObject var348, final SubLObject var92) {
        SubLObject var349 = module0364.f24735(var348);
        SubLObject var350 = (SubLObject)NIL;
        var350 = var349.first();
        while (NIL != var349) {
            if (NIL != module0339.f22743((SubLObject)NIL, var348, var350)) {
                final SubLObject var351 = module0364.f24736(var350);
                final SubLObject var352 = module0364.f24737(var350);
                if (NIL != f26327(var351, var92)) {
                    return (SubLObject)T;
                }
            }
            var349 = var349.rest();
            var350 = var349.first();
        }
        SubLObject var353;
        SubLObject var354;
        SubLObject var355;
        SubLObject var356;
        SubLObject var357;
        for (var353 = (SubLObject)NIL, var354 = (SubLObject)NIL, var354 = module0364.f24735(var348); NIL == var353 && NIL != var354; var354 = var354.rest()) {
            var355 = var354.first();
            if (NIL != module0339.f22743((SubLObject)NIL, var348, var355)) {
                var356 = module0364.f24736(var355);
                var357 = module0364.f24737(var355);
                var353 = (SubLObject)makeBoolean(NIL == f26320(var356, var92));
            }
        }
        return (SubLObject)makeBoolean(NIL == var353);
    }
    
    public static SubLObject f26386(final SubLObject var350, final SubLObject var92) {
        final SubLObject var351 = module0382.f27185(var350);
        final SubLObject var352 = module0382.f27186(var350);
        if (NIL != f26327(var351, var92) || NIL != f26327(var352, var92)) {
            return (SubLObject)T;
        }
        if (NIL != f26320(var351, var92) && NIL != f26320(var352, var92)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26387(final SubLObject var351, final SubLObject var92) {
        final SubLObject var352 = module0364.f24757(var351);
        return (SubLObject)makeBoolean(NIL != f26327(var352, var92) || NIL != f26320(var352, var92));
    }
    
    public static SubLObject f26120(final SubLObject var11, final SubLObject var327, final SubLObject var92, final SubLObject var346) {
        if ($ic25$ == var92) {
            return f26388(var92, var11, var327, var346);
        }
        return module0387.f27566(var92, var11, var327, var346);
    }
    
    public static SubLObject f26388(final SubLObject var92, final SubLObject var11, final SubLObject var327, final SubLObject var346) {
        assert NIL != f26190(var92) : var92;
        if (NIL == module0363.f24680(var11) && NIL == f26327(var11, var92) && NIL != f26389(var11, var327, var92, var346)) {
            f26244(var11, var327, var92);
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26390(final SubLObject var6, final SubLObject var92) {
        return f26244(module0365.f24850(var6), (SubLObject)NIL, var92);
    }
    
    public static SubLObject f26244(final SubLObject var11, final SubLObject var327, final SubLObject var92) {
        final SubLThread var328 = SubLProcess.currentSubLThread();
        if (NIL != module0367.f24997(var92)) {
            f26293(var11, var92);
        }
        else {
            f26391(var11);
        }
        if ($ic25$ == var92) {
            final SubLObject var329 = module0363.f24507(var11);
            final SubLObject var330 = module0361.f24123(var329);
            if (NIL == module0065.f4772(var330, (SubLObject)$ic26$)) {
                final SubLObject var24_353 = var330;
                if (NIL == module0065.f4775(var24_353, (SubLObject)$ic26$)) {
                    final SubLObject var331 = module0065.f4740(var24_353);
                    final SubLObject var332 = (SubLObject)NIL;
                    SubLObject var333;
                    SubLObject var334;
                    SubLObject var335;
                    SubLObject var336;
                    for (var333 = Sequences.length(var331), var334 = (SubLObject)NIL, var334 = (SubLObject)ZERO_INTEGER; var334.numL(var333); var334 = Numbers.add(var334, (SubLObject)ONE_INTEGER)) {
                        var335 = ((NIL != var332) ? Numbers.subtract(var333, var334, (SubLObject)ONE_INTEGER) : var334);
                        var336 = Vectors.aref(var331, var335);
                        if (NIL == module0065.f4749(var336) || NIL == module0065.f4773((SubLObject)$ic26$)) {
                            if (NIL != module0065.f4749(var336)) {
                                var336 = (SubLObject)$ic26$;
                            }
                            if (NIL != module0363.f24547(var11, var336)) {
                                f26373(var336, var11);
                            }
                        }
                    }
                }
                final SubLObject var37_354 = var330;
                if (NIL == module0065.f4777(var37_354)) {
                    final SubLObject var337 = module0065.f4738(var37_354);
                    SubLObject var338 = (SubLObject)NIL;
                    SubLObject var339 = (SubLObject)NIL;
                    final Iterator var340 = Hashtables.getEntrySetIterator(var337);
                    try {
                        while (Hashtables.iteratorHasNext(var340)) {
                            final Map.Entry var341 = Hashtables.iteratorNextEntry(var340);
                            var338 = Hashtables.getEntryKey(var341);
                            var339 = Hashtables.getEntryValue(var341);
                            if (NIL != module0363.f24547(var11, var339)) {
                                f26373(var339, var11);
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(var340);
                    }
                }
            }
        }
        if (NIL != module0363.f24680(var11) && NIL != f26326(var92)) {
            final SubLObject var342 = (SubLObject)$ic99$;
            SubLObject var343;
            for (var343 = module0066.f4838(module0363.f24537(var11)); NIL == module0066.f4841(var343); var343 = module0066.f4840(var343)) {
                var328.resetMultipleValues();
                final SubLObject var344 = module0066.f4839(var343);
                final SubLObject var345 = var328.secondMultipleValue();
                var328.resetMultipleValues();
                SubLObject var346 = var345;
                SubLObject var347 = (SubLObject)NIL;
                var347 = var346.first();
                while (NIL != var346) {
                    if (NIL != module0363.f24538(var347, var342)) {
                        f26237(var347, (SubLObject)$ic153$);
                    }
                    var346 = var346.rest();
                    var347 = var346.first();
                }
            }
            module0066.f4842(var343);
        }
        if (NIL == f26327(var11, var92)) {
            final SubLObject var348 = f26311(var11, var92);
            final SubLObject var349 = f26392(var348);
            f26295(var11, var349, var327, var92);
            if ($ic25$ == var92) {
                f26393(var11);
            }
            final SubLObject var350 = module0363.f24530(var11);
            SubLObject var351;
            SubLObject var352;
            SubLObject var353;
            for (var351 = module0032.f1741(var350), var352 = (SubLObject)NIL, var352 = module0032.f1742(var351, var350); NIL == module0032.f1744(var351, var352); var352 = module0032.f1743(var352)) {
                var353 = module0032.f1745(var351, var352);
                if (NIL != module0032.f1746(var352, var353) && NIL != module0364.f24748(var353, (SubLObject)$ic154$) && (NIL == module0367.f24997(var92) || NIL == f26150(var353) || NIL == f26203(module0364.f24725(var353), (SubLObject)$ic25$))) {
                    f26244(module0364.f24725(var353), var327, var92);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26391(final SubLObject var11) {
        return f26208(var11, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
    }
    
    public static SubLObject f26119(final SubLObject var11) {
        f26208(var11, (SubLObject)$ic81$, (SubLObject)NIL, (SubLObject)$ic155$, (SubLObject)NIL, (SubLObject)NIL);
        if (NIL == module0361.f24164(module0363.f24507(var11))) {
            f26208(var11, (SubLObject)NIL, (SubLObject)$ic75$, (SubLObject)$ic80$, (SubLObject)NIL, (SubLObject)NIL);
            f26208(var11, (SubLObject)NIL, (SubLObject)$ic76$, (SubLObject)$ic80$, (SubLObject)NIL, (SubLObject)NIL);
        }
        return var11;
    }
    
    public static SubLObject f26208(final SubLObject var11, final SubLObject var100, final SubLObject var102, final SubLObject var117, final SubLObject var355, final SubLObject var356) {
        SubLObject var357 = module0363.f24517(var11);
        SubLObject var358 = (SubLObject)NIL;
        var358 = var357.first();
        while (NIL != var357) {
            if (NIL != module0363.f24524(var358, var117) && NIL != module0363.f24518(var358, (SubLObject)$ic72$) && NIL != module0363.f24519(var358, var100) && NIL != module0363.f24520(var358, var102) && NIL != module0363.f24521(var358, var356) && !var358.eql(var355)) {
                module0365.f24894(var358);
                if (NIL != module0365.f24845(var358)) {
                    final SubLObject var359 = module0363.f24507(var11);
                    final SubLObject var360 = module0361.f24123(var359);
                    if (NIL == module0065.f4772(var360, (SubLObject)$ic26$)) {
                        final SubLObject var24_357 = var360;
                        if (NIL == module0065.f4775(var24_357, (SubLObject)$ic26$)) {
                            final SubLObject var361 = module0065.f4740(var24_357);
                            final SubLObject var362 = (SubLObject)NIL;
                            SubLObject var363;
                            SubLObject var364;
                            SubLObject var365;
                            SubLObject var366;
                            SubLObject var367;
                            SubLObject var368;
                            SubLObject var369;
                            SubLObject var370;
                            SubLObject var371;
                            for (var363 = Sequences.length(var361), var364 = (SubLObject)NIL, var364 = (SubLObject)ZERO_INTEGER; var364.numL(var363); var364 = Numbers.add(var364, (SubLObject)ONE_INTEGER)) {
                                var365 = ((NIL != var362) ? Numbers.subtract(var363, var364, (SubLObject)ONE_INTEGER) : var364);
                                var366 = Vectors.aref(var361, var365);
                                if (NIL == module0065.f4749(var366) || NIL == module0065.f4773((SubLObject)$ic26$)) {
                                    if (NIL != module0065.f4749(var366)) {
                                        var366 = (SubLObject)$ic26$;
                                    }
                                    if (NIL != module0363.f24547(var11, var366)) {
                                        var367 = var366;
                                        var368 = module0077.f5333(inference_datastructures_inference_oc.f25473(var367));
                                        for (var369 = module0032.f1741(var368), var370 = (SubLObject)NIL, var370 = module0032.f1742(var369, var368); NIL == module0032.f1744(var369, var370); var370 = module0032.f1743(var370)) {
                                            var371 = module0032.f1745(var369, var370);
                                            if (NIL != module0032.f1746(var370, var371)) {
                                                module0387.f27562(var371, var358);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        final SubLObject var37_358 = var360;
                        if (NIL == module0065.f4777(var37_358)) {
                            final SubLObject var372 = module0065.f4738(var37_358);
                            SubLObject var373 = (SubLObject)NIL;
                            SubLObject var374 = (SubLObject)NIL;
                            final Iterator var375 = Hashtables.getEntrySetIterator(var372);
                            try {
                                while (Hashtables.iteratorHasNext(var375)) {
                                    final Map.Entry var376 = Hashtables.iteratorNextEntry(var375);
                                    var373 = Hashtables.getEntryKey(var376);
                                    var374 = Hashtables.getEntryValue(var376);
                                    if (NIL != module0363.f24547(var11, var374)) {
                                        final SubLObject var377 = var374;
                                        final SubLObject var378 = module0077.f5333(inference_datastructures_inference_oc.f25473(var377));
                                        SubLObject var379;
                                        SubLObject var380;
                                        SubLObject var381;
                                        for (var379 = module0032.f1741(var378), var380 = (SubLObject)NIL, var380 = module0032.f1742(var379, var378); NIL == module0032.f1744(var379, var380); var380 = module0032.f1743(var380)) {
                                            var381 = module0032.f1745(var379, var380);
                                            if (NIL != module0032.f1746(var380, var381)) {
                                                module0387.f27562(var381, var358);
                                            }
                                        }
                                    }
                                }
                            }
                            finally {
                                Hashtables.releaseEntrySetIterator(var375);
                            }
                        }
                    }
                }
            }
            var357 = var357.rest();
            var358 = var357.first();
        }
        if (NIL != module0363.f24687(var11) && NIL == module0363.f24616(var11)) {
            f26289(var11, (SubLObject)$ic25$);
        }
        f26394(var11);
        return var11;
    }
    
    public static SubLObject f26394(final SubLObject var11) {
        if (var11.eql(f26109())) {
            return (SubLObject)NIL;
        }
        final SubLObject var12 = module0363.f24507(var11);
        final SubLObject var13 = module0361.f24123(var12);
        if (NIL == module0065.f4772(var13, (SubLObject)$ic26$)) {
            final SubLObject var24_359 = var13;
            if (NIL == module0065.f4775(var24_359, (SubLObject)$ic26$)) {
                final SubLObject var14 = module0065.f4740(var24_359);
                final SubLObject var15 = (SubLObject)NIL;
                SubLObject var16;
                SubLObject var17;
                SubLObject var18;
                SubLObject var19;
                SubLObject var20;
                SubLObject var21;
                SubLObject var22;
                SubLObject var23;
                SubLObject var24;
                for (var16 = Sequences.length(var14), var17 = (SubLObject)NIL, var17 = (SubLObject)ZERO_INTEGER; var17.numL(var16); var17 = Numbers.add(var17, (SubLObject)ONE_INTEGER)) {
                    var18 = ((NIL != var15) ? Numbers.subtract(var16, var17, (SubLObject)ONE_INTEGER) : var17);
                    var19 = Vectors.aref(var14, var18);
                    if (NIL == module0065.f4749(var19) || NIL == module0065.f4773((SubLObject)$ic26$)) {
                        if (NIL != module0065.f4749(var19)) {
                            var19 = (SubLObject)$ic26$;
                        }
                        if (NIL != module0363.f24547(var11, var19)) {
                            var20 = var19;
                            var21 = module0077.f5333(inference_datastructures_inference_oc.f25473(var20));
                            for (var22 = module0032.f1741(var21), var23 = (SubLObject)NIL, var23 = module0032.f1742(var22, var21); NIL == module0032.f1744(var22, var23); var23 = module0032.f1743(var23)) {
                                var24 = module0032.f1745(var22, var23);
                                if (NIL != module0032.f1746(var23, var24)) {
                                    f26303(var11, var24);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject var37_360 = var13;
            if (NIL == module0065.f4777(var37_360)) {
                final SubLObject var25 = module0065.f4738(var37_360);
                SubLObject var26 = (SubLObject)NIL;
                SubLObject var27 = (SubLObject)NIL;
                final Iterator var28 = Hashtables.getEntrySetIterator(var25);
                try {
                    while (Hashtables.iteratorHasNext(var28)) {
                        final Map.Entry var29 = Hashtables.iteratorNextEntry(var28);
                        var26 = Hashtables.getEntryKey(var29);
                        var27 = Hashtables.getEntryValue(var29);
                        if (NIL != module0363.f24547(var11, var27)) {
                            final SubLObject var30 = var27;
                            final SubLObject var31 = module0077.f5333(inference_datastructures_inference_oc.f25473(var30));
                            SubLObject var32;
                            SubLObject var33;
                            SubLObject var34;
                            for (var32 = module0032.f1741(var31), var33 = (SubLObject)NIL, var33 = module0032.f1742(var32, var31); NIL == module0032.f1744(var32, var33); var33 = module0032.f1743(var33)) {
                                var34 = module0032.f1745(var32, var33);
                                if (NIL != module0032.f1746(var33, var34)) {
                                    f26303(var11, var34);
                                }
                            }
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var28);
                }
            }
        }
        return var11;
    }
    
    public static SubLObject f26303(final SubLObject var11, final SubLObject var36) {
        module0387.f27565(var36, var11);
        if (NIL != module0367.f25151(var11, var36) && NIL != module0387.f27564(var36, var11)) {
            f26293(var11, var36);
        }
        return var11;
    }
    
    public static SubLObject f26379(final SubLObject var53, final SubLObject var327, final SubLObject var92) {
        final SubLObject var328 = module0363.f24530(var53);
        SubLObject var329;
        SubLObject var330;
        SubLObject var331;
        SubLObject var332;
        SubLObject var333;
        SubLObject var334;
        SubLObject var33_363;
        SubLObject var34_364;
        SubLObject var35_365;
        SubLObject var335;
        for (var329 = module0032.f1741(var328), var330 = (SubLObject)NIL, var330 = module0032.f1742(var329, var328); NIL == module0032.f1744(var329, var330); var330 = module0032.f1743(var330)) {
            var331 = module0032.f1745(var329, var330);
            if (NIL != module0032.f1746(var330, var331)) {
                if (NIL != module0374.f26529(var331)) {
                    var332 = module0364.f24724(var331);
                    module0408.f28477(var332);
                }
                else if (NIL != module0383.f27227(var331)) {
                    var333 = module0364.f24725(var331);
                    if (NIL != f26395(var333, var327, var92, (SubLObject)T)) {
                        f26120(var333, var327, var92, (SubLObject)T);
                    }
                }
                else if (NIL != module0377.f26746(var331)) {
                    var333 = module0364.f24725(var331);
                    f26120(var333, var327, var92, (SubLObject)T);
                }
                else if (NIL != module0379.f26926(var331)) {
                    var333 = module0364.f24725(var331);
                    f26120(var333, var327, var92, (SubLObject)T);
                }
                else if (NIL != module0375.f26571(var331)) {
                    var334 = module0364.f24725(var331);
                    var33_363 = module0363.f24530(var334);
                    for (var34_364 = module0032.f1741(var33_363), var35_365 = (SubLObject)NIL, var35_365 = module0032.f1742(var34_364, var33_363); NIL == module0032.f1744(var34_364, var35_365); var35_365 = module0032.f1743(var35_365)) {
                        var335 = module0032.f1745(var34_364, var35_365);
                        if (NIL != module0032.f1746(var35_365, var335) && NIL != module0364.f24748(var335, (SubLObject)$ic51$) && NIL != module0381.f27133(var331, var335)) {
                            f26120(module0364.f24725(var335), var327, var92, (SubLObject)T);
                        }
                    }
                }
                else {
                    if ($ic25$ == var92 && NIL != module0380.f26955(var331)) {
                        module0380.f26967(var331);
                    }
                    if (NIL != f26396(var331)) {
                        var333 = module0364.f24725(var331);
                        f26120(var333, var327, var92, (SubLObject)T);
                    }
                }
            }
        }
        return var53;
    }
    
    public static SubLObject f26392(final SubLObject var52) {
        if (var52.eql((SubLObject)$ic140$)) {
            return (SubLObject)$ic142$;
        }
        if (var52.eql((SubLObject)$ic136$)) {
            return (SubLObject)$ic139$;
        }
        if (var52.eql((SubLObject)$ic133$)) {
            return (SubLObject)$ic135$;
        }
        if (var52.eql((SubLObject)$ic123$)) {
            return (SubLObject)$ic132$;
        }
        Errors.error((SubLObject)$ic156$, var52);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26389(final SubLObject var11, final SubLObject var327, final SubLObject var92, final SubLObject var346) {
        assert NIL != f26190(var92) : var92;
        SubLObject var347 = (SubLObject)$ic126$;
        if (NIL != f26203(var11, var92)) {
            var347 = (SubLObject)NIL;
        }
        else if (NIL != module0363.f24685(var11)) {
            var347 = (SubLObject)NIL;
        }
        else if (NIL != module0363.f24686(var11)) {
            var347 = module0363.f24553(var11);
        }
        else if (NIL != f26397(var11, var92)) {
            var347 = (SubLObject)$ic76$;
        }
        else if (NIL != module0363.f24562(var11) && NIL != f26398(var11, var327, var92, var346)) {
            var347 = (SubLObject)NIL;
        }
        else if (NIL != f26320(var11, var92) && (NIL != module0363.f24553(var11) || NIL == module0363.f24562(var11))) {
            var347 = (SubLObject)$ic157$;
        }
        else if (NIL != f26314(var11, var92) && NIL != module0384.f27303(var11, var92, (SubLObject)$ic71$) && NIL == module0384.f27322(var11, var92, var346)) {
            var347 = (SubLObject)$ic158$;
        }
        else if (NIL != f26314(var11, var92) && $ic70$ == module0388.f27577(var11, var92, module0363.f24559(var11)) && NIL == module0384.f27322(var11, var92, var346)) {
            var347 = (SubLObject)$ic159$;
        }
        else if (NIL != module0363.f24593(var11, (SubLObject)$ic50$) && NIL != f26399(var11, var327, var92, var346)) {
            var347 = (SubLObject)$ic160$;
        }
        else if (NIL != module0363.f24593(var11, (SubLObject)$ic51$) && NIL != f26400(var11, var327, var92, var346)) {
            var347 = (SubLObject)$ic161$;
        }
        else if (NIL != module0363.f24593(var11, (SubLObject)$ic53$) && NIL != f26401(var11, var327, var92, var346)) {
            var347 = (SubLObject)$ic162$;
        }
        else if (NIL != module0363.f24688(var11) && NIL != module0363.f24593(var11, (SubLObject)$ic52$) && NIL != f26395(var11, var327, var92, var346)) {
            var347 = (SubLObject)$ic163$;
        }
        else if (NIL != module0375.f26589(var11)) {
            var347 = f26402(var11, var327, var92, var346);
        }
        else {
            var347 = (SubLObject)NIL;
        }
        return var347;
    }
    
    public static SubLObject f26397(final SubLObject var11, final SubLObject var92) {
        SubLObject var93 = module0363.f24517(var11);
        SubLObject var94 = (SubLObject)NIL;
        var94 = var93.first();
        while (NIL != var93) {
            if (NIL != module0363.f24524(var94, (SubLObject)$ic51$) && NIL != module0358.f23683(module0367.f25198(var94, var92))) {
                final SubLObject var95 = module0381.f27055(var94);
                if (NIL != var95) {
                    final SubLObject var96 = module0381.f27092(var95);
                    final SubLObject var97 = module0381.f27031(var95);
                    final SubLObject var98 = module0364.f24736(var97);
                    final SubLObject var99 = module0364.f24737(var97);
                    final SubLObject var100 = module0233.f15362(var99, var96);
                    final SubLObject var101 = f26403(var100, var11, var92, var94);
                    final SubLObject var102 = module0233.f15376(var99, var101);
                    if (!var100.equal(var101) && NIL != module0358.f23682(module0388.f27577(var98, var92, var102))) {
                        return (SubLObject)T;
                    }
                }
            }
            var93 = var93.rest();
            var94 = var93.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26403(final SubLObject var371, final SubLObject var11, final SubLObject var92, final SubLObject var366) {
        SubLObject var372 = (SubLObject)NIL;
        SubLObject var373 = var371;
        SubLObject var374 = (SubLObject)NIL;
        var374 = var373.first();
        while (NIL != var373) {
            if (NIL != f26404(var374, var11, var92, var366)) {
                var372 = (SubLObject)ConsesLow.cons(var374, var372);
            }
            var373 = var373.rest();
            var374 = var373.first();
        }
        return Sequences.nreverse(var372);
    }
    
    public static SubLObject f26404(final SubLObject var374, final SubLObject var11, final SubLObject var92, final SubLObject var366) {
        SubLObject var375 = module0363.f24517(var11);
        SubLObject var376 = (SubLObject)NIL;
        var376 = var375.first();
        while (NIL != var375) {
            if (NIL != module0363.f24524(var376, (SubLObject)$ic51$) && !var366.eql(var376) && NIL != f26405(var376, var374, var92)) {
                return (SubLObject)T;
            }
            var375 = var375.rest();
            var376 = var375.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26405(final SubLObject var366, final SubLObject var374, final SubLObject var92) {
        final SubLObject var375 = module0381.f27055(var366);
        final SubLObject var376 = module0381.f27031(var375);
        final SubLObject var377 = module0364.f24736(var376);
        final SubLObject var378 = module0364.f24737(var376);
        final SubLObject var379 = module0233.f15376(var378, var374);
        final SubLObject var380 = module0363.f24509(var377);
        if (NIL == module0035.f2428(var379, var380, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        final SubLObject var381 = module0367.f25198(var366, var92);
        if (NIL != module0358.f23682(var381)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0358.f23681(var381)) {
            final SubLObject var382 = module0381.f27092(var375);
            final SubLObject var383 = Sequences.remove(var379, var382, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return (SubLObject)makeBoolean(NIL == module0358.f23682(module0388.f27577(var377, var92, var383)));
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f26402(final SubLObject var11, final SubLObject var327, final SubLObject var92, final SubLObject var346) {
        final SubLObject var347 = module0363.f24527(var11);
        SubLObject var348;
        SubLObject var349;
        SubLObject var350;
        for (var348 = module0032.f1741(var347), var349 = (SubLObject)NIL, var349 = module0032.f1742(var348, var347); NIL == module0032.f1744(var348, var349); var349 = module0032.f1743(var349)) {
            var350 = module0032.f1745(var348, var349);
            if (NIL != module0032.f1746(var349, var350) && NIL != module0364.f24748(var350, (SubLObject)$ic164$) && NIL == f26406(var350, var327, var92, var346)) {
                return (SubLObject)NIL;
            }
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f26398(final SubLObject var11, final SubLObject var327, final SubLObject var92, final SubLObject var346) {
        final SubLObject var347 = module0363.f24527(var11);
        SubLObject var348;
        SubLObject var349;
        SubLObject var350;
        for (var348 = module0032.f1741(var347), var349 = (SubLObject)NIL, var349 = module0032.f1742(var348, var347); NIL == module0032.f1744(var348, var349); var349 = module0032.f1743(var349)) {
            var350 = module0032.f1745(var348, var349);
            if (NIL != module0032.f1746(var349, var350) && (NIL != var346 || NIL == module0377.f26780(var350)) && (NIL == var327 || NIL == f26407(var350)) && NIL != f26408(var350, var92)) {
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26399(final SubLObject var11, final SubLObject var327, final SubLObject var92, final SubLObject var346) {
        final SubLObject var347 = module0363.f24527(var11);
        SubLObject var348;
        SubLObject var349;
        SubLObject var350;
        for (var348 = module0032.f1741(var347), var349 = (SubLObject)NIL, var349 = module0032.f1742(var348, var347); NIL == module0032.f1744(var348, var349); var349 = module0032.f1743(var349)) {
            var350 = module0032.f1745(var348, var349);
            if (NIL != module0032.f1746(var349, var350) && NIL != module0364.f24748(var350, (SubLObject)$ic50$) && NIL != f26406(var350, var327, var92, var346)) {
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26400(final SubLObject var11, final SubLObject var327, final SubLObject var92, final SubLObject var346) {
        final SubLObject var347 = module0363.f24527(var11);
        SubLObject var348;
        SubLObject var349;
        SubLObject var350;
        SubLObject var351;
        SubLObject var352;
        for (var348 = module0032.f1741(var347), var349 = (SubLObject)NIL, var349 = module0032.f1742(var348, var347); NIL == module0032.f1744(var348, var349); var349 = module0032.f1743(var349)) {
            var350 = module0032.f1745(var348, var349);
            if (NIL != module0032.f1746(var349, var350) && NIL != module0364.f24748(var350, (SubLObject)$ic51$) && NIL != f26406(var350, var327, var92, var346)) {
                var351 = module0364.f24736(module0381.f27031(var350));
                var352 = module0381.f27092(var350);
                if ($ic70$ == module0388.f27577(var351, var92, var352)) {
                    return (SubLObject)T;
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26401(final SubLObject var11, final SubLObject var327, final SubLObject var92, final SubLObject var346) {
        final SubLObject var347 = module0363.f24527(var11);
        SubLObject var348;
        SubLObject var349;
        SubLObject var350;
        for (var348 = module0032.f1741(var347), var349 = (SubLObject)NIL, var349 = module0032.f1742(var348, var347); NIL == module0032.f1744(var348, var349); var349 = module0032.f1743(var349)) {
            var350 = module0032.f1745(var348, var349);
            if (NIL != module0032.f1746(var349, var350) && NIL != module0364.f24748(var350, (SubLObject)$ic53$) && NIL != f26406(var350, var327, var92, var346)) {
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26395(final SubLObject var11, final SubLObject var327, final SubLObject var92, final SubLObject var346) {
        final SubLObject var347 = module0363.f24527(var11);
        SubLObject var348;
        SubLObject var349;
        SubLObject var350;
        for (var348 = module0032.f1741(var347), var349 = (SubLObject)NIL, var349 = module0032.f1742(var348, var347); NIL == module0032.f1744(var348, var349); var349 = module0032.f1743(var349)) {
            var350 = module0032.f1745(var348, var349);
            if (NIL != module0032.f1746(var349, var350) && NIL != module0364.f24748(var350, (SubLObject)$ic52$) && NIL == f26406(var350, var327, var92, var346)) {
                return (SubLObject)NIL;
            }
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f26406(final SubLObject var61, final SubLObject var327, final SubLObject var92, SubLObject var346) {
        final SubLThread var347 = SubLProcess.currentSubLThread();
        assert NIL != f26190(var92) : var92;
        if (NIL != var346 && NIL != module0367.f24997(var92) && NIL == f26364(module0367.f25037(var92), module0364.f24725(var61))) {
            var346 = (SubLObject)NIL;
        }
        SubLObject var348 = module0364.f24735(var61);
        SubLObject var349 = (SubLObject)NIL;
        var349 = var348.first();
        while (NIL != var348) {
            if (NIL != module0339.f22743((SubLObject)NIL, var61, var349)) {
                final SubLObject var350 = module0364.f24736(var349);
                if (NIL != f26327(var350, var92)) {
                    return (SubLObject)T;
                }
                if (NIL == var346 && NIL != f26409(var350, var92)) {
                    return (SubLObject)T;
                }
            }
            var348 = var348.rest();
            var349 = var348.first();
        }
        if ((NIL != var327 || NIL != $g3182$.getDynamicValue(var347)) && NIL != module0381.f27029(var61)) {
            return module0381.f27151(var61, (SubLObject)NIL, var92);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26409(final SubLObject var11, final SubLObject var92) {
        return f26389(var11, (SubLObject)NIL, var92, (SubLObject)NIL);
    }
    
    public static SubLObject f26408(final SubLObject var61, final SubLObject var92) {
        assert NIL != f26190(var92) : var92;
        SubLObject var93 = module0364.f24735(var61);
        SubLObject var94 = (SubLObject)NIL;
        var94 = var93.first();
        while (NIL != var93) {
            if (NIL != module0339.f22743((SubLObject)NIL, var61, var94) && NIL != module0364.f24762(var61, var94)) {
                final SubLObject var95 = module0364.f24736(var94);
                if (NIL != f26328(var95, var92)) {
                    return (SubLObject)T;
                }
            }
            var93 = var93.rest();
            var94 = var93.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26410(final SubLObject var61) {
        SubLObject var62 = module0364.f24735(var61);
        SubLObject var63 = (SubLObject)NIL;
        var63 = var62.first();
        while (NIL != var62) {
            if (NIL != module0339.f22743((SubLObject)NIL, var61, var63) && NIL != module0364.f24762(var61, var63)) {
                final SubLObject var64 = module0364.f24736(var63);
                if (NIL != module0363.f24680(var64)) {
                    return (SubLObject)T;
                }
            }
            var62 = var62.rest();
            var63 = var62.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26407(final SubLObject var61) {
        return module0381.f27029(var61);
    }
    
    public static SubLObject f26411(final SubLObject var75, final SubLObject var264) {
        final SubLObject var265 = module0381.f27134(var75, var264);
        return (SubLObject)makeBoolean(NIL != var265 && NIL != module0363.f24681(var265));
    }
    
    public static SubLObject f26412(final SubLObject var248, final SubLObject var264, final SubLObject var327, final SubLObject var92) {
        if (NIL != f26406(var248, var327, var92, (SubLObject)T)) {
            return (SubLObject)T;
        }
        if (NIL != module0375.f26571(var248)) {
            return f26411(var248, var264);
        }
        if (NIL != module0376.f26613(var248)) {
            SubLObject var328 = (SubLObject)NIL;
            SubLObject var329 = module0364.f24768(var248);
            SubLObject var330 = (SubLObject)NIL;
            var330 = var329.first();
            while (NIL != var329) {
                if (NIL != module0363.f24538(var330, (SubLObject)$ic99$)) {
                    final SubLObject var331 = module0381.f27043(var264, var330);
                    if (NIL != var331) {
                        var328 = (SubLObject)T;
                        if (NIL == module0363.f24681(var331)) {
                            return (SubLObject)NIL;
                        }
                    }
                }
                var329 = var329.rest();
                var330 = var329.first();
            }
            return var328;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26396(final SubLObject var61) {
        return module0035.f2169(module0364.f24721(var61), (SubLObject)$ic165$);
    }
    
    public static SubLObject f26346(final SubLObject var226) {
        final SubLObject var227 = module0374.f26533(var226);
        final SubLObject var228 = module0374.f26538(var226);
        final SubLObject var229 = var227;
        final SubLObject var230 = module0077.f5333(inference_datastructures_inference_oc.f25473(var229));
        SubLObject var231;
        SubLObject var232;
        SubLObject var233;
        SubLObject var234;
        for (var231 = module0032.f1741(var230), var232 = (SubLObject)NIL, var232 = module0032.f1742(var231, var230); NIL == module0032.f1744(var231, var232); var232 = module0032.f1743(var232)) {
            var233 = module0032.f1745(var231, var232);
            if (NIL != module0032.f1746(var232, var233)) {
                var234 = module0367.f25063(var233);
                if ($ic166$ != var234) {
                    f26413(var233, var234, var226, var228);
                }
            }
        }
        return var226;
    }
    
    public static SubLObject f26300(final SubLObject var61) {
        if (NIL != module0374.f26529(var61)) {
            return f26346(var61);
        }
        final SubLObject var62 = module0364.f24725(var61);
        if (NIL != f26414(var62)) {
            SubLObject var63 = module0364.f24735(var61);
            SubLObject var64 = (SubLObject)NIL;
            var64 = var63.first();
            while (NIL != var63) {
                if (NIL != module0339.f22743((SubLObject)NIL, var61, var64) && NIL != f26415(var61, var64)) {
                    final SubLObject var65 = module0364.f24736(var64);
                    f26416(var62, var61, var65);
                }
                var63 = var63.rest();
                var64 = var63.first();
            }
        }
        return var61;
    }
    
    public static SubLObject f26414(final SubLObject var11) {
        final SubLObject var12 = module0363.f24507(var11);
        final SubLObject var13 = module0361.f24123(var12);
        if (NIL == module0065.f4772(var13, (SubLObject)$ic26$)) {
            final SubLObject var24_385 = var13;
            if (NIL == module0065.f4775(var24_385, (SubLObject)$ic26$)) {
                final SubLObject var14 = module0065.f4740(var24_385);
                final SubLObject var15 = (SubLObject)NIL;
                SubLObject var16;
                SubLObject var17;
                SubLObject var18;
                SubLObject var19;
                SubLObject var20;
                SubLObject var21;
                SubLObject var22;
                SubLObject var23;
                SubLObject var24;
                for (var16 = Sequences.length(var14), var17 = (SubLObject)NIL, var17 = (SubLObject)ZERO_INTEGER; var17.numL(var16); var17 = Numbers.add(var17, (SubLObject)ONE_INTEGER)) {
                    var18 = ((NIL != var15) ? Numbers.subtract(var16, var17, (SubLObject)ONE_INTEGER) : var17);
                    var19 = Vectors.aref(var14, var18);
                    if (NIL == module0065.f4749(var19) || NIL == module0065.f4773((SubLObject)$ic26$)) {
                        if (NIL != module0065.f4749(var19)) {
                            var19 = (SubLObject)$ic26$;
                        }
                        if (NIL != module0363.f24547(var11, var19)) {
                            var20 = var19;
                            var21 = module0077.f5333(inference_datastructures_inference_oc.f25473(var20));
                            for (var22 = module0032.f1741(var21), var23 = (SubLObject)NIL, var23 = module0032.f1742(var22, var21); NIL == module0032.f1744(var22, var23); var23 = module0032.f1743(var23)) {
                                var24 = module0032.f1745(var22, var23);
                                if (NIL != module0032.f1746(var23, var24) && $ic166$ != module0367.f25063(var24) && $ic166$ != module0367.f25094(var24, var11)) {
                                    return (SubLObject)T;
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject var37_386 = var13;
            if (NIL == module0065.f4777(var37_386)) {
                final SubLObject var25 = module0065.f4738(var37_386);
                SubLObject var26 = (SubLObject)NIL;
                SubLObject var27 = (SubLObject)NIL;
                final Iterator var28 = Hashtables.getEntrySetIterator(var25);
                try {
                    while (Hashtables.iteratorHasNext(var28)) {
                        final Map.Entry var29 = Hashtables.iteratorNextEntry(var28);
                        var26 = Hashtables.getEntryKey(var29);
                        var27 = Hashtables.getEntryValue(var29);
                        if (NIL != module0363.f24547(var11, var27)) {
                            final SubLObject var30 = var27;
                            final SubLObject var31 = module0077.f5333(inference_datastructures_inference_oc.f25473(var30));
                            SubLObject var32;
                            SubLObject var33;
                            SubLObject var34;
                            for (var32 = module0032.f1741(var31), var33 = (SubLObject)NIL, var33 = module0032.f1742(var32, var31); NIL == module0032.f1744(var32, var33); var33 = module0032.f1743(var33)) {
                                var34 = module0032.f1745(var32, var33);
                                if (NIL != module0032.f1746(var33, var34) && $ic166$ != module0367.f25063(var34) && $ic166$ != module0367.f25094(var34, var11)) {
                                    return (SubLObject)T;
                                }
                            }
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var28);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26416(final SubLObject var11, final SubLObject var61, final SubLObject var53) {
        final SubLObject var62 = module0363.f24507(var11);
        final SubLObject var63 = module0361.f24123(var62);
        if (NIL == module0065.f4772(var63, (SubLObject)$ic26$)) {
            final SubLObject var24_387 = var63;
            if (NIL == module0065.f4775(var24_387, (SubLObject)$ic26$)) {
                final SubLObject var64 = module0065.f4740(var24_387);
                final SubLObject var65 = (SubLObject)NIL;
                SubLObject var66;
                SubLObject var67;
                SubLObject var68;
                SubLObject var69;
                SubLObject var70;
                SubLObject var71;
                SubLObject var72;
                SubLObject var73;
                SubLObject var74;
                SubLObject var75;
                for (var66 = Sequences.length(var64), var67 = (SubLObject)NIL, var67 = (SubLObject)ZERO_INTEGER; var67.numL(var66); var67 = Numbers.add(var67, (SubLObject)ONE_INTEGER)) {
                    var68 = ((NIL != var65) ? Numbers.subtract(var66, var67, (SubLObject)ONE_INTEGER) : var67);
                    var69 = Vectors.aref(var64, var68);
                    if (NIL == module0065.f4749(var69) || NIL == module0065.f4773((SubLObject)$ic26$)) {
                        if (NIL != module0065.f4749(var69)) {
                            var69 = (SubLObject)$ic26$;
                        }
                        if (NIL != module0363.f24547(var11, var69)) {
                            var70 = var69;
                            var71 = module0077.f5333(inference_datastructures_inference_oc.f25473(var70));
                            for (var72 = module0032.f1741(var71), var73 = (SubLObject)NIL, var73 = module0032.f1742(var72, var71); NIL == module0032.f1744(var72, var73); var73 = module0032.f1743(var73)) {
                                var74 = module0032.f1745(var72, var73);
                                if (NIL != module0032.f1746(var73, var74) && $ic166$ != module0367.f25063(var74)) {
                                    var75 = module0367.f25094(var74, var11);
                                    if ($ic166$ != var75) {
                                        f26413(var74, var75, var61, var53);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject var37_388 = var63;
            if (NIL == module0065.f4777(var37_388)) {
                final SubLObject var76 = module0065.f4738(var37_388);
                SubLObject var77 = (SubLObject)NIL;
                SubLObject var78 = (SubLObject)NIL;
                final Iterator var79 = Hashtables.getEntrySetIterator(var76);
                try {
                    while (Hashtables.iteratorHasNext(var79)) {
                        final Map.Entry var80 = Hashtables.iteratorNextEntry(var79);
                        var77 = Hashtables.getEntryKey(var80);
                        var78 = Hashtables.getEntryValue(var80);
                        if (NIL != module0363.f24547(var11, var78)) {
                            final SubLObject var81 = var78;
                            final SubLObject var82 = module0077.f5333(inference_datastructures_inference_oc.f25473(var81));
                            SubLObject var83;
                            SubLObject var84;
                            SubLObject var85;
                            SubLObject var86;
                            for (var83 = module0032.f1741(var82), var84 = (SubLObject)NIL, var84 = module0032.f1742(var83, var82); NIL == module0032.f1744(var83, var84); var84 = module0032.f1743(var84)) {
                                var85 = module0032.f1745(var83, var84);
                                if (NIL != module0032.f1746(var84, var85) && $ic166$ != module0367.f25063(var85)) {
                                    var86 = module0367.f25094(var85, var11);
                                    if ($ic166$ != var86) {
                                        f26413(var85, var86, var61, var53);
                                    }
                                }
                            }
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var79);
                }
            }
        }
        return var11;
    }
    
    public static SubLObject f26417(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic167$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic167$);
        var7 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic167$);
        var8 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic167$);
        var9 = var5.first();
        var5 = var5.rest();
        if (NIL == var5) {
            final SubLObject var10;
            var5 = (var10 = var6);
            return (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.list((SubLObject)$ic168$, var8, var9))), (SubLObject)ConsesLow.listS((SubLObject)$ic169$, (SubLObject)ConsesLow.list((SubLObject)$ic170$, var7), ConsesLow.append(var10, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic167$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26413(final SubLObject var36, final SubLObject var384, final SubLObject var61, final SubLObject var53) {
        if (NIL != module0374.f26529(var61)) {
            f26418(var36, var53, var384);
        }
        else if (NIL != module0381.f27029(var61)) {
            SubLObject var385 = module0371.f25975(var384, (SubLObject)$ic171$);
            if (NIL != var385) {
                f26419(var36, var385, var61, var53);
            }
            var385 = module0371.f25975(var384, (SubLObject)$ic172$);
            if (NIL != var385) {
                f26420(var36, var385, var61, var53);
            }
        }
        else if (NIL != module0375.f26571(var61)) {
            final SubLObject var385 = module0371.f25975(var384, (SubLObject)$ic173$);
            if (NIL != var385) {
                f26421(var36, var385, var61, var53);
            }
        }
        else if (NIL != module0380.f26955(var61)) {
            final SubLObject var385 = module0371.f25975(var384, (SubLObject)$ic174$);
            if (NIL != var385) {
                f26422(var36, var385, var61, var53);
            }
        }
        else if (NIL != module0382.f27173(var61)) {
            final SubLObject var385 = module0371.f25975(var384, (SubLObject)$ic175$);
            if (NIL != var385) {
                f26423(var36, var385, var61, var53);
            }
        }
        else if (NIL != f26154(var61)) {
            final SubLObject var385 = module0371.f25975(var384, (SubLObject)$ic176$);
            if (NIL != var385) {
                f26424(var36, var385, var61, var53);
            }
        }
        else if (NIL != module0375.f26587(var61)) {
            f26425(var36, var384, var61, var53);
        }
        else if (NIL != module0377.f26746(var61)) {
            final SubLObject var385 = module0371.f25975(var384, (SubLObject)$ic177$);
            if (NIL != var385) {
                f26426(var36, var385, var61, var53);
            }
        }
        else if (NIL != module0378.f26860(var61)) {
            final SubLObject var385 = module0371.f25975(var384, (SubLObject)$ic172$);
            if (NIL != var385) {
                f26427(var36, var385, var61, var53);
            }
        }
        else {
            if (NIL == module0383.f27227(var61)) {
                return Errors.error((SubLObject)$ic179$, module0364.f24721(var61));
            }
            final SubLObject var385 = module0371.f25975(var384, (SubLObject)$ic178$);
            if (NIL != var385) {
                f26428(var36, var385, var61, var53);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26415(final SubLObject var61, final SubLObject var225) {
        return (SubLObject)T;
    }
    
    public static SubLObject f26429(final SubLObject var384, final SubLObject var393) {
        return (SubLObject)makeBoolean(NIL != module0371.f25975(var384, var393));
    }
    
    public static SubLObject f26418(final SubLObject var36, final SubLObject var11, final SubLObject var384) {
        final SubLObject var385 = module0367.f25106(var36, var11, var384);
        if (NIL != var385) {
            final SubLObject var386 = module0363.f24527(var11);
            SubLObject var387;
            SubLObject var388;
            SubLObject var389;
            for (var387 = module0032.f1741(var386), var388 = (SubLObject)NIL, var388 = module0032.f1742(var387, var386); NIL == module0032.f1744(var387, var388); var388 = module0032.f1743(var388)) {
                var389 = module0032.f1745(var387, var388);
                if (NIL != module0032.f1746(var388, var389)) {
                    f26300(var389);
                }
            }
        }
        return var385;
    }
    
    public static SubLObject f26419(final SubLObject var36, final SubLObject var384, final SubLObject var61, final SubLObject var53) {
        if (NIL != module0371.f25976(var384)) {
            SubLObject var385 = var384.rest();
            SubLObject var386 = (SubLObject)NIL;
            var386 = var385.first();
            while (NIL != var385) {
                f26430(var36, var386, var61, var53);
                var385 = var385.rest();
                var386 = var385.first();
            }
        }
        else {
            f26430(var36, var384, var61, var53);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26430(final SubLObject var36, final SubLObject var384, final SubLObject var61, final SubLObject var53) {
        if (var53.eql(module0381.f27050(var61))) {
            final SubLObject var385 = module0371.f25966(var384);
            if (NIL != module0371.f26047(var385, var53)) {
                f26418(var36, var53, var385);
            }
        }
        if (var53.eql(module0381.f27051(var61))) {
            final SubLObject var386 = module0371.f25964(var384);
            if (NIL != module0371.f26047(var386, var53)) {
                f26418(var36, var53, var386);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26428(final SubLObject var36, final SubLObject var384, final SubLObject var61, final SubLObject var53) {
        if (var53.eql(module0383.f27232(var61))) {
            final SubLObject var385 = module0371.f25967(var384);
            if (NIL != module0371.f26047(var385, var53)) {
                f26418(var36, var53, var385);
                return var385;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26420(final SubLObject var36, final SubLObject var384, final SubLObject var61, final SubLObject var53) {
        if (NIL != module0371.f25976(var384)) {
            SubLObject var385 = var384.rest();
            SubLObject var386 = (SubLObject)NIL;
            var386 = var385.first();
            while (NIL != var385) {
                f26431(var36, var386, var61, var53);
                var385 = var385.rest();
                var386 = var385.first();
            }
        }
        else {
            f26431(var36, var384, var61, var53);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26431(final SubLObject var36, final SubLObject var384, final SubLObject var61, final SubLObject var53) {
        final SubLObject var385 = module0371.f25974(var384);
        return f26419(var36, var385, var61, var53);
    }
    
    public static SubLObject f26421(final SubLObject var36, final SubLObject var384, final SubLObject var61, final SubLObject var53) {
        final SubLObject var385 = module0371.f25963(var384);
        if (NIL != module0371.f26047(var385, var53)) {
            f26418(var36, var53, var385);
            return var385;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26422(final SubLObject var36, final SubLObject var384, final SubLObject var61, final SubLObject var53) {
        final SubLObject var385 = module0371.f25965(var384);
        SubLObject var386 = (SubLObject)NIL;
        SubLObject var387 = var385;
        SubLObject var388 = (SubLObject)NIL;
        var388 = var387.first();
        while (NIL != var387) {
            if (NIL != module0371.f26047(var388, var53)) {
                f26418(var36, var53, var388);
                var386 = var388;
            }
            var387 = var387.rest();
            var388 = var387.first();
        }
        return var386;
    }
    
    public static SubLObject f26423(final SubLObject var36, final SubLObject var384, final SubLObject var61, final SubLObject var53) {
        final SubLThread var385 = SubLProcess.currentSubLThread();
        final SubLObject var386 = (SubLObject)((NIL != module0371.f25976(var384)) ? var384.rest() : ConsesLow.list(var384));
        SubLObject var387 = (SubLObject)NIL;
        SubLObject var388 = var386;
        SubLObject var389 = (SubLObject)NIL;
        var389 = var388.first();
        while (NIL != var388) {
            SubLObject var391;
            final SubLObject var390 = var391 = var389;
            SubLObject var392 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var391, var390, (SubLObject)$ic180$);
            var392 = var391.first();
            final SubLObject var393;
            var391 = (var393 = var391.rest());
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var385) && $ic53$ != var392) {
                Errors.error((SubLObject)$ic181$, var389, var61);
            }
            SubLObject var43_412 = var393;
            SubLObject var394 = (SubLObject)NIL;
            var394 = var43_412.first();
            while (NIL != var43_412) {
                final SubLObject var395 = module0371.f25973(var394);
                if (NIL != module0035.sublisp_boolean(var395)) {
                    if (NIL != module0384.f27391(var395, var53)) {
                        var387 = (SubLObject)ConsesLow.cons(var394, var387);
                    }
                }
                else {
                    var387 = (SubLObject)ConsesLow.cons(var394, var387);
                }
                var43_412 = var43_412.rest();
                var394 = var43_412.first();
            }
            var388 = var388.rest();
            var389 = var388.first();
        }
        if (NIL != module0035.sublisp_boolean(var387)) {
            final SubLObject var396 = module0371.f25977(var387);
            f26418(var36, var53, var396);
        }
        return var36;
    }
    
    public static SubLObject f26424(final SubLObject var36, final SubLObject var384, final SubLObject var61, final SubLObject var53) {
        return var36;
    }
    
    public static SubLObject f26425(final SubLObject var36, final SubLObject var384, final SubLObject var61, final SubLObject var53) {
        return var36;
    }
    
    public static SubLObject f26426(final SubLObject var36, final SubLObject var384, final SubLObject var61, final SubLObject var53) {
        if (NIL != module0371.f25976(var384)) {
            SubLObject var385 = var384.rest();
            SubLObject var386 = (SubLObject)NIL;
            var386 = var385.first();
            while (NIL != var385) {
                f26432(var36, var386, var61, var53);
                var385 = var385.rest();
                var386 = var385.first();
            }
        }
        else {
            f26432(var36, var384, var61, var53);
        }
        return var36;
    }
    
    public static SubLObject f26432(final SubLObject var36, final SubLObject var416, final SubLObject var61, final SubLObject var53) {
        assert NIL != module0371.f25944(var416) : var416;
        final SubLObject var417 = module0377.f26749(var61);
        final SubLObject var418 = module0371.f25969(var416);
        if (NIL != module0384.f27394(var418, var417)) {
            final SubLObject var419 = module0371.f25970(var416);
            if (NIL != module0371.f26047(var419, var53)) {
                f26418(var36, var53, var419);
                return var419;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26427(final SubLObject var36, final SubLObject var384, final SubLObject var61, final SubLObject var53) {
        if (NIL != module0371.f25976(var384)) {
            SubLObject var385 = var384.rest();
            SubLObject var386 = (SubLObject)NIL;
            var386 = var385.first();
            while (NIL != var385) {
                f26433(var36, var386, var61, var53);
                var385 = var385.rest();
                var386 = var385.first();
            }
        }
        else {
            f26433(var36, var384, var61, var53);
        }
        return var36;
    }
    
    public static SubLObject f26433(final SubLObject var36, final SubLObject var384, final SubLObject var61, final SubLObject var53) {
        assert NIL != module0371.f25945(var384) : var384;
        final SubLObject var385 = module0378.f26878(var61);
        final SubLObject var386 = module0371.f25971(var384);
        if (NIL != module0384.f27394(var386, var385)) {
            final SubLObject var387 = module0371.f25972(var384);
            if (NIL != module0371.f26047(var387, var53)) {
                f26418(var36, var53, var387);
                return var387;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26242(final SubLObject var15, final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        var21.resetMultipleValues();
        final SubLObject var22 = f26434(var15, var20, (SubLObject)NIL);
        final SubLObject var23 = var21.secondMultipleValue();
        final SubLObject var24 = var21.thirdMultipleValue();
        var21.resetMultipleValues();
        if (NIL != var22) {
            final SubLObject var25 = module0364.f24804(var22, var23);
            return var25;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26435(final SubLObject var15, final SubLObject var20, SubLObject var421) {
        if (var421 == UNPROVIDED) {
            var421 = (SubLObject)NIL;
        }
        final SubLThread var422 = SubLProcess.currentSubLThread();
        module0413.f28829(module0339.f22757());
        var422.resetMultipleValues();
        SubLObject var423 = f26434(var15, var20, var421);
        final SubLObject var424 = var422.secondMultipleValue();
        final SubLObject var425 = var422.thirdMultipleValue();
        var422.resetMultipleValues();
        if (NIL == var423) {
            var423 = module0363.f24511(var15, var425);
        }
        return module0364.f24804(var423, var424);
    }
    
    public static SubLObject f26434(final SubLObject var15, final SubLObject var20, final SubLObject var421) {
        final SubLThread var422 = SubLProcess.currentSubLThread();
        final SubLObject var424;
        final SubLObject var423 = var424 = module0361.f24158(var15);
        if (var424.eql((SubLObject)$ic182$)) {
            final SubLObject var425 = module0361.f24239(var15, var20);
            final SubLObject var426 = (SubLObject)NIL;
            return Values.values(var425, var426, var20);
        }
        if (var424.eql((SubLObject)$ic183$)) {
            var422.resetMultipleValues();
            final SubLObject var427 = module0370.f25838(var20);
            final SubLObject var428 = var422.secondMultipleValue();
            var422.resetMultipleValues();
            final SubLObject var429 = module0361.f24239(var15, var427);
            if (NIL == var429 && NIL != var421) {
                var422.resetMultipleValues();
                final SubLObject var430 = module0361.f24346(var15, var427);
                final SubLObject var431 = var422.secondMultipleValue();
                var422.resetMultipleValues();
                if (NIL != var430) {
                    final SubLObject var432 = module0363.f24509(var430);
                    final SubLObject var433 = module0233.f15388(var431, var428);
                    return Values.values(var430, var433, var432);
                }
            }
            return Values.values(var429, var428, var427);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26436(final SubLObject var15, final SubLObject var44, final SubLObject var45) {
        final SubLObject var46 = module0362.f24453(var44, var45);
        return f26435(var15, var46, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f26437(final SubLObject var15, final SubLObject var428) {
        final SubLObject var429 = module0362.f24449(var428);
        return f26435(var15, var429, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f26438(final SubLObject var15, final SubLObject var428, final SubLObject var429) {
        final SubLObject var430 = module0362.f24451(var428, var429);
        return f26435(var15, var430, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f26439(final SubLObject var15, final SubLObject var428, final SubLObject var429) {
        final SubLObject var430 = module0362.f24452(var428, var429);
        return f26435(var15, var430, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f26440(final SubLObject var175) {
        final SubLObject var176 = inference_datastructures_inference_oc.f25421(var175);
        final SubLObject var177 = inference_datastructures_inference_oc.f25487(var175);
        final SubLObject var178 = f26441(var176, var177);
        f26442(var175, var178);
        return var178;
    }
    
    public static SubLObject f26442(final SubLObject var175, final SubLObject var432) {
        final SubLObject var433 = module0374.f26530(var175);
        module0364.f24783(var432, var433);
        final SubLObject var434 = module0364.f24736(var432);
        module0361.f24385(module0363.f24507(var434), var434);
        return var433;
    }
    
    public static SubLObject f26441(final SubLObject var15, final SubLObject var20) {
        return f26435(var15, var20, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f26443(final SubLObject var15, SubLObject var327) {
        if (var327 == UNPROVIDED) {
            var327 = (SubLObject)T;
        }
        final SubLObject var328 = module0361.f24228(var15);
        final SubLObject var329 = module0361.f24312(var15);
        f26444(var15, var327);
        SubLObject var330 = (SubLObject)ZERO_INTEGER;
        SubLObject var331 = (SubLObject)ZERO_INTEGER;
        var330 = f26445(var15);
        var331 = f26446(var15);
        if (NIL != $g3183$.getGlobalValue()) {
            final SubLObject var332 = module0361.f24228(var15);
            final SubLObject var333 = module0361.f24312(var15);
            if (NIL != module0004.f105(var330) || NIL != module0004.f105(var331)) {
                module0006.f218((SubLObject)T, (SubLObject)$ic185$, var330, var328, var332, var331, var329, var333, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        module0361.f24426(var15);
        return Numbers.add(var330, var331);
    }
    
    public static SubLObject f26446(final SubLObject var15) {
        SubLObject var16 = (SubLObject)ZERO_INTEGER;
        SubLObject var17 = (SubLObject)ZERO_INTEGER;
        final SubLObject var18 = module0361.f24128(var15);
        if (NIL == module0065.f4772(var18, (SubLObject)$ic26$)) {
            final SubLObject var24_441 = var18;
            if (NIL == module0065.f4775(var24_441, (SubLObject)$ic26$)) {
                final SubLObject var19 = module0065.f4740(var24_441);
                final SubLObject var20 = (SubLObject)NIL;
                SubLObject var21;
                SubLObject var22;
                SubLObject var23;
                SubLObject var24;
                SubLObject var25;
                SubLObject var26;
                SubLObject var27;
                for (var21 = Sequences.length(var19), var22 = (SubLObject)NIL, var22 = (SubLObject)ZERO_INTEGER; var22.numL(var21); var22 = Numbers.add(var22, (SubLObject)ONE_INTEGER)) {
                    var23 = ((NIL != var20) ? Numbers.subtract(var21, var22, (SubLObject)ONE_INTEGER) : var22);
                    var24 = Vectors.aref(var19, var23);
                    if (NIL == module0065.f4749(var24) || NIL == module0065.f4773((SubLObject)$ic26$)) {
                        if (NIL != module0065.f4749(var24)) {
                            var24 = (SubLObject)$ic26$;
                        }
                        if (NIL != module0363.f24504(var24)) {
                            var25 = module0363.f24619(var24);
                            var26 = (SubLObject)NIL;
                            var26 = var25.first();
                            while (NIL != var25) {
                                var27 = (SubLObject)((NIL != f26151(var26)) ? f26153(var26) : NIL);
                                if (NIL != var27 && NIL != module0364.f24760(var27)) {
                                    module0364.f24731(var27);
                                    var17 = Numbers.add(var17, (SubLObject)ONE_INTEGER);
                                }
                                module0365.f24861(var26);
                                var16 = Numbers.add(var16, (SubLObject)ONE_INTEGER);
                                var25 = var25.rest();
                                var26 = var25.first();
                            }
                        }
                    }
                }
            }
            final SubLObject var37_443 = var18;
            if (NIL == module0065.f4777(var37_443)) {
                final SubLObject var28 = module0065.f4738(var37_443);
                SubLObject var29 = (SubLObject)NIL;
                SubLObject var30 = (SubLObject)NIL;
                final Iterator var31 = Hashtables.getEntrySetIterator(var28);
                try {
                    while (Hashtables.iteratorHasNext(var31)) {
                        final Map.Entry var32 = Hashtables.iteratorNextEntry(var31);
                        var29 = Hashtables.getEntryKey(var32);
                        var30 = Hashtables.getEntryValue(var32);
                        if (NIL != module0363.f24504(var30)) {
                            SubLObject var33 = module0363.f24619(var30);
                            SubLObject var34 = (SubLObject)NIL;
                            var34 = var33.first();
                            while (NIL != var33) {
                                final SubLObject var35 = (SubLObject)((NIL != f26151(var34)) ? f26153(var34) : NIL);
                                if (NIL != var35 && NIL != module0364.f24760(var35)) {
                                    module0364.f24731(var35);
                                    var17 = Numbers.add(var17, (SubLObject)ONE_INTEGER);
                                }
                                module0365.f24861(var34);
                                var16 = Numbers.add(var16, (SubLObject)ONE_INTEGER);
                                var33 = var33.rest();
                                var34 = var33.first();
                            }
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var31);
                }
            }
        }
        return Values.values(var16, var17);
    }
    
    public static SubLObject f26447(final SubLObject var6, final SubLObject var444) {
        if (NIL != var444) {
            return module0384.f27275(var444, var6, (SubLObject)NIL, (SubLObject)NIL);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26445(final SubLObject var15) {
        final SubLObject var16 = module0361.f24179(var15);
        final SubLObject var17 = f26448(var16);
        module0361.f24189(var15);
        SubLObject var18 = var17;
        SubLObject var19 = (SubLObject)NIL;
        var19 = var18.first();
        while (NIL != var18) {
            module0363.f24544(var19);
            var18 = var18.rest();
            var19 = var18.first();
        }
        return Sequences.length(var17);
    }
    
    public static SubLObject f26444(final SubLObject var15, SubLObject var327) {
        if (var327 == UNPROVIDED) {
            var327 = (SubLObject)T;
        }
        module0361.f24189(var15);
        final SubLObject var328 = module0361.f24179(var15);
        if (NIL != var327) {
            f26449(var328);
        }
        module0361.f24417(var328);
        f26450(var328);
        f26451(var328);
        f26452(var328);
        f26453(var328);
        f26454(var328);
        return module0361.f24416(var328);
    }
    
    public static SubLObject f26449(final SubLObject var445) {
        final SubLObject var446 = module0361.f24411(var445);
        final SubLObject var447 = module0361.f24248(var446);
        f26455(var446);
        SubLObject var448 = (SubLObject)NIL;
        final SubLObject var449 = module0361.f24128(var446);
        if (NIL == module0065.f4772(var449, (SubLObject)$ic26$)) {
            final SubLObject var24_449 = var449;
            if (NIL == module0065.f4775(var24_449, (SubLObject)$ic26$)) {
                final SubLObject var450 = module0065.f4740(var24_449);
                final SubLObject var451 = (SubLObject)NIL;
                SubLObject var452;
                SubLObject var453;
                SubLObject var454;
                SubLObject var455;
                for (var452 = Sequences.length(var450), var453 = (SubLObject)NIL, var453 = (SubLObject)ZERO_INTEGER; var453.numL(var452); var453 = Numbers.add(var453, (SubLObject)ONE_INTEGER)) {
                    var454 = ((NIL != var451) ? Numbers.subtract(var452, var453, (SubLObject)ONE_INTEGER) : var453);
                    var455 = Vectors.aref(var450, var454);
                    if (NIL == module0065.f4749(var455) || NIL == module0065.f4773((SubLObject)$ic26$)) {
                        if (NIL != module0065.f4749(var455)) {
                            var455 = (SubLObject)$ic26$;
                        }
                        var448 = (SubLObject)ConsesLow.cons(var455, var448);
                    }
                }
            }
            final SubLObject var37_450 = var449;
            if (NIL == module0065.f4777(var37_450)) {
                final SubLObject var456 = module0065.f4738(var37_450);
                SubLObject var457 = (SubLObject)NIL;
                SubLObject var458 = (SubLObject)NIL;
                final Iterator var459 = Hashtables.getEntrySetIterator(var456);
                try {
                    while (Hashtables.iteratorHasNext(var459)) {
                        final Map.Entry var460 = Hashtables.iteratorNextEntry(var459);
                        var457 = Hashtables.getEntryKey(var460);
                        var458 = Hashtables.getEntryValue(var460);
                        var448 = (SubLObject)ConsesLow.cons(var458, var448);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var459);
                }
            }
        }
        SubLObject var461;
        var448 = (var461 = Sort.sort(var448, Symbols.symbol_function((SubLObject)$ic186$), (SubLObject)$ic187$));
        SubLObject var462 = (SubLObject)NIL;
        var462 = var461.first();
        while (NIL != var461) {
            f26120(var462, (SubLObject)T, (SubLObject)$ic25$, (SubLObject)T);
            var461 = var461.rest();
            var462 = var461.first();
        }
        final SubLObject var463 = module0361.f24248(var446);
        return Numbers.subtract(var463, var447);
    }
    
    public static SubLObject f26455(final SubLObject var15) {
        module0361.f24384(var15);
        final SubLObject var16 = module0055.f4017();
        final SubLObject var17 = module0361.f24128(var15);
        if (NIL == module0065.f4772(var17, (SubLObject)$ic26$)) {
            final SubLObject var24_453 = var17;
            if (NIL == module0065.f4775(var24_453, (SubLObject)$ic26$)) {
                final SubLObject var18 = module0065.f4740(var24_453);
                final SubLObject var19 = (SubLObject)NIL;
                SubLObject var20;
                SubLObject var21;
                SubLObject var22;
                SubLObject var23;
                for (var20 = Sequences.length(var18), var21 = (SubLObject)NIL, var21 = (SubLObject)ZERO_INTEGER; var21.numL(var20); var21 = Numbers.add(var21, (SubLObject)ONE_INTEGER)) {
                    var22 = ((NIL != var19) ? Numbers.subtract(var20, var21, (SubLObject)ONE_INTEGER) : var21);
                    var23 = Vectors.aref(var18, var22);
                    if (NIL == module0065.f4749(var23) || NIL == module0065.f4773((SubLObject)$ic26$)) {
                        if (NIL != module0065.f4749(var23)) {
                            var23 = (SubLObject)$ic26$;
                        }
                        if (NIL != module0363.f24604(var23) || NIL == module0363.f24602(var23)) {
                            module0363.f24671(var23, (SubLObject)ZERO_INTEGER);
                            module0055.f4021(var23, var16);
                        }
                    }
                }
            }
            final SubLObject var37_454 = var17;
            if (NIL == module0065.f4777(var37_454)) {
                final SubLObject var24 = module0065.f4738(var37_454);
                SubLObject var25 = (SubLObject)NIL;
                SubLObject var26 = (SubLObject)NIL;
                final Iterator var27 = Hashtables.getEntrySetIterator(var24);
                try {
                    while (Hashtables.iteratorHasNext(var27)) {
                        final Map.Entry var28 = Hashtables.iteratorNextEntry(var27);
                        var25 = Hashtables.getEntryKey(var28);
                        var26 = Hashtables.getEntryValue(var28);
                        if (NIL != module0363.f24604(var26) || NIL == module0363.f24602(var26)) {
                            module0363.f24671(var26, (SubLObject)ZERO_INTEGER);
                            module0055.f4021(var26, var16);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var27);
                }
            }
        }
        while (NIL == module0055.f4019(var16)) {
            final SubLObject var29 = module0055.f4023(var16);
            final SubLObject var30 = module0363.f24654(var29);
            final SubLObject var31 = module0048.f_1X(var30);
            final SubLObject var32 = module0363.f24527(var29);
            SubLObject var33;
            SubLObject var34;
            SubLObject var35;
            SubLObject var36;
            SubLObject var37;
            SubLObject var38;
            SubLObject var39;
            SubLObject var40;
            SubLObject var41;
            for (var33 = module0032.f1741(var32), var34 = (SubLObject)NIL, var34 = module0032.f1742(var33, var32); NIL == module0032.f1744(var33, var34); var34 = module0032.f1743(var34)) {
                var35 = module0032.f1745(var33, var34);
                if (NIL != module0032.f1746(var34, var35)) {
                    var36 = var35;
                    var37 = module0364.f24735(var36);
                    var38 = (SubLObject)NIL;
                    var38 = var37.first();
                    while (NIL != var37) {
                        if (NIL != module0339.f22743((SubLObject)NIL, var36, var38)) {
                            var39 = module0364.f24736(var38);
                            var40 = module0364.f24737(var38);
                            var41 = module0363.f24654(var39);
                            if ($ic126$ == var41 || var31.numL(var41)) {
                                module0363.f24671(var39, var31);
                                module0055.f4021(var39, var16);
                            }
                        }
                        var37 = var37.rest();
                        var38 = var37.first();
                    }
                }
            }
        }
        return var15;
    }
    
    public static SubLObject f26450(final SubLObject var445) {
        final SubLObject var446 = module0361.f24411(var445);
        final SubLObject var447 = module0361.f24123(var446);
        if (NIL == module0065.f4772(var447, (SubLObject)$ic26$)) {
            final SubLObject var24_458 = var447;
            if (NIL == module0065.f4775(var24_458, (SubLObject)$ic26$)) {
                final SubLObject var448 = module0065.f4740(var24_458);
                final SubLObject var449 = (SubLObject)NIL;
                SubLObject var450;
                SubLObject var451;
                SubLObject var452;
                SubLObject var453;
                SubLObject var454;
                for (var450 = Sequences.length(var448), var451 = (SubLObject)NIL, var451 = (SubLObject)ZERO_INTEGER; var451.numL(var450); var451 = Numbers.add(var451, (SubLObject)ONE_INTEGER)) {
                    var452 = ((NIL != var449) ? Numbers.subtract(var450, var451, (SubLObject)ONE_INTEGER) : var451);
                    var453 = Vectors.aref(var448, var452);
                    if (NIL == module0065.f4749(var453) || NIL == module0065.f4773((SubLObject)$ic26$)) {
                        if (NIL != module0065.f4749(var453)) {
                            var453 = (SubLObject)$ic26$;
                        }
                        var454 = inference_datastructures_inference_oc.f25597(var453);
                        f26456(var454);
                    }
                }
            }
            final SubLObject var37_459 = var447;
            if (NIL == module0065.f4777(var37_459)) {
                final SubLObject var455 = module0065.f4738(var37_459);
                SubLObject var456 = (SubLObject)NIL;
                SubLObject var457 = (SubLObject)NIL;
                final Iterator var458 = Hashtables.getEntrySetIterator(var455);
                try {
                    while (Hashtables.iteratorHasNext(var458)) {
                        final Map.Entry var459 = Hashtables.iteratorNextEntry(var458);
                        var456 = Hashtables.getEntryKey(var459);
                        var457 = Hashtables.getEntryValue(var459);
                        final SubLObject var460 = inference_datastructures_inference_oc.f25597(var457);
                        f26456(var460);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var458);
                }
            }
        }
        return module0361.f24416(var445);
    }
    
    public static SubLObject f26456(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        final SubLObject var13 = $g3184$.currentBinding(var12);
        try {
            $g3184$.bind((SubLObject)NIL, var12);
            f26457(var11);
        }
        finally {
            $g3184$.rebind(var13, var12);
        }
        return var11;
    }
    
    public static SubLObject f26457(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        if (NIL == module0363.f24651(var11)) {
            final SubLObject var13 = $g3184$.currentBinding(var12);
            try {
                $g3184$.bind((SubLObject)ConsesLow.cons(var11, $g3184$.getDynamicValue(var12)), var12);
                f26458(var11);
                final SubLObject var14 = module0363.f24527(var11);
                SubLObject var15;
                SubLObject var16;
                SubLObject var17;
                SubLObject var18;
                SubLObject var19;
                SubLObject var20;
                SubLObject var21;
                for (var15 = module0032.f1741(var14), var16 = (SubLObject)NIL, var16 = module0032.f1742(var15, var14); NIL == module0032.f1744(var15, var16); var16 = module0032.f1743(var16)) {
                    var17 = module0032.f1745(var15, var16);
                    if (NIL != module0032.f1746(var16, var17)) {
                        var18 = var17;
                        var19 = module0364.f24735(var18);
                        var20 = (SubLObject)NIL;
                        var20 = var19.first();
                        while (NIL != var19) {
                            if (NIL != module0339.f22743((SubLObject)NIL, var18, var20) && NIL == f26459(var17)) {
                                var21 = module0364.f24736(var20);
                                if (NIL == module0035.f2169(var21, $g3184$.getDynamicValue(var12))) {
                                    f26457(var21);
                                }
                            }
                            var19 = var19.rest();
                            var20 = var19.first();
                        }
                    }
                }
            }
            finally {
                $g3184$.rebind(var13, var12);
            }
        }
        return var11;
    }
    
    public static SubLObject f26458(final SubLObject var11) {
        if (NIL != f26460(var11)) {
            module0363.f24676(var11);
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26459(final SubLObject var61) {
        if (NIL != f26461(var61)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26461(final SubLObject var61) {
        if (NIL != module0364.f24760(var61)) {
            final SubLObject var62 = module0364.f24725(var61);
            return (SubLObject)makeBoolean(NIL != module0363.f24686(var62) || NIL != module0363.f24688(var62) || NIL != module0363.f24689(var62));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26462(final SubLObject var61, final SubLObject var225) {
        return (SubLObject)makeBoolean(NIL != f26461(var61) || (NIL != module0381.f27029(var61) && var225.eql(module0381.f27047(var61))));
    }
    
    public static SubLObject f26460(final SubLObject var11) {
        if (NIL == module0363.f24681(var11) && NIL == f26463(var11)) {
            return (SubLObject)T;
        }
        if (NIL != module0378.f26901(var11)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26463(final SubLObject var11) {
        return (SubLObject)makeBoolean(NIL != module0363.f24680(var11) && module0363.f24643(var11, (SubLObject)$ic99$).isZero() && (NIL != module0363.f24689(var11) || (NIL != module0363.f24687(var11) && NIL != module0363.f24612(var11))));
    }
    
    public static SubLObject f26448(final SubLObject var445) {
        SubLObject var446 = (SubLObject)NIL;
        final SubLObject var447 = module0361.f24128(module0361.f24411(var445));
        if (NIL == module0065.f4772(var447, (SubLObject)$ic26$)) {
            final SubLObject var24_461 = var447;
            if (NIL == module0065.f4775(var24_461, (SubLObject)$ic26$)) {
                final SubLObject var448 = module0065.f4740(var24_461);
                final SubLObject var449 = (SubLObject)NIL;
                SubLObject var450;
                SubLObject var451;
                SubLObject var452;
                SubLObject var453;
                for (var450 = Sequences.length(var448), var451 = (SubLObject)NIL, var451 = (SubLObject)ZERO_INTEGER; var451.numL(var450); var451 = Numbers.add(var451, (SubLObject)ONE_INTEGER)) {
                    var452 = ((NIL != var449) ? Numbers.subtract(var450, var451, (SubLObject)ONE_INTEGER) : var451);
                    var453 = Vectors.aref(var448, var452);
                    if (NIL == module0065.f4749(var453) || NIL == module0065.f4773((SubLObject)$ic26$)) {
                        if (NIL != module0065.f4749(var453)) {
                            var453 = (SubLObject)$ic26$;
                        }
                        if (NIL != module0363.f24652(var453)) {
                            var446 = (SubLObject)ConsesLow.cons(var453, var446);
                        }
                    }
                }
            }
            final SubLObject var37_462 = var447;
            if (NIL == module0065.f4777(var37_462)) {
                final SubLObject var454 = module0065.f4738(var37_462);
                SubLObject var455 = (SubLObject)NIL;
                SubLObject var456 = (SubLObject)NIL;
                final Iterator var457 = Hashtables.getEntrySetIterator(var454);
                try {
                    while (Hashtables.iteratorHasNext(var457)) {
                        final Map.Entry var458 = Hashtables.iteratorNextEntry(var457);
                        var455 = Hashtables.getEntryKey(var458);
                        var456 = Hashtables.getEntryValue(var458);
                        if (NIL != module0363.f24652(var456)) {
                            var446 = (SubLObject)ConsesLow.cons(var456, var446);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var457);
                }
            }
        }
        var446 = Sequences.nreverse(var446);
        return var446;
    }
    
    public static SubLObject f26454(final SubLObject var445) {
        final SubLObject var446 = module0361.f24411(var445);
        final SubLObject var447 = module0361.f24123(var446);
        if (NIL == module0065.f4772(var447, (SubLObject)$ic26$)) {
            final SubLObject var24_463 = var447;
            if (NIL == module0065.f4775(var24_463, (SubLObject)$ic26$)) {
                final SubLObject var448 = module0065.f4740(var24_463);
                final SubLObject var449 = (SubLObject)NIL;
                SubLObject var450;
                SubLObject var451;
                SubLObject var452;
                SubLObject var453;
                SubLObject var454;
                for (var450 = Sequences.length(var448), var451 = (SubLObject)NIL, var451 = (SubLObject)ZERO_INTEGER; var451.numL(var450); var451 = Numbers.add(var451, (SubLObject)ONE_INTEGER)) {
                    var452 = ((NIL != var449) ? Numbers.subtract(var450, var451, (SubLObject)ONE_INTEGER) : var451);
                    var453 = Vectors.aref(var448, var452);
                    if (NIL == module0065.f4749(var453) || NIL == module0065.f4773((SubLObject)$ic26$)) {
                        if (NIL != module0065.f4749(var453)) {
                            var453 = (SubLObject)$ic26$;
                        }
                        var454 = inference_datastructures_inference_oc.f25597(var453);
                        module0363.f24676(var454);
                    }
                }
            }
            final SubLObject var37_464 = var447;
            if (NIL == module0065.f4777(var37_464)) {
                final SubLObject var455 = module0065.f4738(var37_464);
                SubLObject var456 = (SubLObject)NIL;
                SubLObject var457 = (SubLObject)NIL;
                final Iterator var458 = Hashtables.getEntrySetIterator(var455);
                try {
                    while (Hashtables.iteratorHasNext(var458)) {
                        final Map.Entry var459 = Hashtables.iteratorNextEntry(var458);
                        var456 = Hashtables.getEntryKey(var459);
                        var457 = Hashtables.getEntryValue(var459);
                        final SubLObject var460 = inference_datastructures_inference_oc.f25597(var457);
                        module0363.f24676(var460);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var458);
                }
            }
        }
        return module0361.f24415(var445);
    }
    
    public static SubLObject f26451(final SubLObject var445) {
        final SubLThread var446 = SubLProcess.currentSubLThread();
        final SubLObject var447 = module0361.f24411(var445);
        final SubLObject var448 = module0361.f24123(var447);
        if (NIL == module0065.f4772(var448, (SubLObject)$ic26$)) {
            final SubLObject var24_465 = var448;
            if (NIL == module0065.f4775(var24_465, (SubLObject)$ic26$)) {
                final SubLObject var449 = module0065.f4740(var24_465);
                final SubLObject var450 = (SubLObject)NIL;
                SubLObject var451;
                SubLObject var452;
                SubLObject var453;
                SubLObject var454;
                SubLObject var455;
                SubLObject var456;
                SubLObject var457;
                SubLObject var458;
                SubLObject var459;
                SubLObject var460;
                SubLObject var461;
                for (var451 = Sequences.length(var449), var452 = (SubLObject)NIL, var452 = (SubLObject)ZERO_INTEGER; var452.numL(var451); var452 = Numbers.add(var452, (SubLObject)ONE_INTEGER)) {
                    var453 = ((NIL != var450) ? Numbers.subtract(var451, var452, (SubLObject)ONE_INTEGER) : var452);
                    var454 = Vectors.aref(var449, var453);
                    if (NIL == module0065.f4749(var454) || NIL == module0065.f4773((SubLObject)$ic26$)) {
                        if (NIL != module0065.f4749(var454)) {
                            var454 = (SubLObject)$ic26$;
                        }
                        var455 = inference_datastructures_inference_oc.f25597(var454);
                        if (NIL != var455) {
                            var456 = (SubLObject)$ic99$;
                            for (var457 = module0066.f4838(module0363.f24537(var455)); NIL == module0066.f4841(var457); var457 = module0066.f4840(var457)) {
                                var446.resetMultipleValues();
                                var458 = module0066.f4839(var457);
                                var459 = var446.secondMultipleValue();
                                var446.resetMultipleValues();
                                var460 = var459;
                                var461 = (SubLObject)NIL;
                                var461 = var460.first();
                                while (NIL != var460) {
                                    if (NIL != module0363.f24538(var461, var456)) {
                                        f26464(var461);
                                    }
                                    var460 = var460.rest();
                                    var461 = var460.first();
                                }
                            }
                            module0066.f4842(var457);
                        }
                    }
                }
            }
            final SubLObject var37_467 = var448;
            if (NIL == module0065.f4777(var37_467)) {
                final SubLObject var462 = module0065.f4738(var37_467);
                SubLObject var463 = (SubLObject)NIL;
                SubLObject var464 = (SubLObject)NIL;
                final Iterator var465 = Hashtables.getEntrySetIterator(var462);
                try {
                    while (Hashtables.iteratorHasNext(var465)) {
                        final Map.Entry var466 = Hashtables.iteratorNextEntry(var465);
                        var463 = Hashtables.getEntryKey(var466);
                        var464 = Hashtables.getEntryValue(var466);
                        final SubLObject var467 = inference_datastructures_inference_oc.f25597(var464);
                        if (NIL != var467) {
                            final SubLObject var468 = (SubLObject)$ic99$;
                            SubLObject var469;
                            for (var469 = module0066.f4838(module0363.f24537(var467)); NIL == module0066.f4841(var469); var469 = module0066.f4840(var469)) {
                                var446.resetMultipleValues();
                                final SubLObject var470 = module0066.f4839(var469);
                                final SubLObject var471 = var446.secondMultipleValue();
                                var446.resetMultipleValues();
                                SubLObject var472 = var471;
                                SubLObject var473 = (SubLObject)NIL;
                                var473 = var472.first();
                                while (NIL != var472) {
                                    if (NIL != module0363.f24538(var473, var468)) {
                                        f26464(var473);
                                    }
                                    var472 = var472.rest();
                                    var473 = var472.first();
                                }
                            }
                            module0066.f4842(var469);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var465);
                }
            }
        }
        return module0361.f24415(var445);
    }
    
    public static SubLObject f26464(final SubLObject var67) {
        if (NIL == module0366.f24985(var67)) {
            final SubLObject var68 = module0366.f24956(var67);
            module0363.f24676(var68);
            SubLObject var69 = module0366.f24938(var67);
            SubLObject var70 = (SubLObject)NIL;
            var70 = var69.first();
            while (NIL != var69) {
                f26464(var70);
                var69 = var69.rest();
                var70 = var69.first();
            }
        }
        return var67;
    }
    
    public static SubLObject f26452(final SubLObject var445) {
        final SubLObject var446 = module0361.f24411(var445);
        final SubLObject var447 = module0361.f24128(var446);
        if (NIL == module0065.f4772(var447, (SubLObject)$ic26$)) {
            final SubLObject var24_468 = var447;
            if (NIL == module0065.f4775(var24_468, (SubLObject)$ic26$)) {
                final SubLObject var448 = module0065.f4740(var24_468);
                final SubLObject var449 = (SubLObject)NIL;
                SubLObject var450;
                SubLObject var451;
                SubLObject var452;
                SubLObject var453;
                for (var450 = Sequences.length(var448), var451 = (SubLObject)NIL, var451 = (SubLObject)ZERO_INTEGER; var451.numL(var450); var451 = Numbers.add(var451, (SubLObject)ONE_INTEGER)) {
                    var452 = ((NIL != var449) ? Numbers.subtract(var450, var451, (SubLObject)ONE_INTEGER) : var451);
                    var453 = Vectors.aref(var448, var452);
                    if (NIL == module0065.f4749(var453) || NIL == module0065.f4773((SubLObject)$ic26$)) {
                        if (NIL != module0065.f4749(var453)) {
                            var453 = (SubLObject)$ic26$;
                        }
                        if (NIL != module0363.f24588(var453)) {
                            module0363.f24676(var453);
                        }
                    }
                }
            }
            final SubLObject var37_469 = var447;
            if (NIL == module0065.f4777(var37_469)) {
                final SubLObject var454 = module0065.f4738(var37_469);
                SubLObject var455 = (SubLObject)NIL;
                SubLObject var456 = (SubLObject)NIL;
                final Iterator var457 = Hashtables.getEntrySetIterator(var454);
                try {
                    while (Hashtables.iteratorHasNext(var457)) {
                        final Map.Entry var458 = Hashtables.iteratorNextEntry(var457);
                        var455 = Hashtables.getEntryKey(var458);
                        var456 = Hashtables.getEntryValue(var458);
                        if (NIL != module0363.f24588(var456)) {
                            module0363.f24676(var456);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var457);
                }
            }
        }
        final SubLObject var459 = f26105();
        if (NIL != var459 && var446.eql(module0365.f24879(var459))) {
            module0363.f24676(module0365.f24850(var459));
        }
        return module0361.f24415(var445);
    }
    
    public static SubLObject f26453(final SubLObject var445) {
        final SubLObject var446 = module0361.f24411(var445);
        final SubLObject var447 = module0361.f24128(var446);
        if (NIL == module0065.f4772(var447, (SubLObject)$ic26$)) {
            final SubLObject var24_471 = var447;
            if (NIL == module0065.f4775(var24_471, (SubLObject)$ic26$)) {
                final SubLObject var448 = module0065.f4740(var24_471);
                final SubLObject var449 = (SubLObject)NIL;
                SubLObject var450;
                SubLObject var451;
                SubLObject var452;
                SubLObject var453;
                SubLObject var454;
                SubLObject var455;
                SubLObject var456;
                SubLObject var457;
                SubLObject var458;
                SubLObject var459;
                SubLObject var33_474;
                SubLObject var34_475;
                SubLObject var35_476;
                SubLObject var460;
                SubLObject var461;
                for (var450 = Sequences.length(var448), var451 = (SubLObject)NIL, var451 = (SubLObject)ZERO_INTEGER; var451.numL(var450); var451 = Numbers.add(var451, (SubLObject)ONE_INTEGER)) {
                    var452 = ((NIL != var449) ? Numbers.subtract(var450, var451, (SubLObject)ONE_INTEGER) : var451);
                    var453 = Vectors.aref(var448, var452);
                    if (NIL == module0065.f4749(var453) || NIL == module0065.f4773((SubLObject)$ic26$)) {
                        if (NIL != module0065.f4749(var453)) {
                            var453 = (SubLObject)$ic26$;
                        }
                        var454 = (SubLObject)NIL;
                        var455 = module0363.f24530(var453);
                        for (var456 = module0032.f1741(var455), var457 = (SubLObject)NIL, var457 = module0032.f1742(var456, var455); NIL == var454 && NIL == module0032.f1744(var456, var457); var457 = module0032.f1743(var457)) {
                            var458 = module0032.f1745(var456, var457);
                            if (NIL != module0032.f1746(var457, var458) && NIL != module0364.f24748(var458, (SubLObject)$ic65$)) {
                                var459 = module0364.f24725(var458);
                                var33_474 = module0363.f24530(var459);
                                for (var34_475 = module0032.f1741(var33_474), var35_476 = (SubLObject)NIL, var35_476 = module0032.f1742(var34_475, var33_474); NIL == var454 && NIL == module0032.f1744(var34_475, var35_476); var35_476 = module0032.f1743(var35_476)) {
                                    var460 = module0032.f1745(var34_475, var35_476);
                                    if (NIL != module0032.f1746(var35_476, var460) && NIL != module0364.f24748(var460, (SubLObject)$ic51$)) {
                                        var461 = module0364.f24725(var460);
                                        if (NIL == module0363.f24689(var461)) {
                                            var454 = (SubLObject)T;
                                        }
                                    }
                                }
                            }
                        }
                        if (NIL != var454) {
                            module0363.f24676(var453);
                        }
                    }
                }
            }
            final SubLObject var37_478 = var447;
            if (NIL == module0065.f4777(var37_478)) {
                final SubLObject var462 = module0065.f4738(var37_478);
                SubLObject var463 = (SubLObject)NIL;
                SubLObject var464 = (SubLObject)NIL;
                final Iterator var465 = Hashtables.getEntrySetIterator(var462);
                try {
                    while (Hashtables.iteratorHasNext(var465)) {
                        final Map.Entry var466 = Hashtables.iteratorNextEntry(var465);
                        var463 = Hashtables.getEntryKey(var466);
                        var464 = Hashtables.getEntryValue(var466);
                        SubLObject var467 = (SubLObject)NIL;
                        final SubLObject var468 = module0363.f24530(var464);
                        SubLObject var469;
                        SubLObject var470;
                        SubLObject var471;
                        SubLObject var472;
                        SubLObject var33_475;
                        SubLObject var34_476;
                        SubLObject var35_477;
                        SubLObject var473;
                        SubLObject var474;
                        for (var469 = module0032.f1741(var468), var470 = (SubLObject)NIL, var470 = module0032.f1742(var469, var468); NIL == var467 && NIL == module0032.f1744(var469, var470); var470 = module0032.f1743(var470)) {
                            var471 = module0032.f1745(var469, var470);
                            if (NIL != module0032.f1746(var470, var471) && NIL != module0364.f24748(var471, (SubLObject)$ic65$)) {
                                var472 = module0364.f24725(var471);
                                var33_475 = module0363.f24530(var472);
                                for (var34_476 = module0032.f1741(var33_475), var35_477 = (SubLObject)NIL, var35_477 = module0032.f1742(var34_476, var33_475); NIL == var467 && NIL == module0032.f1744(var34_476, var35_477); var35_477 = module0032.f1743(var35_477)) {
                                    var473 = module0032.f1745(var34_476, var35_477);
                                    if (NIL != module0032.f1746(var35_477, var473) && NIL != module0364.f24748(var473, (SubLObject)$ic51$)) {
                                        var474 = module0364.f24725(var473);
                                        if (NIL == module0363.f24689(var474)) {
                                            var467 = (SubLObject)T;
                                        }
                                    }
                                }
                            }
                        }
                        if (NIL != var467) {
                            module0363.f24676(var464);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var465);
                }
            }
        }
        return module0361.f24415(var445);
    }
    
    public static SubLObject f26465(final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        SubLObject var17 = (SubLObject)ZERO_INTEGER;
        final SubLObject var18 = module0361.f24117(var15);
        final SubLObject var19 = module0034.$g879$.currentBinding(var16);
        try {
            module0034.$g879$.bind(var18, var16);
            SubLObject var20 = (SubLObject)NIL;
            if (NIL != var18 && NIL == module0034.f1842(var18)) {
                var20 = module0034.f1869(var18);
                final SubLObject var21 = Threads.current_process();
                if (NIL == var20) {
                    module0034.f1873(var18, var21);
                }
                else if (!var20.eql(var21)) {
                    Errors.error((SubLObject)$ic189$);
                }
            }
            try {
                SubLObject var22 = module0361.f24119(var15);
                final SubLObject var17_488 = module0139.$g1632$.currentBinding(var16);
                final SubLObject var23 = module0139.$g1630$.currentBinding(var16);
                final SubLObject var24 = module0139.$g1631$.currentBinding(var16);
                try {
                    module0139.$g1632$.bind(var22, var16);
                    module0139.$g1630$.bind((SubLObject)T, var16);
                    module0139.$g1631$.bind(module0139.f9023(module0139.$g1632$.getDynamicValue(var16)), var16);
                    final SubLObject var25 = module0361.f24324(var15);
                    final SubLObject var17_489 = module0361.$g3113$.currentBinding(var16);
                    try {
                        module0361.$g3113$.bind((SubLObject)T, var16);
                        SubLObject var26 = var25;
                        SubLObject var27 = (SubLObject)NIL;
                        var27 = var26.first();
                        while (NIL != var26) {
                            module0361.f24378(var15, var27);
                            var16.resetMultipleValues();
                            final SubLObject var28 = f26466(var27);
                            final SubLObject var29 = var16.secondMultipleValue();
                            var16.resetMultipleValues();
                            var17 = Numbers.add(var17, var28);
                            var17 = Numbers.add(var17, var29);
                            var26 = var26.rest();
                            var27 = var26.first();
                        }
                    }
                    finally {
                        module0361.$g3113$.rebind(var17_489, var16);
                    }
                    var22 = module0139.$g1632$.getDynamicValue(var16);
                }
                finally {
                    module0139.$g1631$.rebind(var24, var16);
                    module0139.$g1630$.rebind(var23, var16);
                    module0139.$g1632$.rebind(var17_488, var16);
                }
                module0361.f24120(var15, var22);
            }
            finally {
                final SubLObject var17_490 = Threads.$is_thread_performing_cleanupP$.currentBinding(var16);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var16);
                    if (NIL != var18 && NIL == var20) {
                        module0034.f1873(var18, (SubLObject)NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var17_490, var16);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var19, var16);
        }
        return var17;
    }
    
    public static SubLObject f26466(final SubLObject var67) {
        final SubLThread var68 = SubLProcess.currentSubLThread();
        var68.resetMultipleValues();
        final SubLObject var69 = f26467(var67);
        final SubLObject var70 = var68.secondMultipleValue();
        final SubLObject var71 = var68.thirdMultipleValue();
        var68.resetMultipleValues();
        SubLObject var72 = var69;
        SubLObject var73 = (SubLObject)NIL;
        var73 = var72.first();
        while (NIL != var72) {
            module0364.f24731(var73);
            var72 = var72.rest();
            var73 = var72.first();
        }
        var72 = var70;
        SubLObject var74 = (SubLObject)NIL;
        var74 = var72.first();
        while (NIL != var72) {
            module0363.f24544(var74);
            var72 = var72.rest();
            var74 = var72.first();
        }
        var72 = var71;
        var74 = (SubLObject)NIL;
        var74 = var72.first();
        while (NIL != var72) {
            SubLObject var43_498 = module0363.f24517(var74);
            SubLObject var75 = (SubLObject)NIL;
            var75 = var43_498.first();
            while (NIL != var43_498) {
                if (NIL != module0365.f24883(var75)) {
                    Errors.warn((SubLObject)$ic190$, var75);
                }
                var43_498 = var43_498.rest();
                var75 = var43_498.first();
            }
            module0363.f24544(var74);
            var72 = var72.rest();
            var74 = var72.first();
        }
        return Values.values(Sequences.length(var69), Numbers.add(Sequences.length(var70), Sequences.length(var71)));
    }
    
    public static SubLObject f26467(final SubLObject var67) {
        final SubLThread var68 = SubLProcess.currentSubLThread();
        final SubLObject var69 = f26468(var67);
        SubLObject var70 = module0032.f1726((SubLObject)ZERO_INTEGER, Symbols.symbol_function((SubLObject)EQ));
        SubLObject var71 = module0032.f1726((SubLObject)ZERO_INTEGER, Symbols.symbol_function((SubLObject)EQ));
        SubLObject var72 = module0032.f1726((SubLObject)ZERO_INTEGER, Symbols.symbol_function((SubLObject)EQ));
        SubLObject var73 = var69;
        SubLObject var74 = (SubLObject)NIL;
        var74 = var73.first();
        while (NIL != var73) {
            SubLObject var76;
            final SubLObject var75 = var76 = var74;
            SubLObject var77 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var76, var75, (SubLObject)$ic191$);
            var77 = var76.first();
            final SubLObject var78;
            var76 = (var78 = var76.rest());
            if (NIL == var78) {
                var68.resetMultipleValues();
                final SubLObject var508_509 = f26469(var77, var70, var71);
                final SubLObject var510_511 = var68.secondMultipleValue();
                var68.resetMultipleValues();
                var70 = var508_509;
                var71 = var510_511;
            }
            SubLObject var43_512 = var78;
            SubLObject var79 = (SubLObject)NIL;
            var79 = var43_512.first();
            while (NIL != var43_512) {
                SubLObject var516_517;
                final SubLObject var514_515 = var516_517 = module0366.f24938(var79);
                SubLObject var80 = (SubLObject)NIL;
                SubLObject var81 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var516_517, var514_515, (SubLObject)$ic192$);
                var80 = var516_517.first();
                var516_517 = var516_517.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var516_517, var514_515, (SubLObject)$ic192$);
                var81 = var516_517.first();
                var516_517 = var516_517.rest();
                if (NIL == var516_517) {
                    final SubLObject var82 = module0366.f24975(var81);
                    final SubLObject var83 = module0366.f24956(var82);
                    final SubLObject var84 = (SubLObject)ConsesLow.listS(var83, module0363.f24598(module0366.f24956(var81)));
                    if (NIL == module0363.f24635(var84)) {
                        var68.resetMultipleValues();
                        final SubLObject var523_524 = f26469(var77, var70, var71);
                        final SubLObject var525_526 = var68.secondMultipleValue();
                        var68.resetMultipleValues();
                        var70 = var523_524;
                        var71 = var525_526;
                        if (ONE_INTEGER.numE(module0363.f24600(var83))) {
                            final SubLObject var85 = f26470(var84);
                            final SubLObject var86 = f26471(var85);
                            var72 = module0032.f1736(var83, var72, Symbols.symbol_function((SubLObject)EQ));
                            SubLObject var43_513 = var86;
                            SubLObject var87 = (SubLObject)NIL;
                            var87 = var43_513.first();
                            while (NIL != var43_513) {
                                var72 = module0032.f1736(var87, var72, Symbols.symbol_function((SubLObject)EQ));
                                var43_513 = var43_513.rest();
                                var87 = var43_513.first();
                            }
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var514_515, (SubLObject)$ic192$);
                }
                var43_512 = var43_512.rest();
                var79 = var43_512.first();
            }
            var73 = var73.rest();
            var74 = var73.first();
        }
        final SubLObject var88 = Sort.sort(module0032.f1753(var70), Symbols.symbol_function((SubLObject)$ic193$), Symbols.symbol_function((SubLObject)$ic194$));
        final SubLObject var89 = Sort.sort(module0032.f1753(var71), Symbols.symbol_function((SubLObject)$ic193$), Symbols.symbol_function((SubLObject)$ic195$));
        final SubLObject var90 = Sort.sort(module0032.f1753(var72), Symbols.symbol_function((SubLObject)$ic193$), Symbols.symbol_function((SubLObject)$ic195$));
        return Values.values(var88, var89, var90);
    }
    
    public static SubLObject f26469(final SubLObject var506, SubLObject var533, SubLObject var534) {
        final SubLObject var535 = module0366.f24937(var506);
        if (NIL != module0366.f24934(var506)) {
            var533 = module0032.f1736(var535, var533, Symbols.symbol_function((SubLObject)EQ));
        }
        else {
            final SubLObject var536 = module0364.f24725(var535);
            if (NIL != module0363.f24685(var536)) {
                var534 = module0032.f1736(var536, var534, Symbols.symbol_function((SubLObject)EQ));
            }
        }
        return Values.values(var533, var534);
    }
    
    public static SubLObject f26468(final SubLObject var67) {
        SubLObject var68 = (SubLObject)NIL;
        if (NIL != module0366.f24932(var67)) {
            final SubLObject var69 = module0366.f24977(var67);
            final SubLObject var70 = module0035.remove_if_not(Symbols.symbol_function((SubLObject)$ic196$), var69, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != var70) {
                SubLObject var71 = var70;
                SubLObject var72 = (SubLObject)NIL;
                var72 = var71.first();
                while (NIL != var71) {
                    SubLObject var73 = (SubLObject)NIL;
                    SubLObject var74 = module0366.f24961(var72);
                    SubLObject var75 = (SubLObject)NIL;
                    var75 = var74.first();
                    while (NIL != var74) {
                        if (NIL != module0363.f24538(var75, (SubLObject)NIL) && NIL != module0381.f27098(var75) && NIL != module0035.f2169(var75, var69)) {
                            SubLObject var77;
                            final SubLObject var76 = var77 = module0366.f24938(var75);
                            SubLObject var78 = (SubLObject)NIL;
                            SubLObject var79 = (SubLObject)NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var77, var76, (SubLObject)$ic192$);
                            var78 = var77.first();
                            var77 = var77.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var77, var76, (SubLObject)$ic192$);
                            var79 = var77.first();
                            var77 = var77.rest();
                            if (NIL == var77) {
                                if (var72.eql(var78) && NIL != module0375.f26583(var79) && NIL != module0035.f2169(var79, var69)) {
                                    final SubLObject var80 = var75;
                                    if (NIL == conses_high.member(var80, var73, Symbols.symbol_function((SubLObject)EQ), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                        var73 = (SubLObject)ConsesLow.cons(var80, var73);
                                    }
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var76, (SubLObject)$ic192$);
                            }
                        }
                        var74 = var74.rest();
                        var75 = var74.first();
                    }
                    var73 = Sort.sort(var73, Symbols.symbol_function((SubLObject)$ic193$), Symbols.symbol_function((SubLObject)$ic197$));
                    final SubLObject var81 = (SubLObject)ConsesLow.listS(var72, var73);
                    var68 = (SubLObject)ConsesLow.cons(var81, var68);
                    var71 = var71.rest();
                    var72 = var71.first();
                }
                var68 = Sequences.nreverse(var68);
            }
        }
        return var68;
    }
    
    public static SubLObject f26470(final SubLObject var541) {
        SubLObject var542 = (SubLObject)NIL;
        SubLObject var543 = var541;
        SubLObject var544 = (SubLObject)NIL;
        var544 = var543.first();
        while (NIL != var543) {
            if (NIL != f26472(var544, var541)) {
                var542 = (SubLObject)ConsesLow.cons(var544, var542);
            }
            var543 = var543.rest();
            var544 = var543.first();
        }
        return Sequences.nreverse(var542);
    }
    
    public static SubLObject f26472(final SubLObject var542, final SubLObject var541) {
        SubLObject var543 = (SubLObject)NIL;
        final SubLObject var544 = module0363.f24530(var542);
        SubLObject var545;
        SubLObject var546;
        SubLObject var547;
        SubLObject var548;
        for (var545 = module0032.f1741(var544), var546 = (SubLObject)NIL, var546 = module0032.f1742(var545, var544); NIL == var543 && NIL == module0032.f1744(var545, var546); var546 = module0032.f1743(var546)) {
            var547 = module0032.f1745(var545, var546);
            if (NIL != module0032.f1746(var546, var547)) {
                var548 = module0364.f24725(var547);
                if (NIL == module0035.f2169(var548, var541)) {
                    var543 = var548;
                }
            }
        }
        return (SubLObject)makeBoolean(NIL == var543);
    }
    
    public static SubLObject f26471(final SubLObject var541) {
        final SubLObject var542 = Mapping.mapcar((SubLObject)$ic198$, var541);
        return module0035.f2220(var541, var542, Symbols.symbol_function((SubLObject)EQ));
    }
    
    public static SubLObject f26393(final SubLObject var11) {
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f26473(final SubLObject var15) {
        f26474(var15);
        final SubLObject var16 = f26475(var15);
        final SubLObject var17 = f26476(var15, var16);
        SubLObject var18 = (SubLObject)ZERO_INTEGER;
        SubLObject var19 = var17;
        SubLObject var20 = (SubLObject)NIL;
        var20 = var19.first();
        while (NIL != var19) {
            if (NIL != f26477(var20)) {
                var18 = Numbers.add(var18, (SubLObject)ONE_INTEGER);
            }
            var19 = var19.rest();
            var20 = var19.first();
        }
        return var18;
    }
    
    public static SubLObject f26476(final SubLObject var15, final SubLObject var544) {
        final SubLObject var545 = module0361.f24149(var15);
        SubLObject var546 = module0077.f5312(module0361.f24150(var15));
        SubLObject var547 = (SubLObject)NIL;
        final SubLObject var548 = module0077.f5333(var545);
        SubLObject var549;
        SubLObject var550;
        SubLObject var551;
        for (var549 = module0032.f1741(var548), var550 = (SubLObject)NIL, var550 = module0032.f1742(var549, var548); NIL == module0032.f1744(var549, var550); var550 = module0032.f1743(var550)) {
            var551 = module0032.f1745(var549, var550);
            if (NIL != module0032.f1746(var550, var551)) {
                var546 = (SubLObject)ConsesLow.cons(module0366.f24956(var551), var546);
                var547 = (SubLObject)ConsesLow.cons(module0366.f24937(var551), var547);
            }
        }
        var546 = Sort.sort(var546, Symbols.symbol_function((SubLObject)$ic193$), Symbols.symbol_function((SubLObject)$ic195$));
        var547 = Sort.sort(var547, Symbols.symbol_function((SubLObject)$ic193$), Symbols.symbol_function((SubLObject)$ic194$));
        SubLObject var552 = (SubLObject)NIL;
        SubLObject var553 = (SubLObject)NIL;
        SubLObject var554 = (SubLObject)NIL;
        SubLObject var555 = var546;
        SubLObject var556 = (SubLObject)NIL;
        var556 = var555.first();
        while (NIL != var555) {
            if (!var556.eql(var554)) {
                var554 = var556;
                if (NIL != f26478(var556, var544)) {
                    var552 = (SubLObject)ConsesLow.cons(var556, var552);
                }
            }
            var555 = var555.rest();
            var556 = var555.first();
        }
        var555 = var547;
        SubLObject var557 = (SubLObject)NIL;
        var557 = var555.first();
        while (NIL != var555) {
            if (!var557.eql(var554)) {
                var554 = var557;
                if (NIL != f26479(var557)) {
                    var553 = (SubLObject)ConsesLow.cons(var557, var553);
                }
            }
            var555 = var555.rest();
            var557 = var555.first();
        }
        return ConsesLow.nconc(Sequences.nreverse(var552), Sequences.nreverse(var553));
    }
    
    public static SubLObject f26478(final SubLObject var11, final SubLObject var544) {
        return (SubLObject)makeBoolean(NIL != module0363.f24680(var11) && NIL != f26480(var11) && NIL != f26481(var11, var544) && NIL != f26482(var11));
    }
    
    public static SubLObject f26479(final SubLObject var61) {
        return f26483(var61);
    }
    
    public static SubLObject f26477(final SubLObject var60) {
        if (NIL != module0363.f24478(var60)) {
            if (NIL != f26484(var60)) {
                module0363.f24544(var60);
                return (SubLObject)T;
            }
        }
        else if (NIL != f26485(var60)) {
            module0364.f24731(var60);
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26486(final SubLObject var11) {
        return module0363.f24603(var11, (SubLObject)$ic112$);
    }
    
    public static SubLObject f26487(final SubLObject var36, final SubLObject var553) {
        if (NIL != module0376.f26620(var553) && NIL != module0365.f24885(var553) && NIL == module0361.f24173(module0365.f24879(var553))) {
            final SubLObject var554 = module0365.f24850(var553);
            if (NIL != module0363.f24680(var554) && NIL != module0363.f24689(var554) && NIL == f26486(var554) && NIL == Sequences.find_if((SubLObject)$ic199$, module0363.f24531(var554), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                module0363.f24544(var554);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26484(final SubLObject var11) {
        if (ONE_INTEGER.numE(module0363.f24600(var11)) && NIL == module0361.f24348(var11)) {
            final SubLObject var12 = module0363.f24601(var11);
            if (NIL != module0375.f26571(var12)) {
                final SubLObject var13 = module0364.f24725(var12);
                SubLObject var14 = (SubLObject)NIL;
                if (module0363.f24600(var13).numE((SubLObject)ONE_INTEGER) && NIL != module0377.f26746(module0363.f24601(var13)) && NIL != module0363.f24634(var13, (SubLObject)$ic25$)) {
                    return (SubLObject)T;
                }
                final SubLObject var15 = module0363.f24530(var13);
                SubLObject var16;
                SubLObject var17;
                SubLObject var18;
                for (var16 = module0032.f1741(var15), var17 = (SubLObject)NIL, var17 = module0032.f1742(var16, var15); NIL == module0032.f1744(var16, var17); var17 = module0032.f1743(var17)) {
                    var18 = module0032.f1745(var16, var17);
                    if (NIL != module0032.f1746(var17, var18) && NIL != module0364.f24748(var18, (SubLObject)$ic51$)) {
                        if (NIL == var14 && NIL != f26488(var18, var12)) {
                            var14 = (SubLObject)T;
                        }
                        if (NIL != f26489(var18, var13)) {
                            var14 = (SubLObject)T;
                            if (NIL != f26490(var12, var18)) {
                                return (SubLObject)NIL;
                            }
                        }
                    }
                }
                return var14;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26491(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        SubLObject var13 = (SubLObject)NIL;
        final SubLObject var14 = (SubLObject)$ic99$;
        SubLObject var15;
        for (var15 = module0066.f4838(module0363.f24537(var11)); NIL == var13 && NIL == module0066.f4841(var15); var15 = module0066.f4840(var15)) {
            var12.resetMultipleValues();
            final SubLObject var16 = module0066.f4839(var15);
            final SubLObject var17 = var12.secondMultipleValue();
            var12.resetMultipleValues();
            SubLObject var18;
            SubLObject var19;
            for (var18 = (SubLObject)NIL, var18 = var17; NIL == var13 && NIL != var18; var18 = var18.rest()) {
                var19 = var18.first();
                if (NIL != module0363.f24538(var19, var14)) {
                    var13 = (SubLObject)makeBoolean(NIL == f26492(var19));
                }
            }
        }
        module0066.f4842(var15);
        return (SubLObject)makeBoolean(NIL == var13);
    }
    
    public static SubLObject f26492(final SubLObject var67) {
        if (module0363.f24643(module0366.f24956(var67), (SubLObject)UNPROVIDED).numL((SubLObject)TWO_INTEGER)) {
            return (SubLObject)NIL;
        }
        SubLObject var68 = module0366.f24961(var67);
        SubLObject var69 = (SubLObject)NIL;
        var69 = var68.first();
        while (NIL != var68) {
            if (NIL != module0363.f24538(var69, (SubLObject)NIL) && NIL == f26492(var69)) {
                return (SubLObject)NIL;
            }
            var68 = var68.rest();
            var69 = var68.first();
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f26488(final SubLObject var263, final SubLObject var75) {
        final SubLThread var264 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != module0381.f27056(var263, var75) && (NIL == $g3185$.getDynamicValue(var264) || module0381.f27057(var263).numGE((SubLObject)TWO_INTEGER)));
    }
    
    public static SubLObject f26489(final SubLObject var263, final SubLObject var554) {
        final SubLThread var555 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(var554.eql(module0381.f27050(var263)) && (NIL == $g3185$.getDynamicValue(var555) || f26493(var263).numGE((SubLObject)TWO_INTEGER)));
    }
    
    public static SubLObject f26490(final SubLObject var61, final SubLObject var263) {
        SubLObject var264 = module0364.f24768(var61);
        SubLObject var265 = (SubLObject)NIL;
        var265 = var264.first();
        while (NIL != var264) {
            if (NIL != module0363.f24538(var265, (SubLObject)$ic99$)) {
                final SubLObject var266 = module0381.f27042(var263, var265);
                if (NIL != module0364.f24719(var266)) {
                    final SubLObject var267 = module0364.f24757(var266);
                    if (NIL == module0363.f24689(var267)) {
                        return (SubLObject)T;
                    }
                }
            }
            var264 = var264.rest();
            var265 = var264.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26485(final SubLObject var61) {
        final SubLThread var62 = SubLProcess.currentSubLThread();
        if (NIL != module0364.f24719(var61) && NIL != module0376.f26613(var61)) {
            final SubLObject var63 = module0364.f24725(var61);
            if (NIL == f26494(var63) && NIL == module0361.f24348(var63) && (NIL == $g3185$.getDynamicValue(var62) || NIL == f26495(var61))) {
                final SubLObject var64 = module0363.f24530(var63);
                SubLObject var65;
                SubLObject var66;
                SubLObject var67;
                for (var65 = module0032.f1741(var64), var66 = (SubLObject)NIL, var66 = module0032.f1742(var65, var64); NIL == module0032.f1744(var65, var66); var66 = module0032.f1743(var66)) {
                    var67 = module0032.f1745(var65, var66);
                    if (NIL != module0032.f1746(var66, var67) && NIL != module0364.f24748(var67, (SubLObject)$ic51$) && NIL != f26490(var61, var67)) {
                        return (SubLObject)NIL;
                    }
                }
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26494(final SubLObject var11) {
        SubLObject var12 = (SubLObject)NIL;
        final SubLObject var13 = module0363.f24530(var11);
        SubLObject var14;
        SubLObject var15;
        SubLObject var16;
        SubLObject var17;
        for (var14 = module0032.f1741(var13), var15 = (SubLObject)NIL, var15 = module0032.f1742(var14, var13); NIL == module0032.f1744(var14, var15); var15 = module0032.f1743(var15)) {
            var16 = module0032.f1745(var14, var15);
            if (NIL != module0032.f1746(var15, var16)) {
                var17 = module0364.f24725(var16);
                if (NIL != var17 && !var17.eql(var12)) {
                    if (NIL != var12) {
                        return (SubLObject)T;
                    }
                    var12 = var17;
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26495(final SubLObject var61) {
        final SubLObject var62 = module0363.f24527(module0364.f24725(var61));
        SubLObject var63;
        SubLObject var64;
        SubLObject var65;
        for (var63 = module0032.f1741(var62), var64 = (SubLObject)NIL, var64 = module0032.f1742(var63, var62); NIL == module0032.f1744(var63, var64); var64 = module0032.f1743(var64)) {
            var65 = module0032.f1745(var63, var64);
            if (NIL != module0032.f1746(var64, var65) && !var61.eql(var65) && NIL != module0364.f24767(var65, (SubLObject)$ic99$)) {
                return (SubLObject)NIL;
            }
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f26493(final SubLObject var263) {
        final SubLObject var264 = module0381.f27050(var263);
        SubLObject var265 = (SubLObject)ZERO_INTEGER;
        final SubLObject var266 = module0363.f24527(var264);
        SubLObject var267;
        SubLObject var268;
        SubLObject var269;
        for (var267 = module0032.f1741(var266), var268 = (SubLObject)NIL, var268 = module0032.f1742(var267, var266); NIL == module0032.f1744(var267, var268); var268 = module0032.f1743(var268)) {
            var269 = module0032.f1745(var267, var268);
            if (NIL != module0032.f1746(var268, var269) && NIL != module0364.f24748(var269, (SubLObject)$ic62$)) {
                var265 = Numbers.add(var265, (SubLObject)ONE_INTEGER);
            }
        }
        return var265;
    }
    
    public static SubLObject f26482(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        final SubLObject var13 = (SubLObject)$ic99$;
        SubLObject var14;
        for (var14 = module0066.f4838(module0363.f24537(var11)); NIL == module0066.f4841(var14); var14 = module0066.f4840(var14)) {
            var12.resetMultipleValues();
            final SubLObject var15 = module0066.f4839(var14);
            final SubLObject var16 = var12.secondMultipleValue();
            var12.resetMultipleValues();
            SubLObject var17 = var16;
            SubLObject var18 = (SubLObject)NIL;
            var18 = var17.first();
            while (NIL != var17) {
                if (NIL != module0363.f24538(var18, var13) && NIL == module0366.f24958(var18)) {
                    return (SubLObject)NIL;
                }
                var17 = var17.rest();
                var18 = var17.first();
            }
        }
        module0066.f4842(var14);
        return (SubLObject)T;
    }
    
    public static SubLObject f26483(final SubLObject var61) {
        SubLObject var62 = module0364.f24768(var61);
        SubLObject var63 = (SubLObject)NIL;
        var63 = var62.first();
        while (NIL != var62) {
            if (NIL != module0363.f24538(var63, (SubLObject)$ic99$) && NIL == module0366.f24958(var63)) {
                return (SubLObject)NIL;
            }
            var62 = var62.rest();
            var63 = var62.first();
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f26480(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        final SubLObject var13 = module0363.f24507(var11);
        SubLObject var14 = (SubLObject)NIL;
        final SubLObject var15 = module0361.f24125(var13);
        if (NIL == module0065.f4772(var15, (SubLObject)$ic26$)) {
            final SubLObject var24_564 = var15;
            if (NIL == module0065.f4775(var24_564, (SubLObject)$ic26$)) {
                final SubLObject var16 = module0065.f4740(var24_564);
                final SubLObject var17 = (SubLObject)NIL;
                final SubLObject var18 = Sequences.length(var16);
                SubLObject var20;
                final SubLObject var19 = var20 = (SubLObject)((NIL != var17) ? ConsesLow.list(Numbers.subtract(var18, (SubLObject)ONE_INTEGER), (SubLObject)MINUS_ONE_INTEGER, (SubLObject)MINUS_ONE_INTEGER) : ConsesLow.list((SubLObject)ZERO_INTEGER, var18, (SubLObject)ONE_INTEGER));
                SubLObject var21 = (SubLObject)NIL;
                SubLObject var22 = (SubLObject)NIL;
                SubLObject var23 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)$ic200$);
                var21 = var20.first();
                var20 = var20.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)$ic200$);
                var22 = var20.first();
                var20 = var20.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)$ic200$);
                var23 = var20.first();
                var20 = var20.rest();
                if (NIL == var20) {
                    if (NIL == var14) {
                        SubLObject var24;
                        SubLObject var25;
                        SubLObject var26;
                        for (var24 = var22, var25 = (SubLObject)NIL, var25 = var21; NIL == var14 && NIL == module0005.f124(var25, var23, var24); var25 = Numbers.add(var25, var23)) {
                            var26 = Vectors.aref(var16, var25);
                            if (NIL == module0065.f4749(var26) || NIL == module0065.f4773((SubLObject)$ic26$)) {
                                if (NIL != module0065.f4749(var26)) {
                                    var26 = (SubLObject)$ic26$;
                                }
                                if (NIL != module0363.f24586(var11, var26) && NIL != module0367.f25083(var11, var26) && NIL == module0390.f27709(var26) && NIL == module0397.f28129(var26)) {
                                    var14 = (SubLObject)T;
                                }
                            }
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var19, (SubLObject)$ic200$);
                }
            }
            final SubLObject var37_572 = var15;
            if (NIL == module0065.f4777(var37_572) && NIL == var14) {
                SubLObject var27 = (SubLObject)NIL;
                try {
                    var12.throwStack.push($ic201$);
                    final SubLObject var28 = module0065.f4738(var37_572);
                    SubLObject var29 = (SubLObject)NIL;
                    SubLObject var30 = (SubLObject)NIL;
                    final Iterator var31 = Hashtables.getEntrySetIterator(var28);
                    try {
                        while (Hashtables.iteratorHasNext(var31)) {
                            final Map.Entry var32 = Hashtables.iteratorNextEntry(var31);
                            var29 = Hashtables.getEntryKey(var32);
                            var30 = Hashtables.getEntryValue(var32);
                            module0005.f153(var14);
                            if (NIL != module0363.f24586(var11, var30) && NIL != module0367.f25083(var11, var30) && NIL == module0390.f27709(var30) && NIL == module0397.f28129(var30)) {
                                var14 = (SubLObject)T;
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(var31);
                    }
                }
                catch (Throwable var33) {
                    var27 = Errors.handleThrowable(var33, (SubLObject)$ic201$);
                }
                finally {
                    var12.throwStack.pop();
                }
            }
        }
        return (SubLObject)makeBoolean(NIL == var14);
    }
    
    public static SubLObject f26496(final SubLObject var11, final SubLObject var544) {
        SubLObject var545 = (SubLObject)NIL;
        SubLObject var546 = var544;
        SubLObject var547 = (SubLObject)NIL;
        var547 = var546.first();
        while (NIL != var546) {
            if (NIL != f26320(var11, var547)) {
                var545 = (SubLObject)T;
            }
            var546 = var546.rest();
            var547 = var546.first();
        }
        return var545;
    }
    
    public static SubLObject f26475(final SubLObject var15) {
        SubLObject var16 = (SubLObject)NIL;
        final SubLObject var17 = module0361.f24125(var15);
        if (NIL == module0065.f4772(var17, (SubLObject)$ic26$)) {
            final SubLObject var24_576 = var17;
            if (NIL == module0065.f4775(var24_576, (SubLObject)$ic26$)) {
                final SubLObject var18 = module0065.f4740(var24_576);
                final SubLObject var19 = (SubLObject)NIL;
                SubLObject var20;
                SubLObject var21;
                SubLObject var22;
                SubLObject var23;
                for (var20 = Sequences.length(var18), var21 = (SubLObject)NIL, var21 = (SubLObject)ZERO_INTEGER; var21.numL(var20); var21 = Numbers.add(var21, (SubLObject)ONE_INTEGER)) {
                    var22 = ((NIL != var19) ? Numbers.subtract(var20, var21, (SubLObject)ONE_INTEGER) : var21);
                    var23 = Vectors.aref(var18, var22);
                    if (NIL == module0065.f4749(var23) || NIL == module0065.f4773((SubLObject)$ic26$)) {
                        if (NIL != module0065.f4749(var23)) {
                            var23 = (SubLObject)$ic26$;
                        }
                        if (NIL != module0397.f28129(var23)) {
                            var16 = (SubLObject)ConsesLow.cons(var23, var16);
                        }
                    }
                }
            }
            final SubLObject var37_577 = var17;
            if (NIL == module0065.f4777(var37_577)) {
                final SubLObject var24 = module0065.f4738(var37_577);
                SubLObject var25 = (SubLObject)NIL;
                SubLObject var26 = (SubLObject)NIL;
                final Iterator var27 = Hashtables.getEntrySetIterator(var24);
                try {
                    while (Hashtables.iteratorHasNext(var27)) {
                        final Map.Entry var28 = Hashtables.iteratorNextEntry(var27);
                        var25 = Hashtables.getEntryKey(var28);
                        var26 = Hashtables.getEntryValue(var28);
                        if (NIL != module0397.f28129(var26)) {
                            var16 = (SubLObject)ConsesLow.cons(var26, var16);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var27);
                }
            }
        }
        return Sequences.nreverse(var16);
    }
    
    public static SubLObject f26497(final SubLObject var11, final SubLObject var578) {
        SubLObject var579 = var578;
        SubLObject var580 = (SubLObject)NIL;
        var580 = var579.first();
        while (NIL != var579) {
            if (NIL != module0367.f25083(var11, var580)) {
                return (SubLObject)T;
            }
            var579 = var579.rest();
            var580 = var579.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26498(final SubLObject var15) {
        SubLObject var16 = (SubLObject)NIL;
        final SubLObject var17 = module0361.f24125(var15);
        if (NIL == module0065.f4772(var17, (SubLObject)$ic26$)) {
            final SubLObject var24_579 = var17;
            if (NIL == module0065.f4775(var24_579, (SubLObject)$ic26$)) {
                final SubLObject var18 = module0065.f4740(var24_579);
                final SubLObject var19 = (SubLObject)NIL;
                SubLObject var20;
                SubLObject var21;
                SubLObject var22;
                SubLObject var23;
                for (var20 = Sequences.length(var18), var21 = (SubLObject)NIL, var21 = (SubLObject)ZERO_INTEGER; var21.numL(var20); var21 = Numbers.add(var21, (SubLObject)ONE_INTEGER)) {
                    var22 = ((NIL != var19) ? Numbers.subtract(var20, var21, (SubLObject)ONE_INTEGER) : var21);
                    var23 = Vectors.aref(var18, var22);
                    if (NIL == module0065.f4749(var23) || NIL == module0065.f4773((SubLObject)$ic26$)) {
                        if (NIL != module0065.f4749(var23)) {
                            var23 = (SubLObject)$ic26$;
                        }
                        if (NIL != module0406.f28343(var23)) {
                            var16 = (SubLObject)ConsesLow.cons(var23, var16);
                        }
                    }
                }
            }
            final SubLObject var37_580 = var17;
            if (NIL == module0065.f4777(var37_580)) {
                final SubLObject var24 = module0065.f4738(var37_580);
                SubLObject var25 = (SubLObject)NIL;
                SubLObject var26 = (SubLObject)NIL;
                final Iterator var27 = Hashtables.getEntrySetIterator(var24);
                try {
                    while (Hashtables.iteratorHasNext(var27)) {
                        final Map.Entry var28 = Hashtables.iteratorNextEntry(var27);
                        var25 = Hashtables.getEntryKey(var28);
                        var26 = Hashtables.getEntryValue(var28);
                        if (NIL != module0406.f28343(var26)) {
                            var16 = (SubLObject)ConsesLow.cons(var26, var16);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var27);
                }
            }
        }
        return Sequences.nreverse(var16);
    }
    
    public static SubLObject f26499(final SubLObject var11) {
        return module0361.f24392(module0363.f24507(var11), var11);
    }
    
    public static SubLObject f26500(final SubLObject var11) {
        return Equality.eq(var11, module0361.f24239(module0363.f24507(var11), module0363.f24509(var11)));
    }
    
    public static SubLObject f26501(final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        assert NIL != module0361.f24009(var15) : var15;
        final SubLObject var17 = module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        SubLObject var19;
        final SubLObject var18 = var19 = module0361.f24341(var15);
        SubLObject var20 = (SubLObject)NIL;
        var20 = var19.first();
        while (NIL != var19) {
            final SubLObject var21 = module0366.f24956(var20);
            final SubLObject var22 = module0366.f24934(var20);
            final SubLObject var23 = (SubLObject)ConsesLow.list(var21, var22);
            final SubLObject var24 = module0366.f24971(var20);
            SubLObject var25;
            for (var25 = module0066.f4838(module0363.f24537(var21)); NIL == module0066.f4841(var25); var25 = module0066.f4840(var25)) {
                var16.resetMultipleValues();
                final SubLObject var169_584 = module0066.f4839(var25);
                final SubLObject var26 = var16.secondMultipleValue();
                var16.resetMultipleValues();
                SubLObject var43_585 = var26;
                SubLObject var27 = (SubLObject)NIL;
                var27 = var43_585.first();
                while (NIL != var43_585) {
                    final SubLObject var28 = module0366.f24934(var27);
                    if (var22.equal(var28) && !var20.eql(var27)) {
                        final SubLObject var29 = module0366.f24971(var27);
                        if (NIL != module0191.f11997(var24, var29)) {
                            SubLObject var30 = module0067.f4884(var17, var23, (SubLObject)NIL);
                            if (NIL == var30) {
                                var30 = module0077.f5313(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
                            }
                            module0077.f5326(var20, var30);
                            module0077.f5326(var27, var30);
                            module0067.f4886(var17, var23, var30);
                        }
                    }
                    var43_585 = var43_585.rest();
                    var27 = var43_585.first();
                }
            }
            module0066.f4842(var25);
            var19 = var19.rest();
            var20 = var19.first();
        }
        return module0067.f4903(var17);
    }
    
    public static SubLObject f26502(final SubLObject var15) {
        final SubLObject var16 = module0077.f5313(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
        SubLObject var17 = f26501(var15);
        SubLObject var18 = (SubLObject)NIL;
        var18 = var17.first();
        while (NIL != var17) {
            final SubLObject var19 = module0077.f5333(var18);
            SubLObject var20;
            SubLObject var21;
            SubLObject var22;
            for (var20 = module0032.f1741(var19), var21 = (SubLObject)NIL, var21 = module0032.f1742(var20, var19); NIL == module0032.f1744(var20, var21); var21 = module0032.f1743(var21)) {
                var22 = module0032.f1745(var20, var21);
                if (NIL != module0032.f1746(var21, var22)) {
                    module0077.f5326(var22, var16);
                }
            }
            var17 = var17.rest();
            var18 = var17.first();
        }
        return Sort.sort(module0077.f5312(var16), Symbols.symbol_function((SubLObject)$ic193$), Symbols.symbol_function((SubLObject)$ic197$));
    }
    
    public static SubLObject f26503(final SubLObject var15) {
        return module0048.f3385(Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic203$), f26501(var15)));
    }
    
    public static SubLObject f26504(final SubLObject var67) {
        final SubLObject var68 = f26505(var67);
        if (NIL != module0035.f2370((SubLObject)$ic204$, var68, (SubLObject)UNPROVIDED)) {
            return f26506(var68);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26505(final SubLObject var67) {
        final SubLObject var68 = module0078.f5367((SubLObject)ConsesLow.list(var67), Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
        final SubLObject var69 = module0077.f5313(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
        while (NIL == module0077.f5316(var68)) {
            SubLObject var70 = module0077.f5312(var68);
            SubLObject var67_593 = (SubLObject)NIL;
            var67_593 = var70.first();
            while (NIL != var70) {
                module0077.f5327(var67_593, var68);
                final SubLObject var71 = f26507(var67_593);
                if (NIL != var71) {
                    module0078.f5374(var68, var71);
                }
                else {
                    module0077.f5326(var67_593, var69);
                }
                var70 = var70.rest();
                var67_593 = var70.first();
            }
        }
        return module0077.f5312(var69);
    }
    
    public static SubLObject f26507(final SubLObject var67) {
        final SubLObject var68 = module0366.f24939(var67, (SubLObject)UNPROVIDED);
        return (NIL != var68) ? var68 : f26508(var67);
    }
    
    public static SubLObject f26508(final SubLObject var67) {
        SubLObject var68 = (SubLObject)NIL;
        final SubLObject var69 = module0363.f24530(module0366.f24956(var67));
        SubLObject var70;
        SubLObject var71;
        SubLObject var72;
        for (var70 = module0032.f1741(var69), var71 = (SubLObject)NIL, var71 = module0032.f1742(var70, var69); NIL == module0032.f1744(var70, var71); var71 = module0032.f1743(var71)) {
            var72 = module0032.f1745(var70, var71);
            if (NIL != module0032.f1746(var71, var72) && NIL != module0364.f24748(var72, (SubLObject)$ic51$)) {
                var68 = (SubLObject)ConsesLow.cons(module0381.f27042(var72, var67), var68);
            }
        }
        return Sequences.nreverse(var68);
    }
    
    public static SubLObject f26509(final SubLObject var67) {
        return (SubLObject)makeBoolean(NIL != module0366.f24958(var67) && NIL == module0361.f24348(module0366.f24956(var67)));
    }
    
    public static SubLObject f26506(final SubLObject var489) {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26510(final SubLObject var15) {
        final SubLObject var16 = ConsesLow.append(module0361.f24338(var15), module0361.f24340(var15));
        final SubLObject var17 = f26475(var15);
        return f26511(var16, var17);
    }
    
    public static SubLObject f26512(final SubLObject var60) {
        final SubLThread var61 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var61) && NIL == module0363.f24478(var60) && NIL == module0364.f24699(var60)) {
            Errors.error((SubLObject)$ic205$, var60);
        }
        final SubLObject var62 = (NIL != module0363.f24478(var60)) ? module0363.f24507(var60) : module0364.f24722(var60);
        final SubLObject var63 = f26475(var62);
        return f26511(f26513(var60), var63);
    }
    
    public static SubLObject f26513(final SubLObject var60) {
        final SubLObject var61 = module0077.f5313(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
        f26514(var60, var61);
        return var61;
    }
    
    public static SubLObject f26514(final SubLObject var60, final SubLObject var597) {
        if (NIL != module0077.f5320(var60, var597)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0363.f24478(var60)) {
            final SubLObject var598 = module0363.f24527(var60);
            SubLObject var599;
            SubLObject var600;
            SubLObject var601;
            for (var599 = module0032.f1741(var598), var600 = (SubLObject)NIL, var600 = module0032.f1742(var599, var598); NIL == module0032.f1744(var599, var600); var600 = module0032.f1743(var600)) {
                var601 = module0032.f1745(var599, var600);
                if (NIL != module0032.f1746(var600, var601)) {
                    f26514(var601, var597);
                }
            }
        }
        else {
            SubLObject var602 = module0364.f24735(var60);
            SubLObject var603 = (SubLObject)NIL;
            var603 = var602.first();
            while (NIL != var602) {
                if (NIL != module0339.f22743((SubLObject)NIL, var60, var603)) {
                    final SubLObject var604 = module0364.f24736(var603);
                    final SubLObject var605 = module0364.f24737(var603);
                    f26514(var604, var597);
                }
                var602 = var602.rest();
                var603 = var602.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26511(final SubLObject var596, final SubLObject var544) {
        final SubLThread var597 = SubLProcess.currentSubLThread();
        SubLObject var598 = var596;
        SubLObject var599 = (SubLObject)NIL;
        var599 = var598.first();
        while (NIL != var598) {
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var597) && NIL == module0363.f24478(var599) && NIL == module0364.f24699(var599)) {
                Errors.error((SubLObject)$ic205$, var599);
            }
            var598 = var598.rest();
            var599 = var598.first();
        }
        final SubLObject var600 = var596.first();
        final SubLObject var601 = (NIL != module0363.f24478(var600)) ? module0363.f24507(var600) : module0364.f24722(var600);
        f26474(var601);
        SubLObject var602 = (SubLObject)NIL;
        SubLObject var603 = var596;
        SubLObject var60_599 = (SubLObject)NIL;
        var60_599 = var603.first();
        while (NIL != var603) {
            if (NIL != f26515(var60_599, var544)) {
                var602 = (SubLObject)ConsesLow.cons(var60_599, var602);
            }
            var603 = var603.rest();
            var60_599 = var603.first();
        }
        PrintLow.format((SubLObject)T, (SubLObject)$ic206$, var602);
        var603 = var602;
        SubLObject var604 = (SubLObject)NIL;
        var604 = var603.first();
        while (NIL != var603) {
            f26516(var604);
            var603 = var603.rest();
            var604 = var603.first();
        }
        return Sequences.length(var602);
    }
    
    public static SubLObject f26515(final SubLObject var60, final SubLObject var544) {
        if (NIL != module0363.f24478(var60)) {
            return f26517(var60, var544);
        }
        if (NIL != module0364.f24699(var60)) {
            return f26518(var60);
        }
        Errors.error((SubLObject)$ic207$, var60);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26517(final SubLObject var11, final SubLObject var544) {
        if (NIL == module0361.f24348(var11) && NIL != f26480(var11) && NIL != f26481(var11, var544)) {
            return (SubLObject)NIL;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26518(final SubLObject var61) {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26481(final SubLObject var11, final SubLObject var544) {
        return (SubLObject)makeBoolean(NIL != module0035.f2169(module0363.f24683(var11), (SubLObject)$ic208$) || NIL != f26496(var11, var544));
    }
    
    public static SubLObject f26516(final SubLObject var60) {
        if (NIL != module0363.f24478(var60)) {
            module0363.f24544(var60);
        }
        else if (NIL != module0364.f24699(var60)) {
            module0364.f24731(var60);
        }
        else {
            Errors.error((SubLObject)$ic207$, var60);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26474(final SubLObject var15) {
        module0361.f24145(var15);
        final SubLObject var16 = module0361.f24123(var15);
        if (NIL == module0065.f4772(var16, (SubLObject)$ic26$)) {
            final SubLObject var24_601 = var16;
            if (NIL == module0065.f4775(var24_601, (SubLObject)$ic26$)) {
                final SubLObject var17 = module0065.f4740(var24_601);
                final SubLObject var18 = (SubLObject)NIL;
                SubLObject var19;
                SubLObject var20;
                SubLObject var21;
                SubLObject var22;
                for (var19 = Sequences.length(var17), var20 = (SubLObject)NIL, var20 = (SubLObject)ZERO_INTEGER; var20.numL(var19); var20 = Numbers.add(var20, (SubLObject)ONE_INTEGER)) {
                    var21 = ((NIL != var18) ? Numbers.subtract(var19, var20, (SubLObject)ONE_INTEGER) : var20);
                    var22 = Vectors.aref(var17, var21);
                    if (NIL == module0065.f4749(var22) || NIL == module0065.f4773((SubLObject)$ic26$)) {
                        if (NIL != module0065.f4749(var22)) {
                            var22 = (SubLObject)$ic26$;
                        }
                        f26519(var22);
                    }
                }
            }
            final SubLObject var37_602 = var16;
            if (NIL == module0065.f4777(var37_602)) {
                final SubLObject var23 = module0065.f4738(var37_602);
                SubLObject var24 = (SubLObject)NIL;
                SubLObject var25 = (SubLObject)NIL;
                final Iterator var26 = Hashtables.getEntrySetIterator(var23);
                try {
                    while (Hashtables.iteratorHasNext(var26)) {
                        final Map.Entry var27 = Hashtables.iteratorNextEntry(var26);
                        var24 = Hashtables.getEntryKey(var27);
                        var25 = Hashtables.getEntryValue(var27);
                        f26519(var25);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var26);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26519(final SubLObject var175) {
        return f26520(inference_datastructures_inference_oc.f25597(var175));
    }
    
    public static SubLObject f26520(final SubLObject var11) {
        if (NIL != module0361.f24350(var11)) {
            module0361.f24352(var11);
            if (NIL == module0363.f24689(var11)) {
                final SubLObject var12 = module0363.f24527(var11);
                SubLObject var13;
                SubLObject var14;
                SubLObject var15;
                for (var13 = module0032.f1741(var12), var14 = (SubLObject)NIL, var14 = module0032.f1742(var13, var12); NIL == module0032.f1744(var13, var14); var14 = module0032.f1743(var14)) {
                    var15 = module0032.f1745(var13, var14);
                    if (NIL != module0032.f1746(var14, var15)) {
                        f26521(var15);
                    }
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26521(final SubLObject var61) {
        if (NIL != module0380.f26955(var61) && NIL != module0364.f24759(var61) && NIL != f26522(var61)) {
            final SubLObject var62 = f26523(var61);
            SubLObject var63 = module0364.f24735(var61);
            SubLObject var64 = (SubLObject)NIL;
            var64 = var63.first();
            while (NIL != var63) {
                if (NIL != module0339.f22743((SubLObject)NIL, var61, var64)) {
                    final SubLObject var65 = module0364.f24736(var64);
                    final SubLObject var66 = module0364.f24737(var64);
                    if (var65.eql(var62)) {
                        module0361.f24352(var65);
                        f26520(var65);
                    }
                    else {
                        f26524(var65, var61);
                    }
                }
                var63 = var63.rest();
                var64 = var63.first();
            }
        }
        else if (NIL != module0382.f27173(var61) && NIL != module0364.f24759(var61)) {
            final SubLObject var67 = module0382.f27185(var61);
            final SubLObject var68 = module0382.f27186(var61);
            module0361.f24352(var68);
            f26520(var68);
            f26524(var67, var61);
        }
        else {
            SubLObject var69 = module0364.f24735(var61);
            SubLObject var70 = (SubLObject)NIL;
            var70 = var69.first();
            while (NIL != var69) {
                if (NIL != module0339.f22743((SubLObject)NIL, var61, var70)) {
                    final SubLObject var71 = module0364.f24736(var70);
                    final SubLObject var72 = module0364.f24737(var70);
                    f26520(var71);
                }
                var69 = var69.rest();
                var70 = var69.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26522(final SubLObject var348) {
        final SubLObject var349 = module0361.f24207(module0364.f24722(var348));
        if (NIL == var349) {
            return (SubLObject)T;
        }
        final SubLObject var350 = (SubLObject)((NIL != module0391.f27795(var349)) ? module0391.f27806(var349) : ConsesLow.list(module0390.f27718(var349)));
        SubLObject var351 = module0364.f24735(var348);
        SubLObject var352 = (SubLObject)NIL;
        var352 = var351.first();
        while (NIL != var351) {
            if (NIL != module0339.f22743((SubLObject)NIL, var348, var352)) {
                final SubLObject var353 = module0380.f26963(var348, var352);
                if (NIL == var353) {
                    return (SubLObject)T;
                }
                SubLObject var43_609 = var350;
                SubLObject var354 = (SubLObject)NIL;
                var354 = var43_609.first();
                while (NIL != var43_609) {
                    if (NIL != module0048.f3361(module0367.f25203(var353, var354), (SubLObject)$ic110$)) {
                        return (SubLObject)T;
                    }
                    var43_609 = var43_609.rest();
                    var354 = var43_609.first();
                }
            }
            var351 = var351.rest();
            var352 = var351.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26523(final SubLObject var348) {
        final SubLObject var349 = module0380.f26983(var348);
        final SubLObject var350 = module0035.count_if_not((SubLObject)$ic209$, var349, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (var350.eql((SubLObject)ONE_INTEGER)) {
            return module0035.find_if_not((SubLObject)$ic209$, var349, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (var350.eql((SubLObject)ZERO_INTEGER)) {
            return var349.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26524(final SubLObject var11, final SubLObject var612) {
        return f26525(var11, var612);
    }
    
    public static SubLObject f26525(final SubLObject var11, final SubLObject var612) {
        if (NIL == module0361.f24348(var11)) {
            module0361.f24351(var11, var612);
            final SubLObject var613 = module0363.f24527(var11);
            SubLObject var614;
            SubLObject var615;
            SubLObject var616;
            SubLObject var617;
            SubLObject var618;
            SubLObject var619;
            SubLObject var620;
            SubLObject var621;
            for (var614 = module0032.f1741(var613), var615 = (SubLObject)NIL, var615 = module0032.f1742(var614, var613); NIL == module0032.f1744(var614, var615); var615 = module0032.f1743(var615)) {
                var616 = module0032.f1745(var614, var615);
                if (NIL != module0032.f1746(var615, var616)) {
                    var617 = var616;
                    var618 = module0364.f24735(var617);
                    var619 = (SubLObject)NIL;
                    var619 = var618.first();
                    while (NIL != var618) {
                        if (NIL != module0339.f22743((SubLObject)NIL, var617, var619)) {
                            var620 = module0364.f24736(var619);
                            var621 = module0364.f24737(var619);
                            f26525(var620, var612);
                        }
                        var618 = var618.rest();
                        var619 = var618.first();
                    }
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26526() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26105", "S#28823", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26106", "S#29333", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0373", "f26107", "S#29334");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26108", "S#29335", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26109", "CURRENTLY-ACTIVE-PROBLEM", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0373", "f26110", "S#29336");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26111", "S#29337", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0373", "f26112", "S#29338");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26113", "CURRENTLY-ACTIVE-PROBLEM-STORE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26114", "S#29339", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26115", "S#29340", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26116", "S#29341", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26117", "S#29342", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26122", "S#29343", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26123", "S#29344", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26124", "S#29345", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26121", "S#29346", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26125", "S#29347", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26126", "S#29348", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26127", "S#29349", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26128", "S#29350", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26129", "S#29351", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26130", "S#29352", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26131", "S#29353", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26139", "S#29354", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26138", "S#29355", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0373", "f26141", "S#29356");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26142", "S#29357", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26143", "S#29358", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26132", "S#29359", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26133", "S#29360", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26144", "S#29361", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26137", "S#29362", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26135", "S#29363", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26147", "S#29364", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26149", "S#29365", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26150", "S#27602", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26151", "S#27343", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26152", "S#29366", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26153", "S#29367", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26154", "S#27601", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26155", "S#27347", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26145", "S#27344", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26156", "S#29368", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26134", "S#27915", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26157", "S#29369", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26158", "S#29370", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26159", "S#27600", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26160", "S#29371", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26136", "S#27345", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26161", "S#29372", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26162", "S#27603", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26163", "S#27346", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26164", "S#29373", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26165", "S#29374", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26166", "S#29375", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26167", "S#29376", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26168", "S#29377", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26169", "S#28223", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26170", "S#27599", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26146", "S#29378", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26148", "S#27348", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26171", "S#27914", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26172", "S#29379", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26173", "S#28927", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26174", "S#27822", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26175", "S#27598", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26176", "S#27349", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26177", "S#27820", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26178", "S#27816", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26179", "S#29380", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26180", "S#29381", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26181", "S#27821", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26182", "S#27378", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26183", "S#29382", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26188", "S#29383", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26184", "S#29384", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26185", "S#29385", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26186", "S#29386", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26187", "S#29387", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26189", "S#29388", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26192", "S#29389", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26195", "S#29390", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26196", "S#29391", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26197", "S#29392", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26198", "S#29393", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26199", "S#29394", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26201", "S#29395", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26200", "S#29396", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26202", "S#29397", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26194", "S#29398", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26205", "S#29399", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26206", "S#29400", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26193", "S#29401", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26204", "S#29402", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26207", "S#29403", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26209", "S#29404", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26210", "S#29405", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26211", "S#29406", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26212", "S#29407", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26214", "S#29408", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26213", "S#29409", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26215", "S#29410", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26216", "S#29411", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26220", "S#29412", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26217", "S#29413", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26218", "S#29414", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26219", "S#29415", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26221", "S#29416", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26223", "S#29417", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26225", "S#29418", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26233", "S#29419", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26234", "S#29420", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26236", "S#29421", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26226", "S#29422", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26224", "S#29423", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26227", "S#29424", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26228", "S#29425", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26237", "S#29426", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26239", "S#29427", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26238", "S#29428", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26243", "S#29429", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26245", "S#29430", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26246", "S#29431", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26230", "S#29432", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26247", "S#29433", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26222", "S#29434", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26248", "S#29435", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26250", "S#29436", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26251", "S#29437", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26249", "S#29438", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26252", "S#29439", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26253", "S#29440", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26241", "S#28937", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26254", "S#29441", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26255", "S#29442", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26257", "S#29443", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26256", "S#29444", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26258", "S#29445", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26259", "S#29446", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26260", "S#29447", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26235", "S#27823", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26261", "S#29448", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26262", "S#29449", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26263", "S#29450", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26264", "S#29451", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26265", "S#29452", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26266", "S#29453", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26267", "S#29454", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26269", "S#29455", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26271", "S#29456", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26272", "S#29457", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26274", "S#29458", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26275", "S#29459", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26273", "S#29460", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26276", "S#29461", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26277", "S#29462", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26279", "S#29463", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26278", "S#29464", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26231", "S#29465", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26232", "S#29466", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26280", "S#29467", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26282", "S#29468", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26283", "S#29469", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26284", "S#29470", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26281", "S#29471", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26285", "S#29472", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26286", "S#29473", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26287", "S#29474", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26288", "S#29475", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26140", "S#29476", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26291", "S#29477", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26292", "S#29478", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26294", "S#27335", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26296", "S#28169", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26297", "S#29479", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26191", "S#29480", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26118", "S#29481", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26301", "S#29482", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26305", "S#29483", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26302", "S#29484", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26308", "S#29485", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26307", "S#29486", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26293", "S#29487", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26289", "S#29488", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26313", "S#29489", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26315", "S#29490", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26317", "S#29491", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26318", "S#29492", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26319", "S#29493", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26321", "S#29494", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26322", "S#29495", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26190", "S#27373", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26323", "S#29496", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26324", "S#29497", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26325", "S#29498", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26326", "S#29499", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26327", "S#28205", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26328", "S#29500", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26203", "S#29501", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26330", "S#29502", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26310", "S#29503", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26314", "S#29504", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26320", "S#29505", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26331", "S#29506", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26332", "S#29507", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26333", "S#29508", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26334", "S#29509", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26339", "S#29510", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26340", "S#29511", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26341", "S#29512", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26342", "S#29513", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26343", "S#29514", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26344", "S#29515", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26345", "S#29516", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26349", "S#29517", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26268", "S#29518", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26351", "S#29519", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26352", "S#27903", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26353", "S#29520", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26350", "S#29521", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26354", "S#29522", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26355", "S#29523", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26356", "S#29524", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26335", "S#29525", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26298", "S#29526", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26357", "S#29527", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26358", "S#29528", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26336", "S#29529", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26299", "S#29530", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26361", "S#29531", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26360", "S#29532", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26362", "S#29533", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26363", "S#29534", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26364", "S#29535", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26365", "S#29536", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26359", "S#29537", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26366", "S#29538", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26337", "S#29539", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26347", "S#29540", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26367", "S#29541", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26338", "S#29542", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26369", "S#29543", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26348", "S#29544", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26368", "S#29545", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26270", "S#29546", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26370", "S#29547", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26371", "S#29548", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26372", "S#29549", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26373", "S#29550", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26374", "S#29551", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26375", "S#29552", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26311", "S#29553", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26376", "S#29554", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26295", "S#29555", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26377", "S#29556", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26378", "S#29557", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26380", "S#29558", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26229", "S#29559", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26329", "S#27361", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26381", "S#27362", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26309", "S#29560", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26304", "S#29561", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26306", "S#29562", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26312", "S#29563", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26316", "S#29564", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26240", "S#29565", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26290", "S#29566", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26382", "S#29567", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26383", "S#29568", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26384", "S#29569", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26385", "S#29570", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26386", "S#29571", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26387", "S#29572", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26120", "S#29573", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26388", "S#29574", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26390", "S#29575", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26244", "S#29576", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26391", "S#29577", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26119", "S#29578", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26208", "S#29579", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26394", "S#29580", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26303", "S#29581", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26379", "S#29582", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26392", "S#29583", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26389", "S#29584", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26397", "S#29585", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26403", "S#29586", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26404", "S#29587", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26405", "S#29588", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26402", "S#29589", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26398", "S#29590", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26399", "S#29591", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26400", "S#29592", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26401", "S#29593", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26395", "S#29594", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26406", "S#29595", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26409", "S#29596", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26408", "S#29597", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26410", "S#29598", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26407", "S#29599", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26411", "S#29600", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26412", "S#29601", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26396", "S#29602", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26346", "S#29603", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26300", "S#29604", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26414", "S#29605", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26416", "S#29606", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0373", "f26417", "S#29607");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26413", "S#29608", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26415", "S#29609", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26429", "S#29610", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26418", "S#29611", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26419", "S#29612", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26430", "S#29613", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26428", "S#29614", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26420", "S#29615", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26431", "S#29616", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26421", "S#29617", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26422", "S#29618", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26423", "S#29619", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26424", "S#29620", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26425", "S#29621", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26426", "S#29622", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26432", "S#29623", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26427", "S#29624", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26433", "S#29625", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26242", "S#29626", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26435", "S#29627", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26434", "S#28831", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26436", "S#29628", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26437", "S#29629", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26438", "S#29630", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26439", "S#29631", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26440", "S#29632", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26442", "S#29633", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26441", "S#29634", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26443", "S#29635", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26446", "S#29636", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26447", "S#29637", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26445", "S#29638", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26444", "S#29639", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26449", "S#29640", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26455", "S#29641", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26450", "S#29642", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26456", "S#29643", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26457", "S#29644", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26458", "S#29645", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26459", "S#29646", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26461", "S#29647", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26462", "S#29648", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26460", "S#29649", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26463", "S#29650", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26448", "S#29651", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26454", "S#29652", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26451", "S#29653", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26464", "S#29654", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26452", "S#29655", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26453", "S#29656", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26465", "S#29657", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26466", "S#29658", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26467", "S#29659", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26469", "S#29660", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26468", "S#29661", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26470", "S#29662", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26472", "S#29663", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26471", "S#29664", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26393", "S#29665", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26473", "S#29666", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26476", "S#29667", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26478", "S#29668", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26479", "S#29669", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26477", "S#29670", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26486", "S#29671", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26487", "S#29672", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26484", "S#29673", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26491", "S#29674", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26492", "S#29675", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26488", "S#29676", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26489", "S#29677", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26490", "S#29678", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26485", "S#29679", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26494", "S#29680", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26495", "S#29681", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26493", "S#29682", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26482", "S#29683", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26483", "S#29684", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26480", "S#29685", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26496", "S#29686", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26475", "S#29687", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26497", "S#29688", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26498", "S#29689", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26499", "S#27815", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26500", "S#29690", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26501", "S#29691", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26502", "S#29692", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26503", "S#29693", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26504", "S#29694", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26505", "S#29695", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26507", "S#29696", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26508", "S#29697", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26509", "S#29698", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26506", "S#29699", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26510", "S#29700", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26512", "S#29701", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26513", "S#29702", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26514", "S#29703", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26511", "S#29704", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26515", "S#29705", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26517", "S#29706", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26518", "S#29707", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26481", "S#29708", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26516", "S#29709", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26474", "S#29710", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26519", "S#29711", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26520", "S#29712", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26521", "S#29713", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26522", "S#29714", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26523", "S#29715", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26524", "S#29716", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0373", "f26525", "S#29717", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26527() {
        $g3168$ = SubLFiles.defparameter("S#29718", (SubLObject)NIL);
        $g3169$ = SubLFiles.defparameter("S#29719", (SubLObject)NIL);
        $g3170$ = SubLFiles.defparameter("S#29720", (SubLObject)NIL);
        $g3171$ = SubLFiles.defparameter("S#29721", (SubLObject)NIL);
        $g3172$ = SubLFiles.defparameter("S#29722", (SubLObject)NIL);
        $g3173$ = SubLFiles.deflexical("S#29723", (SubLObject)$ic94$);
        $g3174$ = SubLFiles.defparameter("S#29724", (SubLObject)T);
        $g3175$ = SubLFiles.defparameter("S#29725", (SubLObject)T);
        $g3176$ = SubLFiles.defparameter("S#29726", (SubLObject)ZERO_INTEGER);
        $g3177$ = SubLFiles.deflexical("S#29727", (SubLObject)$ic110$);
        $g3178$ = SubLFiles.defparameter("S#29728", (SubLObject)NIL);
        $g3179$ = SubLFiles.defparameter("S#29729", (SubLObject)NIL);
        $g3180$ = SubLFiles.defparameter("S#29730", (SubLObject)T);
        $g3181$ = SubLFiles.defparameter("S#29731", (SubLObject)NIL);
        $g3182$ = SubLFiles.defparameter("S#29732", (SubLObject)NIL);
        $g3183$ = SubLFiles.deflexical("S#29733", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic184$)) ? $g3183$.getGlobalValue() : NIL));
        $g3184$ = SubLFiles.defparameter("S#29734", (SubLObject)$ic188$);
        $g3185$ = SubLFiles.defparameter("S#29735", (SubLObject)T);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f26528() {
        module0034.f1895((SubLObject)$ic83$);
        module0034.f1895((SubLObject)$ic119$);
        module0003.f57((SubLObject)$ic184$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f26526();
    }
    
    public void initializeVariables() {
        f26527();
    }
    
    public void runTopLevelForms() {
        f26528();
    }
    
    static {
        me = (SubLFile)new module0373();
        $g3168$ = null;
        $g3169$ = null;
        $g3170$ = null;
        $g3171$ = null;
        $g3172$ = null;
        $g3173$ = null;
        $g3174$ = null;
        $g3175$ = null;
        $g3176$ = null;
        $g3177$ = null;
        $g3178$ = null;
        $g3179$ = null;
        $g3180$ = null;
        $g3181$ = null;
        $g3182$ = null;
        $g3183$ = null;
        $g3184$ = null;
        $g3185$ = null;
        $ic0$ = makeSymbol("S#26790", "CYC");
        $ic1$ = ConsesLow.list((SubLObject)makeSymbol("S#24101", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic2$ = makeUninternedSymbol("US#1D0E4E1");
        $ic3$ = makeSymbol("CLET");
        $ic4$ = makeSymbol("S#29718", "CYC");
        $ic5$ = makeSymbol("CONS");
        $ic6$ = ConsesLow.list((SubLObject)makeSymbol("S#29718", "CYC"));
        $ic7$ = makeSymbol("CUNWIND-PROTECT");
        $ic8$ = makeSymbol("PROGN");
        $ic9$ = makeSymbol("PWHEN");
        $ic10$ = ConsesLow.list((SubLObject)makeSymbol("S#29209", "CYC"));
        $ic11$ = makeSymbol("CSETQ");
        $ic12$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#28616", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("CURRENT-CONTROLLING-INFERENCE")), (SubLObject)NIL));
        $ic13$ = makeSymbol("S#29210", "CYC");
        $ic14$ = makeSymbol("-");
        $ic15$ = ConsesLow.list((SubLObject)makeSymbol("S#28616", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("CURRENT-CONTROLLING-INFERENCE")), (SubLObject)NIL);
        $ic16$ = ConsesLow.list((SubLObject)makeSymbol("S#24274", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic17$ = makeSymbol("S#29719", "CYC");
        $ic18$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#29718", "CYC"), (SubLObject)NIL));
        $ic19$ = ConsesLow.list((SubLObject)makeSymbol("S#3268", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic20$ = makeSymbol("S#1875", "CYC");
        $ic21$ = makeSymbol("S#26978", "CYC");
        $ic22$ = makeSymbol("S#26082", "CYC");
        $ic23$ = makeString("~a was not an :unexamined problem, so cannot determine its tactics");
        $ic24$ = makeString("~a was :unexamined but somehow got some tactics already.");
        $ic25$ = makeKeyword("TACTICAL");
        $ic26$ = makeKeyword("SKIP");
        $ic27$ = makeKeyword("POS");
        $ic28$ = makeKeyword("NEG");
        $ic29$ = makeKeyword("REMOVAL-CONJUNCTIVE");
        $ic30$ = makeKeyword("COMPLETE");
        $ic31$ = ConsesLow.list((SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#13100", "CYC"));
        $ic32$ = makeSymbol("S#27896", "CYC");
        $ic33$ = makeKeyword("NON-DISCARDED");
        $ic34$ = makeString("unexpected tactic ~S");
        $ic35$ = makeString("Tried to recursively execute ~a");
        $ic36$ = makeString("Tried to execute a tactic that was not possible: ~s");
        $ic37$ = makeString("unexpected tactic ~s");
        $ic38$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#13100", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic39$ = makeSymbol("S#29720", "CYC");
        $ic40$ = makeSymbol("S#29721", "CYC");
        $ic41$ = makeString("Got a literal-level tactic ~s that was neither a transformation nor a removal nor a rewrite");
        $ic42$ = makeString("Unexpected multiple clause tactic module ~a");
        $ic43$ = makeString("Unexpected multiple literal tactic module ~a");
        $ic44$ = makeString("Unexpected structural multiple literal tactic module ~a");
        $ic45$ = makeString("Unexpected meta-structural multiple literal tactic module ~a");
        $ic46$ = makeString("unexpected connected conjunction link ~s");
        $ic47$ = makeString("unexpected connected conjunction tactic ~s");
        $ic48$ = makeString("unexpected disjunctive link ~s");
        $ic49$ = makeString("~s was not a logical-link-with-unique-tactic-p");
        $ic50$ = makeKeyword("SPLIT");
        $ic51$ = makeKeyword("JOIN-ORDERED");
        $ic52$ = makeKeyword("UNION");
        $ic53$ = makeKeyword("JOIN");
        $ic54$ = makeString("Unexpected logical tactic module ~S");
        $ic55$ = makeString("Join tactics like ~S do not have a unique lookahead problem.");
        $ic56$ = makeSymbol("S#28927", "CYC");
        $ic57$ = makeString("~a is not a CONTENT-LINK-P");
        $ic58$ = makeSymbol("S#27349", "CYC");
        $ic59$ = makeString("Unexpected content tactic ~S");
        $ic60$ = makeString("Unexpected removal tactic ~S");
        $ic61$ = makeKeyword("REMOVAL");
        $ic62$ = makeKeyword("RESTRICTION");
        $ic63$ = makeSymbol("S#27916", "CYC");
        $ic64$ = makeSymbol("S#27340", "CYC");
        $ic65$ = makeKeyword("TRANSFORMATION");
        $ic66$ = makeSymbol("S#27342", "CYC");
        $ic67$ = makeKeyword("REWRITE");
        $ic68$ = makeSymbol("S#29205", "CYC");
        $ic69$ = makeSymbol("S#27373", "CYC");
        $ic70$ = makeKeyword("PREFERRED");
        $ic71$ = makeKeyword("GENERALIZED-REMOVAL");
        $ic72$ = makeKeyword("POSSIBLE");
        $ic73$ = makeKeyword("DISPREFERRED");
        $ic74$ = makeKeyword("GROSSLY-DISPREFERRED");
        $ic75$ = makeKeyword("DISALLOWED");
        $ic76$ = makeKeyword("DOOMED");
        $ic77$ = makeString("Unexpected preference-level ~s");
        $ic78$ = makeKeyword("CONNECTED-CONJUNCTION");
        $ic79$ = makeKeyword("STRUCTURAL");
        $ic80$ = makeKeyword("LOGICAL");
        $ic81$ = makeKeyword("IMPOSSIBLE");
        $ic82$ = makeKeyword("STRUCTURAL-CONJUNCTIVE");
        $ic83$ = makeSymbol("S#29408", "CYC");
        $ic84$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic85$ = makeKeyword("NONE");
        $ic86$ = makeKeyword("MINIMAL");
        $ic87$ = makeKeyword("ALL");
        $ic88$ = makeKeyword("ARG-TYPE");
        $ic89$ = makeString("Unexpected intermediate step validation level ~s");
        $ic90$ = ConsesLow.list((SubLObject)makeSymbol("S#29736", "CYC"), (SubLObject)makeSymbol("S#29737", "CYC"));
        $ic91$ = makeString("Didn't expect to bubble up a proof to the answer link ~s");
        $ic92$ = makeString("Unexpected link type for link ~a");
        $ic93$ = makeSymbol("S#26816", "CYC");
        $ic94$ = makeInteger(300);
        $ic95$ = makeKeyword("CIRCULAR");
        $ic96$ = makeKeyword("ILL-FORMED");
        $ic97$ = makeKeyword("NON-ABDUCIBLE-RULE");
        $ic98$ = makeKeyword("MODUS-TOLLENS-WITH-NON-WFF");
        $ic99$ = makeKeyword("PROVEN");
        $ic100$ = makeKeyword("REJECTED-SUBPROOF");
        $ic101$ = ConsesLow.list((SubLObject)makeSymbol("S#29738", "CYC"), (SubLObject)makeSymbol("S#29739", "CYC"));
        $ic102$ = makeSymbol("S#27677", "CYC");
        $ic103$ = makeString("expected a variable map to be null because the sub-bindings were null");
        $ic104$ = makeSymbol("S#14843", "CYC");
        $ic105$ = makeSymbol("S#18076", "CYC");
        $ic106$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#29740", "CYC"), (SubLObject)makeSymbol("S#29741", "CYC"));
        $ic107$ = makeString("Found a triplicate binding for ~s in ~s and expected only a duplicate");
        $ic108$ = makeString("Could not find two values in ~s with variable ~s");
        $ic109$ = makeSymbol("S#18087", "CYC");
        $ic110$ = makeInteger(100);
        $ic111$ = makeKeyword("MAX-PROOF-BUBBLING-DEPTH");
        $ic112$ = makeKeyword("ANSWER");
        $ic113$ = makeSymbol("S#18091", "CYC");
        $ic114$ = makeKeyword("RESIDUAL-TRANSFORMATION");
        $ic115$ = makeKeyword("DISJUNCTIVE-ASSUMPTION");
        $ic116$ = makeString("can't handle bubbling up proofs past disjunctive assumption links yet");
        $ic117$ = makeKeyword("EXCEPTED-ASSERTION");
        $ic118$ = makeKeyword("ABNORMAL");
        $ic119$ = makeSymbol("S#29464", "CYC");
        $ic120$ = makeSymbol("S#29253", "CYC");
        $ic121$ = makeString("generalized transformation proof of unexpected type: ~s");
        $ic122$ = makeString("Invalid sense ~s");
        $ic123$ = makeKeyword("UNEXAMINED");
        $ic124$ = makeString("Tried to make ~a pending but it still had possible tactics");
        $ic125$ = makeKeyword("INTUITIVE");
        $ic126$ = makeKeyword("UNDETERMINED");
        $ic127$ = makeString("Uninteresting problem status change for ~a: ~a -> ~a");
        $ic128$ = makeKeyword("SUBSTRATEGY-PROBLEM-STATUS-CHANGE");
        $ic129$ = makeString("possible problem with no tactics: ~a");
        $ic130$ = makeKeyword("NEW");
        $ic131$ = makeKeyword("UNEXAMINED-GOOD");
        $ic132$ = makeKeyword("UNEXAMINED-NO-GOOD");
        $ic133$ = makeKeyword("EXAMINED");
        $ic134$ = makeKeyword("EXAMINED-GOOD");
        $ic135$ = makeKeyword("EXAMINED-NO-GOOD");
        $ic136$ = makeKeyword("PENDING");
        $ic137$ = makeKeyword("POSSIBLE-GOOD");
        $ic138$ = makeKeyword("PENDING-GOOD");
        $ic139$ = makeKeyword("PENDING-NO-GOOD");
        $ic140$ = makeKeyword("FINISHED");
        $ic141$ = makeKeyword("FINISHED-GOOD");
        $ic142$ = makeKeyword("FINISHED-NO-GOOD");
        $ic143$ = makeString("Problem ~a attempted to change status from ~s to ~s, which is prohibited.");
        $ic144$ = makeString("new problem cannot become good yet");
        $ic145$ = makeString("unknown problem status ~a");
        $ic146$ = makeString("problem status ~a cannot become unexamined");
        $ic147$ = makeString("problem of status ~a cannot be examined");
        $ic148$ = makeKeyword("POSSIBLE-NO-GOOD");
        $ic149$ = makeString("problem of status ~a cannot be made possible");
        $ic150$ = makeString("problem of status ~a cannot be pending");
        $ic151$ = makeString("problem of status ~a cannot be finished");
        $ic152$ = makeString("unexpected link type ~S");
        $ic153$ = makeKeyword("PROBLEM-NO-GOOD");
        $ic154$ = makeKeyword("CONJUNCTIVE");
        $ic155$ = makeKeyword("CONTENT");
        $ic156$ = makeString("Unexpected status ~s");
        $ic157$ = makeKeyword("FINISHED-CLOSED-SINGLE-LITERAL");
        $ic158$ = makeKeyword("PENDING-COMPLETE");
        $ic159$ = makeKeyword("PENDING-PREFERRED");
        $ic160$ = makeKeyword("NO-GOOD-SPLIT-LINK");
        $ic161$ = makeKeyword("NO-GOOD-PREFERRED-JO-LINK");
        $ic162$ = makeKeyword("NO-GOOD-JOIN-LINK");
        $ic163$ = makeKeyword("NO-GOOD-UNION-LINKS");
        $ic164$ = makeKeyword("SIMPLIFICATION");
        $ic165$ = ConsesLow.list((SubLObject)makeKeyword("SPLIT"), (SubLObject)makeKeyword("JOIN-ORDERED"));
        $ic166$ = makeKeyword("ANYTHING");
        $ic167$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#29742", "CYC"), (SubLObject)makeSymbol("S#28165", "CYC"), (SubLObject)makeSymbol("S#29743", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic168$ = makeSymbol("S#29004", "CYC");
        $ic169$ = makeSymbol("PUNLESS");
        $ic170$ = makeSymbol("NULL");
        $ic171$ = makeSymbol("S#28968", "CYC");
        $ic172$ = makeSymbol("S#28973", "CYC");
        $ic173$ = makeSymbol("S#28967", "CYC");
        $ic174$ = makeSymbol("S#28966", "CYC");
        $ic175$ = makeSymbol("S#28965", "CYC");
        $ic176$ = makeSymbol("S#28971", "CYC");
        $ic177$ = makeSymbol("S#28972", "CYC");
        $ic178$ = makeSymbol("S#28964", "CYC");
        $ic179$ = makeString("Time to handle ~S propagation");
        $ic180$ = ConsesLow.list((SubLObject)makeSymbol("S#29744", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#29745", "CYC"));
        $ic181$ = makeString("Propagating bogus proof spec ~A down join link ~A.");
        $ic182$ = makeKeyword("EQUAL");
        $ic183$ = makeKeyword("CZER-EQUAL");
        $ic184$ = makeSymbol("S#29733", "CYC");
        $ic185$ = makeString("~&pruned ~a problems: (~a -> ~a), ~a tactics: (~a -> ~a)~%");
        $ic186$ = makeSymbol(">");
        $ic187$ = makeSymbol("S#27539", "CYC");
        $ic188$ = makeKeyword("UNINITIALIZED");
        $ic189$ = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic190$ = makeString("destroying in-progress tactic ~a");
        $ic191$ = ConsesLow.list((SubLObject)makeSymbol("S#29746", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#29747", "CYC"));
        $ic192$ = ConsesLow.list((SubLObject)makeSymbol("S#29748", "CYC"), (SubLObject)makeSymbol("S#29749", "CYC"));
        $ic193$ = makeSymbol("<");
        $ic194$ = makeSymbol("S#26815", "CYC");
        $ic195$ = makeSymbol("S#26813", "CYC");
        $ic196$ = makeSymbol("S#29750", "CYC");
        $ic197$ = makeSymbol("PROOF-SUID");
        $ic198$ = makeSymbol("S#27520", "CYC");
        $ic199$ = makeSymbol("S#27604", "CYC");
        $ic200$ = ConsesLow.list((SubLObject)makeUninternedSymbol("US#352B2C1"), (SubLObject)makeUninternedSymbol("US#13A2892"), (SubLObject)makeUninternedSymbol("US#1160044"));
        $ic201$ = makeKeyword("DO-HASH-TABLE");
        $ic202$ = makeSymbol("S#26782", "CYC");
        $ic203$ = makeSymbol("S#707", "CYC");
        $ic204$ = makeSymbol("S#29698", "CYC");
        $ic205$ = makeString("~a was not a problem-p or problem-link-p");
        $ic206$ = makeString("~%prunables: ~s~%");
        $ic207$ = makeString("Unexpected problem store object ~s");
        $ic208$ = ConsesLow.list((SubLObject)makeKeyword("UNEXAMINED"), (SubLObject)makeKeyword("EXAMINED"), (SubLObject)makeKeyword("FINISHED"));
        $ic209$ = makeSymbol("TACTICALLY-FINISHED-PROBLEM-P");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 2663 ms
	
	Decompiled with Procyon 0.5.32.
*/